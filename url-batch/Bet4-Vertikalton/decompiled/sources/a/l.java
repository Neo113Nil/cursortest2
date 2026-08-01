package a;

import K.C0014l;
import K.InterfaceC0013k;
import Y.C0053t;
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
import androidx.lifecycle.InterfaceC0067h;
import androidx.lifecycle.O;
import androidx.lifecycle.P;
import b.C0076a;
import b.InterfaceC0077b;
import b0.C0080c;
import c1.InterfaceC0085a;
import com.playbag.tripgear.R;
import g.AbstractActivityC0106i;
import i0.C0141a;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import m.C0260a;

/* loaded from: classes.dex */
public abstract class l extends Activity implements P, InterfaceC0067h, i0.f, y, androidx.lifecycle.r, InterfaceC0013k {

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ int f1174r = 0;

    /* renamed from: a, reason: collision with root package name */
    public final androidx.lifecycle.t f1175a = new androidx.lifecycle.t(this);

    /* renamed from: b, reason: collision with root package name */
    public final C0076a f1176b = new C0076a();

    /* renamed from: c, reason: collision with root package name */
    public final C0014l f1177c;
    public final i0.e d;

    /* renamed from: e, reason: collision with root package name */
    public O f1178e;

    /* renamed from: f, reason: collision with root package name */
    public final i f1179f;

    /* renamed from: g, reason: collision with root package name */
    public final R0.e f1180g;
    public final j h;
    public final CopyOnWriteArrayList i;

    /* renamed from: j, reason: collision with root package name */
    public final CopyOnWriteArrayList f1181j;

    /* renamed from: k, reason: collision with root package name */
    public final CopyOnWriteArrayList f1182k;

    /* renamed from: l, reason: collision with root package name */
    public final CopyOnWriteArrayList f1183l;

    /* renamed from: m, reason: collision with root package name */
    public final CopyOnWriteArrayList f1184m;

    /* renamed from: n, reason: collision with root package name */
    public final CopyOnWriteArrayList f1185n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f1186o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f1187p;

    /* renamed from: q, reason: collision with root package name */
    public final R0.e f1188q;

    public l() {
        AbstractActivityC0106i abstractActivityC0106i = (AbstractActivityC0106i) this;
        this.f1177c = new C0014l(new d(abstractActivityC0106i, 0));
        i0.e eVar = new i0.e(this);
        this.d = eVar;
        this.f1179f = new i(abstractActivityC0106i);
        this.f1180g = new R0.e(new k(abstractActivityC0106i, 1));
        new AtomicInteger();
        this.h = new j();
        this.i = new CopyOnWriteArrayList();
        this.f1181j = new CopyOnWriteArrayList();
        this.f1182k = new CopyOnWriteArrayList();
        this.f1183l = new CopyOnWriteArrayList();
        this.f1184m = new CopyOnWriteArrayList();
        this.f1185n = new CopyOnWriteArrayList();
        androidx.lifecycle.t tVar = this.f1175a;
        if (tVar == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        tVar.a(new e(0, abstractActivityC0106i));
        this.f1175a.a(new e(1, abstractActivityC0106i));
        this.f1175a.a(new C0141a(2, abstractActivityC0106i));
        eVar.a();
        H.d(this);
        eVar.f2535b.e("android:support:activity-result", new Y.r(1, abstractActivityC0106i));
        h(new C0053t(abstractActivityC0106i, 1));
        this.f1188q = new R0.e(new k(abstractActivityC0106i, 2));
    }

    @Override // androidx.lifecycle.InterfaceC0067h
    public final C0080c a() {
        C0080c c0080c = new C0080c(0);
        Application application = getApplication();
        LinkedHashMap linkedHashMap = c0080c.f1632a;
        if (application != null) {
            J0.e eVar = H.d;
            Application application2 = getApplication();
            d1.d.d(application2, "application");
            linkedHashMap.put(eVar, application2);
        }
        linkedHashMap.put(H.f1457a, this);
        linkedHashMap.put(H.f1458b, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            linkedHashMap.put(H.f1459c, extras);
        }
        return c0080c;
    }

    @Override // i0.f
    public final i0.d b() {
        return this.d.f2535b;
    }

    @Override // androidx.lifecycle.P
    public final O c() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        if (this.f1178e == null) {
            h hVar = (h) getLastNonConfigurationInstance();
            if (hVar != null) {
                this.f1178e = hVar.f1162a;
            }
            if (this.f1178e == null) {
                this.f1178e = new O();
            }
        }
        O o2 = this.f1178e;
        d1.d.b(o2);
        return o2;
    }

