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
import k.C0202o;
import l.C0268k;
import l.Z0;
import l.e1;

/* loaded from: classes.dex */
public final class J extends AbstractC0148a {

    /* renamed from: a, reason: collision with root package name */
    public final e1 f2497a;

    /* renamed from: b, reason: collision with root package name */
    public final x f2498b;

    /* renamed from: c, reason: collision with root package name */
    public final C0147I f2499c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2500d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2501e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2502f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f2503g = new ArrayList();
    public final K0.B h = new K0.B(9, this);

    public J(Toolbar toolbar, CharSequence charSequence, x xVar) {
        C0147I c0147i = new C0147I(this);
        toolbar.getClass();
        e1 e1Var = new e1(toolbar, false);
        this.f2497a = e1Var;
        xVar.getClass();
        this.f2498b = xVar;
        e1Var.f3360k = xVar;
        toolbar.setOnMenuItemClickListener(c0147i);
        if (!e1Var.f3358g) {
            e1Var.h = charSequence;
            if ((e1Var.f3353b & 8) != 0) {
                Toolbar toolbar2 = e1Var.f3352a;
                toolbar2.setTitle(charSequence);
                if (e1Var.f3358g) {
                    X.m(toolbar2.getRootView(), charSequence);
                }
            }
        }
        this.f2499c = new C0147I(this);
    }

    @Override // g.AbstractC0148a
    public final boolean a() {
        C0268k c0268k;
        ActionMenuView actionMenuView = this.f2497a.f3352a.f1080a;
        return (actionMenuView == null || (c0268k = actionMenuView.f1040t) == null || !c0268k.f()) ? false : true;
    }

    @Override // g.AbstractC0148a
    public final boolean b() {
        C0202o c0202o;
        Z0 z02 = this.f2497a.f3352a.f1072M;
        if (z02 == null || (c0202o = z02.f3318b) == null) {
            return false;
        }
        if (z02 == null) {
            c0202o = null;
        }
        if (c0202o == null) {
            return true;
        }
        c0202o.collapseActionView();
        return true;
    }

    @Override // g.AbstractC0148a
    public final void c(boolean z2) {
        if (z2 == this.f2502f) {
            return;
        }
        this.f2502f = z2;
        ArrayList arrayList = this.f2503g;
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    @Override // g.AbstractC0148a
    public final int d() {
        return this.f2497a.f3353b;
    }

    @Override // g.AbstractC0148a
    public final Context e() {
        return this.f2497a.f3352a.getContext();
    }

    @Override // g.AbstractC0148a
    public final boolean f() {
        e1 e1Var = this.f2497a;
        Toolbar toolbar = e1Var.f3352a;
        K0.B b2 = this.h;
        toolbar.removeCallbacks(b2);
        Toolbar toolbar2 = e1Var.f3352a;
        WeakHashMap weakHashMap = X.f418a;
        toolbar2.postOnAnimation(b2);
        return true;
    }

    @Override // g.AbstractC0148a
    public final void g() {
    }

    @Override // g.AbstractC0148a
    public final void h() {
        this.f2497a.f3352a.removeCallbacks(this.h);
    }

    @Override // g.AbstractC0148a
    public final boolean i(int i, KeyEvent keyEvent) {
        Menu p2 = p();
        if (p2 == null) {
            return false;
        }
        p2.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return p2.performShortcut(i, keyEvent, 0);
    }

    @Override // g.AbstractC0148a
    public final boolean j(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            k();
        }
        return true;
    }

    @Override // g.AbstractC0148a
    public final boolean k() {
        return this.f2497a.f3352a.v();
    }

    @Override // g.AbstractC0148a
    public final void l(boolean z2) {
    }

    @Override // g.AbstractC0148a
    public final void m(boolean z2) {
    }

    @Override // g.AbstractC0148a
    public final void n(CharSequence charSequence) {
        e1 e1Var = this.f2497a;
        if (e1Var.f3358g) {
            return;
        }
        e1Var.h = charSequence;
        if ((e1Var.f3353b & 8) != 0) {
            Toolbar toolbar = e1Var.f3352a;
            toolbar.setTitle(charSequence);
            if (e1Var.f3358g) {
                X.m(toolbar.getRootView(), charSequence);
            }
        }
    }

    public final Menu p() {
        boolean z2 = this.f2501e;
        e1 e1Var = this.f2497a;
        if (!z2) {
            I.g gVar = new I.g(this);
            C0147I c0147i = new C0147I(this);
            Toolbar toolbar = e1Var.f3352a;
            toolbar.f1073N = gVar;
            toolbar.f1074O = c0147i;
            ActionMenuView actionMenuView = toolbar.f1080a;
            if (actionMenuView != null) {
                actionMenuView.f1041u = gVar;
                actionMenuView.f1042v = c0147i;
            }
            this.f2501e = true;
        }
        return e1Var.f3352a.getMenu();
    }
}
