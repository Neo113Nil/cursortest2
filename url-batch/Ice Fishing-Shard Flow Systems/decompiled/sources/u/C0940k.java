package u;

import java.util.Arrays;
import kotlin.collections.o;
import kotlin.jvm.internal.Intrinsics;
import v.AbstractC0955a;

/* renamed from: u.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0940k implements Cloneable {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ int[] f8046d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object[] f8047e;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ int f8048i;

    public C0940k() {
        int i2;
        int i5 = 4;
        while (true) {
            i2 = 40;
            if (i5 >= 32) {
                break;
            }
            int i7 = (1 << i5) - 12;
            if (40 <= i7) {
                i2 = i7;
                break;
            }
            i5++;
        }
        int i8 = i2 / 4;
        this.f8046d = new int[i8];
        this.f8047e = new Object[i8];
    }

    public final void a(int i2, Object obj) {
        int i5 = this.f8048i;
        if (i5 == 0 || i2 > this.f8046d[i5 - 1]) {
            if (i5 >= this.f8046d.length) {
                int i7 = (i5 + 1) * 4;
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
                int[] copyOf = Arrays.copyOf(this.f8046d, i10);
                Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
                this.f8046d = copyOf;
                Object[] copyOf2 = Arrays.copyOf(this.f8047e, i10);
                Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, newSize)");
                this.f8047e = copyOf2;
            }
            this.f8046d[i5] = i2;
            this.f8047e[i5] = obj;
            this.f8048i = i5 + 1;
            return;
        }
        int a7 = AbstractC0955a.a(this.f8048i, i2, this.f8046d);
        if (a7 >= 0) {
            this.f8047e[a7] = obj;
            return;
        }
        int i11 = ~a7;
        int i12 = this.f8048i;
        if (i11 < i12) {
            Object[] objArr = this.f8047e;
            if (objArr[i11] == AbstractC0937h.f8036b) {
                this.f8046d[i11] = i2;
                objArr[i11] = obj;
                return;
            }
        }
        if (i12 >= this.f8046d.length) {
            int i13 = (i12 + 1) * 4;
            int i14 = 4;
            while (true) {
                if (i14 >= 32) {
                    break;
                }
                int i15 = (1 << i14) - 12;
                if (i13 <= i15) {
                    i13 = i15;
                    break;
                }
                i14++;
            }
            int i16 = i13 / 4;
            int[] copyOf3 = Arrays.copyOf(this.f8046d, i16);
            Intrinsics.checkNotNullExpressionValue(copyOf3, "copyOf(this, newSize)");
            this.f8046d = copyOf3;
            Object[] copyOf4 = Arrays.copyOf(this.f8047e, i16);
            Intrinsics.checkNotNullExpressionValue(copyOf4, "copyOf(this, newSize)");
            this.f8047e = copyOf4;
        }
        int i17 = this.f8048i;
        if (i17 - i11 != 0) {
            int[] iArr = this.f8046d;
            int i18 = i11 + 1;
            o.d(i18, i11, iArr, iArr, i17);
            Object[] objArr2 = this.f8047e;
            o.e(objArr2, objArr2, i18, i11, this.f8048i);
        }
        this.f8046d[i11] = i2;
        this.f8047e[i11] = obj;
        this.f8048i++;
    }

    public final Object clone() {
        Object clone = super.clone();
        Intrinsics.c(clone, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>");
        C0940k c0940k = (C0940k) clone;
        c0940k.f8046d = (int[]) this.f8046d.clone();
        c0940k.f8047e = (Object[]) this.f8047e.clone();
        return c0940k;
    }

    public final String toString() {
        int i2 = this.f8048i;
        if (i2 <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i2 * 28);
        sb.append('{');
        int i5 = this.f8048i;
        for (int i7 = 0; i7 < i5; i7++) {
            if (i7 > 0) {
                sb.append(", ");
            }
            sb.append(this.f8046d[i7]);
            sb.append('=');
            Object obj = this.f8047e[i7];
            if (obj != this) {
                sb.append(obj);
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
