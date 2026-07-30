package z2;

import a.AbstractC0169a;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.p;
import y2.InterfaceC1024a;
import y2.InterfaceC1026c;

/* loaded from: classes.dex */
public class c extends SQLiteOpenHelper implements InterfaceC1026c {
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
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ c(o oVar, Context context, int i2, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(oVar, context, (i5 & 4) != 0 ? DB_VERSION : i2);
    }

    private final SQLiteDatabase getSQLiteDatabase() {
        SQLiteDatabase writableDatabase;
        synchronized (LOCK) {
            try {
                writableDatabase = getWritableDatabase();
                Intrinsics.b(writableDatabase);
            } catch (SQLiteCantOpenDatabaseException e7) {
                throw e7;
            } catch (SQLiteDatabaseLockedException e8) {
                throw e8;
            }
        }
        return writableDatabase;
    }

    private final SQLiteDatabase getSQLiteDatabaseWithRetries() {
        SQLiteDatabase sQLiteDatabase;
        synchronized (LOCK) {
            int i2 = 0;
            while (true) {
                try {
                    sQLiteDatabase = getSQLiteDatabase();
                } catch (SQLiteCantOpenDatabaseException e7) {
                    i2++;
                    if (i2 >= 5) {
                        throw e7;
                    }
                    SystemClock.sleep(i2 * DB_OPEN_RETRY_BACKOFF);
                } catch (SQLiteDatabaseLockedException e8) {
                    i2++;
                    if (i2 >= 5) {
                        throw e8;
                    }
                    SystemClock.sleep(i2 * DB_OPEN_RETRY_BACKOFF);
                }
            }
        }
        return sQLiteDatabase;
    }

