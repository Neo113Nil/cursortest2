package q;

import java.util.Arrays;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class k implements Cloneable {

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ int[] f3116f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object[] f3117g;
    public /* synthetic */ int h;

    public k() {
        int i;
        int i4 = 4;
        while (true) {
            i = 40;
            if (i4 >= 32) {
                break;
            }
            int i5 = (1 << i4) - 12;
            if (40 <= i5) {
                i = i5;
                break;
            }
            i4++;
        }
        int i6 = i / 4;
        this.f3116f = new int[i6];
        this.f3117g = new Object[i6];
    }

    public final void a(int i, Object obj) {
        int i4 = this.h;
        if (i4 != 0 && i <= this.f3116f[i4 - 1]) {
            c(i, obj);
            return;
        }
        if (i4 >= this.f3116f.length) {
            int i5 = (i4 + 1) * 4;
            int i6 = 4;
            while (true) {
                if (i6 >= 32) {
                    break;
                }
                int i7 = (1 << i6) - 12;
                if (i5 <= i7) {
                    i5 = i7;
                    break;
                }
                i6++;
            }
            int i8 = i5 / 4;
            int[] copyOf = Arrays.copyOf(this.f3116f, i8);
            i3.d.d(copyOf, "copyOf(this, newSize)");
            this.f3116f = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f3117g, i8);
            i3.d.d(copyOf2, "copyOf(this, newSize)");
            this.f3117g = copyOf2;
        }
        this.f3116f[i4] = i;
        this.f3117g[i4] = obj;
        this.h = i4 + 1;
    }

    public final Object b(int i) {
        Object obj;
        int a5 = r.a.a(this.h, i, this.f3116f);
        if (a5 < 0 || (obj = this.f3117g[a5]) == i.f3113b) {
            return null;
        }
        return obj;
    }

    public final void c(int i, Object obj) {
        int a5 = r.a.a(this.h, i, this.f3116f);
        if (a5 >= 0) {
            this.f3117g[a5] = obj;
            return;
        }
        int i4 = ~a5;
        int i5 = this.h;
        if (i4 < i5) {
            Object[] objArr = this.f3117g;
            if (objArr[i4] == i.f3113b) {
                this.f3116f[i4] = i;
                objArr[i4] = obj;
                return;
            }
        }
        if (i5 >= this.f3116f.length) {
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
            int[] copyOf = Arrays.copyOf(this.f3116f, i9);
            i3.d.d(copyOf, "copyOf(this, newSize)");
            this.f3116f = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f3117g, i9);
            i3.d.d(copyOf2, "copyOf(this, newSize)");
            this.f3117g = copyOf2;
        }
        int i10 = this.h;
        if (i10 - i4 != 0) {
            int[] iArr = this.f3116f;
            int i11 = i4 + 1;
            x2.g.G(i11, i4, i10, iArr, iArr);
            Object[] objArr2 = this.f3117g;
            x2.g.H(objArr2, objArr2, i11, i4, this.h);
        }
        this.f3116f[i4] = i;
        this.f3117g[i4] = obj;
        this.h++;
    }

    public final Object clone() {
        Object clone = super.clone();
        i3.d.c(clone, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>");
        k kVar = (k) clone;
        kVar.f3116f = (int[]) this.f3116f.clone();
        kVar.f3117g = (Object[]) this.f3117g.clone();
        return kVar;
    }

    public final String toString() {
        int i = this.h;
        if (i <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i * 28);
        sb.append('{');
        int i4 = this.h;
        for (int i5 = 0; i5 < i4; i5++) {
            if (i5 > 0) {
                sb.append(", ");
            }
            sb.append(this.f3116f[i5]);
            sb.append('=');
            Object obj = this.f3117g[i5];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        i3.d.d(sb2, "buffer.toString()");
        return sb2;
    }
}
