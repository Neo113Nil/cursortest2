package p000createpolar;

import com.android.installreferrer.api.InstallReferrerClient;
import java.io.Closeable;
import java.util.zip.Deflater;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageVideoCaptureAlphaDeltaPrime3202 implements Closeable {
    public Object PolarVoyageBottomSheetOmegaNeo1907;
    public final /* synthetic */ int PolarVoyageItemDecorationUltraDeltaEpic7485;
    public final PolarVoyageSnackbarSpectraMasterMaster4120 PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public final boolean PolarVoyageStrictModeLegendEpic1532;
    public Closeable PolarVoyageViewRogueMaster4778;

    public PolarVoyageVideoCaptureAlphaDeltaPrime3202(int i, boolean z) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = i;
        switch (i) {
            case 1:
                this.PolarVoyageStrictModeLegendEpic1532 = z;
                this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = new PolarVoyageSnackbarSpectraMasterMaster4120();
                break;
            default:
                this.PolarVoyageStrictModeLegendEpic1532 = z;
                PolarVoyageSnackbarSpectraMasterMaster4120 polarVoyageSnackbarSpectraMasterMaster4120 = new PolarVoyageSnackbarSpectraMasterMaster4120();
                this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = polarVoyageSnackbarSpectraMasterMaster4120;
                Deflater deflater = new Deflater(-1, true);
                this.PolarVoyageBottomSheetOmegaNeo1907 = deflater;
                this.PolarVoyageViewRogueMaster4778 = new PolarVoyageLightSensorMasterSolar3627(polarVoyageSnackbarSpectraMasterMaster4120, deflater);
                break;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.PolarVoyageItemDecorationUltraDeltaEpic7485) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((PolarVoyageLightSensorMasterSolar3627) this.PolarVoyageViewRogueMaster4778).close();
                break;
            default:
                PolarVoyageInsetDrawableTurboInferno8258 polarVoyageInsetDrawableTurboInferno8258 = (PolarVoyageInsetDrawableTurboInferno8258) this.PolarVoyageViewRogueMaster4778;
                if (polarVoyageInsetDrawableTurboInferno8258 != null) {
                    polarVoyageInsetDrawableTurboInferno8258.close();
                }
                this.PolarVoyageViewRogueMaster4778 = null;
                this.PolarVoyageBottomSheetOmegaNeo1907 = null;
                break;
        }
    }
}
