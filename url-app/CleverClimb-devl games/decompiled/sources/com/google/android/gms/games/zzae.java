package com.google.android.gms.games;

import com.google.android.gms.common.internal.PendingResultUtil;
import com.google.android.gms.games.leaderboard.Leaderboards;
import com.google.android.gms.games.leaderboard.ScoreSubmissionData;

/* loaded from: classes.dex */
final class zzae implements PendingResultUtil.ResultConverter<Leaderboards.SubmitScoreResult, ScoreSubmissionData> {
    zzae() {
    }

    @Override // com.google.android.gms.common.internal.PendingResultUtil.ResultConverter
    public final /* synthetic */ ScoreSubmissionData convert(Leaderboards.SubmitScoreResult submitScoreResult) {
        Leaderboards.SubmitScoreResult submitScoreResult2 = submitScoreResult;
        if (submitScoreResult2 == null) {
            return null;
        }
        return submitScoreResult2.getScoreData();
    }
}
