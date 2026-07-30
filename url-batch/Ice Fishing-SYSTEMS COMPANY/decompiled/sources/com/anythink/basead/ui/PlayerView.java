package com.anythink.basead.ui;

import D.y;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.TextureView;
import android.view.View;
import android.widget.RelativeLayout;
import com.anythink.basead.exoplayer.ad;
import com.anythink.basead.exoplayer.d;
import com.anythink.basead.exoplayer.f;
import com.anythink.basead.exoplayer.h.o;
import com.anythink.basead.exoplayer.h.s;
import com.anythink.basead.exoplayer.i;
import com.anythink.basead.exoplayer.j.q;
import com.anythink.basead.exoplayer.l.g;
import com.anythink.basead.exoplayer.w;
import com.anythink.basead.j.e;
import com.anythink.basead.ui.BaseATView;
import com.anythink.basead.ui.animplayerview.BasePlayerView;
import com.anythink.core.common.a.n;
import com.anythink.core.common.a.o;
import com.anythink.core.common.d.t;
import com.anythink.core.common.h.x;
import com.google.android.gms.internal.ads.CL;
import java.io.File;
import java.util.List;
import u.AbstractC5088e;

/* loaded from: classes.dex */
public class PlayerView extends BasePlayerView {
    public static final String TAG = "PlayerView";

    /* renamed from: A, reason: collision with root package name */
    private ad f10346A;

    /* renamed from: B, reason: collision with root package name */
    private s f10347B;

    /* renamed from: C, reason: collision with root package name */
    private TextureView f10348C;

    /* renamed from: D, reason: collision with root package name */
    private String f10349D;

    /* renamed from: E, reason: collision with root package name */
    private String f10350E;

    /* renamed from: F, reason: collision with root package name */
    private int f10351F;

    /* renamed from: G, reason: collision with root package name */
    private int f10352G;

    /* renamed from: H, reason: collision with root package name */
    private int f10353H;

    /* renamed from: I, reason: collision with root package name */
    private int f10354I;
    private int J;

    /* renamed from: K, reason: collision with root package name */
    private boolean f10355K;

    /* renamed from: L, reason: collision with root package name */
    private boolean f10356L;

    /* renamed from: M, reason: collision with root package name */
    private boolean f10357M;

    /* renamed from: N, reason: collision with root package name */
    private boolean f10358N;

    /* renamed from: O, reason: collision with root package name */
    private boolean f10359O;

    /* renamed from: P, reason: collision with root package name */
    private boolean f10360P;

    /* renamed from: Q, reason: collision with root package name */
    private boolean f10361Q;

    /* renamed from: R, reason: collision with root package name */
    private Handler f10362R;

    /* renamed from: S, reason: collision with root package name */
    private boolean f10363S;

    /* renamed from: T, reason: collision with root package name */
    private Thread f10364T;

    /* renamed from: U, reason: collision with root package name */
    private boolean f10365U;

    /* renamed from: V, reason: collision with root package name */
    private boolean f10366V;

    /* renamed from: W, reason: collision with root package name */
    private View f10367W;

    /* renamed from: a, reason: collision with root package name */
    int f10368a;
    private w.c aa;
    private g ab;
    private final long ac;
    private long ad;
    private boolean ae;

    /* renamed from: b, reason: collision with root package name */
    int f10369b;

    /* renamed from: c, reason: collision with root package name */
    int f10370c;

    /* renamed from: d, reason: collision with root package name */
    boolean f10371d;

    /* renamed from: e, reason: collision with root package name */
    String f10372e;

    /* renamed from: f, reason: collision with root package name */
    String f10373f;

    /* renamed from: g, reason: collision with root package name */
    e f10374g;

    /* renamed from: h, reason: collision with root package name */
    Object f10375h;

