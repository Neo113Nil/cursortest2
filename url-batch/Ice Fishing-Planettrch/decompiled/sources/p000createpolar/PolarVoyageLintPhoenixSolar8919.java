package p000createpolar;

import android.media.MediaCodec;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final /* synthetic */ class PolarVoyageLintPhoenixSolar8919 implements MediaCodec.OnFrameRenderedListener {
    public final /* synthetic */ PolarVoyagePreviewDragonShadowForce2497 PolarVoyageMotionLayoutTransitionHeroVision4068;
    public final /* synthetic */ int PolarVoyageZipVortexCelestial6185;

    public /* synthetic */ PolarVoyageLintPhoenixSolar8919(PolarVoyageAdMobForceVortexBeta7549 polarVoyageAdMobForceVortexBeta7549, PolarVoyagePreviewDragonShadowForce2497 polarVoyagePreviewDragonShadowForce2497, int i) {
        this.PolarVoyageZipVortexCelestial6185 = i;
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = polarVoyagePreviewDragonShadowForce2497;
    }

    @Override // android.media.MediaCodec.OnFrameRenderedListener
    public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
        int i = this.PolarVoyageZipVortexCelestial6185;
        PolarVoyagePreviewDragonShadowForce2497 polarVoyagePreviewDragonShadowForce2497 = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                Handler handler = polarVoyagePreviewDragonShadowForce2497.PolarVoyageItemDecorationUltraDeltaEpic7485;
                if (Build.VERSION.SDK_INT >= 30) {
                    polarVoyagePreviewDragonShadowForce2497.PolarVoyageZipVortexCelestial6185(j);
                    break;
                } else {
                    handler.sendMessageAtFrontOfQueue(Message.obtain(handler, 0, (int) (j >> 32), (int) j));
                    break;
                }
            default:
                Handler handler2 = polarVoyagePreviewDragonShadowForce2497.PolarVoyageItemDecorationUltraDeltaEpic7485;
                if (Build.VERSION.SDK_INT >= 30) {
                    polarVoyagePreviewDragonShadowForce2497.PolarVoyageZipVortexCelestial6185(j);
                    break;
                } else {
                    handler2.sendMessageAtFrontOfQueue(Message.obtain(handler2, 0, (int) (j >> 32), (int) j));
                    break;
                }
        }
    }
}
