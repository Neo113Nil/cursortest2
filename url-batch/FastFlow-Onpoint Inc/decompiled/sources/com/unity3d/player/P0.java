package com.unity3d.player;

import android.app.Activity;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.graphics.Point;
import android.media.AudioAttributes;
import android.media.MediaPlayer;
import android.net.Uri;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.widget.FrameLayout;
import android.widget.MediaController;
import com.unity3d.player.a.C0023x;
import com.unity3d.player.a.C0024y;
import java.io.FileInputStream;
import java.io.IOException;

/* loaded from: classes.dex */
public class P0 extends FrameLayout implements MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnVideoSizeChangedListener, SurfaceHolder.Callback, MediaController.MediaPlayerControl {
    public static final /* synthetic */ int A = 0;
    public final Context a;
    public final SurfaceView b;
    public final SurfaceHolder c;
    public final String d;
    public final int e;
    public final int f;
    public final boolean g;
    public final long h;
    public final long i;
    public final P0 j;
    public int k;
    public int l;
    public int m;
    public int n;
    public MediaPlayer o;
    public MediaController p;
    public boolean q;
    public boolean r;
    public int s;
    public boolean t;
    public int u;
    public boolean v;
    public C0024y w;
    public final N0 x;
    public O0 y;
    public volatile int z;

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

    public P0(Context context, UnityPlayer unityPlayer, String str, int i, int i2, int i3, boolean z, long j, long j2, N0 n0) {
        super(context);
        this.q = false;
        this.r = false;
        this.s = 0;
        this.t = false;
        this.u = 0;
        this.v = false;
        this.w = null;
        this.z = 0;
        this.x = n0;
        this.a = context;
        this.j = this;
        SurfaceView surfaceView = new SurfaceView(context);
        this.b = surfaceView;
        SurfaceHolder holder = surfaceView.getHolder();
        this.c = holder;
        holder.addCallback(this);
        setBackgroundColor(i);
        addView(surfaceView);
        this.d = str;
        this.e = i2;
        this.f = i3;
        this.g = z;
        this.h = j;
        this.i = j2;
        setFocusable(true);
        setFocusableInTouchMode(true);
        this.w = C0049m.a(unityPlayer.getActivity(), 1000000, new M0(this));
    }

    public final void a(int i) {
        this.z = i;
        N0 n0 = this.x;
        if (n0 != null) {
            int i2 = this.z;
            com.unity3d.player.a.U u = (com.unity3d.player.a.U) n0;
            u.a.h.e.lock();
            com.unity3d.player.a.Z z = u.a.h;
            z.g = i2;
            if (i2 == 3 && z.i) {
                z.runOnUiThread(new com.unity3d.player.a.T(u));
            }
            if (i2 != 0) {
                u.a.h.d.release();
            }
            u.a.h.e.unlock();
        }
    }

    public void destroyPlayer() {
        if (!this.t) {
            pause();
        }
        doCleanUp();
        C0024y c0024y = this.w;
        if (c0024y != null) {
            c0024y.unregisterOnBackPressedCallback();
            this.w = null;
        }
    }

    public void cancelOnPrepare() {
        a(2);
    }

