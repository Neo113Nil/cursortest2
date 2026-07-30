package com.crrepa.band.my.device.localmusic.model.event;

import java.util.List;

/* loaded from: classes2.dex */
public class SavedMusicListEvent {
    public final List<String> savedSongList;

    public SavedMusicListEvent(List<String> list) {
        this.savedSongList = list;
    }
}
