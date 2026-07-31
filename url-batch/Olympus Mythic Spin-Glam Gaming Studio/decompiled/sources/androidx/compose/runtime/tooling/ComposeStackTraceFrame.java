package androidx.compose.runtime.tooling;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ComposeStackTrace.kt */
@StabilityInferred
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Landroidx/compose/runtime/tooling/ComposeStackTraceFrame;", "", "Landroidx/compose/runtime/tooling/SourceInformation;", "sourceInfo", "", "groupOffset", "<init>", "(Landroidx/compose/runtime/tooling/SourceInformation;Ljava/lang/Integer;)V", "copy", "(Landroidx/compose/runtime/tooling/SourceInformation;Ljava/lang/Integer;)Landroidx/compose/runtime/tooling/ComposeStackTraceFrame;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroidx/compose/runtime/tooling/SourceInformation;", "getSourceInfo", "()Landroidx/compose/runtime/tooling/SourceInformation;", "Ljava/lang/Integer;", "getGroupOffset", "()Ljava/lang/Integer;", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ComposeStackTraceFrame {
    private final Integer groupOffset;
    private final SourceInformation sourceInfo;

    public static /* synthetic */ ComposeStackTraceFrame copy$default(ComposeStackTraceFrame composeStackTraceFrame, SourceInformation sourceInformation, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            sourceInformation = composeStackTraceFrame.sourceInfo;
        }
        if ((i & 2) != 0) {
            num = composeStackTraceFrame.groupOffset;
        }
        return composeStackTraceFrame.copy(sourceInformation, num);
    }

    public final ComposeStackTraceFrame copy(SourceInformation sourceInfo, Integer groupOffset) {
        return new ComposeStackTraceFrame(sourceInfo, groupOffset);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ComposeStackTraceFrame)) {
            return false;
        }
        ComposeStackTraceFrame composeStackTraceFrame = (ComposeStackTraceFrame) other;
        return Intrinsics.areEqual(this.sourceInfo, composeStackTraceFrame.sourceInfo) && Intrinsics.areEqual(this.groupOffset, composeStackTraceFrame.groupOffset);
    }

    public int hashCode() {
        int hashCode = this.sourceInfo.hashCode() * 31;
        Integer num = this.groupOffset;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public String toString() {
        return "ComposeStackTraceFrame(sourceInfo=" + this.sourceInfo + ", groupOffset=" + this.groupOffset + ')';
    }

    public ComposeStackTraceFrame(SourceInformation sourceInformation, Integer num) {
        this.sourceInfo = sourceInformation;
        this.groupOffset = num;
    }

    public final SourceInformation getSourceInfo() {
        return this.sourceInfo;
    }

    public final Integer getGroupOffset() {
        return this.groupOffset;
    }
}
