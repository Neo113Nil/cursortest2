package com.chartboost.sdk.impl;

import android.content.Context;
import androidx.media3.exoplayer.ExoPlayer;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c6 implements f8 {
    @Override // com.chartboost.sdk.impl.f8
    public ExoPlayer a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        ExoPlayer build = new ExoPlayer.Builder(context).build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }
}
