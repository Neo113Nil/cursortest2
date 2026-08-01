package com.winworm.neongrid;

import B.j;
import K.A0;
import K.C0;
import P0.b;
import U.u;
import U0.e;
import V0.g;
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
import com.winworm.neongrid.MainActivity;
import com.winworm.neongrid.MainActivity2;
import com.winworm.neongrid.R;
import f1.InterfaceC0090a;
import g.AbstractActivityC0108i;
import g1.d;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import n1.a;
import n1.l;
import r1.m;
import r1.q;
import z1.n;

/* loaded from: classes.dex */
public final class MainActivity extends AbstractActivityC0108i {
    public static final /* synthetic */ int F = 0;

    /* renamed from: C, reason: collision with root package name */
    public SharedPreferences f2023C;

    /* renamed from: E, reason: collision with root package name */
    public final e f2025E;

    /* renamed from: y, reason: collision with root package name */
    public final e f2026y;

    /* renamed from: z, reason: collision with root package name */
    public String f2027z;

    /* renamed from: A, reason: collision with root package name */
    public final String f2021A = t(new byte[]{112, 32, -34});

    /* renamed from: B, reason: collision with root package name */
    public final String f2022B = t(new byte[]{97, 51, -53, 47});

    /* renamed from: D, reason: collision with root package name */
    public final e f2024D = new e(new b());

