package j6;

import j6.h;

/* loaded from: classes4.dex */
class j implements h {
    private final Comparable<Object> endInclusive;
    private final Comparable<Object> start;

    public j(Comparable<Object> start, Comparable<Object> endInclusive) {
        kotlin.jvm.internal.s.checkNotNullParameter(start, "start");
        kotlin.jvm.internal.s.checkNotNullParameter(endInclusive, "endInclusive");
        this.start = start;
        this.endInclusive = endInclusive;
    }

    @Override // j6.h
    public boolean contains(Comparable<Object> comparable) {
        return h.a.contains(this, comparable);
    }

    public boolean equals(Object obj) {
        if (obj instanceof j) {
            if (!isEmpty() || !((j) obj).isEmpty()) {
                j jVar = (j) obj;
                if (!kotlin.jvm.internal.s.areEqual(getStart(), jVar.getStart()) || !kotlin.jvm.internal.s.areEqual(getEndInclusive(), jVar.getEndInclusive())) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // j6.h
    public Comparable<Object> getEndInclusive() {
        return this.endInclusive;
    }

    @Override // j6.h
    public Comparable<Object> getStart() {
        return this.start;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (getStart().hashCode() * 31) + getEndInclusive().hashCode();
    }

    @Override // j6.h
    public boolean isEmpty() {
        return h.a.isEmpty(this);
    }

    public String toString() {
        return getStart() + ".." + getEndInclusive();
    }
}
