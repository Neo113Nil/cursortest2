package com.unity3d.player;

import android.app.Activity;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.graphics.Point;
import android.media.AudioAttributes;
import android.media.MediaPlayer;
import android.net.Uri;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.widget.FrameLayout;
import android.widget.MediaController;
import java.io.FileInputStream;
import java.io.IOException;
import kotlin.KotlinVersion;

/* loaded from: classes2.dex */
public class VideoPlayer extends FrameLayout implements MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnVideoSizeChangedListener, SurfaceHolder.Callback, MediaController.MediaPlayerControl {
    private static final int CTRL_CANCELONTOUCH = 2;
    private static final int CTRL_FULL = 0;
    private static final int CTRL_HIDDEN = 3;
    private static final int CTRL_MINIMAL = 1;
    private static boolean LOG = false;
    private static final String LOGTAG = "Video";
    public static final int PLAYBACK_DONE = 3;
    public static final int PLAYBACK_FAILED = 2;
    public static final int PLAYBACK_STARTED = 1;
    public static final int PLAYBACK_STARTING = 0;
    private static final int SCALE_ASPECTFILL = 2;
    private static final int SCALE_ASPECTFIT = 1;
    private static final int SCALE_FILL = 3;
    private static final int SCALE_NONE = 0;
    private V0 _timeoutThread;
    private int mBufferPercentage;
    private final Context mContext;
    private final int mControlMode;
    private final String mFileName;
    private final FrameLayout mFrameLayout;
    private final boolean mIsURL;
    private boolean mIsVideoReadyToBePlayed;
    private boolean mIsVideoSizeKnown;
    private int mLatestVideoPosition;
    private MediaController mMediaController;
    private MediaPlayer mMediaPlayer;
    private h1.X mOnBackPressedDispatcher;
    private boolean mPlaybackPaused;
    private final int mScalingMode;
    private volatile int mState;
    private U0 mStateCallback;
    private boolean mSurfaceCreated;
    private int mSurfaceHeight;
    private int mSurfaceWidth;
    private int mVideoHeight;
    private final SurfaceHolder mVideoHolder;
    private final long mVideoLength;
    private final long mVideoOffset;
    private final SurfaceView mVideoView;
    private int mVideoWidth;

