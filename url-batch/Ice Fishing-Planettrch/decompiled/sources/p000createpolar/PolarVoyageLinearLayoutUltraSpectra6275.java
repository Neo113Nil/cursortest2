package p000createpolar;

import android.view.Choreographer;
import java.util.ArrayList;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageLinearLayoutUltraSpectra6275 implements Choreographer.FrameCallback, Runnable {
    public final /* synthetic */ PolarVoyageJobSchedulerStormSolar7380 PolarVoyageItemDecorationUltraDeltaEpic7485;

    public PolarVoyageLinearLayoutUltraSpectra6275(PolarVoyageJobSchedulerStormSolar7380 polarVoyageJobSchedulerStormSolar7380) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = polarVoyageJobSchedulerStormSolar7380;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485.PolarVoyageBottomSheetOmegaNeo1907.removeCallbacks(this);
        PolarVoyageJobSchedulerStormSolar7380.PolarVoyageToolbarEclipseInfernoHero6368(this.PolarVoyageItemDecorationUltraDeltaEpic7485);
        PolarVoyageJobSchedulerStormSolar7380 polarVoyageJobSchedulerStormSolar7380 = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        synchronized (polarVoyageJobSchedulerStormSolar7380.PolarVoyageViewRogueMaster4778) {
            if (polarVoyageJobSchedulerStormSolar7380.PolarVoyageRemoteModelManagerOlympianCelestial9141) {
                polarVoyageJobSchedulerStormSolar7380.PolarVoyageRemoteModelManagerOlympianCelestial9141 = false;
                ArrayList arrayList = polarVoyageJobSchedulerStormSolar7380.PolarVoyageDrawableDeltaHyperion5742;
                polarVoyageJobSchedulerStormSolar7380.PolarVoyageDrawableDeltaHyperion5742 = polarVoyageJobSchedulerStormSolar7380.PolarVoyageSnackbarGammaEclipse2140;
                polarVoyageJobSchedulerStormSolar7380.PolarVoyageSnackbarGammaEclipse2140 = arrayList;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((Choreographer.FrameCallback) arrayList.get(i)).doFrame(j);
                }
                arrayList.clear();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        PolarVoyageJobSchedulerStormSolar7380.PolarVoyageToolbarEclipseInfernoHero6368(this.PolarVoyageItemDecorationUltraDeltaEpic7485);
        PolarVoyageJobSchedulerStormSolar7380 polarVoyageJobSchedulerStormSolar7380 = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        synchronized (polarVoyageJobSchedulerStormSolar7380.PolarVoyageViewRogueMaster4778) {
            if (polarVoyageJobSchedulerStormSolar7380.PolarVoyageDrawableDeltaHyperion5742.isEmpty()) {
                polarVoyageJobSchedulerStormSolar7380.PolarVoyageRotateAnimationCyberCelestialDelta4768.removeFrameCallback(this);
                polarVoyageJobSchedulerStormSolar7380.PolarVoyageRemoteModelManagerOlympianCelestial9141 = false;
            }
        }
    }
}
