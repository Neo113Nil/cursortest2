package j6;

import kotlin.collections.g0;

/* loaded from: classes4.dex */
public class n implements Iterable, g6.a {
    public static final a Companion = new a(null);
    private final long first;
    private final long last;
    private final long step;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.o oVar) {
            this();
        }

        public final n fromClosedRange(long j8, long j9, long j10) {
            return new n(j8, j9, j10);
        }
    }

    public n(long j8, long j9, long j10) {
        if (j10 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (j10 == Long.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
        }
        this.first = j8;
        this.last = b6.c.getProgressionLastElement(j8, j9, j10);
        this.step = j10;
    }

    public boolean equals(Object obj) {
        if (obj instanceof n) {
            if (!isEmpty() || !((n) obj).isEmpty()) {
                n nVar = (n) obj;
                if (this.first != nVar.first || this.last != nVar.last || this.step != nVar.step) {
                }
            }
            return true;
        }
        return false;
    }

    public final long getFirst() {
        return this.first;
    }

    public final long getLast() {
        return this.last;
    }

    public final long getStep() {
        return this.step;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        long j8 = 31;
        long j9 = this.first;
        long j10 = this.last;
        long j11 = j8 * (((j9 ^ (j9 >>> 32)) * j8) + (j10 ^ (j10 >>> 32)));
        long j12 = this.step;
        return (int) (j11 + (j12 ^ (j12 >>> 32)));
    }

    public boolean isEmpty() {
        long j8 = this.step;
        long j9 = this.first;
        long j10 = this.last;
        if (j8 > 0) {
            if (j9 <= j10) {
                return false;
            }
        } else if (j9 >= j10) {
            return false;
        }
        return true;
    }

    public String toString() {
        StringBuilder sb;
        long j8;
        if (this.step > 0) {
            sb = new StringBuilder();
            sb.append(this.first);
            sb.append("..");
            sb.append(this.last);
            sb.append(" step ");
            j8 = this.step;
        } else {
            sb = new StringBuilder();
            sb.append(this.first);
            sb.append(" downTo ");
            sb.append(this.last);
            sb.append(" step ");
            j8 = -this.step;
        }
        sb.append(j8);
        return sb.toString();
    }

    @Override // java.lang.Iterable
    public g0 iterator() {
        return new o(this.first, this.last, this.step);
    }
}
