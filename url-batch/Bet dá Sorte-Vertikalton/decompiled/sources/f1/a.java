package f1;

import java.util.Iterator;
import u1.l;

/* loaded from: classes.dex */
public class a implements Iterable, c1.a {

    /* renamed from: a, reason: collision with root package name */
    public final int f2296a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2297b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2298c;

    public a(int i, int i2, int i3) {
        if (i3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i3 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f2296a = i;
        this.f2297b = l.H(i, i2, i3);
        this.f2298c = i3;
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            if (!isEmpty() || !((a) obj).isEmpty()) {
                a aVar = (a) obj;
                if (this.f2296a != aVar.f2296a || this.f2297b != aVar.f2297b || this.f2298c != aVar.f2298c) {
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
        return (((this.f2296a * 31) + this.f2297b) * 31) + this.f2298c;
    }

    public boolean isEmpty() {
        int i = this.f2298c;
        int i2 = this.f2297b;
        int i3 = this.f2296a;
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
        return new b(this.f2296a, this.f2297b, this.f2298c);
    }

    public String toString() {
        StringBuilder sb;
        int i = this.f2297b;
        int i2 = this.f2296a;
        int i3 = this.f2298c;
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
