package p000createpolar;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Iterator;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public class PolarVoyageProximitySensorHyperBlaze3823 implements Iterator, PolarVoyageZipDeltaSpectraRogue6055 {
    public final /* synthetic */ int PolarVoyageItemDecorationUltraDeltaEpic7485;
    public final Object PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public int PolarVoyageStrictModeLegendEpic1532;

    public PolarVoyageProximitySensorHyperBlaze3823(PolarVoyageMagnetometerUltraTitan7592 polarVoyageMagnetometerUltraTitan7592) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = 3;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = polarVoyageMagnetometerUltraTitan7592.PolarVoyageZipVortexCelestial6185.iterator();
        this.PolarVoyageStrictModeLegendEpic1532 = polarVoyageMagnetometerUltraTitan7592.PolarVoyageMotionLayoutTransitionHeroVision4068;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        Object obj = this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return this.PolarVoyageStrictModeLegendEpic1532 < ((PolarVoyageGeocoderMasterHyperHyperion4028) obj).PolarVoyageZipVortexCelestial6185();
            case 1:
                return this.PolarVoyageStrictModeLegendEpic1532 < ((byte[]) obj).length;
            case 2:
                return this.PolarVoyageStrictModeLegendEpic1532 < ((Object[]) obj).length;
            case 3:
                Iterator it = (Iterator) obj;
                while (this.PolarVoyageStrictModeLegendEpic1532 > 0 && it.hasNext()) {
                    it.next();
                    this.PolarVoyageStrictModeLegendEpic1532--;
                }
                return it.hasNext();
            default:
                return this.PolarVoyageStrictModeLegendEpic1532 < ((PolarVoyageOnTouchListenerPrimePixelLegend8920) obj).PolarVoyageBitmapVisionAuroraPixel4705();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        Object obj = this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (!hasNext()) {
                    PolarVoyageBroadcastDragonShadowRogue6783.PolarVoyageItemDecorationUltraDeltaEpic7485();
                    return null;
                }
                int i2 = this.PolarVoyageStrictModeLegendEpic1532;
                this.PolarVoyageStrictModeLegendEpic1532 = i2 + 1;
                return ((PolarVoyageGeocoderMasterHyperHyperion4028) obj).get(i2);
            case 1:
                try {
                    int i3 = this.PolarVoyageStrictModeLegendEpic1532;
                    this.PolarVoyageStrictModeLegendEpic1532 = i3 + 1;
                    return Byte.valueOf(((byte[]) obj)[i3]);
                } catch (ArrayIndexOutOfBoundsException e) {
                    this.PolarVoyageStrictModeLegendEpic1532--;
                    PolarVoyageCamera2MasterPulse1881.PolarVoyageStrictModeLegendEpic1532(e.getMessage());
                    return null;
                }
            case 2:
                try {
                    int i4 = this.PolarVoyageStrictModeLegendEpic1532;
                    this.PolarVoyageStrictModeLegendEpic1532 = i4 + 1;
                    return ((Object[]) obj)[i4];
                } catch (ArrayIndexOutOfBoundsException e2) {
                    this.PolarVoyageStrictModeLegendEpic1532--;
                    PolarVoyageCamera2MasterPulse1881.PolarVoyageStrictModeLegendEpic1532(e2.getMessage());
                    return null;
                }
            case 3:
                Iterator it = (Iterator) obj;
                while (this.PolarVoyageStrictModeLegendEpic1532 > 0 && it.hasNext()) {
                    it.next();
                    this.PolarVoyageStrictModeLegendEpic1532--;
                }
                return it.next();
            default:
                int i5 = this.PolarVoyageStrictModeLegendEpic1532;
                this.PolarVoyageStrictModeLegendEpic1532 = i5 + 1;
                return ((PolarVoyageOnTouchListenerPrimePixelLegend8920) obj).PolarVoyageDiffUtilTurboStrike5735(i5);
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.PolarVoyageItemDecorationUltraDeltaEpic7485) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 3:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public PolarVoyageProximitySensorHyperBlaze3823(Object[] objArr) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = 2;
        objArr.getClass();
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = objArr;
    }

    public /* synthetic */ PolarVoyageProximitySensorHyperBlaze3823(int i, Object obj) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = i;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = obj;
    }
}
