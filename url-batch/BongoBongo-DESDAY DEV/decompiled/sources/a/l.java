package a;

import L.C0014l;
import L.InterfaceC0013k;
import Z.C0052t;
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
import androidx.lifecycle.B;
import androidx.lifecycle.D;
import androidx.lifecycle.H;
import androidx.lifecycle.InterfaceC0074h;
import androidx.lifecycle.O;
import androidx.lifecycle.P;
import b.C0083a;
import b.InterfaceC0084b;
import c0.C0092c;
import com.winfour.winrandom.R;
import g.AbstractActivityC0106i;
import g1.InterfaceC0110a;
import h.AbstractC0112a;
import h0.d0;
import j0.C0146a;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class l extends Activity implements P, InterfaceC0074h, j0.f, y, androidx.lifecycle.r, InterfaceC0013k {

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ int f1249r = 0;

    /* renamed from: a, reason: collision with root package name */
    public final androidx.lifecycle.t f1250a = new androidx.lifecycle.t(this);

    /* renamed from: b, reason: collision with root package name */
    public final C0083a f1251b = new C0083a();

    /* renamed from: c, reason: collision with root package name */
    public final C0014l f1252c;
    public final j0.e d;

    /* renamed from: e, reason: collision with root package name */
    public O f1253e;

    /* renamed from: f, reason: collision with root package name */
    public final ViewTreeObserverOnDrawListenerC0064i f1254f;

    /* renamed from: g, reason: collision with root package name */
    public final V0.d f1255g;

    /* renamed from: h, reason: collision with root package name */
    public final j f1256h;
    public final CopyOnWriteArrayList i;

    /* renamed from: j, reason: collision with root package name */
    public final CopyOnWriteArrayList f1257j;

    /* renamed from: k, reason: collision with root package name */
    public final CopyOnWriteArrayList f1258k;

    /* renamed from: l, reason: collision with root package name */
    public final CopyOnWriteArrayList f1259l;

    /* renamed from: m, reason: collision with root package name */
    public final CopyOnWriteArrayList f1260m;

    /* renamed from: n, reason: collision with root package name */
    public final CopyOnWriteArrayList f1261n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f1262o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f1263p;

    /* renamed from: q, reason: collision with root package name */
    public final V0.d f1264q;

    public l() {
        AbstractActivityC0106i abstractActivityC0106i = (AbstractActivityC0106i) this;
        this.f1252c = new C0014l(new RunnableC0059d(abstractActivityC0106i, 0));
        j0.e eVar = new j0.e(this);
        this.d = eVar;
        this.f1254f = new ViewTreeObserverOnDrawListenerC0064i(abstractActivityC0106i);
        this.f1255g = new V0.d(new k(abstractActivityC0106i, 1));
        new AtomicInteger();
        this.f1256h = new j();
        this.i = new CopyOnWriteArrayList();
        this.f1257j = new CopyOnWriteArrayList();
        this.f1258k = new CopyOnWriteArrayList();
        this.f1259l = new CopyOnWriteArrayList();
        this.f1260m = new CopyOnWriteArrayList();
        this.f1261n = new CopyOnWriteArrayList();
        androidx.lifecycle.t tVar = this.f1250a;
        if (tVar == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        tVar.a(new C0060e(0, abstractActivityC0106i));
        this.f1250a.a(new C0060e(1, abstractActivityC0106i));
        this.f1250a.a(new C0146a(2, abstractActivityC0106i));
        eVar.a();
        H.d(this);
        eVar.f2666b.e("android:support:activity-result", new Z.r(1, abstractActivityC0106i));
        h(new C0052t(abstractActivityC0106i, 1));
        this.f1264q = new V0.d(new k(abstractActivityC0106i, 2));
    }

    @Override // androidx.lifecycle.InterfaceC0074h
    public final C0092c a() {
        C0092c c0092c = new C0092c(0);
        Application application = getApplication();
        LinkedHashMap linkedHashMap = c0092c.f1734a;
        if (application != null) {
            K0.e eVar = H.d;
            Application application2 = getApplication();
            h1.d.d(application2, "application");
            linkedHashMap.put(eVar, application2);
        }
        linkedHashMap.put(H.f1549a, this);
        linkedHashMap.put(H.f1550b, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            linkedHashMap.put(H.f1551c, extras);
        }
        return c0092c;
    }

    @Override // j0.f
    public final j0.d b() {
        return this.d.f2666b;
    }

    @Override // androidx.lifecycle.P
    public final O c() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        if (this.f1253e == null) {
            C0063h c0063h = (C0063h) getLastNonConfigurationInstance();
            if (c0063h != null) {
                this.f1253e = c0063h.f1237a;
            }
            if (this.f1253e == null) {
                this.f1253e = new O();
            }
        }
        O o2 = this.f1253e;
        h1.d.b(o2);
        return o2;
    }

    @Override // androidx.lifecycle.r
    public final androidx.lifecycle.t d() {
        return this.f1250a;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        h1.d.e(keyEvent, "event");
        View decorView = getWindow().getDecorView();
        h1.d.d(decorView, "window.decorView");
        if (A1.d.y(decorView, keyEvent)) {
            return true;
        }
        return A1.d.z(this, decorView, this, keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        h1.d.e(keyEvent, "event");
        View decorView = getWindow().getDecorView();
        h1.d.d(decorView, "window.decorView");
        if (A1.d.y(decorView, keyEvent)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // L.InterfaceC0013k
    public final boolean e(KeyEvent keyEvent) {
        h1.d.e(keyEvent, "event");
        return super.dispatchKeyEvent(keyEvent);
    }

    public final void g(K.a aVar) {
        h1.d.e(aVar, "listener");
        this.i.add(aVar);
    }

    public final void h(InterfaceC0084b interfaceC0084b) {
        C0083a c0083a = this.f1251b;
        c0083a.getClass();
        l lVar = c0083a.f1722b;
        if (lVar != null) {
            interfaceC0084b.a(lVar);
        }
        c0083a.f1721a.add(interfaceC0084b);
    }

    public final x i() {
        return (x) this.f1264q.a();
    }

    public final void j(Bundle bundle) {
        super.onCreate(bundle);
        int i = D.f1547b;
        B.b(this);
    }

    public final void k(Bundle bundle) {
        h1.d.e(bundle, "outState");
        this.f1250a.g();
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (this.f1256h.a(i, i2, intent)) {
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
        h1.d.e(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            ((K.a) it.next()).a(configuration);
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        this.d.b(bundle);
        C0083a c0083a = this.f1251b;
        c0083a.getClass();
        c0083a.f1722b = this;
        Iterator it = c0083a.f1721a.iterator();
        while (it.hasNext()) {
            ((InterfaceC0084b) it.next()).a(this);
        }
        j(bundle);
        int i = D.f1547b;
        B.b(this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        h1.d.e(menu, "menu");
        if (i != 0) {
            return true;
        }
        super.onCreatePanelMenu(i, menu);
        getMenuInflater();
        Iterator it = ((CopyOnWriteArrayList) this.f1252c.f543b).iterator();
        while (it.hasNext()) {
            ((Z.B) it.next()).f992a.j();
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        h1.d.e(menuItem, "item");
        boolean z2 = true;
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i != 0) {
            return false;
        }
        Iterator it = ((CopyOnWriteArrayList) this.f1252c.f543b).iterator();
        while (true) {
            if (!it.hasNext()) {
                z2 = false;
                break;
            }
            if (((Z.B) it.next()).f992a.o()) {
                break;
            }
        }
        return z2;
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z2) {
        if (this.f1262o) {
            return;
        }
        Iterator it = this.f1259l.iterator();
        while (it.hasNext()) {
            ((K.a) it.next()).a(new A.h(z2));
        }
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        h1.d.e(intent, "intent");
        super.onNewIntent(intent);
        Iterator it = this.f1258k.iterator();
        while (it.hasNext()) {
            ((K.a) it.next()).a(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        h1.d.e(menu, "menu");
        Iterator it = ((CopyOnWriteArrayList) this.f1252c.f543b).iterator();
        while (it.hasNext()) {
            ((Z.B) it.next()).f992a.p();
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z2) {
        if (this.f1263p) {
            return;
        }
        Iterator it = this.f1260m.iterator();
        while (it.hasNext()) {
            ((K.a) it.next()).a(new A.i(z2));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        h1.d.e(menu, "menu");
        if (i != 0) {
            return true;
        }
        super.onPreparePanel(i, view, menu);
        Iterator it = ((CopyOnWriteArrayList) this.f1252c.f543b).iterator();
        while (it.hasNext()) {
            ((Z.B) it.next()).f992a.s();
        }
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        h1.d.e(strArr, "permissions");
        h1.d.e(iArr, "grantResults");
        if (this.f1256h.a(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        C0063h c0063h;
        O o2 = this.f1253e;
        if (o2 == null && (c0063h = (C0063h) getLastNonConfigurationInstance()) != null) {
            o2 = c0063h.f1237a;
        }
        if (o2 == null) {
            return null;
        }
        C0063h c0063h2 = new C0063h();
        c0063h2.f1237a = o2;
        return c0063h2;
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        h1.d.e(bundle, "outState");
        androidx.lifecycle.t tVar = this.f1250a;
        if (tVar != null) {
            tVar.g();
        }
        k(bundle);
        this.d.c(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator it = this.f1257j.iterator();
        while (it.hasNext()) {
            ((K.a) it.next()).a(Integer.valueOf(i));
        }
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator it = this.f1261n.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if (d0.k()) {
                Trace.beginSection("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            n nVar = (n) this.f1255g.a();
            synchronized (nVar.f1268a) {
                try {
                    nVar.f1269b = true;
                    Iterator it = nVar.f1270c.iterator();
                    while (it.hasNext()) {
                        ((InterfaceC0110a) it.next()).b();
                    }
                    nVar.f1270c.clear();
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
        h1.d.d(decorView, "window.decorView");
        H.f(decorView, this);
        View decorView2 = getWindow().getDecorView();
        h1.d.d(decorView2, "window.decorView");
        decorView2.setTag(R.id.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        h1.d.d(decorView3, "window.decorView");
        AbstractC0112a.q(decorView3, this);
        View decorView4 = getWindow().getDecorView();
        h1.d.d(decorView4, "window.decorView");
        A1.m.c0(decorView4, this);
        View decorView5 = getWindow().getDecorView();
        h1.d.d(decorView5, "window.decorView");
        decorView5.setTag(R.id.report_drawn, this);
        View decorView6 = getWindow().getDecorView();
        h1.d.d(decorView6, "window.decorView");
        ViewTreeObserverOnDrawListenerC0064i viewTreeObserverOnDrawListenerC0064i = this.f1254f;
        viewTreeObserverOnDrawListenerC0064i.getClass();
        if (!viewTreeObserverOnDrawListenerC0064i.f1240c) {
            viewTreeObserverOnDrawListenerC0064i.f1240c = true;
            decorView6.getViewTreeObserver().addOnDrawListener(viewTreeObserverOnDrawListenerC0064i);
        }
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i) {
        h1.d.e(intent, "intent");
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) {
        h1.d.e(intentSender, "intent");
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i, Bundle bundle) {
        h1.d.e(intent, "intent");
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        h1.d.e(intentSender, "intent");
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z2, Configuration configuration) {
        h1.d.e(configuration, "newConfig");
        this.f1262o = true;
        try {
            super.onMultiWindowModeChanged(z2, configuration);
            this.f1262o = false;
            Iterator it = this.f1259l.iterator();
            while (it.hasNext()) {
                ((K.a) it.next()).a(new A.h(z2));
            }
        } catch (Throwable th) {
            this.f1262o = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z2, Configuration configuration) {
        h1.d.e(configuration, "newConfig");
        this.f1263p = true;
        try {
            super.onPictureInPictureModeChanged(z2, configuration);
            this.f1263p = false;
            Iterator it = this.f1260m.iterator();
            while (it.hasNext()) {
                ((K.a) it.next()).a(new A.i(z2));
            }
        } catch (Throwable th) {
            this.f1263p = false;
            throw th;
        }
    }
}
