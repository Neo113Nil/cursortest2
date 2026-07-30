package b;

import a0.s0;
import android.app.Application;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Trace;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.b1;
import androidx.lifecycle.c1;
import androidx.lifecycle.n;
import androidx.lifecycle.q0;
import androidx.lifecycle.t;
import androidx.lifecycle.v;
import androidx.lifecycle.x0;
import androidx.lifecycle.y0;
import b.m;
import com.android.installreferrer.R;
import com.android.installreferrer.api.InstallReferrerClient;
import f4.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import l.u1;
import r6.k;
import u3.r;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class o extends s2.b implements c1, androidx.lifecycle.j, x3.f, k0 {
    private static final i Companion = new i();

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f1195y = 0;

    /* renamed from: g, reason: collision with root package name */
    public final d.a f1196g;

    /* renamed from: h, reason: collision with root package name */
    public final b6.c f1197h;

    /* renamed from: i, reason: collision with root package name */
    public final s0 f1198i;

    /* renamed from: j, reason: collision with root package name */
    public b1 f1199j;

    /* renamed from: k, reason: collision with root package name */
    public final k f1200k;

    /* renamed from: l, reason: collision with root package name */
    public final d6.o f1201l;

    /* renamed from: m, reason: collision with root package name */
    public final AtomicInteger f1202m;

    /* renamed from: n, reason: collision with root package name */
    public final m f1203n;

    /* renamed from: o, reason: collision with root package name */
    public final CopyOnWriteArrayList f1204o;

    /* renamed from: p, reason: collision with root package name */
    public final CopyOnWriteArrayList f1205p;

    /* renamed from: q, reason: collision with root package name */
    public final CopyOnWriteArrayList f1206q;

    /* renamed from: r, reason: collision with root package name */
    public final CopyOnWriteArrayList f1207r;

    /* renamed from: s, reason: collision with root package name */
    public final CopyOnWriteArrayList f1208s;

    /* renamed from: t, reason: collision with root package name */
    public final CopyOnWriteArrayList f1209t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f1210u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f1211v;

    /* renamed from: w, reason: collision with root package name */
    public final d6.o f1212w;

    /* renamed from: x, reason: collision with root package name */
    public final d6.o f1213x;

    public o() {
        d.a aVar = new d.a();
        this.f1196g = aVar;
        this.f1197h = new b6.c(new d(this, 0));
        s0 s0Var = new s0(this);
        this.f1198i = s0Var;
        this.f1200k = new k(this);
        this.f1201l = d6.a.d(new n(this, 2));
        this.f1202m = new AtomicInteger();
        this.f1203n = new m(this);
        this.f1204o = new CopyOnWriteArrayList();
        this.f1205p = new CopyOnWriteArrayList();
        this.f1206q = new CopyOnWriteArrayList();
        this.f1207r = new CopyOnWriteArrayList();
        this.f1208s = new CopyOnWriteArrayList();
        this.f1209t = new CopyOnWriteArrayList();
        androidx.lifecycle.x xVar = this.f8494f;
        if (xVar == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        final int i7 = 0;
        xVar.a(new androidx.lifecycle.t(this) { // from class: b.e

            /* renamed from: g, reason: collision with root package name */
            public final /* synthetic */ o f1148g;

            {
                this.f1148g = this;
            }

            @Override // androidx.lifecycle.t
            public final void c(androidx.lifecycle.v vVar, androidx.lifecycle.n nVar) {
                Window window;
                View peekDecorView;
                switch (i7) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        o oVar = this.f1148g;
                        if (nVar == androidx.lifecycle.n.ON_STOP && (window = oVar.getWindow()) != null && (peekDecorView = window.peekDecorView()) != null) {
                            peekDecorView.cancelPendingInputEvents();
                            break;
                        }
                        break;
                    default:
                        o oVar2 = this.f1148g;
                        if (nVar == androidx.lifecycle.n.ON_DESTROY) {
                            oVar2.f1196g.f1809b = null;
                            if (!oVar2.isChangingConfigurations()) {
                                oVar2.e().a();
                            }
                            k kVar = oVar2.f1200k;
                            o oVar3 = kVar.f1174i;
                            oVar3.getWindow().getDecorView().removeCallbacks(kVar);
                            oVar3.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(kVar);
                            break;
                        }
                        break;
                }
            }
        });
        final int i8 = 1;
        this.f8494f.a(new androidx.lifecycle.t(this) { // from class: b.e

            /* renamed from: g, reason: collision with root package name */
            public final /* synthetic */ o f1148g;

            {
                this.f1148g = this;
            }

            @Override // androidx.lifecycle.t
            public final void c(androidx.lifecycle.v vVar, androidx.lifecycle.n nVar) {
                Window window;
                View peekDecorView;
                switch (i8) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        o oVar = this.f1148g;
                        if (nVar == androidx.lifecycle.n.ON_STOP && (window = oVar.getWindow()) != null && (peekDecorView = window.peekDecorView()) != null) {
                            peekDecorView.cancelPendingInputEvents();
                            break;
                        }
                        break;
                    default:
                        o oVar2 = this.f1148g;
                        if (nVar == androidx.lifecycle.n.ON_DESTROY) {
                            oVar2.f1196g.f1809b = null;
                            if (!oVar2.isChangingConfigurations()) {
                                oVar2.e().a();
                            }
                            k kVar = oVar2.f1200k;
                            o oVar3 = kVar.f1174i;
                            oVar3.getWindow().getDecorView().removeCallbacks(kVar);
                            oVar3.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(kVar);
                            break;
                        }
                        break;
                }
            }
        });
        this.f8494f.a(new x3.b(3, this));
        s0Var.f();
        q0.e(this);
        ((x3.e) s0Var.f138d).c("android:support:activity-result", new androidx.lifecycle.m0(1, this));
        f fVar = new f(this);
        o oVar = aVar.f1809b;
        if (oVar != null) {
            fVar.a(oVar);
        }
        aVar.f1808a.add(fVar);
        this.f1212w = d6.a.d(new n(this, 0));
        this.f1213x = d6.a.d(new n(this, 3));
    }

    @Override // b.k0
    public final i0 a() {
        return (i0) this.f1213x.getValue();
    }

    @Override // android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        h();
        View decorView = getWindow().getDecorView();
        r6.k.e(decorView, "window.decorView");
        this.f1200k.a(decorView);
        super.addContentView(view, layoutParams);
    }

    @Override // x3.f
    public final x3.e b() {
        return (x3.e) this.f1198i.f138d;
    }

    @Override // androidx.lifecycle.j
    public final y0 c() {
        return (y0) this.f1212w.getValue();
    }

    @Override // androidx.lifecycle.j
    public final u1 d() {
        q3.b bVar = new q3.b(0);
        LinkedHashMap linkedHashMap = (LinkedHashMap) bVar.f5679a;
        if (getApplication() != null) {
            Application application = getApplication();
            r6.k.e(application, "application");
            linkedHashMap.put(x0.f1054d, application);
        }
        linkedHashMap.put(q0.f1021a, this);
        linkedHashMap.put(q0.f1022b, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            linkedHashMap.put(q0.f1023c, extras);
        }
        return bVar;
    }

    @Override // androidx.lifecycle.c1
    public final b1 e() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        if (this.f1199j == null) {
            j jVar = (j) getLastNonConfigurationInstance();
            if (jVar != null) {
                this.f1199j = jVar.f1168a;
            }
            if (this.f1199j == null) {
                this.f1199j = new b1();
            }
        }
        b1 b1Var = this.f1199j;
        r6.k.c(b1Var);
        return b1Var;
    }

    @Override // androidx.lifecycle.v
    public final androidx.lifecycle.x f() {
        return this.f8494f;
    }

    public final void h() {
        View decorView = getWindow().getDecorView();
        r6.k.e(decorView, "window.decorView");
        q0.k(decorView, this);
        View decorView2 = getWindow().getDecorView();
        r6.k.e(decorView2, "window.decorView");
        decorView2.setTag(R.id.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        r6.k.e(decorView3, "window.decorView");
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
        View decorView4 = getWindow().getDecorView();
        r6.k.e(decorView4, "window.decorView");
        decorView4.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        View decorView5 = getWindow().getDecorView();
        r6.k.e(decorView5, "window.decorView");
        decorView5.setTag(R.id.report_drawn, this);
    }

    public final b1.b i(final a.a aVar, final f4.j jVar) {
        final m mVar = this.f1203n;
        r6.k.f(mVar, "registry");
        final String str = "activity_rq#" + this.f1202m.getAndIncrement();
        LinkedHashMap linkedHashMap = mVar.f1185c;
        r6.k.f(str, "key");
        androidx.lifecycle.x xVar = this.f8494f;
        if (xVar.f1046d.compareTo(androidx.lifecycle.o.f1010i) >= 0) {
            throw new IllegalStateException(("LifecycleOwner " + this + " is attempting to register while current state is " + xVar.f1046d + ". LifecycleOwners must call register before they are STARTED.").toString());
        }
        LinkedHashMap linkedHashMap2 = mVar.f1183a;
        LinkedHashMap linkedHashMap3 = mVar.f1184b;
        if (((Integer) linkedHashMap3.get(str)) == null) {
            Iterator it = new y6.a(new y6.e(e.e.f2660g, new l1.o(1))).iterator();
            while (it.hasNext()) {
                Number number = (Number) it.next();
                if (!linkedHashMap2.containsKey(Integer.valueOf(number.intValue()))) {
                    int intValue = number.intValue();
                    linkedHashMap2.put(Integer.valueOf(intValue), str);
                    linkedHashMap3.put(str, Integer.valueOf(intValue));
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
        e.d dVar = (e.d) linkedHashMap.get(str);
        if (dVar == null) {
            dVar = new e.d(xVar);
        }
        androidx.lifecycle.t tVar = new androidx.lifecycle.t() { // from class: e.b
            @Override // androidx.lifecycle.t
            public final void c(v vVar, n nVar) {
                Integer num;
                m mVar2 = m.this;
                k.f(mVar2, "this$0");
                Bundle bundle = mVar2.f1189g;
                LinkedHashMap linkedHashMap4 = mVar2.f1187e;
                LinkedHashMap linkedHashMap5 = mVar2.f1188f;
                n nVar2 = n.ON_START;
                String str2 = str;
                if (nVar2 == nVar) {
                    a.a aVar2 = aVar;
                    j jVar2 = jVar;
                    linkedHashMap4.put(str2, new c(aVar2, jVar2));
                    if (linkedHashMap5.containsKey(str2)) {
                        Object obj = linkedHashMap5.get(str2);
                        linkedHashMap5.remove(str2);
                        jVar2.a(obj);
                    }
                    a aVar3 = (a) r.g(str2, bundle);
                    if (aVar3 != null) {
                        bundle.remove(str2);
                        jVar2.a(aVar2.C(aVar3.f2651g, aVar3.f2650f));
                        return;
                    }
                    return;
                }
                if (n.ON_STOP == nVar) {
                    linkedHashMap4.remove(str2);
                    return;
                }
                if (n.ON_DESTROY == nVar) {
                    LinkedHashMap linkedHashMap6 = mVar2.f1185c;
                    if (!mVar2.f1186d.contains(str2) && (num = (Integer) mVar2.f1184b.remove(str2)) != null) {
                        mVar2.f1183a.remove(num);
                    }
                    linkedHashMap4.remove(str2);
                    if (linkedHashMap5.containsKey(str2)) {
                        Log.w("ActivityResultRegistry", "Dropping pending result for request " + str2 + ": " + linkedHashMap5.get(str2));
                        linkedHashMap5.remove(str2);
                    }
                    if (bundle.containsKey(str2)) {
                        Log.w("ActivityResultRegistry", "Dropping pending result for request " + str2 + ": " + ((a) r.g(str2, bundle)));
                        bundle.remove(str2);
                    }
                    d dVar2 = (d) linkedHashMap6.get(str2);
                    if (dVar2 != null) {
                        ArrayList arrayList = dVar2.f2659b;
                        int size = arrayList.size();
                        int i7 = 0;
                        while (i7 < size) {
                            Object obj2 = arrayList.get(i7);
                            i7++;
                            dVar2.f2658a.f((t) obj2);
                        }
                        arrayList.clear();
                        linkedHashMap6.remove(str2);
                    }
                }
            }
        };
        dVar.f2658a.a(tVar);
        dVar.f2659b.add(tVar);
        linkedHashMap.put(str, dVar);
        return new b1.b(mVar, str, aVar, 1);
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i7, int i8, Intent intent) {
        if (this.f1203n.a(i7, i8, intent)) {
            return;
        }
        super.onActivityResult(i7, i8, intent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        a().c();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        r6.k.f(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        Iterator it = this.f1204o.iterator();
        while (it.hasNext()) {
            ((n3.h) it.next()).a(configuration);
        }
    }

    @Override // s2.b, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f1198i.g(bundle);
        d.a aVar = this.f1196g;
        aVar.getClass();
        aVar.f1809b = this;
        Iterator it = aVar.f1808a.iterator();
        while (it.hasNext()) {
            ((f) it.next()).a(this);
        }
        super.onCreate(bundle);
        int i7 = androidx.lifecycle.l0.f996g;
        androidx.lifecycle.j0.b(this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i7, Menu menu) {
        r6.k.f(menu, "menu");
        if (i7 != 0) {
            return true;
        }
        super.onCreatePanelMenu(i7, menu);
        getMenuInflater();
        Iterator it = ((CopyOnWriteArrayList) this.f1197h.f1394g).iterator();
        if (!it.hasNext()) {
            return true;
        }
        ((n3.i) it.next()).getClass();
        throw null;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i7, MenuItem menuItem) {
        r6.k.f(menuItem, "item");
        if (super.onMenuItemSelected(i7, menuItem)) {
            return true;
        }
        if (i7 != 0) {
            return false;
        }
        Iterator it = ((CopyOnWriteArrayList) this.f1197h.f1394g).iterator();
        if (!it.hasNext()) {
            return false;
        }
        ((n3.i) it.next()).getClass();
        throw null;
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z8) {
        if (this.f1210u) {
            return;
        }
        Iterator it = this.f1207r.iterator();
        while (it.hasNext()) {
            ((n3.h) it.next()).a(new s2.c(z8));
        }
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        r6.k.f(intent, "intent");
        super.onNewIntent(intent);
        Iterator it = this.f1206q.iterator();
        while (it.hasNext()) {
            ((n3.h) it.next()).a(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onPanelClosed(int i7, Menu menu) {
        r6.k.f(menu, "menu");
        Iterator it = ((CopyOnWriteArrayList) this.f1197h.f1394g).iterator();
        if (it.hasNext()) {
            ((n3.i) it.next()).getClass();
            throw null;
        }
        super.onPanelClosed(i7, menu);
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z8) {
        if (this.f1211v) {
            return;
        }
        Iterator it = this.f1208s.iterator();
        while (it.hasNext()) {
            ((n3.h) it.next()).a(new s2.p(z8));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i7, View view, Menu menu) {
        r6.k.f(menu, "menu");
        if (i7 != 0) {
            return true;
        }
        super.onPreparePanel(i7, view, menu);
        Iterator it = ((CopyOnWriteArrayList) this.f1197h.f1394g).iterator();
        if (!it.hasNext()) {
            return true;
        }
        ((n3.i) it.next()).getClass();
        throw null;
    }

    @Override // android.app.Activity
    public final void onRequestPermissionsResult(int i7, String[] strArr, int[] iArr) {
        r6.k.f(strArr, "permissions");
        r6.k.f(iArr, "grantResults");
        if (this.f1203n.a(i7, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i7, strArr, iArr);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        j jVar;
        b1 b1Var = this.f1199j;
        if (b1Var == null && (jVar = (j) getLastNonConfigurationInstance()) != null) {
            b1Var = jVar.f1168a;
        }
        if (b1Var == null) {
            return null;
        }
        j jVar2 = new j();
        jVar2.f1168a = b1Var;
        return jVar2;
    }

    @Override // s2.b, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        r6.k.f(bundle, "outState");
        androidx.lifecycle.x xVar = this.f8494f;
        if (xVar != null) {
            xVar.g(androidx.lifecycle.o.f1009h);
        }
        super.onSaveInstanceState(bundle);
        this.f1198i.h(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i7) {
        super.onTrimMemory(i7);
        Iterator it = this.f1205p.iterator();
        while (it.hasNext()) {
            ((n3.h) it.next()).a(Integer.valueOf(i7));
        }
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator it = this.f1209t.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if (r4.a.K()) {
                Trace.beginSection("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            x xVar = (x) this.f1201l.getValue();
            synchronized (xVar.f1217b) {
                try {
                    xVar.f1218c = true;
                    ArrayList arrayList = xVar.f1219d;
                    int size = arrayList.size();
                    int i7 = 0;
                    while (i7 < size) {
                        Object obj = arrayList.get(i7);
                        i7++;
                        ((q6.a) obj).a();
                    }
                    xVar.f1219d.clear();
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
    public final void setContentView(int i7) {
        h();
        View decorView = getWindow().getDecorView();
        r6.k.e(decorView, "window.decorView");
        this.f1200k.a(decorView);
        super.setContentView(i7);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i7) {
        r6.k.f(intent, "intent");
        super.startActivityForResult(intent, i7);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i7, Intent intent, int i8, int i9, int i10) {
        r6.k.f(intentSender, "intent");
        super.startIntentSenderForResult(intentSender, i7, intent, i8, i9, i10);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i7, Bundle bundle) {
        r6.k.f(intent, "intent");
        super.startActivityForResult(intent, i7, bundle);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i7, Intent intent, int i8, int i9, int i10, Bundle bundle) {
        r6.k.f(intentSender, "intent");
        super.startIntentSenderForResult(intentSender, i7, intent, i8, i9, i10, bundle);
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z8, Configuration configuration) {
        r6.k.f(configuration, "newConfig");
        this.f1210u = true;
        try {
            super.onMultiWindowModeChanged(z8, configuration);
            this.f1210u = false;
            Iterator it = this.f1207r.iterator();
            while (it.hasNext()) {
                ((n3.h) it.next()).a(new s2.c(z8));
            }
        } catch (Throwable th) {
            this.f1210u = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z8, Configuration configuration) {
        r6.k.f(configuration, "newConfig");
        this.f1211v = true;
        try {
            super.onPictureInPictureModeChanged(z8, configuration);
            this.f1211v = false;
            Iterator it = this.f1208s.iterator();
            while (it.hasNext()) {
                ((n3.h) it.next()).a(new s2.p(z8));
            }
        } catch (Throwable th) {
            this.f1211v = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        h();
        View decorView = getWindow().getDecorView();
        r6.k.e(decorView, "window.decorView");
        this.f1200k.a(decorView);
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        h();
        View decorView = getWindow().getDecorView();
        r6.k.e(decorView, "window.decorView");
        this.f1200k.a(decorView);
        super.setContentView(view, layoutParams);
    }
}
