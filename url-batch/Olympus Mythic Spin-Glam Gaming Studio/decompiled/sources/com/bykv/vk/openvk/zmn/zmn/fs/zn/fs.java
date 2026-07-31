package com.bykv.vk.openvk.zmn.zmn.fs.zn;

import android.annotation.TargetApi;
import android.content.Context;
import android.media.MediaPlayer;
import android.media.PlaybackParams;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.view.Surface;
import android.view.SurfaceHolder;
import androidx.annotation.RequiresApi;
import java.io.FileDescriptor;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;

/* loaded from: classes4.dex */
public class fs extends com.bykv.vk.openvk.zmn.zmn.fs.zn.zmn {
    private Surface btk;
    private com.bykv.vk.openvk.zmn.zmn.fs.zmn.zmn fb;
    private final MediaPlayer fs;
    private final Object hhw;
    private volatile boolean nps;
    private final zmn zn;

    public fs() {
        MediaPlayer mediaPlayer;
        Object obj = new Object();
        this.hhw = obj;
        synchronized (obj) {
            mediaPlayer = new MediaPlayer();
            this.fs = mediaPlayer;
        }
        zmn(mediaPlayer);
        try {
            mediaPlayer.setAudioStreamType(3);
        } catch (Throwable unused) {
        }
        this.zn = new zmn(this);
        olo();
    }

    private void zmn(MediaPlayer mediaPlayer) {
        if (Build.VERSION.SDK_INT >= 28) {
            return;
        }
        try {
            Class<?> cls = Class.forName("android.media.MediaTimeProvider");
            Class<?> cls2 = Class.forName("android.media.SubtitleController");
            Class<?> cls3 = Class.forName("android.media.SubtitleController$Anchor");
            Object newInstance = cls2.getConstructor(Context.class, cls, Class.forName("android.media.SubtitleController$Listener")).newInstance(com.bykv.vk.openvk.zmn.zmn.zmn.zn.zmn(), null, null);
            Field declaredField = cls2.getDeclaredField("mHandler");
            declaredField.setAccessible(true);
            try {
                declaredField.set(newInstance, new Handler());
                declaredField.setAccessible(false);
                mediaPlayer.getClass().getMethod("setSubtitleAnchor", cls2, cls3).invoke(mediaPlayer, newInstance, null);
            } catch (Throwable unused) {
                declaredField.setAccessible(false);
            }
        } catch (Throwable unused2) {
        }
    }

