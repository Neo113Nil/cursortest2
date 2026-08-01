package com.derinko.gbini.n1casino;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.WebSettings;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.derinko.gbini.n1casino.MainActivity;
import com.derinko.gbini.n1casino.MainActivity2;
import com.derinko.gbini.n1casino.R;
import defpackage.ah;
import defpackage.b50;
import defpackage.bb;
import defpackage.bh;
import defpackage.c3;
import defpackage.c40;
import defpackage.ch;
import defpackage.dy;
import defpackage.gy;
import defpackage.io;
import defpackage.k40;
import defpackage.ml;
import defpackage.o1;
import defpackage.p80;
import defpackage.q4;
import defpackage.t8;
import defpackage.tv;
import defpackage.uv;
import defpackage.vg;
import defpackage.we;
import defpackage.wg;
import defpackage.ww;
import defpackage.x40;
import defpackage.x80;
import defpackage.xg;
import defpackage.xz;
import defpackage.yg;
import defpackage.z9;
import defpackage.zg;
import defpackage.zo;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class MainActivity extends c3 {
    public static final /* synthetic */ int L = 0;
    public final x40 F;
    public String G;
    public final String H = q(new byte[]{-40, -110, -36});
    public final String I = q(new byte[]{-55, -127, -55, -104});
    public final x40 J;
    public final x40 K;

    public MainActivity() {
        final int i = 0;
        this.F = new x40(new ml(this) { // from class: jr
            public final /* synthetic */ MainActivity g;

            {
                this.g = this;
            }

            @Override // defpackage.ml
            public final Object a() {
                int i2 = i;
                MainActivity mainActivity = this.g;
                switch (i2) {
                    case 0:
                        int i3 = MainActivity.L;
                        View inflate = mainActivity.getLayoutInflater().inflate(R.layout.activity_main, (ViewGroup) null, false);
                        ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                        if (((ProgressBar) jw.r(inflate, R.id.progressBar)) != null) {
                            return new o1(constraintLayout);
                        }
                        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(R.id.progressBar)));
                    case 1:
                        return mainActivity.getSharedPreferences(mainActivity.H, 0);
                    default:
                        int i4 = MainActivity.L;
                        return new Intent(mainActivity, (Class<?>) MainActivity2.class);
                }
            }
        });
        final int i2 = 1;
        this.J = new x40(new ml(this) { // from class: jr
            public final /* synthetic */ MainActivity g;

            {
                this.g = this;
            }

            @Override // defpackage.ml
            public final Object a() {
                int i22 = i2;
                MainActivity mainActivity = this.g;
                switch (i22) {
                    case 0:
                        int i3 = MainActivity.L;
                        View inflate = mainActivity.getLayoutInflater().inflate(R.layout.activity_main, (ViewGroup) null, false);
                        ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                        if (((ProgressBar) jw.r(inflate, R.id.progressBar)) != null) {
                            return new o1(constraintLayout);
                        }
                        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(R.id.progressBar)));
                    case 1:
                        return mainActivity.getSharedPreferences(mainActivity.H, 0);
                    default:
                        int i4 = MainActivity.L;
                        return new Intent(mainActivity, (Class<?>) MainActivity2.class);
                }
            }
        });
        final int i3 = 2;
        this.K = new x40(new ml(this) { // from class: jr
            public final /* synthetic */ MainActivity g;

            {
                this.g = this;
            }

            @Override // defpackage.ml
            public final Object a() {
                int i22 = i3;
                MainActivity mainActivity = this.g;
                switch (i22) {
                    case 0:
                        int i32 = MainActivity.L;
                        View inflate = mainActivity.getLayoutInflater().inflate(R.layout.activity_main, (ViewGroup) null, false);
                        ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                        if (((ProgressBar) jw.r(inflate, R.id.progressBar)) != null) {
                            return new o1(constraintLayout);
                        }
                        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(R.id.progressBar)));
                    case 1:
                        return mainActivity.getSharedPreferences(mainActivity.H, 0);
                    default:
                        int i4 = MainActivity.L;
                        return new Intent(mainActivity, (Class<?>) MainActivity2.class);
                }
            }
        });
    }

    public static String q(byte[] bArr) {
        ArrayList arrayList = new ArrayList(bArr.length);
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = i2 + 1;
            arrayList.add(Byte.valueOf((byte) ((i2 % 2 == 0 ? 187 : 244) ^ (bArr[i] & 255))));
            i++;
            i2 = i3;
        }
        return new String(bb.J0(arrayList), z9.a);
    }

    @Override // defpackage.c3, defpackage.wb, defpackage.vb, android.app.Activity
    public final void onCreate(Bundle bundle) {
        dy dyVar;
        super.onCreate(bundle);
        b50 b50Var = new b50(0, 0, new t8(25));
        b50 b50Var2 = new b50(xg.a, xg.b, new t8(25));
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        yg ygVar = xg.c;
        if (ygVar == null) {
            int i = Build.VERSION.SDK_INT;
            ygVar = i >= 35 ? new ch() : i >= 30 ? new bh() : i >= 29 ? new ah() : i >= 28 ? new zg() : new yg();
            xg.c = ygVar;
        }
        yg ygVar2 = ygVar;
        vg vgVar = new vg(ygVar2, b50Var, b50Var2, this, decorView);
        ViewGroup viewGroup = (ViewGroup) decorView;
        int i2 = 0;
        while (true) {
            if (i2 >= viewGroup.getChildCount()) {
                wg wgVar = new wg(vgVar, viewGroup.getContext());
                wgVar.setTag(ygVar2);
                wgVar.setVisibility(8);
                wgVar.setWillNotDraw(true);
                viewGroup.addView(wgVar);
                break;
            }
            int i3 = i2 + 1;
            View childAt = viewGroup.getChildAt(i2);
            if (childAt == null) {
                throw new IndexOutOfBoundsException();
            }
            if (childAt.getTag() instanceof yg) {
                break;
            } else {
                i2 = i3;
            }
        }
        vgVar.run();
        Window window = getWindow();
        window.getClass();
        ygVar2.a(window);
        setContentView(((o1) this.F.a()).a);
        View findViewById = findViewById(R.id.main);
        t8 t8Var = new t8(17);
        WeakHashMap weakHashMap = x80.a;
        p80.c(findViewById, t8Var);
        getWindow().setFlags(1024, 1024);
        dy dyVar2 = null;
        String string = ((SharedPreferences) this.J.a()).getString(this.I, null);
        if (string != null && !c40.t0(string)) {
            this.G = string;
            s(string);
            return;
        }
        String packageName = getPackageName();
        String q = q(new byte[]{-55, -127, -55, -104});
        String q2 = q(new byte[]{-124, -107, -53, -124, -122});
        getPackageName().getClass();
        byte[] bArr = {-45, Byte.MIN_VALUE, -49, -124, -56, -50, -108, -37, -56, -100, -62, -39, -45, -99, -41, -104, -106, -112, -33, -110, -125, -38, -46, -115, -62, -107, -55, -105, -45, -99, -48, -60, -117, -124, -41, -116, -43, -61, -119, -38, -52, -101, -55, -97, -34, -122, -56, -38, -33, -111, -51};
        ArrayList arrayList = new ArrayList(51);
        int i4 = 0;
        int i5 = 0;
        while (i4 < 51) {
            int i6 = i5 + 1;
            arrayList.add(Byte.valueOf((byte) ((i5 % 2 == 0 ? 187 : 244) ^ (bArr[i4] & 255))));
            i4++;
            i5 = i6;
        }
        String str = new String(bb.J0(arrayList), z9.a) + q2 + packageName;
        uv uvVar = new uv(new tv());
        we weVar = new we(6);
        if (k40.m0(str, "ws:", true)) {
            str = "http:".concat(str.substring(3));
        } else if (k40.m0(str, "wss:", true)) {
            str = "https:".concat(str.substring(4));
        }
        io ioVar = new io(0);
        ioVar.f(null, str);
        weVar.f = ioVar.b();
        String q3 = q(new byte[]{-29, -39, -1, -111, -51, -99, -40, -111, -106, -71, -44, -112, -34, -104});
        String str2 = Build.MODEL;
        str2.getClass();
        weVar.p(q3, str2);
        weVar.p(q(new byte[]{-6, -105, -40, -111, -53, Byte.MIN_VALUE, -106, -72, -38, -102, -36, -127, -38, -109, -34}), q(new byte[]{-34, -102, -106, -95, -24, -40, -34, -102, Byte.MIN_VALUE, -123, -122, -60, -107, -51}));
        String q4 = q(new byte[]{-18, -121, -34, -122, -106, -75, -36, -111, -43, Byte.MIN_VALUE});
        String defaultUserAgent = WebSettings.getDefaultUserAgent(this);
        defaultUserAgent.getClass();
        weVar.p(q4, defaultUserAgent);
        xz d = weVar.d();
        q4 q4Var = new q4(this, q, 22);
        gy gyVar = new gy(uvVar, d);
        if (!gyVar.j.compareAndSet(false, true)) {
            t8.t("Already Executed");
            return;
        }
        ww wwVar = ww.a;
        gyVar.k = ww.a.g();
        we weVar2 = uvVar.f;
        dy dyVar3 = new dy(gyVar, q4Var);
        weVar2.getClass();
        synchronized (weVar2) {
            ((ArrayDeque) weVar2.g).add(dyVar3);
            String str3 = d.a.d;
            Iterator it = ((ArrayDeque) weVar2.h).iterator();
            while (true) {
                if (it.hasNext()) {
                    dyVar = (dy) it.next();
                    if (zo.b(dyVar.h.g.a.d, str3)) {
                        break;
                    }
                } else {
                    Iterator it2 = ((ArrayDeque) weVar2.g).iterator();
                    while (it2.hasNext()) {
                        dyVar = (dy) it2.next();
                        if (zo.b(dyVar.h.g.a.d, str3)) {
                        }
                    }
                }
            }
            dyVar2 = dyVar;
            if (dyVar2 != null) {
                dyVar3.g = dyVar2.g;
            }
        }
        weVar2.x();
    }

    @Override // defpackage.c3, android.app.Activity
    public final void onResume() {
        super.onResume();
        String str = this.G;
        if (str != null) {
            s(str);
        }
    }

    public final void r() {
        startActivity((Intent) this.K.a());
    }

    public final void s(String str) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            intent.addFlags(268435456);
            startActivity(intent);
        } catch (Exception unused) {
            r();
        }
    }
}
