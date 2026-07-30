package p000createpolar;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final /* synthetic */ class PolarVoyageObjectAnimatorEclipseLegend1405 implements PolarVoyageFlowCollectorOmegaHyperion3803 {
    public final /* synthetic */ int PolarVoyageItemDecorationUltraDeltaEpic7485;
    public final /* synthetic */ PolarVoyageExoPlayerNeoDelta8060 PolarVoyageStrictModeLegendEpic1532;

    public /* synthetic */ PolarVoyageObjectAnimatorEclipseLegend1405(PolarVoyageExoPlayerNeoDelta8060 polarVoyageExoPlayerNeoDelta8060, int i) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = i;
        this.PolarVoyageStrictModeLegendEpic1532 = polarVoyageExoPlayerNeoDelta8060;
    }

    @Override // p000createpolar.PolarVoyageFlowCollectorOmegaHyperion3803
    public final Object PolarVoyageKotlinBetaPulseBeta3653() {
        SQLiteDatabase PolarVoyageMotionLayoutTransitionHeroVision4068;
        int i = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        PolarVoyageExoPlayerNeoDelta8060 polarVoyageExoPlayerNeoDelta8060 = this.PolarVoyageStrictModeLegendEpic1532;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                polarVoyageExoPlayerNeoDelta8060.getClass();
                int i2 = PolarVoyagePlaceholderInfernoPixelHyper1253.PolarVoyageBitmapVisionAuroraPixel4705;
                PolarVoyageAnimatorCelestialDeltaMaster5821 polarVoyageAnimatorCelestialDeltaMaster5821 = new PolarVoyageAnimatorCelestialDeltaMaster5821(3);
                polarVoyageAnimatorCelestialDeltaMaster5821.PolarVoyageRotateAnimationCyberCelestialDelta4768 = null;
                polarVoyageAnimatorCelestialDeltaMaster5821.PolarVoyageBottomSheetOmegaNeo1907 = new ArrayList();
                polarVoyageAnimatorCelestialDeltaMaster5821.PolarVoyageViewRogueMaster4778 = null;
                polarVoyageAnimatorCelestialDeltaMaster5821.PolarVoyageStrictModeLegendEpic1532 = "";
                HashMap hashMap = new HashMap();
                PolarVoyageMotionLayoutTransitionHeroVision4068 = polarVoyageExoPlayerNeoDelta8060.PolarVoyageMotionLayoutTransitionHeroVision4068();
                PolarVoyageMotionLayoutTransitionHeroVision4068.beginTransaction();
                try {
                    PolarVoyagePlaceholderInfernoPixelHyper1253 polarVoyagePlaceholderInfernoPixelHyper1253 = (PolarVoyagePlaceholderInfernoPixelHyper1253) PolarVoyageExoPlayerNeoDelta8060.PolarVoyageDrawableDeltaHyperion5742(PolarVoyageMotionLayoutTransitionHeroVision4068.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new PolarVoyageGraphDeltaPulse1659(polarVoyageExoPlayerNeoDelta8060, hashMap, polarVoyageAnimatorCelestialDeltaMaster5821, 6));
                    PolarVoyageMotionLayoutTransitionHeroVision4068.setTransactionSuccessful();
                    return polarVoyagePlaceholderInfernoPixelHyper1253;
                } finally {
                }
            default:
                long PolarVoyageZipVortexCelestial6185 = polarVoyageExoPlayerNeoDelta8060.PolarVoyageStrictModeLegendEpic1532.PolarVoyageZipVortexCelestial6185() - polarVoyageExoPlayerNeoDelta8060.PolarVoyageBottomSheetOmegaNeo1907.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
                PolarVoyageMotionLayoutTransitionHeroVision4068 = polarVoyageExoPlayerNeoDelta8060.PolarVoyageMotionLayoutTransitionHeroVision4068();
                PolarVoyageMotionLayoutTransitionHeroVision4068.beginTransaction();
                try {
                    String[] strArr = {String.valueOf(PolarVoyageZipVortexCelestial6185)};
                    Cursor rawQuery = PolarVoyageMotionLayoutTransitionHeroVision4068.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr);
                    while (rawQuery.moveToNext()) {
                        try {
                            polarVoyageExoPlayerNeoDelta8060.PolarVoyageStrictModeLegendEpic1532(rawQuery.getInt(0), PolarVoyageLocationListenerPulseTitan6571.MESSAGE_TOO_OLD, rawQuery.getString(1));
                        } catch (Throwable th) {
                            rawQuery.close();
                            throw th;
                        }
                    }
                    rawQuery.close();
                    int delete = PolarVoyageMotionLayoutTransitionHeroVision4068.delete("events", "timestamp_ms < ?", strArr);
                    PolarVoyageMotionLayoutTransitionHeroVision4068.setTransactionSuccessful();
                    PolarVoyageMotionLayoutTransitionHeroVision4068.endTransaction();
                    return Integer.valueOf(delete);
                } finally {
                }
        }
    }
}
