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
import com.quicktoss.winflip.R;
import l.C0261t0;
import l.L0;

/* renamed from: k.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnKeyListenerC0143D extends AbstractC0165u implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* renamed from: b, reason: collision with root package name */
    public final Context f2610b;

    /* renamed from: c, reason: collision with root package name */
    public final MenuC0157m f2611c;
    public final C0154j d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f2612e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2613f;

    /* renamed from: g, reason: collision with root package name */
    public final int f2614g;
    public final L0 h;

    /* renamed from: k, reason: collision with root package name */
    public C0166v f2616k;

    /* renamed from: l, reason: collision with root package name */
    public View f2617l;

    /* renamed from: m, reason: collision with root package name */
    public View f2618m;

    /* renamed from: n, reason: collision with root package name */
    public InterfaceC0168x f2619n;

    /* renamed from: o, reason: collision with root package name */
    public ViewTreeObserver f2620o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f2621p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f2622q;

    /* renamed from: r, reason: collision with root package name */
    public int f2623r;

    /* renamed from: t, reason: collision with root package name */
    public boolean f2625t;
    public final ViewTreeObserverOnGlobalLayoutListenerC0148d i = new ViewTreeObserverOnGlobalLayoutListenerC0148d(1, this);

    /* renamed from: j, reason: collision with root package name */
    public final K0.o f2615j = new K0.o(3, this);

    /* renamed from: s, reason: collision with root package name */
    public int f2624s = 0;

    public ViewOnKeyListenerC0143D(int i, Context context, View view, MenuC0157m menuC0157m, boolean z2) {
        this.f2610b = context;
        this.f2611c = menuC0157m;
        this.f2612e = z2;
        this.d = new C0154j(menuC0157m, LayoutInflater.from(context), z2, R.layout.abc_popup_menu_item_layout);
        this.f2614g = i;
        Resources resources = context.getResources();
        this.f2613f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f2617l = view;
        this.h = new L0(context, null, i);
        menuC0157m.b(this, context);
    }

    @Override // k.InterfaceC0142C
    public final boolean a() {
        return !this.f2621p && this.h.f2883z.isShowing();
    }

    @Override // k.InterfaceC0169y
    public final void b(MenuC0157m menuC0157m, boolean z2) {
        if (menuC0157m != this.f2611c) {
            return;
        }
        dismiss();
        InterfaceC0168x interfaceC0168x = this.f2619n;
        if (interfaceC0168x != null) {
            interfaceC0168x.b(menuC0157m, z2);
        }
    }

    @Override // k.InterfaceC0169y
    public final void c() {
        this.f2622q = false;
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
            View view = this.f2618m;
            C0167w c0167w = new C0167w(this.f2614g, this.f2610b, view, subMenuC0144E, this.f2612e);
            InterfaceC0168x interfaceC0168x = this.f2619n;
            c0167w.h = interfaceC0168x;
            AbstractC0165u abstractC0165u = c0167w.i;
            if (abstractC0165u != null) {
                abstractC0165u.g(interfaceC0168x);
            }
            boolean u2 = AbstractC0165u.u(subMenuC0144E);
            c0167w.f2752g = u2;
            AbstractC0165u abstractC0165u2 = c0167w.i;
            if (abstractC0165u2 != null) {
                abstractC0165u2.o(u2);
            }
            c0167w.f2753j = this.f2616k;
            this.f2616k = null;
            this.f2611c.c(false);
            L0 l02 = this.h;
            int i = l02.f2865f;
            int j2 = l02.j();
            if ((Gravity.getAbsoluteGravity(this.f2624s, this.f2617l.getLayoutDirection()) & 7) == 5) {
                i += this.f2617l.getWidth();
            }
            if (!c0167w.b()) {
                if (c0167w.f2750e != null) {
                    c0167w.d(i, j2, true, true);
                }
            }
            InterfaceC0168x interfaceC0168x2 = this.f2619n;
            if (interfaceC0168x2 != null) {
                interfaceC0168x2.c(subMenuC0144E);
            }
            return true;
        }
        return false;
    }

    @Override // k.InterfaceC0142C
    public final C0261t0 f() {
        return this.h.f2863c;
    }

    @Override // k.InterfaceC0169y
    public final void g(InterfaceC0168x interfaceC0168x) {
        this.f2619n = interfaceC0168x;
    }

    @Override // k.InterfaceC0142C
    public final void i() {
        View view;
        if (a()) {
            return;
        }
        if (this.f2621p || (view = this.f2617l) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.f2618m = view;
        L0 l02 = this.h;
        l02.f2883z.setOnDismissListener(this);
        l02.f2873p = this;
        l02.f2882y = true;
        l02.f2883z.setFocusable(true);
        View view2 = this.f2618m;
        boolean z2 = this.f2620o == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f2620o = viewTreeObserver;
        if (z2) {
            viewTreeObserver.addOnGlobalLayoutListener(this.i);
        }
        view2.addOnAttachStateChangeListener(this.f2615j);
        l02.f2872o = view2;
        l02.f2869l = this.f2624s;
        boolean z3 = this.f2622q;
        Context context = this.f2610b;
        C0154j c0154j = this.d;
        if (!z3) {
            this.f2623r = AbstractC0165u.m(c0154j, context, this.f2613f);
            this.f2622q = true;
        }
        l02.r(this.f2623r);
        l02.f2883z.setInputMethodMode(2);
        Rect rect = this.f2745a;
        l02.f2881x = rect != null ? new Rect(rect) : null;
        l02.i();
        C0261t0 c0261t0 = l02.f2863c;
        c0261t0.setOnKeyListener(this);
        if (this.f2625t) {
            MenuC0157m menuC0157m = this.f2611c;
            if (menuC0157m.f2695m != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) c0261t0, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(menuC0157m.f2695m);
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
        this.f2617l = view;
    }

    @Override // k.AbstractC0165u
    public final void o(boolean z2) {
        this.d.f2682c = z2;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f2621p = true;
        this.f2611c.c(true);
        ViewTreeObserver viewTreeObserver = this.f2620o;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f2620o = this.f2618m.getViewTreeObserver();
            }
            this.f2620o.removeGlobalOnLayoutListener(this.i);
            this.f2620o = null;
        }
        this.f2618m.removeOnAttachStateChangeListener(this.f2615j);
        C0166v c0166v = this.f2616k;
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
        this.f2624s = i;
    }

    @Override // k.AbstractC0165u
    public final void q(int i) {
        this.h.f2865f = i;
    }

    @Override // k.AbstractC0165u
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.f2616k = (C0166v) onDismissListener;
    }

    @Override // k.AbstractC0165u
    public final void s(boolean z2) {
        this.f2625t = z2;
    }

    @Override // k.AbstractC0165u
    public final void t(int i) {
        this.h.l(i);
    }
}
