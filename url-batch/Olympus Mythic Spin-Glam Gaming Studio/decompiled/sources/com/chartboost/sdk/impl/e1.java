package com.chartboost.sdk.impl;

import android.media.MediaPlayer;
import android.os.Build;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import com.chartboost.sdk.impl.jk;
import com.chartboost.sdk.impl.tk;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.internal.partials.ChartboostVideoBridge;
import com.safedk.android.utils.Logger;
import java.io.FileDescriptor;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;

/* loaded from: classes8.dex */
public final class e1 implements f1, SurfaceHolder.Callback, tk.b, jk.b, d2 {
    public MediaPlayer a;
    public SurfaceView b;
    public g1 c;
    public final yi d;
    public final Function4 e;
    public final CoroutineDispatcher f;
    public final u8 g;
    public long h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public SurfaceHolder n;
    public of o;
    public jk p;
    public final tk q;
    public boolean r;
    public float s;

    public e1(MediaPlayer mediaPlayer, SurfaceView surfaceView, g1 g1Var, yi uiPoster, Function3 videoProgressFactory, Function4 videoBufferFactory, CoroutineDispatcher coroutineDispatcher, u8 fileCache) {
        Intrinsics.checkNotNullParameter(uiPoster, "uiPoster");
        Intrinsics.checkNotNullParameter(videoProgressFactory, "videoProgressFactory");
        Intrinsics.checkNotNullParameter(videoBufferFactory, "videoBufferFactory");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "coroutineDispatcher");
        Intrinsics.checkNotNullParameter(fileCache, "fileCache");
        this.a = mediaPlayer;
        this.b = surfaceView;
        this.c = g1Var;
        this.d = uiPoster;
        this.e = videoBufferFactory;
        this.f = coroutineDispatcher;
        this.g = fileCache;
        this.n = surfaceView != null ? surfaceView.getHolder() : null;
        this.q = (tk) videoProgressFactory.invoke(this.c, this, uiPoster);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0040, code lost:
    
