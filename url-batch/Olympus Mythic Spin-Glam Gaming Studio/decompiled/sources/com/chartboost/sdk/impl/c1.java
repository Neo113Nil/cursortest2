package com.chartboost.sdk.impl;

import android.content.Context;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import com.chartboost.sdk.impl.tk;
import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.Player;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class c1 implements f1, SurfaceHolder.Callback, Player.Listener, tk.b, d2 {
    public final i8 a;
    public final SurfaceView b;
    public final g1 c;
    public final Lazy d;
    public final Lazy e;
    public boolean f;
    public boolean g;

    public c1(Context context, e8 exoPlayerFactory, i8 exoPlayerMediaItemFactory, SurfaceView surfaceView, g1 g1Var, yi uiPoster, Function3 videoProgressFactory) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(exoPlayerFactory, "exoPlayerFactory");
        Intrinsics.checkNotNullParameter(exoPlayerMediaItemFactory, "exoPlayerMediaItemFactory");
        Intrinsics.checkNotNullParameter(surfaceView, "surfaceView");
        Intrinsics.checkNotNullParameter(uiPoster, "uiPoster");
        Intrinsics.checkNotNullParameter(videoProgressFactory, "videoProgressFactory");
        this.a = exoPlayerMediaItemFactory;
        this.b = surfaceView;
        this.c = g1Var;
        this.d = LazyKt.lazy(new a(exoPlayerFactory, this));
        this.e = LazyKt.lazy(new b(videoProgressFactory, this, uiPoster));
    }

    @Override // com.chartboost.sdk.impl.qg
    public void a(int i, int i2) {
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public void onPlayerError(PlaybackException error) {
        Intrinsics.checkNotNullParameter(error, "error");
        xb.b("ExoPlayer error", error);
        stop();
        g1 g1Var = this.c;
        if (g1Var != null) {
            String message = error.getMessage();
            if (message == null) {
                message = "No error message from ExoPlayer";
            }
            g1Var.a(message);
        }
    }

    @Override // com.chartboost.sdk.impl.f1
    public void play() {
        Logger.d("Chartboost|SafeDK: Execution> Lcom/chartboost/sdk/impl/c1;->play()V");
        CreativeInfoManager.onVideoStart(com.safedk.android.utils.h.c, this, "chartboost exo-player");
        safedk_c1_play_1cffb35cfe83a1a4540a29e017f61c5b();
    }

    @Override // com.chartboost.sdk.impl.f1
    public void stop() {
        Logger.d("Chartboost|SafeDK: Execution> Lcom/chartboost/sdk/impl/c1;->stop()V");
        CreativeInfoManager.onVideoCompleted(com.safedk.android.utils.h.c, "chartboost exo-player");
        safedk_c1_stop_85ab1c78c038085a2a8c4cbf547f7f31();
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder holder, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(holder, "holder");
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        xb.a("surfaceCreated()", (Throwable) null, 2, (Object) null);
        if (this.g) {
            play();
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        xb.a("surfaceDestroyed()", (Throwable) null, 2, (Object) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x003c  */
    @Override // com.chartboost.sdk.impl.f1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(hk asset) {
        Unit unit;
        Intrinsics.checkNotNullParameter(asset, "asset");
        xb.a("asset() - asset: " + asset, (Throwable) null, 2, (Object) null);
        MediaItem b2 = b(asset);
        if (b2 != null) {
            ExoPlayer d = d();
            d.addMediaItem(b2);
            d.prepare();
            SurfaceHolder holder = this.b.getHolder();
            if (holder != null) {
                holder.addCallback(this);
                unit = Unit.INSTANCE;
                if (unit == null) {
                    g1 g1Var = this.c;
                    if (g1Var != null) {
                        g1Var.a("Error retrieving media item");
                    }
                    xb.b("Error retrieving media item", (Throwable) null, 2, (Object) null);
                }
                this.f = false;
            }
        }
        unit = null;
        if (unit == null) {
        }
        this.f = false;
    }

    public static final class a extends Lambda implements Function0 {
        public final /* synthetic */ e8 b;
        public final /* synthetic */ c1 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e8 e8Var, c1 c1Var) {
            super(0);
            this.b = e8Var;
            this.c = c1Var;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ExoPlayer mo4828invoke() {
            ExoPlayer a = this.b.a();
            a.addListener(this.c);
            return a;
        }
    }

    public final ExoPlayer d() {
        return (ExoPlayer) this.d.getValue();
    }

    public static final class b extends Lambda implements Function0 {
        public final /* synthetic */ Function3 b;
        public final /* synthetic */ c1 c;
        public final /* synthetic */ yi d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Function3 function3, c1 c1Var, yi yiVar) {
            super(0);
            this.b = function3;
            this.c = c1Var;
            this.d = yiVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final tk mo4828invoke() {
            return (tk) this.b.invoke(this.c.c, this.c, this.d);
        }
    }

    public final tk e() {
        return (tk) this.e.getValue();
    }

    public /* synthetic */ c1(Context context, e8 e8Var, i8 i8Var, SurfaceView surfaceView, g1 g1Var, yi yiVar, Function3 function3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? new e8(context, null, null, null, 14, null) : e8Var, i8Var, surfaceView, (i & 16) != 0 ? null : g1Var, yiVar, function3);
    }

    public void safedk_c1_play_1cffb35cfe83a1a4540a29e017f61c5b() {
        xb.a("play()", (Throwable) null, 2, (Object) null);
        d().setVideoSurfaceView(this.b);
        d().play();
        this.g = false;
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public void onIsPlayingChanged(boolean z) {
        xb.a("onIsPlayingChanged() - isPlaying: " + z, (Throwable) null, 2, (Object) null);
        if (z) {
            this.f = true;
            g1 g1Var = this.c;
            if (g1Var != null) {
                g1Var.a();
            }
            k();
            return;
        }
        l();
    }

    @Override // com.chartboost.sdk.impl.f1
    public void pause() {
        xb.a("pause()", (Throwable) null, 2, (Object) null);
        d().pause();
    }

    public void safedk_c1_stop_85ab1c78c038085a2a8c4cbf547f7f31() {
        xb.a("stop()", (Throwable) null, 2, (Object) null);
        if (d().isPlaying()) {
            d().stop();
        }
        d().release();
    }

    public final void k() {
        tk.a.a(e(), 0L, 1, null);
    }

    public final void l() {
        e().a();
    }

    @Override // com.chartboost.sdk.impl.f1
    public void f() {
        d().setVolume(0.0f);
    }

    @Override // com.chartboost.sdk.impl.f1
    public boolean h() {
        return this.f;
    }

    @Override // com.chartboost.sdk.impl.f1
    public float g() {
        return d().getVolume();
    }

    @Override // com.chartboost.sdk.impl.tk.b
    public long a() {
        return d().getCurrentPosition();
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public void onPlaybackStateChanged(int i) {
        String b2;
        b2 = d1.b(i);
        xb.a("onPlaybackStateChanged() - playbackState: " + b2, (Throwable) null, 2, (Object) null);
        if (i == 2) {
            g1 g1Var = this.c;
            if (g1Var != null) {
                g1Var.c();
                return;
            }
            return;
        }
        if (i == 3) {
            j();
        } else {
            if (i != 4) {
                return;
            }
            i();
        }
    }

    public final void j() {
        a(this, 0, 0, 3, null);
        g1 g1Var = this.c;
        if (g1Var != null) {
            g1Var.d();
        }
        g1 g1Var2 = this.c;
        if (g1Var2 != null) {
            g1Var2.b(d().getDuration());
        }
    }

    public final void i() {
        stop();
        l();
        g1 g1Var = this.c;
        if (g1Var != null) {
            g1Var.b();
        }
    }

    public final void b(int i, int i2) {
        bl.a(this.b, k8.b(d()), k8.a(d()), i, i2);
    }

    @Override // com.chartboost.sdk.impl.d2
    public void c() {
        this.g = true;
    }

    public final MediaItem b(hk hkVar) {
        MediaItem a2 = this.a.a(hkVar);
        xb.a("VideoAsset.toMediaItem() - " + a2, (Throwable) null, 2, (Object) null);
        return a2;
    }

    public static /* synthetic */ void a(c1 c1Var, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = c1Var.b.getWidth();
        }
        if ((i3 & 2) != 0) {
            i2 = c1Var.b.getHeight();
        }
        c1Var.b(i, i2);
    }

    @Override // com.chartboost.sdk.impl.f1
    public void b() {
        d().setVolume(1.0f);
    }
}
