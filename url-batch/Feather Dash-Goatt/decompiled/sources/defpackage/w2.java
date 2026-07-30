package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final /* synthetic */ class w2 implements Runnable {
    public final /* synthetic */ int d;

    public /* synthetic */ w2(int i) {
        this.d = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                int i = AlarmManagerSchedulerBroadcastReceiver.a;
                return;
            default:
                mn0 mn0Var = d4.O0;
                synchronized (mn0Var) {
                    Object[] objArr = mn0Var.a;
                    int i2 = mn0Var.b;
                    for (int i3 = 0; i3 < i2; i3++) {
                        d4.n(((d4) objArr[i3]).getRoot());
                    }
                }
                return;
        }
    }
}
