package i6;

import w5.v;

/* loaded from: classes.dex */
public class a implements Iterable<Integer> {

    /* renamed from: i, reason: collision with root package name */
    public static final C0069a f17038i = new C0069a(null);

    /* renamed from: f, reason: collision with root package name */
    private final int f17039f;

    /* renamed from: g, reason: collision with root package name */
    private final int f17040g;

    /* renamed from: h, reason: collision with root package name */
    private final int f17041h;

    /* renamed from: i6.a$a, reason: collision with other inner class name */
    public static final class C0069a {
        private C0069a() {
        }

        public /* synthetic */ C0069a(kotlin.jvm.internal.e eVar) {
            this();
        }

        public final a a(int i7, int i8, int i9) {
            return new a(i7, i8, i9);
        }
    }

    public a(int i7, int i8, int i9) {
        if (i9 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i9 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f17039f = i7;
        this.f17040g = a6.c.b(i7, i8, i9);
        this.f17041h = i9;
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            if (!isEmpty() || !((a) obj).isEmpty()) {
                a aVar = (a) obj;
                if (this.f17039f != aVar.f17039f || this.f17040g != aVar.f17040g || this.f17041h != aVar.f17041h) {
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
        return (((this.f17039f * 31) + this.f17040g) * 31) + this.f17041h;
    }

    public final int i() {
        return this.f17039f;
    }

    public boolean isEmpty() {
        if (this.f17041h > 0) {
            if (this.f17039f > this.f17040g) {
                return true;
            }
        } else if (this.f17039f < this.f17040g) {
            return true;
        }
        return false;
    }

    public final int j() {
        return this.f17040g;
    }

    public final int k() {
        return this.f17041h;
    }

    @Override // java.lang.Iterable
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public v iterator() {
        return new b(this.f17039f, this.f17040g, this.f17041h);
    }

    public String toString() {
        StringBuilder sb;
        int i7;
        if (this.f17041h > 0) {
            sb = new StringBuilder();
            sb.append(this.f17039f);
            sb.append("..");
            sb.append(this.f17040g);
            sb.append(" step ");
            i7 = this.f17041h;
        } else {
            sb = new StringBuilder();
            sb.append(this.f17039f);
            sb.append(" downTo ");
            sb.append(this.f17040g);
            sb.append(" step ");
            i7 = -this.f17041h;
        }
        sb.append(i7);
        return sb.toString();
    }
}
