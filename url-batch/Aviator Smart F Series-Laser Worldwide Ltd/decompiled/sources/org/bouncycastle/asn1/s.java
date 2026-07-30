package org.bouncycastle.asn1;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes5.dex */
public abstract class s extends n {
    s() {
    }

    public static s fromByteArray(byte[] bArr) {
        k kVar = new k(bArr);
        try {
            s readObject = kVar.readObject();
            if (kVar.available() == 0) {
                return readObject;
            }
            throw new IOException("Extra data detected in stream");
        } catch (ClassCastException unused) {
            throw new IOException("cannot recognise object in stream");
        }
    }

    abstract boolean asn1Equals(s sVar);

    abstract void encode(r rVar, boolean z7);

    @Override // org.bouncycastle.asn1.n
    public void encodeTo(OutputStream outputStream) {
        r.create(outputStream).writeObject(this);
    }

    abstract int encodedLength();

    @Override // org.bouncycastle.asn1.n
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && asn1Equals(((f) obj).toASN1Primitive());
    }

    @Override // org.bouncycastle.asn1.n
    public abstract int hashCode();

    abstract boolean isConstructed();

    @Override // org.bouncycastle.asn1.n, org.bouncycastle.asn1.f
    public final s toASN1Primitive() {
        return this;
    }

    s toDERObject() {
        return this;
    }

    s toDLObject() {
        return this;
    }

    @Override // org.bouncycastle.asn1.n
    public void encodeTo(OutputStream outputStream, String str) {
        r.create(outputStream, str).writeObject(this);
    }

    public final boolean equals(f fVar) {
        return this == fVar || (fVar != null && asn1Equals(fVar.toASN1Primitive()));
    }

    public final boolean equals(s sVar) {
        return this == sVar || asn1Equals(sVar);
    }
}
