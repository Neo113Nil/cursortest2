package com.google.android.gms.internal.ads;

import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
final class zzfjt implements zzgoq {
    final /* synthetic */ zzfhr zza;
    final /* synthetic */ zzfib zzb;
    final /* synthetic */ zzcyh zzc;
    final /* synthetic */ zzfjv zzd;

    zzfjt(zzfjv zzfjvVar, zzfhr zzfhrVar, zzfib zzfibVar, zzcyh zzcyhVar) {
        this.zza = zzfhrVar;
        this.zzb = zzfibVar;
        this.zzc = zzcyhVar;
        Objects.requireNonNull(zzfjvVar);
        this.zzd = zzfjvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final void zza(Throwable th) {
        zzfhr zzfhrVar = this.zza;
        if (zzfhrVar == null) {
            return;
        }
        zzfhrVar.zzd(false);
        zzfib zzfibVar = this.zzb;
        if (zzfibVar != null) {
            zzfibVar.zza(zzfhrVar);
            zzfibVar.zzh();
        } else {
            zzfjv zzfjvVar = this.zzd;
            zzfjvVar.zze().zzb(zzfhrVar.zzm());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00bd, code lost:
    
        if (r4.equals("PRECISE") != false) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c0  */
    @Override // com.google.android.gms.internal.ads.zzgoq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        int i;
        int hashCode;
        zzfhr zzfhrVar = this.zza;
        com.google.android.gms.ads.internal.util.client.zzt zztVar = (com.google.android.gms.ads.internal.util.client.zzt) obj;
        if (zzfhrVar != null) {
            zzfhrVar.zzd(zztVar == com.google.android.gms.ads.internal.util.client.zzt.SUCCESS);
            zzfib zzfibVar = this.zzb;
            if (zzfibVar == null) {
                this.zzd.zze().zzb(zzfhrVar.zzm());
            } else {
                zzfibVar.zza(zzfhrVar);
                zzfibVar.zzh();
            }
        }
        zzcyh zzcyhVar = this.zzc;
        if (zzcyhVar == null) {
            return;
        }
        String zzb = this.zzd.zzd().zzb();
        if (TextUtils.isEmpty(zzb)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(zzb);
            Parcelable.Creator<com.google.android.gms.ads.internal.client.zzt> creator = com.google.android.gms.ads.internal.client.zzt.CREATOR;
            String optString = jSONObject.optString("type");
            String optString2 = jSONObject.optString("precision");
            String optString3 = jSONObject.optString("currency");
            long optLong = jSONObject.optLong(AppMeasurementSdk.ConditionalUserProperty.VALUE, 0L);
            int hashCode2 = optString.hashCode();
            int i2 = 3;
            if (hashCode2 == 66934) {
                if (optString.equals("CPC")) {
                    i = 2;
                    hashCode = optString2.hashCode();
                    if (hashCode != -2131980260) {
                    }
                }
                i = 0;
                hashCode = optString2.hashCode();
                if (hashCode != -2131980260) {
                }
            } else if (hashCode2 != 66944) {
                if (hashCode2 == 1349395245 && optString.equals("ONE_PIXEL")) {
                    optLong /= 1000;
                    i = 3;
                    hashCode = optString2.hashCode();
                    if (hashCode != -2131980260) {
                        if (optString2.equals("ESTIMATED")) {
                            i2 = 1;
                            zzcyhVar.zza(new com.google.android.gms.ads.internal.client.zzt(i, i2, optString3, optLong));
                            return;
                        }
                        i2 = 0;
                        zzcyhVar.zza(new com.google.android.gms.ads.internal.client.zzt(i, i2, optString3, optLong));
                        return;
                    }
                    if (hashCode != 399232571) {
                        if (hashCode == 1271254246 && optString2.equals("PUBLISHER_PROVIDED")) {
                            i2 = 2;
                            zzcyhVar.zza(new com.google.android.gms.ads.internal.client.zzt(i, i2, optString3, optLong));
                            return;
                        }
                        i2 = 0;
                        zzcyhVar.zza(new com.google.android.gms.ads.internal.client.zzt(i, i2, optString3, optLong));
                        return;
                    }
                }
                i = 0;
                hashCode = optString2.hashCode();
                if (hashCode != -2131980260) {
                }
            } else {
                if (optString.equals("CPM")) {
                    i = 1;
                    hashCode = optString2.hashCode();
                    if (hashCode != -2131980260) {
                    }
                }
                i = 0;
                hashCode = optString2.hashCode();
                if (hashCode != -2131980260) {
                }
            }
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "UrlPinger.pingUrl");
        }
    }
}
