package com.google.android.gms.internal.ads;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class vz extends ContentProvider {
    /* JADX WARN: Removed duplicated region for block: B:10:0x0029 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0022  */
    @Override // android.content.ContentProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        String str;
        Bundle bundle = null;
        try {
            bundle = w3.c.a(context).c(context.getPackageName(), 128).metaData;
        } catch (PackageManager.NameNotFoundException e7) {
            e = e7;
            str = "Failed to load metadata: Package name not found.";
            io0.e(str, e);
            wc0 a7 = wc0.a();
            if (bundle == null) {
            }
            super.attachInfo(context, providerInfo);
        } catch (NullPointerException e8) {
            e = e8;
            str = "Failed to load metadata: Null pointer exception.";
            io0.e(str, e);
            wc0 a72 = wc0.a();
            if (bundle == null) {
            }
            super.attachInfo(context, providerInfo);
        }
        wc0 a722 = wc0.a();
        if (bundle == null) {
            io0.d("Metadata was null.");
        } else {
            try {
                String str2 = (String) bundle.get("com.google.android.gms.ads.APPLICATION_ID");
                try {
                    Boolean bool = (Boolean) bundle.get("com.google.android.gms.ads.AD_MANAGER_APP");
                    try {
                        Boolean bool2 = (Boolean) bundle.get("com.google.android.gms.ads.DELAY_APP_MEASUREMENT_INIT");
                        try {
                            String str3 = (String) bundle.get("com.google.android.gms.ads.INTEGRATION_MANAGER");
                            if (str2 == null || str2.matches("^/\\d+~.+$")) {
                                if (bool == null || !bool.booleanValue()) {
                                    if (TextUtils.isEmpty(str3)) {
                                        throw new IllegalStateException("\n\n******************************************************************************\n* The Google Mobile Ads SDK was initialized incorrectly. AdMob publishers    *\n* should follow the instructions here:                                       *\n* https://googlemobileadssdk.page.link/admob-android-update-manifest         *\n* to add a valid App ID inside the AndroidManifest.                          *\n* Google Ad Manager publishers should follow instructions here:              *\n* https://googlemobileadssdk.page.link/ad-manager-android-update-manifest.   *\n******************************************************************************\n\n");
                                    }
                                    String valueOf = String.valueOf(str3);
                                    io0.b(valueOf.length() != 0 ? "The Google Mobile Ads SDK is integrated by ".concat(valueOf) : new String("The Google Mobile Ads SDK is integrated by "));
                                }
                            } else {
                                if (!str2.matches("^ca-app-pub-[0-9]{16}~[0-9]{10}$")) {
                                    throw new IllegalStateException("\n\n******************************************************************************\n* Invalid application ID. Follow instructions here:                          *\n* https://googlemobileadssdk.page.link/admob-android-update-manifest         *\n* to find your app ID.                                                       *\n******************************************************************************\n\n");
                                }
                                io0.b(str2.length() != 0 ? "Publisher provided Google AdMob App ID in manifest: ".concat(str2) : new String("Publisher provided Google AdMob App ID in manifest: "));
                                if (bool2 == null || !bool2.booleanValue()) {
                                    a722.b(context, str2);
                                }
                            }
                        } catch (ClassCastException e9) {
                            throw new IllegalStateException("The com.google.android.gms.ads.INTEGRATION_MANAGER metadata must have a String value.", e9);
                        }
                    } catch (ClassCastException e10) {
                        throw new IllegalStateException("The com.google.android.gms.ads.DELAY_APP_MEASUREMENT_INIT metadata must have a boolean value.", e10);
                    }
                } catch (ClassCastException e11) {
                    throw new IllegalStateException("The com.google.android.gms.ads.AD_MANAGER_APP metadata must have a boolean value.", e11);
                }
            } catch (ClassCastException e12) {
                throw new IllegalStateException("The com.google.android.gms.ads.APPLICATION_ID metadata must have a String value.", e12);
            }
        }
        super.attachInfo(context, providerInfo);
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        return false;
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
