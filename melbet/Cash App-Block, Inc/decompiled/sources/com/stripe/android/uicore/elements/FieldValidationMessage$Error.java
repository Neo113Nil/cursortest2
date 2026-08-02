package com.stripe.android.uicore.elements;

import com.datadog.opentelemetry.trace.OtelConventions;
import com.stripe.android.core.strings.IdentifierResolvableString;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Arrays;

/* loaded from: classes8.dex */
public final class FieldValidationMessage$Error {
    public final int message;

    public FieldValidationMessage$Error(int i) {
        this.message = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FieldValidationMessage$Error) && this.message == ((FieldValidationMessage$Error) obj).message;
    }

    public IdentifierResolvableString getResolvable() {
        Object[] objArr = new Object[0];
        return OtelConventions.resolvableString$default(this.message, Arrays.copyOf(objArr, objArr.length));
    }

    public final int hashCode() {
        return Integer.hashCode(this.message) * 31;
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.message, "Error(message=", ", formatArgs=null)");
    }
}
