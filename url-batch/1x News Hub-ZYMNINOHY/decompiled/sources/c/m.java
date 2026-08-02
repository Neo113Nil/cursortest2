package c;

import U1.C0080a;
import Y1.C0120q;
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
import androidx.lifecycle.D;
import androidx.lifecycle.EnumC0165g;
import androidx.lifecycle.F;
import androidx.lifecycle.G;
import androidx.lifecycle.InterfaceC0160b;
import androidx.lifecycle.l;
import androidx.lifecycle.m;
import androidx.lifecycle.w;
import androidx.lifecycle.z;
import b2.C0193g;
import c.k;
import com.fc.barca.football.R;
import d.C0293a;
import e.C0308e;
import e.InterfaceC0305b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.j;
import n.C1118d;
import n.C1120f;
import t.AbstractActivityC1188a;
import u.InterfaceC1216a;

/* loaded from: classes.dex */
public abstract class m extends AbstractActivityC1188a implements G, InterfaceC0160b, V.f, u, InterfaceC1216a {

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f2583s = 0;

    /* renamed from: b, reason: collision with root package name */
    public final C0293a f2584b;

    /* renamed from: c, reason: collision with root package name */
    public final C0.e f2585c;

    /* renamed from: d, reason: collision with root package name */
    public final V.e f2586d;

    /* renamed from: e, reason: collision with root package name */
    public F f2587e;
    public final j f;

    /* renamed from: g, reason: collision with root package name */
    public final C0193g f2588g;

    /* renamed from: h, reason: collision with root package name */
    public final AtomicInteger f2589h;

    /* renamed from: i, reason: collision with root package name */
    public final k f2590i;

    /* renamed from: j, reason: collision with root package name */
    public final CopyOnWriteArrayList f2591j;

    /* renamed from: k, reason: collision with root package name */
    public final CopyOnWriteArrayList f2592k;

    /* renamed from: l, reason: collision with root package name */
    public final CopyOnWriteArrayList f2593l;

    /* renamed from: m, reason: collision with root package name */
    public final CopyOnWriteArrayList f2594m;

    /* renamed from: n, reason: collision with root package name */
    public final CopyOnWriteArrayList f2595n;
    public final CopyOnWriteArrayList o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f2596p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f2597q;

    /* renamed from: r, reason: collision with root package name */
    public final C0193g f2598r;

    public m() {
        C0293a c0293a = new C0293a();
        this.f2584b = c0293a;
        this.f2585c = new C0.e(new RunnableC0198c(this, 0));
        V.e eVar = new V.e(this);
        this.f2586d = eVar;
        this.f = new j(this);
        this.f2588g = new C0193g(new l(this, 1));
        this.f2589h = new AtomicInteger();
        this.f2590i = new k(this);
        this.f2591j = new CopyOnWriteArrayList();
        this.f2592k = new CopyOnWriteArrayList();
        this.f2593l = new CopyOnWriteArrayList();
        this.f2594m = new CopyOnWriteArrayList();
        this.f2595n = new CopyOnWriteArrayList();
        this.o = new CopyOnWriteArrayList();
        androidx.lifecycle.o oVar = this.f10332a;
        if (oVar == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        oVar.a(new C0199d(0, this));
        this.f10332a.a(new C0199d(1, this));
        this.f10332a.a(new V.b(2, this));
        eVar.b();
        z.a(this);
        ((O1.k) eVar.f1593c).c("android:support:activity-result", new V.d() { // from class: c.e
            @Override // V.d
            public final Bundle a() {
                m this$0 = m.this;
                kotlin.jvm.internal.j.e(this$0, "this$0");
                Bundle bundle = new Bundle();
                k kVar = this$0.f2590i;
                kVar.getClass();
                LinkedHashMap linkedHashMap = kVar.f2576b;
                bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(linkedHashMap.values()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(linkedHashMap.keySet()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(kVar.f2578d));
                bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(kVar.f2580g));
                return bundle;
            }
        });
        f fVar = new f(this);
        m mVar = c0293a.f4907b;
        if (mVar != null) {
            fVar.a(mVar);
        }
        c0293a.f4906a.add(fVar);
        this.f2598r = new C0193g(new l(this, 2));
    }

    @Override // c.u
    public final t a() {
        return (t) this.f2598r.a();
    }

    @Override // android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        g();
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.j.d(decorView, "window.decorView");
        this.f.a(decorView);
        super.addContentView(view, layoutParams);
    }

    @Override // V.f
    public final O1.k b() {
        return (O1.k) this.f2586d.f1593c;
    }

