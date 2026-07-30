package j6;

import kotlin.collections.f0;

/* loaded from: classes4.dex */
public class k implements Iterable, g6.a {
    public static final a Companion = new a(null);
    private final int first;
    private final int last;
    private final int step;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.o oVar) {
            this();
        }

        public final k fromClosedRange(int i8, int i9, int i10) {
            return new k(i8, i9, i10);
        }
    }

    public k(int i8, int i9, int i10) {
        if (i10 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i10 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.first = i8;
        this.last = b6.c.getProgressionLastElement(i8, i9, i10);
        this.step = i10;
    }

    public boolean equals(Object obj) {
        if (obj instanceof k) {
            if (!isEmpty() || !((k) obj).isEmpty()) {
                k kVar = (k) obj;
                if (this.first != kVar.first || this.last != kVar.last || this.step != kVar.step) {
                }
            }
            return true;
        }
        return false;
    }

    public final int getFirst() {
        return this.first;
    }

    public final int getLast() {
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
            if (this.first <= this.last) {
                return false;
            }
        } else if (this.first >= this.last) {
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
    public f0 iterator() {
        return new l(this.first, this.last, this.step);
    }
}
