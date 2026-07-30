package g;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.aurifaber.valuta.rotatus.signum.modulus.R;
import h.L;
import h.M;
import java.lang.reflect.Field;
import w.x;

/* loaded from: classes.dex */
public final class s extends l implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* renamed from: f, reason: collision with root package name */
    public final Context f2035f;

    /* renamed from: g, reason: collision with root package name */
    public final j f2036g;

    /* renamed from: h, reason: collision with root package name */
    public final C0136h f2037h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f2038i;

    /* renamed from: j, reason: collision with root package name */
    public final int f2039j;

    /* renamed from: k, reason: collision with root package name */
    public final int f2040k;

    /* renamed from: l, reason: collision with root package name */
    public final M f2041l;

    /* renamed from: m, reason: collision with root package name */
    public final ViewTreeObserverOnGlobalLayoutListenerC0131c f2042m;

    /* renamed from: n, reason: collision with root package name */
    public final ViewOnAttachStateChangeListenerC0132d f2043n;

    /* renamed from: o, reason: collision with root package name */
    public m f2044o;

    /* renamed from: p, reason: collision with root package name */
    public View f2045p;

    /* renamed from: q, reason: collision with root package name */
    public View f2046q;
    public o r;

    /* renamed from: s, reason: collision with root package name */
    public ViewTreeObserver f2047s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f2048t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f2049u;

    /* renamed from: v, reason: collision with root package name */
    public int f2050v;

    /* renamed from: w, reason: collision with root package name */
    public int f2051w = 0;

    /* renamed from: x, reason: collision with root package name */
    public boolean f2052x;

    public s(int i2, Context context, View view, j jVar, boolean z2) {
        int i3 = 1;
        this.f2042m = new ViewTreeObserverOnGlobalLayoutListenerC0131c(this, i3);
        this.f2043n = new ViewOnAttachStateChangeListenerC0132d(this, i3);
        this.f2035f = context;
        this.f2036g = jVar;
        this.f2038i = z2;
        this.f2037h = new C0136h(jVar, LayoutInflater.from(context), z2, R.layout.abc_popup_menu_item_layout);
        this.f2040k = i2;
        Resources resources = context.getResources();
        this.f2039j = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f2045p = view;
        this.f2041l = new M(context, i2);
        jVar.b(this, context);
    }

    @Override // g.p
    public final void a(j jVar, boolean z2) {
        if (jVar != this.f2036g) {
            return;
        }
        dismiss();
        o oVar = this.r;
        if (oVar != null) {
            oVar.a(jVar, z2);
        }
    }

    @Override // g.p
    public final void b() {
        this.f2049u = false;
        C0136h c0136h = this.f2037h;
        if (c0136h != null) {
            c0136h.notifyDataSetChanged();
        }
    }

    @Override // g.r
    public final boolean c() {
        return !this.f2048t && this.f2041l.f2124z.isShowing();
    }

    @Override // g.p
    public final boolean d(t tVar) {
        if (tVar.hasVisibleItems()) {
            n nVar = new n(this.f2040k, this.f2035f, this.f2046q, tVar, this.f2038i);
            o oVar = this.r;
            nVar.f2031h = oVar;
            l lVar = nVar.f2032i;
            if (lVar != null) {
                lVar.f(oVar);
            }
            boolean u2 = l.u(tVar);
            nVar.f2030g = u2;
            l lVar2 = nVar.f2032i;
            if (lVar2 != null) {
                lVar2.o(u2);
            }
            nVar.f2033j = this.f2044o;
            this.f2044o = null;
            this.f2036g.c(false);
            M m2 = this.f2041l;
            int i2 = m2.f2108i;
            int i3 = !m2.f2110k ? 0 : m2.f2109j;
            int i4 = this.f2051w;
            View view = this.f2045p;
            Field field = x.f3075a;
            if ((Gravity.getAbsoluteGravity(i4, view.getLayoutDirection()) & 7) == 5) {
                i2 += this.f2045p.getWidth();
            }
            if (!nVar.b()) {
                if (nVar.f2028e != null) {
                    nVar.d(i2, i3, true, true);
                }
            }
            o oVar2 = this.r;
            if (oVar2 != null) {
                oVar2.m(tVar);
            }
            return true;
        }
        return false;
    }

    @Override // g.r
    public final void dismiss() {
        if (c()) {
            this.f2041l.dismiss();
        }
    }

    @Override // g.r
    public final ListView e() {
        return this.f2041l.f2106g;
    }

    @Override // g.p
    public final void f(o oVar) {
        this.r = oVar;
    }

    @Override // g.r
    public final void g() {
        View view;
        if (c()) {
            return;
        }
        if (this.f2048t || (view = this.f2045p) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.f2046q = view;
        M m2 = this.f2041l;
        m2.f2124z.setOnDismissListener(this);
        m2.f2116q = this;
        m2.f2123y = true;
        m2.f2124z.setFocusable(true);
        View view2 = this.f2046q;
        boolean z2 = this.f2047s == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f2047s = viewTreeObserver;
        if (z2) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f2042m);
        }
        view2.addOnAttachStateChangeListener(this.f2043n);
        m2.f2115p = view2;
        m2.f2113n = this.f2051w;
        boolean z3 = this.f2049u;
        Context context = this.f2035f;
        C0136h c0136h = this.f2037h;
        if (!z3) {
            this.f2050v = l.m(c0136h, context, this.f2039j);
            this.f2049u = true;
        }
        int i2 = this.f2050v;
        Drawable background = m2.f2124z.getBackground();
        if (background != null) {
            Rect rect = m2.f2121w;
            background.getPadding(rect);
            m2.f2107h = rect.left + rect.right + i2;
        } else {
            m2.f2107h = i2;
        }
        m2.f2124z.setInputMethodMode(2);
        Rect rect2 = this.f2022e;
        m2.f2122x = rect2 != null ? new Rect(rect2) : null;
        m2.g();
        L l2 = m2.f2106g;
        l2.setOnKeyListener(this);
        if (this.f2052x) {
            j jVar = this.f2036g;
            if (jVar.f1987l != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) l2, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(jVar.f1987l);
                }
                frameLayout.setEnabled(false);
                l2.addHeaderView(frameLayout, null, false);
            }
        }
        m2.a(c0136h);
        m2.g();
    }

    @Override // g.p
    public final boolean h() {
        return false;
    }

    @Override // g.l
    public final void n(View view) {
        this.f2045p = view;
    }

    @Override // g.l
    public final void o(boolean z2) {
        this.f2037h.f1971g = z2;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f2048t = true;
        this.f2036g.c(true);
        ViewTreeObserver viewTreeObserver = this.f2047s;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f2047s = this.f2046q.getViewTreeObserver();
            }
            this.f2047s.removeGlobalOnLayoutListener(this.f2042m);
            this.f2047s = null;
        }
        this.f2046q.removeOnAttachStateChangeListener(this.f2043n);
        m mVar = this.f2044o;
        if (mVar != null) {
            mVar.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i2, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i2 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // g.l
    public final void p(int i2) {
        this.f2051w = i2;
    }

    @Override // g.l
    public final void q(int i2) {
        this.f2041l.f2108i = i2;
    }

    @Override // g.l
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.f2044o = (m) onDismissListener;
    }

    @Override // g.l
    public final void s(boolean z2) {
        this.f2052x = z2;
    }

    @Override // g.l
    public final void t(int i2) {
        M m2 = this.f2041l;
        m2.f2109j = i2;
        m2.f2110k = true;
    }

    @Override // g.l
    public final void l(j jVar) {
    }
}
