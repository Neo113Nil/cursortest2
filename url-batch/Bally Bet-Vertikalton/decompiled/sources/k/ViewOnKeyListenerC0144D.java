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
import com.skydrop.fallring.R;
import l.C0262t0;
import l.L0;

/* renamed from: k.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnKeyListenerC0144D extends AbstractC0166u implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* renamed from: b, reason: collision with root package name */
    public final Context f2593b;

    /* renamed from: c, reason: collision with root package name */
    public final MenuC0158m f2594c;
    public final C0155j d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f2595e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2596f;

    /* renamed from: g, reason: collision with root package name */
    public final int f2597g;
    public final L0 h;

    /* renamed from: k, reason: collision with root package name */
    public C0167v f2599k;

    /* renamed from: l, reason: collision with root package name */
    public View f2600l;

    /* renamed from: m, reason: collision with root package name */
    public View f2601m;

    /* renamed from: n, reason: collision with root package name */
    public InterfaceC0169x f2602n;

    /* renamed from: o, reason: collision with root package name */
    public ViewTreeObserver f2603o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f2604p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f2605q;

    /* renamed from: r, reason: collision with root package name */
    public int f2606r;

    /* renamed from: t, reason: collision with root package name */
    public boolean f2608t;
    public final ViewTreeObserverOnGlobalLayoutListenerC0149d i = new ViewTreeObserverOnGlobalLayoutListenerC0149d(1, this);

    /* renamed from: j, reason: collision with root package name */
    public final K0.o f2598j = new K0.o(3, this);

    /* renamed from: s, reason: collision with root package name */
    public int f2607s = 0;

    public ViewOnKeyListenerC0144D(int i, Context context, View view, MenuC0158m menuC0158m, boolean z2) {
        this.f2593b = context;
        this.f2594c = menuC0158m;
        this.f2595e = z2;
        this.d = new C0155j(menuC0158m, LayoutInflater.from(context), z2, R.layout.abc_popup_menu_item_layout);
        this.f2597g = i;
        Resources resources = context.getResources();
        this.f2596f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f2600l = view;
        this.h = new L0(context, null, i);
        menuC0158m.b(this, context);
    }

    @Override // k.InterfaceC0143C
    public final boolean a() {
        return !this.f2604p && this.h.f2866z.isShowing();
    }

    @Override // k.InterfaceC0170y
    public final void b(MenuC0158m menuC0158m, boolean z2) {
        if (menuC0158m != this.f2594c) {
            return;
        }
        dismiss();
        InterfaceC0169x interfaceC0169x = this.f2602n;
        if (interfaceC0169x != null) {
            interfaceC0169x.b(menuC0158m, z2);
        }
    }

    @Override // k.InterfaceC0170y
    public final void c() {
        this.f2605q = false;
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
            View view = this.f2601m;
            C0168w c0168w = new C0168w(this.f2597g, this.f2593b, view, subMenuC0145E, this.f2595e);
            InterfaceC0169x interfaceC0169x = this.f2602n;
            c0168w.h = interfaceC0169x;
            AbstractC0166u abstractC0166u = c0168w.i;
            if (abstractC0166u != null) {
                abstractC0166u.g(interfaceC0169x);
            }
            boolean u2 = AbstractC0166u.u(subMenuC0145E);
            c0168w.f2735g = u2;
            AbstractC0166u abstractC0166u2 = c0168w.i;
            if (abstractC0166u2 != null) {
                abstractC0166u2.o(u2);
            }
            c0168w.f2736j = this.f2599k;
            this.f2599k = null;
            this.f2594c.c(false);
            L0 l02 = this.h;
            int i = l02.f2848f;
            int j2 = l02.j();
            if ((Gravity.getAbsoluteGravity(this.f2607s, this.f2600l.getLayoutDirection()) & 7) == 5) {
                i += this.f2600l.getWidth();
            }
            if (!c0168w.b()) {
                if (c0168w.f2733e != null) {
                    c0168w.d(i, j2, true, true);
                }
            }
            InterfaceC0169x interfaceC0169x2 = this.f2602n;
            if (interfaceC0169x2 != null) {
                interfaceC0169x2.f(subMenuC0145E);
            }
            return true;
        }
        return false;
    }

    @Override // k.InterfaceC0143C
    public final C0262t0 f() {
        return this.h.f2846c;
    }

    @Override // k.InterfaceC0170y
    public final void g(InterfaceC0169x interfaceC0169x) {
        this.f2602n = interfaceC0169x;
    }

    @Override // k.InterfaceC0143C
    public final void i() {
        View view;
        if (a()) {
            return;
        }
        if (this.f2604p || (view = this.f2600l) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.f2601m = view;
        L0 l02 = this.h;
        l02.f2866z.setOnDismissListener(this);
        l02.f2856p = this;
        l02.f2865y = true;
        l02.f2866z.setFocusable(true);
        View view2 = this.f2601m;
        boolean z2 = this.f2603o == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f2603o = viewTreeObserver;
        if (z2) {
            viewTreeObserver.addOnGlobalLayoutListener(this.i);
        }
        view2.addOnAttachStateChangeListener(this.f2598j);
        l02.f2855o = view2;
        l02.f2852l = this.f2607s;
        boolean z3 = this.f2605q;
        Context context = this.f2593b;
        C0155j c0155j = this.d;
        if (!z3) {
            this.f2606r = AbstractC0166u.m(c0155j, context, this.f2596f);
            this.f2605q = true;
        }
        l02.r(this.f2606r);
        l02.f2866z.setInputMethodMode(2);
        Rect rect = this.f2728a;
        l02.f2864x = rect != null ? new Rect(rect) : null;
        l02.i();
        C0262t0 c0262t0 = l02.f2846c;
        c0262t0.setOnKeyListener(this);
        if (this.f2608t) {
            MenuC0158m menuC0158m = this.f2594c;
            if (menuC0158m.f2678m != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) c0262t0, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(menuC0158m.f2678m);
                }
                frameLayout.setEnabled(false);
                c0262t0.addHeaderView(frameLayout, null, false);
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
        this.f2600l = view;
    }

    @Override // k.AbstractC0166u
    public final void o(boolean z2) {
        this.d.f2665c = z2;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f2604p = true;
        this.f2594c.c(true);
        ViewTreeObserver viewTreeObserver = this.f2603o;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f2603o = this.f2601m.getViewTreeObserver();
            }
            this.f2603o.removeGlobalOnLayoutListener(this.i);
            this.f2603o = null;
        }
        this.f2601m.removeOnAttachStateChangeListener(this.f2598j);
        C0167v c0167v = this.f2599k;
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
        this.f2607s = i;
    }

    @Override // k.AbstractC0166u
    public final void q(int i) {
        this.h.f2848f = i;
    }

    @Override // k.AbstractC0166u
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.f2599k = (C0167v) onDismissListener;
    }

    @Override // k.AbstractC0166u
    public final void s(boolean z2) {
        this.f2608t = z2;
    }

    @Override // k.AbstractC0166u
    public final void t(int i) {
        this.h.l(i);
    }
}
