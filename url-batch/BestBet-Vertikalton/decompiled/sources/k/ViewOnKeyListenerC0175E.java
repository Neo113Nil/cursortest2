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
import com.fortunequest.neontrack.R;
import l.C0257r0;
import l.J0;

/* renamed from: k.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnKeyListenerC0175E extends AbstractC0198v implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* renamed from: b, reason: collision with root package name */
    public final Context f3087b;

    /* renamed from: c, reason: collision with root package name */
    public final MenuC0189m f3088c;
    public final C0186j d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f3089e;

    /* renamed from: f, reason: collision with root package name */
    public final int f3090f;

    /* renamed from: g, reason: collision with root package name */
    public final int f3091g;
    public final J0 h;

    /* renamed from: k, reason: collision with root package name */
    public C0199w f3093k;

    /* renamed from: l, reason: collision with root package name */
    public View f3094l;

    /* renamed from: m, reason: collision with root package name */
    public View f3095m;

    /* renamed from: n, reason: collision with root package name */
    public InterfaceC0201y f3096n;

    /* renamed from: o, reason: collision with root package name */
    public ViewTreeObserver f3097o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f3098p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f3099q;

    /* renamed from: r, reason: collision with root package name */
    public int f3100r;

    /* renamed from: t, reason: collision with root package name */
    public boolean f3102t;
    public final ViewTreeObserverOnGlobalLayoutListenerC0180d i = new ViewTreeObserverOnGlobalLayoutListenerC0180d(1, this);

    /* renamed from: j, reason: collision with root package name */
    public final U0.n f3092j = new U0.n(3, this);

    /* renamed from: s, reason: collision with root package name */
    public int f3101s = 0;

    public ViewOnKeyListenerC0175E(int i, Context context, View view, MenuC0189m menuC0189m, boolean z2) {
        this.f3087b = context;
        this.f3088c = menuC0189m;
        this.f3089e = z2;
        this.d = new C0186j(menuC0189m, LayoutInflater.from(context), z2, R.layout.abc_popup_menu_item_layout);
        this.f3091g = i;
        Resources resources = context.getResources();
        this.f3090f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f3094l = view;
        this.h = new J0(context, null, i);
        menuC0189m.b(this, context);
    }

    @Override // k.InterfaceC0174D
    public final boolean a() {
        return !this.f3098p && this.h.f3283z.isShowing();
    }

    @Override // k.InterfaceC0202z
    public final void b(MenuC0189m menuC0189m, boolean z2) {
        if (menuC0189m != this.f3088c) {
            return;
        }
        dismiss();
        InterfaceC0201y interfaceC0201y = this.f3096n;
        if (interfaceC0201y != null) {
            interfaceC0201y.b(menuC0189m, z2);
        }
    }

    @Override // k.InterfaceC0202z
    public final void c() {
        this.f3099q = false;
        C0186j c0186j = this.d;
        if (c0186j != null) {
            c0186j.notifyDataSetChanged();
        }
    }

    @Override // k.InterfaceC0174D
    public final void dismiss() {
        if (a()) {
            this.h.dismiss();
        }
    }

    @Override // k.InterfaceC0202z
    public final boolean e(SubMenuC0176F subMenuC0176F) {
        if (subMenuC0176F.hasVisibleItems()) {
            View view = this.f3095m;
            C0200x c0200x = new C0200x(this.f3091g, this.f3087b, view, subMenuC0176F, this.f3089e);
            InterfaceC0201y interfaceC0201y = this.f3096n;
            c0200x.h = interfaceC0201y;
            AbstractC0198v abstractC0198v = c0200x.i;
            if (abstractC0198v != null) {
                abstractC0198v.g(interfaceC0201y);
            }
            boolean u2 = AbstractC0198v.u(subMenuC0176F);
            c0200x.f3230g = u2;
            AbstractC0198v abstractC0198v2 = c0200x.i;
            if (abstractC0198v2 != null) {
                abstractC0198v2.o(u2);
            }
            c0200x.f3231j = this.f3093k;
            this.f3093k = null;
            this.f3088c.c(false);
            J0 j02 = this.h;
            int i = j02.f3265f;
            int j2 = j02.j();
            if ((Gravity.getAbsoluteGravity(this.f3101s, this.f3094l.getLayoutDirection()) & 7) == 5) {
                i += this.f3094l.getWidth();
            }
            if (!c0200x.b()) {
                if (c0200x.f3228e != null) {
                    c0200x.d(i, j2, true, true);
                }
            }
            InterfaceC0201y interfaceC0201y2 = this.f3096n;
            if (interfaceC0201y2 != null) {
                interfaceC0201y2.c(subMenuC0176F);
            }
            return true;
        }
        return false;
    }

    @Override // k.InterfaceC0174D
    public final C0257r0 f() {
        return this.h.f3263c;
    }

    @Override // k.InterfaceC0202z
    public final void g(InterfaceC0201y interfaceC0201y) {
        this.f3096n = interfaceC0201y;
    }

    @Override // k.InterfaceC0174D
    public final void i() {
        View view;
        if (a()) {
            return;
        }
        if (this.f3098p || (view = this.f3094l) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.f3095m = view;
        J0 j02 = this.h;
        j02.f3283z.setOnDismissListener(this);
        j02.f3273p = this;
        j02.f3282y = true;
        j02.f3283z.setFocusable(true);
        View view2 = this.f3095m;
        boolean z2 = this.f3097o == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f3097o = viewTreeObserver;
        if (z2) {
            viewTreeObserver.addOnGlobalLayoutListener(this.i);
        }
        view2.addOnAttachStateChangeListener(this.f3092j);
        j02.f3272o = view2;
        j02.f3269l = this.f3101s;
        boolean z3 = this.f3099q;
        Context context = this.f3087b;
        C0186j c0186j = this.d;
        if (!z3) {
            this.f3100r = AbstractC0198v.m(c0186j, context, this.f3090f);
            this.f3099q = true;
        }
        j02.r(this.f3100r);
        j02.f3283z.setInputMethodMode(2);
        Rect rect = this.f3223a;
        j02.f3281x = rect != null ? new Rect(rect) : null;
        j02.i();
        C0257r0 c0257r0 = j02.f3263c;
        c0257r0.setOnKeyListener(this);
        if (this.f3102t) {
            MenuC0189m menuC0189m = this.f3088c;
            if (menuC0189m.f3172m != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) c0257r0, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(menuC0189m.f3172m);
                }
                frameLayout.setEnabled(false);
                c0257r0.addHeaderView(frameLayout, null, false);
            }
        }
        j02.o(c0186j);
        j02.i();
    }

    @Override // k.InterfaceC0202z
    public final boolean k() {
        return false;
    }

    @Override // k.AbstractC0198v
    public final void l(MenuC0189m menuC0189m) {
    }

    @Override // k.AbstractC0198v
    public final void n(View view) {
        this.f3094l = view;
    }

    @Override // k.AbstractC0198v
    public final void o(boolean z2) {
        this.d.f3159c = z2;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f3098p = true;
        this.f3088c.c(true);
        ViewTreeObserver viewTreeObserver = this.f3097o;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f3097o = this.f3095m.getViewTreeObserver();
            }
            this.f3097o.removeGlobalOnLayoutListener(this.i);
            this.f3097o = null;
        }
        this.f3095m.removeOnAttachStateChangeListener(this.f3092j);
        C0199w c0199w = this.f3093k;
        if (c0199w != null) {
            c0199w.onDismiss();
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

    @Override // k.AbstractC0198v
    public final void p(int i) {
        this.f3101s = i;
    }

    @Override // k.AbstractC0198v
    public final void q(int i) {
        this.h.f3265f = i;
    }

    @Override // k.AbstractC0198v
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.f3093k = (C0199w) onDismissListener;
    }

    @Override // k.AbstractC0198v
    public final void s(boolean z2) {
        this.f3102t = z2;
    }

    @Override // k.AbstractC0198v
    public final void t(int i) {
        this.h.l(i);
    }
}
