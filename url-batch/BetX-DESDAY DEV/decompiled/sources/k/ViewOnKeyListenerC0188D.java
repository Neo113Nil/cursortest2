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
import com.luckyarcade.spinthrow.R;
import l.C0289t0;
import l.L0;

/* renamed from: k.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnKeyListenerC0188D extends AbstractC0210u implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* renamed from: b, reason: collision with root package name */
    public final Context f2979b;

    /* renamed from: c, reason: collision with root package name */
    public final MenuC0202m f2980c;

    /* renamed from: d, reason: collision with root package name */
    public final C0199j f2981d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f2982e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2983f;

    /* renamed from: g, reason: collision with root package name */
    public final int f2984g;
    public final L0 h;

    /* renamed from: k, reason: collision with root package name */
    public C0211v f2986k;

    /* renamed from: l, reason: collision with root package name */
    public View f2987l;

    /* renamed from: m, reason: collision with root package name */
    public View f2988m;

    /* renamed from: n, reason: collision with root package name */
    public InterfaceC0213x f2989n;

    /* renamed from: o, reason: collision with root package name */
    public ViewTreeObserver f2990o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f2991p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f2992q;

    /* renamed from: r, reason: collision with root package name */
    public int f2993r;

    /* renamed from: t, reason: collision with root package name */
    public boolean f2995t;
    public final ViewTreeObserverOnGlobalLayoutListenerC0193d i = new ViewTreeObserverOnGlobalLayoutListenerC0193d(1, this);

    /* renamed from: j, reason: collision with root package name */
    public final K0.o f2985j = new K0.o(3, this);

    /* renamed from: s, reason: collision with root package name */
    public int f2994s = 0;

    public ViewOnKeyListenerC0188D(int i, Context context, View view, MenuC0202m menuC0202m, boolean z2) {
        this.f2979b = context;
        this.f2980c = menuC0202m;
        this.f2982e = z2;
        this.f2981d = new C0199j(menuC0202m, LayoutInflater.from(context), z2, R.layout.abc_popup_menu_item_layout);
        this.f2984g = i;
        Resources resources = context.getResources();
        this.f2983f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f2987l = view;
        this.h = new L0(context, null, i);
        menuC0202m.b(this, context);
    }

    @Override // k.InterfaceC0187C
    public final boolean a() {
        return !this.f2991p && this.h.f3252z.isShowing();
    }

    @Override // k.InterfaceC0214y
    public final void b(MenuC0202m menuC0202m, boolean z2) {
        if (menuC0202m != this.f2980c) {
            return;
        }
        dismiss();
        InterfaceC0213x interfaceC0213x = this.f2989n;
        if (interfaceC0213x != null) {
            interfaceC0213x.b(menuC0202m, z2);
        }
    }

    @Override // k.InterfaceC0214y
    public final void c() {
        this.f2992q = false;
        C0199j c0199j = this.f2981d;
        if (c0199j != null) {
            c0199j.notifyDataSetChanged();
        }
    }

    @Override // k.InterfaceC0187C
    public final void dismiss() {
        if (a()) {
            this.h.dismiss();
        }
    }

    @Override // k.InterfaceC0187C
    public final C0289t0 e() {
        return this.h.f3231c;
    }

    @Override // k.InterfaceC0214y
    public final boolean f(SubMenuC0189E subMenuC0189E) {
        if (subMenuC0189E.hasVisibleItems()) {
            View view = this.f2988m;
            C0212w c0212w = new C0212w(this.f2984g, this.f2979b, view, subMenuC0189E, this.f2982e);
            InterfaceC0213x interfaceC0213x = this.f2989n;
            c0212w.h = interfaceC0213x;
            AbstractC0210u abstractC0210u = c0212w.i;
            if (abstractC0210u != null) {
                abstractC0210u.g(interfaceC0213x);
            }
            boolean u2 = AbstractC0210u.u(subMenuC0189E);
            c0212w.f3131g = u2;
            AbstractC0210u abstractC0210u2 = c0212w.i;
            if (abstractC0210u2 != null) {
                abstractC0210u2.o(u2);
            }
            c0212w.f3132j = this.f2986k;
            this.f2986k = null;
            this.f2980c.c(false);
            L0 l02 = this.h;
            int i = l02.f3234f;
            int j2 = l02.j();
            if ((Gravity.getAbsoluteGravity(this.f2994s, this.f2987l.getLayoutDirection()) & 7) == 5) {
                i += this.f2987l.getWidth();
            }
            if (!c0212w.b()) {
                if (c0212w.f3129e != null) {
                    c0212w.d(i, j2, true, true);
                }
            }
            InterfaceC0213x interfaceC0213x2 = this.f2989n;
            if (interfaceC0213x2 != null) {
                interfaceC0213x2.g(subMenuC0189E);
            }
            return true;
        }
        return false;
    }

    @Override // k.InterfaceC0214y
    public final void g(InterfaceC0213x interfaceC0213x) {
        this.f2989n = interfaceC0213x;
    }

    @Override // k.InterfaceC0187C
    public final void i() {
        View view;
        if (a()) {
            return;
        }
        if (this.f2991p || (view = this.f2987l) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.f2988m = view;
        L0 l02 = this.h;
        l02.f3252z.setOnDismissListener(this);
        l02.f3242p = this;
        l02.f3251y = true;
        l02.f3252z.setFocusable(true);
        View view2 = this.f2988m;
        boolean z2 = this.f2990o == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f2990o = viewTreeObserver;
        if (z2) {
            viewTreeObserver.addOnGlobalLayoutListener(this.i);
        }
        view2.addOnAttachStateChangeListener(this.f2985j);
        l02.f3241o = view2;
        l02.f3238l = this.f2994s;
        boolean z3 = this.f2992q;
        Context context = this.f2979b;
        C0199j c0199j = this.f2981d;
        if (!z3) {
            this.f2993r = AbstractC0210u.m(c0199j, context, this.f2983f);
            this.f2992q = true;
        }
        l02.q(this.f2993r);
        l02.f3252z.setInputMethodMode(2);
        Rect rect = this.f3123a;
        l02.f3250x = rect != null ? new Rect(rect) : null;
        l02.i();
        C0289t0 c0289t0 = l02.f3231c;
        c0289t0.setOnKeyListener(this);
        if (this.f2995t) {
            MenuC0202m menuC0202m = this.f2980c;
            if (menuC0202m.f3071m != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) c0289t0, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(menuC0202m.f3071m);
                }
                frameLayout.setEnabled(false);
                c0289t0.addHeaderView(frameLayout, null, false);
            }
        }
        l02.n(c0199j);
        l02.i();
    }

    @Override // k.InterfaceC0214y
    public final boolean k() {
        return false;
    }

    @Override // k.AbstractC0210u
    public final void l(MenuC0202m menuC0202m) {
    }

    @Override // k.AbstractC0210u
    public final void n(View view) {
        this.f2987l = view;
    }

    @Override // k.AbstractC0210u
    public final void o(boolean z2) {
        this.f2981d.f3056c = z2;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f2991p = true;
        this.f2980c.c(true);
        ViewTreeObserver viewTreeObserver = this.f2990o;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f2990o = this.f2988m.getViewTreeObserver();
            }
            this.f2990o.removeGlobalOnLayoutListener(this.i);
            this.f2990o = null;
        }
        this.f2988m.removeOnAttachStateChangeListener(this.f2985j);
        C0211v c0211v = this.f2986k;
        if (c0211v != null) {
            c0211v.onDismiss();
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

    @Override // k.AbstractC0210u
    public final void p(int i) {
        this.f2994s = i;
    }

    @Override // k.AbstractC0210u
    public final void q(int i) {
        this.h.f3234f = i;
    }

    @Override // k.AbstractC0210u
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.f2986k = (C0211v) onDismissListener;
    }

    @Override // k.AbstractC0210u
    public final void s(boolean z2) {
        this.f2995t = z2;
    }

    @Override // k.AbstractC0210u
    public final void t(int i) {
        this.h.l(i);
    }
}
