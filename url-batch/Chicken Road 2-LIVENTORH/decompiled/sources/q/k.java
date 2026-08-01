package q;

import java.util.Arrays;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class k implements Cloneable {

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ int[] f3037f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object[] f3038g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ int f3039h;

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
        this.f3037f = new int[i6];
        this.f3038g = new Object[i6];
    }

    public final void a(int i, Object obj) {
        int i4 = this.f3039h;
        if (i4 != 0 && i <= this.f3037f[i4 - 1]) {
            c(i, obj);
            return;
        }
        if (i4 >= this.f3037f.length) {
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
            int[] copyOf = Arrays.copyOf(this.f3037f, i8);
            f3.d.d(copyOf, "copyOf(this, newSize)");
            this.f3037f = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f3038g, i8);
            f3.d.d(copyOf2, "copyOf(this, newSize)");
            this.f3038g = copyOf2;
        }
        this.f3037f[i4] = i;
        this.f3038g[i4] = obj;
        this.f3039h = i4 + 1;
    }

    public final Object b(int i) {
        Object obj;
        int a2 = r.a.a(this.f3039h, i, this.f3037f);
        if (a2 < 0 || (obj = this.f3038g[a2]) == i.f3033b) {
            return null;
        }
        return obj;
    }

    public final void c(int i, Object obj) {
        int a2 = r.a.a(this.f3039h, i, this.f3037f);
        if (a2 >= 0) {
            this.f3038g[a2] = obj;
            return;
        }
        int i4 = ~a2;
        int i5 = this.f3039h;
        if (i4 < i5) {
            Object[] objArr = this.f3038g;
            if (objArr[i4] == i.f3033b) {
                this.f3037f[i4] = i;
                objArr[i4] = obj;
                return;
            }
        }
        if (i5 >= this.f3037f.length) {
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
            int[] copyOf = Arrays.copyOf(this.f3037f, i9);
            f3.d.d(copyOf, "copyOf(this, newSize)");
            this.f3037f = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f3038g, i9);
            f3.d.d(copyOf2, "copyOf(this, newSize)");
            this.f3038g = copyOf2;
        }
        int i10 = this.f3039h;
        if (i10 - i4 != 0) {
            int[] iArr = this.f3037f;
            int i11 = i4 + 1;
            a3.d.W(i11, i4, i10, iArr, iArr);
            Object[] objArr2 = this.f3038g;
            a3.d.X(objArr2, objArr2, i11, i4, this.f3039h);
        }
        this.f3037f[i4] = i;
        this.f3038g[i4] = obj;
        this.f3039h++;
    }

    public final Object clone() {
        Object clone = super.clone();
        f3.d.c(clone, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>");
        k kVar = (k) clone;
        kVar.f3037f = (int[]) this.f3037f.clone();
        kVar.f3038g = (Object[]) this.f3038g.clone();
        return kVar;
    }

    public final String toString() {
        int i = this.f3039h;
        if (i <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i * 28);
        sb.append('{');
        int i4 = this.f3039h;
        for (int i5 = 0; i5 < i4; i5++) {
            if (i5 > 0) {
                sb.append(", ");
            }
            sb.append(this.f3037f[i5]);
            sb.append('=');
            Object obj = this.f3038g[i5];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        f3.d.d(sb2, "buffer.toString()");
        return sb2;
    }
}
