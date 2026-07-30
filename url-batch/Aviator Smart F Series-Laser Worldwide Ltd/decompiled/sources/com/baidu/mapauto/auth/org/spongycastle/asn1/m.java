package com.baidu.mapauto.auth.org.spongycastle.asn1;

import com.google.common.primitives.UnsignedBytes;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class m extends r {

    /* renamed from: c, reason: collision with root package name */
    public static final ConcurrentHashMap f7802c = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final String f7803a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f7804b;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f7805a;

        /* renamed from: b, reason: collision with root package name */
        public final byte[] f7806b;

        public a(byte[] bArr) {
            this.f7805a = com.baidu.mapauto.auth.org.spongycastle.util.a.b(bArr);
            this.f7806b = bArr;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                return com.baidu.mapauto.auth.org.spongycastle.util.a.a(this.f7806b, ((a) obj).f7806b);
            }
            return false;
        }

        public final int hashCode() {
            return this.f7805a;
        }
    }

    public m(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        boolean z7 = true;
        BigInteger bigInteger = null;
        long j8 = 0;
        for (int i8 = 0; i8 != bArr.length; i8++) {
            byte b8 = bArr[i8];
            if (j8 <= 72057594037927808L) {
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
        this.f7803a = stringBuffer.toString();
        this.f7804b = com.baidu.mapauto.auth.org.spongycastle.util.a.a(bArr);
    }

    public static void a(ByteArrayOutputStream byteArrayOutputStream, BigInteger bigInteger) {
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

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.r
    public final int e() {
        int length = i().length;
        return u1.a(length) + 1 + length;
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.r
    public final boolean f() {
        return false;
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.r, com.baidu.mapauto.auth.org.spongycastle.asn1.l
    public final int hashCode() {
        return this.f7803a.hashCode();
    }

    public final synchronized byte[] i() {
        String substring;
        int i8;
        String substring2;
        int i9;
        int i10;
        String str;
        try {
            if (this.f7804b == null) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                String str2 = this.f7803a;
                int i11 = 46;
                int indexOf = str2.indexOf(46, 0);
                if (indexOf == -1) {
                    substring = str2.substring(0);
                    i8 = -1;
                } else {
                    substring = str2.substring(0, indexOf);
                    i8 = indexOf + 1;
                }
                int parseInt = Integer.parseInt(substring) * 40;
                if (i8 == -1) {
                    i9 = i8;
                    substring2 = null;
                } else {
                    int indexOf2 = str2.indexOf(46, i8);
                    if (indexOf2 == -1) {
                        substring2 = str2.substring(i8);
                        i9 = -1;
                    } else {
                        substring2 = str2.substring(i8, indexOf2);
                        i9 = indexOf2 + 1;
                    }
                }
                if (substring2.length() <= 18) {
                    i10 = i9;
                    long parseLong = Long.parseLong(substring2) + parseInt;
                    byte[] bArr = new byte[9];
                    bArr[8] = (byte) (((int) parseLong) & 127);
                    int i12 = 8;
                    while (parseLong >= 128) {
                        parseLong >>= 7;
                        i12--;
                        bArr[i12] = (byte) ((((int) parseLong) & 127) | 128);
                    }
                    byteArrayOutputStream.write(bArr, i12, 9 - i12);
                } else {
                    i10 = i9;
                    a(byteArrayOutputStream, new BigInteger(substring2).add(BigInteger.valueOf(parseInt)));
                }
                int i13 = i10;
                while (i13 != -1) {
                    if (i13 == -1) {
                        str = null;
                    } else {
                        int indexOf3 = str2.indexOf(i11, i13);
                        if (indexOf3 == -1) {
                            str = str2.substring(i13);
                            i13 = -1;
                        } else {
                            String substring3 = str2.substring(i13, indexOf3);
                            i13 = indexOf3 + 1;
                            str = substring3;
                        }
                    }
                    if (str.length() <= 18) {
                        long parseLong2 = Long.parseLong(str);
                        byte[] bArr2 = new byte[9];
                        bArr2[8] = (byte) (((int) parseLong2) & 127);
                        int i14 = 8;
                        while (parseLong2 >= 128) {
                            parseLong2 >>= 7;
                            i14--;
                            bArr2[i14] = (byte) ((((int) parseLong2) & 127) | 128);
                        }
                        byteArrayOutputStream.write(bArr2, i14, 9 - i14);
                    } else {
                        a(byteArrayOutputStream, new BigInteger(str));
                    }
                    i11 = 46;
                }
                this.f7804b = byteArrayOutputStream.toByteArray();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f7804b;
    }

    public final String toString() {
        return this.f7803a;
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.r
    public final boolean a(r rVar) {
        if (rVar == this) {
            return true;
        }
        if (rVar instanceof m) {
            return this.f7803a.equals(((m) rVar).f7803a);
        }
        return false;
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.r
    public final void a(p pVar) {
        byte[] i8 = i();
        pVar.a(6);
        pVar.b(i8.length);
        pVar.f7818a.write(i8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static m a(d dVar) {
        if (dVar == 0 || (dVar instanceof m)) {
            return (m) dVar;
        }
        if (dVar.c() instanceof m) {
            return (m) dVar.c();
        }
        if (dVar instanceof byte[]) {
            try {
                return (m) r.a((byte[]) dVar);
            } catch (IOException e8) {
                StringBuilder a8 = com.baidu.mapauto.auth.b.a("failed to construct object identifier from byte[]: ");
                a8.append(e8.getMessage());
                throw new IllegalArgumentException(a8.toString());
            }
        }
        StringBuilder a9 = com.baidu.mapauto.auth.b.a("illegal object in getInstance: ");
        a9.append(dVar.getClass().getName());
        throw new IllegalArgumentException(a9.toString());
    }
}
