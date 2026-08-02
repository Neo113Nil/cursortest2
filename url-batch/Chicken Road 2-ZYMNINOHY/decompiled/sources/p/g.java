package p;

import E.AbstractC0005f;
import java.util.Arrays;
import q.AbstractC1350a;

/* loaded from: classes.dex */
public final class g implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ boolean f14653a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ long[] f14654b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object[] f14655c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ int f14656d;

    public g() {
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
        this.f14654b = new long[i7];
        this.f14655c = new Object[i7];
    }

    public final void a() {
        int i4 = this.f14656d;
        Object[] objArr = this.f14655c;
        for (int i5 = 0; i5 < i4; i5++) {
            objArr[i5] = null;
        }
        this.f14656d = 0;
        this.f14653a = false;
    }

    public final Object b(long j4) {
        Object obj;
        int b4 = AbstractC1350a.b(this.f14654b, this.f14656d, j4);
        if (b4 < 0 || (obj = this.f14655c[b4]) == h.f14657a) {
            return null;
        }
        return obj;
    }

    public final long c(int i4) {
        int i5;
        if (i4 < 0 || i4 >= (i5 = this.f14656d)) {
            throw new IllegalArgumentException(AbstractC0005f.j(i4, "Expected index to be within 0..size()-1, but was ").toString());
        }
        if (this.f14653a) {
            long[] jArr = this.f14654b;
            Object[] objArr = this.f14655c;
            int i6 = 0;
            for (int i7 = 0; i7 < i5; i7++) {
                Object obj = objArr[i7];
                if (obj != h.f14657a) {
                    if (i7 != i6) {
                        jArr[i6] = jArr[i7];
                        objArr[i6] = obj;
                        objArr[i7] = null;
                    }
                    i6++;
                }
            }
            this.f14653a = false;
            this.f14656d = i6;
        }
        return this.f14654b[i4];
    }

    public final Object clone() {
        Object clone = super.clone();
        kotlin.jvm.internal.i.c(clone, "null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>");
        g gVar = (g) clone;
        gVar.f14654b = (long[]) this.f14654b.clone();
        gVar.f14655c = (Object[]) this.f14655c.clone();
        return gVar;
    }

    public final void d(long j4, Object obj) {
        Object obj2 = h.f14657a;
        int b4 = AbstractC1350a.b(this.f14654b, this.f14656d, j4);
        if (b4 >= 0) {
            this.f14655c[b4] = obj;
            return;
        }
        int i4 = ~b4;
        int i5 = this.f14656d;
        if (i4 < i5) {
            Object[] objArr = this.f14655c;
            if (objArr[i4] == obj2) {
                this.f14654b[i4] = j4;
                objArr[i4] = obj;
                return;
            }
        }
        if (this.f14653a) {
            long[] jArr = this.f14654b;
            if (i5 >= jArr.length) {
                Object[] objArr2 = this.f14655c;
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
                this.f14653a = false;
                this.f14656d = i6;
                i4 = ~AbstractC1350a.b(this.f14654b, i6, j4);
            }
        }
        int i8 = this.f14656d;
        if (i8 >= this.f14654b.length) {
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
            long[] copyOf = Arrays.copyOf(this.f14654b, i12);
            kotlin.jvm.internal.i.d(copyOf, "copyOf(this, newSize)");
            this.f14654b = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f14655c, i12);
            kotlin.jvm.internal.i.d(copyOf2, "copyOf(this, newSize)");
            this.f14655c = copyOf2;
        }
        int i13 = this.f14656d - i4;
        if (i13 != 0) {
            long[] jArr2 = this.f14654b;
            int i14 = i4 + 1;
            kotlin.jvm.internal.i.e(jArr2, "<this>");
            System.arraycopy(jArr2, i4, jArr2, i14, i13);
            Object[] objArr3 = this.f14655c;
            d3.g.Q(i14, i4, this.f14656d, objArr3, objArr3);
        }
        this.f14654b[i4] = j4;
        this.f14655c[i4] = obj;
        this.f14656d++;
    }

    public final int e() {
        if (this.f14653a) {
            int i4 = this.f14656d;
            long[] jArr = this.f14654b;
            Object[] objArr = this.f14655c;
            int i5 = 0;
            for (int i6 = 0; i6 < i4; i6++) {
                Object obj = objArr[i6];
                if (obj != h.f14657a) {
                    if (i6 != i5) {
                        jArr[i5] = jArr[i6];
                        objArr[i5] = obj;
                        objArr[i6] = null;
                    }
                    i5++;
                }
            }
            this.f14653a = false;
            this.f14656d = i5;
        }
        return this.f14656d;
    }

    public final Object f(int i4) {
        int i5;
        if (i4 < 0 || i4 >= (i5 = this.f14656d)) {
            throw new IllegalArgumentException(AbstractC0005f.j(i4, "Expected index to be within 0..size()-1, but was ").toString());
        }
        if (this.f14653a) {
            long[] jArr = this.f14654b;
            Object[] objArr = this.f14655c;
            int i6 = 0;
            for (int i7 = 0; i7 < i5; i7++) {
                Object obj = objArr[i7];
                if (obj != h.f14657a) {
                    if (i7 != i6) {
                        jArr[i6] = jArr[i7];
                        objArr[i6] = obj;
                        objArr[i7] = null;
                    }
                    i6++;
                }
            }
            this.f14653a = false;
            this.f14656d = i6;
        }
        return this.f14655c[i4];
    }

    public final String toString() {
        if (e() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f14656d * 28);
        sb.append('{');
        int i4 = this.f14656d;
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
        kotlin.jvm.internal.i.d(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }
}
