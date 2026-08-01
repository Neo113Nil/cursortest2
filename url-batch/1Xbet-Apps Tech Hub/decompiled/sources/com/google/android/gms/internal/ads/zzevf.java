package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.LocaleList;
import android.os.StatFs;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzevf implements zzeuy {
    private final zzgbl zza;
    private final Context zzb;

    public zzevf(zzgbl zzgblVar, Context context) {
        this.zza = zzgblVar;
        this.zzb = context;
    }

    private static ResolveInfo zzd(PackageManager packageManager, String str) {
        return packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)), 65536);
    }

    @Override // com.google.android.gms.internal.ads.zzeuy
    public final int zza() {
        return 38;
    }

    @Override // com.google.android.gms.internal.ads.zzeuy
    public final ListenableFuture zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeve
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzevf.this.zzc();
            }
        });
    }

    /* JADX WARN: Can't wrap try/catch for region: R(24:0|1|(2:4|2)|5|6|(3:63|64|(19:66|67|9|10|11|(13:13|14|(1:16)(2:46|(3:49|(3:52|(2:55|56)(1:54)|50)|57))|17|18|(2:20|(7:22|23|(5:25|26|27|(1:31)|42)(1:44)|(1:33)(1:40)|(1:35)(1:39)|36|37))|45|23|(0)(0)|(0)(0)|(0)(0)|36|37)|59|14|(0)(0)|17|18|(0)|45|23|(0)(0)|(0)(0)|(0)(0)|36|37))|8|9|10|11|(0)|59|14|(0)(0)|17|18|(0)|45|23|(0)(0)|(0)(0)|(0)(0)|36|37) */
    /* JADX WARN: Removed duplicated region for block: B:13:0x009b A[Catch: Exception -> 0x00b2, TRY_LEAVE, TryCatch #2 {Exception -> 0x00b2, blocks: (B:11:0x008f, B:13:0x009b), top: B:10:0x008f }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final /* synthetic */ zzevd zzc() throws Exception {
        ActivityInfo activityInfo;
        PackageInfo packageInfo;
        String str;
        String str2;
        String str3;
        boolean equals;
        boolean z;
        String str4;
        PackageInfo packageInfo2;
        PackageManager packageManager = this.zzb.getPackageManager();
        Locale locale = Locale.getDefault();
        ResolveInfo zzd = zzd(packageManager, "geo:0,0?q=donuts");
        ResolveInfo zzd2 = zzd(packageManager, "http://www.google.com");
        String country = locale.getCountry();
        com.google.android.gms.ads.internal.zzt.zzp();
        com.google.android.gms.ads.internal.client.zzay.zzb();
        boolean zzr = zzcbg.zzr();
        Context context = this.zzb;
        boolean isLatchsky = DeviceProperties.isLatchsky(context);
        boolean isSidewinder = DeviceProperties.isSidewinder(context);
        String language = locale.getLanguage();
        ArrayList arrayList = new ArrayList();
        LocaleList localeList = LocaleList.getDefault();
        for (int i = 0; i < localeList.size(); i++) {
            arrayList.add(localeList.get(i).getLanguage());
        }
        Context context2 = this.zzb;
        ResolveInfo zzd3 = zzd(packageManager, "market://details?id=com.google.android.gms.ads");
        if (zzd3 != null && (activityInfo = zzd3.activityInfo) != null) {
            try {
                packageInfo = Wrappers.packageManager(context2).getPackageInfo(activityInfo.packageName, 0);
            } catch (PackageManager.NameNotFoundException unused) {
            }
            if (packageInfo != null) {
                str = packageInfo.versionCode + "." + activityInfo.packageName;
                packageInfo2 = Wrappers.packageManager(this.zzb).getPackageInfo("com.android.vending", 128);
                if (packageInfo2 != null) {
                    str2 = packageInfo2.versionCode + "." + packageInfo2.packageName;
                    Context context3 = this.zzb;
                    String str5 = Build.FINGERPRINT;
                    if (packageManager == null) {
                        str3 = str2;
                    } else {
                        str3 = str2;
                        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
                        ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 0);
                        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
                        if (queryIntentActivities != null && resolveActivity != null) {
                            int i2 = 0;
                            while (i2 < queryIntentActivities.size()) {
                                List<ResolveInfo> list = queryIntentActivities;
                                if (resolveActivity.activityInfo.name.equals(queryIntentActivities.get(i2).activityInfo.name)) {
                                    equals = resolveActivity.activityInfo.packageName.equals(zzhed.zza(context3));
                                    break;
                                }
                                i2++;
                                queryIntentActivities = list;
                            }
                        }
                    }
                    equals = false;
                    com.google.android.gms.ads.internal.zzt.zzp();
                    long availableBytes = new StatFs(Environment.getDataDirectory().getAbsolutePath()).getAvailableBytes() / 1024;
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzky)).booleanValue()) {
                        com.google.android.gms.ads.internal.zzt.zzp();
                        if (com.google.android.gms.ads.internal.util.zzt.zzA(this.zzb)) {
                            z = true;
                            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzkA)).booleanValue()) {
                                str4 = "";
                            } else {
                                Context context4 = this.zzb;
                                try {
                                    Bundle bundle = Wrappers.packageManager(context4).getApplicationInfo(context4.getPackageName(), 128).metaData;
                                    if (bundle != null && bundle.containsKey("com.google.unity.ads.UNITY_VERSION")) {
                                        str4 = bundle.getString("com.google.unity.ads.UNITY_VERSION");
                                    }
                                } catch (PackageManager.NameNotFoundException unused2) {
                                }
                                str4 = null;
                            }
                            return new zzevd(zzd == null, zzd2 == null, country, zzr, isLatchsky, isSidewinder, language, arrayList, str, str3, str5, equals, Build.MODEL, availableBytes, z, str4, Build.VERSION.SDK_INT);
                        }
                    }
                    z = false;
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzkA)).booleanValue()) {
                    }
                    if (zzd2 == null) {
                    }
                    return new zzevd(zzd == null, zzd2 == null, country, zzr, isLatchsky, isSidewinder, language, arrayList, str, str3, str5, equals, Build.MODEL, availableBytes, z, str4, Build.VERSION.SDK_INT);
                }
                str2 = null;
                Context context32 = this.zzb;
                String str52 = Build.FINGERPRINT;
                if (packageManager == null) {
                }
                equals = false;
                com.google.android.gms.ads.internal.zzt.zzp();
                long availableBytes2 = new StatFs(Environment.getDataDirectory().getAbsolutePath()).getAvailableBytes() / 1024;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzky)).booleanValue()) {
                }
                z = false;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzkA)).booleanValue()) {
                }
                if (zzd2 == null) {
                }
                return new zzevd(zzd == null, zzd2 == null, country, zzr, isLatchsky, isSidewinder, language, arrayList, str, str3, str52, equals, Build.MODEL, availableBytes2, z, str4, Build.VERSION.SDK_INT);
            }
        }
        str = null;
        packageInfo2 = Wrappers.packageManager(this.zzb).getPackageInfo("com.android.vending", 128);
        if (packageInfo2 != null) {
        }
        str2 = null;
        Context context322 = this.zzb;
        String str522 = Build.FINGERPRINT;
        if (packageManager == null) {
        }
        equals = false;
        com.google.android.gms.ads.internal.zzt.zzp();
        long availableBytes22 = new StatFs(Environment.getDataDirectory().getAbsolutePath()).getAvailableBytes() / 1024;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzky)).booleanValue()) {
        }
        z = false;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzkA)).booleanValue()) {
        }
        if (zzd2 == null) {
        }
        return new zzevd(zzd == null, zzd2 == null, country, zzr, isLatchsky, isSidewinder, language, arrayList, str, str3, str522, equals, Build.MODEL, availableBytes22, z, str4, Build.VERSION.SDK_INT);
    }
}
