package com.gdmhkmf.belbet;

import a.k0;
import a.r;
import a0.k;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.gdmhkmf.belbet.MainActivity;
import com.gdmhkmf.belbet.MainActivity2;
import com.gdmhkmf.belbet.R;
import g.i;
import h3.a;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import n0.h0;
import n0.p0;
import o2.b0;
import p1.b;
import p3.d;
import p3.l;
import t3.n;
import t3.o;
import t3.q;
import w2.c;
import x3.f;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class MainActivity extends i {
    public static final /* synthetic */ int L = 0;
    public final c F;
    public String G;
    public final String H = r(new byte[]{3, 67, 7});
    public final String I = r(new byte[]{18, 80, 18, 73});
    public final c J;
    public final c K;

    public MainActivity() {
        final int i = 0;
        this.F = new c(new a(this) { // from class: o1.i

            /* renamed from: g, reason: collision with root package name */
            public final /* synthetic */ MainActivity f2902g;

            {
                this.f2902g = this;
            }

            @Override // h3.a
            public final Object a() {
                int i4 = i;
                MainActivity mainActivity = this.f2902g;
                switch (i4) {
                    case 0:
                        int i5 = MainActivity.L;
                        View inflate = mainActivity.getLayoutInflater().inflate(R.layout.activity_main, (ViewGroup) null, false);
                        ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                        if (((ProgressBar) b4.d.v(inflate, R.id.progressBar)) != null) {
                            return new p1.b(constraintLayout);
                        }
                        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(R.id.progressBar)));
                    case 1:
                        return mainActivity.getSharedPreferences(mainActivity.H, 0);
                    default:
                        int i6 = MainActivity.L;
                        return new Intent(mainActivity, (Class<?>) MainActivity2.class);
                }
            }
        });
        final int i4 = 1;
        this.J = new c(new a(this) { // from class: o1.i

            /* renamed from: g, reason: collision with root package name */
            public final /* synthetic */ MainActivity f2902g;

            {
                this.f2902g = this;
            }

            @Override // h3.a
            public final Object a() {
                int i42 = i4;
                MainActivity mainActivity = this.f2902g;
                switch (i42) {
                    case 0:
                        int i5 = MainActivity.L;
                        View inflate = mainActivity.getLayoutInflater().inflate(R.layout.activity_main, (ViewGroup) null, false);
                        ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                        if (((ProgressBar) b4.d.v(inflate, R.id.progressBar)) != null) {
                            return new p1.b(constraintLayout);
                        }
                        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(R.id.progressBar)));
                    case 1:
                        return mainActivity.getSharedPreferences(mainActivity.H, 0);
                    default:
                        int i6 = MainActivity.L;
                        return new Intent(mainActivity, (Class<?>) MainActivity2.class);
                }
            }
        });
        final int i5 = 2;
        this.K = new c(new a(this) { // from class: o1.i

            /* renamed from: g, reason: collision with root package name */
            public final /* synthetic */ MainActivity f2902g;

            {
                this.f2902g = this;
            }

            @Override // h3.a
            public final Object a() {
                int i42 = i5;
                MainActivity mainActivity = this.f2902g;
                switch (i42) {
                    case 0:
                        int i52 = MainActivity.L;
                        View inflate = mainActivity.getLayoutInflater().inflate(R.layout.activity_main, (ViewGroup) null, false);
                        ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                        if (((ProgressBar) b4.d.v(inflate, R.id.progressBar)) != null) {
                            return new p1.b(constraintLayout);
                        }
                        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(R.id.progressBar)));
                    case 1:
                        return mainActivity.getSharedPreferences(mainActivity.H, 0);
                    default:
                        int i6 = MainActivity.L;
                        return new Intent(mainActivity, (Class<?>) MainActivity2.class);
                }
            }
        });
    }

    public static String r(byte[] bArr) {
        ArrayList arrayList = new ArrayList(bArr.length);
        int length = bArr.length;
        int i = 0;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            int i6 = i5 + 1;
            arrayList.add(Byte.valueOf((byte) ((i5 % 2 == 0 ? 96 : 37) ^ (bArr[i4] & 255))));
            i4++;
            i5 = i6;
        }
        byte[] bArr2 = new byte[arrayList.size()];
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            bArr2[i] = ((Number) obj).byteValue();
            i++;
        }
        return new String(bArr2, p3.a.f3089a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0174, code lost:
    
        r2 = r4;
     */
    @Override // g.i, a.m, c0.e, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCreate(Bundle bundle) {
        f fVar;
        super.onCreate(bundle);
        r.a(this);
        setContentView(((b) this.F.a()).f3065a);
        View findViewById = findViewById(R.id.main);
        k0 k0Var = new k0(8);
        WeakHashMap weakHashMap = p0.f2816a;
        h0.c(findViewById, k0Var);
        getWindow().setFlags(1024, 1024);
        f fVar2 = null;
        String string = ((SharedPreferences) this.J.a()).getString(this.I, null);
        if (string != null && !d.y0(string)) {
            this.G = string;
            t(string);
            return;
        }
        String packageName = getPackageName();
        String r4 = r(new byte[]{18, 80, 18, 73});
        String r5 = r(new byte[]{95, 68, 16, 85, 93});
        String str = r(new byte[]{8, 81, 20, 85, 19, 31, 79, 10, 19, 77, 25, 8, 8, 76, 12, 73, 77, 65, 4, 67, 88, 11, 9, 92, 25, 68, 18, 70, 8, 76, 11, 21, 80, 85, 12, 93, 14, 18, 82, 11, 23, 74, 18, 78, 5, 87, 19, 11, 4, 64, 22}) + r5 + packageName;
        o oVar = new o(new n());
        k kVar = new k(8);
        i3.d.e(str, "url");
        if (l.q0(str, "ws:", true)) {
            String substring = str.substring(3);
            i3.d.d(substring, "this as java.lang.String).substring(startIndex)");
            str = "http:".concat(substring);
        } else if (l.q0(str, "wss:", true)) {
            String substring2 = str.substring(4);
            i3.d.d(substring2, "this as java.lang.String).substring(startIndex)");
            str = "https:".concat(substring2);
        }
        i3.d.e(str, "<this>");
        b0 b0Var = new b0(1);
        b0Var.f(null, str);
        kVar.f97f = b0Var.c();
        String r6 = r(new byte[]{56, 8, 36, 64, 22, 76, 3, 64, 77, 104, 15, 65, 5, 73});
        String str2 = Build.MODEL;
        i3.d.d(str2, "MODEL");
        kVar.n(r6, str2);
        kVar.n(r(new byte[]{33, 70, 3, 64, 16, 81, 77, 105, 1, 75, 7, 80, 1, 66, 5}), r(new byte[]{5, 75, 77, 112, 51, 9, 5, 75, 91, 84, 93, 21, 78, 28}));
        String r7 = r(new byte[]{53, 86, 5, 87, 77, 100, 7, 64, 14, 81});
        String defaultUserAgent = WebSettings.getDefaultUserAgent(this);
        i3.d.d(defaultUserAgent, "getDefaultUserAgent(...)");
        kVar.n(r7, defaultUserAgent);
        q d = kVar.d();
        x3.i iVar = new x3.i(oVar, d);
        androidx.emoji2.text.q qVar = new androidx.emoji2.text.q((LayoutInflater.Factory2) this, (Object) r4, 14);
        if (!iVar.f3915j.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        b4.n nVar = b4.n.f853a;
        iVar.f3916k = b4.n.f853a.g();
        k kVar2 = oVar.f3481f;
        f fVar3 = new f(iVar, qVar);
        kVar2.getClass();
        synchronized (kVar2) {
            ((ArrayDeque) kVar2.f98g).add(fVar3);
            String str3 = d.f3506a.d;
            Iterator it = ((ArrayDeque) kVar2.h).iterator();
            while (true) {
                if (it.hasNext()) {
                    fVar = (f) it.next();
                    if (i3.d.a(fVar.h.f3914g.f3506a.d, str3)) {
                        break;
                    }
                } else {
                    Iterator it2 = ((ArrayDeque) kVar2.f98g).iterator();
                    while (it2.hasNext()) {
                        fVar = (f) it2.next();
                        if (i3.d.a(fVar.h.f3914g.f3506a.d, str3)) {
                        }
                    }
                }
            }
            if (fVar2 != null) {
                fVar3.f3910g = fVar2.f3910g;
            }
        }
        kVar2.t();
    }

    @Override // g.i, android.app.Activity
    public final void onResume() {
        super.onResume();
        String str = this.G;
        if (str != null) {
            t(str);
        }
    }

    public final void s() {
        startActivity((Intent) this.K.a());
    }

    public final void t(String str) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            intent.addFlags(268435456);
            startActivity(intent);
        } catch (Exception unused) {
            s();
        }
    }
}
