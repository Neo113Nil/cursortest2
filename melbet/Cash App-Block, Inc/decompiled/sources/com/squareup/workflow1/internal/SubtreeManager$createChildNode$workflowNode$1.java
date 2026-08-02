package com.squareup.workflow1.internal;

import com.squareup.scannerview.ScannerView;
import com.squareup.workflow1.WorkflowAction;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes8.dex */
public final /* synthetic */ class SubtreeManager$createChildNode$workflowNode$1 extends FunctionReferenceImpl implements Function1 {
    public final /* synthetic */ Ref$ObjectRef $node;
    public final /* synthetic */ SubtreeManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubtreeManager$createChildNode$workflowNode$1(Ref$ObjectRef ref$ObjectRef, SubtreeManager subtreeManager) {
        super(1, ArrayIteratorKt.class, "acceptChildOutput", "createChildNode$acceptChildOutput(Lkotlin/jvm/internal/Ref$ObjectRef;Lcom/squareup/workflow1/internal/SubtreeManager;Ljava/lang/Object;)Ljava/lang/Object;", 0);
        this.$node = ref$ObjectRef;
        this.this$0 = subtreeManager;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object obj2 = this.$node.element;
        if (obj2 != null) {
            return ((ScannerView.AnonymousClass3) this.this$0.emitActionToParent).invoke((WorkflowAction) ((WorkflowChildNode) obj2).handler.invoke(obj));
        }
        Intrinsics.throwUninitializedPropertyAccessException("node");
        throw null;
    }
}
