package androidx.compose.runtime.changelist;

import androidx.compose.runtime.Anchor;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposeNodeLifecycleCallback;
import androidx.compose.runtime.Composition;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.ControlledComposition;
import androidx.compose.runtime.MovableContentState;
import androidx.compose.runtime.MovableContentStateReference;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RememberManager;
import androidx.compose.runtime.RememberObserverHolder;
import androidx.compose.runtime.SlotTable;
import androidx.compose.runtime.SlotWriter;
import androidx.compose.runtime.changelist.Operation;
import androidx.compose.runtime.changelist.Operations;
import androidx.compose.runtime.internal.IntRef;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;

/* compiled from: ChangeList.kt */
@StabilityInferred
@Metadata(d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\u0006J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\u0003J3\u0010\u0012\u001a\u00020\b2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001c\u0010\u001bJ\u0015\u0010\u001d\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001d\u0010\u001bJ\u001f\u0010!\u001a\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u001e2\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J'\u0010%\u001a\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u001e2\u0006\u0010$\u001a\u00020#2\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b%\u0010&J\u001f\u0010'\u001a\u00020\b2\u0006\u0010$\u001a\u00020#2\b\u0010\u0015\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b'\u0010(J\u0015\u0010*\u001a\u00020\b2\u0006\u0010)\u001a\u00020\u001f¢\u0006\u0004\b*\u0010+J\r\u0010,\u001a\u00020\b¢\u0006\u0004\b,\u0010\u0003J\r\u0010-\u001a\u00020\b¢\u0006\u0004\b-\u0010\u0003J\u0017\u0010/\u001a\u00020\b2\b\u0010.\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b/\u00100J\r\u00101\u001a\u00020\b¢\u0006\u0004\b1\u0010\u0003J\u0015\u00102\u001a\u00020\b2\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b2\u00103J\r\u00104\u001a\u00020\b¢\u0006\u0004\b4\u0010\u0003J\r\u00105\u001a\u00020\b¢\u0006\u0004\b5\u0010\u0003J\r\u00106\u001a\u00020\b¢\u0006\u0004\b6\u0010\u0003J\u001d\u00109\u001a\u00020\b2\u0006\u0010$\u001a\u00020#2\u0006\u00108\u001a\u000207¢\u0006\u0004\b9\u0010:J%\u00109\u001a\u00020\b2\u0006\u0010$\u001a\u00020#2\u0006\u00108\u001a\u0002072\u0006\u0010<\u001a\u00020;¢\u0006\u0004\b9\u0010=J\u0015\u0010?\u001a\u00020\b2\u0006\u0010>\u001a\u00020\u001f¢\u0006\u0004\b?\u0010+J)\u0010D\u001a\u00020\b2\u0012\u0010B\u001a\u000e\u0012\u0004\u0012\u00020A\u0012\u0004\u0012\u00020\b0@2\u0006\u0010C\u001a\u00020A¢\u0006\u0004\bD\u0010EJ\u0017\u0010G\u001a\u00020\b2\b\u0010F\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\bG\u00100J;\u0010L\u001a\u00020\b\"\u0004\b\u0000\u0010H\"\u0004\b\u0001\u0010I2\u0006\u0010\u0015\u001a\u00028\u00012\u0018\u0010K\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\b0J¢\u0006\u0004\bL\u0010MJ\u001d\u0010P\u001a\u00020\b2\u0006\u0010N\u001a\u00020\u001f2\u0006\u0010O\u001a\u00020\u001f¢\u0006\u0004\bP\u0010QJ%\u0010S\u001a\u00020\b2\u0006\u0010R\u001a\u00020\u001f2\u0006\u00108\u001a\u00020\u001f2\u0006\u0010)\u001a\u00020\u001f¢\u0006\u0004\bS\u0010TJ\u0015\u0010V\u001a\u00020\b2\u0006\u0010U\u001a\u00020\u001f¢\u0006\u0004\bV\u0010+J\u0015\u0010W\u001a\u00020\b2\u0006\u0010)\u001a\u00020\u001f¢\u0006\u0004\bW\u0010+J\u001d\u0010Z\u001a\u00020\b2\u000e\u0010Y\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0X¢\u0006\u0004\bZ\u0010[J\u001b\u0010^\u001a\u00020\b2\f\u0010]\u001a\b\u0012\u0004\u0012\u00020\b0\\¢\u0006\u0004\b^\u0010_J\u001d\u0010b\u001a\u00020\b2\u0006\u0010a\u001a\u00020`2\u0006\u0010$\u001a\u00020#¢\u0006\u0004\bb\u0010cJ%\u0010f\u001a\u00020\b2\u000e\u0010Y\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0d2\u0006\u0010e\u001a\u00020`¢\u0006\u0004\bf\u0010gJ/\u0010m\u001a\u00020\b2\b\u0010i\u001a\u0004\u0018\u00010h2\u0006\u0010k\u001a\u00020j2\u0006\u00108\u001a\u00020l2\u0006\u0010R\u001a\u00020l¢\u0006\u0004\bm\u0010nJ%\u0010q\u001a\u00020\b2\u0006\u0010C\u001a\u00020o2\u0006\u0010k\u001a\u00020j2\u0006\u0010p\u001a\u00020l¢\u0006\u0004\bq\u0010rJ\r\u0010s\u001a\u00020\b¢\u0006\u0004\bs\u0010\u0003J!\u0010u\u001a\u00020\b2\u0006\u0010t\u001a\u00020\u00002\n\b\u0002\u0010e\u001a\u0004\u0018\u00010`¢\u0006\u0004\bu\u0010vR\u0014\u0010x\u001a\u00020w8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bx\u0010y¨\u0006z"}, d2 = {"Landroidx/compose/runtime/changelist/ChangeList;", "Landroidx/compose/runtime/changelist/OperationsDebugStringFormattable;", "<init>", "()V", "", "isEmpty", "()Z", "isNotEmpty", "", "clear", "Landroidx/compose/runtime/Applier;", "applier", "Landroidx/compose/runtime/SlotWriter;", "slots", "Landroidx/compose/runtime/RememberManager;", "rememberManager", "Landroidx/compose/runtime/changelist/OperationErrorContext;", "errorContext", "executeAndFlushAllPendingChanges", "(Landroidx/compose/runtime/Applier;Landroidx/compose/runtime/SlotWriter;Landroidx/compose/runtime/RememberManager;Landroidx/compose/runtime/changelist/OperationErrorContext;)V", "Landroidx/compose/runtime/RememberObserverHolder;", "value", "pushRemember", "(Landroidx/compose/runtime/RememberObserverHolder;)V", "Landroidx/compose/runtime/RecomposeScopeImpl;", "scope", "pushRememberPausingScope", "(Landroidx/compose/runtime/RecomposeScopeImpl;)V", "pushStartResumingScope", "pushEndResumingScope", "", "", "groupSlotIndex", "pushUpdateValue", "(Ljava/lang/Object;I)V", "Landroidx/compose/runtime/Anchor;", "anchor", "pushUpdateAnchoredValue", "(Ljava/lang/Object;Landroidx/compose/runtime/Anchor;I)V", "pushAppendValue", "(Landroidx/compose/runtime/Anchor;Ljava/lang/Object;)V", "count", "pushTrimValues", "(I)V", "pushResetSlots", "pushDeactivateCurrentGroup", "data", "pushUpdateAuxData", "(Ljava/lang/Object;)V", "pushEnsureRootStarted", "pushEnsureGroupStarted", "(Landroidx/compose/runtime/Anchor;)V", "pushEndCurrentGroup", "pushSkipToEndOfCurrentGroup", "pushRemoveCurrentGroup", "Landroidx/compose/runtime/SlotTable;", "from", "pushInsertSlots", "(Landroidx/compose/runtime/Anchor;Landroidx/compose/runtime/SlotTable;)V", "Landroidx/compose/runtime/changelist/FixupList;", "fixups", "(Landroidx/compose/runtime/Anchor;Landroidx/compose/runtime/SlotTable;Landroidx/compose/runtime/changelist/FixupList;)V", "offset", "pushMoveCurrentGroup", "Lkotlin/Function1;", "Landroidx/compose/runtime/Composition;", "action", "composition", "pushEndCompositionScope", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composition;)V", "node", "pushUseNode", "T", "V", "Lkotlin/Function2;", "block", "pushUpdateNode", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "removeFrom", "moveCount", "pushRemoveNode", "(II)V", "to", "pushMoveNode", "(III)V", "distance", "pushAdvanceSlotsBy", "pushUps", "", "nodes", "pushDowns", "([Ljava/lang/Object;)V", "Lkotlin/Function0;", "effect", "pushSideEffect", "(Lkotlin/jvm/functions/Function0;)V", "Landroidx/compose/runtime/internal/IntRef;", "effectiveNodeIndexOut", "pushDetermineMovableContentNodeIndex", "(Landroidx/compose/runtime/internal/IntRef;Landroidx/compose/runtime/Anchor;)V", "", "effectiveNodeIndex", "pushCopyNodesToNewAnchorLocation", "(Ljava/util/List;Landroidx/compose/runtime/internal/IntRef;)V", "Landroidx/compose/runtime/MovableContentState;", "resolvedState", "Landroidx/compose/runtime/CompositionContext;", "parentContext", "Landroidx/compose/runtime/MovableContentStateReference;", "pushCopySlotTableToAnchorLocation", "(Landroidx/compose/runtime/MovableContentState;Landroidx/compose/runtime/CompositionContext;Landroidx/compose/runtime/MovableContentStateReference;Landroidx/compose/runtime/MovableContentStateReference;)V", "Landroidx/compose/runtime/ControlledComposition;", "reference", "pushReleaseMovableGroupAtCurrent", "(Landroidx/compose/runtime/ControlledComposition;Landroidx/compose/runtime/CompositionContext;Landroidx/compose/runtime/MovableContentStateReference;)V", "pushEndMovableContentPlacement", "changeList", "pushExecuteOperationsIn", "(Landroidx/compose/runtime/changelist/ChangeList;Landroidx/compose/runtime/internal/IntRef;)V", "Landroidx/compose/runtime/changelist/Operations;", "operations", "Landroidx/compose/runtime/changelist/Operations;", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChangeList extends OperationsDebugStringFormattable {
    private final Operations operations = new Operations();

    public final boolean isEmpty() {
        return this.operations.isEmpty();
    }

    public final boolean isNotEmpty() {
        return this.operations.isNotEmpty();
    }

    public final void clear() {
        this.operations.clear();
    }

    public final void executeAndFlushAllPendingChanges(Applier applier, SlotWriter slots, RememberManager rememberManager, OperationErrorContext errorContext) {
        this.operations.executeAndFlushAllPendingOperations(applier, slots, rememberManager, errorContext);
    }

    public final void pushRemember(RememberObserverHolder value) {
        Operations operations = this.operations;
        Operation.Remember remember = Operation.Remember.INSTANCE;
        operations.pushOp(remember);
        Operations.WriteScope.m1165setObjectDKhxnng(Operations.WriteScope.m1162constructorimpl(operations), Operation.ObjectParameter.m1156constructorimpl(0), value);
        operations.ensureAllArgumentsPushedFor(remember);
    }

    public final void pushRememberPausingScope(RecomposeScopeImpl scope) {
        Operations operations = this.operations;
        Operation.RememberPausingScope rememberPausingScope = Operation.RememberPausingScope.INSTANCE;
        operations.pushOp(rememberPausingScope);
        Operations.WriteScope.m1165setObjectDKhxnng(Operations.WriteScope.m1162constructorimpl(operations), Operation.ObjectParameter.m1156constructorimpl(0), scope);
        operations.ensureAllArgumentsPushedFor(rememberPausingScope);
    }

    public final void pushStartResumingScope(RecomposeScopeImpl scope) {
        Operations operations = this.operations;
        Operation.StartResumingScope startResumingScope = Operation.StartResumingScope.INSTANCE;
        operations.pushOp(startResumingScope);
        Operations.WriteScope.m1165setObjectDKhxnng(Operations.WriteScope.m1162constructorimpl(operations), Operation.ObjectParameter.m1156constructorimpl(0), scope);
        operations.ensureAllArgumentsPushedFor(startResumingScope);
    }

    public final void pushEndResumingScope(RecomposeScopeImpl scope) {
        Operations operations = this.operations;
        Operation.EndResumingScope endResumingScope = Operation.EndResumingScope.INSTANCE;
        operations.pushOp(endResumingScope);
        Operations.WriteScope.m1165setObjectDKhxnng(Operations.WriteScope.m1162constructorimpl(operations), Operation.ObjectParameter.m1156constructorimpl(0), scope);
        operations.ensureAllArgumentsPushedFor(endResumingScope);
    }

    public final void pushUpdateValue(Object value, int groupSlotIndex) {
        Operations operations = this.operations;
        Operation.UpdateValue updateValue = Operation.UpdateValue.INSTANCE;
        operations.pushOp(updateValue);
        Operations m1162constructorimpl = Operations.WriteScope.m1162constructorimpl(operations);
        Operations.WriteScope.m1165setObjectDKhxnng(m1162constructorimpl, Operation.ObjectParameter.m1156constructorimpl(0), value);
        m1162constructorimpl.intArgs[m1162constructorimpl.intArgsSize - m1162constructorimpl.opCodes[m1162constructorimpl.opCodesSize - 1].getInts()] = groupSlotIndex;
        operations.ensureAllArgumentsPushedFor(updateValue);
    }

    public final void pushUpdateAnchoredValue(Object value, Anchor anchor, int groupSlotIndex) {
        Operations operations = this.operations;
        Operation.UpdateAnchoredValue updateAnchoredValue = Operation.UpdateAnchoredValue.INSTANCE;
        operations.pushOp(updateAnchoredValue);
        Operations m1162constructorimpl = Operations.WriteScope.m1162constructorimpl(operations);
        Operations.WriteScope.m1166setObjects4uCC6AY(m1162constructorimpl, Operation.ObjectParameter.m1156constructorimpl(0), value, Operation.ObjectParameter.m1156constructorimpl(1), anchor);
        m1162constructorimpl.intArgs[m1162constructorimpl.intArgsSize - m1162constructorimpl.opCodes[m1162constructorimpl.opCodesSize - 1].getInts()] = groupSlotIndex;
        operations.ensureAllArgumentsPushedFor(updateAnchoredValue);
    }

    public final void pushAppendValue(Anchor anchor, Object value) {
        Operations operations = this.operations;
        Operation.AppendValue appendValue = Operation.AppendValue.INSTANCE;
        operations.pushOp(appendValue);
        Operations.WriteScope.m1166setObjects4uCC6AY(Operations.WriteScope.m1162constructorimpl(operations), Operation.ObjectParameter.m1156constructorimpl(0), anchor, Operation.ObjectParameter.m1156constructorimpl(1), value);
        operations.ensureAllArgumentsPushedFor(appendValue);
    }

    public final void pushTrimValues(int count) {
        Operations operations = this.operations;
        Operation.TrimParentValues trimParentValues = Operation.TrimParentValues.INSTANCE;
        operations.pushOp(trimParentValues);
        Operations m1162constructorimpl = Operations.WriteScope.m1162constructorimpl(operations);
        m1162constructorimpl.intArgs[m1162constructorimpl.intArgsSize - m1162constructorimpl.opCodes[m1162constructorimpl.opCodesSize - 1].getInts()] = count;
        operations.ensureAllArgumentsPushedFor(trimParentValues);
    }

    public final void pushResetSlots() {
        this.operations.push(Operation.ResetSlots.INSTANCE);
    }

    public final void pushDeactivateCurrentGroup() {
        this.operations.push(Operation.DeactivateCurrentGroup.INSTANCE);
    }

    public final void pushUpdateAuxData(Object data) {
        Operations operations = this.operations;
        Operation.UpdateAuxData updateAuxData = Operation.UpdateAuxData.INSTANCE;
        operations.pushOp(updateAuxData);
        Operations.WriteScope.m1165setObjectDKhxnng(Operations.WriteScope.m1162constructorimpl(operations), Operation.ObjectParameter.m1156constructorimpl(0), data);
        operations.ensureAllArgumentsPushedFor(updateAuxData);
    }

    public final void pushEnsureRootStarted() {
        this.operations.push(Operation.EnsureRootGroupStarted.INSTANCE);
    }

    public final void pushEnsureGroupStarted(Anchor anchor) {
        Operations operations = this.operations;
        Operation.EnsureGroupStarted ensureGroupStarted = Operation.EnsureGroupStarted.INSTANCE;
        operations.pushOp(ensureGroupStarted);
        Operations.WriteScope.m1165setObjectDKhxnng(Operations.WriteScope.m1162constructorimpl(operations), Operation.ObjectParameter.m1156constructorimpl(0), anchor);
        operations.ensureAllArgumentsPushedFor(ensureGroupStarted);
    }

    public final void pushEndCurrentGroup() {
        this.operations.push(Operation.EndCurrentGroup.INSTANCE);
    }

    public final void pushSkipToEndOfCurrentGroup() {
        this.operations.push(Operation.SkipToEndOfCurrentGroup.INSTANCE);
    }

    public final void pushRemoveCurrentGroup() {
        this.operations.push(Operation.RemoveCurrentGroup.INSTANCE);
    }

    public final void pushInsertSlots(Anchor anchor, SlotTable from) {
        Operations operations = this.operations;
        Operation.InsertSlots insertSlots = Operation.InsertSlots.INSTANCE;
        operations.pushOp(insertSlots);
        Operations.WriteScope.m1166setObjects4uCC6AY(Operations.WriteScope.m1162constructorimpl(operations), Operation.ObjectParameter.m1156constructorimpl(0), anchor, Operation.ObjectParameter.m1156constructorimpl(1), from);
        operations.ensureAllArgumentsPushedFor(insertSlots);
    }

    public final void pushInsertSlots(Anchor anchor, SlotTable from, FixupList fixups) {
        Operations operations = this.operations;
        Operation.InsertSlotsWithFixups insertSlotsWithFixups = Operation.InsertSlotsWithFixups.INSTANCE;
        operations.pushOp(insertSlotsWithFixups);
        Operations.WriteScope.m1168setObjectst7hvbck(Operations.WriteScope.m1162constructorimpl(operations), Operation.ObjectParameter.m1156constructorimpl(0), anchor, Operation.ObjectParameter.m1156constructorimpl(1), from, Operation.ObjectParameter.m1156constructorimpl(2), fixups);
        operations.ensureAllArgumentsPushedFor(insertSlotsWithFixups);
    }

    public final void pushMoveCurrentGroup(int offset) {
        Operations operations = this.operations;
        Operation.MoveCurrentGroup moveCurrentGroup = Operation.MoveCurrentGroup.INSTANCE;
        operations.pushOp(moveCurrentGroup);
        Operations m1162constructorimpl = Operations.WriteScope.m1162constructorimpl(operations);
        m1162constructorimpl.intArgs[m1162constructorimpl.intArgsSize - m1162constructorimpl.opCodes[m1162constructorimpl.opCodesSize - 1].getInts()] = offset;
        operations.ensureAllArgumentsPushedFor(moveCurrentGroup);
    }

    public final void pushEndCompositionScope(Function1 action, Composition composition) {
        Operations operations = this.operations;
        Operation.EndCompositionScope endCompositionScope = Operation.EndCompositionScope.INSTANCE;
        operations.pushOp(endCompositionScope);
        Operations.WriteScope.m1166setObjects4uCC6AY(Operations.WriteScope.m1162constructorimpl(operations), Operation.ObjectParameter.m1156constructorimpl(0), action, Operation.ObjectParameter.m1156constructorimpl(1), composition);
        operations.ensureAllArgumentsPushedFor(endCompositionScope);
    }

    public final void pushUseNode(Object node) {
        if (node instanceof ComposeNodeLifecycleCallback) {
            this.operations.push(Operation.UseCurrentNode.INSTANCE);
        }
    }

    public final void pushUpdateNode(Object value, Function2 block) {
        Operations operations = this.operations;
        Operation.UpdateNode updateNode = Operation.UpdateNode.INSTANCE;
        operations.pushOp(updateNode);
        Operations m1162constructorimpl = Operations.WriteScope.m1162constructorimpl(operations);
        int m1156constructorimpl = Operation.ObjectParameter.m1156constructorimpl(0);
        int m1156constructorimpl2 = Operation.ObjectParameter.m1156constructorimpl(1);
        Intrinsics.checkNotNull(block, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
        Operations.WriteScope.m1166setObjects4uCC6AY(m1162constructorimpl, m1156constructorimpl, value, m1156constructorimpl2, (Function2) TypeIntrinsics.beforeCheckcastToFunctionOfArity(block, 2));
        operations.ensureAllArgumentsPushedFor(updateNode);
    }

    public final void pushRemoveNode(int removeFrom, int moveCount) {
        Operations operations = this.operations;
        Operation.RemoveNode removeNode = Operation.RemoveNode.INSTANCE;
        operations.pushOp(removeNode);
        Operations m1162constructorimpl = Operations.WriteScope.m1162constructorimpl(operations);
        int ints = m1162constructorimpl.intArgsSize - m1162constructorimpl.opCodes[m1162constructorimpl.opCodesSize - 1].getInts();
        int[] iArr = m1162constructorimpl.intArgs;
        iArr[ints] = removeFrom;
        iArr[ints + 1] = moveCount;
        operations.ensureAllArgumentsPushedFor(removeNode);
    }

    public final void pushMoveNode(int to, int from, int count) {
        Operations operations = this.operations;
        Operation.MoveNode moveNode = Operation.MoveNode.INSTANCE;
        operations.pushOp(moveNode);
        Operations m1162constructorimpl = Operations.WriteScope.m1162constructorimpl(operations);
        int ints = m1162constructorimpl.intArgsSize - m1162constructorimpl.opCodes[m1162constructorimpl.opCodesSize - 1].getInts();
        int[] iArr = m1162constructorimpl.intArgs;
        iArr[ints + 1] = to;
        iArr[ints] = from;
        iArr[ints + 2] = count;
        operations.ensureAllArgumentsPushedFor(moveNode);
    }

    public final void pushAdvanceSlotsBy(int distance) {
        Operations operations = this.operations;
        Operation.AdvanceSlotsBy advanceSlotsBy = Operation.AdvanceSlotsBy.INSTANCE;
        operations.pushOp(advanceSlotsBy);
        Operations m1162constructorimpl = Operations.WriteScope.m1162constructorimpl(operations);
        m1162constructorimpl.intArgs[m1162constructorimpl.intArgsSize - m1162constructorimpl.opCodes[m1162constructorimpl.opCodesSize - 1].getInts()] = distance;
        operations.ensureAllArgumentsPushedFor(advanceSlotsBy);
    }

    public final void pushUps(int count) {
        Operations operations = this.operations;
        Operation.Ups ups = Operation.Ups.INSTANCE;
        operations.pushOp(ups);
        Operations m1162constructorimpl = Operations.WriteScope.m1162constructorimpl(operations);
        m1162constructorimpl.intArgs[m1162constructorimpl.intArgsSize - m1162constructorimpl.opCodes[m1162constructorimpl.opCodesSize - 1].getInts()] = count;
        operations.ensureAllArgumentsPushedFor(ups);
    }

    public final void pushDowns(Object[] nodes) {
        if (nodes.length == 0) {
            return;
        }
        Operations operations = this.operations;
        Operation.Downs downs = Operation.Downs.INSTANCE;
        operations.pushOp(downs);
        Operations.WriteScope.m1165setObjectDKhxnng(Operations.WriteScope.m1162constructorimpl(operations), Operation.ObjectParameter.m1156constructorimpl(0), nodes);
        operations.ensureAllArgumentsPushedFor(downs);
    }

    public final void pushSideEffect(Function0 effect) {
        Operations operations = this.operations;
        Operation.SideEffect sideEffect = Operation.SideEffect.INSTANCE;
        operations.pushOp(sideEffect);
        Operations.WriteScope.m1165setObjectDKhxnng(Operations.WriteScope.m1162constructorimpl(operations), Operation.ObjectParameter.m1156constructorimpl(0), effect);
        operations.ensureAllArgumentsPushedFor(sideEffect);
    }

    public final void pushDetermineMovableContentNodeIndex(IntRef effectiveNodeIndexOut, Anchor anchor) {
        Operations operations = this.operations;
        Operation.DetermineMovableContentNodeIndex determineMovableContentNodeIndex = Operation.DetermineMovableContentNodeIndex.INSTANCE;
        operations.pushOp(determineMovableContentNodeIndex);
        Operations.WriteScope.m1166setObjects4uCC6AY(Operations.WriteScope.m1162constructorimpl(operations), Operation.ObjectParameter.m1156constructorimpl(0), effectiveNodeIndexOut, Operation.ObjectParameter.m1156constructorimpl(1), anchor);
        operations.ensureAllArgumentsPushedFor(determineMovableContentNodeIndex);
    }

    public final void pushCopyNodesToNewAnchorLocation(List nodes, IntRef effectiveNodeIndex) {
        if (nodes.isEmpty()) {
            return;
        }
        Operations operations = this.operations;
        Operation.CopyNodesToNewAnchorLocation copyNodesToNewAnchorLocation = Operation.CopyNodesToNewAnchorLocation.INSTANCE;
        operations.pushOp(copyNodesToNewAnchorLocation);
        Operations.WriteScope.m1166setObjects4uCC6AY(Operations.WriteScope.m1162constructorimpl(operations), Operation.ObjectParameter.m1156constructorimpl(1), nodes, Operation.ObjectParameter.m1156constructorimpl(0), effectiveNodeIndex);
        operations.ensureAllArgumentsPushedFor(copyNodesToNewAnchorLocation);
    }

    public final void pushCopySlotTableToAnchorLocation(MovableContentState resolvedState, CompositionContext parentContext, MovableContentStateReference from, MovableContentStateReference to) {
        Operations operations = this.operations;
        Operation.CopySlotTableToAnchorLocation copySlotTableToAnchorLocation = Operation.CopySlotTableToAnchorLocation.INSTANCE;
        operations.pushOp(copySlotTableToAnchorLocation);
        Operations.WriteScope.m1167setObjectsOGa0p1M(Operations.WriteScope.m1162constructorimpl(operations), Operation.ObjectParameter.m1156constructorimpl(0), resolvedState, Operation.ObjectParameter.m1156constructorimpl(1), parentContext, Operation.ObjectParameter.m1156constructorimpl(3), to, Operation.ObjectParameter.m1156constructorimpl(2), from);
        operations.ensureAllArgumentsPushedFor(copySlotTableToAnchorLocation);
    }

    public final void pushReleaseMovableGroupAtCurrent(ControlledComposition composition, CompositionContext parentContext, MovableContentStateReference reference) {
        Operations operations = this.operations;
        Operation.ReleaseMovableGroupAtCurrent releaseMovableGroupAtCurrent = Operation.ReleaseMovableGroupAtCurrent.INSTANCE;
        operations.pushOp(releaseMovableGroupAtCurrent);
        Operations.WriteScope.m1168setObjectst7hvbck(Operations.WriteScope.m1162constructorimpl(operations), Operation.ObjectParameter.m1156constructorimpl(0), composition, Operation.ObjectParameter.m1156constructorimpl(1), parentContext, Operation.ObjectParameter.m1156constructorimpl(2), reference);
        operations.ensureAllArgumentsPushedFor(releaseMovableGroupAtCurrent);
    }

    public final void pushEndMovableContentPlacement() {
        this.operations.push(Operation.EndMovableContentPlacement.INSTANCE);
    }

    public final void pushExecuteOperationsIn(ChangeList changeList, IntRef effectiveNodeIndex) {
        if (changeList.isNotEmpty()) {
            Operations operations = this.operations;
            Operation.ApplyChangeList applyChangeList = Operation.ApplyChangeList.INSTANCE;
            operations.pushOp(applyChangeList);
            Operations.WriteScope.m1166setObjects4uCC6AY(Operations.WriteScope.m1162constructorimpl(operations), Operation.ObjectParameter.m1156constructorimpl(0), changeList, Operation.ObjectParameter.m1156constructorimpl(1), effectiveNodeIndex);
            operations.ensureAllArgumentsPushedFor(applyChangeList);
        }
    }
}
