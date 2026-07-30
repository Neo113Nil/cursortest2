package p000createpolar;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageNestedScrollViewDeltaCelestialDragon6920 implements PolarVoyageBroadcastNovaXNeoBeta8993 {
    public final PolarVoyageDisplayMetricsStormGamma6514 PolarVoyageItemDecorationUltraDeltaEpic7485;
    private volatile /* synthetic */ Object _exceptionsHolder$volatile;
    private volatile /* synthetic */ int _isCompleting$volatile = 0;
    private volatile /* synthetic */ Object _rootCause$volatile;
    public static final /* synthetic */ AtomicIntegerFieldUpdater PolarVoyageStrictModeLegendEpic1532 = AtomicIntegerFieldUpdater.newUpdater(PolarVoyageNestedScrollViewDeltaCelestialDragon6920.class, "_isCompleting$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater PolarVoyageRotateAnimationCyberCelestialDelta4768 = AtomicReferenceFieldUpdater.newUpdater(PolarVoyageNestedScrollViewDeltaCelestialDragon6920.class, Object.class, "_rootCause$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater PolarVoyageBottomSheetOmegaNeo1907 = AtomicReferenceFieldUpdater.newUpdater(PolarVoyageNestedScrollViewDeltaCelestialDragon6920.class, Object.class, "_exceptionsHolder$volatile");

    public PolarVoyageNestedScrollViewDeltaCelestialDragon6920(PolarVoyageDisplayMetricsStormGamma6514 polarVoyageDisplayMetricsStormGamma6514, Throwable th) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = polarVoyageDisplayMetricsStormGamma6514;
        this._rootCause$volatile = th;
    }

    @Override // p000createpolar.PolarVoyageBroadcastNovaXNeoBeta8993
    public final PolarVoyageDisplayMetricsStormGamma6514 PolarVoyageBarcodeScannerInfernoSolarSpark7767() {
        return this.PolarVoyageItemDecorationUltraDeltaEpic7485;
    }

    public final boolean PolarVoyageBitmapVisionAuroraPixel4705() {
        return PolarVoyageKotlinBetaPulseBeta3653() != null;
    }

    public final ArrayList PolarVoyageDiffUtilTurboStrike5735(Throwable th) {
        ArrayList arrayList;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = PolarVoyageBottomSheetOmegaNeo1907;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if (obj == null) {
            arrayList = new ArrayList(4);
        } else if (obj instanceof Throwable) {
            ArrayList arrayList2 = new ArrayList(4);
            arrayList2.add(obj);
            arrayList = arrayList2;
        } else {
            if (!(obj instanceof ArrayList)) {
                PolarVoyageMeteringPointSolarMax4741.PolarVoyageBarcodeScannerInfernoSolarSpark7767(obj, "State is ");
                return null;
            }
            arrayList = (ArrayList) obj;
        }
        Throwable PolarVoyageKotlinBetaPulseBeta3653 = PolarVoyageKotlinBetaPulseBeta3653();
        if (PolarVoyageKotlinBetaPulseBeta3653 != null) {
            arrayList.add(0, PolarVoyageKotlinBetaPulseBeta3653);
        }
        if (th != null && !th.equals(PolarVoyageKotlinBetaPulseBeta3653)) {
            arrayList.add(th);
        }
        atomicReferenceFieldUpdater.set(this, PolarVoyageRewardedAdPixelMaxEclipse6420.PolarVoyageItemDecorationUltraDeltaEpic7485);
        return arrayList;
    }

    public final Throwable PolarVoyageKotlinBetaPulseBeta3653() {
        return (Throwable) PolarVoyageRotateAnimationCyberCelestialDelta4768.get(this);
    }

    @Override // p000createpolar.PolarVoyageBroadcastNovaXNeoBeta8993
    public final boolean PolarVoyageMotionLayoutTransitionHeroVision4068() {
        return PolarVoyageKotlinBetaPulseBeta3653() == null;
    }

    public final void PolarVoyageZipVortexCelestial6185(Throwable th) {
        Throwable PolarVoyageKotlinBetaPulseBeta3653 = PolarVoyageKotlinBetaPulseBeta3653();
        if (PolarVoyageKotlinBetaPulseBeta3653 == null) {
            PolarVoyageRotateAnimationCyberCelestialDelta4768.set(this, th);
            return;
        }
        if (th == PolarVoyageKotlinBetaPulseBeta3653) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = PolarVoyageBottomSheetOmegaNeo1907;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if (obj == null) {
            atomicReferenceFieldUpdater.set(this, th);
            return;
        }
        if (!(obj instanceof Throwable)) {
            if (obj instanceof ArrayList) {
                ((ArrayList) obj).add(th);
                return;
            } else {
                PolarVoyageMeteringPointSolarMax4741.PolarVoyageBarcodeScannerInfernoSolarSpark7767(obj, "State is ");
                return;
            }
        }
        if (th == obj) {
            return;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(th);
        atomicReferenceFieldUpdater.set(this, arrayList);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Finishing[cancelling=");
        sb.append(PolarVoyageBitmapVisionAuroraPixel4705());
        sb.append(", completing=");
        sb.append(PolarVoyageStrictModeLegendEpic1532.get(this) == 1);
        sb.append(", rootCause=");
        sb.append(PolarVoyageKotlinBetaPulseBeta3653());
        sb.append(", exceptions=");
        sb.append(PolarVoyageBottomSheetOmegaNeo1907.get(this));
        sb.append(", list=");
        sb.append(this.PolarVoyageItemDecorationUltraDeltaEpic7485);
        sb.append(']');
        return sb.toString();
    }
}
