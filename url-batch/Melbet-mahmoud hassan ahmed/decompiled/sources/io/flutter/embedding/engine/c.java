package io.flutter.embedding.engine;

import android.app.Activity;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import e5.a;
import f5.c;
import io.flutter.embedding.engine.plugins.lifecycle.HiddenLifecycleReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import m5.m;
import m5.n;
import m5.o;
import m5.p;

/* loaded from: classes.dex */
class c implements e5.b, f5.b {

    /* renamed from: b, reason: collision with root package name */
    private final io.flutter.embedding.engine.a f17229b;

    /* renamed from: c, reason: collision with root package name */
    private final a.b f17230c;

    /* renamed from: e, reason: collision with root package name */
    private io.flutter.embedding.android.c<Activity> f17232e;

    /* renamed from: f, reason: collision with root package name */
    private C0072c f17233f;

    /* renamed from: i, reason: collision with root package name */
    private Service f17236i;

    /* renamed from: j, reason: collision with root package name */
    private f f17237j;

    /* renamed from: l, reason: collision with root package name */
    private BroadcastReceiver f17239l;

    /* renamed from: m, reason: collision with root package name */
    private d f17240m;

    /* renamed from: o, reason: collision with root package name */
    private ContentProvider f17242o;

    /* renamed from: p, reason: collision with root package name */
    private e f17243p;

    /* renamed from: a, reason: collision with root package name */
    private final Map<Class<? extends e5.a>, e5.a> f17228a = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private final Map<Class<? extends e5.a>, f5.a> f17231d = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    private boolean f17234g = false;

    /* renamed from: h, reason: collision with root package name */
    private final Map<Class<? extends e5.a>, i5.a> f17235h = new HashMap();

    /* renamed from: k, reason: collision with root package name */
    private final Map<Class<? extends e5.a>, g5.a> f17238k = new HashMap();

    /* renamed from: n, reason: collision with root package name */
    private final Map<Class<? extends e5.a>, h5.a> f17241n = new HashMap();

    private static class b implements a.InterfaceC0059a {

        /* renamed from: a, reason: collision with root package name */
        final c5.d f17244a;

        private b(c5.d dVar) {
            this.f17244a = dVar;
        }

        @Override // e5.a.InterfaceC0059a
        public String a(String str) {
            return this.f17244a.h(str);
        }
    }

    /* renamed from: io.flutter.embedding.engine.c$c, reason: collision with other inner class name */
    private static class C0072c implements f5.c {

        /* renamed from: a, reason: collision with root package name */
        private final Activity f17245a;

        /* renamed from: b, reason: collision with root package name */
        private final HiddenLifecycleReference f17246b;

        /* renamed from: c, reason: collision with root package name */
        private final Set<o> f17247c = new HashSet();

        /* renamed from: d, reason: collision with root package name */
        private final Set<m> f17248d = new HashSet();

        /* renamed from: e, reason: collision with root package name */
        private final Set<n> f17249e = new HashSet();

        /* renamed from: f, reason: collision with root package name */
        private final Set<p> f17250f = new HashSet();

        /* renamed from: g, reason: collision with root package name */
        private final Set<c.a> f17251g = new HashSet();

        public C0072c(Activity activity, androidx.lifecycle.e eVar) {
            this.f17245a = activity;
            this.f17246b = new HiddenLifecycleReference(eVar);
        }

        boolean a(int i7, int i8, Intent intent) {
            boolean z6;
            Iterator it = new HashSet(this.f17248d).iterator();
            while (true) {
                while (it.hasNext()) {
                    z6 = ((m) it.next()).a(i7, i8, intent) || z6;
                }
                return z6;
            }
        }

        void b(Intent intent) {
            Iterator<n> it = this.f17249e.iterator();
            while (it.hasNext()) {
                it.next().c(intent);
            }
        }

        boolean c(int i7, String[] strArr, int[] iArr) {
            boolean z6;
            Iterator<o> it = this.f17247c.iterator();
            while (true) {
                while (it.hasNext()) {
                    z6 = it.next().b(i7, strArr, iArr) || z6;
                }
                return z6;
            }
        }

        @Override // f5.c
        public Activity d() {
            return this.f17245a;
        }

        @Override // f5.c
        public void e(n nVar) {
            this.f17249e.remove(nVar);
        }

        @Override // f5.c
        public void f(n nVar) {
            this.f17249e.add(nVar);
        }

        void g(Bundle bundle) {
            Iterator<c.a> it = this.f17251g.iterator();
            while (it.hasNext()) {
                it.next().d(bundle);
            }
        }

        void h(Bundle bundle) {
            Iterator<c.a> it = this.f17251g.iterator();
            while (it.hasNext()) {
                it.next().e(bundle);
            }
        }

        void i() {
            Iterator<p> it = this.f17250f.iterator();
            while (it.hasNext()) {
                it.next().f();
            }
        }
    }

