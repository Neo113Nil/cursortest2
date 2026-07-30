package com.crrepa.band.my.device.localvideo;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.media.MediaPlayer;
import android.net.Uri;
import android.util.Log;
import android.view.View;
import android.widget.VideoView;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.CustomConfirmDialog;
import com.crrepa.band.my.R$drawable;
import com.crrepa.band.my.databinding.ActivityLocalVideoEditBinding;
import com.crrepa.band.my.device.localvideo.VideoUploadingDialog;
import com.crrepa.band.my.device.watchfacenew.video.model.LocalVideoModel;
import com.crrepa.band.my.device.watchfacenew.video.widgets.TimeCutLayout;
import com.crrepa.band.my.model.band.provider.BandBatteryProvider;
import com.crrepa.ble.conn.bean.CRPLocalVideoInfo;
import com.moyoung.dafit.module.common.baseui.BaseVBActivity;
import com.moyoung.dafit.module.common.utils.g0;
import com.moyoung.dafit.module.common.utils.k0;
import com.moyoung.dafit.module.common.utils.r0;
import java.io.File;

/* loaded from: classes2.dex */
public class LocalVideoEditActivity extends BaseVBActivity<ActivityLocalVideoEditBinding> {
    private static final String VIDEO_URI_KEY = "video-uri";
    private ProgressDialog progressDialog;
    private Uri videoUri;
    private VideoView videoView;
    private int videoW = 392;
    private int videoH = 236;
    private int watchFaceW = 466;
    private int watchFaceH = 466;
    private int cornerRadius = 17;
    private boolean isUnsupportedVideo = false;

    class a implements LocalVideoModel.Callback {
        final /* synthetic */ long val$endMs;
        final /* synthetic */ long val$startMs;

        a(long j8, long j9) {
            this.val$startMs = j8;
            this.val$endMs = j9;
        }

        @Override // com.crrepa.band.my.device.watchfacenew.video.model.LocalVideoModel.Callback
        public void onFail() {
            if (LocalVideoEditActivity.this.progressDialog != null && LocalVideoEditActivity.this.progressDialog.isShowing()) {
                LocalVideoEditActivity.this.progressDialog.dismiss();
            }
            r0.showShort("没有获取到视频绝对路径");
        }

        @Override // com.crrepa.band.my.device.watchfacenew.video.model.LocalVideoModel.Callback
        public void onSuccess(String str) {
            LocalVideoEditActivity.this.editVideo(str, this.val$startMs, this.val$endMs);
        }
    }

    class b implements TimeCutLayout.d {
        b() {
        }

        @Override // com.crrepa.band.my.device.watchfacenew.video.widgets.TimeCutLayout.d
        public void onCursorPlayFinished() {
            LocalVideoEditActivity.this.videoView.pause();
            LocalVideoEditActivity.this.videoView.seekTo(((ActivityLocalVideoEditBinding) ((BaseVBActivity) LocalVideoEditActivity.this).binding).timeCutLayout.getCutStartPos());
            ((ActivityLocalVideoEditBinding) ((BaseVBActivity) LocalVideoEditActivity.this).binding).ivPlay.setImageResource(R$drawable.ic_watchface_video_play);
        }

        @Override // com.crrepa.band.my.device.watchfacenew.video.widgets.TimeCutLayout.d
        public void onSeek(int i8) {
            LocalVideoEditActivity.this.videoView.pause();
            LocalVideoEditActivity.this.videoView.seekTo(i8);
            ((ActivityLocalVideoEditBinding) ((BaseVBActivity) LocalVideoEditActivity.this).binding).ivPlay.setImageResource(R$drawable.ic_watchface_video_play);
        }
    }

    class c implements com.moyoung.lib.videoeditor.editors.b {
        final /* synthetic */ String val$croppedVideoFilePath;
        final /* synthetic */ String val$videoPath;

        c(String str, String str2) {
            this.val$videoPath = str;
            this.val$croppedVideoFilePath = str2;
        }

        @Override // com.moyoung.lib.videoeditor.editors.b
        public void onFailure(String str) {
            r0.showShort(LocalVideoEditActivity.this.getApplicationContext(), str);
            if (LocalVideoEditActivity.this.progressDialog.isShowing()) {
                LocalVideoEditActivity.this.progressDialog.dismiss();
            }
        }

        @Override // com.moyoung.lib.videoeditor.editors.b
        public void onFinish() {
            new File(this.val$videoPath).delete();
        }

