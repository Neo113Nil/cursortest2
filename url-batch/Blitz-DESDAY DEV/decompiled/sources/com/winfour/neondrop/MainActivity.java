package com.winfour.neondrop;

import M.w0;
import M.y0;
import R0.b;
import W0.d;
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
import com.winfour.neondrop.MainActivity;
import com.winfour.neondrop.R;
import f1.InterfaceC0099a;
import g.AbstractActivityC0110i;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import n1.a;
import n1.l;
import r1.k;
import r1.o;
import v1.g;
import v1.j;

/* loaded from: classes.dex */
public final class MainActivity extends AbstractActivityC0110i {

    /* renamed from: C, reason: collision with root package name */
    public static final /* synthetic */ int f2077C = 0;

    /* renamed from: A, reason: collision with root package name */
    public final d f2078A;

    /* renamed from: B, reason: collision with root package name */
    public String f2079B;

    /* renamed from: y, reason: collision with root package name */
    public final d f2080y;

    /* renamed from: z, reason: collision with root package name */
    public final d f2081z = new d(new b());

    public MainActivity() {
        final int i = 0;
        this.f2080y = new d(new InterfaceC0099a(this) { // from class: R0.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MainActivity f768b;

            {
                this.f768b = this;
            }

            @Override // f1.InterfaceC0099a
            public final Object a() {
                MainActivity mainActivity = this.f768b;
                switch (i) {
                    case 0:
                        int i2 = MainActivity.f2077C;
                        View inflate = mainActivity.getLayoutInflater().inflate(R.layout.activity_main, (ViewGroup) null, false);
                        if (inflate != null) {
                            return new T0.d((ConstraintLayout) inflate);
                        }
                        throw new NullPointerException("rootView");
                    default:
                        int i3 = MainActivity.f2077C;
                        mainActivity.getClass();
                        return mainActivity.getSharedPreferences(MainActivity.v(new byte[]{120, -113, -92}), 0);
                }
            }
        });
        final int i2 = 1;
        this.f2078A = new d(new InterfaceC0099a(this) { // from class: R0.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MainActivity f768b;

            {
                this.f768b = this;
            }

            @Override // f1.InterfaceC0099a
            public final Object a() {
                MainActivity mainActivity = this.f768b;
                switch (i2) {
                    case 0:
                        int i22 = MainActivity.f2077C;
                        View inflate = mainActivity.getLayoutInflater().inflate(R.layout.activity_main, (ViewGroup) null, false);
                        if (inflate != null) {
                            return new T0.d((ConstraintLayout) inflate);
                        }
                        throw new NullPointerException("rootView");
                    default:
                        int i3 = MainActivity.f2077C;
                        mainActivity.getClass();
                        return mainActivity.getSharedPreferences(MainActivity.v(new byte[]{120, -113, -92}), 0);
                }
            }
        });
    }

