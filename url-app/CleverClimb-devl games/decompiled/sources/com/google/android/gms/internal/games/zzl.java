package com.google.android.gms.internal.games;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.games.achievement.Achievements;

/* loaded from: classes2.dex */
final class zzl extends zzr {
    private final /* synthetic */ String val$id;
    private final /* synthetic */ int zzjh;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzl(zzf zzfVar, String str, GoogleApiClient googleApiClient, String str2, int i) {
        super(str, googleApiClient);
        this.val$id = str2;
        this.zzjh = i;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* synthetic */ void doExecute(com.google.android.gms.games.internal.zze zzeVar) throws RemoteException {
        zzeVar.zza((BaseImplementation.ResultHolder<Achievements.UpdateAchievementResult>) null, this.val$id, this.zzjh);
    }
}
