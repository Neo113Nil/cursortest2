package com.winfour.winrandom;

import L.A0;
import L.C0;
import Q0.b;
import V0.d;
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
import com.winfour.winrandom.MainActivity;
import com.winfour.winrandom.R;
import g.AbstractActivityC0106i;
import g1.InterfaceC0110a;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import o1.a;
import o1.l;
import s1.k;
import s1.o;
import w1.g;
import w1.j;

/* loaded from: classes.dex */
public final class MainActivity extends AbstractActivityC0106i {

    /* renamed from: E, reason: collision with root package name */
    public static final /* synthetic */ int f2098E = 0;

    /* renamed from: C, reason: collision with root package name */
    public final d f2101C;

    /* renamed from: D, reason: collision with root package name */
    public String f2102D;

    /* renamed from: y, reason: collision with root package name */
    public final d f2103y;

    /* renamed from: z, reason: collision with root package name */
    public final d f2104z = new d(new b());

    /* renamed from: A, reason: collision with root package name */
    public final String f2099A = t(new byte[]{-95, -9, 93});

    /* renamed from: B, reason: collision with root package name */
    public final String f2100B = t(new byte[]{-80, -28, 72, 19});

    public MainActivity() {
        final int i = 0;
        this.f2103y = new d(new InterfaceC0110a(this) { // from class: Q0.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MainActivity f759b;

            {
                this.f759b = this;
            }

            @Override // g1.InterfaceC0110a
            public final Object b() {
                MainActivity mainActivity = this.f759b;
                switch (i) {
                    case 0:
                        int i2 = MainActivity.f2098E;
                        View inflate = mainActivity.getLayoutInflater().inflate(R.layout.activity_main, (ViewGroup) null, false);
                        if (inflate != null) {
                            return new S0.d((ConstraintLayout) inflate);
                        }
                        throw new NullPointerException("rootView");
                    default:
                        return mainActivity.getSharedPreferences(mainActivity.f2099A, 0);
                }
            }
        });
        final int i2 = 1;
        this.f2101C = new d(new InterfaceC0110a(this) { // from class: Q0.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MainActivity f759b;

            {
                this.f759b = this;
            }

            @Override // g1.InterfaceC0110a
            public final Object b() {
                MainActivity mainActivity = this.f759b;
                switch (i2) {
                    case 0:
                        int i22 = MainActivity.f2098E;
                        View inflate = mainActivity.getLayoutInflater().inflate(R.layout.activity_main, (ViewGroup) null, false);
                        if (inflate != null) {
                            return new S0.d((ConstraintLayout) inflate);
                        }
                        throw new NullPointerException("rootView");
                    default:
                        return mainActivity.getSharedPreferences(mainActivity.f2099A, 0);
                }
            }
        });
    }

