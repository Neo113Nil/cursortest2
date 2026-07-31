package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.j;
import androidx.core.view.AbstractC1281a0;
import androidx.core.view.AbstractC1305m0;
import androidx.core.view.C1301k0;
import e.AbstractC2405a;
import f.AbstractC2415a;
import j.C3180a;

/* loaded from: classes.dex */
public class d0 implements A {

    /* renamed from: a, reason: collision with root package name */
    Toolbar f10876a;

    /* renamed from: b, reason: collision with root package name */
    private int f10877b;

    /* renamed from: c, reason: collision with root package name */
    private View f10878c;

    /* renamed from: d, reason: collision with root package name */
    private View f10879d;

    /* renamed from: e, reason: collision with root package name */
    private Drawable f10880e;

    /* renamed from: f, reason: collision with root package name */
    private Drawable f10881f;

    /* renamed from: g, reason: collision with root package name */
    private Drawable f10882g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f10883h;

    /* renamed from: i, reason: collision with root package name */
    CharSequence f10884i;

    /* renamed from: j, reason: collision with root package name */
    private CharSequence f10885j;

    /* renamed from: k, reason: collision with root package name */
    private CharSequence f10886k;

    /* renamed from: l, reason: collision with root package name */
    Window.Callback f10887l;

    /* renamed from: m, reason: collision with root package name */
    boolean f10888m;

    /* renamed from: n, reason: collision with root package name */
    private ActionMenuPresenter f10889n;

    /* renamed from: o, reason: collision with root package name */
    private int f10890o;

    /* renamed from: p, reason: collision with root package name */
    private int f10891p;

    /* renamed from: q, reason: collision with root package name */
    private Drawable f10892q;

    class a implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        final C3180a f10893a;

