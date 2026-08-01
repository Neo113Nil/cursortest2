package n;

import java.util.Arrays;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class k implements Cloneable {

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ int[] f2936f;
    public /* synthetic */ Object[] g;
    public /* synthetic */ int h;

    public k() {
        int i4;
        int i5 = 4;
        while (true) {
            i4 = 40;
            if (i5 >= 32) {
                break;
            }
            int i6 = (1 << i5) - 12;
            if (40 <= i6) {
                i4 = i6;
                break;
            }
            i5++;
        }
        int i7 = i4 / 4;
        this.f2936f = new int[i7];
        this.g = new Object[i7];
    }

    public final void a(int i4, Object obj) {
        int i5 = this.h;
        if (i5 != 0 && i4 <= this.f2936f[i5 - 1]) {
            c(i4, obj);
            return;
        }
        if (i5 >= this.f2936f.length) {
            int i6 = (i5 + 1) * 4;
            int i7 = 4;
            while (true) {
                if (i7 >= 32) {
                    break;
                }
                int i8 = (1 << i7) - 12;
                if (i6 <= i8) {
                    i6 = i8;
                    break;
                }
                i7++;
            }
            int i9 = i6 / 4;
            int[] copyOf = Arrays.copyOf(this.f2936f, i9);
            u2.c.d(copyOf, "copyOf(this, newSize)");
            this.f2936f = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.g, i9);
            u2.c.d(copyOf2, "copyOf(this, newSize)");
            this.g = copyOf2;
        }
        this.f2936f[i5] = i4;
        this.g[i5] = obj;
        this.h = i5 + 1;
    }

    public final Object b(int i4) {
        Object obj;
        int a4 = o.a.a(this.h, i4, this.f2936f);
        if (a4 < 0 || (obj = this.g[a4]) == i.f2934b) {
            return null;
        }
        return obj;
    }

    public final void c(int i4, Object obj) {
        int a4 = o.a.a(this.h, i4, this.f2936f);
        if (a4 >= 0) {
            this.g[a4] = obj;
            return;
        }
        int i5 = ~a4;
        int i6 = this.h;
        if (i5 < i6) {
            Object[] objArr = this.g;
            if (objArr[i5] == i.f2934b) {
                this.f2936f[i5] = i4;
                objArr[i5] = obj;
                return;
            }
        }
        if (i6 >= this.f2936f.length) {
            int i7 = (i6 + 1) * 4;
            int i8 = 4;
            while (true) {
                if (i8 >= 32) {
                    break;
                }
                int i9 = (1 << i8) - 12;
                if (i7 <= i9) {
                    i7 = i9;
                    break;
                }
                i8++;
            }
            int i10 = i7 / 4;
            int[] copyOf = Arrays.copyOf(this.f2936f, i10);
            u2.c.d(copyOf, "copyOf(this, newSize)");
            this.f2936f = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.g, i10);
            u2.c.d(copyOf2, "copyOf(this, newSize)");
            this.g = copyOf2;
        }
        int i11 = this.h;
        if (i11 - i5 != 0) {
            int[] iArr = this.f2936f;
            int i12 = i5 + 1;
            n2.f.C(i12, i5, i11, iArr, iArr);
            Object[] objArr2 = this.g;
            n2.f.D(objArr2, objArr2, i12, i5, this.h);
        }
        this.f2936f[i5] = i4;
        this.g[i5] = obj;
        this.h++;
    }

    public final Object clone() {
        Object clone = super.clone();
        u2.c.c(clone, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>");
        k kVar = (k) clone;
        kVar.f2936f = (int[]) this.f2936f.clone();
        kVar.g = (Object[]) this.g.clone();
        return kVar;
    }

    public final String toString() {
        int i4 = this.h;
        if (i4 <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i4 * 28);
        sb.append('{');
        int i5 = this.h;
        for (int i6 = 0; i6 < i5; i6++) {
            if (i6 > 0) {
                sb.append(", ");
            }
            sb.append(this.f2936f[i6]);
            sb.append('=');
            Object obj = this.g[i6];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        u2.c.d(sb2, "buffer.toString()");
        return sb2;
    }
}
