package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final /* synthetic */ class xe0 implements Function2 {
    public final /* synthetic */ int d = 1;
    public final /* synthetic */ int e;
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    public /* synthetic */ xe0(int i, Function0 function0, am0 am0Var, String str, int i2) {
        this.e = i;
        this.h = function0;
        this.i = am0Var;
        this.j = str;
        this.g = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object b(Object obj, Object obj2) {
        int i = this.d;
        int i2 = this.g;
        Object obj3 = this.j;
        Object obj4 = this.i;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((Integer) obj2).getClass();
                int P = gb0.P(i2 | 1);
                Object obj5 = this.h;
                int i3 = this.e;
                y90.a(obj5, i3, (ye0) obj4, (hk) obj3, (hl) obj, P);
                break;
            default:
                ((Integer) obj2).getClass();
                int P2 = gb0.P(i2 | 1);
                int i4 = this.e;
                yr1.u(i4, (Function0) this.h, (am0) obj4, (String) obj3, (hl) obj, P2);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ xe0(Object obj, int i, ye0 ye0Var, hk hkVar, int i2) {
        this.h = obj;
        this.e = i;
        this.i = ye0Var;
        this.j = hkVar;
        this.g = i2;
    }
}
