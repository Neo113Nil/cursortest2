package a;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import com.gdmhkmf.belbet.R;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public class o extends Dialog implements androidx.lifecycle.r, h1.e {

    /* renamed from: f, reason: collision with root package name */
    public androidx.lifecycle.t f66f;

    /* renamed from: g, reason: collision with root package name */
    public final h1.d f67g;
    public final w2.c h;
    public final w2.c i;

    public o(Context context, int i) {
        super(context, i);
        this.f67g = new h1.d(this);
        final int i4 = 0;
        this.h = new w2.c(new h3.a(this) { // from class: a.n

            /* renamed from: g, reason: collision with root package name */
            public final /* synthetic */ o f65g;

            {
                this.f65g = this;
            }

            @Override // h3.a
            public final Object a() {
                switch (i4) {
                    case 0:
                        d1.a aVar = new d1.a();
                        this.f65g.c().a().b(aVar);
                        return aVar;
                    default:
                        return new j0(new j(1, this.f65g));
                }
            }
        });
        final int i5 = 1;
        this.i = new w2.c(new h3.a(this) { // from class: a.n

            /* renamed from: g, reason: collision with root package name */
            public final /* synthetic */ o f65g;

            {
                this.f65g = this;
            }

            @Override // h3.a
            public final Object a() {
                switch (i5) {
                    case 0:
                        d1.a aVar = new d1.a();
                        this.f65g.c().a().b(aVar);
                        return aVar;
                    default:
                        return new j0(new j(1, this.f65g));
                }
            }
        });
    }

    public static void b(o oVar) {
        super.onBackPressed();
    }

    @Override // h1.e
    public final h1.c a() {
        return this.f67g.f1972b;
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        i3.d.e(view, "view");
        d();
        super.addContentView(view, layoutParams);
    }

    public final j0 c() {
        return (j0) this.i.a();
    }

    public final void d() {
        Window window = getWindow();
        i3.d.b(window);
        View decorView = window.getDecorView();
        i3.d.d(decorView, "getDecorView(...)");
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        Window window2 = getWindow();
        i3.d.b(window2);
        View decorView2 = window2.getDecorView();
        i3.d.d(decorView2, "getDecorView(...)");
        decorView2.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        Window window3 = getWindow();
        i3.d.b(window3);
        View decorView3 = window3.getDecorView();
        i3.d.d(decorView3, "getDecorView(...)");
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
        Window window4 = getWindow();
        i3.d.b(window4);
        View decorView4 = window4.getDecorView();
        i3.d.d(decorView4, "getDecorView(...)");
        decorView4.setTag(R.id.view_tree_navigation_event_dispatcher_owner, this);
    }

    @Override // androidx.lifecycle.r
    public final androidx.lifecycle.t f() {
        androidx.lifecycle.t tVar = this.f66f;
        if (tVar != null) {
            return tVar;
        }
        androidx.lifecycle.t tVar2 = new androidx.lifecycle.t(this);
        this.f66f = tVar2;
        return tVar2;
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        ((d1.a) this.h.a()).a();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            j0 c5 = c();
            onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            i3.d.d(onBackInvokedDispatcher, "getOnBackInvokedDispatcher(...)");
            c5.b(onBackInvokedDispatcher);
        }
        this.f67g.b(bundle);
        androidx.lifecycle.t tVar = this.f66f;
        if (tVar == null) {
            tVar = new androidx.lifecycle.t(this);
            this.f66f = tVar;
        }
        tVar.d(androidx.lifecycle.l.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        i3.d.d(onSaveInstanceState, "onSaveInstanceState(...)");
        this.f67g.c(onSaveInstanceState);
        return onSaveInstanceState;
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        androidx.lifecycle.t tVar = this.f66f;
        if (tVar == null) {
            tVar = new androidx.lifecycle.t(this);
            this.f66f = tVar;
        }
        tVar.d(androidx.lifecycle.l.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        androidx.lifecycle.t tVar = this.f66f;
        if (tVar == null) {
            tVar = new androidx.lifecycle.t(this);
            this.f66f = tVar;
        }
        tVar.d(androidx.lifecycle.l.ON_DESTROY);
        this.f66f = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        d();
        super.setContentView(i);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        i3.d.e(view, "view");
        d();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        i3.d.e(view, "view");
        d();
        super.setContentView(view, layoutParams);
    }
}
