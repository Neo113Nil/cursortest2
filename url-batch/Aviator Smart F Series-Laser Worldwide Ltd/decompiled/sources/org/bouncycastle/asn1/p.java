package org.bouncycastle.asn1;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.util.Strings;

/* loaded from: classes5.dex */
public abstract class p extends s implements q {
    byte[] string;

    public p(byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("'string' cannot be null");
        }
        this.string = bArr;
    }

    public static p getInstance(Object obj) {
        if (obj == null || (obj instanceof p)) {
            return (p) obj;
        }
        if (obj instanceof byte[]) {
            try {
                return getInstance(s.fromByteArray((byte[]) obj));
            } catch (IOException e8) {
                throw new IllegalArgumentException("failed to construct OCTET STRING from byte[]: " + e8.getMessage());
            }
        }
        if (obj instanceof f) {
            s aSN1Primitive = ((f) obj).toASN1Primitive();
            if (aSN1Primitive instanceof p) {
                return (p) aSN1Primitive;
            }
        }
        throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
    }

    @Override // org.bouncycastle.asn1.s
    boolean asn1Equals(s sVar) {
        if (sVar instanceof p) {
            return org.bouncycastle.util.a.areEqual(this.string, ((p) sVar).string);
        }
        return false;
    }

    @Override // org.bouncycastle.asn1.s
    abstract void encode(r rVar, boolean z7);

    @Override // org.bouncycastle.asn1.q, org.bouncycastle.asn1.b2
    public s getLoadedObject() {
        return toASN1Primitive();
    }

    @Override // org.bouncycastle.asn1.q
    public InputStream getOctetStream() {
        return new ByteArrayInputStream(this.string);
    }

    public byte[] getOctets() {
        return this.string;
    }

    @Override // org.bouncycastle.asn1.s, org.bouncycastle.asn1.n
    public int hashCode() {
        return org.bouncycastle.util.a.hashCode(getOctets());
    }

    public q parser() {
        return this;
    }

    @Override // org.bouncycastle.asn1.s
    s toDERObject() {
        return new c1(this.string);
    }

    @Override // org.bouncycastle.asn1.s
    s toDLObject() {
        return new c1(this.string);
    }

    public String toString() {
        return "#" + Strings.fromByteArray(org.bouncycastle.util.encoders.d.encode(this.string));
    }

    public static p getInstance(b0 b0Var, boolean z7) {
        if (z7) {
            if (b0Var.isExplicit()) {
                return getInstance(b0Var.getObject());
            }
            throw new IllegalArgumentException("object implicit - explicit expected.");
        }
        s object = b0Var.getObject();
        if (b0Var.isExplicit()) {
            p pVar = getInstance(object);
            return b0Var instanceof p0 ? new h0(new p[]{pVar}) : (p) new h0(new p[]{pVar}).toDLObject();
        }
        if (object instanceof p) {
            p pVar2 = (p) object;
            return b0Var instanceof p0 ? pVar2 : (p) pVar2.toDLObject();
        }
        if (object instanceof v) {
            v vVar = (v) object;
            return b0Var instanceof p0 ? h0.fromSequence(vVar) : (p) h0.fromSequence(vVar).toDLObject();
        }
        throw new IllegalArgumentException("unknown object in getInstance: " + b0Var.getClass().getName());
    }
}
