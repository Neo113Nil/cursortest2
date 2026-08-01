package a;

import K.C0012l;
import K.InterfaceC0011k;
import X.C0050t;
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
import androidx.lifecycle.InterfaceC0064h;
import androidx.lifecycle.O;
import androidx.lifecycle.P;
import b.C0073a;
import b.InterfaceC0074b;
import com.playminus.quickmatch.R;
import g.AbstractActivityC0125i;
import h0.C0129a;
import h0.C0132d;
import h0.C0133e;
import h0.InterfaceC0134f;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class l extends Activity implements P, InterfaceC0064h, InterfaceC0134f, y, androidx.lifecycle.r, InterfaceC0011k {

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ int f1056r = 0;

    /* renamed from: a, reason: collision with root package name */
    public final androidx.lifecycle.t f1057a = new androidx.lifecycle.t(this);

    /* renamed from: b, reason: collision with root package name */
    public final C0073a f1058b = new C0073a();

    /* renamed from: c, reason: collision with root package name */
    public final C0012l f1059c;
    public final C0133e d;

    /* renamed from: e, reason: collision with root package name */
    public O f1060e;

    /* renamed from: f, reason: collision with root package name */
    public final i f1061f;

    /* renamed from: g, reason: collision with root package name */
    public final P0.c f1062g;
    public final j h;
    public final CopyOnWriteArrayList i;

    /* renamed from: j, reason: collision with root package name */
    public final CopyOnWriteArrayList f1063j;

    /* renamed from: k, reason: collision with root package name */
    public final CopyOnWriteArrayList f1064k;

    /* renamed from: l, reason: collision with root package name */
    public final CopyOnWriteArrayList f1065l;

    /* renamed from: m, reason: collision with root package name */
    public final CopyOnWriteArrayList f1066m;

    /* renamed from: n, reason: collision with root package name */
    public final CopyOnWriteArrayList f1067n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f1068o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f1069p;

    /* renamed from: q, reason: collision with root package name */
    public final P0.c f1070q;

    public l() {
        AbstractActivityC0125i abstractActivityC0125i = (AbstractActivityC0125i) this;
        this.f1059c = new C0012l(new d(abstractActivityC0125i, 0));
        C0133e c0133e = new C0133e(this);
        this.d = c0133e;
        this.f1061f = new i(abstractActivityC0125i);
        this.f1062g = new P0.c(new k(abstractActivityC0125i, 1));
        new AtomicInteger();
        this.h = new j();
        this.i = new CopyOnWriteArrayList();
        this.f1063j = new CopyOnWriteArrayList();
        this.f1064k = new CopyOnWriteArrayList();
        this.f1065l = new CopyOnWriteArrayList();
        this.f1066m = new CopyOnWriteArrayList();
        this.f1067n = new CopyOnWriteArrayList();
        androidx.lifecycle.t tVar = this.f1057a;
        if (tVar == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        tVar.a(new e(0, abstractActivityC0125i));
        this.f1057a.a(new e(1, abstractActivityC0125i));
        this.f1057a.a(new C0129a(2, abstractActivityC0125i));
        c0133e.a();
        H.d(this);
        c0133e.f2376b.e("android:support:activity-result", new X.r(1, abstractActivityC0125i));
        h(new C0050t(abstractActivityC0125i, 1));
        this.f1070q = new P0.c(new k(abstractActivityC0125i, 2));
    }

    @Override // androidx.lifecycle.InterfaceC0064h
    public final a0.c a() {
        a0.c cVar = new a0.c(0);
        Application application = getApplication();
        LinkedHashMap linkedHashMap = cVar.f1104a;
        if (application != null) {
            H0.e eVar = H.d;
            Application application2 = getApplication();
            X0.d.d(application2, "application");
            linkedHashMap.put(eVar, application2);
        }
        linkedHashMap.put(H.f1337a, this);
        linkedHashMap.put(H.f1338b, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            linkedHashMap.put(H.f1339c, extras);
        }
        return cVar;
    }

    @Override // h0.InterfaceC0134f
    public final C0132d b() {
        return this.d.f2376b;
    }

    @Override // androidx.lifecycle.P
    public final O c() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        if (this.f1060e == null) {
            h hVar = (h) getLastNonConfigurationInstance();
            if (hVar != null) {
                this.f1060e = hVar.f1044a;
            }
            if (this.f1060e == null) {
                this.f1060e = new O();
            }
        }
        O o2 = this.f1060e;
        X0.d.b(o2);
        return o2;
    }

    @Override // androidx.lifecycle.r
    public final androidx.lifecycle.t d() {
        return this.f1057a;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        X0.d.e(keyEvent, "event");
        View decorView = getWindow().getDecorView();
        X0.d.d(decorView, "window.decorView");
        if (q1.d.v(decorView, keyEvent)) {
            return true;
        }
        return q1.d.w(this, decorView, this, keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        X0.d.e(keyEvent, "event");
        View decorView = getWindow().getDecorView();
        X0.d.d(decorView, "window.decorView");
        if (q1.d.v(decorView, keyEvent)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // K.InterfaceC0011k
    public final boolean e(KeyEvent keyEvent) {
        X0.d.e(keyEvent, "event");
        return super.dispatchKeyEvent(keyEvent);
    }

    public final void g(J.a aVar) {
        X0.d.e(aVar, "listener");
        this.i.add(aVar);
    }

    public final void h(InterfaceC0074b interfaceC0074b) {
        C0073a c0073a = this.f1058b;
        c0073a.getClass();
        l lVar = c0073a.f1499b;
        if (lVar != null) {
            interfaceC0074b.a(lVar);
        }
        c0073a.f1498a.add(interfaceC0074b);
    }

    public final x i() {
        return (x) this.f1070q.a();
    }

    public final void j(Bundle bundle) {
        super.onCreate(bundle);
        int i = D.f1335b;
        B.b(this);
    }

    public final void k(Bundle bundle) {
        X0.d.e(bundle, "outState");
        this.f1057a.g();
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
        X0.d.e(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            ((J.a) it.next()).a(configuration);
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        this.d.b(bundle);
        C0073a c0073a = this.f1058b;
        c0073a.getClass();
        c0073a.f1499b = this;
        Iterator it = c0073a.f1498a.iterator();
        while (it.hasNext()) {
            ((InterfaceC0074b) it.next()).a(this);
        }
        j(bundle);
        int i = D.f1335b;
        B.b(this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        X0.d.e(menu, "menu");
        if (i != 0) {
            return true;
        }
        super.onCreatePanelMenu(i, menu);
        getMenuInflater();
        Iterator it = ((CopyOnWriteArrayList) this.f1059c.f432c).iterator();
        while (it.hasNext()) {
            ((X.B) it.next()).f790a.j();
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        X0.d.e(menuItem, "item");
        boolean z2 = true;
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i != 0) {
            return false;
        }
        Iterator it = ((CopyOnWriteArrayList) this.f1059c.f432c).iterator();
        while (true) {
            if (!it.hasNext()) {
                z2 = false;
                break;
            }
            if (((X.B) it.next()).f790a.o()) {
                break;
            }
        }
        return z2;
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z2) {
        if (this.f1068o) {
            return;
        }
        Iterator it = this.f1065l.iterator();
        while (it.hasNext()) {
            ((J.a) it.next()).a(new z.f(z2));
        }
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        X0.d.e(intent, "intent");
        super.onNewIntent(intent);
        Iterator it = this.f1064k.iterator();
        while (it.hasNext()) {
            ((J.a) it.next()).a(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        X0.d.e(menu, "menu");
        Iterator it = ((CopyOnWriteArrayList) this.f1059c.f432c).iterator();
        while (it.hasNext()) {
            ((X.B) it.next()).f790a.p();
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z2) {
        if (this.f1069p) {
            return;
        }
        Iterator it = this.f1066m.iterator();
        while (it.hasNext()) {
            ((J.a) it.next()).a(new z.g(z2));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        X0.d.e(menu, "menu");
        if (i != 0) {
            return true;
        }
        super.onPreparePanel(i, view, menu);
        Iterator it = ((CopyOnWriteArrayList) this.f1059c.f432c).iterator();
        while (it.hasNext()) {
            ((X.B) it.next()).f790a.s();
        }
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        X0.d.e(strArr, "permissions");
        X0.d.e(iArr, "grantResults");
        if (this.h.a(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        h hVar;
        O o2 = this.f1060e;
        if (o2 == null && (hVar = (h) getLastNonConfigurationInstance()) != null) {
            o2 = hVar.f1044a;
        }
        if (o2 == null) {
            return null;
        }
        h hVar2 = new h();
        hVar2.f1044a = o2;
        return hVar2;
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        X0.d.e(bundle, "outState");
        androidx.lifecycle.t tVar = this.f1057a;
        if (tVar != null) {
            tVar.g();
        }
        k(bundle);
        this.d.c(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator it = this.f1063j.iterator();
        while (it.hasNext()) {
            ((J.a) it.next()).a(Integer.valueOf(i));
        }
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator it = this.f1067n.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if (i1.s.m()) {
                Trace.beginSection("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            n nVar = (n) this.f1062g.a();
            synchronized (nVar.f1074a) {
                try {
                    nVar.f1075b = true;
                    Iterator it = nVar.f1076c.iterator();
                    while (it.hasNext()) {
                        ((W0.a) it.next()).a();
                    }
                    nVar.f1076c.clear();
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
        X0.d.d(decorView, "window.decorView");
        H.f(decorView, this);
        View decorView2 = getWindow().getDecorView();
        X0.d.d(decorView2, "window.decorView");
        decorView2.setTag(R.id.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        X0.d.d(decorView3, "window.decorView");
        q1.d.k0(decorView3, this);
        View decorView4 = getWindow().getDecorView();
        X0.d.d(decorView4, "window.decorView");
        q1.l.T(decorView4, this);
        View decorView5 = getWindow().getDecorView();
        X0.d.d(decorView5, "window.decorView");
        decorView5.setTag(R.id.report_drawn, this);
        View decorView6 = getWindow().getDecorView();
        X0.d.d(decorView6, "window.decorView");
        i iVar = this.f1061f;
        iVar.getClass();
        if (!iVar.f1047c) {
            iVar.f1047c = true;
            decorView6.getViewTreeObserver().addOnDrawListener(iVar);
        }
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i) {
        X0.d.e(intent, "intent");
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) {
        X0.d.e(intentSender, "intent");
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i, Bundle bundle) {
        X0.d.e(intent, "intent");
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        X0.d.e(intentSender, "intent");
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z2, Configuration configuration) {
        X0.d.e(configuration, "newConfig");
        this.f1068o = true;
        try {
            super.onMultiWindowModeChanged(z2, configuration);
            this.f1068o = false;
            Iterator it = this.f1065l.iterator();
            while (it.hasNext()) {
                ((J.a) it.next()).a(new z.f(z2));
            }
        } catch (Throwable th) {
            this.f1068o = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z2, Configuration configuration) {
        X0.d.e(configuration, "newConfig");
        this.f1069p = true;
        try {
            super.onPictureInPictureModeChanged(z2, configuration);
            this.f1069p = false;
            Iterator it = this.f1066m.iterator();
            while (it.hasNext()) {
                ((J.a) it.next()).a(new z.g(z2));
            }
        } catch (Throwable th) {
            this.f1069p = false;
            throw th;
        }
    }
}
