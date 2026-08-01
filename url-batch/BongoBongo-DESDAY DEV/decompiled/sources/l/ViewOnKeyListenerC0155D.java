package l;

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
import com.winfour.winrandom.R;
import m.C0246w0;
import m.O0;

/* renamed from: l.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnKeyListenerC0155D extends AbstractC0177u implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* renamed from: b, reason: collision with root package name */
    public final Context f2736b;

    /* renamed from: c, reason: collision with root package name */
    public final MenuC0169m f2737c;
    public final C0166j d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f2738e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2739f;

    /* renamed from: g, reason: collision with root package name */
    public final int f2740g;

    /* renamed from: h, reason: collision with root package name */
    public final O0 f2741h;

    /* renamed from: k, reason: collision with root package name */
    public C0178v f2743k;

    /* renamed from: l, reason: collision with root package name */
    public View f2744l;

    /* renamed from: m, reason: collision with root package name */
    public View f2745m;

    /* renamed from: n, reason: collision with root package name */
    public InterfaceC0180x f2746n;

    /* renamed from: o, reason: collision with root package name */
    public ViewTreeObserver f2747o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f2748p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f2749q;

    /* renamed from: r, reason: collision with root package name */
    public int f2750r;

    /* renamed from: t, reason: collision with root package name */
    public boolean f2752t;
    public final ViewTreeObserverOnGlobalLayoutListenerC0160d i = new ViewTreeObserverOnGlobalLayoutListenerC0160d(1, this);

    /* renamed from: j, reason: collision with root package name */
    public final N0.o f2742j = new N0.o(3, this);

    /* renamed from: s, reason: collision with root package name */
    public int f2751s = 0;

    public ViewOnKeyListenerC0155D(int i, Context context, View view, MenuC0169m menuC0169m, boolean z2) {
        this.f2736b = context;
        this.f2737c = menuC0169m;
        this.f2738e = z2;
        this.d = new C0166j(menuC0169m, LayoutInflater.from(context), z2, R.layout.abc_popup_menu_item_layout);
        this.f2740g = i;
        Resources resources = context.getResources();
        this.f2739f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f2744l = view;
        this.f2741h = new O0(context, null, i);
        menuC0169m.b(this, context);
    }

    @Override // l.InterfaceC0154C
    public final boolean a() {
        return !this.f2748p && this.f2741h.f2955z.isShowing();
    }

    @Override // l.InterfaceC0181y
    public final void b(MenuC0169m menuC0169m, boolean z2) {
        if (menuC0169m != this.f2737c) {
            return;
        }
        dismiss();
        InterfaceC0180x interfaceC0180x = this.f2746n;
        if (interfaceC0180x != null) {
            interfaceC0180x.b(menuC0169m, z2);
        }
    }

    @Override // l.InterfaceC0181y
    public final void c() {
        this.f2749q = false;
        C0166j c0166j = this.d;
        if (c0166j != null) {
            c0166j.notifyDataSetChanged();
        }
    }

    @Override // l.InterfaceC0154C
    public final void dismiss() {
        if (a()) {
            this.f2741h.dismiss();
        }
    }

    @Override // l.InterfaceC0181y
    public final boolean e(SubMenuC0156E subMenuC0156E) {
        if (subMenuC0156E.hasVisibleItems()) {
            View view = this.f2745m;
            C0179w c0179w = new C0179w(this.f2740g, this.f2736b, view, subMenuC0156E, this.f2738e);
            InterfaceC0180x interfaceC0180x = this.f2746n;
            c0179w.f2884h = interfaceC0180x;
            AbstractC0177u abstractC0177u = c0179w.i;
            if (abstractC0177u != null) {
                abstractC0177u.g(interfaceC0180x);
            }
            boolean u2 = AbstractC0177u.u(subMenuC0156E);
            c0179w.f2883g = u2;
            AbstractC0177u abstractC0177u2 = c0179w.i;
            if (abstractC0177u2 != null) {
                abstractC0177u2.o(u2);
            }
            c0179w.f2885j = this.f2743k;
            this.f2743k = null;
            this.f2737c.c(false);
            O0 o02 = this.f2741h;
            int i = o02.f2936f;
            int k2 = o02.k();
            if ((Gravity.getAbsoluteGravity(this.f2751s, this.f2744l.getLayoutDirection()) & 7) == 5) {
                i += this.f2744l.getWidth();
            }
            if (!c0179w.b()) {
                if (c0179w.f2881e != null) {
                    c0179w.d(i, k2, true, true);
                }
            }
            InterfaceC0180x interfaceC0180x2 = this.f2746n;
            if (interfaceC0180x2 != null) {
                interfaceC0180x2.j(subMenuC0156E);
            }
            return true;
        }
        return false;
    }

    @Override // l.InterfaceC0154C
    public final C0246w0 f() {
        return this.f2741h.f2934c;
    }

    @Override // l.InterfaceC0181y
    public final void g(InterfaceC0180x interfaceC0180x) {
        this.f2746n = interfaceC0180x;
    }

    @Override // l.InterfaceC0181y
    public final boolean i() {
        return false;
    }

    @Override // l.InterfaceC0154C
    public final void j() {
        View view;
        if (a()) {
            return;
        }
        if (this.f2748p || (view = this.f2744l) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.f2745m = view;
        O0 o02 = this.f2741h;
        o02.f2955z.setOnDismissListener(this);
        o02.f2945p = this;
        o02.f2954y = true;
        o02.f2955z.setFocusable(true);
        View view2 = this.f2745m;
        boolean z2 = this.f2747o == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f2747o = viewTreeObserver;
        if (z2) {
            viewTreeObserver.addOnGlobalLayoutListener(this.i);
        }
        view2.addOnAttachStateChangeListener(this.f2742j);
        o02.f2944o = view2;
        o02.f2941l = this.f2751s;
        boolean z3 = this.f2749q;
        Context context = this.f2736b;
        C0166j c0166j = this.d;
        if (!z3) {
            this.f2750r = AbstractC0177u.m(c0166j, context, this.f2739f);
            this.f2749q = true;
        }
        o02.r(this.f2750r);
        o02.f2955z.setInputMethodMode(2);
        Rect rect = this.f2876a;
        o02.f2953x = rect != null ? new Rect(rect) : null;
        o02.j();
        C0246w0 c0246w0 = o02.f2934c;
        c0246w0.setOnKeyListener(this);
        if (this.f2752t) {
            MenuC0169m menuC0169m = this.f2737c;
            if (menuC0169m.f2825m != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) c0246w0, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(menuC0169m.f2825m);
                }
                frameLayout.setEnabled(false);
                c0246w0.addHeaderView(frameLayout, null, false);
            }
        }
        o02.o(c0166j);
        o02.j();
    }

    @Override // l.AbstractC0177u
    public final void l(MenuC0169m menuC0169m) {
    }

    @Override // l.AbstractC0177u
    public final void n(View view) {
        this.f2744l = view;
    }

    @Override // l.AbstractC0177u
    public final void o(boolean z2) {
        this.d.f2811c = z2;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f2748p = true;
        this.f2737c.c(true);
        ViewTreeObserver viewTreeObserver = this.f2747o;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f2747o = this.f2745m.getViewTreeObserver();
            }
            this.f2747o.removeGlobalOnLayoutListener(this.i);
            this.f2747o = null;
        }
        this.f2745m.removeOnAttachStateChangeListener(this.f2742j);
        C0178v c0178v = this.f2743k;
        if (c0178v != null) {
            c0178v.onDismiss();
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

    @Override // l.AbstractC0177u
    public final void p(int i) {
        this.f2751s = i;
    }

    @Override // l.AbstractC0177u
    public final void q(int i) {
        this.f2741h.f2936f = i;
    }

    @Override // l.AbstractC0177u
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.f2743k = (C0178v) onDismissListener;
    }

    @Override // l.AbstractC0177u
    public final void s(boolean z2) {
        this.f2752t = z2;
    }

    @Override // l.AbstractC0177u
    public final void t(int i) {
        this.f2741h.m(i);
    }
}
