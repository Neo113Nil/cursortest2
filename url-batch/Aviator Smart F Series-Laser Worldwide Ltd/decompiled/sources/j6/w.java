package j6;

import java.util.Iterator;

/* loaded from: classes4.dex */
public class w implements Iterable, g6.a {
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

        /* renamed from: fromClosedRange-Nkh28Cs, reason: not valid java name */
        public final w m205fromClosedRangeNkh28Cs(int i8, int i9, int i10) {
            return new w(i8, i9, i10, null);
        }
    }

    public /* synthetic */ w(int i8, int i9, int i10, kotlin.jvm.internal.o oVar) {
        this(i8, i9, i10);
    }

    public boolean equals(Object obj) {
        if (obj instanceof w) {
            if (!isEmpty() || !((w) obj).isEmpty()) {
                w wVar = (w) obj;
                if (this.first != wVar.first || this.last != wVar.last || this.step != wVar.step) {
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: getFirst-pVg5ArA, reason: not valid java name */
    public final int m203getFirstpVg5ArA() {
        return this.first;
    }

    /* renamed from: getLast-pVg5ArA, reason: not valid java name */
    public final int m204getLastpVg5ArA() {
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
        int compare;
        int compare2;
        if (this.step > 0) {
            compare2 = Integer.compare(this.first ^ Integer.MIN_VALUE, this.last ^ Integer.MIN_VALUE);
            if (compare2 <= 0) {
                return false;
            }
        } else {
            compare = Integer.compare(this.first ^ Integer.MIN_VALUE, this.last ^ Integer.MIN_VALUE);
            if (compare >= 0) {
                return false;
            }
        }
        return true;
    }

    @Override // java.lang.Iterable
    public final Iterator<y5.p> iterator() {
        return new x(this.first, this.last, this.step, null);
    }

    public String toString() {
        StringBuilder sb;
        int i8;
        if (this.step > 0) {
            sb = new StringBuilder();
            sb.append((Object) y5.p.m1678toStringimpl(this.first));
            sb.append("..");
            sb.append((Object) y5.p.m1678toStringimpl(this.last));
            sb.append(" step ");
            i8 = this.step;
        } else {
            sb = new StringBuilder();
            sb.append((Object) y5.p.m1678toStringimpl(this.first));
            sb.append(" downTo ");
            sb.append((Object) y5.p.m1678toStringimpl(this.last));
            sb.append(" step ");
            i8 = -this.step;
        }
        sb.append(i8);
        return sb.toString();
    }

    private w(int i8, int i9, int i10) {
        if (i10 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i10 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.first = i8;
        this.last = b6.d.m85getProgressionLastElementNkh28Cs(i8, i9, i10);
        this.step = i10;
    }
}
