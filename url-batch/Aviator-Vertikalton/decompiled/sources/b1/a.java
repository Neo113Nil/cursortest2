package b1;

import java.util.Iterator;
import q1.l;

/* loaded from: classes.dex */
public class a implements Iterable, Y0.a {

    /* renamed from: a, reason: collision with root package name */
    public final int f1637a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1638b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1639c;

    public a(int i, int i2, int i3) {
        if (i3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i3 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f1637a = i;
        this.f1638b = l.F(i, i2, i3);
        this.f1639c = i3;
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            if (!isEmpty() || !((a) obj).isEmpty()) {
                a aVar = (a) obj;
                if (this.f1637a != aVar.f1637a || this.f1638b != aVar.f1638b || this.f1639c != aVar.f1639c) {
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
        return (((this.f1637a * 31) + this.f1638b) * 31) + this.f1639c;
    }

    public boolean isEmpty() {
        int i = this.f1639c;
        int i2 = this.f1638b;
        int i3 = this.f1637a;
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
        return new b(this.f1637a, this.f1638b, this.f1639c);
    }

    public String toString() {
        StringBuilder sb;
        int i = this.f1638b;
        int i2 = this.f1637a;
        int i3 = this.f1639c;
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
