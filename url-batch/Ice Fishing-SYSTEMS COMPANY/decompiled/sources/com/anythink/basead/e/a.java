package com.anythink.basead.e;

import D.y;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Base64;
import android.view.View;
import android.view.Window;
import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.anythink.basead.e;
import com.anythink.core.basead.ui.web.BaseWebView;
import com.anythink.core.basead.ui.web.WebProgressBarView;
import com.anythink.core.basead.ui.web.b;
import com.anythink.core.common.d.t;
import com.anythink.core.common.h.cc;
import com.anythink.core.common.h.w;
import com.anythink.core.common.h.x;
import com.anythink.core.common.v.q;
import com.anythink.expressad.foundation.d.d;
import com.anythink.expressad.foundation.h.k;
import java.net.URLDecoder;
import java.util.Objects;

/* loaded from: classes.dex */
public class a extends Dialog {

    /* renamed from: A, reason: collision with root package name */
    private final String f6401A;

    /* renamed from: B, reason: collision with root package name */
    private final String f6402B;

    /* renamed from: C, reason: collision with root package name */
    private View.OnClickListener f6403C;

    /* renamed from: a, reason: collision with root package name */
    public w f6404a;

    /* renamed from: b, reason: collision with root package name */
    public x f6405b;

    /* renamed from: c, reason: collision with root package name */
    String f6406c;

    /* renamed from: d, reason: collision with root package name */
    private final String f6407d;

    /* renamed from: e, reason: collision with root package name */
    private e.a f6408e;

    /* renamed from: f, reason: collision with root package name */
    private RelativeLayout f6409f;

    /* renamed from: g, reason: collision with root package name */
    private EditText f6410g;

    /* renamed from: h, reason: collision with root package name */
    private ImageView f6411h;
    private TextView i;

    /* renamed from: j, reason: collision with root package name */
    private TextView f6412j;

    /* renamed from: k, reason: collision with root package name */
    private TextView f6413k;

    /* renamed from: l, reason: collision with root package name */
    private TextView f6414l;

    /* renamed from: m, reason: collision with root package name */
    private TextView f6415m;

    /* renamed from: n, reason: collision with root package name */
    private TextView f6416n;

    /* renamed from: o, reason: collision with root package name */
    private TextView f6417o;

    /* renamed from: p, reason: collision with root package name */
    private TextView f6418p;

    /* renamed from: q, reason: collision with root package name */
    private TextView f6419q;

    /* renamed from: r, reason: collision with root package name */
    private TextView f6420r;

    /* renamed from: s, reason: collision with root package name */
    private String f6421s;

    /* renamed from: t, reason: collision with root package name */
    private TextView f6422t;

    /* renamed from: u, reason: collision with root package name */
    private FrameLayout f6423u;

    /* renamed from: v, reason: collision with root package name */
    private BaseWebView f6424v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f6425w;

    /* renamed from: x, reason: collision with root package name */
    private final String f6426x;

    /* renamed from: y, reason: collision with root package name */
    private final String f6427y;

    /* renamed from: z, reason: collision with root package name */
    private final String f6428z;

    /* renamed from: com.anythink.basead.e.a$3, reason: invalid class name */
    public class AnonymousClass3 implements b {
        public AnonymousClass3() {
        }

        @Override // com.anythink.core.basead.ui.web.b
        public final void callbackClickResult(cc ccVar) {
        }

        @Override // com.anythink.core.basead.ui.web.b
        public final w getBaseAdContent() {
            return null;
        }

        @Override // com.anythink.core.basead.ui.web.b
        public final WebProgressBarView getWebProgressBarView() {
            return null;
        }

        @Override // com.anythink.core.basead.ui.web.b
        public final void onWebFinish() {
        }

        @Override // com.anythink.core.basead.ui.web.b
        public final void onWebPageFinish(WebView webView, String str) {
            String unused = a.this.f6407d;
            if (a.this.f6425w) {
                return;
            }
            a.c(a.this);
            a.d(a.this);
            a aVar = a.this;
            com.anythink.core.common.u.e.a(aVar.f6405b, aVar.f6404a, "1");
        }

