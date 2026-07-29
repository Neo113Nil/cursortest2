package com.chartboost.sdk.impl;

import android.content.Context;
import android.graphics.Point;
import android.os.Handler;
import android.support.v4.app.NotificationCompat;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import com.chartboost.sdk.Libraries.CBLogging;
import com.chartboost.sdk.Libraries.CBUtility;
import com.chartboost.sdk.Libraries.e;
import com.chartboost.sdk.Model.CBError;
import com.chartboost.sdk.e;
import com.chartboost.sdk.impl.u;
import com.tapjoy.TJAdUnitConstants;
import com.youappi.sdk.net.model.VideoEvent;
import java.io.File;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class v extends u {
    protected boolean A;
    protected boolean B;
    protected boolean C;
    protected int D;
    protected com.chartboost.sdk.Libraries.h E;
    protected com.chartboost.sdk.Libraries.h F;
    protected com.chartboost.sdk.Libraries.h G;
    protected com.chartboost.sdk.Libraries.h H;
    protected com.chartboost.sdk.Libraries.h I;
    protected com.chartboost.sdk.Libraries.h J;
    protected com.chartboost.sdk.Libraries.h K;
    protected com.chartboost.sdk.Libraries.h L;
    protected boolean M;
    protected boolean N;
    protected boolean O;
    private boolean P;
    private boolean Q;
    private boolean R;
    final com.chartboost.sdk.Libraries.f q;
    protected int r;
    protected int s;
    protected String t;
    protected String u;
    protected int v;
    protected int w;
    JSONObject x;
    protected boolean y;
    protected boolean z;

    public class a extends u.a {
        final ab h;
        y i;
        final t j;
        final w k;
        private final az m;
        private View n;
        private final az o;

        private a(Context context) {
            super(context);
            JSONObject optJSONObject;
            JSONObject optJSONObject2;
            com.chartboost.sdk.g a2 = com.chartboost.sdk.g.a();
            if (v.this.N) {
                this.n = new View(context);
                this.n.setBackgroundColor(-16777216);
                this.n.setVisibility(8);
                addView(this.n);
            }
            if (v.this.e.n == 2) {
                this.i = (y) a2.a(new y(context, v.this));
                this.i.setVisibility(8);
                addView(this.i);
            }
            this.h = (ab) a2.a(new ab(context, v.this));
            a(this.h.g);
            this.h.setVisibility(8);
            addView(this.h);
            this.j = (t) a2.a(new t(context, v.this));
            this.j.setVisibility(8);
            addView(this.j);
            if (v.this.e.n == 2) {
                this.k = (w) a2.a(new w(context, v.this));
                this.k.setVisibility(8);
                addView(this.k);
            } else {
                this.k = null;
            }
            this.m = new az(getContext()) { // from class: com.chartboost.sdk.impl.v.a.1
                @Override // com.chartboost.sdk.impl.az
                protected void a(MotionEvent motionEvent) {
                    if (v.this.e.n == 2) {
                        a.this.k.a(false);
                    }
                    if (v.this.r == 1) {
                        a.this.c(false);
                    }
                    a.this.b(true);
                }
            };
            this.m.setVisibility(8);
            addView(this.m);
            this.o = new az(getContext()) { // from class: com.chartboost.sdk.impl.v.a.2
                @Override // com.chartboost.sdk.impl.az
                protected void a(MotionEvent motionEvent) {
                    a.this.d();
                }
            };
            this.o.setVisibility(8);
            this.o.setContentDescription("CBClose");
            addView(this.o);
            JSONObject optJSONObject3 = v.this.x.optJSONObject(NotificationCompat.CATEGORY_PROGRESS);
            JSONObject optJSONObject4 = v.this.x.optJSONObject("video-controls-background");
            if (optJSONObject3 != null && !optJSONObject3.isNull("background-color") && !optJSONObject3.isNull("border-color") && !optJSONObject3.isNull("progress-color") && !optJSONObject3.isNull("radius")) {
                v.this.M = true;
                x c2 = this.h.c();
                c2.a(com.chartboost.sdk.e.a(optJSONObject3.optString("background-color")));
                c2.b(com.chartboost.sdk.e.a(optJSONObject3.optString("border-color")));
                c2.c(com.chartboost.sdk.e.a(optJSONObject3.optString("progress-color")));
                c2.b((float) optJSONObject3.optDouble("radius", 0.0d));
            }
            if (optJSONObject4 != null && !optJSONObject4.isNull("color")) {
                this.h.a(com.chartboost.sdk.e.a(optJSONObject4.optString("color")));
            }
            if (v.this.e.n == 2 && v.this.A && (optJSONObject2 = v.this.x.optJSONObject("post-video-toaster")) != null) {
                this.j.a(optJSONObject2.optString(TJAdUnitConstants.String.TITLE), optJSONObject2.optString("tagline"));
            }
            if (v.this.e.n == 2 && v.this.z && (optJSONObject = v.this.x.optJSONObject("confirmation")) != null) {
                this.i.a(optJSONObject.optString("text"), com.chartboost.sdk.e.a(optJSONObject.optString("color")));
            }
            if (v.this.e.n == 2 && v.this.B) {
                JSONObject a3 = com.chartboost.sdk.Libraries.e.a(v.this.x, "post-video-reward-toaster");
                this.k.a((a3 == null || !a3.optString("position").equals("inside-top")) ? 1 : 0);
                this.k.a(a3 != null ? a3.optString("text") : "");
                if (v.this.J.c()) {
                    this.k.a(v.this.L);
                }
            }
            JSONObject g = v.this.g();
            if (g == null || g.isNull("video-click-button")) {
                this.h.d();
            }
            this.h.d(v.this.x.optBoolean("video-progress-timer-enabled"));
            if (v.this.O || v.this.N) {
                this.f.setVisibility(4);
            }
            String[] strArr = new String[1];
            strArr[0] = CBUtility.a(v.this.a()) ? "video-portrait" : "video-landscape";
            JSONObject a4 = com.chartboost.sdk.Libraries.e.a(g, strArr);
            v.this.u = a4 != null ? a4.optString("id") : "";
            if (v.this.u.isEmpty()) {
                v.this.a(CBError.CBImpressionError.VIDEO_ID_MISSING);
                return;
            }
            if (v.this.t == null) {
                v.this.t = v.this.q.a(v.this.u);
            }
            if (v.this.t == null) {
                v.this.a(CBError.CBImpressionError.VIDEO_UNAVAILABLE);
            } else {
                this.h.a(v.this.t);
            }
        }

        @Override // com.chartboost.sdk.impl.u.a
        protected void c() {
            super.c();
            if (v.this.r == 0 && (!v.this.z || v.this.o())) {
                b(false);
            } else {
                a(v.this.r, false);
            }
        }

        public void e() {
            c(true);
            this.h.h();
            v.this.s++;
            if (v.this.s > 1 || v.this.u() || v.this.v < 1) {
                return;
            }
            v.this.e.e();
        }

        @Override // com.chartboost.sdk.impl.u.a, com.chartboost.sdk.e.a
        protected void a(int i, int i2) {
            super.a(i, i2);
            a(v.this.r, false);
            boolean a2 = CBUtility.a(v.this.a());
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -1);
            RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-1, -1);
            RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-1, -1);
            RelativeLayout.LayoutParams layoutParams6 = (RelativeLayout.LayoutParams) this.f3864c.getLayoutParams();
            v.this.a(layoutParams2, a2 ? v.this.F : v.this.E, 1.0f);
            Point b2 = v.this.b(a2 ? "replay-portrait" : "replay-landscape");
            int round = Math.round(((layoutParams6.leftMargin + (layoutParams6.width / 2.0f)) + b2.x) - (layoutParams2.width / 2.0f));
            int round2 = Math.round(((layoutParams6.topMargin + (layoutParams6.height / 2.0f)) + b2.y) - (layoutParams2.height / 2.0f));
            layoutParams2.leftMargin = Math.min(Math.max(0, round), i - layoutParams2.width);
            layoutParams2.topMargin = Math.min(Math.max(0, round2), i2 - layoutParams2.height);
            this.m.bringToFront();
            if (a2) {
                this.m.a(v.this.F);
            } else {
                this.m.a(v.this.E);
            }
            RelativeLayout.LayoutParams layoutParams7 = (RelativeLayout.LayoutParams) this.e.getLayoutParams();
            if (!v.this.s()) {
                layoutParams3.width = layoutParams7.width;
                layoutParams3.height = layoutParams7.height;
                layoutParams3.leftMargin = layoutParams7.leftMargin;
                layoutParams3.topMargin = layoutParams7.topMargin;
                layoutParams4.width = layoutParams7.width;
                layoutParams4.height = layoutParams7.height;
                layoutParams4.leftMargin = layoutParams7.leftMargin;
                layoutParams4.topMargin = layoutParams7.topMargin;
            } else {
                RelativeLayout.LayoutParams layoutParams8 = new RelativeLayout.LayoutParams(-2, -2);
                com.chartboost.sdk.Libraries.h hVar = a2 ? v.this.l : v.this.m;
                v.this.a(layoutParams8, hVar, 1.0f);
                layoutParams8.leftMargin = 0;
                layoutParams8.topMargin = 0;
                layoutParams8.addRule(11);
                this.o.setLayoutParams(layoutParams8);
                this.o.a(hVar);
            }
            layoutParams5.width = layoutParams7.width;
            layoutParams5.height = 72;
            layoutParams5.leftMargin = layoutParams7.leftMargin;
            layoutParams5.topMargin = (layoutParams7.topMargin + layoutParams7.height) - 72;
            if (v.this.N) {
                this.n.setLayoutParams(layoutParams);
            }
            if (v.this.e.n == 2) {
                this.i.setLayoutParams(layoutParams3);
            }
            this.h.setLayoutParams(layoutParams4);
            this.j.setLayoutParams(layoutParams5);
            this.m.setLayoutParams(layoutParams2);
            if (v.this.e.n == 2) {
                this.i.a();
            }
            this.h.a();
        }

        void b(boolean z) {
            if (v.this.r == 1) {
                return;
            }
            if (v.this.z) {
                a(0, z);
                return;
            }
            a(1, z);
            JSONObject a2 = com.chartboost.sdk.Libraries.e.a(v.this.x, "timer");
            if (v.this.s < 1 && a2 != null && !a2.isNull("delay")) {
                Object[] objArr = new Object[1];
                objArr[0] = v.this.y ? TJAdUnitConstants.String.VISIBLE : "hidden";
                CBLogging.c("InterstitialVideoViewProtocol", String.format("controls starting %s, setting timer", objArr));
                this.h.b(v.this.y);
                v.this.a(this.h, new Runnable() { // from class: com.chartboost.sdk.impl.v.a.3
                    @Override // java.lang.Runnable
                    public void run() {
                        Object[] objArr2 = new Object[1];
                        objArr2[0] = v.this.y ? "hidden" : "shown";
                        CBLogging.c("InterstitialVideoViewProtocol", String.format("controls %s automatically from timer", objArr2));
                        a.this.h.a(!v.this.y, true);
                        synchronized (v.this.g) {
                            v.this.g.remove(a.this.h);
                        }
                    }
                }, Math.round(a2.optDouble("delay", 0.0d) * 1000.0d));
            } else {
                this.h.b(!v.this.y);
            }
            this.h.e();
            if (v.this.s <= 1) {
                v.this.e.f();
            }
        }

        void c(boolean z) {
            this.h.f();
            if (v.this.r == 1 && z) {
                if (v.this.s < 1 && v.this.x != null && !v.this.x.isNull("post-video-reward-toaster") && v.this.B && v.this.J.c() && v.this.K.c()) {
                    e(true);
                }
                a(2, true);
                if (CBUtility.a(CBUtility.a())) {
                    requestLayout();
                }
            }
        }

        private void e(boolean z) {
            if (z) {
                this.k.a(true);
            } else {
                this.k.setVisibility(0);
            }
            v.this.f3650a.postDelayed(new Runnable() { // from class: com.chartboost.sdk.impl.v.a.4
                @Override // java.lang.Runnable
                public void run() {
                    a.this.k.a(false);
                }
            }, 2500L);
        }

        private void a(int i, boolean z) {
            v.this.r = i;
            switch (i) {
                case 0:
                    v.this.a(!v.this.s(), this.e, z);
                    if (v.this.e.n == 2) {
                        v.this.a(true, (View) this.i, z);
                    }
                    if (v.this.N) {
                        v.this.a(false, this.n, z);
                    }
                    v.this.a(false, (View) this.h, z);
                    v.this.a(false, (View) this.m, z);
                    v.this.a(false, (View) this.j, z);
                    this.e.setEnabled(false);
                    this.m.setEnabled(false);
                    this.h.setEnabled(false);
                    break;
                case 1:
                    v.this.a(false, (View) this.e, z);
                    if (v.this.e.n == 2) {
                        v.this.a(false, (View) this.i, z);
                    }
                    if (v.this.N) {
                        v.this.a(true, this.n, z);
                    }
                    v.this.a(true, (View) this.h, z);
                    v.this.a(false, (View) this.m, z);
                    v.this.a(false, (View) this.j, z);
                    this.e.setEnabled(true);
                    this.m.setEnabled(false);
                    this.h.setEnabled(true);
                    break;
                case 2:
                    v.this.a(true, (View) this.e, z);
                    if (v.this.e.n == 2) {
                        v.this.a(false, (View) this.i, z);
                    }
                    if (v.this.N) {
                        v.this.a(false, this.n, z);
                    }
                    v.this.a(false, (View) this.h, z);
                    v.this.a(true, (View) this.m, z);
                    v.this.a(v.this.K.c() && v.this.J.c() && v.this.A, this.j, z);
                    this.m.setEnabled(true);
                    this.e.setEnabled(true);
                    this.h.setEnabled(false);
                    if (v.this.C) {
                        e(false);
                        break;
                    }
                    break;
            }
            boolean f = f();
            az d2 = d(true);
            d2.setEnabled(f);
            v.this.a(f, d2, z);
            az d3 = d(false);
            d3.setEnabled(false);
            v.this.a(false, (View) d3, z);
            if (v.this.O || v.this.N) {
                v.this.a(!v.this.s(), this.f, z);
            }
            v.this.a(!v.this.s(), this.f3864c, z);
            a(i != 0);
        }

        protected boolean f() {
            if (v.this.r == 1 && v.this.s < 1) {
                StringBuilder sb = new StringBuilder();
                sb.append("close-");
                sb.append(CBUtility.a(v.this.a()) ? TJAdUnitConstants.String.PORTRAIT : TJAdUnitConstants.String.LANDSCAPE);
                JSONObject a2 = com.chartboost.sdk.Libraries.e.a(v.this.g(), sb.toString());
                float optDouble = a2 != null ? (float) a2.optDouble("delay", -1.0d) : -1.0f;
                int round = optDouble >= 0.0f ? Math.round(optDouble * 1000.0f) : -1;
                v.this.D = round;
                if (round < 0 || round > this.h.b().d()) {
                    return false;
                }
            }
            return true;
        }

        @Override // com.chartboost.sdk.impl.u.a, com.chartboost.sdk.e.a
        public void b() {
            v.this.n();
            super.b();
        }

        @Override // com.chartboost.sdk.impl.u.a
        protected void d() {
            if (v.this.r == 1 && v.this.e.f3617a.f3806a == 1) {
                return;
            }
            if (v.this.r == 1) {
                c(false);
                this.h.h();
                if (v.this.s < 1) {
                    v.this.s++;
                    v.this.e.e();
                }
            }
            v.this.f3650a.post(new Runnable() { // from class: com.chartboost.sdk.impl.v.a.5
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        v.this.h();
                    } catch (Exception e) {
                        com.chartboost.sdk.Tracking.a.a(a.class, "onCloseButton Runnable.run", e);
                    }
                }
            });
        }

        @Override // com.chartboost.sdk.impl.u.a
        protected void a(float f, float f2, float f3, float f4) {
            if ((v.this.y && v.this.r == 1) || v.this.r == 0) {
                return;
            }
            b(f, f2, f3, f4);
        }

        protected void b(float f, float f2, float f3, float f4) {
            if (v.this.r == 1) {
                c(false);
            }
            v.this.b(com.chartboost.sdk.Libraries.e.a(com.chartboost.sdk.Libraries.e.a("x", Float.valueOf(f)), com.chartboost.sdk.Libraries.e.a("y", Float.valueOf(f2)), com.chartboost.sdk.Libraries.e.a("w", Float.valueOf(f3)), com.chartboost.sdk.Libraries.e.a("h", Float.valueOf(f4))));
        }

        protected void g() {
            v.this.z = false;
            b(true);
        }

        public az d(boolean z) {
            return (!(v.this.s() && z) && (v.this.s() || z)) ? this.f3865d : this.o;
        }
    }

    public v(com.chartboost.sdk.Model.c cVar, com.chartboost.sdk.Libraries.f fVar, Handler handler, com.chartboost.sdk.c cVar2) {
        super(cVar, handler, cVar2);
        this.r = 0;
        this.P = false;
        this.v = 0;
        this.w = 0;
        this.Q = false;
        this.R = false;
        this.C = false;
        this.D = 0;
        this.M = false;
        this.N = false;
        this.O = false;
        this.q = fVar;
        this.r = 0;
        this.E = new com.chartboost.sdk.Libraries.h(this);
        this.F = new com.chartboost.sdk.Libraries.h(this);
        this.G = new com.chartboost.sdk.Libraries.h(this);
        this.H = new com.chartboost.sdk.Libraries.h(this);
        this.I = new com.chartboost.sdk.Libraries.h(this);
        this.J = new com.chartboost.sdk.Libraries.h(this);
        this.K = new com.chartboost.sdk.Libraries.h(this);
        this.L = new com.chartboost.sdk.Libraries.h(this);
        this.s = 0;
    }

    public boolean o() {
        return this.e.n == 1;
    }

    @Override // com.chartboost.sdk.impl.u, com.chartboost.sdk.e
    protected e.a b(Context context) {
        return new a(context);
    }

    @Override // com.chartboost.sdk.e
    public boolean l() {
        e().d();
        return true;
    }

    @Override // com.chartboost.sdk.e
    public void m() {
        super.m();
        if (this.r == 1 && this.P) {
            e().h.b().a(this.v);
            e().h.e();
        }
        this.P = false;
    }

    @Override // com.chartboost.sdk.e
    public void n() {
        super.n();
        if (this.r != 1 || this.P) {
            return;
        }
        this.P = true;
        e().h.g();
    }

    @Override // com.chartboost.sdk.impl.u, com.chartboost.sdk.e
    public boolean a(JSONObject jSONObject) {
        if (!super.a(jSONObject)) {
            return false;
        }
        this.x = jSONObject.optJSONObject("ux");
        if (this.x == null) {
            this.x = com.chartboost.sdk.Libraries.e.a(new e.a[0]);
        }
        if (this.f3653d.isNull("video-landscape") || this.f3653d.isNull("replay-landscape")) {
            this.i = false;
        }
        if (!this.E.a("replay-landscape") || !this.F.a("replay-portrait") || !this.I.a("video-click-button") || !this.J.a("post-video-reward-icon") || !this.K.a("post-video-button") || !this.G.a("video-confirmation-button") || !this.H.a("video-confirmation-icon") || !this.L.a("post-video-reward-icon")) {
            CBLogging.b("InterstitialVideoViewProtocol", "Error while downloading the assets");
            a(CBError.CBImpressionError.ASSETS_DOWNLOAD_FAILURE);
            return false;
        }
        this.y = this.x.optBoolean("video-controls-togglable");
        this.N = jSONObject.optBoolean(VideoEvent.EVENT_FULL_SCREEN);
        this.O = jSONObject.optBoolean("preroll_popup_fullscreen");
        if (this.e.n == 2) {
            JSONObject optJSONObject = this.x.optJSONObject("confirmation");
            JSONObject optJSONObject2 = this.x.optJSONObject("post-video-toaster");
            if (optJSONObject2 != null && !optJSONObject2.isNull(TJAdUnitConstants.String.TITLE) && !optJSONObject2.isNull("tagline")) {
                this.A = true;
            }
            if (optJSONObject != null && !optJSONObject.isNull("text") && !optJSONObject.isNull("color")) {
                this.z = true;
            }
            if (!this.x.isNull("post-video-reward-toaster")) {
                this.B = true;
            }
        }
        return true;
    }

    @Override // com.chartboost.sdk.e
    protected void i() {
        if (this.z && (!this.G.c() || !this.H.c())) {
            this.z = false;
        }
        super.i();
    }

    @Override // com.chartboost.sdk.impl.u, com.chartboost.sdk.e
    public void d() {
        super.d();
        this.E = null;
        this.F = null;
        this.I = null;
        this.J = null;
        this.K = null;
        this.G = null;
        this.H = null;
        this.L = null;
    }

    public boolean p() {
        return this.r == 1;
    }

    @Override // com.chartboost.sdk.e
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public a e() {
        return (a) super.e();
    }

    protected void r() {
        this.e.p();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:3:0x0007 A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected boolean s() {
        switch (this.r) {
            case 0:
                return this.O || CBUtility.a(CBUtility.a());
            case 1:
                if (!this.N && !CBUtility.a(CBUtility.a())) {
                    return false;
                }
                break;
            case 2:
                return false;
        }
    }

    public boolean t() {
        return this.Q;
    }

    public void a(boolean z) {
        this.Q = z;
    }

    public boolean u() {
        return this.R;
    }

    public void v() {
        if (this.t != null) {
            new File(this.t).delete();
        }
        this.R = true;
        a(CBError.CBImpressionError.ERROR_PLAYING_VIDEO);
    }

    @Override // com.chartboost.sdk.e
    public float j() {
        return this.w;
    }

    @Override // com.chartboost.sdk.e
    public float k() {
        return this.v;
    }
}
