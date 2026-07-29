package com.facebook.internal;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.facebook.AccessToken;
import com.facebook.FacebookRequestError;
import com.facebook.R;
import com.tapjoy.TJAdUnitConstants;
import com.tapjoy.TapjoyConstants;
import java.util.Locale;

/* compiled from: WebDialog.java */
/* loaded from: classes.dex */
public class ad extends Dialog {

    /* renamed from: a, reason: collision with root package name */
    private String f6073a;

    /* renamed from: b, reason: collision with root package name */
    private String f6074b;

    /* renamed from: c, reason: collision with root package name */
    private c f6075c;

    /* renamed from: d, reason: collision with root package name */
    private WebView f6076d;
    private ProgressDialog e;
    private ImageView f;
    private FrameLayout g;
    private boolean h;
    private boolean i;
    private boolean j;

    /* compiled from: WebDialog.java */
    public interface c {
        void a(Bundle bundle, com.facebook.j jVar);
    }

    public ad(Context context, String str) {
        this(context, str, com.facebook.l.l());
    }

    public ad(Context context, String str, int i) {
        super(context, i == 0 ? com.facebook.l.l() : i);
        this.f6074b = "fbconnect://success";
        this.h = false;
        this.i = false;
        this.j = false;
        this.f6073a = str;
    }

    public ad(Context context, String str, Bundle bundle, int i, c cVar) {
        super(context, i == 0 ? com.facebook.l.l() : i);
        this.f6074b = "fbconnect://success";
        this.h = false;
        this.i = false;
        this.j = false;
        bundle = bundle == null ? new Bundle() : bundle;
        bundle.putString("redirect_uri", "fbconnect://success");
        bundle.putString(TJAdUnitConstants.String.DISPLAY, "touch");
        bundle.putString(TapjoyConstants.TJC_SDK_PLACEMENT, String.format(Locale.ROOT, "android-%s", com.facebook.l.g()));
        this.f6073a = ab.a(z.a(), z.d() + "/dialog/" + str, bundle).toString();
        this.f6075c = cVar;
    }

    public void a(c cVar) {
        this.f6075c = cVar;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            cancel();
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        if (this.f6076d != null) {
            this.f6076d.stopLoading();
        }
        if (!this.i && this.e != null && this.e.isShowing()) {
            this.e.dismiss();
        }
        super.dismiss();
    }