        @Override // com.anythink.core.basead.ui.web.b
        public final void onWebPageLoadError(WebView webView, String str) {
            if (a.this.f6425w) {
                return;
            }
            a.c(a.this);
            a.this.c();
            a aVar = a.this;
            com.anythink.core.common.u.e.a(aVar.f6405b, aVar.f6404a, "2");
        }

        @Override // com.anythink.core.basead.ui.web.b
        public final void onWebPageStart(WebView webView, String str) {
        }

        @Override // com.anythink.core.basead.ui.web.b
        public final void recordRedirectUrl(String str) {
        }

        @Override // com.anythink.core.basead.ui.web.b
        public final boolean supportDeeplinkJump() {
            return true;
        }
    }

    /* renamed from: com.anythink.basead.e.a$4, reason: invalid class name */
    public class AnonymousClass4 extends WebChromeClient {
        public AnonymousClass4() {
        }

        @Override // android.webkit.WebChromeClient
        public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            if (consoleMessage == null) {
                return false;
            }
            String unused = a.this.f6407d;
            Objects.toString(consoleMessage.messageLevel());
            consoleMessage.message();
            if (consoleMessage.messageLevel() != ConsoleMessage.MessageLevel.LOG) {
                return super.onConsoleMessage(consoleMessage);
            }
            a.this.a(consoleMessage.message());
            return false;
        }
    }

    /* renamed from: com.anythink.basead.e.a$5, reason: invalid class name */
    public class AnonymousClass5 implements View.OnClickListener {
        public AnonymousClass5() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            a.this.g();
        }
    }

    /* renamed from: com.anythink.basead.e.a$6, reason: invalid class name */
    public class AnonymousClass6 implements TextWatcher {
        public AnonymousClass6() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            a.this.f();
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i4, int i9) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i4, int i9) {
        }
    }

    /* renamed from: com.anythink.basead.e.a$7, reason: invalid class name */
    public class AnonymousClass7 implements View.OnClickListener {
        public AnonymousClass7() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            a aVar = a.this;
            com.anythink.core.common.u.e.a(aVar.f6404a, aVar.f6405b, TextUtils.isEmpty(aVar.f6421s) ? "0" : a.this.f6421s, a.this.f6410g.getText().toString());
            if (a.this.f6408e != null) {
                e.a unused = a.this.f6408e;
            }
            a.this.g();
        }
    }

    private a(Context context) {
        super(context);
        this.f6407d = "a";
        this.f6406c = "";
        this.f6425w = false;
        this.f6426x = "HybridInteract";
        this.f6427y = "HybridInteractCall";
        this.f6428z = d.cs;
        this.f6401A = "showfeedback";
        this.f6402B = "browser";
        this.f6403C = new View.OnClickListener() { // from class: com.anythink.basead.e.a.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (view instanceof TextView) {
                    TextView textView = (TextView) view;
                    a.a(a.this, textView, textView.getTag().toString());
                }
            }
        };
    }

    public static /* synthetic */ boolean c(a aVar) {
        aVar.f6425w = true;
        return true;
    }

    private void d() {
        w wVar = this.f6404a;
        String aj = wVar != null ? wVar.aj() : "";
        if (TextUtils.isEmpty(aj)) {
            return;
        }
        BaseWebView baseWebView = this.f6424v;
        String encodeToString = Base64.encodeToString(aj.getBytes(), 2);
        if (baseWebView == null || baseWebView.isDestroyed()) {
            return;
        }
        try {
            baseWebView.loadUrl(TextUtils.isEmpty(encodeToString) ? "javascript:window.HybridInteract.fireEvent('setData', '');" : y.k("javascript:window.HybridInteract.fireEvent('setData','", com.anythink.core.express.d.d.c(encodeToString), "');"));
        } catch (Throwable unused) {
        }
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Context context = getContext();
        setContentView(q.a(context, "myoffer_feedback", "layout"));
        setCancelable(true);
        Window window = getWindow();
        if (window != null) {
            if (context.getResources().getDisplayMetrics().widthPixels > context.getResources().getDisplayMetrics().heightPixels) {
                window.setGravity(5);
                window.setLayout(q.a(context, 376.0f), -1);
            } else {
                window.setGravity(80);
                window.setLayout(-1, -2);
            }
        }
        Context context2 = getContext();
        this.f6411h = (ImageView) findViewById(q.a(context2, "myoffer_feedback_iv_close", "id"));
        this.f6409f = (RelativeLayout) findViewById(q.a(context2, "myoffer_feedback_container", "id"));
        this.f6423u = (FrameLayout) findViewById(q.a(context2, "myoffer_feedback_privacy_web_container", "id"));
        this.f6410g = (EditText) findViewById(q.a(context2, "myoffer_feedback_et", "id"));
        this.i = (TextView) findViewById(q.a(context2, "myoffer_feedback_tv_commit", "id"));
        this.f6412j = (TextView) findViewById(q.a(context2, "myoffer_feedback_tv_1", "id"));
        this.f6413k = (TextView) findViewById(q.a(context2, "myoffer_feedback_tv_2", "id"));
        this.f6414l = (TextView) findViewById(q.a(context2, "myoffer_feedback_tv_3", "id"));
        this.f6415m = (TextView) findViewById(q.a(context2, "myoffer_feedback_tv_4", "id"));
        this.f6416n = (TextView) findViewById(q.a(context2, "myoffer_feedback_tv_5", "id"));
        this.f6417o = (TextView) findViewById(q.a(context2, "myoffer_feedback_tv_6", "id"));
        this.f6418p = (TextView) findViewById(q.a(context2, "myoffer_feedback_tv_7", "id"));
        this.f6419q = (TextView) findViewById(q.a(context2, "myoffer_feedback_tv_8", "id"));
        this.f6420r = (TextView) findViewById(q.a(context2, "myoffer_feedback_tv_9", "id"));
        this.f6411h.setOnClickListener(new AnonymousClass5());
        this.f6412j.setOnClickListener(this.f6403C);
        this.f6413k.setOnClickListener(this.f6403C);
        this.f6414l.setOnClickListener(this.f6403C);
        this.f6415m.setOnClickListener(this.f6403C);
        this.f6416n.setOnClickListener(this.f6403C);
        this.f6417o.setOnClickListener(this.f6403C);
        this.f6418p.setOnClickListener(this.f6403C);
        this.f6419q.setOnClickListener(this.f6403C);
        this.f6420r.setOnClickListener(this.f6403C);
        this.f6410g.addTextChangedListener(new AnonymousClass6());
        this.i.setOnClickListener(new AnonymousClass7());
        if (TextUtils.isEmpty(this.f6406c)) {
            c();
            com.anythink.core.common.u.e.a(this.f6405b, this.f6404a, "");
        } else {
            this.f6409f.setVisibility(8);
            this.f6423u.setVisibility(0);
            BaseWebView baseWebView = new BaseWebView(context2);
            this.f6424v = baseWebView;
            baseWebView.setBackgroundColor(-1);
            com.anythink.core.basead.ui.a.a.a(this.f6424v, context2, new AnonymousClass3());
            com.anythink.core.basead.ui.a.a.a(this.f6424v, new AnonymousClass4());
            this.f6424v.loadUrl(this.f6406c);
            this.f6423u.addView(this.f6424v);
        }
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.anythink.basead.e.a.2
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                a.this.a();
            }
        });
    }

    private void a(Context context) {
        BaseWebView baseWebView = new BaseWebView(context);
        this.f6424v = baseWebView;
        baseWebView.setBackgroundColor(-1);
        com.anythink.core.basead.ui.a.a.a(this.f6424v, context, new AnonymousClass3());
        com.anythink.core.basead.ui.a.a.a(this.f6424v, new AnonymousClass4());
        this.f6424v.loadUrl(this.f6406c);
        this.f6423u.addView(this.f6424v);
    }

    private void b() {
        Context context = getContext();
        this.f6411h = (ImageView) findViewById(q.a(context, "myoffer_feedback_iv_close", "id"));
        this.f6409f = (RelativeLayout) findViewById(q.a(context, "myoffer_feedback_container", "id"));
        this.f6423u = (FrameLayout) findViewById(q.a(context, "myoffer_feedback_privacy_web_container", "id"));
        this.f6410g = (EditText) findViewById(q.a(context, "myoffer_feedback_et", "id"));
        this.i = (TextView) findViewById(q.a(context, "myoffer_feedback_tv_commit", "id"));
        this.f6412j = (TextView) findViewById(q.a(context, "myoffer_feedback_tv_1", "id"));
        this.f6413k = (TextView) findViewById(q.a(context, "myoffer_feedback_tv_2", "id"));
        this.f6414l = (TextView) findViewById(q.a(context, "myoffer_feedback_tv_3", "id"));
        this.f6415m = (TextView) findViewById(q.a(context, "myoffer_feedback_tv_4", "id"));
        this.f6416n = (TextView) findViewById(q.a(context, "myoffer_feedback_tv_5", "id"));
        this.f6417o = (TextView) findViewById(q.a(context, "myoffer_feedback_tv_6", "id"));
        this.f6418p = (TextView) findViewById(q.a(context, "myoffer_feedback_tv_7", "id"));
        this.f6419q = (TextView) findViewById(q.a(context, "myoffer_feedback_tv_8", "id"));
        this.f6420r = (TextView) findViewById(q.a(context, "myoffer_feedback_tv_9", "id"));
        this.f6411h.setOnClickListener(new AnonymousClass5());
        this.f6412j.setOnClickListener(this.f6403C);
        this.f6413k.setOnClickListener(this.f6403C);
        this.f6414l.setOnClickListener(this.f6403C);
        this.f6415m.setOnClickListener(this.f6403C);
        this.f6416n.setOnClickListener(this.f6403C);
        this.f6417o.setOnClickListener(this.f6403C);
        this.f6418p.setOnClickListener(this.f6403C);
        this.f6419q.setOnClickListener(this.f6403C);
        this.f6420r.setOnClickListener(this.f6403C);
        this.f6410g.addTextChangedListener(new AnonymousClass6());
        this.i.setOnClickListener(new AnonymousClass7());
        if (TextUtils.isEmpty(this.f6406c)) {
            c();
            com.anythink.core.common.u.e.a(this.f6405b, this.f6404a, "");
            return;
        }
        this.f6409f.setVisibility(8);
        this.f6423u.setVisibility(0);
        BaseWebView baseWebView = new BaseWebView(context);
        this.f6424v = baseWebView;
        baseWebView.setBackgroundColor(-1);
        com.anythink.core.basead.ui.a.a.a(this.f6424v, context, new AnonymousClass3());
        com.anythink.core.basead.ui.a.a.a(this.f6424v, new AnonymousClass4());
        this.f6424v.loadUrl(this.f6406c);
        this.f6423u.addView(this.f6424v);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        this.f6409f.setVisibility(0);
        this.f6423u.setVisibility(8);
    }

    private void e() {
        this.f6411h.setOnClickListener(new AnonymousClass5());
        this.f6412j.setOnClickListener(this.f6403C);
        this.f6413k.setOnClickListener(this.f6403C);
        this.f6414l.setOnClickListener(this.f6403C);
        this.f6415m.setOnClickListener(this.f6403C);
        this.f6416n.setOnClickListener(this.f6403C);
        this.f6417o.setOnClickListener(this.f6403C);
        this.f6418p.setOnClickListener(this.f6403C);
        this.f6419q.setOnClickListener(this.f6403C);
        this.f6420r.setOnClickListener(this.f6403C);
        this.f6410g.addTextChangedListener(new AnonymousClass6());
        this.i.setOnClickListener(new AnonymousClass7());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        if (TextUtils.isEmpty(this.f6421s) && TextUtils.isEmpty(this.f6410g.getText().toString())) {
            this.i.setEnabled(false);
        } else {
            this.i.setEnabled(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        t.b().a(new Runnable() { // from class: com.anythink.basead.e.a.8
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    a.this.dismiss();
                } catch (Throwable unused) {
                }
            }
        }, 30L);
    }

    private static void a(BaseWebView baseWebView, String str, String str2) {
        String l9;
        if (baseWebView == null || baseWebView.isDestroyed()) {
            return;
        }
        if (TextUtils.isEmpty(str2)) {
            l9 = y.k("javascript:window.HybridInteract.fireEvent('", str, "', '');");
        } else {
            l9 = y.l("javascript:window.HybridInteract.fireEvent('", str, "','", com.anythink.core.express.d.d.c(str2), "');");
        }
        try {
            baseWebView.loadUrl(l9);
        } catch (Throwable unused) {
        }
    }

    public a(Context context, int i) {
        super(context, i);
        this.f6407d = "a";
        this.f6406c = "";
        this.f6425w = false;
        this.f6426x = "HybridInteract";
        this.f6427y = "HybridInteractCall";
        this.f6428z = d.cs;
        this.f6401A = "showfeedback";
        this.f6402B = "browser";
        this.f6403C = new View.OnClickListener() { // from class: com.anythink.basead.e.a.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (view instanceof TextView) {
                    TextView textView = (TextView) view;
                    a.a(a.this, textView, textView.getTag().toString());
                }
            }
        };
    }

    public static /* synthetic */ void d(a aVar) {
        String str;
        String k6;
        w wVar = aVar.f6404a;
        if (wVar != null) {
            str = wVar.aj();
        } else {
            str = "";
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        BaseWebView baseWebView = aVar.f6424v;
        String encodeToString = Base64.encodeToString(str.getBytes(), 2);
        if (baseWebView == null || baseWebView.isDestroyed()) {
            return;
        }
        if (TextUtils.isEmpty(encodeToString)) {
            k6 = "javascript:window.HybridInteract.fireEvent('setData', '');";
        } else {
            k6 = y.k("javascript:window.HybridInteract.fireEvent('setData','", com.anythink.core.express.d.d.c(encodeToString), "');");
        }
        try {
            baseWebView.loadUrl(k6);
        } catch (Throwable unused) {
        }
    }

    private a(Context context, boolean z8, DialogInterface.OnCancelListener onCancelListener) {
        super(context, z8, onCancelListener);
        this.f6407d = "a";
        this.f6406c = "";
        this.f6425w = false;
        this.f6426x = "HybridInteract";
        this.f6427y = "HybridInteractCall";
        this.f6428z = d.cs;
        this.f6401A = "showfeedback";
        this.f6402B = "browser";
        this.f6403C = new View.OnClickListener() { // from class: com.anythink.basead.e.a.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (view instanceof TextView) {
                    TextView textView = (TextView) view;
                    a.a(a.this, textView, textView.getTag().toString());
                }
            }
        };
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0040, code lost:
    
        if (r2.equals(com.anythink.expressad.foundation.d.d.cs) == false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(String str) {
        boolean z8 = true;
        if (TextUtils.isEmpty(str) || !str.startsWith("HybridInteractCall")) {
            return;
        }
        String[] split = str.split("_");
        if (split.length >= 2) {
            String str2 = split[1];
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            str2.getClass();
            switch (str2.hashCode()) {
                case -1108117118:
                    if (str2.equals("showfeedback")) {
                        z8 = false;
                        break;
                    }
                    z8 = -1;
                    break;
                case 94756344:
                    break;
                case 150940456:
                    if (str2.equals("browser")) {
                        z8 = 2;
                        break;
                    }
                    z8 = -1;
                    break;
                default:
                    z8 = -1;
                    break;
            }
            switch (z8) {
                case false:
                    c();
                    break;
                case true:
                    g();
                    break;
                case true:
                    try {
                        String substring = str.substring(27);
                        if (!TextUtils.isEmpty(substring)) {
                            substring = URLDecoder.decode(substring);
                        }
                        if (!TextUtils.isEmpty(substring)) {
                            com.anythink.core.common.v.y.a(substring);
                            break;
                        }
                    } catch (Throwable unused) {
                        return;
                    }
                    break;
            }
        }
    }

    public final void a(e.a aVar, w wVar, x xVar) {
        this.f6408e = aVar;
        this.f6404a = wVar;
        this.f6405b = xVar;
        if (wVar != null) {
            this.f6406c = wVar.ak();
        }
    }

    private void a(TextView textView, String str) {
        if (TextUtils.isEmpty(this.f6421s)) {
            this.f6421s = str;
            this.f6422t = textView;
            if (textView != null) {
                textView.setTextColor(Color.parseColor("#2265FF"));
                this.f6422t.setBackgroundResource(q.a(textView.getContext(), "myoffer_bg_feedback_textview_pressed", k.f19790c));
            }
        } else if (TextUtils.equals(this.f6421s, str)) {
            TextView textView2 = this.f6422t;
            if (textView2 != null) {
                textView2.setTextColor(Color.parseColor("#84879D"));
                this.f6422t.setBackgroundResource(q.a(textView.getContext(), "myoffer_bg_feedback_textview", k.f19790c));
            }
            this.f6421s = "";
            this.f6422t = null;
        } else {
            TextView textView3 = this.f6422t;
            if (textView3 != null) {
                textView3.setTextColor(Color.parseColor("#84879D"));
                this.f6422t.setBackgroundResource(q.a(textView.getContext(), "myoffer_bg_feedback_textview", k.f19790c));
            }
            this.f6421s = str;
            this.f6422t = textView;
            textView.setTextColor(Color.parseColor("#2265FF"));
            this.f6422t.setBackgroundResource(q.a(textView.getContext(), "myoffer_bg_feedback_textview_pressed", k.f19790c));
        }
        f();
    }

    public final void a() {
        e.a aVar = this.f6408e;
        if (aVar != null) {
            aVar.b();
        }
        this.f6408e = null;
        this.f6404a = null;
        this.f6405b = null;
        BaseWebView baseWebView = this.f6424v;
        if (baseWebView != null) {
            baseWebView.destroy();
            this.f6424v = null;
        }
    }

    public static /* synthetic */ void a(a aVar, TextView textView, String str) {
        if (TextUtils.isEmpty(aVar.f6421s)) {
            aVar.f6421s = str;
            aVar.f6422t = textView;
            if (textView != null) {
                textView.setTextColor(Color.parseColor("#2265FF"));
                aVar.f6422t.setBackgroundResource(q.a(textView.getContext(), "myoffer_bg_feedback_textview_pressed", k.f19790c));
            }
        } else if (TextUtils.equals(aVar.f6421s, str)) {
            TextView textView2 = aVar.f6422t;
            if (textView2 != null) {
                textView2.setTextColor(Color.parseColor("#84879D"));
                aVar.f6422t.setBackgroundResource(q.a(textView.getContext(), "myoffer_bg_feedback_textview", k.f19790c));
            }
            aVar.f6421s = "";
            aVar.f6422t = null;
        } else {
            TextView textView3 = aVar.f6422t;
            if (textView3 != null) {
                textView3.setTextColor(Color.parseColor("#84879D"));
                aVar.f6422t.setBackgroundResource(q.a(textView.getContext(), "myoffer_bg_feedback_textview", k.f19790c));
            }
            aVar.f6421s = str;
            aVar.f6422t = textView;
            textView.setTextColor(Color.parseColor("#2265FF"));
            aVar.f6422t.setBackgroundResource(q.a(textView.getContext(), "myoffer_bg_feedback_textview_pressed", k.f19790c));
        }
        aVar.f();
    }
}
