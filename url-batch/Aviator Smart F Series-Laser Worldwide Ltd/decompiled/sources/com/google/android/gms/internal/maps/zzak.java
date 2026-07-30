package com.google.android.gms.internal.maps;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.PatternItem;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzak extends zza implements zzam {
    zzak(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IPolygonDelegate");
    }

    @Override // com.google.android.gms.internal.maps.zzam
    public final void zzA(float f8) {
        Parcel zza = zza();
        zza.writeFloat(f8);
        zzc(13, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzam
    public final boolean zzB(zzam zzamVar) {
        Parcel zza = zza();
        zzc.zzg(zza, zzamVar);
        Parcel zzJ = zzJ(19, zza);
        boolean zzh = zzc.zzh(zzJ);
        zzJ.recycle();
        return zzh;
    }

    @Override // com.google.android.gms.internal.maps.zzam
    public final boolean zzC() {
        Parcel zzJ = zzJ(22, zza());
        boolean zzh = zzc.zzh(zzJ);
        zzJ.recycle();
        return zzh;
    }

    @Override // com.google.android.gms.internal.maps.zzam
    public final boolean zzD() {
        Parcel zzJ = zzJ(18, zza());
        boolean zzh = zzc.zzh(zzJ);
        zzJ.recycle();
        return zzh;
    }

    @Override // com.google.android.gms.internal.maps.zzam
    public final boolean zzE() {
        Parcel zzJ = zzJ(16, zza());
        boolean zzh = zzc.zzh(zzJ);
        zzJ.recycle();
        return zzh;
    }

    @Override // com.google.android.gms.internal.maps.zzam
    public final float zzd() {
        Parcel zzJ = zzJ(8, zza());
        float readFloat = zzJ.readFloat();
        zzJ.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.maps.zzam
    public final float zze() {
        Parcel zzJ = zzJ(14, zza());
        float readFloat = zzJ.readFloat();
        zzJ.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.maps.zzam
    public final int zzf() {
        Parcel zzJ = zzJ(12, zza());
        int readInt = zzJ.readInt();
        zzJ.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.maps.zzam
    public final int zzg() {
        Parcel zzJ = zzJ(10, zza());
        int readInt = zzJ.readInt();
        zzJ.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.maps.zzam
    public final int zzh() {
        Parcel zzJ = zzJ(24, zza());
        int readInt = zzJ.readInt();
        zzJ.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.maps.zzam
    public final int zzi() {
        Parcel zzJ = zzJ(20, zza());
        int readInt = zzJ.readInt();
        zzJ.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.maps.zzam
    public final IObjectWrapper zzj() {
        Parcel zzJ = zzJ(28, zza());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzJ.readStrongBinder());
        zzJ.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.internal.maps.zzam
    public final String zzk() {
        Parcel zzJ = zzJ(2, zza());
        String readString = zzJ.readString();
        zzJ.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.maps.zzam
    public final List zzl() {
        Parcel zzJ = zzJ(6, zza());
        ArrayList zzb = zzc.zzb(zzJ);
        zzJ.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.maps.zzam
    public final List zzm() {
        Parcel zzJ = zzJ(4, zza());
        ArrayList createTypedArrayList = zzJ.createTypedArrayList(LatLng.CREATOR);
        zzJ.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.internal.maps.zzam
    public final List zzn() {
        Parcel zzJ = zzJ(26, zza());
        ArrayList createTypedArrayList = zzJ.createTypedArrayList(PatternItem.CREATOR);
        zzJ.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.internal.maps.zzam
    public final void zzo() {
        zzc(1, zza());
    }

    @Override // com.google.android.gms.internal.maps.zzam
    public final void zzp(boolean z7) {
        Parcel zza = zza();
        int i8 = zzc.zza;
        zza.writeInt(z7 ? 1 : 0);
        zzc(21, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzam
    public final void zzq(int i8) {
        Parcel zza = zza();
        zza.writeInt(i8);
        zzc(11, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzam
    public final void zzr(boolean z7) {
        Parcel zza = zza();
        int i8 = zzc.zza;
        zza.writeInt(z7 ? 1 : 0);
        zzc(17, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzam
    public final void zzs(List list) {
        Parcel zza = zza();
        zza.writeList(list);
        zzc(5, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzam
    public final void zzt(List list) {
        Parcel zza = zza();
        zza.writeTypedList(list);
        zzc(3, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzam
    public final void zzu(int i8) {
        Parcel zza = zza();
        zza.writeInt(i8);
        zzc(9, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzam
    public final void zzv(int i8) {
        Parcel zza = zza();
        zza.writeInt(i8);
        zzc(23, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzam
    public final void zzw(List list) {
        Parcel zza = zza();
        zza.writeTypedList(list);
        zzc(25, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzam
    public final void zzx(float f8) {
        Parcel zza = zza();
        zza.writeFloat(f8);
        zzc(7, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzam
    public final void zzy(IObjectWrapper iObjectWrapper) {
        Parcel zza = zza();
        zzc.zzg(zza, iObjectWrapper);
        zzc(27, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzam
    public final void zzz(boolean z7) {
        Parcel zza = zza();
        int i8 = zzc.zza;
        zza.writeInt(z7 ? 1 : 0);
        zzc(15, zza);
    }
}