    @Override // androidx.lifecycle.InterfaceC0160b
    public final Q.b c() {
        Q.c cVar = new Q.c(Q.a.f1276b);
        Application application = getApplication();
        LinkedHashMap linkedHashMap = (LinkedHashMap) cVar.f1277a;
        if (application != null) {
            D d3 = D.f2373a;
            Application application2 = getApplication();
            kotlin.jvm.internal.j.d(application2, "application");
            linkedHashMap.put(d3, application2);
        }
        linkedHashMap.put(z.f2410a, this);
        linkedHashMap.put(z.f2411b, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            linkedHashMap.put(z.f2412c, extras);
        }
        return cVar;
    }

    @Override // androidx.lifecycle.G
    public final F d() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        if (this.f2587e == null) {
            i iVar = (i) getLastNonConfigurationInstance();
            if (iVar != null) {
                this.f2587e = iVar.f2570a;
            }
            if (this.f2587e == null) {
                this.f2587e = new F(0);
            }
        }
        F f = this.f2587e;
        kotlin.jvm.internal.j.b(f);
        return f;
    }

    @Override // androidx.lifecycle.m
    public final androidx.lifecycle.o e() {
        return this.f10332a;
    }

    public final void g() {
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.j.d(decorView, "window.decorView");
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        View decorView2 = getWindow().getDecorView();
        kotlin.jvm.internal.j.d(decorView2, "window.decorView");
        decorView2.setTag(R.id.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        kotlin.jvm.internal.j.d(decorView3, "window.decorView");
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
        View decorView4 = getWindow().getDecorView();
        kotlin.jvm.internal.j.d(decorView4, "window.decorView");
        decorView4.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        View decorView5 = getWindow().getDecorView();
        kotlin.jvm.internal.j.d(decorView5, "window.decorView");
        decorView5.setTag(R.id.report_drawn, this);
    }

    public final A0.f h(final C0080a c0080a, final InterfaceC0305b interfaceC0305b) {
        final k registry = this.f2590i;
        kotlin.jvm.internal.j.e(registry, "registry");
        final String key = "activity_rq#" + this.f2589h.getAndIncrement();
        kotlin.jvm.internal.j.e(key, "key");
        androidx.lifecycle.o oVar = this.f10332a;
        if (oVar.f2389c.compareTo(androidx.lifecycle.h.f2382d) >= 0) {
            throw new IllegalStateException(("LifecycleOwner " + this + " is attempting to register while current state is " + oVar.f2389c + ". LifecycleOwners must call register before they are STARTED.").toString());
        }
        LinkedHashMap linkedHashMap = registry.f2576b;
        if (((Integer) linkedHashMap.get(key)) == null) {
            Iterator it = new r2.a(new c2.d(2, new C0120q(8))).iterator();
            while (it.hasNext()) {
                Number number = (Number) it.next();
                int intValue = number.intValue();
                LinkedHashMap linkedHashMap2 = registry.f2575a;
                if (!linkedHashMap2.containsKey(Integer.valueOf(intValue))) {
                    int intValue2 = number.intValue();
                    linkedHashMap2.put(Integer.valueOf(intValue2), key);
                    linkedHashMap.put(key, Integer.valueOf(intValue2));
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
        LinkedHashMap linkedHashMap3 = registry.f2577c;
        C0308e c0308e = (C0308e) linkedHashMap3.get(key);
        if (c0308e == null) {
            c0308e = new C0308e(oVar);
        }
        androidx.lifecycle.l lVar = new androidx.lifecycle.l() { // from class: e.c
            @Override // androidx.lifecycle.l
            public final void a(m mVar, EnumC0165g enumC0165g) {
                Integer num;
                k this$0 = k.this;
                j.e(this$0, "this$0");
                String str = key;
                InterfaceC0305b interfaceC0305b2 = interfaceC0305b;
                C0080a c0080a2 = c0080a;
                EnumC0165g enumC0165g2 = EnumC0165g.ON_START;
                LinkedHashMap linkedHashMap4 = this$0.f2579e;
                Bundle bundle = this$0.f2580g;
                LinkedHashMap linkedHashMap5 = this$0.f;
                if (enumC0165g2 == enumC0165g) {
                    linkedHashMap4.put(str, new C0307d(c0080a2, interfaceC0305b2));
                    if (linkedHashMap5.containsKey(str)) {
                        Object obj = linkedHashMap5.get(str);
                        linkedHashMap5.remove(str);
                        interfaceC0305b2.c(obj);
                    }
                    C0304a c0304a = (C0304a) C2.b.r(bundle, str);
                    if (c0304a != null) {
                        bundle.remove(str);
                        interfaceC0305b2.c(new C0304a(c0304a.f4953b, c0304a.f4952a));
                        return;
                    }
                    return;
                }
                if (EnumC0165g.ON_STOP == enumC0165g) {
                    linkedHashMap4.remove(str);
                    return;
                }
                if (EnumC0165g.ON_DESTROY == enumC0165g) {
                    if (!this$0.f2578d.contains(str) && (num = (Integer) this$0.f2576b.remove(str)) != null) {
                        this$0.f2575a.remove(num);
                    }
                    linkedHashMap4.remove(str);
                    if (linkedHashMap5.containsKey(str)) {
                        Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + linkedHashMap5.get(str));
                        linkedHashMap5.remove(str);
                    }
                    if (bundle.containsKey(str)) {
                        Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + ((C0304a) C2.b.r(bundle, str)));
                        bundle.remove(str);
                    }
                    LinkedHashMap linkedHashMap6 = this$0.f2577c;
                    C0308e c0308e2 = (C0308e) linkedHashMap6.get(str);
                    if (c0308e2 != null) {
                        ArrayList arrayList = c0308e2.f4960b;
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            c0308e2.f4959a.b((l) it2.next());
                        }
                        arrayList.clear();
                        linkedHashMap6.remove(str);
                    }
                }
            }
        };
        c0308e.f4959a.a(lVar);
        c0308e.f4960b.add(lVar);
        linkedHashMap3.put(key, c0308e);
        return new A0.f(registry, key, c0080a, 16);
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i3, int i4, Intent intent) {
        if (this.f2590i.a(i3, i4, intent)) {
            return;
        }
        super.onActivityResult(i3, i4, intent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        a().b();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration newConfig) {
        kotlin.jvm.internal.j.e(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        Iterator it = this.f2591j.iterator();
        while (it.hasNext()) {
            ((D.a) it.next()).accept(newConfig);
        }
    }

    @Override // t.AbstractActivityC1188a, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f2586d.c(bundle);
        C0293a c0293a = this.f2584b;
        c0293a.getClass();
        c0293a.f4907b = this;
        Iterator it = c0293a.f4906a.iterator();
        while (it.hasNext()) {
            ((f) it.next()).a(this);
        }
        super.onCreate(bundle);
        int i3 = w.f2408b;
        androidx.lifecycle.u.b(this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i3, Menu menu) {
        kotlin.jvm.internal.j.e(menu, "menu");
        if (i3 != 0) {
            return true;
        }
        super.onCreatePanelMenu(i3, menu);
        getMenuInflater();
        Iterator it = ((CopyOnWriteArrayList) this.f2585c.f201b).iterator();
        if (!it.hasNext()) {
            return true;
        }
        ((P.i) it.next()).getClass();
        throw null;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i3, MenuItem item) {
        kotlin.jvm.internal.j.e(item, "item");
        if (super.onMenuItemSelected(i3, item)) {
            return true;
        }
        if (i3 != 0) {
            return false;
        }
        Iterator it = ((CopyOnWriteArrayList) this.f2585c.f201b).iterator();
        if (!it.hasNext()) {
            return false;
        }
        ((P.i) it.next()).getClass();
        throw null;
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z) {
        if (this.f2596p) {
            return;
        }
        Iterator it = this.f2594m.iterator();
        while (it.hasNext()) {
            ((D.a) it.next()).accept(new t.b(z));
        }
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        kotlin.jvm.internal.j.e(intent, "intent");
        super.onNewIntent(intent);
        Iterator it = this.f2593l.iterator();
        while (it.hasNext()) {
            ((D.a) it.next()).accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onPanelClosed(int i3, Menu menu) {
        kotlin.jvm.internal.j.e(menu, "menu");
        Iterator it = ((CopyOnWriteArrayList) this.f2585c.f201b).iterator();
        if (it.hasNext()) {
            ((P.i) it.next()).getClass();
            throw null;
        }
        super.onPanelClosed(i3, menu);
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z) {
        if (this.f2597q) {
            return;
        }
        Iterator it = this.f2595n.iterator();
        while (it.hasNext()) {
            ((D.a) it.next()).accept(new t.h(z));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i3, View view, Menu menu) {
        kotlin.jvm.internal.j.e(menu, "menu");
        if (i3 != 0) {
            return true;
        }
        super.onPreparePanel(i3, view, menu);
        Iterator it = ((CopyOnWriteArrayList) this.f2585c.f201b).iterator();
        if (!it.hasNext()) {
            return true;
        }
        ((P.i) it.next()).getClass();
        throw null;
    }

    @Override // android.app.Activity
    public final void onRequestPermissionsResult(int i3, String[] permissions, int[] grantResults) {
        kotlin.jvm.internal.j.e(permissions, "permissions");
        kotlin.jvm.internal.j.e(grantResults, "grantResults");
        if (this.f2590i.a(i3, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", permissions).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", grantResults))) {
            return;
        }
        super.onRequestPermissionsResult(i3, permissions, grantResults);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        i iVar;
        F f = this.f2587e;
        if (f == null && (iVar = (i) getLastNonConfigurationInstance()) != null) {
            f = iVar.f2570a;
        }
        if (f == null) {
            return null;
        }
        i iVar2 = new i();
        iVar2.f2570a = f;
        return iVar2;
    }

    @Override // t.AbstractActivityC1188a, android.app.Activity
    public void onSaveInstanceState(Bundle outState) {
        kotlin.jvm.internal.j.e(outState, "outState");
        androidx.lifecycle.o oVar = this.f10332a;
        if (oVar != null) {
            androidx.lifecycle.h hVar = androidx.lifecycle.h.f2381c;
            oVar.d("setCurrentState");
            oVar.f(hVar);
        }
        super.onSaveInstanceState(outState);
        O1.k kVar = (O1.k) this.f2586d.f1593c;
        kVar.getClass();
        Bundle bundle = new Bundle();
        Bundle bundle2 = (Bundle) kVar.f1184e;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        C1120f c1120f = (C1120f) kVar.f1183d;
        c1120f.getClass();
        C1118d c1118d = new C1118d(c1120f);
        c1120f.f9983c.put(c1118d, Boolean.FALSE);
        while (c1118d.hasNext()) {
            Map.Entry entry = (Map.Entry) c1118d.next();
            bundle.putBundle((String) entry.getKey(), ((V.d) entry.getValue()).a());
        }
        if (bundle.isEmpty()) {
            return;
        }
        outState.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i3) {
        super.onTrimMemory(i3);
        Iterator it = this.f2592k.iterator();
        while (it.hasNext()) {
            ((D.a) it.next()).accept(Integer.valueOf(i3));
        }
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator it = this.o.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if (S0.a.v()) {
                Trace.beginSection(S0.a.N("reportFullyDrawn() for ComponentActivity"));
            }
            super.reportFullyDrawn();
            n nVar = (n) this.f2588g.a();
            synchronized (nVar.f2600b) {
                try {
                    nVar.f2601c = true;
                    Iterator it = nVar.f2602d.iterator();
                    while (it.hasNext()) {
                        ((l2.a) it.next()).invoke();
                    }
                    nVar.f2602d.clear();
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
    public final void setContentView(int i3) {
        g();
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.j.d(decorView, "window.decorView");
        this.f.a(decorView);
        super.setContentView(i3);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i3) {
        kotlin.jvm.internal.j.e(intent, "intent");
        super.startActivityForResult(intent, i3);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intent, int i3, Intent intent2, int i4, int i5, int i6) {
        kotlin.jvm.internal.j.e(intent, "intent");
        super.startIntentSenderForResult(intent, i3, intent2, i4, i5, i6);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i3, Bundle bundle) {
        kotlin.jvm.internal.j.e(intent, "intent");
        super.startActivityForResult(intent, i3, bundle);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intent, int i3, Intent intent2, int i4, int i5, int i6, Bundle bundle) {
        kotlin.jvm.internal.j.e(intent, "intent");
        super.startIntentSenderForResult(intent, i3, intent2, i4, i5, i6, bundle);
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z, Configuration newConfig) {
        kotlin.jvm.internal.j.e(newConfig, "newConfig");
        this.f2596p = true;
        try {
            super.onMultiWindowModeChanged(z, newConfig);
            this.f2596p = false;
            Iterator it = this.f2594m.iterator();
            while (it.hasNext()) {
                ((D.a) it.next()).accept(new t.b(z));
            }
        } catch (Throwable th) {
            this.f2596p = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z, Configuration newConfig) {
        kotlin.jvm.internal.j.e(newConfig, "newConfig");
        this.f2597q = true;
        try {
            super.onPictureInPictureModeChanged(z, newConfig);
            this.f2597q = false;
            Iterator it = this.f2595n.iterator();
            while (it.hasNext()) {
                ((D.a) it.next()).accept(new t.h(z));
            }
        } catch (Throwable th) {
            this.f2597q = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        g();
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.j.d(decorView, "window.decorView");
        this.f.a(decorView);
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        g();
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.j.d(decorView, "window.decorView");
        this.f.a(decorView);
        super.setContentView(view, layoutParams);
    }
}
