package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final /* synthetic */ class se0 implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ se0(String str, String str2, Function0 function0, Function0 function02, int i) {
        this.d = 2;
        this.g = str;
        this.h = str2;
        this.e = function0;
        this.i = function02;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object b(Object obj, Object obj2) {
        int i = this.d;
        Object obj3 = this.i;
        Object obj4 = this.h;
        Object obj5 = this.g;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((Integer) obj2).getClass();
                int P = gb0.P(1);
                t90.a(this.e, (am0) obj5, (bf0) obj4, (qf0) obj3, (hl) obj, P);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int P2 = gb0.P(1);
                uq1.f(this.e, (Function0) obj5, (Function0) obj4, (Function0) obj3, (hl) obj, P2);
                break;
            default:
                ((Integer) obj2).getClass();
                int P3 = gb0.P(3457);
                m90.e((String) obj5, (String) obj4, this.e, (Function0) obj3, (hl) obj, P3);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ se0(Function0 function0, Object obj, Object obj2, Object obj3, int i, int i2) {
        this.d = i2;
        this.e = function0;
        this.g = obj;
        this.h = obj2;
        this.i = obj3;
    }
}
