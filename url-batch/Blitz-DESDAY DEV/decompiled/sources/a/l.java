package a;

import M.InterfaceC0010k;
import Z.C0049t;
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
import androidx.lifecycle.InterfaceC0065h;
import androidx.lifecycle.O;
import androidx.lifecycle.P;
import b.C0074a;
import b.InterfaceC0075b;
import com.winfour.neondrop.R;
import f1.InterfaceC0099a;
import g.AbstractActivityC0110i;
import h0.a0;
import j0.C0157a;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import m.C0227a;

/* loaded from: classes.dex */
public abstract class l extends Activity implements P, InterfaceC0065h, j0.f, y, androidx.lifecycle.r, InterfaceC0010k {

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ int f1259r = 0;

    /* renamed from: a, reason: collision with root package name */
    public final androidx.lifecycle.t f1260a = new androidx.lifecycle.t(this);

    /* renamed from: b, reason: collision with root package name */
    public final C0074a f1261b = new C0074a();

    /* renamed from: c, reason: collision with root package name */
    public final A1.j f1262c;
    public final j0.e d;

    /* renamed from: e, reason: collision with root package name */
    public O f1263e;

    /* renamed from: f, reason: collision with root package name */
    public final i f1264f;

    /* renamed from: g, reason: collision with root package name */
    public final W0.d f1265g;
    public final j h;
    public final CopyOnWriteArrayList i;

    /* renamed from: j, reason: collision with root package name */
    public final CopyOnWriteArrayList f1266j;

    /* renamed from: k, reason: collision with root package name */
    public final CopyOnWriteArrayList f1267k;

    /* renamed from: l, reason: collision with root package name */
    public final CopyOnWriteArrayList f1268l;

    /* renamed from: m, reason: collision with root package name */
    public final CopyOnWriteArrayList f1269m;

    /* renamed from: n, reason: collision with root package name */
    public final CopyOnWriteArrayList f1270n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f1271o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f1272p;

    /* renamed from: q, reason: collision with root package name */
    public final W0.d f1273q;

