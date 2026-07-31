package X1;

import F5.q;
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
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import x5.InterfaceC0743l;

/* loaded from: classes.dex */
public class c extends SQLiteOpenHelper implements W1.c {
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

    public static final class a {
        public /* synthetic */ a(e eVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ c(o oVar, Context context, int i7, int i8, e eVar) {
        this(oVar, context, (i8 & 4) != 0 ? DB_VERSION : i7);
    }

    private final SQLiteDatabase getSQLiteDatabase() {
        SQLiteDatabase writableDatabase;
        synchronized (LOCK) {
            try {
                writableDatabase = getWritableDatabase();
                i.b(writableDatabase);
            } catch (SQLiteCantOpenDatabaseException e4) {
                throw e4;
            } catch (SQLiteDatabaseLockedException e7) {
                throw e7;
            }
        }
        return writableDatabase;
    }

    private final SQLiteDatabase getSQLiteDatabaseWithRetries() {
        SQLiteDatabase sQLiteDatabase;
        synchronized (LOCK) {
            int i7 = 0;
            while (true) {
                try {
                    sQLiteDatabase = getSQLiteDatabase();
                } catch (SQLiteCantOpenDatabaseException e4) {
                    i7++;
                    if (i7 >= DB_OPEN_RETRY_MAX) {
                        throw e4;
                    }
                    SystemClock.sleep(i7 * DB_OPEN_RETRY_BACKOFF);
                } catch (SQLiteDatabaseLockedException e7) {
                    i7++;
                    if (i7 >= DB_OPEN_RETRY_MAX) {
                        throw e7;
                    }
                    SystemClock.sleep(i7 * DB_OPEN_RETRY_BACKOFF);
                }
            }
        }
        return sQLiteDatabase;
    }

    private final synchronized void internalOnUpgrade(SQLiteDatabase sQLiteDatabase, int i7, int i8) {
        if (i7 < 2 && i8 >= 2) {
            try {
                upgradeToV2(sQLiteDatabase);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (i7 < 3 && i8 >= 3) {
            upgradeToV3(sQLiteDatabase);
        }
        if (i7 < 4 && i8 >= 4) {
            upgradeToV4(sQLiteDatabase);
        }
        if (i7 < DB_OPEN_RETRY_MAX && i8 >= DB_OPEN_RETRY_MAX) {
            upgradeToV5(sQLiteDatabase);
        }
        if (i7 == DB_OPEN_RETRY_MAX && i8 >= 6) {
            upgradeFromV5ToV6(sQLiteDatabase);
        }
        if (i7 < 7 && i8 >= 7) {
            upgradeToV7(sQLiteDatabase);
        }
        if (i7 < 8 && i8 >= 8) {
            upgradeToV8(sQLiteDatabase);
        }
        if (i7 < DB_VERSION && i8 >= DB_VERSION) {
            upgradeToV9(sQLiteDatabase);
        }
    }

    private final void safeExecSQL(SQLiteDatabase sQLiteDatabase, String str) {
        try {
            sQLiteDatabase.execSQL(str);
        } catch (SQLiteException e4) {
            e4.printStackTrace();
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

    @Override // W1.c
    public void delete(String table, String str, String[] strArr) {
        String str2;
        String str3;
        i.e(table, "table");
        synchronized (LOCK) {
            SQLiteDatabase sQLiteDatabaseWithRetries = getSQLiteDatabaseWithRetries();
            try {
                try {
                    sQLiteDatabaseWithRetries.beginTransaction();
                    sQLiteDatabaseWithRetries.delete(table, str, strArr);
                    sQLiteDatabaseWithRetries.setTransactionSuccessful();
                } finally {
                }
            } catch (SQLiteException e4) {
                com.onesignal.debug.internal.logging.b.error("Error deleting on table: " + table + " with whereClause: " + str + " and whereArgs: " + strArr, e4);
                try {
                    sQLiteDatabaseWithRetries.endTransaction();
                } catch (SQLiteException e7) {
                    e = e7;
                    str3 = "Error closing transaction! ";
                    com.onesignal.debug.internal.logging.b.error(str3, e);
                } catch (IllegalStateException e8) {
                    e = e8;
                    str2 = "Error closing transaction! ";
                    com.onesignal.debug.internal.logging.b.error(str2, e);
                }
            } catch (IllegalStateException e9) {
                com.onesignal.debug.internal.logging.b.error("Error under delete transaction under table: " + table + " with whereClause: " + str + " and whereArgs: " + strArr, e9);
                try {
                    sQLiteDatabaseWithRetries.endTransaction();
                } catch (SQLiteException e10) {
                    e = e10;
                    str3 = "Error closing transaction! ";
                    com.onesignal.debug.internal.logging.b.error(str3, e);
                } catch (IllegalStateException e11) {
                    e = e11;
                    str2 = "Error closing transaction! ";
                    com.onesignal.debug.internal.logging.b.error(str2, e);
                }
            }
            try {
                sQLiteDatabaseWithRetries.endTransaction();
            } catch (SQLiteException e12) {
                e = e12;
                str3 = "Error closing transaction! ";
                com.onesignal.debug.internal.logging.b.error(str3, e);
            } catch (IllegalStateException e13) {
                e = e13;
                str2 = "Error closing transaction! ";
                com.onesignal.debug.internal.logging.b.error(str2, e);
            }
        }
    }

    @Override // W1.c
    public void insert(String table, String str, ContentValues contentValues) {
        String str2;
        String str3;
        i.e(table, "table");
        synchronized (LOCK) {
            SQLiteDatabase sQLiteDatabaseWithRetries = getSQLiteDatabaseWithRetries();
            try {
                try {
                    sQLiteDatabaseWithRetries.beginTransaction();
                    sQLiteDatabaseWithRetries.insert(table, str, contentValues);
                    sQLiteDatabaseWithRetries.setTransactionSuccessful();
                } finally {
                }
            } catch (SQLiteException e4) {
                com.onesignal.debug.internal.logging.b.error("Error inserting on table: " + table + " with nullColumnHack: " + str + " and values: " + contentValues, e4);
                try {
                    sQLiteDatabaseWithRetries.endTransaction();
                } catch (SQLiteException e7) {
                    e = e7;
                    str3 = "Error closing transaction! ";
                    com.onesignal.debug.internal.logging.b.error(str3, e);
                } catch (IllegalStateException e8) {
                    e = e8;
                    str2 = "Error closing transaction! ";
                    com.onesignal.debug.internal.logging.b.error(str2, e);
                }
            } catch (IllegalStateException e9) {
                com.onesignal.debug.internal.logging.b.error("Error under inserting transaction under table: " + table + " with nullColumnHack: " + str + " and values: " + contentValues, e9);
                try {
                    sQLiteDatabaseWithRetries.endTransaction();
                } catch (SQLiteException e10) {
                    e = e10;
                    str3 = "Error closing transaction! ";
                    com.onesignal.debug.internal.logging.b.error(str3, e);
                } catch (IllegalStateException e11) {
                    e = e11;
                    str2 = "Error closing transaction! ";
                    com.onesignal.debug.internal.logging.b.error(str2, e);
                }
            }
            try {
                sQLiteDatabaseWithRetries.endTransaction();
            } catch (SQLiteException e12) {
                e = e12;
                str3 = "Error closing transaction! ";
                com.onesignal.debug.internal.logging.b.error(str3, e);
            } catch (IllegalStateException e13) {
                e = e13;
                str2 = "Error closing transaction! ";
                com.onesignal.debug.internal.logging.b.error(str2, e);
            }
        }
    }

    @Override // W1.c
    public void insertOrThrow(String table, String str, ContentValues contentValues) {
        String str2;
        String str3;
        i.e(table, "table");
        synchronized (LOCK) {
            SQLiteDatabase sQLiteDatabaseWithRetries = getSQLiteDatabaseWithRetries();
            try {
                try {
                    sQLiteDatabaseWithRetries.beginTransaction();
                    sQLiteDatabaseWithRetries.insertOrThrow(table, str, contentValues);
                    sQLiteDatabaseWithRetries.setTransactionSuccessful();
                } finally {
                }
            } catch (SQLiteException e4) {
                com.onesignal.debug.internal.logging.b.error("Error inserting or throw on table: " + table + " with nullColumnHack: " + str + " and values: " + contentValues, e4);
                try {
                    sQLiteDatabaseWithRetries.endTransaction();
                } catch (SQLiteException e7) {
                    e = e7;
                    str3 = "Error closing transaction! ";
                    com.onesignal.debug.internal.logging.b.error(str3, e);
                } catch (IllegalStateException e8) {
                    e = e8;
                    str2 = "Error closing transaction! ";
                    com.onesignal.debug.internal.logging.b.error(str2, e);
                }
            } catch (IllegalStateException e9) {
                com.onesignal.debug.internal.logging.b.error("Error under inserting or throw transaction under table: " + table + " with nullColumnHack: " + str + " and values: " + contentValues, e9);
                try {
                    sQLiteDatabaseWithRetries.endTransaction();
                } catch (SQLiteException e10) {
                    e = e10;
                    str3 = "Error closing transaction! ";
                    com.onesignal.debug.internal.logging.b.error(str3, e);
                } catch (IllegalStateException e11) {
                    e = e11;
                    str2 = "Error closing transaction! ";
                    com.onesignal.debug.internal.logging.b.error(str2, e);
                }
            }
            try {
                sQLiteDatabaseWithRetries.endTransaction();
            } catch (SQLiteException e12) {
                e = e12;
                str3 = "Error closing transaction! ";
                com.onesignal.debug.internal.logging.b.error(str3, e);
            } catch (IllegalStateException e13) {
                e = e13;
                str2 = "Error closing transaction! ";
                com.onesignal.debug.internal.logging.b.error(str2, e);
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase db) {
        i.e(db, "db");
        db.execSQL(SQL_CREATE_ENTRIES);
        db.execSQL("CREATE TABLE outcome (_id INTEGER PRIMARY KEY,notification_influence_type TEXT,iam_influence_type TEXT,notification_ids TEXT,iam_ids TEXT,name TEXT,timestamp TIMESTAMP,weight FLOAT,session_time INTEGER);");
        db.execSQL("CREATE TABLE cached_unique_outcome (_id INTEGER PRIMARY KEY,channel_influence_id TEXT,channel_type TEXT,name TEXT);");
        db.execSQL(SQL_CREATE_IN_APP_MESSAGE_ENTRIES);
        for (String str : SQL_INDEX_ENTRIES) {
            db.execSQL(str);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase db, int i7, int i8) {
        int i9;
        i.e(db, "db");
        com.onesignal.debug.internal.logging.b.warn$default("SDK version rolled back! Clearing OneSignal.db as it could be in an unexpected state.", null, 2, null);
        Cursor rawQuery = db.rawQuery("SELECT name FROM sqlite_master WHERE type='table'", null);
        try {
            ArrayList arrayList = new ArrayList(rawQuery.getCount());
            while (true) {
                i9 = 0;
                if (!rawQuery.moveToNext()) {
                    break;
                }
                String string = rawQuery.getString(0);
                i.d(string, "getString(...)");
                arrayList.add(string);
            }
            int size = arrayList.size();
            while (i9 < size) {
                Object obj = arrayList.get(i9);
                i9++;
                String str = (String) obj;
                if (!q.I(str, "sqlite_")) {
                    db.execSQL("DROP TABLE IF EXISTS " + str);
                }
            }
            rawQuery.close();
            onCreate(db);
        } finally {
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase db, int i7, int i8) {
        i.e(db, "db");
        com.onesignal.debug.internal.logging.b.debug$default("OneSignal Database onUpgrade from: " + i7 + " to: " + i8, null, 2, null);
        try {
            internalOnUpgrade(db, i7, i8);
        } catch (SQLiteException e4) {
            com.onesignal.debug.internal.logging.b.error("Error in upgrade, migration may have already run! Skipping!", e4);
        }
    }

    @Override // W1.c
    public void query(String table, String[] strArr, String str, String[] strArr2, String str2, String str3, String str4, String str5, InterfaceC0743l action) {
        Cursor query;
        i.e(table, "table");
        i.e(action, "action");
        synchronized (LOCK) {
            try {
                if (str5 == null) {
                    query = getSQLiteDatabaseWithRetries().query(table, strArr, str, strArr2, str2, str3, str4);
                    i.d(query, "query(...)");
                } else {
                    query = getSQLiteDatabaseWithRetries().query(table, strArr, str, strArr2, str2, str3, str4, str5);
                    i.d(query, "query(...)");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        try {
            action.invoke(new X1.a(query));
            query.close();
        } finally {
        }
    }

    @Override // W1.c
    public int update(String table, ContentValues values, String str, String[] strArr) {
        String str2;
        String str3;
        i.e(table, "table");
        i.e(values, "values");
        String contentValues = values.toString();
        i.d(contentValues, "toString(...)");
        int i7 = 0;
        if (contentValues.length() == 0) {
            return 0;
        }
        synchronized (LOCK) {
            SQLiteDatabase sQLiteDatabaseWithRetries = getSQLiteDatabaseWithRetries();
            try {
                try {
                    sQLiteDatabaseWithRetries.beginTransaction();
                    i7 = sQLiteDatabaseWithRetries.update(table, values, str, strArr);
                    sQLiteDatabaseWithRetries.setTransactionSuccessful();
                    try {
                        sQLiteDatabaseWithRetries.endTransaction();
                    } catch (SQLiteException e4) {
                        e = e4;
                        str3 = "Error closing transaction! ";
                        com.onesignal.debug.internal.logging.b.error(str3, e);
                        return i7;
                    } catch (IllegalStateException e7) {
                        e = e7;
                        str2 = "Error closing transaction! ";
                        com.onesignal.debug.internal.logging.b.error(str2, e);
                        return i7;
                    }
                } finally {
                }
            } catch (SQLiteException e8) {
                com.onesignal.debug.internal.logging.b.error("Error updating on table: " + table + " with whereClause: " + str + " and whereArgs: " + strArr, e8);
                try {
                    sQLiteDatabaseWithRetries.endTransaction();
                } catch (SQLiteException e9) {
                    e = e9;
                    str3 = "Error closing transaction! ";
                    com.onesignal.debug.internal.logging.b.error(str3, e);
                    return i7;
                } catch (IllegalStateException e10) {
                    e = e10;
                    str2 = "Error closing transaction! ";
                    com.onesignal.debug.internal.logging.b.error(str2, e);
                    return i7;
                }
            } catch (IllegalStateException e11) {
                com.onesignal.debug.internal.logging.b.error("Error under update transaction under table: " + table + " with whereClause: " + str + " and whereArgs: " + strArr, e11);
                try {
                    sQLiteDatabaseWithRetries.endTransaction();
                } catch (SQLiteException e12) {
                    e = e12;
                    str3 = "Error closing transaction! ";
                    com.onesignal.debug.internal.logging.b.error(str3, e);
                    return i7;
                } catch (IllegalStateException e13) {
                    e = e13;
                    str2 = "Error closing transaction! ";
                    com.onesignal.debug.internal.logging.b.error(str2, e);
                    return i7;
                }
            }
        }
        return i7;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(o _outcomeTableProvider, Context context, int i7) {
        super(context, DATABASE_NAME, (SQLiteDatabase.CursorFactory) null, i7);
        i.e(_outcomeTableProvider, "_outcomeTableProvider");
        this._outcomeTableProvider = _outcomeTableProvider;
    }
}
