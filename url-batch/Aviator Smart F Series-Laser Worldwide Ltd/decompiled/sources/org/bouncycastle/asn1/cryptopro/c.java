package org.bouncycastle.asn1.cryptopro;

import org.bouncycastle.asn1.b0;
import org.bouncycastle.asn1.g;
import org.bouncycastle.asn1.g1;
import org.bouncycastle.asn1.n;
import org.bouncycastle.asn1.o;
import org.bouncycastle.asn1.s;
import org.bouncycastle.asn1.v;

/* loaded from: classes5.dex */
public class c extends n {
    private o digestParamSet;
    private o encryptionParamSet;
    private o publicKeyParamSet;

    public c(o oVar, o oVar2) {
        this.publicKeyParamSet = oVar;
        this.digestParamSet = oVar2;
        this.encryptionParamSet = null;
    }

    public static c getInstance(Object obj) {
        if (obj instanceof c) {
            return (c) obj;
        }
        if (obj != null) {
            return new c(v.getInstance(obj));
        }
        return null;
    }

    public o getDigestParamSet() {
        return this.digestParamSet;
    }

    public o getEncryptionParamSet() {
        return this.encryptionParamSet;
    }

    public o getPublicKeyParamSet() {
        return this.publicKeyParamSet;
    }

    @Override // org.bouncycastle.asn1.n, org.bouncycastle.asn1.f
    public s toASN1Primitive() {
        g gVar = new g(3);
        gVar.add(this.publicKeyParamSet);
        gVar.add(this.digestParamSet);
        o oVar = this.encryptionParamSet;
        if (oVar != null) {
            gVar.add(oVar);
        }
        return new g1(gVar);
    }

    public c(o oVar, o oVar2, o oVar3) {
        this.publicKeyParamSet = oVar;
        this.digestParamSet = oVar2;
        this.encryptionParamSet = oVar3;
    }

    public static c getInstance(b0 b0Var, boolean z7) {
        return getInstance(v.getInstance(b0Var, z7));
    }

    private c(v vVar) {
        this.publicKeyParamSet = (o) vVar.getObjectAt(0);
        this.digestParamSet = (o) vVar.getObjectAt(1);
        if (vVar.size() > 2) {
            this.encryptionParamSet = (o) vVar.getObjectAt(2);
        }
    }
}
