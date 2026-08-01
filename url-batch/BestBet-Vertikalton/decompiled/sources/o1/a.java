package o1;

import c1.AbstractC0091d;
import java.util.Iterator;
import l1.InterfaceC0284a;

/* loaded from: classes.dex */
public class a implements Iterable, InterfaceC0284a {

    /* renamed from: a, reason: collision with root package name */
    public final int f3595a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3596b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3597c;

    public a(int i, int i2, int i3) {
        if (i3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i3 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f3595a = i;
        this.f3596b = AbstractC0091d.k(i, i2, i3);
        this.f3597c = i3;
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            if (!isEmpty() || !((a) obj).isEmpty()) {
                a aVar = (a) obj;
                if (this.f3595a != aVar.f3595a || this.f3596b != aVar.f3596b || this.f3597c != aVar.f3597c) {
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
        return (((this.f3595a * 31) + this.f3596b) * 31) + this.f3597c;
    }

    public boolean isEmpty() {
        int i = this.f3597c;
        int i2 = this.f3596b;
        int i3 = this.f3595a;
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
        return new b(this.f3595a, this.f3596b, this.f3597c);
    }

    public String toString() {
        StringBuilder sb;
        int i = this.f3596b;
        int i2 = this.f3595a;
        int i3 = this.f3597c;
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
