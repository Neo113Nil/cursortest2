package p000createpolar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageCoroutineScopeDeltaInferno4802 implements Iterable, PolarVoyageZipDeltaSpectraRogue6055 {
    public static final PolarVoyageCoroutineScopeDeltaInferno4802 PolarVoyageStrictModeLegendEpic1532 = new PolarVoyageCoroutineScopeDeltaInferno4802(new String[0]);
    public final String[] PolarVoyageItemDecorationUltraDeltaEpic7485;

    public PolarVoyageCoroutineScopeDeltaInferno4802(String[] strArr) {
        strArr.getClass();
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = strArr;
    }

    public final PolarVoyageRotateAnimationHyperionPixelCelestial5757 PolarVoyageBarcodeScannerInfernoSolarSpark7767() {
        PolarVoyageRotateAnimationHyperionPixelCelestial5757 polarVoyageRotateAnimationHyperionPixelCelestial5757 = new PolarVoyageRotateAnimationHyperionPixelCelestial5757(0);
        ArrayList arrayList = polarVoyageRotateAnimationHyperionPixelCelestial5757.PolarVoyageZipVortexCelestial6185;
        arrayList.getClass();
        String[] strArr = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        strArr.getClass();
        List asList = Arrays.asList(strArr);
        asList.getClass();
        arrayList.addAll(asList);
        return polarVoyageRotateAnimationHyperionPixelCelestial5757;
    }

    public final String PolarVoyageBitmapVisionAuroraPixel4705(int i) {
        String str = (String) PolarVoyagePagingDataPhantomCelestialPhoenix8159.PolarVoyageLayerSpeedBlazeVortex2881((i * 2) + 1, this.PolarVoyageItemDecorationUltraDeltaEpic7485);
        if (str != null) {
            return str;
        }
        throw new IndexOutOfBoundsException("value[" + i + ']');
    }

    public final String PolarVoyageMotionLayoutTransitionHeroVision4068(int i) {
        String str = (String) PolarVoyagePagingDataPhantomCelestialPhoenix8159.PolarVoyageLayerSpeedBlazeVortex2881(i * 2, this.PolarVoyageItemDecorationUltraDeltaEpic7485);
        if (str != null) {
            return str;
        }
        throw new IndexOutOfBoundsException("name[" + i + ']');
    }

    public final String PolarVoyageZipVortexCelestial6185(String str) {
        String[] strArr = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        strArr.getClass();
        int length = strArr.length - 2;
        int PolarVoyageRemoteModelManagerOlympianCelestial9141 = PolarVoyageDispatchersGammaUltraTurbo4138.PolarVoyageRemoteModelManagerOlympianCelestial9141(length, 0, -2);
        if (PolarVoyageRemoteModelManagerOlympianCelestial9141 > length) {
            return null;
        }
        while (!str.equalsIgnoreCase(strArr[length])) {
            if (length == PolarVoyageRemoteModelManagerOlympianCelestial9141) {
                return null;
            }
            length -= 2;
        }
        return strArr[length + 1];
    }

    public final boolean equals(Object obj) {
        if (obj instanceof PolarVoyageCoroutineScopeDeltaInferno4802) {
            return Arrays.equals(this.PolarVoyageItemDecorationUltraDeltaEpic7485, ((PolarVoyageCoroutineScopeDeltaInferno4802) obj).PolarVoyageItemDecorationUltraDeltaEpic7485);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.PolarVoyageItemDecorationUltraDeltaEpic7485);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int size = size();
        PolarVoyageRippleDrawableRogueBlazeBlaze8980[] polarVoyageRippleDrawableRogueBlazeBlaze8980Arr = new PolarVoyageRippleDrawableRogueBlazeBlaze8980[size];
        for (int i = 0; i < size; i++) {
            polarVoyageRippleDrawableRogueBlazeBlaze8980Arr[i] = new PolarVoyageRippleDrawableRogueBlazeBlaze8980(PolarVoyageMotionLayoutTransitionHeroVision4068(i), PolarVoyageBitmapVisionAuroraPixel4705(i));
        }
        return new PolarVoyageProximitySensorHyperBlaze3823(polarVoyageRippleDrawableRogueBlazeBlaze8980Arr);
    }

    public final int size() {
        return this.PolarVoyageItemDecorationUltraDeltaEpic7485.length / 2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int i = 0; i < size; i++) {
            String PolarVoyageMotionLayoutTransitionHeroVision4068 = PolarVoyageMotionLayoutTransitionHeroVision4068(i);
            String PolarVoyageBitmapVisionAuroraPixel4705 = PolarVoyageBitmapVisionAuroraPixel4705(i);
            sb.append(PolarVoyageMotionLayoutTransitionHeroVision4068);
            sb.append(": ");
            if (PolarVoyageDatabaseStormMasterMaster4645.PolarVoyageRotateAnimationCyberCelestialDelta4768(PolarVoyageMotionLayoutTransitionHeroVision4068)) {
                PolarVoyageBitmapVisionAuroraPixel4705 = "██";
            }
            sb.append(PolarVoyageBitmapVisionAuroraPixel4705);
            sb.append("\n");
        }
        return sb.toString();
    }
}
