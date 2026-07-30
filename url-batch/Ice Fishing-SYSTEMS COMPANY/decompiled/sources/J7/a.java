package J7;

import com.bumptech.glide.g;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class a implements Iterable, F7.a {

    /* renamed from: n, reason: collision with root package name */
    public final int f1464n;

    /* renamed from: u, reason: collision with root package name */
    public final int f1465u;

    /* renamed from: v, reason: collision with root package name */
    public final int f1466v;

    public a(int i, int i4, int i9) {
        if (i9 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i9 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f1464n = i;
        this.f1465u = g.N(i, i4, i9);
        this.f1466v = i9;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        if (isEmpty() && ((a) obj).isEmpty()) {
            return true;
        }
        a aVar = (a) obj;
        return this.f1464n == aVar.f1464n && this.f1465u == aVar.f1465u && this.f1466v == aVar.f1466v;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f1464n * 31) + this.f1465u) * 31) + this.f1466v;
    }

    public boolean isEmpty() {
        int i = this.f1466v;
        int i4 = this.f1465u;
        int i9 = this.f1464n;
        return i > 0 ? i9 > i4 : i9 < i4;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new b(this.f1464n, this.f1465u, this.f1466v);
    }

    public String toString() {
        StringBuilder sb;
        int i = this.f1465u;
        int i4 = this.f1464n;
        int i9 = this.f1466v;
        if (i9 > 0) {
            sb = new StringBuilder();
            sb.append(i4);
            sb.append("..");
            sb.append(i);
            sb.append(" step ");
            sb.append(i9);
        } else {
            sb = new StringBuilder();
            sb.append(i4);
            sb.append(" downTo ");
            sb.append(i);
            sb.append(" step ");
            sb.append(-i9);
        }
        return sb.toString();
    }
}
