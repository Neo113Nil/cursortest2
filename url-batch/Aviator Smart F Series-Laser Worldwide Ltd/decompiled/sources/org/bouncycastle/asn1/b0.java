package org.bouncycastle.asn1;

import java.io.IOException;

/* loaded from: classes5.dex */
public abstract class b0 extends s implements c0 {
    final boolean explicit;
    final f obj;
    final int tagNo;

    public b0(boolean z7, int i8, f fVar) {
        if (fVar == null) {
            throw new NullPointerException("'obj' cannot be null");
        }
        this.tagNo = i8;
        this.explicit = z7 || (fVar instanceof e);
        this.obj = fVar;
    }

    public static b0 getInstance(Object obj) {
        if (obj == null || (obj instanceof b0)) {
            return (b0) obj;
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException("unknown object in getInstance: " + obj.getClass().getName());
        }
        try {
            return getInstance(s.fromByteArray((byte[]) obj));
        } catch (IOException e8) {
            throw new IllegalArgumentException("failed to construct tagged object from byte[]: " + e8.getMessage());
        }
    }

    @Override // org.bouncycastle.asn1.s
    boolean asn1Equals(s sVar) {
        if (!(sVar instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) sVar;
        if (this.tagNo != b0Var.tagNo || this.explicit != b0Var.explicit) {
            return false;
        }
        s aSN1Primitive = this.obj.toASN1Primitive();
        s aSN1Primitive2 = b0Var.obj.toASN1Primitive();
        return aSN1Primitive == aSN1Primitive2 || aSN1Primitive.asn1Equals(aSN1Primitive2);
    }

    @Override // org.bouncycastle.asn1.s
    abstract void encode(r rVar, boolean z7);

    @Override // org.bouncycastle.asn1.c0, org.bouncycastle.asn1.b2
    public s getLoadedObject() {
        return toASN1Primitive();
    }

    public s getObject() {
        return this.obj.toASN1Primitive();
    }

    @Override // org.bouncycastle.asn1.c0
    public f getObjectParser(int i8, boolean z7) {
        if (i8 == 4) {
            return p.getInstance(this, z7).parser();
        }
        if (i8 == 16) {
            return v.getInstance(this, z7).parser();
        }
        if (i8 == 17) {
            return x.getInstance(this, z7).parser();
        }
        if (z7) {
            return getObject();
        }
        throw new ASN1Exception("implicit tagging not implemented for tag: " + i8);
    }

    @Override // org.bouncycastle.asn1.c0
    public int getTagNo() {
        return this.tagNo;
    }

    @Override // org.bouncycastle.asn1.s, org.bouncycastle.asn1.n
    public int hashCode() {
        return (this.tagNo ^ (this.explicit ? 15 : 240)) ^ this.obj.toASN1Primitive().hashCode();
    }

    public boolean isExplicit() {
        return this.explicit;
    }

    @Override // org.bouncycastle.asn1.s
    s toDERObject() {
        return new j1(this.explicit, this.tagNo, this.obj);
    }

    @Override // org.bouncycastle.asn1.s
    s toDLObject() {
        return new y1(this.explicit, this.tagNo, this.obj);
    }

    public String toString() {
        return "[" + this.tagNo + "]" + this.obj;
    }

    public static b0 getInstance(b0 b0Var, boolean z7) {
        if (z7) {
            return getInstance(b0Var.getObject());
        }
        throw new IllegalArgumentException("implicitly tagged tagged object");
    }
}
