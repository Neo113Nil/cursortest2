package u0;

import android.graphics.Matrix;
import e2.InterfaceC0426e;

/* renamed from: u0.t0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1126t0 {

    /* renamed from: a, reason: collision with root package name */
    public final f2.k f9523a;

    /* renamed from: b, reason: collision with root package name */
    public Matrix f9524b;

    /* renamed from: c, reason: collision with root package name */
    public Matrix f9525c;

    /* renamed from: d, reason: collision with root package name */
    public float[] f9526d;

    /* renamed from: e, reason: collision with root package name */
    public float[] f9527e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f9528f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f9529g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f9530h = true;

    /* JADX WARN: Multi-variable type inference failed */
    public C1126t0(InterfaceC0426e interfaceC0426e) {
        this.f9523a = (f2.k) interfaceC0426e;
    }

    public final float[] a(Object obj) {
        float[] fArr = this.f9527e;
        if (fArr == null) {
            fArr = b0.G.a();
            this.f9527e = fArr;
        }
        if (this.f9529g) {
            this.f9530h = L.s(b(obj), fArr);
            this.f9529g = false;
        }
        if (this.f9530h) {
            return fArr;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [e2.e, f2.k] */
    public final float[] b(Object obj) {
        float[] fArr = this.f9526d;
        if (fArr == null) {
            fArr = b0.G.a();
            this.f9526d = fArr;
        }
        if (!this.f9528f) {
            return fArr;
        }
        Matrix matrix = this.f9524b;
        if (matrix == null) {
            matrix = new Matrix();
            this.f9524b = matrix;
        }
        this.f9523a.h(obj, matrix);
        Matrix matrix2 = this.f9525c;
        if (matrix2 == null || !matrix.equals(matrix2)) {
            b0.M.y(matrix, fArr);
            this.f9524b = matrix2;
            this.f9525c = matrix;
        }
        this.f9528f = false;
        return fArr;
    }

    public final void c() {
        this.f9528f = true;
        this.f9529g = true;
    }
}
