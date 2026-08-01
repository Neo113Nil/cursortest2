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
import com.playgen.securelock.R;
import l.C0245t0;
import l.L0;

/* renamed from: k.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnKeyListenerC0147D extends AbstractC0169u implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* renamed from: b, reason: collision with root package name */
    public final Context f2536b;

    /* renamed from: c, reason: collision with root package name */
    public final MenuC0161m f2537c;
    public final C0158j d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f2538e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2539f;

    /* renamed from: g, reason: collision with root package name */
    public final int f2540g;
    public final L0 h;

    /* renamed from: k, reason: collision with root package name */
    public C0170v f2542k;

    /* renamed from: l, reason: collision with root package name */
    public View f2543l;

    /* renamed from: m, reason: collision with root package name */
    public View f2544m;

    /* renamed from: n, reason: collision with root package name */
    public InterfaceC0172x f2545n;

    /* renamed from: o, reason: collision with root package name */
    public ViewTreeObserver f2546o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f2547p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f2548q;

    /* renamed from: r, reason: collision with root package name */
    public int f2549r;

    /* renamed from: t, reason: collision with root package name */
    public boolean f2551t;
    public final ViewTreeObserverOnGlobalLayoutListenerC0152d i = new ViewTreeObserverOnGlobalLayoutListenerC0152d(1, this);

    /* renamed from: j, reason: collision with root package name */
    public final L0.o f2541j = new L0.o(3, this);

    /* renamed from: s, reason: collision with root package name */
    public int f2550s = 0;

    public ViewOnKeyListenerC0147D(int i, Context context, View view, MenuC0161m menuC0161m, boolean z2) {
        this.f2536b = context;
        this.f2537c = menuC0161m;
        this.f2538e = z2;
        this.d = new C0158j(menuC0161m, LayoutInflater.from(context), z2, R.layout.abc_popup_menu_item_layout);
        this.f2540g = i;
        Resources resources = context.getResources();
        this.f2539f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f2543l = view;
        this.h = new L0(context, null, i);
        menuC0161m.b(this, context);
    }

    @Override // k.InterfaceC0146C
    public final boolean a() {
        return !this.f2547p && this.h.f2812z.isShowing();
    }

    @Override // k.InterfaceC0173y
    public final void b(MenuC0161m menuC0161m, boolean z2) {
        if (menuC0161m != this.f2537c) {
            return;
        }
        dismiss();
        InterfaceC0172x interfaceC0172x = this.f2545n;
        if (interfaceC0172x != null) {
            interfaceC0172x.b(menuC0161m, z2);
        }
    }

    @Override // k.InterfaceC0173y
    public final void c() {
        this.f2548q = false;
        C0158j c0158j = this.d;
        if (c0158j != null) {
            c0158j.notifyDataSetChanged();
        }
    }

    @Override // k.InterfaceC0146C
    public final void dismiss() {
        if (a()) {
            this.h.dismiss();
        }
    }

    @Override // k.InterfaceC0173y
    public final boolean e(SubMenuC0148E subMenuC0148E) {
        if (subMenuC0148E.hasVisibleItems()) {
            View view = this.f2544m;
            C0171w c0171w = new C0171w(this.f2540g, this.f2536b, view, subMenuC0148E, this.f2538e);
            InterfaceC0172x interfaceC0172x = this.f2545n;
            c0171w.h = interfaceC0172x;
            AbstractC0169u abstractC0169u = c0171w.i;
            if (abstractC0169u != null) {
                abstractC0169u.g(interfaceC0172x);
            }
            boolean u2 = AbstractC0169u.u(subMenuC0148E);
            c0171w.f2678g = u2;
            AbstractC0169u abstractC0169u2 = c0171w.i;
            if (abstractC0169u2 != null) {
                abstractC0169u2.o(u2);
            }
            c0171w.f2679j = this.f2542k;
            this.f2542k = null;
            this.f2537c.c(false);
            L0 l02 = this.h;
            int i = l02.f2794f;
            int j2 = l02.j();
            if ((Gravity.getAbsoluteGravity(this.f2550s, this.f2543l.getLayoutDirection()) & 7) == 5) {
                i += this.f2543l.getWidth();
            }
            if (!c0171w.b()) {
                if (c0171w.f2676e != null) {
                    c0171w.d(i, j2, true, true);
                }
            }
            InterfaceC0172x interfaceC0172x2 = this.f2545n;
            if (interfaceC0172x2 != null) {
                interfaceC0172x2.f(subMenuC0148E);
            }
            return true;
        }
        return false;
    }

    @Override // k.InterfaceC0146C
    public final C0245t0 f() {
        return this.h.f2792c;
    }

    @Override // k.InterfaceC0173y
    public final void g(InterfaceC0172x interfaceC0172x) {
        this.f2545n = interfaceC0172x;
    }

    @Override // k.InterfaceC0146C
    public final void i() {
        View view;
        if (a()) {
            return;
        }
        if (this.f2547p || (view = this.f2543l) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.f2544m = view;
        L0 l02 = this.h;
        l02.f2812z.setOnDismissListener(this);
        l02.f2802p = this;
        l02.f2811y = true;
        l02.f2812z.setFocusable(true);
        View view2 = this.f2544m;
        boolean z2 = this.f2546o == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f2546o = viewTreeObserver;
        if (z2) {
            viewTreeObserver.addOnGlobalLayoutListener(this.i);
        }
        view2.addOnAttachStateChangeListener(this.f2541j);
        l02.f2801o = view2;
        l02.f2798l = this.f2550s;
        boolean z3 = this.f2548q;
        Context context = this.f2536b;
        C0158j c0158j = this.d;
        if (!z3) {
            this.f2549r = AbstractC0169u.m(c0158j, context, this.f2539f);
            this.f2548q = true;
        }
        l02.q(this.f2549r);
        l02.f2812z.setInputMethodMode(2);
        Rect rect = this.f2671a;
        l02.f2810x = rect != null ? new Rect(rect) : null;
        l02.i();
        C0245t0 c0245t0 = l02.f2792c;
        c0245t0.setOnKeyListener(this);
        if (this.f2551t) {
            MenuC0161m menuC0161m = this.f2537c;
            if (menuC0161m.f2621m != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) c0245t0, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(menuC0161m.f2621m);
                }
                frameLayout.setEnabled(false);
                c0245t0.addHeaderView(frameLayout, null, false);
            }
        }
        l02.n(c0158j);
        l02.i();
    }

    @Override // k.InterfaceC0173y
    public final boolean k() {
        return false;
    }

    @Override // k.AbstractC0169u
    public final void l(MenuC0161m menuC0161m) {
    }

    @Override // k.AbstractC0169u
    public final void n(View view) {
        this.f2543l = view;
    }

    @Override // k.AbstractC0169u
    public final void o(boolean z2) {
        this.d.f2608c = z2;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f2547p = true;
        this.f2537c.c(true);
        ViewTreeObserver viewTreeObserver = this.f2546o;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f2546o = this.f2544m.getViewTreeObserver();
            }
            this.f2546o.removeGlobalOnLayoutListener(this.i);
            this.f2546o = null;
        }
        this.f2544m.removeOnAttachStateChangeListener(this.f2541j);
        C0170v c0170v = this.f2542k;
        if (c0170v != null) {
            c0170v.onDismiss();
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

    @Override // k.AbstractC0169u
    public final void p(int i) {
        this.f2550s = i;
    }

    @Override // k.AbstractC0169u
    public final void q(int i) {
        this.h.f2794f = i;
    }

    @Override // k.AbstractC0169u
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.f2542k = (C0170v) onDismissListener;
    }

    @Override // k.AbstractC0169u
    public final void s(boolean z2) {
        this.f2551t = z2;
    }

    @Override // k.AbstractC0169u
    public final void t(int i) {
        this.h.l(i);
    }
}
