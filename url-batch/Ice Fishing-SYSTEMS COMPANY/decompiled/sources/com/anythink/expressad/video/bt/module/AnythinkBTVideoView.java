package com.anythink.expressad.video.bt.module;

import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.anythink.basead.b.c.i;
import com.anythink.core.common.d.t;
import com.anythink.core.common.e.g;
import com.anythink.expressad.atsignalcommon.windvane.h;
import com.anythink.expressad.foundation.d.d;
import com.anythink.expressad.foundation.f.b;
import com.anythink.expressad.foundation.h.k;
import com.anythink.expressad.foundation.h.v;
import com.anythink.expressad.foundation.h.y;
import com.anythink.expressad.playercommon.DefaultVideoPlayerStatusListener;
import com.anythink.expressad.playercommon.PlayerErrorConstant;
import com.anythink.expressad.playercommon.PlayerView;
import com.anythink.expressad.video.widget.SoundImageView;
import com.anythink.expressad.videocommon.b.c;
import com.anythink.expressad.videocommon.b.e;
import com.anythink.expressad.widget.FeedBackButton;
import java.io.File;
import org.json.JSONObject;
import t0.AbstractC5051n;

/* loaded from: classes.dex */
public class AnythinkBTVideoView extends BTBaseView {

    /* renamed from: I, reason: collision with root package name */
    private static boolean f21143I = false;

    /* renamed from: P, reason: collision with root package name */
    private static final String f21144P = "2";

    /* renamed from: p, reason: collision with root package name */
    private static final String f21145p = "anythink_reward_videoview_item";

    /* renamed from: A, reason: collision with root package name */
    private int f21146A;

    /* renamed from: B, reason: collision with root package name */
    private a f21147B;

    /* renamed from: C, reason: collision with root package name */
    private int f21148C;

    /* renamed from: D, reason: collision with root package name */
    private int f21149D;

    /* renamed from: E, reason: collision with root package name */
    private boolean f21150E;

    /* renamed from: F, reason: collision with root package name */
    private int f21151F;

    /* renamed from: G, reason: collision with root package name */
    private int f21152G;

    /* renamed from: H, reason: collision with root package name */
    private String f21153H;
    private boolean J;

    /* renamed from: K, reason: collision with root package name */
    private boolean f21154K;

    /* renamed from: L, reason: collision with root package name */
    private boolean f21155L;

    /* renamed from: M, reason: collision with root package name */
    private RelativeLayout f21156M;

    /* renamed from: N, reason: collision with root package name */
    private ProgressBar f21157N;

    /* renamed from: O, reason: collision with root package name */
    private com.anythink.expressad.video.a.a f21158O;

    /* renamed from: q, reason: collision with root package name */
    private PlayerView f21159q;

    /* renamed from: r, reason: collision with root package name */
    private SoundImageView f21160r;

    /* renamed from: s, reason: collision with root package name */
    private TextView f21161s;

    /* renamed from: t, reason: collision with root package name */
    private View f21162t;

    /* renamed from: u, reason: collision with root package name */
    private FeedBackButton f21163u;

    /* renamed from: v, reason: collision with root package name */
    private ImageView f21164v;

    /* renamed from: w, reason: collision with root package name */
    private WebView f21165w;

    /* renamed from: x, reason: collision with root package name */
    private c f21166x;

    /* renamed from: y, reason: collision with root package name */
    private int f21167y;

    /* renamed from: z, reason: collision with root package name */
    private int f21168z;

    public static final class a extends DefaultVideoPlayerStatusListener {

        /* renamed from: a, reason: collision with root package name */
        private AnythinkBTVideoView f21172a;

        /* renamed from: b, reason: collision with root package name */
        private WebView f21173b;

        /* renamed from: c, reason: collision with root package name */
        private String f21174c;

        /* renamed from: d, reason: collision with root package name */
        private String f21175d;

        /* renamed from: e, reason: collision with root package name */
        private int f21176e;

        /* renamed from: f, reason: collision with root package name */
        private int f21177f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f21178g;

