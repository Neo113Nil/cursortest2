package o;

import java.util.Arrays;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class q implements Cloneable {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ boolean f5520d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ long[] f5521e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object[] f5522f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ int f5523g;

    public q(int i) {
        if (i == 0) {
            this.f5521e = p.a.f5708b;
            this.f5522f = p.a.f5709c;
            return;
        }
        int i8 = i * 8;
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
        this.f5521e = new long[i11];
        this.f5522f = new Object[i11];
    }

    public final void a() {
        int i = this.f5523g;
        Object[] objArr = this.f5522f;
        for (int i8 = 0; i8 < i; i8++) {
            objArr[i8] = null;
        }
        this.f5523g = 0;
        this.f5520d = false;
    }

    public final Object b(long j7) {
        Object obj;
        int b8 = p.a.b(this.f5521e, this.f5523g, j7);
        if (b8 < 0 || (obj = this.f5522f[b8]) == r.f5525a) {
            return null;
        }
        return obj;
    }

    public final int c(long j7) {
        if (this.f5520d) {
            int i = this.f5523g;
            long[] jArr = this.f5521e;
            Object[] objArr = this.f5522f;
            int i8 = 0;
            for (int i9 = 0; i9 < i; i9++) {
                Object obj = objArr[i9];
                if (obj != r.f5525a) {
                    if (i9 != i8) {
                        jArr[i8] = jArr[i9];
                        objArr[i8] = obj;
                        objArr[i9] = null;
                    }
                    i8++;
                }
            }
            this.f5520d = false;
            this.f5523g = i8;
        }
        return p.a.b(this.f5521e, this.f5523g, j7);
    }

    public final Object clone() {
        Object clone = super.clone();
        q6.i.c(clone, "null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>");
        q qVar = (q) clone;
        qVar.f5521e = (long[]) this.f5521e.clone();
        qVar.f5522f = (Object[]) this.f5522f.clone();
        return qVar;
    }

    public final long d(int i) {
        int i8;
        if (i < 0 || i >= (i8 = this.f5523g)) {
            p.a.c("Expected index to be within 0..size()-1, but was " + i);
            throw null;
        }
        if (this.f5520d) {
            long[] jArr = this.f5521e;
            Object[] objArr = this.f5522f;
            int i9 = 0;
            for (int i10 = 0; i10 < i8; i10++) {
                Object obj = objArr[i10];
                if (obj != r.f5525a) {
                    if (i10 != i9) {
                        jArr[i9] = jArr[i10];
                        objArr[i9] = obj;
                        objArr[i10] = null;
                    }
                    i9++;
                }
            }
            this.f5520d = false;
            this.f5523g = i9;
        }
        return this.f5521e[i];
    }

    public final void e(long j7, Object obj) {
        Object obj2 = r.f5525a;
        int b8 = p.a.b(this.f5521e, this.f5523g, j7);
        if (b8 >= 0) {
            this.f5522f[b8] = obj;
            return;
        }
        int i = ~b8;
        int i8 = this.f5523g;
        if (i < i8) {
            Object[] objArr = this.f5522f;
            if (objArr[i] == obj2) {
                this.f5521e[i] = j7;
                objArr[i] = obj;
                return;
            }
        }
        if (this.f5520d) {
            long[] jArr = this.f5521e;
            if (i8 >= jArr.length) {
                Object[] objArr2 = this.f5522f;
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
                this.f5520d = false;
                this.f5523g = i9;
                i = ~p.a.b(this.f5521e, i9, j7);
            }
        }
        int i11 = this.f5523g;
        if (i11 >= this.f5521e.length) {
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
            long[] copyOf = Arrays.copyOf(this.f5521e, i15);
            q6.i.d(copyOf, "copyOf(...)");
            this.f5521e = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f5522f, i15);
            q6.i.d(copyOf2, "copyOf(...)");
            this.f5522f = copyOf2;
        }
        int i16 = this.f5523g;
        if (i16 - i != 0) {
            long[] jArr2 = this.f5521e;
            int i17 = i + 1;
            d6.l.G(jArr2, jArr2, i17, i, i16);
            Object[] objArr3 = this.f5522f;
            d6.l.H(objArr3, objArr3, i17, i, this.f5523g);
        }
        this.f5521e[i] = j7;
        this.f5522f[i] = obj;
        this.f5523g++;
    }

    public final void f(long j7) {
        int b8 = p.a.b(this.f5521e, this.f5523g, j7);
        if (b8 >= 0) {
            Object[] objArr = this.f5522f;
            Object obj = objArr[b8];
            Object obj2 = r.f5525a;
            if (obj != obj2) {
                objArr[b8] = obj2;
                this.f5520d = true;
            }
        }
    }

    public final int g() {
        if (this.f5520d) {
            int i = this.f5523g;
            long[] jArr = this.f5521e;
            Object[] objArr = this.f5522f;
            int i8 = 0;
            for (int i9 = 0; i9 < i; i9++) {
                Object obj = objArr[i9];
                if (obj != r.f5525a) {
                    if (i9 != i8) {
                        jArr[i8] = jArr[i9];
                        objArr[i8] = obj;
                        objArr[i9] = null;
                    }
                    i8++;
                }
            }
            this.f5520d = false;
            this.f5523g = i8;
        }
        return this.f5523g;
    }

    public final Object h(int i) {
        int i8;
        if (i < 0 || i >= (i8 = this.f5523g)) {
            p.a.c("Expected index to be within 0..size()-1, but was " + i);
            throw null;
        }
        if (this.f5520d) {
            long[] jArr = this.f5521e;
            Object[] objArr = this.f5522f;
            int i9 = 0;
            for (int i10 = 0; i10 < i8; i10++) {
                Object obj = objArr[i10];
                if (obj != r.f5525a) {
                    if (i10 != i9) {
                        jArr[i9] = jArr[i10];
                        objArr[i9] = obj;
                        objArr[i10] = null;
                    }
                    i9++;
                }
            }
            this.f5520d = false;
            this.f5523g = i9;
        }
        return this.f5522f[i];
    }

    public final String toString() {
        if (g() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f5523g * 28);
        sb.append('{');
        int i = this.f5523g;
        for (int i8 = 0; i8 < i; i8++) {
            if (i8 > 0) {
                sb.append(", ");
            }
            sb.append(d(i8));
            sb.append('=');
            Object h8 = h(i8);
            if (h8 != sb) {
                sb.append(h8);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        q6.i.d(sb2, "toString(...)");
        return sb2;
    }

    public /* synthetic */ q(Object obj) {
        this(10);
    }
}