    @Override // com.bykv.vk.openvk.zmn.zmn.fs.zn.zn
    public void zmn(SurfaceHolder surfaceHolder) throws Throwable {
        synchronized (this.hhw) {
            try {
                if (!this.nps && surfaceHolder != null && surfaceHolder.getSurface() != null && this.zmn) {
                    this.fs.setDisplay(surfaceHolder);
                }
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.bykv.vk.openvk.zmn.zmn.fs.zn.zn
    @TargetApi(14)
    public void zmn(Surface surface) {
        kgc();
        this.btk = surface;
        this.fs.setSurface(surface);
    }

    @Override // com.bykv.vk.openvk.zmn.zmn.fs.zn.zn
    @RequiresApi
    public void zmn(com.bykv.vk.openvk.zmn.zmn.zmn.fs fsVar) throws Throwable {
        this.fs.setPlaybackParams(this.fs.getPlaybackParams().setSpeed(fsVar.zmn()));
    }

    @Override // com.bykv.vk.openvk.zmn.zmn.fs.zn.zn
    public PlaybackParams btk() throws IllegalStateException {
        return this.fs.getPlaybackParams();
    }

    @Override // com.bykv.vk.openvk.zmn.zmn.fs.zn.zn
    public void zmn(String str) throws Throwable {
        Uri parse = Uri.parse(str);
        String scheme = parse.getScheme();
        if (!TextUtils.isEmpty(scheme) && scheme.equalsIgnoreCase("file")) {
            this.fs.setDataSource(parse.getPath());
        } else {
            this.fs.setDataSource(str);
        }
    }

    @Override // com.bykv.vk.openvk.zmn.zmn.fs.zn.zn
    public void zmn(FileDescriptor fileDescriptor) throws Throwable {
        this.fs.setDataSource(fileDescriptor);
    }

    @Override // com.bykv.vk.openvk.zmn.zmn.fs.zn.zn
    @RequiresApi
    public synchronized void zmn(com.bykv.vk.openvk.zmn.zmn.zmn.zn.zn znVar) {
        this.fb = com.bykv.vk.openvk.zmn.zmn.fs.zmn.zmn.zmn(com.bykv.vk.openvk.zmn.zmn.zmn.zn.zmn(), znVar);
        com.bykv.vk.openvk.zmn.zmn.fs.zmn.fs.zn.zmn(znVar);
        this.fs.setDataSource(this.fb);
    }

    private void cyb() {
        com.bykv.vk.openvk.zmn.zmn.fs.zmn.zmn zmnVar = this.fb;
        if (zmnVar != null) {
            try {
                zmnVar.close();
            } catch (Throwable unused) {
            }
            this.fb = null;
        }
    }

    @Override // com.bykv.vk.openvk.zmn.zmn.fs.zn.zn
    public void hhw() throws Throwable {
        this.fs.start();
    }

    @Override // com.bykv.vk.openvk.zmn.zmn.fs.zn.zn
    public void nps() throws Throwable {
        this.fs.stop();
    }

    @Override // com.bykv.vk.openvk.zmn.zmn.fs.zn.zn
    public void zg() throws Throwable {
        this.fs.pause();
    }

    @Override // com.bykv.vk.openvk.zmn.zmn.fs.zn.zn
    public void bvs() {
        MediaPlayer mediaPlayer = this.fs;
        if (mediaPlayer != null) {
            mediaPlayer.prepareAsync();
        }
    }

    @Override // com.bykv.vk.openvk.zmn.zmn.fs.zn.zn
    public void fs(boolean z) throws Throwable {
        this.fs.setScreenOnWhilePlaying(z);
    }

    @Override // com.bykv.vk.openvk.zmn.zmn.fs.zn.zn
    public void zmn(long j, int i) throws Throwable {
        if (Build.VERSION.SDK_INT < 26) {
            this.fs.seekTo((int) j);
            return;
        }
        if (i == 0) {
            this.fs.seekTo((int) j, 0);
            return;
        }
        if (i == 1) {
            this.fs.seekTo((int) j, 1);
            return;
        }
        if (i == 2) {
            this.fs.seekTo((int) j, 2);
        } else if (i == 3) {
            this.fs.seekTo((int) j, 3);
        } else {
            this.fs.seekTo((int) j);
        }
    }

    @Override // com.bykv.vk.openvk.zmn.zmn.fs.zn.zn
    public long iv() {
        try {
            return this.fs.getCurrentPosition();
        } catch (Throwable unused) {
            return 0L;
        }
    }

    @Override // com.bykv.vk.openvk.zmn.zmn.fs.zn.zn
    public long rc() {
        try {
            return this.fs.getDuration();
        } catch (Throwable unused) {
            return 0L;
        }
    }

    @Override // com.bykv.vk.openvk.zmn.zmn.fs.zn.zn
    public void klz() throws Throwable {
        synchronized (this.hhw) {
            try {
                if (!this.nps) {
                    this.fs.release();
                    this.nps = true;
                    kgc();
                    cyb();
                    zmn();
                    olo();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bykv.vk.openvk.zmn.zmn.fs.zn.zn
    public void mw() throws Throwable {
        try {
            this.fs.reset();
        } catch (Throwable unused) {
        }
        cyb();
        zmn();
        olo();
    }

    @Override // com.bykv.vk.openvk.zmn.zmn.fs.zn.zn
    public void zn(boolean z) throws Throwable {
        this.fs.setLooping(z);
    }

    @Override // com.bykv.vk.openvk.zmn.zmn.fs.zn.zn
    public void fb(boolean z) throws Throwable {
        MediaPlayer mediaPlayer = this.fs;
        if (mediaPlayer == null) {
            return;
        }
        if (z) {
            mediaPlayer.setVolume(0.0f, 0.0f);
        } else {
            mediaPlayer.setVolume(1.0f, 1.0f);
        }
    }

    @Override // com.bykv.vk.openvk.zmn.zmn.fs.zn.zn
    public int rt() {
        MediaPlayer mediaPlayer = this.fs;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoWidth();
        }
        return 0;
    }

    @Override // com.bykv.vk.openvk.zmn.zmn.fs.zn.zn
    public int cn() {
        MediaPlayer mediaPlayer = this.fs;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoHeight();
        }
        return 0;
    }

    private void olo() {
        this.fs.setOnPreparedListener(this.zn);
        this.fs.setOnBufferingUpdateListener(this.zn);
        this.fs.setOnCompletionListener(this.zn);
        this.fs.setOnSeekCompleteListener(this.zn);
        this.fs.setOnVideoSizeChangedListener(this.zn);
        this.fs.setOnErrorListener(this.zn);
        this.fs.setOnInfoListener(this.zn);
    }

    private static class zmn implements MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnSeekCompleteListener, MediaPlayer.OnVideoSizeChangedListener {
        private final WeakReference<fs> zmn;

        public zmn(fs fsVar) {
            this.zmn = new WeakReference<>(fsVar);
        }

        @Override // android.media.MediaPlayer.OnInfoListener
        public boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
            try {
                fs fsVar = this.zmn.get();
                if (fsVar != null) {
                    return fsVar.fs(i, i2);
                }
                return false;
            } catch (Throwable unused) {
                return false;
            }
        }

        @Override // android.media.MediaPlayer.OnErrorListener
        public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
            try {
                fs fsVar = this.zmn.get();
                if (fsVar != null) {
                    return fsVar.zmn(i, i2);
                }
                return false;
            } catch (Throwable unused) {
                return false;
            }
        }

        @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
        public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
            try {
                fs fsVar = this.zmn.get();
                if (fsVar != null) {
                    fsVar.zmn(i, i2, 1, 1);
                }
            } catch (Throwable unused) {
            }
        }

        @Override // android.media.MediaPlayer.OnSeekCompleteListener
        public void onSeekComplete(MediaPlayer mediaPlayer) {
            try {
                fs fsVar = this.zmn.get();
                if (fsVar != null) {
                    fsVar.fb();
                }
            } catch (Throwable unused) {
            }
        }

        @Override // android.media.MediaPlayer.OnBufferingUpdateListener
        public void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
            try {
                fs fsVar = this.zmn.get();
                if (fsVar != null) {
                    fsVar.zmn(i);
                }
            } catch (Throwable unused) {
            }
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
            try {
                fs fsVar = this.zmn.get();
                if (fsVar != null) {
                    fsVar.zn();
                }
            } catch (Throwable unused) {
            }
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(MediaPlayer mediaPlayer) {
            try {
                fs fsVar = this.zmn.get();
                if (fsVar != null) {
                    fsVar.fs();
                }
            } catch (Throwable unused) {
            }
        }
    }

    protected void finalize() throws Throwable {
        super.finalize();
        kgc();
    }

    private void kgc() {
        try {
            Surface surface = this.btk;
            if (surface != null) {
                surface.release();
                this.btk = null;
            }
        } catch (Throwable unused) {
        }
    }
}
