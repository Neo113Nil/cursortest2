package i;

import j.AbstractC0705a;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import z2.C1436t;

/* loaded from: classes.dex */
public final class m implements Cloneable {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ boolean f6925d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ long[] f6926e;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object[] f6927i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ int f6928j;

    public m(int i2) {
        if (i2 == 0) {
            this.f6926e = AbstractC0705a.f7120b;
            this.f6927i = AbstractC0705a.f7121c;
            return;
        }
        int i4 = i2 * 8;
        int i5 = 4;
        while (true) {
            if (i5 >= 32) {
                break;
            }
            int i6 = (1 << i5) - 12;
            if (i4 <= i6) {
                i4 = i6;
                break;
            }
            i5++;
        }
        int i7 = i4 / 8;
        this.f6926e = new long[i7];
        this.f6927i = new Object[i7];
    }

    public final long a(int i2) {
        if (!(i2 >= 0 && i2 < this.f6928j)) {
            AbstractC0705a.c("Expected index to be within 0..size()-1, but was " + i2);
            throw null;
        }
        if (this.f6925d) {
            int i4 = this.f6928j;
            long[] jArr = this.f6926e;
            Object[] objArr = this.f6927i;
            int i5 = 0;
            for (int i6 = 0; i6 < i4; i6++) {
                Object obj = objArr[i6];
                if (obj != n.f6929a) {
                    if (i6 != i5) {
                        jArr[i5] = jArr[i6];
                        objArr[i5] = obj;
                        objArr[i6] = null;
                    }
                    i5++;
                }
            }
            this.f6925d = false;
            this.f6928j = i5;
        }
        return this.f6926e[i2];
    }

    public final void b(long j4, Object obj) {
        int b4 = AbstractC0705a.b(this.f6926e, this.f6928j, j4);
        if (b4 >= 0) {
            this.f6927i[b4] = obj;
            return;
        }
        int i2 = ~b4;
        int i4 = this.f6928j;
        Object obj2 = n.f6929a;
        if (i2 < i4) {
            Object[] objArr = this.f6927i;
            if (objArr[i2] == obj2) {
                this.f6926e[i2] = j4;
                objArr[i2] = obj;
                return;
            }
        }
        if (this.f6925d) {
            long[] jArr = this.f6926e;
            if (i4 >= jArr.length) {
                Object[] objArr2 = this.f6927i;
                int i5 = 0;
                for (int i6 = 0; i6 < i4; i6++) {
                    Object obj3 = objArr2[i6];
                    if (obj3 != obj2) {
                        if (i6 != i5) {
                            jArr[i5] = jArr[i6];
                            objArr2[i5] = obj3;
                            objArr2[i6] = null;
                        }
                        i5++;
                    }
                }
                this.f6925d = false;
                this.f6928j = i5;
                i2 = ~AbstractC0705a.b(this.f6926e, i5, j4);
            }
        }
        int i7 = this.f6928j;
        if (i7 >= this.f6926e.length) {
            int i8 = (i7 + 1) * 8;
            int i9 = 4;
            while (true) {
                if (i9 >= 32) {
                    break;
                }
                int i10 = (1 << i9) - 12;
                if (i8 <= i10) {
                    i8 = i10;
                    break;
                }
                i9++;
            }
            int i11 = i8 / 8;
            long[] copyOf = Arrays.copyOf(this.f6926e, i11);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.f6926e = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f6927i, i11);
            Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, newSize)");
            this.f6927i = copyOf2;
        }
        int i12 = this.f6928j - i2;
        if (i12 != 0) {
            long[] destination = this.f6926e;
            int i13 = i2 + 1;
            Intrinsics.checkNotNullParameter(destination, "<this>");
            Intrinsics.checkNotNullParameter(destination, "destination");
            System.arraycopy(destination, i2, destination, i13, i12);
            Object[] objArr3 = this.f6927i;
            C1436t.f(objArr3, objArr3, i13, i2, this.f6928j);
        }
        this.f6926e[i2] = j4;
        this.f6927i[i2] = obj;
        this.f6928j++;
    }

    public final int c() {
        if (this.f6925d) {
            int i2 = this.f6928j;
            long[] jArr = this.f6926e;
            Object[] objArr = this.f6927i;
            int i4 = 0;
            for (int i5 = 0; i5 < i2; i5++) {
                Object obj = objArr[i5];
                if (obj != n.f6929a) {
                    if (i5 != i4) {
                        jArr[i4] = jArr[i5];
                        objArr[i4] = obj;
                        objArr[i5] = null;
                    }
                    i4++;
                }
            }
            this.f6925d = false;
            this.f6928j = i4;
        }
        return this.f6928j;
    }

    public final Object clone() {
        Object clone = super.clone();
        Intrinsics.d(clone, "null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>");
        m mVar = (m) clone;
        mVar.f6926e = (long[]) this.f6926e.clone();
        mVar.f6927i = (Object[]) this.f6927i.clone();
        return mVar;
    }

    public final Object d(int i2) {
        if (!(i2 >= 0 && i2 < this.f6928j)) {
            AbstractC0705a.c("Expected index to be within 0..size()-1, but was " + i2);
            throw null;
        }
        if (this.f6925d) {
            int i4 = this.f6928j;
            long[] jArr = this.f6926e;
            Object[] objArr = this.f6927i;
            int i5 = 0;
            for (int i6 = 0; i6 < i4; i6++) {
                Object obj = objArr[i6];
                if (obj != n.f6929a) {
                    if (i6 != i5) {
                        jArr[i5] = jArr[i6];
                        objArr[i5] = obj;
                        objArr[i6] = null;
                    }
                    i5++;
                }
            }
            this.f6925d = false;
            this.f6928j = i5;
        }
        return this.f6927i[i2];
    }

    public final String toString() {
        if (c() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f6928j * 28);
        sb.append('{');
        int i2 = this.f6928j;
        for (int i4 = 0; i4 < i2; i4++) {
            if (i4 > 0) {
                sb.append(", ");
            }
            sb.append(a(i4));
            sb.append('=');
            Object d4 = d(i4);
            if (d4 != sb) {
                sb.append(d4);
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
