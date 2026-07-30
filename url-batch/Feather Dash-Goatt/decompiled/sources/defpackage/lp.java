package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class lp extends sf1 implements Function2 {
    public x11 i;
    public int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ x11 l;
    public final /* synthetic */ mp m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ boolean o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lp(x11 x11Var, mp mpVar, Object obj, boolean z, dn dnVar) {
        super(2, dnVar);
        this.l = x11Var;
        this.m = mpVar;
        this.n = obj;
        this.o = z;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object b(Object obj, Object obj2) {
        return ((lp) h((dn) obj2, (py) obj)).k(Unit.a);
    }

    @Override // defpackage.yc
    public final dn h(dn dnVar, Object obj) {
        lp lpVar = new lp(this.l, this.m, this.n, this.o, dnVar);
        lpVar.k = obj;
        return lpVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0060, code lost:
    
        if (r7.b(r3, r8) == r0) goto L16;
     */
    @Override // defpackage.yc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(Object obj) {
        py pyVar;
        x11 x11Var;
        tn tnVar = tn.d;
        int i = this.j;
        Object obj2 = this.n;
        mp mpVar = this.m;
        x11 x11Var2 = this.l;
        if (i == 0) {
            ca0.v(obj);
            py pyVar2 = (py) this.k;
            ua1 g = mpVar.g();
            this.k = pyVar2;
            this.i = x11Var2;
            this.j = 1;
            Integer num = new Integer(((AtomicInteger) g.b.e).incrementAndGet());
            if (num != tnVar) {
                pyVar = pyVar2;
                obj = num;
                x11Var = x11Var2;
            }
            return tnVar;
        }
        if (i != 1) {
            if (i != 2) {
                dd0.j("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ca0.v(obj);
            if (this.o) {
                mpVar.l.B(new ko(obj2 != null ? obj2.hashCode() : 0, x11Var2.d, obj2));
            }
            return Unit.a;
        }
        x11Var = this.i;
        pyVar = (py) this.k;
        ca0.v(obj);
        x11Var.d = ((Number) obj).intValue();
        this.k = null;
        this.i = null;
        this.j = 2;
    }
}
