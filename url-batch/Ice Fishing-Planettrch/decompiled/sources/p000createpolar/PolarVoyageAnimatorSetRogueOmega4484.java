package p000createpolar;

import android.media.AudioDeviceInfo;
import android.media.AudioProfile;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public abstract class PolarVoyageAnimatorSetRogueOmega4484 {
    public static final PolarVoyageLifecycleCameraControllerUltraShadowDelta8620 PolarVoyageZipVortexCelestial6185 = PolarVoyageDialogPhantomEliteAurora3058.PolarVoyageSnackbarGammaEclipse2140(12);

    public static PolarVoyageDialogPhantomEliteAurora3058 PolarVoyageZipVortexCelestial6185(AudioDeviceInfo audioDeviceInfo) {
        List audioProfiles;
        int encapsulationType;
        int format;
        int[] channelMasks;
        audioProfiles = audioDeviceInfo.getAudioProfiles();
        TreeSet treeSet = new TreeSet(Comparator.comparing(new PolarVoyageFlingGestureTitaniumMaster7867()).reversed());
        Iterator it = audioProfiles.iterator();
        while (it.hasNext()) {
            AudioProfile PolarVoyageDiffUtilTurboStrike5735 = PolarVoyageContentObserverFusionDragon3395.PolarVoyageDiffUtilTurboStrike5735(it.next());
            encapsulationType = PolarVoyageDiffUtilTurboStrike5735.getEncapsulationType();
            if (encapsulationType != 1) {
                format = PolarVoyageDiffUtilTurboStrike5735.getFormat();
                if (PolarVoyageInputMethodManagerSolarHyperionAurora5339.PolarVoyageCameraViewSpectraMaxSpectra2824(format)) {
                    channelMasks = PolarVoyageDiffUtilTurboStrike5735.getChannelMasks();
                    for (int i : channelMasks) {
                        treeSet.add(Integer.valueOf(i));
                    }
                }
            }
        }
        return PolarVoyageDialogPhantomEliteAurora3058.PolarVoyageBottomSheetOmegaNeo1907(treeSet);
    }
}
