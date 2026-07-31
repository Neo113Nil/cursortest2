package b;

import android.app.Application;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.e0;
import androidx.lifecycle.h0;
import androidx.lifecycle.l0;
import androidx.lifecycle.m0;
import androidx.lifecycle.s0;
import androidx.lifecycle.t0;
import androidx.lifecycle.w;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import c5.x;
import com.snovikpovik.vuevnxsj.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class l extends f3.a implements x0, androidx.lifecycle.k, x4.f, v, s4.c {

    /* renamed from: e, reason: collision with root package name */
    public final e.a f986e;

    /* renamed from: f, reason: collision with root package name */
    public final q3.k f987f;

    /* renamed from: g, reason: collision with root package name */
    public final x4.e f988g;

    /* renamed from: h, reason: collision with root package name */
    public w0 f989h;
    public final j i;

    /* renamed from: j, reason: collision with root package name */
    public final c6.k f990j;

    /* renamed from: k, reason: collision with root package name */
    public final k f991k;

    /* renamed from: l, reason: collision with root package name */
    public final CopyOnWriteArrayList f992l;

    /* renamed from: m, reason: collision with root package name */
    public final CopyOnWriteArrayList f993m;

    /* renamed from: n, reason: collision with root package name */
    public final CopyOnWriteArrayList f994n;

    /* renamed from: o, reason: collision with root package name */
    public final CopyOnWriteArrayList f995o;

    /* renamed from: p, reason: collision with root package name */
    public final CopyOnWriteArrayList f996p;

    /* renamed from: q, reason: collision with root package name */
    public final CopyOnWriteArrayList f997q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f998r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f999s;

    /* renamed from: t, reason: collision with root package name */
    public final c6.k f1000t;

    /* renamed from: u, reason: collision with root package name */
    public final c6.k f1001u;

    /* renamed from: v, reason: collision with root package name */
    public final c6.k f1002v;

    public l() {
        e.a aVar = new e.a();
        this.f986e = aVar;
        this.f987f = new q3.k(new c(this, 1));
        x4.e eVar = new x4.e(new z4.a(this, new m0(18, this)), 1);
        this.f988g = eVar;
        this.i = new j(this);
        this.f990j = a.a.r(new d(this, 1));
        new AtomicInteger();
        this.f991k = new k();
        this.f992l = new CopyOnWriteArrayList();
        this.f993m = new CopyOnWriteArrayList();
        this.f994n = new CopyOnWriteArrayList();
        this.f995o = new CopyOnWriteArrayList();
        this.f996p = new CopyOnWriteArrayList();
        this.f997q = new CopyOnWriteArrayList();
        this.f1000t = a.a.r(new d(this, 2));
        w wVar = this.f2714d;
        if (wVar == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        final int i = 0;
        wVar.a(new androidx.lifecycle.s(this) { // from class: b.f

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ l f971e;

            {
                this.f971e = this;
            }

            @Override // androidx.lifecycle.s
            public final void b(androidx.lifecycle.u uVar, androidx.lifecycle.o oVar) {
                Window window;
                View peekDecorView;
                switch (i) {
                    case 0:
                        l lVar = this.f971e;
                        if (oVar == androidx.lifecycle.o.ON_STOP && (window = lVar.getWindow()) != null && (peekDecorView = window.peekDecorView()) != null) {
                            peekDecorView.cancelPendingInputEvents();
                            break;
                        }
                        break;
                    default:
                        l lVar2 = this.f971e;
                        if (oVar == androidx.lifecycle.o.ON_DESTROY) {
                            lVar2.f986e.f2434b = null;
                            if (!lVar2.isChangingConfigurations()) {
                                lVar2.f().a();
                            }
                            j jVar = lVar2.i;
                            l lVar3 = jVar.f979g;
                            lVar3.getWindow().getDecorView().removeCallbacks(jVar);
                            lVar3.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(jVar);
                            break;
                        }
                        break;
                }
            }
        });
        final int i8 = 1;
        this.f2714d.a(new androidx.lifecycle.s(this) { // from class: b.f

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ l f971e;

            {
                this.f971e = this;
            }

            @Override // androidx.lifecycle.s
            public final void b(androidx.lifecycle.u uVar, androidx.lifecycle.o oVar) {
                Window window;
                View peekDecorView;
                switch (i8) {
                    case 0:
                        l lVar = this.f971e;
                        if (oVar == androidx.lifecycle.o.ON_STOP && (window = lVar.getWindow()) != null && (peekDecorView = window.peekDecorView()) != null) {
                            peekDecorView.cancelPendingInputEvents();
                            break;
                        }
                        break;
                    default:
                        l lVar2 = this.f971e;
                        if (oVar == androidx.lifecycle.o.ON_DESTROY) {
                            lVar2.f986e.f2434b = null;
                            if (!lVar2.isChangingConfigurations()) {
                                lVar2.f().a();
                            }
                            j jVar = lVar2.i;
                            l lVar3 = jVar.f979g;
                            lVar3.getWindow().getDecorView().removeCallbacks(jVar);
                            lVar3.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(jVar);
                            break;
                        }
                        break;
                }
            }
        });
        this.f2714d.a(new x4.b(this, i8));
        eVar.c();
        l0.c(this);
        ((x4.e) eVar.f8656b).f("android:support:activity-result", new g(0, this));
        h hVar = new h(this);
        l lVar = aVar.f2434b;
        if (lVar != null) {
            hVar.a(lVar);
        }
        aVar.f2433a.add(hVar);
        this.f1001u = a.a.r(new d(this, 3));
        this.f1002v = a.a.r(new d(this, 4));
    }

    public static void h(l lVar) {
        try {
            super.onBackPressed();
        } catch (IllegalStateException e8) {
            if (!q6.i.a(e8.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                throw e8;
            }
        } catch (NullPointerException e9) {
            if (!q6.i.a(e9.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                throw e9;
            }
        }
    }

    @Override // b.v
    public final t a() {
        return (t) this.f1002v.getValue();
    }

    @Override // android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        i();
        View decorView = getWindow().getDecorView();
        q6.i.d(decorView, "getDecorView(...)");
        this.i.a(decorView);
        super.addContentView(view, layoutParams);
    }

    @Override // x4.f
    public final x4.e b() {
        return (x4.e) this.f988g.f8656b;
    }

    @Override // s4.c
    public final x c() {
        return a().f1020b;
    }

    @Override // androidx.lifecycle.k
    public final t0 d() {
        return (t0) this.f1001u.getValue();
    }

    @Override // androidx.lifecycle.k
    public final l4.b e() {
        l4.e eVar = new l4.e(0);
        Application application = getApplication();
        LinkedHashMap linkedHashMap = eVar.f4829a;
        if (application != null) {
            linkedHashMap.put(s0.f862d, getApplication());
        }
        linkedHashMap.put(l0.f836a, this);
        linkedHashMap.put(l0.f837b, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            linkedHashMap.put(l0.f838c, extras);
        }
        return eVar;
    }

    @Override // androidx.lifecycle.x0
    public final w0 f() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        if (this.f989h == null) {
            i iVar = (i) getLastNonConfigurationInstance();
            if (iVar != null) {
                this.f989h = iVar.f975a;
            }
            if (this.f989h == null) {
                this.f989h = new w0();
            }
        }
        w0 w0Var = this.f989h;
        q6.i.b(w0Var);
        return w0Var;
    }

    @Override // androidx.lifecycle.u
    public final w g() {
        return this.f2714d;
    }

    public final void i() {
        View decorView = getWindow().getDecorView();
        q6.i.d(decorView, "getDecorView(...)");
        l0.g(decorView, this);
        View decorView2 = getWindow().getDecorView();
        q6.i.d(decorView2, "getDecorView(...)");
        l0.h(decorView2, this);
        View decorView3 = getWindow().getDecorView();
        q6.i.d(decorView3, "getDecorView(...)");
        r2.r.U(decorView3, this);
        View decorView4 = getWindow().getDecorView();
        q6.i.d(decorView4, "getDecorView(...)");
        decorView4.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        View decorView5 = getWindow().getDecorView();
        q6.i.d(decorView5, "getDecorView(...)");
        decorView5.setTag(R.id.report_drawn, this);
        View decorView6 = getWindow().getDecorView();
        q6.i.d(decorView6, "getDecorView(...)");
        decorView6.setTag(R.id.view_tree_navigation_event_dispatcher_owner, this);
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i, int i8, Intent intent) {
        if (this.f991k.a(i, i8, intent)) {
            return;
        }
        super.onActivityResult(i, i8, intent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        ((s4.a) this.f1000t.getValue()).a();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        q6.i.e(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        Iterator it = this.f992l.iterator();
        q6.i.d(it, "iterator(...)");
        while (it.hasNext()) {
            ((p3.a) it.next()).accept(configuration);
        }
    }

    @Override // f3.a, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f988g.d(bundle);
        e.a aVar = this.f986e;
        aVar.getClass();
        aVar.f2434b = this;
        Iterator it = aVar.f2433a.iterator();
        while (it.hasNext()) {
            ((h) it.next()).a(this);
        }
        super.onCreate(bundle);
        int i = h0.f829e;
        e0.b(this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        q6.i.e(menu, "menu");
        if (i != 0) {
            return true;
        }
        super.onCreatePanelMenu(i, menu);
        getMenuInflater();
        Iterator it = ((CopyOnWriteArrayList) this.f987f.f6119e).iterator();
        if (!it.hasNext()) {
            return true;
        }
        ((h4.h) it.next()).getClass();
        throw null;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        q6.i.e(menuItem, "item");
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i != 0) {
            return false;
        }
        Iterator it = ((CopyOnWriteArrayList) this.f987f.f6119e).iterator();
        if (!it.hasNext()) {
            return false;
        }
        ((h4.h) it.next()).getClass();
        throw null;
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z3) {
        if (this.f998r) {
            return;
        }
        Iterator it = this.f995o.iterator();
        q6.i.d(it, "iterator(...)");
        while (it.hasNext()) {
            ((p3.a) it.next()).accept(new f3.b(z3));
        }
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        q6.i.e(intent, "intent");
        super.onNewIntent(intent);
        Iterator it = this.f994n.iterator();
        q6.i.d(it, "iterator(...)");
        while (it.hasNext()) {
            ((p3.a) it.next()).accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        q6.i.e(menu, "menu");
        Iterator it = ((CopyOnWriteArrayList) this.f987f.f6119e).iterator();
        if (it.hasNext()) {
            ((h4.h) it.next()).getClass();
            throw null;
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z3) {
        if (this.f999s) {
            return;
        }
        Iterator it = this.f996p.iterator();
        q6.i.d(it, "iterator(...)");
        while (it.hasNext()) {
            ((p3.a) it.next()).accept(new f3.c(z3));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        q6.i.e(menu, "menu");
        if (i != 0) {
            return true;
        }
        super.onPreparePanel(i, view, menu);
        Iterator it = ((CopyOnWriteArrayList) this.f987f.f6119e).iterator();
        if (!it.hasNext()) {
            return true;
        }
        ((h4.h) it.next()).getClass();
        throw null;
    }

    @Override // android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        q6.i.e(strArr, "permissions");
        q6.i.e(iArr, "grantResults");
        if (this.f991k.a(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        i iVar;
        w0 w0Var = this.f989h;
        if (w0Var == null && (iVar = (i) getLastNonConfigurationInstance()) != null) {
            w0Var = iVar.f975a;
        }
        if (w0Var == null) {
            return null;
        }
        i iVar2 = new i();
        iVar2.f975a = w0Var;
        return iVar2;
    }

    @Override // f3.a, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        q6.i.e(bundle, "outState");
        w wVar = this.f2714d;
        if (wVar != null) {
            wVar.g(androidx.lifecycle.p.f849f);
        }
        super.onSaveInstanceState(bundle);
        this.f988g.e(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator it = this.f993m.iterator();
        q6.i.d(it, "iterator(...)");
        while (it.hasNext()) {
            ((p3.a) it.next()).accept(Integer.valueOf(i));
        }
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator it = this.f997q.iterator();
        q6.i.d(it, "iterator(...)");
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if (a.a.o()) {
                a.a.e("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            n nVar = (n) this.f990j.getValue();
            synchronized (nVar.f1005a) {
                try {
                    nVar.f1006b = true;
                    ArrayList arrayList = nVar.f1007c;
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        ((p6.a) obj).b();
                    }
                    nVar.f1007c.clear();
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
    public final void setContentView(int i) {
        i();
        View decorView = getWindow().getDecorView();
        q6.i.d(decorView, "getDecorView(...)");
        this.i.a(decorView);
        super.setContentView(i);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i) {
        q6.i.e(intent, "intent");
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i8, int i9, int i10) {
        q6.i.e(intentSender, "intent");
        super.startIntentSenderForResult(intentSender, i, intent, i8, i9, i10);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i, Bundle bundle) {
        q6.i.e(intent, "intent");
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i8, int i9, int i10, Bundle bundle) {
        q6.i.e(intentSender, "intent");
        super.startIntentSenderForResult(intentSender, i, intent, i8, i9, i10, bundle);
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z3, Configuration configuration) {
        q6.i.e(configuration, "newConfig");
        this.f998r = true;
        try {
            super.onMultiWindowModeChanged(z3, configuration);
            this.f998r = false;
            Iterator it = this.f995o.iterator();
            q6.i.d(it, "iterator(...)");
            while (it.hasNext()) {
                ((p3.a) it.next()).accept(new f3.b(z3));
            }
        } catch (Throwable th) {
            this.f998r = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z3, Configuration configuration) {
        q6.i.e(configuration, "newConfig");
        this.f999s = true;
        try {
            super.onPictureInPictureModeChanged(z3, configuration);
            this.f999s = false;
            Iterator it = this.f996p.iterator();
            q6.i.d(it, "iterator(...)");
            while (it.hasNext()) {
                ((p3.a) it.next()).accept(new f3.c(z3));
            }
        } catch (Throwable th) {
            this.f999s = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        i();
        View decorView = getWindow().getDecorView();
        q6.i.d(decorView, "getDecorView(...)");
        this.i.a(decorView);
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        i();
        View decorView = getWindow().getDecorView();
        q6.i.d(decorView, "getDecorView(...)");
        this.i.a(decorView);
        super.setContentView(view, layoutParams);
    }
}
