package I;

import android.app.ActivityManager;
import android.content.Intent;
import android.os.Trace;
import com.gatesof.olympus.martu.marku.App;
import com.gatesof.olympus.martu.marku.data.db.AppDatabase;
import h.C0445b;
import h.ExecutorC0444a;
import j.C0519A;
import j.C0541o;
import j.C0547u;
import j.C0552z;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import m2.C0657g;
import n2.AbstractC0730j;
import n2.AbstractC0737q;
import t0.AbstractC0993f;
import t0.C0990c;
import t0.C1006t;
import t0.C1011y;
import t0.InterfaceC1009w;
import w1.ExecutorC1177D;

/* renamed from: I.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0174t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2910a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2911b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f2912c;

    /* renamed from: d, reason: collision with root package name */
    public Object f2913d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f2914e;

    /* renamed from: f, reason: collision with root package name */
    public Object f2915f;

    /* renamed from: g, reason: collision with root package name */
    public Object f2916g;

    /* renamed from: h, reason: collision with root package name */
    public Object f2917h;

    /* renamed from: i, reason: collision with root package name */
    public Object f2918i;

    /* JADX WARN: Removed duplicated region for block: B:77:0x0218 A[LOOP:4: B:65:0x01e9->B:77:0x0218, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0222 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0174t(App app) {
        this.f2910a = 1;
        AppDatabase.Companion.getClass();
        if (AbstractC0730j.K("salon_ledger.db")) {
            throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        m.y0 y0Var = new m.y0(7);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        A1.i iVar = new A1.i(0, false);
        Object systemService = app.getSystemService("activity");
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        G2.m mVar = new G2.m(app, iVar, y0Var, arrayList, (activityManager == null || activityManager.isLowRamDevice()) ? 2 : 3, null, linkedHashSet, arrayList2, arrayList3);
        Package r12 = AppDatabase.class.getPackage();
        f2.j.c(r12);
        String name = r12.getName();
        String canonicalName = AppDatabase.class.getCanonicalName();
        f2.j.c(canonicalName);
        f2.j.e(name, "fullPackage");
        if (name.length() != 0) {
            canonicalName = canonicalName.substring(name.length() + 1);
            f2.j.e(canonicalName, "this as java.lang.String).substring(startIndex)");
        }
        String concat = AbstractC0737q.w(canonicalName, '.', '_').concat("_Impl");
        try {
            Class<?> cls = Class.forName(name.length() == 0 ? concat : name + '.' + concat, true, AppDatabase.class.getClassLoader());
            f2.j.d(cls, "null cannot be cast to non-null type java.lang.Class<T of androidx.room.Room.getGeneratedImplementation>");
            w1.z zVar = (w1.z) cls.getDeclaredConstructor(null).newInstance(null);
            zVar.getClass();
            zVar.f9922d = zVar.d(mVar);
            Set h3 = zVar.h();
            BitSet bitSet = new BitSet();
            Iterator it = h3.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                LinkedHashMap linkedHashMap = zVar.f9925g;
                ArrayList arrayList4 = (ArrayList) mVar.f2213i;
                int i3 = -1;
                if (hasNext) {
                    Class cls2 = (Class) it.next();
                    int size = arrayList4.size() - 1;
                    if (size >= 0) {
                        while (true) {
                            int i4 = size - 1;
                            if (cls2.isAssignableFrom(arrayList4.get(size).getClass())) {
                                bitSet.set(size);
                                i3 = size;
                                break;
                            } else if (i4 < 0) {
                                break;
                            } else {
                                size = i4;
                            }
                        }
                    }
                    if (i3 < 0) {
                        throw new IllegalArgumentException(("A required auto migration spec (" + cls2.getCanonicalName() + ") is missing in the database configuration.").toString());
                    }
                    linkedHashMap.put(cls2, arrayList4.get(i3));
                } else {
                    int size2 = arrayList4.size() - 1;
                    if (size2 >= 0) {
                        while (true) {
                            int i5 = size2 - 1;
                            if (!bitSet.get(size2)) {
                                throw new IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
                            }
                            if (i5 < 0) {
                                break;
                            } else {
                                size2 = i5;
                            }
                        }
                    }
                    Iterator it2 = zVar.f(linkedHashMap).iterator();
                    if (it2.hasNext()) {
                        it2.next().getClass();
                        throw new ClassCastException();
                    }
                    w1.q qVar = zVar.f9923e;
                    zVar.g().setWriteAheadLoggingEnabled(mVar.f2207c == 3);
                    zVar.f9924f = mVar.f2206b;
                    zVar.f9920b = C0445b.f5848f;
                    zVar.f9921c = new ExecutorC1177D();
                    Intent intent = (Intent) mVar.f2212h;
                    if (intent != null) {
                        qVar.getClass();
                        App app2 = (App) mVar.f2209e;
                        ExecutorC0444a executorC0444a = qVar.f9889a.f9920b;
                        if (executorC0444a == null) {
                            f2.j.j("internalQueryExecutor");
                            throw null;
                        }
                        new w1.v(app2, intent, qVar, executorC0444a);
                    }
                    Map i6 = zVar.i();
                    BitSet bitSet2 = new BitSet();
                    Iterator it3 = i6.entrySet().iterator();
                    while (true) {
                        boolean hasNext2 = it3.hasNext();
                        ArrayList arrayList5 = mVar.f2208d;
                        if (!hasNext2) {
                            int size3 = arrayList5.size() - 1;
                            if (size3 >= 0) {
                                while (true) {
                                    int i7 = size3 - 1;
                                    if (!bitSet2.get(size3)) {
                                        throw new IllegalArgumentException("Unexpected type converter " + arrayList5.get(size3) + ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
                                    }
                                    if (i7 < 0) {
                                        break;
                                    } else {
                                        size3 = i7;
                                    }
                                }
                            }
                            AppDatabase appDatabase = (AppDatabase) zVar;
                            G1.b m3 = appDatabase.m();
                            f2.j.f(m3, "dao");
                            B.Y y3 = new B.Y();
                            y3.f334d = m3;
                            G1.j n3 = appDatabase.n();
                            f2.j.f(n3, "dao");
                            B.Y y4 = new B.Y();
                            y4.f334d = n3;
                            this.f2911b = new K1.b(y3);
                            this.f2912c = new K1.b(y3);
                            this.f2913d = new K1.b(y3);
                            this.f2914e = new K1.b(y3);
                            this.f2915f = new K1.a(y4);
                            this.f2916g = new K1.a(y4);
                            this.f2917h = new K1.a(y4);
                            this.f2918i = new K1.a(y4);
                            return;
                        }
                        Map.Entry entry = (Map.Entry) it3.next();
                        Class cls3 = (Class) entry.getKey();
                        for (Class cls4 : (List) entry.getValue()) {
                            int size4 = arrayList5.size() - 1;
                            if (size4 >= 0) {
                                while (true) {
                                    int i8 = size4 - 1;
                                    if (cls4.isAssignableFrom(arrayList5.get(size4).getClass())) {
                                        bitSet2.set(size4);
                                        break;
                                    } else if (i8 < 0) {
                                        break;
                                    } else {
                                        size4 = i8;
                                    }
                                }
                                if (size4 >= 0) {
                                    throw new IllegalArgumentException(("A required type converter (" + cls4 + ") for " + cls3.getCanonicalName() + " is missing in the database configuration.").toString());
                                }
                                zVar.f9929k.put(cls4, arrayList5.get(size4));
                            }
                            size4 = -1;
                            if (size4 >= 0) {
                            }
                        }
                    }
                }
            }
        } catch (ClassNotFoundException unused) {
            throw new RuntimeException("Cannot find implementation for " + AppDatabase.class.getCanonicalName() + ". " + concat + " does not exist");
        } catch (IllegalAccessException unused2) {
            throw new RuntimeException("Cannot access the constructor " + AppDatabase.class.getCanonicalName());
        } catch (InstantiationException unused3) {
            throw new RuntimeException("Failed to create an instance of " + AppDatabase.class.getCanonicalName());
        }
    }

    public static final void a(C0174t c0174t, U.p pVar, t0.b0 b0Var) {
        c0174t.getClass();
        for (U.p pVar2 = pVar.f4493h; pVar2 != null; pVar2 = pVar2.f4493h) {
            if (pVar2 == t0.Y.f8682a) {
                t0.E s3 = ((t0.E) c0174t.f2911b).s();
                b0Var.f8713q = s3 != null ? (C1006t) s3.f8561y.f2912c : null;
                c0174t.f2913d = b0Var;
                return;
            } else {
                if ((pVar2.f4491f & 2) != 0) {
                    return;
                }
                pVar2.x0(b0Var);
            }
        }
    }

    public static U.p b(U.o oVar, U.p pVar) {
        U.p pVar2;
        if (oVar instanceof t0.U) {
            pVar2 = ((t0.U) oVar).l();
            pVar2.f4491f = t0.c0.g(pVar2);
        } else {
            C0990c c0990c = new C0990c();
            c0990c.f4491f = t0.c0.e(oVar);
            c0990c.f8723q = oVar;
            c0990c.f8725s = new HashSet();
            pVar2 = c0990c;
        }
        if (pVar2.f4501p) {
            n.z0.o("A ModifierNodeElement cannot return an already attached node from create() ");
            throw null;
        }
        pVar2.f4497l = true;
        U.p pVar3 = pVar.f4494i;
        if (pVar3 != null) {
            pVar3.f4493h = pVar2;
            pVar2.f4494i = pVar3;
        }
        pVar.f4494i = pVar2;
        pVar2.f4493h = pVar;
        return pVar2;
    }

    public static U.p c(U.p pVar) {
        boolean z3 = pVar.f4501p;
        if (z3) {
            C0547u c0547u = t0.c0.f8726a;
            if (!z3) {
                n.z0.o("autoInvalidateRemovedNode called on unattached node");
                throw null;
            }
            t0.c0.b(pVar, -1, 2);
            pVar.v0();
            pVar.p0();
        }
        U.p pVar2 = pVar.f4494i;
        U.p pVar3 = pVar.f4493h;
        if (pVar2 != null) {
            pVar2.f4493h = pVar3;
            pVar.f4494i = null;
        }
        if (pVar3 != null) {
            pVar3.f4494i = pVar2;
            pVar.f4493h = null;
        }
        f2.j.c(pVar3);
        return pVar3;
    }

    public static void l(U.o oVar, U.o oVar2, U.p pVar) {
        if ((oVar instanceof t0.U) && (oVar2 instanceof t0.U)) {
            t0.X x3 = t0.Y.f8682a;
            f2.j.d(pVar, "null cannot be cast to non-null type T of androidx.compose.ui.node.NodeChainKt.updateUnsafe");
            ((t0.U) oVar2).m(pVar);
            if (pVar.f4501p) {
                t0.c0.d(pVar);
                return;
            } else {
                pVar.f4498m = true;
                return;
            }
        }
        if (!(pVar instanceof C0990c)) {
            throw new IllegalStateException("Unknown Modifier.Node type");
        }
        C0990c c0990c = (C0990c) pVar;
        if (c0990c.f4501p) {
            c0990c.z0();
        }
        c0990c.f8723q = oVar2;
        c0990c.f4491f = t0.c0.e(oVar2);
        if (c0990c.f4501p) {
            c0990c.y0(false);
        }
        if (pVar.f4501p) {
            t0.c0.d(pVar);
        } else {
            pVar.f4498m = true;
        }
    }

    public void d() {
        C0552z c0552z = (C0552z) this.f2911b;
        if (c0552z.isEmpty()) {
            return;
        }
        Trace.beginSection("Compose:abandons");
        try {
            Iterator it = c0552z.iterator();
            while (((C0657g) ((O.c) it).f3723f).hasNext()) {
                A0 a02 = (A0) ((C0657g) ((O.c) it).f3723f).next();
                ((O.c) it).remove();
                a02.c();
            }
        } finally {
            Trace.endSection();
        }
    }

    public void e() {
        g(Integer.MIN_VALUE);
        ArrayList arrayList = (ArrayList) this.f2913d;
        boolean isEmpty = arrayList.isEmpty();
        C0552z c0552z = (C0552z) this.f2911b;
        if (!isEmpty) {
            Trace.beginSection("Compose:onForgotten");
            try {
                C0519A c0519a = (C0519A) this.f2916g;
                int size = arrayList.size();
                while (true) {
                    size--;
                    if (-1 >= size) {
                        break;
                    }
                    Object obj = arrayList.get(size);
                    if (obj instanceof A0) {
                        c0552z.remove(obj);
                        ((A0) obj).a();
                    }
                    if (obj instanceof InterfaceC0155j) {
                        if (c0519a == null || !c0519a.c(obj)) {
                            ((InterfaceC0155j) obj).a();
                        } else {
                            ((InterfaceC0155j) obj).c();
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        ArrayList arrayList2 = (ArrayList) this.f2912c;
        if (arrayList2.isEmpty()) {
            return;
        }
        Trace.beginSection("Compose:onRemembered");
        try {
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                A0 a02 = (A0) arrayList2.get(i3);
                c0552z.remove(a02);
                a02.b();
            }
        } finally {
            Trace.endSection();
        }
    }

    public boolean f(int i3) {
        return (i3 & ((U.p) this.f2915f).f4492g) != 0;
    }

    public void g(int i3) {
        ArrayList arrayList = (ArrayList) this.f2915f;
        if (arrayList.isEmpty()) {
            return;
        }
        int i4 = 0;
        ArrayList arrayList2 = null;
        int i5 = 0;
        C0541o c0541o = null;
        C0541o c0541o2 = null;
        while (true) {
            C0541o c0541o3 = (C0541o) this.f2918i;
            if (i5 >= c0541o3.f6301b) {
                break;
            }
            if (i3 <= c0541o3.c(i5)) {
                Object remove = arrayList.remove(i5);
                int d3 = c0541o3.d(i5);
                int d4 = ((C0541o) this.f2917h).d(i5);
                if (arrayList2 == null) {
                    arrayList2 = S1.m.C0(remove);
                    c0541o2 = new C0541o();
                    c0541o2.a(d3);
                    c0541o = new C0541o();
                    c0541o.a(d4);
                } else {
                    f2.j.d(c0541o, "null cannot be cast to non-null type androidx.collection.MutableIntList");
                    f2.j.d(c0541o2, "null cannot be cast to non-null type androidx.collection.MutableIntList");
                    arrayList2.add(remove);
                    c0541o2.a(d3);
                    c0541o.a(d4);
                }
            } else {
                i5++;
            }
        }
        if (arrayList2 != null) {
            f2.j.d(c0541o, "null cannot be cast to non-null type androidx.collection.MutableIntList");
            f2.j.d(c0541o2, "null cannot be cast to non-null type androidx.collection.MutableIntList");
            int size = arrayList2.size() - 1;
            while (i4 < size) {
                int i6 = i4 + 1;
                int size2 = arrayList2.size();
                for (int i7 = i6; i7 < size2; i7++) {
                    int c2 = c0541o2.c(i4);
                    int c3 = c0541o2.c(i7);
                    if (c2 < c3 || (c3 == c2 && c0541o.c(i4) < c0541o.c(i7))) {
                        Object obj = arrayList2.get(i4);
                        arrayList2.set(i4, arrayList2.get(i7));
                        arrayList2.set(i7, obj);
                        int c4 = c0541o.c(i4);
                        c0541o.e(i4, c0541o.c(i7));
                        c0541o.e(i7, c4);
                        int c5 = c0541o2.c(i4);
                        c0541o2.e(i4, c0541o2.c(i7));
                        c0541o2.e(i7, c5);
                    }
                }
                i4 = i6;
            }
            ((ArrayList) this.f2913d).addAll(arrayList2);
        }
    }

    public void h(Object obj, int i3, int i4, int i5) {
        g(i3);
        if (i5 < 0 || i5 >= i3) {
            ((ArrayList) this.f2913d).add(obj);
            return;
        }
        ((ArrayList) this.f2915f).add(obj);
        ((C0541o) this.f2917h).a(i4);
        ((C0541o) this.f2918i).a(i5);
    }

    public void i() {
        for (U.p pVar = (U.p) this.f2915f; pVar != null; pVar = pVar.f4494i) {
            pVar.u0();
            if (pVar.f4497l) {
                t0.c0.a(pVar);
            }
            if (pVar.f4498m) {
                t0.c0.d(pVar);
            }
            pVar.f4497l = false;
            pVar.f4498m = false;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r11v13 ??, still in use, count: 1, list:
          (r11v13 ?? I:java.lang.Object) from 0x0020: IPUT (r11v13 ?? I:java.lang.Object), (r29v0 'this' ?? I:I.t A[IMMUTABLE_TYPE, THIS]) (LINE:33) I.t.i java.lang.Object
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    public void j(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r11v13 ??, still in use, count: 1, list:
          (r11v13 ?? I:java.lang.Object) from 0x0020: IPUT (r11v13 ?? I:java.lang.Object), (r29v0 'this' ?? I:I.t A[IMMUTABLE_TYPE, THIS]) (LINE:33) I.t.i java.lang.Object
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r30v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:238)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */

    public void k() {
        t0.E e3;
        C1011y c1011y;
        U.p pVar = ((t0.p0) this.f2914e).f4493h;
        t0.b0 b0Var = (C1006t) this.f2912c;
        U.p pVar2 = pVar;
        while (true) {
            e3 = (t0.E) this.f2911b;
            if (pVar2 == null) {
                break;
            }
            InterfaceC1009w g3 = AbstractC0993f.g(pVar2);
            if (g3 != null) {
                t0.b0 b0Var2 = pVar2.f4496k;
                if (b0Var2 != null) {
                    C1011y c1011y2 = (C1011y) b0Var2;
                    InterfaceC1009w interfaceC1009w = c1011y2.f8802M;
                    c1011y2.i1(g3);
                    c1011y = c1011y2;
                    if (interfaceC1009w != pVar2) {
                        t0.g0 g0Var = c1011y2.f8710G;
                        c1011y = c1011y2;
                        if (g0Var != null) {
                            g0Var.invalidate();
                            c1011y = c1011y2;
                        }
                    }
                } else {
                    C1011y c1011y3 = new C1011y(e3, g3);
                    pVar2.x0(c1011y3);
                    c1011y = c1011y3;
                }
                b0Var.f8713q = c1011y;
                c1011y.f8712p = b0Var;
                b0Var = c1011y;
            } else {
                pVar2.x0(b0Var);
            }
            pVar2 = pVar2.f4493h;
        }
        t0.E s3 = e3.s();
        b0Var.f8713q = s3 != null ? (C1006t) s3.f8561y.f2912c : null;
        this.f2913d = b0Var;
    }

    public String toString() {
        switch (this.f2910a) {
            case k1.i.FLOAT_FIELD_NUMBER /* 2 */:
                StringBuilder sb = new StringBuilder("[");
                U.p pVar = (U.p) this.f2915f;
                t0.p0 p0Var = (t0.p0) this.f2914e;
                if (pVar == p0Var) {
                    sb.append("]");
                } else {
                    while (true) {
                        if (pVar != null && pVar != p0Var) {
                            sb.append(String.valueOf(pVar));
                            if (pVar.f4494i == p0Var) {
                                sb.append("]");
                            } else {
                                sb.append(",");
                                pVar = pVar.f4494i;
                            }
                        }
                    }
                }
                String sb2 = sb.toString();
                f2.j.e(sb2, "StringBuilder().apply(builderAction).toString()");
                return sb2;
            default:
                return super.toString();
        }
    }

    public C0174t(t0.E e3) {
        this.f2910a = 2;
        this.f2911b = e3;
        C1006t c1006t = new C1006t(e3);
        this.f2912c = c1006t;
        this.f2913d = c1006t;
        t0.p0 p0Var = c1006t.f8789M;
        this.f2914e = p0Var;
        this.f2915f = p0Var;
    }

    public C0174t(C0552z c0552z) {
        this.f2910a = 0;
        this.f2911b = c0552z;
        this.f2912c = new ArrayList();
        this.f2913d = new ArrayList();
        this.f2914e = new ArrayList();
        this.f2915f = new ArrayList();
        this.f2917h = new C0541o();
        this.f2918i = new C0541o();
    }
}
