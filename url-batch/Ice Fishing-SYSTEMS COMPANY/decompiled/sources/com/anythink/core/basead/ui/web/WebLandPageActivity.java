package com.anythink.core.basead.ui.web;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.ClipData;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieSyncManager;
import android.webkit.DownloadListener;
import android.webkit.GeolocationPermissions;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.anythink.core.api.IOfferClickHandler;
import com.anythink.core.basead.a;
import com.anythink.core.common.d.t;
import com.anythink.core.common.h.cc;
import com.anythink.core.common.h.w;
import com.anythink.core.common.h.x;
import com.anythink.core.common.h.y;
import com.anythink.core.common.u.e;
import com.anythink.core.common.v.am;
import com.anythink.core.common.v.q;
import com.anythink.expressad.foundation.h.k;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes.dex */
public class WebLandPageActivity extends Activity implements b {

    /* renamed from: g, reason: collision with root package name */
    private static final int f12099g = 343452;

    /* renamed from: B, reason: collision with root package name */
    private w f12101B;

    /* renamed from: C, reason: collision with root package name */
    private x f12102C;

    /* renamed from: D, reason: collision with root package name */
    private String f12103D;

    /* renamed from: E, reason: collision with root package name */
    private IOfferClickHandler f12104E;

    /* renamed from: F, reason: collision with root package name */
    private c f12105F;

    /* renamed from: G, reason: collision with root package name */
    private int f12106G;

    /* renamed from: b, reason: collision with root package name */
    JSONArray f12110b;

    /* renamed from: e, reason: collision with root package name */
    long f12113e;

    /* renamed from: l, reason: collision with root package name */
    private WebProgressBarView f12118l;

    /* renamed from: m, reason: collision with root package name */
    private WebView f12119m;

    /* renamed from: n, reason: collision with root package name */
    private ImageView f12120n;

    /* renamed from: o, reason: collision with root package name */
    private ImageView f12121o;

    /* renamed from: p, reason: collision with root package name */
    private TextView f12122p;

    /* renamed from: q, reason: collision with root package name */
    private ValueAnimator f12123q;

    /* renamed from: r, reason: collision with root package name */
    private Random f12124r;

    /* renamed from: s, reason: collision with root package name */
    private int f12125s;

    /* renamed from: t, reason: collision with root package name */
    private long f12126t;

    /* renamed from: u, reason: collision with root package name */
    private Map<String, JSONArray> f12127u;

    /* renamed from: x, reason: collision with root package name */
    private WebLoadFailRefrshView f12130x;

    /* renamed from: y, reason: collision with root package name */
    private RelativeLayout f12131y;

    /* renamed from: h, reason: collision with root package name */
    private final int f12115h = 1;
    private final int i = 2;

    /* renamed from: j, reason: collision with root package name */
    private final int f12116j = 3;

    /* renamed from: k, reason: collision with root package name */
    private final int f12117k = 0;

    /* renamed from: a, reason: collision with root package name */
    int f12109a = 8;

    /* renamed from: v, reason: collision with root package name */
    private String f12128v = "";

    /* renamed from: w, reason: collision with root package name */
    private int f12129w = 0;

    /* renamed from: z, reason: collision with root package name */
    private boolean f12132z = false;

    /* renamed from: A, reason: collision with root package name */
    private boolean f12100A = true;

    /* renamed from: H, reason: collision with root package name */
    private ValueCallback<Uri[]> f12107H = null;

    /* renamed from: I, reason: collision with root package name */
    private final int f12108I = 512;

    /* renamed from: c, reason: collision with root package name */
    int f12111c = 0;

    /* renamed from: d, reason: collision with root package name */
    int f12112d = 0;

    /* renamed from: f, reason: collision with root package name */
    final long f12114f = 2500;

    /* renamed from: com.anythink.core.basead.ui.web.WebLandPageActivity$3, reason: invalid class name */
    public class AnonymousClass3 implements DownloadListener {
        public AnonymousClass3() {
        }

