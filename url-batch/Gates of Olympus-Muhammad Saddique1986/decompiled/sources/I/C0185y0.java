package I;

import e2.InterfaceC0427f;
import j.AbstractC0523E;
import j.C0519A;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import q2.C0821h;

/* renamed from: I.y0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0185y0 extends X1.i implements InterfaceC0427f {

    /* renamed from: h, reason: collision with root package name */
    public List f2969h;

    /* renamed from: i, reason: collision with root package name */
    public List f2970i;

    /* renamed from: j, reason: collision with root package name */
    public List f2971j;

    /* renamed from: k, reason: collision with root package name */
    public C0519A f2972k;

    /* renamed from: l, reason: collision with root package name */
    public C0519A f2973l;

    /* renamed from: m, reason: collision with root package name */
    public C0519A f2974m;

    /* renamed from: n, reason: collision with root package name */
    public Set f2975n;

    /* renamed from: o, reason: collision with root package name */
    public C0519A f2976o;

    /* renamed from: p, reason: collision with root package name */
    public int f2977p;

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ X f2978q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C0187z0 f2979r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0185y0(C0187z0 c0187z0, V1.d dVar) {
        super(3, dVar);
        this.f2979r = c0187z0;
    }

    public static final void s(C0187z0 c0187z0, List list, List list2, List list3, C0519A c0519a, C0519A c0519a2, C0519A c0519a3, C0519A c0519a4) {
        synchronized (c0187z0.f2985b) {
            try {
                list.clear();
                list2.clear();
                int size = list3.size();
                for (int i3 = 0; i3 < size; i3++) {
                    C0176u c0176u = (C0176u) list3.get(i3);
                    c0176u.a();
                    c0187z0.B(c0176u);
                }
                list3.clear();
                Object[] objArr = c0519a.f6248b;
                long[] jArr = c0519a.f6247a;
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
                                    C0176u c0176u2 = (C0176u) objArr[(i4 << 3) + i6];
                                    c0176u2.a();
                                    c0187z0.B(c0176u2);
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
                c0519a.b();
                Object[] objArr2 = c0519a2.f6248b;
                long[] jArr3 = c0519a2.f6247a;
                int length2 = jArr3.length - 2;
                if (length2 >= 0) {
                    int i7 = 0;
                    while (true) {
                        long j5 = jArr3[i7];
                        if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i8 = 8 - ((~(i7 - length2)) >>> 31);
                            for (int i9 = 0; i9 < i8; i9++) {
                                if ((j5 & 255) < 128) {
                                    ((C0176u) objArr2[(i7 << 3) + i9]).g();
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
                c0519a2.b();
                c0519a3.b();
                Object[] objArr3 = c0519a4.f6248b;
                long[] jArr4 = c0519a4.f6247a;
                int length3 = jArr4.length - 2;
                if (length3 >= 0) {
                    int i10 = 0;
                    while (true) {
                        long j6 = jArr4[i10];
                        if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i11 = 8 - ((~(i10 - length3)) >>> 31);
                            for (int i12 = 0; i12 < i11; i12++) {
                                if ((j6 & 255) < 128) {
                                    C0176u c0176u3 = (C0176u) objArr3[(i10 << 3) + i12];
                                    c0176u3.a();
                                    c0187z0.B(c0176u3);
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
                c0519a4.b();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final void v(List list, C0187z0 c0187z0) {
        list.clear();
        synchronized (c0187z0.f2985b) {
            try {
                ArrayList arrayList = c0187z0.f2993j;
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    list.add((AbstractC0138a0) arrayList.get(i3));
                }
                c0187z0.f2993j.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // e2.InterfaceC0427f
    public final Object g(Object obj, Object obj2, Object obj3) {
        C0185y0 c0185y0 = new C0185y0(this.f2979r, (V1.d) obj3);
        c0185y0.f2978q = (X) obj2;
        c0185y0.q(R1.y.f4171a);
        return W1.a.f4608d;
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
    @Override // X1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object q(Object obj) {
        X x3;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        C0519A c0519a;
        C0519A c0519a2;
        C0519A c0519a3;
        K.f fVar;
        C0519A c0519a4;
        K.f fVar2;
        ArrayList arrayList4;
        ArrayList arrayList5;
        C0519A c0519a5;
        C0519A c0519a6;
        ArrayList arrayList6;
        Object obj2;
        C0821h c0821h;
        ArrayList arrayList7;
        C0519A c0519a7;
        S1.u uVar;
        C0185y0 c0185y0 = this;
        int i3 = 1;
        W1.a aVar = W1.a.f4608d;
        int i4 = c0185y0.f2977p;
        if (i4 == 0) {
            R1.a.e(obj);
            x3 = c0185y0.f2978q;
            arrayList = new ArrayList();
            arrayList2 = new ArrayList();
            arrayList3 = new ArrayList();
            int i5 = AbstractC0523E.f6255a;
            c0519a = new C0519A();
            c0519a2 = new C0519A();
            c0519a3 = new C0519A();
            fVar = new K.f(c0519a3);
            c0519a4 = new C0519A();
            synchronized (c0185y0.f2979r.f2985b) {
            }
        } else if (i4 == 1) {
            C0519A c0519a8 = c0185y0.f2976o;
            Set set = c0185y0.f2975n;
            C0519A c0519a9 = c0185y0.f2974m;
            C0519A c0519a10 = c0185y0.f2973l;
            c0519a = c0185y0.f2972k;
            ?? r10 = c0185y0.f2971j;
            ?? r11 = c0185y0.f2970i;
            ?? r12 = c0185y0.f2969h;
            X x4 = c0185y0.f2978q;
            R1.a.e(obj);
            fVar2 = set;
            arrayList5 = r10;
            arrayList4 = r11;
            arrayList6 = r12;
            c0519a6 = c0519a8;
            c0519a3 = c0519a9;
            c0519a5 = c0519a10;
            x3 = x4;
            C0519A c0519a11 = c0519a;
            if (C0187z0.q(c0185y0.f2979r)) {
            }
        } else {
            if (i4 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C0519A c0519a12 = c0185y0.f2976o;
            Set set2 = c0185y0.f2975n;
            C0519A c0519a13 = c0185y0.f2974m;
            C0519A c0519a14 = c0185y0.f2973l;
            c0519a = c0185y0.f2972k;
            ?? r102 = c0185y0.f2971j;
            ?? r112 = c0185y0.f2970i;
            ?? r122 = c0185y0.f2969h;
            X x5 = c0185y0.f2978q;
            R1.a.e(obj);
            arrayList6 = r122;
            fVar = set2;
            W1.a aVar2 = aVar;
            C0519A c0519a15 = c0519a14;
            arrayList3 = r102;
            c0519a4 = c0519a12;
            x3 = x5;
            c0519a3 = c0519a13;
            arrayList2 = r112;
            C0187z0 c0187z0 = c0185y0.f2979r;
            synchronized (c0187z0.f2985b) {
                try {
                    if (c0187z0.f2994k.isEmpty()) {
                        arrayList7 = arrayList6;
                        c0519a7 = c0519a15;
                        uVar = S1.u.f4320d;
                    } else {
                        Collection values = c0187z0.f2994k.values();
                        f2.j.f(values, "<this>");
                        ArrayList arrayList8 = new ArrayList();
                        Iterator it = values.iterator();
                        while (it.hasNext()) {
                            S1.r.G0((Iterable) it.next(), arrayList8);
                        }
                        c0187z0.f2994k.clear();
                        ?? arrayList9 = new ArrayList(arrayList8.size());
                        int size = arrayList8.size();
                        int i6 = 0;
                        while (i6 < size) {
                            int i7 = size;
                            AbstractC0138a0 abstractC0138a0 = (AbstractC0138a0) arrayList8.get(i6);
                            arrayList9.add(new R1.i(abstractC0138a0, c0187z0.f2995l.get(abstractC0138a0)));
                            i6++;
                            arrayList6 = arrayList6;
                            size = i7;
                            c0519a15 = c0519a15;
                        }
                        arrayList7 = arrayList6;
                        c0519a7 = c0519a15;
                        c0187z0.f2995l.clear();
                        uVar = arrayList9;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            int size2 = uVar.size();
            for (int i8 = 0; i8 < size2; i8++) {
                R1.i iVar = (R1.i) uVar.get(i8);
            }
            c0185y0 = this;
            aVar = aVar2;
            arrayList = arrayList7;
            c0519a2 = c0519a7;
            i3 = 1;
            synchronized (c0185y0.f2979r.f2985b) {
            }
            C0187z0 c0187z02 = c0185y0.f2979r;
            c0185y0.f2978q = x3;
            c0185y0.f2969h = arrayList;
            c0185y0.f2970i = arrayList2;
            c0185y0.f2971j = arrayList3;
            c0185y0.f2972k = c0519a;
            c0185y0.f2973l = c0519a2;
            c0185y0.f2974m = c0519a3;
            c0185y0.f2975n = fVar;
            c0185y0.f2976o = c0519a4;
            c0185y0.f2977p = i3;
            if (c0187z02.v()) {
                obj2 = R1.y.f4171a;
            } else {
                C0821h c0821h2 = new C0821h(i3, l0.c.B(this));
                c0821h2.r();
                synchronized (c0187z02.f2985b) {
                    if (c0187z02.v()) {
                        c0821h = c0821h2;
                    } else {
                        c0187z02.f2998o = c0821h2;
                        c0821h = null;
                    }
                }
                if (c0821h != null) {
                    c0821h.u(R1.y.f4171a);
                }
                obj2 = c0821h2.q();
                if (obj2 != W1.a.f4608d) {
                    obj2 = R1.y.f4171a;
                }
            }
            if (obj2 == aVar) {
                return aVar;
            }
            arrayList6 = arrayList;
            arrayList4 = arrayList2;
            arrayList5 = arrayList3;
            fVar2 = fVar;
            c0519a5 = c0519a2;
            c0519a6 = c0519a4;
            C0519A c0519a112 = c0519a;
            if (C0187z0.q(c0185y0.f2979r)) {
                C0519A c0519a16 = c0519a5;
                c0519a4 = c0519a6;
                c0185y0 = this;
                c0519a = c0519a112;
                fVar = fVar2;
                arrayList2 = arrayList4;
                aVar = aVar;
                c0519a2 = c0519a16;
                arrayList3 = arrayList5;
                arrayList = arrayList6;
                i3 = 1;
                synchronized (c0185y0.f2979r.f2985b) {
                }
            } else {
                W1.a aVar3 = aVar;
                C0519A c0519a17 = c0519a3;
                C0519A c0519a18 = c0519a5;
                ArrayList arrayList10 = arrayList5;
                ArrayList arrayList11 = arrayList4;
                C0183x0 c0183x0 = new C0183x0(c0185y0.f2979r, c0519a3, c0519a6, arrayList6, arrayList4, c0519a112, arrayList5, c0519a18, fVar2);
                c0185y0.f2978q = x3;
                c0185y0.f2969h = arrayList6;
                c0185y0.f2970i = arrayList11;
                c0185y0.f2971j = arrayList10;
                c0185y0.f2972k = c0519a112;
                c0185y0.f2973l = c0519a18;
                c0185y0.f2974m = c0519a17;
                c0185y0.f2975n = fVar2;
                c0519a4 = c0519a6;
                c0185y0.f2976o = c0519a4;
                c0185y0.f2977p = 2;
                aVar2 = aVar3;
                if (x3.n(c0183x0, c0185y0) == aVar2) {
                    return aVar2;
                }
                c0519a = c0519a112;
                c0519a3 = c0519a17;
                fVar = fVar2;
                arrayList2 = arrayList11;
                c0519a15 = c0519a18;
                arrayList3 = arrayList10;
                C0187z0 c0187z03 = c0185y0.f2979r;
                synchronized (c0187z03.f2985b) {
                }
            }
        }
    }
}
