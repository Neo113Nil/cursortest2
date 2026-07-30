package p000createpolar;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.os.Build;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageChipGammaPixelSpeed8607 implements PolarVoyageNavigationNovaMega1262 {
    public final PolarVoyageTextRecognitionDeltaCosmosPhoenix9177 PolarVoyageZipVortexCelestial6185;

    public PolarVoyageChipGammaPixelSpeed8607(PolarVoyageTextRecognitionDeltaCosmosPhoenix9177 polarVoyageTextRecognitionDeltaCosmosPhoenix9177) {
        this.PolarVoyageZipVortexCelestial6185 = polarVoyageTextRecognitionDeltaCosmosPhoenix9177;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000f, code lost:
    
        if (r0 == r2) goto L6;
     */
    @Override // p000createpolar.PolarVoyageNavigationNovaMega1262
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final PolarVoyageTabLayoutVisionBetaLegend1466 PolarVoyageZipVortexCelestial6185(PolarVoyagePaintFlagsDrawFilterHeroNebulaDelta6547 polarVoyagePaintFlagsDrawFilterHeroNebulaDelta6547, PolarVoyageSupervisorJobLegendNovaXEpic9696 polarVoyageSupervisorJobLegendNovaXEpic9696) {
        ImageDecoder.Source createSource;
        PolarVoyageCameraPhantomNova9854 PolarVoyageRemoteModelManagerOlympianCelestial9141;
        Bitmap.Config config;
        Bitmap.Config PolarVoyageZipVortexCelestial6185 = PolarVoyageFragmentManagerVisionVortex1127.PolarVoyageZipVortexCelestial6185(polarVoyageSupervisorJobLegendNovaXEpic9696);
        Context context = polarVoyageSupervisorJobLegendNovaXEpic9696.PolarVoyageZipVortexCelestial6185;
        if (PolarVoyageZipVortexCelestial6185 != Bitmap.Config.ARGB_8888) {
            config = Bitmap.Config.HARDWARE;
        }
        PolarVoyageFragmentTransactionOlympianSparkMega1365 polarVoyageFragmentTransactionOlympianSparkMega1365 = polarVoyagePaintFlagsDrawFilterHeroNebulaDelta6547.PolarVoyageZipVortexCelestial6185;
        if (polarVoyageFragmentTransactionOlympianSparkMega1365.getFileSystem() != PolarVoyageInputMethodManagerEclipseMegaBlaze2928.PolarVoyageItemDecorationUltraDeltaEpic7485 || (PolarVoyageRemoteModelManagerOlympianCelestial9141 = polarVoyageFragmentTransactionOlympianSparkMega1365.PolarVoyageRemoteModelManagerOlympianCelestial9141()) == null) {
            PolarVoyageNavigationViewNebulaNovaXPhoenix7849 PolarVoyageNavigationViewHyperHyperHyperion1793 = polarVoyageFragmentTransactionOlympianSparkMega1365.PolarVoyageNavigationViewHyperHyperHyperion1793();
            if (PolarVoyageNavigationViewHyperHyperHyperion1793 instanceof PolarVoyageCrashlyticsCelestialHyper3201) {
                createSource = ImageDecoder.createSource(context.getAssets(), ((PolarVoyageCrashlyticsCelestialHyper3201) PolarVoyageNavigationViewHyperHyperHyperion1793).PolarVoyageViewRogueMaster4778);
            } else if (!(PolarVoyageNavigationViewHyperHyperHyperion1793 instanceof PolarVoyageFlipAnimationMasterMaxDelta8380) || Build.VERSION.SDK_INT < 29) {
                if (PolarVoyageNavigationViewHyperHyperHyperion1793 instanceof PolarVoyageCardViewNovaUltra3479) {
                    PolarVoyageCardViewNovaUltra3479 polarVoyageCardViewNovaUltra3479 = (PolarVoyageCardViewNovaUltra3479) PolarVoyageNavigationViewHyperHyperHyperion1793;
                    if (polarVoyageCardViewNovaUltra3479.PolarVoyageViewRogueMaster4778.equals(context.getPackageName())) {
                        createSource = ImageDecoder.createSource(context.getResources(), polarVoyageCardViewNovaUltra3479.PolarVoyageCameraPixelBlaze2629);
                    }
                }
                if (PolarVoyageNavigationViewHyperHyperHyperion1793 instanceof PolarVoyageFlowCollectorTurboOmega4982) {
                    createSource = ImageDecoder.createSource(((PolarVoyageFlowCollectorTurboOmega4982) PolarVoyageNavigationViewHyperHyperHyperion1793).PolarVoyageViewRogueMaster4778);
                }
                createSource = null;
            } else {
                try {
                    AssetFileDescriptor assetFileDescriptor = ((PolarVoyageFlipAnimationMasterMaxDelta8380) PolarVoyageNavigationViewHyperHyperHyperion1793).PolarVoyageViewRogueMaster4778;
                    Os.lseek(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), OsConstants.SEEK_SET);
                    createSource = ImageDecoder.createSource(new PolarVoyageStorageMaxBlaze6765(2, assetFileDescriptor));
                } catch (ErrnoException unused) {
                }
            }
        } else {
            createSource = ImageDecoder.createSource(PolarVoyageRemoteModelManagerOlympianCelestial9141.toFile());
        }
        if (createSource != null) {
            return new PolarVoyageTabLayoutVisionBetaLegend1466(createSource, polarVoyagePaintFlagsDrawFilterHeroNebulaDelta6547.PolarVoyageZipVortexCelestial6185, polarVoyageSupervisorJobLegendNovaXEpic9696, this.PolarVoyageZipVortexCelestial6185);
        }
        return null;
    }
}
