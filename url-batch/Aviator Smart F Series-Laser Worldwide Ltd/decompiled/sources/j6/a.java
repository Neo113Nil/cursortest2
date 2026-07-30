package j6;

/* loaded from: classes4.dex */
public class a implements Iterable, g6.a {
    public static final C0357a Companion = new C0357a(null);
    private final char first;
    private final char last;
    private final int step;

    /* renamed from: j6.a$a, reason: collision with other inner class name */
    public static final class C0357a {
        private C0357a() {
        }

        public /* synthetic */ C0357a(kotlin.jvm.internal.o oVar) {
            this();
        }

        public final a fromClosedRange(char c8, char c9, int i8) {
            return new a(c8, c9, i8);
        }
    }

    public a(char c8, char c9, int i8) {
        if (i8 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i8 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.first = c8;
        this.last = (char) b6.c.getProgressionLastElement((int) c8, (int) c9, i8);
        this.step = i8;
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            if (!isEmpty() || !((a) obj).isEmpty()) {
                a aVar = (a) obj;
                if (this.first != aVar.first || this.last != aVar.last || this.step != aVar.step) {
                }
            }
            return true;
        }
        return false;
    }

    public final char getFirst() {
        return this.first;
    }

    public final char getLast() {
        return this.last;
    }

    public final int getStep() {
        return this.step;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.first * 31) + this.last) * 31) + this.step;
    }

    public boolean isEmpty() {
        if (this.step > 0) {
            if (kotlin.jvm.internal.s.compare((int) this.first, (int) this.last) <= 0) {
                return false;
            }
        } else if (kotlin.jvm.internal.s.compare((int) this.first, (int) this.last) >= 0) {
            return false;
        }
        return true;
    }

    public String toString() {
        StringBuilder sb;
        int i8;
        if (this.step > 0) {
            sb = new StringBuilder();
            sb.append(this.first);
            sb.append("..");
            sb.append(this.last);
            sb.append(" step ");
            i8 = this.step;
        } else {
            sb = new StringBuilder();
            sb.append(this.first);
            sb.append(" downTo ");
            sb.append(this.last);
            sb.append(" step ");
            i8 = -this.step;
        }
        sb.append(i8);
        return sb.toString();
    }

    @Override // java.lang.Iterable
    public kotlin.collections.o iterator() {
        return new b(this.first, this.last, this.step);
    }
}
