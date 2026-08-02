package squareup.cash.paychecks;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class PaychecksHomeUi$Header$ViewBenefitsButton$Action_$ClientRoute {
    public final String value;

    public PaychecksHomeUi$Header$ViewBenefitsButton$Action_$ClientRoute(String str) {
        str.getClass();
        this.value = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PaychecksHomeUi$Header$ViewBenefitsButton$Action_$ClientRoute) && Intrinsics.areEqual(this.value, ((PaychecksHomeUi$Header$ViewBenefitsButton$Action_$ClientRoute) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ClientRoute(value=", this.value, ")");
    }
}
