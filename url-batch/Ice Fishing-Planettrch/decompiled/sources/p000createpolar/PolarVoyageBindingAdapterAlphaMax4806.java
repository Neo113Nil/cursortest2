package p000createpolar;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Iterator;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageBindingAdapterAlphaMax4806 extends PolarVoyageCoroutineAuroraSolar8718 {
    public final Iterator PolarVoyageBottomSheetOmegaNeo1907;
    public int PolarVoyageItemDecorationUltraDeltaEpic7485;
    public final /* synthetic */ int PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public Object PolarVoyageStrictModeLegendEpic1532;
    public final /* synthetic */ Object PolarVoyageViewRogueMaster4778;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PolarVoyageBindingAdapterAlphaMax4806(PolarVoyageAdapterBlazeSpectra6030 polarVoyageAdapterBlazeSpectra6030) {
        this();
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = 1;
        this.PolarVoyageViewRogueMaster4778 = polarVoyageAdapterBlazeSpectra6030;
        this.PolarVoyageBottomSheetOmegaNeo1907 = polarVoyageAdapterBlazeSpectra6030.PolarVoyageItemDecorationUltraDeltaEpic7485.iterator();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        Object next;
        PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageFCMCelestialCosmosPixel3711(this.PolarVoyageItemDecorationUltraDeltaEpic7485 != 4);
        int PolarVoyageLooperThreadAlphaPrime1279 = PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageLooperThreadAlphaPrime1279(this.PolarVoyageItemDecorationUltraDeltaEpic7485);
        if (PolarVoyageLooperThreadAlphaPrime1279 == 0) {
            return true;
        }
        if (PolarVoyageLooperThreadAlphaPrime1279 != 2) {
            this.PolarVoyageItemDecorationUltraDeltaEpic7485 = 4;
            int i = this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
            Object obj = null;
            Object obj2 = this.PolarVoyageViewRogueMaster4778;
            Iterator it = this.PolarVoyageBottomSheetOmegaNeo1907;
            switch (i) {
                case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                    while (it.hasNext()) {
                        next = it.next();
                        if (((PolarVoyageTypefaceNebulaAurora4762) obj2).apply(next)) {
                            obj = next;
                            break;
                        }
                    }
                    this.PolarVoyageItemDecorationUltraDeltaEpic7485 = 3;
                    break;
                default:
                    while (it.hasNext()) {
                        next = it.next();
                        if (((PolarVoyageAdapterBlazeSpectra6030) obj2).PolarVoyageStrictModeLegendEpic1532.contains(next)) {
                            obj = next;
                            break;
                        }
                    }
                    this.PolarVoyageItemDecorationUltraDeltaEpic7485 = 3;
                    break;
            }
            this.PolarVoyageStrictModeLegendEpic1532 = obj;
            if (this.PolarVoyageItemDecorationUltraDeltaEpic7485 != 3) {
                this.PolarVoyageItemDecorationUltraDeltaEpic7485 = 1;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            PolarVoyageBroadcastDragonShadowRogue6783.PolarVoyageItemDecorationUltraDeltaEpic7485();
            return null;
        }
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = 2;
        Object obj = this.PolarVoyageStrictModeLegendEpic1532;
        this.PolarVoyageStrictModeLegendEpic1532 = null;
        return obj;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PolarVoyageBindingAdapterAlphaMax4806(Iterator it, PolarVoyageTypefaceNebulaAurora4762 polarVoyageTypefaceNebulaAurora4762) {
        this();
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = 0;
        this.PolarVoyageBottomSheetOmegaNeo1907 = it;
        this.PolarVoyageViewRogueMaster4778 = polarVoyageTypefaceNebulaAurora4762;
    }

    public PolarVoyageBindingAdapterAlphaMax4806() {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = 2;
    }
}
