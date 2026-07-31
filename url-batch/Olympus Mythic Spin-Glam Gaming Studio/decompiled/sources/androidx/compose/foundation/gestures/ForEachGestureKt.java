package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.JobKt;

/* compiled from: ForEachGesture.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u001a;\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\"\u0010\u0005\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0001H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u0017\u0010\f\u001a\u00020\u0003*\u00020\u0000H\u0080@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u0017\u0010\f\u001a\u00020\u0003*\u00020\bH\u0080@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputScope;", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "", "block", "forEachGesture", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "", "allPointersUp", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;)Z", "awaitAllPointersUp", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "foundation_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ForEachGestureKt {
    /* JADX WARN: Can't wrap try/catch for region: R(7:0|1|(2:3|(4:5|6|7|(1:(4:(1:(1:12)(2:37|38))(2:39|40)|13|14|(3:19|20|(1:22)(6:23|24|(1:26)|13|14|(2:16|17)(0)))(0))(7:41|42|24|(0)|13|14|(0)(0)))(3:43|14|(0)(0))))|45|6|7|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0055, code lost:
    
        r10 = e;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0074 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0093 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.compose.ui.input.pointer.PointerInputScope, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v3, types: [androidx.compose.ui.input.pointer.PointerInputScope, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r8v0, types: [androidx.compose.ui.input.pointer.PointerInputScope] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, kotlin.coroutines.CoroutineContext] */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0091 -> B:13:0x0052). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00ab -> B:13:0x0052). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object forEachGesture(PointerInputScope pointerInputScope, Function2 function2, Continuation continuation) {
        ForEachGestureKt$forEachGesture$1 forEachGestureKt$forEachGesture$1;
        ?? r2;
        Object awaitAllPointersUp;
        CoroutineContext coroutineContext;
        PointerInputScope pointerInputScope2;
        Function2 function22;
        CoroutineContext coroutineContext2;
        PointerInputScope pointerInputScope3;
        if (continuation instanceof ForEachGestureKt$forEachGesture$1) {
            forEachGestureKt$forEachGesture$1 = (ForEachGestureKt$forEachGesture$1) continuation;
            int i = forEachGestureKt$forEachGesture$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                forEachGestureKt$forEachGesture$1.label = i - Integer.MIN_VALUE;
                Object obj = forEachGestureKt$forEachGesture$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                r2 = forEachGestureKt$forEachGesture$1.label;
                if (r2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    coroutineContext = forEachGestureKt$forEachGesture$1.getContext();
                    pointerInputScope2 = pointerInputScope;
                    function2 = function2;
                    if (JobKt.isActive(coroutineContext)) {
                    }
                } else if (r2 != 1) {
                    if (r2 == 2) {
                        CoroutineContext coroutineContext3 = (CoroutineContext) forEachGestureKt$forEachGesture$1.L$2;
                        Function2 function23 = (Function2) forEachGestureKt$forEachGesture$1.L$1;
                        PointerInputScope pointerInputScope4 = (PointerInputScope) forEachGestureKt$forEachGesture$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        pointerInputScope3 = pointerInputScope4;
                        coroutineContext2 = coroutineContext3;
                        function22 = function23;
                    } else {
                        if (r2 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        CoroutineContext coroutineContext4 = (CoroutineContext) forEachGestureKt$forEachGesture$1.L$2;
                        Function2 function24 = (Function2) forEachGestureKt$forEachGesture$1.L$1;
                        PointerInputScope pointerInputScope5 = (PointerInputScope) forEachGestureKt$forEachGesture$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        pointerInputScope3 = pointerInputScope5;
                        coroutineContext2 = coroutineContext4;
                        function22 = function24;
                    }
                    coroutineContext = coroutineContext2;
                    pointerInputScope2 = pointerInputScope3;
                    function2 = function22;
                    if (JobKt.isActive(coroutineContext)) {
                        try {
                        } catch (CancellationException e) {
                            r2 = pointerInputScope2;
                            pointerInputScope = coroutineContext;
                            e = e;
                            if (!JobKt.isActive(pointerInputScope)) {
                                forEachGestureKt$forEachGesture$1.L$0 = r2;
                                forEachGestureKt$forEachGesture$1.L$1 = function2;
                                forEachGestureKt$forEachGesture$1.L$2 = pointerInputScope;
                                forEachGestureKt$forEachGesture$1.label = 3;
                                Object awaitAllPointersUp2 = awaitAllPointersUp((PointerInputScope) r2, forEachGestureKt$forEachGesture$1);
                                pointerInputScope3 = r2;
                                coroutineContext2 = pointerInputScope;
                                function22 = function2;
                                if (awaitAllPointersUp2 == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                coroutineContext = coroutineContext2;
                                pointerInputScope2 = pointerInputScope3;
                                function2 = function22;
                                if (JobKt.isActive(coroutineContext)) {
                                }
                            } else {
                                throw e;
                            }
                        }
                        forEachGestureKt$forEachGesture$1.L$0 = pointerInputScope2;
                        forEachGestureKt$forEachGesture$1.L$1 = function2;
                        forEachGestureKt$forEachGesture$1.L$2 = coroutineContext;
                        forEachGestureKt$forEachGesture$1.label = 1;
                        if (function2.invoke(pointerInputScope2, forEachGestureKt$forEachGesture$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        r2 = pointerInputScope2;
                        pointerInputScope = coroutineContext;
                        function2 = function2;
                        forEachGestureKt$forEachGesture$1.L$0 = r2;
                        forEachGestureKt$forEachGesture$1.L$1 = function2;
                        forEachGestureKt$forEachGesture$1.L$2 = pointerInputScope;
                        forEachGestureKt$forEachGesture$1.label = 2;
                        awaitAllPointersUp = awaitAllPointersUp((PointerInputScope) r2, forEachGestureKt$forEachGesture$1);
                        pointerInputScope3 = r2;
                        coroutineContext2 = pointerInputScope;
                        function22 = function2;
                        if (awaitAllPointersUp == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        coroutineContext = coroutineContext2;
                        pointerInputScope2 = pointerInputScope3;
                        function2 = function22;
                        if (JobKt.isActive(coroutineContext)) {
                            return Unit.INSTANCE;
                        }
                    }
                } else {
                    CoroutineContext coroutineContext5 = (CoroutineContext) forEachGestureKt$forEachGesture$1.L$2;
                    Function2 function25 = (Function2) forEachGestureKt$forEachGesture$1.L$1;
                    PointerInputScope pointerInputScope6 = (PointerInputScope) forEachGestureKt$forEachGesture$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    r2 = pointerInputScope6;
                    pointerInputScope = coroutineContext5;
                    function2 = function25;
                    forEachGestureKt$forEachGesture$1.L$0 = r2;
                    forEachGestureKt$forEachGesture$1.L$1 = function2;
                    forEachGestureKt$forEachGesture$1.L$2 = pointerInputScope;
                    forEachGestureKt$forEachGesture$1.label = 2;
                    awaitAllPointersUp = awaitAllPointersUp((PointerInputScope) r2, forEachGestureKt$forEachGesture$1);
                    pointerInputScope3 = r2;
                    coroutineContext2 = pointerInputScope;
                    function22 = function2;
                    if (awaitAllPointersUp == coroutine_suspended) {
                    }
                    coroutineContext = coroutineContext2;
                    pointerInputScope2 = pointerInputScope3;
                    function2 = function22;
                    if (JobKt.isActive(coroutineContext)) {
                    }
                }
            }
        }
        forEachGestureKt$forEachGesture$1 = new ForEachGestureKt$forEachGesture$1(continuation);
        Object obj2 = forEachGestureKt$forEachGesture$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        r2 = forEachGestureKt$forEachGesture$1.label;
        if (r2 != 0) {
        }
    }

    public static final boolean allPointersUp(AwaitPointerEventScope awaitPointerEventScope) {
        Intrinsics.checkNotNullParameter(awaitPointerEventScope, "<this>");
        List changes = awaitPointerEventScope.getCurrentEvent().getChanges();
        int size = changes.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            if (((PointerInputChange) changes.get(i)).getPressed()) {
                z = true;
                break;
            }
            i++;
        }
        return !z;
    }

    public static final Object awaitAllPointersUp(PointerInputScope pointerInputScope, Continuation continuation) {
        Object awaitPointerEventScope = pointerInputScope.awaitPointerEventScope(new ForEachGestureKt$awaitAllPointersUp$2(null), continuation);
        return awaitPointerEventScope == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? awaitPointerEventScope : Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x003c, code lost:
    
        if (allPointersUp(r6) == false) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0048 -> B:10:0x004b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object awaitAllPointersUp(AwaitPointerEventScope awaitPointerEventScope, Continuation continuation) {
        ForEachGestureKt$awaitAllPointersUp$3 forEachGestureKt$awaitAllPointersUp$3;
        int i;
        if (continuation instanceof ForEachGestureKt$awaitAllPointersUp$3) {
            forEachGestureKt$awaitAllPointersUp$3 = (ForEachGestureKt$awaitAllPointersUp$3) continuation;
            int i2 = forEachGestureKt$awaitAllPointersUp$3.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                forEachGestureKt$awaitAllPointersUp$3.label = i2 - Integer.MIN_VALUE;
                Object obj = forEachGestureKt$awaitAllPointersUp$3.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = forEachGestureKt$awaitAllPointersUp$3.label;
                if (i == 0) {
                    if (i == 1) {
                        awaitPointerEventScope = (AwaitPointerEventScope) forEachGestureKt$awaitAllPointersUp$3.L$0;
                        ResultKt.throwOnFailure(obj);
                        List changes = ((PointerEvent) obj).getChanges();
                        int size = changes.size();
                        int i3 = 0;
                        while (i3 < size) {
                            if (((PointerInputChange) changes.get(i3)).getPressed()) {
                                PointerEventPass pointerEventPass = PointerEventPass.Final;
                                forEachGestureKt$awaitAllPointersUp$3.L$0 = awaitPointerEventScope;
                                forEachGestureKt$awaitAllPointersUp$3.label = 1;
                                obj = awaitPointerEventScope.awaitPointerEvent(pointerEventPass, forEachGestureKt$awaitAllPointersUp$3);
                                if (obj == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                List changes2 = ((PointerEvent) obj).getChanges();
                                int size2 = changes2.size();
                                int i32 = 0;
                                while (i32 < size2) {
                                }
                            } else {
                                i32++;
                            }
                        }
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
        }
        forEachGestureKt$awaitAllPointersUp$3 = new ForEachGestureKt$awaitAllPointersUp$3(continuation);
        Object obj2 = forEachGestureKt$awaitAllPointersUp$3.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = forEachGestureKt$awaitAllPointersUp$3.label;
        if (i == 0) {
        }
    }
}
