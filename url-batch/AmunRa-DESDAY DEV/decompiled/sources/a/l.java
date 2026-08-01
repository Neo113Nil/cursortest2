package a;

import K.C0011l;
import K.InterfaceC0010k;
import X.C0050t;
import a0.C0058c;
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
import androidx.lifecycle.InterfaceC0066h;
import androidx.lifecycle.O;
import androidx.lifecycle.P;
import b.C0075a;
import b.InterfaceC0076b;
import com.visualfortune.eyerest.R;
import g.AbstractActivityC0131i;
import h0.C0135a;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class l extends Activity implements P, InterfaceC0066h, h0.f, y, androidx.lifecycle.r, InterfaceC0010k {

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ int f1092r = 0;

    /* renamed from: a, reason: collision with root package name */
    public final androidx.lifecycle.t f1093a = new androidx.lifecycle.t(this);

    /* renamed from: b, reason: collision with root package name */
    public final C0075a f1094b = new C0075a();

    /* renamed from: c, reason: collision with root package name */
    public final C0011l f1095c;
    public final h0.e d;

    /* renamed from: e, reason: collision with root package name */
    public O f1096e;

    /* renamed from: f, reason: collision with root package name */
    public final i f1097f;

    /* renamed from: g, reason: collision with root package name */
    public final Q0.d f1098g;
    public final j h;
    public final CopyOnWriteArrayList i;

    /* renamed from: j, reason: collision with root package name */
    public final CopyOnWriteArrayList f1099j;

    /* renamed from: k, reason: collision with root package name */
    public final CopyOnWriteArrayList f1100k;

    /* renamed from: l, reason: collision with root package name */
    public final CopyOnWriteArrayList f1101l;

    /* renamed from: m, reason: collision with root package name */
    public final CopyOnWriteArrayList f1102m;

    /* renamed from: n, reason: collision with root package name */
    public final CopyOnWriteArrayList f1103n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f1104o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f1105p;

    /* renamed from: q, reason: collision with root package name */
    public final Q0.d f1106q;

    public l() {
        AbstractActivityC0131i abstractActivityC0131i = (AbstractActivityC0131i) this;
        this.f1095c = new C0011l(new d(abstractActivityC0131i, 0));
        h0.e eVar = new h0.e(this);
        this.d = eVar;
        this.f1097f = new i(abstractActivityC0131i);
        this.f1098g = new Q0.d(new k(abstractActivityC0131i, 1));
        new AtomicInteger();
        this.h = new j();
        this.i = new CopyOnWriteArrayList();
        this.f1099j = new CopyOnWriteArrayList();
        this.f1100k = new CopyOnWriteArrayList();
        this.f1101l = new CopyOnWriteArrayList();
        this.f1102m = new CopyOnWriteArrayList();
        this.f1103n = new CopyOnWriteArrayList();
        androidx.lifecycle.t tVar = this.f1093a;
        if (tVar == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        tVar.a(new e(0, abstractActivityC0131i));
        this.f1093a.a(new e(1, abstractActivityC0131i));
        this.f1093a.a(new C0135a(2, abstractActivityC0131i));
        eVar.a();
        H.d(this);
        eVar.f2459b.e("android:support:activity-result", new X.r(1, abstractActivityC0131i));
        h(new C0050t(abstractActivityC0131i, 1));
        this.f1106q = new Q0.d(new k(abstractActivityC0131i, 2));
    }

    @Override // androidx.lifecycle.InterfaceC0066h
    public final C0058c a() {
        C0058c c0058c = new C0058c(0);
        Application application = getApplication();
        LinkedHashMap linkedHashMap = c0058c.f1140a;
        if (application != null) {
            I0.e eVar = H.d;
            Application application2 = getApplication();
            Z0.d.d(application2, "application");
            linkedHashMap.put(eVar, application2);
        }
        linkedHashMap.put(H.f1373a, this);
        linkedHashMap.put(H.f1374b, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            linkedHashMap.put(H.f1375c, extras);
        }
        return c0058c;
    }

    @Override // h0.f
    public final h0.d b() {
        return this.d.f2459b;
    }

    @Override // androidx.lifecycle.P
    public final O c() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        if (this.f1096e == null) {
            h hVar = (h) getLastNonConfigurationInstance();
            if (hVar != null) {
                this.f1096e = hVar.f1080a;
            }
            if (this.f1096e == null) {
                this.f1096e = new O();
            }
        }
        O o2 = this.f1096e;
        Z0.d.b(o2);
        return o2;
    }

    @Override // androidx.lifecycle.r
    public final androidx.lifecycle.t d() {
        return this.f1093a;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        Z0.d.e(keyEvent, "event");
        View decorView = getWindow().getDecorView();
        Z0.d.d(decorView, "window.decorView");
        if (s1.l.v(decorView, keyEvent)) {
            return true;
        }
        return s1.l.w(this, decorView, this, keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        Z0.d.e(keyEvent, "event");
        View decorView = getWindow().getDecorView();
        Z0.d.d(decorView, "window.decorView");
        if (s1.l.v(decorView, keyEvent)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // K.InterfaceC0010k
    public final boolean e(KeyEvent keyEvent) {
        Z0.d.e(keyEvent, "event");
        return super.dispatchKeyEvent(keyEvent);
    }

    public final void g(J.a aVar) {
        Z0.d.e(aVar, "listener");
        this.i.add(aVar);
    }

    public final void h(InterfaceC0076b interfaceC0076b) {
        C0075a c0075a = this.f1094b;
        c0075a.getClass();
        l lVar = c0075a.f1534b;
        if (lVar != null) {
            interfaceC0076b.a(lVar);
        }
        c0075a.f1533a.add(interfaceC0076b);
    }

    public final x i() {
        return (x) this.f1106q.a();
    }

    public final void j(Bundle bundle) {
        super.onCreate(bundle);
        int i = D.f1371b;
        B.b(this);
    }

    public final void k(Bundle bundle) {
        Z0.d.e(bundle, "outState");
        this.f1093a.g();
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
        Z0.d.e(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            ((J.a) it.next()).a(configuration);
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        this.d.b(bundle);
        C0075a c0075a = this.f1094b;
        c0075a.getClass();
        c0075a.f1534b = this;
        Iterator it = c0075a.f1533a.iterator();
        while (it.hasNext()) {
            ((InterfaceC0076b) it.next()).a(this);
        }
        j(bundle);
        int i = D.f1371b;
        B.b(this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        Z0.d.e(menu, "menu");
        if (i != 0) {
            return true;
        }
        super.onCreatePanelMenu(i, menu);
        getMenuInflater();
        Iterator it = ((CopyOnWriteArrayList) this.f1095c.f416c).iterator();
        while (it.hasNext()) {
            ((X.B) it.next()).f833a.j();
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        Z0.d.e(menuItem, "item");
        boolean z2 = true;
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i != 0) {
            return false;
        }
        Iterator it = ((CopyOnWriteArrayList) this.f1095c.f416c).iterator();
        while (true) {
            if (!it.hasNext()) {
                z2 = false;
                break;
            }
            if (((X.B) it.next()).f833a.o()) {
                break;
            }
        }
        return z2;
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z2) {
        if (this.f1104o) {
            return;
        }
        Iterator it = this.f1101l.iterator();
        while (it.hasNext()) {
            ((J.a) it.next()).a(new z.f(z2));
        }
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        Z0.d.e(intent, "intent");
        super.onNewIntent(intent);
        Iterator it = this.f1100k.iterator();
        while (it.hasNext()) {
            ((J.a) it.next()).a(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        Z0.d.e(menu, "menu");
        Iterator it = ((CopyOnWriteArrayList) this.f1095c.f416c).iterator();
        while (it.hasNext()) {
            ((X.B) it.next()).f833a.p();
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z2) {
        if (this.f1105p) {
            return;
        }
        Iterator it = this.f1102m.iterator();
        while (it.hasNext()) {
            ((J.a) it.next()).a(new z.g(z2));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        Z0.d.e(menu, "menu");
        if (i != 0) {
            return true;
        }
        super.onPreparePanel(i, view, menu);
        Iterator it = ((CopyOnWriteArrayList) this.f1095c.f416c).iterator();
        while (it.hasNext()) {
            ((X.B) it.next()).f833a.s();
        }
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        Z0.d.e(strArr, "permissions");
        Z0.d.e(iArr, "grantResults");
        if (this.h.a(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        h hVar;
        O o2 = this.f1096e;
        if (o2 == null && (hVar = (h) getLastNonConfigurationInstance()) != null) {
            o2 = hVar.f1080a;
        }
        if (o2 == null) {
            return null;
        }
        h hVar2 = new h();
        hVar2.f1080a = o2;
        return hVar2;
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        Z0.d.e(bundle, "outState");
        androidx.lifecycle.t tVar = this.f1093a;
        if (tVar != null) {
            tVar.g();
        }
        k(bundle);
        this.d.c(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator it = this.f1099j.iterator();
        while (it.hasNext()) {
            ((J.a) it.next()).a(Integer.valueOf(i));
        }
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator it = this.f1103n.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if (s1.l.I()) {
                Trace.beginSection("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            n nVar = (n) this.f1098g.a();
            synchronized (nVar.f1110a) {
                try {
                    nVar.f1111b = true;
                    Iterator it = nVar.f1112c.iterator();
                    while (it.hasNext()) {
                        ((Y0.a) it.next()).a();
                    }
                    nVar.f1112c.clear();
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
        Z0.d.d(decorView, "window.decorView");
        H.f(decorView, this);
        View decorView2 = getWindow().getDecorView();
        Z0.d.d(decorView2, "window.decorView");
        decorView2.setTag(R.id.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        Z0.d.d(decorView3, "window.decorView");
        s1.d.d0(decorView3, this);
        View decorView4 = getWindow().getDecorView();
        Z0.d.d(decorView4, "window.decorView");
        s1.l.X(decorView4, this);
        View decorView5 = getWindow().getDecorView();
        Z0.d.d(decorView5, "window.decorView");
        decorView5.setTag(R.id.report_drawn, this);
        View decorView6 = getWindow().getDecorView();
        Z0.d.d(decorView6, "window.decorView");
        i iVar = this.f1097f;
        iVar.getClass();
        if (!iVar.f1083c) {
            iVar.f1083c = true;
            decorView6.getViewTreeObserver().addOnDrawListener(iVar);
        }
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i) {
        Z0.d.e(intent, "intent");
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) {
        Z0.d.e(intentSender, "intent");
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i, Bundle bundle) {
        Z0.d.e(intent, "intent");
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        Z0.d.e(intentSender, "intent");
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z2, Configuration configuration) {
        Z0.d.e(configuration, "newConfig");
        this.f1104o = true;
        try {
            super.onMultiWindowModeChanged(z2, configuration);
            this.f1104o = false;
            Iterator it = this.f1101l.iterator();
            while (it.hasNext()) {
                ((J.a) it.next()).a(new z.f(z2));
            }
        } catch (Throwable th) {
            this.f1104o = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z2, Configuration configuration) {
        Z0.d.e(configuration, "newConfig");
        this.f1105p = true;
        try {
            super.onPictureInPictureModeChanged(z2, configuration);
            this.f1105p = false;
            Iterator it = this.f1102m.iterator();
            while (it.hasNext()) {
                ((J.a) it.next()).a(new z.g(z2));
            }
        } catch (Throwable th) {
            this.f1105p = false;
            throw th;
        }
    }
}
