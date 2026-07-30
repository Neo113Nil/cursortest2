package p000createpolar;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageExoPlayerNeoDelta8060 implements Closeable {
    public static final PolarVoyageSharedFlowCosmosAlpha1205 PolarVoyageCameraPixelBlaze2629 = new PolarVoyageSharedFlowCosmosAlpha1205("proto");
    public final PolarVoyageCameraViewHyperPhantom1342 PolarVoyageBottomSheetOmegaNeo1907;
    public final PolarVoyageStateListAnimatorGammaEpicEpic8366 PolarVoyageItemDecorationUltraDeltaEpic7485;
    public final PolarVoyageRippleDrawablePrimeSpeedMax5890 PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public final PolarVoyageRippleDrawablePrimeSpeedMax5890 PolarVoyageStrictModeLegendEpic1532;
    public final PolarVoyageDebugCelestialNebula7743 PolarVoyageViewRogueMaster4778;

    public PolarVoyageExoPlayerNeoDelta8060(PolarVoyageRippleDrawablePrimeSpeedMax5890 polarVoyageRippleDrawablePrimeSpeedMax5890, PolarVoyageRippleDrawablePrimeSpeedMax5890 polarVoyageRippleDrawablePrimeSpeedMax58902, PolarVoyageCameraViewHyperPhantom1342 polarVoyageCameraViewHyperPhantom1342, PolarVoyageStateListAnimatorGammaEpicEpic8366 polarVoyageStateListAnimatorGammaEpicEpic8366, PolarVoyageDebugCelestialNebula7743 polarVoyageDebugCelestialNebula7743) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = polarVoyageStateListAnimatorGammaEpicEpic8366;
        this.PolarVoyageStrictModeLegendEpic1532 = polarVoyageRippleDrawablePrimeSpeedMax5890;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = polarVoyageRippleDrawablePrimeSpeedMax58902;
        this.PolarVoyageBottomSheetOmegaNeo1907 = polarVoyageCameraViewHyperPhantom1342;
        this.PolarVoyageViewRogueMaster4778 = polarVoyageDebugCelestialNebula7743;
    }

    public static Long PolarVoyageBarcodeScannerInfernoSolarSpark7767(SQLiteDatabase sQLiteDatabase, PolarVoyageLayoutInfernoSpeed9711 polarVoyageLayoutInfernoSpeed9711) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(polarVoyageLayoutInfernoSpeed9711.PolarVoyageZipVortexCelestial6185, String.valueOf(PolarVoyageOrientationSensorPrimeAurora5884.PolarVoyageZipVortexCelestial6185(polarVoyageLayoutInfernoSpeed9711.PolarVoyageKotlinBetaPulseBeta3653))));
        byte[] bArr = polarVoyageLayoutInfernoSpeed9711.PolarVoyageMotionLayoutTransitionHeroVision4068;
        if (bArr != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(bArr, 0));
        } else {
            sb.append(" and extras is null");
        }
        Cursor query = sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null);
        try {
            return !query.moveToNext() ? null : Long.valueOf(query.getLong(0));
        } finally {
            query.close();
        }
    }

    public static String PolarVoyageCameraPixelBlaze2629(Iterable iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(((PolarVoyageLaunchInfernoVision5784) it.next()).PolarVoyageZipVortexCelestial6185);
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public static Object PolarVoyageDrawableDeltaHyperion5742(Cursor cursor, PolarVoyageGuidelineForceNebulaPhoenix2255 polarVoyageGuidelineForceNebulaPhoenix2255) {
        try {
            return polarVoyageGuidelineForceNebulaPhoenix2255.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    public final Object PolarVoyageBitmapVisionAuroraPixel4705(PolarVoyageGuidelineForceNebulaPhoenix2255 polarVoyageGuidelineForceNebulaPhoenix2255) {
        SQLiteDatabase PolarVoyageMotionLayoutTransitionHeroVision4068 = PolarVoyageMotionLayoutTransitionHeroVision4068();
        PolarVoyageMotionLayoutTransitionHeroVision4068.beginTransaction();
        try {
            Object apply = polarVoyageGuidelineForceNebulaPhoenix2255.apply(PolarVoyageMotionLayoutTransitionHeroVision4068);
            PolarVoyageMotionLayoutTransitionHeroVision4068.setTransactionSuccessful();
            return apply;
        } finally {
            PolarVoyageMotionLayoutTransitionHeroVision4068.endTransaction();
        }
    }

    public final ArrayList PolarVoyageDiffUtilTurboStrike5735(SQLiteDatabase sQLiteDatabase, PolarVoyageLayoutInfernoSpeed9711 polarVoyageLayoutInfernoSpeed9711, int i) {
        ArrayList arrayList = new ArrayList();
        Long PolarVoyageBarcodeScannerInfernoSolarSpark7767 = PolarVoyageBarcodeScannerInfernoSolarSpark7767(sQLiteDatabase, polarVoyageLayoutInfernoSpeed9711);
        if (PolarVoyageBarcodeScannerInfernoSolarSpark7767 == null) {
            return arrayList;
        }
        PolarVoyageDrawableDeltaHyperion5742(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{PolarVoyageBarcodeScannerInfernoSolarSpark7767.toString()}, null, null, null, String.valueOf(i)), new PolarVoyageGraphDeltaPulse1659(this, arrayList, polarVoyageLayoutInfernoSpeed9711, 4));
        return arrayList;
    }

    public final SQLiteDatabase PolarVoyageMotionLayoutTransitionHeroVision4068() {
        PolarVoyageStateListAnimatorGammaEpicEpic8366 polarVoyageStateListAnimatorGammaEpicEpic8366 = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        Objects.requireNonNull(polarVoyageStateListAnimatorGammaEpicEpic8366);
        PolarVoyageRippleDrawablePrimeSpeedMax5890 polarVoyageRippleDrawablePrimeSpeedMax5890 = this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        long PolarVoyageZipVortexCelestial6185 = polarVoyageRippleDrawablePrimeSpeedMax5890.PolarVoyageZipVortexCelestial6185();
        while (true) {
            try {
                return polarVoyageStateListAnimatorGammaEpicEpic8366.getWritableDatabase();
            } catch (SQLiteDatabaseLockedException e) {
                if (polarVoyageRippleDrawablePrimeSpeedMax5890.PolarVoyageZipVortexCelestial6185() >= this.PolarVoyageBottomSheetOmegaNeo1907.PolarVoyageKotlinBetaPulseBeta3653 + PolarVoyageZipVortexCelestial6185) {
                    throw new PolarVoyageThreadNeoDeltaThunder5906("Timed out while trying to open db.", e);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    public final Object PolarVoyageRotateAnimationCyberCelestialDelta4768(PolarVoyageFlowCollectorOmegaHyperion3803 polarVoyageFlowCollectorOmegaHyperion3803) {
        SQLiteDatabase PolarVoyageMotionLayoutTransitionHeroVision4068 = PolarVoyageMotionLayoutTransitionHeroVision4068();
        PolarVoyageRippleDrawablePrimeSpeedMax5890 polarVoyageRippleDrawablePrimeSpeedMax5890 = this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        long PolarVoyageZipVortexCelestial6185 = polarVoyageRippleDrawablePrimeSpeedMax5890.PolarVoyageZipVortexCelestial6185();
        while (true) {
            try {
                PolarVoyageMotionLayoutTransitionHeroVision4068.beginTransaction();
                try {
                    Object PolarVoyageKotlinBetaPulseBeta3653 = polarVoyageFlowCollectorOmegaHyperion3803.PolarVoyageKotlinBetaPulseBeta3653();
                    PolarVoyageMotionLayoutTransitionHeroVision4068.setTransactionSuccessful();
                    return PolarVoyageKotlinBetaPulseBeta3653;
                } finally {
                    PolarVoyageMotionLayoutTransitionHeroVision4068.endTransaction();
                }
            } catch (SQLiteDatabaseLockedException e) {
                if (polarVoyageRippleDrawablePrimeSpeedMax5890.PolarVoyageZipVortexCelestial6185() >= this.PolarVoyageBottomSheetOmegaNeo1907.PolarVoyageKotlinBetaPulseBeta3653 + PolarVoyageZipVortexCelestial6185) {
                    throw new PolarVoyageThreadNeoDeltaThunder5906("Timed out while trying to acquire the lock.", e);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    public final void PolarVoyageStrictModeLegendEpic1532(long j, PolarVoyageLocationListenerPulseTitan6571 polarVoyageLocationListenerPulseTitan6571, String str) {
        PolarVoyageBitmapVisionAuroraPixel4705(new PolarVoyageStrictModeSparkShadowStrike9158(j, str, polarVoyageLocationListenerPulseTitan6571));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485.close();
    }
}
