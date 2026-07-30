package org.bouncycastle.asn1;

import com.google.common.primitives.UnsignedBytes;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes5.dex */
public class o extends s {
    private static final long LONG_LIMIT = 72057594037927808L;
    private static final ConcurrentMap<a, o> pool = new ConcurrentHashMap();
    private byte[] body;
    private final String identifier;

    private static class a {
        private final byte[] enc;
        private final int key;

        a(byte[] bArr) {
            this.key = org.bouncycastle.util.a.hashCode(bArr);
            this.enc = bArr;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                return org.bouncycastle.util.a.areEqual(this.enc, ((a) obj).enc);
            }
            return false;
        }

        public int hashCode() {
            return this.key;
        }
    }

    public o(String str) {
        if (str == null) {
            throw new NullPointerException("'identifier' cannot be null");
        }
        if (isValidIdentifier(str)) {
            this.identifier = str;
            return;
        }
        throw new IllegalArgumentException("string " + str + " not an OID");
    }

    private void doOutput(ByteArrayOutputStream byteArrayOutputStream) {
        g2 g2Var = new g2(this.identifier);
        int parseInt = Integer.parseInt(g2Var.nextToken()) * 40;
        String nextToken = g2Var.nextToken();
        if (nextToken.length() <= 18) {
            writeField(byteArrayOutputStream, parseInt + Long.parseLong(nextToken));
        } else {
            writeField(byteArrayOutputStream, new BigInteger(nextToken).add(BigInteger.valueOf(parseInt)));
        }
        while (g2Var.hasMoreTokens()) {
            String nextToken2 = g2Var.nextToken();
            if (nextToken2.length() <= 18) {
                writeField(byteArrayOutputStream, Long.parseLong(nextToken2));
            } else {
                writeField(byteArrayOutputStream, new BigInteger(nextToken2));
            }
        }
    }

    static o fromOctetString(byte[] bArr) {
        o oVar = pool.get(new a(bArr));
        return oVar == null ? new o(bArr) : oVar;
    }

    private synchronized byte[] getBody() {
        try {
            if (this.body == null) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                doOutput(byteArrayOutputStream);
                this.body = byteArrayOutputStream.toByteArray();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.body;
    }

    public static o getInstance(Object obj) {
        if (obj == null || (obj instanceof o)) {
            return (o) obj;
        }
        if (obj instanceof f) {
            s aSN1Primitive = ((f) obj).toASN1Primitive();
            if (aSN1Primitive instanceof o) {
                return (o) aSN1Primitive;
            }
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
        }
        try {
            return (o) s.fromByteArray((byte[]) obj);
        } catch (IOException e8) {
            throw new IllegalArgumentException("failed to construct object identifier from byte[]: " + e8.getMessage());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x002d, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean isValidBranchID(String str, int i8) {
        int length = str.length();
        int i9 = 0;
        while (true) {
            int i10 = length - 1;
            if (i10 < i8) {
                return i9 != 0 && (i9 <= 1 || str.charAt(length) != '0');
            }
            char charAt = str.charAt(i10);
            if (charAt == '.') {
                if (i9 == 0 || (i9 > 1 && str.charAt(length) == '0')) {
                    break;
                }
                i9 = 0;
            } else {
                if ('0' > charAt || charAt > '9') {
                    break;
                }
                i9++;
            }
            length = i10;
        }
        return false;
    }

    private static boolean isValidIdentifier(String str) {
        char charAt;
        if (str.length() < 3 || str.charAt(1) != '.' || (charAt = str.charAt(0)) < '0' || charAt > '2') {
            return false;
        }
        return isValidBranchID(str, 2);
    }

    private void writeField(ByteArrayOutputStream byteArrayOutputStream, long j8) {
        byte[] bArr = new byte[9];
        int i8 = 8;
        bArr[8] = (byte) (((int) j8) & 127);
        while (j8 >= 128) {
            j8 >>= 7;
            i8--;
            bArr[i8] = (byte) ((((int) j8) & 127) | 128);
        }
        byteArrayOutputStream.write(bArr, i8, 9 - i8);
    }

    @Override // org.bouncycastle.asn1.s
    boolean asn1Equals(s sVar) {
        if (sVar == this) {
            return true;
        }
        if (sVar instanceof o) {
            return this.identifier.equals(((o) sVar).identifier);
        }
        return false;
    }

    public o branch(String str) {
        return new o(this, str);
    }

    @Override // org.bouncycastle.asn1.s
    void encode(r rVar, boolean z7) {
        rVar.writeEncoded(z7, 6, getBody());
    }

    @Override // org.bouncycastle.asn1.s
    int encodedLength() {
        int length = getBody().length;
        return h2.calculateBodyLength(length) + 1 + length;
    }

    public String getId() {
        return this.identifier;
    }

    @Override // org.bouncycastle.asn1.s, org.bouncycastle.asn1.n
    public int hashCode() {
        return this.identifier.hashCode();
    }

    public o intern() {
        a aVar = new a(getBody());
        ConcurrentMap<a, o> concurrentMap = pool;
        o oVar = concurrentMap.get(aVar);
        if (oVar != null) {
            return oVar;
        }
        o putIfAbsent = concurrentMap.putIfAbsent(aVar, this);
        return putIfAbsent == null ? this : putIfAbsent;
    }

    @Override // org.bouncycastle.asn1.s
    boolean isConstructed() {
        return false;
    }

    public boolean on(o oVar) {
        String id = getId();
        String id2 = oVar.getId();
        return id.length() > id2.length() && id.charAt(id2.length()) == '.' && id.startsWith(id2);
    }

    public String toString() {
        return getId();
    }

    o(o oVar, String str) {
        if (!isValidBranchID(str, 0)) {
            throw new IllegalArgumentException("string " + str + " not a valid OID branch");
        }
        this.identifier = oVar.getId() + "." + str;
    }

    public static o getInstance(b0 b0Var, boolean z7) {
        s object = b0Var.getObject();
        return (z7 || (object instanceof o)) ? getInstance(object) : fromOctetString(p.getInstance(object).getOctets());
    }

    private void writeField(ByteArrayOutputStream byteArrayOutputStream, BigInteger bigInteger) {
        int bitLength = (bigInteger.bitLength() + 6) / 7;
        if (bitLength == 0) {
            byteArrayOutputStream.write(0);
            return;
        }
        byte[] bArr = new byte[bitLength];
        int i8 = bitLength - 1;
        for (int i9 = i8; i9 >= 0; i9--) {
            bArr[i9] = (byte) ((bigInteger.intValue() & 127) | 128);
            bigInteger = bigInteger.shiftRight(7);
        }
        bArr[i8] = (byte) (bArr[i8] & Byte.MAX_VALUE);
        byteArrayOutputStream.write(bArr, 0, bitLength);
    }

    o(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        boolean z7 = true;
        BigInteger bigInteger = null;
        long j8 = 0;
        for (int i8 = 0; i8 != bArr.length; i8++) {
            byte b8 = bArr[i8];
            if (j8 <= LONG_LIMIT) {
                long j9 = j8 + (b8 & Byte.MAX_VALUE);
                if ((b8 & UnsignedBytes.MAX_POWER_OF_TWO) == 0) {
                    if (z7) {
                        if (j9 < 40) {
                            stringBuffer.append('0');
                        } else if (j9 < 80) {
                            stringBuffer.append('1');
                            j9 -= 40;
                        } else {
                            stringBuffer.append('2');
                            j9 -= 80;
                        }
                        z7 = false;
                    }
                    stringBuffer.append('.');
                    stringBuffer.append(j9);
                    j8 = 0;
                } else {
                    j8 = j9 << 7;
                }
            } else {
                BigInteger or = (bigInteger == null ? BigInteger.valueOf(j8) : bigInteger).or(BigInteger.valueOf(b8 & Byte.MAX_VALUE));
                if ((b8 & UnsignedBytes.MAX_POWER_OF_TWO) == 0) {
                    if (z7) {
                        stringBuffer.append('2');
                        or = or.subtract(BigInteger.valueOf(80L));
                        z7 = false;
                    }
                    stringBuffer.append('.');
                    stringBuffer.append(or);
                    bigInteger = null;
                    j8 = 0;
                } else {
                    bigInteger = or.shiftLeft(7);
                }
            }
        }
        this.identifier = stringBuffer.toString();
        this.body = org.bouncycastle.util.a.clone(bArr);
    }
}
