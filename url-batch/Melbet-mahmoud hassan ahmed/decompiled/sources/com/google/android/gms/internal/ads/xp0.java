package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
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
/* loaded from: classes.dex */
public final class xp0 extends zp0 implements TextureView.SurfaceTextureListener, MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnVideoSizeChangedListener {

    /* renamed from: z, reason: collision with root package name */
    private static final Map<Integer, String> f14279z;

    /* renamed from: h, reason: collision with root package name */
    private final tq0 f14280h;

    /* renamed from: i, reason: collision with root package name */
    private final uq0 f14281i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f14282j;

    /* renamed from: k, reason: collision with root package name */
    private int f14283k;

    /* renamed from: l, reason: collision with root package name */
    private int f14284l;

    /* renamed from: m, reason: collision with root package name */
    private MediaPlayer f14285m;

    /* renamed from: n, reason: collision with root package name */
    private Uri f14286n;

    /* renamed from: o, reason: collision with root package name */
    private int f14287o;

    /* renamed from: p, reason: collision with root package name */
    private int f14288p;

    /* renamed from: q, reason: collision with root package name */
    private int f14289q;

    /* renamed from: r, reason: collision with root package name */
    private int f14290r;

    /* renamed from: s, reason: collision with root package name */
    private int f14291s;

    /* renamed from: t, reason: collision with root package name */
    private rq0 f14292t;

    /* renamed from: u, reason: collision with root package name */
    private final boolean f14293u;

    /* renamed from: v, reason: collision with root package name */
    private int f14294v;

    /* renamed from: w, reason: collision with root package name */
    private yp0 f14295w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f14296x;

    /* renamed from: y, reason: collision with root package name */
    private Integer f14297y;

