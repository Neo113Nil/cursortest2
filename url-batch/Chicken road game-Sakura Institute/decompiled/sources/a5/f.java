package a5;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.Trace;
import android.util.Log;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.provider.FirebaseInitProvider;
import e5.i;
import f5.j;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import m4.o;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: i, reason: collision with root package name */
    public static final Object f497i = new Object();

    /* renamed from: j, reason: collision with root package name */
    public static final i.e f498j = new i.e(0);

    /* renamed from: a, reason: collision with root package name */
    public final Context f499a;

    /* renamed from: b, reason: collision with root package name */
    public final String f500b;

    /* renamed from: c, reason: collision with root package name */
    public final h f501c;

    /* renamed from: d, reason: collision with root package name */
    public final i f502d;

    /* renamed from: g, reason: collision with root package name */
    public final z5.b f505g;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f503e = new AtomicBoolean(false);

    /* renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f504f = new AtomicBoolean();

    /* renamed from: h, reason: collision with root package name */
    public final CopyOnWriteArrayList f506h = new CopyOnWriteArrayList();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.List] */
    public f(Context context, String str, h hVar) {
        ?? arrayList;
        final int i7 = 0;
        new CopyOnWriteArrayList();
        this.f499a = context;
        o.b(str);
        this.f500b = str;
        this.f501c = hVar;
        a aVar = FirebaseInitProvider.f1806f;
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
        for (final String str3 : arrayList) {
            arrayList2.add(new z5.b() { // from class: e5.e
                @Override // z5.b
                public final Object get() {
                    switch (i7) {
                        case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                            String str4 = (String) str3;
                            try {
                                Class<?> cls = Class.forName(str4);
                                if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                                    return (ComponentRegistrar) cls.getDeclaredConstructor(null).newInstance(null);
                                }
                                throw new o("Class " + str4 + " is not an instance of com.google.firebase.components.ComponentRegistrar");
                            } catch (ClassNotFoundException unused2) {
                                Log.w("ComponentDiscovery", "Class " + str4 + " is not an found.");
                                return null;
                            } catch (IllegalAccessException e9) {
                                throw new o(a0.m.j("Could not instantiate ", str4, "."), e9);
                            } catch (InstantiationException e10) {
                                throw new o(a0.m.j("Could not instantiate ", str4, "."), e10);
                            } catch (NoSuchMethodException e11) {
                                throw new o("Could not instantiate " + str4, e11);
                            } catch (InvocationTargetException e12) {
                                throw new o("Could not instantiate " + str4, e12);
                            }
                        default:
                            return (ComponentRegistrar) str3;
                    }
                }
            });
        }
        Trace.endSection();
        Trace.beginSection("Runtime");
        j jVar = j.f3393f;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        arrayList3.addAll(arrayList2);
        final FirebaseCommonRegistrar firebaseCommonRegistrar = new FirebaseCommonRegistrar();
        final int i8 = 1;
        arrayList3.add(new z5.b() { // from class: e5.e
            @Override // z5.b
            public final Object get() {
                switch (i8) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        String str4 = (String) firebaseCommonRegistrar;
                        try {
                            Class<?> cls = Class.forName(str4);
                            if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                                return (ComponentRegistrar) cls.getDeclaredConstructor(null).newInstance(null);
                            }
                            throw new o("Class " + str4 + " is not an instance of com.google.firebase.components.ComponentRegistrar");
                        } catch (ClassNotFoundException unused2) {
                            Log.w("ComponentDiscovery", "Class " + str4 + " is not an found.");
                            return null;
                        } catch (IllegalAccessException e9) {
                            throw new o(a0.m.j("Could not instantiate ", str4, "."), e9);
                        } catch (InstantiationException e10) {
                            throw new o(a0.m.j("Could not instantiate ", str4, "."), e10);
                        } catch (NoSuchMethodException e11) {
                            throw new o("Could not instantiate " + str4, e11);
                        } catch (InvocationTargetException e12) {
                            throw new o("Could not instantiate " + str4, e12);
                        }
                    default:
                        return (ComponentRegistrar) firebaseCommonRegistrar;
                }
            }
        });
        final ExecutorsRegistrar executorsRegistrar = new ExecutorsRegistrar();
        arrayList3.add(new z5.b() { // from class: e5.e
            @Override // z5.b
            public final Object get() {
                switch (i8) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        String str4 = (String) executorsRegistrar;
                        try {
                            Class<?> cls = Class.forName(str4);
                            if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                                return (ComponentRegistrar) cls.getDeclaredConstructor(null).newInstance(null);
                            }
                            throw new o("Class " + str4 + " is not an instance of com.google.firebase.components.ComponentRegistrar");
                        } catch (ClassNotFoundException unused2) {
                            Log.w("ComponentDiscovery", "Class " + str4 + " is not an found.");
                            return null;
                        } catch (IllegalAccessException e9) {
                            throw new o(a0.m.j("Could not instantiate ", str4, "."), e9);
                        } catch (InstantiationException e10) {
                            throw new o(a0.m.j("Could not instantiate ", str4, "."), e10);
                        } catch (NoSuchMethodException e11) {
                            throw new o("Could not instantiate " + str4, e11);
                        } catch (InvocationTargetException e12) {
                            throw new o("Could not instantiate " + str4, e12);
                        }
                    default:
                        return (ComponentRegistrar) executorsRegistrar;
                }
            }
        });
        arrayList4.add(e5.c.b(context, Context.class, new Class[0]));
        arrayList4.add(e5.c.b(this, f.class, new Class[0]));
        arrayList4.add(e5.c.b(hVar, h.class, new Class[0]));
        m4.f fVar = new m4.f();
        if (x2.h.a(context) && FirebaseInitProvider.f1807g.get()) {
            arrayList4.add(e5.c.b(aVar, a.class, new Class[0]));
        }
        i iVar = new i(arrayList3, arrayList4, fVar);
        this.f502d = iVar;
        Trace.endSection();
        this.f505g = iVar.e(y5.b.class);
        a(new c() { // from class: a5.b
            @Override // a5.c
            public final void a(boolean z8) {
                if (z8) {
                    return;
                }
                ((y5.b) f.this.f505g.get()).a();
            }
        });
        Trace.endSection();
    }

    public static f c() {
        f fVar;
        synchronized (f497i) {
            try {
                fVar = (f) f498j.get("[DEFAULT]");
                if (fVar == null) {
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + j1.c.Z() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
                ((y5.b) fVar.f505g.get()).a();
            } catch (Throwable th) {
                throw th;
            }
        }
        return fVar;
    }

    public static f e(Context context) {
        synchronized (f497i) {
            try {
                if (f498j.containsKey("[DEFAULT]")) {
                    return c();
                }
                h a3 = h.a(context);
                if (a3 == null) {
                    Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                    return null;
                }
                return f(context, a3);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static f f(Context context, h hVar) {
        f fVar;
        AtomicReference atomicReference = d.f494a;
        if (context.getApplicationContext() instanceof Application) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference atomicReference2 = d.f494a;
            if (atomicReference2.get() == null) {
                d dVar = new d();
                while (true) {
                    if (atomicReference2.compareAndSet(null, dVar)) {
                        l4.c.a(application);
                        l4.c cVar = l4.c.f5950j;
                        cVar.getClass();
                        synchronized (cVar) {
                            cVar.f5953h.add(dVar);
                        }
                        break;
                    }
                    if (atomicReference2.get() != null) {
                        break;
                    }
                }
            }
        }
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f497i) {
            i.e eVar = f498j;
            String str = "FirebaseApp name [DEFAULT] already exists!";
            if (eVar.containsKey("[DEFAULT]")) {
                throw new IllegalStateException(String.valueOf(str));
            }
            o.e(context, "Application context cannot be null.");
            fVar = new f(context, "[DEFAULT]", hVar);
            eVar.put("[DEFAULT]", fVar);
        }
        fVar.d();
        return fVar;
    }

    public final void a(c cVar) {
        b();
        if (this.f503e.get() && l4.c.f5950j.f5951f.get()) {
            cVar.a(true);
        }
        this.f506h.add(cVar);
    }

    public final void b() {
        if (this.f504f.get()) {
            throw new IllegalStateException("FirebaseApp was deleted");
        }
    }

    public final void d() {
        HashMap hashMap;
        if (!x2.h.a(this.f499a)) {
            StringBuilder sb = new StringBuilder("Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ");
            b();
            sb.append(this.f500b);
            Log.i("FirebaseApp", sb.toString());
            Context context = this.f499a;
            AtomicReference atomicReference = e.f495b;
            if (atomicReference.get() == null) {
                e eVar = new e(context);
                while (!atomicReference.compareAndSet(null, eVar)) {
                    if (atomicReference.get() != null) {
                        return;
                    }
                }
                context.registerReceiver(eVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                return;
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder("Device unlocked: initializing all Firebase APIs for app ");
        b();
        sb2.append(this.f500b);
        Log.i("FirebaseApp", sb2.toString());
        i iVar = this.f502d;
        b();
        boolean equals = "[DEFAULT]".equals(this.f500b);
        AtomicReference atomicReference2 = iVar.f2778f;
        Boolean valueOf = Boolean.valueOf(equals);
        while (true) {
            if (atomicReference2.compareAndSet(null, valueOf)) {
                synchronized (iVar) {
                    hashMap = new HashMap(iVar.f2773a);
                }
                iVar.i(hashMap, equals);
                break;
            } else if (atomicReference2.get() != null) {
                break;
            }
        }
        ((y5.b) this.f505g.get()).a();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        fVar.b();
        return this.f500b.equals(fVar.f500b);
    }

    public final int hashCode() {
        return this.f500b.hashCode();
    }

    public final String toString() {
        androidx.room.c cVar = new androidx.room.c((Object) this);
        cVar.l(this.f500b, "name");
        cVar.l(this.f501c, "options");
        return cVar.toString();
    }
}
