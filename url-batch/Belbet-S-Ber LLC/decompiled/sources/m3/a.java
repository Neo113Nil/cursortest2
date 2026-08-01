package m3;

import b4.d;
import java.util.Iterator;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public class a implements Iterable, j3.a {

    /* renamed from: f, reason: collision with root package name */
    public final int f2735f;

    /* renamed from: g, reason: collision with root package name */
    public final int f2736g;
    public final int h;

    public a(int i, int i4, int i5) {
        if (i5 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i5 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f2735f = i;
        this.f2736g = d.z(i, i4, i5);
        this.h = i5;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        if (isEmpty() && ((a) obj).isEmpty()) {
            return true;
        }
        a aVar = (a) obj;
        return this.f2735f == aVar.f2735f && this.f2736g == aVar.f2736g && this.h == aVar.h;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f2735f * 31) + this.f2736g) * 31) + this.h;
    }

    public boolean isEmpty() {
        int i = this.h;
        int i4 = this.f2736g;
        int i5 = this.f2735f;
        return i > 0 ? i5 > i4 : i5 < i4;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new b(this.f2735f, this.f2736g, this.h);
    }

    public String toString() {
        StringBuilder sb;
        int i = this.f2736g;
        int i4 = this.f2735f;
        int i5 = this.h;
        if (i5 > 0) {
            sb = new StringBuilder();
            sb.append(i4);
            sb.append("..");
            sb.append(i);
            sb.append(" step ");
            sb.append(i5);
        } else {
            sb = new StringBuilder();
            sb.append(i4);
            sb.append(" downTo ");
            sb.append(i);
            sb.append(" step ");
            sb.append(-i5);
        }
        return sb.toString();
    }
}
