package z0;

import android.graphics.Paint;
import android.graphics.Shader;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class q extends p {

    /* renamed from: a, reason: collision with root package name */
    public Shader f10034a;

    /* renamed from: b, reason: collision with root package name */
    public long f10035b = 9205357640488583168L;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Shader f10036c;

    public q(Shader shader) {
        this.f10036c = shader;
    }

    @Override // z0.p
    public final void a(float f9, long j8, f7.i0 i0Var) {
        Paint paint = (Paint) i0Var.f3488b;
        Shader shader = this.f10034a;
        if (shader == null || !y0.f.a(this.f10035b, j8)) {
            if (y0.f.e(j8)) {
                shader = null;
                this.f10034a = null;
                this.f10035b = 9205357640488583168L;
            } else {
                shader = this.f10036c;
                this.f10034a = shader;
                this.f10035b = j8;
            }
        }
        long c4 = l0.c(paint.getColor());
        long j9 = u.f10052b;
        if (!u.c(c4, j9)) {
            i0Var.e(j9);
        }
        if (!r6.k.a((Shader) i0Var.f3489c, shader)) {
            i0Var.h(shader);
        }
        if (paint.getAlpha() / 255.0f == f9) {
            return;
        }
        i0Var.c(f9);
    }
}
