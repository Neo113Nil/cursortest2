package q;

import androidx.fragment.app.w0;
import java.util.Arrays;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class h implements Cloneable {

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ boolean f3029f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ long[] f3030g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object[] f3031h;
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
        this.f3030g = new long[i6];
        this.f3031h = new Object[i6];
    }

    public final void a() {
        int i = this.i;
        Object[] objArr = this.f3031h;
        for (int i4 = 0; i4 < i; i4++) {
            objArr[i4] = null;
        }
        this.i = 0;
        this.f3029f = false;
    }

    public final Object b(long j4) {
        Object obj;
        int b4 = r.a.b(this.f3030g, this.i, j4);
        if (b4 < 0 || (obj = this.f3031h[b4]) == i.f3032a) {
            return null;
        }
        return obj;
    }

    public final long c(int i) {
        int i4;
        if (i < 0 || i >= (i4 = this.i)) {
            throw new IllegalArgumentException(w0.d("Expected index to be within 0..size()-1, but was ", i).toString());
        }
        if (this.f3029f) {
            long[] jArr = this.f3030g;
            Object[] objArr = this.f3031h;
            int i5 = 0;
            for (int i6 = 0; i6 < i4; i6++) {
                Object obj = objArr[i6];
                if (obj != i.f3032a) {
                    if (i6 != i5) {
                        jArr[i5] = jArr[i6];
                        objArr[i5] = obj;
                        objArr[i6] = null;
                    }
                    i5++;
                }
            }
            this.f3029f = false;
            this.i = i5;
        }
        return this.f3030g[i];
    }

    public final Object clone() {
        Object clone = super.clone();
        f3.d.c(clone, "null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>");
        h hVar = (h) clone;
        hVar.f3030g = (long[]) this.f3030g.clone();
        hVar.f3031h = (Object[]) this.f3031h.clone();
        return hVar;
    }

    public final void d(long j4, Object obj) {
        Object obj2 = i.f3032a;
        int b4 = r.a.b(this.f3030g, this.i, j4);
        if (b4 >= 0) {
            this.f3031h[b4] = obj;
            return;
        }
        int i = ~b4;
        int i4 = this.i;
        if (i < i4) {
            Object[] objArr = this.f3031h;
            if (objArr[i] == obj2) {
                this.f3030g[i] = j4;
                objArr[i] = obj;
                return;
            }
        }
        if (this.f3029f) {
            long[] jArr = this.f3030g;
            if (i4 >= jArr.length) {
                Object[] objArr2 = this.f3031h;
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
                this.f3029f = false;
                this.i = i5;
                i = ~r.a.b(this.f3030g, i5, j4);
            }
        }
        int i7 = this.i;
        if (i7 >= this.f3030g.length) {
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
            long[] copyOf = Arrays.copyOf(this.f3030g, i11);
            f3.d.d(copyOf, "copyOf(this, newSize)");
            this.f3030g = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f3031h, i11);
            f3.d.d(copyOf2, "copyOf(this, newSize)");
            this.f3031h = copyOf2;
        }
        int i12 = this.i - i;
        if (i12 != 0) {
            long[] jArr2 = this.f3030g;
            int i13 = i + 1;
            f3.d.e(jArr2, "<this>");
            System.arraycopy(jArr2, i, jArr2, i13, i12);
            Object[] objArr3 = this.f3031h;
            a3.d.X(objArr3, objArr3, i13, i, this.i);
        }
        this.f3030g[i] = j4;
        this.f3031h[i] = obj;
        this.i++;
    }

    public final int e() {
        if (this.f3029f) {
            int i = this.i;
            long[] jArr = this.f3030g;
            Object[] objArr = this.f3031h;
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                Object obj = objArr[i5];
                if (obj != i.f3032a) {
                    if (i5 != i4) {
                        jArr[i4] = jArr[i5];
                        objArr[i4] = obj;
                        objArr[i5] = null;
                    }
                    i4++;
                }
            }
            this.f3029f = false;
            this.i = i4;
        }
        return this.i;
    }

    public final Object f(int i) {
        int i4;
        if (i < 0 || i >= (i4 = this.i)) {
            throw new IllegalArgumentException(w0.d("Expected index to be within 0..size()-1, but was ", i).toString());
        }
        if (this.f3029f) {
            long[] jArr = this.f3030g;
            Object[] objArr = this.f3031h;
            int i5 = 0;
            for (int i6 = 0; i6 < i4; i6++) {
                Object obj = objArr[i6];
                if (obj != i.f3032a) {
                    if (i6 != i5) {
                        jArr[i5] = jArr[i6];
                        objArr[i5] = obj;
                        objArr[i6] = null;
                    }
                    i5++;
                }
            }
            this.f3029f = false;
            this.i = i5;
        }
        return this.f3031h[i];
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
            Object f2 = f(i4);
            if (f2 != sb) {
                sb.append(f2);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        f3.d.d(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }
}
