package com.yandex.div.internal.util;

import android.database.Cursor;

/* loaded from: classes2.dex */
public abstract class IOUtils {
    public static void closeCursorSilently(Cursor cursor) {
        if (cursor == null || cursor.isClosed()) {
            return;
        }
        cursor.close();
    }
}
