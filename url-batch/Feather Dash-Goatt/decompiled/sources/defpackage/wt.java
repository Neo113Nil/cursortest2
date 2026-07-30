package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class wt extends sf1 implements Function2 {
    public final /* synthetic */ int i = 1;
    public z11 j;
    public z11 k;
    public int l;
    public /* synthetic */ Object m;
    public final /* synthetic */ v71 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wt(z11 z11Var, v71 v71Var, dn dnVar) {
        super(2, dnVar);
        this.k = z11Var;
        this.n = v71Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object b(Object obj, Object obj2) {
        switch (this.i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((wt) h((dn) obj2, (Function1) obj)).k(Unit.a);
            default:
                return ((wt) h((dn) obj2, (sn) obj)).k(Unit.a);
        }
    }

    @Override // defpackage.yc
    public final dn h(dn dnVar, Object obj) {
        int i = this.i;
        v71 v71Var = this.n;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                wt wtVar = new wt(this.k, v71Var, dnVar);
                wtVar.m = obj;
                return wtVar;
            default:
                wt wtVar2 = new wt(v71Var, dnVar);
                wtVar2.m = obj;
                return wtVar2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00be, code lost:
    
        if (r11 != r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00e8, code lost:
    
        if (defpackage.v71.C0(r3, r10) == r0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00f6, code lost:
    
        if (defpackage.v71.C0(r3, r10) != r0) goto L12;
     */
    /* JADX WARN: Path cross not found for [B:34:0x00d9, B:31:0x00c7], limit reached: 91 */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00bc A[Catch: CancellationException -> 0x003a, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x003a, blocks: (B:23:0x009c, B:42:0x00bc, B:58:0x0034), top: B:57:0x0034 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0123  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0086 -> B:10:0x005b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00d4 -> B:10:0x005b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00db -> B:10:0x005b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00e8 -> B:10:0x005b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00f6 -> B:9:0x002c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:81:0x0146 -> B:64:0x0147). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:82:0x014a -> B:65:0x014c). Please report as a decompilation issue!!! */
    @Override // defpackage.yc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(Object obj) {
        Function1 function1;
        Object obj2;
        sn snVar;
        z11 z11Var;
        z11 z11Var2;
        z11 z11Var3;
        sn snVar2;
        sn snVar3;
        Object f;
        qt qtVar;
        Object obj3;
        int i = this.i;
        v71 v71Var = this.n;
        dn dnVar = null;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                z11 z11Var4 = this.k;
                tn tnVar = tn.d;
                int i2 = this.l;
                if (i2 == 0) {
                    ca0.v(obj);
                    function1 = (Function1) this.m;
                    obj2 = z11Var4.d;
                    if (obj2 instanceof pt) {
                    }
                } else if (i2 != 1) {
                    dd0.j("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    z11 z11Var5 = this.j;
                    function1 = (Function1) this.m;
                    ca0.v(obj);
                    qt qtVar2 = (qt) obj;
                    z11Var5.d = qtVar2;
                    obj2 = z11Var4.d;
                    if (!(obj2 instanceof pt) || (obj2 instanceof mt)) {
                        break;
                    } else {
                        nt ntVar = obj2 instanceof nt ? (nt) obj2 : null;
                        if (ntVar != null) {
                            function1.invoke(ntVar);
                        }
                        we weVar = v71Var.y;
                        if (weVar != null) {
                            this.m = function1;
                            this.j = z11Var4;
                            this.l = 1;
                            obj = we.D(weVar, this);
                            if (obj == tnVar) {
                                break;
                            } else {
                                z11Var5 = z11Var4;
                                qt qtVar22 = (qt) obj;
                                z11Var5.d = qtVar22;
                                obj2 = z11Var4.d;
                                if (obj2 instanceof pt) {
                                }
                            }
                        } else {
                            z11Var5 = z11Var4;
                            qtVar22 = null;
                            z11Var5.d = qtVar22;
                            obj2 = z11Var4.d;
                            if (obj2 instanceof pt) {
                            }
                        }
                    }
                }
            default:
                tn tnVar2 = tn.d;
                switch (this.l) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        ca0.v(obj);
                        snVar = (sn) this.m;
                        if (la0.L(snVar)) {
                            z11Var = new z11();
                            we weVar2 = v71Var.y;
                            if (weVar2 != null) {
                                this.m = snVar;
                                this.j = z11Var;
                                this.k = z11Var;
                                this.l = 1;
                                obj = we.D(weVar2, this);
                                if (obj != tnVar2) {
                                    z11Var2 = z11Var;
                                    qtVar = (qt) obj;
                                    z11Var.d = qtVar;
                                    obj3 = z11Var2.d;
                                    if (obj3 instanceof ot) {
                                        this.m = snVar;
                                        this.j = z11Var2;
                                        this.k = null;
                                        this.l = 2;
                                        if (v71.D0(v71Var, (ot) obj3, this) != tnVar2) {
                                            z11Var3 = z11Var2;
                                            snVar2 = snVar;
                                            wt wtVar = new wt(z11Var3, v71Var, null);
                                            this.m = snVar2;
                                            this.j = z11Var3;
                                            this.l = 3;
                                            d81 d81Var = v71Var.R;
                                            f = d81Var.f(go0.e, new f(wtVar, d81Var, dnVar, 11), this);
                                            if (f == tn.d) {
                                                f = Unit.a;
                                                break;
                                            } else {
                                                break;
                                            }
                                        }
                                    }
                                    if (la0.L(snVar)) {
                                        break;
                                    }
                                }
                                break;
                            } else {
                                z11Var2 = z11Var;
                                qtVar = null;
                                z11Var.d = qtVar;
                                obj3 = z11Var2.d;
                                if (obj3 instanceof ot) {
                                }
                                if (la0.L(snVar)) {
                                }
                            }
                        }
                    case 1:
                        z11Var = this.k;
                        z11Var2 = this.j;
                        snVar = (sn) this.m;
                        ca0.v(obj);
                        qtVar = (qt) obj;
                        z11Var.d = qtVar;
                        obj3 = z11Var2.d;
                        if (obj3 instanceof ot) {
                        }
                        if (la0.L(snVar)) {
                        }
                        break;
                    case 2:
                        z11Var3 = this.j;
                        snVar2 = (sn) this.m;
                        ca0.v(obj);
                        wt wtVar2 = new wt(z11Var3, v71Var, null);
                        this.m = snVar2;
                        this.j = z11Var3;
                        this.l = 3;
                        d81 d81Var2 = v71Var.R;
                        f = d81Var2.f(go0.e, new f(wtVar2, d81Var2, dnVar, 11), this);
                        if (f == tn.d) {
                        }
                        break;
                    case 3:
                        z11Var3 = this.j;
                        snVar2 = (sn) this.m;
                        try {
                            ca0.v(obj);
                        } catch (CancellationException unused) {
                            snVar3 = snVar2;
                            this.m = snVar3;
                            this.j = null;
                            this.l = 6;
                            break;
                        }
                        snVar = snVar2;
                        try {
                        } catch (CancellationException unused2) {
                            snVar3 = snVar;
                            this.m = snVar3;
                            this.j = null;
                            this.l = 6;
                        }
                        Object obj4 = z11Var3.d;
                        if (obj4 instanceof pt) {
                            this.m = snVar;
                            this.j = null;
                            this.l = 4;
                            if (v71.E0(v71Var, (pt) obj4, this) == tnVar2) {
                                break;
                            }
                            if (la0.L(snVar)) {
                            }
                        } else {
                            if (obj4 instanceof mt) {
                                this.m = snVar;
                                this.j = null;
                                this.l = 5;
                                break;
                            }
                            if (la0.L(snVar)) {
                            }
                        }
                        break;
                    case 4:
                        snVar3 = (sn) this.m;
                        try {
                            ca0.v(obj);
                        } catch (CancellationException unused3) {
                            this.m = snVar3;
                            this.j = null;
                            this.l = 6;
                            break;
                        }
                        snVar = snVar3;
                        if (la0.L(snVar)) {
                        }
                        break;
                    case ry0.STRING_FIELD_NUMBER /* 5 */:
                        snVar3 = (sn) this.m;
                        ca0.v(obj);
                        snVar = snVar3;
                        if (la0.L(snVar)) {
                        }
                        break;
                    case ry0.STRING_SET_FIELD_NUMBER /* 6 */:
                        snVar3 = (sn) this.m;
                        ca0.v(obj);
                        snVar = snVar3;
                        if (la0.L(snVar)) {
                        }
                        break;
                    default:
                        dd0.j("call to 'resume' before 'invoke' with coroutine");
                        break;
                }
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wt(v71 v71Var, dn dnVar) {
        super(2, dnVar);
        this.n = v71Var;
    }
}
