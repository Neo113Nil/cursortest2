package e2;

import I2.l;
import a2.InterfaceC0184a;
import java.util.Iterator;

/* renamed from: e2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0378b implements Iterable, InterfaceC0184a {

    /* renamed from: d, reason: collision with root package name */
    public final int f4768d;

    /* renamed from: e, reason: collision with root package name */
    public final int f4769e;

    /* renamed from: f, reason: collision with root package name */
    public final int f4770f;

    public C0378b(int i3, int i4, int i5) {
        if (i5 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i5 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f4768d = i3;
        this.f4769e = l.D(i3, i4, i5);
        this.f4770f = i5;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C0378b) {
            if (!isEmpty() || !((C0378b) obj).isEmpty()) {
                C0378b c0378b = (C0378b) obj;
                if (this.f4768d != c0378b.f4768d || this.f4769e != c0378b.f4769e || this.f4770f != c0378b.f4770f) {
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
        return (((this.f4768d * 31) + this.f4769e) * 31) + this.f4770f;
    }

    public boolean isEmpty() {
        int i3 = this.f4770f;
        int i4 = this.f4769e;
        int i5 = this.f4768d;
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
        return new C0379c(this.f4768d, this.f4769e, this.f4770f);
    }

    public String toString() {
        StringBuilder sb;
        int i3 = this.f4769e;
        int i4 = this.f4768d;
        int i5 = this.f4770f;
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
