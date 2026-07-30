package i7;

import java.security.spec.KeySpec;

/* loaded from: classes5.dex */
public class b implements KeySpec {
    private short[][] A1inv;
    private short[][] A2inv;

    /* renamed from: b1, reason: collision with root package name */
    private short[] f16951b1;

    /* renamed from: b2, reason: collision with root package name */
    private short[] f16952b2;
    private e7.a[] layers;
    private int[] vi;

    public b(short[][] sArr, short[] sArr2, short[][] sArr3, short[] sArr4, int[] iArr, e7.a[] aVarArr) {
        this.A1inv = sArr;
        this.f16951b1 = sArr2;
        this.A2inv = sArr3;
        this.f16952b2 = sArr4;
        this.vi = iArr;
        this.layers = aVarArr;
    }

    public short[] getB1() {
        return this.f16951b1;
    }

    public short[] getB2() {
        return this.f16952b2;
    }

    public short[][] getInvA1() {
        return this.A1inv;
    }

    public short[][] getInvA2() {
        return this.A2inv;
    }

    public e7.a[] getLayers() {
        return this.layers;
    }

    public int[] getVi() {
        return this.vi;
    }
}
