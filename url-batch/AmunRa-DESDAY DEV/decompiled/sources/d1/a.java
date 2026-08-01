package d1;

import java.util.Iterator;
import s1.l;

/* loaded from: classes.dex */
public class a implements Iterable, a1.a {

    /* renamed from: a, reason: collision with root package name */
    public final int f1982a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1983b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1984c;

    public a(int i, int i2, int i3) {
        if (i3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i3 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f1982a = i;
        this.f1983b = l.C(i, i2, i3);
        this.f1984c = i3;
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            if (!isEmpty() || !((a) obj).isEmpty()) {
                a aVar = (a) obj;
                if (this.f1982a != aVar.f1982a || this.f1983b != aVar.f1983b || this.f1984c != aVar.f1984c) {
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
        return (((this.f1982a * 31) + this.f1983b) * 31) + this.f1984c;
    }

    public boolean isEmpty() {
        int i = this.f1984c;
        int i2 = this.f1983b;
        int i3 = this.f1982a;
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
        return new b(this.f1982a, this.f1983b, this.f1984c);
    }

    public String toString() {
        StringBuilder sb;
        int i = this.f1983b;
        int i2 = this.f1982a;
        int i3 = this.f1984c;
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
