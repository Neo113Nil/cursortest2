package g8;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.Trace;
import android.os.UserManager;
import android.util.Base64;
import android.util.Log;
import c7.c0;
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
import l8.n;
import m8.k;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class g {
    public static final Object j = new Object();

    /* renamed from: k, reason: collision with root package name */
    public static final s.e f4299k = new s.e(0);

    /* renamed from: a, reason: collision with root package name */
    public final Context f4300a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4301b;

    /* renamed from: c, reason: collision with root package name */
    public final i f4302c;

    /* renamed from: d, reason: collision with root package name */
    public final l8.g f4303d;
    public final n g;

    /* renamed from: h, reason: collision with root package name */
    public final w8.a f4306h;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f4304e = new AtomicBoolean(false);

    /* renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f4305f = new AtomicBoolean();

    /* renamed from: i, reason: collision with root package name */
    public final CopyOnWriteArrayList f4307i = new CopyOnWriteArrayList();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.List] */
    public g(Context context, i iVar, String str) {
        ?? arrayList;
        int i3 = 0;
        new CopyOnWriteArrayList();
        this.f4300a = context;
        c0.d(str);
        this.f4301b = str;
        this.f4302c = iVar;
        a aVar = FirebaseInitProvider.f3192d;
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
            arrayList2.add(new l8.d(i3, (String) it.next()));
        }
        Trace.endSection();
        Trace.beginSection("Runtime");
        k kVar = k.f6608d;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        arrayList3.addAll(arrayList2);
        int i10 = 1;
        arrayList3.add(new l8.d(i10, new FirebaseCommonRegistrar()));
        arrayList3.add(new l8.d(i10, new ExecutorsRegistrar()));
        arrayList4.add(l8.b.c(context, Context.class, new Class[0]));
        arrayList4.add(l8.b.c(this, g.class, new Class[0]));
        arrayList4.add(l8.b.c(iVar, i.class, new Class[0]));
        u8.d dVar = new u8.d(23);
        if (((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked() && FirebaseInitProvider.f3193e.get()) {
            arrayList4.add(l8.b.c(aVar, a.class, new Class[0]));
        }
        l8.g gVar = new l8.g(arrayList3, arrayList4, dVar);
        this.f4303d = gVar;
        Trace.endSection();
        this.g = new n(new c(i3, this, context));
        this.f4306h = gVar.f(u8.c.class);
        d dVar2 = new d(this);
        a();
        if (this.f4304e.get()) {
            b7.c.f1252s.f1253d.get();
        }
        this.f4307i.add(dVar2);
        Trace.endSection();
    }

    public static g c() {
        g gVar;
        synchronized (j) {
            try {
                gVar = (g) f4299k.get("[DEFAULT]");
                if (gVar == null) {
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + g7.b.a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
                ((u8.c) gVar.f4306h.get()).b();
            } catch (Throwable th) {
                throw th;
            }
        }
        return gVar;
    }

    public static g f(Context context) {
        synchronized (j) {
            try {
                if (f4299k.containsKey("[DEFAULT]")) {
                    return c();
                }
                i a9 = i.a(context);
                if (a9 == null) {
                    Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                    return null;
                }
                return g(context, a9, "[DEFAULT]");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static g g(Context context, i iVar, String str) {
        g gVar;
        AtomicReference atomicReference = e.f4296a;
        if (context.getApplicationContext() instanceof Application) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference atomicReference2 = e.f4296a;
            if (atomicReference2.get() == null) {
                e eVar = new e();
                while (true) {
                    if (atomicReference2.compareAndSet(null, eVar)) {
                        b7.c.a(application);
                        b7.c cVar = b7.c.f1252s;
                        cVar.getClass();
                        synchronized (cVar) {
                            cVar.f1255i.add(eVar);
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
        synchronized (j) {
            s.e eVar2 = f4299k;
            c0.i("FirebaseApp name " + trim + " already exists!", !eVar2.containsKey(trim));
            c0.h(context, "Application context cannot be null.");
            gVar = new g(context, iVar, trim);
            eVar2.put(trim, gVar);
        }
        gVar.e();
        return gVar;
    }

    public final void a() {
        c0.i("FirebaseApp was deleted", !this.f4305f.get());
    }

    public final Object b(Class cls) {
        a();
        return this.f4303d.a(cls);
    }

    public final String d() {
        StringBuilder sb2 = new StringBuilder();
        a();
        byte[] bytes = this.f4301b.getBytes(Charset.defaultCharset());
        sb2.append(bytes == null ? null : Base64.encodeToString(bytes, 11));
        sb2.append("+");
        a();
        byte[] bytes2 = this.f4302c.f4314b.getBytes(Charset.defaultCharset());
        sb2.append(bytes2 != null ? Base64.encodeToString(bytes2, 11) : null);
        return sb2.toString();
    }

    public final void e() {
        HashMap hashMap;
        if (!((UserManager) this.f4300a.getSystemService(UserManager.class)).isUserUnlocked()) {
            StringBuilder sb2 = new StringBuilder("Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ");
            a();
            sb2.append(this.f4301b);
            Log.i("FirebaseApp", sb2.toString());
            Context context = this.f4300a;
            AtomicReference atomicReference = f.f4297b;
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
        StringBuilder sb3 = new StringBuilder("Device unlocked: initializing all Firebase APIs for app ");
        a();
        sb3.append(this.f4301b);
        Log.i("FirebaseApp", sb3.toString());
        l8.g gVar = this.f4303d;
        a();
        boolean equals = "[DEFAULT]".equals(this.f4301b);
        AtomicReference atomicReference2 = gVar.f5913t;
        Boolean valueOf = Boolean.valueOf(equals);
        while (true) {
            if (atomicReference2.compareAndSet(null, valueOf)) {
                synchronized (gVar) {
                    hashMap = new HashMap(gVar.f5908d);
                }
                gVar.b(hashMap, equals);
                break;
            } else if (atomicReference2.get() != null) {
                break;
            }
        }
        ((u8.c) this.f4306h.get()).b();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        gVar.a();
        return this.f4301b.equals(gVar.f4301b);
    }

    public final int hashCode() {
        return this.f4301b.hashCode();
    }

    public final String toString() {
        c6.e eVar = new c6.e((Object) this);
        eVar.e(this.f4301b, "name");
        eVar.e(this.f4302c, "options");
        return eVar.toString();
    }
}
