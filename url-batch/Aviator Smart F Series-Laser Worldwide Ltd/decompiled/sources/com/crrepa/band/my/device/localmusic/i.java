package com.crrepa.band.my.device.localmusic;

import com.crrepa.band.my.ble.band.cmd.i4;

/* loaded from: classes2.dex */
public class i {
    private static final String AVAILABLE_SIZE = "available_size_local_music";
    private static final String MUSIC_SAVED_COUNT = "music_saved_count";

    public static void delete() {
        com.moyoung.dafit.module.common.network.provider.g.getInstance().remove(MUSIC_SAVED_COUNT);
        com.moyoung.dafit.module.common.network.provider.g.getInstance().remove(AVAILABLE_SIZE);
    }

    public static int getAvailableSize() {
        return com.moyoung.dafit.module.common.network.provider.g.getInstance().getInt(AVAILABLE_SIZE, 0);
    }

    public static int getMusicSavedCount() {
        return com.moyoung.dafit.module.common.network.provider.g.getInstance().getInt(MUSIC_SAVED_COUNT, -1);
    }

    public static boolean isSupport() {
        return getMusicSavedCount() >= 0;
    }

    public static void queryMusicSavedNames() {
        int musicSavedCount = getMusicSavedCount();
        for (int i8 = 0; i8 < musicSavedCount; i8++) {
            i4.getInstance().queryMusicName(i8);
        }
    }

    public static void saveAvailableSize(int i8) {
        com.moyoung.dafit.module.common.network.provider.g.getInstance().putInt(AVAILABLE_SIZE, i8);
    }

    public static void saveMusicSavedCount(int i8) {
        com.moyoung.dafit.module.common.network.provider.g.getInstance().putInt(MUSIC_SAVED_COUNT, i8);
    }
}
