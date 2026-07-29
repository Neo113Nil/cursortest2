package com.google.android.gms.games;

import com.google.android.gms.common.internal.PendingResultUtil;
import com.google.android.gms.games.video.VideoCapabilities;
import com.google.android.gms.games.video.Videos;

/* loaded from: classes.dex */
final class zzdc implements PendingResultUtil.ResultConverter<Videos.CaptureCapabilitiesResult, VideoCapabilities> {
    zzdc() {
    }

    @Override // com.google.android.gms.common.internal.PendingResultUtil.ResultConverter
    public final /* synthetic */ VideoCapabilities convert(Videos.CaptureCapabilitiesResult captureCapabilitiesResult) {
        Videos.CaptureCapabilitiesResult captureCapabilitiesResult2 = captureCapabilitiesResult;
        if (captureCapabilitiesResult2 == null) {
            return null;
        }
        return captureCapabilitiesResult2.getCapabilities();
    }
}
