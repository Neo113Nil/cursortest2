package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.os.EnvironmentCompat;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes3.dex */
public final class zzesh implements zzeub {
    private final zzfcw zza;
    private final PackageInfo zzb;
    private final com.google.android.gms.ads.internal.util.zzg zzc;

    public zzesh(zzfcw zzfcwVar, PackageInfo packageInfo, com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zza = zzfcwVar;
        this.zzb = packageInfo;
        this.zzc = zzgVar;
    }

    private final void zzc(Bundle bundle) {
        int i;
        zzbge zzbgeVar = this.zza.zzi;
        if (zzbgeVar == null || (i = zzbgeVar.zzi) == 0) {
            return;
        }
        bundle.putBoolean("sccg_tap", zzbgeVar.zzj);
        bundle.putInt("sccg_dir", i);
    }

    @Override // com.google.android.gms.internal.ads.zzeub
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        ArrayList arrayList = this.zza.zzg;
        zzcva zzcvaVar = (zzcva) obj;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        zzc(zzcvaVar.zzb);
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00df, code lost:
    
        if (r0 == 3) goto L71;
     */
    @Override // com.google.android.gms.internal.ads.zzeub
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        JSONArray optJSONArray;
        zzfcw zzfcwVar = this.zza;
        ArrayList<String> arrayList = zzfcwVar.zzg;
        zzcva zzcvaVar = (zzcva) obj;
        if (arrayList == null) {
            return;
        }
        if (arrayList.isEmpty()) {
            zzcvaVar.zza.putInt("native_version", 0);
            return;
        }
        Bundle bundle = zzcvaVar.zza;
        bundle.putInt("native_version", 3);
        bundle.putStringArrayList("native_templates", arrayList);
        bundle.putStringArrayList("native_custom_templates", zzfcwVar.zzh);
        zzbge zzbgeVar = zzfcwVar.zzi;
        if (zzbgeVar != null) {
            String str = "landscape";
            if (zzbgeVar.zza > 3) {
                bundle.putBoolean("enable_native_media_orientation", true);
                int i = zzbgeVar.zzh;
                String str2 = i != 1 ? i != 2 ? i != 3 ? i != 4 ? EnvironmentCompat.MEDIA_UNKNOWN : "square" : "portrait" : "landscape" : "any";
                if (!EnvironmentCompat.MEDIA_UNKNOWN.equals(str2)) {
                    bundle.putString("native_media_orientation", str2);
                }
            }
            int i2 = zzbgeVar.zzc;
            if (i2 == 0) {
                str = "any";
            } else if (i2 == 1) {
                str = "portrait";
            } else if (i2 != 2) {
                str = EnvironmentCompat.MEDIA_UNKNOWN;
            }
            if (!EnvironmentCompat.MEDIA_UNKNOWN.equals(str)) {
                bundle.putString("native_image_orientation", str);
            }
            bundle.putBoolean("native_multiple_images", zzbgeVar.zzd);
            bundle.putBoolean("use_custom_mute", zzbgeVar.zzg);
            zzc(bundle);
        }
        PackageInfo packageInfo = this.zzb;
        int i3 = packageInfo != null ? packageInfo.versionCode : 0;
        com.google.android.gms.ads.internal.util.zzg zzgVar = this.zzc;
        if (i3 > zzgVar.zza()) {
            zzgVar.zzq();
            zzgVar.zzt(i3);
        }
        JSONObject zzn = zzgVar.zzn();
        String str3 = null;
        if (zzn != null && (optJSONArray = zzn.optJSONArray(zzfcwVar.zzf)) != null) {
            str3 = optJSONArray.toString();
        }
        if (!TextUtils.isEmpty(str3)) {
            bundle.putString("native_advanced_settings", str3);
        }
        int i4 = zzfcwVar.zzk;
        if (i4 > 1) {
            bundle.putInt("max_num_ads", i4);
        }
        zzbmp zzbmpVar = zzfcwVar.zzb;
        if (zzbmpVar != null) {
            String str4 = zzbmpVar.zzc;
            if (TextUtils.isEmpty(str4)) {
                String str5 = "p";
                if (zzbmpVar.zza >= 2) {
                    int i5 = zzbmpVar.zzd;
                    if (i5 != 2) {
                    }
                    str5 = "l";
                    bundle.putString("ia_var", str5);
                } else {
                    int i6 = zzbmpVar.zzb;
                    if (i6 != 1) {
                        if (i6 != 2) {
                            com.google.android.gms.ads.internal.util.client.zzo.zzg("Instream ad video aspect ratio " + i6 + " is wrong.");
                        }
                        bundle.putString("ia_var", str5);
                    }
                    str5 = "l";
                    bundle.putString("ia_var", str5);
                }
            } else {
                bundle.putString("ad_tag", str4);
            }
            bundle.putBoolean("instr", true);
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzmn)).booleanValue() || zzbgeVar == null) {
            return;
        }
        com.google.android.gms.ads.internal.client.zzgc zzgcVar = zzbgeVar.zzf;
        if (zzgcVar != null) {
            Bundle bundle2 = new Bundle();
            bundle2.putBoolean("startMuted", zzgcVar.zza);
            bundle2.putBoolean("clickToExpandRequested", zzgcVar.zzc);
            bundle2.putBoolean("customControlsRequested", zzgcVar.zzb);
            bundle.putBundle("video", bundle2);
        }
        bundle.putBoolean("disable_image_loading", zzbgeVar.zzb);
        bundle.putInt("preferred_ad_choices_position", zzbgeVar.zze);
    }
}
