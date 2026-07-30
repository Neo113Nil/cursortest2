package com.amplitude.reactnative;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* compiled from: LegacyDatabaseStorage.kt */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\"\u0010\u0013\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u000bH\u0016JW\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00052\u0010\u0010\u0019\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u00052\u0010\u0010\u001c\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0002\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u00102\u0006\u0010 \u001a\u00020!H\u0002J\u0010\u0010\"\u001a\u00020\u00102\u0006\u0010 \u001a\u00020#H\u0002J\b\u0010$\u001a\u00020\u0010H\u0002J\f\u0010%\u001a\b\u0012\u0004\u0012\u00020'0&J\f\u0010(\u001a\b\u0012\u0004\u0012\u00020'0&J\f\u0010)\u001a\b\u0012\u0004\u0012\u00020'0&J\u0016\u0010*\u001a\b\u0012\u0004\u0012\u00020'0&2\u0006\u0010\u0018\u001a\u00020\u0005H\u0002J\u000e\u0010+\u001a\u00020\u00102\u0006\u0010,\u001a\u00020\u000bJ\u000e\u0010-\u001a\u00020\u00102\u0006\u0010,\u001a\u00020\u000bJ\u000e\u0010.\u001a\u00020\u00102\u0006\u0010,\u001a\u00020\u000bJ\u0018\u0010/\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010,\u001a\u00020\u000bH\u0002J\u0010\u00100\u001a\u0004\u0018\u00010\u00052\u0006\u00101\u001a\u00020\u0005J\u0015\u00102\u001a\u0004\u0018\u0001032\u0006\u00101\u001a\u00020\u0005¢\u0006\u0002\u00104J\u001a\u00105\u001a\u0004\u0018\u0001062\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u00101\u001a\u00020\u0005H\u0002J\u000e\u00107\u001a\u00020\u00102\u0006\u00101\u001a\u00020\u0005J\u000e\u00108\u001a\u00020\u00102\u0006\u00101\u001a\u00020\u0005J\u0018\u00109\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u00101\u001a\u00020\u0005H\u0002R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006:"}, d2 = {"Lcom/amplitude/reactnative/LegacyDatabaseStorage;", "Landroid/database/sqlite/SQLiteOpenHelper;", "context", "Landroid/content/Context;", "databaseName", "", "<init>", "(Landroid/content/Context;Ljava/lang/String;)V", "file", "Ljava/io/File;", DatabaseConstants.VALUE_FIELD, "", "currentDbVersion", "getCurrentDbVersion", "()I", "onCreate", "", "db", "Landroid/database/sqlite/SQLiteDatabase;", "onUpgrade", "oldVersion", "newVersion", "queryDb", "Landroid/database/Cursor;", "table", "columns", "", "selection", "selectionArgs", "orderBy", "(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;", "handleIfCursorRowTooLargeException", "e", "Ljava/lang/IllegalStateException;", "convertIfCursorWindowException", "Ljava/lang/RuntimeException;", "closeDb", "readEvents", "", "Lorg/json/JSONObject;", "readIdentifies", "readInterceptedIdentifies", "readEventsFromTable", "removeEvent", "eventId", "removeIdentify", "removeInterceptedIdentify", "removeEventFromTable", "getValue", DatabaseConstants.KEY_FIELD, "getLongValue", "", "(Ljava/lang/String;)Ljava/lang/Long;", "getValueFromTable", "", "removeValue", "removeLongValue", "removeValueFromTable", "amplitude_analytics-react-native_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LegacyDatabaseStorage extends SQLiteOpenHelper {
    private int currentDbVersion;
    private File file;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LegacyDatabaseStorage(Context context, String databaseName) {
        super(context, databaseName, (SQLiteDatabase.CursorFactory) null, 4);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(databaseName, "databaseName");
        File databasePath = context.getDatabasePath(databaseName);
        Intrinsics.checkNotNullExpressionValue(databasePath, "getDatabasePath(...)");
        this.file = databasePath;
        this.currentDbVersion = 4;
    }

    public final int getCurrentDbVersion() {
        return this.currentDbVersion;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase db) {
        Intrinsics.checkNotNullParameter(db, "db");
        throw new NotImplementedError(null, 1, null);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        this.currentDbVersion = oldVersion;
    }

    private final Cursor queryDb(SQLiteDatabase db, String table, String[] columns, String selection, String[] selectionArgs, String orderBy) {
        return db.query(table, columns, selection, selectionArgs, null, null, orderBy, null);
    }

    private final void handleIfCursorRowTooLargeException(IllegalStateException e) {
        String message = e.getMessage();
        if (message == null) {
            throw e;
        }
        if (message.length() == 0) {
            throw e;
        }
        if (!StringsKt.contains$default((CharSequence) message, (CharSequence) "Couldn't read", false, 2, (Object) null)) {
            throw e;
        }
        if (StringsKt.contains$default((CharSequence) message, (CharSequence) "CursorWindow", false, 2, (Object) null)) {
            closeDb();
            return;
        }
        throw e;
    }

    private final void convertIfCursorWindowException(RuntimeException e) {
        String message = e.getMessage();
        String str = message;
        if (str == null) {
            throw e;
        }
        if (str.length() == 0) {
            throw e;
        }
        if (StringsKt.startsWith$default(message, "Cursor window allocation of", false, 2, (Object) null) || StringsKt.startsWith$default(message, "Could not allocate CursorWindow", false, 2, (Object) null)) {
            throw new CursorWindowAllocationException(message);
        }
        throw e;
    }

    private final void closeDb() {
        try {
            close();
        } catch (Exception e) {
            LogcatLogger.INSTANCE.getLogger().error("close failed: " + e.getMessage());
        }
    }

    public final synchronized List<JSONObject> readEvents() {
        return readEventsFromTable(DatabaseConstants.EVENT_TABLE_NAME);
    }

    public final synchronized List<JSONObject> readIdentifies() {
        return readEventsFromTable(DatabaseConstants.IDENTIFY_TABLE_NAME);
    }

    public final synchronized List<JSONObject> readInterceptedIdentifies() {
        if (this.currentDbVersion < 4) {
            return CollectionsKt.emptyList();
        }
        return readEventsFromTable(DatabaseConstants.IDENTIFY_INTERCEPTOR_TABLE_NAME);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d4, code lost:
    
        if (r3 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0076, code lost:
    
        if (r3 == null) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final List<JSONObject> readEventsFromTable(String table) {
        if (!this.file.exists()) {
            return new ArrayList();
        }
        LinkedList linkedList = new LinkedList();
        Cursor cursor = null;
        try {
            try {
                try {
                    try {
                        SQLiteDatabase readableDatabase = getReadableDatabase();
                        Intrinsics.checkNotNull(readableDatabase);
                        cursor = queryDb(readableDatabase, table, new String[]{"id", "event"}, null, null, "id ASC");
                        while (true) {
                            Intrinsics.checkNotNull(cursor);
                            if (!cursor.moveToNext()) {
                                break;
                            }
                            long j = cursor.getLong(0);
                            String string = cursor.getString(1);
                            String str = string;
                            if (str != null && str.length() != 0) {
                                JSONObject jSONObject = new JSONObject(string);
                                jSONObject.put("event_id", j);
                                linkedList.add(jSONObject);
                            }
                        }
                    } catch (StackOverflowError e) {
                        LogcatLogger.INSTANCE.getLogger().error("read events from " + table + " failed: " + e.getMessage());
                        closeDb();
                        if (cursor != null) {
                        }
                    }
                } catch (RuntimeException e2) {
                    convertIfCursorWindowException(e2);
                    if (cursor != null) {
                    }
                }
            } catch (SQLiteException e3) {
                LogcatLogger.INSTANCE.getLogger().error("read events from " + table + " failed: " + e3.getMessage());
                closeDb();
            } catch (IllegalStateException e4) {
                handleIfCursorRowTooLargeException(e4);
            }
            cursor.close();
            close();
            return linkedList;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            close();
            throw th;
        }
    }

    public final synchronized void removeEvent(int eventId) {
        removeEventFromTable(DatabaseConstants.EVENT_TABLE_NAME, eventId);
    }

    public final synchronized void removeIdentify(int eventId) {
        removeEventFromTable(DatabaseConstants.IDENTIFY_TABLE_NAME, eventId);
    }

    public final synchronized void removeInterceptedIdentify(int eventId) {
        if (this.currentDbVersion < 4) {
            return;
        }
        removeEventFromTable(DatabaseConstants.IDENTIFY_INTERCEPTOR_TABLE_NAME, eventId);
    }

    private final void removeEventFromTable(String table, int eventId) {
        try {
            try {
                getWritableDatabase().delete(table, "id = ?", new String[]{String.valueOf(eventId)});
            } catch (SQLiteException e) {
                LogcatLogger.INSTANCE.getLogger().error("remove events from " + table + " failed: " + e.getMessage());
                closeDb();
            } catch (StackOverflowError e2) {
                LogcatLogger.INSTANCE.getLogger().error("remove events from " + table + " failed: " + e2.getMessage());
                closeDb();
            }
        } finally {
            close();
        }
    }

    public final synchronized String getValue(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return (String) getValueFromTable(DatabaseConstants.STORE_TABLE_NAME, key);
    }

    public final synchronized Long getLongValue(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return (Long) getValueFromTable(DatabaseConstants.LONG_STORE_TABLE_NAME, key);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00c4, code lost:
    
        if (r14 == null) goto L14;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [android.database.Cursor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object getValueFromTable(String table, String key) {
        Cursor cursor;
        ?? r3 = 0;
        r3 = null;
        r3 = null;
        r3 = null;
        r3 = null;
        r3 = null;
        r3 = null;
        r3 = null;
        r3 = null;
        Object obj = null;
        try {
            if (!this.file.exists()) {
                return null;
            }
            try {
                SQLiteDatabase readableDatabase = getReadableDatabase();
                Intrinsics.checkNotNull(readableDatabase);
                cursor = queryDb(readableDatabase, table, new String[]{DatabaseConstants.KEY_FIELD, DatabaseConstants.VALUE_FIELD}, "key = ?", new String[]{key}, null);
                try {
                    Intrinsics.checkNotNull(cursor);
                    if (cursor.moveToFirst()) {
                        obj = Intrinsics.areEqual(table, DatabaseConstants.STORE_TABLE_NAME) ? cursor.getString(1) : Long.valueOf(cursor.getLong(1));
                    }
                } catch (SQLiteException e) {
                    e = e;
                    LogcatLogger.INSTANCE.getLogger().error("getValue from " + table + " failed: " + e.getMessage());
                    closeDb();
                } catch (IllegalStateException e2) {
                    e = e2;
                    handleIfCursorRowTooLargeException(e);
                    if (cursor != null) {
                        cursor.close();
                    }
                    close();
                    return obj;
                } catch (RuntimeException e3) {
                    e = e3;
                    convertIfCursorWindowException(e);
                    if (cursor != null) {
                        cursor.close();
                    }
                    close();
                    return obj;
                } catch (StackOverflowError e4) {
                    e = e4;
                    LogcatLogger.INSTANCE.getLogger().error("getValue from " + table + " failed: " + e.getMessage());
                    closeDb();
                    if (cursor != null) {
                        cursor.close();
                    }
                    close();
                    return obj;
                }
            } catch (SQLiteException e5) {
                e = e5;
                cursor = null;
            } catch (IllegalStateException e6) {
                e = e6;
                cursor = null;
            } catch (RuntimeException e7) {
                e = e7;
                cursor = null;
            } catch (StackOverflowError e8) {
                e = e8;
                cursor = null;
            } catch (Throwable th) {
                th = th;
                if (r3 != 0) {
                    r3.close();
                }
                close();
                throw th;
            }
            cursor.close();
            close();
            return obj;
        } catch (Throwable th2) {
            th = th2;
            r3 = key;
        }
    }

    public final synchronized void removeValue(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        removeValueFromTable(DatabaseConstants.STORE_TABLE_NAME, key);
    }

    public final synchronized void removeLongValue(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        removeValueFromTable(DatabaseConstants.LONG_STORE_TABLE_NAME, key);
    }

    private final void removeValueFromTable(String table, String key) {
        try {
            try {
                try {
                    getWritableDatabase().delete(table, "key = ?", new String[]{key});
                } catch (SQLiteException e) {
                    LogcatLogger.INSTANCE.getLogger().error("remove value from " + table + " failed: " + e.getMessage());
                    closeDb();
                }
            } catch (StackOverflowError e2) {
                LogcatLogger.INSTANCE.getLogger().error("remove value from " + table + " failed: " + e2.getMessage());
                closeDb();
            }
        } finally {
            close();
        }
    }
}
