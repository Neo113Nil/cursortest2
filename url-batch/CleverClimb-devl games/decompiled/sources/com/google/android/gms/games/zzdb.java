package com.google.android.gms.games;

import com.google.android.gms.common.internal.PendingResultUtil;
import com.google.android.gms.games.video.CaptureState;
import com.google.android.gms.games.video.Videos;

/* loaded from: classes.dex */
final class zzdb implements PendingResultUtil.ResultConverter<Videos.CaptureStateResult, CaptureState> {
    zzdb() {
    }

    @Override // com.google.android.gms.common.internal.PendingResultUtil.ResultConverter
    public final /* synthetic */ CaptureState convert(Videos.CaptureStateResult captureStateResult) {
        Videos.CaptureStateResult captureStateResult2 = captureStateResult;
        if (captureStateResult2 == null) {
            return null;
        }
        return captureStateResult2.getCaptureState();
    }
}
