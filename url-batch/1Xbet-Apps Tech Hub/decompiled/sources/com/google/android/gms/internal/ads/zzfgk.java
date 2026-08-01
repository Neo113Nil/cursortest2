package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes2.dex */
public final class zzfgk extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfgk> CREATOR = new zzfgl();

    @Nullable
    public final Context zza;
    public final zzfgh zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final String zzf;
    public final int zzg;
    private final zzfgh[] zzh;
    private final int zzi;
    private final int zzj;
    private final int zzk;
    private final int[] zzl;
    private final int[] zzm;

    public zzfgk(int i, int i2, int i3, int i4, String str, int i5, int i6) {
        zzfgh[] values = zzfgh.values();
        this.zzh = values;
        int[] zza = zzfgi.zza();
        this.zzl = zza;
        int[] zza2 = zzfgj.zza();
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
    public static zzfgk zza(zzfgh zzfghVar, Context context) {
        if (zzfghVar == zzfgh.Rewarded) {
            return new zzfgk(context, zzfghVar, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzgs)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzgy)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzgA)).intValue(), (String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzgC), (String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzgu), (String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzgw));
        }
        if (zzfghVar == zzfgh.Interstitial) {
            return new zzfgk(context, zzfghVar, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzgt)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzgz)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzgB)).intValue(), (String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzgD), (String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzgv), (String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzgx));
        }
        if (zzfghVar != zzfgh.AppOpen) {
            return null;
        }
        return new zzfgk(context, zzfghVar, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzgG)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzgI)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzgJ)).intValue(), (String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzgE), (String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzgF), (String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzgH));
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

    private zzfgk(@Nullable Context context, zzfgh zzfghVar, int i, int i2, int i3, String str, String str2, String str3) {
        int i4;
        this.zzh = zzfgh.values();
        this.zzl = zzfgi.zza();
        this.zzm = zzfgj.zza();
        this.zza = context;
        this.zzi = zzfghVar.ordinal();
        this.zzb = zzfghVar;
        this.zzc = i;
        this.zzd = i2;
        this.zze = i3;
        this.zzf = str;
        if ("oldest".equals(str2)) {
            i4 = 1;
        } else {
            i4 = (!"lru".equals(str2) && "lfu".equals(str2)) ? 3 : 2;
        }
        this.zzg = i4;
        this.zzj = i4 - 1;
        "onAdClosed".equals(str3);
        this.zzk = 0;
    }
}
