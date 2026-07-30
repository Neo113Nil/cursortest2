package org.bouncycastle.pqc.crypto.lms;

/* loaded from: classes5.dex */
class t implements org.bouncycastle.util.c {
    private final r publicKey;
    private final s signature;

    public t(s sVar, r rVar) {
        this.signature = sVar;
        this.publicKey = rVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        t tVar = (t) obj;
        s sVar = this.signature;
        if (sVar == null ? tVar.signature != null : !sVar.equals(tVar.signature)) {
            return false;
        }
        r rVar = this.publicKey;
        r rVar2 = tVar.publicKey;
        return rVar != null ? rVar.equals(rVar2) : rVar2 == null;
    }

    @Override // org.bouncycastle.util.c
    public byte[] getEncoded() {
        return a.compose().bytes(this.signature.getEncoded()).bytes(this.publicKey.getEncoded()).build();
    }

    public r getPublicKey() {
        return this.publicKey;
    }

    public s getSignature() {
        return this.signature;
    }

    public int hashCode() {
        s sVar = this.signature;
        int hashCode = (sVar != null ? sVar.hashCode() : 0) * 31;
        r rVar = this.publicKey;
        return hashCode + (rVar != null ? rVar.hashCode() : 0);
    }
}
