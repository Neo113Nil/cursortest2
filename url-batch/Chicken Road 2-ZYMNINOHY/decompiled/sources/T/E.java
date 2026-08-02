package T;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class E {

    /* renamed from: a, reason: collision with root package name */
    public final D[] f2655a;

    /* renamed from: b, reason: collision with root package name */
    public final long f2656b;

    public E(D... dArr) {
        this(-9223372036854775807L, dArr);
    }

    public final E a(D... dArr) {
        if (dArr.length == 0) {
            return this;
        }
        String str = W.J.f3263a;
        D[] dArr2 = this.f2655a;
        Object[] copyOf = Arrays.copyOf(dArr2, dArr2.length + dArr.length);
        System.arraycopy(dArr, 0, copyOf, dArr2.length, dArr.length);
        return new E(this.f2656b, (D[]) copyOf);
    }

    public final E b(E e4) {
        return e4 == null ? this : a(e4.f2655a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && E.class == obj.getClass()) {
            E e4 = (E) obj;
            if (Arrays.equals(this.f2655a, e4.f2655a) && this.f2656b == e4.f2656b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return O3.l.r(this.f2656b) + (Arrays.hashCode(this.f2655a) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("entries=");
        sb.append(Arrays.toString(this.f2655a));
        long j4 = this.f2656b;
        if (j4 == -9223372036854775807L) {
            str = "";
        } else {
            str = ", presentationTimeUs=" + j4;
        }
        sb.append(str);
        return sb.toString();
    }

    public E(long j4, D... dArr) {
        this.f2656b = j4;
        this.f2655a = dArr;
    }

    public E(List list) {
        this((D[]) list.toArray(new D[0]));
    }
}
