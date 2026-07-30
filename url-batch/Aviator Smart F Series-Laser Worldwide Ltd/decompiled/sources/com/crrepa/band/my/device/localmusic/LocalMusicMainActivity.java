package com.crrepa.band.my.device.localmusic;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.CustomConfirmDialog;
import com.crrepa.band.my.R$drawable;
import com.crrepa.band.my.ble.band.cmd.i4;
import com.crrepa.band.my.databinding.ActivityLocalMusicMainBinding;
import com.crrepa.band.my.device.localmusic.adapter.LocalMusicSavedSongsAdapter;
import com.crrepa.band.my.device.localmusic.model.event.MusicDeletedEvent;
import com.crrepa.band.my.device.localmusic.model.event.MusicSavedCountChangedEvent;
import com.crrepa.band.my.device.localmusic.model.event.MusicUploadCompletedEvent;
import com.crrepa.band.my.device.localmusic.model.event.SavedMusicListEvent;
import com.crrepa.band.my.device.localmusic.model.event.SavedMusicNameEvent;
import com.crrepa.band.my.home.guidance.permission.dialog.PermissionDescriptionDialog;
import com.moyoung.dafit.module.common.baseui.BaseCustomConfirmDialog;
import com.moyoung.dafit.module.common.baseui.BaseRequestPermissionVBActivity;
import com.moyoung.dafit.module.common.utils.c0;
import com.moyoung.dafit.module.common.utils.k0;
import com.moyoung.dafit.module.common.utils.r0;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes2.dex */
public class LocalMusicMainActivity extends BaseRequestPermissionVBActivity<ActivityLocalMusicMainBinding> {
    private q7.a permissionRequest;
    private final List<String> savedSongList = new ArrayList();
    private final LocalMusicSavedSongsAdapter songsAdapter = new LocalMusicSavedSongsAdapter();
    public static final String[] PERMISSIONS_STORAGE = {"android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"};

    @RequiresApi(api = 33)
    public static final String[] PERMISSIONS_AUDIO = {"android.permission.READ_MEDIA_AUDIO"};

    class a implements PermissionDescriptionDialog.b {
        a() {
        }

        @Override // com.crrepa.band.my.home.guidance.permission.dialog.PermissionDescriptionDialog.b
        public void onEnable() {
            com.crrepa.band.my.home.guidance.c.appPermissionDialog("媒体音频", true);
            h.enableReadMediaAudiosWithPermissionCheck(LocalMusicMainActivity.this);
        }

        @Override // com.crrepa.band.my.home.guidance.permission.dialog.PermissionDescriptionDialog.b
        public void onNotNow() {
            com.crrepa.band.my.home.guidance.c.appPermissionDialog("媒体音频", false);
        }
    }

    class b implements PermissionDescriptionDialog.b {
        b() {
        }

        @Override // com.crrepa.band.my.home.guidance.permission.dialog.PermissionDescriptionDialog.b
        public void onEnable() {
            com.crrepa.band.my.home.guidance.c.appPermissionDialog("存储权限", true);
            h.updateBandConfigWithPermissionCheck(LocalMusicMainActivity.this);
        }

        @Override // com.crrepa.band.my.home.guidance.permission.dialog.PermissionDescriptionDialog.b
        public void onNotNow() {
            com.crrepa.band.my.home.guidance.c.appPermissionDialog("存储权限", false);
        }
    }

