package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.bb1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class bb1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final me2 f23656a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final gg2 f23657b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final xa1 f23658c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    private final nx1 f23659d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final ha1 f23660e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final hl1 f23661f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final nb1 f23662g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final ph1 f23663h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final ph1 f23664i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final ap1 f23665j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final a f23666k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private final qs0 f23667l;

    /* renamed from: m, reason: collision with root package name */
    @Nullable
    private ph1 f23668m;

    /* JADX INFO: Access modifiers changed from: private */
    final class a implements ic2 {
        public a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(bb1 this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            bb1.a(this$0, this$0.f23663h);
        }

        @Override // com.yandex.mobile.ads.impl.ic2
        public final void c() {
            mb1 b4 = bb1.this.f23657b.b();
            if (b4 != null) {
                b4.setClickable(true);
            }
        }

        @Override // com.yandex.mobile.ads.impl.ic2
        public final void b() {
            bb1.this.f23668m = null;
            nx1 nx1Var = bb1.this.f23659d;
            if (nx1Var == null || !nx1Var.c()) {
                bb1.this.f23665j.a();
            } else {
                qs0 qs0Var = bb1.this.f23667l;
                final bb1 bb1Var = bb1.this;
                qs0Var.a(new Runnable() { // from class: com.yandex.mobile.ads.impl.Z
                    @Override // java.lang.Runnable
                    public final void run() {
                        bb1.a.a(bb1.this);
                    }
                });
            }
            bb1.this.f23658c.b();
        }

        @Override // com.yandex.mobile.ads.impl.ic2
        public final void a() {
            bb1.this.f23658c.a();
        }
    }

    private final class b implements gp1 {
        public b() {
        }

        @Override // com.yandex.mobile.ads.impl.gp1
        public final void a(@NotNull mb1 nativeVideoView) {
            Intrinsics.checkNotNullParameter(nativeVideoView, "nativeVideoView");
            bb1 bb1Var = bb1.this;
            bb1.a(bb1Var, bb1Var.f23663h);
        }
    }

    public bb1(@NotNull Context context, @NotNull C2360y7 adResponse, @NotNull C2286v2 adConfiguration, @NotNull ga1 videoAdPlayer, @NotNull ab2 video, @NotNull me2 videoOptions, @NotNull gg2 videoViewAdapter, @NotNull jc2 playbackParametersProvider, @NotNull cg2 videoTracker, @NotNull je2 impressionTrackingListener, @NotNull xa1 nativeVideoPlaybackEventListener, @NotNull zi0 imageProvider, @Nullable nx1 nx1Var) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(videoAdPlayer, "videoAdPlayer");
        Intrinsics.checkNotNullParameter(video, "video");
        Intrinsics.checkNotNullParameter(videoOptions, "videoOptions");
        Intrinsics.checkNotNullParameter(videoViewAdapter, "videoViewAdapter");
        Intrinsics.checkNotNullParameter(playbackParametersProvider, "playbackParametersProvider");
        Intrinsics.checkNotNullParameter(videoTracker, "videoTracker");
        Intrinsics.checkNotNullParameter(impressionTrackingListener, "impressionTrackingListener");
        Intrinsics.checkNotNullParameter(nativeVideoPlaybackEventListener, "nativeVideoPlaybackEventListener");
        Intrinsics.checkNotNullParameter(imageProvider, "imageProvider");
        this.f23656a = videoOptions;
        this.f23657b = videoViewAdapter;
        this.f23658c = nativeVideoPlaybackEventListener;
        this.f23659d = nx1Var;
        this.f23665j = new ap1(videoViewAdapter, new b());
        this.f23666k = new a();
        this.f23667l = new qs0();
        qb1 qb1Var = new qb1(videoViewAdapter);
        this.f23660e = new ha1(videoAdPlayer);
        this.f23662g = new nb1(videoAdPlayer);
        sc2 sc2Var = new sc2();
        new la1(videoViewAdapter, videoAdPlayer, qb1Var, nativeVideoPlaybackEventListener).a(sc2Var);
        wa1 wa1Var = new wa1(context, adResponse, adConfiguration, videoAdPlayer, video.b(), qb1Var, playbackParametersProvider, videoTracker, sc2Var, impressionTrackingListener);
        hp1 hp1Var = new hp1(videoAdPlayer, video.b(), sc2Var);
        ob1 ob1Var = new ob1(videoAdPlayer, videoOptions);
        hl1 hl1Var = new hl1(video, new qi0(context, new r81(adResponse), imageProvider));
        this.f23661f = hl1Var;
        this.f23664i = new ph1(videoViewAdapter, wa1Var, ob1Var, hl1Var);
        this.f23663h = new ph1(videoViewAdapter, hp1Var, ob1Var, hl1Var);
    }

    public static final void a(bb1 bb1Var, ph1 ph1Var) {
        bb1Var.f23668m = ph1Var;
        if (ph1Var != null) {
            ph1Var.a(bb1Var.f23666k);
        }
        ph1 ph1Var2 = bb1Var.f23668m;
        if (ph1Var2 != null) {
            ph1Var2.a();
        }
    }

    public final void b(@NotNull mb1 nativeVideoView) {
        Intrinsics.checkNotNullParameter(nativeVideoView, "nativeVideoView");
        ph1 ph1Var = this.f23668m;
        if (ph1Var != null) {
            ph1Var.a(nativeVideoView);
        }
        this.f23662g.b(nativeVideoView);
    }

    public final void a() {
        mb1 b4 = this.f23657b.b();
        if (b4 != null) {
            b4.setClickable(false);
        }
    }

    public final void a(@NotNull mb1 nativeVideoView) {
        Intrinsics.checkNotNullParameter(nativeVideoView, "nativeVideoView");
        this.f23660e.a(this.f23656a);
        this.f23662g.a(nativeVideoView);
        this.f23661f.a(nativeVideoView.b());
        ph1 ph1Var = this.f23664i;
        this.f23668m = ph1Var;
        if (ph1Var != null) {
            ph1Var.a(this.f23666k);
        }
        ph1 ph1Var2 = this.f23668m;
        if (ph1Var2 != null) {
            ph1Var2.a();
        }
    }
}
