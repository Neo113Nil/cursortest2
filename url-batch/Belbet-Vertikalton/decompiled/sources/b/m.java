package b;

import a.AbstractC0058a;
import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.EnumC0077l;
import androidx.lifecycle.J;

/* loaded from: classes.dex */
public class m extends Dialog implements androidx.lifecycle.t, x, j0.f {

    /* renamed from: a, reason: collision with root package name */
    public androidx.lifecycle.v f2191a;

    /* renamed from: b, reason: collision with root package name */
    public final j0.e f2192b;

    /* renamed from: c, reason: collision with root package name */
    public final w f2193c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Context context, int i) {
        super(context, i);
        j1.h.e(context, "context");
        this.f2192b = new j0.e(this);
        this.f2193c = new w(new A0.b(11, this));
    }

    public static void a(m mVar) {
        j1.h.e(mVar, "this$0");
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        j1.h.e(view, "view");
        d();
        super.addContentView(view, layoutParams);
    }

    @Override // j0.f
    public final j0.d b() {
        return this.f2192b.f3167b;
    }

    public final androidx.lifecycle.v c() {
        androidx.lifecycle.v vVar = this.f2191a;
        if (vVar != null) {
            return vVar;
        }
        androidx.lifecycle.v vVar2 = new androidx.lifecycle.v(this);
        this.f2191a = vVar2;
        return vVar2;
    }

    public final void d() {
        Window window = getWindow();
        j1.h.b(window);
        View decorView = window.getDecorView();
        j1.h.d(decorView, "window!!.decorView");
        J.g(decorView, this);
        Window window2 = getWindow();
        j1.h.b(window2);
        View decorView2 = window2.getDecorView();
        j1.h.d(decorView2, "window!!.decorView");
        H1.d.b0(decorView2, this);
        Window window3 = getWindow();
        j1.h.b(window3);
        View decorView3 = window3.getDecorView();
        j1.h.d(decorView3, "window!!.decorView");
        AbstractC0058a.Y(decorView3, this);
    }

    @Override // androidx.lifecycle.t
    public final androidx.lifecycle.v e() {
        return c();
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        this.f2193c.b();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            j1.h.d(onBackInvokedDispatcher, "onBackInvokedDispatcher");
            w wVar = this.f2193c;
            wVar.getClass();
            wVar.e = onBackInvokedDispatcher;
            wVar.c(wVar.f2218g);
        }
        this.f2192b.b(bundle);
        c().d(EnumC0077l.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        j1.h.d(onSaveInstanceState, "super.onSaveInstanceState()");
        this.f2192b.c(onSaveInstanceState);
        return onSaveInstanceState;
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        c().d(EnumC0077l.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        c().d(EnumC0077l.ON_DESTROY);
        this.f2191a = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        d();
        super.setContentView(i);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        j1.h.e(view, "view");
        d();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        j1.h.e(view, "view");
        d();
        super.setContentView(view, layoutParams);
    }
}
