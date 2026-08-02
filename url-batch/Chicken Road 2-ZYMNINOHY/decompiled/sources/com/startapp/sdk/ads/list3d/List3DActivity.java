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
    private List3DView f6168a;

    /* renamed from: b, reason: collision with root package name */
    private int f6169b;

    /* renamed from: c, reason: collision with root package name */
    private Long f6170c;

    /* renamed from: d, reason: collision with root package name */
    private Long f6171d;

    /* renamed from: f, reason: collision with root package name */
    String f6173f;

    /* renamed from: g, reason: collision with root package name */
    String f6174g;

    /* renamed from: h, reason: collision with root package name */
    ArrayList f6175h;

    /* renamed from: i, reason: collision with root package name */
    private sb f6176i;

    /* renamed from: e, reason: collision with root package name */
    private long f6172e = 0;

    /* renamed from: j, reason: collision with root package name */
    private jb f6177j = new jb(this);

    @Override // android.app.Activity
    public final void finish() {
        sb sbVar;
        try {
            SystemClock.uptimeMillis();
            ArrayList arrayList = this.f6175h;
            g0.a(this, (arrayList == null || arrayList.isEmpty()) ? "" : ((ob) this.f6175h.get(0)).f7383e != null ? ((ob) this.f6175h.get(0)).f7383e : "", a());
            fh.f6918a.getClass();
            if (this.f6169b == getResources().getConfiguration().orientation) {
                wb.a(this).a(new Intent("com.startapp.android.HideDisplayBroadcastListener"));
            }
            synchronized (this) {
                try {
                    if (this.f6177j != null) {
                        wb.a(this).a(this.f6177j);
                        this.f6177j = null;
                    }
                } finally {
                }
            }
            String str = this.f6173f;
            if (str != null && (sbVar = this.f6176i) != null) {
                for (xf xfVar : sbVar.a(str).f7528a.f6654c.values()) {
                    if (xfVar != null) {
                        xfVar.a("AD_CLOSED_TOO_QUICKLY", null);
                    }
                }
                if (!h0.f7040f.booleanValue()) {
                    this.f6176i.f7560a.remove(this.f6173f);
                }
            }
        } catch (Throwable th) {
            d9.a(th);
        }
        super.finish();
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        sb sbVar = this.f6176i;
        if (sbVar != null) {
            for (xf xfVar : sbVar.a(this.f6173f).f7528a.f6654c.values()) {
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
                this.f6170c = (Long) getIntent().getSerializableExtra("lastLoadTime");
                this.f6171d = (Long) getIntent().getSerializableExtra("adCacheTtl");
            } else {
                if (bundle.containsKey("lastLoadTime")) {
                    this.f6170c = (Long) bundle.getSerializable("lastLoadTime");
                }
                if (bundle.containsKey("adCacheTtl")) {
                    this.f6171d = (Long) bundle.getSerializable("adCacheTtl");
                }
            }
            getIntent().getStringExtra("position");
            this.f6173f = getIntent().getStringExtra("listModelUuid");
            wb.a((Context) this).a(this.f6177j, new IntentFilter("com.startapp.android.CloseAdActivity"));
            this.f6169b = getResources().getConfiguration().orientation;
            si.a((Activity) this, true);
            requestWindowFeature(1);
            this.f6174g = getIntent().getStringExtra("adTag");
            int d4 = AdsCommonMetaData.k().d();
            int c4 = AdsCommonMetaData.k().c();
            this.f6168a = new List3DView(this);
            this.f6168a.setBackgroundDrawable(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{d4, c4}));
            sb sbVar = (sb) com.startapp.sdk.components.a.a((Context) this).f6557R.a();
            this.f6176i = sbVar;
            ArrayList arrayList = sbVar.a(this.f6173f).f7529b;
            this.f6175h = arrayList;
            if (arrayList == null) {
                finish();
                return;
            }
            this.f6168a.setStarted();
            this.f6168a.setHint(true);
            this.f6168a.setFade(true);
            mb mbVar = new mb(this, this.f6175h, this.f6174g, this.f6173f);
            this.f6176i.a(this.f6173f).a(this);
            this.f6168a.setAdapter(mbVar);
            this.f6168a.setDynamics(new rg());
            this.f6168a.setOnItemClickListener(new a(this));
            ?? relativeLayout = new RelativeLayout(this);
            relativeLayout.setFitsSystemWindows(true);
            relativeLayout.setContentDescription("StartApp Ad");
            relativeLayout.setId(h0.f7042h);
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
            float f4 = 2;
            textView2.setPadding(0, Math.round(TypedValue.applyDimension(1, f4, getResources().getDisplayMetrics())), 0, Math.round(TypedValue.applyDimension(1, 5, getResources().getDisplayMetrics())));
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
            Bitmap b4 = f2.b(this, "close_button.png");
            if (b4 == null) {
                b4 = f2.b(this, "close_button.png");
            }
            if (b4 != null) {
                ?? imageButton = new ImageButton(this, null, R.style.Theme.Translucent);
                float f5 = 36;
                imageButton.setImageBitmap(Bitmap.createScaledBitmap(b4, Math.round(TypedValue.applyDimension(1, f5, getResources().getDisplayMetrics())), Math.round(TypedValue.applyDimension(1, f5, getResources().getDisplayMetrics())), true));
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
            textView.setId(h0.f7044j);
            relativeLayout2.addView(textView);
            View view = new View(this);
            view.setLayoutParams(new LinearLayout.LayoutParams(-1, Math.round(TypedValue.applyDimension(1, f4, getResources().getDisplayMetrics()))));
            view.setBackgroundColor(AdsCommonMetaData.k().B().intValue());
            linearLayout.addView(view);
            LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, 0);
            layoutParams5.weight = 1.0f;
            this.f6168a.setLayoutParams(layoutParams5);
            linearLayout.addView(this.f6168a);
            LinearLayout linearLayout2 = new LinearLayout(this);
            LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams6.gravity = 80;
            linearLayout2.setLayoutParams(layoutParams6);
            linearLayout2.setBackgroundColor(AdsCommonMetaData.k().u().intValue());
            linearLayout2.setGravity(17);
            linearLayout.addView(linearLayout2);
            TextView textView4 = new TextView(this);
            textView4.setTextColor(AdsCommonMetaData.k().v().intValue());
            textView4.setPadding(0, Math.round(TypedValue.applyDimension(1, f4, getResources().getDisplayMetrics())), 0, Math.round(TypedValue.applyDimension(1, 3, getResources().getDisplayMetrics())));
            textView4.setText("Powered By ");
            textView4.setTextSize(16.0f);
            linearLayout2.addView(textView4);
            ImageView imageView = new ImageView(this);
            Bitmap b5 = f2.b(this, "logo.png");
            if (b5 == null) {
                b5 = f2.b(this, "logo.png");
            }
            imageView.setImageBitmap(Bitmap.createScaledBitmap(b5, Math.round(TypedValue.applyDimension(1, 56, getResources().getDisplayMetrics())), Math.round(TypedValue.applyDimension(1, 12, getResources().getDisplayMetrics())), true));
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
        if (this.f6177j != null) {
            wb.a(this).a(this.f6177j);
        }
        si.a((Activity) this, false);
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final void onPause() {
        super.onPause();
        sb sbVar = this.f6176i;
        if (sbVar != null) {
            for (xf xfVar : sbVar.a(this.f6173f).f7528a.f6654c.values()) {
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
        if (this.f6170c != null && this.f6171d != null && System.currentTimeMillis() - this.f6170c.longValue() > this.f6171d.longValue()) {
            finish();
            return;
        }
        fh.f6918a.getClass();
        this.f6172e = SystemClock.uptimeMillis();
        sb sbVar = this.f6176i;
        if (sbVar != null) {
            a9 a9Var = sbVar.a(this.f6173f).f7528a;
            for (String str : a9Var.f6654c.keySet()) {
                if (a9Var.f6654c.get(str) != null) {
                    ((xf) a9Var.f6654c.get(str)).c();
                }
            }
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Long l4 = this.f6170c;
        if (l4 != null) {
            bundle.putSerializable("lastLoadTime", l4);
        }
        Long l5 = this.f6171d;
        if (l5 != null) {
            bundle.putSerializable("adCacheTtl", l5);
        }
    }

    public final CloseTrackingParams a() {
        return new CloseTrackingParams(this.f6174g, (SystemClock.uptimeMillis() - this.f6172e) / 1000);
    }

    public final void a(int i4) {
        ArrayList arrayList;
        List3DView list3DView = this.f6168a;
        View childAt = list3DView.getChildAt(i4 - list3DView.f6186i);
        if (childAt == null) {
            return;
        }
        qb qbVar = (qb) childAt.getTag();
        sb sbVar = this.f6176i;
        rb a3 = sbVar != null ? sbVar.a(this.f6173f) : null;
        if (a3 == null || (arrayList = a3.f7529b) == null || i4 >= arrayList.size()) {
            return;
        }
        ob obVar = (ob) a3.f7529b.get(i4);
        qbVar.f7499b.setImageBitmap(a3.f7528a.a(obVar.f7379a, i4, obVar.f7387i));
        qbVar.f7499b.requestLayout();
        if (obVar.n != null) {
            qbVar.f7502e.setText("Open");
        } else {
            qbVar.f7502e.setText("Download");
        }
    }
}
