package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class b30 extends h31 implements Function2 {
    public final /* synthetic */ int g = 1;
    public Object h;
    public int i;
    public /* synthetic */ Object j;
    public final /* synthetic */ z30 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b30(CoroutineContext coroutineContext, Function2 function2, dn dnVar) {
        super(dnVar);
        this.j = coroutineContext;
        this.k = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object b(Object obj, Object obj2) {
        switch (this.g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((b30) h((dn) obj2, (vf1) obj)).k(Unit.a);
            default:
                return ((b30) h((dn) obj2, (g91) obj)).k(Unit.a);
        }
    }

    @Override // defpackage.yc
    public final dn h(dn dnVar, Object obj) {
        int i = this.g;
        z30 z30Var = this.k;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                b30 b30Var = new b30((CoroutineContext) this.j, (Function2) z30Var, dnVar);
                b30Var.h = obj;
                return b30Var;
            default:
                b30 b30Var2 = new b30((i6) z30Var, dnVar);
                b30Var2.j = obj;
                return b30Var2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x009c, code lost:
    
        if (r11 != r5) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b3, code lost:
    
        if (r11 == r5) goto L48;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0083 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b7  */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, vf1] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x003f -> B:7:0x0040). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x009c -> B:24:0x006a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x00b3 -> B:24:0x006a). Please report as a decompilation issue!!! */
    @Override // defpackage.yc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(Object obj) {
        vf1 vf1Var;
        vf1 vf1Var2;
        g91 g91Var;
        Object invoke;
        int i = this.g;
        z30 z30Var = this.k;
        vf1 vf1Var3 = "call to 'resume' before 'invoke' with coroutine";
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                CoroutineContext coroutineContext = (CoroutineContext) this.j;
                tn tnVar = tn.d;
                int i2 = this.i;
                try {
                } catch (CancellationException e) {
                    e = e;
                    if (!t80.B(coroutineContext)) {
                    }
                }
                if (i2 == 0) {
                    ca0.v(obj);
                    vf1Var = (vf1) this.h;
                    if (t80.B(coroutineContext)) {
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            vf1 vf1Var4 = (vf1) this.h;
                            ca0.v(obj);
                            vf1Var2 = vf1Var4;
                        } else {
                            if (i2 != 3) {
                                dd0.j("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            vf1 vf1Var5 = (vf1) this.h;
                            ca0.v(obj);
                            vf1Var2 = vf1Var5;
                        }
                        vf1Var = vf1Var2;
                        if (t80.B(coroutineContext)) {
                            return Unit.a;
                        }
                        try {
                        } catch (CancellationException e2) {
                            vf1Var3 = vf1Var;
                            e = e2;
                            if (!t80.B(coroutineContext)) {
                                this.h = vf1Var3;
                                this.i = 3;
                                Object m = m90.m(vf1Var3, nx0.g, this);
                                vf1Var2 = vf1Var3;
                                break;
                            } else {
                                throw e;
                            }
                        }
                        this.h = vf1Var;
                        this.i = 1;
                        if (((Function2) z30Var).b(vf1Var, this) != tnVar) {
                            vf1Var3 = vf1Var;
                            this.h = vf1Var3;
                            this.i = 2;
                            Object m2 = m90.m(vf1Var3, nx0.g, this);
                            vf1Var2 = vf1Var3;
                            break;
                        }
                        return tnVar;
                    }
                    vf1 vf1Var6 = (vf1) this.h;
                    ca0.v(obj);
                    vf1Var3 = vf1Var6;
                    this.h = vf1Var3;
                    this.i = 2;
                    Object m22 = m90.m(vf1Var3, nx0.g, this);
                    vf1Var2 = vf1Var3;
                }
            default:
                tn tnVar2 = tn.d;
                int i3 = this.i;
                if (i3 == 0) {
                    ca0.v(obj);
                    g91Var = (g91) this.j;
                    invoke = ((i6) z30Var).invoke();
                    if (invoke != null) {
                    }
                } else {
                    if (i3 != 1) {
                        dd0.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Object obj2 = this.h;
                    g91Var = (g91) this.j;
                    ca0.v(obj);
                    if (obj2 == null) {
                        return Unit.a;
                    }
                    invoke = ((i6) z30Var).invoke();
                    if (invoke != null) {
                        this.j = g91Var;
                        this.h = invoke;
                        this.i = 1;
                        g91Var.a(invoke, this);
                        tn tnVar3 = tn.d;
                        return tnVar2;
                    }
                    obj2 = null;
                    if (obj2 == null) {
                    }
                    invoke = ((i6) z30Var).invoke();
                    if (invoke != null) {
                    }
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b30(i6 i6Var, dn dnVar) {
        super(dnVar);
        this.k = i6Var;
    }
}
