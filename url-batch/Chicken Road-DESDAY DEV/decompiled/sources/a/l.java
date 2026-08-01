package a;

import K.C0011l;
import K.InterfaceC0010k;
import X.C0050t;
import a0.C0058c;
import a1.InterfaceC0059a;
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
import androidx.lifecycle.InterfaceC0068h;
import androidx.lifecycle.O;
import androidx.lifecycle.P;
import b.C0077a;
import b.InterfaceC0078b;
import com.playgen.securelock.R;
import g.AbstractActivityC0133i;
import h0.C0137a;
import j0.AbstractC0143a;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class l extends Activity implements P, InterfaceC0068h, h0.f, y, androidx.lifecycle.r, InterfaceC0010k {

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ int f1117r = 0;

    /* renamed from: a, reason: collision with root package name */
    public final androidx.lifecycle.t f1118a = new androidx.lifecycle.t(this);

    /* renamed from: b, reason: collision with root package name */
    public final C0077a f1119b = new C0077a();

    /* renamed from: c, reason: collision with root package name */
    public final C0011l f1120c;
    public final h0.e d;

    /* renamed from: e, reason: collision with root package name */
    public O f1121e;

    /* renamed from: f, reason: collision with root package name */
    public final i f1122f;

    /* renamed from: g, reason: collision with root package name */
    public final S0.e f1123g;
    public final j h;
    public final CopyOnWriteArrayList i;

    /* renamed from: j, reason: collision with root package name */
    public final CopyOnWriteArrayList f1124j;

    /* renamed from: k, reason: collision with root package name */
    public final CopyOnWriteArrayList f1125k;

    /* renamed from: l, reason: collision with root package name */
    public final CopyOnWriteArrayList f1126l;

    /* renamed from: m, reason: collision with root package name */
    public final CopyOnWriteArrayList f1127m;

    /* renamed from: n, reason: collision with root package name */
    public final CopyOnWriteArrayList f1128n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f1129o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f1130p;

    /* renamed from: q, reason: collision with root package name */
    public final S0.e f1131q;

    public l() {
        AbstractActivityC0133i abstractActivityC0133i = (AbstractActivityC0133i) this;
        this.f1120c = new C0011l(new d(abstractActivityC0133i, 0));
        h0.e eVar = new h0.e(this);
        this.d = eVar;
        this.f1122f = new i(abstractActivityC0133i);
        this.f1123g = new S0.e(new k(abstractActivityC0133i, 1));
        new AtomicInteger();
        this.h = new j();
        this.i = new CopyOnWriteArrayList();
        this.f1124j = new CopyOnWriteArrayList();
        this.f1125k = new CopyOnWriteArrayList();
        this.f1126l = new CopyOnWriteArrayList();
        this.f1127m = new CopyOnWriteArrayList();
        this.f1128n = new CopyOnWriteArrayList();
        androidx.lifecycle.t tVar = this.f1118a;
        if (tVar == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        tVar.a(new e(0, abstractActivityC0133i));
        this.f1118a.a(new e(1, abstractActivityC0133i));
        this.f1118a.a(new C0137a(2, abstractActivityC0133i));
        eVar.a();
        H.d(this);
        eVar.f2447b.e("android:support:activity-result", new X.r(1, abstractActivityC0133i));
        h(new C0050t(abstractActivityC0133i, 1));
        this.f1131q = new S0.e(new k(abstractActivityC0133i, 2));
    }

    @Override // androidx.lifecycle.InterfaceC0068h
    public final C0058c a() {
        C0058c c0058c = new C0058c(0);
        Application application = getApplication();
        LinkedHashMap linkedHashMap = c0058c.f1165a;
        if (application != null) {
            I0.e eVar = H.d;
            Application application2 = getApplication();
            b1.d.d(application2, "application");
            linkedHashMap.put(eVar, application2);
        }
        linkedHashMap.put(H.f1398a, this);
        linkedHashMap.put(H.f1399b, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            linkedHashMap.put(H.f1400c, extras);
        }
        return c0058c;
    }

    @Override // h0.f
    public final h0.d b() {
        return this.d.f2447b;
    }

    @Override // androidx.lifecycle.P
    public final O c() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        if (this.f1121e == null) {
            h hVar = (h) getLastNonConfigurationInstance();
            if (hVar != null) {
                this.f1121e = hVar.f1105a;
            }
            if (this.f1121e == null) {
                this.f1121e = new O();
            }
        }
        O o2 = this.f1121e;
        b1.d.b(o2);
        return o2;
    }

    @Override // androidx.lifecycle.r
    public final androidx.lifecycle.t d() {
        return this.f1118a;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        b1.d.e(keyEvent, "event");
        View decorView = getWindow().getDecorView();
        b1.d.d(decorView, "window.decorView");
        if (u1.l.t(decorView, keyEvent)) {
            return true;
        }
        return u1.l.u(this, decorView, this, keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        b1.d.e(keyEvent, "event");
        View decorView = getWindow().getDecorView();
        b1.d.d(decorView, "window.decorView");
        if (u1.l.t(decorView, keyEvent)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // K.InterfaceC0010k
    public final boolean e(KeyEvent keyEvent) {
        b1.d.e(keyEvent, "event");
        return super.dispatchKeyEvent(keyEvent);
    }

    public final void g(J.a aVar) {
        b1.d.e(aVar, "listener");
        this.i.add(aVar);
    }

    public final void h(InterfaceC0078b interfaceC0078b) {
        C0077a c0077a = this.f1119b;
        c0077a.getClass();
        l lVar = c0077a.f1560b;
        if (lVar != null) {
            interfaceC0078b.a(lVar);
        }
        c0077a.f1559a.add(interfaceC0078b);
    }

    public final x i() {
        return (x) this.f1131q.a();
    }

    public final void j(Bundle bundle) {
        super.onCreate(bundle);
        int i = D.f1396b;
        B.b(this);
    }

    public final void k(Bundle bundle) {
        b1.d.e(bundle, "outState");
        this.f1118a.g();
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
        b1.d.e(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            ((J.a) it.next()).a(configuration);
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        this.d.b(bundle);
        C0077a c0077a = this.f1119b;
        c0077a.getClass();
        c0077a.f1560b = this;
        Iterator it = c0077a.f1559a.iterator();
        while (it.hasNext()) {
            ((InterfaceC0078b) it.next()).a(this);
        }
        j(bundle);
        int i = D.f1396b;
        B.b(this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        b1.d.e(menu, "menu");
        if (i != 0) {
            return true;
        }
        super.onCreatePanelMenu(i, menu);
        getMenuInflater();
        Iterator it = ((CopyOnWriteArrayList) this.f1120c.f423c).iterator();
        while (it.hasNext()) {
            ((X.B) it.next()).f862a.j();
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        b1.d.e(menuItem, "item");
        boolean z2 = true;
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i != 0) {
            return false;
        }
        Iterator it = ((CopyOnWriteArrayList) this.f1120c.f423c).iterator();
        while (true) {
            if (!it.hasNext()) {
                z2 = false;
                break;
            }
            if (((X.B) it.next()).f862a.o()) {
                break;
            }
        }
        return z2;
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z2) {
        if (this.f1129o) {
            return;
        }
        Iterator it = this.f1126l.iterator();
        while (it.hasNext()) {
            ((J.a) it.next()).a(new z.f(z2));
        }
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        b1.d.e(intent, "intent");
        super.onNewIntent(intent);
        Iterator it = this.f1125k.iterator();
        while (it.hasNext()) {
            ((J.a) it.next()).a(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        b1.d.e(menu, "menu");
        Iterator it = ((CopyOnWriteArrayList) this.f1120c.f423c).iterator();
        while (it.hasNext()) {
            ((X.B) it.next()).f862a.p();
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z2) {
        if (this.f1130p) {
            return;
        }
        Iterator it = this.f1127m.iterator();
        while (it.hasNext()) {
            ((J.a) it.next()).a(new z.g(z2));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        b1.d.e(menu, "menu");
        if (i != 0) {
            return true;
        }
        super.onPreparePanel(i, view, menu);
        Iterator it = ((CopyOnWriteArrayList) this.f1120c.f423c).iterator();
        while (it.hasNext()) {
            ((X.B) it.next()).f862a.s();
        }
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        b1.d.e(strArr, "permissions");
        b1.d.e(iArr, "grantResults");
        if (this.h.a(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        h hVar;
        O o2 = this.f1121e;
        if (o2 == null && (hVar = (h) getLastNonConfigurationInstance()) != null) {
            o2 = hVar.f1105a;
        }
        if (o2 == null) {
            return null;
        }
        h hVar2 = new h();
        hVar2.f1105a = o2;
        return hVar2;
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        b1.d.e(bundle, "outState");
        androidx.lifecycle.t tVar = this.f1118a;
        if (tVar != null) {
            tVar.g();
        }
        k(bundle);
        this.d.c(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator it = this.f1124j.iterator();
        while (it.hasNext()) {
            ((J.a) it.next()).a(Integer.valueOf(i));
        }
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator it = this.f1128n.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if (AbstractC0143a.l()) {
                Trace.beginSection("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            n nVar = (n) this.f1123g.a();
            synchronized (nVar.f1135a) {
                try {
                    nVar.f1136b = true;
                    Iterator it = nVar.f1137c.iterator();
                    while (it.hasNext()) {
                        ((InterfaceC0059a) it.next()).a();
                    }
                    nVar.f1137c.clear();
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
        b1.d.d(decorView, "window.decorView");
        H.f(decorView, this);
        View decorView2 = getWindow().getDecorView();
        b1.d.d(decorView2, "window.decorView");
        decorView2.setTag(R.id.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        b1.d.d(decorView3, "window.decorView");
        u1.l.X(decorView3, this);
        View decorView4 = getWindow().getDecorView();
        b1.d.d(decorView4, "window.decorView");
        u1.d.k0(decorView4, this);
        View decorView5 = getWindow().getDecorView();
        b1.d.d(decorView5, "window.decorView");
        decorView5.setTag(R.id.report_drawn, this);
        View decorView6 = getWindow().getDecorView();
        b1.d.d(decorView6, "window.decorView");
        i iVar = this.f1122f;
        iVar.getClass();
        if (!iVar.f1108c) {
            iVar.f1108c = true;
            decorView6.getViewTreeObserver().addOnDrawListener(iVar);
        }
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i) {
        b1.d.e(intent, "intent");
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) {
        b1.d.e(intentSender, "intent");
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i, Bundle bundle) {
        b1.d.e(intent, "intent");
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        b1.d.e(intentSender, "intent");
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z2, Configuration configuration) {
        b1.d.e(configuration, "newConfig");
        this.f1129o = true;
        try {
            super.onMultiWindowModeChanged(z2, configuration);
            this.f1129o = false;
            Iterator it = this.f1126l.iterator();
            while (it.hasNext()) {
                ((J.a) it.next()).a(new z.f(z2));
            }
        } catch (Throwable th) {
            this.f1129o = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z2, Configuration configuration) {
        b1.d.e(configuration, "newConfig");
        this.f1130p = true;
        try {
            super.onPictureInPictureModeChanged(z2, configuration);
            this.f1130p = false;
            Iterator it = this.f1127m.iterator();
            while (it.hasNext()) {
                ((J.a) it.next()).a(new z.g(z2));
            }
        } catch (Throwable th) {
            this.f1130p = false;
            throw th;
        }
    }
}
