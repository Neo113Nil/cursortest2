package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.os.Looper;
import android.view.accessibility.CaptioningManager;
import com.yandex.mobile.ads.impl.InterfaceC2259tl;
import com.yandex.mobile.ads.impl.sj0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;

/* loaded from: classes3.dex */
public class t52 implements InterfaceC2259tl {

    /* renamed from: B, reason: collision with root package name */
    public static final t52 f32171B = new t52(new a());

    /* renamed from: A, reason: collision with root package name */
    public final uj0<Integer> f32172A;

    /* renamed from: b, reason: collision with root package name */
    public final int f32173b;

    /* renamed from: c, reason: collision with root package name */
    public final int f32174c;

    /* renamed from: d, reason: collision with root package name */
    public final int f32175d;

    /* renamed from: e, reason: collision with root package name */
    public final int f32176e;

    /* renamed from: f, reason: collision with root package name */
    public final int f32177f;

    /* renamed from: g, reason: collision with root package name */
    public final int f32178g;

    /* renamed from: h, reason: collision with root package name */
    public final int f32179h;

    /* renamed from: i, reason: collision with root package name */
    public final int f32180i;

    /* renamed from: j, reason: collision with root package name */
    public final int f32181j;

    /* renamed from: k, reason: collision with root package name */
    public final int f32182k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f32183l;

    /* renamed from: m, reason: collision with root package name */
    public final sj0<String> f32184m;

    /* renamed from: n, reason: collision with root package name */
    public final int f32185n;

    /* renamed from: o, reason: collision with root package name */
    public final sj0<String> f32186o;

    /* renamed from: p, reason: collision with root package name */
    public final int f32187p;

    /* renamed from: q, reason: collision with root package name */
    public final int f32188q;

    /* renamed from: r, reason: collision with root package name */
    public final int f32189r;

    /* renamed from: s, reason: collision with root package name */
    public final sj0<String> f32190s;

    /* renamed from: t, reason: collision with root package name */
    public final sj0<String> f32191t;

    /* renamed from: u, reason: collision with root package name */
    public final int f32192u;

    /* renamed from: v, reason: collision with root package name */
    public final int f32193v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f32194w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f32195x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f32196y;

    /* renamed from: z, reason: collision with root package name */
    public final tj0<n52, s52> f32197z;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private int f32198a;

        /* renamed from: b, reason: collision with root package name */
        private int f32199b;

        /* renamed from: c, reason: collision with root package name */
        private int f32200c;

        /* renamed from: d, reason: collision with root package name */
        private int f32201d;

        /* renamed from: e, reason: collision with root package name */
        private int f32202e;

        /* renamed from: f, reason: collision with root package name */
        private int f32203f;

        /* renamed from: g, reason: collision with root package name */
        private int f32204g;

        /* renamed from: h, reason: collision with root package name */
        private int f32205h;

        /* renamed from: i, reason: collision with root package name */
        private int f32206i;

        /* renamed from: j, reason: collision with root package name */
        private int f32207j;

        /* renamed from: k, reason: collision with root package name */
        private boolean f32208k;

        /* renamed from: l, reason: collision with root package name */
        private sj0<String> f32209l;

        /* renamed from: m, reason: collision with root package name */
        private int f32210m;

        /* renamed from: n, reason: collision with root package name */
        private sj0<String> f32211n;

        /* renamed from: o, reason: collision with root package name */
        private int f32212o;

        /* renamed from: p, reason: collision with root package name */
        private int f32213p;

        /* renamed from: q, reason: collision with root package name */
        private int f32214q;

        /* renamed from: r, reason: collision with root package name */
        private sj0<String> f32215r;

        /* renamed from: s, reason: collision with root package name */
        private sj0<String> f32216s;

        /* renamed from: t, reason: collision with root package name */
        private int f32217t;

        /* renamed from: u, reason: collision with root package name */
        private int f32218u;

        /* renamed from: v, reason: collision with root package name */
        private boolean f32219v;

        /* renamed from: w, reason: collision with root package name */
        private boolean f32220w;

        /* renamed from: x, reason: collision with root package name */
        private boolean f32221x;

        /* renamed from: y, reason: collision with root package name */
        private HashMap<n52, s52> f32222y;

        /* renamed from: z, reason: collision with root package name */
        private HashSet<Integer> f32223z;

