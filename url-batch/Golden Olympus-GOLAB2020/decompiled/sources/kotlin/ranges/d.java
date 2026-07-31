package kotlin.ranges;

import c2.AbstractC1380c;
import i2.InterfaceC2471a;
import kotlin.collections.E;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public class d implements Iterable, InterfaceC2471a {

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    public static final a f41182e = new a(null);

    /* renamed from: b, reason: collision with root package name */
    private final int f41183b;

    /* renamed from: c, reason: collision with root package name */
    private final int f41184c;

    /* renamed from: d, reason: collision with root package name */
    private final int f41185d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final d a(int i4, int i5, int i6) {
            return new d(i4, i5, i6);
        }

        private a() {
        }
    }

    public d(int i4, int i5, int i6) {
        if (i6 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i6 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f41183b = i4;
        this.f41184c = AbstractC1380c.c(i4, i5, i6);
        this.f41185d = i6;
    }

    public final int b() {
        return this.f41183b;
    }

    public final int d() {
        return this.f41184c;
    }

    public final int e() {
        return this.f41185d;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        if (isEmpty() && ((d) obj).isEmpty()) {
            return true;
        }
        d dVar = (d) obj;
        return this.f41183b == dVar.f41183b && this.f41184c == dVar.f41184c && this.f41185d == dVar.f41185d;
    }

    @Override // java.lang.Iterable
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public E iterator() {
        return new l2.c(this.f41183b, this.f41184c, this.f41185d);
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f41183b * 31) + this.f41184c) * 31) + this.f41185d;
    }

    public boolean isEmpty() {
        return this.f41185d > 0 ? this.f41183b > this.f41184c : this.f41183b < this.f41184c;
    }

    public String toString() {
        StringBuilder sb;
        int i4;
        if (this.f41185d > 0) {
            sb = new StringBuilder();
            sb.append(this.f41183b);
            sb.append("..");
            sb.append(this.f41184c);
            sb.append(" step ");
            i4 = this.f41185d;
        } else {
            sb = new StringBuilder();
            sb.append(this.f41183b);
            sb.append(" downTo ");
            sb.append(this.f41184c);
            sb.append(" step ");
            i4 = -this.f41185d;
        }
        sb.append(i4);
        return sb.toString();
    }
}
