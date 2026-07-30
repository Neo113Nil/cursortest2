package androidx.compose.foundation.gestures;

import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.gestures.DragEvent;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: AnchoredDraggable.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0005H\u008a@"}, d2 = {"<anonymous>", "", "T", "Landroidx/compose/foundation/gestures/AnchoredDragScope;", "it", "Landroidx/compose/foundation/gestures/DraggableAnchors;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.AnchoredDraggableNode$drag$2", f = "AnchoredDraggable.kt", i = {}, l = {251}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
final class AnchoredDraggableNode$drag$2<T> extends SuspendLambda implements Function3<AnchoredDragScope, DraggableAnchors<T>, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function2<Function1<? super DragEvent.DragDelta, Unit>, Continuation<? super Unit>, Object> $forEachDelta;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AnchoredDraggableNode<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    AnchoredDraggableNode$drag$2(Function2<? super Function1<? super DragEvent.DragDelta, Unit>, ? super Continuation<? super Unit>, ? extends Object> function2, AnchoredDraggableNode<T> anchoredDraggableNode, Continuation<? super AnchoredDraggableNode$drag$2> continuation) {
        super(3, continuation);
        this.$forEachDelta = function2;
        this.this$0 = anchoredDraggableNode;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(AnchoredDragScope anchoredDragScope, DraggableAnchors<T> draggableAnchors, Continuation<? super Unit> continuation) {
        AnchoredDraggableNode$drag$2 anchoredDraggableNode$drag$2 = new AnchoredDraggableNode$drag$2(this.$forEachDelta, this.this$0, continuation);
        anchoredDraggableNode$drag$2.L$0 = anchoredDragScope;
        return anchoredDraggableNode$drag$2.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            final AnchoredDragScope anchoredDragScope = (AnchoredDragScope) this.L$0;
            Function2<Function1<? super DragEvent.DragDelta, Unit>, Continuation<? super Unit>, Object> function2 = this.$forEachDelta;
            final AnchoredDraggableNode<T> anchoredDraggableNode = this.this$0;
            Function1<DragEvent.DragDelta, Unit> function1 = new Function1<DragEvent.DragDelta, Unit>() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableNode$drag$2.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(DragEvent.DragDelta dragDelta) {
                    invoke2(dragDelta);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(DragEvent.DragDelta dragDelta) {
                    OverscrollEffect overscrollEffect;
                    OverscrollEffect overscrollEffect2;
                    long m377reverseIfNeededMKHz9U;
                    AnchoredDraggableState anchoredDraggableState;
                    long m377reverseIfNeededMKHz9U2;
                    float m379toFloatk4lQ0M;
                    overscrollEffect = ((AnchoredDraggableNode) anchoredDraggableNode).overscrollEffect;
                    if (overscrollEffect != null) {
                        overscrollEffect2 = ((AnchoredDraggableNode) anchoredDraggableNode).overscrollEffect;
                        Intrinsics.checkNotNull(overscrollEffect2);
                        m377reverseIfNeededMKHz9U = anchoredDraggableNode.m377reverseIfNeededMKHz9U(dragDelta.getDelta());
                        int m4918getUserInputWNlRxjI = NestedScrollSource.INSTANCE.m4918getUserInputWNlRxjI();
                        final AnchoredDraggableNode<T> anchoredDraggableNode2 = anchoredDraggableNode;
                        final AnchoredDragScope anchoredDragScope2 = anchoredDragScope;
                        overscrollEffect2.mo210applyToScrollRhakbz0(m377reverseIfNeededMKHz9U, m4918getUserInputWNlRxjI, new Function1<Offset, Offset>() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableNode.drag.2.1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Offset invoke(Offset offset) {
                                return Offset.m3571boximpl(m384invokeMKHz9U(offset.getPackedValue()));
                            }

                            /* renamed from: invoke-MK-Hz9U, reason: not valid java name */
                            public final long m384invokeMKHz9U(long j) {
                                AnchoredDraggableState anchoredDraggableState2;
                                float m379toFloatk4lQ0M2;
                                AnchoredDraggableState anchoredDraggableState3;
                                long m380toOffsettuRUvjQ;
                                anchoredDraggableState2 = ((AnchoredDraggableNode) anchoredDraggableNode2).state;
                                m379toFloatk4lQ0M2 = anchoredDraggableNode2.m379toFloatk4lQ0M(j);
                                float newOffsetForDelta$foundation_release = anchoredDraggableState2.newOffsetForDelta$foundation_release(m379toFloatk4lQ0M2);
                                AnchoredDraggableNode<T> anchoredDraggableNode3 = anchoredDraggableNode2;
                                anchoredDraggableState3 = ((AnchoredDraggableNode) anchoredDraggableNode3).state;
                                m380toOffsettuRUvjQ = anchoredDraggableNode3.m380toOffsettuRUvjQ(newOffsetForDelta$foundation_release - anchoredDraggableState3.requireOffset());
                                AnchoredDragScope.dragTo$default(anchoredDragScope2, newOffsetForDelta$foundation_release, 0.0f, 2, null);
                                return m380toOffsettuRUvjQ;
                            }
                        });
                        return;
                    }
                    AnchoredDragScope anchoredDragScope3 = anchoredDragScope;
                    anchoredDraggableState = ((AnchoredDraggableNode) anchoredDraggableNode).state;
                    AnchoredDraggableNode<T> anchoredDraggableNode3 = anchoredDraggableNode;
                    m377reverseIfNeededMKHz9U2 = anchoredDraggableNode3.m377reverseIfNeededMKHz9U(dragDelta.getDelta());
                    m379toFloatk4lQ0M = anchoredDraggableNode3.m379toFloatk4lQ0M(m377reverseIfNeededMKHz9U2);
                    AnchoredDragScope.dragTo$default(anchoredDragScope3, anchoredDraggableState.newOffsetForDelta$foundation_release(m379toFloatk4lQ0M), 0.0f, 2, null);
                }
            };
            this.label = 1;
            if (function2.invoke(function1, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
