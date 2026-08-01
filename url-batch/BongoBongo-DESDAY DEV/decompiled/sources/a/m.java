package a;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.EnumC0078l;
import androidx.lifecycle.H;
import h.AbstractC0112a;

/* loaded from: classes.dex */
public class m extends Dialog implements androidx.lifecycle.r, y, j0.f {

    /* renamed from: a, reason: collision with root package name */
    public androidx.lifecycle.t f1265a;

    /* renamed from: b, reason: collision with root package name */
    public final j0.e f1266b;

    /* renamed from: c, reason: collision with root package name */
    public final x f1267c;

    public m(Context context, int i) {
        super(context, i);
        this.f1266b = new j0.e(this);
        this.f1267c = new x(new A.a(10, this));
    }

    public static void a(m mVar) {
        h1.d.e(mVar, "this$0");
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        h1.d.e(view, "view");
        e();
        super.addContentView(view, layoutParams);
    }

    @Override // j0.f
    public final j0.d b() {
        return this.f1266b.f2666b;
    }

    public final androidx.lifecycle.t c() {
        androidx.lifecycle.t tVar = this.f1265a;
        if (tVar != null) {
            return tVar;
        }
        androidx.lifecycle.t tVar2 = new androidx.lifecycle.t(this);
        this.f1265a = tVar2;
        return tVar2;
    }

    @Override // androidx.lifecycle.r
    public final androidx.lifecycle.t d() {
        return c();
    }

    public final void e() {
        Window window = getWindow();
        h1.d.b(window);
        View decorView = window.getDecorView();
        h1.d.d(decorView, "window!!.decorView");
        H.f(decorView, this);
        Window window2 = getWindow();
        h1.d.b(window2);
        View decorView2 = window2.getDecorView();
        h1.d.d(decorView2, "window!!.decorView");
        A1.m.c0(decorView2, this);
        Window window3 = getWindow();
        h1.d.b(window3);
        View decorView3 = window3.getDecorView();
        h1.d.d(decorView3, "window!!.decorView");
        AbstractC0112a.q(decorView3, this);
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        this.f1267c.b();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            h1.d.d(onBackInvokedDispatcher, "onBackInvokedDispatcher");
            x xVar = this.f1267c;
            xVar.getClass();
            xVar.f1294e = onBackInvokedDispatcher;
            xVar.c(xVar.f1296g);
        }
        this.f1266b.b(bundle);
        c().d(EnumC0078l.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        h1.d.d(onSaveInstanceState, "super.onSaveInstanceState()");
        this.f1266b.c(onSaveInstanceState);
        return onSaveInstanceState;
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        c().d(EnumC0078l.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        c().d(EnumC0078l.ON_DESTROY);
        this.f1265a = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        e();
        super.setContentView(i);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        h1.d.e(view, "view");
        e();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        h1.d.e(view, "view");
        e();
        super.setContentView(view, layoutParams);
    }
}
