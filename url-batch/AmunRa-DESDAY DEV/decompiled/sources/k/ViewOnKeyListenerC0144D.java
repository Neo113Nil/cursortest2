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
import com.visualfortune.eyerest.R;
import l.C0242t0;
import l.L0;

/* renamed from: k.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnKeyListenerC0144D extends AbstractC0166u implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* renamed from: b, reason: collision with root package name */
    public final Context f2526b;

    /* renamed from: c, reason: collision with root package name */
    public final MenuC0158m f2527c;
    public final C0155j d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f2528e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2529f;

    /* renamed from: g, reason: collision with root package name */
    public final int f2530g;
    public final L0 h;

    /* renamed from: k, reason: collision with root package name */
    public C0167v f2532k;

    /* renamed from: l, reason: collision with root package name */
    public View f2533l;

    /* renamed from: m, reason: collision with root package name */
    public View f2534m;

    /* renamed from: n, reason: collision with root package name */
    public InterfaceC0169x f2535n;

    /* renamed from: o, reason: collision with root package name */
    public ViewTreeObserver f2536o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f2537p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f2538q;

    /* renamed from: r, reason: collision with root package name */
    public int f2539r;

    /* renamed from: t, reason: collision with root package name */
    public boolean f2541t;
    public final ViewTreeObserverOnGlobalLayoutListenerC0149d i = new ViewTreeObserverOnGlobalLayoutListenerC0149d(1, this);

    /* renamed from: j, reason: collision with root package name */
    public final L0.o f2531j = new L0.o(3, this);

    /* renamed from: s, reason: collision with root package name */
    public int f2540s = 0;

    public ViewOnKeyListenerC0144D(int i, Context context, View view, MenuC0158m menuC0158m, boolean z2) {
        this.f2526b = context;
        this.f2527c = menuC0158m;
        this.f2528e = z2;
        this.d = new C0155j(menuC0158m, LayoutInflater.from(context), z2, R.layout.abc_popup_menu_item_layout);
        this.f2530g = i;
        Resources resources = context.getResources();
        this.f2529f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f2533l = view;
        this.h = new L0(context, null, i);
        menuC0158m.b(this, context);
    }

    @Override // k.InterfaceC0143C
    public final boolean a() {
        return !this.f2537p && this.h.f2961z.isShowing();
    }

    @Override // k.InterfaceC0170y
    public final void b(MenuC0158m menuC0158m, boolean z2) {
        if (menuC0158m != this.f2527c) {
            return;
        }
        dismiss();
        InterfaceC0169x interfaceC0169x = this.f2535n;
        if (interfaceC0169x != null) {
            interfaceC0169x.b(menuC0158m, z2);
        }
    }

    @Override // k.InterfaceC0170y
    public final void c() {
        this.f2538q = false;
        C0155j c0155j = this.d;
        if (c0155j != null) {
            c0155j.notifyDataSetChanged();
        }
    }

    @Override // k.InterfaceC0143C
    public final void dismiss() {
        if (a()) {
            this.h.dismiss();
        }
    }

    @Override // k.InterfaceC0170y
    public final boolean e(SubMenuC0145E subMenuC0145E) {
        if (subMenuC0145E.hasVisibleItems()) {
            View view = this.f2534m;
            C0168w c0168w = new C0168w(this.f2530g, this.f2526b, view, subMenuC0145E, this.f2528e);
            InterfaceC0169x interfaceC0169x = this.f2535n;
            c0168w.h = interfaceC0169x;
            AbstractC0166u abstractC0166u = c0168w.i;
            if (abstractC0166u != null) {
                abstractC0166u.g(interfaceC0169x);
            }
            boolean u2 = AbstractC0166u.u(subMenuC0145E);
            c0168w.f2668g = u2;
            AbstractC0166u abstractC0166u2 = c0168w.i;
            if (abstractC0166u2 != null) {
                abstractC0166u2.o(u2);
            }
            c0168w.f2669j = this.f2532k;
            this.f2532k = null;
            this.f2527c.c(false);
            L0 l02 = this.h;
            int i = l02.f2943f;
            int j2 = l02.j();
            if ((Gravity.getAbsoluteGravity(this.f2540s, this.f2533l.getLayoutDirection()) & 7) == 5) {
                i += this.f2533l.getWidth();
            }
            if (!c0168w.b()) {
                if (c0168w.f2666e != null) {
                    c0168w.d(i, j2, true, true);
                }
            }
            InterfaceC0169x interfaceC0169x2 = this.f2535n;
            if (interfaceC0169x2 != null) {
                interfaceC0169x2.f(subMenuC0145E);
            }
            return true;
        }
        return false;
    }

    @Override // k.InterfaceC0143C
    public final C0242t0 f() {
        return this.h.f2941c;
    }

    @Override // k.InterfaceC0170y
    public final void g(InterfaceC0169x interfaceC0169x) {
        this.f2535n = interfaceC0169x;
    }

    @Override // k.InterfaceC0143C
    public final void i() {
        View view;
        if (a()) {
            return;
        }
        if (this.f2537p || (view = this.f2533l) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.f2534m = view;
        L0 l02 = this.h;
        l02.f2961z.setOnDismissListener(this);
        l02.f2951p = this;
        l02.f2960y = true;
        l02.f2961z.setFocusable(true);
        View view2 = this.f2534m;
        boolean z2 = this.f2536o == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f2536o = viewTreeObserver;
        if (z2) {
            viewTreeObserver.addOnGlobalLayoutListener(this.i);
        }
        view2.addOnAttachStateChangeListener(this.f2531j);
        l02.f2950o = view2;
        l02.f2947l = this.f2540s;
        boolean z3 = this.f2538q;
        Context context = this.f2526b;
        C0155j c0155j = this.d;
        if (!z3) {
            this.f2539r = AbstractC0166u.m(c0155j, context, this.f2529f);
            this.f2538q = true;
        }
        l02.r(this.f2539r);
        l02.f2961z.setInputMethodMode(2);
        Rect rect = this.f2661a;
        l02.f2959x = rect != null ? new Rect(rect) : null;
        l02.i();
        C0242t0 c0242t0 = l02.f2941c;
        c0242t0.setOnKeyListener(this);
        if (this.f2541t) {
            MenuC0158m menuC0158m = this.f2527c;
            if (menuC0158m.f2611m != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) c0242t0, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(menuC0158m.f2611m);
                }
                frameLayout.setEnabled(false);
                c0242t0.addHeaderView(frameLayout, null, false);
            }
        }
        l02.n(c0155j);
        l02.i();
    }

    @Override // k.InterfaceC0170y
    public final boolean k() {
        return false;
    }

    @Override // k.AbstractC0166u
    public final void l(MenuC0158m menuC0158m) {
    }

    @Override // k.AbstractC0166u
    public final void n(View view) {
        this.f2533l = view;
    }

    @Override // k.AbstractC0166u
    public final void o(boolean z2) {
        this.d.f2598c = z2;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f2537p = true;
        this.f2527c.c(true);
        ViewTreeObserver viewTreeObserver = this.f2536o;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f2536o = this.f2534m.getViewTreeObserver();
            }
            this.f2536o.removeGlobalOnLayoutListener(this.i);
            this.f2536o = null;
        }
        this.f2534m.removeOnAttachStateChangeListener(this.f2531j);
        C0167v c0167v = this.f2532k;
        if (c0167v != null) {
            c0167v.onDismiss();
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

    @Override // k.AbstractC0166u
    public final void p(int i) {
        this.f2540s = i;
    }

    @Override // k.AbstractC0166u
    public final void q(int i) {
        this.h.f2943f = i;
    }

    @Override // k.AbstractC0166u
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.f2532k = (C0167v) onDismissListener;
    }

    @Override // k.AbstractC0166u
    public final void s(boolean z2) {
        this.f2541t = z2;
    }

    @Override // k.AbstractC0166u
    public final void t(int i) {
        this.h.l(i);
    }
}
