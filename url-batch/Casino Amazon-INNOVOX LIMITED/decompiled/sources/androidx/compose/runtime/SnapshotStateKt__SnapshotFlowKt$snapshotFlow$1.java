package androidx.compose.runtime;

import androidx.collection.MutableScatterSet;
import androidx.compose.runtime.snapshots.ObserverHandle;
import androidx.compose.runtime.snapshots.ReaderKind;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.StateObjectImpl;
import java.util.Collection;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: SnapshotFlow.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/flow/FlowCollector;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1", f = "SnapshotFlow.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2}, l = {144, 148, 170}, m = "invokeSuspend", n = {"$this$flow", "readSet", "readObserver", "appliedChanges", "unregisterApplyObserver", "lastValue", "$this$flow", "readSet", "readObserver", "appliedChanges", "unregisterApplyObserver", "lastValue", "found", "$this$flow", "readSet", "readObserver", "appliedChanges", "unregisterApplyObserver", "lastValue"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5"})
/* loaded from: classes.dex */
final class SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1<T> extends SuspendLambda implements Function2<FlowCollector<? super T>, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function0<T> $block;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1(Function0<? extends T> function0, Continuation<? super SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1> continuation) {
        super(2, continuation);
        this.$block = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1 snapshotStateKt__SnapshotFlowKt$snapshotFlow$1 = new SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1(this.$block, continuation);
        snapshotStateKt__SnapshotFlowKt$snapshotFlow$1.L$0 = obj;
        return snapshotStateKt__SnapshotFlowKt$snapshotFlow$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FlowCollector<? super T> flowCollector, Continuation<? super Unit> continuation) {
        return ((SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00d5 A[Catch: all -> 0x0052, TryCatch #1 {all -> 0x0052, blocks: (B:12:0x004d, B:13:0x00d1, B:15:0x00d5, B:19:0x00df, B:23:0x00ed, B:29:0x0103, B:31:0x010c, B:44:0x012a, B:45:0x012d, B:25:0x00f8, B:28:0x0100, B:40:0x0125, B:41:0x0128), top: B:11:0x004d, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ed A[Catch: all -> 0x0052, TRY_LEAVE, TryCatch #1 {all -> 0x0052, blocks: (B:12:0x004d, B:13:0x00d1, B:15:0x00d5, B:19:0x00df, B:23:0x00ed, B:29:0x0103, B:31:0x010c, B:44:0x012a, B:45:0x012d, B:25:0x00f8, B:28:0x0100, B:40:0x0125, B:41:0x0128), top: B:11:0x004d, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ca  */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, kotlinx.coroutines.flow.FlowCollector] */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v8, types: [kotlinx.coroutines.flow.FlowCollector] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object, kotlinx.coroutines.flow.FlowCollector] */
    /* JADX WARN: Type inference failed for: r11v5 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ObserverHandle observerHandle;
        ?? r10;
        final MutableScatterSet mutableScatterSet;
        Function1<Object, Unit> function1;
        final Channel Channel$default;
        Object invoke;
        ObserverHandle observerHandle2;
        ?? r11;
        MutableScatterSet mutableScatterSet2;
        Function1<Object, Unit> function12;
        Channel channel;
        Object obj2;
        int i;
        Set set;
        boolean intersects$SnapshotStateKt__SnapshotFlowKt;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.label;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        i = this.I$0;
                        obj2 = this.L$5;
                        observerHandle2 = (ObserverHandle) this.L$4;
                        channel = (Channel) this.L$3;
                        function12 = (Function1) this.L$2;
                        mutableScatterSet2 = (MutableScatterSet) this.L$1;
                        FlowCollector flowCollector = (FlowCollector) this.L$0;
                        try {
                            ResultKt.throwOnFailure(obj);
                            r11 = flowCollector;
                            set = (Set) obj;
                            do {
                                if (i == 0) {
                                    intersects$SnapshotStateKt__SnapshotFlowKt = SnapshotStateKt__SnapshotFlowKt.intersects$SnapshotStateKt__SnapshotFlowKt(mutableScatterSet2, set);
                                    if (!intersects$SnapshotStateKt__SnapshotFlowKt) {
                                        i = 0;
                                        set = (Set) ChannelResult.m5510getOrNullimpl(channel.mo5498tryReceivePtdJZtk());
                                    }
                                }
                                i = 1;
                                set = (Set) ChannelResult.m5510getOrNullimpl(channel.mo5498tryReceivePtdJZtk());
                            } while (set != null);
                            if (i != 0) {
                                mutableScatterSet2.clear();
                                Snapshot takeSnapshot = Snapshot.INSTANCE.takeSnapshot(function12);
                                Function0<T> function0 = this.$block;
                                try {
                                    try {
                                        invoke = function0.invoke();
                                        takeSnapshot.dispose();
                                        if (!Intrinsics.areEqual(invoke, obj2)) {
                                            this.L$0 = r11;
                                            this.L$1 = mutableScatterSet2;
                                            this.L$2 = function12;
                                            this.L$3 = channel;
                                            this.L$4 = observerHandle2;
                                            this.L$5 = invoke;
                                            this.label = 3;
                                            if (r11.emit(invoke, this) != coroutine_suspended) {
                                                observerHandle = observerHandle2;
                                                Channel$default = channel;
                                                function1 = function12;
                                                mutableScatterSet = mutableScatterSet2;
                                                r10 = r11;
                                            }
                                            return coroutine_suspended;
                                        }
                                    } finally {
                                    }
                                    Snapshot makeCurrent = takeSnapshot.makeCurrent();
                                } finally {
                                }
                            }
                            invoke = obj2;
                            observerHandle = observerHandle2;
                            Channel$default = channel;
                            function1 = function12;
                            mutableScatterSet = mutableScatterSet2;
                            r10 = r11;
                        } catch (Throwable th) {
                            th = th;
                            observerHandle = observerHandle2;
                            observerHandle.dispose();
                            throw th;
                        }
                    } else if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
                invoke = this.L$5;
                observerHandle = (ObserverHandle) this.L$4;
                Channel$default = (Channel) this.L$3;
                function1 = (Function1) this.L$2;
                mutableScatterSet = (MutableScatterSet) this.L$1;
                r10 = (FlowCollector) this.L$0;
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                r10 = (FlowCollector) this.L$0;
                mutableScatterSet = new MutableScatterSet(0, 1, null);
                function1 = new Function1<Object, Unit>() { // from class: androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1$readObserver$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Object obj3) {
                        invoke2(obj3);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Object obj3) {
                        if (obj3 instanceof StateObjectImpl) {
                            ReaderKind.Companion companion = ReaderKind.INSTANCE;
                            ((StateObjectImpl) obj3).m168recordReadInh_f27i8$runtime_release(ReaderKind.m155constructorimpl(4));
                        }
                        mutableScatterSet.add(obj3);
                    }
                };
                Channel$default = ChannelKt.Channel$default(Integer.MAX_VALUE, null, null, 6, null);
                observerHandle = Snapshot.INSTANCE.registerApplyObserver(new Function2<Set<? extends Object>, Snapshot, Unit>() { // from class: androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1$unregisterApplyObserver$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Set<? extends Object> set2, Snapshot snapshot) {
                        invoke2(set2, snapshot);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Set<? extends Object> set2, Snapshot snapshot) {
                        Set<? extends Object> set3 = set2;
                        if ((set3 instanceof Collection) && set3.isEmpty()) {
                            return;
                        }
                        for (Object obj3 : set3) {
                            if (obj3 instanceof StateObjectImpl) {
                                ReaderKind.Companion companion = ReaderKind.INSTANCE;
                                if (((StateObjectImpl) obj3).m167isReadInh_f27i8$runtime_release(ReaderKind.m155constructorimpl(4))) {
                                }
                            }
                            Channel$default.mo5490trySendJP2dKIU(set2);
                            return;
                        }
                    }
                });
                Snapshot takeSnapshot2 = Snapshot.INSTANCE.takeSnapshot(function1);
                Function0<T> function02 = this.$block;
                try {
                    Snapshot makeCurrent2 = takeSnapshot2.makeCurrent();
                    try {
                        invoke = function02.invoke();
                        takeSnapshot2.dispose();
                        this.L$0 = r10;
                        this.L$1 = mutableScatterSet;
                        this.L$2 = function1;
                        this.L$3 = Channel$default;
                        this.L$4 = observerHandle;
                        this.L$5 = invoke;
                        this.label = 1;
                        if (r10.emit(invoke, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } finally {
                    }
                } finally {
                }
            }
            this.L$0 = r10;
            this.L$1 = mutableScatterSet;
            this.L$2 = function1;
            this.L$3 = Channel$default;
            this.L$4 = observerHandle;
            this.L$5 = invoke;
            this.I$0 = 0;
            this.label = 2;
            obj = Channel$default.receive(this);
            if (obj != coroutine_suspended) {
                r11 = r10;
                mutableScatterSet2 = mutableScatterSet;
                function12 = function1;
                channel = Channel$default;
                observerHandle2 = observerHandle;
                obj2 = invoke;
                i = 0;
                set = (Set) obj;
                do {
                    if (i == 0) {
                    }
                    i = 1;
                    set = (Set) ChannelResult.m5510getOrNullimpl(channel.mo5498tryReceivePtdJZtk());
                } while (set != null);
                if (i != 0) {
                }
                invoke = obj2;
                observerHandle = observerHandle2;
                Channel$default = channel;
                function1 = function12;
                mutableScatterSet = mutableScatterSet2;
                r10 = r11;
                this.L$0 = r10;
                this.L$1 = mutableScatterSet;
                this.L$2 = function1;
                this.L$3 = Channel$default;
                this.L$4 = observerHandle;
                this.L$5 = invoke;
                this.I$0 = 0;
                this.label = 2;
                obj = Channel$default.receive(this);
                if (obj != coroutine_suspended) {
                }
            }
            return coroutine_suspended;
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
