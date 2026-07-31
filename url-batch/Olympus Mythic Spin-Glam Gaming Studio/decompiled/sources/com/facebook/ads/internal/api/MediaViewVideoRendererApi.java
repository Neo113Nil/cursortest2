package com.facebook.ads.internal.api;

import android.view.View;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.Keep;
import com.facebook.ads.MediaViewVideoRenderer;
import com.facebook.ads.VideoStartReason;

@Keep
/* loaded from: classes11.dex */
public interface MediaViewVideoRendererApi extends AdComponentViewApiProvider {
    void destroy();

    void disengageSeek(VideoStartReason videoStartReason);

    void engageSeek();

    @IntRange
    int getCurrentTimeMs();

    @IntRange
    int getDuration();

    View getVideoView();

    @FloatRange
    float getVolume();

    void initialize(AdViewConstructorParams adViewConstructorParams, MediaViewVideoRenderer mediaViewVideoRenderer);

    void pause(boolean z);

    void play(VideoStartReason videoStartReason);

    void seekTo(@IntRange int i);

    void setVolume(@FloatRange float f);

    boolean shouldAutoplay();
}
