package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerEventPass;
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
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DragGestureDetector.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$2", f = "DragGestureDetector.kt", l = {755}, m = "invokeSuspend")
/* loaded from: classes9.dex */
final class DragGestureDetectorKt$awaitLongPressOrCancellation$2 extends SuspendLambda implements Function2 {
    final /* synthetic */ Ref$ObjectRef<PointerInputChange> $currentDown;
    final /* synthetic */ Ref$ObjectRef<PointerInputChange> $longPress;
    final /* synthetic */ PointerInputScope $this_awaitLongPressOrCancellation;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DragGestureDetectorKt$awaitLongPressOrCancellation$2(PointerInputScope pointerInputScope, Ref$ObjectRef<PointerInputChange> ref$ObjectRef, Ref$ObjectRef<PointerInputChange> ref$ObjectRef2, Continuation continuation) {
        super(2, continuation);
        this.$this_awaitLongPressOrCancellation = pointerInputScope;
        this.$currentDown = ref$ObjectRef;
        this.$longPress = ref$ObjectRef2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
        return new DragGestureDetectorKt$awaitLongPressOrCancellation$2(this.$this_awaitLongPressOrCancellation, this.$currentDown, this.$longPress, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
        return ((DragGestureDetectorKt$awaitLongPressOrCancellation$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* compiled from: DragGestureDetector.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$2$1", f = "DragGestureDetector.kt", l = {758, 775}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends RestrictedSuspendLambda implements Function2 {
        final /* synthetic */ Ref$ObjectRef<PointerInputChange> $currentDown;
        final /* synthetic */ Ref$ObjectRef<PointerInputChange> $longPress;
        int I$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Ref$ObjectRef<PointerInputChange> ref$ObjectRef, Ref$ObjectRef<PointerInputChange> ref$ObjectRef2, Continuation continuation) {
            super(2, continuation);
            this.$currentDown = ref$ObjectRef;
            this.$longPress = ref$ObjectRef2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$currentDown, this.$longPress, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull AwaitPointerEventScope awaitPointerEventScope, @Nullable Continuation continuation) {
            return ((AnonymousClass1) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:43:0x009a, code lost:
        
            r2 = r6;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:15:0x00dd  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0041  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x005f  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x007b  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x00ab A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:47:0x00ac  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x006f A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:52:0x0143  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x0112  */
        /* JADX WARN: Removed duplicated region for block: B:68:0x00cd A[EDGE_INSN: B:68:0x00cd->B:13:0x00cd BREAK  A[LOOP:0: B:7:0x00ba->B:10:0x00ca], SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:8:0x00bc  */
        /* JADX WARN: Type inference failed for: r11v6 */
        /* JADX WARN: Type inference failed for: r11v8, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r7v7, types: [T, androidx.compose.ui.input.pointer.PointerInputChange] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x00ac -> B:6:0x00af). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) {
            AwaitPointerEventScope awaitPointerEventScope;
            int i;
            Object obj2;
            int size;
            int i2;
            int size2;
            int i3;
            Object awaitPointerEvent;
            boolean m239isPointerUpDmW0f2w;
            Object obj3;
            T t;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i4 = this.label;
            Object obj4 = null;
            int i5 = 1;
            if (i4 == 0) {
                ResultKt.throwOnFailure(obj);
                awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                i = 0;
                if (i != 0) {
                }
            } else if (i4 == 1) {
                i = this.I$0;
                awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                obj2 = obj;
                PointerEvent pointerEvent = (PointerEvent) obj2;
                List changes = pointerEvent.getChanges();
                size = changes.size();
                i2 = 0;
                while (true) {
                    if (i2 >= size) {
                    }
                    i2++;
                }
                List changes2 = pointerEvent.getChanges();
                size2 = changes2.size();
                while (i3 < size2) {
                }
                PointerEventPass pointerEventPass = PointerEventPass.Final;
                this.L$0 = awaitPointerEventScope;
                this.L$1 = pointerEvent;
                this.I$0 = i;
                this.label = 2;
                awaitPointerEvent = awaitPointerEventScope.awaitPointerEvent(pointerEventPass, this);
                if (awaitPointerEvent != coroutine_suspended) {
                }
            } else {
                if (i4 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i = this.I$0;
                PointerEvent pointerEvent2 = (PointerEvent) this.L$1;
                AwaitPointerEventScope awaitPointerEventScope2 = (AwaitPointerEventScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                awaitPointerEvent = obj;
                List changes3 = ((PointerEvent) awaitPointerEvent).getChanges();
                int size3 = changes3.size();
                int i6 = 0;
                while (true) {
                    if (i6 >= size3) {
                        break;
                    }
                    if (((PointerInputChange) changes3.get(i6)).isConsumed()) {
                        i = i5;
                        break;
                    }
                    i6++;
                }
                m239isPointerUpDmW0f2w = DragGestureDetectorKt.m239isPointerUpDmW0f2w(pointerEvent2, this.$currentDown.element.getId());
                if (m239isPointerUpDmW0f2w) {
                    Ref$ObjectRef<PointerInputChange> ref$ObjectRef = this.$longPress;
                    List changes4 = pointerEvent2.getChanges();
                    Ref$ObjectRef<PointerInputChange> ref$ObjectRef2 = this.$currentDown;
                    int size4 = changes4.size();
                    int i7 = 0;
                    while (true) {
                        if (i7 >= size4) {
                            t = 0;
                            break;
                        }
                        t = changes4.get(i7);
                        Ref$ObjectRef<PointerInputChange> ref$ObjectRef3 = ref$ObjectRef2;
                        if (PointerId.m1868equalsimpl0(((PointerInputChange) t).getId(), ref$ObjectRef2.element.getId())) {
                            break;
                        }
                        i7++;
                        ref$ObjectRef2 = ref$ObjectRef3;
                    }
                    ref$ObjectRef.element = t;
                } else {
                    List changes5 = pointerEvent2.getChanges();
                    int size5 = changes5.size();
                    int i8 = 0;
                    while (true) {
                        if (i8 >= size5) {
                            obj3 = null;
                            break;
                        }
                        obj3 = changes5.get(i8);
                        if (((PointerInputChange) obj3).getPressed()) {
                            break;
                        }
                        i8++;
                    }
                    ?? r7 = (PointerInputChange) obj3;
                    if (r7 != 0) {
                        this.$currentDown.element = r7;
                        this.$longPress.element = r7;
                    } else {
                        awaitPointerEventScope = awaitPointerEventScope2;
                        i = 1;
                        obj4 = null;
                        i5 = 1;
                        if (i != 0) {
                            return Unit.INSTANCE;
                        }
                        PointerEventPass pointerEventPass2 = PointerEventPass.Main;
                        this.L$0 = awaitPointerEventScope;
                        this.L$1 = obj4;
                        this.I$0 = i;
                        this.label = i5;
                        obj2 = awaitPointerEventScope.awaitPointerEvent(pointerEventPass2, this);
                        if (obj2 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        PointerEvent pointerEvent3 = (PointerEvent) obj2;
                        List changes6 = pointerEvent3.getChanges();
                        size = changes6.size();
                        i2 = 0;
                        while (true) {
                            if (i2 >= size) {
                                i = i5;
                                break;
                            }
                            if (!PointerEventKt.changedToUpIgnoreConsumed((PointerInputChange) changes6.get(i2))) {
                                break;
                            }
                            i2++;
                        }
                        List changes22 = pointerEvent3.getChanges();
                        size2 = changes22.size();
                        for (i3 = 0; i3 < size2; i3++) {
                            PointerInputChange pointerInputChange = (PointerInputChange) changes22.get(i3);
                            if (pointerInputChange.isConsumed() || PointerEventKt.m1850isOutOfBoundsjwHxaWs(pointerInputChange, awaitPointerEventScope.mo1834getSizeYbymL2g(), awaitPointerEventScope.mo1833getExtendedTouchPaddingNHjbRc())) {
                                break;
                            }
                        }
                        PointerEventPass pointerEventPass3 = PointerEventPass.Final;
                        this.L$0 = awaitPointerEventScope;
                        this.L$1 = pointerEvent3;
                        this.I$0 = i;
                        this.label = 2;
                        awaitPointerEvent = awaitPointerEventScope.awaitPointerEvent(pointerEventPass3, this);
                        if (awaitPointerEvent != coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        awaitPointerEventScope2 = awaitPointerEventScope;
                        pointerEvent2 = pointerEvent3;
                        List changes32 = ((PointerEvent) awaitPointerEvent).getChanges();
                        int size32 = changes32.size();
                        int i62 = 0;
                        while (true) {
                            if (i62 >= size32) {
                            }
                            i62++;
                        }
                        m239isPointerUpDmW0f2w = DragGestureDetectorKt.m239isPointerUpDmW0f2w(pointerEvent2, this.$currentDown.element.getId());
                        if (m239isPointerUpDmW0f2w) {
                        }
                    }
                }
                awaitPointerEventScope = awaitPointerEventScope2;
                obj4 = null;
                i5 = 1;
                if (i != 0) {
                }
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
            PointerInputScope pointerInputScope = this.$this_awaitLongPressOrCancellation;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$currentDown, this.$longPress, null);
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
