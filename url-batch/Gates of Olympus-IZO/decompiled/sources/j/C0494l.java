package j;

import java.util.Arrays;
import k.AbstractC0522a;

/* renamed from: j.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0494l implements Cloneable {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ boolean f5169d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ long[] f5170e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object[] f5171f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ int f5172g;

    public C0494l(int i3) {
        if (i3 == 0) {
            this.f5170e = AbstractC0522a.f5303b;
            this.f5171f = AbstractC0522a.f5304c;
            return;
        }
        int i4 = i3 * 8;
        int i5 = 4;
        while (true) {
            if (i5 >= 32) {
                break;
            }
            int i6 = (1 << i5) - 12;
            if (i4 <= i6) {
                i4 = i6;
                break;
            }
            i5++;
        }
        int i7 = i4 / 8;
        this.f5170e = new long[i7];
        this.f5171f = new Object[i7];
    }

    public final long a(int i3) {
        if (!(i3 >= 0 && i3 < this.f5172g)) {
            AbstractC0522a.c("Expected index to be within 0..size()-1, but was " + i3);
            throw null;
        }
        if (this.f5169d) {
            int i4 = this.f5172g;
            long[] jArr = this.f5170e;
            Object[] objArr = this.f5171f;
            int i5 = 0;
            for (int i6 = 0; i6 < i4; i6++) {
                Object obj = objArr[i6];
                if (obj != AbstractC0495m.f5173a) {
                    if (i6 != i5) {
                        jArr[i5] = jArr[i6];
                        objArr[i5] = obj;
                        objArr[i6] = null;
                    }
                    i5++;
                }
            }
            this.f5169d = false;
            this.f5172g = i5;
        }
        return this.f5170e[i3];
    }

    public final void b(long j3, Object obj) {
        int b2 = AbstractC0522a.b(this.f5170e, this.f5172g, j3);
        if (b2 >= 0) {
            this.f5171f[b2] = obj;
            return;
        }
        int i3 = ~b2;
        int i4 = this.f5172g;
        Object obj2 = AbstractC0495m.f5173a;
        if (i3 < i4) {
            Object[] objArr = this.f5171f;
            if (objArr[i3] == obj2) {
                this.f5170e[i3] = j3;
                objArr[i3] = obj;
                return;
            }
        }
        if (this.f5169d) {
            long[] jArr = this.f5170e;
            if (i4 >= jArr.length) {
                Object[] objArr2 = this.f5171f;
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
                this.f5169d = false;
                this.f5172g = i5;
                i3 = ~AbstractC0522a.b(this.f5170e, i5, j3);
            }
        }
        int i7 = this.f5172g;
        if (i7 >= this.f5170e.length) {
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
            long[] copyOf = Arrays.copyOf(this.f5170e, i11);
            Z1.i.e(copyOf, "copyOf(this, newSize)");
            this.f5170e = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f5171f, i11);
            Z1.i.e(copyOf2, "copyOf(this, newSize)");
            this.f5171f = copyOf2;
        }
        int i12 = this.f5172g - i3;
        if (i12 != 0) {
            long[] jArr2 = this.f5170e;
            int i13 = i3 + 1;
            Z1.i.f(jArr2, "<this>");
            System.arraycopy(jArr2, i3, jArr2, i13, i12);
            Object[] objArr3 = this.f5171f;
            M1.k.X(objArr3, objArr3, i13, i3, this.f5172g);
        }
        this.f5170e[i3] = j3;
        this.f5171f[i3] = obj;
        this.f5172g++;
    }

    public final int c() {
        if (this.f5169d) {
            int i3 = this.f5172g;
            long[] jArr = this.f5170e;
            Object[] objArr = this.f5171f;
            int i4 = 0;
            for (int i5 = 0; i5 < i3; i5++) {
                Object obj = objArr[i5];
                if (obj != AbstractC0495m.f5173a) {
                    if (i5 != i4) {
                        jArr[i4] = jArr[i5];
                        objArr[i4] = obj;
                        objArr[i5] = null;
                    }
                    i4++;
                }
            }
            this.f5169d = false;
            this.f5172g = i4;
        }
        return this.f5172g;
    }

    public final Object clone() {
        Object clone = super.clone();
        Z1.i.d(clone, "null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>");
        C0494l c0494l = (C0494l) clone;
        c0494l.f5170e = (long[]) this.f5170e.clone();
        c0494l.f5171f = (Object[]) this.f5171f.clone();
        return c0494l;
    }

    public final Object d(int i3) {
        if (!(i3 >= 0 && i3 < this.f5172g)) {
            AbstractC0522a.c("Expected index to be within 0..size()-1, but was " + i3);
            throw null;
        }
        if (this.f5169d) {
            int i4 = this.f5172g;
            long[] jArr = this.f5170e;
            Object[] objArr = this.f5171f;
            int i5 = 0;
            for (int i6 = 0; i6 < i4; i6++) {
                Object obj = objArr[i6];
                if (obj != AbstractC0495m.f5173a) {
                    if (i6 != i5) {
                        jArr[i5] = jArr[i6];
                        objArr[i5] = obj;
                        objArr[i6] = null;
                    }
                    i5++;
                }
            }
            this.f5169d = false;
            this.f5172g = i5;
        }
        return this.f5171f[i3];
    }

    public final String toString() {
        if (c() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f5172g * 28);
        sb.append('{');
        int i3 = this.f5172g;
        for (int i4 = 0; i4 < i3; i4++) {
            if (i4 > 0) {
                sb.append(", ");
            }
            sb.append(a(i4));
            sb.append('=');
            Object d3 = d(i4);
            if (d3 != sb) {
                sb.append(d3);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        Z1.i.e(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }
}
