package androidx.compose.runtime.changelist;

import androidx.compose.runtime.Anchor;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SlotWriter;
import androidx.compose.runtime.tooling.ComposeStackTraceBuilderKt;
import androidx.compose.runtime.tooling.ComposeStackTraceFrame;
import androidx.compose.runtime.tooling.ComposeStackTraceKt;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;

/* compiled from: Operation.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u001a/\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\t\u001a\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a/\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a/\u0010\u0014\u001a\u00020\u0010*\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0013\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001b\u0010\u0016\u001a\u00020\u0011*\u00020\u00112\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0016\u0010\u0017*\f\b\u0000\u0010\u0018\"\u00020\u00052\u00020\u0005¨\u0006\u0019"}, d2 = {"Landroidx/compose/runtime/SlotWriter;", "slots", "Landroidx/compose/runtime/Applier;", "", "applier", "", "index", "", "positionToParentOf", "(Landroidx/compose/runtime/SlotWriter;Landroidx/compose/runtime/Applier;I)V", "currentNodeIndex", "(Landroidx/compose/runtime/SlotWriter;)I", "Landroidx/compose/runtime/Anchor;", "anchor", "positionToInsert", "(Landroidx/compose/runtime/SlotWriter;Landroidx/compose/runtime/Anchor;Landroidx/compose/runtime/Applier;)I", "", "Landroidx/compose/runtime/changelist/OperationErrorContext;", "errorContext", "writer", "attachComposeStackTrace", "(Ljava/lang/Throwable;Landroidx/compose/runtime/changelist/OperationErrorContext;Landroidx/compose/runtime/SlotWriter;Landroidx/compose/runtime/Anchor;)Ljava/lang/Throwable;", "withCurrentStackTrace", "(Landroidx/compose/runtime/changelist/OperationErrorContext;Landroidx/compose/runtime/SlotWriter;)Landroidx/compose/runtime/changelist/OperationErrorContext;", "IntParameter", "runtime"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OperationKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void positionToParentOf(SlotWriter slotWriter, Applier applier, int i) {
        while (!slotWriter.indexInParent(i)) {
            slotWriter.skipToGroupEnd();
            if (slotWriter.isNode(slotWriter.getParent())) {
                applier.up();
            }
            slotWriter.endGroup();
        }
    }

    private static final int currentNodeIndex(SlotWriter slotWriter) {
        int currentGroup = slotWriter.getCurrentGroup();
        int parent = slotWriter.getParent();
        while (parent >= 0 && !slotWriter.isNode(parent)) {
            parent = slotWriter.parent(parent);
        }
        int i = parent + 1;
        int i2 = 0;
        while (i < currentGroup) {
            if (slotWriter.indexInGroup(currentGroup, i)) {
                if (slotWriter.isNode(i)) {
                    i2 = 0;
                }
                i++;
            } else {
                i2 += slotWriter.isNode(i) ? 1 : slotWriter.nodeCount(i);
                i += slotWriter.groupSize(i);
            }
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int positionToInsert(SlotWriter slotWriter, Anchor anchor, Applier applier) {
        int anchorIndex = slotWriter.anchorIndex(anchor);
        if (!(slotWriter.getCurrentGroup() < anchorIndex)) {
            ComposerKt.composeImmediateRuntimeError("Check failed");
        }
        positionToParentOf(slotWriter, applier, anchorIndex);
        int currentNodeIndex = currentNodeIndex(slotWriter);
        while (slotWriter.getCurrentGroup() < anchorIndex) {
            if (slotWriter.indexInCurrentGroup(anchorIndex)) {
                if (slotWriter.isNode()) {
                    applier.down(slotWriter.node(slotWriter.getCurrentGroup()));
                    currentNodeIndex = 0;
                }
                slotWriter.startGroup();
            } else {
                currentNodeIndex += slotWriter.skipGroup();
            }
        }
        if (!(slotWriter.getCurrentGroup() == anchorIndex)) {
            ComposerKt.composeImmediateRuntimeError("Check failed");
        }
        return currentNodeIndex;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Throwable attachComposeStackTrace(Throwable th, final OperationErrorContext operationErrorContext, final SlotWriter slotWriter, final Anchor anchor) {
        return operationErrorContext == null ? th : ComposeStackTraceKt.attachComposeStackTrace(th, new Function0() { // from class: androidx.compose.runtime.changelist.OperationKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                List attachComposeStackTrace$lambda$1;
                attachComposeStackTrace$lambda$1 = OperationKt.attachComposeStackTrace$lambda$1(Anchor.this, slotWriter, operationErrorContext);
                return attachComposeStackTrace$lambda$1;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List attachComposeStackTrace$lambda$1(Anchor anchor, SlotWriter slotWriter, OperationErrorContext operationErrorContext) {
        if (anchor != null) {
            slotWriter.seek(anchor);
        }
        List buildTrace$default = ComposeStackTraceBuilderKt.buildTrace$default(slotWriter, null, 0, null, 7, null);
        ComposeStackTraceFrame composeStackTraceFrame = (ComposeStackTraceFrame) CollectionsKt.lastOrNull(buildTrace$default);
        Integer groupOffset = composeStackTraceFrame != null ? composeStackTraceFrame.getGroupOffset() : null;
        List buildStackTrace = operationErrorContext.buildStackTrace(groupOffset);
        if (groupOffset != null && !buildStackTrace.isEmpty()) {
            buildStackTrace = CollectionsKt.plus((Collection) CollectionsKt.listOf(ComposeStackTraceFrame.copy$default((ComposeStackTraceFrame) CollectionsKt.first(buildStackTrace), null, groupOffset, 1, null)), (Iterable) CollectionsKt.drop(buildStackTrace, 1));
        }
        return CollectionsKt.plus((Collection) buildTrace$default, (Iterable) buildStackTrace);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OperationErrorContext withCurrentStackTrace(final OperationErrorContext operationErrorContext, final SlotWriter slotWriter) {
        return new OperationErrorContext() { // from class: androidx.compose.runtime.changelist.OperationKt$withCurrentStackTrace$1
            @Override // androidx.compose.runtime.changelist.OperationErrorContext
            public List buildStackTrace(Integer currentOffset) {
                List buildStackTrace = OperationErrorContext.this.buildStackTrace(null);
                int parent = slotWriter.getParent();
                if (parent < 0) {
                    return buildStackTrace;
                }
                SlotWriter slotWriter2 = slotWriter;
                return CollectionsKt.plus((Collection) ComposeStackTraceBuilderKt.buildTrace(slotWriter2, currentOffset, parent, Integer.valueOf(slotWriter2.parent(parent))), (Iterable) buildStackTrace);
            }
        };
    }
}
