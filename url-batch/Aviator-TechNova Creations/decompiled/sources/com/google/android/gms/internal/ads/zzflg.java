package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzflg extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzflg> CREATOR = new zzflh();

    @Nullable
    public final Context zza;
    public final zzfld zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final String zzf;
    public final int zzg;
    private final zzfld[] zzh;
    private final int zzi;
    private final int zzj;
    private final int zzk;
    private final int[] zzl;
    private final int[] zzm;

    public zzflg(int i, int i2, int i3, int i4, String str, int i5, int i6) {
        zzfld[] values = zzfld.values();
        this.zzh = values;
        int[] zza = zzfle.zza();
        this.zzl = zza;
        int[] zza2 = zzflf.zza();
        this.zzm = zza2;
        this.zza = null;
        this.zzi = i;
        this.zzb = values[i];
        this.zzc = i2;
        this.zzd = i3;
        this.zze = i4;
        this.zzf = str;
        this.zzj = i5;
        this.zzg = zza[i5];
        this.zzk = i6;
        int i7 = zza2[i6];
    }

    @Nullable
    public static zzflg zza(zzfld zzfldVar, Context context) {
        if (zzfldVar == zzfld.Rewarded) {
            return new zzflg(context, zzfldVar, ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzhm)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzhs)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzhu)).intValue(), (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzhw), (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzho), (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzhq));
        }
        if (zzfldVar == zzfld.Interstitial) {
            return new zzflg(context, zzfldVar, ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzhn)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzht)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzhv)).intValue(), (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzhx), (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzhp), (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzhr));
        }
        if (zzfldVar != zzfld.AppOpen) {
            return null;
        }
        return new zzflg(context, zzfldVar, ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzhA)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzhC)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzhD)).intValue(), (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzhy), (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzhz), (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzhB));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.zzi;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i2);
        SafeParcelWriter.writeInt(parcel, 2, this.zzc);
        SafeParcelWriter.writeInt(parcel, 3, this.zzd);
        SafeParcelWriter.writeInt(parcel, 4, this.zze);
        SafeParcelWriter.writeString(parcel, 5, this.zzf, false);
        SafeParcelWriter.writeInt(parcel, 6, this.zzj);
        SafeParcelWriter.writeInt(parcel, 7, this.zzk);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    private zzflg(@Nullable Context context, zzfld zzfldVar, int i, int i2, int i3, String str, String str2, String str3) {
        this.zzh = zzfld.values();
        this.zzl = zzfle.zza();
        this.zzm = zzflf.zza();
        this.zza = context;
        this.zzi = zzfldVar.ordinal();
        this.zzb = zzfldVar;
        this.zzc = i;
        this.zzd = i2;
        this.zze = i3;
        this.zzf = str;
        int i4 = "oldest".equals(str2) ? 1 : (!"lru".equals(str2) && "lfu".equals(str2)) ? 3 : 2;
        this.zzg = i4;
        this.zzj = i4 - 1;
        this.zzk = 0;
    }
}
