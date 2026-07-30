package com.crrepa.band.my.device.localmusic.adapter;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.crrepa.band.aviator.R;

/* loaded from: classes2.dex */
public class LocalMusicSavedSongsAdapter extends BaseQuickAdapter<String, BaseViewHolder> {
    public LocalMusicSavedSongsAdapter() {
        super(R.layout.item_local_music_saved_song);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void convert(BaseViewHolder baseViewHolder, String str) {
        baseViewHolder.setText(R.id.tv_title, str.substring(0, str.lastIndexOf(".")));
    }
}
