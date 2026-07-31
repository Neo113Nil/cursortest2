package m1;

import T0.ComponentCallbacks2C0168c;
import U0.t;
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
import p1.C0576a;
import p1.k;
import q.C0582b;
import u0.C0675e;
import y1.C0759c;
import y1.C0760d;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: j, reason: collision with root package name */
    public static final Object f5423j = new Object();

    /* renamed from: k, reason: collision with root package name */
    public static final C0582b f5424k = new C0582b();

    /* renamed from: a, reason: collision with root package name */
    public final Context f5425a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5426b;

    /* renamed from: c, reason: collision with root package name */
    public final i f5427c;

    /* renamed from: d, reason: collision with root package name */
    public final p1.d f5428d;

    /* renamed from: g, reason: collision with root package name */
    public final k f5431g;

    /* renamed from: h, reason: collision with root package name */
    public final A1.a f5432h;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f5429e = new AtomicBoolean(false);

    /* renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f5430f = new AtomicBoolean();

    /* renamed from: i, reason: collision with root package name */
    public final CopyOnWriteArrayList f5433i = new CopyOnWriteArrayList();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.List] */
    public g(Context context, String str, i iVar) {
        ?? arrayList;
        int i7 = 0;
        new CopyOnWriteArrayList();
        this.f5425a = context;
        t.c(str);
        this.f5426b = str;
        this.f5427c = iVar;
        C0520a c0520a = FirebaseInitProvider.f3912f;
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
            arrayList2.add(new B1.b(1, (String) it.next()));
        }
        Trace.endSection();
        Trace.beginSection("Runtime");
        q1.i iVar2 = q1.i.f5781f;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        arrayList3.addAll(arrayList2);
        int i8 = 2;
        arrayList3.add(new B1.b(i8, new FirebaseCommonRegistrar()));
        arrayList3.add(new B1.b(i8, new ExecutorsRegistrar()));
        arrayList4.add(C0576a.b(context, Context.class, new Class[0]));
        arrayList4.add(C0576a.b(this, g.class, new Class[0]));
        arrayList4.add(C0576a.b(iVar, i.class, new Class[0]));
        C0760d c0760d = new C0760d();
        if (z.e.a(context) && FirebaseInitProvider.f3913g.get()) {
            arrayList4.add(C0576a.b(c0520a, C0520a.class, new Class[0]));
        }
        p1.d dVar = new p1.d(arrayList3, arrayList4, c0760d);
        this.f5428d = dVar;
        Trace.endSection();
        this.f5431g = new k(new c(this, i7, context));
        this.f5432h = dVar.c(C0759c.class);
        d dVar2 = new d(this);
        a();
        if (this.f5429e.get()) {
            ComponentCallbacks2C0168c.f2272j.f2273f.get();
        }
        this.f5433i.add(dVar2);
        Trace.endSection();
    }

    public static g c() {
        g gVar;
        synchronized (f5423j) {
            try {
                gVar = (g) f5424k.getOrDefault("[DEFAULT]", null);
                if (gVar == null) {
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + Y0.b.a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
                ((C0759c) gVar.f5432h.get()).b();
            } catch (Throwable th) {
                throw th;
            }
        }
        return gVar;
    }

    public static g f(Context context) {
        synchronized (f5423j) {
            try {
                if (f5424k.containsKey("[DEFAULT]")) {
                    return c();
                }
                i a7 = i.a(context);
                if (a7 == null) {
                    Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                    return null;
                }
                return g(context, "[DEFAULT]", a7);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static g g(Context context, String str, i iVar) {
        g gVar;
        AtomicReference atomicReference = e.f5420a;
        if (context.getApplicationContext() instanceof Application) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference atomicReference2 = e.f5420a;
            if (atomicReference2.get() == null) {
                e eVar = new e();
                while (true) {
                    if (atomicReference2.compareAndSet(null, eVar)) {
                        ComponentCallbacks2C0168c.a(application);
                        ComponentCallbacks2C0168c componentCallbacks2C0168c = ComponentCallbacks2C0168c.f2272j;
                        componentCallbacks2C0168c.getClass();
                        synchronized (componentCallbacks2C0168c) {
                            componentCallbacks2C0168c.f2275h.add(eVar);
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
        synchronized (f5423j) {
            C0582b c0582b = f5424k;
            t.h("FirebaseApp name " + trim + " already exists!", !c0582b.containsKey(trim));
            t.g(context, "Application context cannot be null.");
            gVar = new g(context, trim, iVar);
            c0582b.put(trim, gVar);
        }
        gVar.e();
        return gVar;
    }

    public final void a() {
        t.h("FirebaseApp was deleted", !this.f5430f.get());
    }

    public final Object b(Class cls) {
        a();
        return this.f5428d.a(cls);
    }

    public final String d() {
        StringBuilder sb = new StringBuilder();
        a();
        byte[] bytes = this.f5426b.getBytes(Charset.defaultCharset());
        sb.append(bytes == null ? null : Base64.encodeToString(bytes, 11));
        sb.append("+");
        a();
        byte[] bytes2 = this.f5427c.f5440b.getBytes(Charset.defaultCharset());
        sb.append(bytes2 != null ? Base64.encodeToString(bytes2, 11) : null);
        return sb.toString();
    }

    public final void e() {
        HashMap hashMap;
        if (!z.e.a(this.f5425a)) {
            StringBuilder sb = new StringBuilder("Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ");
            a();
            sb.append(this.f5426b);
            Log.i("FirebaseApp", sb.toString());
            Context context = this.f5425a;
            AtomicReference atomicReference = f.f5421b;
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
        sb2.append(this.f5426b);
        Log.i("FirebaseApp", sb2.toString());
        p1.d dVar = this.f5428d;
        a();
        boolean equals = "[DEFAULT]".equals(this.f5426b);
        AtomicReference atomicReference2 = dVar.f5673k;
        Boolean valueOf = Boolean.valueOf(equals);
        while (true) {
            if (atomicReference2.compareAndSet(null, valueOf)) {
                synchronized (dVar) {
                    hashMap = new HashMap(dVar.f5668f);
                }
                dVar.g(hashMap, equals);
                break;
            } else if (atomicReference2.get() != null) {
                break;
            }
        }
        ((C0759c) this.f5432h.get()).b();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        gVar.a();
        return this.f5426b.equals(gVar.f5426b);
    }

    public final int hashCode() {
        return this.f5426b.hashCode();
    }

    public final String toString() {
        C0675e c0675e = new C0675e(this);
        c0675e.b(this.f5426b, "name");
        c0675e.b(this.f5427c, "options");
        return c0675e.toString();
    }
}
