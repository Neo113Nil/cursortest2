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
import com.facebook.react.uimanager.ViewProps;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.adinformation.AdInformationConfig;
import com.startapp.sdk.adsbase.adinformation.AdInformationOverrides;
import com.startapp.sdk.adsbase.commontracking.CloseTrackingParams;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.internal.ag;
import com.startapp.sdk.internal.db;
import com.startapp.sdk.internal.e0;
import com.startapp.sdk.internal.f0;
import com.startapp.sdk.internal.ff;
import com.startapp.sdk.internal.l8;
import com.startapp.sdk.internal.n8;
import com.startapp.sdk.internal.ph;
import com.startapp.sdk.internal.qa;
import com.startapp.sdk.internal.sa;
import com.startapp.sdk.internal.ta;
import com.startapp.sdk.internal.va;
import com.startapp.sdk.internal.xa;
import com.startapp.sdk.internal.ya;
import com.startapp.sdk.internal.z1;
import com.startapp.sdk.internal.za;
import com.startapp.sdk.internal.zh;
import java.util.ArrayList;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public class List3DActivity extends Activity {

    /* renamed from: a, reason: collision with root package name */
    private List3DView f88a;
    private int b;
    private Long c;
    private Long d;
    String f;
    String g;
    ArrayList h;
    private za i;
    private long e = 0;
    private qa j = new qa(this);

    @Override // android.app.Activity
    public final void finish() {
        za zaVar;
        try {
            SystemClock.uptimeMillis();
            ArrayList arrayList = this.h;
            e0.a(this, (arrayList == null || arrayList.isEmpty()) ? "" : ((va) this.h.get(0)).e != null ? ((va) this.h.get(0)).e : "", a());
            if (this.b == getResources().getConfiguration().orientation) {
                db.a(this).a(new Intent("com.startapp.android.HideDisplayBroadcastListener"));
            }
            synchronized (this) {
                if (this.j != null) {
                    db.a(this).a(this.j);
                    this.j = null;
                }
            }
            String str = this.f;
            if (str != null && (zaVar = this.i) != null) {
                for (ff ffVar : zaVar.a(str).f508a.c.values()) {
                    if (ffVar != null) {
                        ffVar.a("AD_CLOSED_TOO_QUICKLY", null);
                    }
                }
                if (!f0.f.booleanValue()) {
                    this.i.f523a.remove(this.f);
                }
            }
        } catch (Throwable th) {
            n8.a(th);
        }
        super.finish();
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        za zaVar = this.i;
        if (zaVar != null) {
            for (ff ffVar : zaVar.a(this.f).f508a.c.values()) {
                if (ffVar != null) {
                    ffVar.a("AD_CLOSED_TOO_QUICKLY", null);
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
    /* JADX WARN: Type inference failed for: r8v28, types: [android.widget.ImageButton, android.widget.ImageView] */
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
                    n8.a(th);
                    finish();
                }
            }
            if (bundle == null) {
                db.a((Context) this).a(new Intent("com.startapp.android.ShowDisplayBroadcastListener"));
                this.c = (Long) getIntent().getSerializableExtra("lastLoadTime");
                this.d = (Long) getIntent().getSerializableExtra("adCacheTtl");
            } else {
                if (bundle.containsKey("lastLoadTime")) {
                    this.c = (Long) bundle.getSerializable("lastLoadTime");
                }
                if (bundle.containsKey("adCacheTtl")) {
                    this.d = (Long) bundle.getSerializable("adCacheTtl");
                }
            }
            getIntent().getStringExtra(ViewProps.POSITION);
            this.f = getIntent().getStringExtra("listModelUuid");
            db.a((Context) this).a(this.j, new IntentFilter("com.startapp.android.CloseAdActivity"));
            this.b = getResources().getConfiguration().orientation;
            zh.a((Activity) this, true);
            requestWindowFeature(1);
            this.g = getIntent().getStringExtra("adTag");
            int d = AdsCommonMetaData.k().d();
            int c = AdsCommonMetaData.k().c();
            this.f88a = new List3DView(this);
            this.f88a.setBackgroundDrawable(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{d, c}));
            za zaVar = (za) com.startapp.sdk.components.a.a((Context) this).Q.a();
            this.i = zaVar;
            ArrayList arrayList = zaVar.a(this.f).b;
            this.h = arrayList;
            if (arrayList == null) {
                finish();
                return;
            }
            this.f88a.setStarted();
            this.f88a.setHint(true);
            this.f88a.setFade(true);
            ta taVar = new ta(this, this.h, this.g, this.f);
            this.i.a(this.f).a(this);
            this.f88a.setAdapter(taVar);
            this.f88a.setDynamics(new ag());
            this.f88a.setOnItemClickListener(new a(this));
            ?? relativeLayout = new RelativeLayout(this);
            relativeLayout.setFitsSystemWindows(true);
            relativeLayout.setContentDescription("StartApp Ad");
            relativeLayout.setId(f0.h);
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
            textView2.setPadding(0, Math.round(TypedValue.applyDimension(1, 2.0f, getResources().getDisplayMetrics())), 0, Math.round(TypedValue.applyDimension(1, 5.0f, getResources().getDisplayMetrics())));
            textView2.setTextColor(AdsCommonMetaData.k().C().intValue());
            textView2.setTextSize(AdsCommonMetaData.k().E().intValue());
            textView2.setSingleLine(true);
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            textView2.setText(AdsCommonMetaData.k().A());
            textView2.setShadowLayer(2.5f, -2.0f, 2.0f, -11513776);
            ph.a(textView2, AdsCommonMetaData.k().D());
            relativeLayout2.addView(textView2);
            RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams4.addRule(11);
            layoutParams4.addRule(15);
            Bitmap b = z1.b(this, "close_button.png");
            if (b == null) {
                b = z1.b(this, "close_button.png");
            }
            if (b != null) {
                ?? imageButton = new ImageButton(this, null, R.style.Theme.Translucent);
                imageButton.setImageBitmap(Bitmap.createScaledBitmap(b, Math.round(TypedValue.applyDimension(1, 36.0f, getResources().getDisplayMetrics())), Math.round(TypedValue.applyDimension(1, 36.0f, getResources().getDisplayMetrics())), true));
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
            textView.setId(f0.j);
            relativeLayout2.addView(textView);
            View view = new View(this);
            view.setLayoutParams(new LinearLayout.LayoutParams(-1, Math.round(TypedValue.applyDimension(1, 2.0f, getResources().getDisplayMetrics()))));
            view.setBackgroundColor(AdsCommonMetaData.k().B().intValue());
            linearLayout.addView(view);
            LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, 0);
            layoutParams5.weight = 1.0f;
            this.f88a.setLayoutParams(layoutParams5);
            linearLayout.addView(this.f88a);
            LinearLayout linearLayout2 = new LinearLayout(this);
            LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams6.gravity = 80;
            linearLayout2.setLayoutParams(layoutParams6);
            linearLayout2.setBackgroundColor(AdsCommonMetaData.k().u().intValue());
            linearLayout2.setGravity(17);
            linearLayout.addView(linearLayout2);
            TextView textView4 = new TextView(this);
            textView4.setTextColor(AdsCommonMetaData.k().v().intValue());
            textView4.setPadding(0, Math.round(TypedValue.applyDimension(1, 2.0f, getResources().getDisplayMetrics())), 0, Math.round(TypedValue.applyDimension(1, 3.0f, getResources().getDisplayMetrics())));
            textView4.setText("Powered By ");
            textView4.setTextSize(16.0f);
            linearLayout2.addView(textView4);
            ImageView imageView = new ImageView(this);
            Bitmap b2 = z1.b(this, "logo.png");
            if (b2 == null) {
                b2 = z1.b(this, "logo.png");
            }
            imageView.setImageBitmap(Bitmap.createScaledBitmap(b2, Math.round(TypedValue.applyDimension(1, 56.0f, getResources().getDisplayMetrics())), Math.round(TypedValue.applyDimension(1, 12.0f, getResources().getDisplayMetrics())), true));
            linearLayout2.addView(imageView);
            try {
                new com.startapp.sdk.adsbase.adinformation.a(this, AdInformationConfig.ImageResourceType.INFO_L, AdPreferences.Placement.INAPP_OFFER_WALL, (AdInformationOverrides) getIntent().getSerializableExtra("adInfoOverride"), null, null, null, null, null).a(relativeLayout);
                setContentView(relativeLayout, layoutParams);
                new Handler().postDelayed(new sa(this), 500L);
            } catch (Throwable th3) {
                th = th3;
                th = th;
                n8.a(th);
                finish();
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    @Override // android.app.Activity
    protected final void onDestroy() {
        if (this.j != null) {
            db.a(this).a(this.j);
        }
        zh.a((Activity) this, false);
        super.onDestroy();
    }

    @Override // android.app.Activity
    protected final void onPause() {
        super.onPause();
        za zaVar = this.i;
        if (zaVar != null) {
            for (ff ffVar : zaVar.a(this.f).f508a.c.values()) {
                if (ffVar != null) {
                    ffVar.a();
                }
            }
        }
        overridePendingTransition(0, 0);
    }

    @Override // android.app.Activity
    protected final void onResume() {
        super.onResume();
        if (this.c != null && this.d != null && System.currentTimeMillis() - this.c.longValue() > this.d.longValue()) {
            finish();
            return;
        }
        this.e = SystemClock.uptimeMillis();
        za zaVar = this.i;
        if (zaVar != null) {
            l8 l8Var = zaVar.a(this.f).f508a;
            for (String str : l8Var.c.keySet()) {
                if (l8Var.c.get(str) != null) {
                    ((ff) l8Var.c.get(str)).c();
                }
            }
        }
    }

    @Override // android.app.Activity
    protected final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Long l = this.c;
        if (l != null) {
            bundle.putSerializable("lastLoadTime", l);
        }
        Long l2 = this.d;
        if (l2 != null) {
            bundle.putSerializable("adCacheTtl", l2);
        }
    }

    protected final CloseTrackingParams a() {
        return new CloseTrackingParams(this.g, (SystemClock.uptimeMillis() - this.e) / 1000);
    }

    public final void a(int i) {
        ArrayList arrayList;
        List3DView list3DView = this.f88a;
        View childAt = list3DView.getChildAt(i - list3DView.i);
        if (childAt == null) {
            return;
        }
        xa xaVar = (xa) childAt.getTag();
        za zaVar = this.i;
        ya a2 = zaVar != null ? zaVar.a(this.f) : null;
        if (a2 == null || (arrayList = a2.b) == null || i >= arrayList.size()) {
            return;
        }
        va vaVar = (va) a2.b.get(i);
        xaVar.b.setImageBitmap(a2.f508a.a(vaVar.f466a, i, vaVar.i));
        xaVar.b.requestLayout();
        boolean z = vaVar.n != null;
        TextView textView = xaVar.e;
        if (z) {
            textView.setText("Open");
        } else {
            textView.setText("Download");
        }
    }
}
