package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.TransformEvent;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputChange;
import com.appsflyer.AppsFlyerProperties;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.channels.Channel;

/* compiled from: Transformable.kt */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a<\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\tH\u0082@¢\u0006\u0002\u0010\u000b\u001a<\u0010\f\u001a\u00020\r*\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\t2\b\b\u0002\u0010\u0010\u001a\u00020\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u0004H\u0007\u001a&\u0010\f\u001a\u00020\r*\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u0004¨\u0006\u0012"}, d2 = {"detectZoom", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "panZoomLock", "", AppsFlyerProperties.CHANNEL, "Lkotlinx/coroutines/channels/Channel;", "Landroidx/compose/foundation/gestures/TransformEvent;", "canPan", "Lkotlin/Function1;", "Landroidx/compose/ui/geometry/Offset;", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;ZLkotlinx/coroutines/channels/Channel;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "transformable", "Landroidx/compose/ui/Modifier;", "state", "Landroidx/compose/foundation/gestures/TransformableState;", "lockRotationOnZoomPan", "enabled", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
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
                return m511invokek4lQ0M(offset.getPackedValue());
            }

            /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
            public final Boolean m511invokek4lQ0M(long j) {
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
    /* JADX WARN: Code restructure failed: missing block: B:18:0x029d, code lost:
    
        if (r5 != 0) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x029f, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01f2, code lost:
    
        if (r13.invoke(androidx.compose.ui.geometry.Offset.m3588boximpl(r1)).booleanValue() != false) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x011e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0275 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0145 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02a4 A[EDGE_INSN: B:97:0x02a4->B:96:0x02a4 BREAK  A[LOOP:0: B:13:0x028f->B:16:0x02a1], SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:69:0x0276 -> B:12:0x0282). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object detectZoom(AwaitPointerEventScope awaitPointerEventScope, boolean z, Channel<TransformEvent> channel, Function1<? super Offset, Boolean> function1, Continuation<? super Unit> continuation) {
        TransformableKt$detectZoom$1 transformableKt$detectZoom$1;
        Object obj;
        Object coroutine_suspended;
        int i;
        AwaitPointerEventScope awaitPointerEventScope2;
        Channel<TransformEvent> channel2;
        Function1<? super Offset, Boolean> function12;
        boolean z2;
        float f;
        long j;
        int i2;
        int i3;
        float f2;
        float f3;
        AwaitPointerEventScope awaitPointerEventScope3;
        float f4;
        Channel<TransformEvent> channel3;
        int size;
        int i4;
        int i5;
        TransformableKt$detectZoom$1 transformableKt$detectZoom$12;
        int i6;
        int i7;
        float f5;
        long j2;
        int i8;
        int i9;
        Object awaitPointerEvent;
        boolean z3;
        PointerEvent pointerEvent;
        float f6;
        float f7;
        int i10;
        Channel<TransformEvent> channel4;
        float f8;
        int i11;
        long j3;
        float f9;
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
                obj = transformableKt$detectZoom$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = transformableKt$detectZoom$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    long m3615getZeroF1C5BW0 = Offset.INSTANCE.m3615getZeroF1C5BW0();
                    float touchSlop = awaitPointerEventScope.getViewConfiguration().getTouchSlop();
                    awaitPointerEventScope2 = awaitPointerEventScope;
                    transformableKt$detectZoom$1.L$0 = awaitPointerEventScope2;
                    channel2 = channel;
                    transformableKt$detectZoom$1.L$1 = channel2;
                    function12 = function1;
                    transformableKt$detectZoom$1.L$2 = function12;
                    z2 = z;
                    transformableKt$detectZoom$1.Z$0 = z2;
                    transformableKt$detectZoom$1.F$0 = 0.0f;
                    transformableKt$detectZoom$1.F$1 = 1.0f;
                    transformableKt$detectZoom$1.J$0 = m3615getZeroF1C5BW0;
                    transformableKt$detectZoom$1.I$0 = 0;
                    transformableKt$detectZoom$1.F$2 = touchSlop;
                    transformableKt$detectZoom$1.I$1 = 0;
                    transformableKt$detectZoom$1.label = 1;
                    if (TapGestureDetectorKt.awaitFirstDown$default(awaitPointerEventScope, false, null, transformableKt$detectZoom$1, 2, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    f = touchSlop;
                    j = m3615getZeroF1C5BW0;
                    i2 = 0;
                    i3 = 0;
                    f2 = 1.0f;
                    f3 = 0.0f;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            int i15 = transformableKt$detectZoom$1.I$2;
                            i10 = transformableKt$detectZoom$1.I$1;
                            f7 = transformableKt$detectZoom$1.F$2;
                            i8 = transformableKt$detectZoom$1.I$0;
                            j2 = transformableKt$detectZoom$1.J$0;
                            float f11 = transformableKt$detectZoom$1.F$1;
                            float f12 = transformableKt$detectZoom$1.F$0;
                            boolean z4 = transformableKt$detectZoom$1.Z$0;
                            pointerEvent = (PointerEvent) transformableKt$detectZoom$1.L$3;
                            function12 = (Function1) transformableKt$detectZoom$1.L$2;
                            Channel<TransformEvent> channel5 = (Channel) transformableKt$detectZoom$1.L$1;
                            awaitPointerEventScope3 = (AwaitPointerEventScope) transformableKt$detectZoom$1.L$0;
                            ResultKt.throwOnFailure(obj);
                            z3 = z4;
                            f4 = f12;
                            channel4 = channel5;
                            f6 = f11;
                            i9 = i15;
                            awaitPointerEvent = obj;
                            List<PointerInputChange> changes = ((PointerEvent) awaitPointerEvent).getChanges();
                            size3 = changes.size();
                            TransformableKt$detectZoom$1 transformableKt$detectZoom$13 = transformableKt$detectZoom$1;
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
                            boolean z5 = false;
                            if (i9 == 0 && !z5) {
                                List<PointerInputChange> changes2 = pointerEvent.getChanges();
                                size4 = changes2.size();
                                for (i14 = 0; i14 < size4; i14++) {
                                    if (changes2.get(i14).getPressed()) {
                                        transformableKt$detectZoom$1 = transformableKt$detectZoom$13;
                                        i2 = i10;
                                        f = f7;
                                        i3 = i8;
                                        j = j2;
                                        f2 = f6;
                                        f3 = f4;
                                        awaitPointerEventScope2 = awaitPointerEventScope3;
                                        z2 = z3;
                                        channel2 = channel4;
                                    }
                                }
                            }
                            return Unit.INSTANCE;
                        }
                        i2 = transformableKt$detectZoom$1.I$1;
                        f = transformableKt$detectZoom$1.F$2;
                        i3 = transformableKt$detectZoom$1.I$0;
                        j = transformableKt$detectZoom$1.J$0;
                        f2 = transformableKt$detectZoom$1.F$1;
                        float f13 = transformableKt$detectZoom$1.F$0;
                        boolean z6 = transformableKt$detectZoom$1.Z$0;
                        Function1<? super Offset, Boolean> function13 = (Function1) transformableKt$detectZoom$1.L$2;
                        Channel<TransformEvent> channel6 = (Channel) transformableKt$detectZoom$1.L$1;
                        AwaitPointerEventScope awaitPointerEventScope4 = (AwaitPointerEventScope) transformableKt$detectZoom$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        z2 = z6;
                        f4 = f13;
                        channel3 = channel6;
                        awaitPointerEventScope3 = awaitPointerEventScope4;
                        function12 = function13;
                        PointerEvent pointerEvent2 = (PointerEvent) obj;
                        List<PointerInputChange> changes3 = pointerEvent2.getChanges();
                        size = changes3.size();
                        int i16 = i2;
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
                            transformableKt$detectZoom$12 = transformableKt$detectZoom$1;
                            i6 = i5;
                            long calculatePan = TransformGestureDetectorKt.calculatePan(pointerEvent2);
                            if (i3 == 0) {
                                f2 *= calculateZoom;
                                f4 += calculateRotation;
                                j = Offset.m3604plusMKHz9U(j, calculatePan);
                                int i17 = i3;
                                float calculateCentroidSize = TransformGestureDetectorKt.calculateCentroidSize(pointerEvent2, false);
                                f8 = calculateRotation;
                                float abs = Math.abs(1 - f2) * calculateCentroidSize;
                                float abs2 = Math.abs(((3.1415927f * f4) * calculateCentroidSize) / 180.0f);
                                float m3597getDistanceimpl = Offset.m3597getDistanceimpl(j);
                                if (abs > f || abs2 > f || (m3597getDistanceimpl > f && function12.invoke(Offset.m3588boximpl(calculatePan)).booleanValue())) {
                                    i7 = (!z2 || abs2 >= f) ? 0 : 1;
                                    channel3.mo8324trySendJP2dKIU(TransformEvent.TransformStarted.INSTANCE);
                                    i3 = 1;
                                } else {
                                    i7 = i16;
                                    i3 = i17;
                                }
                            } else {
                                f8 = calculateRotation;
                                i7 = i16;
                            }
                            if (i3 == 0) {
                                i11 = i3;
                                j3 = j;
                            } else {
                                if (i7 != 0) {
                                    f10 = 0.0f;
                                    f9 = 0.0f;
                                } else {
                                    f9 = f8;
                                    f10 = 0.0f;
                                }
                                if (f9 != f10) {
                                    i11 = i3;
                                    j3 = j;
                                } else if (calculateZoom == 1.0f) {
                                    i11 = i3;
                                    j3 = j;
                                    if (!Offset.m3596equalsimpl0(calculatePan, Offset.INSTANCE.m3615getZeroF1C5BW0())) {
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
                                    i11 = i3;
                                    j3 = j;
                                }
                                channel3.mo8324trySendJP2dKIU(new TransformEvent.TransformDelta(calculateZoom, calculatePan, f9, null));
                                List<PointerInputChange> changes42 = pointerEvent2.getChanges();
                                size2 = changes42.size();
                                while (i12 < size2) {
                                }
                            }
                            i8 = i11;
                            f5 = f2;
                            j2 = j3;
                        } else {
                            transformableKt$detectZoom$12 = transformableKt$detectZoom$1;
                            i6 = i5;
                            channel3.mo8324trySendJP2dKIU(TransformEvent.TransformStopped.INSTANCE);
                            i7 = i16;
                            f5 = f2;
                            j2 = j;
                            i8 = i3;
                        }
                        PointerEventPass pointerEventPass = PointerEventPass.Final;
                        TransformableKt$detectZoom$1 transformableKt$detectZoom$14 = transformableKt$detectZoom$12;
                        transformableKt$detectZoom$14.L$0 = awaitPointerEventScope3;
                        transformableKt$detectZoom$14.L$1 = channel3;
                        transformableKt$detectZoom$14.L$2 = function12;
                        transformableKt$detectZoom$14.L$3 = pointerEvent2;
                        transformableKt$detectZoom$14.Z$0 = z2;
                        transformableKt$detectZoom$14.F$0 = f4;
                        transformableKt$detectZoom$14.F$1 = f5;
                        transformableKt$detectZoom$14.J$0 = j2;
                        transformableKt$detectZoom$14.I$0 = i8;
                        transformableKt$detectZoom$14.F$2 = f;
                        transformableKt$detectZoom$14.I$1 = i7;
                        i9 = i6;
                        transformableKt$detectZoom$14.I$2 = i9;
                        transformableKt$detectZoom$14.label = 3;
                        awaitPointerEvent = awaitPointerEventScope3.awaitPointerEvent(pointerEventPass, transformableKt$detectZoom$14);
                        if (awaitPointerEvent != coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        z3 = z2;
                        pointerEvent = pointerEvent2;
                        Channel<TransformEvent> channel7 = channel3;
                        f6 = f5;
                        transformableKt$detectZoom$1 = transformableKt$detectZoom$14;
                        f7 = f;
                        i10 = i7;
                        channel4 = channel7;
                        List<PointerInputChange> changes5 = ((PointerEvent) awaitPointerEvent).getChanges();
                        size3 = changes5.size();
                        TransformableKt$detectZoom$1 transformableKt$detectZoom$132 = transformableKt$detectZoom$1;
                        i13 = 0;
                        while (true) {
                            if (i13 >= size3) {
                            }
                            i13++;
                        }
                        boolean z52 = false;
                        if (i9 == 0) {
                            List<PointerInputChange> changes22 = pointerEvent.getChanges();
                            size4 = changes22.size();
                            while (i14 < size4) {
                            }
                        }
                        return Unit.INSTANCE;
                    }
                    i2 = transformableKt$detectZoom$1.I$1;
                    f = transformableKt$detectZoom$1.F$2;
                    i3 = transformableKt$detectZoom$1.I$0;
                    j = transformableKt$detectZoom$1.J$0;
                    f2 = transformableKt$detectZoom$1.F$1;
                    f3 = transformableKt$detectZoom$1.F$0;
                    boolean z7 = transformableKt$detectZoom$1.Z$0;
                    Function1<? super Offset, Boolean> function14 = (Function1) transformableKt$detectZoom$1.L$2;
                    channel2 = (Channel) transformableKt$detectZoom$1.L$1;
                    AwaitPointerEventScope awaitPointerEventScope5 = (AwaitPointerEventScope) transformableKt$detectZoom$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    z2 = z7;
                    function12 = function14;
                    awaitPointerEventScope2 = awaitPointerEventScope5;
                }
                transformableKt$detectZoom$1.L$0 = awaitPointerEventScope2;
                transformableKt$detectZoom$1.L$1 = channel2;
                transformableKt$detectZoom$1.L$2 = function12;
                transformableKt$detectZoom$1.L$3 = null;
                transformableKt$detectZoom$1.Z$0 = z2;
                transformableKt$detectZoom$1.F$0 = f3;
                transformableKt$detectZoom$1.F$1 = f2;
                transformableKt$detectZoom$1.J$0 = j;
                transformableKt$detectZoom$1.I$0 = i3;
                transformableKt$detectZoom$1.F$2 = f;
                transformableKt$detectZoom$1.I$1 = i2;
                transformableKt$detectZoom$1.label = 2;
                obj = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, null, transformableKt$detectZoom$1, 1, null);
                if (obj != coroutine_suspended) {
                    return coroutine_suspended;
                }
                AwaitPointerEventScope awaitPointerEventScope6 = awaitPointerEventScope2;
                f4 = f3;
                channel3 = channel2;
                awaitPointerEventScope3 = awaitPointerEventScope6;
                PointerEvent pointerEvent22 = (PointerEvent) obj;
                List<PointerInputChange> changes32 = pointerEvent22.getChanges();
                size = changes32.size();
                int i162 = i2;
                i4 = 0;
                while (true) {
                    if (i4 >= size) {
                    }
                    i4++;
                }
                if (i5 != 0) {
                }
                PointerEventPass pointerEventPass2 = PointerEventPass.Final;
                TransformableKt$detectZoom$1 transformableKt$detectZoom$142 = transformableKt$detectZoom$12;
                transformableKt$detectZoom$142.L$0 = awaitPointerEventScope3;
                transformableKt$detectZoom$142.L$1 = channel3;
                transformableKt$detectZoom$142.L$2 = function12;
                transformableKt$detectZoom$142.L$3 = pointerEvent22;
                transformableKt$detectZoom$142.Z$0 = z2;
                transformableKt$detectZoom$142.F$0 = f4;
                transformableKt$detectZoom$142.F$1 = f5;
                transformableKt$detectZoom$142.J$0 = j2;
                transformableKt$detectZoom$142.I$0 = i8;
                transformableKt$detectZoom$142.F$2 = f;
                transformableKt$detectZoom$142.I$1 = i7;
                i9 = i6;
                transformableKt$detectZoom$142.I$2 = i9;
                transformableKt$detectZoom$142.label = 3;
                awaitPointerEvent = awaitPointerEventScope3.awaitPointerEvent(pointerEventPass2, transformableKt$detectZoom$142);
                if (awaitPointerEvent != coroutine_suspended) {
                }
            }
        }
        transformableKt$detectZoom$1 = new TransformableKt$detectZoom$1(continuation);
        obj = transformableKt$detectZoom$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = transformableKt$detectZoom$1.label;
        if (i != 0) {
        }
        transformableKt$detectZoom$1.L$0 = awaitPointerEventScope2;
        transformableKt$detectZoom$1.L$1 = channel2;
        transformableKt$detectZoom$1.L$2 = function12;
        transformableKt$detectZoom$1.L$3 = null;
        transformableKt$detectZoom$1.Z$0 = z2;
        transformableKt$detectZoom$1.F$0 = f3;
        transformableKt$detectZoom$1.F$1 = f2;
        transformableKt$detectZoom$1.J$0 = j;
        transformableKt$detectZoom$1.I$0 = i3;
        transformableKt$detectZoom$1.F$2 = f;
        transformableKt$detectZoom$1.I$1 = i2;
        transformableKt$detectZoom$1.label = 2;
        obj = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, null, transformableKt$detectZoom$1, 1, null);
        if (obj != coroutine_suspended) {
        }
    }
}
