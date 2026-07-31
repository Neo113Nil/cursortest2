package m0;

import D3.M;
import H1.A;
import android.app.ActivityManager;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.BroadcastReceiver;
import android.content.Context;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.background.systemjob.SystemJobService;
import com.strategylink.Row.Five.R;
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
import l.C0484a;
import l0.C0488b;
import l0.w;
import s0.C0623a;
import s0.C0630h;
import u0.C0678h;
import u0.C0687q;
import y1.C0760d;

/* loaded from: classes.dex */
public final class o extends w {

    /* renamed from: k, reason: collision with root package name */
    public static o f5370k;

    /* renamed from: l, reason: collision with root package name */
    public static o f5371l;

    /* renamed from: m, reason: collision with root package name */
    public static final Object f5372m;

    /* renamed from: a, reason: collision with root package name */
    public final Context f5373a;

    /* renamed from: b, reason: collision with root package name */
    public final C0488b f5374b;

    /* renamed from: c, reason: collision with root package name */
    public final WorkDatabase f5375c;

    /* renamed from: d, reason: collision with root package name */
    public final B0.c f5376d;

    /* renamed from: e, reason: collision with root package name */
    public final List f5377e;

    /* renamed from: f, reason: collision with root package name */
    public final f f5378f;

    /* renamed from: g, reason: collision with root package name */
    public final a6.d f5379g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f5380h;

    /* renamed from: i, reason: collision with root package name */
    public BroadcastReceiver.PendingResult f5381i;

    /* renamed from: j, reason: collision with root package name */
    public final A f5382j;

