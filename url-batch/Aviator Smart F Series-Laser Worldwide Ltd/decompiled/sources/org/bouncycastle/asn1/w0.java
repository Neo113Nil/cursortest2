package org.bouncycastle.asn1;

import org.bouncycastle.util.Strings;

/* loaded from: classes5.dex */
public class w0 extends s implements a0 {
    private final byte[] string;

    public w0(String str) {
        this.string = Strings.toByteArray(str);
    }

    public static w0 getInstance(Object obj) {
        if (obj == null || (obj instanceof w0)) {
            return (w0) obj;
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
        }
        try {
            return (w0) s.fromByteArray((byte[]) obj);
        } catch (Exception e8) {
            throw new IllegalArgumentException("encoding error in getInstance: " + e8.toString());
        }
    }

    @Override // org.bouncycastle.asn1.s
    boolean asn1Equals(s sVar) {
        if (sVar instanceof w0) {
            return org.bouncycastle.util.a.areEqual(this.string, ((w0) sVar).string);
        }
        return false;
    }

    @Override // org.bouncycastle.asn1.s
    void encode(r rVar, boolean z7) {
        rVar.writeEncoded(z7, 27, this.string);
    }

    @Override // org.bouncycastle.asn1.s
    int encodedLength() {
        return h2.calculateBodyLength(this.string.length) + 1 + this.string.length;
    }

    public byte[] getOctets() {
        return org.bouncycastle.util.a.clone(this.string);
    }

    @Override // org.bouncycastle.asn1.a0
    public String getString() {
        return Strings.fromByteArray(this.string);
    }

    @Override // org.bouncycastle.asn1.s, org.bouncycastle.asn1.n
    public int hashCode() {
        return org.bouncycastle.util.a.hashCode(this.string);
    }

    @Override // org.bouncycastle.asn1.s
    boolean isConstructed() {
        return false;
    }

    public String toString() {
        return getString();
    }

    w0(byte[] bArr) {
        this.string = bArr;
    }

    public static w0 getInstance(b0 b0Var, boolean z7) {
        s object = b0Var.getObject();
        return (z7 || (object instanceof w0)) ? getInstance(object) : new w0(p.getInstance(object).getOctets());
    }
}
