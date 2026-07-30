package kotlin.ranges;

import defpackage.k71;
import defpackage.l41;
import defpackage.lh;
import defpackage.t31;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public class c implements Iterable<Integer>, k71 {
    public static final a p = new a(null);
    public final int m;
    public final int n;
    public final int o;

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public c(int i, int i2, int i3) {
        if (i3 == 0) {
            lh.e("Step must be non-zero.");
            throw null;
        }
        if (i3 == Integer.MIN_VALUE) {
            lh.e("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
            throw null;
        }
        this.m = i;
        this.n = l41.G(i, i2, i3);
        this.o = i3;
    }

    @Override // java.lang.Iterable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final t31 iterator() {
        return new t31(this.m, this.n, this.o);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        if (isEmpty() && ((c) obj).isEmpty()) {
            return true;
        }
        c cVar = (c) obj;
        return this.m == cVar.m && this.n == cVar.n && this.o == cVar.o;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.m * 31) + this.n) * 31) + this.o;
    }

    public boolean isEmpty() {
        int i = this.n;
        int i2 = this.o;
        int i3 = this.m;
        return i2 > 0 ? i3 > i : i3 < i;
    }

    public String toString() {
        StringBuilder sb;
        int i = this.n;
        int i2 = this.o;
        int i3 = this.m;
        if (i2 > 0) {
            sb = new StringBuilder();
            sb.append(i3);
            sb.append("..");
            sb.append(i);
            sb.append(" step ");
            sb.append(i2);
        } else {
            sb = new StringBuilder();
            sb.append(i3);
            sb.append(" downTo ");
            sb.append(i);
            sb.append(" step ");
            sb.append(-i2);
        }
        return sb.toString();
    }
}
