package j6;

/* loaded from: classes4.dex */
public final class p extends n implements h, s {
    public static final a Companion = new a(null);
    private static final p EMPTY = new p(1, 0);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.o oVar) {
            this();
        }

        public final p getEMPTY() {
            return p.EMPTY;
        }
    }

    public p(long j8, long j9) {
        super(j8, j9, 1L);
    }

    public static /* synthetic */ void getEndExclusive$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // j6.h
    public /* bridge */ /* synthetic */ boolean contains(Comparable comparable) {
        return contains(((Number) comparable).longValue());
    }

    @Override // j6.n
    public boolean equals(Object obj) {
        if (obj instanceof p) {
            if (!isEmpty() || !((p) obj).isEmpty()) {
                p pVar = (p) obj;
                if (getFirst() != pVar.getFirst() || getLast() != pVar.getLast()) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // j6.n
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (int) ((31 * (getFirst() ^ (getFirst() >>> 32))) + (getLast() ^ (getLast() >>> 32)));
    }

    @Override // j6.n, j6.h
    public boolean isEmpty() {
        return getFirst() > getLast();
    }

    @Override // j6.n
    public String toString() {
        return getFirst() + ".." + getLast();
    }

    public boolean contains(long j8) {
        return getFirst() <= j8 && j8 <= getLast();
    }

    @Override // j6.s
    public Long getEndExclusive() {
        if (getLast() != Long.MAX_VALUE) {
            return Long.valueOf(getLast() + 1);
        }
        throw new IllegalStateException("Cannot return the exclusive upper bound of a range that includes MAX_VALUE.".toString());
    }

    @Override // j6.h
    public Long getEndInclusive() {
        return Long.valueOf(getLast());
    }

    @Override // j6.h
    public Long getStart() {
        return Long.valueOf(getFirst());
    }
}
