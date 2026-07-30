package com.google.android.gms.internal.maps;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.maps.model.LatLng;

/* loaded from: classes3.dex */
public final class zzaf extends zza implements zzah {
    zzaf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IMarkerDelegate");
    }

    @Override // com.google.android.gms.internal.maps.zzah
    public final void zzA(String str) {
        Parcel zza = zza();
        zza.writeString(str);
        zzc(5, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzah
    public final void zzB(boolean z7) {
        Parcel zza = zza();
        int i8 = zzc.zza;
        zza.writeInt(z7 ? 1 : 0);
        zzc(14, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzah
    public final void zzC(float f8) {
        Parcel zza = zza();
        zza.writeFloat(f8);
        zzc(27, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzah
    public final void zzD() {
        zzc(11, zza());
    }

    @Override // com.google.android.gms.internal.maps.zzah
    public final boolean zzE(zzah zzahVar) {
        Parcel zza = zza();
        zzc.zzg(zza, zzahVar);
        Parcel zzJ = zzJ(16, zza);
        boolean zzh = zzc.zzh(zzJ);
        zzJ.recycle();
        return zzh;
    }

    @Override // com.google.android.gms.internal.maps.zzah
    public final boolean zzF() {
        Parcel zzJ = zzJ(10, zza());
        boolean zzh = zzc.zzh(zzJ);
        zzJ.recycle();
        return zzh;
    }

    @Override // com.google.android.gms.internal.maps.zzah
    public final boolean zzG() {
        Parcel zzJ = zzJ(21, zza());
        boolean zzh = zzc.zzh(zzJ);
        zzJ.recycle();
        return zzh;
    }

    @Override // com.google.android.gms.internal.maps.zzah
    public final boolean zzH() {
        Parcel zzJ = zzJ(13, zza());
        boolean zzh = zzc.zzh(zzJ);
        zzJ.recycle();
        return zzh;
    }

    @Override // com.google.android.gms.internal.maps.zzah
    public final boolean zzI() {
        Parcel zzJ = zzJ(15, zza());
        boolean zzh = zzc.zzh(zzJ);
        zzJ.recycle();
        return zzh;
    }

    @Override // com.google.android.gms.internal.maps.zzah
    public final float zzd() {
        Parcel zzJ = zzJ(26, zza());
        float readFloat = zzJ.readFloat();
        zzJ.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.maps.zzah
    public final float zze() {
        Parcel zzJ = zzJ(23, zza());
        float readFloat = zzJ.readFloat();
        zzJ.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.maps.zzah
    public final float zzf() {
        Parcel zzJ = zzJ(28, zza());
        float readFloat = zzJ.readFloat();
        zzJ.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.maps.zzah
    public final int zzg() {
        Parcel zzJ = zzJ(17, zza());
        int readInt = zzJ.readInt();
        zzJ.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.maps.zzah
    public final IObjectWrapper zzh() {
        Parcel zzJ = zzJ(34, zza());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzJ.readStrongBinder());
        zzJ.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.internal.maps.zzah
    public final IObjectWrapper zzi() {
        Parcel zzJ = zzJ(30, zza());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzJ.readStrongBinder());
        zzJ.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.internal.maps.zzah
    public final LatLng zzj() {
        Parcel zzJ = zzJ(4, zza());
        LatLng latLng = (LatLng) zzc.zza(zzJ, LatLng.CREATOR);
        zzJ.recycle();
        return latLng;
    }

    @Override // com.google.android.gms.internal.maps.zzah
    public final String zzk() {
        Parcel zzJ = zzJ(2, zza());
        String readString = zzJ.readString();
        zzJ.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.maps.zzah
    public final String zzl() {
        Parcel zzJ = zzJ(8, zza());
        String readString = zzJ.readString();
        zzJ.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.maps.zzah
    public final String zzm() {
        Parcel zzJ = zzJ(6, zza());
        String readString = zzJ.readString();
        zzJ.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.maps.zzah
    public final void zzn() {
        zzc(12, zza());
    }

    @Override // com.google.android.gms.internal.maps.zzah
    public final void zzo() {
        zzc(1, zza());
    }

    @Override // com.google.android.gms.internal.maps.zzah
    public final void zzp(float f8) {
        Parcel zza = zza();
        zza.writeFloat(f8);
        zzc(25, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzah
    public final void zzq(float f8, float f9) {
        Parcel zza = zza();
        zza.writeFloat(f8);
        zza.writeFloat(f9);
        zzc(19, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzah
    public final void zzr(boolean z7) {
        Parcel zza = zza();
        int i8 = zzc.zza;
        zza.writeInt(z7 ? 1 : 0);
        zzc(9, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzah
    public final void zzs(boolean z7) {
        Parcel zza = zza();
        int i8 = zzc.zza;
        zza.writeInt(z7 ? 1 : 0);
        zzc(20, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzah
    public final void zzt(IObjectWrapper iObjectWrapper) {
        Parcel zza = zza();
        zzc.zzg(zza, iObjectWrapper);
        zzc(18, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzah
    public final void zzu(IObjectWrapper iObjectWrapper) {
        Parcel zza = zza();
        zzc.zzg(zza, iObjectWrapper);
        zzc(33, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzah
    public final void zzv(float f8, float f9) {
        Parcel zza = zza();
        zza.writeFloat(f8);
        zza.writeFloat(f9);
        zzc(24, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzah
    public final void zzw(LatLng latLng) {
        Parcel zza = zza();
        zzc.zze(zza, latLng);
        zzc(3, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzah
    public final void zzx(float f8) {
        Parcel zza = zza();
        zza.writeFloat(f8);
        zzc(22, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzah
    public final void zzy(String str) {
        Parcel zza = zza();
        zza.writeString(str);
        zzc(7, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzah
    public final void zzz(IObjectWrapper iObjectWrapper) {
        Parcel zza = zza();
        zzc.zzg(zza, iObjectWrapper);
        zzc(29, zza);
    }
}
