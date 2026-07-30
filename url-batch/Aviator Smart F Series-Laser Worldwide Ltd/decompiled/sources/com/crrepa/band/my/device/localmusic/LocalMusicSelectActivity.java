package com.crrepa.band.my.device.localmusic;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.View;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.CustomConfirmDialog;
import com.crrepa.band.my.R$drawable;
import com.crrepa.band.my.ble.band.cmd.i4;
import com.crrepa.band.my.databinding.ActivityLocalMusicSelectBinding;
import com.crrepa.band.my.device.localmusic.MusicUploadingDialog;
import com.crrepa.band.my.device.localmusic.fragment.BaseSelectMusicFragment;
import com.crrepa.band.my.device.localmusic.fragment.SelectSongsFragment;
import com.crrepa.band.my.device.localmusic.fragment.SelectTagsFragment;
import com.crrepa.band.my.device.localmusic.model.LocalMusicModel;
import com.crrepa.band.my.device.localmusic.model.SongBean;
import com.crrepa.band.my.device.localmusic.model.event.SavedMusicListEvent;
import com.crrepa.band.my.model.band.provider.BandBatteryProvider;
import com.google.android.material.tabs.TabLayout;
import com.moyoung.dafit.module.common.baseui.BaseVBActivity;
import com.moyoung.dafit.module.common.utils.k0;
import com.moyoung.dafit.module.common.utils.o0;
import com.moyoung.dafit.module.common.utils.r0;
import com.moyoung.dafit.module.common.utils.x0;
import com.moyoung.dafit.module.common.widgets.ContentPagerAdapter;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes2.dex */
public class LocalMusicSelectActivity extends BaseVBActivity<ActivityLocalMusicSelectBinding> implements x {
    private static final String KEY_SAVED_SONG_LIST = "key_saved_song_list";
    private static final int[] textArray = {R.string.device_local_music_songs_title_android, R.string.device_local_music_artists_title_android, R.string.device_local_music_albums_title_android};
    private List<SongBean> allSongList;
    private List<String> savedSongList;
    private List<BaseSelectMusicFragment<?>> selectFragmentList;
    private final CompositeDisposable disposableList = new CompositeDisposable();
    private List<SongBean> selectedSongList = new ArrayList();

    class a implements MusicUploadingDialog.a {
        a() {
        }

        @Override // com.crrepa.band.my.device.localmusic.MusicUploadingDialog.a
        public void onCanceled() {
            LocalMusicSelectActivity.this.finish();
        }

        @Override // com.crrepa.band.my.device.localmusic.MusicUploadingDialog.a
        public void onCompleted() {
            LocalMusicSelectActivity.this.finish();
        }

        @Override // com.crrepa.band.my.device.localmusic.MusicUploadingDialog.a
        public void onLastSongFailed() {
            LocalMusicSelectActivity.this.showUploadFailedDialog();
        }
    }

