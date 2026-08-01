package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.6.0 */
/* loaded from: classes2.dex */
public abstract class zzbro extends zzavh implements zzbrp {
    public zzbro() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    public static zzbrp zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
        return queryLocalInterface instanceof zzbrp ? (zzbrp) queryLocalInterface : new zzbrn(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzavh
    protected final boolean zzbK(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbrs zzbrsVar = null;
        zzbra zzbqyVar = null;
        zzbrj zzbrhVar = null;
        zzbrd zzbrbVar = null;
        zzbrm zzbrkVar = null;
        zzbrj zzbrhVar2 = null;
        zzbrm zzbrkVar2 = null;
        zzbrg zzbreVar = null;
        zzbrd zzbrbVar2 = null;
        if (i == 1) {
            IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            String readString = parcel.readString();
            Bundle bundle = (Bundle) zzavi.zza(parcel, Bundle.CREATOR);
            Bundle bundle2 = (Bundle) zzavi.zza(parcel, Bundle.CREATOR);
            com.google.android.gms.ads.internal.client.zzq zzqVar = (com.google.android.gms.ads.internal.client.zzq) zzavi.zza(parcel, com.google.android.gms.ads.internal.client.zzq.CREATOR);
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
                zzbrsVar = queryLocalInterface instanceof zzbrs ? (zzbrs) queryLocalInterface : new zzbrq(readStrongBinder);
            }
            zzbrs zzbrsVar2 = zzbrsVar;
            zzavi.zzc(parcel);
            zzh(asInterface, readString, bundle, bundle2, zzqVar, zzbrsVar2);
            parcel2.writeNoException();
        } else if (i == 2) {
            zzbsd zzf = zzf();
            parcel2.writeNoException();
            zzavi.zze(parcel2, zzf);
        } else if (i == 3) {
            zzbsd zzg = zzg();
            parcel2.writeNoException();
            zzavi.zze(parcel2, zzg);
        } else if (i == 5) {
            com.google.android.gms.ads.internal.client.zzdq zze = zze();
            parcel2.writeNoException();
            zzavi.zzf(parcel2, zze);
        } else if (i == 10) {
            IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            zzavi.zzc(parcel);
            parcel2.writeNoException();
        } else if (i != 11) {
            switch (i) {
                case 13:
                    String readString2 = parcel.readString();
                    String readString3 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzl zzlVar = (com.google.android.gms.ads.internal.client.zzl) zzavi.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                    IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder readStrongBinder2 = parcel.readStrongBinder();
                    if (readStrongBinder2 != null) {
                        IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                        zzbrbVar2 = queryLocalInterface2 instanceof zzbrd ? (zzbrd) queryLocalInterface2 : new zzbrb(readStrongBinder2);
                    }
                    zzbrd zzbrdVar = zzbrbVar2;
                    zzbpx zzb = zzbpw.zzb(parcel.readStrongBinder());
                    com.google.android.gms.ads.internal.client.zzq zzqVar2 = (com.google.android.gms.ads.internal.client.zzq) zzavi.zza(parcel, com.google.android.gms.ads.internal.client.zzq.CREATOR);
                    zzavi.zzc(parcel);
                    zzj(readString2, readString3, zzlVar, asInterface2, zzbrdVar, zzb, zzqVar2);
                    parcel2.writeNoException();
                    break;
                case 14:
                    String readString4 = parcel.readString();
                    String readString5 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzl zzlVar2 = (com.google.android.gms.ads.internal.client.zzl) zzavi.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                    IObjectWrapper asInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder readStrongBinder3 = parcel.readStrongBinder();
                    if (readStrongBinder3 != null) {
                        IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
                        zzbreVar = queryLocalInterface3 instanceof zzbrg ? (zzbrg) queryLocalInterface3 : new zzbre(readStrongBinder3);
                    }
                    zzbrg zzbrgVar = zzbreVar;
                    zzbpx zzb2 = zzbpw.zzb(parcel.readStrongBinder());
                    zzavi.zzc(parcel);
                    zzl(readString4, readString5, zzlVar2, asInterface3, zzbrgVar, zzb2);
                    parcel2.writeNoException();
                    break;
                case 15:
                    IObjectWrapper asInterface4 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    zzavi.zzc(parcel);
                    boolean zzs = zzs(asInterface4);
                    parcel2.writeNoException();
                    parcel2.writeInt(zzs ? 1 : 0);
                    break;
                case 16:
                    String readString6 = parcel.readString();
                    String readString7 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzl zzlVar3 = (com.google.android.gms.ads.internal.client.zzl) zzavi.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                    IObjectWrapper asInterface5 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder readStrongBinder4 = parcel.readStrongBinder();
                    if (readStrongBinder4 != null) {
                        IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                        zzbrkVar2 = queryLocalInterface4 instanceof zzbrm ? (zzbrm) queryLocalInterface4 : new zzbrk(readStrongBinder4);
                    }
                    zzbrm zzbrmVar = zzbrkVar2;
                    zzbpx zzb3 = zzbpw.zzb(parcel.readStrongBinder());
                    zzavi.zzc(parcel);
                    zzp(readString6, readString7, zzlVar3, asInterface5, zzbrmVar, zzb3);
                    parcel2.writeNoException();
                    break;
                case 17:
                    IObjectWrapper asInterface6 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    zzavi.zzc(parcel);
                    boolean zzt = zzt(asInterface6);
                    parcel2.writeNoException();
                    parcel2.writeInt(zzt ? 1 : 0);
                    break;
                case 18:
                    String readString8 = parcel.readString();
                    String readString9 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzl zzlVar4 = (com.google.android.gms.ads.internal.client.zzl) zzavi.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                    IObjectWrapper asInterface7 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder readStrongBinder5 = parcel.readStrongBinder();
                    if (readStrongBinder5 != null) {
                        IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                        zzbrhVar2 = queryLocalInterface5 instanceof zzbrj ? (zzbrj) queryLocalInterface5 : new zzbrh(readStrongBinder5);
                    }
                    zzbrj zzbrjVar = zzbrhVar2;
                    zzbpx zzb4 = zzbpw.zzb(parcel.readStrongBinder());
                    zzavi.zzc(parcel);
                    zzm(readString8, readString9, zzlVar4, asInterface7, zzbrjVar, zzb4);
                    parcel2.writeNoException();
                    break;
                case 19:
                    String readString10 = parcel.readString();
                    zzavi.zzc(parcel);
                    zzq(readString10);
                    parcel2.writeNoException();
                    break;
                case 20:
                    String readString11 = parcel.readString();
                    String readString12 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzl zzlVar5 = (com.google.android.gms.ads.internal.client.zzl) zzavi.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                    IObjectWrapper asInterface8 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder readStrongBinder6 = parcel.readStrongBinder();
                    if (readStrongBinder6 != null) {
                        IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                        zzbrkVar = queryLocalInterface6 instanceof zzbrm ? (zzbrm) queryLocalInterface6 : new zzbrk(readStrongBinder6);
                    }
                    zzbrm zzbrmVar2 = zzbrkVar;
                    zzbpx zzb5 = zzbpw.zzb(parcel.readStrongBinder());
                    zzavi.zzc(parcel);
                    zzo(readString11, readString12, zzlVar5, asInterface8, zzbrmVar2, zzb5);
                    parcel2.writeNoException();
                    break;
                case 21:
                    String readString13 = parcel.readString();
                    String readString14 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzl zzlVar6 = (com.google.android.gms.ads.internal.client.zzl) zzavi.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                    IObjectWrapper asInterface9 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder readStrongBinder7 = parcel.readStrongBinder();
                    if (readStrongBinder7 != null) {
                        IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                        zzbrbVar = queryLocalInterface7 instanceof zzbrd ? (zzbrd) queryLocalInterface7 : new zzbrb(readStrongBinder7);
                    }
                    zzbrd zzbrdVar2 = zzbrbVar;
                    zzbpx zzb6 = zzbpw.zzb(parcel.readStrongBinder());
                    com.google.android.gms.ads.internal.client.zzq zzqVar3 = (com.google.android.gms.ads.internal.client.zzq) zzavi.zza(parcel, com.google.android.gms.ads.internal.client.zzq.CREATOR);
                    zzavi.zzc(parcel);
                    zzk(readString13, readString14, zzlVar6, asInterface9, zzbrdVar2, zzb6, zzqVar3);
                    parcel2.writeNoException();
                    break;
                case 22:
                    String readString15 = parcel.readString();
                    String readString16 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzl zzlVar7 = (com.google.android.gms.ads.internal.client.zzl) zzavi.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                    IObjectWrapper asInterface10 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder readStrongBinder8 = parcel.readStrongBinder();
                    if (readStrongBinder8 != null) {
                        IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                        zzbrhVar = queryLocalInterface8 instanceof zzbrj ? (zzbrj) queryLocalInterface8 : new zzbrh(readStrongBinder8);
                    }
                    zzbrj zzbrjVar2 = zzbrhVar;
                    zzbpx zzb7 = zzbpw.zzb(parcel.readStrongBinder());
                    zzbfw zzbfwVar = (zzbfw) zzavi.zza(parcel, zzbfw.CREATOR);
                    zzavi.zzc(parcel);
                    zzn(readString15, readString16, zzlVar7, asInterface10, zzbrjVar2, zzb7, zzbfwVar);
                    parcel2.writeNoException();
                    break;
                case 23:
                    String readString17 = parcel.readString();
                    String readString18 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzl zzlVar8 = (com.google.android.gms.ads.internal.client.zzl) zzavi.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                    IObjectWrapper asInterface11 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder readStrongBinder9 = parcel.readStrongBinder();
                    if (readStrongBinder9 != null) {
                        IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IAppOpenCallback");
                        zzbqyVar = queryLocalInterface9 instanceof zzbra ? (zzbra) queryLocalInterface9 : new zzbqy(readStrongBinder9);
                    }
                    zzbra zzbraVar = zzbqyVar;
                    zzbpx zzb8 = zzbpw.zzb(parcel.readStrongBinder());
                    zzavi.zzc(parcel);
                    zzi(readString17, readString18, zzlVar8, asInterface11, zzbraVar, zzb8);
                    parcel2.writeNoException();
                    break;
                case 24:
                    IObjectWrapper asInterface12 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    zzavi.zzc(parcel);
                    boolean zzr = zzr(asInterface12);
                    parcel2.writeNoException();
                    parcel2.writeInt(zzr ? 1 : 0);
                    break;
                default:
                    return false;
            }
        } else {
            parcel.createStringArray();
            zzavi.zzc(parcel);
            parcel2.writeNoException();
        }
        return true;
    }
}
