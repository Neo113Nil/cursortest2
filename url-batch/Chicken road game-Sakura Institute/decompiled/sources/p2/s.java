package p2;

import a0.s0;
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
import androidx.lifecycle.c0;
import androidx.lifecycle.q0;
import b.i0;
import b.j0;
import b.k0;
import com.android.installreferrer.R;
import java.util.UUID;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class s extends Dialog implements androidx.lifecycle.v, k0, x3.f {

    /* renamed from: f, reason: collision with root package name */
    public androidx.lifecycle.x f7163f;

    /* renamed from: g, reason: collision with root package name */
    public final s0 f7164g;

    /* renamed from: h, reason: collision with root package name */
    public final i0 f7165h;

    /* renamed from: i, reason: collision with root package name */
    public q6.a f7166i;

    /* renamed from: j, reason: collision with root package name */
    public r f7167j;

    /* renamed from: k, reason: collision with root package name */
    public final View f7168k;

    /* renamed from: l, reason: collision with root package name */
    public final q f7169l;

    /* renamed from: m, reason: collision with root package name */
    public final int f7170m;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public s(q6.a aVar, r rVar, View view, m2.k kVar, m2.b bVar, UUID uuid) {
        super(new ContextThemeWrapper(r1, R.style.DialogWindowTheme), 0);
        Context context = view.getContext();
        if (Build.VERSION.SDK_INT < 31) {
            rVar.getClass();
        }
        this.f7164g = new s0(this);
        this.f7165h = new i0(new c0(2, this));
        this.f7166i = aVar;
        this.f7167j = rVar;
        this.f7168k = view;
        float f9 = 8;
        Window window = getWindow();
        if (window == null) {
            throw new IllegalStateException("Dialog has no window");
        }
        this.f7170m = window.getAttributes().softInputMode & 240;
        window.requestFeature(1);
        window.setBackgroundDrawableResource(android.R.color.transparent);
        this.f7167j.getClass();
        a.a.H(window, true);
        q qVar = new q(getContext(), window);
        qVar.setTag(R.id.compose_view_saveable_id_tag, "Dialog:" + uuid);
        qVar.setClipChildren(false);
        qVar.setElevation(bVar.y(f9));
        qVar.setOutlineProvider(new c1.o(1));
        this.f7169l = qVar;
        View decorView = window.getDecorView();
        ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
        if (viewGroup != null) {
            d(viewGroup);
        }
        setContentView(qVar);
        q0.k(qVar, q0.f(view));
        qVar.setTag(R.id.view_tree_view_model_store_owner, q0.g(view));
        qVar.setTag(R.id.view_tree_saved_state_registry_owner, v1.g.i(view));
        g(this.f7166i, this.f7167j, kVar);
        i0 i0Var = this.f7165h;
        a aVar2 = new a(this, 1);
        r6.k.f(i0Var, "<this>");
        i0Var.a(this, new j0(0, aVar2));
    }

    public static void c(s sVar) {
        super.onBackPressed();
    }

    public static final void d(ViewGroup viewGroup) {
        viewGroup.setClipChildren(false);
        if (viewGroup instanceof q) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = viewGroup.getChildAt(i7);
            ViewGroup viewGroup2 = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
            if (viewGroup2 != null) {
                d(viewGroup2);
            }
        }
    }

    @Override // b.k0
    public final i0 a() {
        return this.f7165h;
    }

    @Override // android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        r6.k.f(view, "view");
        e();
        super.addContentView(view, layoutParams);
    }

    @Override // x3.f
    public final x3.e b() {
        return (x3.e) this.f7164g.f138d;
    }

    public final void e() {
        Window window = getWindow();
        r6.k.c(window);
        View decorView = window.getDecorView();
        r6.k.e(decorView, "window!!.decorView");
        q0.k(decorView, this);
        Window window2 = getWindow();
        r6.k.c(window2);
        View decorView2 = window2.getDecorView();
        r6.k.e(decorView2, "window!!.decorView");
        decorView2.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        Window window3 = getWindow();
        r6.k.c(window3);
        View decorView3 = window3.getDecorView();
        r6.k.e(decorView3, "window!!.decorView");
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
    }

    @Override // androidx.lifecycle.v
    public final androidx.lifecycle.x f() {
        androidx.lifecycle.x xVar = this.f7163f;
        if (xVar != null) {
            return xVar;
        }
        androidx.lifecycle.x xVar2 = new androidx.lifecycle.x(this);
        this.f7163f = xVar2;
        return xVar2;
    }

    public final void g(q6.a aVar, r rVar, m2.k kVar) {
        Window window;
        Window window2;
        this.f7166i = aVar;
        this.f7167j = rVar;
        rVar.getClass();
        boolean b9 = l.b(this.f7168k);
        int d8 = l.h.d(1);
        int i7 = 0;
        if (d8 != 0) {
            if (d8 == 1) {
                b9 = true;
            } else {
                if (d8 != 2) {
                    throw new b4.c();
                }
                b9 = false;
            }
        }
        Window window3 = getWindow();
        r6.k.c(window3);
        window3.setFlags(b9 ? 8192 : -8193, 8192);
        int ordinal = kVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                throw new b4.c();
            }
            i7 = 1;
        }
        q qVar = this.f7169l;
        qVar.setLayoutDirection(i7);
        if (!qVar.f7161p && (window2 = getWindow()) != null) {
            window2.setLayout(-2, -2);
        }
        qVar.f7161p = true;
        if (Build.VERSION.SDK_INT >= 31 || (window = getWindow()) == null) {
            return;
        }
        window.setSoftInputMode(this.f7170m);
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        this.f7165h.c();
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            r6.k.e(onBackInvokedDispatcher, "onBackInvokedDispatcher");
            i0 i0Var = this.f7165h;
            i0Var.getClass();
            i0Var.f1165e = onBackInvokedDispatcher;
            i0Var.d(i0Var.f1167g);
        }
        this.f7164g.g(bundle);
        androidx.lifecycle.x xVar = this.f7163f;
        if (xVar == null) {
            xVar = new androidx.lifecycle.x(this);
            this.f7163f = xVar;
        }
        xVar.d(androidx.lifecycle.n.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        r6.k.e(onSaveInstanceState, "super.onSaveInstanceState()");
        this.f7164g.h(onSaveInstanceState);
        return onSaveInstanceState;
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        androidx.lifecycle.x xVar = this.f7163f;
        if (xVar == null) {
            xVar = new androidx.lifecycle.x(this);
            this.f7163f = xVar;
        }
        xVar.d(androidx.lifecycle.n.ON_RESUME);
    }

    @Override // android.app.Dialog
    public final void onStop() {
        androidx.lifecycle.x xVar = this.f7163f;
        if (xVar == null) {
            xVar = new androidx.lifecycle.x(this);
            this.f7163f = xVar;
        }
        xVar.d(androidx.lifecycle.n.ON_DESTROY);
        this.f7163f = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (onTouchEvent) {
            this.f7167j.getClass();
            this.f7166i.a();
        }
        return onTouchEvent;
    }

    @Override // android.app.Dialog
    public final void setContentView(int i7) {
        e();
        super.setContentView(i7);
    }

    @Override // android.app.Dialog
    public final void setContentView(View view) {
        r6.k.f(view, "view");
        e();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        r6.k.f(view, "view");
        e();
        super.setContentView(view, layoutParams);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
    }
}