    private void createMenu(com.yanzhenjie.recyclerview.i iVar) {
        iVar.addMenuItem(new com.yanzhenjie.recyclerview.l(this).setBackgroundColor(ContextCompat.getColor(this, R.color.assist_15)).setText(R.string.delete).setTextColorResource(R.color.white).setWidth(getResources().getDimensionPixelSize(R.dimen.dp_100)).setHeight(-1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: dealOnItemMenuClick, reason: merged with bridge method [inline-methods] */
    public void lambda$showDeleteConfirmDialog$3(com.yanzhenjie.recyclerview.j jVar, int i8) {
        jVar.closeMenu();
        i4.getInstance().deleteMusic(i8);
        getPageLoadingUI().show();
    }

    public static Intent getCallingIntent(Context context) {
        return new Intent(context, (Class<?>) LocalMusicMainActivity.class);
    }

    private void initScrollingTitle() {
        com.moyoung.dafit.module.common.widgets.b bVar = new com.moyoung.dafit.module.common.widgets.b(((ActivityLocalMusicMainBinding) this.binding).appbar.appbar);
        VB vb = this.binding;
        bVar.addTitleScrollEvent(((ActivityLocalMusicMainBinding) vb).appbar.tvTitle, ((ActivityLocalMusicMainBinding) vb).appbar.tvExpandedTitle);
        setSupportActionBar(((ActivityLocalMusicMainBinding) this.binding).appbar.toolbar);
        ((ActivityLocalMusicMainBinding) this.binding).appbar.tvTitle.setText(R.string.device_local_music_title);
        ((ActivityLocalMusicMainBinding) this.binding).appbar.tvExpandedTitle.setText(R.string.device_local_music_title);
        ((ActivityLocalMusicMainBinding) this.binding).appbar.ivTitleBack.setImageResource(R.drawable.selector_title_back);
        ((ActivityLocalMusicMainBinding) this.binding).appbar.ivTitleBack.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.localmusic.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LocalMusicMainActivity.this.lambda$initScrollingTitle$1(view);
            }
        });
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void initSongsRv() {
        ((ActivityLocalMusicMainBinding) this.binding).rvSongs.setLayoutManager(new LinearLayoutManager(this));
        ((ActivityLocalMusicMainBinding) this.binding).rvSongs.setSwipeMenuCreator(new com.yanzhenjie.recyclerview.k() { // from class: com.crrepa.band.my.device.localmusic.f
            @Override // com.yanzhenjie.recyclerview.k
            public final void onCreateMenu(com.yanzhenjie.recyclerview.i iVar, com.yanzhenjie.recyclerview.i iVar2, int i8) {
                LocalMusicMainActivity.this.lambda$initSongsRv$2(iVar, iVar2, i8);
            }
        });
        ((ActivityLocalMusicMainBinding) this.binding).rvSongs.setOnItemMenuClickListener(new com.yanzhenjie.recyclerview.g() { // from class: com.crrepa.band.my.device.localmusic.g
            @Override // com.yanzhenjie.recyclerview.g
            public final void onItemClick(com.yanzhenjie.recyclerview.j jVar, int i8) {
                LocalMusicMainActivity.this.showDeleteConfirmDialog(jVar, i8);
            }
        });
        ((ActivityLocalMusicMainBinding) this.binding).rvSongs.setAdapter(this.songsAdapter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$0(View view) {
        if (Build.VERSION.SDK_INT >= 33 ? q7.b.hasSelfPermissions(this, PERMISSIONS_AUDIO) : q7.b.hasSelfPermissions(this, PERMISSIONS_STORAGE)) {
            LocalMusicSelectActivity.start(this, this.savedSongList);
        } else {
            requestPermission();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initScrollingTitle$1(View view) {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initSongsRv$2(com.yanzhenjie.recyclerview.i iVar, com.yanzhenjie.recyclerview.i iVar2, int i8) {
        createMenu(iVar2);
    }

    private void renderBandDisconnected() {
        r0.showShort(this, getString(R.string.band_setting_send_fail));
    }

    private void renderSongsCount() {
        int size = this.savedSongList.size();
        ((ActivityLocalMusicMainBinding) this.binding).tvDescription.setText(getString(R.string.device_local_music_number_text, String.valueOf(size)));
        if (size == 0) {
            showNoData();
        } else {
            ((ActivityLocalMusicMainBinding) this.binding).rlEmpty.setVisibility(8);
            ((ActivityLocalMusicMainBinding) this.binding).rvSongs.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showDeleteConfirmDialog(final com.yanzhenjie.recyclerview.j jVar, final int i8) {
        CustomConfirmDialog customConfirmDialog = new CustomConfirmDialog(this);
        customConfirmDialog.setNoTitleMode();
        customConfirmDialog.setContentTxt(getString(R.string.device_local_music_delete_music_alrt_title));
        customConfirmDialog.show();
        customConfirmDialog.setOnOkClick(new BaseCustomConfirmDialog.b() { // from class: com.crrepa.band.my.device.localmusic.c
            @Override // com.moyoung.dafit.module.common.baseui.BaseCustomConfirmDialog.b
            public final void onConfirm() {
                LocalMusicMainActivity.this.lambda$showDeleteConfirmDialog$3(jVar, i8);
            }
        });
        Objects.requireNonNull(jVar);
        customConfirmDialog.setOnCancelClick(new d(jVar));
    }

    private void showNoData() {
        ((ActivityLocalMusicMainBinding) this.binding).rlEmpty.setVisibility(0);
        ((ActivityLocalMusicMainBinding) this.binding).rvSongs.setVisibility(8);
    }

    private void showPermissionRationDialog(q7.a aVar) {
        if (q7.b.hasSelfPermissions(this, "android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE")) {
            return;
        }
        showRationaleDialog(R.string.permission_storage_rationale, R.string.allow, R.string.deny, aVar);
    }

    private void showReadAudioPermissionDialog() {
        PermissionDescriptionDialog.builderSinglePermission().setIcon(R$drawable.popup_storage).setTitle(R.string.permission_audio_file_title).setContent(R.string.permission_audio_file_content).setOnClickListener(new a()).build(this).show();
    }

    private void showReadAudiosPermissionRationDialog(q7.a aVar) {
        if (q7.b.hasSelfPermissions(this, "android.permission.READ_MEDIA_AUDIO")) {
            return;
        }
        showRationaleDialog(R.string.permission_storage_rationale, R.string.allow, R.string.deny, aVar);
    }

    private void showReadWriteStoragePermissionDialog() {
        PermissionDescriptionDialog.builderSinglePermission().setIcon(R$drawable.popup_storage).setTitle(R.string.permission_external_storage_title).setContent(getString(R.string.permission_local_music_storage_content, getString(R.string.app_name))).setOnClickListener(new b()).build(this).show();
    }

    void enableReadMediaAudios() {
        com.crrepa.band.my.home.guidance.c.systemPermission("媒体音频", true);
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void initBinding() {
        super.initBinding();
        i4.getInstance().queryMusicAvailableSize();
        org.greenrobot.eventbus.c.getDefault().register(this);
        k0.setColorNoTranslucent(this, 0);
        initScrollingTitle();
        initSongsRv();
        ((ActivityLocalMusicMainBinding) this.binding).tvDescription.setText(getString(R.string.device_local_music_number_text, "0"));
        ((ActivityLocalMusicMainBinding) this.binding).tvAdd.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.localmusic.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LocalMusicMainActivity.this.lambda$initBinding$0(view);
            }
        });
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void loadData() {
        if (com.crrepa.band.my.ble.band.connect.f.getInstance().isDisConnected()) {
            renderBandDisconnected();
        } else if (i.getMusicSavedCount() <= 0) {
            showNoData();
        } else {
            getPageLoadingUI().show();
            i.queryMusicSavedNames();
        }
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        org.greenrobot.eventbus.c.getDefault().unregister(this);
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    @SuppressLint({"NotifyDataSetChanged"})
    public void onEvent(m0.a aVar) {
        if (aVar.getState() == 2) {
            this.savedSongList.clear();
            this.songsAdapter.getData().clear();
            this.songsAdapter.notifyDataSetChanged();
            loadData();
        }
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i8, @NonNull String[] strArr, @NonNull int[] iArr) {
        super.onRequestPermissionsResult(i8, strArr, iArr);
        h.onRequestPermissionsResult(this, i8, iArr);
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseRequestPermissionVBActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onStop() {
        super.onStop();
        ((ActivityLocalMusicMainBinding) this.binding).rvSongs.smoothCloseMenu();
    }

    public void requestPermission() {
        this.requestPermissionCompleted = false;
        if (Build.VERSION.SDK_INT >= 33) {
            if (q7.b.hasSelfPermissions(this, "android.permission.READ_MEDIA_AUDIO")) {
                return;
            }
            showReadAudioPermissionDialog();
        } else {
            if (q7.b.hasSelfPermissions(this, "android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE")) {
                return;
            }
            showReadWriteStoragePermissionDialog();
        }
    }

    void showDeniedForCall() {
        com.orhanobut.logger.f.d("showDeniedForStorage");
        com.crrepa.band.my.home.guidance.c.systemPermission("媒体音频", false);
        q7.a aVar = this.permissionRequest;
        if (aVar == null) {
            requestPermission();
        } else {
            showReadAudiosPermissionRationDialog(aVar);
            this.requestDenied = true;
        }
    }

    void showDeniedForStorage() {
        com.orhanobut.logger.f.d("showDeniedForStorage");
        com.crrepa.band.my.home.guidance.c.systemPermission("存储权限", false);
        q7.a aVar = this.permissionRequest;
        if (aVar == null) {
            return;
        }
        showPermissionRationDialog(aVar);
        this.requestDenied = true;
    }

    void showNeverAskForCall() {
        com.orhanobut.logger.f.d("showNeverAskForCall");
        c0.jumpAppDetailsSetting(this);
    }

    void showNeverAskForStorage() {
        c0.jumpAppDetailsSetting(this);
    }

    void showRationaleForCall(q7.a aVar) {
        com.orhanobut.logger.f.d("showRationaleForStorage");
        if (aVar == null) {
            requestPermission();
            return;
        }
        this.permissionRequest = aVar;
        if (this.requestDenied) {
            showReadAudiosPermissionRationDialog(aVar);
        } else {
            aVar.proceed();
        }
    }

    void showRationaleForStorage(q7.a aVar) {
        com.orhanobut.logger.f.d("showRationaleForStorage");
        if (aVar == null) {
            return;
        }
        this.permissionRequest = aVar;
        if (this.requestDenied) {
            showPermissionRationDialog(aVar);
        } else {
            aVar.proceed();
        }
    }

    void updateBandConfig() {
        com.crrepa.band.my.home.guidance.c.systemPermission("存储权限", true);
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public void onEvent(SavedMusicNameEvent savedMusicNameEvent) {
        getPageLoadingUI().hide();
        this.savedSongList.remove(savedMusicNameEvent.name);
        this.songsAdapter.remove((LocalMusicSavedSongsAdapter) savedMusicNameEvent.name);
        this.savedSongList.add(savedMusicNameEvent.name);
        this.songsAdapter.addData((LocalMusicSavedSongsAdapter) savedMusicNameEvent.name);
        renderSongsCount();
        org.greenrobot.eventbus.c.getDefault().post(new SavedMusicListEvent(this.savedSongList));
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public void onEvent(MusicUploadCompletedEvent musicUploadCompletedEvent) {
        this.savedSongList.add(musicUploadCompletedEvent.name);
        this.songsAdapter.addData((LocalMusicSavedSongsAdapter) musicUploadCompletedEvent.name);
        renderSongsCount();
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    @SuppressLint({"NotifyDataSetChanged"})
    public void onEvent(MusicSavedCountChangedEvent musicSavedCountChangedEvent) {
        this.savedSongList.clear();
        this.songsAdapter.getData().clear();
        this.songsAdapter.notifyDataSetChanged();
        loadData();
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public void onEvent(MusicDeletedEvent musicDeletedEvent) {
        getPageLoadingUI().hide();
        if (musicDeletedEvent.index >= this.savedSongList.size()) {
            return;
        }
        this.savedSongList.remove(musicDeletedEvent.index);
        this.songsAdapter.remove(musicDeletedEvent.index);
        renderSongsCount();
        if (this.savedSongList.isEmpty()) {
            i.saveMusicSavedCount(0);
        }
    }
}
