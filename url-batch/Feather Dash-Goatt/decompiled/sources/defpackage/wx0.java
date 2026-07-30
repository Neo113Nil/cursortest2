package defpackage;

import android.view.MotionEvent;
import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class wx0 extends pc0 implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ xx0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wx0(xx0 xx0Var, int i) {
        super(1);
        this.d = i;
        this.e = xx0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.d;
        xx0 xx0Var = this.e;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                MotionEvent motionEvent = (MotionEvent) obj;
                x6 x6Var = xx0Var.a;
                if (x6Var != null) {
                    x6Var.invoke(motionEvent);
                    return Unit.a;
                }
                Intrinsics.e("onTouchEvent");
                throw null;
            default:
                MotionEvent motionEvent2 = (MotionEvent) obj;
                x6 x6Var2 = xx0Var.a;
                if (x6Var2 != null) {
                    x6Var2.invoke(motionEvent2);
                    return Unit.a;
                }
                Intrinsics.e("onTouchEvent");
                throw null;
        }
    }
}
