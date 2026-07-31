package m2;

import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.os.Looper;
import android.view.accessibility.CaptioningManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import m4.q;
import o2.m0;
import r0.i;
import t1.x0;

/* loaded from: classes.dex */
public class a0 implements r0.i {
    public static final a0 F;

    @Deprecated
    public static final a0 G;

    @Deprecated
    public static final i.a<a0> H;
    public final boolean A;
    public final boolean B;
    public final boolean C;
    public final m4.r<x0, y> D;
    public final m4.s<Integer> E;

    /* renamed from: f, reason: collision with root package name */
    public final int f18930f;

    /* renamed from: g, reason: collision with root package name */
    public final int f18931g;

    /* renamed from: h, reason: collision with root package name */
    public final int f18932h;

    /* renamed from: i, reason: collision with root package name */
    public final int f18933i;

    /* renamed from: j, reason: collision with root package name */
    public final int f18934j;

    /* renamed from: k, reason: collision with root package name */
    public final int f18935k;

    /* renamed from: l, reason: collision with root package name */
    public final int f18936l;

    /* renamed from: m, reason: collision with root package name */
    public final int f18937m;

    /* renamed from: n, reason: collision with root package name */
    public final int f18938n;

    /* renamed from: o, reason: collision with root package name */
    public final int f18939o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f18940p;

    /* renamed from: q, reason: collision with root package name */
    public final m4.q<String> f18941q;

    /* renamed from: r, reason: collision with root package name */
    public final int f18942r;

    /* renamed from: s, reason: collision with root package name */
    public final m4.q<String> f18943s;

    /* renamed from: t, reason: collision with root package name */
    public final int f18944t;

    /* renamed from: u, reason: collision with root package name */
    public final int f18945u;

    /* renamed from: v, reason: collision with root package name */
    public final int f18946v;

    /* renamed from: w, reason: collision with root package name */
    public final m4.q<String> f18947w;

    /* renamed from: x, reason: collision with root package name */
    public final m4.q<String> f18948x;

    /* renamed from: y, reason: collision with root package name */
    public final int f18949y;

    /* renamed from: z, reason: collision with root package name */
    public final int f18950z;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private int f18951a;

        /* renamed from: b, reason: collision with root package name */
        private int f18952b;

        /* renamed from: c, reason: collision with root package name */
        private int f18953c;

        /* renamed from: d, reason: collision with root package name */
        private int f18954d;

        /* renamed from: e, reason: collision with root package name */
        private int f18955e;

        /* renamed from: f, reason: collision with root package name */
        private int f18956f;

        /* renamed from: g, reason: collision with root package name */
        private int f18957g;

        /* renamed from: h, reason: collision with root package name */
        private int f18958h;

        /* renamed from: i, reason: collision with root package name */
        private int f18959i;

        /* renamed from: j, reason: collision with root package name */
        private int f18960j;

        /* renamed from: k, reason: collision with root package name */
        private boolean f18961k;

        /* renamed from: l, reason: collision with root package name */
        private m4.q<String> f18962l;

        /* renamed from: m, reason: collision with root package name */
        private int f18963m;

        /* renamed from: n, reason: collision with root package name */
        private m4.q<String> f18964n;

        /* renamed from: o, reason: collision with root package name */
        private int f18965o;

        /* renamed from: p, reason: collision with root package name */
        private int f18966p;

        /* renamed from: q, reason: collision with root package name */
        private int f18967q;

        /* renamed from: r, reason: collision with root package name */
        private m4.q<String> f18968r;

        /* renamed from: s, reason: collision with root package name */
        private m4.q<String> f18969s;

        /* renamed from: t, reason: collision with root package name */
        private int f18970t;

        /* renamed from: u, reason: collision with root package name */
        private int f18971u;

        /* renamed from: v, reason: collision with root package name */
        private boolean f18972v;

        /* renamed from: w, reason: collision with root package name */
        private boolean f18973w;

        /* renamed from: x, reason: collision with root package name */
        private boolean f18974x;

        /* renamed from: y, reason: collision with root package name */
        private HashMap<x0, y> f18975y;

        /* renamed from: z, reason: collision with root package name */
        private HashSet<Integer> f18976z;

        @Deprecated
        public a() {
            this.f18951a = Integer.MAX_VALUE;
            this.f18952b = Integer.MAX_VALUE;
            this.f18953c = Integer.MAX_VALUE;
            this.f18954d = Integer.MAX_VALUE;
            this.f18959i = Integer.MAX_VALUE;
            this.f18960j = Integer.MAX_VALUE;
            this.f18961k = true;
            this.f18962l = m4.q.x();
            this.f18963m = 0;
            this.f18964n = m4.q.x();
            this.f18965o = 0;
            this.f18966p = Integer.MAX_VALUE;
            this.f18967q = Integer.MAX_VALUE;
            this.f18968r = m4.q.x();
            this.f18969s = m4.q.x();
            this.f18970t = 0;
            this.f18971u = 0;
            this.f18972v = false;
            this.f18973w = false;
            this.f18974x = false;
            this.f18975y = new HashMap<>();
            this.f18976z = new HashSet<>();
        }

