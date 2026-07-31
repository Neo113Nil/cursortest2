package androidx.compose.runtime;

import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterSet;
import androidx.compose.runtime.collection.ScatterSetWrapper;
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

/* compiled from: SnapshotFlow.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/flow/FlowCollector;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1", f = "SnapshotFlow.kt", l = {143, 147, 170}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1 extends SuspendLambda implements Function2 {
    final /* synthetic */ Function0 $block;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1(Function0 function0, Continuation continuation) {
        super(2, continuation);
        this.$block = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1 snapshotStateKt__SnapshotFlowKt$snapshotFlow$1 = new SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1(this.$block, continuation);
        snapshotStateKt__SnapshotFlowKt$snapshotFlow$1.L$0 = obj;
        return snapshotStateKt__SnapshotFlowKt$snapshotFlow$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FlowCollector flowCollector, Continuation continuation) {
        return ((SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$2(Channel channel, Set set, Snapshot snapshot) {
        if (set instanceof ScatterSetWrapper) {
            ScatterSet set2 = ((ScatterSetWrapper) set).getSet();
            Object[] objArr = set2.elements;
            long[] jArr = set2.metadata;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                loop0: while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                Object obj = objArr[(i << 3) + i3];
                                if (!(obj instanceof StateObjectImpl) || ((StateObjectImpl) obj).m1225isReadInh_f27i8$runtime(ReaderKind.m1215constructorimpl(4))) {
                                    break loop0;
                                }
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        }
                    }
                    if (i == length) {
                        break;
                    }
                    i++;
                }
            }
        } else {
            Set set3 = set;
            if (!(set3 instanceof Collection) || !set3.isEmpty()) {
                for (Object obj2 : set3) {
                    if ((obj2 instanceof StateObjectImpl) && !((StateObjectImpl) obj2).m1225isReadInh_f27i8$runtime(ReaderKind.m1215constructorimpl(4))) {
                    }
                    channel.mo8216trySendJP2dKIU(set);
                }
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00d5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00e1 A[Catch: all -> 0x0055, TryCatch #1 {all -> 0x0055, blocks: (B:14:0x00dd, B:16:0x00e1, B:20:0x00eb, B:24:0x00f9, B:30:0x010f, B:32:0x0118, B:42:0x0134, B:43:0x0137, B:56:0x0050, B:26:0x0104, B:29:0x010c, B:38:0x0130, B:39:0x0133), top: B:55:0x0050, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00f9 A[Catch: all -> 0x0055, TRY_LEAVE, TryCatch #1 {all -> 0x0055, blocks: (B:14:0x00dd, B:16:0x00e1, B:20:0x00eb, B:24:0x00f9, B:30:0x010f, B:32:0x0118, B:42:0x0134, B:43:0x0137, B:56:0x0050, B:26:0x0104, B:29:0x010c, B:38:0x0130, B:39:0x0133), top: B:55:0x0050, inners: #2 }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ObserverHandle observerHandle;
        FlowCollector flowCollector;
        final MutableScatterSet mutableScatterSet;
        Function1 function1;
        final Channel Channel$default;
        Snapshot takeSnapshot;
        Snapshot makeCurrent;
        Object mo4828invoke;
        ObserverHandle observerHandle2;
        FlowCollector flowCollector2;
        MutableScatterSet mutableScatterSet2;
        Function1 function12;
        Channel channel;
        Object obj2;
        int i;
        Set set;
        boolean intersects$SnapshotStateKt__SnapshotFlowKt;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.label;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    mo4828invoke = this.L$5;
                    observerHandle = (ObserverHandle) this.L$4;
                    Channel$default = (Channel) this.L$3;
                    function1 = (Function1) this.L$2;
                    mutableScatterSet = (MutableScatterSet) this.L$1;
                    flowCollector = (FlowCollector) this.L$0;
                } else if (i2 == 2) {
                    i = this.I$0;
                    obj2 = this.L$5;
                    observerHandle2 = (ObserverHandle) this.L$4;
                    channel = (Channel) this.L$3;
                    function12 = (Function1) this.L$2;
                    mutableScatterSet2 = (MutableScatterSet) this.L$1;
                    flowCollector2 = (FlowCollector) this.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                        set = (Set) obj;
                        do {
                            if (i == 0) {
                                intersects$SnapshotStateKt__SnapshotFlowKt = SnapshotStateKt__SnapshotFlowKt.intersects$SnapshotStateKt__SnapshotFlowKt(mutableScatterSet2, set);
                                if (!intersects$SnapshotStateKt__SnapshotFlowKt) {
                                    i = 0;
                                    set = (Set) ChannelResult.m8223getOrNullimpl(channel.mo8215tryReceivePtdJZtk());
                                }
                            }
                            i = 1;
                            set = (Set) ChannelResult.m8223getOrNullimpl(channel.mo8215tryReceivePtdJZtk());
                        } while (set != null);
                        if (i != 0) {
                            try {
                                mutableScatterSet2.clear();
                                takeSnapshot = Snapshot.INSTANCE.takeSnapshot(function12);
                                Function0 function0 = this.$block;
                                try {
                                    mo4828invoke = function0.mo4828invoke();
                                    takeSnapshot.dispose();
                                    if (!Intrinsics.areEqual(mo4828invoke, obj2)) {
                                        this.L$0 = flowCollector2;
                                        this.L$1 = mutableScatterSet2;
                                        this.L$2 = function12;
                                        this.L$3 = channel;
                                        this.L$4 = observerHandle2;
                                        this.L$5 = mo4828invoke;
                                        this.label = 3;
                                        if (flowCollector2.emit(mo4828invoke, this) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        observerHandle = observerHandle2;
                                        Channel$default = channel;
                                        function1 = function12;
                                        mutableScatterSet = mutableScatterSet2;
                                        flowCollector = flowCollector2;
                                    }
                                } finally {
                                }
                            } finally {
                            }
                            makeCurrent = takeSnapshot.makeCurrent();
                        }
                        mo4828invoke = obj2;
                        observerHandle = observerHandle2;
                        Channel$default = channel;
                        function1 = function12;
                        mutableScatterSet = mutableScatterSet2;
                        flowCollector = flowCollector2;
                    } catch (Throwable th) {
                        th = th;
                        observerHandle = observerHandle2;
                        observerHandle.dispose();
                        throw th;
                    }
                } else {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    mo4828invoke = this.L$5;
                    observerHandle = (ObserverHandle) this.L$4;
                    Channel$default = (Channel) this.L$3;
                    function1 = (Function1) this.L$2;
                    mutableScatterSet = (MutableScatterSet) this.L$1;
                    flowCollector = (FlowCollector) this.L$0;
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                flowCollector = (FlowCollector) this.L$0;
                mutableScatterSet = new MutableScatterSet(0, 1, null);
                function1 = new Function1() { // from class: androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        Unit invokeSuspend$lambda$0;
                        invokeSuspend$lambda$0 = SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1.invokeSuspend$lambda$0(MutableScatterSet.this, obj3);
                        return invokeSuspend$lambda$0;
                    }
                };
                Channel$default = ChannelKt.Channel$default(Integer.MAX_VALUE, null, null, 6, null);
                Snapshot.Companion companion = Snapshot.INSTANCE;
                observerHandle = companion.registerApplyObserver(new Function2() { // from class: androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj3, Object obj4) {
                        Unit invokeSuspend$lambda$2;
                        invokeSuspend$lambda$2 = SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1.invokeSuspend$lambda$2(Channel.this, (Set) obj3, (Snapshot) obj4);
                        return invokeSuspend$lambda$2;
                    }
                });
                takeSnapshot = companion.takeSnapshot(function1);
                Function0 function02 = this.$block;
                try {
                    makeCurrent = takeSnapshot.makeCurrent();
                    try {
                        mo4828invoke = function02.mo4828invoke();
                        takeSnapshot.dispose();
                        this.L$0 = flowCollector;
                        this.L$1 = mutableScatterSet;
                        this.L$2 = function1;
                        this.L$3 = Channel$default;
                        this.L$4 = observerHandle;
                        this.L$5 = mo4828invoke;
                        this.label = 1;
                        if (flowCollector.emit(mo4828invoke, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } finally {
                    }
                } finally {
                }
            }
            this.L$0 = flowCollector;
            this.L$1 = mutableScatterSet;
            this.L$2 = function1;
            this.L$3 = Channel$default;
            this.L$4 = observerHandle;
            this.L$5 = mo4828invoke;
            this.I$0 = 0;
            this.label = 2;
            obj = Channel$default.receive(this);
            if (obj != coroutine_suspended) {
                return coroutine_suspended;
            }
            flowCollector2 = flowCollector;
            mutableScatterSet2 = mutableScatterSet;
            function12 = function1;
            channel = Channel$default;
            observerHandle2 = observerHandle;
            obj2 = mo4828invoke;
            i = 0;
            set = (Set) obj;
            do {
                if (i == 0) {
                }
                i = 1;
                set = (Set) ChannelResult.m8223getOrNullimpl(channel.mo8215tryReceivePtdJZtk());
            } while (set != null);
            if (i != 0) {
            }
            mo4828invoke = obj2;
            observerHandle = observerHandle2;
            Channel$default = channel;
            function1 = function12;
            mutableScatterSet = mutableScatterSet2;
            flowCollector = flowCollector2;
            this.L$0 = flowCollector;
            this.L$1 = mutableScatterSet;
            this.L$2 = function1;
            this.L$3 = Channel$default;
            this.L$4 = observerHandle;
            this.L$5 = mo4828invoke;
            this.I$0 = 0;
            this.label = 2;
            obj = Channel$default.receive(this);
            if (obj != coroutine_suspended) {
            }
        } catch (Throwable th2) {
            th = th2;
            observerHandle.dispose();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(MutableScatterSet mutableScatterSet, Object obj) {
        if (obj instanceof StateObjectImpl) {
            ((StateObjectImpl) obj).m1226recordReadInh_f27i8$runtime(ReaderKind.m1215constructorimpl(4));
        }
        mutableScatterSet.add(obj);
        return Unit.INSTANCE;
    }
}
