package com.onesignal.notifications.internal.badges.impl.shortcutbadger.impl;

import K2.a;
import L2.b;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public class SamsungHomeBadger implements a {
    private static final String[] CONTENT_PROJECTION = {"_id", "class"};
    private static final String CONTENT_URI = "content://com.sec.badge/apps?notify=true";
    private DefaultBadger defaultBadger = new DefaultBadger();

    private ContentValues getContentValues(ComponentName componentName, int i7, boolean z5) {
        ContentValues contentValues = new ContentValues();
        if (z5) {
            contentValues.put("package", componentName.getPackageName());
            contentValues.put("class", componentName.getClassName());
        }
        contentValues.put("badgecount", Integer.valueOf(i7));
        return contentValues;
    }

    @Override // K2.a
    public void executeBadge(Context context, ComponentName componentName, int i7) {
        DefaultBadger defaultBadger = this.defaultBadger;
        if (defaultBadger != null && defaultBadger.isSupported(context)) {
            this.defaultBadger.executeBadge(context, componentName, i7);
            return;
        }
        Uri parse = Uri.parse(CONTENT_URI);
        ContentResolver contentResolver = context.getContentResolver();
        Cursor cursor = null;
        try {
            cursor = contentResolver.query(parse, CONTENT_PROJECTION, "package=?", new String[]{componentName.getPackageName()}, null);
            if (cursor != null) {
                String className = componentName.getClassName();
                boolean z5 = false;
                while (cursor.moveToNext()) {
                    contentResolver.update(parse, getContentValues(componentName, i7, false), "_id=?", new String[]{String.valueOf(cursor.getInt(0))});
                    if (className.equals(cursor.getString(cursor.getColumnIndex("class")))) {
                        z5 = true;
                    }
                }
                if (!z5) {
                    contentResolver.insert(parse, getContentValues(componentName, i7, true));
                }
            }
            b.close(cursor);
        } catch (Throwable th) {
            b.close(cursor);
            throw th;
        }
    }

    @Override // K2.a
    public List<String> getSupportLaunchers() {
        return Arrays.asList("com.sec.android.app.launcher", "com.sec.android.app.twlauncher");
    }
}
