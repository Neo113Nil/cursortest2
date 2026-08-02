package com.google.android.gms.ads.nonagon.signalgeneration;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.ads.zzbbw;
import com.google.android.gms.internal.ads.zzbdl;
import com.google.android.gms.internal.ads.zzbyj;
import com.google.android.gms.internal.ads.zzbyq;
import com.google.android.gms.internal.ads.zzfju;
import com.google.android.gms.internal.ads.zzfkf;
import com.google.android.gms.internal.ads.zzgcf;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes.dex */
final class zzag implements zzgcf {
    final /* synthetic */ ListenableFuture zza;
    final /* synthetic */ zzbyq zzb;
    final /* synthetic */ zzbyj zzc;
    final /* synthetic */ zzfju zzd;
    final /* synthetic */ zzak zze;

    zzag(zzak zzakVar, ListenableFuture listenableFuture, zzbyq zzbyqVar, zzbyj zzbyjVar, zzfju zzfjuVar) {
        this.zza = listenableFuture;
        this.zzb = zzbyqVar;
        this.zzc = zzbyjVar;
        this.zzd = zzfjuVar;
        this.zze = zzakVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcf
    public final void zza(Throwable th) {
        String message = th.getMessage();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzgT)).booleanValue()) {
            com.google.android.gms.ads.internal.zzu.zzo().zzv(th, "SignalGeneratorImpl.generateSignals");
        } else {
            com.google.android.gms.ads.internal.zzu.zzo().zzw(th, "SignalGeneratorImpl.generateSignals");
        }
        zzfkf zzr = zzak.zzr(this.zza, this.zzb);
        if (((Boolean) zzbdl.zze.zze()).booleanValue() && zzr != null) {
            zzfju zzfjuVar = this.zzd;
            zzfjuVar.zzh(th);
            zzfjuVar.zzg(false);
            zzr.zza(zzfjuVar);
            zzr.zzh();
        }
        try {
            if (!"Unknown format is no longer supported.".equals(message)) {
                message = "Internal error. " + message;
            }
            this.zzc.zzb(message);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgcf
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        AtomicBoolean atomicBoolean;
        boolean z;
        boolean z2;
        String str;
        String str2;
        String str3;
        String str4;
        Context context;
        VersionInfoParcel versionInfoParcel;
        String str5;
        String str6;
        AtomicInteger atomicInteger;
        zzay zzayVar = (zzay) obj;
        zzfkf zzr = zzak.zzr(this.zza, this.zzb);
        atomicBoolean = this.zze.zzG;
        atomicBoolean.set(true);
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzgO)).booleanValue()) {
            try {
                this.zzc.zzb("QueryInfo generation has been disabled.");
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzm.zzg("QueryInfo generation has been disabled.".concat(e.toString()));
            }
            if (!((Boolean) zzbdl.zze.zze()).booleanValue() || zzr == null) {
                return;
            }
            zzfju zzfjuVar = this.zzd;
            zzfjuVar.zzc("QueryInfo generation has been disabled.");
            zzfjuVar.zzg(false);
            zzr.zza(zzfjuVar);
            zzr.zzh();
            return;
        }
        try {
            try {
                if (zzayVar == null) {
                    this.zzc.zzc(null, null, null);
                    this.zzd.zzg(true);
                    if (!((Boolean) zzbdl.zze.zze()).booleanValue() || zzr == null) {
                        return;
                    }
                    zzr.zza(this.zzd);
                    zzr.zzh();
                    return;
                }
                try {
                    if (TextUtils.isEmpty(new JSONObject(zzayVar.zzb).optString("request_id", ""))) {
                        com.google.android.gms.ads.internal.util.client.zzm.zzj("The request ID is empty in request JSON.");
                        this.zzc.zzb("Internal error: request ID is empty in request JSON.");
                        zzfju zzfjuVar2 = this.zzd;
                        zzfjuVar2.zzc("Request ID empty");
                        zzfjuVar2.zzg(false);
                        if (!((Boolean) zzbdl.zze.zze()).booleanValue() || zzr == null) {
                            return;
                        }
                        zzr.zza(this.zzd);
                        zzr.zzh();
                        return;
                    }
                    Bundle bundle = zzayVar.zzd;
                    zzak zzakVar = this.zze;
                    z = zzakVar.zzu;
                    if (z && bundle != null) {
                        str5 = zzakVar.zzw;
                        if (bundle.getInt(str5, -1) == -1) {
                            zzak zzakVar2 = this.zze;
                            str6 = zzakVar2.zzw;
                            atomicInteger = zzakVar2.zzx;
                            bundle.putInt(str6, atomicInteger.get());
                        }
                    }
                    zzak zzakVar3 = this.zze;
                    z2 = zzakVar3.zzt;
                    if (z2 && bundle != null) {
                        str = zzakVar3.zzv;
                        if (TextUtils.isEmpty(bundle.getString(str))) {
                            str2 = this.zze.zzz;
                            if (TextUtils.isEmpty(str2)) {
                                zzak zzakVar4 = this.zze;
                                com.google.android.gms.ads.internal.util.zzt zzp = com.google.android.gms.ads.internal.zzu.zzp();
                                zzak zzakVar5 = this.zze;
                                context = zzakVar5.zzg;
                                versionInfoParcel = zzakVar5.zzy;
                                zzakVar4.zzz = zzp.zzc(context, versionInfoParcel.afmaVersion);
                            }
                            zzak zzakVar6 = this.zze;
                            str3 = zzakVar6.zzv;
                            str4 = zzakVar6.zzz;
                            bundle.putString(str3, str4);
                        }
                    }
                    this.zzc.zzc(zzayVar.zza, zzayVar.zzb, bundle);
                    this.zzd.zzg(true);
                    if (!((Boolean) zzbdl.zze.zze()).booleanValue() || zzr == null) {
                        return;
                    }
                    zzr.zza(this.zzd);
                    zzr.zzh();
                } catch (JSONException e2) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzj("Failed to create JSON object from the request string.");
                    this.zzc.zzb("Internal error for request JSON: " + e2.toString());
                    zzfju zzfjuVar3 = this.zzd;
                    zzfjuVar3.zzh(e2);
                    zzfjuVar3.zzg(false);
                    com.google.android.gms.ads.internal.zzu.zzo().zzw(e2, "SignalGeneratorImpl.generateSignals.onSuccess");
                    if (!((Boolean) zzbdl.zze.zze()).booleanValue() || zzr == null) {
                        return;
                    }
                    zzr.zza(this.zzd);
                    zzr.zzh();
                }
            } catch (RemoteException e3) {
                zzfju zzfjuVar4 = this.zzd;
                zzfjuVar4.zzh(e3);
                zzfjuVar4.zzg(false);
                com.google.android.gms.ads.internal.util.client.zzm.zzh("", e3);
                com.google.android.gms.ads.internal.zzu.zzo().zzw(e3, "SignalGeneratorImpl.generateSignals.onSuccess");
                if (!((Boolean) zzbdl.zze.zze()).booleanValue() || zzr == null) {
                    return;
                }
                zzr.zza(this.zzd);
                zzr.zzh();
            }
        } catch (Throwable th) {
            if (((Boolean) zzbdl.zze.zze()).booleanValue() && zzr != null) {
                zzr.zza(this.zzd);
                zzr.zzh();
            }
            throw th;
        }
    }
}
