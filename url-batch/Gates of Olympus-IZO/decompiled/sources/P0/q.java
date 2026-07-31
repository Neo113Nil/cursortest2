package P0;

import E.u;
import Z.r;
import a.AbstractC0157a;
import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.C0238x;
import androidx.lifecycle.EnumC0229n;
import androidx.lifecycle.InterfaceC0236v;
import androidx.lifecycle.P;
import b.F;
import b.G;
import com.gates.olympus.miruv.R;
import f.AbstractC0382a;
import java.util.UUID;
import m.AbstractC0600j;

/* loaded from: classes.dex */
public final class q extends Dialog implements InterfaceC0236v, G, u1.f {

    /* renamed from: d, reason: collision with root package name */
    public C0238x f3058d;

    /* renamed from: e, reason: collision with root package name */
    public final r f3059e;

    /* renamed from: f, reason: collision with root package name */
    public final F f3060f;

    /* renamed from: g, reason: collision with root package name */
    public Y1.a f3061g;

    /* renamed from: h, reason: collision with root package name */
    public o f3062h;

    /* renamed from: i, reason: collision with root package name */
    public final View f3063i;

    /* renamed from: j, reason: collision with root package name */
    public final n f3064j;

    /* renamed from: k, reason: collision with root package name */
    public final int f3065k;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public q(Y1.a aVar, o oVar, View view, M0.j jVar, M0.b bVar, UUID uuid) {
        super(new ContextThemeWrapper(r1, R.style.DialogWindowTheme), 0);
        Context context = view.getContext();
        if (Build.VERSION.SDK_INT < 31) {
            oVar.getClass();
        }
        this.f3059e = new r(this);
        F f3 = new F(new u(5, this));
        this.f3060f = f3;
        this.f3061g = aVar;
        this.f3062h = oVar;
        this.f3063i = view;
        float f4 = 8;
        Window window = getWindow();
        if (window == null) {
            throw new IllegalStateException("Dialog has no window");
        }
        this.f3065k = window.getAttributes().softInputMode & 240;
        window.requestFeature(1);
        window.setBackgroundDrawableResource(android.R.color.transparent);
        this.f3062h.getClass();
        AbstractC0157a.T(window, true);
        n nVar = new n(getContext(), window);
        nVar.setTag(R.id.compose_view_saveable_id_tag, "Dialog:" + uuid);
        nVar.setClipChildren(false);
        nVar.setElevation(bVar.F(f4));
        nVar.setOutlineProvider(new p(0));
        this.f3064j = nVar;
        View decorView = window.getDecorView();
        ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
        if (viewGroup != null) {
            d(viewGroup);
        }
        setContentView(nVar);
        nVar.setTag(R.id.view_tree_lifecycle_owner, P.f(view));
        nVar.setTag(R.id.view_tree_view_model_store_owner, P.g(view));
        nVar.setTag(R.id.view_tree_saved_state_registry_owner, AbstractC0382a.k(view));
        h(this.f3061g, this.f3062h, jVar);
        f3.a(this, new D1.r(true, new b(this, 1)));
    }

    public static void a(q qVar) {
        Z1.i.f(qVar, "this$0");
        super.onBackPressed();
    }

    public static final void d(ViewGroup viewGroup) {
        viewGroup.setClipChildren(false);
        if (viewGroup instanceof n) {
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
        Z1.i.f(view, "view");
        g();
        super.addContentView(view, layoutParams);
    }

    @Override // b.G
    public final F b() {
        return this.f3060f;
    }

    @Override // u1.f
    public final u1.e c() {
        return (u1.e) this.f3059e.f3455c;
    }

    @Override // androidx.lifecycle.InterfaceC0236v
    public final C0238x e() {
        return f();
    }

    public final C0238x f() {
        C0238x c0238x = this.f3058d;
        if (c0238x != null) {
            return c0238x;
        }
        C0238x c0238x2 = new C0238x(this);
        this.f3058d = c0238x2;
        return c0238x2;
    }

    public final void g() {
        Window window = getWindow();
        Z1.i.c(window);
        View decorView = window.getDecorView();
        Z1.i.e(decorView, "window!!.decorView");
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        Window window2 = getWindow();
        Z1.i.c(window2);
        View decorView2 = window2.getDecorView();
        Z1.i.e(decorView2, "window!!.decorView");
        decorView2.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        Window window3 = getWindow();
        Z1.i.c(window3);
        View decorView3 = window3.getDecorView();
        Z1.i.e(decorView3, "window!!.decorView");
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
    }

    public final void h(Y1.a aVar, o oVar, M0.j jVar) {
        Window window;
        Window window2;
        this.f3061g = aVar;
        this.f3062h = oVar;
        oVar.getClass();
        int i3 = j.f3044a;
        ViewGroup.LayoutParams layoutParams = this.f3063i.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        int i4 = 1;
        boolean z3 = (layoutParams2 == null || (layoutParams2.flags & 8192) == 0) ? false : true;
        int a3 = AbstractC0600j.a(1);
        if (a3 != 0) {
            if (a3 == 1) {
                z3 = true;
            } else {
                if (a3 != 2) {
                    throw new L1.f();
                }
                z3 = false;
            }
        }
        Window window3 = getWindow();
        Z1.i.c(window3);
        window3.setFlags(z3 ? 8192 : -8193, 8192);
        int ordinal = jVar.ordinal();
        if (ordinal == 0) {
            i4 = 0;
        } else if (ordinal != 1) {
            throw new L1.f();
        }
        n nVar = this.f3064j;
        nVar.setLayoutDirection(i4);
        boolean z4 = oVar.f3056c;
        if (z4 && !nVar.f3052n && (window2 = getWindow()) != null) {
            window2.setLayout(-2, -2);
        }
        nVar.f3052n = z4;
        if (Build.VERSION.SDK_INT >= 31 || (window = getWindow()) == null) {
            return;
        }
        window.setSoftInputMode(this.f3065k);
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        this.f3060f.c();
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            Z1.i.e(onBackInvokedDispatcher, "onBackInvokedDispatcher");
            F f3 = this.f3060f;
            f3.getClass();
            f3.f4136e = onBackInvokedDispatcher;
            f3.d(f3.f4138g);
        }
        this.f3059e.e(bundle);
        f().d(EnumC0229n.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        Z1.i.e(onSaveInstanceState, "super.onSaveInstanceState()");
        this.f3059e.f(onSaveInstanceState);
        return onSaveInstanceState;
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        f().d(EnumC0229n.ON_RESUME);
    }

    @Override // android.app.Dialog
    public final void onStop() {
        f().d(EnumC0229n.ON_DESTROY);
        this.f3058d = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (onTouchEvent && this.f3062h.f3055b) {
            this.f3061g.b();
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
        Z1.i.f(view, "view");
        g();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        Z1.i.f(view, "view");
        g();
        super.setContentView(view, layoutParams);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
    }
}
