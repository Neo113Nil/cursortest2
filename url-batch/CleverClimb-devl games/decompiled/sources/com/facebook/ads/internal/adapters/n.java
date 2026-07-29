package com.facebook.ads.internal.adapters;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.view.GravityCompat;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.ads.internal.adapters.m;
import com.facebook.ads.internal.view.a;
import com.facebook.ads.internal.view.e.c.a;
import com.facebook.ads.internal.view.e.c.d;
import com.google.ads.mediation.facebook.FacebookAdapter;
import com.tapjoy.TJAdUnitConstants;
import java.util.HashMap;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class n extends l implements View.OnTouchListener, com.facebook.ads.internal.view.a {
    static final /* synthetic */ boolean i = !n.class.desiredAssertionStatus();
    private static final String j = n.class.getSimpleName();
    private com.facebook.ads.internal.view.e.a.a C;
    private a.InterfaceC0352a k;
    private Activity l;
    private com.facebook.ads.internal.view.c.a p;
    private TextView q;
    private TextView r;
    private ImageView s;
    private a.C0357a t;
    private com.facebook.ads.internal.view.e.c.n u;
    private ViewGroup v;
    private com.facebook.ads.internal.view.e.c.d w;
    private com.facebook.ads.internal.view.e.c.j x;
    final int f = 64;
    final int g = 64;
    final int h = 16;
    private AudienceNetworkActivity.BackButtonInterceptor m = new AudienceNetworkActivity.BackButtonInterceptor() { // from class: com.facebook.ads.internal.adapters.n.1
        @Override // com.facebook.ads.AudienceNetworkActivity.BackButtonInterceptor
        public boolean interceptBackButton() {
            if (n.this.x == null) {
                return false;
            }
            if (!n.this.x.a()) {
                return true;
            }
            if (n.this.x.getSkipSeconds() != 0 && n.this.f4954b != null) {
                n.this.f4954b.e();
            }
            if (n.this.f4954b != null) {
                n.this.f4954b.f();
            }
            return false;
        }
    };
    private final View.OnTouchListener n = new View.OnTouchListener() { // from class: com.facebook.ads.internal.adapters.n.2
        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() != 1) {
                return true;
            }
            if (n.this.x != null) {
                if (!n.this.x.a()) {
                    return true;
                }
                if (n.this.x.getSkipSeconds() != 0 && n.this.f4954b != null) {
                    n.this.f4954b.e();
                }
                if (n.this.f4954b != null) {
                    n.this.f4954b.f();
                }
            }
            n.this.l.finish();
            return true;
        }
    };
    private m.a o = m.a.UNSPECIFIED;
    private int y = -1;
    private int z = -10525069;
    private int A = -12286980;
    private boolean B = false;

    /* JADX WARN: Removed duplicated region for block: B:44:0x05c5  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void a(int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        View view;
        ViewGroup viewGroup;
        int i7;
        View rootView;
        float f = com.facebook.ads.internal.q.a.v.f5438b;
        int i8 = (int) (56.0f * f);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i8, i8);
        layoutParams.addRule(10);
        layoutParams.addRule(11);
        int i9 = (int) (16.0f * f);
        this.x.setPadding(i9, i9, i9, i9);
        this.x.setLayoutParams(layoutParams);
        d.a aVar = h() ? d.a.FADE_OUT_ON_PLAY : d.a.VISIBLE;
        int id = this.f4954b.getId();
        if (i2 != 1 || (!m() && !n())) {
            if (i2 == 1) {
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams2.addRule(10);
                this.f4954b.setLayoutParams(layoutParams2);
                a(this.f4954b);
                a(this.x);
                if (this.t != null) {
                    a(this.t);
                }
                LinearLayout linearLayout = new LinearLayout(this.f4956d);
                this.v = linearLayout;
                linearLayout.setGravity(112);
                linearLayout.setOrientation(1);
                RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -1);
                int i10 = (int) (33.0f * f);
                layoutParams3.leftMargin = i10;
                layoutParams3.rightMargin = i10;
                layoutParams3.topMargin = (int) (8.0f * f);
                if (this.p == null) {
                    layoutParams3.bottomMargin = i9;
                } else {
                    layoutParams3.bottomMargin = (int) (f * 80.0f);
                }
                layoutParams3.addRule(3, id);
                linearLayout.setLayoutParams(layoutParams3);
                a(linearLayout);
                if (this.p != null) {
                    RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-1, (int) (f * 64.0f));
                    layoutParams4.bottomMargin = i9;
                    layoutParams4.leftMargin = i10;
                    layoutParams4.rightMargin = i10;
                    layoutParams4.addRule(1);
                    layoutParams4.addRule(12);
                    this.p.setLayoutParams(layoutParams4);
                    a(this.p);
                }
                if (this.q != null) {
                    LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams5.weight = 2.0f;
                    layoutParams5.gravity = 17;
                    this.q.setEllipsize(TextUtils.TruncateAt.END);
                    this.q.setGravity(17);
                    this.q.setLayoutParams(layoutParams5);
                    this.q.setMaxLines(2);
                    this.q.setPadding(0, 0, 0, 0);
                    this.q.setTextColor(this.z);
                    this.q.setTextSize(24.0f);
                    a(linearLayout, this.q);
                }
                if (this.s != null) {
                    int i11 = (int) (64.0f * f);
                    LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(i11, i11);
                    layoutParams6.weight = 0.0f;
                    layoutParams6.gravity = 17;
                    this.s.setLayoutParams(layoutParams6);
                    a(linearLayout, this.s);
                }
                if (this.r != null) {
                    LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(-1, -2);
                    layoutParams7.weight = 2.0f;
                    layoutParams7.gravity = 16;
                    this.r.setEllipsize(TextUtils.TruncateAt.END);
                    this.r.setGravity(16);
                    this.r.setLayoutParams(layoutParams7);
                    this.r.setMaxLines(2);
                    this.r.setPadding(0, 0, 0, 0);
                    this.r.setTextColor(this.z);
                    a(linearLayout, this.r);
                }
                if (this.u != null) {
                    RelativeLayout.LayoutParams layoutParams8 = new RelativeLayout.LayoutParams(-1, (int) (f * 6.0f));
                    layoutParams8.addRule(3, id);
                    this.u.setLayoutParams(layoutParams8);
                    view = this.u;
                    a(view);
                }
                viewGroup = (ViewGroup) this.f4954b.getParent();
                i7 = this.y;
            } else if (!o() || n()) {
                GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{0, -15658735});
                gradientDrawable.setCornerRadius(0.0f);
                this.f4954b.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
                a(this.f4954b);
                a(this.x);
                if (this.t != null) {
                    a(this.t);
                }
                RelativeLayout.LayoutParams layoutParams9 = new RelativeLayout.LayoutParams(-1, (int) (124.0f * f));
                layoutParams9.addRule(12);
                RelativeLayout relativeLayout = new RelativeLayout(this.f4956d);
                if (Build.VERSION.SDK_INT >= 16) {
                    relativeLayout.setBackground(gradientDrawable);
                } else {
                    relativeLayout.setBackgroundDrawable(gradientDrawable);
                }
                relativeLayout.setLayoutParams(layoutParams9);
                relativeLayout.setPadding(i9, 0, i9, i9);
                this.v = relativeLayout;
                if (!this.B) {
                    this.w.a(relativeLayout, aVar);
                }
                a(relativeLayout);
                if (this.p != null) {
                    RelativeLayout.LayoutParams layoutParams10 = new RelativeLayout.LayoutParams((int) (110.0f * f), i8);
                    layoutParams10.rightMargin = i9;
                    layoutParams10.bottomMargin = i9;
                    layoutParams10.addRule(12);
                    layoutParams10.addRule(11);
                    this.p.setLayoutParams(layoutParams10);
                    a(this.p);
                }
                if (this.s != null) {
                    int i12 = (int) (64.0f * f);
                    RelativeLayout.LayoutParams layoutParams11 = new RelativeLayout.LayoutParams(i12, i12);
                    layoutParams11.addRule(12);
                    layoutParams11.addRule(9);
                    layoutParams11.bottomMargin = (int) (8.0f * f);
                    this.s.setLayoutParams(layoutParams11);
                    a(relativeLayout, this.s);
                }
                if (this.q != null) {
                    RelativeLayout.LayoutParams layoutParams12 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams12.bottomMargin = (int) (48.0f * f);
                    layoutParams12.addRule(12);
                    layoutParams12.addRule(9);
                    this.q.setEllipsize(TextUtils.TruncateAt.END);
                    this.q.setGravity(GravityCompat.START);
                    this.q.setLayoutParams(layoutParams12);
                    this.q.setMaxLines(1);
                    TextView textView = this.q;
                    int i13 = (int) (f * 80.0f);
                    if (this.p != null) {
                        i6 = (int) (126.0f * f);
                        i5 = 0;
                    } else {
                        i5 = 0;
                        i6 = 0;
                    }
                    textView.setPadding(i13, i5, i6, i5);
                    this.q.setTextColor(-1);
                    this.q.setTextSize(24.0f);
                    a(relativeLayout, this.q);
                }
                if (this.r != null) {
                    RelativeLayout.LayoutParams layoutParams13 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams13.addRule(12);
                    layoutParams13.addRule(9);
                    this.r.setEllipsize(TextUtils.TruncateAt.END);
                    this.r.setGravity(GravityCompat.START);
                    this.r.setLayoutParams(layoutParams13);
                    this.r.setMaxLines(2);
                    this.r.setTextColor(-1);
                    TextView textView2 = this.r;
                    int i14 = (int) (f * 80.0f);
                    if (this.p != null) {
                        i4 = (int) (126.0f * f);
                        i3 = 0;
                    } else {
                        i3 = 0;
                        i4 = 0;
                    }
                    textView2.setPadding(i14, i3, i4, i3);
                    a(relativeLayout, this.r);
                }
                if (this.u != null) {
                    RelativeLayout.LayoutParams layoutParams14 = new RelativeLayout.LayoutParams(-1, (int) (f * 6.0f));
                    layoutParams14.addRule(12);
                    this.u.setLayoutParams(layoutParams14);
                    a(this.u);
                }
            } else {
                RelativeLayout.LayoutParams layoutParams15 = new RelativeLayout.LayoutParams(-2, -1);
                layoutParams15.addRule(9);
                this.f4954b.setLayoutParams(layoutParams15);
                a(this.f4954b);
                a(this.x);
                if (this.t != null) {
                    a(this.t);
                }
                LinearLayout linearLayout2 = new LinearLayout(this.f4956d);
                this.v = linearLayout2;
                linearLayout2.setGravity(112);
                linearLayout2.setOrientation(1);
                RelativeLayout.LayoutParams layoutParams16 = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams16.leftMargin = i9;
                layoutParams16.rightMargin = i9;
                layoutParams16.topMargin = (int) (8.0f * f);
                layoutParams16.bottomMargin = (int) (f * 80.0f);
                layoutParams16.addRule(1, id);
                linearLayout2.setLayoutParams(layoutParams16);
                a(linearLayout2);
                if (this.u != null) {
                    RelativeLayout.LayoutParams layoutParams17 = new RelativeLayout.LayoutParams(-1, (int) (f * 6.0f));
                    layoutParams17.addRule(5, id);
                    layoutParams17.addRule(7, id);
                    layoutParams17.addRule(3, id);
                    layoutParams17.topMargin = (int) ((-6.0f) * f);
                    this.u.setLayoutParams(layoutParams17);
                    a(this.u);
                }
                if (this.q != null) {
                    LinearLayout.LayoutParams layoutParams18 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams18.weight = 2.0f;
                    layoutParams18.gravity = 17;
                    this.q.setEllipsize(TextUtils.TruncateAt.END);
                    this.q.setGravity(17);
                    this.q.setLayoutParams(layoutParams18);
                    this.q.setMaxLines(10);
                    this.q.setPadding(0, 0, 0, 0);
                    this.q.setTextColor(this.z);
                    this.q.setTextSize(24.0f);
                    a(linearLayout2, this.q);
                }
                if (this.s != null) {
                    int i15 = (int) (f * 64.0f);
                    LinearLayout.LayoutParams layoutParams19 = new LinearLayout.LayoutParams(i15, i15);
                    layoutParams19.weight = 0.0f;
                    layoutParams19.gravity = 17;
                    this.s.setLayoutParams(layoutParams19);
                    a(linearLayout2, this.s);
                }
                if (this.r != null) {
                    LinearLayout.LayoutParams layoutParams20 = new LinearLayout.LayoutParams(-1, -2);
                    layoutParams20.weight = 2.0f;
                    layoutParams20.gravity = 16;
                    this.r.setEllipsize(TextUtils.TruncateAt.END);
                    this.r.setGravity(17);
                    this.r.setLayoutParams(layoutParams20);
                    this.r.setMaxLines(10);
                    this.r.setPadding(0, 0, 0, 0);
                    this.r.setTextColor(this.z);
                    a(linearLayout2, this.r);
                }
                if (this.p != null) {
                    RelativeLayout.LayoutParams layoutParams21 = new RelativeLayout.LayoutParams(-1, (int) (f * 64.0f));
                    layoutParams21.bottomMargin = i9;
                    layoutParams21.leftMargin = i9;
                    layoutParams21.rightMargin = i9;
                    layoutParams21.addRule(1);
                    layoutParams21.addRule(12);
                    layoutParams21.addRule(1, id);
                    this.p.setLayoutParams(layoutParams21);
                    view = this.p;
                    a(view);
                }
                viewGroup = (ViewGroup) this.f4954b.getParent();
                i7 = this.y;
            }
            viewGroup.setBackgroundColor(i7);
            rootView = this.f4954b.getRootView();
            if (rootView == null) {
                rootView.setOnTouchListener(this);
                return;
            }
            return;
        }
        GradientDrawable gradientDrawable2 = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{0, -15658735});
        gradientDrawable2.setCornerRadius(0.0f);
        RelativeLayout.LayoutParams layoutParams22 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams22.addRule(10);
        this.f4954b.setLayoutParams(layoutParams22);
        a(this.f4954b);
        a(this.x);
        if (this.t != null) {
            a(this.t);
        }
        RelativeLayout.LayoutParams layoutParams23 = new RelativeLayout.LayoutParams(-1, (int) (((this.p != null ? 64 : 0) + 60 + 16 + 16 + 16) * f));
        layoutParams23.addRule(12);
        RelativeLayout relativeLayout2 = new RelativeLayout(this.f4956d);
        if (Build.VERSION.SDK_INT >= 16) {
            relativeLayout2.setBackground(gradientDrawable2);
        } else {
            relativeLayout2.setBackgroundDrawable(gradientDrawable2);
        }
        relativeLayout2.setLayoutParams(layoutParams23);
        relativeLayout2.setPadding(i9, 0, i9, (int) (((this.p != null ? 64 : 0) + 16 + 16) * f));
        this.v = relativeLayout2;
        if (!this.B) {
            this.w.a(relativeLayout2, aVar);
        }
        a(relativeLayout2);
        if (this.u != null) {
            RelativeLayout.LayoutParams layoutParams24 = new RelativeLayout.LayoutParams(-1, (int) (6.0f * f));
            layoutParams24.addRule(12);
            layoutParams24.topMargin = (int) ((-6.0f) * f);
            this.u.setLayoutParams(layoutParams24);
            a(this.u);
        }
        if (this.p != null) {
            RelativeLayout.LayoutParams layoutParams25 = new RelativeLayout.LayoutParams(-1, (int) (64.0f * f));
            layoutParams25.bottomMargin = i9;
            layoutParams25.leftMargin = i9;
            layoutParams25.rightMargin = i9;
            layoutParams25.addRule(1);
            layoutParams25.addRule(12);
            this.p.setLayoutParams(layoutParams25);
            a(this.p);
        }
        if (this.s != null) {
            int i16 = (int) (60.0f * f);
            RelativeLayout.LayoutParams layoutParams26 = new RelativeLayout.LayoutParams(i16, i16);
            layoutParams26.addRule(12);
            layoutParams26.addRule(9);
            this.s.setLayoutParams(layoutParams26);
            a(relativeLayout2, this.s);
        }
        if (this.q != null) {
            RelativeLayout.LayoutParams layoutParams27 = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams27.bottomMargin = (int) (36.0f * f);
            layoutParams27.addRule(12);
            layoutParams27.addRule(9);
            this.q.setEllipsize(TextUtils.TruncateAt.END);
            this.q.setGravity(GravityCompat.START);
            this.q.setLayoutParams(layoutParams27);
            this.q.setMaxLines(1);
            this.q.setPadding((int) (72.0f * f), 0, 0, 0);
            this.q.setTextColor(-1);
            this.q.setTextSize(18.0f);
            a(relativeLayout2, this.q);
        }
        if (this.r != null) {
            RelativeLayout.LayoutParams layoutParams28 = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams28.addRule(12);
            layoutParams28.addRule(9);
            layoutParams28.bottomMargin = (int) (4.0f * f);
            this.r.setEllipsize(TextUtils.TruncateAt.END);
            this.r.setGravity(GravityCompat.START);
            this.r.setLayoutParams(layoutParams28);
            this.r.setMaxLines(1);
            this.r.setPadding((int) (f * 72.0f), 0, 0, 0);
            this.r.setTextColor(-1);
            a(relativeLayout2, this.r);
        }
        viewGroup = (ViewGroup) this.f4954b.getParent();
        i7 = -16777216;
        viewGroup.setBackgroundColor(i7);
        rootView = this.f4954b.getRootView();
        if (rootView == null) {
        }
    }

    private void a(View view) {
        if (this.k == null) {
            return;
        }
        this.k.a(view);
    }

    private void a(ViewGroup viewGroup, View view) {
        if (viewGroup != null) {
            viewGroup.addView(view);
        }
    }

    private void b(View view) {
        ViewGroup viewGroup;
        if (view == null || (viewGroup = (ViewGroup) view.getParent()) == null) {
            return;
        }
        viewGroup.removeView(view);
    }

    private boolean m() {
        return ((double) (this.f4954b.getVideoHeight() > 0 ? ((float) this.f4954b.getVideoWidth()) / ((float) this.f4954b.getVideoHeight()) : -1.0f)) <= 0.9d;
    }

    private boolean n() {
        if (this.f4954b.getVideoHeight() <= 0) {
            return false;
        }
        Rect rect = new Rect();
        this.l.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        if (rect.width() > rect.height()) {
            return ((float) (rect.width() - ((rect.height() * this.f4954b.getVideoWidth()) / this.f4954b.getVideoHeight()))) - (com.facebook.ads.internal.q.a.v.f5438b * 192.0f) < 0.0f;
        }
        return ((((float) (rect.height() - ((rect.width() * this.f4954b.getVideoHeight()) / this.f4954b.getVideoWidth()))) - (com.facebook.ads.internal.q.a.v.f5438b * 64.0f)) - (com.facebook.ads.internal.q.a.v.f5438b * 64.0f)) - (com.facebook.ads.internal.q.a.v.f5438b * 40.0f) < 0.0f;
    }

    private boolean o() {
        double videoWidth = this.f4954b.getVideoHeight() > 0 ? this.f4954b.getVideoWidth() / this.f4954b.getVideoHeight() : -1.0f;
        return videoWidth > 0.9d && videoWidth < 1.1d;
    }

    private void p() {
        b(this.f4954b);
        b(this.p);
        b(this.q);
        b(this.r);
        b(this.s);
        b(this.u);
        b(this.v);
        b(this.x);
        if (this.t != null) {
            b(this.t);
        }
    }

    @Override // com.facebook.ads.internal.adapters.l
    protected void a() {
        if (this.f4955c == null) {
            Log.e(j, "Unable to add UI without a valid ad response.");
            return;
        }
        String string = this.f4955c.getString("ct");
        String optString = this.f4955c.getJSONObject(com.umeng.analytics.pro.b.M).optString("orientation");
        if (!optString.isEmpty()) {
            this.o = m.a.a(Integer.parseInt(optString));
        }
        if (this.f4955c.has("layout") && !this.f4955c.isNull("layout")) {
            JSONObject jSONObject = this.f4955c.getJSONObject("layout");
            this.y = (int) jSONObject.optLong("bgColor", this.y);
            this.z = (int) jSONObject.optLong("textColor", this.z);
            this.A = (int) jSONObject.optLong("accentColor", this.A);
            this.B = jSONObject.optBoolean("persistentAdDetails", this.B);
        }
        JSONObject jSONObject2 = this.f4955c.getJSONObject("text");
        this.f4954b.setId(Build.VERSION.SDK_INT >= 17 ? View.generateViewId() : com.facebook.ads.internal.q.a.v.a());
        int c2 = c();
        Context context = this.f4956d;
        if (c2 < 0) {
            c2 = 0;
        }
        this.x = new com.facebook.ads.internal.view.e.c.j(context, c2, this.A);
        this.x.setOnTouchListener(this.n);
        this.f4954b.a(this.x);
        if (this.f4955c.has("cta") && !this.f4955c.isNull("cta")) {
            JSONObject jSONObject3 = this.f4955c.getJSONObject("cta");
            this.p = new com.facebook.ads.internal.view.c.a(this.f4956d, jSONObject3.getString("url"), jSONObject3.getString("text"), this.A, this.f4954b, this.f4953a, string);
            com.facebook.ads.internal.a.b.a(this.f4956d, this.f4953a, string, Uri.parse(jSONObject3.getString("url")), new HashMap());
        }
        if (this.f4955c.has("icon") && !this.f4955c.isNull("icon")) {
            JSONObject jSONObject4 = this.f4955c.getJSONObject("icon");
            this.s = new ImageView(this.f4956d);
            new com.facebook.ads.internal.view.b.d(this.s).a((int) (com.facebook.ads.internal.q.a.v.f5438b * 64.0f), (int) (com.facebook.ads.internal.q.a.v.f5438b * 64.0f)).a(jSONObject4.getString("url"));
        }
        if (this.f4955c.has("image") && !this.f4955c.isNull("image")) {
            JSONObject jSONObject5 = this.f4955c.getJSONObject("image");
            com.facebook.ads.internal.view.e.c.g gVar = new com.facebook.ads.internal.view.e.c.g(this.f4956d);
            this.f4954b.a(gVar);
            gVar.setImage(jSONObject5.getString("url"));
        }
        String optString2 = jSONObject2.optString(TJAdUnitConstants.String.TITLE);
        if (!optString2.isEmpty()) {
            this.q = new TextView(this.f4956d);
            this.q.setText(optString2);
            this.q.setTypeface(Typeface.defaultFromStyle(1));
        }
        String optString3 = jSONObject2.optString(FacebookAdapter.KEY_SUBTITLE_ASSET);
        if (!optString3.isEmpty()) {
            this.r = new TextView(this.f4956d);
            this.r.setText(optString3);
            this.r.setTextSize(16.0f);
        }
        this.u = new com.facebook.ads.internal.view.e.c.n(this.f4956d);
        this.f4954b.a(this.u);
        String d2 = d();
        if (!TextUtils.isEmpty(d2)) {
            this.t = new a.C0357a(this.f4956d, "AdChoices", d2, new float[]{0.0f, 0.0f, 8.0f, 0.0f}, string);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(10);
            layoutParams.addRule(9);
            this.t.setLayoutParams(layoutParams);
        }
        this.f4954b.a(new com.facebook.ads.internal.view.e.c.k(this.f4956d));
        com.facebook.ads.internal.view.e.c.l lVar = new com.facebook.ads.internal.view.e.c.l(this.f4956d);
        this.f4954b.a(lVar);
        d.a aVar = h() ? d.a.FADE_OUT_ON_PLAY : d.a.VISIBLE;
        this.f4954b.a(new com.facebook.ads.internal.view.e.c.d(lVar, aVar));
        this.w = new com.facebook.ads.internal.view.e.c.d(new RelativeLayout(this.f4956d), aVar);
        this.f4954b.a(this.w);
    }

    @Override // com.facebook.ads.internal.view.a
    @TargetApi(17)
    public void a(Intent intent, Bundle bundle, AudienceNetworkActivity audienceNetworkActivity) {
        this.l = audienceNetworkActivity;
        if (!i && this.k == null) {
            throw new AssertionError();
        }
        audienceNetworkActivity.addBackButtonInterceptor(this.m);
        p();
        a(this.l.getResources().getConfiguration().orientation);
        if (h()) {
            e();
        } else {
            f();
        }
    }

    public void a(Configuration configuration) {
        p();
        a(configuration.orientation);
    }

    @Override // com.facebook.ads.internal.view.a
    public void a(Bundle bundle) {
    }

    protected boolean h() {
        if (!i && this.f4955c == null) {
            throw new AssertionError();
        }
        try {
            return this.f4955c.getJSONObject("video").getBoolean("autoplay");
        } catch (Exception e) {
            Log.w(String.valueOf(n.class), "Invalid JSON", e);
            return true;
        }
    }

    @Override // com.facebook.ads.internal.view.a
    public void i() {
        if (this.f4954b == null || this.f4954b.getState() != com.facebook.ads.internal.view.e.d.d.STARTED) {
            return;
        }
        this.C = this.f4954b.getVideoStartReason();
        this.f4954b.a(false);
    }

    @Override // com.facebook.ads.internal.view.a
    public void j() {
        if (this.f4954b == null || this.C == null) {
            return;
        }
        this.f4954b.a(this.C);
    }

    public m.a k() {
        return this.o;
    }

    public void l() {
        if (this.l != null) {
            this.l.finish();
        }
    }

    @Override // com.facebook.ads.internal.adapters.l, com.facebook.ads.internal.adapters.AdAdapter
    public void onDestroy() {
        if (this.f4955c != null && this.f4953a != null) {
            String optString = this.f4955c.optString("ct");
            if (!TextUtils.isEmpty(optString)) {
                this.f4953a.h(optString, new HashMap());
            }
        }
        if (this.f4954b != null) {
            this.f4954b.f();
        }
        m.a(this);
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.f4954b == null) {
            return true;
        }
        this.f4954b.getEventBus().a((com.facebook.ads.internal.j.e<com.facebook.ads.internal.j.f, com.facebook.ads.internal.j.d>) new com.facebook.ads.internal.view.e.b.t(view, motionEvent));
        return true;
    }

    @Override // com.facebook.ads.internal.view.a
    public void setListener(a.InterfaceC0352a interfaceC0352a) {
        this.k = interfaceC0352a;
    }
}
