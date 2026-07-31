package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TextSelectionMouseDetector.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/PointerInputScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt$mouseSelectionDetector$2", f = "TextSelectionMouseDetector.kt", l = {87}, m = "invokeSuspend")
/* loaded from: classes9.dex */
final class TextSelectionMouseDetectorKt$mouseSelectionDetector$2 extends SuspendLambda implements Function2 {
    final /* synthetic */ MouseSelectionObserver $observer;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TextSelectionMouseDetectorKt$mouseSelectionDetector$2(MouseSelectionObserver mouseSelectionObserver, Continuation continuation) {
        super(2, continuation);
        this.$observer = mouseSelectionObserver;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
        TextSelectionMouseDetectorKt$mouseSelectionDetector$2 textSelectionMouseDetectorKt$mouseSelectionDetector$2 = new TextSelectionMouseDetectorKt$mouseSelectionDetector$2(this.$observer, continuation);
        textSelectionMouseDetectorKt$mouseSelectionDetector$2.L$0 = obj;
        return textSelectionMouseDetectorKt$mouseSelectionDetector$2;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull PointerInputScope pointerInputScope, @Nullable Continuation continuation) {
        return ((TextSelectionMouseDetectorKt$mouseSelectionDetector$2) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* compiled from: TextSelectionMouseDetector.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt$mouseSelectionDetector$2$1", f = "TextSelectionMouseDetector.kt", l = {90, 97, 112}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt$mouseSelectionDetector$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends RestrictedSuspendLambda implements Function2 {
        final /* synthetic */ MouseSelectionObserver $observer;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(MouseSelectionObserver mouseSelectionObserver, Continuation continuation) {
            super(2, continuation);
            this.$observer = mouseSelectionObserver;
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

        /* JADX WARN: Removed duplicated region for block: B:13:0x004f A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0050  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0069  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0090  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0073 -> B:10:0x00d3). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x008d -> B:10:0x00d3). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00b6 -> B:10:0x00d3). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00d0 -> B:10:0x00d3). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) {
            AwaitPointerEventScope awaitPointerEventScope;
            ClicksCounter clicksCounter;
            AwaitPointerEventScope awaitPointerEventScope2;
            PointerEvent pointerEvent;
            final SelectionAdjustment none;
            Object awaitMouseEventDown;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                clicksCounter = new ClicksCounter(awaitPointerEventScope.getViewConfiguration());
                this.L$0 = awaitPointerEventScope;
                this.L$1 = clicksCounter;
                this.label = 1;
                awaitMouseEventDown = TextSelectionMouseDetectorKt.awaitMouseEventDown(awaitPointerEventScope, this);
                if (awaitMouseEventDown != coroutine_suspended) {
                }
            } else if (i == 1) {
                clicksCounter = (ClicksCounter) this.L$1;
                awaitPointerEventScope2 = (AwaitPointerEventScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                pointerEvent = (PointerEvent) obj;
                clicksCounter.update(pointerEvent);
                PointerInputChange pointerInputChange = (PointerInputChange) pointerEvent.getChanges().get(0);
                if (TextFieldSelectionManager_androidKt.isShiftPressed(pointerEvent)) {
                }
                awaitPointerEventScope = awaitPointerEventScope2;
                this.L$0 = awaitPointerEventScope;
                this.L$1 = clicksCounter;
                this.label = 1;
                awaitMouseEventDown = TextSelectionMouseDetectorKt.awaitMouseEventDown(awaitPointerEventScope, this);
                if (awaitMouseEventDown != coroutine_suspended) {
                }
            } else if (i == 2 || i == 3) {
                clicksCounter = (ClicksCounter) this.L$1;
                awaitPointerEventScope2 = (AwaitPointerEventScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                awaitPointerEventScope = awaitPointerEventScope2;
                this.L$0 = awaitPointerEventScope;
                this.L$1 = clicksCounter;
                this.label = 1;
                awaitMouseEventDown = TextSelectionMouseDetectorKt.awaitMouseEventDown(awaitPointerEventScope, this);
                if (awaitMouseEventDown != coroutine_suspended) {
                    return coroutine_suspended;
                }
                awaitPointerEventScope2 = awaitPointerEventScope;
                obj = awaitMouseEventDown;
                pointerEvent = (PointerEvent) obj;
                clicksCounter.update(pointerEvent);
                PointerInputChange pointerInputChange2 = (PointerInputChange) pointerEvent.getChanges().get(0);
                if (TextFieldSelectionManager_androidKt.isShiftPressed(pointerEvent)) {
                    if (this.$observer.mo573onExtendk4lQ0M(pointerInputChange2.getPosition())) {
                        pointerInputChange2.consume();
                        long id = pointerInputChange2.getId();
                        final MouseSelectionObserver mouseSelectionObserver = this.$observer;
                        Function1 function1 = new Function1() { // from class: androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt.mouseSelectionDetector.2.1.1
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                invoke((PointerInputChange) obj2);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull PointerInputChange it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                if (MouseSelectionObserver.this.mo574onExtendDragk4lQ0M(it.getPosition())) {
                                    it.consume();
                                }
                            }
                        };
                        this.L$0 = awaitPointerEventScope2;
                        this.L$1 = clicksCounter;
                        this.label = 2;
                        if (DragGestureDetectorKt.m237dragjO51t88(awaitPointerEventScope2, id, function1, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                } else {
                    int clicks = clicksCounter.getClicks();
                    if (clicks == 1) {
                        none = SelectionAdjustment.INSTANCE.getNone();
                    } else if (clicks == 2) {
                        none = SelectionAdjustment.INSTANCE.getWord();
                    } else {
                        none = SelectionAdjustment.INSTANCE.getParagraph();
                    }
                    if (this.$observer.mo575onStart3MmeM6k(pointerInputChange2.getPosition(), none)) {
                        pointerInputChange2.consume();
                        long id2 = pointerInputChange2.getId();
                        final MouseSelectionObserver mouseSelectionObserver2 = this.$observer;
                        Function1 function12 = new Function1() { // from class: androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt.mouseSelectionDetector.2.1.2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                invoke((PointerInputChange) obj2);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull PointerInputChange it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                if (MouseSelectionObserver.this.mo572onDrag3MmeM6k(it.getPosition(), none)) {
                                    it.consume();
                                }
                            }
                        };
                        this.L$0 = awaitPointerEventScope2;
                        this.L$1 = clicksCounter;
                        this.label = 3;
                        if (DragGestureDetectorKt.m237dragjO51t88(awaitPointerEventScope2, id2, function12, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                }
                awaitPointerEventScope = awaitPointerEventScope2;
                this.L$0 = awaitPointerEventScope;
                this.L$1 = clicksCounter;
                this.label = 1;
                awaitMouseEventDown = TextSelectionMouseDetectorKt.awaitMouseEventDown(awaitPointerEventScope, this);
                if (awaitMouseEventDown != coroutine_suspended) {
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
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
