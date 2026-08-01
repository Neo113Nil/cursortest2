package a;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.EnumC0071l;
import androidx.lifecycle.J;
import c1.AbstractC0091d;

/* loaded from: classes.dex */
public class m extends Dialog implements androidx.lifecycle.t, y, j0.f {

    /* renamed from: a, reason: collision with root package name */
    public androidx.lifecycle.v f1593a;

    /* renamed from: b, reason: collision with root package name */
    public final j0.e f1594b;

    /* renamed from: c, reason: collision with root package name */
    public final x f1595c;

    public m(Context context, int i) {
        super(context, i);
        this.f1594b = new j0.e(this);
        this.f1595c = new x(new E0.b(8, this));
    }

    public static void a(m mVar) {
        k1.e.e(mVar, "this$0");
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        k1.e.e(view, "view");
        d();
        super.addContentView(view, layoutParams);
    }

    @Override // j0.f
    public final j0.d b() {
        return this.f1594b.f3084b;
    }

    public final androidx.lifecycle.v c() {
        androidx.lifecycle.v vVar = this.f1593a;
        if (vVar != null) {
            return vVar;
        }
        androidx.lifecycle.v vVar2 = new androidx.lifecycle.v(this);
        this.f1593a = vVar2;
        return vVar2;
    }

    public final void d() {
        Window window = getWindow();
        k1.e.b(window);
        View decorView = window.getDecorView();
        k1.e.d(decorView, "window!!.decorView");
        J.g(decorView, this);
        Window window2 = getWindow();
        k1.e.b(window2);
        View decorView2 = window2.getDecorView();
        k1.e.d(decorView2, "window!!.decorView");
        H1.d.g0(decorView2, this);
        Window window3 = getWindow();
        k1.e.b(window3);
        View decorView3 = window3.getDecorView();
        k1.e.d(decorView3, "window!!.decorView");
        AbstractC0091d.t(decorView3, this);
    }

    @Override // androidx.lifecycle.t
    public final androidx.lifecycle.v e() {
        return c();
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        this.f1595c.b();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            k1.e.d(onBackInvokedDispatcher, "onBackInvokedDispatcher");
            x xVar = this.f1595c;
            xVar.getClass();
            xVar.f1619e = onBackInvokedDispatcher;
            xVar.c(xVar.f1621g);
        }
        this.f1594b.b(bundle);
        c().d(EnumC0071l.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        k1.e.d(onSaveInstanceState, "super.onSaveInstanceState()");
        this.f1594b.c(onSaveInstanceState);
        return onSaveInstanceState;
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        c().d(EnumC0071l.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        c().d(EnumC0071l.ON_DESTROY);
        this.f1593a = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        d();
        super.setContentView(i);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        k1.e.e(view, "view");
        d();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        k1.e.e(view, "view");
        d();
        super.setContentView(view, layoutParams);
    }
}
