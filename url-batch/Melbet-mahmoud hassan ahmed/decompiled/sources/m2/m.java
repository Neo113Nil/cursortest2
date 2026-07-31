package m2;

import android.content.Context;
import android.graphics.Point;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.RandomAccess;
import m2.a;
import m2.a0;
import m2.m;
import m2.t;
import m2.v;
import m4.h0;
import m4.q;
import o2.m0;
import r0.f3;
import r0.h3;
import r0.i;
import r0.r3;
import r0.s1;
import t1.x;
import t1.x0;
import t1.z0;

/* loaded from: classes.dex */
public class m extends v {

    /* renamed from: k, reason: collision with root package name */
    private static final h0<Integer> f19005k = h0.a(new Comparator() { // from class: m2.e
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int M;
            M = m.M((Integer) obj, (Integer) obj2);
            return M;
        }
    });

    /* renamed from: l, reason: collision with root package name */
    private static final h0<Integer> f19006l = h0.a(new Comparator() { // from class: m2.d
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int N;
            N = m.N((Integer) obj, (Integer) obj2);
            return N;
        }
    });

    /* renamed from: d, reason: collision with root package name */
    private final Object f19007d;

    /* renamed from: e, reason: collision with root package name */
    public final Context f19008e;

    /* renamed from: f, reason: collision with root package name */
    private final t.b f19009f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f19010g;

    /* renamed from: h, reason: collision with root package name */
    private d f19011h;

    /* renamed from: i, reason: collision with root package name */
    private f f19012i;

    /* renamed from: j, reason: collision with root package name */
    private t0.e f19013j;

    /* JADX INFO: Access modifiers changed from: private */
    static final class b extends h<b> implements Comparable<b> {
        private final boolean A;

        /* renamed from: j, reason: collision with root package name */
        private final int f19014j;

        /* renamed from: k, reason: collision with root package name */
        private final boolean f19015k;

        /* renamed from: l, reason: collision with root package name */
        private final String f19016l;

        /* renamed from: m, reason: collision with root package name */
        private final d f19017m;

        /* renamed from: n, reason: collision with root package name */
        private final boolean f19018n;

        /* renamed from: o, reason: collision with root package name */
        private final int f19019o;

        /* renamed from: p, reason: collision with root package name */
        private final int f19020p;

        /* renamed from: q, reason: collision with root package name */
        private final int f19021q;

        /* renamed from: r, reason: collision with root package name */
        private final boolean f19022r;

        /* renamed from: s, reason: collision with root package name */
        private final int f19023s;

        /* renamed from: t, reason: collision with root package name */
        private final int f19024t;

        /* renamed from: u, reason: collision with root package name */
        private final boolean f19025u;

        /* renamed from: v, reason: collision with root package name */
        private final int f19026v;

        /* renamed from: w, reason: collision with root package name */
        private final int f19027w;

        /* renamed from: x, reason: collision with root package name */
        private final int f19028x;

        /* renamed from: y, reason: collision with root package name */
        private final int f19029y;

        /* renamed from: z, reason: collision with root package name */
        private final boolean f19030z;

        public b(int i7, x0 x0Var, int i8, d dVar, int i9, boolean z6, l4.k<s1> kVar) {
            super(i7, x0Var, i8);
            int i10;
            int i11;
            int i12;
            this.f19017m = dVar;
            this.f19016l = m.Q(this.f19055i.f20947h);
            this.f19018n = m.I(i9, false);
            int i13 = 0;
            while (true) {
                i10 = Integer.MAX_VALUE;
                if (i13 >= dVar.f18943s.size()) {
                    i13 = Integer.MAX_VALUE;
                    i11 = 0;
                    break;
                } else {
                    i11 = m.B(this.f19055i, dVar.f18943s.get(i13), false);
                    if (i11 > 0) {
                        break;
                    } else {
                        i13++;
                    }
                }
            }
            this.f19020p = i13;
            this.f19019o = i11;
            this.f19021q = m.E(this.f19055i.f20949j, dVar.f18944t);
            s1 s1Var = this.f19055i;
            int i14 = s1Var.f20949j;
            this.f19022r = i14 == 0 || (i14 & 1) != 0;
            this.f19025u = (s1Var.f20948i & 1) != 0;
            int i15 = s1Var.D;
            this.f19026v = i15;
            this.f19027w = s1Var.E;
            int i16 = s1Var.f20952m;
            this.f19028x = i16;
            this.f19015k = (i16 == -1 || i16 <= dVar.f18946v) && (i15 == -1 || i15 <= dVar.f18945u) && kVar.apply(s1Var);
            String[] g02 = m0.g0();
            int i17 = 0;
            while (true) {
                if (i17 >= g02.length) {
                    i17 = Integer.MAX_VALUE;
                    i12 = 0;
                    break;
                } else {
                    i12 = m.B(this.f19055i, g02[i17], false);
                    if (i12 > 0) {
                        break;
                    } else {
                        i17++;
                    }
                }
            }
            this.f19023s = i17;
            this.f19024t = i12;
            int i18 = 0;
            while (true) {
                if (i18 < dVar.f18947w.size()) {
                    String str = this.f19055i.f20956q;
                    if (str != null && str.equals(dVar.f18947w.get(i18))) {
                        i10 = i18;
                        break;
                    }
                    i18++;
                } else {
                    break;
                }
            }
            this.f19029y = i10;
            this.f19030z = f3.e(i9) == 128;
            this.A = f3.g(i9) == 64;
            this.f19014j = h(i9, z6);
        }

        public static int e(List<b> list, List<b> list2) {
            return ((b) Collections.max(list)).compareTo((b) Collections.max(list2));
        }

        public static m4.q<b> g(int i7, x0 x0Var, d dVar, int[] iArr, boolean z6, l4.k<s1> kVar) {
            q.a r7 = m4.q.r();
            for (int i8 = 0; i8 < x0Var.f22259f; i8++) {
                r7.a(new b(i7, x0Var, i8, dVar, iArr[i8], z6, kVar));
            }
            return r7.h();
        }

        private int h(int i7, boolean z6) {
            if (!m.I(i7, this.f19017m.S)) {
                return 0;
            }
            if (!this.f19015k && !this.f19017m.M) {
                return 0;
            }
            if (m.I(i7, false) && this.f19015k && this.f19055i.f20952m != -1) {
                d dVar = this.f19017m;
                if (!dVar.C && !dVar.B && (dVar.U || !z6)) {
                    return 2;
                }
            }
            return 1;
        }

        @Override // m2.m.h
        public int b() {
            return this.f19014j;
        }

        @Override // java.lang.Comparable
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            h0 d7 = (this.f19015k && this.f19018n) ? m.f19005k : m.f19005k.d();
            m4.k f7 = m4.k.j().g(this.f19018n, bVar.f19018n).f(Integer.valueOf(this.f19020p), Integer.valueOf(bVar.f19020p), h0.b().d()).d(this.f19019o, bVar.f19019o).d(this.f19021q, bVar.f19021q).g(this.f19025u, bVar.f19025u).g(this.f19022r, bVar.f19022r).f(Integer.valueOf(this.f19023s), Integer.valueOf(bVar.f19023s), h0.b().d()).d(this.f19024t, bVar.f19024t).g(this.f19015k, bVar.f19015k).f(Integer.valueOf(this.f19029y), Integer.valueOf(bVar.f19029y), h0.b().d()).f(Integer.valueOf(this.f19028x), Integer.valueOf(bVar.f19028x), this.f19017m.B ? m.f19005k.d() : m.f19006l).g(this.f19030z, bVar.f19030z).g(this.A, bVar.A).f(Integer.valueOf(this.f19026v), Integer.valueOf(bVar.f19026v), d7).f(Integer.valueOf(this.f19027w), Integer.valueOf(bVar.f19027w), d7);
            Integer valueOf = Integer.valueOf(this.f19028x);
            Integer valueOf2 = Integer.valueOf(bVar.f19028x);
            if (!m0.c(this.f19016l, bVar.f19016l)) {
                d7 = m.f19006l;
            }
            return f7.f(valueOf, valueOf2, d7).i();
        }

        @Override // m2.m.h
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public boolean d(b bVar) {
            int i7;
            String str;
            int i8;
            d dVar = this.f19017m;
            if ((dVar.P || ((i8 = this.f19055i.D) != -1 && i8 == bVar.f19055i.D)) && (dVar.N || ((str = this.f19055i.f20956q) != null && TextUtils.equals(str, bVar.f19055i.f20956q)))) {
                d dVar2 = this.f19017m;
                if ((dVar2.O || ((i7 = this.f19055i.E) != -1 && i7 == bVar.f19055i.E)) && (dVar2.Q || (this.f19030z == bVar.f19030z && this.A == bVar.A))) {
                    return true;
                }
            }
            return false;
        }
    }

    private static final class c implements Comparable<c> {

        /* renamed from: f, reason: collision with root package name */
        private final boolean f19031f;

        /* renamed from: g, reason: collision with root package name */
        private final boolean f19032g;

        public c(s1 s1Var, int i7) {
            this.f19031f = (s1Var.f20948i & 1) != 0;
            this.f19032g = m.I(i7, false);
        }

        @Override // java.lang.Comparable
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compareTo(c cVar) {
            return m4.k.j().g(this.f19032g, cVar.f19032g).g(this.f19031f, cVar.f19031f).i();
        }
    }

    public static final class d extends a0 {
        public static final d X;

        @Deprecated
        public static final d Y;
        public static final i.a<d> Z;
        public final boolean I;
        public final boolean J;
        public final boolean K;
        public final boolean L;
        public final boolean M;
        public final boolean N;
        public final boolean O;
        public final boolean P;
        public final boolean Q;
        public final boolean R;
        public final boolean S;
        public final boolean T;
        public final boolean U;
        private final SparseArray<Map<z0, e>> V;
        private final SparseBooleanArray W;

        public static final class a extends a0.a {
            private boolean A;
            private boolean B;
            private boolean C;
            private boolean D;
            private boolean E;
            private boolean F;
            private boolean G;
            private boolean H;
            private boolean I;
            private boolean J;
            private boolean K;
            private boolean L;
            private boolean M;
            private final SparseArray<Map<z0, e>> N;
            private final SparseBooleanArray O;

            @Deprecated
            public a() {
                this.N = new SparseArray<>();
                this.O = new SparseBooleanArray();
                Z();
            }

            public a(Context context) {
                super(context);
                this.N = new SparseArray<>();
                this.O = new SparseBooleanArray();
                Z();
            }

            private a(Bundle bundle) {
                super(bundle);
                Z();
                d dVar = d.X;
                n0(bundle.getBoolean(a0.b(1000), dVar.I));
                i0(bundle.getBoolean(a0.b(1001), dVar.J));
                j0(bundle.getBoolean(a0.b(1002), dVar.K));
                h0(bundle.getBoolean(a0.b(1014), dVar.L));
                l0(bundle.getBoolean(a0.b(1003), dVar.M));
                e0(bundle.getBoolean(a0.b(1004), dVar.N));
                f0(bundle.getBoolean(a0.b(1005), dVar.O));
                c0(bundle.getBoolean(a0.b(1006), dVar.P));
                d0(bundle.getBoolean(a0.b(1015), dVar.Q));
                k0(bundle.getBoolean(a0.b(1016), dVar.R));
                m0(bundle.getBoolean(a0.b(1007), dVar.S));
                r0(bundle.getBoolean(a0.b(1008), dVar.T));
                g0(bundle.getBoolean(a0.b(1009), dVar.U));
                this.N = new SparseArray<>();
                q0(bundle);
                this.O = a0(bundle.getIntArray(a0.b(1013)));
            }

            private a(d dVar) {
                super(dVar);
                this.A = dVar.I;
                this.B = dVar.J;
                this.C = dVar.K;
                this.D = dVar.L;
                this.E = dVar.M;
                this.F = dVar.N;
                this.G = dVar.O;
                this.H = dVar.P;
                this.I = dVar.Q;
                this.J = dVar.R;
                this.K = dVar.S;
                this.L = dVar.T;
                this.M = dVar.U;
                this.N = Y(dVar.V);
                this.O = dVar.W.clone();
            }

            private static SparseArray<Map<z0, e>> Y(SparseArray<Map<z0, e>> sparseArray) {
                SparseArray<Map<z0, e>> sparseArray2 = new SparseArray<>();
                for (int i7 = 0; i7 < sparseArray.size(); i7++) {
                    sparseArray2.put(sparseArray.keyAt(i7), new HashMap(sparseArray.valueAt(i7)));
                }
                return sparseArray2;
            }

            private void Z() {
                this.A = true;
                this.B = false;
                this.C = true;
                this.D = false;
                this.E = true;
                this.F = false;
                this.G = false;
                this.H = false;
                this.I = false;
                this.J = true;
                this.K = true;
                this.L = false;
                this.M = true;
            }

            private SparseBooleanArray a0(int[] iArr) {
                if (iArr == null) {
                    return new SparseBooleanArray();
                }
                SparseBooleanArray sparseBooleanArray = new SparseBooleanArray(iArr.length);
                for (int i7 : iArr) {
                    sparseBooleanArray.append(i7, true);
                }
                return sparseBooleanArray;
            }

            /* JADX WARN: Multi-variable type inference failed */
            private void q0(Bundle bundle) {
                int[] intArray = bundle.getIntArray(a0.b(1010));
                ArrayList parcelableArrayList = bundle.getParcelableArrayList(a0.b(1011));
                m4.q x6 = parcelableArrayList == null ? m4.q.x() : o2.c.b(z0.f22274j, parcelableArrayList);
                SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(a0.b(1012));
                SparseArray sparseArray = sparseParcelableArray == null ? new SparseArray() : o2.c.c(e.f19033j, sparseParcelableArray);
                if (intArray == null || intArray.length != x6.size()) {
                    return;
                }
                for (int i7 = 0; i7 < intArray.length; i7++) {
                    p0(intArray[i7], (z0) x6.get(i7), (e) sparseArray.get(i7));
                }
            }

            @Override // m2.a0.a
            /* renamed from: X, reason: merged with bridge method [inline-methods] */
            public d A() {
                return new d(this);
            }

            protected a b0(a0 a0Var) {
                super.D(a0Var);
                return this;
            }

            public a c0(boolean z6) {
                this.H = z6;
                return this;
            }

            public a d0(boolean z6) {
                this.I = z6;
                return this;
            }

            public a e0(boolean z6) {
                this.F = z6;
                return this;
            }

            public a f0(boolean z6) {
                this.G = z6;
                return this;
            }

            public a g0(boolean z6) {
                this.M = z6;
                return this;
            }

            public a h0(boolean z6) {
                this.D = z6;
                return this;
            }

            public a i0(boolean z6) {
                this.B = z6;
                return this;
            }

            public a j0(boolean z6) {
                this.C = z6;
                return this;
            }

            public a k0(boolean z6) {
                this.J = z6;
                return this;
            }

            public a l0(boolean z6) {
                this.E = z6;
                return this;
            }

            public a m0(boolean z6) {
                this.K = z6;
                return this;
            }

            public a n0(boolean z6) {
                this.A = z6;
                return this;
            }

            @Override // m2.a0.a
            /* renamed from: o0, reason: merged with bridge method [inline-methods] */
            public a E(Context context) {
                super.E(context);
                return this;
            }

            @Deprecated
            public a p0(int i7, z0 z0Var, e eVar) {
                Map<z0, e> map = this.N.get(i7);
                if (map == null) {
                    map = new HashMap<>();
                    this.N.put(i7, map);
                }
                if (map.containsKey(z0Var) && m0.c(map.get(z0Var), eVar)) {
                    return this;
                }
                map.put(z0Var, eVar);
                return this;
            }

            public a r0(boolean z6) {
                this.L = z6;
                return this;
            }

            @Override // m2.a0.a
            /* renamed from: s0, reason: merged with bridge method [inline-methods] */
            public a G(int i7, int i8, boolean z6) {
                super.G(i7, i8, z6);
                return this;
            }

            @Override // m2.a0.a
            /* renamed from: t0, reason: merged with bridge method [inline-methods] */
            public a H(Context context, boolean z6) {
                super.H(context, z6);
                return this;
            }
        }

        static {
            d A = new a().A();
            X = A;
            Y = A;
            Z = new i.a() { // from class: m2.n
                @Override // r0.i.a
                public final r0.i a(Bundle bundle) {
                    m.d n7;
                    n7 = m.d.n(bundle);
                    return n7;
                }
            };
        }

        private d(a aVar) {
            super(aVar);
            this.I = aVar.A;
            this.J = aVar.B;
            this.K = aVar.C;
            this.L = aVar.D;
            this.M = aVar.E;
            this.N = aVar.F;
            this.O = aVar.G;
            this.P = aVar.H;
            this.Q = aVar.I;
            this.R = aVar.J;
            this.S = aVar.K;
            this.T = aVar.L;
            this.U = aVar.M;
            this.V = aVar.N;
            this.W = aVar.O;
        }

        private static boolean f(SparseBooleanArray sparseBooleanArray, SparseBooleanArray sparseBooleanArray2) {
            int size = sparseBooleanArray.size();
            if (sparseBooleanArray2.size() != size) {
                return false;
            }
            for (int i7 = 0; i7 < size; i7++) {
                if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i7)) < 0) {
                    return false;
                }
            }
            return true;
        }

        private static boolean g(SparseArray<Map<z0, e>> sparseArray, SparseArray<Map<z0, e>> sparseArray2) {
            int size = sparseArray.size();
            if (sparseArray2.size() != size) {
                return false;
            }
            for (int i7 = 0; i7 < size; i7++) {
                int indexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i7));
                if (indexOfKey < 0 || !h(sparseArray.valueAt(i7), sparseArray2.valueAt(indexOfKey))) {
                    return false;
                }
            }
            return true;
        }

        private static boolean h(Map<z0, e> map, Map<z0, e> map2) {
            if (map2.size() != map.size()) {
                return false;
            }
            for (Map.Entry<z0, e> entry : map.entrySet()) {
                z0 key = entry.getKey();
                if (!map2.containsKey(key) || !m0.c(entry.getValue(), map2.get(key))) {
                    return false;
                }
            }
            return true;
        }

        public static d j(Context context) {
            return new a(context).A();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ d n(Bundle bundle) {
            return new a(bundle).A();
        }

        @Override // m2.a0
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            return super.equals(dVar) && this.I == dVar.I && this.J == dVar.J && this.K == dVar.K && this.L == dVar.L && this.M == dVar.M && this.N == dVar.N && this.O == dVar.O && this.P == dVar.P && this.Q == dVar.Q && this.R == dVar.R && this.S == dVar.S && this.T == dVar.T && this.U == dVar.U && f(this.W, dVar.W) && g(this.V, dVar.V);
        }

        @Override // m2.a0
        public int hashCode() {
            return ((((((((((((((((((((((((((super.hashCode() + 31) * 31) + (this.I ? 1 : 0)) * 31) + (this.J ? 1 : 0)) * 31) + (this.K ? 1 : 0)) * 31) + (this.L ? 1 : 0)) * 31) + (this.M ? 1 : 0)) * 31) + (this.N ? 1 : 0)) * 31) + (this.O ? 1 : 0)) * 31) + (this.P ? 1 : 0)) * 31) + (this.Q ? 1 : 0)) * 31) + (this.R ? 1 : 0)) * 31) + (this.S ? 1 : 0)) * 31) + (this.T ? 1 : 0)) * 31) + (this.U ? 1 : 0);
        }

        public a i() {
            return new a();
        }

        public boolean k(int i7) {
            return this.W.get(i7);
        }

        @Deprecated
        public e l(int i7, z0 z0Var) {
            Map<z0, e> map = this.V.get(i7);
            if (map != null) {
                return map.get(z0Var);
            }
            return null;
        }

        @Deprecated
        public boolean m(int i7, z0 z0Var) {
            Map<z0, e> map = this.V.get(i7);
            return map != null && map.containsKey(z0Var);
        }
    }

    public static final class e implements r0.i {

        /* renamed from: j, reason: collision with root package name */
        public static final i.a<e> f19033j = new i.a() { // from class: m2.o
            @Override // r0.i.a
            public final r0.i a(Bundle bundle) {
                m.e c7;
                c7 = m.e.c(bundle);
                return c7;
            }
        };

        /* renamed from: f, reason: collision with root package name */
        public final int f19034f;

        /* renamed from: g, reason: collision with root package name */
        public final int[] f19035g;

        /* renamed from: h, reason: collision with root package name */
        public final int f19036h;

        /* renamed from: i, reason: collision with root package name */
        public final int f19037i;

        public e(int i7, int[] iArr, int i8) {
            this.f19034f = i7;
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            this.f19035g = copyOf;
            this.f19036h = iArr.length;
            this.f19037i = i8;
            Arrays.sort(copyOf);
        }

        private static String b(int i7) {
            return Integer.toString(i7, 36);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ e c(Bundle bundle) {
            boolean z6 = false;
            int i7 = bundle.getInt(b(0), -1);
            int[] intArray = bundle.getIntArray(b(1));
            int i8 = bundle.getInt(b(2), -1);
            if (i7 >= 0 && i8 >= 0) {
                z6 = true;
            }
            o2.a.a(z6);
            o2.a.e(intArray);
            return new e(i7, intArray, i8);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || e.class != obj.getClass()) {
                return false;
            }
            e eVar = (e) obj;
            return this.f19034f == eVar.f19034f && Arrays.equals(this.f19035g, eVar.f19035g) && this.f19037i == eVar.f19037i;
        }

        public int hashCode() {
            return (((this.f19034f * 31) + Arrays.hashCode(this.f19035g)) * 31) + this.f19037i;
        }
    }

    private static class f {

        /* renamed from: a, reason: collision with root package name */
        private final Spatializer f19038a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f19039b;

        /* renamed from: c, reason: collision with root package name */
        private Handler f19040c;

        /* renamed from: d, reason: collision with root package name */
        private Spatializer.OnSpatializerStateChangedListener f19041d;

        class a implements Spatializer.OnSpatializerStateChangedListener {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ m f19042a;

            a(f fVar, m mVar) {
                this.f19042a = mVar;
            }

            @Override // android.media.Spatializer.OnSpatializerStateChangedListener
            public void onSpatializerAvailableChanged(Spatializer spatializer, boolean z6) {
                this.f19042a.P();
            }

            @Override // android.media.Spatializer.OnSpatializerStateChangedListener
            public void onSpatializerEnabledChanged(Spatializer spatializer, boolean z6) {
                this.f19042a.P();
            }
        }

        private f(Spatializer spatializer) {
            this.f19038a = spatializer;
            this.f19039b = spatializer.getImmersiveAudioLevel() != 0;
        }

        public static f g(Context context) {
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            if (audioManager == null) {
                return null;
            }
            return new f(audioManager.getSpatializer());
        }

        public boolean a(t0.e eVar, s1 s1Var) {
            AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(m0.G(("audio/eac3-joc".equals(s1Var.f20956q) && s1Var.D == 16) ? 12 : s1Var.D));
            int i7 = s1Var.E;
            if (i7 != -1) {
                channelMask.setSampleRate(i7);
            }
            return this.f19038a.canBeSpatialized(eVar.b().f21714a, channelMask.build());
        }

        public void b(m mVar, Looper looper) {
            if (this.f19041d == null && this.f19040c == null) {
                this.f19041d = new a(this, mVar);
                Handler handler = new Handler(looper);
                this.f19040c = handler;
                Spatializer spatializer = this.f19038a;
                Objects.requireNonNull(handler);
                spatializer.addOnSpatializerStateChangedListener(new p(handler), this.f19041d);
            }
        }

        public boolean c() {
            return this.f19038a.isAvailable();
        }

        public boolean d() {
            return this.f19038a.isEnabled();
        }

        public boolean e() {
            return this.f19039b;
        }

        public void f() {
            Spatializer.OnSpatializerStateChangedListener onSpatializerStateChangedListener = this.f19041d;
            if (onSpatializerStateChangedListener == null || this.f19040c == null) {
                return;
            }
            this.f19038a.removeOnSpatializerStateChangedListener(onSpatializerStateChangedListener);
            ((Handler) m0.j(this.f19040c)).removeCallbacksAndMessages(null);
            this.f19040c = null;
            this.f19041d = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class g extends h<g> implements Comparable<g> {

        /* renamed from: j, reason: collision with root package name */
        private final int f19043j;

        /* renamed from: k, reason: collision with root package name */
        private final boolean f19044k;

        /* renamed from: l, reason: collision with root package name */
        private final boolean f19045l;

        /* renamed from: m, reason: collision with root package name */
        private final boolean f19046m;

        /* renamed from: n, reason: collision with root package name */
        private final int f19047n;

        /* renamed from: o, reason: collision with root package name */
        private final int f19048o;

        /* renamed from: p, reason: collision with root package name */
        private final int f19049p;

        /* renamed from: q, reason: collision with root package name */
        private final int f19050q;

        /* renamed from: r, reason: collision with root package name */
        private final boolean f19051r;

        public g(int i7, x0 x0Var, int i8, d dVar, int i9, String str) {
            super(i7, x0Var, i8);
            int i10;
            int i11 = 0;
            this.f19044k = m.I(i9, false);
            int i12 = this.f19055i.f20948i & (dVar.f18950z ^ (-1));
            this.f19045l = (i12 & 1) != 0;
            this.f19046m = (i12 & 2) != 0;
            int i13 = Integer.MAX_VALUE;
            m4.q<String> y6 = dVar.f18948x.isEmpty() ? m4.q.y("") : dVar.f18948x;
            int i14 = 0;
            while (true) {
                if (i14 >= y6.size()) {
                    i10 = 0;
                    break;
                }
                i10 = m.B(this.f19055i, y6.get(i14), dVar.A);
                if (i10 > 0) {
                    i13 = i14;
                    break;
                }
                i14++;
            }
            this.f19047n = i13;
            this.f19048o = i10;
            int E = m.E(this.f19055i.f20949j, dVar.f18949y);
            this.f19049p = E;
            this.f19051r = (this.f19055i.f20949j & 1088) != 0;
            int B = m.B(this.f19055i, str, m.Q(str) == null);
            this.f19050q = B;
            boolean z6 = i10 > 0 || (dVar.f18948x.isEmpty() && E > 0) || this.f19045l || (this.f19046m && B > 0);
            if (m.I(i9, dVar.S) && z6) {
                i11 = 1;
            }
            this.f19043j = i11;
        }

        public static int e(List<g> list, List<g> list2) {
            return list.get(0).compareTo(list2.get(0));
        }

        public static m4.q<g> g(int i7, x0 x0Var, d dVar, int[] iArr, String str) {
            q.a r7 = m4.q.r();
            for (int i8 = 0; i8 < x0Var.f22259f; i8++) {
                r7.a(new g(i7, x0Var, i8, dVar, iArr[i8], str));
            }
            return r7.h();
        }

        @Override // m2.m.h
        public int b() {
            return this.f19043j;
        }

        @Override // java.lang.Comparable
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public int compareTo(g gVar) {
            m4.k d7 = m4.k.j().g(this.f19044k, gVar.f19044k).f(Integer.valueOf(this.f19047n), Integer.valueOf(gVar.f19047n), h0.b().d()).d(this.f19048o, gVar.f19048o).d(this.f19049p, gVar.f19049p).g(this.f19045l, gVar.f19045l).f(Boolean.valueOf(this.f19046m), Boolean.valueOf(gVar.f19046m), this.f19048o == 0 ? h0.b() : h0.b().d()).d(this.f19050q, gVar.f19050q);
            if (this.f19049p == 0) {
                d7 = d7.h(this.f19051r, gVar.f19051r);
            }
            return d7.i();
        }

        @Override // m2.m.h
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public boolean d(g gVar) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static abstract class h<T extends h<T>> {

        /* renamed from: f, reason: collision with root package name */
        public final int f19052f;

        /* renamed from: g, reason: collision with root package name */
        public final x0 f19053g;

        /* renamed from: h, reason: collision with root package name */
        public final int f19054h;

        /* renamed from: i, reason: collision with root package name */
        public final s1 f19055i;

        public interface a<T extends h<T>> {
            List<T> a(int i7, x0 x0Var, int[] iArr);
        }

        public h(int i7, x0 x0Var, int i8) {
            this.f19052f = i7;
            this.f19053g = x0Var;
            this.f19054h = i8;
            this.f19055i = x0Var.b(i8);
        }

        public abstract int b();

        public abstract boolean d(T t6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class i extends h<i> {

        /* renamed from: j, reason: collision with root package name */
        private final boolean f19056j;

        /* renamed from: k, reason: collision with root package name */
        private final d f19057k;

        /* renamed from: l, reason: collision with root package name */
        private final boolean f19058l;

        /* renamed from: m, reason: collision with root package name */
        private final boolean f19059m;

        /* renamed from: n, reason: collision with root package name */
        private final int f19060n;

        /* renamed from: o, reason: collision with root package name */
        private final int f19061o;

        /* renamed from: p, reason: collision with root package name */
        private final int f19062p;

        /* renamed from: q, reason: collision with root package name */
        private final int f19063q;

        /* renamed from: r, reason: collision with root package name */
        private final boolean f19064r;

        /* renamed from: s, reason: collision with root package name */
        private final boolean f19065s;

        /* renamed from: t, reason: collision with root package name */
        private final int f19066t;

        /* renamed from: u, reason: collision with root package name */
        private final boolean f19067u;

        /* renamed from: v, reason: collision with root package name */
        private final boolean f19068v;

        /* renamed from: w, reason: collision with root package name */
        private final int f19069w;

        /* JADX WARN: Removed duplicated region for block: B:49:0x00a0  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x00b5  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x00d6  */
        /* JADX WARN: Removed duplicated region for block: B:66:0x00e4  */
        /* JADX WARN: Removed duplicated region for block: B:70:0x00d8  */
        /* JADX WARN: Removed duplicated region for block: B:74:0x00cc A[EDGE_INSN: B:74:0x00cc->B:61:0x00cc BREAK  A[LOOP:0: B:53:0x00ad->B:72:0x00c9], SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public i(int i7, x0 x0Var, int i8, d dVar, int i9, int i10, boolean z6) {
            super(i7, x0Var, i8);
            boolean z7;
            boolean z8;
            int i11;
            s1 s1Var;
            int i12;
            int i13;
            float f7;
            int i14;
            s1 s1Var2;
            int i15;
            int i16;
            int i17;
            this.f19057k = dVar;
            int i18 = dVar.K ? 24 : 16;
            this.f19065s = dVar.J && (i10 & i18) != 0;
            if (z6 && (((i15 = (s1Var2 = this.f19055i).f20961v) == -1 || i15 <= dVar.f18930f) && ((i16 = s1Var2.f20962w) == -1 || i16 <= dVar.f18931g))) {
                float f8 = s1Var2.f20963x;
                if ((f8 == -1.0f || f8 <= dVar.f18932h) && ((i17 = s1Var2.f20952m) == -1 || i17 <= dVar.f18933i)) {
                    z7 = true;
                    this.f19056j = z7;
                    if (z6 && (((i12 = (s1Var = this.f19055i).f20961v) == -1 || i12 >= dVar.f18934j) && ((i13 = s1Var.f20962w) == -1 || i13 >= dVar.f18935k))) {
                        f7 = s1Var.f20963x;
                        if ((f7 != -1.0f || f7 >= dVar.f18936l) && ((i14 = s1Var.f20952m) == -1 || i14 >= dVar.f18937m)) {
                            z8 = true;
                            this.f19058l = z8;
                            this.f19059m = m.I(i9, false);
                            s1 s1Var3 = this.f19055i;
                            this.f19060n = s1Var3.f20952m;
                            this.f19061o = s1Var3.f();
                            this.f19063q = m.E(this.f19055i.f20949j, dVar.f18942r);
                            int i19 = this.f19055i.f20949j;
                            this.f19064r = (i19 == 0 && (i19 & 1) == 0) ? false : true;
                            int i20 = Integer.MAX_VALUE;
                            i11 = 0;
                            while (true) {
                                if (i11 < dVar.f18941q.size()) {
                                    String str = this.f19055i.f20956q;
                                    if (str != null && str.equals(dVar.f18941q.get(i11))) {
                                        i20 = i11;
                                        break;
                                    }
                                    i11++;
                                } else {
                                    break;
                                }
                            }
                            this.f19062p = i20;
                            this.f19067u = f3.e(i9) != 128;
                            this.f19068v = f3.g(i9) == 64;
                            this.f19069w = m.F(this.f19055i.f20956q);
                            this.f19066t = k(i9, i18);
                        }
                    }
                    z8 = false;
                    this.f19058l = z8;
                    this.f19059m = m.I(i9, false);
                    s1 s1Var32 = this.f19055i;
                    this.f19060n = s1Var32.f20952m;
                    this.f19061o = s1Var32.f();
                    this.f19063q = m.E(this.f19055i.f20949j, dVar.f18942r);
                    int i192 = this.f19055i.f20949j;
                    this.f19064r = (i192 == 0 && (i192 & 1) == 0) ? false : true;
                    int i202 = Integer.MAX_VALUE;
                    i11 = 0;
                    while (true) {
                        if (i11 < dVar.f18941q.size()) {
                        }
                        i11++;
                    }
                    this.f19062p = i202;
                    this.f19067u = f3.e(i9) != 128;
                    this.f19068v = f3.g(i9) == 64;
                    this.f19069w = m.F(this.f19055i.f20956q);
                    this.f19066t = k(i9, i18);
                }
            }
            z7 = false;
            this.f19056j = z7;
            if (z6) {
                f7 = s1Var.f20963x;
                if (f7 != -1.0f) {
                }
                z8 = true;
                this.f19058l = z8;
                this.f19059m = m.I(i9, false);
                s1 s1Var322 = this.f19055i;
                this.f19060n = s1Var322.f20952m;
                this.f19061o = s1Var322.f();
                this.f19063q = m.E(this.f19055i.f20949j, dVar.f18942r);
                int i1922 = this.f19055i.f20949j;
                this.f19064r = (i1922 == 0 && (i1922 & 1) == 0) ? false : true;
                int i2022 = Integer.MAX_VALUE;
                i11 = 0;
                while (true) {
                    if (i11 < dVar.f18941q.size()) {
                    }
                    i11++;
                }
                this.f19062p = i2022;
                this.f19067u = f3.e(i9) != 128;
                this.f19068v = f3.g(i9) == 64;
                this.f19069w = m.F(this.f19055i.f20956q);
                this.f19066t = k(i9, i18);
            }
            z8 = false;
            this.f19058l = z8;
            this.f19059m = m.I(i9, false);
            s1 s1Var3222 = this.f19055i;
            this.f19060n = s1Var3222.f20952m;
            this.f19061o = s1Var3222.f();
            this.f19063q = m.E(this.f19055i.f20949j, dVar.f18942r);
            int i19222 = this.f19055i.f20949j;
            this.f19064r = (i19222 == 0 && (i19222 & 1) == 0) ? false : true;
            int i20222 = Integer.MAX_VALUE;
            i11 = 0;
            while (true) {
                if (i11 < dVar.f18941q.size()) {
                }
                i11++;
            }
            this.f19062p = i20222;
            this.f19067u = f3.e(i9) != 128;
            this.f19068v = f3.g(i9) == 64;
            this.f19069w = m.F(this.f19055i.f20956q);
            this.f19066t = k(i9, i18);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int g(i iVar, i iVar2) {
            m4.k g7 = m4.k.j().g(iVar.f19059m, iVar2.f19059m).d(iVar.f19063q, iVar2.f19063q).g(iVar.f19064r, iVar2.f19064r).g(iVar.f19056j, iVar2.f19056j).g(iVar.f19058l, iVar2.f19058l).f(Integer.valueOf(iVar.f19062p), Integer.valueOf(iVar2.f19062p), h0.b().d()).g(iVar.f19067u, iVar2.f19067u).g(iVar.f19068v, iVar2.f19068v);
            if (iVar.f19067u && iVar.f19068v) {
                g7 = g7.d(iVar.f19069w, iVar2.f19069w);
            }
            return g7.i();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int h(i iVar, i iVar2) {
            h0 d7 = (iVar.f19056j && iVar.f19059m) ? m.f19005k : m.f19005k.d();
            return m4.k.j().f(Integer.valueOf(iVar.f19060n), Integer.valueOf(iVar2.f19060n), iVar.f19057k.B ? m.f19005k.d() : m.f19006l).f(Integer.valueOf(iVar.f19061o), Integer.valueOf(iVar2.f19061o), d7).f(Integer.valueOf(iVar.f19060n), Integer.valueOf(iVar2.f19060n), d7).i();
        }

        public static int i(List<i> list, List<i> list2) {
            return m4.k.j().f((i) Collections.max(list, new Comparator() { // from class: m2.q
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int g7;
                    g7 = m.i.g((m.i) obj, (m.i) obj2);
                    return g7;
                }
            }), (i) Collections.max(list2, new Comparator() { // from class: m2.q
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int g7;
                    g7 = m.i.g((m.i) obj, (m.i) obj2);
                    return g7;
                }
            }), new Comparator() { // from class: m2.q
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int g7;
                    g7 = m.i.g((m.i) obj, (m.i) obj2);
                    return g7;
                }
            }).d(list.size(), list2.size()).f((i) Collections.max(list, new Comparator() { // from class: m2.r
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int h7;
                    h7 = m.i.h((m.i) obj, (m.i) obj2);
                    return h7;
                }
            }), (i) Collections.max(list2, new Comparator() { // from class: m2.r
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int h7;
                    h7 = m.i.h((m.i) obj, (m.i) obj2);
                    return h7;
                }
            }), new Comparator() { // from class: m2.r
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int h7;
                    h7 = m.i.h((m.i) obj, (m.i) obj2);
                    return h7;
                }
            }).i();
        }

        public static m4.q<i> j(int i7, x0 x0Var, d dVar, int[] iArr, int i8) {
            int C = m.C(x0Var, dVar.f18938n, dVar.f18939o, dVar.f18940p);
            q.a r7 = m4.q.r();
            for (int i9 = 0; i9 < x0Var.f22259f; i9++) {
                int f7 = x0Var.b(i9).f();
                r7.a(new i(i7, x0Var, i9, dVar, iArr[i9], i8, C == Integer.MAX_VALUE || (f7 != -1 && f7 <= C)));
            }
            return r7.h();
        }

        private int k(int i7, int i8) {
            if ((this.f19055i.f20949j & 16384) != 0 || !m.I(i7, this.f19057k.S)) {
                return 0;
            }
            if (!this.f19056j && !this.f19057k.I) {
                return 0;
            }
            if (m.I(i7, false) && this.f19058l && this.f19056j && this.f19055i.f20952m != -1) {
                d dVar = this.f19057k;
                if (!dVar.C && !dVar.B && (i7 & i8) != 0) {
                    return 2;
                }
            }
            return 1;
        }

        @Override // m2.m.h
        public int b() {
            return this.f19066t;
        }

        @Override // m2.m.h
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public boolean d(i iVar) {
            return (this.f19065s || m0.c(this.f19055i.f20956q, iVar.f19055i.f20956q)) && (this.f19057k.L || (this.f19067u == iVar.f19067u && this.f19068v == iVar.f19068v));
        }
    }

    public m(Context context) {
        this(context, new a.b());
    }

    public m(Context context, a0 a0Var, t.b bVar) {
        this(a0Var, bVar, context);
    }

    public m(Context context, t.b bVar) {
        this(context, d.j(context), bVar);
    }

    private m(a0 a0Var, t.b bVar, Context context) {
        d A;
        this.f19007d = new Object();
        this.f19008e = context != null ? context.getApplicationContext() : null;
        this.f19009f = bVar;
        if (a0Var instanceof d) {
            A = (d) a0Var;
        } else {
            A = (context == null ? d.X : d.j(context)).i().b0(a0Var).A();
        }
        this.f19011h = A;
        this.f19013j = t0.e.f21706l;
        boolean z6 = context != null && m0.w0(context);
        this.f19010g = z6;
        if (!z6 && context != null && m0.f19752a >= 32) {
            this.f19012i = f.g(context);
        }
        if (this.f19011h.R && context == null) {
            o2.r.i("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    private static void A(z0 z0Var, a0 a0Var, Map<Integer, y> map) {
        y yVar;
        for (int i7 = 0; i7 < z0Var.f22275f; i7++) {
            y yVar2 = a0Var.D.get(z0Var.b(i7));
            if (yVar2 != null && ((yVar = map.get(Integer.valueOf(yVar2.b()))) == null || (yVar.f19091g.isEmpty() && !yVar2.f19091g.isEmpty()))) {
                map.put(Integer.valueOf(yVar2.b()), yVar2);
            }
        }
    }

    protected static int B(s1 s1Var, String str, boolean z6) {
        if (!TextUtils.isEmpty(str) && str.equals(s1Var.f20947h)) {
            return 4;
        }
        String Q = Q(str);
        String Q2 = Q(s1Var.f20947h);
        if (Q2 == null || Q == null) {
            return (z6 && Q2 == null) ? 1 : 0;
        }
        if (Q2.startsWith(Q) || Q.startsWith(Q2)) {
            return 3;
        }
        return m0.R0(Q2, "-")[0].equals(m0.R0(Q, "-")[0]) ? 2 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int C(x0 x0Var, int i7, int i8, boolean z6) {
        int i9;
        int i10 = Integer.MAX_VALUE;
        if (i7 != Integer.MAX_VALUE && i8 != Integer.MAX_VALUE) {
            for (int i11 = 0; i11 < x0Var.f22259f; i11++) {
                s1 b7 = x0Var.b(i11);
                int i12 = b7.f20961v;
                if (i12 > 0 && (i9 = b7.f20962w) > 0) {
                    Point D = D(z6, i7, i8, i12, i9);
                    int i13 = b7.f20961v;
                    int i14 = b7.f20962w;
                    int i15 = i13 * i14;
                    if (i13 >= ((int) (D.x * 0.98f)) && i14 >= ((int) (D.y * 0.98f)) && i15 < i10) {
                        i10 = i15;
                    }
                }
            }
        }
        return i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x000d, code lost:
    
        if ((r6 > r7) != (r4 > r5)) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static Point D(boolean z6, int i7, int i8, int i9, int i10) {
        if (z6) {
        }
        i8 = i7;
        i7 = i8;
        int i11 = i9 * i7;
        int i12 = i10 * i8;
        return i11 >= i12 ? new Point(i8, m0.l(i12, i9)) : new Point(m0.l(i11, i10), i7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int E(int i7, int i8) {
        if (i7 == 0 || i7 != i8) {
            return Integer.bitCount(i7 & i8);
        }
        return Integer.MAX_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int F(String str) {
        if (str == null) {
            return 0;
        }
        switch (str) {
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean G(s1 s1Var) {
        boolean z6;
        f fVar;
        f fVar2;
        synchronized (this.f19007d) {
            z6 = !this.f19011h.R || this.f19010g || s1Var.D <= 2 || (H(s1Var) && (m0.f19752a < 32 || (fVar2 = this.f19012i) == null || !fVar2.e())) || (m0.f19752a >= 32 && (fVar = this.f19012i) != null && fVar.e() && this.f19012i.c() && this.f19012i.d() && this.f19012i.a(this.f19013j, s1Var));
        }
        return z6;
    }

    private static boolean H(s1 s1Var) {
        String str = s1Var.f20956q;
        if (str == null) {
            return false;
        }
        str.hashCode();
        switch (str) {
        }
        return false;
    }

    protected static boolean I(int i7, boolean z6) {
        int f7 = f3.f(i7);
        return f7 == 4 || (z6 && f7 == 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List J(d dVar, boolean z6, int i7, x0 x0Var, int[] iArr) {
        return b.g(i7, x0Var, dVar, iArr, z6, new l4.k() { // from class: m2.i
            @Override // l4.k
            public final boolean apply(Object obj) {
                boolean G;
                G = m.this.G((s1) obj);
                return G;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List K(d dVar, String str, int i7, x0 x0Var, int[] iArr) {
        return g.g(i7, x0Var, dVar, iArr, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List L(d dVar, int[] iArr, int i7, x0 x0Var, int[] iArr2) {
        return i.j(i7, x0Var, dVar, iArr2, iArr[i7]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int M(Integer num, Integer num2) {
        if (num.intValue() == -1) {
            return num2.intValue() == -1 ? 0 : -1;
        }
        if (num2.intValue() == -1) {
            return 1;
        }
        return num.intValue() - num2.intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int N(Integer num, Integer num2) {
        return 0;
    }

    private static void O(v.a aVar, int[][][] iArr, h3[] h3VarArr, t[] tVarArr) {
        boolean z6;
        boolean z7 = false;
        int i7 = -1;
        int i8 = -1;
        for (int i9 = 0; i9 < aVar.d(); i9++) {
            int e7 = aVar.e(i9);
            t tVar = tVarArr[i9];
            if ((e7 == 1 || e7 == 2) && tVar != null && R(iArr[i9], aVar.f(i9), tVar)) {
                if (e7 == 1) {
                    if (i8 != -1) {
                        z6 = false;
                        break;
                    }
                    i8 = i9;
                } else {
                    if (i7 != -1) {
                        z6 = false;
                        break;
                    }
                    i7 = i9;
                }
            }
        }
        z6 = true;
        if (i8 != -1 && i7 != -1) {
            z7 = true;
        }
        if (z6 && z7) {
            h3 h3Var = new h3(true);
            h3VarArr[i8] = h3Var;
            h3VarArr[i7] = h3Var;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P() {
        boolean z6;
        f fVar;
        synchronized (this.f19007d) {
            z6 = this.f19011h.R && !this.f19010g && m0.f19752a >= 32 && (fVar = this.f19012i) != null && fVar.e();
        }
        if (z6) {
            c();
        }
    }

    protected static String Q(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    private static boolean R(int[][] iArr, z0 z0Var, t tVar) {
        if (tVar == null) {
            return false;
        }
        int c7 = z0Var.c(tVar.c());
        for (int i7 = 0; i7 < tVar.length(); i7++) {
            if (f3.h(iArr[c7][tVar.b(i7)]) != 32) {
                return false;
            }
        }
        return true;
    }

    private <T extends h<T>> Pair<t.a, Integer> W(int i7, v.a aVar, int[][][] iArr, h.a<T> aVar2, Comparator<List<T>> comparator) {
        int i8;
        RandomAccess randomAccess;
        v.a aVar3 = aVar;
        ArrayList arrayList = new ArrayList();
        int d7 = aVar.d();
        int i9 = 0;
        while (i9 < d7) {
            if (i7 == aVar3.e(i9)) {
                z0 f7 = aVar3.f(i9);
                for (int i10 = 0; i10 < f7.f22275f; i10++) {
                    x0 b7 = f7.b(i10);
                    List<T> a7 = aVar2.a(i9, b7, iArr[i9][i10]);
                    boolean[] zArr = new boolean[b7.f22259f];
                    int i11 = 0;
                    while (i11 < b7.f22259f) {
                        T t6 = a7.get(i11);
                        int b8 = t6.b();
                        if (zArr[i11] || b8 == 0) {
                            i8 = d7;
                        } else {
                            if (b8 == 1) {
                                randomAccess = m4.q.y(t6);
                                i8 = d7;
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(t6);
                                int i12 = i11 + 1;
                                while (i12 < b7.f22259f) {
                                    T t7 = a7.get(i12);
                                    int i13 = d7;
                                    if (t7.b() == 2 && t6.d(t7)) {
                                        arrayList2.add(t7);
                                        zArr[i12] = true;
                                    }
                                    i12++;
                                    d7 = i13;
                                }
                                i8 = d7;
                                randomAccess = arrayList2;
                            }
                            arrayList.add(randomAccess);
                        }
                        i11++;
                        d7 = i8;
                    }
                }
            }
            i9++;
            aVar3 = aVar;
            d7 = d7;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i14 = 0; i14 < list.size(); i14++) {
            iArr2[i14] = ((h) list.get(i14)).f19054h;
        }
        h hVar = (h) list.get(0);
        return Pair.create(new t.a(hVar.f19053g, iArr2), Integer.valueOf(hVar.f19052f));
    }

    private static void y(v.a aVar, d dVar, t.a[] aVarArr) {
        int d7 = aVar.d();
        for (int i7 = 0; i7 < d7; i7++) {
            z0 f7 = aVar.f(i7);
            if (dVar.m(i7, f7)) {
                e l7 = dVar.l(i7, f7);
                aVarArr[i7] = (l7 == null || l7.f19035g.length == 0) ? null : new t.a(f7.b(l7.f19034f), l7.f19035g, l7.f19037i);
            }
        }
    }

    private static void z(v.a aVar, a0 a0Var, t.a[] aVarArr) {
        int d7 = aVar.d();
        HashMap hashMap = new HashMap();
        for (int i7 = 0; i7 < d7; i7++) {
            A(aVar.f(i7), a0Var, hashMap);
        }
        A(aVar.h(), a0Var, hashMap);
        for (int i8 = 0; i8 < d7; i8++) {
            y yVar = (y) hashMap.get(Integer.valueOf(aVar.e(i8)));
            if (yVar != null) {
                aVarArr[i8] = (yVar.f19091g.isEmpty() || aVar.f(i8).c(yVar.f19090f) == -1) ? null : new t.a(yVar.f19090f, o4.d.k(yVar.f19091g));
            }
        }
    }

    protected t.a[] S(v.a aVar, int[][][] iArr, int[] iArr2, d dVar) {
        String str;
        int d7 = aVar.d();
        t.a[] aVarArr = new t.a[d7];
        Pair<t.a, Integer> X = X(aVar, iArr, iArr2, dVar);
        if (X != null) {
            aVarArr[((Integer) X.second).intValue()] = (t.a) X.first;
        }
        Pair<t.a, Integer> T = T(aVar, iArr, iArr2, dVar);
        if (T != null) {
            aVarArr[((Integer) T.second).intValue()] = (t.a) T.first;
        }
        if (T == null) {
            str = null;
        } else {
            Object obj = T.first;
            str = ((t.a) obj).f19075a.b(((t.a) obj).f19076b[0]).f20947h;
        }
        Pair<t.a, Integer> V = V(aVar, iArr, dVar, str);
        if (V != null) {
            aVarArr[((Integer) V.second).intValue()] = (t.a) V.first;
        }
        for (int i7 = 0; i7 < d7; i7++) {
            int e7 = aVar.e(i7);
            if (e7 != 2 && e7 != 1 && e7 != 3) {
                aVarArr[i7] = U(e7, aVar.f(i7), iArr[i7], dVar);
            }
        }
        return aVarArr;
    }

    protected Pair<t.a, Integer> T(v.a aVar, int[][][] iArr, int[] iArr2, final d dVar) {
        final boolean z6 = false;
        int i7 = 0;
        while (true) {
            if (i7 < aVar.d()) {
                if (2 == aVar.e(i7) && aVar.f(i7).f22275f > 0) {
                    z6 = true;
                    break;
                }
                i7++;
            } else {
                break;
            }
        }
        return W(1, aVar, iArr, new h.a() { // from class: m2.l
            @Override // m2.m.h.a
            public final List a(int i8, x0 x0Var, int[] iArr3) {
                List J;
                J = m.this.J(dVar, z6, i8, x0Var, iArr3);
                return J;
            }
        }, new Comparator() { // from class: m2.f
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return m.b.e((List) obj, (List) obj2);
            }
        });
    }

    protected t.a U(int i7, z0 z0Var, int[][] iArr, d dVar) {
        x0 x0Var = null;
        c cVar = null;
        int i8 = 0;
        for (int i9 = 0; i9 < z0Var.f22275f; i9++) {
            x0 b7 = z0Var.b(i9);
            int[] iArr2 = iArr[i9];
            for (int i10 = 0; i10 < b7.f22259f; i10++) {
                if (I(iArr2[i10], dVar.S)) {
                    c cVar2 = new c(b7.b(i10), iArr2[i10]);
                    if (cVar == null || cVar2.compareTo(cVar) > 0) {
                        x0Var = b7;
                        i8 = i10;
                        cVar = cVar2;
                    }
                }
            }
        }
        if (x0Var == null) {
            return null;
        }
        return new t.a(x0Var, i8);
    }

    protected Pair<t.a, Integer> V(v.a aVar, int[][][] iArr, final d dVar, final String str) {
        return W(3, aVar, iArr, new h.a() { // from class: m2.j
            @Override // m2.m.h.a
            public final List a(int i7, x0 x0Var, int[] iArr2) {
                List K;
                K = m.K(m.d.this, str, i7, x0Var, iArr2);
                return K;
            }
        }, new Comparator() { // from class: m2.g
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return m.g.e((List) obj, (List) obj2);
            }
        });
    }

    protected Pair<t.a, Integer> X(v.a aVar, int[][][] iArr, final int[] iArr2, final d dVar) {
        return W(2, aVar, iArr, new h.a() { // from class: m2.k
            @Override // m2.m.h.a
            public final List a(int i7, x0 x0Var, int[] iArr3) {
                List L;
                L = m.L(m.d.this, iArr2, i7, x0Var, iArr3);
                return L;
            }
        }, new Comparator() { // from class: m2.h
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return m.i.i((List) obj, (List) obj2);
            }
        });
    }

    @Override // m2.c0
    public boolean d() {
        return true;
    }

    @Override // m2.c0
    public void f() {
        f fVar;
        synchronized (this.f19007d) {
            if (m0.f19752a >= 32 && (fVar = this.f19012i) != null) {
                fVar.f();
            }
        }
        super.f();
    }

    @Override // m2.c0
    public void h(t0.e eVar) {
        boolean z6;
        synchronized (this.f19007d) {
            z6 = !this.f19013j.equals(eVar);
            this.f19013j = eVar;
        }
        if (z6) {
            P();
        }
    }

    @Override // m2.v
    protected final Pair<h3[], t[]> l(v.a aVar, int[][][] iArr, int[] iArr2, x.b bVar, r3 r3Var) {
        d dVar;
        f fVar;
        synchronized (this.f19007d) {
            dVar = this.f19011h;
            if (dVar.R && m0.f19752a >= 32 && (fVar = this.f19012i) != null) {
                fVar.b(this, (Looper) o2.a.h(Looper.myLooper()));
            }
        }
        int d7 = aVar.d();
        t.a[] S = S(aVar, iArr, iArr2, dVar);
        z(aVar, dVar, S);
        y(aVar, dVar, S);
        for (int i7 = 0; i7 < d7; i7++) {
            int e7 = aVar.e(i7);
            if (dVar.k(i7) || dVar.E.contains(Integer.valueOf(e7))) {
                S[i7] = null;
            }
        }
        t[] a7 = this.f19009f.a(S, a(), bVar, r3Var);
        h3[] h3VarArr = new h3[d7];
        for (int i8 = 0; i8 < d7; i8++) {
            boolean z6 = true;
            if ((dVar.k(i8) || dVar.E.contains(Integer.valueOf(aVar.e(i8)))) || (aVar.e(i8) != -2 && a7[i8] == null)) {
                z6 = false;
            }
            h3VarArr[i8] = z6 ? h3.f20676b : null;
        }
        if (dVar.T) {
            O(aVar, iArr, h3VarArr, a7);
        }
        return Pair.create(h3VarArr, a7);
    }
}
