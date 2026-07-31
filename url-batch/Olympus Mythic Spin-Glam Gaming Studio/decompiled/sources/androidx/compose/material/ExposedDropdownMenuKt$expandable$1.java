package androidx.compose.material;

import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerEventPass;
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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ExposedDropdownMenu.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/PointerInputScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.material.ExposedDropdownMenuKt$expandable$1", f = "ExposedDropdownMenu.kt", l = {516}, m = "invokeSuspend")
/* loaded from: classes9.dex */
final class ExposedDropdownMenuKt$expandable$1 extends SuspendLambda implements Function2 {
    final /* synthetic */ Function0 $onExpandedChange;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ExposedDropdownMenuKt$expandable$1(Function0 function0, Continuation continuation) {
        super(2, continuation);
        this.$onExpandedChange = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
        ExposedDropdownMenuKt$expandable$1 exposedDropdownMenuKt$expandable$1 = new ExposedDropdownMenuKt$expandable$1(this.$onExpandedChange, continuation);
        exposedDropdownMenuKt$expandable$1.L$0 = obj;
        return exposedDropdownMenuKt$expandable$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull PointerInputScope pointerInputScope, @Nullable Continuation continuation) {
        return ((ExposedDropdownMenuKt$expandable$1) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* compiled from: ExposedDropdownMenu.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/PointerInputScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.material.ExposedDropdownMenuKt$expandable$1$1", f = "ExposedDropdownMenu.kt", l = {517}, m = "invokeSuspend")
    /* renamed from: androidx.compose.material.ExposedDropdownMenuKt$expandable$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2 {
        final /* synthetic */ Function0 $onExpandedChange;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Function0 function0, Continuation continuation) {
            super(2, continuation);
            this.$onExpandedChange = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$onExpandedChange, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull PointerInputScope pointerInputScope, @Nullable Continuation continuation) {
            return ((AnonymousClass1) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: ExposedDropdownMenu.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
        @DebugMetadata(c = "androidx.compose.material.ExposedDropdownMenuKt$expandable$1$1$1", f = "ExposedDropdownMenu.kt", l = {518}, m = "invokeSuspend")
        /* renamed from: androidx.compose.material.ExposedDropdownMenuKt$expandable$1$1$1, reason: invalid class name and collision with other inner class name */
        static final class C00361 extends SuspendLambda implements Function2 {
            final /* synthetic */ PointerInputScope $$this$forEachGesture;
            final /* synthetic */ Function0 $onExpandedChange;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C00361(PointerInputScope pointerInputScope, Function0 function0, Continuation continuation) {
                super(2, continuation);
                this.$$this$forEachGesture = pointerInputScope;
                this.$onExpandedChange = function0;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
                return new C00361(this.$$this$forEachGesture, this.$onExpandedChange, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
                return ((C00361) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: ExposedDropdownMenu.kt */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
            @DebugMetadata(c = "androidx.compose.material.ExposedDropdownMenuKt$expandable$1$1$1$1", f = "ExposedDropdownMenu.kt", l = {521}, m = "invokeSuspend")
            /* renamed from: androidx.compose.material.ExposedDropdownMenuKt$expandable$1$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C00371 extends RestrictedSuspendLambda implements Function2 {
                final /* synthetic */ Function0 $onExpandedChange;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C00371(Function0 function0, Continuation continuation) {
                    super(2, continuation);
                    this.$onExpandedChange = function0;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
                    C00371 c00371 = new C00371(this.$onExpandedChange, continuation);
                    c00371.L$0 = obj;
                    return c00371;
                }

                @Override // kotlin.jvm.functions.Function2
                @Nullable
                public final Object invoke(@NotNull AwaitPointerEventScope awaitPointerEventScope, @Nullable Continuation continuation) {
                    return ((C00371) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* JADX WARN: Removed duplicated region for block: B:13:0x002f A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:7:0x003d  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x002d -> B:5:0x0030). Please report as a decompilation issue!!! */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(@NotNull Object obj) {
                    AwaitPointerEventScope awaitPointerEventScope;
                    int size;
                    int i;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = this.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj);
                        awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                        PointerEventPass pointerEventPass = PointerEventPass.Initial;
                        this.L$0 = awaitPointerEventScope;
                        this.label = 1;
                        obj = awaitPointerEventScope.awaitPointerEvent(pointerEventPass, this);
                        if (obj == coroutine_suspended) {
                        }
                        List changes = ((PointerEvent) obj).getChanges();
                        size = changes.size();
                        i = 0;
                        while (i < size) {
                        }
                        this.$onExpandedChange.mo4828invoke();
                        return Unit.INSTANCE;
                    }
                    if (i2 == 1) {
                        awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        List changes2 = ((PointerEvent) obj).getChanges();
                        size = changes2.size();
                        i = 0;
                        while (i < size) {
                            if (PointerEventKt.changedToUp((PointerInputChange) changes2.get(i))) {
                                i++;
                            } else {
                                PointerEventPass pointerEventPass2 = PointerEventPass.Initial;
                                this.L$0 = awaitPointerEventScope;
                                this.label = 1;
                                obj = awaitPointerEventScope.awaitPointerEvent(pointerEventPass2, this);
                                if (obj == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                List changes22 = ((PointerEvent) obj).getChanges();
                                size = changes22.size();
                                i = 0;
                                while (i < size) {
                                }
                            }
                        }
                        this.$onExpandedChange.mo4828invoke();
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    PointerInputScope pointerInputScope = this.$$this$forEachGesture;
                    C00371 c00371 = new C00371(this.$onExpandedChange, null);
                    this.label = 1;
                    if (pointerInputScope.awaitPointerEventScope(c00371, this) == coroutine_suspended) {
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

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C00361 c00361 = new C00361((PointerInputScope) this.L$0, this.$onExpandedChange, null);
                this.label = 1;
                if (CoroutineScopeKt.coroutineScope(c00361, this) == coroutine_suspended) {
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

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$onExpandedChange, null);
            this.label = 1;
            if (ForEachGestureKt.forEachGesture(pointerInputScope, anonymousClass1, this) == coroutine_suspended) {
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
