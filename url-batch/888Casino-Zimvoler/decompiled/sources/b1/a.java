package b1;

import java.util.Iterator;
import q1.d;

/* loaded from: classes.dex */
public class a implements Iterable, Y0.a {

    /* renamed from: a, reason: collision with root package name */
    public final int f1502a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1503b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1504c;

    public a(int i, int i2, int i3) {
        if (i3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i3 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f1502a = i;
        this.f1503b = d.M(i, i2, i3);
        this.f1504c = i3;
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            if (!isEmpty() || !((a) obj).isEmpty()) {
                a aVar = (a) obj;
                if (this.f1502a != aVar.f1502a || this.f1503b != aVar.f1503b || this.f1504c != aVar.f1504c) {
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
        return (((this.f1502a * 31) + this.f1503b) * 31) + this.f1504c;
    }

    public boolean isEmpty() {
        int i = this.f1504c;
        int i2 = this.f1503b;
        int i3 = this.f1502a;
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
        return new b(this.f1502a, this.f1503b, this.f1504c);
    }

    public String toString() {
        StringBuilder sb;
        int i = this.f1503b;
        int i2 = this.f1502a;
        int i3 = this.f1504c;
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
