package t0;

import B4.r;
import android.app.ActivityManager;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.BroadcastReceiver;
import android.content.Context;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.background.systemjob.SystemJobService;
import b0.InterfaceC0260a;
import b2.AbstractC0279e;
import c0.C0307i;
import com.chickyneer.roadway.R;
import g4.C0472q;
import h2.C0482c;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import m.C1263a;
import s0.C1414b;
import s0.s;
import s0.y;
import u0.C1476b;
import w0.C1506b;

/* loaded from: classes.dex */
public final class o extends y {

    /* renamed from: k, reason: collision with root package name */
    public static o f11879k;

    /* renamed from: l, reason: collision with root package name */
    public static o f11880l;

    /* renamed from: m, reason: collision with root package name */
    public static final Object f11881m;

    /* renamed from: a, reason: collision with root package name */
    public final Context f11882a;

    /* renamed from: b, reason: collision with root package name */
    public final C1414b f11883b;

    /* renamed from: c, reason: collision with root package name */
    public final WorkDatabase f11884c;

    /* renamed from: d, reason: collision with root package name */
    public final B4.i f11885d;

    /* renamed from: e, reason: collision with root package name */
    public final List f11886e;

    /* renamed from: f, reason: collision with root package name */
    public final f f11887f;

    /* renamed from: g, reason: collision with root package name */
    public final C0482c f11888g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f11889h;

    /* renamed from: i, reason: collision with root package name */
    public BroadcastReceiver.PendingResult f11890i;

    /* renamed from: j, reason: collision with root package name */
    public final B0.n f11891j;

