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
import com.neonpulse.gridlogic.R;
import l.C0242s0;
import l.K0;

/* renamed from: k.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnKeyListenerC0146D extends AbstractC0168u implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* renamed from: b, reason: collision with root package name */
    public final Context f2585b;

    /* renamed from: c, reason: collision with root package name */
    public final MenuC0160m f2586c;
    public final C0157j d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f2587e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2588f;

    /* renamed from: g, reason: collision with root package name */
    public final int f2589g;
    public final K0 h;

    /* renamed from: k, reason: collision with root package name */
    public C0169v f2591k;

    /* renamed from: l, reason: collision with root package name */
    public View f2592l;

    /* renamed from: m, reason: collision with root package name */
    public View f2593m;

    /* renamed from: n, reason: collision with root package name */
    public InterfaceC0171x f2594n;

    /* renamed from: o, reason: collision with root package name */
    public ViewTreeObserver f2595o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f2596p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f2597q;

    /* renamed from: r, reason: collision with root package name */
    public int f2598r;

    /* renamed from: t, reason: collision with root package name */
    public boolean f2600t;
    public final ViewTreeObserverOnGlobalLayoutListenerC0151d i = new ViewTreeObserverOnGlobalLayoutListenerC0151d(1, this);

    /* renamed from: j, reason: collision with root package name */
    public final L0.o f2590j = new L0.o(3, this);

    /* renamed from: s, reason: collision with root package name */
    public int f2599s = 0;

    public ViewOnKeyListenerC0146D(int i, Context context, View view, MenuC0160m menuC0160m, boolean z2) {
        this.f2585b = context;
        this.f2586c = menuC0160m;
        this.f2587e = z2;
        this.d = new C0157j(menuC0160m, LayoutInflater.from(context), z2, R.layout.abc_popup_menu_item_layout);
        this.f2589g = i;
        Resources resources = context.getResources();
        this.f2588f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f2592l = view;
        this.h = new K0(context, null, i);
        menuC0160m.b(this, context);
    }

    @Override // k.InterfaceC0145C
    public final boolean a() {
        return !this.f2596p && this.h.f2866z.isShowing();
    }

    @Override // k.InterfaceC0172y
    public final void b(MenuC0160m menuC0160m, boolean z2) {
        if (menuC0160m != this.f2586c) {
            return;
        }
        dismiss();
        InterfaceC0171x interfaceC0171x = this.f2594n;
        if (interfaceC0171x != null) {
            interfaceC0171x.b(menuC0160m, z2);
        }
    }

    @Override // k.InterfaceC0172y
    public final void c() {
        this.f2597q = false;
        C0157j c0157j = this.d;
        if (c0157j != null) {
            c0157j.notifyDataSetChanged();
        }
    }

    @Override // k.InterfaceC0145C
    public final void dismiss() {
        if (a()) {
            this.h.dismiss();
        }
    }

    @Override // k.InterfaceC0145C
    public final C0242s0 e() {
        return this.h.f2846c;
    }

    @Override // k.InterfaceC0172y
    public final boolean f(SubMenuC0147E subMenuC0147E) {
        if (subMenuC0147E.hasVisibleItems()) {
            View view = this.f2593m;
            C0170w c0170w = new C0170w(this.f2589g, this.f2585b, view, subMenuC0147E, this.f2587e);
            InterfaceC0171x interfaceC0171x = this.f2594n;
            c0170w.h = interfaceC0171x;
            AbstractC0168u abstractC0168u = c0170w.i;
            if (abstractC0168u != null) {
                abstractC0168u.g(interfaceC0171x);
            }
            boolean u2 = AbstractC0168u.u(subMenuC0147E);
            c0170w.f2727g = u2;
            AbstractC0168u abstractC0168u2 = c0170w.i;
            if (abstractC0168u2 != null) {
                abstractC0168u2.o(u2);
            }
            c0170w.f2728j = this.f2591k;
            this.f2591k = null;
            this.f2586c.c(false);
            K0 k02 = this.h;
            int i = k02.f2848f;
            int j2 = k02.j();
            if ((Gravity.getAbsoluteGravity(this.f2599s, this.f2592l.getLayoutDirection()) & 7) == 5) {
                i += this.f2592l.getWidth();
            }
            if (!c0170w.b()) {
                if (c0170w.f2725e != null) {
                    c0170w.d(i, j2, true, true);
                }
            }
            InterfaceC0171x interfaceC0171x2 = this.f2594n;
            if (interfaceC0171x2 != null) {
                interfaceC0171x2.h(subMenuC0147E);
            }
            return true;
        }
        return false;
    }

    @Override // k.InterfaceC0172y
    public final void g(InterfaceC0171x interfaceC0171x) {
        this.f2594n = interfaceC0171x;
    }

    @Override // k.InterfaceC0145C
    public final void i() {
        View view;
        if (a()) {
            return;
        }
        if (this.f2596p || (view = this.f2592l) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.f2593m = view;
        K0 k02 = this.h;
        k02.f2866z.setOnDismissListener(this);
        k02.f2856p = this;
        k02.f2865y = true;
        k02.f2866z.setFocusable(true);
        View view2 = this.f2593m;
        boolean z2 = this.f2595o == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f2595o = viewTreeObserver;
        if (z2) {
            viewTreeObserver.addOnGlobalLayoutListener(this.i);
        }
        view2.addOnAttachStateChangeListener(this.f2590j);
        k02.f2855o = view2;
        k02.f2852l = this.f2599s;
        boolean z3 = this.f2597q;
        Context context = this.f2585b;
        C0157j c0157j = this.d;
        if (!z3) {
            this.f2598r = AbstractC0168u.m(c0157j, context, this.f2588f);
            this.f2597q = true;
        }
        k02.q(this.f2598r);
        k02.f2866z.setInputMethodMode(2);
        Rect rect = this.f2720a;
        k02.f2864x = rect != null ? new Rect(rect) : null;
        k02.i();
        C0242s0 c0242s0 = k02.f2846c;
        c0242s0.setOnKeyListener(this);
        if (this.f2600t) {
            MenuC0160m menuC0160m = this.f2586c;
            if (menuC0160m.f2670m != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) c0242s0, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(menuC0160m.f2670m);
                }
                frameLayout.setEnabled(false);
                c0242s0.addHeaderView(frameLayout, null, false);
            }
        }
        k02.n(c0157j);
        k02.i();
    }

    @Override // k.InterfaceC0172y
    public final boolean k() {
        return false;
    }

    @Override // k.AbstractC0168u
    public final void l(MenuC0160m menuC0160m) {
    }

    @Override // k.AbstractC0168u
    public final void n(View view) {
        this.f2592l = view;
    }

    @Override // k.AbstractC0168u
    public final void o(boolean z2) {
        this.d.f2657c = z2;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f2596p = true;
        this.f2586c.c(true);
        ViewTreeObserver viewTreeObserver = this.f2595o;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f2595o = this.f2593m.getViewTreeObserver();
            }
            this.f2595o.removeGlobalOnLayoutListener(this.i);
            this.f2595o = null;
        }
        this.f2593m.removeOnAttachStateChangeListener(this.f2590j);
        C0169v c0169v = this.f2591k;
        if (c0169v != null) {
            c0169v.onDismiss();
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

    @Override // k.AbstractC0168u
    public final void p(int i) {
        this.f2599s = i;
    }

    @Override // k.AbstractC0168u
    public final void q(int i) {
        this.h.f2848f = i;
    }

    @Override // k.AbstractC0168u
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.f2591k = (C0169v) onDismissListener;
    }

    @Override // k.AbstractC0168u
    public final void s(boolean z2) {
        this.f2600t = z2;
    }

    @Override // k.AbstractC0168u
    public final void t(int i) {
        this.h.l(i);
    }
}
