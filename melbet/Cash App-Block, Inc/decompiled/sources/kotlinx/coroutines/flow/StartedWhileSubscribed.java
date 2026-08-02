package kotlinx.coroutines.flow;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.compose.runtime.Recomposer$join$2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.builders.ListBuilder;
import kotlinx.coroutines.flow.internal.SubscriptionCountStateFlow;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes3.dex */
public final class StartedWhileSubscribed implements SharingStarted {
    public final long replayExpiration;
    public final long stopTimeout;

    public StartedWhileSubscribed(long j, long j2) {
        this.stopTimeout = j;
        this.replayExpiration = j2;
        if (j < 0) {
            Path$$ExternalSyntheticBUOutline0.m$1((Object) Boxes$$ExternalSyntheticOutline1.m(j, "stopTimeout(", " ms) cannot be negative"));
            throw null;
        }
        if (j2 >= 0) {
            return;
        }
        Path$$ExternalSyntheticBUOutline0.m$1((Object) Boxes$$ExternalSyntheticOutline1.m(j2, "replayExpiration(", " ms) cannot be negative"));
        throw null;
    }

    @Override // kotlinx.coroutines.flow.SharingStarted
    public final Flow command(SubscriptionCountStateFlow subscriptionCountStateFlow) {
        int i = 2;
        return FlowKt.distinctUntilChanged(new FlowKt__MergeKt$flatMapConcat$$inlined$map$1(FlowKt.transformLatest(subscriptionCountStateFlow, new StartedWhileSubscribed$command$1(this, null)), new Recomposer$join$2(i, null, 14), i));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof StartedWhileSubscribed)) {
            return false;
        }
        StartedWhileSubscribed startedWhileSubscribed = (StartedWhileSubscribed) obj;
        return this.stopTimeout == startedWhileSubscribed.stopTimeout && this.replayExpiration == startedWhileSubscribed.replayExpiration;
    }

    public final int hashCode() {
        return Long.hashCode(this.replayExpiration) + (Long.hashCode(this.stopTimeout) * 31);
    }

    public final String toString() {
        ListBuilder listBuilder = new ListBuilder(2);
        long j = this.stopTimeout;
        if (j > 0) {
            listBuilder.add("stopTimeout=" + j + "ms");
        }
        long j2 = this.replayExpiration;
        if (j2 < Long.MAX_VALUE) {
            listBuilder.add("replayExpiration=" + j2 + "ms");
        }
        return CameraState$Type$EnumUnboxingLocalUtility.m(new StringBuilder("SharingStarted.WhileSubscribed("), CollectionsKt.joinToString$default(CollectionsKt__CollectionsJVMKt.build(listBuilder), null, null, null, 0, null, null, 63), ')');
    }
}
