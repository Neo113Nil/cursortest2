package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.ui.input.pointer.PointerInputScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;

/* compiled from: TextSelectionMouseDetector.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0017\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0082@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputScope;", "Landroidx/compose/foundation/text/selection/MouseSelectionObserver;", "observer", "", "mouseSelectionDetector", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Landroidx/compose/foundation/text/selection/MouseSelectionObserver;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Landroidx/compose/ui/input/pointer/PointerEvent;", "awaitMouseEventDown", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "foundation_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class TextSelectionMouseDetectorKt {
    public static final Object mouseSelectionDetector(PointerInputScope pointerInputScope, MouseSelectionObserver mouseSelectionObserver, Continuation continuation) {
        Object forEachGesture = ForEachGestureKt.forEachGesture(pointerInputScope, new TextSelectionMouseDetectorKt$mouseSelectionDetector$2(mouseSelectionObserver, null), continuation);
        return forEachGesture == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? forEachGesture : Unit.INSTANCE;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0044 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0051  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0042 -> B:10:0x0045). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object awaitMouseEventDown(androidx.compose.ui.input.pointer.AwaitPointerEventScope r9, kotlin.coroutines.Continuation r10) {
        /*
            boolean r0 = r10 instanceof androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt$awaitMouseEventDown$1
            if (r0 == 0) goto L13
            r0 = r10
            androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt$awaitMouseEventDown$1 r0 = (androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt$awaitMouseEventDown$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt$awaitMouseEventDown$1 r0 = new androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt$awaitMouseEventDown$1
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r9 = r0.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r9 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r9
            kotlin.ResultKt.throwOnFailure(r10)
            goto L45
        L2d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L35:
            kotlin.ResultKt.throwOnFailure(r10)
        L38:
            androidx.compose.ui.input.pointer.PointerEventPass r10 = androidx.compose.ui.input.pointer.PointerEventPass.Main
            r0.L$0 = r9
            r0.label = r3
            java.lang.Object r10 = r9.awaitPointerEvent(r10, r0)
            if (r10 != r1) goto L45
            return r1
        L45:
            androidx.compose.ui.input.pointer.PointerEvent r10 = (androidx.compose.ui.input.pointer.PointerEvent) r10
            int r2 = r10.getButtons()
            boolean r2 = androidx.compose.ui.input.pointer.PointerEvent_androidKt.m1864isPrimaryPressedaHzCxE(r2)
            if (r2 == 0) goto L38
            java.util.List r2 = r10.getChanges()
            int r4 = r2.size()
            r5 = 0
        L5a:
            if (r5 >= r4) goto L7b
            java.lang.Object r6 = r2.get(r5)
            androidx.compose.ui.input.pointer.PointerInputChange r6 = (androidx.compose.ui.input.pointer.PointerInputChange) r6
            int r7 = r6.getType()
            androidx.compose.ui.input.pointer.PointerType$Companion r8 = androidx.compose.ui.input.pointer.PointerType.INSTANCE
            int r8 = r8.m1903getMouseT8wyACA()
            boolean r7 = androidx.compose.ui.input.pointer.PointerType.m1898equalsimpl0(r7, r8)
            if (r7 == 0) goto L38
            boolean r6 = androidx.compose.ui.input.pointer.PointerEventKt.changedToDown(r6)
            if (r6 == 0) goto L38
            int r5 = r5 + 1
            goto L5a
        L7b:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt.awaitMouseEventDown(androidx.compose.ui.input.pointer.AwaitPointerEventScope, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