        @Override // com.moyoung.lib.videoeditor.editors.b
        public /* bridge */ /* synthetic */ void onProgress(String str) {
            com.moyoung.lib.videoeditor.editors.a.b(this, str);
        }

        @Override // com.moyoung.lib.videoeditor.editors.b
        public /* bridge */ /* synthetic */ void onStart() {
            com.moyoung.lib.videoeditor.editors.a.c(this);
        }

        @Override // com.moyoung.lib.videoeditor.editors.b
        public void onSuccess(String str) {
            LocalVideoEditActivity.this.encode264Video(this.val$croppedVideoFilePath);
        }
    }

    class d implements com.moyoung.lib.videoeditor.editors.b {
        final /* synthetic */ String val$croppedVideoFilePath;
        final /* synthetic */ String val$video264FilePath;

        d(String str, String str2) {
            this.val$croppedVideoFilePath = str;
            this.val$video264FilePath = str2;
        }

        @Override // com.moyoung.lib.videoeditor.editors.b
        public void onFailure(String str) {
            r0.showShort(LocalVideoEditActivity.this.getApplicationContext(), str);
            if (LocalVideoEditActivity.this.progressDialog.isShowing()) {
                LocalVideoEditActivity.this.progressDialog.dismiss();
            }
        }

        @Override // com.moyoung.lib.videoeditor.editors.b
        public /* bridge */ /* synthetic */ void onFinish() {
            com.moyoung.lib.videoeditor.editors.a.a(this);
        }

        @Override // com.moyoung.lib.videoeditor.editors.b
        public /* bridge */ /* synthetic */ void onProgress(String str) {
            com.moyoung.lib.videoeditor.editors.a.b(this, str);
        }

        @Override // com.moyoung.lib.videoeditor.editors.b
        public /* bridge */ /* synthetic */ void onStart() {
            com.moyoung.lib.videoeditor.editors.a.c(this);
        }

        @Override // com.moyoung.lib.videoeditor.editors.b
        public void onSuccess(String str) {
            LocalVideoEditActivity.this.addVideoPadding(this.val$croppedVideoFilePath, this.val$video264FilePath);
        }
    }

    class e implements com.moyoung.lib.videoeditor.editors.b {
        final /* synthetic */ String val$addedPaddingVideoFilePath;
        final /* synthetic */ String val$video264FilePath;

        e(String str, String str2) {
            this.val$addedPaddingVideoFilePath = str;
            this.val$video264FilePath = str2;
        }

        @Override // com.moyoung.lib.videoeditor.editors.b
        public void onFailure(String str) {
            r0.showShort(LocalVideoEditActivity.this.getApplicationContext(), str);
            if (LocalVideoEditActivity.this.progressDialog.isShowing()) {
                LocalVideoEditActivity.this.progressDialog.dismiss();
            }
        }

        @Override // com.moyoung.lib.videoeditor.editors.b
        public /* bridge */ /* synthetic */ void onFinish() {
            com.moyoung.lib.videoeditor.editors.a.a(this);
        }

        @Override // com.moyoung.lib.videoeditor.editors.b
        public /* bridge */ /* synthetic */ void onProgress(String str) {
            com.moyoung.lib.videoeditor.editors.a.b(this, str);
        }

        @Override // com.moyoung.lib.videoeditor.editors.b
        public /* bridge */ /* synthetic */ void onStart() {
            com.moyoung.lib.videoeditor.editors.a.c(this);
        }

        @Override // com.moyoung.lib.videoeditor.editors.b
        public void onSuccess(String str) {
            LocalVideoEditActivity.this.editCornerVideo(this.val$addedPaddingVideoFilePath, this.val$video264FilePath);
        }
    }

    class f implements com.moyoung.lib.videoeditor.editors.b {
        final /* synthetic */ String val$addedPaddingVideoFilePath;
        final /* synthetic */ String val$maskedVideoFilePath;
        final /* synthetic */ String val$video264FilePath;

        f(String str, String str2, String str3) {
            this.val$addedPaddingVideoFilePath = str;
            this.val$maskedVideoFilePath = str2;
            this.val$video264FilePath = str3;
        }

        @Override // com.moyoung.lib.videoeditor.editors.b
        public void onFailure(String str) {
            r0.showShort(LocalVideoEditActivity.this.getApplicationContext(), str);
        }