        @Deprecated
        public a() {
            this.f32198a = Integer.MAX_VALUE;
            this.f32199b = Integer.MAX_VALUE;
            this.f32200c = Integer.MAX_VALUE;
            this.f32201d = Integer.MAX_VALUE;
            this.f32206i = Integer.MAX_VALUE;
            this.f32207j = Integer.MAX_VALUE;
            this.f32208k = true;
            this.f32209l = sj0.h();
            this.f32210m = 0;
            this.f32211n = sj0.h();
            this.f32212o = 0;
            this.f32213p = Integer.MAX_VALUE;
            this.f32214q = Integer.MAX_VALUE;
            this.f32215r = sj0.h();
            this.f32216s = sj0.h();
            this.f32217t = 0;
            this.f32218u = 0;
            this.f32219v = false;
            this.f32220w = false;
            this.f32221x = false;
            this.f32222y = new HashMap<>();
            this.f32223z = new HashSet<>();
        }

        private static sj0<String> a(String[] strArr) {
            int i4 = sj0.f31764d;
            sj0.a aVar = new sj0.a();
            for (String str : strArr) {
                str.getClass();
                aVar.b(u82.e(str));
            }
            return aVar.a();
        }

        public void b(Context context) {
            Point c4 = u82.c(context);
            a(c4.x, c4.y);
        }

        public a a(int i4, int i5) {
            this.f32206i = i4;
            this.f32207j = i5;
            this.f32208k = true;
            return this;
        }

