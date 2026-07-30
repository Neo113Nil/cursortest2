package p000createpolar;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageStateListAnimatorGammaEpicEpic8366 extends SQLiteOpenHelper {
    public final int PolarVoyageItemDecorationUltraDeltaEpic7485;
    public boolean PolarVoyageStrictModeLegendEpic1532;
    public static final String PolarVoyageRotateAnimationCyberCelestialDelta4768 = "INSERT INTO global_log_event_state VALUES (" + System.currentTimeMillis() + ")";
    public static final int PolarVoyageBottomSheetOmegaNeo1907 = 5;
    public static final List PolarVoyageViewRogueMaster4778 = Arrays.asList(new PolarVoyageTextInputEditTextTurboOlympianTitanium4889(0), new PolarVoyageTextInputEditTextTurboOlympianTitanium4889(1), new PolarVoyageTextInputEditTextTurboOlympianTitanium4889(2), new PolarVoyageTextInputEditTextTurboOlympianTitanium4889(3), new PolarVoyageTextInputEditTextTurboOlympianTitanium4889(4));

    public PolarVoyageStateListAnimatorGammaEpicEpic8366(int i, Context context, String str) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i);
        this.PolarVoyageStrictModeLegendEpic1532 = false;
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = i;
    }

    public static void PolarVoyageMotionLayoutTransitionHeroVision4068(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        List list = PolarVoyageViewRogueMaster4778;
        if (i2 > list.size()) {
            throw new IllegalArgumentException("Migration from " + i + " to " + i2 + " was requested, but cannot be performed. Only " + list.size() + " migrations are provided");
        }
        while (i < i2) {
            switch (((PolarVoyageTextInputEditTextTurboOlympianTitanium4889) list.get(i)).PolarVoyageZipVortexCelestial6185) {
                case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                    sQLiteDatabase.execSQL("CREATE TABLE events (_id INTEGER PRIMARY KEY, context_id INTEGER NOT NULL, transport_name TEXT NOT NULL, timestamp_ms INTEGER NOT NULL, uptime_ms INTEGER NOT NULL, payload BLOB NOT NULL, code INTEGER, num_attempts INTEGER NOT NULL,FOREIGN KEY (context_id) REFERENCES transport_contexts(_id) ON DELETE CASCADE)");
                    sQLiteDatabase.execSQL("CREATE TABLE event_metadata (_id INTEGER PRIMARY KEY, event_id INTEGER NOT NULL, name TEXT NOT NULL, value TEXT NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE)");
                    sQLiteDatabase.execSQL("CREATE TABLE transport_contexts (_id INTEGER PRIMARY KEY, backend_name TEXT NOT NULL, priority INTEGER NOT NULL, next_request_ms INTEGER NOT NULL)");
                    sQLiteDatabase.execSQL("CREATE INDEX events_backend_id on events(context_id)");
                    sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority on transport_contexts(backend_name, priority)");
                    break;
                case 1:
                    sQLiteDatabase.execSQL("ALTER TABLE transport_contexts ADD COLUMN extras BLOB");
                    sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority_extras on transport_contexts(backend_name, priority, extras)");
                    sQLiteDatabase.execSQL("DROP INDEX contexts_backend_priority");
                    break;
                case 2:
                    sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
                    break;
                case 3:
                    sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN inline BOOLEAN NOT NULL DEFAULT 1");
                    sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
                    sQLiteDatabase.execSQL("CREATE TABLE event_payloads (sequence_num INTEGER NOT NULL, event_id INTEGER NOT NULL, bytes BLOB NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE,PRIMARY KEY (sequence_num, event_id))");
                    break;
                default:
                    sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
                    sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
                    sQLiteDatabase.execSQL("CREATE TABLE log_event_dropped (log_source VARCHAR(45) NOT NULL,reason INTEGER NOT NULL,events_dropped_count BIGINT NOT NULL,PRIMARY KEY(log_source, reason))");
                    sQLiteDatabase.execSQL("CREATE TABLE global_log_event_state (last_metrics_upload_ms BIGINT PRIMARY KEY)");
                    sQLiteDatabase.execSQL(PolarVoyageRotateAnimationCyberCelestialDelta4768);
                    break;
            }
            i++;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        this.PolarVoyageStrictModeLegendEpic1532 = true;
        sQLiteDatabase.rawQuery("PRAGMA busy_timeout=0;", new String[0]).close();
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        if (!this.PolarVoyageStrictModeLegendEpic1532) {
            onConfigure(sQLiteDatabase);
        }
        PolarVoyageMotionLayoutTransitionHeroVision4068(sQLiteDatabase, 0, this.PolarVoyageItemDecorationUltraDeltaEpic7485);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE events");
        sQLiteDatabase.execSQL("DROP TABLE event_metadata");
        sQLiteDatabase.execSQL("DROP TABLE transport_contexts");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        if (!this.PolarVoyageStrictModeLegendEpic1532) {
            onConfigure(sQLiteDatabase);
        }
        PolarVoyageMotionLayoutTransitionHeroVision4068(sQLiteDatabase, 0, i2);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        if (this.PolarVoyageStrictModeLegendEpic1532) {
            return;
        }
        onConfigure(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (!this.PolarVoyageStrictModeLegendEpic1532) {
            onConfigure(sQLiteDatabase);
        }
        PolarVoyageMotionLayoutTransitionHeroVision4068(sQLiteDatabase, i, i2);
    }
}