    private final synchronized void internalOnUpgrade(SQLiteDatabase sQLiteDatabase, int i2, int i5) {
        if (i2 < 2 && i5 >= 2) {
            try {
                upgradeToV2(sQLiteDatabase);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (i2 < 3 && i5 >= 3) {
            upgradeToV3(sQLiteDatabase);
        }
        if (i2 < 4 && i5 >= 4) {
            upgradeToV4(sQLiteDatabase);
        }
        if (i2 < 5 && i5 >= 5) {
            upgradeToV5(sQLiteDatabase);
        }
        if (i2 == 5 && i5 >= 6) {
            upgradeFromV5ToV6(sQLiteDatabase);
        }
        if (i2 < 7 && i5 >= 7) {
            upgradeToV7(sQLiteDatabase);
        }
        if (i2 < 8 && i5 >= 8) {
            upgradeToV8(sQLiteDatabase);
        }
        if (i2 < DB_VERSION && i5 >= DB_VERSION) {
            upgradeToV9(sQLiteDatabase);
        }
    }

    private final void safeExecSQL(SQLiteDatabase sQLiteDatabase, String str) {
        try {
            sQLiteDatabase.execSQL(str);
        } catch (SQLiteException e7) {
            e7.printStackTrace();
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

    @Override // y2.InterfaceC1026c
    public void delete(String table, String str, String[] strArr) {
        String str2;
        String str3;
        Intrinsics.checkNotNullParameter(table, "table");
        synchronized (LOCK) {
            SQLiteDatabase sQLiteDatabaseWithRetries = getSQLiteDatabaseWithRetries();
            try {
                try {
                    sQLiteDatabaseWithRetries.beginTransaction();
                    sQLiteDatabaseWithRetries.delete(table, str, strArr);
                    sQLiteDatabaseWithRetries.setTransactionSuccessful();
                } finally {
                }
            } catch (SQLiteException e7) {
                com.onesignal.debug.internal.logging.b.error("Error deleting on table: " + table + " with whereClause: " + str + " and whereArgs: " + strArr, e7);
                try {
                    sQLiteDatabaseWithRetries.endTransaction();
                } catch (SQLiteException e8) {
                    e = e8;
                    str3 = "Error closing transaction! ";
                    com.onesignal.debug.internal.logging.b.error(str3, e);
                    Unit unit = Unit.f6114a;
                } catch (IllegalStateException e9) {
                    e = e9;
                    str2 = "Error closing transaction! ";
                    com.onesignal.debug.internal.logging.b.error(str2, e);
                    Unit unit2 = Unit.f6114a;
                }
            } catch (IllegalStateException e10) {
                com.onesignal.debug.internal.logging.b.error("Error under delete transaction under table: " + table + " with whereClause: " + str + " and whereArgs: " + strArr, e10);
                try {
                    sQLiteDatabaseWithRetries.endTransaction();
                } catch (SQLiteException e11) {
                    e = e11;
                    str3 = "Error closing transaction! ";
                    com.onesignal.debug.internal.logging.b.error(str3, e);
                    Unit unit22 = Unit.f6114a;
                } catch (IllegalStateException e12) {
                    e = e12;
                    str2 = "Error closing transaction! ";
                    com.onesignal.debug.internal.logging.b.error(str2, e);
                    Unit unit222 = Unit.f6114a;
                }
            }
            try {
                sQLiteDatabaseWithRetries.endTransaction();
            } catch (SQLiteException e13) {
                e = e13;
                str3 = "Error closing transaction! ";
                com.onesignal.debug.internal.logging.b.error(str3, e);
                Unit unit2222 = Unit.f6114a;
            } catch (IllegalStateException e14) {
                e = e14;
                str2 = "Error closing transaction! ";
                com.onesignal.debug.internal.logging.b.error(str2, e);
                Unit unit22222 = Unit.f6114a;
            }
            Unit unit222222 = Unit.f6114a;
        }
    }

    @Override // y2.InterfaceC1026c
    public void insert(String table, String str, ContentValues contentValues) {
        String str2;
        String str3;
        Intrinsics.checkNotNullParameter(table, "table");
        synchronized (LOCK) {
            SQLiteDatabase sQLiteDatabaseWithRetries = getSQLiteDatabaseWithRetries();
            try {
                try {
                    sQLiteDatabaseWithRetries.beginTransaction();
                    sQLiteDatabaseWithRetries.insert(table, str, contentValues);
                    sQLiteDatabaseWithRetries.setTransactionSuccessful();
                } finally {
                }
            } catch (SQLiteException e7) {
                com.onesignal.debug.internal.logging.b.error("Error inserting on table: " + table + " with nullColumnHack: " + str + " and values: " + contentValues, e7);
                try {
                    sQLiteDatabaseWithRetries.endTransaction();
                } catch (SQLiteException e8) {
                    e = e8;
                    str3 = "Error closing transaction! ";
                    com.onesignal.debug.internal.logging.b.error(str3, e);
                    Unit unit = Unit.f6114a;
                } catch (IllegalStateException e9) {
                    e = e9;
                    str2 = "Error closing transaction! ";
                    com.onesignal.debug.internal.logging.b.error(str2, e);
                    Unit unit2 = Unit.f6114a;
                }
            } catch (IllegalStateException e10) {
                com.onesignal.debug.internal.logging.b.error("Error under inserting transaction under table: " + table + " with nullColumnHack: " + str + " and values: " + contentValues, e10);
                try {
                    sQLiteDatabaseWithRetries.endTransaction();
                } catch (SQLiteException e11) {
                    e = e11;
                    str3 = "Error closing transaction! ";
                    com.onesignal.debug.internal.logging.b.error(str3, e);
                    Unit unit22 = Unit.f6114a;
                } catch (IllegalStateException e12) {
                    e = e12;
                    str2 = "Error closing transaction! ";
                    com.onesignal.debug.internal.logging.b.error(str2, e);
                    Unit unit222 = Unit.f6114a;
                }
            }
            try {
                sQLiteDatabaseWithRetries.endTransaction();
            } catch (SQLiteException e13) {
                e = e13;
                str3 = "Error closing transaction! ";
                com.onesignal.debug.internal.logging.b.error(str3, e);
                Unit unit2222 = Unit.f6114a;
            } catch (IllegalStateException e14) {
                e = e14;
                str2 = "Error closing transaction! ";
                com.onesignal.debug.internal.logging.b.error(str2, e);
                Unit unit22222 = Unit.f6114a;
            }
            Unit unit222222 = Unit.f6114a;
        }
    }

    @Override // y2.InterfaceC1026c
    public void insertOrThrow(String table, String str, ContentValues contentValues) {
        String str2;
        String str3;
        Intrinsics.checkNotNullParameter(table, "table");
        synchronized (LOCK) {
            SQLiteDatabase sQLiteDatabaseWithRetries = getSQLiteDatabaseWithRetries();
            try {
                try {
                    sQLiteDatabaseWithRetries.beginTransaction();
                    sQLiteDatabaseWithRetries.insertOrThrow(table, str, contentValues);
                    sQLiteDatabaseWithRetries.setTransactionSuccessful();
                } finally {
                }
            } catch (SQLiteException e7) {
                com.onesignal.debug.internal.logging.b.error("Error inserting or throw on table: " + table + " with nullColumnHack: " + str + " and values: " + contentValues, e7);
                try {
                    sQLiteDatabaseWithRetries.endTransaction();
                } catch (SQLiteException e8) {
                    e = e8;
                    str3 = "Error closing transaction! ";
                    com.onesignal.debug.internal.logging.b.error(str3, e);
                    Unit unit = Unit.f6114a;
                } catch (IllegalStateException e9) {
                    e = e9;
                    str2 = "Error closing transaction! ";
                    com.onesignal.debug.internal.logging.b.error(str2, e);
                    Unit unit2 = Unit.f6114a;
                }
            } catch (IllegalStateException e10) {
                com.onesignal.debug.internal.logging.b.error("Error under inserting or throw transaction under table: " + table + " with nullColumnHack: " + str + " and values: " + contentValues, e10);
                try {
                    sQLiteDatabaseWithRetries.endTransaction();
                } catch (SQLiteException e11) {
                    e = e11;
                    str3 = "Error closing transaction! ";
                    com.onesignal.debug.internal.logging.b.error(str3, e);
                    Unit unit22 = Unit.f6114a;
                } catch (IllegalStateException e12) {
                    e = e12;
                    str2 = "Error closing transaction! ";
                    com.onesignal.debug.internal.logging.b.error(str2, e);
                    Unit unit222 = Unit.f6114a;
                }
            }
            try {
                sQLiteDatabaseWithRetries.endTransaction();
            } catch (SQLiteException e13) {
                e = e13;
                str3 = "Error closing transaction! ";
                com.onesignal.debug.internal.logging.b.error(str3, e);
                Unit unit2222 = Unit.f6114a;
            } catch (IllegalStateException e14) {
                e = e14;
                str2 = "Error closing transaction! ";
                com.onesignal.debug.internal.logging.b.error(str2, e);
                Unit unit22222 = Unit.f6114a;
            }
            Unit unit222222 = Unit.f6114a;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase db) {
        Intrinsics.checkNotNullParameter(db, "db");
        db.execSQL(SQL_CREATE_ENTRIES);
        db.execSQL("CREATE TABLE outcome (_id INTEGER PRIMARY KEY,notification_influence_type TEXT,iam_influence_type TEXT,notification_ids TEXT,iam_ids TEXT,name TEXT,timestamp TIMESTAMP,weight FLOAT,session_time INTEGER);");
        db.execSQL("CREATE TABLE cached_unique_outcome (_id INTEGER PRIMARY KEY,channel_influence_id TEXT,channel_type TEXT,name TEXT);");
        db.execSQL(SQL_CREATE_IN_APP_MESSAGE_ENTRIES);
        for (String str : SQL_INDEX_ENTRIES) {
            db.execSQL(str);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase db, int i2, int i5) {
        int i7;
        Intrinsics.checkNotNullParameter(db, "db");
        com.onesignal.debug.internal.logging.b.warn$default("SDK version rolled back! Clearing OneSignal.db as it could be in an unexpected state.", null, 2, null);
        Cursor rawQuery = db.rawQuery("SELECT name FROM sqlite_master WHERE type='table'", null);
        try {
            ArrayList arrayList = new ArrayList(rawQuery.getCount());
            while (true) {
                i7 = 0;
                if (!rawQuery.moveToNext()) {
                    break;
                }
                String string = rawQuery.getString(0);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                arrayList.add(string);
            }
            int size = arrayList.size();
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                String str = (String) obj;
                if (!p.l(str, "sqlite_")) {
                    db.execSQL("DROP TABLE IF EXISTS " + str);
                }
            }
            Unit unit = Unit.f6114a;
            rawQuery.close();
            onCreate(db);
        } finally {
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase db, int i2, int i5) {
        Intrinsics.checkNotNullParameter(db, "db");
        com.onesignal.debug.internal.logging.b.debug$default("OneSignal Database onUpgrade from: " + i2 + " to: " + i5, null, 2, null);
        try {
            internalOnUpgrade(db, i2, i5);
        } catch (SQLiteException e7) {
            com.onesignal.debug.internal.logging.b.error("Error in upgrade, migration may have already run! Skipping!", e7);
        }
    }

    @Override // y2.InterfaceC1026c
    public void query(String table, String[] strArr, String str, String[] strArr2, String str2, String str3, String str4, String str5, Function1<? super InterfaceC1024a, Unit> action) {
        Cursor query;
        Intrinsics.checkNotNullParameter(table, "table");
        Intrinsics.checkNotNullParameter(action, "action");
        synchronized (LOCK) {
            try {
                if (str5 == null) {
                    query = getSQLiteDatabaseWithRetries().query(table, strArr, str, strArr2, str2, str3, str4);
                    Intrinsics.checkNotNullExpressionValue(query, "query(...)");
                } else {
                    query = getSQLiteDatabaseWithRetries().query(table, strArr, str, strArr2, str2, str3, str4, str5);
                    Intrinsics.checkNotNullExpressionValue(query, "query(...)");
                }
                Unit unit = Unit.f6114a;
            } catch (Throwable th) {
                throw th;
            }
        }
        try {
            action.invoke(new C1055a(query));
            AbstractC0169a.d(query, null);
        } finally {
        }
    }

    @Override // y2.InterfaceC1026c
    public int update(String table, ContentValues values, String str, String[] strArr) {
        String str2;
        String str3;
        Intrinsics.checkNotNullParameter(table, "table");
        Intrinsics.checkNotNullParameter(values, "values");
        String contentValues = values.toString();
        Intrinsics.checkNotNullExpressionValue(contentValues, "toString(...)");
        int i2 = 0;
        if (contentValues.length() == 0) {
            return 0;
        }
        synchronized (LOCK) {
            SQLiteDatabase sQLiteDatabaseWithRetries = getSQLiteDatabaseWithRetries();
            try {
                try {
                    sQLiteDatabaseWithRetries.beginTransaction();
                    i2 = sQLiteDatabaseWithRetries.update(table, values, str, strArr);
                    sQLiteDatabaseWithRetries.setTransactionSuccessful();
                    try {
                        sQLiteDatabaseWithRetries.endTransaction();
                    } catch (SQLiteException e7) {
                        e = e7;
                        str3 = "Error closing transaction! ";
                        com.onesignal.debug.internal.logging.b.error(str3, e);
                        Unit unit = Unit.f6114a;
                        return i2;
                    } catch (IllegalStateException e8) {
                        e = e8;
                        str2 = "Error closing transaction! ";
                        com.onesignal.debug.internal.logging.b.error(str2, e);
                        Unit unit2 = Unit.f6114a;
                        return i2;
                    }
                } finally {
                }
            } catch (SQLiteException e9) {
                com.onesignal.debug.internal.logging.b.error("Error updating on table: " + table + " with whereClause: " + str + " and whereArgs: " + strArr, e9);
                try {
                    sQLiteDatabaseWithRetries.endTransaction();
                } catch (SQLiteException e10) {
                    e = e10;
                    str3 = "Error closing transaction! ";
                    com.onesignal.debug.internal.logging.b.error(str3, e);
                    Unit unit22 = Unit.f6114a;
                    return i2;
                } catch (IllegalStateException e11) {
                    e = e11;
                    str2 = "Error closing transaction! ";
                    com.onesignal.debug.internal.logging.b.error(str2, e);
                    Unit unit222 = Unit.f6114a;
                    return i2;
                }
            } catch (IllegalStateException e12) {
                com.onesignal.debug.internal.logging.b.error("Error under update transaction under table: " + table + " with whereClause: " + str + " and whereArgs: " + strArr, e12);
                try {
                    sQLiteDatabaseWithRetries.endTransaction();
                } catch (SQLiteException e13) {
                    e = e13;
                    str3 = "Error closing transaction! ";
                    com.onesignal.debug.internal.logging.b.error(str3, e);
                    Unit unit2222 = Unit.f6114a;
                    return i2;
                } catch (IllegalStateException e14) {
                    e = e14;
                    str2 = "Error closing transaction! ";
                    com.onesignal.debug.internal.logging.b.error(str2, e);
                    Unit unit22222 = Unit.f6114a;
                    return i2;
                }
            }
            Unit unit222222 = Unit.f6114a;
        }
        return i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(o _outcomeTableProvider, Context context, int i2) {
        super(context, DATABASE_NAME, (SQLiteDatabase.CursorFactory) null, i2);
        Intrinsics.checkNotNullParameter(_outcomeTableProvider, "_outcomeTableProvider");
        this._outcomeTableProvider = _outcomeTableProvider;
    }
}
