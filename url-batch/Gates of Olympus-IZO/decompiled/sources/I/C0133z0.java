package I;

import j.AbstractC0479E;
import j.C0475A;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import k2.C0536h;

/* renamed from: I.z0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0133z0 extends R1.i implements Y1.f {

    /* renamed from: e, reason: collision with root package name */
    public List f2414e;

    /* renamed from: f, reason: collision with root package name */
    public List f2415f;

    /* renamed from: g, reason: collision with root package name */
    public List f2416g;

    /* renamed from: h, reason: collision with root package name */
    public C0475A f2417h;

    /* renamed from: i, reason: collision with root package name */
    public C0475A f2418i;

    /* renamed from: j, reason: collision with root package name */
    public C0475A f2419j;

    /* renamed from: k, reason: collision with root package name */
    public Set f2420k;

    /* renamed from: l, reason: collision with root package name */
    public C0475A f2421l;

    /* renamed from: m, reason: collision with root package name */
    public int f2422m;

    /* renamed from: n, reason: collision with root package name */
    public /* synthetic */ Y f2423n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ A0 f2424o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0133z0(A0 a02, P1.d dVar) {
        super(3, dVar);
        this.f2424o = a02;
    }

    public static final void k(A0 a02, List list, List list2, List list3, C0475A c0475a, C0475A c0475a2, C0475A c0475a3, C0475A c0475a4) {
        synchronized (a02.f2061b) {
            try {
                list.clear();
                list2.clear();
                int size = list3.size();
                for (int i3 = 0; i3 < size; i3++) {
                    C0122u c0122u = (C0122u) list3.get(i3);
                    c0122u.a();
                    a02.B(c0122u);
                }
                list3.clear();
                Object[] objArr = c0475a.f5130b;
                long[] jArr = c0475a.f5129a;
                int length = jArr.length - 2;
                long j3 = -9187201950435737472L;
                if (length >= 0) {
                    int i4 = 0;
                    while (true) {
                        long j4 = jArr[i4];
                        long[] jArr2 = jArr;
                        if ((((~j4) << 7) & j4 & j3) != j3) {
                            int i5 = 8 - ((~(i4 - length)) >>> 31);
                            for (int i6 = 0; i6 < i5; i6++) {
                                if ((j4 & 255) < 128) {
                                    C0122u c0122u2 = (C0122u) objArr[(i4 << 3) + i6];
                                    c0122u2.a();
                                    a02.B(c0122u2);
                                }
                                j4 >>= 8;
                            }
                            if (i5 != 8) {
                                break;
                            }
                        }
                        if (i4 == length) {
                            break;
                        }
                        i4++;
                        jArr = jArr2;
                        j3 = -9187201950435737472L;
                    }
                }
                c0475a.b();
                Object[] objArr2 = c0475a2.f5130b;
                long[] jArr3 = c0475a2.f5129a;
                int length2 = jArr3.length - 2;
                if (length2 >= 0) {
                    int i7 = 0;
                    while (true) {
                        long j5 = jArr3[i7];
                        if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i8 = 8 - ((~(i7 - length2)) >>> 31);
                            for (int i9 = 0; i9 < i8; i9++) {
                                if ((j5 & 255) < 128) {
                                    ((C0122u) objArr2[(i7 << 3) + i9]).g();
                                }
                                j5 >>= 8;
                            }
                            if (i8 != 8) {
                                break;
                            }
                        }
                        if (i7 == length2) {
                            break;
                        } else {
                            i7++;
                        }
                    }
                }
                c0475a2.b();
                c0475a3.b();
                Object[] objArr3 = c0475a4.f5130b;
                long[] jArr4 = c0475a4.f5129a;
                int length3 = jArr4.length - 2;
                if (length3 >= 0) {
                    int i10 = 0;
                    while (true) {
                        long j6 = jArr4[i10];
                        if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i11 = 8 - ((~(i10 - length3)) >>> 31);
                            for (int i12 = 0; i12 < i11; i12++) {
                                if ((j6 & 255) < 128) {
                                    C0122u c0122u3 = (C0122u) objArr3[(i10 << 3) + i12];
                                    c0122u3.a();
                                    a02.B(c0122u3);
                                }
                                j6 >>= 8;
                            }
                            if (i11 != 8) {
                                break;
                            }
                        }
                        if (i10 == length3) {
                            break;
                        } else {
                            i10++;
                        }
                    }
                }
                c0475a4.b();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final void l(List list, A0 a02) {
        list.clear();
        synchronized (a02.f2061b) {
            try {
                ArrayList arrayList = a02.f2069j;
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    list.add((AbstractC0084a0) arrayList.get(i3));
                }
                a02.f2069j.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // Y1.f
    public final Object f(Object obj, Object obj2, Object obj3) {
        C0133z0 c0133z0 = new C0133z0(this.f2424o, (P1.d) obj3);
        c0133z0.f2423n = (Y) obj2;
        c0133z0.invokeSuspend(L1.z.f2729a);
        return Q1.a.f3113d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0099 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0158 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v12, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r15v9, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v15, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r6v17, types: [java.util.Set] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x014c -> B:6:0x0153). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x01fa -> B:24:0x0094). Please report as a decompilation issue!!! */
    @Override // R1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Y y3;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        C0475A c0475a;
        C0475A c0475a2;
        C0475A c0475a3;
        K.f fVar;
        C0475A c0475a4;
        K.f fVar2;
        ArrayList arrayList4;
        ArrayList arrayList5;
        C0475A c0475a5;
        C0475A c0475a6;
        ArrayList arrayList6;
        Object obj2;
        C0536h c0536h;
        ArrayList arrayList7;
        C0475A c0475a7;
        M1.u uVar;
        C0133z0 c0133z0 = this;
        int i3 = 1;
        Q1.a aVar = Q1.a.f3113d;
        int i4 = c0133z0.f2422m;
        if (i4 == 0) {
            I2.l.Q(obj);
            y3 = c0133z0.f2423n;
            arrayList = new ArrayList();
            arrayList2 = new ArrayList();
            arrayList3 = new ArrayList();
            int i5 = AbstractC0479E.f5137a;
            c0475a = new C0475A();
            c0475a2 = new C0475A();
            c0475a3 = new C0475A();
            fVar = new K.f(c0475a3);
            c0475a4 = new C0475A();
            synchronized (c0133z0.f2424o.f2061b) {
            }
        } else if (i4 == 1) {
            C0475A c0475a8 = c0133z0.f2421l;
            Set set = c0133z0.f2420k;
            C0475A c0475a9 = c0133z0.f2419j;
            C0475A c0475a10 = c0133z0.f2418i;
            c0475a = c0133z0.f2417h;
            ?? r10 = c0133z0.f2416g;
            ?? r11 = c0133z0.f2415f;
            ?? r12 = c0133z0.f2414e;
            Y y4 = c0133z0.f2423n;
            I2.l.Q(obj);
            fVar2 = set;
            arrayList5 = r10;
            arrayList4 = r11;
            arrayList6 = r12;
            c0475a6 = c0475a8;
            c0475a3 = c0475a9;
            c0475a5 = c0475a10;
            y3 = y4;
            C0475A c0475a11 = c0475a;
            if (A0.q(c0133z0.f2424o)) {
            }
        } else {
            if (i4 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C0475A c0475a12 = c0133z0.f2421l;
            Set set2 = c0133z0.f2420k;
            C0475A c0475a13 = c0133z0.f2419j;
            C0475A c0475a14 = c0133z0.f2418i;
            c0475a = c0133z0.f2417h;
            ?? r102 = c0133z0.f2416g;
            ?? r112 = c0133z0.f2415f;
            ?? r122 = c0133z0.f2414e;
            Y y5 = c0133z0.f2423n;
            I2.l.Q(obj);
            arrayList6 = r122;
            fVar = set2;
            Q1.a aVar2 = aVar;
            C0475A c0475a15 = c0475a14;
            arrayList3 = r102;
            c0475a4 = c0475a12;
            y3 = y5;
            c0475a3 = c0475a13;
            arrayList2 = r112;
            A0 a02 = c0133z0.f2424o;
            synchronized (a02.f2061b) {
                try {
                    if (a02.f2070k.isEmpty()) {
                        arrayList7 = arrayList6;
                        c0475a7 = c0475a15;
                        uVar = M1.u.f2803d;
                    } else {
                        Collection values = a02.f2070k.values();
                        Z1.i.f(values, "<this>");
                        ArrayList arrayList8 = new ArrayList();
                        Iterator it = values.iterator();
                        while (it.hasNext()) {
                            M1.r.i0((Iterable) it.next(), arrayList8);
                        }
                        a02.f2070k.clear();
                        ?? arrayList9 = new ArrayList(arrayList8.size());
                        int size = arrayList8.size();
                        int i6 = 0;
                        while (i6 < size) {
                            int i7 = size;
                            AbstractC0084a0 abstractC0084a0 = (AbstractC0084a0) arrayList8.get(i6);
                            arrayList9.add(new L1.j(abstractC0084a0, a02.f2071l.get(abstractC0084a0)));
                            i6++;
                            arrayList6 = arrayList6;
                            size = i7;
                            c0475a15 = c0475a15;
                        }
                        arrayList7 = arrayList6;
                        c0475a7 = c0475a15;
                        a02.f2071l.clear();
                        uVar = arrayList9;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            int size2 = uVar.size();
            for (int i8 = 0; i8 < size2; i8++) {
                L1.j jVar = (L1.j) uVar.get(i8);
            }
            c0133z0 = this;
            aVar = aVar2;
            arrayList = arrayList7;
            c0475a2 = c0475a7;
            i3 = 1;
            synchronized (c0133z0.f2424o.f2061b) {
            }
            A0 a03 = c0133z0.f2424o;
            c0133z0.f2423n = y3;
            c0133z0.f2414e = arrayList;
            c0133z0.f2415f = arrayList2;
            c0133z0.f2416g = arrayList3;
            c0133z0.f2417h = c0475a;
            c0133z0.f2418i = c0475a2;
            c0133z0.f2419j = c0475a3;
            c0133z0.f2420k = fVar;
            c0133z0.f2421l = c0475a4;
            c0133z0.f2422m = i3;
            if (a03.v()) {
                obj2 = L1.z.f2729a;
            } else {
                C0536h c0536h2 = new C0536h(i3, M1.B.G(this));
                c0536h2.q();
                synchronized (a03.f2061b) {
                    if (a03.v()) {
                        c0536h = c0536h2;
                    } else {
                        a03.f2074o = c0536h2;
                        c0536h = null;
                    }
                }
                if (c0536h != null) {
                    c0536h.resumeWith(L1.z.f2729a);
                }
                obj2 = c0536h2.p();
                if (obj2 != Q1.a.f3113d) {
                    obj2 = L1.z.f2729a;
                }
            }
            if (obj2 == aVar) {
                return aVar;
            }
            arrayList6 = arrayList;
            arrayList4 = arrayList2;
            arrayList5 = arrayList3;
            fVar2 = fVar;
            c0475a5 = c0475a2;
            c0475a6 = c0475a4;
            C0475A c0475a112 = c0475a;
            if (A0.q(c0133z0.f2424o)) {
                C0475A c0475a16 = c0475a5;
                c0475a4 = c0475a6;
                c0133z0 = this;
                c0475a = c0475a112;
                fVar = fVar2;
                arrayList2 = arrayList4;
                aVar = aVar;
                c0475a2 = c0475a16;
                arrayList3 = arrayList5;
                arrayList = arrayList6;
                i3 = 1;
                synchronized (c0133z0.f2424o.f2061b) {
                }
            } else {
                Q1.a aVar3 = aVar;
                C0475A c0475a17 = c0475a3;
                C0475A c0475a18 = c0475a5;
                ArrayList arrayList10 = arrayList5;
                ArrayList arrayList11 = arrayList4;
                C0131y0 c0131y0 = new C0131y0(c0133z0.f2424o, c0475a3, c0475a6, arrayList6, arrayList4, c0475a112, arrayList5, c0475a18, fVar2);
                c0133z0.f2423n = y3;
                c0133z0.f2414e = arrayList6;
                c0133z0.f2415f = arrayList11;
                c0133z0.f2416g = arrayList10;
                c0133z0.f2417h = c0475a112;
                c0133z0.f2418i = c0475a18;
                c0133z0.f2419j = c0475a17;
                c0133z0.f2420k = fVar2;
                c0475a4 = c0475a6;
                c0133z0.f2421l = c0475a4;
                c0133z0.f2422m = 2;
                aVar2 = aVar3;
                if (y3.j(c0131y0, c0133z0) == aVar2) {
                    return aVar2;
                }
                c0475a = c0475a112;
                c0475a3 = c0475a17;
                fVar = fVar2;
                arrayList2 = arrayList11;
                c0475a15 = c0475a18;
                arrayList3 = arrayList10;
                A0 a022 = c0133z0.f2424o;
                synchronized (a022.f2061b) {
                }
            }
        }
    }
}
