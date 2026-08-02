package com.google.android.gms.internal.ads;

import android.app.LocaleManager;
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

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes3.dex */
final class zzeun implements zzeuc {
    private final zzgdy zza;
    private final Context zzb;

    zzeun(zzgdy zzgdyVar, Context context) {
        this.zza = zzgdyVar;
        this.zzb = context;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(27:0|1|(3:3|(1:6)|7)|8|(3:76|77|(22:79|11|12|13|(17:15|16|(2:18|(2:20|(1:22))(2:23|(1:25)(1:26)))|27|(2:59|(3:62|(3:65|(2:68|69)(1:67)|63)|70))|29|30|(2:32|(9:34|35|(9:49|50|(1:54)|56|39|(1:41)(1:48)|(1:43)(1:47)|44|45)(1:37)|38|39|(0)(0)|(0)(0)|44|45))|58|35|(0)(0)|38|39|(0)(0)|(0)(0)|44|45)|72|16|(0)|27|(0)|29|30|(0)|58|35|(0)(0)|38|39|(0)(0)|(0)(0)|44|45))|10|11|12|13|(0)|72|16|(0)|27|(0)|29|30|(0)|58|35|(0)(0)|38|39|(0)(0)|(0)(0)|44|45) */
    /* JADX WARN: Incorrect condition in loop: B:5:0x0049 */
    /* JADX WARN: Removed duplicated region for block: B:15:0x009c A[Catch: Exception -> 0x00b3, TRY_LEAVE, TryCatch #2 {Exception -> 0x00b3, blocks: (B:13:0x0090, B:15:0x009c), top: B:12:0x0090 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01c4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x012e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ zzeul zzc(zzeun zzeunVar) {
        ActivityInfo activityInfo;
        PackageInfo packageInfo;
        String str;
        String str2;
        Context context;
        boolean equals;
        boolean z;
        String str3;
        String string;
        LocaleList locales;
        Locale locale;
        LocaleList systemLocales;
        Locale locale2;
        PackageInfo packageInfo2;
        LocaleList localeList;
        int size;
        Locale locale3;
        Context context2 = zzeunVar.zzb;
        PackageManager packageManager = context2.getPackageManager();
        Locale locale4 = Locale.getDefault();
        ResolveInfo zzd = zzd(packageManager, "geo:0,0?q=donuts");
        ResolveInfo zzd2 = zzd(packageManager, "http://www.google.com");
        String country = locale4.getCountry();
        com.google.android.gms.ads.internal.zzv.zzr();
        com.google.android.gms.ads.internal.client.zzbb.zzb();
        boolean zzw = com.google.android.gms.ads.internal.util.client.zzf.zzw();
        boolean isLatchsky = DeviceProperties.isLatchsky(context2);
        boolean isSidewinder = DeviceProperties.isSidewinder(context2);
        String language = locale4.getLanguage();
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT >= 24) {
            localeList = LocaleList.getDefault();
            for (int i = 0; i < size; i++) {
                locale3 = localeList.get(i);
                arrayList.add(locale3.getLanguage());
            }
        }
        ResolveInfo zzd3 = zzd(packageManager, "market://details?id=com.google.android.gms.ads");
        if (zzd3 != null && (activityInfo = zzd3.activityInfo) != null) {
            try {
                packageInfo = Wrappers.packageManager(context2).getPackageInfo(activityInfo.packageName, 0);
            } catch (PackageManager.NameNotFoundException unused) {
            }
            if (packageInfo != null) {
                str = packageInfo.versionCode + "." + activityInfo.packageName;
                packageInfo2 = Wrappers.packageManager(zzeunVar.zzb).getPackageInfo("com.android.vending", 128);
                if (packageInfo2 != null) {
                    str2 = packageInfo2.versionCode + "." + packageInfo2.packageName;
                    String str4 = Build.FINGERPRINT;
                    String language2 = Locale.getDefault().getLanguage();
                    String str5 = str;
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zznI)).booleanValue()) {
                        if (Build.VERSION.SDK_INT >= 33) {
                            LocaleManager m = zzel$$ExternalSyntheticApiModelOutline1.m(zzeunVar.zzb.getSystemService(zzel$$ExternalSyntheticApiModelOutline1.m324m()));
                            if (m != null) {
                                systemLocales = m.getSystemLocales();
                                locale2 = systemLocales.get(0);
                                language2 = locale2.getLanguage();
                            }
                        } else if (Build.VERSION.SDK_INT >= 24) {
                            locales = zzeunVar.zzb.getResources().getConfiguration().getLocales();
                            locale = locales.get(0);
                            language2 = locale.getLanguage();
                        } else {
                            language2 = zzeunVar.zzb.getResources().getConfiguration().locale.getLanguage();
                        }
                    }
                    String str6 = language2;
                    Context context3 = zzeunVar.zzb;
                    if (packageManager != null) {
                        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
                        ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 0);
                        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
                        if (queryIntentActivities != null && resolveActivity != null) {
                            int i2 = 0;
                            while (i2 < queryIntentActivities.size()) {
                                context = context3;
                                if (resolveActivity.activityInfo.name.equals(queryIntentActivities.get(i2).activityInfo.name)) {
                                    equals = resolveActivity.activityInfo.packageName.equals(zzhhh.zza(context));
                                    break;
                                }
                                i2++;
                                context3 = context;
                            }
                        }
                    }
                    context = context3;
                    equals = false;
                    com.google.android.gms.ads.internal.zzv.zzr();
                    long availableBytes = new StatFs(Environment.getDataDirectory().getAbsolutePath()).getAvailableBytes() / 1024;
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzlN)).booleanValue()) {
                        com.google.android.gms.ads.internal.zzv.zzr();
                        if (com.google.android.gms.ads.internal.util.zzs.zzC(context)) {
                            z = true;
                            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzlR)).booleanValue()) {
                                try {
                                    Bundle bundle = Wrappers.packageManager(context).getApplicationInfo(context.getPackageName(), 128).metaData;
                                    string = (bundle != null && bundle.containsKey("com.google.unity.ads.UNITY_VERSION")) ? bundle.getString("com.google.unity.ads.UNITY_VERSION") : "";
                                } catch (PackageManager.NameNotFoundException unused2) {
                                }
                                str3 = null;
                                return new zzeul(zzd != null, zzd2 != null, country, zzw, isLatchsky, isSidewinder, language, arrayList, str5, str2, str4, equals, Build.MODEL, availableBytes, z, str3, Build.VERSION.SDK_INT, str6);
                            }
                            str3 = string;
                            if (zzd2 != null) {
                            }
                            return new zzeul(zzd != null, zzd2 != null, country, zzw, isLatchsky, isSidewinder, language, arrayList, str5, str2, str4, equals, Build.MODEL, availableBytes, z, str3, Build.VERSION.SDK_INT, str6);
                        }
                    }
                    z = false;
                    if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzlR)).booleanValue()) {
                    }
                    str3 = string;
                    if (zzd2 != null) {
                    }
                    return new zzeul(zzd != null, zzd2 != null, country, zzw, isLatchsky, isSidewinder, language, arrayList, str5, str2, str4, equals, Build.MODEL, availableBytes, z, str3, Build.VERSION.SDK_INT, str6);
                }
                str2 = null;
                String str42 = Build.FINGERPRINT;
                String language22 = Locale.getDefault().getLanguage();
                String str52 = str;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zznI)).booleanValue()) {
                }
                String str62 = language22;
                Context context32 = zzeunVar.zzb;
                if (packageManager != null) {
                }
                context = context32;
                equals = false;
                com.google.android.gms.ads.internal.zzv.zzr();
                long availableBytes2 = new StatFs(Environment.getDataDirectory().getAbsolutePath()).getAvailableBytes() / 1024;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzlN)).booleanValue()) {
                }
                z = false;
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzlR)).booleanValue()) {
                }
                str3 = string;
                if (zzd2 != null) {
                }
                return new zzeul(zzd != null, zzd2 != null, country, zzw, isLatchsky, isSidewinder, language, arrayList, str52, str2, str42, equals, Build.MODEL, availableBytes2, z, str3, Build.VERSION.SDK_INT, str62);
            }
        }
        str = null;
        packageInfo2 = Wrappers.packageManager(zzeunVar.zzb).getPackageInfo("com.android.vending", 128);
        if (packageInfo2 != null) {
        }
        str2 = null;
        String str422 = Build.FINGERPRINT;
        String language222 = Locale.getDefault().getLanguage();
        String str522 = str;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zznI)).booleanValue()) {
        }
        String str622 = language222;
        Context context322 = zzeunVar.zzb;
        if (packageManager != null) {
        }
        context = context322;
        equals = false;
        com.google.android.gms.ads.internal.zzv.zzr();
        long availableBytes22 = new StatFs(Environment.getDataDirectory().getAbsolutePath()).getAvailableBytes() / 1024;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzlN)).booleanValue()) {
        }
        z = false;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzlR)).booleanValue()) {
        }
        str3 = string;
        if (zzd2 != null) {
        }
        return new zzeul(zzd != null, zzd2 != null, country, zzw, isLatchsky, isSidewinder, language, arrayList, str522, str2, str422, equals, Build.MODEL, availableBytes22, z, str3, Build.VERSION.SDK_INT, str622);
    }

    private static ResolveInfo zzd(PackageManager packageManager, String str) {
        return packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)), 65536);
    }

    @Override // com.google.android.gms.internal.ads.zzeuc
    public final int zza() {
        return 38;
    }

    @Override // com.google.android.gms.internal.ads.zzeuc
    public final ListenableFuture zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeum
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzeun.zzc(zzeun.this);
            }
        });
    }
}
