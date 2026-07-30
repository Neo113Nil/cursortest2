package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerId;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.core.app.NotificationCompat;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* compiled from: DragGestureDetector.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$2", f = "DragGestureDetector.kt", i = {0, 0, 1, 1, 1}, l = {901, 918}, m = "invokeSuspend", n = {"$this$withTimeout", "finished", "$this$withTimeout", NotificationCompat.CATEGORY_EVENT, "finished"}, s = {"L$0", "I$0", "L$0", "L$1", "I$0"})
/* loaded from: classes.dex */
final class DragGestureDetectorKt$awaitLongPressOrCancellation$2 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Ref.ObjectRef<PointerInputChange> $currentDown;
    final /* synthetic */ Ref.ObjectRef<PointerInputChange> $longPress;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DragGestureDetectorKt$awaitLongPressOrCancellation$2(Ref.ObjectRef<PointerInputChange> objectRef, Ref.ObjectRef<PointerInputChange> objectRef2, Continuation<? super DragGestureDetectorKt$awaitLongPressOrCancellation$2> continuation) {
        super(2, continuation);
        this.$currentDown = objectRef;
        this.$longPress = objectRef2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DragGestureDetectorKt$awaitLongPressOrCancellation$2 dragGestureDetectorKt$awaitLongPressOrCancellation$2 = new DragGestureDetectorKt$awaitLongPressOrCancellation$2(this.$currentDown, this.$longPress, continuation);
        dragGestureDetectorKt$awaitLongPressOrCancellation$2.L$0 = obj;
        return dragGestureDetectorKt$awaitLongPressOrCancellation$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
        return ((DragGestureDetectorKt$awaitLongPressOrCancellation$2) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x009e, code lost:
    
        r2 = r6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0073 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d4 A[EDGE_INSN: B:67:0x00d4->B:13:0x00d4 BREAK  A[LOOP:0: B:7:0x00c1->B:10:0x00d1], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00c3  */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v6, types: [T] */
    /* JADX WARN: Type inference failed for: r9v9, types: [T, androidx.compose.ui.input.pointer.PointerInputChange] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00b3 -> B:6:0x00b6). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        AwaitPointerEventScope awaitPointerEventScope;
        int i;
        Object obj2;
        int size;
        int i2;
        int size2;
        int i3;
        Object awaitPointerEvent;
        T t;
        PointerInputChange pointerInputChange;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = this.label;
        Object obj3 = null;
        int i5 = 1;
        if (i4 == 0) {
            ResultKt.throwOnFailure(obj);
            awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
            i = 0;
            if (i == 0) {
            }
        } else if (i4 == 1) {
            i = this.I$0;
            awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
            ResultKt.throwOnFailure(obj);
            obj2 = obj;
            PointerEvent pointerEvent = (PointerEvent) obj2;
            List<PointerInputChange> changes = pointerEvent.getChanges();
            size = changes.size();
            i2 = 0;
            while (true) {
                if (i2 >= size) {
                }
                i2++;
            }
            List<PointerInputChange> changes2 = pointerEvent.getChanges();
            size2 = changes2.size();
            while (i3 < size2) {
            }
            this.L$0 = awaitPointerEventScope;
            this.L$1 = pointerEvent;
            this.I$0 = i;
            this.label = 2;
            awaitPointerEvent = awaitPointerEventScope.awaitPointerEvent(PointerEventPass.Final, this);
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
            List<PointerInputChange> changes3 = ((PointerEvent) awaitPointerEvent).getChanges();
            int size3 = changes3.size();
            int i6 = 0;
            while (true) {
                if (i6 >= size3) {
                    break;
                }
                if (changes3.get(i6).isConsumed()) {
                    i = i5;
                    break;
                }
                i6++;
            }
            if (!DragGestureDetectorKt.m424isPointerUpDmW0f2w(pointerEvent2, this.$currentDown.element.getId())) {
                List<PointerInputChange> changes4 = pointerEvent2.getChanges();
                int size4 = changes4.size();
                int i7 = 0;
                while (true) {
                    if (i7 >= size4) {
                        pointerInputChange = null;
                        break;
                    }
                    pointerInputChange = changes4.get(i7);
                    if (pointerInputChange.getPressed()) {
                        break;
                    }
                    i7++;
                }
                PointerInputChange pointerInputChange2 = pointerInputChange;
                if (pointerInputChange2 != 0) {
                    this.$currentDown.element = pointerInputChange2;
                    this.$longPress.element = this.$currentDown.element;
                } else {
                    i = i5;
                    awaitPointerEventScope = awaitPointerEventScope2;
                    obj3 = null;
                    if (i == 0) {
                        this.L$0 = awaitPointerEventScope;
                        this.L$1 = obj3;
                        this.I$0 = i;
                        this.label = i5;
                        obj2 = awaitPointerEventScope.awaitPointerEvent(PointerEventPass.Main, this);
                        if (obj2 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        PointerEvent pointerEvent3 = (PointerEvent) obj2;
                        List<PointerInputChange> changes5 = pointerEvent3.getChanges();
                        size = changes5.size();
                        i2 = 0;
                        while (true) {
                            if (i2 >= size) {
                                i = i5;
                                break;
                            }
                            if (!PointerEventKt.changedToUpIgnoreConsumed(changes5.get(i2))) {
                                break;
                            }
                            i2++;
                        }
                        List<PointerInputChange> changes22 = pointerEvent3.getChanges();
                        size2 = changes22.size();
                        for (i3 = 0; i3 < size2; i3++) {
                            PointerInputChange pointerInputChange3 = changes22.get(i3);
                            if (pointerInputChange3.isConsumed() || PointerEventKt.m4991isOutOfBoundsjwHxaWs(pointerInputChange3, awaitPointerEventScope.mo4957getSizeYbymL2g(), awaitPointerEventScope.mo4956getExtendedTouchPaddingNHjbRc())) {
                                break;
                            }
                        }
                        this.L$0 = awaitPointerEventScope;
                        this.L$1 = pointerEvent3;
                        this.I$0 = i;
                        this.label = 2;
                        awaitPointerEvent = awaitPointerEventScope.awaitPointerEvent(PointerEventPass.Final, this);
                        if (awaitPointerEvent != coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        awaitPointerEventScope2 = awaitPointerEventScope;
                        pointerEvent2 = pointerEvent3;
                        List<PointerInputChange> changes32 = ((PointerEvent) awaitPointerEvent).getChanges();
                        int size32 = changes32.size();
                        int i62 = 0;
                        while (true) {
                            if (i62 >= size32) {
                            }
                            i62++;
                        }
                        if (!DragGestureDetectorKt.m424isPointerUpDmW0f2w(pointerEvent2, this.$currentDown.element.getId())) {
                            Ref.ObjectRef<PointerInputChange> objectRef = this.$longPress;
                            List<PointerInputChange> changes6 = pointerEvent2.getChanges();
                            Ref.ObjectRef<PointerInputChange> objectRef2 = this.$currentDown;
                            int size5 = changes6.size();
                            int i8 = 0;
                            while (true) {
                                if (i8 >= size5) {
                                    t = 0;
                                    break;
                                }
                                t = changes6.get(i8);
                                Ref.ObjectRef<PointerInputChange> objectRef3 = objectRef2;
                                if (PointerId.m5028equalsimpl0(((PointerInputChange) t).getId(), objectRef2.element.getId())) {
                                    break;
                                }
                                i8++;
                                objectRef2 = objectRef3;
                            }
                            objectRef.element = t;
                        }
                    } else {
                        return Unit.INSTANCE;
                    }
                }
            }
            awaitPointerEventScope = awaitPointerEventScope2;
            obj3 = null;
            i5 = 1;
            if (i == 0) {
            }
        }
    }
}
