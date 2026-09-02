package a;

import a.i;
import a.m;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.lifecycle.l;
import androidx.lifecycle.m0;
import androidx.lifecycle.o0;
import androidx.lifecycle.p0;
import androidx.lifecycle.r;
import com.oriondriftchasers.arordrft.R;
import g.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public abstract class m extends c0.e implements p0, androidx.lifecycle.h, g1.e {

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f44x = 0;

    /* renamed from: g, reason: collision with root package name */
    public final b.a f45g = new b.a();

    /* renamed from: h, reason: collision with root package name */
    public final androidx.emoji2.text.t f46h;
    public final g1.d i;

    /* renamed from: j, reason: collision with root package name */
    public o0 f47j;

    /* renamed from: k, reason: collision with root package name */
    public final k f48k;

    /* renamed from: l, reason: collision with root package name */
    public final z2.b f49l;

    /* renamed from: m, reason: collision with root package name */
    public final l f50m;

    /* renamed from: n, reason: collision with root package name */
    public final CopyOnWriteArrayList f51n;

    /* renamed from: o, reason: collision with root package name */
    public final CopyOnWriteArrayList f52o;

    /* renamed from: p, reason: collision with root package name */
    public final CopyOnWriteArrayList f53p;

    /* renamed from: q, reason: collision with root package name */
    public final CopyOnWriteArrayList f54q;

    /* renamed from: r, reason: collision with root package name */
    public final CopyOnWriteArrayList f55r;

    /* renamed from: s, reason: collision with root package name */
    public final CopyOnWriteArrayList f56s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f57t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f58u;

    /* renamed from: v, reason: collision with root package name */
    public final z2.b f59v;

    /* renamed from: w, reason: collision with root package name */
    public final z2.b f60w;

    public m() {
        final g.j jVar = (g.j) this;
        this.f46h = new androidx.emoji2.text.t(new e(jVar, 0));
        g1.d dVar = new g1.d(this);
        this.i = dVar;
        this.f48k = new k(jVar);
        this.f49l = new z2.b(new c(jVar, 1));
        new AtomicInteger();
        this.f50m = new l();
        this.f51n = new CopyOnWriteArrayList();
        this.f52o = new CopyOnWriteArrayList();
        this.f53p = new CopyOnWriteArrayList();
        this.f54q = new CopyOnWriteArrayList();
        this.f55r = new CopyOnWriteArrayList();
        this.f56s = new CopyOnWriteArrayList();
        this.f59v = new z2.b(new c(jVar, 2));
        androidx.lifecycle.t tVar = this.f754f;
        if (tVar == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        tVar.a(new f(0, jVar));
        this.f754f.a(new f(1, jVar));
        this.f754f.a(new androidx.lifecycle.p() { // from class: androidx.activity.ComponentActivity$4
            @Override // androidx.lifecycle.p
            public final void b(r rVar, l lVar) {
                int i = m.f44x;
                j jVar2 = j.this;
                if (jVar2.f47j == null) {
                    i iVar = (i) jVar2.getLastNonConfigurationInstance();
                    if (iVar != null) {
                        jVar2.f47j = iVar.f30a;
                    }
                    if (jVar2.f47j == null) {
                        jVar2.f47j = new o0();
                    }
                }
                jVar2.f754f.f(this);
            }
        });
        dVar.a();
        androidx.lifecycle.g0.a(this);
        dVar.f1703b.e("android:support:activity-result", new g(0, jVar));
        h(new h(jVar, 0));
        this.f60w = new z2.b(new c(jVar, 3));
    }

    public static void f(g.j jVar) {
        try {
            super.onBackPressed();
        } catch (IllegalStateException e4) {
            if (!f3.d.a(e4.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                throw e4;
            }
        } catch (NullPointerException e5) {
            if (!f3.d.a(e5.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                throw e5;
            }
        }
    }

    @Override // androidx.lifecycle.h
    public final a1.c a() {
        a1.c cVar = new a1.c(0);
        LinkedHashMap linkedHashMap = (LinkedHashMap) cVar.f106a;
        if (getApplication() != null) {
            linkedHashMap.put(m0.f622a, getApplication());
        }
        linkedHashMap.put(androidx.lifecycle.g0.f606a, this);
        linkedHashMap.put(androidx.lifecycle.g0.f607b, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            linkedHashMap.put(androidx.lifecycle.g0.f608c, extras);
        }
        return cVar;
    }

    @Override // g1.e
    public final g1.c b() {
        return this.i.f1703b;
    }

    @Override // androidx.lifecycle.p0
    public final o0 d() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        if (this.f47j == null) {
            i iVar = (i) getLastNonConfigurationInstance();
            if (iVar != null) {
                this.f47j = iVar.f30a;
            }
            if (this.f47j == null) {
                this.f47j = new o0();
            }
        }
        o0 o0Var = this.f47j;
        f3.d.b(o0Var);
        return o0Var;
    }

    @Override // androidx.lifecycle.r
    public final androidx.lifecycle.t e() {
        return this.f754f;
    }

    public final void g(m0.a aVar) {
        f3.d.e(aVar, "listener");
        this.f51n.add(aVar);
    }

    public final void h(b.b bVar) {
        b.a aVar = this.f45g;
        aVar.getClass();
        m mVar = aVar.f717b;
        if (mVar != null) {
            bVar.a(mVar);
        }
        aVar.f716a.add(bVar);
    }

    public final g0 i() {
        return (g0) this.f60w.a();
    }

    public final void j() {
        View decorView = getWindow().getDecorView();
        f3.d.d(decorView, "getDecorView(...)");
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        View decorView2 = getWindow().getDecorView();
        f3.d.d(decorView2, "getDecorView(...)");
        decorView2.setTag(R.id.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        f3.d.d(decorView3, "getDecorView(...)");
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
        View decorView4 = getWindow().getDecorView();
        f3.d.d(decorView4, "getDecorView(...)");
        decorView4.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        View decorView5 = getWindow().getDecorView();
        f3.d.d(decorView5, "getDecorView(...)");
        decorView5.setTag(R.id.report_drawn, this);
        View decorView6 = getWindow().getDecorView();
        f3.d.d(decorView6, "getDecorView(...)");
        decorView6.setTag(R.id.view_tree_navigation_event_dispatcher_owner, this);
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i4, Intent intent) {
        if (this.f50m.a(i, i4, intent)) {
            return;
        }
        super.onActivityResult(i, i4, intent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        ((c1.a) this.f59v.a()).a();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        f3.d.e(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        Iterator it = this.f51n.iterator();
        f3.d.d(it, "iterator(...)");
        while (it.hasNext()) {
            ((m0.a) it.next()).accept(configuration);
        }
    }

    @Override // c0.e, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.i.b(bundle);
        b.a aVar = this.f45g;
        aVar.getClass();
        aVar.f717b = this;
        Iterator it = aVar.f716a.iterator();
        while (it.hasNext()) {
            ((b.b) it.next()).a(this);
        }
        super.onCreate(bundle);
        int i = androidx.lifecycle.e0.f604g;
        androidx.lifecycle.c0.b(this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        f3.d.e(menu, "menu");
        if (i != 0) {
            return true;
        }
        super.onCreatePanelMenu(i, menu);
        getMenuInflater();
        Iterator it = ((CopyOnWriteArrayList) this.f46h.f356c).iterator();
        while (it.hasNext()) {
            ((androidx.fragment.app.d0) it.next()).f416a.j();
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        f3.d.e(menuItem, "item");
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            Iterator it = ((CopyOnWriteArrayList) this.f46h.f356c).iterator();
            while (it.hasNext()) {
                if (((androidx.fragment.app.d0) it.next()).f416a.o()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z3) {
        if (this.f57t) {
            return;
        }
        Iterator it = this.f54q.iterator();
        f3.d.d(it, "iterator(...)");
        while (it.hasNext()) {
            ((m0.a) it.next()).accept(new c0.f(z3));
        }
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        f3.d.e(intent, "intent");
        super.onNewIntent(intent);
        Iterator it = this.f53p.iterator();
        f3.d.d(it, "iterator(...)");
        while (it.hasNext()) {
            ((m0.a) it.next()).accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        f3.d.e(menu, "menu");
        Iterator it = ((CopyOnWriteArrayList) this.f46h.f356c).iterator();
        while (it.hasNext()) {
            ((androidx.fragment.app.d0) it.next()).f416a.p();
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z3) {
        if (this.f58u) {
            return;
        }
        Iterator it = this.f55r.iterator();
        f3.d.d(it, "iterator(...)");
        while (it.hasNext()) {
            ((m0.a) it.next()).accept(new c0.g(z3));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        f3.d.e(menu, "menu");
        if (i != 0) {
            return true;
        }
        super.onPreparePanel(i, view, menu);
        Iterator it = ((CopyOnWriteArrayList) this.f46h.f356c).iterator();
        while (it.hasNext()) {
            ((androidx.fragment.app.d0) it.next()).f416a.s();
        }
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        f3.d.e(strArr, "permissions");
        f3.d.e(iArr, "grantResults");
        if (this.f50m.a(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        i iVar;
        o0 o0Var = this.f47j;
        if (o0Var == null && (iVar = (i) getLastNonConfigurationInstance()) != null) {
            o0Var = iVar.f30a;
        }
        if (o0Var == null) {
            return null;
        }
        i iVar2 = new i();
        iVar2.f30a = o0Var;
        return iVar2;
    }

    @Override // c0.e, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        f3.d.e(bundle, "outState");
        androidx.lifecycle.t tVar = this.f754f;
        if (tVar != null) {
            tVar.g();
        }
        super.onSaveInstanceState(bundle);
        this.i.c(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator it = this.f52o.iterator();
        f3.d.d(it, "iterator(...)");
        while (it.hasNext()) {
            ((m0.a) it.next()).accept(Integer.valueOf(i));
        }
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator it = this.f56s.iterator();
        f3.d.d(it, "iterator(...)");
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if (h.a.N()) {
                h.a.e("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            z zVar = (z) this.f49l.a();
            synchronized (zVar.f76a) {
                try {
                    zVar.f77b = true;
                    ArrayList arrayList = zVar.f78c;
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        ((e3.a) obj).a();
                    }
                    zVar.f78c.clear();
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
        f3.d.d(decorView, "getDecorView(...)");
        k kVar = this.f48k;
        kVar.getClass();
        if (!kVar.f37h) {
            kVar.f37h = true;
            decorView.getViewTreeObserver().addOnDrawListener(kVar);
        }
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i) {
        f3.d.e(intent, "intent");
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i4, int i5, int i6) {
        f3.d.e(intentSender, "intent");
        super.startIntentSenderForResult(intentSender, i, intent, i4, i5, i6);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i, Bundle bundle) {
        f3.d.e(intent, "intent");
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i4, int i5, int i6, Bundle bundle) {
        f3.d.e(intentSender, "intent");
        super.startIntentSenderForResult(intentSender, i, intent, i4, i5, i6, bundle);
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z3, Configuration configuration) {
        f3.d.e(configuration, "newConfig");
        this.f57t = true;
        try {
            super.onMultiWindowModeChanged(z3, configuration);
            this.f57t = false;
            Iterator it = this.f54q.iterator();
            f3.d.d(it, "iterator(...)");
            while (it.hasNext()) {
                ((m0.a) it.next()).accept(new c0.f(z3));
            }
        } catch (Throwable th) {
            this.f57t = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z3, Configuration configuration) {
        f3.d.e(configuration, "newConfig");
        this.f58u = true;
        try {
            super.onPictureInPictureModeChanged(z3, configuration);
            this.f58u = false;
            Iterator it = this.f55r.iterator();
            f3.d.d(it, "iterator(...)");
            while (it.hasNext()) {
                ((m0.a) it.next()).accept(new c0.g(z3));
            }
        } catch (Throwable th) {
            this.f58u = false;
            throw th;
        }
    }
}
