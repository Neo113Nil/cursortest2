package com.applovin.impl.adview;

import android.R;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.StrictMode;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.applovin.adview.AppLovinAdView;
import com.applovin.impl.adview.h;
import com.applovin.impl.adview.t;
import com.applovin.impl.sdk.ad.g;
import com.applovin.impl.sdk.d.q;
import com.applovin.impl.sdk.d.x;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import com.applovin.sdk.AppLovinSdkUtils;
import com.tapjoy.TapjoyConstants;
import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public abstract class k extends Activity implements i {
    public static final String KEY_WRAPPER_ID = "com.applovin.interstitial.wrapper_id";
    public static volatile l lastKnownWrapper;
    private g A;
    private View B;
    private g C;
    private View D;
    private e E;
    private ImageView F;
    private com.applovin.impl.sdk.a.d H;
    private s I;
    private ProgressBar J;
    private t.a K;
    private a L;
    private com.applovin.impl.sdk.e.j M;

    /* renamed from: a, reason: collision with root package name */
    private AppLovinAdView f2556a;

    /* renamed from: b, reason: collision with root package name */
    private l f2557b;
    protected h countdownManager;
    public volatile com.applovin.impl.sdk.ad.g currentAd;
    public String currentPlacement;

    /* renamed from: d, reason: collision with root package name */
    private com.applovin.impl.sdk.c.d f2559d;
    public com.applovin.impl.sdk.p logger;
    public com.applovin.impl.sdk.j sdk;
    public r videoView;
    private Handler x;
    private Handler y;
    private FrameLayout z;

    /* renamed from: c, reason: collision with root package name */
    private volatile boolean f2558c = false;
    private volatile boolean e = false;
    private volatile boolean f = false;
    private volatile boolean g = false;
    private volatile boolean h = false;
    private volatile boolean i = false;
    private volatile boolean j = false;
    private volatile boolean k = false;
    private volatile boolean l = false;
    protected volatile boolean poststitialWasDisplayed = false;
    private boolean m = false;
    protected volatile boolean videoMuted = false;
    private volatile boolean n = false;
    private boolean o = true;
    private boolean p = false;
    protected int computedLengthSeconds = 0;
    private boolean q = false;
    private long r = 0;
    private long s = 0;
    private int t = 0;
    private int u = Integer.MIN_VALUE;
    private AtomicBoolean v = new AtomicBoolean(false);
    private AtomicBoolean w = new AtomicBoolean(false);
    private WeakReference<MediaPlayer> G = new WeakReference<>(null);

    /* renamed from: com.applovin.impl.adview.k$21, reason: invalid class name */
    class AnonymousClass21 implements MediaPlayer.OnPreparedListener {
        AnonymousClass21() {
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(MediaPlayer mediaPlayer) {
            k.this.G = new WeakReference(mediaPlayer);
            boolean j = k.this.j();
            float f = !j ? 1 : 0;
            mediaPlayer.setVolume(f, f);
            if (k.this.f2559d != null) {
                k.this.f2559d.e(j ? 1L : 0L);
            }
            int videoWidth = mediaPlayer.getVideoWidth();
            int videoHeight = mediaPlayer.getVideoHeight();
            k.this.computedLengthSeconds = (int) TimeUnit.MILLISECONDS.toSeconds(mediaPlayer.getDuration());
            k.this.videoView.setVideoSize(videoWidth, videoHeight);
            if (k.this.videoView instanceof AppLovinVideoView) {
                mediaPlayer.setDisplay(((AppLovinVideoView) k.this.videoView).getHolder());
            }
            mediaPlayer.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: com.applovin.impl.adview.k.21.1
                @Override // android.media.MediaPlayer.OnErrorListener
                public boolean onError(MediaPlayer mediaPlayer2, final int i, final int i2) {
                    k.this.y.post(new Runnable() { // from class: com.applovin.impl.adview.k.21.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            k.this.logger.d("InterActivity", "Media player error (" + i + "," + i2 + ").");
                            k.this.handleMediaError();
                        }
                    });
                    return true;
                }
            });
            mediaPlayer.setOnInfoListener(new MediaPlayer.OnInfoListener() { // from class: com.applovin.impl.adview.k.21.2
                @Override // android.media.MediaPlayer.OnInfoListener
                public boolean onInfo(MediaPlayer mediaPlayer2, int i, int i2) {
                    if (i != 3) {
                        if (i == 701) {
                            k.this.z();
                            return false;
                        }
                        if (i != 702) {
                            return false;
                        }
                    }
                    k.this.A();
                    return false;
                }
            });
            if (k.this.s == 0) {
                k.this.r();
                k.this.l();
                k.this.w();
                k.this.v();
                k.this.playVideo();
                k.this.J();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A() {
        if (this.L != null) {
            this.L.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B() {
        if (!D()) {
            skipVideo();
            return;
        }
        N();
        pauseReportRewardTask();
        this.logger.a("InterActivity", "Prompting incentivized ad close warning");
        this.H.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C() {
        if (!E()) {
            dismiss();
        } else {
            this.logger.a("InterActivity", "Prompting incentivized non-video ad close warning");
            this.H.c();
        }
    }

    private boolean D() {
        return H() && !isFullyWatched() && ((Boolean) this.sdk.a(com.applovin.impl.sdk.b.b.bH)).booleanValue() && this.H != null;
    }

    private boolean E() {
        return I() && !G() && ((Boolean) this.sdk.a(com.applovin.impl.sdk.b.b.bM)).booleanValue() && this.H != null;
    }

    private int F() {
        if (!(this.currentAd instanceof com.applovin.impl.sdk.ad.a)) {
            return 0;
        }
        float i = ((com.applovin.impl.sdk.ad.a) this.currentAd).i();
        if (i <= 0.0f) {
            i = this.currentAd.o();
        }
        double a2 = com.applovin.impl.sdk.e.l.a(System.currentTimeMillis() - this.r);
        double d2 = i;
        Double.isNaN(d2);
        return (int) Math.min((a2 / d2) * 100.0d, 100.0d);
    }

    private boolean G() {
        return F() >= this.currentAd.Q();
    }

    private boolean H() {
        return AppLovinAdType.INCENTIVIZED.equals(this.currentAd.getType());
    }

    private boolean I() {
        return !this.currentAd.hasVideoUrl() && H();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0066, code lost:
    
        if (r0 > 0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x009a, code lost:
    
        r0 = java.util.concurrent.TimeUnit.SECONDS.toMillis(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0098, code lost:
    
        if (r0 > 0) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void J() {
        int o;
        long j;
        long j2;
        if (this.currentAd != null) {
            if ((this.currentAd.aa() >= 0 || this.currentAd.ab() >= 0) && this.M == null) {
                if (this.currentAd.aa() >= 0) {
                    j = this.currentAd.aa();
                } else {
                    if (isVastAd()) {
                        com.applovin.impl.a.a aVar = (com.applovin.impl.a.a) this.currentAd;
                        com.applovin.impl.a.j a2 = aVar.a();
                        if (a2 == null || a2.b() <= 0) {
                            int duration = this.videoView.getDuration();
                            if (duration > 0) {
                                j2 = duration;
                            }
                            if (aVar.ac()) {
                                o = (int) aVar.o();
                            }
                        } else {
                            j2 = TimeUnit.SECONDS.toMillis(a2.b());
                        }
                        r2 = 0 + j2;
                        if (aVar.ac()) {
                        }
                    } else if (this.currentAd instanceof com.applovin.impl.sdk.ad.a) {
                        com.applovin.impl.sdk.ad.a aVar2 = (com.applovin.impl.sdk.ad.a) this.currentAd;
                        int duration2 = this.videoView.getDuration();
                        r2 = duration2 > 0 ? 0 + duration2 : 0L;
                        if (aVar2.ac()) {
                            int i = (int) aVar2.i();
                            if (i > 0) {
                                long millis = TimeUnit.SECONDS.toMillis(i);
                                r2 += millis;
                            } else {
                                o = (int) aVar2.o();
                            }
                        }
                    }
                    double d2 = r2;
                    double ab = this.currentAd.ab();
                    Double.isNaN(ab);
                    Double.isNaN(d2);
                    j = (long) (d2 * (ab / 100.0d));
                }
                this.logger.a("InterActivity", "Scheduling report reward in " + TimeUnit.MILLISECONDS.toSeconds(j) + " seconds...");
                this.M = com.applovin.impl.sdk.e.j.a(j, this.sdk, new Runnable() { // from class: com.applovin.impl.adview.k.14
                    @Override // java.lang.Runnable
                    public void run() {
                        if (k.this.currentAd == null || k.this.currentAd.ad().getAndSet(true)) {
                            return;
                        }
                        k.this.sdk.C().a(new x(k.this.currentAd, k.this.sdk), q.a.REWARD);
                    }
                });
            }
        }
    }

    private void K() {
        com.applovin.impl.sdk.p pVar;
        String str;
        StringBuilder sb;
        String str2;
        if (!this.f2558c || this.q) {
            if (this.f2556a == null) {
                exitWithError("AdView was null");
                return;
            }
            this.f2556a.setAdDisplayListener(new AppLovinAdDisplayListener() { // from class: com.applovin.impl.adview.k.15
                @Override // com.applovin.sdk.AppLovinAdDisplayListener
                public void adDisplayed(AppLovinAd appLovinAd) {
                    if (k.this.g) {
                        return;
                    }
                    k.this.a(appLovinAd);
                }

                @Override // com.applovin.sdk.AppLovinAdDisplayListener
                public void adHidden(AppLovinAd appLovinAd) {
                    k.this.b(appLovinAd);
                }
            });
            this.f2556a.setAdClickListener(new AppLovinAdClickListener() { // from class: com.applovin.impl.adview.k.16
                @Override // com.applovin.sdk.AppLovinAdClickListener
                public void adClicked(AppLovinAd appLovinAd) {
                    com.applovin.impl.sdk.e.g.a(k.this.f2557b.e(), appLovinAd, k.this.sdk);
                }
            });
            this.currentAd = (com.applovin.impl.sdk.ad.g) this.f2557b.b();
            if (this.w.compareAndSet(false, true)) {
                this.sdk.n().trackImpression(this.currentAd, this.currentPlacement);
                this.currentAd.setHasShown(true);
            }
            a(this.currentAd);
            k();
            if (this.currentAd.isVideoAd()) {
                this.n = this.currentAd.b();
                if (this.n) {
                    pVar = this.logger;
                    str = "InterActivity";
                    sb = new StringBuilder();
                    str2 = "Preparing stream for ";
                } else {
                    pVar = this.logger;
                    str = "InterActivity";
                    sb = new StringBuilder();
                    str2 = "Preparing cached video playback for ";
                }
                sb.append(str2);
                sb.append(this.currentAd.e());
                pVar.a(str, sb.toString());
                if (this.f2559d != null) {
                    this.f2559d.b(this.n ? 1L : 0L);
                }
            }
            this.videoMuted = j();
            Uri e = this.currentAd.e();
            a(e);
            if (e == null) {
                J();
            }
            this.A.bringToFront();
            if (o() && this.B != null) {
                this.B.bringToFront();
            }
            if (this.C != null) {
                this.C.bringToFront();
            }
            if (!this.currentAd.al() && !this.currentAd.am()) {
                this.f2556a.renderAd(this.currentAd, this.currentPlacement);
            }
            this.f2557b.a(true);
            if (this.currentAd.hasVideoUrl()) {
                return;
            }
            if (I() && ((Boolean) this.sdk.a(com.applovin.impl.sdk.b.b.bT)).booleanValue()) {
                d(this.currentAd);
            }
            showPoststitial();
        }
    }

    private void L() {
        if (this.videoView != null) {
            this.t = getVideoPercentViewed();
            this.videoView.stopPlayback();
        }
    }

    private boolean M() {
        return this.videoMuted;
    }

    private void N() {
        this.sdk.a((com.applovin.impl.sdk.b.d<com.applovin.impl.sdk.b.d<Integer>>) com.applovin.impl.sdk.b.d.n, (com.applovin.impl.sdk.b.d<Integer>) Integer.valueOf(this.videoView.getCurrentPosition()));
        this.sdk.a((com.applovin.impl.sdk.b.d<com.applovin.impl.sdk.b.d<Boolean>>) com.applovin.impl.sdk.b.d.o, (com.applovin.impl.sdk.b.d<Boolean>) true);
        try {
            this.countdownManager.c();
        } catch (Throwable th) {
            this.logger.b("InterActivity", "Unable to pause countdown timers", th);
        }
        this.videoView.pause();
    }

    private void O() {
        long max = Math.max(0L, ((Long) this.sdk.a(com.applovin.impl.sdk.b.b.dt)).longValue());
        if (max <= 0) {
            this.sdk.u().a("InterActivity", "Resuming video immediately");
            P();
            return;
        }
        this.sdk.u().a("InterActivity", "Resuming video with delay of " + max);
        this.y.postDelayed(new Runnable() { // from class: com.applovin.impl.adview.k.18
            @Override // java.lang.Runnable
            public void run() {
                k.this.P();
            }
        }, max);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P() {
        if (this.poststitialWasDisplayed || this.videoView == null || this.videoView.isPlaying()) {
            return;
        }
        this.videoView.seekTo(((Integer) this.sdk.b(com.applovin.impl.sdk.b.d.n, Integer.valueOf(this.videoView.getDuration()))).intValue());
        this.videoView.start();
        this.countdownManager.a();
    }

    private void Q() {
        if (this.j) {
            return;
        }
        try {
            if (this.currentAd.hasVideoUrl()) {
                int videoPercentViewed = getVideoPercentViewed();
                this.sdk.n().trackVideoEnd(this.currentAd, this.currentPlacement, videoPercentViewed, this.n);
                a(this.currentAd, videoPercentViewed, isFullyWatched());
                if (this.f2559d != null) {
                    this.f2559d.c(videoPercentViewed);
                }
            } else if ((this.currentAd instanceof com.applovin.impl.sdk.ad.a) && I() && ((Boolean) this.sdk.a(com.applovin.impl.sdk.b.b.bT)).booleanValue()) {
                int F = F();
                this.logger.a("InterActivity", "Rewarded playable engaged at " + F + " percent");
                a(this.currentAd, F, F >= this.currentAd.Q());
            }
        } catch (Throwable th) {
            if (this.logger != null) {
                this.logger.b("InterActivity", "Failed to notify end listener.", th);
            }
        }
    }

    private int a(int i) {
        return AppLovinSdkUtils.dpToPx(this, i);
    }

    private int a(int i, boolean z) {
        if (z) {
            if (i == 0) {
                return 0;
            }
            if (i == 1) {
                return 9;
            }
            if (i == 2) {
                return 8;
            }
            return i == 3 ? 1 : -1;
        }
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 9;
        }
        return i == 3 ? 8 : -1;
    }

    private static int a(Display display) {
        if (display.getWidth() == display.getHeight()) {
            return 3;
        }
        return display.getWidth() < display.getHeight() ? 1 : 2;
    }

    private void a(long j, final g gVar) {
        this.y.postDelayed(new Runnable() { // from class: com.applovin.impl.adview.k.7
            @Override // java.lang.Runnable
            public void run() {
                if (gVar.equals(k.this.A)) {
                    k.this.n();
                } else if (gVar.equals(k.this.C)) {
                    k.this.p();
                }
            }
        }, j);
    }

    private void a(Uri uri) {
        this.videoView = this.currentAd.au() ? new n(this.sdk, this, new Runnable() { // from class: com.applovin.impl.adview.k.20
            @Override // java.lang.Runnable
            public void run() {
                k.this.handleMediaError();
            }
        }) : new AppLovinVideoView(this, this.sdk);
        if (uri != null) {
            this.videoView.setOnPreparedListener(new AnonymousClass21());
            this.videoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: com.applovin.impl.adview.k.22
                @Override // android.media.MediaPlayer.OnCompletionListener
                public void onCompletion(MediaPlayer mediaPlayer) {
                    k.this.i();
                }
            });
            this.videoView.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: com.applovin.impl.adview.k.23
                @Override // android.media.MediaPlayer.OnErrorListener
                public boolean onError(MediaPlayer mediaPlayer, final int i, final int i2) {
                    k.this.y.post(new Runnable() { // from class: com.applovin.impl.adview.k.23.1
                        @Override // java.lang.Runnable
                        public void run() {
                            k.this.logger.d("InterActivity", "Video view error (" + i + "," + i2 + ").");
                            k.this.handleMediaError();
                        }
                    });
                    return true;
                }
            });
            StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
            this.videoView.setVideoURI(uri);
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
        this.videoView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1, 17));
        this.videoView.setOnTouchListener(new AppLovinTouchToClickListener(this, new View.OnClickListener() { // from class: com.applovin.impl.adview.k.24
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                k.this.e();
            }
        }));
        this.z.addView((View) this.videoView);
        setContentView(this.z);
        q();
        y();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final View view, final boolean z, long j) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(z ? 0.0f : 1.0f, z ? 1.0f : 0.0f);
        alphaAnimation.setDuration(j);
        alphaAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.applovin.impl.adview.k.12
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                if (z) {
                    return;
                }
                view.setVisibility(4);
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
                view.setVisibility(0);
            }
        });
        view.startAnimation(alphaAnimation);
    }

    private void a(com.applovin.impl.sdk.ad.g gVar) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        this.z = new FrameLayout(this);
        this.z.setLayoutParams(layoutParams);
        this.z.setBackgroundColor(gVar.D());
        this.y = new Handler();
        this.x = new Handler();
        this.countdownManager = new h(this.x, this.sdk);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(AppLovinAd appLovinAd) {
        com.applovin.impl.sdk.e.g.a(this.f2557b.d(), appLovinAd, this.sdk);
        this.g = true;
        this.sdk.R().c();
        AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.adview.k.19
            @Override // java.lang.Runnable
            public void run() {
                k.this.b(k.this.videoMuted);
            }
        }, ((Long) this.sdk.a(com.applovin.impl.sdk.b.b.dx)).longValue());
    }

    private void a(AppLovinAd appLovinAd, double d2, boolean z) {
        this.j = true;
        com.applovin.impl.sdk.e.g.a(this.f2557b.c(), appLovinAd, d2, z, this.sdk);
    }

    private void a(boolean z) {
        Uri av = z ? this.currentAd.av() : this.currentAd.aw();
        int a2 = a(((Integer) this.sdk.a(com.applovin.impl.sdk.b.b.dm)).intValue());
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        AppLovinSdkUtils.safePopulateImageView(this.F, av, a2);
        StrictMode.setThreadPolicy(allowThreadDiskReads);
    }

    private boolean a() {
        int identifier = getResources().getIdentifier((String) this.sdk.a(com.applovin.impl.sdk.b.b.df), "bool", TapjoyConstants.TJC_DEVICE_PLATFORM_TYPE);
        return identifier > 0 && getResources().getBoolean(identifier);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @TargetApi(16)
    public void b() {
        getWindow().getDecorView().setSystemUiVisibility(5894);
    }

    private void b(int i) {
        try {
            setRequestedOrientation(i);
        } catch (Throwable th) {
            this.sdk.u().b("InterActivity", "Failed to set requested orientation", th);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
    
        if (r7 == 1) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0057, code lost:
    
        if (r7 == 2) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005a, code lost:
    
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0063, code lost:
    
        if (r7 == 1) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void b(int i, boolean z) {
        int i2;
        boolean booleanValue = ((Boolean) this.sdk.a(com.applovin.impl.sdk.b.b.dd)).booleanValue();
        if (this.f2557b.f() == g.b.ACTIVITY_PORTRAIT) {
            i2 = 9;
            if (z) {
                if (i == 1 || i == 3) {
                    if (!booleanValue) {
                        return;
                    }
                }
                this.f2558c = true;
            } else {
                if (i == 0 || i == 2) {
                    if (!booleanValue) {
                        return;
                    }
                    if (i == 0) {
                        i2 = 1;
                    }
                }
                this.f2558c = true;
            }
            b(1);
            return;
        }
        if (this.f2557b.f() == g.b.ACTIVITY_LANDSCAPE) {
            i2 = 8;
            if (z) {
                if (i == 0 || i == 2) {
                    if (!booleanValue) {
                        return;
                    }
                }
                this.f2558c = true;
                b(0);
                return;
            }
            if (i == 1 || i == 3) {
                if (!booleanValue) {
                    return;
                }
            }
            this.f2558c = true;
            b(0);
            return;
        }
        return;
        b(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(AppLovinAd appLovinAd) {
        dismiss();
        c(appLovinAd);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(boolean z) {
        c adWebView;
        if (!this.currentAd.S() || (adWebView = ((AdViewControllerImpl) this.f2556a.getAdViewController()).getAdWebView()) == null) {
            return;
        }
        try {
            adWebView.a(z ? "javascript:al_mute();" : "javascript:al_unmute();");
        } catch (Throwable th) {
            this.logger.b("InterActivity", "Unable to forward mute setting to template.", th);
        }
    }

    private void c(AppLovinAd appLovinAd) {
        if (this.h) {
            return;
        }
        this.h = true;
        if (this.f2557b != null) {
            com.applovin.impl.sdk.e.g.b(this.f2557b.d(), appLovinAd, this.sdk);
        }
        this.sdk.R().d();
    }

    private void c(boolean z) {
        this.videoMuted = z;
        MediaPlayer mediaPlayer = this.G.get();
        if (mediaPlayer != null) {
            float f = !z ? 1 : 0;
            try {
                mediaPlayer.setVolume(f, f);
            } catch (IllegalStateException e) {
                this.logger.b("InterActivity", "Failed to set MediaPlayer muted: " + z, e);
            }
        }
    }

    private boolean c() {
        if (this.f2557b == null || this.sdk == null || ((Boolean) this.sdk.a(com.applovin.impl.sdk.b.b.cX)).booleanValue()) {
            return true;
        }
        if (((Boolean) this.sdk.a(com.applovin.impl.sdk.b.b.cY)).booleanValue() && this.k) {
            return true;
        }
        return ((Boolean) this.sdk.a(com.applovin.impl.sdk.b.b.cZ)).booleanValue() && this.poststitialWasDisplayed;
    }

    @SuppressLint({"WrongConstant"})
    private void d() {
        if (this.sdk != null && ((Boolean) this.sdk.a(com.applovin.impl.sdk.b.b.fj)).booleanValue() && isFinishing()) {
            return;
        }
        if (this.currentAd != null && this.currentAd.af() && this.u != Integer.MIN_VALUE) {
            setRequestedOrientation(this.u);
        }
        finish();
    }

    private void d(AppLovinAd appLovinAd) {
        if (this.i) {
            return;
        }
        this.i = true;
        com.applovin.impl.sdk.e.g.a(this.f2557b.c(), appLovinAd, this.sdk);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        if (!this.currentAd.v() || this.currentAd.h() == null) {
            f();
            g();
        } else {
            this.sdk.u().a("InterActivity", "Clicking through video...");
            clickThroughFromVideo();
        }
    }

    private void f() {
        if (!((Boolean) this.sdk.a(com.applovin.impl.sdk.b.b.dg)).booleanValue() || this.E == null || this.E.getVisibility() == 8) {
            return;
        }
        a(this.E, this.E.getVisibility() == 4, 750L);
    }

    private void g() {
        q u = this.currentAd.u();
        if (u == null || !u.e() || this.poststitialWasDisplayed || this.I == null) {
            return;
        }
        a(this.I, this.I.getVisibility() == 4, u.f());
    }

    private void h() {
        if (this.sdk != null) {
            this.sdk.a((com.applovin.impl.sdk.b.d<com.applovin.impl.sdk.b.d<Boolean>>) com.applovin.impl.sdk.b.d.o, (com.applovin.impl.sdk.b.d<Boolean>) false);
            this.sdk.a((com.applovin.impl.sdk.b.d<com.applovin.impl.sdk.b.d<Integer>>) com.applovin.impl.sdk.b.d.n, (com.applovin.impl.sdk.b.d<Integer>) 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        this.f = true;
        showPoststitial();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean j() {
        return ((Integer) this.sdk.b(com.applovin.impl.sdk.b.d.n, 0)).intValue() > 0 ? this.videoMuted : ((Boolean) this.sdk.a(com.applovin.impl.sdk.b.b.dl)).booleanValue() ? this.sdk.l().isMuted() : ((Boolean) this.sdk.a(com.applovin.impl.sdk.b.b.dj)).booleanValue();
    }

    private void k() {
        this.A = g.a(this.sdk, this, this.currentAd.p());
        this.A.setVisibility(8);
        this.A.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.adview.k.25
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                k.this.C();
            }
        });
        int a2 = a(this.currentAd.T());
        int i = (this.currentAd.W() ? 3 : 5) | 48;
        int i2 = (this.currentAd.X() ? 3 : 5) | 48;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(a2, a2, i | 48);
        this.A.a(a2);
        int a3 = a(this.currentAd.U());
        int a4 = a(this.currentAd.V());
        layoutParams.setMargins(a4, a3, a4, a3);
        this.z.addView(this.A, layoutParams);
        this.C = g.a(this.sdk, this, this.currentAd.q());
        this.C.setVisibility(8);
        this.C.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.adview.k.26
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                k.this.B();
            }
        });
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(a2, a2, i2);
        layoutParams2.setMargins(a4, a3, a4, a3);
        this.C.a(a2);
        this.z.addView(this.C, layoutParams2);
        this.C.bringToFront();
        if (o()) {
            int a5 = a(((Integer) this.sdk.a(com.applovin.impl.sdk.b.b.ca)).intValue());
            this.B = new View(this);
            this.B.setBackgroundColor(0);
            this.B.setVisibility(8);
            this.D = new View(this);
            this.D.setBackgroundColor(0);
            this.D.setVisibility(8);
            int i3 = a2 + a5;
            int a6 = a3 - a(5);
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(i3, i3, i);
            layoutParams3.setMargins(a6, a6, a6, a6);
            FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(i3, i3, i2);
            layoutParams4.setMargins(a6, a6, a6, a6);
            this.B.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.adview.k.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    k.this.A.performClick();
                }
            });
            this.D.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.adview.k.3
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    k.this.C.performClick();
                }
            });
            this.z.addView(this.B, layoutParams3);
            this.B.bringToFront();
            this.z.addView(this.D, layoutParams4);
            this.D.bringToFront();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        if (this.F == null) {
            try {
                this.videoMuted = j();
                this.F = new ImageView(this);
                if (m()) {
                    this.sdk.u().a("InterActivity", "Mute button should be hidden");
                    return;
                }
                int a2 = a(((Integer) this.sdk.a(com.applovin.impl.sdk.b.b.dm)).intValue());
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(a2, a2, ((Integer) this.sdk.a(com.applovin.impl.sdk.b.b.f828do)).intValue());
                this.F.setScaleType(ImageView.ScaleType.FIT_CENTER);
                int a3 = a(((Integer) this.sdk.a(com.applovin.impl.sdk.b.b.dn)).intValue());
                layoutParams.setMargins(a3, a3, a3, a3);
                if ((this.videoMuted ? this.currentAd.av() : this.currentAd.aw()) == null) {
                    this.sdk.u().d("InterActivity", "Attempting to add mute button but could not find uri");
                    return;
                }
                this.sdk.u().a("InterActivity", "Added mute button with params: " + layoutParams);
                a(this.videoMuted);
                this.F.setClickable(true);
                this.F.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.adview.k.4
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        k.this.toggleMute();
                    }
                });
                this.z.addView(this.F, layoutParams);
                this.F.bringToFront();
            } catch (Exception e) {
                this.sdk.u().a("InterActivity", "Failed to attach mute button", e);
            }
        }
    }

    private boolean m() {
        if (!((Boolean) this.sdk.a(com.applovin.impl.sdk.b.b.dh)).booleanValue()) {
            return true;
        }
        if (!((Boolean) this.sdk.a(com.applovin.impl.sdk.b.b.di)).booleanValue() || j()) {
            return false;
        }
        return !((Boolean) this.sdk.a(com.applovin.impl.sdk.b.b.dk)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        runOnUiThread(new Runnable() { // from class: com.applovin.impl.adview.k.5
            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (k.this.k) {
                        k.this.A.setVisibility(0);
                        return;
                    }
                    k.this.k = true;
                    if (k.this.o() && k.this.B != null) {
                        k.this.B.setVisibility(0);
                        k.this.B.bringToFront();
                    }
                    k.this.A.setVisibility(0);
                    k.this.A.bringToFront();
                    AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                    alphaAnimation.setDuration(((Integer) k.this.sdk.a(com.applovin.impl.sdk.b.b.cO)).intValue());
                    alphaAnimation.setRepeatCount(0);
                    k.this.A.startAnimation(alphaAnimation);
                } catch (Throwable unused) {
                    k.this.dismiss();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean o() {
        return ((Integer) this.sdk.a(com.applovin.impl.sdk.b.b.ca)).intValue() > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p() {
        runOnUiThread(new Runnable() { // from class: com.applovin.impl.adview.k.6
            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (k.this.l || k.this.C == null) {
                        return;
                    }
                    k.this.l = true;
                    k.this.C.setVisibility(0);
                    AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                    alphaAnimation.setDuration(((Integer) k.this.sdk.a(com.applovin.impl.sdk.b.b.cO)).intValue());
                    alphaAnimation.setRepeatCount(0);
                    k.this.C.startAnimation(alphaAnimation);
                    if (!k.this.o() || k.this.D == null) {
                        return;
                    }
                    k.this.D.setVisibility(0);
                    k.this.D.bringToFront();
                } catch (Throwable th) {
                    k.this.logger.c("InterActivity", "Unable to show skip button: " + th);
                }
            }
        });
    }

    private void q() {
        if (this.currentAd.n() >= 0.0f) {
            a(com.applovin.impl.sdk.e.l.b(this.currentAd.n()), (!this.m || this.C == null) ? this.A : this.C);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r() {
        boolean z = ((Boolean) this.sdk.a(com.applovin.impl.sdk.b.b.cW)).booleanValue() && u() > 0;
        if (this.E == null && z) {
            this.E = new e(this);
            int C = this.currentAd.C();
            this.E.setTextColor(C);
            this.E.setTextSize(((Integer) this.sdk.a(com.applovin.impl.sdk.b.b.cU)).intValue());
            this.E.setFinishedStrokeColor(C);
            this.E.setFinishedStrokeWidth(((Integer) this.sdk.a(com.applovin.impl.sdk.b.b.cT)).intValue());
            this.E.setMax(u());
            this.E.setProgress(u());
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(a(((Integer) this.sdk.a(com.applovin.impl.sdk.b.b.cS)).intValue()), a(((Integer) this.sdk.a(com.applovin.impl.sdk.b.b.cS)).intValue()), ((Integer) this.sdk.a(com.applovin.impl.sdk.b.b.cR)).intValue());
            int a2 = a(((Integer) this.sdk.a(com.applovin.impl.sdk.b.b.cQ)).intValue());
            layoutParams.setMargins(a2, a2, a2, a2);
            this.z.addView(this.E, layoutParams);
            this.E.bringToFront();
            this.E.setVisibility(0);
            final long t = t();
            this.countdownManager.a("COUNTDOWN_CLOCK", 1000L, new h.a() { // from class: com.applovin.impl.adview.k.8
                @Override // com.applovin.impl.adview.h.a
                public void a() {
                    if (k.this.E != null) {
                        long seconds = TimeUnit.MILLISECONDS.toSeconds(t - k.this.videoView.getCurrentPosition());
                        if (seconds <= 0) {
                            k.this.E.setVisibility(8);
                            k.this.p = true;
                        } else if (k.this.s()) {
                            k.this.E.setProgress((int) seconds);
                        }
                    }
                }

                @Override // com.applovin.impl.adview.h.a
                public boolean b() {
                    return k.this.s();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean s() {
        return (this.p || this.poststitialWasDisplayed || !this.videoView.isPlaying()) ? false : true;
    }

    private long t() {
        return TimeUnit.SECONDS.toMillis(u());
    }

    private int u() {
        int B = this.currentAd.B();
        return (B <= 0 && ((Boolean) this.sdk.a(com.applovin.impl.sdk.b.b.dw)).booleanValue()) ? this.computedLengthSeconds + 1 : B;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"NewApi"})
    public void v() {
        if (this.J == null && this.currentAd.I()) {
            this.logger.b("InterActivity", "Attaching video progress bar...");
            this.J = new ProgressBar(this, null, R.attr.progressBarStyleHorizontal);
            this.J.setMax(((Integer) this.sdk.a(com.applovin.impl.sdk.b.b.dr)).intValue());
            this.J.setPadding(0, 0, 0, 0);
            if (com.applovin.impl.sdk.e.d.f()) {
                try {
                    this.J.setProgressTintList(ColorStateList.valueOf(this.currentAd.J()));
                } catch (Throwable th) {
                    this.logger.b("InterActivity", "Unable to update progress bar color.", th);
                }
            }
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.videoView.getWidth(), 20, 80);
            layoutParams.setMargins(0, 0, 0, ((Integer) this.sdk.a(com.applovin.impl.sdk.b.b.ds)).intValue());
            this.z.addView(this.J, layoutParams);
            this.J.bringToFront();
            this.countdownManager.a("PROGRESS_BAR", ((Long) this.sdk.a(com.applovin.impl.sdk.b.b.dq)).longValue(), new h.a() { // from class: com.applovin.impl.adview.k.9
                @Override // com.applovin.impl.adview.h.a
                public void a() {
                    if (k.this.J != null) {
                        if (!k.this.shouldContinueFullLengthVideoCountdown()) {
                            k.this.J.setVisibility(8);
                            return;
                        }
                        k.this.J.setProgress((int) ((k.this.videoView.getCurrentPosition() / k.this.videoView.getDuration()) * ((Integer) k.this.sdk.a(com.applovin.impl.sdk.b.b.dr)).intValue()));
                    }
                }

                @Override // com.applovin.impl.adview.h.a
                public boolean b() {
                    return k.this.shouldContinueFullLengthVideoCountdown();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w() {
        final q u = this.currentAd.u();
        if (com.applovin.impl.sdk.e.i.b(this.currentAd.t()) && u != null && this.I == null) {
            this.logger.b("InterActivity", "Attaching video button...");
            this.I = x();
            double a2 = u.a();
            Double.isNaN(a2);
            double b2 = u.b();
            Double.isNaN(b2);
            int width = this.videoView.getWidth();
            int height = this.videoView.getHeight();
            double d2 = width;
            Double.isNaN(d2);
            double d3 = height;
            Double.isNaN(d3);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) ((a2 / 100.0d) * d2), (int) ((b2 / 100.0d) * d3), u.d());
            int a3 = a(u.c());
            layoutParams.setMargins(a3, a3, a3, a3);
            this.z.addView(this.I, layoutParams);
            this.I.bringToFront();
            if (u.i() > 0.0f) {
                this.I.setVisibility(4);
                this.y.postDelayed(new Runnable() { // from class: com.applovin.impl.adview.k.10
                    @Override // java.lang.Runnable
                    public void run() {
                        k.this.a((View) k.this.I, true, u.g());
                    }
                }, com.applovin.impl.sdk.e.l.b(u.i()));
            }
            if (u.j() > 0.0f) {
                this.y.postDelayed(new Runnable() { // from class: com.applovin.impl.adview.k.11
                    @Override // java.lang.Runnable
                    public void run() {
                        k.this.a((View) k.this.I, false, u.h());
                    }
                }, com.applovin.impl.sdk.e.l.b(u.j()));
            }
        }
    }

    private s x() {
        this.logger.a("InterActivity", "Create video button with HTML = " + this.currentAd.t());
        t tVar = new t(this.sdk);
        this.K = new t.a() { // from class: com.applovin.impl.adview.k.13
            @Override // com.applovin.impl.adview.t.a
            public void a(s sVar) {
                k.this.logger.a("InterActivity", "Clicking through from video button...");
                k.this.clickThroughFromVideo();
            }

            @Override // com.applovin.impl.adview.t.a
            public void b(s sVar) {
                k.this.logger.a("InterActivity", "Closing ad from video button...");
                k.this.dismiss();
            }

            @Override // com.applovin.impl.adview.t.a
            public void c(s sVar) {
                k.this.logger.a("InterActivity", "Skipping video from video button...");
                k.this.skipVideo();
            }
        };
        tVar.a(new WeakReference<>(this.K));
        s sVar = new s(tVar, getApplicationContext());
        sVar.a(this.currentAd.t());
        return sVar;
    }

    private void y() {
        if (this.n && this.currentAd.K()) {
            this.L = new a(this, ((Integer) this.sdk.a(com.applovin.impl.sdk.b.b.dv)).intValue(), this.currentAd.M());
            this.L.setColor(this.currentAd.N());
            this.L.setBackgroundColor(this.currentAd.O());
            this.L.setVisibility(8);
            this.z.addView(this.L, new FrameLayout.LayoutParams(-1, -1, 17));
            this.z.bringChildToFront(this.L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z() {
        if (this.L != null) {
            this.L.a();
        }
    }

    public void clickThroughFromVideo() {
        try {
            if (this.currentAd.ae() && this.m) {
                p();
            }
            this.sdk.n().trackAndLaunchVideoClick(this.currentAd, this.currentPlacement, this.f2556a, this.currentAd.h());
            com.applovin.impl.sdk.e.g.a(this.f2557b.e(), this.currentAd, this.sdk);
            if (this.f2559d != null) {
                this.f2559d.b();
            }
        } catch (Throwable th) {
            this.sdk.u().b("InterActivity", "Encountered error while clicking through video.", th);
        }
    }

    public void continueVideo() {
        P();
    }

    @Override // com.applovin.impl.adview.i, android.content.DialogInterface
    public void dismiss() {
        long currentTimeMillis = System.currentTimeMillis() - this.r;
        this.logger.b("InterActivity", "Dismissing ad after " + currentTimeMillis + " milliseconds elapsed");
        if (!((Boolean) this.sdk.a(com.applovin.impl.sdk.b.b.fe)).booleanValue() || this.f2556a != null) {
            ((AdViewControllerImpl) this.f2556a.getAdViewController()).setIsForegroundClickInvalidated(true);
        }
        h();
        Q();
        if (this.f2557b != null) {
            if (this.currentAd != null) {
                c(this.currentAd);
                if (this.f2559d != null) {
                    this.f2559d.c();
                    this.f2559d = null;
                }
            }
            this.f2557b.a(false);
            this.f2557b.h();
        }
        d();
    }

    public void exitWithError(String str) {
        try {
            Log.e("InterActivity", "Failed to properly render an Interstitial Activity, due to error: " + str, new Throwable("Initialized = " + l.f2600b + "; CleanedUp = " + l.f2601c));
            c(new com.applovin.impl.sdk.ad.i());
        } catch (Exception e) {
            Log.e("InterActivity", "Failed to show a video ad due to error:", e);
        }
        d();
    }

    public boolean getPoststitialWasDisplayed() {
        return this.poststitialWasDisplayed;
    }

    public int getVideoPercentViewed() {
        if (this.f) {
            return 100;
        }
        if (this.videoView == null) {
            this.logger.d("InterActivity", "No video view detected on video end");
            return 0;
        }
        int duration = this.videoView.getDuration();
        if (duration <= 0) {
            return this.t;
        }
        double currentPosition = this.videoView.getCurrentPosition();
        double d2 = duration;
        Double.isNaN(currentPosition);
        Double.isNaN(d2);
        return (int) ((currentPosition / d2) * 100.0d);
    }

    public void handleMediaError() {
        com.applovin.impl.sdk.p pVar;
        String str;
        String str2;
        if (this.v.compareAndSet(false, true)) {
            if (((Boolean) this.sdk.a(com.applovin.impl.sdk.b.b.cV)).booleanValue()) {
                this.logger.d("InterActivity", "Handling media player error - Finishing activity...");
                d();
            } else {
                this.logger.d("InterActivity", "Handling media player error - Showing poststitial...");
                showPoststitial();
            }
            pVar = this.logger;
            str = "InterActivity";
            str2 = "Finished handling media player error.";
        } else {
            pVar = this.logger;
            str = "InterActivity";
            str2 = "Already handled media player error. Doing nothing...";
        }
        pVar.d(str, str2);
    }

    protected boolean isFullyWatched() {
        return getVideoPercentViewed() >= this.currentAd.Q();
    }

    protected boolean isVastAd() {
        return this.currentAd instanceof com.applovin.impl.a.a;
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        g gVar;
        if (c()) {
            this.logger.a("InterActivity", "Back button was pressed; forwarding to Android for handling...");
        } else {
            try {
                if (this.m && this.C != null && this.C.getVisibility() == 0 && this.C.getAlpha() > 0.0f && !this.k) {
                    this.logger.a("InterActivity", "Back button was pressed; forwarding as a click to skip button.");
                    gVar = this.C;
                } else if (this.A == null || this.A.getVisibility() != 0 || this.A.getAlpha() <= 0.0f) {
                    this.logger.a("InterActivity", "Back button was pressed, but was not eligible for dismissal.");
                    return;
                } else {
                    this.logger.a("InterActivity", "Back button was pressed; forwarding as a click to close button.");
                    gVar = this.A;
                }
                gVar.performClick();
                return;
            } catch (Exception unused) {
            }
        }
        super.onBackPressed();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (configuration.orientation == 0 || !(this.videoView instanceof n) || this.G.get() == null) {
            return;
        }
        MediaPlayer mediaPlayer = this.G.get();
        this.videoView.setVideoSize(mediaPlayer.getVideoWidth(), mediaPlayer.getVideoHeight());
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x01af  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onCreate(Bundle bundle) {
        String stringExtra;
        String str;
        super.onCreate(bundle);
        if (bundle != null) {
            this.w.set(bundle.getBoolean("instance_impression_tracked"));
        }
        boolean z = true;
        requestWindowFeature(1);
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            try {
                stringExtra = getIntent().getStringExtra(KEY_WRAPPER_ID);
            } catch (Throwable th) {
                if (this.logger != null) {
                    this.logger.b("InterActivity", "Encountered error during onCreate.", th);
                }
                exitWithError("An error was encountered during interstitial ad creation.");
            }
            if (stringExtra == null || stringExtra.isEmpty()) {
                str = "Wrapper ID is null";
            } else {
                this.f2557b = l.a(stringExtra);
                if (this.f2557b == null && lastKnownWrapper != null) {
                    this.f2557b = lastKnownWrapper;
                }
                if (this.f2557b != null) {
                    AppLovinAd b2 = this.f2557b.b();
                    this.sdk = this.f2557b.a();
                    this.logger = this.f2557b.a().u();
                    this.currentPlacement = this.f2557b.g();
                    this.f2559d = new com.applovin.impl.sdk.c.d(b2, this.sdk);
                    if (b2 != null) {
                        com.applovin.impl.sdk.ad.g gVar = (com.applovin.impl.sdk.ad.g) b2;
                        View findViewById = findViewById(R.id.content);
                        if (findViewById != null) {
                            findViewById.setBackgroundColor(gVar.hasVideoUrl() ? gVar.D() : gVar.E());
                        }
                        this.r = System.currentTimeMillis();
                        if (gVar.w()) {
                            getWindow().setFlags(16777216, 16777216);
                        }
                        if (gVar.x()) {
                            getWindow().addFlags(128);
                        }
                        Display defaultDisplay = ((WindowManager) getSystemService("window")).getDefaultDisplay();
                        int a2 = a(defaultDisplay);
                        int rotation = defaultDisplay.getRotation();
                        if ((a2 != 2 || rotation != 0) && ((a2 != 2 || rotation != 2) && ((a2 != 1 || rotation != 1) && (a2 != 1 || rotation != 3)))) {
                            z = false;
                        }
                        int a3 = a(rotation, z);
                        if (bundle == null) {
                            this.u = a3;
                        } else {
                            this.u = bundle.getInt("original_orientation", a3);
                        }
                        if (!gVar.A()) {
                            this.logger.a("InterActivity", "Locking activity orientation to targeted orientation...");
                        } else {
                            if (a3 != -1) {
                                this.logger.a("InterActivity", "Locking activity orientation to current orientation: " + a3);
                                b(a3);
                                this.f2556a = new AppLovinAdView(this.sdk.K(), AppLovinAdSize.INTERSTITIAL, this);
                                this.f2556a.setAutoDestroy(false);
                                ((AdViewControllerImpl) this.f2556a.getAdViewController()).setStatsManagerHelper(this.f2559d);
                                this.f2557b.a((i) this);
                                this.m = ((Boolean) this.sdk.a(com.applovin.impl.sdk.b.b.du)).booleanValue();
                                this.q = com.applovin.impl.sdk.e.d.b(getApplicationContext());
                                this.H = new com.applovin.impl.sdk.a.d(this, this.sdk);
                                StrictMode.setThreadPolicy(allowThreadDiskReads);
                                h();
                                if (this.f2559d != null) {
                                    this.f2559d.a();
                                }
                                K();
                            }
                            this.logger.d("InterActivity", "Unable to detect current orientation. Locking to targeted orientation...");
                        }
                        b(rotation, z);
                        this.f2556a = new AppLovinAdView(this.sdk.K(), AppLovinAdSize.INTERSTITIAL, this);
                        this.f2556a.setAutoDestroy(false);
                        ((AdViewControllerImpl) this.f2556a.getAdViewController()).setStatsManagerHelper(this.f2559d);
                        this.f2557b.a((i) this);
                        this.m = ((Boolean) this.sdk.a(com.applovin.impl.sdk.b.b.du)).booleanValue();
                        this.q = com.applovin.impl.sdk.e.d.b(getApplicationContext());
                        this.H = new com.applovin.impl.sdk.a.d(this, this.sdk);
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                        h();
                        if (this.f2559d != null) {
                        }
                        K();
                    }
                    str = "No current ad found.";
                } else {
                    str = "Wrapper is null; initialized state: " + Boolean.toString(l.f2600b);
                }
            }
            exitWithError(str);
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            h();
            if (this.f2559d != null) {
            }
            K();
        } catch (Throwable th2) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x006b, code lost:
    
        if (r4.currentAd != null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x008a, code lost:
    
        super.onDestroy();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x008d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0082, code lost:
    
        Q();
        c(r4.currentAd);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0080, code lost:
    
        if (r4.currentAd == null) goto L41;
     */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onDestroy() {
        MediaPlayer mediaPlayer;
        try {
            try {
                if (this.f2556a != null) {
                    ViewParent parent = this.f2556a.getParent();
                    if (parent != null && (parent instanceof ViewGroup)) {
                        ((ViewGroup) parent).removeView(this.f2556a);
                    }
                    this.f2556a.destroy();
                    this.f2556a = null;
                }
                if (this.videoView != null) {
                    this.videoView.pause();
                    this.videoView.stopPlayback();
                }
                if (this.sdk != null && ((Boolean) this.sdk.a(com.applovin.impl.sdk.b.b.ff)).booleanValue() && (mediaPlayer = this.G.get()) != null) {
                    mediaPlayer.release();
                }
                if (this.countdownManager != null) {
                    this.countdownManager.b();
                }
                if (this.y != null) {
                    this.y.removeCallbacksAndMessages(null);
                }
                if (this.x != null) {
                    this.x.removeCallbacksAndMessages(null);
                }
            } catch (Throwable th) {
                if (this.logger != null) {
                    this.logger.a("InterActivity", "Unable to destroy video view", th);
                }
            }
        } catch (Throwable th2) {
            if (this.currentAd != null) {
                Q();
                c(this.currentAd);
            }
            throw th2;
        }
    }

    @Override // android.app.Activity
    protected void onPause() {
        this.logger.a("InterActivity", "App paused...");
        this.s = System.currentTimeMillis();
        if (!this.e && (this.q || !this.f2558c)) {
            N();
        }
        this.f2557b.a(false);
        this.H.a();
        pauseReportRewardTask();
        super.onPause();
    }

    @Override // android.app.Activity
    protected void onResume() {
        g gVar;
        super.onResume();
        this.logger.a("InterActivity", "App resumed...");
        this.f2557b.a(true);
        if (this.o) {
            if (this.H.d() || this.poststitialWasDisplayed || this.currentAd == null || !this.currentAd.L()) {
                return;
            }
            z();
            return;
        }
        if (this.f2559d != null) {
            this.f2559d.d(System.currentTimeMillis() - this.s);
        }
        if (!((Boolean) this.sdk.b(com.applovin.impl.sdk.b.d.o, false)).booleanValue() || this.H.d() || this.poststitialWasDisplayed) {
            boolean z = (this.currentAd instanceof com.applovin.impl.sdk.ad.a) && ((com.applovin.impl.sdk.ad.a) this.currentAd).j();
            if (this.currentAd != null && ((Boolean) this.sdk.a(com.applovin.impl.sdk.b.b.cP)).booleanValue() && !this.currentAd.y() && this.poststitialWasDisplayed && this.A != null && !z) {
                gVar = this.A;
                a(0L, gVar);
            }
            resumeReportRewardTask();
        }
        O();
        z();
        if (this.currentAd != null && ((Boolean) this.sdk.a(com.applovin.impl.sdk.b.b.cP)).booleanValue() && !this.currentAd.z() && !this.poststitialWasDisplayed && this.m && this.C != null) {
            gVar = this.C;
            a(0L, gVar);
        }
        resumeReportRewardTask();
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putBoolean("instance_impression_tracked", this.w.get());
        bundle.putInt("original_orientation", this.u);
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            this.logger.a("InterActivity", "Window gained focus");
            try {
                if (com.applovin.impl.sdk.e.d.e() && ((Boolean) this.sdk.a(com.applovin.impl.sdk.b.b.dp)).booleanValue() && a()) {
                    b();
                    if (((Long) this.sdk.a(com.applovin.impl.sdk.b.b.da)).longValue() > 0) {
                        this.y.postDelayed(new Runnable() { // from class: com.applovin.impl.adview.k.1
                            @Override // java.lang.Runnable
                            public void run() {
                                k.this.b();
                            }
                        }, ((Long) this.sdk.a(com.applovin.impl.sdk.b.b.da)).longValue());
                    }
                } else {
                    getWindow().setFlags(1024, 1024);
                }
                if (((Boolean) this.sdk.a(com.applovin.impl.sdk.b.b.db)).booleanValue() && !this.poststitialWasDisplayed) {
                    O();
                    resumeReportRewardTask();
                }
            } catch (Throwable th) {
                this.logger.b("InterActivity", "Setting window flags failed.", th);
            }
        } else {
            this.logger.a("InterActivity", "Window lost focus");
            if (((Boolean) this.sdk.a(com.applovin.impl.sdk.b.b.db)).booleanValue() && !this.poststitialWasDisplayed) {
                N();
                pauseReportRewardTask();
            }
        }
        this.o = false;
    }

    public void pauseReportRewardTask() {
        if (this.M != null) {
            this.M.b();
        }
    }

    protected void playVideo() {
        d(this.currentAd);
        this.videoView.start();
        this.countdownManager.a();
    }

    public void resumeReportRewardTask() {
        if (this.M != null) {
            this.M.c();
        }
    }

    protected boolean shouldContinueFullLengthVideoCountdown() {
        return (this.f || this.poststitialWasDisplayed) ? false : true;
    }

    public void showPoststitial() {
        long j;
        g gVar;
        try {
            if (this.f2559d != null) {
                this.f2559d.g();
            }
            if (!this.currentAd.Y()) {
                L();
            }
            if (this.f2556a != null) {
                ViewParent parent = this.f2556a.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(this.f2556a);
                }
                FrameLayout frameLayout = new FrameLayout(this);
                frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                frameLayout.setBackgroundColor(this.currentAd.E());
                frameLayout.addView(this.f2556a);
                if (this.currentAd.al()) {
                    this.f2556a.renderAd(this.currentAd, this.currentPlacement);
                }
                if (this.currentAd.Y()) {
                    L();
                }
                if (this.z != null) {
                    this.z.removeAllViewsInLayout();
                }
                if (o() && this.B != null) {
                    if (this.B.getParent() instanceof ViewGroup) {
                        ((ViewGroup) this.B.getParent()).removeView(this.B);
                    }
                    frameLayout.addView(this.B);
                    this.B.bringToFront();
                }
                if (this.A != null) {
                    ViewParent parent2 = this.A.getParent();
                    if (parent2 instanceof ViewGroup) {
                        ((ViewGroup) parent2).removeView(this.A);
                    }
                    frameLayout.addView(this.A);
                    this.A.bringToFront();
                }
                setContentView(frameLayout);
                if (this.currentAd.am()) {
                    this.f2556a.renderAd(this.currentAd, this.currentPlacement);
                }
                if (((Boolean) this.sdk.a(com.applovin.impl.sdk.b.b.fb)).booleanValue()) {
                    this.f2556a.setVisibility(4);
                    this.f2556a.setVisibility(0);
                }
                int R = this.currentAd.R();
                if (R >= 0) {
                    this.y.postDelayed(new Runnable() { // from class: com.applovin.impl.adview.k.17
                        @Override // java.lang.Runnable
                        public void run() {
                            c adWebView = ((AdViewControllerImpl) k.this.f2556a.getAdViewController()).getAdWebView();
                            if (adWebView != null) {
                                adWebView.a("javascript:al_onPoststitialShow();");
                            }
                        }
                    }, R);
                }
            }
            if ((this.currentAd instanceof com.applovin.impl.sdk.ad.a) && ((com.applovin.impl.sdk.ad.a) this.currentAd).j()) {
                this.logger.a("InterActivity", "Skip showing of close button");
            } else {
                if (this.currentAd.o() >= 0.0f) {
                    j = com.applovin.impl.sdk.e.l.b(this.currentAd.o());
                    gVar = this.A;
                } else if (this.currentAd.o() == -2.0f) {
                    this.A.setVisibility(0);
                } else {
                    j = 0;
                    gVar = this.A;
                }
                a(j, gVar);
            }
            this.poststitialWasDisplayed = true;
        } catch (Throwable th) {
            this.logger.b("InterActivity", "Encountered error while showing poststitial. Dismissing...", th);
            dismiss();
        }
    }

    public void skipVideo() {
        if (this.f2559d != null) {
            this.f2559d.f();
        }
        if (this.currentAd.r()) {
            dismiss();
        } else {
            showPoststitial();
        }
    }

    public void toggleMute() {
        boolean z = !M();
        if (this.f2559d != null) {
            this.f2559d.h();
        }
        try {
            c(z);
            a(z);
            b(z);
        } catch (Throwable th) {
            this.logger.b("InterActivity", "Unable to set volume to " + z, th);
        }
    }
}
