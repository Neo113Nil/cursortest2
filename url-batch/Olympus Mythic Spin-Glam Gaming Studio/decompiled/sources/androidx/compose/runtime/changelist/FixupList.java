package androidx.compose.runtime.changelist;

import androidx.compose.runtime.Anchor;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RememberManager;
import androidx.compose.runtime.SlotWriter;
import androidx.compose.runtime.changelist.Operation;
import androidx.compose.runtime.changelist.Operations;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;

/* compiled from: FixupList.kt */
@StabilityInferred
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\u0003J3\u0010\u0011\u001a\u00020\u00072\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J-\u0010\u001a\u001a\u00020\u00072\u000e\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00132\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0007¢\u0006\u0004\b\u001c\u0010\u0003J;\u0010\"\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u001d\"\u0004\b\u0001\u0010\u001e2\u0006\u0010\u001f\u001a\u00028\u00002\u0018\u0010!\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070 ¢\u0006\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010'\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010&¨\u0006("}, d2 = {"Landroidx/compose/runtime/changelist/FixupList;", "Landroidx/compose/runtime/changelist/OperationsDebugStringFormattable;", "<init>", "()V", "", "isEmpty", "()Z", "", "clear", "Landroidx/compose/runtime/Applier;", "applier", "Landroidx/compose/runtime/SlotWriter;", "slots", "Landroidx/compose/runtime/RememberManager;", "rememberManager", "Landroidx/compose/runtime/changelist/OperationErrorContext;", "errorContext", "executeAndFlushAllPendingFixups", "(Landroidx/compose/runtime/Applier;Landroidx/compose/runtime/SlotWriter;Landroidx/compose/runtime/RememberManager;Landroidx/compose/runtime/changelist/OperationErrorContext;)V", "Lkotlin/Function0;", "", "factory", "", "insertIndex", "Landroidx/compose/runtime/Anchor;", "groupAnchor", "createAndInsertNode", "(Lkotlin/jvm/functions/Function0;ILandroidx/compose/runtime/Anchor;)V", "endNodeInsert", "V", "T", "value", "Lkotlin/Function2;", "block", "updateNode", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "Landroidx/compose/runtime/changelist/Operations;", "operations", "Landroidx/compose/runtime/changelist/Operations;", "pendingOperations", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class FixupList extends OperationsDebugStringFormattable {
    private final Operations operations = new Operations();
    private final Operations pendingOperations = new Operations();

    public final boolean isEmpty() {
        return this.operations.isEmpty();
    }

    public final void clear() {
        this.pendingOperations.clear();
        this.operations.clear();
    }

    public final void executeAndFlushAllPendingFixups(Applier applier, SlotWriter slots, RememberManager rememberManager, OperationErrorContext errorContext) {
        if (!this.pendingOperations.isEmpty()) {
            ComposerKt.composeImmediateRuntimeError("FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?");
        }
        this.operations.executeAndFlushAllPendingOperations(applier, slots, rememberManager, errorContext);
    }

    public final void createAndInsertNode(Function0 factory, int insertIndex, Anchor groupAnchor) {
        Operations operations = this.operations;
        Operation.InsertNodeFixup insertNodeFixup = Operation.InsertNodeFixup.INSTANCE;
        operations.pushOp(insertNodeFixup);
        Operations m1162constructorimpl = Operations.WriteScope.m1162constructorimpl(operations);
        Operations.WriteScope.m1165setObjectDKhxnng(m1162constructorimpl, Operation.ObjectParameter.m1156constructorimpl(0), factory);
        m1162constructorimpl.intArgs[m1162constructorimpl.intArgsSize - m1162constructorimpl.opCodes[m1162constructorimpl.opCodesSize - 1].getInts()] = insertIndex;
        Operations.WriteScope.m1165setObjectDKhxnng(m1162constructorimpl, Operation.ObjectParameter.m1156constructorimpl(1), groupAnchor);
        operations.ensureAllArgumentsPushedFor(insertNodeFixup);
        Operations operations2 = this.pendingOperations;
        Operation.PostInsertNodeFixup postInsertNodeFixup = Operation.PostInsertNodeFixup.INSTANCE;
        operations2.pushOp(postInsertNodeFixup);
        Operations m1162constructorimpl2 = Operations.WriteScope.m1162constructorimpl(operations2);
        m1162constructorimpl2.intArgs[m1162constructorimpl2.intArgsSize - m1162constructorimpl2.opCodes[m1162constructorimpl2.opCodesSize - 1].getInts()] = insertIndex;
        Operations.WriteScope.m1165setObjectDKhxnng(m1162constructorimpl2, Operation.ObjectParameter.m1156constructorimpl(0), groupAnchor);
        operations2.ensureAllArgumentsPushedFor(postInsertNodeFixup);
    }

    public final void endNodeInsert() {
        if (!this.pendingOperations.isNotEmpty()) {
            ComposerKt.composeImmediateRuntimeError("Cannot end node insertion, there are no pending operations that can be realized.");
        }
        this.pendingOperations.popInto(this.operations);
    }

    public final void updateNode(Object value, Function2 block) {
        Operations operations = this.operations;
        Operation.UpdateNode updateNode = Operation.UpdateNode.INSTANCE;
        operations.pushOp(updateNode);
        Operations m1162constructorimpl = Operations.WriteScope.m1162constructorimpl(operations);
        Operations.WriteScope.m1165setObjectDKhxnng(m1162constructorimpl, Operation.ObjectParameter.m1156constructorimpl(0), value);
        int m1156constructorimpl = Operation.ObjectParameter.m1156constructorimpl(1);
        Intrinsics.checkNotNull(block, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
        Operations.WriteScope.m1165setObjectDKhxnng(m1162constructorimpl, m1156constructorimpl, (Function2) TypeIntrinsics.beforeCheckcastToFunctionOfArity(block, 2));
        operations.ensureAllArgumentsPushedFor(updateNode);
    }
}
