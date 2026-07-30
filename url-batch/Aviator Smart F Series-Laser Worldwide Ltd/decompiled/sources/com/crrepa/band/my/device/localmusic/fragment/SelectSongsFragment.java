package com.crrepa.band.my.device.localmusic.fragment;

import android.annotation.SuppressLint;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.databinding.FragmentLocalMusicSelectSongsBinding;
import com.crrepa.band.my.device.localmusic.adapter.LocalMusicSelectSongsAdapter;
import com.crrepa.band.my.device.localmusic.model.SongBean;
import com.crrepa.band.my.device.localmusic.x;
import com.moyoung.dafit.module.common.baseui.BaseVBFragment;
import com.moyoung.dafit.module.common.utils.r0;
import com.moyoung.dafit.module.common.utils.x0;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class SelectSongsFragment extends BaseSelectMusicFragment<FragmentLocalMusicSelectSongsBinding> {
    private List<SongBean> allSongList;
    private boolean isFromTagsFragment;
    private b onSearchListener;
    private int selectedSongsStorageSize;
    private final LocalMusicSelectSongsAdapter songsAdapter;

    class a implements TextWatcher {
        a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            TextView textView = ((FragmentLocalMusicSelectSongsBinding) ((BaseVBFragment) SelectSongsFragment.this).binding).includeSearch.tvClear;
            if (editable.length() == 0 && textView.getVisibility() == 0) {
                SelectSongsFragment.this.renderSearchClearUI();
            }
            textView.setVisibility(editable.length() == 0 ? 8 : 0);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
        }
    }

    public interface b {
        void onComplete();
    }

    public SelectSongsFragment(x xVar) {
        super(xVar, 0);
        this.isFromTagsFragment = false;
        this.songsAdapter = new LocalMusicSelectSongsAdapter();
    }

    private boolean cannotSelect(SongBean songBean) {
        if (songBean.isSelected) {
            return false;
        }
        return this.selectedSongsStorageSize + songBean.getSize() > com.crrepa.band.my.device.localmusic.i.getAvailableSize() * 1024;
    }

    private void initRv() {
        ((FragmentLocalMusicSelectSongsBinding) this.binding).rv.setLayoutManager(new LinearLayoutManager(requireContext(), 1, false));
        ((FragmentLocalMusicSelectSongsBinding) this.binding).rv.setNestedScrollingEnabled(false);
        ((FragmentLocalMusicSelectSongsBinding) this.binding).rv.setAdapter(this.songsAdapter);
        this.songsAdapter.setOnItemClickListener(new OnItemClickListener() { // from class: com.crrepa.band.my.device.localmusic.fragment.d
            @Override // com.chad.library.adapter.base.listener.OnItemClickListener
            public final void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i8) {
                SelectSongsFragment.this.lambda$initRv$0(baseQuickAdapter, view, i8);
            }
        });
    }

    private void initSearchUI() {
        ((FragmentLocalMusicSelectSongsBinding) this.binding).includeSearch.tvClear.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.localmusic.fragment.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SelectSongsFragment.this.lambda$initSearchUI$1(view);
            }
        });
        ((FragmentLocalMusicSelectSongsBinding) this.binding).includeSearch.etInput.addTextChangedListener(new a());
        ((FragmentLocalMusicSelectSongsBinding) this.binding).includeSearch.etInput.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.crrepa.band.my.device.localmusic.fragment.c
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i8, KeyEvent keyEvent) {
                boolean lambda$initSearchUI$2;
                lambda$initSearchUI$2 = SelectSongsFragment.this.lambda$initSearchUI$2(textView, i8, keyEvent);
                return lambda$initSearchUI$2;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initRv$0(BaseQuickAdapter baseQuickAdapter, View view, int i8) {
        SongBean item = this.songsAdapter.getItem(i8);
        if (item == null || item.isSavedToBand) {
            return;
        }
        if (cannotSelect(item)) {
            r0.showShort(requireContext(), getString(R.string.device_local_music_out_memory_tips));
            return;
        }
        item.setSelected(!item.isSelected);
        this.songsAdapter.notifyItemChanged(i8);
        x xVar = this.onSongsSelectListener;
        if (xVar != null) {
            xVar.onSelectedSongChange();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initSearchUI$1(View view) {
        ((FragmentLocalMusicSelectSongsBinding) this.binding).includeSearch.etInput.setText("");
        renderSearchClearUI();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$initSearchUI$2(TextView textView, int i8, KeyEvent keyEvent) {
        if (i8 != 4) {
            return false;
        }
        searchSongList(this.songsAdapter.getData(), ((FragmentLocalMusicSelectSongsBinding) this.binding).includeSearch.etInput.getText().toString());
        com.crrepa.band.my.device.stock.b.hide(((FragmentLocalMusicSelectSongsBinding) this.binding).includeSearch.etInput);
        b bVar = this.onSearchListener;
        if (bVar == null) {
            return true;
        }
        bVar.onComplete();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void renderSearchClearUI() {
        renderSongList(this.allSongList);
        b bVar = this.onSearchListener;
        if (bVar != null) {
            bVar.onComplete();
        }
    }

    private void resetSelectedSongsStorageSize(List<SongBean> list) {
        this.selectedSongsStorageSize = 0;
        if (x0.isEmpty(list)) {
            return;
        }
        Iterator<SongBean> it = list.iterator();
        while (it.hasNext()) {
            this.selectedSongsStorageSize += it.next().getSize();
        }
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBFragment
    protected void initBinding() {
        super.initBinding();
        initRv();
        initSearchUI();
        if (this.isFromTagsFragment) {
            ((FragmentLocalMusicSelectSongsBinding) this.binding).tvSelectedTagTitle.setVisibility(0);
            ((FragmentLocalMusicSelectSongsBinding) this.binding).lineSelectedTagTitle.setVisibility(0);
        }
    }

    @Override // com.crrepa.band.my.device.localmusic.fragment.BaseSelectMusicFragment
    public void renderNoData() {
        ((FragmentLocalMusicSelectSongsBinding) this.binding).includeNoData.rlEmpty.setVisibility(0);
        ((FragmentLocalMusicSelectSongsBinding) this.binding).rv.setVisibility(4);
    }

    @Override // com.crrepa.band.my.device.localmusic.fragment.BaseSelectMusicFragment
    @SuppressLint({"NotifyDataSetChanged"})
    public void renderSearchSongList(List<SongBean> list) {
        if (x0.isEmpty(list)) {
            renderNoData();
            return;
        }
        ((FragmentLocalMusicSelectSongsBinding) this.binding).includeNoData.rlEmpty.setVisibility(8);
        ((FragmentLocalMusicSelectSongsBinding) this.binding).rv.setVisibility(0);
        this.songsAdapter.setNewData(list);
        this.songsAdapter.notifyDataSetChanged();
    }

    @Override // com.crrepa.band.my.device.localmusic.fragment.BaseSelectMusicFragment
    public void renderSelectedUI(List<SongBean> list) {
        resetSelectedSongsStorageSize(list);
    }

    @Override // com.crrepa.band.my.device.localmusic.fragment.BaseSelectMusicFragment
    @SuppressLint({"NotifyDataSetChanged"})
    public void renderSongList(List<SongBean> list) {
        this.allSongList = list;
        ((FragmentLocalMusicSelectSongsBinding) this.binding).includeNoData.rlEmpty.setVisibility(8);
        ((FragmentLocalMusicSelectSongsBinding) this.binding).rv.setVisibility(0);
        this.songsAdapter.setNewData(list);
        this.songsAdapter.notifyDataSetChanged();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBFragment, com.moyoung.dafit.module.common.baseui.BaseFragement, androidx.fragment.app.Fragment
    @SuppressLint({"NotifyDataSetChanged"})
    public void setUserVisibleHint(boolean z7) {
        super.setUserVisibleHint(z7);
        if (this.isFirstVisible || !z7) {
            return;
        }
        this.songsAdapter.notifyDataSetChanged();
    }

    @Override // com.crrepa.band.my.device.localmusic.fragment.BaseSelectMusicFragment
    public void renderSelectedUI(int i8, String str, List<SongBean> list) {
        renderSelectedUI(list);
        ((FragmentLocalMusicSelectSongsBinding) this.binding).tvSelectedTagTitle.setText((i8 == 1 ? getString(R.string.device_local_music_artists_title_android) : getString(R.string.device_local_music_albums_title_android)) + ">" + str);
    }

    public SelectSongsFragment(x xVar, b bVar) {
        super(xVar, 0);
        this.isFromTagsFragment = false;
        this.songsAdapter = new LocalMusicSelectSongsAdapter();
        this.onSearchListener = bVar;
        this.isFromTagsFragment = true;
    }
}
