package h;

import O.X;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import g1.C4524d;
import java.util.ArrayList;
import java.util.WeakHashMap;
import m.C4743k;
import m.T0;
import m.Y0;

/* renamed from: h.H, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4541H extends AbstractC4542a {

    /* renamed from: a, reason: collision with root package name */
    public final Y0 f38031a;

    /* renamed from: b, reason: collision with root package name */
    public final x f38032b;

    /* renamed from: c, reason: collision with root package name */
    public final I0.j f38033c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f38034d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f38035e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f38036f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f38037g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public final F3.C f38038h = new F3.C(22, this);

    public C4541H(Toolbar toolbar, CharSequence charSequence, x xVar) {
        C4524d c4524d = new C4524d(21, this);
        Y0 y02 = new Y0(toolbar, false);
        this.f38031a = y02;
        xVar.getClass();
        this.f38032b = xVar;
        y02.f39362k = xVar;
        toolbar.setOnMenuItemClickListener(c4524d);
        if (!y02.f39359g) {
            y02.f39360h = charSequence;
            if ((y02.f39354b & 8) != 0) {
                Toolbar toolbar2 = y02.f39353a;
                toolbar2.setTitle(charSequence);
                if (y02.f39359g) {
                    X.p(toolbar2.getRootView(), charSequence);
                }
            }
        }
        this.f38033c = new I0.j(29, this);
    }

    @Override // h.AbstractC4542a
    public final boolean a() {
        C4743k c4743k;
        ActionMenuView actionMenuView = this.f38031a.f39353a.f4724n;
        return (actionMenuView == null || (c4743k = actionMenuView.f4677M) == null || !c4743k.f()) ? false : true;
    }

    @Override // h.AbstractC4542a
    public final boolean b() {
        l.n nVar;
        T0 t02 = this.f38031a.f39353a.f4735v0;
        if (t02 == null || (nVar = t02.f39331u) == null) {
            return false;
        }
        if (t02 == null) {
            nVar = null;
        }
        if (nVar == null) {
            return true;
        }
        nVar.collapseActionView();
        return true;
    }

    @Override // h.AbstractC4542a
    public final void c(boolean z8) {
        if (z8 == this.f38036f) {
            return;
        }
        this.f38036f = z8;
        ArrayList arrayList = this.f38037g;
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    @Override // h.AbstractC4542a
    public final int d() {
        return this.f38031a.f39354b;
    }

    @Override // h.AbstractC4542a
    public final Context e() {
        return this.f38031a.f39353a.getContext();
    }

    @Override // h.AbstractC4542a
    public final boolean f() {
        Y0 y02 = this.f38031a;
        Toolbar toolbar = y02.f39353a;
        F3.C c4 = this.f38038h;
        toolbar.removeCallbacks(c4);
        Toolbar toolbar2 = y02.f39353a;
        WeakHashMap weakHashMap = X.f2240a;
        toolbar2.postOnAnimation(c4);
        return true;
    }

    @Override // h.AbstractC4542a
    public final void h() {
        this.f38031a.f39353a.removeCallbacks(this.f38038h);
    }

    @Override // h.AbstractC4542a
    public final boolean i(int i, KeyEvent keyEvent) {
        Menu t9 = t();
        if (t9 == null) {
            return false;
        }
        t9.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
        return t9.performShortcut(i, keyEvent, 0);
    }

    @Override // h.AbstractC4542a
    public final boolean j(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            k();
        }
        return true;
    }

    @Override // h.AbstractC4542a
    public final boolean k() {
        return this.f38031a.f39353a.v();
    }

    @Override // h.AbstractC4542a
    public final void m(boolean z8) {
        Y0 y02 = this.f38031a;
        y02.a((y02.f39354b & (-5)) | 4);
    }

    @Override // h.AbstractC4542a
    public final void n(int i) {
        this.f38031a.b(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [android.graphics.drawable.Drawable] */
    @Override // h.AbstractC4542a
    public final void o(j.a aVar) {
        Y0 y02 = this.f38031a;
        y02.f39358f = aVar;
        int i = y02.f39354b & 4;
        Toolbar toolbar = y02.f39353a;
        j.a aVar2 = aVar;
        if (i == 0) {
            toolbar.setNavigationIcon((Drawable) null);
            return;
        }
        if (aVar == null) {
            aVar2 = y02.f39366o;
        }
        toolbar.setNavigationIcon(aVar2);
    }

    @Override // h.AbstractC4542a
    public final void r(CharSequence charSequence) {
        Y0 y02 = this.f38031a;
        if (y02.f39359g) {
            return;
        }
        y02.f39360h = charSequence;
        if ((y02.f39354b & 8) != 0) {
            Toolbar toolbar = y02.f39353a;
            toolbar.setTitle(charSequence);
            if (y02.f39359g) {
                X.p(toolbar.getRootView(), charSequence);
            }
        }
    }

    public final Menu t() {
        boolean z8 = this.f38035e;
        Y0 y02 = this.f38031a;
        if (!z8) {
            M.h hVar = new M.h(this);
            h4.c cVar = new h4.c(29, this);
            Toolbar toolbar = y02.f39353a;
            toolbar.f4737w0 = hVar;
            toolbar.f4739x0 = cVar;
            ActionMenuView actionMenuView = toolbar.f4724n;
            if (actionMenuView != null) {
                actionMenuView.f4678N = hVar;
                actionMenuView.f4679O = cVar;
            }
            this.f38035e = true;
        }
        return y02.f39353a.getMenu();
    }

    @Override // h.AbstractC4542a
    public final void g() {
    }

    @Override // h.AbstractC4542a
    public final void p() {
    }

    @Override // h.AbstractC4542a
    public final void l(boolean z8) {
    }

    @Override // h.AbstractC4542a
    public final void q(boolean z8) {
    }
}