        @Override // android.webkit.DownloadListener
        public final void onDownloadStart(String str, String str2, String str3, String str4, long j9) {
            t.b();
            if (WebLandPageActivity.this.f12102C != null && WebLandPageActivity.this.f12102C.f14325o != null && WebLandPageActivity.this.f12102C.f14325o.bn() != 2) {
                WebLandPageActivity.d(WebLandPageActivity.this);
                try {
                    Toast.makeText(WebLandPageActivity.this.getApplicationContext(), q.a(WebLandPageActivity.this.getApplicationContext(), "myoffer_intercept_web_file_download", k.f19794g), 0).show();
                    return;
                } catch (Throwable unused) {
                    return;
                }
            }
            if (WebLandPageActivity.this.f12101B == null || WebLandPageActivity.this.f12102C == null || TextUtils.isEmpty(WebLandPageActivity.this.f12101B.I())) {
                if (WebLandPageActivity.g(WebLandPageActivity.this)) {
                    WebLandPageActivity.a(WebLandPageActivity.this, str, 11);
                    return;
                }
                WebLandPageActivity.b(WebLandPageActivity.this, str, 11);
            } else if (WebLandPageActivity.this.f12104E != null && WebLandPageActivity.this.f12104E != null && WebLandPageActivity.this.f12104E.startDataFetchApp(WebLandPageActivity.this.getApplicationContext(), WebLandPageActivity.this.f12101B, WebLandPageActivity.this.f12102C, str)) {
                WebLandPageActivity webLandPageActivity = WebLandPageActivity.this;
                webLandPageActivity.f12109a = 6;
                webLandPageActivity.f12112d = 1;
            } else if (WebLandPageActivity.g(WebLandPageActivity.this)) {
                WebLandPageActivity.a(WebLandPageActivity.this, str, 7);
                return;
            } else {
                WebLandPageActivity webLandPageActivity2 = WebLandPageActivity.this;
                webLandPageActivity2.f12112d = 2;
                WebLandPageActivity.b(webLandPageActivity2, str, 7);
            }
            WebLandPageActivity.h(WebLandPageActivity.this);
            WebLandPageActivity.this.e();
        }
    }

    /* renamed from: com.anythink.core.basead.ui.web.WebLandPageActivity$4, reason: invalid class name */
    public class AnonymousClass4 implements DialogInterface.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f12137a;

