package j;

import java.util.Arrays;
import k.AbstractC0561a;

/* renamed from: j.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0538l implements Cloneable {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ boolean f6287d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ long[] f6288e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object[] f6289f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ int f6290g;

    public C0538l(int i3) {
        if (i3 == 0) {
            this.f6288e = AbstractC0561a.f6409b;
            this.f6289f = AbstractC0561a.f6410c;
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
        this.f6288e = new long[i7];
        this.f6289f = new Object[i7];
    }

    public final long a(int i3) {
        if (!(i3 >= 0 && i3 < this.f6290g)) {
            AbstractC0561a.c("Expected index to be within 0..size()-1, but was " + i3);
            throw null;
        }
        if (this.f6287d) {
            int i4 = this.f6290g;
            long[] jArr = this.f6288e;
            Object[] objArr = this.f6289f;
            int i5 = 0;
            for (int i6 = 0; i6 < i4; i6++) {
                Object obj = objArr[i6];
                if (obj != AbstractC0539m.f6291a) {
                    if (i6 != i5) {
                        jArr[i5] = jArr[i6];
                        objArr[i5] = obj;
                        objArr[i6] = null;
                    }
                    i5++;
                }
            }
            this.f6287d = false;
            this.f6290g = i5;
        }
        return this.f6288e[i3];
    }

    public final void b(long j3, Object obj) {
        int b3 = AbstractC0561a.b(this.f6288e, this.f6290g, j3);
        if (b3 >= 0) {
            this.f6289f[b3] = obj;
            return;
        }
        int i3 = ~b3;
        int i4 = this.f6290g;
        Object obj2 = AbstractC0539m.f6291a;
        if (i3 < i4) {
            Object[] objArr = this.f6289f;
            if (objArr[i3] == obj2) {
                this.f6288e[i3] = j3;
                objArr[i3] = obj;
                return;
            }
        }
        if (this.f6287d) {
            long[] jArr = this.f6288e;
            if (i4 >= jArr.length) {
                Object[] objArr2 = this.f6289f;
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
                this.f6287d = false;
                this.f6290g = i5;
                i3 = ~AbstractC0561a.b(this.f6288e, i5, j3);
            }
        }
        int i7 = this.f6290g;
        if (i7 >= this.f6288e.length) {
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
            long[] copyOf = Arrays.copyOf(this.f6288e, i11);
            f2.j.e(copyOf, "copyOf(this, newSize)");
            this.f6288e = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f6289f, i11);
            f2.j.e(copyOf2, "copyOf(this, newSize)");
            this.f6289f = copyOf2;
        }
        int i12 = this.f6290g - i3;
        if (i12 != 0) {
            long[] jArr2 = this.f6288e;
            int i13 = i3 + 1;
            f2.j.f(jArr2, "<this>");
            System.arraycopy(jArr2, i3, jArr2, i13, i12);
            Object[] objArr3 = this.f6289f;
            S1.k.m0(objArr3, objArr3, i13, i3, this.f6290g);
        }
        this.f6288e[i3] = j3;
        this.f6289f[i3] = obj;
        this.f6290g++;
    }

    public final int c() {
        if (this.f6287d) {
            int i3 = this.f6290g;
            long[] jArr = this.f6288e;
            Object[] objArr = this.f6289f;
            int i4 = 0;
            for (int i5 = 0; i5 < i3; i5++) {
                Object obj = objArr[i5];
                if (obj != AbstractC0539m.f6291a) {
                    if (i5 != i4) {
                        jArr[i4] = jArr[i5];
                        objArr[i4] = obj;
                        objArr[i5] = null;
                    }
                    i4++;
                }
            }
            this.f6287d = false;
            this.f6290g = i4;
        }
        return this.f6290g;
    }

    public final Object clone() {
        Object clone = super.clone();
        f2.j.d(clone, "null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>");
        C0538l c0538l = (C0538l) clone;
        c0538l.f6288e = (long[]) this.f6288e.clone();
        c0538l.f6289f = (Object[]) this.f6289f.clone();
        return c0538l;
    }

    public final Object d(int i3) {
        if (!(i3 >= 0 && i3 < this.f6290g)) {
            AbstractC0561a.c("Expected index to be within 0..size()-1, but was " + i3);
            throw null;
        }
        if (this.f6287d) {
            int i4 = this.f6290g;
            long[] jArr = this.f6288e;
            Object[] objArr = this.f6289f;
            int i5 = 0;
            for (int i6 = 0; i6 < i4; i6++) {
                Object obj = objArr[i6];
                if (obj != AbstractC0539m.f6291a) {
                    if (i6 != i5) {
                        jArr[i5] = jArr[i6];
                        objArr[i5] = obj;
                        objArr[i6] = null;
                    }
                    i5++;
                }
            }
            this.f6287d = false;
            this.f6290g = i5;
        }
        return this.f6289f[i3];
    }

    public final String toString() {
        if (c() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f6290g * 28);
        sb.append('{');
        int i3 = this.f6290g;
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
        f2.j.e(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }
}
