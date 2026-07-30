package com.crrepa.band.my.device.watchfacenew.video;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaPlayer;
import android.net.Uri;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.CustomConfirmDialog;
import com.crrepa.band.my.MainActivity;
import com.crrepa.band.my.R$drawable;
import com.crrepa.band.my.ble.band.cmd.i4;
import com.crrepa.band.my.databinding.ActivityNewWatchFaceVideoMainBinding;
import com.crrepa.band.my.device.watchfacenew.video.model.LocalVideoModel;
import com.crrepa.band.my.device.watchfacenew.video.model.VideoEditedEvent;
import com.crrepa.band.my.device.watchfacenew.video.model.event.VideoWatchFaceSetSuccessEvent;
import com.crrepa.band.my.model.band.provider.BandBatteryProvider;
import com.crrepa.ble.conn.listener.CRPFileTransListener;
import com.crrepa.ble.conn.type.CRPWatchFaceType;
import com.moyoung.dafit.module.common.baseui.BaseCustomConfirmDialog;
import com.moyoung.dafit.module.common.baseui.BaseCustomUploadingDialog;
import com.moyoung.dafit.module.common.baseui.BaseVBActivity;
import com.moyoung.dafit.module.common.utils.r0;
import com.moyoung.dafit.module.common.utils.x0;
import com.moyoung.lib.photopicker.PhotoPickHelper;
import com.my.lib.data.ErrorCode;
import com.squareup.picasso.Picasso;
import java.io.File;
import java.util.List;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes2.dex */
public class VideoWatchFaceMainActivity extends BaseVBActivity<ActivityNewWatchFaceVideoMainBinding> {
    private com.crrepa.band.my.device.watchfacenew.delegate.displaymode.e displayModeDelegate;
    private y1.b timeStyleDelegate;
    private BaseCustomUploadingDialog uploadingDialog;

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
            VideoWatchFaceEditActivity.start(VideoWatchFaceMainActivity.this, uri);
        }
    }

    class b implements CRPFileTransListener {
        private final File md5VideoFile;

        public b(File file) {
            this.md5VideoFile = file;
        }

        @Override // com.crrepa.ble.conn.listener.CRPFileTransListener
        public void onError(int i8) {
            Log.d("CRPFileTransListener", "onError:" + i8);
            VideoWatchFaceMainActivity.this.renderTransError();
            File file = this.md5VideoFile;
            if (file != null) {
                file.delete();
            }
        }

        @Override // com.crrepa.ble.conn.listener.CRPFileTransListener
        public void onTransCompleted() {
            Log.d("CRPFileTransListener", "onTransCompleted");
            VideoWatchFaceMainActivity.this.sendWatchFaceLayout();
            VideoWatchFaceMainActivity.this.sendVideoWatchFaceDisplayMode();
            VideoWatchFaceMainActivity.this.sendWatchFaceTimeStyle();
            i4.getInstance().queryVideoWatchFaceAvailableSize();
            i4.getInstance().queryVideoWatchFaceInfo();
            if (this.md5VideoFile == null) {
                Log.d("CRPFileTransListener", "onTransCompleted,为只传缩略图的情况");
            } else {
                Log.d("CRPFileTransListener", "onTransCompleted,savedMd5Name=" + this.md5VideoFile.getName());
                LocalVideoModel.renameCroppedFileToVideoWatchFaceFile();
                LocalVideoModel.saveVideoWatchFacePreviewImg();
                v.saveSavedVideoWatchFaceName(this.md5VideoFile.getName());
                this.md5VideoFile.delete();
            }
            VideoWatchFaceMainActivity.this.renderTransCompleted();
            org.greenrobot.eventbus.c.getDefault().post(new VideoWatchFaceSetSuccessEvent());
        }

        @Override // com.crrepa.ble.conn.listener.CRPFileTransListener
        public void onTransProgressChanged(int i8) {
            Log.d("CRPFileTransListener", "onTransProgressChanged:" + i8);
            VideoWatchFaceMainActivity.this.renderTransProgressChanged(i8);
        }

        @Override // com.crrepa.ble.conn.listener.CRPFileTransListener
        public void onTransProgressStarting() {
            Log.d("CRPFileTransListener", "onTransProgressStarting");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void deleteVideoFile() {
        new File(LocalVideoModel.getCroppedVideoPath()).delete();
        new File(LocalVideoModel.getCroppedVideoPreviewPath()).delete();
        renderVideoPreview(null);
    }

    public static Intent getCallingIntent(Context context, String str) {
        Intent intent = new Intent();
        intent.setClass(context, VideoWatchFaceMainActivity.class);
        intent.putExtra("watchFaceUrl", str);
        return intent;
    }

    private void initDelegate() {
        ((ActivityNewWatchFaceVideoMainBinding) this.binding).ivDefaultImg.post(new Runnable() { // from class: com.crrepa.band.my.device.watchfacenew.video.l
            @Override // java.lang.Runnable
            public final void run() {
                VideoWatchFaceMainActivity.this.lambda$initDelegate$0();
            }
        });
    }

    private void initListener() {
        ((ActivityNewWatchFaceVideoMainBinding) this.binding).ivBack.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.watchfacenew.video.q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VideoWatchFaceMainActivity.this.lambda$initListener$7(view);
            }
        });
        ((ActivityNewWatchFaceVideoMainBinding) this.binding).includeVideo.flAdd.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.watchfacenew.video.r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VideoWatchFaceMainActivity.this.lambda$initListener$8(view);
            }
        });
        ((ActivityNewWatchFaceVideoMainBinding) this.binding).shadowApply.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.watchfacenew.video.s
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VideoWatchFaceMainActivity.this.lambda$initListener$9(view);
            }
        });
        ((ActivityNewWatchFaceVideoMainBinding) this.binding).includeVideo.ivPlay.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.watchfacenew.video.t
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VideoWatchFaceMainActivity.this.lambda$initListener$10(view);
            }
        });
        ((ActivityNewWatchFaceVideoMainBinding) this.binding).includeVideo.tvDelete.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.watchfacenew.video.u
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VideoWatchFaceMainActivity.this.lambda$initListener$11(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initDelegate$0() {
        this.displayModeDelegate = new com.crrepa.band.my.device.watchfacenew.delegate.displaymode.e(((ActivityNewWatchFaceVideoMainBinding) this.binding).includeDisplayMode);
        VB vb = this.binding;
        this.timeStyleDelegate = new y1.b(((ActivityNewWatchFaceVideoMainBinding) vb).includeTimePreview, ((ActivityNewWatchFaceVideoMainBinding) vb).includeTimeStyle, CRPWatchFaceType.VIDEO_WATCH_FACE);
        ((ActivityNewWatchFaceVideoMainBinding) this.binding).includeTimePreview.rlRoot.setVisibility(0);
        ((ActivityNewWatchFaceVideoMainBinding) this.binding).includeTimeStyle.llRoot.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initListener$10(View view) {
        if (((ActivityNewWatchFaceVideoMainBinding) this.binding).videoView.isPlaying()) {
            ((ActivityNewWatchFaceVideoMainBinding) this.binding).videoView.pause();
            ((ActivityNewWatchFaceVideoMainBinding) this.binding).includeVideo.timeCutLayout.renderCursorPause();
            ((ActivityNewWatchFaceVideoMainBinding) this.binding).includeVideo.ivPlay.setImageResource(R$drawable.ic_watchface_video_play_1);
        } else {
            ((ActivityNewWatchFaceVideoMainBinding) this.binding).videoView.start();
            ((ActivityNewWatchFaceVideoMainBinding) this.binding).includeVideo.timeCutLayout.playCursorAnim();
            ((ActivityNewWatchFaceVideoMainBinding) this.binding).includeVideo.ivPlay.setImageResource(R$drawable.ic_watchface_video_pause_1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initListener$11(View view) {
        showDeleteConfirmDialog();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initListener$7(View view) {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initListener$8(View view) {
        PhotoPickHelper.pickSingleVideo(this, new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initListener$9(View view) {
        sendVideoWatchFace();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$renderTransCompleted$5() {
        startActivity(MainActivity.getCallingIntent(this));
        BaseCustomUploadingDialog baseCustomUploadingDialog = this.uploadingDialog;
        if (baseCustomUploadingDialog != null) {
            baseCustomUploadingDialog.dismiss();
        }
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$renderTransError$6() {
        r0.showLong(this, getString(R.string.device_watch_face_update_fail_alrt_title));
        BaseCustomUploadingDialog baseCustomUploadingDialog = this.uploadingDialog;
        if (baseCustomUploadingDialog != null) {
            baseCustomUploadingDialog.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$renderTransProgressChanged$4(int i8) {
        BaseCustomUploadingDialog baseCustomUploadingDialog = this.uploadingDialog;
        if (baseCustomUploadingDialog != null) {
            baseCustomUploadingDialog.setProgress(i8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$renderVideoPreview$1(RelativeLayout relativeLayout) {
        int screenWidth = com.crrepa.band.my.device.watchfacenew.delegate.img.i.getScreenWidth();
        int screenHeight = com.crrepa.band.my.device.watchfacenew.delegate.img.i.getScreenHeight();
        float measuredHeight = relativeLayout.getMeasuredHeight() / screenHeight;
        ((ActivityNewWatchFaceVideoMainBinding) this.binding).ivDefaultImg.setCornerRadius(com.crrepa.band.my.device.watchfacenew.delegate.img.i.getCornerRadius() * measuredHeight);
        ViewGroup.LayoutParams layoutParams = relativeLayout.getLayoutParams();
        layoutParams.width = (int) (measuredHeight * screenWidth);
        relativeLayout.setLayoutParams(layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$renderVideoPreview$2(String str, MediaPlayer mediaPlayer) {
        mediaPlayer.seekTo(0);
        VB vb = this.binding;
        ((ActivityNewWatchFaceVideoMainBinding) vb).includeVideo.timeCutLayout.renderVideoThumbs(((ActivityNewWatchFaceVideoMainBinding) vb).videoView.getDuration(), Uri.parse(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$renderVideoPreview$3(MediaPlayer mediaPlayer) {
        mediaPlayer.seekTo(0);
        ((ActivityNewWatchFaceVideoMainBinding) this.binding).includeVideo.ivPlay.setImageResource(R$drawable.ic_watchface_video_play_1);
    }

    private void renderDisconnectHint() {
        r0.showLong(this, getString(R.string.band_setting_send_fail));
    }

    private void renderLowBatteryHint() {
        r0.showLong(this, getString(R.string.measure_low_battery_hint));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void renderTransCompleted() {
        ((ActivityNewWatchFaceVideoMainBinding) this.binding).shadowApply.post(new Runnable() { // from class: com.crrepa.band.my.device.watchfacenew.video.p
            @Override // java.lang.Runnable
            public final void run() {
                VideoWatchFaceMainActivity.this.lambda$renderTransCompleted$5();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void renderTransError() {
        ((ActivityNewWatchFaceVideoMainBinding) this.binding).shadowApply.post(new Runnable() { // from class: com.crrepa.band.my.device.watchfacenew.video.o
            @Override // java.lang.Runnable
            public final void run() {
                VideoWatchFaceMainActivity.this.lambda$renderTransError$6();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void renderTransProgressChanged(final int i8) {
        ((ActivityNewWatchFaceVideoMainBinding) this.binding).shadowApply.post(new Runnable() { // from class: com.crrepa.band.my.device.watchfacenew.video.j
            @Override // java.lang.Runnable
            public final void run() {
                VideoWatchFaceMainActivity.this.lambda$renderTransProgressChanged$4(i8);
            }
        });
    }

    private void renderVideoMask() {
        int screenWidth = com.crrepa.band.my.device.watchfacenew.delegate.img.i.getScreenWidth();
        int screenHeight = com.crrepa.band.my.device.watchfacenew.delegate.img.i.getScreenHeight();
        ((ActivityNewWatchFaceVideoMainBinding) this.binding).ivVideoMask.setImageBitmap(BitmapFactory.decodeFile(new File(com.crrepa.band.my.ble.band.utils.a.getInstance().isCircleScreen() ? LocalVideoModel.getCircleMaskPath(screenWidth, screenHeight) : LocalVideoModel.getCornerMaskPath(screenWidth, screenHeight, com.crrepa.band.my.device.watchfacenew.delegate.img.i.getCornerRadius())).getPath()));
        ((ActivityNewWatchFaceVideoMainBinding) this.binding).ivVideoMask.setColorFilter(getResources().getColor(R.color.main_bg_6_overall_1));
    }

    private void renderVideoPreview(final String str) {
        if (!x0.isEmpty(str) && new File(str).exists()) {
            ((ActivityNewWatchFaceVideoMainBinding) this.binding).ivDefaultImg.setVisibility(8);
            ((ActivityNewWatchFaceVideoMainBinding) this.binding).includeVideo.llAdd.setVisibility(8);
            ((ActivityNewWatchFaceVideoMainBinding) this.binding).videoView.setVisibility(0);
            ((ActivityNewWatchFaceVideoMainBinding) this.binding).includeVideo.tvDelete.setVisibility(0);
            ((ActivityNewWatchFaceVideoMainBinding) this.binding).includeVideo.tvTitle.setVisibility(0);
            ((ActivityNewWatchFaceVideoMainBinding) this.binding).includeVideo.llVideoOperation.setVisibility(0);
            ((ActivityNewWatchFaceVideoMainBinding) this.binding).videoView.setVideoURI(Uri.parse(str));
            ((ActivityNewWatchFaceVideoMainBinding) this.binding).videoView.requestFocus();
            ((ActivityNewWatchFaceVideoMainBinding) this.binding).videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: com.crrepa.band.my.device.watchfacenew.video.m
                @Override // android.media.MediaPlayer.OnPreparedListener
                public final void onPrepared(MediaPlayer mediaPlayer) {
                    VideoWatchFaceMainActivity.this.lambda$renderVideoPreview$2(str, mediaPlayer);
                }
            });
            ((ActivityNewWatchFaceVideoMainBinding) this.binding).videoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: com.crrepa.band.my.device.watchfacenew.video.n
                @Override // android.media.MediaPlayer.OnCompletionListener
                public final void onCompletion(MediaPlayer mediaPlayer) {
                    VideoWatchFaceMainActivity.this.lambda$renderVideoPreview$3(mediaPlayer);
                }
            });
            return;
        }
        Picasso.get().load(getIntent().getStringExtra("watchFaceUrl")).into(((ActivityNewWatchFaceVideoMainBinding) this.binding).ivDefaultImg);
        ((ActivityNewWatchFaceVideoMainBinding) this.binding).ivDefaultImg.setVisibility(0);
        ((ActivityNewWatchFaceVideoMainBinding) this.binding).includeVideo.llAdd.setVisibility(0);
        ((ActivityNewWatchFaceVideoMainBinding) this.binding).videoView.setVisibility(8);
        ((ActivityNewWatchFaceVideoMainBinding) this.binding).includeVideo.tvDelete.setVisibility(8);
        ((ActivityNewWatchFaceVideoMainBinding) this.binding).includeVideo.tvTitle.setVisibility(8);
        ((ActivityNewWatchFaceVideoMainBinding) this.binding).includeVideo.llVideoOperation.setVisibility(8);
        if (com.crrepa.band.my.ble.band.utils.a.getInstance().isCircleScreen()) {
            ((ActivityNewWatchFaceVideoMainBinding) this.binding).ivDefaultImg.setOval(true);
            return;
        }
        ((ActivityNewWatchFaceVideoMainBinding) this.binding).ivDefaultImg.setOval(false);
        final RelativeLayout relativeLayout = ((ActivityNewWatchFaceVideoMainBinding) this.binding).rlVideo;
        relativeLayout.post(new Runnable() { // from class: com.crrepa.band.my.device.watchfacenew.video.i
            @Override // java.lang.Runnable
            public final void run() {
                VideoWatchFaceMainActivity.this.lambda$renderVideoPreview$1(relativeLayout);
            }
        });
    }

    private void sendVideoFile(File file) {
        showUploadDialog();
        this.uploadingDialog.setProgress(0);
        Bitmap videoFirstFrameBitmap = com.crrepa.band.my.device.watchfacenew.photo.utils.c.getVideoFirstFrameBitmap(((ActivityNewWatchFaceVideoMainBinding) this.binding).ivDefaultImg);
        Bitmap thumbBitmapWithLabel = com.crrepa.band.my.device.watchfacenew.photo.utils.c.getThumbBitmapWithLabel(videoFirstFrameBitmap, this.timeStyleDelegate.isClockStyle());
        if (file != null) {
            File createVideoFileToMd5File = LocalVideoModel.createVideoFileToMd5File(file);
            i4.getInstance().sendVideoWatchFace(createVideoFileToMd5File, videoFirstFrameBitmap, thumbBitmapWithLabel, new b(createVideoFileToMd5File));
        } else {
            i4.getInstance().sendVideoWatchFaceThumbnail(v.getSavedVideoWatchFaceName(), thumbBitmapWithLabel, new b(null));
        }
    }

    private void sendVideoWatchFace() {
        if (!com.crrepa.band.my.ble.band.connect.f.getInstance().isConnected()) {
            renderDisconnectHint();
            return;
        }
        if (BandBatteryProvider.isOtaLowBattery()) {
            renderLowBatteryHint();
            return;
        }
        if (((ActivityNewWatchFaceVideoMainBinding) this.binding).includeVideo.llAdd.getVisibility() == 0) {
            sendWatchFaceLayout();
            sendVideoWatchFaceDisplayMode();
            sendWatchFaceTimeStyle();
            i4.getInstance().resetHisiliconWatchFace(CRPWatchFaceType.VIDEO_WATCH_FACE);
            v.deleteVideoFiles();
            org.greenrobot.eventbus.c.getDefault().post(new VideoWatchFaceSetSuccessEvent());
            finish();
            return;
        }
        File file = new File(LocalVideoModel.getCroppedVideoPath());
        if (file.exists()) {
            if (file.length() > v.getAvailableSize() * 1024) {
                r0.showShort(this, R.string.watch_face_no_storage_space);
                return;
            } else {
                sendVideoFile(file);
                getWindow().addFlags(128);
                return;
            }
        }
        if (this.timeStyleDelegate.isTimeStyleChanged()) {
            sendVideoFile(null);
            return;
        }
        sendWatchFaceLayout();
        sendVideoWatchFaceDisplayMode();
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendVideoWatchFaceDisplayMode() {
        if (this.displayModeDelegate.getDisplayMode() == null) {
            return;
        }
        i4.getInstance().sendVideoWatchFaceDisplayMode(this.displayModeDelegate.getDisplayMode());
        com.crrepa.band.my.device.watchfacenew.delegate.displaymode.a.saveVideoDisplayMode(this.displayModeDelegate.getDisplayMode());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendWatchFaceLayout() {
        this.timeStyleDelegate.sendWatchFaceLayout();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendWatchFaceTimeStyle() {
        if (this.timeStyleDelegate.getTimeStyle() == null || this.timeStyleDelegate.isTimeStyleNotChanged()) {
            return;
        }
        i4 i4Var = i4.getInstance();
        CRPWatchFaceType cRPWatchFaceType = CRPWatchFaceType.VIDEO_WATCH_FACE;
        i4Var.sendHisiliconWatchFaceTimeStyle(cRPWatchFaceType, this.timeStyleDelegate.getTimeStyle());
        y1.c.save(cRPWatchFaceType, this.timeStyleDelegate.getTimeStyle());
    }

    private void showDeleteConfirmDialog() {
        CustomConfirmDialog customConfirmDialog = new CustomConfirmDialog(this);
        customConfirmDialog.setNoTitleMode();
        customConfirmDialog.exchangeOperationTvColor();
        customConfirmDialog.exchangeOperationTvPosition();
        customConfirmDialog.setContentTxt(R.string.device_video_watch_face_delete_message);
        customConfirmDialog.setOnOkClick(new BaseCustomConfirmDialog.b() { // from class: com.crrepa.band.my.device.watchfacenew.video.k
            @Override // com.moyoung.dafit.module.common.baseui.BaseCustomConfirmDialog.b
            public final void onConfirm() {
                VideoWatchFaceMainActivity.this.deleteVideoFile();
            }
        });
        customConfirmDialog.show();
    }

    private void showUploadDialog() {
        BaseCustomUploadingDialog baseCustomUploadingDialog = new BaseCustomUploadingDialog(this);
        this.uploadingDialog = baseCustomUploadingDialog;
        baseCustomUploadingDialog.setTitleTxt(R.string.device_custom_watch_face_uploading);
        this.uploadingDialog.hideCancelTv();
        this.uploadingDialog.show();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void initBinding() {
        super.initBinding();
        i4.getInstance().queryVideoWatchFaceAvailableSize();
        i4.getInstance().queryVideoWatchFaceDisplayMode();
        org.greenrobot.eventbus.c.getDefault().register(this);
        ((ActivityNewWatchFaceVideoMainBinding) this.binding).includeVideo.timeCutLayout.hideTvTime();
        ((ActivityNewWatchFaceVideoMainBinding) this.binding).includeVideo.timeCutLayout.hideTimeHandle();
        ((ActivityNewWatchFaceVideoMainBinding) this.binding).includeVideo.tvAddTips.setText(getString(R.string.device_video_watch_face_add_tips, ErrorCode.PARAMETER_ERROR));
        initListener();
        initDelegate();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void loadData() {
        super.loadData();
        renderVideoPreview(LocalVideoModel.getVideoWatchFacePreviewFilePath());
        renderVideoMask();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        org.greenrobot.eventbus.c.getDefault().unregister(this);
        getWindow().clearFlags(128);
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public void onEvent(VideoEditedEvent videoEditedEvent) {
        renderVideoPreview(LocalVideoModel.getCroppedVideoPreviewPath());
    }
}
