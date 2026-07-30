package p000createpolar;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final /* synthetic */ class PolarVoyageRoomDaoSpeedCosmos6320 implements PolarVoyageGuidelineForceNebulaPhoenix2255 {
    public final /* synthetic */ long PolarVoyageItemDecorationUltraDeltaEpic7485;
    public final /* synthetic */ PolarVoyageLayoutInfernoSpeed9711 PolarVoyageStrictModeLegendEpic1532;

    public /* synthetic */ PolarVoyageRoomDaoSpeedCosmos6320(long j, PolarVoyageLayoutInfernoSpeed9711 polarVoyageLayoutInfernoSpeed9711) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = j;
        this.PolarVoyageStrictModeLegendEpic1532 = polarVoyageLayoutInfernoSpeed9711;
    }

    @Override // p000createpolar.PolarVoyageGuidelineForceNebulaPhoenix2255
    public final Object apply(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(this.PolarVoyageItemDecorationUltraDeltaEpic7485));
        PolarVoyageLayoutInfernoSpeed9711 polarVoyageLayoutInfernoSpeed9711 = this.PolarVoyageStrictModeLegendEpic1532;
        String str = polarVoyageLayoutInfernoSpeed9711.PolarVoyageZipVortexCelestial6185;
        PolarVoyageWithContextMasterSpeed4365 polarVoyageWithContextMasterSpeed4365 = polarVoyageLayoutInfernoSpeed9711.PolarVoyageKotlinBetaPulseBeta3653;
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{str, String.valueOf(PolarVoyageOrientationSensorPrimeAurora5884.PolarVoyageZipVortexCelestial6185(polarVoyageWithContextMasterSpeed4365))}) < 1) {
            contentValues.put("backend_name", str);
            contentValues.put("priority", Integer.valueOf(PolarVoyageOrientationSensorPrimeAurora5884.PolarVoyageZipVortexCelestial6185(polarVoyageWithContextMasterSpeed4365)));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }
}
