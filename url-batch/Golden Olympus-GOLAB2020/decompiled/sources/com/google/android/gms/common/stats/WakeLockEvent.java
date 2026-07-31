package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;

@Deprecated
/* loaded from: classes.dex */
public final class WakeLockEvent extends StatsEvent {
    public static final Parcelable.Creator<WakeLockEvent> CREATOR = new zza();
    final int zza;
    private final long zzb;
    private final int zzc;
    private final String zzd;
    private final String zze;
    private final String zzf;
    private final int zzg;
    private final List zzh;
    private final String zzi;
    private final long zzj;
    private final int zzk;
    private final String zzl;
    private final float zzm;
    private final long zzn;
    private final boolean zzo;

    WakeLockEvent(int i4, long j4, int i5, String str, int i6, List list, String str2, long j5, int i7, String str3, String str4, float f4, long j6, String str5, boolean z4) {
        this.zza = i4;
        this.zzb = j4;
        this.zzc = i5;
        this.zzd = str;
        this.zze = str3;
        this.zzf = str5;
        this.zzg = i6;
        this.zzh = list;
        this.zzi = str2;
        this.zzj = j5;
        this.zzk = i7;
        this.zzl = str4;
        this.zzm = f4;
        this.zzn = j6;
        this.zzo = z4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeLong(parcel, 2, this.zzb);
        SafeParcelWriter.writeString(parcel, 4, this.zzd, false);
        SafeParcelWriter.writeInt(parcel, 5, this.zzg);
        SafeParcelWriter.writeStringList(parcel, 6, this.zzh, false);
        SafeParcelWriter.writeLong(parcel, 8, this.zzj);
        SafeParcelWriter.writeString(parcel, 10, this.zze, false);
        SafeParcelWriter.writeInt(parcel, 11, this.zzc);
        SafeParcelWriter.writeString(parcel, 12, this.zzi, false);
        SafeParcelWriter.writeString(parcel, 13, this.zzl, false);
        SafeParcelWriter.writeInt(parcel, 14, this.zzk);
        SafeParcelWriter.writeFloat(parcel, 15, this.zzm);
        SafeParcelWriter.writeLong(parcel, 16, this.zzn);
        SafeParcelWriter.writeString(parcel, 17, this.zzf, false);
        SafeParcelWriter.writeBoolean(parcel, 18, this.zzo);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final long zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final int zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final String zzc() {
        List list = this.zzh;
        String join = list == null ? "" : TextUtils.join(StringUtils.COMMA, list);
        int i4 = this.zzk;
        String str = this.zze;
        String str2 = this.zzl;
        float f4 = this.zzm;
        String str3 = this.zzf;
        int i5 = this.zzg;
        String str4 = this.zzd;
        boolean z4 = this.zzo;
        int length = String.valueOf(str4).length() + 2 + String.valueOf(i5).length() + 1 + String.valueOf(join).length() + 1 + String.valueOf(i4).length();
        if (str == null) {
            str = "";
        }
        int length2 = length + 1 + str.length() + 1;
        if (str2 == null) {
            str2 = "";
        }
        int length3 = length2 + str2.length() + 1 + String.valueOf(f4).length() + 1;
        String str5 = str3 != null ? str3 : "";
        StringBuilder sb = new StringBuilder(length3 + str5.length() + 1 + String.valueOf(z4).length());
        sb.append("\t");
        sb.append(str4);
        sb.append("\t");
        sb.append(i5);
        sb.append("\t");
        sb.append(join);
        sb.append("\t");
        sb.append(i4);
        sb.append("\t");
        sb.append(str);
        sb.append("\t");
        sb.append(str2);
        sb.append("\t");
        sb.append(f4);
        sb.append("\t");
        sb.append(str5);
        sb.append("\t");
        sb.append(z4);
        return sb.toString();
    }
}