        a() {
            this.f10893a = new C3180a(d0.this.f10876a.getContext(), 0, R.id.home, 0, 0, d0.this.f10884i);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            d0 d0Var = d0.this;
            Window.Callback callback = d0Var.f10887l;
            if (callback == null || !d0Var.f10888m) {
                return;
            }
            callback.onMenuItemSelected(0, this.f10893a);
        }
    }

    class b extends AbstractC1305m0 {

        /* renamed from: a, reason: collision with root package name */
        private boolean f10895a = false;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f10896b;

        b(int i4) {
            this.f10896b = i4;
        }

        @Override // androidx.core.view.AbstractC1305m0, androidx.core.view.InterfaceC1303l0
        public void a(View view) {
            this.f10895a = true;
        }

        @Override // androidx.core.view.InterfaceC1303l0
        public void b(View view) {
            if (this.f10895a) {
                return;
            }
            d0.this.f10876a.setVisibility(this.f10896b);
        }

        @Override // androidx.core.view.AbstractC1305m0, androidx.core.view.InterfaceC1303l0
        public void c(View view) {
            d0.this.f10876a.setVisibility(0);
        }
    }

    public d0(Toolbar toolbar, boolean z4) {
        this(toolbar, z4, e.h.f36342a, e.e.f36267n);
    }

    private void G(CharSequence charSequence) {
        this.f10884i = charSequence;
        if ((this.f10877b & 8) != 0) {
            this.f10876a.setTitle(charSequence);
            if (this.f10883h) {
                AbstractC1281a0.r0(this.f10876a.getRootView(), charSequence);
            }
        }
    }

    private void H() {
        if ((this.f10877b & 4) != 0) {
            if (TextUtils.isEmpty(this.f10886k)) {
                this.f10876a.setNavigationContentDescription(this.f10891p);
            } else {
                this.f10876a.setNavigationContentDescription(this.f10886k);
            }
        }
    }

    private void I() {
        if ((this.f10877b & 4) == 0) {
            this.f10876a.setNavigationIcon((Drawable) null);
            return;
        }
        Toolbar toolbar = this.f10876a;
        Drawable drawable = this.f10882g;
        if (drawable == null) {
            drawable = this.f10892q;
        }
        toolbar.setNavigationIcon(drawable);
    }

    private void J() {
        Drawable drawable;
        int i4 = this.f10877b;
        if ((i4 & 2) == 0) {
            drawable = null;
        } else if ((i4 & 1) != 0) {
            drawable = this.f10881f;
            if (drawable == null) {
                drawable = this.f10880e;
            }
        } else {
            drawable = this.f10880e;
        }
        this.f10876a.setLogo(drawable);
    }

    private int x() {
        if (this.f10876a.getNavigationIcon() == null) {
            return 11;
        }
        this.f10892q = this.f10876a.getNavigationIcon();
        return 15;
    }

    public void A(Drawable drawable) {
        this.f10881f = drawable;
        J();
    }

    public void B(int i4) {
        C(i4 == 0 ? null : getContext().getString(i4));
    }

    public void C(CharSequence charSequence) {
        this.f10886k = charSequence;
        H();
    }

    public void D(Drawable drawable) {
        this.f10882g = drawable;
        I();
    }

    public void E(CharSequence charSequence) {
        this.f10885j = charSequence;
        if ((this.f10877b & 8) != 0) {
            this.f10876a.setSubtitle(charSequence);
        }
    }

    public void F(CharSequence charSequence) {
        this.f10883h = true;
        G(charSequence);
    }

    @Override // androidx.appcompat.widget.A
    public void a(Menu menu, j.a aVar) {
        if (this.f10889n == null) {
            ActionMenuPresenter actionMenuPresenter = new ActionMenuPresenter(this.f10876a.getContext());
            this.f10889n = actionMenuPresenter;
            actionMenuPresenter.p(e.f.f36302g);
        }
        this.f10889n.f(aVar);
        this.f10876a.setMenu((androidx.appcompat.view.menu.e) menu, this.f10889n);
    }

    @Override // androidx.appcompat.widget.A
    public boolean b() {
        return this.f10876a.isOverflowMenuShowing();
    }

    @Override // androidx.appcompat.widget.A
    public void c() {
        this.f10888m = true;
    }

    @Override // androidx.appcompat.widget.A
    public void collapseActionView() {
        this.f10876a.collapseActionView();
    }

    @Override // androidx.appcompat.widget.A
    public boolean d() {
        return this.f10876a.canShowOverflowMenu();
    }

    @Override // androidx.appcompat.widget.A
    public boolean e() {
        return this.f10876a.isOverflowMenuShowPending();
    }

    @Override // androidx.appcompat.widget.A
    public boolean f() {
        return this.f10876a.hideOverflowMenu();
    }

    @Override // androidx.appcompat.widget.A
    public boolean g() {
        return this.f10876a.showOverflowMenu();
    }

    @Override // androidx.appcompat.widget.A
    public Context getContext() {
        return this.f10876a.getContext();
    }

    @Override // androidx.appcompat.widget.A
    public CharSequence getTitle() {
        return this.f10876a.getTitle();
    }

    @Override // androidx.appcompat.widget.A
    public void h() {
        this.f10876a.dismissPopupMenus();
    }

    @Override // androidx.appcompat.widget.A
    public void i(S s4) {
        View view = this.f10878c;
        if (view != null) {
            ViewParent parent = view.getParent();
            Toolbar toolbar = this.f10876a;
            if (parent == toolbar) {
                toolbar.removeView(this.f10878c);
            }
        }
        this.f10878c = s4;
    }

    @Override // androidx.appcompat.widget.A
    public boolean j() {
        return this.f10876a.hasExpandedActionView();
    }

    @Override // androidx.appcompat.widget.A
    public void k(int i4) {
        View view;
        int i5 = this.f10877b ^ i4;
        this.f10877b = i4;
        if (i5 != 0) {
            if ((i5 & 4) != 0) {
                if ((i4 & 4) != 0) {
                    H();
                }
                I();
            }
            if ((i5 & 3) != 0) {
                J();
            }
            if ((i5 & 8) != 0) {
                if ((i4 & 8) != 0) {
                    this.f10876a.setTitle(this.f10884i);
                    this.f10876a.setSubtitle(this.f10885j);
                } else {
                    this.f10876a.setTitle((CharSequence) null);
                    this.f10876a.setSubtitle((CharSequence) null);
                }
            }
            if ((i5 & 16) == 0 || (view = this.f10879d) == null) {
                return;
            }
            if ((i4 & 16) != 0) {
                this.f10876a.addView(view);
            } else {
                this.f10876a.removeView(view);
            }
        }
    }

    @Override // androidx.appcompat.widget.A
    public Menu l() {
        return this.f10876a.getMenu();
    }

    @Override // androidx.appcompat.widget.A
    public void m(int i4) {
        A(i4 != 0 ? AbstractC2415a.b(getContext(), i4) : null);
    }

    @Override // androidx.appcompat.widget.A
    public int n() {
        return this.f10890o;
    }

    @Override // androidx.appcompat.widget.A
    public C1301k0 o(int i4, long j4) {
        return AbstractC1281a0.e(this.f10876a).b(i4 == 0 ? 1.0f : 0.0f).e(j4).g(new b(i4));
    }

    @Override // androidx.appcompat.widget.A
    public void p(j.a aVar, e.a aVar2) {
        this.f10876a.setMenuCallbacks(aVar, aVar2);
    }

    @Override // androidx.appcompat.widget.A
    public void q(int i4) {
        this.f10876a.setVisibility(i4);
    }

    @Override // androidx.appcompat.widget.A
    public ViewGroup r() {
        return this.f10876a;
    }

    @Override // androidx.appcompat.widget.A
    public void s(boolean z4) {
    }

    @Override // androidx.appcompat.widget.A
    public void setIcon(int i4) {
        setIcon(i4 != 0 ? AbstractC2415a.b(getContext(), i4) : null);
    }

    @Override // androidx.appcompat.widget.A
    public void setWindowCallback(Window.Callback callback) {
        this.f10887l = callback;
    }

    @Override // androidx.appcompat.widget.A
    public void setWindowTitle(CharSequence charSequence) {
        if (this.f10883h) {
            return;
        }
        G(charSequence);
    }

    @Override // androidx.appcompat.widget.A
    public int t() {
        return this.f10877b;
    }

    @Override // androidx.appcompat.widget.A
    public void u() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // androidx.appcompat.widget.A
    public void v() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // androidx.appcompat.widget.A
    public void w(boolean z4) {
        this.f10876a.setCollapsible(z4);
    }

    public void y(View view) {
        View view2 = this.f10879d;
        if (view2 != null && (this.f10877b & 16) != 0) {
            this.f10876a.removeView(view2);
        }
        this.f10879d = view;
        if (view == null || (this.f10877b & 16) == 0) {
            return;
        }
        this.f10876a.addView(view);
    }

    public void z(int i4) {
        if (i4 == this.f10891p) {
            return;
        }
        this.f10891p = i4;
        if (TextUtils.isEmpty(this.f10876a.getNavigationContentDescription())) {
            B(this.f10891p);
        }
    }

    public d0(Toolbar toolbar, boolean z4, int i4, int i5) {
        Drawable drawable;
        this.f10890o = 0;
        this.f10891p = 0;
        this.f10876a = toolbar;
        this.f10884i = toolbar.getTitle();
        this.f10885j = toolbar.getSubtitle();
        this.f10883h = this.f10884i != null;
        this.f10882g = toolbar.getNavigationIcon();
        Z v4 = Z.v(toolbar.getContext(), null, e.j.f36470a, AbstractC2405a.f36189c, 0);
        this.f10892q = v4.g(e.j.f36525l);
        if (z4) {
            CharSequence p4 = v4.p(e.j.f36555r);
            if (!TextUtils.isEmpty(p4)) {
                F(p4);
            }
            CharSequence p5 = v4.p(e.j.f36545p);
            if (!TextUtils.isEmpty(p5)) {
                E(p5);
            }
            Drawable g4 = v4.g(e.j.f36535n);
            if (g4 != null) {
                A(g4);
            }
            Drawable g5 = v4.g(e.j.f36530m);
            if (g5 != null) {
                setIcon(g5);
            }
            if (this.f10882g == null && (drawable = this.f10892q) != null) {
                D(drawable);
            }
            k(v4.k(e.j.f36505h, 0));
            int n4 = v4.n(e.j.f36500g, 0);
            if (n4 != 0) {
                y(LayoutInflater.from(this.f10876a.getContext()).inflate(n4, (ViewGroup) this.f10876a, false));
                k(this.f10877b | 16);
            }
            int m4 = v4.m(e.j.f36515j, 0);
            if (m4 > 0) {
                ViewGroup.LayoutParams layoutParams = this.f10876a.getLayoutParams();
                layoutParams.height = m4;
                this.f10876a.setLayoutParams(layoutParams);
            }
            int e4 = v4.e(e.j.f36495f, -1);
            int e5 = v4.e(e.j.f36490e, -1);
            if (e4 >= 0 || e5 >= 0) {
                this.f10876a.setContentInsetsRelative(Math.max(e4, 0), Math.max(e5, 0));
            }
            int n5 = v4.n(e.j.f36560s, 0);
            if (n5 != 0) {
                Toolbar toolbar2 = this.f10876a;
                toolbar2.setTitleTextAppearance(toolbar2.getContext(), n5);
            }
            int n6 = v4.n(e.j.f36550q, 0);
            if (n6 != 0) {
                Toolbar toolbar3 = this.f10876a;
                toolbar3.setSubtitleTextAppearance(toolbar3.getContext(), n6);
            }
            int n7 = v4.n(e.j.f36540o, 0);
            if (n7 != 0) {
                this.f10876a.setPopupTheme(n7);
            }
        } else {
            this.f10877b = x();
        }
        v4.x();
        z(i4);
        this.f10886k = this.f10876a.getNavigationContentDescription();
        this.f10876a.setNavigationOnClickListener(new a());
    }

    @Override // androidx.appcompat.widget.A
    public void setIcon(Drawable drawable) {
        this.f10880e = drawable;
        J();
    }
}
