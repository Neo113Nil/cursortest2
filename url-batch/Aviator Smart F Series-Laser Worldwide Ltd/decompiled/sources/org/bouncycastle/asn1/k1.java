package org.bouncycastle.asn1;

import org.bouncycastle.util.Strings;

/* loaded from: classes5.dex */
public class k1 extends s implements a0 {
    private final byte[] string;

    public k1(String str) {
        this.string = Strings.toUTF8ByteArray(str);
    }

    public static k1 getInstance(Object obj) {
        if (obj == null || (obj instanceof k1)) {
            return (k1) obj;
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
        }
        try {
            return (k1) s.fromByteArray((byte[]) obj);
        } catch (Exception e8) {
            throw new IllegalArgumentException("encoding error in getInstance: " + e8.toString());
        }
    }

    @Override // org.bouncycastle.asn1.s
    boolean asn1Equals(s sVar) {
        if (sVar instanceof k1) {
            return org.bouncycastle.util.a.areEqual(this.string, ((k1) sVar).string);
        }
        return false;
    }

    @Override // org.bouncycastle.asn1.s
    void encode(r rVar, boolean z7) {
        rVar.writeEncoded(z7, 12, this.string);
    }

    @Override // org.bouncycastle.asn1.s
    int encodedLength() {
        return h2.calculateBodyLength(this.string.length) + 1 + this.string.length;
    }

    @Override // org.bouncycastle.asn1.a0
    public String getString() {
        return Strings.fromUTF8ByteArray(this.string);
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

    k1(byte[] bArr) {
        this.string = bArr;
    }

    public static k1 getInstance(b0 b0Var, boolean z7) {
        s object = b0Var.getObject();
        return (z7 || (object instanceof k1)) ? getInstance(object) : new k1(p.getInstance(object).getOctets());
    }
}