        /* renamed from: k, reason: collision with root package name */
        private int f21181k;

        /* renamed from: l, reason: collision with root package name */
        private int f21182l;

        /* renamed from: h, reason: collision with root package name */
        private boolean f21179h = false;
        private boolean i = false;

        /* renamed from: j, reason: collision with root package name */
        private boolean f21180j = false;

        /* renamed from: m, reason: collision with root package name */
        private boolean f21183m = false;

        public a(AnythinkBTVideoView anythinkBTVideoView, WebView webView) {
            this.f21172a = anythinkBTVideoView;
            this.f21173b = webView;
            this.f21174c = anythinkBTVideoView.f21207d;
            this.f21175d = anythinkBTVideoView.f21206c;
        }

        private int a() {
            return this.f21176e;
        }

        private static void b() {
        }

        private void c() {
            this.f21172a = null;
            this.f21173b = null;
            boolean unused = AnythinkBTVideoView.f21143I = false;
        }

        @Override // com.anythink.expressad.playercommon.DefaultVideoPlayerStatusListener, com.anythink.expressad.playercommon.VideoPlayerStatusListener
        public final void onBufferingEnd() {
            try {
                super.onBufferingEnd();
            } catch (Exception e6) {
                e6.printStackTrace();
            }
        }

        @Override // com.anythink.expressad.playercommon.DefaultVideoPlayerStatusListener, com.anythink.expressad.playercommon.VideoPlayerStatusListener
        public final void onBufferingStart(String str) {
            try {
                super.onBufferingStart(str);
                if (!str.equals(PlayerErrorConstant.PREPARE_TIMEOUT) && !str.equals("play buffering tiemout")) {
                    return;
                }
                if (this.f21173b != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("code", BTBaseView.f21201n);
                        jSONObject.put("id", this.f21174c);
                        jSONObject.put("data", new JSONObject());
                        h.a();
                        com.anythink.core.express.d.a.a(this.f21173b, "onPlayerTimeout", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    } catch (Exception e6) {
                        com.anythink.expressad.video.bt.a.c.a();
                        com.anythink.expressad.video.bt.a.c.a(this.f21173b, e6.getMessage());
                    }
                }
            } catch (Exception e9) {
                e9.printStackTrace();
            }
        }

        @Override // com.anythink.expressad.playercommon.DefaultVideoPlayerStatusListener, com.anythink.expressad.playercommon.VideoPlayerStatusListener
        public final void onPlayCompleted() {
            super.onPlayCompleted();
            AnythinkBTVideoView anythinkBTVideoView = this.f21172a;
            d dVar = anythinkBTVideoView.f21205b;
            if (dVar == null) {
                anythinkBTVideoView.f21161s.setText("0");
            } else if (dVar.i() > 0) {
                this.f21172a.f21161s.setText(k.a(t.b().g(), "anythink_reward_video_view_reward_time_complete", k.f19794g));
            } else {
                this.f21172a.f21161s.setText("0");
            }
            this.f21172a.f21159q.setClickable(false);
            WebView webView = this.f21173b;
            if (webView != null) {
                BTBaseView.a(webView, "onPlayerFinish", this.f21174c);
            }
            this.f21176e = this.f21177f;
            boolean unused = AnythinkBTVideoView.f21143I = true;
            this.f21172a.stop();
        }

