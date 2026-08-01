package q;

import java.util.Arrays;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class h implements Cloneable {

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ boolean f3110f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ long[] f3111g;
    public /* synthetic */ Object[] h;
    public /* synthetic */ int i;

    public h() {
        int i;
        int i4 = 4;
        while (true) {
            i = 80;
            if (i4 >= 32) {
                break;
            }
            int i5 = (1 << i4) - 12;
            if (80 <= i5) {
                i = i5;
                break;
            }
            i4++;
        }
        int i6 = i / 8;
        this.f3111g = new long[i6];
        this.h = new Object[i6];
    }

    public final void a() {
        int i = this.i;
        Object[] objArr = this.h;
        for (int i4 = 0; i4 < i; i4++) {
            objArr[i4] = null;
        }
        this.i = 0;
        this.f3110f = false;
    }

    public final Object b(long j2) {
        Object obj;
        int b2 = r.a.b(this.f3111g, this.i, j2);
        if (b2 < 0 || (obj = this.h[b2]) == i.f3112a) {
            return null;
        }
        return obj;
    }

    public final long c(int i) {
        int i4;
        if (i < 0 || i >= (i4 = this.i)) {
            throw new IllegalArgumentException(a4.b.f("Expected index to be within 0..size()-1, but was ", i).toString());
        }
        if (this.f3110f) {
            long[] jArr = this.f3111g;
            Object[] objArr = this.h;
            int i5 = 0;
            for (int i6 = 0; i6 < i4; i6++) {
                Object obj = objArr[i6];
                if (obj != i.f3112a) {
                    if (i6 != i5) {
                        jArr[i5] = jArr[i6];
                        objArr[i5] = obj;
                        objArr[i6] = null;
                    }
                    i5++;
                }
            }
            this.f3110f = false;
            this.i = i5;
        }
        return this.f3111g[i];
    }

    public final Object clone() {
        Object clone = super.clone();
        i3.d.c(clone, "null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>");
        h hVar = (h) clone;
        hVar.f3111g = (long[]) this.f3111g.clone();
        hVar.h = (Object[]) this.h.clone();
        return hVar;
    }

    public final void d(long j2, Object obj) {
        Object obj2 = i.f3112a;
        int b2 = r.a.b(this.f3111g, this.i, j2);
        if (b2 >= 0) {
            this.h[b2] = obj;
            return;
        }
        int i = ~b2;
        int i4 = this.i;
        if (i < i4) {
            Object[] objArr = this.h;
            if (objArr[i] == obj2) {
                this.f3111g[i] = j2;
                objArr[i] = obj;
                return;
            }
        }
        if (this.f3110f) {
            long[] jArr = this.f3111g;
            if (i4 >= jArr.length) {
                Object[] objArr2 = this.h;
                int i5 = 0;
                for (int i6 = 0; i6 < i4; i6++) {
                    Object obj3 = objArr2[i6];
                    if (obj3 != obj2) {
                        if (i6 != i5) {
                            jArr[i5] = jArr[i6];
                            objArr2[i5] = obj3;
                            objArr2[i6] = null;
                        }
                        i5++;
                    }
                }
                this.f3110f = false;
                this.i = i5;
                i = ~r.a.b(this.f3111g, i5, j2);
            }
        }
        int i7 = this.i;
        if (i7 >= this.f3111g.length) {
            int i8 = (i7 + 1) * 8;
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
            long[] copyOf = Arrays.copyOf(this.f3111g, i11);
            i3.d.d(copyOf, "copyOf(this, newSize)");
            this.f3111g = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.h, i11);
            i3.d.d(copyOf2, "copyOf(this, newSize)");
            this.h = copyOf2;
        }
        int i12 = this.i - i;
        if (i12 != 0) {
            long[] jArr2 = this.f3111g;
            int i13 = i + 1;
            i3.d.e(jArr2, "<this>");
            System.arraycopy(jArr2, i, jArr2, i13, i12);
            Object[] objArr3 = this.h;
            x2.g.H(objArr3, objArr3, i13, i, this.i);
        }
        this.f3111g[i] = j2;
        this.h[i] = obj;
        this.i++;
    }

    public final int e() {
        if (this.f3110f) {
            int i = this.i;
            long[] jArr = this.f3111g;
            Object[] objArr = this.h;
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                Object obj = objArr[i5];
                if (obj != i.f3112a) {
                    if (i5 != i4) {
                        jArr[i4] = jArr[i5];
                        objArr[i4] = obj;
                        objArr[i5] = null;
                    }
                    i4++;
                }
            }
            this.f3110f = false;
            this.i = i4;
        }
        return this.i;
    }

    public final Object f(int i) {
        int i4;
        if (i < 0 || i >= (i4 = this.i)) {
            throw new IllegalArgumentException(a4.b.f("Expected index to be within 0..size()-1, but was ", i).toString());
        }
        if (this.f3110f) {
            long[] jArr = this.f3111g;
            Object[] objArr = this.h;
            int i5 = 0;
            for (int i6 = 0; i6 < i4; i6++) {
                Object obj = objArr[i6];
                if (obj != i.f3112a) {
                    if (i6 != i5) {
                        jArr[i5] = jArr[i6];
                        objArr[i5] = obj;
                        objArr[i6] = null;
                    }
                    i5++;
                }
            }
            this.f3110f = false;
            this.i = i5;
        }
        return this.h[i];
    }

    public final String toString() {
        if (e() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.i * 28);
        sb.append('{');
        int i = this.i;
        for (int i4 = 0; i4 < i; i4++) {
            if (i4 > 0) {
                sb.append(", ");
            }
            sb.append(c(i4));
            sb.append('=');
            Object f5 = f(i4);
            if (f5 != sb) {
                sb.append(f5);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        i3.d.d(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }
}
