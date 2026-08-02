package b;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.AbstractC0231j;
import androidx.lifecycle.C0237p;
import androidx.lifecycle.EnumC0229h;
import androidx.lifecycle.InterfaceC0235n;
import com.rockchicken.pump.up.road.R;
import m1.C1307e;
import m1.C1308f;

/* renamed from: b.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogC0254o extends Dialog implements InterfaceC0235n, InterfaceC0239B, m1.g {

    /* renamed from: a, reason: collision with root package name */
    public C0237p f5232a;

    /* renamed from: b, reason: collision with root package name */
    public final C1308f f5233b;

    /* renamed from: c, reason: collision with root package name */
    public final C0238A f5234c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogC0254o(Context context, int i4) {
        super(context, i4);
        kotlin.jvm.internal.i.e(context, "context");
        this.f5233b = new C1308f(this);
        this.f5234c = new C0238A(new R1.n(9, this));
    }

    public static void a(DialogC0254o dialogC0254o) {
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        kotlin.jvm.internal.i.e(view, "view");
        b();
        super.addContentView(view, layoutParams);
    }

    public final void b() {
        Window window = getWindow();
        kotlin.jvm.internal.i.b(window);
        View decorView = window.getDecorView();
        kotlin.jvm.internal.i.d(decorView, "window!!.decorView");
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        Window window2 = getWindow();
        kotlin.jvm.internal.i.b(window2);
        View decorView2 = window2.getDecorView();
        kotlin.jvm.internal.i.d(decorView2, "window!!.decorView");
        decorView2.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        Window window3 = getWindow();
        kotlin.jvm.internal.i.b(window3);
        View decorView3 = window3.getDecorView();
        kotlin.jvm.internal.i.d(decorView3, "window!!.decorView");
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
    }

    @Override // androidx.lifecycle.InterfaceC0235n
    public final AbstractC0231j getLifecycle() {
        C0237p c0237p = this.f5232a;
        if (c0237p != null) {
            return c0237p;
        }
        C0237p c0237p2 = new C0237p(this);
        this.f5232a = c0237p2;
        return c0237p2;
    }

    @Override // b.InterfaceC0239B
    public final C0238A getOnBackPressedDispatcher() {
        return this.f5234c;
    }

    @Override // m1.g
    public final C1307e getSavedStateRegistry() {
        return this.f5233b.f14495b;
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        this.f5234c.c();
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            kotlin.jvm.internal.i.d(onBackInvokedDispatcher, "onBackInvokedDispatcher");
            C0238A c0238a = this.f5234c;
            c0238a.getClass();
            c0238a.f5209e = onBackInvokedDispatcher;
            c0238a.d(c0238a.f5211g);
        }
        this.f5233b.b(bundle);
        C0237p c0237p = this.f5232a;
        if (c0237p == null) {
            c0237p = new C0237p(this);
            this.f5232a = c0237p;
        }
        c0237p.e(EnumC0229h.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        kotlin.jvm.internal.i.d(onSaveInstanceState, "super.onSaveInstanceState()");
        this.f5233b.c(onSaveInstanceState);
        return onSaveInstanceState;
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        C0237p c0237p = this.f5232a;
        if (c0237p == null) {
            c0237p = new C0237p(this);
            this.f5232a = c0237p;
        }
        c0237p.e(EnumC0229h.ON_RESUME);
    }

    @Override // android.app.Dialog
    public final void onStop() {
        C0237p c0237p = this.f5232a;
        if (c0237p == null) {
            c0237p = new C0237p(this);
            this.f5232a = c0237p;
        }
        c0237p.e(EnumC0229h.ON_DESTROY);
        this.f5232a = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public final void setContentView(int i4) {
        b();
        super.setContentView(i4);
    }

    @Override // android.app.Dialog
    public final void setContentView(View view) {
        kotlin.jvm.internal.i.e(view, "view");
        b();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        kotlin.jvm.internal.i.e(view, "view");
        b();
        super.setContentView(view, layoutParams);
    }
}
