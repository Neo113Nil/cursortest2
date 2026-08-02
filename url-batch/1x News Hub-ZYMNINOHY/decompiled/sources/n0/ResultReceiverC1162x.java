package n0;

import U1.C0084e;
import a0.C0130a;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import com.google.android.gms.internal.play_billing.AbstractC0216d1;
import com.google.android.gms.internal.play_billing.AbstractC0248o0;

/* renamed from: n0.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ResultReceiverC1162x extends ResultReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ B0.g f10137a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1143e f10138b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResultReceiverC1162x(C1143e c1143e, Handler handler, B0.g gVar) {
        super(handler);
        this.f10137a = gVar;
        this.f10138b = c1143e;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i3, Bundle bundle) {
        C0130a a3 = C1147i.a();
        a3.f1920b = i3;
        B0.g gVar = this.f10137a;
        if (i3 != 0) {
            C1143e c1143e = this.f10138b;
            if (bundle == null) {
                c1143e.G(gVar, AbstractC1135O.f10024i, 73, null);
                return;
            } else {
                a3.f1919a = AbstractC0248o0.e(bundle, "BillingClient");
                int i4 = bundle.getInt("INTERNAL_LOG_ERROR_REASON");
                c1143e.r(AbstractC1133M.c(i4 != 0 ? AbstractC0216d1.m(i4) : 23, 16, a3.a(), bundle.getString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS")));
            }
        }
        ((C0084e) gVar.f131b).a(S0.a.j(a3.a()));
    }
}
