package org.bouncycastle.asn1;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;

/* loaded from: classes5.dex */
public abstract class n implements f, org.bouncycastle.util.c {
    protected static boolean hasEncodedTagValue(Object obj, int i8) {
        return (obj instanceof byte[]) && ((byte[]) obj)[0] == i8;
    }

    public void encodeTo(OutputStream outputStream) {
        r.create(outputStream).writeObject(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            return toASN1Primitive().equals(((f) obj).toASN1Primitive());
        }
        return false;
    }

    @Override // org.bouncycastle.util.c
    public byte[] getEncoded() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        encodeTo(byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public int hashCode() {
        return toASN1Primitive().hashCode();
    }

    @Override // org.bouncycastle.asn1.f
    public abstract s toASN1Primitive();

    public void encodeTo(OutputStream outputStream, String str) {
        r.create(outputStream, str).writeObject(this);
    }

    public byte[] getEncoded(String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        encodeTo(byteArrayOutputStream, str);
        return byteArrayOutputStream.toByteArray();
    }
}
