package i;

import j.AbstractC0705a;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import z2.C1436t;

/* loaded from: classes.dex */
public final class H implements Cloneable {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ boolean f6896d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ int[] f6897e;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object[] f6898i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ int f6899j;

    public H() {
        int i2;
        int i4 = 4;
        while (true) {
            i2 = 40;
            if (i4 >= 32) {
                break;
            }
            int i5 = (1 << i4) - 12;
            if (40 <= i5) {
                i2 = i5;
                break;
            }
            i4++;
        }
        int i6 = i2 / 4;
        this.f6897e = new int[i6];
        this.f6898i = new Object[i6];
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final H clone() {
        Object clone = super.clone();
        Intrinsics.d(clone, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>");
        H h4 = (H) clone;
        h4.f6897e = (int[]) this.f6897e.clone();
        h4.f6898i = (Object[]) this.f6898i.clone();
        return h4;
    }

    public final Object b(int i2) {
        Object obj;
        Intrinsics.checkNotNullParameter(this, "<this>");
        int a4 = AbstractC0705a.a(this.f6897e, this.f6899j, i2);
        if (a4 < 0 || (obj = this.f6898i[a4]) == n.f6931c) {
            return null;
        }
        return obj;
    }

    public final int c(int i2) {
        if (this.f6896d) {
            n.a(this);
        }
        return this.f6897e[i2];
    }

    public final void d(int i2, Object obj) {
        int a4 = AbstractC0705a.a(this.f6897e, this.f6899j, i2);
        if (a4 >= 0) {
            this.f6898i[a4] = obj;
            return;
        }
        int i4 = ~a4;
        int i5 = this.f6899j;
        if (i4 < i5) {
            Object[] objArr = this.f6898i;
            if (objArr[i4] == n.f6931c) {
                this.f6897e[i4] = i2;
                objArr[i4] = obj;
                return;
            }
        }
        if (this.f6896d && i5 >= this.f6897e.length) {
            n.a(this);
            i4 = ~AbstractC0705a.a(this.f6897e, this.f6899j, i2);
        }
        int i6 = this.f6899j;
        if (i6 >= this.f6897e.length) {
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
            int[] copyOf = Arrays.copyOf(this.f6897e, i10);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.f6897e = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f6898i, i10);
            Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, newSize)");
            this.f6898i = copyOf2;
        }
        int i11 = this.f6899j;
        if (i11 - i4 != 0) {
            int[] iArr = this.f6897e;
            int i12 = i4 + 1;
            C1436t.e(iArr, iArr, i12, i4, i11);
            Object[] objArr2 = this.f6898i;
            C1436t.f(objArr2, objArr2, i12, i4, this.f6899j);
        }
        this.f6897e[i4] = i2;
        this.f6898i[i4] = obj;
        this.f6899j++;
    }

    public final int e() {
        if (this.f6896d) {
            n.a(this);
        }
        return this.f6899j;
    }

    public final Object f(int i2) {
        if (this.f6896d) {
            n.a(this);
        }
        return this.f6898i[i2];
    }

    public final String toString() {
        if (e() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f6899j * 28);
        sb.append('{');
        int i2 = this.f6899j;
        for (int i4 = 0; i4 < i2; i4++) {
            if (i4 > 0) {
                sb.append(", ");
            }
            sb.append(c(i4));
            sb.append('=');
            Object f4 = f(i4);
            if (f4 != this) {
                sb.append(f4);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "buffer.toString()");
        return sb2;
    }
}
