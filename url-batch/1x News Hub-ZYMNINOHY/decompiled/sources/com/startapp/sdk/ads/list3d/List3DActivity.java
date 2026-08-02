package com.startapp.sdk.ads.list3d;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.adinformation.AdInformationConfig;
import com.startapp.sdk.adsbase.adinformation.AdInformationOverrides;
import com.startapp.sdk.adsbase.commontracking.CloseTrackingParams;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.internal.a9;
import com.startapp.sdk.internal.d9;
import com.startapp.sdk.internal.f2;
import com.startapp.sdk.internal.fh;
import com.startapp.sdk.internal.g0;
import com.startapp.sdk.internal.h0;
import com.startapp.sdk.internal.ii;
import com.startapp.sdk.internal.jb;
import com.startapp.sdk.internal.lb;
import com.startapp.sdk.internal.mb;
import com.startapp.sdk.internal.ob;
import com.startapp.sdk.internal.qb;
import com.startapp.sdk.internal.rb;
import com.startapp.sdk.internal.rg;
import com.startapp.sdk.internal.sb;
import com.startapp.sdk.internal.si;
import com.startapp.sdk.internal.wb;
import com.startapp.sdk.internal.xf;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class List3DActivity extends Activity {

    /* renamed from: a, reason: collision with root package name */
    private List3DView f3086a;

    /* renamed from: b, reason: collision with root package name */
    private int f3087b;

    /* renamed from: c, reason: collision with root package name */
    private Long f3088c;

    /* renamed from: d, reason: collision with root package name */
    private Long f3089d;
    String f;

    /* renamed from: g, reason: collision with root package name */
    String f3091g;

    /* renamed from: h, reason: collision with root package name */
    ArrayList f3092h;

    /* renamed from: i, reason: collision with root package name */
    private sb f3093i;

    /* renamed from: e, reason: collision with root package name */
    private long f3090e = 0;

    /* renamed from: j, reason: collision with root package name */
    private jb f3094j = new jb(this);

    @Override // android.app.Activity
    public final void finish() {
        sb sbVar;
        try {
            SystemClock.uptimeMillis();
            ArrayList arrayList = this.f3092h;
            g0.a(this, (arrayList == null || arrayList.isEmpty()) ? "" : ((ob) this.f3092h.get(0)).f4248e != null ? ((ob) this.f3092h.get(0)).f4248e : "", a());
            fh.f3800a.getClass();
            if (this.f3087b == getResources().getConfiguration().orientation) {
                wb.a(this).a(new Intent("com.startapp.android.HideDisplayBroadcastListener"));
            }
            synchronized (this) {
                try {
                    if (this.f3094j != null) {
                        wb.a(this).a(this.f3094j);
                        this.f3094j = null;
                    }
                } finally {
                }
            }
            String str = this.f;
            if (str != null && (sbVar = this.f3093i) != null) {
                for (xf xfVar : sbVar.a(str).f4391a.f3553c.values()) {
                    if (xfVar != null) {
                        xfVar.a("AD_CLOSED_TOO_QUICKLY", null);
                    }
                }
                if (!h0.f.booleanValue()) {
                    this.f3093i.f4423a.remove(this.f);
                }
            }
        } catch (Throwable th) {
            d9.a(th);
        }
        super.finish();
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        sb sbVar = this.f3093i;
        if (sbVar != null) {
            for (xf xfVar : sbVar.a(this.f).f4391a.f3553c.values()) {
                if (xfVar != null) {
                    xfVar.a("AD_CLOSED_TOO_QUICKLY", null);
                }
            }
        }
        super.onBackPressed();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [android.app.Activity, android.content.Context, com.startapp.sdk.ads.list3d.List3DActivity] */
    /* JADX WARN: Type inference failed for: r15v31, types: [android.view.View, android.view.ViewGroup, android.widget.RelativeLayout] */
    /* JADX WARN: Type inference failed for: r2v4, types: [com.startapp.sdk.adsbase.adinformation.a] */
    /* JADX WARN: Type inference failed for: r4v5, types: [android.view.View, android.view.ViewGroup, android.widget.RelativeLayout] */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r9v28, types: [android.widget.ImageButton, android.widget.ImageView] */
    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        Throwable th;
        TextView textView;
        try {
            overridePendingTransition(0, 0);
            super.onCreate(bundle);
            if (getIntent().getBooleanExtra("fullscreen", false)) {
                try {
                    requestWindowFeature(1);
                    getWindow().setFlags(1024, 1024);
                } catch (Throwable th2) {
                    th = th2;
                    d9.a(th);
                    finish();
                }
            }
            if (bundle == null) {
                wb.a((Context) this).a(new Intent("com.startapp.android.ShowDisplayBroadcastListener"));
                this.f3088c = (Long) getIntent().getSerializableExtra("lastLoadTime");
                this.f3089d = (Long) getIntent().getSerializableExtra("adCacheTtl");
            } else {
                if (bundle.containsKey("lastLoadTime")) {
                    this.f3088c = (Long) bundle.getSerializable("lastLoadTime");
                }
                if (bundle.containsKey("adCacheTtl")) {
                    this.f3089d = (Long) bundle.getSerializable("adCacheTtl");
                }
            }
            getIntent().getStringExtra("position");
            this.f = getIntent().getStringExtra("listModelUuid");
            wb.a((Context) this).a(this.f3094j, new IntentFilter("com.startapp.android.CloseAdActivity"));
            this.f3087b = getResources().getConfiguration().orientation;
            si.a((Activity) this, true);
            requestWindowFeature(1);
            this.f3091g = getIntent().getStringExtra("adTag");
            int d3 = AdsCommonMetaData.k().d();
            int c3 = AdsCommonMetaData.k().c();
            this.f3086a = new List3DView(this);
            this.f3086a.setBackgroundDrawable(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{d3, c3}));
            sb sbVar = (sb) com.startapp.sdk.components.a.a((Context) this).f3459R.a();
            this.f3093i = sbVar;
            ArrayList arrayList = sbVar.a(this.f).f4392b;
            this.f3092h = arrayList;
            if (arrayList == null) {
                finish();
                return;
            }
            this.f3086a.setStarted();
            this.f3086a.setHint(true);
            this.f3086a.setFade(true);
            mb mbVar = new mb(this, this.f3092h, this.f3091g, this.f);
            this.f3093i.a(this.f).a(this);
            this.f3086a.setAdapter(mbVar);
            this.f3086a.setDynamics(new rg());
            this.f3086a.setOnItemClickListener(new a(this));
            ?? relativeLayout = new RelativeLayout(this);
            relativeLayout.setFitsSystemWindows(true);
            relativeLayout.setContentDescription("StartApp Ad");
            relativeLayout.setId(h0.f3917h);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
            ?? linearLayout = new LinearLayout(this);
            linearLayout.setOrientation(1);
            relativeLayout.addView(linearLayout, layoutParams2);
            ?? relativeLayout2 = new RelativeLayout(this);
            relativeLayout2.setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
            relativeLayout2.setBackgroundColor(AdsCommonMetaData.k().z().intValue());
            linearLayout.addView(relativeLayout2);
            TextView textView2 = new TextView(this);
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams3.addRule(13);
            textView2.setLayoutParams(layoutParams3);
            float f = 2;
            textView2.setPadding(0, Math.round(TypedValue.applyDimension(1, f, getResources().getDisplayMetrics())), 0, Math.round(TypedValue.applyDimension(1, 5, getResources().getDisplayMetrics())));
            textView2.setTextColor(AdsCommonMetaData.k().C().intValue());
            textView2.setTextSize(AdsCommonMetaData.k().E().intValue());
            textView2.setSingleLine(true);
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            textView2.setText(AdsCommonMetaData.k().A());
            textView2.setShadowLayer(2.5f, -2.0f, 2.0f, -11513776);
            ii.a(textView2, AdsCommonMetaData.k().D());
            relativeLayout2.addView(textView2);
            RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams4.addRule(11);
            layoutParams4.addRule(15);
            Bitmap b3 = f2.b(this, "close_button.png");
            if (b3 == null) {
                b3 = f2.b(this, "close_button.png");
            }
            if (b3 != null) {
                ?? imageButton = new ImageButton(this, null, R.style.Theme.Translucent);
                float f3 = 36;
                imageButton.setImageBitmap(Bitmap.createScaledBitmap(b3, Math.round(TypedValue.applyDimension(1, f3, getResources().getDisplayMetrics())), Math.round(TypedValue.applyDimension(1, f3, getResources().getDisplayMetrics())), true));
                textView = imageButton;
            } else {
                TextView textView3 = new TextView(this);
                textView3.setText("   x   ");
                textView3.setTextSize(20.0f);
                textView = textView3;
            }
            textView.setLayoutParams(layoutParams4);
            textView.setOnClickListener(new b(this));
            textView.setContentDescription("x");
            textView.setId(h0.f3919j);
            relativeLayout2.addView(textView);
            View view = new View(this);
            view.setLayoutParams(new LinearLayout.LayoutParams(-1, Math.round(TypedValue.applyDimension(1, f, getResources().getDisplayMetrics()))));
            view.setBackgroundColor(AdsCommonMetaData.k().B().intValue());
            linearLayout.addView(view);
            LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, 0);
            layoutParams5.weight = 1.0f;
            this.f3086a.setLayoutParams(layoutParams5);
            linearLayout.addView(this.f3086a);
            LinearLayout linearLayout2 = new LinearLayout(this);
            LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams6.gravity = 80;
            linearLayout2.setLayoutParams(layoutParams6);
            linearLayout2.setBackgroundColor(AdsCommonMetaData.k().u().intValue());
            linearLayout2.setGravity(17);
            linearLayout.addView(linearLayout2);
            TextView textView4 = new TextView(this);
            textView4.setTextColor(AdsCommonMetaData.k().v().intValue());
            textView4.setPadding(0, Math.round(TypedValue.applyDimension(1, f, getResources().getDisplayMetrics())), 0, Math.round(TypedValue.applyDimension(1, 3, getResources().getDisplayMetrics())));
            textView4.setText("Powered By ");
            textView4.setTextSize(16.0f);
            linearLayout2.addView(textView4);
            ImageView imageView = new ImageView(this);
            Bitmap b4 = f2.b(this, "logo.png");
            if (b4 == null) {
                b4 = f2.b(this, "logo.png");
            }
            imageView.setImageBitmap(Bitmap.createScaledBitmap(b4, Math.round(TypedValue.applyDimension(1, 56, getResources().getDisplayMetrics())), Math.round(TypedValue.applyDimension(1, 12, getResources().getDisplayMetrics())), true));
            linearLayout2.addView(imageView);
            try {
                new com.startapp.sdk.adsbase.adinformation.a(this, AdInformationConfig.ImageResourceType.INFO_L, AdPreferences.Placement.INAPP_OFFER_WALL, (AdInformationOverrides) getIntent().getSerializableExtra("adInfoOverride"), null, null, null, null, null).a(relativeLayout);
                setContentView(relativeLayout, layoutParams);
                new Handler().postDelayed(new lb(this), 500L);
            } catch (Throwable th3) {
                th = th3;
                th = th;
                d9.a(th);
                finish();
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        if (this.f3094j != null) {
            wb.a(this).a(this.f3094j);
        }
        si.a((Activity) this, false);
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final void onPause() {
        super.onPause();
        sb sbVar = this.f3093i;
        if (sbVar != null) {
            for (xf xfVar : sbVar.a(this.f).f4391a.f3553c.values()) {
                if (xfVar != null) {
                    xfVar.a();
                }
            }
        }
        overridePendingTransition(0, 0);
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        if (this.f3088c != null && this.f3089d != null && System.currentTimeMillis() - this.f3088c.longValue() > this.f3089d.longValue()) {
            finish();
            return;
        }
        fh.f3800a.getClass();
        this.f3090e = SystemClock.uptimeMillis();
        sb sbVar = this.f3093i;
        if (sbVar != null) {
            a9 a9Var = sbVar.a(this.f).f4391a;
            for (String str : a9Var.f3553c.keySet()) {
                if (a9Var.f3553c.get(str) != null) {
                    ((xf) a9Var.f3553c.get(str)).c();
                }
            }
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Long l3 = this.f3088c;
        if (l3 != null) {
            bundle.putSerializable("lastLoadTime", l3);
        }
        Long l4 = this.f3089d;
        if (l4 != null) {
            bundle.putSerializable("adCacheTtl", l4);
        }
    }

    public final CloseTrackingParams a() {
        return new CloseTrackingParams(this.f3091g, (SystemClock.uptimeMillis() - this.f3090e) / 1000);
    }

    public final void a(int i3) {
        ArrayList arrayList;
        List3DView list3DView = this.f3086a;
        View childAt = list3DView.getChildAt(i3 - list3DView.f3102i);
        if (childAt == null) {
            return;
        }
        qb qbVar = (qb) childAt.getTag();
        sb sbVar = this.f3093i;
        rb a3 = sbVar != null ? sbVar.a(this.f) : null;
        if (a3 == null || (arrayList = a3.f4392b) == null || i3 >= arrayList.size()) {
            return;
        }
        ob obVar = (ob) a3.f4392b.get(i3);
        qbVar.f4363b.setImageBitmap(a3.f4391a.a(obVar.f4244a, i3, obVar.f4251i));
        qbVar.f4363b.requestLayout();
        if (obVar.f4256n != null) {
            qbVar.f4366e.setText("Open");
        } else {
            qbVar.f4366e.setText("Download");
        }
    }
}
