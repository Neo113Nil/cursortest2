package kotlinx.collections.immutable.internal;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes9.dex */
public final class DeltaCounter {
    public int count = 0;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DeltaCounter) && this.count == ((DeltaCounter) obj).count;
    }

    public final int getCount() {
        return this.count;
    }

    public final int hashCode() {
        return Integer.hashCode(this.count);
    }

    public final void plusAssign(int i) {
        this.count += i;
    }

    public final void setCount(int i) {
        this.count = i;
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(new StringBuilder("DeltaCounter(count="), this.count, ')');
    }
}
