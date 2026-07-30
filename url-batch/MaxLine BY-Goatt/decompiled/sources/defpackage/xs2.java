package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class xs2 extends z92 implements Function2 {
    public Object n;
    public Object o;
    public c82 p;
    public long q;
    public int r;
    public /* synthetic */ Object s;
    public final /* synthetic */ a50 t;
    public final /* synthetic */ xt0 u;
    public final /* synthetic */ y30 v;
    public final /* synthetic */ s42 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xs2(a50 a50Var, xt0 xt0Var, y30 y30Var, s42 s42Var, o30 o30Var) {
        super(o30Var);
        this.t = a50Var;
        this.u = xt0Var;
        this.v = y30Var;
        this.w = s42Var;
    }

    @Override // defpackage.hn
    public final o30 create(Object obj, o30 o30Var) {
        xs2 xs2Var = new xs2(this.t, this.u, this.v, this.w, o30Var);
        xs2Var.s = obj;
        return xs2Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((xs2) create((ur2) obj, (o30) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x00c0, code lost:
    
        if (defpackage.zs2.a(r2, r22) == r9) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x009b, code lost:
    
        if (r15.i(r1, r1, r22) == r9) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01a7, code lost:
    
        if (defpackage.zs2.a(r6, r22) != r9) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x011a, code lost:
    
        if (r4 == r9) goto L57;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0173 A[Catch: o22 -> 0x017d, TryCatch #1 {o22 -> 0x017d, blocks: (B:47:0x016d, B:49:0x0173, B:52:0x0181), top: B:46:0x016d }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0181 A[Catch: o22 -> 0x017d, TRY_LEAVE, TryCatch #1 {o22 -> 0x017d, blocks: (B:47:0x016d, B:49:0x0173, B:52:0x0181), top: B:46:0x016d }] */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v16, types: [kotlin.coroutines.CoroutineContext, o30] */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r15v18 */
    /* JADX WARN: Type inference failed for: r15v19 */
    /* JADX WARN: Type inference failed for: r15v20 */
    /* JADX WARN: Type inference failed for: r15v21 */
    /* JADX WARN: Type inference failed for: r15v4, types: [c82, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v5, types: [kotlin.coroutines.CoroutineContext, o30] */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v8, types: [kotlin.coroutines.CoroutineContext, o30] */
    /* JADX WARN: Type inference failed for: r15v9 */
    @Override // defpackage.hn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ur2 ur2Var;
        int i;
        Object b;
        ur2 ur2Var2;
        o30 o30Var;
        t22 t22Var;
        c82 c82Var;
        long j;
        c82 c82Var2;
        long j2;
        Object i2;
        ur2 ur2Var3;
        c82 c82Var3;
        ?? r15;
        int i3;
        ?? r152;
        Object obj2;
        Object obj3;
        ?? r153;
        s42 s42Var;
        t22 t22Var2;
        c82 c82Var4;
        ur2 ur2Var4;
        c82 c82Var5;
        ur2 ur2Var5;
        ?? r154;
        y30 y30Var = this.v;
        gv2 gv2Var = y30Var.n;
        b50 b50Var = b50.m;
        int i4 = this.r;
        a50 a50Var = this.t;
        xt0 xt0Var = this.u;
        s42 s42Var2 = this.w;
        switch (i4) {
            case 0:
                ca2.b(obj);
                ur2Var = (ur2) this.s;
                this.s = ur2Var;
                this.r = 1;
                i = 3;
                b = zs2.b(ur2Var, (r3 & 1) != 0, n22.n, this);
                break;
            case 1:
                ur2Var = (ur2) this.s;
                ca2.b(obj);
                b = obj;
                i = 3;
                ur2Var2 = ur2Var;
                t22 t22Var3 = (t22) b;
                t22Var3.a();
                z71.H(a50Var, null, new ss2(s42Var2, null, 1), i);
                if (xt0Var != zs2.a) {
                    ts2 ts2Var = new ts2(xt0Var, s42Var2, t22Var3, null, 1);
                    t22Var = t22Var3;
                    o30Var = null;
                    z71.H(a50Var, null, ts2Var, i);
                } else {
                    o30Var = null;
                    t22Var = t22Var3;
                }
                c82Var = new c82();
                j = 4611686018427387903L;
                try {
                    ws2 ws2Var = new ws2(o30Var);
                    this.s = ur2Var2;
                    this.n = t22Var;
                    this.o = c82Var;
                    this.p = c82Var;
                    this.q = 4611686018427387903L;
                    this.r = 2;
                    i2 = ur2Var2.i(4611686018427387903L, ws2Var, this);
                } catch (o22 unused) {
                    c82Var2 = c82Var;
                    j2 = 4611686018427387903L;
                    r15 = o30Var;
                    this.s = ur2Var2;
                    this.n = c82Var2;
                    this.o = r15;
                    this.p = r15;
                    this.q = j2;
                    i3 = 3;
                    this.r = 3;
                    r153 = r15;
                    break;
                }
                if (i2 != b50Var) {
                    ur2Var3 = ur2Var2;
                    c82Var3 = c82Var;
                    r152 = o30Var;
                    try {
                        c82Var.m = i2;
                        obj2 = c82Var3.m;
                        if (obj2 != null) {
                            z71.H(a50Var, r152, new us2(s42Var2, r152, 3), 3);
                        } else {
                            ((t22) obj2).a();
                            z71.H(a50Var, r152, new us2(s42Var2, r152, 4), 3);
                        }
                    } catch (o22 unused2) {
                        j2 = j;
                        c82Var2 = c82Var3;
                        ur2Var2 = ur2Var3;
                        r15 = r152;
                        this.s = ur2Var2;
                        this.n = c82Var2;
                        this.o = r15;
                        this.p = r15;
                        this.q = j2;
                        i3 = 3;
                        this.r = 3;
                        r153 = r15;
                    }
                    obj3 = c82Var3.m;
                    if (obj3 != null) {
                        gv2Var.o();
                        Unit unit = Unit.a;
                    }
                    return Unit.a;
                }
                return b50Var;
            case 2:
                j = this.q;
                c82Var = this.p;
                c82 c82Var6 = (c82) this.o;
                ur2Var2 = (ur2) this.s;
                try {
                    ca2.b(obj);
                    ur2Var3 = ur2Var2;
                    r152 = 0;
                    c82Var3 = c82Var6;
                    i2 = obj;
                    c82Var.m = i2;
                    obj2 = c82Var3.m;
                    if (obj2 != null) {
                    }
                } catch (o22 unused3) {
                    j2 = j;
                    c82Var2 = c82Var6;
                    r15 = 0;
                    this.s = ur2Var2;
                    this.n = c82Var2;
                    this.o = r15;
                    this.p = r15;
                    this.q = j2;
                    i3 = 3;
                    this.r = 3;
                    r153 = r15;
                    break;
                }
                obj3 = c82Var3.m;
                if (obj3 != null) {
                }
                return Unit.a;
            case 3:
                c82Var2 = (c82) this.n;
                ca2.b(obj);
                i3 = 3;
                r153 = 0;
                z71.H(a50Var, r153, new us2(s42Var2, r153, 5), i3);
                c82Var3 = c82Var2;
                obj3 = c82Var3.m;
                if (obj3 != null) {
                }
                return Unit.a;
            case 4:
                long j3 = this.q;
                c82 c82Var7 = (c82) this.n;
                ur2 ur2Var6 = (ur2) this.s;
                ca2.b(obj);
                t22 t22Var4 = (t22) obj;
                if (t22Var4 == null) {
                    long j4 = ((t22) c82Var7.m).c;
                    gv2Var.o();
                    Unit unit2 = Unit.a;
                } else {
                    z71.H(a50Var, null, new ss2(s42Var2, null, 2), 3);
                    if (xt0Var != zs2.a) {
                        s42Var = s42Var2;
                        t22Var2 = t22Var4;
                        z71.H(a50Var, null, new ts2(xt0Var, s42Var, t22Var4, null, 2), 3);
                    } else {
                        s42Var = s42Var2;
                        t22Var2 = t22Var4;
                    }
                    try {
                        c82Var4 = c82Var7;
                        ur2Var4 = ur2Var6;
                        s42Var2 = s42Var;
                        try {
                            vs2 vs2Var = new vs2(this.t, y30Var, c82Var4, s42Var2, null, 1);
                            this.s = ur2Var4;
                            this.n = c82Var4;
                            this.o = t22Var2;
                            this.r = 5;
                            break;
                        } catch (o22 unused4) {
                            c82Var5 = c82Var4;
                            ur2Var5 = ur2Var4;
                            long j5 = ((t22) c82Var5.m).c;
                            gv2Var.o();
                            Unit unit3 = Unit.a;
                            r154 = 0;
                            this.s = null;
                            this.n = null;
                            this.o = null;
                            this.r = 6;
                            break;
                        }
                    } catch (o22 unused5) {
                        c82Var4 = c82Var7;
                        ur2Var4 = ur2Var6;
                        s42Var2 = s42Var;
                    }
                }
                return Unit.a;
            case 5:
                c82Var5 = (c82) this.n;
                ur2Var5 = (ur2) this.s;
                try {
                    ca2.b(obj);
                } catch (o22 unused6) {
                    long j52 = ((t22) c82Var5.m).c;
                    gv2Var.o();
                    Unit unit32 = Unit.a;
                    r154 = 0;
                    this.s = null;
                    this.n = null;
                    this.o = null;
                    this.r = 6;
                    break;
                }
                return Unit.a;
            case 6:
                ca2.b(obj);
                r154 = 0;
                z71.H(a50Var, r154, new us2(s42Var2, r154, 2), 3);
                return Unit.a;
            default:
                lh.g("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
