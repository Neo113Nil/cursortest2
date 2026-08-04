package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.6.0 */
/* loaded from: classes2.dex */
public abstract class zzbyd extends zzaya implements zzbye {
    public zzbyd() {
        super("com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    public static zzbye zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
        return queryLocalInterface instanceof zzbye ? (zzbye) queryLocalInterface : new zzbyc(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzaya
    protected final boolean zzdi(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbyb zzbybVar = null;
        switch (i) {
            case 1:
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbyi zzbyiVar = (zzbyi) zzayb.zzb(parcel, zzbyi.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalCallback");
                    zzbybVar = queryLocalInterface instanceof zzbyb ? (zzbyb) queryLocalInterface : new zzbxz(readStrongBinder);
                }
                zzayb.zzh(parcel);
                zze(asInterface, zzbyiVar, zzbybVar);
                parcel2.writeNoException();
                return true;
            case 2:
                IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzayb.zzh(parcel);
                zzf(asInterface2);
                parcel2.writeNoException();
                return true;
            case 3:
                IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzayb.zzh(parcel);
                parcel2.writeNoException();
                zzayb.zze(parcel2, null);
                return true;
            case 4:
                IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzayb.zzh(parcel);
                parcel2.writeNoException();
                zzayb.zze(parcel2, null);
                return true;
            case 5:
                ArrayList createTypedArrayList = parcel.createTypedArrayList(Uri.CREATOR);
                IObjectWrapper asInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbtl zzb = zzbtk.zzb(parcel.readStrongBinder());
                zzayb.zzh(parcel);
                zzg(createTypedArrayList, asInterface3, zzb);
                parcel2.writeNoException();
                return true;
            case 6:
                ArrayList createTypedArrayList2 = parcel.createTypedArrayList(Uri.CREATOR);
                IObjectWrapper asInterface4 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbtl zzb2 = zzbtk.zzb(parcel.readStrongBinder());
                zzayb.zzh(parcel);
                zzh(createTypedArrayList2, asInterface4, zzb2);
                parcel2.writeNoException();
                return true;
            case 7:
                zzbto zzbtoVar = (zzbto) zzayb.zzb(parcel, zzbto.CREATOR);
                zzayb.zzh(parcel);
                zzi(zzbtoVar);
                parcel2.writeNoException();
                return true;
            case 8:
                IObjectWrapper asInterface5 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzayb.zzh(parcel);
                zzj(asInterface5);
                parcel2.writeNoException();
                return true;
            case 9:
                ArrayList createTypedArrayList3 = parcel.createTypedArrayList(Uri.CREATOR);
                IObjectWrapper asInterface6 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbtl zzb3 = zzbtk.zzb(parcel.readStrongBinder());
                zzayb.zzh(parcel);
                zzk(createTypedArrayList3, asInterface6, zzb3);
                parcel2.writeNoException();
                return true;
            case 10:
                ArrayList createTypedArrayList4 = parcel.createTypedArrayList(Uri.CREATOR);
                IObjectWrapper asInterface7 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbtl zzb4 = zzbtk.zzb(parcel.readStrongBinder());
                zzayb.zzh(parcel);
                zzl(createTypedArrayList4, asInterface7, zzb4);
                parcel2.writeNoException();
                return true;
            case 11:
                IObjectWrapper asInterface8 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IObjectWrapper asInterface9 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                String readString = parcel.readString();
                IObjectWrapper asInterface10 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzayb.zzh(parcel);
                IObjectWrapper zzm = zzm(asInterface8, asInterface9, readString, asInterface10);
                parcel2.writeNoException();
                zzayb.zze(parcel2, zzm);
                return true;
            default:
                return false;
        }
    }
}
