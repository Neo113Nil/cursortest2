package com.stripe.android;

import androidx.activity.result.ActivityResultLauncher;
import com.stripe.android.view.ActivityHost;
import com.stripe.android.view.AuthActivityStarter;
import com.stripe.android.view.PaymentRelayActivity;

/* loaded from: classes8.dex */
public final class PaymentRelayStarter$Legacy implements AuthActivityStarter {
    public final /* synthetic */ int $r8$classId = 1;
    public final Object host;

    public PaymentRelayStarter$Legacy(ActivityHost activityHost) {
        activityHost.getClass();
        this.host = activityHost;
    }

    @Override // com.stripe.android.view.AuthActivityStarter
    public final void start(Object obj) {
        int i = this.$r8$classId;
        Object obj2 = this.host;
        switch (i) {
            case 0:
                PaymentRelayStarter$Args paymentRelayStarter$Args = (PaymentRelayStarter$Args) obj;
                ((ActivityHost) obj2).startActivityForResult(PaymentRelayActivity.class, paymentRelayStarter$Args.toResult().toBundle(), paymentRelayStarter$Args.getRequestCode());
                break;
            default:
                ((ActivityResultLauncher) obj2).launch((PaymentRelayStarter$Args) obj);
                break;
        }
    }

    public PaymentRelayStarter$Legacy(ActivityResultLauncher activityResultLauncher) {
        activityResultLauncher.getClass();
        this.host = activityResultLauncher;
    }
}
