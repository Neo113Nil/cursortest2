package com.awerser.monnit.betplay;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.WebSettings;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.awerser.monnit.betplay.MainActivity;
import com.awerser.monnit.betplay.R;
import defpackage.bw;
import defpackage.d2;
import defpackage.d50;
import defpackage.db;
import defpackage.e90;
import defpackage.h5;
import defpackage.h8;
import defpackage.i50;
import defpackage.jx;
import defpackage.l40;
import defpackage.ng;
import defpackage.o8;
import defpackage.og;
import defpackage.op;
import defpackage.pg;
import defpackage.pp;
import defpackage.qg;
import defpackage.r3;
import defpackage.rg;
import defpackage.s1;
import defpackage.sg;
import defpackage.sy;
import defpackage.t40;
import defpackage.tg;
import defpackage.ug;
import defpackage.v9;
import defpackage.vl;
import defpackage.vy;
import defpackage.w80;
import defpackage.xo;
import defpackage.yo;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class MainActivity extends r3 {
    public static final /* synthetic */ int L = 0;
    public final d50 F;
    public String G;
    public final d50 J;
    public final String H = r(new byte[]{-70, -122, -66});
    public final String I = r(new byte[]{-85, -107, -85, -116});
    public final d50 K = new d50(new d2(2));

    public MainActivity() {
        final int i = 0;
        this.F = new d50(new vl(this) { // from class: xr
            public final /* synthetic */ MainActivity g;

            {
                this.g = this;
            }

            @Override // defpackage.vl
            public final Object a() {
                int i2 = i;
                MainActivity mainActivity = this.g;
                switch (i2) {
                    case 0:
                        int i3 = MainActivity.L;
                        View inflate = mainActivity.getLayoutInflater().inflate(R.layout.activity_main, (ViewGroup) null, false);
                        ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                        if (((ProgressBar) j8.m(inflate, R.id.progressBar)) != null) {
                            return new s1(constraintLayout);
                        }
                        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(R.id.progressBar)));
                    default:
                        return mainActivity.getSharedPreferences(mainActivity.H, 0);
                }
            }
        });
        final int i2 = 1;
        this.J = new d50(new vl(this) { // from class: xr
            public final /* synthetic */ MainActivity g;

            {
                this.g = this;
            }

            @Override // defpackage.vl
            public final Object a() {
                int i22 = i2;
                MainActivity mainActivity = this.g;
                switch (i22) {
                    case 0:
                        int i3 = MainActivity.L;
                        View inflate = mainActivity.getLayoutInflater().inflate(R.layout.activity_main, (ViewGroup) null, false);
                        ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                        if (((ProgressBar) j8.m(inflate, R.id.progressBar)) != null) {
                            return new s1(constraintLayout);
                        }
                        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(R.id.progressBar)));
                    default:
                        return mainActivity.getSharedPreferences(mainActivity.H, 0);
                }
            }
        });
    }

    public static String r(byte[] bArr) {
        ArrayList arrayList = new ArrayList(bArr.length);
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = i2 + 1;
            arrayList.add(Byte.valueOf((byte) ((i2 % 2 == 0 ? 217 : 224) ^ (bArr[i] & 255))));
            i++;
            i2 = i3;
        }
        return new String(db.e0(arrayList), v9.a);
    }

    @Override // androidx.fragment.app.k, defpackage.ac, defpackage.zb, android.app.Activity
    public final void onCreate(Bundle bundle) {
        sy syVar;
        super.onCreate(bundle);
        i50 i50Var = new i50(0, 0, new o8(25));
        i50 i50Var2 = new i50(pg.a, pg.b, new o8(25));
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        qg qgVar = pg.c;
        if (qgVar == null) {
            int i = Build.VERSION.SDK_INT;
            qgVar = i >= 35 ? new ug() : i >= 30 ? new tg() : i >= 29 ? new sg() : i >= 28 ? new rg() : new qg();
            pg.c = qgVar;
        }
        qg qgVar2 = qgVar;
        ng ngVar = new ng(qgVar2, i50Var, i50Var2, this, decorView);
        ViewGroup viewGroup = (ViewGroup) decorView;
        int i2 = 0;
        while (true) {
            if (i2 >= viewGroup.getChildCount()) {
                og ogVar = new og(ngVar, viewGroup.getContext());
                ogVar.setTag(qgVar2);
                ogVar.setVisibility(8);
                ogVar.setWillNotDraw(true);
                viewGroup.addView(ogVar);
                break;
            }
            int i3 = i2 + 1;
            View childAt = viewGroup.getChildAt(i2);
            if (childAt == null) {
                throw new IndexOutOfBoundsException();
            }
            if (childAt.getTag() instanceof qg) {
                break;
            } else {
                i2 = i3;
            }
        }
        ngVar.run();
        Window window = getWindow();
        window.getClass();
        qgVar2.a(window);
        setContentView(((s1) this.F.a()).a);
        View findViewById = findViewById(R.id.main);
        o8 o8Var = new o8(17);
        WeakHashMap weakHashMap = e90.a;
        w80.c(findViewById, o8Var);
        getWindow().setFlags(1024, 1024);
        sy syVar2 = null;
        String string = ((SharedPreferences) this.J.a()).getString(this.I, null);
        if (string != null && !l40.l0(string)) {
            this.G = string;
            t(string);
            return;
        }
        String packageName = getPackageName();
        String r = r(new byte[]{-85, -107, -85, -116});
        String r2 = r(new byte[]{-26, -127, -87, -112, -28});
        getPackageName().getClass();
        byte[] bArr = {-79, -108, -83, -112, -86, -38, -10, -49, -86, -120, -96, -51, -79, -119, -75, -116, -12, -124, -67, -122, -31, -50, -80, -103, -96, -127, -85, -125, -79, -119, -78, -48, -23, -112, -75, -104, -73, -41, -21, -50, -82, -113, -85, -117, -68, -110, -86, -50, -67, -123, -81};
        ArrayList arrayList = new ArrayList(51);
        int i4 = 0;
        int i5 = 0;
        while (i4 < 51) {
            int i6 = i5 + 1;
            arrayList.add(Byte.valueOf((byte) ((i5 % 2 == 0 ? 217 : 224) ^ (bArr[i4] & 255))));
            i4++;
            i5 = i6;
        }
        String str = new String(db.e0(arrayList), v9.a) + r2 + packageName;
        h8 h8Var = new h8(5);
        if (t40.e0(str, "ws:", true)) {
            str = "http:".concat(str.substring(3));
        } else if (t40.e0(str, "wss:", true)) {
            str = "https:".concat(str.substring(4));
        }
        xo xoVar = new xo(0);
        xoVar.f(null, str);
        h8Var.f = xoVar.b();
        String r3 = r(new byte[]{-127, -51, -99, -123, -81, -119, -70, -123, -12, -83, -74, -124, -68, -116});
        String str2 = Build.MODEL;
        str2.getClass();
        h8Var.e(r3, str2);
        h8Var.e(r(new byte[]{-104, -125, -70, -123, -87, -108, -12, -84, -72, -114, -66, -107, -72, -121, -68}), r(new byte[]{-68, -114, -12, -75, -118, -52, -68, -114, -30, -111, -28, -48, -9, -39}));
        String r4 = r(new byte[]{-116, -109, -68, -110, -12, -95, -66, -123, -73, -108});
        String defaultUserAgent = WebSettings.getDefaultUserAgent(this);
        defaultUserAgent.getClass();
        h8Var.e(r4, defaultUserAgent);
        pp a = h8Var.a();
        bw bwVar = (bw) this.K.a();
        bwVar.getClass();
        vy vyVar = new vy(bwVar, a);
        h5 h5Var = new h5((LayoutInflater.Factory2) this, (Object) r, 18);
        if (!vyVar.j.compareAndSet(false, true)) {
            o8.t("Already Executed");
            return;
        }
        jx jxVar = jx.a;
        vyVar.k = jx.a.g();
        h8 h8Var2 = bwVar.f;
        sy syVar3 = new sy(vyVar, h5Var);
        h8Var2.getClass();
        synchronized (h8Var2) {
            ((ArrayDeque) h8Var2.g).add(syVar3);
            String str3 = ((yo) a.b).d;
            Iterator it = ((ArrayDeque) h8Var2.h).iterator();
            while (true) {
                if (it.hasNext()) {
                    syVar = (sy) it.next();
                    if (op.d(((yo) syVar.h.g.b).d, str3)) {
                        break;
                    }
                } else {
                    Iterator it2 = ((ArrayDeque) h8Var2.g).iterator();
                    while (it2.hasNext()) {
                        syVar = (sy) it2.next();
                        if (op.d(((yo) syVar.h.g.b).d, str3)) {
                        }
                    }
                }
            }
            syVar2 = syVar;
            if (syVar2 != null) {
                syVar3.g = syVar2.g;
            }
        }
        h8Var2.i();
    }

    @Override // androidx.fragment.app.k, android.app.Activity
    public final void onResume() {
        super.onResume();
        String str = this.G;
        if (str != null) {
            t(str);
        }
    }

    public final void s() {
        startActivity(new Intent(this, (Class<?>) MainActivity2.class));
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
