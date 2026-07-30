package p000createpolar;

import android.os.Process;
import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageLooperThreadNovaSolar2749 implements Runnable {
    public final /* synthetic */ int PolarVoyageItemDecorationUltraDeltaEpic7485;
    public final Runnable PolarVoyageStrictModeLegendEpic1532;

    public /* synthetic */ PolarVoyageLooperThreadNovaSolar2749(Runnable runnable, int i) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = i;
        this.PolarVoyageStrictModeLegendEpic1532 = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        Runnable runnable = this.PolarVoyageStrictModeLegendEpic1532;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                try {
                    runnable.run();
                    break;
                } catch (Exception e) {
                    PolarVoyageFlatMapSolarShadowAlpha5929.PolarVoyageNavigationViewHyperHyperHyperion1793("Executor", "Background execution failure.", e);
                    return;
                }
            case 1:
                runnable.run();
                break;
            default:
                Process.setThreadPriority(0);
                runnable.run();
                break;
        }
    }

    public String toString() {
        switch (this.PolarVoyageItemDecorationUltraDeltaEpic7485) {
            case 1:
                return this.PolarVoyageStrictModeLegendEpic1532.toString();
            default:
                return super.toString();
        }
    }
}