    /* renamed from: com.anythink.basead.ui.PlayerView$2, reason: invalid class name */
    public class AnonymousClass2 implements View.OnClickListener {
        public AnonymousClass2() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (((BasePlayerView) PlayerView.this).f10628w != null) {
                ((BasePlayerView) PlayerView.this).f10628w.b(1);
            }
        }
    }

    /* renamed from: com.anythink.basead.ui.PlayerView$4, reason: invalid class name */
    public class AnonymousClass4 extends w.a {
        public AnonymousClass4() {
        }

        @Override // com.anythink.basead.exoplayer.w.a, com.anythink.basead.exoplayer.w.c
        public final void onPlayerError(com.anythink.basead.exoplayer.g gVar) {
            boolean z8;
            long j9;
            super.onPlayerError(gVar);
            String str = "Play error and ExoPlayer have not message.";
            if (gVar != null) {
                int i = gVar.f7426d;
                z8 = true;
                if (i != 0) {
                    if (i == 1) {
                        str = "Play error, because have a RendererException.";
                    } else if (i == 2) {
                        str = "Play error, because have a UnexpectedException.";
                    }
                    z8 = false;
                } else {
                    str = "Play error, because have a SourceException.";
                }
                if (gVar.getCause() != null && !TextUtils.isEmpty(gVar.getCause().getMessage())) {
                    StringBuilder c4 = AbstractC5088e.c(str, ",eception:");
                    c4.append(gVar.getCause().getMessage());
                    str = c4.toString();
                }
            } else {
                z8 = false;
            }
            PlayerView playerView = PlayerView.this;
            if (playerView.f10371d && z8) {
                playerView.f10373f = str;
                String str2 = PlayerView.TAG;
                playerView.f10371d = false;
                PlayerView.M(playerView);
                return;
            }
            playerView.d();
            if (((BasePlayerView) PlayerView.this).f10628w != null) {
                try {
                    j9 = PlayerView.this.f10346A.t();
                } catch (Throwable unused) {
                    j9 = 0;
                }
                String str3 = j9 <= 0 ? com.anythink.basead.d.g.f6341p : com.anythink.basead.d.g.f6336k;
                String str4 = "videoUrl:" + PlayerView.this.f10350E + ",readyRate:" + PlayerView.this.f10370c + ",cdRate:" + PlayerView.this.f10369b + ",play process:" + j9;
                String k6 = TextUtils.isEmpty(PlayerView.this.f10373f) ? CL.k(str4, ",localFileErrorMsg:", str) : y.o(AbstractC5088e.c(str4, ",localFileErrorMsg:"), PlayerView.this.f10373f, ",errorMsg:", str);
                if (PlayerView.this.f10360P) {
                    PlayerView.this.a(com.anythink.basead.d.g.a(str3, com.anythink.basead.d.g.f6311I.concat(String.valueOf(k6))));
                } else {
                    PlayerView.this.a(com.anythink.basead.d.g.a(str3, com.anythink.basead.d.g.f6318Q.concat(String.valueOf(k6))));
                }
            }
        }

        @Override // com.anythink.basead.exoplayer.w.a, com.anythink.basead.exoplayer.w.c
        public final void onPlayerStateChanged(boolean z8, int i) {
            super.onPlayerStateChanged(z8, i);
            String str = PlayerView.TAG;
            if (i == 2) {
                if (!PlayerView.this.f10361Q) {
                    PlayerView.this.f10361Q = true;
                    PlayerView.R(PlayerView.this);
                }
                PlayerView playerView = PlayerView.this;
                PlayerView.b(playerView, playerView.f10346A.s());
                return;
            }
            if (i != 3) {
                if (i != 4) {
                    return;
                }
                PlayerView.this.d();
                if (((BasePlayerView) PlayerView.this).f10625t) {
                    return;
                }
                PlayerView.Y(PlayerView.this);
                PlayerView playerView2 = PlayerView.this;
                playerView2.f10351F = playerView2.f10352G;
                if (((BasePlayerView) PlayerView.this).f10628w != null) {
                    ((BasePlayerView) PlayerView.this).f10628w.c();
                }
                PlayerView.this.a(BaseATView.a.f9926E);
                PlayerView.this.h();
                return;
            }
            if (!PlayerView.this.f10360P) {
                PlayerView.this.f10361Q = false;
                PlayerView playerView3 = PlayerView.this;
                playerView3.f10352G = (int) playerView3.f10346A.s();
                PlayerView.c(PlayerView.this, r3.f10352G);
                if (((BasePlayerView) PlayerView.this).f10628w != null) {
                    ((BasePlayerView) PlayerView.this).f10628w.b(PlayerView.this.f10352G);
                }
                PlayerView.this.f10353H = Math.round(r3.f10352G * 0.25f);
                PlayerView.this.f10354I = Math.round(r3.f10352G * 0.5f);
                PlayerView.this.J = Math.round(r3.f10352G * 0.75f);
                PlayerView.b(PlayerView.this, r3.f10352G);
                PlayerView.V(PlayerView.this);
            }
            if (PlayerView.this.f10351F > 0 && Math.abs(PlayerView.this.f10351F - PlayerView.this.f10346A.t()) > 500) {
                PlayerView.this.f10346A.a(PlayerView.this.f10351F);
            }
            if (PlayerView.this.isPlaying()) {
                PlayerView.this.c();
            }
        }
    }

    /* renamed from: com.anythink.basead.ui.PlayerView$5, reason: invalid class name */
    public class AnonymousClass5 implements g {
        public AnonymousClass5() {
        }

        @Override // com.anythink.basead.exoplayer.l.g
        public final void a() {
        }

        @Override // com.anythink.basead.exoplayer.l.g
        public final void a(int i, int i4) {
            PlayerView playerView = PlayerView.this;
            playerView.autoFitVideoSize(i, i4, playerView.f10348C);
        }
    }

    public PlayerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10349D = "";
        this.f10350E = "";
        this.f10351F = -1;
        this.f10358N = false;
        this.f10359O = false;
        this.f10360P = false;
        this.f10361Q = false;
        this.f10369b = 0;
        this.f10370c = 0;
        this.f10371d = false;
        this.f10372e = "";
        this.f10373f = "";
        this.ac = f.f7344a;
        this.ad = 0L;
        this.f10375h = new Object();
        this.ae = true;
        setSaveEnabled(true);
        this.f10362R = new Handler(Looper.getMainLooper()) { // from class: com.anythink.basead.ui.PlayerView.1
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                if (((BasePlayerView) PlayerView.this).f10628w == null) {
                    return;
                }
                PlayerView.this.f10351F = message.what;
                if (!PlayerView.this.f10359O && !((BasePlayerView) PlayerView.this).f10625t) {
                    PlayerView.d(PlayerView.this);
                    if (((BasePlayerView) PlayerView.this).f10628w != null) {
                        ((BasePlayerView) PlayerView.this).f10628w.a();
                    }
                    PlayerView.this.a(202);
                }
                if (((BasePlayerView) PlayerView.this).f10628w != null) {
                    ((BasePlayerView) PlayerView.this).f10628w.a(PlayerView.this.f10351F);
                }
                if (!PlayerView.this.f10355K && PlayerView.this.f10351F >= PlayerView.this.f10353H) {
                    PlayerView.l(PlayerView.this);
                    if (((BasePlayerView) PlayerView.this).f10628w != null) {
                        ((BasePlayerView) PlayerView.this).f10628w.a(25);
                    }
                    PlayerView.this.a(BaseATView.a.f9923B);
                } else if (!PlayerView.this.f10356L && PlayerView.this.f10351F >= PlayerView.this.f10354I) {
                    PlayerView.q(PlayerView.this);
                    if (((BasePlayerView) PlayerView.this).f10628w != null) {
                        ((BasePlayerView) PlayerView.this).f10628w.a(50);
                    }
                    PlayerView.this.a(BaseATView.a.f9924C);
                } else if (!PlayerView.this.f10357M && PlayerView.this.f10351F >= PlayerView.this.J) {
                    PlayerView.v(PlayerView.this);
                    if (((BasePlayerView) PlayerView.this).f10628w != null) {
                        ((BasePlayerView) PlayerView.this).f10628w.a(75);
                    }
                    PlayerView.this.a(BaseATView.a.f9925D);
                }
                if (PlayerView.this.ae || !PlayerView.this.f10366V) {
                    return;
                }
                int i = PlayerView.this.f10351F;
                PlayerView playerView = PlayerView.this;
                if (i < playerView.f10368a || ((BasePlayerView) playerView).f10628w == null) {
                    return;
                }
                PlayerView.B(PlayerView.this);
                ((BasePlayerView) PlayerView.this).f10628w.f();
            }
        };
        setBackgroundColor(-16777216);
    }

    public static /* synthetic */ boolean B(PlayerView playerView) {
        playerView.f10366V = false;
        return false;
    }

    public static /* synthetic */ void M(PlayerView playerView) {
        BasePlayerView.a aVar = playerView.f10628w;
        if (aVar != null) {
            aVar.f();
        }
        playerView.f10346A.a(playerView.f10347B);
    }

    public static /* synthetic */ void R(PlayerView playerView) {
        View view = playerView.f10367W;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    public static /* synthetic */ boolean V(PlayerView playerView) {
        playerView.f10360P = true;
        return true;
    }

    public static /* synthetic */ boolean Y(PlayerView playerView) {
        playerView.f10625t = true;
        return true;
    }

    public static /* synthetic */ boolean l(PlayerView playerView) {
        playerView.f10355K = true;
        return true;
    }

    public static /* synthetic */ boolean q(PlayerView playerView) {
        playerView.f10356L = true;
        return true;
    }

    public static /* synthetic */ boolean v(PlayerView playerView) {
        playerView.f10357M = true;
        return true;
    }

    public void autoFitVideoSize(int i, int i4, View view) {
        float max = Math.max(i / view.getMeasuredWidth(), i4 / view.getMeasuredHeight());
        int ceil = (int) Math.ceil(r4 / max);
        int ceil2 = (int) Math.ceil(r5 / max);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) view.getLayoutParams();
        layoutParams.width = ceil;
        layoutParams.height = ceil2;
        view.setLayoutParams(layoutParams);
    }

    @Override // com.anythink.basead.ui.animplayerview.BasePlayerView
    public long getCurrentPosition() {
        return Math.max(this.f10351F, 0);
    }

    @Override // com.anythink.basead.ui.animplayerview.BasePlayerView
    public long getVideoLength() {
        ad adVar = this.f10346A;
        return adVar != null ? adVar.s() : this.f10352G;
    }

    @Override // com.anythink.basead.ui.animplayerview.BasePlayerView
    public boolean hasVideo() {
        return this.f10365U;
    }

    @Override // com.anythink.basead.ui.animplayerview.BasePlayerView
    public void init(com.anythink.core.common.h.w wVar, x xVar, boolean z8, List<Bitmap> list, e eVar) {
        super.init(wVar, xVar, z8, list, eVar);
        this.f10374g = eVar;
        c(z8);
        initMuteStatus(z8);
        setVideoRateConfig(wVar.r().ac(), wVar.r().ad());
        load(wVar.E(), false);
    }

    public void initMuteStatus(boolean z8) {
        this.f10363S = z8;
    }

    @Override // com.anythink.basead.ui.animplayerview.BasePlayerView
    public boolean isMute() {
        return this.f10363S;
    }

    @Override // com.anythink.basead.ui.animplayerview.BasePlayerView
    public boolean isPlaying() {
        ad adVar = this.f10346A;
        return adVar != null && adVar.J();
    }

    public void load(String str, boolean z8) {
        this.f10350E = str;
        com.anythink.basead.b.f.a();
        this.f10349D = com.anythink.basead.b.f.a(4, str);
        if (!new File(this.f10349D).exists() && TextUtils.isEmpty(this.f10350E)) {
            a(com.anythink.basead.d.g.a(com.anythink.basead.d.g.f6336k, com.anythink.basead.d.g.f6317P));
            return;
        }
        this.f10365U = true;
        if (this.f10348C == null) {
            TextureView textureView = new TextureView(getContext());
            this.f10348C = textureView;
            textureView.setKeepScreenOn(true);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(13);
            removeAllViews();
            addView(this.f10348C, layoutParams);
        }
        if (this.f10346A == null) {
            this.f10346A = i.a(new f(getContext()), new com.anythink.basead.exoplayer.i.c(), new d());
            AnonymousClass4 anonymousClass4 = new AnonymousClass4();
            this.aa = anonymousClass4;
            this.f10346A.a(anonymousClass4);
            AnonymousClass5 anonymousClass5 = new AnonymousClass5();
            this.ab = anonymousClass5;
            this.f10346A.a(anonymousClass5);
            this.f10346A.a(this.f10363S ? 0.0f : 1.0f);
            this.f10346A.a(z8);
            a(f(), false);
        }
        setOnClickListener(new AnonymousClass2());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f10631z) {
            return;
        }
        release(5);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        try {
            Bundle bundle = (Bundle) parcelable;
            Parcelable parcelable2 = bundle.getParcelable("superState");
            if (parcelable2 == null) {
                super.onRestoreInstanceState(parcelable);
                return;
            }
            super.onRestoreInstanceState(parcelable2);
            this.f10351F = bundle.getInt("savePosition");
            this.f10355K = bundle.getBoolean("saveVideoPlay25");
            this.f10356L = bundle.getBoolean("saveVideoPlay50");
            this.f10357M = bundle.getBoolean("saveVideoPlay75");
            this.f10359O = bundle.getBoolean("saveIsVideoStart");
            this.f10625t = bundle.getBoolean("saveIsVideoPlayCompletion");
            this.f10363S = bundle.getBoolean("saveIsMute");
            this.f10366V = bundle.getBoolean("saveVideoNeedResumeByCdRate");
            ad adVar = this.f10346A;
            if (adVar != null) {
                adVar.a(this.f10363S ? 0.0f : 1.0f);
            }
            bundle.toString();
        } catch (Throwable unused) {
            super.onRestoreInstanceState(parcelable);
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        try {
            Parcelable onSaveInstanceState = super.onSaveInstanceState();
            Bundle bundle = new Bundle();
            bundle.putParcelable("superState", onSaveInstanceState);
            bundle.putInt("savePosition", this.f10351F);
            bundle.putBoolean("saveVideoPlay25", this.f10355K);
            bundle.putBoolean("saveVideoPlay50", this.f10356L);
            bundle.putBoolean("saveVideoPlay75", this.f10357M);
            bundle.putBoolean("saveIsVideoStart", this.f10359O);
            bundle.putBoolean("saveIsVideoPlayCompletion", this.f10625t);
            bundle.putBoolean("saveIsMute", this.f10363S);
            bundle.putBoolean("saveVideoNeedResumeByCdRate", this.f10366V);
            bundle.toString();
            return bundle;
        } catch (Throwable unused) {
            return super.onSaveInstanceState();
        }
    }

    @Override // com.anythink.basead.ui.animplayerview.BasePlayerView
    public void pause() {
        if (isPlaying()) {
            a(BaseATView.a.f9927F);
        }
        d();
        ad adVar = this.f10346A;
        if (adVar != null) {
            adVar.a(false);
        }
    }

    @Override // com.anythink.basead.ui.animplayerview.BasePlayerView
    public void rePlayVideo() {
        if (this.f10346A != null) {
            this.f10351F = 0;
            this.f10359O = false;
            this.f10625t = false;
            synchronized (this.f10375h) {
                this.f10374g = null;
            }
            a(f(), true);
            start();
        }
    }

    @Override // com.anythink.basead.ui.animplayerview.BasePlayerView
    public void release(final int i) {
        final long currentPosition = getCurrentPosition();
        final long videoLength = getVideoLength();
        d();
        h();
        if (!this.f10625t) {
            a(BaseATView.a.J);
        }
        ad adVar = this.f10346A;
        if (adVar != null) {
            if (adVar.J()) {
                this.f10346A.m();
            }
            w.c cVar = this.aa;
            if (cVar != null) {
                this.f10346A.b(cVar);
            }
            g gVar = this.ab;
            if (gVar != null) {
                this.f10346A.b(gVar);
            }
            this.f10346A.n();
            this.f10346A = null;
        }
        Handler handler = this.f10362R;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        this.f10360P = false;
        if (!this.ae) {
            com.anythink.core.common.res.b.c.a().d(this.f10350E);
        }
        com.anythink.core.common.h.w wVar = this.f10629x;
        if (wVar == null || !wVar.c()) {
            com.anythink.core.common.v.b.b.a().b(new Runnable() { // from class: com.anythink.basead.ui.PlayerView.6
                @Override // java.lang.Runnable
                public final void run() {
                    long j9;
                    long j10;
                    n a9;
                    if (((BasePlayerView) PlayerView.this).f10630y == null || ((BasePlayerView) PlayerView.this).f10629x == null) {
                        return;
                    }
                    if (((BasePlayerView) PlayerView.this).f10629x == null || (a9 = o.a().a(((BasePlayerView) PlayerView.this).f10629x.E())) == null) {
                        j9 = 0;
                        j10 = 0;
                    } else {
                        j9 = a9.e();
                        j10 = a9.d();
                    }
                    com.anythink.core.common.u.e.b(((BasePlayerView) PlayerView.this).f10630y, ((BasePlayerView) PlayerView.this).f10629x, i, currentPosition, j9, videoLength, j10);
                }
            }, 8);
        }
    }

    @Override // com.anythink.basead.ui.animplayerview.BasePlayerView
    public void setListener(BasePlayerView.a aVar) {
        this.f10628w = aVar;
    }

    public void setLoadingView(View view) {
        this.f10367W = view;
    }

    @Override // com.anythink.basead.ui.animplayerview.BasePlayerView
    public void setMute(boolean z8) {
        this.f10363S = z8;
        if (z8) {
            ad adVar = this.f10346A;
            if (adVar != null) {
                adVar.a(0.0f);
            }
            BasePlayerView.a aVar = this.f10628w;
            if (aVar != null) {
                aVar.d();
            }
        } else {
            ad adVar2 = this.f10346A;
            if (adVar2 != null) {
                adVar2.a(1.0f);
            }
            BasePlayerView.a aVar2 = this.f10628w;
            if (aVar2 != null) {
                aVar2.e();
            }
        }
        c(z8);
        a(BaseATView.a.f9931K);
    }

    public void setVideoRateConfig(int i, int i4) {
        this.f10370c = i;
        this.f10369b = i4;
    }

    @Override // com.anythink.basead.ui.animplayerview.BasePlayerView
    public void start() {
        View view = this.f10367W;
        if (view != null) {
            view.setVisibility(8);
        }
        if (!isPlaying()) {
            a(BaseATView.a.f9928G);
        }
        ad adVar = this.f10346A;
        if (adVar != null) {
            adVar.a(true);
        }
        c();
    }

    @Override // com.anythink.basead.ui.animplayerview.BasePlayerView
    public void stop() {
        ad adVar = this.f10346A;
        if (adVar != null) {
            adVar.m();
        }
        h();
    }

    public static /* synthetic */ boolean d(PlayerView playerView) {
        playerView.f10359O = true;
        return true;
    }

    private void g() {
        if (this.f10348C == null) {
            TextureView textureView = new TextureView(getContext());
            this.f10348C = textureView;
            textureView.setKeepScreenOn(true);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(13);
            removeAllViews();
            addView(this.f10348C, layoutParams);
        }
    }

    private void i() {
        BasePlayerView.a aVar = this.f10628w;
        if (aVar != null) {
            aVar.f();
        }
        this.f10346A.a(this.f10347B);
    }

    private void j() {
        synchronized (this.f10375h) {
            this.f10374g = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        this.f10358N = false;
        this.f10364T = null;
        this.ad = 0L;
    }

    private boolean e() {
        if (!new File(this.f10349D).exists() && TextUtils.isEmpty(this.f10350E)) {
            return true;
        }
        this.f10365U = true;
        return false;
    }

    private String f() {
        if (new File(this.f10349D).exists()) {
            return this.f10349D;
        }
        return this.f10350E;
    }

    private void b() {
        View view = this.f10367W;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        if (this.f10364T != null) {
            return;
        }
        this.f10358N = true;
        this.ad = 0L;
        Thread thread = new Thread(new Runnable() { // from class: com.anythink.basead.ui.PlayerView.3
            @Override // java.lang.Runnable
            public final void run() {
                while (PlayerView.this.f10358N) {
                    if (((BasePlayerView) PlayerView.this).f10625t || !PlayerView.this.isPlaying() || PlayerView.this.f10362R == null) {
                        if (PlayerView.this.ad == 0) {
                            PlayerView.this.ad = SystemClock.elapsedRealtime();
                        }
                        try {
                            Thread.sleep(10L);
                        } catch (Throwable th) {
                            th.printStackTrace();
                        }
                        if (SystemClock.elapsedRealtime() - PlayerView.this.ad > f.f7344a && PlayerView.this.ad != 0) {
                            if (((BasePlayerView) PlayerView.this).f10628w != null) {
                                t.b().b(new Runnable() { // from class: com.anythink.basead.ui.PlayerView.3.1
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        PlayerView.this.b(com.anythink.basead.d.g.a(com.anythink.basead.d.g.f6336k, "Video player error!Buffer timeout"));
                                    }
                                });
                            }
                            PlayerView.this.d();
                        }
                    } else {
                        PlayerView.this.ad = 0L;
                        try {
                            PlayerView.this.f10362R.sendEmptyMessage((int) PlayerView.this.f10346A.t());
                        } catch (Throwable unused) {
                        }
                        try {
                            Thread.sleep(200L);
                        } catch (Throwable th2) {
                            th2.printStackTrace();
                        }
                    }
                }
            }
        });
        this.f10364T = thread;
        thread.setName("anythink_type_player_progress");
        this.f10364T.start();
    }

    private void a() {
        View view = this.f10367W;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    private void b(boolean z8) {
        if (this.f10346A == null) {
            this.f10346A = i.a(new f(getContext()), new com.anythink.basead.exoplayer.i.c(), new d());
            AnonymousClass4 anonymousClass4 = new AnonymousClass4();
            this.aa = anonymousClass4;
            this.f10346A.a(anonymousClass4);
            AnonymousClass5 anonymousClass5 = new AnonymousClass5();
            this.ab = anonymousClass5;
            this.f10346A.a(anonymousClass5);
            this.f10346A.a(this.f10363S ? 0.0f : 1.0f);
            this.f10346A.a(z8);
            a(f(), false);
        }
    }

    private void a(long j9) {
        BasePlayerView.a aVar;
        if (this.ae) {
            return;
        }
        int i = this.f10370c;
        if (i > 0 && i < 100) {
            if (this.f10369b > i) {
                this.f10369b = i / 2;
            }
            if (this.f10369b == 0) {
                this.f10368a = 0;
                this.f10366V = true;
            } else if (j9 > 0) {
                this.f10368a = Math.round(((r0 * 1.0f) / 100.0f) * j9) - 2000;
                this.f10366V = true;
            }
            if (this.f10368a > 0 || !this.f10366V || (aVar = this.f10628w) == null) {
                return;
            }
            this.f10366V = false;
            aVar.f();
            return;
        }
        this.f10366V = false;
    }

    private void c(boolean z8) {
        synchronized (this.f10375h) {
            try {
                e eVar = this.f10374g;
                if (eVar != null) {
                    eVar.a(z8);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static /* synthetic */ void c(PlayerView playerView, long j9) {
        synchronized (playerView.f10375h) {
            try {
                e eVar = playerView.f10374g;
                if (eVar != null) {
                    eVar.a(j9);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void b(long j9) {
        synchronized (this.f10375h) {
            try {
                e eVar = this.f10374g;
                if (eVar != null) {
                    eVar.a(j9);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static /* synthetic */ void b(PlayerView playerView, long j9) {
        BasePlayerView.a aVar;
        if (playerView.ae) {
            return;
        }
        int i = playerView.f10370c;
        if (i > 0 && i < 100) {
            if (playerView.f10369b > i) {
                playerView.f10369b = i / 2;
            }
            if (playerView.f10369b == 0) {
                playerView.f10368a = 0;
                playerView.f10366V = true;
            } else if (j9 > 0) {
                playerView.f10368a = Math.round(((r0 * 1.0f) / 100.0f) * j9) - 2000;
                playerView.f10366V = true;
            }
            if (playerView.f10368a > 0 || !playerView.f10366V || (aVar = playerView.f10628w) == null) {
                return;
            }
            playerView.f10366V = false;
            aVar.f();
            return;
        }
        playerView.f10366V = false;
    }

    private void a(String str, boolean z8) {
        while (true) {
            try {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                if (this.f10346A == null) {
                    a(com.anythink.basead.d.g.a(com.anythink.basead.d.g.f6336k, "Player show fail with some internal error"));
                    return;
                }
                this.f10371d = TextUtils.equals(str, this.f10349D);
                if (TextUtils.equals(str, this.f10350E) && this.f10370c > 0) {
                    if (z8) {
                        com.anythink.core.common.u.e.b("Video Play Fail:Play Network Url", "AdxPlayer videoUrl:" + str + ",readyRate:" + this.f10370c + ",maxVideoCacheSize:" + o.a().c() + ",lastRecycleCheckDownloadedFileSize:" + o.a().d() + ",isChaoDi:true,ChaoDiThrowableMsg:" + this.f10372e, t.b().r());
                    } else {
                        com.anythink.core.common.u.e.b("Video Play Fail:Play Network Url", "AdxPlayer videoUrl:" + str + ",readyRate:" + this.f10370c + ",maxVideoCacheSize:" + o.a().c() + ",lastRecycleCheckDownloadedFileSize:" + o.a().d(), t.b().r());
                    }
                }
                Uri parse = Uri.parse(str);
                if (str.toLowerCase().startsWith("http")) {
                    this.f10347B = new o.c(new q("Anythink_ExoPlayer")).b(parse);
                    this.ae = true;
                } else {
                    this.f10347B = new o.c(new com.anythink.basead.exoplayer.j.o(getContext(), "Anythink_ExoPlayer")).b(parse);
                    this.ae = false;
                }
                this.f10346A.a(this.f10348C);
                this.f10346A.a(this.f10347B);
                return;
            } catch (Throwable th) {
                th.printStackTrace();
                if (TextUtils.equals(str, this.f10350E) || z8) {
                    a(com.anythink.basead.d.g.a(com.anythink.basead.d.g.f6336k, th.getMessage()));
                    return;
                } else {
                    this.f10372e = th.getMessage();
                    str = this.f10350E;
                    z8 = true;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        synchronized (this.f10375h) {
            try {
                e eVar = this.f10374g;
                if (eVar != null) {
                    eVar.a(i, (View) null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void a(boolean z8) {
        if (!new File(this.f10349D).exists() && TextUtils.isEmpty(this.f10350E)) {
            a(com.anythink.basead.d.g.a(com.anythink.basead.d.g.f6336k, com.anythink.basead.d.g.f6317P));
            return;
        }
        this.f10365U = true;
        if (this.f10348C == null) {
            TextureView textureView = new TextureView(getContext());
            this.f10348C = textureView;
            textureView.setKeepScreenOn(true);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(13);
            removeAllViews();
            addView(this.f10348C, layoutParams);
        }
        if (this.f10346A == null) {
            this.f10346A = i.a(new f(getContext()), new com.anythink.basead.exoplayer.i.c(), new d());
            AnonymousClass4 anonymousClass4 = new AnonymousClass4();
            this.aa = anonymousClass4;
            this.f10346A.a(anonymousClass4);
            AnonymousClass5 anonymousClass5 = new AnonymousClass5();
            this.ab = anonymousClass5;
            this.f10346A.a(anonymousClass5);
            this.f10346A.a(this.f10363S ? 0.0f : 1.0f);
            this.f10346A.a(z8);
            a(f(), false);
        }
        setOnClickListener(new AnonymousClass2());
    }
}
