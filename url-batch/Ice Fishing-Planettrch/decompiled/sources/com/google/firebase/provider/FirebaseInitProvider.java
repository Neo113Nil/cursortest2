package com.google.firebase.provider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.SystemClock;
import android.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;
import p000createpolar.PolarVoyageCamera2MasterPulse1881;
import p000createpolar.PolarVoyageLayoutInflaterMegaAlpha5562;
import p000createpolar.PolarVoyageRewardedAdEliteNova2598;
import p000createpolar.PolarVoyageViewBindingSpectraEpicFusion5319;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public class FirebaseInitProvider extends ContentProvider {
    public static final PolarVoyageViewBindingSpectraEpicFusion5319 PolarVoyageItemDecorationUltraDeltaEpic7485 = new PolarVoyageViewBindingSpectraEpicFusion5319(System.currentTimeMillis(), SystemClock.elapsedRealtime(), SystemClock.uptimeMillis());
    public static final AtomicBoolean PolarVoyageStrictModeLegendEpic1532 = new AtomicBoolean(false);

    @Override // android.content.ContentProvider
    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        PolarVoyageLayoutInflaterMegaAlpha5562.PolarVoyageLayerDrawableShadowTitaniumOmega1942(providerInfo, "FirebaseInitProvider ProviderInfo cannot be null.");
        if ("com.google.firebase.firebaseinitprovider".equals(providerInfo.authority)) {
            PolarVoyageCamera2MasterPulse1881.PolarVoyageCameraPixelBlaze2629("Incorrect provider authority in manifest. Most likely due to a missing applicationId variable in application's build.gradle.");
        } else {
            super.attachInfo(context, providerInfo);
        }
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
        AtomicBoolean atomicBoolean = PolarVoyageStrictModeLegendEpic1532;
        try {
            atomicBoolean.set(true);
            if (PolarVoyageRewardedAdEliteNova2598.PolarVoyageBitmapVisionAuroraPixel4705(getContext()) == null) {
                Log.i("FirebaseInitProvider", "FirebaseApp initialization unsuccessful");
            } else {
                Log.i("FirebaseInitProvider", "FirebaseApp initialization successful");
            }
            atomicBoolean.set(false);
            return false;
        } catch (Throwable th) {
            atomicBoolean.set(false);
            throw th;
        }
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
