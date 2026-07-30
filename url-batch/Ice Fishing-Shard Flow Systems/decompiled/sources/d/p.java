package d;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.AbstractC0250p;
import androidx.lifecycle.C0258y;
import androidx.lifecycle.EnumC0248n;
import androidx.lifecycle.InterfaceC0256w;
import com.icefishing.icefish.ice.fishing.s294s.R;
import k0.C0593d;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public class p extends Dialog implements InterfaceC0256w, B, k0.f {

    /* renamed from: d, reason: collision with root package name */
    public C0258y f4590d;

    /* renamed from: e, reason: collision with root package name */
    public final k0.e f4591e;

    /* renamed from: i, reason: collision with root package name */
    public final C0349A f4592i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(Context context, int i2) {
        super(context, i2);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(this, "owner");
        this.f4591e = new k0.e(this);
        this.f4592i = new C0349A(new A.k(15, this));
    }

    public static void a(p this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        Intrinsics.checkNotNullParameter(view, "view");
        b();
        super.addContentView(view, layoutParams);
    }

    public final void b() {
        Window window = getWindow();
        Intrinsics.b(window);
        View decorView = window.getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "window!!.decorView");
        Intrinsics.checkNotNullParameter(decorView, "<this>");
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        Window window2 = getWindow();
        Intrinsics.b(window2);
        View decorView2 = window2.getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView2, "window!!.decorView");
        Intrinsics.checkNotNullParameter(decorView2, "<this>");
        Intrinsics.checkNotNullParameter(this, "onBackPressedDispatcherOwner");
        decorView2.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        Window window3 = getWindow();
        Intrinsics.b(window3);
        View decorView3 = window3.getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView3, "window!!.decorView");
        Intrinsics.checkNotNullParameter(decorView3, "<this>");
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
    }

    @Override // androidx.lifecycle.InterfaceC0256w
    public final AbstractC0250p getLifecycle() {
        C0258y c0258y = this.f4590d;
        if (c0258y != null) {
            return c0258y;
        }
        C0258y c0258y2 = new C0258y(this);
        this.f4590d = c0258y2;
        return c0258y2;
    }

    @Override // d.B
    public final C0349A getOnBackPressedDispatcher() {
        return this.f4592i;
    }

    @Override // k0.f
    public final C0593d getSavedStateRegistry() {
        return this.f4591e.f6029b;
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        this.f4592i.b();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        OnBackInvokedDispatcher invoker;
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            invoker = getOnBackInvokedDispatcher();
            Intrinsics.checkNotNullExpressionValue(invoker, "onBackInvokedDispatcher");
            C0349A c0349a = this.f4592i;
            c0349a.getClass();
            Intrinsics.checkNotNullParameter(invoker, "invoker");
            c0349a.f4563e = invoker;
            c0349a.c(c0349a.f4565g);
        }
        this.f4591e.b(bundle);
        C0258y c0258y = this.f4590d;
        if (c0258y == null) {
            c0258y = new C0258y(this);
            this.f4590d = c0258y;
        }
        c0258y.e(EnumC0248n.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        Intrinsics.checkNotNullExpressionValue(onSaveInstanceState, "super.onSaveInstanceState()");
        this.f4591e.c(onSaveInstanceState);
        return onSaveInstanceState;
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        C0258y c0258y = this.f4590d;
        if (c0258y == null) {
            c0258y = new C0258y(this);
            this.f4590d = c0258y;
        }
        c0258y.e(EnumC0248n.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        C0258y c0258y = this.f4590d;
        if (c0258y == null) {
            c0258y = new C0258y(this);
            this.f4590d = c0258y;
        }
        c0258y.e(EnumC0248n.ON_DESTROY);
        this.f4590d = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int i2) {
        b();
        super.setContentView(i2);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        b();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        Intrinsics.checkNotNullParameter(view, "view");
        b();
        super.setContentView(view, layoutParams);
    }
}
