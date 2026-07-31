package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.AppCompatDelegateImpl;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.d0;
import androidx.core.view.AbstractC1281a0;
import java.util.ArrayList;

/* loaded from: classes.dex */
class y extends AbstractC1250a {

    /* renamed from: a, reason: collision with root package name */
    final androidx.appcompat.widget.A f10210a;

    /* renamed from: b, reason: collision with root package name */
    final Window.Callback f10211b;

    /* renamed from: c, reason: collision with root package name */
    final AppCompatDelegateImpl.g f10212c;

    /* renamed from: d, reason: collision with root package name */
    boolean f10213d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f10214e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f10215f;

    /* renamed from: g, reason: collision with root package name */
    private ArrayList f10216g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    private final Runnable f10217h = new a();

    /* renamed from: i, reason: collision with root package name */
    private final Toolbar.h f10218i;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            y.this.w();
        }
    }

    class b implements Toolbar.h {
        b() {
        }

        @Override // androidx.appcompat.widget.Toolbar.h
        public boolean onMenuItemClick(MenuItem menuItem) {
            return y.this.f10211b.onMenuItemSelected(0, menuItem);
        }
    }

    private final class c implements j.a {

        /* renamed from: a, reason: collision with root package name */
        private boolean f10221a;

        c() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public void a(androidx.appcompat.view.menu.e eVar, boolean z4) {
            if (this.f10221a) {
                return;
            }
            this.f10221a = true;
            y.this.f10210a.h();
            y.this.f10211b.onPanelClosed(108, eVar);
            this.f10221a = false;
        }

        @Override // androidx.appcompat.view.menu.j.a
        public boolean b(androidx.appcompat.view.menu.e eVar) {
            y.this.f10211b.onMenuOpened(108, eVar);
            return true;
        }
    }

    private final class d implements e.a {
        d() {
        }

        @Override // androidx.appcompat.view.menu.e.a
        public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.e.a
        public void b(androidx.appcompat.view.menu.e eVar) {
            if (y.this.f10210a.b()) {
                y.this.f10211b.onPanelClosed(108, eVar);
            } else if (y.this.f10211b.onPreparePanel(0, null, eVar)) {
                y.this.f10211b.onMenuOpened(108, eVar);
            }
        }
    }

    private class e implements AppCompatDelegateImpl.g {
        e() {
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.g
        public boolean a(int i4) {
            if (i4 != 0) {
                return false;
            }
            y yVar = y.this;
            if (yVar.f10213d) {
                return false;
            }
            yVar.f10210a.c();
            y.this.f10213d = true;
            return false;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.g
        public View onCreatePanelView(int i4) {
            if (i4 == 0) {
                return new View(y.this.f10210a.getContext());
            }
            return null;
        }
    }

    y(Toolbar toolbar, CharSequence charSequence, Window.Callback callback) {
        b bVar = new b();
        this.f10218i = bVar;
        A.h.f(toolbar);
        d0 d0Var = new d0(toolbar, false);
        this.f10210a = d0Var;
        this.f10211b = (Window.Callback) A.h.f(callback);
        d0Var.setWindowCallback(callback);
        toolbar.setOnMenuItemClickListener(bVar);
        d0Var.setWindowTitle(charSequence);
        this.f10212c = new e();
    }

    private Menu v() {
        if (!this.f10214e) {
            this.f10210a.p(new c(), new d());
            this.f10214e = true;
        }
        return this.f10210a.l();
    }

    @Override // androidx.appcompat.app.AbstractC1250a
    public boolean g() {
        return this.f10210a.f();
    }

    @Override // androidx.appcompat.app.AbstractC1250a
    public boolean h() {
        if (!this.f10210a.j()) {
            return false;
        }
        this.f10210a.collapseActionView();
        return true;
    }

    @Override // androidx.appcompat.app.AbstractC1250a
    public void i(boolean z4) {
        if (z4 == this.f10215f) {
            return;
        }
        this.f10215f = z4;
        if (this.f10216g.size() <= 0) {
            return;
        }
        android.support.v4.media.session.b.a(this.f10216g.get(0));
        throw null;
    }

    @Override // androidx.appcompat.app.AbstractC1250a
    public int j() {
        return this.f10210a.t();
    }

    @Override // androidx.appcompat.app.AbstractC1250a
    public Context k() {
        return this.f10210a.getContext();
    }

    @Override // androidx.appcompat.app.AbstractC1250a
    public boolean l() {
        this.f10210a.r().removeCallbacks(this.f10217h);
        AbstractC1281a0.g0(this.f10210a.r(), this.f10217h);
        return true;
    }

    @Override // androidx.appcompat.app.AbstractC1250a
    public void m(Configuration configuration) {
        super.m(configuration);
    }

    @Override // androidx.appcompat.app.AbstractC1250a
    void n() {
        this.f10210a.r().removeCallbacks(this.f10217h);
    }

    @Override // androidx.appcompat.app.AbstractC1250a
    public boolean o(int i4, KeyEvent keyEvent) {
        Menu v4 = v();
        if (v4 == null) {
            return false;
        }
        v4.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return v4.performShortcut(i4, keyEvent, 0);
    }

    @Override // androidx.appcompat.app.AbstractC1250a
    public boolean p(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            q();
        }
        return true;
    }

    @Override // androidx.appcompat.app.AbstractC1250a
    public boolean q() {
        return this.f10210a.g();
    }

    @Override // androidx.appcompat.app.AbstractC1250a
    public void r(boolean z4) {
    }

    @Override // androidx.appcompat.app.AbstractC1250a
    public void s(boolean z4) {
    }

    @Override // androidx.appcompat.app.AbstractC1250a
    public void t(CharSequence charSequence) {
        this.f10210a.setWindowTitle(charSequence);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void w() {
        Menu v4 = v();
        androidx.appcompat.view.menu.e eVar = v4 instanceof androidx.appcompat.view.menu.e ? (androidx.appcompat.view.menu.e) v4 : null;
        if (eVar != null) {
            eVar.stopDispatchingItemsChanged();
        }
        try {
            v4.clear();
            if (this.f10211b.onCreatePanelMenu(0, v4)) {
                if (!this.f10211b.onPreparePanel(0, null, v4)) {
                }
                if (eVar == null) {
                    eVar.startDispatchingItemsChanged();
                    return;
                }
                return;
            }
            v4.clear();
            if (eVar == null) {
            }
        } catch (Throwable th) {
            if (eVar != null) {
                eVar.startDispatchingItemsChanged();
            }
            throw th;
        }
    }
}
