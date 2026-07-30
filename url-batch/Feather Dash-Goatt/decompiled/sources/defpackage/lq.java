package defpackage;

import android.content.Context;
import android.content.Intent;
import com.android.installreferrer.api.InstallReferrerClient;
import com.appsflyer.internal.AFa1tSDK;
import com.appsflyer.internal.AFd1wSDK;
import com.appsflyer.internal.AFi1aSDK;
import com.appsflyer.internal.AFj1rSDK;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Logger;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final /* synthetic */ class lq implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ lq(oq oqVar, cc ccVar, dd0 dd0Var, kb kbVar) {
        this.d = 0;
        this.e = oqVar;
        this.g = ccVar;
        this.h = kbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                oq oqVar = (oq) this.e;
                cc ccVar = (cc) this.g;
                String str = ccVar.a;
                kb kbVar = (kb) this.h;
                oqVar.getClass();
                Logger logger = oq.f;
                try {
                    fj1 a = oqVar.c.a(str);
                    if (a == null) {
                        String str2 = "Transport backend '" + str + "' is not registered";
                        logger.warning(str2);
                        new IllegalArgumentException(str2);
                    } else {
                        oqVar.e.f(new mq(oqVar, ccVar, ((cg) a).a(kbVar), 0));
                    }
                    return;
                } catch (Exception e) {
                    logger.warning("Error scheduling event " + e.getMessage());
                    return;
                }
            case 1:
                o5 o5Var = (o5) this.e;
                la0 la0Var = (la0) this.g;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.h;
                try {
                    h20 z = p4.z(o5Var.d);
                    if (z == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    g20 g20Var = (g20) z.a;
                    synchronized (g20Var.h) {
                        g20Var.j = threadPoolExecutor;
                    }
                    z.a.b(new av(la0Var, threadPoolExecutor));
                    return;
                } catch (Throwable th) {
                    la0Var.O(th);
                    threadPoolExecutor.shutdown();
                    return;
                }
            case 2:
                xv xvVar = (xv) this.e;
                Intent intent = (Intent) this.g;
                ng1 ng1Var = (ng1) this.h;
                try {
                    xvVar.handleIntent(intent);
                    return;
                } finally {
                    ng1Var.a(null);
                }
            case 3:
                ((AFa1tSDK) this.e).e_((Context) this.g, (Intent) this.h);
                return;
            case 4:
                AFd1wSDK.AFAdRevenueData((AFd1wSDK) this.e, (Throwable) this.g, (String) this.h);
                return;
            default:
                ((AFj1rSDK) this.e).getMediationNetwork((AFi1aSDK) this.g, (Runnable) this.h);
                return;
        }
    }

    public /* synthetic */ lq(Object obj, Object obj2, Object obj3, int i) {
        this.d = i;
        this.e = obj;
        this.g = obj2;
        this.h = obj3;
    }
}
