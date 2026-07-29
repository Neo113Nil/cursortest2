package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@TargetApi(14)
@zzadh
/* loaded from: classes2.dex */
public final class zzaov extends zzapg implements MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnVideoSizeChangedListener, TextureView.SurfaceTextureListener {
    private static final Map<Integer, String> zzcwo = new HashMap();
    private final zzapx zzcwp;
    private final boolean zzcwq;
    private int zzcwr;
    private int zzcws;
    private MediaPlayer zzcwt;
    private Uri zzcwu;
    private int zzcwv;
    private int zzcww;
    private int zzcwx;
    private int zzcwy;
    private int zzcwz;
    private zzapu zzcxa;
    private boolean zzcxb;
    private int zzcxc;
    private zzapf zzcxd;

    static {
        if (Build.VERSION.SDK_INT >= 17) {
            zzcwo.put(-1004, "MEDIA_ERROR_IO");
            zzcwo.put(-1007, "MEDIA_ERROR_MALFORMED");
            zzcwo.put(-1010, "MEDIA_ERROR_UNSUPPORTED");
            zzcwo.put(-110, "MEDIA_ERROR_TIMED_OUT");
            zzcwo.put(3, "MEDIA_INFO_VIDEO_RENDERING_START");
        }
        zzcwo.put(100, "MEDIA_ERROR_SERVER_DIED");
        zzcwo.put(1, "MEDIA_ERROR_UNKNOWN");
        zzcwo.put(1, "MEDIA_INFO_UNKNOWN");
        zzcwo.put(700, "MEDIA_INFO_VIDEO_TRACK_LAGGING");
        zzcwo.put(701, "MEDIA_INFO_BUFFERING_START");
        zzcwo.put(702, "MEDIA_INFO_BUFFERING_END");
        zzcwo.put(800, "MEDIA_INFO_BAD_INTERLEAVING");
        zzcwo.put(801, "MEDIA_INFO_NOT_SEEKABLE");
        zzcwo.put(802, "MEDIA_INFO_METADATA_UPDATE");
        if (Build.VERSION.SDK_INT >= 19) {
            zzcwo.put(901, "MEDIA_INFO_UNSUPPORTED_SUBTITLE");
            zzcwo.put(902, "MEDIA_INFO_SUBTITLE_TIMED_OUT");
        }
    }

    public zzaov(Context context, boolean z, boolean z2, zzapv zzapvVar, zzapx zzapxVar) {
        super(context);
        this.zzcwr = 0;
        this.zzcws = 0;
        setSurfaceTextureListener(this);
        this.zzcwp = zzapxVar;
        this.zzcxb = z;
        this.zzcwq = z2;
        this.zzcwp.zzb(this);
    }

    private final void zza(float f) {
        if (this.zzcwt == null) {
            zzakb.zzdk("AdMediaPlayerView setMediaPlayerVolume() called before onPrepared().");
        } else {
            try {
                this.zzcwt.setVolume(f, f);
            } catch (IllegalStateException unused) {
            }
        }
    }

    private final void zzag(int i) {
        if (i == 3) {
            this.zzcwp.zztt();
            this.zzcxl.zztt();
        } else if (this.zzcwr == 3) {
            this.zzcwp.zztu();
            this.zzcxl.zztu();
        }
        this.zzcwr = i;
    }

    private final void zzag(boolean z) {
        zzakb.v("AdMediaPlayerView release");
        if (this.zzcxa != null) {
            this.zzcxa.zzti();
            this.zzcxa = null;
        }
        if (this.zzcwt != null) {
            this.zzcwt.reset();
            this.zzcwt.release();
            this.zzcwt = null;
            zzag(0);
            if (z) {
                this.zzcws = 0;
                this.zzcws = 0;
            }
        }
    }

