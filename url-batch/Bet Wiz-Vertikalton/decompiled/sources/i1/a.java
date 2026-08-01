package i1;

import java.util.Iterator;
import x1.l;

/* loaded from: classes.dex */
public class a implements Iterable, f1.a {

    /* renamed from: a, reason: collision with root package name */
    public final int f2518a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2519b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2520c;

    public a(int i, int i2, int i3) {
        if (i3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i3 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f2518a = i;
        this.f2519b = l.J(i, i2, i3);
        this.f2520c = i3;
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            if (!isEmpty() || !((a) obj).isEmpty()) {
                a aVar = (a) obj;
                if (this.f2518a != aVar.f2518a || this.f2519b != aVar.f2519b || this.f2520c != aVar.f2520c) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f2518a * 31) + this.f2519b) * 31) + this.f2520c;
    }

    public boolean isEmpty() {
        int i = this.f2520c;
        int i2 = this.f2519b;
        int i3 = this.f2518a;
        if (i > 0) {
            if (i3 <= i2) {
                return false;
            }
        } else if (i3 >= i2) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new b(this.f2518a, this.f2519b, this.f2520c);
    }

    public String toString() {
        StringBuilder sb;
        int i = this.f2519b;
        int i2 = this.f2518a;
        int i3 = this.f2520c;
        if (i3 > 0) {
            sb = new StringBuilder();
            sb.append(i2);
            sb.append("..");
            sb.append(i);
            sb.append(" step ");
            sb.append(i3);
        } else {
            sb = new StringBuilder();
            sb.append(i2);
            sb.append(" downTo ");
            sb.append(i);
            sb.append(" step ");
            sb.append(-i3);
        }
        return sb.toString();
    }
}
