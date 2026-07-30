package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class g extends sf1 implements Function2 {
    public final /* synthetic */ int i;
    public int j;
    public final /* synthetic */ long k;
    public Object l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(Object obj, long j, Object obj2, dn dnVar, int i) {
        super(2, dnVar);
        this.i = i;
        this.m = obj;
        this.k = j;
        this.n = obj2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object b(Object obj, Object obj2) {
        switch (this.i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((g) h((dn) obj2, (sn) obj)).k(Unit.a);
            default:
                return ((g) h((dn) obj2, (b81) obj)).k(Unit.a);
        }
    }

    @Override // defpackage.yc
    public final dn h(dn dnVar, Object obj) {
        int i = this.i;
        Object obj2 = this.n;
        Object obj3 = this.m;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new g((jb0) obj3, this.k, (gn0) obj2, dnVar, 0);
            default:
                g gVar = new g((d81) obj3, this.k, (w11) obj2, dnVar, 1);
                gVar.l = obj;
                return gVar;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00e0, code lost:
    
        if (r1.a(r2, r16) == r0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d5, code lost:
    
        if (r1.a(r4, r16) == r0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c0, code lost:
    
        if (((defpackage.jb0) r7).x(r16) == r0) goto L40;
     */
    @Override // defpackage.yc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(Object obj) {
        az0 az0Var;
        int i = this.i;
        Object obj2 = this.n;
        long j = this.k;
        Object obj3 = this.m;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                gn0 gn0Var = (gn0) obj2;
                tn tnVar = tn.d;
                int i2 = this.j;
                if (i2 == 0) {
                    ca0.v(obj);
                    this.j = 1;
                    break;
                } else if (i2 == 1) {
                    ca0.v(obj);
                } else if (i2 == 2) {
                    az0Var = (az0) this.l;
                    ca0.v(obj);
                    this.l = null;
                    this.j = 3;
                    break;
                } else if (i2 != 3) {
                    dd0.j("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ca0.v(obj);
                    break;
                }
                zy0 zy0Var = new zy0(j);
                az0Var = new az0(zy0Var);
                this.l = az0Var;
                this.j = 2;
                break;
            default:
                d81 d81Var = (d81) obj3;
                Object obj4 = tn.d;
                int i3 = this.j;
                if (i3 == 0) {
                    ca0.v(obj);
                    b81 b81Var = (b81) this.l;
                    float g = d81Var.g(j);
                    h40 h40Var = new h40((w11) obj2, d81Var, b81Var);
                    this.j = 1;
                    oc1 a0 = p4.a0(7, null);
                    c51 c51Var = p4.o;
                    Float f = new Float(0.0f);
                    Float f2 = new Float(g);
                    Float f3 = new Float(0.0f);
                    Function1 function1 = (Function1) c51Var.e;
                    v7 v7Var = (v7) function1.invoke(f3);
                    if (v7Var == null) {
                        v7Var = ((v7) function1.invoke(f)).c();
                    }
                    v7 v7Var2 = v7Var;
                    Object f4 = ka0.f(new q7(c51Var, f, v7Var2, 56), new lg1(a0, c51Var, f, f2, v7Var2), Long.MIN_VALUE, new l(23, h40Var), this);
                    if (f4 != obj4) {
                        f4 = Unit.a;
                    }
                    if (f4 != obj4) {
                        f4 = Unit.a;
                    }
                    if (f4 == obj4) {
                        break;
                    }
                } else if (i3 != 1) {
                    dd0.j("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ca0.v(obj);
                }
                break;
        }
        return Unit.a;
    }
}
