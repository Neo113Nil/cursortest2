package com.crrepa.band.my.model.band.provider;

import com.crrepa.band.my.ble.band.utils.a;
import com.crrepa.band.my.model.storage.BaseParamNames;
import com.moyoung.dafit.module.common.network.provider.g;

/* loaded from: classes2.dex */
public class BandMusicPlayerProvider {
    private BandMusicPlayerProvider() {
    }

    public static boolean getMusicPlayerState() {
        return getRealMusicPlayerState() || a.getInstance().isHisilicon();
    }

    public static boolean getRealMusicPlayerState() {
        return g.getInstance().getBoolean(BaseParamNames.MUSIC_PLAY, false);
    }

    public static void saveMusicPlayerState(boolean z7) {
        g.getInstance().putBoolean(BaseParamNames.MUSIC_PLAY, z7);
    }
}
