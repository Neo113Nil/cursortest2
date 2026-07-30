package org.bouncycastle.pqc.jcajce.provider.mceliece;

import c7.e;
import java.io.IOException;
import java.security.PublicKey;

/* loaded from: classes5.dex */
public class BCMcElieceCCA2PublicKey implements org.bouncycastle.crypto.c, PublicKey {
    private static final long serialVersionUID = 1;
    private d7.c params;

    public BCMcElieceCCA2PublicKey(d7.c cVar) {
        this.params = cVar;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof BCMcElieceCCA2PublicKey)) {
            return false;
        }
        BCMcElieceCCA2PublicKey bCMcElieceCCA2PublicKey = (BCMcElieceCCA2PublicKey) obj;
        return this.params.getN() == bCMcElieceCCA2PublicKey.getN() && this.params.getT() == bCMcElieceCCA2PublicKey.getT() && this.params.getG().equals(bCMcElieceCCA2PublicKey.getG());
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "McEliece-CCA2";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return new v6.b(new v6.a(e.mcElieceCca2), new c7.b(this.params.getN(), this.params.getT(), this.params.getG(), c.getDigAlgId(this.params.getDigest()))).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    public org.bouncycastle.pqc.math.linearalgebra.c getG() {
        return this.params.getG();
    }

    public int getK() {
        return this.params.getK();
    }

    org.bouncycastle.crypto.params.a getKeyParams() {
        return this.params;
    }

    public int getN() {
        return this.params.getN();
    }

    public int getT() {
        return this.params.getT();
    }

    public int hashCode() {
        return ((this.params.getN() + (this.params.getT() * 37)) * 37) + this.params.getG().hashCode();
    }

    public String toString() {
        return (("McEliecePublicKey:\n length of the code         : " + this.params.getN() + "\n") + " error correction capability: " + this.params.getT() + "\n") + " generator matrix           : " + this.params.getG().toString();
    }
}