        @Override // com.anythink.expressad.playercommon.DefaultVideoPlayerStatusListener, com.anythink.expressad.playercommon.VideoPlayerStatusListener
        public final void onPlayError(String str) {
            super.onPlayError(str);
            if (this.f21173b != null) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("code", BTBaseView.f21202o);
                    jSONObject.put("id", this.f21174c);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("error", str);
                    jSONObject2.put("id", this.f21174c);
                    jSONObject.put("data", jSONObject2);
                    h.a();
                    com.anythink.core.express.d.a.a(this.f21173b, "onPlayerFailed", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                } catch (Exception e6) {
                    com.anythink.expressad.video.bt.a.c.a();
                    com.anythink.expressad.video.bt.a.c.a(this.f21173b, e6.getMessage());
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:65:0x025f A[Catch: Exception -> 0x0227, TRY_LEAVE, TryCatch #0 {Exception -> 0x0227, blocks: (B:45:0x01cf, B:47:0x01d5, B:53:0x01dd, B:55:0x01e1, B:57:0x01e5, B:59:0x01f1, B:62:0x01fc, B:63:0x0253, B:65:0x025f, B:69:0x0229), top: B:44:0x01cf }] */
        /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
        @Override // com.anythink.expressad.playercommon.DefaultVideoPlayerStatusListener, com.anythink.expressad.playercommon.VideoPlayerStatusListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void onPlayProgress(int i, int i4) {
            int i9;
            String str;
            c a9;
            int i10;
            String str2;
            super.onPlayProgress(i, i4);
            AnythinkBTVideoView anythinkBTVideoView = this.f21172a;
            if (anythinkBTVideoView.f21211h) {
                d dVar = anythinkBTVideoView.f21205b;
                if (dVar != null) {
                    i10 = dVar.i();
                    b.a().a(this.f21172a.f21205b.L() + "_1", i);
                } else {
                    i10 = 0;
                }
                if (i10 > i4 || i10 <= 0) {
                    i10 = i4;
                }
                int i11 = i10 <= 0 ? i4 - i : i10 - i;
                if (i11 <= 0) {
                    str2 = i10 <= 0 ? "0" : (String) this.f21172a.getContext().getResources().getText(k.a(t.b().g(), "anythink_reward_video_view_reward_time_complete", k.f19794g));
                } else if (i10 <= 0) {
                    str2 = String.valueOf(i11);
                } else {
                    str2 = i11 + ((String) this.f21172a.getContext().getResources().getText(k.a(t.b().g(), "anythink_reward_video_view_reward_time_left", k.f19794g)));
                }
                d dVar2 = this.f21172a.f21205b;
                if (dVar2 != null && dVar2.aJ() == 1) {
                    int min = Math.min(this.f21172a.f21205b.g(), i4);
                    if (min >= i10 || min < 0) {
                        int i12 = i10 - i;
                        if (this.f21172a.f21205b.x() == 287) {
                            if (i12 > 0) {
                                str2 = i12 + ((String) this.f21172a.getContext().getResources().getText(k.a(t.b().g(), "anythink_reward_video_view_reward_time_left_skip_time", k.f19794g)));
                            } else if (i12 == 0) {
                                this.f21172a.f21161s.setVisibility(4);
                            }
                        }
                    } else {
                        int i13 = min - i;
                        if (i13 > 0) {
                            str2 = i13 + ((String) this.f21172a.getContext().getResources().getText(k.a(t.b().g(), "anythink_reward_video_view_reward_time_left_skip_time", k.f19794g)));
                        } else if (this.f21172a.f21205b.x() == 287 && i13 == 0) {
                            this.f21172a.f21161s.setVisibility(4);
                        }
                    }
                }
                this.f21172a.f21161s.setText(str2);
            }
            this.f21177f = i4;
            this.f21176e = i;
            this.f21172a.f21157N.setMax(this.f21177f);
            this.f21172a.f21157N.setProgress(this.f21176e);
            if (this.f21173b != null) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("code", BTBaseView.f21201n);
                    jSONObject.put("id", this.f21174c);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("id", this.f21174c);
                    jSONObject2.put(g.a.f13106C, AnythinkBTVideoView.b(i, i4));
                    jSONObject2.put("time", String.valueOf(i));
                    jSONObject2.put("duration", String.valueOf(i4));
                    jSONObject.put("data", jSONObject2);
                    h.a();
                    com.anythink.core.express.d.a.a(this.f21173b, "onPlayerProgressChanged", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                } catch (Exception e6) {
                    com.anythink.expressad.video.bt.a.c.a();
                    com.anythink.expressad.video.bt.a.c.a(this.f21173b, e6.getMessage());
                }
            }
            try {
                int i14 = this.f21181k;
                if (i14 == 100 || this.f21183m || i14 == 0 || (i9 = this.f21182l) < 0 || i < (i4 * i9) / 100) {
                    return;
                }
                if (this.f21172a.f21205b.x() != 94 && this.f21172a.f21205b.x() != 287) {
                    str = this.f21172a.f21205b.bh() + this.f21172a.f21205b.T() + this.f21172a.f21205b.C();
                    a9 = e.a().a(this.f21175d, str);
                    if (a9 == null) {
                        a9.i();
                        this.f21183m = true;
                        return;
                    }
                    return;
                }
                str = this.f21172a.f21205b.aa() + this.f21172a.f21205b.bh() + this.f21172a.f21205b.T();
                a9 = e.a().a(this.f21175d, str);
                if (a9 == null) {
                }
            } catch (Exception e9) {
                e9.getMessage();
            }
        }

        @Override // com.anythink.expressad.playercommon.DefaultVideoPlayerStatusListener, com.anythink.expressad.playercommon.VideoPlayerStatusListener
        public final void onPlaySetDataSourceError(String str) {
            super.onPlaySetDataSourceError(str);
        }

        @Override // com.anythink.expressad.playercommon.DefaultVideoPlayerStatusListener, com.anythink.expressad.playercommon.VideoPlayerStatusListener
        public final void onPlayStarted(int i) {
            super.onPlayStarted(i);
            if (!this.f21178g) {
                this.f21172a.f21157N.setMax(i);
                WebView webView = this.f21173b;
                if (webView != null) {
                    BTBaseView.a(webView, "onPlayerPlay", this.f21174c);
                }
                this.f21178g = true;
            }
            boolean unused = AnythinkBTVideoView.f21143I = false;
        }

        @Override // com.anythink.expressad.playercommon.DefaultVideoPlayerStatusListener, com.anythink.expressad.playercommon.VideoPlayerStatusListener
        public final void onVideoDownloadResume() {
            String str;
            if (this.f21172a.f21205b.x() == 94 || this.f21172a.f21205b.x() == 287) {
                str = this.f21172a.f21205b.aa() + this.f21172a.f21205b.bh() + this.f21172a.f21205b.T();
            } else {
                str = this.f21172a.f21205b.bh() + this.f21172a.f21205b.T() + this.f21172a.f21205b.C();
            }
            c a9 = e.a().a(this.f21175d, str);
            if (a9 != null) {
                a9.i();
                this.f21183m = true;
            }
        }

        public final void a(int i, int i4) {
            this.f21181k = i;
            this.f21182l = i4;
        }
    }

