package defpackage;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class n11 extends sf1 implements s30 {
    public List i;
    public List j;
    public List k;
    public wn0 l;
    public wn0 m;
    public wn0 n;
    public Set o;
    public wn0 p;
    public int q;
    public /* synthetic */ gm0 r;
    public final /* synthetic */ o11 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n11(o11 o11Var, dn dnVar) {
        super(3, dnVar);
        this.s = o11Var;
    }

    public static final void o(o11 o11Var, List list, List list2, List list3, wn0 wn0Var, wn0 wn0Var2, wn0 wn0Var3, wn0 wn0Var4) {
        char c;
        long j;
        long j2;
        synchronized (o11Var.c) {
            try {
                list.clear();
                list2.clear();
                int size = list3.size();
                for (int i = 0; i < size; i++) {
                    tl tlVar = (tl) list3.get(i);
                    tlVar.a();
                    o11Var.L(tlVar);
                }
                list3.clear();
                Object[] objArr = wn0Var.b;
                long[] jArr = wn0Var.a;
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
                                    tl tlVar2 = (tl) objArr[(i2 << 3) + i4];
                                    tlVar2.a();
                                    o11Var.L(tlVar2);
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
                wn0Var.b();
                Object[] objArr2 = wn0Var2.b;
                long[] jArr2 = wn0Var2.a;
                int length2 = jArr2.length - 2;
                if (length2 >= 0) {
                    int i5 = 0;
                    while (true) {
                        long j4 = jArr2[i5];
                        if ((((~j4) << c) & j4 & j2) != j2) {
                            int i6 = 8 - ((~(i5 - length2)) >>> 31);
                            for (int i7 = 0; i7 < i6; i7++) {
                                if ((j4 & j) < 128) {
                                    ((tl) objArr2[(i5 << 3) + i7]).g();
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
                wn0Var2.b();
                wn0Var3.b();
                Object[] objArr3 = wn0Var4.b;
                long[] jArr3 = wn0Var4.a;
                int length3 = jArr3.length - 2;
                if (length3 >= 0) {
                    int i8 = 0;
                    while (true) {
                        long j5 = jArr3[i8];
                        if ((((~j5) << c) & j5 & j2) != j2) {
                            int i9 = 8 - ((~(i8 - length3)) >>> 31);
                            for (int i10 = 0; i10 < i9; i10++) {
                                if ((j5 & j) < 128) {
                                    tl tlVar3 = (tl) objArr3[(i8 << 3) + i10];
                                    tlVar3.a();
                                    o11Var.L(tlVar3);
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
                wn0Var4.b();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final void p(List list, o11 o11Var) {
        list.clear();
        synchronized (o11Var.c) {
            try {
                ArrayList arrayList = o11Var.k;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    list.add((xm0) arrayList.get(i));
                }
                o11Var.k.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.s30
    public final Object a(Object obj, Object obj2, Object obj3) {
        n11 n11Var = new n11(this.s, (dn) obj3);
        n11Var.r = (gm0) obj2;
        n11Var.k(Unit.a);
        return tn.d;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0098 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0133 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x0126 -> B:6:0x012e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x01db -> B:20:0x0093). Please report as a decompilation issue!!! */
    @Override // defpackage.yc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(Object obj) {
        gm0 gm0Var;
        wn0 wn0Var;
        wn0 wn0Var2;
        List list;
        Set set;
        final List list2;
        wn0 wn0Var3;
        List list3;
        wn0 wn0Var4;
        final List list4;
        final wn0 wn0Var5;
        final List list5;
        final wn0 wn0Var6;
        o11 o11Var;
        Object obj2;
        tf tfVar;
        tn tnVar;
        gm0 gm0Var2;
        mn0 mn0Var;
        tn tnVar2 = tn.d;
        int i = this.q;
        int i2 = 2;
        int i3 = 1;
        if (i == 0) {
            ca0.v(obj);
            gm0Var = this.r;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            wn0 wn0Var7 = r61.a;
            wn0Var = new wn0();
            wn0 wn0Var8 = new wn0();
            wn0 wn0Var9 = new wn0();
            s61 s61Var = new s61(wn0Var9);
            wn0Var2 = new wn0();
            list = arrayList;
            set = s61Var;
            list2 = arrayList2;
            wn0Var3 = wn0Var9;
            list3 = arrayList3;
            wn0Var4 = wn0Var8;
            synchronized (this.s.c) {
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    dd0.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                wn0 wn0Var10 = this.p;
                set = this.o;
                wn0Var3 = this.n;
                wn0Var4 = this.m;
                wn0Var = this.l;
                list3 = this.k;
                list2 = this.j;
                list = this.i;
                gm0 gm0Var3 = this.r;
                ca0.v(obj);
                wn0Var2 = wn0Var10;
                gm0Var = gm0Var3;
                o11 o11Var2 = this.s;
                synchronized (o11Var2.c) {
                    try {
                        if (o11Var2.l.j()) {
                            mn0 b = zm0.b(o11Var2.l);
                            o11Var2.l.a();
                            yw ywVar = o11Var2.m;
                            ((vn0) ywVar.e).a();
                            ((vn0) ywVar.g).a();
                            o11Var2.o.a();
                            mn0Var = new mn0(b.b);
                            Object[] objArr = b.a;
                            int i4 = b.b;
                            tnVar = tnVar2;
                            int i5 = 0;
                            while (i5 < i4) {
                                int i6 = i5;
                                xm0 xm0Var = (xm0) objArr[i5];
                                mn0Var.a(new Pair(xm0Var, o11Var2.n.g(xm0Var)));
                                i5 = i6 + 1;
                                gm0Var = gm0Var;
                                objArr = objArr;
                            }
                            gm0Var2 = gm0Var;
                            o11Var2.n.a();
                        } else {
                            tnVar = tnVar2;
                            gm0Var2 = gm0Var;
                            mn0Var = rq0.b;
                            mn0Var.getClass();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                Object[] objArr2 = mn0Var.a;
                int i7 = mn0Var.b;
                for (int i8 = 0; i8 < i7; i8++) {
                    Pair pair = (Pair) objArr2[i8];
                }
                i8 i8Var = this.s.b;
                ((ha) i8Var.e).set(0);
                ((mc) i8Var.g).i(new q1(19));
                tnVar2 = tnVar;
                gm0Var = gm0Var2;
                i2 = 2;
                i3 = 1;
                synchronized (this.s.c) {
                }
                o11 o11Var3 = this.s;
                this.r = gm0Var;
                this.i = list;
                this.j = list2;
                this.k = list3;
                this.l = wn0Var;
                this.m = wn0Var4;
                this.n = wn0Var3;
                this.o = set;
                this.p = wn0Var2;
                this.q = i3;
                if (o11Var3.C()) {
                    obj2 = Unit.a;
                } else {
                    tf tfVar2 = new tf(i3, qa0.b(this));
                    tfVar2.w();
                    synchronized (o11Var3.c) {
                        if (o11Var3.C()) {
                            tfVar = tfVar2;
                        } else {
                            o11Var3.r = tfVar2;
                            tfVar = null;
                        }
                    }
                    if (tfVar != null) {
                        i31 i31Var = k31.d;
                        tfVar.l(Unit.a);
                    }
                    obj2 = tfVar2.u();
                    if (obj2 != tn.d) {
                        obj2 = Unit.a;
                    }
                }
                if (obj2 != tnVar2) {
                    List list6 = list;
                    wn0Var5 = wn0Var;
                    wn0Var6 = wn0Var2;
                    list4 = list3;
                    list5 = list6;
                    final Set set2 = set;
                    final wn0 wn0Var11 = wn0Var4;
                    final wn0 wn0Var12 = wn0Var3;
                    o11Var = this.s;
                    be1 be1Var = o11.z;
                    if (o11Var.K()) {
                        List list7 = list4;
                        wn0Var2 = wn0Var6;
                        wn0Var = wn0Var5;
                        list = list5;
                        list3 = list7;
                        wn0Var3 = wn0Var12;
                        wn0Var4 = wn0Var11;
                        set = set2;
                        synchronized (this.s.c) {
                        }
                    } else {
                        final o11 o11Var4 = this.s;
                        Function1 function1 = new Function1() { // from class: m11
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj3) {
                                boolean z;
                                Unit unit;
                                Object[] objArr3;
                                List list8;
                                List list9;
                                long j;
                                List list10;
                                List list11;
                                List list12;
                                wn0 wn0Var13;
                                Object[] objArr4;
                                boolean z2;
                                o11 o11Var5 = o11.this;
                                wn0 wn0Var14 = wn0Var12;
                                wn0 wn0Var15 = wn0Var6;
                                List list13 = list5;
                                List list14 = list2;
                                wn0 wn0Var16 = wn0Var5;
                                List list15 = list4;
                                wn0 wn0Var17 = wn0Var11;
                                Set set3 = set2;
                                long longValue = ((Long) obj3).longValue();
                                synchronized (o11Var5.c) {
                                    z = o11Var5.z();
                                }
                                boolean z3 = 0;
                                if (z) {
                                    Trace.beginSection("Recomposer:animation");
                                    try {
                                        o11Var5.a.e.i(new ne(0, longValue));
                                        synchronized (pb1.c) {
                                            wn0 wn0Var18 = pb1.j.h;
                                            if (wn0Var18 != null) {
                                                z2 = wn0Var18.h();
                                            }
                                        }
                                        if (z2) {
                                            pb1.a();
                                        }
                                    } finally {
                                    }
                                }
                                Trace.beginSection("Recomposer:recompose");
                                try {
                                    o11Var5.K();
                                    synchronized (o11Var5.c) {
                                        try {
                                            eo0 eo0Var = o11Var5.i;
                                            Object[] objArr5 = eo0Var.d;
                                            int i9 = eo0Var.g;
                                            for (int i10 = 0; i10 < i9; i10++) {
                                                list13.add((tl) objArr5[i10]);
                                            }
                                            o11Var5.i.g();
                                        } finally {
                                        }
                                    }
                                    wn0Var14.b();
                                    wn0Var15.b();
                                    while (true) {
                                        if (list13.isEmpty() && list14.isEmpty()) {
                                            break;
                                        }
                                        try {
                                            int size = list13.size();
                                            for (int i11 = 0; i11 < size; i11++) {
                                                tl tlVar = (tl) list13.get(i11);
                                                tl I = o11Var5.I(tlVar, wn0Var14);
                                                if (I != null) {
                                                    list15.add(I);
                                                }
                                                wn0Var15.a(tlVar);
                                            }
                                            list13.clear();
                                            if (wn0Var14.h() || o11Var5.i.g != 0) {
                                                synchronized (o11Var5.c) {
                                                    try {
                                                        List D = o11Var5.D();
                                                        int size2 = D.size();
                                                        for (int i12 = 0; i12 < size2; i12++) {
                                                            tl tlVar2 = (tl) D.get(i12);
                                                            if (!wn0Var15.c(tlVar2) && tlVar2.w(set3)) {
                                                                list13.add(tlVar2);
                                                            }
                                                        }
                                                        eo0 eo0Var2 = o11Var5.i;
                                                        int i13 = eo0Var2.g;
                                                        int i14 = 0;
                                                        int i15 = 0;
                                                        while (true) {
                                                            objArr3 = eo0Var2.d;
                                                            if (i14 >= i13) {
                                                                break;
                                                            }
                                                            tl tlVar3 = (tl) objArr3[i14];
                                                            if (!wn0Var15.c(tlVar3) && !list13.contains(tlVar3)) {
                                                                list13.add(tlVar3);
                                                                i15++;
                                                            } else if (i15 > 0) {
                                                                Object[] objArr6 = eo0Var2.d;
                                                                objArr6[i14 - i15] = objArr6[i14];
                                                            }
                                                            i14++;
                                                        }
                                                        int i16 = i13 - i15;
                                                        Arrays.fill(objArr3, i16, i13, (Object) null);
                                                        eo0Var2.g = i16;
                                                    } finally {
                                                    }
                                                }
                                            }
                                            if (list13.isEmpty()) {
                                                try {
                                                    n11.p(list14, o11Var5);
                                                    while (!list14.isEmpty()) {
                                                        List H = o11Var5.H(list14, wn0Var14);
                                                        wn0Var16.getClass();
                                                        H.getClass();
                                                        Iterator it = H.iterator();
                                                        while (it.hasNext()) {
                                                            wn0Var16.k(it.next());
                                                        }
                                                        n11.p(list14, o11Var5);
                                                    }
                                                } catch (Throwable th2) {
                                                    o11Var5.J(th2, null);
                                                    n11.o(o11Var5, list13, list14, list15, wn0Var16, wn0Var17, wn0Var14, wn0Var15);
                                                    unit = Unit.a;
                                                    return unit;
                                                }
                                            }
                                            z3 = 0;
                                        } catch (Throwable th3) {
                                            try {
                                                o11Var5.J(th3, null);
                                                n11.o(o11Var5, list13, list14, list15, wn0Var16, wn0Var17, wn0Var14, wn0Var15);
                                                unit = Unit.a;
                                                list13.clear();
                                                return unit;
                                            } catch (Throwable th4) {
                                                list13.clear();
                                                throw th4;
                                            }
                                        }
                                    }
                                    ib1 j2 = pb1.j();
                                    ib1 cj1Var = j2 instanceof zn0 ? new cj1((zn0) j2, null, null, true, false) : new dj1(j2, null, true, z3);
                                    try {
                                        ib1 j3 = cj1Var.j();
                                        try {
                                            if (!list15.isEmpty()) {
                                                try {
                                                    int size3 = list15.size();
                                                    for (int i17 = z3; i17 < size3; i17++) {
                                                        wn0Var17.a((tl) list15.get(i17));
                                                    }
                                                    int size4 = list15.size();
                                                    for (int i18 = z3; i18 < size4; i18++) {
                                                        ((tl) list15.get(i18)).d();
                                                    }
                                                } catch (Throwable th5) {
                                                    try {
                                                        o11Var5.J(th5, null);
                                                        n11.o(o11Var5, list13, list14, list15, wn0Var16, wn0Var17, wn0Var14, wn0Var15);
                                                        unit = Unit.a;
                                                        ib1.q(j3);
                                                        return unit;
                                                    } finally {
                                                        list15.clear();
                                                    }
                                                }
                                            }
                                            if (wn0Var16.h()) {
                                                try {
                                                    wn0Var17.j(wn0Var16);
                                                    Object[] objArr7 = wn0Var16.b;
                                                    long[] jArr = wn0Var16.a;
                                                    int length = jArr.length - 2;
                                                    if (length >= 0) {
                                                        int i19 = 0;
                                                        j = 255;
                                                        while (true) {
                                                            long j4 = jArr[i19];
                                                            list8 = list13;
                                                            list9 = list14;
                                                            if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                int i20 = 8 - ((~(i19 - length)) >>> 31);
                                                                for (int i21 = 0; i21 < i20; i21++) {
                                                                    if ((j4 & 255) < 128) {
                                                                        try {
                                                                            ((tl) objArr7[(i19 << 3) + i21]).f();
                                                                        } catch (Throwable th6) {
                                                                            th = th6;
                                                                            try {
                                                                                o11Var5.J(th, null);
                                                                                n11.o(o11Var5, list8, list9, list15, wn0Var16, wn0Var17, wn0Var14, wn0Var15);
                                                                                unit = Unit.a;
                                                                                ib1.q(j3);
                                                                                return unit;
                                                                            } finally {
                                                                                wn0Var16.b();
                                                                            }
                                                                        }
                                                                    }
                                                                    j4 >>= 8;
                                                                }
                                                                if (i20 != 8) {
                                                                    break;
                                                                }
                                                            }
                                                            if (i19 == length) {
                                                                break;
                                                            }
                                                            i19++;
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
                                            if (wn0Var17.h()) {
                                                try {
                                                    Object[] objArr8 = wn0Var17.b;
                                                    long[] jArr2 = wn0Var17.a;
                                                    int length2 = jArr2.length - 2;
                                                    if (length2 >= 0) {
                                                        list10 = list13;
                                                        list11 = list14;
                                                        int i22 = 0;
                                                        while (true) {
                                                            try {
                                                                long j5 = jArr2[i22];
                                                                list12 = list15;
                                                                wn0Var13 = wn0Var16;
                                                                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                    int i23 = 8 - ((~(i22 - length2)) >>> 31);
                                                                    int i24 = 0;
                                                                    while (i24 < i23) {
                                                                        if ((j5 & j) < 128) {
                                                                            try {
                                                                                ((tl) objArr8[(i22 << 3) + i24]).g();
                                                                            } catch (Throwable th8) {
                                                                                th = th8;
                                                                                try {
                                                                                    o11Var5.J(th, null);
                                                                                    n11.o(o11Var5, list10, list11, list12, wn0Var13, wn0Var17, wn0Var14, wn0Var15);
                                                                                    unit = Unit.a;
                                                                                    return unit;
                                                                                } finally {
                                                                                    wn0Var17.b();
                                                                                }
                                                                            }
                                                                        }
                                                                        j5 >>= 8;
                                                                        i24++;
                                                                        objArr8 = objArr8;
                                                                    }
                                                                    objArr4 = objArr8;
                                                                    if (i23 != 8) {
                                                                        break;
                                                                    }
                                                                } else {
                                                                    objArr4 = objArr8;
                                                                }
                                                                if (i22 == length2) {
                                                                    break;
                                                                }
                                                                i22++;
                                                                wn0Var16 = wn0Var13;
                                                                list15 = list12;
                                                                objArr8 = objArr4;
                                                            } catch (Throwable th9) {
                                                                th = th9;
                                                                list12 = list15;
                                                                wn0Var13 = wn0Var16;
                                                                o11Var5.J(th, null);
                                                                n11.o(o11Var5, list10, list11, list12, wn0Var13, wn0Var17, wn0Var14, wn0Var15);
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
                                            cj1Var.c();
                                            synchronized (o11Var5.c) {
                                                o11Var5.y();
                                            }
                                            pb1.j().m();
                                            wn0Var15.b();
                                            wn0Var14.b();
                                            o11Var5.q = null;
                                            Trace.endSection();
                                            return Unit.a;
                                        } finally {
                                            ib1.q(j3);
                                        }
                                    } finally {
                                        cj1Var.c();
                                    }
                                } finally {
                                }
                            }
                        };
                        this.r = gm0Var;
                        this.i = list5;
                        this.j = list2;
                        this.k = list4;
                        this.l = wn0Var5;
                        this.m = wn0Var11;
                        this.n = wn0Var12;
                        this.o = set2;
                        this.p = wn0Var6;
                        this.q = i2;
                        if (gm0Var.j(function1, this) != tnVar2) {
                            List list8 = list4;
                            wn0Var2 = wn0Var6;
                            wn0Var = wn0Var5;
                            list = list5;
                            list3 = list8;
                            wn0Var3 = wn0Var12;
                            wn0Var4 = wn0Var11;
                            set = set2;
                            o11 o11Var22 = this.s;
                            synchronized (o11Var22.c) {
                            }
                        }
                    }
                }
                return tnVar2;
            }
            wn0 wn0Var13 = this.p;
            set = this.o;
            wn0Var3 = this.n;
            wn0Var4 = this.m;
            wn0 wn0Var14 = this.l;
            List list9 = this.k;
            list2 = this.j;
            List list10 = this.i;
            gm0 gm0Var4 = this.r;
            ca0.v(obj);
            wn0Var6 = wn0Var13;
            gm0Var = gm0Var4;
            list4 = list9;
            list5 = list10;
            wn0Var5 = wn0Var14;
            final Set set22 = set;
            final wn0 wn0Var112 = wn0Var4;
            final wn0 wn0Var122 = wn0Var3;
            o11Var = this.s;
            be1 be1Var2 = o11.z;
            if (o11Var.K()) {
            }
        }
    }
}
