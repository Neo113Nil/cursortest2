package com.crrepa.band.my.device.localmusic.model;

import cn.hutool.core.text.l;
import com.crrepa.band.aviator.R;
import java.util.List;

/* loaded from: classes2.dex */
public class SongTagBean {
    public static final int ALBUM = 2;
    public static final int ALL = -1;
    public static final int ARTIST = 1;
    public static final int TITLE = 0;
    String name;
    List<SongBean> songList;
    int tagType;

    public String getName() {
        return this.name;
    }

    public List<SongBean> getSongList() {
        return this.songList;
    }

    public String getSongsCount() {
        List<SongBean> list = this.songList;
        return (list == null ? 0 : list.size()) + l.SPACE + com.moyoung.dafit.module.common.utils.d.get().getString(R.string.device_local_music_songs_unit_android);
    }
}
