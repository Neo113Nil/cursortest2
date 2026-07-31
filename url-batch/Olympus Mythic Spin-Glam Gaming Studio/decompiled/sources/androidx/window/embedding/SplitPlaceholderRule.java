package androidx.window.embedding;

import android.content.Intent;
import androidx.window.core.ExperimentalWindowApi;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SplitPlaceholderRule.kt */
@ExperimentalWindowApi
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Landroidx/window/embedding/SplitPlaceholderRule;", "Landroidx/window/embedding/SplitRule;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/content/Intent;", "placeholderIntent", "Landroid/content/Intent;", "getPlaceholderIntent", "()Landroid/content/Intent;", "", "Landroidx/window/embedding/ActivityFilter;", "filters", "Ljava/util/Set;", "getFilters", "()Ljava/util/Set;", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SplitPlaceholderRule extends SplitRule {
    private final Set filters;
    private final Intent placeholderIntent;

    @Override // androidx.window.embedding.SplitRule
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SplitPlaceholderRule) || !super.equals(other) || !super.equals(other)) {
            return false;
        }
        SplitPlaceholderRule splitPlaceholderRule = (SplitPlaceholderRule) other;
        return Intrinsics.areEqual(this.filters, splitPlaceholderRule.filters) && Intrinsics.areEqual(this.placeholderIntent, splitPlaceholderRule.placeholderIntent);
    }

    @Override // androidx.window.embedding.SplitRule
    public int hashCode() {
        return (((super.hashCode() * 31) + this.filters.hashCode()) * 31) + this.placeholderIntent.hashCode();
    }
}
