package com.startapp.sdk.ads.video;

import B0.n;
import E1.A;
import a.AbstractC0129a;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.VideoView;
import com.startapp.sdk.ads.interstitials.OverlayActivity;
import com.startapp.sdk.ads.video.player.VideoPlayerInterface$VideoPlayerErrorType;
import com.startapp.sdk.ads.video.tracking.AbsoluteTrackingLink;
import com.startapp.sdk.ads.video.tracking.ActionTrackingLink;
import com.startapp.sdk.ads.video.tracking.FractionTrackingLink;
import com.startapp.sdk.ads.video.tracking.VideoClickedTrackingParams;
import com.startapp.sdk.ads.video.tracking.VideoPausedTrackingParams;
import com.startapp.sdk.ads.video.tracking.VideoProgressTrackingParams;
import com.startapp.sdk.ads.video.tracking.VideoTrackingLink;
import com.startapp.sdk.ads.video.tracking.VideoTrackingParams;
import com.startapp.sdk.ads.video.vast.VASTErrorCodes;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.VideoConfig;
import com.startapp.sdk.adsbase.adinformation.AdInformationView;
import com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason;
import com.startapp.sdk.adsbase.commontracking.TrackingParams;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.internal.ak;
import com.startapp.sdk.internal.cb;
import com.startapp.sdk.internal.d9;
import com.startapp.sdk.internal.e9;
import com.startapp.sdk.internal.ek;
import com.startapp.sdk.internal.g0;
import com.startapp.sdk.internal.h0;
import com.startapp.sdk.internal.ii;
import com.startapp.sdk.internal.ij;
import com.startapp.sdk.internal.kj;
import com.startapp.sdk.internal.la;
import com.startapp.sdk.internal.lj;
import com.startapp.sdk.internal.ne;
import com.startapp.sdk.internal.nj;
import com.startapp.sdk.internal.oe;
import com.startapp.sdk.internal.pd;
import com.startapp.sdk.internal.pj;
import com.startapp.sdk.internal.qj;
import com.startapp.sdk.internal.rf;
import com.startapp.sdk.internal.rj;
import com.startapp.sdk.internal.sd;
import com.startapp.sdk.internal.sf;
import com.startapp.sdk.internal.si;
import com.startapp.sdk.internal.sj;
import com.startapp.sdk.internal.tj;
import com.startapp.sdk.internal.uj;
import com.startapp.sdk.internal.vj;
import com.startapp.sdk.internal.w0;
import com.startapp.sdk.internal.wa;
import com.startapp.sdk.internal.wb;
import com.startapp.sdk.internal.wj;
import com.startapp.sdk.internal.xf;
import com.startapp.sdk.internal.xj;
import com.startapp.sdk.internal.yj;
import com.startapp.sdk.internal.zj;
import com.startapp.sdk.omsdk.VerificationDetails;
import com.startapp.startappsdk.R;
import j1.AbstractC1053b;
import j1.C1052a;
import j1.e;
import j1.i;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import k1.C1078b;
import k1.EnumC1077a;
import n1.j;
import org.json.JSONException;
import org.json.JSONObject;
import q1.AbstractC1180a;

/* loaded from: classes.dex */
public final class c extends wa {

    /* renamed from: s0, reason: collision with root package name */
    public static final int f3154s0 = R.id.io_start_video_view;

    /* renamed from: K, reason: collision with root package name */
    public long f3155K;
    public pd L;

    /* renamed from: M, reason: collision with root package name */
    public VideoView f3156M;

    /* renamed from: N, reason: collision with root package name */
    public RelativeLayout f3157N;

    /* renamed from: O, reason: collision with root package name */
    public RelativeLayout f3158O;

    /* renamed from: P, reason: collision with root package name */
    public ProgressBar f3159P;

    /* renamed from: R, reason: collision with root package name */
    public boolean f3161R;

    /* renamed from: S, reason: collision with root package name */
    public boolean f3162S;

    /* renamed from: T, reason: collision with root package name */
    public boolean f3163T;

    /* renamed from: U, reason: collision with root package name */
    public boolean f3164U;

    /* renamed from: W, reason: collision with root package name */
    public boolean f3166W;

    /* renamed from: X, reason: collision with root package name */
    public boolean f3167X;

    /* renamed from: Z, reason: collision with root package name */
    public boolean f3169Z;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f3170a0;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f3171b0;

    /* renamed from: d0, reason: collision with root package name */
    public int f3173d0;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f3174e0;

    /* renamed from: f0, reason: collision with root package name */
    public boolean f3175f0;

    /* renamed from: g0, reason: collision with root package name */
    public int f3176g0;

    /* renamed from: h0, reason: collision with root package name */
    public long f3177h0;

    /* renamed from: q0, reason: collision with root package name */
    public boolean f3184q0;

    /* renamed from: Q, reason: collision with root package name */
    public int f3160Q = 0;

    /* renamed from: V, reason: collision with root package name */
    public int f3165V = 1;

    /* renamed from: Y, reason: collision with root package name */
    public int f3168Y = 0;

    /* renamed from: c0, reason: collision with root package name */
    public int f3172c0 = 0;

