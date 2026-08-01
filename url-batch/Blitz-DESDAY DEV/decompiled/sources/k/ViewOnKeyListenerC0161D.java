package k;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.winfour.neondrop.R;
import l.C0213t0;
import l.L0;

/* renamed from: k.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnKeyListenerC0161D extends u implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* renamed from: b, reason: collision with root package name */
    public final Context f2689b;

    /* renamed from: c, reason: collision with root package name */
    public final m f2690c;
    public final j d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f2691e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2692f;

    /* renamed from: g, reason: collision with root package name */
    public final int f2693g;
    public final L0 h;

    /* renamed from: k, reason: collision with root package name */
    public v f2695k;

    /* renamed from: l, reason: collision with root package name */
    public View f2696l;

    /* renamed from: m, reason: collision with root package name */
    public View f2697m;

    /* renamed from: n, reason: collision with root package name */
    public x f2698n;

    /* renamed from: o, reason: collision with root package name */
    public ViewTreeObserver f2699o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f2700p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f2701q;

    /* renamed from: r, reason: collision with root package name */
    public int f2702r;

    /* renamed from: t, reason: collision with root package name */
    public boolean f2704t;
    public final ViewTreeObserverOnGlobalLayoutListenerC0166d i = new ViewTreeObserverOnGlobalLayoutListenerC0166d(1, this);

    /* renamed from: j, reason: collision with root package name */
    public final O0.o f2694j = new O0.o(3, this);

    /* renamed from: s, reason: collision with root package name */
    public int f2703s = 0;

    public ViewOnKeyListenerC0161D(int i, Context context, View view, m mVar, boolean z2) {
        this.f2689b = context;
        this.f2690c = mVar;
        this.f2691e = z2;
        this.d = new j(mVar, LayoutInflater.from(context), z2, R.layout.abc_popup_menu_item_layout);
        this.f2693g = i;
        Resources resources = context.getResources();
        this.f2692f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f2696l = view;
        this.h = new L0(context, null, i);
        mVar.b(this, context);
    }

    @Override // k.InterfaceC0160C
    public final boolean a() {
        return !this.f2700p && this.h.f2884z.isShowing();
    }

    @Override // k.y
    public final void b(m mVar, boolean z2) {
        if (mVar != this.f2690c) {
            return;
        }
        dismiss();
        x xVar = this.f2698n;
        if (xVar != null) {
            xVar.b(mVar, z2);
        }
    }

    @Override // k.y
    public final void c() {
        this.f2701q = false;
        j jVar = this.d;
        if (jVar != null) {
            jVar.notifyDataSetChanged();
        }
    }

    @Override // k.InterfaceC0160C
    public final void dismiss() {
        if (a()) {
            this.h.dismiss();
        }
    }

    @Override // k.y
    public final boolean e(SubMenuC0162E subMenuC0162E) {
        if (subMenuC0162E.hasVisibleItems()) {
            View view = this.f2697m;
            w wVar = new w(this.f2693g, this.f2689b, view, subMenuC0162E, this.f2691e);
            x xVar = this.f2698n;
            wVar.h = xVar;
            u uVar = wVar.i;
            if (uVar != null) {
                uVar.g(xVar);
            }
            boolean u2 = u.u(subMenuC0162E);
            wVar.f2831g = u2;
            u uVar2 = wVar.i;
            if (uVar2 != null) {
                uVar2.o(u2);
            }
            wVar.f2832j = this.f2695k;
            this.f2695k = null;
            this.f2690c.c(false);
            L0 l02 = this.h;
            int i = l02.f2866f;
            int j2 = l02.j();
            if ((Gravity.getAbsoluteGravity(this.f2703s, this.f2696l.getLayoutDirection()) & 7) == 5) {
                i += this.f2696l.getWidth();
            }
            if (!wVar.b()) {
                if (wVar.f2829e != null) {
                    wVar.d(i, j2, true, true);
                }
            }
            x xVar2 = this.f2698n;
            if (xVar2 != null) {
                xVar2.f(subMenuC0162E);
            }
            return true;
        }
        return false;
    }

    @Override // k.InterfaceC0160C
    public final C0213t0 f() {
        return this.h.f2864c;
    }

    @Override // k.y
    public final void g(x xVar) {
        this.f2698n = xVar;
    }

    @Override // k.InterfaceC0160C
    public final void i() {
        View view;
        if (a()) {
            return;
        }
        if (this.f2700p || (view = this.f2696l) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.f2697m = view;
        L0 l02 = this.h;
        l02.f2884z.setOnDismissListener(this);
        l02.f2874p = this;
        l02.f2883y = true;
        l02.f2884z.setFocusable(true);
        View view2 = this.f2697m;
        boolean z2 = this.f2699o == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f2699o = viewTreeObserver;
        if (z2) {
            viewTreeObserver.addOnGlobalLayoutListener(this.i);
        }
        view2.addOnAttachStateChangeListener(this.f2694j);
        l02.f2873o = view2;
        l02.f2870l = this.f2703s;
        boolean z3 = this.f2701q;
        Context context = this.f2689b;
        j jVar = this.d;
        if (!z3) {
            this.f2702r = u.m(jVar, context, this.f2692f);
            this.f2701q = true;
        }
        l02.q(this.f2702r);
        l02.f2884z.setInputMethodMode(2);
        Rect rect = this.f2824a;
        l02.f2882x = rect != null ? new Rect(rect) : null;
        l02.i();
        C0213t0 c0213t0 = l02.f2864c;
        c0213t0.setOnKeyListener(this);
        if (this.f2704t) {
            m mVar = this.f2690c;
            if (mVar.f2774m != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) c0213t0, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(mVar.f2774m);
                }
                frameLayout.setEnabled(false);
                c0213t0.addHeaderView(frameLayout, null, false);
            }
        }
        l02.n(jVar);
        l02.i();
    }

    @Override // k.y
    public final boolean k() {
        return false;
    }

    @Override // k.u
    public final void l(m mVar) {
    }

    @Override // k.u
    public final void n(View view) {
        this.f2696l = view;
    }

    @Override // k.u
    public final void o(boolean z2) {
        this.d.f2761c = z2;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f2700p = true;
        this.f2690c.c(true);
        ViewTreeObserver viewTreeObserver = this.f2699o;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f2699o = this.f2697m.getViewTreeObserver();
            }
            this.f2699o.removeGlobalOnLayoutListener(this.i);
            this.f2699o = null;
        }
        this.f2697m.removeOnAttachStateChangeListener(this.f2694j);
        v vVar = this.f2695k;
        if (vVar != null) {
            vVar.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // k.u
    public final void p(int i) {
        this.f2703s = i;
    }

    @Override // k.u
    public final void q(int i) {
        this.h.f2866f = i;
    }

    @Override // k.u
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.f2695k = (v) onDismissListener;
    }

    @Override // k.u
    public final void s(boolean z2) {
        this.f2704t = z2;
    }

    @Override // k.u
    public final void t(int i) {
        this.h.l(i);
    }
}
