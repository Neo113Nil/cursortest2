package a;

import K.C0011l;
import K.InterfaceC0010k;
import X.C0050t;
import a0.C0057c;
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
import com.neonpulse.gridlogic.R;
import d1.InterfaceC0081a;
import g.AbstractActivityC0132i;
import h0.C0136a;
import j0.AbstractC0142a;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class l extends Activity implements P, InterfaceC0065h, h0.f, y, androidx.lifecycle.r, InterfaceC0010k {

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ int f1161r = 0;

    /* renamed from: a, reason: collision with root package name */
    public final androidx.lifecycle.t f1162a = new androidx.lifecycle.t(this);

    /* renamed from: b, reason: collision with root package name */
    public final C0074a f1163b = new C0074a();

    /* renamed from: c, reason: collision with root package name */
    public final C0011l f1164c;
    public final h0.e d;

    /* renamed from: e, reason: collision with root package name */
    public O f1165e;

    /* renamed from: f, reason: collision with root package name */
    public final i f1166f;

    /* renamed from: g, reason: collision with root package name */
    public final V0.d f1167g;
    public final j h;
    public final CopyOnWriteArrayList i;

    /* renamed from: j, reason: collision with root package name */
    public final CopyOnWriteArrayList f1168j;

    /* renamed from: k, reason: collision with root package name */
    public final CopyOnWriteArrayList f1169k;

    /* renamed from: l, reason: collision with root package name */
    public final CopyOnWriteArrayList f1170l;

    /* renamed from: m, reason: collision with root package name */
    public final CopyOnWriteArrayList f1171m;

    /* renamed from: n, reason: collision with root package name */
    public final CopyOnWriteArrayList f1172n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f1173o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f1174p;

    /* renamed from: q, reason: collision with root package name */
    public final V0.d f1175q;

    public l() {
        AbstractActivityC0132i abstractActivityC0132i = (AbstractActivityC0132i) this;
        this.f1164c = new C0011l(new d(abstractActivityC0132i, 0));
        h0.e eVar = new h0.e(this);
        this.d = eVar;
        this.f1166f = new i(abstractActivityC0132i);
        this.f1167g = new V0.d(new k(abstractActivityC0132i, 1));
        new AtomicInteger();
        this.h = new j();
        this.i = new CopyOnWriteArrayList();
        this.f1168j = new CopyOnWriteArrayList();
        this.f1169k = new CopyOnWriteArrayList();
        this.f1170l = new CopyOnWriteArrayList();
        this.f1171m = new CopyOnWriteArrayList();
        this.f1172n = new CopyOnWriteArrayList();
        androidx.lifecycle.t tVar = this.f1162a;
        if (tVar == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        tVar.a(new e(0, abstractActivityC0132i));
        this.f1162a.a(new e(1, abstractActivityC0132i));
        this.f1162a.a(new C0136a(2, abstractActivityC0132i));
        eVar.a();
        H.d(this);
        eVar.f2512b.e("android:support:activity-result", new X.r(1, abstractActivityC0132i));
        h(new C0050t(abstractActivityC0132i, 1));
        this.f1175q = new V0.d(new k(abstractActivityC0132i, 2));
    }

    @Override // androidx.lifecycle.InterfaceC0065h
    public final C0057c a() {
        C0057c c0057c = new C0057c(0);
        Application application = getApplication();
        LinkedHashMap linkedHashMap = c0057c.f1209a;
        if (application != null) {
            I0.e eVar = H.d;
            Application application2 = getApplication();
            e1.d.d(application2, "application");
            linkedHashMap.put(eVar, application2);
        }
        linkedHashMap.put(H.f1443a, this);
        linkedHashMap.put(H.f1444b, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            linkedHashMap.put(H.f1445c, extras);
        }
        return c0057c;
    }

    @Override // h0.f
    public final h0.d b() {
        return this.d.f2512b;
    }

    @Override // androidx.lifecycle.P
    public final O c() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        if (this.f1165e == null) {
            h hVar = (h) getLastNonConfigurationInstance();
            if (hVar != null) {
                this.f1165e = hVar.f1149a;
            }
            if (this.f1165e == null) {
                this.f1165e = new O();
            }
        }
        O o2 = this.f1165e;
        e1.d.b(o2);
        return o2;
    }

    @Override // androidx.lifecycle.r
    public final androidx.lifecycle.t d() {
        return this.f1162a;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        e1.d.e(keyEvent, "event");
        View decorView = getWindow().getDecorView();
        e1.d.d(decorView, "window.decorView");
        if (x1.d.v(decorView, keyEvent)) {
            return true;
        }
        return x1.d.w(this, decorView, this, keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        e1.d.e(keyEvent, "event");
        View decorView = getWindow().getDecorView();
        e1.d.d(decorView, "window.decorView");
        if (x1.d.v(decorView, keyEvent)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // K.InterfaceC0010k
    public final boolean e(KeyEvent keyEvent) {
        e1.d.e(keyEvent, "event");
        return super.dispatchKeyEvent(keyEvent);
    }

    public final void g(J.a aVar) {
        e1.d.e(aVar, "listener");
        this.i.add(aVar);
    }

    public final void h(InterfaceC0075b interfaceC0075b) {
        C0074a c0074a = this.f1163b;
        c0074a.getClass();
        l lVar = c0074a.f1605b;
        if (lVar != null) {
            interfaceC0075b.a(lVar);
        }
        c0074a.f1604a.add(interfaceC0075b);
    }

    public final x i() {
        return (x) this.f1175q.a();
    }

    public final void j(Bundle bundle) {
        super.onCreate(bundle);
        int i = D.f1441b;
        B.b(this);
    }

    public final void k(Bundle bundle) {
        e1.d.e(bundle, "outState");
        this.f1162a.g();
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
        e1.d.e(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            ((J.a) it.next()).a(configuration);
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        this.d.b(bundle);
        C0074a c0074a = this.f1163b;
        c0074a.getClass();
        c0074a.f1605b = this;
        Iterator it = c0074a.f1604a.iterator();
        while (it.hasNext()) {
            ((InterfaceC0075b) it.next()).a(this);
        }
        j(bundle);
        int i = D.f1441b;
        B.b(this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        e1.d.e(menu, "menu");
        if (i != 0) {
            return true;
        }
        super.onCreatePanelMenu(i, menu);
        getMenuInflater();
        Iterator it = ((CopyOnWriteArrayList) this.f1164c.f476c).iterator();
        while (it.hasNext()) {
            ((X.B) it.next()).f902a.j();
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        e1.d.e(menuItem, "item");
        boolean z2 = true;
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i != 0) {
            return false;
        }
        Iterator it = ((CopyOnWriteArrayList) this.f1164c.f476c).iterator();
        while (true) {
            if (!it.hasNext()) {
                z2 = false;
                break;
            }
            if (((X.B) it.next()).f902a.o()) {
                break;
            }
        }
        return z2;
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z2) {
        if (this.f1173o) {
            return;
        }
        Iterator it = this.f1170l.iterator();
        while (it.hasNext()) {
            ((J.a) it.next()).a(new z.f(z2));
        }
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        e1.d.e(intent, "intent");
        super.onNewIntent(intent);
        Iterator it = this.f1169k.iterator();
        while (it.hasNext()) {
            ((J.a) it.next()).a(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        e1.d.e(menu, "menu");
        Iterator it = ((CopyOnWriteArrayList) this.f1164c.f476c).iterator();
        while (it.hasNext()) {
            ((X.B) it.next()).f902a.p();
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z2) {
        if (this.f1174p) {
            return;
        }
        Iterator it = this.f1171m.iterator();
        while (it.hasNext()) {
            ((J.a) it.next()).a(new z.g(z2));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        e1.d.e(menu, "menu");
        if (i != 0) {
            return true;
        }
        super.onPreparePanel(i, view, menu);
        Iterator it = ((CopyOnWriteArrayList) this.f1164c.f476c).iterator();
        while (it.hasNext()) {
            ((X.B) it.next()).f902a.s();
        }
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        e1.d.e(strArr, "permissions");
        e1.d.e(iArr, "grantResults");
        if (this.h.a(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        h hVar;
        O o2 = this.f1165e;
        if (o2 == null && (hVar = (h) getLastNonConfigurationInstance()) != null) {
            o2 = hVar.f1149a;
        }
        if (o2 == null) {
            return null;
        }
        h hVar2 = new h();
        hVar2.f1149a = o2;
        return hVar2;
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        e1.d.e(bundle, "outState");
        androidx.lifecycle.t tVar = this.f1162a;
        if (tVar != null) {
            tVar.g();
        }
        k(bundle);
        this.d.c(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator it = this.f1168j.iterator();
        while (it.hasNext()) {
            ((J.a) it.next()).a(Integer.valueOf(i));
        }
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator it = this.f1172n.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if (AbstractC0142a.j()) {
                Trace.beginSection("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            n nVar = (n) this.f1167g.a();
            synchronized (nVar.f1179a) {
                try {
                    nVar.f1180b = true;
                    Iterator it = nVar.f1181c.iterator();
                    while (it.hasNext()) {
                        ((InterfaceC0081a) it.next()).a();
                    }
                    nVar.f1181c.clear();
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
        e1.d.d(decorView, "window.decorView");
        H.f(decorView, this);
        View decorView2 = getWindow().getDecorView();
        e1.d.d(decorView2, "window.decorView");
        decorView2.setTag(R.id.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        e1.d.d(decorView3, "window.decorView");
        x1.d.d0(decorView3, this);
        View decorView4 = getWindow().getDecorView();
        e1.d.d(decorView4, "window.decorView");
        x1.d.c0(decorView4, this);
        View decorView5 = getWindow().getDecorView();
        e1.d.d(decorView5, "window.decorView");
        decorView5.setTag(R.id.report_drawn, this);
        View decorView6 = getWindow().getDecorView();
        e1.d.d(decorView6, "window.decorView");
        i iVar = this.f1166f;
        iVar.getClass();
        if (!iVar.f1152c) {
            iVar.f1152c = true;
            decorView6.getViewTreeObserver().addOnDrawListener(iVar);
        }
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i) {
        e1.d.e(intent, "intent");
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) {
        e1.d.e(intentSender, "intent");
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i, Bundle bundle) {
        e1.d.e(intent, "intent");
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        e1.d.e(intentSender, "intent");
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z2, Configuration configuration) {
        e1.d.e(configuration, "newConfig");
        this.f1173o = true;
        try {
            super.onMultiWindowModeChanged(z2, configuration);
            this.f1173o = false;
            Iterator it = this.f1170l.iterator();
            while (it.hasNext()) {
                ((J.a) it.next()).a(new z.f(z2));
            }
        } catch (Throwable th) {
            this.f1173o = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z2, Configuration configuration) {
        e1.d.e(configuration, "newConfig");
        this.f1174p = true;
        try {
            super.onPictureInPictureModeChanged(z2, configuration);
            this.f1174p = false;
            Iterator it = this.f1171m.iterator();
            while (it.hasNext()) {
                ((J.a) it.next()).a(new z.g(z2));
            }
        } catch (Throwable th) {
            this.f1174p = false;
            throw th;
        }
    }
}
