package com.google.android.gms.ads.nonagon.signalgeneration;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbdc;
import com.google.android.gms.internal.ads.zzbeo;
import com.google.android.gms.internal.ads.zzcab;
import com.google.android.gms.internal.ads.zzcai;
import com.google.android.gms.internal.ads.zzcbn;
import com.google.android.gms.internal.ads.zzcbt;
import com.google.android.gms.internal.ads.zzdtk;
import com.google.android.gms.internal.ads.zzdtu;
import com.google.android.gms.internal.ads.zzfjw;
import com.google.android.gms.internal.ads.zzfkh;
import com.google.android.gms.internal.ads.zzgax;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzw implements zzgax {
    final /* synthetic */ ListenableFuture zza;
    final /* synthetic */ zzcai zzb;
    final /* synthetic */ zzcab zzc;
    final /* synthetic */ zzfjw zzd;
    final /* synthetic */ long zze;
    final /* synthetic */ zzaa zzf;

    zzw(zzaa zzaaVar, ListenableFuture listenableFuture, zzcai zzcaiVar, zzcab zzcabVar, zzfjw zzfjwVar, long j) {
        this.zzf = zzaaVar;
        this.zza = listenableFuture;
        this.zzb = zzcaiVar;
        this.zzc = zzcabVar;
        this.zzd = zzfjwVar;
        this.zze = j;
    }

    @Override // com.google.android.gms.internal.ads.zzgax
    public final void zza(Throwable th) {
        zzdtu zzdtuVar;
        zzdtk zzdtkVar;
        long currentTimeMillis = com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis() - this.zze;
        String message = th.getMessage();
        com.google.android.gms.ads.internal.zzt.zzo().zzw(th, "SignalGeneratorImpl.generateSignals");
        zzaa zzaaVar = this.zzf;
        zzdtuVar = zzaaVar.zzr;
        zzdtkVar = zzaaVar.zzj;
        zzf.zzc(zzdtuVar, zzdtkVar, "sgf", new Pair("sgf_reason", message), new Pair("tqgt", String.valueOf(currentTimeMillis)));
        zzfkh zzr = zzaa.zzr(this.zza, this.zzb);
        if (((Boolean) zzbeo.zze.zze()).booleanValue() && zzr != null) {
            zzfjw zzfjwVar = this.zzd;
            zzfjwVar.zzg(th);
            zzfjwVar.zzf(false);
            zzr.zza(zzfjwVar);
            zzr.zzg();
        }
        try {
            if (!"Unknown format is no longer supported.".equals(message)) {
                message = "Internal error. " + message;
            }
            this.zzc.zzb(message);
        } catch (RemoteException e) {
            zzcbn.zzh("", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgax
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        AtomicBoolean atomicBoolean;
        zzdtu zzdtuVar;
        zzdtk zzdtkVar;
        zzdtk zzdtkVar2;
        boolean z;
        boolean z2;
        zzdtu zzdtuVar2;
        zzdtk zzdtkVar3;
        String str;
        String str2;
        String str3;
        String str4;
        Context context;
        zzcbt zzcbtVar;
        String str5;
        String str6;
        AtomicInteger atomicInteger;
        zzdtu zzdtuVar3;
        zzdtk zzdtkVar4;
        zzdtu zzdtuVar4;
        zzdtk zzdtkVar5;
        zzam zzamVar = (zzam) obj;
        zzfkh zzr = zzaa.zzr(this.zza, this.zzb);
        atomicBoolean = this.zzf.zzI;
        atomicBoolean.set(true);
        if (!((Boolean) zzba.zzc().zza(zzbdc.zzhD)).booleanValue()) {
            try {
                this.zzc.zzb("QueryInfo generation has been disabled.");
            } catch (RemoteException e) {
                zzcbn.zzg("QueryInfo generation has been disabled.".concat(e.toString()));
            }
            if (!((Boolean) zzbeo.zze.zze()).booleanValue() || zzr == null) {
                return;
            }
            zzfjw zzfjwVar = this.zzd;
            zzfjwVar.zzc("QueryInfo generation has been disabled.");
            zzfjwVar.zzf(false);
            zzr.zza(zzfjwVar);
            zzr.zzg();
            return;
        }
        long currentTimeMillis = com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis() - this.zze;
        try {
            try {
                if (zzamVar == null) {
                    this.zzc.zzc(null, null, null);
                    zzaa zzaaVar = this.zzf;
                    zzdtuVar4 = zzaaVar.zzr;
                    zzdtkVar5 = zzaaVar.zzj;
                    zzf.zzc(zzdtuVar4, zzdtkVar5, "sgs", new Pair("rid", "-1"));
                    this.zzd.zzf(true);
                    if (!((Boolean) zzbeo.zze.zze()).booleanValue() || zzr == null) {
                        return;
                    }
                    zzr.zza(this.zzd);
                    zzr.zzg();
                    return;
                }
                try {
                    JSONObject jSONObject = new JSONObject(zzamVar.zzb);
                    String optString = jSONObject.optString("request_id", "");
                    if (TextUtils.isEmpty(optString)) {
                        zzcbn.zzj("The request ID is empty in request JSON.");
                        this.zzc.zzb("Internal error: request ID is empty in request JSON.");
                        zzaa zzaaVar2 = this.zzf;
                        zzdtuVar3 = zzaaVar2.zzr;
                        zzdtkVar4 = zzaaVar2.zzj;
                        zzf.zzc(zzdtuVar3, zzdtkVar4, "sgf", new Pair("sgf_reason", "rid_missing"));
                        zzfjw zzfjwVar2 = this.zzd;
                        zzfjwVar2.zzc("Request ID empty");
                        zzfjwVar2.zzf(false);
                        if (!((Boolean) zzbeo.zze.zze()).booleanValue() || zzr == null) {
                            return;
                        }
                        zzr.zza(this.zzd);
                        zzr.zzg();
                        return;
                    }
                    zzaa zzaaVar3 = this.zzf;
                    String str7 = zzamVar.zzb;
                    zzdtkVar2 = zzaaVar3.zzj;
                    zzaa.zzJ(zzaaVar3, optString, str7, zzdtkVar2);
                    Bundle bundle = zzamVar.zzc;
                    zzaa zzaaVar4 = this.zzf;
                    z = zzaaVar4.zzw;
                    if (z && bundle != null) {
                        str5 = zzaaVar4.zzy;
                        if (bundle.getInt(str5, -1) == -1) {
                            zzaa zzaaVar5 = this.zzf;
                            str6 = zzaaVar5.zzy;
                            atomicInteger = zzaaVar5.zzz;
                            bundle.putInt(str6, atomicInteger.get());
                        }
                    }
                    zzaa zzaaVar6 = this.zzf;
                    z2 = zzaaVar6.zzv;
                    if (z2 && bundle != null) {
                        str = zzaaVar6.zzx;
                        if (TextUtils.isEmpty(bundle.getString(str))) {
                            str2 = this.zzf.zzB;
                            if (TextUtils.isEmpty(str2)) {
                                zzaa zzaaVar7 = this.zzf;
                                com.google.android.gms.ads.internal.util.zzt zzp = com.google.android.gms.ads.internal.zzt.zzp();
                                zzaa zzaaVar8 = this.zzf;
                                context = zzaaVar8.zzg;
                                zzcbtVar = zzaaVar8.zzA;
                                zzaaVar7.zzB = zzp.zzc(context, zzcbtVar.zza);
                            }
                            zzaa zzaaVar9 = this.zzf;
                            str3 = zzaaVar9.zzx;
                            str4 = zzaaVar9.zzB;
                            bundle.putString(str3, str4);
                        }
                    }
                    this.zzc.zzc(zzamVar.zza, zzamVar.zzb, bundle);
                    zzaa zzaaVar10 = this.zzf;
                    zzdtuVar2 = zzaaVar10.zzr;
                    zzdtkVar3 = zzaaVar10.zzj;
                    Pair[] pairArr = new Pair[2];
                    pairArr[0] = new Pair("tqgt", String.valueOf(currentTimeMillis));
                    String str8 = "na";
                    if (((Boolean) zzba.zzc().zza(zzbdc.zzjq)).booleanValue()) {
                        try {
                            str8 = jSONObject.getJSONObject("extras").getBoolean("accept_3p_cookie") ? "1" : "0";
                        } catch (JSONException e2) {
                            zzcbn.zzh("Error retrieving JSONObject from the requestJson, ", e2);
                        }
                    }
                    pairArr[1] = new Pair("tpc", str8);
                    zzf.zzc(zzdtuVar2, zzdtkVar3, "sgs", pairArr);
                    this.zzd.zzf(true);
                    if (!((Boolean) zzbeo.zze.zze()).booleanValue() || zzr == null) {
                        return;
                    }
                    zzr.zza(this.zzd);
                    zzr.zzg();
                } catch (JSONException e3) {
                    zzcbn.zzj("Failed to create JSON object from the request string.");
                    this.zzc.zzb("Internal error for request JSON: " + e3.toString());
                    zzaa zzaaVar11 = this.zzf;
                    zzdtuVar = zzaaVar11.zzr;
                    zzdtkVar = zzaaVar11.zzj;
                    zzf.zzc(zzdtuVar, zzdtkVar, "sgf", new Pair("sgf_reason", "request_invalid"));
                    zzfjw zzfjwVar3 = this.zzd;
                    zzfjwVar3.zzg(e3);
                    zzfjwVar3.zzf(false);
                    com.google.android.gms.ads.internal.zzt.zzo().zzw(e3, "SignalGeneratorImpl.generateSignals.onSuccess");
                    if (!((Boolean) zzbeo.zze.zze()).booleanValue() || zzr == null) {
                        return;
                    }
                    zzr.zza(this.zzd);
                    zzr.zzg();
                }
            } catch (Throwable th) {
                if (((Boolean) zzbeo.zze.zze()).booleanValue() && zzr != null) {
                    zzr.zza(this.zzd);
                    zzr.zzg();
                }
                throw th;
            }
        } catch (RemoteException e4) {
            zzfjw zzfjwVar4 = this.zzd;
            zzfjwVar4.zzg(e4);
            zzfjwVar4.zzf(false);
            zzcbn.zzh("", e4);
            com.google.android.gms.ads.internal.zzt.zzo().zzw(e4, "SignalGeneratorImpl.generateSignals.onSuccess");
            if (!((Boolean) zzbeo.zze.zze()).booleanValue() || zzr == null) {
                return;
            }
            zzr.zza(this.zzd);
            zzr.zzg();
        }
    }
}
