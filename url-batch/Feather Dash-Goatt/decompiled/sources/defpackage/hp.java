package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class hp extends sf1 implements Function2 {
    public final /* synthetic */ int i;
    public int j;
    public /* synthetic */ boolean k;
    public final /* synthetic */ mp l;
    public final /* synthetic */ int m;
    public Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hp(mp mpVar, int i, dn dnVar, int i2) {
        super(2, dnVar);
        this.i = i2;
        this.l = mpVar;
        this.m = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object b(Object obj, Object obj2) {
        int i = this.i;
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        dn dnVar = (dn) obj2;
        switch (i) {
        }
        return ((hp) h(dnVar, bool)).k(Unit.a);
    }

    @Override // defpackage.yc
    public final dn h(dn dnVar, Object obj) {
        int i = this.i;
        int i2 = this.m;
        mp mpVar = this.l;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                hp hpVar = new hp(mpVar, i2, dnVar, 0);
                hpVar.k = ((Boolean) obj).booleanValue();
                return hpVar;
            default:
                hp hpVar2 = new hp(mpVar, i2, dnVar, 1);
                hpVar2.k = ((Boolean) obj).booleanValue();
                return hpVar2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0035, code lost:
    
        if (r10 == r0) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005d  */
    @Override // defpackage.yc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(Object obj) {
        Throwable th;
        boolean z;
        xd1 xd1Var;
        boolean z2;
        Object obj2;
        int i = this.i;
        int i2 = this.m;
        boolean z3 = false;
        mp mpVar = this.l;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                tn tnVar = tn.d;
                int i3 = this.j;
                try {
                } catch (Throwable th2) {
                    th = th2;
                    if (z3) {
                        ua1 g = mpVar.g();
                        this.n = th;
                        this.k = z3;
                        this.j = 2;
                        Integer a = g.a();
                        if (a != tnVar) {
                            obj = a;
                            th = th;
                            z = z3;
                        }
                    }
                }
                if (i3 == 0) {
                    ca0.v(obj);
                    z3 = this.k;
                    this.k = z3;
                    this.j = 1;
                    obj = mp.f(mpVar, z3, this);
                    if (obj == tnVar) {
                        return tnVar;
                    }
                } else {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            dd0.j("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z = this.k;
                        th = (Throwable) this.n;
                        ca0.v(obj);
                        i2 = ((Number) obj).intValue();
                        th = th;
                        z3 = z;
                        xd1Var = new d11(th, i2);
                        return new Pair(xd1Var, Boolean.valueOf(z3));
                    }
                    z3 = this.k;
                    ca0.v(obj);
                }
                xd1Var = (xd1) obj;
                return new Pair(xd1Var, Boolean.valueOf(z3));
            default:
                tn tnVar2 = tn.d;
                int i4 = this.j;
                if (i4 == 0) {
                    ca0.v(obj);
                    z2 = this.k;
                    this.k = z2;
                    this.j = 1;
                    obj = mpVar.i(this);
                    break;
                } else {
                    if (i4 != 1) {
                        if (i4 != 2) {
                            dd0.j("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        obj2 = this.n;
                        ca0.v(obj);
                        i2 = ((Number) obj).intValue();
                        obj = obj2;
                        return new ko(obj == null ? obj.hashCode() : 0, i2, obj);
                    }
                    z2 = this.k;
                    ca0.v(obj);
                }
                if (z2) {
                    ua1 g2 = mpVar.g();
                    this.n = obj;
                    this.j = 2;
                    Integer a2 = g2.a();
                    if (a2 != tnVar2) {
                        Object obj3 = obj;
                        obj = a2;
                        obj2 = obj3;
                        i2 = ((Number) obj).intValue();
                        obj = obj2;
                    }
                    return tnVar2;
                }
                return new ko(obj == null ? obj.hashCode() : 0, i2, obj);
        }
    }
}
