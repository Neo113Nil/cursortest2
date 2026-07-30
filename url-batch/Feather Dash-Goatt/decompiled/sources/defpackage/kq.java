package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import com.appsflyer.internal.l;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class kq implements sg0 {
    public final /* synthetic */ int d = 0;
    public final Object e;
    public final Object g;

    public kq(ug0 ug0Var) {
        this.e = ug0Var;
        bh bhVar = bh.c;
        Class<?> cls = ug0Var.getClass();
        zg zgVar = (zg) bhVar.a.get(cls);
        this.g = zgVar == null ? bhVar.a(cls, null) : zgVar;
    }

    @Override // defpackage.sg0
    public final void e(vg0 vg0Var, ng0 ng0Var) {
        int i = this.d;
        Object obj = this.e;
        Object obj2 = this.g;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                iq iqVar = (iq) obj;
                switch (jq.a[ng0Var.ordinal()]) {
                    case 1:
                        iqVar.getClass();
                        break;
                    case 2:
                        iqVar.b(vg0Var);
                        break;
                    case 3:
                        iqVar.c(vg0Var);
                        break;
                    case 4:
                        iqVar.getClass();
                        break;
                    case ry0.STRING_FIELD_NUMBER /* 5 */:
                        iqVar.a(vg0Var);
                        break;
                    case ry0.STRING_SET_FIELD_NUMBER /* 6 */:
                        iqVar.getClass();
                        break;
                    case ry0.DOUBLE_FIELD_NUMBER /* 7 */:
                        dd0.e("ON_ANY must not been send by anybody");
                        break;
                    default:
                        l.a();
                        break;
                }
                sg0 sg0Var = (sg0) obj2;
                if (sg0Var != null) {
                    sg0Var.e(vg0Var, ng0Var);
                    break;
                }
                break;
            case 1:
                if (ng0Var == ng0.ON_START) {
                    ((xg0) obj).f(this);
                    ((c51) obj2).l();
                    break;
                }
                break;
            default:
                HashMap hashMap = ((zg) obj2).a;
                zg.a((List) hashMap.get(ng0Var), vg0Var, ng0Var, obj);
                zg.a((List) hashMap.get(ng0.ON_ANY), vg0Var, ng0Var, obj);
                break;
        }
    }

    public kq(iq iqVar, sg0 sg0Var) {
        iqVar.getClass();
        this.e = iqVar;
        this.g = sg0Var;
    }

    public kq(xg0 xg0Var, c51 c51Var) {
        this.e = xg0Var;
        this.g = c51Var;
    }
}
