package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.InstallSourceInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
public final class zzetx implements zzevo, zzevn {
    private final ApplicationInfo zza;
    private final PackageInfo zzb;
    private final Context zzc;
    private final zzdsf zzd;

    zzetx(ApplicationInfo applicationInfo, PackageInfo packageInfo, Context context, zzdsf zzdsfVar) {
        this.zza = applicationInfo;
        this.zzb = packageInfo;
        this.zzc = context;
        this.zzd = zzdsfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzevo
    public final int zza() {
        return 29;
    }

    @Override // com.google.android.gms.internal.ads.zzevo
    public final ListenableFuture zzb() {
        return zzgcj.zzh(this);
    }

    @Override // com.google.android.gms.internal.ads.zzevn
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        InstallSourceInfo installSourceInfo;
        String installingPackageName;
        String initiatingPackageName;
        Bundle bundle = (Bundle) obj;
        String str = this.zza.packageName;
        PackageInfo packageInfo = this.zzb;
        Integer valueOf = packageInfo == null ? null : Integer.valueOf(packageInfo.versionCode);
        bundle.putString("pn", str);
        if (valueOf != null) {
            bundle.putInt("vc", valueOf.intValue());
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzbV)).booleanValue()) {
                this.zzd.zzc("vc", valueOf.toString());
            }
        }
        PackageInfo packageInfo2 = this.zzb;
        String str2 = packageInfo2 != null ? packageInfo2.versionName : null;
        if (str2 != null) {
            bundle.putString("vnm", str2);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzbV)).booleanValue()) {
                this.zzd.zzc("vn", str2);
            }
        }
        try {
            Context context = this.zzc;
            String str3 = this.zza.packageName;
            zzfru zzfruVar = com.google.android.gms.ads.internal.util.zzt.zza;
            String valueOf2 = String.valueOf(Wrappers.packageManager(context).getApplicationLabel(str3));
            if (valueOf2 != null) {
                bundle.putString("dl", valueOf2);
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        if (Build.VERSION.SDK_INT >= 30) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzlN)).booleanValue()) {
                try {
                    installSourceInfo = this.zzc.getPackageManager().getInstallSourceInfo(str);
                    if (installSourceInfo == null) {
                        return;
                    }
                    installingPackageName = installSourceInfo.getInstallingPackageName();
                    if (TextUtils.isEmpty(installingPackageName)) {
                        com.google.android.gms.ads.internal.util.zze.zza("No installing package name found");
                    } else {
                        bundle.putString("ins_pn", installingPackageName);
                    }
                    initiatingPackageName = installSourceInfo.getInitiatingPackageName();
                    if (TextUtils.isEmpty(initiatingPackageName)) {
                        com.google.android.gms.ads.internal.util.zze.zza("No initiating package name found");
                    } else {
                        bundle.putString("ini_pn", initiatingPackageName);
                    }
                } catch (PackageManager.NameNotFoundException e) {
                    com.google.android.gms.ads.internal.zzu.zzo().zzw(e, "PackageInfoSignalsource.compose");
                }
            }
        }
    }
}