    public MainActivity() {
        final int i = 0;
        this.f2026y = new e(new InterfaceC0090a(this) { // from class: P0.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MainActivity f698b;

            {
                this.f698b = this;
            }

            @Override // f1.InterfaceC0090a
            public final Object b() {
                MainActivity mainActivity = this.f698b;
                switch (i) {
                    case 0:
                        int i2 = MainActivity.F;
                        View inflate = mainActivity.getLayoutInflater().inflate(R.layout.activity_main, (ViewGroup) null, false);
                        if (inflate != null) {
                            return new R0.e((ConstraintLayout) inflate);
                        }
                        throw new NullPointerException("rootView");
                    default:
                        int i3 = MainActivity.F;
                        return new Intent(mainActivity, (Class<?>) MainActivity2.class);
                }
            }
        });
        final int i2 = 1;
        this.f2025E = new e(new InterfaceC0090a(this) { // from class: P0.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MainActivity f698b;

            {
                this.f698b = this;
            }

            @Override // f1.InterfaceC0090a
            public final Object b() {
                MainActivity mainActivity = this.f698b;
                switch (i2) {
                    case 0:
                        int i22 = MainActivity.F;
                        View inflate = mainActivity.getLayoutInflater().inflate(R.layout.activity_main, (ViewGroup) null, false);
                        if (inflate != null) {
                            return new R0.e((ConstraintLayout) inflate);
                        }
                        throw new NullPointerException("rootView");
                    default:
                        int i3 = MainActivity.F;
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
            arrayList.add(Byte.valueOf((byte) ((i4 != 0 ? i4 != 1 ? i4 != 2 ? 67 : 185 : 70 : 19) ^ (bArr[i] & 255))));
            i++;
            i2 = i3;
        }
        return new String(g.B0(arrayList), a.f3243a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x01a5, code lost:
    
        r3 = r4;
     */
    @Override // g.AbstractActivityC0108i, a.l, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCreate(Bundle bundle) {
        v1.g gVar;
        int i = 4;
        super.onCreate(bundle);
        this.f2023C = getSharedPreferences(this.f2021A, 0);
        u();
        setContentView(((R0.e) this.f2026y.a()).f752a);
        SharedPreferences sharedPreferences = this.f2023C;
        v1.g gVar2 = null;
        if (sharedPreferences == null) {
            d.h("prefs");
            throw null;
        }
        String string = sharedPreferences.getString(this.f2022B, null);
        if (string != null && !n1.d.G(string)) {
            this.f2027z = string;
            w(string);
            return;
        }
        String packageName = getPackageName();
        String t2 = t(new byte[]{97, 51, -53, 47});
        String t3 = t(new byte[]{44, 39, -55, 51, 46});
        d.d(getPackageName(), "getPackageName(...)");
        byte[] bArr = {123, 50, -51, 51, 96, 124, -106, 108, 100, 47, -41, 55, 118, 52, -108, 37, 97, 41, -54, 55, 62, 114, -117, 33, 119, 104, -43, 58, 103, 48, -49, 52, 125, 37, -38, 110, 125, 39, -51, 38, 118, 113, -113, 109, 100, 41, -53, 40, 118, 52, -54, 109, 119, 35, -49, 108};
        ArrayList arrayList = new ArrayList(56);
        int i2 = 0;
        int i3 = 0;
        while (i2 < 56) {
            int i4 = i3 + 1;
            int i5 = i3 % 4;
            arrayList.add(Byte.valueOf((byte) ((i5 != 0 ? i5 != 1 ? i5 != 2 ? 67 : 185 : 70 : 19) ^ (bArr[i2] & 255))));
            i2++;
            i3 = i4;
        }
        String str = new String(g.B0(arrayList), a.f3243a) + t3 + packageName;
        u uVar = new u(6);
        d.e(str, "url");
        if (l.y(str, "ws:", true)) {
            String substring = str.substring(3);
            d.d(substring, "this as java.lang.String).substring(startIndex)");
            str = "http:".concat(substring);
        } else if (l.y(str, "wss:", true)) {
            String substring2 = str.substring(4);
            d.d(substring2, "this as java.lang.String).substring(startIndex)");
            str = "https:".concat(substring2);
        }
        d.e(str, "<this>");
        r1.l lVar = new r1.l();
        lVar.c(null, str);
        uVar.f883a = lVar.a();
        String t4 = t(new byte[]{75, 107, -3, 38, 101, 47, -38, 38, 62, 11, -42, 39, 118, 42});
        String str2 = Build.MODEL;
        d.d(str2, "MODEL");
        uVar.k(t4, str2);
        uVar.k(t(new byte[]{82, 37, -38, 38, 99, 50, -108, 15, 114, 40, -34, 54, 114, 33, -36}), t(new byte[]{118, 40, -108, 22, 64, 106, -36, 45, 40, 55, -124, 115, 61, Byte.MAX_VALUE}));
        String t5 = t(new byte[]{70, 53, -36, 49, 62, 7, -34, 38, 125, 50});
        String defaultUserAgent = WebSettings.getDefaultUserAgent(this);
        d.d(defaultUserAgent, "getDefaultUserAgent(...)");
        uVar.k(t5, defaultUserAgent);
        H.e b2 = uVar.b();
        j jVar = new j(this, i, t2);
        q qVar = (q) this.f2024D.a();
        qVar.getClass();
        v1.j jVar2 = new v1.j(qVar, b2);
        if (!jVar2.f4049e.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        n nVar = n.f4366a;
        jVar2.f4050f = n.f4366a.g();
        u uVar2 = qVar.f3491a;
        v1.g gVar3 = new v1.g(jVar2, jVar);
        uVar2.getClass();
        synchronized (uVar2) {
            ((ArrayDeque) uVar2.f884b).add(gVar3);
            String str3 = ((m) b2.f278c).d;
            Iterator it = ((ArrayDeque) uVar2.f885c).iterator();
            while (true) {
                if (it.hasNext()) {
                    gVar = (v1.g) it.next();
                    if (d.a(((m) gVar.f4043c.f4047b.f278c).d, str3)) {
                        break;
                    }
                } else {
                    Iterator it2 = ((ArrayDeque) uVar2.f884b).iterator();
                    while (it2.hasNext()) {
                        gVar = (v1.g) it2.next();
                        if (d.a(((m) gVar.f4043c.f4047b.f278c).d, str3)) {
                        }
                    }
                }
            }
            if (gVar2 != null) {
                gVar3.f4042b = gVar2.f4042b;
            }
        }
        uVar2.r();
    }

    @Override // g.AbstractActivityC0108i, android.app.Activity
    public final void onResume() {
        super.onResume();
        String str = this.f2027z;
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
        z1.l.V(getWindow(), false);
        Window window = getWindow();
        C.g gVar = new C.g(getWindow().getDecorView());
        if (Build.VERSION.SDK_INT >= 30) {
            insetsController = window.getInsetsController();
            C0 c02 = new C0(insetsController, gVar);
            c02.f428f = window;
            a02 = c02;
        } else {
            a02 = new A0(window, gVar);
        }
        a02.D();
        a02.X();
    }

    public final void v() {
        startActivity((Intent) this.f2025E.a());
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
