package com.bykv.vk.openvk.component.video.pvs.Jd;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.view.Surface;
import android.view.SurfaceHolder;
import java.io.FileDescriptor;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;

/* compiled from: AndroidMediaPlayer.java */
/* loaded from: classes.dex */
public class icD extends com.bykv.vk.openvk.component.video.pvs.Jd.pvs {
    private com.bykv.vk.openvk.component.video.pvs.pvs.pvs Jd;
    private Surface NB;
    private final MediaPlayer icD;
    private final Object sUS;
    private final pvs vG;
    private volatile boolean yiw;

    public icD() {
        MediaPlayer mediaPlayer;
        Object obj = new Object();
        this.sUS = obj;
        synchronized (obj) {
            mediaPlayer = new MediaPlayer();
            this.icD = mediaPlayer;
        }
        pvs(mediaPlayer);
        try {
            mediaPlayer.setAudioStreamType(3);
        } catch (Throwable unused) {
        }
        this.vG = new pvs(this);
        mnm();
    }

    private void pvs(MediaPlayer mediaPlayer) {
        if (Build.VERSION.SDK_INT >= 28) {
            return;
        }
        try {
            Class<?> cls = Class.forName("android.media.MediaTimeProvider");
            Class<?> cls2 = Class.forName("android.media.SubtitleController");
            Class<?> cls3 = Class.forName("android.media.SubtitleController$Anchor");
            Object newInstance = cls2.getConstructor(Context.class, cls, Class.forName("android.media.SubtitleController$Listener")).newInstance(com.bykv.vk.openvk.component.video.api.vG.pvs(), null, null);
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

    @Override // com.bykv.vk.openvk.component.video.pvs.Jd.vG
    public void pvs(SurfaceHolder surfaceHolder) throws Throwable {
        synchronized (this.sUS) {
            try {
                if (!this.yiw && surfaceHolder != null && surfaceHolder.getSurface() != null && this.pvs) {
                    this.icD.setDisplay(surfaceHolder);
                }
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.bykv.vk.openvk.component.video.pvs.Jd.vG
    public void pvs(Surface surface) {
        vA();
        this.NB = surface;
        this.icD.setSurface(surface);
    }

    @Override // com.bykv.vk.openvk.component.video.pvs.Jd.vG
    public void pvs(com.bykv.vk.openvk.component.video.api.icD icd) throws Throwable {
        this.icD.setPlaybackParams(this.icD.getPlaybackParams().setSpeed(icd.pvs()));
    }

    @Override // com.bykv.vk.openvk.component.video.pvs.Jd.vG
    public void pvs(String str) throws Throwable {
        Uri parse = Uri.parse(str);
        String scheme = parse.getScheme();
        if (!TextUtils.isEmpty(scheme) && scheme.equalsIgnoreCase("file")) {
            this.icD.setDataSource(parse.getPath());
        } else {
            this.icD.setDataSource(str);
        }
    }

    @Override // com.bykv.vk.openvk.component.video.pvs.Jd.vG
    public void pvs(FileDescriptor fileDescriptor) throws Throwable {
        this.icD.setDataSource(fileDescriptor);
    }

    @Override // com.bykv.vk.openvk.component.video.pvs.Jd.vG
    public synchronized void pvs(com.bykv.vk.openvk.component.video.api.vG.vG vGVar) {
        this.Jd = com.bykv.vk.openvk.component.video.pvs.pvs.pvs.pvs(com.bykv.vk.openvk.component.video.api.vG.pvs(), vGVar);
        com.bykv.vk.openvk.component.video.pvs.pvs.icD.vG.pvs(vGVar);
        this.icD.setDataSource(this.Jd);
    }

    private void bNS() {
        com.bykv.vk.openvk.component.video.pvs.pvs.pvs pvsVar = this.Jd;
        if (pvsVar != null) {
            try {
                pvsVar.close();
            } catch (Throwable unused) {
            }
            this.Jd = null;
        }
    }

    @Override // com.bykv.vk.openvk.component.video.pvs.Jd.vG
    public void NB() throws Throwable {
        this.icD.start();
    }

    @Override // com.bykv.vk.openvk.component.video.pvs.Jd.vG
    public void sUS() throws Throwable {
        this.icD.stop();
    }

    @Override // com.bykv.vk.openvk.component.video.pvs.Jd.vG
    public void yiw() throws Throwable {
        this.icD.pause();
    }

    @Override // com.bykv.vk.openvk.component.video.pvs.Jd.vG
    public void so() {
        MediaPlayer mediaPlayer = this.icD;
        if (mediaPlayer != null) {
            mediaPlayer.prepareAsync();
        }
    }

    @Override // com.bykv.vk.openvk.component.video.pvs.Jd.vG
    public void icD(boolean z) throws Throwable {
        this.icD.setScreenOnWhilePlaying(z);
    }

    @Override // com.bykv.vk.openvk.component.video.pvs.Jd.vG
    public void pvs(long j, int i) throws Throwable {
        if (Build.VERSION.SDK_INT < 26) {
            this.icD.seekTo((int) j);
            return;
        }
        if (i == 0) {
            this.icD.seekTo((int) j, 0);
            return;
        }
        if (i == 1) {
            this.icD.seekTo((int) j, 1);
            return;
        }
        if (i == 2) {
            this.icD.seekTo((int) j, 2);
        } else if (i == 3) {
            this.icD.seekTo((int) j, 3);
        } else {
            this.icD.seekTo((int) j);
        }
    }

    @Override // com.bykv.vk.openvk.component.video.pvs.Jd.vG
    public long Mxy() {
        try {
            return this.icD.getCurrentPosition();
        } catch (Throwable unused) {
            return 0L;
        }
    }

    @Override // com.bykv.vk.openvk.component.video.pvs.Jd.vG
    public long Wyp() {
        try {
            return this.icD.getDuration();
        } catch (Throwable unused) {
            return 0L;
        }
    }

    @Override // com.bykv.vk.openvk.component.video.pvs.Jd.vG
    public void qh() throws Throwable {
        synchronized (this.sUS) {
            if (!this.yiw) {
                this.icD.release();
                this.yiw = true;
                vA();
                bNS();
                pvs();
                mnm();
            }
        }
    }

    @Override // com.bykv.vk.openvk.component.video.pvs.Jd.vG
    public void kj() throws Throwable {
        try {
            this.icD.reset();
        } catch (Throwable unused) {
        }
        bNS();
        pvs();
        mnm();
    }

    @Override // com.bykv.vk.openvk.component.video.pvs.Jd.vG
    public void vG(boolean z) throws Throwable {
        this.icD.setLooping(z);
    }

    @Override // com.bykv.vk.openvk.component.video.pvs.Jd.vG
    public void Jd(boolean z) throws Throwable {
        MediaPlayer mediaPlayer = this.icD;
        if (mediaPlayer == null) {
            return;
        }
        if (z) {
            mediaPlayer.setVolume(0.0f, 0.0f);
        } else {
            mediaPlayer.setVolume(1.0f, 1.0f);
        }
    }

    @Override // com.bykv.vk.openvk.component.video.pvs.Jd.vG
    public int Ju() {
        MediaPlayer mediaPlayer = this.icD;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoWidth();
        }
        return 0;
    }

    @Override // com.bykv.vk.openvk.component.video.pvs.Jd.vG
    public int IP() {
        MediaPlayer mediaPlayer = this.icD;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoHeight();
        }
        return 0;
    }

    private void mnm() {
        this.icD.setOnPreparedListener(this.vG);
        this.icD.setOnBufferingUpdateListener(this.vG);
        this.icD.setOnCompletionListener(this.vG);
        this.icD.setOnSeekCompleteListener(this.vG);
        this.icD.setOnVideoSizeChangedListener(this.vG);
        this.icD.setOnErrorListener(this.vG);
        this.icD.setOnInfoListener(this.vG);
    }

    /* compiled from: AndroidMediaPlayer.java */
    private static class pvs implements MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnSeekCompleteListener, MediaPlayer.OnVideoSizeChangedListener {
        private final WeakReference<icD> pvs;

        public pvs(icD icd) {
            this.pvs = new WeakReference<>(icd);
        }

        @Override // android.media.MediaPlayer.OnInfoListener
        public boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
            try {
                icD icd = this.pvs.get();
                if (icd != null) {
                    return icd.icD(i, i2);
                }
                return false;
            } catch (Throwable unused) {
                return false;
            }
        }

        @Override // android.media.MediaPlayer.OnErrorListener
        public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
            try {
                Object[] objArr = new Object[3];
                Integer.valueOf(i);
                Integer.valueOf(i2);
                icD icd = this.pvs.get();
                if (icd != null) {
                    if (icd.pvs(i, i2)) {
                        return true;
                    }
                }
            } catch (Throwable unused) {
            }
            return false;
        }

        @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
        public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
            try {
                icD icd = this.pvs.get();
                if (icd != null) {
                    icd.pvs(i, i2, 1, 1);
                }
            } catch (Throwable unused) {
            }
        }

        @Override // android.media.MediaPlayer.OnSeekCompleteListener
        public void onSeekComplete(MediaPlayer mediaPlayer) {
            try {
                icD icd = this.pvs.get();
                if (icd != null) {
                    icd.Jd();
                }
            } catch (Throwable unused) {
            }
        }

        @Override // android.media.MediaPlayer.OnBufferingUpdateListener
        public void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
            try {
                icD icd = this.pvs.get();
                if (icd != null) {
                    icd.pvs(i);
                }
            } catch (Throwable unused) {
            }
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
            try {
                icD icd = this.pvs.get();
                if (icd != null) {
                    icd.vG();
                }
            } catch (Throwable unused) {
            }
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(MediaPlayer mediaPlayer) {
            try {
                icD icd = this.pvs.get();
                if (icd != null) {
                    icd.icD();
                }
            } catch (Throwable unused) {
            }
        }
    }

    protected void finalize() throws Throwable {
        super.finalize();
        vA();
    }

    private void vA() {
        try {
            Surface surface = this.NB;
            if (surface != null) {
                surface.release();
                this.NB = null;
            }
        } catch (Throwable unused) {
        }
    }
}
