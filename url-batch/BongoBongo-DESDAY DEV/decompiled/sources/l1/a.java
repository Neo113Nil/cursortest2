package l1;

import A1.d;
import java.util.Iterator;

/* loaded from: classes.dex */
public class a implements Iterable, i1.a {

    /* renamed from: a, reason: collision with root package name */
    public final int f2887a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2888b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2889c;

    public a(int i, int i2, int i3) {
        if (i3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i3 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f2887a = i;
        this.f2888b = d.J(i, i2, i3);
        this.f2889c = i3;
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            if (!isEmpty() || !((a) obj).isEmpty()) {
                a aVar = (a) obj;
                if (this.f2887a != aVar.f2887a || this.f2888b != aVar.f2888b || this.f2889c != aVar.f2889c) {
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
        return (((this.f2887a * 31) + this.f2888b) * 31) + this.f2889c;
    }

    public boolean isEmpty() {
        int i = this.f2889c;
        int i2 = this.f2888b;
        int i3 = this.f2887a;
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
        return new b(this.f2887a, this.f2888b, this.f2889c);
    }

    public String toString() {
        StringBuilder sb;
        int i = this.f2888b;
        int i2 = this.f2887a;
        int i3 = this.f2889c;
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
