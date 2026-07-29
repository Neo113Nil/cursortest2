package com.unity3d.player;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.MediaPlayer;
import android.net.Uri;
import android.util.Log;
import android.view.Display;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.MediaController;
import com.aiming.mdt.utils.Constants;
import java.io.FileInputStream;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class n extends FrameLayout implements MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnVideoSizeChangedListener, SurfaceHolder.Callback, MediaController.MediaPlayerControl {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f9391a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f9392b;

    /* renamed from: c, reason: collision with root package name */
    private final SurfaceView f9393c;

    /* renamed from: d, reason: collision with root package name */
    private final SurfaceHolder f9394d;
    private final String e;
    private final int f;
    private final int g;
    private final boolean h;
    private final long i;
    private final long j;
    private final FrameLayout k;
    private final Display l;
    private int m;
    private int n;
    private int o;
    private int p;
    private MediaPlayer q;
    private MediaController r;
    private boolean s;
    private boolean t;
    private int u;
    private boolean v;
    private boolean w;
    private a x;
    private b y;
    private volatile int z;

    public interface a {
        void a(int i);
    }

    public class b implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        private n f9396b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f9397c = false;

        public b(n nVar) {
            this.f9396b = nVar;
        }

        public final void a() {
            this.f9397c = true;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                Thread.sleep(5000L);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
            if (this.f9397c) {
                return;
            }
            if (n.f9391a) {
                n.b("Stopping the video player due to timeout.");
            }
            this.f9396b.CancelOnPrepare();
        }
    }

    protected n(Context context, String str, int i, int i2, int i3, boolean z, long j, long j2, a aVar) {
        super(context);
        this.s = false;
        this.t = false;
        this.u = 0;
        this.v = false;
        this.w = false;
        this.z = 0;
        this.x = aVar;
        this.f9392b = context;
        this.k = this;
        this.f9393c = new SurfaceView(context);
        this.f9394d = this.f9393c.getHolder();
        this.f9394d.addCallback(this);
        this.f9394d.setType(3);
        this.k.setBackgroundColor(i);
        this.k.addView(this.f9393c);
        this.l = ((WindowManager) this.f9392b.getSystemService("window")).getDefaultDisplay();
        this.e = str;
        this.f = i2;
        this.g = i3;
        this.h = z;
        this.i = j;
        this.j = j2;
        if (f9391a) {
            b("fileName: " + this.e);
        }
        if (f9391a) {
            b("backgroundColor: " + i);
        }
        if (f9391a) {
            b("controlMode: " + this.f);
        }
        if (f9391a) {
            b("scalingMode: " + this.g);
        }
        if (f9391a) {
            b("isURL: " + this.h);
        }
        if (f9391a) {
            b("videoOffset: " + this.i);
        }
        if (f9391a) {
            b("videoLength: " + this.j);
        }
        setFocusable(true);
        setFocusableInTouchMode(true);
    }

    private void a(int i) {
        this.z = i;
        if (this.x != null) {
            this.x.a(this.z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(String str) {
        Log.i(Constants.ADTYPE_VIDEO, "VideoPlayer: " + str);
    }

    private void c() {
        FileInputStream fileInputStream;
        if (this.q != null) {
            this.q.setDisplay(this.f9394d);
            if (this.v) {
                return;
            }
            if (f9391a) {
                b("Resuming playback");
            }
            this.q.start();
            return;
        }
        a(0);
        doCleanUp();
        try {
            this.q = new MediaPlayer();
            if (this.h) {
                this.q.setDataSource(this.f9392b, Uri.parse(this.e));
            } else {
                if (this.j != 0) {
                    fileInputStream = new FileInputStream(this.e);
                    this.q.setDataSource(fileInputStream.getFD(), this.i, this.j);
                } else {
                    try {
                        AssetFileDescriptor openFd = getResources().getAssets().openFd(this.e);
                        this.q.setDataSource(openFd.getFileDescriptor(), openFd.getStartOffset(), openFd.getLength());
                        openFd.close();
                    } catch (IOException unused) {
                        fileInputStream = new FileInputStream(this.e);
                        this.q.setDataSource(fileInputStream.getFD());
                    }
                }
                fileInputStream.close();
            }
            this.q.setDisplay(this.f9394d);
            this.q.setScreenOnWhilePlaying(true);
            this.q.setOnBufferingUpdateListener(this);
            this.q.setOnCompletionListener(this);
            this.q.setOnPreparedListener(this);
            this.q.setOnVideoSizeChangedListener(this);
            this.q.setAudioStreamType(3);
            this.q.prepareAsync();
            this.y = new b(this);
            new Thread(this.y).start();
        } catch (Exception e) {
            if (f9391a) {
                b("error: " + e.getMessage() + e);
            }
            a(2);
        }
    }

    private void d() {
        if (isPlaying()) {
            return;
        }
        a(1);
        if (f9391a) {
            b("startVideoPlayback");
        }
        updateVideoLayout();
        if (this.v) {
            return;
        }
        start();
    }

    public final void CancelOnPrepare() {
        a(2);
    }

    final boolean a() {
        return this.v;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final boolean canPause() {
        return true;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final boolean canSeekBackward() {
        return true;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final boolean canSeekForward() {
        return true;
    }

    protected final void destroyPlayer() {
        if (f9391a) {
            b("destroyPlayer");
        }
        if (!this.v) {
            pause();
        }
        doCleanUp();
    }

    protected final void doCleanUp() {
        if (this.y != null) {
            this.y.a();
            this.y = null;
        }
        if (this.q != null) {
            this.q.release();
            this.q = null;
        }
        this.o = 0;
        this.p = 0;
        this.t = false;
        this.s = false;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final int getBufferPercentage() {
        if (this.h) {
            return this.u;
        }
        return 100;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final int getCurrentPosition() {
        if (this.q == null) {
            return 0;
        }
        return this.q.getCurrentPosition();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final int getDuration() {
        if (this.q == null) {
            return 0;
        }
        return this.q.getDuration();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final boolean isPlaying() {
        boolean z = this.t && this.s;
        return this.q == null ? !z : this.q.isPlaying() || !z;
    }

    @Override // android.media.MediaPlayer.OnBufferingUpdateListener
    public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
        if (f9391a) {
            b("onBufferingUpdate percent:" + i);
        }
        this.u = i;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        if (f9391a) {
            b("onCompletion called");
        }
        destroyPlayer();
        a(3);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 && (this.f != 2 || i == 0 || keyEvent.isSystem())) {
            return this.r != null ? this.r.onKeyDown(i, keyEvent) : super.onKeyDown(i, keyEvent);
        }
        destroyPlayer();
        a(3);
        return true;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        if (f9391a) {
            b("onPrepared called");
        }
        if (this.y != null) {
            this.y.a();
            this.y = null;
        }
        if (this.f == 0 || this.f == 1) {
            this.r = new MediaController(this.f9392b);
            this.r.setMediaPlayer(this);
            this.r.setAnchorView(this);
            this.r.setEnabled(true);
            this.r.show();
        }
        this.t = true;
        if (this.t && this.s) {
            d();
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (this.f != 2 || action != 0) {
            return this.r != null ? this.r.onTouchEvent(motionEvent) : super.onTouchEvent(motionEvent);
        }
        destroyPlayer();
        a(3);
        return true;
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
        if (f9391a) {
            b("onVideoSizeChanged called " + i + "x" + i2);
        }
        if (i != 0 && i2 != 0) {
            this.s = true;
            this.o = i;
            this.p = i2;
            if (this.t && this.s) {
                d();
                return;
            }
            return;
        }
        if (f9391a) {
            b("invalid video width(" + i + ") or height(" + i2 + ")");
        }
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final void pause() {
        if (this.q == null) {
            return;
        }
        if (this.w) {
            this.q.pause();
        }
        this.v = true;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final void seekTo(int i) {
        if (this.q == null) {
            return;
        }
        this.q.seekTo(i);
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final void start() {
        if (f9391a) {
            b("Start");
        }
        if (this.q == null) {
            return;
        }
        if (this.w) {
            this.q.start();
        }
        this.v = false;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        if (f9391a) {
            b("surfaceChanged called " + i + " " + i2 + "x" + i3);
        }
        if (this.m == i2 && this.n == i3) {
            return;
        }
        this.m = i2;
        this.n = i3;
        if (this.w) {
            updateVideoLayout();
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        if (f9391a) {
            b("surfaceCreated called");
        }
        this.w = true;
        c();
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        if (f9391a) {
            b("surfaceDestroyed called");
        }
        this.w = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0051, code lost:
    
        if (r3 <= r2) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0053, code lost:
    
        r1 = (int) (r6.m / r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0059, code lost:
    
        r0 = (int) (r6.n * r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0067, code lost:
    
        if (r3 >= r2) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final void updateVideoLayout() {
        if (f9391a) {
            b("updateVideoLayout");
        }
        if (this.q == null) {
            return;
        }
        if (this.m == 0 || this.n == 0) {
            WindowManager windowManager = (WindowManager) this.f9392b.getSystemService("window");
            this.m = windowManager.getDefaultDisplay().getWidth();
            this.n = windowManager.getDefaultDisplay().getHeight();
        }
        int i = this.m;
        int i2 = this.n;
        if (this.s) {
            float f = this.o / this.p;
            float f2 = this.m / this.n;
            if (this.g != 1) {
                if (this.g != 2) {
                    if (this.g == 0) {
                        i = this.o;
                        i2 = this.p;
                    }
                }
            }
        } else if (f9391a) {
            b("updateVideoLayout: Video size is not known yet");
        }
        if (this.m == i && this.n == i2) {
            return;
        }
        if (f9391a) {
            b("frameWidth = " + i + "; frameHeight = " + i2);
        }
        this.k.updateViewLayout(this.f9393c, new FrameLayout.LayoutParams(i, i2, 17));
    }
}
