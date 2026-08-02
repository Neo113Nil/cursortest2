package com.squareup.cash.video.views;

import android.app.job.JobInfo;
import android.net.NetworkRequest;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.squareup.cash.clientroutes.ClientRoute;
import kotlin.collections.EmptyList;

/* loaded from: classes5.dex */
public abstract class ExoPlayerExtensionsKt {
    public static final String asString(AnalyticsListener.EventTime eventTime) {
        long j = eventTime.realtimeMs;
        int i = eventTime.windowIndex;
        long j2 = eventTime.eventPlaybackPositionMs;
        long j3 = eventTime.currentPlaybackPositionMs;
        long j4 = eventTime.totalBufferedDurationMs;
        StringBuilder sb = new StringBuilder("(realtimeMs=");
        sb.append(j);
        sb.append(", windowIndex=");
        sb.append(i);
        Boxes$$ExternalSyntheticOutline1.m1151m(j2, " eventPlaybackPositionMs=", " currentPlaybackPositionMs=", sb);
        sb.append(j3);
        return Boxes$$ExternalSyntheticOutline1.m(j4, " totalBufferedDurationMs=", ")", sb);
    }

    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.ViewBorrowAmountPickerDeprecated.deepLinkSpecs;
    }

    public static final void setRequiredNetworkRequest(JobInfo.Builder builder, NetworkRequest networkRequest) {
        builder.getClass();
        builder.setRequiredNetwork(networkRequest);
    }
}
