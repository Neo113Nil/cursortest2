package K1;

import N1.m;
import O1.l;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.Trace;
import android.util.Base64;
import android.util.Log;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.provider.FirebaseInitProvider;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import l1.j;
import n1.ComponentCallbacks2C1316c;
import o1.u;
import r.C1392b;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: j, reason: collision with root package name */
    public static final Object f1385j = new Object();

    /* renamed from: k, reason: collision with root package name */
    public static final C1392b f1386k = new C1392b();

    /* renamed from: a, reason: collision with root package name */
    public final Context f1387a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1388b;

    /* renamed from: c, reason: collision with root package name */
    public final i f1389c;

    /* renamed from: d, reason: collision with root package name */
    public final N1.f f1390d;

    /* renamed from: g, reason: collision with root package name */
    public final m f1393g;

    /* renamed from: h, reason: collision with root package name */
    public final Y1.a f1394h;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f1391e = new AtomicBoolean(false);

    /* renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f1392f = new AtomicBoolean();

    /* renamed from: i, reason: collision with root package name */
    public final CopyOnWriteArrayList f1395i = new CopyOnWriteArrayList();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.List] */
    public g(i iVar, Context context, String str) {
        ?? arrayList;
        int i2 = 1;
        int i3 = 0;
        new CopyOnWriteArrayList();
        this.f1387a = context;
        u.c(str);
        this.f1388b = str;
        this.f1389c = iVar;
        a aVar = FirebaseInitProvider.f5333a;
        Trace.beginSection("Firebase");
        Trace.beginSection("ComponentDiscovery");
        ArrayList arrayList2 = new ArrayList();
        Bundle bundle = null;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                Log.w("ComponentDiscovery", "Context has no PackageManager.");
            } else {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) ComponentDiscoveryService.class), 128);
                if (serviceInfo == null) {
                    Log.w("ComponentDiscovery", ComponentDiscoveryService.class + " has no service info.");
                } else {
                    bundle = serviceInfo.metaData;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("ComponentDiscovery", "Application info not found.");
        }
        if (bundle == null) {
            Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
            arrayList = Collections.emptyList();
        } else {
            arrayList = new ArrayList();
            for (String str2 : bundle.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(bundle.get(str2)) && str2.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str2.substring(31));
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new N1.c(i3, (String) it.next()));
        }
        Trace.endSection();
        Trace.beginSection("Runtime");
        l lVar = l.f2264a;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        arrayList3.addAll(arrayList2);
        arrayList3.add(new N1.c(i2, new FirebaseCommonRegistrar()));
        arrayList3.add(new N1.c(i2, new ExecutorsRegistrar()));
        arrayList4.add(N1.a.b(context, Context.class, new Class[0]));
        arrayList4.add(N1.a.b(this, g.class, new Class[0]));
        arrayList4.add(N1.a.b(iVar, i.class, new Class[0]));
        j jVar = new j(25);
        if (A.h.a(context) && FirebaseInitProvider.f5334b.get()) {
            arrayList4.add(N1.a.b(aVar, a.class, new Class[0]));
        }
        N1.f fVar = new N1.f(arrayList3, arrayList4, jVar);
        this.f1390d = fVar;
        Trace.endSection();
        this.f1393g = new m(new c(this, i3, context));
        this.f1394h = fVar.e(W1.d.class);
        d dVar = new d(this);
        a();
        if (this.f1391e.get()) {
            ComponentCallbacks2C1316c.f11362e.f11363a.get();
        }
        this.f1395i.add(dVar);
        Trace.endSection();
    }

    public static g c() {
        g gVar;
        synchronized (f1385j) {
            try {
                gVar = (g) f1386k.getOrDefault("[DEFAULT]", null);
                if (gVar == null) {
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + s1.b.a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
                ((W1.d) gVar.f1394h.get()).b();
            } catch (Throwable th) {
                throw th;
            }
        }
        return gVar;
    }

    public static g f(i iVar, Context context, String str) {
        g gVar;
        AtomicReference atomicReference = e.f1382a;
        if (context.getApplicationContext() instanceof Application) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference atomicReference2 = e.f1382a;
            if (atomicReference2.get() == null) {
                e eVar = new e();
                while (true) {
                    if (atomicReference2.compareAndSet(null, eVar)) {
                        ComponentCallbacks2C1316c.a(application);
                        ComponentCallbacks2C1316c componentCallbacks2C1316c = ComponentCallbacks2C1316c.f11362e;
                        componentCallbacks2C1316c.getClass();
                        synchronized (componentCallbacks2C1316c) {
                            componentCallbacks2C1316c.f11365c.add(eVar);
                        }
                        break;
                    }
                    if (atomicReference2.get() != null) {
                        break;
                    }
                }
            }
        }
        String trim = str.trim();
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f1385j) {
            C1392b c1392b = f1386k;
            u.i("FirebaseApp name " + trim + " already exists!", !c1392b.containsKey(trim));
            u.h(context, "Application context cannot be null.");
            gVar = new g(iVar, context, trim);
            c1392b.put(trim, gVar);
        }
        gVar.e();
        return gVar;
    }

    public static g g(Context context) {
        synchronized (f1385j) {
            try {
                if (f1386k.containsKey("[DEFAULT]")) {
                    return c();
                }
                i a6 = i.a(context);
                if (a6 == null) {
                    Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                    return null;
                }
                return f(a6, context, "[DEFAULT]");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a() {
        u.i("FirebaseApp was deleted", !this.f1392f.get());
    }

    public final Object b(Class cls) {
        a();
        return this.f1390d.a(cls);
    }

    public final String d() {
        StringBuilder sb = new StringBuilder();
        a();
        byte[] bytes = this.f1388b.getBytes(Charset.defaultCharset());
        sb.append(bytes == null ? null : Base64.encodeToString(bytes, 11));
        sb.append("+");
        a();
        byte[] bytes2 = this.f1389c.f1402b.getBytes(Charset.defaultCharset());
        sb.append(bytes2 != null ? Base64.encodeToString(bytes2, 11) : null);
        return sb.toString();
    }

    public final void e() {
        HashMap hashMap;
        if (!A.h.a(this.f1387a)) {
            StringBuilder sb = new StringBuilder("Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ");
            a();
            sb.append(this.f1388b);
            Log.i("FirebaseApp", sb.toString());
            Context context = this.f1387a;
            AtomicReference atomicReference = f.f1383b;
            if (atomicReference.get() == null) {
                f fVar = new f(context);
                while (!atomicReference.compareAndSet(null, fVar)) {
                    if (atomicReference.get() != null) {
                        return;
                    }
                }
                context.registerReceiver(fVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                return;
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder("Device unlocked: initializing all Firebase APIs for app ");
        a();
        sb2.append(this.f1388b);
        Log.i("FirebaseApp", sb2.toString());
        N1.f fVar2 = this.f1390d;
        a();
        boolean equals = "[DEFAULT]".equals(this.f1388b);
        AtomicReference atomicReference2 = fVar2.f2012f;
        Boolean valueOf = Boolean.valueOf(equals);
        while (true) {
            if (atomicReference2.compareAndSet(null, valueOf)) {
                synchronized (fVar2) {
                    hashMap = new HashMap(fVar2.f2007a);
                }
                fVar2.g(hashMap, equals);
                break;
            } else if (atomicReference2.get() != null) {
                break;
            }
        }
        ((W1.d) this.f1394h.get()).b();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        gVar.a();
        return this.f1388b.equals(gVar.f1388b);
    }

    public final int hashCode() {
        return this.f1388b.hashCode();
    }

    public final String toString() {
        B0.l lVar = new B0.l(this);
        lVar.c(this.f1388b, "name");
        lVar.c(this.f1389c, "options");
        return lVar.toString();
    }
}
