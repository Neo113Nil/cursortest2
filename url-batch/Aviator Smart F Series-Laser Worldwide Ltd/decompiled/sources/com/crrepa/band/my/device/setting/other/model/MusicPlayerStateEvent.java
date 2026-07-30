package com.crrepa.band.my.device.setting.other.model;

import com.crrepa.band.my.model.band.provider.BandMusicPlayerProvider;

/* loaded from: classes2.dex */
public class MusicPlayerStateEvent {
    public boolean isEnable() {
        return BandMusicPlayerProvider.getMusicPlayerState();
    }
}
