package androidx.compose.ui.input.pointer;

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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: PointerInteropFilter.android.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/PointerInputScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.ui.input.pointer.PointerInteropFilter_androidKt$motionEventSpy$1", f = "PointerInteropFilter.android.kt", l = {343}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class PointerInteropFilter_androidKt$motionEventSpy$1 extends SuspendLambda implements Function2 {
    final /* synthetic */ Function1 $watcher;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PointerInteropFilter_androidKt$motionEventSpy$1(Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.$watcher = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
        PointerInteropFilter_androidKt$motionEventSpy$1 pointerInteropFilter_androidKt$motionEventSpy$1 = new PointerInteropFilter_androidKt$motionEventSpy$1(this.$watcher, continuation);
        pointerInteropFilter_androidKt$motionEventSpy$1.L$0 = obj;
        return pointerInteropFilter_androidKt$motionEventSpy$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull PointerInputScope pointerInputScope, @Nullable Continuation continuation) {
        return ((PointerInteropFilter_androidKt$motionEventSpy$1) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
            pointerInputScope.setInterceptOutOfBoundsChildEvents(true);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$watcher, null);
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

    /* compiled from: PointerInteropFilter.android.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.ui.input.pointer.PointerInteropFilter_androidKt$motionEventSpy$1$1", f = "PointerInteropFilter.android.kt", l = {345}, m = "invokeSuspend")
    /* renamed from: androidx.compose.ui.input.pointer.PointerInteropFilter_androidKt$motionEventSpy$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends RestrictedSuspendLambda implements Function2 {
        final /* synthetic */ Function1 $watcher;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Function1 function1, Continuation continuation) {
            super(2, continuation);
            this.$watcher = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$watcher, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull AwaitPointerEventScope awaitPointerEventScope, @Nullable Continuation continuation) {
            return ((AnonymousClass1) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        /* JADX WARN: Removed duplicated region for block: B:11:0x0038  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x002f A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x002d -> B:5:0x0030). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r4.label
                r2 = 1
                if (r1 == 0) goto L1b
                if (r1 != r2) goto L13
                java.lang.Object r1 = r4.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
                kotlin.ResultKt.throwOnFailure(r5)
                goto L30
            L13:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1b:
                kotlin.ResultKt.throwOnFailure(r5)
                java.lang.Object r5 = r4.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r5 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r5
                r1 = r5
            L23:
                androidx.compose.ui.input.pointer.PointerEventPass r5 = androidx.compose.ui.input.pointer.PointerEventPass.Initial
                r4.L$0 = r1
                r4.label = r2
                java.lang.Object r5 = r1.awaitPointerEvent(r5, r4)
                if (r5 != r0) goto L30
                return r0
            L30:
                androidx.compose.ui.input.pointer.PointerEvent r5 = (androidx.compose.ui.input.pointer.PointerEvent) r5
                android.view.MotionEvent r5 = r5.getMotionEvent$ui_release()
                if (r5 == 0) goto L23
                kotlin.jvm.functions.Function1 r3 = r4.$watcher
                r3.invoke(r5)
                goto L23
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.pointer.PointerInteropFilter_androidKt$motionEventSpy$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }
}
