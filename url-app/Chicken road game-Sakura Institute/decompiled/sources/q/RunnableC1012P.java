package q;

import a1.C0368D;
import a1.C0380P;
import a1.C0383T;
import a1.InterfaceC0391f;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;

/* renamed from: q.P, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC1012P implements Runnable, InterfaceC0391f, View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public WindowInsets f9202d;

    /* renamed from: e, reason: collision with root package name */
    public final int f9203e;

    /* renamed from: i, reason: collision with root package name */
    public final o0 f9204i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f9205j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f9206k;

    /* renamed from: l, reason: collision with root package name */
    public C0383T f9207l;

    public RunnableC1012P(o0 o0Var) {
        this.f9203e = !o0Var.f9315r ? 1 : 0;
        this.f9204i = o0Var;
    }

    public final C0383T a(View view, C0383T c0383t) {
        this.f9207l = c0383t;
        o0 o0Var = this.f9204i;
        o0Var.getClass();
        C0380P c0380p = c0383t.f4871a;
        o0Var.f9313p.f(AbstractC1024c.i(c0380p.f(8)));
        if (this.f9205j) {
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
            }
        } else if (!this.f9206k) {
            o0Var.f9314q.f(AbstractC1024c.i(c0380p.f(8)));
            o0.a(o0Var, c0383t);
        }
        return o0Var.f9315r ? C0383T.f4870b : c0383t;
    }

    public final void b(C0368D c0368d) {
        this.f9205j = false;
        this.f9206k = false;
        C0383T c0383t = this.f9207l;
        if (c0368d.f4839a.a() != 0 && c0383t != null) {
            o0 o0Var = this.f9204i;
            o0Var.getClass();
            C0380P c0380p = c0383t.f4871a;
            o0Var.f9314q.f(AbstractC1024c.i(c0380p.f(8)));
            o0Var.f9313p.f(AbstractC1024c.i(c0380p.f(8)));
            o0.a(o0Var, c0383t);
        }
        this.f9207l = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.requestApplyInsets();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f9205j) {
            this.f9205j = false;
            this.f9206k = false;
            C0383T c0383t = this.f9207l;
            if (c0383t != null) {
                o0 o0Var = this.f9204i;
                o0Var.getClass();
                o0Var.f9314q.f(AbstractC1024c.i(c0383t.f4871a.f(8)));
                o0.a(o0Var, c0383t);
                this.f9207l = null;
            }
        }
    }
}
