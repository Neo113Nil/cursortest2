package squareup.cash.savings;

import com.squareup.cash.money.viewmodels.api.Section;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class SavingsExternalReferenceIdentifier$Screen$GoalFolderToken extends Section.Header {
    public final String value;

    public SavingsExternalReferenceIdentifier$Screen$GoalFolderToken(String str) {
        str.getClass();
        this.value = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SavingsExternalReferenceIdentifier$Screen$GoalFolderToken) && Intrinsics.areEqual(this.value, ((SavingsExternalReferenceIdentifier$Screen$GoalFolderToken) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("GoalFolderToken(value=", this.value, ")");
    }
}