    static {
        l0.q.f("WorkManagerImpl");
        f5370k = null;
        f5371l = null;
        f5372m = new Object();
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x03a1 A[LOOP:6: B:106:0x036b->B:120:0x03a1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x03ab A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x039e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public o(Context context, C0488b c0488b, B0.c cVar) {
        Q.i iVar;
        boolean z5;
        int i7;
        boolean z6 = context.getResources().getBoolean(R.bool.workmanager_test_configuration);
        Context context2 = context.getApplicationContext();
        v0.k queryExecutor = (v0.k) cVar.f72h;
        kotlin.jvm.internal.i.e(context2, "context");
        kotlin.jvm.internal.i.e(queryExecutor, "queryExecutor");
        int i8 = 11;
        if (z6) {
            iVar = new Q.i(context2, null);
            iVar.f1938i = true;
        } else {
            if (F5.j.T("androidx.work.workdb")) {
                throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
            }
            Q.i iVar2 = new Q.i(context2, "androidx.work.workdb");
            iVar2.f1937h = new B0.b(i8, context2);
            iVar = iVar2;
        }
        ArrayList arrayList = iVar.f1932c;
        iVar.f1935f = queryExecutor;
        arrayList.add(b.f5327a);
        iVar.a(d.f5331g);
        iVar.a(new g(context2, 2, 3));
        iVar.a(d.f5332h);
        iVar.a(d.f5333i);
        iVar.a(new g(context2, 5, 6));
        iVar.a(d.f5334j);
        iVar.a(d.f5335k);
        iVar.a(d.f5336l);
        iVar.a(new g(context2));
        iVar.a(new g(context2, 10, 11));
        iVar.a(d.f5328d);
        iVar.a(d.f5329e);
        iVar.a(d.f5330f);
        iVar.f1940k = false;
        iVar.f1941l = true;
        LinkedHashSet linkedHashSet = iVar.f1944o;
        Executor executor = iVar.f1935f;
        if (executor == null && iVar.f1936g == null) {
            P.c cVar2 = C0484a.f5236d;
            iVar.f1936g = cVar2;
            iVar.f1935f = cVar2;
        } else if (executor != null && iVar.f1936g == null) {
            iVar.f1936g = executor;
        } else if (executor == null) {
            iVar.f1935f = iVar.f1936g;
        }
        HashSet hashSet = iVar.f1945p;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                int intValue = ((Number) it.next()).intValue();
                if (linkedHashSet.contains(Integer.valueOf(intValue))) {
                    throw new IllegalArgumentException(W4.o.c("Inconsistency detected. A Migration was supplied to addMigration(Migration... migrations) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(int... startVersions). Start version: ", intValue).toString());
                }
            }
        }
        U.b bVar = iVar.f1937h;
        U.b c0760d = bVar == null ? new C0760d() : bVar;
        if (iVar.f1942m > 0) {
            if (iVar.f1931b == null) {
                throw new IllegalArgumentException("Cannot create auto-closing database for an in-memory database.");
            }
            throw new IllegalArgumentException("Required value was null.");
        }
        Context context3 = iVar.f1930a;
        String str = iVar.f1931b;
        M m4 = iVar.f1943n;
        boolean z7 = iVar.f1938i;
        int i9 = iVar.f1939j;
        if (i9 == 0) {
            throw null;
        }
        if (i9 == 1) {
            Object systemService = context3.getSystemService("activity");
            kotlin.jvm.internal.i.c(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
            i9 = !((ActivityManager) systemService).isLowRamDevice() ? 3 : 2;
        }
        Executor executor2 = iVar.f1935f;
        if (executor2 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        Executor executor3 = iVar.f1936g;
        if (executor3 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        boolean z8 = iVar.f1940k;
        boolean z9 = iVar.f1941l;
        ArrayList arrayList2 = iVar.f1933d;
        ArrayList arrayList3 = iVar.f1934e;
        Q.b bVar2 = new Q.b(context3, str, c0760d, m4, arrayList, z7, i9, executor2, executor3, z8, z9, linkedHashSet, arrayList2, arrayList3);
        Package r11 = WorkDatabase.class.getPackage();
        kotlin.jvm.internal.i.b(r11);
        String fullPackage = r11.getName();
        String canonicalName = WorkDatabase.class.getCanonicalName();
        kotlin.jvm.internal.i.b(canonicalName);
        kotlin.jvm.internal.i.d(fullPackage, "fullPackage");
        if (fullPackage.length() != 0) {
            canonicalName = canonicalName.substring(fullPackage.length() + 1);
            kotlin.jvm.internal.i.d(canonicalName, "this as java.lang.String).substring(startIndex)");
        }
        String concat = F5.q.F(canonicalName, '.', '_').concat("_Impl");
        try {
            Class<?> cls = Class.forName(fullPackage.length() == 0 ? concat : fullPackage + '.' + concat, true, WorkDatabase.class.getClassLoader());
            kotlin.jvm.internal.i.c(cls, "null cannot be cast to non-null type java.lang.Class<T of androidx.room.Room.getGeneratedImplementation>");
            WorkDatabase workDatabase = (WorkDatabase) cls.newInstance();
            Q.f fVar = workDatabase.f3564d;
            LinkedHashMap linkedHashMap = workDatabase.f3567g;
            workDatabase.f3563c = workDatabase.e(bVar2);
            Set<Class> i10 = workDatabase.i();
            BitSet bitSet = new BitSet();
            for (Class cls2 : i10) {
                int size = arrayList3.size() - 1;
                if (size >= 0) {
                    do {
                        i7 = size;
                        size = i7 - 1;
                        if (cls2.isAssignableFrom(arrayList3.get(i7).getClass())) {
                            bitSet.set(i7);
                            break;
                        }
                    } while (size >= 0);
                }
                i7 = -1;
                if (i7 < 0) {
                    throw new IllegalArgumentException(("A required auto migration spec (" + cls2.getCanonicalName() + ") is missing in the database configuration.").toString());
                }
                linkedHashMap.put(cls2, arrayList3.get(i7));
            }
            int size2 = arrayList3.size() - 1;
            if (size2 >= 0) {
                while (true) {
                    int i11 = size2 - 1;
                    if (!bitSet.get(size2)) {
                        throw new IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
                    }
                    if (i11 < 0) {
                        break;
                    } else {
                        size2 = i11;
                    }
                }
            }
            for (R.a aVar : workDatabase.g(linkedHashMap)) {
                int i12 = aVar.f2049a;
                int i13 = aVar.f2050b;
                LinkedHashMap linkedHashMap2 = (LinkedHashMap) m4.f401g;
                if (linkedHashMap2.containsKey(Integer.valueOf(i12))) {
                    Map map = (Map) linkedHashMap2.get(Integer.valueOf(i12));
                    z5 = (map == null ? l5.q.f5304f : map).containsKey(Integer.valueOf(i13));
                } else {
                    z5 = false;
                }
                if (!z5) {
                    m4.s(aVar);
                }
            }
            workDatabase.h().setWriteAheadLoggingEnabled(bVar2.f1908g == 3);
            workDatabase.f3566f = bVar2.f1906e;
            workDatabase.f3562b = bVar2.f1909h;
            Executor executor4 = bVar2.f1910i;
            kotlin.jvm.internal.i.e(executor4, "executor");
            new ArrayDeque();
            workDatabase.f3565e = bVar2.f1907f;
            Map j4 = workDatabase.j();
            BitSet bitSet2 = new BitSet();
            for (Map.Entry entry : j4.entrySet()) {
                Class cls3 = (Class) entry.getKey();
                for (Class cls4 : (List) entry.getValue()) {
                    int size3 = arrayList2.size() - 1;
                    if (size3 >= 0) {
                        while (true) {
                            int i14 = size3 - 1;
                            if (cls4.isAssignableFrom(arrayList2.get(size3).getClass())) {
                                bitSet2.set(size3);
                                break;
                            } else if (i14 < 0) {
                                break;
                            } else {
                                size3 = i14;
                            }
                        }
                        if (size3 < 0) {
                            throw new IllegalArgumentException(("A required type converter (" + cls4 + ") for " + cls3.getCanonicalName() + " is missing in the database configuration.").toString());
                        }
                        workDatabase.f3570j.put(cls4, arrayList2.get(size3));
                    }
                    size3 = -1;
                    if (size3 < 0) {
                    }
                }
            }
            int size4 = arrayList2.size() - 1;
            if (size4 >= 0) {
                while (true) {
                    int i15 = size4 - 1;
                    if (!bitSet2.get(size4)) {
                        throw new IllegalArgumentException("Unexpected type converter " + arrayList2.get(size4) + ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
                    }
                    if (i15 < 0) {
                        break;
                    } else {
                        size4 = i15;
                    }
                }
            }
            Context context4 = context.getApplicationContext();
            l0.q qVar = new l0.q(c0488b.f5249f);
            synchronized (l0.q.f5281b) {
                l0.q.f5282c = qVar;
            }
            kotlin.jvm.internal.i.e(context4, "context");
            Context applicationContext = context4.getApplicationContext();
            kotlin.jvm.internal.i.d(applicationContext, "context.applicationContext");
            C0623a c0623a = new C0623a(applicationContext, cVar, 0);
            Context applicationContext2 = context4.getApplicationContext();
            kotlin.jvm.internal.i.d(applicationContext2, "context.applicationContext");
            C0623a c0623a2 = new C0623a(applicationContext2, cVar, 1);
            Context applicationContext3 = context4.getApplicationContext();
            kotlin.jvm.internal.i.d(applicationContext3, "context.applicationContext");
            String str2 = s0.i.f5878a;
            C0630h c0630h = new C0630h(applicationContext3, cVar);
            Context applicationContext4 = context4.getApplicationContext();
            kotlin.jvm.internal.i.d(applicationContext4, "context.applicationContext");
            C0623a c0623a3 = new C0623a(applicationContext4, cVar, 2);
            A a7 = new A();
            a7.f876a = c0623a;
            a7.f877b = c0623a2;
            a7.f878c = c0630h;
            a7.f879d = c0623a3;
            this.f5382j = a7;
            String str3 = i.f5357a;
            p0.b bVar3 = new p0.b(context4, this);
            v0.i.a(context4, SystemJobService.class, true);
            l0.q.d().a(i.f5357a, "Created SystemJobScheduler and enabled SystemJobService");
            List asList = Arrays.asList(bVar3, new n0.b(context4, c0488b, a7, this));
            f fVar2 = new f(context, c0488b, cVar, workDatabase, asList);
            Context applicationContext5 = context.getApplicationContext();
            this.f5373a = applicationContext5;
            this.f5374b = c0488b;
            this.f5376d = cVar;
            this.f5375c = workDatabase;
            this.f5377e = asList;
            this.f5378f = fVar2;
            this.f5379g = new a6.d(workDatabase);
            this.f5380h = false;
            if (n.a(applicationContext5)) {
                throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
            }
            this.f5376d.a(new v0.d(applicationContext5, this));
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
        Object obj = f5372m;
        synchronized (obj) {
            try {
                synchronized (obj) {
                    oVar = f5370k;
                    if (oVar == null) {
                        oVar = f5371l;
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
    
        if (m0.o.f5371l != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0020, code lost:
    
        m0.o.f5371l = new m0.o(r4, r5, new B0.c(r5.f5245b));
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002e, code lost:
    
        m0.o.f5370k = m0.o.f5371l;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void b(Context context, C0488b c0488b) {
        synchronized (f5372m) {
            try {
                o oVar = f5370k;
                if (oVar != null && f5371l != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                }
            } finally {
            }
        }
    }

    public final void c() {
        synchronized (f5372m) {
            try {
                this.f5380h = true;
                BroadcastReceiver.PendingResult pendingResult = this.f5381i;
                if (pendingResult != null) {
                    pendingResult.finish();
                    this.f5381i = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        ArrayList d7;
        String str = p0.b.f5655j;
        Context context = this.f5373a;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler != null && (d7 = p0.b.d(context, jobScheduler)) != null && !d7.isEmpty()) {
            int size = d7.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = d7.get(i7);
                i7++;
                p0.b.c(jobScheduler, ((JobInfo) obj).getId());
            }
        }
        WorkDatabase workDatabase = this.f5375c;
        C0687q t6 = workDatabase.t();
        WorkDatabase_Impl workDatabase_Impl = t6.f6020a;
        workDatabase_Impl.b();
        C0678h c0678h = t6.f6030k;
        V.i a7 = c0678h.a();
        workDatabase_Impl.c();
        try {
            a7.a();
            workDatabase_Impl.o();
            workDatabase_Impl.k();
            c0678h.n(a7);
            i.a(this.f5374b, workDatabase, this.f5377e);
        } catch (Throwable th) {
            workDatabase_Impl.k();
            c0678h.n(a7);
            throw th;
        }
    }

    public final void e(j jVar, B0.c cVar) {
        A.n nVar = new A.n(10);
        nVar.f36g = this;
        nVar.f37h = jVar;
        nVar.f38i = cVar;
        this.f5376d.a(nVar);
    }
}
