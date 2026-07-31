package androidx.compose.foundation.gestures;

import androidx.compose.runtime.State;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputScope;
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

/* compiled from: Scrollable.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/PointerInputScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollableKt$mouseWheelScroll$1", f = "Scrollable.kt", l = {271}, m = "invokeSuspend")
/* loaded from: classes9.dex */
final class ScrollableKt$mouseWheelScroll$1 extends SuspendLambda implements Function2 {
    final /* synthetic */ ScrollConfig $mouseWheelScrollConfig;
    final /* synthetic */ State<ScrollingLogic> $scrollingLogicState;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ScrollableKt$mouseWheelScroll$1(ScrollConfig scrollConfig, State<ScrollingLogic> state, Continuation continuation) {
        super(2, continuation);
        this.$mouseWheelScrollConfig = scrollConfig;
        this.$scrollingLogicState = state;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
        ScrollableKt$mouseWheelScroll$1 scrollableKt$mouseWheelScroll$1 = new ScrollableKt$mouseWheelScroll$1(this.$mouseWheelScrollConfig, this.$scrollingLogicState, continuation);
        scrollableKt$mouseWheelScroll$1.L$0 = obj;
        return scrollableKt$mouseWheelScroll$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull PointerInputScope pointerInputScope, @Nullable Continuation continuation) {
        return ((ScrollableKt$mouseWheelScroll$1) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* compiled from: Scrollable.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollableKt$mouseWheelScroll$1$1", f = "Scrollable.kt", l = {273}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.ScrollableKt$mouseWheelScroll$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends RestrictedSuspendLambda implements Function2 {
        final /* synthetic */ ScrollConfig $mouseWheelScrollConfig;
        final /* synthetic */ State<ScrollingLogic> $scrollingLogicState;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ScrollConfig scrollConfig, State<ScrollingLogic> state, Continuation continuation) {
            super(2, continuation);
            this.$mouseWheelScrollConfig = scrollConfig;
            this.$scrollingLogicState = state;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$mouseWheelScrollConfig, this.$scrollingLogicState, continuation);
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
        /* JADX WARN: Removed duplicated region for block: B:13:0x002d A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x004c A[EDGE_INSN: B:15:0x004c->B:16:0x004c BREAK  A[LOOP:0: B:6:0x003a->B:9:0x0049], SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:7:0x003c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x002b -> B:5:0x002e). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r8.label
                r2 = 1
                if (r1 == 0) goto L1b
                if (r1 != r2) goto L13
                java.lang.Object r1 = r8.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
                kotlin.ResultKt.throwOnFailure(r9)
                goto L2e
            L13:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L1b:
                kotlin.ResultKt.throwOnFailure(r9)
                java.lang.Object r9 = r8.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r9 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r9
                r1 = r9
            L23:
                r8.L$0 = r1
                r8.label = r2
                java.lang.Object r9 = androidx.compose.foundation.gestures.ScrollableKt.access$awaitScrollEvent(r1, r8)
                if (r9 != r0) goto L2e
                return r0
            L2e:
                androidx.compose.ui.input.pointer.PointerEvent r9 = (androidx.compose.ui.input.pointer.PointerEvent) r9
                java.util.List r3 = r9.getChanges()
                int r4 = r3.size()
                r5 = 0
                r6 = r5
            L3a:
                if (r6 >= r4) goto L4c
                java.lang.Object r7 = r3.get(r6)
                androidx.compose.ui.input.pointer.PointerInputChange r7 = (androidx.compose.ui.input.pointer.PointerInputChange) r7
                boolean r7 = r7.isConsumed()
                if (r7 == 0) goto L49
                goto L23
            L49:
                int r6 = r6 + 1
                goto L3a
            L4c:
                androidx.compose.foundation.gestures.ScrollConfig r3 = r8.$mouseWheelScrollConfig
                androidx.compose.runtime.State<androidx.compose.foundation.gestures.ScrollingLogic> r4 = r8.$scrollingLogicState
                long r6 = r1.mo1834getSizeYbymL2g()
                long r6 = r3.mo221calculateMouseWheelScroll8xgXZGE(r1, r9, r6)
                java.lang.Object r3 = r4.getValue()
                androidx.compose.foundation.gestures.ScrollingLogic r3 = (androidx.compose.foundation.gestures.ScrollingLogic) r3
                float r4 = r3.m283toFloatk4lQ0M(r6)
                float r4 = r3.reverseIfNeeded(r4)
                androidx.compose.foundation.gestures.ScrollableState r3 = r3.getScrollableState()
                float r3 = r3.dispatchRawDelta(r4)
                r4 = 0
                int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
                if (r3 != 0) goto L74
                goto L23
            L74:
                java.util.List r9 = r9.getChanges()
                int r3 = r9.size()
            L7c:
                if (r5 >= r3) goto L23
                java.lang.Object r4 = r9.get(r5)
                androidx.compose.ui.input.pointer.PointerInputChange r4 = (androidx.compose.ui.input.pointer.PointerInputChange) r4
                r4.consume()
                int r5 = r5 + 1
                goto L7c
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollableKt$mouseWheelScroll$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
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
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$mouseWheelScrollConfig, this.$scrollingLogicState, null);
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
