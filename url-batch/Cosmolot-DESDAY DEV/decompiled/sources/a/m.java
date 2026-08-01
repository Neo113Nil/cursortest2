package a;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.EnumC0068l;
import androidx.lifecycle.H;
import h0.C0132d;
import h0.C0133e;
import h0.InterfaceC0134f;

/* loaded from: classes.dex */
public class m extends Dialog implements androidx.lifecycle.r, y, InterfaceC0134f {

    /* renamed from: a, reason: collision with root package name */
    public androidx.lifecycle.t f1069a;

    /* renamed from: b, reason: collision with root package name */
    public final C0133e f1070b;

    /* renamed from: c, reason: collision with root package name */
    public final x f1071c;

    public m(Context context, int i) {
        super(context, i);
        this.f1070b = new C0133e(this);
        this.f1071c = new x(new B0.q(8, this));
    }

    public static void a(m mVar) {
        X0.e.e(mVar, "this$0");
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        X0.e.e(view, "view");
        e();
        super.addContentView(view, layoutParams);
    }

    @Override // h0.InterfaceC0134f
    public final C0132d b() {
        return this.f1070b.f2374b;
    }

    public final androidx.lifecycle.t c() {
        androidx.lifecycle.t tVar = this.f1069a;
        if (tVar != null) {
            return tVar;
        }
        androidx.lifecycle.t tVar2 = new androidx.lifecycle.t(this);
        this.f1069a = tVar2;
        return tVar2;
    }

    @Override // androidx.lifecycle.r
    public final androidx.lifecycle.t d() {
        return c();
    }

    public final void e() {
        Window window = getWindow();
        X0.e.b(window);
        View decorView = window.getDecorView();
        X0.e.d(decorView, "window!!.decorView");
        H.f(decorView, this);
        Window window2 = getWindow();
        X0.e.b(window2);
        View decorView2 = window2.getDecorView();
        X0.e.d(decorView2, "window!!.decorView");
        q1.l.T(decorView2, this);
        Window window3 = getWindow();
        X0.e.b(window3);
        View decorView3 = window3.getDecorView();
        X0.e.d(decorView3, "window!!.decorView");
        q1.d.j0(decorView3, this);
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        this.f1071c.b();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            X0.e.d(onBackInvokedDispatcher, "onBackInvokedDispatcher");
            x xVar = this.f1071c;
            xVar.getClass();
            xVar.f1098e = onBackInvokedDispatcher;
            xVar.c(xVar.f1100g);
        }
        this.f1070b.b(bundle);
        c().d(EnumC0068l.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        X0.e.d(onSaveInstanceState, "super.onSaveInstanceState()");
        this.f1070b.c(onSaveInstanceState);
        return onSaveInstanceState;
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        c().d(EnumC0068l.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        c().d(EnumC0068l.ON_DESTROY);
        this.f1069a = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        e();
        super.setContentView(i);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        X0.e.e(view, "view");
        e();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        X0.e.e(view, "view");
        e();
        super.setContentView(view, layoutParams);
    }
}
