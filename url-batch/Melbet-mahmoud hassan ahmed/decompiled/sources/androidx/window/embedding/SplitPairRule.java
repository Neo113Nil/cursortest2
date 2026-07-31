package androidx.window.embedding;

import androidx.window.core.ExperimentalWindowApi;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.i;
import w5.q;

@ExperimentalWindowApi
/* loaded from: classes.dex */
public final class SplitPairRule extends SplitRule {
    private final boolean clearTop;
    private final Set<SplitPairFilter> filters;
    private final boolean finishPrimaryWithSecondary;
    private final boolean finishSecondaryWithPrimary;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SplitPairRule(Set<SplitPairFilter> set, boolean z6, boolean z7, boolean z8, int i7, int i8, float f7, int i9) {
        super(i7, i8, f7, i9);
        Set<SplitPairFilter> t6;
        i.d(set, "filters");
        this.finishPrimaryWithSecondary = z6;
        this.finishSecondaryWithPrimary = z7;
        this.clearTop = z8;
        t6 = q.t(set);
        this.filters = t6;
    }

    public /* synthetic */ SplitPairRule(Set set, boolean z6, boolean z7, boolean z8, int i7, int i8, float f7, int i9, int i10, kotlin.jvm.internal.e eVar) {
        this(set, (i10 & 2) != 0 ? false : z6, (i10 & 4) != 0 ? true : z7, (i10 & 8) != 0 ? false : z8, (i10 & 16) != 0 ? 0 : i7, (i10 & 32) == 0 ? i8 : 0, (i10 & 64) != 0 ? 0.5f : f7, (i10 & 128) != 0 ? 3 : i9);
    }

    @Override // androidx.window.embedding.SplitRule
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SplitPairRule) || !super.equals(obj)) {
            return false;
        }
        SplitPairRule splitPairRule = (SplitPairRule) obj;
        return i.a(this.filters, splitPairRule.filters) && this.finishPrimaryWithSecondary == splitPairRule.finishPrimaryWithSecondary && this.finishSecondaryWithPrimary == splitPairRule.finishSecondaryWithPrimary && this.clearTop == splitPairRule.clearTop;
    }

    public final boolean getClearTop() {
        return this.clearTop;
    }

    public final Set<SplitPairFilter> getFilters() {
        return this.filters;
    }

    public final boolean getFinishPrimaryWithSecondary() {
        return this.finishPrimaryWithSecondary;
    }

    public final boolean getFinishSecondaryWithPrimary() {
        return this.finishSecondaryWithPrimary;
    }

    @Override // androidx.window.embedding.SplitRule
    public int hashCode() {
        return (((((((super.hashCode() * 31) + this.filters.hashCode()) * 31) + a.a(this.finishPrimaryWithSecondary)) * 31) + a.a(this.finishSecondaryWithPrimary)) * 31) + a.a(this.clearTop);
    }

    public final SplitPairRule plus$window_release(SplitPairFilter splitPairFilter) {
        Set t6;
        i.d(splitPairFilter, "filter");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(this.filters);
        linkedHashSet.add(splitPairFilter);
        t6 = q.t(linkedHashSet);
        return new SplitPairRule(t6, this.finishPrimaryWithSecondary, this.finishSecondaryWithPrimary, this.clearTop, getMinWidth(), getMinSmallestWidth(), getSplitRatio(), getLayoutDirection());
    }
}
