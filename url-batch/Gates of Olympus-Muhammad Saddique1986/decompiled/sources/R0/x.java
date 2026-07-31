package R0;

import B.U;
import a.AbstractC0235a;
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
import androidx.lifecycle.C0294x;
import androidx.lifecycle.EnumC0285n;
import androidx.lifecycle.InterfaceC0292v;
import androidx.lifecycle.P;
import b.C0301E;
import b.InterfaceC0302F;
import com.gatesof.olympus.martu.marku.R;
import e2.InterfaceC0422a;
import java.util.UUID;
import m.AbstractC0625j;
import n.T;

/* loaded from: classes.dex */
public final class x extends Dialog implements InterfaceC0292v, InterfaceC0302F, y1.f {

    /* renamed from: d, reason: collision with root package name */
    public C0294x f4126d;

    /* renamed from: e, reason: collision with root package name */
    public final U f4127e;

    /* renamed from: f, reason: collision with root package name */
    public final C0301E f4128f;

    /* renamed from: g, reason: collision with root package name */
    public InterfaceC0422a f4129g;

    /* renamed from: h, reason: collision with root package name */
    public v f4130h;

    /* renamed from: i, reason: collision with root package name */
    public final View f4131i;

    /* renamed from: j, reason: collision with root package name */
    public final u f4132j;

    /* renamed from: k, reason: collision with root package name */
    public final int f4133k;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public x(InterfaceC0422a interfaceC0422a, v vVar, View view, O0.k kVar, O0.b bVar, UUID uuid) {
        super(new ContextThemeWrapper(r1, R.style.DialogWindowTheme), 0);
        Context context = view.getContext();
        if (Build.VERSION.SDK_INT < 31) {
            vVar.getClass();
        }
        this.f4127e = new U(this);
        C0301E c0301e = new C0301E(new E.t(6, this));
        this.f4128f = c0301e;
        this.f4129g = interfaceC0422a;
        this.f4130h = vVar;
        this.f4131i = view;
        float f3 = 8;
        Window window = getWindow();
        if (window == null) {
            throw new IllegalStateException("Dialog has no window");
        }
        this.f4133k = window.getAttributes().softInputMode & 240;
        window.requestFeature(1);
        window.setBackgroundDrawableResource(android.R.color.transparent);
        this.f4130h.getClass();
        AbstractC0235a.H(window, true);
        u uVar = new u(getContext(), window);
        uVar.setTag(R.id.compose_view_saveable_id_tag, "Dialog:" + uuid);
        uVar.setClipChildren(false);
        uVar.setElevation(bVar.J(f3));
        uVar.setOutlineProvider(new w(0));
        this.f4132j = uVar;
        View decorView = window.getDecorView();
        ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
        if (viewGroup != null) {
            d(viewGroup);
        }
        setContentView(uVar);
        P.k(uVar, P.f(view));
        uVar.setTag(R.id.view_tree_view_model_store_owner, P.g(view));
        uVar.setTag(R.id.view_tree_saved_state_registry_owner, T.l(view));
        h(this.f4129g, this.f4130h, kVar);
        c0301e.a(this, new L1.p(true, new C0213b(this, 1)));
    }

    public static void a(x xVar) {
        f2.j.f(xVar, "this$0");
        super.onBackPressed();
    }

    public static final void d(ViewGroup viewGroup) {
        viewGroup.setClipChildren(false);
        if (viewGroup instanceof u) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = viewGroup.getChildAt(i3);
            ViewGroup viewGroup2 = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
            if (viewGroup2 != null) {
                d(viewGroup2);
            }
        }
    }

    @Override // android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        f2.j.f(view, "view");
        g();
        super.addContentView(view, layoutParams);
    }

    @Override // b.InterfaceC0302F
    public final C0301E b() {
        return this.f4128f;
    }

    @Override // y1.f
    public final y1.e c() {
        return (y1.e) this.f4127e.f320d;
    }

    @Override // androidx.lifecycle.InterfaceC0292v
    public final C0294x e() {
        return f();
    }

    public final C0294x f() {
        C0294x c0294x = this.f4126d;
        if (c0294x != null) {
            return c0294x;
        }
        C0294x c0294x2 = new C0294x(this);
        this.f4126d = c0294x2;
        return c0294x2;
    }

    public final void g() {
        Window window = getWindow();
        f2.j.c(window);
        View decorView = window.getDecorView();
        f2.j.e(decorView, "window!!.decorView");
        P.k(decorView, this);
        Window window2 = getWindow();
        f2.j.c(window2);
        View decorView2 = window2.getDecorView();
        f2.j.e(decorView2, "window!!.decorView");
        decorView2.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        Window window3 = getWindow();
        f2.j.c(window3);
        View decorView3 = window3.getDecorView();
        f2.j.e(decorView3, "window!!.decorView");
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
    }

    public final void h(InterfaceC0422a interfaceC0422a, v vVar, O0.k kVar) {
        Window window;
        Window window2;
        this.f4129g = interfaceC0422a;
        this.f4130h = vVar;
        vVar.getClass();
        boolean b3 = n.b(this.f4131i);
        int i3 = 1;
        int b4 = AbstractC0625j.b(1);
        if (b4 != 0) {
            if (b4 == 1) {
                b3 = true;
            } else {
                if (b4 != 2) {
                    throw new C1.c();
                }
                b3 = false;
            }
        }
        Window window3 = getWindow();
        f2.j.c(window3);
        window3.setFlags(b3 ? 8192 : -8193, 8192);
        int ordinal = kVar.ordinal();
        if (ordinal == 0) {
            i3 = 0;
        } else if (ordinal != 1) {
            throw new C1.c();
        }
        u uVar = this.f4132j;
        uVar.setLayoutDirection(i3);
        boolean z3 = vVar.f4124c;
        if (z3 && !uVar.f4120n && (window2 = getWindow()) != null) {
            window2.setLayout(-2, -2);
        }
        uVar.f4120n = z3;
        if (Build.VERSION.SDK_INT >= 31 || (window = getWindow()) == null) {
            return;
        }
        window.setSoftInputMode(this.f4133k);
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        this.f4128f.c();
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            f2.j.e(onBackInvokedDispatcher, "onBackInvokedDispatcher");
            C0301E c0301e = this.f4128f;
            c0301e.getClass();
            c0301e.f5271e = onBackInvokedDispatcher;
            c0301e.d(c0301e.f5273g);
        }
        this.f4127e.f(bundle);
        f().d(EnumC0285n.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        f2.j.e(onSaveInstanceState, "super.onSaveInstanceState()");
        this.f4127e.g(onSaveInstanceState);
        return onSaveInstanceState;
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        f().d(EnumC0285n.ON_RESUME);
    }

    @Override // android.app.Dialog
    public final void onStop() {
        f().d(EnumC0285n.ON_DESTROY);
        this.f4126d = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (onTouchEvent && this.f4130h.f4123b) {
            this.f4129g.b();
        }
        return onTouchEvent;
    }

    @Override // android.app.Dialog
    public final void setContentView(int i3) {
        g();
        super.setContentView(i3);
    }

    @Override // android.app.Dialog
    public final void setContentView(View view) {
        f2.j.f(view, "view");
        g();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        f2.j.f(view, "view");
        g();
        super.setContentView(view, layoutParams);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
    }
}
