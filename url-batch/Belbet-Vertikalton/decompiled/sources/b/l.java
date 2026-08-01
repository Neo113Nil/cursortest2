package b;

import M.InterfaceC0014j;
import Z.B;
import Z.C0055t;
import a.AbstractC0058a;
import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Trace;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.lifecycle.D;
import androidx.lifecycle.F;
import androidx.lifecycle.InterfaceC0073h;
import androidx.lifecycle.J;
import androidx.lifecycle.Q;
import androidx.lifecycle.S;
import c.C0099a;
import c.InterfaceC0100b;
import c0.C0103c;
import com.winpower.neonfit.R;
import h.AbstractActivityC0132i;
import i1.InterfaceC0181a;
import j0.C0196a;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class l extends Activity implements S, InterfaceC0073h, j0.f, x, androidx.lifecycle.t, InterfaceC0014j {

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ int f2176r = 0;

    /* renamed from: a, reason: collision with root package name */
    public final androidx.lifecycle.v f2177a = new androidx.lifecycle.v(this);

    /* renamed from: b, reason: collision with root package name */
    public final C0099a f2178b = new C0099a();

    /* renamed from: c, reason: collision with root package name */
    public final I0.h f2179c;

    /* renamed from: d, reason: collision with root package name */
    public final j0.e f2180d;
    public Q e;

    /* renamed from: f, reason: collision with root package name */
    public final i f2181f;

    /* renamed from: g, reason: collision with root package name */
    public final W0.g f2182g;

    /* renamed from: h, reason: collision with root package name */
    public final j f2183h;
    public final CopyOnWriteArrayList i;
    public final CopyOnWriteArrayList j;

    /* renamed from: k, reason: collision with root package name */
    public final CopyOnWriteArrayList f2184k;

    /* renamed from: l, reason: collision with root package name */
    public final CopyOnWriteArrayList f2185l;

    /* renamed from: m, reason: collision with root package name */
    public final CopyOnWriteArrayList f2186m;

    /* renamed from: n, reason: collision with root package name */
    public final CopyOnWriteArrayList f2187n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f2188o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f2189p;

    /* renamed from: q, reason: collision with root package name */
    public final W0.g f2190q;

    public l() {
        AbstractActivityC0132i abstractActivityC0132i = (AbstractActivityC0132i) this;
        this.f2179c = new I0.h(new RunnableC0091d(abstractActivityC0132i, 0));
        j0.e eVar = new j0.e(this);
        this.f2180d = eVar;
        this.f2181f = new i(abstractActivityC0132i);
        this.f2182g = new W0.g(new k(abstractActivityC0132i, 1));
        new AtomicInteger();
        this.f2183h = new j();
        this.i = new CopyOnWriteArrayList();
        this.j = new CopyOnWriteArrayList();
        this.f2184k = new CopyOnWriteArrayList();
        this.f2185l = new CopyOnWriteArrayList();
        this.f2186m = new CopyOnWriteArrayList();
        this.f2187n = new CopyOnWriteArrayList();
        androidx.lifecycle.v vVar = this.f2177a;
        if (vVar == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        vVar.a(new C0092e(0, abstractActivityC0132i));
        this.f2177a.a(new C0092e(1, abstractActivityC0132i));
        this.f2177a.a(new C0196a(4, abstractActivityC0132i));
        eVar.a();
        J.d(this);
        eVar.f3167b.e("android:support:activity-result", new Z.r(1, abstractActivityC0132i));
        h(new C0055t(abstractActivityC0132i, 1));
        this.f2190q = new W0.g(new k(abstractActivityC0132i, 2));
    }

    @Override // androidx.lifecycle.InterfaceC0073h
    public final C0103c a() {
        C0103c c0103c = new C0103c(0);
        Application application = getApplication();
        LinkedHashMap linkedHashMap = c0103c.f2228a;
        if (application != null) {
            N0.e eVar = J.f1912d;
            Application application2 = getApplication();
            j1.h.d(application2, "application");
            linkedHashMap.put(eVar, application2);
        }
        linkedHashMap.put(J.f1909a, this);
        linkedHashMap.put(J.f1910b, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            linkedHashMap.put(J.f1911c, extras);
        }
        return c0103c;
    }

    @Override // j0.f
    public final j0.d b() {
        return this.f2180d.f3167b;
    }

    @Override // androidx.lifecycle.S
    public final Q c() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        if (this.e == null) {
            C0095h c0095h = (C0095h) getLastNonConfigurationInstance();
            if (c0095h != null) {
                this.e = c0095h.f2163a;
            }
            if (this.e == null) {
                this.e = new Q();
            }
        }
        Q q2 = this.e;
        j1.h.b(q2);
        return q2;
    }

    @Override // M.InterfaceC0014j
    public final boolean d(KeyEvent keyEvent) {
        j1.h.e(keyEvent, "event");
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        j1.h.e(keyEvent, "event");
        View decorView = getWindow().getDecorView();
        j1.h.d(decorView, "window.decorView");
        if (AbstractC0058a.q(decorView, keyEvent)) {
            return true;
        }
        return AbstractC0058a.r(this, decorView, this, keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        j1.h.e(keyEvent, "event");
        View decorView = getWindow().getDecorView();
        j1.h.d(decorView, "window.decorView");
        if (AbstractC0058a.q(decorView, keyEvent)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // androidx.lifecycle.t
    public final androidx.lifecycle.v e() {
        return this.f2177a;
    }

    public final void g(L.a aVar) {
        j1.h.e(aVar, "listener");
        this.i.add(aVar);
    }

    public final void h(InterfaceC0100b interfaceC0100b) {
        C0099a c0099a = this.f2178b;
        c0099a.getClass();
        l lVar = c0099a.f2226b;
        if (lVar != null) {
            interfaceC0100b.a(lVar);
        }
        c0099a.f2225a.add(interfaceC0100b);
    }

    public final w i() {
        return (w) this.f2190q.a();
    }

    public final void j(Bundle bundle) {
        super.onCreate(bundle);
        int i = F.f1907b;
        D.b(this);
    }

    public final void k(Bundle bundle) {
        j1.h.e(bundle, "outState");
        this.f2177a.g();
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (this.f2183h.a(i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        i().b();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        j1.h.e(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            ((L.a) it.next()).a(configuration);
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f2180d.b(bundle);
        C0099a c0099a = this.f2178b;
        c0099a.getClass();
        c0099a.f2226b = this;
        Iterator it = c0099a.f2225a.iterator();
        while (it.hasNext()) {
            ((InterfaceC0100b) it.next()).a(this);
        }
        j(bundle);
        int i = F.f1907b;
        D.b(this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        j1.h.e(menu, "menu");
        if (i != 0) {
            return true;
        }
        super.onCreatePanelMenu(i, menu);
        getMenuInflater();
        Iterator it = ((CopyOnWriteArrayList) this.f2179c.f592c).iterator();
        while (it.hasNext()) {
            ((B) it.next()).f1424a.j();
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        j1.h.e(menuItem, "item");
        boolean z2 = true;
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i != 0) {
            return false;
        }
        Iterator it = ((CopyOnWriteArrayList) this.f2179c.f592c).iterator();
        while (true) {
            if (!it.hasNext()) {
                z2 = false;
                break;
            }
            if (((B) it.next()).f1424a.o()) {
                break;
            }
        }
        return z2;
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z2) {
        if (this.f2188o) {
            return;
        }
        Iterator it = this.f2185l.iterator();
        while (it.hasNext()) {
            ((L.a) it.next()).a(new B.g(z2));
        }
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        j1.h.e(intent, "intent");
        super.onNewIntent(intent);
        Iterator it = this.f2184k.iterator();
        while (it.hasNext()) {
            ((L.a) it.next()).a(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        j1.h.e(menu, "menu");
        Iterator it = ((CopyOnWriteArrayList) this.f2179c.f592c).iterator();
        while (it.hasNext()) {
            ((B) it.next()).f1424a.p();
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z2) {
        if (this.f2189p) {
            return;
        }
        Iterator it = this.f2186m.iterator();
        while (it.hasNext()) {
            ((L.a) it.next()).a(new B.h(z2));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        j1.h.e(menu, "menu");
        if (i != 0) {
            return true;
        }
        super.onPreparePanel(i, view, menu);
        Iterator it = ((CopyOnWriteArrayList) this.f2179c.f592c).iterator();
        while (it.hasNext()) {
            ((B) it.next()).f1424a.s();
        }
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        j1.h.e(strArr, "permissions");
        j1.h.e(iArr, "grantResults");
        if (this.f2183h.a(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        C0095h c0095h;
        Q q2 = this.e;
        if (q2 == null && (c0095h = (C0095h) getLastNonConfigurationInstance()) != null) {
            q2 = c0095h.f2163a;
        }
        if (q2 == null) {
            return null;
        }
        C0095h c0095h2 = new C0095h();
        c0095h2.f2163a = q2;
        return c0095h2;
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        j1.h.e(bundle, "outState");
        androidx.lifecycle.v vVar = this.f2177a;
        if (vVar != null) {
            vVar.g();
        }
        k(bundle);
        this.f2180d.c(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator it = this.j.iterator();
        while (it.hasNext()) {
            ((L.a) it.next()).a(Integer.valueOf(i));
        }
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator it = this.f2187n.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if (H1.l.F()) {
                Trace.beginSection("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            n nVar = (n) this.f2182g.a();
            synchronized (nVar.f2194a) {
                try {
                    nVar.f2195b = true;
                    Iterator it = nVar.f2196c.iterator();
                    while (it.hasNext()) {
                        ((InterfaceC0181a) it.next()).c();
                    }
                    nVar.f2196c.clear();
                } finally {
                }
            }
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        View decorView = getWindow().getDecorView();
        j1.h.d(decorView, "window.decorView");
        J.g(decorView, this);
        View decorView2 = getWindow().getDecorView();
        j1.h.d(decorView2, "window.decorView");
        decorView2.setTag(R.id.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        j1.h.d(decorView3, "window.decorView");
        AbstractC0058a.Y(decorView3, this);
        View decorView4 = getWindow().getDecorView();
        j1.h.d(decorView4, "window.decorView");
        H1.d.b0(decorView4, this);
        View decorView5 = getWindow().getDecorView();
        j1.h.d(decorView5, "window.decorView");
        decorView5.setTag(R.id.report_drawn, this);
        View decorView6 = getWindow().getDecorView();
        j1.h.d(decorView6, "window.decorView");
        i iVar = this.f2181f;
        iVar.getClass();
        if (!iVar.f2166c) {
            iVar.f2166c = true;
            decorView6.getViewTreeObserver().addOnDrawListener(iVar);
        }
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i) {
        j1.h.e(intent, "intent");
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) {
        j1.h.e(intentSender, "intent");
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i, Bundle bundle) {
        j1.h.e(intent, "intent");
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        j1.h.e(intentSender, "intent");
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z2, Configuration configuration) {
        j1.h.e(configuration, "newConfig");
        this.f2188o = true;
        try {
            super.onMultiWindowModeChanged(z2, configuration);
            this.f2188o = false;
            Iterator it = this.f2185l.iterator();
            while (it.hasNext()) {
                ((L.a) it.next()).a(new B.g(z2));
            }
        } catch (Throwable th) {
            this.f2188o = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z2, Configuration configuration) {
        j1.h.e(configuration, "newConfig");
        this.f2189p = true;
        try {
            super.onPictureInPictureModeChanged(z2, configuration);
            this.f2189p = false;
            Iterator it = this.f2186m.iterator();
            while (it.hasNext()) {
                ((L.a) it.next()).a(new B.h(z2));
            }
        } catch (Throwable th) {
            this.f2189p = false;
            throw th;
        }
    }
}