        if (r2 == null) goto L12;
     */
    @Override // com.chartboost.sdk.impl.f1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(hk asset) {
        Intrinsics.checkNotNullParameter(asset, "asset");
        Unit unit = null;
        xb.a("asset() - asset: " + asset, (Throwable) null, 2, (Object) null);
        if (this.a != null) {
            jk jkVar = (jk) this.e.invoke(asset, this, this.f, this.g);
            this.p = jkVar;
            this.o = jkVar != null ? jkVar.d() : null;
            SurfaceHolder surfaceHolder = this.n;
            if (surfaceHolder != null) {
                surfaceHolder.addCallback(this);
                unit = Unit.INSTANCE;
            }
        }
        g1 g1Var = this.c;
        if (g1Var != null) {
            g1Var.a("Missing media player during startMediaPlayer");
            Unit unit2 = Unit.INSTANCE;
        }
        this.r = false;
    }

    @Override // com.chartboost.sdk.impl.f1
    public void play() {
        Logger.d("Chartboost|SafeDK: Execution> Lcom/chartboost/sdk/impl/e1;->play()V");
        CreativeInfoManager.onVideoStart(com.safedk.android.utils.h.c, this, "chartboost exo-player");
        safedk_e1_play_20603089eada4dd6de95a54552486068();
    }

    @Override // com.chartboost.sdk.impl.f1
    public void stop() {
        Logger.d("Chartboost|SafeDK: Execution> Lcom/chartboost/sdk/impl/e1;->stop()V");
        CreativeInfoManager.onVideoCompleted(com.safedk.android.utils.h.c, "chartboost exo-player");
        safedk_e1_stop_c86850995bde2e23f6faa2267f17d640();
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder holder, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(holder, "holder");
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (this.k) {
            MediaPlayer mediaPlayer = this.a;
            if (mediaPlayer != null) {
                mediaPlayer.setDisplay(holder);
            }
            play();
            return;
        }
        try {
            m();
            l();
            MediaPlayer mediaPlayer2 = this.a;
            if (mediaPlayer2 != null) {
                mediaPlayer2.prepareAsync();
            }
            MediaPlayer mediaPlayer3 = this.a;
            if (mediaPlayer3 != null) {
                mediaPlayer3.setDisplay(holder);
            }
        } catch (Exception e) {
            xb.b("SurfaceCreated exception", e);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        MediaPlayer mediaPlayer = this.a;
        if (mediaPlayer != null) {
            mediaPlayer.setDisplay(null);
        }
    }

    public /* synthetic */ e1(MediaPlayer mediaPlayer, SurfaceView surfaceView, g1 g1Var, yi yiVar, Function3 function3, Function4 function4, CoroutineDispatcher coroutineDispatcher, u8 u8Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new MediaPlayer() : mediaPlayer, surfaceView, g1Var, yiVar, function3, function4, (i & 64) != 0 ? Dispatchers.getMain() : coroutineDispatcher, u8Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0018, code lost:
    
        if (r1 == null) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l() {
        Unit unit;
        FileDescriptor b;
        Unit unit2 = null;
        try {
            of ofVar = this.o;
            if (ofVar != null && (b = ofVar.b()) != null) {
                MediaPlayer mediaPlayer = this.a;
                if (mediaPlayer != null) {
                    ChartboostVideoBridge.MediaPlayerSetDataSource(mediaPlayer, b);
                    unit = Unit.INSTANCE;
                } else {
                    unit = null;
                }
            }
            g1 g1Var = this.c;
            if (g1Var != null) {
                g1Var.a("Missing video asset");
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                xb.b("MediaPlayer missing callback on error", (Throwable) null, 2, (Object) null);
            }
        } catch (IOException e) {
            g1 g1Var2 = this.c;
            if (g1Var2 != null) {
                g1Var2.a(e.toString());
                unit2 = Unit.INSTANCE;
            }
            if (unit2 == null) {
                xb.b("MediaPlayer missing callback on IOException", e);
            }
        }
    }

    @Override // com.chartboost.sdk.impl.d2
    public void c() {
        this.m = true;
    }

    public void safedk_e1_play_20603089eada4dd6de95a54552486068() {
        xb.a("play()", (Throwable) null, 2, (Object) null);
        if (this.i && !this.j) {
            o();
        }
        this.j = true;
        this.k = this.m;
        this.m = false;
    }

    @Override // com.chartboost.sdk.impl.f1
    public void pause() {
        xb.a("pause()", (Throwable) null, 2, (Object) null);
        if (this.i && this.j) {
            jk jkVar = this.p;
            if (jkVar != null) {
                jkVar.e();
            }
            j();
            try {
                MediaPlayer mediaPlayer = this.a;
                if (mediaPlayer != null) {
                    ChartboostVideoBridge.MediaPlayerPause(mediaPlayer);
                }
            } catch (Exception e) {
                g1 g1Var = this.c;
                if (g1Var != null) {
                    g1Var.a(e.toString());
                }
            }
            this.h = a();
            this.j = false;
            this.k = true;
        }
    }

    public void safedk_e1_stop_c86850995bde2e23f6faa2267f17d640() {
        xb.a("stop()", (Throwable) null, 2, (Object) null);
        if (this.i) {
            jk jkVar = this.p;
            if (jkVar != null) {
                jkVar.e();
            }
            this.p = null;
            this.h = 0L;
            j();
            try {
                MediaPlayer mediaPlayer = this.a;
                if (mediaPlayer != null) {
                    ChartboostVideoBridge.MediaPlayerStop(mediaPlayer);
                }
            } catch (Exception e) {
                g1 g1Var = this.c;
                if (g1Var != null) {
                    g1Var.a(e.toString());
                }
            }
            this.j = false;
            this.k = false;
            of ofVar = this.o;
            if (ofVar != null) {
                ofVar.a();
            }
            this.o = null;
            i();
        }
    }

    @Override // com.chartboost.sdk.impl.tk.b
    public long a() {
        MediaPlayer mediaPlayer = this.a;
        if (mediaPlayer == null) {
            return 0L;
        }
        long currentPosition = mediaPlayer.getCurrentPosition();
        this.h = currentPosition;
        return currentPosition;
    }

    public final void a(MediaPlayer mp) {
        Intrinsics.checkNotNullParameter(mp, "mp");
        this.l = false;
        int duration = mp.getDuration();
        SurfaceView surfaceView = this.b;
        int width = surfaceView != null ? surfaceView.getWidth() : 0;
        SurfaceView surfaceView2 = this.b;
        b(width, surfaceView2 != null ? surfaceView2.getHeight() : 0);
        g1 g1Var = this.c;
        if (g1Var != null) {
            g1Var.b(duration);
        }
        this.i = true;
        jk jkVar = this.p;
        if (jkVar != null) {
            jkVar.a(duration);
        }
        if (this.j) {
            n();
        }
    }

    @Override // com.chartboost.sdk.impl.f1
    public boolean h() {
        return this.r;
    }

    @Override // com.chartboost.sdk.impl.f1
    public void f() {
        this.s = 0.0f;
        MediaPlayer mediaPlayer = this.a;
        if (mediaPlayer != null) {
            mediaPlayer.setVolume(0.0f, 0.0f);
        }
    }

    @Override // com.chartboost.sdk.impl.f1
    public float g() {
        return this.s;
    }

    public final void i() {
        MediaPlayer mediaPlayer = this.a;
        if (mediaPlayer != null) {
            ChartboostVideoBridge.MediaPlayerRelease(mediaPlayer);
        }
        this.c = null;
        this.a = null;
        this.n = null;
        this.b = null;
        this.p = null;
    }

    public final void c(int i, int i2) {
        xb.b("MediaPlayer error: " + ("error: " + i + " extra: " + i2), (Throwable) null, 2, (Object) null);
        if (this.i) {
            e();
        }
    }

    public /* synthetic */ class a extends FunctionReferenceImpl implements Function0 {
        public a(Object obj) {
            super(0, obj, e1.class, "startMediaPlayer", "startMediaPlayer$ChartboostMonetization_9_12_1_productionRelease()V", 0);
        }

        public final void a() {
            ((e1) this.receiver).n();
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo4828invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    public final void o() {
        this.d.a(500L, new a(this));
    }

    public final void n() {
        Unit unit;
        MediaPlayer mediaPlayer = this.a;
        if (mediaPlayer != null) {
            try {
                ChartboostVideoBridge.MediaPlayerStart(mediaPlayer);
                this.r = true;
                k();
                g1 g1Var = this.c;
                if (g1Var != null) {
                    g1Var.a();
                }
                if (Build.VERSION.SDK_INT >= 26) {
                    mediaPlayer.seekTo(this.h, 3);
                } else {
                    mediaPlayer.seekTo((int) this.h);
                }
                unit = Unit.INSTANCE;
            } catch (IllegalStateException e) {
                g1 g1Var2 = this.c;
                if (g1Var2 != null) {
                    g1Var2.a(e.toString());
                    unit = Unit.INSTANCE;
                } else {
                    unit = null;
                }
            }
            if (unit != null) {
                return;
            }
        }
        g1 g1Var3 = this.c;
        if (g1Var3 != null) {
            g1Var3.a("Missing video player during startVideoPlayer");
            Unit unit2 = Unit.INSTANCE;
        }
    }

    public final void e() {
        if (!this.j || this.l) {
            return;
        }
        jk jkVar = this.p;
        if (jkVar != null) {
            jkVar.a();
        }
        this.l = false;
        g1 g1Var = this.c;
        if (g1Var != null) {
            g1Var.c();
        }
        pause();
        jk jkVar2 = this.p;
        if (jkVar2 != null) {
            jkVar2.c();
        }
    }

    @Override // com.chartboost.sdk.impl.jk.b
    public void d() {
        this.j = true;
        MediaPlayer mediaPlayer = this.a;
        if (mediaPlayer != null) {
            mediaPlayer.reset();
        }
        l();
        MediaPlayer mediaPlayer2 = this.a;
        if (mediaPlayer2 != null) {
            mediaPlayer2.prepareAsync();
        }
        g1 g1Var = this.c;
        if (g1Var != null) {
            g1Var.d();
        }
    }

    private final void b(int i, int i2) {
        MediaPlayer mediaPlayer = this.a;
        if (mediaPlayer == null) {
            return;
        }
        SurfaceView surfaceView = this.b;
        int videoHeight = mediaPlayer.getVideoHeight();
        MediaPlayer mediaPlayer2 = this.a;
        bl.a(surfaceView, mediaPlayer2 != null ? mediaPlayer2.getVideoWidth() : 1, videoHeight, i, i2);
    }

    public static final boolean b(e1 this$0, MediaPlayer mediaPlayer, int i, int i2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.c(i, i2);
        return true;
    }

    public final void k() {
        tk.a.a(this.q, 0L, 1, null);
    }

    public final void j() {
        this.q.a();
    }

    public final void m() {
        MediaPlayer mediaPlayer = this.a;
        if (mediaPlayer != null) {
            mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: com.chartboost.sdk.impl.e1$$ExternalSyntheticLambda0
                @Override // android.media.MediaPlayer.OnPreparedListener
                public final void onPrepared(MediaPlayer mediaPlayer2) {
                    e1.this.a(mediaPlayer2);
                }
            });
            mediaPlayer.setOnInfoListener(new MediaPlayer.OnInfoListener() { // from class: com.chartboost.sdk.impl.e1$$ExternalSyntheticLambda1
                @Override // android.media.MediaPlayer.OnInfoListener
                public final boolean onInfo(MediaPlayer mediaPlayer2, int i, int i2) {
                    return e1.a(e1.this, mediaPlayer2, i, i2);
                }
            });
            mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: com.chartboost.sdk.impl.e1$$ExternalSyntheticLambda2
                @Override // android.media.MediaPlayer.OnCompletionListener
                public final void onCompletion(MediaPlayer mediaPlayer2) {
                    Logger.d("Chartboost|SafeDK: Execution> Lcom/chartboost/sdk/impl/e1$$ExternalSyntheticLambda2;->onCompletion(Landroid/media/MediaPlayer;)V");
                    CreativeInfoManager.onVideoCompleted(com.safedk.android.utils.h.c, mediaPlayer2, "media-player");
                    safedk_e1$$ExternalSyntheticLambda2_onCompletion_c9b2593d072f73bbe8c96cad59cc40af(mediaPlayer2);
                }

                public void safedk_e1$$ExternalSyntheticLambda2_onCompletion_c9b2593d072f73bbe8c96cad59cc40af(MediaPlayer p0) {
                    e1.a(e1.this, p0);
                }
            });
            mediaPlayer.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: com.chartboost.sdk.impl.e1$$ExternalSyntheticLambda3
                @Override // android.media.MediaPlayer.OnErrorListener
                public final boolean onError(MediaPlayer mediaPlayer2, int i, int i2) {
                    return e1.b(e1.this, mediaPlayer2, i, i2);
                }
            });
        }
    }

    @Override // com.chartboost.sdk.impl.qg
    public void a(int i, int i2) {
        b(i2, i);
    }

    public static final boolean a(e1 this$0, MediaPlayer mediaPlayer, int i, int i2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if ((i != 805 && i != 804) || i2 != -1004) {
            return true;
        }
        this$0.e();
        return true;
    }

    @Override // com.chartboost.sdk.impl.f1
    public void b() {
        MediaPlayer mediaPlayer = this.a;
        if (mediaPlayer != null) {
            mediaPlayer.setVolume(1.0f, 1.0f);
        }
    }

    public static final void a(e1 this$0, MediaPlayer mediaPlayer) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.h >= mediaPlayer.getDuration() - (mediaPlayer.getDuration() * 0.05d)) {
            g1 g1Var = this$0.c;
            if (g1Var != null) {
                g1Var.b();
                return;
            }
            return;
        }
        this$0.e();
    }
}