    /* renamed from: i0, reason: collision with root package name */
    public String f3178i0 = null;

    /* renamed from: j0, reason: collision with root package name */
    public final Handler f3179j0 = new Handler();

    /* renamed from: k0, reason: collision with root package name */
    public final HashMap f3180k0 = new HashMap();
    public final HashMap l0 = new HashMap();

    /* renamed from: m0, reason: collision with root package name */
    public final HashMap f3181m0 = new HashMap();

    /* renamed from: n0, reason: collision with root package name */
    public final HashMap f3182n0 = new HashMap();
    public final Handler o0 = new Handler();

    /* renamed from: p0, reason: collision with root package name */
    public final tj f3183p0 = new tj(this);

    /* renamed from: r0, reason: collision with root package name */
    public final uj f3185r0 = new uj(this);

    public final void A() {
        FractionTrackingLink[] c3 = x().getVideoTrackingDetails().c();
        if (c3 != null) {
            for (FractionTrackingLink fractionTrackingLink : c3) {
                List list = (List) this.f3181m0.get(Integer.valueOf(fractionTrackingLink.g()));
                if (list == null) {
                    list = new ArrayList();
                    this.f3181m0.put(Integer.valueOf(fractionTrackingLink.g()), list);
                }
                list.add(fractionTrackingLink);
            }
        }
        AbsoluteTrackingLink[] a3 = x().getVideoTrackingDetails().a();
        if (a3 != null) {
            for (AbsoluteTrackingLink absoluteTrackingLink : a3) {
                List list2 = (List) this.f3182n0.get(Integer.valueOf(absoluteTrackingLink.g()));
                if (list2 == null) {
                    list2 = new ArrayList();
                    this.f3182n0.put(Integer.valueOf(absoluteTrackingLink.g()), list2);
                }
                list2.add(absoluteTrackingLink);
            }
        }
    }

    public final boolean B() {
        return !this.f3169Z ? C() && this.f3162S : this.f3168Y >= AdsCommonMetaData.k().F().j() && C() && this.f3162S;
    }

    public final boolean C() {
        pd pdVar = this.L;
        return (pdVar == null || pdVar.f4309g == null) ? false : true;
    }

    public final boolean D() {
        pd pdVar;
        boolean isSkippable = x().isSkippable();
        Long unskipLess = x().getUnskipLess();
        if (unskipLess == null || (pdVar = this.L) == null || pdVar.f4309g == null) {
            return isSkippable;
        }
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        return isSkippable && timeUnit.toSeconds((long) pdVar.f4310h.getDuration()) > timeUnit.toSeconds(unskipLess.longValue());
    }

    public final boolean E() {
        return this.f4675A > 0 || D() || this.f3166W;
    }

    public final void F() {
        pd pdVar = this.L;
        if (pdVar != null) {
            try {
                boolean z = this.f3161R;
                MediaPlayer mediaPlayer = pdVar.f4309g;
                if (mediaPlayer != null) {
                    if (z) {
                        mediaPlayer.setVolume(0.0f, 0.0f);
                    } else {
                        mediaPlayer.setVolume(1.0f, 1.0f);
                    }
                }
            } catch (Throwable th) {
                d9.a(th);
            }
        }
        si.a(this.f4685t, true, "videoApi.setSound", this.f3161R ? "OFF" : "ON");
    }

    public final void G() {
        ProgressBar progressBar;
        if (this.L == null) {
            return;
        }
        boolean q3 = AdsCommonMetaData.k().F().q();
        String localVideoPath = x().getLocalVideoPath();
        if (localVideoPath != null) {
            pd pdVar = this.L;
            if (pdVar != null) {
                pdVar.a(localVideoPath);
            }
            if (q3 && localVideoPath.endsWith(".temp")) {
                this.f3169Z = true;
                this.f3171b0 = true;
                this.f3168Y = AdsCommonMetaData.k().F().j();
            }
        } else if (q3) {
            String videoUrl = x().getVideoUrl();
            oe oeVar = ne.f4206a;
            if (videoUrl != null && videoUrl.equals(oeVar.f4262c)) {
                oeVar.f4260a = false;
            }
            pd pdVar2 = this.L;
            if (pdVar2 != null) {
                pdVar2.a(videoUrl);
            }
            this.f3169Z = true;
            if (!this.f3175f0 && ((progressBar = this.f3159P) == null || !progressBar.isShown())) {
                this.f3179j0.postDelayed(new pj(this), AdsCommonMetaData.k().F().h());
            }
        } else {
            a(VideoMode$VideoFinishedReason.SKIPPED);
        }
        if (this.f3178i0 == null) {
            this.f3178i0 = this.f3169Z ? "2" : "1";
        }
    }

