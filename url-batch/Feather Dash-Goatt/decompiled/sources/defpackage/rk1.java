package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final /* synthetic */ class rk1 implements Function2 {
    public final /* synthetic */ int d = 1;
    public final /* synthetic */ int e;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ am0 h;
    public final /* synthetic */ Function0 i;
    public final /* synthetic */ int j;

    public /* synthetic */ rk1(int i, boolean z, am0 am0Var, Function0 function0, int i2) {
        this.e = i;
        this.g = z;
        this.h = am0Var;
        this.i = function0;
        this.j = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object b(Object obj, Object obj2) {
        hl hlVar = (hl) obj;
        Integer num = (Integer) obj2;
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                num.getClass();
                yr1.y(this.g, this.e, this.j, this.h, this.i, hlVar, gb0.P(3073));
                break;
            default:
                num.intValue();
                yr1.w(this.e, this.g, this.h, this.i, hlVar, gb0.P(this.j | 1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ rk1(boolean z, int i, int i2, am0 am0Var, Function0 function0, int i3) {
        this.g = z;
        this.e = i;
        this.j = i2;
        this.h = am0Var;
        this.i = function0;
    }
}