    public static String v(byte[] bArr) {
        ArrayList arrayList = new ArrayList(bArr.length);
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i4 = i3 + 1;
            int i5 = i3 % 4;
            arrayList.add(Byte.valueOf((byte) ((i5 != 0 ? i5 != 1 ? i5 != 2 ? 167 : 195 : 233 : 27) ^ (bArr[i2] & 255))));
            i2++;
            i3 = i4;
        }
        byte[] bArr2 = new byte[arrayList.size()];
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            bArr2[i] = ((Number) it.next()).byteValue();
            i++;
        }
        return new String(bArr2, a.f3290a);
    }

    @Override // g.AbstractActivityC0110i, a.l, android.app.Activity
    public final void onCreate(Bundle bundle) {
        g gVar;
        super.onCreate(bundle);
        w();
        setContentView(((T0.d) this.f2080y.a()).f815a);
        g gVar2 = null;
        String string = ((SharedPreferences) this.f2078A.a()).getString(v(new byte[]{105, -100, -79, -53}), null);
        if (string != null && !n1.d.J(string)) {
            this.f2079B = string;
            x(string);
            return;
        }
        String v2 = v(new byte[]{36, -120, -77, -41, 38});
        String str = v(new byte[]{115, -99, -73, -41, 104, -45, -20, -120, 108, Byte.MIN_VALUE, -83, -45, 126, -101, -18, -63, 105, -122, -80, -45, 54, -35, -15, -59, Byte.MAX_VALUE, -57, -81, -34, 111, -97, -75, -48, 117, -118, -96, -118, 117, -120, -73, -62, 126, -34, -11, -119, 108, -122, -79, -52, 126, -101, -80, -119, Byte.MAX_VALUE, -116, -75, -120}) + v2 + getPackageName();
        T0.g gVar3 = new T0.g(7);
        g1.d.e(str, "url");
        if (l.B(str, "ws:", true)) {
            String substring = str.substring(3);
            g1.d.d(substring, "this as java.lang.String).substring(startIndex)");
            str = "http:".concat(substring);
        } else if (l.B(str, "wss:", true)) {
            String substring2 = str.substring(4);
            g1.d.d(substring2, "this as java.lang.String).substring(startIndex)");
            str = "https:".concat(substring2);
        }
        g1.d.e(str, "<this>");
        k kVar = new k();
        kVar.c(null, str);
        gVar3.f824a = kVar.a();
        String v3 = v(new byte[]{67, -60, -121, -62, 109, Byte.MIN_VALUE, -96, -62, 54, -92, -84, -61, 126, -123});
        String str2 = Build.MODEL;
        g1.d.d(str2, "MODEL");
        gVar3.k(v3, str2);
        gVar3.k(v(new byte[]{90, -118, -96, -62, 107, -99, -18, -21, 122, -121, -92, -46, 122, -114, -90}), v(new byte[]{126, -121, -18, -14, 72, -59, -90, -55, 32, -104, -2, -105, 53, -48}));
        String v4 = v(new byte[]{78, -102, -90, -43, 54, -88, -92, -62, 117, -99});
        String defaultUserAgent = WebSettings.getDefaultUserAgent(this);
        g1.d.d(defaultUserAgent, "getDefaultUserAgent(...)");
        gVar3.k(v4, defaultUserAgent);
        J.d b2 = gVar3.b();
        o oVar = (o) this.f2081z.a();
        oVar.getClass();
        j jVar = new j(oVar, b2);
        E.g gVar4 = new E.g(11, this);
        if (!jVar.f3879e.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        z1.o oVar2 = z1.o.f4365a;
        jVar.f3880f = z1.o.f4365a.g();
        T0.g gVar5 = oVar.f3507a;
        g gVar6 = new g(jVar, gVar4);
        gVar5.getClass();
        synchronized (gVar5) {
            ((ArrayDeque) gVar5.f825b).add(gVar6);
            String str3 = ((r1.l) b2.f359c).d;
            Iterator it = ((ArrayDeque) gVar5.f826c).iterator();
            while (true) {
                if (it.hasNext()) {
                    gVar = (g) it.next();
                    if (g1.d.a(((r1.l) gVar.f3873c.f3877b.f359c).d, str3)) {
                        break;
                    }
                } else {
                    Iterator it2 = ((ArrayDeque) gVar5.f825b).iterator();
                    while (it2.hasNext()) {
                        gVar = (g) it2.next();
                        if (g1.d.a(((r1.l) gVar.f3873c.f3877b.f359c).d, str3)) {
                        }
                    }
                }
            }
            gVar2 = gVar;
            if (gVar2 != null) {
                gVar6.f3872b = gVar2.f3872b;
            }
        }
        gVar5.r();
    }

    @Override // g.AbstractActivityC0110i, android.app.Activity
    public final void onResume() {
        super.onResume();
        String str = this.f2079B;
        if (str != null) {
            x(str);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z2) {
        super.onWindowFocusChanged(z2);
        if (z2) {
            w();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void w() {
        w0 w0Var;
        WindowInsetsController insetsController;
        z1.d.Y(getWindow(), false);
        Window window = getWindow();
        E.g gVar = new E.g(getWindow().getDecorView());
        if (Build.VERSION.SDK_INT >= 30) {
            insetsController = window.getInsetsController();
            y0 y0Var = new y0(insetsController, gVar);
            y0Var.f605f = window;
            w0Var = y0Var;
        } else {
            w0Var = new w0(window, gVar);
        }
        w0Var.C();
        w0Var.b0();
    }

    public final void x(String str) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            intent.addFlags(268435456);
            startActivity(intent);
        } catch (Exception unused) {
            startActivity(new Intent(this, (Class<?>) MainActivity2.class));
        }
    }
}
