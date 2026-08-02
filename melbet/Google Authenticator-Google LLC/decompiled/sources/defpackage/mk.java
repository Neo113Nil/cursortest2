package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.ActionMenuView;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import com.google.android.apps.authenticator2.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mk {
    public final Toolbar a;
    public int b;
    CharSequence c;
    public Window.Callback d;
    boolean e;
    public hk f;
    private View g;
    private Drawable h;
    private Drawable i;
    private Drawable j;
    private boolean k;
    private CharSequence l;
    private CharSequence m;
    private int n;
    private Drawable o;

    public mk(Toolbar toolbar, boolean z) {
        Drawable drawable;
        this.n = 0;
        this.a = toolbar;
        this.c = toolbar.o;
        this.l = toolbar.p;
        this.k = this.c != null;
        this.j = toolbar.e();
        byo u = byo.u(toolbar.getContext(), null, em.a, R.attr.actionBarStyle, 0);
        int i = 15;
        this.o = u.j(15);
        if (z) {
            CharSequence l = u.l(27);
            if (!TextUtils.isEmpty(l)) {
                h(l);
            }
            CharSequence l2 = u.l(25);
            if (!TextUtils.isEmpty(l2)) {
                this.l = l2;
                if ((this.b & 8) != 0) {
                    toolbar.t(l2);
                }
            }
            Drawable j = u.j(20);
            if (j != null) {
                e(j);
            }
            Drawable j2 = u.j(17);
            if (j2 != null) {
                this.h = j2;
                s();
            }
            if (this.j == null && (drawable = this.o) != null) {
                this.j = drawable;
                r();
            }
            d(u.e(10, 0));
            int h = u.h(9, 0);
            if (h != 0) {
                View inflate = LayoutInflater.from(toolbar.getContext()).inflate(h, (ViewGroup) toolbar, false);
                View view = this.g;
                if (view != null && (this.b & 16) != 0) {
                    toolbar.removeView(view);
                }
                this.g = inflate;
                if (inflate != null && (this.b & 16) != 0) {
                    toolbar.addView(inflate);
                }
                d(this.b | 16);
            }
            int g = u.g(13, 0);
            if (g > 0) {
                ViewGroup.LayoutParams layoutParams = toolbar.getLayoutParams();
                layoutParams.height = g;
                toolbar.setLayoutParams(layoutParams);
            }
            int c = u.c(7, -1);
            int c2 = u.c(3, -1);
            if (c >= 0 || c2 >= 0) {
                int max = Math.max(c, 0);
                int max2 = Math.max(c2, 0);
                toolbar.k();
                toolbar.n.a(max, max2);
            }
            int h2 = u.h(28, 0);
            if (h2 != 0) {
                Context context = toolbar.getContext();
                toolbar.k = h2;
                TextView textView = toolbar.b;
                if (textView != null) {
                    textView.setTextAppearance(context, h2);
                }
            }
            int h3 = u.h(26, 0);
            if (h3 != 0) {
                Context context2 = toolbar.getContext();
                toolbar.l = h3;
                TextView textView2 = toolbar.c;
                if (textView2 != null) {
                    textView2.setTextAppearance(context2, h3);
                }
            }
            int h4 = u.h(22, 0);
            if (h4 != 0) {
                toolbar.s(h4);
            }
        } else {
            if (toolbar.e() != null) {
                this.o = toolbar.e();
            } else {
                i = 11;
            }
            this.b = i;
        }
        u.n();
        if (this.n != R.string.abc_action_bar_up_description) {
            this.n = R.string.abc_action_bar_up_description;
            if (TextUtils.isEmpty(toolbar.h())) {
                g(this.n);
            }
        }
        this.m = toolbar.h();
        toolbar.r(new mi(this));
    }

    private final void p(CharSequence charSequence) {
        this.c = charSequence;
        if ((this.b & 8) != 0) {
            Toolbar toolbar = this.a;
            toolbar.u(charSequence);
            if (this.k) {
                yq.n(toolbar.getRootView(), charSequence);
            }
        }
    }

    private final void q() {
        if ((this.b & 4) != 0) {
            boolean isEmpty = TextUtils.isEmpty(this.m);
            Toolbar toolbar = this.a;
            if (isEmpty) {
                toolbar.o(this.n);
            } else {
                toolbar.p(this.m);
            }
        }
    }

    private final void r() {
        int i = this.b & 4;
        Toolbar toolbar = this.a;
        if (i == 0) {
            toolbar.q(null);
            return;
        }
        Drawable drawable = this.j;
        if (drawable == null) {
            drawable = this.o;
        }
        toolbar.q(drawable);
    }

    private final void s() {
        Drawable drawable;
        int i = this.b;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) == 0 || (drawable = this.i) == null) {
            drawable = this.h;
        }
        this.a.n(drawable);
    }

    public final Context a() {
        return this.a.getContext();
    }

    public final void b() {
        this.a.j();
    }

    public final void c() {
        ActionMenuView actionMenuView = this.a.a;
        if (actionMenuView != null) {
            actionMenuView.h();
        }
    }

    public final void d(int i) {
        View view;
        int i2 = this.b ^ i;
        this.b = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    q();
                }
                r();
            }
            if ((i2 & 3) != 0) {
                s();
            }
            if ((i2 & 8) != 0) {
                int i3 = i & 8;
                Toolbar toolbar = this.a;
                if (i3 != 0) {
                    toolbar.u(this.c);
                    toolbar.t(this.l);
                } else {
                    toolbar.u(null);
                    toolbar.t(null);
                }
            }
            if ((i2 & 16) == 0 || (view = this.g) == null) {
                return;
            }
            int i4 = i & 16;
            Toolbar toolbar2 = this.a;
            if (i4 != 0) {
                toolbar2.addView(view);
            } else {
                toolbar2.removeView(view);
            }
        }
    }

    public final void e(Drawable drawable) {
        this.i = drawable;
        s();
    }

    public final void f() {
        this.e = true;
    }

    public final void g(int i) {
        this.m = i == 0 ? null : a().getString(i);
        q();
    }

    public final void h(CharSequence charSequence) {
        this.k = true;
        p(charSequence);
    }

    public final void i(int i) {
        this.a.setVisibility(i);
    }

    public final void j(CharSequence charSequence) {
        if (this.k) {
            return;
        }
        p(charSequence);
    }

    public final boolean k() {
        return this.a.w();
    }

    public final boolean l() {
        hk hkVar;
        ActionMenuView actionMenuView = this.a.a;
        return (actionMenuView == null || (hkVar = actionMenuView.c) == null || !hkVar.l()) ? false : true;
    }

    public final boolean m() {
        return this.a.x();
    }

    public final boolean n() {
        return this.a.y();
    }

    public final brn o(int i, long j) {
        brn s = yq.s(this.a);
        s.N(i == 0 ? 1.0f : 0.0f);
        s.O(j);
        s.P(new mj(this, i));
        return s;
    }
}
