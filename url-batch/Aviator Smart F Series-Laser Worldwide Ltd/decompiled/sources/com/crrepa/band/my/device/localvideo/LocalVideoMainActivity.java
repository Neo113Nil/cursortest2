package com.crrepa.band.my.device.localvideo;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.CustomConfirmDialog;
import com.crrepa.band.my.ble.band.cmd.i4;
import com.crrepa.band.my.databinding.ActivityLocalVideoMainBinding;
import com.crrepa.band.my.device.localvideo.adapter.LocalVideoSavedVideoAdapter;
import com.crrepa.band.my.device.localvideo.model.SavedVideoInfoEvent;
import com.crrepa.band.my.device.localvideo.model.VideoDeleteFailedEvent;
import com.crrepa.ble.conn.bean.CRPLocalVideoInfo;
import com.moyoung.dafit.module.common.baseui.BaseCustomConfirmDialog;
import com.moyoung.dafit.module.common.baseui.BaseRequestPermissionVBActivity;
import com.moyoung.dafit.module.common.utils.k0;
import com.moyoung.dafit.module.common.utils.r0;
import com.moyoung.lib.photopicker.PhotoPickHelper;
import java.util.List;
import java.util.Objects;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes2.dex */
public class LocalVideoMainActivity extends BaseRequestPermissionVBActivity<ActivityLocalVideoMainBinding> {
    private final LocalVideoSavedVideoAdapter videosAdapter = new LocalVideoSavedVideoAdapter();

    class a implements com.moyoung.lib.photopicker.i {
        a() {
        }

        @Override // com.moyoung.lib.photopicker.i
        public /* bridge */ /* synthetic */ void onCanceled(String str) {
            com.moyoung.lib.photopicker.h.a(this, str);
        }

        @Override // com.moyoung.lib.photopicker.i
        public /* bridge */ /* synthetic */ void onPicked(List list, boolean z7) {
            com.moyoung.lib.photopicker.h.c(this, list, z7);
        }

        @Override // com.moyoung.lib.photopicker.i
        public /* bridge */ /* synthetic */ void unSupportGalleryMultiplePick() {
            com.moyoung.lib.photopicker.h.d(this);
        }

        @Override // com.moyoung.lib.photopicker.i
        public void onPicked(Uri uri) {
            LocalVideoEditActivity.start(LocalVideoMainActivity.this, uri);
        }
    }

