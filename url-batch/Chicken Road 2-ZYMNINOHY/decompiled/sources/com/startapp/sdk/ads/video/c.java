package com.startapp.sdk.ads.video;

import E1.X;
import F2.e;
import F2.i;
import J2.j;
import R1.n;
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
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class c extends wa {

    /* renamed from: s0, reason: collision with root package name */
    public static final int f6237s0 = R.id.io_start_video_view;

    /* renamed from: K, reason: collision with root package name */
    public long f6238K;
    public pd L;

    /* renamed from: M, reason: collision with root package name */
    public VideoView f6239M;

    /* renamed from: N, reason: collision with root package name */
    public RelativeLayout f6240N;

    /* renamed from: O, reason: collision with root package name */
    public RelativeLayout f6241O;

    /* renamed from: P, reason: collision with root package name */
    public ProgressBar f6242P;

    /* renamed from: R, reason: collision with root package name */
    public boolean f6244R;

    /* renamed from: S, reason: collision with root package name */
    public boolean f6245S;

    /* renamed from: T, reason: collision with root package name */
    public boolean f6246T;

    /* renamed from: U, reason: collision with root package name */
    public boolean f6247U;

    /* renamed from: W, reason: collision with root package name */
    public boolean f6249W;

    /* renamed from: X, reason: collision with root package name */
    public boolean f6250X;

    /* renamed from: Z, reason: collision with root package name */
    public boolean f6252Z;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f6253a0;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f6254b0;

    /* renamed from: d0, reason: collision with root package name */
    public int f6256d0;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f6257e0;

    /* renamed from: f0, reason: collision with root package name */
    public boolean f6258f0;

    /* renamed from: g0, reason: collision with root package name */
    public int f6259g0;

    /* renamed from: h0, reason: collision with root package name */
    public long f6260h0;

    /* renamed from: q0, reason: collision with root package name */
    public boolean f6269q0;

    /* renamed from: Q, reason: collision with root package name */
    public int f6243Q = 0;

    /* renamed from: V, reason: collision with root package name */
    public int f6248V = 1;

    /* renamed from: Y, reason: collision with root package name */
    public int f6251Y = 0;

    /* renamed from: c0, reason: collision with root package name */
    public int f6255c0 = 0;

    /* renamed from: i0, reason: collision with root package name */
    public String f6261i0 = null;

    /* renamed from: j0, reason: collision with root package name */
    public final Handler f6262j0 = new Handler();

    /* renamed from: k0, reason: collision with root package name */
    public final HashMap f6263k0 = new HashMap();

    /* renamed from: l0, reason: collision with root package name */
    public final HashMap f6264l0 = new HashMap();

    /* renamed from: m0, reason: collision with root package name */
    public final HashMap f6265m0 = new HashMap();

    /* renamed from: n0, reason: collision with root package name */
    public final HashMap f6266n0 = new HashMap();

    /* renamed from: o0, reason: collision with root package name */
    public final Handler f6267o0 = new Handler();

    /* renamed from: p0, reason: collision with root package name */
    public final tj f6268p0 = new tj(this);

    /* renamed from: r0, reason: collision with root package name */
    public final uj f6270r0 = new uj(this);

    public final void A() {
        FractionTrackingLink[] c4 = x().getVideoTrackingDetails().c();
        if (c4 != null) {
            for (FractionTrackingLink fractionTrackingLink : c4) {
                List list = (List) this.f6265m0.get(Integer.valueOf(fractionTrackingLink.g()));
                if (list == null) {
                    list = new ArrayList();
                    this.f6265m0.put(Integer.valueOf(fractionTrackingLink.g()), list);
                }
                list.add(fractionTrackingLink);
            }
        }
        AbsoluteTrackingLink[] a3 = x().getVideoTrackingDetails().a();
        if (a3 != null) {
            for (AbsoluteTrackingLink absoluteTrackingLink : a3) {
                List list2 = (List) this.f6266n0.get(Integer.valueOf(absoluteTrackingLink.g()));
                if (list2 == null) {
                    list2 = new ArrayList();
                    this.f6266n0.put(Integer.valueOf(absoluteTrackingLink.g()), list2);
                }
                list2.add(absoluteTrackingLink);
            }
        }
    }

    public final boolean B() {
        return !this.f6252Z ? C() && this.f6245S : this.f6251Y >= AdsCommonMetaData.k().F().j() && C() && this.f6245S;
    }

    public final boolean C() {
        pd pdVar = this.L;
        return (pdVar == null || pdVar.f7444g == null) ? false : true;
    }

    public final boolean D() {
        pd pdVar;
        boolean isSkippable = x().isSkippable();
        Long unskipLess = x().getUnskipLess();
        if (unskipLess == null || (pdVar = this.L) == null || pdVar.f7444g == null) {
            return isSkippable;
        }
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        return isSkippable && timeUnit.toSeconds((long) pdVar.f7445h.getDuration()) > timeUnit.toSeconds(unskipLess.longValue());
    }

    public final boolean E() {
        return this.f7820A > 0 || D() || this.f6249W;
    }

    public final void F() {
        pd pdVar = this.L;
        if (pdVar != null) {
            try {
                boolean z = this.f6244R;
                MediaPlayer mediaPlayer = pdVar.f7444g;
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
        si.a(this.f7830t, true, "videoApi.setSound", this.f6244R ? "OFF" : "ON");
    }

    public final void G() {
        ProgressBar progressBar;
        if (this.L == null) {
            return;
        }
        boolean q4 = AdsCommonMetaData.k().F().q();
        String localVideoPath = x().getLocalVideoPath();
        if (localVideoPath != null) {
            pd pdVar = this.L;
            if (pdVar != null) {
                pdVar.a(localVideoPath);
            }
            if (q4 && localVideoPath.endsWith(".temp")) {
                this.f6252Z = true;
                this.f6254b0 = true;
                this.f6251Y = AdsCommonMetaData.k().F().j();
            }
        } else if (q4) {
            String videoUrl = x().getVideoUrl();
            oe oeVar = ne.f7339a;
            if (videoUrl != null && videoUrl.equals(oeVar.f7397c)) {
                oeVar.f7395a = false;
            }
            pd pdVar2 = this.L;
            if (pdVar2 != null) {
                pdVar2.a(videoUrl);
            }
            this.f6252Z = true;
            if (!this.f6258f0 && ((progressBar = this.f6242P) == null || !progressBar.isShown())) {
                this.f6262j0.postDelayed(new pj(this), AdsCommonMetaData.k().F().h());
            }
        } else {
            a(VideoMode$VideoFinishedReason.SKIPPED);
        }
        if (this.f6261i0 == null) {
            this.f6261i0 = this.f6252Z ? "2" : "1";
        }
    }

    public final void H() {
        VideoView videoView;
        sd sdVar;
        this.f6253a0 = true;
        if (this.f6258f0) {
            pd pdVar = this.L;
            if (pdVar != null) {
                pdVar.f7445h.pause();
                return;
            }
            return;
        }
        boolean z = u() == 0;
        if (z) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            si.a(this.f7830t, true, "videoApi.setVideoDuration", Long.valueOf(timeUnit.toSeconds(v())));
            si.a(this.f7830t, true, "videoApi.setVideoRemainingTimer", 0);
            si.a(this.f7830t, true, "videoApi.setSkipTimer", Long.valueOf(timeUnit.toSeconds(w())));
            si.a(this.f7830t, true, "videoApi.setVideoCurrentPosition", Long.valueOf(timeUnit.toSeconds(u())));
        }
        if (this.L != null) {
            if (z) {
                a((ImageButton) null);
            }
            pd pdVar2 = this.L;
            if (pdVar2 != null) {
                pdVar2.f7445h.start();
                this.f7830t.setBackgroundColor(33554431);
            }
            int v = v();
            if (z && v > 0 && (sdVar = this.f7823D) != null) {
                float f4 = v;
                float f5 = this.f6244R ? 0.0f : 1.0f;
                G2.b bVar = sdVar.f7566c;
                if (bVar != null) {
                    i iVar = bVar.f842a;
                    if (f4 <= 0.0f) {
                        throw new IllegalArgumentException("Invalid Media duration");
                    }
                    if (f5 < 0.0f || f5 > 1.0f) {
                        throw new IllegalArgumentException("Invalid Media volume");
                    }
                    V3.b.a(iVar);
                    JSONObject jSONObject = new JSONObject();
                    N2.b.b(jSONObject, "duration", Float.valueOf(f4));
                    N2.b.b(jSONObject, "mediaPlayerVolume", Float.valueOf(f5));
                    N2.b.b(jSONObject, "deviceVolume", Float.valueOf(j.b().f1187a));
                    iVar.f785e.d("start", jSONObject);
                }
            }
            I();
            if (this.f6253a0 && (videoView = this.f6239M) != null) {
                a(videoView);
            }
        }
        this.f7659b.f6345b.setVisibility(0);
        F();
    }

    public final void I() {
        ProgressBar progressBar;
        this.f6262j0.removeCallbacksAndMessages(null);
        ProgressBar progressBar2 = this.f6242P;
        if (progressBar2 == null || !progressBar2.isShown() || (progressBar = this.f6242P) == null) {
            return;
        }
        progressBar.setVisibility(8);
    }

    @Override // com.startapp.sdk.internal.wa, com.startapp.sdk.internal.u7
    public final void a(Bundle bundle) {
        super.a(bundle);
        try {
            int i4 = AdsCommonMetaData.k().F().i();
            if (i4 > 0) {
                this.f6256d0 = 100 / i4;
            } else {
                this.f6256d0 = 0;
            }
            y();
            A();
            this.f6244R = x().isVideoMuted() || AdsCommonMetaData.k().F().m().equals("muted");
        } catch (Throwable th) {
            d9.a(th);
            Intent intent = new Intent("com.startapp.android.ShowFailedDisplayBroadcastListener");
            intent.putExtra("showFailedReason", NotDisplayedReason.VIDEO_ERROR);
            wb.a(this.f7658a).a(intent);
            this.f6247U = true;
            b();
        }
    }

    @Override // com.startapp.sdk.internal.wa, com.startapp.sdk.internal.u7
    public final void b() {
        String localVideoPath;
        super.b();
        if (this.f6254b0 && (localVideoPath = x().getLocalVideoPath()) != null && localVideoPath.endsWith(".temp")) {
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
        long j4;
        if (this.f6258f0) {
            i();
            return false;
        }
        if (this.L == null) {
            return false;
        }
        int u4 = u();
        if (!this.f6249W && this.f7820A <= 0) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            j4 = timeUnit.toSeconds(w()) - timeUnit.toSeconds(u4);
        }
        j4 = 0;
        if (!E() || j4 != 0) {
            if (!x().isCloseable() && !this.f6250X) {
                return true;
            }
            i();
            return false;
        }
        ProgressBar progressBar = this.f6242P;
        if (progressBar != null && progressBar.isShown()) {
            I();
        }
        a(VideoMode$VideoFinishedReason.SKIPPED);
        a(this.f6259g0, new VideoTrackingParams(a(this.f6259g0), this.f7820A, this.n, this.f6261i0), "skipped", x().getVideoTrackingDetails().p());
        return true;
    }

    @Override // com.startapp.sdk.internal.wa, com.startapp.sdk.internal.u7
    public final void f() {
        G2.b bVar;
        if (!this.f6258f0 && !this.f7658a.isFinishing() && !this.f6250X && !this.f6249W) {
            VideoPausedTrackingParams.PauseOrigin pauseOrigin = VideoPausedTrackingParams.PauseOrigin.EXTERNAL;
            pd pdVar = this.L;
            if (pdVar != null) {
                pdVar.f7445h.pause();
                sd sdVar = this.f7823D;
                if (sdVar != null && (bVar = sdVar.f7566c) != null) {
                    i iVar = bVar.f842a;
                    V3.b.a(iVar);
                    iVar.f785e.d("pause", null);
                }
            }
            a(this.f6259g0, new VideoPausedTrackingParams(this.n, a(this.f6259g0), this.f7820A, this.f6248V, pauseOrigin, this.f6261i0), "paused", x().getVideoTrackingDetails().j());
        }
        pd pdVar2 = this.L;
        if (pdVar2 != null) {
            MediaPlayer mediaPlayer = pdVar2.f7444g;
            if (mediaPlayer != null) {
                mediaPlayer.setOnSeekCompleteListener(null);
                pdVar2.f7444g = null;
            }
            ne.f7339a.f7396b = null;
            this.L = null;
        }
        I();
        if (this.f6269q0) {
            this.f7658a.unregisterReceiver(this.f6270r0);
            this.f6269q0 = false;
        }
        this.f6267o0.removeCallbacksAndMessages(null);
        super.f();
    }

    @Override // com.startapp.sdk.internal.wa, com.startapp.sdk.internal.u7
    public final void g() {
        super.g();
        if (this.f7658a.isFinishing()) {
            return;
        }
        this.f7658a.registerReceiver(this.f6270r0, new IntentFilter("android.media.RINGER_MODE_CHANGED"));
        this.f6269q0 = true;
        if (this.f6239M == null) {
            Context a3 = w0.a(this.f7658a);
            if (a3 == null) {
                a3 = this.f7658a;
            }
            this.f6241O = (RelativeLayout) this.f7658a.findViewById(h0.f7042h);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            VideoView videoView = new VideoView(a3);
            this.f6239M = videoView;
            videoView.setId(f6237s0);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams2.addRule(13);
            ProgressBar progressBar = new ProgressBar(a3, null, android.R.attr.progressBarStyleInverse);
            this.f6242P = progressBar;
            progressBar.setVisibility(4);
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams3.addRule(14);
            layoutParams3.addRule(15);
            RelativeLayout relativeLayout = new RelativeLayout(a3);
            this.f6240N = relativeLayout;
            relativeLayout.setId(h0.f7045k);
            this.f7658a.setContentView(this.f6240N);
            this.f6240N.addView(this.f6239M, layoutParams2);
            this.f6240N.addView(this.f6241O, layoutParams);
            this.f6240N.addView(this.f6242P, layoutParams3);
            if (h0.f7041g.booleanValue()) {
                RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams4.addRule(12);
                layoutParams4.addRule(14);
                RelativeLayout relativeLayout2 = this.f6240N;
                TextView textView = new TextView(a3);
                textView.setBackgroundColor(-16777216);
                textView.setAlpha(0.5f);
                textView.setTextColor(-7829368);
                textView.setSingleLine(false);
                textView.setText("url=" + x().getVideoUrl());
                relativeLayout2.addView(textView, layoutParams4);
            }
            this.f7659b.f6345b.setVisibility(4);
        }
        if (this.L == null) {
            this.L = new pd(this.f6239M);
        }
        this.f6246T = false;
        RelativeLayout relativeLayout3 = this.f6240N;
        if (relativeLayout3 != null) {
            relativeLayout3.setBackgroundColor(-16777216);
        }
        G();
        if (this.f6258f0) {
            this.f7659b.f6345b.setVisibility(0);
            this.f6239M.setVisibility(4);
        }
        pd pdVar = this.L;
        pdVar.f6696e = new vj(this);
        pdVar.f6693b = new wj(this);
        pdVar.f6695d = new b(this);
        xj xjVar = new xj(this);
        pdVar.f6694c = new yj(this);
        pdVar.f6697f = xjVar;
        this.f6239M.addOnLayoutChangeListener(new nj(this));
        this.f6267o0.post(this.f6268p0);
    }

    @Override // com.startapp.sdk.internal.u7
    public final void h() {
        if (this.f6247U) {
            return;
        }
        super.h();
    }

    @Override // com.startapp.sdk.internal.wa
    public final void i() {
        if (this.f6247U) {
            return;
        }
        if (this.f6258f0 || this.f6239M == null) {
            a(this.f6259g0, new VideoTrackingParams(a(this.f6259g0), this.f7820A, this.n, this.f6261i0), "postrollClosed", x().getVideoTrackingDetails().l());
            super.i();
        } else {
            pd pdVar = this.L;
            int currentPosition = pdVar != null ? pdVar.f7445h.getCurrentPosition() : 0;
            a(currentPosition, new VideoTrackingParams(a(currentPosition), this.f7820A, this.n, this.f6261i0), "closed", x().getVideoTrackingDetails().i());
        }
    }

    @Override // com.startapp.sdk.internal.wa
    public final long k() {
        return TimeUnit.MILLISECONDS.toSeconds(u());
    }

    @Override // com.startapp.sdk.internal.wa
    public final cb l() {
        OverlayActivity overlayActivity = this.f7658a;
        la laVar = this.f7827H;
        sj sjVar = new sj(this);
        a aVar = new a(this);
        rj rjVar = new rj(this);
        TrackingParams trackingParams = new TrackingParams(this.n);
        boolean[] zArr = this.f7663f;
        return new lj(overlayActivity, laVar, laVar, sjVar, aVar, rjVar, trackingParams, (zArr == null || zArr.length <= 0) ? true : zArr[0]);
    }

    @Override // com.startapp.sdk.internal.wa
    public final long m() {
        Long l4 = this.o;
        return l4 != null ? TimeUnit.SECONDS.toMillis(l4.longValue()) : TimeUnit.SECONDS.toMillis(MetaData.E().A());
    }

    @Override // com.startapp.sdk.internal.wa
    public final TrackingParams n() {
        return new VideoTrackingParams(0, this.f7820A, this.n, this.f6261i0);
    }

    @Override // com.startapp.sdk.internal.wa
    public final boolean o() {
        return this.f7668k.getType() == Ad.AdType.REWARDED_VIDEO;
    }

    @Override // com.startapp.sdk.internal.wa, android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.f6243Q < x().getPostRollHtmlNum()) {
            z();
            return;
        }
        la laVar = this.f7827H;
        laVar.f7214a.i();
        laVar.f7214a.b();
    }

    @Override // com.startapp.sdk.internal.wa
    public final void p() {
    }

    @Override // com.startapp.sdk.internal.wa
    public final void q() {
        this.f6245S = true;
        if (this.f6258f0) {
            a((View) this.f7830t);
            z();
            return;
        }
        si.a(this.f7830t, true, "videoApi.setClickableVideo", Boolean.valueOf(x().isClickable()));
        si.a(this.f7830t, true, "videoApi.setMode", "PLAYER");
        si.a(this.f7830t, true, "videoApi.setCloseable", Boolean.valueOf(x().isCloseable() || this.f6250X));
        si.a(this.f7830t, true, "videoApi.setSkippable", Boolean.valueOf(E()));
        if (B()) {
            H();
        }
    }

    @Override // com.startapp.sdk.internal.wa
    public final void r() {
        int l4 = AdsCommonMetaData.k().F().l();
        ActionTrackingLink[] o = x().getVideoTrackingDetails().o();
        a((v() * l4) / 100, new VideoTrackingParams(l4, this.f7820A, this.n, this.f6261i0), "rewarded", o);
    }

    public final int u() {
        pd pdVar = this.L;
        if (pdVar == null) {
            return this.f6259g0;
        }
        int currentPosition = pdVar.f7445h.getCurrentPosition();
        if (currentPosition > this.f6259g0) {
            this.f6259g0 = currentPosition;
        }
        return this.f6259g0;
    }

    public final int v() {
        pd pdVar = this.L;
        if (pdVar != null) {
            return pdVar.f7445h.getDuration();
        }
        return -1;
    }

    public final long w() {
        long skippableAfter = x().getSkippableAfter();
        pd pdVar = this.L;
        return (pdVar == null || pdVar.f7444g == null) ? skippableAfter : Math.min(skippableAfter, pdVar.f7445h.getDuration());
    }

    public final VideoAdDetails x() {
        return ((ij) this.f7668k).f7113r;
    }

    public final void y() {
        if (this.f7664g.equals("back")) {
            if (AdsCommonMetaData.k().F().a().equals(VideoConfig.BackMode.BOTH)) {
                this.f6249W = true;
                this.f6250X = true;
                return;
            }
            if (AdsCommonMetaData.k().F().a().equals(VideoConfig.BackMode.SKIP)) {
                this.f6249W = true;
                this.f6250X = false;
            } else if (AdsCommonMetaData.k().F().a().equals(VideoConfig.BackMode.CLOSE)) {
                this.f6249W = false;
                this.f6250X = true;
            } else if (AdsCommonMetaData.k().F().a().equals(VideoConfig.BackMode.DISABLED)) {
                this.f6249W = false;
                this.f6250X = false;
            } else {
                this.f6249W = false;
                this.f6250X = false;
            }
        }
    }

    public final void z() {
        String postRollHtml = x().getPostRollHtml(this.f6243Q);
        if (postRollHtml != null) {
            this.f6267o0.post(new n(14, this));
            this.f7830t.setWebViewClient(new zj(this));
            si.a(this.f7830t, postRollHtml);
            Log.println(2, "StartAppSDK", "Post-roll start rendering the ad content");
            this.f6243Q++;
            return;
        }
        si.a(this.f7830t, true, "videoApi.setReplayEnabled", Boolean.valueOf(this.L != null));
        si.a(this.f7830t, true, "videoApi.setMode", VideoMode$HtmlMode.POST_ROLL + "_" + x().getPostRollType());
        this.f6267o0.postDelayed(new qj(this), AdsCommonMetaData.k().F().b() * 1000);
    }

    public final void b(int i4) {
        List list;
        G2.b bVar;
        if (!this.f6257e0 && this.f7820A <= 0 && i4 != 0) {
            this.f6257e0 = true;
            xf xfVar = this.f7833x;
            if (xfVar != null) {
                xfVar.c();
            }
            a(0, new VideoTrackingParams(0, this.f7820A, this.n, this.f6261i0), "impression", x().getVideoTrackingDetails().d());
            a(0, new VideoTrackingParams(0, this.f7820A, this.n, this.f6261i0), "creativeView", x().getVideoTrackingDetails().b());
            sd sdVar = this.f7823D;
            if (sdVar != null) {
                sdVar.a();
            }
        }
        for (Integer num : this.f6265m0.keySet()) {
            int intValue = num.intValue();
            if (i4 > 0 && i4 >= (v() * intValue) / 100 && this.f6263k0.get(num) == null) {
                if (this.f6265m0.containsKey(num)) {
                    List list2 = (List) this.f6265m0.get(num);
                    if (list2 != null) {
                        a((v() * intValue) / 100, new VideoProgressTrackingParams(intValue, this.f7820A, this.n, this.f6261i0), "fraction", (VideoTrackingLink[]) list2.toArray(new FractionTrackingLink[0]));
                    }
                    sd sdVar2 = this.f7823D;
                    if (sdVar2 != null) {
                        if (intValue == 25) {
                            G2.b bVar2 = sdVar2.f7566c;
                            if (bVar2 != null) {
                                i iVar = bVar2.f842a;
                                V3.b.a(iVar);
                                iVar.f785e.d("firstQuartile", null);
                            }
                        } else if (intValue == 50) {
                            G2.b bVar3 = sdVar2.f7566c;
                            if (bVar3 != null) {
                                i iVar2 = bVar3.f842a;
                                V3.b.a(iVar2);
                                iVar2.f785e.d("midpoint", null);
                            }
                        } else if (intValue == 75 && (bVar = sdVar2.f7566c) != null) {
                            i iVar3 = bVar.f842a;
                            V3.b.a(iVar3);
                            iVar3.f785e.d("thirdQuartile", null);
                        }
                    }
                }
                this.f6263k0.put(num, Boolean.TRUE);
            }
        }
        for (Integer num2 : this.f6266n0.keySet()) {
            int intValue2 = num2.intValue();
            if (i4 > 0 && i4 >= intValue2 && this.f6264l0.get(num2) == null) {
                if (this.f6266n0.containsKey(num2) && (list = (List) this.f6266n0.get(num2)) != null) {
                    a(intValue2, new VideoProgressTrackingParams(intValue2, this.f7820A, this.n, this.f6261i0), "absolute", (VideoTrackingLink[]) list.toArray(new AbsoluteTrackingLink[0]));
                }
                this.f6264l0.put(num2, Boolean.TRUE);
            }
        }
        if (i4 >= (v() * AdsCommonMetaData.k().F().l()) / 100) {
            s();
        }
        if (this.f6252Z) {
            if (i4 >= (v() * AdsCommonMetaData.k().F().l()) / 100) {
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
        VideoAdDetails x4;
        List<VerificationDetails> adVerifications;
        X x5;
        if (!MetaData.E().j0() || (x4 = x()) == null || (adVerifications = x4.getAdVerifications()) == null) {
            return;
        }
        sd sdVar = new sd(this.f7830t.getContext(), adVerifications, true);
        this.f7823D = sdVar;
        F2.b bVar = sdVar.f7564a;
        if (bVar != null) {
            try {
                AdInformationView adInformationView = this.f7659b.f6345b;
                e eVar = e.f769c;
                if (adInformationView != null) {
                    bVar.a(adInformationView, eVar);
                }
                if (imageButton != null) {
                    sd sdVar2 = this.f7823D;
                    e eVar2 = e.f768b;
                    F2.b bVar2 = sdVar2.f7564a;
                    if (bVar2 != null) {
                        bVar2.a(imageButton, eVar2);
                    }
                }
                sd sdVar3 = this.f7823D;
                WebView webView = this.f7830t;
                e eVar3 = e.f767a;
                F2.b bVar3 = sdVar3.f7564a;
                if (bVar3 != null) {
                    bVar3.a(webView, eVar3);
                }
                sd sdVar4 = this.f7823D;
                RelativeLayout relativeLayout = this.f6241O;
                F2.b bVar4 = sdVar4.f7564a;
                if (bVar4 != null) {
                    bVar4.a(relativeLayout, eVar);
                }
            } catch (RuntimeException unused) {
            }
            sd sdVar5 = this.f7823D;
            VideoView videoView = this.f6239M;
            F2.b bVar5 = sdVar5.f7564a;
            if (bVar5 != null) {
                bVar5.d(videoView);
            }
            F2.b bVar6 = this.f7823D.f7564a;
            if (bVar6 != null) {
                bVar6.e();
            }
            sd sdVar6 = this.f7823D;
            boolean E4 = E();
            long w4 = D() ? w() : 0L;
            if (sdVar6.f7565b == null || !sdVar6.f7568e.compareAndSet(false, true)) {
                return;
            }
            if (E4) {
                x5 = new X(true, Float.valueOf(w4));
            } else {
                x5 = new X(false, null);
            }
            F2.a aVar = sdVar6.f7565b;
            aVar.getClass();
            i iVar = aVar.f755a;
            V3.b.a(iVar);
            iVar.f782b.getClass();
            boolean z = x5.f555a;
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("skippable", z);
                if (z) {
                    jSONObject.put("skipOffset", (Float) x5.f556b);
                }
                jSONObject.put("autoPlay", true);
                jSONObject.put("position", G2.c.STANDALONE);
            } catch (JSONException unused2) {
            }
            if (!iVar.f790j) {
                M2.a aVar2 = iVar.f785e;
                J2.i.f1185a.a(aVar2.g(), "publishLoadedEvent", jSONObject, aVar2.f1749a);
                iVar.f790j = true;
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
        si.a(this.f7830t, true, "videoApi.setVideoFrame", Integer.valueOf(ii.b(this.f7658a, view.getLeft())), Integer.valueOf(ii.b(this.f7658a, view.getTop())), Integer.valueOf(ii.b(this.f7658a, view.getWidth())), Integer.valueOf(ii.b(this.f7658a, view.getHeight())));
    }

    public final void a(VideoMode$VideoFinishedReason videoMode$VideoFinishedReason) {
        G2.b bVar;
        sd sdVar;
        G2.b bVar2;
        VideoMode$VideoFinishedReason videoMode$VideoFinishedReason2 = VideoMode$VideoFinishedReason.SKIPPED;
        if (videoMode$VideoFinishedReason == videoMode$VideoFinishedReason2 && (sdVar = this.f7823D) != null && (bVar2 = sdVar.f7566c) != null) {
            i iVar = bVar2.f842a;
            V3.b.a(iVar);
            iVar.f785e.d("skipped", null);
        }
        VideoMode$VideoFinishedReason videoMode$VideoFinishedReason3 = VideoMode$VideoFinishedReason.COMPLETE;
        if (videoMode$VideoFinishedReason == videoMode$VideoFinishedReason3) {
            int v = v();
            this.f6259g0 = v;
            b(v);
            s();
            sd sdVar2 = this.f7823D;
            if (sdVar2 != null && (bVar = sdVar2.f7566c) != null) {
                i iVar2 = bVar.f842a;
                V3.b.a(iVar2);
                iVar2.f785e.d("complete", null);
            }
        } else {
            pd pdVar = this.L;
            if (pdVar != null) {
                pdVar.f7445h.pause();
            }
        }
        if (videoMode$VideoFinishedReason == videoMode$VideoFinishedReason3 || videoMode$VideoFinishedReason == videoMode$VideoFinishedReason2) {
            if (x().hasPostRoll()) {
                z();
                this.f7659b.f6345b.setVisibility(0);
            } else {
                b();
            }
            this.f6258f0 = true;
            if (x().hasPostRoll()) {
                a(this.f6259g0, new VideoTrackingParams(a(this.f6259g0), this.f7820A, this.n, this.f6261i0), "postrollImression", x().getVideoTrackingDetails().m());
            }
        }
    }

    public final void a(ak akVar) {
        VASTErrorCodes vASTErrorCodes;
        d9 d9Var = new d9(e9.f6839e);
        d9Var.f6792d = "Video player error: " + akVar.f6688a;
        d9Var.f6793e = akVar.f6689b;
        d9Var.f6795g = a();
        d9Var.a();
        int ordinal = akVar.f6688a.ordinal();
        if (ordinal == 1) {
            vASTErrorCodes = VASTErrorCodes.GeneralLinearError;
        } else if (ordinal == 2) {
            vASTErrorCodes = VASTErrorCodes.TimeoutMediaFileURI;
        } else if (ordinal != 3) {
            vASTErrorCodes = VASTErrorCodes.UndefinedError;
        } else {
            vASTErrorCodes = VASTErrorCodes.MediaFileDisplayError;
        }
        kj kjVar = new kj(this.f6259g0, new VideoTrackingParams(a(this.f6259g0), this.f7820A, this.n, this.f6261i0), x().getVideoUrl(), x().getVideoTrackingDetails().e());
        kjVar.f7198e = vASTErrorCodes;
        ek.a(this.f7658a, kjVar.a());
        if (u() == 0) {
            g0.a(this.f7665h, this.n, this.f7820A, "VIDEO_ERROR", (JSONObject) null);
            if (!this.f6252Z) {
                sf sfVar = (sf) com.startapp.sdk.components.a.a(this.f7658a).f6547G.a();
                int i4 = sfVar.getInt("videoErrorsCount", 0);
                rf edit = sfVar.edit();
                int i5 = i4 + 1;
                edit.a("videoErrorsCount", Integer.valueOf(i5));
                edit.f7532a.putInt("videoErrorsCount", i5);
                edit.apply();
            } else if (!akVar.f6688a.equals(VideoPlayerInterface$VideoPlayerErrorType.BUFFERING_TIMEOUT)) {
                sf sfVar2 = (sf) com.startapp.sdk.components.a.a(this.f7658a).f6547G.a();
                int i6 = sfVar2.getInt("videoErrorsCount", 0);
                rf edit2 = sfVar2.edit();
                int i7 = i6 + 1;
                edit2.a("videoErrorsCount", Integer.valueOf(i7));
                edit2.f7532a.putInt("videoErrorsCount", i7);
                edit2.apply();
            }
        }
        if ((o() && !this.z) || !x().hasPostRoll()) {
            Intent intent = new Intent("com.startapp.android.ShowFailedDisplayBroadcastListener");
            intent.putExtra("showFailedReason", NotDisplayedReason.VIDEO_ERROR);
            wb.a(this.f7658a).a(intent);
            this.f6247U = true;
            b();
            return;
        }
        a(VideoMode$VideoFinishedReason.SKIPPED);
    }

    public final int a(int i4) {
        int v = v();
        if (v > 0) {
            return (i4 * 100) / v;
        }
        return 0;
    }

    @Override // com.startapp.sdk.internal.wa
    public final void a(String str) {
        if (str.equals("vastClick")) {
            String postRollClickThroughUrl = this.f6258f0 ? x().getPostRollClickThroughUrl() : null;
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
        ActionTrackingLink[] h2;
        G2.b bVar;
        String postRollClickThroughUrl = this.f6258f0 ? x().getPostRollClickThroughUrl() : null;
        if (postRollClickThroughUrl == null) {
            postRollClickThroughUrl = x().getClickUrl();
        }
        if (!TextUtils.isEmpty(postRollClickThroughUrl)) {
            z = true;
            str = postRollClickThroughUrl;
        }
        if (!this.f6258f0) {
            a(VideoMode$VideoFinishedReason.CLICKED);
        }
        boolean z4 = this.f6258f0;
        if (z4) {
            h2 = x().getVideoTrackingDetails().k();
        } else {
            h2 = x().getVideoTrackingDetails().h();
        }
        a(this.f6259g0, new VideoClickedTrackingParams(this.n, a(this.f6259g0), this.f7820A, z4, this.f6261i0), "clicked", h2);
        sd sdVar = this.f7823D;
        if (sdVar != null && (bVar = sdVar.f7566c) != null) {
            i iVar = bVar.f842a;
            V3.b.a(iVar);
            JSONObject jSONObject = new JSONObject();
            N2.b.b(jSONObject, "interactionType", G2.a.CLICK);
            iVar.f785e.d("adUserInteraction", jSONObject);
        }
        return super.a(str, z);
    }

    public final void a(boolean z) {
        ActionTrackingLink[] g4;
        if (this.L == null) {
            return;
        }
        if (z) {
            g4 = x().getVideoTrackingDetails().f();
        } else {
            g4 = x().getVideoTrackingDetails().g();
        }
        a(this.L.f7445h.getCurrentPosition(), new VideoTrackingParams(a(this.L.f7445h.getCurrentPosition()), this.f7820A, this.n, this.f6261i0), "sound", g4);
        sd sdVar = this.f7823D;
        if (sdVar != null) {
            float f4 = z ? 0.0f : 1.0f;
            G2.b bVar = sdVar.f7566c;
            if (bVar != null) {
                if (f4 >= 0.0f && f4 <= 1.0f) {
                    i iVar = bVar.f842a;
                    V3.b.a(iVar);
                    JSONObject jSONObject = new JSONObject();
                    N2.b.b(jSONObject, "mediaPlayerVolume", Float.valueOf(f4));
                    N2.b.b(jSONObject, "deviceVolume", Float.valueOf(j.b().f1187a));
                    iVar.f785e.d("volumeChange", jSONObject);
                    return;
                }
                throw new IllegalArgumentException("Invalid Media volume");
            }
        }
    }

    public final void a(int i4, VideoTrackingParams videoTrackingParams, String str, VideoTrackingLink[] videoTrackingLinkArr) {
        ek.a(this.f7658a, new kj(i4, videoTrackingParams, x().getVideoUrl(), videoTrackingLinkArr).a());
    }
}
