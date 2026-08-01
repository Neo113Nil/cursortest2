package g;

import K.X;
import android.content.Context;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import java.util.WeakHashMap;
import k.C0204o;
import l.C0270k;
import l.Y0;
import l.d1;

/* loaded from: classes.dex */
public final class J extends AbstractC0149a {

    /* renamed from: a, reason: collision with root package name */
    public final d1 f2501a;

    /* renamed from: b, reason: collision with root package name */
    public final x f2502b;

    /* renamed from: c, reason: collision with root package name */
    public final C0148I f2503c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2504d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2505e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2506f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f2507g = new ArrayList();
    public final K0.B h = new K0.B(9, this);

    public J(Toolbar toolbar, CharSequence charSequence, x xVar) {
        C0148I c0148i = new C0148I(this);
        toolbar.getClass();
        d1 d1Var = new d1(toolbar, false);
        this.f2501a = d1Var;
        xVar.getClass();
        this.f2502b = xVar;
        d1Var.f3360k = xVar;
        toolbar.setOnMenuItemClickListener(c0148i);
        if (!d1Var.f3358g) {
            d1Var.h = charSequence;
            if ((d1Var.f3353b & 8) != 0) {
                Toolbar toolbar2 = d1Var.f3352a;
                toolbar2.setTitle(charSequence);
                if (d1Var.f3358g) {
                    X.m(toolbar2.getRootView(), charSequence);
                }
            }
        }
        this.f2503c = new C0148I(this);
    }

    @Override // g.AbstractC0149a
    public final boolean a() {
        C0270k c0270k;
        ActionMenuView actionMenuView = this.f2501a.f3352a.f1081a;
        return (actionMenuView == null || (c0270k = actionMenuView.f1041t) == null || !c0270k.e()) ? false : true;
    }

    @Override // g.AbstractC0149a
    public final boolean b() {
        C0204o c0204o;
        Y0 y02 = this.f2501a.f3352a.f1073M;
        if (y02 == null || (c0204o = y02.f3318b) == null) {
            return false;
        }
        if (y02 == null) {
            c0204o = null;
        }
        if (c0204o == null) {
            return true;
        }
        c0204o.collapseActionView();
        return true;
    }

    @Override // g.AbstractC0149a
    public final void c(boolean z2) {
        if (z2 == this.f2506f) {
            return;
        }
        this.f2506f = z2;
        ArrayList arrayList = this.f2507g;
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    @Override // g.AbstractC0149a
    public final int d() {
        return this.f2501a.f3353b;
    }

    @Override // g.AbstractC0149a
    public final Context e() {
        return this.f2501a.f3352a.getContext();
    }

    @Override // g.AbstractC0149a
    public final boolean f() {
        d1 d1Var = this.f2501a;
        Toolbar toolbar = d1Var.f3352a;
        K0.B b2 = this.h;
        toolbar.removeCallbacks(b2);
        Toolbar toolbar2 = d1Var.f3352a;
        WeakHashMap weakHashMap = X.f419a;
        toolbar2.postOnAnimation(b2);
        return true;
    }

    @Override // g.AbstractC0149a
    public final void g() {
    }

    @Override // g.AbstractC0149a
    public final void h() {
        this.f2501a.f3352a.removeCallbacks(this.h);
    }

    @Override // g.AbstractC0149a
    public final boolean i(int i, KeyEvent keyEvent) {
        Menu p2 = p();
        if (p2 == null) {
            return false;
        }
        p2.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return p2.performShortcut(i, keyEvent, 0);
    }

    @Override // g.AbstractC0149a
    public final boolean j(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            k();
        }
        return true;
    }

    @Override // g.AbstractC0149a
    public final boolean k() {
        return this.f2501a.f3352a.v();
    }

    @Override // g.AbstractC0149a
    public final void l(boolean z2) {
    }

    @Override // g.AbstractC0149a
    public final void m(boolean z2) {
    }

    @Override // g.AbstractC0149a
    public final void n(CharSequence charSequence) {
        d1 d1Var = this.f2501a;
        if (d1Var.f3358g) {
            return;
        }
        d1Var.h = charSequence;
        if ((d1Var.f3353b & 8) != 0) {
            Toolbar toolbar = d1Var.f3352a;
            toolbar.setTitle(charSequence);
            if (d1Var.f3358g) {
                X.m(toolbar.getRootView(), charSequence);
            }
        }
    }

    public final Menu p() {
        boolean z2 = this.f2505e;
        d1 d1Var = this.f2501a;
        if (!z2) {
            I.g gVar = new I.g(this);
            C0148I c0148i = new C0148I(this);
            Toolbar toolbar = d1Var.f3352a;
            toolbar.f1074N = gVar;
            toolbar.f1075O = c0148i;
            ActionMenuView actionMenuView = toolbar.f1081a;
            if (actionMenuView != null) {
                actionMenuView.f1042u = gVar;
                actionMenuView.f1043v = c0148i;
            }
            this.f2505e = true;
        }
        return d1Var.f3352a.getMenu();
    }
}
