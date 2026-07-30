package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.internal.AnalyticsEvents;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzeyy implements zzfav {
    private final zzfjk zza;
    private final PackageInfo zzb;
    private final com.google.android.gms.ads.internal.util.zzg zzc;

    public zzeyy(zzfjk zzfjkVar, PackageInfo packageInfo, com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zza = zzfjkVar;
        this.zzb = packageInfo;
        this.zzc = zzgVar;
    }

    private final void zzc(Bundle bundle) {
        int i;
        zzbkh zzbkhVar = this.zza.zzj;
        if (zzbkhVar == null || (i = zzbkhVar.zzi) == 0) {
            return;
        }
        bundle.putBoolean("sccg_tap", zzbkhVar.zzj);
        bundle.putInt("sccg_dir", i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00df, code lost:
    
        if (r0 == 3) goto L71;
     */
    @Override // com.google.android.gms.internal.ads.zzfav
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        JSONArray optJSONArray;
        zzfjk zzfjkVar = this.zza;
        ArrayList<String> arrayList = zzfjkVar.zzh;
        zzdah zzdahVar = (zzdah) obj;
        if (arrayList == null) {
            return;
        }
        if (arrayList.isEmpty()) {
            zzdahVar.zza.putInt("native_version", 0);
            return;
        }
        Bundle bundle = zzdahVar.zza;
        bundle.putInt("native_version", 3);
        bundle.putStringArrayList("native_templates", arrayList);
        bundle.putStringArrayList("native_custom_templates", zzfjkVar.zzi);
        zzbkh zzbkhVar = zzfjkVar.zzj;
        if (zzbkhVar != null) {
            String str = "landscape";
            if (zzbkhVar.zza > 3) {
                bundle.putBoolean("enable_native_media_orientation", true);
                int i = zzbkhVar.zzh;
                String str2 = i != 1 ? i != 2 ? i != 3 ? i != 4 ? "unknown" : "square" : "portrait" : "landscape" : "any";
                if (!"unknown".equals(str2)) {
                    bundle.putString("native_media_orientation", str2);
                }
            }
            int i2 = zzbkhVar.zzc;
            if (i2 == 0) {
                str = "any";
            } else if (i2 == 1) {
                str = "portrait";
            } else if (i2 != 2) {
                str = "unknown";
            }
            if (!"unknown".equals(str)) {
                bundle.putString("native_image_orientation", str);
            }
            bundle.putBoolean("native_multiple_images", zzbkhVar.zzd);
            bundle.putBoolean("use_custom_mute", zzbkhVar.zzg);
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
        if (zzs != null && (optJSONArray = zzs.optJSONArray(zzfjkVar.zzg)) != null) {
            str3 = optJSONArray.toString();
        }
        if (!TextUtils.isEmpty(str3)) {
            bundle.putString("native_advanced_settings", str3);
        }
        int i4 = zzfjkVar.zzl;
        if (i4 > 1) {
            bundle.putInt("max_num_ads", i4);
        }
        zzbqs zzbqsVar = zzfjkVar.zzb;
        if (zzbqsVar != null) {
            String str4 = zzbqsVar.zzc;
            if (TextUtils.isEmpty(str4)) {
                String str5 = "p";
                if (zzbqsVar.zza >= 2) {
                    int i5 = zzbqsVar.zzd;
                    if (i5 != 2) {
                    }
                    str5 = "l";
                    bundle.putString("ia_var", str5);
                } else {
                    int i6 = zzbqsVar.zzb;
                    if (i6 != 1) {
                        if (i6 != 2) {
                            StringBuilder sb = new StringBuilder(String.valueOf(i6).length() + 41);
                            sb.append("Instream ad video aspect ratio ");
                            sb.append(i6);
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
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzno)).booleanValue() || zzbkhVar == null) {
            return;
        }
        com.google.android.gms.ads.internal.client.zzga zzgaVar = zzbkhVar.zzf;
        if (zzgaVar != null) {
            Bundle bundle2 = new Bundle();
            bundle2.putBoolean("startMuted", zzgaVar.zza);
            bundle2.putBoolean("clickToExpandRequested", zzgaVar.zzc);
            bundle2.putBoolean("customControlsRequested", zzgaVar.zzb);
            bundle.putBundle(AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_VIDEO, bundle2);
        }
        bundle.putBoolean("disable_image_loading", zzbkhVar.zzb);
        bundle.putInt("preferred_ad_choices_position", zzbkhVar.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzfav
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        ArrayList arrayList = this.zza.zzh;
        zzdah zzdahVar = (zzdah) obj;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        zzc(zzdahVar.zzb);
    }
}