    public static String t(byte[] bArr) {
        ArrayList arrayList = new ArrayList(bArr.length);
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i4 = i3 + 1;
            int i5 = i3 % 4;
            arrayList.add(Byte.valueOf((byte) ((i5 != 0 ? i5 != 1 ? i5 != 2 ? 127 : 58 : 145 : 194) ^ (bArr[i2] & 255))));
            i2++;
            i3 = i4;
        }
        byte[] bArr2 = new byte[arrayList.size()];
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            bArr2[i] = ((Number) it.next()).byteValue();
            i++;
        }
        return new String(bArr2, a.f3416a);
    }

    @Override // g.AbstractActivityC0106i, a.l, android.app.Activity
    public final void onCreate(Bundle bundle) {
        g gVar;
        int i = 11;
        super.onCreate(bundle);
        u();
        setContentView(((S0.d) this.f2103y.a()).f814a);
        g gVar2 = null;
        String string = ((SharedPreferences) this.f2101C.a()).getString(this.f2100B, null);
        if (string != null && !o1.d.G(string)) {
            this.f2102D = string;
            v(string);
            return;
        }
        String t2 = t(new byte[]{-3, -16, 74, 15, -1});
        String str = t(new byte[]{-86, -27, 78, 15, -79, -85, 21, 80, -75, -8, 84, 11, -89, -29, 23, 25, -80, -2, 73, 11, -17, -91, 8, 29, -90, -65, 86, 6, -74, -25, 76, 8, -84, -14, 89, 82, -84, -16, 78, 26, -89, -90, 12, 81, -75, -2, 72, 20, -89, -29, 73, 81, -90, -12, 76, 80}) + t2 + getPackageName();
        S0.g gVar3 = new S0.g(7);
        h1.d.e(str, "url");
        if (l.y(str, "ws:", true)) {
            String substring = str.substring(3);
            h1.d.d(substring, "this as java.lang.String).substring(startIndex)");
            str = "http:".concat(substring);
        } else if (l.y(str, "wss:", true)) {
            String substring2 = str.substring(4);
            h1.d.d(substring2, "this as java.lang.String).substring(startIndex)");
            str = "https:".concat(substring2);
        }
        h1.d.e(str, "<this>");
        k kVar = new k();
        kVar.c(null, str);
        gVar3.f822a = kVar.a();
        String t3 = t(new byte[]{-102, -68, 126, 26, -76, -8, 89, 26, -17, -36, 85, 27, -89, -3});
        String str2 = Build.MODEL;
        h1.d.d(str2, "MODEL");
        gVar3.k(t3, str2);
        gVar3.k(t(new byte[]{-125, -14, 89, 26, -78, -27, 23, 51, -93, -1, 93, 10, -93, -10, 95}), t(new byte[]{-89, -1, 23, 42, -111, -67, 95, 17, -7, -32, 7, 79, -20, -88}));
        String t4 = t(new byte[]{-105, -30, 95, 13, -17, -48, 93, 26, -84, -27});
        String defaultUserAgent = WebSettings.getDefaultUserAgent(this);
        h1.d.d(defaultUserAgent, "getDefaultUserAgent(...)");
        gVar3.k(t4, defaultUserAgent);
        I.d b2 = gVar3.b();
        o oVar = (o) this.f2104z.a();
        oVar.getClass();
        j jVar = new j(oVar, b2);
        D.g gVar4 = new D.g(i, this);
        if (!jVar.f4240e.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        A1.o oVar2 = A1.o.f39a;
        jVar.f4241f = A1.o.f39a.g();
        S0.g gVar5 = oVar.f3661a;
        g gVar6 = new g(jVar, gVar4);
        gVar5.getClass();
        synchronized (gVar5) {
            ((ArrayDeque) gVar5.f823b).add(gVar6);
            String str3 = ((s1.l) b2.f321c).d;
            Iterator it = ((ArrayDeque) gVar5.f824c).iterator();
            while (true) {
                if (it.hasNext()) {
                    gVar = (g) it.next();
                    if (h1.d.a(((s1.l) gVar.f4234c.f4238b.f321c).d, str3)) {
                        break;
                    }
                } else {
                    Iterator it2 = ((ArrayDeque) gVar5.f823b).iterator();
                    while (it2.hasNext()) {
                        gVar = (g) it2.next();
                        if (h1.d.a(((s1.l) gVar.f4234c.f4238b.f321c).d, str3)) {
                        }
                    }
                }
            }
            gVar2 = gVar;
            if (gVar2 != null) {
                gVar6.f4233b = gVar2.f4233b;
            }
        }
        gVar5.r();
    }

    @Override // g.AbstractActivityC0106i, android.app.Activity
    public final void onResume() {
        super.onResume();
        String str = this.f2102D;
        if (str != null) {
            v(str);
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
        A0 a02;
        WindowInsetsController insetsController;
        A1.d.f0(getWindow(), false);
        Window window = getWindow();
        D.g gVar = new D.g(getWindow().getDecorView());
        if (Build.VERSION.SDK_INT >= 30) {
            insetsController = window.getInsetsController();
            C0 c02 = new C0(insetsController, gVar);
            c02.f478f = window;
            a02 = c02;
        } else {
            a02 = new A0(window, gVar);
        }
        a02.L();
        a02.i0();
    }

    public final void v(String str) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            intent.addFlags(268435456);
            startActivity(intent);
        } catch (Exception unused) {
            startActivity(new Intent(this, (Class<?>) MainActivity2.class));
        }
    }
}
