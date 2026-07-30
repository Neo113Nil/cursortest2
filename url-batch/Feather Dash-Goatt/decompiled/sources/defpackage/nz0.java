package defpackage;

import android.content.Context;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final /* synthetic */ class nz0 implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Context e;

    public /* synthetic */ nz0(Context context, int i) {
        this.d = i;
        this.e = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.d;
        Context context = this.e;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new nz0(context, 1));
                break;
            default:
                yr1.h0(context, new kz0(), yr1.p, false);
                break;
        }
    }
}