        public AnonymousClass4(String str) {
            this.f12137a = str;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            e.a(WebLandPageActivity.this.f12101B, WebLandPageActivity.this.f12102C, 3, WebLandPageActivity.this.f12113e > 0, 2, this.f12137a);
        }
    }

    /* renamed from: com.anythink.core.basead.ui.web.WebLandPageActivity$5, reason: invalid class name */
    public class AnonymousClass5 implements DialogInterface.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f12139a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f12140b;

        public AnonymousClass5(int i, String str) {
            this.f12139a = i;
            this.f12140b = str;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            int i4 = this.f12139a;
            if (i4 == 7) {
                WebLandPageActivity.this.f12112d = 2;
            }
            WebLandPageActivity.b(WebLandPageActivity.this, this.f12140b, i4);
            WebLandPageActivity.h(WebLandPageActivity.this);
            e.a(WebLandPageActivity.this.f12101B, WebLandPageActivity.this.f12102C, 3, WebLandPageActivity.this.f12113e > 0, 1, this.f12140b);
            WebLandPageActivity.this.e();
        }
    }

    /* renamed from: com.anythink.core.basead.ui.web.WebLandPageActivity$6, reason: invalid class name */
    public class AnonymousClass6 implements View.OnClickListener {
        public AnonymousClass6() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (WebLandPageActivity.this.f12119m == null || !WebLandPageActivity.this.f12119m.canGoBack()) {
                WebLandPageActivity.this.finish();
            } else {
                WebLandPageActivity.this.f12119m.goBack();
            }
        }
    }

    /* renamed from: com.anythink.core.basead.ui.web.WebLandPageActivity$7, reason: invalid class name */
    public class AnonymousClass7 implements View.OnClickListener {
        public AnonymousClass7() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            WebLandPageActivity.this.finish();
        }
    }

    private static void b() {
    }

    private static void c() {
    }

    public static /* synthetic */ boolean d(WebLandPageActivity webLandPageActivity) {
        webLandPageActivity.f12132z = true;
        return true;
    }

    private TextView g() {
        TextView textView = new TextView(this);
        new LinearLayout.LayoutParams(0, -2, 1.0f);
        textView.setPadding(q.a((Context) this, 20.0f), 0, 0, q.a((Context) this, 2.0f));
        textView.setTextSize(1, 18.0f);
        textView.setTextColor(Color.parseColor("#666666"));
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        return textView;
    }

    public static /* synthetic */ int h(WebLandPageActivity webLandPageActivity) {
        webLandPageActivity.f12129w = 2;
        return 2;
    }

    @Override // com.anythink.core.basead.ui.web.b
    public void callbackClickResult(cc ccVar) {
        this.f12109a = ccVar.f14062l;
        if (ccVar.f14064n) {
            if (ccVar.f14063m) {
                this.f12111c = 1;
                this.f12129w = 2;
                e();
            } else {
                this.f12111c = 2;
                if (ccVar.f14066p) {
                    e.a(this.f12101B, this.f12102C, 2, this.f12113e > 0, 0, ccVar.f14065o);
                }
            }
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f12113e = System.currentTimeMillis();
            this.f12100A = true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.app.Activity
    public void finish() {
        y yVar;
        x xVar = this.f12102C;
        if (xVar != null && (yVar = xVar.f14325o) != null && yVar.j() == 1) {
            try {
                AlertDialog.Builder builder = new AlertDialog.Builder(this, q.a(this, "system_dialog", k.f19792e));
                builder.setMessage(getString(q.a(this, "web_land_page_dialog_title", k.f19794g))).setCancelable(true).setPositiveButton(getString(q.a(this, "web_land_page_dialog_stay", k.f19794g)), new DialogInterface.OnClickListener() { // from class: com.anythink.core.basead.ui.web.WebLandPageActivity.10
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                        x xVar2 = WebLandPageActivity.this.f12102C;
                        int b9 = WebLandPageActivity.this.f12101B.b();
                        String v6 = WebLandPageActivity.this.f12101B.v();
                        WebLandPageActivity webLandPageActivity = WebLandPageActivity.this;
                        e.a(xVar2, b9, v6, webLandPageActivity.f12110b, webLandPageActivity.f12128v, 0);
                    }
                }).setNegativeButton(getString(q.a(this, "web_land_page_dialog_yes", k.f19794g)), new DialogInterface.OnClickListener() { // from class: com.anythink.core.basead.ui.web.WebLandPageActivity.9
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                        x xVar2 = WebLandPageActivity.this.f12102C;
                        int b9 = WebLandPageActivity.this.f12101B.b();
                        String v6 = WebLandPageActivity.this.f12101B.v();
                        WebLandPageActivity webLandPageActivity = WebLandPageActivity.this;
                        e.a(xVar2, b9, v6, webLandPageActivity.f12110b, webLandPageActivity.f12128v, 1);
                        WebLandPageActivity.this.e();
                    }
                });
                builder.create().show();
                return;
            } catch (Throwable unused) {
            }
        }
        e();
    }

    @Override // com.anythink.core.basead.ui.web.b
    public w getBaseAdContent() {
        return this.f12101B;
    }

    @Override // com.anythink.core.basead.ui.web.b
    public WebProgressBarView getWebProgressBarView() {
        return this.f12118l;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0036 A[Catch: all -> 0x0047, TRY_ENTER, TryCatch #2 {all -> 0x0047, blocks: (B:4:0x0004, B:12:0x000f, B:25:0x0036, B:26:0x0040), top: B:3:0x0004 }] */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onActivityResult(int i, int i4, Intent intent) {
        Uri[] uriArr;
        ClipData clipData;
        if (i == 512) {
            if (this.f12107H == null) {
                return;
            }
            if (i4 != -1 || intent == null) {
                uriArr = null;
            } else {
                String dataString = intent.getDataString();
                try {
                    clipData = intent.getClipData();
                } catch (Throwable unused) {
                }
                if (clipData != null) {
                    uriArr = new Uri[clipData.getItemCount()];
                    for (int i9 = 0; i9 < clipData.getItemCount(); i9++) {
                        try {
                            uriArr[i9] = clipData.getItemAt(i9).getUri();
                        } catch (Throwable unused2) {
                        }
                    }
                    if (dataString != null) {
                        uriArr = new Uri[]{Uri.parse(dataString)};
                    }
                }
                uriArr = null;
                if (dataString != null) {
                }
            }
            this.f12107H.onReceiveValue(uriArr);
            this.f12107H = null;
            super.onActivityResult(i, i4, intent);
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        WebView webView = this.f12119m;
        if (webView == null || !webView.canGoBack()) {
            super.onBackPressed();
        } else {
            this.f12119m.goBack();
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f12126t = SystemClock.elapsedRealtime();
        this.f12127u = new LinkedHashMap();
        setResult(-1);
        Intent intent = getIntent();
        if (intent != null) {
            try {
                Serializable serializableExtra = intent.getSerializableExtra(a.C0071a.f12025c);
                if (serializableExtra != null && (serializableExtra instanceof w)) {
                    w wVar = (w) serializableExtra;
                    this.f12101B = wVar;
                    this.f12105F = new c(wVar);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
            try {
                Serializable serializableExtra2 = intent.getSerializableExtra(a.C0071a.f12027e);
                if (serializableExtra2 != null && (serializableExtra2 instanceof x)) {
                    this.f12102C = (x) serializableExtra2;
                }
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
            try {
                Serializable serializableExtra3 = intent.getSerializableExtra(a.C0071a.f12032k);
                if (serializableExtra3 != null && (serializableExtra3 instanceof IOfferClickHandler)) {
                    this.f12104E = (IOfferClickHandler) serializableExtra3;
                }
            } catch (Throwable th3) {
                th3.printStackTrace();
            }
            try {
                this.f12103D = intent.getStringExtra(a.C0071a.i);
            } catch (Throwable th4) {
                th4.printStackTrace();
            }
            try {
                this.f12106G = intent.getIntExtra(a.C0071a.f12037p, -1);
            } catch (Throwable th5) {
                th5.printStackTrace();
            }
            this.f12100A = true;
            try {
                this.f12100A = intent.getBooleanExtra(a.C0071a.f12038q, true);
            } catch (Throwable th6) {
                th6.printStackTrace();
            }
        }
        String str = this.f12103D;
        if (TextUtils.isEmpty(str)) {
            w wVar2 = this.f12101B;
            str = wVar2 != null ? wVar2.H() : "";
        }
        Context applicationContext = getApplicationContext();
        if (TextUtils.isEmpty(str)) {
            Toast.makeText(applicationContext, q.a(applicationContext, "basead_click_empty", k.f19794g), 0).show();
            this.f12129w = 3;
            e();
            return;
        }
        if (this.f12100A) {
            cc a9 = com.anythink.core.basead.a.e.a(applicationContext, str, getBaseAdContent());
            if (a9.f14063m) {
                callbackClickResult(a9);
                return;
            }
            callbackClickResult(a9);
        }
        RelativeLayout f6 = f();
        this.f12131y = f6;
        if (f6 == null) {
            com.anythink.core.basead.a.e.b(str);
            e();
            return;
        }
        setContentView(f6);
        this.f12120n.setOnClickListener(new AnonymousClass6());
        this.f12121o.setOnClickListener(new AnonymousClass7());
        com.anythink.core.basead.ui.a.a.a(this);
        com.anythink.core.basead.ui.a.a.a(this.f12119m, this, this);
        this.f12119m.setDownloadListener(new AnonymousClass3());
        cc a10 = com.anythink.core.basead.a.e.a(str);
        this.f12109a = a10.f14062l;
        this.f12119m.loadUrl(a10.f14065o);
        recordRedirectUrl(this.f12119m.getUrl());
    }

    @Override // android.app.Activity
    public void onDestroy() {
        x xVar;
        super.onDestroy();
        ValueAnimator valueAnimator = this.f12123q;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f12123q = null;
        }
        WebView webView = this.f12119m;
        if (webView != null) {
            webView.setDownloadListener(null);
            this.f12119m.destroy();
        }
        this.f12119m = null;
        w wVar = this.f12101B;
        if (wVar == null || (xVar = this.f12102C) == null) {
            return;
        }
        int b9 = wVar.b();
        String v6 = this.f12101B.v();
        Map<String, JSONArray> map = this.f12127u;
        int i = this.f12111c;
        int i4 = this.f12112d;
        int i9 = this.f12109a;
        String str = this.f12103D;
        int i10 = this.f12102C.f14320j;
        int i11 = this.f12106G;
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f12126t;
        String str2 = this.f12128v;
        int i12 = this.f12129w;
        if (i12 == 0) {
            i12 = 1;
        }
        e.a(xVar, b9, v6, map, i, i4, i9, str, i10, i11, elapsedRealtime, str2, i12, this.f12132z);
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        CookieSyncManager.getInstance().stopSync();
        WebView webView = this.f12119m;
        if (webView != null) {
            webView.setWebChromeClient(null);
            com.anythink.core.basead.ui.a.a.a(this.f12119m, isFinishing());
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        CookieSyncManager.getInstance().startSync();
        WebView webView = this.f12119m;
        if (webView != null) {
            webView.setWebChromeClient(new WebChromeClient() { // from class: com.anythink.core.basead.ui.web.WebLandPageActivity.8
                @Override // android.webkit.WebChromeClient
                public final void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
                    com.anythink.core.basead.ui.a.a.a(WebLandPageActivity.this, str, callback);
                    super.onGeolocationPermissionsShowPrompt(str, callback);
                }

                @Override // android.webkit.WebChromeClient
                public final void onProgressChanged(WebView webView2, int i) {
                    if (WebLandPageActivity.this.f12118l != null) {
                        if (!WebLandPageActivity.this.f12123q.isRunning()) {
                            WebLandPageActivity.this.f12118l.setProgress(((i * 30) / 100) + 70);
                        }
                        if (i == 100) {
                            if (WebLandPageActivity.this.f12123q.isRunning()) {
                                WebLandPageActivity.this.f12123q.cancel();
                                WebLandPageActivity.this.f12118l.setProgress(100);
                            }
                            t.b().a(new Runnable() { // from class: com.anythink.core.basead.ui.web.WebLandPageActivity.8.1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    WebLandPageActivity.this.f12118l.setVisibility(8);
                                }
                            }, 200L);
                        }
                    }
                }

                @Override // android.webkit.WebChromeClient
                public final void onReceivedTitle(WebView webView2, String str) {
                    super.onReceivedTitle(webView2, str);
                    if (TextUtils.isEmpty(str) || WebLandPageActivity.this.f12122p == null || WebLandPageActivity.this.f12122p.getText().toString().length() != 0) {
                        return;
                    }
                    WebLandPageActivity.this.f12122p.setText(str);
                }

                @Override // android.webkit.WebChromeClient
                public final boolean onShowFileChooser(WebView webView2, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
                    try {
                        WebLandPageActivity.this.f12107H = valueCallback;
                        Intent intent = new Intent("android.intent.action.GET_CONTENT");
                        intent.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*", "audio/*"});
                        intent.addCategory("android.intent.category.OPENABLE");
                        intent.setType("image/* video/* audio/*");
                        WebLandPageActivity.this.startActivityForResult(Intent.createChooser(intent, "File Chooser"), 512);
                        return true;
                    } catch (Throwable unused) {
                        return false;
                    }
                }
            });
            this.f12119m.onResume();
        }
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
    }

    @Override // com.anythink.core.basead.ui.web.b
    public void onWebFinish() {
        e();
    }

    @Override // com.anythink.core.basead.ui.web.b
    public void onWebPageFinish(WebView webView, String str) {
        WebView webView2;
        WebLoadFailRefrshView webLoadFailRefrshView = this.f12130x;
        if (webLoadFailRefrshView != null && webLoadFailRefrshView.getParent() == null && (webView2 = this.f12119m) != null) {
            webView2.setVisibility(0);
        }
        webView.canGoBack();
        webView.canGoForward();
        if (!TextUtils.isEmpty(str) && this.f12129w != 3 && TextUtils.equals(this.f12128v, str) && !isFinishing()) {
            this.f12129w = 2;
            JSONArray jSONArray = this.f12127u.get(str);
            if (jSONArray != null) {
                try {
                    StringBuilder sb = new StringBuilder();
                    sb.append(System.currentTimeMillis());
                    jSONArray.put(1, sb.toString());
                    this.f12127u.put(str, jSONArray);
                } catch (JSONException unused) {
                }
            }
        }
        c cVar = this.f12105F;
        if (cVar != null) {
            cVar.a(webView, str);
        }
    }

    @Override // com.anythink.core.basead.ui.web.b
    public void onWebPageLoadError(WebView webView, String str) {
        if (TextUtils.equals(this.f12128v, str)) {
            this.f12129w = 3;
        }
        WebLoadFailRefrshView webLoadFailRefrshView = this.f12130x;
        if (webLoadFailRefrshView != null) {
            am.a(webLoadFailRefrshView);
        } else {
            WebLoadFailRefrshView webLoadFailRefrshView2 = new WebLoadFailRefrshView(this);
            this.f12130x = webLoadFailRefrshView2;
            WebView webView2 = this.f12119m;
            if (webView2 != null) {
                webLoadFailRefrshView2.setLayoutParams(webView2.getLayoutParams());
            }
            this.f12130x.setOnRefreshListener(new View.OnClickListener() { // from class: com.anythink.core.basead.ui.web.WebLandPageActivity.1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    am.a(WebLandPageActivity.this.f12130x);
                    if (WebLandPageActivity.this.f12119m != null) {
                        WebLandPageActivity.this.f12119m.reload();
                    }
                }
            });
        }
        WebView webView3 = this.f12119m;
        if (webView3 != null) {
            webView3.setVisibility(8);
        }
        this.f12131y.addView(this.f12130x);
    }

    @Override // com.anythink.core.basead.ui.web.b
    public void onWebPageStart(WebView webView, String str) {
        if (!TextUtils.isEmpty(str)) {
            if (TextUtils.equals(this.f12128v, str)) {
                this.f12129w = 1;
            }
            JSONArray jSONArray = this.f12127u.get(str);
            if (jSONArray != null) {
                try {
                    StringBuilder sb = new StringBuilder();
                    sb.append(System.currentTimeMillis());
                    jSONArray.put(0, sb.toString());
                    jSONArray.put(1, "");
                    this.f12127u.put(str, jSONArray);
                } catch (JSONException unused) {
                }
            }
        }
        WebLoadFailRefrshView webLoadFailRefrshView = this.f12130x;
        if (webLoadFailRefrshView != null) {
            am.a(webLoadFailRefrshView);
        }
    }

    @Override // com.anythink.core.basead.ui.web.b
    public void recordRedirectUrl(String str) {
        if (this.f12110b == null) {
            this.f12110b = new JSONArray();
        }
        this.f12110b.put(str);
        if (this.f12127u.size() > 0) {
            JSONArray jSONArray = this.f12127u.get(this.f12128v);
            try {
                if (this.f12129w == 0 && jSONArray != null) {
                    if (TextUtils.isEmpty(jSONArray.getString(1))) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(System.currentTimeMillis());
                        jSONArray.put(1, sb.toString());
                    }
                    this.f12127u.put(this.f12128v, jSONArray);
                }
            } catch (Throwable unused) {
            }
        }
        JSONArray jSONArray2 = new JSONArray();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(System.currentTimeMillis());
        jSONArray2.put(sb2.toString());
        jSONArray2.put("");
        this.f12127u.put(str, jSONArray2);
        this.f12128v = str;
        this.f12129w = 0;
    }

    @Override // com.anythink.core.basead.ui.web.b
    public boolean supportDeeplinkJump() {
        return this.f12100A;
    }

    private void d() {
        this.f12120n.setOnClickListener(new AnonymousClass6());
        this.f12121o.setOnClickListener(new AnonymousClass7());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        try {
            ((ViewGroup) getWindow().getDecorView()).removeAllViews();
        } catch (Throwable unused) {
        }
        super.finish();
    }

    private RelativeLayout f() {
        RelativeLayout relativeLayout = new RelativeLayout(this);
        relativeLayout.setBackgroundColor(-1);
        relativeLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setId(f12099g);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, q.a((Context) this, 55.0f));
        layoutParams.addRule(10);
        linearLayout.setGravity(16);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setBackgroundColor(Color.parseColor("#FFFFFF"));
        int a9 = q.a((Context) this, 16.0f);
        linearLayout.setPadding(a9, 0, a9, 0);
        relativeLayout.addView(linearLayout);
        this.f12120n = a(getResources().getDrawable(q.a(this, "browser_left_icon", k.f19790c)));
        this.f12121o = a(getResources().getDrawable(q.a(this, "browser_close_icon", k.f19790c)));
        linearLayout.addView(this.f12120n);
        linearLayout.addView(this.f12121o);
        TextView textView = new TextView(this);
        new LinearLayout.LayoutParams(0, -2, 1.0f);
        textView.setPadding(q.a((Context) this, 20.0f), 0, 0, q.a((Context) this, 2.0f));
        textView.setTextSize(1, 18.0f);
        textView.setTextColor(Color.parseColor("#666666"));
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        this.f12122p = textView;
        linearLayout.addView(textView);
        try {
            this.f12119m = new BaseWebView(getApplicationContext());
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams2.addRule(3, f12099g);
            this.f12119m.setLayoutParams(layoutParams2);
            relativeLayout.addView(this.f12119m);
            View view = new View(this);
            view.setBackgroundColor(-2434342);
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, q.a((Context) this, 1.0f));
            layoutParams3.addRule(3, f12099g);
            view.setLayoutParams(layoutParams3);
            relativeLayout.addView(view);
            WebProgressBarView webProgressBarView = new WebProgressBarView(this);
            this.f12118l = webProgressBarView;
            webProgressBarView.setProgress(0);
            RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-1, q.a((Context) this, 4.0f));
            layoutParams4.addRule(3, f12099g);
            relativeLayout.addView(this.f12118l, layoutParams4);
            Random random = new Random();
            this.f12124r = random;
            this.f12125s = random.nextInt(12) + 3;
            ValueAnimator ofInt = ValueAnimator.ofInt(0, 70);
            this.f12123q = ofInt;
            ofInt.setDuration(1000L);
            this.f12123q.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.anythink.core.basead.ui.web.WebLandPageActivity.2
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                    if (WebLandPageActivity.this.f12118l == null || intValue % WebLandPageActivity.this.f12125s != 0) {
                        return;
                    }
                    WebLandPageActivity webLandPageActivity = WebLandPageActivity.this;
                    webLandPageActivity.f12125s = webLandPageActivity.f12124r.nextInt(12) + 3;
                    WebLandPageActivity.this.f12118l.setProgress(intValue);
                }
            });
            this.f12123q.start();
            return relativeLayout;
        } catch (Throwable unused) {
            return null;
        }
    }

    private boolean h() {
        return System.currentTimeMillis() - this.f12113e > 2500;
    }

    private void b(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        com.anythink.core.common.v.y.a(str);
        this.f12109a = i;
    }

    public static void a(Context context, com.anythink.core.basead.b.c cVar) {
        Intent intent = new Intent();
        intent.setClass(context, WebLandPageActivity.class);
        intent.putExtra(a.C0071a.f12025c, cVar.f12076c);
        intent.putExtra(a.C0071a.f12027e, cVar.f12081h);
        intent.putExtra(a.C0071a.i, cVar.f12079f);
        intent.putExtra(a.C0071a.f12037p, cVar.i);
        intent.putExtra(a.C0071a.f12038q, cVar.f12083k);
        IOfferClickHandler iOfferClickHandler = cVar.f12080g;
        if (iOfferClickHandler != null) {
            intent.putExtra(a.C0071a.f12032k, iOfferClickHandler);
        }
        intent.addFlags(268435456);
        context.startActivity(intent);
    }

    public static /* synthetic */ void b(WebLandPageActivity webLandPageActivity, String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        com.anythink.core.common.v.y.a(str);
        webLandPageActivity.f12109a = i;
    }

    public static /* synthetic */ boolean g(WebLandPageActivity webLandPageActivity) {
        return System.currentTimeMillis() - webLandPageActivity.f12113e > 2500;
    }

    public static void a(Context context, String str) {
        com.anythink.core.basead.b.c cVar = new com.anythink.core.basead.b.c();
        cVar.f12079f = str;
        a(context, cVar);
    }

    private void a() {
        Intent intent = getIntent();
        if (intent != null) {
            try {
                Serializable serializableExtra = intent.getSerializableExtra(a.C0071a.f12025c);
                if (serializableExtra != null && (serializableExtra instanceof w)) {
                    w wVar = (w) serializableExtra;
                    this.f12101B = wVar;
                    this.f12105F = new c(wVar);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
            try {
                Serializable serializableExtra2 = intent.getSerializableExtra(a.C0071a.f12027e);
                if (serializableExtra2 != null && (serializableExtra2 instanceof x)) {
                    this.f12102C = (x) serializableExtra2;
                }
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
            try {
                Serializable serializableExtra3 = intent.getSerializableExtra(a.C0071a.f12032k);
                if (serializableExtra3 != null && (serializableExtra3 instanceof IOfferClickHandler)) {
                    this.f12104E = (IOfferClickHandler) serializableExtra3;
                }
            } catch (Throwable th3) {
                th3.printStackTrace();
            }
            try {
                this.f12103D = intent.getStringExtra(a.C0071a.i);
            } catch (Throwable th4) {
                th4.printStackTrace();
            }
            try {
                this.f12106G = intent.getIntExtra(a.C0071a.f12037p, -1);
            } catch (Throwable th5) {
                th5.printStackTrace();
            }
            this.f12100A = true;
            try {
                this.f12100A = intent.getBooleanExtra(a.C0071a.f12038q, true);
            } catch (Throwable th6) {
                th6.printStackTrace();
            }
        }
    }

    private void a(String str) {
        com.anythink.core.basead.ui.a.a.a(this.f12119m, this, this);
        this.f12119m.setDownloadListener(new AnonymousClass3());
        cc a9 = com.anythink.core.basead.a.e.a(str);
        this.f12109a = a9.f14062l;
        this.f12119m.loadUrl(a9.f14065o);
        recordRedirectUrl(this.f12119m.getUrl());
    }

    private void a(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(this, q.a(this, "system_dialog", k.f19792e));
        builder.setMessage(getString(q.a(this, "web_download_file_confirm_title", k.f19794g))).setCancelable(true).setPositiveButton(getString(q.a(this, "web_download_file_confirm", k.f19794g)), new AnonymousClass5(i, str)).setNegativeButton(getString(q.a(this, "web_download_file_cancel", k.f19794g)), new AnonymousClass4(str));
        builder.create().show();
    }

    private ImageView a(Drawable drawable) {
        ImageView imageView = new ImageView(this);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(q.a((Context) this, 48.0f), q.a((Context) this, 48.0f));
        layoutParams.gravity = 16;
        layoutParams.rightMargin = q.a((Context) this, 6.0f);
        imageView.setLayoutParams(layoutParams);
        int a9 = q.a((Context) this, 16.0f);
        imageView.setPadding(a9, a9, a9, a9);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView.setImageDrawable(drawable);
        return imageView;
    }

    public static /* synthetic */ void a(WebLandPageActivity webLandPageActivity, String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(webLandPageActivity, q.a(webLandPageActivity, "system_dialog", k.f19792e));
        builder.setMessage(webLandPageActivity.getString(q.a(webLandPageActivity, "web_download_file_confirm_title", k.f19794g))).setCancelable(true).setPositiveButton(webLandPageActivity.getString(q.a(webLandPageActivity, "web_download_file_confirm", k.f19794g)), webLandPageActivity.new AnonymousClass5(i, str)).setNegativeButton(webLandPageActivity.getString(q.a(webLandPageActivity, "web_download_file_cancel", k.f19794g)), webLandPageActivity.new AnonymousClass4(str));
        builder.create().show();
    }
}
