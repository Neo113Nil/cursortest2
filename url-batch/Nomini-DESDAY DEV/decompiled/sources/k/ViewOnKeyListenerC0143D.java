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
import com.pairspot.fortunetiles.R;
import l.C0261t0;
import l.L0;

/* renamed from: k.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnKeyListenerC0143D extends AbstractC0165u implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* renamed from: b, reason: collision with root package name */
    public final Context f2587b;

    /* renamed from: c, reason: collision with root package name */
    public final MenuC0157m f2588c;
    public final C0154j d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f2589e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2590f;

    /* renamed from: g, reason: collision with root package name */
    public final int f2591g;
    public final L0 h;

    /* renamed from: k, reason: collision with root package name */
    public C0166v f2593k;

    /* renamed from: l, reason: collision with root package name */
    public View f2594l;

    /* renamed from: m, reason: collision with root package name */
    public View f2595m;

    /* renamed from: n, reason: collision with root package name */
    public InterfaceC0168x f2596n;

    /* renamed from: o, reason: collision with root package name */
    public ViewTreeObserver f2597o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f2598p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f2599q;

    /* renamed from: r, reason: collision with root package name */
    public int f2600r;

    /* renamed from: t, reason: collision with root package name */
    public boolean f2602t;
    public final ViewTreeObserverOnGlobalLayoutListenerC0148d i = new ViewTreeObserverOnGlobalLayoutListenerC0148d(1, this);

    /* renamed from: j, reason: collision with root package name */
    public final K0.o f2592j = new K0.o(3, this);

    /* renamed from: s, reason: collision with root package name */
    public int f2601s = 0;

    public ViewOnKeyListenerC0143D(int i, Context context, View view, MenuC0157m menuC0157m, boolean z2) {
        this.f2587b = context;
        this.f2588c = menuC0157m;
        this.f2589e = z2;
        this.d = new C0154j(menuC0157m, LayoutInflater.from(context), z2, R.layout.abc_popup_menu_item_layout);
        this.f2591g = i;
        Resources resources = context.getResources();
        this.f2590f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f2594l = view;
        this.h = new L0(context, null, i);
        menuC0157m.b(this, context);
    }

    @Override // k.InterfaceC0142C
    public final boolean a() {
        return !this.f2598p && this.h.f2860z.isShowing();
    }

    @Override // k.InterfaceC0169y
    public final void b(MenuC0157m menuC0157m, boolean z2) {
        if (menuC0157m != this.f2588c) {
            return;
        }
        dismiss();
        InterfaceC0168x interfaceC0168x = this.f2596n;
        if (interfaceC0168x != null) {
            interfaceC0168x.b(menuC0157m, z2);
        }
    }

    @Override // k.InterfaceC0169y
    public final void c() {
        this.f2599q = false;
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
            View view = this.f2595m;
            C0167w c0167w = new C0167w(this.f2591g, this.f2587b, view, subMenuC0144E, this.f2589e);
            InterfaceC0168x interfaceC0168x = this.f2596n;
            c0167w.h = interfaceC0168x;
            AbstractC0165u abstractC0165u = c0167w.i;
            if (abstractC0165u != null) {
                abstractC0165u.g(interfaceC0168x);
            }
            boolean u2 = AbstractC0165u.u(subMenuC0144E);
            c0167w.f2729g = u2;
            AbstractC0165u abstractC0165u2 = c0167w.i;
            if (abstractC0165u2 != null) {
                abstractC0165u2.o(u2);
            }
            c0167w.f2730j = this.f2593k;
            this.f2593k = null;
            this.f2588c.c(false);
            L0 l02 = this.h;
            int i = l02.f2842f;
            int j2 = l02.j();
            if ((Gravity.getAbsoluteGravity(this.f2601s, this.f2594l.getLayoutDirection()) & 7) == 5) {
                i += this.f2594l.getWidth();
            }
            if (!c0167w.b()) {
                if (c0167w.f2727e != null) {
                    c0167w.d(i, j2, true, true);
                }
            }
            InterfaceC0168x interfaceC0168x2 = this.f2596n;
            if (interfaceC0168x2 != null) {
                interfaceC0168x2.c(subMenuC0144E);
            }
            return true;
        }
        return false;
    }

    @Override // k.InterfaceC0142C
    public final C0261t0 f() {
        return this.h.f2840c;
    }

    @Override // k.InterfaceC0169y
    public final void g(InterfaceC0168x interfaceC0168x) {
        this.f2596n = interfaceC0168x;
    }

    @Override // k.InterfaceC0142C
    public final void i() {
        View view;
        if (a()) {
            return;
        }
        if (this.f2598p || (view = this.f2594l) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.f2595m = view;
        L0 l02 = this.h;
        l02.f2860z.setOnDismissListener(this);
        l02.f2850p = this;
        l02.f2859y = true;
        l02.f2860z.setFocusable(true);
        View view2 = this.f2595m;
        boolean z2 = this.f2597o == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f2597o = viewTreeObserver;
        if (z2) {
            viewTreeObserver.addOnGlobalLayoutListener(this.i);
        }
        view2.addOnAttachStateChangeListener(this.f2592j);
        l02.f2849o = view2;
        l02.f2846l = this.f2601s;
        boolean z3 = this.f2599q;
        Context context = this.f2587b;
        C0154j c0154j = this.d;
        if (!z3) {
            this.f2600r = AbstractC0165u.m(c0154j, context, this.f2590f);
            this.f2599q = true;
        }
        l02.r(this.f2600r);
        l02.f2860z.setInputMethodMode(2);
        Rect rect = this.f2722a;
        l02.f2858x = rect != null ? new Rect(rect) : null;
        l02.i();
        C0261t0 c0261t0 = l02.f2840c;
        c0261t0.setOnKeyListener(this);
        if (this.f2602t) {
            MenuC0157m menuC0157m = this.f2588c;
            if (menuC0157m.f2672m != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) c0261t0, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(menuC0157m.f2672m);
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
        this.f2594l = view;
    }

    @Override // k.AbstractC0165u
    public final void o(boolean z2) {
        this.d.f2659c = z2;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f2598p = true;
        this.f2588c.c(true);
        ViewTreeObserver viewTreeObserver = this.f2597o;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f2597o = this.f2595m.getViewTreeObserver();
            }
            this.f2597o.removeGlobalOnLayoutListener(this.i);
            this.f2597o = null;
        }
        this.f2595m.removeOnAttachStateChangeListener(this.f2592j);
        C0166v c0166v = this.f2593k;
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
        this.f2601s = i;
    }

    @Override // k.AbstractC0165u
    public final void q(int i) {
        this.h.f2842f = i;
    }

    @Override // k.AbstractC0165u
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.f2593k = (C0166v) onDismissListener;
    }

    @Override // k.AbstractC0165u
    public final void s(boolean z2) {
        this.f2602t = z2;
    }

    @Override // k.AbstractC0165u
    public final void t(int i) {
        this.h.l(i);
    }
}
