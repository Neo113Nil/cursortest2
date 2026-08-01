package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzcda extends zzcdc implements TextureView.SurfaceTextureListener, MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnVideoSizeChangedListener {
    private static final Map zzc;
    private final zzcdw zzd;
    private final zzcdx zze;
    private final boolean zzf;
    private int zzg;
    private int zzh;
    private MediaPlayer zzi;
    private Uri zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private zzcdu zzn;
    private final boolean zzo;
    private int zzp;
    private zzcdb zzq;
    private boolean zzr;
    private Integer zzs;

    static {
        HashMap hashMap = new HashMap();
        zzc = hashMap;
        hashMap.put(-1004, "MEDIA_ERROR_IO");
        hashMap.put(-1007, "MEDIA_ERROR_MALFORMED");
        hashMap.put(-1010, "MEDIA_ERROR_UNSUPPORTED");
        hashMap.put(-110, "MEDIA_ERROR_TIMED_OUT");
        hashMap.put(3, "MEDIA_INFO_VIDEO_RENDERING_START");
        hashMap.put(100, "MEDIA_ERROR_SERVER_DIED");
        hashMap.put(1, "MEDIA_ERROR_UNKNOWN");
        hashMap.put(1, "MEDIA_INFO_UNKNOWN");
        hashMap.put(Integer.valueOf(TypedValues.TransitionType.TYPE_DURATION), "MEDIA_INFO_VIDEO_TRACK_LAGGING");
        hashMap.put(Integer.valueOf(TypedValues.TransitionType.TYPE_FROM), "MEDIA_INFO_BUFFERING_START");
        hashMap.put(Integer.valueOf(TypedValues.TransitionType.TYPE_TO), "MEDIA_INFO_BUFFERING_END");
        hashMap.put(800, "MEDIA_INFO_BAD_INTERLEAVING");
        hashMap.put(801, "MEDIA_INFO_NOT_SEEKABLE");
        hashMap.put(802, "MEDIA_INFO_METADATA_UPDATE");
        hashMap.put(Integer.valueOf(TypedValues.Custom.TYPE_FLOAT), "MEDIA_INFO_UNSUPPORTED_SUBTITLE");
        hashMap.put(Integer.valueOf(TypedValues.Custom.TYPE_COLOR), "MEDIA_INFO_SUBTITLE_TIMED_OUT");
    }

    public zzcda(Context context, zzcdw zzcdwVar, boolean z, boolean z2, zzcdv zzcdvVar, zzcdx zzcdxVar) {
        super(context);
        this.zzg = 0;
        this.zzh = 0;
        this.zzr = false;
        this.zzs = null;
        setSurfaceTextureListener(this);
        this.zzd = zzcdwVar;
        this.zze = zzcdxVar;
        this.zzo = z;
        this.zzf = z2;
        zzcdxVar.zza(this);
    }

    private final void zzD() {
        com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView init MediaPlayer");
        SurfaceTexture surfaceTexture = getSurfaceTexture();
        if (this.zzj == null || surfaceTexture == null) {
            return;
        }
        zzE(false);
        try {
            com.google.android.gms.ads.internal.zzt.zzk();
            MediaPlayer mediaPlayer = new MediaPlayer();
            this.zzi = mediaPlayer;
            mediaPlayer.setOnBufferingUpdateListener(this);
            this.zzi.setOnCompletionListener(this);
            this.zzi.setOnErrorListener(this);
            this.zzi.setOnInfoListener(this);
            this.zzi.setOnPreparedListener(this);
            this.zzi.setOnVideoSizeChangedListener(this);
            this.zzm = 0;
            if (this.zzo) {
                zzcdu zzcduVar = new zzcdu(getContext());
                this.zzn = zzcduVar;
                zzcduVar.zzd(surfaceTexture, getWidth(), getHeight());
                this.zzn.start();
                SurfaceTexture zzb = this.zzn.zzb();
                if (zzb != null) {
                    surfaceTexture = zzb;
                } else {
                    this.zzn.zze();
                    this.zzn = null;
                }
            }
            this.zzi.setDataSource(getContext(), this.zzj);
            com.google.android.gms.ads.internal.zzt.zzl();
            this.zzi.setSurface(new Surface(surfaceTexture));
            this.zzi.setAudioStreamType(3);
            this.zzi.setScreenOnWhilePlaying(true);
            this.zzi.prepareAsync();
            zzF(1);
        } catch (IOException | IllegalArgumentException | IllegalStateException e) {
            zzcbn.zzk("Failed to initialize MediaPlayer at ".concat(String.valueOf(String.valueOf(this.zzj))), e);
            onError(this.zzi, 1, 0);
        }
    }

    private final void zzE(boolean z) {
        com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView release");
        zzcdu zzcduVar = this.zzn;
        if (zzcduVar != null) {
            zzcduVar.zze();
            this.zzn = null;
        }
        MediaPlayer mediaPlayer = this.zzi;
        if (mediaPlayer != null) {
            mediaPlayer.reset();
            this.zzi.release();
            this.zzi = null;
            zzF(0);
            if (z) {
                this.zzh = 0;
            }
        }
    }

    private final void zzF(int i) {
        if (i == 3) {
            this.zze.zzc();
            this.zzb.zzb();
        } else if (this.zzg == 3) {
            this.zze.zze();
            this.zzb.zzc();
        }
        this.zzg = i;
    }

    private final void zzG(float f) {
        MediaPlayer mediaPlayer = this.zzi;
        if (mediaPlayer == null) {
            zzcbn.zzj("AdMediaPlayerView setMediaPlayerVolume() called before onPrepared().");
        } else {
            try {
                mediaPlayer.setVolume(f, f);
            } catch (IllegalStateException unused) {
            }
        }
    }

    private final boolean zzH() {
        int i;
        return (this.zzi == null || (i = this.zzg) == -1 || i == 0 || i == 1) ? false : true;
    }

    static /* bridge */ /* synthetic */ void zzl(zzcda zzcdaVar, MediaPlayer mediaPlayer) {
        MediaFormat format;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzbO)).booleanValue() || zzcdaVar.zzd == null || mediaPlayer == null) {
            return;
        }
        try {
            MediaPlayer.TrackInfo[] trackInfo = mediaPlayer.getTrackInfo();
            if (trackInfo != null) {
                HashMap hashMap = new HashMap();
                for (MediaPlayer.TrackInfo trackInfo2 : trackInfo) {
                    if (trackInfo2 != null) {
                        int trackType = trackInfo2.getTrackType();
                        if (trackType == 1) {
                            MediaFormat format2 = trackInfo2.getFormat();
                            if (format2 != null) {
                                if (format2.containsKey("frame-rate")) {
                                    try {
                                        hashMap.put("frameRate", String.valueOf(format2.getFloat("frame-rate")));
                                    } catch (ClassCastException unused) {
                                        hashMap.put("frameRate", String.valueOf(format2.getInteger("frame-rate")));
                                    }
                                }
                                if (format2.containsKey("bitrate")) {
                                    Integer valueOf = Integer.valueOf(format2.getInteger("bitrate"));
                                    zzcdaVar.zzs = valueOf;
                                    hashMap.put("bitRate", String.valueOf(valueOf));
                                }
                                if (format2.containsKey("width") && format2.containsKey("height")) {
                                    hashMap.put("resolution", format2.getInteger("width") + "x" + format2.getInteger("height"));
                                }
                                if (format2.containsKey("mime")) {
                                    hashMap.put("videoMime", format2.getString("mime"));
                                }
                                if (Build.VERSION.SDK_INT >= 30 && format2.containsKey("codecs-string")) {
                                    hashMap.put("videoCodec", format2.getString("codecs-string"));
                                }
                            }
                        } else if (trackType == 2 && (format = trackInfo2.getFormat()) != null) {
                            if (format.containsKey("mime")) {
                                hashMap.put("audioMime", format.getString("mime"));
                            }
                            if (Build.VERSION.SDK_INT >= 30 && format.containsKey("codecs-string")) {
                                hashMap.put("audioCodec", format.getString("codecs-string"));
                            }
                        }
                    }
                }
                if (hashMap.isEmpty()) {
                    return;
                }
                zzcdaVar.zzd.zzd("onMetadataEvent", hashMap);
            }
        } catch (RuntimeException e) {
            com.google.android.gms.ads.internal.zzt.zzo().zzw(e, "AdMediaPlayerView.reportMetadata");
        }
    }

    @Override // android.media.MediaPlayer.OnBufferingUpdateListener
    public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
        this.zzm = i;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView completion");
        zzF(5);
        this.zzh = 5;
        com.google.android.gms.ads.internal.util.zzt.zza.post(new zzcct(this));
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        Map map = zzc;
        String str = (String) map.get(Integer.valueOf(i));
        String str2 = (String) map.get(Integer.valueOf(i2));
        zzcbn.zzj("AdMediaPlayerView MediaPlayer error: " + str + ":" + str2);
        zzF(-1);
        this.zzh = -1;
        com.google.android.gms.ads.internal.util.zzt.zza.post(new zzccu(this, str, str2));
        return true;
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
        Map map = zzc;
        com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView MediaPlayer info: " + ((String) map.get(Integer.valueOf(i))) + ":" + ((String) map.get(Integer.valueOf(i2))));
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x005e, code lost:
    
        if (r1 > r6) goto L30;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final void onMeasure(int i, int i2) {
        int i3;
        int defaultSize = getDefaultSize(this.zzk, i);
        int defaultSize2 = getDefaultSize(this.zzl, i2);
        if (this.zzk > 0 && this.zzl > 0 && this.zzn == null) {
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            int size2 = View.MeasureSpec.getSize(i2);
            if (mode == 1073741824) {
                if (mode2 == 1073741824) {
                    int i4 = this.zzk;
                    int i5 = i4 * size2;
                    int i6 = this.zzl;
                    int i7 = size * i6;
                    if (i5 < i7) {
                        defaultSize = i5 / i6;
                        defaultSize2 = size2;
                    } else {
                        if (i5 > i7) {
                            defaultSize2 = i7 / i4;
                            defaultSize = size;
                        }
                        defaultSize = size;
                        defaultSize2 = size2;
                    }
                } else {
                    mode = 1073741824;
                }
            }
            if (mode == 1073741824) {
                int i8 = (this.zzl * size) / this.zzk;
                if (mode2 != Integer.MIN_VALUE || i8 <= size2) {
                    defaultSize2 = i8;
                    defaultSize = size;
                }
                defaultSize = size;
                defaultSize2 = size2;
            } else {
                if (mode2 == 1073741824) {
                    i3 = (this.zzk * size2) / this.zzl;
                    if (mode == Integer.MIN_VALUE) {
                    }
                } else {
                    int i9 = this.zzk;
                    int i10 = this.zzl;
                    if (mode2 != Integer.MIN_VALUE || i10 <= size2) {
                        i3 = i9;
                        size2 = i10;
                    } else {
                        i3 = (size2 * i9) / i10;
                    }
                    if (mode == Integer.MIN_VALUE && i3 > size) {
                        defaultSize2 = (i10 * size) / i9;
                        defaultSize = size;
                    }
                }
                defaultSize = i3;
                defaultSize2 = size2;
            }
        }
        setMeasuredDimension(defaultSize, defaultSize2);
        zzcdu zzcduVar = this.zzn;
        if (zzcduVar != null) {
            zzcduVar.zzc(defaultSize, defaultSize2);
        }
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView prepared");
        zzF(2);
        this.zze.zzb();
        com.google.android.gms.ads.internal.util.zzt.zza.post(new zzccs(this, mediaPlayer));
        this.zzk = mediaPlayer.getVideoWidth();
        this.zzl = mediaPlayer.getVideoHeight();
        int i = this.zzp;
        if (i != 0) {
            zzq(i);
        }
        if (this.zzf && zzH() && this.zzi.getCurrentPosition() > 0 && this.zzh != 3) {
            com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView nudging MediaPlayer");
            zzG(0.0f);
            this.zzi.start();
            int currentPosition = this.zzi.getCurrentPosition();
            long currentTimeMillis = com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis();
            while (zzH() && this.zzi.getCurrentPosition() == currentPosition && com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis() - currentTimeMillis <= 250) {
            }
            this.zzi.pause();
            zzn();
        }
        zzcbn.zzi("AdMediaPlayerView stream dimensions: " + this.zzk + " x " + this.zzl);
        if (this.zzh == 3) {
            zzp();
        }
        zzn();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView surface created");
        zzD();
        com.google.android.gms.ads.internal.util.zzt.zza.post(new zzccv(this));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView surface destroyed");
        MediaPlayer mediaPlayer = this.zzi;
        if (mediaPlayer != null && this.zzp == 0) {
            this.zzp = mediaPlayer.getCurrentPosition();
        }
        zzcdu zzcduVar = this.zzn;
        if (zzcduVar != null) {
            zzcduVar.zze();
        }
        com.google.android.gms.ads.internal.util.zzt.zza.post(new zzccx(this));
        zzE(true);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView surface changed");
        int i3 = this.zzh;
        boolean z = false;
        if (this.zzk == i && this.zzl == i2) {
            z = true;
        }
        if (this.zzi != null && i3 == 3 && z) {
            int i4 = this.zzp;
            if (i4 != 0) {
                zzq(i4);
            }
            zzp();
        }
        zzcdu zzcduVar = this.zzn;
        if (zzcduVar != null) {
            zzcduVar.zzc(i, i2);
        }
        com.google.android.gms.ads.internal.util.zzt.zza.post(new zzccw(this, i, i2));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.zze.zzf(this);
        this.zza.zza(surfaceTexture, this.zzq);
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
        com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView size changed: " + i + " x " + i2);
        this.zzk = mediaPlayer.getVideoWidth();
        int videoHeight = mediaPlayer.getVideoHeight();
        this.zzl = videoHeight;
        if (this.zzk == 0 || videoHeight == 0) {
            return;
        }
        requestLayout();
    }

    @Override // android.view.View
    protected final void onWindowVisibilityChanged(final int i) {
        com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView window visibility changed to " + i);
        com.google.android.gms.ads.internal.util.zzt.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzccr
            @Override // java.lang.Runnable
            public final void run() {
                zzcda.this.zzm(i);
            }
        });
        super.onWindowVisibilityChanged(i);
    }

    @Override // android.view.View
    public final String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }

    @Override // com.google.android.gms.internal.ads.zzcdc
    public final int zza() {
        if (zzH()) {
            return this.zzi.getCurrentPosition();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcdc
    public final int zzb() {
        if (Build.VERSION.SDK_INT < 26 || !zzH()) {
            return -1;
        }
        return this.zzi.getMetrics().getInt("android.media.mediaplayer.dropped");
    }

    @Override // com.google.android.gms.internal.ads.zzcdc
    public final int zzc() {
        if (zzH()) {
            return this.zzi.getDuration();
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcdc
    public final int zzd() {
        MediaPlayer mediaPlayer = this.zzi;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoHeight();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcdc
    public final int zze() {
        MediaPlayer mediaPlayer = this.zzi;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoWidth();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcdc
    public final long zzf() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzcdc
    public final long zzg() {
        if (this.zzs != null) {
            return (zzh() * this.zzm) / 100;
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzcdc
    public final long zzh() {
        if (this.zzs != null) {
            return zzc() * this.zzs.intValue();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzcdc
    public final String zzj() {
        return "MediaPlayer".concat(true != this.zzo ? "" : " spherical");
    }

    final /* synthetic */ void zzm(int i) {
        zzcdb zzcdbVar = this.zzq;
        if (zzcdbVar != null) {
            zzcdbVar.onWindowVisibilityChanged(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdc, com.google.android.gms.internal.ads.zzcdz
    public final void zzn() {
        zzG(this.zzb.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzcdc
    public final void zzo() {
        com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView pause");
        if (zzH() && this.zzi.isPlaying()) {
            this.zzi.pause();
            zzF(4);
            com.google.android.gms.ads.internal.util.zzt.zza.post(new zzccz(this));
        }
        this.zzh = 4;
    }

    @Override // com.google.android.gms.internal.ads.zzcdc
    public final void zzp() {
        com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView play");
        if (zzH()) {
            this.zzi.start();
            zzF(3);
            this.zza.zzb();
            com.google.android.gms.ads.internal.util.zzt.zza.post(new zzccy(this));
        }
        this.zzh = 3;
    }

    @Override // com.google.android.gms.internal.ads.zzcdc
    public final void zzq(int i) {
        com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView seek " + i);
        if (!zzH()) {
            this.zzp = i;
        } else {
            this.zzi.seekTo(i);
            this.zzp = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdc
    public final void zzr(zzcdb zzcdbVar) {
        this.zzq = zzcdbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcdc
    public final void zzs(String str) {
        Uri parse = Uri.parse(str);
        zzayb zza = zzayb.zza(parse);
        if (zza == null || zza.zza != null) {
            if (zza != null) {
                parse = Uri.parse(zza.zza);
            }
            this.zzj = parse;
            this.zzp = 0;
            zzD();
            requestLayout();
            invalidate();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdc
    public final void zzt() {
        com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView stop");
        MediaPlayer mediaPlayer = this.zzi;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            this.zzi.release();
            this.zzi = null;
            zzF(0);
            this.zzh = 0;
        }
        this.zze.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzcdc
    public final void zzu(float f, float f2) {
        zzcdu zzcduVar = this.zzn;
        if (zzcduVar != null) {
            zzcduVar.zzf(f, f2);
        }
    }
}
