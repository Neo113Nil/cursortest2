package p000createpolar;

import android.content.Context;
import android.os.Handler;
import com.adjust.sdk.ActivityHandler;
import com.adjust.sdk.AdjustAttribution;
import com.adjust.sdk.AdjustInstance;
import com.adjust.sdk.OnAdidReadListener;
import com.adjust.sdk.OnAttributionReadListener;
import com.adjust.sdk.Util;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ArrayList;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageFCMThunderTitanium2442 implements Runnable {
    public final /* synthetic */ AdjustInstance PolarVoyageBottomSheetOmegaNeo1907;
    public final /* synthetic */ int PolarVoyageItemDecorationUltraDeltaEpic7485;
    public final /* synthetic */ long PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public final /* synthetic */ Context PolarVoyageStrictModeLegendEpic1532;
    public final /* synthetic */ Object PolarVoyageViewRogueMaster4778;

    public /* synthetic */ PolarVoyageFCMThunderTitanium2442(AdjustInstance adjustInstance, Context context, Object obj, long j, int i) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = i;
        this.PolarVoyageBottomSheetOmegaNeo1907 = adjustInstance;
        this.PolarVoyageStrictModeLegendEpic1532 = context;
        this.PolarVoyageViewRogueMaster4778 = obj;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList;
        ArrayList arrayList2;
        int i = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        AdjustInstance adjustInstance = this.PolarVoyageBottomSheetOmegaNeo1907;
        Object obj = this.PolarVoyageViewRogueMaster4778;
        long j = this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        Context context = this.PolarVoyageStrictModeLegendEpic1532;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                String adidFromActivityStateFile = Util.getAdidFromActivityStateFile(context);
                if (adidFromActivityStateFile == null) {
                    arrayList = adjustInstance.cachedAdidReadTimeoutCallbacks;
                    ActivityHandler.queueGetAdidWithTimeout(j, (OnAdidReadListener) obj, arrayList, context);
                    break;
                } else {
                    new Handler(context.getMainLooper()).post(new PolarVoyageFaceDetectionPrimeUltraPhoenix9679(9, this, adidFromActivityStateFile));
                    break;
                }
            default:
                AdjustAttribution attributionFromAttributionFile = Util.getAttributionFromAttributionFile(context);
                if (attributionFromAttributionFile == null) {
                    arrayList2 = adjustInstance.cachedAttributionReadTimeoutCallbacks;
                    ActivityHandler.queueGetAttributionWithTimeout(j, (OnAttributionReadListener) obj, arrayList2, context);
                    break;
                } else {
                    new Handler(context.getMainLooper()).post(new PolarVoyageFaceDetectionPrimeUltraPhoenix9679(10, this, attributionFromAttributionFile));
                    break;
                }
        }
    }
}
