package a;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.EnumC0069l;
import androidx.lifecycle.H;
import h0.C0133d;
import h0.C0134e;
import h0.InterfaceC0135f;

/* loaded from: classes.dex */
public class m extends Dialog implements androidx.lifecycle.r, y, InterfaceC0135f {

    /* renamed from: a, reason: collision with root package name */
    public androidx.lifecycle.t f1074a;

    /* renamed from: b, reason: collision with root package name */
    public final C0134e f1075b;

    /* renamed from: c, reason: collision with root package name */
    public final x f1076c;

    public m(Context context, int i) {
        super(context, i);
        this.f1075b = new C0134e(this);
        this.f1076c = new x(new B0.q(8, this));
    }

    public static void a(m mVar) {
        X0.d.e(mVar, "this$0");
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        X0.d.e(view, "view");
        e();
        super.addContentView(view, layoutParams);
    }

    @Override // h0.InterfaceC0135f
    public final C0133d b() {
        return this.f1075b.f2379b;
    }

    public final androidx.lifecycle.t c() {
        androidx.lifecycle.t tVar = this.f1074a;
        if (tVar != null) {
            return tVar;
        }
        androidx.lifecycle.t tVar2 = new androidx.lifecycle.t(this);
        this.f1074a = tVar2;
        return tVar2;
    }

    @Override // androidx.lifecycle.r
    public final androidx.lifecycle.t d() {
        return c();
    }

    public final void e() {
        Window window = getWindow();
        X0.d.b(window);
        View decorView = window.getDecorView();
        X0.d.d(decorView, "window!!.decorView");
        H.f(decorView, this);
        Window window2 = getWindow();
        X0.d.b(window2);
        View decorView2 = window2.getDecorView();
        X0.d.d(decorView2, "window!!.decorView");
        q1.l.T(decorView2, this);
        Window window3 = getWindow();
        X0.d.b(window3);
        View decorView3 = window3.getDecorView();
        X0.d.d(decorView3, "window!!.decorView");
        q1.d.k0(decorView3, this);
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        this.f1076c.b();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            X0.d.d(onBackInvokedDispatcher, "onBackInvokedDispatcher");
            x xVar = this.f1076c;
            xVar.getClass();
            xVar.f1103e = onBackInvokedDispatcher;
            xVar.c(xVar.f1105g);
        }
        this.f1075b.b(bundle);
        c().d(EnumC0069l.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        X0.d.d(onSaveInstanceState, "super.onSaveInstanceState()");
        this.f1075b.c(onSaveInstanceState);
        return onSaveInstanceState;
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        c().d(EnumC0069l.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        c().d(EnumC0069l.ON_DESTROY);
        this.f1074a = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        e();
        super.setContentView(i);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        X0.d.e(view, "view");
        e();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        X0.d.e(view, "view");
        e();
        super.setContentView(view, layoutParams);
    }
}