        public a(Context context) {
            this();
            E(context);
            H(context, true);
        }

        /* JADX WARN: Multi-variable type inference failed */
        protected a(Bundle bundle) {
            String b7 = a0.b(6);
            a0 a0Var = a0.F;
            this.f18951a = bundle.getInt(b7, a0Var.f18930f);
            this.f18952b = bundle.getInt(a0.b(7), a0Var.f18931g);
            this.f18953c = bundle.getInt(a0.b(8), a0Var.f18932h);
            this.f18954d = bundle.getInt(a0.b(9), a0Var.f18933i);
            this.f18955e = bundle.getInt(a0.b(10), a0Var.f18934j);
            this.f18956f = bundle.getInt(a0.b(11), a0Var.f18935k);
            this.f18957g = bundle.getInt(a0.b(12), a0Var.f18936l);
            this.f18958h = bundle.getInt(a0.b(13), a0Var.f18937m);
            this.f18959i = bundle.getInt(a0.b(14), a0Var.f18938n);
            this.f18960j = bundle.getInt(a0.b(15), a0Var.f18939o);
            this.f18961k = bundle.getBoolean(a0.b(16), a0Var.f18940p);
            this.f18962l = m4.q.u((String[]) l4.g.a(bundle.getStringArray(a0.b(17)), new String[0]));
            this.f18963m = bundle.getInt(a0.b(25), a0Var.f18942r);
            this.f18964n = C((String[]) l4.g.a(bundle.getStringArray(a0.b(1)), new String[0]));
            this.f18965o = bundle.getInt(a0.b(2), a0Var.f18944t);
            this.f18966p = bundle.getInt(a0.b(18), a0Var.f18945u);
            this.f18967q = bundle.getInt(a0.b(19), a0Var.f18946v);
            this.f18968r = m4.q.u((String[]) l4.g.a(bundle.getStringArray(a0.b(20)), new String[0]));
            this.f18969s = C((String[]) l4.g.a(bundle.getStringArray(a0.b(3)), new String[0]));
            this.f18970t = bundle.getInt(a0.b(4), a0Var.f18949y);
            this.f18971u = bundle.getInt(a0.b(26), a0Var.f18950z);
            this.f18972v = bundle.getBoolean(a0.b(5), a0Var.A);
            this.f18973w = bundle.getBoolean(a0.b(21), a0Var.B);
            this.f18974x = bundle.getBoolean(a0.b(22), a0Var.C);
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(a0.b(23));
            m4.q x6 = parcelableArrayList == null ? m4.q.x() : o2.c.b(y.f19089h, parcelableArrayList);
            this.f18975y = new HashMap<>();
            for (int i7 = 0; i7 < x6.size(); i7++) {
                y yVar = (y) x6.get(i7);
                this.f18975y.put(yVar.f19090f, yVar);
            }
            int[] iArr = (int[]) l4.g.a(bundle.getIntArray(a0.b(24)), new int[0]);
            this.f18976z = new HashSet<>();
            for (int i8 : iArr) {
                this.f18976z.add(Integer.valueOf(i8));
            }
        }

        protected a(a0 a0Var) {
            B(a0Var);
        }

        private void B(a0 a0Var) {
            this.f18951a = a0Var.f18930f;
            this.f18952b = a0Var.f18931g;
            this.f18953c = a0Var.f18932h;
            this.f18954d = a0Var.f18933i;
            this.f18955e = a0Var.f18934j;
            this.f18956f = a0Var.f18935k;
            this.f18957g = a0Var.f18936l;
            this.f18958h = a0Var.f18937m;
            this.f18959i = a0Var.f18938n;
            this.f18960j = a0Var.f18939o;
            this.f18961k = a0Var.f18940p;
            this.f18962l = a0Var.f18941q;
            this.f18963m = a0Var.f18942r;
            this.f18964n = a0Var.f18943s;
            this.f18965o = a0Var.f18944t;
            this.f18966p = a0Var.f18945u;
            this.f18967q = a0Var.f18946v;
            this.f18968r = a0Var.f18947w;
            this.f18969s = a0Var.f18948x;
            this.f18970t = a0Var.f18949y;
            this.f18971u = a0Var.f18950z;
            this.f18972v = a0Var.A;
            this.f18973w = a0Var.B;
            this.f18974x = a0Var.C;
            this.f18976z = new HashSet<>(a0Var.E);
            this.f18975y = new HashMap<>(a0Var.D);
        }

