package org.bouncycastle.pqc.jcajce.provider.rainbow;

import c7.e;
import c7.f;
import e7.a;
import e7.d;
import java.io.IOException;
import java.security.PrivateKey;
import java.util.Arrays;
import org.bouncycastle.asn1.a1;
import org.bouncycastle.pqc.crypto.rainbow.util.b;

/* loaded from: classes5.dex */
public class BCRainbowPrivateKey implements PrivateKey {
    private static final long serialVersionUID = 1;
    private short[][] A1inv;
    private short[][] A2inv;

    /* renamed from: b1, reason: collision with root package name */
    private short[] f17211b1;

    /* renamed from: b2, reason: collision with root package name */
    private short[] f17212b2;
    private a[] layers;
    private int[] vi;

    public BCRainbowPrivateKey(d dVar) {
        this(dVar.getInvA1(), dVar.getB1(), dVar.getInvA2(), dVar.getB2(), dVar.getVi(), dVar.getLayers());
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof BCRainbowPrivateKey)) {
            return false;
        }
        BCRainbowPrivateKey bCRainbowPrivateKey = (BCRainbowPrivateKey) obj;
        boolean z7 = b.equals(this.A1inv, bCRainbowPrivateKey.getInvA1()) && b.equals(this.A2inv, bCRainbowPrivateKey.getInvA2()) && b.equals(this.f17211b1, bCRainbowPrivateKey.getB1()) && b.equals(this.f17212b2, bCRainbowPrivateKey.getB2()) && Arrays.equals(this.vi, bCRainbowPrivateKey.getVi());
        if (this.layers.length != bCRainbowPrivateKey.getLayers().length) {
            return false;
        }
        for (int length = this.layers.length - 1; length >= 0; length--) {
            z7 &= this.layers[length].equals(bCRainbowPrivateKey.getLayers()[length]);
        }
        return z7;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "Rainbow";
    }

    public short[] getB1() {
        return this.f17211b1;
    }

    public short[] getB2() {
        return this.f17212b2;
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return new t6.b(new v6.a(e.rainbow, a1.INSTANCE), new f(this.A1inv, this.f17211b1, this.A2inv, this.f17212b2, this.vi, this.layers)).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    public short[][] getInvA1() {
        return this.A1inv;
    }

    public short[][] getInvA2() {
        return this.A2inv;
    }

    public a[] getLayers() {
        return this.layers;
    }

    public int[] getVi() {
        return this.vi;
    }

    public int hashCode() {
        int length = (((((((((this.layers.length * 37) + org.bouncycastle.util.a.hashCode(this.A1inv)) * 37) + org.bouncycastle.util.a.hashCode(this.f17211b1)) * 37) + org.bouncycastle.util.a.hashCode(this.A2inv)) * 37) + org.bouncycastle.util.a.hashCode(this.f17212b2)) * 37) + org.bouncycastle.util.a.hashCode(this.vi);
        for (int length2 = this.layers.length - 1; length2 >= 0; length2--) {
            length = (length * 37) + this.layers[length2].hashCode();
        }
        return length;
    }

    public BCRainbowPrivateKey(i7.b bVar) {
        this(bVar.getInvA1(), bVar.getB1(), bVar.getInvA2(), bVar.getB2(), bVar.getVi(), bVar.getLayers());
    }

    public BCRainbowPrivateKey(short[][] sArr, short[] sArr2, short[][] sArr3, short[] sArr4, int[] iArr, a[] aVarArr) {
        this.A1inv = sArr;
        this.f17211b1 = sArr2;
        this.A2inv = sArr3;
        this.f17212b2 = sArr4;
        this.vi = iArr;
        this.layers = aVarArr;
    }
}
