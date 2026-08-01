package a;

import K.InterfaceC0014j;
import Y.B;
import Y.C0052t;
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
import androidx.lifecycle.InterfaceC0067h;
import androidx.lifecycle.J;
import androidx.lifecycle.Q;
import androidx.lifecycle.S;
import b.C0078a;
import b.InterfaceC0079b;
import c1.AbstractC0091d;
import com.fortunequest.neontrack.R;
import g.AbstractActivityC0128i;
import j0.C0167a;
import j1.InterfaceC0170a;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import u0.C0372k;

/* loaded from: classes.dex */
public abstract class l extends Activity implements S, InterfaceC0067h, j0.f, y, androidx.lifecycle.t, InterfaceC0014j {

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ int f1578r = 0;

    /* renamed from: a, reason: collision with root package name */
    public final androidx.lifecycle.v f1579a = new androidx.lifecycle.v(this);

    /* renamed from: b, reason: collision with root package name */
    public final C0078a f1580b = new C0078a();

    /* renamed from: c, reason: collision with root package name */
    public final C0372k f1581c;
    public final j0.e d;

    /* renamed from: e, reason: collision with root package name */
    public Q f1582e;

    /* renamed from: f, reason: collision with root package name */
    public final i f1583f;

    /* renamed from: g, reason: collision with root package name */
    public final X0.f f1584g;
    public final j h;
    public final CopyOnWriteArrayList i;

    /* renamed from: j, reason: collision with root package name */
    public final CopyOnWriteArrayList f1585j;

    /* renamed from: k, reason: collision with root package name */
    public final CopyOnWriteArrayList f1586k;

    /* renamed from: l, reason: collision with root package name */
    public final CopyOnWriteArrayList f1587l;

    /* renamed from: m, reason: collision with root package name */
    public final CopyOnWriteArrayList f1588m;

    /* renamed from: n, reason: collision with root package name */
    public final CopyOnWriteArrayList f1589n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f1590o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f1591p;

    /* renamed from: q, reason: collision with root package name */
    public final X0.f f1592q;

    public l() {
        AbstractActivityC0128i abstractActivityC0128i = (AbstractActivityC0128i) this;
        this.f1581c = new C0372k(new d(abstractActivityC0128i, 0));
        j0.e eVar = new j0.e(this);
        this.d = eVar;
        this.f1583f = new i(abstractActivityC0128i);
        this.f1584g = new X0.f(new k(abstractActivityC0128i, 1));
        new AtomicInteger();
        this.h = new j();
        this.i = new CopyOnWriteArrayList();
        this.f1585j = new CopyOnWriteArrayList();
        this.f1586k = new CopyOnWriteArrayList();
        this.f1587l = new CopyOnWriteArrayList();
        this.f1588m = new CopyOnWriteArrayList();
        this.f1589n = new CopyOnWriteArrayList();
        androidx.lifecycle.v vVar = this.f1579a;
        if (vVar == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        vVar.a(new e(0, abstractActivityC0128i));
        this.f1579a.a(new e(1, abstractActivityC0128i));
        this.f1579a.a(new C0167a(2, abstractActivityC0128i));
        eVar.a();
        J.d(this);
        eVar.f3084b.e("android:support:activity-result", new Y.r(1, abstractActivityC0128i));
        h(new C0052t(abstractActivityC0128i, 1));
        this.f1592q = new X0.f(new k(abstractActivityC0128i, 2));
    }

    @Override // androidx.lifecycle.InterfaceC0067h
    public final b0.c a() {
        b0.c cVar = new b0.c(0);
        Application application = getApplication();
        LinkedHashMap linkedHashMap = cVar.f2040a;
        if (application != null) {
            R0.e eVar = J.d;
            Application application2 = getApplication();
            k1.e.d(application2, "application");
            linkedHashMap.put(eVar, application2);
        }
        linkedHashMap.put(J.f1861a, this);
        linkedHashMap.put(J.f1862b, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            linkedHashMap.put(J.f1863c, extras);
        }
        return cVar;
    }

    @Override // j0.f
    public final j0.d b() {
        return this.d.f3084b;
    }

    @Override // androidx.lifecycle.S
    public final Q c() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        if (this.f1582e == null) {
            h hVar = (h) getLastNonConfigurationInstance();
            if (hVar != null) {
                this.f1582e = hVar.f1566a;
            }
            if (this.f1582e == null) {
                this.f1582e = new Q();
            }
        }
        Q q2 = this.f1582e;
        k1.e.b(q2);
        return q2;
    }

