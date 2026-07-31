package com.chartboost.sdk.impl;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.view.TextureView;
import android.view.View;
import androidx.media3.common.MediaItem;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.Player;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.ui.PlayerView;
import com.chartboost.sdk.events.ChartboostError;
import com.chartboost.sdk.impl.ue;
import com.chartboost.sdk.impl.we;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.internal.partials.ChartboostVideoBridge;
import com.safedk.android.utils.Logger;
import java.io.File;
import java.net.URL;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.NonCancellable;
import kotlinx.coroutines.SupervisorKt;

/* loaded from: classes13.dex */
public final class z7 implements pk {
    public final f8 a;
    public final ye b;
    public final CoroutineScope c;
    public qk d;
    public ExoPlayer e;
    public PlayerView f;
    public URL g;
    public CancellableContinuation h;
    public final a8 i;
    public final a j;

    public static final class b extends ContinuationImpl {
        public Object b;
        public Object c;
        public Object d;
        public Object e;
        public /* synthetic */ Object f;
        public int h;

        public b(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f = obj;
            this.h |= Integer.MIN_VALUE;
            Object a = z7.this.a(null, null, null, this);
            return a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a : Result.m8022boximpl(a);
        }
    }

    public z7(f8 exoPlayerFactory, ye playerViewFactory, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(exoPlayerFactory, "exoPlayerFactory");
        Intrinsics.checkNotNullParameter(playerViewFactory, "playerViewFactory");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.a = exoPlayerFactory;
        this.b = playerViewFactory;
        this.c = coroutineScope;
        this.i = new a8(this, coroutineScope);
        this.j = new a();
    }

    @Override // com.chartboost.sdk.impl.pk
    public void play() {
        Logger.d("Chartboost|SafeDK: Execution> Lcom/chartboost/sdk/impl/z7;->play()V");
        CreativeInfoManager.onVideoStart(com.safedk.android.utils.h.c, this, "chartboost exo-player");
        safedk_z7_play_a3aa5a90cc6ad02eeab0f8b17dc9246d();
    }

    public qk d() {
        return this.d;
    }

    public final void d(ExoPlayer player) {
        Intrinsics.checkNotNullParameter(player, "player");
        ChartboostVideoBridge.exoPlayer3Stop(player);
        URL url = this.g;
        xb.a("Stop command sent to player for " + (url != null ? url.toString() : null) + ".", (Throwable) null, 2, (Object) null);
    }

    public static final class a implements Player.Listener {
        public a() {
        }

        @Override // androidx.media3.common.Player.Listener
        public void onPlayerError(PlaybackException error) {
            Intrinsics.checkNotNullParameter(error, "error");
            z7.this.i.a(new ue.f(error));
        }

        @Override // androidx.media3.common.Player.Listener
        public void onPlaybackStateChanged(int i) {
            if (i == 1) {
                xb.a("Player is idle.", (Throwable) null, 2, (Object) null);
                return;
            }
            if (i == 2) {
                xb.a("Player is buffering.", (Throwable) null, 2, (Object) null);
                return;
            }
            if (i != 3) {
                if (i != 4) {
                    return;
                }
                z7.this.i.a(ue.e.a);
            } else {
                we b = z7.this.i.b();
                if (b instanceof we.c) {
                    z7.this.i.a(new ue.g(((we.c) b).a()));
                }
            }
        }
    }

