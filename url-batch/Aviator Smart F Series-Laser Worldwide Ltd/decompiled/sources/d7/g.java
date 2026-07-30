package d7;

/* loaded from: classes5.dex */
public class g extends d {

    /* renamed from: g, reason: collision with root package name */
    private org.bouncycastle.pqc.math.linearalgebra.c f16637g;

    /* renamed from: n, reason: collision with root package name */
    private int f16638n;

    /* renamed from: t, reason: collision with root package name */
    private int f16639t;

    public g(int i8, int i9, org.bouncycastle.pqc.math.linearalgebra.c cVar) {
        super(false, null);
        this.f16638n = i8;
        this.f16639t = i9;
        this.f16637g = new org.bouncycastle.pqc.math.linearalgebra.c(cVar);
    }

    public org.bouncycastle.pqc.math.linearalgebra.c getG() {
        return this.f16637g;
    }

    public int getK() {
        return this.f16637g.getNumRows();
    }

    public int getN() {
        return this.f16638n;
    }

    public int getT() {
        return this.f16639t;
    }
}
