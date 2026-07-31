package u2;

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
import androidx.lifecycle.l0;
import androidx.lifecycle.m0;
import androidx.lifecycle.u;
import androidx.lifecycle.w;
import b.s;
import b.t;
import b.v;
import c5.x;
import com.snovikpovik.vuevnxsj.R;
import java.util.UUID;
import r2.r;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class p extends Dialog implements u, v, s4.c, x4.f {

    /* renamed from: d, reason: collision with root package name */
    public w f7339d;

    /* renamed from: e, reason: collision with root package name */
    public final x4.e f7340e;

    /* renamed from: f, reason: collision with root package name */
    public final c6.k f7341f;

    /* renamed from: g, reason: collision with root package name */
    public final c6.k f7342g;

    /* renamed from: h, reason: collision with root package name */
    public p6.a f7343h;
    public o i;

    /* renamed from: j, reason: collision with root package name */
    public final View f7344j;

    /* renamed from: k, reason: collision with root package name */
    public final n f7345k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f7346l;

    public p(p6.a aVar, o oVar, View view, r2.l lVar, r2.c cVar, UUID uuid) {
        super(new ContextThemeWrapper(view.getContext(), oVar.f7337e ? R.style.DialogWindowTheme : R.style.FloatingDialogWindowTheme), 0);
        this.f7340e = new x4.e(new z4.a(this, new m0(18, this)), 1);
        final int i = 0;
        this.f7341f = a.a.r(new p6.a(this) { // from class: b.m

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ u2.p f1004e;

            {
                this.f1004e = this;
            }

            @Override // p6.a
            public final Object b() {
                switch (i) {
                    case 0:
                        s4.a aVar2 = new s4.a();
                        this.f1004e.a().f1020b.c(aVar2);
                        return aVar2;
                    default:
                        return new t(new a1.a(3, this.f1004e));
                }
            }
        });
        final int i8 = 1;
        this.f7342g = a.a.r(new p6.a(this) { // from class: b.m

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ u2.p f1004e;

            {
                this.f1004e = this;
            }

            @Override // p6.a
            public final Object b() {
                switch (i8) {
                    case 0:
                        s4.a aVar2 = new s4.a();
                        this.f1004e.a().f1020b.c(aVar2);
                        return aVar2;
                    default:
                        return new t(new a1.a(3, this.f1004e));
                }
            }
        });
        this.f7343h = aVar;
        this.i = oVar;
        this.f7344j = view;
        float f6 = 8;
        Window window = getWindow();
        if (window == null) {
            throw new IllegalStateException("Dialog has no window");
        }
        window.requestFeature(1);
        window.setBackgroundDrawableResource(android.R.color.transparent);
        boolean z3 = this.i.f7337e;
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 35) {
            q3.i.d(window, z3);
        } else if (i9 >= 30) {
            q3.i.c(window, z3);
        } else {
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z3 ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
        }
        window.setGravity(17);
        if (!this.i.f7337e) {
            window.addFlags(65792);
            WindowManager.LayoutParams attributes = window.getAttributes();
            if (i9 >= 28) {
                i.f7322a.a(attributes);
            }
            if (i9 >= 30) {
                j jVar = j.f7323a;
                jVar.a(attributes, 0);
                jVar.b(attributes, 0);
            }
            window.setAttributes(attributes);
        }
        n nVar = new n(getContext(), window);
        setTitle(this.i.f7338f);
        nVar.setTag(R.id.compose_view_saveable_id_tag, "Dialog:" + uuid);
        nVar.setClipChildren(false);
        nVar.setElevation(cVar.u(f6));
        nVar.setOutlineProvider(new i1.l(1));
        this.f7345k = nVar;
        View decorView2 = window.getDecorView();
        ViewGroup viewGroup = decorView2 instanceof ViewGroup ? (ViewGroup) decorView2 : null;
        if (viewGroup != null) {
            e(viewGroup);
        }
        setContentView(nVar);
        l0.g(nVar, l0.d(view));
        l0.h(nVar, l0.e(view));
        r.U(nVar, r.v(view));
        h(this.f7343h, this.i, lVar);
        t a8 = a();
        a aVar2 = new a(this, 1);
        q6.i.e(a8, "<this>");
        b.u uVar = new b.u(aVar2);
        w g3 = g();
        if (g3.f871c == androidx.lifecycle.p.f847d) {
            return;
        }
        b.o oVar2 = new b.o(uVar, new b.p(uVar, this));
        uVar.f1021a.add(oVar2);
        oVar2.c(false);
        x.b(a8.f1020b, oVar2);
        s sVar = new s(oVar2, uVar, a8, g3);
        g3.a(sVar);
        uVar.f1023c.add(sVar);
    }

    public static void d(p pVar) {
        super.onBackPressed();
    }

    public static final void e(ViewGroup viewGroup) {
        viewGroup.setClipChildren(false);
        if (viewGroup instanceof n) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            ViewGroup viewGroup2 = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
            if (viewGroup2 != null) {
                e(viewGroup2);
            }
        }
    }

    @Override // b.v
    public final t a() {
        return (t) this.f7342g.getValue();
    }

    @Override // android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        q6.i.e(view, "view");
        f();
        super.addContentView(view, layoutParams);
    }

    @Override // x4.f
    public final x4.e b() {
        return (x4.e) this.f7340e.f8656b;
    }

    @Override // s4.c
    public final x c() {
        return a().f1020b;
    }

    public final void f() {
        Window window = getWindow();
        q6.i.b(window);
        View decorView = window.getDecorView();
        q6.i.d(decorView, "getDecorView(...)");
        l0.g(decorView, this);
        Window window2 = getWindow();
        q6.i.b(window2);
        View decorView2 = window2.getDecorView();
        q6.i.d(decorView2, "getDecorView(...)");
        decorView2.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        Window window3 = getWindow();
        q6.i.b(window3);
        View decorView3 = window3.getDecorView();
        q6.i.d(decorView3, "getDecorView(...)");
        r.U(decorView3, this);
        Window window4 = getWindow();
        q6.i.b(window4);
        View decorView4 = window4.getDecorView();
        q6.i.d(decorView4, "getDecorView(...)");
        decorView4.setTag(R.id.view_tree_navigation_event_dispatcher_owner, this);
    }

    @Override // androidx.lifecycle.u
    public final w g() {
        w wVar = this.f7339d;
        if (wVar != null) {
            return wVar;
        }
        w wVar2 = new w(this, true);
        this.f7339d = wVar2;
        return wVar2;
    }

    public final void h(p6.a aVar, o oVar, r2.l lVar) {
        int i;
        this.f7343h = aVar;
        this.i = oVar;
        q qVar = oVar.f7335c;
        int i8 = h.f7321a;
        ViewGroup.LayoutParams layoutParams = this.f7344j.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        boolean z3 = (layoutParams2 == null || (layoutParams2.flags & 8192) == 0) ? false : true;
        int ordinal = qVar.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                z3 = true;
            } else {
                if (ordinal != 2) {
                    throw new a5.c();
                }
                z3 = false;
            }
        }
        Window window = getWindow();
        q6.i.b(window);
        window.setFlags(z3 ? 8192 : -8193, 8192);
        int ordinal2 = lVar.ordinal();
        if (ordinal2 == 0) {
            i = 0;
        } else {
            if (ordinal2 != 1) {
                throw new a5.c();
            }
            i = 1;
        }
        n nVar = this.f7345k;
        nVar.setLayoutDirection(i);
        boolean z7 = oVar.f7337e;
        boolean z8 = oVar.f7336d;
        Window window2 = nVar.f7327l;
        boolean z9 = (nVar.f7331p && z8 == nVar.f7329n && z7 == nVar.f7330o) ? false : true;
        nVar.f7329n = z8;
        nVar.f7330o = z7;
        if (z9) {
            WindowManager.LayoutParams attributes = window2.getAttributes();
            int i9 = z8 ? -2 : -1;
            if (i9 != attributes.width || !nVar.f7331p) {
                window2.setLayout(i9, -2);
                nVar.f7331p = true;
            }
        }
        setCanceledOnTouchOutside(oVar.f7334b);
        Window window3 = getWindow();
        if (window3 != null) {
            window3.setSoftInputMode(z7 ? 0 : Build.VERSION.SDK_INT < 31 ? 16 : 48);
        }
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        ((s4.a) this.f7341f.getValue()).a();
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            t a8 = a();
            onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            q6.i.d(onBackInvokedDispatcher, "getOnBackInvokedDispatcher(...)");
            a8.a(onBackInvokedDispatcher);
        }
        this.f7340e.d(bundle);
        w wVar = this.f7339d;
        if (wVar == null) {
            wVar = new w(this, true);
            this.f7339d = wVar;
        }
        wVar.d(androidx.lifecycle.o.ON_CREATE);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (!this.i.f7333a || !keyEvent.isTracking() || keyEvent.isCanceled() || i != 111) {
            return super.onKeyUp(i, keyEvent);
        }
        this.f7343h.b();
        return true;
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        q6.i.d(onSaveInstanceState, "onSaveInstanceState(...)");
        this.f7340e.e(onSaveInstanceState);
        return onSaveInstanceState;
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        w wVar = this.f7339d;
        if (wVar == null) {
            wVar = new w(this, true);
            this.f7339d = wVar;
        }
        wVar.d(androidx.lifecycle.o.ON_RESUME);
    }

    @Override // android.app.Dialog
    public final void onStop() {
        w wVar = this.f7339d;
        if (wVar == null) {
            wVar = new w(this, true);
            this.f7339d = wVar;
        }
        wVar.d(androidx.lifecycle.o.ON_DESTROY);
        this.f7339d = null;
        super.onStop();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006b, code lost:
    
        if (r5 <= r1) goto L35;
     */
    @Override // android.app.Dialog
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        View childAt;
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (this.i.f7334b) {
            n nVar = this.f7345k;
            nVar.getClass();
            float x7 = motionEvent.getX();
            if (!Float.isInfinite(x7) && !Float.isNaN(x7)) {
                float y7 = motionEvent.getY();
                if (!Float.isInfinite(y7) && !Float.isNaN(y7) && (childAt = nVar.getChildAt(0)) != null) {
                    int left = childAt.getLeft() + nVar.getLeft();
                    int width = childAt.getWidth() + left;
                    int top = childAt.getTop() + nVar.getTop();
                    int height = childAt.getHeight() + top;
                    int B = s6.a.B(motionEvent.getX());
                    if (left <= B) {
                        if (B <= width) {
                            int B2 = s6.a.B(motionEvent.getY());
                            if (top <= B2) {
                            }
                        }
                    }
                }
            }
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                this.f7346l = true;
                return true;
            }
            if (actionMasked != 1) {
                if (actionMasked == 3) {
                    this.f7346l = false;
                    return onTouchEvent;
                }
            } else if (this.f7346l) {
                this.f7343h.b();
                this.f7346l = false;
                return true;
            }
            return onTouchEvent;
        }
        int actionMasked2 = motionEvent.getActionMasked();
        if (actionMasked2 == 0 || actionMasked2 == 1 || actionMasked2 == 3) {
            this.f7346l = false;
            return onTouchEvent;
        }
        return onTouchEvent;
    }

    @Override // android.app.Dialog
    public final void setContentView(int i) {
        f();
        super.setContentView(i);
    }

    @Override // android.app.Dialog
    public final void setContentView(View view) {
        q6.i.e(view, "view");
        f();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        q6.i.e(view, "view");
        f();
        super.setContentView(view, layoutParams);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
    }
}
