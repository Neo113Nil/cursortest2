package com.chartboost.sdk.impl;

import android.content.Context;
import android.graphics.Point;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.chartboost.sdk.Libraries.CBLogging;
import com.chartboost.sdk.Libraries.CBUtility;
import com.chartboost.sdk.Model.CBError;
import com.chartboost.sdk.e;
import com.mopub.mobileads.VastIconXmlManager;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class u extends com.chartboost.sdk.e {
    com.chartboost.sdk.Libraries.h j;
    com.chartboost.sdk.Libraries.h k;
    com.chartboost.sdk.Libraries.h l;
    com.chartboost.sdk.Libraries.h m;
    com.chartboost.sdk.Libraries.h n;
    com.chartboost.sdk.Libraries.h o;
    protected float p;
    private final String q;

    public class a extends e.a {

        /* renamed from: c, reason: collision with root package name */
        protected ay f3864c;

        /* renamed from: d, reason: collision with root package name */
        protected az f3865d;
        protected az e;
        protected ImageView f;
        private boolean h;

        protected a(Context context) {
            super(context);
            this.h = false;
            setBackgroundColor(0);
            setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
            com.chartboost.sdk.g a2 = com.chartboost.sdk.g.a();
            this.f3864c = (ay) a2.a(new ay(context));
            addView(this.f3864c, new RelativeLayout.LayoutParams(-1, -1));
            this.e = (az) a2.a(new az(context) { // from class: com.chartboost.sdk.impl.u.a.1
                @Override // com.chartboost.sdk.impl.az
                protected void a(MotionEvent motionEvent) {
                    a.this.a(motionEvent.getX(), motionEvent.getY(), a.this.e.getWidth(), a.this.e.getHeight());
                }
            });
            a(this.e);
            this.e.setContentDescription("CBAd");
            this.f = (ImageView) a2.a(new ImageView(context));
            this.f.setBackgroundColor(-16777216);
            addView(this.f);
            addView(this.e);
        }

        protected void c() {
            this.f3865d = new az(getContext()) { // from class: com.chartboost.sdk.impl.u.a.2
                @Override // com.chartboost.sdk.impl.az
                protected void a(MotionEvent motionEvent) {
                    a.this.d();
                }
            };
            this.f3865d.setContentDescription("CBClose");
            addView(this.f3865d);
        }

        protected void a(float f, float f2, float f3, float f4) {
            u.this.b(com.chartboost.sdk.Libraries.e.a(com.chartboost.sdk.Libraries.e.a("x", Float.valueOf(f)), com.chartboost.sdk.Libraries.e.a("y", Float.valueOf(f2)), com.chartboost.sdk.Libraries.e.a("w", Float.valueOf(f3)), com.chartboost.sdk.Libraries.e.a("h", Float.valueOf(f4))));
        }

        @Override // com.chartboost.sdk.e.a
        protected void a(int i, int i2) {
            int round;
            int i3;
            if (!this.h) {
                c();
                this.h = true;
            }
            boolean a2 = CBUtility.a(u.this.a());
            com.chartboost.sdk.Libraries.h hVar = a2 ? u.this.j : u.this.k;
            com.chartboost.sdk.Libraries.h hVar2 = a2 ? u.this.l : u.this.m;
            if (!hVar.c()) {
                if (hVar == u.this.j) {
                    hVar = u.this.k;
                } else {
                    hVar = u.this.j;
                }
            }
            if (!hVar2.c()) {
                if (hVar2 == u.this.l) {
                    hVar2 = u.this.m;
                } else {
                    hVar2 = u.this.l;
                }
            }
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
            u.this.a(layoutParams, hVar, 1.0f);
            u.this.p = Math.min(Math.min(i / layoutParams.width, i2 / layoutParams.height), 1.0f);
            layoutParams.width = (int) (layoutParams.width * u.this.p);
            layoutParams.height = (int) (layoutParams.height * u.this.p);
            Point b2 = u.this.b(a2 ? "frame-portrait" : "frame-landscape");
            layoutParams.leftMargin = Math.round(((i - layoutParams.width) / 2.0f) + ((b2.x / hVar.e()) * u.this.p));
            layoutParams.topMargin = Math.round(((i2 - layoutParams.height) / 2.0f) + ((b2.y / hVar.e()) * u.this.p));
            u.this.a(layoutParams2, hVar2, 1.0f);
            Point b3 = u.this.b(a2 ? "close-portrait" : "close-landscape");
            if (b3.x == 0 && b3.y == 0) {
                i3 = layoutParams.leftMargin + layoutParams.width + Math.round((-layoutParams2.width) / 2.0f);
                round = layoutParams.topMargin + Math.round((-layoutParams2.height) / 2.0f);
            } else {
                int round2 = Math.round(((layoutParams.leftMargin + (layoutParams.width / 2.0f)) + b3.x) - (layoutParams2.width / 2.0f));
                round = Math.round(((layoutParams.topMargin + (layoutParams.height / 2.0f)) + b3.y) - (layoutParams2.height / 2.0f));
                i3 = round2;
            }
            layoutParams2.leftMargin = Math.min(Math.max(0, i3), i - layoutParams2.width);
            layoutParams2.topMargin = Math.min(Math.max(0, round), i2 - layoutParams2.height);
            this.f3864c.setLayoutParams(layoutParams);
            this.f3865d.setLayoutParams(layoutParams2);
            this.f3864c.setScaleType(ImageView.ScaleType.FIT_CENTER);
            this.f3864c.a(hVar);
            this.f3865d.a(hVar2);
            com.chartboost.sdk.Libraries.h hVar3 = a2 ? u.this.n : u.this.o;
            if (!hVar3.c()) {
                if (hVar3 == u.this.n) {
                    hVar3 = u.this.o;
                } else {
                    hVar3 = u.this.n;
                }
            }
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
            u.this.a(layoutParams3, hVar3, u.this.p);
            Point b4 = u.this.b(a2 ? "ad-portrait" : "ad-landscape");
            layoutParams3.leftMargin = Math.round(((i - layoutParams3.width) / 2.0f) + ((b4.x / hVar3.e()) * u.this.p));
            layoutParams3.topMargin = Math.round(((i2 - layoutParams3.height) / 2.0f) + ((b4.y / hVar3.e()) * u.this.p));
            this.f.setLayoutParams(layoutParams3);
            this.e.setLayoutParams(layoutParams3);
            this.e.a(ImageView.ScaleType.FIT_CENTER);
            this.e.a(hVar3);
        }

        protected void d() {
            u.this.h();
        }

        @Override // com.chartboost.sdk.e.a
        public void b() {
            super.b();
            this.f3864c = null;
            this.f3865d = null;
            this.e = null;
            this.f = null;
        }
    }

    public u(com.chartboost.sdk.Model.c cVar, Handler handler, com.chartboost.sdk.c cVar2) {
        super(cVar, handler, cVar2);
        this.q = "ImageViewProtocol";
        this.p = 1.0f;
        this.j = new com.chartboost.sdk.Libraries.h(this);
        this.k = new com.chartboost.sdk.Libraries.h(this);
        this.l = new com.chartboost.sdk.Libraries.h(this);
        this.m = new com.chartboost.sdk.Libraries.h(this);
        this.n = new com.chartboost.sdk.Libraries.h(this);
        this.o = new com.chartboost.sdk.Libraries.h(this);
    }

    @Override // com.chartboost.sdk.e
    protected e.a b(Context context) {
        return new a(context);
    }

    @Override // com.chartboost.sdk.e
    public boolean a(JSONObject jSONObject) {
        if (!super.a(jSONObject)) {
            return false;
        }
        if (this.f3653d.isNull("frame-portrait") || this.f3653d.isNull("close-portrait")) {
            this.h = false;
        }
        if (this.f3653d.isNull("frame-landscape") || this.f3653d.isNull("close-landscape")) {
            this.i = false;
        }
        if (this.f3653d.isNull("ad-portrait")) {
            this.h = false;
        }
        if (this.f3653d.isNull("ad-landscape")) {
            this.i = false;
        }
        if (this.k.a("frame-landscape") && this.j.a("frame-portrait") && this.m.a("close-landscape") && this.l.a("close-portrait") && this.o.a("ad-landscape") && this.n.a("ad-portrait")) {
            return true;
        }
        CBLogging.b("ImageViewProtocol", "Error while downloading the assets");
        a(CBError.CBImpressionError.ASSETS_DOWNLOAD_FAILURE);
        return false;
    }

    protected Point b(String str) {
        JSONObject a2 = com.chartboost.sdk.Libraries.e.a(this.f3653d, str, VastIconXmlManager.OFFSET);
        if (a2 != null) {
            return new Point(a2.optInt("x"), a2.optInt("y"));
        }
        return new Point(0, 0);
    }

    public void a(ViewGroup.LayoutParams layoutParams, com.chartboost.sdk.Libraries.h hVar, float f) {
        if (hVar == null || !hVar.c()) {
            return;
        }
        layoutParams.width = (int) ((hVar.a() / hVar.e()) * f);
        layoutParams.height = (int) ((hVar.b() / hVar.e()) * f);
    }

    @Override // com.chartboost.sdk.e
    public void d() {
        super.d();
        this.k = null;
        this.j = null;
        this.m = null;
        this.l = null;
        this.o = null;
        this.n = null;
    }
}
