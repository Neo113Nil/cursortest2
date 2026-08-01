package a;

import a.m;
import android.app.PictureInPictureUiState;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
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
import com.gdmhkmf.belbet.R;
import g.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public abstract class m extends c0.e implements p0, androidx.lifecycle.h, h1.e {

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f47y = 0;

    /* renamed from: g, reason: collision with root package name */
    public final b.a f48g = new b.a();
    public final androidx.emoji2.text.t h;
    public final h1.d i;

    /* renamed from: j, reason: collision with root package name */
    public o0 f49j;

    /* renamed from: k, reason: collision with root package name */
    public final k f50k;

    /* renamed from: l, reason: collision with root package name */
    public final w2.c f51l;

    /* renamed from: m, reason: collision with root package name */
    public final l f52m;

    /* renamed from: n, reason: collision with root package name */
    public final CopyOnWriteArrayList f53n;

    /* renamed from: o, reason: collision with root package name */
    public final CopyOnWriteArrayList f54o;

    /* renamed from: p, reason: collision with root package name */
    public final CopyOnWriteArrayList f55p;

    /* renamed from: q, reason: collision with root package name */
    public final CopyOnWriteArrayList f56q;

    /* renamed from: r, reason: collision with root package name */
    public final CopyOnWriteArrayList f57r;

    /* renamed from: s, reason: collision with root package name */
    public final CopyOnWriteArrayList f58s;

    /* renamed from: t, reason: collision with root package name */
    public final CopyOnWriteArrayList f59t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f60u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f61v;

    /* renamed from: w, reason: collision with root package name */
    public final w2.c f62w;

    /* renamed from: x, reason: collision with root package name */
    public final w2.c f63x;

    public m() {
        final g.i iVar = (g.i) this;
        this.h = new androidx.emoji2.text.t(new e(iVar, 0));
        h1.d dVar = new h1.d(this);
        this.i = dVar;
        this.f50k = new k(iVar);
        this.f51l = new w2.c(new c(iVar, 1));
        new AtomicInteger();
        this.f52m = new l();
        this.f53n = new CopyOnWriteArrayList();
        this.f54o = new CopyOnWriteArrayList();
        this.f55p = new CopyOnWriteArrayList();
        this.f56q = new CopyOnWriteArrayList();
        this.f57r = new CopyOnWriteArrayList();
        this.f58s = new CopyOnWriteArrayList();
        this.f59t = new CopyOnWriteArrayList();
        this.f62w = new w2.c(new c(iVar, 2));
        androidx.lifecycle.t tVar = this.f871f;
        if (tVar == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        tVar.a(new f(0, iVar));
        this.f871f.a(new f(1, iVar));
        this.f871f.a(new androidx.lifecycle.p() { // from class: androidx.activity.ComponentActivity$4
            @Override // androidx.lifecycle.p
            public final void a(r rVar, l lVar) {
                int i = m.f47y;
                i iVar2 = i.this;
                if (iVar2.f49j == null) {
                    a.i iVar3 = (a.i) iVar2.getLastNonConfigurationInstance();
                    if (iVar3 != null) {
                        iVar2.f49j = iVar3.f29a;
                    }
                    if (iVar2.f49j == null) {
                        iVar2.f49j = new o0();
                    }
                }
                iVar2.f871f.f(this);
            }
        });
        dVar.a();
        androidx.lifecycle.g0.a(this);
        dVar.f1972b.e("android:support:activity-result", new g(0, iVar));
        h(new h(iVar, 0));
        this.f63x = new w2.c(new c(iVar, 3));
    }

    public static void d(g.i iVar) {
        try {
            super.onBackPressed();
        } catch (IllegalStateException e4) {
            if (!i3.d.a(e4.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                throw e4;
            }
        } catch (NullPointerException e5) {
            if (!i3.d.a(e5.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                throw e5;
            }
        }
    }

    @Override // h1.e
    public final h1.c a() {
        return this.i.f1972b;
    }

    @Override // androidx.lifecycle.h
    public final b1.c c() {
        b1.c cVar = new b1.c(0);
        LinkedHashMap linkedHashMap = (LinkedHashMap) cVar.f825a;
        if (getApplication() != null) {
            linkedHashMap.put(m0.f726a, getApplication());
        }
        linkedHashMap.put(androidx.lifecycle.g0.f710a, this);
        linkedHashMap.put(androidx.lifecycle.g0.f711b, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            linkedHashMap.put(androidx.lifecycle.g0.f712c, extras);
        }
        return cVar;
    }

    @Override // androidx.lifecycle.p0
    public final o0 e() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        if (this.f49j == null) {
            i iVar = (i) getLastNonConfigurationInstance();
            if (iVar != null) {
                this.f49j = iVar.f29a;
            }
            if (this.f49j == null) {
                this.f49j = new o0();
            }
        }
        o0 o0Var = this.f49j;
        i3.d.b(o0Var);
        return o0Var;
    }

    @Override // androidx.lifecycle.r
    public final androidx.lifecycle.t f() {
        return this.f871f;
    }

    public final void g(m0.a aVar) {
        i3.d.e(aVar, "listener");
        this.f53n.add(aVar);
    }

    public final void h(b.b bVar) {
        b.a aVar = this.f48g;
        aVar.getClass();
        m mVar = aVar.f818b;
        if (mVar != null) {
            bVar.a(mVar);
        }
        aVar.f817a.add(bVar);
    }

    public final j0 i() {
        return (j0) this.f63x.a();
    }

    public final void j() {
        View decorView = getWindow().getDecorView();
        i3.d.d(decorView, "getDecorView(...)");
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        View decorView2 = getWindow().getDecorView();
        i3.d.d(decorView2, "getDecorView(...)");
        decorView2.setTag(R.id.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        i3.d.d(decorView3, "getDecorView(...)");
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
        View decorView4 = getWindow().getDecorView();
        i3.d.d(decorView4, "getDecorView(...)");
        decorView4.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        View decorView5 = getWindow().getDecorView();
        i3.d.d(decorView5, "getDecorView(...)");
        decorView5.setTag(R.id.report_drawn, this);
        View decorView6 = getWindow().getDecorView();
        i3.d.d(decorView6, "getDecorView(...)");
        decorView6.setTag(R.id.view_tree_navigation_event_dispatcher_owner, this);
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i4, Intent intent) {
        if (this.f52m.a(i, i4, intent)) {
            return;
        }
        super.onActivityResult(i, i4, intent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        ((d1.a) this.f62w.a()).a();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        i3.d.e(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        Iterator it = this.f53n.iterator();
        i3.d.d(it, "iterator(...)");
        while (it.hasNext()) {
            ((m0.a) it.next()).accept(configuration);
        }
    }

    @Override // c0.e, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.i.b(bundle);
        b.a aVar = this.f48g;
        aVar.getClass();
        aVar.f818b = this;
        Iterator it = aVar.f817a.iterator();
        while (it.hasNext()) {
            ((b.b) it.next()).a(this);
        }
        super.onCreate(bundle);
        int i = androidx.lifecycle.e0.f708g;
        androidx.lifecycle.c0.b(this);
        getPackageManager().hasSystemFeature("android.software.picture_in_picture");
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        i3.d.e(menu, "menu");
        if (i != 0) {
            return true;
        }
        super.onCreatePanelMenu(i, menu);
        getMenuInflater();
        Iterator it = ((CopyOnWriteArrayList) this.h.f473b).iterator();
        while (it.hasNext()) {
            ((androidx.fragment.app.d0) it.next()).f530a.k();
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        i3.d.e(menuItem, "item");
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            Iterator it = ((CopyOnWriteArrayList) this.h.f473b).iterator();
            while (it.hasNext()) {
                if (((androidx.fragment.app.d0) it.next()).f530a.p()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z4) {
        if (this.f60u) {
            return;
        }
        Iterator it = this.f56q.iterator();
        i3.d.d(it, "iterator(...)");
        while (it.hasNext()) {
            ((m0.a) it.next()).accept(new c0.f(z4));
        }
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        i3.d.e(intent, "intent");
        super.onNewIntent(intent);
        Iterator it = this.f55p.iterator();
        i3.d.d(it, "iterator(...)");
        while (it.hasNext()) {
            ((m0.a) it.next()).accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        i3.d.e(menu, "menu");
        Iterator it = ((CopyOnWriteArrayList) this.h.f473b).iterator();
        while (it.hasNext()) {
            ((androidx.fragment.app.d0) it.next()).f530a.q();
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z4) {
        if (this.f61v) {
            return;
        }
        Iterator it = this.f57r.iterator();
        i3.d.d(it, "iterator(...)");
        while (it.hasNext()) {
            ((m0.a) it.next()).accept(new c0.g(z4));
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureUiStateChanged(PictureInPictureUiState pictureInPictureUiState) {
        o2.f fVar;
        i3.d.e(pictureInPictureUiState, "pipState");
        super.onPictureInPictureUiStateChanged(pictureInPictureUiState);
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            pictureInPictureUiState.isStashed();
            pictureInPictureUiState.isTransitioningToPip();
            fVar = new o2.f(9);
        } else if (i >= 31) {
            pictureInPictureUiState.isStashed();
            fVar = new o2.f(9);
        } else {
            fVar = new o2.f(9);
        }
        Iterator it = this.f58s.iterator();
        i3.d.d(it, "iterator(...)");
        while (it.hasNext()) {
            ((m0.a) it.next()).accept(fVar);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        i3.d.e(menu, "menu");
        if (i != 0) {
            return true;
        }
        super.onPreparePanel(i, view, menu);
        Iterator it = ((CopyOnWriteArrayList) this.h.f473b).iterator();
        while (it.hasNext()) {
            ((androidx.fragment.app.d0) it.next()).f530a.t();
        }
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        i3.d.e(strArr, "permissions");
        i3.d.e(iArr, "grantResults");
        if (this.f52m.a(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        i iVar;
        o0 o0Var = this.f49j;
        if (o0Var == null && (iVar = (i) getLastNonConfigurationInstance()) != null) {
            o0Var = iVar.f29a;
        }
        if (o0Var == null) {
            return null;
        }
        i iVar2 = new i();
        iVar2.f29a = o0Var;
        return iVar2;
    }

    @Override // c0.e, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        i3.d.e(bundle, "outState");
        androidx.lifecycle.t tVar = this.f871f;
        if (tVar != null) {
            tVar.g();
        }
        super.onSaveInstanceState(bundle);
        this.i.c(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator it = this.f54o.iterator();
        i3.d.d(it, "iterator(...)");
        while (it.hasNext()) {
            ((m0.a) it.next()).accept(Integer.valueOf(i));
        }
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator it = this.f59t.iterator();
        i3.d.d(it, "iterator(...)");
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if (b4.d.E()) {
                b4.d.j("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            z zVar = (z) this.f51l.a();
            synchronized (zVar.f75a) {
                try {
                    zVar.f76b = true;
                    ArrayList arrayList = zVar.f77c;
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        ((h3.a) obj).a();
                    }
                    zVar.f77c.clear();
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
        i3.d.d(decorView, "getDecorView(...)");
        k kVar = this.f50k;
        kVar.getClass();
        if (!kVar.h) {
            kVar.h = true;
            decorView.getViewTreeObserver().addOnDrawListener(kVar);
        }
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i) {
        i3.d.e(intent, "intent");
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i4, int i5, int i6) {
        i3.d.e(intentSender, "intent");
        super.startIntentSenderForResult(intentSender, i, intent, i4, i5, i6);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i, Bundle bundle) {
        i3.d.e(intent, "intent");
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i4, int i5, int i6, Bundle bundle) {
        i3.d.e(intentSender, "intent");
        super.startIntentSenderForResult(intentSender, i, intent, i4, i5, i6, bundle);
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z4, Configuration configuration) {
        i3.d.e(configuration, "newConfig");
        this.f60u = true;
        try {
            super.onMultiWindowModeChanged(z4, configuration);
            this.f60u = false;
            Iterator it = this.f56q.iterator();
            i3.d.d(it, "iterator(...)");
            while (it.hasNext()) {
                ((m0.a) it.next()).accept(new c0.f(z4));
            }
        } catch (Throwable th) {
            this.f60u = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z4, Configuration configuration) {
        i3.d.e(configuration, "newConfig");
        this.f61v = true;
        try {
            super.onPictureInPictureModeChanged(z4, configuration);
            this.f61v = false;
            Iterator it = this.f57r.iterator();
            i3.d.d(it, "iterator(...)");
            while (it.hasNext()) {
                ((m0.a) it.next()).accept(new c0.g(z4));
            }
        } catch (Throwable th) {
            this.f61v = false;
            throw th;
        }
    }
}
