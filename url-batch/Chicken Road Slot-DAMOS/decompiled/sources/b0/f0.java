package b0;

import android.os.Build;
import android.view.View;
import java.util.List;
import o3.h1;
import o3.k1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class f0 extends androidx.datastore.preferences.protobuf.i implements Runnable, o3.i, View.OnAttachStateChangeListener {

    /* renamed from: i, reason: collision with root package name */
    public final e1 f838i;

    /* renamed from: r, reason: collision with root package name */
    public boolean f839r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f840s;

    /* renamed from: t, reason: collision with root package name */
    public k1 f841t;

    public f0(e1 e1Var) {
        super(!e1Var.f835s ? 1 : 0);
        this.f838i = e1Var;
    }

    @Override // o3.i
    public final k1 b(View view, k1 k1Var) {
        this.f841t = k1Var;
        e1 e1Var = this.f838i;
        b1 b1Var = e1Var.f833q;
        h1 h1Var = k1Var.f7415a;
        b1Var.f(i.k(h1Var.i(8)));
        if (this.f839r) {
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
            }
        } else if (!this.f840s) {
            e1Var.f834r.f(i.k(h1Var.i(8)));
            e1.b(e1Var, k1Var);
        }
        return e1Var.f835s ? k1.f7414b : k1Var;
    }

    @Override // androidx.datastore.preferences.protobuf.i
    public final void e(o3.q0 q0Var) {
        this.f839r = false;
        this.f840s = false;
        k1 k1Var = this.f841t;
        if (q0Var.f7435a.b() > 0 && k1Var != null) {
            h1 h1Var = k1Var.f7415a;
            e1 e1Var = this.f838i;
            e1Var.f834r.f(i.k(h1Var.i(8)));
            e1Var.f833q.f(i.k(h1Var.i(8)));
            e1.b(e1Var, k1Var);
        }
        this.f841t = null;
    }

    @Override // androidx.datastore.preferences.protobuf.i
    public final void f(o3.q0 q0Var) {
        this.f839r = true;
        this.f840s = true;
    }

    @Override // androidx.datastore.preferences.protobuf.i
    public final k1 g(k1 k1Var, List list) {
        e1 e1Var = this.f838i;
        e1.b(e1Var, k1Var);
        return e1Var.f835s ? k1.f7414b : k1Var;
    }

    @Override // androidx.datastore.preferences.protobuf.i
    public final c6.e h(o3.q0 q0Var, c6.e eVar) {
        this.f839r = false;
        return eVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.requestApplyInsets();
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f839r) {
            this.f839r = false;
            this.f840s = false;
            k1 k1Var = this.f841t;
            if (k1Var != null) {
                e1 e1Var = this.f838i;
                e1Var.f834r.f(i.k(k1Var.f7415a.i(8)));
                e1.b(e1Var, k1Var);
                this.f841t = null;
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
