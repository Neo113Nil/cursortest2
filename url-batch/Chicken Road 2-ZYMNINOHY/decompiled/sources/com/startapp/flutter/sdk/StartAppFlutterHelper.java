package com.startapp.flutter.sdk;

import android.content.ComponentName;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import com.startapp.sdk.adsbase.StartAppAd;

/* loaded from: classes.dex */
public class StartAppFlutterHelper extends ContentProvider {
    private static final String LOG_TAG = "StartAppFlutterHelper";

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        Bundle bundle;
        try {
            ProviderInfo providerInfo = getContext().getPackageManager().getProviderInfo(new ComponentName(getContext(), (Class<?>) StartAppFlutterHelper.class), 128);
            if (providerInfo == null || (bundle = providerInfo.metaData) == null) {
                return false;
            }
            if (!Boolean.FALSE.equals(bundle.get("com.startapp.sdk.SPLASH_ADS_ENABLED"))) {
                return false;
            }
            StartAppAd.disableSplash();
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
