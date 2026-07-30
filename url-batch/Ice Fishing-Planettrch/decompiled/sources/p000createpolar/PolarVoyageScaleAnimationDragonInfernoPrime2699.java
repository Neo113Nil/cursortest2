package p000createpolar;

import com.adjust.sdk.ILogger;
import com.adjust.sdk.PackageHandler;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageScaleAnimationDragonInfernoPrime2699 implements Runnable {
    public final /* synthetic */ int PolarVoyageItemDecorationUltraDeltaEpic7485;
    public final /* synthetic */ PackageHandler PolarVoyageStrictModeLegendEpic1532;

    public /* synthetic */ PolarVoyageScaleAnimationDragonInfernoPrime2699(PackageHandler packageHandler, int i) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = i;
        this.PolarVoyageStrictModeLegendEpic1532 = packageHandler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ILogger iLogger;
        AtomicBoolean atomicBoolean;
        ILogger iLogger2;
        AtomicBoolean atomicBoolean2;
        int i = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        PackageHandler packageHandler = this.PolarVoyageStrictModeLegendEpic1532;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                packageHandler.initI();
                break;
            case 1:
                packageHandler.sendFirstI();
                break;
            case 2:
                iLogger = packageHandler.logger;
                iLogger.verbose("Package handler can send", new Object[0]);
                atomicBoolean = packageHandler.isSending;
                atomicBoolean.set(false);
                packageHandler.sendFirstPackage();
                break;
            case 3:
                packageHandler.flushI();
                break;
            default:
                iLogger2 = packageHandler.logger;
                iLogger2.verbose("Package handler finished waiting to continue", new Object[0]);
                atomicBoolean2 = packageHandler.isSending;
                atomicBoolean2.set(false);
                packageHandler.sendFirstPackage();
                break;
        }
    }
}
