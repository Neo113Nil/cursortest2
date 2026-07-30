package androidx.compose.foundation.text.handwriting;

import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerId;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.PointerType;
import androidx.compose.ui.unit.IntSize;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* compiled from: StylusHandwriting.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/PointerInputScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.text.handwriting.StylusHandwritingNode$suspendingPointerInputModifierNode$1", f = "StylusHandwriting.kt", i = {}, l = {132}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
final class StylusHandwritingNode$suspendingPointerInputModifierNode$1 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ StylusHandwritingNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StylusHandwritingNode$suspendingPointerInputModifierNode$1(StylusHandwritingNode stylusHandwritingNode, Continuation<? super StylusHandwritingNode$suspendingPointerInputModifierNode$1> continuation) {
        super(2, continuation);
        this.this$0 = stylusHandwritingNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        StylusHandwritingNode$suspendingPointerInputModifierNode$1 stylusHandwritingNode$suspendingPointerInputModifierNode$1 = new StylusHandwritingNode$suspendingPointerInputModifierNode$1(this.this$0, continuation);
        stylusHandwritingNode$suspendingPointerInputModifierNode$1.L$0 = obj;
        return stylusHandwritingNode$suspendingPointerInputModifierNode$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
        return ((StylusHandwritingNode$suspendingPointerInputModifierNode$1) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* compiled from: StylusHandwriting.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.text.handwriting.StylusHandwritingNode$suspendingPointerInputModifierNode$1$1", f = "StylusHandwriting.kt", i = {0, 1, 1, 1, 2, 2}, l = {134, 158, 186}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "$this$awaitEachGesture", "firstDown", "pass", "$this$awaitEachGesture", "firstDown"}, s = {"L$0", "L$0", "L$1", "L$2", "L$0", "L$1"})
    /* renamed from: androidx.compose.foundation.text.handwriting.StylusHandwritingNode$suspendingPointerInputModifierNode$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ StylusHandwritingNode this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(StylusHandwritingNode stylusHandwritingNode, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = stylusHandwritingNode;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x01d6  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x01d9  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x019e A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:29:0x01d1 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0102  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x013c  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x0170  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x01e0  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x00f4 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:66:0x0134 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x01ac  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x019c -> B:7:0x019f). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x00f2 -> B:29:0x00f5). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            AwaitPointerEventScope awaitPointerEventScope;
            Object awaitFirstDown;
            boolean z;
            PointerInputChange pointerInputChange;
            AwaitPointerEventScope awaitPointerEventScope2;
            PointerEventPass pointerEventPass;
            PointerInputChange pointerInputChange2;
            Object awaitPointerEvent;
            List<PointerInputChange> changes;
            int size;
            int i;
            PointerInputChange pointerInputChange3;
            PointerInputChange pointerInputChange4;
            PointerInputChange pointerInputChange5;
            PointerInputChange pointerInputChange6;
            PointerInputChange pointerInputChange7;
            AwaitPointerEventScope awaitPointerEventScope3;
            List<PointerInputChange> list;
            Object awaitPointerEvent2;
            int size2;
            int i2;
            PointerInputChange pointerInputChange8;
            PointerInputChange pointerInputChange9;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i3 = this.label;
            int i4 = 2;
            if (i3 == 0) {
                ResultKt.throwOnFailure(obj);
                awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                this.L$0 = awaitPointerEventScope;
                this.label = 1;
                awaitFirstDown = TapGestureDetectorKt.awaitFirstDown(awaitPointerEventScope, true, PointerEventPass.Initial, this);
                if (awaitFirstDown == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i3 == 1) {
                awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                awaitFirstDown = obj;
            } else if (i3 == 2) {
                pointerEventPass = (PointerEventPass) this.L$2;
                pointerInputChange2 = (PointerInputChange) this.L$1;
                awaitPointerEventScope2 = (AwaitPointerEventScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                awaitPointerEvent = obj;
                pointerInputChange = null;
                changes = ((PointerEvent) awaitPointerEvent).getChanges();
                size = changes.size();
                i = 0;
                while (true) {
                    if (i >= size) {
                        pointerInputChange3 = pointerInputChange;
                        pointerInputChange4 = null;
                        break;
                    }
                    pointerInputChange4 = changes.get(i);
                    PointerInputChange pointerInputChange10 = pointerInputChange4;
                    if (!pointerInputChange10.isConsumed()) {
                        pointerInputChange3 = pointerInputChange;
                        list = changes;
                        if (PointerId.m5028equalsimpl0(pointerInputChange10.getId(), pointerInputChange2.getId()) && pointerInputChange10.getPressed()) {
                            break;
                        }
                    } else {
                        pointerInputChange3 = pointerInputChange;
                        list = changes;
                    }
                    i++;
                    pointerInputChange = pointerInputChange3;
                    changes = list;
                }
                pointerInputChange5 = pointerInputChange4;
                if (pointerInputChange5 == null || pointerInputChange5.getUptimeMillis() - pointerInputChange2.getUptimeMillis() >= awaitPointerEventScope2.getViewConfiguration().getLongPressTimeoutMillis()) {
                    pointerInputChange6 = pointerInputChange3;
                } else if (Offset.m3597getDistanceimpl(Offset.m3603minusMKHz9U(pointerInputChange5.getPosition(), pointerInputChange2.getPosition())) <= awaitPointerEventScope2.getViewConfiguration().getHandwritingSlop()) {
                    pointerInputChange6 = pointerInputChange5;
                } else {
                    pointerInputChange = pointerInputChange3;
                    i4 = 2;
                    this.L$0 = awaitPointerEventScope2;
                    this.L$1 = pointerInputChange2;
                    this.L$2 = pointerEventPass;
                    this.label = i4;
                    awaitPointerEvent = awaitPointerEventScope2.awaitPointerEvent(pointerEventPass, this);
                    if (awaitPointerEvent == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    changes = ((PointerEvent) awaitPointerEvent).getChanges();
                    size = changes.size();
                    i = 0;
                    while (true) {
                        if (i >= size) {
                        }
                        i++;
                        pointerInputChange = pointerInputChange3;
                        changes = list;
                    }
                    pointerInputChange5 = pointerInputChange4;
                    if (pointerInputChange5 == null) {
                        if (Offset.m3597getDistanceimpl(Offset.m3603minusMKHz9U(pointerInputChange5.getPosition(), pointerInputChange2.getPosition())) <= awaitPointerEventScope2.getViewConfiguration().getHandwritingSlop()) {
                        }
                    }
                    pointerInputChange6 = pointerInputChange3;
                }
                if (pointerInputChange6 != null || !this.this$0.getOnHandwritingSlopExceeded().invoke().booleanValue()) {
                    return Unit.INSTANCE;
                }
                pointerInputChange6.consume();
                pointerInputChange7 = pointerInputChange2;
                awaitPointerEventScope3 = awaitPointerEventScope2;
                this.L$0 = awaitPointerEventScope3;
                this.L$1 = pointerInputChange7;
                this.L$2 = null;
                this.label = 3;
                awaitPointerEvent2 = awaitPointerEventScope3.awaitPointerEvent(PointerEventPass.Initial, this);
                if (awaitPointerEvent2 == coroutine_suspended) {
                }
                List<PointerInputChange> changes2 = ((PointerEvent) awaitPointerEvent2).getChanges();
                size2 = changes2.size();
                i2 = 0;
                while (true) {
                    if (i2 >= size2) {
                    }
                    i2++;
                }
                pointerInputChange9 = pointerInputChange8;
                if (pointerInputChange9 == null) {
                }
            } else {
                if (i3 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pointerInputChange7 = (PointerInputChange) this.L$1;
                awaitPointerEventScope3 = (AwaitPointerEventScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                awaitPointerEvent2 = obj;
                List<PointerInputChange> changes22 = ((PointerEvent) awaitPointerEvent2).getChanges();
                size2 = changes22.size();
                i2 = 0;
                while (true) {
                    if (i2 >= size2) {
                        pointerInputChange8 = null;
                        break;
                    }
                    pointerInputChange8 = changes22.get(i2);
                    PointerInputChange pointerInputChange11 = pointerInputChange8;
                    if (!pointerInputChange11.isConsumed() && PointerId.m5028equalsimpl0(pointerInputChange11.getId(), pointerInputChange7.getId()) && pointerInputChange11.getPressed()) {
                        break;
                    }
                    i2++;
                }
                pointerInputChange9 = pointerInputChange8;
                if (pointerInputChange9 == null) {
                    return Unit.INSTANCE;
                }
                pointerInputChange9.consume();
                this.L$0 = awaitPointerEventScope3;
                this.L$1 = pointerInputChange7;
                this.L$2 = null;
                this.label = 3;
                awaitPointerEvent2 = awaitPointerEventScope3.awaitPointerEvent(PointerEventPass.Initial, this);
                if (awaitPointerEvent2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                List<PointerInputChange> changes222 = ((PointerEvent) awaitPointerEvent2).getChanges();
                size2 = changes222.size();
                i2 = 0;
                while (true) {
                    if (i2 >= size2) {
                    }
                    i2++;
                }
                pointerInputChange9 = pointerInputChange8;
                if (pointerInputChange9 == null) {
                }
            }
            PointerInputChange pointerInputChange12 = (PointerInputChange) awaitFirstDown;
            if (!PointerType.m5118equalsimpl0(pointerInputChange12.getType(), PointerType.INSTANCE.m5124getStylusT8wyACA()) && !PointerType.m5118equalsimpl0(pointerInputChange12.getType(), PointerType.INSTANCE.m5122getEraserT8wyACA())) {
                return Unit.INSTANCE;
            }
            boolean z2 = Offset.m3599getXimpl(pointerInputChange12.getPosition()) >= 0.0f && Offset.m3599getXimpl(pointerInputChange12.getPosition()) < ((float) IntSize.m6469getWidthimpl(awaitPointerEventScope.mo4957getSizeYbymL2g())) && Offset.m3600getYimpl(pointerInputChange12.getPosition()) >= 0.0f && Offset.m3600getYimpl(pointerInputChange12.getPosition()) < ((float) IntSize.m6468getHeightimpl(awaitPointerEventScope.mo4957getSizeYbymL2g()));
            z = this.this$0.focused;
            PointerEventPass pointerEventPass2 = (z || z2) ? PointerEventPass.Initial : PointerEventPass.Main;
            pointerInputChange = null;
            awaitPointerEventScope2 = awaitPointerEventScope;
            pointerEventPass = pointerEventPass2;
            pointerInputChange2 = pointerInputChange12;
            this.L$0 = awaitPointerEventScope2;
            this.L$1 = pointerInputChange2;
            this.L$2 = pointerEventPass;
            this.label = i4;
            awaitPointerEvent = awaitPointerEventScope2.awaitPointerEvent(pointerEventPass, this);
            if (awaitPointerEvent == coroutine_suspended) {
            }
            changes = ((PointerEvent) awaitPointerEvent).getChanges();
            size = changes.size();
            i = 0;
            while (true) {
                if (i >= size) {
                }
                i++;
                pointerInputChange = pointerInputChange3;
                changes = list;
            }
            pointerInputChange5 = pointerInputChange4;
            if (pointerInputChange5 == null) {
            }
            pointerInputChange6 = pointerInputChange3;
            if (pointerInputChange6 != null) {
            }
            return Unit.INSTANCE;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            if (ForEachGestureKt.awaitEachGesture((PointerInputScope) this.L$0, new AnonymousClass1(this.this$0, null), this) == coroutine_suspended) {
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
