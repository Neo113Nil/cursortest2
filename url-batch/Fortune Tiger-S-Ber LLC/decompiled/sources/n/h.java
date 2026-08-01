package n;

import androidx.fragment.app.w0;
import java.util.Arrays;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class h implements Cloneable {

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ boolean f2931f;
    public /* synthetic */ long[] g;
    public /* synthetic */ Object[] h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ int f2932i;

    public h() {
        int i4;
        int i5 = 4;
        while (true) {
            i4 = 80;
            if (i5 >= 32) {
                break;
            }
            int i6 = (1 << i5) - 12;
            if (80 <= i6) {
                i4 = i6;
                break;
            }
            i5++;
        }
        int i7 = i4 / 8;
        this.g = new long[i7];
        this.h = new Object[i7];
    }

    public final void a() {
        int i4 = this.f2932i;
        Object[] objArr = this.h;
        for (int i5 = 0; i5 < i4; i5++) {
            objArr[i5] = null;
        }
        this.f2932i = 0;
        this.f2931f = false;
    }

    public final Object b(long j4) {
        Object obj;
        int b2 = o.a.b(this.g, this.f2932i, j4);
        if (b2 < 0 || (obj = this.h[b2]) == i.f2933a) {
            return null;
        }
        return obj;
    }

    public final long c(int i4) {
        int i5;
        if (i4 < 0 || i4 >= (i5 = this.f2932i)) {
            throw new IllegalArgumentException(w0.e("Expected index to be within 0..size()-1, but was ", i4).toString());
        }
        if (this.f2931f) {
            long[] jArr = this.g;
            Object[] objArr = this.h;
            int i6 = 0;
            for (int i7 = 0; i7 < i5; i7++) {
                Object obj = objArr[i7];
                if (obj != i.f2933a) {
                    if (i7 != i6) {
                        jArr[i6] = jArr[i7];
                        objArr[i6] = obj;
                        objArr[i7] = null;
                    }
                    i6++;
                }
            }
            this.f2931f = false;
            this.f2932i = i6;
        }
        return this.g[i4];
    }

    public final Object clone() {
        Object clone = super.clone();
        u2.c.c(clone, "null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>");
        h hVar = (h) clone;
        hVar.g = (long[]) this.g.clone();
        hVar.h = (Object[]) this.h.clone();
        return hVar;
    }

    public final void d(long j4, Object obj) {
        Object obj2 = i.f2933a;
        int b2 = o.a.b(this.g, this.f2932i, j4);
        if (b2 >= 0) {
            this.h[b2] = obj;
            return;
        }
        int i4 = ~b2;
        int i5 = this.f2932i;
        if (i4 < i5) {
            Object[] objArr = this.h;
            if (objArr[i4] == obj2) {
                this.g[i4] = j4;
                objArr[i4] = obj;
                return;
            }
        }
        if (this.f2931f) {
            long[] jArr = this.g;
            if (i5 >= jArr.length) {
                Object[] objArr2 = this.h;
                int i6 = 0;
                for (int i7 = 0; i7 < i5; i7++) {
                    Object obj3 = objArr2[i7];
                    if (obj3 != obj2) {
                        if (i7 != i6) {
                            jArr[i6] = jArr[i7];
                            objArr2[i6] = obj3;
                            objArr2[i7] = null;
                        }
                        i6++;
                    }
                }
                this.f2931f = false;
                this.f2932i = i6;
                i4 = ~o.a.b(this.g, i6, j4);
            }
        }
        int i8 = this.f2932i;
        if (i8 >= this.g.length) {
            int i9 = (i8 + 1) * 8;
            int i10 = 4;
            while (true) {
                if (i10 >= 32) {
                    break;
                }
                int i11 = (1 << i10) - 12;
                if (i9 <= i11) {
                    i9 = i11;
                    break;
                }
                i10++;
            }
            int i12 = i9 / 8;
            long[] copyOf = Arrays.copyOf(this.g, i12);
            u2.c.d(copyOf, "copyOf(this, newSize)");
            this.g = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.h, i12);
            u2.c.d(copyOf2, "copyOf(this, newSize)");
            this.h = copyOf2;
        }
        int i13 = this.f2932i - i4;
        if (i13 != 0) {
            long[] jArr2 = this.g;
            int i14 = i4 + 1;
            u2.c.e(jArr2, "<this>");
            System.arraycopy(jArr2, i4, jArr2, i14, i13);
            Object[] objArr3 = this.h;
            n2.f.D(objArr3, objArr3, i14, i4, this.f2932i);
        }
        this.g[i4] = j4;
        this.h[i4] = obj;
        this.f2932i++;
    }

    public final int e() {
        if (this.f2931f) {
            int i4 = this.f2932i;
            long[] jArr = this.g;
            Object[] objArr = this.h;
            int i5 = 0;
            for (int i6 = 0; i6 < i4; i6++) {
                Object obj = objArr[i6];
                if (obj != i.f2933a) {
                    if (i6 != i5) {
                        jArr[i5] = jArr[i6];
                        objArr[i5] = obj;
                        objArr[i6] = null;
                    }
                    i5++;
                }
            }
            this.f2931f = false;
            this.f2932i = i5;
        }
        return this.f2932i;
    }

    public final Object f(int i4) {
        int i5;
        if (i4 < 0 || i4 >= (i5 = this.f2932i)) {
            throw new IllegalArgumentException(w0.e("Expected index to be within 0..size()-1, but was ", i4).toString());
        }
        if (this.f2931f) {
            long[] jArr = this.g;
            Object[] objArr = this.h;
            int i6 = 0;
            for (int i7 = 0; i7 < i5; i7++) {
                Object obj = objArr[i7];
                if (obj != i.f2933a) {
                    if (i7 != i6) {
                        jArr[i6] = jArr[i7];
                        objArr[i6] = obj;
                        objArr[i7] = null;
                    }
                    i6++;
                }
            }
            this.f2931f = false;
            this.f2932i = i6;
        }
        return this.h[i4];
    }

    public final String toString() {
        if (e() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f2932i * 28);
        sb.append('{');
        int i4 = this.f2932i;
        for (int i5 = 0; i5 < i4; i5++) {
            if (i5 > 0) {
                sb.append(", ");
            }
            sb.append(c(i5));
            sb.append('=');
            Object f4 = f(i5);
            if (f4 != sb) {
                sb.append(f4);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        u2.c.d(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }
}