    public AnythinkBTVideoView(Context context) {
        super(context);
        this.f21167y = 0;
        this.f21168z = 0;
        this.f21146A = 0;
        this.f21148C = 2;
        this.f21150E = false;
        this.f21151F = 2;
        this.f21152G = 1;
        this.J = false;
        this.f21154K = false;
        this.f21155L = false;
    }

    private int f() {
        return com.anythink.expressad.videocommon.e.c.a().a(com.anythink.expressad.foundation.b.a.c().f(), this.f21206c, false).x();
    }

    public int getMute() {
        return this.f21148C;
    }

    @Override // com.anythink.expressad.video.bt.module.BTBaseView
    public void init(Context context) {
        int findLayout = findLayout(f21145p);
        if (findLayout > 0) {
            this.f21209f.inflate(findLayout, this);
            this.f21211h = b();
            a();
        }
        f21143I = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!this.f21155L) {
            com.anythink.expressad.video.bt.a.c.a();
            this.f21151F = com.anythink.expressad.video.bt.a.c.e(this.f21206c);
        }
        View view = this.f21162t;
        if (view != null) {
            view.setVisibility(this.f21168z == 0 ? 8 : 0);
        }
        SoundImageView soundImageView = this.f21160r;
        if (soundImageView != null) {
            soundImageView.setVisibility(this.f21146A == 0 ? 8 : 0);
        }
        TextView textView = this.f21161s;
        if (textView != null) {
            textView.setVisibility(this.f21167y == 0 ? 8 : 0);
            if (this.f21161s.getVisibility() == 0 && b.a().b()) {
                this.f21205b.l(this.f21206c);
                b.a().a(AbstractC5051n.g(new StringBuilder(), this.f21206c, "_1"), this.f21205b);
                b.a().a(AbstractC5051n.g(new StringBuilder(), this.f21206c, "_1"), this.f21163u);
            }
        }
    }

