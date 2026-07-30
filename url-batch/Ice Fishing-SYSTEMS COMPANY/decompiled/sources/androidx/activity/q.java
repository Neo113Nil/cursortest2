package androidx.activity;

import D.RunnableC0281a;
import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.AbstractC0508p;
import androidx.lifecycle.C0515x;
import androidx.lifecycle.EnumC0506n;
import androidx.lifecycle.InterfaceC0513v;
import com.icefishing.icefishingliveapp.C5284R;
import x0.C5202c;
import x0.C5203d;
import x0.InterfaceC5204e;

/* loaded from: classes.dex */
public class q extends Dialog implements InterfaceC0513v, InterfaceC5204e {

    /* renamed from: n, reason: collision with root package name */
    public C0515x f4576n;

    /* renamed from: u, reason: collision with root package name */
    public final C5203d f4577u;

    /* renamed from: v, reason: collision with root package name */
    public final G f4578v;

    public q(Context context, int i) {
        super(context, i);
        this.f4577u = new C5203d(this);
        this.f4578v = new G(new RunnableC0281a(11, this));
    }

    public static void a(q qVar) {
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        kotlin.jvm.internal.h.e(view, "view");
        b();
        super.addContentView(view, layoutParams);
    }

    public final void b() {
        Window window = getWindow();
        kotlin.jvm.internal.h.b(window);
        View decorView = window.getDecorView();
        kotlin.jvm.internal.h.d(decorView, "window!!.decorView");
        decorView.setTag(C5284R.id.view_tree_lifecycle_owner, this);
        Window window2 = getWindow();
        kotlin.jvm.internal.h.b(window2);
        View decorView2 = window2.getDecorView();
        kotlin.jvm.internal.h.d(decorView2, "window!!.decorView");
        decorView2.setTag(C5284R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        Window window3 = getWindow();
        kotlin.jvm.internal.h.b(window3);
        View decorView3 = window3.getDecorView();
        kotlin.jvm.internal.h.d(decorView3, "window!!.decorView");
        decorView3.setTag(C5284R.id.view_tree_saved_state_registry_owner, this);
    }

    @Override // androidx.lifecycle.InterfaceC0513v
    public final AbstractC0508p getLifecycle() {
        C0515x c0515x = this.f4576n;
        if (c0515x != null) {
            return c0515x;
        }
        C0515x c0515x2 = new C0515x(this);
        this.f4576n = c0515x2;
        return c0515x2;
    }

    @Override // x0.InterfaceC5204e
    public final C5202c getSavedStateRegistry() {
        return this.f4577u.f41773b;
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        this.f4578v.c();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            kotlin.jvm.internal.h.d(onBackInvokedDispatcher, "onBackInvokedDispatcher");
            G g9 = this.f4578v;
            g9.f4542e = onBackInvokedDispatcher;
            g9.d(g9.f4544g);
        }
        this.f4577u.b(bundle);
        C0515x c0515x = this.f4576n;
        if (c0515x == null) {
            c0515x = new C0515x(this);
            this.f4576n = c0515x;
        }
        c0515x.e(EnumC0506n.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        kotlin.jvm.internal.h.d(onSaveInstanceState, "super.onSaveInstanceState()");
        this.f4577u.c(onSaveInstanceState);
        return onSaveInstanceState;
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        C0515x c0515x = this.f4576n;
        if (c0515x == null) {
            c0515x = new C0515x(this);
            this.f4576n = c0515x;
        }
        c0515x.e(EnumC0506n.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        C0515x c0515x = this.f4576n;
        if (c0515x == null) {
            c0515x = new C0515x(this);
            this.f4576n = c0515x;
        }
        c0515x.e(EnumC0506n.ON_DESTROY);
        this.f4576n = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        b();
        super.setContentView(i);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        kotlin.jvm.internal.h.e(view, "view");
        b();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        kotlin.jvm.internal.h.e(view, "view");
        b();
        super.setContentView(view, layoutParams);
    }
}
