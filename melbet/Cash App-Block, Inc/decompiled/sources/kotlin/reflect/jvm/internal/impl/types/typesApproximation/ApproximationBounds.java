package kotlin.reflect.jvm.internal.impl.types.typesApproximation;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public final class ApproximationBounds<T> {
    public final Object lower;
    public final Object upper;

    public ApproximationBounds(T t, T t2) {
        this.lower = t;
        this.upper = t2;
    }

    public final T component1() {
        return (T) this.lower;
    }

    public final T component2() {
        return (T) this.upper;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApproximationBounds)) {
            return false;
        }
        ApproximationBounds approximationBounds = (ApproximationBounds) obj;
        return Intrinsics.areEqual(this.lower, approximationBounds.lower) && Intrinsics.areEqual(this.upper, approximationBounds.upper);
    }

    public final T getLower() {
        return (T) this.lower;
    }

    public final T getUpper() {
        return (T) this.upper;
    }

    public int hashCode() {
        Object obj = this.lower;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.upper;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ApproximationBounds(lower=");
        sb.append(this.lower);
        sb.append(", upper=");
        return Recorder$$ExternalSyntheticOutline1.m(sb, this.upper, ')');
    }
}