    private static class d implements g5.b {
    }

    private static class e implements h5.b {
    }

    private static class f implements i5.b {
    }

    c(Context context, io.flutter.embedding.engine.a aVar, c5.d dVar) {
        this.f17229b = aVar;
        this.f17230c = new a.b(context, aVar, aVar.i(), aVar.q(), aVar.o().N(), new b(dVar));
    }

    private void k(Activity activity, androidx.lifecycle.e eVar) {
        this.f17233f = new C0072c(activity, eVar);
        this.f17229b.o().f0(activity.getIntent().getBooleanExtra("enable-software-rendering", false));
        this.f17229b.o().z(activity, this.f17229b.q(), this.f17229b.i());
        for (f5.a aVar : this.f17231d.values()) {
            if (this.f17234g) {
                aVar.a(this.f17233f);
            } else {
                aVar.b(this.f17233f);
            }
        }
        this.f17234g = false;
    }

    private void m() {
        this.f17229b.o().H();
        this.f17232e = null;
        this.f17233f = null;
    }

    private void n() {
        if (s()) {
            j();
            return;
        }
        if (v()) {
            q();
        } else if (t()) {
            o();
        } else if (u()) {
            p();
        }
    }

    private boolean s() {
        return this.f17232e != null;
    }

    private boolean t() {
        return this.f17239l != null;
    }

    private boolean u() {
        return this.f17242o != null;
    }

    private boolean v() {
        return this.f17236i != null;
    }

    @Override // f5.b
    public boolean a(int i7, int i8, Intent intent) {
        if (!s()) {
            z4.b.b("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onActivityResult, but no Activity was attached.");
            return false;
        }
        u5.e.a("FlutterEngineConnectionRegistry#onActivityResult");
        try {
            return this.f17233f.a(i7, i8, intent);
        } finally {
            u5.e.b();
        }
    }

    @Override // f5.b
    public boolean b(int i7, String[] strArr, int[] iArr) {
        if (!s()) {
            z4.b.b("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onRequestPermissionsResult, but no Activity was attached.");
            return false;
        }
        u5.e.a("FlutterEngineConnectionRegistry#onRequestPermissionsResult");
        try {
            return this.f17233f.c(i7, strArr, iArr);
        } finally {
            u5.e.b();
        }
    }

    @Override // f5.b
    public void c(Intent intent) {
        if (!s()) {
            z4.b.b("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onNewIntent, but no Activity was attached.");
            return;
        }
        u5.e.a("FlutterEngineConnectionRegistry#onNewIntent");
        try {
            this.f17233f.b(intent);
        } finally {
            u5.e.b();
        }
    }

    @Override // f5.b
    public void d(Bundle bundle) {
        if (!s()) {
            z4.b.b("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onRestoreInstanceState, but no Activity was attached.");
            return;
        }
        u5.e.a("FlutterEngineConnectionRegistry#onRestoreInstanceState");
        try {
            this.f17233f.g(bundle);
        } finally {
            u5.e.b();
        }
    }

    @Override // f5.b
    public void e(Bundle bundle) {
        if (!s()) {
            z4.b.b("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onSaveInstanceState, but no Activity was attached.");
            return;
        }
        u5.e.a("FlutterEngineConnectionRegistry#onSaveInstanceState");
        try {
            this.f17233f.h(bundle);
        } finally {
            u5.e.b();
        }
    }

