package i;

import I.T;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.Window;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import java.util.WeakHashMap;
import n.C0716j;
import n.n1;
import n.s1;

/* renamed from: i.J, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0508J extends AbstractC0514a {

    /* renamed from: a, reason: collision with root package name */
    public final s1 f5369a;

    /* renamed from: b, reason: collision with root package name */
    public final Window.Callback f5370b;

    /* renamed from: c, reason: collision with root package name */
    public final C0507I f5371c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f5372d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f5373e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f5374f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f5375g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public final F.b f5376h = new F.b(16, this);

    public C0508J(Toolbar toolbar, CharSequence charSequence, WindowCallbackC0536w windowCallbackC0536w) {
        C0507I c0507i = new C0507I(this);
        s1 s1Var = new s1(toolbar, false);
        this.f5369a = s1Var;
        windowCallbackC0536w.getClass();
        this.f5370b = windowCallbackC0536w;
        s1Var.f6895k = windowCallbackC0536w;
        toolbar.setOnMenuItemClickListener(c0507i);
        if (!s1Var.f6892g) {
            s1Var.f6893h = charSequence;
            if ((s1Var.f6887b & 8) != 0) {
                Toolbar toolbar2 = s1Var.f6886a;
                toolbar2.setTitle(charSequence);
                if (s1Var.f6892g) {
                    T.j(toolbar2.getRootView(), charSequence);
                }
            }
        }
        this.f5371c = new C0507I(this);
    }

    @Override // i.AbstractC0514a
    public final boolean a() {
        C0716j c0716j;
        ActionMenuView actionMenuView = this.f5369a.f6886a.f3332d;
        return (actionMenuView == null || (c0716j = actionMenuView.f3196B) == null || !c0716j.c()) ? false : true;
    }

    @Override // i.AbstractC0514a
    public final boolean b() {
        m.o oVar;
        n1 n1Var = this.f5369a.f6886a.f3326U;
        if (n1Var == null || (oVar = n1Var.f6845e) == null) {
            return false;
        }
        if (n1Var == null) {
            oVar = null;
        }
        if (oVar == null) {
            return true;
        }
        oVar.collapseActionView();
        return true;
    }

    @Override // i.AbstractC0514a
    public final void c(boolean z7) {
        if (z7 == this.f5374f) {
            return;
        }
        this.f5374f = z7;
        ArrayList arrayList = this.f5375g;
        if (arrayList.size() > 0) {
            throw C4.p.f(arrayList, 0);
        }
    }

    @Override // i.AbstractC0514a
    public final int d() {
        return this.f5369a.f6887b;
    }

    @Override // i.AbstractC0514a
    public final Context e() {
        return this.f5369a.f6886a.getContext();
    }

    @Override // i.AbstractC0514a
    public final void f() {
        this.f5369a.f6886a.setVisibility(8);
    }

    @Override // i.AbstractC0514a
    public final boolean g() {
        s1 s1Var = this.f5369a;
        Toolbar toolbar = s1Var.f6886a;
        F.b bVar = this.f5376h;
        toolbar.removeCallbacks(bVar);
        Toolbar toolbar2 = s1Var.f6886a;
        WeakHashMap weakHashMap = T.f1153a;
        toolbar2.postOnAnimation(bVar);
        return true;
    }

    @Override // i.AbstractC0514a
    public final boolean h() {
        return this.f5369a.f6886a.getVisibility() == 0;
    }

    @Override // i.AbstractC0514a
    public final void j() {
        this.f5369a.f6886a.removeCallbacks(this.f5376h);
    }

    @Override // i.AbstractC0514a
    public final boolean k(int i2, KeyEvent keyEvent) {
        Menu v7 = v();
        if (v7 == null) {
            return false;
        }
        v7.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
        return v7.performShortcut(i2, keyEvent, 0);
    }

    @Override // i.AbstractC0514a
    public final boolean l(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            m();
        }
        return true;
    }

    @Override // i.AbstractC0514a
    public final boolean m() {
        return this.f5369a.f6886a.u();
    }

    @Override // i.AbstractC0514a
    public final void n(ColorDrawable colorDrawable) {
        Toolbar toolbar = this.f5369a.f6886a;
        WeakHashMap weakHashMap = T.f1153a;
        toolbar.setBackground(colorDrawable);
    }

    @Override // i.AbstractC0514a
    public final void p(boolean z7) {
        int i2 = z7 ? 8 : 0;
        s1 s1Var = this.f5369a;
        s1Var.a((i2 & 8) | (s1Var.f6887b & (-9)));
    }

    @Override // i.AbstractC0514a
    public final void r(CharSequence charSequence) {
        s1 s1Var = this.f5369a;
        s1Var.f6892g = true;
        Toolbar toolbar = s1Var.f6886a;
        s1Var.f6893h = charSequence;
        if ((s1Var.f6887b & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (s1Var.f6892g) {
                T.j(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // i.AbstractC0514a
    public final void s(CharSequence charSequence) {
        s1 s1Var = this.f5369a;
        if (s1Var.f6892g) {
            return;
        }
        Toolbar toolbar = s1Var.f6886a;
        s1Var.f6893h = charSequence;
        if ((s1Var.f6887b & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (s1Var.f6892g) {
                T.j(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // i.AbstractC0514a
    public final void t() {
        this.f5369a.f6886a.setVisibility(0);
    }

    public final Menu v() {
        boolean z7 = this.f5373e;
        s1 s1Var = this.f5369a;
        if (!z7) {
            B6.e eVar = new B6.e(this);
            l2.c cVar = new l2.c(this);
            Toolbar toolbar = s1Var.f6886a;
            toolbar.f3327V = eVar;
            toolbar.f3328W = cVar;
            ActionMenuView actionMenuView = toolbar.f3332d;
            if (actionMenuView != null) {
                actionMenuView.f3197C = eVar;
                actionMenuView.f3198D = cVar;
            }
            this.f5373e = true;
        }
        return s1Var.f6886a.getMenu();
    }

    @Override // i.AbstractC0514a
    public final void i() {
    }

    @Override // i.AbstractC0514a
    public final void o(boolean z7) {
    }

    @Override // i.AbstractC0514a
    public final void q(boolean z7) {
    }
}
