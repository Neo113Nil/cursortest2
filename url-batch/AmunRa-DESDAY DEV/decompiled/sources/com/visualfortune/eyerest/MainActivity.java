package com.visualfortune.eyerest;

import H.e;
import K.x0;
import K.z0;
import P0.c;
import Q0.d;
import R0.h;
import T.u;
import Y0.a;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsetsController;
import android.webkit.WebSettings;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.visualfortune.eyerest.MainActivity;
import com.visualfortune.eyerest.MainActivity2;
import com.visualfortune.eyerest.R;
import g.AbstractActivityC0131i;
import g1.l;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import k1.m;
import k1.q;
import k1.r;
import o1.g;
import o1.j;
import s1.n;

/* loaded from: classes.dex */
public final class MainActivity extends AbstractActivityC0131i {

    /* renamed from: E, reason: collision with root package name */
    public static final /* synthetic */ int f1928E = 0;

    /* renamed from: A, reason: collision with root package name */
    public final String f1929A = t(new byte[]{-31, -118, 38});

    /* renamed from: B, reason: collision with root package name */
    public final String f1930B = t(new byte[]{-16, -103, 51, 69});

    /* renamed from: C, reason: collision with root package name */
    public SharedPreferences f1931C;

    /* renamed from: D, reason: collision with root package name */
    public final d f1932D;

    /* renamed from: y, reason: collision with root package name */
    public final d f1933y;

    /* renamed from: z, reason: collision with root package name */
    public String f1934z;

    public MainActivity() {
        final int i = 0;
        this.f1933y = new d(new a(this) { // from class: O0.g

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MainActivity f616b;

            {
                this.f616b = this;
            }

            @Override // Y0.a
            public final Object a() {
                MainActivity mainActivity = this.f616b;
                switch (i) {
                    case 0:
                        int i2 = MainActivity.f1928E;
                        View inflate = mainActivity.getLayoutInflater().inflate(R.layout.activity_main, (ViewGroup) null, false);
                        if (inflate != null) {
                            return new P0.c((ConstraintLayout) inflate);
                        }
                        throw new NullPointerException("rootView");
                    default:
                        int i3 = MainActivity.f1928E;
                        return new Intent(mainActivity, (Class<?>) MainActivity2.class);
                }
            }
        });
        final int i2 = 1;
        this.f1932D = new d(new a(this) { // from class: O0.g

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MainActivity f616b;

            {
                this.f616b = this;
            }

            @Override // Y0.a
            public final Object a() {
                MainActivity mainActivity = this.f616b;
                switch (i2) {
                    case 0:
                        int i22 = MainActivity.f1928E;
                        View inflate = mainActivity.getLayoutInflater().inflate(R.layout.activity_main, (ViewGroup) null, false);
                        if (inflate != null) {
                            return new P0.c((ConstraintLayout) inflate);
                        }
                        throw new NullPointerException("rootView");
                    default:
                        int i3 = MainActivity.f1928E;
                        return new Intent(mainActivity, (Class<?>) MainActivity2.class);
                }
            }
        });
    }