    public final void H() {
        VideoView videoView;
        sd sdVar;
        this.f3170a0 = true;
        if (this.f3175f0) {
            pd pdVar = this.L;
            if (pdVar != null) {
                pdVar.f4310h.pause();
                return;
            }
            return;
        }
        boolean z = u() == 0;
        if (z) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            si.a(this.f4685t, true, "videoApi.setVideoDuration", Long.valueOf(timeUnit.toSeconds(v())));
            si.a(this.f4685t, true, "videoApi.setVideoRemainingTimer", 0);
            si.a(this.f4685t, true, "videoApi.setSkipTimer", Long.valueOf(timeUnit.toSeconds(w())));
            si.a(this.f4685t, true, "videoApi.setVideoCurrentPosition", Long.valueOf(timeUnit.toSeconds(u())));
        }
        if (this.L != null) {
            if (z) {
                a((ImageButton) null);
            }
            pd pdVar2 = this.L;
            if (pdVar2 != null) {
                pdVar2.f4310h.start();
                this.f4685t.setBackgroundColor(33554431);
            }
            int v = v();
            if (z && v > 0 && (sdVar = this.f4678D) != null) {
                float f = v;
                float f3 = this.f3161R ? 0.0f : 1.0f;
                C1078b c1078b = sdVar.f4429c;
                if (c1078b != null) {
                    if (f <= 0.0f) {
                        throw new IllegalArgumentException("Invalid Media duration");
                    }
                    if (f3 < 0.0f || f3 > 1.0f) {
                        throw new IllegalArgumentException("Invalid Media volume");
                    }
                    i iVar = c1078b.f9675a;
                    AbstractC0129a.a(iVar);
                    JSONObject jSONObject = new JSONObject();
                    r1.b.b(jSONObject, "duration", Float.valueOf(f));
                    r1.b.b(jSONObject, "mediaPlayerVolume", Float.valueOf(f3));
                    r1.b.b(jSONObject, "deviceVolume", Float.valueOf(j.b().f10162a));
                    iVar.f9544e.d("start", jSONObject);
                }
            }
            I();
            if (this.f3170a0 && (videoView = this.f3156M) != null) {
                a(videoView);
            }
        }
        this.f4519b.f3257b.setVisibility(0);
        F();
    }

    public final void I() {
        ProgressBar progressBar;
        this.f3179j0.removeCallbacksAndMessages(null);
        ProgressBar progressBar2 = this.f3159P;
        if (progressBar2 == null || !progressBar2.isShown() || (progressBar = this.f3159P) == null) {
            return;
        }
        progressBar.setVisibility(8);
    }

    @Override // com.startapp.sdk.internal.wa, com.startapp.sdk.internal.u7
    public final void a(Bundle bundle) {
        super.a(bundle);
        try {
            int i3 = AdsCommonMetaData.k().F().i();
            if (i3 > 0) {
                this.f3173d0 = 100 / i3;
            } else {
                this.f3173d0 = 0;
            }
            y();
            A();
            this.f3161R = x().isVideoMuted() || AdsCommonMetaData.k().F().m().equals("muted");
        } catch (Throwable th) {
            d9.a(th);
            Intent intent = new Intent("com.startapp.android.ShowFailedDisplayBroadcastListener");
            intent.putExtra("showFailedReason", NotDisplayedReason.VIDEO_ERROR);
            wb.a(this.f4518a).a(intent);
            this.f3164U = true;
            b();
        }
    }

    @Override // com.startapp.sdk.internal.wa, com.startapp.sdk.internal.u7
    public final void b() {
        String localVideoPath;
        super.b();
        if (this.f3171b0 && (localVideoPath = x().getLocalVideoPath()) != null && localVideoPath.endsWith(".temp")) {
            new File(localVideoPath).delete();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0030, code lost:
    
        if (r5 <= 0) goto L17;
     */
    @Override // com.startapp.sdk.internal.wa, com.startapp.sdk.internal.u7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c() {
        long j3;
        if (this.f3175f0) {
            i();
            return false;
        }
        if (this.L == null) {
            return false;
        }
        int u3 = u();
        if (!this.f3166W && this.f4675A <= 0) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            j3 = timeUnit.toSeconds(w()) - timeUnit.toSeconds(u3);
        }
        j3 = 0;
        if (!E() || j3 != 0) {
            if (!x().isCloseable() && !this.f3167X) {
                return true;
            }
            i();
            return false;
        }
        ProgressBar progressBar = this.f3159P;
        if (progressBar != null && progressBar.isShown()) {
            I();
        }
        a(VideoMode$VideoFinishedReason.SKIPPED);
        a(this.f3176g0, new VideoTrackingParams(a(this.f3176g0), this.f4675A, this.f4530n, this.f3178i0), "skipped", x().getVideoTrackingDetails().p());
        return true;
    }

    @Override // com.startapp.sdk.internal.wa, com.startapp.sdk.internal.u7
    public final void f() {
        C1078b c1078b;
        if (!this.f3175f0 && !this.f4518a.isFinishing() && !this.f3167X && !this.f3166W) {
            VideoPausedTrackingParams.PauseOrigin pauseOrigin = VideoPausedTrackingParams.PauseOrigin.EXTERNAL;
            pd pdVar = this.L;
            if (pdVar != null) {
                pdVar.f4310h.pause();
                sd sdVar = this.f4678D;
                if (sdVar != null && (c1078b = sdVar.f4429c) != null) {
                    i iVar = c1078b.f9675a;
                    AbstractC0129a.a(iVar);
                    iVar.f9544e.d("pause", null);
                }
            }
            a(this.f3176g0, new VideoPausedTrackingParams(this.f4530n, a(this.f3176g0), this.f4675A, this.f3165V, pauseOrigin, this.f3178i0), "paused", x().getVideoTrackingDetails().j());
        }
        pd pdVar2 = this.L;
        if (pdVar2 != null) {
            MediaPlayer mediaPlayer = pdVar2.f4309g;
            if (mediaPlayer != null) {
                mediaPlayer.setOnSeekCompleteListener(null);
                pdVar2.f4309g = null;
            }
            ne.f4206a.f4261b = null;
            this.L = null;
        }
        I();
        if (this.f3184q0) {
            this.f4518a.unregisterReceiver(this.f3185r0);
            this.f3184q0 = false;
        }
        this.o0.removeCallbacksAndMessages(null);
        super.f();
    }

    @Override // com.startapp.sdk.internal.wa, com.startapp.sdk.internal.u7
    public final void g() {
        super.g();
        if (this.f4518a.isFinishing()) {
            return;
        }
        this.f4518a.registerReceiver(this.f3185r0, new IntentFilter("android.media.RINGER_MODE_CHANGED"));
        this.f3184q0 = true;
        if (this.f3156M == null) {
            Context a3 = w0.a(this.f4518a);
            if (a3 == null) {
                a3 = this.f4518a;
            }
            this.f3158O = (RelativeLayout) this.f4518a.findViewById(h0.f3917h);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            VideoView videoView = new VideoView(a3);
            this.f3156M = videoView;
            videoView.setId(f3154s0);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams2.addRule(13);
            ProgressBar progressBar = new ProgressBar(a3, null, android.R.attr.progressBarStyleInverse);
            this.f3159P = progressBar;
            progressBar.setVisibility(4);
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams3.addRule(14);
            layoutParams3.addRule(15);
            RelativeLayout relativeLayout = new RelativeLayout(a3);
            this.f3157N = relativeLayout;
            relativeLayout.setId(h0.f3920k);
            this.f4518a.setContentView(this.f3157N);
            this.f3157N.addView(this.f3156M, layoutParams2);
            this.f3157N.addView(this.f3158O, layoutParams);
            this.f3157N.addView(this.f3159P, layoutParams3);
            if (h0.f3916g.booleanValue()) {
                RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams4.addRule(12);
                layoutParams4.addRule(14);
                RelativeLayout relativeLayout2 = this.f3157N;
                TextView textView = new TextView(a3);
                textView.setBackgroundColor(-16777216);
                textView.setAlpha(0.5f);
                textView.setTextColor(-7829368);
                textView.setSingleLine(false);
                textView.setText("url=" + x().getVideoUrl());
                relativeLayout2.addView(textView, layoutParams4);
            }
            this.f4519b.f3257b.setVisibility(4);
        }
        if (this.L == null) {
            this.L = new pd(this.f3156M);
        }
        this.f3163T = false;
        RelativeLayout relativeLayout3 = this.f3157N;
        if (relativeLayout3 != null) {
            relativeLayout3.setBackgroundColor(-16777216);
        }
        G();
        if (this.f3175f0) {
            this.f4519b.f3257b.setVisibility(0);
            this.f3156M.setVisibility(4);
        }
        pd pdVar = this.L;
        pdVar.f3591e = new vj(this);
        pdVar.f3588b = new wj(this);
        pdVar.f3590d = new b(this);
        xj xjVar = new xj(this);
        pdVar.f3589c = new yj(this);
        pdVar.f = xjVar;
        this.f3156M.addOnLayoutChangeListener(new nj(this));
        this.o0.post(this.f3183p0);
    }

    @Override // com.startapp.sdk.internal.u7
    public final void h() {
        if (this.f3164U) {
            return;
        }
        super.h();
    }

    @Override // com.startapp.sdk.internal.wa
    public final void i() {
        if (this.f3164U) {
            return;
        }
        if (this.f3175f0 || this.f3156M == null) {
            a(this.f3176g0, new VideoTrackingParams(a(this.f3176g0), this.f4675A, this.f4530n, this.f3178i0), "postrollClosed", x().getVideoTrackingDetails().l());
            super.i();
        } else {
            pd pdVar = this.L;
            int currentPosition = pdVar != null ? pdVar.f4310h.getCurrentPosition() : 0;
            a(currentPosition, new VideoTrackingParams(a(currentPosition), this.f4675A, this.f4530n, this.f3178i0), "closed", x().getVideoTrackingDetails().i());
        }
    }

    @Override // com.startapp.sdk.internal.wa
    public final long k() {
        return TimeUnit.MILLISECONDS.toSeconds(u());
    }

    @Override // com.startapp.sdk.internal.wa
    public final cb l() {
        OverlayActivity overlayActivity = this.f4518a;
        la laVar = this.f4682H;
        sj sjVar = new sj(this);
        a aVar = new a(this);
        rj rjVar = new rj(this);
        TrackingParams trackingParams = new TrackingParams(this.f4530n);
        boolean[] zArr = this.f;
        return new lj(overlayActivity, laVar, laVar, sjVar, aVar, rjVar, trackingParams, (zArr == null || zArr.length <= 0) ? true : zArr[0]);
    }

    @Override // com.startapp.sdk.internal.wa
    public final long m() {
        Long l3 = this.o;
        return l3 != null ? TimeUnit.SECONDS.toMillis(l3.longValue()) : TimeUnit.SECONDS.toMillis(MetaData.E().A());
    }

    @Override // com.startapp.sdk.internal.wa
    public final TrackingParams n() {
        return new VideoTrackingParams(0, this.f4675A, this.f4530n, this.f3178i0);
    }

    @Override // com.startapp.sdk.internal.wa
    public final boolean o() {
        return this.f4527k.getType() == Ad.AdType.REWARDED_VIDEO;
    }

    @Override // com.startapp.sdk.internal.wa, android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.f3160Q < x().getPostRollHtmlNum()) {
            z();
            return;
        }
        la laVar = this.f4682H;
        laVar.f4086a.i();
        laVar.f4086a.b();
    }

    @Override // com.startapp.sdk.internal.wa
    public final void p() {
    }

    @Override // com.startapp.sdk.internal.wa
    public final void q() {
        this.f3162S = true;
        if (this.f3175f0) {
            a((View) this.f4685t);
            z();
            return;
        }
        si.a(this.f4685t, true, "videoApi.setClickableVideo", Boolean.valueOf(x().isClickable()));
        si.a(this.f4685t, true, "videoApi.setMode", "PLAYER");
        si.a(this.f4685t, true, "videoApi.setCloseable", Boolean.valueOf(x().isCloseable() || this.f3167X));
        si.a(this.f4685t, true, "videoApi.setSkippable", Boolean.valueOf(E()));
        if (B()) {
            H();
        }
    }

    @Override // com.startapp.sdk.internal.wa
    public final void r() {
        int l3 = AdsCommonMetaData.k().F().l();
        ActionTrackingLink[] o = x().getVideoTrackingDetails().o();
        a((v() * l3) / 100, new VideoTrackingParams(l3, this.f4675A, this.f4530n, this.f3178i0), "rewarded", o);
    }

    public final int u() {
        pd pdVar = this.L;
        if (pdVar == null) {
            return this.f3176g0;
        }
        int currentPosition = pdVar.f4310h.getCurrentPosition();
        if (currentPosition > this.f3176g0) {
            this.f3176g0 = currentPosition;
        }
        return this.f3176g0;
    }

    public final int v() {
        pd pdVar = this.L;
        if (pdVar != null) {
            return pdVar.f4310h.getDuration();
        }
        return -1;
    }

    public final long w() {
        long skippableAfter = x().getSkippableAfter();
        pd pdVar = this.L;
        return (pdVar == null || pdVar.f4309g == null) ? skippableAfter : Math.min(skippableAfter, pdVar.f4310h.getDuration());
    }

    public final VideoAdDetails x() {
        return ((ij) this.f4527k).f3987r;
    }

    public final void y() {
        if (this.f4523g.equals("back")) {
            if (AdsCommonMetaData.k().F().a().equals(VideoConfig.BackMode.BOTH)) {
                this.f3166W = true;
                this.f3167X = true;
                return;
            }
            if (AdsCommonMetaData.k().F().a().equals(VideoConfig.BackMode.SKIP)) {
                this.f3166W = true;
                this.f3167X = false;
            } else if (AdsCommonMetaData.k().F().a().equals(VideoConfig.BackMode.CLOSE)) {
                this.f3166W = false;
                this.f3167X = true;
            } else if (AdsCommonMetaData.k().F().a().equals(VideoConfig.BackMode.DISABLED)) {
                this.f3166W = false;
                this.f3167X = false;
            } else {
                this.f3166W = false;
                this.f3167X = false;
            }
        }
    }

    public final void z() {
        String postRollHtml = x().getPostRollHtml(this.f3160Q);
        if (postRollHtml != null) {
            this.o0.post(new n(7, this));
            this.f4685t.setWebViewClient(new zj(this));
            si.a(this.f4685t, postRollHtml);
            Log.println(2, "StartAppSDK", "Post-roll start rendering the ad content");
            this.f3160Q++;
            return;
        }
        si.a(this.f4685t, true, "videoApi.setReplayEnabled", Boolean.valueOf(this.L != null));
        si.a(this.f4685t, true, "videoApi.setMode", VideoMode$HtmlMode.POST_ROLL + "_" + x().getPostRollType());
        this.o0.postDelayed(new qj(this), AdsCommonMetaData.k().F().b() * 1000);
    }

    public final void b(int i3) {
        List list;
        C1078b c1078b;
        if (!this.f3174e0 && this.f4675A <= 0 && i3 != 0) {
            this.f3174e0 = true;
            xf xfVar = this.f4688x;
            if (xfVar != null) {
                xfVar.c();
            }
            a(0, new VideoTrackingParams(0, this.f4675A, this.f4530n, this.f3178i0), "impression", x().getVideoTrackingDetails().d());
            a(0, new VideoTrackingParams(0, this.f4675A, this.f4530n, this.f3178i0), "creativeView", x().getVideoTrackingDetails().b());
            sd sdVar = this.f4678D;
            if (sdVar != null) {
                sdVar.a();
            }
        }
        for (Integer num : this.f3181m0.keySet()) {
            int intValue = num.intValue();
            if (i3 > 0 && i3 >= (v() * intValue) / 100 && this.f3180k0.get(num) == null) {
                if (this.f3181m0.containsKey(num)) {
                    List list2 = (List) this.f3181m0.get(num);
                    if (list2 != null) {
                        a((v() * intValue) / 100, new VideoProgressTrackingParams(intValue, this.f4675A, this.f4530n, this.f3178i0), "fraction", (VideoTrackingLink[]) list2.toArray(new FractionTrackingLink[0]));
                    }
                    sd sdVar2 = this.f4678D;
                    if (sdVar2 != null) {
                        if (intValue == 25) {
                            C1078b c1078b2 = sdVar2.f4429c;
                            if (c1078b2 != null) {
                                i iVar = c1078b2.f9675a;
                                AbstractC0129a.a(iVar);
                                iVar.f9544e.d("firstQuartile", null);
                            }
                        } else if (intValue == 50) {
                            C1078b c1078b3 = sdVar2.f4429c;
                            if (c1078b3 != null) {
                                i iVar2 = c1078b3.f9675a;
                                AbstractC0129a.a(iVar2);
                                iVar2.f9544e.d("midpoint", null);
                            }
                        } else if (intValue == 75 && (c1078b = sdVar2.f4429c) != null) {
                            i iVar3 = c1078b.f9675a;
                            AbstractC0129a.a(iVar3);
                            iVar3.f9544e.d("thirdQuartile", null);
                        }
                    }
                }
                this.f3180k0.put(num, Boolean.TRUE);
            }
        }
        for (Integer num2 : this.f3182n0.keySet()) {
            int intValue2 = num2.intValue();
            if (i3 > 0 && i3 >= intValue2 && this.l0.get(num2) == null) {
                if (this.f3182n0.containsKey(num2) && (list = (List) this.f3182n0.get(num2)) != null) {
                    a(intValue2, new VideoProgressTrackingParams(intValue2, this.f4675A, this.f4530n, this.f3178i0), "absolute", (VideoTrackingLink[]) list.toArray(new AbsoluteTrackingLink[0]));
                }
                this.l0.put(num2, Boolean.TRUE);
            }
        }
        if (i3 >= (v() * AdsCommonMetaData.k().F().l()) / 100) {
            s();
        }
        if (this.f3169Z) {
            if (i3 >= (v() * AdsCommonMetaData.k().F().l()) / 100) {
                s();
            }
        }
    }

    @Override // com.startapp.sdk.internal.wa
    public final void a(WebView webView) {
        super.a(webView);
        webView.setLayerType(1, null);
    }

    @Override // com.startapp.sdk.internal.wa
    public final void a(ImageButton imageButton) {
        VideoAdDetails x3;
        List<VerificationDetails> adVerifications;
        A a3;
        if (!MetaData.E().j0() || (x3 = x()) == null || (adVerifications = x3.getAdVerifications()) == null) {
            return;
        }
        sd sdVar = new sd(this.f4685t.getContext(), adVerifications, true);
        this.f4678D = sdVar;
        AbstractC1053b abstractC1053b = sdVar.f4427a;
        if (abstractC1053b != null) {
            try {
                AdInformationView adInformationView = this.f4519b.f3257b;
                e eVar = e.f9528c;
                if (adInformationView != null) {
                    abstractC1053b.a(adInformationView, eVar);
                }
                if (imageButton != null) {
                    sd sdVar2 = this.f4678D;
                    e eVar2 = e.f9527b;
                    AbstractC1053b abstractC1053b2 = sdVar2.f4427a;
                    if (abstractC1053b2 != null) {
                        abstractC1053b2.a(imageButton, eVar2);
                    }
                }
                sd sdVar3 = this.f4678D;
                WebView webView = this.f4685t;
                e eVar3 = e.f9526a;
                AbstractC1053b abstractC1053b3 = sdVar3.f4427a;
                if (abstractC1053b3 != null) {
                    abstractC1053b3.a(webView, eVar3);
                }
                sd sdVar4 = this.f4678D;
                RelativeLayout relativeLayout = this.f3158O;
                AbstractC1053b abstractC1053b4 = sdVar4.f4427a;
                if (abstractC1053b4 != null) {
                    abstractC1053b4.a(relativeLayout, eVar);
                }
            } catch (RuntimeException unused) {
            }
            sd sdVar5 = this.f4678D;
            VideoView videoView = this.f3156M;
            AbstractC1053b abstractC1053b5 = sdVar5.f4427a;
            if (abstractC1053b5 != null) {
                abstractC1053b5.d(videoView);
            }
            AbstractC1053b abstractC1053b6 = this.f4678D.f4427a;
            if (abstractC1053b6 != null) {
                abstractC1053b6.e();
            }
            sd sdVar6 = this.f4678D;
            boolean E3 = E();
            long w3 = D() ? w() : 0L;
            if (sdVar6.f4428b == null || !sdVar6.f4431e.compareAndSet(false, true)) {
                return;
            }
            if (E3) {
                a3 = new A(true, Float.valueOf(w3));
            } else {
                a3 = new A(false, null);
            }
            C1052a c1052a = sdVar6.f4428b;
            c1052a.getClass();
            i iVar = c1052a.f9515a;
            AbstractC0129a.a(iVar);
            iVar.f9541b.getClass();
            boolean z = a3.f308a;
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("skippable", z);
                if (z) {
                    jSONObject.put("skipOffset", (Float) a3.f309b);
                }
                jSONObject.put("autoPlay", true);
                jSONObject.put("position", k1.c.STANDALONE);
            } catch (JSONException unused2) {
            }
            if (!iVar.f9548j) {
                AbstractC1180a abstractC1180a = iVar.f9544e;
                n1.i.f10160a.a(abstractC1180a.g(), "publishLoadedEvent", jSONObject, abstractC1180a.f10229a);
                iVar.f9548j = true;
                return;
            }
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    public static void a(c cVar) {
        cVar.getClass();
        try {
            ImageButton imageButton = cVar.v;
            if (imageButton != null) {
                imageButton.setVisibility(4);
            }
        } catch (Throwable th) {
            d9.a(th);
        }
    }

    public final void a(View view) {
        si.a(this.f4685t, true, "videoApi.setVideoFrame", Integer.valueOf(ii.b(this.f4518a, view.getLeft())), Integer.valueOf(ii.b(this.f4518a, view.getTop())), Integer.valueOf(ii.b(this.f4518a, view.getWidth())), Integer.valueOf(ii.b(this.f4518a, view.getHeight())));
    }

    public final void a(VideoMode$VideoFinishedReason videoMode$VideoFinishedReason) {
        C1078b c1078b;
        sd sdVar;
        C1078b c1078b2;
        VideoMode$VideoFinishedReason videoMode$VideoFinishedReason2 = VideoMode$VideoFinishedReason.SKIPPED;
        if (videoMode$VideoFinishedReason == videoMode$VideoFinishedReason2 && (sdVar = this.f4678D) != null && (c1078b2 = sdVar.f4429c) != null) {
            i iVar = c1078b2.f9675a;
            AbstractC0129a.a(iVar);
            iVar.f9544e.d("skipped", null);
        }
        VideoMode$VideoFinishedReason videoMode$VideoFinishedReason3 = VideoMode$VideoFinishedReason.COMPLETE;
        if (videoMode$VideoFinishedReason == videoMode$VideoFinishedReason3) {
            int v = v();
            this.f3176g0 = v;
            b(v);
            s();
            sd sdVar2 = this.f4678D;
            if (sdVar2 != null && (c1078b = sdVar2.f4429c) != null) {
                i iVar2 = c1078b.f9675a;
                AbstractC0129a.a(iVar2);
                iVar2.f9544e.d("complete", null);
            }
        } else {
            pd pdVar = this.L;
            if (pdVar != null) {
                pdVar.f4310h.pause();
            }
        }
        if (videoMode$VideoFinishedReason == videoMode$VideoFinishedReason3 || videoMode$VideoFinishedReason == videoMode$VideoFinishedReason2) {
            if (x().hasPostRoll()) {
                z();
                this.f4519b.f3257b.setVisibility(0);
            } else {
                b();
            }
            this.f3175f0 = true;
            if (x().hasPostRoll()) {
                a(this.f3176g0, new VideoTrackingParams(a(this.f3176g0), this.f4675A, this.f4530n, this.f3178i0), "postrollImression", x().getVideoTrackingDetails().m());
            }
        }
    }

    public final void a(ak akVar) {
        VASTErrorCodes vASTErrorCodes;
        d9 d9Var = new d9(e9.f3725e);
        d9Var.f3680d = "Video player error: " + akVar.f3583a;
        d9Var.f3681e = akVar.f3584b;
        d9Var.f3682g = a();
        d9Var.a();
        int ordinal = akVar.f3583a.ordinal();
        if (ordinal == 1) {
            vASTErrorCodes = VASTErrorCodes.GeneralLinearError;
        } else if (ordinal == 2) {
            vASTErrorCodes = VASTErrorCodes.TimeoutMediaFileURI;
        } else if (ordinal != 3) {
            vASTErrorCodes = VASTErrorCodes.UndefinedError;
        } else {
            vASTErrorCodes = VASTErrorCodes.MediaFileDisplayError;
        }
        kj kjVar = new kj(this.f3176g0, new VideoTrackingParams(a(this.f3176g0), this.f4675A, this.f4530n, this.f3178i0), x().getVideoUrl(), x().getVideoTrackingDetails().e());
        kjVar.f4070e = vASTErrorCodes;
        ek.a(this.f4518a, kjVar.a());
        if (u() == 0) {
            g0.a(this.f4524h, this.f4530n, this.f4675A, "VIDEO_ERROR", (JSONObject) null);
            if (!this.f3169Z) {
                sf sfVar = (sf) com.startapp.sdk.components.a.a(this.f4518a).f3449G.a();
                int i3 = sfVar.getInt("videoErrorsCount", 0);
                rf edit = sfVar.edit();
                int i4 = i3 + 1;
                edit.a("videoErrorsCount", Integer.valueOf(i4));
                edit.f4395a.putInt("videoErrorsCount", i4);
                edit.apply();
            } else if (!akVar.f3583a.equals(VideoPlayerInterface$VideoPlayerErrorType.BUFFERING_TIMEOUT)) {
                sf sfVar2 = (sf) com.startapp.sdk.components.a.a(this.f4518a).f3449G.a();
                int i5 = sfVar2.getInt("videoErrorsCount", 0);
                rf edit2 = sfVar2.edit();
                int i6 = i5 + 1;
                edit2.a("videoErrorsCount", Integer.valueOf(i6));
                edit2.f4395a.putInt("videoErrorsCount", i6);
                edit2.apply();
            }
        }
        if ((o() && !this.z) || !x().hasPostRoll()) {
            Intent intent = new Intent("com.startapp.android.ShowFailedDisplayBroadcastListener");
            intent.putExtra("showFailedReason", NotDisplayedReason.VIDEO_ERROR);
            wb.a(this.f4518a).a(intent);
            this.f3164U = true;
            b();
            return;
        }
        a(VideoMode$VideoFinishedReason.SKIPPED);
    }

    public final int a(int i3) {
        int v = v();
        if (v > 0) {
            return (i3 * 100) / v;
        }
        return 0;
    }

    @Override // com.startapp.sdk.internal.wa
    public final void a(String str) {
        if (str.equals("vastClick")) {
            String postRollClickThroughUrl = this.f3175f0 ? x().getPostRollClickThroughUrl() : null;
            if (postRollClickThroughUrl == null) {
                postRollClickThroughUrl = x().getClickUrl();
            }
            if (postRollClickThroughUrl != null) {
                super.a(postRollClickThroughUrl, true);
                return;
            }
            return;
        }
        super.a(str);
    }

    @Override // com.startapp.sdk.internal.wa
    public final boolean a(String str, boolean z) {
        ActionTrackingLink[] h3;
        String postRollClickThroughUrl = this.f3175f0 ? x().getPostRollClickThroughUrl() : null;
        if (postRollClickThroughUrl == null) {
            postRollClickThroughUrl = x().getClickUrl();
        }
        if (!TextUtils.isEmpty(postRollClickThroughUrl)) {
            z = true;
            str = postRollClickThroughUrl;
        }
        if (!this.f3175f0) {
            a(VideoMode$VideoFinishedReason.CLICKED);
        }
        boolean z2 = this.f3175f0;
        if (z2) {
            h3 = x().getVideoTrackingDetails().k();
        } else {
            h3 = x().getVideoTrackingDetails().h();
        }
        a(this.f3176g0, new VideoClickedTrackingParams(this.f4530n, a(this.f3176g0), this.f4675A, z2, this.f3178i0), "clicked", h3);
        sd sdVar = this.f4678D;
        if (sdVar != null) {
            EnumC1077a enumC1077a = EnumC1077a.CLICK;
            C1078b c1078b = sdVar.f4429c;
            if (c1078b != null) {
                i iVar = c1078b.f9675a;
                AbstractC0129a.a(iVar);
                JSONObject jSONObject = new JSONObject();
                r1.b.b(jSONObject, "interactionType", enumC1077a);
                iVar.f9544e.d("adUserInteraction", jSONObject);
            }
        }
        return super.a(str, z);
    }

    public final void a(boolean z) {
        ActionTrackingLink[] g3;
        if (this.L == null) {
            return;
        }
        if (z) {
            g3 = x().getVideoTrackingDetails().f();
        } else {
            g3 = x().getVideoTrackingDetails().g();
        }
        a(this.L.f4310h.getCurrentPosition(), new VideoTrackingParams(a(this.L.f4310h.getCurrentPosition()), this.f4675A, this.f4530n, this.f3178i0), "sound", g3);
        sd sdVar = this.f4678D;
        if (sdVar != null) {
            float f = z ? 0.0f : 1.0f;
            C1078b c1078b = sdVar.f4429c;
            if (c1078b != null) {
                if (f >= 0.0f && f <= 1.0f) {
                    i iVar = c1078b.f9675a;
                    AbstractC0129a.a(iVar);
                    JSONObject jSONObject = new JSONObject();
                    r1.b.b(jSONObject, "mediaPlayerVolume", Float.valueOf(f));
                    r1.b.b(jSONObject, "deviceVolume", Float.valueOf(j.b().f10162a));
                    iVar.f9544e.d("volumeChange", jSONObject);
                    return;
                }
                throw new IllegalArgumentException("Invalid Media volume");
            }
        }
    }

    public final void a(int i3, VideoTrackingParams videoTrackingParams, String str, VideoTrackingLink[] videoTrackingLinkArr) {
        ek.a(this.f4518a, new kj(i3, videoTrackingParams, x().getVideoUrl(), videoTrackingLinkArr).a());
    }
}
