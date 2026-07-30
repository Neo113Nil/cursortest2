package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.TransformEvent;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputChange;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.channels.Channel;

/* compiled from: Transformable.kt */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a<\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\tH\u0082@¢\u0006\u0002\u0010\u000b\u001a<\u0010\f\u001a\u00020\r*\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\t2\b\b\u0002\u0010\u0010\u001a\u00020\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u0004H\u0007\u001a&\u0010\f\u001a\u00020\r*\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u0004¨\u0006\u0012"}, d2 = {"detectZoom", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "panZoomLock", "", "channel", "Lkotlinx/coroutines/channels/Channel;", "Landroidx/compose/foundation/gestures/TransformEvent;", "canPan", "Lkotlin/Function1;", "Landroidx/compose/ui/geometry/Offset;", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;ZLkotlinx/coroutines/channels/Channel;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "transformable", "Landroidx/compose/ui/Modifier;", "state", "Landroidx/compose/foundation/gestures/TransformableState;", "lockRotationOnZoomPan", "enabled", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TransformableKt {
    public static /* synthetic */ Modifier transformable$default(Modifier modifier, TransformableState transformableState, boolean z, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = true;
        }
        return transformable(modifier, transformableState, z, z2);
    }

    public static final Modifier transformable(Modifier modifier, TransformableState transformableState, boolean z, boolean z2) {
        return transformable(modifier, transformableState, new Function1<Offset, Boolean>() { // from class: androidx.compose.foundation.gestures.TransformableKt$transformable$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Boolean invoke(Offset offset) {
                return m503invokek4lQ0M(offset.getPackedValue());
            }

            /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
            public final Boolean m503invokek4lQ0M(long j) {
                return true;
            }
        }, z, z2);
    }

    public static /* synthetic */ Modifier transformable$default(Modifier modifier, TransformableState transformableState, Function1 function1, boolean z, boolean z2, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        if ((i & 8) != 0) {
            z2 = true;
        }
        return transformable(modifier, transformableState, function1, z, z2);
    }

    public static final Modifier transformable(Modifier modifier, TransformableState transformableState, Function1<? super Offset, Boolean> function1, boolean z, boolean z2) {
        return modifier.then(new TransformableElement(transformableState, function1, z, z2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x02b3, code lost:
    
        if (r6 != 0) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x02b5, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0202, code lost:
    
        if (r13.invoke(androidx.compose.ui.geometry.Offset.m3571boximpl(r8)).booleanValue() != false) goto L69;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0146 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02ba A[EDGE_INSN: B:97:0x02ba->B:96:0x02ba BREAK  A[LOOP:0: B:13:0x02a5->B:16:0x02b7], SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:67:0x0289 -> B:12:0x0298). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object detectZoom(AwaitPointerEventScope awaitPointerEventScope, boolean z, Channel<TransformEvent> channel, Function1<? super Offset, Boolean> function1, Continuation<? super Unit> continuation) {
        TransformableKt$detectZoom$1 transformableKt$detectZoom$1;
        Object obj;
        Object coroutine_suspended;
        int i;
        Channel<TransformEvent> channel2;
        Function1<? super Offset, Boolean> function12;
        boolean z2;
        float f;
        long j;
        int i2;
        int i3;
        float f2;
        float f3;
        AwaitPointerEventScope awaitPointerEventScope2;
        Function1<? super Offset, Boolean> function13;
        AwaitPointerEventScope awaitPointerEventScope3;
        int size;
        int i4;
        int i5;
        int i6;
        float f4;
        long j2;
        float f5;
        int i7;
        Object awaitPointerEvent;
        float f6;
        int i8;
        float f7;
        AwaitPointerEventScope awaitPointerEventScope4;
        PointerEvent pointerEvent;
        int i9;
        float f8;
        long j3;
        float f9;
        int i10;
        int i11;
        float f10;
        int size2;
        int i12;
        int size3;
        int i13;
        int size4;
        int i14;
        if (continuation instanceof TransformableKt$detectZoom$1) {
            transformableKt$detectZoom$1 = (TransformableKt$detectZoom$1) continuation;
            if ((transformableKt$detectZoom$1.label & Integer.MIN_VALUE) != 0) {
                transformableKt$detectZoom$1.label -= Integer.MIN_VALUE;
                TransformableKt$detectZoom$1 transformableKt$detectZoom$12 = transformableKt$detectZoom$1;
                obj = transformableKt$detectZoom$12.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = transformableKt$detectZoom$12.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    long m3598getZeroF1C5BW0 = Offset.INSTANCE.m3598getZeroF1C5BW0();
                    float touchSlop = awaitPointerEventScope.getViewConfiguration().getTouchSlop();
                    transformableKt$detectZoom$12.L$0 = awaitPointerEventScope;
                    channel2 = channel;
                    transformableKt$detectZoom$12.L$1 = channel2;
                    function12 = function1;
                    transformableKt$detectZoom$12.L$2 = function12;
                    z2 = z;
                    transformableKt$detectZoom$12.Z$0 = z2;
                    transformableKt$detectZoom$12.F$0 = 0.0f;
                    transformableKt$detectZoom$12.F$1 = 1.0f;
                    transformableKt$detectZoom$12.J$0 = m3598getZeroF1C5BW0;
                    transformableKt$detectZoom$12.I$0 = 0;
                    transformableKt$detectZoom$12.F$2 = touchSlop;
                    transformableKt$detectZoom$12.I$1 = 0;
                    transformableKt$detectZoom$12.label = 1;
                    if (TapGestureDetectorKt.awaitFirstDown$default(awaitPointerEventScope, false, null, transformableKt$detectZoom$12, 2, null) != coroutine_suspended) {
                        f = touchSlop;
                        j = m3598getZeroF1C5BW0;
                        i2 = 0;
                        i3 = 0;
                        f2 = 1.0f;
                        f3 = 0.0f;
                        awaitPointerEventScope2 = awaitPointerEventScope;
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        i5 = transformableKt$detectZoom$12.I$2;
                        i8 = transformableKt$detectZoom$12.I$1;
                        f6 = transformableKt$detectZoom$12.F$2;
                        i7 = transformableKt$detectZoom$12.I$0;
                        j2 = transformableKt$detectZoom$12.J$0;
                        float f11 = transformableKt$detectZoom$12.F$1;
                        float f12 = transformableKt$detectZoom$12.F$0;
                        boolean z3 = transformableKt$detectZoom$12.Z$0;
                        pointerEvent = (PointerEvent) transformableKt$detectZoom$12.L$3;
                        Function1<? super Offset, Boolean> function14 = (Function1) transformableKt$detectZoom$12.L$2;
                        channel2 = (Channel) transformableKt$detectZoom$12.L$1;
                        AwaitPointerEventScope awaitPointerEventScope5 = (AwaitPointerEventScope) transformableKt$detectZoom$12.L$0;
                        ResultKt.throwOnFailure(obj);
                        f2 = f11;
                        f7 = f12;
                        awaitPointerEventScope4 = awaitPointerEventScope5;
                        function12 = function14;
                        z2 = z3;
                        awaitPointerEvent = obj;
                        List<PointerInputChange> changes = ((PointerEvent) awaitPointerEvent).getChanges();
                        size3 = changes.size();
                        Object obj2 = coroutine_suspended;
                        i13 = 0;
                        while (true) {
                            if (i13 >= size3) {
                                break;
                            }
                            if (changes.get(i13).isConsumed()) {
                                break;
                            }
                            i13++;
                        }
                        boolean z4 = false;
                        if (i5 == 0 && !z4) {
                            List<PointerInputChange> changes2 = pointerEvent.getChanges();
                            size4 = changes2.size();
                            for (i14 = 0; i14 < size4; i14++) {
                                if (changes2.get(i14).getPressed()) {
                                    i2 = i8;
                                    f = f6;
                                    i3 = i7;
                                    f3 = f7;
                                    j = j2;
                                    awaitPointerEventScope2 = awaitPointerEventScope4;
                                    coroutine_suspended = obj2;
                                }
                            }
                        }
                        return Unit.INSTANCE;
                    }
                    i2 = transformableKt$detectZoom$12.I$1;
                    f = transformableKt$detectZoom$12.F$2;
                    i3 = transformableKt$detectZoom$12.I$0;
                    j = transformableKt$detectZoom$12.J$0;
                    f2 = transformableKt$detectZoom$12.F$1;
                    f3 = transformableKt$detectZoom$12.F$0;
                    boolean z5 = transformableKt$detectZoom$12.Z$0;
                    Function1<? super Offset, Boolean> function15 = (Function1) transformableKt$detectZoom$12.L$2;
                    Channel<TransformEvent> channel3 = (Channel) transformableKt$detectZoom$12.L$1;
                    AwaitPointerEventScope awaitPointerEventScope6 = (AwaitPointerEventScope) transformableKt$detectZoom$12.L$0;
                    ResultKt.throwOnFailure(obj);
                    z2 = z5;
                    channel2 = channel3;
                    function13 = function15;
                    awaitPointerEventScope3 = awaitPointerEventScope6;
                    PointerEvent pointerEvent2 = (PointerEvent) obj;
                    List<PointerInputChange> changes3 = pointerEvent2.getChanges();
                    size = changes3.size();
                    int i15 = i2;
                    i4 = 0;
                    while (true) {
                        if (i4 >= size) {
                            i5 = 0;
                            break;
                        }
                        if (changes3.get(i4).isConsumed()) {
                            i5 = 1;
                            break;
                        }
                        i4++;
                    }
                    if (i5 != 0) {
                        float calculateZoom = TransformGestureDetectorKt.calculateZoom(pointerEvent2);
                        float calculateRotation = TransformGestureDetectorKt.calculateRotation(pointerEvent2);
                        float f13 = f2;
                        float f14 = f3;
                        long calculatePan = TransformGestureDetectorKt.calculatePan(pointerEvent2);
                        if (i3 == 0) {
                            f8 = f13 * calculateZoom;
                            float f15 = f14 + calculateRotation;
                            long m3587plusMKHz9U = Offset.m3587plusMKHz9U(j, calculatePan);
                            i9 = i3;
                            float calculateCentroidSize = TransformGestureDetectorKt.calculateCentroidSize(pointerEvent2, false);
                            float abs = Math.abs(1.0f - f8) * calculateCentroidSize;
                            float abs2 = Math.abs(((3.1415927f * f15) * calculateCentroidSize) / 180.0f);
                            float m3580getDistanceimpl = Offset.m3580getDistanceimpl(m3587plusMKHz9U);
                            if (abs > f || abs2 > f || (m3580getDistanceimpl > f && function13.invoke(Offset.m3571boximpl(calculatePan)).booleanValue())) {
                                int i16 = (!z2 || abs2 >= f) ? 0 : 1;
                                channel2.mo8067trySendJP2dKIU(TransformEvent.TransformStarted.INSTANCE);
                                i6 = i16;
                                j3 = m3587plusMKHz9U;
                                f9 = f15;
                                i10 = 1;
                                if (i10 == 0) {
                                    i11 = i10;
                                    f10 = f9;
                                } else {
                                    float f16 = i6 != 0 ? 0.0f : calculateRotation;
                                    if (f16 != 0.0f) {
                                        i11 = i10;
                                        f10 = f9;
                                    } else if (calculateZoom == 1.0f) {
                                        i11 = i10;
                                        f10 = f9;
                                        if (!Offset.m3579equalsimpl0(calculatePan, Offset.INSTANCE.m3598getZeroF1C5BW0())) {
                                        }
                                        List<PointerInputChange> changes4 = pointerEvent2.getChanges();
                                        size2 = changes4.size();
                                        for (i12 = 0; i12 < size2; i12++) {
                                            PointerInputChange pointerInputChange = changes4.get(i12);
                                            if (PointerEventKt.positionChanged(pointerInputChange)) {
                                                pointerInputChange.consume();
                                            }
                                        }
                                    } else {
                                        i11 = i10;
                                        f10 = f9;
                                    }
                                    channel2.mo8067trySendJP2dKIU(new TransformEvent.TransformDelta(calculateZoom, calculatePan, f16, null));
                                    List<PointerInputChange> changes42 = pointerEvent2.getChanges();
                                    size2 = changes42.size();
                                    while (i12 < size2) {
                                    }
                                }
                                i7 = i11;
                                f4 = f10;
                                f5 = f8;
                                j2 = j3;
                            } else {
                                i6 = i15;
                                j3 = m3587plusMKHz9U;
                                f9 = f15;
                            }
                        } else {
                            i9 = i3;
                            i6 = i15;
                            f8 = f13;
                            j3 = j;
                            f9 = f14;
                        }
                        i10 = i9;
                        if (i10 == 0) {
                        }
                        i7 = i11;
                        f4 = f10;
                        f5 = f8;
                        j2 = j3;
                    } else {
                        int i17 = i3;
                        float f17 = f2;
                        channel2.mo8067trySendJP2dKIU(TransformEvent.TransformStopped.INSTANCE);
                        i6 = i15;
                        f4 = f3;
                        j2 = j;
                        f5 = f17;
                        i7 = i17;
                    }
                    PointerEventPass pointerEventPass = PointerEventPass.Final;
                    transformableKt$detectZoom$12.L$0 = awaitPointerEventScope3;
                    transformableKt$detectZoom$12.L$1 = channel2;
                    transformableKt$detectZoom$12.L$2 = function13;
                    transformableKt$detectZoom$12.L$3 = pointerEvent2;
                    transformableKt$detectZoom$12.Z$0 = z2;
                    transformableKt$detectZoom$12.F$0 = f4;
                    transformableKt$detectZoom$12.F$1 = f5;
                    transformableKt$detectZoom$12.J$0 = j2;
                    transformableKt$detectZoom$12.I$0 = i7;
                    transformableKt$detectZoom$12.F$2 = f;
                    transformableKt$detectZoom$12.I$1 = i6;
                    transformableKt$detectZoom$12.I$2 = i5;
                    transformableKt$detectZoom$12.label = 3;
                    awaitPointerEvent = awaitPointerEventScope3.awaitPointerEvent(pointerEventPass, transformableKt$detectZoom$12);
                    if (awaitPointerEvent != coroutine_suspended) {
                        int i18 = i6;
                        f6 = f;
                        i8 = i18;
                        float f18 = f4;
                        f2 = f5;
                        f7 = f18;
                        awaitPointerEventScope4 = awaitPointerEventScope3;
                        function12 = function13;
                        pointerEvent = pointerEvent2;
                        List<PointerInputChange> changes5 = ((PointerEvent) awaitPointerEvent).getChanges();
                        size3 = changes5.size();
                        Object obj22 = coroutine_suspended;
                        i13 = 0;
                        while (true) {
                            if (i13 >= size3) {
                            }
                            i13++;
                        }
                        boolean z42 = false;
                        if (i5 == 0) {
                            List<PointerInputChange> changes22 = pointerEvent.getChanges();
                            size4 = changes22.size();
                            while (i14 < size4) {
                            }
                        }
                        return Unit.INSTANCE;
                    }
                    return coroutine_suspended;
                }
                i2 = transformableKt$detectZoom$12.I$1;
                f = transformableKt$detectZoom$12.F$2;
                i3 = transformableKt$detectZoom$12.I$0;
                j = transformableKt$detectZoom$12.J$0;
                f2 = transformableKt$detectZoom$12.F$1;
                f3 = transformableKt$detectZoom$12.F$0;
                boolean z6 = transformableKt$detectZoom$12.Z$0;
                function12 = (Function1) transformableKt$detectZoom$12.L$2;
                Channel<TransformEvent> channel4 = (Channel) transformableKt$detectZoom$12.L$1;
                awaitPointerEventScope2 = (AwaitPointerEventScope) transformableKt$detectZoom$12.L$0;
                ResultKt.throwOnFailure(obj);
                z2 = z6;
                channel2 = channel4;
                transformableKt$detectZoom$12.L$0 = awaitPointerEventScope2;
                transformableKt$detectZoom$12.L$1 = channel2;
                transformableKt$detectZoom$12.L$2 = function12;
                transformableKt$detectZoom$12.L$3 = null;
                transformableKt$detectZoom$12.Z$0 = z2;
                transformableKt$detectZoom$12.F$0 = f3;
                transformableKt$detectZoom$12.F$1 = f2;
                transformableKt$detectZoom$12.J$0 = j;
                transformableKt$detectZoom$12.I$0 = i3;
                transformableKt$detectZoom$12.F$2 = f;
                transformableKt$detectZoom$12.I$1 = i2;
                transformableKt$detectZoom$12.label = 2;
                obj = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, null, transformableKt$detectZoom$12, 1, null);
                if (obj != coroutine_suspended) {
                    AwaitPointerEventScope awaitPointerEventScope7 = awaitPointerEventScope2;
                    function13 = function12;
                    awaitPointerEventScope3 = awaitPointerEventScope7;
                    PointerEvent pointerEvent22 = (PointerEvent) obj;
                    List<PointerInputChange> changes32 = pointerEvent22.getChanges();
                    size = changes32.size();
                    int i152 = i2;
                    i4 = 0;
                    while (true) {
                        if (i4 >= size) {
                        }
                        i4++;
                    }
                    if (i5 != 0) {
                    }
                    PointerEventPass pointerEventPass2 = PointerEventPass.Final;
                    transformableKt$detectZoom$12.L$0 = awaitPointerEventScope3;
                    transformableKt$detectZoom$12.L$1 = channel2;
                    transformableKt$detectZoom$12.L$2 = function13;
                    transformableKt$detectZoom$12.L$3 = pointerEvent22;
                    transformableKt$detectZoom$12.Z$0 = z2;
                    transformableKt$detectZoom$12.F$0 = f4;
                    transformableKt$detectZoom$12.F$1 = f5;
                    transformableKt$detectZoom$12.J$0 = j2;
                    transformableKt$detectZoom$12.I$0 = i7;
                    transformableKt$detectZoom$12.F$2 = f;
                    transformableKt$detectZoom$12.I$1 = i6;
                    transformableKt$detectZoom$12.I$2 = i5;
                    transformableKt$detectZoom$12.label = 3;
                    awaitPointerEvent = awaitPointerEventScope3.awaitPointerEvent(pointerEventPass2, transformableKt$detectZoom$12);
                    if (awaitPointerEvent != coroutine_suspended) {
                    }
                }
                return coroutine_suspended;
            }
        }
        transformableKt$detectZoom$1 = new TransformableKt$detectZoom$1(continuation);
        TransformableKt$detectZoom$1 transformableKt$detectZoom$122 = transformableKt$detectZoom$1;
        obj = transformableKt$detectZoom$122.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = transformableKt$detectZoom$122.label;
        if (i != 0) {
        }
        transformableKt$detectZoom$122.L$0 = awaitPointerEventScope2;
        transformableKt$detectZoom$122.L$1 = channel2;
        transformableKt$detectZoom$122.L$2 = function12;
        transformableKt$detectZoom$122.L$3 = null;
        transformableKt$detectZoom$122.Z$0 = z2;
        transformableKt$detectZoom$122.F$0 = f3;
        transformableKt$detectZoom$122.F$1 = f2;
        transformableKt$detectZoom$122.J$0 = j;
        transformableKt$detectZoom$122.I$0 = i3;
        transformableKt$detectZoom$122.F$2 = f;
        transformableKt$detectZoom$122.I$1 = i2;
        transformableKt$detectZoom$122.label = 2;
        obj = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, null, transformableKt$detectZoom$122, 1, null);
        if (obj != coroutine_suspended) {
        }
        return coroutine_suspended;
    }
}
