package j6;

/* loaded from: classes4.dex */
public final class b0 extends z implements h, s {
    public static final a Companion = new a(null);
    private static final b0 EMPTY = new b0(-1, 0, null);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.o oVar) {
            this();
        }

        public final b0 getEMPTY() {
            return b0.EMPTY;
        }
    }

    public /* synthetic */ b0(long j8, long j9, kotlin.jvm.internal.o oVar) {
        this(j8, j9);
    }

    /* renamed from: getEndExclusive-s-VKNKU$annotations, reason: not valid java name */
    public static /* synthetic */ void m166getEndExclusivesVKNKU$annotations() {
    }

    @Override // j6.h
    public /* bridge */ /* synthetic */ boolean contains(Comparable comparable) {
        return m167containsVKZWuLQ(((y5.r) comparable).m1762unboximpl());
    }

    /* renamed from: contains-VKZWuLQ, reason: not valid java name */
    public boolean m167containsVKZWuLQ(long j8) {
        int compare;
        int compare2;
        compare = Long.compare(m212getFirstsVKNKU() ^ Long.MIN_VALUE, j8 ^ Long.MIN_VALUE);
        if (compare <= 0) {
            compare2 = Long.compare(j8 ^ Long.MIN_VALUE, m213getLastsVKNKU() ^ Long.MIN_VALUE);
            if (compare2 <= 0) {
                return true;
            }
        }
        return false;
    }

    @Override // j6.z
    public boolean equals(Object obj) {
        if (obj instanceof b0) {
            if (!isEmpty() || !((b0) obj).isEmpty()) {
                b0 b0Var = (b0) obj;
                if (m212getFirstsVKNKU() != b0Var.m212getFirstsVKNKU() || m213getLastsVKNKU() != b0Var.m213getLastsVKNKU()) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // j6.s
    public /* bridge */ /* synthetic */ Comparable getEndExclusive() {
        return y5.r.m1704boximpl(m168getEndExclusivesVKNKU());
    }

    /* renamed from: getEndExclusive-s-VKNKU, reason: not valid java name */
    public long m168getEndExclusivesVKNKU() {
        if (m213getLastsVKNKU() != -1) {
            return y5.r.m1710constructorimpl(m213getLastsVKNKU() + y5.r.m1710constructorimpl(1 & com.realsil.sdk.dfu.i.a.INVALID_VERSION_32));
        }
        throw new IllegalStateException("Cannot return the exclusive upper bound of a range that includes MAX_VALUE.".toString());
    }

    @Override // j6.h
    public /* bridge */ /* synthetic */ Comparable getEndInclusive() {
        return y5.r.m1704boximpl(m169getEndInclusivesVKNKU());
    }

    /* renamed from: getEndInclusive-s-VKNKU, reason: not valid java name */
    public long m169getEndInclusivesVKNKU() {
        return m213getLastsVKNKU();
    }

    @Override // j6.h
    public /* bridge */ /* synthetic */ Comparable getStart() {
        return y5.r.m1704boximpl(m170getStartsVKNKU());
    }

    /* renamed from: getStart-s-VKNKU, reason: not valid java name */
    public long m170getStartsVKNKU() {
        return m212getFirstsVKNKU();
    }

    @Override // j6.z
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return ((int) y5.r.m1710constructorimpl(m213getLastsVKNKU() ^ y5.r.m1710constructorimpl(m213getLastsVKNKU() >>> 32))) + (((int) y5.r.m1710constructorimpl(m212getFirstsVKNKU() ^ y5.r.m1710constructorimpl(m212getFirstsVKNKU() >>> 32))) * 31);
    }

    @Override // j6.z, j6.h
    public boolean isEmpty() {
        int compare;
        compare = Long.compare(m212getFirstsVKNKU() ^ Long.MIN_VALUE, m213getLastsVKNKU() ^ Long.MIN_VALUE);
        return compare > 0;
    }

    @Override // j6.z
    public String toString() {
        return ((Object) y5.r.m1756toStringimpl(m212getFirstsVKNKU())) + ".." + ((Object) y5.r.m1756toStringimpl(m213getLastsVKNKU()));
    }

    private b0(long j8, long j9) {
        super(j8, j9, 1L, null);
    }
}
