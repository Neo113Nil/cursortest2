package defpackage;

import java.util.Arrays;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.d;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class tg2 extends rp3 {
    public static final od D = new od(0.0f);
    public static final od E = new od(1.0f);
    public final lg2 A;
    public float B;
    public final lg2 C;
    public final lz1 n;
    public final lz1 o;
    public Object p;
    public fz2 q;
    public long r;
    public final ng2 s;
    public final hz1 t;
    public fs u;
    public final qo1 v;
    public final no1 w;
    public long x;
    public final jn1 y;
    public kg2 z;

    public tg2(cp1 cp1Var) {
        super(3);
        this.n = ij2.j(cp1Var);
        this.o = ij2.j(cp1Var);
        this.p = cp1Var;
        int i = 0;
        this.s = new ng2(i, this);
        this.t = new hz1(0.0f);
        this.v = new qo1();
        this.w = new no1();
        this.x = Long.MIN_VALUE;
        this.y = new jn1();
        this.A = new lg2(this, 1);
        this.C = new lg2(this, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0057, code lost:
    
        if (r2.f(r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object A(tg2 tg2Var, r30 r30Var) {
        rg2 rg2Var;
        b50 b50Var;
        int i;
        Object value;
        Object s;
        tg2 tg2Var2;
        Object obj;
        tg2Var.getClass();
        if (r30Var instanceof rg2) {
            rg2Var = (rg2) r30Var;
            int i2 = rg2Var.q;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rg2Var.q = i2 - Integer.MIN_VALUE;
                Object obj2 = rg2Var.o;
                b50Var = b50.m;
                i = rg2Var.q;
                if (i != 0) {
                    ca2.b(obj2);
                    value = tg2Var.n.getValue();
                    qo1 qo1Var = tg2Var.v;
                    rg2Var.m = tg2Var;
                    rg2Var.n = value;
                    rg2Var.q = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            lh.g("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        obj = rg2Var.n;
                        tg2Var2 = rg2Var.m;
                        ca2.b(obj2);
                        if (!Intrinsics.b(obj2, obj)) {
                            return Unit.a;
                        }
                        tg2Var2.x = Long.MIN_VALUE;
                        throw new CancellationException("targetState while waiting for composition");
                    }
                    Object obj3 = rg2Var.n;
                    tg2 tg2Var3 = rg2Var.m;
                    ca2.b(obj2);
                    value = obj3;
                    tg2Var = tg2Var3;
                }
                rg2Var.m = tg2Var;
                rg2Var.n = value;
                rg2Var.q = 2;
                fs fsVar = new fs(1, q41.b(rg2Var));
                fsVar.u();
                tg2Var.u = fsVar;
                tg2Var.v.b(null);
                s = fsVar.s();
                if (s != b50Var) {
                    tg2Var2 = tg2Var;
                    obj = value;
                    obj2 = s;
                    if (!Intrinsics.b(obj2, obj)) {
                    }
                }
                return b50Var;
            }
        }
        rg2Var = new rg2(tg2Var, r30Var);
        Object obj22 = rg2Var.o;
        b50Var = b50.m;
        i = rg2Var.q;
        if (i != 0) {
        }
        rg2Var.m = tg2Var;
        rg2Var.n = value;
        rg2Var.q = 2;
        fs fsVar2 = new fs(1, q41.b(rg2Var));
        fsVar2.u();
        tg2Var.u = fsVar2;
        tg2Var.v.b(null);
        s = fsVar2.s();
        if (s != b50Var) {
        }
        return b50Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object B(tg2 tg2Var, r30 r30Var) {
        sg2 sg2Var;
        int i;
        tg2 tg2Var2;
        Object obj;
        Object obj2;
        tg2 tg2Var3;
        tg2Var.getClass();
        if (r30Var instanceof sg2) {
            sg2Var = (sg2) r30Var;
            int i2 = sg2Var.q;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sg2Var.q = i2 - Integer.MIN_VALUE;
                Object obj3 = sg2Var.o;
                b50 b50Var = b50.m;
                i = sg2Var.q;
                if (i != 0) {
                    ca2.b(obj3);
                    Object value = tg2Var.n.getValue();
                    qo1 qo1Var = tg2Var.v;
                    sg2Var.m = tg2Var;
                    sg2Var.n = value;
                    sg2Var.q = 1;
                    if (qo1Var.f(sg2Var) != b50Var) {
                        tg2Var2 = tg2Var;
                        obj = value;
                    }
                    return b50Var;
                }
                if (i != 1) {
                    if (i != 2) {
                        lh.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    obj = sg2Var.n;
                    tg2Var3 = sg2Var.m;
                    ca2.b(obj3);
                    if (!Intrinsics.b(obj3, obj)) {
                        tg2Var3.x = Long.MIN_VALUE;
                        throw new CancellationException("snapTo() was canceled because state was changed to " + obj3 + " instead of " + obj);
                    }
                    return Unit.a;
                }
                obj = sg2Var.n;
                tg2Var2 = sg2Var.m;
                ca2.b(obj3);
                obj2 = tg2Var2.p;
                qo1 qo1Var2 = tg2Var2.v;
                if (!Intrinsics.b(obj, obj2)) {
                    qo1Var2.b(null);
                    return Unit.a;
                }
                sg2Var.m = tg2Var2;
                sg2Var.n = obj;
                sg2Var.q = 2;
                fs fsVar = new fs(1, q41.b(sg2Var));
                fsVar.u();
                tg2Var2.u = fsVar;
                qo1Var2.b(null);
                obj3 = fsVar.s();
                if (obj3 != b50Var) {
                    tg2Var3 = tg2Var2;
                    if (!Intrinsics.b(obj3, obj)) {
                    }
                    return Unit.a;
                }
                return b50Var;
            }
        }
        sg2Var = new sg2(tg2Var, r30Var);
        Object obj32 = sg2Var.o;
        b50 b50Var2 = b50.m;
        i = sg2Var.q;
        if (i != 0) {
        }
        obj2 = tg2Var2.p;
        qo1 qo1Var22 = tg2Var2.v;
        if (!Intrinsics.b(obj, obj2)) {
        }
    }

    public static final void x(tg2 tg2Var) {
        hz1 hz1Var = tg2Var.t;
        fz2 fz2Var = tg2Var.q;
        if (fz2Var == null) {
            return;
        }
        kg2 kg2Var = tg2Var.z;
        if (kg2Var == null) {
            if (tg2Var.r <= 0 || hz1Var.h() == 1.0f || Intrinsics.b(tg2Var.o.getValue(), tg2Var.n.getValue())) {
                kg2Var = null;
            } else {
                kg2Var = new kg2();
                kg2Var.d = hz1Var.h();
                long j = tg2Var.r;
                kg2Var.g = j;
                kg2Var.h = si1.c((1.0d - hz1Var.h()) * j);
                kg2Var.e.e(0, hz1Var.h());
            }
        }
        if (kg2Var != null) {
            kg2Var.g = tg2Var.r;
            tg2Var.y.a(kg2Var);
            fz2Var.n(kg2Var);
        }
        tg2Var.z = null;
    }

    public static final void y(tg2 tg2Var, kg2 kg2Var, long j) {
        long j2 = kg2Var.a + j;
        kg2Var.a = j2;
        long j3 = kg2Var.h;
        if (j2 >= j3) {
            kg2Var.d = 1.0f;
            return;
        }
        e43 e43Var = kg2Var.b;
        od odVar = kg2Var.e;
        if (e43Var != null) {
            od odVar2 = kg2Var.f;
            if (odVar2 == null) {
                odVar2 = D;
            }
            kg2Var.d = d.b(((od) e43Var.n(j2, odVar, E, odVar2)).a(0), 0.0f, 1.0f);
            return;
        }
        float a = odVar.a(0);
        float f = j2 / j3;
        k03 k03Var = v33.a;
        kg2Var.d = (1.0f * f) + ((1.0f - f) * a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0078, code lost:
    
        if (defpackage.iv1.F(r0.getContext()).B(r10, r0) == r1) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object z(tg2 tg2Var, r30 r30Var) {
        og2 og2Var;
        b50 b50Var;
        int i;
        tg2Var.getClass();
        if (r30Var instanceof og2) {
            og2Var = (og2) r30Var;
            int i2 = og2Var.p;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                og2Var.p = i2 - Integer.MIN_VALUE;
                Object obj = og2Var.n;
                b50Var = b50.m;
                i = og2Var.p;
                if (i != 0) {
                    ca2.b(obj);
                    if (tg2Var.y.g() && tg2Var.z == null) {
                        return Unit.a;
                    }
                    if (nk2.k(og2Var.getContext()) == 0.0f) {
                        tg2Var.D();
                        tg2Var.x = Long.MIN_VALUE;
                        return Unit.a;
                    }
                    if (tg2Var.x == Long.MIN_VALUE) {
                        lg2 lg2Var = tg2Var.A;
                        og2Var.m = tg2Var;
                        og2Var.p = 1;
                    }
                } else {
                    if (i != 1 && i != 2) {
                        lh.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    tg2Var = og2Var.m;
                    ca2.b(obj);
                }
                do {
                    if (tg2Var.y.h() && tg2Var.z == null) {
                        tg2Var.x = Long.MIN_VALUE;
                        return Unit.a;
                    }
                    og2Var.m = tg2Var;
                    og2Var.p = 2;
                } while (tg2Var.C(og2Var) != b50Var);
                return b50Var;
            }
        }
        og2Var = new og2(tg2Var, r30Var);
        Object obj2 = og2Var.n;
        b50Var = b50.m;
        i = og2Var.p;
        if (i != 0) {
        }
        do {
            if (tg2Var.y.h()) {
            }
            og2Var.m = tg2Var;
            og2Var.p = 2;
        } while (tg2Var.C(og2Var) != b50Var);
        return b50Var;
    }

    public final Object C(r30 r30Var) {
        float k = nk2.k(r30Var.getContext());
        if (k <= 0.0f) {
            D();
            return Unit.a;
        }
        this.B = k;
        Object B = iv1.F(r30Var.getContext()).B(this.C, r30Var);
        return B == b50.m ? B : Unit.a;
    }

    public final void D() {
        fz2 fz2Var = this.q;
        if (fz2Var != null) {
            fz2Var.c();
        }
        this.y.c();
        if (this.z != null) {
            this.z = null;
            G(1.0f);
            F();
        }
    }

    public final Object E(float f, Object obj, pr2 pr2Var) {
        if (0.0f > f || f > 1.0f) {
            w32.a("Expecting fraction between 0 and 1. Got " + f);
        }
        fz2 fz2Var = this.q;
        if (fz2Var == null) {
            return Unit.a;
        }
        Object a = no1.a(this.w, new qg2(obj, this.n.getValue(), this, fz2Var, f, null), pr2Var);
        return a == b50.m ? a : Unit.a;
    }

    public final void F() {
        fz2 fz2Var = this.q;
        if (fz2Var == null) {
            return;
        }
        fz2Var.m(si1.c(this.t.h() * ((Number) fz2Var.l.getValue()).longValue()));
    }

    public final void G(float f) {
        this.t.i(f);
    }

    @Override // defpackage.rp3
    public final Object j() {
        return this.o.getValue();
    }

    @Override // defpackage.rp3
    public final Object k() {
        return this.n.getValue();
    }

    @Override // defpackage.rp3
    public final void m(Object obj) {
        this.o.setValue(obj);
    }

    @Override // defpackage.rp3
    public final void n(fz2 fz2Var) {
        fz2 fz2Var2 = this.q;
        if (fz2Var2 != null && fz2Var != fz2Var2) {
            w32.b("An instance of SeekableTransitionState has been used in different Transitions. Previous instance: " + this.q + ", new instance: " + fz2Var);
        }
        this.q = fz2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x008c A[Catch: all -> 0x009a, TryCatch #0 {all -> 0x009a, blocks: (B:4:0x0010, B:8:0x001a, B:11:0x0084, B:13:0x008c, B:15:0x009c, B:17:0x0091, B:20:0x002b, B:23:0x0037, B:25:0x004c, B:27:0x0058, B:29:0x0062, B:31:0x0072, B:39:0x007e, B:42:0x00a1), top: B:3:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008f  */
    @Override // defpackage.rp3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o() {
        int i;
        int i2;
        this.q = null;
        hn2 hn2Var = (hn2) jz2.a.getValue();
        synchronized (hn2Var.g) {
            try {
                eo1 eo1Var = hn2Var.f;
                int i3 = eo1Var.o;
                int i4 = 0;
                int i5 = 0;
                while (true) {
                    Object[] objArr = eo1Var.m;
                    if (i4 < i3) {
                        gn2 gn2Var = (gn2) objArr[i4];
                        hn1 hn1Var = (hn1) gn2Var.f.k(this);
                        if (hn1Var != null) {
                            Object[] objArr2 = hn1Var.b;
                            int[] iArr = hn1Var.c;
                            long[] jArr = hn1Var.a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i6 = 0;
                                while (true) {
                                    long j = jArr[i6];
                                    i = i4;
                                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i7 = 8;
                                        int i8 = 8 - ((~(i6 - length)) >>> 31);
                                        int i9 = 0;
                                        while (i9 < i8) {
                                            if ((j & 255) < 128) {
                                                int i10 = (i6 << 3) + i9;
                                                i2 = i7;
                                                Object obj = objArr2[i10];
                                                int i11 = iArr[i10];
                                                gn2Var.d(this, obj);
                                            } else {
                                                i2 = i7;
                                            }
                                            j >>= i2;
                                            i9++;
                                            i7 = i2;
                                        }
                                        if (i8 != i7) {
                                            break;
                                        }
                                    }
                                    if (i6 == length) {
                                        break;
                                    }
                                    i6++;
                                    i4 = i;
                                }
                                if (gn2Var.f.j()) {
                                    i5++;
                                } else if (i5 > 0) {
                                    Object[] objArr3 = eo1Var.m;
                                    objArr3[i - i5] = objArr3[i];
                                }
                                i4 = i + 1;
                            }
                        }
                        i = i4;
                        if (gn2Var.f.j()) {
                        }
                        i4 = i + 1;
                    } else {
                        int i12 = i3 - i5;
                        Arrays.fill(objArr, i12, i3, (Object) null);
                        eo1Var.o = i12;
                        Unit unit = Unit.a;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
