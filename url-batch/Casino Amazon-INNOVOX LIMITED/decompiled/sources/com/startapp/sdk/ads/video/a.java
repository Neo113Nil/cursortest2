package com.startapp.sdk.ads.video;

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
import androidx.core.view.ViewCompat;
import com.iab.omid.library.startio.adsession.AdSession;
import com.iab.omid.library.startio.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.startio.adsession.media.InteractionType;
import com.iab.omid.library.startio.adsession.media.MediaEvents;
import com.iab.omid.library.startio.adsession.media.Position;
import com.iab.omid.library.startio.adsession.media.VastProperties;
import com.startapp.sdk.ads.interstitials.OverlayActivity;
import com.startapp.sdk.ads.video.tracking.AbsoluteTrackingLink;
import com.startapp.sdk.ads.video.tracking.ActionTrackingLink;
import com.startapp.sdk.ads.video.tracking.FractionTrackingLink;
import com.startapp.sdk.ads.video.tracking.VideoClickedTrackingParams;
import com.startapp.sdk.ads.video.tracking.VideoPausedTrackingParams;
import com.startapp.sdk.ads.video.tracking.VideoProgressTrackingParams;
import com.startapp.sdk.ads.video.tracking.VideoTrackingLink;
import com.startapp.sdk.ads.video.tracking.VideoTrackingParams;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.VideoConfig;
import com.startapp.sdk.adsbase.adinformation.AdInformationView;
import com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason;
import com.startapp.sdk.adsbase.commontracking.TrackingParams;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.internal.af;
import com.startapp.sdk.internal.aj;
import com.startapp.sdk.internal.bj;
import com.startapp.sdk.internal.cj;
import com.startapp.sdk.internal.da;
import com.startapp.sdk.internal.db;
import com.startapp.sdk.internal.dj;
import com.startapp.sdk.internal.ed;
import com.startapp.sdk.internal.ej;
import com.startapp.sdk.internal.f0;
import com.startapp.sdk.internal.ff;
import com.startapp.sdk.internal.fj;
import com.startapp.sdk.internal.gj;
import com.startapp.sdk.internal.hj;
import com.startapp.sdk.internal.ja;
import com.startapp.sdk.internal.n8;
import com.startapp.sdk.internal.nh;
import com.startapp.sdk.internal.ni;
import com.startapp.sdk.internal.oi;
import com.startapp.sdk.internal.ph;
import com.startapp.sdk.internal.pi;
import com.startapp.sdk.internal.qi;
import com.startapp.sdk.internal.ri;
import com.startapp.sdk.internal.s9;
import com.startapp.sdk.internal.t0;
import com.startapp.sdk.internal.ti;
import com.startapp.sdk.internal.vi;
import com.startapp.sdk.internal.wi;
import com.startapp.sdk.internal.xc;
import com.startapp.sdk.internal.xi;
import com.startapp.sdk.internal.yi;
import com.startapp.sdk.internal.ze;
import com.startapp.sdk.internal.zh;
import com.startapp.sdk.internal.zi;
import com.startapp.sdk.omsdk.VerificationDetails;
import com.startapp.startappsdk.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class a extends da {
    public static final int m0 = R.id.io_start_video_view;
    public long K;
    public xc L;
    public VideoView M;
    public RelativeLayout N;
    public RelativeLayout O;
    public ProgressBar P;
    public int Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public boolean U;
    public int V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public boolean Z;
    public boolean a0;
    public int b0;
    public long c0;
    public final Handler d0;
    public final HashMap e0;
    public final HashMap f0;
    public final HashMap g0;
    public final HashMap h0;
    public final Handler i0;
    public final zi j0;
    public boolean k0;
    public final aj l0;

    public a(Ad ad) {
        super(ad);
        this.Q = 0;
        this.V = 1;
        this.d0 = new Handler();
        this.e0 = new HashMap();
        this.f0 = new HashMap();
        this.g0 = new HashMap();
        this.h0 = new HashMap();
        this.i0 = new Handler();
        this.j0 = new zi(this);
        this.l0 = new aj(this);
    }

    public static void a(Context context, qi qiVar) {
        if (context == null || qiVar == null) {
            return;
        }
        ArrayList arrayList = qiVar.f395a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            String str = (String) obj;
            if (str != null && !str.isEmpty()) {
                nh.a(context, str, null);
            }
        }
    }

    public final void A() {
        String postRollHtml = y().getPostRollHtml(this.Q);
        if (postRollHtml == null) {
            zh.a(this.t, true, "videoApi.setReplayEnabled", Boolean.valueOf(this.L != null));
            zh.a(this.t, true, "videoApi.setMode", VideoMode$HtmlMode.POST_ROLL + "_" + y().getPostRollType());
            this.i0.postDelayed(new vi(this), AdsCommonMetaData.k().F().b() * 1000);
        } else {
            this.i0.post(new Runnable() { // from class: com.startapp.sdk.ads.video.a$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    a.a(a.this);
                }
            });
            this.t.setWebViewClient(new gj(this));
            zh.a(this.t, postRollHtml);
            Log.println(2, "StartAppSDK", "Post-roll start rendering the ad content");
            this.Q++;
        }
    }

    public final void B() {
        FractionTrackingLink[] c = y().getVideoTrackingDetails().c();
        if (c != null) {
            for (FractionTrackingLink fractionTrackingLink : c) {
                List list = (List) this.g0.get(Integer.valueOf(fractionTrackingLink.g()));
                if (list == null) {
                    list = new ArrayList();
                    this.g0.put(Integer.valueOf(fractionTrackingLink.g()), list);
                }
                list.add(fractionTrackingLink);
            }
        }
        AbsoluteTrackingLink[] a2 = y().getVideoTrackingDetails().a();
        if (a2 != null) {
            for (AbsoluteTrackingLink absoluteTrackingLink : a2) {
                List list2 = (List) this.h0.get(Integer.valueOf(absoluteTrackingLink.g()));
                if (list2 == null) {
                    list2 = new ArrayList();
                    this.h0.put(Integer.valueOf(absoluteTrackingLink.g()), list2);
                }
                list2.add(absoluteTrackingLink);
            }
        }
    }

    public final boolean C() {
        xc xcVar;
        boolean isSkippable = y().isSkippable();
        Long unskipLess = y().getUnskipLess();
        if (unskipLess == null || (xcVar = this.L) == null || xcVar.g == null) {
            return isSkippable;
        }
        return isSkippable && ((long) xcVar.h.getDuration()) / 1000 > unskipLess.longValue() / 1000;
    }

    public final boolean D() {
        return this.A > 0 || C() || this.W;
    }

    public final void E() {
        xc xcVar = this.L;
        if (xcVar != null) {
            try {
                boolean z = this.R;
                MediaPlayer mediaPlayer = xcVar.g;
                if (mediaPlayer != null) {
                    if (z) {
                        mediaPlayer.setVolume(0.0f, 0.0f);
                    } else {
                        mediaPlayer.setVolume(1.0f, 1.0f);
                    }
                }
            } catch (Throwable th) {
                n8.a(th);
            }
        }
        zh.a(this.t, true, "videoApi.setSound", this.R ? "OFF" : "ON");
    }

    public final void F() {
        VideoView videoView;
        ProgressBar progressBar;
        ed edVar;
        this.Y = true;
        if (this.a0) {
            xc xcVar = this.L;
            if (xcVar != null) {
                xcVar.h.pause();
                return;
            }
            return;
        }
        boolean z = v() == 0;
        if (z) {
            zh.a(this.t, true, "videoApi.setVideoDuration", Long.valueOf(w() / 1000));
            zh.a(this.t, true, "videoApi.setVideoRemainingTimer", 0);
            zh.a(this.t, true, "videoApi.setSkipTimer", Long.valueOf(x() / 1000));
            zh.a(this.t, true, "videoApi.setVideoCurrentPosition", Long.valueOf(v() / 1000));
        }
        if (this.L != null) {
            if (z) {
                a((ImageButton) null);
            }
            xc xcVar2 = this.L;
            if (xcVar2 != null) {
                xcVar2.h.start();
                this.t.setBackgroundColor(33554431);
            }
            int w = w();
            if (z && w > 0 && (edVar = this.D) != null) {
                float f = this.R ? 0.0f : 1.0f;
                MediaEvents mediaEvents = edVar.c;
                if (mediaEvents != null) {
                    mediaEvents.start(w / 1000.0f, f);
                }
            }
            this.d0.removeCallbacksAndMessages(null);
            ProgressBar progressBar2 = this.P;
            if (progressBar2 != null && progressBar2.isShown() && (progressBar = this.P) != null) {
                progressBar.setVisibility(8);
            }
            if (this.Y && (videoView = this.M) != null) {
                zh.a(this.t, true, "videoApi.setVideoFrame", Integer.valueOf(ph.b(this.f248a, videoView.getLeft())), Integer.valueOf(ph.b(this.f248a, videoView.getTop())), Integer.valueOf(ph.b(this.f248a, videoView.getWidth())), Integer.valueOf(ph.b(this.f248a, videoView.getHeight())));
            }
        }
        this.b.b.setVisibility(0);
        E();
    }

    public final void b(int i) {
        xc xcVar;
        xc xcVar2 = this.L;
        if ((xcVar2 != null ? xcVar2.h.getDuration() : 0) <= 0 || (xcVar = this.L) == null || xcVar.g == null || !this.S) {
            return;
        }
        F();
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
    
        if (r5 <= 0) goto L17;
     */
    @Override // com.startapp.sdk.internal.da, com.startapp.sdk.internal.g7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c() {
        long j;
        ProgressBar progressBar;
        if (this.a0) {
            i();
            return false;
        }
        if (this.L == null) {
            return false;
        }
        int v = v();
        if (!this.W && this.A <= 0) {
            j = (x() / 1000) - (v / 1000);
        }
        j = 0;
        if (!D() || j != 0) {
            if (!y().isCloseable() && !this.X) {
                return true;
            }
            i();
            return false;
        }
        ProgressBar progressBar2 = this.P;
        if (progressBar2 != null && progressBar2.isShown()) {
            this.d0.removeCallbacksAndMessages(null);
            ProgressBar progressBar3 = this.P;
            if (progressBar3 != null && progressBar3.isShown() && (progressBar = this.P) != null) {
                progressBar.setVisibility(8);
            }
        }
        a(VideoMode$VideoFinishedReason.SKIPPED);
        a(this.b0, new VideoTrackingParams(this.n, a(this.b0), this.A), "skipped", y().getVideoTrackingDetails().p());
        return true;
    }

    @Override // com.startapp.sdk.internal.da, com.startapp.sdk.internal.g7
    public final void f() {
        ProgressBar progressBar;
        MediaEvents mediaEvents;
        if (!this.a0 && !this.f248a.isFinishing() && !this.X && !this.W) {
            VideoPausedTrackingParams.PauseOrigin pauseOrigin = VideoPausedTrackingParams.PauseOrigin.EXTERNAL;
            xc xcVar = this.L;
            if (xcVar != null) {
                xcVar.h.pause();
                ed edVar = this.D;
                if (edVar != null && (mediaEvents = edVar.c) != null) {
                    mediaEvents.pause();
                }
            }
            a(this.b0, new VideoPausedTrackingParams(this.n, a(this.b0), this.A, this.V, pauseOrigin), "paused", y().getVideoTrackingDetails().j());
        }
        xc xcVar2 = this.L;
        if (xcVar2 != null) {
            MediaPlayer mediaPlayer = xcVar2.g;
            if (mediaPlayer != null) {
                mediaPlayer.setOnSeekCompleteListener(null);
                xcVar2.g = null;
            }
            this.L = null;
        }
        this.d0.removeCallbacksAndMessages(null);
        ProgressBar progressBar2 = this.P;
        if (progressBar2 != null && progressBar2.isShown() && (progressBar = this.P) != null) {
            progressBar.setVisibility(8);
        }
        if (this.k0) {
            this.f248a.unregisterReceiver(this.l0);
            this.k0 = false;
        }
        this.i0.removeCallbacksAndMessages(null);
        super.f();
    }

    @Override // com.startapp.sdk.internal.da, com.startapp.sdk.internal.g7
    public final void g() {
        super.g();
        if (this.f248a.isFinishing()) {
            return;
        }
        this.f248a.registerReceiver(this.l0, new IntentFilter("android.media.RINGER_MODE_CHANGED"));
        this.k0 = true;
        u();
        this.i0.post(this.j0);
    }

    @Override // com.startapp.sdk.internal.g7
    public final void h() {
        if (this.U) {
            return;
        }
        super.h();
    }

    @Override // com.startapp.sdk.internal.da
    public final void i() {
        if (this.U) {
            return;
        }
        if (this.a0 || this.M == null) {
            a(this.b0, new VideoTrackingParams(this.n, a(this.b0), this.A), "postrollClosed", y().getVideoTrackingDetails().l());
            super.i();
        } else {
            xc xcVar = this.L;
            int currentPosition = xcVar != null ? xcVar.h.getCurrentPosition() : 0;
            a(currentPosition, new VideoTrackingParams(this.n, a(currentPosition), this.A), "closed", y().getVideoTrackingDetails().i());
        }
    }

    @Override // com.startapp.sdk.internal.da
    public final long k() {
        return v() / 1000;
    }

    @Override // com.startapp.sdk.internal.da
    public final ja l() {
        OverlayActivity overlayActivity = this.f248a;
        s9 s9Var = this.H;
        yi yiVar = new yi(this);
        xi xiVar = new xi(this);
        wi wiVar = new wi(this);
        TrackingParams trackingParams = new TrackingParams(this.n);
        boolean[] zArr = this.f;
        return new ti(overlayActivity, s9Var, s9Var, yiVar, xiVar, wiVar, trackingParams, (zArr == null || zArr.length <= 0) ? true : zArr[0]);
    }

    @Override // com.startapp.sdk.internal.da
    public final long m() {
        Long l = this.o;
        return l != null ? TimeUnit.SECONDS.toMillis(l.longValue()) : TimeUnit.SECONDS.toMillis(MetaData.A().x());
    }

    @Override // com.startapp.sdk.internal.da
    public final TrackingParams n() {
        return new VideoTrackingParams(this.n, 0, this.A);
    }

    @Override // com.startapp.sdk.internal.da
    public final boolean o() {
        return this.k.getType() == Ad.AdType.REWARDED_VIDEO;
    }

    @Override // com.startapp.sdk.internal.da, android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.Q < y().getPostRollHtmlNum()) {
            A();
            return;
        }
        s9 s9Var = this.H;
        s9Var.f419a.i();
        s9Var.f419a.b();
    }

    @Override // com.startapp.sdk.internal.da
    public final void p() {
    }

    @Override // com.startapp.sdk.internal.da
    public final void q() {
        this.S = true;
        if (this.a0) {
            WebView webView = this.t;
            zh.a(this.t, true, "videoApi.setVideoFrame", Integer.valueOf(ph.b(this.f248a, webView.getLeft())), Integer.valueOf(ph.b(this.f248a, webView.getTop())), Integer.valueOf(ph.b(this.f248a, webView.getWidth())), Integer.valueOf(ph.b(this.f248a, webView.getHeight())));
            A();
            return;
        }
        zh.a(this.t, true, "videoApi.setClickableVideo", Boolean.valueOf(y().isClickable()));
        zh.a(this.t, true, "videoApi.setMode", "PLAYER");
        zh.a(this.t, true, "videoApi.setCloseable", Boolean.valueOf(y().isCloseable() || this.X));
        zh.a(this.t, true, "videoApi.setSkippable", Boolean.valueOf(D()));
        xc xcVar = this.L;
        if (xcVar == null || xcVar.g == null || !this.S) {
            return;
        }
        F();
    }

    @Override // com.startapp.sdk.internal.da
    public final void r() {
        int n = AdsCommonMetaData.k().F().n();
        ActionTrackingLink[] o = y().getVideoTrackingDetails().o();
        a((w() * n) / 100, new VideoTrackingParams(this.n, n, this.A), "rewarded", o);
    }

    public final void u() {
        if (this.M == null) {
            Context a2 = t0.a(this.f248a);
            if (a2 == null) {
                a2 = this.f248a;
            }
            this.O = (RelativeLayout) this.f248a.findViewById(f0.h);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            VideoView videoView = new VideoView(a2);
            this.M = videoView;
            videoView.setId(m0);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams2.addRule(13);
            ProgressBar progressBar = new ProgressBar(a2, null, android.R.attr.progressBarStyleInverse);
            this.P = progressBar;
            progressBar.setVisibility(4);
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams3.addRule(14);
            layoutParams3.addRule(15);
            RelativeLayout relativeLayout = new RelativeLayout(a2);
            this.N = relativeLayout;
            relativeLayout.setId(f0.k);
            this.f248a.setContentView(this.N);
            this.N.addView(this.M, layoutParams2);
            this.N.addView(this.O, layoutParams);
            this.N.addView(this.P, layoutParams3);
            if (f0.g.booleanValue()) {
                RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams4.addRule(12);
                layoutParams4.addRule(14);
                RelativeLayout relativeLayout2 = this.N;
                TextView textView = new TextView(a2);
                textView.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
                textView.setAlpha(0.5f);
                textView.setTextColor(-7829368);
                textView.setSingleLine(false);
                textView.setText("url=" + y().getVideoUrl());
                relativeLayout2.addView(textView, layoutParams4);
            }
            this.b.b.setVisibility(4);
        }
        if (this.L == null) {
            this.L = new xc(this.M);
        }
        this.T = false;
        RelativeLayout relativeLayout3 = this.N;
        if (relativeLayout3 != null) {
            relativeLayout3.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        }
        a(this.L);
        if (this.a0) {
            this.b.b.setVisibility(0);
            this.M.setVisibility(4);
        }
        xc xcVar = this.L;
        xcVar.e = new bj(this);
        xcVar.b = new cj(this);
        xcVar.d = new dj(this);
        xcVar.c = new ej(this);
        xcVar.getClass();
        this.L.f = new hj() { // from class: com.startapp.sdk.ads.video.a$$ExternalSyntheticLambda1
            @Override // com.startapp.sdk.internal.hj
            public final void a(int i) {
                a.this.b(i);
            }
        };
        this.L.getClass();
        this.M.addOnLayoutChangeListener(new fj(this));
    }

    public final int v() {
        xc xcVar = this.L;
        if (xcVar == null) {
            return this.b0;
        }
        int currentPosition = xcVar.h.getCurrentPosition();
        if (currentPosition > this.b0) {
            this.b0 = currentPosition;
        }
        return this.b0;
    }

    public final int w() {
        xc xcVar = this.L;
        if (xcVar != null) {
            return xcVar.h.getDuration();
        }
        return -1;
    }

    public final long x() {
        long skippableAfter = y().getSkippableAfter();
        xc xcVar = this.L;
        return (xcVar == null || xcVar.g == null) ? skippableAfter : Math.min(skippableAfter, xcVar.h.getDuration());
    }

    public final VideoAdDetails y() {
        Ad ad = this.k;
        if (ad instanceof ni) {
            return ((ni) ad).r;
        }
        return null;
    }

    public final void z() {
        if (this.g.equals("back")) {
            if (AdsCommonMetaData.k().F().a().equals(VideoConfig.BackMode.BOTH)) {
                this.W = true;
                this.X = true;
                return;
            }
            if (AdsCommonMetaData.k().F().a().equals(VideoConfig.BackMode.SKIP)) {
                this.W = true;
                this.X = false;
            } else if (AdsCommonMetaData.k().F().a().equals(VideoConfig.BackMode.CLOSE)) {
                this.W = false;
                this.X = true;
            } else if (AdsCommonMetaData.k().F().a().equals(VideoConfig.BackMode.DISABLED)) {
                this.W = false;
                this.X = false;
            } else {
                this.W = false;
                this.X = false;
            }
        }
    }

    @Override // com.startapp.sdk.internal.da, com.startapp.sdk.internal.g7
    public final void a(Bundle bundle) {
        boolean z;
        super.a(bundle);
        try {
            z();
            B();
            if (!y().isVideoMuted() && !AdsCommonMetaData.k().F().o().equals("muted")) {
                z = false;
                this.R = z;
            }
            z = true;
            this.R = z;
        } catch (Throwable th) {
            n8.a(th);
            Intent intent = new Intent("com.startapp.android.ShowFailedDisplayBroadcastListener");
            intent.putExtra("showFailedReason", NotDisplayedReason.VIDEO_ERROR);
            db.a(this.f248a).a(intent);
            this.U = true;
            b();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
    
        if (r0 != null) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static oi b(Context context) {
        JSONArray jSONArray = null;
        if (context == null) {
            return null;
        }
        VideoConfig F = AdsCommonMetaData.k().F();
        if (F.s() <= 0) {
            return null;
        }
        final af afVar = (af) com.startapp.sdk.components.a.a(context).G.a();
        String string = afVar.getString("b0af25a33ac6560e", null);
        pi piVar = new pi() { // from class: com.startapp.sdk.ads.video.a$$ExternalSyntheticLambda2
            @Override // com.startapp.sdk.internal.pi
            public final void a(String str) {
                a.a(af.this, str);
            }
        };
        if (string != null) {
            try {
                jSONArray = new JSONArray(string);
            } catch (JSONException unused) {
            }
        }
        jSONArray = new JSONArray();
        return new oi(F, jSONArray, piVar);
    }

    @Override // com.startapp.sdk.internal.da
    public final void a(WebView webView) {
        super.a(webView);
        webView.setLayerType(1, null);
    }

    @Override // com.startapp.sdk.internal.da
    public final void a(ImageButton imageButton) {
        VideoAdDetails y;
        List<VerificationDetails> adVerifications;
        VastProperties createVastPropertiesForNonSkippableMedia;
        if (!MetaData.A().d0() || (y = y()) == null || (adVerifications = y.getAdVerifications()) == null) {
            return;
        }
        ed edVar = new ed(this.t.getContext(), adVerifications, true);
        this.D = edVar;
        AdSession adSession = edVar.f228a;
        if (adSession != null) {
            try {
                AdInformationView adInformationView = this.b.b;
                if (adInformationView != null) {
                    FriendlyObstructionPurpose friendlyObstructionPurpose = FriendlyObstructionPurpose.OTHER;
                    if (adSession != null) {
                        adSession.addFriendlyObstruction(adInformationView, friendlyObstructionPurpose, null);
                    }
                }
                if (imageButton != null) {
                    ed edVar2 = this.D;
                    FriendlyObstructionPurpose friendlyObstructionPurpose2 = FriendlyObstructionPurpose.CLOSE_AD;
                    AdSession adSession2 = edVar2.f228a;
                    if (adSession2 != null) {
                        adSession2.addFriendlyObstruction(imageButton, friendlyObstructionPurpose2, null);
                    }
                }
                ed edVar3 = this.D;
                WebView webView = this.t;
                FriendlyObstructionPurpose friendlyObstructionPurpose3 = FriendlyObstructionPurpose.VIDEO_CONTROLS;
                AdSession adSession3 = edVar3.f228a;
                if (adSession3 != null) {
                    adSession3.addFriendlyObstruction(webView, friendlyObstructionPurpose3, null);
                }
                ed edVar4 = this.D;
                RelativeLayout relativeLayout = this.O;
                FriendlyObstructionPurpose friendlyObstructionPurpose4 = FriendlyObstructionPurpose.OTHER;
                AdSession adSession4 = edVar4.f228a;
                if (adSession4 != null) {
                    adSession4.addFriendlyObstruction(relativeLayout, friendlyObstructionPurpose4, null);
                }
            } catch (RuntimeException unused) {
            }
            ed edVar5 = this.D;
            VideoView videoView = this.M;
            AdSession adSession5 = edVar5.f228a;
            if (adSession5 != null) {
                adSession5.registerAdView(videoView);
            }
            AdSession adSession6 = this.D.f228a;
            if (adSession6 != null) {
                adSession6.start();
            }
            ed edVar6 = this.D;
            boolean D = D();
            long x = C() ? x() : 0L;
            if (edVar6.b == null || !edVar6.e.compareAndSet(false, true)) {
                return;
            }
            if (D) {
                createVastPropertiesForNonSkippableMedia = VastProperties.createVastPropertiesForSkippableMedia(Math.max(1L, x) / 1000.0f, true, Position.STANDALONE);
            } else {
                createVastPropertiesForNonSkippableMedia = VastProperties.createVastPropertiesForNonSkippableMedia(true, Position.STANDALONE);
            }
            edVar6.b.loaded(createVastPropertiesForNonSkippableMedia);
        }
    }

    public final void c(int i) {
        List list;
        MediaEvents mediaEvents;
        if (!this.Z && this.A <= 0 && i != 0) {
            this.Z = true;
            ff ffVar = this.x;
            if (ffVar != null) {
                ffVar.c();
            }
            a(0, new VideoTrackingParams(this.n, 0, this.A), "impression", y().getVideoTrackingDetails().d());
            a(0, new VideoTrackingParams(this.n, 0, this.A), "creativeView", y().getVideoTrackingDetails().b());
            ed edVar = this.D;
            if (edVar != null) {
                edVar.a();
            }
        }
        for (Integer num : this.g0.keySet()) {
            int intValue = num.intValue();
            if (i > 0 && i >= (w() * intValue) / 100 && this.e0.get(num) == null) {
                if (this.g0.containsKey(num)) {
                    List list2 = (List) this.g0.get(num);
                    if (list2 != null) {
                        a((w() * intValue) / 100, new VideoProgressTrackingParams(this.n, intValue, this.A), "fraction", (VideoTrackingLink[]) list2.toArray(new FractionTrackingLink[0]));
                    }
                    ed edVar2 = this.D;
                    if (edVar2 != null) {
                        if (intValue == 25) {
                            MediaEvents mediaEvents2 = edVar2.c;
                            if (mediaEvents2 != null) {
                                mediaEvents2.firstQuartile();
                            }
                        } else if (intValue == 50) {
                            MediaEvents mediaEvents3 = edVar2.c;
                            if (mediaEvents3 != null) {
                                mediaEvents3.midpoint();
                            }
                        } else if (intValue == 75 && (mediaEvents = edVar2.c) != null) {
                            mediaEvents.thirdQuartile();
                        }
                    }
                }
                this.e0.put(num, Boolean.TRUE);
            }
        }
        for (Integer num2 : this.h0.keySet()) {
            int intValue2 = num2.intValue();
            if (i > 0 && i >= intValue2 && this.f0.get(num2) == null) {
                if (this.h0.containsKey(num2) && (list = (List) this.h0.get(num2)) != null) {
                    a(intValue2, new VideoProgressTrackingParams(this.n, intValue2, this.A), "absolute", (VideoTrackingLink[]) list.toArray(new AbsoluteTrackingLink[0]));
                }
                this.f0.put(num2, Boolean.TRUE);
            }
        }
        if (i >= (w() * AdsCommonMetaData.k().F().n()) / 100) {
            s();
        }
        if (i >= (w() * AdsCommonMetaData.k().F().n()) / 100) {
            s();
        }
    }

    public final void a(xc xcVar) {
        String filePath;
        VideoAdDetails y = y();
        if (y != null && (filePath = y.getFilePath()) != null) {
            xcVar.f496a = filePath;
            try {
                xcVar.h.setVideoPath(filePath);
                return;
            } catch (Throwable th) {
                n8.a(th);
                xcVar.onError(xcVar.g, 1, 0);
                return;
            }
        }
        a(VideoMode$VideoFinishedReason.SKIPPED);
    }

    public static void a(a aVar) {
        aVar.getClass();
        try {
            ImageButton imageButton = aVar.v;
            if (imageButton != null) {
                imageButton.setVisibility(4);
            }
        } catch (Throwable th) {
            n8.a(th);
        }
    }

    public final void a(VideoMode$VideoFinishedReason videoMode$VideoFinishedReason) {
        MediaEvents mediaEvents;
        ed edVar;
        MediaEvents mediaEvents2;
        VideoMode$VideoFinishedReason videoMode$VideoFinishedReason2 = VideoMode$VideoFinishedReason.SKIPPED;
        if (videoMode$VideoFinishedReason == videoMode$VideoFinishedReason2 && (edVar = this.D) != null && (mediaEvents2 = edVar.c) != null) {
            mediaEvents2.skipped();
        }
        VideoMode$VideoFinishedReason videoMode$VideoFinishedReason3 = VideoMode$VideoFinishedReason.COMPLETE;
        if (videoMode$VideoFinishedReason == videoMode$VideoFinishedReason3) {
            int w = w();
            this.b0 = w;
            c(w);
            s();
            ed edVar2 = this.D;
            if (edVar2 != null && (mediaEvents = edVar2.c) != null) {
                mediaEvents.complete();
            }
        } else {
            xc xcVar = this.L;
            if (xcVar != null) {
                xcVar.h.pause();
            }
        }
        if (videoMode$VideoFinishedReason == videoMode$VideoFinishedReason3 || videoMode$VideoFinishedReason == videoMode$VideoFinishedReason2) {
            VideoAdDetails y = y();
            if (y != null && y.hasPostRoll()) {
                A();
                this.b.b.setVisibility(0);
            } else {
                b();
            }
            this.a0 = true;
            if (y == null || !y.hasPostRoll()) {
                return;
            }
            a(this.b0, new VideoTrackingParams(this.n, a(this.b0), this.A), "postrollImression", y().getVideoTrackingDetails().m());
        }
    }

    public final int a(int i) {
        int w = w();
        if (w > 0) {
            return (i * 100) / w;
        }
        return 0;
    }

    @Override // com.startapp.sdk.internal.da
    public final void a(String str) {
        if (str.equals("vastClick")) {
            String postRollClickThroughUrl = this.a0 ? y().getPostRollClickThroughUrl() : null;
            if (postRollClickThroughUrl == null) {
                postRollClickThroughUrl = y().getClickUrl();
            }
            if (postRollClickThroughUrl != null) {
                super.a(postRollClickThroughUrl, true);
                return;
            }
            return;
        }
        super.a(str);
    }

    @Override // com.startapp.sdk.internal.da
    public final boolean a(String str, boolean z) {
        ActionTrackingLink[] h;
        String postRollClickThroughUrl = this.a0 ? y().getPostRollClickThroughUrl() : null;
        if (postRollClickThroughUrl == null) {
            postRollClickThroughUrl = y().getClickUrl();
        }
        if (!TextUtils.isEmpty(postRollClickThroughUrl)) {
            z = true;
            str = postRollClickThroughUrl;
        }
        if (!this.a0) {
            a(VideoMode$VideoFinishedReason.CLICKED);
        }
        boolean z2 = this.a0;
        if (z2) {
            h = y().getVideoTrackingDetails().k();
        } else {
            h = y().getVideoTrackingDetails().h();
        }
        a(this.b0, new VideoClickedTrackingParams(this.n, a(this.b0), this.A, z2), "clicked", h);
        ed edVar = this.D;
        if (edVar != null) {
            InteractionType interactionType = InteractionType.CLICK;
            MediaEvents mediaEvents = edVar.c;
            if (mediaEvents != null) {
                mediaEvents.adUserInteraction(interactionType);
            }
        }
        return super.a(str, z);
    }

    public final void a(boolean z) {
        ActionTrackingLink[] g;
        if (this.L == null) {
            return;
        }
        if (z) {
            g = y().getVideoTrackingDetails().f();
        } else {
            g = y().getVideoTrackingDetails().g();
        }
        a(this.L.h.getCurrentPosition(), new VideoTrackingParams(this.n, a(this.L.h.getCurrentPosition()), this.A), "sound", g);
        ed edVar = this.D;
        if (edVar != null) {
            float f = z ? 0.0f : 1.0f;
            MediaEvents mediaEvents = edVar.c;
            if (mediaEvents != null) {
                mediaEvents.volumeChange(f);
            }
        }
    }

    public final void a(int i, VideoTrackingParams videoTrackingParams, String str, VideoTrackingLink[] videoTrackingLinkArr) {
        a(this.f248a, new ri(i, videoTrackingParams, y().getVideoUrl(), videoTrackingLinkArr).a());
    }

    public static void a(af afVar, String str) {
        ze edit = afVar.edit();
        edit.a("b0af25a33ac6560e", str);
        edit.f526a.putString("b0af25a33ac6560e", str);
        edit.apply();
    }

    public static boolean a(Context context) {
        boolean z;
        oi b = b(context);
        if (b != null) {
            synchronized (b.f369a) {
                if (b.f369a.length() >= b.c) {
                    if (b.f369a.optLong(0) + b.d > System.currentTimeMillis()) {
                        z = true;
                    }
                }
                z = false;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }
}
