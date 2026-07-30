package org.bouncycastle.asn1;

import com.google.common.primitives.UnsignedBytes;
import java.math.BigInteger;

/* loaded from: classes5.dex */
public class l extends s {
    static final int SIGN_EXT_SIGNED = -1;
    static final int SIGN_EXT_UNSIGNED = 255;
    private final byte[] bytes;
    private final int start;

    public l(long j8) {
        this.bytes = BigInteger.valueOf(j8).toByteArray();
        this.start = 0;
    }

    public static l getInstance(Object obj) {
        if (obj == null || (obj instanceof l)) {
            return (l) obj;
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
        }
        try {
            return (l) s.fromByteArray((byte[]) obj);
        } catch (Exception e8) {
            throw new IllegalArgumentException("encoding error in getInstance: " + e8.toString());
        }
    }

    static int intValue(byte[] bArr, int i8, int i9) {
        int length = bArr.length;
        int max = Math.max(i8, length - 4);
        int i10 = i9 & bArr[max];
        while (true) {
            max++;
            if (max >= length) {
                return i10;
            }
            i10 = (i10 << 8) | (bArr[max] & 255);
        }
    }

    static boolean isMalformed(byte[] bArr) {
        int length = bArr.length;
        if (length != 0) {
            return (length == 1 || bArr[0] != (bArr[1] >> 7) || org.bouncycastle.util.j.isOverrideSet("org.bouncycastle.asn1.allow_unsafe_integer")) ? false : true;
        }
        return true;
    }

    static long longValue(byte[] bArr, int i8, int i9) {
        int length = bArr.length;
        int max = Math.max(i8, length - 8);
        long j8 = i9 & bArr[max];
        while (true) {
            max++;
            if (max >= length) {
                return j8;
            }
            j8 = (j8 << 8) | (bArr[max] & 255);
        }
    }

    static int signBytesToSkip(byte[] bArr) {
        int length = bArr.length - 1;
        int i8 = 0;
        while (i8 < length) {
            int i9 = i8 + 1;
            if (bArr[i8] != (bArr[i9] >> 7)) {
                break;
            }
            i8 = i9;
        }
        return i8;
    }

    @Override // org.bouncycastle.asn1.s
    boolean asn1Equals(s sVar) {
        if (sVar instanceof l) {
            return org.bouncycastle.util.a.areEqual(this.bytes, ((l) sVar).bytes);
        }
        return false;
    }

    @Override // org.bouncycastle.asn1.s
    void encode(r rVar, boolean z7) {
        rVar.writeEncoded(z7, 2, this.bytes);
    }

    @Override // org.bouncycastle.asn1.s
    int encodedLength() {
        return h2.calculateBodyLength(this.bytes.length) + 1 + this.bytes.length;
    }

    public BigInteger getPositiveValue() {
        return new BigInteger(1, this.bytes);
    }

    public BigInteger getValue() {
        return new BigInteger(this.bytes);
    }

    public boolean hasValue(int i8) {
        byte[] bArr = this.bytes;
        int length = bArr.length;
        int i9 = this.start;
        return length - i9 <= 4 && intValue(bArr, i9, -1) == i8;
    }

    @Override // org.bouncycastle.asn1.s, org.bouncycastle.asn1.n
    public int hashCode() {
        return org.bouncycastle.util.a.hashCode(this.bytes);
    }

    public int intPositiveValueExact() {
        byte[] bArr = this.bytes;
        int length = bArr.length;
        int i8 = this.start;
        int i9 = length - i8;
        if (i9 > 4 || (i9 == 4 && (bArr[i8] & UnsignedBytes.MAX_POWER_OF_TWO) != 0)) {
            throw new ArithmeticException("ASN.1 Integer out of positive int range");
        }
        return intValue(bArr, i8, 255);
    }

    public int intValueExact() {
        byte[] bArr = this.bytes;
        int length = bArr.length;
        int i8 = this.start;
        if (length - i8 <= 4) {
            return intValue(bArr, i8, -1);
        }
        throw new ArithmeticException("ASN.1 Integer out of int range");
    }

    @Override // org.bouncycastle.asn1.s
    boolean isConstructed() {
        return false;
    }

    public long longValueExact() {
        byte[] bArr = this.bytes;
        int length = bArr.length;
        int i8 = this.start;
        if (length - i8 <= 8) {
            return longValue(bArr, i8, -1);
        }
        throw new ArithmeticException("ASN.1 Integer out of long range");
    }

    public String toString() {
        return getValue().toString();
    }

    public l(BigInteger bigInteger) {
        this.bytes = bigInteger.toByteArray();
        this.start = 0;
    }

    public static l getInstance(b0 b0Var, boolean z7) {
        s object = b0Var.getObject();
        return (z7 || (object instanceof l)) ? getInstance(object) : new l(p.getInstance(object).getOctets());
    }

    public boolean hasValue(long j8) {
        byte[] bArr = this.bytes;
        int length = bArr.length;
        int i8 = this.start;
        return length - i8 <= 8 && longValue(bArr, i8, -1) == j8;
    }

    public l(byte[] bArr) {
        this(bArr, true);
    }

    public boolean hasValue(BigInteger bigInteger) {
        return bigInteger != null && intValue(this.bytes, this.start, -1) == bigInteger.intValue() && getValue().equals(bigInteger);
    }

    l(byte[] bArr, boolean z7) {
        if (isMalformed(bArr)) {
            throw new IllegalArgumentException("malformed integer");
        }
        this.bytes = z7 ? org.bouncycastle.util.a.clone(bArr) : bArr;
        this.start = signBytesToSkip(bArr);
    }
}
