package squareup.cash.savings;

import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import com.squareup.cash.money.viewmodels.api.Section;

/* loaded from: classes10.dex */
public final class SavingsExternalReferenceIdentifier$Screen$GeneralSavings extends Section.Header {
    public final boolean value;

    public SavingsExternalReferenceIdentifier$Screen$GeneralSavings(boolean z) {
        this.value = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SavingsExternalReferenceIdentifier$Screen$GeneralSavings) && this.value == ((SavingsExternalReferenceIdentifier$Screen$GeneralSavings) obj).value;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.value);
    }

    public final String toString() {
        return Fragment$5$$ExternalSyntheticOutline0.m("GeneralSavings(value=", ")", this.value);
    }
}
