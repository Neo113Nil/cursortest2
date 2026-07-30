package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class jp extends sf1 implements Function1 {
    public final /* synthetic */ int i = 1;
    public int j;
    public final /* synthetic */ mp k;
    public Object l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jp(z11 z11Var, mp mpVar, x11 x11Var, dn dnVar) {
        super(1, dnVar);
        this.m = z11Var;
        this.k = mpVar;
        this.n = x11Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.i;
        Object obj2 = this.n;
        Object obj3 = this.m;
        mp mpVar = this.k;
        dn dnVar = (dn) obj;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new jp((z11) obj3, mpVar, (x11) obj2, dnVar).k(Unit.a);
            default:
                return new jp(mpVar, (CoroutineContext) obj3, (Function2) obj2, dnVar).k(Unit.a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0078, code lost:
    
        if (r7.j(r12, true, r11) == r0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x003d, code lost:
    
        if (r12 == r0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00eb, code lost:
    
        if (r12 != r0) goto L61;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0063  */
    @Override // defpackage.yc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(Object obj) {
        z11 z11Var;
        x11 x11Var;
        ko koVar;
        Object obj2;
        int i = this.i;
        Object obj3 = this.n;
        Object obj4 = this.m;
        mp mpVar = this.k;
        dn dnVar = null;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                x11 x11Var2 = (x11) obj3;
                z11 z11Var2 = (z11) obj4;
                tn tnVar = tn.d;
                int i2 = this.j;
                try {
                } catch (xn unused) {
                    Object obj5 = z11Var2.d;
                    this.l = x11Var2;
                    this.j = 3;
                    obj = mpVar.j(obj5, true, this);
                    break;
                }
                if (i2 == 0) {
                    ca0.v(obj);
                    this.l = z11Var2;
                    this.j = 1;
                    obj = mpVar.i(this);
                    if (obj == tnVar) {
                        return tnVar;
                    }
                    z11Var = z11Var2;
                } else {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            x11Var = (x11) ((Serializable) this.l);
                            ca0.v(obj);
                            x11Var.d = ((Number) obj).intValue();
                            return Unit.a;
                        }
                        if (i2 != 3) {
                            dd0.j("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        x11Var2 = (x11) ((Serializable) this.l);
                        ca0.v(obj);
                        x11Var2.d = ((Number) obj).intValue();
                        return Unit.a;
                    }
                    z11Var = (z11) ((Serializable) this.l);
                    ca0.v(obj);
                }
                z11Var.d = obj;
                ua1 g = mpVar.g();
                this.l = x11Var2;
                this.j = 2;
                obj = g.a();
                if (obj == tnVar) {
                    return tnVar;
                }
                x11Var = x11Var2;
                x11Var.d = ((Number) obj).intValue();
                return Unit.a;
            default:
                tn tnVar2 = tn.d;
                int i3 = this.j;
                if (i3 == 0) {
                    ca0.v(obj);
                    this.j = 1;
                    obj = mp.f(mpVar, true, this);
                    break;
                } else {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            if (i3 != 3) {
                                dd0.j("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            Object obj6 = this.l;
                            ca0.v(obj);
                            return obj6;
                        }
                        koVar = (ko) this.l;
                        ca0.v(obj);
                        obj2 = koVar.b;
                        if ((obj2 == null ? obj2.hashCode() : 0) == koVar.c) {
                            dd0.j("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
                            return null;
                        }
                        if (!Intrinsics.a(koVar.b, obj)) {
                            this.l = obj;
                            this.j = 3;
                            break;
                        }
                        return obj;
                    }
                    ca0.v(obj);
                }
                ko koVar2 = (ko) obj;
                d dVar = new d((Function2) obj3, koVar2, dnVar, 7);
                this.l = koVar2;
                this.j = 2;
                Object V = uq1.V((CoroutineContext) obj4, dVar, this);
                if (V != tnVar2) {
                    koVar = koVar2;
                    obj = V;
                    obj2 = koVar.b;
                    if ((obj2 == null ? obj2.hashCode() : 0) == koVar.c) {
                    }
                }
                return tnVar2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jp(mp mpVar, CoroutineContext coroutineContext, Function2 function2, dn dnVar) {
        super(1, dnVar);
        this.k = mpVar;
        this.m = coroutineContext;
        this.n = function2;
    }
}
