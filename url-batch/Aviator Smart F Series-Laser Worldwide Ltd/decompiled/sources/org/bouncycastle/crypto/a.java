package org.bouncycastle.crypto;

/* loaded from: classes5.dex */
public class a {
    private org.bouncycastle.crypto.params.a privateParam;
    private org.bouncycastle.crypto.params.a publicParam;

    public a(c cVar, c cVar2) {
        this.publicParam = (org.bouncycastle.crypto.params.a) cVar;
        this.privateParam = (org.bouncycastle.crypto.params.a) cVar2;
    }

    public org.bouncycastle.crypto.params.a getPrivate() {
        return this.privateParam;
    }

    public org.bouncycastle.crypto.params.a getPublic() {
        return this.publicParam;
    }

    public a(org.bouncycastle.crypto.params.a aVar, org.bouncycastle.crypto.params.a aVar2) {
        this.publicParam = aVar;
        this.privateParam = aVar2;
    }
}
