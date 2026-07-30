package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final /* synthetic */ class nb1 implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Function1 e;
    public final /* synthetic */ Function1 g;

    public /* synthetic */ nb1(Function1 function1, Function1 function12, int i) {
        this.d = i;
        this.e = function1;
        this.g = function12;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.d;
        Function1 function1 = this.g;
        Function1 function12 = this.e;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                function12.invoke(obj);
                function1.invoke(obj);
                break;
            default:
                function12.invoke(obj);
                function1.invoke(obj);
                break;
        }
        return Unit.a;
    }
}
