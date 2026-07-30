package j6;

/* loaded from: classes4.dex */
final class r implements s {
    private final float _endExclusive;
    private final float _start;

    public r(float f8, float f9) {
        this._start = f8;
        this._endExclusive = f9;
    }

    private final boolean lessThanOrEquals(float f8, float f9) {
        return f8 <= f9;
    }

    public boolean contains(float f8) {
        return f8 >= this._start && f8 < this._endExclusive;
    }

    public boolean equals(Object obj) {
        if (obj instanceof r) {
            if (!isEmpty() || !((r) obj).isEmpty()) {
                r rVar = (r) obj;
                if (this._start != rVar._start || this._endExclusive != rVar._endExclusive) {
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
        return (Float.floatToIntBits(this._start) * 31) + Float.floatToIntBits(this._endExclusive);
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
        return contains(((Number) comparable).floatValue());
    }

    @Override // j6.s
    public Float getEndExclusive() {
        return Float.valueOf(this._endExclusive);
    }

    @Override // j6.s
    public Float getStart() {
        return Float.valueOf(this._start);
    }
}
