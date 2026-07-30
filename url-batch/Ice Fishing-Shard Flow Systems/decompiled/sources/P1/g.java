package P1;

import S1.n;
import T1.k;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.Trace;
import android.os.UserManager;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.provider.FirebaseInitProvider;
import e2.InterfaceC0372a;
import j2.C0569a;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import s1.ComponentCallbacks2C0872c;
import t1.u;
import u.C0933d;
import u.C0934e;
import x1.AbstractC1000b;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: k, reason: collision with root package name */
    public static final Object f2268k = new Object();

    /* renamed from: l, reason: collision with root package name */
    public static final C0934e f2269l = new C0934e(0);

    /* renamed from: a, reason: collision with root package name */
    public final Context f2270a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2271b;

    /* renamed from: c, reason: collision with root package name */
    public final h f2272c;

    /* renamed from: d, reason: collision with root package name */
    public final S1.g f2273d;

    /* renamed from: g, reason: collision with root package name */
    public final n f2276g;

    /* renamed from: h, reason: collision with root package name */
    public final InterfaceC0372a f2277h;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f2274e = new AtomicBoolean(false);

    /* renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f2275f = new AtomicBoolean();

    /* renamed from: i, reason: collision with root package name */
    public final CopyOnWriteArrayList f2278i = new CopyOnWriteArrayList();
    public final CopyOnWriteArrayList j = new CopyOnWriteArrayList();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.List] */
    public g(h hVar, Context context, String str) {
        ?? arrayList;
        int i2 = 0;
        this.f2270a = context;
        u.c(str);
        this.f2271b = str;
        this.f2272c = hVar;
        a aVar = FirebaseInitProvider.f4539d;
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
            arrayList2.add(new S1.d(i2, (String) it.next()));
        }
        Trace.endSection();
        Trace.beginSection("Runtime");
        k kVar = k.f2597d;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        arrayList3.addAll(arrayList2);
        int i5 = 1;
        arrayList3.add(new S1.d(i5, new FirebaseCommonRegistrar()));
        arrayList3.add(new S1.d(i5, new ExecutorsRegistrar()));
        arrayList4.add(S1.b.b(context, Context.class, new Class[0]));
        arrayList4.add(S1.b.b(this, g.class, new Class[0]));
        arrayList4.add(S1.b.b(hVar, h.class, new Class[0]));
        q1.h hVar2 = new q1.h(24);
        if (((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked() && FirebaseInitProvider.f4540e.get()) {
            arrayList4.add(S1.b.b(aVar, a.class, new Class[0]));
        }
        S1.g gVar = new S1.g(arrayList3, arrayList4, hVar2);
        this.f2273d = gVar;
        Trace.endSection();
        this.f2276g = new n(new c(this, i2, context));
        this.f2277h = gVar.e(c2.d.class);
        d dVar = new d(this);
        a();
        if (this.f2274e.get()) {
            ComponentCallbacks2C0872c.f7638m.f7639d.get();
        }
        this.f2278i.add(dVar);
        Trace.endSection();
    }

    public static ArrayList d() {
        ArrayList arrayList = new ArrayList();
        synchronized (f2268k) {
            try {
                Iterator it = ((C0933d) f2269l.values()).iterator();
                while (it.hasNext()) {
                    g gVar = (g) it.next();
                    gVar.a();
                    arrayList.add(gVar.f2271b);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static g e() {
        g gVar;
        synchronized (f2268k) {
            try {
                gVar = (g) f2269l.get("[DEFAULT]");
                if (gVar == null) {
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + AbstractC1000b.a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
                ((c2.d) gVar.f2277h.get()).b();
            } catch (Throwable th) {
                throw th;
            }
        }
        return gVar;
    }

    public static g f(String str) {
        g gVar;
        String str2;
        synchronized (f2268k) {
            try {
                gVar = (g) f2269l.get(str.trim());
                if (gVar == null) {
                    ArrayList d7 = d();
                    if (d7.isEmpty()) {
                        str2 = "";
                    } else {
                        str2 = "Available app names: " + TextUtils.join(", ", d7);
                    }
                    throw new IllegalStateException("FirebaseApp with name " + str + " doesn't exist. " + str2);
                }
                ((c2.d) gVar.f2277h.get()).b();
            } finally {
            }
        }
        return gVar;
    }

    public static g i(h hVar, Context context, String str) {
        g gVar;
        AtomicReference atomicReference = e.f2265a;
        if (context.getApplicationContext() instanceof Application) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference atomicReference2 = e.f2265a;
            if (atomicReference2.get() == null) {
                e eVar = new e();
                while (true) {
                    if (atomicReference2.compareAndSet(null, eVar)) {
                        ComponentCallbacks2C0872c.a(application);
                        ComponentCallbacks2C0872c componentCallbacks2C0872c = ComponentCallbacks2C0872c.f7638m;
                        componentCallbacks2C0872c.getClass();
                        synchronized (componentCallbacks2C0872c) {
                            componentCallbacks2C0872c.f7641i.add(eVar);
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
        synchronized (f2268k) {
            C0934e c0934e = f2269l;
            u.h("FirebaseApp name " + trim + " already exists!", !c0934e.containsKey(trim));
            u.g(context, "Application context cannot be null.");
            gVar = new g(hVar, context, trim);
            c0934e.put(trim, gVar);
        }
        gVar.h();
        return gVar;
    }

    public static g j(Context context) {
        synchronized (f2268k) {
            try {
                if (f2269l.containsKey("[DEFAULT]")) {
                    return e();
                }
                h a7 = h.a(context);
                if (a7 == null) {
                    Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                    return null;
                }
                return i(a7, context, "[DEFAULT]");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a() {
        u.h("FirebaseApp was deleted", !this.f2275f.get());
    }

    public final void b() {
        if (this.f2275f.compareAndSet(false, true)) {
            synchronized (f2268k) {
                f2269l.remove(this.f2271b);
            }
            Iterator it = this.j.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new ClassCastException();
            }
        }
    }

    public final Object c(Class cls) {
        a();
        return this.f2273d.a(cls);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        gVar.a();
        return this.f2271b.equals(gVar.f2271b);
    }

    public final String g() {
        StringBuilder sb = new StringBuilder();
        a();
        byte[] bytes = this.f2271b.getBytes(Charset.defaultCharset());
        sb.append(bytes == null ? null : Base64.encodeToString(bytes, 11));
        sb.append("+");
        a();
        byte[] bytes2 = this.f2272c.f2280b.getBytes(Charset.defaultCharset());
        sb.append(bytes2 != null ? Base64.encodeToString(bytes2, 11) : null);
        return sb.toString();
    }

    public final void h() {
        HashMap hashMap;
        if (!((UserManager) this.f2270a.getSystemService(UserManager.class)).isUserUnlocked()) {
            StringBuilder sb = new StringBuilder("Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ");
            a();
            sb.append(this.f2271b);
            Log.i("FirebaseApp", sb.toString());
            Context context = this.f2270a;
            AtomicReference atomicReference = f.f2266b;
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
        sb2.append(this.f2271b);
        Log.i("FirebaseApp", sb2.toString());
        S1.g gVar = this.f2273d;
        a();
        boolean equals = "[DEFAULT]".equals(this.f2271b);
        AtomicReference atomicReference2 = gVar.f2481f;
        Boolean valueOf = Boolean.valueOf(equals);
        while (true) {
            if (atomicReference2.compareAndSet(null, valueOf)) {
                synchronized (gVar) {
                    hashMap = new HashMap(gVar.f2476a);
                }
                gVar.g(hashMap, equals);
                break;
            } else if (atomicReference2.get() != null) {
                break;
            }
        }
        ((c2.d) this.f2277h.get()).b();
    }

    public final int hashCode() {
        return this.f2271b.hashCode();
    }

    public final void k(boolean z7) {
        Log.d("FirebaseApp", "Notifying background state change listeners.");
        Iterator it = this.f2278i.iterator();
        while (it.hasNext()) {
            g gVar = ((d) it.next()).f2264a;
            if (!z7) {
                ((c2.d) gVar.f2277h.get()).b();
            }
        }
    }

    public final void l(Boolean bool) {
        a();
        C0569a c0569a = (C0569a) this.f2276g.get();
        synchronized (c0569a) {
            try {
                if (bool == null) {
                    c0569a.f5949b.edit().remove("firebase_data_collection_default_enabled").apply();
                    c0569a.b(c0569a.a());
                } else {
                    boolean equals = Boolean.TRUE.equals(bool);
                    c0569a.f5949b.edit().putBoolean("firebase_data_collection_default_enabled", equals).apply();
                    c0569a.b(equals);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String toString() {
        P0.e eVar = new P0.e((Object) this);
        eVar.l(this.f2271b, "name");
        eVar.l(this.f2272c, "options");
        return eVar.toString();
    }
}
