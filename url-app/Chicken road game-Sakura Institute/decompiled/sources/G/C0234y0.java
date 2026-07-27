package G;

import W2.C0286h;
import i.AbstractC0665F;
import i.C0661B;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import y2.AbstractC1341p;
import y2.AbstractC1343r;
import z2.C1400D;
import z2.C1405I;

/* renamed from: G.y0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0234y0 extends E2.j implements L2.c {

    /* renamed from: k, reason: collision with root package name */
    public List f2967k;

    /* renamed from: l, reason: collision with root package name */
    public List f2968l;

    /* renamed from: m, reason: collision with root package name */
    public List f2969m;

    /* renamed from: n, reason: collision with root package name */
    public C0661B f2970n;

    /* renamed from: o, reason: collision with root package name */
    public C0661B f2971o;

    /* renamed from: p, reason: collision with root package name */
    public C0661B f2972p;

    /* renamed from: q, reason: collision with root package name */
    public Set f2973q;

    /* renamed from: r, reason: collision with root package name */
    public C0661B f2974r;

    /* renamed from: s, reason: collision with root package name */
    public int f2975s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ X f2976t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C0236z0 f2977u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0234y0(C0236z0 c0236z0, C2.a aVar) {
        super(3, aVar);
        this.f2977u = c0236z0;
    }

    public static final void o(C0236z0 c0236z0, List list, List list2, List list3, C0661B c0661b, C0661B c0661b2, C0661B c0661b3, C0661B c0661b4) {
        synchronized (c0236z0.f2983b) {
            try {
                list.clear();
                list2.clear();
                int size = list3.size();
                for (int i2 = 0; i2 < size; i2++) {
                    C0225u c0225u = (C0225u) list3.get(i2);
                    c0225u.a();
                    c0236z0.B(c0225u);
                }
                list3.clear();
                Object[] objArr = c0661b.f6885b;
                long[] jArr = c0661b.f6884a;
                int length = jArr.length - 2;
                long j4 = -9187201950435737472L;
                if (length >= 0) {
                    int i4 = 0;
                    while (true) {
                        long j5 = jArr[i4];
                        long[] jArr2 = jArr;
                        if ((((~j5) << 7) & j5 & j4) != j4) {
                            int i5 = 8 - ((~(i4 - length)) >>> 31);
                            for (int i6 = 0; i6 < i5; i6++) {
                                if ((j5 & 255) < 128) {
                                    C0225u c0225u2 = (C0225u) objArr[(i4 << 3) + i6];
                                    c0225u2.a();
                                    c0236z0.B(c0225u2);
                                }
                                j5 >>= 8;
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
                        j4 = -9187201950435737472L;
                    }
                }
                c0661b.b();
                Object[] objArr2 = c0661b2.f6885b;
                long[] jArr3 = c0661b2.f6884a;
                int length2 = jArr3.length - 2;
                if (length2 >= 0) {
                    int i7 = 0;
                    while (true) {
                        long j6 = jArr3[i7];
                        if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i8 = 8 - ((~(i7 - length2)) >>> 31);
                            for (int i9 = 0; i9 < i8; i9++) {
                                if ((j6 & 255) < 128) {
                                    ((C0225u) objArr2[(i7 << 3) + i9]).g();
                                }
                                j6 >>= 8;
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
                c0661b2.b();
                c0661b3.b();
                Object[] objArr3 = c0661b4.f6885b;
                long[] jArr4 = c0661b4.f6884a;
                int length3 = jArr4.length - 2;
                if (length3 >= 0) {
                    int i10 = 0;
                    while (true) {
                        long j7 = jArr4[i10];
                        if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i11 = 8 - ((~(i10 - length3)) >>> 31);
                            for (int i12 = 0; i12 < i11; i12++) {
                                if ((j7 & 255) < 128) {
                                    C0225u c0225u3 = (C0225u) objArr3[(i10 << 3) + i12];
                                    c0225u3.a();
                                    c0236z0.B(c0225u3);
                                }
                                j7 >>= 8;
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
                c0661b4.b();
                Unit unit = Unit.f7487a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final void q(List list, C0236z0 c0236z0) {
        list.clear();
        synchronized (c0236z0.f2983b) {
            try {
                ArrayList arrayList = c0236z0.f2991j;
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    list.add((AbstractC0187a0) arrayList.get(i2));
                }
                c0236z0.f2991j.clear();
                Unit unit = Unit.f7487a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // L2.c
    public final Object g(Object obj, Object obj2, Object obj3) {
        C0234y0 c0234y0 = new C0234y0(this.f2977u, (C2.a) obj3);
        c0234y0.f2976t = (X) obj2;
        c0234y0.l(Unit.f7487a);
        return D2.a.f2163d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0099 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0161 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v12, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r15v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v15, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r6v17, types: [java.util.Set] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x0155 -> B:6:0x015c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x0203 -> B:24:0x0094). Please report as a decompilation issue!!! */
    @Override // E2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(Object obj) {
        X x2;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        C0661B c0661b;
        C0661B c0661b2;
        C0661B c0661b3;
        I.f fVar;
        C0661B c0661b4;
        I.f fVar2;
        ArrayList arrayList4;
        ArrayList arrayList5;
        C0661B c0661b5;
        C0661B c0661b6;
        ArrayList arrayList6;
        Object obj2;
        C0286h c0286h;
        ArrayList arrayList7;
        C0661B c0661b7;
        C1405I c1405i;
        C0234y0 frame = this;
        int i2 = 1;
        D2.a aVar = D2.a.f2163d;
        int i4 = frame.f2975s;
        if (i4 == 0) {
            AbstractC1343r.b(obj);
            x2 = frame.f2976t;
            arrayList = new ArrayList();
            arrayList2 = new ArrayList();
            arrayList3 = new ArrayList();
            int i5 = AbstractC0665F.f6892a;
            c0661b = new C0661B();
            c0661b2 = new C0661B();
            c0661b3 = new C0661B();
            fVar = new I.f(c0661b3);
            c0661b4 = new C0661B();
            synchronized (frame.f2977u.f2983b) {
            }
        } else if (i4 == 1) {
            C0661B c0661b8 = frame.f2974r;
            Set set = frame.f2973q;
            C0661B c0661b9 = frame.f2972p;
            C0661B c0661b10 = frame.f2971o;
            c0661b = frame.f2970n;
            ?? r10 = frame.f2969m;
            ?? r11 = frame.f2968l;
            ?? r12 = frame.f2967k;
            X x3 = frame.f2976t;
            AbstractC1343r.b(obj);
            fVar2 = set;
            arrayList5 = r10;
            arrayList4 = r11;
            arrayList6 = r12;
            c0661b6 = c0661b8;
            c0661b3 = c0661b9;
            c0661b5 = c0661b10;
            x2 = x3;
            C0661B c0661b11 = c0661b;
            if (C0236z0.q(frame.f2977u)) {
            }
        } else {
            if (i4 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C0661B c0661b12 = frame.f2974r;
            Set set2 = frame.f2973q;
            C0661B c0661b13 = frame.f2972p;
            C0661B c0661b14 = frame.f2971o;
            c0661b = frame.f2970n;
            ?? r102 = frame.f2969m;
            ?? r112 = frame.f2968l;
            ?? r122 = frame.f2967k;
            X x4 = frame.f2976t;
            AbstractC1343r.b(obj);
            arrayList6 = r122;
            fVar = set2;
            D2.a aVar2 = aVar;
            C0661B c0661b15 = c0661b14;
            arrayList3 = r102;
            c0661b4 = c0661b12;
            x2 = x4;
            c0661b3 = c0661b13;
            arrayList2 = r112;
            C0236z0 c0236z0 = frame.f2977u;
            synchronized (c0236z0.f2983b) {
                try {
                    if (c0236z0.f2992k.isEmpty()) {
                        arrayList7 = arrayList6;
                        c0661b7 = c0661b15;
                        c1405i = C1405I.f11931d;
                    } else {
                        Collection values = c0236z0.f2992k.values();
                        Intrinsics.checkNotNullParameter(values, "<this>");
                        ArrayList arrayList8 = new ArrayList();
                        Iterator it = values.iterator();
                        while (it.hasNext()) {
                            C1400D.j((Iterable) it.next(), arrayList8);
                        }
                        c0236z0.f2992k.clear();
                        ?? arrayList9 = new ArrayList(arrayList8.size());
                        int size = arrayList8.size();
                        int i6 = 0;
                        while (i6 < size) {
                            int i7 = size;
                            AbstractC0187a0 abstractC0187a0 = (AbstractC0187a0) arrayList8.get(i6);
                            arrayList9.add(new Pair(abstractC0187a0, c0236z0.f2993l.get(abstractC0187a0)));
                            i6++;
                            arrayList6 = arrayList6;
                            size = i7;
                            c0661b15 = c0661b15;
                        }
                        arrayList7 = arrayList6;
                        c0661b7 = c0661b15;
                        c0236z0.f2993l.clear();
                        c1405i = arrayList9;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            int size2 = c1405i.size();
            for (int i8 = 0; i8 < size2; i8++) {
                Pair pair = (Pair) c1405i.get(i8);
            }
            frame = this;
            aVar = aVar2;
            arrayList = arrayList7;
            c0661b2 = c0661b7;
            i2 = 1;
            synchronized (frame.f2977u.f2983b) {
            }
            C0236z0 c0236z02 = frame.f2977u;
            frame.f2976t = x2;
            frame.f2967k = arrayList;
            frame.f2968l = arrayList2;
            frame.f2969m = arrayList3;
            frame.f2970n = c0661b;
            frame.f2971o = c0661b2;
            frame.f2972p = c0661b3;
            frame.f2973q = fVar;
            frame.f2974r = c0661b4;
            frame.f2975s = i2;
            if (c0236z02.v()) {
                obj2 = Unit.f7487a;
            } else {
                C0286h c0286h2 = new C0286h(i2, D2.f.b(this));
                c0286h2.s();
                synchronized (c0236z02.f2983b) {
                    if (c0236z02.v()) {
                        c0286h = c0286h2;
                    } else {
                        c0236z02.f2996o = c0286h2;
                        c0286h = null;
                    }
                }
                if (c0286h != null) {
                    AbstractC1341p.a aVar3 = AbstractC1341p.f11673d;
                    c0286h.u(Unit.f7487a);
                }
                obj2 = c0286h2.r();
                D2.a aVar4 = D2.a.f2163d;
                if (obj2 == aVar4) {
                    Intrinsics.checkNotNullParameter(frame, "frame");
                }
                if (obj2 != aVar4) {
                    obj2 = Unit.f7487a;
                }
            }
            if (obj2 == aVar) {
                return aVar;
            }
            arrayList6 = arrayList;
            arrayList4 = arrayList2;
            arrayList5 = arrayList3;
            fVar2 = fVar;
            c0661b5 = c0661b2;
            c0661b6 = c0661b4;
            C0661B c0661b112 = c0661b;
            if (C0236z0.q(frame.f2977u)) {
                C0661B c0661b16 = c0661b5;
                c0661b4 = c0661b6;
                frame = this;
                c0661b = c0661b112;
                fVar = fVar2;
                arrayList2 = arrayList4;
                aVar = aVar;
                c0661b2 = c0661b16;
                arrayList3 = arrayList5;
                arrayList = arrayList6;
                i2 = 1;
                synchronized (frame.f2977u.f2983b) {
                }
            } else {
                D2.a aVar5 = aVar;
                C0661B c0661b17 = c0661b3;
                C0661B c0661b18 = c0661b5;
                ArrayList arrayList10 = arrayList5;
                ArrayList arrayList11 = arrayList4;
                C0232x0 c0232x0 = new C0232x0(frame.f2977u, c0661b3, c0661b6, arrayList6, arrayList4, c0661b112, arrayList5, c0661b18, fVar2);
                frame.f2976t = x2;
                frame.f2967k = arrayList6;
                frame.f2968l = arrayList11;
                frame.f2969m = arrayList10;
                frame.f2970n = c0661b112;
                frame.f2971o = c0661b18;
                frame.f2972p = c0661b17;
                frame.f2973q = fVar2;
                c0661b4 = c0661b6;
                frame.f2974r = c0661b4;
                frame.f2975s = 2;
                aVar2 = aVar5;
                if (x2.f(c0232x0, frame) == aVar2) {
                    return aVar2;
                }
                c0661b = c0661b112;
                c0661b3 = c0661b17;
                fVar = fVar2;
                arrayList2 = arrayList11;
                c0661b15 = c0661b18;
                arrayList3 = arrayList10;
                C0236z0 c0236z03 = frame.f2977u;
                synchronized (c0236z03.f2983b) {
                }
            }
        }
    }
}
