package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerId;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: LongPressTextDragObserver.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/PointerInputScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2", f = "LongPressTextDragObserver.kt", l = {98}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2 extends SuspendLambda implements Function2 {
    final /* synthetic */ TextDragObserver $observer;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2(TextDragObserver textDragObserver, Continuation continuation) {
        super(2, continuation);
        this.$observer = textDragObserver;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
        LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2 longPressTextDragObserverKt$detectPreDragGesturesWithObserver$2 = new LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2(this.$observer, continuation);
        longPressTextDragObserverKt$detectPreDragGesturesWithObserver$2.L$0 = obj;
        return longPressTextDragObserverKt$detectPreDragGesturesWithObserver$2;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull PointerInputScope pointerInputScope, @Nullable Continuation continuation) {
        return ((LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* compiled from: LongPressTextDragObserver.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2$1", f = "LongPressTextDragObserver.kt", l = {99, 103}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.text.LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends RestrictedSuspendLambda implements Function2 {
        final /* synthetic */ TextDragObserver $observer;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(TextDragObserver textDragObserver, Continuation continuation) {
            super(2, continuation);
            this.$observer = textDragObserver;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$observer, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull AwaitPointerEventScope awaitPointerEventScope, @Nullable Continuation continuation) {
            return ((AnonymousClass1) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0058 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0066  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0056 -> B:6:0x0059). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) {
            AwaitPointerEventScope awaitPointerEventScope;
            AwaitPointerEventScope awaitPointerEventScope2;
            PointerInputChange pointerInputChange;
            int size;
            int i;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                this.L$0 = awaitPointerEventScope;
                this.label = 1;
                obj = TapGestureDetectorKt.awaitFirstDown$default(awaitPointerEventScope, false, this, 1, null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    pointerInputChange = (PointerInputChange) this.L$1;
                    awaitPointerEventScope2 = (AwaitPointerEventScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    List changes = ((PointerEvent) obj).getChanges();
                    size = changes.size();
                    i = 0;
                    while (i < size) {
                        PointerInputChange pointerInputChange2 = (PointerInputChange) changes.get(i);
                        if (PointerId.m1868equalsimpl0(pointerInputChange2.getId(), pointerInputChange.getId()) && pointerInputChange2.getPressed()) {
                            this.L$0 = awaitPointerEventScope2;
                            this.L$1 = pointerInputChange;
                            this.label = 2;
                            obj = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, null, this, 1, null);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            List changes2 = ((PointerEvent) obj).getChanges();
                            size = changes2.size();
                            i = 0;
                            while (i < size) {
                            }
                        } else {
                            i++;
                        }
                    }
                    this.$observer.onUp();
                    return Unit.INSTANCE;
                }
                awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            PointerInputChange pointerInputChange3 = (PointerInputChange) obj;
            this.$observer.mo569onDownk4lQ0M(pointerInputChange3.getPosition());
            awaitPointerEventScope2 = awaitPointerEventScope;
            pointerInputChange = pointerInputChange3;
            this.L$0 = awaitPointerEventScope2;
            this.L$1 = pointerInputChange;
            this.label = 2;
            obj = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, null, this, 1, null);
            if (obj == coroutine_suspended) {
            }
            List changes22 = ((PointerEvent) obj).getChanges();
            size = changes22.size();
            i = 0;
            while (i < size) {
            }
            this.$observer.onUp();
            return Unit.INSTANCE;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$observer, null);
            this.label = 1;
            if (pointerInputScope.awaitPointerEventScope(anonymousClass1, this) == coroutine_suspended) {
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