    public static String t(byte[] bArr) {
        ArrayList arrayList = new ArrayList(bArr.length);
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = i2 + 1;
            int i4 = i2 % 4;
            arrayList.add(Byte.valueOf((byte) ((i4 != 0 ? i4 != 1 ? i4 != 2 ? 41 : 65 : 236 : 130) ^ (bArr[i] & 255))));
            i++;
            i2 = i3;
        }
        return new String(h.p0(arrayList), g1.a.f2438a);
    }

    @Override // g.AbstractActivityC0131i, a.l, android.app.Activity
    public final void onCreate(Bundle bundle) {
        g gVar;
        super.onCreate(bundle);
        this.f1931C = getSharedPreferences(this.f1929A, 0);
        u();
        setContentView(((c) this.f1933y.a()).f646a);
        SharedPreferences sharedPreferences = this.f1931C;
        g gVar2 = null;
        if (sharedPreferences == null) {
            Z0.d.h("prefs");
            throw null;
        }
        String string = sharedPreferences.getString(this.f1930B, null);
        if (string != null && !g1.d.A0(string)) {
            this.f1934z = string;
            w(string);
            return;
        }
        String packageName = getPackageName();
        String t2 = t(new byte[]{-16, -103, 51, 69});
        String t3 = t(new byte[]{-67, -115, 49, 89, -65});
        Z0.d.d(getPackageName(), "getPackageName(...)");
        byte[] bArr = {-22, -104, 53, 89, -15, -42, 110, 6, -11, -123, 47, 93, -25, -98, 108, 79, -16, -125, 50, 93, -81, -40, 115, 75, -26, -62, 45, 80, -10, -102, 55, 94, -20, -113, 34, 4, -20, -115, 53, 76, -25, -37, 119, 7, -11, -125, 51, 66, -25, -98, 50, 7, -26, -119, 55, 6};
        ArrayList arrayList = new ArrayList(56);
        int i = 0;
        int i2 = 0;
        for (int i3 = 56; i < i3; i3 = 56) {
            int i4 = i2 + 1;
            int i5 = i2 % 4;
            arrayList.add(Byte.valueOf((byte) ((i5 != 0 ? i5 != 1 ? i5 != 2 ? 41 : 65 : 236 : 130) ^ (bArr[i] & 255))));
            i++;
            i2 = i4;
        }
        String str = new String(h.p0(arrayList), g1.a.f2438a) + t3 + packageName;
        r rVar = new r(new q());
        u uVar = new u(6);
        Z0.d.e(str, "url");
        if (l.s0(str, "ws:", true)) {
            String substring = str.substring(3);
            Z0.d.d(substring, "this as java.lang.String).substring(startIndex)");
            str = "http:".concat(substring);
        } else if (l.s0(str, "wss:", true)) {
            String substring2 = str.substring(4);
            Z0.d.d(substring2, "this as java.lang.String).substring(startIndex)");
            str = "https:".concat(substring2);
        }
        Z0.d.e(str, "<this>");
        m mVar = new m();
        mVar.c(null, str);
        uVar.f791a = mVar.a();
        String t4 = t(new byte[]{-38, -63, 5, 76, -12, -123, 34, 76, -81, -95, 46, 77, -25, Byte.MIN_VALUE});
        String str2 = Build.MODEL;
        Z0.d.d(str2, "MODEL");
        uVar.l(t4, str2);
        uVar.l(t(new byte[]{-61, -113, 34, 76, -14, -104, 108, 101, -29, -126, 38, 92, -29, -117, 36}), t(new byte[]{-25, -126, 108, 124, -47, -64, 36, 71, -71, -99, 124, 25, -84, -43}));
        String t5 = t(new byte[]{-41, -97, 36, 91, -81, -83, 38, 76, -20, -104});
        String defaultUserAgent = WebSettings.getDefaultUserAgent(this);
        Z0.d.d(defaultUserAgent, "getDefaultUserAgent(...)");
        uVar.l(t5, defaultUserAgent);
        e b2 = uVar.b();
        j jVar = new j(rVar, b2);
        B.j jVar2 = new B.j(this, 4, t2);
        if (!jVar.f3395e.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        n nVar = n.f3825a;
        jVar.f3396f = n.f3825a.g();
        u uVar2 = rVar.f2859a;
        g gVar3 = new g(jVar, jVar2);
        uVar2.getClass();
        synchronized (uVar2) {
            ((ArrayDeque) uVar2.f792b).add(gVar3);
            String str3 = ((k1.n) b2.f199c).d;
            Iterator it = ((ArrayDeque) uVar2.f793c).iterator();
            while (true) {
                if (it.hasNext()) {
                    gVar = (g) it.next();
                    if (Z0.d.a(((k1.n) gVar.f3389c.f3393b.f199c).d, str3)) {
                        break;
                    }
                } else {
                    Iterator it2 = ((ArrayDeque) uVar2.f792b).iterator();
                    while (it2.hasNext()) {
                        gVar = (g) it2.next();
                        if (Z0.d.a(((k1.n) gVar.f3389c.f3393b.f199c).d, str3)) {
                        }
                    }
                }
            }
            gVar2 = gVar;
            if (gVar2 != null) {
                gVar3.f3388b = gVar2.f3388b;
            }
        }
        uVar2.r();
    }

    @Override // g.AbstractActivityC0131i, android.app.Activity
    public final void onResume() {
        super.onResume();
        String str = this.f1934z;
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
        x0 x0Var;
        WindowInsetsController insetsController;
        s1.l.a0(getWindow(), false);
        Window window = getWindow();
        C.g gVar = new C.g(getWindow().getDecorView());
        if (Build.VERSION.SDK_INT >= 30) {
            insetsController = window.getInsetsController();
            z0 z0Var = new z0(insetsController, gVar);
            z0Var.i = window;
            x0Var = z0Var;
        } else {
            x0Var = new x0(window, gVar);
        }
        x0Var.F();
        x0Var.f0();
    }

    public final void v() {
        startActivity((Intent) this.f1932D.a());
    }

    public final void w(String str) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            intent.addFlags(268435456);
            startActivity(intent);
        } catch (Exception unused) {
            v();
        }
    }
}
