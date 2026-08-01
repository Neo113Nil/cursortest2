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
import com.fortuneink.neonpad.R;
import l.C0289u0;
import l.M0;

/* renamed from: k.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnKeyListenerC0186D extends AbstractC0208u implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* renamed from: b, reason: collision with root package name */
    public final Context f2975b;

    /* renamed from: c, reason: collision with root package name */
    public final MenuC0200m f2976c;

    /* renamed from: d, reason: collision with root package name */
    public final C0197j f2977d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f2978e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2979f;

    /* renamed from: g, reason: collision with root package name */
    public final int f2980g;
    public final M0 h;

    /* renamed from: k, reason: collision with root package name */
    public C0209v f2982k;

    /* renamed from: l, reason: collision with root package name */
    public View f2983l;

    /* renamed from: m, reason: collision with root package name */
    public View f2984m;

    /* renamed from: n, reason: collision with root package name */
    public InterfaceC0211x f2985n;

    /* renamed from: o, reason: collision with root package name */
    public ViewTreeObserver f2986o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f2987p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f2988q;

    /* renamed from: r, reason: collision with root package name */
    public int f2989r;

    /* renamed from: t, reason: collision with root package name */
    public boolean f2991t;
    public final ViewTreeObserverOnGlobalLayoutListenerC0191d i = new ViewTreeObserverOnGlobalLayoutListenerC0191d(1, this);

    /* renamed from: j, reason: collision with root package name */
    public final K0.o f2981j = new K0.o(3, this);

    /* renamed from: s, reason: collision with root package name */
    public int f2990s = 0;

    public ViewOnKeyListenerC0186D(int i, Context context, View view, MenuC0200m menuC0200m, boolean z2) {
        this.f2975b = context;
        this.f2976c = menuC0200m;
        this.f2978e = z2;
        this.f2977d = new C0197j(menuC0200m, LayoutInflater.from(context), z2, R.layout.abc_popup_menu_item_layout);
        this.f2980g = i;
        Resources resources = context.getResources();
        this.f2979f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f2983l = view;
        this.h = new M0(context, null, i);
        menuC0200m.b(this, context);
    }

    @Override // k.InterfaceC0185C
    public final boolean a() {
        return !this.f2987p && this.h.f3252z.isShowing();
    }

    @Override // k.InterfaceC0212y
    public final void b(MenuC0200m menuC0200m, boolean z2) {
        if (menuC0200m != this.f2976c) {
            return;
        }
        dismiss();
        InterfaceC0211x interfaceC0211x = this.f2985n;
        if (interfaceC0211x != null) {
            interfaceC0211x.b(menuC0200m, z2);
        }
    }

    @Override // k.InterfaceC0212y
    public final void c() {
        this.f2988q = false;
        C0197j c0197j = this.f2977d;
        if (c0197j != null) {
            c0197j.notifyDataSetChanged();
        }
    }

    @Override // k.InterfaceC0185C
    public final void dismiss() {
        if (a()) {
            this.h.dismiss();
        }
    }

    @Override // k.InterfaceC0212y
    public final boolean e(SubMenuC0187E subMenuC0187E) {
        if (subMenuC0187E.hasVisibleItems()) {
            View view = this.f2984m;
            C0210w c0210w = new C0210w(this.f2980g, this.f2975b, view, subMenuC0187E, this.f2978e);
            InterfaceC0211x interfaceC0211x = this.f2985n;
            c0210w.h = interfaceC0211x;
            AbstractC0208u abstractC0208u = c0210w.i;
            if (abstractC0208u != null) {
                abstractC0208u.g(interfaceC0211x);
            }
            boolean u2 = AbstractC0208u.u(subMenuC0187E);
            c0210w.f3127g = u2;
            AbstractC0208u abstractC0208u2 = c0210w.i;
            if (abstractC0208u2 != null) {
                abstractC0208u2.o(u2);
            }
            c0210w.f3128j = this.f2982k;
            this.f2982k = null;
            this.f2976c.c(false);
            M0 m0 = this.h;
            int i = m0.f3234f;
            int j2 = m0.j();
            if ((Gravity.getAbsoluteGravity(this.f2990s, this.f2983l.getLayoutDirection()) & 7) == 5) {
                i += this.f2983l.getWidth();
            }
            if (!c0210w.b()) {
                if (c0210w.f3125e != null) {
                    c0210w.d(i, j2, true, true);
                }
            }
            InterfaceC0211x interfaceC0211x2 = this.f2985n;
            if (interfaceC0211x2 != null) {
                interfaceC0211x2.f(subMenuC0187E);
            }
            return true;
        }
        return false;
    }

    @Override // k.InterfaceC0185C
    public final C0289u0 f() {
        return this.h.f3231c;
    }

    @Override // k.InterfaceC0212y
    public final void g(InterfaceC0211x interfaceC0211x) {
        this.f2985n = interfaceC0211x;
    }

    @Override // k.InterfaceC0185C
    public final void i() {
        View view;
        if (a()) {
            return;
        }
        if (this.f2987p || (view = this.f2983l) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.f2984m = view;
        M0 m0 = this.h;
        m0.f3252z.setOnDismissListener(this);
        m0.f3242p = this;
        m0.f3251y = true;
        m0.f3252z.setFocusable(true);
        View view2 = this.f2984m;
        boolean z2 = this.f2986o == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f2986o = viewTreeObserver;
        if (z2) {
            viewTreeObserver.addOnGlobalLayoutListener(this.i);
        }
        view2.addOnAttachStateChangeListener(this.f2981j);
        m0.f3241o = view2;
        m0.f3238l = this.f2990s;
        boolean z3 = this.f2988q;
        Context context = this.f2975b;
        C0197j c0197j = this.f2977d;
        if (!z3) {
            this.f2989r = AbstractC0208u.m(c0197j, context, this.f2979f);
            this.f2988q = true;
        }
        m0.r(this.f2989r);
        m0.f3252z.setInputMethodMode(2);
        Rect rect = this.f3119a;
        m0.f3250x = rect != null ? new Rect(rect) : null;
        m0.i();
        C0289u0 c0289u0 = m0.f3231c;
        c0289u0.setOnKeyListener(this);
        if (this.f2991t) {
            MenuC0200m menuC0200m = this.f2976c;
            if (menuC0200m.f3067m != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) c0289u0, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(menuC0200m.f3067m);
                }
                frameLayout.setEnabled(false);
                c0289u0.addHeaderView(frameLayout, null, false);
            }
        }
        m0.n(c0197j);
        m0.i();
    }

    @Override // k.InterfaceC0212y
    public final boolean k() {
        return false;
    }

    @Override // k.AbstractC0208u
    public final void l(MenuC0200m menuC0200m) {
    }

    @Override // k.AbstractC0208u
    public final void n(View view) {
        this.f2983l = view;
    }

    @Override // k.AbstractC0208u
    public final void o(boolean z2) {
        this.f2977d.f3052c = z2;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f2987p = true;
        this.f2976c.c(true);
        ViewTreeObserver viewTreeObserver = this.f2986o;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f2986o = this.f2984m.getViewTreeObserver();
            }
            this.f2986o.removeGlobalOnLayoutListener(this.i);
            this.f2986o = null;
        }
        this.f2984m.removeOnAttachStateChangeListener(this.f2981j);
        C0209v c0209v = this.f2982k;
        if (c0209v != null) {
            c0209v.onDismiss();
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

    @Override // k.AbstractC0208u
    public final void p(int i) {
        this.f2990s = i;
    }

    @Override // k.AbstractC0208u
    public final void q(int i) {
        this.h.f3234f = i;
    }

    @Override // k.AbstractC0208u
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.f2982k = (C0209v) onDismissListener;
    }

    @Override // k.AbstractC0208u
    public final void s(boolean z2) {
        this.f2991t = z2;
    }

    @Override // k.AbstractC0208u
    public final void t(int i) {
        this.h.l(i);
    }
}