    public l() {
        AbstractActivityC0110i abstractActivityC0110i = (AbstractActivityC0110i) this;
        this.f1262c = new A1.j(new d(abstractActivityC0110i, 0));
        j0.e eVar = new j0.e(this);
        this.d = eVar;
        this.f1264f = new i(abstractActivityC0110i);
        this.f1265g = new W0.d(new k(abstractActivityC0110i, 1));
        new AtomicInteger();
        this.h = new j();
        this.i = new CopyOnWriteArrayList();
        this.f1266j = new CopyOnWriteArrayList();
        this.f1267k = new CopyOnWriteArrayList();
        this.f1268l = new CopyOnWriteArrayList();
        this.f1269m = new CopyOnWriteArrayList();
        this.f1270n = new CopyOnWriteArrayList();
        androidx.lifecycle.t tVar = this.f1260a;
        if (tVar == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        tVar.a(new e(0, abstractActivityC0110i));
        this.f1260a.a(new e(1, abstractActivityC0110i));
        this.f1260a.a(new C0157a(2, abstractActivityC0110i));
        eVar.a();
        H.d(this);
        eVar.f2686b.e("android:support:activity-result", new Z.r(1, abstractActivityC0110i));
        j(new C0049t(abstractActivityC0110i, 1));
        this.f1273q = new W0.d(new k(abstractActivityC0110i, 2));
    }

    @Override // androidx.lifecycle.InterfaceC0065h
    public final c0.c a() {
        c0.c cVar = new c0.c(0);
        Application application = getApplication();
        LinkedHashMap linkedHashMap = cVar.f1719a;
        if (application != null) {
            L0.e eVar = H.d;
            Application application2 = getApplication();
            g1.d.d(application2, "application");
            linkedHashMap.put(eVar, application2);
        }
        linkedHashMap.put(H.f1545a, this);
        linkedHashMap.put(H.f1546b, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            linkedHashMap.put(H.f1547c, extras);
        }
        return cVar;
    }

    @Override // j0.f
    public final j0.d c() {
        return this.d.f2686b;
    }

    @Override // androidx.lifecycle.P
    public final O d() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        if (this.f1263e == null) {
            h hVar = (h) getLastNonConfigurationInstance();
            if (hVar != null) {
                this.f1263e = hVar.f1247a;
            }
            if (this.f1263e == null) {
                this.f1263e = new O();
            }
        }
        O o2 = this.f1263e;
        g1.d.b(o2);
        return o2;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        g1.d.e(keyEvent, "event");
        View decorView = getWindow().getDecorView();
        g1.d.d(decorView, "window.decorView");
        if (z1.d.n(decorView, keyEvent)) {
            return true;
        }
        return z1.d.o(this, decorView, this, keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        g1.d.e(keyEvent, "event");
        View decorView = getWindow().getDecorView();
        g1.d.d(decorView, "window.decorView");
        if (z1.d.n(decorView, keyEvent)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // androidx.lifecycle.r
    public final androidx.lifecycle.t f() {
        return this.f1260a;
    }

    @Override // M.InterfaceC0010k
    public final boolean g(KeyEvent keyEvent) {
        g1.d.e(keyEvent, "event");
        return super.dispatchKeyEvent(keyEvent);
    }

    public final void i(L.a aVar) {
        g1.d.e(aVar, "listener");
        this.i.add(aVar);
    }

    public final void j(InterfaceC0075b interfaceC0075b) {
        C0074a c0074a = this.f1261b;
        c0074a.getClass();
        l lVar = c0074a.f1707b;
        if (lVar != null) {
            interfaceC0075b.a(lVar);
        }
        c0074a.f1706a.add(interfaceC0075b);
    }

    public final x k() {
        return (x) this.f1273q.a();
    }

    public final void l(Bundle bundle) {
        super.onCreate(bundle);
        int i = D.f1543b;
        B.b(this);
    }

    public final void m(Bundle bundle) {
        g1.d.e(bundle, "outState");
        this.f1260a.g();
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
        k().b();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        g1.d.e(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            ((L.a) it.next()).a(configuration);
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        this.d.b(bundle);
        C0074a c0074a = this.f1261b;
        c0074a.getClass();
        c0074a.f1707b = this;
        Iterator it = c0074a.f1706a.iterator();
        while (it.hasNext()) {
            ((InterfaceC0075b) it.next()).a(this);
        }
        l(bundle);
        int i = D.f1543b;
        B.b(this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        g1.d.e(menu, "menu");
        if (i != 0) {
            return true;
        }
        super.onCreatePanelMenu(i, menu);
        getMenuInflater();
        Iterator it = ((CopyOnWriteArrayList) this.f1262c.f81c).iterator();
        while (it.hasNext()) {
            ((Z.B) it.next()).f1011a.j();
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        g1.d.e(menuItem, "item");
        boolean z2 = true;
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i != 0) {
            return false;
        }
        Iterator it = ((CopyOnWriteArrayList) this.f1262c.f81c).iterator();
        while (true) {
            if (!it.hasNext()) {
                z2 = false;
                break;
            }
            if (((Z.B) it.next()).f1011a.o()) {
                break;
            }
        }
        return z2;
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z2) {
        if (this.f1271o) {
            return;
        }
        Iterator it = this.f1268l.iterator();
        while (it.hasNext()) {
            ((L.a) it.next()).a(new B.h(z2));
        }
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        g1.d.e(intent, "intent");
        super.onNewIntent(intent);
        Iterator it = this.f1267k.iterator();
        while (it.hasNext()) {
            ((L.a) it.next()).a(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        g1.d.e(menu, "menu");
        Iterator it = ((CopyOnWriteArrayList) this.f1262c.f81c).iterator();
        while (it.hasNext()) {
            ((Z.B) it.next()).f1011a.p();
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z2) {
        if (this.f1272p) {
            return;
        }
        Iterator it = this.f1269m.iterator();
        while (it.hasNext()) {
            ((L.a) it.next()).a(new B.i(z2));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        g1.d.e(menu, "menu");
        if (i != 0) {
            return true;
        }
        super.onPreparePanel(i, view, menu);
        Iterator it = ((CopyOnWriteArrayList) this.f1262c.f81c).iterator();
        while (it.hasNext()) {
            ((Z.B) it.next()).f1011a.s();
        }
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        g1.d.e(strArr, "permissions");
        g1.d.e(iArr, "grantResults");
        if (this.h.a(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        h hVar;
        O o2 = this.f1263e;
        if (o2 == null && (hVar = (h) getLastNonConfigurationInstance()) != null) {
            o2 = hVar.f1247a;
        }
        if (o2 == null) {
            return null;
        }
        h hVar2 = new h();
        hVar2.f1247a = o2;
        return hVar2;
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        g1.d.e(bundle, "outState");
        androidx.lifecycle.t tVar = this.f1260a;
        if (tVar != null) {
            tVar.g();
        }
        m(bundle);
        this.d.c(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator it = this.f1266j.iterator();
        while (it.hasNext()) {
            ((L.a) it.next()).a(Integer.valueOf(i));
        }
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator it = this.f1270n.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if (a0.m()) {
                Trace.beginSection("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            n nVar = (n) this.f1265g.a();
            synchronized (nVar.f1277a) {
                try {
                    nVar.f1278b = true;
                    Iterator it = nVar.f1279c.iterator();
                    while (it.hasNext()) {
                        ((InterfaceC0099a) it.next()).a();
                    }
                    nVar.f1279c.clear();
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
        g1.d.d(decorView, "window.decorView");
        H.f(decorView, this);
        View decorView2 = getWindow().getDecorView();
        g1.d.d(decorView2, "window.decorView");
        decorView2.setTag(R.id.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        g1.d.d(decorView3, "window.decorView");
        C0227a.p(decorView3, this);
        View decorView4 = getWindow().getDecorView();
        g1.d.d(decorView4, "window.decorView");
        z1.d.U(decorView4, this);
        View decorView5 = getWindow().getDecorView();
        g1.d.d(decorView5, "window.decorView");
        decorView5.setTag(R.id.report_drawn, this);
        View decorView6 = getWindow().getDecorView();
        g1.d.d(decorView6, "window.decorView");
        i iVar = this.f1264f;
        iVar.getClass();
        if (!iVar.f1250c) {
            iVar.f1250c = true;
            decorView6.getViewTreeObserver().addOnDrawListener(iVar);
        }
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i) {
        g1.d.e(intent, "intent");
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) {
        g1.d.e(intentSender, "intent");
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i, Bundle bundle) {
        g1.d.e(intent, "intent");
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        g1.d.e(intentSender, "intent");
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z2, Configuration configuration) {
        g1.d.e(configuration, "newConfig");
        this.f1271o = true;
        try {
            super.onMultiWindowModeChanged(z2, configuration);
            this.f1271o = false;
            Iterator it = this.f1268l.iterator();
            while (it.hasNext()) {
                ((L.a) it.next()).a(new B.h(z2));
            }
        } catch (Throwable th) {
            this.f1271o = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z2, Configuration configuration) {
        g1.d.e(configuration, "newConfig");
        this.f1272p = true;
        try {
            super.onPictureInPictureModeChanged(z2, configuration);
            this.f1272p = false;
            Iterator it = this.f1269m.iterator();
            while (it.hasNext()) {
                ((L.a) it.next()).a(new B.i(z2));
            }
        } catch (Throwable th) {
            this.f1272p = false;
            throw th;
        }
    }
}
