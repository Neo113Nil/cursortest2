package org.bouncycastle.asn1;

import java.io.IOException;

/* loaded from: classes5.dex */
public abstract class m extends s {
    m() {
    }

    public static m getInstance(Object obj) {
        if (obj instanceof m) {
            return (m) obj;
        }
        if (obj == null) {
            return null;
        }
        try {
            return getInstance(s.fromByteArray((byte[]) obj));
        } catch (IOException e8) {
            throw new IllegalArgumentException("failed to construct NULL from byte[]: " + e8.getMessage());
        } catch (ClassCastException unused) {
            throw new IllegalArgumentException("unknown object in getInstance(): " + obj.getClass().getName());
        }
    }

    @Override // org.bouncycastle.asn1.s
    boolean asn1Equals(s sVar) {
        return sVar instanceof m;
    }

    @Override // org.bouncycastle.asn1.s
    abstract void encode(r rVar, boolean z7);

    @Override // org.bouncycastle.asn1.s, org.bouncycastle.asn1.n
    public int hashCode() {
        return -1;
    }

    public String toString() {
        return "NULL";
    }
}
