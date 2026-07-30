package j6;

/* loaded from: classes4.dex */
final class q implements s {
    private final double _endExclusive;
    private final double _start;

    public q(double d8, double d9) {
        this._start = d8;
        this._endExclusive = d9;
    }

    private final boolean lessThanOrEquals(double d8, double d9) {
        return d8 <= d9;
    }

    public boolean contains(double d8) {
        return d8 >= this._start && d8 < this._endExclusive;
    }

    public boolean equals(Object obj) {
        if (obj instanceof q) {
            if (!isEmpty() || !((q) obj).isEmpty()) {
                q qVar = (q) obj;
                if (this._start != qVar._start || this._endExclusive != qVar._endExclusive) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (d.a(this._start) * 31) + d.a(this._endExclusive);
    }

    @Override // j6.s
    public boolean isEmpty() {
        return this._start >= this._endExclusive;
    }

    public String toString() {
        return this._start + "..<" + this._endExclusive;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // j6.s
    public /* bridge */ /* synthetic */ boolean contains(Comparable comparable) {
        return contains(((Number) comparable).doubleValue());
    }

    @Override // j6.s
    public Double getEndExclusive() {
        return Double.valueOf(this._endExclusive);
    }

    @Override // j6.s
    public Double getStart() {
        return Double.valueOf(this._start);
    }
}
