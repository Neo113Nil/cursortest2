package p;

import java.util.Arrays;
import q.AbstractC1350a;

/* loaded from: classes.dex */
public final class k implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ int[] f14668a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object[] f14669b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ int f14670c;

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
        this.f14668a = new int[i7];
        this.f14669b = new Object[i7];
    }

    public final void a(int i4, Object obj) {
        int i5 = this.f14670c;
        if (i5 == 0 || i4 > this.f14668a[i5 - 1]) {
            if (i5 >= this.f14668a.length) {
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
                int[] copyOf = Arrays.copyOf(this.f14668a, i9);
                kotlin.jvm.internal.i.d(copyOf, "copyOf(this, newSize)");
                this.f14668a = copyOf;
                Object[] copyOf2 = Arrays.copyOf(this.f14669b, i9);
                kotlin.jvm.internal.i.d(copyOf2, "copyOf(this, newSize)");
                this.f14669b = copyOf2;
            }
            this.f14668a[i5] = i4;
            this.f14669b[i5] = obj;
            this.f14670c = i5 + 1;
            return;
        }
        int a3 = AbstractC1350a.a(this.f14670c, i4, this.f14668a);
        if (a3 >= 0) {
            this.f14669b[a3] = obj;
            return;
        }
        int i10 = ~a3;
        int i11 = this.f14670c;
        if (i10 < i11) {
            Object[] objArr = this.f14669b;
            if (objArr[i10] == h.f14658b) {
                this.f14668a[i10] = i4;
                objArr[i10] = obj;
                return;
            }
        }
        if (i11 >= this.f14668a.length) {
            int i12 = (i11 + 1) * 4;
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
            int i15 = i12 / 4;
            int[] copyOf3 = Arrays.copyOf(this.f14668a, i15);
            kotlin.jvm.internal.i.d(copyOf3, "copyOf(this, newSize)");
            this.f14668a = copyOf3;
            Object[] copyOf4 = Arrays.copyOf(this.f14669b, i15);
            kotlin.jvm.internal.i.d(copyOf4, "copyOf(this, newSize)");
            this.f14669b = copyOf4;
        }
        int i16 = this.f14670c;
        if (i16 - i10 != 0) {
            int[] iArr = this.f14668a;
            int i17 = i10 + 1;
            d3.g.P(i17, i10, i16, iArr, iArr);
            Object[] objArr2 = this.f14669b;
            d3.g.Q(i17, i10, this.f14670c, objArr2, objArr2);
        }
        this.f14668a[i10] = i4;
        this.f14669b[i10] = obj;
        this.f14670c++;
    }

    public final Object clone() {
        Object clone = super.clone();
        kotlin.jvm.internal.i.c(clone, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>");
        k kVar = (k) clone;
        kVar.f14668a = (int[]) this.f14668a.clone();
        kVar.f14669b = (Object[]) this.f14669b.clone();
        return kVar;
    }

    public final String toString() {
        int i4 = this.f14670c;
        if (i4 <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i4 * 28);
        sb.append('{');
        int i5 = this.f14670c;
        for (int i6 = 0; i6 < i5; i6++) {
            if (i6 > 0) {
                sb.append(", ");
            }
            sb.append(this.f14668a[i6]);
            sb.append('=');
            Object obj = this.f14669b[i6];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        kotlin.jvm.internal.i.d(sb2, "buffer.toString()");
        return sb2;
    }
}
