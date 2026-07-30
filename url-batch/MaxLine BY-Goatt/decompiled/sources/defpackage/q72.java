package defpackage;

import android.os.Trace;
import defpackage.aa2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class q72 extends pr2 implements xt0 {
    public List m;
    public List n;
    public List o;
    public un1 p;
    public un1 q;
    public un1 r;
    public Set s;
    public un1 t;
    public int u;
    public /* synthetic */ em1 v;
    public final /* synthetic */ r72 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q72(r72 r72Var, o30 o30Var) {
        super(3, o30Var);
        this.w = r72Var;
    }

    public static final void f(r72 r72Var, List list, List list2, List list3, un1 un1Var, un1 un1Var2, un1 un1Var3, un1 un1Var4) {
        char c;
        long j;
        long j2;
        synchronized (r72Var.b) {
            try {
                list.clear();
                list2.clear();
                int size = list3.size();
                for (int i = 0; i < size; i++) {
                    k00 k00Var = (k00) list3.get(i);
                    k00Var.a();
                    r72Var.C(k00Var);
                }
                list3.clear();
                Object[] objArr = un1Var.b;
                long[] jArr = un1Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i2 = 0;
                    j = 255;
                    while (true) {
                        long j3 = jArr[i2];
                        c = 7;
                        j2 = -9187201950435737472L;
                        if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i3 = 8 - ((~(i2 - length)) >>> 31);
                            for (int i4 = 0; i4 < i3; i4++) {
                                if ((j3 & 255) < 128) {
                                    k00 k00Var2 = (k00) objArr[(i2 << 3) + i4];
                                    k00Var2.a();
                                    r72Var.C(k00Var2);
                                }
                                j3 >>= 8;
                            }
                            if (i3 != 8) {
                                break;
                            }
                        }
                        if (i2 == length) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                } else {
                    c = 7;
                    j = 255;
                    j2 = -9187201950435737472L;
                }
                un1Var.b();
                Object[] objArr2 = un1Var2.b;
                long[] jArr2 = un1Var2.a;
                int length2 = jArr2.length - 2;
                if (length2 >= 0) {
                    int i5 = 0;
                    while (true) {
                        long j4 = jArr2[i5];
                        if ((((~j4) << c) & j4 & j2) != j2) {
                            int i6 = 8 - ((~(i5 - length2)) >>> 31);
                            for (int i7 = 0; i7 < i6; i7++) {
                                if ((j4 & j) < 128) {
                                    ((k00) objArr2[(i5 << 3) + i7]).g();
                                }
                                j4 >>= 8;
                            }
                            if (i6 != 8) {
                                break;
                            }
                        }
                        if (i5 == length2) {
                            break;
                        } else {
                            i5++;
                        }
                    }
                }
                un1Var2.b();
                un1Var3.b();
                Object[] objArr3 = un1Var4.b;
                long[] jArr3 = un1Var4.a;
                int length3 = jArr3.length - 2;
                if (length3 >= 0) {
                    int i8 = 0;
                    while (true) {
                        long j5 = jArr3[i8];
                        if ((((~j5) << c) & j5 & j2) != j2) {
                            int i9 = 8 - ((~(i8 - length3)) >>> 31);
                            for (int i10 = 0; i10 < i9; i10++) {
                                if ((j5 & j) < 128) {
                                    k00 k00Var3 = (k00) objArr3[(i8 << 3) + i10];
                                    k00Var3.a();
                                    r72Var.C(k00Var3);
                                }
                                j5 >>= 8;
                            }
                            if (i9 != 8) {
                                break;
                            }
                        }
                        if (i8 == length3) {
                            break;
                        } else {
                            i8++;
                        }
                    }
                }
                un1Var4.b();
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final void h(List list, r72 r72Var) {
        list.clear();
        synchronized (r72Var.b) {
            try {
                ArrayList arrayList = r72Var.j;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    list.add((lm1) arrayList.get(i));
                }
                r72Var.j.clear();
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.xt0
    public final Object a(Object obj, Object obj2, Object obj3) {
        q72 q72Var = new q72(this.w, (o30) obj3);
        q72Var.v = (em1) obj2;
        q72Var.invokeSuspend(Unit.a);
        return b50.m;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0098 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0133 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x0126 -> B:6:0x012e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x01c7 -> B:20:0x0093). Please report as a decompilation issue!!! */
    @Override // defpackage.hn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        em1 em1Var;
        un1 un1Var;
        un1 un1Var2;
        List list;
        Set set;
        final List list2;
        un1 un1Var3;
        List list3;
        un1 un1Var4;
        final List list4;
        final un1 un1Var5;
        final List list5;
        final un1 un1Var6;
        r72 r72Var;
        Object obj2;
        fs fsVar;
        b50 b50Var;
        em1 em1Var2;
        jn1 jn1Var;
        q72 q72Var = this;
        b50 b50Var2 = b50.m;
        int i = q72Var.u;
        int i2 = 2;
        int i3 = 1;
        if (i == 0) {
            ca2.b(obj);
            em1Var = q72Var.v;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            int i4 = pe2.a;
            un1Var = new un1();
            un1 un1Var7 = new un1();
            un1 un1Var8 = new un1();
            qe2 qe2Var = new qe2(un1Var8);
            un1Var2 = new un1();
            list = arrayList;
            set = qe2Var;
            list2 = arrayList2;
            un1Var3 = un1Var8;
            list3 = arrayList3;
            un1Var4 = un1Var7;
            synchronized (q72Var.w.b) {
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    lh.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                un1 un1Var9 = q72Var.t;
                set = q72Var.s;
                un1Var3 = q72Var.r;
                un1Var4 = q72Var.q;
                un1Var = q72Var.p;
                list3 = q72Var.o;
                list2 = q72Var.n;
                list = q72Var.m;
                em1 em1Var3 = q72Var.v;
                ca2.b(obj);
                un1Var2 = un1Var9;
                em1Var = em1Var3;
                r72 r72Var2 = q72Var.w;
                synchronized (r72Var2.b) {
                    try {
                        if (r72Var2.k.j()) {
                            jn1 b = um1.b(r72Var2.k);
                            r72Var2.k.a();
                            t21 t21Var = r72Var2.l;
                            ((tn1) t21Var.n).a();
                            ((tn1) t21Var.o).a();
                            r72Var2.n.a();
                            jn1Var = new jn1(b.b);
                            Object[] objArr = b.a;
                            int i5 = b.b;
                            int i6 = 0;
                            while (i6 < i5) {
                                int i7 = i6;
                                lm1 lm1Var = (lm1) objArr[i6];
                                jn1Var.a(new Pair(lm1Var, r72Var2.m.g(lm1Var)));
                                i6 = i7 + 1;
                                b50Var2 = b50Var2;
                                em1Var = em1Var;
                            }
                            b50Var = b50Var2;
                            em1Var2 = em1Var;
                            r72Var2.m.a();
                        } else {
                            b50Var = b50Var2;
                            em1Var2 = em1Var;
                            jn1Var = ot1.b;
                            jn1Var.getClass();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                Object[] objArr2 = jn1Var.a;
                int i8 = jn1Var.b;
                for (int i9 = 0; i9 < i8; i9++) {
                    Pair pair = (Pair) objArr2[i9];
                }
                i2 = 2;
                i3 = 1;
                q72Var = this;
                b50Var2 = b50Var;
                em1Var = em1Var2;
                synchronized (q72Var.w.b) {
                }
                r72 r72Var3 = q72Var.w;
                q72Var.v = em1Var;
                q72Var.m = list;
                q72Var.n = list2;
                q72Var.o = list3;
                q72Var.p = un1Var;
                q72Var.q = un1Var4;
                q72Var.r = un1Var3;
                q72Var.s = set;
                q72Var.t = un1Var2;
                q72Var.u = i3;
                if (r72Var3.v()) {
                    obj2 = Unit.a;
                } else {
                    fs fsVar2 = new fs(i3, q41.b(q72Var));
                    fsVar2.u();
                    synchronized (r72Var3.b) {
                        if (r72Var3.v()) {
                            fsVar = fsVar2;
                        } else {
                            r72Var3.q = fsVar2;
                            fsVar = null;
                        }
                    }
                    if (fsVar != null) {
                        aa2.a aVar = aa2.m;
                        fsVar.resumeWith(Unit.a);
                    }
                    obj2 = fsVar2.s();
                    if (obj2 != b50.m) {
                        obj2 = Unit.a;
                    }
                }
                if (obj2 != b50Var2) {
                    List list6 = list;
                    un1Var5 = un1Var;
                    un1Var6 = un1Var2;
                    list4 = list3;
                    list5 = list6;
                    final Set set2 = set;
                    final un1 un1Var10 = un1Var4;
                    final un1 un1Var11 = un1Var3;
                    r72Var = q72Var.w;
                    vo2 vo2Var = r72.x;
                    if (r72Var.B()) {
                        List list7 = list4;
                        un1Var2 = un1Var6;
                        un1Var = un1Var5;
                        list = list5;
                        list3 = list7;
                        q72Var = this;
                        un1Var3 = un1Var11;
                        un1Var4 = un1Var10;
                        set = set2;
                        synchronized (q72Var.w.b) {
                        }
                    } else {
                        final r72 r72Var4 = q72Var.w;
                        Function1 function1 = new Function1() { // from class: p72
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj3) {
                                boolean u;
                                Unit unit;
                                Object[] objArr3;
                                List list8;
                                List list9;
                                long j;
                                List list10;
                                List list11;
                                List list12;
                                un1 un1Var12;
                                Object[] objArr4;
                                boolean z;
                                r72 r72Var5 = r72.this;
                                un1 un1Var13 = un1Var11;
                                un1 un1Var14 = un1Var6;
                                List list13 = list5;
                                List list14 = list2;
                                un1 un1Var15 = un1Var5;
                                List list15 = list4;
                                un1 un1Var16 = un1Var10;
                                Set set3 = set2;
                                long longValue = ((Long) obj3).longValue();
                                synchronized (r72Var5.b) {
                                    u = r72Var5.u();
                                }
                                boolean z2 = 0;
                                if (u) {
                                    Trace.beginSection("Recomposer:animation");
                                    try {
                                        r72Var5.a.a(longValue);
                                        synchronized (tm2.c) {
                                            un1 un1Var17 = tm2.j.h;
                                            if (un1Var17 != null) {
                                                z = un1Var17.h();
                                            }
                                        }
                                        if (z) {
                                            tm2.a();
                                        }
                                        Unit unit2 = Unit.a;
                                    } finally {
                                    }
                                }
                                Trace.beginSection("Recomposer:recompose");
                                try {
                                    r72Var5.B();
                                    synchronized (r72Var5.b) {
                                        try {
                                            eo1 eo1Var = r72Var5.h;
                                            Object[] objArr5 = eo1Var.m;
                                            int i10 = eo1Var.o;
                                            for (int i11 = 0; i11 < i10; i11++) {
                                                list13.add((k00) objArr5[i11]);
                                            }
                                            r72Var5.h.g();
                                            Unit unit3 = Unit.a;
                                        } finally {
                                        }
                                    }
                                    un1Var13.b();
                                    un1Var14.b();
                                    while (true) {
                                        if (list13.isEmpty() && list14.isEmpty()) {
                                            break;
                                        }
                                        try {
                                            int size = list13.size();
                                            for (int i12 = 0; i12 < size; i12++) {
                                                k00 k00Var = (k00) list13.get(i12);
                                                k00 z3 = r72Var5.z(k00Var, un1Var13);
                                                if (z3 != null) {
                                                    list15.add(z3);
                                                    Unit unit4 = Unit.a;
                                                }
                                                un1Var14.a(k00Var);
                                            }
                                            list13.clear();
                                            if (un1Var13.h() || r72Var5.h.o != 0) {
                                                synchronized (r72Var5.b) {
                                                    try {
                                                        List w = r72Var5.w();
                                                        int size2 = w.size();
                                                        for (int i13 = 0; i13 < size2; i13++) {
                                                            k00 k00Var2 = (k00) w.get(i13);
                                                            if (!un1Var14.c(k00Var2) && k00Var2.v(set3)) {
                                                                list13.add(k00Var2);
                                                            }
                                                        }
                                                        eo1 eo1Var2 = r72Var5.h;
                                                        int i14 = eo1Var2.o;
                                                        int i15 = 0;
                                                        int i16 = 0;
                                                        while (true) {
                                                            objArr3 = eo1Var2.m;
                                                            if (i15 >= i14) {
                                                                break;
                                                            }
                                                            k00 k00Var3 = (k00) objArr3[i15];
                                                            if (!un1Var14.c(k00Var3) && !list13.contains(k00Var3)) {
                                                                list13.add(k00Var3);
                                                                i16++;
                                                            } else if (i16 > 0) {
                                                                Object[] objArr6 = eo1Var2.m;
                                                                objArr6[i15 - i16] = objArr6[i15];
                                                            }
                                                            i15++;
                                                        }
                                                        int i17 = i14 - i16;
                                                        Arrays.fill(objArr3, i17, i14, (Object) null);
                                                        eo1Var2.o = i17;
                                                        Unit unit5 = Unit.a;
                                                    } finally {
                                                    }
                                                }
                                            }
                                            if (list13.isEmpty()) {
                                                try {
                                                    q72.h(list14, r72Var5);
                                                    while (!list14.isEmpty()) {
                                                        List y = r72Var5.y(list14, un1Var13);
                                                        un1Var15.getClass();
                                                        y.getClass();
                                                        Iterator it = y.iterator();
                                                        while (it.hasNext()) {
                                                            un1Var15.j(it.next());
                                                        }
                                                        q72.h(list14, r72Var5);
                                                    }
                                                } catch (Throwable th2) {
                                                    r72Var5.A(th2, null);
                                                    q72.f(r72Var5, list13, list14, list15, un1Var15, un1Var16, un1Var13, un1Var14);
                                                    unit = Unit.a;
                                                    return unit;
                                                }
                                            }
                                            z2 = 0;
                                        } catch (Throwable th3) {
                                            try {
                                                r72Var5.A(th3, null);
                                                q72.f(r72Var5, list13, list14, list15, un1Var15, un1Var16, un1Var13, un1Var14);
                                                unit = Unit.a;
                                                list13.clear();
                                                return unit;
                                            } catch (Throwable th4) {
                                                list13.clear();
                                                throw th4;
                                            }
                                        }
                                    }
                                    nm2 k = tm2.k();
                                    nm2 kz2Var = k instanceof yn1 ? new kz2((yn1) k, null, null, true, false) : new lz2(k, null, true, z2);
                                    try {
                                        nm2 j2 = kz2Var.j();
                                        try {
                                            if (!list15.isEmpty()) {
                                                try {
                                                    int size3 = list15.size();
                                                    for (int i18 = z2; i18 < size3; i18++) {
                                                        un1Var16.a((k00) list15.get(i18));
                                                    }
                                                    int size4 = list15.size();
                                                    for (int i19 = z2; i19 < size4; i19++) {
                                                        ((k00) list15.get(i19)).d();
                                                    }
                                                } catch (Throwable th5) {
                                                    try {
                                                        r72Var5.A(th5, null);
                                                        q72.f(r72Var5, list13, list14, list15, un1Var15, un1Var16, un1Var13, un1Var14);
                                                        unit = Unit.a;
                                                        nm2.q(j2);
                                                        return unit;
                                                    } finally {
                                                        list15.clear();
                                                    }
                                                }
                                            }
                                            if (un1Var15.h()) {
                                                try {
                                                    un1Var16.i(un1Var15);
                                                    Object[] objArr7 = un1Var15.b;
                                                    long[] jArr = un1Var15.a;
                                                    int length = jArr.length - 2;
                                                    if (length >= 0) {
                                                        int i20 = 0;
                                                        j = 255;
                                                        while (true) {
                                                            long j3 = jArr[i20];
                                                            list8 = list13;
                                                            list9 = list14;
                                                            if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                int i21 = 8 - ((~(i20 - length)) >>> 31);
                                                                for (int i22 = 0; i22 < i21; i22++) {
                                                                    if ((j3 & 255) < 128) {
                                                                        try {
                                                                            ((k00) objArr7[(i20 << 3) + i22]).f();
                                                                        } catch (Throwable th6) {
                                                                            th = th6;
                                                                            try {
                                                                                r72Var5.A(th, null);
                                                                                q72.f(r72Var5, list8, list9, list15, un1Var15, un1Var16, un1Var13, un1Var14);
                                                                                unit = Unit.a;
                                                                                nm2.q(j2);
                                                                                return unit;
                                                                            } finally {
                                                                                un1Var15.b();
                                                                            }
                                                                        }
                                                                    }
                                                                    j3 >>= 8;
                                                                }
                                                                if (i21 != 8) {
                                                                    break;
                                                                }
                                                            }
                                                            if (i20 == length) {
                                                                break;
                                                            }
                                                            i20++;
                                                            list13 = list8;
                                                            list14 = list9;
                                                        }
                                                    } else {
                                                        list8 = list13;
                                                        list9 = list14;
                                                        j = 255;
                                                    }
                                                    list13 = list8;
                                                    list14 = list9;
                                                } catch (Throwable th7) {
                                                    th = th7;
                                                    list8 = list13;
                                                    list9 = list14;
                                                }
                                            } else {
                                                j = 255;
                                            }
                                            if (un1Var16.h()) {
                                                try {
                                                    Object[] objArr8 = un1Var16.b;
                                                    long[] jArr2 = un1Var16.a;
                                                    int length2 = jArr2.length - 2;
                                                    if (length2 >= 0) {
                                                        list10 = list13;
                                                        list11 = list14;
                                                        int i23 = 0;
                                                        while (true) {
                                                            try {
                                                                long j4 = jArr2[i23];
                                                                list12 = list15;
                                                                un1Var12 = un1Var15;
                                                                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                    int i24 = 8 - ((~(i23 - length2)) >>> 31);
                                                                    int i25 = 0;
                                                                    while (i25 < i24) {
                                                                        if ((j4 & j) < 128) {
                                                                            try {
                                                                                ((k00) objArr8[(i23 << 3) + i25]).g();
                                                                            } catch (Throwable th8) {
                                                                                th = th8;
                                                                                try {
                                                                                    r72Var5.A(th, null);
                                                                                    q72.f(r72Var5, list10, list11, list12, un1Var12, un1Var16, un1Var13, un1Var14);
                                                                                    unit = Unit.a;
                                                                                    return unit;
                                                                                } finally {
                                                                                    un1Var16.b();
                                                                                }
                                                                            }
                                                                        }
                                                                        j4 >>= 8;
                                                                        i25++;
                                                                        objArr8 = objArr8;
                                                                    }
                                                                    objArr4 = objArr8;
                                                                    if (i24 != 8) {
                                                                        break;
                                                                    }
                                                                } else {
                                                                    objArr4 = objArr8;
                                                                }
                                                                if (i23 == length2) {
                                                                    break;
                                                                }
                                                                i23++;
                                                                un1Var15 = un1Var12;
                                                                list15 = list12;
                                                                objArr8 = objArr4;
                                                            } catch (Throwable th9) {
                                                                th = th9;
                                                                list12 = list15;
                                                                un1Var12 = un1Var15;
                                                                r72Var5.A(th, null);
                                                                q72.f(r72Var5, list10, list11, list12, un1Var12, un1Var16, un1Var13, un1Var14);
                                                                unit = Unit.a;
                                                                return unit;
                                                            }
                                                        }
                                                    }
                                                } catch (Throwable th10) {
                                                    th = th10;
                                                    list10 = list13;
                                                    list11 = list14;
                                                }
                                            }
                                            Unit unit6 = Unit.a;
                                            kz2Var.c();
                                            synchronized (r72Var5.b) {
                                                r72Var5.t();
                                            }
                                            tm2.k().m();
                                            un1Var14.b();
                                            un1Var13.b();
                                            r72Var5.p = null;
                                            Trace.endSection();
                                            return Unit.a;
                                        } finally {
                                            nm2.q(j2);
                                        }
                                    } finally {
                                        kz2Var.c();
                                    }
                                } finally {
                                }
                            }
                        };
                        q72Var.v = em1Var;
                        q72Var.m = list5;
                        q72Var.n = list2;
                        q72Var.o = list4;
                        q72Var.p = un1Var5;
                        q72Var.q = un1Var10;
                        q72Var.r = un1Var11;
                        q72Var.s = set2;
                        q72Var.t = un1Var6;
                        q72Var.u = i2;
                        if (em1Var.B(function1, q72Var) != b50Var2) {
                            List list8 = list4;
                            un1Var2 = un1Var6;
                            un1Var = un1Var5;
                            list = list5;
                            list3 = list8;
                            un1Var3 = un1Var11;
                            un1Var4 = un1Var10;
                            set = set2;
                            r72 r72Var22 = q72Var.w;
                            synchronized (r72Var22.b) {
                            }
                        }
                    }
                }
                return b50Var2;
            }
            un1 un1Var12 = q72Var.t;
            set = q72Var.s;
            un1Var3 = q72Var.r;
            un1Var4 = q72Var.q;
            un1 un1Var13 = q72Var.p;
            List list9 = q72Var.o;
            list2 = q72Var.n;
            List list10 = q72Var.m;
            em1 em1Var4 = q72Var.v;
            ca2.b(obj);
            un1Var6 = un1Var12;
            em1Var = em1Var4;
            list4 = list9;
            list5 = list10;
            un1Var5 = un1Var13;
            final Set set22 = set;
            final un1 un1Var102 = un1Var4;
            final un1 un1Var112 = un1Var3;
            r72Var = q72Var.w;
            vo2 vo2Var2 = r72.x;
            if (r72Var.B()) {
            }
        }
    }
}