    public boolean exitOnKeypress(int i, KeyEvent keyEvent) {
        Runnable runnable;
        if (i != 4 && (this.e != 2 || i == 0 || keyEvent.isSystem())) {
            return false;
        }
        C0023x c0023x = this.w.a;
        if (c0023x == null || (runnable = c0023x.a) == null) {
            return true;
        }
        runnable.run();
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (exitOnKeypress(i, keyEvent)) {
            return true;
        }
        MediaController mediaController = this.p;
        if (mediaController != null) {
            return mediaController.onKeyUp(i, keyEvent);
        }
        return super.onKeyUp(i, keyEvent);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        MediaController mediaController = this.p;
        if (mediaController != null) {
            return mediaController.onKeyDown(i, keyEvent);
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (this.e == 2 && action == 0) {
            destroyPlayer();
            a(3);
            return true;
        }
        MediaController mediaController = this.p;
        if (mediaController != null) {
            return mediaController.onTouchEvent(motionEvent);
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.media.MediaPlayer.OnBufferingUpdateListener
    public void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
        this.s = i;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public void onCompletion(MediaPlayer mediaPlayer) {
        destroyPlayer();
        a(3);
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
        if (i == 0 || i2 == 0) {
            return;
        }
        this.q = true;
        this.m = i;
        this.n = i2;
        if (!this.r || isPlaying()) {
            return;
        }
        a(1);
        updateVideoLayout();
        if (this.t) {
            return;
        }
        start();
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public void onPrepared(MediaPlayer mediaPlayer) {
        O0 o0 = this.y;
        if (o0 != null) {
            o0.b = true;
            this.y = null;
        }
        int i = this.e;
        if (i == 0 || i == 1) {
            MediaController mediaController = new MediaController(this.a);
            this.p = mediaController;
            mediaController.setMediaPlayer(this);
            this.p.setAnchorView(this);
            this.p.setEnabled(true);
            Context context = this.a;
            if (context instanceof Activity) {
                this.p.setSystemUiVisibility(((Activity) context).getWindow().getDecorView().getSystemUiVisibility());
            }
            this.p.show();
        }
        this.r = true;
        if (!this.q || isPlaying()) {
            return;
        }
        a(1);
        updateVideoLayout();
        if (this.t) {
            return;
        }
        start();
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        if (this.k == i2 && this.l == i3) {
            return;
        }
        this.k = i2;
        this.l = i3;
        if (this.v) {
            updateVideoLayout();
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.v = false;
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.v = true;
        if (this.t) {
            MediaPlayer mediaPlayer = this.o;
            if (mediaPlayer == null || this.u <= 0) {
                return;
            }
            mediaPlayer.setDisplay(this.c);
            this.o.seekTo(this.u);
            return;
        }
        MediaPlayer mediaPlayer2 = this.o;
        if (mediaPlayer2 != null) {
            mediaPlayer2.setDisplay(this.c);
            if (this.t) {
                return;
            }
            int i = this.u;
            if (i > 0) {
                this.o.seekTo(i);
            }
            this.o.start();
            this.u = 0;
            return;
        }
        a(0);
        doCleanUp();
        try {
            MediaPlayer mediaPlayer3 = new MediaPlayer();
            this.o = mediaPlayer3;
            if (this.g) {
                mediaPlayer3.setDataSource(this.a, Uri.parse(this.d));
            } else if (this.i != 0) {
                FileInputStream fileInputStream = new FileInputStream(this.d);
                this.o.setDataSource(fileInputStream.getFD(), this.h, this.i);
                fileInputStream.close();
            } else {
                try {
                    AssetFileDescriptor openFd = getResources().getAssets().openFd(this.d);
                    this.o.setDataSource(openFd.getFileDescriptor(), openFd.getStartOffset(), openFd.getLength());
                    openFd.close();
                } catch (IOException unused) {
                    FileInputStream fileInputStream2 = new FileInputStream(this.d);
                    this.o.setDataSource(fileInputStream2.getFD());
                    fileInputStream2.close();
                }
            }
            this.o.setDisplay(this.c);
            this.o.setScreenOnWhilePlaying(true);
            this.o.setOnBufferingUpdateListener(this);
            this.o.setOnCompletionListener(this);
            this.o.setOnPreparedListener(this);
            this.o.setOnVideoSizeChangedListener(this);
            this.o.setAudioAttributes(new AudioAttributes.Builder().setUsage(1).setContentType(3).build());
            this.o.prepareAsync();
            this.y = new O0(this);
            new Thread(this.y).start();
        } catch (Exception unused2) {
            a(2);
        }
    }

    public void doCleanUp() {
        O0 o0 = this.y;
        if (o0 != null) {
            o0.b = true;
            this.y = null;
        }
        MediaPlayer mediaPlayer = this.o;
        if (mediaPlayer != null) {
            mediaPlayer.reset();
            this.o.release();
            this.o = null;
        }
        this.m = 0;
        this.n = 0;
        this.r = false;
        this.q = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:
    
        if (r7 <= r3) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003f, code lost:
    
        r2 = (int) (r6 * r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003b, code lost:
    
        r4 = (int) (r5 / r3);
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0039, code lost:
    
        if (r7 >= r3) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0042, code lost:
    
        if (r8 == 0) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void updateVideoLayout() {
        int i;
        int i2;
        int i3;
        if (this.o == null) {
            return;
        }
        Point a = Q0.a(this.a);
        int i4 = a.x;
        if (i4 > 0 && (i3 = a.y) > 0) {
            this.k = i4;
            this.l = i3;
        }
        int i5 = this.k;
        int i6 = this.l;
        if (this.q) {
            i = this.m;
            i2 = this.n;
            float f = i / i2;
            float f2 = i5;
            float f3 = i6;
            float f4 = f2 / f3;
            int i7 = this.f;
            if (i7 != 1) {
                if (i7 == 2) {
                }
            }
        }
        i = i5;
        i2 = i6;
        if (i5 == i && i6 == i2) {
            return;
        }
        this.j.updateViewLayout(this.b, new FrameLayout.LayoutParams(i, i2, 17));
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getBufferPercentage() {
        if (this.g) {
            return this.s;
        }
        return 100;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getCurrentPosition() {
        MediaPlayer mediaPlayer = this.o;
        if (mediaPlayer == null) {
            return 0;
        }
        return mediaPlayer.getCurrentPosition();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getDuration() {
        MediaPlayer mediaPlayer = this.o;
        if (mediaPlayer == null) {
            return 0;
        }
        return mediaPlayer.getDuration();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean isPlaying() {
        boolean z = this.r && this.q;
        MediaPlayer mediaPlayer = this.o;
        return mediaPlayer == null ? !z : mediaPlayer.isPlaying() || !z;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void pause() {
        MediaPlayer mediaPlayer = this.o;
        if (mediaPlayer == null) {
            return;
        }
        if (this.v) {
            this.u = mediaPlayer.getCurrentPosition();
            this.o.pause();
        }
        this.t = true;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void seekTo(int i) {
        MediaPlayer mediaPlayer = this.o;
        if (mediaPlayer == null) {
            return;
        }
        mediaPlayer.seekTo(i);
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void start() {
        MediaPlayer mediaPlayer = this.o;
        if (mediaPlayer == null) {
            return;
        }
        if (this.v) {
            int i = this.u;
            if (i > 0) {
                mediaPlayer.seekTo(i);
            }
            this.o.start();
            this.u = 0;
        }
        this.t = false;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getAudioSessionId() {
        MediaPlayer mediaPlayer = this.o;
        if (mediaPlayer == null) {
            return 0;
        }
        return mediaPlayer.getAudioSessionId();
    }
}
