package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class a7 extends sf1 implements Function2 {
    public int i;
    public final /* synthetic */ boolean j;
    public final /* synthetic */ c7 k;
    public final /* synthetic */ long l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a7(boolean z, c7 c7Var, long j, dn dnVar) {
        super(2, dnVar);
        this.j = z;
        this.k = c7Var;
        this.l = j;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object b(Object obj, Object obj2) {
        return ((a7) h((dn) obj2, (sn) obj)).k(Unit.a);
    }

    @Override // defpackage.yc
    public final dn h(dn dnVar, Object obj) {
        return new a7(this.j, this.k, this.l, dnVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0031, code lost:
    
        if (r11 == r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0045, code lost:
    
        if (r11 == r0) goto L18;
     */
    @Override // defpackage.yc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(Object obj) {
        tn tnVar = tn.d;
        int i = this.i;
        if (i == 0) {
            ca0.v(obj);
            wo0 wo0Var = this.k.d;
            if (this.j) {
                this.i = 2;
                obj = wo0Var.a(this.l, 0L, this);
            } else {
                this.i = 1;
                obj = wo0Var.a(0L, this.l, this);
            }
            return tnVar;
        }
        if (i == 1) {
            ca0.v(obj);
            ((xm1) obj).getClass();
        } else {
            if (i != 2) {
                dd0.j("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ca0.v(obj);
            ((xm1) obj).getClass();
        }
        return Unit.a;
    }
}
