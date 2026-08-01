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
import m.C0227a;

/* loaded from: classes.dex */
public class m extends Dialog implements androidx.lifecycle.r, y, j0.f {

    /* renamed from: a, reason: collision with root package name */
    public androidx.lifecycle.t f1274a;

    /* renamed from: b, reason: collision with root package name */
    public final j0.e f1275b;

    /* renamed from: c, reason: collision with root package name */
    public final x f1276c;

    public m(Context context, int i) {
        super(context, i);
        this.f1275b = new j0.e(this);
        this.f1276c = new x(new B.a(9, this));
    }

    public static void a(m mVar) {
        g1.d.e(mVar, "this$0");
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        g1.d.e(view, "view");
        d();
        super.addContentView(view, layoutParams);
    }

    public final androidx.lifecycle.t b() {
        androidx.lifecycle.t tVar = this.f1274a;
        if (tVar != null) {
            return tVar;
        }
        androidx.lifecycle.t tVar2 = new androidx.lifecycle.t(this);
        this.f1274a = tVar2;
        return tVar2;
    }

    @Override // j0.f
    public final j0.d c() {
        return this.f1275b.f2686b;
    }

    public final void d() {
        Window window = getWindow();
        g1.d.b(window);
        View decorView = window.getDecorView();
        g1.d.d(decorView, "window!!.decorView");
        H.f(decorView, this);
        Window window2 = getWindow();
        g1.d.b(window2);
        View decorView2 = window2.getDecorView();
        g1.d.d(decorView2, "window!!.decorView");
        z1.d.U(decorView2, this);
        Window window3 = getWindow();
        g1.d.b(window3);
        View decorView3 = window3.getDecorView();
        g1.d.d(decorView3, "window!!.decorView");
        C0227a.p(decorView3, this);
    }

    @Override // androidx.lifecycle.r
    public final androidx.lifecycle.t f() {
        return b();
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        this.f1276c.b();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            g1.d.d(onBackInvokedDispatcher, "onBackInvokedDispatcher");
            x xVar = this.f1276c;
            xVar.getClass();
            xVar.f1303e = onBackInvokedDispatcher;
            xVar.c(xVar.f1305g);
        }
        this.f1275b.b(bundle);
        b().d(EnumC0069l.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        g1.d.d(onSaveInstanceState, "super.onSaveInstanceState()");
        this.f1275b.c(onSaveInstanceState);
        return onSaveInstanceState;
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        b().d(EnumC0069l.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        b().d(EnumC0069l.ON_DESTROY);
        this.f1274a = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        d();
        super.setContentView(i);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        g1.d.e(view, "view");
        d();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        g1.d.e(view, "view");
        d();
        super.setContentView(view, layoutParams);
    }
}
