package com.playbag.tripgear;

import K.A0;
import K.C0;
import P0.k;
import Q0.d;
import R0.e;
import S0.g;
import U.u;
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
import c1.InterfaceC0085a;
import com.playbag.tripgear.MainActivity;
import com.playbag.tripgear.MainActivity2;
import com.playbag.tripgear.R;
import g.AbstractActivityC0106i;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import k1.a;
import k1.l;
import o1.p;
import s1.j;
import w1.n;

/* loaded from: classes.dex */
public final class MainActivity extends AbstractActivityC0106i {
    public static final /* synthetic */ int F = 0;

    /* renamed from: C, reason: collision with root package name */
    public final e f1998C;

    /* renamed from: E, reason: collision with root package name */
    public final e f2000E;

    /* renamed from: y, reason: collision with root package name */
    public final e f2001y;

    /* renamed from: z, reason: collision with root package name */
    public String f2002z;

    /* renamed from: A, reason: collision with root package name */
    public final String f1996A = t(new byte[]{51, 64, 123});

    /* renamed from: B, reason: collision with root package name */
    public final String f1997B = t(new byte[]{34, 83, 110, -125});

    /* renamed from: D, reason: collision with root package name */
    public final e f1999D = new e(new k());

    public MainActivity() {
        final int i = 0;
        this.f2001y = new e(new InterfaceC0085a(this) { // from class: P0.j

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MainActivity f699b;

            {
                this.f699b = this;
            }

            @Override // c1.InterfaceC0085a
            public final Object b() {
                MainActivity mainActivity = this.f699b;
                switch (i) {
                    case 0:
                        int i2 = MainActivity.F;
                        View inflate = mainActivity.getLayoutInflater().inflate(R.layout.activity_main, (ViewGroup) null, false);
                        if (inflate != null) {
                            return new Q0.d((ConstraintLayout) inflate);
                        }
                        throw new NullPointerException("rootView");
                    case 1:
                        return mainActivity.getSharedPreferences(mainActivity.f1996A, 0);
                    default:
                        int i3 = MainActivity.F;
                        return new Intent(mainActivity, (Class<?>) MainActivity2.class);
                }
            }
        });
        final int i2 = 1;
        this.f1998C = new e(new InterfaceC0085a(this) { // from class: P0.j

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MainActivity f699b;

            {
                this.f699b = this;
            }

            @Override // c1.InterfaceC0085a
            public final Object b() {
                MainActivity mainActivity = this.f699b;
                switch (i2) {
                    case 0:
                        int i22 = MainActivity.F;
                        View inflate = mainActivity.getLayoutInflater().inflate(R.layout.activity_main, (ViewGroup) null, false);
                        if (inflate != null) {
                            return new Q0.d((ConstraintLayout) inflate);
                        }
                        throw new NullPointerException("rootView");
                    case 1:
                        return mainActivity.getSharedPreferences(mainActivity.f1996A, 0);
                    default:
                        int i3 = MainActivity.F;
                        return new Intent(mainActivity, (Class<?>) MainActivity2.class);
                }
            }
        });
        final int i3 = 2;
        this.f2000E = new e(new InterfaceC0085a(this) { // from class: P0.j

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MainActivity f699b;

            {
                this.f699b = this;
            }

            @Override // c1.InterfaceC0085a
            public final Object b() {
                MainActivity mainActivity = this.f699b;
                switch (i3) {
                    case 0:
                        int i22 = MainActivity.F;
                        View inflate = mainActivity.getLayoutInflater().inflate(R.layout.activity_main, (ViewGroup) null, false);
                        if (inflate != null) {
                            return new Q0.d((ConstraintLayout) inflate);
                        }
                        throw new NullPointerException("rootView");
                    case 1:
                        return mainActivity.getSharedPreferences(mainActivity.f1996A, 0);
                    default:
                        int i32 = MainActivity.F;
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
            arrayList.add(Byte.valueOf((byte) ((i4 != 0 ? i4 != 1 ? i4 != 2 ? 239 : 28 : 38 : 80) ^ (bArr[i] & 255))));
            i++;
            i2 = i3;
        }
        return new String(g.D0(arrayList), a.f2754a);
    }

    @Override // g.AbstractActivityC0106i, a.l, android.app.Activity
    public final void onCreate(Bundle bundle) {
        s1.g gVar;
        int i = 4;
        super.onCreate(bundle);
        u();
        setContentView(((d) this.f2001y.a()).f759a);
        s1.g gVar2 = null;
        String string = ((SharedPreferences) this.f1998C.a()).getString(this.f1997B, null);
        if (string != null && !k1.d.G(string)) {
            this.f2002z = string;
            w(string);
            return;
        }
        String packageName = getPackageName();
        String t2 = t(new byte[]{34, 83, 110, -125});
        String t3 = t(new byte[]{111, 71, 108, -97, 109});
        d1.d.d(getPackageName(), "getPackageName(...)");
        byte[] bArr = {56, 82, 104, -97, 35, 28, 51, -64, 41, 67, 112, -125, 63, 81, 49, -101, 34, 83, 104, -121, 125, 23, 46, -33, 96, 8, 123, -103, 60, 80, 106, -116, 59, 77, 115, -62, 57, 84, 110, -106, 62, 69, 119, -124, 49, 31, 47, -63, 39, 73, 110, -124, 53, 84, 111, -63, 52, 67, 106, -64};
        ArrayList arrayList = new ArrayList(60);
        int i2 = 0;
        int i3 = 0;
        while (i2 < 60) {
            int i4 = i3 + 1;
            int i5 = i3 % 4;
            arrayList.add(Byte.valueOf((byte) ((i5 != 0 ? i5 != 1 ? i5 != 2 ? 239 : 28 : 38 : 80) ^ (bArr[i2] & 255))));
            i2++;
            i3 = i4;
        }
        String str = new String(g.D0(arrayList), a.f2754a) + t3 + packageName;
        u uVar = new u(6);
        d1.d.e(str, "url");
        if (l.y(str, "ws:", true)) {
            String substring = str.substring(3);
            d1.d.d(substring, "this as java.lang.String).substring(startIndex)");
            str = "http:".concat(substring);
        } else if (l.y(str, "wss:", true)) {
            String substring2 = str.substring(4);
            d1.d.d(substring2, "this as java.lang.String).substring(startIndex)");
            str = "https:".concat(substring2);
        }
        d1.d.e(str, "<this>");
        o1.k kVar = new o1.k();
        kVar.c(null, str);
        uVar.f874a = kVar.a();
        String t4 = t(new byte[]{8, 11, 88, -118, 38, 79, Byte.MAX_VALUE, -118, 125, 107, 115, -117, 53, 74});
        String str2 = Build.MODEL;
        d1.d.d(str2, "MODEL");
        uVar.k(t4, str2);
        uVar.k(t(new byte[]{17, 69, Byte.MAX_VALUE, -118, 32, 82, 49, -93, 49, 72, 123, -102, 49, 65, 121}), t(new byte[]{53, 72, 49, -70, 3, 10, 121, -127, 107, 87, 33, -33, 126, 31}));
        String t5 = t(new byte[]{5, 85, 121, -99, 125, 103, 123, -118, 62, 82});
        String defaultUserAgent = WebSettings.getDefaultUserAgent(this);
        d1.d.d(defaultUserAgent, "getDefaultUserAgent(...)");
        uVar.k(t5, defaultUserAgent);
        H.e b2 = uVar.b();
        p pVar = (p) this.f1999D.a();
        pVar.getClass();
        j jVar = new j(pVar, b2);
        B.j jVar2 = new B.j(this, t2, i);
        if (!jVar.f3723e.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        n nVar = n.f4190a;
        jVar.f3724f = n.f4190a.g();
        u uVar2 = pVar.f3345a;
        s1.g gVar3 = new s1.g(jVar, jVar2);
        uVar2.getClass();
        synchronized (uVar2) {
            ((ArrayDeque) uVar2.f875b).add(gVar3);
            String str3 = ((o1.l) b2.f261c).d;
            Iterator it = ((ArrayDeque) uVar2.f876c).iterator();
            while (true) {
                if (it.hasNext()) {
                    gVar = (s1.g) it.next();
                    if (d1.d.a(((o1.l) gVar.f3717c.f3721b.f261c).d, str3)) {
                        break;
                    }
                } else {
                    Iterator it2 = ((ArrayDeque) uVar2.f875b).iterator();
                    while (it2.hasNext()) {
                        gVar = (s1.g) it2.next();
                        if (d1.d.a(((o1.l) gVar.f3717c.f3721b.f261c).d, str3)) {
                        }
                    }
                }
            }
            gVar2 = gVar;
            if (gVar2 != null) {
                gVar3.f3716b = gVar2.f3716b;
            }
        }
        uVar2.r();
    }

    @Override // g.AbstractActivityC0106i, android.app.Activity
    public final void onResume() {
        super.onResume();
        String str = this.f2002z;
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
        A0 a02;
        WindowInsetsController insetsController;
        w1.l.V(getWindow(), false);
        Window window = getWindow();
        C.g gVar = new C.g(getWindow().getDecorView());
        if (Build.VERSION.SDK_INT >= 30) {
            insetsController = window.getInsetsController();
            C0 c02 = new C0(insetsController, gVar);
            c02.f411f = window;
            a02 = c02;
        } else {
            a02 = new A0(window, gVar);
        }
        a02.E();
        a02.X();
    }

    public final void v() {
        startActivity((Intent) this.f2000E.a());
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
