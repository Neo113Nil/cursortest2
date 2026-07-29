package com.google.android.gms.games.internal;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.games.GamesActivityResultCodes;
import com.google.android.gms.games.GamesStatusCodes;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.games.multiplayer.ParticipantResult;
import com.google.android.gms.games.multiplayer.realtime.RoomEntity;

/* loaded from: classes.dex */
public final class zzz extends com.google.android.gms.internal.games.zza implements zzy {
    zzz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.games.internal.IGamesService");
    }

    @Override // com.google.android.gms.games.internal.zzy
    public final Bundle getConnectionHint() throws RemoteException {
        Parcel transactAndReadException = transactAndReadException(5004, obtainAndWriteInterfaceToken());
        Bundle bundle = (Bundle) com.google.android.gms.internal.games.zzc.zza(transactAndReadException, Bundle.CREATOR);
        transactAndReadException.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.games.internal.zzy
    public final int zza(zzu zzuVar, byte[] bArr, String str, String str2) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.games.zzc.zza(obtainAndWriteInterfaceToken, zzuVar);
        obtainAndWriteInterfaceToken.writeByteArray(bArr);
        obtainAndWriteInterfaceToken.writeString(str);
        obtainAndWriteInterfaceToken.writeString(str2);
        Parcel transactAndReadException = transactAndReadException(5033, obtainAndWriteInterfaceToken);
        int readInt = transactAndReadException.readInt();
        transactAndReadException.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.games.internal.zzy
    public final Intent zza(int i, int i2, boolean z) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeInt(i);
        obtainAndWriteInterfaceToken.writeInt(i2);
        com.google.android.gms.internal.games.zzc.zza(obtainAndWriteInterfaceToken, z);
        Parcel transactAndReadException = transactAndReadException(9008, obtainAndWriteInterfaceToken);
        Intent intent = (Intent) com.google.android.gms.internal.games.zzc.zza(transactAndReadException, Intent.CREATOR);
        transactAndReadException.recycle();
        return intent;
    }

    @Override // com.google.android.gms.games.internal.zzy
    public final Intent zza(int i, byte[] bArr, int i2, String str) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeInt(i);
        obtainAndWriteInterfaceToken.writeByteArray(bArr);
        obtainAndWriteInterfaceToken.writeInt(i2);
        obtainAndWriteInterfaceToken.writeString(str);
        Parcel transactAndReadException = transactAndReadException(10012, obtainAndWriteInterfaceToken);
        Intent intent = (Intent) com.google.android.gms.internal.games.zzc.zza(transactAndReadException, Intent.CREATOR);
        transactAndReadException.recycle();
        return intent;
    }

    @Override // com.google.android.gms.games.internal.zzy
    public final Intent zza(PlayerEntity playerEntity) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.games.zzc.zza(obtainAndWriteInterfaceToken, playerEntity);
        Parcel transactAndReadException = transactAndReadException(15503, obtainAndWriteInterfaceToken);
        Intent intent = (Intent) com.google.android.gms.internal.games.zzc.zza(transactAndReadException, Intent.CREATOR);
        transactAndReadException.recycle();
        return intent;
    }

    @Override // com.google.android.gms.games.internal.zzy
    public final Intent zza(RoomEntity roomEntity, int i) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.games.zzc.zza(obtainAndWriteInterfaceToken, roomEntity);
        obtainAndWriteInterfaceToken.writeInt(i);
        Parcel transactAndReadException = transactAndReadException(9011, obtainAndWriteInterfaceToken);
        Intent intent = (Intent) com.google.android.gms.internal.games.zzc.zza(transactAndReadException, Intent.CREATOR);
        transactAndReadException.recycle();
        return intent;
    }

    @Override // com.google.android.gms.games.internal.zzy
    public final Intent zza(String str, boolean z, boolean z2, int i) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeString(str);
        com.google.android.gms.internal.games.zzc.zza(obtainAndWriteInterfaceToken, z);
        com.google.android.gms.internal.games.zzc.zza(obtainAndWriteInterfaceToken, z2);
        obtainAndWriteInterfaceToken.writeInt(i);
        Parcel transactAndReadException = transactAndReadException(12001, obtainAndWriteInterfaceToken);
        Intent intent = (Intent) com.google.android.gms.internal.games.zzc.zza(transactAndReadException, Intent.CREATOR);
        transactAndReadException.recycle();
        return intent;
    }

    @Override // com.google.android.gms.games.internal.zzy
    public final Intent zza(int[] iArr) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeIntArray(iArr);
        Parcel transactAndReadException = transactAndReadException(12030, obtainAndWriteInterfaceToken);
        Intent intent = (Intent) com.google.android.gms.internal.games.zzc.zza(transactAndReadException, Intent.CREATOR);
        transactAndReadException.recycle();
        return intent;
    }

    @Override // com.google.android.gms.games.internal.zzy
    public final void zza(long j) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeLong(j);
        transactAndReadExceptionReturnVoid(5001, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.games.internal.zzy
    public final void zza(IBinder iBinder, Bundle bundle) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeStrongBinder(iBinder);
        com.google.android.gms.internal.games.zzc.zza(obtainAndWriteInterfaceToken, bundle);
        transactAndReadExceptionReturnVoid(5005, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.games.internal.zzy
    public final void zza(Contents contents) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.games.zzc.zza(obtainAndWriteInterfaceToken, contents);
        transactAndReadExceptionReturnVoid(12019, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.games.internal.zzy
    public final void zza(zzu zzuVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.games.zzc.zza(obtainAndWriteInterfaceToken, zzuVar);
        transactAndReadExceptionReturnVoid(5002, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.games.internal.zzy
    public final void zza(zzu zzuVar, int i) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.games.zzc.zza(obtainAndWriteInterfaceToken, zzuVar);
        obtainAndWriteInterfaceToken.writeInt(i);
        transactAndReadExceptionReturnVoid(10016, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.games.internal.zzy
    public final void zza(zzu zzuVar, int i, int i2, int i3) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.games.zzc.zza(obtainAndWriteInterfaceToken, zzuVar);
        obtainAndWriteInterfaceToken.writeInt(i);
        obtainAndWriteInterfaceToken.writeInt(i2);
        obtainAndWriteInterfaceToken.writeInt(i3);
        transactAndReadExceptionReturnVoid(10009, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.games.internal.zzy
    public final void zza(zzu zzuVar, int i, int i2, String[] strArr, Bundle bundle) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.games.zzc.zza(obtainAndWriteInterfaceToken, zzuVar);
        obtainAndWriteInterfaceToken.writeInt(i);
        obtainAndWriteInterfaceToken.writeInt(i2);
        obtainAndWriteInterfaceToken.writeStringArray(strArr);
        com.google.android.gms.internal.games.zzc.zza(obtainAndWriteInterfaceToken, bundle);
        transactAndReadExceptionReturnVoid(8004, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.games.internal.zzy
    public final void zza(zzu zzuVar, int i, boolean z, boolean z2) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.games.zzc.zza(obtainAndWriteInterfaceToken, zzuVar);
        obtainAndWriteInterfaceToken.writeInt(i);
        com.google.android.gms.internal.games.zzc.zza(obtainAndWriteInterfaceToken, z);
        com.google.android.gms.internal.games.zzc.zza(obtainAndWriteInterfaceToken, z2);
        transactAndReadExceptionReturnVoid(5015, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.games.internal.zzy
    public final void zza(zzu zzuVar, int i, int[] iArr) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.games.zzc.zza(obtainAndWriteInterfaceToken, zzuVar);
        obtainAndWriteInterfaceToken.writeInt(i);
        obtainAndWriteInterfaceToken.writeIntArray(iArr);
        transactAndReadExceptionReturnVoid(10018, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.games.internal.zzy
    public final void zza(zzu zzuVar, long j) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.games.zzc.zza(obtainAndWriteInterfaceToken, zzuVar);
        obtainAndWriteInterfaceToken.writeLong(j);
        transactAndReadExceptionReturnVoid(5058, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.games.internal.zzy
    public final void zza(zzu zzuVar, Bundle bundle, int i, int i2) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.games.zzc.zza(obtainAndWriteInterfaceToken, zzuVar);
        com.google.android.gms.internal.games.zzc.zza(obtainAndWriteInterfaceToken, bundle);
        obtainAndWriteInterfaceToken.writeInt(i);
        obtainAndWriteInterfaceToken.writeInt(i2);
        transactAndReadExceptionReturnVoid(5021, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.games.internal.zzy
    public final void zza(zzu zzuVar, IBinder iBinder, int i, String[] strArr, Bundle bundle, boolean z, long j) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.games.zzc.zza(obtainAndWriteInterfaceToken, zzuVar);
        obtainAndWriteInterfaceToken.writeStrongBinder(iBinder);
        obtainAndWriteInterfaceToken.writeInt(i);
        obtainAndWriteInterfaceToken.writeStringArray(strArr);
        com.google.android.gms.internal.games.zzc.zza(obtainAndWriteInterfaceToken, bundle);
        com.google.android.gms.internal.games.zzc.zza(obtainAndWriteInterfaceToken, false);
        obtainAndWriteInterfaceToken.writeLong(j);
        transactAndReadExceptionReturnVoid(5030, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.games.internal.zzy
    public final void zza(zzu zzuVar, IBinder iBinder, String str, boolean z, long j) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.games.zzc.zza(obtainAndWriteInterfaceToken, zzuVar);
        obtainAndWriteInterfaceToken.writeStrongBinder(iBinder);
        obtainAndWriteInterfaceToken.writeString(str);
        com.google.android.gms.internal.games.zzc.zza(obtainAndWriteInterfaceToken, false);
        obtainAndWriteInterfaceToken.writeLong(j);
        transactAndReadExceptionReturnVoid(5031, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.games.internal.zzy
    public final void zza(zzu zzuVar, String str) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.games.zzc.zza(obtainAndWriteInterfaceToken, zzuVar);
        obtainAndWriteInterfaceToken.writeString(str);
        transactAndReadExceptionReturnVoid(5032, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.games.internal.zzy
    public final void zza(zzu zzuVar, String str, int i, int i2, int i3, boolean z) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.games.zzc.zza(obtainAndWriteInterfaceToken, zzuVar);
        obtainAndWriteInterfaceToken.writeString(str);
        obtainAndWriteInterfaceToken.writeInt(i);
        obtainAndWriteInterfaceToken.writeInt(i2);
        obtainAndWriteInterfaceToken.writeInt(i3);
        com.google.android.gms.internal.games.zzc.zza(obtainAndWriteInterfaceToken, z);
        transactAndReadExceptionReturnVoid(5019, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.games.internal.zzy
    public final void zza(zzu zzuVar, String str, int i, IBinder iBinder, Bundle bundle) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.games.zzc.zza(obtainAndWriteInterfaceToken, zzuVar);
        obtainAndWriteInterfaceToken.writeString(str);
        obtainAndWriteInterfaceToken.writeInt(i);
        obtainAndWriteInterfaceToken.writeStrongBinder(iBinder);
        com.google.android.gms.internal.games.zzc.zza(obtainAndWriteInterfaceToken, bundle);
        transactAndReadExceptionReturnVoid(5025, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.games.internal.zzy
    public final void zza(zzu zzuVar, String str, int i, boolean z, boolean z2) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.games.zzc.zza(obtainAndWriteInterfaceToken, zzuVar);
        obtainAndWriteInterfaceToken.writeString(str);
        obtainAndWriteInterfaceToken.writeInt(i);
        com.google.android.gms.internal.games.zzc.zza(obtainAndWriteInterfaceToken, z);
        com.google.android.gms.internal.games.zzc.zza(obtainAndWriteInterfaceToken, z2);
        transactAndReadExceptionReturnVoid(9020, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.games.internal.zzy
    public final void zza(zzu zzuVar, String str, long j, String str2) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.games.zzc.zza(obtainAndWriteInterfaceToken, zzuVar);
        obtainAndWriteInterfaceToken.writeString(str);
        obtainAndWriteInterfaceToken.writeLong(j);
        obtainAndWriteInterfaceToken.writeString(str2);
        transactAndReadExceptionReturnVoid(GamesStatusCodes.STATUS_INVALID_REAL_TIME_ROOM_ID, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.games.internal.zzy
    public final void zza(zzu zzuVar, String str, IBinder iBinder, Bundle bundle) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.games.zzc.zza(obtainAndWriteInterfaceToken, zzuVar);
        obtainAndWriteInterfaceToken.writeString(str);
        obtainAndWriteInterfaceToken.writeStrongBinder(iBinder);
        com.google.android.gms.internal.games.zzc.zza(obtainAndWriteInterfaceToken, bundle);
        transactAndReadExceptionReturnVoid(5023, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.games.internal.zzy
    public final void zza(zzu zzuVar, String str, com.google.android.gms.games.snapshot.zze zzeVar, Contents contents) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.games.zzc.zza(obtainAndWriteInterfaceToken, zzuVar);
        obtainAndWriteInterfaceToken.writeString(str);
        com.google.android.gms.internal.games.zzc.zza(obtainAndWriteInterfaceToken, zzeVar);
        com.google.android.gms.internal.games.zzc.zza(obtainAndWriteInterfaceToken, contents);
        transactAndReadExceptionReturnVoid(12007, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.games.internal.zzy
    public final void zza(zzu zzuVar, String str, String str2) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.games.zzc.zza(obtainAndWriteInterfaceToken, zzuVar);
        obtainAndWriteInterfaceToken.writeString(str);
        obtainAndWriteInterfaceToken.writeString(str2);
        transactAndReadExceptionReturnVoid(8011, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.games.internal.zzy
    public final void zza(zzu zzuVar, String str, String str2, int i, int i2) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.games.zzc.zza(obtainAndWriteInterfaceToken, zzuVar);
        obtainAndWriteInterfaceToken.writeString(null);
        obtainAndWriteInterfaceToken.writeString(str2);
        obtainAndWriteInterfaceToken.writeInt(i);
        obtainAndWriteInterfaceToken.writeInt(i2);
        transactAndReadExceptionReturnVoid(GamesStatusCodes.STATUS_MILESTONE_CLAIM_FAILED, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.games.internal.zzy
    public final void zza(zzu zzuVar, String str, String str2, com.google.android.gms.games.snapshot.zze zzeVar, Contents contents) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.games.zzc.zza(obtainAndWriteInterfaceToken, zzuVar);
        obtainAndWriteInterfaceToken.writeString(str);
        obtainAndWriteInterfaceToken.writeString(str2);
        com.google.android.gms.internal.games.zzc.zza(obtainAndWriteInterfaceToken, zzeVar);
        com.google.android.gms.internal.games.zzc.zza(obtainAndWriteInterfaceToken, contents);
        transactAndReadExceptionReturnVoid(12033, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.games.internal.zzy
    public final void zza(zzu zzuVar, String str, boolean z) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.games.zzc.zza(obtainAndWriteInterfaceToken, zzuVar);
        obtainAndWriteInterfaceToken.writeString(str);
        com.google.android.gms.internal.games.zzc.zza(obtainAndWriteInterfaceToken, z);
        transactAndReadExceptionReturnVoid(GamesStatusCodes.STATUS_MATCH_ERROR_INVALID_MATCH_RESULTS, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.games.internal.zzy
    public final void zza(zzu zzuVar, String str, boolean z, int i) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.games.zzc.zza(obtainAndWriteInterfaceToken, zzuVar);
        obtainAndWriteInterfaceToken.writeString(str);
        com.google.android.gms.internal.games.zzc.zza(obtainAndWriteInterfaceToken, z);
        obtainAndWriteInterfaceToken.writeInt(i);
        transactAndReadExceptionReturnVoid(15001, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.games.internal.zzy
    public final void zza(zzu zzuVar, String str, byte[] bArr, String str2, ParticipantResult[] participantResultArr) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.games.zzc.zza(obtainAndWriteInterfaceToken, zzuVar);
        obtainAndWriteInterfaceToken.writeString(str);
        obtainAndWriteInterfaceToken.writeByteArray(bArr);
        obtainAndWriteInterfaceToken.writeString(str2);
        obtainAndWriteInterfaceToken.writeTypedArray(participantResultArr, 0);
        transactAndReadExceptionReturnVoid(8007, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.games.internal.zzy
    public final void zza(zzu zzuVar, String str, byte[] bArr, ParticipantResult[] participantResultArr) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.games.zzc.zza(obtainAndWriteInterfaceToken, zzuVar);
        obtainAndWriteInterfaceToken.writeString(str);
        obtainAndWriteInterfaceToken.writeByteArray(bArr);
        obtainAndWriteInterfaceToken.writeTypedArray(participantResultArr, 0);
        transactAndReadExceptionReturnVoid(8008, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.games.internal.zzy
    public final void zza(zzu zzuVar, boolean z) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.games.zzc.zza(obtainAndWriteInterfaceToken, zzuVar);
        com.google.android.gms.internal.games.zzc.zza(obtainAndWriteInterfaceToken, z);
        transactAndReadExceptionReturnVoid(GamesStatusCodes.STATUS_MULTIPLAYER_ERROR_NOT_TRUSTED_TESTER, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.games.internal.zzy
    public final void zza(zzu zzuVar, boolean z, String[] strArr) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.games.zzc.zza(obtainAndWriteInterfaceToken, zzuVar);
        com.google.android.gms.internal.games.zzc.zza(obtainAndWriteInterfaceToken, z);
        obtainAndWriteInterfaceToken.writeStringArray(strArr);
        transactAndReadExceptionReturnVoid(12031, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.games.internal.zzy
    public final void zza(zzu zzuVar, int[] iArr, int i, boolean z) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.games.zzc.zza(obtainAndWriteInterfaceToken, zzuVar);
        obtainAndWriteInterfaceToken.writeIntArray(iArr);
        obtainAndWriteInterfaceToken.writeInt(i);
        com.google.android.gms.internal.games.zzc.zza(obtainAndWriteInterfaceToken, z);
        transactAndReadExceptionReturnVoid(12010, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.games.internal.zzy
    public final void zza(zzu zzuVar, String[] strArr) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.games.zzc.zza(obtainAndWriteInterfaceToken, zzuVar);
        obtainAndWriteInterfaceToken.writeStringArray(strArr);
        transactAndReadExceptionReturnVoid(GamesActivityResultCodes.RESULT_NETWORK_FAILURE, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.games.internal.zzy
    public final void zza(zzu zzuVar, String[] strArr, boolean z) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.games.zzc.zza(obtainAndWriteInterfaceToken, zzuVar);
        obtainAndWriteInterfaceToken.writeStringArray(strArr);
        com.google.android.gms.internal.games.zzc.zza(obtainAndWriteInterfaceToken, z);
        transactAndReadExceptionReturnVoid(12029, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.games.internal.zzy
    public final void zza(zzw zzwVar, long j) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.games.zzc.zza(obtainAndWriteInterfaceToken, zzwVar);
        obtainAndWriteInterfaceToken.writeLong(j);
        transactAndReadExceptionReturnVoid(15501, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.games.internal.zzy
    public final void zza(String str, int i) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeString(str);
        obtainAndWriteInterfaceToken.writeInt(i);
        transactAndReadExceptionReturnVoid(12017, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.games.internal.zzy
    public final void zza(String str, IBinder iBinder, Bundle bundle) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeString(str);
        obtainAndWriteInterfaceToken.writeStrongBinder(iBinder);
        com.google.android.gms.internal.games.zzc.zza(obtainAndWriteInterfaceToken, bundle);
        transactAndReadExceptionReturnVoid(13002, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.games.internal.zzy
    public final void zza(String str, zzu zzuVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeString(str);
        com.google.android.gms.internal.games.zzc.zza(obtainAndWriteInterfaceToken, zzuVar);
        transactAndReadExceptionReturnVoid(20001, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.games.internal.zzy
    public final Intent zzag() throws RemoteException {
        Parcel transactAndReadException = transactAndReadException(9010, obtainAndWriteInterfaceToken());
        Intent intent = (Intent) com.google.android.gms.internal.games.zzc.zza(transactAndReadException, Intent.CREATOR);
        transactAndReadException.recycle();
        return intent;
    }

    @Override // com.google.android.gms.games.internal.zzy
    public final Intent zzai() throws RemoteException {
        Parcel transactAndReadException = transactAndReadException(9012, obtainAndWriteInterfaceToken());
        Intent intent = (Intent) com.google.android.gms.internal.games.zzc.zza(transactAndReadException, Intent.CREATOR);
        transactAndReadException.recycle();
        return intent;
    }

    @Override // com.google.android.gms.games.internal.zzy
    public final int zzak() throws RemoteException {
        Parcel transactAndReadException = transactAndReadException(9019, obtainAndWriteInterfaceToken());
        int readInt = transactAndReadException.readInt();
        transactAndReadException.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.games.internal.zzy
    public final String zzam() throws RemoteException {
        Parcel transactAndReadException = transactAndReadException(5003, obtainAndWriteInterfaceToken());
        String readString = transactAndReadException.readString();
        transactAndReadException.recycle();
        return readString;
    }

    @Override // com.google.android.gms.games.internal.zzy
    public final int zzao() throws RemoteException {
        Parcel transactAndReadException = transactAndReadException(8024, obtainAndWriteInterfaceToken());
        int readInt = transactAndReadException.readInt();
        transactAndReadException.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.games.internal.zzy
    public final Intent zzaq() throws RemoteException {
        Parcel transactAndReadException = transactAndReadException(10015, obtainAndWriteInterfaceToken());
        Intent intent = (Intent) com.google.android.gms.internal.games.zzc.zza(transactAndReadException, Intent.CREATOR);
        transactAndReadException.recycle();
        return intent;
    }

    @Override // com.google.android.gms.games.internal.zzy
    public final int zzar() throws RemoteException {
        Parcel transactAndReadException = transactAndReadException(10013, obtainAndWriteInterfaceToken());
        int readInt = transactAndReadException.readInt();
        transactAndReadException.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.games.internal.zzy
    public final int zzas() throws RemoteException {
        Parcel transactAndReadException = transactAndReadException(10023, obtainAndWriteInterfaceToken());
        int readInt = transactAndReadException.readInt();
        transactAndReadException.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.games.internal.zzy
    public final int zzat() throws RemoteException {
        Parcel transactAndReadException = transactAndReadException(12035, obtainAndWriteInterfaceToken());
        int readInt = transactAndReadException.readInt();
        transactAndReadException.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.games.internal.zzy
    public final int zzav() throws RemoteException {
        Parcel transactAndReadException = transactAndReadException(12036, obtainAndWriteInterfaceToken());
        int readInt = transactAndReadException.readInt();
        transactAndReadException.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.games.internal.zzy
    public final boolean zzaz() throws RemoteException {
        Parcel transactAndReadException = transactAndReadException(22030, obtainAndWriteInterfaceToken());
        boolean zza = com.google.android.gms.internal.games.zzc.zza(transactAndReadException);
        transactAndReadException.recycle();
        return zza;
    }

    @Override // com.google.android.gms.games.internal.zzy
    public final int zzb(byte[] bArr, String str, String[] strArr) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeByteArray(bArr);
        obtainAndWriteInterfaceToken.writeString(str);
        obtainAndWriteInterfaceToken.writeStringArray(strArr);
        Parcel transactAndReadException = transactAndReadException(5034, obtainAndWriteInterfaceToken);
        int readInt = transactAndReadException.readInt();
        transactAndReadException.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.games.internal.zzy
    public final Intent zzb(String str, int i, int i2) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeString(str);
        obtainAndWriteInterfaceToken.writeInt(i);
        obtainAndWriteInterfaceToken.writeInt(i2);
        Parcel transactAndReadException = transactAndReadException(18001, obtainAndWriteInterfaceToken);
        Intent intent = (Intent) com.google.android.gms.internal.games.zzc.zza(transactAndReadException, Intent.CREATOR);
        transactAndReadException.recycle();
        return intent;
    }

    @Override // com.google.android.gms.games.internal.zzy
    public final void zzb(long j) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeLong(j);
        transactAndReadExceptionReturnVoid(5059, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.games.internal.zzy
    public final void zzb(zzu zzuVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.games.zzc.zza(obtainAndWriteInterfaceToken, zzuVar);
        transactAndReadExceptionReturnVoid(5026, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.games.internal.zzy
    public final void zzb(zzu zzuVar, int i) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.games.zzc.zza(obtainAndWriteInterfaceToken, zzuVar);
        obtainAndWriteInterfaceToken.writeInt(i);
        transactAndReadExceptionReturnVoid(22016, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.games.internal.zzy
    public final void zzb(zzu zzuVar, long j) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.games.zzc.zza(obtainAndWriteInterfaceToken, zzuVar);
        obtainAndWriteInterfaceToken.writeLong(j);
        transactAndReadExceptionReturnVoid(8012, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.games.internal.zzy
    public final void zzb(zzu zzuVar, String str) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.games.zzc.zza(obtainAndWriteInterfaceToken, zzuVar);
        obtainAndWriteInterfaceToken.writeString(str);
        transactAndReadExceptionReturnVoid(8005, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.games.internal.zzy
    public final void zzb(zzu zzuVar, String str, int i, int i2, int i3, boolean z) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.games.zzc.zza(obtainAndWriteInterfaceToken, zzuVar);
        obtainAndWriteInterfaceToken.writeString(str);
        obtainAndWriteInterfaceToken.writeInt(i);
        obtainAndWriteInterfaceToken.writeInt(i2);
        obtainAndWriteInterfaceToken.writeInt(i3);
        com.google.android.gms.internal.games.zzc.zza(obtainAndWriteInterfaceToken, z);
        transactAndReadExceptionReturnVoid(5020, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.games.internal.zzy
    public final void zzb(zzu zzuVar, String str, int i, IBinder iBinder, Bundle bundle) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.games.zzc.zza(obtainAndWriteInterfaceToken, zzuVar);
        obtainAndWriteInterfaceToken.writeString(str);
        obtainAndWriteInterfaceToken.writeInt(i);
        obtainAndWriteInterfaceToken.writeStrongBinder(iBinder);
        com.google.android.gms.internal.games.zzc.zza(obtainAndWriteInterfaceToken, bundle);
        transactAndReadExceptionReturnVoid(GamesStatusCodes.STATUS_PARTICIPANT_NOT_CONNECTED, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.games.internal.zzy
    public final void zzb(zzu zzuVar, String str, IBinder iBinder, Bundle bundle) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.games.zzc.zza(obtainAndWriteInterfaceToken, zzuVar);
        obtainAndWriteInterfaceToken.writeString(str);
        obtainAndWriteInterfaceToken.writeStrongBinder(iBinder);
        com.google.android.gms.internal.games.zzc.zza(obtainAndWriteInterfaceToken, bundle);
        transactAndReadExceptionReturnVoid(5024, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.games.internal.zzy
    public final void zzb(zzu zzuVar, String str, String str2) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.games.zzc.zza(obtainAndWriteInterfaceToken, zzuVar);
        obtainAndWriteInterfaceToken.writeString(str);
        obtainAndWriteInterfaceToken.writeString(str2);
        transactAndReadExceptionReturnVoid(12009, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.games.internal.zzy
    public final void zzb(zzu zzuVar, String str, boolean z) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.games.zzc.zza(obtainAndWriteInterfaceToken, zzuVar);
        obtainAndWriteInterfaceToken.writeString(str);
        com.google.android.gms.internal.games.zzc.zza(obtainAndWriteInterfaceToken, z);
        transactAndReadExceptionReturnVoid(13006, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.games.internal.zzy
    public final void zzb(zzu zzuVar, boolean z) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.games.zzc.zza(obtainAndWriteInterfaceToken, zzuVar);
        com.google.android.gms.internal.games.zzc.zza(obtainAndWriteInterfaceToken, z);
        transactAndReadExceptionReturnVoid(GamesStatusCodes.STATUS_MATCH_ERROR_OUT_OF_DATE_VERSION, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.games.internal.zzy
    public final void zzb(zzu zzuVar, String[] strArr) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.games.zzc.zza(obtainAndWriteInterfaceToken, zzuVar);
        obtainAndWriteInterfaceToken.writeStringArray(strArr);
        transactAndReadExceptionReturnVoid(GamesActivityResultCodes.RESULT_SEND_REQUEST_FAILED, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.games.internal.zzy
    public final void zzb(String str, int i) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeString(str);
        obtainAndWriteInterfaceToken.writeInt(i);
        transactAndReadExceptionReturnVoid(5029, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.games.internal.zzy
    public final void zzbd() throws RemoteException {
        transactAndReadExceptionReturnVoid(5006, obtainAndWriteInterfaceToken());
    }

    @Override // com.google.android.gms.games.internal.zzy
    public final String zzbf() throws RemoteException {
        Parcel transactAndReadException = transactAndReadException(5012, obtainAndWriteInterfaceToken());
        String readString = transactAndReadException.readString();
        transactAndReadException.recycle();
        return readString;
    }

    @Override // com.google.android.gms.games.internal.zzy
    public final DataHolder zzbg() throws RemoteException {
        Parcel transactAndReadException = transactAndReadException(5013, obtainAndWriteInterfaceToken());
        DataHolder dataHolder = (DataHolder) com.google.android.gms.internal.games.zzc.zza(transactAndReadException, DataHolder.CREATOR);
        transactAndReadException.recycle();
        return dataHolder;
    }

    @Override // com.google.android.gms.games.internal.zzy
    public final DataHolder zzbh() throws RemoteException {
        Parcel transactAndReadException = transactAndReadException(5502, obtainAndWriteInterfaceToken());
        DataHolder dataHolder = (DataHolder) com.google.android.gms.internal.games.zzc.zza(transactAndReadException, DataHolder.CREATOR);
        transactAndReadException.recycle();
        return dataHolder;
    }

    @Override // com.google.android.gms.games.internal.zzy
    public final Intent zzbi() throws RemoteException {
        Parcel transactAndReadException = transactAndReadException(19002, obtainAndWriteInterfaceToken());
        Intent intent = (Intent) com.google.android.gms.internal.games.zzc.zza(transactAndReadException, Intent.CREATOR);
        transactAndReadException.recycle();
        return intent;
    }

    @Override // com.google.android.gms.games.internal.zzy
    public final Intent zzc(int i, int i2, boolean z) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeInt(i);
        obtainAndWriteInterfaceToken.writeInt(i2);
        com.google.android.gms.internal.games.zzc.zza(obtainAndWriteInterfaceToken, z);
        Parcel transactAndReadException = transactAndReadException(GamesStatusCodes.STATUS_VIDEO_OUT_OF_DISK_SPACE, obtainAndWriteInterfaceToken);
        Intent intent = (Intent) com.google.android.gms.internal.games.zzc.zza(transactAndReadException, Intent.CREATOR);
        transactAndReadException.recycle();
        return intent;
    }

    @Override // com.google.android.gms.games.internal.zzy
    public final void zzc(long j) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeLong(j);
        transactAndReadExceptionReturnVoid(8013, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.games.internal.zzy
    public final void zzc(zzu zzuVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.games.zzc.zza(obtainAndWriteInterfaceToken, zzuVar);
        transactAndReadExceptionReturnVoid(21007, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.games.internal.zzy
    public final void zzc(zzu zzuVar, long j) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.games.zzc.zza(obtainAndWriteInterfaceToken, zzuVar);
        obtainAndWriteInterfaceToken.writeLong(j);
        transactAndReadExceptionReturnVoid(GamesActivityResultCodes.RESULT_RECONNECT_REQUIRED, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.games.internal.zzy
    public final void zzc(zzu zzuVar, String str) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.games.zzc.zza(obtainAndWriteInterfaceToken, zzuVar);
        obtainAndWriteInterfaceToken.writeString(str);
        transactAndReadExceptionReturnVoid(8006, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.games.internal.zzy
    public final void zzc(zzu zzuVar, boolean z) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.games.zzc.zza(obtainAndWriteInterfaceToken, zzuVar);
        com.google.android.gms.internal.games.zzc.zza(obtainAndWriteInterfaceToken, z);
        transactAndReadExceptionReturnVoid(8027, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.games.internal.zzy
    public final Intent zzd(String str) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeString(str);
        Parcel transactAndReadException = transactAndReadException(12034, obtainAndWriteInterfaceToken);
        Intent intent = (Intent) com.google.android.gms.internal.games.zzc.zza(transactAndReadException, Intent.CREATOR);
        transactAndReadException.recycle();
        return intent;
    }

    @Override // com.google.android.gms.games.internal.zzy
    public final void zzd(long j) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeLong(j);
        transactAndReadExceptionReturnVoid(GamesActivityResultCodes.RESULT_SIGN_IN_FAILED, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.games.internal.zzy
    public final void zzd(zzu zzuVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.games.zzc.zza(obtainAndWriteInterfaceToken, zzuVar);
        transactAndReadExceptionReturnVoid(22028, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.games.internal.zzy
    public final void zzd(zzu zzuVar, long j) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.games.zzc.zza(obtainAndWriteInterfaceToken, zzuVar);
        obtainAndWriteInterfaceToken.writeLong(j);
        transactAndReadExceptionReturnVoid(12011, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.games.internal.zzy
    public final void zzd(zzu zzuVar, String str) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.games.zzc.zza(obtainAndWriteInterfaceToken, zzuVar);
        obtainAndWriteInterfaceToken.writeString(str);
        transactAndReadExceptionReturnVoid(8009, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.games.internal.zzy
    public final void zzd(zzu zzuVar, boolean z) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.games.zzc.zza(obtainAndWriteInterfaceToken, zzuVar);
        com.google.android.gms.internal.games.zzc.zza(obtainAndWriteInterfaceToken, z);
        transactAndReadExceptionReturnVoid(12002, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.games.internal.zzy
    public final void zzd(String str, int i) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeString(str);
        obtainAndWriteInterfaceToken.writeInt(i);
        transactAndReadExceptionReturnVoid(5028, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.games.internal.zzy
    public final void zze(long j) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeLong(j);
        transactAndReadExceptionReturnVoid(12012, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.games.internal.zzy
    public final void zze(zzu zzuVar, long j) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.games.zzc.zza(obtainAndWriteInterfaceToken, zzuVar);
        obtainAndWriteInterfaceToken.writeLong(j);
        transactAndReadExceptionReturnVoid(22026, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.games.internal.zzy
    public final void zze(zzu zzuVar, String str) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.games.zzc.zza(obtainAndWriteInterfaceToken, zzuVar);
        obtainAndWriteInterfaceToken.writeString(str);
        transactAndReadExceptionReturnVoid(8010, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.games.internal.zzy
    public final void zze(zzu zzuVar, boolean z) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.games.zzc.zza(obtainAndWriteInterfaceToken, zzuVar);
        com.google.android.gms.internal.games.zzc.zza(obtainAndWriteInterfaceToken, z);
        transactAndReadExceptionReturnVoid(12016, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.games.internal.zzy
    public final void zzf(long j) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeLong(j);
        transactAndReadExceptionReturnVoid(22027, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.games.internal.zzy
    public final void zzf(zzu zzuVar, String str) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.games.zzc.zza(obtainAndWriteInterfaceToken, zzuVar);
        obtainAndWriteInterfaceToken.writeString(str);
        transactAndReadExceptionReturnVoid(8014, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.games.internal.zzy
    public final void zzf(zzu zzuVar, boolean z) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.games.zzc.zza(obtainAndWriteInterfaceToken, zzuVar);
        com.google.android.gms.internal.games.zzc.zza(obtainAndWriteInterfaceToken, z);
        transactAndReadExceptionReturnVoid(17001, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.games.internal.zzy
    public final void zzf(String str) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeString(str);
        transactAndReadExceptionReturnVoid(GamesStatusCodes.STATUS_QUEST_NO_LONGER_AVAILABLE, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.games.internal.zzy
    public final void zzg(zzu zzuVar, String str) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.games.zzc.zza(obtainAndWriteInterfaceToken, zzuVar);
        obtainAndWriteInterfaceToken.writeString(str);
        transactAndReadExceptionReturnVoid(12020, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.games.internal.zzy
    public final void zzh(zzu zzuVar, String str) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.games.zzc.zza(obtainAndWriteInterfaceToken, zzuVar);
        obtainAndWriteInterfaceToken.writeString(str);
        transactAndReadExceptionReturnVoid(12008, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.games.internal.zzy
    public final void zzk(int i) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeInt(i);
        transactAndReadExceptionReturnVoid(5036, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.games.internal.zzy
    public final String zzp() throws RemoteException {
        Parcel transactAndReadException = transactAndReadException(5007, obtainAndWriteInterfaceToken());
        String readString = transactAndReadException.readString();
        transactAndReadException.recycle();
        return readString;
    }

    @Override // com.google.android.gms.games.internal.zzy
    public final Intent zzv() throws RemoteException {
        Parcel transactAndReadException = transactAndReadException(GamesStatusCodes.STATUS_VIDEO_STORAGE_ERROR, obtainAndWriteInterfaceToken());
        Intent intent = (Intent) com.google.android.gms.internal.games.zzc.zza(transactAndReadException, Intent.CREATOR);
        transactAndReadException.recycle();
        return intent;
    }

    @Override // com.google.android.gms.games.internal.zzy
    public final Intent zzx() throws RemoteException {
        Parcel transactAndReadException = transactAndReadException(9005, obtainAndWriteInterfaceToken());
        Intent intent = (Intent) com.google.android.gms.internal.games.zzc.zza(transactAndReadException, Intent.CREATOR);
        transactAndReadException.recycle();
        return intent;
    }

    @Override // com.google.android.gms.games.internal.zzy
    public final Intent zzy() throws RemoteException {
        Parcel transactAndReadException = transactAndReadException(GamesStatusCodes.STATUS_VIDEO_ALREADY_CAPTURING, obtainAndWriteInterfaceToken());
        Intent intent = (Intent) com.google.android.gms.internal.games.zzc.zza(transactAndReadException, Intent.CREATOR);
        transactAndReadException.recycle();
        return intent;
    }

    @Override // com.google.android.gms.games.internal.zzy
    public final Intent zzz() throws RemoteException {
        Parcel transactAndReadException = transactAndReadException(9007, obtainAndWriteInterfaceToken());
        Intent intent = (Intent) com.google.android.gms.internal.games.zzc.zza(transactAndReadException, Intent.CREATOR);
        transactAndReadException.recycle();
        return intent;
    }
}
