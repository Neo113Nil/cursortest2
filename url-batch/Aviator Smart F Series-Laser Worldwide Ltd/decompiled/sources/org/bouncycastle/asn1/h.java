package org.bouncycastle.asn1;

import com.google.common.primitives.UnsignedBytes;
import java.math.BigInteger;

/* loaded from: classes5.dex */
public class h extends s {
    private static h[] cache = new h[12];
    private final byte[] bytes;
    private final int start;

    public h(int i8) {
        if (i8 < 0) {
            throw new IllegalArgumentException("enumerated must be non-negative");
        }
        this.bytes = BigInteger.valueOf(i8).toByteArray();
        this.start = 0;
    }

    static h fromOctetString(byte[] bArr) {
        if (bArr.length > 1) {
            return new h(bArr);
        }
        if (bArr.length == 0) {
            throw new IllegalArgumentException("ENUMERATED has zero length");
        }
        int i8 = bArr[0] & 255;
        h[] hVarArr = cache;
        if (i8 >= hVarArr.length) {
            return new h(bArr);
        }
        h hVar = hVarArr[i8];
        if (hVar != null) {
            return hVar;
        }
        h hVar2 = new h(bArr);
        hVarArr[i8] = hVar2;
        return hVar2;
    }

    public static h getInstance(Object obj) {
        if (obj == null || (obj instanceof h)) {
            return (h) obj;
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
        }
        try {
            return (h) s.fromByteArray((byte[]) obj);
        } catch (Exception e8) {
            throw new IllegalArgumentException("encoding error in getInstance: " + e8.toString());
        }
    }

    @Override // org.bouncycastle.asn1.s
    boolean asn1Equals(s sVar) {
        if (sVar instanceof h) {
            return org.bouncycastle.util.a.areEqual(this.bytes, ((h) sVar).bytes);
        }
        return false;
    }

    @Override // org.bouncycastle.asn1.s
    void encode(r rVar, boolean z7) {
        rVar.writeEncoded(z7, 10, this.bytes);
    }

    @Override // org.bouncycastle.asn1.s
    int encodedLength() {
        return h2.calculateBodyLength(this.bytes.length) + 1 + this.bytes.length;
    }

    public BigInteger getValue() {
        return new BigInteger(this.bytes);
    }

    public boolean hasValue(int i8) {
        byte[] bArr = this.bytes;
        int length = bArr.length;
        int i9 = this.start;
        return length - i9 <= 4 && l.intValue(bArr, i9, -1) == i8;
    }

    @Override // org.bouncycastle.asn1.s, org.bouncycastle.asn1.n
    public int hashCode() {
        return org.bouncycastle.util.a.hashCode(this.bytes);
    }

    public int intValueExact() {
        byte[] bArr = this.bytes;
        int length = bArr.length;
        int i8 = this.start;
        if (length - i8 <= 4) {
            return l.intValue(bArr, i8, -1);
        }
        throw new ArithmeticException("ASN.1 Enumerated out of int range");
    }

    @Override // org.bouncycastle.asn1.s
    boolean isConstructed() {
        return false;
    }

    public h(BigInteger bigInteger) {
        if (bigInteger.signum() < 0) {
            throw new IllegalArgumentException("enumerated must be non-negative");
        }
        this.bytes = bigInteger.toByteArray();
        this.start = 0;
    }

    public static h getInstance(b0 b0Var, boolean z7) {
        s object = b0Var.getObject();
        return (z7 || (object instanceof h)) ? getInstance(object) : fromOctetString(p.getInstance(object).getOctets());
    }

    public boolean hasValue(BigInteger bigInteger) {
        return bigInteger != null && l.intValue(this.bytes, this.start, -1) == bigInteger.intValue() && getValue().equals(bigInteger);
    }

    public h(byte[] bArr) {
        if (l.isMalformed(bArr)) {
            throw new IllegalArgumentException("malformed enumerated");
        }
        if ((bArr[0] & UnsignedBytes.MAX_POWER_OF_TWO) != 0) {
            throw new IllegalArgumentException("enumerated must be non-negative");
        }
        this.bytes = org.bouncycastle.util.a.clone(bArr);
        this.start = l.signBytesToSkip(bArr);
    }
}
