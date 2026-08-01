package c6;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.database.Cursor;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.work.impl.WorkDatabase_Impl;
import c2.c0;
import c2.g0;
import c2.m1;
import com.google.android.datatransport.cct.CctBackendFactory;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.collections.i0;
import kotlin.collections.z;
import kotlin.jvm.functions.Function2;
import n0.e0;
import te.k0;
import te.y0;
import te.z0;
import z4.w;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public class s implements ee.k, n0.f, m6.b, z0, OnCompleteListener {

    /* renamed from: d, reason: collision with root package name */
    public Object f1868d;

    /* renamed from: e, reason: collision with root package name */
    public Object f1869e;

    public s(IBinder iBinder) {
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if (Objects.equals(interfaceDescriptor, "android.os.IMessenger")) {
            this.f1868d = new Messenger(iBinder);
            this.f1869e = null;
        } else {
            if (!Objects.equals(interfaceDescriptor, "com.google.android.gms.iid.IMessengerCompat")) {
                Log.w("MessengerIpcClient", "Invalid interface descriptor: ".concat(String.valueOf(interfaceDescriptor)));
                throw new RemoteException();
            }
            this.f1869e = new y6.f(iBinder);
            this.f1868d = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [d1.k] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [d1.k] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [o0.e] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [o0.e] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public static void b(g0 g0Var) {
        if (g0Var.f1547c0 > 0) {
            if (g0Var.T.f1596d == c0.f1509s && !g0Var.n() && !g0Var.p() && !g0Var.f1549d0 && g0Var.F()) {
                d1.k kVar = (d1.k) g0Var.S.g;
                if ((kVar.f3308r & 256) != 0) {
                    while (kVar != null) {
                        if ((kVar.f3307i & 256) != 0) {
                            c2.j jVar = kVar;
                            ?? r52 = 0;
                            while (jVar != 0) {
                                if (jVar instanceof c2.m) {
                                    c2.m mVar = (c2.m) jVar;
                                    mVar.t(c2.k.s(mVar, 256));
                                } else if ((jVar.f3307i & 256) != 0 && (jVar instanceof c2.j)) {
                                    d1.k kVar2 = jVar.D;
                                    int i3 = 0;
                                    jVar = jVar;
                                    r52 = r52;
                                    while (kVar2 != null) {
                                        if ((kVar2.f3307i & 256) != 0) {
                                            i3++;
                                            r52 = r52;
                                            if (i3 == 1) {
                                                jVar = kVar2;
                                            } else {
                                                if (r52 == 0) {
                                                    r52 = new o0.e(new d1.k[16]);
                                                }
                                                if (jVar != 0) {
                                                    r52.b(jVar);
                                                    jVar = 0;
                                                }
                                                r52.b(kVar2);
                                            }
                                        }
                                        kVar2 = kVar2.f3310t;
                                        jVar = jVar;
                                        r52 = r52;
                                    }
                                    if (i3 == 1) {
                                    }
                                }
                                jVar = c2.k.e(r52);
                            }
                        }
                        if ((kVar.f3308r & 256) == 0) {
                            break;
                        } else {
                            kVar = kVar.f3310t;
                        }
                    }
                }
            }
            g0Var.f1546b0 = false;
            o0.e w6 = g0Var.w();
            Object[] objArr = w6.f7317d;
            int i10 = w6.f7319i;
            for (int i11 = 0; i11 < i10; i11++) {
                b((g0) objArr[i11]);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0017, code lost:
    
        if (r4 < r1) goto L6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a() {
        Object[] objArr;
        o0.e eVar = (o0.e) this.f1868d;
        Arrays.sort(eVar.f7317d, 0, eVar.f7319i, m1.f1617e);
        int i3 = eVar.f7319i;
        g0[] g0VarArr = (g0[]) this.f1869e;
        if (g0VarArr != null) {
            int length = g0VarArr.length;
            objArr = g0VarArr;
        }
        objArr = new g0[Math.max(16, i3)];
        this.f1869e = null;
        for (int i10 = 0; i10 < i3; i10++) {
            objArr[i10] = eVar.f7317d[i10];
        }
        eVar.g();
        while (true) {
            i3--;
            if (-1 >= i3) {
                this.f1869e = objArr;
                return;
            }
            g0 g0Var = objArr[i3];
            g0Var.getClass();
            if (g0Var.f1546b0) {
                b(g0Var);
            }
            objArr[i3] = 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CctBackendFactory c(String str) {
        Bundle bundle;
        Map map;
        PackageManager packageManager;
        if (((Map) this.f1869e) == null) {
            Context context = (Context) this.f1868d;
            try {
                packageManager = context.getPackageManager();
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("BackendRegistry", "Application info not found.");
            }
            if (packageManager == null) {
                Log.w("BackendRegistry", "Context has no PackageManager.");
            } else {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) TransportBackendDiscovery.class), 128);
                if (serviceInfo == null) {
                    Log.w("BackendRegistry", "TransportBackendDiscovery has no service info.");
                } else {
                    bundle = serviceInfo.metaData;
                    if (bundle != null) {
                        Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                        map = Collections.EMPTY_MAP;
                    } else {
                        HashMap hashMap = new HashMap();
                        for (String str2 : bundle.keySet()) {
                            Object obj = bundle.get(str2);
                            if ((obj instanceof String) && str2.startsWith("backend:")) {
                                for (String str3 : ((String) obj).split(",", -1)) {
                                    String trim = str3.trim();
                                    if (!trim.isEmpty()) {
                                        hashMap.put(trim, str2.substring(8));
                                    }
                                }
                            }
                        }
                        map = hashMap;
                    }
                    this.f1869e = map;
                }
            }
            bundle = null;
            if (bundle != null) {
            }
            this.f1869e = map;
        }
        String str4 = (String) ((Map) this.f1869e).get(str);
        if (str4 == null) {
            return null;
        }
        try {
            return (CctBackendFactory) Class.forName(str4).asSubclass(CctBackendFactory.class).getDeclaredConstructor(null).newInstance(null);
        } catch (ClassNotFoundException e2) {
            Log.w("BackendRegistry", "Class " + str4 + " is not found.", e2);
            return null;
        } catch (IllegalAccessException e9) {
            Log.w("BackendRegistry", "Could not instantiate " + str4 + ".", e9);
            return null;
        } catch (InstantiationException e10) {
            Log.w("BackendRegistry", "Could not instantiate " + str4 + ".", e10);
            return null;
        } catch (NoSuchMethodException e11) {
            Log.w("BackendRegistry", "Could not instantiate ".concat(str4), e11);
            return null;
        } catch (InvocationTargetException e12) {
            Log.w("BackendRegistry", "Could not instantiate ".concat(str4), e12);
            return null;
        }
    }

    @Override // n0.f
    public void cancel() {
        if (((x0.a) this.f1869e).compareAndSet(1, 1)) {
            return;
        }
        ((e0) this.f1868d).invoke();
    }

    @Override // te.z0
    public Object d(ce.b bVar, ArrayList arrayList) {
        Object mVar;
        Object putIfAbsent;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f1869e;
        Class D = a.a.D(bVar);
        Object obj = concurrentHashMap.get(D);
        if (obj == null && (putIfAbsent = concurrentHashMap.putIfAbsent(D, (obj = new y0()))) != null) {
            obj = putIfAbsent;
        }
        y0 y0Var = (y0) obj;
        ArrayList arrayList2 = new ArrayList(z.j(arrayList, 10));
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj2 = arrayList.get(i3);
            i3++;
            arrayList2.add(new k0((k0) obj2));
        }
        ConcurrentHashMap concurrentHashMap2 = y0Var.f9469a;
        Object obj3 = concurrentHashMap2.get(arrayList2);
        if (obj3 == null) {
            try {
                hd.l lVar = hd.n.f4511e;
                mVar = (pe.a) ((Function2) this.f1868d).invoke(bVar, arrayList);
            } catch (Throwable th) {
                hd.l lVar2 = hd.n.f4511e;
                mVar = new hd.m(th);
            }
            hd.n nVar = new hd.n(mVar);
            Object putIfAbsent2 = concurrentHashMap2.putIfAbsent(arrayList2, nVar);
            obj3 = putIfAbsent2 == null ? nVar : putIfAbsent2;
        }
        return ((hd.n) obj3).f4512d;
    }

    public ArrayList e(String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f1868d;
        z4.z a9 = z4.z.a(1, "SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?");
        if (str == null) {
            a9.r(1);
        } else {
            a9.l(1, str);
        }
        workDatabase_Impl.b();
        Cursor E = cf.c.E(workDatabase_Impl, a9);
        try {
            ArrayList arrayList = new ArrayList(E.getCount());
            while (E.moveToNext()) {
                arrayList.add(E.isNull(0) ? null : E.getString(0));
            }
            return arrayList;
        } finally {
            E.close();
            a9.d();
        }
    }

    public void f() {
        ((h5.b) this.f1868d).a();
    }

    public void g(Bundle bundle) {
        h5.b bVar = (h5.b) this.f1868d;
        f5.e eVar = bVar.f4468a;
        if (!bVar.f4472e) {
            bVar.a();
        }
        if (eVar.g().f737c.compareTo(androidx.lifecycle.p.f710r) >= 0) {
            a2.r.q(eVar.g().f737c, "performRestore cannot be called when owner is ");
            return;
        }
        if (bVar.g) {
            i0.l("SavedStateRegistry was already restored.");
            return;
        }
        Bundle bundle2 = null;
        if (bundle != null && bundle.containsKey("androidx.lifecycle.BundlableSavedStateRegistry.key")) {
            Bundle bundle3 = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
            if (bundle3 == null) {
                f.Q("androidx.lifecycle.BundlableSavedStateRegistry.key");
                throw null;
            }
            bundle2 = bundle3;
        }
        bVar.f4473f = bundle2;
        bVar.g = true;
    }

    @Override // gd.a
    public Object get() {
        s7.c0 c0Var = new s7.c0(20);
        s7.c0 c0Var2 = new s7.c0(19);
        Object obj = ((gd.a) this.f1868d).get();
        gd.a aVar = (gd.a) this.f1869e;
        return new r6.g(c0Var, c0Var2, r6.a.f8181f, (r6.i) obj, aVar);
    }

    public void h(Bundle bundle) {
        bundle.getClass();
        h5.b bVar = (h5.b) this.f1868d;
        kotlin.collections.k0.f5575d.getClass();
        Bundle h10 = w.h((Pair[]) Arrays.copyOf(new Pair[0], 0));
        Bundle bundle2 = bVar.f4473f;
        if (bundle2 != null) {
            h10.putAll(bundle2);
        }
        synchronized (bVar.f4470c) {
            for (Map.Entry entry : bVar.f4471d.entrySet()) {
                String str = (String) entry.getKey();
                Bundle a9 = ((f5.d) entry.getValue()).a();
                str.getClass();
                h10.putBundle(str, a9);
            }
        }
        if (h10.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", h10);
    }

    public int i(Context context, c7.i iVar) {
        int i3;
        int i10;
        c7.c0.g(context);
        c7.c0.g(iVar);
        int j = iVar.j();
        SparseIntArray sparseIntArray = (SparseIntArray) this.f1868d;
        synchronized (sparseIntArray) {
            i3 = sparseIntArray.get(j, -1);
        }
        if (i3 != -1) {
            return i3;
        }
        SparseIntArray sparseIntArray2 = (SparseIntArray) this.f1868d;
        synchronized (sparseIntArray2) {
            i10 = 0;
            int i11 = 0;
            while (true) {
                try {
                    if (i11 >= sparseIntArray2.size()) {
                        i10 = -1;
                        break;
                    }
                    int keyAt = sparseIntArray2.keyAt(i11);
                    if (keyAt > j && sparseIntArray2.get(keyAt) == 0) {
                        break;
                    }
                    i11++;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (i10 == -1) {
                i10 = ((z6.g) this.f1869e).b(context, j);
            }
            sparseIntArray2.put(j, i10);
        }
        return i10;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        z7.d dVar = (z7.d) this.f1868d;
        w7.g gVar = (w7.g) this.f1869e;
        synchronized (dVar.f10929f) {
            dVar.f10928e.remove(gVar);
        }
    }

    @Override // ee.k
    public ee.g toInstant() {
        throw new ee.h(((String) this.f1868d) + " when parsing an Instant from \"" + ee.i.j(64, (String) this.f1869e) + '\"');
    }

    public /* synthetic */ s(Object obj, Object obj2) {
        this.f1868d = obj;
        this.f1869e = obj2;
    }

    public s(z6.g gVar) {
        this.f1868d = new SparseIntArray();
        c7.c0.g(gVar);
        this.f1869e = gVar;
    }

    public s(h5.b bVar) {
        this.f1868d = bVar;
        this.f1869e = new l(bVar);
    }

    public s(int i3) {
        switch (i3) {
            case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                this.f1868d = new LinkedHashMap();
                this.f1869e = new LinkedHashMap();
                break;
            default:
                this.f1868d = new o0.e(new g0[16]);
                break;
        }
    }

    public s(Function2 function2) {
        this.f1868d = function2;
        this.f1869e = new ConcurrentHashMap();
    }
}
