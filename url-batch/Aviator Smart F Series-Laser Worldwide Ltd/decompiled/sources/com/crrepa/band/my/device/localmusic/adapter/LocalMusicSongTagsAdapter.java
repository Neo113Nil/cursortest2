package com.crrepa.band.my.device.localmusic.adapter;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.device.localmusic.model.SongTagBean;

/* loaded from: classes2.dex */
public class LocalMusicSongTagsAdapter extends BaseQuickAdapter<SongTagBean, BaseViewHolder> {
    public LocalMusicSongTagsAdapter() {
        super(R.layout.item_local_music_select_tag);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void convert(BaseViewHolder baseViewHolder, SongTagBean songTagBean) {
        baseViewHolder.setText(R.id.tv_title, songTagBean.getName());
        baseViewHolder.setText(R.id.tv_count, songTagBean.getSongsCount());
    }
}
