package com.google.android.gms.internal.drive;

import android.content.IntentSender;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzep extends zza implements zzeo {
    zzep(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.drive.internal.IDriveService");
    }

    @Override // com.google.android.gms.internal.drive.zzeo
    public final IntentSender zza(zzgg zzggVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzc.zza(obtainAndWriteInterfaceToken, zzggVar);
        Parcel transactAndReadException = transactAndReadException(10, obtainAndWriteInterfaceToken);
        IntentSender intentSender = (IntentSender) zzc.zza(transactAndReadException, IntentSender.CREATOR);
        transactAndReadException.recycle();
        return intentSender;
    }

    @Override // com.google.android.gms.internal.drive.zzeo
    public final IntentSender zza(zzu zzuVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzc.zza(obtainAndWriteInterfaceToken, zzuVar);
        Parcel transactAndReadException = transactAndReadException(11, obtainAndWriteInterfaceToken);
        IntentSender intentSender = (IntentSender) zzc.zza(transactAndReadException, IntentSender.CREATOR);
        transactAndReadException.recycle();
        return intentSender;
    }

    @Override // com.google.android.gms.internal.drive.zzeo
    public final zzec zza(zzgd zzgdVar, zzeq zzeqVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzc.zza(obtainAndWriteInterfaceToken, zzgdVar);
        zzc.zza(obtainAndWriteInterfaceToken, zzeqVar);
        Parcel transactAndReadException = transactAndReadException(7, obtainAndWriteInterfaceToken);
        zzec zzecVar = (zzec) zzc.zza(transactAndReadException, zzec.CREATOR);
        transactAndReadException.recycle();
        return zzecVar;
    }

    @Override // com.google.android.gms.internal.drive.zzeo
    public final void zza(zzab zzabVar, zzeq zzeqVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzc.zza(obtainAndWriteInterfaceToken, zzabVar);
        zzc.zza(obtainAndWriteInterfaceToken, zzeqVar);
        transactAndReadExceptionReturnVoid(24, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.drive.zzeo
    public final void zza(zzad zzadVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzc.zza(obtainAndWriteInterfaceToken, zzadVar);
        transactAndReadExceptionReturnVoid(16, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.drive.zzeo
    public final void zza(zzek zzekVar, zzeq zzeqVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzc.zza(obtainAndWriteInterfaceToken, zzekVar);
        zzc.zza(obtainAndWriteInterfaceToken, zzeqVar);
        transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.drive.zzeo
    public final void zza(zzeq zzeqVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzc.zza(obtainAndWriteInterfaceToken, zzeqVar);
        transactAndReadExceptionReturnVoid(9, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.drive.zzeo
    public final void zza(zzex zzexVar, zzeq zzeqVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzc.zza(obtainAndWriteInterfaceToken, zzexVar);
        zzc.zza(obtainAndWriteInterfaceToken, zzeqVar);
        transactAndReadExceptionReturnVoid(13, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.drive.zzeo
    public final void zza(zzgk zzgkVar, zzeq zzeqVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzc.zza(obtainAndWriteInterfaceToken, zzgkVar);
        zzc.zza(obtainAndWriteInterfaceToken, zzeqVar);
        transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.drive.zzeo
    public final void zza(zzgm zzgmVar, zzes zzesVar, String str, zzeq zzeqVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzc.zza(obtainAndWriteInterfaceToken, zzgmVar);
        zzc.zza(obtainAndWriteInterfaceToken, zzesVar);
        obtainAndWriteInterfaceToken.writeString(null);
        zzc.zza(obtainAndWriteInterfaceToken, zzeqVar);
        transactAndReadExceptionReturnVoid(15, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.drive.zzeo
    public final void zza(zzgo zzgoVar, zzeq zzeqVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzc.zza(obtainAndWriteInterfaceToken, zzgoVar);
        zzc.zza(obtainAndWriteInterfaceToken, zzeqVar);
        transactAndReadExceptionReturnVoid(36, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.drive.zzeo
    public final void zza(zzgq zzgqVar, zzeq zzeqVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzc.zza(obtainAndWriteInterfaceToken, zzgqVar);
        zzc.zza(obtainAndWriteInterfaceToken, zzeqVar);
        transactAndReadExceptionReturnVoid(28, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.drive.zzeo
    public final void zza(zzgv zzgvVar, zzeq zzeqVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzc.zza(obtainAndWriteInterfaceToken, zzgvVar);
        zzc.zza(obtainAndWriteInterfaceToken, zzeqVar);
        transactAndReadExceptionReturnVoid(17, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.drive.zzeo
    public final void zza(zzgx zzgxVar, zzeq zzeqVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzc.zza(obtainAndWriteInterfaceToken, zzgxVar);
        zzc.zza(obtainAndWriteInterfaceToken, zzeqVar);
        transactAndReadExceptionReturnVoid(38, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.drive.zzeo
    public final void zza(zzgz zzgzVar, zzeq zzeqVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzc.zza(obtainAndWriteInterfaceToken, zzgzVar);
        zzc.zza(obtainAndWriteInterfaceToken, zzeqVar);
        transactAndReadExceptionReturnVoid(3, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.drive.zzeo
    public final void zza(zzj zzjVar, zzes zzesVar, String str, zzeq zzeqVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzc.zza(obtainAndWriteInterfaceToken, zzjVar);
        zzc.zza(obtainAndWriteInterfaceToken, zzesVar);
        obtainAndWriteInterfaceToken.writeString(null);
        zzc.zza(obtainAndWriteInterfaceToken, zzeqVar);
        transactAndReadExceptionReturnVoid(14, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.drive.zzeo
    public final void zza(zzm zzmVar, zzeq zzeqVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzc.zza(obtainAndWriteInterfaceToken, zzmVar);
        zzc.zza(obtainAndWriteInterfaceToken, zzeqVar);
        transactAndReadExceptionReturnVoid(18, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.drive.zzeo
    public final void zza(zzo zzoVar, zzeq zzeqVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzc.zza(obtainAndWriteInterfaceToken, zzoVar);
        zzc.zza(obtainAndWriteInterfaceToken, zzeqVar);
        transactAndReadExceptionReturnVoid(8, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.drive.zzeo
    public final void zza(zzr zzrVar, zzeq zzeqVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzc.zza(obtainAndWriteInterfaceToken, zzrVar);
        zzc.zza(obtainAndWriteInterfaceToken, zzeqVar);
        transactAndReadExceptionReturnVoid(4, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.drive.zzeo
    public final void zza(zzw zzwVar, zzeq zzeqVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzc.zza(obtainAndWriteInterfaceToken, zzwVar);
        zzc.zza(obtainAndWriteInterfaceToken, zzeqVar);
        transactAndReadExceptionReturnVoid(5, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.drive.zzeo
    public final void zza(zzy zzyVar, zzeq zzeqVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzc.zza(obtainAndWriteInterfaceToken, zzyVar);
        zzc.zza(obtainAndWriteInterfaceToken, zzeqVar);
        transactAndReadExceptionReturnVoid(6, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.drive.zzeo
    public final void zzb(zzeq zzeqVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzc.zza(obtainAndWriteInterfaceToken, zzeqVar);
        transactAndReadExceptionReturnVoid(35, obtainAndWriteInterfaceToken);
    }
}
