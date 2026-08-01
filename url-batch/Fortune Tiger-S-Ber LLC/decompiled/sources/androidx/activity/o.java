package androidx.activity;

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
import androidx.lifecycle.m0;
import androidx.lifecycle.o0;
import androidx.lifecycle.p0;
import com.gglhk.bofio.fortunetiger.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public abstract class o extends Activity implements p0, androidx.lifecycle.h, c1.f, androidx.lifecycle.r, k0.i {

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f125w = 0;

    /* renamed from: f, reason: collision with root package name */
    public final androidx.lifecycle.t f126f = new androidx.lifecycle.t(this);
    public final a.a g = new a.a();
    public final androidx.emoji2.text.s h;

    /* renamed from: i, reason: collision with root package name */
    public final c1.e f127i;

    /* renamed from: j, reason: collision with root package name */
    public o0 f128j;

    /* renamed from: k, reason: collision with root package name */
    public final k f129k;

    /* renamed from: l, reason: collision with root package name */
    public final m2.b f130l;

    /* renamed from: m, reason: collision with root package name */
    public final l f131m;

    /* renamed from: n, reason: collision with root package name */
    public final CopyOnWriteArrayList f132n;

    /* renamed from: o, reason: collision with root package name */
    public final CopyOnWriteArrayList f133o;

    /* renamed from: p, reason: collision with root package name */
    public final CopyOnWriteArrayList f134p;

    /* renamed from: q, reason: collision with root package name */
    public final CopyOnWriteArrayList f135q;

    /* renamed from: r, reason: collision with root package name */
    public final CopyOnWriteArrayList f136r;

    /* renamed from: s, reason: collision with root package name */
    public final CopyOnWriteArrayList f137s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f138t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f139u;

    /* renamed from: v, reason: collision with root package name */
    public final m2.b f140v;

    public o() {
        final f.i iVar = (f.i) this;
        this.h = new androidx.emoji2.text.s(new d(iVar, 0));
        c1.e eVar = new c1.e(this);
        this.f127i = eVar;
        this.f129k = new k(iVar);
        this.f130l = new m2.b(new m(iVar, 1));
        new AtomicInteger();
        this.f131m = new l();
        this.f132n = new CopyOnWriteArrayList();
        this.f133o = new CopyOnWriteArrayList();
        this.f134p = new CopyOnWriteArrayList();
        this.f135q = new CopyOnWriteArrayList();
        this.f136r = new CopyOnWriteArrayList();
        this.f137s = new CopyOnWriteArrayList();
        androidx.lifecycle.t tVar = this.f126f;
        if (tVar == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        tVar.a(new e(0, iVar));
        this.f126f.a(new e(1, iVar));
        this.f126f.a(new androidx.lifecycle.p() { // from class: androidx.activity.ComponentActivity$4
            @Override // androidx.lifecycle.p
            public final void a(androidx.lifecycle.r rVar, androidx.lifecycle.l lVar) {
                int i4 = o.f125w;
                f.i iVar2 = f.i.this;
                if (iVar2.f128j == null) {
                    j jVar = (j) iVar2.getLastNonConfigurationInstance();
                    if (jVar != null) {
                        iVar2.f128j = jVar.f113a;
                    }
                    if (iVar2.f128j == null) {
                        iVar2.f128j = new o0();
                    }
                }
                iVar2.f126f.f(this);
            }
        });
        eVar.a();
        androidx.lifecycle.g0.a(this);
        eVar.f1004b.e("android:support:activity-result", new f(0, iVar));
        h(new g(iVar, 0));
        this.f140v = new m2.b(new m(iVar, 2));
    }

    @Override // c1.f
    public final c1.d a() {
        return this.f127i.f1004b;
    }

    @Override // k0.i
    public final boolean b(KeyEvent keyEvent) {
        u2.c.e(keyEvent, "event");
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // androidx.lifecycle.h
    public final x0.b c() {
        x0.b bVar = new x0.b(0);
        LinkedHashMap linkedHashMap = (LinkedHashMap) bVar.f2763a;
        if (getApplication() != null) {
            m0 m0Var = m0.f594a;
            Application application = getApplication();
            u2.c.d(application, "application");
            linkedHashMap.put(m0Var, application);
        }
        linkedHashMap.put(androidx.lifecycle.g0.f581a, this);
        linkedHashMap.put(androidx.lifecycle.g0.f582b, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            linkedHashMap.put(androidx.lifecycle.g0.c, extras);
        }
        return bVar;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        u2.c.e(keyEvent, "event");
        View decorView = getWindow().getDecorView();
        u2.c.d(decorView, "window.decorView");
        if (k3.d.w(decorView, keyEvent)) {
            return true;
        }
        return k3.d.x(this, decorView, this, keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        u2.c.e(keyEvent, "event");
        View decorView = getWindow().getDecorView();
        u2.c.d(decorView, "window.decorView");
        if (k3.d.w(decorView, keyEvent)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // androidx.lifecycle.p0
    public final o0 e() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        if (this.f128j == null) {
            j jVar = (j) getLastNonConfigurationInstance();
            if (jVar != null) {
                this.f128j = jVar.f113a;
            }
            if (this.f128j == null) {
                this.f128j = new o0();
            }
        }
        o0 o0Var = this.f128j;
        u2.c.b(o0Var);
        return o0Var;
    }

    @Override // androidx.lifecycle.r
    public final androidx.lifecycle.t f() {
        return this.f126f;
    }

    public final void g(j0.a aVar) {
        u2.c.e(aVar, "listener");
        this.f132n.add(aVar);
    }

    public final void h(a.b bVar) {
        a.a aVar = this.g;
        aVar.getClass();
        o oVar = aVar.f1b;
        if (oVar != null) {
            bVar.a(oVar);
        }
        aVar.f0a.add(bVar);
    }

    public final h0 i() {
        return (h0) this.f140v.a();
    }

    public final void j() {
        View decorView = getWindow().getDecorView();
        u2.c.d(decorView, "window.decorView");
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        View decorView2 = getWindow().getDecorView();
        u2.c.d(decorView2, "window.decorView");
        decorView2.setTag(R.id.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        u2.c.d(decorView3, "window.decorView");
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
        View decorView4 = getWindow().getDecorView();
        u2.c.d(decorView4, "window.decorView");
        decorView4.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        View decorView5 = getWindow().getDecorView();
        u2.c.d(decorView5, "window.decorView");
        decorView5.setTag(R.id.report_drawn, this);
    }

    public final void k(Bundle bundle) {
        super.onCreate(bundle);
        int i4 = androidx.lifecycle.e0.g;
        androidx.lifecycle.c0.b(this);
    }

    public final void l(Bundle bundle) {
        u2.c.e(bundle, "outState");
        this.f126f.g();
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    public void onActivityResult(int i4, int i5, Intent intent) {
        if (this.f131m.a(i4, i5, intent)) {
            return;
        }
        super.onActivityResult(i4, i5, intent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        i().c();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        u2.c.e(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        Iterator it = this.f132n.iterator();
        while (it.hasNext()) {
            ((j0.a) it.next()).accept(configuration);
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f127i.b(bundle);
        a.a aVar = this.g;
        aVar.getClass();
        aVar.f1b = this;
        Iterator it = aVar.f0a.iterator();
        while (it.hasNext()) {
            ((a.b) it.next()).a(this);
        }
        k(bundle);
        int i4 = androidx.lifecycle.e0.g;
        androidx.lifecycle.c0.b(this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i4, Menu menu) {
        u2.c.e(menu, "menu");
        if (i4 != 0) {
            return true;
        }
        super.onCreatePanelMenu(i4, menu);
        getMenuInflater();
        Iterator it = ((CopyOnWriteArrayList) this.h.c).iterator();
        while (it.hasNext()) {
            ((androidx.fragment.app.d0) it.next()).f414a.j();
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i4, MenuItem menuItem) {
        u2.c.e(menuItem, "item");
        if (super.onMenuItemSelected(i4, menuItem)) {
            return true;
        }
        if (i4 == 0) {
            Iterator it = ((CopyOnWriteArrayList) this.h.c).iterator();
            while (it.hasNext()) {
                if (((androidx.fragment.app.d0) it.next()).f414a.o()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z3) {
        if (this.f138t) {
            return;
        }
        Iterator it = this.f135q.iterator();
        while (it.hasNext()) {
            ((j0.a) it.next()).accept(new z.e(z3));
        }
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        u2.c.e(intent, "intent");
        super.onNewIntent(intent);
        Iterator it = this.f134p.iterator();
        while (it.hasNext()) {
            ((j0.a) it.next()).accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i4, Menu menu) {
        u2.c.e(menu, "menu");
        Iterator it = ((CopyOnWriteArrayList) this.h.c).iterator();
        while (it.hasNext()) {
            ((androidx.fragment.app.d0) it.next()).f414a.p();
        }
        super.onPanelClosed(i4, menu);
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z3) {
        if (this.f139u) {
            return;
        }
        Iterator it = this.f136r.iterator();
        while (it.hasNext()) {
            ((j0.a) it.next()).accept(new z.f(z3));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i4, View view, Menu menu) {
        u2.c.e(menu, "menu");
        if (i4 != 0) {
            return true;
        }
        super.onPreparePanel(i4, view, menu);
        Iterator it = ((CopyOnWriteArrayList) this.h.c).iterator();
        while (it.hasNext()) {
            ((androidx.fragment.app.d0) it.next()).f414a.s();
        }
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i4, String[] strArr, int[] iArr) {
        u2.c.e(strArr, "permissions");
        u2.c.e(iArr, "grantResults");
        if (this.f131m.a(i4, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i4, strArr, iArr);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        j jVar;
        o0 o0Var = this.f128j;
        if (o0Var == null && (jVar = (j) getLastNonConfigurationInstance()) != null) {
            o0Var = jVar.f113a;
        }
        if (o0Var == null) {
            return null;
        }
        j jVar2 = new j();
        jVar2.f113a = o0Var;
        return jVar2;
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        u2.c.e(bundle, "outState");
        androidx.lifecycle.t tVar = this.f126f;
        if (tVar != null) {
            tVar.g();
        }
        l(bundle);
        this.f127i.c(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i4) {
        super.onTrimMemory(i4);
        Iterator it = this.f133o.iterator();
        while (it.hasNext()) {
            ((j0.a) it.next()).accept(Integer.valueOf(i4));
        }
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator it = this.f137s.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if (k3.m.D()) {
                k3.m.i("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            y yVar = (y) this.f130l.a();
            synchronized (yVar.f144a) {
                try {
                    yVar.f145b = true;
                    ArrayList arrayList = yVar.c;
                    int size = arrayList.size();
                    int i4 = 0;
                    while (i4 < size) {
                        Object obj = arrayList.get(i4);
                        i4++;
                        ((t2.a) obj).a();
                    }
                    yVar.c.clear();
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
        j();
        View decorView = getWindow().getDecorView();
        u2.c.d(decorView, "window.decorView");
        k kVar = this.f129k;
        kVar.getClass();
        if (!kVar.h) {
            kVar.h = true;
            decorView.getViewTreeObserver().addOnDrawListener(kVar);
        }
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i4) {
        u2.c.e(intent, "intent");
        super.startActivityForResult(intent, i4);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i4, Intent intent, int i5, int i6, int i7) {
        u2.c.e(intentSender, "intent");
        super.startIntentSenderForResult(intentSender, i4, intent, i5, i6, i7);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i4, Bundle bundle) {
        u2.c.e(intent, "intent");
        super.startActivityForResult(intent, i4, bundle);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i4, Intent intent, int i5, int i6, int i7, Bundle bundle) {
        u2.c.e(intentSender, "intent");
        super.startIntentSenderForResult(intentSender, i4, intent, i5, i6, i7, bundle);
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z3, Configuration configuration) {
        u2.c.e(configuration, "newConfig");
        this.f138t = true;
        try {
            super.onMultiWindowModeChanged(z3, configuration);
            this.f138t = false;
            Iterator it = this.f135q.iterator();
            while (it.hasNext()) {
                ((j0.a) it.next()).accept(new z.e(z3));
            }
        } catch (Throwable th) {
            this.f138t = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z3, Configuration configuration) {
        u2.c.e(configuration, "newConfig");
        this.f139u = true;
        try {
            super.onPictureInPictureModeChanged(z3, configuration);
            this.f139u = false;
            Iterator it = this.f136r.iterator();
            while (it.hasNext()) {
                ((j0.a) it.next()).accept(new z.f(z3));
            }
        } catch (Throwable th) {
            this.f139u = false;
            throw th;
        }
    }
}