    @Override // android.app.Dialog
    protected void onStart() {
        super.onStart();
        d();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        this.i = true;
        super.onDetachedFromWindow();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        this.i = false;
        super.onAttachedToWindow();
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.e = new ProgressDialog(getContext());
        this.e.requestWindowFeature(1);
        this.e.setMessage(getContext().getString(R.string.com_facebook_loading));
        this.e.setCanceledOnTouchOutside(false);
        this.e.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.facebook.internal.ad.1
            @Override // android.content.DialogInterface.OnCancelListener
            public void onCancel(DialogInterface dialogInterface) {
                ad.this.cancel();
            }
        });
        requestWindowFeature(1);
        this.g = new FrameLayout(getContext());
        d();
        getWindow().setGravity(17);
        getWindow().setSoftInputMode(16);
        e();
        a((this.f.getDrawable().getIntrinsicWidth() / 2) + 1);
        this.g.addView(this.f, new ViewGroup.LayoutParams(-2, -2));
        setContentView(this.g);
    }

    protected void b(String str) {
        this.f6074b = str;
    }

    protected Bundle a(String str) {
        Uri parse = Uri.parse(str);
        Bundle c2 = ab.c(parse.getQuery());
        c2.putAll(ab.c(parse.getFragment()));
        return c2;
    }

    protected boolean a() {
        return this.h;
    }

    protected boolean b() {
        return this.j;
    }

    protected WebView c() {
        return this.f6076d;
    }

    public void d() {
        Display defaultDisplay = ((WindowManager) getContext().getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        getWindow().setLayout(Math.min(a(displayMetrics.widthPixels < displayMetrics.heightPixels ? displayMetrics.widthPixels : displayMetrics.heightPixels, displayMetrics.density, 480, 800), displayMetrics.widthPixels), Math.min(a(displayMetrics.widthPixels < displayMetrics.heightPixels ? displayMetrics.heightPixels : displayMetrics.widthPixels, displayMetrics.density, 800, 1280), displayMetrics.heightPixels));
    }

    private int a(int i, float f, int i2, int i3) {
        int i4 = (int) (i / f);
        double d2 = 0.5d;
        if (i4 <= i2) {
            d2 = 1.0d;
        } else if (i4 < i3) {
            double d3 = i3 - i4;
            double d4 = i3 - i2;
            Double.isNaN(d3);
            Double.isNaN(d4);
            d2 = 0.5d + ((d3 / d4) * 0.5d);
        }
        double d5 = i;
        Double.isNaN(d5);
        return (int) (d5 * d2);
    }

    protected void a(Bundle bundle) {
        if (this.f6075c == null || this.h) {
            return;
        }
        this.h = true;
        this.f6075c.a(bundle, null);
        dismiss();
    }

    protected void a(Throwable th) {
        com.facebook.j jVar;
        if (this.f6075c == null || this.h) {
            return;
        }
        this.h = true;
        if (th instanceof com.facebook.j) {
            jVar = (com.facebook.j) th;
        } else {
            jVar = new com.facebook.j(th);
        }
        this.f6075c.a(null, jVar);
        dismiss();
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        if (this.f6075c == null || this.h) {
            return;
        }
        a(new com.facebook.k());
    }

    private void e() {
        this.f = new ImageView(getContext());
        this.f.setOnClickListener(new View.OnClickListener() { // from class: com.facebook.internal.ad.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ad.this.cancel();
            }
        });
        this.f.setImageDrawable(getContext().getResources().getDrawable(R.drawable.com_facebook_close));
        this.f.setVisibility(4);
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    private void a(int i) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.f6076d = new WebView(getContext().getApplicationContext()) { // from class: com.facebook.internal.ad.3
            @Override // android.webkit.WebView, android.view.View
            public void onWindowFocusChanged(boolean z) {
                try {
                    super.onWindowFocusChanged(z);
                } catch (NullPointerException unused) {
                }
            }
        };
        this.f6076d.setVerticalScrollBarEnabled(false);
        this.f6076d.setHorizontalScrollBarEnabled(false);
        this.f6076d.setWebViewClient(new b());
        this.f6076d.getSettings().setJavaScriptEnabled(true);
        this.f6076d.loadUrl(this.f6073a);
        this.f6076d.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f6076d.setVisibility(4);
        this.f6076d.getSettings().setSavePassword(false);
        this.f6076d.getSettings().setSaveFormData(false);
        this.f6076d.setFocusable(true);
        this.f6076d.setFocusableInTouchMode(true);
        this.f6076d.setOnTouchListener(new View.OnTouchListener() { // from class: com.facebook.internal.ad.4
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (view.hasFocus()) {
                    return false;
                }
                view.requestFocus();
                return false;
            }
        });
        linearLayout.setPadding(i, i, i, i);
        linearLayout.addView(this.f6076d);
        linearLayout.setBackgroundColor(-872415232);
        this.g.addView(linearLayout);
    }

    /* compiled from: WebDialog.java */
    private class b extends WebViewClient {
        private b() {
        }

        /* JADX WARN: Removed duplicated region for block: B:30:0x0090  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0096  */
        @Override // android.webkit.WebViewClient
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            int parseInt;
            ab.a("FacebookSDK.WebDialog", "Redirect URL: " + str);
            if (str.startsWith(ad.this.f6074b)) {
                Bundle a2 = ad.this.a(str);
                String string = a2.getString("error");
                if (string == null) {
                    string = a2.getString("error_type");
                }
                String string2 = a2.getString("error_msg");
                if (string2 == null) {
                    string2 = a2.getString("error_message");
                }
                if (string2 == null) {
                    string2 = a2.getString("error_description");
                }
                String string3 = a2.getString("error_code");
                if (!ab.a(string3)) {
                    try {
                        parseInt = Integer.parseInt(string3);
                    } catch (NumberFormatException unused) {
                    }
                    if (!ab.a(string) && ab.a(string2) && parseInt == -1) {
                        ad.this.a(a2);
                    } else if (string == null && (string.equals("access_denied") || string.equals("OAuthAccessDeniedException"))) {
                        ad.this.cancel();
                    } else if (parseInt != 4201) {
                        ad.this.cancel();
                    } else {
                        ad.this.a(new com.facebook.n(new FacebookRequestError(parseInt, string, string2), string2));
                    }
                    return true;
                }
                parseInt = -1;
                if (!ab.a(string)) {
                }
                if (string == null) {
                }
                if (parseInt != 4201) {
                }
                return true;
            }
            if (str.startsWith("fbconnect://cancel")) {
                ad.this.cancel();
                return true;
            }
            if (str.contains("touch")) {
                return false;
            }
            try {
                ad.this.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                return true;
            } catch (ActivityNotFoundException unused2) {
                return false;
            }
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            ad.this.a(new com.facebook.i(str, i, str2));
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
            sslErrorHandler.cancel();
            ad.this.a(new com.facebook.i(null, -11, null));
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            ab.a("FacebookSDK.WebDialog", "Webview loading URL: " + str);
            super.onPageStarted(webView, str, bitmap);
            if (ad.this.i) {
                return;
            }
            ad.this.e.show();
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            if (!ad.this.i) {
                ad.this.e.dismiss();
            }
            ad.this.g.setBackgroundColor(0);
            ad.this.f6076d.setVisibility(0);
            ad.this.f.setVisibility(0);
            ad.this.j = true;
        }
    }

    /* compiled from: WebDialog.java */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private Context f6081a;

        /* renamed from: b, reason: collision with root package name */
        private String f6082b;

        /* renamed from: c, reason: collision with root package name */
        private String f6083c;

        /* renamed from: d, reason: collision with root package name */
        private int f6084d;
        private c e;
        private Bundle f;
        private AccessToken g;

        public a(Context context, String str, Bundle bundle) {
            this.g = AccessToken.getCurrentAccessToken();
            if (this.g == null) {
                String a2 = ab.a(context);
                if (a2 != null) {
                    this.f6082b = a2;
                } else {
                    throw new com.facebook.j("Attempted to create a builder without a valid access token or a valid default Application ID.");
                }
            }
            a(context, str, bundle);
        }

        public a(Context context, String str, String str2, Bundle bundle) {
            str = str == null ? ab.a(context) : str;
            ac.a(str, "applicationId");
            this.f6082b = str;
            a(context, str2, bundle);
        }

        public a a(c cVar) {
            this.e = cVar;
            return this;
        }

        public ad a() {
            if (this.g != null) {
                this.f.putString(TapjoyConstants.TJC_APP_ID, this.g.getApplicationId());
                this.f.putString("access_token", this.g.getToken());
            } else {
                this.f.putString(TapjoyConstants.TJC_APP_ID, this.f6082b);
            }
            return new ad(this.f6081a, this.f6083c, this.f, this.f6084d, this.e);
        }

        public String b() {
            return this.f6082b;
        }

        public Context c() {
            return this.f6081a;
        }

        public int d() {
            return this.f6084d;
        }

        public Bundle e() {
            return this.f;
        }

        public c f() {
            return this.e;
        }

        private void a(Context context, String str, Bundle bundle) {
            this.f6081a = context;
            this.f6083c = str;
            if (bundle != null) {
                this.f = bundle;
            } else {
                this.f = new Bundle();
            }
        }
    }
}
