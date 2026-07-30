package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ed0 extends z92 implements Function2 {
    public final /* synthetic */ xt0 A;
    public final /* synthetic */ Function2 B;
    public final /* synthetic */ Function0 C;
    public final /* synthetic */ Function1 D;
    public Object n;
    public Object o;
    public Object p;
    public b82 q;
    public nx0 r;
    public t22 s;
    public boolean t;
    public float u;
    public int v;
    public /* synthetic */ Object w;
    public final /* synthetic */ Function0 x;
    public final /* synthetic */ b82 y;
    public final /* synthetic */ ww1 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ed0(Function0 function0, b82 b82Var, ww1 ww1Var, xt0 xt0Var, Function2 function2, Function0 function02, Function1 function1, o30 o30Var) {
        super(o30Var);
        this.x = function0;
        this.y = b82Var;
        this.z = ww1Var;
        this.A = xt0Var;
        this.B = function2;
        this.C = function02;
        this.D = function1;
    }

    @Override // defpackage.hn
    public final o30 create(Object obj, o30 o30Var) {
        ed0 ed0Var = new ed0(this.x, this.y, this.z, this.A, this.B, this.C, this.D, o30Var);
        ed0Var.w = obj;
        return ed0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ed0) create((ur2) obj, (o30) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:154:0x02e2, code lost:
    
        if (defpackage.gd0.d(r5.r.F, r3) != false) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x00df, code lost:
    
        if (r6 == r1) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x00bc, code lost:
    
        if (r4 == r1) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x030a, code lost:
    
        if (r6 != r1) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0382, code lost:
    
        if ((r12 != null ? r12 == defpackage.ww1.m ? defpackage.au1.e(r5) : defpackage.au1.d(r5) : defpackage.au1.c(r5)) == 0.0f) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x013e, code lost:
    
        if (r15 == r1) goto L124;
     */
    /* JADX WARN: Path cross not found for [B:39:0x0341, B:52:0x0366], limit reached: 171 */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0102  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:119:0x029c -> B:62:0x029d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x030a -> B:9:0x030d). Please report as a decompilation issue!!! */
    @Override // defpackage.hn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ur2 ur2Var;
        Object b;
        ur2 ur2Var2;
        t22 t22Var;
        boolean booleanValue;
        Object b2;
        t22 t22Var2;
        ww1 ww1Var;
        b82 b82Var;
        Function2 function2;
        long j;
        Object obj2;
        b82 b82Var2;
        nx0 nx0Var;
        t22 t22Var3;
        ur2 ur2Var3;
        b82 b82Var3;
        float f;
        Object obj3;
        t22 t22Var4;
        b82 b82Var4;
        float abs;
        au1 au1Var;
        long i;
        Object obj4;
        long j2;
        t22 t22Var5;
        Function2 function22;
        Object obj5;
        Object obj6;
        b50 b50Var = b50.m;
        int i2 = this.v;
        ww1 ww1Var2 = this.z;
        int i3 = 2;
        b82 b82Var5 = this.y;
        int i4 = 0;
        if (i2 == 0) {
            ca2.b(obj);
            ur2Var = (ur2) this.w;
            n22 n22Var = n22.m;
            this.w = ur2Var;
            this.v = 1;
            b = zs2.b(ur2Var, false, n22Var, this);
        } else if (i2 == 1) {
            ur2Var = (ur2) this.w;
            ca2.b(obj);
            b = obj;
        } else if (i2 == 2) {
            booleanValue = this.t;
            t22Var = (t22) this.n;
            ur2Var2 = (ur2) this.w;
            ca2.b(obj);
            b2 = obj;
            t22Var2 = (t22) b2;
            b82Var5.m = 0L;
            if (!booleanValue) {
                ww1Var = ww1Var2;
                b82Var = b82Var5;
                if (t22Var != null) {
                }
                return Unit.a;
            }
            j2 = t22Var2.a;
            int i5 = t22Var2.i;
            if (gd0.d(ur2Var2.r.F, j2)) {
            }
        } else {
            if (i2 == 3) {
                f = this.u;
                nx0 nx0Var2 = this.r;
                b82 b82Var6 = this.q;
                b82 b82Var7 = (b82) this.p;
                ur2 ur2Var4 = (ur2) this.o;
                t22 t22Var6 = (t22) this.n;
                ur2 ur2Var5 = (ur2) this.w;
                ca2.b(obj);
                nx0Var = nx0Var2;
                b82Var3 = b82Var6;
                ur2Var2 = ur2Var4;
                t22Var3 = t22Var6;
                b82Var2 = b82Var7;
                ur2Var3 = ur2Var5;
                obj2 = obj;
                m22 m22Var = (m22) obj2;
                List list = m22Var.a;
                int size = list.size();
                while (true) {
                    if (i4 >= size) {
                        b82Var = b82Var5;
                        obj3 = null;
                        break;
                    }
                    Object obj7 = list.get(i4);
                    int i6 = i4;
                    List list2 = list;
                    b82Var = b82Var5;
                    if (s22.a(((t22) obj7).a, b82Var3.m)) {
                        obj3 = obj7;
                        break;
                    }
                    i4 = i6 + 1;
                    b82Var5 = b82Var;
                    list = list2;
                }
                t22Var4 = (t22) obj3;
                if (t22Var4 != null && !t22Var4.b()) {
                    if (s93.B(t22Var4)) {
                        List list3 = m22Var.a;
                        int size2 = list3.size();
                        int i7 = 0;
                        while (true) {
                            if (i7 >= size2) {
                                obj4 = null;
                                break;
                            }
                            obj4 = list3.get(i7);
                            if (((t22) obj4).d) {
                                break;
                            }
                            i7++;
                        }
                        t22 t22Var7 = (t22) obj4;
                        if (t22Var7 != null) {
                            b82Var3.m = t22Var7.a;
                            ww1Var = ww1Var2;
                            b82Var4 = b82Var3;
                        }
                    } else {
                        nx0Var.getClass();
                        ww1 ww1Var3 = (ww1) nx0Var.n;
                        ww1Var = ww1Var2;
                        b82Var4 = b82Var3;
                        long g = au1.g(nx0Var.m, au1.f(t22Var4.c, t22Var4.g));
                        nx0Var.m = g;
                        ww1 ww1Var4 = ww1.n;
                        if (ww1Var3 != null) {
                            abs = Math.abs(ww1Var3 == ww1Var4 ? au1.d(g) : au1.e(g));
                        } else {
                            abs = au1.c(g);
                        }
                        if (abs >= f) {
                            long j3 = nx0Var.m;
                            if (ww1Var3 != null) {
                                float d = ww1Var3 == ww1Var4 ? au1.d(j3) : au1.e(j3);
                                long j4 = nx0Var.m;
                                float signum = d - (Math.signum(ww1Var3 == ww1Var4 ? au1.d(j4) : au1.e(j4)) * f);
                                long j5 = nx0Var.m;
                                float e = ww1Var3 == ww1Var4 ? au1.e(j5) : au1.d(j5);
                                i = ww1Var3 == ww1Var4 ? ap.i(signum, e) : ap.i(e, signum);
                            } else {
                                float c = au1.c(j3);
                                i = au1.f(nx0Var.m, au1.h((Float.floatToRawIntBits(Float.intBitsToFloat((int) (j3 & 4294967295L)) / c) & 4294967295L) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j3 >> 32)) / c) << 32), f));
                            }
                            au1Var = new au1(i);
                        } else {
                            au1Var = null;
                        }
                        if (au1Var == null) {
                            n22 n22Var2 = n22.o;
                            this.w = ur2Var3;
                            this.n = t22Var3;
                            this.o = ur2Var2;
                            this.p = b82Var2;
                            this.q = b82Var4;
                            this.r = nx0Var;
                            this.s = t22Var4;
                            this.u = f;
                            this.v = 4;
                            if (ur2Var2.a(n22Var2, this) != b50Var) {
                                b82Var3 = b82Var4;
                                if (!t22Var4.b()) {
                                }
                            }
                            return b50Var;
                        }
                        long j6 = au1Var.a;
                        t22Var4.a();
                        b82Var2.m = j6;
                        if (t22Var4.b()) {
                            ur2Var2 = ur2Var3;
                            t22Var2 = t22Var3;
                            t22Var = t22Var4;
                            if (t22Var != null) {
                            }
                            if (t22Var != null) {
                            }
                            return Unit.a;
                        }
                        nx0Var.m = 0L;
                    }
                    ww1Var2 = ww1Var;
                    b82Var3 = b82Var4;
                    b82Var5 = b82Var;
                    i4 = 0;
                    this.w = ur2Var3;
                    this.n = t22Var3;
                    this.o = ur2Var2;
                    this.p = b82Var2;
                    this.q = b82Var3;
                    this.r = nx0Var;
                    this.s = null;
                    this.u = f;
                    this.v = 3;
                    obj2 = ur2Var2.a(n22.n, this);
                }
                ww1Var = ww1Var2;
                ur2Var2 = ur2Var3;
                t22Var2 = t22Var3;
                t22Var = null;
                if (t22Var != null) {
                }
                if (t22Var != null) {
                }
                return Unit.a;
            }
            if (i2 != 4) {
                if (i2 != 5) {
                    lh.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b82 b82Var8 = this.q;
                ur2 ur2Var6 = (ur2) this.p;
                ww1 ww1Var5 = (ww1) this.o;
                Function2 function23 = (Function2) this.n;
                ur2 ur2Var7 = (ur2) this.w;
                ca2.b(obj);
                ww1Var = ww1Var5;
                Object a = obj;
                m22 m22Var2 = (m22) a;
                List list4 = m22Var2.a;
                int size3 = list4.size();
                int i8 = 0;
                while (true) {
                    if (i8 >= size3) {
                        function22 = function23;
                        obj5 = null;
                        break;
                    }
                    Object obj8 = list4.get(i8);
                    function22 = function23;
                    if (s22.a(((t22) obj8).a, b82Var8.m)) {
                        obj5 = obj8;
                        break;
                    }
                    i8++;
                    function23 = function22;
                }
                t22 t22Var8 = (t22) obj5;
                if (t22Var8 == null) {
                    t22Var8 = null;
                } else if (s93.B(t22Var8)) {
                    List list5 = m22Var2.a;
                    int size4 = list5.size();
                    int i9 = 0;
                    while (true) {
                        if (i9 >= size4) {
                            obj6 = null;
                            break;
                        }
                        obj6 = list5.get(i9);
                        if (((t22) obj6).d) {
                            break;
                        }
                        i9++;
                    }
                    t22 t22Var9 = (t22) obj6;
                    if (t22Var9 != null) {
                        b82Var8.m = t22Var9.a;
                        function23 = function22;
                        this.w = ur2Var7;
                        this.n = function23;
                        this.o = ww1Var;
                        this.p = ur2Var6;
                        this.q = b82Var8;
                        this.r = null;
                        this.s = null;
                        this.v = 5;
                        a = ur2Var6.a(n22.n, this);
                    }
                } else {
                    long P = s93.P(t22Var8, true);
                }
                if (t22Var8 != null && !t22Var8.b()) {
                    if (s93.B(t22Var8)) {
                        t22Var5 = t22Var8;
                        if (t22Var5 != null) {
                            this.C.invoke();
                        } else {
                            this.D.invoke(t22Var5);
                        }
                        return Unit.a;
                    }
                    function22.invoke(t22Var8, new au1(s93.P(t22Var8, false)));
                    t22Var8.a();
                    j = t22Var8.a;
                    ur2Var2 = ur2Var7;
                    function2 = function22;
                    b82 b82Var9 = new b82();
                    b82Var9.m = j;
                    ur2Var6 = ur2Var2;
                    ur2Var7 = ur2Var6;
                    function23 = function2;
                    b82Var8 = b82Var9;
                    this.w = ur2Var7;
                    this.n = function23;
                    this.o = ww1Var;
                    this.p = ur2Var6;
                    this.q = b82Var8;
                    this.r = null;
                    this.s = null;
                    this.v = 5;
                    a = ur2Var6.a(n22.n, this);
                }
                t22Var5 = null;
                if (t22Var5 != null) {
                }
                return Unit.a;
            }
            f = this.u;
            t22Var4 = this.s;
            nx0 nx0Var3 = this.r;
            b82 b82Var10 = this.q;
            b82 b82Var11 = (b82) this.p;
            ur2 ur2Var8 = (ur2) this.o;
            t22 t22Var10 = (t22) this.n;
            ur2 ur2Var9 = (ur2) this.w;
            ca2.b(obj);
            ur2Var3 = ur2Var9;
            b82Var3 = b82Var10;
            b82Var2 = b82Var11;
            t22Var3 = t22Var10;
            ww1Var = ww1Var2;
            ur2Var2 = ur2Var8;
            b82Var = b82Var5;
            nx0Var = nx0Var3;
            if (!t22Var4.b()) {
                ur2Var2 = ur2Var3;
                t22Var2 = t22Var3;
                t22Var = null;
                if (t22Var != null && !t22Var.b()) {
                    ww1Var2 = ww1Var;
                    b82Var5 = b82Var;
                    i3 = 2;
                    i4 = 0;
                    j2 = t22Var2.a;
                    int i52 = t22Var2.i;
                    if (gd0.d(ur2Var2.r.F, j2)) {
                        ww1Var = ww1Var2;
                        b82Var = b82Var5;
                        t22Var = null;
                        if (t22Var != null) {
                            ww1Var2 = ww1Var;
                            b82Var5 = b82Var;
                            i3 = 2;
                            i4 = 0;
                            j2 = t22Var2.a;
                            int i522 = t22Var2.i;
                            if (gd0.d(ur2Var2.r.F, j2)) {
                                g53 h = ur2Var2.h();
                                f = i522 == i3 ? h.d() * gd0.a : h.d();
                                b82Var3 = new b82();
                                b82Var3.m = j2;
                                nx0Var = new nx0(ww1Var2);
                                b82Var2 = b82Var5;
                                t22Var3 = t22Var2;
                                ur2Var3 = ur2Var2;
                                this.w = ur2Var3;
                                this.n = t22Var3;
                                this.o = ur2Var2;
                                this.p = b82Var2;
                                this.q = b82Var3;
                                this.r = nx0Var;
                                this.s = null;
                                this.u = f;
                                this.v = 3;
                                obj2 = ur2Var2.a(n22.n, this);
                            }
                        }
                    }
                }
                if (t22Var != null) {
                    b82 b82Var12 = b82Var;
                    this.A.a(t22Var2, t22Var, new au1(b82Var12.m));
                    au1 au1Var2 = new au1(b82Var12.m);
                    function2 = this.B;
                    function2.invoke(t22Var, au1Var2);
                    j = t22Var.a;
                }
                return Unit.a;
            }
            ww1Var2 = ww1Var;
            b82Var5 = b82Var;
            i4 = 0;
            this.w = ur2Var3;
            this.n = t22Var3;
            this.o = ur2Var2;
            this.p = b82Var2;
            this.q = b82Var3;
            this.r = nx0Var;
            this.s = null;
            this.u = f;
            this.v = 3;
            obj2 = ur2Var2.a(n22.n, this);
        }
        ur2Var2 = ur2Var;
        t22Var = (t22) b;
        booleanValue = ((Boolean) this.x.invoke()).booleanValue();
        if (!booleanValue) {
            t22Var.a();
        }
        this.w = ur2Var2;
        this.n = t22Var;
        this.t = booleanValue;
        this.v = 2;
        b2 = zs2.b(ur2Var2, (r3 & 1) != 0, n22.n, this);
    }
}
