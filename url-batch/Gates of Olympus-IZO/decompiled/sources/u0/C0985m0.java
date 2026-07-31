package u0;

import android.graphics.Matrix;
import b0.AbstractC0259J;

/* renamed from: u0.m0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0985m0 {

    /* renamed from: a, reason: collision with root package name */
    public final Z1.j f8369a;

    /* renamed from: b, reason: collision with root package name */
    public Matrix f8370b;

    /* renamed from: c, reason: collision with root package name */
    public Matrix f8371c;

    /* renamed from: d, reason: collision with root package name */
    public float[] f8372d;

    /* renamed from: e, reason: collision with root package name */
    public float[] f8373e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f8374f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f8375g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f8376h = true;

    /* JADX WARN: Multi-variable type inference failed */
    public C0985m0(Y1.e eVar) {
        this.f8369a = (Z1.j) eVar;
    }

    public final float[] a(Object obj) {
        float[] fArr = this.f8373e;
        if (fArr == null) {
            fArr = AbstractC0259J.l();
            this.f8373e = fArr;
        }
        if (this.f8375g) {
            this.f8376h = L.o(b(obj), fArr);
            this.f8375g = false;
        }
        if (this.f8376h) {
            return fArr;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [Y1.e, Z1.j] */
    public final float[] b(Object obj) {
        float[] fArr = this.f8372d;
        if (fArr == null) {
            fArr = AbstractC0259J.l();
            this.f8372d = fArr;
        }
        if (!this.f8374f) {
            return fArr;
        }
        Matrix matrix = this.f8370b;
        if (matrix == null) {
            matrix = new Matrix();
            this.f8370b = matrix;
        }
        this.f8369a.g(obj, matrix);
        Matrix matrix2 = this.f8371c;
        if (matrix2 == null || !matrix.equals(matrix2)) {
            AbstractC0259J.z(fArr, matrix);
            this.f8370b = matrix2;
            this.f8371c = matrix;
        }
        this.f8374f = false;
        return fArr;
    }

    public final void c() {
        this.f8374f = true;
        this.f8375g = true;
    }
}
