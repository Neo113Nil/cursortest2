package p000createpolar;

import android.content.Context;
import android.os.Handler;
import com.adjust.sdk.AdjustTimeoutCallback;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ArrayList;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageTransitionManagerStrikeRogueSpark2628 implements Runnable {
    public final /* synthetic */ Context PolarVoyageBottomSheetOmegaNeo1907;
    public final /* synthetic */ int PolarVoyageItemDecorationUltraDeltaEpic7485;
    public final /* synthetic */ ArrayList PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public final /* synthetic */ AdjustTimeoutCallback PolarVoyageStrictModeLegendEpic1532;

    public /* synthetic */ PolarVoyageTransitionManagerStrikeRogueSpark2628(AdjustTimeoutCallback adjustTimeoutCallback, ArrayList arrayList, Context context, int i) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = i;
        this.PolarVoyageStrictModeLegendEpic1532 = adjustTimeoutCallback;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = arrayList;
        this.PolarVoyageBottomSheetOmegaNeo1907 = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.PolarVoyageItemDecorationUltraDeltaEpic7485) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (this.PolarVoyageStrictModeLegendEpic1532.getOnAdidReadListener() != null) {
                    synchronized (this.PolarVoyageRotateAnimationCyberCelestialDelta4768) {
                        this.PolarVoyageRotateAnimationCyberCelestialDelta4768.remove(this.PolarVoyageStrictModeLegendEpic1532);
                    }
                    new Handler(this.PolarVoyageBottomSheetOmegaNeo1907.getMainLooper()).post(new PolarVoyageDialogSolarMaster1422(0, this));
                    return;
                }
                return;
            default:
                if (this.PolarVoyageStrictModeLegendEpic1532.getOnAttributionReadListener() != null) {
                    synchronized (this.PolarVoyageRotateAnimationCyberCelestialDelta4768) {
                        this.PolarVoyageRotateAnimationCyberCelestialDelta4768.remove(this.PolarVoyageStrictModeLegendEpic1532);
                    }
                    new Handler(this.PolarVoyageBottomSheetOmegaNeo1907.getMainLooper()).post(new PolarVoyageDialogSolarMaster1422(1, this));
                    return;
                }
                return;
        }
    }
}
