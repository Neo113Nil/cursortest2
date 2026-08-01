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
import androidx.lifecycle.InterfaceC0068h;
import androidx.lifecycle.O;
import androidx.lifecycle.P;
import b.C0077a;
import b.InterfaceC0078b;
import b0.C0081c;
import com.winworm.neongrid.R;
import f1.InterfaceC0090a;
import g.AbstractActivityC0108i;
import i0.C0143a;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import k0.AbstractC0180a;

/* loaded from: classes.dex */
public abstract class l extends Activity implements P, InterfaceC0068h, i0.f, y, androidx.lifecycle.r, InterfaceC0013k {

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ int f1204r = 0;

    /* renamed from: a, reason: collision with root package name */
    public final androidx.lifecycle.t f1205a = new androidx.lifecycle.t(this);

    /* renamed from: b, reason: collision with root package name */
    public final C0077a f1206b = new C0077a();

    /* renamed from: c, reason: collision with root package name */
    public final C0014l f1207c;
    public final i0.e d;

    /* renamed from: e, reason: collision with root package name */
    public O f1208e;

    /* renamed from: f, reason: collision with root package name */
    public final i f1209f;

    /* renamed from: g, reason: collision with root package name */
    public final U0.e f1210g;
    public final j h;
    public final CopyOnWriteArrayList i;

    /* renamed from: j, reason: collision with root package name */
    public final CopyOnWriteArrayList f1211j;

    /* renamed from: k, reason: collision with root package name */
    public final CopyOnWriteArrayList f1212k;

    /* renamed from: l, reason: collision with root package name */
    public final CopyOnWriteArrayList f1213l;

    /* renamed from: m, reason: collision with root package name */
    public final CopyOnWriteArrayList f1214m;

    /* renamed from: n, reason: collision with root package name */
    public final CopyOnWriteArrayList f1215n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f1216o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f1217p;

    /* renamed from: q, reason: collision with root package name */
    public final U0.e f1218q;

    public l() {
        AbstractActivityC0108i abstractActivityC0108i = (AbstractActivityC0108i) this;
        this.f1207c = new C0014l(new d(abstractActivityC0108i, 0));
        i0.e eVar = new i0.e(this);
        this.d = eVar;
        this.f1209f = new i(abstractActivityC0108i);
        this.f1210g = new U0.e(new k(abstractActivityC0108i, 1));
        new AtomicInteger();
        this.h = new j();
        this.i = new CopyOnWriteArrayList();
        this.f1211j = new CopyOnWriteArrayList();
        this.f1212k = new CopyOnWriteArrayList();
        this.f1213l = new CopyOnWriteArrayList();
        this.f1214m = new CopyOnWriteArrayList();
        this.f1215n = new CopyOnWriteArrayList();
        androidx.lifecycle.t tVar = this.f1205a;
        if (tVar == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        tVar.a(new e(0, abstractActivityC0108i));
        this.f1205a.a(new e(1, abstractActivityC0108i));
        this.f1205a.a(new C0143a(2, abstractActivityC0108i));
        eVar.a();
        H.d(this);
        eVar.f2566b.e("android:support:activity-result", new Y.r(1, abstractActivityC0108i));
        h(new C0053t(abstractActivityC0108i, 1));
        this.f1218q = new U0.e(new k(abstractActivityC0108i, 2));
    }

    @Override // androidx.lifecycle.InterfaceC0068h
    public final C0081c a() {
        C0081c c0081c = new C0081c(0);
        Application application = getApplication();
        LinkedHashMap linkedHashMap = c0081c.f1661a;
        if (application != null) {
            J0.e eVar = H.d;
            Application application2 = getApplication();
            g1.d.d(application2, "application");
            linkedHashMap.put(eVar, application2);
        }
        linkedHashMap.put(H.f1488a, this);
        linkedHashMap.put(H.f1489b, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            linkedHashMap.put(H.f1490c, extras);
        }
        return c0081c;
    }

    @Override // i0.f
    public final i0.d b() {
        return this.d.f2566b;
    }

    @Override // androidx.lifecycle.P
    public final O c() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        if (this.f1208e == null) {
            h hVar = (h) getLastNonConfigurationInstance();
            if (hVar != null) {
                this.f1208e = hVar.f1192a;
            }
            if (this.f1208e == null) {
                this.f1208e = new O();
            }
        }
        O o2 = this.f1208e;
        g1.d.b(o2);
        return o2;
    }