    public /* synthetic */ z7(f8 f8Var, ye yeVar, CoroutineScope coroutineScope, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(f8Var, yeVar, (i & 4) != 0 ? CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default(null, 1, null).plus(Dispatchers.getMain().getImmediate())) : coroutineScope);
    }

    public static final class c extends Lambda implements Function1 {

        public static final class a extends SuspendLambda implements Function2 {
            public int b;
            public final /* synthetic */ z7 c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(z7 z7Var, Continuation continuation) {
                super(2, continuation);
                this.c = z7Var;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new a(this.c, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.b != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.c.i.a(ue.j.a);
                return Unit.INSTANCE;
            }
        }

        public c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void a(Throwable th) {
            BuildersKt__Builders_commonKt.launch$default(z7.this.c, NonCancellable.INSTANCE, null, new a(z7.this, null), 2, null);
        }
    }

    public void safedk_z7_play_a3aa5a90cc6ad02eeab0f8b17dc9246d() {
        this.i.a(ue.i.a);
    }

    @Override // com.chartboost.sdk.impl.pk
    public void pause() {
        this.i.a(ue.h.a);
    }

    @Override // com.chartboost.sdk.impl.pk
    public void setVolume(float f) {
        this.i.a(new ue.k(f));
    }

    @Override // com.chartboost.sdk.impl.pk
    public float getVolume() {
        ExoPlayer exoPlayer = this.e;
        if (exoPlayer != null) {
            return exoPlayer.getVolume();
        }
        return 1.0f;
    }

    @Override // com.chartboost.sdk.impl.pk
    public void release() {
        this.i.a(ue.j.a);
    }

    @Override // com.chartboost.sdk.impl.pk
    public long c() {
        return this.i.a();
    }

    public final void c(ExoPlayer player) {
        Intrinsics.checkNotNullParameter(player, "player");
        player.prepare();
    }

    @Override // com.chartboost.sdk.impl.pk
    public Bitmap b() {
        PlayerView playerView = this.f;
        if (playerView == null) {
            return null;
        }
        View videoSurfaceView = playerView.getVideoSurfaceView();
        TextureView textureView = videoSurfaceView instanceof TextureView ? (TextureView) videoSurfaceView : null;
        if (textureView == null) {
            xb.e("captureFrame: PlayerView surface is not a TextureView.", null, 2, null);
            return null;
        }
        try {
            return textureView.getBitmap();
        } catch (Exception e) {
            xb.e("captureFrame: Failed to capture bitmap: " + e.getMessage(), null, 2, null);
            return null;
        }
    }

    public final ExoPlayer b(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        g();
        ExoPlayer a2 = this.a.a(context);
        this.e = a2;
        a2.addListener(this.j);
        return a2;
    }

    public final void g() {
        ExoPlayer exoPlayer = this.e;
        if (exoPlayer != null) {
            exoPlayer.removeListener(this.j);
        }
        ExoPlayer exoPlayer2 = this.e;
        if (exoPlayer2 != null) {
            ChartboostVideoBridge.exoPlayer3Release(exoPlayer2);
        }
        this.e = null;
        PlayerView playerView = this.f;
        if (playerView != null) {
            playerView.setPlayer(null);
        }
        this.f = null;
        xb.a("ExoPlayer instance has been released.", (Throwable) null, 2, (Object) null);
    }

    public final void f() {
        CancellableContinuation cancellableContinuation = this.h;
        if (cancellableContinuation != null) {
            if (!cancellableContinuation.isActive()) {
                cancellableContinuation = null;
            }
            if (cancellableContinuation != null) {
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuation.resumeWith(Result.m8023constructorimpl(Result.m8022boximpl(Result.m8023constructorimpl(Unit.INSTANCE))));
            }
        }
        this.h = null;
        qk d = d();
        if (d != null) {
            d.e();
        }
    }

    @Override // com.chartboost.sdk.impl.pk
    public long a() {
        return this.i.c();
    }

    @Override // com.chartboost.sdk.impl.pk
    public View a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (this.e == null) {
            return null;
        }
        PlayerView playerView = this.f;
        if (playerView == null || !Intrinsics.areEqual(playerView.getContext(), context)) {
            PlayerView playerView2 = this.f;
            if (playerView2 != null) {
                playerView2.setPlayer(null);
            }
            PlayerView a2 = this.b.a(context);
            a2.setPlayer(this.e);
            this.f = a2;
        }
        return this.f;
    }

    public final void e() {
        qk d = d();
        if (d != null) {
            d.c();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.chartboost.sdk.impl.pk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object a(Context context, URL url, b7 b7Var, Continuation continuation) {
        b bVar;
        int i;
        CancellableContinuation cancellableContinuation;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i2 = bVar.h;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.h = i2 - Integer.MIN_VALUE;
                Object obj = bVar.f;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = bVar.h;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    bVar.b = this;
                    bVar.c = context;
                    bVar.d = url;
                    bVar.e = b7Var;
                    bVar.h = 1;
                    CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(bVar), 1);
                    cancellableContinuationImpl.initCancellability();
                    CancellableContinuation cancellableContinuation2 = this.h;
                    if (cancellableContinuation2 != null && cancellableContinuation2.isActive() && (cancellableContinuation = this.h) != null) {
                        Boxing.boxBoolean(CancellableContinuation.DefaultImpls.cancel$default(cancellableContinuation, null, 1, null));
                    }
                    this.h = cancellableContinuationImpl;
                    this.g = url;
                    this.i.a(new ue.a(context, url, b7Var));
                    cancellableContinuationImpl.invokeOnCancellation(new c());
                    obj = cancellableContinuationImpl.getResult();
                    if (obj == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        DebugProbesKt.probeCoroutineSuspended(bVar);
                    }
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return ((Result) obj).getValue();
            }
        }
        bVar = new b(continuation);
        Object obj2 = bVar.f;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = bVar.h;
        if (i != 0) {
        }
        return ((Result) obj2).getValue();
    }

    public final void b(ExoPlayer player) {
        Intrinsics.checkNotNullParameter(player, "player");
        player.setPlayWhenReady(true);
        URL url = this.g;
        xb.a("Play command sent to player for " + (url != null ? url.toString() : null) + ".", (Throwable) null, 2, (Object) null);
    }

    public final void a(Throwable error) {
        ChartboostError videoPlaybackError;
        ChartboostError chartboostError;
        Intrinsics.checkNotNullParameter(error, "error");
        URL url = this.g;
        xb.b("ExoPlayerAdapter error for " + (url != null ? url.toString() : null), error);
        if (error instanceof ChartboostError) {
            chartboostError = (ChartboostError) error;
        } else if ((error instanceof PlaybackException) && (error.getCause() instanceof ChartboostError)) {
            Throwable cause = error.getCause();
            Intrinsics.checkNotNull(cause, "null cannot be cast to non-null type com.chartboost.sdk.events.ChartboostError");
            chartboostError = (ChartboostError) cause;
        } else {
            CancellableContinuation cancellableContinuation = this.h;
            if (cancellableContinuation != null && cancellableContinuation.isActive()) {
                videoPlaybackError = new ChartboostError.Load.Unknown(error.getMessage(), error);
            } else {
                videoPlaybackError = new ChartboostError.Render.VideoPlaybackError(error.getMessage(), error);
            }
            chartboostError = videoPlaybackError;
        }
        CancellableContinuation cancellableContinuation2 = this.h;
        if (cancellableContinuation2 != null) {
            if (!cancellableContinuation2.isActive()) {
                cancellableContinuation2 = null;
            }
            if (cancellableContinuation2 != null) {
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuation2.resumeWith(Result.m8023constructorimpl(ResultKt.createFailure(chartboostError)));
            }
        }
        this.h = null;
        if ((chartboostError instanceof ChartboostError.Load.AssetUnavailable) || (chartboostError instanceof ChartboostError.Show.AdInvalidated)) {
            qk d = d();
            if (d != null) {
                d.d();
            }
        } else {
            qk d2 = d();
            if (d2 != null) {
                d2.a(chartboostError);
            }
        }
        this.i.a(ue.j.a);
    }

    public final void a(ExoPlayer player) {
        Intrinsics.checkNotNullParameter(player, "player");
        player.setPlayWhenReady(false);
        URL url = this.g;
        xb.a("Pause command sent to player for " + (url != null ? url.toString() : null) + ".", (Throwable) null, 2, (Object) null);
    }

    public final void a(ExoPlayer player, File cachedFile) {
        Intrinsics.checkNotNullParameter(player, "player");
        Intrinsics.checkNotNullParameter(cachedFile, "cachedFile");
        MediaItem fromUri = MediaItem.fromUri(Uri.fromFile(cachedFile));
        Intrinsics.checkNotNullExpressionValue(fromUri, "fromUri(...)");
        ChartboostVideoBridge.exoPlayer3SetMediaItem(player, fromUri);
        player.prepare();
        URL url = this.g;
        xb.a("Player created and preparing for " + (url != null ? url.toString() : null) + ".", (Throwable) null, 2, (Object) null);
    }

    @Override // com.chartboost.sdk.impl.pk
    public void a(qk qkVar) {
        this.d = qkVar;
    }

    public final void a(ExoPlayer player, float f) {
        Intrinsics.checkNotNullParameter(player, "player");
        player.setVolume(RangesKt.coerceIn(f, 0.0f, 1.0f));
    }

    @Override // com.chartboost.sdk.impl.pk
    public void a(nh reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        this.i.a(new ue.l(reason));
    }
}
