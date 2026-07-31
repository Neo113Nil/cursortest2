package j;

import java.util.Arrays;
import k.AbstractC0522a;

/* renamed from: j.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0481G implements Cloneable {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ boolean f5141d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ int[] f5142e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object[] f5143f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ int f5144g;

    public C0481G() {
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
        this.f5142e = new int[i6];
        this.f5143f = new Object[i6];
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0481G clone() {
        Object clone = super.clone();
        Z1.i.d(clone, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>");
        C0481G c0481g = (C0481G) clone;
        c0481g.f5142e = (int[]) this.f5142e.clone();
        c0481g.f5143f = (Object[]) this.f5143f.clone();
        return c0481g;
    }

    public final Object b(int i3) {
        Object obj;
        int a3 = AbstractC0522a.a(this.f5142e, this.f5144g, i3);
        if (a3 < 0 || (obj = this.f5143f[a3]) == AbstractC0495m.f5175c) {
            return null;
        }
        return obj;
    }

    public final int c(int i3) {
        if (this.f5141d) {
            AbstractC0495m.a(this);
        }
        return this.f5142e[i3];
    }

    public final void d(int i3, Object obj) {
        int a3 = AbstractC0522a.a(this.f5142e, this.f5144g, i3);
        if (a3 >= 0) {
            this.f5143f[a3] = obj;
            return;
        }
        int i4 = ~a3;
        int i5 = this.f5144g;
        if (i4 < i5) {
            Object[] objArr = this.f5143f;
            if (objArr[i4] == AbstractC0495m.f5175c) {
                this.f5142e[i4] = i3;
                objArr[i4] = obj;
                return;
            }
        }
        if (this.f5141d && i5 >= this.f5142e.length) {
            AbstractC0495m.a(this);
            i4 = ~AbstractC0522a.a(this.f5142e, this.f5144g, i3);
        }
        int i6 = this.f5144g;
        if (i6 >= this.f5142e.length) {
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
            int[] copyOf = Arrays.copyOf(this.f5142e, i10);
            Z1.i.e(copyOf, "copyOf(this, newSize)");
            this.f5142e = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f5143f, i10);
            Z1.i.e(copyOf2, "copyOf(this, newSize)");
            this.f5143f = copyOf2;
        }
        int i11 = this.f5144g;
        if (i11 - i4 != 0) {
            int[] iArr = this.f5142e;
            int i12 = i4 + 1;
            M1.k.W(iArr, iArr, i12, i4, i11);
            Object[] objArr2 = this.f5143f;
            M1.k.X(objArr2, objArr2, i12, i4, this.f5144g);
        }
        this.f5142e[i4] = i3;
        this.f5143f[i4] = obj;
        this.f5144g++;
    }

    public final int e() {
        if (this.f5141d) {
            AbstractC0495m.a(this);
        }
        return this.f5144g;
    }

    public final Object f(int i3) {
        if (this.f5141d) {
            AbstractC0495m.a(this);
        }
        return this.f5143f[i3];
    }

    public final String toString() {
        if (e() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f5144g * 28);
        sb.append('{');
        int i3 = this.f5144g;
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
        Z1.i.e(sb2, "buffer.toString()");
        return sb2;
    }
}
