package p000createpolar;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageToolbarFusionVision5119 implements Iterator, PolarVoyageZipDeltaSpectraRogue6055 {
    public final Object PolarVoyageBottomSheetOmegaNeo1907;
    public final /* synthetic */ int PolarVoyageItemDecorationUltraDeltaEpic7485;
    public Object PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public int PolarVoyageStrictModeLegendEpic1532;

    public PolarVoyageToolbarFusionVision5119(PolarVoyageFirebaseNebulaMasterCosmos1551 polarVoyageFirebaseNebulaMasterCosmos1551) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = 2;
        this.PolarVoyageBottomSheetOmegaNeo1907 = polarVoyageFirebaseNebulaMasterCosmos1551;
        this.PolarVoyageStrictModeLegendEpic1532 = -1;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = PolarVoyagePackageManagerNeoNeoTurbo8097.PolarVoyageStrictModeLegendEpic1532(new PolarVoyageLiveDataEpicHyperion9174(polarVoyageFirebaseNebulaMasterCosmos1551, this, null));
    }

    public void PolarVoyageZipVortexCelestial6185() {
        Object PolarVoyageZipVortexCelestial6185;
        int i = this.PolarVoyageStrictModeLegendEpic1532;
        PolarVoyagePreviewBlazeForce3304 polarVoyagePreviewBlazeForce3304 = (PolarVoyagePreviewBlazeForce3304) this.PolarVoyageBottomSheetOmegaNeo1907;
        if (i == -2) {
            PolarVoyageZipVortexCelestial6185 = ((PolarVoyageFragmentPulseEliteDragon8768) polarVoyagePreviewBlazeForce3304.PolarVoyageMotionLayoutTransitionHeroVision4068).PolarVoyageMotionLayoutTransitionHeroVision4068();
        } else {
            PolarVoyageStateFlowNebulaMax1492 polarVoyageStateFlowNebulaMax1492 = (PolarVoyageStateFlowNebulaMax1492) polarVoyagePreviewBlazeForce3304.PolarVoyageKotlinBetaPulseBeta3653;
            Object obj = this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
            obj.getClass();
            PolarVoyageZipVortexCelestial6185 = polarVoyageStateFlowNebulaMax1492.PolarVoyageZipVortexCelestial6185(obj);
        }
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = PolarVoyageZipVortexCelestial6185;
        this.PolarVoyageStrictModeLegendEpic1532 = PolarVoyageZipVortexCelestial6185 == null ? 0 : 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.PolarVoyageItemDecorationUltraDeltaEpic7485) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (this.PolarVoyageStrictModeLegendEpic1532 < 0) {
                    PolarVoyageZipVortexCelestial6185();
                }
                return this.PolarVoyageStrictModeLegendEpic1532 == 1;
            case 1:
                return ((PolarVoyageContentProviderTitanMaster4320) this.PolarVoyageRotateAnimationCyberCelestialDelta4768).hasNext();
            case 2:
                return ((PolarVoyageContentProviderTitanMaster4320) this.PolarVoyageRotateAnimationCyberCelestialDelta4768).hasNext();
            default:
                return this.PolarVoyageStrictModeLegendEpic1532 < ((Map) this.PolarVoyageBottomSheetOmegaNeo1907).size();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object obj = null;
        switch (this.PolarVoyageItemDecorationUltraDeltaEpic7485) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (this.PolarVoyageStrictModeLegendEpic1532 < 0) {
                    PolarVoyageZipVortexCelestial6185();
                }
                if (this.PolarVoyageStrictModeLegendEpic1532 == 0) {
                    PolarVoyageBroadcastDragonShadowRogue6783.PolarVoyageItemDecorationUltraDeltaEpic7485();
                    return null;
                }
                Object obj2 = this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
                obj2.getClass();
                this.PolarVoyageStrictModeLegendEpic1532 = -1;
                return obj2;
            case 1:
                return ((PolarVoyageContentProviderTitanMaster4320) this.PolarVoyageRotateAnimationCyberCelestialDelta4768).next();
            case 2:
                return ((PolarVoyageContentProviderTitanMaster4320) this.PolarVoyageRotateAnimationCyberCelestialDelta4768).next();
            default:
                if (hasNext()) {
                    obj = this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
                    this.PolarVoyageStrictModeLegendEpic1532++;
                    Object obj3 = ((Map) this.PolarVoyageBottomSheetOmegaNeo1907).get(obj);
                    if (obj3 == null) {
                        throw new ConcurrentModificationException("Hash code of an element (" + obj + ") has changed after it was added to the persistent set.");
                    }
                    this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = ((PolarVoyageOnDeviceTranslatorDragonQuantum5263) obj3).PolarVoyageMotionLayoutTransitionHeroVision4068;
                } else {
                    PolarVoyageBroadcastDragonShadowRogue6783.PolarVoyageItemDecorationUltraDeltaEpic7485();
                }
                return obj;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        Object obj = this.PolarVoyageBottomSheetOmegaNeo1907;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                int i2 = this.PolarVoyageStrictModeLegendEpic1532;
                if (i2 != -1) {
                    ((PolarVoyageExecutorTurboCelestialVortex8767) obj).PolarVoyageStrictModeLegendEpic1532.PolarVoyageItemDecorationUltraDeltaEpic7485(i2);
                    this.PolarVoyageStrictModeLegendEpic1532 = -1;
                    return;
                }
                return;
            case 2:
                int i3 = this.PolarVoyageStrictModeLegendEpic1532;
                if (i3 != -1) {
                    ((PolarVoyageFirebaseNebulaMasterCosmos1551) obj).PolarVoyageStrictModeLegendEpic1532.PolarVoyageViewRogueMaster4778(i3);
                    this.PolarVoyageStrictModeLegendEpic1532 = -1;
                    return;
                }
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public PolarVoyageToolbarFusionVision5119(PolarVoyagePreviewBlazeForce3304 polarVoyagePreviewBlazeForce3304) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = 0;
        this.PolarVoyageBottomSheetOmegaNeo1907 = polarVoyagePreviewBlazeForce3304;
        this.PolarVoyageStrictModeLegendEpic1532 = -2;
    }

    public PolarVoyageToolbarFusionVision5119(Object obj, Map map) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = 3;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = obj;
        this.PolarVoyageBottomSheetOmegaNeo1907 = map;
    }

    public PolarVoyageToolbarFusionVision5119(PolarVoyageExecutorTurboCelestialVortex8767 polarVoyageExecutorTurboCelestialVortex8767) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = 1;
        this.PolarVoyageBottomSheetOmegaNeo1907 = polarVoyageExecutorTurboCelestialVortex8767;
        this.PolarVoyageStrictModeLegendEpic1532 = -1;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = PolarVoyagePackageManagerNeoNeoTurbo8097.PolarVoyageStrictModeLegendEpic1532(new PolarVoyageDisplayMetricsNebulaThunder2599(polarVoyageExecutorTurboCelestialVortex8767, this, null));
    }
}
