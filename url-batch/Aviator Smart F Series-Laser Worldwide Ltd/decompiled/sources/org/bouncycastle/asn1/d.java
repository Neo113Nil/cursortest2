package org.bouncycastle.asn1;

import java.io.IOException;

/* loaded from: classes5.dex */
public class d extends s {
    private static final byte FALSE_VALUE = 0;
    private static final byte TRUE_VALUE = -1;
    private final byte value;
    public static final d FALSE = new d((byte) 0);
    public static final d TRUE = new d((byte) -1);

    private d(byte b8) {
        this.value = b8;
    }

    static d fromOctetString(byte[] bArr) {
        if (bArr.length != 1) {
            throw new IllegalArgumentException("BOOLEAN value should have 1 byte in it");
        }
        byte b8 = bArr[0];
        return b8 != -1 ? b8 != 0 ? new d(b8) : FALSE : TRUE;
    }

    public static d getInstance(int i8) {
        return i8 != 0 ? TRUE : FALSE;
    }

    @Override // org.bouncycastle.asn1.s
    boolean asn1Equals(s sVar) {
        return (sVar instanceof d) && isTrue() == ((d) sVar).isTrue();
    }

    @Override // org.bouncycastle.asn1.s
    void encode(r rVar, boolean z7) {
        rVar.writeEncoded(z7, 1, this.value);
    }

    @Override // org.bouncycastle.asn1.s
    int encodedLength() {
        return 3;
    }

    @Override // org.bouncycastle.asn1.s, org.bouncycastle.asn1.n
    public int hashCode() {
        return isTrue() ? 1 : 0;
    }

    @Override // org.bouncycastle.asn1.s
    boolean isConstructed() {
        return false;
    }

    public boolean isTrue() {
        return this.value != 0;
    }

    @Override // org.bouncycastle.asn1.s
    s toDERObject() {
        return isTrue() ? TRUE : FALSE;
    }

    public String toString() {
        return isTrue() ? "TRUE" : "FALSE";
    }

    public static d getInstance(Object obj) {
        if (obj == null || (obj instanceof d)) {
            return (d) obj;
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
        }
        try {
            return (d) s.fromByteArray((byte[]) obj);
        } catch (IOException e8) {
            throw new IllegalArgumentException("failed to construct boolean from byte[]: " + e8.getMessage());
        }
    }

    public static d getInstance(b0 b0Var, boolean z7) {
        s object = b0Var.getObject();
        return (z7 || (object instanceof d)) ? getInstance(object) : fromOctetString(p.getInstance(object).getOctets());
    }

    public static d getInstance(boolean z7) {
        return z7 ? TRUE : FALSE;
    }
}
