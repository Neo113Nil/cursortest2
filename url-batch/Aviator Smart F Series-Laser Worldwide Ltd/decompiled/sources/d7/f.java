package d7;

import org.bouncycastle.pqc.math.linearalgebra.l;
import org.bouncycastle.pqc.math.linearalgebra.m;
import org.bouncycastle.pqc.math.linearalgebra.o;

/* loaded from: classes5.dex */
public class f extends d {
    private org.bouncycastle.pqc.math.linearalgebra.e field;
    private m goppaPoly;

    /* renamed from: h, reason: collision with root package name */
    private org.bouncycastle.pqc.math.linearalgebra.c f16632h;

    /* renamed from: k, reason: collision with root package name */
    private int f16633k;

    /* renamed from: n, reason: collision with root package name */
    private int f16634n;
    private String oid;

    /* renamed from: p1, reason: collision with root package name */
    private l f16635p1;

    /* renamed from: p2, reason: collision with root package name */
    private l f16636p2;
    private m[] qInv;
    private org.bouncycastle.pqc.math.linearalgebra.c sInv;

    public f(int i8, int i9, org.bouncycastle.pqc.math.linearalgebra.e eVar, m mVar, l lVar, l lVar2, org.bouncycastle.pqc.math.linearalgebra.c cVar) {
        super(true, null);
        this.f16633k = i9;
        this.f16634n = i8;
        this.field = eVar;
        this.goppaPoly = mVar;
        this.sInv = cVar;
        this.f16635p1 = lVar;
        this.f16636p2 = lVar2;
        this.f16632h = org.bouncycastle.pqc.math.linearalgebra.g.createCanonicalCheckMatrix(eVar, mVar);
        this.qInv = new o(eVar, mVar).getSquareRootMatrix();
    }

    public org.bouncycastle.pqc.math.linearalgebra.e getField() {
        return this.field;
    }

    public m getGoppaPoly() {
        return this.goppaPoly;
    }

    public org.bouncycastle.pqc.math.linearalgebra.c getH() {
        return this.f16632h;
    }

    public int getK() {
        return this.f16633k;
    }

    public int getN() {
        return this.f16634n;
    }

    public l getP1() {
        return this.f16635p1;
    }

    public l getP2() {
        return this.f16636p2;
    }

    public m[] getQInv() {
        return this.qInv;
    }

    public org.bouncycastle.pqc.math.linearalgebra.c getSInv() {
        return this.sInv;
    }

    public f(int i8, int i9, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6, byte[][] bArr7) {
        super(true, null);
        this.f16634n = i8;
        this.f16633k = i9;
        org.bouncycastle.pqc.math.linearalgebra.e eVar = new org.bouncycastle.pqc.math.linearalgebra.e(bArr);
        this.field = eVar;
        this.goppaPoly = new m(eVar, bArr2);
        this.sInv = new org.bouncycastle.pqc.math.linearalgebra.c(bArr3);
        this.f16635p1 = new l(bArr4);
        this.f16636p2 = new l(bArr5);
        this.f16632h = new org.bouncycastle.pqc.math.linearalgebra.c(bArr6);
        this.qInv = new m[bArr7.length];
        for (int i10 = 0; i10 < bArr7.length; i10++) {
            this.qInv[i10] = new m(this.field, bArr7[i10]);
        }
    }
}
