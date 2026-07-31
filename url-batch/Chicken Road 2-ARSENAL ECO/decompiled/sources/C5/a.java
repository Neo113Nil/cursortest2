package C5;

import a1.AbstractC0223a;
import java.util.Iterator;
import y5.InterfaceC0766a;

/* loaded from: classes.dex */
public class a implements Iterable, InterfaceC0766a {

    /* renamed from: f, reason: collision with root package name */
    public final int f228f;

    /* renamed from: g, reason: collision with root package name */
    public final int f229g;

    /* renamed from: h, reason: collision with root package name */
    public final int f230h;

    public a(int i7, int i8, int i9) {
        if (i9 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i9 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f228f = i7;
        this.f229g = AbstractC0223a.x(i7, i8, i9);
        this.f230h = i9;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        if (isEmpty() && ((a) obj).isEmpty()) {
            return true;
        }
        a aVar = (a) obj;
        return this.f228f == aVar.f228f && this.f229g == aVar.f229g && this.f230h == aVar.f230h;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f228f * 31) + this.f229g) * 31) + this.f230h;
    }

    public boolean isEmpty() {
        int i7 = this.f230h;
        int i8 = this.f229g;
        int i9 = this.f228f;
        return i7 > 0 ? i9 > i8 : i9 < i8;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new b(this.f228f, this.f229g, this.f230h);
    }

    public String toString() {
        StringBuilder sb;
        int i7 = this.f229g;
        int i8 = this.f228f;
        int i9 = this.f230h;
        if (i9 > 0) {
            sb = new StringBuilder();
            sb.append(i8);
            sb.append("..");
            sb.append(i7);
            sb.append(" step ");
            sb.append(i9);
        } else {
            sb = new StringBuilder();
            sb.append(i8);
            sb.append(" downTo ");
            sb.append(i7);
            sb.append(" step ");
            sb.append(-i9);
        }
        return sb.toString();
    }
}
