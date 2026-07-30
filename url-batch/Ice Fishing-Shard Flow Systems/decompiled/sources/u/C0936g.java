package u;

import C4.p;
import java.util.Arrays;
import kotlin.collections.o;
import kotlin.jvm.internal.Intrinsics;
import v.AbstractC0955a;

/* renamed from: u.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0936g implements Cloneable {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ boolean f8031d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ long[] f8032e;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object[] f8033i;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ int f8034l;

    public C0936g() {
        int i2;
        int i5 = 4;
        while (true) {
            i2 = 80;
            if (i5 >= 32) {
                break;
            }
            int i7 = (1 << i5) - 12;
            if (80 <= i7) {
                i2 = i7;
                break;
            }
            i5++;
        }
        int i8 = i2 / 8;
        this.f8032e = new long[i8];
        this.f8033i = new Object[i8];
    }

    public final void a(long j, Object obj) {
        Object obj2 = AbstractC0937h.f8035a;
        int b7 = AbstractC0955a.b(this.f8032e, this.f8034l, j);
        if (b7 >= 0) {
            this.f8033i[b7] = obj;
            return;
        }
        int i2 = ~b7;
        int i5 = this.f8034l;
        if (i2 < i5) {
            Object[] objArr = this.f8033i;
            if (objArr[i2] == obj2) {
                this.f8032e[i2] = j;
                objArr[i2] = obj;
                return;
            }
        }
        if (this.f8031d) {
            long[] jArr = this.f8032e;
            if (i5 >= jArr.length) {
                Object[] objArr2 = this.f8033i;
                int i7 = 0;
                for (int i8 = 0; i8 < i5; i8++) {
                    Object obj3 = objArr2[i8];
                    if (obj3 != obj2) {
                        if (i8 != i7) {
                            jArr[i7] = jArr[i8];
                            objArr2[i7] = obj3;
                            objArr2[i8] = null;
                        }
                        i7++;
                    }
                }
                this.f8031d = false;
                this.f8034l = i7;
                i2 = ~AbstractC0955a.b(this.f8032e, i7, j);
            }
        }
        int i9 = this.f8034l;
        if (i9 >= this.f8032e.length) {
            int i10 = (i9 + 1) * 8;
            int i11 = 4;
            while (true) {
                if (i11 >= 32) {
                    break;
                }
                int i12 = (1 << i11) - 12;
                if (i10 <= i12) {
                    i10 = i12;
                    break;
                }
                i11++;
            }
            int i13 = i10 / 8;
            long[] copyOf = Arrays.copyOf(this.f8032e, i13);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.f8032e = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f8033i, i13);
            Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, newSize)");
            this.f8033i = copyOf2;
        }
        int i14 = this.f8034l - i2;
        if (i14 != 0) {
            long[] destination = this.f8032e;
            int i15 = i2 + 1;
            Intrinsics.checkNotNullParameter(destination, "<this>");
            Intrinsics.checkNotNullParameter(destination, "destination");
            System.arraycopy(destination, i2, destination, i15, i14);
            Object[] objArr3 = this.f8033i;
            o.e(objArr3, objArr3, i15, i2, this.f8034l);
        }
        this.f8032e[i2] = j;
        this.f8033i[i2] = obj;
        this.f8034l++;
    }

    public final Object clone() {
        Object clone = super.clone();
        Intrinsics.c(clone, "null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>");
        C0936g c0936g = (C0936g) clone;
        c0936g.f8032e = (long[]) this.f8032e.clone();
        c0936g.f8033i = (Object[]) this.f8033i.clone();
        return c0936g;
    }

    public final String toString() {
        int i2;
        int i5;
        if (this.f8031d) {
            int i7 = this.f8034l;
            long[] jArr = this.f8032e;
            Object[] objArr = this.f8033i;
            int i8 = 0;
            for (int i9 = 0; i9 < i7; i9++) {
                Object obj = objArr[i9];
                if (obj != AbstractC0937h.f8035a) {
                    if (i9 != i8) {
                        jArr[i8] = jArr[i9];
                        objArr[i8] = obj;
                        objArr[i9] = null;
                    }
                    i8++;
                }
            }
            this.f8031d = false;
            this.f8034l = i8;
        }
        if (this.f8034l <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f8034l * 28);
        sb.append('{');
        int i10 = this.f8034l;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb.append(", ");
            }
            if (i11 < 0 || i11 >= (i2 = this.f8034l)) {
                throw new IllegalArgumentException(p.g(i11, "Expected index to be within 0..size()-1, but was ").toString());
            }
            if (this.f8031d) {
                long[] jArr2 = this.f8032e;
                Object[] objArr2 = this.f8033i;
                int i12 = 0;
                for (int i13 = 0; i13 < i2; i13++) {
                    Object obj2 = objArr2[i13];
                    if (obj2 != AbstractC0937h.f8035a) {
                        if (i13 != i12) {
                            jArr2[i12] = jArr2[i13];
                            objArr2[i12] = obj2;
                            objArr2[i13] = null;
                        }
                        i12++;
                    }
                }
                this.f8031d = false;
                this.f8034l = i12;
            }
            sb.append(this.f8032e[i11]);
            sb.append('=');
            if (i11 < 0 || i11 >= (i5 = this.f8034l)) {
                throw new IllegalArgumentException(p.g(i11, "Expected index to be within 0..size()-1, but was ").toString());
            }
            if (this.f8031d) {
                long[] jArr3 = this.f8032e;
                Object[] objArr3 = this.f8033i;
                int i14 = 0;
                for (int i15 = 0; i15 < i5; i15++) {
                    Object obj3 = objArr3[i15];
                    if (obj3 != AbstractC0937h.f8035a) {
                        if (i15 != i14) {
                            jArr3[i14] = jArr3[i15];
                            objArr3[i14] = obj3;
                            objArr3[i15] = null;
                        }
                        i14++;
                    }
                }
                this.f8031d = false;
                this.f8034l = i14;
            }
            Object obj4 = this.f8033i[i11];
            if (obj4 != sb) {
                sb.append(obj4);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }
}
