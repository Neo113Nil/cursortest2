package org.bouncycastle.asn1;

import org.bouncycastle.util.Strings;

/* loaded from: classes5.dex */
public class b1 extends s implements a0 {
    private final byte[] string;

    public b1(String str) {
        this(str, false);
    }

    public static b1 getInstance(Object obj) {
        if (obj == null || (obj instanceof b1)) {
            return (b1) obj;
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
        }
        try {
            return (b1) s.fromByteArray((byte[]) obj);
        } catch (Exception e8) {
            throw new IllegalArgumentException("encoding error in getInstance: " + e8.toString());
        }
    }

    public static boolean isNumericString(String str) {
        for (int length = str.length() - 1; length >= 0; length--) {
            char charAt = str.charAt(length);
            if (charAt > 127) {
                return false;
            }
            if (('0' > charAt || charAt > '9') && charAt != ' ') {
                return false;
            }
        }
        return true;
    }

    @Override // org.bouncycastle.asn1.s
    boolean asn1Equals(s sVar) {
        if (sVar instanceof b1) {
            return org.bouncycastle.util.a.areEqual(this.string, ((b1) sVar).string);
        }
        return false;
    }

    @Override // org.bouncycastle.asn1.s
    void encode(r rVar, boolean z7) {
        rVar.writeEncoded(z7, 18, this.string);
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

    public b1(String str, boolean z7) {
        if (z7 && !isNumericString(str)) {
            throw new IllegalArgumentException("string contains illegal characters");
        }
        this.string = Strings.toByteArray(str);
    }

    public static b1 getInstance(b0 b0Var, boolean z7) {
        s object = b0Var.getObject();
        return (z7 || (object instanceof b1)) ? getInstance(object) : new b1(p.getInstance(object).getOctets());
    }

    b1(byte[] bArr) {
        this.string = bArr;
    }
}
