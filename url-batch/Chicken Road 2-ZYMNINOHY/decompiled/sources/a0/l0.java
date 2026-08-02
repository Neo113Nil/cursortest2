package a0;

import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class l0 extends T.T {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f4182k = 0;

    /* renamed from: b, reason: collision with root package name */
    public final int f4183b;

    /* renamed from: c, reason: collision with root package name */
    public final q0.e0 f4184c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4185d;

    /* renamed from: e, reason: collision with root package name */
    public final int f4186e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f4187f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f4188g;

    /* renamed from: h, reason: collision with root package name */
    public final T.T[] f4189h;

    /* renamed from: i, reason: collision with root package name */
    public final Object[] f4190i;

    /* renamed from: j, reason: collision with root package name */
    public final HashMap f4191j;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public l0(ArrayList arrayList, q0.e0 e0Var) {
        this(r0, r1, e0Var);
        T.T[] tArr = new T.T[arrayList.size()];
        int size = arrayList.size();
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (i6 < size) {
            Object obj = arrayList.get(i6);
            i6++;
            tArr[i5] = ((W) obj).b();
            i5++;
        }
        Object[] objArr = new Object[arrayList.size()];
        int size2 = arrayList.size();
        int i7 = 0;
        while (i7 < size2) {
            Object obj2 = arrayList.get(i7);
            i7++;
            objArr[i4] = ((W) obj2).a();
            i4++;
        }
    }

    @Override // T.T
    public final int a(boolean z) {
        if (this.f4183b != 0) {
            int i4 = 0;
            if (z) {
                int[] iArr = this.f4184c.f14997b;
                i4 = iArr.length > 0 ? iArr[0] : -1;
            }
            do {
                T.T[] tArr = this.f4189h;
                if (!tArr[i4].p()) {
                    return tArr[i4].a(z) + this.f4188g[i4];
                }
                i4 = q(i4, z);
            } while (i4 != -1);
        }
        return -1;
    }

    @Override // T.T
    public final int b(Object obj) {
        int b4;
        if (obj instanceof Pair) {
            Pair pair = (Pair) obj;
            Object obj2 = pair.first;
            Object obj3 = pair.second;
            Integer num = (Integer) this.f4191j.get(obj2);
            int intValue = num == null ? -1 : num.intValue();
            if (intValue != -1 && (b4 = this.f4189h[intValue].b(obj3)) != -1) {
                return this.f4187f[intValue] + b4;
            }
        }
        return -1;
    }

    @Override // T.T
    public final int c(boolean z) {
        int i4;
        int i5 = this.f4183b;
        if (i5 != 0) {
            if (z) {
                int[] iArr = this.f4184c.f14997b;
                i4 = iArr.length > 0 ? iArr[iArr.length - 1] : -1;
            } else {
                i4 = i5 - 1;
            }
            do {
                T.T[] tArr = this.f4189h;
                if (!tArr[i4].p()) {
                    return tArr[i4].c(z) + this.f4188g[i4];
                }
                i4 = r(i4, z);
            } while (i4 != -1);
        }
        return -1;
    }

    @Override // T.T
    public final int e(int i4, boolean z, int i5) {
        int[] iArr = this.f4188g;
        int e4 = W.J.e(iArr, i4 + 1, false, false);
        int i6 = iArr[e4];
        T.T[] tArr = this.f4189h;
        int e5 = tArr[e4].e(i4 - i6, z, i5 != 2 ? i5 : 0);
        if (e5 != -1) {
            return i6 + e5;
        }
        int q4 = q(e4, z);
        while (q4 != -1 && tArr[q4].p()) {
            q4 = q(q4, z);
        }
        if (q4 != -1) {
            return tArr[q4].a(z) + iArr[q4];
        }
        if (i5 == 2) {
            return a(z);
        }
        return -1;
    }

    @Override // T.T
    public final T.Q f(int i4, T.Q q4, boolean z) {
        int[] iArr = this.f4187f;
        int e4 = W.J.e(iArr, i4 + 1, false, false);
        int i5 = this.f4188g[e4];
        this.f4189h[e4].f(i4 - iArr[e4], q4, z);
        q4.f2683c += i5;
        if (z) {
            Object obj = this.f4190i[e4];
            Object obj2 = q4.f2682b;
            obj2.getClass();
            q4.f2682b = Pair.create(obj, obj2);
        }
        return q4;
    }

    @Override // T.T
    public final T.Q g(Object obj, T.Q q4) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        Integer num = (Integer) this.f4191j.get(obj2);
        int intValue = num == null ? -1 : num.intValue();
        int i4 = this.f4188g[intValue];
        this.f4189h[intValue].g(obj3, q4);
        q4.f2683c += i4;
        q4.f2682b = obj;
        return q4;
    }

    @Override // T.T
    public final int h() {
        return this.f4186e;
    }

    @Override // T.T
    public final int k(int i4, int i5) {
        int[] iArr = this.f4188g;
        int e4 = W.J.e(iArr, i4 + 1, false, false);
        int i6 = iArr[e4];
        T.T[] tArr = this.f4189h;
        int k4 = tArr[e4].k(i4 - i6, i5 == 2 ? 0 : i5);
        if (k4 != -1) {
            return i6 + k4;
        }
        int r4 = r(e4, false);
        while (r4 != -1 && tArr[r4].p()) {
            r4 = r(r4, false);
        }
        if (r4 != -1) {
            return tArr[r4].c(false) + iArr[r4];
        }
        if (i5 == 2) {
            return c(false);
        }
        return -1;
    }

    @Override // T.T
    public final Object l(int i4) {
        int[] iArr = this.f4187f;
        int e4 = W.J.e(iArr, i4 + 1, false, false);
        return Pair.create(this.f4190i[e4], this.f4189h[e4].l(i4 - iArr[e4]));
    }

    @Override // T.T
    public final T.S m(int i4, T.S s4, long j4) {
        int[] iArr = this.f4188g;
        int e4 = W.J.e(iArr, i4 + 1, false, false);
        int i5 = iArr[e4];
        int i6 = this.f4187f[e4];
        this.f4189h[e4].m(i4 - i5, s4, j4);
        Object obj = this.f4190i[e4];
        if (!T.S.f2688q.equals(s4.f2690a)) {
            obj = Pair.create(obj, s4.f2690a);
        }
        s4.f2690a = obj;
        s4.n += i6;
        s4.o += i6;
        return s4;
    }

    @Override // T.T
    public final int o() {
        return this.f4185d;
    }

    public final int q(int i4, boolean z) {
        if (!z) {
            if (i4 < this.f4183b - 1) {
                return i4 + 1;
            }
            return -1;
        }
        q0.e0 e0Var = this.f4184c;
        int i5 = e0Var.f14998c[i4] + 1;
        int[] iArr = e0Var.f14997b;
        if (i5 < iArr.length) {
            return iArr[i5];
        }
        return -1;
    }

    public final int r(int i4, boolean z) {
        if (!z) {
            if (i4 > 0) {
                return i4 - 1;
            }
            return -1;
        }
        q0.e0 e0Var = this.f4184c;
        int i5 = e0Var.f14998c[i4] - 1;
        if (i5 >= 0) {
            return e0Var.f14997b[i5];
        }
        return -1;
    }

    public l0(T.T[] tArr, Object[] objArr, q0.e0 e0Var) {
        this.f4184c = e0Var;
        this.f4183b = e0Var.f14997b.length;
        int length = tArr.length;
        this.f4189h = tArr;
        this.f4187f = new int[length];
        this.f4188g = new int[length];
        this.f4190i = objArr;
        this.f4191j = new HashMap();
        int length2 = tArr.length;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (i4 < length2) {
            T.T t4 = tArr[i4];
            this.f4189h[i7] = t4;
            this.f4188g[i7] = i5;
            this.f4187f[i7] = i6;
            i5 += t4.o();
            i6 += this.f4189h[i7].h();
            this.f4191j.put(objArr[i7], Integer.valueOf(i7));
            i4++;
            i7++;
        }
        this.f4185d = i5;
        this.f4186e = i6;
    }
}
