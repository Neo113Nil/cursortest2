package a;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.EnumC0070l;
import androidx.lifecycle.H;

/* loaded from: classes.dex */
public class m extends Dialog implements androidx.lifecycle.r, y, h0.f {

    /* renamed from: a, reason: collision with root package name */
    public androidx.lifecycle.t f1107a;

    /* renamed from: b, reason: collision with root package name */
    public final h0.e f1108b;

    /* renamed from: c, reason: collision with root package name */
    public final x f1109c;

    public m(Context context, int i) {
        super(context, i);
        this.f1108b = new h0.e(this);
        this.f1109c = new x(new C0.p(9, this));
    }

    public static void a(m mVar) {
        Z0.d.e(mVar, "this$0");
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        Z0.d.e(view, "view");
        e();
        super.addContentView(view, layoutParams);
    }

    @Override // h0.f
    public final h0.d b() {
        return this.f1108b.f2459b;
    }

    public final androidx.lifecycle.t c() {
        androidx.lifecycle.t tVar = this.f1107a;
        if (tVar != null) {
            return tVar;
        }
        androidx.lifecycle.t tVar2 = new androidx.lifecycle.t(this);
        this.f1107a = tVar2;
        return tVar2;
    }

    @Override // androidx.lifecycle.r
    public final androidx.lifecycle.t d() {
        return c();
    }

    public final void e() {
        Window window = getWindow();
        Z0.d.b(window);
        View decorView = window.getDecorView();
        Z0.d.d(decorView, "window!!.decorView");
        H.f(decorView, this);
        Window window2 = getWindow();
        Z0.d.b(window2);
        View decorView2 = window2.getDecorView();
        Z0.d.d(decorView2, "window!!.decorView");
        s1.l.X(decorView2, this);
        Window window3 = getWindow();
        Z0.d.b(window3);
        View decorView3 = window3.getDecorView();
        Z0.d.d(decorView3, "window!!.decorView");
        s1.d.d0(decorView3, this);
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        this.f1109c.b();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            Z0.d.d(onBackInvokedDispatcher, "onBackInvokedDispatcher");
            x xVar = this.f1109c;
            xVar.getClass();
            xVar.f1136e = onBackInvokedDispatcher;
            xVar.c(xVar.f1138g);
        }
        this.f1108b.b(bundle);
        c().d(EnumC0070l.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        Z0.d.d(onSaveInstanceState, "super.onSaveInstanceState()");
        this.f1108b.c(onSaveInstanceState);
        return onSaveInstanceState;
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        c().d(EnumC0070l.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        c().d(EnumC0070l.ON_DESTROY);
        this.f1107a = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        e();
        super.setContentView(i);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        Z0.d.e(view, "view");
        e();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        Z0.d.e(view, "view");
        e();
        super.setContentView(view, layoutParams);
    }
}
