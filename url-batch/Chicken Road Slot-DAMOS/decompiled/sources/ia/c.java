package ia;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.SystemClock;
import com.onesignal.session.internal.outcomes.impl.o;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public class c extends SQLiteOpenHelper implements ha.c {
    private static final String COMMA_SEP = ",";
    private static final String DATABASE_NAME = "OneSignal.db";
    private static final int DB_OPEN_RETRY_BACKOFF = 400;
    private static final int DB_OPEN_RETRY_MAX = 5;
    private static final int DB_VERSION = 9;
    public static final int DEFAULT_TTL_IF_NOT_IN_PAYLOAD = 259200;
    private static final String FLOAT_TYPE = " FLOAT";
    private static final String INTEGER_PRIMARY_KEY_TYPE = " INTEGER PRIMARY KEY";
    private static final String INT_TYPE = " INTEGER";
    private static final String SQL_CREATE_ENTRIES = "CREATE TABLE notification (_id INTEGER PRIMARY KEY,notification_id TEXT,android_notification_id INTEGER,group_id TEXT,collapse_id TEXT,is_summary INTEGER DEFAULT 0,opened INTEGER DEFAULT 0,dismissed INTEGER DEFAULT 0,title TEXT,message TEXT,full_data TEXT,created_time TIMESTAMP DEFAULT (strftime('%s', 'now')),expire_time TIMESTAMP);";
    private static final String SQL_CREATE_IN_APP_MESSAGE_ENTRIES = "CREATE TABLE in_app_message (_id INTEGER PRIMARY KEY,display_quantity INTEGER,last_display INTEGER,message_id TEXT,displayed_in_session INTEGER,click_ids TEXT);";
    private static final String TEXT_TYPE = " TEXT";
    private static final String TIMESTAMP_TYPE = " TIMESTAMP";
    private final o _outcomeTableProvider;
    public static final a Companion = new a(null);
    private static final Object LOCK = new Object();
    private static final String[] SQL_INDEX_ENTRIES = {"CREATE INDEX notification_notification_id_idx ON notification(notification_id); ", "CREATE INDEX notification_android_notification_id_idx ON notification(android_notification_id); ", "CREATE INDEX notification_group_id_idx ON notification(group_id); ", "CREATE INDEX notification_collapse_id_idx ON notification(collapse_id); ", "CREATE INDEX notification_created_time_idx ON notification(created_time); ", "CREATE INDEX notification_expire_time_idx ON notification(expire_time); "};

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(o oVar, Context context, int i3) {
        super(context, DATABASE_NAME, (SQLiteDatabase.CursorFactory) null, i3);
        oVar.getClass();
        this._outcomeTableProvider = oVar;
    }

    private final SQLiteDatabase getSQLiteDatabase() {
        SQLiteDatabase writableDatabase;
        synchronized (LOCK) {
            try {
                writableDatabase = getWritableDatabase();
                writableDatabase.getClass();
            } catch (SQLiteCantOpenDatabaseException e2) {
                throw e2;
            } catch (SQLiteDatabaseLockedException e9) {
                throw e9;
            }
        }
        return writableDatabase;
    }

    private final SQLiteDatabase getSQLiteDatabaseWithRetries() {
        SQLiteDatabase sQLiteDatabase;
        synchronized (LOCK) {
            int i3 = 0;
            while (true) {
                try {
                    sQLiteDatabase = getSQLiteDatabase();
                } catch (SQLiteCantOpenDatabaseException e2) {
                    i3++;
                    if (i3 >= 5) {
                        throw e2;
                    }
                    SystemClock.sleep(i3 * DB_OPEN_RETRY_BACKOFF);
                } catch (SQLiteDatabaseLockedException e9) {
                    i3++;
                    if (i3 >= 5) {
                        throw e9;
                    }
                    SystemClock.sleep(i3 * DB_OPEN_RETRY_BACKOFF);
                }
            }
        }
        return sQLiteDatabase;
    }

    private final synchronized void internalOnUpgrade(SQLiteDatabase sQLiteDatabase, int i3, int i10) {
        if (i3 < 2 && i10 >= 2) {
            try {
                upgradeToV2(sQLiteDatabase);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (i3 < 3 && i10 >= 3) {
            upgradeToV3(sQLiteDatabase);
        }
        if (i3 < 4 && i10 >= 4) {
            upgradeToV4(sQLiteDatabase);
        }
        if (i3 < 5 && i10 >= 5) {
            upgradeToV5(sQLiteDatabase);
        }
        if (i3 == 5 && i10 >= 6) {
            upgradeFromV5ToV6(sQLiteDatabase);
        }
        if (i3 < 7 && i10 >= 7) {
            upgradeToV7(sQLiteDatabase);
        }
        if (i3 < 8 && i10 >= 8) {
            upgradeToV8(sQLiteDatabase);
        }
        if (i3 < DB_VERSION && i10 >= DB_VERSION) {
            upgradeToV9(sQLiteDatabase);
        }
    }

    private final void safeExecSQL(SQLiteDatabase sQLiteDatabase, String str) {
        try {
            sQLiteDatabase.execSQL(str);
        } catch (SQLiteException e2) {
            e2.printStackTrace();
        }
    }

    private final void upgradeFromV5ToV6(SQLiteDatabase sQLiteDatabase) {
        this._outcomeTableProvider.upgradeOutcomeTableRevision1To2(sQLiteDatabase);
    }

    private final void upgradeToV2(SQLiteDatabase sQLiteDatabase) {
        safeExecSQL(sQLiteDatabase, "ALTER TABLE notification ADD COLUMN collapse_id TEXT;");
        safeExecSQL(sQLiteDatabase, "CREATE INDEX notification_group_id_idx ON notification(group_id); ");
    }

    private final void upgradeToV3(SQLiteDatabase sQLiteDatabase) {
        safeExecSQL(sQLiteDatabase, "ALTER TABLE notification ADD COLUMN expire_time TIMESTAMP;");
        safeExecSQL(sQLiteDatabase, "UPDATE notification SET expire_time = created_time + 259200;");
        safeExecSQL(sQLiteDatabase, "CREATE INDEX notification_expire_time_idx ON notification(expire_time); ");
    }

    private final void upgradeToV4(SQLiteDatabase sQLiteDatabase) {
        safeExecSQL(sQLiteDatabase, "CREATE TABLE outcome (_id INTEGER PRIMARY KEY,notification_ids TEXT,name TEXT,session TEXT,params TEXT,timestamp TIMESTAMP);");
    }

    private final void upgradeToV5(SQLiteDatabase sQLiteDatabase) {
        safeExecSQL(sQLiteDatabase, "CREATE TABLE cached_unique_outcome_notification (_id INTEGER PRIMARY KEY,notification_id TEXT,name TEXT);");
        upgradeFromV5ToV6(sQLiteDatabase);
    }

    private final void upgradeToV7(SQLiteDatabase sQLiteDatabase) {
        safeExecSQL(sQLiteDatabase, SQL_CREATE_IN_APP_MESSAGE_ENTRIES);
    }

    private final synchronized void upgradeToV8(SQLiteDatabase sQLiteDatabase) {
        this._outcomeTableProvider.upgradeOutcomeTableRevision2To3(sQLiteDatabase);
        this._outcomeTableProvider.upgradeCacheOutcomeTableRevision1To2(sQLiteDatabase);
    }

    private final void upgradeToV9(SQLiteDatabase sQLiteDatabase) {
        this._outcomeTableProvider.upgradeOutcomeTableRevision3To4(sQLiteDatabase);
    }

    @Override // ha.c
    public void delete(String str, String str2, String[] strArr) {
        str.getClass();
        synchronized (LOCK) {
            SQLiteDatabase sQLiteDatabaseWithRetries = getSQLiteDatabaseWithRetries();
            try {
                try {
                    sQLiteDatabaseWithRetries.beginTransaction();
                    sQLiteDatabaseWithRetries.delete(str, str2, strArr);
                    sQLiteDatabaseWithRetries.setTransactionSuccessful();
                } catch (SQLiteException e2) {
                    com.onesignal.debug.internal.logging.b.error("Error deleting on table: " + str + " with whereClause: " + str2 + " and whereArgs: " + strArr, e2);
                } catch (IllegalStateException e9) {
                    com.onesignal.debug.internal.logging.b.error("Error under delete transaction under table: " + str + " with whereClause: " + str2 + " and whereArgs: " + strArr, e9);
                }
                try {
                    sQLiteDatabaseWithRetries.endTransaction();
                } catch (SQLiteException e10) {
                    com.onesignal.debug.internal.logging.b.error("Error closing transaction! ", e10);
                } catch (IllegalStateException e11) {
                    com.onesignal.debug.internal.logging.b.error("Error closing transaction! ", e11);
                }
            } catch (Throwable th) {
                try {
                    sQLiteDatabaseWithRetries.endTransaction();
                } catch (SQLiteException e12) {
                    com.onesignal.debug.internal.logging.b.error("Error closing transaction! ", e12);
                } catch (IllegalStateException e13) {
                    com.onesignal.debug.internal.logging.b.error("Error closing transaction! ", e13);
                }
                throw th;
            }
        }
    }

    @Override // ha.c
    public void insert(String str, String str2, ContentValues contentValues) {
        str.getClass();
        synchronized (LOCK) {
            SQLiteDatabase sQLiteDatabaseWithRetries = getSQLiteDatabaseWithRetries();
            try {
                try {
                    sQLiteDatabaseWithRetries.beginTransaction();
                    sQLiteDatabaseWithRetries.insert(str, str2, contentValues);
                    sQLiteDatabaseWithRetries.setTransactionSuccessful();
                } catch (SQLiteException e2) {
                    com.onesignal.debug.internal.logging.b.error("Error inserting on table: " + str + " with nullColumnHack: " + str2 + " and values: " + contentValues, e2);
                } catch (IllegalStateException e9) {
                    com.onesignal.debug.internal.logging.b.error("Error under inserting transaction under table: " + str + " with nullColumnHack: " + str2 + " and values: " + contentValues, e9);
                }
                try {
                    sQLiteDatabaseWithRetries.endTransaction();
                } catch (SQLiteException e10) {
                    com.onesignal.debug.internal.logging.b.error("Error closing transaction! ", e10);
                } catch (IllegalStateException e11) {
                    com.onesignal.debug.internal.logging.b.error("Error closing transaction! ", e11);
                }
            } catch (Throwable th) {
                try {
                    sQLiteDatabaseWithRetries.endTransaction();
                } catch (SQLiteException e12) {
                    com.onesignal.debug.internal.logging.b.error("Error closing transaction! ", e12);
                } catch (IllegalStateException e13) {
                    com.onesignal.debug.internal.logging.b.error("Error closing transaction! ", e13);
                }
                throw th;
            }
        }
    }

    @Override // ha.c
    public void insertOrThrow(String str, String str2, ContentValues contentValues) {
        str.getClass();
        synchronized (LOCK) {
            SQLiteDatabase sQLiteDatabaseWithRetries = getSQLiteDatabaseWithRetries();
            try {
                try {
                    sQLiteDatabaseWithRetries.beginTransaction();
                    sQLiteDatabaseWithRetries.insertOrThrow(str, str2, contentValues);
                    sQLiteDatabaseWithRetries.setTransactionSuccessful();
                } catch (SQLiteException e2) {
                    com.onesignal.debug.internal.logging.b.error("Error inserting or throw on table: " + str + " with nullColumnHack: " + str2 + " and values: " + contentValues, e2);
                } catch (IllegalStateException e9) {
                    com.onesignal.debug.internal.logging.b.error("Error under inserting or throw transaction under table: " + str + " with nullColumnHack: " + str2 + " and values: " + contentValues, e9);
                }
                try {
                    sQLiteDatabaseWithRetries.endTransaction();
                } catch (SQLiteException e10) {
                    com.onesignal.debug.internal.logging.b.error("Error closing transaction! ", e10);
                } catch (IllegalStateException e11) {
                    com.onesignal.debug.internal.logging.b.error("Error closing transaction! ", e11);
                }
            } catch (Throwable th) {
                try {
                    sQLiteDatabaseWithRetries.endTransaction();
                } catch (SQLiteException e12) {
                    com.onesignal.debug.internal.logging.b.error("Error closing transaction! ", e12);
                } catch (IllegalStateException e13) {
                    com.onesignal.debug.internal.logging.b.error("Error closing transaction! ", e13);
                }
                throw th;
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        sQLiteDatabase.execSQL(SQL_CREATE_ENTRIES);
        sQLiteDatabase.execSQL("CREATE TABLE outcome (_id INTEGER PRIMARY KEY,notification_influence_type TEXT,iam_influence_type TEXT,notification_ids TEXT,iam_ids TEXT,name TEXT,timestamp TIMESTAMP,weight FLOAT,session_time INTEGER);");
        sQLiteDatabase.execSQL("CREATE TABLE cached_unique_outcome (_id INTEGER PRIMARY KEY,channel_influence_id TEXT,channel_type TEXT,name TEXT);");
        sQLiteDatabase.execSQL(SQL_CREATE_IN_APP_MESSAGE_ENTRIES);
        for (String str : SQL_INDEX_ENTRIES) {
            sQLiteDatabase.execSQL(str);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i3, int i10) {
        int i11;
        sQLiteDatabase.getClass();
        com.onesignal.debug.internal.logging.b.warn$default("SDK version rolled back! Clearing OneSignal.db as it could be in an unexpected state.", null, 2, null);
        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT name FROM sqlite_master WHERE type='table'", null);
        try {
            ArrayList arrayList = new ArrayList(rawQuery.getCount());
            while (true) {
                i11 = 0;
                if (!rawQuery.moveToNext()) {
                    break;
                }
                String string = rawQuery.getString(0);
                string.getClass();
                arrayList.add(string);
            }
            int size = arrayList.size();
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                String str = (String) obj;
                if (!kotlin.text.o.h(str, "sqlite_")) {
                    sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + str);
                }
            }
            rawQuery.close();
            onCreate(sQLiteDatabase);
        } finally {
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i3, int i10) {
        sQLiteDatabase.getClass();
        com.onesignal.debug.internal.logging.b.debug$default("OneSignal Database onUpgrade from: " + i3 + " to: " + i10, null, 2, null);
        try {
            internalOnUpgrade(sQLiteDatabase, i3, i10);
        } catch (SQLiteException e2) {
            com.onesignal.debug.internal.logging.b.error("Error in upgrade, migration may have already run! Skipping!", e2);
        }
    }

    @Override // ha.c
    public void query(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5, String str6, Function1<? super ha.a, Unit> function1) {
        Cursor query;
        str.getClass();
        function1.getClass();
        synchronized (LOCK) {
            try {
                if (str6 == null) {
                    query = getSQLiteDatabaseWithRetries().query(str, strArr, str2, strArr2, str3, str4, str5);
                    query.getClass();
                } else {
                    query = getSQLiteDatabaseWithRetries().query(str, strArr, str2, strArr2, str3, str4, str5, str6);
                    query.getClass();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        try {
            function1.invoke(new ia.a(query));
            i7.a.G(query, null);
        } finally {
        }
    }

    @Override // ha.c
    public int update(String str, ContentValues contentValues, String str2, String[] strArr) {
        str.getClass();
        contentValues.getClass();
        String contentValues2 = contentValues.toString();
        contentValues2.getClass();
        int i3 = 0;
        if (contentValues2.length() == 0) {
            return 0;
        }
        synchronized (LOCK) {
            SQLiteDatabase sQLiteDatabaseWithRetries = getSQLiteDatabaseWithRetries();
            try {
                try {
                    sQLiteDatabaseWithRetries.beginTransaction();
                    i3 = sQLiteDatabaseWithRetries.update(str, contentValues, str2, strArr);
                    sQLiteDatabaseWithRetries.setTransactionSuccessful();
                } catch (SQLiteException e2) {
                    com.onesignal.debug.internal.logging.b.error("Error updating on table: " + str + " with whereClause: " + str2 + " and whereArgs: " + strArr, e2);
                } catch (IllegalStateException e9) {
                    com.onesignal.debug.internal.logging.b.error("Error under update transaction under table: " + str + " with whereClause: " + str2 + " and whereArgs: " + strArr, e9);
                }
                try {
                    sQLiteDatabaseWithRetries.endTransaction();
                } catch (SQLiteException e10) {
                    com.onesignal.debug.internal.logging.b.error("Error closing transaction! ", e10);
                } catch (IllegalStateException e11) {
                    com.onesignal.debug.internal.logging.b.error("Error closing transaction! ", e11);
                }
            } catch (Throwable th) {
                try {
                    sQLiteDatabaseWithRetries.endTransaction();
                } catch (SQLiteException e12) {
                    com.onesignal.debug.internal.logging.b.error("Error closing transaction! ", e12);
                } catch (IllegalStateException e13) {
                    com.onesignal.debug.internal.logging.b.error("Error closing transaction! ", e13);
                }
                throw th;
            }
        }
        return i3;
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ c(o oVar, Context context, int i3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(oVar, context, (i10 & 4) != 0 ? DB_VERSION : i3);
    }
}
