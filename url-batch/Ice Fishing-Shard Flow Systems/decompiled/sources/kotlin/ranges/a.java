package kotlin.ranges;

import Z5.c;
import f6.InterfaceC0406a;
import j6.C0584a;
import j6.C0585b;
import java.util.Iterator;

/* loaded from: classes.dex */
public class a implements Iterable, InterfaceC0406a {

    /* renamed from: l, reason: collision with root package name */
    public static final C0584a f6172l = new C0584a(null);

    /* renamed from: d, reason: collision with root package name */
    public final int f6173d;

    /* renamed from: e, reason: collision with root package name */
    public final int f6174e;

    /* renamed from: i, reason: collision with root package name */
    public final int f6175i;

    public a(int i2, int i5, int i7) {
        if (i7 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i7 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f6173d = i2;
        this.f6174e = c.a(i2, i5, i7);
        this.f6175i = i7;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        if (isEmpty() && ((a) obj).isEmpty()) {
            return true;
        }
        a aVar = (a) obj;
        return this.f6173d == aVar.f6173d && this.f6174e == aVar.f6174e && this.f6175i == aVar.f6175i;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f6173d * 31) + this.f6174e) * 31) + this.f6175i;
    }

    public boolean isEmpty() {
        int i2 = this.f6175i;
        int i5 = this.f6174e;
        int i7 = this.f6173d;
        return i2 > 0 ? i7 > i5 : i7 < i5;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C0585b(this.f6173d, this.f6174e, this.f6175i);
    }

    public String toString() {
        StringBuilder sb;
        int i2 = this.f6174e;
        int i5 = this.f6173d;
        int i7 = this.f6175i;
        if (i7 > 0) {
            sb = new StringBuilder();
            sb.append(i5);
            sb.append("..");
            sb.append(i2);
            sb.append(" step ");
            sb.append(i7);
        } else {
            sb = new StringBuilder();
            sb.append(i5);
            sb.append(" downTo ");
            sb.append(i2);
            sb.append(" step ");
            sb.append(-i7);
        }
        return sb.toString();
    }
}
