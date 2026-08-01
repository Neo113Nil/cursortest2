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
import com.playminus.quickmatch.R;
import l.C0261t0;
import l.L0;

/* renamed from: k.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnKeyListenerC0143D extends AbstractC0165u implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* renamed from: b, reason: collision with root package name */
    public final Context f2609b;

    /* renamed from: c, reason: collision with root package name */
    public final MenuC0157m f2610c;
    public final C0154j d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f2611e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2612f;

    /* renamed from: g, reason: collision with root package name */
    public final int f2613g;
    public final L0 h;

    /* renamed from: k, reason: collision with root package name */
    public C0166v f2615k;

    /* renamed from: l, reason: collision with root package name */
    public View f2616l;

    /* renamed from: m, reason: collision with root package name */
    public View f2617m;

    /* renamed from: n, reason: collision with root package name */
    public InterfaceC0168x f2618n;

    /* renamed from: o, reason: collision with root package name */
    public ViewTreeObserver f2619o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f2620p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f2621q;

    /* renamed from: r, reason: collision with root package name */
    public int f2622r;

    /* renamed from: t, reason: collision with root package name */
    public boolean f2624t;
    public final ViewTreeObserverOnGlobalLayoutListenerC0148d i = new ViewTreeObserverOnGlobalLayoutListenerC0148d(1, this);

    /* renamed from: j, reason: collision with root package name */
    public final K0.o f2614j = new K0.o(3, this);

    /* renamed from: s, reason: collision with root package name */
    public int f2623s = 0;

    public ViewOnKeyListenerC0143D(int i, Context context, View view, MenuC0157m menuC0157m, boolean z2) {
        this.f2609b = context;
        this.f2610c = menuC0157m;
        this.f2611e = z2;
        this.d = new C0154j(menuC0157m, LayoutInflater.from(context), z2, R.layout.abc_popup_menu_item_layout);
        this.f2613g = i;
        Resources resources = context.getResources();
        this.f2612f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f2616l = view;
        this.h = new L0(context, null, i);
        menuC0157m.b(this, context);
    }

    @Override // k.InterfaceC0142C
    public final boolean a() {
        return !this.f2620p && this.h.f2882z.isShowing();
    }

    @Override // k.InterfaceC0169y
    public final void b(MenuC0157m menuC0157m, boolean z2) {
        if (menuC0157m != this.f2610c) {
            return;
        }
        dismiss();
        InterfaceC0168x interfaceC0168x = this.f2618n;
        if (interfaceC0168x != null) {
            interfaceC0168x.b(menuC0157m, z2);
        }
    }

    @Override // k.InterfaceC0169y
    public final void c() {
        this.f2621q = false;
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
            View view = this.f2617m;
            C0167w c0167w = new C0167w(this.f2613g, this.f2609b, view, subMenuC0144E, this.f2611e);
            InterfaceC0168x interfaceC0168x = this.f2618n;
            c0167w.h = interfaceC0168x;
            AbstractC0165u abstractC0165u = c0167w.i;
            if (abstractC0165u != null) {
                abstractC0165u.g(interfaceC0168x);
            }
            boolean u2 = AbstractC0165u.u(subMenuC0144E);
            c0167w.f2751g = u2;
            AbstractC0165u abstractC0165u2 = c0167w.i;
            if (abstractC0165u2 != null) {
                abstractC0165u2.o(u2);
            }
            c0167w.f2752j = this.f2615k;
            this.f2615k = null;
            this.f2610c.c(false);
            L0 l02 = this.h;
            int i = l02.f2864f;
            int j2 = l02.j();
            if ((Gravity.getAbsoluteGravity(this.f2623s, this.f2616l.getLayoutDirection()) & 7) == 5) {
                i += this.f2616l.getWidth();
            }
            if (!c0167w.b()) {
                if (c0167w.f2749e != null) {
                    c0167w.d(i, j2, true, true);
                }
            }
            InterfaceC0168x interfaceC0168x2 = this.f2618n;
            if (interfaceC0168x2 != null) {
                interfaceC0168x2.c(subMenuC0144E);
            }
            return true;
        }
        return false;
    }

    @Override // k.InterfaceC0142C
    public final C0261t0 f() {
        return this.h.f2862c;
    }

    @Override // k.InterfaceC0169y
    public final void g(InterfaceC0168x interfaceC0168x) {
        this.f2618n = interfaceC0168x;
    }

    @Override // k.InterfaceC0142C
    public final void i() {
        View view;
        if (a()) {
            return;
        }
        if (this.f2620p || (view = this.f2616l) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.f2617m = view;
        L0 l02 = this.h;
        l02.f2882z.setOnDismissListener(this);
        l02.f2872p = this;
        l02.f2881y = true;
        l02.f2882z.setFocusable(true);
        View view2 = this.f2617m;
        boolean z2 = this.f2619o == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f2619o = viewTreeObserver;
        if (z2) {
            viewTreeObserver.addOnGlobalLayoutListener(this.i);
        }
        view2.addOnAttachStateChangeListener(this.f2614j);
        l02.f2871o = view2;
        l02.f2868l = this.f2623s;
        boolean z3 = this.f2621q;
        Context context = this.f2609b;
        C0154j c0154j = this.d;
        if (!z3) {
            this.f2622r = AbstractC0165u.m(c0154j, context, this.f2612f);
            this.f2621q = true;
        }
        l02.r(this.f2622r);
        l02.f2882z.setInputMethodMode(2);
        Rect rect = this.f2744a;
        l02.f2880x = rect != null ? new Rect(rect) : null;
        l02.i();
        C0261t0 c0261t0 = l02.f2862c;
        c0261t0.setOnKeyListener(this);
        if (this.f2624t) {
            MenuC0157m menuC0157m = this.f2610c;
            if (menuC0157m.f2694m != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) c0261t0, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(menuC0157m.f2694m);
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
        this.f2616l = view;
    }

    @Override // k.AbstractC0165u
    public final void o(boolean z2) {
        this.d.f2681c = z2;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f2620p = true;
        this.f2610c.c(true);
        ViewTreeObserver viewTreeObserver = this.f2619o;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f2619o = this.f2617m.getViewTreeObserver();
            }
            this.f2619o.removeGlobalOnLayoutListener(this.i);
            this.f2619o = null;
        }
        this.f2617m.removeOnAttachStateChangeListener(this.f2614j);
        C0166v c0166v = this.f2615k;
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
        this.f2623s = i;
    }

    @Override // k.AbstractC0165u
    public final void q(int i) {
        this.h.f2864f = i;
    }

    @Override // k.AbstractC0165u
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.f2615k = (C0166v) onDismissListener;
    }

    @Override // k.AbstractC0165u
    public final void s(boolean z2) {
        this.f2624t = z2;
    }

    @Override // k.AbstractC0165u
    public final void t(int i) {
        this.h.l(i);
    }
}
