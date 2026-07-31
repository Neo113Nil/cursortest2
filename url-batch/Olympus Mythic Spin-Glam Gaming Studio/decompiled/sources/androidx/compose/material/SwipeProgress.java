package androidx.compose.material;

import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Swipeable.kt */
@Immutable
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u001a\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\r\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0011\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Landroidx/compose/material/SwipeProgress;", "T", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "from", "Ljava/lang/Object;", "getFrom", "()Ljava/lang/Object;", "to", "getTo", "", "fraction", "F", "getFraction", "()F", "material_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
@ExperimentalMaterialApi
/* loaded from: classes10.dex */
public final class SwipeProgress<T> {
    private final float fraction;
    private final Object from;
    private final Object to;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SwipeProgress)) {
            return false;
        }
        SwipeProgress swipeProgress = (SwipeProgress) other;
        return Intrinsics.areEqual(this.from, swipeProgress.from) && Intrinsics.areEqual(this.to, swipeProgress.to) && this.fraction == swipeProgress.fraction;
    }

    public int hashCode() {
        Object obj = this.from;
        int hashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.to;
        return ((hashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31) + Float.hashCode(this.fraction);
    }

    public String toString() {
        return "SwipeProgress(from=" + this.from + ", to=" + this.to + ", fraction=" + this.fraction + ')';
    }
}
