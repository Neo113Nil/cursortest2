package com.appsflyer.internal;

import android.database.Cursor;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class AFj1eSDK {
    public static final String P_(Cursor cursor, String str) {
        cursor.getClass();
        str.getClass();
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex != -1) {
            return cursor.getString(columnIndex);
        }
        return null;
    }
}
