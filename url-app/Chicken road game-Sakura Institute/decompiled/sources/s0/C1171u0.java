package s0;

import android.graphics.Matrix;
import kotlin.jvm.functions.Function2;

/* renamed from: s0.u0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1171u0 {

    /* renamed from: a, reason: collision with root package name */
    public final M2.p f10393a;

    /* renamed from: b, reason: collision with root package name */
    public Matrix f10394b;

    /* renamed from: c, reason: collision with root package name */
    public Matrix f10395c;

    /* renamed from: d, reason: collision with root package name */
    public float[] f10396d;

    /* renamed from: e, reason: collision with root package name */
    public float[] f10397e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f10398f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f10399g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f10400h = true;

    /* JADX WARN: Multi-variable type inference failed */
    public C1171u0(Function2 function2) {
        this.f10393a = (M2.p) function2;
    }

    public final float[] a(Object obj) {
        float[] fArr = this.f10397e;
        if (fArr == null) {
            fArr = Z.E.a();
            this.f10397e = fArr;
        }
        if (this.f10399g) {
            this.f10400h = AbstractC1125K.h(b(obj), fArr);
            this.f10399g = false;
        }
        if (this.f10400h) {
            return fArr;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [M2.p, kotlin.jvm.functions.Function2] */
    public final float[] b(Object obj) {
        float[] fArr = this.f10396d;
        if (fArr == null) {
            fArr = Z.E.a();
            this.f10396d = fArr;
        }
        if (!this.f10398f) {
            return fArr;
        }
        Matrix matrix = this.f10394b;
        if (matrix == null) {
            matrix = new Matrix();
            this.f10394b = matrix;
        }
        this.f10393a.h(obj, matrix);
        Matrix matrix2 = this.f10395c;
        if (matrix2 == null || !matrix.equals(matrix2)) {
            Z.K.y(matrix, fArr);
            this.f10394b = matrix2;
            this.f10395c = matrix;
        }
        this.f10398f = false;
        return fArr;
    }

    public final void c() {
        this.f10398f = true;
        this.f10399g = true;
    }
}
