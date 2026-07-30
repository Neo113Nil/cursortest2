package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "LocationReceiverCreator")
@SafeParcelable.Reserved({5})
/* loaded from: classes3.dex */
public final class zzdz extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzdz> CREATOR = new zzea();

    @SafeParcelable.Field(getter = "getType", id = 1)
    private final int zza;

    @Nullable
    @SafeParcelable.Field(getter = "getOldBinderReceiver", id = 2)
    private final IBinder zzb;

    @Nullable
    @SafeParcelable.Field(getter = "getBinderReceiver", id = 3)
    private final IBinder zzc;

    @Nullable
    @SafeParcelable.Field(getter = "getPendingIntentReceiver", id = 4)
    private final PendingIntent zzd;

    @Nullable
    @SafeParcelable.Field(getter = "getListenerId", id = 6)
    private final String zze;

    @SafeParcelable.Constructor
    zzdz(@SafeParcelable.Param(id = 1) int i8, @Nullable @SafeParcelable.Param(id = 2) IBinder iBinder, @Nullable @SafeParcelable.Param(id = 3) IBinder iBinder2, @Nullable @SafeParcelable.Param(id = 4) PendingIntent pendingIntent, @Nullable @SafeParcelable.Param(id = 6) String str) {
        this.zza = i8;
        this.zzb = iBinder;
        this.zzc = iBinder2;
        this.zzd = pendingIntent;
        this.zze = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.os.IBinder] */
    /* JADX WARN: Type inference failed for: r8v0, types: [android.os.IBinder, com.google.android.gms.location.zzz] */
    public static zzdz zza(@Nullable IInterface iInterface, com.google.android.gms.location.zzz zzzVar, String str) {
        if (iInterface == null) {
            iInterface = null;
        }
        return new zzdz(1, iInterface, zzzVar, null, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.os.IBinder] */
    /* JADX WARN: Type inference failed for: r8v0, types: [android.os.IBinder, com.google.android.gms.location.zzw] */
    public static zzdz zzb(@Nullable IInterface iInterface, com.google.android.gms.location.zzw zzwVar, String str) {
        if (iInterface == null) {
            iInterface = null;
        }
        return new zzdz(2, iInterface, zzwVar, null, str);
    }

    public static zzdz zzc(PendingIntent pendingIntent) {
        return new zzdz(3, null, null, pendingIntent, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static zzdz zzd(zzz zzzVar) {
        return new zzdz(4, null, zzzVar, null, null);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int i9 = this.zza;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i9);
        SafeParcelWriter.writeIBinder(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeIBinder(parcel, 3, this.zzc, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.zzd, i8, false);
        SafeParcelWriter.writeString(parcel, 6, this.zze, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
