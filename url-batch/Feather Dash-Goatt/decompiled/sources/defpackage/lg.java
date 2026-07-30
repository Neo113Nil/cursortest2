package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import java.io.Serializable;
import kotlin.Unit;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class lg implements d00 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Serializable e;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ lg(Serializable serializable, Object obj, Object obj2, Object obj3, int i) {
        this.d = i;
        this.e = serializable;
        this.g = obj;
        this.h = obj2;
        this.i = obj3;
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c7  */
    @Override // defpackage.d00
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(Object obj, dn dnVar) {
        kg kgVar;
        int i;
        int i2 = this.d;
        int i3 = 1;
        Serializable serializable = this.e;
        int i4 = 0;
        switch (i2) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (dnVar instanceof kg) {
                    kgVar = (kg) dnVar;
                    int i5 = kgVar.l;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        kgVar.l = i5 - Integer.MIN_VALUE;
                        Object obj2 = kgVar.j;
                        tn tnVar = tn.d;
                        i = kgVar.l;
                        if (i != 0) {
                            ca0.v(obj2);
                            jb0 jb0Var = (jb0) ((z11) serializable).d;
                            if (jb0Var != null) {
                                jb0Var.a(new rg("Child of the scoped flow was cancelled", i4));
                                kgVar.h = this;
                                kgVar.i = obj;
                                kgVar.l = 1;
                                if (jb0Var.x(kgVar) == tnVar) {
                                }
                            }
                        } else if (i != 1) {
                            dd0.j("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            obj = kgVar.i;
                            this = kgVar.h;
                            ca0.v(obj2);
                        }
                        z11 z11Var = (z11) this.e;
                        sn snVar = (sn) this.g;
                        vn vnVar = vn.d;
                        z11Var.d = uq1.N(snVar, null, new jg((mg) this.h, (d00) this.i, obj, null), 1);
                        break;
                    }
                }
                kgVar = new kg(this, dnVar);
                Object obj22 = kgVar.j;
                tn tnVar2 = tn.d;
                i = kgVar.l;
                if (i != 0) {
                }
                z11 z11Var2 = (z11) this.e;
                sn snVar2 = (sn) this.g;
                vn vnVar2 = vn.d;
                z11Var2.d = uq1.N(snVar2, null, new jg((mg) this.h, (d00) this.i, obj, null), 1);
                break;
            default:
                ga0 ga0Var = (ga0) obj;
                x11 x11Var = (x11) this.h;
                x11 x11Var2 = (x11) this.g;
                x11 x11Var3 = (x11) serializable;
                if (ga0Var instanceof zy0) {
                    x11Var3.d++;
                } else if (ga0Var instanceof az0) {
                    x11Var3.d--;
                } else if (ga0Var instanceof yy0) {
                    x11Var3.d--;
                } else if (ga0Var instanceof q60) {
                    x11Var2.d++;
                } else if (ga0Var instanceof r60) {
                    x11Var2.d--;
                } else if (ga0Var instanceof w00) {
                    x11Var.d++;
                } else if (ga0Var instanceof x00) {
                    x11Var.d--;
                }
                boolean z = x11Var3.d > 0;
                boolean z2 = x11Var2.d > 0;
                boolean z3 = x11Var.d > 0;
                sp spVar = (sp) this.i;
                if (spVar.t != z) {
                    spVar.t = z;
                    i4 = 1;
                }
                if (spVar.u != z2) {
                    spVar.u = z2;
                    i4 = 1;
                }
                if (spVar.v != z3) {
                    spVar.v = z3;
                } else {
                    i3 = i4;
                }
                if (i3 != 0) {
                    yr1.O(spVar);
                }
                break;
        }
        return Unit.a;
    }
}
