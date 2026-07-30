package p000createpolar;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public abstract class PolarVoyageAccelerometerPhantomTitan1866 {
    public boolean PolarVoyageKotlinBetaPulseBeta3653;
    public int PolarVoyageMotionLayoutTransitionHeroVision4068;
    public Object[] PolarVoyageZipVortexCelestial6185;

    public PolarVoyageAccelerometerPhantomTitan1866(int i) {
        PolarVoyageLayoutInflaterMegaAlpha5562.PolarVoyageRemoteModelManagerOlympianCelestial9141("initialCapacity", i);
        this.PolarVoyageZipVortexCelestial6185 = new Object[i];
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = 0;
    }

    public static int PolarVoyageBitmapVisionAuroraPixel4705(int i, int i2) {
        if (i2 < 0) {
            PolarVoyageCamera2MasterPulse1881.PolarVoyageViewRogueMaster4778("cannot store more than MAX_VALUE elements");
            return 0;
        }
        if (i2 <= i) {
            return i;
        }
        int i3 = i + (i >> 1) + 1;
        if (i3 < i2) {
            i3 = Integer.highestOneBit(i2 - 1) << 1;
        }
        if (i3 < 0) {
            return Integer.MAX_VALUE;
        }
        return i3;
    }

    public final void PolarVoyageBarcodeScannerInfernoSolarSpark7767(int i) {
        Object[] objArr = this.PolarVoyageZipVortexCelestial6185;
        int PolarVoyageBitmapVisionAuroraPixel4705 = PolarVoyageBitmapVisionAuroraPixel4705(objArr.length, this.PolarVoyageMotionLayoutTransitionHeroVision4068 + i);
        if (PolarVoyageBitmapVisionAuroraPixel4705 > objArr.length || this.PolarVoyageKotlinBetaPulseBeta3653) {
            this.PolarVoyageZipVortexCelestial6185 = Arrays.copyOf(this.PolarVoyageZipVortexCelestial6185, PolarVoyageBitmapVisionAuroraPixel4705);
            this.PolarVoyageKotlinBetaPulseBeta3653 = false;
        }
    }

    public final void PolarVoyageKotlinBetaPulseBeta3653(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            PolarVoyageBarcodeScannerInfernoSolarSpark7767(collection.size());
            if (collection instanceof PolarVoyagePlaceholderCyberStrikeThunder6660) {
                this.PolarVoyageMotionLayoutTransitionHeroVision4068 = ((PolarVoyagePlaceholderCyberStrikeThunder6660) collection).PolarVoyageMotionLayoutTransitionHeroVision4068(this.PolarVoyageMotionLayoutTransitionHeroVision4068, this.PolarVoyageZipVortexCelestial6185);
                return;
            }
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            PolarVoyageZipVortexCelestial6185(it.next());
        }
    }

    public final void PolarVoyageMotionLayoutTransitionHeroVision4068(Object obj) {
        obj.getClass();
        PolarVoyageBarcodeScannerInfernoSolarSpark7767(1);
        Object[] objArr = this.PolarVoyageZipVortexCelestial6185;
        int i = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = i + 1;
        objArr[i] = obj;
    }

    public abstract PolarVoyageAccelerometerPhantomTitan1866 PolarVoyageZipVortexCelestial6185(Object obj);
}
