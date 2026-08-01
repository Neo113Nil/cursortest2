package m;

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
import com.winpower.neonfit.R;
import n.C0305v0;
import n.N0;

/* renamed from: m.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnKeyListenerC0215D extends AbstractC0237u implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* renamed from: b, reason: collision with root package name */
    public final Context f3272b;

    /* renamed from: c, reason: collision with root package name */
    public final MenuC0229m f3273c;

    /* renamed from: d, reason: collision with root package name */
    public final C0226j f3274d;
    public final boolean e;

    /* renamed from: f, reason: collision with root package name */
    public final int f3275f;

    /* renamed from: g, reason: collision with root package name */
    public final int f3276g;

    /* renamed from: h, reason: collision with root package name */
    public final N0 f3277h;

    /* renamed from: k, reason: collision with root package name */
    public C0238v f3278k;

    /* renamed from: l, reason: collision with root package name */
    public View f3279l;

    /* renamed from: m, reason: collision with root package name */
    public View f3280m;

    /* renamed from: n, reason: collision with root package name */
    public InterfaceC0240x f3281n;

    /* renamed from: o, reason: collision with root package name */
    public ViewTreeObserver f3282o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f3283p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f3284q;

    /* renamed from: r, reason: collision with root package name */
    public int f3285r;

    /* renamed from: t, reason: collision with root package name */
    public boolean f3287t;
    public final ViewTreeObserverOnGlobalLayoutListenerC0220d i = new ViewTreeObserverOnGlobalLayoutListenerC0220d(1, this);
    public final Q0.o j = new Q0.o(3, this);

    /* renamed from: s, reason: collision with root package name */
    public int f3286s = 0;

    public ViewOnKeyListenerC0215D(int i, Context context, View view, MenuC0229m menuC0229m, boolean z2) {
        this.f3272b = context;
        this.f3273c = menuC0229m;
        this.e = z2;
        this.f3274d = new C0226j(menuC0229m, LayoutInflater.from(context), z2, R.layout.abc_popup_menu_item_layout);
        this.f3276g = i;
        Resources resources = context.getResources();
        this.f3275f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f3279l = view;
        this.f3277h = new N0(context, null, i);
        menuC0229m.b(this, context);
    }

    @Override // m.InterfaceC0214C
    public final boolean a() {
        return !this.f3283p && this.f3277h.f3482z.isShowing();
    }

    @Override // m.InterfaceC0241y
    public final void b(MenuC0229m menuC0229m, boolean z2) {
        if (menuC0229m != this.f3273c) {
            return;
        }
        dismiss();
        InterfaceC0240x interfaceC0240x = this.f3281n;
        if (interfaceC0240x != null) {
            interfaceC0240x.b(menuC0229m, z2);
        }
    }

    @Override // m.InterfaceC0241y
    public final void d() {
        this.f3284q = false;
        C0226j c0226j = this.f3274d;
        if (c0226j != null) {
            c0226j.notifyDataSetChanged();
        }
    }

    @Override // m.InterfaceC0214C
    public final void dismiss() {
        if (a()) {
            this.f3277h.dismiss();
        }
    }

    @Override // m.InterfaceC0214C
    public final C0305v0 e() {
        return this.f3277h.f3462c;
    }

    @Override // m.InterfaceC0241y
    public final boolean g() {
        return false;
    }

    @Override // m.InterfaceC0214C
    public final void h() {
        View view;
        if (a()) {
            return;
        }
        if (this.f3283p || (view = this.f3279l) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.f3280m = view;
        N0 n02 = this.f3277h;
        n02.f3482z.setOnDismissListener(this);
        n02.f3472p = this;
        n02.f3481y = true;
        n02.f3482z.setFocusable(true);
        View view2 = this.f3280m;
        boolean z2 = this.f3282o == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f3282o = viewTreeObserver;
        if (z2) {
            viewTreeObserver.addOnGlobalLayoutListener(this.i);
        }
        view2.addOnAttachStateChangeListener(this.j);
        n02.f3471o = view2;
        n02.f3468l = this.f3286s;
        boolean z3 = this.f3284q;
        Context context = this.f3272b;
        C0226j c0226j = this.f3274d;
        if (!z3) {
            this.f3285r = AbstractC0237u.m(c0226j, context, this.f3275f);
            this.f3284q = true;
        }
        n02.r(this.f3285r);
        n02.f3482z.setInputMethodMode(2);
        Rect rect = this.f3408a;
        n02.f3480x = rect != null ? new Rect(rect) : null;
        n02.h();
        C0305v0 c0305v0 = n02.f3462c;
        c0305v0.setOnKeyListener(this);
        if (this.f3287t) {
            MenuC0229m menuC0229m = this.f3273c;
            if (menuC0229m.f3357m != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) c0305v0, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(menuC0229m.f3357m);
                }
                frameLayout.setEnabled(false);
                c0305v0.addHeaderView(frameLayout, null, false);
            }
        }
        n02.o(c0226j);
        n02.h();
    }

    @Override // m.InterfaceC0241y
    public final void i(InterfaceC0240x interfaceC0240x) {
        this.f3281n = interfaceC0240x;
    }

    @Override // m.InterfaceC0241y
    public final boolean k(SubMenuC0216E subMenuC0216E) {
        if (subMenuC0216E.hasVisibleItems()) {
            View view = this.f3280m;
            C0239w c0239w = new C0239w(this.f3276g, this.f3272b, view, subMenuC0216E, this.e);
            InterfaceC0240x interfaceC0240x = this.f3281n;
            c0239w.f3416h = interfaceC0240x;
            AbstractC0237u abstractC0237u = c0239w.i;
            if (abstractC0237u != null) {
                abstractC0237u.i(interfaceC0240x);
            }
            boolean u2 = AbstractC0237u.u(subMenuC0216E);
            c0239w.f3415g = u2;
            AbstractC0237u abstractC0237u2 = c0239w.i;
            if (abstractC0237u2 != null) {
                abstractC0237u2.o(u2);
            }
            c0239w.j = this.f3278k;
            this.f3278k = null;
            this.f3273c.c(false);
            N0 n02 = this.f3277h;
            int i = n02.f3464f;
            int i2 = n02.i();
            if ((Gravity.getAbsoluteGravity(this.f3286s, this.f3279l.getLayoutDirection()) & 7) == 5) {
                i += this.f3279l.getWidth();
            }
            if (!c0239w.b()) {
                if (c0239w.e != null) {
                    c0239w.d(i, i2, true, true);
                }
            }
            InterfaceC0240x interfaceC0240x2 = this.f3281n;
            if (interfaceC0240x2 != null) {
                interfaceC0240x2.g(subMenuC0216E);
            }
            return true;
        }
        return false;
    }

    @Override // m.AbstractC0237u
    public final void l(MenuC0229m menuC0229m) {
    }

    @Override // m.AbstractC0237u
    public final void n(View view) {
        this.f3279l = view;
    }

    @Override // m.AbstractC0237u
    public final void o(boolean z2) {
        this.f3274d.f3344c = z2;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f3283p = true;
        this.f3273c.c(true);
        ViewTreeObserver viewTreeObserver = this.f3282o;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f3282o = this.f3280m.getViewTreeObserver();
            }
            this.f3282o.removeGlobalOnLayoutListener(this.i);
            this.f3282o = null;
        }
        this.f3280m.removeOnAttachStateChangeListener(this.j);
        C0238v c0238v = this.f3278k;
        if (c0238v != null) {
            c0238v.onDismiss();
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

    @Override // m.AbstractC0237u
    public final void p(int i) {
        this.f3286s = i;
    }

    @Override // m.AbstractC0237u
    public final void q(int i) {
        this.f3277h.f3464f = i;
    }

    @Override // m.AbstractC0237u
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.f3278k = (C0238v) onDismissListener;
    }

    @Override // m.AbstractC0237u
    public final void s(boolean z2) {
        this.f3287t = z2;
    }

    @Override // m.AbstractC0237u
    public final void t(int i) {
        this.f3277h.l(i);
    }
}
