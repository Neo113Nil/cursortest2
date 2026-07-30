package s1;

import android.graphics.Matrix;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class r1 {

    /* renamed from: a, reason: collision with root package name */
    public final r6.l f8406a;

    /* renamed from: b, reason: collision with root package name */
    public Matrix f8407b;

    /* renamed from: c, reason: collision with root package name */
    public Matrix f8408c;

    /* renamed from: d, reason: collision with root package name */
    public float[] f8409d;

    /* renamed from: e, reason: collision with root package name */
    public float[] f8410e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f8411f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f8412g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f8413h = true;

    /* JADX WARN: Multi-variable type inference failed */
    public r1(q6.e eVar) {
        this.f8406a = (r6.l) eVar;
    }

    public final float[] a(Object obj) {
        float[] fArr = this.f8410e;
        if (fArr == null) {
            fArr = z0.f0.a();
            this.f8410e = fArr;
        }
        if (this.f8412g) {
            this.f8413h = j0.s(b(obj), fArr);
            this.f8412g = false;
        }
        if (this.f8413h) {
            return fArr;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [q6.e, r6.l] */
    public final float[] b(Object obj) {
        float[] fArr = this.f8409d;
        if (fArr == null) {
            fArr = z0.f0.a();
            this.f8409d = fArr;
        }
        if (!this.f8411f) {
            return fArr;
        }
        Matrix matrix = this.f8407b;
        if (matrix == null) {
            matrix = new Matrix();
            this.f8407b = matrix;
        }
        this.f8406a.d(obj, matrix);
        Matrix matrix2 = this.f8408c;
        if (matrix2 == null || !matrix.equals(matrix2)) {
            z0.l0.r(matrix, fArr);
            this.f8407b = matrix2;
            this.f8408c = matrix;
        }
        this.f8411f = false;
        return fArr;
    }

    public final void c() {
        this.f8411f = true;
        this.f8412g = true;
    }
}
