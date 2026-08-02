package com.squareup.cash.stripe.api;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class Institution {
    public final String name;

    public Institution(String str) {
        this.name = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Institution) && Intrinsics.areEqual(this.name, ((Institution) obj).name);
    }

    public final int hashCode() {
        String str = this.name;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Institution(name=", this.name, ")");
    }
}
