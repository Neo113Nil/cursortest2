package j6;

/* loaded from: classes4.dex */
final class e implements g {
    private final double _endInclusive;
    private final double _start;

    public e(double d8, double d9) {
        this._start = d8;
        this._endInclusive = d9;
    }

    public boolean contains(double d8) {
        return d8 >= this._start && d8 <= this._endInclusive;
    }

    public boolean equals(Object obj) {
        if (obj instanceof e) {
            if (!isEmpty() || !((e) obj).isEmpty()) {
                e eVar = (e) obj;
                if (this._start != eVar._start || this._endInclusive != eVar._endInclusive) {
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
        return (d.a(this._start) * 31) + d.a(this._endInclusive);
    }

    @Override // j6.g, j6.h
    public boolean isEmpty() {
        return this._start > this._endInclusive;
    }

    public boolean lessThanOrEquals(double d8, double d9) {
        return d8 <= d9;
    }

    public String toString() {
        return this._start + ".." + this._endInclusive;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // j6.g, j6.h
    public /* bridge */ /* synthetic */ boolean contains(Comparable comparable) {
        return contains(((Number) comparable).doubleValue());
    }

    @Override // j6.g, j6.h
    public Double getEndInclusive() {
        return Double.valueOf(this._endInclusive);
    }

    @Override // j6.g, j6.h
    public Double getStart() {
        return Double.valueOf(this._start);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // j6.g
    public /* bridge */ /* synthetic */ boolean lessThanOrEquals(Comparable comparable, Comparable comparable2) {
        return lessThanOrEquals(((Number) comparable).doubleValue(), ((Number) comparable2).doubleValue());
    }
}
