package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.os.EnvironmentCompat;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzesv implements zzeuy {
    private final zzgbl zza;
    private final zzfeq zzb;
    private final PackageInfo zzc;
    private final com.google.android.gms.ads.internal.util.zzg zzd;

    public zzesv(zzgbl zzgblVar, zzfeq zzfeqVar, PackageInfo packageInfo, com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zza = zzgblVar;
        this.zzb = zzfeqVar;
        this.zzc = packageInfo;
        this.zzd = zzgVar;
    }

    public static /* synthetic */ zzesw zzc(final zzesv zzesvVar) {
        final ArrayList arrayList = zzesvVar.zzb.zzg;
        return arrayList == null ? new zzesw() { // from class: com.google.android.gms.internal.ads.zzess
            @Override // com.google.android.gms.internal.ads.zzeux
            public final void zzj(Object obj) {
            }
        } : arrayList.isEmpty() ? new zzesw() { // from class: com.google.android.gms.internal.ads.zzest
            @Override // com.google.android.gms.internal.ads.zzeux
            public final void zzj(Object obj) {
                ((Bundle) obj).putInt("native_version", 0);
            }
        } : new zzesw() { // from class: com.google.android.gms.internal.ads.zzesu
            @Override // com.google.android.gms.internal.ads.zzeux
            public final void zzj(Object obj) {
                zzesv.this.zzd(arrayList, (Bundle) obj);
            }
        };
    }

    @Override // com.google.android.gms.internal.ads.zzeuy
    public final int zza() {
        return 26;
    }

    @Override // com.google.android.gms.internal.ads.zzeuy
    public final ListenableFuture zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzesr
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzesv.zzc(zzesv.this);
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00fc, code lost:
    
        if (r9 == 3) goto L64;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final /* synthetic */ void zzd(ArrayList arrayList, Bundle bundle) {
        JSONArray optJSONArray;
        bundle.putInt("native_version", 3);
        bundle.putStringArrayList("native_templates", arrayList);
        bundle.putStringArrayList("native_custom_templates", this.zzb.zzh);
        String str = "landscape";
        if (this.zzb.zzi.zza > 3) {
            bundle.putBoolean("enable_native_media_orientation", true);
            int i = this.zzb.zzi.zzh;
            String str2 = i != 1 ? i != 2 ? i != 3 ? i != 4 ? EnvironmentCompat.MEDIA_UNKNOWN : "square" : "portrait" : "landscape" : "any";
            if (!EnvironmentCompat.MEDIA_UNKNOWN.equals(str2)) {
                bundle.putString("native_media_orientation", str2);
            }
        }
        int i2 = this.zzb.zzi.zzc;
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
        bundle.putBoolean("native_multiple_images", this.zzb.zzi.zzd);
        bundle.putBoolean("use_custom_mute", this.zzb.zzi.zzg);
        zzbfw zzbfwVar = this.zzb.zzi;
        if (zzbfwVar.zzi != 0) {
            bundle.putBoolean("sccg_tap", zzbfwVar.zzj);
            bundle.putInt("sccg_dir", this.zzb.zzi.zzi);
        }
        PackageInfo packageInfo = this.zzc;
        int i3 = packageInfo == null ? 0 : packageInfo.versionCode;
        if (i3 > this.zzd.zza()) {
            this.zzd.zzs();
            this.zzd.zzv(i3);
        }
        JSONObject zzp = this.zzd.zzp();
        String str3 = null;
        if (zzp != null && (optJSONArray = zzp.optJSONArray(this.zzb.zzf)) != null) {
            str3 = optJSONArray.toString();
        }
        if (!TextUtils.isEmpty(str3)) {
            bundle.putString("native_advanced_settings", str3);
        }
        int i4 = this.zzb.zzk;
        if (i4 > 1) {
            bundle.putInt("max_num_ads", i4);
        }
        zzbmm zzbmmVar = this.zzb.zzb;
        if (zzbmmVar != null) {
            if (TextUtils.isEmpty(zzbmmVar.zzc)) {
                String str4 = "p";
                if (zzbmmVar.zza >= 2) {
                    int i5 = zzbmmVar.zzd;
                    if (i5 != 2) {
                    }
                    str4 = "l";
                    bundle.putString("ia_var", str4);
                } else {
                    int i6 = zzbmmVar.zzb;
                    if (i6 != 1) {
                        if (i6 != 2) {
                            zzcbn.zzg("Instream ad video aspect ratio " + i6 + " is wrong.");
                        }
                        bundle.putString("ia_var", str4);
                    }
                    str4 = "l";
                    bundle.putString("ia_var", str4);
                }
            } else {
                bundle.putString("ad_tag", zzbmmVar.zzc);
            }
            bundle.putBoolean("instr", true);
        }
        if (this.zzb.zza() != null) {
            bundle.putBoolean("has_delayed_banner_listener", true);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzkV)).booleanValue()) {
            if (this.zzb.zzi.zzf != null) {
                Bundle bundle2 = new Bundle();
                bundle2.putBoolean("startMuted", this.zzb.zzi.zzf.zza);
                bundle2.putBoolean("clickToExpandRequested", this.zzb.zzi.zzf.zzc);
                bundle2.putBoolean("customControlsRequested", this.zzb.zzi.zzf.zzb);
                bundle.putBundle("video", bundle2);
            }
            bundle.putBoolean("disable_image_loading", this.zzb.zzi.zzb);
            bundle.putInt("preferred_ad_choices_position", this.zzb.zzi.zze);
        }
    }
}
