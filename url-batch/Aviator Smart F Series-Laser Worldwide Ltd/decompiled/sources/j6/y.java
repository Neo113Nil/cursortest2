package j6;

/* loaded from: classes4.dex */
public final class y extends w implements h, s {
    public static final a Companion;
    private static final y EMPTY;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.o oVar) {
            this();
        }

        public final y getEMPTY() {
            return y.EMPTY;
        }
    }

    static {
        kotlin.jvm.internal.o oVar = null;
        Companion = new a(oVar);
        EMPTY = new y(-1, 0, oVar);
    }

    public /* synthetic */ y(int i8, int i9, kotlin.jvm.internal.o oVar) {
        this(i8, i9);
    }

    /* renamed from: getEndExclusive-pVg5ArA$annotations, reason: not valid java name */
    public static /* synthetic */ void m207getEndExclusivepVg5ArA$annotations() {
    }

    @Override // j6.h
    public /* bridge */ /* synthetic */ boolean contains(Comparable comparable) {
        return m208containsWZ4Q5Ns(((y5.p) comparable).m1684unboximpl());
    }

    /* renamed from: contains-WZ4Q5Ns, reason: not valid java name */
    public boolean m208containsWZ4Q5Ns(int i8) {
        int compare;
        int compare2;
        compare = Integer.compare(m203getFirstpVg5ArA() ^ Integer.MIN_VALUE, i8 ^ Integer.MIN_VALUE);
        if (compare <= 0) {
            compare2 = Integer.compare(i8 ^ Integer.MIN_VALUE, m204getLastpVg5ArA() ^ Integer.MIN_VALUE);
            if (compare2 <= 0) {
                return true;
            }
        }
        return false;
    }

    @Override // j6.w
    public boolean equals(Object obj) {
        if (obj instanceof y) {
            if (!isEmpty() || !((y) obj).isEmpty()) {
                y yVar = (y) obj;
                if (m203getFirstpVg5ArA() != yVar.m203getFirstpVg5ArA() || m204getLastpVg5ArA() != yVar.m204getLastpVg5ArA()) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // j6.s
    public /* bridge */ /* synthetic */ Comparable getEndExclusive() {
        return y5.p.m1626boximpl(m209getEndExclusivepVg5ArA());
    }

    /* renamed from: getEndExclusive-pVg5ArA, reason: not valid java name */
    public int m209getEndExclusivepVg5ArA() {
        if (m204getLastpVg5ArA() != -1) {
            return y5.p.m1632constructorimpl(m204getLastpVg5ArA() + 1);
        }
        throw new IllegalStateException("Cannot return the exclusive upper bound of a range that includes MAX_VALUE.".toString());
    }

    @Override // j6.h
    public /* bridge */ /* synthetic */ Comparable getEndInclusive() {
        return y5.p.m1626boximpl(m210getEndInclusivepVg5ArA());
    }

    /* renamed from: getEndInclusive-pVg5ArA, reason: not valid java name */
    public int m210getEndInclusivepVg5ArA() {
        return m204getLastpVg5ArA();
    }

    @Override // j6.h
    public /* bridge */ /* synthetic */ Comparable getStart() {
        return y5.p.m1626boximpl(m211getStartpVg5ArA());
    }

    /* renamed from: getStart-pVg5ArA, reason: not valid java name */
    public int m211getStartpVg5ArA() {
        return m203getFirstpVg5ArA();
    }

    @Override // j6.w
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (m203getFirstpVg5ArA() * 31) + m204getLastpVg5ArA();
    }

    @Override // j6.w, j6.h
    public boolean isEmpty() {
        int compare;
        compare = Integer.compare(m203getFirstpVg5ArA() ^ Integer.MIN_VALUE, m204getLastpVg5ArA() ^ Integer.MIN_VALUE);
        return compare > 0;
    }

    @Override // j6.w
    public String toString() {
        return ((Object) y5.p.m1678toStringimpl(m203getFirstpVg5ArA())) + ".." + ((Object) y5.p.m1678toStringimpl(m204getLastpVg5ArA()));
    }

    private y(int i8, int i9) {
        super(i8, i9, 1, null);
    }
}
