package k1;

import java.util.Iterator;
import z1.d;

/* loaded from: classes.dex */
public class a implements Iterable, h1.a {

    /* renamed from: a, reason: collision with root package name */
    public final int f2785a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2786b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2787c;

    public a(int i, int i2, int i3) {
        if (i3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i3 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f2785a = i;
        this.f2786b = d.N(i, i2, i3);
        this.f2787c = i3;
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            if (!isEmpty() || !((a) obj).isEmpty()) {
                a aVar = (a) obj;
                if (this.f2785a != aVar.f2785a || this.f2786b != aVar.f2786b || this.f2787c != aVar.f2787c) {
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
        return (((this.f2785a * 31) + this.f2786b) * 31) + this.f2787c;
    }

    public boolean isEmpty() {
        int i = this.f2787c;
        int i2 = this.f2786b;
        int i3 = this.f2785a;
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
        return new b(this.f2785a, this.f2786b, this.f2787c);
    }

    public String toString() {
        StringBuilder sb;
        int i = this.f2786b;
        int i2 = this.f2785a;
        int i3 = this.f2787c;
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