    static {
        HashMap hashMap = new HashMap();
        f14279z = hashMap;
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 17) {
            hashMap.put(-1004, "MEDIA_ERROR_IO");
            hashMap.put(-1007, "MEDIA_ERROR_MALFORMED");
            hashMap.put(-1010, "MEDIA_ERROR_UNSUPPORTED");
            hashMap.put(-110, "MEDIA_ERROR_TIMED_OUT");
            hashMap.put(3, "MEDIA_INFO_VIDEO_RENDERING_START");
        }
        hashMap.put(100, "MEDIA_ERROR_SERVER_DIED");
        hashMap.put(1, "MEDIA_ERROR_UNKNOWN");
        hashMap.put(1, "MEDIA_INFO_UNKNOWN");
        hashMap.put(700, "MEDIA_INFO_VIDEO_TRACK_LAGGING");
        hashMap.put(701, "MEDIA_INFO_BUFFERING_START");
        hashMap.put(702, "MEDIA_INFO_BUFFERING_END");
        hashMap.put(800, "MEDIA_INFO_BAD_INTERLEAVING");
        hashMap.put(801, "MEDIA_INFO_NOT_SEEKABLE");
        hashMap.put(802, "MEDIA_INFO_METADATA_UPDATE");
        if (i7 >= 19) {
            hashMap.put(901, "MEDIA_INFO_UNSUPPORTED_SUBTITLE");
            hashMap.put(902, "MEDIA_INFO_SUBTITLE_TIMED_OUT");
        }
    }

    public xp0(Context context, tq0 tq0Var, boolean z6, boolean z7, sq0 sq0Var, uq0 uq0Var) {
        super(context);
        this.f14283k = 0;
        this.f14284l = 0;
        this.f14296x = false;
        this.f14297y = null;
        setSurfaceTextureListener(this);
        this.f14280h = tq0Var;
        this.f14281i = uq0Var;
        this.f14293u = z6;
        this.f14282j = z7;
        uq0Var.a(this);
    }

    private final void D() {
        a3.r1.k("AdMediaPlayerView init MediaPlayer");
        SurfaceTexture surfaceTexture = getSurfaceTexture();
        if (this.f14286n == null || surfaceTexture == null) {
            return;
        }
        F(false);
        try {
            y2.t.l();
            MediaPlayer mediaPlayer = new MediaPlayer();
            this.f14285m = mediaPlayer;
            mediaPlayer.setOnBufferingUpdateListener(this);
            this.f14285m.setOnCompletionListener(this);
            this.f14285m.setOnErrorListener(this);
            this.f14285m.setOnInfoListener(this);
            this.f14285m.setOnPreparedListener(this);
            this.f14285m.setOnVideoSizeChangedListener(this);
            this.f14289q = 0;
            if (this.f14293u) {
                rq0 rq0Var = new rq0(getContext());
                this.f14292t = rq0Var;
                rq0Var.c(surfaceTexture, getWidth(), getHeight());
                this.f14292t.start();
                SurfaceTexture a7 = this.f14292t.a();
                if (a7 != null) {
                    surfaceTexture = a7;
                } else {
                    this.f14292t.d();
                    this.f14292t = null;
                }
            }
            this.f14285m.setDataSource(getContext(), this.f14286n);
            y2.t.m();
            this.f14285m.setSurface(new Surface(surfaceTexture));
            this.f14285m.setAudioStreamType(3);
            this.f14285m.setScreenOnWhilePlaying(true);
            this.f14285m.prepareAsync();
            G(1);
        } catch (IOException | IllegalArgumentException | IllegalStateException e7) {
            io0.h("Failed to initialize MediaPlayer at ".concat(String.valueOf(this.f14286n)), e7);
            onError(this.f14285m, 1, 0);
        }
    }

    private final void E() {
        if (this.f14282j && I() && this.f14285m.getCurrentPosition() > 0 && this.f14284l != 3) {
            a3.r1.k("AdMediaPlayerView nudging MediaPlayer");
            H(0.0f);
            this.f14285m.start();
            int currentPosition = this.f14285m.getCurrentPosition();
            long b7 = y2.t.a().b();
            while (I() && this.f14285m.getCurrentPosition() == currentPosition && y2.t.a().b() - b7 <= 250) {
            }
            this.f14285m.pause();
            m();
        }
    }

    private final void F(boolean z6) {
        a3.r1.k("AdMediaPlayerView release");
        rq0 rq0Var = this.f14292t;
        if (rq0Var != null) {
            rq0Var.d();
            this.f14292t = null;
        }
        MediaPlayer mediaPlayer = this.f14285m;
        if (mediaPlayer != null) {
            mediaPlayer.reset();
            this.f14285m.release();
            this.f14285m = null;
            G(0);
            if (z6) {
                this.f14284l = 0;
            }
        }
    }

    private final void G(int i7) {
        if (i7 == 3) {
            this.f14281i.c();
            this.f15217g.b();
        } else if (this.f14283k == 3) {
            this.f14281i.e();
            this.f15217g.c();
        }
        this.f14283k = i7;
    }

    private final void H(float f7) {
        MediaPlayer mediaPlayer = this.f14285m;
        if (mediaPlayer == null) {
            io0.g("AdMediaPlayerView setMediaPlayerVolume() called before onPrepared().");
        } else {
            try {
                mediaPlayer.setVolume(f7, f7);
            } catch (IllegalStateException unused) {
            }
        }
    }

    private final boolean I() {
        int i7;
        return (this.f14285m == null || (i7 = this.f14283k) == -1 || i7 == 0 || i7 == 1) ? false : true;
    }

    static /* bridge */ /* synthetic */ void L(xp0 xp0Var, MediaPlayer mediaPlayer) {
        MediaPlayer.TrackInfo[] trackInfo;
        String string;
        String str;
        MediaFormat format;
        if (!((Boolean) sw.c().b(m10.f8290r1)).booleanValue() || xp0Var.f14280h == null || mediaPlayer == null || Build.VERSION.SDK_INT < 19 || (trackInfo = mediaPlayer.getTrackInfo()) == null) {
            return;
        }
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
                            xp0Var.f14297y = valueOf;
                            hashMap.put("bitRate", String.valueOf(valueOf));
                        }
                        if (format2.containsKey("width") && format2.containsKey("height")) {
                            int integer = format2.getInteger("width");
                            int integer2 = format2.getInteger("height");
                            StringBuilder sb = new StringBuilder(23);
                            sb.append(integer);
                            sb.append("x");
                            sb.append(integer2);
                            hashMap.put("resolution", sb.toString());
                        }
                        if (format2.containsKey("mime")) {
                            hashMap.put("videoMime", format2.getString("mime"));
                        }
                        if (Build.VERSION.SDK_INT >= 30 && format2.containsKey("codecs-string")) {
                            string = format2.getString("codecs-string");
                            str = "videoCodec";
                            hashMap.put(str, string);
                        }
                    }
                } else if (trackType == 2 && (format = trackInfo2.getFormat()) != null) {
                    if (format.containsKey("mime")) {
                        hashMap.put("audioMime", format.getString("mime"));
                    }
                    if (Build.VERSION.SDK_INT >= 30 && format.containsKey("codecs-string")) {
                        string = format.getString("codecs-string");
                        str = "audioCodec";
                        hashMap.put(str, string);
                    }
                }
            }
        }
        if (hashMap.isEmpty()) {
            return;
        }
        xp0Var.f14280h.t("onMetadataEvent", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zp0
    public final int g() {
        if (I()) {
            return this.f14285m.getCurrentPosition();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zp0
    public final int h() {
        if (Build.VERSION.SDK_INT < 26 || !I()) {
            return -1;
        }
        return this.f14285m.getMetrics().getInt("android.media.mediaplayer.dropped");
    }

    @Override // com.google.android.gms.internal.ads.zp0
    public final int i() {
        if (I()) {
            return this.f14285m.getDuration();
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zp0
    public final int j() {
        MediaPlayer mediaPlayer = this.f14285m;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoHeight();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zp0
    public final int k() {
        MediaPlayer mediaPlayer = this.f14285m;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoWidth();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zp0
    public final long l() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zp0, com.google.android.gms.internal.ads.wq0
    public final void m() {
        H(this.f15217g.a());
    }

    final /* synthetic */ void n(int i7) {
        yp0 yp0Var = this.f14295w;
        if (yp0Var != null) {
            yp0Var.onWindowVisibilityChanged(i7);
        }
    }

    @Override // com.google.android.gms.internal.ads.zp0
    public final long o() {
        if (this.f14297y != null) {
            return (p() * this.f14289q) / 100;
        }
        return -1L;
    }

    @Override // android.media.MediaPlayer.OnBufferingUpdateListener
    public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i7) {
        this.f14289q = i7;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        a3.r1.k("AdMediaPlayerView completion");
        G(5);
        this.f14284l = 5;
        a3.g2.f72i.post(new qp0(this));
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i7, int i8) {
        Map<Integer, String> map = f14279z;
        String str = map.get(Integer.valueOf(i7));
        String str2 = map.get(Integer.valueOf(i8));
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 38 + String.valueOf(str2).length());
        sb.append("AdMediaPlayerView MediaPlayer error: ");
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        io0.g(sb.toString());
        G(-1);
        this.f14284l = -1;
        a3.g2.f72i.post(new rp0(this, str, str2));
        return true;
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public final boolean onInfo(MediaPlayer mediaPlayer, int i7, int i8) {
        Map<Integer, String> map = f14279z;
        String str = map.get(Integer.valueOf(i7));
        String str2 = map.get(Integer.valueOf(i8));
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 37 + String.valueOf(str2).length());
        sb.append("AdMediaPlayerView MediaPlayer info: ");
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        a3.r1.k(sb.toString());
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0061, code lost:
    
        if (r1 > r6) goto L30;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final void onMeasure(int i7, int i8) {
        int i9;
        int i10;
        int defaultSize = TextureView.getDefaultSize(this.f14287o, i7);
        int defaultSize2 = TextureView.getDefaultSize(this.f14288p, i8);
        if (this.f14287o > 0 && this.f14288p > 0 && this.f14292t == null) {
            int mode = View.MeasureSpec.getMode(i7);
            int size = View.MeasureSpec.getSize(i7);
            int mode2 = View.MeasureSpec.getMode(i8);
            int size2 = View.MeasureSpec.getSize(i8);
            if (mode == 1073741824) {
                if (mode2 == 1073741824) {
                    int i11 = this.f14287o;
                    int i12 = i11 * size2;
                    int i13 = this.f14288p;
                    int i14 = size * i13;
                    if (i12 < i14) {
                        defaultSize = i12 / i13;
                        defaultSize2 = size2;
                    } else {
                        if (i12 > i14) {
                            defaultSize2 = i14 / i11;
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
                int i15 = (this.f14288p * size) / this.f14287o;
                if (mode2 != Integer.MIN_VALUE || i15 <= size2) {
                    defaultSize2 = i15;
                    defaultSize = size;
                }
                defaultSize = size;
                defaultSize2 = size2;
            } else {
                if (mode2 == 1073741824) {
                    i10 = (this.f14287o * size2) / this.f14288p;
                    if (mode == Integer.MIN_VALUE) {
                    }
                } else {
                    int i16 = this.f14287o;
                    int i17 = this.f14288p;
                    if (mode2 != Integer.MIN_VALUE || i17 <= size2) {
                        i10 = i16;
                        size2 = i17;
                    } else {
                        i10 = (size2 * i16) / i17;
                    }
                    if (mode == Integer.MIN_VALUE && i10 > size) {
                        defaultSize2 = (i17 * size) / i16;
                        defaultSize = size;
                    }
                }
                defaultSize = i10;
                defaultSize2 = size2;
            }
        }
        setMeasuredDimension(defaultSize, defaultSize2);
        rq0 rq0Var = this.f14292t;
        if (rq0Var != null) {
            rq0Var.b(defaultSize, defaultSize2);
        }
        if (Build.VERSION.SDK_INT == 16) {
            int i18 = this.f14290r;
            if ((i18 > 0 && i18 != defaultSize) || ((i9 = this.f14291s) > 0 && i9 != defaultSize2)) {
                E();
            }
            this.f14290r = defaultSize;
            this.f14291s = defaultSize2;
        }
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        a3.r1.k("AdMediaPlayerView prepared");
        G(2);
        this.f14281i.b();
        a3.g2.f72i.post(new pp0(this, mediaPlayer));
        this.f14287o = mediaPlayer.getVideoWidth();
        this.f14288p = mediaPlayer.getVideoHeight();
        int i7 = this.f14294v;
        if (i7 != 0) {
            t(i7);
        }
        E();
        int i8 = this.f14287o;
        int i9 = this.f14288p;
        StringBuilder sb = new StringBuilder(62);
        sb.append("AdMediaPlayerView stream dimensions: ");
        sb.append(i8);
        sb.append(" x ");
        sb.append(i9);
        io0.f(sb.toString());
        if (this.f14284l == 3) {
            s();
        }
        m();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i7, int i8) {
        a3.r1.k("AdMediaPlayerView surface created");
        D();
        a3.g2.f72i.post(new sp0(this));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        a3.r1.k("AdMediaPlayerView surface destroyed");
        MediaPlayer mediaPlayer = this.f14285m;
        if (mediaPlayer != null && this.f14294v == 0) {
            this.f14294v = mediaPlayer.getCurrentPosition();
        }
        rq0 rq0Var = this.f14292t;
        if (rq0Var != null) {
            rq0Var.d();
        }
        a3.g2.f72i.post(new up0(this));
        F(true);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i7, int i8) {
        a3.r1.k("AdMediaPlayerView surface changed");
        int i9 = this.f14284l;
        boolean z6 = false;
        if (this.f14287o == i7 && this.f14288p == i8) {
            z6 = true;
        }
        if (this.f14285m != null && i9 == 3 && z6) {
            int i10 = this.f14294v;
            if (i10 != 0) {
                t(i10);
            }
            s();
        }
        rq0 rq0Var = this.f14292t;
        if (rq0Var != null) {
            rq0Var.b(i7, i8);
        }
        a3.g2.f72i.post(new tp0(this, i7, i8));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.f14281i.f(this);
        this.f15216f.a(surfaceTexture, this.f14295w);
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i7, int i8) {
        StringBuilder sb = new StringBuilder(57);
        sb.append("AdMediaPlayerView size changed: ");
        sb.append(i7);
        sb.append(" x ");
        sb.append(i8);
        a3.r1.k(sb.toString());
        this.f14287o = mediaPlayer.getVideoWidth();
        int videoHeight = mediaPlayer.getVideoHeight();
        this.f14288p = videoHeight;
        if (this.f14287o == 0 || videoHeight == 0) {
            return;
        }
        requestLayout();
    }

    @Override // android.view.View
    protected final void onWindowVisibilityChanged(final int i7) {
        StringBuilder sb = new StringBuilder(58);
        sb.append("AdMediaPlayerView window visibility changed to ");
        sb.append(i7);
        a3.r1.k(sb.toString());
        a3.g2.f72i.post(new Runnable() { // from class: com.google.android.gms.internal.ads.op0
            @Override // java.lang.Runnable
            public final void run() {
                xp0.this.n(i7);
            }
        });
        super.onWindowVisibilityChanged(i7);
    }

    @Override // com.google.android.gms.internal.ads.zp0
    public final long p() {
        if (this.f14297y != null) {
            return i() * this.f14297y.intValue();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zp0
    public final String q() {
        String str = true != this.f14293u ? "" : " spherical";
        return str.length() != 0 ? "MediaPlayer".concat(str) : new String("MediaPlayer");
    }

    @Override // com.google.android.gms.internal.ads.zp0
    public final void r() {
        a3.r1.k("AdMediaPlayerView pause");
        if (I() && this.f14285m.isPlaying()) {
            this.f14285m.pause();
            G(4);
            a3.g2.f72i.post(new wp0(this));
        }
        this.f14284l = 4;
    }

    @Override // com.google.android.gms.internal.ads.zp0
    public final void s() {
        a3.r1.k("AdMediaPlayerView play");
        if (I()) {
            this.f14285m.start();
            G(3);
            this.f15216f.b();
            a3.g2.f72i.post(new vp0(this));
        }
        this.f14284l = 3;
    }

    @Override // com.google.android.gms.internal.ads.zp0
    public final void t(int i7) {
        StringBuilder sb = new StringBuilder(34);
        sb.append("AdMediaPlayerView seek ");
        sb.append(i7);
        a3.r1.k(sb.toString());
        if (!I()) {
            this.f14294v = i7;
        } else {
            this.f14285m.seekTo(i7);
            this.f14294v = 0;
        }
    }

    @Override // android.view.View
    public final String toString() {
        String name = xp0.class.getName();
        String hexString = Integer.toHexString(hashCode());
        StringBuilder sb = new StringBuilder(name.length() + 1 + String.valueOf(hexString).length());
        sb.append(name);
        sb.append("@");
        sb.append(hexString);
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zp0
    public final void u(yp0 yp0Var) {
        this.f14295w = yp0Var;
    }

    @Override // com.google.android.gms.internal.ads.zp0
    public final void v(String str) {
        Uri parse = Uri.parse(str);
        mq c7 = mq.c(parse);
        if (c7 == null || c7.f8673f != null) {
            if (c7 != null) {
                parse = Uri.parse(c7.f8673f);
            }
            this.f14286n = parse;
            this.f14294v = 0;
            D();
            requestLayout();
            invalidate();
        }
    }

    @Override // com.google.android.gms.internal.ads.zp0
    public final void w() {
        a3.r1.k("AdMediaPlayerView stop");
        MediaPlayer mediaPlayer = this.f14285m;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            this.f14285m.release();
            this.f14285m = null;
            G(0);
            this.f14284l = 0;
        }
        this.f14281i.d();
    }

    @Override // com.google.android.gms.internal.ads.zp0
    public final void y(float f7, float f8) {
        rq0 rq0Var = this.f14292t;
        if (rq0Var != null) {
            rq0Var.e(f7, f8);
        }
    }
}
