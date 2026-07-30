package com.crrepa.band.my.device.localmusic.fragment;

import androidx.viewbinding.ViewBinding;
import com.crrepa.band.my.device.localmusic.model.LocalMusicModel;
import com.crrepa.band.my.device.localmusic.model.SongBean;
import com.crrepa.band.my.device.localmusic.x;
import com.moyoung.dafit.module.common.baseui.BaseVBFragment;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class BaseSelectMusicFragment<VB extends ViewBinding> extends BaseVBFragment<VB> {
    private final CompositeDisposable disposableList = new CompositeDisposable();
    public x onSongsSelectListener;
    public final int songTagType;

    public BaseSelectMusicFragment(x xVar, int i8) {
        this.onSongsSelectListener = xVar;
        this.songTagType = i8;
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseFragement, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.disposableList.clear();
    }

    public abstract void renderNoData();

    public abstract void renderSearchSongList(List<SongBean> list);

    public void renderSelectedUI(int i8, String str, List<SongBean> list) {
    }

    public abstract void renderSelectedUI(List<SongBean> list);

    public abstract void renderSongList(List<SongBean> list);

    public void searchSongList(List<SongBean> list, String str) {
        this.disposableList.add(LocalMusicModel.searchSongList(list, this.songTagType, str).subscribe(new Consumer() { // from class: com.crrepa.band.my.device.localmusic.fragment.a
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                BaseSelectMusicFragment.this.renderSearchSongList((List) obj);
            }
        }));
    }
}
