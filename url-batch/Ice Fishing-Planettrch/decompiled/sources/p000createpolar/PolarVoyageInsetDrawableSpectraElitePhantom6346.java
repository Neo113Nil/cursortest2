package p000createpolar;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Iterator;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageInsetDrawableSpectraElitePhantom6346 implements Iterator, PolarVoyageZipDeltaSpectraRogue6055 {
    public final /* synthetic */ int PolarVoyageBottomSheetOmegaNeo1907;
    public int PolarVoyageItemDecorationUltraDeltaEpic7485;
    public boolean PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public int PolarVoyageStrictModeLegendEpic1532;
    public final /* synthetic */ Object PolarVoyageViewRogueMaster4778;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PolarVoyageInsetDrawableSpectraElitePhantom6346(PolarVoyageContentObserverThunderOmega9101 polarVoyageContentObserverThunderOmega9101, int i) {
        this(polarVoyageContentObserverThunderOmega9101.PolarVoyageRotateAnimationCyberCelestialDelta4768);
        this.PolarVoyageBottomSheetOmegaNeo1907 = i;
        switch (i) {
            case 1:
                this.PolarVoyageViewRogueMaster4778 = polarVoyageContentObserverThunderOmega9101;
                this(polarVoyageContentObserverThunderOmega9101.PolarVoyageRotateAnimationCyberCelestialDelta4768);
                break;
            default:
                this.PolarVoyageViewRogueMaster4778 = polarVoyageContentObserverThunderOmega9101;
                break;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.PolarVoyageStrictModeLegendEpic1532 < this.PolarVoyageItemDecorationUltraDeltaEpic7485;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object PolarVoyageBitmapVisionAuroraPixel4705;
        if (!hasNext()) {
            PolarVoyageBroadcastDragonShadowRogue6783.PolarVoyageItemDecorationUltraDeltaEpic7485();
            return null;
        }
        int i = this.PolarVoyageStrictModeLegendEpic1532;
        int i2 = this.PolarVoyageBottomSheetOmegaNeo1907;
        Object obj = this.PolarVoyageViewRogueMaster4778;
        switch (i2) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                PolarVoyageBitmapVisionAuroraPixel4705 = ((PolarVoyageContentObserverThunderOmega9101) obj).PolarVoyageBitmapVisionAuroraPixel4705(i);
                break;
            case 1:
                PolarVoyageBitmapVisionAuroraPixel4705 = ((PolarVoyageContentObserverThunderOmega9101) obj).PolarVoyageItemDecorationUltraDeltaEpic7485(i);
                break;
            default:
                PolarVoyageBitmapVisionAuroraPixel4705 = ((PolarVoyageLayoutInflaterTitaniumMaxSolar6862) obj).PolarVoyageStrictModeLegendEpic1532[i];
                break;
        }
        this.PolarVoyageStrictModeLegendEpic1532++;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = true;
        return PolarVoyageBitmapVisionAuroraPixel4705;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.PolarVoyageRotateAnimationCyberCelestialDelta4768) {
            PolarVoyageCamera2MasterPulse1881.PolarVoyageCameraPixelBlaze2629("Call next() before removing an element.");
            return;
        }
        int i = this.PolarVoyageStrictModeLegendEpic1532 - 1;
        this.PolarVoyageStrictModeLegendEpic1532 = i;
        int i2 = this.PolarVoyageBottomSheetOmegaNeo1907;
        Object obj = this.PolarVoyageViewRogueMaster4778;
        switch (i2) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((PolarVoyageContentObserverThunderOmega9101) obj).PolarVoyageDiffUtilTurboStrike5735(i);
                break;
            case 1:
                ((PolarVoyageContentObserverThunderOmega9101) obj).PolarVoyageDiffUtilTurboStrike5735(i);
                break;
            default:
                ((PolarVoyageLayoutInflaterTitaniumMaxSolar6862) obj).PolarVoyageZipVortexCelestial6185(i);
                break;
        }
        this.PolarVoyageItemDecorationUltraDeltaEpic7485--;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PolarVoyageInsetDrawableSpectraElitePhantom6346(PolarVoyageLayoutInflaterTitaniumMaxSolar6862 polarVoyageLayoutInflaterTitaniumMaxSolar6862) {
        this(polarVoyageLayoutInflaterTitaniumMaxSolar6862.PolarVoyageRotateAnimationCyberCelestialDelta4768);
        this.PolarVoyageBottomSheetOmegaNeo1907 = 2;
        this.PolarVoyageViewRogueMaster4778 = polarVoyageLayoutInflaterTitaniumMaxSolar6862;
    }

    public PolarVoyageInsetDrawableSpectraElitePhantom6346(int i) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = i;
    }
}
