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

/* loaded from: classes.dex */
public class m extends Dialog implements androidx.lifecycle.r, y, h0.f {

    /* renamed from: a, reason: collision with root package name */
    public androidx.lifecycle.t f1176a;

    /* renamed from: b, reason: collision with root package name */
    public final h0.e f1177b;

    /* renamed from: c, reason: collision with root package name */
    public final x f1178c;

    public m(Context context, int i) {
        super(context, i);
        this.f1177b = new h0.e(this);
        this.f1178c = new x(new C0.p(9, this));
    }

    public static void a(m mVar) {
        e1.d.e(mVar, "this$0");
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        e1.d.e(view, "view");
        e();
        super.addContentView(view, layoutParams);
    }

    @Override // h0.f
    public final h0.d b() {
        return this.f1177b.f2512b;
    }

    public final androidx.lifecycle.t c() {
        androidx.lifecycle.t tVar = this.f1176a;
        if (tVar != null) {
            return tVar;
        }
        androidx.lifecycle.t tVar2 = new androidx.lifecycle.t(this);
        this.f1176a = tVar2;
        return tVar2;
    }

    @Override // androidx.lifecycle.r
    public final androidx.lifecycle.t d() {
        return c();
    }

    public final void e() {
        Window window = getWindow();
        e1.d.b(window);
        View decorView = window.getDecorView();
        e1.d.d(decorView, "window!!.decorView");
        H.f(decorView, this);
        Window window2 = getWindow();
        e1.d.b(window2);
        View decorView2 = window2.getDecorView();
        e1.d.d(decorView2, "window!!.decorView");
        x1.d.c0(decorView2, this);
        Window window3 = getWindow();
        e1.d.b(window3);
        View decorView3 = window3.getDecorView();
        e1.d.d(decorView3, "window!!.decorView");
        x1.d.d0(decorView3, this);
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        this.f1178c.b();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            e1.d.d(onBackInvokedDispatcher, "onBackInvokedDispatcher");
            x xVar = this.f1178c;
            xVar.getClass();
            xVar.f1205e = onBackInvokedDispatcher;
            xVar.c(xVar.f1207g);
        }
        this.f1177b.b(bundle);
        c().d(EnumC0069l.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        e1.d.d(onSaveInstanceState, "super.onSaveInstanceState()");
        this.f1177b.c(onSaveInstanceState);
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
        this.f1176a = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        e();
        super.setContentView(i);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        e1.d.e(view, "view");
        e();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        e1.d.e(view, "view");
        e();
        super.setContentView(view, layoutParams);
    }
}
