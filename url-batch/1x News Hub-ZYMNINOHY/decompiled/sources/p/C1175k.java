package p;

import java.util.Arrays;
import q.AbstractC1178a;

/* renamed from: p.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1175k implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ int[] f10207a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object[] f10208b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ int f10209c;

    public final void a(int i3, Object obj) {
        int i4 = this.f10209c;
        if (i4 == 0 || i3 > this.f10207a[i4 - 1]) {
            if (i4 >= this.f10207a.length) {
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
                int[] copyOf = Arrays.copyOf(this.f10207a, i8);
                kotlin.jvm.internal.j.d(copyOf, "copyOf(this, newSize)");
                this.f10207a = copyOf;
                Object[] copyOf2 = Arrays.copyOf(this.f10208b, i8);
                kotlin.jvm.internal.j.d(copyOf2, "copyOf(this, newSize)");
                this.f10208b = copyOf2;
            }
            this.f10207a[i4] = i3;
            this.f10208b[i4] = obj;
            this.f10209c = i4 + 1;
            return;
        }
        int a3 = AbstractC1178a.a(this.f10209c, i3, this.f10207a);
        if (a3 >= 0) {
            this.f10208b[a3] = obj;
            return;
        }
        int i9 = ~a3;
        int i10 = this.f10209c;
        if (i9 < i10) {
            Object[] objArr = this.f10208b;
            if (objArr[i9] == AbstractC1172h.f10198b) {
                this.f10207a[i9] = i3;
                objArr[i9] = obj;
                return;
            }
        }
        if (i10 >= this.f10207a.length) {
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
            int[] copyOf3 = Arrays.copyOf(this.f10207a, i14);
            kotlin.jvm.internal.j.d(copyOf3, "copyOf(this, newSize)");
            this.f10207a = copyOf3;
            Object[] copyOf4 = Arrays.copyOf(this.f10208b, i14);
            kotlin.jvm.internal.j.d(copyOf4, "copyOf(this, newSize)");
            this.f10208b = copyOf4;
        }
        int i15 = this.f10209c;
        if (i15 - i9 != 0) {
            int[] iArr = this.f10207a;
            int i16 = i9 + 1;
            c2.c.Q(i16, i9, i15, iArr, iArr);
            Object[] objArr2 = this.f10208b;
            c2.c.R(i16, i9, this.f10209c, objArr2, objArr2);
        }
        this.f10207a[i9] = i3;
        this.f10208b[i9] = obj;
        this.f10209c++;
    }

    public final Object clone() {
        Object clone = super.clone();
        kotlin.jvm.internal.j.c(clone, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>");
        C1175k c1175k = (C1175k) clone;
        c1175k.f10207a = (int[]) this.f10207a.clone();
        c1175k.f10208b = (Object[]) this.f10208b.clone();
        return c1175k;
    }

    public final String toString() {
        int i3 = this.f10209c;
        if (i3 <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i3 * 28);
        sb.append('{');
        int i4 = this.f10209c;
        for (int i5 = 0; i5 < i4; i5++) {
            if (i5 > 0) {
                sb.append(", ");
            }
            sb.append(this.f10207a[i5]);
            sb.append('=');
            Object obj = this.f10208b[i5];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        kotlin.jvm.internal.j.d(sb2, "buffer.toString()");
        return sb2;
    }
}
