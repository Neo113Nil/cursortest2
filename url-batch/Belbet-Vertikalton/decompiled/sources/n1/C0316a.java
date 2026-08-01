package n1;

import a.AbstractC0058a;
import java.util.Iterator;

/* renamed from: n1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0316a implements Iterable, k1.a {

    /* renamed from: a, reason: collision with root package name */
    public final int f3755a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3756b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3757c;

    public C0316a(int i, int i2, int i3) {
        if (i3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i3 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f3755a = i;
        this.f3756b = AbstractC0058a.D(i, i2, i3);
        this.f3757c = i3;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C0316a) {
            if (!isEmpty() || !((C0316a) obj).isEmpty()) {
                C0316a c0316a = (C0316a) obj;
                if (this.f3755a != c0316a.f3755a || this.f3756b != c0316a.f3756b || this.f3757c != c0316a.f3757c) {
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
        return (((this.f3755a * 31) + this.f3756b) * 31) + this.f3757c;
    }

    public boolean isEmpty() {
        int i = this.f3757c;
        int i2 = this.f3756b;
        int i3 = this.f3755a;
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
        return new C0317b(this.f3755a, this.f3756b, this.f3757c);
    }

    public String toString() {
        StringBuilder sb;
        int i = this.f3756b;
        int i2 = this.f3755a;
        int i3 = this.f3757c;
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
