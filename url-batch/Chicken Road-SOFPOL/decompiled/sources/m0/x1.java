package m0;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class x1 extends i6.i implements p6.f {

    /* renamed from: h, reason: collision with root package name */
    public List f5154h;
    public List i;

    /* renamed from: j, reason: collision with root package name */
    public List f5155j;

    /* renamed from: k, reason: collision with root package name */
    public o.k0 f5156k;

    /* renamed from: l, reason: collision with root package name */
    public o.k0 f5157l;

    /* renamed from: m, reason: collision with root package name */
    public o.k0 f5158m;

    /* renamed from: n, reason: collision with root package name */
    public Set f5159n;

    /* renamed from: o, reason: collision with root package name */
    public o.k0 f5160o;

    /* renamed from: p, reason: collision with root package name */
    public int f5161p;

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ w0 f5162q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ y1 f5163r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(y1 y1Var, g6.c cVar) {
        super(3, cVar);
        this.f5163r = y1Var;
    }

    public static final void r(y1 y1Var, List list, List list2, List list3, o.k0 k0Var, o.k0 k0Var2, o.k0 k0Var3, o.k0 k0Var4) {
        char c8;
        long j7;
        long j8;
        synchronized (y1Var.f5189b) {
            try {
                list.clear();
                list2.clear();
                int size = list3.size();
                for (int i = 0; i < size; i++) {
                    y yVar = (y) list3.get(i);
                    yVar.a();
                    y1Var.G(yVar);
                }
                list3.clear();
                Object[] objArr = k0Var.f5490b;
                long[] jArr = k0Var.f5489a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i8 = 0;
                    j7 = 255;
                    while (true) {
                        long j9 = jArr[i8];
                        c8 = 7;
                        j8 = -9187201950435737472L;
                        if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i9 = 8 - ((~(i8 - length)) >>> 31);
                            for (int i10 = 0; i10 < i9; i10++) {
                                if ((j9 & 255) < 128) {
                                    y yVar2 = (y) objArr[(i8 << 3) + i10];
                                    yVar2.a();
                                    y1Var.G(yVar2);
                                }
                                j9 >>= 8;
                            }
                            if (i9 != 8) {
                                break;
                            }
                        }
                        if (i8 == length) {
                            break;
                        } else {
                            i8++;
                        }
                    }
                } else {
                    c8 = 7;
                    j7 = 255;
                    j8 = -9187201950435737472L;
                }
                k0Var.b();
                Object[] objArr2 = k0Var2.f5490b;
                long[] jArr2 = k0Var2.f5489a;
                int length2 = jArr2.length - 2;
                if (length2 >= 0) {
                    int i11 = 0;
                    while (true) {
                        long j10 = jArr2[i11];
                        if ((((~j10) << c8) & j10 & j8) != j8) {
                            int i12 = 8 - ((~(i11 - length2)) >>> 31);
                            for (int i13 = 0; i13 < i12; i13++) {
                                if ((j10 & j7) < 128) {
                                    ((y) objArr2[(i11 << 3) + i13]).g();
                                }
                                j10 >>= 8;
                            }
                            if (i12 != 8) {
                                break;
                            }
                        }
                        if (i11 == length2) {
                            break;
                        } else {
                            i11++;
                        }
                    }
                }
                k0Var2.b();
                k0Var3.b();
                Object[] objArr3 = k0Var4.f5490b;
                long[] jArr3 = k0Var4.f5489a;
                int length3 = jArr3.length - 2;
                if (length3 >= 0) {
                    int i14 = 0;
                    while (true) {
                        long j11 = jArr3[i14];
                        if ((((~j11) << c8) & j11 & j8) != j8) {
                            int i15 = 8 - ((~(i14 - length3)) >>> 31);
                            for (int i16 = 0; i16 < i15; i16++) {
                                if ((j11 & j7) < 128) {
                                    y yVar3 = (y) objArr3[(i14 << 3) + i16];
                                    yVar3.a();
                                    y1Var.G(yVar3);
                                }
                                j11 >>= 8;
                            }
                            if (i15 != 8) {
                                break;
                            }
                        }
                        if (i14 == length3) {
                            break;
                        } else {
                            i14++;
                        }
                    }
                }
                k0Var4.b();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final void s(List list, y1 y1Var) {
        list.clear();
        synchronized (y1Var.f5189b) {
            try {
                ArrayList arrayList = y1Var.f5196j;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    list.add((y0) arrayList.get(i));
                }
                y1Var.f5196j.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p6.f
    public final Object d(Object obj, Object obj2, Object obj3) {
        x1 x1Var = new x1(this.f5163r, (g6.c) obj3);
        x1Var.f5162q = (w0) obj2;
        x1Var.p(c6.m.f1757a);
        return h6.a.f3204d;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0099 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0132 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x0125 -> B:6:0x012d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x01c5 -> B:20:0x0094). Please report as a decompilation issue!!! */
    @Override // i6.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object p(Object obj) {
        w0 w0Var;
        o.k0 k0Var;
        o.k0 k0Var2;
        List list;
        Set set;
        final List list2;
        o.k0 k0Var3;
        List list3;
        o.k0 k0Var4;
        final List list4;
        final o.k0 k0Var5;
        final List list5;
        final o.k0 k0Var6;
        y1 y1Var;
        Object obj2;
        a7.h hVar;
        h6.a aVar;
        w0 w0Var2;
        o.e0 e0Var;
        x1 x1Var = this;
        h6.a aVar2 = h6.a.f3204d;
        int i = x1Var.f5161p;
        int i8 = 2;
        int i9 = 1;
        if (i == 0) {
            s6.a.K(obj);
            w0Var = x1Var.f5162q;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            o.k0 k0Var7 = o.s0.f5536a;
            k0Var = new o.k0();
            o.k0 k0Var8 = new o.k0();
            o.k0 k0Var9 = new o.k0();
            o0.g gVar = new o0.g(k0Var9);
            k0Var2 = new o.k0();
            list = arrayList;
            set = gVar;
            list2 = arrayList2;
            k0Var3 = k0Var9;
            list3 = arrayList3;
            k0Var4 = k0Var8;
            synchronized (x1Var.f5163r.f5189b) {
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.k0 k0Var10 = x1Var.f5160o;
                set = x1Var.f5159n;
                k0Var3 = x1Var.f5158m;
                k0Var4 = x1Var.f5157l;
                k0Var = x1Var.f5156k;
                list3 = x1Var.f5155j;
                list2 = x1Var.i;
                list = x1Var.f5154h;
                w0 w0Var3 = x1Var.f5162q;
                s6.a.K(obj);
                k0Var2 = k0Var10;
                w0Var = w0Var3;
                y1 y1Var2 = x1Var.f5163r;
                synchronized (y1Var2.f5189b) {
                    try {
                        if (y1Var2.f5197k.j()) {
                            o.e0 b8 = o0.a.b(y1Var2.f5197k);
                            y1Var2.f5197k.a();
                            a0.a0 a0Var = y1Var2.f5198l;
                            ((o.j0) a0Var.f11e).a();
                            ((o.j0) a0Var.f12f).a();
                            y1Var2.f5200n.a();
                            e0Var = new o.e0(b8.f5443b);
                            Object[] objArr = b8.f5442a;
                            int i10 = b8.f5443b;
                            aVar = aVar2;
                            int i11 = 0;
                            while (i11 < i10) {
                                int i12 = i11;
                                y0 y0Var = (y0) objArr[i11];
                                e0Var.a(new c6.f(y0Var, y1Var2.f5199m.g(y0Var)));
                                i11 = i12 + 1;
                                w0Var = w0Var;
                            }
                            w0Var2 = w0Var;
                            y1Var2.f5199m.a();
                        } else {
                            aVar = aVar2;
                            w0Var2 = w0Var;
                            e0Var = o.p0.f5519b;
                            q6.i.c(e0Var, "null cannot be cast to non-null type androidx.collection.ObjectList<E of androidx.collection.ObjectListKt.emptyObjectList>");
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                Object[] objArr2 = e0Var.f5442a;
                int i13 = e0Var.f5443b;
                for (int i14 = 0; i14 < i13; i14++) {
                    c6.f fVar = (c6.f) objArr2[i14];
                }
                i8 = 2;
                i9 = 1;
                x1Var = this;
                aVar2 = aVar;
                w0Var = w0Var2;
                synchronized (x1Var.f5163r.f5189b) {
                }
                y1 y1Var3 = x1Var.f5163r;
                x1Var.f5162q = w0Var;
                x1Var.f5154h = list;
                x1Var.i = list2;
                x1Var.f5155j = list3;
                x1Var.f5156k = k0Var;
                x1Var.f5157l = k0Var4;
                x1Var.f5158m = k0Var3;
                x1Var.f5159n = set;
                x1Var.f5160o = k0Var2;
                x1Var.f5161p = i9;
                if (y1Var3.y()) {
                    obj2 = c6.m.f1757a;
                } else {
                    a7.h hVar2 = new a7.h(i9, m.a.G(x1Var));
                    hVar2.t();
                    synchronized (y1Var3.f5189b) {
                        if (y1Var3.y()) {
                            hVar = hVar2;
                        } else {
                            y1Var3.f5203q = hVar2;
                            hVar = null;
                        }
                    }
                    if (hVar != null) {
                        hVar.k(c6.m.f1757a);
                    }
                    obj2 = hVar2.s();
                    if (obj2 != h6.a.f3204d) {
                        obj2 = c6.m.f1757a;
                    }
                }
                if (obj2 != aVar2) {
                    List list6 = list;
                    k0Var5 = k0Var;
                    k0Var6 = k0Var2;
                    list4 = list3;
                    list5 = list6;
                    final Set set2 = set;
                    final o.k0 k0Var11 = k0Var4;
                    final o.k0 k0Var12 = k0Var3;
                    y1Var = x1Var.f5163r;
                    d7.n0 n0Var = y1.f5186y;
                    if (y1Var.F()) {
                        List list7 = list4;
                        k0Var2 = k0Var6;
                        k0Var = k0Var5;
                        list = list5;
                        list3 = list7;
                        x1Var = this;
                        k0Var3 = k0Var12;
                        k0Var4 = k0Var11;
                        set = set2;
                        synchronized (x1Var.f5163r.f5189b) {
                        }
                    } else {
                        final y1 y1Var4 = x1Var.f5163r;
                        p6.c cVar = new p6.c() { // from class: m0.w1
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // p6.c
                            public final Object i(Object obj3) {
                                boolean x7;
                                boolean z3;
                                y1 y1Var5 = y1.this;
                                o.k0 k0Var13 = k0Var12;
                                o.k0 k0Var14 = k0Var6;
                                List list8 = list5;
                                List list9 = list2;
                                o.k0 k0Var15 = k0Var5;
                                List list10 = list4;
                                o.k0 k0Var16 = k0Var11;
                                Set set3 = set2;
                                long longValue = ((Long) obj3).longValue();
                                synchronized (y1Var5.f5189b) {
                                    x7 = y1Var5.x();
                                }
                                boolean z7 = 0;
                                if (x7) {
                                    Trace.beginSection("Recomposer:animation");
                                    try {
                                        y1Var5.f5188a.e(longValue);
                                        synchronized (w0.m.f7537c) {
                                            o.k0 k0Var17 = w0.m.f7543j.f7505h;
                                            if (k0Var17 != null) {
                                                z3 = k0Var17.h();
                                            }
                                        }
                                        if (z3) {
                                            w0.m.a();
                                        }
                                    } finally {
                                        Trace.endSection();
                                    }
                                }
                                Trace.beginSection("Recomposer:recompose");
                                try {
                                    y1Var5.F();
                                    synchronized (y1Var5.f5189b) {
                                        try {
                                            o0.e eVar = y1Var5.f5195h;
                                            Object[] objArr3 = eVar.f5578d;
                                            int i15 = eVar.f5580f;
                                            for (int i16 = 0; i16 < i15; i16++) {
                                                list8.add((y) objArr3[i16]);
                                            }
                                            y1Var5.f5195h.g();
                                        } finally {
                                        }
                                    }
                                    k0Var13.b();
                                    k0Var14.b();
                                    while (true) {
                                        if (list8.isEmpty() && list9.isEmpty()) {
                                            break;
                                        }
                                        try {
                                            int size = list8.size();
                                            for (int i17 = 0; i17 < size; i17++) {
                                                y yVar = (y) list8.get(i17);
                                                y D = y1Var5.D(yVar, k0Var13);
                                                if (D != null) {
                                                    list10.add(D);
                                                }
                                                k0Var14.a(yVar);
                                            }
                                            list8.clear();
                                            if (k0Var13.h() || y1Var5.f5195h.f5580f != 0) {
                                                synchronized (y1Var5.f5189b) {
                                                    try {
                                                        List z8 = y1Var5.z();
                                                        int size2 = z8.size();
                                                        for (int i18 = 0; i18 < size2; i18++) {
                                                            y yVar2 = (y) z8.get(i18);
                                                            if (!k0Var14.c(yVar2) && yVar2.w(set3)) {
                                                                list8.add(yVar2);
                                                            }
                                                        }
                                                        o0.e eVar2 = y1Var5.f5195h;
                                                        int i19 = eVar2.f5580f;
                                                        int i20 = 0;
                                                        for (int i21 = 0; i21 < i19; i21++) {
                                                            y yVar3 = (y) eVar2.f5578d[i21];
                                                            if (!k0Var14.c(yVar3) && !list8.contains(yVar3)) {
                                                                list8.add(yVar3);
                                                                i20++;
                                                            } else if (i20 > 0) {
                                                                Object[] objArr4 = eVar2.f5578d;
                                                                objArr4[i21 - i20] = objArr4[i21];
                                                            }
                                                        }
                                                        int i22 = i19 - i20;
                                                        d6.l.L(eVar2.f5578d, i22, i19);
                                                        eVar2.f5580f = i22;
                                                    } finally {
                                                    }
                                                }
                                            }
                                            if (list8.isEmpty()) {
                                                try {
                                                    x1.s(list9, y1Var5);
                                                    while (!list9.isEmpty()) {
                                                        List C = y1Var5.C(list9, k0Var13);
                                                        k0Var15.getClass();
                                                        Iterator it = C.iterator();
                                                        while (it.hasNext()) {
                                                            k0Var15.j(it.next());
                                                        }
                                                        x1.s(list9, y1Var5);
                                                    }
                                                } catch (Throwable th2) {
                                                    y1Var5.E(th2, null);
                                                    x1.r(y1Var5, list8, list9, list10, k0Var15, k0Var16, k0Var13, k0Var14);
                                                }
                                            }
                                            z7 = 0;
                                        } catch (Throwable th3) {
                                            try {
                                                y1Var5.E(th3, null);
                                                x1.r(y1Var5, list8, list9, list10, k0Var15, k0Var16, k0Var13, k0Var14);
                                            } finally {
                                                list8.clear();
                                            }
                                        }
                                    }
                                    w0.f k3 = w0.m.k();
                                    w0.f yVar4 = k3 instanceof w0.b ? new w0.y((w0.b) k3, null, null, true, false) : new w0.z(k3, null, true, z7);
                                    try {
                                        w0.f j7 = yVar4.j();
                                        try {
                                            if (!list10.isEmpty()) {
                                                try {
                                                    int size3 = list10.size();
                                                    for (int i23 = z7; i23 < size3; i23++) {
                                                        k0Var16.a((y) list10.get(i23));
                                                    }
                                                    int size4 = list10.size();
                                                    for (int i24 = z7; i24 < size4; i24++) {
                                                        ((y) list10.get(i24)).d();
                                                    }
                                                } catch (Throwable th4) {
                                                    try {
                                                        y1Var5.E(th4, null);
                                                        x1.r(y1Var5, list8, list9, list10, k0Var15, k0Var16, k0Var13, k0Var14);
                                                        return c6.m.f1757a;
                                                    } finally {
                                                        list10.clear();
                                                    }
                                                }
                                            }
                                            if (k0Var15.h()) {
                                                try {
                                                    k0Var16.k(k0Var15);
                                                    Object[] objArr5 = k0Var15.f5490b;
                                                    long[] jArr = k0Var15.f5489a;
                                                    int length = jArr.length - 2;
                                                    if (length >= 0) {
                                                        int i25 = 0;
                                                        while (true) {
                                                            long j8 = jArr[i25];
                                                            Object[] objArr6 = objArr5;
                                                            if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                int i26 = 8 - ((~(i25 - length)) >>> 31);
                                                                for (int i27 = 0; i27 < i26; i27++) {
                                                                    if ((j8 & 255) < 128) {
                                                                        ((y) objArr6[(i25 << 3) + i27]).f();
                                                                    }
                                                                    j8 >>= 8;
                                                                }
                                                                if (i26 != 8) {
                                                                    break;
                                                                }
                                                            }
                                                            if (i25 == length) {
                                                                break;
                                                            }
                                                            i25++;
                                                            objArr5 = objArr6;
                                                        }
                                                    }
                                                } catch (Throwable th5) {
                                                    try {
                                                        y1Var5.E(th5, null);
                                                        x1.r(y1Var5, list8, list9, list10, k0Var15, k0Var16, k0Var13, k0Var14);
                                                        w0.f.q(j7);
                                                        return c6.m.f1757a;
                                                    } finally {
                                                        k0Var15.b();
                                                    }
                                                }
                                            }
                                            if (k0Var16.h()) {
                                                try {
                                                    Object[] objArr7 = k0Var16.f5490b;
                                                    long[] jArr2 = k0Var16.f5489a;
                                                    int length2 = jArr2.length - 2;
                                                    if (length2 >= 0) {
                                                        int i28 = 0;
                                                        while (true) {
                                                            long j9 = jArr2[i28];
                                                            Object[] objArr8 = objArr7;
                                                            long[] jArr3 = jArr2;
                                                            if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                int i29 = 8 - ((~(i28 - length2)) >>> 31);
                                                                for (int i30 = 0; i30 < i29; i30++) {
                                                                    if ((j9 & 255) < 128) {
                                                                        ((y) objArr8[(i28 << 3) + i30]).g();
                                                                    }
                                                                    j9 >>= 8;
                                                                }
                                                                if (i29 != 8) {
                                                                    break;
                                                                }
                                                            }
                                                            if (i28 == length2) {
                                                                break;
                                                            }
                                                            i28++;
                                                            objArr7 = objArr8;
                                                            jArr2 = jArr3;
                                                        }
                                                    }
                                                } catch (Throwable th6) {
                                                    try {
                                                        y1Var5.E(th6, null);
                                                        x1.r(y1Var5, list8, list9, list10, k0Var15, k0Var16, k0Var13, k0Var14);
                                                        w0.f.q(j7);
                                                        return c6.m.f1757a;
                                                    } finally {
                                                        k0Var16.b();
                                                    }
                                                }
                                            }
                                            yVar4.c();
                                            synchronized (y1Var5.f5189b) {
                                                y1Var5.w();
                                            }
                                            w0.m.k().m();
                                            k0Var14.b();
                                            k0Var13.b();
                                            y1Var5.f5202p = null;
                                            return c6.m.f1757a;
                                        } finally {
                                            w0.f.q(j7);
                                        }
                                    } finally {
                                        yVar4.c();
                                    }
                                } catch (Throwable th7) {
                                    throw th7;
                                }
                            }
                        };
                        x1Var.f5162q = w0Var;
                        x1Var.f5154h = list5;
                        x1Var.i = list2;
                        x1Var.f5155j = list4;
                        x1Var.f5156k = k0Var5;
                        x1Var.f5157l = k0Var11;
                        x1Var.f5158m = k0Var12;
                        x1Var.f5159n = set2;
                        x1Var.f5160o = k0Var6;
                        x1Var.f5161p = i8;
                        if (w0Var.d(cVar, x1Var) != aVar2) {
                            List list8 = list4;
                            k0Var2 = k0Var6;
                            k0Var = k0Var5;
                            list = list5;
                            list3 = list8;
                            k0Var3 = k0Var12;
                            k0Var4 = k0Var11;
                            set = set2;
                            y1 y1Var22 = x1Var.f5163r;
                            synchronized (y1Var22.f5189b) {
                            }
                        }
                    }
                }
                return aVar2;
            }
            o.k0 k0Var13 = x1Var.f5160o;
            set = x1Var.f5159n;
            k0Var3 = x1Var.f5158m;
            k0Var4 = x1Var.f5157l;
            o.k0 k0Var14 = x1Var.f5156k;
            List list9 = x1Var.f5155j;
            list2 = x1Var.i;
            List list10 = x1Var.f5154h;
            w0 w0Var4 = x1Var.f5162q;
            s6.a.K(obj);
            k0Var6 = k0Var13;
            w0Var = w0Var4;
            list4 = list9;
            list5 = list10;
            k0Var5 = k0Var14;
            final Set set22 = set;
            final o.k0 k0Var112 = k0Var4;
            final o.k0 k0Var122 = k0Var3;
            y1Var = x1Var.f5163r;
            d7.n0 n0Var2 = y1.f5186y;
            if (y1Var.F()) {
            }
        }
    }
}
