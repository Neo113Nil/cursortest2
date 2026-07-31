package androidx.compose.runtime.reflect;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

/* compiled from: ComposableMethod.jvm.kt */
@StabilityInferred
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eR\u0017\u0010\u000f\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0007R\u0017\u0010\u0012\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0010\u001a\u0004\b\u0013\u0010\u0007R\u0017\u0010\u0014\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0015\u0010\u0007¨\u0006\u0016"}, d2 = {"Landroidx/compose/runtime/reflect/ComposableInfo;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "isComposable", "Z", "()Z", "realParamsCount", "I", "getRealParamsCount", "changedParams", "getChangedParams", "defaultParams", "getDefaultParams", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class ComposableInfo {
    private final int changedParams;
    private final int defaultParams;
    private final boolean isComposable;
    private final int realParamsCount;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ComposableInfo)) {
            return false;
        }
        ComposableInfo composableInfo = (ComposableInfo) other;
        return this.isComposable == composableInfo.isComposable && this.realParamsCount == composableInfo.realParamsCount && this.changedParams == composableInfo.changedParams && this.defaultParams == composableInfo.defaultParams;
    }

    public int hashCode() {
        return (((((Boolean.hashCode(this.isComposable) * 31) + Integer.hashCode(this.realParamsCount)) * 31) + Integer.hashCode(this.changedParams)) * 31) + Integer.hashCode(this.defaultParams);
    }

    public String toString() {
        return "ComposableInfo(isComposable=" + this.isComposable + ", realParamsCount=" + this.realParamsCount + ", changedParams=" + this.changedParams + ", defaultParams=" + this.defaultParams + ')';
    }
}
