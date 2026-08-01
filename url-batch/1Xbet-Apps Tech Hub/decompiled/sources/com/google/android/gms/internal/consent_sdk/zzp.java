package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import android.app.Application;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import com.google.android.ump.ConsentDebugSettings;
import com.google.android.ump.ConsentRequestParameters;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* compiled from: com.google.android.ump:user-messaging-platform@@2.1.0 */
/* loaded from: classes2.dex */
final class zzp {
    private final zzn zza;
    private final Activity zzb;
    private final ConsentDebugSettings zzc;
    private final ConsentRequestParameters zzd;

    /* synthetic */ zzp(zzn zznVar, Activity activity, ConsentDebugSettings consentDebugSettings, ConsentRequestParameters consentRequestParameters, zzo zzoVar) {
        this.zza = zznVar;
        this.zzb = activity;
        this.zzc = consentDebugSettings;
        this.zzd = consentRequestParameters;
    }

    static /* bridge */ /* synthetic */ zzck zza(zzp zzpVar) {
        Bundle bundle;
        List arrayList;
        List list;
        PackageInfo packageInfo;
        String zza;
        zzck zzckVar = new zzck();
        String zza2 = zzpVar.zzd.zza();
        if (TextUtils.isEmpty(zza2)) {
            try {
                bundle = zzpVar.zza.zza.getPackageManager().getApplicationInfo(zzpVar.zza.zza.getPackageName(), 128).metaData;
            } catch (PackageManager.NameNotFoundException unused) {
                bundle = null;
            }
            if (bundle != null) {
                zza2 = bundle.getString("com.google.android.gms.ads.APPLICATION_ID");
            }
            if (TextUtils.isEmpty(zza2)) {
                throw new zzi(3, "The UMP SDK requires a valid application ID in your AndroidManifest.xml through a com.google.android.gms.ads.APPLICATION_ID meta-data tag.\nExample AndroidManifest:\n    <meta-data\n        android:name=\"com.google.android.gms.ads.APPLICATION_ID\"\n        android:value=\"ca-app-pub-0000000000000000~0000000000\">");
            }
        }
        zzckVar.zza = zza2;
        if (!zzpVar.zzd.isTagForUnderAgeOfConsent() && (zza = zzpVar.zza.zzb.zza()) != null) {
            zzckVar.zzb = zza;
        }
        if (zzpVar.zzc.isTestDevice()) {
            arrayList = new ArrayList();
            int debugGeography = zzpVar.zzc.getDebugGeography();
            if (debugGeography == 1) {
                arrayList.add(zzcf.GEO_OVERRIDE_EEA);
            } else if (debugGeography == 2) {
                arrayList.add(zzcf.GEO_OVERRIDE_NON_EEA);
            }
            arrayList.add(zzcf.PREVIEWING_DEBUG_MESSAGES);
        } else {
            arrayList = Collections.emptyList();
        }
        zzckVar.zzj = arrayList;
        zzckVar.zzf = zzpVar.zza.zzc.zzc();
        zzckVar.zze = Boolean.valueOf(zzpVar.zzd.isTagForUnderAgeOfConsent());
        zzckVar.zzd = Locale.getDefault().toLanguageTag();
        zzcg zzcgVar = new zzcg();
        zzcgVar.zzb = Integer.valueOf(Build.VERSION.SDK_INT);
        zzcgVar.zza = Build.MODEL;
        zzcgVar.zzc = 2;
        zzckVar.zzc = zzcgVar;
        Configuration configuration = zzpVar.zza.zza.getResources().getConfiguration();
        zzpVar.zza.zza.getResources().getConfiguration();
        zzci zzciVar = new zzci();
        zzciVar.zza = Integer.valueOf(configuration.screenWidthDp);
        zzciVar.zzb = Integer.valueOf(configuration.screenHeightDp);
        zzciVar.zzc = Double.valueOf(zzpVar.zza.zza.getResources().getDisplayMetrics().density);
        if (Build.VERSION.SDK_INT < 28) {
            list = Collections.emptyList();
        } else {
            Activity activity = zzpVar.zzb;
            Window window = activity == null ? null : activity.getWindow();
            View decorView = window == null ? null : window.getDecorView();
            WindowInsets rootWindowInsets = decorView == null ? null : decorView.getRootWindowInsets();
            DisplayCutout displayCutout = rootWindowInsets == null ? null : rootWindowInsets.getDisplayCutout();
            if (displayCutout == null) {
                list = Collections.emptyList();
            } else {
                displayCutout.getSafeInsetBottom();
                ArrayList arrayList2 = new ArrayList();
                for (Rect rect : displayCutout.getBoundingRects()) {
                    if (rect != null) {
                        zzch zzchVar = new zzch();
                        zzchVar.zzb = Integer.valueOf(rect.left);
                        zzchVar.zzc = Integer.valueOf(rect.right);
                        zzchVar.zza = Integer.valueOf(rect.top);
                        zzchVar.zzd = Integer.valueOf(rect.bottom);
                        arrayList2.add(zzchVar);
                    }
                }
                list = arrayList2;
            }
        }
        zzciVar.zzd = list;
        zzckVar.zzg = zzciVar;
        zzn zznVar = zzpVar.zza;
        Application application = zznVar.zza;
        try {
            packageInfo = zznVar.zza.getPackageManager().getPackageInfo(application.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException unused2) {
            packageInfo = null;
        }
        zzce zzceVar = new zzce();
        zzceVar.zza = application.getPackageName();
        CharSequence applicationLabel = zzpVar.zza.zza.getPackageManager().getApplicationLabel(zzpVar.zza.zza.getApplicationInfo());
        zzceVar.zzb = applicationLabel != null ? applicationLabel.toString() : null;
        if (packageInfo != null) {
            zzceVar.zzc = Long.toString(Build.VERSION.SDK_INT >= 28 ? packageInfo.getLongVersionCode() : packageInfo.versionCode);
        }
        zzckVar.zzh = zzceVar;
        zzcj zzcjVar = new zzcj();
        zzcjVar.zza = "2.1.0";
        zzckVar.zzi = zzcjVar;
        return zzckVar;
    }
}