        @Override // com.moyoung.lib.videoeditor.editors.b
        public void onFinish() {
            new File(this.val$addedPaddingVideoFilePath).delete();
            if (LocalVideoEditActivity.this.progressDialog.isShowing()) {
                LocalVideoEditActivity.this.progressDialog.dismiss();
            }
        }

        @Override // com.moyoung.lib.videoeditor.editors.b
        public /* bridge */ /* synthetic */ void onProgress(String str) {
            com.moyoung.lib.videoeditor.editors.a.b(this, str);
        }

        @Override // com.moyoung.lib.videoeditor.editors.b
        public /* bridge */ /* synthetic */ void onStart() {
            com.moyoung.lib.videoeditor.editors.a.c(this);
        }

        @Override // com.moyoung.lib.videoeditor.editors.b
        public void onSuccess(String str) {
            File file = new File(this.val$maskedVideoFilePath);
            File createVideoFileToMd5File = LocalVideoModel.createVideoFileToMd5File(file);
            file.delete();
            if (createVideoFileToMd5File.length() > m.getAvailableSize() * 1024) {
                LocalVideoEditActivity.this.showLowStorageDialog();
                createVideoFileToMd5File.delete();
            } else {
                LocalVideoEditActivity.this.showUploadDialog(createVideoFileToMd5File);
                LocalVideoEditActivity.this.createMd5ImgFile(createVideoFileToMd5File, this.val$video264FilePath);
            }
        }
    }

    class g implements VideoUploadingDialog.a {
        g() {
        }

        @Override // com.crrepa.band.my.device.localvideo.VideoUploadingDialog.a
        public void onCanceled() {
        }

        @Override // com.crrepa.band.my.device.localvideo.VideoUploadingDialog.a
        public void onCompleted() {
            LocalVideoMainActivity.start(LocalVideoEditActivity.this);
            LocalVideoEditActivity.this.finish();
        }