    @Override // f5.b
    public void f() {
        if (!s()) {
            z4.b.b("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onUserLeaveHint, but no Activity was attached.");
            return;
        }
        u5.e.a("FlutterEngineConnectionRegistry#onUserLeaveHint");
        try {
            this.f17233f.i();
        } finally {
            u5.e.b();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e5.b
    public void g(e5.a aVar) {
        u5.e.a("FlutterEngineConnectionRegistry#add " + aVar.getClass().getSimpleName());
        try {
            if (r(aVar.getClass())) {
                z4.b.f("FlutterEngineCxnRegstry", "Attempted to register plugin (" + aVar + ") but it was already registered with this FlutterEngine (" + this.f17229b + ").");
                return;
            }
            z4.b.e("FlutterEngineCxnRegstry", "Adding plugin: " + aVar);
            this.f17228a.put(aVar.getClass(), aVar);
            aVar.f(this.f17230c);
            if (aVar instanceof f5.a) {
                f5.a aVar2 = (f5.a) aVar;
                this.f17231d.put(aVar.getClass(), aVar2);
                if (s()) {
                    aVar2.b(this.f17233f);
                }
            }
            if (aVar instanceof i5.a) {
                i5.a aVar3 = (i5.a) aVar;
                this.f17235h.put(aVar.getClass(), aVar3);
                if (v()) {
                    aVar3.b(this.f17237j);
                }
            }
            if (aVar instanceof g5.a) {
                g5.a aVar4 = (g5.a) aVar;
                this.f17238k.put(aVar.getClass(), aVar4);
                if (t()) {
                    aVar4.a(this.f17240m);
                }
            }
            if (aVar instanceof h5.a) {
                h5.a aVar5 = (h5.a) aVar;
                this.f17241n.put(aVar.getClass(), aVar5);
                if (u()) {
                    aVar5.b(this.f17243p);
                }
            }
        } finally {
            u5.e.b();
        }
    }

    @Override // f5.b
    public void h(io.flutter.embedding.android.c<Activity> cVar, androidx.lifecycle.e eVar) {
        u5.e.a("FlutterEngineConnectionRegistry#attachToActivity");
        try {
            io.flutter.embedding.android.c<Activity> cVar2 = this.f17232e;
            if (cVar2 != null) {
                cVar2.e();
            }
            n();
            this.f17232e = cVar;
            k(cVar.f(), eVar);
        } finally {
            u5.e.b();
        }
    }

    @Override // f5.b
    public void i() {
        if (!s()) {
            z4.b.b("FlutterEngineCxnRegstry", "Attempted to detach plugins from an Activity when no Activity was attached.");
            return;
        }
        u5.e.a("FlutterEngineConnectionRegistry#detachFromActivityForConfigChanges");
        try {
            this.f17234g = true;
            Iterator<f5.a> it = this.f17231d.values().iterator();
            while (it.hasNext()) {
                it.next().e();
            }
            m();
        } finally {
            u5.e.b();
        }
    }

    @Override // f5.b
    public void j() {
        if (!s()) {
            z4.b.b("FlutterEngineCxnRegstry", "Attempted to detach plugins from an Activity when no Activity was attached.");
            return;
        }
        u5.e.a("FlutterEngineConnectionRegistry#detachFromActivity");
        try {
            Iterator<f5.a> it = this.f17231d.values().iterator();
            while (it.hasNext()) {
                it.next().c();
            }
            m();
        } finally {
            u5.e.b();
        }
    }

    public void l() {
        z4.b.e("FlutterEngineCxnRegstry", "Destroying.");
        n();
        y();
    }

    public void o() {
        if (!t()) {
            z4.b.b("FlutterEngineCxnRegstry", "Attempted to detach plugins from a BroadcastReceiver when no BroadcastReceiver was attached.");
            return;
        }
        u5.e.a("FlutterEngineConnectionRegistry#detachFromBroadcastReceiver");
        try {
            Iterator<g5.a> it = this.f17238k.values().iterator();
            while (it.hasNext()) {
                it.next().b();
            }
        } finally {
            u5.e.b();
        }
    }

    public void p() {
        if (!u()) {
            z4.b.b("FlutterEngineCxnRegstry", "Attempted to detach plugins from a ContentProvider when no ContentProvider was attached.");
            return;
        }
        u5.e.a("FlutterEngineConnectionRegistry#detachFromContentProvider");
        try {
            Iterator<h5.a> it = this.f17241n.values().iterator();
            while (it.hasNext()) {
                it.next().a();
            }
        } finally {
            u5.e.b();
        }
    }

    public void q() {
        if (!v()) {
            z4.b.b("FlutterEngineCxnRegstry", "Attempted to detach plugins from a Service when no Service was attached.");
            return;
        }
        u5.e.a("FlutterEngineConnectionRegistry#detachFromService");
        try {
            Iterator<i5.a> it = this.f17235h.values().iterator();
            while (it.hasNext()) {
                it.next().a();
            }
            this.f17236i = null;
        } finally {
            u5.e.b();
        }
    }

    public boolean r(Class<? extends e5.a> cls) {
        return this.f17228a.containsKey(cls);
    }

    public void w(Class<? extends e5.a> cls) {
        e5.a aVar = this.f17228a.get(cls);
        if (aVar == null) {
            return;
        }
        u5.e.a("FlutterEngineConnectionRegistry#remove " + cls.getSimpleName());
        try {
            if (aVar instanceof f5.a) {
                if (s()) {
                    ((f5.a) aVar).c();
                }
                this.f17231d.remove(cls);
            }
            if (aVar instanceof i5.a) {
                if (v()) {
                    ((i5.a) aVar).a();
                }
                this.f17235h.remove(cls);
            }
            if (aVar instanceof g5.a) {
                if (t()) {
                    ((g5.a) aVar).b();
                }
                this.f17238k.remove(cls);
            }
            if (aVar instanceof h5.a) {
                if (u()) {
                    ((h5.a) aVar).a();
                }
                this.f17241n.remove(cls);
            }
            aVar.i(this.f17230c);
            this.f17228a.remove(cls);
        } finally {
            u5.e.b();
        }
    }

    public void x(Set<Class<? extends e5.a>> set) {
        Iterator<Class<? extends e5.a>> it = set.iterator();
        while (it.hasNext()) {
            w(it.next());
        }
    }

    public void y() {
        x(new HashSet(this.f17228a.keySet()));
        this.f17228a.clear();
    }
}
