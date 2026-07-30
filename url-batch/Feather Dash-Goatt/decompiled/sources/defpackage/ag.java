package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final /* synthetic */ class ag implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ ag(int i, int i2, Object obj, Object obj2) {
        this.d = i2;
        this.g = obj;
        this.h = obj2;
        this.e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object b(Object obj, Object obj2) {
        int i = this.d;
        int i2 = this.e;
        Object obj3 = this.h;
        Object obj4 = this.g;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((Integer) obj2).intValue();
                la0.a((am0) obj4, (Function1) obj3, (hl) obj, gb0.P(i2 | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                ((hk) obj4).e(obj3, (hl) obj, gb0.P(i2) | 1);
                break;
            case 2:
                ((Integer) obj2).getClass();
                op.a((n01) obj4, (hk) obj3, (hl) obj, gb0.P(i2 | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                op.b((n01[]) obj4, (Function2) obj3, (hl) obj, gb0.P(i2 | 1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                la0.g((jo) obj4, (Function0) obj3, (hl) obj, gb0.P(i2 | 1));
                break;
            case ry0.STRING_FIELD_NUMBER /* 5 */:
                ((Integer) obj2).getClass();
                yr1.d((List) obj4, (z8) obj3, (hl) obj, gb0.P(i2 | 1));
                break;
            case ry0.STRING_SET_FIELD_NUMBER /* 6 */:
                ((Integer) obj2).intValue();
                yr1.c((List) obj4, (Function1) obj3, (hl) obj, gb0.P(i2 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                yr1.g((u8) obj4, (z8) obj3, (hl) obj, gb0.P(i2 | 1));
                break;
        }
        return Unit.a;
    }
}