        @Override // com.crrepa.band.my.device.localvideo.VideoUploadingDialog.a
        public /* bridge */ /* synthetic */ void onFailed() {
            s.a(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addVideoPadding(String str, String str2) {
        String addedPaddingVideoPathFromLocalVideo = LocalVideoModel.getAddedPaddingVideoPathFromLocalVideo();
        com.moyoung.lib.videoeditor.editors.bean.d dVar = new com.moyoung.lib.videoeditor.editors.bean.d();
        dVar.inputFilePath = str;
        dVar.outputFilePath = addedPaddingVideoPathFromLocalVideo;
        dVar.targetWidth = this.watchFaceW;
        dVar.targetHeight = this.watchFaceH;
        dVar.originalWidth = this.videoW;
        dVar.originalHeight = this.videoH;
        com.moyoung.lib.videoeditor.editors.i.addPadding(dVar, new e(addedPaddingVideoPathFromLocalVideo, str2));
    }

    private ProgressDialog buildEditingDialog() {
        String string = getString(R.string.device_video_watch_face_cutting_title);
        ProgressDialog show = ProgressDialog.show(this, "", string);
        this.progressDialog = show;
        show.setMessage(string);
        this.progressDialog.setCanceledOnTouchOutside(false);
        return this.progressDialog;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void createMd5ImgFile(File file, String str) {
        String name = file.getName();
        String substring = name.substring(0, name.lastIndexOf("."));
        com.moyoung.dafit.module.common.utils.g.saveBitmap(LocalVideoModel.getVideoThumbnail(str), new File(g0.getPicturesFilePath(com.moyoung.dafit.module.common.utils.d.get(), substring + ".png")));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void editCornerVideo(String str, String str2) {
        String maskedVideoPathFromLocalVideo = LocalVideoModel.getMaskedVideoPathFromLocalVideo();
        com.moyoung.lib.videoeditor.editors.i.editCorner(str, maskedVideoPathFromLocalVideo, LocalVideoModel.getCornerMaskImgPathFromLocalVideo(this.watchFaceW, this.watchFaceH, this.videoW, this.videoH, this.cornerRadius), new f(str, maskedVideoPathFromLocalVideo, str2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void editVideo(String str, long j8, long j9) {
        String croppedVideoPathFromLocalVideo = LocalVideoModel.getCroppedVideoPathFromLocalVideo();
        com.moyoung.lib.videoeditor.editors.bean.b bVar = new com.moyoung.lib.videoeditor.editors.bean.b(str, croppedVideoPathFromLocalVideo);
        bVar.isRemoveAudio = false;
        bVar.startMs = j8;
        bVar.endMs = j9;
        bVar.quality = getQuality(j9 - j8);
        Log.d("editVideo", "editBean.quality=" + bVar.quality);
        Rect scaledRect = ((ActivityLocalVideoEditBinding) this.binding).videoCropView.getScaledRect();
        int i8 = scaledRect.left;
        bVar.cropX = i8;
        int i9 = scaledRect.top;
        bVar.cropY = i9;
        bVar.cropWidth = scaledRect.right - i8;
        bVar.cropHeight = scaledRect.bottom - i9;
        bVar.targetWidth = this.videoW;
        bVar.targetHeight = this.videoH;
        getWindow().addFlags(128);
        com.moyoung.lib.videoeditor.editors.i.edit(bVar, new c(str, croppedVideoPathFromLocalVideo));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void encode264Video(String str) {
        String croppedVideoPathWith264FromLocalVideo = LocalVideoModel.getCroppedVideoPathWith264FromLocalVideo();
        com.moyoung.lib.videoeditor.editors.i.encode264(str, croppedVideoPathWith264FromLocalVideo, new d(str, croppedVideoPathWith264FromLocalVideo));
    }

    private static int getQuality(long j8) {
        if (j8 <= 10000) {
            return 1;
        }
        if (j8 <= 20000) {
            return 2;
        }
        if (j8 <= 30000) {
            return 3;
        }
        if (j8 <= 40000) {
            return 4;
        }
        return j8 <= ((long) 50000) ? 5 : 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$initBinding$0(MediaPlayer mediaPlayer, int i8, int i9) {
        this.isUnsupportedVideo = true;
        ((ActivityLocalVideoEditBinding) this.binding).tvFinish.setEnabled(false);
        ((ActivityLocalVideoEditBinding) this.binding).ivPlay.setEnabled(false);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$1(MediaPlayer mediaPlayer) {
        if (this.isUnsupportedVideo) {
            return;
        }
        ((ActivityLocalVideoEditBinding) this.binding).timeCutLayout.renderVideoThumbs(this.videoView.getDuration(), this.videoUri);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$2(MediaPlayer mediaPlayer) {
        if (this.isUnsupportedVideo) {
            return;
        }
        this.videoView.seekTo(((ActivityLocalVideoEditBinding) this.binding).timeCutLayout.getCutStartPos());
        ((ActivityLocalVideoEditBinding) this.binding).ivPlay.setImageResource(R$drawable.ic_watchface_video_play);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$3(View view) {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$4(View view) {
        if (BandBatteryProvider.isOtaLowBattery()) {
            r0.showShort(R.string.measure_low_battery_hint);
            return;
        }
        long cutStartPos = ((ActivityLocalVideoEditBinding) this.binding).timeCutLayout.getCutStartPos();
        long cutEndPos = ((ActivityLocalVideoEditBinding) this.binding).timeCutLayout.getCutEndPos();
        this.videoView.pause();
        buildEditingDialog().show();
        LocalVideoModel.queryVideoAbsolutePath(this.videoUri, LocalVideoModel.getLocalVideoTempDir(), new a(cutStartPos, cutEndPos));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$5(View view) {
        if (this.videoView.isPlaying()) {
            this.videoView.pause();
            ((ActivityLocalVideoEditBinding) this.binding).timeCutLayout.renderCursorPause();
            ((ActivityLocalVideoEditBinding) this.binding).ivPlay.setImageResource(R$drawable.ic_watchface_video_play);
        } else {
            this.videoView.start();
            ((ActivityLocalVideoEditBinding) this.binding).timeCutLayout.playCursorAnim();
            ((ActivityLocalVideoEditBinding) this.binding).ivPlay.setImageResource(R$drawable.ic_watchface_video_pause);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showLowStorageDialog() {
        CustomConfirmDialog customConfirmDialog = new CustomConfirmDialog(this);
        customConfirmDialog.setNoTitleMode();
        customConfirmDialog.hideCancelTv();
        customConfirmDialog.setIvIcon(R$drawable.ic_transfer_fail);
        customConfirmDialog.setContentTxt(R.string.watch_face_no_storage_space);
        customConfirmDialog.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showUploadDialog(File file) {
        VideoUploadingDialog videoUploadingDialog = new VideoUploadingDialog(this);
        videoUploadingDialog.show();
        videoUploadingDialog.uploadFile(file);
        videoUploadingDialog.setListener(new g());
    }

    public static void start(Context context, Uri uri) {
        Intent intent = new Intent(context, (Class<?>) LocalVideoEditActivity.class);
        intent.putExtra(VIDEO_URI_KEY, uri);
        context.startActivity(intent);
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void initBinding() {
        k0.setColor(this, -16777216);
        VideoView videoView = ((ActivityLocalVideoEditBinding) this.binding).videoCropView.getVideoSlideView().getVideoView();
        this.videoView = videoView;
        videoView.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: com.crrepa.band.my.device.localvideo.b
            @Override // android.media.MediaPlayer.OnErrorListener
            public final boolean onError(MediaPlayer mediaPlayer, int i8, int i9) {
                boolean lambda$initBinding$0;
                lambda$initBinding$0 = LocalVideoEditActivity.this.lambda$initBinding$0(mediaPlayer, i8, i9);
                return lambda$initBinding$0;
            }
        });
        ((ActivityLocalVideoEditBinding) this.binding).videoCropView.getVideoSlideView().setPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: com.crrepa.band.my.device.localvideo.c
            @Override // android.media.MediaPlayer.OnPreparedListener
            public final void onPrepared(MediaPlayer mediaPlayer) {
                LocalVideoEditActivity.this.lambda$initBinding$1(mediaPlayer);
            }
        });
        this.videoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: com.crrepa.band.my.device.localvideo.d
            @Override // android.media.MediaPlayer.OnCompletionListener
            public final void onCompletion(MediaPlayer mediaPlayer) {
                LocalVideoEditActivity.this.lambda$initBinding$2(mediaPlayer);
            }
        });
        ((ActivityLocalVideoEditBinding) this.binding).tvCancel.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.localvideo.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LocalVideoEditActivity.this.lambda$initBinding$3(view);
            }
        });
        ((ActivityLocalVideoEditBinding) this.binding).tvFinish.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.localvideo.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LocalVideoEditActivity.this.lambda$initBinding$4(view);
            }
        });
        ((ActivityLocalVideoEditBinding) this.binding).ivPlay.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.localvideo.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LocalVideoEditActivity.this.lambda$initBinding$5(view);
            }
        });
        ((ActivityLocalVideoEditBinding) this.binding).timeCutLayout.setVideoMaxSecond(m.getVideoMaxDuration());
        ((ActivityLocalVideoEditBinding) this.binding).timeCutLayout.setProgressChangeListener(new b());
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void loadData() {
        this.videoUri = (Uri) getIntent().getParcelableExtra(VIDEO_URI_KEY);
        CRPLocalVideoInfo cRPLocalVideoInfo = m.getCRPLocalVideoInfo();
        this.videoW = cRPLocalVideoInfo.getVideoWidth();
        this.videoH = cRPLocalVideoInfo.getVideoHeight();
        this.watchFaceW = cRPLocalVideoInfo.getWidth();
        this.watchFaceH = cRPLocalVideoInfo.getHeight();
        this.cornerRadius = cRPLocalVideoInfo.getVideoCornerRadius();
        int dp2px = com.moyoung.dafit.module.common.utils.o.dp2px(getApplicationContext(), 245.0f);
        int i8 = this.videoH;
        int i9 = this.videoW;
        float f8 = (i8 / i9) * dp2px;
        if (LocalVideoModel.isCircleVideo(i9, i8, this.cornerRadius)) {
            ((ActivityLocalVideoEditBinding) this.binding).videoCropView.setCircleCropFrame(dp2px, (int) f8);
        } else {
            ((ActivityLocalVideoEditBinding) this.binding).videoCropView.setCornerCropFrame(dp2px, (int) f8, this.cornerRadius);
        }
        ((ActivityLocalVideoEditBinding) this.binding).videoCropView.setupVideo(this.videoUri, false);
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        ((ActivityLocalVideoEditBinding) this.binding).timeCutLayout.destroy();
        getWindow().clearFlags(128);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onStop() {
        super.onStop();
        this.videoView.seekTo(((ActivityLocalVideoEditBinding) this.binding).timeCutLayout.getCutStartPos());
        ((ActivityLocalVideoEditBinding) this.binding).timeCutLayout.renderCursorPause();
        ((ActivityLocalVideoEditBinding) this.binding).ivPlay.setImageResource(R$drawable.ic_watchface_video_play);
    }
}
