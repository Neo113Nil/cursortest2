package kotlinx.coroutines.flow;

import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* loaded from: classes5.dex */
final class StartedWhileSubscribed implements r {
    private final long replayExpiration;
    private final long stopTimeout;

    public StartedWhileSubscribed(long j8, long j9) {
        this.stopTimeout = j8;
        this.replayExpiration = j9;
        if (j8 < 0) {
            throw new IllegalArgumentException(("stopTimeout(" + j8 + " ms) cannot be negative").toString());
        }
        if (j9 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("replayExpiration(" + j9 + " ms) cannot be negative").toString());
    }

    @Override // kotlinx.coroutines.flow.r
    public e command(t tVar) {
        return g.distinctUntilChanged(g.dropWhile(g.transformLatest(tVar, new StartedWhileSubscribed$command$1(this, null)), new StartedWhileSubscribed$command$2(null)));
    }

    public boolean equals(Object obj) {
        if (obj instanceof StartedWhileSubscribed) {
            StartedWhileSubscribed startedWhileSubscribed = (StartedWhileSubscribed) obj;
            if (this.stopTimeout == startedWhileSubscribed.stopTimeout && this.replayExpiration == startedWhileSubscribed.replayExpiration) {
                return true;
            }
        }
        return false;
    }

    @IgnoreJRERequirement
    public int hashCode() {
        return (androidx.collection.a.a(this.stopTimeout) * 31) + androidx.collection.a.a(this.replayExpiration);
    }

    public String toString() {
        String joinToString$default;
        List createListBuilder = kotlin.collections.q.createListBuilder(2);
        if (this.stopTimeout > 0) {
            createListBuilder.add("stopTimeout=" + this.stopTimeout + "ms");
        }
        if (this.replayExpiration < Long.MAX_VALUE) {
            createListBuilder.add("replayExpiration=" + this.replayExpiration + "ms");
        }
        List build = kotlin.collections.q.build(createListBuilder);
        StringBuilder sb = new StringBuilder();
        sb.append("SharingStarted.WhileSubscribed(");
        joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(build, null, null, null, 0, null, null, 63, null);
        sb.append(joinToString$default);
        sb.append(')');
        return sb.toString();
    }
}
