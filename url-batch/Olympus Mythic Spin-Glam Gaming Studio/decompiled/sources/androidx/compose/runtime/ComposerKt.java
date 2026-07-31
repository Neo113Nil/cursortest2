package androidx.compose.runtime;

import androidx.collection.MutableScatterMap;
import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterSetKt;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.collection.MultiValueMap;
import com.ironsource.C4834q2;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: Composer.kt */
@Metadata(d1 = {"\u0000¦\u0001\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002\u001a/\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u000f\u0010\f\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\r\u001a\u001b\u0010\u0011\u001a\u00020\t*\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u001b\u0010\u0013\u001a\u00020\t*\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0013\u0010\u0012\u001a%\u0010\u0017\u001a\u00020\t*\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001a7\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001c\"\b\b\u0000\u0010\u0019*\u00020\u0015\"\b\b\u0001\u0010\u001a*\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u001d\u0010\u001e\u001a!\u0010\"\u001a\u00020\u0003*\b\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010!\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\"\u0010#\u001a!\u0010$\u001a\u00020\u0003*\b\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010!\u001a\u00020\u0003H\u0002¢\u0006\u0004\b$\u0010#\u001a3\u0010)\u001a\u00020\t*\b\u0012\u0004\u0012\u00020 0%2\u0006\u0010!\u001a\u00020\u00032\u0006\u0010'\u001a\u00020&2\b\u0010(\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b)\u0010*\u001a+\u0010-\u001a\u0004\u0018\u00010 *\b\u0012\u0004\u0012\u00020 0%2\u0006\u0010+\u001a\u00020\u00032\u0006\u0010,\u001a\u00020\u0003H\u0002¢\u0006\u0004\b-\u0010.\u001a#\u0010/\u001a\u0004\u0018\u00010 *\b\u0012\u0004\u0012\u00020 0%2\u0006\u0010!\u001a\u00020\u0003H\u0002¢\u0006\u0004\b/\u00100\u001a)\u00101\u001a\u00020\t*\b\u0012\u0004\u0012\u00020 0%2\u0006\u0010+\u001a\u00020\u00032\u0006\u0010,\u001a\u00020\u0003H\u0002¢\u0006\u0004\b1\u00102\u001a\u0013\u00103\u001a\u00020\u0003*\u00020\u0000H\u0002¢\u0006\u0004\b3\u00104\u001a\u0013\u00105\u001a\u00020\u0000*\u00020\u0003H\u0002¢\u0006\u0004\b5\u00106\u001a#\u0010:\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u001f*\u0002072\u0006\u00109\u001a\u000208H\u0002¢\u0006\u0004\b:\u0010;\u001a#\u0010>\u001a\u00020\u0003*\u00020<2\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010=\u001a\u00020\u0003H\u0002¢\u0006\u0004\b>\u0010?\u001a+\u0010C\u001a\u00020\u0003*\u00020<2\u0006\u0010@\u001a\u00020\u00032\u0006\u0010A\u001a\u00020\u00032\u0006\u0010B\u001a\u00020\u0003H\u0002¢\u0006\u0004\bC\u0010D\u001a\u0017\u0010G\u001a\u00020F2\u0006\u0010E\u001a\u00020\u0007H\u0000¢\u0006\u0004\bG\u0010H\u001a\u0017\u0010I\u001a\u00020\t2\u0006\u0010E\u001a\u00020\u0007H\u0000¢\u0006\u0004\bI\u0010J\u001a5\u0010S\u001a\u00020R2\u0006\u0010L\u001a\u00020K2\u0006\u0010N\u001a\u00020M2\u0006\u0010O\u001a\u00020\u000e2\f\u0010Q\u001a\b\u0012\u0002\b\u0003\u0018\u00010PH\u0000¢\u0006\u0004\bS\u0010T\"\u001e\u0010V\u001a\u0004\u0018\u00010U8\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\bV\u0010W\u0012\u0004\bX\u0010\r\"\"\u0010Y\u001a\u00020\u00008\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\u0002\"\u0004\b\\\u0010]\" \u0010^\u001a\u00020\u00158\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b^\u0010_\u0012\u0004\bb\u0010\r\u001a\u0004\b`\u0010a\" \u0010c\u001a\u00020\u00158\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bc\u0010_\u0012\u0004\be\u0010\r\u001a\u0004\bd\u0010a\" \u0010f\u001a\u00020\u00158\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bf\u0010_\u0012\u0004\bh\u0010\r\u001a\u0004\bg\u0010a\" \u0010i\u001a\u00020\u00158\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bi\u0010_\u0012\u0004\bk\u0010\r\u001a\u0004\bj\u0010a\" \u0010l\u001a\u00020\u00158\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bl\u0010_\u0012\u0004\bn\u0010\r\u001a\u0004\bm\u0010a\" \u0010N\u001a\u00020\u00158\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bN\u0010_\u0012\u0004\bp\u0010\r\u001a\u0004\bo\u0010a\"$\u0010s\u001a\u0012\u0012\u0004\u0012\u00020 0qj\b\u0012\u0004\u0012\u00020 `r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bs\u0010t\"\u0018\u0010w\u001a\u00020\u0003*\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bu\u0010v\"\u0018\u0010x\u001a\u00020\u0000*\u00020\u000e8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bx\u0010y\"\u0018\u0010x\u001a\u00020\u0000*\u00020<8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bx\u0010z\"\u0018\u0010~\u001a\u00020\u0015*\u00020{8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b|\u0010}¨\u0006\u007f"}, d2 = {"", "isTraceInProgress", "()Z", "", "key", "dirty1", "dirty2", "", "info", "", "traceEventStart", "(IIILjava/lang/String;)V", "traceEventEnd", "()V", "Landroidx/compose/runtime/SlotWriter;", "Landroidx/compose/runtime/RememberManager;", "rememberManager", "removeCurrentGroup", "(Landroidx/compose/runtime/SlotWriter;Landroidx/compose/runtime/RememberManager;)V", "deactivateCurrentGroup", "index", "", "data", "removeData", "(Landroidx/compose/runtime/SlotWriter;ILjava/lang/Object;)V", "K", "V", "initialCapacity", "Landroidx/compose/runtime/collection/MultiValueMap;", "multiMap", "(I)Landroidx/collection/MutableScatterMap;", "", "Landroidx/compose/runtime/Invalidation;", "location", "findLocation", "(Ljava/util/List;I)I", "findInsertLocation", "", "Landroidx/compose/runtime/RecomposeScopeImpl;", "scope", C4834q2.p, "insertIfMissing", "(Ljava/util/List;ILandroidx/compose/runtime/RecomposeScopeImpl;Ljava/lang/Object;)V", "start", "end", "firstInRange", "(Ljava/util/List;II)Landroidx/compose/runtime/Invalidation;", "removeLocation", "(Ljava/util/List;I)Landroidx/compose/runtime/Invalidation;", "removeRange", "(Ljava/util/List;II)V", "asInt", "(Z)I", "asBool", "(I)Z", "Landroidx/compose/runtime/SlotTable;", "Landroidx/compose/runtime/Anchor;", "anchor", "collectNodesFrom", "(Landroidx/compose/runtime/SlotTable;Landroidx/compose/runtime/Anchor;)Ljava/util/List;", "Landroidx/compose/runtime/SlotReader;", "root", "distanceFrom", "(Landroidx/compose/runtime/SlotReader;II)I", "a", "b", "common", "nearestCommonRootOf", "(Landroidx/compose/runtime/SlotReader;III)I", "message", "", "composeRuntimeError", "(Ljava/lang/String;)Ljava/lang/Void;", "composeImmediateRuntimeError", "(Ljava/lang/String;)V", "Landroidx/compose/runtime/ControlledComposition;", "composition", "Landroidx/compose/runtime/MovableContentStateReference;", "reference", "slots", "Landroidx/compose/runtime/Applier;", "applier", "Landroidx/compose/runtime/MovableContentState;", "extractMovableContentAtCurrent", "(Landroidx/compose/runtime/ControlledComposition;Landroidx/compose/runtime/MovableContentStateReference;Landroidx/compose/runtime/SlotWriter;Landroidx/compose/runtime/Applier;)Landroidx/compose/runtime/MovableContentState;", "Landroidx/compose/runtime/CompositionTracer;", "compositionTracer", "Landroidx/compose/runtime/CompositionTracer;", "getCompositionTracer$annotations", "composeStackTraceEnabled", "Z", "getComposeStackTraceEnabled", "setComposeStackTraceEnabled", "(Z)V", "invocation", "Ljava/lang/Object;", "getInvocation", "()Ljava/lang/Object;", "getInvocation$annotations", IronSourceConstants.EVENTS_PROVIDER, "getProvider", "getProvider$annotations", "compositionLocalMap", "getCompositionLocalMap", "getCompositionLocalMap$annotations", "providerValues", "getProviderValues", "getProviderValues$annotations", "providerMaps", "getProviderMaps", "getProviderMaps$annotations", "getReference", "getReference$annotations", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "InvalidationLocationAscending", "Ljava/util/Comparator;", "getNextGroup", "(Landroidx/compose/runtime/SlotWriter;)I", "nextGroup", "isAfterFirstChild", "(Landroidx/compose/runtime/SlotWriter;)Z", "(Landroidx/compose/runtime/SlotReader;)Z", "Landroidx/compose/runtime/KeyInfo;", "getJoinedKey", "(Landroidx/compose/runtime/KeyInfo;)Ljava/lang/Object;", "joinedKey", "runtime"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ComposerKt {
    private static boolean composeStackTraceEnabled;
    private static CompositionTracer compositionTracer;
    private static final Object invocation = new OpaqueKey(IronSourceConstants.EVENTS_PROVIDER);
    private static final Object provider = new OpaqueKey(IronSourceConstants.EVENTS_PROVIDER);
    private static final Object compositionLocalMap = new OpaqueKey("compositionLocalMap");
    private static final Object providerValues = new OpaqueKey("providerValues");
    private static final Object providerMaps = new OpaqueKey("providers");
    private static final Object reference = new OpaqueKey("reference");
    private static final Comparator InvalidationLocationAscending = new Comparator() { // from class: androidx.compose.runtime.ComposerKt$$ExternalSyntheticLambda1
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int InvalidationLocationAscending$lambda$13;
            InvalidationLocationAscending$lambda$13 = ComposerKt.InvalidationLocationAscending$lambda$13((Invalidation) obj, (Invalidation) obj2);
            return InvalidationLocationAscending$lambda$13;
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean asBool(int i) {
        return i != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int asInt(boolean z) {
        return z ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int getNextGroup(SlotWriter slotWriter) {
        return slotWriter.getCurrentGroup() + slotWriter.groupSize(slotWriter.getCurrentGroup());
    }

    public static final boolean getComposeStackTraceEnabled() {
        return composeStackTraceEnabled;
    }

    public static final boolean isTraceInProgress() {
        CompositionTracer compositionTracer2 = compositionTracer;
        return compositionTracer2 != null && compositionTracer2.isTraceInProgress();
    }

    public static final void traceEventStart(int i, int i2, int i3, String str) {
        CompositionTracer compositionTracer2 = compositionTracer;
        if (compositionTracer2 != null) {
            compositionTracer2.traceEventStart(i, i2, i3, str);
        }
    }

    public static final void traceEventEnd() {
        CompositionTracer compositionTracer2 = compositionTracer;
        if (compositionTracer2 != null) {
            compositionTracer2.traceEventEnd();
        }
    }

    public static final void removeCurrentGroup(SlotWriter slotWriter, final RememberManager rememberManager) {
        slotWriter.forAllDataInRememberOrder(slotWriter.getCurrentGroup(), new Function2() { // from class: androidx.compose.runtime.ComposerKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Unit removeCurrentGroup$lambda$2;
                removeCurrentGroup$lambda$2 = ComposerKt.removeCurrentGroup$lambda$2(RememberManager.this, ((Integer) obj).intValue(), obj2);
                return removeCurrentGroup$lambda$2;
            }
        });
        slotWriter.removeGroup();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit removeCurrentGroup$lambda$2(RememberManager rememberManager, int i, Object obj) {
        if (obj instanceof ComposeNodeLifecycleCallback) {
            rememberManager.releasing((ComposeNodeLifecycleCallback) obj);
        }
        if (obj instanceof RememberObserverHolder) {
            rememberManager.forgetting((RememberObserverHolder) obj);
        }
        if (obj instanceof RecomposeScopeImpl) {
            ((RecomposeScopeImpl) obj).release();
        }
        return Unit.INSTANCE;
    }

    public static final boolean isAfterFirstChild(SlotWriter slotWriter) {
        return slotWriter.getCurrentGroup() > slotWriter.getParent() + 1;
    }

    public static final boolean isAfterFirstChild(SlotReader slotReader) {
        return slotReader.getCurrent() > slotReader.getParent() + 1;
    }

    public static final void deactivateCurrentGroup(final SlotWriter slotWriter, final RememberManager rememberManager) {
        slotWriter.forAllDataInRememberOrder(slotWriter.getCurrentGroup(), new Function2() { // from class: androidx.compose.runtime.ComposerKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Unit deactivateCurrentGroup$lambda$3;
                deactivateCurrentGroup$lambda$3 = ComposerKt.deactivateCurrentGroup$lambda$3(RememberManager.this, slotWriter, ((Integer) obj).intValue(), obj2);
                return deactivateCurrentGroup$lambda$3;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit deactivateCurrentGroup$lambda$3(RememberManager rememberManager, SlotWriter slotWriter, int i, Object obj) {
        if (obj instanceof ComposeNodeLifecycleCallback) {
            rememberManager.deactivating((ComposeNodeLifecycleCallback) obj);
        } else if (obj instanceof RememberObserverHolder) {
            RememberObserverHolder rememberObserverHolder = (RememberObserverHolder) obj;
            if (!(rememberObserverHolder.getWrapped() instanceof ReusableRememberObserver)) {
                removeData(slotWriter, i, obj);
                rememberManager.forgetting(rememberObserverHolder);
            }
        } else if (obj instanceof RecomposeScopeImpl) {
            removeData(slotWriter, i, obj);
            ((RecomposeScopeImpl) obj).release();
        }
        return Unit.INSTANCE;
    }

    private static final void removeData(SlotWriter slotWriter, int i, Object obj) {
        Object clear = slotWriter.clear(i);
        if (obj == clear) {
            return;
        }
        composeImmediateRuntimeError("Slot table is out of sync (expected " + obj + ", got " + clear + ')');
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableScatterMap multiMap(int i) {
        return MultiValueMap.m1174constructorimpl(new MutableScatterMap(i));
    }

    private static final int findLocation(List list, int i) {
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            int compare = Intrinsics.compare(((Invalidation) list.get(i3)).getLocation(), i);
            if (compare < 0) {
                i2 = i3 + 1;
            } else {
                if (compare <= 0) {
                    return i3;
                }
                size = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int findInsertLocation(List list, int i) {
        int findLocation = findLocation(list, i);
        return findLocation < 0 ? -(findLocation + 1) : findLocation;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void insertIfMissing(List list, int i, RecomposeScopeImpl recomposeScopeImpl, Object obj) {
        int findLocation = findLocation(list, i);
        if (findLocation < 0) {
            int i2 = -(findLocation + 1);
            if (!(obj instanceof DerivedState)) {
                obj = null;
            }
            list.add(i2, new Invalidation(recomposeScopeImpl, i, obj));
            return;
        }
        Invalidation invalidation = (Invalidation) list.get(findLocation);
        if (obj instanceof DerivedState) {
            Object instances = invalidation.getInstances();
            if (instances == null) {
                invalidation.setInstances(obj);
                return;
            } else if (instances instanceof MutableScatterSet) {
                ((MutableScatterSet) instances).add(obj);
                return;
            } else {
                invalidation.setInstances(ScatterSetKt.mutableScatterSetOf(instances, obj));
                return;
            }
        }
        invalidation.setInstances(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Invalidation firstInRange(List list, int i, int i2) {
        int findInsertLocation = findInsertLocation(list, i);
        if (findInsertLocation >= list.size()) {
            return null;
        }
        Invalidation invalidation = (Invalidation) list.get(findInsertLocation);
        if (invalidation.getLocation() < i2) {
            return invalidation;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Invalidation removeLocation(List list, int i) {
        int findLocation = findLocation(list, i);
        if (findLocation >= 0) {
            return (Invalidation) list.remove(findLocation);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void removeRange(List list, int i, int i2) {
        int findInsertLocation = findInsertLocation(list, i);
        while (findInsertLocation < list.size() && ((Invalidation) list.get(findInsertLocation)).getLocation() < i2) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List collectNodesFrom(SlotTable slotTable, Anchor anchor) {
        ArrayList arrayList = new ArrayList();
        SlotReader openReader = slotTable.openReader();
        try {
            collectNodesFrom$lambda$8$collectFromGroup(openReader, arrayList, slotTable.anchorIndex(anchor));
            Unit unit = Unit.INSTANCE;
            return arrayList;
        } finally {
            openReader.close();
        }
    }

    private static final void collectNodesFrom$lambda$8$collectFromGroup(SlotReader slotReader, List list, int i) {
        if (slotReader.isNode(i)) {
            list.add(slotReader.node(i));
            return;
        }
        int i2 = i + 1;
        int groupSize = i + slotReader.groupSize(i);
        while (i2 < groupSize) {
            collectNodesFrom$lambda$8$collectFromGroup(slotReader, list, i2);
            i2 += slotReader.groupSize(i2);
        }
    }

    private static final int distanceFrom(SlotReader slotReader, int i, int i2) {
        int i3 = 0;
        while (i > 0 && i != i2) {
            i = slotReader.parent(i);
            i3++;
        }
        return i3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int nearestCommonRootOf(SlotReader slotReader, int i, int i2, int i3) {
        if (i == i2) {
            return i;
        }
        if (i == i3 || i2 == i3) {
            return i3;
        }
        if (slotReader.parent(i) == i2) {
            return i2;
        }
        if (slotReader.parent(i2) == i) {
            return i;
        }
        if (slotReader.parent(i) == slotReader.parent(i2)) {
            return slotReader.parent(i);
        }
        int distanceFrom = distanceFrom(slotReader, i, i3);
        int distanceFrom2 = distanceFrom(slotReader, i2, i3);
        int i4 = distanceFrom - distanceFrom2;
        for (int i5 = 0; i5 < i4; i5++) {
            i = slotReader.parent(i);
        }
        int i6 = distanceFrom2 - distanceFrom;
        for (int i7 = 0; i7 < i6; i7++) {
            i2 = slotReader.parent(i2);
        }
        while (i != i2) {
            i = slotReader.parent(i);
            i2 = slotReader.parent(i2);
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object getJoinedKey(KeyInfo keyInfo) {
        return keyInfo.getObjectKey() != null ? new JoinedKey(Integer.valueOf(keyInfo.getKey()), keyInfo.getObjectKey()) : Integer.valueOf(keyInfo.getKey());
    }

    public static final Object getInvocation() {
        return invocation;
    }

    public static final Object getProvider() {
        return provider;
    }

    public static final Object getCompositionLocalMap() {
        return compositionLocalMap;
    }

    public static final Object getProviderMaps() {
        return providerMaps;
    }

    public static final Object getReference() {
        return reference;
    }

    @NotNull
    public static final Void composeRuntimeError(@NotNull String str) {
        throw new ComposeRuntimeError("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (" + str + "). Please report to Google or use https://goo.gle/compose-feedback");
    }

    public static final void composeImmediateRuntimeError(@NotNull String str) {
        throw new ComposeRuntimeError("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (" + str + "). Please report to Google or use https://goo.gle/compose-feedback");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int InvalidationLocationAscending$lambda$13(Invalidation invalidation, Invalidation invalidation2) {
        return Intrinsics.compare(invalidation.getLocation(), invalidation2.getLocation());
    }

    public static final MovableContentState extractMovableContentAtCurrent(final ControlledComposition controlledComposition, final MovableContentStateReference movableContentStateReference, SlotWriter slotWriter, Applier applier) {
        SlotTable slotTable = new SlotTable();
        if (slotWriter.getCollectingSourceInformation()) {
            slotTable.collectSourceInformation();
        }
        if (slotWriter.getCollectingCalledInformation()) {
            slotTable.collectCalledByInformation();
        }
        int currentGroup = slotWriter.getCurrentGroup();
        if (applier != null && slotWriter.nodeCount(currentGroup) > 0) {
            int parent = slotWriter.getParent();
            while (parent > 0 && !slotWriter.isNode(parent)) {
                parent = slotWriter.parent(parent);
            }
            if (parent >= 0 && slotWriter.isNode(parent)) {
                Object node = slotWriter.node(parent);
                int i = parent + 1;
                int groupSize = parent + slotWriter.groupSize(parent);
                int i2 = 0;
                while (i < groupSize) {
                    int groupSize2 = slotWriter.groupSize(i) + i;
                    if (groupSize2 > currentGroup) {
                        break;
                    }
                    i2 += slotWriter.isNode(i) ? 1 : slotWriter.nodeCount(i);
                    i = groupSize2;
                }
                int nodeCount = slotWriter.isNode(currentGroup) ? 1 : slotWriter.nodeCount(currentGroup);
                applier.down(node);
                applier.remove(i2, nodeCount);
                applier.up();
            }
        }
        SlotWriter openWriter = slotTable.openWriter();
        try {
            openWriter.beginInsert();
            openWriter.startGroup(126665345, movableContentStateReference.getContent());
            SlotWriter.markGroup$default(openWriter, 0, 1, null);
            openWriter.update(movableContentStateReference.getParameter());
            List moveTo = slotWriter.moveTo(movableContentStateReference.getAnchor(), 1, openWriter);
            openWriter.skipGroup();
            openWriter.endGroup();
            openWriter.endInsert();
            openWriter.close(true);
            MovableContentState movableContentState = new MovableContentState(slotTable);
            RecomposeScopeImpl.Companion companion = RecomposeScopeImpl.INSTANCE;
            if (companion.hasAnchoredRecomposeScopes$runtime(slotTable, moveTo)) {
                RecomposeScopeOwner recomposeScopeOwner = new RecomposeScopeOwner() { // from class: androidx.compose.runtime.ComposerKt$extractMovableContentAtCurrent$movableContentRecomposeScopeOwner$1
                    @Override // androidx.compose.runtime.RecomposeScopeOwner
                    public void recomposeScopeReleased(RecomposeScopeImpl scope) {
                    }

                    @Override // androidx.compose.runtime.RecomposeScopeOwner
                    public void recordReadOf(Object value) {
                    }

                    @Override // androidx.compose.runtime.RecomposeScopeOwner
                    public InvalidationResult invalidate(RecomposeScopeImpl scope, Object instance) {
                        InvalidationResult invalidationResult;
                        ControlledComposition controlledComposition2 = ControlledComposition.this;
                        RecomposeScopeOwner recomposeScopeOwner2 = controlledComposition2 instanceof RecomposeScopeOwner ? (RecomposeScopeOwner) controlledComposition2 : null;
                        if (recomposeScopeOwner2 == null || (invalidationResult = recomposeScopeOwner2.invalidate(scope, instance)) == null) {
                            invalidationResult = InvalidationResult.IGNORED;
                        }
                        if (invalidationResult != InvalidationResult.IGNORED) {
                            return invalidationResult;
                        }
                        MovableContentStateReference movableContentStateReference2 = movableContentStateReference;
                        movableContentStateReference2.setInvalidations$runtime(CollectionsKt.plus(movableContentStateReference2.getInvalidations(), TuplesKt.to(scope, instance)));
                        return InvalidationResult.SCHEDULED;
                    }
                };
                openWriter = slotTable.openWriter();
                try {
                    companion.adoptAnchoredScopes$runtime(openWriter, moveTo, recomposeScopeOwner);
                    Unit unit = Unit.INSTANCE;
                    openWriter.close(true);
                } finally {
                }
            }
            return movableContentState;
        } finally {
        }
    }
}
