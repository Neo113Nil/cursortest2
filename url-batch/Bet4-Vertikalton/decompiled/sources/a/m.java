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
import androidx.lifecycle.H;
import m.C0260a;

/* loaded from: classes.dex */
public class m extends Dialog implements androidx.lifecycle.r, y, i0.f {

    /* renamed from: a, reason: collision with root package name */
    public androidx.lifecycle.t f1189a;

    /* renamed from: b, reason: collision with root package name */
    public final i0.e f1190b;

    /* renamed from: c, reason: collision with root package name */
    public final x f1191c;

    public m(Context context, int i) {
        super(context, i);
        this.f1190b = new i0.e(this);
        this.f1191c = new x(new D0.p(8, this));
    }

    public static void a(m mVar) {
        d1.d.e(mVar, "this$0");
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        d1.d.e(view, "view");
        e();
        super.addContentView(view, layoutParams);
    }

    @Override // i0.f
    public final i0.d b() {
        return this.f1190b.f2535b;
    }

    public final androidx.lifecycle.t c() {
        androidx.lifecycle.t tVar = this.f1189a;
        if (tVar != null) {
            return tVar;
        }
        androidx.lifecycle.t tVar2 = new androidx.lifecycle.t(this);
        this.f1189a = tVar2;
        return tVar2;
    }

    @Override // androidx.lifecycle.r
    public final androidx.lifecycle.t d() {
        return c();
    }

    public final void e() {
        Window window = getWindow();
        d1.d.b(window);
        View decorView = window.getDecorView();
        d1.d.d(decorView, "window!!.decorView");
        H.f(decorView, this);
        Window window2 = getWindow();
        d1.d.b(window2);
        View decorView2 = window2.getDecorView();
        d1.d.d(decorView2, "window!!.decorView");
        w1.d.j0(decorView2, this);
        Window window3 = getWindow();
        d1.d.b(window3);
        View decorView3 = window3.getDecorView();
        d1.d.d(decorView3, "window!!.decorView");
        C0260a.r(decorView3, this);
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        this.f1191c.b();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            d1.d.d(onBackInvokedDispatcher, "onBackInvokedDispatcher");
            x xVar = this.f1191c;
            xVar.getClass();
            xVar.f1218e = onBackInvokedDispatcher;
            xVar.c(xVar.f1220g);
        }
        this.f1190b.b(bundle);
        c().d(EnumC0071l.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        d1.d.d(onSaveInstanceState, "super.onSaveInstanceState()");
        this.f1190b.c(onSaveInstanceState);
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
        this.f1189a = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        e();
        super.setContentView(i);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        d1.d.e(view, "view");
        e();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        d1.d.e(view, "view");
        e();
        super.setContentView(view, layoutParams);
    }
}
