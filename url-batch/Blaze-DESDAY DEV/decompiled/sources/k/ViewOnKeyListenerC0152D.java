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
import com.winworm.neongrid.R;
import l.C0236s0;
import l.K0;

/* renamed from: k.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnKeyListenerC0152D extends AbstractC0174u implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* renamed from: b, reason: collision with root package name */
    public final Context f2637b;

    /* renamed from: c, reason: collision with root package name */
    public final MenuC0166m f2638c;
    public final C0163j d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f2639e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2640f;

    /* renamed from: g, reason: collision with root package name */
    public final int f2641g;
    public final K0 h;

    /* renamed from: k, reason: collision with root package name */
    public C0175v f2643k;

    /* renamed from: l, reason: collision with root package name */
    public View f2644l;

    /* renamed from: m, reason: collision with root package name */
    public View f2645m;

    /* renamed from: n, reason: collision with root package name */
    public InterfaceC0177x f2646n;

    /* renamed from: o, reason: collision with root package name */
    public ViewTreeObserver f2647o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f2648p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f2649q;

    /* renamed from: r, reason: collision with root package name */
    public int f2650r;

    /* renamed from: t, reason: collision with root package name */
    public boolean f2652t;
    public final ViewTreeObserverOnGlobalLayoutListenerC0157d i = new ViewTreeObserverOnGlobalLayoutListenerC0157d(1, this);

    /* renamed from: j, reason: collision with root package name */
    public final M0.o f2642j = new M0.o(3, this);

    /* renamed from: s, reason: collision with root package name */
    public int f2651s = 0;

    public ViewOnKeyListenerC0152D(int i, Context context, View view, MenuC0166m menuC0166m, boolean z2) {
        this.f2637b = context;
        this.f2638c = menuC0166m;
        this.f2639e = z2;
        this.d = new C0163j(menuC0166m, LayoutInflater.from(context), z2, R.layout.abc_popup_menu_item_layout);
        this.f2641g = i;
        Resources resources = context.getResources();
        this.f2640f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f2644l = view;
        this.h = new K0(context, null, i);
        menuC0166m.b(this, context);
    }

    @Override // k.InterfaceC0151C
    public final boolean a() {
        return !this.f2648p && this.h.f2830z.isShowing();
    }

    @Override // k.InterfaceC0178y
    public final void b(MenuC0166m menuC0166m, boolean z2) {
        if (menuC0166m != this.f2638c) {
            return;
        }
        dismiss();
        InterfaceC0177x interfaceC0177x = this.f2646n;
        if (interfaceC0177x != null) {
            interfaceC0177x.b(menuC0166m, z2);
        }
    }

    @Override // k.InterfaceC0178y
    public final void c() {
        this.f2649q = false;
        C0163j c0163j = this.d;
        if (c0163j != null) {
            c0163j.notifyDataSetChanged();
        }
    }

    @Override // k.InterfaceC0151C
    public final void dismiss() {
        if (a()) {
            this.h.dismiss();
        }
    }

    @Override // k.InterfaceC0151C
    public final C0236s0 e() {
        return this.h.f2810c;
    }

    @Override // k.InterfaceC0178y
    public final boolean f(SubMenuC0153E subMenuC0153E) {
        if (subMenuC0153E.hasVisibleItems()) {
            View view = this.f2645m;
            C0176w c0176w = new C0176w(this.f2641g, this.f2637b, view, subMenuC0153E, this.f2639e);
            InterfaceC0177x interfaceC0177x = this.f2646n;
            c0176w.h = interfaceC0177x;
            AbstractC0174u abstractC0174u = c0176w.i;
            if (abstractC0174u != null) {
                abstractC0174u.g(interfaceC0177x);
            }
            boolean u2 = AbstractC0174u.u(subMenuC0153E);
            c0176w.f2779g = u2;
            AbstractC0174u abstractC0174u2 = c0176w.i;
            if (abstractC0174u2 != null) {
                abstractC0174u2.o(u2);
            }
            c0176w.f2780j = this.f2643k;
            this.f2643k = null;
            this.f2638c.c(false);
            K0 k02 = this.h;
            int i = k02.f2812f;
            int j2 = k02.j();
            if ((Gravity.getAbsoluteGravity(this.f2651s, this.f2644l.getLayoutDirection()) & 7) == 5) {
                i += this.f2644l.getWidth();
            }
            if (!c0176w.b()) {
                if (c0176w.f2777e != null) {
                    c0176w.d(i, j2, true, true);
                }
            }
            InterfaceC0177x interfaceC0177x2 = this.f2646n;
            if (interfaceC0177x2 != null) {
                interfaceC0177x2.g(subMenuC0153E);
            }
            return true;
        }
        return false;
    }

    @Override // k.InterfaceC0178y
    public final void g(InterfaceC0177x interfaceC0177x) {
        this.f2646n = interfaceC0177x;
    }

    @Override // k.InterfaceC0151C
    public final void i() {
        View view;
        if (a()) {
            return;
        }
        if (this.f2648p || (view = this.f2644l) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.f2645m = view;
        K0 k02 = this.h;
        k02.f2830z.setOnDismissListener(this);
        k02.f2820p = this;
        k02.f2829y = true;
        k02.f2830z.setFocusable(true);
        View view2 = this.f2645m;
        boolean z2 = this.f2647o == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f2647o = viewTreeObserver;
        if (z2) {
            viewTreeObserver.addOnGlobalLayoutListener(this.i);
        }
        view2.addOnAttachStateChangeListener(this.f2642j);
        k02.f2819o = view2;
        k02.f2816l = this.f2651s;
        boolean z3 = this.f2649q;
        Context context = this.f2637b;
        C0163j c0163j = this.d;
        if (!z3) {
            this.f2650r = AbstractC0174u.m(c0163j, context, this.f2640f);
            this.f2649q = true;
        }
        k02.q(this.f2650r);
        k02.f2830z.setInputMethodMode(2);
        Rect rect = this.f2772a;
        k02.f2828x = rect != null ? new Rect(rect) : null;
        k02.i();
        C0236s0 c0236s0 = k02.f2810c;
        c0236s0.setOnKeyListener(this);
        if (this.f2652t) {
            MenuC0166m menuC0166m = this.f2638c;
            if (menuC0166m.f2722m != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) c0236s0, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(menuC0166m.f2722m);
                }
                frameLayout.setEnabled(false);
                c0236s0.addHeaderView(frameLayout, null, false);
            }
        }
        k02.n(c0163j);
        k02.i();
    }

    @Override // k.InterfaceC0178y
    public final boolean k() {
        return false;
    }

    @Override // k.AbstractC0174u
    public final void l(MenuC0166m menuC0166m) {
    }

    @Override // k.AbstractC0174u
    public final void n(View view) {
        this.f2644l = view;
    }

    @Override // k.AbstractC0174u
    public final void o(boolean z2) {
        this.d.f2709c = z2;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f2648p = true;
        this.f2638c.c(true);
        ViewTreeObserver viewTreeObserver = this.f2647o;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f2647o = this.f2645m.getViewTreeObserver();
            }
            this.f2647o.removeGlobalOnLayoutListener(this.i);
            this.f2647o = null;
        }
        this.f2645m.removeOnAttachStateChangeListener(this.f2642j);
        C0175v c0175v = this.f2643k;
        if (c0175v != null) {
            c0175v.onDismiss();
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

    @Override // k.AbstractC0174u
    public final void p(int i) {
        this.f2651s = i;
    }

    @Override // k.AbstractC0174u
    public final void q(int i) {
        this.h.f2812f = i;
    }

    @Override // k.AbstractC0174u
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.f2643k = (C0175v) onDismissListener;
    }

    @Override // k.AbstractC0174u
    public final void s(boolean z2) {
        this.f2652t = z2;
    }

    @Override // k.AbstractC0174u
    public final void t(int i) {
        this.h.l(i);
    }
}
