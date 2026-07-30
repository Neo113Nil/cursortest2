package org.bouncycastle.pqc.jcajce.provider.rainbow;

import c7.e;
import c7.g;
import e7.c;
import java.security.PublicKey;
import org.bouncycastle.asn1.a1;
import org.bouncycastle.pqc.crypto.rainbow.util.b;
import org.bouncycastle.util.a;

/* loaded from: classes5.dex */
public class BCRainbowPublicKey implements PublicKey {
    private static final long serialVersionUID = 1;
    private short[][] coeffquadratic;
    private short[] coeffscalar;
    private short[][] coeffsingular;
    private int docLength;
    private c rainbowParams;

    public BCRainbowPublicKey(int i8, short[][] sArr, short[][] sArr2, short[] sArr3) {
        this.docLength = i8;
        this.coeffquadratic = sArr;
        this.coeffsingular = sArr2;
        this.coeffscalar = sArr3;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof BCRainbowPublicKey)) {
            return false;
        }
        BCRainbowPublicKey bCRainbowPublicKey = (BCRainbowPublicKey) obj;
        return this.docLength == bCRainbowPublicKey.getDocLength() && b.equals(this.coeffquadratic, bCRainbowPublicKey.getCoeffQuadratic()) && b.equals(this.coeffsingular, bCRainbowPublicKey.getCoeffSingular()) && b.equals(this.coeffscalar, bCRainbowPublicKey.getCoeffScalar());
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "Rainbow";
    }

    public short[][] getCoeffQuadratic() {
        return this.coeffquadratic;
    }

    public short[] getCoeffScalar() {
        return a.clone(this.coeffscalar);
    }

    public short[][] getCoeffSingular() {
        short[][] sArr = new short[this.coeffsingular.length][];
        int i8 = 0;
        while (true) {
            short[][] sArr2 = this.coeffsingular;
            if (i8 == sArr2.length) {
                return sArr;
            }
            sArr[i8] = a.clone(sArr2[i8]);
            i8++;
        }
    }

    public int getDocLength() {
        return this.docLength;
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        return h7.a.getEncodedSubjectPublicKeyInfo(new v6.a(e.rainbow, a1.INSTANCE), new g(this.docLength, this.coeffquadratic, this.coeffsingular, this.coeffscalar));
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    public int hashCode() {
        return (((((this.docLength * 37) + a.hashCode(this.coeffquadratic)) * 37) + a.hashCode(this.coeffsingular)) * 37) + a.hashCode(this.coeffscalar);
    }

    public BCRainbowPublicKey(e7.e eVar) {
        this(eVar.getDocLength(), eVar.getCoeffQuadratic(), eVar.getCoeffSingular(), eVar.getCoeffScalar());
    }

    public BCRainbowPublicKey(i7.c cVar) {
        this(cVar.getDocLength(), cVar.getCoeffQuadratic(), cVar.getCoeffSingular(), cVar.getCoeffScalar());
    }
}
