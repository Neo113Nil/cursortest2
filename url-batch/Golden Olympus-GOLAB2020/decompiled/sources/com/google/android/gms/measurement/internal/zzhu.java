package com.google.android.gms.measurement.internal;

import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.ads.installreferrer.api.ReferrerDetails;
import com.ironsource.b9;

/* loaded from: classes.dex */
final class zzhu implements Runnable {
    final /* synthetic */ com.google.android.gms.internal.measurement.zzbr zza;
    final /* synthetic */ ServiceConnection zzb;
    final /* synthetic */ zzhv zzc;

    zzhu(zzhv zzhvVar, com.google.android.gms.internal.measurement.zzbr zzbrVar, ServiceConnection serviceConnection) {
        this.zza = zzbrVar;
        this.zzb = serviceConnection;
        this.zzc = zzhvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        zzhv zzhvVar = this.zzc;
        str = zzhvVar.zzb;
        zzhw zzhwVar = zzhvVar.zza;
        zzio zzioVar = zzhwVar.zza;
        zzioVar.zzaX().zzg();
        Bundle bundle = new Bundle();
        bundle.putString(b9.h.f15462V, str);
        Bundle bundle2 = null;
        try {
            Bundle zze = this.zza.zze(bundle);
            if (zze == null) {
                zzioVar.zzaW().zze().zza("Install Referrer Service returned a null response");
            } else {
                bundle2 = zze;
            }
        } catch (Exception e4) {
            zzhwVar.zza.zzaW().zze().zzb("Exception occurred while retrieving the Install Referrer", e4.getMessage());
        }
        zzio zzioVar2 = zzhwVar.zza;
        zzioVar2.zzaX().zzg();
        zzio.zzP();
        if (bundle2 != null) {
            long j4 = bundle2.getLong(ReferrerDetails.KEY_INSTALL_BEGIN_TIMESTAMP, 0L) * 1000;
            if (j4 == 0) {
                zzioVar2.zzaW().zzk().zza("Service response is missing Install Referrer install timestamp");
            } else {
                String string = bundle2.getString(ReferrerDetails.KEY_INSTALL_REFERRER);
                if (string == null || string.isEmpty()) {
                    zzioVar2.zzaW().zze().zza("No referrer defined in Install Referrer response");
                } else {
                    zzioVar2.zzaW().zzj().zzb("InstallReferrer API result", string);
                    Bundle zzu = zzioVar2.zzw().zzu(Uri.parse("?".concat(string)));
                    if (zzu == null) {
                        zzioVar2.zzaW().zze().zza("No campaign params defined in Install Referrer result");
                    } else {
                        if (zzu.containsKey("gclid") || zzu.containsKey("gbraid")) {
                            long j5 = bundle2.getLong("referrer_click_timestamp_server_seconds", 0L) * 1000;
                            if (j5 > 0) {
                                zzu.putLong("click_timestamp", j5);
                            }
                        }
                        if (j4 == zzioVar2.zzm().zzd.zza()) {
                            zzioVar2.zzaW().zzj().zza("Logging Install Referrer campaign from module while it may have already been logged.");
                        }
                        if (zzioVar2.zzJ()) {
                            zzioVar2.zzm().zzd.zzb(j4);
                            zzioVar2.zzaW().zzj().zzb("Logging Install Referrer campaign from gmscore with ", "referrer API v2");
                            zzu.putString("_cis", "referrer API v2");
                            zzioVar2.zzq().zzQ("auto", Constants.ScionAnalytics.EVENT_FIREBASE_CAMPAIGN, zzu, str);
                        }
                    }
                }
            }
        }
        ConnectionTracker.getInstance().unbindService(zzioVar2.zzaT(), this.zzb);
    }
}
