package androidx.compose.foundation.layout;

import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WindowInsetsPadding.kt */
@Stable
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Landroidx/compose/foundation/layout/PaddingValuesConsumingModifier;", "Landroidx/compose/foundation/layout/InsetsConsumingModifier;", "Landroidx/compose/foundation/layout/WindowInsets;", "modifierLocalInsets", "calculateInsets", "(Landroidx/compose/foundation/layout/WindowInsets;)Landroidx/compose/foundation/layout/WindowInsets;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroidx/compose/foundation/layout/PaddingValues;", "paddingValues", "Landroidx/compose/foundation/layout/PaddingValues;", "foundation-layout_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
final class PaddingValuesConsumingModifier extends InsetsConsumingModifier {
    private final PaddingValues paddingValues;

    @Override // androidx.compose.foundation.layout.InsetsConsumingModifier
    public WindowInsets calculateInsets(WindowInsets modifierLocalInsets) {
        Intrinsics.checkNotNullParameter(modifierLocalInsets, "modifierLocalInsets");
        return WindowInsetsKt.add(WindowInsetsKt.asInsets(this.paddingValues), modifierLocalInsets);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof PaddingValuesConsumingModifier) {
            return Intrinsics.areEqual(((PaddingValuesConsumingModifier) other).paddingValues, this.paddingValues);
        }
        return false;
    }

    public int hashCode() {
        return this.paddingValues.hashCode();
    }
}
