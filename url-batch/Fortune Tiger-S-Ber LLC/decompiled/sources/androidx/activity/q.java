package androidx.activity;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import com.gglhk.bofio.fortunetiger.R;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public class q extends Dialog implements androidx.lifecycle.r, c1.f {

    /* renamed from: f, reason: collision with root package name */
    public androidx.lifecycle.t f141f;
    public final c1.e g;
    public final h0 h;

    public q(Context context, int i4) {
        super(context, i4);
        this.g = new c1.e(this);
        this.h = new h0(new a2.r(2, this));
    }

    public static void b(q qVar) {
        super.onBackPressed();
    }

    @Override // c1.f
    public final c1.d a() {
        return this.g.f1004b;
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        u2.c.e(view, "view");
        c();
        super.addContentView(view, layoutParams);
    }

    public final void c() {
        Window window = getWindow();
        u2.c.b(window);
        View decorView = window.getDecorView();
        u2.c.d(decorView, "window!!.decorView");
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        Window window2 = getWindow();
        u2.c.b(window2);
        View decorView2 = window2.getDecorView();
        u2.c.d(decorView2, "window!!.decorView");
        decorView2.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        Window window3 = getWindow();
        u2.c.b(window3);
        View decorView3 = window3.getDecorView();
        u2.c.d(decorView3, "window!!.decorView");
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
    }

    @Override // androidx.lifecycle.r
    public final androidx.lifecycle.t f() {
        androidx.lifecycle.t tVar = this.f141f;
        if (tVar != null) {
            return tVar;
        }
        androidx.lifecycle.t tVar2 = new androidx.lifecycle.t(this);
        this.f141f = tVar2;
        return tVar2;
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        this.h.c();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            u2.c.d(onBackInvokedDispatcher, "onBackInvokedDispatcher");
            h0 h0Var = this.h;
            h0Var.f110e = onBackInvokedDispatcher;
            h0Var.d(h0Var.g);
        }
        this.g.b(bundle);
        androidx.lifecycle.t tVar = this.f141f;
        if (tVar == null) {
            tVar = new androidx.lifecycle.t(this);
            this.f141f = tVar;
        }
        tVar.d(androidx.lifecycle.l.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        u2.c.d(onSaveInstanceState, "super.onSaveInstanceState()");
        this.g.c(onSaveInstanceState);
        return onSaveInstanceState;
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        androidx.lifecycle.t tVar = this.f141f;
        if (tVar == null) {
            tVar = new androidx.lifecycle.t(this);
            this.f141f = tVar;
        }
        tVar.d(androidx.lifecycle.l.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        androidx.lifecycle.t tVar = this.f141f;
        if (tVar == null) {
            tVar = new androidx.lifecycle.t(this);
            this.f141f = tVar;
        }
        tVar.d(androidx.lifecycle.l.ON_DESTROY);
        this.f141f = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int i4) {
        c();
        super.setContentView(i4);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        u2.c.e(view, "view");
        c();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        u2.c.e(view, "view");
        c();
        super.setContentView(view, layoutParams);
    }
}
