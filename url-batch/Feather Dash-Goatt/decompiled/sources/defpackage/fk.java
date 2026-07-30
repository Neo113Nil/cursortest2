package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final /* synthetic */ class fk implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ fk(mf0 mf0Var, Object obj, int i, Object obj2, int i2) {
        this.d = 2;
        this.g = mf0Var;
        this.h = obj;
        this.e = i;
        this.i = obj2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object b(Object obj, Object obj2) {
        int i = this.d;
        int i2 = this.e;
        Object obj3 = this.h;
        Object obj4 = this.i;
        Object obj5 = this.g;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((Integer) obj2).getClass();
                ((hk) obj5).g(obj3, obj4, (hl) obj, gb0.P(i2) | 1);
                break;
            case 1:
                ((Integer) obj2).getClass();
                p4.d((e40) obj5, (Function0) obj3, (am0) obj4, (hl) obj, gb0.P(i2 | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                int P = gb0.P(1);
                gb0.b((mf0) obj5, this.h, this.e, this.i, (hl) obj, P);
                break;
            case 3:
                ((Integer) obj2).getClass();
                ((zf0) obj4).a(obj3, (hk) obj5, (hl) obj, gb0.P(i2 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                ((r51) obj4).a(obj3, (hk) obj5, (hl) obj, gb0.P(i2 | 1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ fk(p51 p51Var, Object obj, hk hkVar, int i, int i2) {
        this.d = i2;
        this.i = p51Var;
        this.h = obj;
        this.g = hkVar;
        this.e = i;
    }

    public /* synthetic */ fk(Object obj, Object obj2, Object obj3, int i, int i2) {
        this.d = i2;
        this.g = obj;
        this.h = obj2;
        this.i = obj3;
        this.e = i;
    }
}
