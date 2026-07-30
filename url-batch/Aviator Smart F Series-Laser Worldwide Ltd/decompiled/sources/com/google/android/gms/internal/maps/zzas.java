package com.google.android.gms.internal.maps;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes3.dex */
public final class zzas extends zza implements zzau {
    zzas(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
    }

    @Override // com.google.android.gms.internal.maps.zzau
    public final float zzd() {
        Parcel zzJ = zzJ(13, zza());
        float readFloat = zzJ.readFloat();
        zzJ.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.maps.zzau
    public final float zze() {
        Parcel zzJ = zzJ(5, zza());
        float readFloat = zzJ.readFloat();
        zzJ.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.maps.zzau
    public final int zzf() {
        Parcel zzJ = zzJ(9, zza());
        int readInt = zzJ.readInt();
        zzJ.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.maps.zzau
    public final String zzg() {
        Parcel zzJ = zzJ(3, zza());
        String readString = zzJ.readString();
        zzJ.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.maps.zzau
    public final void zzh() {
        zzc(2, zza());
    }

    @Override // com.google.android.gms.internal.maps.zzau
    public final void zzi() {
        zzc(1, zza());
    }

    @Override // com.google.android.gms.internal.maps.zzau
    public final void zzj(boolean z7) {
        Parcel zza = zza();
        int i8 = zzc.zza;
        zza.writeInt(z7 ? 1 : 0);
        zzc(10, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzau
    public final void zzk(float f8) {
        Parcel zza = zza();
        zza.writeFloat(f8);
        zzc(12, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzau
    public final void zzl(boolean z7) {
        Parcel zza = zza();
        int i8 = zzc.zza;
        zza.writeInt(z7 ? 1 : 0);
        zzc(6, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzau
    public final void zzm(float f8) {
        Parcel zza = zza();
        zza.writeFloat(f8);
        zzc(4, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzau
    public final boolean zzn(zzau zzauVar) {
        Parcel zza = zza();
        zzc.zzg(zza, zzauVar);
        Parcel zzJ = zzJ(8, zza);
        boolean zzh = zzc.zzh(zzJ);
        zzJ.recycle();
        return zzh;
    }

    @Override // com.google.android.gms.internal.maps.zzau
    public final boolean zzo() {
        Parcel zzJ = zzJ(11, zza());
        boolean zzh = zzc.zzh(zzJ);
        zzJ.recycle();
        return zzh;
    }

    @Override // com.google.android.gms.internal.maps.zzau
    public final boolean zzp() {
        Parcel zzJ = zzJ(7, zza());
        boolean zzh = zzc.zzh(zzJ);
        zzJ.recycle();
        return zzh;
    }
}