    private void createMenu(com.yanzhenjie.recyclerview.i iVar) {
        iVar.addMenuItem(new com.yanzhenjie.recyclerview.l(this).setBackgroundColor(ContextCompat.getColor(this, R.color.assist_15)).setText(R.string.delete).setTextColorResource(R.color.white).setWidth(getResources().getDimensionPixelSize(R.dimen.dp_100)).setHeight(-1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: dealOnItemMenuClick, reason: merged with bridge method [inline-methods] */
    public void lambda$showDeleteConfirmDialog$3(com.yanzhenjie.recyclerview.j jVar, int i8) {
        jVar.closeMenu();
        i4.getInstance().deleteLocalVideo(this.videosAdapter.getItem(i8));
        getPageLoadingUI().show();
    }

    public static Intent getCallingIntent(Context context) {
        return new Intent(context, (Class<?>) LocalVideoMainActivity.class);
    }

    private void initScrollingTitle() {
        com.moyoung.dafit.module.common.widgets.b bVar = new com.moyoung.dafit.module.common.widgets.b(((ActivityLocalVideoMainBinding) this.binding).appbar.appbar);
        VB vb = this.binding;
        bVar.addTitleScrollEvent(((ActivityLocalVideoMainBinding) vb).appbar.tvTitle, ((ActivityLocalVideoMainBinding) vb).appbar.tvExpandedTitle);
        setSupportActionBar(((ActivityLocalVideoMainBinding) this.binding).appbar.toolbar);
        ((ActivityLocalVideoMainBinding) this.binding).appbar.tvTitle.setText(R.string.device_local_video_title);
        ((ActivityLocalVideoMainBinding) this.binding).appbar.tvExpandedTitle.setText(R.string.device_local_video_title);
        ((ActivityLocalVideoMainBinding) this.binding).appbar.ivTitleBack.setImageResource(R.drawable.selector_title_back);
        ((ActivityLocalVideoMainBinding) this.binding).appbar.ivTitleBack.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.localvideo.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LocalVideoMainActivity.this.lambda$initScrollingTitle$1(view);
            }
        });
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void initVideosRv() {
        ((ActivityLocalVideoMainBinding) this.binding).rvVideos.setLayoutManager(new LinearLayoutManager(this));
        ((ActivityLocalVideoMainBinding) this.binding).rvVideos.setSwipeMenuCreator(new com.yanzhenjie.recyclerview.k() { // from class: com.crrepa.band.my.device.localvideo.i
            @Override // com.yanzhenjie.recyclerview.k
            public final void onCreateMenu(com.yanzhenjie.recyclerview.i iVar, com.yanzhenjie.recyclerview.i iVar2, int i8) {
                LocalVideoMainActivity.this.lambda$initVideosRv$2(iVar, iVar2, i8);
            }
        });
        ((ActivityLocalVideoMainBinding) this.binding).rvVideos.setOnItemMenuClickListener(new com.yanzhenjie.recyclerview.g() { // from class: com.crrepa.band.my.device.localvideo.j
            @Override // com.yanzhenjie.recyclerview.g
            public final void onItemClick(com.yanzhenjie.recyclerview.j jVar, int i8) {
                LocalVideoMainActivity.this.showDeleteConfirmDialog(jVar, i8);
            }
        });
        ((ActivityLocalVideoMainBinding) this.binding).rvVideos.setAdapter(this.videosAdapter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$0(View view) {
        CRPLocalVideoInfo cRPLocalVideoInfo = m.getCRPLocalVideoInfo();
        renderVideosCount(cRPLocalVideoInfo.getMaxCount(), cRPLocalVideoInfo.getSavedCount());
        if (cRPLocalVideoInfo.getSavedCount() >= cRPLocalVideoInfo.getMaxCount()) {
            return;
        }
        PhotoPickHelper.pickSingleVideo(this, new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initScrollingTitle$1(View view) {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initVideosRv$2(com.yanzhenjie.recyclerview.i iVar, com.yanzhenjie.recyclerview.i iVar2, int i8) {
        createMenu(iVar2);
    }

    private void renderBandDisconnected() {
        r0.showShort(this, getString(R.string.band_setting_send_fail));
    }

    private void renderVideosCount(int i8, int i9) {
        if (i9 <= 0) {
            showNoData();
        } else {
            ((ActivityLocalVideoMainBinding) this.binding).rlEmpty.setVisibility(8);
            ((ActivityLocalVideoMainBinding) this.binding).rvVideos.setVisibility(0);
        }
        String valueOf = String.valueOf(i8);
        ((ActivityLocalVideoMainBinding) this.binding).tvDescription.setText(getString(R.string.device_local_video_max_number_text, valueOf, String.valueOf(i9), valueOf));
        if (i9 >= i8) {
            ((ActivityLocalVideoMainBinding) this.binding).tvAdd.setVisibility(8);
        } else {
            ((ActivityLocalVideoMainBinding) this.binding).tvAdd.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showDeleteConfirmDialog(final com.yanzhenjie.recyclerview.j jVar, final int i8) {
        CustomConfirmDialog customConfirmDialog = new CustomConfirmDialog(this);
        customConfirmDialog.setNoTitleMode();
        customConfirmDialog.setContentTxt(getString(R.string.device_local_video_delete_music_alrt_title));
        customConfirmDialog.show();
        customConfirmDialog.setOnOkClick(new BaseCustomConfirmDialog.b() { // from class: com.crrepa.band.my.device.localvideo.h
            @Override // com.moyoung.dafit.module.common.baseui.BaseCustomConfirmDialog.b
            public final void onConfirm() {
                LocalVideoMainActivity.this.lambda$showDeleteConfirmDialog$3(jVar, i8);
            }
        });
        Objects.requireNonNull(jVar);
        customConfirmDialog.setOnCancelClick(new com.crrepa.band.my.device.localmusic.d(jVar));
    }

    private void showNoData() {
        ((ActivityLocalVideoMainBinding) this.binding).rlEmpty.setVisibility(0);
        ((ActivityLocalVideoMainBinding) this.binding).rvVideos.setVisibility(8);
    }

    public static void start(Context context) {
        context.startActivity(new Intent(context, (Class<?>) LocalVideoMainActivity.class));
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void initBinding() {
        super.initBinding();
        i4.getInstance().queryLocalVideoInfo();
        org.greenrobot.eventbus.c.getDefault().register(this);
        k0.setColorNoTranslucent(this, 0);
        initScrollingTitle();
        initVideosRv();
        ((ActivityLocalVideoMainBinding) this.binding).tvAdd.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.localvideo.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LocalVideoMainActivity.this.lambda$initBinding$0(view);
            }
        });
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    @SuppressLint({"NotifyDataSetChanged"})
    protected void loadData() {
        if (com.crrepa.band.my.ble.band.connect.f.getInstance().isDisConnected()) {
            renderBandDisconnected();
            return;
        }
        this.videosAdapter.getData().clear();
        this.videosAdapter.notifyDataSetChanged();
        CRPLocalVideoInfo cRPLocalVideoInfo = m.getCRPLocalVideoInfo();
        renderVideosCount(cRPLocalVideoInfo.getMaxCount(), cRPLocalVideoInfo.getSavedCount());
        if (cRPLocalVideoInfo.getSavedCount() > 0) {
            this.videosAdapter.setNewData(cRPLocalVideoInfo.getVideoList());
        }
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        org.greenrobot.eventbus.c.getDefault().unregister(this);
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public void onEvent(m0.a aVar) {
        getPageLoadingUI().hide();
        if (aVar.getState() == 2) {
            loadData();
        }
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseRequestPermissionVBActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onStop() {
        super.onStop();
        ((ActivityLocalVideoMainBinding) this.binding).rvVideos.smoothCloseMenu();
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public void onEvent(SavedVideoInfoEvent savedVideoInfoEvent) {
        getPageLoadingUI().hide();
        loadData();
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public void onEvent(VideoDeleteFailedEvent videoDeleteFailedEvent) {
        getPageLoadingUI().hide();
        r0.showShort(R.string.common_delete_fail_tips);
    }
}
