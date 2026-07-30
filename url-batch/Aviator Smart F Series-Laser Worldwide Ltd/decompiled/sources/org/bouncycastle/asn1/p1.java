package org.bouncycastle.asn1;

/* loaded from: classes5.dex */
public class p1 extends c {
    protected p1(byte b8, int i8) {
        super(b8, i8);
    }

    static p1 fromOctetString(byte[] bArr) {
        if (bArr.length < 1) {
            throw new IllegalArgumentException("truncated BIT STRING detected");
        }
        byte b8 = bArr[0];
        int length = bArr.length - 1;
        byte[] bArr2 = new byte[length];
        if (length != 0) {
            System.arraycopy(bArr, 1, bArr2, 0, bArr.length - 1);
        }
        return new p1(bArr2, b8);
    }

    public static c getInstance(Object obj) {
        if (obj == null || (obj instanceof p1)) {
            return (p1) obj;
        }
        if (obj instanceof t0) {
            return (t0) obj;
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
        }
        try {
            return (c) s.fromByteArray((byte[]) obj);
        } catch (Exception e8) {
            throw new IllegalArgumentException("encoding error in getInstance: " + e8.toString());
        }
    }

    @Override // org.bouncycastle.asn1.c, org.bouncycastle.asn1.s
    void encode(r rVar, boolean z7) {
        rVar.writeEncoded(z7, 3, (byte) this.padBits, this.data);
    }

    @Override // org.bouncycastle.asn1.s
    int encodedLength() {
        return h2.calculateBodyLength(this.data.length + 1) + 1 + this.data.length + 1;
    }

    @Override // org.bouncycastle.asn1.s
    boolean isConstructed() {
        return false;
    }

    @Override // org.bouncycastle.asn1.c, org.bouncycastle.asn1.s
    s toDLObject() {
        return this;
    }

    public p1(int i8) {
        super(c.getBytes(i8), c.getPadBits(i8));
    }

    public static c getInstance(b0 b0Var, boolean z7) {
        s object = b0Var.getObject();
        return (z7 || (object instanceof p1)) ? getInstance(object) : fromOctetString(p.getInstance(object).getOctets());
    }

    public p1(f fVar) {
        super(fVar.toASN1Primitive().getEncoded("DER"), 0);
    }

    public p1(byte[] bArr) {
        this(bArr, 0);
    }

    public p1(byte[] bArr, int i8) {
        super(bArr, i8);
    }
}
