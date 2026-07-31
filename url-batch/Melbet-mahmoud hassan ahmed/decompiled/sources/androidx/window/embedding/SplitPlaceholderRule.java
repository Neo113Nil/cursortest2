package androidx.window.embedding;

import android.content.Intent;
import androidx.window.core.ExperimentalWindowApi;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.i;
import w5.q;

@ExperimentalWindowApi
/* loaded from: classes.dex */
public final class SplitPlaceholderRule extends SplitRule {
    private final Set<ActivityFilter> filters;
    private final Intent placeholderIntent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SplitPlaceholderRule(Set<ActivityFilter> set, Intent intent, int i7, int i8, float f7, int i9) {
        super(i7, i8, f7, i9);
        Set<ActivityFilter> t6;
        i.d(set, "filters");
        i.d(intent, "placeholderIntent");
        this.placeholderIntent = intent;
        t6 = q.t(set);
        this.filters = t6;
    }

    public /* synthetic */ SplitPlaceholderRule(Set set, Intent intent, int i7, int i8, float f7, int i9, int i10, kotlin.jvm.internal.e eVar) {
        this(set, intent, (i10 & 4) != 0 ? 0 : i7, (i10 & 8) != 0 ? 0 : i8, (i10 & 16) != 0 ? 0.5f : f7, (i10 & 32) != 0 ? 3 : i9);
    }

    @Override // androidx.window.embedding.SplitRule
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SplitPlaceholderRule) || !super.equals(obj) || !super.equals(obj)) {
            return false;
        }
        SplitPlaceholderRule splitPlaceholderRule = (SplitPlaceholderRule) obj;
        return i.a(this.filters, splitPlaceholderRule.filters) && i.a(this.placeholderIntent, splitPlaceholderRule.placeholderIntent);
    }

    public final Set<ActivityFilter> getFilters() {
        return this.filters;
    }

    public final Intent getPlaceholderIntent() {
        return this.placeholderIntent;
    }

    @Override // androidx.window.embedding.SplitRule
    public int hashCode() {
        return (((super.hashCode() * 31) + this.filters.hashCode()) * 31) + this.placeholderIntent.hashCode();
    }

    public final SplitPlaceholderRule plus$window_release(ActivityFilter activityFilter) {
        Set t6;
        i.d(activityFilter, "filter");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(this.filters);
        linkedHashSet.add(activityFilter);
        t6 = q.t(linkedHashSet);
        return new SplitPlaceholderRule(t6, this.placeholderIntent, getMinWidth(), getMinSmallestWidth(), getSplitRatio(), getLayoutDirection());
    }
}
