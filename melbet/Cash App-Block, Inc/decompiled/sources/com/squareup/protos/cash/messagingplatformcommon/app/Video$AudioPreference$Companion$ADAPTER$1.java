package com.squareup.protos.cash.messagingplatformcommon.app;

import com.squareup.protos.cash.messagingplatformcommon.app.Video;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class Video$AudioPreference$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        Video.AudioPreference.Companion.getClass();
        if (i == 1) {
            return Video.AudioPreference.NO_AUDIO;
        }
        if (i == 2) {
            return Video.AudioPreference.START_MUTED;
        }
        if (i != 3) {
            return null;
        }
        return Video.AudioPreference.MATCH_DEVICE;
    }
}
