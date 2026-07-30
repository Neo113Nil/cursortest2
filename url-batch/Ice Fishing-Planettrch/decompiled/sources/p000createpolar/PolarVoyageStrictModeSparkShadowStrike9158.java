package p000createpolar;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final /* synthetic */ class PolarVoyageStrictModeSparkShadowStrike9158 implements PolarVoyageGuidelineForceNebulaPhoenix2255, PolarVoyageFlowCollectorOmegaHyperion3803 {
    public final /* synthetic */ long PolarVoyageItemDecorationUltraDeltaEpic7485;
    public final /* synthetic */ Object PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public final /* synthetic */ Object PolarVoyageStrictModeLegendEpic1532;

    public /* synthetic */ PolarVoyageStrictModeSparkShadowStrike9158(long j, Object obj, Object obj2) {
        this.PolarVoyageStrictModeLegendEpic1532 = obj;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = obj2;
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = j;
    }

    @Override // p000createpolar.PolarVoyageFlowCollectorOmegaHyperion3803
    public Object PolarVoyageKotlinBetaPulseBeta3653() {
        PolarVoyageWorkManagerVortexNova2773 polarVoyageWorkManagerVortexNova2773 = (PolarVoyageWorkManagerVortexNova2773) this.PolarVoyageStrictModeLegendEpic1532;
        PolarVoyageLayoutInfernoSpeed9711 polarVoyageLayoutInfernoSpeed9711 = (PolarVoyageLayoutInfernoSpeed9711) this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        PolarVoyageExoPlayerNeoDelta8060 polarVoyageExoPlayerNeoDelta8060 = polarVoyageWorkManagerVortexNova2773.PolarVoyageKotlinBetaPulseBeta3653;
        long PolarVoyageZipVortexCelestial6185 = polarVoyageWorkManagerVortexNova2773.PolarVoyageTextInputEditTextNebulaHero6651.PolarVoyageZipVortexCelestial6185() + this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        polarVoyageExoPlayerNeoDelta8060.getClass();
        polarVoyageExoPlayerNeoDelta8060.PolarVoyageBitmapVisionAuroraPixel4705(new PolarVoyageRoomDaoSpeedCosmos6320(PolarVoyageZipVortexCelestial6185, polarVoyageLayoutInfernoSpeed9711));
        return null;
    }

    @Override // p000createpolar.PolarVoyageGuidelineForceNebulaPhoenix2255
    public Object apply(Object obj) {
        String str = (String) this.PolarVoyageStrictModeLegendEpic1532;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        int i = ((PolarVoyageLocationListenerPulseTitan6571) this.PolarVoyageRotateAnimationCyberCelestialDelta4768).PolarVoyageItemDecorationUltraDeltaEpic7485;
        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(i)});
        try {
            boolean z = rawQuery.getCount() > 0;
            rawQuery.close();
            long j = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
            if (z) {
                sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(i)});
                return null;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put("reason", Integer.valueOf(i));
            contentValues.put("events_dropped_count", Long.valueOf(j));
            sQLiteDatabase.insert("log_event_dropped", null, contentValues);
            return null;
        } catch (Throwable th) {
            rawQuery.close();
            throw th;
        }
    }
}
