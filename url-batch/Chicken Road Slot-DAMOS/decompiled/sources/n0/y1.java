package n0;

import android.os.Trace;
import com.google.android.gms.internal.measurement.se;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class y1 extends nd.i implements vd.n {

    /* renamed from: d, reason: collision with root package name */
    public List f6860d;

    /* renamed from: e, reason: collision with root package name */
    public List f6861e;

    /* renamed from: i, reason: collision with root package name */
    public List f6862i;

    /* renamed from: r, reason: collision with root package name */
    public s.i0 f6863r;

    /* renamed from: s, reason: collision with root package name */
    public s.i0 f6864s;

    /* renamed from: t, reason: collision with root package name */
    public s.i0 f6865t;

    /* renamed from: u, reason: collision with root package name */
    public Set f6866u;

    /* renamed from: v, reason: collision with root package name */
    public s.i0 f6867v;

    /* renamed from: w, reason: collision with root package name */
    public int f6868w;

    /* renamed from: x, reason: collision with root package name */
    public /* synthetic */ s0 f6869x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ z1 f6870y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(z1 z1Var, ld.a aVar) {
        super(3, aVar);
        this.f6870y = z1Var;
    }

    public static final void d(z1 z1Var, List list, List list2, List list3, s.i0 i0Var, s.i0 i0Var2, s.i0 i0Var3, s.i0 i0Var4) {
        char c10;
        long j;
        long j3;
        synchronized (z1Var.f6877c) {
            try {
                list.clear();
                list2.clear();
                int size = list3.size();
                for (int i3 = 0; i3 < size; i3++) {
                    q qVar = (q) list3.get(i3);
                    qVar.a();
                    z1Var.H(qVar);
                }
                list3.clear();
                Object[] objArr = i0Var.f8320b;
                long[] jArr = i0Var.f8319a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i10 = 0;
                    j = 255;
                    while (true) {
                        long j10 = jArr[i10];
                        c10 = 7;
                        j3 = -9187201950435737472L;
                        if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i11 = 8 - ((~(i10 - length)) >>> 31);
                            for (int i12 = 0; i12 < i11; i12++) {
                                if ((j10 & 255) < 128) {
                                    q qVar2 = (q) objArr[(i10 << 3) + i12];
                                    qVar2.a();
                                    z1Var.H(qVar2);
                                }
                                j10 >>= 8;
                            }
                            if (i11 != 8) {
                                break;
                            }
                        }
                        if (i10 == length) {
                            break;
                        } else {
                            i10++;
                        }
                    }
                } else {
                    c10 = 7;
                    j = 255;
                    j3 = -9187201950435737472L;
                }
                i0Var.b();
                Object[] objArr2 = i0Var2.f8320b;
                long[] jArr2 = i0Var2.f8319a;
                int length2 = jArr2.length - 2;
                if (length2 >= 0) {
                    int i13 = 0;
                    while (true) {
                        long j11 = jArr2[i13];
                        if ((((~j11) << c10) & j11 & j3) != j3) {
                            int i14 = 8 - ((~(i13 - length2)) >>> 31);
                            for (int i15 = 0; i15 < i14; i15++) {
                                if ((j11 & j) < 128) {
                                    ((q) objArr2[(i13 << 3) + i15]).g();
                                }
                                j11 >>= 8;
                            }
                            if (i14 != 8) {
                                break;
                            }
                        }
                        if (i13 == length2) {
                            break;
                        } else {
                            i13++;
                        }
                    }
                }
                i0Var2.b();
                i0Var3.b();
                Object[] objArr3 = i0Var4.f8320b;
                long[] jArr3 = i0Var4.f8319a;
                int length3 = jArr3.length - 2;
                if (length3 >= 0) {
                    int i16 = 0;
                    while (true) {
                        long j12 = jArr3[i16];
                        if ((((~j12) << c10) & j12 & j3) != j3) {
                            int i17 = 8 - ((~(i16 - length3)) >>> 31);
                            for (int i18 = 0; i18 < i17; i18++) {
                                if ((j12 & j) < 128) {
                                    q qVar3 = (q) objArr3[(i16 << 3) + i18];
                                    qVar3.a();
                                    z1Var.H(qVar3);
                                }
                                j12 >>= 8;
                            }
                            if (i17 != 8) {
                                break;
                            }
                        }
                        if (i16 == length3) {
                            break;
                        } else {
                            i16++;
                        }
                    }
                }
                i0Var4.b();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final void h(List list, z1 z1Var) {
        list.clear();
        synchronized (z1Var.f6877c) {
            try {
                ArrayList arrayList = z1Var.f6883k;
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    list.add((u0) arrayList.get(i3));
                }
                z1Var.f6883k.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // vd.n
    public final Object a(Object obj, Object obj2, Object obj3) {
        y1 y1Var = new y1(this.f6870y, (ld.a) obj3);
        y1Var.f6869x = (s0) obj2;
        y1Var.invokeSuspend(Unit.f5554a);
        return md.a.f6622d;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0098 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0133 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x0126 -> B:6:0x012e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x01db -> B:20:0x0093). Please report as a decompilation issue!!! */
    @Override // nd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        s0 s0Var;
        s.i0 i0Var;
        s.i0 i0Var2;
        List list;
        Set set;
        final List list2;
        s.i0 i0Var3;
        List list3;
        s.i0 i0Var4;
        final List list4;
        final s.i0 i0Var5;
        final List list5;
        final s.i0 i0Var6;
        z1 z1Var;
        Object obj2;
        ge.h hVar;
        md.a aVar;
        s0 s0Var2;
        s.d0 d0Var;
        md.a aVar2 = md.a.f6622d;
        int i3 = this.f6868w;
        int i10 = 2;
        int i11 = 1;
        if (i3 == 0) {
            cf.c.M(obj);
            s0Var = this.f6869x;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            int i12 = s.q0.f8360a;
            i0Var = new s.i0();
            s.i0 i0Var7 = new s.i0();
            s.i0 i0Var8 = new s.i0();
            o0.h hVar2 = new o0.h(i0Var8);
            i0Var2 = new s.i0();
            list = arrayList;
            set = hVar2;
            list2 = arrayList2;
            i0Var3 = i0Var8;
            list3 = arrayList3;
            i0Var4 = i0Var7;
            synchronized (this.f6870y.f6877c) {
            }
        } else {
            if (i3 != 1) {
                if (i3 != 2) {
                    kotlin.collections.i0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                s.i0 i0Var9 = this.f6867v;
                set = this.f6866u;
                i0Var3 = this.f6865t;
                i0Var4 = this.f6864s;
                i0Var = this.f6863r;
                list3 = this.f6862i;
                list2 = this.f6861e;
                list = this.f6860d;
                s0 s0Var3 = this.f6869x;
                cf.c.M(obj);
                i0Var2 = i0Var9;
                s0Var = s0Var3;
                z1 z1Var2 = this.f6870y;
                synchronized (z1Var2.f6877c) {
                    try {
                        if (z1Var2.f6884l.j()) {
                            s.d0 b10 = o0.a.b(z1Var2.f6884l);
                            z1Var2.f6884l.a();
                            c6.l lVar = z1Var2.f6885m;
                            ((s.h0) lVar.f1829e).a();
                            ((s.h0) lVar.f1830i).a();
                            z1Var2.f6887o.a();
                            d0Var = new s.d0(b10.f8285b);
                            Object[] objArr = b10.f8284a;
                            int i13 = b10.f8285b;
                            aVar = aVar2;
                            int i14 = 0;
                            while (i14 < i13) {
                                int i15 = i14;
                                u0 u0Var = (u0) objArr[i14];
                                d0Var.a(new Pair(u0Var, z1Var2.f6886n.g(u0Var)));
                                i14 = i15 + 1;
                                s0Var = s0Var;
                                objArr = objArr;
                            }
                            s0Var2 = s0Var;
                            z1Var2.f6886n.a();
                        } else {
                            aVar = aVar2;
                            s0Var2 = s0Var;
                            d0Var = s.n0.f8349b;
                            d0Var.getClass();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                Object[] objArr2 = d0Var.f8284a;
                int i16 = d0Var.f8285b;
                for (int i17 = 0; i17 < i16; i17++) {
                    Pair pair = (Pair) objArr2[i17];
                }
                a1.n nVar = this.f6870y.f6876b;
                ((x0.a) nVar.f41i).set(0);
                ((se) nVar.f40e).l(new m2.u(12));
                aVar2 = aVar;
                s0Var = s0Var2;
                i10 = 2;
                i11 = 1;
                synchronized (this.f6870y.f6877c) {
                }
                z1 z1Var3 = this.f6870y;
                this.f6869x = s0Var;
                this.f6860d = list;
                this.f6861e = list2;
                this.f6862i = list3;
                this.f6863r = i0Var;
                this.f6864s = i0Var4;
                this.f6865t = i0Var3;
                this.f6866u = set;
                this.f6867v = i0Var2;
                this.f6868w = i11;
                if (z1Var3.z()) {
                    obj2 = Unit.f5554a;
                } else {
                    ge.h hVar3 = new ge.h(i11, md.f.b(this));
                    hVar3.s();
                    synchronized (z1Var3.f6877c) {
                        if (z1Var3.z()) {
                            hVar = hVar3;
                        } else {
                            z1Var3.f6890r = hVar3;
                            hVar = null;
                        }
                    }
                    if (hVar != null) {
                        hd.l lVar2 = hd.n.f4511e;
                        hVar.resumeWith(Unit.f5554a);
                    }
                    obj2 = hVar3.r();
                    if (obj2 != md.a.f6622d) {
                        obj2 = Unit.f5554a;
                    }
                }
                if (obj2 != aVar2) {
                    List list6 = list;
                    i0Var5 = i0Var;
                    i0Var6 = i0Var2;
                    list4 = list3;
                    list5 = list6;
                    final Set set2 = set;
                    final s.i0 i0Var10 = i0Var4;
                    final s.i0 i0Var11 = i0Var3;
                    z1Var = this.f6870y;
                    je.l0 l0Var = z1.f6873y;
                    if (z1Var.G()) {
                        List list7 = list4;
                        i0Var2 = i0Var6;
                        i0Var = i0Var5;
                        list = list5;
                        list3 = list7;
                        i0Var3 = i0Var11;
                        i0Var4 = i0Var10;
                        set = set2;
                        synchronized (this.f6870y.f6877c) {
                        }
                    } else {
                        final z1 z1Var4 = this.f6870y;
                        Function1 function1 = new Function1() { // from class: n0.x1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj3) {
                                boolean w6;
                                Unit unit;
                                Object[] objArr3;
                                b1.i l0Var2;
                                int i18;
                                long j;
                                boolean z10;
                                z1 z1Var5 = z1.this;
                                s.i0 i0Var12 = i0Var11;
                                s.i0 i0Var13 = i0Var6;
                                List list8 = list5;
                                List list9 = list2;
                                s.i0 i0Var14 = i0Var5;
                                List list10 = list4;
                                s.i0 i0Var15 = i0Var10;
                                Set set3 = set2;
                                long longValue = ((Long) obj3).longValue();
                                synchronized (z1Var5.f6877c) {
                                    w6 = z1Var5.w();
                                }
                                if (w6) {
                                    Trace.beginSection("Recomposer:animation");
                                    try {
                                        z1Var5.f6875a.f6656e.l(new b(0, longValue));
                                        synchronized (b1.r.f1030c) {
                                            s.i0 i0Var16 = b1.r.j.f959h;
                                            if (i0Var16 != null) {
                                                z10 = i0Var16.h();
                                            }
                                        }
                                        if (z10) {
                                            b1.r.a();
                                        }
                                    } finally {
                                        Trace.endSection();
                                    }
                                }
                                Trace.beginSection("Recomposer:recompose");
                                try {
                                    z1Var5.G();
                                    synchronized (z1Var5.f6877c) {
                                        try {
                                            o0.e eVar = z1Var5.f6882i;
                                            Object[] objArr4 = eVar.f7317d;
                                            int i19 = eVar.f7319i;
                                            for (int i20 = 0; i20 < i19; i20++) {
                                                list8.add((q) objArr4[i20]);
                                            }
                                            z1Var5.f6882i.g();
                                        } finally {
                                        }
                                    }
                                    i0Var12.b();
                                    i0Var13.b();
                                    while (true) {
                                        if (list8.isEmpty() && list9.isEmpty()) {
                                            break;
                                        }
                                        try {
                                            int size = list8.size();
                                            for (int i21 = 0; i21 < size; i21++) {
                                                q qVar = (q) list8.get(i21);
                                                q E = z1Var5.E(qVar, i0Var12);
                                                if (E != null) {
                                                    list10.add(E);
                                                }
                                                i0Var13.a(qVar);
                                            }
                                            list8.clear();
                                            if (i0Var12.h() || z1Var5.f6882i.f7319i != 0) {
                                                synchronized (z1Var5.f6877c) {
                                                    try {
                                                        List A = z1Var5.A();
                                                        int size2 = A.size();
                                                        for (int i22 = 0; i22 < size2; i22++) {
                                                            q qVar2 = (q) A.get(i22);
                                                            if (!i0Var13.c(qVar2) && qVar2.u(set3)) {
                                                                list8.add(qVar2);
                                                            }
                                                        }
                                                        o0.e eVar2 = z1Var5.f6882i;
                                                        int i23 = eVar2.f7319i;
                                                        int i24 = 0;
                                                        int i25 = 0;
                                                        while (true) {
                                                            objArr3 = eVar2.f7317d;
                                                            if (i24 >= i23) {
                                                                break;
                                                            }
                                                            q qVar3 = (q) objArr3[i24];
                                                            if (!i0Var13.c(qVar3) && !list8.contains(qVar3)) {
                                                                list8.add(qVar3);
                                                                i25++;
                                                            } else if (i25 > 0) {
                                                                Object[] objArr5 = eVar2.f7317d;
                                                                objArr5[i24 - i25] = objArr5[i24];
                                                            }
                                                            i24++;
                                                        }
                                                        int i26 = i23 - i25;
                                                        Arrays.fill(objArr3, i26, i23, (Object) null);
                                                        eVar2.f7319i = i26;
                                                    } finally {
                                                    }
                                                }
                                            }
                                            if (list8.isEmpty()) {
                                                try {
                                                    y1.h(list9, z1Var5);
                                                    while (!list9.isEmpty()) {
                                                        List D = z1Var5.D(list9, i0Var12);
                                                        i0Var14.getClass();
                                                        D.getClass();
                                                        Iterator it = D.iterator();
                                                        while (it.hasNext()) {
                                                            i0Var14.i(it.next());
                                                        }
                                                        y1.h(list9, z1Var5);
                                                    }
                                                } catch (Throwable th2) {
                                                    z1Var5.F(th2, null);
                                                    y1.d(z1Var5, list8, list9, list10, i0Var14, i0Var15, i0Var12, i0Var13);
                                                    unit = Unit.f5554a;
                                                    return unit;
                                                }
                                            }
                                        } catch (Throwable th3) {
                                            try {
                                                z1Var5.F(th3, null);
                                                y1.d(z1Var5, list8, list9, list10, i0Var14, i0Var15, i0Var12, i0Var13);
                                                unit = Unit.f5554a;
                                                list8.clear();
                                                return unit;
                                            } catch (Throwable th4) {
                                                list8.clear();
                                                throw th4;
                                            }
                                        }
                                    }
                                    b1.i j3 = b1.r.j();
                                    if (j3 instanceof b1.d) {
                                        l0Var2 = new b1.k0((b1.d) j3, null, null, true, false);
                                        i18 = 0;
                                    } else {
                                        i18 = 0;
                                        l0Var2 = new b1.l0(j3, null, true, false);
                                    }
                                    try {
                                        b1.i j10 = l0Var2.j();
                                        try {
                                            if (!list10.isEmpty()) {
                                                try {
                                                    int size3 = list10.size();
                                                    for (int i27 = i18; i27 < size3; i27++) {
                                                        i0Var15.a((q) list10.get(i27));
                                                    }
                                                    int size4 = list10.size();
                                                    for (int i28 = i18; i28 < size4; i28++) {
                                                        ((q) list10.get(i28)).d();
                                                    }
                                                } catch (Throwable th5) {
                                                    try {
                                                        z1Var5.F(th5, null);
                                                        y1.d(z1Var5, list8, list9, list10, i0Var14, i0Var15, i0Var12, i0Var13);
                                                        unit = Unit.f5554a;
                                                        return unit;
                                                    } finally {
                                                        list10.clear();
                                                    }
                                                }
                                            }
                                            if (i0Var14.h()) {
                                                try {
                                                    i0Var15.j(i0Var14);
                                                    Object[] objArr6 = i0Var14.f8320b;
                                                    j = 128;
                                                    long[] jArr = i0Var14.f8319a;
                                                    int length = jArr.length - 2;
                                                    if (length >= 0) {
                                                        int i29 = 0;
                                                        while (true) {
                                                            long j11 = jArr[i29];
                                                            Object[] objArr7 = objArr6;
                                                            if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                int i30 = 8 - ((~(i29 - length)) >>> 31);
                                                                for (int i31 = 0; i31 < i30; i31++) {
                                                                    if ((j11 & 255) < 128) {
                                                                        ((q) objArr7[(i29 << 3) + i31]).f();
                                                                    }
                                                                    j11 >>= 8;
                                                                }
                                                                if (i30 != 8) {
                                                                    break;
                                                                }
                                                            }
                                                            int i32 = i29;
                                                            if (i32 == length) {
                                                                break;
                                                            }
                                                            i29 = i32 + 1;
                                                            objArr6 = objArr7;
                                                        }
                                                    }
                                                } catch (Throwable th6) {
                                                    try {
                                                        z1Var5.F(th6, null);
                                                        y1.d(z1Var5, list8, list9, list10, i0Var14, i0Var15, i0Var12, i0Var13);
                                                        unit = Unit.f5554a;
                                                        b1.i.q(j10);
                                                        return unit;
                                                    } finally {
                                                        i0Var14.b();
                                                    }
                                                }
                                            } else {
                                                j = 128;
                                            }
                                            if (i0Var15.h()) {
                                                try {
                                                    Object[] objArr8 = i0Var15.f8320b;
                                                    long[] jArr2 = i0Var15.f8319a;
                                                    int length2 = jArr2.length - 2;
                                                    if (length2 >= 0) {
                                                        int i33 = 0;
                                                        while (true) {
                                                            long j12 = jArr2[i33];
                                                            Object[] objArr9 = objArr8;
                                                            long[] jArr3 = jArr2;
                                                            if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                int i34 = 8 - ((~(i33 - length2)) >>> 31);
                                                                for (int i35 = 0; i35 < i34; i35++) {
                                                                    if ((j12 & 255) < j) {
                                                                        ((q) objArr9[(i33 << 3) + i35]).g();
                                                                    }
                                                                    j12 >>= 8;
                                                                }
                                                                if (i34 != 8) {
                                                                    break;
                                                                }
                                                            }
                                                            if (i33 == length2) {
                                                                break;
                                                            }
                                                            i33++;
                                                            objArr8 = objArr9;
                                                            jArr2 = jArr3;
                                                        }
                                                    }
                                                } catch (Throwable th7) {
                                                    try {
                                                        z1Var5.F(th7, null);
                                                        y1.d(z1Var5, list8, list9, list10, i0Var14, i0Var15, i0Var12, i0Var13);
                                                        unit = Unit.f5554a;
                                                        b1.i.q(j10);
                                                        return unit;
                                                    } finally {
                                                        i0Var15.b();
                                                    }
                                                }
                                            }
                                            l0Var2.c();
                                            synchronized (z1Var5.f6877c) {
                                                if (z1Var5.v() != null) {
                                                    m.a("unexpected to get continuation here");
                                                }
                                            }
                                            b1.r.j().m();
                                            i0Var13.b();
                                            i0Var12.b();
                                            z1Var5.f6889q = null;
                                            Trace.endSection();
                                            return Unit.f5554a;
                                        } finally {
                                            b1.i.q(j10);
                                        }
                                    } finally {
                                        l0Var2.c();
                                    }
                                } catch (Throwable th8) {
                                    throw th8;
                                }
                            }
                        };
                        this.f6869x = s0Var;
                        this.f6860d = list5;
                        this.f6861e = list2;
                        this.f6862i = list4;
                        this.f6863r = i0Var5;
                        this.f6864s = i0Var10;
                        this.f6865t = i0Var11;
                        this.f6866u = set2;
                        this.f6867v = i0Var6;
                        this.f6868w = i10;
                        if (s0Var.s(function1, this) != aVar2) {
                            List list8 = list4;
                            i0Var2 = i0Var6;
                            i0Var = i0Var5;
                            list = list5;
                            list3 = list8;
                            i0Var3 = i0Var11;
                            i0Var4 = i0Var10;
                            set = set2;
                            z1 z1Var22 = this.f6870y;
                            synchronized (z1Var22.f6877c) {
                            }
                        }
                    }
                }
                return aVar2;
            }
            s.i0 i0Var12 = this.f6867v;
            set = this.f6866u;
            i0Var3 = this.f6865t;
            i0Var4 = this.f6864s;
            s.i0 i0Var13 = this.f6863r;
            List list9 = this.f6862i;
            list2 = this.f6861e;
            List list10 = this.f6860d;
            s0 s0Var4 = this.f6869x;
            cf.c.M(obj);
            i0Var6 = i0Var12;
            s0Var = s0Var4;
            list4 = list9;
            list5 = list10;
            i0Var5 = i0Var13;
            final Set set22 = set;
            final s.i0 i0Var102 = i0Var4;
            final s.i0 i0Var112 = i0Var3;
            z1Var = this.f6870y;
            je.l0 l0Var2 = z1.f6873y;
            if (z1Var.G()) {
            }
        }
    }
}