        public void a(Context context) {
            CaptioningManager captioningManager;
            int i4 = u82.f32873a;
            if (i4 >= 19) {
                if ((i4 >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled()) {
                    this.f32217t = 1088;
                    Locale locale = captioningManager.getLocale();
                    if (locale != null) {
                        this.f32216s = sj0.a(u82.a(locale));
                    }
                }
            }
        }

        public a(Context context) {
            this();
            a(context);
            b(context);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v35, types: [java.io.Serializable, java.lang.String[]] */
        /* JADX WARN: Type inference failed for: r0v44, types: [java.io.Serializable, java.lang.String[]] */
        /* JADX WARN: Type inference failed for: r0v59, types: [java.io.Serializable, java.lang.String[]] */
        /* JADX WARN: Type inference failed for: r0v65, types: [java.io.Serializable, java.lang.String[]] */
        /* JADX WARN: Type inference failed for: r0v91, types: [int[], java.io.Serializable] */
        /* JADX WARN: Type inference failed for: r3v0, types: [java.io.Serializable, java.lang.String[]] */
        /* JADX WARN: Type inference failed for: r3v2, types: [java.io.Serializable, java.lang.String[]] */
        /* JADX WARN: Type inference failed for: r3v6, types: [java.io.Serializable, java.lang.String[]] */
        /* JADX WARN: Type inference failed for: r3v7, types: [java.io.Serializable, java.lang.String[]] */
        /* JADX WARN: Type inference failed for: r7v1, types: [int[], java.io.Serializable] */
        protected a(Bundle bundle) {
            sj0 a4;
            String a5 = t52.a(6);
            t52 t52Var = t52.f32171B;
            this.f32198a = bundle.getInt(a5, t52Var.f32173b);
            this.f32199b = bundle.getInt(t52.a(7), t52Var.f32174c);
            this.f32200c = bundle.getInt(t52.a(8), t52Var.f32175d);
            this.f32201d = bundle.getInt(t52.a(9), t52Var.f32176e);
            this.f32202e = bundle.getInt(t52.a(10), t52Var.f32177f);
            this.f32203f = bundle.getInt(t52.a(11), t52Var.f32178g);
            this.f32204g = bundle.getInt(t52.a(12), t52Var.f32179h);
            this.f32205h = bundle.getInt(t52.a(13), t52Var.f32180i);
            this.f32206i = bundle.getInt(t52.a(14), t52Var.f32181j);
            this.f32207j = bundle.getInt(t52.a(15), t52Var.f32182k);
            this.f32208k = bundle.getBoolean(t52.a(16), t52Var.f32183l);
            this.f32209l = sj0.b((String[]) k11.a(bundle.getStringArray(t52.a(17)), new String[0]));
            this.f32210m = bundle.getInt(t52.a(25), t52Var.f32185n);
            this.f32211n = a((String[]) k11.a(bundle.getStringArray(t52.a(1)), new String[0]));
            this.f32212o = bundle.getInt(t52.a(2), t52Var.f32187p);
            this.f32213p = bundle.getInt(t52.a(18), t52Var.f32188q);
            this.f32214q = bundle.getInt(t52.a(19), t52Var.f32189r);
            this.f32215r = sj0.b((String[]) k11.a(bundle.getStringArray(t52.a(20)), new String[0]));
            this.f32216s = a((String[]) k11.a(bundle.getStringArray(t52.a(3)), new String[0]));
            this.f32217t = bundle.getInt(t52.a(4), t52Var.f32192u);
            this.f32218u = bundle.getInt(t52.a(26), t52Var.f32193v);
            this.f32219v = bundle.getBoolean(t52.a(5), t52Var.f32194w);
            this.f32220w = bundle.getBoolean(t52.a(21), t52Var.f32195x);
            this.f32221x = bundle.getBoolean(t52.a(22), t52Var.f32196y);
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(t52.a(23));
            if (parcelableArrayList == null) {
                a4 = sj0.h();
            } else {
                a4 = C2282ul.a(s52.f31588d, parcelableArrayList);
            }
            this.f32222y = new HashMap<>();
            for (int i4 = 0; i4 < a4.size(); i4++) {
                s52 s52Var = (s52) a4.get(i4);
                this.f32222y.put(s52Var.f31589b, s52Var);
            }
            int[] iArr = (int[]) k11.a(bundle.getIntArray(t52.a(24)), new int[0]);
            this.f32223z = new HashSet<>();
            for (int i5 : iArr) {
                this.f32223z.add(Integer.valueOf(i5));
            }
        }
    }

    static {
        new InterfaceC2259tl.a() { // from class: com.yandex.mobile.ads.impl.Ee
            @Override // com.yandex.mobile.ads.impl.InterfaceC2259tl.a
            public final InterfaceC2259tl fromBundle(Bundle bundle) {
                return t52.a(bundle);
            }
        };
    }

    protected t52(a aVar) {
        this.f32173b = aVar.f32198a;
        this.f32174c = aVar.f32199b;
        this.f32175d = aVar.f32200c;
        this.f32176e = aVar.f32201d;
        this.f32177f = aVar.f32202e;
        this.f32178g = aVar.f32203f;
        this.f32179h = aVar.f32204g;
        this.f32180i = aVar.f32205h;
        this.f32181j = aVar.f32206i;
        this.f32182k = aVar.f32207j;
        this.f32183l = aVar.f32208k;
        this.f32184m = aVar.f32209l;
        this.f32185n = aVar.f32210m;
        this.f32186o = aVar.f32211n;
        this.f32187p = aVar.f32212o;
        this.f32188q = aVar.f32213p;
        this.f32189r = aVar.f32214q;
        this.f32190s = aVar.f32215r;
        this.f32191t = aVar.f32216s;
        this.f32192u = aVar.f32217t;
        this.f32193v = aVar.f32218u;
        this.f32194w = aVar.f32219v;
        this.f32195x = aVar.f32220w;
        this.f32196y = aVar.f32221x;
        this.f32197z = tj0.a(aVar.f32222y);
        this.f32172A = uj0.a(aVar.f32223z);
    }

    protected static String a(int i4) {
        return Integer.toString(i4, 36);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            t52 t52Var = (t52) obj;
            if (this.f32173b == t52Var.f32173b && this.f32174c == t52Var.f32174c && this.f32175d == t52Var.f32175d && this.f32176e == t52Var.f32176e && this.f32177f == t52Var.f32177f && this.f32178g == t52Var.f32178g && this.f32179h == t52Var.f32179h && this.f32180i == t52Var.f32180i && this.f32183l == t52Var.f32183l && this.f32181j == t52Var.f32181j && this.f32182k == t52Var.f32182k && this.f32184m.equals(t52Var.f32184m) && this.f32185n == t52Var.f32185n && this.f32186o.equals(t52Var.f32186o) && this.f32187p == t52Var.f32187p && this.f32188q == t52Var.f32188q && this.f32189r == t52Var.f32189r && this.f32190s.equals(t52Var.f32190s) && this.f32191t.equals(t52Var.f32191t) && this.f32192u == t52Var.f32192u && this.f32193v == t52Var.f32193v && this.f32194w == t52Var.f32194w && this.f32195x == t52Var.f32195x && this.f32196y == t52Var.f32196y && this.f32197z.equals(t52Var.f32197z) && this.f32172A.equals(t52Var.f32172A)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f32172A.hashCode() + ((this.f32197z.hashCode() + ((((((((((((this.f32191t.hashCode() + ((this.f32190s.hashCode() + ((((((((this.f32186o.hashCode() + ((((this.f32184m.hashCode() + ((((((((((((((((((((((this.f32173b + 31) * 31) + this.f32174c) * 31) + this.f32175d) * 31) + this.f32176e) * 31) + this.f32177f) * 31) + this.f32178g) * 31) + this.f32179h) * 31) + this.f32180i) * 31) + (this.f32183l ? 1 : 0)) * 31) + this.f32181j) * 31) + this.f32182k) * 31)) * 31) + this.f32185n) * 31)) * 31) + this.f32187p) * 31) + this.f32188q) * 31) + this.f32189r) * 31)) * 31)) * 31) + this.f32192u) * 31) + this.f32193v) * 31) + (this.f32194w ? 1 : 0)) * 31) + (this.f32195x ? 1 : 0)) * 31) + (this.f32196y ? 1 : 0)) * 31)) * 31);
    }

    public static t52 a(Bundle bundle) {
        return new t52(new a(bundle));
    }
}
