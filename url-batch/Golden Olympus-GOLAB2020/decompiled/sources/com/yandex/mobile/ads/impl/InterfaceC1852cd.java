package com.yandex.mobile.ads.impl;

import android.util.SparseArray;
import com.yandex.mobile.ads.impl.dw0;
import java.util.Arrays;

/* renamed from: com.yandex.mobile.ads.impl.cd, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC1852cd {

    /* renamed from: com.yandex.mobile.ads.impl.cd$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final long f24172a;

        /* renamed from: b, reason: collision with root package name */
        public final x42 f24173b;

        /* renamed from: c, reason: collision with root package name */
        public final int f24174c;

        /* renamed from: d, reason: collision with root package name */
        public final dw0.b f24175d;

        /* renamed from: e, reason: collision with root package name */
        public final long f24176e;

        /* renamed from: f, reason: collision with root package name */
        public final x42 f24177f;

        /* renamed from: g, reason: collision with root package name */
        public final int f24178g;

        /* renamed from: h, reason: collision with root package name */
        public final dw0.b f24179h;

        /* renamed from: i, reason: collision with root package name */
        public final long f24180i;

        /* renamed from: j, reason: collision with root package name */
        public final long f24181j;

        public a(long j4, x42 x42Var, int i4, dw0.b bVar, long j5, x42 x42Var2, int i5, dw0.b bVar2, long j6, long j7) {
            this.f24172a = j4;
            this.f24173b = x42Var;
            this.f24174c = i4;
            this.f24175d = bVar;
            this.f24176e = j5;
            this.f24177f = x42Var2;
            this.f24178g = i5;
            this.f24179h = bVar2;
            this.f24180i = j6;
            this.f24181j = j7;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f24172a == aVar.f24172a && this.f24174c == aVar.f24174c && this.f24176e == aVar.f24176e && this.f24178g == aVar.f24178g && this.f24180i == aVar.f24180i && this.f24181j == aVar.f24181j && nd1.a(this.f24173b, aVar.f24173b) && nd1.a(this.f24175d, aVar.f24175d) && nd1.a(this.f24177f, aVar.f24177f) && nd1.a(this.f24179h, aVar.f24179h)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Long.valueOf(this.f24172a), this.f24173b, Integer.valueOf(this.f24174c), this.f24175d, Long.valueOf(this.f24176e), this.f24177f, Integer.valueOf(this.f24178g), this.f24179h, Long.valueOf(this.f24180i), Long.valueOf(this.f24181j)});
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.cd$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final qb0 f24182a;

        /* renamed from: b, reason: collision with root package name */
        private final SparseArray<a> f24183b;

        public b(qb0 qb0Var, SparseArray<a> sparseArray) {
            this.f24182a = qb0Var;
            SparseArray<a> sparseArray2 = new SparseArray<>(qb0Var.a());
            for (int i4 = 0; i4 < qb0Var.a(); i4++) {
                int b4 = qb0Var.b(i4);
                sparseArray2.append(b4, (a) C2253tf.a(sparseArray.get(b4)));
            }
            this.f24183b = sparseArray2;
        }

        public final boolean a(int i4) {
            return this.f24182a.a(i4);
        }

        public final int b(int i4) {
            return this.f24182a.b(i4);
        }

        public final a c(int i4) {
            a aVar = this.f24183b.get(i4);
            aVar.getClass();
            return aVar;
        }

        public final int a() {
            return this.f24182a.a();
        }
    }
}