    @Override // K.InterfaceC0014j
    public final boolean d(KeyEvent keyEvent) {
        k1.e.e(keyEvent, "event");
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        k1.e.e(keyEvent, "event");
        View decorView = getWindow().getDecorView();
        k1.e.d(decorView, "window.decorView");
        if (H1.d.v(decorView, keyEvent)) {
            return true;
        }
        return H1.d.w(this, decorView, this, keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        k1.e.e(keyEvent, "event");
        View decorView = getWindow().getDecorView();
        k1.e.d(decorView, "window.decorView");
        if (H1.d.v(decorView, keyEvent)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // androidx.lifecycle.t
    public final androidx.lifecycle.v e() {
        return this.f1579a;
    }

    public final void g(J.a aVar) {
        k1.e.e(aVar, "listener");
        this.i.add(aVar);
    }

    public final void h(InterfaceC0079b interfaceC0079b) {
        C0078a c0078a = this.f1580b;
        c0078a.getClass();
        l lVar = c0078a.f2038b;
        if (lVar != null) {
            interfaceC0079b.a(lVar);
        }
        c0078a.f2037a.add(interfaceC0079b);
    }

    public final x i() {
        return (x) this.f1592q.a();
    }

    public final void j(Bundle bundle) {
        super.onCreate(bundle);
        int i = F.f1859b;
        D.b(this);
    }

    public final void k(Bundle bundle) {
        k1.e.e(bundle, "outState");
        this.f1579a.g();
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (this.h.a(i, i2, intent)) {
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
        k1.e.e(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            ((J.a) it.next()).a(configuration);
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        this.d.b(bundle);
        C0078a c0078a = this.f1580b;
        c0078a.getClass();
        c0078a.f2038b = this;
        Iterator it = c0078a.f2037a.iterator();
        while (it.hasNext()) {
            ((InterfaceC0079b) it.next()).a(this);
        }
        j(bundle);
        int i = F.f1859b;
        D.b(this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        k1.e.e(menu, "menu");
        if (i != 0) {
            return true;
        }
        super.onCreatePanelMenu(i, menu);
        getMenuInflater();
        Iterator it = ((CopyOnWriteArrayList) this.f1581c.f4191b).iterator();
        while (it.hasNext()) {
            ((B) it.next()).f1282a.j();
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        k1.e.e(menuItem, "item");
        boolean z2 = true;
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i != 0) {
            return false;
        }
        Iterator it = ((CopyOnWriteArrayList) this.f1581c.f4191b).iterator();
        while (true) {
            if (!it.hasNext()) {
                z2 = false;
                break;
            }
            if (((B) it.next()).f1282a.o()) {
                break;
            }
        }
        return z2;
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z2) {
        if (this.f1590o) {
            return;
        }
        Iterator it = this.f1587l.iterator();
        while (it.hasNext()) {
            ((J.a) it.next()).a(new z.f(z2));
        }
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        k1.e.e(intent, "intent");
        super.onNewIntent(intent);
        Iterator it = this.f1586k.iterator();
        while (it.hasNext()) {
            ((J.a) it.next()).a(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        k1.e.e(menu, "menu");
        Iterator it = ((CopyOnWriteArrayList) this.f1581c.f4191b).iterator();
        while (it.hasNext()) {
            ((B) it.next()).f1282a.p();
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z2) {
        if (this.f1591p) {
            return;
        }
        Iterator it = this.f1588m.iterator();
        while (it.hasNext()) {
            ((J.a) it.next()).a(new z.g(z2));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        k1.e.e(menu, "menu");
        if (i != 0) {
            return true;
        }
        super.onPreparePanel(i, view, menu);
        Iterator it = ((CopyOnWriteArrayList) this.f1581c.f4191b).iterator();
        while (it.hasNext()) {
            ((B) it.next()).f1282a.s();
        }
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        k1.e.e(strArr, "permissions");
        k1.e.e(iArr, "grantResults");
        if (this.h.a(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        h hVar;
        Q q2 = this.f1582e;
        if (q2 == null && (hVar = (h) getLastNonConfigurationInstance()) != null) {
            q2 = hVar.f1566a;
        }
        if (q2 == null) {
            return null;
        }
        h hVar2 = new h();
        hVar2.f1566a = q2;
        return hVar2;
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        k1.e.e(bundle, "outState");
        androidx.lifecycle.v vVar = this.f1579a;
        if (vVar != null) {
            vVar.g();
        }
        k(bundle);
        this.d.c(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator it = this.f1585j.iterator();
        while (it.hasNext()) {
            ((J.a) it.next()).a(Integer.valueOf(i));
        }
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator it = this.f1589n.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if (AbstractC0091d.n()) {
                Trace.beginSection("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            n nVar = (n) this.f1584g.a();
            synchronized (nVar.f1596a) {
                try {
                    nVar.f1597b = true;
                    Iterator it = nVar.f1598c.iterator();
                    while (it.hasNext()) {
                        ((InterfaceC0170a) it.next()).c();
                    }
                    nVar.f1598c.clear();
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
        k1.e.d(decorView, "window.decorView");
        J.g(decorView, this);
        View decorView2 = getWindow().getDecorView();
        k1.e.d(decorView2, "window.decorView");
        decorView2.setTag(R.id.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        k1.e.d(decorView3, "window.decorView");
        AbstractC0091d.t(decorView3, this);
        View decorView4 = getWindow().getDecorView();
        k1.e.d(decorView4, "window.decorView");
        H1.d.g0(decorView4, this);
        View decorView5 = getWindow().getDecorView();
        k1.e.d(decorView5, "window.decorView");
        decorView5.setTag(R.id.report_drawn, this);
        View decorView6 = getWindow().getDecorView();
        k1.e.d(decorView6, "window.decorView");
        i iVar = this.f1583f;
        iVar.getClass();
        if (!iVar.f1569c) {
            iVar.f1569c = true;
            decorView6.getViewTreeObserver().addOnDrawListener(iVar);
        }
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i) {
        k1.e.e(intent, "intent");
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) {
        k1.e.e(intentSender, "intent");
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i, Bundle bundle) {
        k1.e.e(intent, "intent");
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        k1.e.e(intentSender, "intent");
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z2, Configuration configuration) {
        k1.e.e(configuration, "newConfig");
        this.f1590o = true;
        try {
            super.onMultiWindowModeChanged(z2, configuration);
            this.f1590o = false;
            Iterator it = this.f1587l.iterator();
            while (it.hasNext()) {
                ((J.a) it.next()).a(new z.f(z2));
            }
        } catch (Throwable th) {
            this.f1590o = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z2, Configuration configuration) {
        k1.e.e(configuration, "newConfig");
        this.f1591p = true;
        try {
            super.onPictureInPictureModeChanged(z2, configuration);
            this.f1591p = false;
            Iterator it = this.f1588m.iterator();
            while (it.hasNext()) {
                ((J.a) it.next()).a(new z.g(z2));
            }
        } catch (Throwable th) {
            this.f1591p = false;
            throw th;
        }
    }
}
