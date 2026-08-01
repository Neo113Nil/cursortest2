package b3;

import android.app.Dialog;
import android.os.Build;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.o0;
import androidx.lifecycle.u;
import androidx.lifecycle.w;
import c6.s;
import com.appsflyer.R;
import d.c0;
import d.d0;
import d.e0;
import d.x;
import d.y;
import java.util.UUID;
import kotlin.collections.i0;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class q extends Dialog implements u, e0, s4.c, f5.e {

    /* renamed from: d, reason: collision with root package name */
    public w f1081d;

    /* renamed from: e, reason: collision with root package name */
    public final s f1082e;

    /* renamed from: i, reason: collision with root package name */
    public final hd.q f1083i;

    /* renamed from: r, reason: collision with root package name */
    public final hd.q f1084r;

    /* renamed from: s, reason: collision with root package name */
    public Function0 f1085s;

    /* renamed from: t, reason: collision with root package name */
    public o f1086t;

    /* renamed from: u, reason: collision with root package name */
    public final View f1087u;

    /* renamed from: v, reason: collision with root package name */
    public final n f1088v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f1089w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(Function0 function0, o oVar, View view, x2.l lVar, x2.c cVar, UUID uuid) {
        super(new ContextThemeWrapper(view.getContext(), oVar.f1078e ? R.style.DialogWindowTheme : R.style.FloatingDialogWindowTheme), 0);
        final int i3 = 0;
        this.f1082e = new s(new h5.b(this, new a1.b(10, this)));
        this.f1083i = hd.h.b(new Function0(this) { // from class: d.l

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ b3.q f3255e;

            {
                this.f3255e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        s4.a aVar = new s4.a();
                        this.f3255e.c().b(aVar);
                        return aVar;
                    default:
                        return new c0(new androidx.lifecycle.d0(9, this.f3255e));
                }
            }
        });
        final int i10 = 1;
        this.f1084r = hd.h.b(new Function0(this) { // from class: d.l

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ b3.q f3255e;

            {
                this.f3255e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        s4.a aVar = new s4.a();
                        this.f3255e.c().b(aVar);
                        return aVar;
                    default:
                        return new c0(new androidx.lifecycle.d0(9, this.f3255e));
                }
            }
        });
        this.f1085s = function0;
        this.f1086t = oVar;
        this.f1087u = view;
        float f3 = 8;
        Window window = getWindow();
        if (window == null) {
            i0.l("Dialog has no window");
            throw null;
        }
        o oVar2 = this.f1086t;
        Window window2 = getWindow();
        if (window2 != null) {
            WindowManager.LayoutParams attributes = window2.getAttributes();
            attributes.type = oVar2.g;
            window2.setAttributes(attributes);
        }
        window.requestFeature(1);
        window.setBackgroundDrawableResource(android.R.color.transparent);
        g8.b.J(window, this.f1086t.f1078e);
        window.setGravity(17);
        if (!this.f1086t.f1078e) {
            window.addFlags(65792);
            WindowManager.LayoutParams attributes2 = window.getAttributes();
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 28) {
                j.f1067a.a(attributes2);
            }
            if (i11 >= 30) {
                k kVar = k.f1068a;
                kVar.b(attributes2, 0);
                kVar.c(attributes2, 0);
            }
            window.setAttributes(attributes2);
        }
        n nVar = new n(getContext(), window);
        setTitle(this.f1086t.f1079f);
        nVar.setTag(R.id.compose_view_saveable_id_tag, "Dialog:" + uuid);
        nVar.setClipChildren(false);
        nVar.setElevation(cVar.n(f3));
        nVar.setOutlineProvider(new p(0));
        this.f1088v = nVar;
        View decorView = window.getDecorView();
        ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
        if (viewGroup != null) {
            e(viewGroup);
        }
        setContentView(nVar);
        nVar.setTag(R.id.view_tree_lifecycle_owner, o0.d(view));
        nVar.setTag(R.id.view_tree_view_model_store_owner, o0.e(view));
        nVar.setTag(R.id.view_tree_saved_state_registry_owner, g8.b.B(view));
        i(this.f1085s, this.f1086t, lVar);
        c0 a9 = a();
        b bVar = new b(this, i10);
        a9.getClass();
        d0 d0Var = new d0(bVar);
        final w g = g();
        if (g.f737c == androidx.lifecycle.p.f707d) {
            return;
        }
        x xVar = new x(d0Var, new y(d0Var, this));
        d0Var.f3219a.add(xVar);
        xVar.g(false);
        c6.i.a(a9.a().f3209c, xVar);
        final androidx.lifecycle.h hVar = new androidx.lifecycle.h(xVar, a9, g);
        g.a(hVar);
        d0Var.f3221c.add(new AutoCloseable() { // from class: d.z
            @Override // java.lang.AutoCloseable
            public final void close() {
                androidx.lifecycle.w.this.f(hVar);
            }
        });
    }

    public static void d(q qVar) {
        super.onBackPressed();
    }

    public static final void e(ViewGroup viewGroup) {
        viewGroup.setClipChildren(false);
        if (viewGroup instanceof n) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = viewGroup.getChildAt(i3);
            ViewGroup viewGroup2 = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
            if (viewGroup2 != null) {
                e(viewGroup2);
            }
        }
    }

    @Override // d.e0
    public final c0 a() {
        return (c0) this.f1084r.getValue();
    }

    @Override // android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        h();
        super.addContentView(view, layoutParams);
    }

    @Override // f5.e
    public final c6.l b() {
        return (c6.l) this.f1082e.f1869e;
    }

    @Override // s4.c
    public final c6.i c() {
        return a().a().f3209c;
    }

    public final w f() {
        w wVar = this.f1081d;
        if (wVar != null) {
            return wVar;
        }
        w wVar2 = new w(this, true);
        this.f1081d = wVar2;
        return wVar2;
    }

    @Override // androidx.lifecycle.u
    public final w g() {
        return f();
    }

    public final void h() {
        Window window = getWindow();
        window.getClass();
        View decorView = window.getDecorView();
        decorView.getClass();
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        Window window2 = getWindow();
        window2.getClass();
        View decorView2 = window2.getDecorView();
        decorView2.getClass();
        decorView2.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        Window window3 = getWindow();
        window3.getClass();
        View decorView3 = window3.getDecorView();
        decorView3.getClass();
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
        Window window4 = getWindow();
        window4.getClass();
        View decorView4 = window4.getDecorView();
        decorView4.getClass();
        decorView4.setTag(R.id.view_tree_navigation_event_dispatcher_owner, this);
    }

    public final void i(Function0 function0, o oVar, x2.l lVar) {
        int i3;
        this.f1085s = function0;
        this.f1086t = oVar;
        r rVar = oVar.f1076c;
        int i10 = h.f1065a;
        ViewGroup.LayoutParams layoutParams = this.f1087u.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        boolean z10 = (layoutParams2 == null || (layoutParams2.flags & 8192) == 0) ? false : true;
        int ordinal = rVar.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                z10 = true;
            } else {
                if (ordinal != 2) {
                    a2.r.p();
                    return;
                }
                z10 = false;
            }
        }
        Window window = getWindow();
        window.getClass();
        window.setFlags(z10 ? 8192 : -8193, 8192);
        int ordinal2 = lVar.ordinal();
        if (ordinal2 == 0) {
            i3 = 0;
        } else {
            if (ordinal2 != 1) {
                a2.r.p();
                return;
            }
            i3 = 1;
        }
        n nVar = this.f1088v;
        nVar.setLayoutDirection(i3);
        boolean z11 = oVar.f1078e;
        boolean z12 = oVar.f1077d;
        Window window2 = nVar.f1071x;
        boolean z13 = (nVar.B && z12 == nVar.f1073z && z11 == nVar.A) ? false : true;
        nVar.f1073z = z12;
        nVar.A = z11;
        if (z13) {
            WindowManager.LayoutParams attributes = window2.getAttributes();
            int i11 = z12 ? -2 : -1;
            if (i11 != attributes.width || !nVar.B) {
                window2.setLayout(i11, -2);
                nVar.B = true;
            }
        }
        setCanceledOnTouchOutside(oVar.f1075b);
        Window window3 = getWindow();
        if (window3 != null) {
            window3.setSoftInputMode(z11 ? 0 : Build.VERSION.SDK_INT < 31 ? 16 : 48);
        }
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        ((s4.a) this.f1083i.getValue()).a();
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            c0 a9 = a();
            onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.getClass();
            a9.b(onBackInvokedDispatcher);
        }
        this.f1082e.g(bundle);
        f().d(androidx.lifecycle.o.ON_CREATE);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i3, KeyEvent keyEvent) {
        if (!this.f1086t.f1074a || !keyEvent.isTracking() || keyEvent.isCanceled() || i3 != 111) {
            return super.onKeyUp(i3, keyEvent);
        }
        this.f1085s.invoke();
        return true;
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        onSaveInstanceState.getClass();
        this.f1082e.h(onSaveInstanceState);
        return onSaveInstanceState;
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        f().d(androidx.lifecycle.o.ON_RESUME);
    }

    @Override // android.app.Dialog
    public final void onStop() {
        f().d(androidx.lifecycle.o.ON_DESTROY);
        this.f1081d = null;
        super.onStop();
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0066, code lost:
    
        if (r5 <= r1) goto L31;
     */
    @Override // android.app.Dialog
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        View childAt;
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (this.f1086t.f1075b) {
            n nVar = this.f1088v;
            nVar.getClass();
            if (Math.abs(motionEvent.getX()) <= Float.MAX_VALUE && Math.abs(motionEvent.getY()) <= Float.MAX_VALUE && (childAt = nVar.getChildAt(0)) != null) {
                int left = childAt.getLeft() + nVar.getLeft();
                int width = childAt.getWidth() + left;
                int top = childAt.getTop() + nVar.getTop();
                int height = childAt.getHeight() + top;
                int a9 = yd.c.a(motionEvent.getX());
                if (left <= a9) {
                    if (a9 <= width) {
                        int a10 = yd.c.a(motionEvent.getY());
                        if (top <= a10) {
                        }
                    }
                }
            }
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                this.f1089w = true;
                return true;
            }
            if (actionMasked != 1) {
                if (actionMasked == 3) {
                    this.f1089w = false;
                    return onTouchEvent;
                }
            } else if (this.f1089w) {
                this.f1085s.invoke();
                this.f1089w = false;
                return true;
            }
            return onTouchEvent;
        }
        int actionMasked2 = motionEvent.getActionMasked();
        if (actionMasked2 == 0 || actionMasked2 == 1 || actionMasked2 == 3) {
            this.f1089w = false;
            return onTouchEvent;
        }
        return onTouchEvent;
    }

    @Override // android.app.Dialog
    public final void setContentView(View view) {
        view.getClass();
        h();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public final void setContentView(int i3) {
        h();
        super.setContentView(i3);
    }

    @Override // android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        h();
        super.setContentView(view, layoutParams);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
    }
}
