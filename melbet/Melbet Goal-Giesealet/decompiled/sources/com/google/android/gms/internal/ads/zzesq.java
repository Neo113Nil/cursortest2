package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.os.EnvironmentCompat;
import com.facebook.common.callercontext.ContextChain;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzesq implements zzeun {
    private final zzfdc zza;
    private final PackageInfo zzb;
    private final com.google.android.gms.ads.internal.util.zzg zzc;

    public zzesq(zzfdc zzfdcVar, PackageInfo packageInfo, com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zza = zzfdcVar;
        this.zzb = packageInfo;
        this.zzc = zzgVar;
    }

    private final void zzc(Bundle bundle) {
        int i;
        zzbfl zzbflVar = this.zza.zzj;
        if (zzbflVar == null || (i = zzbflVar.zzi) == 0) {
            return;
        }
        bundle.putBoolean("sccg_tap", zzbflVar.zzj);
        bundle.putInt("sccg_dir", i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00df, code lost:
    
        if (r0 == 3) goto L71;
     */
    @Override // com.google.android.gms.internal.ads.zzeun
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        JSONArray optJSONArray;
        zzfdc zzfdcVar = this.zza;
        ArrayList<String> arrayList = zzfdcVar.zzh;
        zzcuu zzcuuVar = (zzcuu) obj;
        if (arrayList == null) {
            return;
        }
        if (arrayList.isEmpty()) {
            zzcuuVar.zza.putInt("native_version", 0);
            return;
        }
        Bundle bundle = zzcuuVar.zza;
        bundle.putInt("native_version", 3);
        bundle.putStringArrayList("native_templates", arrayList);
        bundle.putStringArrayList("native_custom_templates", zzfdcVar.zzi);
        zzbfl zzbflVar = zzfdcVar.zzj;
        if (zzbflVar != null) {
            String str = "landscape";
            if (zzbflVar.zza > 3) {
                bundle.putBoolean("enable_native_media_orientation", true);
                int i = zzbflVar.zzh;
                String str2 = i != 1 ? i != 2 ? i != 3 ? i != 4 ? EnvironmentCompat.MEDIA_UNKNOWN : "square" : "portrait" : "landscape" : "any";
                if (!EnvironmentCompat.MEDIA_UNKNOWN.equals(str2)) {
                    bundle.putString("native_media_orientation", str2);
                }
            }
            int i2 = zzbflVar.zzc;
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
            bundle.putBoolean("native_multiple_images", zzbflVar.zzd);
            bundle.putBoolean("use_custom_mute", zzbflVar.zzg);
            zzc(bundle);
        }
        PackageInfo packageInfo = this.zzb;
        int i3 = packageInfo != null ? packageInfo.versionCode : 0;
        com.google.android.gms.ads.internal.util.zzg zzgVar = this.zzc;
        if (i3 > zzgVar.zzg()) {
            zzgVar.zzt();
            zzgVar.zzf(i3);
        }
        JSONObject zzs = zzgVar.zzs();
        String str3 = null;
        if (zzs != null && (optJSONArray = zzs.optJSONArray(zzfdcVar.zzg)) != null) {
            str3 = optJSONArray.toString();
        }
        if (!TextUtils.isEmpty(str3)) {
            bundle.putString("native_advanced_settings", str3);
        }
        int i4 = zzfdcVar.zzl;
        if (i4 > 1) {
            bundle.putInt("max_num_ads", i4);
        }
        zzblw zzblwVar = zzfdcVar.zzb;
        if (zzblwVar != null) {
            String str4 = zzblwVar.zzc;
            if (TextUtils.isEmpty(str4)) {
                int i5 = zzblwVar.zza;
                String str5 = ContextChain.TAG_PRODUCT;
                if (i5 >= 2) {
                    int i6 = zzblwVar.zzd;
                    if (i6 != 2) {
                    }
                    str5 = "l";
                    bundle.putString("ia_var", str5);
                } else {
                    int i7 = zzblwVar.zzb;
                    if (i7 != 1) {
                        if (i7 != 2) {
                            StringBuilder sb = new StringBuilder(String.valueOf(i7).length() + 41);
                            sb.append("Instream ad video aspect ratio ");
                            sb.append(i7);
                            sb.append(" is wrong.");
                            com.google.android.gms.ads.internal.util.client.zzo.zzf(sb.toString());
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
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzmG)).booleanValue() || zzbflVar == null) {
            return;
        }
        com.google.android.gms.ads.internal.client.zzga zzgaVar = zzbflVar.zzf;
        if (zzgaVar != null) {
            Bundle bundle2 = new Bundle();
            bundle2.putBoolean("startMuted", zzgaVar.zza);
            bundle2.putBoolean("clickToExpandRequested", zzgaVar.zzc);
            bundle2.putBoolean("customControlsRequested", zzgaVar.zzb);
            bundle.putBundle("video", bundle2);
        }
        bundle.putBoolean("disable_image_loading", zzbflVar.zzb);
        bundle.putInt("preferred_ad_choices_position", zzbflVar.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        ArrayList arrayList = this.zza.zzh;
        zzcuu zzcuuVar = (zzcuu) obj;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        zzc(zzcuuVar.zzb);
    }
}
