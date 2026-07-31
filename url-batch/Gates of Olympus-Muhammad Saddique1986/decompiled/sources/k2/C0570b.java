package k2;

import O2.l;
import g2.InterfaceC0439a;
import java.util.Iterator;

/* renamed from: k2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0570b implements Iterable, InterfaceC0439a {

    /* renamed from: d, reason: collision with root package name */
    public final int f6419d;

    /* renamed from: e, reason: collision with root package name */
    public final int f6420e;

    /* renamed from: f, reason: collision with root package name */
    public final int f6421f;

    public C0570b(int i3, int i4, int i5) {
        if (i5 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i5 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f6419d = i3;
        this.f6420e = l.e0(i3, i4, i5);
        this.f6421f = i5;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C0570b) {
            if (!isEmpty() || !((C0570b) obj).isEmpty()) {
                C0570b c0570b = (C0570b) obj;
                if (this.f6419d != c0570b.f6419d || this.f6420e != c0570b.f6420e || this.f6421f != c0570b.f6421f) {
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
        return (((this.f6419d * 31) + this.f6420e) * 31) + this.f6421f;
    }

    public boolean isEmpty() {
        int i3 = this.f6421f;
        int i4 = this.f6420e;
        int i5 = this.f6419d;
        if (i3 > 0) {
            if (i5 <= i4) {
                return false;
            }
        } else if (i5 >= i4) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C0571c(this.f6419d, this.f6420e, this.f6421f);
    }

    public String toString() {
        StringBuilder sb;
        int i3 = this.f6420e;
        int i4 = this.f6419d;
        int i5 = this.f6421f;
        if (i5 > 0) {
            sb = new StringBuilder();
            sb.append(i4);
            sb.append("..");
            sb.append(i3);
            sb.append(" step ");
            sb.append(i5);
        } else {
            sb = new StringBuilder();
            sb.append(i4);
            sb.append(" downTo ");
            sb.append(i3);
            sb.append(" step ");
            sb.append(-i5);
        }
        return sb.toString();
    }
}
