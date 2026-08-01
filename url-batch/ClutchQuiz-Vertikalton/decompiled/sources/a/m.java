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

/* loaded from: classes.dex */
public class m extends Dialog implements androidx.lifecycle.t, y, h0.f {

    /* renamed from: a, reason: collision with root package name */
    public androidx.lifecycle.v f1213a;

    /* renamed from: b, reason: collision with root package name */
    public final h0.e f1214b;

    /* renamed from: c, reason: collision with root package name */
    public final x f1215c;

    public m(Context context, int i) {
        super(context, i);
        this.f1214b = new h0.e(this);
        this.f1215c = new x(new B0.b(8, this));
    }

    public static void a(m mVar) {
        g1.f.e(mVar, "this$0");
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        g1.f.e(view, "view");
        e();
        super.addContentView(view, layoutParams);
    }

    @Override // h0.f
    public final h0.d b() {
        return this.f1214b.f2580b;
    }

    public final androidx.lifecycle.v c() {
        androidx.lifecycle.v vVar = this.f1213a;
        if (vVar != null) {
            return vVar;
        }
        androidx.lifecycle.v vVar2 = new androidx.lifecycle.v(this);
        this.f1213a = vVar2;
        return vVar2;
    }

    @Override // androidx.lifecycle.t
    public final androidx.lifecycle.v d() {
        return c();
    }

    public final void e() {
        Window window = getWindow();
        g1.f.b(window);
        View decorView = window.getDecorView();
        g1.f.d(decorView, "window!!.decorView");
        J.g(decorView, this);
        Window window2 = getWindow();
        g1.f.b(window2);
        View decorView2 = window2.getDecorView();
        g1.f.d(decorView2, "window!!.decorView");
        T.d.N(decorView2, this);
        Window window3 = getWindow();
        g1.f.b(window3);
        View decorView3 = window3.getDecorView();
        g1.f.d(decorView3, "window!!.decorView");
        h0.g.k(decorView3, this);
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        this.f1215c.c();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            g1.f.d(onBackInvokedDispatcher, "onBackInvokedDispatcher");
            x xVar = this.f1215c;
            xVar.getClass();
            xVar.f1239e = onBackInvokedDispatcher;
            xVar.d(xVar.f1241g);
        }
        this.f1214b.b(bundle);
        c().d(EnumC0071l.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        g1.f.d(onSaveInstanceState, "super.onSaveInstanceState()");
        this.f1214b.c(onSaveInstanceState);
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
        this.f1213a = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        e();
        super.setContentView(i);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        g1.f.e(view, "view");
        e();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        g1.f.e(view, "view");
        e();
        super.setContentView(view, layoutParams);
    }
}
