package a;

import K.C0012m;
import K.InterfaceC0011l;
import X.B;
import X.C0050t;
import a0.C0059c;
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
import b.C0079a;
import b.InterfaceC0080b;
import com.clutchquizarena.app.R;
import g.AbstractActivityC0136i;
import h0.C0141a;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class l extends Activity implements S, InterfaceC0067h, h0.f, y, androidx.lifecycle.t, InterfaceC0011l {

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ int f1198r = 0;

    /* renamed from: a, reason: collision with root package name */
    public final androidx.lifecycle.v f1199a = new androidx.lifecycle.v(this);

    /* renamed from: b, reason: collision with root package name */
    public final C0079a f1200b = new C0079a();

    /* renamed from: c, reason: collision with root package name */
    public final C0012m f1201c;
    public final h0.e d;

    /* renamed from: e, reason: collision with root package name */
    public Q f1202e;

    /* renamed from: f, reason: collision with root package name */
    public final i f1203f;

    /* renamed from: g, reason: collision with root package name */
    public final U0.g f1204g;
    public final j h;
    public final CopyOnWriteArrayList i;

    /* renamed from: j, reason: collision with root package name */
    public final CopyOnWriteArrayList f1205j;

    /* renamed from: k, reason: collision with root package name */
    public final CopyOnWriteArrayList f1206k;

    /* renamed from: l, reason: collision with root package name */
    public final CopyOnWriteArrayList f1207l;

    /* renamed from: m, reason: collision with root package name */
    public final CopyOnWriteArrayList f1208m;

    /* renamed from: n, reason: collision with root package name */
    public final CopyOnWriteArrayList f1209n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f1210o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f1211p;

    /* renamed from: q, reason: collision with root package name */
    public final U0.g f1212q;

    public l() {
        AbstractActivityC0136i abstractActivityC0136i = (AbstractActivityC0136i) this;
        this.f1201c = new C0012m(new d(abstractActivityC0136i, 0));
        h0.e eVar = new h0.e(this);
        this.d = eVar;
        this.f1203f = new i(abstractActivityC0136i);
        this.f1204g = new U0.g(new k(abstractActivityC0136i, 1));
        new AtomicInteger();
        this.h = new j();
        this.i = new CopyOnWriteArrayList();
        this.f1205j = new CopyOnWriteArrayList();
        this.f1206k = new CopyOnWriteArrayList();
        this.f1207l = new CopyOnWriteArrayList();
        this.f1208m = new CopyOnWriteArrayList();
        this.f1209n = new CopyOnWriteArrayList();
        androidx.lifecycle.v vVar = this.f1199a;
        if (vVar == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        vVar.a(new e(0, abstractActivityC0136i));
        this.f1199a.a(new e(1, abstractActivityC0136i));
        this.f1199a.a(new C0141a(2, abstractActivityC0136i));
        eVar.a();
        J.d(this);
        eVar.f2580b.e("android:support:activity-result", new X.r(1, abstractActivityC0136i));
        h(new C0050t(abstractActivityC0136i, 1));
        this.f1212q = new U0.g(new k(abstractActivityC0136i, 2));
    }

    @Override // androidx.lifecycle.InterfaceC0067h
    public final C0059c a() {
        C0059c c0059c = new C0059c(0);
        Application application = getApplication();
        LinkedHashMap linkedHashMap = c0059c.f1243a;
        if (application != null) {
            O0.e eVar = J.d;
            Application application2 = getApplication();
            g1.f.d(application2, "application");
            linkedHashMap.put(eVar, application2);
        }
        linkedHashMap.put(J.f1480a, this);
        linkedHashMap.put(J.f1481b, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            linkedHashMap.put(J.f1482c, extras);
        }
        return c0059c;
    }

    @Override // h0.f
    public final h0.d b() {
        return this.d.f2580b;
    }

    @Override // androidx.lifecycle.S
    public final Q c() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        if (this.f1202e == null) {
            h hVar = (h) getLastNonConfigurationInstance();
            if (hVar != null) {
                this.f1202e = hVar.f1186a;
            }
            if (this.f1202e == null) {
                this.f1202e = new Q();
            }
        }
        Q q2 = this.f1202e;
        g1.f.b(q2);
        return q2;
    }

    @Override // androidx.lifecycle.t
    public final androidx.lifecycle.v d() {
        return this.f1199a;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        g1.f.e(keyEvent, "event");
        View decorView = getWindow().getDecorView();
        g1.f.d(decorView, "window.decorView");
        if (A.c.A(decorView, keyEvent)) {
            return true;
        }
        return A.c.B(this, decorView, this, keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        g1.f.e(keyEvent, "event");
        View decorView = getWindow().getDecorView();
        g1.f.d(decorView, "window.decorView");
        if (A.c.A(decorView, keyEvent)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // K.InterfaceC0011l
    public final boolean e(KeyEvent keyEvent) {
        g1.f.e(keyEvent, "event");
        return super.dispatchKeyEvent(keyEvent);
    }

    public final void g(J.a aVar) {
        g1.f.e(aVar, "listener");
        this.i.add(aVar);
    }

    public final void h(InterfaceC0080b interfaceC0080b) {
        C0079a c0079a = this.f1200b;
        c0079a.getClass();
        l lVar = c0079a.f1697b;
        if (lVar != null) {
            interfaceC0080b.a(lVar);
        }
        c0079a.f1696a.add(interfaceC0080b);
    }

    public final x i() {
        return (x) this.f1212q.a();
    }

    public final void j(Bundle bundle) {
        super.onCreate(bundle);
        int i = F.f1478b;
        D.b(this);
    }

    public final void k(Bundle bundle) {
        g1.f.e(bundle, "outState");
        this.f1199a.g();
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
        i().c();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        g1.f.e(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            ((J.a) it.next()).a(configuration);
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        this.d.b(bundle);
        C0079a c0079a = this.f1200b;
        c0079a.getClass();
        c0079a.f1697b = this;
        Iterator it = c0079a.f1696a.iterator();
        while (it.hasNext()) {
            ((InterfaceC0080b) it.next()).a(this);
        }
        j(bundle);
        int i = F.f1478b;
        D.b(this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        g1.f.e(menu, "menu");
        if (i != 0) {
            return true;
        }
        super.onCreatePanelMenu(i, menu);
        getMenuInflater();
        Iterator it = ((CopyOnWriteArrayList) this.f1201c.f423c).iterator();
        while (it.hasNext()) {
            ((B) it.next()).f928a.j();
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        g1.f.e(menuItem, "item");
        boolean z2 = true;
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i != 0) {
            return false;
        }
        Iterator it = ((CopyOnWriteArrayList) this.f1201c.f423c).iterator();
        while (true) {
            if (!it.hasNext()) {
                z2 = false;
                break;
            }
            if (((B) it.next()).f928a.o()) {
                break;
            }
        }
        return z2;
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z2) {
        if (this.f1210o) {
            return;
        }
        Iterator it = this.f1207l.iterator();
        while (it.hasNext()) {
            ((J.a) it.next()).a(new z.f(z2));
        }
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        g1.f.e(intent, "intent");
        super.onNewIntent(intent);
        Iterator it = this.f1206k.iterator();
        while (it.hasNext()) {
            ((J.a) it.next()).a(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        g1.f.e(menu, "menu");
        Iterator it = ((CopyOnWriteArrayList) this.f1201c.f423c).iterator();
        while (it.hasNext()) {
            ((B) it.next()).f928a.p();
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z2) {
        if (this.f1211p) {
            return;
        }
        Iterator it = this.f1208m.iterator();
        while (it.hasNext()) {
            ((J.a) it.next()).a(new z.g(z2));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        g1.f.e(menu, "menu");
        if (i != 0) {
            return true;
        }
        super.onPreparePanel(i, view, menu);
        Iterator it = ((CopyOnWriteArrayList) this.f1201c.f423c).iterator();
        while (it.hasNext()) {
            ((B) it.next()).f928a.s();
        }
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        g1.f.e(strArr, "permissions");
        g1.f.e(iArr, "grantResults");
        if (this.h.a(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        h hVar;
        Q q2 = this.f1202e;
        if (q2 == null && (hVar = (h) getLastNonConfigurationInstance()) != null) {
            q2 = hVar.f1186a;
        }
        if (q2 == null) {
            return null;
        }
        h hVar2 = new h();
        hVar2.f1186a = q2;
        return hVar2;
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        g1.f.e(bundle, "outState");
        androidx.lifecycle.v vVar = this.f1199a;
        if (vVar != null) {
            vVar.g();
        }
        k(bundle);
        this.d.c(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator it = this.f1205j.iterator();
        while (it.hasNext()) {
            ((J.a) it.next()).a(Integer.valueOf(i));
        }
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator it = this.f1209n.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if (h0.g.g()) {
                Trace.beginSection("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            n nVar = (n) this.f1204g.a();
            synchronized (nVar.f1216a) {
                try {
                    nVar.f1217b = true;
                    Iterator it = nVar.f1218c.iterator();
                    while (it.hasNext()) {
                        ((f1.a) it.next()).c();
                    }
                    nVar.f1218c.clear();
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
        g1.f.d(decorView, "window.decorView");
        J.g(decorView, this);
        View decorView2 = getWindow().getDecorView();
        g1.f.d(decorView2, "window.decorView");
        decorView2.setTag(R.id.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        g1.f.d(decorView3, "window.decorView");
        h0.g.k(decorView3, this);
        View decorView4 = getWindow().getDecorView();
        g1.f.d(decorView4, "window.decorView");
        T.d.N(decorView4, this);
        View decorView5 = getWindow().getDecorView();
        g1.f.d(decorView5, "window.decorView");
        decorView5.setTag(R.id.report_drawn, this);
        View decorView6 = getWindow().getDecorView();
        g1.f.d(decorView6, "window.decorView");
        i iVar = this.f1203f;
        iVar.getClass();
        if (!iVar.f1189c) {
            iVar.f1189c = true;
            decorView6.getViewTreeObserver().addOnDrawListener(iVar);
        }
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i) {
        g1.f.e(intent, "intent");
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) {
        g1.f.e(intentSender, "intent");
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i, Bundle bundle) {
        g1.f.e(intent, "intent");
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        g1.f.e(intentSender, "intent");
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z2, Configuration configuration) {
        g1.f.e(configuration, "newConfig");
        this.f1210o = true;
        try {
            super.onMultiWindowModeChanged(z2, configuration);
            this.f1210o = false;
            Iterator it = this.f1207l.iterator();
            while (it.hasNext()) {
                ((J.a) it.next()).a(new z.f(z2));
            }
        } catch (Throwable th) {
            this.f1210o = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z2, Configuration configuration) {
        g1.f.e(configuration, "newConfig");
        this.f1211p = true;
        try {
            super.onPictureInPictureModeChanged(z2, configuration);
            this.f1211p = false;
            Iterator it = this.f1208m.iterator();
            while (it.hasNext()) {
                ((J.a) it.next()).a(new z.g(z2));
            }
        } catch (Throwable th) {
            this.f1211p = false;
            throw th;
        }
    }
}
