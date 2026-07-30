package androidx.compose.foundation.gestures;

import androidx.autofill.HintConstants;
import androidx.compose.foundation.gestures.DragEvent;
import androidx.core.app.NotificationCompat;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.channels.Channel;

/* compiled from: Draggable.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureNode$startListeningForEvents$1", f = "Draggable.kt", i = {0, 0, 1, 1, 2, 2, 3, 4, 5}, l = {431, 433, 435, 442, 444, 447}, m = "invokeSuspend", n = {"$this$launch", NotificationCompat.CATEGORY_EVENT, "$this$launch", NotificationCompat.CATEGORY_EVENT, "$this$launch", NotificationCompat.CATEGORY_EVENT, "$this$launch", "$this$launch", "$this$launch"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$0", "L$0"})
/* loaded from: classes.dex */
final class DragGestureNode$startListeningForEvents$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ DragGestureNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DragGestureNode$startListeningForEvents$1(DragGestureNode dragGestureNode, Continuation<? super DragGestureNode$startListeningForEvents$1> continuation) {
        super(2, continuation);
        this.this$0 = dragGestureNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DragGestureNode$startListeningForEvents$1 dragGestureNode$startListeningForEvents$1 = new DragGestureNode$startListeningForEvents$1(this.this$0, continuation);
        dragGestureNode$startListeningForEvents$1.L$0 = obj;
        return dragGestureNode$startListeningForEvents$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DragGestureNode$startListeningForEvents$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:22|23|(1:42)|25|26|27|(2:32|(2:34|(1:36)))(2:29|(1:31))) */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0106, code lost:
    
        r1 = r4;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d0 A[Catch: CancellationException -> 0x0106, TryCatch #2 {CancellationException -> 0x0106, blocks: (B:27:0x00ca, B:29:0x00d0, B:32:0x00ed, B:34:0x00f3), top: B:26:0x00ca }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ed A[Catch: CancellationException -> 0x0106, TryCatch #2 {CancellationException -> 0x0106, blocks: (B:27:0x00ca, B:29:0x00d0, B:32:0x00ed, B:34:0x00f3), top: B:26:0x00ca }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0119 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x011a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0091 -> B:8:0x005f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00ea -> B:8:0x005f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00f1 -> B:8:0x005f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x0103 -> B:8:0x005f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x0117 -> B:7:0x0028). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope;
        Ref.ObjectRef objectRef;
        Ref.ObjectRef objectRef2;
        Ref.ObjectRef objectRef3;
        CoroutineScope coroutineScope2;
        CoroutineScope coroutineScope3;
        Object processDragCancel;
        Object processDragCancel2;
        Object processDragStop;
        T t;
        Object processDragStart;
        Channel channel;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure(obj);
                coroutineScope = (CoroutineScope) this.L$0;
                if (!CoroutineScopeKt.isActive(coroutineScope)) {
                    objectRef = new Ref.ObjectRef();
                    channel = this.this$0.channel;
                    if (channel != null) {
                        this.L$0 = coroutineScope;
                        this.L$1 = objectRef;
                        this.L$2 = objectRef;
                        this.label = 1;
                        obj = channel.receive(this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        objectRef2 = objectRef;
                        t = (DragEvent) obj;
                        objectRef.element = t;
                        if (objectRef2.element instanceof DragEvent.DragStarted) {
                            this.L$0 = coroutineScope;
                            this.L$1 = objectRef2;
                            this.L$2 = null;
                            this.label = 2;
                            processDragStart = this.this$0.processDragStart((DragEvent.DragStarted) objectRef2.element, this);
                            if (processDragStart == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            objectRef3 = objectRef2;
                            coroutineScope2 = coroutineScope;
                            this.L$0 = coroutineScope2;
                            this.L$1 = objectRef3;
                            this.label = 3;
                            if (this.this$0.drag(new AnonymousClass1(objectRef3, this.this$0, null), this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            coroutineScope = coroutineScope2;
                            if (objectRef3.element instanceof DragEvent.DragStopped) {
                                DragGestureNode dragGestureNode = this.this$0;
                                T t2 = objectRef3.element;
                                Intrinsics.checkNotNull(t2, "null cannot be cast to non-null type androidx.compose.foundation.gestures.DragEvent.DragStopped");
                                this.L$0 = coroutineScope;
                                this.L$1 = null;
                                this.label = 4;
                                processDragStop = dragGestureNode.processDragStop((DragEvent.DragStopped) t2, this);
                                if (processDragStop == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else if (objectRef3.element instanceof DragEvent.DragCancelled) {
                                this.L$0 = coroutineScope;
                                this.L$1 = null;
                                this.label = 5;
                                processDragCancel2 = this.this$0.processDragCancel(this);
                                if (processDragCancel2 == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                        }
                        if (!CoroutineScopeKt.isActive(coroutineScope)) {
                            return Unit.INSTANCE;
                        }
                    } else {
                        objectRef2 = objectRef;
                        t = 0;
                        objectRef.element = t;
                        if (objectRef2.element instanceof DragEvent.DragStarted) {
                        }
                        if (!CoroutineScopeKt.isActive(coroutineScope)) {
                        }
                    }
                }
            case 1:
                objectRef = (Ref.ObjectRef) this.L$2;
                objectRef2 = (Ref.ObjectRef) this.L$1;
                coroutineScope = (CoroutineScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                t = (DragEvent) obj;
                objectRef.element = t;
                if (objectRef2.element instanceof DragEvent.DragStarted) {
                }
                if (!CoroutineScopeKt.isActive(coroutineScope)) {
                }
                break;
            case 2:
                objectRef3 = (Ref.ObjectRef) this.L$1;
                coroutineScope2 = (CoroutineScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                this.L$0 = coroutineScope2;
                this.L$1 = objectRef3;
                this.label = 3;
                if (this.this$0.drag(new AnonymousClass1(objectRef3, this.this$0, null), this) == coroutine_suspended) {
                }
                coroutineScope = coroutineScope2;
                if (objectRef3.element instanceof DragEvent.DragStopped) {
                }
                if (!CoroutineScopeKt.isActive(coroutineScope)) {
                }
                break;
            case 3:
                objectRef3 = (Ref.ObjectRef) this.L$1;
                coroutineScope2 = (CoroutineScope) this.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                } catch (CancellationException unused) {
                    coroutineScope3 = coroutineScope2;
                    this.L$0 = coroutineScope3;
                    this.L$1 = null;
                    this.label = 6;
                    processDragCancel = this.this$0.processDragCancel(this);
                    if (processDragCancel == coroutine_suspended) {
                    }
                    coroutineScope = coroutineScope3;
                    if (!CoroutineScopeKt.isActive(coroutineScope)) {
                    }
                }
                coroutineScope = coroutineScope2;
                if (objectRef3.element instanceof DragEvent.DragStopped) {
                }
                if (!CoroutineScopeKt.isActive(coroutineScope)) {
                }
                break;
            case 4:
                coroutineScope3 = (CoroutineScope) this.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                } catch (CancellationException unused2) {
                    this.L$0 = coroutineScope3;
                    this.L$1 = null;
                    this.label = 6;
                    processDragCancel = this.this$0.processDragCancel(this);
                    if (processDragCancel == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    coroutineScope = coroutineScope3;
                    if (!CoroutineScopeKt.isActive(coroutineScope)) {
                    }
                }
                coroutineScope = coroutineScope3;
                if (!CoroutineScopeKt.isActive(coroutineScope)) {
                }
                break;
            case 5:
                coroutineScope3 = (CoroutineScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                coroutineScope = coroutineScope3;
                if (!CoroutineScopeKt.isActive(coroutineScope)) {
                }
                break;
            case 6:
                coroutineScope3 = (CoroutineScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                coroutineScope = coroutineScope3;
                if (!CoroutineScopeKt.isActive(coroutineScope)) {
                }
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: Draggable.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012!\u0010\u0002\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\u00010\u0003H\u008a@"}, d2 = {"<anonymous>", "", "processDelta", "Lkotlin/Function1;", "Landroidx/compose/foundation/gestures/DragEvent$DragDelta;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "dragDelta"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureNode$startListeningForEvents$1$1", f = "Draggable.kt", i = {0}, l = {438}, m = "invokeSuspend", n = {"processDelta"}, s = {"L$0"})
    /* renamed from: androidx.compose.foundation.gestures.DragGestureNode$startListeningForEvents$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<Function1<? super DragEvent.DragDelta, ? extends Unit>, Continuation<? super Unit>, Object> {
        final /* synthetic */ Ref.ObjectRef<DragEvent> $event;
        /* synthetic */ Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ DragGestureNode this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Ref.ObjectRef<DragEvent> objectRef, DragGestureNode dragGestureNode, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$event = objectRef;
            this.this$0 = dragGestureNode;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$event, this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Function1<? super DragEvent.DragDelta, ? extends Unit> function1, Continuation<? super Unit> continuation) {
            return invoke2((Function1<? super DragEvent.DragDelta, Unit>) function1, continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Function1<? super DragEvent.DragDelta, Unit> function1, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(function1, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0030  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0052 -> B:6:0x0067). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0061 -> B:5:0x0064). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Function1 function1;
            Channel channel;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                function1 = (Function1) this.L$0;
                if (this.$event.element instanceof DragEvent.DragStopped) {
                }
                return Unit.INSTANCE;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Ref.ObjectRef<DragEvent> objectRef = (Ref.ObjectRef) this.L$1;
            function1 = (Function1) this.L$0;
            ResultKt.throwOnFailure(obj);
            T t = (DragEvent) obj;
            objectRef.element = t;
            if ((this.$event.element instanceof DragEvent.DragStopped) && !(this.$event.element instanceof DragEvent.DragCancelled)) {
                DragEvent dragEvent = this.$event.element;
                t = 0;
                DragEvent.DragDelta dragDelta = dragEvent instanceof DragEvent.DragDelta ? (DragEvent.DragDelta) dragEvent : null;
                if (dragDelta != null) {
                    function1.invoke(dragDelta);
                }
                objectRef = this.$event;
                channel = this.this$0.channel;
                if (channel != null) {
                    this.L$0 = function1;
                    this.L$1 = objectRef;
                    this.label = 1;
                    obj = channel.receive(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    T t2 = (DragEvent) obj;
                }
                objectRef.element = t2;
                if (this.$event.element instanceof DragEvent.DragStopped) {
                }
                return Unit.INSTANCE;
            }
            return Unit.INSTANCE;
        }
    }
}