    private final void zzsq() {
        zzakb.v("AdMediaPlayerView init MediaPlayer");
        SurfaceTexture surfaceTexture = getSurfaceTexture();
        if (this.zzcwu == null || surfaceTexture == null) {
            return;
        }
        zzag(false);
        try {
            com.google.android.gms.ads.internal.zzbv.zzfb();
            this.zzcwt = new MediaPlayer();
            this.zzcwt.setOnBufferingUpdateListener(this);
            this.zzcwt.setOnCompletionListener(this);
            this.zzcwt.setOnErrorListener(this);
            this.zzcwt.setOnInfoListener(this);
            this.zzcwt.setOnPreparedListener(this);
            this.zzcwt.setOnVideoSizeChangedListener(this);
            this.zzcwx = 0;
            if (this.zzcxb) {
                this.zzcxa = new zzapu(getContext());
                this.zzcxa.zza(surfaceTexture, getWidth(), getHeight());
                this.zzcxa.start();
                SurfaceTexture zztj = this.zzcxa.zztj();
                if (zztj != null) {
                    surfaceTexture = zztj;
                } else {
                    this.zzcxa.zzti();
                    this.zzcxa = null;
                }
            }
            this.zzcwt.setDataSource(getContext(), this.zzcwu);
            com.google.android.gms.ads.internal.zzbv.zzfc();
            this.zzcwt.setSurface(new Surface(surfaceTexture));
            this.zzcwt.setAudioStreamType(3);
            this.zzcwt.setScreenOnWhilePlaying(true);
            this.zzcwt.prepareAsync();
            zzag(1);
        } catch (IOException | IllegalArgumentException | IllegalStateException e) {
            String valueOf = String.valueOf(this.zzcwu);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 36);
            sb.append("Failed to initialize MediaPlayer at ");
            sb.append(valueOf);
            zzakb.zzc(sb.toString(), e);
            onError(this.zzcwt, 1, 0);
        }
    }

    private final void zzsr() {
        if (this.zzcwq && zzss() && this.zzcwt.getCurrentPosition() > 0 && this.zzcws != 3) {
            zzakb.v("AdMediaPlayerView nudging MediaPlayer");
            zza(0.0f);
            this.zzcwt.start();
            int currentPosition = this.zzcwt.getCurrentPosition();
            long currentTimeMillis = com.google.android.gms.ads.internal.zzbv.zzer().currentTimeMillis();
            while (zzss() && this.zzcwt.getCurrentPosition() == currentPosition && com.google.android.gms.ads.internal.zzbv.zzer().currentTimeMillis() - currentTimeMillis <= 250) {
            }
            this.zzcwt.pause();
            zzst();
        }
    }

    private final boolean zzss() {
        return (this.zzcwt == null || this.zzcwr == -1 || this.zzcwr == 0 || this.zzcwr == 1) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzapg
    public final int getCurrentPosition() {
        if (zzss()) {
            return this.zzcwt.getCurrentPosition();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzapg
    public final int getDuration() {
        if (zzss()) {
            return this.zzcwt.getDuration();
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzapg
    public final int getVideoHeight() {
        if (this.zzcwt != null) {
            return this.zzcwt.getVideoHeight();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzapg
    public final int getVideoWidth() {
        if (this.zzcwt != null) {
            return this.zzcwt.getVideoWidth();
        }
        return 0;
    }

    @Override // android.media.MediaPlayer.OnBufferingUpdateListener
    public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
        this.zzcwx = i;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        zzakb.v("AdMediaPlayerView completion");
        zzag(5);
        this.zzcws = 5;
        zzakk.zzcrm.post(new zzaoy(this));
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        String str = zzcwo.get(Integer.valueOf(i));
        String str2 = zzcwo.get(Integer.valueOf(i2));
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 38 + String.valueOf(str2).length());
        sb.append("AdMediaPlayerView MediaPlayer error: ");
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        zzakb.zzdk(sb.toString());
        zzag(-1);
        this.zzcws = -1;
        zzakk.zzcrm.post(new zzaoz(this, str, str2));
        return true;
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
        String str = zzcwo.get(Integer.valueOf(i));
        String str2 = zzcwo.get(Integer.valueOf(i2));
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 37 + String.valueOf(str2).length());
        sb.append("AdMediaPlayerView MediaPlayer info: ");
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        zzakb.v(sb.toString());
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x004a, code lost:
    
        if ((r5.zzcwv * r7) > (r5.zzcww * r6)) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x004c, code lost:
    
        r1 = (r5.zzcww * r6) / r5.zzcwv;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0072, code lost:
    
        if (r1 > r6) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x008b, code lost:
    
        if (r1 > r6) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int defaultSize = getDefaultSize(this.zzcwv, i);
        int defaultSize2 = getDefaultSize(this.zzcww, i2);
        if (this.zzcwv <= 0 || this.zzcww <= 0 || this.zzcxa != null) {
            i3 = defaultSize;
        } else {
            int mode = View.MeasureSpec.getMode(i);
            i3 = View.MeasureSpec.getSize(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            i4 = View.MeasureSpec.getSize(i2);
            if (mode != 1073741824 || mode2 != 1073741824) {
                if (mode == 1073741824) {
                    int i6 = (this.zzcww * i3) / this.zzcwv;
                    if (mode2 != Integer.MIN_VALUE || i6 <= i4) {
                        i4 = i6;
                    }
                } else {
                    if (mode2 == 1073741824) {
                        i5 = (this.zzcwv * i4) / this.zzcww;
                        if (mode == Integer.MIN_VALUE) {
                        }
                    } else {
                        int i7 = this.zzcwv;
                        int i8 = this.zzcww;
                        if (mode2 != Integer.MIN_VALUE || i8 <= i4) {
                            i5 = i7;
                            i4 = i8;
                        } else {
                            i5 = (this.zzcwv * i4) / this.zzcww;
                        }
                        if (mode == Integer.MIN_VALUE) {
                        }
                    }
                    i3 = i5;
                }
                setMeasuredDimension(i3, i4);
                if (this.zzcxa != null) {
                    this.zzcxa.zzh(i3, i4);
                }
                if (Build.VERSION.SDK_INT == 16) {
                    if ((this.zzcwy > 0 && this.zzcwy != i3) || (this.zzcwz > 0 && this.zzcwz != i4)) {
                        zzsr();
                    }
                    this.zzcwy = i3;
                    this.zzcwz = i4;
                    return;
                }
                return;
            }
            if (this.zzcwv * i4 < this.zzcww * i3) {
                i3 = (this.zzcwv * i4) / this.zzcww;
            }
            setMeasuredDimension(i3, i4);
            if (this.zzcxa != null) {
            }
            if (Build.VERSION.SDK_INT == 16) {
            }
        }
        i4 = defaultSize2;
        setMeasuredDimension(i3, i4);
        if (this.zzcxa != null) {
        }
        if (Build.VERSION.SDK_INT == 16) {
        }
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        zzakb.v("AdMediaPlayerView prepared");
        zzag(2);
        this.zzcwp.zzsv();
        zzakk.zzcrm.post(new zzaox(this));
        this.zzcwv = mediaPlayer.getVideoWidth();
        this.zzcww = mediaPlayer.getVideoHeight();
        if (this.zzcxc != 0) {
            seekTo(this.zzcxc);
        }
        zzsr();
        int i = this.zzcwv;
        int i2 = this.zzcww;
        StringBuilder sb = new StringBuilder(62);
        sb.append("AdMediaPlayerView stream dimensions: ");
        sb.append(i);
        sb.append(" x ");
        sb.append(i2);
        zzakb.zzdj(sb.toString());
        if (this.zzcws == 3) {
            play();
        }
        zzst();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        zzakb.v("AdMediaPlayerView surface created");
        zzsq();
        zzakk.zzcrm.post(new zzapa(this));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        zzakb.v("AdMediaPlayerView surface destroyed");
        if (this.zzcwt != null && this.zzcxc == 0) {
            this.zzcxc = this.zzcwt.getCurrentPosition();
        }
        if (this.zzcxa != null) {
            this.zzcxa.zzti();
        }
        zzakk.zzcrm.post(new zzapc(this));
        zzag(true);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        zzakb.v("AdMediaPlayerView surface changed");
        boolean z = false;
        boolean z2 = this.zzcws == 3;
        if (this.zzcwv == i && this.zzcww == i2) {
            z = true;
        }
        if (this.zzcwt != null && z2 && z) {
            if (this.zzcxc != 0) {
                seekTo(this.zzcxc);
            }
            play();
        }
        if (this.zzcxa != null) {
            this.zzcxa.zzh(i, i2);
        }
        zzakk.zzcrm.post(new zzapb(this, i, i2));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.zzcwp.zzc(this);
        this.zzcxk.zza(surfaceTexture, this.zzcxd);
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
        StringBuilder sb = new StringBuilder(57);
        sb.append("AdMediaPlayerView size changed: ");
        sb.append(i);
        sb.append(" x ");
        sb.append(i2);
        zzakb.v(sb.toString());
        this.zzcwv = mediaPlayer.getVideoWidth();
        this.zzcww = mediaPlayer.getVideoHeight();
        if (this.zzcwv == 0 || this.zzcww == 0) {
            return;
        }
        requestLayout();
    }

    @Override // android.view.View
    protected final void onWindowVisibilityChanged(final int i) {
        StringBuilder sb = new StringBuilder(58);
        sb.append("AdMediaPlayerView window visibility changed to ");
        sb.append(i);
        zzakb.v(sb.toString());
        zzakk.zzcrm.post(new Runnable(this, i) { // from class: com.google.android.gms.internal.ads.zzaow
            private final int zzcsi;
            private final zzaov zzcxe;

            {
                this.zzcxe = this;
                this.zzcsi = i;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzcxe.zzah(this.zzcsi);
            }
        });
        super.onWindowVisibilityChanged(i);
    }

    @Override // com.google.android.gms.internal.ads.zzapg
    public final void pause() {
        zzakb.v("AdMediaPlayerView pause");
        if (zzss() && this.zzcwt.isPlaying()) {
            this.zzcwt.pause();
            zzag(4);
            zzakk.zzcrm.post(new zzape(this));
        }
        this.zzcws = 4;
    }

    @Override // com.google.android.gms.internal.ads.zzapg
    public final void play() {
        zzakb.v("AdMediaPlayerView play");
        if (zzss()) {
            this.zzcwt.start();
            zzag(3);
            this.zzcxk.zzsw();
            zzakk.zzcrm.post(new zzapd(this));
        }
        this.zzcws = 3;
    }

    @Override // com.google.android.gms.internal.ads.zzapg
    public final void seekTo(int i) {
        StringBuilder sb = new StringBuilder(34);
        sb.append("AdMediaPlayerView seek ");
        sb.append(i);
        zzakb.v(sb.toString());
        if (!zzss()) {
            this.zzcxc = i;
        } else {
            this.zzcwt.seekTo(i);
            this.zzcxc = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzapg
    public final void setVideoPath(String str) {
        Uri parse = Uri.parse(str);
        zzhl zzd = zzhl.zzd(parse);
        if (zzd != null) {
            parse = Uri.parse(zzd.url);
        }
        this.zzcwu = parse;
        this.zzcxc = 0;
        zzsq();
        requestLayout();
        invalidate();
    }

    @Override // com.google.android.gms.internal.ads.zzapg
    public final void stop() {
        zzakb.v("AdMediaPlayerView stop");
        if (this.zzcwt != null) {
            this.zzcwt.stop();
            this.zzcwt.release();
            this.zzcwt = null;
            zzag(0);
            this.zzcws = 0;
        }
        this.zzcwp.onStop();
    }

    @Override // android.view.View
    public final String toString() {
        String name = getClass().getName();
        String hexString = Integer.toHexString(hashCode());
        StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 1 + String.valueOf(hexString).length());
        sb.append(name);
        sb.append("@");
        sb.append(hexString);
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzapg
    public final void zza(float f, float f2) {
        if (this.zzcxa != null) {
            this.zzcxa.zzb(f, f2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzapg
    public final void zza(zzapf zzapfVar) {
        this.zzcxd = zzapfVar;
    }

    final /* synthetic */ void zzah(int i) {
        if (this.zzcxd != null) {
            this.zzcxd.onWindowVisibilityChanged(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzapg
    public final String zzsp() {
        String valueOf = String.valueOf(this.zzcxb ? " spherical" : "");
        return valueOf.length() != 0 ? "MediaPlayer".concat(valueOf) : new String("MediaPlayer");
    }

    @Override // com.google.android.gms.internal.ads.zzapg, com.google.android.gms.internal.ads.zzaqa
    public final void zzst() {
        zza(this.zzcxl.getVolume());
    }
}
