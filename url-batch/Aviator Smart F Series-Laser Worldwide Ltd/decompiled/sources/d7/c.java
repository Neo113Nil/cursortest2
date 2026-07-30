package d7;

/* loaded from: classes5.dex */
public class c extends a {
    private org.bouncycastle.pqc.math.linearalgebra.c matrixG;

    /* renamed from: n, reason: collision with root package name */
    private int f16627n;

    /* renamed from: t, reason: collision with root package name */
    private int f16628t;

    public c(int i8, int i9, org.bouncycastle.pqc.math.linearalgebra.c cVar, String str) {
        super(false, str);
        this.f16627n = i8;
        this.f16628t = i9;
        this.matrixG = new org.bouncycastle.pqc.math.linearalgebra.c(cVar);
    }

    public org.bouncycastle.pqc.math.linearalgebra.c getG() {
        return this.matrixG;
    }

    public int getK() {
        return this.matrixG.getNumRows();
    }

    public int getN() {
        return this.f16627n;
    }

    public int getT() {
        return this.f16628t;
    }
}
