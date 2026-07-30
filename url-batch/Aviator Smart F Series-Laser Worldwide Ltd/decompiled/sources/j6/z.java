package j6;

import java.util.Iterator;

/* loaded from: classes4.dex */
public class z implements Iterable, g6.a {
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

        /* renamed from: fromClosedRange-7ftBX0g, reason: not valid java name */
        public final z m214fromClosedRange7ftBX0g(long j8, long j9, long j10) {
            return new z(j8, j9, j10, null);
        }
    }

    public /* synthetic */ z(long j8, long j9, long j10, kotlin.jvm.internal.o oVar) {
        this(j8, j9, j10);
    }

    public boolean equals(Object obj) {
        if (obj instanceof z) {
            if (!isEmpty() || !((z) obj).isEmpty()) {
                z zVar = (z) obj;
                if (this.first != zVar.first || this.last != zVar.last || this.step != zVar.step) {
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: getFirst-s-VKNKU, reason: not valid java name */
    public final long m212getFirstsVKNKU() {
        return this.first;
    }

    /* renamed from: getLast-s-VKNKU, reason: not valid java name */
    public final long m213getLastsVKNKU() {
        return this.last;
    }

    public final long getStep() {
        return this.step;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        long j8 = this.first;
        int m1710constructorimpl = ((int) y5.r.m1710constructorimpl(j8 ^ y5.r.m1710constructorimpl(j8 >>> 32))) * 31;
        long j9 = this.last;
        int m1710constructorimpl2 = (m1710constructorimpl + ((int) y5.r.m1710constructorimpl(j9 ^ y5.r.m1710constructorimpl(j9 >>> 32)))) * 31;
        long j10 = this.step;
        return ((int) (j10 ^ (j10 >>> 32))) + m1710constructorimpl2;
    }

    public boolean isEmpty() {
        int compare;
        int compare2;
        long j8 = this.step;
        long j9 = this.first;
        long j10 = this.last;
        if (j8 > 0) {
            compare2 = Long.compare(j9 ^ Long.MIN_VALUE, j10 ^ Long.MIN_VALUE);
            if (compare2 <= 0) {
                return false;
            }
        } else {
            compare = Long.compare(j9 ^ Long.MIN_VALUE, j10 ^ Long.MIN_VALUE);
            if (compare >= 0) {
                return false;
            }
        }
        return true;
    }

    @Override // java.lang.Iterable
    public final Iterator<y5.r> iterator() {
        return new a0(this.first, this.last, this.step, null);
    }

    public String toString() {
        StringBuilder sb;
        long j8;
        if (this.step > 0) {
            sb = new StringBuilder();
            sb.append((Object) y5.r.m1756toStringimpl(this.first));
            sb.append("..");
            sb.append((Object) y5.r.m1756toStringimpl(this.last));
            sb.append(" step ");
            j8 = this.step;
        } else {
            sb = new StringBuilder();
            sb.append((Object) y5.r.m1756toStringimpl(this.first));
            sb.append(" downTo ");
            sb.append((Object) y5.r.m1756toStringimpl(this.last));
            sb.append(" step ");
            j8 = -this.step;
        }
        sb.append(j8);
        return sb.toString();
    }

    private z(long j8, long j9, long j10) {
        if (j10 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (j10 == Long.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
        }
        this.first = j8;
        this.last = b6.d.m84getProgressionLastElement7ftBX0g(j8, j9, j10);
        this.step = j10;
    }
}
