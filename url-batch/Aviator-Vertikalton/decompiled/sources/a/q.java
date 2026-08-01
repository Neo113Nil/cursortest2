package a;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.AbstractC0082o;
import androidx.lifecycle.C0088v;
import androidx.lifecycle.EnumC0080m;
import androidx.lifecycle.InterfaceC0086t;
import androidx.lifecycle.J;

/* loaded from: classes.dex */
public class q extends Dialog implements InterfaceC0086t, C, g0.f {

    /* renamed from: a, reason: collision with root package name */
    public C0088v f924a;

    /* renamed from: b, reason: collision with root package name */
    public final g0.e f925b;

    /* renamed from: c, reason: collision with root package name */
    public final C0039B f926c;

    public q(Context context, int i) {
        super(context, i);
        this.f925b = new g0.e(this);
        this.f926c = new C0039B(new B0.q(7, this));
    }

    public static void a(q qVar) {
        X0.f.e(qVar, "this$0");
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        X0.f.e(view, "view");
        c();
        super.addContentView(view, layoutParams);
    }

    public final C0088v b() {
        C0088v c0088v = this.f924a;
        if (c0088v != null) {
            return c0088v;
        }
        C0088v c0088v2 = new C0088v(this);
        this.f924a = c0088v2;
        return c0088v2;
    }

    public final void c() {
        Window window = getWindow();
        X0.f.b(window);
        View decorView = window.getDecorView();
        X0.f.d(decorView, "window!!.decorView");
        J.f(decorView, this);
        Window window2 = getWindow();
        X0.f.b(window2);
        View decorView2 = window2.getDecorView();
        X0.f.d(decorView2, "window!!.decorView");
        q1.l.i0(decorView2, this);
        Window window3 = getWindow();
        X0.f.b(window3);
        View decorView3 = window3.getDecorView();
        X0.f.d(decorView3, "window!!.decorView");
        q1.l.j0(decorView3, this);
    }

    @Override // androidx.lifecycle.InterfaceC0086t
    public final AbstractC0082o getLifecycle() {
        return b();
    }

    @Override // g0.f
    public final g0.d getSavedStateRegistry() {
        return this.f925b.f2615b;
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        this.f926c.b();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            X0.f.d(onBackInvokedDispatcher, "onBackInvokedDispatcher");
            C0039B c0039b = this.f926c;
            c0039b.getClass();
            c0039b.f896e = onBackInvokedDispatcher;
            c0039b.c(c0039b.f898g);
        }
        this.f925b.b(bundle);
        b().e(EnumC0080m.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        X0.f.d(onSaveInstanceState, "super.onSaveInstanceState()");
        this.f925b.c(onSaveInstanceState);
        return onSaveInstanceState;
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        b().e(EnumC0080m.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        b().e(EnumC0080m.ON_DESTROY);
        this.f924a = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        c();
        super.setContentView(i);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        X0.f.e(view, "view");
        c();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        X0.f.e(view, "view");
        c();
        super.setContentView(view, layoutParams);
    }
}
