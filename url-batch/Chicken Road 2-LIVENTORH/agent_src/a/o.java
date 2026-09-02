package a;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import com.oriondriftchasers.arordrft.R;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public class o extends Dialog implements androidx.lifecycle.r, g1.e {

    /* renamed from: f, reason: collision with root package name */
    public androidx.lifecycle.t f63f;

    /* renamed from: g, reason: collision with root package name */
    public final g1.d f64g;

    /* renamed from: h, reason: collision with root package name */
    public final z2.b f65h;
    public final z2.b i;

    public o(Context context, int i) {
        super(context, i);
        this.f64g = new g1.d(this);
        final int i4 = 0;
        this.f65h = new z2.b(new e3.a(this) { // from class: a.n

            /* renamed from: g, reason: collision with root package name */
            public final /* synthetic */ o f62g;

            {
                this.f62g = this;
            }

            @Override // e3.a
            public final Object a() {
                switch (i4) {
                    case 0:
                        c1.a aVar = new c1.a();
                        this.f62g.c().f25b.b(aVar);
                        return aVar;
                    default:
                        return new g0(new j(1, this.f62g));
                }
            }
        });
        final int i5 = 1;
        this.i = new z2.b(new e3.a(this) { // from class: a.n

            /* renamed from: g, reason: collision with root package name */
            public final /* synthetic */ o f62g;

            {
                this.f62g = this;
            }

            @Override // e3.a
            public final Object a() {
                switch (i5) {
                    case 0:
                        c1.a aVar = new c1.a();
                        this.f62g.c().f25b.b(aVar);
                        return aVar;
                    default:
                        return new g0(new j(1, this.f62g));
                }
            }
        });
    }

    public static void a(o oVar) {
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        f3.d.e(view, "view");
        d();
        super.addContentView(view, layoutParams);
    }

    @Override // g1.e
    public final g1.c b() {
        return this.f64g.f1703b;
    }

    public final g0 c() {
        return (g0) this.i.a();
    }

    public final void d() {
        Window window = getWindow();
        f3.d.b(window);
        View decorView = window.getDecorView();
        f3.d.d(decorView, "getDecorView(...)");
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        Window window2 = getWindow();
        f3.d.b(window2);
        View decorView2 = window2.getDecorView();
        f3.d.d(decorView2, "getDecorView(...)");
        decorView2.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        Window window3 = getWindow();
        f3.d.b(window3);
        View decorView3 = window3.getDecorView();
        f3.d.d(decorView3, "getDecorView(...)");
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
        Window window4 = getWindow();
        f3.d.b(window4);
        View decorView4 = window4.getDecorView();
        f3.d.d(decorView4, "getDecorView(...)");
        decorView4.setTag(R.id.view_tree_navigation_event_dispatcher_owner, this);
    }

    @Override // androidx.lifecycle.r
    public final androidx.lifecycle.t e() {
        androidx.lifecycle.t tVar = this.f63f;
        if (tVar != null) {
            return tVar;
        }
        androidx.lifecycle.t tVar2 = new androidx.lifecycle.t(this);
        this.f63f = tVar2;
        return tVar2;
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        ((c1.a) this.f65h.a()).a();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            g0 c4 = c();
            onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            f3.d.d(onBackInvokedDispatcher, "getOnBackInvokedDispatcher(...)");
            c4.a(onBackInvokedDispatcher);
        }
        this.f64g.b(bundle);
        androidx.lifecycle.t tVar = this.f63f;
        if (tVar == null) {
            tVar = new androidx.lifecycle.t(this);
            this.f63f = tVar;
        }
        tVar.d(androidx.lifecycle.l.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        f3.d.d(onSaveInstanceState, "onSaveInstanceState(...)");
        this.f64g.c(onSaveInstanceState);
        return onSaveInstanceState;
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        androidx.lifecycle.t tVar = this.f63f;
        if (tVar == null) {
            tVar = new androidx.lifecycle.t(this);
            this.f63f = tVar;
        }
        tVar.d(androidx.lifecycle.l.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        androidx.lifecycle.t tVar = this.f63f;
        if (tVar == null) {
            tVar = new androidx.lifecycle.t(this);
            this.f63f = tVar;
        }
        tVar.d(androidx.lifecycle.l.ON_DESTROY);
        this.f63f = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        d();
        super.setContentView(i);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        f3.d.e(view, "view");
        d();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        f3.d.e(view, "view");
        d();
        super.setContentView(view, layoutParams);
    }
}
