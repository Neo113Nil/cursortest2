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
import com.crrepa.band.my.databinding.FragmentLocalMusicSelectTagsBinding;
import com.crrepa.band.my.device.localmusic.adapter.LocalMusicSongTagsAdapter;
import com.crrepa.band.my.device.localmusic.fragment.SelectSongsFragment;
import com.crrepa.band.my.device.localmusic.model.LocalMusicModel;
import com.crrepa.band.my.device.localmusic.model.SongBean;
import com.crrepa.band.my.device.localmusic.model.SongTagBean;
import com.crrepa.band.my.device.localmusic.x;
import com.moyoung.dafit.module.common.baseui.BaseVBFragment;
import com.moyoung.dafit.module.common.utils.x0;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import java.util.List;

/* loaded from: classes2.dex */
public class SelectTagsFragment extends BaseSelectMusicFragment<FragmentLocalMusicSelectTagsBinding> implements SelectSongsFragment.b {
    private List<SongBean> allSongList;
    private SelectSongsFragment childFragment;
    private final x childFragmentListener;
    private String currentTagName;
    private final CompositeDisposable disposableList;
    private final LocalMusicSongTagsAdapter tagsAdapter;

    class a implements TextWatcher {
        a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            TextView textView = ((FragmentLocalMusicSelectTagsBinding) ((BaseVBFragment) SelectTagsFragment.this).binding).includeSearch.tvClear;
            if (editable.length() == 0 && textView.getVisibility() == 0) {
                SelectTagsFragment selectTagsFragment = SelectTagsFragment.this;
                selectTagsFragment.renderSongList(selectTagsFragment.allSongList);
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

    public SelectTagsFragment(x xVar, int i8) {
        super(xVar, i8);
        this.disposableList = new CompositeDisposable();
        this.tagsAdapter = new LocalMusicSongTagsAdapter();
        this.childFragmentListener = new x() { // from class: com.crrepa.band.my.device.localmusic.fragment.h
            @Override // com.crrepa.band.my.device.localmusic.x
            public final void onSelectedSongChange() {
                SelectTagsFragment.this.lambda$new$5();
            }
        };
    }

    private void destroySongsFragment() {
        ((FragmentLocalMusicSelectTagsBinding) this.binding).fragmentContainer.setOnKeyListener(null);
        ((FragmentLocalMusicSelectTagsBinding) this.binding).fragmentContainer.setVisibility(8);
        ((FragmentLocalMusicSelectTagsBinding) this.binding).includeSearch.rlSearch.setVisibility(0);
        ((FragmentLocalMusicSelectTagsBinding) this.binding).rv.setVisibility(0);
        getChildFragmentManager().popBackStackImmediate();
        this.childFragment = null;
    }

    private void initRv() {
        ((FragmentLocalMusicSelectTagsBinding) this.binding).rv.setLayoutManager(new LinearLayoutManager(requireContext(), 1, false));
        ((FragmentLocalMusicSelectTagsBinding) this.binding).rv.setNestedScrollingEnabled(false);
        ((FragmentLocalMusicSelectTagsBinding) this.binding).rv.setAdapter(this.tagsAdapter);
        this.tagsAdapter.setOnItemClickListener(new OnItemClickListener() { // from class: com.crrepa.band.my.device.localmusic.fragment.g
            @Override // com.chad.library.adapter.base.listener.OnItemClickListener
            public final void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i8) {
                SelectTagsFragment.this.lambda$initRv$2(baseQuickAdapter, view, i8);
            }
        });
    }

