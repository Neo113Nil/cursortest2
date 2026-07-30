package i;

import java.util.Arrays;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class l implements Cloneable {

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ boolean f4755f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ long[] f4756g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object[] f4757h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ int f4758i;

    public l(int i7) {
        if (i7 == 0) {
            this.f4756g = j.a.f4967b;
            this.f4757h = j.a.f4968c;
            return;
        }
        int i8 = i7 * 8;
        int i9 = 4;
        while (true) {
            if (i9 >= 32) {
                break;
            }
            int i10 = (1 << i9) - 12;
            if (i8 <= i10) {
                i8 = i10;
                break;
            }
            i9++;
        }
        int i11 = i8 / 8;
        this.f4756g = new long[i11];
        this.f4757h = new Object[i11];
    }

    public final long a(int i7) {
        int i8;
        if (i7 < 0 || i7 >= (i8 = this.f4758i)) {
            j.a.c("Expected index to be within 0..size()-1, but was " + i7);
            throw null;
        }
        if (this.f4755f) {
            long[] jArr = this.f4756g;
            Object[] objArr = this.f4757h;
            int i9 = 0;
            for (int i10 = 0; i10 < i8; i10++) {
                Object obj = objArr[i10];
                if (obj != m.f4759a) {
                    if (i10 != i9) {
                        jArr[i9] = jArr[i10];
                        objArr[i9] = obj;
                        objArr[i10] = null;
                    }
                    i9++;
                }
            }
            this.f4755f = false;
            this.f4758i = i9;
        }
        return this.f4756g[i7];
    }

    public final void b(long j8, Object obj) {
        Object obj2 = m.f4759a;
        int b9 = j.a.b(this.f4756g, this.f4758i, j8);
        if (b9 >= 0) {
            this.f4757h[b9] = obj;
            return;
        }
        int i7 = ~b9;
        int i8 = this.f4758i;
        if (i7 < i8) {
            Object[] objArr = this.f4757h;
            if (objArr[i7] == obj2) {
                this.f4756g[i7] = j8;
                objArr[i7] = obj;
                return;
            }
        }
        if (this.f4755f) {
            long[] jArr = this.f4756g;
            if (i8 >= jArr.length) {
                Object[] objArr2 = this.f4757h;
                int i9 = 0;
                for (int i10 = 0; i10 < i8; i10++) {
                    Object obj3 = objArr2[i10];
                    if (obj3 != obj2) {
                        if (i10 != i9) {
                            jArr[i9] = jArr[i10];
                            objArr2[i9] = obj3;
                            objArr2[i10] = null;
                        }
                        i9++;
                    }
                }
                this.f4755f = false;
                this.f4758i = i9;
                i7 = ~j.a.b(this.f4756g, i9, j8);
            }
        }
        int i11 = this.f4758i;
        if (i11 >= this.f4756g.length) {
            int i12 = (i11 + 1) * 8;
            int i13 = 4;
            while (true) {
                if (i13 >= 32) {
                    break;
                }
                int i14 = (1 << i13) - 12;
                if (i12 <= i14) {
                    i12 = i14;
                    break;
                }
                i13++;
            }
            int i15 = i12 / 8;
            long[] copyOf = Arrays.copyOf(this.f4756g, i15);
            r6.k.e(copyOf, "copyOf(this, newSize)");
            this.f4756g = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f4757h, i15);
            r6.k.e(copyOf2, "copyOf(this, newSize)");
            this.f4757h = copyOf2;
        }
        int i16 = this.f4758i - i7;
        if (i16 != 0) {
            long[] jArr2 = this.f4756g;
            int i17 = i7 + 1;
            r6.k.f(jArr2, "<this>");
            System.arraycopy(jArr2, i7, jArr2, i17, i16);
            Object[] objArr3 = this.f4757h;
            e6.k.X(objArr3, objArr3, i17, i7, this.f4758i);
        }
        this.f4756g[i7] = j8;
        this.f4757h[i7] = obj;
        this.f4758i++;
    }

    public final int c() {
        if (this.f4755f) {
            int i7 = this.f4758i;
            long[] jArr = this.f4756g;
            Object[] objArr = this.f4757h;
            int i8 = 0;
            for (int i9 = 0; i9 < i7; i9++) {
                Object obj = objArr[i9];
                if (obj != m.f4759a) {
                    if (i9 != i8) {
                        jArr[i8] = jArr[i9];
                        objArr[i8] = obj;
                        objArr[i9] = null;
                    }
                    i8++;
                }
            }
            this.f4755f = false;
            this.f4758i = i8;
        }
        return this.f4758i;
    }

    public final Object clone() {
        Object clone = super.clone();
        r6.k.d(clone, "null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>");
        l lVar = (l) clone;
        lVar.f4756g = (long[]) this.f4756g.clone();
        lVar.f4757h = (Object[]) this.f4757h.clone();
        return lVar;
    }

    public final Object d(int i7) {
        int i8;
        if (i7 < 0 || i7 >= (i8 = this.f4758i)) {
            j.a.c("Expected index to be within 0..size()-1, but was " + i7);
            throw null;
        }
        if (this.f4755f) {
            long[] jArr = this.f4756g;
            Object[] objArr = this.f4757h;
            int i9 = 0;
            for (int i10 = 0; i10 < i8; i10++) {
                Object obj = objArr[i10];
                if (obj != m.f4759a) {
                    if (i10 != i9) {
                        jArr[i9] = jArr[i10];
                        objArr[i9] = obj;
                        objArr[i10] = null;
                    }
                    i9++;
                }
            }
            this.f4755f = false;
            this.f4758i = i9;
        }
        return this.f4757h[i7];
    }

    public final String toString() {
        if (c() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f4758i * 28);
        sb.append('{');
        int i7 = this.f4758i;
        for (int i8 = 0; i8 < i7; i8++) {
            if (i8 > 0) {
                sb.append(", ");
            }
            sb.append(a(i8));
            sb.append('=');
            Object d8 = d(i8);
            if (d8 != sb) {
                sb.append(d8);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        r6.k.e(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }
}
