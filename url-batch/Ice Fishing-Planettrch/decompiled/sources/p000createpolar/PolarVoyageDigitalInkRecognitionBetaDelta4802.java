package p000createpolar;

import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageDigitalInkRecognitionBetaDelta4802 implements RandomAccess {
    public Object[] PolarVoyageItemDecorationUltraDeltaEpic7485;
    public int PolarVoyageRotateAnimationCyberCelestialDelta4768 = 0;
    public PolarVoyageViewBindingHyperionHero4054 PolarVoyageStrictModeLegendEpic1532;

    public PolarVoyageDigitalInkRecognitionBetaDelta4802(Object[] objArr) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = objArr;
    }

    public final void PolarVoyageBarcodeScannerInfernoSolarSpark7767(int i, List list) {
        if (list.isEmpty()) {
            return;
        }
        int size = list.size();
        int i2 = this.PolarVoyageRotateAnimationCyberCelestialDelta4768 + size;
        if (this.PolarVoyageItemDecorationUltraDeltaEpic7485.length < i2) {
            PolarVoyageCameraPixelBlaze2629(i2);
        }
        Object[] objArr = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        int i3 = this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        if (i != i3) {
            System.arraycopy(objArr, i, objArr, i + size, i3 - i);
        }
        int size2 = list.size();
        for (int i4 = 0; i4 < size2; i4++) {
            objArr[i + i4] = list.get(i4);
        }
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 += size;
    }

    public final boolean PolarVoyageBitmapVisionAuroraPixel4705(int i, Collection collection) {
        int i2 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        int size = collection.size();
        int i3 = this.PolarVoyageRotateAnimationCyberCelestialDelta4768 + size;
        if (this.PolarVoyageItemDecorationUltraDeltaEpic7485.length < i3) {
            PolarVoyageCameraPixelBlaze2629(i3);
        }
        Object[] objArr = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        int i4 = this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        if (i != i4) {
            System.arraycopy(objArr, i, objArr, i + size, i4 - i);
        }
        for (Object obj : collection) {
            int i5 = i2 + 1;
            if (i2 < 0) {
                PolarVoyageDrawableCompatNebulaTitanNeo6818.PolarVoyageOnPreDrawListenerNovaCelestialDragon7415();
                throw null;
            }
            objArr[i2 + i] = obj;
            i2 = i5;
        }
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 += size;
        return true;
    }

    public final Object PolarVoyageBottomSheetOmegaNeo1907(int i) {
        Object[] objArr = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        Object obj = objArr[i];
        int i2 = this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        if (i != i2 - 1) {
            int i3 = i + 1;
            System.arraycopy(objArr, i3, objArr, i, i2 - i3);
        }
        int i4 = this.PolarVoyageRotateAnimationCyberCelestialDelta4768 - 1;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = i4;
        objArr[i4] = null;
        return obj;
    }

    public final void PolarVoyageCameraPixelBlaze2629(int i) {
        Object[] objArr = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        int length = objArr.length;
        Object[] objArr2 = new Object[Math.max(i, length * 2)];
        System.arraycopy(objArr, 0, objArr2, 0, length);
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = objArr2;
    }

    public final List PolarVoyageDiffUtilTurboStrike5735() {
        PolarVoyageViewBindingHyperionHero4054 polarVoyageViewBindingHyperionHero4054 = this.PolarVoyageStrictModeLegendEpic1532;
        if (polarVoyageViewBindingHyperionHero4054 != null) {
            return polarVoyageViewBindingHyperionHero4054;
        }
        PolarVoyageViewBindingHyperionHero4054 polarVoyageViewBindingHyperionHero40542 = new PolarVoyageViewBindingHyperionHero4054(this);
        this.PolarVoyageStrictModeLegendEpic1532 = polarVoyageViewBindingHyperionHero40542;
        return polarVoyageViewBindingHyperionHero40542;
    }

    public final boolean PolarVoyageItemDecorationUltraDeltaEpic7485(Object obj) {
        int i = this.PolarVoyageRotateAnimationCyberCelestialDelta4768 - 1;
        if (i >= 0) {
            for (int i2 = 0; !PolarVoyageR8VisionOmegaNebula9943.PolarVoyageItemDecorationUltraDeltaEpic7485(this.PolarVoyageItemDecorationUltraDeltaEpic7485[i2], obj); i2++) {
                if (i2 != i) {
                }
            }
            return true;
        }
        return false;
    }

    public final void PolarVoyageKotlinBetaPulseBeta3653(int i, PolarVoyageDigitalInkRecognitionBetaDelta4802 polarVoyageDigitalInkRecognitionBetaDelta4802) {
        int i2 = polarVoyageDigitalInkRecognitionBetaDelta4802.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        if (i2 == 0) {
            return;
        }
        int i3 = this.PolarVoyageRotateAnimationCyberCelestialDelta4768 + i2;
        if (this.PolarVoyageItemDecorationUltraDeltaEpic7485.length < i3) {
            PolarVoyageCameraPixelBlaze2629(i3);
        }
        Object[] objArr = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        int i4 = this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        if (i != i4) {
            System.arraycopy(objArr, i, objArr, i + i2, i4 - i);
        }
        System.arraycopy(polarVoyageDigitalInkRecognitionBetaDelta4802.PolarVoyageItemDecorationUltraDeltaEpic7485, 0, objArr, i, i2);
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 += i2;
    }

    public final void PolarVoyageMotionLayoutTransitionHeroVision4068(Object obj) {
        int i = this.PolarVoyageRotateAnimationCyberCelestialDelta4768 + 1;
        if (this.PolarVoyageItemDecorationUltraDeltaEpic7485.length < i) {
            PolarVoyageCameraPixelBlaze2629(i);
        }
        Object[] objArr = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        int i2 = this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        objArr[i2] = obj;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = i2 + 1;
    }

    public final boolean PolarVoyageRotateAnimationCyberCelestialDelta4768(Object obj) {
        int PolarVoyageStrictModeLegendEpic1532 = PolarVoyageStrictModeLegendEpic1532(obj);
        if (PolarVoyageStrictModeLegendEpic1532 < 0) {
            return false;
        }
        PolarVoyageBottomSheetOmegaNeo1907(PolarVoyageStrictModeLegendEpic1532);
        return true;
    }

    public final int PolarVoyageStrictModeLegendEpic1532(Object obj) {
        Object[] objArr = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        int i = this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        for (int i2 = 0; i2 < i; i2++) {
            if (PolarVoyageR8VisionOmegaNebula9943.PolarVoyageItemDecorationUltraDeltaEpic7485(obj, objArr[i2])) {
                return i2;
            }
        }
        return -1;
    }

    public final void PolarVoyageTextInputEditTextNebulaHero6651() {
        Object[] objArr = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        int i = this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = 0;
    }

    public final void PolarVoyageViewRogueMaster4778(int i, int i2) {
        if (i2 > i) {
            int i3 = this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
            if (i2 < i3) {
                Object[] objArr = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
                System.arraycopy(objArr, i2, objArr, i, i3 - i2);
            }
            int i4 = this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
            int i5 = i4 - (i2 - i);
            int i6 = i4 - 1;
            if (i5 <= i6) {
                int i7 = i5;
                while (true) {
                    this.PolarVoyageItemDecorationUltraDeltaEpic7485[i7] = null;
                    if (i7 == i6) {
                        break;
                    } else {
                        i7++;
                    }
                }
            }
            this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = i5;
        }
    }

    public final void PolarVoyageZipVortexCelestial6185(int i, Object obj) {
        int i2 = this.PolarVoyageRotateAnimationCyberCelestialDelta4768 + 1;
        if (this.PolarVoyageItemDecorationUltraDeltaEpic7485.length < i2) {
            PolarVoyageCameraPixelBlaze2629(i2);
        }
        Object[] objArr = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        int i3 = this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        if (i != i3) {
            System.arraycopy(objArr, i, objArr, i + 1, i3 - i);
        }
        objArr[i] = obj;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768++;
    }
}
