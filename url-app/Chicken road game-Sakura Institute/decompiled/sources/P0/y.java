package P0;

import A.V;
import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.C0483x;
import androidx.lifecycle.EnumC0474n;
import androidx.lifecycle.InterfaceC0481v;
import androidx.lifecycle.M;
import com.chicken.road.kedro.laqer.R;
import java.util.UUID;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import l.AbstractC0784j;
import n.AbstractC0864b;
import v1.C1248e;
import v1.InterfaceC1249f;
import y2.C1338m;

/* loaded from: classes.dex */
public final class y extends Dialog implements InterfaceC0481v, b.E, InterfaceC1249f {

    /* renamed from: d, reason: collision with root package name */
    public C0483x f3772d;

    /* renamed from: e, reason: collision with root package name */
    public final V f3773e;

    /* renamed from: i, reason: collision with root package name */
    public final b.D f3774i;

    /* renamed from: j, reason: collision with root package name */
    public Function0 f3775j;

    /* renamed from: k, reason: collision with root package name */
    public w f3776k;

    /* renamed from: l, reason: collision with root package name */
    public final View f3777l;

    /* renamed from: m, reason: collision with root package name */
    public final v f3778m;

    /* renamed from: n, reason: collision with root package name */
    public final int f3779n;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public y(Function0 function0, w wVar, View view, M0.k kVar, M0.b bVar, UUID uuid) {
        super(context, 0);
        Context context = view.getContext();
        if (Build.VERSION.SDK_INT < 31) {
            wVar.getClass();
        }
        ContextThemeWrapper context2 = new ContextThemeWrapper(context, R.style.DialogWindowTheme);
        Intrinsics.checkNotNullParameter(context2, "context");
        Intrinsics.checkNotNullParameter(this, "owner");
        this.f3773e = new V(this);
        this.f3774i = new b.D(new C.t(6, this));
        this.f3775j = function0;
        this.f3776k = wVar;
        this.f3777l = view;
        float f4 = 8;
        Window window = getWindow();
        if (window == null) {
            throw new IllegalStateException("Dialog has no window");
        }
        this.f3779n = window.getAttributes().softInputMode & 240;
        window.requestFeature(1);
        window.setBackgroundDrawableResource(android.R.color.transparent);
        this.f3776k.getClass();
        u3.l.t0(window, true);
        v vVar = new v(getContext(), window);
        vVar.setTag(R.id.compose_view_saveable_id_tag, "Dialog:" + uuid);
        vVar.setClipChildren(false);
        vVar.setElevation(bVar.L(f4));
        vVar.setOutlineProvider(new x(0));
        this.f3778m = vVar;
        View decorView = window.getDecorView();
        ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
        if (viewGroup != null) {
            d(viewGroup);
        }
        setContentView(vVar);
        M.i(vVar, M.f(view));
        M.j(vVar, M.g(view));
        AbstractC0864b.B(vVar, AbstractC0864b.q(view));
        h(this.f3775j, this.f3776k, kVar);
        b.D d4 = this.f3774i;
        C0260b onBackPressed = new C0260b(this, 1);
        Intrinsics.checkNotNullParameter(d4, "<this>");
        Intrinsics.checkNotNullParameter(onBackPressed, "onBackPressed");
        d4.a(this, new B1.v(true, onBackPressed));
    }

    public static void a(y this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        super.onBackPressed();
    }

    public static final void d(ViewGroup viewGroup) {
        viewGroup.setClipChildren(false);
        if (viewGroup instanceof v) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            ViewGroup viewGroup2 = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
            if (viewGroup2 != null) {
                d(viewGroup2);
            }
        }
    }

    @Override // android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        Intrinsics.checkNotNullParameter(view, "view");
        g();
        super.addContentView(view, layoutParams);
    }

    @Override // b.E
    public final b.D b() {
        return this.f3774i;
    }

    @Override // v1.InterfaceC1249f
    public final C1248e c() {
        return (C1248e) this.f3773e.f63d;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
    }

    @Override // androidx.lifecycle.InterfaceC0481v
    public final C0483x e() {
        return f();
    }

    public final C0483x f() {
        C0483x c0483x = this.f3772d;
        if (c0483x != null) {
            return c0483x;
        }
        C0483x c0483x2 = new C0483x(this);
        this.f3772d = c0483x2;
        return c0483x2;
    }

    public final void g() {
        Window window = getWindow();
        Intrinsics.c(window);
        View decorView = window.getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "window!!.decorView");
        M.i(decorView, this);
        Window window2 = getWindow();
        Intrinsics.c(window2);
        View decorView2 = window2.getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView2, "window!!.decorView");
        Intrinsics.checkNotNullParameter(decorView2, "<this>");
        Intrinsics.checkNotNullParameter(this, "onBackPressedDispatcherOwner");
        decorView2.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        Window window3 = getWindow();
        Intrinsics.c(window3);
        View decorView3 = window3.getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView3, "window!!.decorView");
        AbstractC0864b.B(decorView3, this);
    }

    public final void h(Function0 function0, w wVar, M0.k kVar) {
        Window window;
        Window window2;
        this.f3775j = function0;
        this.f3776k = wVar;
        wVar.getClass();
        boolean b4 = o.b(this.f3777l);
        int i2 = 1;
        int d4 = AbstractC0784j.d(1);
        if (d4 != 0) {
            if (d4 == 1) {
                b4 = true;
            } else {
                if (d4 != 2) {
                    throw new C1338m();
                }
                b4 = false;
            }
        }
        Window window3 = getWindow();
        Intrinsics.c(window3);
        window3.setFlags(b4 ? 8192 : -8193, 8192);
        int ordinal = kVar.ordinal();
        if (ordinal == 0) {
            i2 = 0;
        } else if (ordinal != 1) {
            throw new C1338m();
        }
        v vVar = this.f3778m;
        vVar.setLayoutDirection(i2);
        boolean z4 = wVar.f3770c;
        if (z4 && !vVar.f3766q && (window2 = getWindow()) != null) {
            window2.setLayout(-2, -2);
        }
        vVar.f3766q = z4;
        if (Build.VERSION.SDK_INT >= 31 || (window = getWindow()) == null) {
            return;
        }
        window.setSoftInputMode(this.f3779n);
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        this.f3774i.c();
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        OnBackInvokedDispatcher invoker;
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            invoker = getOnBackInvokedDispatcher();
            Intrinsics.checkNotNullExpressionValue(invoker, "onBackInvokedDispatcher");
            b.D d4 = this.f3774i;
            d4.getClass();
            Intrinsics.checkNotNullParameter(invoker, "invoker");
            d4.f5518e = invoker;
            d4.d(d4.f5520g);
        }
        this.f3773e.f(bundle);
        f().d(EnumC0474n.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        Intrinsics.checkNotNullExpressionValue(onSaveInstanceState, "super.onSaveInstanceState()");
        this.f3773e.g(onSaveInstanceState);
        return onSaveInstanceState;
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        f().d(EnumC0474n.ON_RESUME);
    }

    @Override // android.app.Dialog
    public final void onStop() {
        f().d(EnumC0474n.ON_DESTROY);
        this.f3772d = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (onTouchEvent && this.f3776k.f3769b) {
            this.f3775j.invoke();
        }
        return onTouchEvent;
    }

    @Override // android.app.Dialog
    public final void setContentView(int i2) {
        g();
        super.setContentView(i2);
    }

    @Override // android.app.Dialog
    public final void setContentView(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        g();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        Intrinsics.checkNotNullParameter(view, "view");
        g();
        super.setContentView(view, layoutParams);
    }
}
