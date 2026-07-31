package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class gq0 extends FrameLayout implements yp0 {

    /* renamed from: f, reason: collision with root package name */
    private final tq0 f5712f;

    /* renamed from: g, reason: collision with root package name */
    private final FrameLayout f5713g;

    /* renamed from: h, reason: collision with root package name */
    private final View f5714h;

    /* renamed from: i, reason: collision with root package name */
    private final b20 f5715i;

    /* renamed from: j, reason: collision with root package name */
    private final vq0 f5716j;

    /* renamed from: k, reason: collision with root package name */
    private final long f5717k;

    /* renamed from: l, reason: collision with root package name */
    private final zp0 f5718l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f5719m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f5720n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f5721o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f5722p;

    /* renamed from: q, reason: collision with root package name */
    private long f5723q;

    /* renamed from: r, reason: collision with root package name */
    private long f5724r;

    /* renamed from: s, reason: collision with root package name */
    private String f5725s;

    /* renamed from: t, reason: collision with root package name */
    private String[] f5726t;

    /* renamed from: u, reason: collision with root package name */
    private Bitmap f5727u;

    /* renamed from: v, reason: collision with root package name */
    private final ImageView f5728v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f5729w;

    public gq0(Context context, tq0 tq0Var, int i7, boolean z6, b20 b20Var, sq0 sq0Var) {
        super(context);
        zp0 kr0Var;
        this.f5712f = tq0Var;
        this.f5715i = b20Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f5713g = frameLayout;
        addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
        r3.o.i(tq0Var.o());
        aq0 aq0Var = tq0Var.o().f23382a;
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (applicationInfo == null || applicationInfo.targetSdkVersion >= 11) {
            kr0Var = i7 == 2 ? new kr0(context, new uq0(context, tq0Var.l(), tq0Var.y(), b20Var, tq0Var.m()), tq0Var, z6, aq0.a(tq0Var), sq0Var) : new xp0(context, tq0Var, z6, aq0.a(tq0Var), sq0Var, new uq0(context, tq0Var.l(), tq0Var.y(), b20Var, tq0Var.m()));
        } else {
            kr0Var = null;
        }
        this.f5718l = kr0Var;
        View view = new View(context);
        this.f5714h = view;
        view.setBackgroundColor(0);
        if (kr0Var != null) {
            frameLayout.addView(kr0Var, new FrameLayout.LayoutParams(-1, -1, 17));
            if (((Boolean) sw.c().b(m10.A)).booleanValue()) {
                frameLayout.addView(view, new FrameLayout.LayoutParams(-1, -1));
                frameLayout.bringChildToFront(view);
            }
            if (((Boolean) sw.c().b(m10.f8332x)).booleanValue()) {
                u();
            }
        }
        this.f5728v = new ImageView(context);
        this.f5717k = ((Long) sw.c().b(m10.C)).longValue();
        boolean booleanValue = ((Boolean) sw.c().b(m10.f8346z)).booleanValue();
        this.f5722p = booleanValue;
        if (b20Var != null) {
            b20Var.d("spinner_used", true != booleanValue ? "0" : "1");
        }
        this.f5716j = new vq0(this);
        if (kr0Var != null) {
            kr0Var.u(this);
        }
        if (kr0Var == null) {
            a("AdVideoUnderlay Error", "Allocating player failed.");
        }
    }

    private final void q() {
        if (this.f5712f.j() == null || !this.f5720n || this.f5721o) {
            return;
        }
        this.f5712f.j().getWindow().clearFlags(128);
        this.f5720n = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r(String str, String... strArr) {
        HashMap hashMap = new HashMap();
        hashMap.put("event", str);
        String str2 = null;
        for (String str3 : strArr) {
            if (str2 == null) {
                str2 = str3;
            } else {
                hashMap.put(str2, str3);
                str2 = null;
            }
        }
        this.f5712f.t("onVideoEvent", hashMap);
    }

    private final boolean s() {
        return this.f5728v.getParent() != null;
    }

    public final void A() {
        zp0 zp0Var = this.f5718l;
        if (zp0Var == null) {
            return;
        }
        zp0Var.r();
    }

    public final void B() {
        zp0 zp0Var = this.f5718l;
        if (zp0Var == null) {
            return;
        }
        zp0Var.s();
    }

    public final void C(int i7) {
        zp0 zp0Var = this.f5718l;
        if (zp0Var == null) {
            return;
        }
        zp0Var.t(i7);
    }

    @TargetApi(14)
    public final void D(MotionEvent motionEvent) {
        zp0 zp0Var = this.f5718l;
        if (zp0Var == null) {
            return;
        }
        zp0Var.dispatchTouchEvent(motionEvent);
    }

    public final void E(int i7) {
        this.f5718l.z(i7);
    }

    public final void F(int i7) {
        this.f5718l.A(i7);
    }

    public final void G(int i7) {
        this.f5718l.B(i7);
    }

    public final void H(int i7) {
        this.f5718l.C(i7);
    }

    @Override // com.google.android.gms.internal.ads.yp0
    public final void a(String str, String str2) {
        r("error", "what", str, "extra", str2);
    }

    @Override // com.google.android.gms.internal.ads.yp0
    public final void b() {
        if (this.f5712f.j() != null && !this.f5720n) {
            boolean z6 = (this.f5712f.j().getWindow().getAttributes().flags & 128) != 0;
            this.f5721o = z6;
            if (!z6) {
                this.f5712f.j().getWindow().addFlags(128);
                this.f5720n = true;
            }
        }
        this.f5719m = true;
    }

    @Override // com.google.android.gms.internal.ads.yp0
    public final void c(int i7, int i8) {
        if (this.f5722p) {
            e10<Integer> e10Var = m10.B;
            int max = Math.max(i7 / ((Integer) sw.c().b(e10Var)).intValue(), 1);
            int max2 = Math.max(i8 / ((Integer) sw.c().b(e10Var)).intValue(), 1);
            Bitmap bitmap = this.f5727u;
            if (bitmap != null && bitmap.getWidth() == max && this.f5727u.getHeight() == max2) {
                return;
            }
            this.f5727u = Bitmap.createBitmap(max, max2, Bitmap.Config.ARGB_8888);
            this.f5729w = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.yp0
    public final void d() {
        if (this.f5718l != null && this.f5724r == 0) {
            r("canplaythrough", "duration", String.valueOf(r0.i() / 1000.0f), "videoWidth", String.valueOf(this.f5718l.k()), "videoHeight", String.valueOf(this.f5718l.j()));
        }
    }

    @Override // com.google.android.gms.internal.ads.yp0
    public final void e() {
        this.f5714h.setVisibility(4);
    }

    @Override // com.google.android.gms.internal.ads.yp0
    public final void f() {
        this.f5716j.b();
        a3.g2.f72i.post(new dq0(this));
    }

    public final void finalize() {
        try {
            this.f5716j.a();
            final zp0 zp0Var = this.f5718l;
            if (zp0Var != null) {
                wo0.f13898e.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.bq0
                    @Override // java.lang.Runnable
                    public final void run() {
                        zp0.this.w();
                    }
                });
            }
        } finally {
            super.finalize();
        }
    }

    @Override // com.google.android.gms.internal.ads.yp0
    public final void g() {
        r("pause", new String[0]);
        q();
        this.f5719m = false;
    }

    @Override // com.google.android.gms.internal.ads.yp0
    public final void h() {
        if (this.f5729w && this.f5727u != null && !s()) {
            this.f5728v.setImageBitmap(this.f5727u);
            this.f5728v.invalidate();
            this.f5713g.addView(this.f5728v, new FrameLayout.LayoutParams(-1, -1));
            this.f5713g.bringChildToFront(this.f5728v);
        }
        this.f5716j.a();
        this.f5724r = this.f5723q;
        a3.g2.f72i.post(new eq0(this));
    }

    public final void i(int i7) {
        if (((Boolean) sw.c().b(m10.A)).booleanValue()) {
            this.f5713g.setBackgroundColor(i7);
            this.f5714h.setBackgroundColor(i7);
        }
    }

    @Override // com.google.android.gms.internal.ads.yp0
    public final void j() {
        if (this.f5719m && s()) {
            this.f5713g.removeView(this.f5728v);
        }
        if (this.f5727u == null) {
            return;
        }
        long a7 = y2.t.a().a();
        if (this.f5718l.getBitmap(this.f5727u) != null) {
            this.f5729w = true;
        }
        long a8 = y2.t.a().a() - a7;
        if (a3.r1.m()) {
            StringBuilder sb = new StringBuilder(46);
            sb.append("Spinner frame grab took ");
            sb.append(a8);
            sb.append("ms");
            a3.r1.k(sb.toString());
        }
        if (a8 > this.f5717k) {
            io0.g("Spinner frame grab crossed jank threshold! Suspending spinner.");
            this.f5722p = false;
            this.f5727u = null;
            b20 b20Var = this.f5715i;
            if (b20Var != null) {
                b20Var.d("spinner_jank", Long.toString(a8));
            }
        }
    }

    public final void k(int i7) {
        this.f5718l.a(i7);
    }

    public final void l(String str, String[] strArr) {
        this.f5725s = str;
        this.f5726t = strArr;
    }

    public final void m(int i7, int i8, int i9, int i10) {
        if (a3.r1.m()) {
            StringBuilder sb = new StringBuilder(75);
            sb.append("Set video bounds to x:");
            sb.append(i7);
            sb.append(";y:");
            sb.append(i8);
            sb.append(";w:");
            sb.append(i9);
            sb.append(";h:");
            sb.append(i10);
            a3.r1.k(sb.toString());
        }
        if (i9 == 0 || i10 == 0) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i9, i10);
        layoutParams.setMargins(i7, i8, 0, 0);
        this.f5713g.setLayoutParams(layoutParams);
        requestLayout();
    }

    public final void n(float f7) {
        zp0 zp0Var = this.f5718l;
        if (zp0Var == null) {
            return;
        }
        zp0Var.f15217g.e(f7);
        zp0Var.m();
    }

    public final void o(float f7, float f8) {
        zp0 zp0Var = this.f5718l;
        if (zp0Var != null) {
            zp0Var.y(f7, f8);
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(final boolean z6) {
        super.onWindowFocusChanged(z6);
        vq0 vq0Var = this.f5716j;
        if (z6) {
            vq0Var.b();
        } else {
            vq0Var.a();
            this.f5724r = this.f5723q;
        }
        a3.g2.f72i.post(new Runnable() { // from class: com.google.android.gms.internal.ads.cq0
            @Override // java.lang.Runnable
            public final void run() {
                gq0.this.w(z6);
            }
        });
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.yp0
    public final void onWindowVisibilityChanged(int i7) {
        boolean z6;
        super.onWindowVisibilityChanged(i7);
        if (i7 == 0) {
            this.f5716j.b();
            z6 = true;
        } else {
            this.f5716j.a();
            this.f5724r = this.f5723q;
            z6 = false;
        }
        a3.g2.f72i.post(new fq0(this, z6));
    }

    public final void p() {
        zp0 zp0Var = this.f5718l;
        if (zp0Var == null) {
            return;
        }
        zp0Var.f15217g.d(false);
        zp0Var.m();
    }

    @TargetApi(14)
    public final void u() {
        zp0 zp0Var = this.f5718l;
        if (zp0Var == null) {
            return;
        }
        TextView textView = new TextView(zp0Var.getContext());
        String valueOf = String.valueOf(this.f5718l.q());
        textView.setText(valueOf.length() != 0 ? "AdMob - ".concat(valueOf) : new String("AdMob - "));
        textView.setTextColor(-65536);
        textView.setBackgroundColor(-256);
        this.f5713g.addView(textView, new FrameLayout.LayoutParams(-2, -2, 17));
        this.f5713g.bringChildToFront(textView);
    }

    public final void v() {
        this.f5716j.a();
        zp0 zp0Var = this.f5718l;
        if (zp0Var != null) {
            zp0Var.w();
        }
        q();
    }

    final /* synthetic */ void w(boolean z6) {
        r("windowFocusChanged", "hasWindowFocus", String.valueOf(z6));
    }

    public final void x() {
        if (this.f5718l == null) {
            return;
        }
        if (TextUtils.isEmpty(this.f5725s)) {
            r("no_src", new String[0]);
        } else {
            this.f5718l.f(this.f5725s, this.f5726t);
        }
    }

    public final void y() {
        zp0 zp0Var = this.f5718l;
        if (zp0Var == null) {
            return;
        }
        zp0Var.f15217g.d(true);
        zp0Var.m();
    }

    final void z() {
        zp0 zp0Var = this.f5718l;
        if (zp0Var == null) {
            return;
        }
        long g7 = zp0Var.g();
        if (this.f5723q == g7 || g7 <= 0) {
            return;
        }
        float f7 = g7 / 1000.0f;
        if (((Boolean) sw.c().b(m10.f8290r1)).booleanValue()) {
            r("timeupdate", "time", String.valueOf(f7), "totalBytes", String.valueOf(this.f5718l.p()), "qoeCachedBytes", String.valueOf(this.f5718l.l()), "qoeLoadedBytes", String.valueOf(this.f5718l.o()), "droppedFrames", String.valueOf(this.f5718l.h()), "reportTime", String.valueOf(y2.t.a().b()));
        } else {
            r("timeupdate", "time", String.valueOf(f7));
        }
        this.f5723q = g7;
    }

    @Override // com.google.android.gms.internal.ads.yp0
    public final void z0(String str, String str2) {
        r("exception", "what", "ExoPlayerAdapter exception", "extra", str2);
    }

    @Override // com.google.android.gms.internal.ads.yp0
    public final void zza() {
        r("ended", new String[0]);
        q();
    }
}
