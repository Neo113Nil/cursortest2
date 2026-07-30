package H0;

import G0.B;
import G0.C0103c;
import G0.s;
import android.app.ActivityManager;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.BroadcastReceiver;
import android.content.Context;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.background.systemjob.SystemJobService;
import com.icefishing.icefish.ice.fishing.s294s.R;
import h0.C0456b;
import h0.C0460f;
import h0.C0462h;
import h0.EnumC0463i;
import i0.AbstractC0540a;
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
import kotlin.collections.I;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import l0.InterfaceC0655b;
import o.C0793a;

/* loaded from: classes.dex */
public final class p extends B {

    /* renamed from: k, reason: collision with root package name */
    public static p f915k;

    /* renamed from: l, reason: collision with root package name */
    public static p f916l;

    /* renamed from: m, reason: collision with root package name */
    public static final Object f917m;

    /* renamed from: a, reason: collision with root package name */
    public final Context f918a;

    /* renamed from: b, reason: collision with root package name */
    public final C0103c f919b;

    /* renamed from: c, reason: collision with root package name */
    public final WorkDatabase f920c;

    /* renamed from: d, reason: collision with root package name */
    public final D0.j f921d;

    /* renamed from: e, reason: collision with root package name */
    public final List f922e;

    /* renamed from: f, reason: collision with root package name */
    public final f f923f;

    /* renamed from: g, reason: collision with root package name */
    public final l2.c f924g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f925h;

    /* renamed from: i, reason: collision with root package name */
    public BroadcastReceiver.PendingResult f926i;
    public final P0.i j;

