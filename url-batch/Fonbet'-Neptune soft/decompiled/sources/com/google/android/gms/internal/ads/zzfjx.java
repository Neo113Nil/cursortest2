package com.google.android.gms.internal.ads;

import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.neptunesoft.bacdz.QuizContract;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes3.dex */
final class zzfjx implements zzgdj {
    final /* synthetic */ zzfhj zza;
    final /* synthetic */ zzfhu zzb;
    final /* synthetic */ zzcyi zzc;
    final /* synthetic */ zzfjy zzd;

    zzfjx(zzfjy zzfjyVar, zzfhj zzfhjVar, zzfhu zzfhuVar, zzcyi zzcyiVar) {
        this.zza = zzfhjVar;
        this.zzb = zzfhuVar;
        this.zzc = zzcyiVar;
        Objects.requireNonNull(zzfjyVar);
        this.zzd = zzfjyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgdj
    public final void zza(Throwable th) {
        zzfhx zzfhxVar;
        zzfhj zzfhjVar = this.zza;
        if (zzfhjVar == null) {
            return;
        }
        zzfhjVar.zzg(false);
        zzfhu zzfhuVar = this.zzb;
        if (zzfhuVar == null) {
            zzfhxVar = this.zzd.zzf;
            zzfhxVar.zzc(zzfhjVar.zzm());
        } else {
            zzfhuVar.zza(zzfhjVar);
            zzfhuVar.zzh();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00bd, code lost:
    
        if (r4.equals("PRECISE") != false) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c0  */
    @Override // com.google.android.gms.internal.ads.zzgdj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        com.google.android.gms.ads.internal.util.client.zzu zzuVar;
        int i;
        int hashCode;
        zzfhx zzfhxVar;
        zzfhj zzfhjVar = this.zza;
        com.google.android.gms.ads.internal.util.client.zzt zztVar = (com.google.android.gms.ads.internal.util.client.zzt) obj;
        if (zzfhjVar != null) {
            zzfhjVar.zzg(zztVar == com.google.android.gms.ads.internal.util.client.zzt.SUCCESS);
            zzfhu zzfhuVar = this.zzb;
            if (zzfhuVar == null) {
                zzfhxVar = this.zzd.zzf;
                zzfhxVar.zzc(zzfhjVar.zzm());
            } else {
                zzfhuVar.zza(zzfhjVar);
                zzfhuVar.zzh();
            }
        }
        zzcyi zzcyiVar = this.zzc;
        if (zzcyiVar == null) {
            return;
        }
        zzuVar = this.zzd.zzd;
        String zzb = zzuVar.zzb();
        if (TextUtils.isEmpty(zzb)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(zzb);
            Parcelable.Creator<com.google.android.gms.ads.internal.client.zzt> creator = com.google.android.gms.ads.internal.client.zzt.CREATOR;
            String optString = jSONObject.optString(QuizContract.QuestionTable.COLUMN_TYPE);
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
                            zzcyiVar.zza(new com.google.android.gms.ads.internal.client.zzt(i, i2, optString3, optLong));
                            return;
                        }
                        i2 = 0;
                        zzcyiVar.zza(new com.google.android.gms.ads.internal.client.zzt(i, i2, optString3, optLong));
                        return;
                    }
                    if (hashCode != 399232571) {
                        if (hashCode == 1271254246 && optString2.equals("PUBLISHER_PROVIDED")) {
                            i2 = 2;
                            zzcyiVar.zza(new com.google.android.gms.ads.internal.client.zzt(i, i2, optString3, optLong));
                            return;
                        }
                        i2 = 0;
                        zzcyiVar.zza(new com.google.android.gms.ads.internal.client.zzt(i, i2, optString3, optLong));
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
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "UrlPinger.pingUrl");
        }
    }
}
