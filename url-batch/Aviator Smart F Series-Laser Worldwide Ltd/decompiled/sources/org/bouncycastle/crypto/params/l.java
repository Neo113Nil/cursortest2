package org.bouncycastle.crypto.params;

/* loaded from: classes5.dex */
public class l implements org.bouncycastle.crypto.c {
    private byte[] id;
    private org.bouncycastle.crypto.c parameters;

    public l(org.bouncycastle.crypto.c cVar, byte[] bArr) {
        this.parameters = cVar;
        this.id = bArr;
    }

    public byte[] getID() {
        return this.id;
    }

    public org.bouncycastle.crypto.c getParameters() {
        return this.parameters;
    }
}
