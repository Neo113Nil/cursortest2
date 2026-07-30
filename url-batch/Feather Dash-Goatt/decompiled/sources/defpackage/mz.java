package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import com.google.firebase.messaging.FirebaseMessaging;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final /* synthetic */ class mz implements qr0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ FirebaseMessaging e;

    public /* synthetic */ mz(FirebaseMessaging firebaseMessaging, int i) {
        this.d = i;
        this.e = firebaseMessaging;
    }

    @Override // defpackage.qr0
    public final void h(Object obj) {
        boolean z;
        int i = this.d;
        FirebaseMessaging firebaseMessaging = this.e;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ui1 ui1Var = (ui1) obj;
                if (!firebaseMessaging.e.a() || ui1Var.h.a() == null) {
                    return;
                }
                synchronized (ui1Var) {
                    z = ui1Var.g;
                }
                if (z) {
                    return;
                }
                ui1Var.f(0L);
                return;
            default:
                qh qhVar = (qh) obj;
                if (qhVar != null) {
                    ka0.w(qhVar.d);
                    firebaseMessaging.e();
                    return;
                }
                return;
        }
    }
}
