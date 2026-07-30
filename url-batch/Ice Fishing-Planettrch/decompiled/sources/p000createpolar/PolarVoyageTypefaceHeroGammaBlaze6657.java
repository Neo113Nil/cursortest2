package p000createpolar;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final /* synthetic */ class PolarVoyageTypefaceHeroGammaBlaze6657 implements PolarVoyageDrawableCompatCyberShadowEpic1766, PolarVoyageFlowCollectorOmegaHyperion3803 {
    public final /* synthetic */ Object PolarVoyageBottomSheetOmegaNeo1907;
    public final /* synthetic */ int PolarVoyageItemDecorationUltraDeltaEpic7485;
    public final /* synthetic */ long PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public final /* synthetic */ Object PolarVoyageStrictModeLegendEpic1532;
    public final /* synthetic */ Object PolarVoyageViewRogueMaster4778;

    public /* synthetic */ PolarVoyageTypefaceHeroGammaBlaze6657(PolarVoyageWorkManagerVortexNova2773 polarVoyageWorkManagerVortexNova2773, Iterable iterable, PolarVoyageLayoutInfernoSpeed9711 polarVoyageLayoutInfernoSpeed9711, long j) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = 2;
        this.PolarVoyageStrictModeLegendEpic1532 = polarVoyageWorkManagerVortexNova2773;
        this.PolarVoyageViewRogueMaster4778 = iterable;
        this.PolarVoyageBottomSheetOmegaNeo1907 = polarVoyageLayoutInfernoSpeed9711;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = j;
    }

    @Override // p000createpolar.PolarVoyageFlowCollectorOmegaHyperion3803
    public Object PolarVoyageKotlinBetaPulseBeta3653() {
        PolarVoyageWorkManagerVortexNova2773 polarVoyageWorkManagerVortexNova2773 = (PolarVoyageWorkManagerVortexNova2773) this.PolarVoyageStrictModeLegendEpic1532;
        Iterable iterable = (Iterable) this.PolarVoyageViewRogueMaster4778;
        PolarVoyageLayoutInfernoSpeed9711 polarVoyageLayoutInfernoSpeed9711 = (PolarVoyageLayoutInfernoSpeed9711) this.PolarVoyageBottomSheetOmegaNeo1907;
        PolarVoyageExoPlayerNeoDelta8060 polarVoyageExoPlayerNeoDelta8060 = polarVoyageWorkManagerVortexNova2773.PolarVoyageKotlinBetaPulseBeta3653;
        polarVoyageExoPlayerNeoDelta8060.getClass();
        if (iterable.iterator().hasNext()) {
            String concat = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in ".concat(PolarVoyageExoPlayerNeoDelta8060.PolarVoyageCameraPixelBlaze2629(iterable));
            SQLiteDatabase PolarVoyageMotionLayoutTransitionHeroVision4068 = polarVoyageExoPlayerNeoDelta8060.PolarVoyageMotionLayoutTransitionHeroVision4068();
            PolarVoyageMotionLayoutTransitionHeroVision4068.beginTransaction();
            try {
                PolarVoyageMotionLayoutTransitionHeroVision4068.compileStatement(concat).execute();
                Cursor rawQuery = PolarVoyageMotionLayoutTransitionHeroVision4068.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", null);
                while (rawQuery.moveToNext()) {
                    try {
                        polarVoyageExoPlayerNeoDelta8060.PolarVoyageStrictModeLegendEpic1532(rawQuery.getInt(0), PolarVoyageLocationListenerPulseTitan6571.MAX_RETRIES_REACHED, rawQuery.getString(1));
                    } catch (Throwable th) {
                        rawQuery.close();
                        throw th;
                    }
                }
                rawQuery.close();
                PolarVoyageMotionLayoutTransitionHeroVision4068.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
                PolarVoyageMotionLayoutTransitionHeroVision4068.setTransactionSuccessful();
            } finally {
                PolarVoyageMotionLayoutTransitionHeroVision4068.endTransaction();
            }
        }
        polarVoyageExoPlayerNeoDelta8060.PolarVoyageBitmapVisionAuroraPixel4705(new PolarVoyageRoomDaoSpeedCosmos6320(polarVoyageWorkManagerVortexNova2773.PolarVoyageTextInputEditTextNebulaHero6651.PolarVoyageZipVortexCelestial6185() + this.PolarVoyageRotateAnimationCyberCelestialDelta4768, polarVoyageLayoutInfernoSpeed9711));
        return null;
    }

    @Override // p000createpolar.PolarVoyageDrawableCompatCyberShadowEpic1766
    public ScheduledFuture PolarVoyageZipVortexCelestial6185(final PolarVoyageAdapterTitanSpark4027 polarVoyageAdapterTitanSpark4027) {
        int i = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        Object obj = this.PolarVoyageBottomSheetOmegaNeo1907;
        long j = this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        Object obj2 = this.PolarVoyageViewRogueMaster4778;
        final PolarVoyageScaleGestureDetectorHyperFusion3036 polarVoyageScaleGestureDetectorHyperFusion3036 = (PolarVoyageScaleGestureDetectorHyperFusion3036) this.PolarVoyageStrictModeLegendEpic1532;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return polarVoyageScaleGestureDetectorHyperFusion3036.PolarVoyageStrictModeLegendEpic1532.schedule(new PolarVoyageCountDownTimerVortexMega3934(polarVoyageScaleGestureDetectorHyperFusion3036, (Runnable) obj2, polarVoyageAdapterTitanSpark4027, 1), j, (TimeUnit) obj);
            default:
                final Callable callable = (Callable) obj2;
                return polarVoyageScaleGestureDetectorHyperFusion3036.PolarVoyageStrictModeLegendEpic1532.schedule(new Callable() { // from class: create-polar.PolarVoyageR8NovaXCosmosSolar3714
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return PolarVoyageScaleGestureDetectorHyperFusion3036.this.PolarVoyageItemDecorationUltraDeltaEpic7485.submit(new PolarVoyageMediaPlayerNebulaTurboLegend3509(15, callable, polarVoyageAdapterTitanSpark4027));
                    }
                }, j, (TimeUnit) obj);
        }
    }

    public /* synthetic */ PolarVoyageTypefaceHeroGammaBlaze6657(PolarVoyageScaleGestureDetectorHyperFusion3036 polarVoyageScaleGestureDetectorHyperFusion3036, Object obj, long j, TimeUnit timeUnit, int i) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = i;
        this.PolarVoyageStrictModeLegendEpic1532 = polarVoyageScaleGestureDetectorHyperFusion3036;
        this.PolarVoyageViewRogueMaster4778 = obj;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = j;
        this.PolarVoyageBottomSheetOmegaNeo1907 = timeUnit;
    }
}
