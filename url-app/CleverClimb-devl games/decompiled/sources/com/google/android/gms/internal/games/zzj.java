package com.google.android.gms.internal.games;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.games.achievement.Achievements;

/* loaded from: classes2.dex */
final class zzj extends zzr {
    private final /* synthetic */ String val$id;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzj(zzf zzfVar, String str, GoogleApiClient googleApiClient, String str2) {
        super(str, googleApiClient);
        this.val$id = str2;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* synthetic */ void doExecute(com.google.android.gms.games.internal.zze zzeVar) throws RemoteException {
        zzeVar.zzb((BaseImplementation.ResultHolder<Achievements.UpdateAchievementResult>) null, this.val$id);
    }
}
