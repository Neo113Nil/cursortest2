package androidx.window.embedding;

import android.content.ComponentName;
import androidx.window.core.ExperimentalWindowApi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SplitPairFilter.kt */
@ExperimentalWindowApi
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001J\u001a\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u000b¨\u0006\u0016"}, d2 = {"Landroidx/window/embedding/SplitPairFilter;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroid/content/ComponentName;", "primaryActivityName", "Landroid/content/ComponentName;", "getPrimaryActivityName", "()Landroid/content/ComponentName;", "secondaryActivityName", "getSecondaryActivityName", "secondaryActivityIntentAction", "Ljava/lang/String;", "getSecondaryActivityIntentAction", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SplitPairFilter {
    private final ComponentName primaryActivityName;

    /* renamed from: secondaryActivityIntentAction, reason: from kotlin metadata and from toString */
    private final String secondaryActivityAction;
    private final ComponentName secondaryActivityName;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SplitPairFilter)) {
            return false;
        }
        SplitPairFilter splitPairFilter = (SplitPairFilter) other;
        return Intrinsics.areEqual(this.primaryActivityName, splitPairFilter.primaryActivityName) && Intrinsics.areEqual(this.secondaryActivityName, splitPairFilter.secondaryActivityName) && Intrinsics.areEqual(this.secondaryActivityAction, splitPairFilter.secondaryActivityAction);
    }

    public int hashCode() {
        int hashCode = ((this.primaryActivityName.hashCode() * 31) + this.secondaryActivityName.hashCode()) * 31;
        String str = this.secondaryActivityAction;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "SplitPairFilter{primaryActivityName=" + this.primaryActivityName + ", secondaryActivityName=" + this.secondaryActivityName + ", secondaryActivityAction=" + ((Object) this.secondaryActivityAction) + '}';
    }
}
