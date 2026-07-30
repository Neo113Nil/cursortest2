package j6;

/* loaded from: classes4.dex */
final class f implements g {
    private final float _endInclusive;
    private final float _start;

    public f(float f8, float f9) {
        this._start = f8;
        this._endInclusive = f9;
    }

    public boolean contains(float f8) {
        return f8 >= this._start && f8 <= this._endInclusive;
    }

    public boolean equals(Object obj) {
        if (obj instanceof f) {
            if (!isEmpty() || !((f) obj).isEmpty()) {
                f fVar = (f) obj;
                if (this._start != fVar._start || this._endInclusive != fVar._endInclusive) {
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
        return (Float.floatToIntBits(this._start) * 31) + Float.floatToIntBits(this._endInclusive);
    }

    @Override // j6.g, j6.h
    public boolean isEmpty() {
        return this._start > this._endInclusive;
    }

    public boolean lessThanOrEquals(float f8, float f9) {
        return f8 <= f9;
    }

    public String toString() {
        return this._start + ".." + this._endInclusive;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // j6.g, j6.h
    public /* bridge */ /* synthetic */ boolean contains(Comparable comparable) {
        return contains(((Number) comparable).floatValue());
    }

    @Override // j6.g, j6.h
    public Float getEndInclusive() {
        return Float.valueOf(this._endInclusive);
    }

    @Override // j6.g, j6.h
    public Float getStart() {
        return Float.valueOf(this._start);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // j6.g
    public /* bridge */ /* synthetic */ boolean lessThanOrEquals(Comparable comparable, Comparable comparable2) {
        return lessThanOrEquals(((Number) comparable).floatValue(), ((Number) comparable2).floatValue());
    }
}