        private static m4.q<String> C(String[] strArr) {
            q.a r7 = m4.q.r();
            for (String str : (String[]) o2.a.e(strArr)) {
                r7.a(m0.D0((String) o2.a.e(str)));
            }
            return r7.h();
        }

        private void F(Context context) {
            CaptioningManager captioningManager;
            if ((m0.f19752a >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled()) {
                this.f18970t = 1088;
                Locale locale = captioningManager.getLocale();
                if (locale != null) {
                    this.f18969s = m4.q.y(m0.X(locale));
                }
            }
        }

        public a0 A() {
            return new a0(this);
        }

        protected a D(a0 a0Var) {
            B(a0Var);
            return this;
        }

        public a E(Context context) {
            if (m0.f19752a >= 19) {
                F(context);
            }
            return this;
        }

        public a G(int i7, int i8, boolean z6) {
            this.f18959i = i7;
            this.f18960j = i8;
            this.f18961k = z6;
            return this;
        }

        public a H(Context context, boolean z6) {
            Point O = m0.O(context);
            return G(O.x, O.y, z6);
        }
    }

    static {
        a0 A = new a().A();
        F = A;
        G = A;
        H = new i.a() { // from class: m2.z
            @Override // r0.i.a
            public final r0.i a(Bundle bundle) {
                return a0.a(bundle);
            }
        };
    }

    protected a0(a aVar) {
        this.f18930f = aVar.f18951a;
        this.f18931g = aVar.f18952b;
        this.f18932h = aVar.f18953c;
        this.f18933i = aVar.f18954d;
        this.f18934j = aVar.f18955e;
        this.f18935k = aVar.f18956f;
        this.f18936l = aVar.f18957g;
        this.f18937m = aVar.f18958h;
        this.f18938n = aVar.f18959i;
        this.f18939o = aVar.f18960j;
        this.f18940p = aVar.f18961k;
        this.f18941q = aVar.f18962l;
        this.f18942r = aVar.f18963m;
        this.f18943s = aVar.f18964n;
        this.f18944t = aVar.f18965o;
        this.f18945u = aVar.f18966p;
        this.f18946v = aVar.f18967q;
        this.f18947w = aVar.f18968r;
        this.f18948x = aVar.f18969s;
        this.f18949y = aVar.f18970t;
        this.f18950z = aVar.f18971u;
        this.A = aVar.f18972v;
        this.B = aVar.f18973w;
        this.C = aVar.f18974x;
        this.D = m4.r.c(aVar.f18975y);
        this.E = m4.s.r(aVar.f18976z);
    }

    public static a0 a(Bundle bundle) {
        return new a(bundle).A();
    }

    protected static String b(int i7) {
        return Integer.toString(i7, 36);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return this.f18930f == a0Var.f18930f && this.f18931g == a0Var.f18931g && this.f18932h == a0Var.f18932h && this.f18933i == a0Var.f18933i && this.f18934j == a0Var.f18934j && this.f18935k == a0Var.f18935k && this.f18936l == a0Var.f18936l && this.f18937m == a0Var.f18937m && this.f18940p == a0Var.f18940p && this.f18938n == a0Var.f18938n && this.f18939o == a0Var.f18939o && this.f18941q.equals(a0Var.f18941q) && this.f18942r == a0Var.f18942r && this.f18943s.equals(a0Var.f18943s) && this.f18944t == a0Var.f18944t && this.f18945u == a0Var.f18945u && this.f18946v == a0Var.f18946v && this.f18947w.equals(a0Var.f18947w) && this.f18948x.equals(a0Var.f18948x) && this.f18949y == a0Var.f18949y && this.f18950z == a0Var.f18950z && this.A == a0Var.A && this.B == a0Var.B && this.C == a0Var.C && this.D.equals(a0Var.D) && this.E.equals(a0Var.E);
    }

    public int hashCode() {
        return ((((((((((((((((((((((((((((((((((((((((((((((((((this.f18930f + 31) * 31) + this.f18931g) * 31) + this.f18932h) * 31) + this.f18933i) * 31) + this.f18934j) * 31) + this.f18935k) * 31) + this.f18936l) * 31) + this.f18937m) * 31) + (this.f18940p ? 1 : 0)) * 31) + this.f18938n) * 31) + this.f18939o) * 31) + this.f18941q.hashCode()) * 31) + this.f18942r) * 31) + this.f18943s.hashCode()) * 31) + this.f18944t) * 31) + this.f18945u) * 31) + this.f18946v) * 31) + this.f18947w.hashCode()) * 31) + this.f18948x.hashCode()) * 31) + this.f18949y) * 31) + this.f18950z) * 31) + (this.A ? 1 : 0)) * 31) + (this.B ? 1 : 0)) * 31) + (this.C ? 1 : 0)) * 31) + this.D.hashCode()) * 31) + this.E.hashCode();
    }
}
