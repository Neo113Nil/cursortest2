package com.onesignal.notifications.internal.badges.impl.shortcutbadger.impl;

import android.content.AsyncQueryHandler;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Looper;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public class SonyHomeBadger implements vb.a {
    private static final String INTENT_ACTION = "com.sonyericsson.home.action.UPDATE_BADGE";
    private static final String INTENT_EXTRA_ACTIVITY_NAME = "com.sonyericsson.home.intent.extra.badge.ACTIVITY_NAME";
    private static final String INTENT_EXTRA_MESSAGE = "com.sonyericsson.home.intent.extra.badge.MESSAGE";
    private static final String INTENT_EXTRA_PACKAGE_NAME = "com.sonyericsson.home.intent.extra.badge.PACKAGE_NAME";
    private static final String INTENT_EXTRA_SHOW_MESSAGE = "com.sonyericsson.home.intent.extra.badge.SHOW_MESSAGE";
    private static final String PROVIDER_COLUMNS_ACTIVITY_NAME = "activity_name";
    private static final String PROVIDER_COLUMNS_BADGE_COUNT = "badge_count";
    private static final String PROVIDER_COLUMNS_PACKAGE_NAME = "package_name";
    private static final String PROVIDER_CONTENT_URI = "content://com.sonymobile.home.resourceprovider/badge";
    private static final String SONY_HOME_PROVIDER_NAME = "com.sonymobile.home.resourceprovider";
    private final Uri BADGE_CONTENT_URI = Uri.parse(PROVIDER_CONTENT_URI);
    private AsyncQueryHandler mQueryHandler;

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public class a extends AsyncQueryHandler {
        public a(ContentResolver contentResolver) {
            super(contentResolver);
        }
    }

    private ContentValues createContentValues(int i3, ComponentName componentName) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(PROVIDER_COLUMNS_BADGE_COUNT, Integer.valueOf(i3));
        contentValues.put(PROVIDER_COLUMNS_PACKAGE_NAME, componentName.getPackageName());
        contentValues.put(PROVIDER_COLUMNS_ACTIVITY_NAME, componentName.getClassName());
        return contentValues;
    }

    private static void executeBadgeByBroadcast(Context context, ComponentName componentName, int i3) {
        Intent intent = new Intent(INTENT_ACTION);
        intent.putExtra(INTENT_EXTRA_PACKAGE_NAME, componentName.getPackageName());
        intent.putExtra(INTENT_EXTRA_ACTIVITY_NAME, componentName.getClassName());
        intent.putExtra(INTENT_EXTRA_MESSAGE, String.valueOf(i3));
        intent.putExtra(INTENT_EXTRA_SHOW_MESSAGE, i3 > 0);
        context.sendBroadcast(intent);
    }

    private void executeBadgeByContentProvider(Context context, ComponentName componentName, int i3) {
        if (i3 < 0) {
            return;
        }
        ContentValues createContentValues = createContentValues(i3, componentName);
        if (Looper.myLooper() != Looper.getMainLooper()) {
            insertBadgeSync(context, createContentValues);
            return;
        }
        if (this.mQueryHandler == null) {
            this.mQueryHandler = new a(context.getApplicationContext().getContentResolver());
        }
        insertBadgeAsync(createContentValues);
    }

    private void insertBadgeAsync(ContentValues contentValues) {
        this.mQueryHandler.startInsert(0, null, this.BADGE_CONTENT_URI, contentValues);
    }

    private void insertBadgeSync(Context context, ContentValues contentValues) {
        context.getApplicationContext().getContentResolver().insert(this.BADGE_CONTENT_URI, contentValues);
    }

    private static boolean sonyBadgeContentProviderExists(Context context) {
        return context.getPackageManager().resolveContentProvider(SONY_HOME_PROVIDER_NAME, 0) != null;
    }

    @Override // vb.a
    public void executeBadge(Context context, ComponentName componentName, int i3) {
        if (sonyBadgeContentProviderExists(context)) {
            executeBadgeByContentProvider(context, componentName, i3);
        } else {
            executeBadgeByBroadcast(context, componentName, i3);
        }
    }

    @Override // vb.a
    public List<String> getSupportLaunchers() {
        return Arrays.asList("com.sonyericsson.home", "com.sonymobile.home");
    }
}
