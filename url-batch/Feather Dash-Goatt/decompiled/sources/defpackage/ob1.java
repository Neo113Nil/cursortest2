package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final /* synthetic */ class ob1 implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Function1 e;

    public /* synthetic */ ob1(Function1 function1, int i) {
        this.d = i;
        this.e = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.d;
        Function1 function1 = this.e;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ib1 ib1Var = (ib1) function1.invoke((mb1) obj);
                synchronized (pb1.c) {
                    pb1.d = pb1.d.f(ib1Var.g());
                }
                return ib1Var;
            default:
                Long l = (Long) obj;
                l.getClass();
                return function1.invoke(l);
        }
    }
}
