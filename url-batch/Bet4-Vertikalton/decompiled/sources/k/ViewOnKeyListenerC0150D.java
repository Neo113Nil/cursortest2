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
import com.playbag.tripgear.R;
import l.C0233s0;
import l.K0;

/* renamed from: k.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnKeyListenerC0150D extends AbstractC0172u implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* renamed from: b, reason: collision with root package name */
    public final Context f2609b;

    /* renamed from: c, reason: collision with root package name */
    public final MenuC0164m f2610c;
    public final C0161j d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f2611e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2612f;

    /* renamed from: g, reason: collision with root package name */
    public final int f2613g;
    public final K0 h;

    /* renamed from: k, reason: collision with root package name */
    public C0173v f2615k;

    /* renamed from: l, reason: collision with root package name */
    public View f2616l;

    /* renamed from: m, reason: collision with root package name */
    public View f2617m;

    /* renamed from: n, reason: collision with root package name */
    public InterfaceC0175x f2618n;

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
    public final ViewTreeObserverOnGlobalLayoutListenerC0155d i = new ViewTreeObserverOnGlobalLayoutListenerC0155d(1, this);

    /* renamed from: j, reason: collision with root package name */
    public final M0.o f2614j = new M0.o(3, this);

    /* renamed from: s, reason: collision with root package name */
    public int f2623s = 0;

    public ViewOnKeyListenerC0150D(int i, Context context, View view, MenuC0164m menuC0164m, boolean z2) {
        this.f2609b = context;
        this.f2610c = menuC0164m;
        this.f2611e = z2;
        this.d = new C0161j(menuC0164m, LayoutInflater.from(context), z2, R.layout.abc_popup_menu_item_layout);
        this.f2613g = i;
        Resources resources = context.getResources();
        this.f2612f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f2616l = view;
        this.h = new K0(context, null, i);
        menuC0164m.b(this, context);
    }

    @Override // k.InterfaceC0149C
    public final boolean a() {
        return !this.f2620p && this.h.f2804z.isShowing();
    }

    @Override // k.InterfaceC0176y
    public final void b(MenuC0164m menuC0164m, boolean z2) {
        if (menuC0164m != this.f2610c) {
            return;
        }
        dismiss();
        InterfaceC0175x interfaceC0175x = this.f2618n;
        if (interfaceC0175x != null) {
            interfaceC0175x.b(menuC0164m, z2);
        }
    }

    @Override // k.InterfaceC0176y
    public final void c() {
        this.f2621q = false;
        C0161j c0161j = this.d;
        if (c0161j != null) {
            c0161j.notifyDataSetChanged();
        }
    }

    @Override // k.InterfaceC0149C
    public final void dismiss() {
        if (a()) {
            this.h.dismiss();
        }
    }

    @Override // k.InterfaceC0176y
    public final boolean e(SubMenuC0151E subMenuC0151E) {
        if (subMenuC0151E.hasVisibleItems()) {
            View view = this.f2617m;
            C0174w c0174w = new C0174w(this.f2613g, this.f2609b, view, subMenuC0151E, this.f2611e);
            InterfaceC0175x interfaceC0175x = this.f2618n;
            c0174w.h = interfaceC0175x;
            AbstractC0172u abstractC0172u = c0174w.i;
            if (abstractC0172u != null) {
                abstractC0172u.g(interfaceC0175x);
            }
            boolean u2 = AbstractC0172u.u(subMenuC0151E);
            c0174w.f2751g = u2;
            AbstractC0172u abstractC0172u2 = c0174w.i;
            if (abstractC0172u2 != null) {
                abstractC0172u2.o(u2);
            }
            c0174w.f2752j = this.f2615k;
            this.f2615k = null;
            this.f2610c.c(false);
            K0 k0 = this.h;
            int i = k0.f2786f;
            int j2 = k0.j();
            if ((Gravity.getAbsoluteGravity(this.f2623s, this.f2616l.getLayoutDirection()) & 7) == 5) {
                i += this.f2616l.getWidth();
            }
            if (!c0174w.b()) {
                if (c0174w.f2749e != null) {
                    c0174w.d(i, j2, true, true);
                }
            }
            InterfaceC0175x interfaceC0175x2 = this.f2618n;
            if (interfaceC0175x2 != null) {
                interfaceC0175x2.f(subMenuC0151E);
            }
            return true;
        }
        return false;
    }

    @Override // k.InterfaceC0149C
    public final C0233s0 f() {
        return this.h.f2784c;
    }

    @Override // k.InterfaceC0176y
    public final void g(InterfaceC0175x interfaceC0175x) {
        this.f2618n = interfaceC0175x;
    }

    @Override // k.InterfaceC0149C
    public final void i() {
        View view;
        if (a()) {
            return;
        }
        if (this.f2620p || (view = this.f2616l) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.f2617m = view;
        K0 k0 = this.h;
        k0.f2804z.setOnDismissListener(this);
        k0.f2794p = this;
        k0.f2803y = true;
        k0.f2804z.setFocusable(true);
        View view2 = this.f2617m;
        boolean z2 = this.f2619o == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f2619o = viewTreeObserver;
        if (z2) {
            viewTreeObserver.addOnGlobalLayoutListener(this.i);
        }
        view2.addOnAttachStateChangeListener(this.f2614j);
        k0.f2793o = view2;
        k0.f2790l = this.f2623s;
        boolean z3 = this.f2621q;
        Context context = this.f2609b;
        C0161j c0161j = this.d;
        if (!z3) {
            this.f2622r = AbstractC0172u.m(c0161j, context, this.f2612f);
            this.f2621q = true;
        }
        k0.q(this.f2622r);
        k0.f2804z.setInputMethodMode(2);
        Rect rect = this.f2744a;
        k0.f2802x = rect != null ? new Rect(rect) : null;
        k0.i();
        C0233s0 c0233s0 = k0.f2784c;
        c0233s0.setOnKeyListener(this);
        if (this.f2624t) {
            MenuC0164m menuC0164m = this.f2610c;
            if (menuC0164m.f2694m != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) c0233s0, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(menuC0164m.f2694m);
                }
                frameLayout.setEnabled(false);
                c0233s0.addHeaderView(frameLayout, null, false);
            }
        }
        k0.n(c0161j);
        k0.i();
    }

    @Override // k.InterfaceC0176y
    public final boolean k() {
        return false;
    }

    @Override // k.AbstractC0172u
    public final void l(MenuC0164m menuC0164m) {
    }

    @Override // k.AbstractC0172u
    public final void n(View view) {
        this.f2616l = view;
    }

    @Override // k.AbstractC0172u
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
        C0173v c0173v = this.f2615k;
        if (c0173v != null) {
            c0173v.onDismiss();
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

    @Override // k.AbstractC0172u
    public final void p(int i) {
        this.f2623s = i;
    }

    @Override // k.AbstractC0172u
    public final void q(int i) {
        this.h.f2786f = i;
    }

    @Override // k.AbstractC0172u
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.f2615k = (C0173v) onDismissListener;
    }

    @Override // k.AbstractC0172u
    public final void s(boolean z2) {
        this.f2624t = z2;
    }

    @Override // k.AbstractC0172u
    public final void t(int i) {
        this.h.l(i);
    }
}