    protected VideoPlayer(Context context, UnityPlayer unityPlayer, String str, int i4, int i5, int i6, boolean z4, long j4, long j5, U0 u02) {
        super(context);
        this.mIsVideoSizeKnown = false;
        this.mIsVideoReadyToBePlayed = false;
        this.mBufferPercentage = 0;
        this.mPlaybackPaused = false;
        this.mLatestVideoPosition = 0;
        this.mSurfaceCreated = false;
        this.mOnBackPressedDispatcher = null;
        this.mState = 0;
        this.mStateCallback = u02;
        this.mContext = context;
        this.mFrameLayout = this;
        SurfaceView surfaceView = new SurfaceView(context);
        this.mVideoView = surfaceView;
        SurfaceHolder holder = surfaceView.getHolder();
        this.mVideoHolder = holder;
        holder.addCallback(this);
        setBackgroundColor(i4);
        addView(surfaceView);
        this.mFileName = str;
        this.mControlMode = i5;
        this.mScalingMode = i6;
        this.mIsURL = z4;
        this.mVideoOffset = j4;
        this.mVideoLength = j5;
        if (LOG) {
            Log("fileName: " + str);
        }
        if (LOG) {
            Log("backgroundColor: " + i4);
        }
        if (LOG) {
            Log("controlMode: " + i5);
        }
        if (LOG) {
            Log("scalingMode: " + i6);
        }
        if (LOG) {
            Log("isURL: " + z4);
        }
        if (LOG) {
            Log("videoOffset: " + j4);
        }
        if (LOG) {
            Log("videoLength: " + j5);
        }
        setFocusable(true);
        setFocusableInTouchMode(true);
        this.mOnBackPressedDispatcher = C1770q.a(unityPlayer.getActivity(), 1000000, new T0(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void Log(String str) {
        Log.i(LOGTAG, "VideoPlayer: " + str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void changeState(int i4) {
        this.mState = i4;
        U0 u02 = this.mStateCallback;
        if (u02 != null) {
            int i5 = this.mState;
            X0 x02 = (X0) u02;
            x02.f22122a.f22131h.f22154e.lock();
            C1733c1 c1733c1 = x02.f22122a.f22131h;
            c1733c1.f22156g = i5;
            if (i5 == 3 && c1733c1.f22158i) {
                c1733c1.runOnUiThread(new W0(x02));
            }
            if (i5 != 0) {
                x02.f22122a.f22131h.f22153d.release();
            }
            x02.f22122a.f22131h.f22154e.unlock();
        }
    }

    private void logUsedInTests(String str) {
        if (LOG) {
            Log(str);
        }
    }

    private void pauseMediaPlayer() {
        this.mLatestVideoPosition = this.mMediaPlayer.getCurrentPosition();
        this.mMediaPlayer.pause();
        logUsedInTests("pauseMediaPlayer");
    }

    private void playVideo() {
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        if (mediaPlayer != null) {
            mediaPlayer.setDisplay(this.mVideoHolder);
            if (this.mPlaybackPaused) {
                return;
            }
            if (LOG) {
                Log("Resuming playback");
            }
            startMediaPlayer();
            return;
        }
        changeState(0);
        doCleanUp();
        try {
            MediaPlayer mediaPlayer2 = new MediaPlayer();
            this.mMediaPlayer = mediaPlayer2;
            if (this.mIsURL) {
                mediaPlayer2.setDataSource(this.mContext, Uri.parse(this.mFileName));
            } else if (this.mVideoLength != 0) {
                FileInputStream fileInputStream = new FileInputStream(this.mFileName);
                this.mMediaPlayer.setDataSource(fileInputStream.getFD(), this.mVideoOffset, this.mVideoLength);
                fileInputStream.close();
            } else {
                try {
                    AssetFileDescriptor openFd = getResources().getAssets().openFd(this.mFileName);
                    this.mMediaPlayer.setDataSource(openFd.getFileDescriptor(), openFd.getStartOffset(), openFd.getLength());
                    openFd.close();
                } catch (IOException unused) {
                    FileInputStream fileInputStream2 = new FileInputStream(this.mFileName);
                    this.mMediaPlayer.setDataSource(fileInputStream2.getFD());
                    fileInputStream2.close();
                }
            }
            this.mMediaPlayer.setDisplay(this.mVideoHolder);
            this.mMediaPlayer.setScreenOnWhilePlaying(true);
            this.mMediaPlayer.setOnBufferingUpdateListener(this);
            this.mMediaPlayer.setOnCompletionListener(this);
            this.mMediaPlayer.setOnPreparedListener(this);
            this.mMediaPlayer.setOnVideoSizeChangedListener(this);
            this.mMediaPlayer.setAudioAttributes(new AudioAttributes.Builder().setUsage(1).setContentType(3).build());
            this.mMediaPlayer.prepareAsync();
            this._timeoutThread = new V0(this);
            new Thread(this._timeoutThread).start();
        } catch (Exception e4) {
            if (LOG) {
                Log("error: " + e4.getMessage() + e4);
            }
            changeState(2);
        }
    }

    private void printResumingInformation() {
        logUsedInTests(String.format("MediaPlayer resume : {latestPosition=%d} {currentPosition=%d}", Integer.valueOf(this.mLatestVideoPosition), Integer.valueOf(this.mMediaPlayer.getCurrentPosition())));
    }

    private void resumeVideoInPauseMode() {
        if (LOG) {
            Log("resumeVideoInPauseMode");
        }
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        if (mediaPlayer == null || !this.mSurfaceCreated || this.mLatestVideoPosition <= 0) {
            return;
        }
        mediaPlayer.setDisplay(this.mVideoHolder);
        this.mMediaPlayer.seekTo(this.mLatestVideoPosition);
        printResumingInformation();
    }

    private void startMediaPlayer() {
        logUsedInTests("startMediaPlayer");
        int i4 = this.mLatestVideoPosition;
        if (i4 > 0) {
            this.mMediaPlayer.seekTo(i4);
            printResumingInformation();
        }
        this.mMediaPlayer.start();
        this.mLatestVideoPosition = 0;
    }

    private void startVideoPlayback() {
        if (isPlaying()) {
            return;
        }
        changeState(1);
        if (LOG) {
            Log("startVideoPlayback");
        }
        updateVideoLayout();
        if (this.mPlaybackPaused) {
            return;
        }
        start();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canPause() {
        return true;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canSeekBackward() {
        return true;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canSeekForward() {
        return true;
    }

    public void cancelOnPrepare() {
        changeState(2);
    }

    protected void destroyPlayer() {
        if (LOG) {
            Log("destroyPlayer");
        }
        if (!this.mPlaybackPaused) {
            pause();
        }
        doCleanUp();
        h1.X x4 = this.mOnBackPressedDispatcher;
        if (x4 != null) {
            x4.unregisterOnBackPressedCallback();
            this.mOnBackPressedDispatcher = null;
        }
    }

    protected void doCleanUp() {
        V0 v02 = this._timeoutThread;
        if (v02 != null) {
            v02.f22101b = true;
            this._timeoutThread = null;
        }
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        if (mediaPlayer != null) {
            mediaPlayer.reset();
            this.mMediaPlayer.release();
            this.mMediaPlayer = null;
        }
        this.mVideoWidth = 0;
        this.mVideoHeight = 0;
        this.mIsVideoReadyToBePlayed = false;
        this.mIsVideoSizeKnown = false;
    }

    public boolean exitOnKeypress(int i4, KeyEvent keyEvent) {
        Runnable runnable;
        if (i4 != 4 && (this.mControlMode != 2 || i4 == 0 || keyEvent.isSystem())) {
            return false;
        }
        h1.W w4 = this.mOnBackPressedDispatcher.f36724a;
        if (w4 == null || (runnable = w4.f36723a) == null) {
            return true;
        }
        runnable.run();
        return true;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getAudioSessionId() {
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        if (mediaPlayer == null) {
            return 0;
        }
        return mediaPlayer.getAudioSessionId();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getBufferPercentage() {
        if (this.mIsURL) {
            return this.mBufferPercentage;
        }
        return 100;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getCurrentPosition() {
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        if (mediaPlayer == null) {
            return 0;
        }
        return mediaPlayer.getCurrentPosition();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getDuration() {
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        if (mediaPlayer == null) {
            return 0;
        }
        return mediaPlayer.getDuration();
    }

    boolean isPaused() {
        return this.mPlaybackPaused;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean isPlaying() {
        boolean z4 = this.mIsVideoReadyToBePlayed && this.mIsVideoSizeKnown;
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        return mediaPlayer == null ? !z4 : mediaPlayer.isPlaying() || !z4;
    }

    @Override // android.media.MediaPlayer.OnBufferingUpdateListener
    public void onBufferingUpdate(MediaPlayer mediaPlayer, int i4) {
        if (LOG) {
            Log("onBufferingUpdate percent:" + i4);
        }
        this.mBufferPercentage = i4;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public void onCompletion(MediaPlayer mediaPlayer) {
        if (LOG) {
            Log("onCompletion called");
        }
        destroyPlayer();
        changeState(3);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i4, KeyEvent keyEvent) {
        MediaController mediaController = this.mMediaController;
        return mediaController != null ? mediaController.onKeyDown(i4, keyEvent) : super.onKeyDown(i4, keyEvent);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i4, KeyEvent keyEvent) {
        if (exitOnKeypress(i4, keyEvent)) {
            return true;
        }
        MediaController mediaController = this.mMediaController;
        return mediaController != null ? mediaController.onKeyUp(i4, keyEvent) : super.onKeyUp(i4, keyEvent);
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public void onPrepared(MediaPlayer mediaPlayer) {
        if (LOG) {
            Log("onPrepared called");
        }
        V0 v02 = this._timeoutThread;
        if (v02 != null) {
            v02.f22101b = true;
            this._timeoutThread = null;
        }
        int i4 = this.mControlMode;
        if (i4 == 0 || i4 == 1) {
            MediaController mediaController = new MediaController(this.mContext);
            this.mMediaController = mediaController;
            mediaController.setMediaPlayer(this);
            this.mMediaController.setAnchorView(this);
            this.mMediaController.setEnabled(true);
            if (!PlatformSupport.RED_VELVET_CAKE_SUPPORT) {
                Context context = this.mContext;
                if (context instanceof Activity) {
                    this.mMediaController.setSystemUiVisibility(((Activity) context).getWindow().getDecorView().getSystemUiVisibility());
                }
            }
            this.mMediaController.show();
        }
        this.mIsVideoReadyToBePlayed = true;
        if (this.mIsVideoSizeKnown) {
            startVideoPlayback();
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & KotlinVersion.MAX_COMPONENT_VALUE;
        if (this.mControlMode != 2 || action != 0) {
            MediaController mediaController = this.mMediaController;
            return mediaController != null ? mediaController.onTouchEvent(motionEvent) : super.onTouchEvent(motionEvent);
        }
        destroyPlayer();
        changeState(3);
        return true;
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i4, int i5) {
        if (LOG) {
            Log("onVideoSizeChanged called " + i4 + "x" + i5);
        }
        if (i4 != 0 && i5 != 0) {
            this.mIsVideoSizeKnown = true;
            this.mVideoWidth = i4;
            this.mVideoHeight = i5;
            if (this.mIsVideoReadyToBePlayed) {
                startVideoPlayback();
                return;
            }
            return;
        }
        if (LOG) {
            Log("invalid video width(" + i4 + ") or height(" + i5 + ")");
        }
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void pause() {
        if (this.mMediaPlayer == null) {
            return;
        }
        if (this.mSurfaceCreated) {
            pauseMediaPlayer();
        }
        this.mPlaybackPaused = true;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void seekTo(int i4) {
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        if (mediaPlayer == null) {
            return;
        }
        mediaPlayer.seekTo(i4);
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void start() {
        if (LOG) {
            Log("Start");
        }
        if (this.mMediaPlayer == null) {
            return;
        }
        if (this.mSurfaceCreated) {
            startMediaPlayer();
        }
        this.mPlaybackPaused = false;
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i4, int i5, int i6) {
        if (LOG) {
            Log("surfaceChanged called " + i4 + " " + i5 + "x" + i6);
        }
        if (this.mSurfaceWidth == i5 && this.mSurfaceHeight == i6) {
            return;
        }
        this.mSurfaceWidth = i5;
        this.mSurfaceHeight = i6;
        if (this.mSurfaceCreated) {
            updateVideoLayout();
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        if (LOG) {
            Log("surfaceCreated called");
        }
        this.mSurfaceCreated = true;
        if (this.mPlaybackPaused) {
            resumeVideoInPauseMode();
        } else {
            playVideo();
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        if (LOG) {
            Log("surfaceDestroyed called");
        }
        this.mSurfaceCreated = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
    
        if (r7 <= r3) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0047, code lost:
    
        r0 = (int) (r6 * r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0044, code lost:
    
        r1 = (int) (r5 / r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0042, code lost:
    
        if (r7 >= r3) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void updateVideoLayout() {
        int i4;
        if (LOG) {
            Log("updateVideoLayout");
        }
        if (this.mMediaPlayer == null) {
            return;
        }
        Point a4 = AbstractC1736d1.a(this.mContext);
        int i5 = a4.x;
        if (i5 > 0 && (i4 = a4.y) > 0) {
            this.mSurfaceWidth = i5;
            this.mSurfaceHeight = i4;
        }
        int i6 = this.mSurfaceWidth;
        int i7 = this.mSurfaceHeight;
        if (this.mIsVideoSizeKnown) {
            int i8 = this.mVideoWidth;
            int i9 = this.mVideoHeight;
            float f4 = i8 / i9;
            float f5 = i6;
            float f6 = i7;
            float f7 = f5 / f6;
            int i10 = this.mScalingMode;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 0) {
                        i6 = i8;
                        i7 = i9;
                    }
                }
            }
        } else if (LOG) {
            Log("updateVideoLayout: Video size is not known yet");
        }
        if (this.mSurfaceWidth == i6 && this.mSurfaceHeight == i7) {
            return;
        }
        if (LOG) {
            Log("frameWidth = " + i6 + "; frameHeight = " + i7);
        }
        this.mFrameLayout.updateViewLayout(this.mVideoView, new FrameLayout.LayoutParams(i6, i7, 17));
    }
}
