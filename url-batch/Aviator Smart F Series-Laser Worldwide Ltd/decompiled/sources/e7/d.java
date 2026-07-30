package e7;

/* loaded from: classes5.dex */
public class d extends b {
    private short[][] A1inv;
    private short[][] A2inv;

    /* renamed from: b1, reason: collision with root package name */
    private short[] f16654b1;

    /* renamed from: b2, reason: collision with root package name */
    private short[] f16655b2;
    private a[] layers;
    private int[] vi;

    public d(short[][] sArr, short[] sArr2, short[][] sArr3, short[] sArr4, int[] iArr, a[] aVarArr) {
        super(true, iArr[iArr.length - 1] - iArr[0]);
        this.A1inv = sArr;
        this.f16654b1 = sArr2;
        this.A2inv = sArr3;
        this.f16655b2 = sArr4;
        this.vi = iArr;
        this.layers = aVarArr;
    }

    public short[] getB1() {
        return this.f16654b1;
    }

    public short[] getB2() {
        return this.f16655b2;
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
}
