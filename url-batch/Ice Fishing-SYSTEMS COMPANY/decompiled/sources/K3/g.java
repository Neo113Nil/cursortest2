package K3;

import K.o;
import N2.ComponentCallbacks2C0317c;
import N3.n;
import O2.w;
import O3.k;
import S0.l;
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

/* loaded from: classes2.dex */
public final class g {

    /* renamed from: j, reason: collision with root package name */
    public static final Object f1621j = new Object();

    /* renamed from: k, reason: collision with root package name */
    public static final s.b f1622k = new s.b();

    /* renamed from: a, reason: collision with root package name */
    public final Context f1623a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1624b;

    /* renamed from: c, reason: collision with root package name */
    public final i f1625c;

    /* renamed from: d, reason: collision with root package name */
    public final N3.g f1626d;

    /* renamed from: g, reason: collision with root package name */
    public final n f1629g;

    /* renamed from: h, reason: collision with root package name */
    public final Y3.a f1630h;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f1627e = new AtomicBoolean(false);

    /* renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f1628f = new AtomicBoolean();
    public final CopyOnWriteArrayList i = new CopyOnWriteArrayList();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.List] */
    public g(i iVar, Context context, String str) {
        ?? arrayList;
        int i = 1;
        int i4 = 0;
        new CopyOnWriteArrayList();
        this.f1623a = context;
        w.e(str);
        this.f1624b = str;
        this.f1625c = iVar;
        a aVar = FirebaseInitProvider.f36365n;
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
            arrayList = Collections.EMPTY_LIST;
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
            arrayList2.add(new N3.d(i4, (String) it.next()));
        }
        Trace.endSection();
        Trace.beginSection("Runtime");
        k kVar = k.f2522n;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        arrayList3.addAll(arrayList2);
        arrayList3.add(new N3.d(i, new FirebaseCommonRegistrar()));
        arrayList3.add(new N3.d(i, new ExecutorsRegistrar()));
        arrayList4.add(N3.b.b(context, Context.class, new Class[0]));
        arrayList4.add(N3.b.b(this, g.class, new Class[0]));
        arrayList4.add(N3.b.b(iVar, i.class, new Class[0]));
        W3.e eVar = new W3.e(19);
        if (o.a(context) && FirebaseInitProvider.f36366u.get()) {
            arrayList4.add(N3.b.b(aVar, a.class, new Class[0]));
        }
        N3.g gVar = new N3.g(arrayList3, arrayList4, eVar);
        this.f1626d = gVar;
        Trace.endSection();
        this.f1629g = new n(new c(i4, this, context));
        this.f1630h = gVar.c(W3.d.class);
        d dVar = new d(this);
        a();
        if (this.f1627e.get()) {
            ComponentCallbacks2C0317c.f2039x.f2040n.get();
        }
        this.i.add(dVar);
        Trace.endSection();
    }

    public static g c() {
        g gVar;
        synchronized (f1621j) {
            try {
                gVar = (g) f1622k.getOrDefault("[DEFAULT]", null);
                if (gVar == null) {
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + S2.b.e() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
                ((W3.d) gVar.f1630h.get()).b();
            } catch (Throwable th) {
                throw th;
            }
        }
        return gVar;
    }

    public static g f(i iVar, Context context, String str) {
        g gVar;
        AtomicReference atomicReference = e.f1618a;
        if (context.getApplicationContext() instanceof Application) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference atomicReference2 = e.f1618a;
            if (atomicReference2.get() == null) {
                e eVar = new e();
                while (true) {
                    if (atomicReference2.compareAndSet(null, eVar)) {
                        ComponentCallbacks2C0317c.a(application);
                        ComponentCallbacks2C0317c componentCallbacks2C0317c = ComponentCallbacks2C0317c.f2039x;
                        componentCallbacks2C0317c.getClass();
                        synchronized (componentCallbacks2C0317c) {
                            componentCallbacks2C0317c.f2042v.add(eVar);
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
        synchronized (f1621j) {
            s.b bVar = f1622k;
            w.j("FirebaseApp name " + trim + " already exists!", !bVar.containsKey(trim));
            w.i(context, "Application context cannot be null.");
            gVar = new g(iVar, context, trim);
            bVar.put(trim, gVar);
        }
        gVar.e();
        return gVar;
    }

    public static g g(Context context) {
        synchronized (f1621j) {
            try {
                if (f1622k.containsKey("[DEFAULT]")) {
                    return c();
                }
                i a9 = i.a(context);
                if (a9 == null) {
                    Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                    return null;
                }
                return f(a9, context, "[DEFAULT]");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a() {
        w.j("FirebaseApp was deleted", !this.f1628f.get());
    }

    public final Object b(Class cls) {
        a();
        return this.f1626d.a(cls);
    }

    public final String d() {
        StringBuilder sb = new StringBuilder();
        a();
        byte[] bytes = this.f1624b.getBytes(Charset.defaultCharset());
        sb.append(bytes == null ? null : Base64.encodeToString(bytes, 11));
        sb.append("+");
        a();
        byte[] bytes2 = this.f1625c.f1637b.getBytes(Charset.defaultCharset());
        sb.append(bytes2 != null ? Base64.encodeToString(bytes2, 11) : null);
        return sb.toString();
    }

    public final void e() {
        HashMap hashMap;
        if (!o.a(this.f1623a)) {
            StringBuilder sb = new StringBuilder("Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ");
            a();
            sb.append(this.f1624b);
            Log.i("FirebaseApp", sb.toString());
            Context context = this.f1623a;
            AtomicReference atomicReference = f.f1619b;
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
        sb2.append(this.f1624b);
        Log.i("FirebaseApp", sb2.toString());
        N3.g gVar = this.f1626d;
        a();
        boolean equals = "[DEFAULT]".equals(this.f1624b);
        AtomicReference atomicReference2 = gVar.f2170y;
        Boolean valueOf = Boolean.valueOf(equals);
        while (true) {
            if (atomicReference2.compareAndSet(null, valueOf)) {
                synchronized (gVar) {
                    hashMap = new HashMap(gVar.f2165n);
                }
                gVar.g(hashMap, equals);
                break;
            } else if (atomicReference2.get() != null) {
                break;
            }
        }
        ((W3.d) this.f1630h.get()).b();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        gVar.a();
        return this.f1624b.equals(gVar.f1624b);
    }

    public final int hashCode() {
        return this.f1624b.hashCode();
    }

    public final String toString() {
        l lVar = new l(this);
        lVar.j(this.f1624b, "name");
        lVar.j(this.f1625c, "options");
        return lVar.toString();
    }
}
