package com.crrepa.band.my.device.localmusic.adapter;

import android.widget.CheckBox;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.device.localmusic.model.SongBean;

/* loaded from: classes2.dex */
public class LocalMusicSelectSongsAdapter extends BaseQuickAdapter<SongBean, BaseViewHolder> {
    public LocalMusicSelectSongsAdapter() {
        super(R.layout.item_local_music_select_song);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void convert(BaseViewHolder baseViewHolder, SongBean songBean) {
        baseViewHolder.setText(R.id.tv_title, songBean.getTitle());
        baseViewHolder.setText(R.id.tv_artist, songBean.getArtist());
        CheckBox checkBox = (CheckBox) baseViewHolder.getView(R.id.cb_select);
        checkBox.setSelected(songBean.isSelected);
        checkBox.setEnabled(!songBean.isSavedToBand);
    }
}
