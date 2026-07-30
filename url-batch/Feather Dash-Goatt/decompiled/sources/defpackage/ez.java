package defpackage;

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
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.provider.FirebaseInitProvider;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class ez {
    public static final Object j = new Object();
    public static final s9 k = new s9(0);
    public final Context a;
    public final String b;
    public final oz c;
    public final ek d;
    public final be0 g;
    public final p01 h;
    public final AtomicBoolean e = new AtomicBoolean(false);
    public final AtomicBoolean f = new AtomicBoolean();
    public final CopyOnWriteArrayList i = new CopyOnWriteArrayList();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.List] */
    public ez(Context context, String str, oz ozVar) {
        ?? arrayList;
        int i = 0;
        new CopyOnWriteArrayList();
        this.a = context;
        y90.e(str);
        this.b = str;
        this.c = ozVar;
        ac acVar = FirebaseInitProvider.d;
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
            arrayList2.add(new zj(i, (String) it.next()));
        }
        Trace.endSection();
        Trace.beginSection("Runtime");
        uk1 uk1Var = uk1.d;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        arrayList3.addAll(arrayList2);
        int i2 = 1;
        arrayList3.add(new zj(i2, new FirebaseCommonRegistrar()));
        arrayList3.add(new zj(i2, new ExecutorsRegistrar()));
        arrayList4.add(mj.b(context, Context.class, new Class[0]));
        arrayList4.add(mj.b(this, ez.class, new Class[0]));
        arrayList4.add(mj.b(ozVar, oz.class, new Class[0]));
        a60 a60Var = new a60(17);
        if (((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked() && FirebaseInitProvider.e.get()) {
            arrayList4.add(mj.b(acVar, ac.class, new Class[0]));
        }
        uk1 uk1Var2 = uk1.d;
        ek ekVar = new ek();
        ekVar.d = new HashMap();
        ekVar.e = new HashMap();
        ekVar.g = new HashMap();
        ekVar.h = new HashSet();
        ekVar.j = new AtomicReference();
        dw dwVar = new dw();
        ekVar.i = dwVar;
        ekVar.k = a60Var;
        ArrayList arrayList5 = new ArrayList();
        arrayList5.add(mj.b(dwVar, dw.class, gf1.class, s01.class));
        arrayList5.add(mj.b(ekVar, ek.class, new Class[0]));
        int size = arrayList4.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList4.get(i3);
            i3++;
            mj mjVar = (mj) obj;
            if (mjVar != null) {
                arrayList5.add(mjVar);
            }
        }
        ArrayList arrayList6 = new ArrayList();
        int size2 = arrayList3.size();
        int i4 = 0;
        while (i4 < size2) {
            Object obj2 = arrayList3.get(i4);
            i4++;
            arrayList6.add(obj2);
        }
        ArrayList arrayList7 = new ArrayList();
        synchronized (ekVar) {
            Iterator it2 = arrayList6.iterator();
            while (it2.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((p01) it2.next()).get();
                    if (componentRegistrar != null) {
                        arrayList5.addAll(((a60) ekVar.k).b(componentRegistrar));
                        it2.remove();
                    }
                } catch (ta0 e) {
                    it2.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e);
                }
            }
            Iterator it3 = arrayList5.iterator();
            while (it3.hasNext()) {
                Object[] array = ((mj) it3.next()).b.toArray();
                int length = array.length;
                int i5 = 0;
                while (true) {
                    if (i5 < length) {
                        Object obj3 = array[i5];
                        if (obj3.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                            if (((HashSet) ekVar.h).contains(obj3.toString())) {
                                it3.remove();
                                break;
                            }
                            ((HashSet) ekVar.h).add(obj3.toString());
                        }
                        i5++;
                    }
                }
            }
            if (((HashMap) ekVar.d).isEmpty()) {
                uq1.A(arrayList5);
            } else {
                ArrayList arrayList8 = new ArrayList(((HashMap) ekVar.d).keySet());
                arrayList8.addAll(arrayList5);
                uq1.A(arrayList8);
            }
            int size3 = arrayList5.size();
            int i6 = 0;
            while (i6 < size3) {
                Object obj4 = arrayList5.get(i6);
                i6++;
                mj mjVar2 = (mj) obj4;
                ((HashMap) ekVar.d).put(mjVar2, new be0(new dk(ekVar, i, mjVar2)));
            }
            arrayList7.addAll(ekVar.i(arrayList5));
            arrayList7.addAll(ekVar.j());
            ekVar.h();
        }
        int size4 = arrayList7.size();
        while (i < size4) {
            Object obj5 = arrayList7.get(i);
            i++;
            ((Runnable) obj5).run();
        }
        Boolean bool = (Boolean) ((AtomicReference) ekVar.j).get();
        if (bool != null) {
            ekVar.g((HashMap) ekVar.d, bool.booleanValue());
        }
        this.d = ekVar;
        Trace.endSection();
        this.g = new be0(new dk(this, 2, context));
        this.h = ekVar.d(dq.class);
        bz bzVar = new bz(this);
        a();
        if (this.e.get()) {
            tc.i.d.get();
        }
        this.i.add(bzVar);
        Trace.endSection();
    }

    public static ez b() {
        ez ezVar;
        synchronized (j) {
            try {
                ezVar = (ez) k.get("[DEFAULT]");
                if (ezVar == null) {
                    StringBuilder sb = new StringBuilder("Default FirebaseApp is not initialized in this process ");
                    if (t90.a == null) {
                        t90.a = Application.getProcessName();
                    }
                    sb.append(t90.a);
                    sb.append(". Make sure to call FirebaseApp.initializeApp(Context) first.");
                    throw new IllegalStateException(sb.toString());
                }
                ((dq) ezVar.h.get()).b();
            } catch (Throwable th) {
                throw th;
            }
        }
        return ezVar;
    }

    public static ez e(Context context) {
        synchronized (j) {
            try {
                if (k.containsKey("[DEFAULT]")) {
                    return b();
                }
                oz a = oz.a(context);
                if (a == null) {
                    Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                    return null;
                }
                return f(context, a);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static ez f(Context context, oz ozVar) {
        ez ezVar;
        AtomicReference atomicReference = cz.a;
        if (context.getApplicationContext() instanceof Application) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference atomicReference2 = cz.a;
            if (atomicReference2.get() == null) {
                cz czVar = new cz();
                while (true) {
                    if (atomicReference2.compareAndSet(null, czVar)) {
                        tc.a(application);
                        tc tcVar = tc.i;
                        tcVar.getClass();
                        synchronized (tcVar) {
                            tcVar.g.add(czVar);
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
        synchronized (j) {
            s9 s9Var = k;
            String str = "FirebaseApp name [DEFAULT] already exists!";
            if (s9Var.containsKey("[DEFAULT]")) {
                throw new IllegalStateException(str);
            }
            y90.j(context, "Application context cannot be null.");
            ezVar = new ez(context, "[DEFAULT]", ozVar);
            s9Var.put("[DEFAULT]", ezVar);
        }
        ezVar.d();
        return ezVar;
    }

    public final void a() {
        if (this.f.get()) {
            dd0.j("FirebaseApp was deleted");
        }
    }

    public final String c() {
        StringBuilder sb = new StringBuilder();
        a();
        byte[] bytes = this.b.getBytes(Charset.defaultCharset());
        sb.append(bytes == null ? null : Base64.encodeToString(bytes, 11));
        sb.append("+");
        a();
        byte[] bytes2 = this.c.b.getBytes(Charset.defaultCharset());
        sb.append(bytes2 != null ? Base64.encodeToString(bytes2, 11) : null);
        return sb.toString();
    }

    public final void d() {
        HashMap hashMap;
        if (!((UserManager) this.a.getSystemService(UserManager.class)).isUserUnlocked()) {
            StringBuilder sb = new StringBuilder("Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ");
            a();
            sb.append(this.b);
            Log.i("FirebaseApp", sb.toString());
            Context context = this.a;
            AtomicReference atomicReference = dz.b;
            if (atomicReference.get() == null) {
                dz dzVar = new dz(context);
                while (!atomicReference.compareAndSet(null, dzVar)) {
                    if (atomicReference.get() != null) {
                        return;
                    }
                }
                context.registerReceiver(dzVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                return;
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder("Device unlocked: initializing all Firebase APIs for app ");
        a();
        sb2.append(this.b);
        Log.i("FirebaseApp", sb2.toString());
        ek ekVar = this.d;
        a();
        boolean equals = "[DEFAULT]".equals(this.b);
        AtomicReference atomicReference2 = (AtomicReference) ekVar.j;
        Boolean valueOf = Boolean.valueOf(equals);
        while (true) {
            if (atomicReference2.compareAndSet(null, valueOf)) {
                synchronized (ekVar) {
                    hashMap = new HashMap((HashMap) ekVar.d);
                }
                ekVar.g(hashMap, equals);
                break;
            } else if (atomicReference2.get() != null) {
                break;
            }
        }
        ((dq) this.h.get()).b();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ez)) {
            return false;
        }
        ez ezVar = (ez) obj;
        ezVar.a();
        return this.b.equals(ezVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        yw ywVar = new yw((Object) this);
        ywVar.g(this.b, "name");
        ywVar.g(this.c, "options");
        return ywVar.toString();
    }
}
