package p000createpolar;

import java.io.FileNotFoundException;
import java.nio.file.FileSystemException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageDragEventPhoenixGammaUltra8793 extends PolarVoyageCoordinatorLayoutTurboShadowMax5440 {
    public static Long PolarVoyageCameraViewSpectraMaxSpectra2824(FileTime fileTime) {
        long millis;
        millis = fileTime.toMillis();
        Long valueOf = Long.valueOf(millis);
        if (millis != 0) {
            return valueOf;
        }
        return null;
    }

    @Override // p000createpolar.PolarVoyageCoordinatorLayoutTurboShadowMax5440, p000createpolar.PolarVoyageInputMethodManagerEclipseMegaBlaze2928
    public final void PolarVoyageBarcodeScannerInfernoSolarSpark7767(PolarVoyageCameraPhantomNova9854 polarVoyageCameraPhantomNova9854, PolarVoyageCameraPhantomNova9854 polarVoyageCameraPhantomNova98542) {
        Path path;
        Path path2;
        polarVoyageCameraPhantomNova9854.getClass();
        polarVoyageCameraPhantomNova98542.getClass();
        try {
            path = Paths.get(polarVoyageCameraPhantomNova9854.PolarVoyageItemDecorationUltraDeltaEpic7485.PolarVoyageNavigationViewHyperHyperHyperion1793(), new String[0]);
            path.getClass();
            path2 = Paths.get(polarVoyageCameraPhantomNova98542.PolarVoyageItemDecorationUltraDeltaEpic7485.PolarVoyageNavigationViewHyperHyperHyperion1793(), new String[0]);
            path2.getClass();
            Files.move(path, path2, StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING);
        } catch (UnsupportedOperationException unused) {
            PolarVoyageBroadcastDragonShadowRogue6783.PolarVoyageViewRogueMaster4778("atomic move not supported");
        } catch (NoSuchFileException e) {
            throw new FileNotFoundException(e.getMessage());
        }
    }

    @Override // p000createpolar.PolarVoyageCoordinatorLayoutTurboShadowMax5440, p000createpolar.PolarVoyageInputMethodManagerEclipseMegaBlaze2928
    public final PolarVoyageConstraintSetForceAurora6987 PolarVoyageSnackbarGammaEclipse2140(PolarVoyageCameraPhantomNova9854 polarVoyageCameraPhantomNova9854) {
        Path path;
        PolarVoyageCameraPhantomNova9854 polarVoyageCameraPhantomNova98542;
        polarVoyageCameraPhantomNova9854.getClass();
        path = Paths.get(polarVoyageCameraPhantomNova9854.PolarVoyageItemDecorationUltraDeltaEpic7485.PolarVoyageNavigationViewHyperHyperHyperion1793(), new String[0]);
        path.getClass();
        try {
            BasicFileAttributes readAttributes = Files.readAttributes(path, (Class<BasicFileAttributes>) BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
            Path readSymbolicLink = readAttributes.isSymbolicLink() ? Files.readSymbolicLink(path) : null;
            boolean isRegularFile = readAttributes.isRegularFile();
            boolean isDirectory = readAttributes.isDirectory();
            if (readSymbolicLink != null) {
                String str = PolarVoyageCameraPhantomNova9854.PolarVoyageStrictModeLegendEpic1532;
                polarVoyageCameraPhantomNova98542 = PolarVoyagePreviewDeltaVisionCyber7933.PolarVoyageRemoteModelManagerOlympianCelestial9141(readSymbolicLink.toString());
            } else {
                polarVoyageCameraPhantomNova98542 = null;
            }
            Long valueOf = Long.valueOf(readAttributes.size());
            FileTime creationTime = readAttributes.creationTime();
            Long PolarVoyageCameraViewSpectraMaxSpectra2824 = creationTime != null ? PolarVoyageCameraViewSpectraMaxSpectra2824(creationTime) : null;
            FileTime lastModifiedTime = readAttributes.lastModifiedTime();
            Long PolarVoyageCameraViewSpectraMaxSpectra28242 = lastModifiedTime != null ? PolarVoyageCameraViewSpectraMaxSpectra2824(lastModifiedTime) : null;
            FileTime lastAccessTime = readAttributes.lastAccessTime();
            return new PolarVoyageConstraintSetForceAurora6987(isRegularFile, isDirectory, polarVoyageCameraPhantomNova98542, valueOf, PolarVoyageCameraViewSpectraMaxSpectra2824, PolarVoyageCameraViewSpectraMaxSpectra28242, lastAccessTime != null ? PolarVoyageCameraViewSpectraMaxSpectra2824(lastAccessTime) : null);
        } catch (NoSuchFileException | FileSystemException unused) {
            return null;
        }
    }

    @Override // p000createpolar.PolarVoyageCoordinatorLayoutTurboShadowMax5440
    public final String toString() {
        return "NioSystemFileSystem";
    }
}
