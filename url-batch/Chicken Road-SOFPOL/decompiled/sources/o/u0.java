package o;

import java.util.Arrays;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class u0 implements Cloneable {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ boolean f5547d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ int[] f5548e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object[] f5549f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ int f5550g;

    public u0(int i) {
        int i8;
        int i9 = 4;
        while (true) {
            i8 = 40;
            if (i9 >= 32) {
                break;
            }
            int i10 = (1 << i9) - 12;
            if (40 <= i10) {
                i8 = i10;
                break;
            }
            i9++;
        }
        int i11 = i8 / 4;
        this.f5548e = new int[i11];
        this.f5549f = new Object[i11];
    }

    public final void a(int i, Object obj) {
        int i8 = this.f5550g;
        if (i8 != 0 && i <= this.f5548e[i8 - 1]) {
            e(i, obj);
            return;
        }
        if (this.f5547d && i8 >= this.f5548e.length) {
            r.a(this);
        }
        int i9 = this.f5550g;
        if (i9 >= this.f5548e.length) {
            int i10 = (i9 + 1) * 4;
            int i11 = 4;
            while (true) {
                if (i11 >= 32) {
                    break;
                }
                int i12 = (1 << i11) - 12;
                if (i10 <= i12) {
                    i10 = i12;
                    break;
                }
                i11++;
            }
            int i13 = i10 / 4;
            int[] copyOf = Arrays.copyOf(this.f5548e, i13);
            q6.i.d(copyOf, "copyOf(...)");
            this.f5548e = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f5549f, i13);
            q6.i.d(copyOf2, "copyOf(...)");
            this.f5549f = copyOf2;
        }
        this.f5548e[i9] = i;
        this.f5549f[i9] = obj;
        this.f5550g = i9 + 1;
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final u0 clone() {
        Object clone = super.clone();
        q6.i.c(clone, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>");
        u0 u0Var = (u0) clone;
        u0Var.f5548e = (int[]) this.f5548e.clone();
        u0Var.f5549f = (Object[]) this.f5549f.clone();
        return u0Var;
    }

    public final Object c(int i) {
        Object obj;
        int a8 = p.a.a(this.f5550g, i, this.f5548e);
        if (a8 < 0 || (obj = this.f5549f[a8]) == r.f5527c) {
            return null;
        }
        return obj;
    }

    public final int d(int i) {
        if (this.f5547d) {
            r.a(this);
        }
        return this.f5548e[i];
    }

    public final void e(int i, Object obj) {
        int a8 = p.a.a(this.f5550g, i, this.f5548e);
        if (a8 >= 0) {
            this.f5549f[a8] = obj;
            return;
        }
        int i8 = ~a8;
        int i9 = this.f5550g;
        if (i8 < i9) {
            Object[] objArr = this.f5549f;
            if (objArr[i8] == r.f5527c) {
                this.f5548e[i8] = i;
                objArr[i8] = obj;
                return;
            }
        }
        if (this.f5547d && i9 >= this.f5548e.length) {
            r.a(this);
            i8 = ~p.a.a(this.f5550g, i, this.f5548e);
        }
        int i10 = this.f5550g;
        if (i10 >= this.f5548e.length) {
            int i11 = (i10 + 1) * 4;
            int i12 = 4;
            while (true) {
                if (i12 >= 32) {
                    break;
                }
                int i13 = (1 << i12) - 12;
                if (i11 <= i13) {
                    i11 = i13;
                    break;
                }
                i12++;
            }
            int i14 = i11 / 4;
            int[] copyOf = Arrays.copyOf(this.f5548e, i14);
            q6.i.d(copyOf, "copyOf(...)");
            this.f5548e = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f5549f, i14);
            q6.i.d(copyOf2, "copyOf(...)");
            this.f5549f = copyOf2;
        }
        int i15 = this.f5550g;
        if (i15 - i8 != 0) {
            int[] iArr = this.f5548e;
            int i16 = i8 + 1;
            d6.l.F(i16, i8, i15, iArr, iArr);
            Object[] objArr2 = this.f5549f;
            d6.l.H(objArr2, objArr2, i16, i8, this.f5550g);
        }
        this.f5548e[i8] = i;
        this.f5549f[i8] = obj;
        this.f5550g++;
    }

    public final int f() {
        if (this.f5547d) {
            r.a(this);
        }
        return this.f5550g;
    }

    public final Object g(int i) {
        if (this.f5547d) {
            r.a(this);
        }
        Object[] objArr = this.f5549f;
        if (i < objArr.length) {
            return objArr[i];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public final String toString() {
        if (f() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f5550g * 28);
        sb.append('{');
        int i = this.f5550g;
        for (int i8 = 0; i8 < i; i8++) {
            if (i8 > 0) {
                sb.append(", ");
            }
            sb.append(d(i8));
            sb.append('=');
            Object g3 = g(i8);
            if (g3 != this) {
                sb.append(g3);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        q6.i.d(sb2, "toString(...)");
        return sb2;
    }
}
