package p000createpolar;

import android.os.HandlerThread;
import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final /* synthetic */ class PolarVoyageButtonSpeedOlympianMax7598 implements PolarVoyageKaptTitanBlaze4844 {
    public final /* synthetic */ int PolarVoyageItemDecorationUltraDeltaEpic7485;
    public final /* synthetic */ int PolarVoyageStrictModeLegendEpic1532;

    public /* synthetic */ PolarVoyageButtonSpeedOlympianMax7598(int i, int i2) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = i2;
        this.PolarVoyageStrictModeLegendEpic1532 = i;
    }

    @Override // p000createpolar.PolarVoyageKaptTitanBlaze4844
    public final Object get() {
        int i = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        int i2 = this.PolarVoyageStrictModeLegendEpic1532;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new HandlerThread(PolarVoyageVectorDrawableTitaniumStorm2009.PolarVoyageCameraPixelBlaze2629("ExoPlayer:MediaCodecAsyncAdapter:", i2));
            default:
                return new HandlerThread(PolarVoyageVectorDrawableTitaniumStorm2009.PolarVoyageCameraPixelBlaze2629("ExoPlayer:MediaCodecQueueingThread:", i2));
        }
    }
}
