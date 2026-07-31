package androidx.window.embedding;

import androidx.window.core.ExperimentalWindowApi;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SplitPairRule.kt */
@ExperimentalWindowApi
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\u0017\u0010\u0010\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\rR\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Landroidx/window/embedding/SplitPairRule;", "Landroidx/window/embedding/SplitRule;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "finishPrimaryWithSecondary", "Z", "getFinishPrimaryWithSecondary", "()Z", "finishSecondaryWithPrimary", "getFinishSecondaryWithPrimary", "clearTop", "getClearTop", "", "Landroidx/window/embedding/SplitPairFilter;", "filters", "Ljava/util/Set;", "getFilters", "()Ljava/util/Set;", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SplitPairRule extends SplitRule {
    private final boolean clearTop;
    private final Set filters;
    private final boolean finishPrimaryWithSecondary;
    private final boolean finishSecondaryWithPrimary;

    @Override // androidx.window.embedding.SplitRule
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SplitPairRule) || !super.equals(other)) {
            return false;
        }
        SplitPairRule splitPairRule = (SplitPairRule) other;
        return Intrinsics.areEqual(this.filters, splitPairRule.filters) && this.finishPrimaryWithSecondary == splitPairRule.finishPrimaryWithSecondary && this.finishSecondaryWithPrimary == splitPairRule.finishSecondaryWithPrimary && this.clearTop == splitPairRule.clearTop;
    }

    @Override // androidx.window.embedding.SplitRule
    public int hashCode() {
        return (((((((super.hashCode() * 31) + this.filters.hashCode()) * 31) + Boolean.hashCode(this.finishPrimaryWithSecondary)) * 31) + Boolean.hashCode(this.finishSecondaryWithPrimary)) * 31) + Boolean.hashCode(this.clearTop);
    }
}
