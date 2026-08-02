package t3;

import java.util.Iterator;
import p3.InterfaceC1349a;

/* renamed from: t3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1441a implements Iterable, InterfaceC1349a {

    /* renamed from: a, reason: collision with root package name */
    public final int f15424a;

    /* renamed from: b, reason: collision with root package name */
    public final int f15425b;

    /* renamed from: c, reason: collision with root package name */
    public final int f15426c;

    public C1441a(int i4, int i5, int i6) {
        if (i6 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i6 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f15424a = i4;
        this.f15425b = V3.b.q(i4, i5, i6);
        this.f15426c = i6;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C1441a)) {
            return false;
        }
        if (isEmpty() && ((C1441a) obj).isEmpty()) {
            return true;
        }
        C1441a c1441a = (C1441a) obj;
        return this.f15424a == c1441a.f15424a && this.f15425b == c1441a.f15425b && this.f15426c == c1441a.f15426c;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f15424a * 31) + this.f15425b) * 31) + this.f15426c;
    }

    public boolean isEmpty() {
        int i4 = this.f15426c;
        int i5 = this.f15425b;
        int i6 = this.f15424a;
        return i4 > 0 ? i6 > i5 : i6 < i5;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C1442b(this.f15424a, this.f15425b, this.f15426c);
    }

    public String toString() {
        StringBuilder sb;
        int i4 = this.f15425b;
        int i5 = this.f15424a;
        int i6 = this.f15426c;
        if (i6 > 0) {
            sb = new StringBuilder();
            sb.append(i5);
            sb.append("..");
            sb.append(i4);
            sb.append(" step ");
            sb.append(i6);
        } else {
            sb = new StringBuilder();
            sb.append(i5);
            sb.append(" downTo ");
            sb.append(i4);
            sb.append(" step ");
            sb.append(-i6);
        }
        return sb.toString();
    }
}
