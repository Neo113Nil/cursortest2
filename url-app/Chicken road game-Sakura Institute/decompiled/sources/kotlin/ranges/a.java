package kotlin.ranges;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
/* loaded from: classes.dex */
public class a implements Iterable<Integer>, N2.a {

    /* renamed from: j, reason: collision with root package name */
    public static final C0003a f7504j = new C0003a(null);

    /* renamed from: d, reason: collision with root package name */
    public final int f7505d;

    /* renamed from: e, reason: collision with root package name */
    public final int f7506e;

    /* renamed from: i, reason: collision with root package name */
    public final int f7507i;

    @Metadata
    /* renamed from: kotlin.ranges.a$a, reason: collision with other inner class name */
    public static final class C0003a {
        public C0003a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public a(int i2, int i4, int i5) {
        if (i5 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i5 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f7505d = i2;
        this.f7506e = G2.b.a(i2, i4, i5);
        this.f7507i = i5;
    }

    @Override // java.lang.Iterable
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final R2.b iterator() {
        return new R2.b(this.f7505d, this.f7506e, this.f7507i);
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            if (!isEmpty() || !((a) obj).isEmpty()) {
                a aVar = (a) obj;
                if (this.f7505d != aVar.f7505d || this.f7506e != aVar.f7506e || this.f7507i != aVar.f7507i) {
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
        return (((this.f7505d * 31) + this.f7506e) * 31) + this.f7507i;
    }

    public boolean isEmpty() {
        int i2 = this.f7507i;
        int i4 = this.f7506e;
        int i5 = this.f7505d;
        if (i2 > 0) {
            if (i5 <= i4) {
                return false;
            }
        } else if (i5 >= i4) {
            return false;
        }
        return true;
    }

    public String toString() {
        StringBuilder sb;
        int i2 = this.f7506e;
        int i4 = this.f7505d;
        int i5 = this.f7507i;
        if (i5 > 0) {
            sb = new StringBuilder();
            sb.append(i4);
            sb.append("..");
            sb.append(i2);
            sb.append(" step ");
            sb.append(i5);
        } else {
            sb = new StringBuilder();
            sb.append(i4);
            sb.append(" downTo ");
            sb.append(i2);
            sb.append(" step ");
            sb.append(-i5);
        }
        return sb.toString();
    }
}
