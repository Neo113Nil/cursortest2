package org.bouncycastle.asn1;

import org.bouncycastle.util.Strings;

/* loaded from: classes5.dex */
public class z0 extends s implements a0 {
    private final byte[] string;

    public z0(String str) {
        this(str, false);
    }

    public static z0 getInstance(Object obj) {
        if (obj == null || (obj instanceof z0)) {
            return (z0) obj;
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
        }
        try {
            return (z0) s.fromByteArray((byte[]) obj);
        } catch (Exception e8) {
            throw new IllegalArgumentException("encoding error in getInstance: " + e8.toString());
        }
    }

    public static boolean isIA5String(String str) {
        for (int length = str.length() - 1; length >= 0; length--) {
            if (str.charAt(length) > 127) {
                return false;
            }
        }
        return true;
    }

    @Override // org.bouncycastle.asn1.s
    boolean asn1Equals(s sVar) {
        if (sVar instanceof z0) {
            return org.bouncycastle.util.a.areEqual(this.string, ((z0) sVar).string);
        }
        return false;
    }

    @Override // org.bouncycastle.asn1.s
    void encode(r rVar, boolean z7) {
        rVar.writeEncoded(z7, 22, this.string);
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

    public z0(String str, boolean z7) {
        if (str == null) {
            throw new NullPointerException("'string' cannot be null");
        }
        if (z7 && !isIA5String(str)) {
            throw new IllegalArgumentException("'string' contains illegal characters");
        }
        this.string = Strings.toByteArray(str);
    }

    public static z0 getInstance(b0 b0Var, boolean z7) {
        s object = b0Var.getObject();
        return (z7 || (object instanceof z0)) ? getInstance(object) : new z0(p.getInstance(object).getOctets());
    }

    z0(byte[] bArr) {
        this.string = bArr;
    }
}
