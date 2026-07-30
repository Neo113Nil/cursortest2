package defpackage;

import android.os.Handler;
import android.os.Looper;
import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class t3 extends pc0 implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ d4 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t3(d4 d4Var, int i) {
        super(1);
        this.d = i;
        this.e = d4Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.d;
        boolean z = true;
        d4 d4Var = this.e;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                int i2 = ((z80) obj).a;
                if (i2 == 1) {
                    z = d4Var.isInTouchMode();
                } else if (i2 != 2) {
                    z = false;
                } else if (d4Var.isInTouchMode()) {
                    z = d4Var.requestFocusFromTouch();
                }
                break;
            case 1:
                int i3 = ((s00) obj).a;
                e10 e10Var = (e10) d4Var.getFocusOwner();
                d4 d4Var2 = e10Var.a;
                o10 f = e10Var.f();
                if (f == null || !f.s || !d4Var2.v(i3)) {
                    z11 z11Var = new z11();
                    z11Var.d = Boolean.FALSE;
                    o10 f2 = e10Var.f();
                    Boolean e = e10Var.e(i3, d4Var2.getEmbeddedViewFocusRect(), new d10(i3, z11Var));
                    if ((!Intrinsics.a(e, Boolean.TRUE) || f2 == e10Var.f()) && e != null && z11Var.d != null && e.booleanValue()) {
                        ((Boolean) z11Var.d).getClass();
                    }
                }
                break;
            default:
                Function0 function0 = (Function0) obj;
                d4Var.getUncaughtExceptionHandler$ui();
                Handler handler = d4Var.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    function0.invoke();
                } else {
                    Handler handler2 = d4Var.getHandler();
                    if (handler2 != null) {
                        handler2.post(new q2(function0, 1));
                    }
                }
                break;
        }
        return Unit.a;
    }
}
