package org.bouncycastle.asn1;

/* loaded from: classes5.dex */
public class t0 extends c {
    protected t0(byte b8, int i8) {
        super(b8, i8);
    }

    static t0 fromOctetString(byte[] bArr) {
        if (bArr.length < 1) {
            throw new IllegalArgumentException("truncated BIT STRING detected");
        }
        byte b8 = bArr[0];
        int length = bArr.length - 1;
        byte[] bArr2 = new byte[length];
        if (length != 0) {
            System.arraycopy(bArr, 1, bArr2, 0, bArr.length - 1);
        }
        return new t0(bArr2, b8);
    }

    public static t0 getInstance(Object obj) {
        if (obj == null || (obj instanceof t0)) {
            return (t0) obj;
        }
        if (obj instanceof p1) {
            p1 p1Var = (p1) obj;
            return new t0(p1Var.data, p1Var.padBits);
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
        }
        try {
            return (t0) s.fromByteArray((byte[]) obj);
        } catch (Exception e8) {
            throw new IllegalArgumentException("encoding error in getInstance: " + e8.toString());
        }
    }

    @Override // org.bouncycastle.asn1.c, org.bouncycastle.asn1.s
    void encode(r rVar, boolean z7) {
        int i8;
        byte[] bArr = this.data;
        int length = bArr.length;
        if (length != 0 && (i8 = this.padBits) != 0) {
            int i9 = length - 1;
            byte b8 = bArr[i9];
            if (b8 != ((byte) ((255 << i8) & b8))) {
                rVar.writeEncoded(z7, 3, (byte) i8, bArr, 0, i9, (byte) (b8 & (255 << i8)));
                return;
            }
        }
        rVar.writeEncoded(z7, 3, (byte) this.padBits, bArr);
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
    s toDERObject() {
        return this;
    }

    @Override // org.bouncycastle.asn1.c, org.bouncycastle.asn1.s
    s toDLObject() {
        return this;
    }

    public t0(int i8) {
        super(c.getBytes(i8), c.getPadBits(i8));
    }

    public static t0 getInstance(b0 b0Var, boolean z7) {
        s object = b0Var.getObject();
        return (z7 || (object instanceof t0)) ? getInstance(object) : fromOctetString(p.getInstance(object).getOctets());
    }

    public t0(f fVar) {
        super(fVar.toASN1Primitive().getEncoded("DER"), 0);
    }

    public t0(byte[] bArr) {
        this(bArr, 0);
    }

    public t0(byte[] bArr, int i8) {
        super(bArr, i8);
    }
}
