package defpackage;

import android.content.Intent;
import android.content.IntentSender;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class qj implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ IntentSender.SendIntentException e;
    public final /* synthetic */ rj g;

    public qj(rj rjVar, int i, IntentSender.SendIntentException sendIntentException) {
        this.g = rjVar;
        this.d = i;
        this.e = sendIntentException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.g.a(this.d, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", this.e));
    }
}
