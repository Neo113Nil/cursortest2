package z4;

import android.app.ActivityManager;
import android.content.Context;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import te.a1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final wd.h f10814a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f10815b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10816c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f10817d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f10818e;

    /* renamed from: f, reason: collision with root package name */
    public Executor f10819f;
    public Executor g;

    /* renamed from: h, reason: collision with root package name */
    public b1.h f10820h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f10821i;
    public final t j;

    /* renamed from: k, reason: collision with root package name */
    public final long f10822k;

    /* renamed from: l, reason: collision with root package name */
    public final k4.d f10823l;

    /* renamed from: m, reason: collision with root package name */
    public final LinkedHashSet f10824m;

    /* renamed from: n, reason: collision with root package name */
    public final LinkedHashSet f10825n;

    /* renamed from: o, reason: collision with root package name */
    public final ArrayList f10826o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f10827p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f10828q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f10829r;

    public r(Context context, Class cls, String str) {
        context.getClass();
        this.f10817d = new ArrayList();
        this.f10818e = new ArrayList();
        this.j = t.f10830d;
        this.f10822k = -1L;
        this.f10823l = new k4.d(2);
        this.f10824m = new LinkedHashSet();
        this.f10825n = new LinkedHashSet();
        this.f10826o = new ArrayList();
        this.f10827p = true;
        this.f10829r = true;
        this.f10814a = wd.c0.a(cls);
        this.f10815b = context;
        this.f10816c = str;
    }

    public final void a(c5.a... aVarArr) {
        for (c5.a aVar : aVarArr) {
            Integer valueOf = Integer.valueOf(aVar.f1803a);
            LinkedHashSet linkedHashSet = this.f10825n;
            linkedHashSet.add(valueOf);
            linkedHashSet.add(Integer.valueOf(aVar.f1804b));
        }
        c5.a[] aVarArr2 = (c5.a[]) Arrays.copyOf(aVarArr, aVarArr.length);
        k4.d dVar = this.f10823l;
        dVar.getClass();
        for (c5.a aVar2 : aVarArr2) {
            dVar.b(aVar2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:158:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0381  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final u b() {
        String str;
        c4.h hVar;
        q qVar;
        j5.d dVar;
        boolean z10;
        Executor executor = this.f10819f;
        if (executor == null && this.g == null) {
            n.a aVar = n.b.f6633c;
            this.g = aVar;
            this.f10819f = aVar;
        } else if (executor != null && this.g == null) {
            this.g = executor;
        } else if (executor == null) {
            this.f10819f = this.g;
        }
        LinkedHashSet linkedHashSet = this.f10825n;
        linkedHashSet.getClass();
        LinkedHashSet linkedHashSet2 = this.f10824m;
        linkedHashSet2.getClass();
        if (!linkedHashSet.isEmpty()) {
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                int intValue = ((Number) it.next()).intValue();
                if (linkedHashSet2.contains(Integer.valueOf(intValue))) {
                    a2.r.h(v4.a.j(intValue, "Inconsistency detected. A Migration was supplied to addMigration() that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(). Start version is: "));
                    return null;
                }
            }
        }
        j5.c cVar = this.f10820h;
        if (cVar == null) {
            cVar = new k5.c(1);
        }
        j5.c cVar2 = cVar;
        if (this.f10822k > 0) {
            if (this.f10816c != null) {
                a1.e("Required value was null.");
                return null;
            }
            a1.e("Cannot create auto-closing database for an in-memory database.");
            return null;
        }
        boolean z11 = this.f10821i;
        t tVar = this.j;
        tVar.getClass();
        Context context = this.f10815b;
        context.getClass();
        if (tVar == t.f10830d) {
            Object systemService = context.getSystemService("activity");
            ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
            tVar = (activityManager == null || activityManager.isLowRamDevice()) ? t.f10831e : t.f10832i;
        }
        Executor executor2 = this.f10819f;
        if (executor2 == null) {
            a1.e("Required value was null.");
            return null;
        }
        Executor executor3 = this.g;
        if (executor3 == null) {
            a1.e("Required value was null.");
            return null;
        }
        a aVar2 = new a(context, this.f10816c, cVar2, this.f10823l, this.f10817d, z11, tVar, executor2, executor3, null, this.f10827p, this.f10828q, linkedHashSet2, null, null, null, this.f10818e, this.f10826o, false, null, null);
        aVar2.f10722v = this.f10829r;
        Class D = a.a.D(this.f10814a);
        Package r42 = D.getPackage();
        if (r42 == null || (str = r42.getName()) == null) {
            str = "";
        }
        String canonicalName = D.getCanonicalName();
        canonicalName.getClass();
        if (str.length() != 0) {
            canonicalName = canonicalName.substring(str.length() + 1);
        }
        String replace = canonicalName.replace('.', '_');
        replace.getClass();
        String concat = replace.concat("_Impl");
        try {
            Class<?> cls = Class.forName(str.length() == 0 ? concat : str + '.' + concat, true, D.getClassLoader());
            cls.getClass();
            u uVar = (u) cls.getDeclaredConstructor(null).newInstance(null);
            uVar.getClass();
            uVar.f10842k = aVar2.f10722v;
            try {
                hVar = uVar.f();
                hVar.getClass();
            } catch (hd.k unused) {
                hVar = null;
            }
            uVar.f10838e = hVar == null ? new q(aVar2, new a1.d(23, uVar), new a3.z(2, uVar, w.class, "compatTransactionCoroutineExecute", "compatTransactionCoroutineExecute(Landroidx/room/RoomDatabase;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 1, 2)) : new q(aVar2, hVar, new a3.z(2, uVar, w.class, "compatTransactionCoroutineExecute", "compatTransactionCoroutineExecute(Landroidx/room/RoomDatabase;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 1, 3));
            uVar.f10839f = uVar.e();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Set l10 = uVar.l();
            List list = aVar2.f10718r;
            int size = list.size();
            boolean[] zArr = new boolean[size];
            Iterator it2 = l10.iterator();
            while (true) {
                int i3 = -1;
                if (it2.hasNext()) {
                    ce.b bVar = (ce.b) it2.next();
                    int size2 = list.size() - 1;
                    if (size2 >= 0) {
                        while (true) {
                            int i10 = size2 - 1;
                            if (((wd.h) bVar).d(list.get(size2))) {
                                zArr[size2] = true;
                                i3 = size2;
                                break;
                            }
                            if (i10 < 0) {
                                break;
                            }
                            size2 = i10;
                        }
                    }
                    if (i3 < 0) {
                        a1.c(((wd.h) bVar).b(), ") is missing in the database configuration.", "A required auto migration spec (");
                        return null;
                    }
                    linkedHashMap.put(bVar, list.get(i3));
                } else {
                    int size3 = list.size() - 1;
                    if (size3 >= 0) {
                        while (true) {
                            int i11 = size3 - 1;
                            if (size3 >= size || !zArr[size3]) {
                                break;
                            }
                            if (i11 < 0) {
                                break;
                            }
                            size3 = i11;
                        }
                        a1.e("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
                        return null;
                    }
                    for (c5.a aVar3 : uVar.d(linkedHashMap)) {
                        int i12 = aVar3.f1803a;
                        int i13 = aVar3.f1804b;
                        k4.d dVar2 = aVar2.f10706d;
                        LinkedHashMap linkedHashMap2 = dVar2.f5388a;
                        if (linkedHashMap2.containsKey(Integer.valueOf(i12))) {
                            Map map = (Map) linkedHashMap2.get(Integer.valueOf(i12));
                            if (map == null) {
                                map = kotlin.collections.k0.f5575d;
                                map.getClass();
                            }
                            z10 = map.containsKey(Integer.valueOf(i13));
                        } else {
                            z10 = false;
                        }
                        if (!z10) {
                            dVar2.b(aVar3);
                        }
                    }
                    LinkedHashMap n10 = uVar.n();
                    List list2 = aVar2.f10717q;
                    boolean[] zArr2 = new boolean[list2.size()];
                    for (Map.Entry entry : n10.entrySet()) {
                        ce.b bVar2 = (ce.b) entry.getKey();
                        for (ce.b bVar3 : (List) entry.getValue()) {
                            int size4 = list2.size() - 1;
                            if (size4 >= 0) {
                                while (true) {
                                    int i14 = size4 - 1;
                                    if (((wd.h) bVar3).d(list2.get(size4))) {
                                        zArr2[size4] = true;
                                        break;
                                    }
                                    if (i14 < 0) {
                                        break;
                                    }
                                    size4 = i14;
                                }
                            }
                            size4 = -1;
                            if (size4 < 0) {
                                a1.f("A required type converter (", ((wd.h) bVar3).b(), ") for ", ((wd.h) bVar2).b(), " is missing in the database configuration.");
                                return null;
                            }
                            Object obj = list2.get(size4);
                            bVar3.getClass();
                            obj.getClass();
                            uVar.j.put(bVar3, obj);
                        }
                    }
                    int size5 = list2.size() - 1;
                    if (size5 >= 0) {
                        while (true) {
                            int i15 = size5 - 1;
                            if (!zArr2[size5]) {
                                a1.g(list2.get(size5), ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.", "Unexpected type converter ");
                                return null;
                            }
                            if (i15 < 0) {
                                break;
                            }
                            size5 = i15;
                        }
                    }
                    uVar.f10836c = aVar2.f10709h;
                    uVar.f10837d = new d6.l(aVar2.f10710i, 1);
                    Executor executor4 = uVar.f10836c;
                    if (executor4 == null) {
                        Intrinsics.f("internalQueryExecutor");
                        throw null;
                    }
                    le.d b10 = ge.a0.b(kotlin.coroutines.e.c(ge.a0.k(executor4), ge.a0.d()));
                    uVar.f10834a = b10;
                    CoroutineContext coroutineContext = b10.f5969d;
                    d6.l lVar = uVar.f10837d;
                    if (lVar == null) {
                        Intrinsics.f("internalTransactionExecutor");
                        throw null;
                    }
                    uVar.f10835b = coroutineContext.p(ge.a0.k(lVar));
                    uVar.f10840h = aVar2.f10708f;
                    q qVar2 = uVar.f10838e;
                    if (qVar2 == null) {
                        Intrinsics.f("connectionManager");
                        throw null;
                    }
                    j5.d dVar3 = qVar2.g;
                    if (dVar3 != null) {
                        while (!(dVar3 instanceof d5.b)) {
                            if (dVar3 instanceof b) {
                                dVar3 = ((b) dVar3).a();
                            }
                        }
                        qVar = uVar.f10838e;
                        if (qVar != null) {
                            Intrinsics.f("connectionManager");
                            throw null;
                        }
                        j5.d dVar4 = qVar.g;
                        if (dVar4 != null) {
                            while (!(dVar4 instanceof d5.a)) {
                                if (dVar4 instanceof b) {
                                    dVar4 = ((b) dVar4).a();
                                }
                            }
                            dVar = dVar4;
                            return uVar;
                        }
                        dVar = null;
                        return uVar;
                    }
                    dVar3 = null;
                    qVar = uVar.f10838e;
                    if (qVar != null) {
                    }
                }
            }
        } catch (ClassNotFoundException e2) {
            throw new RuntimeException("Cannot find implementation for " + D.getCanonicalName() + ". " + concat + " does not exist. Is Room annotation processor correctly configured?", e2);
        } catch (IllegalAccessException e9) {
            throw new RuntimeException("Cannot access the constructor " + D.getCanonicalName(), e9);
        } catch (InstantiationException e10) {
            throw new RuntimeException("Failed to create an instance of " + D.getCanonicalName(), e10);
        }
    }
}
