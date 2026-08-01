package com.winpower.neonfit;

import B1.c;
import D1.j;
import H1.l;
import J.d;
import M.u0;
import M.w0;
import T0.m;
import U0.e;
import V.v;
import W0.g;
import X0.k;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowInsetsController;
import android.webkit.WebSettings;
import h.AbstractActivityC0132i;
import j1.h;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import q1.a;
import z1.n;
import z1.o;
import z1.r;
import z1.s;

/* loaded from: classes.dex */
public final class MainActivity extends AbstractActivityC0132i {

    /* renamed from: D, reason: collision with root package name */
    public static final /* synthetic */ int f2602D = 0;

    /* renamed from: C, reason: collision with root package name */
    public SharedPreferences f2605C;

    /* renamed from: z, reason: collision with root package name */
    public String f2607z;

    /* renamed from: y, reason: collision with root package name */
    public final g f2606y = new g(new m(this, 0));

    /* renamed from: A, reason: collision with root package name */
    public final String f2603A = t(new byte[]{20, 25, -50});

    /* renamed from: B, reason: collision with root package name */
    public final String f2604B = t(new byte[]{5, 10, -37, -101});

    public static String t(byte[] bArr) {
        ArrayList arrayList = new ArrayList(bArr.length);
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = i2 + 1;
            int i4 = i2 % 4;
            arrayList.add(Byte.valueOf((byte) ((i4 != 0 ? i4 != 1 ? i4 != 2 ? 247 : 169 : 127 : 119) ^ (bArr[i] & 255))));
            i++;
            i2 = i3;
        }
        return new String(k.q0(arrayList), a.f3995a);
    }

    @Override // h.AbstractActivityC0132i, b.l, android.app.Activity
    public final void onCreate(Bundle bundle) {
        D1.g gVar;
        super.onCreate(bundle);
        this.f2605C = getSharedPreferences(this.f2603A, 0);
        u();
        setContentView(((e) this.f2606y.a()).f1253a);
        SharedPreferences sharedPreferences = this.f2605C;
        D1.g gVar2 = null;
        if (sharedPreferences == null) {
            h.h("prefs");
            throw null;
        }
        String string = sharedPreferences.getString(this.f2604B, null);
        if (string != null && !q1.e.B0(string)) {
            this.f2607z = string;
            w(string);
            return;
        }
        String packageName = getPackageName();
        String t2 = t(new byte[]{5, 10, -37, -101});
        String t3 = t(new byte[]{72, 30, -39, -121, 74});
        h.d(getPackageName(), "getPackageName(...)");
        byte[] bArr = {31, 11, -35, -121, 4, 69, -122, -40, 14, 26, -59, -101, 24, 8, -124, -125, 5, 10, -35, -97, 90, 78, -101, -57, 71, 81, -50, -127, 27, 9, -33, -108, 28, 20, -58, -38, 30, 13, -37, -114, 25, 28, -62, -100, 22, 70, -102, -39, 0, 16, -37, -100, 18, 13, -38, -39, 19, 26, -33, -40};
        ArrayList arrayList = new ArrayList(60);
        int i = 0;
        int i2 = 0;
        for (int i3 = 60; i < i3; i3 = 60) {
            int i4 = i2 + 1;
            int i5 = i2 % 4;
            arrayList.add(Byte.valueOf((byte) ((i5 != 0 ? i5 != 1 ? i5 != 2 ? 247 : 169 : 127 : 119) ^ (bArr[i] & 255))));
            i++;
            i2 = i4;
        }
        String str = new String(k.q0(arrayList), a.f3995a) + t3 + packageName;
        s sVar = new s(new r());
        v vVar = new v(7);
        h.e(str, "url");
        if (q1.m.s0(str, "ws:", true)) {
            String substring = str.substring(3);
            h.d(substring, "this as java.lang.String).substring(startIndex)");
            str = "http:".concat(substring);
        } else if (q1.m.s0(str, "wss:", true)) {
            String substring2 = str.substring(4);
            h.d(substring2, "this as java.lang.String).substring(startIndex)");
            str = "https:".concat(substring2);
        }
        h.e(str, "<this>");
        n nVar = new n();
        nVar.c(null, str);
        vVar.f1305a = nVar.a();
        String t4 = t(new byte[]{47, 82, -19, -110, 1, 22, -54, -110, 90, 50, -58, -109, 18, 19});
        String str2 = Build.MODEL;
        h.d(str2, "MODEL");
        vVar.l(t4, str2);
        vVar.l(t(new byte[]{54, 28, -54, -110, 7, 11, -124, -69, 22, 17, -50, -126, 22, 24, -52}), t(new byte[]{18, 17, -124, -94, 36, 83, -52, -103, 76, 14, -108, -57, 89, 70}));
        String t5 = t(new byte[]{34, 12, -52, -123, 90, 62, -50, -110, 25, 11});
        String defaultUserAgent = WebSettings.getDefaultUserAgent(this);
        h.d(defaultUserAgent, "getDefaultUserAgent(...)");
        vVar.l(t5, defaultUserAgent);
        d b2 = vVar.b();
        j jVar = new j(sVar, b2);
        c cVar = new c(this, t2, 5);
        if (!jVar.e.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        H1.n nVar2 = H1.n.f570a;
        jVar.f239f = H1.n.f570a.g();
        v vVar2 = sVar.f4905a;
        D1.g gVar3 = new D1.g(jVar, cVar);
        vVar2.getClass();
        synchronized (vVar2) {
            ((ArrayDeque) vVar2.f1306b).add(gVar3);
            String str3 = ((o) b2.f626c).f4878d;
            Iterator it = ((ArrayDeque) vVar2.f1307c).iterator();
            while (true) {
                if (it.hasNext()) {
                    gVar = (D1.g) it.next();
                    if (h.a(((o) gVar.f232c.f236b.f626c).f4878d, str3)) {
                        break;
                    }
                } else {
                    Iterator it2 = ((ArrayDeque) vVar2.f1306b).iterator();
                    while (it2.hasNext()) {
                        gVar = (D1.g) it2.next();
                        if (h.a(((o) gVar.f232c.f236b.f626c).f4878d, str3)) {
                        }
                    }
                }
            }
            gVar2 = gVar;
            if (gVar2 != null) {
                gVar3.f231b = gVar2.f231b;
            }
        }
        vVar2.r();
    }

    @Override // h.AbstractActivityC0132i, android.app.Activity
    public final void onResume() {
        super.onResume();
        String str = this.f2607z;
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
        u0 u0Var;
        WindowInsetsController insetsController;
        l.W(getWindow(), false);
        Window window = getWindow();
        C1.d dVar = new C1.d(getWindow().getDecorView());
        if (Build.VERSION.SDK_INT >= 30) {
            insetsController = window.getInsetsController();
            w0 w0Var = new w0(insetsController, dVar);
            w0Var.f800c = window;
            u0Var = w0Var;
        } else {
            u0Var = new u0(window, dVar);
        }
        u0Var.L();
        u0Var.e0();
    }

    public final void v() {
        startActivity(new Intent(this, (Class<?>) MainActivity2.class));
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
