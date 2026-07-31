package j;

import java.util.Arrays;
import k.AbstractC0561a;

/* renamed from: j.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0525G implements Cloneable {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ boolean f6259d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ int[] f6260e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object[] f6261f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ int f6262g;

    public C0525G() {
        int i3;
        int i4 = 4;
        while (true) {
            i3 = 40;
            if (i4 >= 32) {
                break;
            }
            int i5 = (1 << i4) - 12;
            if (40 <= i5) {
                i3 = i5;
                break;
            }
            i4++;
        }
        int i6 = i3 / 4;
        this.f6260e = new int[i6];
        this.f6261f = new Object[i6];
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0525G clone() {
        Object clone = super.clone();
        f2.j.d(clone, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>");
        C0525G c0525g = (C0525G) clone;
        c0525g.f6260e = (int[]) this.f6260e.clone();
        c0525g.f6261f = (Object[]) this.f6261f.clone();
        return c0525g;
    }

    public final Object b(int i3) {
        Object obj;
        int a3 = AbstractC0561a.a(this.f6260e, this.f6262g, i3);
        if (a3 < 0 || (obj = this.f6261f[a3]) == AbstractC0539m.f6293c) {
            return null;
        }
        return obj;
    }

    public final int c(int i3) {
        if (this.f6259d) {
            AbstractC0539m.a(this);
        }
        return this.f6260e[i3];
    }

    public final void d(int i3, Object obj) {
        int a3 = AbstractC0561a.a(this.f6260e, this.f6262g, i3);
        if (a3 >= 0) {
            this.f6261f[a3] = obj;
            return;
        }
        int i4 = ~a3;
        int i5 = this.f6262g;
        if (i4 < i5) {
            Object[] objArr = this.f6261f;
            if (objArr[i4] == AbstractC0539m.f6293c) {
                this.f6260e[i4] = i3;
                objArr[i4] = obj;
                return;
            }
        }
        if (this.f6259d && i5 >= this.f6260e.length) {
            AbstractC0539m.a(this);
            i4 = ~AbstractC0561a.a(this.f6260e, this.f6262g, i3);
        }
        int i6 = this.f6262g;
        if (i6 >= this.f6260e.length) {
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
            int[] copyOf = Arrays.copyOf(this.f6260e, i10);
            f2.j.e(copyOf, "copyOf(this, newSize)");
            this.f6260e = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f6261f, i10);
            f2.j.e(copyOf2, "copyOf(this, newSize)");
            this.f6261f = copyOf2;
        }
        int i11 = this.f6262g;
        if (i11 - i4 != 0) {
            int[] iArr = this.f6260e;
            int i12 = i4 + 1;
            S1.k.l0(iArr, iArr, i12, i4, i11);
            Object[] objArr2 = this.f6261f;
            S1.k.m0(objArr2, objArr2, i12, i4, this.f6262g);
        }
        this.f6260e[i4] = i3;
        this.f6261f[i4] = obj;
        this.f6262g++;
    }

    public final int e() {
        if (this.f6259d) {
            AbstractC0539m.a(this);
        }
        return this.f6262g;
    }

    public final Object f(int i3) {
        if (this.f6259d) {
            AbstractC0539m.a(this);
        }
        return this.f6261f[i3];
    }

    public final String toString() {
        if (e() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f6262g * 28);
        sb.append('{');
        int i3 = this.f6262g;
        for (int i4 = 0; i4 < i3; i4++) {
            if (i4 > 0) {
                sb.append(", ");
            }
            sb.append(c(i4));
            sb.append('=');
            Object f3 = f(i4);
            if (f3 != this) {
                sb.append(f3);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        f2.j.e(sb2, "buffer.toString()");
        return sb2;
    }
}
