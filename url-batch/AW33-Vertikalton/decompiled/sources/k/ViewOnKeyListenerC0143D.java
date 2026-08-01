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
import com.luckycalc.loanfinance.R;
import l.C0261t0;
import l.L0;

/* renamed from: k.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnKeyListenerC0143D extends AbstractC0165u implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* renamed from: b, reason: collision with root package name */
    public final Context f2605b;

    /* renamed from: c, reason: collision with root package name */
    public final MenuC0157m f2606c;
    public final C0154j d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f2607e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2608f;

    /* renamed from: g, reason: collision with root package name */
    public final int f2609g;
    public final L0 h;

    /* renamed from: k, reason: collision with root package name */
    public C0166v f2611k;

    /* renamed from: l, reason: collision with root package name */
    public View f2612l;

    /* renamed from: m, reason: collision with root package name */
    public View f2613m;

    /* renamed from: n, reason: collision with root package name */
    public InterfaceC0168x f2614n;

    /* renamed from: o, reason: collision with root package name */
    public ViewTreeObserver f2615o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f2616p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f2617q;

    /* renamed from: r, reason: collision with root package name */
    public int f2618r;

    /* renamed from: t, reason: collision with root package name */
    public boolean f2620t;
    public final ViewTreeObserverOnGlobalLayoutListenerC0148d i = new ViewTreeObserverOnGlobalLayoutListenerC0148d(1, this);

    /* renamed from: j, reason: collision with root package name */
    public final K0.o f2610j = new K0.o(3, this);

    /* renamed from: s, reason: collision with root package name */
    public int f2619s = 0;

    public ViewOnKeyListenerC0143D(int i, Context context, View view, MenuC0157m menuC0157m, boolean z2) {
        this.f2605b = context;
        this.f2606c = menuC0157m;
        this.f2607e = z2;
        this.d = new C0154j(menuC0157m, LayoutInflater.from(context), z2, R.layout.abc_popup_menu_item_layout);
        this.f2609g = i;
        Resources resources = context.getResources();
        this.f2608f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f2612l = view;
        this.h = new L0(context, null, i);
        menuC0157m.b(this, context);
    }

    @Override // k.InterfaceC0142C
    public final boolean a() {
        return !this.f2616p && this.h.f2878z.isShowing();
    }

    @Override // k.InterfaceC0169y
    public final void b(MenuC0157m menuC0157m, boolean z2) {
        if (menuC0157m != this.f2606c) {
            return;
        }
        dismiss();
        InterfaceC0168x interfaceC0168x = this.f2614n;
        if (interfaceC0168x != null) {
            interfaceC0168x.b(menuC0157m, z2);
        }
    }

    @Override // k.InterfaceC0169y
    public final void c() {
        this.f2617q = false;
        C0154j c0154j = this.d;
        if (c0154j != null) {
            c0154j.notifyDataSetChanged();
        }
    }

    @Override // k.InterfaceC0142C
    public final void dismiss() {
        if (a()) {
            this.h.dismiss();
        }
    }

    @Override // k.InterfaceC0169y
    public final boolean e(SubMenuC0144E subMenuC0144E) {
        if (subMenuC0144E.hasVisibleItems()) {
            View view = this.f2613m;
            C0167w c0167w = new C0167w(this.f2609g, this.f2605b, view, subMenuC0144E, this.f2607e);
            InterfaceC0168x interfaceC0168x = this.f2614n;
            c0167w.h = interfaceC0168x;
            AbstractC0165u abstractC0165u = c0167w.i;
            if (abstractC0165u != null) {
                abstractC0165u.g(interfaceC0168x);
            }
            boolean u2 = AbstractC0165u.u(subMenuC0144E);
            c0167w.f2747g = u2;
            AbstractC0165u abstractC0165u2 = c0167w.i;
            if (abstractC0165u2 != null) {
                abstractC0165u2.o(u2);
            }
            c0167w.f2748j = this.f2611k;
            this.f2611k = null;
            this.f2606c.c(false);
            L0 l02 = this.h;
            int i = l02.f2860f;
            int j2 = l02.j();
            if ((Gravity.getAbsoluteGravity(this.f2619s, this.f2612l.getLayoutDirection()) & 7) == 5) {
                i += this.f2612l.getWidth();
            }
            if (!c0167w.b()) {
                if (c0167w.f2745e != null) {
                    c0167w.d(i, j2, true, true);
                }
            }
            InterfaceC0168x interfaceC0168x2 = this.f2614n;
            if (interfaceC0168x2 != null) {
                interfaceC0168x2.c(subMenuC0144E);
            }
            return true;
        }
        return false;
    }

    @Override // k.InterfaceC0142C
    public final C0261t0 f() {
        return this.h.f2858c;
    }

    @Override // k.InterfaceC0169y
    public final void g(InterfaceC0168x interfaceC0168x) {
        this.f2614n = interfaceC0168x;
    }

    @Override // k.InterfaceC0142C
    public final void i() {
        View view;
        if (a()) {
            return;
        }
        if (this.f2616p || (view = this.f2612l) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.f2613m = view;
        L0 l02 = this.h;
        l02.f2878z.setOnDismissListener(this);
        l02.f2868p = this;
        l02.f2877y = true;
        l02.f2878z.setFocusable(true);
        View view2 = this.f2613m;
        boolean z2 = this.f2615o == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f2615o = viewTreeObserver;
        if (z2) {
            viewTreeObserver.addOnGlobalLayoutListener(this.i);
        }
        view2.addOnAttachStateChangeListener(this.f2610j);
        l02.f2867o = view2;
        l02.f2864l = this.f2619s;
        boolean z3 = this.f2617q;
        Context context = this.f2605b;
        C0154j c0154j = this.d;
        if (!z3) {
            this.f2618r = AbstractC0165u.m(c0154j, context, this.f2608f);
            this.f2617q = true;
        }
        l02.r(this.f2618r);
        l02.f2878z.setInputMethodMode(2);
        Rect rect = this.f2740a;
        l02.f2876x = rect != null ? new Rect(rect) : null;
        l02.i();
        C0261t0 c0261t0 = l02.f2858c;
        c0261t0.setOnKeyListener(this);
        if (this.f2620t) {
            MenuC0157m menuC0157m = this.f2606c;
            if (menuC0157m.f2690m != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) c0261t0, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(menuC0157m.f2690m);
                }
                frameLayout.setEnabled(false);
                c0261t0.addHeaderView(frameLayout, null, false);
            }
        }
        l02.n(c0154j);
        l02.i();
    }

    @Override // k.InterfaceC0169y
    public final boolean k() {
        return false;
    }

    @Override // k.AbstractC0165u
    public final void l(MenuC0157m menuC0157m) {
    }

    @Override // k.AbstractC0165u
    public final void n(View view) {
        this.f2612l = view;
    }

    @Override // k.AbstractC0165u
    public final void o(boolean z2) {
        this.d.f2677c = z2;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f2616p = true;
        this.f2606c.c(true);
        ViewTreeObserver viewTreeObserver = this.f2615o;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f2615o = this.f2613m.getViewTreeObserver();
            }
            this.f2615o.removeGlobalOnLayoutListener(this.i);
            this.f2615o = null;
        }
        this.f2613m.removeOnAttachStateChangeListener(this.f2610j);
        C0166v c0166v = this.f2611k;
        if (c0166v != null) {
            c0166v.onDismiss();
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

    @Override // k.AbstractC0165u
    public final void p(int i) {
        this.f2619s = i;
    }

    @Override // k.AbstractC0165u
    public final void q(int i) {
        this.h.f2860f = i;
    }

    @Override // k.AbstractC0165u
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.f2611k = (C0166v) onDismissListener;
    }

    @Override // k.AbstractC0165u
    public final void s(boolean z2) {
        this.f2620t = z2;
    }

    @Override // k.AbstractC0165u
    public final void t(int i) {
        this.h.l(i);
    }
}
