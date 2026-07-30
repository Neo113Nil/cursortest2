package j6;

/* loaded from: classes4.dex */
public final class m extends k implements h, s {
    public static final a Companion = new a(null);
    private static final m EMPTY = new m(1, 0);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.o oVar) {
            this();
        }

        public final m getEMPTY() {
            return m.EMPTY;
        }
    }

    public m(int i8, int i9) {
        super(i8, i9, 1);
    }

    public static /* synthetic */ void getEndExclusive$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // j6.h
    public /* bridge */ /* synthetic */ boolean contains(Comparable comparable) {
        return contains(((Number) comparable).intValue());
    }

    @Override // j6.k
    public boolean equals(Object obj) {
        if (obj instanceof m) {
            if (!isEmpty() || !((m) obj).isEmpty()) {
                m mVar = (m) obj;
                if (getFirst() != mVar.getFirst() || getLast() != mVar.getLast()) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // j6.k
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (getFirst() * 31) + getLast();
    }

    @Override // j6.k, j6.h
    public boolean isEmpty() {
        return getFirst() > getLast();
    }

    @Override // j6.k
    public String toString() {
        return getFirst() + ".." + getLast();
    }

    public boolean contains(int i8) {
        return getFirst() <= i8 && i8 <= getLast();
    }

    @Override // j6.s
    public Integer getEndExclusive() {
        if (getLast() != Integer.MAX_VALUE) {
            return Integer.valueOf(getLast() + 1);
        }
        throw new IllegalStateException("Cannot return the exclusive upper bound of a range that includes MAX_VALUE.".toString());
    }

    @Override // j6.h
    public Integer getEndInclusive() {
        return Integer.valueOf(getLast());
    }

    @Override // j6.h
    public Integer getStart() {
        return Integer.valueOf(getFirst());
    }
}
