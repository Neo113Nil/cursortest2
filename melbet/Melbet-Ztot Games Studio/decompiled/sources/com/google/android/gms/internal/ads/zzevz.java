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

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
final class zzevz implements zzevo {
    private final zzgcu zza;
    private final Context zzb;

    public zzevz(zzgcu zzgcuVar, Context context) {
        this.zza = zzgcuVar;
        this.zzb = context;
    }

    private static ResolveInfo zzd(PackageManager packageManager, String str) {
        return packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)), 65536);
    }

    @Override // com.google.android.gms.internal.ads.zzevo
    public final int zza() {
        return 38;
    }

    @Override // com.google.android.gms.internal.ads.zzevo
    public final ListenableFuture zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzevy
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzevz.this.zzc();
            }
        });
    }

    /* JADX WARN: Can't wrap try/catch for region: R(23:0|1|(3:3|(1:6)|7)|8|(3:65|66|(19:68|69|11|12|13|(13:15|16|(1:18)(2:48|(3:51|(3:54|(2:57|58)(1:56)|52)|59))|19|20|(2:22|(7:24|25|(5:27|28|29|(1:33)|44)(1:46)|(1:35)(1:42)|(1:37)(1:41)|38|39))|47|25|(0)(0)|(0)(0)|(0)(0)|38|39)|61|16|(0)(0)|19|20|(0)|47|25|(0)(0)|(0)(0)|(0)(0)|38|39))|10|11|12|13|(0)|61|16|(0)(0)|19|20|(0)|47|25|(0)(0)|(0)(0)|(0)(0)|38|39) */
    /* JADX WARN: Incorrect condition in loop: B:5:0x004b */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a1 A[Catch: Exception -> 0x00b8, TRY_LEAVE, TryCatch #2 {Exception -> 0x00b8, blocks: (B:13:0x0095, B:15:0x00a1), top: B:12:0x0095 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final /* synthetic */ zzevx zzc() throws Exception {
        ActivityInfo activityInfo;
        PackageInfo packageInfo;
        String str;
        String str2;
        String str3;
        boolean equals;
        boolean z;
        String str4;
        PackageInfo packageInfo2;
        LocaleList localeList;
        int size;
        Locale locale;
        PackageManager packageManager = this.zzb.getPackageManager();
        Locale locale2 = Locale.getDefault();
        ResolveInfo zzd = zzd(packageManager, "geo:0,0?q=donuts");
        ResolveInfo zzd2 = zzd(packageManager, "http://www.google.com");
        String country = locale2.getCountry();
        com.google.android.gms.ads.internal.zzu.zzp();
        com.google.android.gms.ads.internal.client.zzay.zzb();
        boolean zzs = com.google.android.gms.ads.internal.util.client.zzf.zzs();
        Context context = this.zzb;
        boolean isLatchsky = DeviceProperties.isLatchsky(context);
        boolean isSidewinder = DeviceProperties.isSidewinder(context);
        String language = locale2.getLanguage();
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT >= 24) {
            localeList = LocaleList.getDefault();
            for (int i = 0; i < size; i++) {
                locale = localeList.get(i);
                arrayList.add(locale.getLanguage());
            }
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
                                    equals = resolveActivity.activityInfo.packageName.equals(zzhfv.zza(context3));
                                    break;
                                }
                                i2++;
                                queryIntentActivities = list;
                            }
                        }
                    }
                    equals = false;
                    com.google.android.gms.ads.internal.zzu.zzp();
                    long availableBytes = new StatFs(Environment.getDataDirectory().getAbsolutePath()).getAvailableBytes() / 1024;
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzkv)).booleanValue()) {
                        com.google.android.gms.ads.internal.zzu.zzp();
                        if (com.google.android.gms.ads.internal.util.zzt.zzB(this.zzb)) {
                            z = true;
                            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzkz)).booleanValue()) {
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
                            return new zzevx(zzd == null, zzd2 == null, country, zzs, isLatchsky, isSidewinder, language, arrayList, str, str3, str5, equals, Build.MODEL, availableBytes, z, str4, Build.VERSION.SDK_INT);
                        }
                    }
                    z = false;
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzkz)).booleanValue()) {
                    }
                    if (zzd2 == null) {
                    }
                    return new zzevx(zzd == null, zzd2 == null, country, zzs, isLatchsky, isSidewinder, language, arrayList, str, str3, str5, equals, Build.MODEL, availableBytes, z, str4, Build.VERSION.SDK_INT);
                }
                str2 = null;
                Context context32 = this.zzb;
                String str52 = Build.FINGERPRINT;
                if (packageManager == null) {
                }
                equals = false;
                com.google.android.gms.ads.internal.zzu.zzp();
                long availableBytes2 = new StatFs(Environment.getDataDirectory().getAbsolutePath()).getAvailableBytes() / 1024;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzkv)).booleanValue()) {
                }
                z = false;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzkz)).booleanValue()) {
                }
                if (zzd2 == null) {
                }
                return new zzevx(zzd == null, zzd2 == null, country, zzs, isLatchsky, isSidewinder, language, arrayList, str, str3, str52, equals, Build.MODEL, availableBytes2, z, str4, Build.VERSION.SDK_INT);
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
        com.google.android.gms.ads.internal.zzu.zzp();
        long availableBytes22 = new StatFs(Environment.getDataDirectory().getAbsolutePath()).getAvailableBytes() / 1024;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzkv)).booleanValue()) {
        }
        z = false;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzkz)).booleanValue()) {
        }
        if (zzd2 == null) {
        }
        return new zzevx(zzd == null, zzd2 == null, country, zzs, isLatchsky, isSidewinder, language, arrayList, str, str3, str522, equals, Build.MODEL, availableBytes22, z, str4, Build.VERSION.SDK_INT);
    }
}
