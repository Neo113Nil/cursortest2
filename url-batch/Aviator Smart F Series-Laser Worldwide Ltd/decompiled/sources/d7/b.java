package d7;

import org.bouncycastle.pqc.math.linearalgebra.l;
import org.bouncycastle.pqc.math.linearalgebra.m;
import org.bouncycastle.pqc.math.linearalgebra.o;

/* loaded from: classes5.dex */
public class b extends a {
    private org.bouncycastle.pqc.math.linearalgebra.e field;
    private m goppaPoly;

    /* renamed from: h, reason: collision with root package name */
    private org.bouncycastle.pqc.math.linearalgebra.c f16623h;

    /* renamed from: k, reason: collision with root package name */
    private int f16624k;

    /* renamed from: n, reason: collision with root package name */
    private int f16625n;

    /* renamed from: p, reason: collision with root package name */
    private l f16626p;
    private m[] qInv;

    public b(int i8, int i9, org.bouncycastle.pqc.math.linearalgebra.e eVar, m mVar, org.bouncycastle.pqc.math.linearalgebra.c cVar, l lVar, String str) {
        super(true, str);
        this.f16625n = i8;
        this.f16624k = i9;
        this.field = eVar;
        this.goppaPoly = mVar;
        this.f16623h = cVar;
        this.f16626p = lVar;
        this.qInv = new o(eVar, mVar).getSquareRootMatrix();
    }

    public org.bouncycastle.pqc.math.linearalgebra.e getField() {
        return this.field;
    }

    public m getGoppaPoly() {
        return this.goppaPoly;
    }

    public org.bouncycastle.pqc.math.linearalgebra.c getH() {
        return this.f16623h;
    }

    public int getK() {
        return this.f16624k;
    }

    public int getN() {
        return this.f16625n;
    }

    public l getP() {
        return this.f16626p;
    }

    public m[] getQInv() {
        return this.qInv;
    }

    public int getT() {
        return this.goppaPoly.getDegree();
    }

    public b(int i8, int i9, org.bouncycastle.pqc.math.linearalgebra.e eVar, m mVar, l lVar, String str) {
        this(i8, i9, eVar, mVar, org.bouncycastle.pqc.math.linearalgebra.g.createCanonicalCheckMatrix(eVar, mVar), lVar, str);
    }
}