    static {
        s.f("WorkManagerImpl");
        f11879k = null;
        f11880l = null;
        f11881m = new Object();
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0269 A[LOOP:1: B:52:0x0234->B:64:0x0269, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0271 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public o(Context context, C1414b c1414b, B4.i iVar) {
        X.i iVar2;
        int i2;
        boolean z;
        boolean z5 = context.getResources().getBoolean(R.bool.workmanager_test_configuration);
        Context context2 = context.getApplicationContext();
        C0.n queryExecutor = (C0.n) iVar.f311b;
        kotlin.jvm.internal.i.e(context2, "context");
        kotlin.jvm.internal.i.e(queryExecutor, "queryExecutor");
        if (z5) {
            iVar2 = new X.i(context2, null);
            iVar2.f3483i = true;
        } else {
            if (B4.k.Z("androidx.work.workdb")) {
                throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
            }
            X.i iVar3 = new X.i(context2, "androidx.work.workdb");
            iVar3.f3482h = new D3.g(27, context2);
            iVar2 = iVar3;
        }
        iVar2.f3480f = queryExecutor;
        C1424c c1424c = C1424c.f11840a;
        ArrayList arrayList = iVar2.f3477c;
        arrayList.add(c1424c);
        iVar2.a(e.f11844g);
        iVar2.a(new g(context2, 2, 3));
        iVar2.a(e.f11845h);
        iVar2.a(e.f11846i);
        iVar2.a(new g(context2, 5, 6));
        iVar2.a(e.f11847j);
        iVar2.a(e.f11848k);
        iVar2.a(e.f11849l);
        iVar2.a(new g(context2));
        iVar2.a(new g(context2, 10, 11));
        iVar2.a(e.f11841d);
        iVar2.a(e.f11842e);
        iVar2.a(e.f11843f);
        iVar2.f3485k = false;
        iVar2.f3486l = true;
        Executor executor = iVar2.f3480f;
        if (executor == null && iVar2.f3481g == null) {
            U.d dVar = C1263a.f11082i;
            iVar2.f3481g = dVar;
            iVar2.f3480f = dVar;
        } else if (executor != null && iVar2.f3481g == null) {
            iVar2.f3481g = executor;
        } else if (executor == null) {
            iVar2.f3480f = iVar2.f3481g;
        }
        HashSet hashSet = iVar2.f3490p;
        LinkedHashSet linkedHashSet = iVar2.f3489o;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                int intValue = ((Number) it.next()).intValue();
                if (linkedHashSet.contains(Integer.valueOf(intValue))) {
                    throw new IllegalArgumentException(AbstractC0279e.d(intValue, "Inconsistency detected. A Migration was supplied to addMigration(Migration... migrations) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(int... startVersions). Start version: ").toString());
                }
            }
        }
        InterfaceC0260a interfaceC0260a = iVar2.f3482h;
        interfaceC0260a = interfaceC0260a == null ? new l1.j(20) : interfaceC0260a;
        if (iVar2.f3487m > 0) {
            if (iVar2.f3476b == null) {
                throw new IllegalArgumentException("Cannot create auto-closing database for an in-memory database.");
            }
            throw new IllegalArgumentException("Required value was null.");
        }
        boolean z6 = iVar2.f3483i;
        int i3 = iVar2.f3484j;
        if (i3 == 0) {
            throw null;
        }
        Context context3 = iVar2.f3475a;
        if (i3 != 1) {
            i2 = i3;
        } else {
            Object systemService = context3.getSystemService("activity");
            kotlin.jvm.internal.i.c(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
            i2 = !((ActivityManager) systemService).isLowRamDevice() ? 3 : 2;
        }
        Executor executor2 = iVar2.f3480f;
        if (executor2 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        Executor executor3 = iVar2.f3481g;
        if (executor3 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        X.b bVar = new X.b(context3, iVar2.f3476b, interfaceC0260a, iVar2.f3488n, arrayList, z6, i2, executor2, executor3, iVar2.f3485k, iVar2.f3486l, linkedHashSet, iVar2.f3478d, iVar2.f3479e);
        Package r42 = WorkDatabase.class.getPackage();
        kotlin.jvm.internal.i.b(r42);
        String fullPackage = r42.getName();
        String canonicalName = WorkDatabase.class.getCanonicalName();
        kotlin.jvm.internal.i.b(canonicalName);
        kotlin.jvm.internal.i.d(fullPackage, "fullPackage");
        if (fullPackage.length() != 0) {
            canonicalName = canonicalName.substring(fullPackage.length() + 1);
            kotlin.jvm.internal.i.d(canonicalName, "this as java.lang.String).substring(startIndex)");
        }
        String concat = r.L(canonicalName, '.', '_').concat("_Impl");
        try {
            Class<?> cls = Class.forName(fullPackage.length() == 0 ? concat : fullPackage + '.' + concat, true, WorkDatabase.class.getClassLoader());
            kotlin.jvm.internal.i.c(cls, "null cannot be cast to non-null type java.lang.Class<T of androidx.room.Room.getGeneratedImplementation>");
            WorkDatabase workDatabase = (WorkDatabase) cls.newInstance();
            workDatabase.getClass();
            workDatabase.f4721c = workDatabase.e(bVar);
            Set i6 = workDatabase.i();
            BitSet bitSet = new BitSet();
            Iterator it2 = i6.iterator();
            while (true) {
                boolean hasNext = it2.hasNext();
                LinkedHashMap linkedHashMap = workDatabase.f4725g;
                ArrayList arrayList2 = bVar.f3457n;
                if (hasNext) {
                    Class cls2 = (Class) it2.next();
                    int size = arrayList2.size() - 1;
                    if (size >= 0) {
                        while (true) {
                            int i7 = size - 1;
                            if (cls2.isAssignableFrom(arrayList2.get(size).getClass())) {
                                bitSet.set(size);
                                break;
                            } else if (i7 < 0) {
                                break;
                            } else {
                                size = i7;
                            }
                        }
                        if (size >= 0) {
                            throw new IllegalArgumentException(("A required auto migration spec (" + cls2.getCanonicalName() + ") is missing in the database configuration.").toString());
                        }
                        linkedHashMap.put(cls2, arrayList2.get(size));
                    }
                    size = -1;
                    if (size >= 0) {
                    }
                } else {
                    int size2 = arrayList2.size() - 1;
                    if (size2 >= 0) {
                        while (true) {
                            int i8 = size2 - 1;
                            if (!bitSet.get(size2)) {
                                throw new IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
                            }
                            if (i8 < 0) {
                                break;
                            } else {
                                size2 = i8;
                            }
                        }
                    }
                    for (Y.a aVar : workDatabase.g(linkedHashMap)) {
                        int i9 = aVar.f3659a;
                        P0.b bVar2 = bVar.f3447d;
                        LinkedHashMap linkedHashMap2 = bVar2.f2283a;
                        if (linkedHashMap2.containsKey(Integer.valueOf(i9))) {
                            Map map = (Map) linkedHashMap2.get(Integer.valueOf(i9));
                            z = (map == null ? C0472q.f5751a : map).containsKey(Integer.valueOf(aVar.f3660b));
                        } else {
                            z = false;
                        }
                        if (!z) {
                            bVar2.a(aVar);
                        }
                    }
                    workDatabase.h().setWriteAheadLoggingEnabled(bVar.f3450g == 3);
                    workDatabase.f4724f = bVar.f3448e;
                    workDatabase.f4720b = bVar.f3451h;
                    Executor executor4 = bVar.f3452i;
                    kotlin.jvm.internal.i.e(executor4, "executor");
                    new ArrayDeque();
                    workDatabase.f4723e = bVar.f3449f;
                    Map j2 = workDatabase.j();
                    BitSet bitSet2 = new BitSet();
                    Iterator it3 = j2.entrySet().iterator();
                    while (true) {
                        boolean hasNext2 = it3.hasNext();
                        ArrayList arrayList3 = bVar.f3456m;
                        if (!hasNext2) {
                            int size3 = arrayList3.size() - 1;
                            if (size3 >= 0) {
                                while (true) {
                                    int i10 = size3 - 1;
                                    if (!bitSet2.get(size3)) {
                                        throw new IllegalArgumentException("Unexpected type converter " + arrayList3.get(size3) + ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
                                    }
                                    if (i10 < 0) {
                                        break;
                                    } else {
                                        size3 = i10;
                                    }
                                }
                            }
                            Context applicationContext = context.getApplicationContext();
                            s sVar = new s(c1414b.f11756f);
                            synchronized (s.f11791b) {
                                s.f11792c = sVar;
                            }
                            B0.n nVar = new B0.n(applicationContext, iVar);
                            this.f11891j = nVar;
                            String str = i.f11866a;
                            C1506b c1506b = new C1506b(applicationContext, this);
                            C0.l.a(applicationContext, SystemJobService.class, true);
                            s.d().a(i.f11866a, "Created SystemJobScheduler and enabled SystemJobService");
                            List asList = Arrays.asList(c1506b, new C1476b(applicationContext, c1414b, nVar, this));
                            f fVar = new f(context, c1414b, iVar, workDatabase, asList);
                            Context applicationContext2 = context.getApplicationContext();
                            this.f11882a = applicationContext2;
                            this.f11883b = c1414b;
                            this.f11885d = iVar;
                            this.f11884c = workDatabase;
                            this.f11886e = asList;
                            this.f11887f = fVar;
                            this.f11888g = new C0482c(3, workDatabase);
                            this.f11889h = false;
                            if (n.a(applicationContext2)) {
                                throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
                            }
                            this.f11885d.o(new C0.f(applicationContext2, this));
                            return;
                        }
                        Map.Entry entry = (Map.Entry) it3.next();
                        Class cls3 = (Class) entry.getKey();
                        for (Class cls4 : (List) entry.getValue()) {
                            int size4 = arrayList3.size() - 1;
                            if (size4 >= 0) {
                                while (true) {
                                    int i11 = size4 - 1;
                                    if (cls4.isAssignableFrom(arrayList3.get(size4).getClass())) {
                                        bitSet2.set(size4);
                                        break;
                                    } else if (i11 < 0) {
                                        break;
                                    } else {
                                        size4 = i11;
                                    }
                                }
                            }
                            size4 = -1;
                            if (!(size4 >= 0)) {
                                throw new IllegalArgumentException(("A required type converter (" + cls4 + ") for " + cls3.getCanonicalName() + " is missing in the database configuration.").toString());
                            }
                            workDatabase.f4728j.put(cls4, arrayList3.get(size4));
                        }
                    }
                }
            }
        } catch (ClassNotFoundException unused) {
            throw new RuntimeException("Cannot find implementation for " + WorkDatabase.class.getCanonicalName() + ". " + concat + " does not exist");
        } catch (IllegalAccessException unused2) {
            throw new RuntimeException("Cannot access the constructor " + WorkDatabase.class + ".canonicalName");
        } catch (InstantiationException unused3) {
            throw new RuntimeException("Failed to create an instance of " + WorkDatabase.class + ".canonicalName");
        }
    }

    public static o a(Context context) {
        o oVar;
        Object obj = f11881m;
        synchronized (obj) {
            try {
                synchronized (obj) {
                    oVar = f11879k;
                    if (oVar == null) {
                        oVar = f11880l;
                    }
                }
                return oVar;
            } catch (Throwable th) {
                throw th;
            } finally {
            }
        }
        if (oVar != null) {
            return oVar;
        }
        context.getApplicationContext();
        throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0018, code lost:
    
        r4 = r4.getApplicationContext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x001e, code lost:
    
        if (t0.o.f11880l != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0020, code lost:
    
        t0.o.f11880l = new t0.o(r4, r5, new B4.i(r5.f11752b));
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002e, code lost:
    
        t0.o.f11879k = t0.o.f11880l;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void b(Context context, C1414b c1414b) {
        synchronized (f11881m) {
            try {
                o oVar = f11879k;
                if (oVar != null && f11880l != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                }
            } finally {
            }
        }
    }

    public final void c() {
        synchronized (f11881m) {
            try {
                this.f11889h = true;
                BroadcastReceiver.PendingResult pendingResult = this.f11890i;
                if (pendingResult != null) {
                    pendingResult.finish();
                    this.f11890i = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        ArrayList c2;
        WorkDatabase workDatabase = this.f11884c;
        Context context = this.f11882a;
        String str = C1506b.f12111e;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler != null && (c2 = C1506b.c(context, jobScheduler)) != null && !c2.isEmpty()) {
            Iterator it = c2.iterator();
            while (it.hasNext()) {
                C1506b.b(jobScheduler, ((JobInfo) it.next()).getId());
            }
        }
        B0.r t5 = workDatabase.t();
        WorkDatabase_Impl workDatabase_Impl = t5.f193a;
        workDatabase_Impl.b();
        B0.h hVar = t5.f203k;
        C0307i a6 = hVar.a();
        workDatabase_Impl.c();
        try {
            a6.a();
            workDatabase_Impl.o();
            workDatabase_Impl.k();
            hVar.n(a6);
            i.a(this.f11883b, workDatabase, this.f11886e);
        } catch (Throwable th) {
            workDatabase_Impl.k();
            hVar.n(a6);
            throw th;
        }
    }

    public final void e(j jVar, B4.i iVar) {
        B4.i iVar2 = this.f11885d;
        B.l lVar = new B.l(1);
        lVar.f133b = this;
        lVar.f134c = jVar;
        lVar.f135d = iVar;
        iVar2.o(lVar);
    }
}
