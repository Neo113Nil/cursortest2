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
import com.glasspulse.glasspulse.R;
import l.C0234r0;
import l.J0;

/* renamed from: k.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnKeyListenerC0143D extends AbstractC0165u implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* renamed from: b, reason: collision with root package name */
    public final Context f2572b;

    /* renamed from: c, reason: collision with root package name */
    public final MenuC0157m f2573c;
    public final C0154j d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f2574e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2575f;

    /* renamed from: g, reason: collision with root package name */
    public final int f2576g;
    public final J0 h;

    /* renamed from: k, reason: collision with root package name */
    public C0166v f2578k;

    /* renamed from: l, reason: collision with root package name */
    public View f2579l;

    /* renamed from: m, reason: collision with root package name */
    public View f2580m;

    /* renamed from: n, reason: collision with root package name */
    public InterfaceC0168x f2581n;

    /* renamed from: o, reason: collision with root package name */
    public ViewTreeObserver f2582o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f2583p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f2584q;

    /* renamed from: r, reason: collision with root package name */
    public int f2585r;

    /* renamed from: t, reason: collision with root package name */
    public boolean f2587t;
    public final ViewTreeObserverOnGlobalLayoutListenerC0148d i = new ViewTreeObserverOnGlobalLayoutListenerC0148d(1, this);

    /* renamed from: j, reason: collision with root package name */
    public final P0.n f2577j = new P0.n(3, this);

    /* renamed from: s, reason: collision with root package name */
    public int f2586s = 0;

    public ViewOnKeyListenerC0143D(int i, Context context, View view, MenuC0157m menuC0157m, boolean z2) {
        this.f2572b = context;
        this.f2573c = menuC0157m;
        this.f2574e = z2;
        this.d = new C0154j(menuC0157m, LayoutInflater.from(context), z2, R.layout.abc_popup_menu_item_layout);
        this.f2576g = i;
        Resources resources = context.getResources();
        this.f2575f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f2579l = view;
        this.h = new J0(context, null, i);
        menuC0157m.b(this, context);
    }

    @Override // k.InterfaceC0142C
    public final boolean a() {
        return !this.f2583p && this.h.f2845z.isShowing();
    }

    @Override // k.InterfaceC0169y
    public final void b(MenuC0157m menuC0157m, boolean z2) {
        if (menuC0157m != this.f2573c) {
            return;
        }
        dismiss();
        InterfaceC0168x interfaceC0168x = this.f2581n;
        if (interfaceC0168x != null) {
            interfaceC0168x.b(menuC0157m, z2);
        }
    }

    @Override // k.InterfaceC0169y
    public final void c() {
        this.f2584q = false;
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

    @Override // k.InterfaceC0142C
    public final C0234r0 e() {
        return this.h.f2825c;
    }

    @Override // k.InterfaceC0169y
    public final boolean f(SubMenuC0144E subMenuC0144E) {
        if (subMenuC0144E.hasVisibleItems()) {
            View view = this.f2580m;
            C0167w c0167w = new C0167w(this.f2576g, this.f2572b, view, subMenuC0144E, this.f2574e);
            InterfaceC0168x interfaceC0168x = this.f2581n;
            c0167w.h = interfaceC0168x;
            AbstractC0165u abstractC0165u = c0167w.i;
            if (abstractC0165u != null) {
                abstractC0165u.g(interfaceC0168x);
            }
            boolean u2 = AbstractC0165u.u(subMenuC0144E);
            c0167w.f2714g = u2;
            AbstractC0165u abstractC0165u2 = c0167w.i;
            if (abstractC0165u2 != null) {
                abstractC0165u2.o(u2);
            }
            c0167w.f2715j = this.f2578k;
            this.f2578k = null;
            this.f2573c.c(false);
            J0 j0 = this.h;
            int i = j0.f2827f;
            int j2 = j0.j();
            if ((Gravity.getAbsoluteGravity(this.f2586s, this.f2579l.getLayoutDirection()) & 7) == 5) {
                i += this.f2579l.getWidth();
            }
            if (!c0167w.b()) {
                if (c0167w.f2712e != null) {
                    c0167w.d(i, j2, true, true);
                }
            }
            InterfaceC0168x interfaceC0168x2 = this.f2581n;
            if (interfaceC0168x2 != null) {
                interfaceC0168x2.g(subMenuC0144E);
            }
            return true;
        }
        return false;
    }

    @Override // k.InterfaceC0169y
    public final void g(InterfaceC0168x interfaceC0168x) {
        this.f2581n = interfaceC0168x;
    }

    @Override // k.InterfaceC0142C
    public final void i() {
        View view;
        if (a()) {
            return;
        }
        if (this.f2583p || (view = this.f2579l) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.f2580m = view;
        J0 j0 = this.h;
        j0.f2845z.setOnDismissListener(this);
        j0.f2835p = this;
        j0.f2844y = true;
        j0.f2845z.setFocusable(true);
        View view2 = this.f2580m;
        boolean z2 = this.f2582o == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f2582o = viewTreeObserver;
        if (z2) {
            viewTreeObserver.addOnGlobalLayoutListener(this.i);
        }
        view2.addOnAttachStateChangeListener(this.f2577j);
        j0.f2834o = view2;
        j0.f2831l = this.f2586s;
        boolean z3 = this.f2584q;
        Context context = this.f2572b;
        C0154j c0154j = this.d;
        if (!z3) {
            this.f2585r = AbstractC0165u.m(c0154j, context, this.f2575f);
            this.f2584q = true;
        }
        j0.q(this.f2585r);
        j0.f2845z.setInputMethodMode(2);
        Rect rect = this.f2707a;
        j0.f2843x = rect != null ? new Rect(rect) : null;
        j0.i();
        C0234r0 c0234r0 = j0.f2825c;
        c0234r0.setOnKeyListener(this);
        if (this.f2587t) {
            MenuC0157m menuC0157m = this.f2573c;
            if (menuC0157m.f2657m != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) c0234r0, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(menuC0157m.f2657m);
                }
                frameLayout.setEnabled(false);
                c0234r0.addHeaderView(frameLayout, null, false);
            }
        }
        j0.n(c0154j);
        j0.i();
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
        this.f2579l = view;
    }

    @Override // k.AbstractC0165u
    public final void o(boolean z2) {
        this.d.f2644c = z2;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f2583p = true;
        this.f2573c.c(true);
        ViewTreeObserver viewTreeObserver = this.f2582o;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f2582o = this.f2580m.getViewTreeObserver();
            }
            this.f2582o.removeGlobalOnLayoutListener(this.i);
            this.f2582o = null;
        }
        this.f2580m.removeOnAttachStateChangeListener(this.f2577j);
        C0166v c0166v = this.f2578k;
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
        this.f2586s = i;
    }

    @Override // k.AbstractC0165u
    public final void q(int i) {
        this.h.f2827f = i;
    }

    @Override // k.AbstractC0165u
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.f2578k = (C0166v) onDismissListener;
    }

    @Override // k.AbstractC0165u
    public final void s(boolean z2) {
        this.f2587t = z2;
    }

    @Override // k.AbstractC0165u
    public final void t(int i) {
        this.h.l(i);
    }
}
