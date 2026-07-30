package org.bouncycastle.pqc.jcajce.provider.mceliece;

import c7.e;
import d7.f;
import java.io.IOException;
import java.security.PrivateKey;
import org.bouncycastle.pqc.math.linearalgebra.l;
import org.bouncycastle.pqc.math.linearalgebra.m;

/* loaded from: classes5.dex */
public class BCMcEliecePrivateKey implements org.bouncycastle.crypto.c, PrivateKey {
    private static final long serialVersionUID = 1;
    private f params;

    public BCMcEliecePrivateKey(f fVar) {
        this.params = fVar;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof BCMcEliecePrivateKey)) {
            return false;
        }
        BCMcEliecePrivateKey bCMcEliecePrivateKey = (BCMcEliecePrivateKey) obj;
        return getN() == bCMcEliecePrivateKey.getN() && getK() == bCMcEliecePrivateKey.getK() && getField().equals(bCMcEliecePrivateKey.getField()) && getGoppaPoly().equals(bCMcEliecePrivateKey.getGoppaPoly()) && getSInv().equals(bCMcEliecePrivateKey.getSInv()) && getP1().equals(bCMcEliecePrivateKey.getP1()) && getP2().equals(bCMcEliecePrivateKey.getP2());
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "McEliece";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return new t6.b(new v6.a(e.mcEliece), new c7.c(this.params.getN(), this.params.getK(), this.params.getField(), this.params.getGoppaPoly(), this.params.getP1(), this.params.getP2(), this.params.getSInv())).getEncoded();
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

    public l getP1() {
        return this.params.getP1();
    }

    public l getP2() {
        return this.params.getP2();
    }

    public m[] getQInv() {
        return this.params.getQInv();
    }

    public org.bouncycastle.pqc.math.linearalgebra.c getSInv() {
        return this.params.getSInv();
    }

    public int hashCode() {
        return (((((((((((this.params.getK() * 37) + this.params.getN()) * 37) + this.params.getField().hashCode()) * 37) + this.params.getGoppaPoly().hashCode()) * 37) + this.params.getP1().hashCode()) * 37) + this.params.getP2().hashCode()) * 37) + this.params.getSInv().hashCode();
    }
}
