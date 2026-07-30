package p000createpolar;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public class PolarVoyageCoordinatorLayoutTurboShadowMax5440 extends PolarVoyageInputMethodManagerEclipseMegaBlaze2928 {
    @Override // p000createpolar.PolarVoyageInputMethodManagerEclipseMegaBlaze2928
    public final PolarVoyageRoomDaoRogueGamma6879 PolarVoyageAlertDialogCyberHeroQuantum3938(PolarVoyageCameraPhantomNova9854 polarVoyageCameraPhantomNova9854) {
        polarVoyageCameraPhantomNova9854.getClass();
        return new PolarVoyageLinearLayoutBlazeShadow5947(new FileInputStream(polarVoyageCameraPhantomNova9854.toFile()), PolarVoyageMotionLayoutTransitionPhantomCosmos1553.PolarVoyageBarcodeScannerInfernoSolarSpark7767);
    }

    @Override // p000createpolar.PolarVoyageInputMethodManagerEclipseMegaBlaze2928
    public void PolarVoyageBarcodeScannerInfernoSolarSpark7767(PolarVoyageCameraPhantomNova9854 polarVoyageCameraPhantomNova9854, PolarVoyageCameraPhantomNova9854 polarVoyageCameraPhantomNova98542) {
        polarVoyageCameraPhantomNova9854.getClass();
        polarVoyageCameraPhantomNova98542.getClass();
        if (polarVoyageCameraPhantomNova9854.toFile().renameTo(polarVoyageCameraPhantomNova98542.toFile())) {
            return;
        }
        throw new IOException("failed to move " + polarVoyageCameraPhantomNova9854 + " to " + polarVoyageCameraPhantomNova98542);
    }

    @Override // p000createpolar.PolarVoyageInputMethodManagerEclipseMegaBlaze2928
    public final PolarVoyageViewEliteBeta6786 PolarVoyageBitmapMaxTitanTitan7960(PolarVoyageCameraPhantomNova9854 polarVoyageCameraPhantomNova9854, boolean z) {
        polarVoyageCameraPhantomNova9854.getClass();
        if (!z || !PolarVoyageRotateAnimationCyberCelestialDelta4768(polarVoyageCameraPhantomNova9854)) {
            return new PolarVoyageChipDeltaVortexNebula6399(new FileOutputStream(polarVoyageCameraPhantomNova9854.toFile(), false), new PolarVoyageMotionLayoutTransitionPhantomCosmos1553());
        }
        throw new IOException(polarVoyageCameraPhantomNova9854 + " already exists.");
    }

    @Override // p000createpolar.PolarVoyageInputMethodManagerEclipseMegaBlaze2928
    public final void PolarVoyageBitmapVisionAuroraPixel4705(PolarVoyageCameraPhantomNova9854 polarVoyageCameraPhantomNova9854) {
        polarVoyageCameraPhantomNova9854.getClass();
        if (polarVoyageCameraPhantomNova9854.toFile().mkdir()) {
            return;
        }
        PolarVoyageConstraintSetForceAurora6987 PolarVoyageSnackbarGammaEclipse2140 = PolarVoyageSnackbarGammaEclipse2140(polarVoyageCameraPhantomNova9854);
        if (PolarVoyageSnackbarGammaEclipse2140 == null || !PolarVoyageSnackbarGammaEclipse2140.PolarVoyageMotionLayoutTransitionHeroVision4068) {
            PolarVoyageBindingAdapterGammaOlympianCelestial7569.PolarVoyageZipVortexCelestial6185(polarVoyageCameraPhantomNova9854, "failed to create directory: ");
        }
    }

    @Override // p000createpolar.PolarVoyageInputMethodManagerEclipseMegaBlaze2928
    public final List PolarVoyageCameraPixelBlaze2629(PolarVoyageCameraPhantomNova9854 polarVoyageCameraPhantomNova9854) {
        File file = polarVoyageCameraPhantomNova9854.toFile();
        String[] list = file.list();
        if (list == null) {
            if (file.exists()) {
                PolarVoyageBindingAdapterGammaOlympianCelestial7569.PolarVoyageZipVortexCelestial6185(polarVoyageCameraPhantomNova9854, "failed to list ");
                return null;
            }
            PolarVoyageBroadcastDragonShadowRogue6783.PolarVoyageBottomSheetOmegaNeo1907(polarVoyageCameraPhantomNova9854, "no such file: ");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            str.getClass();
            arrayList.add(polarVoyageCameraPhantomNova9854.PolarVoyageBitmapVisionAuroraPixel4705(str));
        }
        if (arrayList.size() > 1) {
            Collections.sort(arrayList);
        }
        return arrayList;
    }

    @Override // p000createpolar.PolarVoyageInputMethodManagerEclipseMegaBlaze2928
    public final PolarVoyageFlipAnimationMaxSolar1737 PolarVoyageContentProviderHyperSpark3838(PolarVoyageCameraPhantomNova9854 polarVoyageCameraPhantomNova9854) {
        return new PolarVoyageFlipAnimationMaxSolar1737(new RandomAccessFile(polarVoyageCameraPhantomNova9854.toFile(), "r"));
    }

    @Override // p000createpolar.PolarVoyageInputMethodManagerEclipseMegaBlaze2928
    public final void PolarVoyageDiffUtilTurboStrike5735(PolarVoyageCameraPhantomNova9854 polarVoyageCameraPhantomNova9854) {
        polarVoyageCameraPhantomNova9854.getClass();
        if (Thread.interrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        File file = polarVoyageCameraPhantomNova9854.toFile();
        if (file.delete() || !file.exists()) {
            return;
        }
        PolarVoyageBindingAdapterGammaOlympianCelestial7569.PolarVoyageZipVortexCelestial6185(polarVoyageCameraPhantomNova9854, "failed to delete ");
    }

    @Override // p000createpolar.PolarVoyageInputMethodManagerEclipseMegaBlaze2928
    public final PolarVoyageViewEliteBeta6786 PolarVoyageMotionLayoutTransitionHeroVision4068(PolarVoyageCameraPhantomNova9854 polarVoyageCameraPhantomNova9854) {
        polarVoyageCameraPhantomNova9854.getClass();
        return new PolarVoyageChipDeltaVortexNebula6399(new FileOutputStream(polarVoyageCameraPhantomNova9854.toFile(), true), new PolarVoyageMotionLayoutTransitionPhantomCosmos1553());
    }

    @Override // p000createpolar.PolarVoyageInputMethodManagerEclipseMegaBlaze2928
    public PolarVoyageConstraintSetForceAurora6987 PolarVoyageSnackbarGammaEclipse2140(PolarVoyageCameraPhantomNova9854 polarVoyageCameraPhantomNova9854) {
        polarVoyageCameraPhantomNova9854.getClass();
        File file = polarVoyageCameraPhantomNova9854.toFile();
        boolean isFile = file.isFile();
        boolean isDirectory = file.isDirectory();
        long lastModified = file.lastModified();
        long length = file.length();
        if (!isFile && !isDirectory && lastModified == 0 && length == 0 && !file.exists()) {
            return null;
        }
        return new PolarVoyageConstraintSetForceAurora6987(isFile, isDirectory, null, Long.valueOf(length), null, Long.valueOf(lastModified), null);
    }

    public String toString() {
        return "JvmSystemFileSystem";
    }
}
