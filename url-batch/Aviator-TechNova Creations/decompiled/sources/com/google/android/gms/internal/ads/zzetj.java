package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.core.graphics.Insets;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import kotlinx.coroutines.DebugKt;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzetj implements zzfav {
    public final com.google.android.gms.ads.internal.client.zzr zza;
    public final String zzb;
    public final boolean zzc;
    public final String zzd;
    public final float zze;
    public final int zzf;
    public final int zzg;
    public final String zzh;
    public final int zzi;
    public final boolean zzj;
    public final Insets zzk;
    public final zzetg zzl;

    public zzetj(com.google.android.gms.ads.internal.client.zzr zzrVar, String str, boolean z, String str2, float f, int i, int i2, String str3, int i3, boolean z2, Insets insets, zzetg zzetgVar) {
        Preconditions.checkNotNull(zzrVar, "the adSize must not be null");
        this.zza = zzrVar;
        this.zzb = str;
        this.zzc = z;
        this.zzd = str2;
        this.zze = f;
        this.zzf = i;
        this.zzg = i2;
        this.zzh = str3;
        this.zzi = i3;
        this.zzj = z2;
        this.zzk = insets;
        this.zzl = zzetgVar;
    }

    private final void zzc(Bundle bundle) {
        com.google.android.gms.ads.internal.client.zzr zzrVar = this.zza;
        int i = zzrVar.zze;
        zzfjz.zzb(bundle, "smart_w", "full", i == -1);
        int i2 = zzrVar.zzb;
        zzfjz.zzb(bundle, "smart_h", DebugKt.DEBUG_PROPERTY_VALUE_AUTO, i2 == -2);
        zzfjz.zzd(bundle, "ene", true, zzrVar.zzj);
        zzfjz.zzb(bundle, "rafmt", "102", zzrVar.zzm);
        zzfjz.zzb(bundle, "rafmt", "103", zzrVar.zzn);
        zzfjz.zzb(bundle, "rafmt", "105", zzrVar.zzo);
        zzfjz.zzd(bundle, "inline_adaptive_slot", true, this.zzj);
        zzfjz.zzd(bundle, "interscroller_slot", true, zzrVar.zzo);
        zzfjz.zze(bundle, "format", this.zzb);
        zzfjz.zzb(bundle, "fluid", ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, this.zzc);
        zzfjz.zzb(bundle, "sz", this.zzd, !TextUtils.isEmpty(r6));
        bundle.putFloat("u_sd", this.zze);
        bundle.putInt("sw", this.zzf);
        bundle.putInt("sh", this.zzg);
        String str = this.zzh;
        zzfjz.zzb(bundle, "sc", str, true ^ TextUtils.isEmpty(str));
        int i3 = this.zzi;
        if (i3 != -1) {
            bundle.putInt("u_mso", i3);
        }
        Insets insets = this.zzk;
        if (insets != null) {
            bundle.putInt("sam_t", insets.top);
            bundle.putInt("sam_b", insets.bottom);
            bundle.putInt("sam_l", insets.left);
            bundle.putInt("sam_r", insets.right);
        }
        zzetg zzetgVar = this.zzl;
        if (zzetgVar != null) {
            bundle.putInt("rc_tl", zzetgVar.zza);
            bundle.putInt("rc_tr", zzetgVar.zzb);
            bundle.putInt("rc_bl", zzetgVar.zzc);
            bundle.putInt("rc_br", zzetgVar.zzd);
        }
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        com.google.android.gms.ads.internal.client.zzr[] zzrVarArr = zzrVar.zzg;
        if (zzrVarArr == null) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt(ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, i2);
            bundle2.putInt(ViewHierarchyConstants.DIMENSION_WIDTH_KEY, i);
            bundle2.putBoolean("is_fluid_height", zzrVar.zzi);
            arrayList.add(bundle2);
        } else {
            for (com.google.android.gms.ads.internal.client.zzr zzrVar2 : zzrVarArr) {
                Bundle bundle3 = new Bundle();
                bundle3.putBoolean("is_fluid_height", zzrVar2.zzi);
                bundle3.putInt(ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, zzrVar2.zzb);
                bundle3.putInt(ViewHierarchyConstants.DIMENSION_WIDTH_KEY, zzrVar2.zze);
                arrayList.add(bundle3);
            }
        }
        bundle.putParcelableArrayList("valid_ad_sizes", arrayList);
    }

    @Override // com.google.android.gms.internal.ads.zzfav
    public final /* synthetic */ void zza(Object obj) {
        zzc(((zzdah) obj).zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfav
    public final /* synthetic */ void zzb(Object obj) {
        zzc(((zzdah) obj).zzb);
    }
}
