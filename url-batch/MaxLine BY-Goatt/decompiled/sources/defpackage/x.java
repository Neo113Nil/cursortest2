package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class x extends pr2 implements Function2 {
    public boolean m;
    public int n;
    public /* synthetic */ Object o;
    public final /* synthetic */ s42 p;
    public final /* synthetic */ long q;
    public final /* synthetic */ bn1 r;
    public final /* synthetic */ nu s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(s42 s42Var, long j, bn1 bn1Var, nu nuVar, o30 o30Var) {
        super(2, o30Var);
        this.p = s42Var;
        this.q = j;
        this.r = bn1Var;
        this.s = nuVar;
    }

    @Override // defpackage.hn
    public final o30 create(Object obj, o30 o30Var) {
        x xVar = new x(this.p, this.q, this.r, this.s, o30Var);
        xVar.o = obj;
        return xVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((x) create((a50) obj, (o30) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x00b2, code lost:
    
        if (r15.b(r2, r17) != r1) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00cf, code lost:
    
        if (r15.b(r3, r17) == r1) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x006b, code lost:
    
        if (r3 == r1) goto L43;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0092  */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, java.util.concurrent.CancellationException] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v5, types: [u42] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v4, types: [g61] */
    @Override // defpackage.hn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ?? r10;
        Object b;
        ?? r2;
        boolean z;
        v42 v42Var;
        b50 b50Var = b50.m;
        int i = this.n;
        nu nuVar = this.s;
        bn1 bn1Var = this.r;
        if (i == 0) {
            ca2.b(obj);
            r10 = 0;
            jo2 H = z71.H((a50) this.o, null, new w(nuVar, this.q, this.r, null, 0), 3);
            this.o = H;
            this.n = 1;
            b = this.p.b(this);
            r2 = H;
        } else if (i == 1) {
            g61 g61Var = (g61) this.o;
            ca2.b(obj);
            r10 = 0;
            b = obj;
            r2 = g61Var;
        } else {
            if (i == 2) {
                z = this.m;
                ca2.b(obj);
                r10 = 0;
                if (z) {
                    u42 u42Var = new u42(this.q);
                    v42 v42Var2 = new v42(u42Var);
                    this.o = v42Var2;
                    this.n = 3;
                    if (bn1Var.b(u42Var, this) != b50Var) {
                        v42Var = v42Var2;
                        r10 = r10;
                        this.o = r10;
                        this.n = 4;
                    }
                    return b50Var;
                }
                nuVar.M = r10;
                return Unit.a;
            }
            if (i != 3) {
                if (i != 4 && i != 5) {
                    lh.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ca2.b(obj);
                r10 = 0;
                nuVar.M = r10;
                return Unit.a;
            }
            v42Var = (v42) this.o;
            ca2.b(obj);
            r10 = 0;
            this.o = r10;
            this.n = 4;
        }
        boolean booleanValue = ((Boolean) b).booleanValue();
        if (!r2.b()) {
            u42 u42Var2 = nuVar.M;
            if (u42Var2 != null) {
                a41 v42Var3 = booleanValue ? new v42(u42Var2) : new t42(u42Var2);
                this.o = r10;
                this.n = 5;
            }
            nuVar.M = r10;
            return Unit.a;
        }
        this.o = r10;
        this.m = booleanValue;
        this.n = 2;
        r2.f(r10);
        Object J = r2.J(this);
        if (J != b50Var) {
            J = Unit.a;
        }
        if (J != b50Var) {
            z = booleanValue;
            r10 = r10;
            if (z) {
            }
            nuVar.M = r10;
            return Unit.a;
        }
        return b50Var;
    }
}
