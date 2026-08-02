package operations.logic.unwrap;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public final class SingleNestedValue {
    public final Object value;

    public SingleNestedValue(Object obj) {
        this.value = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SingleNestedValue) && Intrinsics.areEqual(this.value, ((SingleNestedValue) obj).value);
    }

    public final int hashCode() {
        Object obj = this.value;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("SingleNestedValue(value=", ")", this.value);
    }
}
