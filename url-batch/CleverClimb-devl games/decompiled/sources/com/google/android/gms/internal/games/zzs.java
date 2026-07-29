package com.google.android.gms.internal.games;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.achievement.Achievements;

/* loaded from: classes2.dex */
final class zzs implements Achievements.UpdateAchievementResult {
    private final /* synthetic */ Status zzbc;
    private final /* synthetic */ zzr zzjj;

    zzs(zzr zzrVar, Status status) {
        this.zzjj = zzrVar;
        this.zzbc = status;
    }

    @Override // com.google.android.gms.games.achievement.Achievements.UpdateAchievementResult
    public final String getAchievementId() {
        String str;
        str = this.zzjj.zzji;
        return str;
    }

    @Override // com.google.android.gms.common.api.Result
    public final Status getStatus() {
        return this.zzbc;
    }
}