    @Override // K.InterfaceC0013k
    public final boolean d(KeyEvent keyEvent) {
        g1.d.e(keyEvent, "event");
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        g1.d.e(keyEvent, "event");
        View decorView = getWindow().getDecorView();
        g1.d.d(decorView, "window.decorView");
        if (z1.l.q(decorView, keyEvent)) {
            return true;
        }
        return z1.l.r(this, decorView, this, keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        g1.d.e(keyEvent, "event");
        View decorView = getWindow().getDecorView();
        g1.d.d(decorView, "window.decorView");
        if (z1.l.q(decorView, keyEvent)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // androidx.lifecycle.r
    public final androidx.lifecycle.t e() {
        return this.f1205a;
    }

    public final void g(J.a aVar) {
        g1.d.e(aVar, "listener");
        this.i.add(aVar);
    }

    public final void h(InterfaceC0078b interfaceC0078b) {
        C0077a c0077a = this.f1206b;
        c0077a.getClass();
        l lVar = c0077a.f1659b;
        if (lVar != null) {
            interfaceC0078b.a(lVar);
        }
        c0077a.f1658a.add(interfaceC0078b);
    }

    public final x i() {
        return (x) this.f1218q.a();
    }

    public final void j(Bundle bundle) {
        super.onCreate(bundle);
        int i = D.f1486b;
        B.b(this);
    }

    public final void k(Bundle bundle) {
        g1.d.e(bundle, "outState");
        this.f1205a.g();
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
        g1.d.e(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            ((J.a) it.next()).a(configuration);
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        this.d.b(bundle);
        C0077a c0077a = this.f1206b;
        c0077a.getClass();
        c0077a.f1659b = this;
        Iterator it = c0077a.f1658a.iterator();
        while (it.hasNext()) {
            ((InterfaceC0078b) it.next()).a(this);
        }
        j(bundle);
        int i = D.f1486b;
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
        Iterator it = ((CopyOnWriteArrayList) this.f1207c.f492b).iterator();
        while (it.hasNext()) {
            ((Y.B) it.next()).f949a.j();
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
        Iterator it = ((CopyOnWriteArrayList) this.f1207c.f492b).iterator();
        while (true) {
            if (!it.hasNext()) {
                z2 = false;
                break;
            }
            if (((Y.B) it.next()).f949a.o()) {
                break;
            }
        }
        return z2;
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z2) {
        if (this.f1216o) {
            return;
        }
        Iterator it = this.f1213l.iterator();
        while (it.hasNext()) {
            ((J.a) it.next()).a(new z.f(z2));
        }
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        g1.d.e(intent, "intent");
        super.onNewIntent(intent);
        Iterator it = this.f1212k.iterator();
        while (it.hasNext()) {
            ((J.a) it.next()).a(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        g1.d.e(menu, "menu");
        Iterator it = ((CopyOnWriteArrayList) this.f1207c.f492b).iterator();
        while (it.hasNext()) {
            ((Y.B) it.next()).f949a.p();
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z2) {
        if (this.f1217p) {
            return;
        }
        Iterator it = this.f1214m.iterator();
        while (it.hasNext()) {
            ((J.a) it.next()).a(new z.g(z2));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        g1.d.e(menu, "menu");
        if (i != 0) {
            return true;
        }
        super.onPreparePanel(i, view, menu);
        Iterator it = ((CopyOnWriteArrayList) this.f1207c.f492b).iterator();
        while (it.hasNext()) {
            ((Y.B) it.next()).f949a.s();
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
        O o2 = this.f1208e;
        if (o2 == null && (hVar = (h) getLastNonConfigurationInstance()) != null) {
            o2 = hVar.f1192a;
        }
        if (o2 == null) {
            return null;
        }
        h hVar2 = new h();
        hVar2.f1192a = o2;
        return hVar2;
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        g1.d.e(bundle, "outState");
        androidx.lifecycle.t tVar = this.f1205a;
        if (tVar != null) {
            tVar.g();
        }
        k(bundle);
        this.d.c(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator it = this.f1211j.iterator();
        while (it.hasNext()) {
            ((J.a) it.next()).a(Integer.valueOf(i));
        }
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator it = this.f1215n.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if (AbstractC0180a.k()) {
                Trace.beginSection("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            n nVar = (n) this.f1210g.a();
            synchronized (nVar.f1222a) {
                try {
                    nVar.f1223b = true;
                    Iterator it = nVar.f1224c.iterator();
                    while (it.hasNext()) {
                        ((InterfaceC0090a) it.next()).b();
                    }
                    nVar.f1224c.clear();
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
        i0.g.p(decorView3, this);
        View decorView4 = getWindow().getDecorView();
        g1.d.d(decorView4, "window.decorView");
        z1.l.S(decorView4, this);
        View decorView5 = getWindow().getDecorView();
        g1.d.d(decorView5, "window.decorView");
        decorView5.setTag(R.id.report_drawn, this);
        View decorView6 = getWindow().getDecorView();
        g1.d.d(decorView6, "window.decorView");
        i iVar = this.f1209f;
        iVar.getClass();
        if (!iVar.f1195c) {
            iVar.f1195c = true;
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
        this.f1216o = true;
        try {
            super.onMultiWindowModeChanged(z2, configuration);
            this.f1216o = false;
            Iterator it = this.f1213l.iterator();
            while (it.hasNext()) {
                ((J.a) it.next()).a(new z.f(z2));
            }
        } catch (Throwable th) {
            this.f1216o = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z2, Configuration configuration) {
        g1.d.e(configuration, "newConfig");
        this.f1217p = true;
        try {
            super.onPictureInPictureModeChanged(z2, configuration);
            this.f1217p = false;
            Iterator it = this.f1214m.iterator();
            while (it.hasNext()) {
                ((J.a) it.next()).a(new z.g(z2));
            }
        } catch (Throwable th) {
            this.f1217p = false;
            throw th;
        }
    }
}
