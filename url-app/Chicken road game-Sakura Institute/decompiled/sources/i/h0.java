package i;

import java.util.Arrays;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class h0 implements Cloneable {

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ boolean f4746f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ int[] f4747g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object[] f4748h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ int f4749i;

    public h0() {
        int i7;
        int i8 = 4;
        while (true) {
            i7 = 40;
            if (i8 >= 32) {
                break;
            }
            int i9 = (1 << i8) - 12;
            if (40 <= i9) {
                i7 = i9;
                break;
            }
            i8++;
        }
        int i10 = i7 / 4;
        this.f4747g = new int[i10];
        this.f4748h = new Object[i10];
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final h0 clone() {
        Object clone = super.clone();
        r6.k.d(clone, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>");
        h0 h0Var = (h0) clone;
        h0Var.f4747g = (int[]) this.f4747g.clone();
        h0Var.f4748h = (Object[]) this.f4748h.clone();
        return h0Var;
    }

    public final Object b(int i7) {
        Object obj;
        int a3 = j.a.a(this.f4747g, this.f4749i, i7);
        if (a3 < 0 || (obj = this.f4748h[a3]) == m.f4761c) {
            return null;
        }
        return obj;
    }

    public final int c(int i7) {
        if (this.f4746f) {
            m.a(this);
        }
        return this.f4747g[i7];
    }

    public final void d(int i7, Object obj) {
        int a3 = j.a.a(this.f4747g, this.f4749i, i7);
        if (a3 >= 0) {
            this.f4748h[a3] = obj;
            return;
        }
        int i8 = ~a3;
        int i9 = this.f4749i;
        if (i8 < i9) {
            Object[] objArr = this.f4748h;
            if (objArr[i8] == m.f4761c) {
                this.f4747g[i8] = i7;
                objArr[i8] = obj;
                return;
            }
        }
        if (this.f4746f && i9 >= this.f4747g.length) {
            m.a(this);
            i8 = ~j.a.a(this.f4747g, this.f4749i, i7);
        }
        int i10 = this.f4749i;
        if (i10 >= this.f4747g.length) {
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
            int[] copyOf = Arrays.copyOf(this.f4747g, i14);
            r6.k.e(copyOf, "copyOf(this, newSize)");
            this.f4747g = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f4748h, i14);
            r6.k.e(copyOf2, "copyOf(this, newSize)");
            this.f4748h = copyOf2;
        }
        int i15 = this.f4749i;
        if (i15 - i8 != 0) {
            int[] iArr = this.f4747g;
            int i16 = i8 + 1;
            e6.k.W(iArr, iArr, i16, i8, i15);
            Object[] objArr2 = this.f4748h;
            e6.k.X(objArr2, objArr2, i16, i8, this.f4749i);
        }
        this.f4747g[i8] = i7;
        this.f4748h[i8] = obj;
        this.f4749i++;
    }

    public final int e() {
        if (this.f4746f) {
            m.a(this);
        }
        return this.f4749i;
    }

    public final Object f(int i7) {
        if (this.f4746f) {
            m.a(this);
        }
        return this.f4748h[i7];
    }

    public final String toString() {
        if (e() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f4749i * 28);
        sb.append('{');
        int i7 = this.f4749i;
        for (int i8 = 0; i8 < i7; i8++) {
            if (i8 > 0) {
                sb.append(", ");
            }
            sb.append(c(i8));
            sb.append('=');
            Object f9 = f(i8);
            if (f9 != this) {
                sb.append(f9);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        r6.k.e(sb2, "buffer.toString()");
        return sb2;
    }
}