    private void initSearchUI() {
        ((FragmentLocalMusicSelectTagsBinding) this.binding).includeSearch.tvClear.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.localmusic.fragment.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SelectTagsFragment.this.lambda$initSearchUI$3(view);
            }
        });
        ((FragmentLocalMusicSelectTagsBinding) this.binding).includeSearch.etInput.addTextChangedListener(new a());
        ((FragmentLocalMusicSelectTagsBinding) this.binding).includeSearch.etInput.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.crrepa.band.my.device.localmusic.fragment.f
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i8, KeyEvent keyEvent) {
                boolean lambda$initSearchUI$4;
                lambda$initSearchUI$4 = SelectTagsFragment.this.lambda$initSearchUI$4(textView, i8, keyEvent);
                return lambda$initSearchUI$4;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initRv$2(BaseQuickAdapter baseQuickAdapter, View view, int i8) {
        SongTagBean item = this.tagsAdapter.getItem(i8);
        if (item == null || x0.isEmpty(item.getSongList())) {
            return;
        }
        this.currentTagName = item.getName();
        renderSongsFragment();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initSearchUI$3(View view) {
        ((FragmentLocalMusicSelectTagsBinding) this.binding).includeSearch.etInput.setText("");
        renderSongList(this.allSongList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$initSearchUI$4(TextView textView, int i8, KeyEvent keyEvent) {
        if (i8 != 4) {
            return false;
        }
        searchSongList(this.allSongList, ((FragmentLocalMusicSelectTagsBinding) this.binding).includeSearch.etInput.getText().toString());
        com.crrepa.band.my.device.stock.b.hide(((FragmentLocalMusicSelectTagsBinding) this.binding).includeSearch.etInput);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$5() {
        x xVar = this.onSongsSelectListener;
        if (xVar != null) {
            xVar.onSelectedSongChange();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$renderSongsFragment$0(List list) {
        this.childFragment.renderSongList(list);
        x xVar = this.onSongsSelectListener;
        if (xVar != null) {
            xVar.onSelectedSongChange();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$renderSongsFragment$1(View view, int i8, KeyEvent keyEvent) {
        if (i8 != 4) {
            return false;
        }
        destroySongsFragment();
        return true;
    }

    private void renderSongsFragment() {
        this.childFragment = new SelectSongsFragment(this.childFragmentListener, this);
        getChildFragmentManager().beginTransaction().replace(R.id.fragmentContainer, this.childFragment).commit();
        ((FragmentLocalMusicSelectTagsBinding) this.binding).fragmentContainer.setVisibility(0);
        ((FragmentLocalMusicSelectTagsBinding) this.binding).includeSearch.rlSearch.setVisibility(8);
        ((FragmentLocalMusicSelectTagsBinding) this.binding).rv.setVisibility(8);
        this.disposableList.add(LocalMusicModel.querySongListByTag(this.allSongList, this.songTagType, this.currentTagName).subscribe(new Consumer() { // from class: com.crrepa.band.my.device.localmusic.fragment.i
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                SelectTagsFragment.this.lambda$renderSongsFragment$0((List) obj);
            }
        }));
        requestFragmentContainerFocus();
        ((FragmentLocalMusicSelectTagsBinding) this.binding).fragmentContainer.setOnKeyListener(new View.OnKeyListener() { // from class: com.crrepa.band.my.device.localmusic.fragment.j
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i8, KeyEvent keyEvent) {
                boolean lambda$renderSongsFragment$1;
                lambda$renderSongsFragment$1 = SelectTagsFragment.this.lambda$renderSongsFragment$1(view, i8, keyEvent);
                return lambda$renderSongsFragment$1;
            }
        });
    }

    private void requestFragmentContainerFocus() {
        ((FragmentLocalMusicSelectTagsBinding) this.binding).fragmentContainer.setFocusableInTouchMode(true);
        ((FragmentLocalMusicSelectTagsBinding) this.binding).fragmentContainer.requestFocus();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBFragment
    protected void initBinding() {
        super.initBinding();
        initRv();
        initSearchUI();
    }

    @Override // com.crrepa.band.my.device.localmusic.fragment.SelectSongsFragment.b
    public void onComplete() {
        requestFragmentContainerFocus();
    }

    @Override // com.crrepa.band.my.device.localmusic.fragment.BaseSelectMusicFragment, com.moyoung.dafit.module.common.baseui.BaseFragement, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.disposableList.clear();
    }

    @Override // com.crrepa.band.my.device.localmusic.fragment.BaseSelectMusicFragment
    public void renderNoData() {
        ((FragmentLocalMusicSelectTagsBinding) this.binding).includeNoData.rlEmpty.setVisibility(0);
        ((FragmentLocalMusicSelectTagsBinding) this.binding).rv.setVisibility(4);
    }

    @Override // com.crrepa.band.my.device.localmusic.fragment.BaseSelectMusicFragment
    @SuppressLint({"NotifyDataSetChanged"})
    public void renderSearchSongList(List<SongBean> list) {
        if (x0.isEmpty(list)) {
            renderNoData();
            return;
        }
        ((FragmentLocalMusicSelectTagsBinding) this.binding).includeNoData.rlEmpty.setVisibility(8);
        ((FragmentLocalMusicSelectTagsBinding) this.binding).rv.setVisibility(0);
        this.tagsAdapter.setNewData(LocalMusicModel.sortToSongTagList(list, this.songTagType));
        this.tagsAdapter.notifyDataSetChanged();
    }

    @Override // com.crrepa.band.my.device.localmusic.fragment.BaseSelectMusicFragment
    public void renderSelectedUI(List<SongBean> list) {
        SelectSongsFragment selectSongsFragment = this.childFragment;
        if (selectSongsFragment != null) {
            selectSongsFragment.renderSelectedUI(this.songTagType, this.currentTagName, list);
        }
    }

    @Override // com.crrepa.band.my.device.localmusic.fragment.BaseSelectMusicFragment
    @SuppressLint({"NotifyDataSetChanged"})
    public void renderSongList(List<SongBean> list) {
        this.allSongList = list;
        ((FragmentLocalMusicSelectTagsBinding) this.binding).includeNoData.rlEmpty.setVisibility(8);
        ((FragmentLocalMusicSelectTagsBinding) this.binding).rv.setVisibility(0);
        this.tagsAdapter.setNewData(LocalMusicModel.sortToSongTagList(list, this.songTagType));
        this.tagsAdapter.notifyDataSetChanged();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBFragment, com.moyoung.dafit.module.common.baseui.BaseFragement, androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z7) {
        SelectSongsFragment selectSongsFragment;
        super.setUserVisibleHint(z7);
        if (!z7 || (selectSongsFragment = this.childFragment) == null) {
            return;
        }
        selectSongsFragment.setUserVisibleHint(true);
        requestFragmentContainerFocus();
    }
}