    private List<BaseSelectMusicFragment<?>> createSelectFragmentList() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new SelectSongsFragment(this));
        arrayList.add(new SelectTagsFragment(this, 1));
        arrayList.add(new SelectTagsFragment(this, 2));
        return arrayList;
    }

    private void initViewPager() {
        ContentPagerAdapter contentPagerAdapter = new ContentPagerAdapter(getSupportFragmentManager());
        this.selectFragmentList = createSelectFragmentList();
        contentPagerAdapter.setContentFragments(new ArrayList(this.selectFragmentList));
        ((ActivityLocalMusicSelectBinding) this.binding).vp.setAdapter(contentPagerAdapter);
        ((ActivityLocalMusicSelectBinding) this.binding).vp.setOffscreenPageLimit(this.selectFragmentList.size());
        ((ActivityLocalMusicSelectBinding) this.binding).tab.setTabMode(1);
        VB vb = this.binding;
        ((ActivityLocalMusicSelectBinding) vb).tab.setupWithViewPager(((ActivityLocalMusicSelectBinding) vb).vp);
        int size = this.selectFragmentList.size();
        for (int i8 = 0; i8 < size; i8++) {
            TabLayout.Tab tabAt = ((ActivityLocalMusicSelectBinding) this.binding).tab.getTabAt(i8);
            if (tabAt != null) {
                tabAt.setText(textArray[i8]);
            }
            Objects.requireNonNull(tabAt);
            o0.hideTabToast(tabAt);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$0(View view) {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$1(View view) {
        if (com.crrepa.band.my.ble.band.connect.f.getInstance().isDisConnected()) {
            renderBandDisconnected();
        } else if (BandBatteryProvider.isOtaLowBattery()) {
            renderLowBatteryHint();
        } else {
            if (x0.isEmpty(this.selectedSongList)) {
                return;
            }
            showUploadDialog();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$queryLocalSongList$2(List list) {
        this.allSongList = list;
        ((ActivityLocalMusicSelectBinding) this.binding).tab.postDelayed(new Runnable() { // from class: com.crrepa.band.my.device.localmusic.o
            @Override // java.lang.Runnable
            public final void run() {
                LocalMusicSelectActivity.this.renderSongList();
            }
        }, 100L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$showUploadDialog$3(DialogInterface dialogInterface, int i8, KeyEvent keyEvent) {
        return i8 == 4 && keyEvent.getAction() == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showUploadDialog$4(DialogInterface dialogInterface) {
        getWindow().clearFlags(128);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showUploadFailedDialog$5(DialogInterface dialogInterface) {
        finish();
    }

    private void queryLocalSongList(List<String> list) {
        this.disposableList.add(LocalMusicModel.queryAllSongList(list).subscribe(new Consumer() { // from class: com.crrepa.band.my.device.localmusic.j
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                LocalMusicSelectActivity.this.lambda$queryLocalSongList$2((List) obj);
            }
        }, new Consumer() { // from class: com.crrepa.band.my.device.localmusic.k
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                LocalMusicSelectActivity.this.renderError((Throwable) obj);
            }
        }));
    }

    private void querySelectedSongList() {
        this.disposableList.add(LocalMusicModel.querySelectedSongList(this.allSongList).subscribe(new Consumer() { // from class: com.crrepa.band.my.device.localmusic.p
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                LocalMusicSelectActivity.this.renderSelectedSongsData((List) obj);
            }
        }));
    }

    private void renderBandDisconnected() {
        getPageLoadingUI().hide();
        r0.showShort(this, getString(R.string.band_setting_send_fail));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void renderError(Throwable th) {
    }

    private void renderLowBatteryHint() {
        r0.showLong(this, getString(R.string.measure_low_battery_hint));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void renderSelectedSongsData(List<SongBean> list) {
        this.selectedSongList = list;
        if (x0.isEmpty(list)) {
            ((ActivityLocalMusicSelectBinding) this.binding).tvSave.setVisibility(8);
        } else {
            ((ActivityLocalMusicSelectBinding) this.binding).tvSave.setText(getString(R.string.confirm) + "(" + list.size() + ")");
            ((ActivityLocalMusicSelectBinding) this.binding).tvSave.setVisibility(0);
        }
        Iterator<BaseSelectMusicFragment<?>> it = this.selectFragmentList.iterator();
        while (it.hasNext()) {
            it.next().renderSelectedUI(list);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void renderSongList() {
        boolean isEmpty = x0.isEmpty(this.allSongList);
        for (BaseSelectMusicFragment<?> baseSelectMusicFragment : this.selectFragmentList) {
            if (isEmpty) {
                baseSelectMusicFragment.renderNoData();
            } else {
                baseSelectMusicFragment.renderSongList(this.allSongList);
            }
        }
    }

    private void showUploadDialog() {
        MusicUploadingDialog musicUploadingDialog = new MusicUploadingDialog(this, this.selectedSongList, new a());
        getWindow().addFlags(128);
        musicUploadingDialog.show();
        musicUploadingDialog.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: com.crrepa.band.my.device.localmusic.q
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i8, KeyEvent keyEvent) {
                boolean lambda$showUploadDialog$3;
                lambda$showUploadDialog$3 = LocalMusicSelectActivity.lambda$showUploadDialog$3(dialogInterface, i8, keyEvent);
                return lambda$showUploadDialog$3;
            }
        });
        musicUploadingDialog.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.crrepa.band.my.device.localmusic.r
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                LocalMusicSelectActivity.this.lambda$showUploadDialog$4(dialogInterface);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showUploadFailedDialog() {
        CustomConfirmDialog customConfirmDialog = new CustomConfirmDialog(this);
        customConfirmDialog.setNoTitleMode();
        customConfirmDialog.hideCancelTv();
        customConfirmDialog.setIvIcon(R$drawable.ic_transfer_fail);
        customConfirmDialog.setContentTxt(getString(R.string.device_local_music_uploading_failure_alrt_title));
        customConfirmDialog.show();
        customConfirmDialog.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.crrepa.band.my.device.localmusic.n
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                LocalMusicSelectActivity.this.lambda$showUploadFailedDialog$5(dialogInterface);
            }
        });
    }

    public static void start(Context context, List<String> list) {
        Intent intent = new Intent(context, (Class<?>) LocalMusicSelectActivity.class);
        intent.putStringArrayListExtra(KEY_SAVED_SONG_LIST, new ArrayList<>(list));
        context.startActivity(intent);
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void initBinding() {
        super.initBinding();
        org.greenrobot.eventbus.c.getDefault().register(this);
        k0.setColorNoTranslucent(this, 0);
        initViewPager();
        ((ActivityLocalMusicSelectBinding) this.binding).tvBack.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.localmusic.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LocalMusicSelectActivity.this.lambda$initBinding$0(view);
            }
        });
        ((ActivityLocalMusicSelectBinding) this.binding).tvSave.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.localmusic.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LocalMusicSelectActivity.this.lambda$initBinding$1(view);
            }
        });
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void loadData() {
        super.loadData();
        ArrayList<String> stringArrayListExtra = getIntent().getStringArrayListExtra(KEY_SAVED_SONG_LIST);
        this.savedSongList = stringArrayListExtra;
        queryLocalSongList(stringArrayListExtra);
        i4.getInstance().queryMusicAvailableSize();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        this.disposableList.clear();
        org.greenrobot.eventbus.c.getDefault().unregister(this);
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public void onEvent(SavedMusicListEvent savedMusicListEvent) {
        if (x0.isEmpty(this.allSongList) || x0.isEmpty(savedMusicListEvent.savedSongList)) {
            return;
        }
        List<String> list = savedMusicListEvent.savedSongList;
        this.savedSongList = list;
        for (String str : list) {
            Iterator<SongBean> it = this.allSongList.iterator();
            while (true) {
                if (it.hasNext()) {
                    SongBean next = it.next();
                    if (!next.isSavedToBand && LocalMusicModel.isSameSong(str, next.getTitle())) {
                        if (next.isSelected) {
                            next.setSelected(false);
                        }
                        next.setIsSavedToBand(true);
                        renderSongList();
                    }
                }
            }
        }
    }

    @Override // com.crrepa.band.my.device.localmusic.x
    public void onSelectedSongChange() {
        querySelectedSongList();
    }
}
