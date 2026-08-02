package io.appmetrica.analytics.coreutils.internal.db;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import io.appmetrica.analytics.coreutils.internal.io.CloseableUtilsKt;

/* loaded from: classes.dex */
public class DBUtils {
    public static void cursorRowToContentValues(Cursor cursor, ContentValues contentValues) {
        try {
            enhancedCursorRowToContentValues(cursor, contentValues);
        } catch (Throwable unused) {
        }
    }

    public static void enhancedCursorRowToContentValues(Cursor cursor, ContentValues contentValues) {
        String[] columnNames = cursor.getColumnNames();
        int length = columnNames.length;
        for (int i3 = 0; i3 < length; i3++) {
            int type = cursor.getType(i3);
            if (type == 0) {
                contentValues.put(columnNames[i3], cursor.getString(i3));
            } else if (type == 1) {
                contentValues.put(columnNames[i3], Long.valueOf(cursor.getLong(i3)));
            } else if (type == 2) {
                contentValues.put(columnNames[i3], Double.valueOf(cursor.getDouble(i3)));
            } else if (type == 3) {
                contentValues.put(columnNames[i3], cursor.getString(i3));
            } else if (type != 4) {
                contentValues.put(columnNames[i3], cursor.getString(i3));
            } else {
                contentValues.put(columnNames[i3], cursor.getBlob(i3));
            }
        }
    }

    public static long queryRowsCount(SQLiteDatabase sQLiteDatabase, String str) {
        Cursor cursor = null;
        try {
            cursor = sQLiteDatabase.rawQuery("SELECT count() FROM " + str, null);
            return cursor.moveToFirst() ? cursor.getLong(0) : 0L;
        } finally {
            CloseableUtilsKt.closeSafely(cursor);
        }
    }
}
