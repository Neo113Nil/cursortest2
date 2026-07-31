package androidx.compose.runtime.tooling;

import androidx.compose.runtime.Anchor;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.SlotReader;
import androidx.compose.runtime.SlotTable;
import androidx.compose.runtime.SlotWriter;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$IntRef;

/* compiled from: ComposeStackTraceBuilder.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a;\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0019\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006*\u00020\nH\u0000¢\u0006\u0004\b\b\u0010\u000b\u001a+\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006*\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\b\f\u0010\r\u001a+\u0010\u0013\u001a\u0004\u0018\u00010\u0012*\u00020\u000e2\u0014\u0010\u0011\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u00100\u000fH\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001d\u0010\u0017\u001a\u0004\u0018\u00010\u0003*\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0015H\u0000¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Landroidx/compose/runtime/SlotWriter;", "", "child", "", "group", "parent", "", "Landroidx/compose/runtime/tooling/ComposeStackTraceFrame;", "buildTrace", "(Landroidx/compose/runtime/SlotWriter;Ljava/lang/Object;ILjava/lang/Integer;)Ljava/util/List;", "Landroidx/compose/runtime/SlotReader;", "(Landroidx/compose/runtime/SlotReader;)Ljava/util/List;", "traceForGroup", "(Landroidx/compose/runtime/SlotReader;ILjava/lang/Object;)Ljava/util/List;", "Landroidx/compose/runtime/SlotTable;", "Lkotlin/Function1;", "", "filter", "Landroidx/compose/runtime/tooling/ObjectLocation;", "findLocation", "(Landroidx/compose/runtime/SlotTable;Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/tooling/ObjectLocation;", "Landroidx/compose/runtime/CompositionContext;", "context", "findSubcompositionContextGroup", "(Landroidx/compose/runtime/SlotTable;Landroidx/compose/runtime/CompositionContext;)Ljava/lang/Integer;", "runtime"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ComposeStackTraceBuilderKt {
    public static final ObjectLocation findLocation(SlotTable slotTable, Function1 function1) {
        SlotReader openReader = slotTable.openReader();
        try {
            Ref$IntRef ref$IntRef = new Ref$IntRef();
            while (ref$IntRef.element < slotTable.getGroupsSize()) {
                if (openReader.isNode(ref$IntRef.element) && ((Boolean) function1.invoke(openReader.node(ref$IntRef.element))).booleanValue()) {
                    return new ObjectLocation(ref$IntRef.element, null);
                }
                int slotSize = openReader.slotSize(ref$IntRef.element);
                for (int i = 0; i < slotSize; i++) {
                    if (((Boolean) function1.invoke(openReader.groupGet(ref$IntRef.element, i))).booleanValue()) {
                        return new ObjectLocation(ref$IntRef.element, Integer.valueOf(i));
                    }
                }
                ref$IntRef.element++;
            }
            Unit unit = Unit.INSTANCE;
            return null;
        } finally {
            openReader.close();
        }
    }

    public static final Integer findSubcompositionContextGroup(SlotTable slotTable, CompositionContext compositionContext) {
        SlotReader openReader = slotTable.openReader();
        try {
            return findSubcompositionContextGroup$lambda$3$scanGroup(openReader, compositionContext, 0, openReader.getGroupsSize());
        } finally {
            openReader.close();
        }
    }

    public static /* synthetic */ List buildTrace$default(SlotWriter slotWriter, Object obj, int i, Integer num, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            obj = null;
        }
        if ((i2 & 2) != 0) {
            i = slotWriter.getCurrentGroup();
        }
        if ((i2 & 4) != 0) {
            num = null;
        }
        return buildTrace(slotWriter, obj, i, num);
    }

    public static final List buildTrace(SlotWriter slotWriter, Object obj, int i, Integer num) {
        int parent;
        if (!slotWriter.getClosed() && slotWriter.getSize$runtime() != 0) {
            WriterTraceBuilder writerTraceBuilder = new WriterTraceBuilder(slotWriter);
            if (num != null) {
                parent = num.intValue();
            } else {
                parent = slotWriter.getParent() < 0 ? slotWriter.parent(i) : slotWriter.getParent();
            }
            if (obj == null) {
                obj = Integer.valueOf(slotWriter.groupSlotIndex(i));
            }
            while (i >= 0) {
                writerTraceBuilder.processEdge(slotWriter.sourceInformationOf$runtime(i), obj);
                obj = slotWriter.anchor(i);
                if (parent >= 0) {
                    int i2 = parent;
                    parent = slotWriter.parent(parent);
                    i = i2;
                } else {
                    i = parent;
                }
            }
            return writerTraceBuilder.get_trace();
        }
        return CollectionsKt.emptyList();
    }

    public static final List buildTrace(SlotReader slotReader) {
        if (!slotReader.getClosed() && slotReader.getGroupsSize() != 0) {
            ReaderTraceBuilder readerTraceBuilder = new ReaderTraceBuilder(slotReader);
            int parent = slotReader.getParent();
            Object valueOf = Integer.valueOf(slotReader.getSlot());
            while (parent >= 0) {
                readerTraceBuilder.processEdge(slotReader.getTable().sourceInformationOf(parent), valueOf);
                valueOf = slotReader.anchor(parent);
                parent = slotReader.parent(parent);
            }
            return readerTraceBuilder.get_trace();
        }
        return CollectionsKt.emptyList();
    }

    public static final List traceForGroup(SlotReader slotReader, int i, Object obj) {
        ReaderTraceBuilder readerTraceBuilder = new ReaderTraceBuilder(slotReader);
        int parent = slotReader.parent(i);
        Anchor anchor = slotReader.anchor(i);
        while (i >= 0) {
            readerTraceBuilder.processEdge(slotReader.getTable().sourceInformationOf(i), obj);
            if (parent >= 0) {
                Anchor anchor2 = anchor;
                anchor = slotReader.anchor(parent);
                i = parent;
                parent = slotReader.parent(parent);
                obj = anchor2;
            } else {
                i = parent;
                obj = anchor;
            }
        }
        return readerTraceBuilder.get_trace();
    }

    private static final Integer findSubcompositionContextGroup$lambda$3$scanGroup(SlotReader slotReader, CompositionContext compositionContext, int i, int i2) {
        Integer findSubcompositionContextGroup$lambda$3$scanGroup;
        while (true) {
            if (i >= i2) {
                return null;
            }
            int groupSize = slotReader.groupSize(i) + i;
            if (slotReader.hasMark(i) && slotReader.groupKey(i) == 206 && Intrinsics.areEqual(slotReader.groupObjectKey(i), ComposerKt.getReference())) {
                Object groupGet = slotReader.groupGet(i, 0);
                ComposerImpl.CompositionContextHolder compositionContextHolder = groupGet instanceof ComposerImpl.CompositionContextHolder ? (ComposerImpl.CompositionContextHolder) groupGet : null;
                if (compositionContextHolder != null && Intrinsics.areEqual(compositionContextHolder.getRef(), compositionContext)) {
                    return Integer.valueOf(i);
                }
            }
            if (slotReader.containsMark(i) && (findSubcompositionContextGroup$lambda$3$scanGroup = findSubcompositionContextGroup$lambda$3$scanGroup(slotReader, compositionContext, i + 1, groupSize)) != null) {
                return Integer.valueOf(findSubcompositionContextGroup$lambda$3$scanGroup.intValue());
            }
            i = groupSize;
        }
    }
}