    @Override // androidx.lifecycle.r
    public final androidx.lifecycle.t d() {
        return this.f1175a;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        d1.d.e(keyEvent, "event");
        View decorView = getWindow().getDecorView();
        d1.d.d(decorView, "window.decorView");
        if (w1.l.r(decorView, keyEvent)) {
            return true;
        }
        return w1.l.s(this, decorView, this, keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        d1.d.e(keyEvent, "event");
        View decorView = getWindow().getDecorView();
        d1.d.d(decorView, "window.decorView");
        if (w1.l.r(decorView, keyEvent)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // K.InterfaceC0013k
    public final boolean e(KeyEvent keyEvent) {
        d1.d.e(keyEvent, "event");
        return super.dispatchKeyEvent(keyEvent);
    }

    public final void g(J.a aVar) {
        d1.d.e(aVar, "listener");
        this.i.add(aVar);
    }

    public final void h(InterfaceC0077b interfaceC0077b) {
        C0076a c0076a = this.f1176b;
        c0076a.getClass();
        l lVar = c0076a.f1630b;
        if (lVar != null) {
            interfaceC0077b.a(lVar);
        }
        c0076a.f1629a.add(interfaceC0077b);
    }

    public final x i() {
        return (x) this.f1188q.a();
    }

    public final void j(Bundle bundle) {
        super.onCreate(bundle);
        int i = D.f1455b;
        B.b(this);
    }

    public final void k(Bundle bundle) {
        d1.d.e(bundle, "outState");
        this.f1175a.g();
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
        d1.d.e(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            ((J.a) it.next()).a(configuration);
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        this.d.b(bundle);
        C0076a c0076a = this.f1176b;
        c0076a.getClass();
        c0076a.f1630b = this;
        Iterator it = c0076a.f1629a.iterator();
        while (it.hasNext()) {
            ((InterfaceC0077b) it.next()).a(this);
        }
        j(bundle);
        int i = D.f1455b;
        B.b(this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        d1.d.e(menu, "menu");
        if (i != 0) {
            return true;
        }
        super.onCreatePanelMenu(i, menu);
        getMenuInflater();
        Iterator it = ((CopyOnWriteArrayList) this.f1177c.f475b).iterator();
        while (it.hasNext()) {
            ((Y.B) it.next()).f922a.j();
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        d1.d.e(menuItem, "item");
        boolean z2 = true;
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i != 0) {
            return false;
        }
        Iterator it = ((CopyOnWriteArrayList) this.f1177c.f475b).iterator();
        while (true) {
            if (!it.hasNext()) {
                z2 = false;
                break;
            }
            if (((Y.B) it.next()).f922a.o()) {
                break;
            }
        }
        return z2;
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z2) {
        if (this.f1186o) {
            return;
        }
        Iterator it = this.f1183l.iterator();
        while (it.hasNext()) {
            ((J.a) it.next()).a(new z.f(z2));
        }
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        d1.d.e(intent, "intent");
        super.onNewIntent(intent);
        Iterator it = this.f1182k.iterator();
        while (it.hasNext()) {
            ((J.a) it.next()).a(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        d1.d.e(menu, "menu");
        Iterator it = ((CopyOnWriteArrayList) this.f1177c.f475b).iterator();
        while (it.hasNext()) {
            ((Y.B) it.next()).f922a.p();
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z2) {
        if (this.f1187p) {
            return;
        }
        Iterator it = this.f1184m.iterator();
        while (it.hasNext()) {
            ((J.a) it.next()).a(new z.g(z2));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        d1.d.e(menu, "menu");
        if (i != 0) {
            return true;
        }
        super.onPreparePanel(i, view, menu);
        Iterator it = ((CopyOnWriteArrayList) this.f1177c.f475b).iterator();
        while (it.hasNext()) {
            ((Y.B) it.next()).f922a.s();
        }
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        d1.d.e(strArr, "permissions");
        d1.d.e(iArr, "grantResults");
        if (this.h.a(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        h hVar;
        O o2 = this.f1178e;
        if (o2 == null && (hVar = (h) getLastNonConfigurationInstance()) != null) {
            o2 = hVar.f1162a;
        }
        if (o2 == null) {
            return null;
        }
        h hVar2 = new h();
        hVar2.f1162a = o2;
        return hVar2;
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        d1.d.e(bundle, "outState");
        androidx.lifecycle.t tVar = this.f1175a;
        if (tVar != null) {
            tVar.g();
        }
        k(bundle);
        this.d.c(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator it = this.f1181j.iterator();
        while (it.hasNext()) {
            ((J.a) it.next()).a(Integer.valueOf(i));
        }
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator it = this.f1185n.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if (h1.d.k()) {
                Trace.beginSection("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            n nVar = (n) this.f1180g.a();
            synchronized (nVar.f1192a) {
                try {
                    nVar.f1193b = true;
                    Iterator it = nVar.f1194c.iterator();
                    while (it.hasNext()) {
                        ((InterfaceC0085a) it.next()).b();
                    }
                    nVar.f1194c.clear();
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
        d1.d.d(decorView, "window.decorView");
        H.f(decorView, this);
        View decorView2 = getWindow().getDecorView();
        d1.d.d(decorView2, "window.decorView");
        decorView2.setTag(R.id.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        d1.d.d(decorView3, "window.decorView");
        C0260a.r(decorView3, this);
        View decorView4 = getWindow().getDecorView();
        d1.d.d(decorView4, "window.decorView");
        w1.d.j0(decorView4, this);
        View decorView5 = getWindow().getDecorView();
        d1.d.d(decorView5, "window.decorView");
        decorView5.setTag(R.id.report_drawn, this);
        View decorView6 = getWindow().getDecorView();
        d1.d.d(decorView6, "window.decorView");
        i iVar = this.f1179f;
        iVar.getClass();
        if (!iVar.f1165c) {
            iVar.f1165c = true;
            decorView6.getViewTreeObserver().addOnDrawListener(iVar);
        }
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i) {
        d1.d.e(intent, "intent");
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) {
        d1.d.e(intentSender, "intent");
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i, Bundle bundle) {
        d1.d.e(intent, "intent");
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        d1.d.e(intentSender, "intent");
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z2, Configuration configuration) {
        d1.d.e(configuration, "newConfig");
        this.f1186o = true;
        try {
            super.onMultiWindowModeChanged(z2, configuration);
            this.f1186o = false;
            Iterator it = this.f1183l.iterator();
            while (it.hasNext()) {
                ((J.a) it.next()).a(new z.f(z2));
            }
        } catch (Throwable th) {
            this.f1186o = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z2, Configuration configuration) {
        d1.d.e(configuration, "newConfig");
        this.f1187p = true;
        try {
            super.onPictureInPictureModeChanged(z2, configuration);
            this.f1187p = false;
            Iterator it = this.f1184m.iterator();
            while (it.hasNext()) {
                ((J.a) it.next()).a(new z.g(z2));
            }
        } catch (Throwable th) {
            this.f1187p = false;
            throw th;
        }
    }
}
