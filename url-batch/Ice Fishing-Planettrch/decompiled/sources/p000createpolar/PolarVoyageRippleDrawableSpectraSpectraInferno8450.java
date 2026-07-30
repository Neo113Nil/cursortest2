package p000createpolar;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageRippleDrawableSpectraSpectraInferno8450 extends PolarVoyageOnGlobalLayoutListenerBetaDragon6697 {
    public final Object PolarVoyageBottomSheetOmegaNeo1907;
    public final /* synthetic */ int PolarVoyageRotateAnimationCyberCelestialDelta4768 = 1;

    public PolarVoyageRippleDrawableSpectraSpectraInferno8450(Object[] objArr, int i, int i2) {
        super(i, i2);
        this.PolarVoyageBottomSheetOmegaNeo1907 = objArr;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i = this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        Object obj = this.PolarVoyageBottomSheetOmegaNeo1907;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (!hasNext()) {
                    PolarVoyageBroadcastDragonShadowRogue6783.PolarVoyageItemDecorationUltraDeltaEpic7485();
                    break;
                } else {
                    int i2 = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
                    this.PolarVoyageItemDecorationUltraDeltaEpic7485 = i2 + 1;
                    break;
                }
            default:
                if (!hasNext()) {
                    PolarVoyageBroadcastDragonShadowRogue6783.PolarVoyageItemDecorationUltraDeltaEpic7485();
                    break;
                } else {
                    this.PolarVoyageItemDecorationUltraDeltaEpic7485++;
                    break;
                }
        }
        return null;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        int i = this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        Object obj = this.PolarVoyageBottomSheetOmegaNeo1907;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (!hasPrevious()) {
                    PolarVoyageBroadcastDragonShadowRogue6783.PolarVoyageItemDecorationUltraDeltaEpic7485();
                    break;
                } else {
                    int i2 = this.PolarVoyageItemDecorationUltraDeltaEpic7485 - 1;
                    this.PolarVoyageItemDecorationUltraDeltaEpic7485 = i2;
                    break;
                }
            default:
                if (!hasPrevious()) {
                    PolarVoyageBroadcastDragonShadowRogue6783.PolarVoyageItemDecorationUltraDeltaEpic7485();
                    break;
                } else {
                    this.PolarVoyageItemDecorationUltraDeltaEpic7485--;
                    break;
                }
        }
        return null;
    }

    public PolarVoyageRippleDrawableSpectraSpectraInferno8450(int i, Object obj) {
        super(i, 1);
        this.PolarVoyageBottomSheetOmegaNeo1907 = obj;
    }
}
