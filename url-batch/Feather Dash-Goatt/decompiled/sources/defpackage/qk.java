package defpackage;

import android.graphics.Rect;
import android.view.ScrollCaptureSession;
import com.android.installreferrer.api.InstallReferrerClient;
import com.appsflyer.internal.l;
import java.util.function.Consumer;
import kotlin.Unit;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class qk extends sf1 implements Function2 {
    public final /* synthetic */ int i;
    public int j;
    public Object k;
    public /* synthetic */ Object l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qk(Object obj, Object obj2, Object obj3, Object obj4, dn dnVar, int i) {
        super(2, dnVar);
        this.i = i;
        this.k = obj;
        this.l = obj2;
        this.m = obj3;
        this.n = obj4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object b(Object obj, Object obj2) {
        switch (this.i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((qk) h((dn) obj2, (sn) obj)).k(Unit.a);
            case 1:
                return ((qk) h((dn) obj2, (la1) obj)).k(Unit.a);
            case 2:
                return ((qk) h((dn) obj2, (sn) obj)).k(Unit.a);
            default:
                ((qk) h((dn) obj2, (sn) obj)).k(Unit.a);
                return tn.d;
        }
    }

    @Override // defpackage.yc
    public final dn h(dn dnVar, Object obj) {
        int i = this.i;
        Object obj2 = this.n;
        Object obj3 = this.m;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new qk((tk) this.k, (ScrollCaptureSession) this.l, (Rect) obj3, (Consumer) obj2, dnVar, 0);
            case 1:
                qk qkVar = new qk((c00) this.l, (be1) obj3, (Float) obj2, dnVar);
                qkVar.k = obj;
                return qkVar;
            case 2:
                return new qk((vc1) this.k, (c00) this.l, (be1) obj3, (Float) obj2, dnVar, 2);
            default:
                qk qkVar2 = new qk((ao0) obj3, (j80) obj2, dnVar);
                qkVar2.l = obj;
                return qkVar2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0077, code lost:
    
        if (defpackage.t90.r(g()).j(r10, r20) == r1) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00a1, code lost:
    
        if (defpackage.p4.F(r4, r8, r20) == r1) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ff, code lost:
    
        if (r1.f(r3, r20) == r8) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00df, code lost:
    
        if (r1.f(r3, r20) == r8) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00f6, code lost:
    
        if (defpackage.p4.F(r2, r4, r20) == r8) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x015b, code lost:
    
        if (r0 == r8) goto L55;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x007f -> B:8:0x004d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x00a1 -> B:8:0x004d). Please report as a decompilation issue!!! */
    @Override // defpackage.yc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(Object obj) {
        Object a;
        sn snVar;
        w11 w11Var;
        int i = this.i;
        Object obj2 = this.n;
        Object obj3 = this.m;
        int i2 = 2;
        int i3 = 1;
        dn dnVar = null;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                tn tnVar = tn.d;
                int i4 = this.j;
                if (i4 == 0) {
                    ca0.v(obj);
                    tk tkVar = (tk) this.k;
                    ScrollCaptureSession scrollCaptureSession = (ScrollCaptureSession) this.l;
                    Rect rect = (Rect) obj3;
                    x90 x90Var = new x90(rect.left, rect.top, rect.right, rect.bottom);
                    this.j = 1;
                    a = tk.a(tkVar, scrollCaptureSession, x90Var, this);
                    if (a == tnVar) {
                        return tnVar;
                    }
                } else {
                    if (i4 != 1) {
                        dd0.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ca0.v(obj);
                    a = obj;
                }
                ((Consumer) obj2).accept(t80.L((x90) a));
                return Unit.a;
            case 1:
                be1 be1Var = (be1) obj3;
                tn tnVar2 = tn.d;
                int i5 = this.j;
                if (i5 == 0) {
                    ca0.v(obj);
                    int ordinal = ((la1) this.k).ordinal();
                    if (ordinal == 0) {
                        c00 c00Var = (c00) this.l;
                        this.j = 1;
                        if (c00Var.f(be1Var, this) == tnVar2) {
                            return tnVar2;
                        }
                    } else if (ordinal != 1) {
                        if (ordinal != 2) {
                            l.a();
                            return null;
                        }
                        Float f = (Float) obj2;
                        if (f == la0.t) {
                            throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
                        }
                        be1Var.j(null, f);
                    }
                } else {
                    if (i5 != 1) {
                        dd0.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ca0.v(obj);
                }
                return Unit.a;
            case 2:
                c00 c00Var2 = (c00) this.l;
                be1 be1Var2 = (be1) obj3;
                tn tnVar3 = tn.d;
                int i6 = this.j;
                if (i6 == 0) {
                    ca0.v(obj);
                    vc1 vc1Var = (vc1) this.k;
                    if (vc1Var != ma1.a) {
                        if (vc1Var != ma1.b) {
                            hf1 g = be1Var2.g();
                            uc1 uc1Var = new uc1(vc1Var, null);
                            int i7 = o00.a;
                            g gVar = g.d;
                            ue ueVar = ue.d;
                            c00 E = p4.E(p4.E(new yw(new mg(uc1Var, g, gVar, -2, ueVar), 11, new yo(i2, dnVar, i2))));
                            qk qkVar = new qk(c00Var2, be1Var2, (Float) obj2, null);
                            this.j = 4;
                            Object f2 = p4.q(new mg(new n00(qkVar, null), E, gVar, -2, ueVar), 0).f(xp0.d, this);
                            if (f2 != tnVar3) {
                                f2 = Unit.a;
                            }
                            if (f2 != tnVar3) {
                                f2 = Unit.a;
                                break;
                            }
                        } else {
                            hf1 g2 = be1Var2.g();
                            ex exVar = new ex(i2, dnVar, i2);
                            this.j = 2;
                            break;
                        }
                    } else {
                        this.j = 1;
                        break;
                    }
                } else {
                    if (i6 != 1) {
                        if (i6 == 2) {
                            ca0.v(obj);
                            this.j = 3;
                            break;
                        } else if (i6 != 3 && i6 != 4) {
                            dd0.j("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    }
                    ca0.v(obj);
                    return Unit.a;
                }
                return tnVar3;
            default:
                tn tnVar4 = tn.d;
                int i8 = this.j;
                if (i8 == 0) {
                    ca0.v(obj);
                    sn snVar2 = (sn) this.l;
                    w11 w11Var2 = new w11();
                    w11Var2.d = 1.0f;
                    snVar = snVar2;
                    w11Var = w11Var2;
                } else if (i8 == 1) {
                    w11 w11Var3 = (w11) this.k;
                    sn snVar3 = (sn) this.l;
                    ca0.v(obj);
                    w11Var = w11Var3;
                    snVar = snVar3;
                    if (w11Var.d == 0.0f) {
                        nq0 nq0Var = new nq0(9, new yb1(new i6(i3, snVar), null));
                        i80 i80Var = new i80(2, null);
                        this.l = snVar;
                        this.k = w11Var;
                        this.j = 2;
                        break;
                    }
                } else {
                    if (i8 != 2) {
                        dd0.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w11 w11Var4 = (w11) this.k;
                    sn snVar4 = (sn) this.l;
                    ca0.v(obj);
                    w11Var = w11Var4;
                    snVar = snVar4;
                }
                j7 j7Var = new j7((ao0) obj3, (j80) obj2, w11Var, snVar, 3);
                this.l = snVar;
                this.k = w11Var;
                this.j = 1;
                if (g().d(a60.k) == null) {
                    break;
                } else {
                    af.c();
                    return null;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qk(ao0 ao0Var, j80 j80Var, dn dnVar) {
        super(2, dnVar);
        this.i = 3;
        this.m = ao0Var;
        this.n = j80Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qk(c00 c00Var, be1 be1Var, Float f, dn dnVar) {
        super(2, dnVar);
        this.i = 1;
        this.l = c00Var;
        this.m = be1Var;
        this.n = f;
    }
}