    @Override // com.anythink.expressad.video.bt.module.BTBaseView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override // com.anythink.expressad.video.bt.module.BTBaseView
    public void onDestory() {
        try {
            PlayerView playerView = this.f21159q;
            if (playerView != null) {
                playerView.setOnClickListener(null);
                this.f21159q.release();
                this.f21159q = null;
            }
            SoundImageView soundImageView = this.f21160r;
            if (soundImageView != null) {
                soundImageView.setOnClickListener(null);
            }
            View view = this.f21162t;
            if (view != null) {
                view.setOnClickListener(null);
            }
            if (this.f21165w != null) {
                this.f21165w = null;
            }
            if (this.f21158O != null) {
                this.f21158O = null;
            }
            setOnClickListener(null);
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public void onPause() {
        PlayerView playerView = this.f21159q;
        if (playerView != null) {
            boolean isPlayIng = playerView.isPlayIng();
            this.f21154K = isPlayIng;
            this.f21159q.setIsBTVideoPlaying(isPlayIng);
            this.f21159q.onPause();
        }
    }

    public void onResume(com.anythink.expressad.video.a.a aVar) {
        PlayerView playerView = this.f21159q;
        if (playerView != null) {
            playerView.setDesk(true);
            this.f21159q.setIsCovered(false);
            if (this.f21154K) {
                this.f21159q.onResume();
            }
        }
        this.f21158O = aVar;
    }

    public void onStop() {
        PlayerView playerView = this.f21159q;
        if (playerView != null) {
            playerView.setIsCovered(true);
        }
    }

    public void pause() {
        try {
            PlayerView playerView = this.f21159q;
            if (playerView != null) {
                playerView.pause();
                WebView webView = this.f21165w;
                if (webView != null) {
                    BTBaseView.a(webView, "onPlayerPause", this.f21207d);
                }
            }
        } catch (Exception e6) {
            e6.getMessage();
        }
    }

    public void play() {
        a aVar;
        try {
            if (this.f21155L) {
                if (this.f21150E) {
                    this.f21159q.playVideo(0);
                    this.f21150E = false;
                } else {
                    this.f21159q.start(false);
                }
                WebView webView = this.f21165w;
                if (webView != null) {
                    BTBaseView.a(webView, "onPlayerPlay", this.f21207d);
                    return;
                }
                return;
            }
            if (this.f21151F == 1) {
                playMute();
            } else {
                playUnMute();
            }
            if (!this.f21159q.playVideo() && (aVar = this.f21147B) != null) {
                aVar.onPlayError("play video failed");
            }
            this.f21155L = true;
            WebView webView2 = this.f21165w;
            if (webView2 != null) {
                BTBaseView.a(webView2, "onPlayerPlay", this.f21207d);
            }
        } catch (Exception e6) {
            e6.getMessage();
        }
    }

    public boolean playMute() {
        try {
            PlayerView playerView = this.f21159q;
            if (playerView != null && this.f21165w != null) {
                playerView.closeSound();
                this.f21160r.setSoundStatus(false);
                this.f21148C = 1;
                BTBaseView.a(this.f21165w, "onPlayerMute", this.f21207d);
                com.anythink.expressad.video.a.a aVar = this.f21158O;
                if (aVar != null) {
                    aVar.a(true);
                }
                return true;
            }
        } catch (Exception e6) {
            e6.getMessage();
        }
        return false;
    }

    public boolean playUnMute() {
        try {
            PlayerView playerView = this.f21159q;
            if (playerView != null && this.f21165w != null) {
                playerView.openSound();
                this.f21160r.setSoundStatus(true);
                this.f21148C = 2;
                BTBaseView.a(this.f21165w, "onUnmute", this.f21207d);
                com.anythink.expressad.video.a.a aVar = this.f21158O;
                if (aVar != null) {
                    aVar.a(false);
                }
                return true;
            }
        } catch (Exception e6) {
            e6.getMessage();
        }
        return false;
    }

    public void preLoadData() {
        String str;
        if (this.f21205b.x() == 94 || this.f21205b.x() == 287) {
            str = this.f21205b.aa() + this.f21205b.bh() + this.f21205b.T();
        } else {
            str = this.f21205b.bh() + this.f21205b.T() + this.f21205b.C();
        }
        c a9 = e.a().a(this.f21206c, str);
        if (a9 != null) {
            this.f21166x = a9;
        }
        this.f21149D = e();
        String d2 = d();
        this.f21153H = d2;
        if (this.f21211h && !TextUtils.isEmpty(d2) && this.f21205b != null) {
            a aVar = new a(this, this.f21165w);
            this.f21147B = aVar;
            d dVar = this.f21205b;
            aVar.a(dVar != null ? dVar.aq() != -1 ? dVar.aq() : com.anythink.expressad.videocommon.e.c.a().a(com.anythink.expressad.foundation.b.a.c().f(), this.f21206c, false).v() : com.anythink.expressad.videocommon.e.c.a().a(com.anythink.expressad.foundation.b.a.c().f(), this.f21206c, false).v(), com.anythink.expressad.videocommon.e.c.a().a(com.anythink.expressad.foundation.b.a.c().f(), this.f21206c, false).x());
            this.f21159q.setDesk(false);
            this.f21159q.initBufferIngParam(this.f21149D);
            this.f21159q.initVFPData(this.f21153H, this.f21205b.T(), this.f21205b.aq(), this.f21147B);
            soundOperate(this.f21148C, -1, null);
        }
        f21143I = false;
    }

    public void resume() {
        try {
            PlayerView playerView = this.f21159q;
            if (playerView != null) {
                if (this.f21150E) {
                    playerView.playVideo(0);
                    this.f21150E = false;
                } else {
                    playerView.onResume();
                }
                WebView webView = this.f21165w;
                if (webView != null) {
                    BTBaseView.a(webView, "onPlayerResume", this.f21207d);
                }
            }
        } catch (Exception e6) {
            e6.getMessage();
        }
    }

    @Override // com.anythink.expressad.video.bt.module.BTBaseView
    public void setCampaign(d dVar) {
        super.setCampaign(dVar);
        if (dVar == null || dVar.i() <= 0) {
            this.f21161s.setBackgroundResource(k.a(t.b().g(), "anythink_reward_shape_progress", k.f19790c));
            this.f21161s.setWidth(v.b(t.b().g(), 30.0f));
            return;
        }
        this.f21161s.setBackgroundResource(k.a(t.b().g(), "anythink_reward_video_time_count_num_bg", k.f19790c));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, i.e(30.0f));
        int b9 = v.b(t.b().g(), 5.0f);
        layoutParams.setMargins(b9, 0, 0, 0);
        this.f21161s.setPadding(b9, 0, b9, 0);
        this.f21161s.setLayoutParams(layoutParams);
    }

    public void setCloseViewVisable(int i) {
        this.f21162t.setVisibility(i == 0 ? 4 : 0);
    }

    public void setCountDownTextViewVisable(int i) {
        this.f21161s.setVisibility(i == 0 ? 4 : 0);
    }

    public void setCreateWebView(WebView webView) {
        this.f21165w = webView;
    }

    public void setNotchPadding(int i, int i4, int i9, int i10) {
        if (i <= 0) {
            i = this.f21156M.getPaddingLeft();
        }
        if (i4 <= 0) {
            i4 = this.f21156M.getPaddingRight();
        }
        if (i9 <= 0) {
            i9 = this.f21156M.getPaddingTop();
        }
        if (i10 <= 0) {
            i10 = this.f21156M.getPaddingBottom();
        }
        String.format("%1s-%2s-%3s-%4s", Integer.valueOf(i), Integer.valueOf(i4), Integer.valueOf(i9), Integer.valueOf(i10));
        this.f21156M.setPadding(i, i9, i4, i10);
    }

    public void setOrientation(int i) {
        this.f21152G = i;
    }

    public void setPlaybackParams(float f6) {
        PlayerView playerView = this.f21159q;
        if (playerView != null) {
            playerView.setPlaybackParams(f6);
        }
    }

    public void setProgressBarState(int i) {
        ProgressBar progressBar = this.f21157N;
        if (progressBar != null) {
            progressBar.setVisibility(i == 0 ? 8 : 0);
        }
    }

    public void setShowClose(int i) {
        this.f21168z = i;
    }

    public void setShowMute(int i) {
        this.f21146A = i;
    }

    public void setShowTime(int i) {
        this.f21167y = i;
    }

    public void setSoundImageViewVisble(int i) {
        this.f21160r.setVisibility(i == 0 ? 4 : 0);
    }

    public void setVolume(float f6, float f9) {
        PlayerView playerView = this.f21159q;
        if (playerView != null) {
            playerView.setVolume(f6, f9);
        }
    }

    public void soundOperate(int i, int i4, String str) {
        if (this.f21211h) {
            this.f21148C = i;
            if (i == 1) {
                this.f21160r.setSoundStatus(false);
                this.f21159q.closeSound();
            } else if (i == 2) {
                this.f21160r.setSoundStatus(true);
                this.f21159q.openSound();
            }
            if (i4 == 1) {
                this.f21160r.setVisibility(8);
            } else if (i4 == 2) {
                this.f21160r.setVisibility(0);
            }
        }
    }

    public void stop() {
        try {
            PlayerView playerView = this.f21159q;
            if (playerView != null) {
                playerView.pause();
                this.f21159q.stop();
                try {
                    this.f21159q.prepare();
                    this.f21159q.justSeekTo(0);
                } catch (Exception e6) {
                    e6.printStackTrace();
                }
                WebView webView = this.f21165w;
                if (webView != null) {
                    BTBaseView.a(webView, "onPlayerStop", this.f21207d);
                }
            }
        } catch (Exception e9) {
            e9.getMessage();
        }
    }

    private boolean b() {
        try {
            this.f21159q = (PlayerView) findViewById(findID("anythink_vfpv"));
            this.f21160r = (SoundImageView) findViewById(findID("anythink_sound_switch"));
            this.f21161s = (TextView) findViewById(findID("anythink_tv_count"));
            this.f21162t = findViewById(findID("anythink_rl_playing_close"));
            this.f21156M = (RelativeLayout) findViewById(findID("anythink_top_control"));
            this.f21157N = (ProgressBar) findViewById(findID("anythink_video_progress_bar"));
            this.f21159q.setIsBTVideo(true);
            this.f21163u = (FeedBackButton) findViewById(findID("anythink_native_endcard_feed_btn"));
            this.f21164v = (ImageView) findViewById(findID("anythink_iv_link"));
            return isNotNULL(this.f21159q, this.f21160r, this.f21161s, this.f21162t);
        } catch (Throwable th) {
            th.getMessage();
            return false;
        }
    }

    private void c() {
        String str;
        if (this.f21205b.x() == 94 || this.f21205b.x() == 287) {
            str = this.f21205b.aa() + this.f21205b.bh() + this.f21205b.T();
        } else {
            str = this.f21205b.bh() + this.f21205b.T() + this.f21205b.C();
        }
        c a9 = e.a().a(this.f21206c, str);
        if (a9 != null) {
            this.f21166x = a9;
        }
    }

    private String d() {
        String str = "";
        try {
            str = this.f21205b.T();
            c cVar = this.f21166x;
            if (cVar != null && cVar.k() == 5) {
                String e6 = this.f21166x.e();
                if (!y.a(e6)) {
                    if (new File(e6).exists()) {
                        return e6;
                    }
                }
            }
            return str;
        } catch (Throwable th) {
            th.getMessage();
            return str;
        }
    }

    private static int e() {
        try {
            com.anythink.expressad.videocommon.e.a b9 = com.anythink.expressad.videocommon.e.c.a().b();
            if (b9 == null) {
                com.anythink.expressad.videocommon.e.c.a();
                com.anythink.expressad.videocommon.e.c.c();
            }
            if (b9 != null) {
                return (int) b9.g();
            }
            return 5;
        } catch (Throwable th) {
            th.printStackTrace();
            return 5;
        }
    }

    @Override // com.anythink.expressad.video.bt.module.BTBaseView
    public final void a() {
        super.a();
        if (this.f21211h) {
            this.f21160r.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.expressad.video.bt.module.AnythinkBTVideoView.1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AnythinkBTVideoView.this.f21159q.isSilent();
                    if (AnythinkBTVideoView.this.f21165w != null) {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("code", BTBaseView.f21201n);
                            jSONObject.put("id", AnythinkBTVideoView.this.f21207d);
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("mute", AnythinkBTVideoView.this.f21148C);
                            jSONObject.put("data", jSONObject2);
                            h.a();
                            com.anythink.core.express.d.a.a(AnythinkBTVideoView.this.f21165w, "onPlayerMuteBtnClicked", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                            int unused = AnythinkBTVideoView.this.f21148C;
                        } catch (Exception e6) {
                            com.anythink.expressad.video.bt.a.c.a();
                            com.anythink.expressad.video.bt.a.c.a(AnythinkBTVideoView.this.f21165w, e6.getMessage());
                        }
                    }
                }
            });
            this.f21162t.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.expressad.video.bt.module.AnythinkBTVideoView.2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    if (AnythinkBTVideoView.this.f21165w != null) {
                        BTBaseView.a(AnythinkBTVideoView.this.f21165w, "onPlayerCloseBtnClicked", AnythinkBTVideoView.this.f21207d);
                    }
                }
            });
            setOnClickListener(new View.OnClickListener() { // from class: com.anythink.expressad.video.bt.module.AnythinkBTVideoView.3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    if (AnythinkBTVideoView.this.f21165w != null) {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("code", BTBaseView.f21201n);
                            jSONObject.put("id", AnythinkBTVideoView.this.f21207d);
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("x", String.valueOf(view.getX()));
                            jSONObject2.put("y", String.valueOf(view.getY()));
                            jSONObject.put("data", jSONObject2);
                            h.a();
                            com.anythink.core.express.d.a.a(AnythinkBTVideoView.this.f21165w, "onClicked", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                        } catch (Exception unused) {
                            com.anythink.expressad.video.bt.a.c.a();
                            com.anythink.expressad.video.bt.a.c.a(AnythinkBTVideoView.this.f21165w, "onClicked", AnythinkBTVideoView.this.f21207d);
                        }
                    }
                }
            });
        }
    }

    private int a(d dVar) {
        if (dVar != null) {
            if (dVar.aq() != -1) {
                return dVar.aq();
            }
            return com.anythink.expressad.videocommon.e.c.a().a(com.anythink.expressad.foundation.b.a.c().f(), this.f21206c, false).v();
        }
        return com.anythink.expressad.videocommon.e.c.a().a(com.anythink.expressad.foundation.b.a.c().f(), this.f21206c, false).v();
    }

    public AnythinkBTVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f21167y = 0;
        this.f21168z = 0;
        this.f21146A = 0;
        this.f21148C = 2;
        this.f21150E = false;
        this.f21151F = 2;
        this.f21152G = 1;
        this.J = false;
        this.f21154K = false;
        this.f21155L = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String b(int i, int i4) {
        if (i4 != 0) {
            double d2 = i / i4;
            try {
                StringBuilder sb = new StringBuilder();
                sb.append(v.a(Double.valueOf(d2)));
                return sb.toString();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return String.valueOf(i4);
    }
}
