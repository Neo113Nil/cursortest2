package com.google.android.gms.internal.ads;

import android.os.Parcelable;
import android.text.TextUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzfqi implements zzgzl {
    final /* synthetic */ zzfoe zza;
    final /* synthetic */ zzfoo zzb;
    final /* synthetic */ zzddu zzc;
    final /* synthetic */ zzfqk zzd;

    zzfqi(zzfqk zzfqkVar, zzfoe zzfoeVar, zzfoo zzfooVar, zzddu zzdduVar) {
        this.zza = zzfoeVar;
        this.zzb = zzfooVar;
        this.zzc = zzdduVar;
        Objects.requireNonNull(zzfqkVar);
        this.zzd = zzfqkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zza(Throwable th) {
        zzfoe zzfoeVar = this.zza;
        if (zzfoeVar == null) {
            return;
        }
        zzfoeVar.zzd(false);
        zzfoo zzfooVar = this.zzb;
        if (zzfooVar != null) {
            zzfooVar.zza(zzfoeVar);
            zzfooVar.zzh();
        } else {
            zzfqk zzfqkVar = this.zzd;
            zzfqkVar.zze().zzb(zzfoeVar.zzm());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a6  */
    @Override // com.google.android.gms.internal.ads.zzgzl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        char c;
        int i;
        int hashCode;
        zzfoe zzfoeVar = this.zza;
        com.google.android.gms.ads.internal.util.client.zzt zztVar = (com.google.android.gms.ads.internal.util.client.zzt) obj;
        if (zzfoeVar != null) {
            zzfoeVar.zzd(zztVar == com.google.android.gms.ads.internal.util.client.zzt.SUCCESS);
            zzfoo zzfooVar = this.zzb;
            if (zzfooVar == null) {
                this.zzd.zze().zzb(zzfoeVar.zzm());
            } else {
                zzfooVar.zza(zzfoeVar);
                zzfooVar.zzh();
            }
        }
        zzddu zzdduVar = this.zzc;
        if (zzdduVar != null) {
            String zzb = this.zzd.zzd().zzb();
            if (TextUtils.isEmpty(zzb)) {
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(zzb);
                Parcelable.Creator<com.google.android.gms.ads.internal.client.zzt> creator = com.google.android.gms.ads.internal.client.zzt.CREATOR;
                String optString = jSONObject.optString("type");
                String optString2 = jSONObject.optString("precision");
                String optString3 = jSONObject.optString(FirebaseAnalytics.Param.CURRENCY);
                long optLong = jSONObject.optLong("value", 0L);
                int hashCode2 = optString.hashCode();
                char c2 = 65535;
                if (hashCode2 == 66934) {
                    if (optString.equals("CPC")) {
                        c = 1;
                        if (c != 0) {
                        }
                        hashCode = optString2.hashCode();
                        if (hashCode == -2131980260) {
                        }
                        zzdduVar.zza(new com.google.android.gms.ads.internal.client.zzt(i, c2 == 0 ? c2 != 1 ? c2 != 2 ? 0 : 3 : 2 : 1, optString3, optLong));
                    }
                    c = 65535;
                    if (c != 0) {
                    }
                    hashCode = optString2.hashCode();
                    if (hashCode == -2131980260) {
                    }
                    zzdduVar.zza(new com.google.android.gms.ads.internal.client.zzt(i, c2 == 0 ? c2 != 1 ? c2 != 2 ? 0 : 3 : 2 : 1, optString3, optLong));
                }
                if (hashCode2 == 66944) {
                    if (optString.equals("CPM")) {
                        c = 0;
                        if (c != 0) {
                        }
                        hashCode = optString2.hashCode();
                        if (hashCode == -2131980260) {
                        }
                        zzdduVar.zza(new com.google.android.gms.ads.internal.client.zzt(i, c2 == 0 ? c2 != 1 ? c2 != 2 ? 0 : 3 : 2 : 1, optString3, optLong));
                    }
                    c = 65535;
                    if (c != 0) {
                    }
                    hashCode = optString2.hashCode();
                    if (hashCode == -2131980260) {
                    }
                    zzdduVar.zza(new com.google.android.gms.ads.internal.client.zzt(i, c2 == 0 ? c2 != 1 ? c2 != 2 ? 0 : 3 : 2 : 1, optString3, optLong));
                }
                if (hashCode2 == 1349395245 && optString.equals("ONE_PIXEL")) {
                    c = 2;
                    if (c != 0) {
                        i = 1;
                    } else if (c == 1) {
                        i = 2;
                    } else if (c != 2) {
                        i = 0;
                    } else {
                        optLong /= 1000;
                        i = 3;
                    }
                    hashCode = optString2.hashCode();
                    if (hashCode == -2131980260) {
                        if (hashCode != 399232571) {
                            if (hashCode == 1271254246 && optString2.equals("PUBLISHER_PROVIDED")) {
                                c2 = 1;
                            }
                        } else if (optString2.equals("PRECISE")) {
                            c2 = 2;
                        }
                    } else if (optString2.equals("ESTIMATED")) {
                        c2 = 0;
                    }
                    zzdduVar.zza(new com.google.android.gms.ads.internal.client.zzt(i, c2 == 0 ? c2 != 1 ? c2 != 2 ? 0 : 3 : 2 : 1, optString3, optLong));
                }
                c = 65535;
                if (c != 0) {
                }
                hashCode = optString2.hashCode();
                if (hashCode == -2131980260) {
                }
                zzdduVar.zza(new com.google.android.gms.ads.internal.client.zzt(i, c2 == 0 ? c2 != 1 ? c2 != 2 ? 0 : 3 : 2 : 1, optString3, optLong));
            } catch (JSONException e) {
                com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "UrlPinger.pingUrl");
            }
        }
    }
}
