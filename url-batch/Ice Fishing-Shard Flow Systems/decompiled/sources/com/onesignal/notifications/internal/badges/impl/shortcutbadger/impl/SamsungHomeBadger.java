package com.onesignal.notifications.internal.badges.impl.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import java.util.Arrays;
import java.util.List;
import m3.InterfaceC0687a;
import n3.C0757b;

/* loaded from: classes.dex */
public class SamsungHomeBadger implements InterfaceC0687a {
    private static final String[] CONTENT_PROJECTION = {"_id", "class"};
    private static final String CONTENT_URI = "content://com.sec.badge/apps?notify=true";
    private DefaultBadger defaultBadger = new DefaultBadger();

    private ContentValues getContentValues(ComponentName componentName, int i2, boolean z7) {
        ContentValues contentValues = new ContentValues();
        if (z7) {
            contentValues.put("package", componentName.getPackageName());
            contentValues.put("class", componentName.getClassName());
        }
        contentValues.put("badgecount", Integer.valueOf(i2));
        return contentValues;
    }

    @Override // m3.InterfaceC0687a
    public void executeBadge(Context context, ComponentName componentName, int i2) {
        DefaultBadger defaultBadger = this.defaultBadger;
        if (defaultBadger != null && defaultBadger.isSupported(context)) {
            this.defaultBadger.executeBadge(context, componentName, i2);
            return;
        }
        Uri parse = Uri.parse(CONTENT_URI);
        ContentResolver contentResolver = context.getContentResolver();
        Cursor cursor = null;
        try {
            cursor = contentResolver.query(parse, CONTENT_PROJECTION, "package=?", new String[]{componentName.getPackageName()}, null);
            if (cursor != null) {
                String className = componentName.getClassName();
                boolean z7 = false;
                while (cursor.moveToNext()) {
                    contentResolver.update(parse, getContentValues(componentName, i2, false), "_id=?", new String[]{String.valueOf(cursor.getInt(0))});
                    if (className.equals(cursor.getString(cursor.getColumnIndex("class")))) {
                        z7 = true;
                    }
                }
                if (!z7) {
                    contentResolver.insert(parse, getContentValues(componentName, i2, true));
                }
            }
            C0757b.close(cursor);
        } catch (Throwable th) {
            C0757b.close(cursor);
            throw th;
        }
    }

    @Override // m3.InterfaceC0687a
    public List<String> getSupportLaunchers() {
        return Arrays.asList("com.sec.android.app.launcher", "com.sec.android.app.twlauncher");
    }
}
