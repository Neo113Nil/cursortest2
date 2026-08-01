package k1;

import java.util.Iterator;
import z1.l;

/* loaded from: classes.dex */
public class a implements Iterable, h1.a {

    /* renamed from: a, reason: collision with root package name */
    public final int f2838a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2839b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2840c;

    public a(int i, int i2, int i3) {
        if (i3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i3 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f2838a = i;
        this.f2839b = l.O(i, i2, i3);
        this.f2840c = i3;
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            if (!isEmpty() || !((a) obj).isEmpty()) {
                a aVar = (a) obj;
                if (this.f2838a != aVar.f2838a || this.f2839b != aVar.f2839b || this.f2840c != aVar.f2840c) {
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
        return (((this.f2838a * 31) + this.f2839b) * 31) + this.f2840c;
    }

    public boolean isEmpty() {
        int i = this.f2840c;
        int i2 = this.f2839b;
        int i3 = this.f2838a;
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
        return new b(this.f2838a, this.f2839b, this.f2840c);
    }

    public String toString() {
        StringBuilder sb;
        int i = this.f2839b;
        int i2 = this.f2838a;
        int i3 = this.f2840c;
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
