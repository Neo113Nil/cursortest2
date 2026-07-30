package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.PersistableBundle;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import com.anythink.expressad.advanced.js.NativeAdvancedJsUtils;
import java.io.IOException;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.og, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class TextureViewSurfaceTextureListenerC3696og extends AbstractC3804qg implements TextureView.SurfaceTextureListener, MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnVideoSizeChangedListener {

    /* renamed from: M, reason: collision with root package name */
    public static final HashMap f33160M;

    /* renamed from: A, reason: collision with root package name */
    public int f33161A;

    /* renamed from: B, reason: collision with root package name */
    public MediaPlayer f33162B;

    /* renamed from: C, reason: collision with root package name */
    public Uri f33163C;

    /* renamed from: D, reason: collision with root package name */
    public int f33164D;

    /* renamed from: E, reason: collision with root package name */
    public int f33165E;

    /* renamed from: F, reason: collision with root package name */
    public int f33166F;

    /* renamed from: G, reason: collision with root package name */
    public C4181xg f33167G;

    /* renamed from: H, reason: collision with root package name */
    public final boolean f33168H;

    /* renamed from: I, reason: collision with root package name */
    public int f33169I;
    public C3965tg J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f33170K;

    /* renamed from: L, reason: collision with root package name */
    public Integer f33171L;

    /* renamed from: v, reason: collision with root package name */
    public final C2486Bh f33172v;

    /* renamed from: w, reason: collision with root package name */
    public final C4289zg f33173w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f33174x;

    /* renamed from: y, reason: collision with root package name */
    public final C3165eo f33175y;

    /* renamed from: z, reason: collision with root package name */
    public int f33176z;

    static {
        HashMap hashMap = new HashMap();
        f33160M = hashMap;
        hashMap.put(Integer.valueOf(com.anythink.core.common.m.o.f14852e), "MEDIA_ERROR_IO");
        hashMap.put(Integer.valueOf(com.anythink.core.common.m.o.f14855h), "MEDIA_ERROR_MALFORMED");
        hashMap.put(-1010, "MEDIA_ERROR_UNSUPPORTED");
        hashMap.put(-110, "MEDIA_ERROR_TIMED_OUT");
        hashMap.put(3, "MEDIA_INFO_VIDEO_RENDERING_START");
        hashMap.put(100, "MEDIA_ERROR_SERVER_DIED");
        hashMap.put(1, "MEDIA_ERROR_UNKNOWN");
        hashMap.put(1, "MEDIA_INFO_UNKNOWN");
        hashMap.put(Integer.valueOf(com.anythink.core.common.m.a.f14558n), "MEDIA_INFO_VIDEO_TRACK_LAGGING");
        hashMap.put(701, "MEDIA_INFO_BUFFERING_START");
        hashMap.put(702, "MEDIA_INFO_BUFFERING_END");
        hashMap.put(800, "MEDIA_INFO_BAD_INTERLEAVING");
        hashMap.put(801, "MEDIA_INFO_NOT_SEEKABLE");
        hashMap.put(Integer.valueOf(com.anythink.expressad.video.dynview.a.a.f21278s), "MEDIA_INFO_METADATA_UPDATE");
        hashMap.put(901, "MEDIA_INFO_UNSUPPORTED_SUBTITLE");
        hashMap.put(Integer.valueOf(com.anythink.expressad.video.dynview.a.a.ah), "MEDIA_INFO_SUBTITLE_TIMED_OUT");
    }

    public TextureViewSurfaceTextureListenerC3696og(Context context, C2486Bh c2486Bh, boolean z8, boolean z9, C4289zg c4289zg, C3165eo c3165eo) {
        super(context);
        this.f33176z = 0;
        this.f33161A = 0;
        this.f33170K = false;
        this.f33171L = null;
        this.f33172v = c2486Bh;
        this.f33173w = c4289zg;
        this.f33168H = z8;
        this.f33174x = z9;
        c4289zg.a(this);
        this.f33175y = c3165eo;
    }

    public final void D() {
        SurfaceTexture surfaceTexture;
        C3165eo c3165eo;
        t2.C.k("AdMediaPlayerView init MediaPlayer");
        SurfaceTexture surfaceTexture2 = getSurfaceTexture();
        if (this.f33163C == null || surfaceTexture2 == null) {
            return;
        }
        E(false);
        try {
            W3.e eVar = p2.j.f39798C.f39820u;
            MediaPlayer mediaPlayer = new MediaPlayer();
            this.f33162B = mediaPlayer;
            mediaPlayer.setOnBufferingUpdateListener(this);
            this.f33162B.setOnCompletionListener(this);
            this.f33162B.setOnErrorListener(this);
            this.f33162B.setOnInfoListener(this);
            this.f33162B.setOnPreparedListener(this);
            this.f33162B.setOnVideoSizeChangedListener(this);
            this.f33166F = 0;
            if (this.f33168H) {
                if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.Ke)).booleanValue() && (c3165eo = this.f33175y) != null) {
                    C2593Hm a9 = c3165eo.a();
                    a9.r(NativeAdvancedJsUtils.f18064p, "svp_ampv");
                    a9.s();
                }
                C4181xg c4181xg = new C4181xg(getContext());
                this.f33167G = c4181xg;
                int width = getWidth();
                int height = getHeight();
                c4181xg.f35200F = width;
                c4181xg.f35199E = height;
                c4181xg.f35202H = surfaceTexture2;
                C4181xg c4181xg2 = this.f33167G;
                c4181xg2.start();
                if (c4181xg2.f35202H == null) {
                    surfaceTexture = null;
                } else {
                    try {
                        c4181xg2.f35206M.await();
                    } catch (InterruptedException unused) {
                    }
                    surfaceTexture = c4181xg2.f35201G;
                }
                if (surfaceTexture != null) {
                    surfaceTexture2 = surfaceTexture;
                } else {
                    this.f33167G.b();
                    this.f33167G = null;
                }
            }
            this.f33162B.setDataSource(getContext(), this.f33163C);
            this.f33162B.setSurface(new Surface(surfaceTexture2));
            this.f33162B.setAudioStreamType(3);
            this.f33162B.setScreenOnWhilePlaying(true);
            this.f33162B.prepareAsync();
            G(1);
        } catch (IOException e6) {
            e = e6;
            u2.i.g("Failed to initialize MediaPlayer at ".concat(String.valueOf(this.f33163C)), e);
            onError(this.f33162B, 1, 0);
        } catch (IllegalArgumentException e9) {
            e = e9;
            u2.i.g("Failed to initialize MediaPlayer at ".concat(String.valueOf(this.f33163C)), e);
            onError(this.f33162B, 1, 0);
        } catch (IllegalStateException e10) {
            e = e10;
            u2.i.g("Failed to initialize MediaPlayer at ".concat(String.valueOf(this.f33163C)), e);
            onError(this.f33162B, 1, 0);
        }
    }

    public final void E(boolean z8) {
        t2.C.k("AdMediaPlayerView release");
        C4181xg c4181xg = this.f33167G;
        if (c4181xg != null) {
            c4181xg.b();
            this.f33167G = null;
        }
        MediaPlayer mediaPlayer = this.f33162B;
        if (mediaPlayer != null) {
            mediaPlayer.reset();
            this.f33162B.release();
            this.f33162B = null;
            G(0);
            if (z8) {
                this.f33161A = 0;
            }
        }
    }

    public final boolean F() {
        int i;
        return (this.f33162B == null || (i = this.f33176z) == -1 || i == 0 || i == 1) ? false : true;
    }

    public final void G(int i) {
        C2485Bg c2485Bg = this.f33738u;
        C4289zg c4289zg = this.f33173w;
        if (i == 3) {
            c4289zg.d();
            c2485Bg.f24056d = true;
            c2485Bg.a();
        } else if (this.f33176z == 3) {
            c4289zg.f35594m = false;
            c2485Bg.f24056d = false;
            c2485Bg.a();
        }
        this.f33176z = i;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3804qg
    public final String d() {
        return "MediaPlayer".concat(true != this.f33168H ? "" : " spherical");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3804qg
    public final void e(C3965tg c3965tg) {
        this.J = c3965tg;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3804qg
    public final void f(String str) {
        Uri parse = Uri.parse(str);
        U8 a9 = U8.a(parse);
        if (a9 == null || a9.f27934n != null) {
            if (a9 != null) {
                parse = Uri.parse(a9.f27934n);
            }
            this.f33163C = parse;
            this.f33169I = 0;
            D();
            requestLayout();
            invalidate();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3804qg
    public final void g() {
        t2.C.k("AdMediaPlayerView stop");
        MediaPlayer mediaPlayer = this.f33162B;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            this.f33162B.release();
            this.f33162B = null;
            G(0);
            this.f33161A = 0;
        }
        this.f33173w.b();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3804qg
    public final void h() {
        t2.C.k("AdMediaPlayerView play");
        if (F()) {
            this.f33162B.start();
            G(3);
            this.f33737n.f34832c = true;
            t2.G.f40858l.post(new RunnableC3588mg(this, 3));
        }
        this.f33161A = 3;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3804qg
    public final void i() {
        t2.C.k("AdMediaPlayerView pause");
        if (F() && this.f33162B.isPlaying()) {
            this.f33162B.pause();
            G(4);
            t2.G.f40858l.post(new RunnableC3588mg(this, 4));
        }
        this.f33161A = 4;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3804qg
    public final int j() {
        if (F()) {
            return this.f33162B.getDuration();
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3804qg
    public final int k() {
        if (F()) {
            return this.f33162B.getCurrentPosition();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3804qg
    public final void l(int i) {
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 23);
        sb.append("AdMediaPlayerView seek ");
        sb.append(i);
        t2.C.k(sb.toString());
        if (!F()) {
            this.f33169I = i;
        } else {
            this.f33162B.seekTo(i);
            this.f33169I = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3804qg
    public final void m(float f6, float f9) {
        C4181xg c4181xg = this.f33167G;
        if (c4181xg != null) {
            c4181xg.c(f6, f9);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2468Ag
    public final void n() {
        C2485Bg c2485Bg = this.f33738u;
        float f6 = c2485Bg.f24055c ? c2485Bg.f24057e ? 0.0f : c2485Bg.f24058f : 0.0f;
        MediaPlayer mediaPlayer = this.f33162B;
        if (mediaPlayer != null) {
            try {
                mediaPlayer.setVolume(f6, f6);
            } catch (IllegalStateException unused) {
            }
        } else {
            int i = t2.C.f40822b;
            u2.i.f("AdMediaPlayerView setMediaPlayerVolume() called before onPrepared().");
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3804qg
    public final int o() {
        MediaPlayer mediaPlayer = this.f33162B;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoWidth();
        }
        return 0;
    }

    @Override // android.view.TextureView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setSurfaceTextureListener(this);
    }

    @Override // android.media.MediaPlayer.OnBufferingUpdateListener
    public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
        this.f33166F = i;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        t2.C.k("AdMediaPlayerView completion");
        G(5);
        this.f33161A = 5;
        t2.G.f40858l.post(new RunnableC3588mg(this, 0, false));
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i, int i4) {
        HashMap hashMap = f33160M;
        String str = (String) hashMap.get(Integer.valueOf(i));
        String str2 = (String) hashMap.get(Integer.valueOf(i4));
        String q6 = com.anythink.basead.b.c.i.q(new StringBuilder(String.valueOf(str).length() + 38 + String.valueOf(str2).length()), "AdMediaPlayerView MediaPlayer error: ", str, ":", str2);
        int i9 = t2.C.f40822b;
        u2.i.f(q6);
        G(-1);
        this.f33161A = -1;
        t2.G.f40858l.post(new RunnableC3771q0(this, str, str2));
        return true;
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i4) {
        HashMap hashMap = f33160M;
        String str = (String) hashMap.get(Integer.valueOf(i));
        String str2 = (String) hashMap.get(Integer.valueOf(i4));
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 37 + String.valueOf(str2).length());
        sb.append("AdMediaPlayerView MediaPlayer info: ");
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        t2.C.k(sb.toString());
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x005e, code lost:
    
        if (r1 > r6) goto L30;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i, int i4) {
        int i9;
        int defaultSize = View.getDefaultSize(this.f33164D, i);
        int defaultSize2 = View.getDefaultSize(this.f33165E, i4);
        if (this.f33164D > 0 && this.f33165E > 0 && this.f33167G == null) {
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            int mode2 = View.MeasureSpec.getMode(i4);
            int size2 = View.MeasureSpec.getSize(i4);
            if (mode == 1073741824) {
                if (mode2 == 1073741824) {
                    int i10 = this.f33164D;
                    int i11 = i10 * size2;
                    int i12 = this.f33165E;
                    int i13 = size * i12;
                    if (i11 < i13) {
                        defaultSize = i11 / i12;
                        defaultSize2 = size2;
                    } else {
                        if (i11 > i13) {
                            defaultSize2 = i13 / i10;
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
                int i14 = (this.f33165E * size) / this.f33164D;
                if (mode2 != Integer.MIN_VALUE || i14 <= size2) {
                    defaultSize2 = i14;
                    defaultSize = size;
                }
                defaultSize = size;
                defaultSize2 = size2;
            } else {
                if (mode2 == 1073741824) {
                    i9 = (this.f33164D * size2) / this.f33165E;
                    if (mode == Integer.MIN_VALUE) {
                    }
                } else {
                    int i15 = this.f33164D;
                    int i16 = this.f33165E;
                    if (mode2 != Integer.MIN_VALUE || i16 <= size2) {
                        i9 = i15;
                        size2 = i16;
                    } else {
                        i9 = (size2 * i15) / i16;
                    }
                    if (mode == Integer.MIN_VALUE && i9 > size) {
                        defaultSize2 = (i16 * size) / i15;
                        defaultSize = size;
                    }
                }
                defaultSize = i9;
                defaultSize2 = size2;
            }
        }
        setMeasuredDimension(defaultSize, defaultSize2);
        C4181xg c4181xg = this.f33167G;
        if (c4181xg != null) {
            c4181xg.a(defaultSize, defaultSize2);
        }
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        t2.C.k("AdMediaPlayerView prepared");
        G(2);
        C4289zg c4289zg = this.f33173w;
        if (c4289zg.i && !c4289zg.f35591j) {
            AbstractC2655Lg.j(c4289zg.f35587e, c4289zg.f35586d, "vfr2");
            c4289zg.f35591j = true;
        }
        t2.G.f40858l.post(new MD(this, mediaPlayer, 13, false));
        this.f33164D = mediaPlayer.getVideoWidth();
        this.f33165E = mediaPlayer.getVideoHeight();
        int i = this.f33169I;
        if (i != 0) {
            l(i);
        }
        if (this.f33174x && F() && this.f33162B.getCurrentPosition() > 0 && this.f33161A != 3) {
            t2.C.k("AdMediaPlayerView nudging MediaPlayer");
            MediaPlayer mediaPlayer2 = this.f33162B;
            if (mediaPlayer2 != null) {
                try {
                    mediaPlayer2.setVolume(0.0f, 0.0f);
                } catch (IllegalStateException unused) {
                }
            } else {
                u2.i.f("AdMediaPlayerView setMediaPlayerVolume() called before onPrepared().");
            }
            this.f33162B.start();
            int currentPosition = this.f33162B.getCurrentPosition();
            p2.j.f39798C.f39810k.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            while (F() && this.f33162B.getCurrentPosition() == currentPosition) {
                p2.j.f39798C.f39810k.getClass();
                if (System.currentTimeMillis() - currentTimeMillis > 250) {
                    break;
                }
            }
            this.f33162B.pause();
            n();
        }
        int i4 = this.f33164D;
        int i9 = this.f33165E;
        StringBuilder sb = new StringBuilder(String.valueOf(i4).length() + 40 + String.valueOf(i9).length());
        sb.append("AdMediaPlayerView stream dimensions: ");
        sb.append(i4);
        sb.append(" x ");
        sb.append(i9);
        u2.i.e(sb.toString());
        if (this.f33161A == 3) {
            h();
        }
        n();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i4) {
        t2.C.k("AdMediaPlayerView surface created");
        D();
        t2.G.f40858l.post(new RunnableC3588mg(this, 1, false));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        t2.C.k("AdMediaPlayerView surface destroyed");
        MediaPlayer mediaPlayer = this.f33162B;
        if (mediaPlayer != null && this.f33169I == 0) {
            this.f33169I = mediaPlayer.getCurrentPosition();
        }
        C4181xg c4181xg = this.f33167G;
        if (c4181xg != null) {
            c4181xg.b();
        }
        t2.G.f40858l.post(new RunnableC3588mg(this, 2, false));
        E(true);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i4) {
        t2.C.k("AdMediaPlayerView surface changed");
        int i9 = this.f33161A;
        boolean z8 = false;
        if (this.f33164D == i && this.f33165E == i4) {
            z8 = true;
        }
        if (this.f33162B != null && i9 == 3 && z8) {
            int i10 = this.f33169I;
            if (i10 != 0) {
                l(i10);
            }
            h();
        }
        C4181xg c4181xg = this.f33167G;
        if (c4181xg != null) {
            c4181xg.a(i, i4);
        }
        t2.G.f40858l.post(new RunnableC3642ng(this, i, i4, 0));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.f33173w.c(this);
        this.f33737n.a(surfaceTexture, this.J);
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i4) {
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 35 + String.valueOf(i4).length());
        sb.append("AdMediaPlayerView size changed: ");
        sb.append(i);
        sb.append(" x ");
        sb.append(i4);
        t2.C.k(sb.toString());
        this.f33164D = mediaPlayer.getVideoWidth();
        int videoHeight = mediaPlayer.getVideoHeight();
        this.f33165E = videoHeight;
        if (this.f33164D == 0 || videoHeight == 0) {
            return;
        }
        requestLayout();
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 47);
        sb.append("AdMediaPlayerView window visibility changed to ");
        sb.append(i);
        t2.C.k(sb.toString());
        t2.G.f40858l.post(new L.a(this, i, 7));
        super.onWindowVisibilityChanged(i);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3804qg
    public final int p() {
        MediaPlayer mediaPlayer = this.f33162B;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoHeight();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3804qg
    public final long q() {
        if (this.f33171L != null) {
            return (x() * this.f33166F) / 100;
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3804qg
    public final long r() {
        return 0L;
    }

    @Override // android.view.View
    public final String toString() {
        String name = TextureViewSurfaceTextureListenerC3696og.class.getName();
        String hexString = Integer.toHexString(hashCode());
        return D.y.o(new StringBuilder(name.length() + 1 + String.valueOf(hexString).length()), name, "@", hexString);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3804qg
    public final long x() {
        if (this.f33171L != null) {
            return j() * this.f33171L.intValue();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3804qg
    public final int y() {
        PersistableBundle metrics;
        if (Build.VERSION.SDK_INT < 26 || !F()) {
            return -1;
        }
        metrics = this.f33162B.getMetrics();
        return metrics.getInt("android.media.mediaplayer.dropped");
    }
}