    static {
        s.f("WorkManagerImpl");
        f915k = null;
        f916l = null;
        f917m = new Object();
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x03e3 A[LOOP:6: B:103:0x03ad->B:117:0x03e3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x03ed A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x059d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x02ae A[LOOP:1: B:50:0x0276->B:61:0x02ae, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x02b6 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public p(Context context, C0103c c0103c, D0.j taskExecutor) {
        C0462h c0462h;
        EnumC0463i enumC0463i;
        Executor executor;
        boolean z7;
        int i2;
        int i5;
        boolean z8 = context.getResources().getBoolean(R.bool.workmanager_test_configuration);
        Context context2 = context.getApplicationContext();
        Q0.m executor2 = (Q0.m) taskExecutor.f330e;
        Intrinsics.checkNotNullParameter(context2, "context");
        Intrinsics.checkNotNullParameter(executor2, "queryExecutor");
        if (z8) {
            Intrinsics.checkNotNullParameter(context2, "context");
            Intrinsics.checkNotNullParameter(WorkDatabase.class, "klass");
            c0462h = new C0462h(context2, null);
            c0462h.f5096i = true;
        } else {
            Intrinsics.checkNotNullParameter(context2, "context");
            Intrinsics.checkNotNullParameter(WorkDatabase.class, "klass");
            if (StringsKt.z("androidx.work.workdb")) {
                throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
            }
            C0462h c0462h2 = new C0462h(context2, "androidx.work.workdb");
            c0462h2.f5095h = new l(context2);
            c0462h = c0462h2;
        }
        ArrayList arrayList = c0462h.f5090c;
        Intrinsics.checkNotNullParameter(executor2, "executor");
        c0462h.f5093f = executor2;
        b callback = b.f872a;
        Intrinsics.checkNotNullParameter(callback, "callback");
        arrayList.add(callback);
        c0462h.a(d.f876g);
        c0462h.a(new g(context2, 2, 3));
        c0462h.a(d.f877h);
        c0462h.a(d.f878i);
        c0462h.a(new g(context2, 5, 6));
        c0462h.a(d.j);
        c0462h.a(d.f879k);
        c0462h.a(d.f880l);
        c0462h.a(new g(context2));
        c0462h.a(new g(context2, 10, 11));
        c0462h.a(d.f873d);
        c0462h.a(d.f874e);
        c0462h.a(d.f875f);
        c0462h.f5097k = false;
        c0462h.f5098l = true;
        EnumC0463i enumC0463i2 = EnumC0463i.f5105i;
        LinkedHashSet linkedHashSet = c0462h.f5101o;
        Executor executor3 = c0462h.f5093f;
        if (executor3 == null && c0462h.f5094g == null) {
            e0.c cVar = C0793a.f7105d;
            c0462h.f5094g = cVar;
            c0462h.f5093f = cVar;
        } else if (executor3 != null && c0462h.f5094g == null) {
            c0462h.f5094g = executor3;
        } else if (executor3 == null) {
            c0462h.f5093f = c0462h.f5094g;
        }
        HashSet hashSet = c0462h.f5102p;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                int intValue = ((Number) it.next()).intValue();
                if (linkedHashSet.contains(Integer.valueOf(intValue))) {
                    throw new IllegalArgumentException(C4.p.g(intValue, "Inconsistency detected. A Migration was supplied to addMigration(Migration... migrations) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(int... startVersions). Start version: ").toString());
                }
            }
        }
        InterfaceC0655b interfaceC0655b = c0462h.f5095h;
        InterfaceC0655b eVar = interfaceC0655b == null ? new c2.e() : interfaceC0655b;
        if (c0462h.f5099m > 0) {
            if (c0462h.f5089b == null) {
                throw new IllegalArgumentException("Cannot create auto-closing database for an in-memory database.");
            }
            throw new IllegalArgumentException("Required value was null.");
        }
        Context context3 = c0462h.f5088a;
        String str = c0462h.f5089b;
        l2.c cVar2 = c0462h.f5100n;
        boolean z9 = c0462h.f5096i;
        EnumC0463i enumC0463i3 = c0462h.j;
        enumC0463i3.getClass();
        Intrinsics.checkNotNullParameter(context3, "context");
        if (enumC0463i3 == EnumC0463i.f5103d) {
            Object systemService = context3.getSystemService("activity");
            Intrinsics.c(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
            ActivityManager activityManager = (ActivityManager) systemService;
            Intrinsics.checkNotNullParameter(activityManager, "activityManager");
            if (activityManager.isLowRamDevice()) {
                enumC0463i3 = EnumC0463i.f5104e;
            } else {
                enumC0463i = enumC0463i2;
                executor = c0462h.f5093f;
                if (executor != null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                Executor executor4 = c0462h.f5094g;
                if (executor4 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                boolean z10 = c0462h.f5097k;
                boolean z11 = c0462h.f5098l;
                ArrayList arrayList2 = c0462h.f5091d;
                ArrayList arrayList3 = c0462h.f5092e;
                C0456b configuration = new C0456b(context3, str, eVar, cVar2, arrayList, z9, enumC0463i, executor, executor4, z10, z11, linkedHashSet, arrayList2, arrayList3);
                Intrinsics.checkNotNullParameter(WorkDatabase.class, "klass");
                Intrinsics.checkNotNullParameter("_Impl", "suffix");
                Package r8 = WorkDatabase.class.getPackage();
                Intrinsics.b(r8);
                String fullPackage = r8.getName();
                String canonicalName = WorkDatabase.class.getCanonicalName();
                Intrinsics.b(canonicalName);
                Intrinsics.checkNotNullExpressionValue(fullPackage, "fullPackage");
                if (fullPackage.length() != 0) {
                    canonicalName = canonicalName.substring(fullPackage.length() + 1);
                    Intrinsics.checkNotNullExpressionValue(canonicalName, "this as java.lang.String).substring(startIndex)");
                }
                String str2 = kotlin.text.p.i(canonicalName, '.', '_') + "_Impl";
                try {
                    Class<?> cls = Class.forName(fullPackage.length() == 0 ? str2 : fullPackage + '.' + str2, true, WorkDatabase.class.getClassLoader());
                    Intrinsics.c(cls, "null cannot be cast to non-null type java.lang.Class<T of androidx.room.Room.getGeneratedImplementation>");
                    WorkDatabase workDatabase = (WorkDatabase) cls.newInstance();
                    C0460f c0460f = workDatabase.f4094d;
                    LinkedHashMap linkedHashMap = workDatabase.f4097g;
                    Intrinsics.checkNotNullParameter(configuration, "configuration");
                    workDatabase.f4093c = workDatabase.e(configuration);
                    Set i7 = workDatabase.i();
                    BitSet bitSet = new BitSet();
                    Iterator it2 = i7.iterator();
                    while (true) {
                        int i8 = -1;
                        if (!it2.hasNext()) {
                            l2.c cVar3 = configuration.f5065d;
                            List list = configuration.f5073m;
                            int size = arrayList3.size() - 1;
                            if (size >= 0) {
                                while (true) {
                                    int i9 = size - 1;
                                    if (!bitSet.get(size)) {
                                        throw new IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
                                    }
                                    if (i9 < 0) {
                                        break;
                                    } else {
                                        size = i9;
                                    }
                                }
                            }
                            for (AbstractC0540a abstractC0540a : workDatabase.g(linkedHashMap)) {
                                int i10 = abstractC0540a.f5496a;
                                int i11 = abstractC0540a.f5497b;
                                LinkedHashMap linkedHashMap2 = (LinkedHashMap) cVar3.f6269d;
                                if (linkedHashMap2.containsKey(Integer.valueOf(i10))) {
                                    Map map = (Map) linkedHashMap2.get(Integer.valueOf(i10));
                                    z7 = (map == null ? I.c() : map).containsKey(Integer.valueOf(i11));
                                } else {
                                    z7 = false;
                                }
                                if (!z7) {
                                    cVar3.u(abstractC0540a);
                                }
                            }
                            workDatabase.h().setWriteAheadLoggingEnabled(configuration.f5068g == enumC0463i2);
                            workDatabase.f4096f = configuration.f5066e;
                            workDatabase.f4092b = configuration.f5069h;
                            Intrinsics.checkNotNullParameter(configuration.f5070i, "executor");
                            new ArrayDeque();
                            workDatabase.f4095e = configuration.f5067f;
                            Map j = workDatabase.j();
                            BitSet bitSet2 = new BitSet();
                            for (Map.Entry entry : j.entrySet()) {
                                Class cls2 = (Class) entry.getKey();
                                for (Class cls3 : (List) entry.getValue()) {
                                    int size2 = list.size() - 1;
                                    if (size2 >= 0) {
                                        while (true) {
                                            int i12 = size2 - 1;
                                            if (cls3.isAssignableFrom(list.get(size2).getClass())) {
                                                bitSet2.set(size2);
                                                break;
                                            } else if (i12 < 0) {
                                                break;
                                            } else {
                                                size2 = i12;
                                            }
                                        }
                                        if (size2 < 0) {
                                            throw new IllegalArgumentException(("A required type converter (" + cls3 + ") for " + cls2.getCanonicalName() + " is missing in the database configuration.").toString());
                                        }
                                        workDatabase.j.put(cls3, list.get(size2));
                                    }
                                    size2 = -1;
                                    if (size2 < 0) {
                                    }
                                }
                            }
                            int size3 = list.size() - 1;
                            if (size3 >= 0) {
                                while (true) {
                                    int i13 = size3 - 1;
                                    if (!bitSet2.get(size3)) {
                                        throw new IllegalArgumentException("Unexpected type converter " + list.get(size3) + ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
                                    }
                                    if (i13 < 0) {
                                        break;
                                    } else {
                                        size3 = i13;
                                    }
                                }
                            }
                            Context context4 = context.getApplicationContext();
                            s sVar = new s(c0103c.f788f);
                            synchronized (s.f822b) {
                                s.f823c = sVar;
                            }
                            Intrinsics.checkNotNullParameter(context4, "context");
                            Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
                            Context context5 = context4.getApplicationContext();
                            Intrinsics.checkNotNullExpressionValue(context5, "context.applicationContext");
                            Intrinsics.checkNotNullParameter(context5, "context");
                            Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
                            N0.a batteryChargingTracker = new N0.a(context5, taskExecutor, 0);
                            Context context6 = context4.getApplicationContext();
                            Intrinsics.checkNotNullExpressionValue(context6, "context.applicationContext");
                            Intrinsics.checkNotNullParameter(context6, "context");
                            Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
                            N0.a batteryNotLowTracker = new N0.a(context6, taskExecutor, 1);
                            Context context7 = context4.getApplicationContext();
                            Intrinsics.checkNotNullExpressionValue(context7, "context.applicationContext");
                            String str3 = N0.j.f1794a;
                            Intrinsics.checkNotNullParameter(context7, "context");
                            Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
                            N0.i networkStateTracker = new N0.i(context7, taskExecutor);
                            Context context8 = context4.getApplicationContext();
                            Intrinsics.checkNotNullExpressionValue(context8, "context.applicationContext");
                            Intrinsics.checkNotNullParameter(context8, "context");
                            Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
                            N0.a storageNotLowTracker = new N0.a(context8, taskExecutor, 2);
                            Intrinsics.checkNotNullParameter(context4, "context");
                            Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
                            Intrinsics.checkNotNullParameter(batteryChargingTracker, "batteryChargingTracker");
                            Intrinsics.checkNotNullParameter(batteryNotLowTracker, "batteryNotLowTracker");
                            Intrinsics.checkNotNullParameter(networkStateTracker, "networkStateTracker");
                            Intrinsics.checkNotNullParameter(storageNotLowTracker, "storageNotLowTracker");
                            P0.i iVar = new P0.i();
                            iVar.f2200a = batteryChargingTracker;
                            iVar.f2201b = batteryNotLowTracker;
                            iVar.f2202c = networkStateTracker;
                            iVar.f2203d = storageNotLowTracker;
                            this.j = iVar;
                            String str4 = i.f901a;
                            K0.b bVar = new K0.b(context4, this);
                            Q0.k.a(context4, SystemJobService.class, true);
                            s.d().a(i.f901a, "Created SystemJobScheduler and enabled SystemJobService");
                            List asList = Arrays.asList(bVar, new I0.b(context4, c0103c, iVar, this));
                            f fVar = new f(context, c0103c, taskExecutor, workDatabase, asList);
                            Context applicationContext = context.getApplicationContext();
                            this.f918a = applicationContext;
                            this.f919b = c0103c;
                            this.f921d = taskExecutor;
                            this.f920c = workDatabase;
                            this.f922e = asList;
                            this.f923f = fVar;
                            this.f924g = new l2.c(workDatabase);
                            this.f925h = false;
                            if (o.a(applicationContext)) {
                                throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
                            }
                            this.f921d.r(new Q0.f(applicationContext, this));
                            return;
                        }
                        Class cls4 = (Class) it2.next();
                        int size4 = arrayList3.size() - 1;
                        if (size4 >= 0) {
                            while (true) {
                                int i14 = size4 - 1;
                                i2 = i8;
                                if (cls4.isAssignableFrom(arrayList3.get(size4).getClass())) {
                                    bitSet.set(size4);
                                    i5 = size4;
                                    break;
                                } else {
                                    if (i14 < 0) {
                                        break;
                                    }
                                    size4 = i14;
                                    i8 = i2;
                                }
                            }
                            if (i5 >= 0) {
                                throw new IllegalArgumentException(("A required auto migration spec (" + cls4.getCanonicalName() + ") is missing in the database configuration.").toString());
                            }
                            linkedHashMap.put(cls4, arrayList3.get(i5));
                        } else {
                            i2 = -1;
                        }
                        i5 = i2;
                        if (i5 >= 0) {
                        }
                    }
                } catch (ClassNotFoundException unused) {
                    throw new RuntimeException("Cannot find implementation for " + WorkDatabase.class.getCanonicalName() + ". " + str2 + " does not exist");
                } catch (IllegalAccessException unused2) {
                    throw new RuntimeException("Cannot access the constructor " + WorkDatabase.class + ".canonicalName");
                } catch (InstantiationException unused3) {
                    throw new RuntimeException("Failed to create an instance of " + WorkDatabase.class + ".canonicalName");
                }
            }
        }
        enumC0463i = enumC0463i3;
        executor = c0462h.f5093f;
        if (executor != null) {
        }
    }

    public static p a(Context context) {
        p pVar;
        Object obj = f917m;
        synchronized (obj) {
            try {
                synchronized (obj) {
                    pVar = f915k;
                    if (pVar == null) {
                        pVar = f916l;
                    }
                }
                return pVar;
            } catch (Throwable th) {
                throw th;
            } finally {
            }
        }
        if (pVar != null) {
            return pVar;
        }
        context.getApplicationContext();
        throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0018, code lost:
    
        r4 = r4.getApplicationContext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x001e, code lost:
    
        if (H0.p.f916l != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0020, code lost:
    
        H0.p.f916l = new H0.p(r4, r5, new D0.j(r5.f784b));
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002e, code lost:
    
        H0.p.f915k = H0.p.f916l;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void b(Context context, C0103c c0103c) {
        synchronized (f917m) {
            try {
                p pVar = f915k;
                if (pVar != null && f916l != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                }
            } finally {
            }
        }
    }

    public final void c() {
        synchronized (f917m) {
            try {
                this.f925h = true;
                BroadcastReceiver.PendingResult pendingResult = this.f926i;
                if (pendingResult != null) {
                    pendingResult.finish();
                    this.f926i = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        ArrayList c7;
        String str = K0.b.f1422m;
        Context context = this.f918a;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler != null && (c7 = K0.b.c(context, jobScheduler)) != null && !c7.isEmpty()) {
            int size = c7.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = c7.get(i2);
                i2++;
                K0.b.b(jobScheduler, ((JobInfo) obj).getId());
            }
        }
        WorkDatabase workDatabase = this.f920c;
        P0.q t6 = workDatabase.t();
        WorkDatabase_Impl workDatabase_Impl = t6.f2239a;
        workDatabase_Impl.b();
        P0.h hVar = t6.f2248k;
        m0.j a7 = hVar.a();
        workDatabase_Impl.c();
        try {
            a7.a();
            workDatabase_Impl.o();
            workDatabase_Impl.k();
            hVar.d(a7);
            i.a(this.f919b, workDatabase, this.f922e);
        } catch (Throwable th) {
            workDatabase_Impl.k();
            hVar.d(a7);
            throw th;
        }
    }

    public final void e(j jVar, D0.j jVar2) {
        F.n nVar = new F.n(9);
        nVar.f753e = this;
        nVar.f754i = jVar;
        nVar.f755l = jVar2;
        this.f921d.r(nVar);
    }
}
