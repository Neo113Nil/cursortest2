package j6;

import j6.s;

/* loaded from: classes4.dex */
class i implements s {
    private final Comparable<Object> endExclusive;
    private final Comparable<Object> start;

    public i(Comparable<Object> start, Comparable<Object> endExclusive) {
        kotlin.jvm.internal.s.checkNotNullParameter(start, "start");
        kotlin.jvm.internal.s.checkNotNullParameter(endExclusive, "endExclusive");
        this.start = start;
        this.endExclusive = endExclusive;
    }

    @Override // j6.s
    public boolean contains(Comparable<Object> comparable) {
        return s.a.contains(this, comparable);
    }

    public boolean equals(Object obj) {
        if (obj instanceof i) {
            if (!isEmpty() || !((i) obj).isEmpty()) {
                i iVar = (i) obj;
                if (!kotlin.jvm.internal.s.areEqual(getStart(), iVar.getStart()) || !kotlin.jvm.internal.s.areEqual(getEndExclusive(), iVar.getEndExclusive())) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // j6.s
    public Comparable<Object> getEndExclusive() {
        return this.endExclusive;
    }

    @Override // j6.s
    public Comparable<Object> getStart() {
        return this.start;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (getStart().hashCode() * 31) + getEndExclusive().hashCode();
    }

    @Override // j6.s
    public boolean isEmpty() {
        return s.a.isEmpty(this);
    }

    public String toString() {
        return getStart() + "..<" + getEndExclusive();
    }
}
