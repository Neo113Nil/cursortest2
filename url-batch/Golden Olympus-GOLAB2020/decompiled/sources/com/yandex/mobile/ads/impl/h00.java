package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Point;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.yandex.mobile.ads.impl.C2088ma;
import com.yandex.mobile.ads.impl.InterfaceC2259tl;
import com.yandex.mobile.ads.impl.dw0;
import com.yandex.mobile.ads.impl.h00;
import com.yandex.mobile.ads.impl.kt0;
import com.yandex.mobile.ads.impl.sj0;
import com.yandex.mobile.ads.impl.t52;
import com.yandex.mobile.ads.impl.x60;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public final class h00 extends kt0 {

    /* renamed from: i, reason: collision with root package name */
    private static final bf1<Integer> f26409i = bf1.a(new Comparator() { // from class: com.yandex.mobile.ads.impl.E4
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int a4;
            a4 = h00.a((Integer) obj, (Integer) obj2);
            return a4;
        }
    });

    /* renamed from: j, reason: collision with root package name */
    private static final bf1<Integer> f26410j = bf1.a(new Comparator() { // from class: com.yandex.mobile.ads.impl.F4
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int b4;
            b4 = h00.b((Integer) obj, (Integer) obj2);
            return b4;
        }
    });

    /* renamed from: c, reason: collision with root package name */
    private final Object f26411c;

    /* renamed from: d, reason: collision with root package name */
    private final x60.b f26412d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f26413e;

    /* renamed from: f, reason: collision with root package name */
    private c f26414f;

    /* renamed from: g, reason: collision with root package name */
    private e f26415g;

    /* renamed from: h, reason: collision with root package name */
    private C1856ch f26416h;

    /* JADX INFO: Access modifiers changed from: private */
    static final class a extends g<a> implements Comparable<a> {

        /* renamed from: f, reason: collision with root package name */
        private final int f26417f;

        /* renamed from: g, reason: collision with root package name */
        private final boolean f26418g;

        /* renamed from: h, reason: collision with root package name */
        private final String f26419h;

        /* renamed from: i, reason: collision with root package name */
        private final c f26420i;

        /* renamed from: j, reason: collision with root package name */
        private final boolean f26421j;

        /* renamed from: k, reason: collision with root package name */
        private final int f26422k;

        /* renamed from: l, reason: collision with root package name */
        private final int f26423l;

        /* renamed from: m, reason: collision with root package name */
        private final int f26424m;

        /* renamed from: n, reason: collision with root package name */
        private final boolean f26425n;

        /* renamed from: o, reason: collision with root package name */
        private final int f26426o;

        /* renamed from: p, reason: collision with root package name */
        private final int f26427p;

        /* renamed from: q, reason: collision with root package name */
        private final boolean f26428q;

        /* renamed from: r, reason: collision with root package name */
        private final int f26429r;

        /* renamed from: s, reason: collision with root package name */
        private final int f26430s;

        /* renamed from: t, reason: collision with root package name */
        private final int f26431t;

        /* renamed from: u, reason: collision with root package name */
        private final int f26432u;

        /* renamed from: v, reason: collision with root package name */
        private final boolean f26433v;

        /* renamed from: w, reason: collision with root package name */
        private final boolean f26434w;

        public a(int i4, n52 n52Var, int i5, c cVar, int i6, boolean z4, oj1<yb0> oj1Var) {
            super(i4, i5, n52Var);
            int i7;
            int i8;
            int i9;
            this.f26420i = cVar;
            this.f26419h = h00.b(this.f26489e.f34982d);
            this.f26421j = h00.a(false, i6);
            int i10 = 0;
            while (true) {
                i7 = Integer.MAX_VALUE;
                if (i10 >= cVar.f32186o.size()) {
                    i8 = 0;
                    i10 = Integer.MAX_VALUE;
                    break;
                } else {
                    i8 = h00.a(this.f26489e, cVar.f32186o.get(i10), false);
                    if (i8 > 0) {
                        break;
                    } else {
                        i10++;
                    }
                }
            }
            this.f26423l = i10;
            this.f26422k = i8;
            this.f26424m = h00.a(this.f26489e.f34984f, cVar.f32187p);
            yb0 yb0Var = this.f26489e;
            int i11 = yb0Var.f34984f;
            this.f26425n = i11 == 0 || (i11 & 1) != 0;
            this.f26428q = (yb0Var.f34983e & 1) != 0;
            int i12 = yb0Var.f35004z;
            this.f26429r = i12;
            this.f26430s = yb0Var.f34973A;
            int i13 = yb0Var.f34987i;
            this.f26431t = i13;
            this.f26418g = (i13 == -1 || i13 <= cVar.f32189r) && (i12 == -1 || i12 <= cVar.f32188q) && oj1Var.apply(yb0Var);
            String[] d4 = u82.d();
            int i14 = 0;
            while (true) {
                if (i14 >= d4.length) {
                    i9 = 0;
                    i14 = Integer.MAX_VALUE;
                    break;
                } else {
                    i9 = h00.a(this.f26489e, d4[i14], false);
                    if (i9 > 0) {
                        break;
                    } else {
                        i14++;
                    }
                }
            }
            this.f26426o = i14;
            this.f26427p = i9;
            int i15 = 0;
            while (true) {
                if (i15 < cVar.f32190s.size()) {
                    String str = this.f26489e.f34991m;
                    if (str != null && str.equals(cVar.f32190s.get(i15))) {
                        i7 = i15;
                        break;
                    }
                    i15++;
                } else {
                    break;
                }
            }
            this.f26432u = i7;
            this.f26433v = to1.a(i6) == 128;
            this.f26434w = to1.b(i6) == 64;
            this.f26417f = a(z4, i6);
        }

        public static int a(List<a> list, List<a> list2) {
            return ((a) Collections.max(list)).compareTo((a) Collections.max(list2));
        }

        @Override // java.lang.Comparable
        /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final int compareTo(a aVar) {
            bf1 b4 = (this.f26418g && this.f26421j) ? h00.f26409i : h00.f26409i.b();
            lq a4 = lq.b().a(this.f26421j, aVar.f26421j).a(Integer.valueOf(this.f26423l), Integer.valueOf(aVar.f26423l), bf1.a().b()).a(this.f26422k, aVar.f26422k).a(this.f26424m, aVar.f26424m).a(this.f26428q, aVar.f26428q).a(this.f26425n, aVar.f26425n).a(Integer.valueOf(this.f26426o), Integer.valueOf(aVar.f26426o), bf1.a().b()).a(this.f26427p, aVar.f26427p).a(this.f26418g, aVar.f26418g).a(Integer.valueOf(this.f26432u), Integer.valueOf(aVar.f26432u), bf1.a().b()).a(Integer.valueOf(this.f26431t), Integer.valueOf(aVar.f26431t), this.f26420i.f32195x ? h00.f26409i.b() : h00.f26410j).a(this.f26433v, aVar.f26433v).a(this.f26434w, aVar.f26434w).a(Integer.valueOf(this.f26429r), Integer.valueOf(aVar.f26429r), b4).a(Integer.valueOf(this.f26430s), Integer.valueOf(aVar.f26430s), b4);
            Integer valueOf = Integer.valueOf(this.f26431t);
            Integer valueOf2 = Integer.valueOf(aVar.f26431t);
            if (!u82.a(this.f26419h, aVar.f26419h)) {
                b4 = h00.f26410j;
            }
            return a4.a(valueOf, valueOf2, b4).a();
        }

        private int a(boolean z4, int i4) {
            if (!h00.a(this.f26420i.f26448M, i4)) {
                return 0;
            }
            if (!this.f26418g && !this.f26420i.f26442G) {
                return 0;
            }
            if (!h00.a(false, i4) || !this.f26418g || this.f26489e.f34987i == -1) {
                return 1;
            }
            c cVar = this.f26420i;
            if (cVar.f32196y || cVar.f32195x) {
                return 1;
            }
            return (cVar.f26450O || !z4) ? 2 : 1;
        }

        @Override // com.yandex.mobile.ads.impl.h00.g
        public final int a() {
            return this.f26417f;
        }

        @Override // com.yandex.mobile.ads.impl.h00.g
        public final boolean a(a aVar) {
            int i4;
            String str;
            int i5;
            a aVar2 = aVar;
            c cVar = this.f26420i;
            if (!cVar.f26445J && ((i5 = this.f26489e.f35004z) == -1 || i5 != aVar2.f26489e.f35004z)) {
                return false;
            }
            if (!cVar.f26443H && ((str = this.f26489e.f34991m) == null || !TextUtils.equals(str, aVar2.f26489e.f34991m))) {
                return false;
            }
            c cVar2 = this.f26420i;
            if (!cVar2.f26444I && ((i4 = this.f26489e.f34973A) == -1 || i4 != aVar2.f26489e.f34973A)) {
                return false;
            }
            if (cVar2.f26446K) {
                return true;
            }
            return this.f26433v == aVar2.f26433v && this.f26434w == aVar2.f26434w;
        }
    }

    private static final class b implements Comparable<b> {

        /* renamed from: b, reason: collision with root package name */
        private final boolean f26435b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f26436c;

        public b(yb0 yb0Var, int i4) {
            this.f26435b = (yb0Var.f34983e & 1) != 0;
            this.f26436c = h00.a(false, i4);
        }

        @Override // java.lang.Comparable
        public final int compareTo(b bVar) {
            b bVar2 = bVar;
            return lq.b().a(this.f26436c, bVar2.f26436c).a(this.f26435b, bVar2.f26435b).a();
        }
    }

    public static final class c extends t52 {

        /* renamed from: R, reason: collision with root package name */
        public static final c f26437R = new c(new a());

        /* renamed from: C, reason: collision with root package name */
        public final boolean f26438C;

        /* renamed from: D, reason: collision with root package name */
        public final boolean f26439D;

        /* renamed from: E, reason: collision with root package name */
        public final boolean f26440E;

        /* renamed from: F, reason: collision with root package name */
        public final boolean f26441F;

        /* renamed from: G, reason: collision with root package name */
        public final boolean f26442G;

        /* renamed from: H, reason: collision with root package name */
        public final boolean f26443H;

        /* renamed from: I, reason: collision with root package name */
        public final boolean f26444I;

        /* renamed from: J, reason: collision with root package name */
        public final boolean f26445J;

        /* renamed from: K, reason: collision with root package name */
        public final boolean f26446K;

        /* renamed from: L, reason: collision with root package name */
        public final boolean f26447L;

        /* renamed from: M, reason: collision with root package name */
        public final boolean f26448M;

        /* renamed from: N, reason: collision with root package name */
        public final boolean f26449N;

        /* renamed from: O, reason: collision with root package name */
        public final boolean f26450O;

        /* renamed from: P, reason: collision with root package name */
        private final SparseArray<Map<o52, d>> f26451P;

        /* renamed from: Q, reason: collision with root package name */
        private final SparseBooleanArray f26452Q;

        public static final class a extends t52.a {

            /* renamed from: A, reason: collision with root package name */
            private boolean f26453A;

            /* renamed from: B, reason: collision with root package name */
            private boolean f26454B;

            /* renamed from: C, reason: collision with root package name */
            private boolean f26455C;

            /* renamed from: D, reason: collision with root package name */
            private boolean f26456D;

            /* renamed from: E, reason: collision with root package name */
            private boolean f26457E;

            /* renamed from: F, reason: collision with root package name */
            private boolean f26458F;

            /* renamed from: G, reason: collision with root package name */
            private boolean f26459G;

            /* renamed from: H, reason: collision with root package name */
            private boolean f26460H;

            /* renamed from: I, reason: collision with root package name */
            private boolean f26461I;

            /* renamed from: J, reason: collision with root package name */
            private boolean f26462J;

            /* renamed from: K, reason: collision with root package name */
            private boolean f26463K;

            /* renamed from: L, reason: collision with root package name */
            private boolean f26464L;

            /* renamed from: M, reason: collision with root package name */
            private boolean f26465M;

            /* renamed from: N, reason: collision with root package name */
            private final SparseArray<Map<o52, d>> f26466N;

            /* renamed from: O, reason: collision with root package name */
            private final SparseBooleanArray f26467O;

            private void a() {
                this.f26453A = true;
                this.f26454B = false;
                this.f26455C = true;
                this.f26456D = false;
                this.f26457E = true;
                this.f26458F = false;
                this.f26459G = false;
                this.f26460H = false;
                this.f26461I = false;
                this.f26462J = true;
                this.f26463K = true;
                this.f26464L = false;
                this.f26465M = true;
            }

            public final void b(boolean z4) {
                this.f26461I = z4;
            }

            public final void c(boolean z4) {
                this.f26458F = z4;
            }

            public final void d(boolean z4) {
                this.f26459G = z4;
            }

            public final void e(boolean z4) {
                this.f26465M = z4;
            }

            public final void f(boolean z4) {
                this.f26456D = z4;
            }

            public final void g(boolean z4) {
                this.f26454B = z4;
            }

            public final void h(boolean z4) {
                this.f26455C = z4;
            }

            public final void i(boolean z4) {
                this.f26462J = z4;
            }

            public final void j(boolean z4) {
                this.f26457E = z4;
            }

            public final void k(boolean z4) {
                this.f26463K = z4;
            }

            public final void l(boolean z4) {
                this.f26453A = z4;
            }

            public final void m(boolean z4) {
                this.f26464L = z4;
            }

            @Deprecated
            public a() {
                this.f26466N = new SparseArray<>();
                this.f26467O = new SparseBooleanArray();
                a();
            }

            @Override // com.yandex.mobile.ads.impl.t52.a
            public final void b(Context context) {
                Point c4 = u82.c(context);
                super.a(c4.x, c4.y);
            }

            public a(Context context) {
                super(context);
                this.f26466N = new SparseArray<>();
                this.f26467O = new SparseBooleanArray();
                a();
            }

            private a(Bundle bundle) {
                super(bundle);
                a();
                c cVar = c.f26437R;
                l(bundle.getBoolean(t52.a(1000), cVar.f26438C));
                g(bundle.getBoolean(t52.a(1001), cVar.f26439D));
                h(bundle.getBoolean(t52.a(1002), cVar.f26440E));
                f(bundle.getBoolean(t52.a(com.ironsource.d9.f15849j), cVar.f26441F));
                j(bundle.getBoolean(t52.a(1003), cVar.f26442G));
                c(bundle.getBoolean(t52.a(1004), cVar.f26443H));
                d(bundle.getBoolean(t52.a(1005), cVar.f26444I));
                a(bundle.getBoolean(t52.a(1006), cVar.f26445J));
                b(bundle.getBoolean(t52.a(1015), cVar.f26446K));
                i(bundle.getBoolean(t52.a(com.ironsource.d9.f15851l), cVar.f26447L));
                k(bundle.getBoolean(t52.a(1007), cVar.f26448M));
                m(bundle.getBoolean(t52.a(1008), cVar.f26449N));
                e(bundle.getBoolean(t52.a(1009), cVar.f26450O));
                this.f26466N = new SparseArray<>();
                a(bundle);
                this.f26467O = a(bundle.getIntArray(t52.a(com.ironsource.d9.f15848i)));
            }

            private static SparseBooleanArray a(int[] iArr) {
                if (iArr == null) {
                    return new SparseBooleanArray();
                }
                SparseBooleanArray sparseBooleanArray = new SparseBooleanArray(iArr.length);
                for (int i4 : iArr) {
                    sparseBooleanArray.append(i4, true);
                }
                return sparseBooleanArray;
            }

            public final void a(boolean z4) {
                this.f26460H = z4;
            }

            @Override // com.yandex.mobile.ads.impl.t52.a
            public final void a(Context context) {
                super.a(context);
            }

            /* JADX WARN: Multi-variable type inference failed */
            private void a(Bundle bundle) {
                sj0 a4;
                SparseArray sparseArray;
                int[] intArray = bundle.getIntArray(Integer.toString(1010, 36));
                ArrayList parcelableArrayList = bundle.getParcelableArrayList(Integer.toString(1011, 36));
                if (parcelableArrayList == null) {
                    a4 = sj0.h();
                } else {
                    a4 = C2282ul.a(o52.f29911f, parcelableArrayList);
                }
                SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(Integer.toString(1012, 36));
                if (sparseParcelableArray == null) {
                    sparseArray = new SparseArray();
                } else {
                    InterfaceC2259tl.a<d> aVar = d.f26468e;
                    SparseArray sparseArray2 = new SparseArray(sparseParcelableArray.size());
                    for (int i4 = 0; i4 < sparseParcelableArray.size(); i4++) {
                        sparseArray2.put(sparseParcelableArray.keyAt(i4), aVar.fromBundle((Bundle) sparseParcelableArray.valueAt(i4)));
                    }
                    sparseArray = sparseArray2;
                }
                if (intArray == null || intArray.length != a4.size()) {
                    return;
                }
                for (int i5 = 0; i5 < intArray.length; i5++) {
                    int i6 = intArray[i5];
                    o52 o52Var = (o52) a4.get(i5);
                    d dVar = (d) sparseArray.get(i5);
                    Map<o52, d> map = this.f26466N.get(i6);
                    if (map == null) {
                        map = new HashMap<>();
                        this.f26466N.put(i6, map);
                    }
                    if (!map.containsKey(o52Var) || !u82.a(map.get(o52Var), dVar)) {
                        map.put(o52Var, dVar);
                    }
                }
            }

            @Override // com.yandex.mobile.ads.impl.t52.a
            public final t52.a a(int i4, int i5) {
                super.a(i4, i5);
                return this;
            }
        }

        static {
            new InterfaceC2259tl.a() { // from class: com.yandex.mobile.ads.impl.I4
                @Override // com.yandex.mobile.ads.impl.InterfaceC2259tl.a
                public final InterfaceC2259tl fromBundle(Bundle bundle) {
                    h00.c b4;
                    b4 = h00.c.b(bundle);
                    return b4;
                }
            };
        }

        private c(a aVar) {
            super(aVar);
            this.f26438C = aVar.f26453A;
            this.f26439D = aVar.f26454B;
            this.f26440E = aVar.f26455C;
            this.f26441F = aVar.f26456D;
            this.f26442G = aVar.f26457E;
            this.f26443H = aVar.f26458F;
            this.f26444I = aVar.f26459G;
            this.f26445J = aVar.f26460H;
            this.f26446K = aVar.f26461I;
            this.f26447L = aVar.f26462J;
            this.f26448M = aVar.f26463K;
            this.f26449N = aVar.f26464L;
            this.f26450O = aVar.f26465M;
            this.f26451P = aVar.f26466N;
            this.f26452Q = aVar.f26467O;
        }

        public static c a(Context context) {
            return new c(new a(context));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static c b(Bundle bundle) {
            return new c(new a(bundle));
        }

        @Override // com.yandex.mobile.ads.impl.t52
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && c.class == obj.getClass()) {
                c cVar = (c) obj;
                if (super.equals(cVar) && this.f26438C == cVar.f26438C && this.f26439D == cVar.f26439D && this.f26440E == cVar.f26440E && this.f26441F == cVar.f26441F && this.f26442G == cVar.f26442G && this.f26443H == cVar.f26443H && this.f26444I == cVar.f26444I && this.f26445J == cVar.f26445J && this.f26446K == cVar.f26446K && this.f26447L == cVar.f26447L && this.f26448M == cVar.f26448M && this.f26449N == cVar.f26449N && this.f26450O == cVar.f26450O) {
                    SparseBooleanArray sparseBooleanArray = this.f26452Q;
                    SparseBooleanArray sparseBooleanArray2 = cVar.f26452Q;
                    int size = sparseBooleanArray.size();
                    if (sparseBooleanArray2.size() == size) {
                        int i4 = 0;
                        while (true) {
                            if (i4 >= size) {
                                SparseArray<Map<o52, d>> sparseArray = this.f26451P;
                                SparseArray<Map<o52, d>> sparseArray2 = cVar.f26451P;
                                int size2 = sparseArray.size();
                                if (sparseArray2.size() == size2) {
                                    for (int i5 = 0; i5 < size2; i5++) {
                                        int indexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i5));
                                        if (indexOfKey >= 0) {
                                            Map<o52, d> valueAt = sparseArray.valueAt(i5);
                                            Map<o52, d> valueAt2 = sparseArray2.valueAt(indexOfKey);
                                            if (valueAt2.size() == valueAt.size()) {
                                                for (Map.Entry<o52, d> entry : valueAt.entrySet()) {
                                                    o52 key = entry.getKey();
                                                    if (valueAt2.containsKey(key) && u82.a(entry.getValue(), valueAt2.get(key))) {
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    return true;
                                }
                            } else {
                                if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i4)) < 0) {
                                    break;
                                }
                                i4++;
                            }
                        }
                    }
                }
            }
            return false;
        }

        @Override // com.yandex.mobile.ads.impl.t52
        public final int hashCode() {
            return ((((((((((((((((((((((((((super.hashCode() + 31) * 31) + (this.f26438C ? 1 : 0)) * 31) + (this.f26439D ? 1 : 0)) * 31) + (this.f26440E ? 1 : 0)) * 31) + (this.f26441F ? 1 : 0)) * 31) + (this.f26442G ? 1 : 0)) * 31) + (this.f26443H ? 1 : 0)) * 31) + (this.f26444I ? 1 : 0)) * 31) + (this.f26445J ? 1 : 0)) * 31) + (this.f26446K ? 1 : 0)) * 31) + (this.f26447L ? 1 : 0)) * 31) + (this.f26448M ? 1 : 0)) * 31) + (this.f26449N ? 1 : 0)) * 31) + (this.f26450O ? 1 : 0);
        }
    }

    public static final class d implements InterfaceC2259tl {

        /* renamed from: e, reason: collision with root package name */
        public static final InterfaceC2259tl.a<d> f26468e = new InterfaceC2259tl.a() { // from class: com.yandex.mobile.ads.impl.J4
            @Override // com.yandex.mobile.ads.impl.InterfaceC2259tl.a
            public final InterfaceC2259tl fromBundle(Bundle bundle) {
                h00.d a4;
                a4 = h00.d.a(bundle);
                return a4;
            }
        };

        /* renamed from: b, reason: collision with root package name */
        public final int f26469b;

        /* renamed from: c, reason: collision with root package name */
        public final int[] f26470c;

        /* renamed from: d, reason: collision with root package name */
        public final int f26471d;

        public d(int i4, int i5, int[] iArr) {
            this.f26469b = i4;
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            this.f26470c = copyOf;
            this.f26471d = i5;
            Arrays.sort(copyOf);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static d a(Bundle bundle) {
            int i4 = bundle.getInt(Integer.toString(0, 36), -1);
            int[] intArray = bundle.getIntArray(Integer.toString(1, 36));
            int i5 = bundle.getInt(Integer.toString(2, 36), -1);
            if (i4 < 0 || i5 < 0) {
                throw new IllegalArgumentException();
            }
            intArray.getClass();
            return new d(i4, i5, intArray);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && d.class == obj.getClass()) {
                d dVar = (d) obj;
                if (this.f26469b == dVar.f26469b && Arrays.equals(this.f26470c, dVar.f26470c) && this.f26471d == dVar.f26471d) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return ((Arrays.hashCode(this.f26470c) + (this.f26469b * 31)) * 31) + this.f26471d;
        }
    }

    private static class e {

        /* renamed from: a, reason: collision with root package name */
        private final Spatializer f26472a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f26473b;

        /* renamed from: c, reason: collision with root package name */
        private Handler f26474c;

        /* renamed from: d, reason: collision with root package name */
        private Spatializer$OnSpatializerStateChangedListener f26475d;

        final class a implements Spatializer$OnSpatializerStateChangedListener {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ h00 f26476a;

            a(h00 h00Var) {
                this.f26476a = h00Var;
            }

            public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z4) {
                this.f26476a.e();
            }

            public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z4) {
                this.f26476a.e();
            }
        }

        private e(Spatializer spatializer) {
            int immersiveAudioLevel;
            this.f26472a = spatializer;
            immersiveAudioLevel = spatializer.getImmersiveAudioLevel();
            this.f26473b = immersiveAudioLevel != 0;
        }

        public final boolean b() {
            boolean isEnabled;
            isEnabled = this.f26472a.isEnabled();
            return isEnabled;
        }

        public final void c() {
            Spatializer$OnSpatializerStateChangedListener spatializer$OnSpatializerStateChangedListener = this.f26475d;
            if (spatializer$OnSpatializerStateChangedListener == null || this.f26474c == null) {
                return;
            }
            this.f26472a.removeOnSpatializerStateChangedListener(spatializer$OnSpatializerStateChangedListener);
            Handler handler = this.f26474c;
            int i4 = u82.f32873a;
            handler.removeCallbacksAndMessages(null);
            this.f26474c = null;
            this.f26475d = null;
        }

        public final boolean a(yb0 yb0Var, C1856ch c1856ch) {
            boolean canBeSpatialized;
            AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(u82.a(("audio/eac3-joc".equals(yb0Var.f34991m) && yb0Var.f35004z == 16) ? 12 : yb0Var.f35004z));
            int i4 = yb0Var.f34973A;
            if (i4 != -1) {
                channelMask.setSampleRate(i4);
            }
            canBeSpatialized = this.f26472a.canBeSpatialized(c1856ch.a().f24214a, channelMask.build());
            return canBeSpatialized;
        }

        public final void a(h00 h00Var, Looper looper) {
            if (this.f26475d == null && this.f26474c == null) {
                this.f26475d = new a(h00Var);
                Handler handler = new Handler(looper);
                this.f26474c = handler;
                this.f26472a.addOnSpatializerStateChangedListener(new com.my.tracker.obfuscated.Z2(handler), this.f26475d);
            }
        }

        public final boolean a() {
            boolean isAvailable;
            isAvailable = this.f26472a.isAvailable();
            return isAvailable;
        }

        public static e a(Context context) {
            Spatializer spatializer;
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            if (audioManager == null) {
                return null;
            }
            spatializer = audioManager.getSpatializer();
            return new e(spatializer);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class f extends g<f> implements Comparable<f> {

        /* renamed from: f, reason: collision with root package name */
        private final int f26477f;

        /* renamed from: g, reason: collision with root package name */
        private final boolean f26478g;

        /* renamed from: h, reason: collision with root package name */
        private final boolean f26479h;

        /* renamed from: i, reason: collision with root package name */
        private final boolean f26480i;

        /* renamed from: j, reason: collision with root package name */
        private final int f26481j;

        /* renamed from: k, reason: collision with root package name */
        private final int f26482k;

        /* renamed from: l, reason: collision with root package name */
        private final int f26483l;

        /* renamed from: m, reason: collision with root package name */
        private final int f26484m;

        /* renamed from: n, reason: collision with root package name */
        private final boolean f26485n;

        public f(int i4, n52 n52Var, int i5, c cVar, int i6, String str) {
            super(i4, i5, n52Var);
            int i7;
            int i8 = 0;
            this.f26478g = h00.a(false, i6);
            int i9 = this.f26489e.f34983e & (~cVar.f32193v);
            this.f26479h = (i9 & 1) != 0;
            this.f26480i = (i9 & 2) != 0;
            sj0<String> a4 = cVar.f32191t.isEmpty() ? sj0.a("") : cVar.f32191t;
            int i10 = 0;
            while (true) {
                if (i10 >= a4.size()) {
                    i10 = Integer.MAX_VALUE;
                    i7 = 0;
                    break;
                } else {
                    i7 = h00.a(this.f26489e, a4.get(i10), cVar.f32194w);
                    if (i7 > 0) {
                        break;
                    } else {
                        i10++;
                    }
                }
            }
            this.f26481j = i10;
            this.f26482k = i7;
            int a5 = h00.a(this.f26489e.f34984f, cVar.f32192u);
            this.f26483l = a5;
            this.f26485n = (this.f26489e.f34984f & 1088) != 0;
            int a6 = h00.a(this.f26489e, str, h00.b(str) == null);
            this.f26484m = a6;
            boolean z4 = i7 > 0 || (cVar.f32191t.isEmpty() && a5 > 0) || this.f26479h || (this.f26480i && a6 > 0);
            if (h00.a(cVar.f26448M, i6) && z4) {
                i8 = 1;
            }
            this.f26477f = i8;
        }

        public static int a(List<f> list, List<f> list2) {
            return list.get(0).compareTo(list2.get(0));
        }

        @Override // java.lang.Comparable
        /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final int compareTo(f fVar) {
            lq a4 = lq.b().a(this.f26478g, fVar.f26478g).a(Integer.valueOf(this.f26481j), Integer.valueOf(fVar.f26481j), bf1.a().b()).a(this.f26482k, fVar.f26482k).a(this.f26483l, fVar.f26483l).a(this.f26479h, fVar.f26479h).a(Boolean.valueOf(this.f26480i), Boolean.valueOf(fVar.f26480i), this.f26482k == 0 ? bf1.a() : bf1.a().b()).a(this.f26484m, fVar.f26484m);
            if (this.f26483l == 0) {
                a4 = a4.b(this.f26485n, fVar.f26485n);
            }
            return a4.a();
        }

        @Override // com.yandex.mobile.ads.impl.h00.g
        public final int a() {
            return this.f26477f;
        }

        @Override // com.yandex.mobile.ads.impl.h00.g
        public final /* bridge */ /* synthetic */ boolean a(f fVar) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static abstract class g<T extends g<T>> {

        /* renamed from: b, reason: collision with root package name */
        public final int f26486b;

        /* renamed from: c, reason: collision with root package name */
        public final n52 f26487c;

        /* renamed from: d, reason: collision with root package name */
        public final int f26488d;

        /* renamed from: e, reason: collision with root package name */
        public final yb0 f26489e;

        public interface a<T extends g<T>> {
            List<T> a(int i4, n52 n52Var, int[] iArr);
        }

        public g(int i4, int i5, n52 n52Var) {
            this.f26486b = i4;
            this.f26487c = n52Var;
            this.f26488d = i5;
            this.f26489e = n52Var.a(i5);
        }

        public abstract int a();

        public abstract boolean a(T t4);
    }

    public h00(Context context, c cVar, C2088ma.b bVar) {
        this(cVar, bVar, context);
    }

    protected static boolean a(boolean z4, int i4) {
        int i5 = i4 & 7;
        if (i5 != 4) {
            return z4 && i5 == 3;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int b(Integer num, Integer num2) {
        return 0;
    }

    @Override // com.yandex.mobile.ads.impl.u52
    public final void d() {
        e eVar;
        synchronized (this.f26411c) {
            try {
                if (u82.f32873a >= 32 && (eVar = this.f26415g) != null) {
                    eVar.c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        super.d();
    }

    private h00(c cVar, C2088ma.b bVar, Context context) {
        this.f26411c = new Object();
        if (context != null) {
            context.getApplicationContext();
        }
        this.f26412d = bVar;
        this.f26414f = cVar;
        this.f26416h = C1856ch.f24207h;
        boolean z4 = context != null && u82.d(context);
        this.f26413e = z4;
        if (!z4 && context != null && u82.f32873a >= 32) {
            this.f26415g = e.a(context);
        }
        if (this.f26414f.f26447L && context == null) {
            ms0.d("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    private static void a(o52 o52Var, c cVar, HashMap hashMap) {
        s52 s52Var;
        for (int i4 = 0; i4 < o52Var.f29912b; i4++) {
            s52 s52Var2 = cVar.f32197z.get(o52Var.a(i4));
            if (s52Var2 != null && ((s52Var = (s52) hashMap.get(Integer.valueOf(s52Var2.f31589b.f29450d))) == null || (s52Var.f31590c.isEmpty() && !s52Var2.f31590c.isEmpty()))) {
                hashMap.put(Integer.valueOf(s52Var2.f31589b.f29450d), s52Var2);
            }
        }
    }

    protected static String b(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        boolean z4;
        e eVar;
        synchronized (this.f26411c) {
            try {
                z4 = this.f26414f.f26447L && !this.f26413e && u82.f32873a >= 32 && (eVar = this.f26415g) != null && eVar.f26473b;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z4) {
            b();
        }
    }

    protected static int a(yb0 yb0Var, String str, boolean z4) {
        if (!TextUtils.isEmpty(str) && str.equals(yb0Var.f34982d)) {
            return 4;
        }
        String b4 = b(str);
        String b5 = b(yb0Var.f34982d);
        if (b5 == null || b4 == null) {
            return (z4 && b5 == null) ? 1 : 0;
        }
        if (b5.startsWith(b4) || b4.startsWith(b5)) {
            return 3;
        }
        int i4 = u82.f32873a;
        return b5.split("-", 2)[0].equals(b4.split("-", 2)[0]) ? 2 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class h extends g<h> {

        /* renamed from: f, reason: collision with root package name */
        private final boolean f26490f;

        /* renamed from: g, reason: collision with root package name */
        private final c f26491g;

        /* renamed from: h, reason: collision with root package name */
        private final boolean f26492h;

        /* renamed from: i, reason: collision with root package name */
        private final boolean f26493i;

        /* renamed from: j, reason: collision with root package name */
        private final int f26494j;

        /* renamed from: k, reason: collision with root package name */
        private final int f26495k;

        /* renamed from: l, reason: collision with root package name */
        private final int f26496l;

        /* renamed from: m, reason: collision with root package name */
        private final int f26497m;

        /* renamed from: n, reason: collision with root package name */
        private final boolean f26498n;

        /* renamed from: o, reason: collision with root package name */
        private final boolean f26499o;

        /* renamed from: p, reason: collision with root package name */
        private final int f26500p;

        /* renamed from: q, reason: collision with root package name */
        private final boolean f26501q;

        /* renamed from: r, reason: collision with root package name */
        private final boolean f26502r;

        /* renamed from: s, reason: collision with root package name */
        private final int f26503s;

        /* JADX WARN: Removed duplicated region for block: B:49:0x00a0  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x00b2  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x00d5  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x00e2  */
        /* JADX WARN: Removed duplicated region for block: B:69:0x00d7  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x00c8 A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public h(int i4, n52 n52Var, int i5, c cVar, int i6, int i7, boolean z4) {
            super(i4, i5, n52Var);
            boolean z5;
            boolean z6;
            int i8;
            yb0 yb0Var;
            int i9;
            int i10;
            float f4;
            int i11;
            yb0 yb0Var2;
            int i12;
            int i13;
            int i14;
            this.f26491g = cVar;
            int i15 = cVar.f26440E ? 24 : 16;
            this.f26499o = cVar.f26439D && (i7 & i15) != 0;
            if (z4 && (((i12 = (yb0Var2 = this.f26489e).f34996r) == -1 || i12 <= cVar.f32173b) && ((i13 = yb0Var2.f34997s) == -1 || i13 <= cVar.f32174c))) {
                float f5 = yb0Var2.f34998t;
                if ((f5 == -1.0f || f5 <= cVar.f32175d) && ((i14 = yb0Var2.f34987i) == -1 || i14 <= cVar.f32176e)) {
                    z5 = true;
                    this.f26490f = z5;
                    if (z4 && (((i9 = (yb0Var = this.f26489e).f34996r) == -1 || i9 >= cVar.f32177f) && ((i10 = yb0Var.f34997s) == -1 || i10 >= cVar.f32178g))) {
                        f4 = yb0Var.f34998t;
                        if ((f4 != -1.0f || f4 >= cVar.f32179h) && ((i11 = yb0Var.f34987i) == -1 || i11 >= cVar.f32180i)) {
                            z6 = true;
                            this.f26492h = z6;
                            this.f26493i = h00.a(false, i6);
                            yb0 yb0Var3 = this.f26489e;
                            this.f26494j = yb0Var3.f34987i;
                            this.f26495k = yb0Var3.b();
                            this.f26497m = h00.a(this.f26489e.f34984f, cVar.f32185n);
                            int i16 = this.f26489e.f34984f;
                            this.f26498n = (i16 == 0 && (i16 & 1) == 0) ? false : true;
                            i8 = 0;
                            while (true) {
                                if (i8 < cVar.f32184m.size()) {
                                    i8 = Integer.MAX_VALUE;
                                    break;
                                }
                                String str = this.f26489e.f34991m;
                                if (str != null && str.equals(cVar.f32184m.get(i8))) {
                                    break;
                                } else {
                                    i8++;
                                }
                            }
                            this.f26496l = i8;
                            this.f26501q = to1.a(i6) != 128;
                            this.f26502r = to1.b(i6) == 64;
                            this.f26503s = h00.a(this.f26489e.f34991m);
                            this.f26500p = a(i6, i15);
                        }
                    }
                    z6 = false;
                    this.f26492h = z6;
                    this.f26493i = h00.a(false, i6);
                    yb0 yb0Var32 = this.f26489e;
                    this.f26494j = yb0Var32.f34987i;
                    this.f26495k = yb0Var32.b();
                    this.f26497m = h00.a(this.f26489e.f34984f, cVar.f32185n);
                    int i162 = this.f26489e.f34984f;
                    this.f26498n = (i162 == 0 && (i162 & 1) == 0) ? false : true;
                    i8 = 0;
                    while (true) {
                        if (i8 < cVar.f32184m.size()) {
                        }
                        i8++;
                    }
                    this.f26496l = i8;
                    this.f26501q = to1.a(i6) != 128;
                    this.f26502r = to1.b(i6) == 64;
                    this.f26503s = h00.a(this.f26489e.f34991m);
                    this.f26500p = a(i6, i15);
                }
            }
            z5 = false;
            this.f26490f = z5;
            if (z4) {
                f4 = yb0Var.f34998t;
                if (f4 != -1.0f) {
                }
                z6 = true;
                this.f26492h = z6;
                this.f26493i = h00.a(false, i6);
                yb0 yb0Var322 = this.f26489e;
                this.f26494j = yb0Var322.f34987i;
                this.f26495k = yb0Var322.b();
                this.f26497m = h00.a(this.f26489e.f34984f, cVar.f32185n);
                int i1622 = this.f26489e.f34984f;
                this.f26498n = (i1622 == 0 && (i1622 & 1) == 0) ? false : true;
                i8 = 0;
                while (true) {
                    if (i8 < cVar.f32184m.size()) {
                    }
                    i8++;
                }
                this.f26496l = i8;
                this.f26501q = to1.a(i6) != 128;
                this.f26502r = to1.b(i6) == 64;
                this.f26503s = h00.a(this.f26489e.f34991m);
                this.f26500p = a(i6, i15);
            }
            z6 = false;
            this.f26492h = z6;
            this.f26493i = h00.a(false, i6);
            yb0 yb0Var3222 = this.f26489e;
            this.f26494j = yb0Var3222.f34987i;
            this.f26495k = yb0Var3222.b();
            this.f26497m = h00.a(this.f26489e.f34984f, cVar.f32185n);
            int i16222 = this.f26489e.f34984f;
            this.f26498n = (i16222 == 0 && (i16222 & 1) == 0) ? false : true;
            i8 = 0;
            while (true) {
                if (i8 < cVar.f32184m.size()) {
                }
                i8++;
            }
            this.f26496l = i8;
            this.f26501q = to1.a(i6) != 128;
            this.f26502r = to1.b(i6) == 64;
            this.f26503s = h00.a(this.f26489e.f34991m);
            this.f26500p = a(i6, i15);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int a(h hVar, h hVar2) {
            lq a4 = lq.b().a(hVar.f26493i, hVar2.f26493i).a(hVar.f26497m, hVar2.f26497m).a(hVar.f26498n, hVar2.f26498n).a(hVar.f26490f, hVar2.f26490f).a(hVar.f26492h, hVar2.f26492h).a(Integer.valueOf(hVar.f26496l), Integer.valueOf(hVar2.f26496l), bf1.a().b()).a(hVar.f26501q, hVar2.f26501q).a(hVar.f26502r, hVar2.f26502r);
            if (hVar.f26501q && hVar.f26502r) {
                a4 = a4.a(hVar.f26503s, hVar2.f26503s);
            }
            return a4.a();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int b(h hVar, h hVar2) {
            bf1 b4 = (hVar.f26490f && hVar.f26493i) ? h00.f26409i : h00.f26409i.b();
            return lq.b().a(Integer.valueOf(hVar.f26494j), Integer.valueOf(hVar2.f26494j), hVar.f26491g.f32195x ? h00.f26409i.b() : h00.f26410j).a(Integer.valueOf(hVar.f26495k), Integer.valueOf(hVar2.f26495k), b4).a(Integer.valueOf(hVar.f26494j), Integer.valueOf(hVar2.f26494j), b4).a();
        }

        private int a(int i4, int i5) {
            if ((this.f26489e.f34984f & 16384) != 0 || !h00.a(this.f26491g.f26448M, i4)) {
                return 0;
            }
            if (!this.f26490f && !this.f26491g.f26438C) {
                return 0;
            }
            if (!h00.a(false, i4) || !this.f26492h || !this.f26490f || this.f26489e.f34987i == -1) {
                return 1;
            }
            c cVar = this.f26491g;
            return (cVar.f32196y || cVar.f32195x || (i4 & i5) == 0) ? 1 : 2;
        }

        @Override // com.yandex.mobile.ads.impl.h00.g
        public final int a() {
            return this.f26500p;
        }

        @Override // com.yandex.mobile.ads.impl.h00.g
        public final boolean a(h hVar) {
            h hVar2 = hVar;
            if (!this.f26499o && !u82.a(this.f26489e.f34991m, hVar2.f26489e.f34991m)) {
                return false;
            }
            if (this.f26491g.f26441F) {
                return true;
            }
            return this.f26501q == hVar2.f26501q && this.f26502r == hVar2.f26502r;
        }

        public static int a(List<h> list, List<h> list2) {
            return lq.b().a((h) Collections.max(list, new Comparator() { // from class: com.yandex.mobile.ads.impl.R4
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int a4;
                    a4 = h00.h.a((h00.h) obj, (h00.h) obj2);
                    return a4;
                }
            }), (h) Collections.max(list2, new Comparator() { // from class: com.yandex.mobile.ads.impl.R4
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int a4;
                    a4 = h00.h.a((h00.h) obj, (h00.h) obj2);
                    return a4;
                }
            }), new Comparator() { // from class: com.yandex.mobile.ads.impl.R4
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int a4;
                    a4 = h00.h.a((h00.h) obj, (h00.h) obj2);
                    return a4;
                }
            }).a(list.size(), list2.size()).a((h) Collections.max(list, new Comparator() { // from class: com.yandex.mobile.ads.impl.S4
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int b4;
                    b4 = h00.h.b((h00.h) obj, (h00.h) obj2);
                    return b4;
                }
            }), (h) Collections.max(list2, new Comparator() { // from class: com.yandex.mobile.ads.impl.S4
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int b4;
                    b4 = h00.h.b((h00.h) obj, (h00.h) obj2);
                    return b4;
                }
            }), new Comparator() { // from class: com.yandex.mobile.ads.impl.S4
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int b4;
                    b4 = h00.h.b((h00.h) obj, (h00.h) obj2);
                    return b4;
                }
            }).a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int a(int i4, int i5) {
        if (i4 == 0 || i4 != i5) {
            return Integer.bitCount(i4 & i5);
        }
        return Integer.MAX_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int a(String str) {
        if (str == null) {
            return 0;
        }
        switch (str) {
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005e, code lost:
    
        if (r2.f26473b != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0036, code lost:
    
        if (r4.equals("audio/ac4") == false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean a(yb0 yb0Var) {
        e eVar;
        boolean z4 = true;
        char c4 = 2;
        synchronized (this.f26411c) {
            try {
                if (this.f26414f.f26447L && !this.f26413e && yb0Var.f35004z > 2) {
                    String str = yb0Var.f34991m;
                    if (str != null) {
                        switch (str.hashCode()) {
                            case -2123537834:
                                if (str.equals("audio/eac3-joc")) {
                                    c4 = 0;
                                    break;
                                }
                                c4 = 65535;
                                break;
                            case 187078296:
                                if (str.equals("audio/ac3")) {
                                    c4 = 1;
                                    break;
                                }
                                c4 = 65535;
                                break;
                            case 187078297:
                                break;
                            case 1504578661:
                                if (str.equals("audio/eac3")) {
                                    c4 = 3;
                                    break;
                                }
                                c4 = 65535;
                                break;
                            default:
                                c4 = 65535;
                                break;
                        }
                        switch (c4) {
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                                if (u82.f32873a >= 32) {
                                    e eVar2 = this.f26415g;
                                    if (eVar2 != null) {
                                        break;
                                    }
                                }
                                break;
                            default:
                                if (u82.f32873a >= 32 || (eVar = this.f26415g) == null || !eVar.f26473b || !eVar.a() || !this.f26415g.b() || !this.f26415g.a(yb0Var, this.f26416h)) {
                                    z4 = false;
                                    break;
                                } else {
                                    break;
                                }
                                break;
                        }
                    }
                    if (u82.f32873a >= 32) {
                    }
                    z4 = false;
                }
            } finally {
            }
        }
        return z4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List a(c cVar, boolean z4, int i4, n52 n52Var, int[] iArr) {
        oj1 oj1Var = new oj1() { // from class: com.yandex.mobile.ads.impl.Z3
            @Override // com.yandex.mobile.ads.impl.oj1
            public final boolean apply(Object obj) {
                boolean a4;
                a4 = h00.this.a((yb0) obj);
                return a4;
            }
        };
        int i5 = sj0.f31764d;
        sj0.a aVar = new sj0.a();
        for (int i6 = 0; i6 < n52Var.f29448b; i6++) {
            aVar.b(new a(i4, n52Var, i6, cVar, iArr[i6], z4, oj1Var));
        }
        return aVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static List a(c cVar, int[] iArr, int i4, n52 n52Var, int[] iArr2) {
        boolean z4;
        int i5;
        int i6;
        int i7;
        int i8;
        Point point;
        int i9;
        int i10;
        c cVar2 = cVar;
        n52 n52Var2 = n52Var;
        int i11 = iArr[i4];
        int i12 = cVar2.f32181j;
        int i13 = cVar2.f32182k;
        boolean z5 = cVar2.f32183l;
        if (i12 == Integer.MAX_VALUE || i13 == Integer.MAX_VALUE) {
            z4 = true;
            i5 = Integer.MAX_VALUE;
        } else {
            int i14 = Integer.MAX_VALUE;
            for (int i15 = 0; i15 < n52Var2.f29448b; i15++) {
                yb0 a4 = n52Var2.a(i15);
                int i16 = a4.f34996r;
                if (i16 > 0 && (i6 = a4.f34997s) > 0) {
                    if (z5) {
                        if ((i16 > i6) != (i12 > i13)) {
                            i8 = i12;
                            i7 = i13;
                            if (i16 * i8 < i6 * i7) {
                                int i17 = u82.f32873a;
                                point = new Point(i7, ((r9 + i16) - 1) / i16);
                            } else {
                                int i18 = u82.f32873a;
                                point = new Point(((r8 + i6) - 1) / i6, i8);
                            }
                            i9 = a4.f34996r;
                            int i19 = a4.f34997s;
                            i10 = i9 * i19;
                            if (i9 >= ((int) (point.x * 0.98f)) && i19 >= ((int) (point.y * 0.98f)) && i10 < i14) {
                                i14 = i10;
                            }
                        }
                    }
                    i7 = i12;
                    i8 = i13;
                    if (i16 * i8 < i6 * i7) {
                    }
                    i9 = a4.f34996r;
                    int i192 = a4.f34997s;
                    i10 = i9 * i192;
                    if (i9 >= ((int) (point.x * 0.98f))) {
                        i14 = i10;
                    }
                }
            }
            z4 = true;
            i5 = i14;
        }
        int i20 = sj0.f31764d;
        sj0.a aVar = new sj0.a();
        int i21 = 0;
        while (i21 < n52Var2.f29448b) {
            int b4 = n52Var2.a(i21).b();
            aVar.b(new h(i4, n52Var2, i21, cVar2, iArr2[i21], i11, (i5 == Integer.MAX_VALUE || (b4 != -1 && b4 <= i5)) ? z4 : false));
            i21++;
            cVar2 = cVar;
            n52Var2 = n52Var;
        }
        return aVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int a(Integer num, Integer num2) {
        if (num.intValue() == -1) {
            return num2.intValue() == -1 ? 0 : -1;
        }
        if (num2.intValue() == -1) {
            return 1;
        }
        return num.intValue() - num2.intValue();
    }

    protected final Pair a(kt0.a aVar, int[][][] iArr, final c cVar) {
        final boolean z4 = false;
        int i4 = 0;
        while (true) {
            if (i4 < aVar.a()) {
                if (2 == aVar.a(i4) && aVar.b(i4).f29912b > 0) {
                    z4 = true;
                    break;
                }
                i4++;
            } else {
                break;
            }
        }
        return a(1, aVar, iArr, new g.a() { // from class: com.yandex.mobile.ads.impl.A4
            @Override // com.yandex.mobile.ads.impl.h00.g.a
            public final List a(int i5, n52 n52Var, int[] iArr2) {
                List a4;
                a4 = h00.this.a(cVar, z4, i5, n52Var, iArr2);
                return a4;
            }
        }, new Comparator() { // from class: com.yandex.mobile.ads.impl.B4
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return h00.a.a((List<h00.a>) obj, (List<h00.a>) obj2);
            }
        });
    }

    protected static Pair a(kt0.a aVar, int[][][] iArr, final c cVar, final String str) {
        return a(3, aVar, iArr, new g.a() { // from class: com.yandex.mobile.ads.impl.C4
            @Override // com.yandex.mobile.ads.impl.h00.g.a
            public final List a(int i4, n52 n52Var, int[] iArr2) {
                List a4;
                a4 = h00.a(h00.c.this, str, i4, n52Var, iArr2);
                return a4;
            }
        }, new Comparator() { // from class: com.yandex.mobile.ads.impl.D4
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return h00.f.a((List) obj, (List) obj2);
            }
        });
    }

    @Override // com.yandex.mobile.ads.impl.kt0
    protected final Pair<uo1[], x60[]> a(kt0.a aVar, int[][][] iArr, int[] iArr2, dw0.b bVar, x42 x42Var) {
        c cVar;
        int i4;
        String str;
        int i5;
        boolean z4;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        e eVar;
        int[][][] iArr3 = iArr;
        synchronized (this.f26411c) {
            try {
                cVar = this.f26414f;
                i4 = 32;
                if (cVar.f26447L && u82.f32873a >= 32 && (eVar = this.f26415g) != null) {
                    Looper myLooper = Looper.myLooper();
                    if (myLooper != null) {
                        eVar.a(this, myLooper);
                    } else {
                        throw new IllegalStateException();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        int a4 = aVar.a();
        int a5 = aVar.a();
        x60.a[] aVarArr = new x60.a[a5];
        Pair a6 = a(aVar, iArr3, iArr2, cVar);
        if (a6 != null) {
            aVarArr[((Integer) a6.second).intValue()] = (x60.a) a6.first;
        }
        Pair a7 = a(aVar, iArr3, cVar);
        if (a7 != null) {
            aVarArr[((Integer) a7.second).intValue()] = (x60.a) a7.first;
        }
        int i11 = 0;
        if (a7 == null) {
            str = null;
        } else {
            x60.a aVar2 = (x60.a) a7.first;
            str = aVar2.f34456a.a(aVar2.f34457b[0]).f34982d;
        }
        Pair a8 = a(aVar, iArr3, cVar, str);
        if (a8 != null) {
            aVarArr[((Integer) a8.second).intValue()] = (x60.a) a8.first;
        }
        int i12 = 0;
        while (true) {
            i5 = 2;
            if (i12 >= a5) {
                break;
            }
            int a9 = aVar.a(i12);
            if (a9 == 2 || a9 == 1 || a9 == 3) {
                i7 = a5;
                i8 = i4;
            } else {
                o52 b4 = aVar.b(i12);
                int[][] iArr4 = iArr3[i12];
                int i13 = i11;
                int i14 = i13;
                n52 n52Var = null;
                b bVar2 = null;
                while (i13 < b4.f29912b) {
                    n52 a10 = b4.a(i13);
                    int[] iArr5 = iArr4[i13];
                    int i15 = i4;
                    int i16 = i11;
                    while (i16 < a10.f29448b) {
                        if (a(cVar.f26448M, iArr5[i16])) {
                            i9 = a5;
                            b bVar3 = new b(a10.a(i16), iArr5[i16]);
                            if (bVar2 != null) {
                                i10 = i16;
                                if (lq.b().a(bVar3.f26436c, bVar2.f26436c).a(bVar3.f26435b, bVar2.f26435b).a() <= 0) {
                                }
                            } else {
                                i10 = i16;
                            }
                            n52Var = a10;
                            bVar2 = bVar3;
                            i14 = i10;
                        } else {
                            i9 = a5;
                            i10 = i16;
                        }
                        i16 = i10 + 1;
                        a5 = i9;
                    }
                    i13++;
                    i4 = i15;
                    i11 = 0;
                }
                i7 = a5;
                i8 = i4;
                aVarArr[i12] = n52Var == null ? null : new x60.a(0, n52Var, new int[]{i14});
            }
            i12++;
            iArr3 = iArr;
            i4 = i8;
            a5 = i7;
            i11 = 0;
        }
        int i17 = i4;
        int a11 = aVar.a();
        HashMap hashMap = new HashMap();
        for (int i18 = 0; i18 < a11; i18++) {
            a(aVar.b(i18), cVar, hashMap);
        }
        a(aVar.b(), cVar, hashMap);
        for (int i19 = 0; i19 < a11; i19++) {
            s52 s52Var = (s52) hashMap.get(Integer.valueOf(aVar.a(i19)));
            if (s52Var != null) {
                aVarArr[i19] = (s52Var.f31590c.isEmpty() || aVar.b(i19).a(s52Var.f31589b) == -1) ? null : new x60.a(0, s52Var.f31589b, pp0.a(s52Var.f31590c));
            }
        }
        int i20 = 0;
        int a12 = aVar.a();
        for (int i21 = 0; i21 < a12; i21++) {
            o52 b5 = aVar.b(i21);
            Map map = (Map) cVar.f26451P.get(i21);
            if (map != null && map.containsKey(b5)) {
                Map map2 = (Map) cVar.f26451P.get(i21);
                d dVar = map2 != null ? (d) map2.get(b5) : null;
                aVarArr[i21] = (dVar == null || dVar.f26470c.length == 0) ? null : new x60.a(dVar.f26471d, b5.a(dVar.f26469b), dVar.f26470c);
            }
        }
        for (int i22 = 0; i22 < a4; i22++) {
            int a13 = aVar.a(i22);
            if (cVar.f26452Q.get(i22) || cVar.f32172A.contains(Integer.valueOf(a13))) {
                aVarArr[i22] = null;
            }
        }
        x60[] a14 = ((C2088ma.b) this.f26412d).a(aVarArr, a());
        uo1[] uo1VarArr = new uo1[a4];
        for (int i23 = 0; i23 < a4; i23++) {
            uo1VarArr[i23] = (cVar.f26452Q.get(i23) || cVar.f32172A.contains(Integer.valueOf(aVar.a(i23))) || (aVar.a(i23) != -2 && a14[i23] == null)) ? null : uo1.f33220b;
        }
        if (cVar.f26449N) {
            int i24 = -1;
            int i25 = -1;
            int i26 = 0;
            while (i26 < aVar.a()) {
                int a15 = aVar.a(i26);
                x60 x60Var = a14[i26];
                if ((a15 == 1 || a15 == i5) && x60Var != null) {
                    int[][] iArr6 = iArr[i26];
                    int a16 = aVar.b(i26).a(x60Var.a());
                    int i27 = i20;
                    while (true) {
                        if (i27 < x60Var.b()) {
                            i6 = i17;
                            if ((iArr6[a16][x60Var.b(i27)] & 32) != i6) {
                                break;
                            }
                            i27++;
                            i17 = i6;
                        } else {
                            i6 = i17;
                            if (a15 == 1) {
                                if (i24 != -1) {
                                    z4 = false;
                                    break;
                                }
                                i24 = i26;
                            } else {
                                if (i25 != -1) {
                                    z4 = false;
                                    break;
                                }
                                i25 = i26;
                            }
                        }
                    }
                } else {
                    i6 = i17;
                }
                i26++;
                i17 = i6;
                i5 = 2;
                i20 = 0;
            }
            z4 = true;
            if (z4 & ((i24 == -1 || i25 == -1) ? false : true)) {
                uo1 uo1Var = new uo1(true);
                uo1VarArr[i24] = uo1Var;
                uo1VarArr[i25] = uo1Var;
            }
        }
        return Pair.create(uo1VarArr, a14);
    }

    private static Pair a(int i4, kt0.a aVar, int[][][] iArr, g.a aVar2, Comparator comparator) {
        int i5;
        RandomAccess randomAccess;
        kt0.a aVar3 = aVar;
        ArrayList arrayList = new ArrayList();
        int a4 = aVar3.a();
        int i6 = 0;
        while (i6 < a4) {
            if (i4 == aVar3.a(i6)) {
                o52 b4 = aVar3.b(i6);
                for (int i7 = 0; i7 < b4.f29912b; i7++) {
                    n52 a5 = b4.a(i7);
                    List a6 = aVar2.a(i6, a5, iArr[i6][i7]);
                    boolean[] zArr = new boolean[a5.f29448b];
                    int i8 = 0;
                    while (i8 < a5.f29448b) {
                        g gVar = (g) a6.get(i8);
                        int a7 = gVar.a();
                        if (zArr[i8] || a7 == 0) {
                            i5 = a4;
                        } else {
                            if (a7 == 1) {
                                randomAccess = sj0.a(gVar);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(gVar);
                                int i9 = i8 + 1;
                                while (i9 < a5.f29448b) {
                                    g gVar2 = (g) a6.get(i9);
                                    int i10 = a4;
                                    if (gVar2.a() == 2 && gVar.a(gVar2)) {
                                        arrayList2.add(gVar2);
                                        zArr[i9] = true;
                                    }
                                    i9++;
                                    a4 = i10;
                                }
                                randomAccess = arrayList2;
                            }
                            i5 = a4;
                            arrayList.add(randomAccess);
                        }
                        i8++;
                        a4 = i5;
                    }
                }
            }
            i6++;
            aVar3 = aVar;
            a4 = a4;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i11 = 0; i11 < list.size(); i11++) {
            iArr2[i11] = ((g) list.get(i11)).f26488d;
        }
        g gVar3 = (g) list.get(0);
        return Pair.create(new x60.a(0, gVar3.f26487c, iArr2), Integer.valueOf(gVar3.f26486b));
    }

    protected static Pair a(kt0.a aVar, int[][][] iArr, final int[] iArr2, final c cVar) {
        return a(2, aVar, iArr, new g.a() { // from class: com.yandex.mobile.ads.impl.G4
            @Override // com.yandex.mobile.ads.impl.h00.g.a
            public final List a(int i4, n52 n52Var, int[] iArr3) {
                List a4;
                a4 = h00.a(h00.c.this, iArr2, i4, n52Var, iArr3);
                return a4;
            }
        }, new Comparator() { // from class: com.yandex.mobile.ads.impl.H4
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return h00.h.a((List<h00.h>) obj, (List<h00.h>) obj2);
            }
        });
    }

    @Override // com.yandex.mobile.ads.impl.u52
    public final void a(C1856ch c1856ch) {
        boolean equals;
        synchronized (this.f26411c) {
            equals = this.f26416h.equals(c1856ch);
            this.f26416h = c1856ch;
        }
        if (equals) {
            return;
        }
        e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static List a(c cVar, String str, int i4, n52 n52Var, int[] iArr) {
        int i5 = sj0.f31764d;
        sj0.a aVar = new sj0.a();
        for (int i6 = 0; i6 < n52Var.f29448b; i6++) {
            aVar.b(new f(i4, n52Var, i6, cVar, iArr[i6], str));
        }
        return aVar.a();
    }
}
