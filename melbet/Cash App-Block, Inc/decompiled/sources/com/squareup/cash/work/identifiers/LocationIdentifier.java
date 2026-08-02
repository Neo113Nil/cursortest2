package com.squareup.cash.work.identifiers;

import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;

/* loaded from: classes7.dex */
public final class LocationIdentifier {
    public final String entityId;
    public final String token;

    public LocationIdentifier(String str) {
        str.getClass();
        this.token = str;
        if (StringsKt.isBlank(str)) {
            a$$ExternalSyntheticBUOutline0.m$3("Location token cannot be blank");
            throw null;
        }
        if (StringsKt__StringsJVMKt.startsWith(str, "tmlocation:", false)) {
            a$$ExternalSyntheticBUOutline0.m$3("Location token should not include the 'tmlocation:' prefix");
            throw null;
        }
        this.entityId = "tmlocation:".concat(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LocationIdentifier) && Intrinsics.areEqual(this.token, ((LocationIdentifier) obj).token);
    }

    public final int hashCode() {
        return this.token.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("LocationIdentifier(token=", this.token, ")");
    }
}
