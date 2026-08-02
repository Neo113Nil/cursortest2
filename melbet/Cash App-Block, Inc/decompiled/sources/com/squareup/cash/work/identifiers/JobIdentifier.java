package com.squareup.cash.work.identifiers;

import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;

/* loaded from: classes7.dex */
public final class JobIdentifier {
    public final String entityId;
    public final String token;

    public JobIdentifier(String str) {
        str.getClass();
        this.token = str;
        if (StringsKt.isBlank(str)) {
            a$$ExternalSyntheticBUOutline0.m$3("Job token cannot be blank");
            throw null;
        }
        if (StringsKt__StringsJVMKt.startsWith(str, "tmjob:", false)) {
            a$$ExternalSyntheticBUOutline0.m$3("Job token should not include the 'tmjob:' prefix");
            throw null;
        }
        this.entityId = "tmjob:".concat(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof JobIdentifier) && Intrinsics.areEqual(this.token, ((JobIdentifier) obj).token);
    }

    public final int hashCode() {
        return this.token.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("JobIdentifier(token=", this.token, ")");
    }
}
