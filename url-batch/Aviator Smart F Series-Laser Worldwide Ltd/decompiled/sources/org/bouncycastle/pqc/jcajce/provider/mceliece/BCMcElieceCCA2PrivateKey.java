package org.bouncycastle.pqc.jcajce.provider.mceliece;

import c7.e;
import java.io.IOException;
import java.security.PrivateKey;
import org.bouncycastle.pqc.math.linearalgebra.l;
import org.bouncycastle.pqc.math.linearalgebra.m;

/* loaded from: classes5.dex */
public class BCMcElieceCCA2PrivateKey implements PrivateKey {
    private static final long serialVersionUID = 1;
    private d7.b params;

    public BCMcElieceCCA2PrivateKey(d7.b bVar) {
        this.params = bVar;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof BCMcElieceCCA2PrivateKey)) {
            return false;
        }
        BCMcElieceCCA2PrivateKey bCMcElieceCCA2PrivateKey = (BCMcElieceCCA2PrivateKey) obj;
        return getN() == bCMcElieceCCA2PrivateKey.getN() && getK() == bCMcElieceCCA2PrivateKey.getK() && getField().equals(bCMcElieceCCA2PrivateKey.getField()) && getGoppaPoly().equals(bCMcElieceCCA2PrivateKey.getGoppaPoly()) && getP().equals(bCMcElieceCCA2PrivateKey.getP()) && getH().equals(bCMcElieceCCA2PrivateKey.getH());
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "McEliece-CCA2";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return new t6.b(new v6.a(e.mcElieceCca2), new c7.a(getN(), getK(), getField(), getGoppaPoly(), getP(), c.getDigAlgId(this.params.getDigest()))).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    public org.bouncycastle.pqc.math.linearalgebra.e getField() {
        return this.params.getField();
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    public m getGoppaPoly() {
        return this.params.getGoppaPoly();
    }

    public org.bouncycastle.pqc.math.linearalgebra.c getH() {
        return this.params.getH();
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

    public l getP() {
        return this.params.getP();
    }

    public m[] getQInv() {
        return this.params.getQInv();
    }

    public int getT() {
        return this.params.getGoppaPoly().getDegree();
    }

    public int hashCode() {
        return (((((((((this.params.getK() * 37) + this.params.getN()) * 37) + this.params.getField().hashCode()) * 37) + this.params.getGoppaPoly().hashCode()) * 37) + this.params.getP().hashCode()) * 37) + this.params.getH().hashCode();
    }
}
