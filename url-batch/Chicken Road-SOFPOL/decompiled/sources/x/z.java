package x;

import android.os.Build;
import android.view.View;
import java.util.List;
import q3.i1;
import q3.l1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class z extends androidx.datastore.preferences.protobuf.j implements Runnable, q3.p, View.OnAttachStateChangeListener {

    /* renamed from: f, reason: collision with root package name */
    public final s0 f8312f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f8313g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f8314h;
    public l1 i;

    public z(s0 s0Var) {
        super(!s0Var.f8290r ? 1 : 0);
        this.f8312f = s0Var;
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final void d(q3.u0 u0Var) {
        this.f8313g = false;
        this.f8314h = false;
        l1 l1Var = this.i;
        if (u0Var.f6160a.b() > 0 && l1Var != null) {
            i1 i1Var = l1Var.f6127a;
            s0 s0Var = this.f8312f;
            s0Var.f8289q.f(v0.c(i1Var.f(8)));
            s0Var.f8288p.f(v0.c(i1Var.f(8)));
            s0.a(s0Var, l1Var);
        }
        this.i = null;
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final void e() {
        this.f8313g = true;
        this.f8314h = true;
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final l1 f(l1 l1Var, List list) {
        s0 s0Var = this.f8312f;
        s0.a(s0Var, l1Var);
        return s0Var.f8290r ? l1.f6126b : l1Var;
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final a0.a0 g(q3.u0 u0Var, a0.a0 a0Var) {
        this.f8313g = false;
        return a0Var;
    }

    @Override // q3.p
    public final l1 k(View view, l1 l1Var) {
        this.i = l1Var;
        s0 s0Var = this.f8312f;
        q0 q0Var = s0Var.f8288p;
        i1 i1Var = l1Var.f6127a;
        q0Var.f(v0.c(i1Var.f(8)));
        if (this.f8313g) {
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
            }
        } else if (!this.f8314h) {
            s0Var.f8289q.f(v0.c(i1Var.f(8)));
            s0.a(s0Var, l1Var);
        }
        return s0Var.f8290r ? l1.f6126b : l1Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.requestApplyInsets();
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f8313g) {
            this.f8313g = false;
            this.f8314h = false;
            l1 l1Var = this.i;
            if (l1Var != null) {
                s0 s0Var = this.f8312f;
                s0Var.f8289q.f(v0.c(l1Var.f6127a.f(8)));
                s0.a(s0Var, l1Var);
                this.i = null;
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
