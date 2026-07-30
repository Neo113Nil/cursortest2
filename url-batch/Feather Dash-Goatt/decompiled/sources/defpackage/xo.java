package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class xo extends sf1 implements Function2 {
    public final /* synthetic */ int i;
    public int j;
    public final /* synthetic */ mp k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xo(mp mpVar, dn dnVar, int i) {
        super(2, dnVar);
        this.i = i;
        this.k = mpVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object b(Object obj, Object obj2) {
        switch (this.i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((xo) h((dn) obj2, (d00) obj)).k(Unit.a);
            case 1:
                return ((xo) h((dn) obj2, (sn) obj)).k(Unit.a);
            default:
                return ((xo) h((dn) obj2, (sn) obj)).k(Unit.a);
        }
    }

    @Override // defpackage.yc
    public final dn h(dn dnVar, Object obj) {
        int i = this.i;
        mp mpVar = this.k;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new xo(mpVar, dnVar, 0);
            case 1:
                return new xo(mpVar, dnVar, 1);
            default:
                return new xo(mpVar, dnVar, 2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0047, code lost:
    
        if (r10 == r7) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x003d, code lost:
    
        if (r5.h(r9) == r7) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0097, code lost:
    
        if (r10.f(r1, r9) == r0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x007f, code lost:
    
        if (r10 == r0) goto L41;
     */
    @Override // defpackage.yc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(Object obj) {
        int i = this.i;
        mp mpVar = this.k;
        int i2 = 1;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                tn tnVar = tn.d;
                int i3 = this.j;
                if (i3 == 0) {
                    ca0.v(obj);
                    this.j = 1;
                    if (mp.d(mpVar, this) == tnVar) {
                        return tnVar;
                    }
                } else {
                    if (i3 != 1) {
                        dd0.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ca0.v(obj);
                }
                return Unit.a;
            case 1:
                tn tnVar2 = tn.d;
                int i4 = this.j;
                if (i4 == 0) {
                    ca0.v(obj);
                    o91 o91Var = mpVar.m;
                    this.j = 1;
                    Object D = ((ej) o91Var.e).D(this);
                    if (D != tnVar2) {
                        D = Unit.a;
                        break;
                    }
                } else {
                    if (i4 != 1) {
                        if (i4 == 2) {
                            ca0.v(obj);
                            return Unit.a;
                        }
                        dd0.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ca0.v(obj);
                }
                c00 q = p4.q(mpVar.g().c, -1);
                x8 x8Var = new x8(i2, mpVar);
                this.j = 2;
                break;
            default:
                s40 s40Var = mpVar.l;
                tn tnVar3 = tn.d;
                int i5 = this.j;
                try {
                    if (i5 == 0) {
                        ca0.v(obj);
                        if (!(s40Var.q() instanceof zy)) {
                            this.j = 1;
                            break;
                        } else {
                            return s40Var.q();
                        }
                    } else {
                        if (i5 != 1) {
                            if (i5 == 2) {
                                ca0.v(obj);
                                return (xd1) obj;
                            }
                            dd0.j("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ca0.v(obj);
                    }
                    this.j = 2;
                    obj = mp.e(mpVar, false, this);
                    break;
                } catch (Throwable th) {
                    return new d11(th, -1);
                }
        }
    }
}
