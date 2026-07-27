package V1;

import A.AbstractC0017m;
import E1.i;
import H1.o;
import a.AbstractC0345a;
import a2.EnumC0421j;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.Trace;
import android.util.Log;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.provider.FirebaseInitProvider;
import i.C0670e;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import t2.C1205b;
import u2.InterfaceC1229b;
import y.t;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: i, reason: collision with root package name */
    public static final Object f4163i = new Object();

    /* renamed from: j, reason: collision with root package name */
    public static final C0670e f4164j = new C0670e(0);

    /* renamed from: a, reason: collision with root package name */
    public final Context f4165a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4166b;

    /* renamed from: c, reason: collision with root package name */
    public final h f4167c;

    /* renamed from: d, reason: collision with root package name */
    public final Z1.h f4168d;

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC1229b f4171g;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f4169e = new AtomicBoolean(false);

    /* renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f4170f = new AtomicBoolean();

    /* renamed from: h, reason: collision with root package name */
    public final CopyOnWriteArrayList f4172h = new CopyOnWriteArrayList();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.List] */
    public f(Context context, String str, h hVar) {
        ?? arrayList;
        final int i2 = 1;
        final int i4 = 0;
        new CopyOnWriteArrayList();
        this.f4165a = context;
        o.b(str);
        this.f4166b = str;
        this.f4167c = hVar;
        a aVar = FirebaseInitProvider.f6061d;
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
        for (final String str3 : arrayList) {
            arrayList2.add(new InterfaceC1229b() { // from class: Z1.d
                @Override // u2.InterfaceC1229b
                public final Object get() {
                    switch (i4) {
                        case 0:
                            String str4 = (String) str3;
                            try {
                                Class<?> cls = Class.forName(str4);
                                if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                                    return (ComponentRegistrar) cls.getDeclaredConstructor(null).newInstance(null);
                                }
                                throw new n("Class " + str4 + " is not an instance of com.google.firebase.components.ComponentRegistrar");
                            } catch (ClassNotFoundException unused2) {
                                Log.w("ComponentDiscovery", "Class " + str4 + " is not an found.");
                                return null;
                            } catch (IllegalAccessException e4) {
                                throw new n(AbstractC0017m.j("Could not instantiate ", str4, "."), e4);
                            } catch (InstantiationException e5) {
                                throw new n(AbstractC0017m.j("Could not instantiate ", str4, "."), e5);
                            } catch (NoSuchMethodException e6) {
                                throw new n("Could not instantiate " + str4, e6);
                            } catch (InvocationTargetException e7) {
                                throw new n("Could not instantiate " + str4, e7);
                            }
                        default:
                            return (ComponentRegistrar) str3;
                    }
                }
            });
        }
        Trace.endSection();
        Trace.beginSection("Runtime");
        EnumC0421j enumC0421j = EnumC0421j.f4935d;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        arrayList3.addAll(arrayList2);
        final FirebaseCommonRegistrar firebaseCommonRegistrar = new FirebaseCommonRegistrar();
        arrayList3.add(new InterfaceC1229b() { // from class: Z1.d
            @Override // u2.InterfaceC1229b
            public final Object get() {
                switch (i2) {
                    case 0:
                        String str4 = (String) firebaseCommonRegistrar;
                        try {
                            Class<?> cls = Class.forName(str4);
                            if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                                return (ComponentRegistrar) cls.getDeclaredConstructor(null).newInstance(null);
                            }
                            throw new n("Class " + str4 + " is not an instance of com.google.firebase.components.ComponentRegistrar");
                        } catch (ClassNotFoundException unused2) {
                            Log.w("ComponentDiscovery", "Class " + str4 + " is not an found.");
                            return null;
                        } catch (IllegalAccessException e4) {
                            throw new n(AbstractC0017m.j("Could not instantiate ", str4, "."), e4);
                        } catch (InstantiationException e5) {
                            throw new n(AbstractC0017m.j("Could not instantiate ", str4, "."), e5);
                        } catch (NoSuchMethodException e6) {
                            throw new n("Could not instantiate " + str4, e6);
                        } catch (InvocationTargetException e7) {
                            throw new n("Could not instantiate " + str4, e7);
                        }
                    default:
                        return (ComponentRegistrar) firebaseCommonRegistrar;
                }
            }
        });
        final ExecutorsRegistrar executorsRegistrar = new ExecutorsRegistrar();
        arrayList3.add(new InterfaceC1229b() { // from class: Z1.d
            @Override // u2.InterfaceC1229b
            public final Object get() {
                switch (i2) {
                    case 0:
                        String str4 = (String) executorsRegistrar;
                        try {
                            Class<?> cls = Class.forName(str4);
                            if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                                return (ComponentRegistrar) cls.getDeclaredConstructor(null).newInstance(null);
                            }
                            throw new n("Class " + str4 + " is not an instance of com.google.firebase.components.ComponentRegistrar");
                        } catch (ClassNotFoundException unused2) {
                            Log.w("ComponentDiscovery", "Class " + str4 + " is not an found.");
                            return null;
                        } catch (IllegalAccessException e4) {
                            throw new n(AbstractC0017m.j("Could not instantiate ", str4, "."), e4);
                        } catch (InstantiationException e5) {
                            throw new n(AbstractC0017m.j("Could not instantiate ", str4, "."), e5);
                        } catch (NoSuchMethodException e6) {
                            throw new n("Could not instantiate " + str4, e6);
                        } catch (InvocationTargetException e7) {
                            throw new n("Could not instantiate " + str4, e7);
                        }
                    default:
                        return (ComponentRegistrar) executorsRegistrar;
                }
            }
        });
        arrayList4.add(Z1.b.b(context, Context.class, new Class[0]));
        arrayList4.add(Z1.b.b(this, f.class, new Class[0]));
        arrayList4.add(Z1.b.b(hVar, h.class, new Class[0]));
        i iVar = new i(23);
        if (X0.h.a(context) && FirebaseInitProvider.f6062e.get()) {
            arrayList4.add(Z1.b.b(aVar, a.class, new Class[0]));
        }
        Z1.h hVar2 = new Z1.h(arrayList3, arrayList4, iVar);
        this.f4168d = hVar2;
        Trace.endSection();
        this.f4171g = hVar2.b(C1205b.class);
        a(new c() { // from class: V1.b
            @Override // V1.c
            public final void a(boolean z4) {
                f fVar = f.this;
                if (z4) {
                    fVar.getClass();
                } else {
                    ((C1205b) fVar.f4171g.get()).a();
                }
            }
        });
        Trace.endSection();
    }

    public static f c() {
        f fVar;
        synchronized (f4163i) {
            try {
                fVar = (f) f4164j.get("[DEFAULT]");
                if (fVar == null) {
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + AbstractC0345a.w() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
                ((C1205b) fVar.f4171g.get()).a();
            } catch (Throwable th) {
                throw th;
            }
        }
        return fVar;
    }

    public static f e(Context context) {
        synchronized (f4163i) {
            try {
                if (f4164j.containsKey("[DEFAULT]")) {
                    return c();
                }
                h a4 = h.a(context);
                if (a4 == null) {
                    Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                    return null;
                }
                return f(context, a4);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static f f(Context context, h hVar) {
        f fVar;
        AtomicReference atomicReference = d.f4160a;
        if (context.getApplicationContext() instanceof Application) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference atomicReference2 = d.f4160a;
            if (atomicReference2.get() == null) {
                d dVar = new d();
                while (true) {
                    if (atomicReference2.compareAndSet(null, dVar)) {
                        G1.c.a(application);
                        G1.c cVar = G1.c.f3101k;
                        cVar.getClass();
                        synchronized (cVar) {
                            cVar.f3104i.add(dVar);
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
        synchronized (f4163i) {
            C0670e c0670e = f4164j;
            String str = "FirebaseApp name [DEFAULT] already exists!";
            if (c0670e.containsKey("[DEFAULT]")) {
                throw new IllegalStateException(String.valueOf(str));
            }
            o.e(context, "Application context cannot be null.");
            fVar = new f(context, "[DEFAULT]", hVar);
            c0670e.put("[DEFAULT]", fVar);
        }
        fVar.d();
        return fVar;
    }

    public final void a(c cVar) {
        b();
        if (this.f4169e.get() && G1.c.f3101k.f3102d.get()) {
            cVar.a(true);
        }
        this.f4172h.add(cVar);
    }

    public final void b() {
        if (this.f4170f.get()) {
            throw new IllegalStateException("FirebaseApp was deleted");
        }
    }

    public final void d() {
        HashMap hashMap;
        if (!X0.h.a(this.f4165a)) {
            StringBuilder sb = new StringBuilder("Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ");
            b();
            sb.append(this.f4166b);
            Log.i("FirebaseApp", sb.toString());
            Context context = this.f4165a;
            AtomicReference atomicReference = e.f4161b;
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
        sb2.append(this.f4166b);
        Log.i("FirebaseApp", sb2.toString());
        Z1.h hVar = this.f4168d;
        b();
        boolean equals = "[DEFAULT]".equals(this.f4166b);
        AtomicReference atomicReference2 = hVar.f4579f;
        Boolean valueOf = Boolean.valueOf(equals);
        while (true) {
            if (atomicReference2.compareAndSet(null, valueOf)) {
                synchronized (hVar) {
                    hashMap = new HashMap(hVar.f4574a);
                }
                hVar.i(hashMap, equals);
                break;
            } else if (atomicReference2.get() != null) {
                break;
            }
        }
        ((C1205b) this.f4171g.get()).a();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        fVar.b();
        return this.f4166b.equals(fVar.f4166b);
    }

    public final int hashCode() {
        return this.f4166b.hashCode();
    }

    public final String toString() {
        t tVar = new t((Object) this);
        tVar.h(this.f4166b, "name");
        tVar.h(this.f4167c, "options");
        return tVar.toString();
    }
}
