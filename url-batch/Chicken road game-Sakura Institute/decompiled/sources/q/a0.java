package q;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class a0 implements Runnable, b3.f, View.OnAttachStateChangeListener {

    /* renamed from: f, reason: collision with root package name */
    public WindowInsets f7247f;

    /* renamed from: g, reason: collision with root package name */
    public final int f7248g;

    /* renamed from: h, reason: collision with root package name */
    public final u0 f7249h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f7250i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f7251j;

    /* renamed from: k, reason: collision with root package name */
    public b3.t0 f7252k;

    public a0(u0 u0Var) {
        this.f7248g = !u0Var.f7365r ? 1 : 0;
        this.f7249h = u0Var;
    }

    public final b3.t0 a(View view, b3.t0 t0Var) {
        this.f7252k = t0Var;
        u0 u0Var = this.f7249h;
        r0 r0Var = u0Var.f7363p;
        b3.q0 q0Var = t0Var.f1367a;
        r0Var.f(c.e(q0Var.f(8)));
        if (this.f7250i) {
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
            }
        } else if (!this.f7251j) {
            u0Var.f7364q.f(c.e(q0Var.f(8)));
            u0.a(u0Var, t0Var);
        }
        return u0Var.f7365r ? b3.t0.f1366b : t0Var;
    }

    public final void b(b3.f0 f0Var) {
        this.f7250i = false;
        this.f7251j = false;
        b3.t0 t0Var = this.f7252k;
        if (f0Var.f1322a.a() != 0 && t0Var != null) {
            b3.q0 q0Var = t0Var.f1367a;
            u0 u0Var = this.f7249h;
            u0Var.f7364q.f(c.e(q0Var.f(8)));
            u0Var.f7363p.f(c.e(q0Var.f(8)));
            u0.a(u0Var, t0Var);
        }
        this.f7252k = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.requestApplyInsets();
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f7250i) {
            this.f7250i = false;
            this.f7251j = false;
            b3.t0 t0Var = this.f7252k;
            if (t0Var != null) {
                u0 u0Var = this.f7249h;
                u0Var.f7364q.f(c.e(t0Var.f1367a.f(8)));
                u0.a(u0Var, t0Var);
                this.f7252k = null;
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
