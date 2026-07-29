package com.google.android.gms.internal.games;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.games.multiplayer.ParticipantResult;

/* loaded from: classes2.dex */
final class zzdh extends zzdw {
    private final /* synthetic */ String zzew;
    private final /* synthetic */ byte[] zzkj;
    private final /* synthetic */ ParticipantResult[] zzkl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzdh(zzdb zzdbVar, GoogleApiClient googleApiClient, String str, byte[] bArr, ParticipantResult[] participantResultArr) {
        super(googleApiClient, null);
        this.zzew = str;
        this.zzkj = bArr;
        this.zzkl = participantResultArr;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* synthetic */ void doExecute(com.google.android.gms.games.internal.zze zzeVar) throws RemoteException {
        zzeVar.zza(this, this.zzew, this.zzkj, this.zzkl);
    }
}
