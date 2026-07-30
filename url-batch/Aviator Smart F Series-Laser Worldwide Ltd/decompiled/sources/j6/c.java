package j6;

/* loaded from: classes4.dex */
public final class c extends j6.a implements h, s {
    public static final a Companion = new a(null);
    private static final c EMPTY = new c(1, 0);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.o oVar) {
            this();
        }

        public final c getEMPTY() {
            return c.EMPTY;
        }
    }

    public c(char c8, char c9) {
        super(c8, c9, 1);
    }

    public static /* synthetic */ void getEndExclusive$annotations() {
    }

    @Override // j6.h
    public /* bridge */ /* synthetic */ boolean contains(Comparable comparable) {
        return contains(((Character) comparable).charValue());
    }

    @Override // j6.a
    public boolean equals(Object obj) {
        if (obj instanceof c) {
            if (!isEmpty() || !((c) obj).isEmpty()) {
                c cVar = (c) obj;
                if (getFirst() != cVar.getFirst() || getLast() != cVar.getLast()) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // j6.a
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (getFirst() * 31) + getLast();
    }

    @Override // j6.a, j6.h
    public boolean isEmpty() {
        return kotlin.jvm.internal.s.compare((int) getFirst(), (int) getLast()) > 0;
    }

    @Override // j6.a
    public String toString() {
        return getFirst() + ".." + getLast();
    }

    public boolean contains(char c8) {
        return kotlin.jvm.internal.s.compare((int) getFirst(), (int) c8) <= 0 && kotlin.jvm.internal.s.compare((int) c8, (int) getLast()) <= 0;
    }

    @Override // j6.s
    public Character getEndExclusive() {
        if (getLast() != 65535) {
            return Character.valueOf((char) (getLast() + 1));
        }
        throw new IllegalStateException("Cannot return the exclusive upper bound of a range that includes MAX_VALUE.".toString());
    }

    @Override // j6.h
    public Character getEndInclusive() {
        return Character.valueOf(getLast());
    }

    @Override // j6.h
    public Character getStart() {
        return Character.valueOf(getFirst());
    }
}
