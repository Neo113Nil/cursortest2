package com.crrepa.band.my.device.watchfacenew.video;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.media.MediaPlayer;
import android.net.Uri;
import android.view.View;
import android.widget.VideoView;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.R$drawable;
import com.crrepa.band.my.databinding.ActivityNewWatchFaceVideoEditBinding;
import com.crrepa.band.my.device.watchfacenew.video.model.LocalVideoModel;
import com.crrepa.band.my.device.watchfacenew.video.model.VideoEditedEvent;
import com.crrepa.band.my.device.watchfacenew.video.widgets.TimeCutLayout;
import com.moyoung.dafit.module.common.baseui.BaseVBActivity;
import com.moyoung.dafit.module.common.utils.k0;
import com.moyoung.dafit.module.common.utils.r0;
import java.io.File;

/* loaded from: classes2.dex */
public class VideoWatchFaceEditActivity extends BaseVBActivity<ActivityNewWatchFaceVideoEditBinding> {
    private static final String VIDEO_URI_KEY = "video-uri";
    private int cornerRadius;
    private ProgressDialog progressDialog;
    private Uri videoUri;
    private int watchFaceW = 466;
    private int watchFaceH = 466;
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
            if (VideoWatchFaceEditActivity.this.progressDialog != null && VideoWatchFaceEditActivity.this.progressDialog.isShowing()) {
                VideoWatchFaceEditActivity.this.progressDialog.dismiss();
            }
            r0.showShort("没有获取到视频绝对路径");
        }

        @Override // com.crrepa.band.my.device.watchfacenew.video.model.LocalVideoModel.Callback
        public void onSuccess(String str) {
            VideoWatchFaceEditActivity.this.editVideo(str, this.val$startMs, this.val$endMs);
        }
    }

    class b implements TimeCutLayout.d {
        final /* synthetic */ VideoView val$videoView;

        b(VideoView videoView) {
            this.val$videoView = videoView;
        }

        @Override // com.crrepa.band.my.device.watchfacenew.video.widgets.TimeCutLayout.d
        public void onCursorPlayFinished() {
            this.val$videoView.pause();
            this.val$videoView.seekTo(((ActivityNewWatchFaceVideoEditBinding) ((BaseVBActivity) VideoWatchFaceEditActivity.this).binding).timeCutLayout.getCutStartPos());
            ((ActivityNewWatchFaceVideoEditBinding) ((BaseVBActivity) VideoWatchFaceEditActivity.this).binding).ivPlay.setImageResource(R$drawable.ic_watchface_video_play);
        }

        @Override // com.crrepa.band.my.device.watchfacenew.video.widgets.TimeCutLayout.d
        public void onSeek(int i8) {
            this.val$videoView.pause();
            this.val$videoView.seekTo(i8);
            ((ActivityNewWatchFaceVideoEditBinding) ((BaseVBActivity) VideoWatchFaceEditActivity.this).binding).ivPlay.setImageResource(R$drawable.ic_watchface_video_play);
        }
    }

    class c implements com.moyoung.lib.videoeditor.editors.b {
        final /* synthetic */ String val$outputFilePath;
        final /* synthetic */ String val$videoPath;

        c(String str, String str2) {
            this.val$videoPath = str;
            this.val$outputFilePath = str2;
        }

        @Override // com.moyoung.lib.videoeditor.editors.b
        public void onFailure(String str) {
            r0.showShort(VideoWatchFaceEditActivity.this.getApplicationContext(), str);
            if (VideoWatchFaceEditActivity.this.progressDialog.isShowing()) {
                VideoWatchFaceEditActivity.this.progressDialog.dismiss();
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
            VideoWatchFaceEditActivity.this.encode264Video(this.val$outputFilePath);
        }
    }

    class d implements com.moyoung.lib.videoeditor.editors.b {
        final /* synthetic */ String val$inputFilePath;

        d(String str) {
            this.val$inputFilePath = str;
        }

        @Override // com.moyoung.lib.videoeditor.editors.b
        public void onFailure(String str) {
            r0.showShort(VideoWatchFaceEditActivity.this.getApplicationContext(), str);
        }

        @Override // com.moyoung.lib.videoeditor.editors.b
        public void onFinish() {
            if (VideoWatchFaceEditActivity.this.progressDialog.isShowing()) {
                VideoWatchFaceEditActivity.this.progressDialog.dismiss();
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
            VideoWatchFaceEditActivity.this.editCornerVideo(this.val$inputFilePath);
        }
    }

    class e implements com.moyoung.lib.videoeditor.editors.b {
        final /* synthetic */ String val$inputFilePath;
        final /* synthetic */ String val$outputFilePath;

        e(String str, String str2) {
            this.val$inputFilePath = str;
            this.val$outputFilePath = str2;
        }

        @Override // com.moyoung.lib.videoeditor.editors.b
        public void onFailure(String str) {
            r0.showShort(VideoWatchFaceEditActivity.this.getApplicationContext(), str);
            if (VideoWatchFaceEditActivity.this.progressDialog.isShowing()) {
                VideoWatchFaceEditActivity.this.progressDialog.dismiss();
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
            new File(this.val$inputFilePath).delete();
            org.greenrobot.eventbus.c.getDefault().post(new VideoEditedEvent(this.val$outputFilePath));
            VideoWatchFaceEditActivity.this.finish();
        }
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
    public void editCornerVideo(String str) {
        String circleMaskPath = com.crrepa.band.my.ble.band.utils.a.getInstance().isCircleScreen() ? LocalVideoModel.getCircleMaskPath(this.watchFaceW, this.watchFaceH) : LocalVideoModel.getCornerMaskPath(this.watchFaceW, this.watchFaceH, this.cornerRadius);
        String croppedVideoPath = LocalVideoModel.getCroppedVideoPath();
        com.moyoung.lib.videoeditor.editors.i.editCorner(str, croppedVideoPath, circleMaskPath, new e(str, croppedVideoPath));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void editVideo(String str, long j8, long j9) {
        String croppedVideoTempPath = LocalVideoModel.getCroppedVideoTempPath();
        com.moyoung.lib.videoeditor.editors.bean.b bVar = new com.moyoung.lib.videoeditor.editors.bean.b(str, croppedVideoTempPath);
        bVar.startMs = j8;
        bVar.endMs = j9;
        bVar.quality = 1;
        Rect scaledRect = ((ActivityNewWatchFaceVideoEditBinding) this.binding).videoCropView.getScaledRect();
        int i8 = scaledRect.left;
        bVar.cropX = i8;
        int i9 = scaledRect.top;
        bVar.cropY = i9;
        bVar.cropWidth = scaledRect.right - i8;
        bVar.cropHeight = scaledRect.bottom - i9;
        bVar.targetWidth = this.watchFaceW;
        bVar.targetHeight = this.watchFaceH;
        getWindow().addFlags(128);
        com.moyoung.lib.videoeditor.editors.i.edit(bVar, new c(str, croppedVideoTempPath));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void encode264Video(String str) {
        com.moyoung.lib.videoeditor.editors.i.encode264(str, LocalVideoModel.getCroppedVideoPreviewPath(), new d(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$initBinding$0(MediaPlayer mediaPlayer, int i8, int i9) {
        this.isUnsupportedVideo = true;
        ((ActivityNewWatchFaceVideoEditBinding) this.binding).tvFinish.setEnabled(false);
        ((ActivityNewWatchFaceVideoEditBinding) this.binding).ivPlay.setEnabled(false);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$1(VideoView videoView, MediaPlayer mediaPlayer) {
        if (this.isUnsupportedVideo) {
            return;
        }
        ((ActivityNewWatchFaceVideoEditBinding) this.binding).timeCutLayout.renderVideoThumbs(videoView.getDuration(), this.videoUri);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$2(VideoView videoView, MediaPlayer mediaPlayer) {
        if (this.isUnsupportedVideo) {
            return;
        }
        videoView.seekTo(((ActivityNewWatchFaceVideoEditBinding) this.binding).timeCutLayout.getCutStartPos());
        ((ActivityNewWatchFaceVideoEditBinding) this.binding).ivPlay.setImageResource(R$drawable.ic_watchface_video_play);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$3(View view) {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$4(VideoView videoView, View view) {
        long cutStartPos = ((ActivityNewWatchFaceVideoEditBinding) this.binding).timeCutLayout.getCutStartPos();
        long cutEndPos = ((ActivityNewWatchFaceVideoEditBinding) this.binding).timeCutLayout.getCutEndPos();
        videoView.pause();
        buildEditingDialog().show();
        LocalVideoModel.queryVideoAbsolutePath(this.videoUri, LocalVideoModel.getVideoWatchFaceTempDir(), new a(cutStartPos, cutEndPos));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$5(VideoView videoView, View view) {
        if (videoView.isPlaying()) {
            videoView.pause();
            ((ActivityNewWatchFaceVideoEditBinding) this.binding).timeCutLayout.renderCursorPause();
            ((ActivityNewWatchFaceVideoEditBinding) this.binding).ivPlay.setImageResource(R$drawable.ic_watchface_video_play);
        } else {
            videoView.start();
            ((ActivityNewWatchFaceVideoEditBinding) this.binding).timeCutLayout.playCursorAnim();
            ((ActivityNewWatchFaceVideoEditBinding) this.binding).ivPlay.setImageResource(R$drawable.ic_watchface_video_pause);
        }
    }

    public static void start(Context context, Uri uri) {
        Intent intent = new Intent(context, (Class<?>) VideoWatchFaceEditActivity.class);
        intent.putExtra(VIDEO_URI_KEY, uri);
        context.startActivity(intent);
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void initBinding() {
        k0.setColor(this, -16777216);
        final VideoView videoView = ((ActivityNewWatchFaceVideoEditBinding) this.binding).videoCropView.getVideoSlideView().getVideoView();
        videoView.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: com.crrepa.band.my.device.watchfacenew.video.c
            @Override // android.media.MediaPlayer.OnErrorListener
            public final boolean onError(MediaPlayer mediaPlayer, int i8, int i9) {
                boolean lambda$initBinding$0;
                lambda$initBinding$0 = VideoWatchFaceEditActivity.this.lambda$initBinding$0(mediaPlayer, i8, i9);
                return lambda$initBinding$0;
            }
        });
        ((ActivityNewWatchFaceVideoEditBinding) this.binding).videoCropView.getVideoSlideView().setPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: com.crrepa.band.my.device.watchfacenew.video.d
            @Override // android.media.MediaPlayer.OnPreparedListener
            public final void onPrepared(MediaPlayer mediaPlayer) {
                VideoWatchFaceEditActivity.this.lambda$initBinding$1(videoView, mediaPlayer);
            }
        });
        videoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: com.crrepa.band.my.device.watchfacenew.video.e
            @Override // android.media.MediaPlayer.OnCompletionListener
            public final void onCompletion(MediaPlayer mediaPlayer) {
                VideoWatchFaceEditActivity.this.lambda$initBinding$2(videoView, mediaPlayer);
            }
        });
        ((ActivityNewWatchFaceVideoEditBinding) this.binding).tvCancel.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.watchfacenew.video.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VideoWatchFaceEditActivity.this.lambda$initBinding$3(view);
            }
        });
        ((ActivityNewWatchFaceVideoEditBinding) this.binding).tvFinish.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.watchfacenew.video.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VideoWatchFaceEditActivity.this.lambda$initBinding$4(videoView, view);
            }
        });
        ((ActivityNewWatchFaceVideoEditBinding) this.binding).ivPlay.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.watchfacenew.video.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VideoWatchFaceEditActivity.this.lambda$initBinding$5(videoView, view);
            }
        });
        ((ActivityNewWatchFaceVideoEditBinding) this.binding).timeCutLayout.setProgressChangeListener(new b(videoView));
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void loadData() {
        this.videoUri = (Uri) getIntent().getParcelableExtra(VIDEO_URI_KEY);
        this.watchFaceW = com.crrepa.band.my.device.watchfacenew.delegate.img.i.getScreenWidth();
        this.watchFaceH = com.crrepa.band.my.device.watchfacenew.delegate.img.i.getScreenHeight();
        int dp2px = com.moyoung.dafit.module.common.utils.o.dp2px(getApplicationContext(), 245.0f);
        float f8 = (this.watchFaceH / this.watchFaceW) * dp2px;
        if (com.crrepa.band.my.ble.band.utils.a.getInstance().isCircleScreen()) {
            ((ActivityNewWatchFaceVideoEditBinding) this.binding).videoCropView.setCircleCropFrame(dp2px, (int) f8);
        } else {
            int cornerRadius = com.crrepa.band.my.device.watchfacenew.delegate.img.i.getCornerRadius();
            this.cornerRadius = cornerRadius;
            ((ActivityNewWatchFaceVideoEditBinding) this.binding).videoCropView.setCornerCropFrame(dp2px, (int) f8, cornerRadius);
        }
        ((ActivityNewWatchFaceVideoEditBinding) this.binding).videoCropView.setupVideo(this.videoUri);
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        ((ActivityNewWatchFaceVideoEditBinding) this.binding).timeCutLayout.destroy();
        getWindow().clearFlags(128);
    }
}
