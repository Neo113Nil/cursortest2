package g0;

import android.os.Trace;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class r1 extends r6.l implements q6.c {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ t1 f3868g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ i.b0 f3869h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ i.b0 f3870i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ List f3871j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ List f3872k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i.b0 f3873l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ List f3874m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ i.b0 f3875n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Set f3876o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(t1 t1Var, i.b0 b0Var, i.b0 b0Var2, List list, List list2, i.b0 b0Var3, List list3, i.b0 b0Var4, Set set) {
        super(1);
        this.f3868g = t1Var;
        this.f3869h = b0Var;
        this.f3870i = b0Var2;
        this.f3871j = list;
        this.f3872k = list2;
        this.f3873l = b0Var3;
        this.f3874m = list3;
        this.f3875n = b0Var4;
        this.f3876o = set;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0036, code lost:
    
        if (r0.h() == true) goto L19;
     */
    @Override // q6.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(Object obj) {
        boolean u8;
        long j8;
        int i7;
        boolean z8;
        long longValue = ((Number) obj).longValue();
        t1 t1Var = this.f3868g;
        synchronized (t1Var.f3908b) {
            u8 = t1Var.u();
        }
        if (u8) {
            t1 t1Var2 = this.f3868g;
            Trace.beginSection("Recomposer:animation");
            try {
                t1Var2.f3907a.a(longValue);
                synchronized (q0.n.f7427b) {
                    i.b0 b0Var = ((q0.b) q0.n.f7434i.get()).f7390h;
                    z8 = b0Var != null;
                }
                if (z8) {
                    q0.n.a();
                }
            } finally {
            }
        }
        t1 t1Var3 = this.f3868g;
        i.b0 b0Var2 = this.f3869h;
        i.b0 b0Var3 = this.f3870i;
        List list = this.f3871j;
        List list2 = this.f3872k;
        i.b0 b0Var4 = this.f3873l;
        List list3 = this.f3874m;
        i.b0 b0Var5 = this.f3875n;
        Set set = this.f3876o;
        Trace.beginSection("Recomposer:recompose");
        try {
            t1.q(t1Var3);
            synchronized (t1Var3.f3908b) {
                try {
                    i0.d dVar = t1Var3.f3914h;
                    int i8 = dVar.f4842h;
                    if (i8 > 0) {
                        Object[] objArr = dVar.f4840f;
                        int i9 = 0;
                        do {
                            list.add((u) objArr[i9]);
                            i9++;
                        } while (i9 < i8);
                    }
                    t1Var3.f3914h.h();
                } finally {
                }
            }
            b0Var2.b();
            b0Var3.b();
            while (true) {
                if (list.isEmpty() && list2.isEmpty()) {
                    break;
                }
                try {
                    try {
                        int size = list.size();
                        for (int i10 = 0; i10 < size; i10++) {
                            u uVar = (u) list.get(i10);
                            u p6 = t1.p(t1Var3, uVar, b0Var2);
                            if (p6 != null) {
                                list3.add(p6);
                            }
                            b0Var3.a(uVar);
                        }
                        list.clear();
                        if (b0Var2.h() || t1Var3.f3914h.m()) {
                            synchronized (t1Var3.f3908b) {
                                try {
                                    List w4 = t1Var3.w();
                                    int size2 = w4.size();
                                    for (int i11 = 0; i11 < size2; i11++) {
                                        u uVar2 = (u) w4.get(i11);
                                        if (!b0Var3.c(uVar2) && uVar2.s(set)) {
                                            list.add(uVar2);
                                        }
                                    }
                                    i0.d dVar2 = t1Var3.f3914h;
                                    int i12 = dVar2.f4842h;
                                    int i13 = 0;
                                    for (int i14 = 0; i14 < i12; i14++) {
                                        u uVar3 = (u) dVar2.f4840f[i14];
                                        if (!b0Var3.c(uVar3) && !list.contains(uVar3)) {
                                            list.add(uVar3);
                                            i13++;
                                        } else if (i13 > 0) {
                                            Object[] objArr2 = dVar2.f4840f;
                                            objArr2[i14 - i13] = objArr2[i14];
                                        }
                                    }
                                    int i15 = i12 - i13;
                                    Arrays.fill(dVar2.f4840f, i15, i12, (Object) null);
                                    dVar2.f4842h = i15;
                                } finally {
                                }
                            }
                        }
                        if (list.isEmpty()) {
                            try {
                                s1.n(list2, t1Var3);
                                while (!list2.isEmpty()) {
                                    List y4 = t1Var3.y(list2, b0Var2);
                                    b0Var4.getClass();
                                    for (Object obj2 : y4) {
                                        b0Var4.f4722b[b0Var4.d(obj2)] = obj2;
                                    }
                                    s1.n(list2, t1Var3);
                                }
                            } catch (Exception e9) {
                                t1Var3.z(e9, null);
                                s1.m(t1Var3, list, list2, list3, b0Var4, b0Var5, b0Var2, b0Var3);
                            }
                        }
                    } catch (Exception e10) {
                        t1Var3.z(e10, null);
                        s1.m(t1Var3, list, list2, list3, b0Var4, b0Var5, b0Var2, b0Var3);
                        list.clear();
                    }
                } finally {
                    list.clear();
                }
            }
            if (!list3.isEmpty()) {
                try {
                    try {
                        int size3 = list3.size();
                        for (int i16 = 0; i16 < size3; i16++) {
                            b0Var5.a((u) list3.get(i16));
                        }
                        int size4 = list3.size();
                        for (int i17 = 0; i17 < size4; i17++) {
                            ((u) list3.get(i17)).d();
                        }
                        list3.clear();
                    } catch (Exception e11) {
                        t1Var3.z(e11, null);
                        s1.m(t1Var3, list, list2, list3, b0Var4, b0Var5, b0Var2, b0Var3);
                        list3.clear();
                    }
                } finally {
                    list3.clear();
                }
            }
            int i18 = 8;
            if (b0Var4.h()) {
                try {
                    try {
                        b0Var5.i(b0Var4);
                        Object[] objArr3 = b0Var4.f4722b;
                        long[] jArr = b0Var4.f4721a;
                        j8 = 128;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i19 = 0;
                            while (true) {
                                long j9 = jArr[i19];
                                Object[] objArr4 = objArr3;
                                if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i20 = 8 - ((~(i19 - length)) >>> 31);
                                    for (int i21 = 0; i21 < i20; i21++) {
                                        if ((j9 & 255) < 128) {
                                            ((u) objArr4[(i19 << 3) + i21]).f();
                                        }
                                        j9 >>= 8;
                                    }
                                    if (i20 != 8) {
                                        break;
                                    }
                                }
                                if (i19 == length) {
                                    break;
                                }
                                i19++;
                                objArr3 = objArr4;
                            }
                        }
                    } catch (Exception e12) {
                        t1Var3.z(e12, null);
                        s1.m(t1Var3, list, list2, list3, b0Var4, b0Var5, b0Var2, b0Var3);
                        b0Var4.b();
                    }
                } finally {
                    b0Var4.b();
                }
            } else {
                j8 = 128;
            }
            if (b0Var5.h()) {
                try {
                    try {
                        Object[] objArr5 = b0Var5.f4722b;
                        long[] jArr2 = b0Var5.f4721a;
                        int length2 = jArr2.length - 2;
                        if (length2 >= 0) {
                            int i22 = 0;
                            while (true) {
                                long j10 = jArr2[i22];
                                int i23 = i18;
                                int i24 = length2;
                                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i25 = 8 - ((~(i22 - i24)) >>> 31);
                                    for (int i26 = 0; i26 < i25; i26++) {
                                        if ((j10 & 255) < j8) {
                                            ((u) objArr5[(i22 << 3) + i26]).g();
                                        }
                                        j10 >>= i23;
                                    }
                                    i7 = i23;
                                    if (i25 != i7) {
                                        break;
                                    }
                                } else {
                                    i7 = i23;
                                }
                                if (i22 == i24) {
                                    break;
                                }
                                i22++;
                                int i27 = i7;
                                length2 = i24;
                                i18 = i27;
                            }
                        }
                    } catch (Exception e13) {
                        t1Var3.z(e13, null);
                        s1.m(t1Var3, list, list2, list3, b0Var4, b0Var5, b0Var2, b0Var3);
                        b0Var5.b();
                    }
                } finally {
                    b0Var5.b();
                }
            }
            synchronized (t1Var3.f3908b) {
                t1Var3.t();
            }
            q0.n.k().m();
            b0Var3.b();
            b0Var2.b();
            t1Var3.f3920n = null;
            return d6.z.f2639a;
        } finally {
        }
    }
}
