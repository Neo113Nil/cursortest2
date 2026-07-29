package com.google.android.gms.games;

import com.google.android.gms.common.internal.PendingResultUtil;
import com.google.android.gms.games.video.Videos;

/* loaded from: classes.dex */
final class zzda implements PendingResultUtil.ResultConverter<Videos.CaptureAvailableResult, Boolean> {
    zzda() {
    }

    @Override // com.google.android.gms.common.internal.PendingResultUtil.ResultConverter
    public final /* synthetic */ Boolean convert(Videos.CaptureAvailableResult captureAvailableResult) {
        Videos.CaptureAvailableResult captureAvailableResult2 = captureAvailableResult;
        return Boolean.valueOf(captureAvailableResult2 == null ? false : captureAvailableResult2.isAvailable());
    }
}
