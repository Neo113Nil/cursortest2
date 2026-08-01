package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.6.0 */
/* loaded from: classes2.dex */
public abstract class zzbpt extends zzavh implements zzbpu {
    public zzbpt() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    @Override // com.google.android.gms.internal.ads.zzavh
    protected final boolean zzbK(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbpx zzbpxVar = null;
        switch (i) {
            case 1:
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzq zzqVar = (com.google.android.gms.ads.internal.client.zzq) zzavi.zza(parcel, com.google.android.gms.ads.internal.client.zzq.CREATOR);
                com.google.android.gms.ads.internal.client.zzl zzlVar = (com.google.android.gms.ads.internal.client.zzl) zzavi.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                String readString = parcel.readString();
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbpxVar = queryLocalInterface instanceof zzbpx ? (zzbpx) queryLocalInterface : new zzbpv(readStrongBinder);
                }
                zzbpx zzbpxVar2 = zzbpxVar;
                zzavi.zzc(parcel);
                zzu(asInterface, zzqVar, zzlVar, readString, zzbpxVar2);
                parcel2.writeNoException();
                return true;
            case 2:
                IObjectWrapper zzn = zzn();
                parcel2.writeNoException();
                zzavi.zzf(parcel2, zzn);
                return true;
            case 3:
                IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzl zzlVar2 = (com.google.android.gms.ads.internal.client.zzl) zzavi.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                String readString2 = parcel.readString();
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbpxVar = queryLocalInterface2 instanceof zzbpx ? (zzbpx) queryLocalInterface2 : new zzbpv(readStrongBinder2);
                }
                zzavi.zzc(parcel);
                zzx(asInterface2, zzlVar2, readString2, zzbpxVar);
                parcel2.writeNoException();
                return true;
            case 4:
                zzI();
                parcel2.writeNoException();
                return true;
            case 5:
                zzo();
                parcel2.writeNoException();
                return true;
            case 6:
                IObjectWrapper asInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzq zzqVar2 = (com.google.android.gms.ads.internal.client.zzq) zzavi.zza(parcel, com.google.android.gms.ads.internal.client.zzq.CREATOR);
                com.google.android.gms.ads.internal.client.zzl zzlVar3 = (com.google.android.gms.ads.internal.client.zzl) zzavi.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbpxVar = queryLocalInterface3 instanceof zzbpx ? (zzbpx) queryLocalInterface3 : new zzbpv(readStrongBinder3);
                }
                zzbpx zzbpxVar3 = zzbpxVar;
                zzavi.zzc(parcel);
                zzv(asInterface3, zzqVar2, zzlVar3, readString3, readString4, zzbpxVar3);
                parcel2.writeNoException();
                return true;
            case 7:
                IObjectWrapper asInterface4 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzl zzlVar4 = (com.google.android.gms.ads.internal.client.zzl) zzavi.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbpxVar = queryLocalInterface4 instanceof zzbpx ? (zzbpx) queryLocalInterface4 : new zzbpv(readStrongBinder4);
                }
                zzbpx zzbpxVar4 = zzbpxVar;
                zzavi.zzc(parcel);
                zzy(asInterface4, zzlVar4, readString5, readString6, zzbpxVar4);
                parcel2.writeNoException();
                return true;
            case 8:
                zzE();
                parcel2.writeNoException();
                return true;
            case 9:
                zzF();
                parcel2.writeNoException();
                return true;
            case 10:
                IObjectWrapper asInterface5 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzl zzlVar5 = (com.google.android.gms.ads.internal.client.zzl) zzavi.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                String readString7 = parcel.readString();
                zzbxb zzb = zzbxa.zzb(parcel.readStrongBinder());
                String readString8 = parcel.readString();
                zzavi.zzc(parcel);
                zzp(asInterface5, zzlVar5, readString7, zzb, readString8);
                parcel2.writeNoException();
                return true;
            case 11:
                com.google.android.gms.ads.internal.client.zzl zzlVar6 = (com.google.android.gms.ads.internal.client.zzl) zzavi.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                String readString9 = parcel.readString();
                zzavi.zzc(parcel);
                zzs(zzlVar6, readString9);
                parcel2.writeNoException();
                return true;
            case 12:
                zzL();
                parcel2.writeNoException();
                return true;
            case 13:
                boolean zzN = zzN();
                parcel2.writeNoException();
                int i3 = zzavi.zza;
                parcel2.writeInt(zzN ? 1 : 0);
                return true;
            case 14:
                IObjectWrapper asInterface6 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzl zzlVar7 = (com.google.android.gms.ads.internal.client.zzl) zzavi.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                String readString10 = parcel.readString();
                String readString11 = parcel.readString();
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbpxVar = queryLocalInterface5 instanceof zzbpx ? (zzbpx) queryLocalInterface5 : new zzbpv(readStrongBinder5);
                }
                zzbpx zzbpxVar5 = zzbpxVar;
                zzbfw zzbfwVar = (zzbfw) zzavi.zza(parcel, zzbfw.CREATOR);
                ArrayList<String> createStringArrayList = parcel.createStringArrayList();
                zzavi.zzc(parcel);
                zzz(asInterface6, zzlVar7, readString10, readString11, zzbpxVar5, zzbfwVar, createStringArrayList);
                parcel2.writeNoException();
                return true;
            case 15:
                parcel2.writeNoException();
                zzavi.zzf(parcel2, null);
                return true;
            case 16:
                parcel2.writeNoException();
                zzavi.zzf(parcel2, null);
                return true;
            case 17:
                Bundle zze = zze();
                parcel2.writeNoException();
                zzavi.zze(parcel2, zze);
                return true;
            case 18:
                Bundle zzf = zzf();
                parcel2.writeNoException();
                zzavi.zze(parcel2, zzf);
                return true;
            case 19:
                Bundle zzg = zzg();
                parcel2.writeNoException();
                zzavi.zze(parcel2, zzg);
                return true;
            case 20:
                com.google.android.gms.ads.internal.client.zzl zzlVar8 = (com.google.android.gms.ads.internal.client.zzl) zzavi.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                String readString12 = parcel.readString();
                String readString13 = parcel.readString();
                zzavi.zzc(parcel);
                zzB(zzlVar8, readString12, readString13);
                parcel2.writeNoException();
                return true;
            case 21:
                IObjectWrapper asInterface7 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzavi.zzc(parcel);
                zzD(asInterface7);
                parcel2.writeNoException();
                return true;
            case 22:
                parcel2.writeNoException();
                int i4 = zzavi.zza;
                parcel2.writeInt(0);
                return true;
            case 23:
                IObjectWrapper asInterface8 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbxb zzb2 = zzbxa.zzb(parcel.readStrongBinder());
                ArrayList<String> createStringArrayList2 = parcel.createStringArrayList();
                zzavi.zzc(parcel);
                zzr(asInterface8, zzb2, createStringArrayList2);
                parcel2.writeNoException();
                return true;
            case 24:
                zzbhc zzi = zzi();
                parcel2.writeNoException();
                zzavi.zzf(parcel2, zzi);
                return true;
            case 25:
                boolean zzg2 = zzavi.zzg(parcel);
                zzavi.zzc(parcel);
                zzG(zzg2);
                parcel2.writeNoException();
                return true;
            case 26:
                com.google.android.gms.ads.internal.client.zzdq zzh = zzh();
                parcel2.writeNoException();
                zzavi.zzf(parcel2, zzh);
                return true;
            case 27:
                zzbqg zzk = zzk();
                parcel2.writeNoException();
                zzavi.zzf(parcel2, zzk);
                return true;
            case 28:
                IObjectWrapper asInterface9 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzl zzlVar9 = (com.google.android.gms.ads.internal.client.zzl) zzavi.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                String readString14 = parcel.readString();
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbpxVar = queryLocalInterface6 instanceof zzbpx ? (zzbpx) queryLocalInterface6 : new zzbpv(readStrongBinder6);
                }
                zzavi.zzc(parcel);
                zzA(asInterface9, zzlVar9, readString14, zzbpxVar);
                parcel2.writeNoException();
                return true;
            case 29:
            default:
                return false;
            case 30:
                IObjectWrapper asInterface10 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzavi.zzc(parcel);
                zzK(asInterface10);
                parcel2.writeNoException();
                return true;
            case 31:
                IObjectWrapper asInterface11 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbme zzb3 = zzbmd.zzb(parcel.readStrongBinder());
                ArrayList createTypedArrayList = parcel.createTypedArrayList(zzbmk.CREATOR);
                zzavi.zzc(parcel);
                zzq(asInterface11, zzb3, createTypedArrayList);
                parcel2.writeNoException();
                return true;
            case 32:
                IObjectWrapper asInterface12 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzl zzlVar10 = (com.google.android.gms.ads.internal.client.zzl) zzavi.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                String readString15 = parcel.readString();
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbpxVar = queryLocalInterface7 instanceof zzbpx ? (zzbpx) queryLocalInterface7 : new zzbpv(readStrongBinder7);
                }
                zzavi.zzc(parcel);
                zzC(asInterface12, zzlVar10, readString15, zzbpxVar);
                parcel2.writeNoException();
                return true;
            case 33:
                zzbsd zzl = zzl();
                parcel2.writeNoException();
                zzavi.zze(parcel2, zzl);
                return true;
            case 34:
                zzbsd zzm = zzm();
                parcel2.writeNoException();
                zzavi.zze(parcel2, zzm);
                return true;
            case 35:
                IObjectWrapper asInterface13 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzq zzqVar3 = (com.google.android.gms.ads.internal.client.zzq) zzavi.zza(parcel, com.google.android.gms.ads.internal.client.zzq.CREATOR);
                com.google.android.gms.ads.internal.client.zzl zzlVar11 = (com.google.android.gms.ads.internal.client.zzl) zzavi.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                String readString16 = parcel.readString();
                String readString17 = parcel.readString();
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbpxVar = queryLocalInterface8 instanceof zzbpx ? (zzbpx) queryLocalInterface8 : new zzbpv(readStrongBinder8);
                }
                zzbpx zzbpxVar6 = zzbpxVar;
                zzavi.zzc(parcel);
                zzw(asInterface13, zzqVar3, zzlVar11, readString16, readString17, zzbpxVar6);
                parcel2.writeNoException();
                return true;
            case 36:
                zzbqa zzj = zzj();
                parcel2.writeNoException();
                zzavi.zzf(parcel2, zzj);
                return true;
            case 37:
                IObjectWrapper asInterface14 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzavi.zzc(parcel);
                zzJ(asInterface14);
                parcel2.writeNoException();
                return true;
            case 38:
                IObjectWrapper asInterface15 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzl zzlVar12 = (com.google.android.gms.ads.internal.client.zzl) zzavi.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                String readString18 = parcel.readString();
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbpxVar = queryLocalInterface9 instanceof zzbpx ? (zzbpx) queryLocalInterface9 : new zzbpv(readStrongBinder9);
                }
                zzavi.zzc(parcel);
                zzt(asInterface15, zzlVar12, readString18, zzbpxVar);
                parcel2.writeNoException();
                return true;
            case 39:
                IObjectWrapper asInterface16 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzavi.zzc(parcel);
                zzH(asInterface16);
                parcel2.writeNoException();
                return true;
        }
    }
}
