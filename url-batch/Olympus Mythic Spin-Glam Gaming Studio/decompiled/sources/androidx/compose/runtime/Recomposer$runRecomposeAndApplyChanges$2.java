package androidx.compose.runtime;

import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterSetKt;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.collection.ScatterSetWrapperKt;
import androidx.compose.runtime.internal.Trace;
import androidx.compose.runtime.snapshots.MutableSnapshot;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.TransparentObserverMutableSnapshot;
import androidx.compose.runtime.snapshots.TransparentObserverSnapshot;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: Recomposer.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "parentFrameClock", "Landroidx/compose/runtime/MonotonicFrameClock;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2", f = "Recomposer.kt", l = {587, 598}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class Recomposer$runRecomposeAndApplyChanges$2 extends SuspendLambda implements Function3 {
    /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    int label;
    final /* synthetic */ Recomposer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Recomposer$runRecomposeAndApplyChanges$2(Recomposer recomposer, Continuation continuation) {
        super(3, continuation);
        this.this$0 = recomposer;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(CoroutineScope coroutineScope, MonotonicFrameClock monotonicFrameClock, Continuation continuation) {
        Recomposer$runRecomposeAndApplyChanges$2 recomposer$runRecomposeAndApplyChanges$2 = new Recomposer$runRecomposeAndApplyChanges$2(this.this$0, continuation);
        recomposer$runRecomposeAndApplyChanges$2.L$0 = monotonicFrameClock;
        return recomposer$runRecomposeAndApplyChanges$2.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0166  */
    /* JADX WARN: Type inference failed for: r10v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v14, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v14, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v12, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v15, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0139 -> B:6:0x0142). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0151 -> B:7:0x014d). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        MonotonicFrameClock monotonicFrameClock;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        MutableScatterSet mutableScatterSetOf;
        MutableScatterSet mutableScatterSetOf2;
        MutableScatterSet mutableScatterSet;
        Set wrapIntoSet;
        MutableScatterSet mutableScatterSetOf3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        ArrayList arrayList6;
        MutableScatterSet mutableScatterSet2;
        MutableScatterSet mutableScatterSet3;
        Set set;
        MutableScatterSet mutableScatterSet4;
        boolean recordComposerModifications;
        boolean shouldKeepRecomposing;
        Object awaitWorkAvailable;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        char c = 2;
        int i2 = 1;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            monotonicFrameClock = (MonotonicFrameClock) this.L$0;
            arrayList = new ArrayList();
            arrayList2 = new ArrayList();
            arrayList3 = new ArrayList();
            mutableScatterSetOf = ScatterSetKt.mutableScatterSetOf();
            mutableScatterSetOf2 = ScatterSetKt.mutableScatterSetOf();
            mutableScatterSet = new MutableScatterSet(0, 1, null);
            wrapIntoSet = ScatterSetWrapperKt.wrapIntoSet(mutableScatterSet);
            mutableScatterSetOf3 = ScatterSetKt.mutableScatterSetOf();
            shouldKeepRecomposing = this.this$0.getShouldKeepRecomposing();
            if (!shouldKeepRecomposing) {
            }
        } else if (i == 1) {
            MutableScatterSet mutableScatterSet5 = (MutableScatterSet) this.L$8;
            Set set2 = (Set) this.L$7;
            MutableScatterSet mutableScatterSet6 = (MutableScatterSet) this.L$6;
            MutableScatterSet mutableScatterSet7 = (MutableScatterSet) this.L$5;
            MutableScatterSet mutableScatterSet8 = (MutableScatterSet) this.L$4;
            ?? r9 = (List) this.L$3;
            ?? r10 = (List) this.L$2;
            ?? r11 = (List) this.L$1;
            MonotonicFrameClock monotonicFrameClock2 = (MonotonicFrameClock) this.L$0;
            ResultKt.throwOnFailure(obj);
            arrayList6 = r9;
            arrayList5 = r10;
            arrayList4 = r11;
            set = set2;
            mutableScatterSet = mutableScatterSet6;
            mutableScatterSet3 = mutableScatterSet7;
            mutableScatterSet4 = mutableScatterSet5;
            monotonicFrameClock = monotonicFrameClock2;
            mutableScatterSet2 = mutableScatterSet8;
            recordComposerModifications = this.this$0.recordComposerModifications();
            if (recordComposerModifications) {
            }
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            MutableScatterSet mutableScatterSet9 = (MutableScatterSet) this.L$8;
            Set set3 = (Set) this.L$7;
            MutableScatterSet mutableScatterSet10 = (MutableScatterSet) this.L$6;
            MutableScatterSet mutableScatterSet11 = (MutableScatterSet) this.L$5;
            MutableScatterSet mutableScatterSet12 = (MutableScatterSet) this.L$4;
            ?? r92 = (List) this.L$3;
            ?? r102 = (List) this.L$2;
            ?? r112 = (List) this.L$1;
            MonotonicFrameClock monotonicFrameClock3 = (MonotonicFrameClock) this.L$0;
            ResultKt.throwOnFailure(obj);
            Object obj2 = coroutine_suspended;
            MutableScatterSet mutableScatterSet13 = mutableScatterSet12;
            char c2 = 2;
            MutableScatterSet mutableScatterSet14 = mutableScatterSet10;
            arrayList2 = r102;
            mutableScatterSetOf3 = mutableScatterSet9;
            monotonicFrameClock = monotonicFrameClock3;
            wrapIntoSet = set3;
            arrayList = r112;
            mutableScatterSetOf2 = mutableScatterSet11;
            arrayList3 = r92;
            this.this$0.discardUnusedMovableContentState();
            i2 = 1;
            char c3 = c2;
            mutableScatterSetOf = mutableScatterSet13;
            coroutine_suspended = obj2;
            mutableScatterSet = mutableScatterSet14;
            c = c3;
            shouldKeepRecomposing = this.this$0.getShouldKeepRecomposing();
            if (!shouldKeepRecomposing) {
                Recomposer recomposer = this.this$0;
                this.L$0 = monotonicFrameClock;
                this.L$1 = arrayList;
                this.L$2 = arrayList2;
                this.L$3 = arrayList3;
                this.L$4 = mutableScatterSetOf;
                this.L$5 = mutableScatterSetOf2;
                this.L$6 = mutableScatterSet;
                this.L$7 = wrapIntoSet;
                this.L$8 = mutableScatterSetOf3;
                this.label = i2;
                awaitWorkAvailable = recomposer.awaitWorkAvailable(this);
                if (awaitWorkAvailable == coroutine_suspended) {
                    return coroutine_suspended;
                }
                arrayList4 = arrayList;
                arrayList5 = arrayList2;
                arrayList6 = arrayList3;
                mutableScatterSet4 = mutableScatterSetOf3;
                mutableScatterSet2 = mutableScatterSetOf;
                Set set4 = wrapIntoSet;
                mutableScatterSet3 = mutableScatterSetOf2;
                set = set4;
                recordComposerModifications = this.this$0.recordComposerModifications();
                if (recordComposerModifications) {
                    MutableScatterSet mutableScatterSet15 = mutableScatterSet;
                    Object obj3 = coroutine_suspended;
                    MutableScatterSet mutableScatterSet16 = mutableScatterSet2;
                    mutableScatterSetOf3 = mutableScatterSet4;
                    MutableScatterSet mutableScatterSet17 = mutableScatterSet3;
                    wrapIntoSet = set;
                    mutableScatterSetOf2 = mutableScatterSet17;
                    arrayList = arrayList4;
                    arrayList3 = arrayList6;
                    i2 = 1;
                    c3 = c;
                    mutableScatterSetOf = mutableScatterSet16;
                    coroutine_suspended = obj3;
                    mutableScatterSet = mutableScatterSet15;
                    arrayList2 = arrayList5;
                    c = c3;
                    shouldKeepRecomposing = this.this$0.getShouldKeepRecomposing();
                    if (!shouldKeepRecomposing) {
                    }
                } else {
                    final Recomposer recomposer2 = this.this$0;
                    final MutableScatterSet mutableScatterSet18 = mutableScatterSet4;
                    final MutableScatterSet mutableScatterSet19 = mutableScatterSet;
                    final Set set5 = set;
                    final ArrayList arrayList7 = arrayList4;
                    MutableScatterSet mutableScatterSet20 = mutableScatterSet;
                    final ArrayList arrayList8 = arrayList5;
                    final MutableScatterSet mutableScatterSet21 = mutableScatterSet3;
                    final MutableScatterSet mutableScatterSet22 = mutableScatterSet2;
                    Object obj4 = coroutine_suspended;
                    mutableScatterSet13 = mutableScatterSet2;
                    final ArrayList arrayList9 = arrayList6;
                    ArrayList arrayList10 = arrayList6;
                    ArrayList arrayList11 = arrayList5;
                    Function1 function1 = new Function1() { // from class: androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            Unit invokeSuspend$lambda$22;
                            invokeSuspend$lambda$22 = Recomposer$runRecomposeAndApplyChanges$2.invokeSuspend$lambda$22(Recomposer.this, mutableScatterSet19, mutableScatterSet18, arrayList7, arrayList8, mutableScatterSet22, arrayList9, mutableScatterSet21, set5, ((Long) obj5).longValue());
                            return invokeSuspend$lambda$22;
                        }
                    };
                    this.L$0 = monotonicFrameClock;
                    this.L$1 = arrayList4;
                    this.L$2 = arrayList11;
                    this.L$3 = arrayList10;
                    this.L$4 = mutableScatterSet13;
                    this.L$5 = mutableScatterSet21;
                    this.L$6 = mutableScatterSet20;
                    this.L$7 = set5;
                    mutableScatterSetOf3 = mutableScatterSet18;
                    this.L$8 = mutableScatterSetOf3;
                    c2 = 2;
                    this.label = 2;
                    obj2 = obj4;
                    if (monotonicFrameClock.withFrameNanos(function1, this) == obj2) {
                        return obj2;
                    }
                    wrapIntoSet = set5;
                    mutableScatterSetOf2 = mutableScatterSet21;
                    arrayList = arrayList4;
                    arrayList3 = arrayList10;
                    arrayList2 = arrayList11;
                    mutableScatterSet14 = mutableScatterSet20;
                    this.this$0.discardUnusedMovableContentState();
                    i2 = 1;
                    char c32 = c2;
                    mutableScatterSetOf = mutableScatterSet13;
                    coroutine_suspended = obj2;
                    mutableScatterSet = mutableScatterSet14;
                    c = c32;
                    shouldKeepRecomposing = this.this$0.getShouldKeepRecomposing();
                    if (!shouldKeepRecomposing) {
                        return Unit.INSTANCE;
                    }
                }
            }
        }
    }

    private static final void invokeSuspend$clearRecompositionState(Recomposer recomposer, List list, List list2, List list3, MutableScatterSet mutableScatterSet, MutableScatterSet mutableScatterSet2, MutableScatterSet mutableScatterSet3, MutableScatterSet mutableScatterSet4) {
        synchronized (recomposer.stateLock) {
            try {
                list.clear();
                list2.clear();
                int size = list3.size();
                for (int i = 0; i < size; i++) {
                    ControlledComposition controlledComposition = (ControlledComposition) list3.get(i);
                    controlledComposition.abandonChanges();
                    recomposer.recordFailedCompositionLocked(controlledComposition);
                }
                list3.clear();
                Object[] objArr = mutableScatterSet.elements;
                long[] jArr = mutableScatterSet.metadata;
                int length = jArr.length - 2;
                long j = -9187201950435737472L;
                if (length >= 0) {
                    int i2 = 0;
                    while (true) {
                        long j2 = jArr[i2];
                        int i3 = length;
                        if ((((~j2) << 7) & j2 & j) != j) {
                            int i4 = 8 - ((~(i2 - i3)) >>> 31);
                            for (int i5 = 0; i5 < i4; i5++) {
                                if ((j2 & 255) < 128) {
                                    ControlledComposition controlledComposition2 = (ControlledComposition) objArr[(i2 << 3) + i5];
                                    controlledComposition2.abandonChanges();
                                    recomposer.recordFailedCompositionLocked(controlledComposition2);
                                }
                                j2 >>= 8;
                            }
                            if (i4 != 8) {
                                break;
                            }
                        }
                        length = i3;
                        if (i2 == length) {
                            break;
                        }
                        i2++;
                        j = -9187201950435737472L;
                    }
                }
                mutableScatterSet.clear();
                Object[] objArr2 = mutableScatterSet2.elements;
                long[] jArr2 = mutableScatterSet2.metadata;
                int length2 = jArr2.length - 2;
                if (length2 >= 0) {
                    int i6 = 0;
                    while (true) {
                        long j3 = jArr2[i6];
                        if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i7 = 8 - ((~(i6 - length2)) >>> 31);
                            for (int i8 = 0; i8 < i7; i8++) {
                                if ((j3 & 255) < 128) {
                                    ((ControlledComposition) objArr2[(i6 << 3) + i8]).changesApplied();
                                }
                                j3 >>= 8;
                            }
                            if (i7 != 8) {
                                break;
                            }
                        }
                        if (i6 == length2) {
                            break;
                        } else {
                            i6++;
                        }
                    }
                }
                mutableScatterSet2.clear();
                mutableScatterSet3.clear();
                Object[] objArr3 = mutableScatterSet4.elements;
                long[] jArr3 = mutableScatterSet4.metadata;
                int length3 = jArr3.length - 2;
                if (length3 >= 0) {
                    int i9 = 0;
                    while (true) {
                        long j4 = jArr3[i9];
                        if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i10 = 8 - ((~(i9 - length3)) >>> 31);
                            for (int i11 = 0; i11 < i10; i11++) {
                                if ((j4 & 255) < 128) {
                                    ControlledComposition controlledComposition3 = (ControlledComposition) objArr3[(i9 << 3) + i11];
                                    controlledComposition3.abandonChanges();
                                    recomposer.recordFailedCompositionLocked(controlledComposition3);
                                }
                                j4 >>= 8;
                            }
                            if (i10 != 8) {
                                break;
                            }
                        }
                        if (i9 == length3) {
                            break;
                        } else {
                            i9++;
                        }
                    }
                }
                mutableScatterSet4.clear();
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static final void invokeSuspend$fillToInsert(List list, Recomposer recomposer) {
        List list2;
        List list3;
        list.clear();
        synchronized (recomposer.stateLock) {
            try {
                list2 = recomposer.movableContentAwaitingInsert;
                int size = list2.size();
                for (int i = 0; i < size; i++) {
                    list.add((MovableContentStateReference) list2.get(i));
                }
                list3 = recomposer.movableContentAwaitingInsert;
                list3.clear();
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:211:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x03d8  */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v12, types: [androidx.compose.runtime.snapshots.Snapshot] */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15, types: [androidx.compose.runtime.snapshots.Snapshot] */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v20, types: [androidx.compose.runtime.snapshots.Snapshot] */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r11v23, types: [androidx.compose.runtime.snapshots.Snapshot] */
    /* JADX WARN: Type inference failed for: r11v24 */
    /* JADX WARN: Type inference failed for: r11v25 */
    /* JADX WARN: Type inference failed for: r11v29 */
    /* JADX WARN: Type inference failed for: r11v30 */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [androidx.collection.ScatterSet] */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v12, types: [androidx.compose.runtime.snapshots.Snapshot] */
    /* JADX WARN: Type inference failed for: r12v17, types: [int] */
    /* JADX WARN: Type inference failed for: r12v23 */
    /* JADX WARN: Type inference failed for: r12v24, types: [androidx.compose.runtime.snapshots.Snapshot] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9, types: [androidx.compose.runtime.snapshots.Snapshot] */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [androidx.collection.MutableScatterSet, androidx.collection.ScatterSet] */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r28v0, types: [androidx.collection.MutableScatterSet, androidx.collection.ScatterSet] */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18, types: [androidx.compose.runtime.snapshots.Snapshot] */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v25, types: [androidx.collection.MutableScatterSet] */
    /* JADX WARN: Type inference failed for: r6v40 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit invokeSuspend$lambda$22(Recomposer recomposer, MutableScatterSet mutableScatterSet, MutableScatterSet mutableScatterSet2, List list, List list2, MutableScatterSet mutableScatterSet3, List list3, MutableScatterSet mutableScatterSet4, Set set, long j) {
        boolean hasBroadcastFrameClockAwaiters;
        MutableVector mutableVector;
        MutableVector mutableVector2;
        Unit unit;
        List knownCompositionsLocked;
        MutableVector mutableVector3;
        boolean z;
        int i;
        List list4;
        List performInsertValues;
        MutableVector mutableVector4;
        ControlledComposition performRecompose;
        ?? r11;
        Snapshot snapshot;
        Snapshot snapshot2;
        Snapshot snapshot3;
        BroadcastFrameClock broadcastFrameClock;
        Collection collection = list2;
        ?? r12 = mutableScatterSet3;
        List list5 = list3;
        ?? r14 = mutableScatterSet4;
        ?? r0 = 1;
        hasBroadcastFrameClockAwaiters = recomposer.getHasBroadcastFrameClockAwaiters();
        if (hasBroadcastFrameClockAwaiters) {
            Trace trace = Trace.INSTANCE;
            Object beginSection = trace.beginSection("Recomposer:animation");
            try {
                broadcastFrameClock = recomposer.broadcastFrameClock;
                broadcastFrameClock.sendFrame(j);
                Snapshot.INSTANCE.sendApplyNotifications();
                Unit unit2 = Unit.INSTANCE;
                trace.endSection(beginSection);
            } finally {
                Trace.INSTANCE.endSection(beginSection);
            }
        }
        Object beginSection2 = Trace.INSTANCE.beginSection("Recomposer:recompose");
        try {
            recomposer.recordComposerModifications();
            synchronized (recomposer.stateLock) {
                try {
                    mutableVector = recomposer.compositionInvalidations;
                    Object[] objArr = mutableVector.content;
                    int size = mutableVector.getSize();
                    for (int i2 = 0; i2 < size; i2++) {
                        list.add((ControlledComposition) objArr[i2]);
                    }
                    mutableVector2 = recomposer.compositionInvalidations;
                    mutableVector2.clear();
                    Unit unit3 = Unit.INSTANCE;
                } finally {
                }
            }
            mutableScatterSet.clear();
            mutableScatterSet2.clear();
            while (true) {
                if (list.isEmpty() && collection.isEmpty()) {
                    break;
                }
                try {
                    int size2 = list.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        ControlledComposition controlledComposition = (ControlledComposition) list.get(i3);
                        performRecompose = recomposer.performRecompose(controlledComposition, mutableScatterSet);
                        if (performRecompose != null) {
                            list3.add(performRecompose);
                            Unit unit4 = Unit.INSTANCE;
                        }
                        mutableScatterSet2.add(controlledComposition);
                    }
                    list.clear();
                    if (!mutableScatterSet.isNotEmpty()) {
                        mutableVector4 = recomposer.compositionInvalidations;
                        if (mutableVector4.getSize() == 0) {
                            z = true;
                            if (list.isEmpty()) {
                                list4 = list2;
                            } else {
                                list4 = list2;
                                try {
                                    invokeSuspend$fillToInsert(list4, recomposer);
                                    while (!list4.isEmpty()) {
                                        performInsertValues = recomposer.performInsertValues(list4, mutableScatterSet);
                                        try {
                                            mutableScatterSet3.plusAssign((Iterable) performInsertValues);
                                            invokeSuspend$fillToInsert(list4, recomposer);
                                        } catch (Throwable th) {
                                            th = th;
                                            Recomposer.processCompositionError$default(recomposer, th, null, true, 2, null);
                                            invokeSuspend$clearRecompositionState(recomposer, list, list2, list3, mutableScatterSet3, mutableScatterSet4, mutableScatterSet, mutableScatterSet2);
                                            unit = Unit.INSTANCE;
                                            return unit;
                                        }
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                            }
                            r12 = mutableScatterSet3;
                            list5 = list3;
                            r14 = mutableScatterSet4;
                            r0 = z;
                            collection = list4;
                        }
                    }
                    synchronized (recomposer.stateLock) {
                        try {
                            knownCompositionsLocked = recomposer.knownCompositionsLocked();
                            int size3 = knownCompositionsLocked.size();
                            for (int i4 = 0; i4 < size3; i4++) {
                                ControlledComposition controlledComposition2 = (ControlledComposition) knownCompositionsLocked.get(i4);
                                if (!mutableScatterSet2.contains(controlledComposition2) && controlledComposition2.observesAnyOf(set)) {
                                    list.add(controlledComposition2);
                                }
                            }
                            mutableVector3 = recomposer.compositionInvalidations;
                            int size4 = mutableVector3.getSize();
                            int i5 = 0;
                            int i6 = 0;
                            while (i5 < size4) {
                                ControlledComposition controlledComposition3 = (ControlledComposition) mutableVector3.content[i5];
                                if (mutableScatterSet2.contains(controlledComposition3) || list.contains(controlledComposition3)) {
                                    if (i6 > 0) {
                                        Object[] objArr2 = mutableVector3.content;
                                        objArr2[i5 - i6] = objArr2[i5];
                                    }
                                    i = 1;
                                } else {
                                    list.add(controlledComposition3);
                                    i = 1;
                                    i6++;
                                }
                                i5 += i;
                            }
                            z = true;
                            int i7 = size4 - i6;
                            ArraysKt.fill(mutableVector3.content, (Object) null, i7, size4);
                            mutableVector3.setSize(i7);
                            Unit unit5 = Unit.INSTANCE;
                        } finally {
                        }
                    }
                    if (list.isEmpty()) {
                    }
                    r12 = mutableScatterSet3;
                    list5 = list3;
                    r14 = mutableScatterSet4;
                    r0 = z;
                    collection = list4;
                } catch (Throwable th3) {
                    try {
                        Recomposer.processCompositionError$default(recomposer, th3, null, true, 2, null);
                        invokeSuspend$clearRecompositionState(recomposer, list, list2, list3, mutableScatterSet3, mutableScatterSet4, mutableScatterSet, mutableScatterSet2);
                        unit = Unit.INSTANCE;
                        list.clear();
                        return unit;
                    } catch (Throwable th4) {
                        list.clear();
                        throw th4;
                    }
                }
            }
            Snapshot current = Snapshot.INSTANCE.getCurrent();
            ?? transparentObserverMutableSnapshot = current instanceof MutableSnapshot ? new TransparentObserverMutableSnapshot((MutableSnapshot) current, null, null, true, false) : new TransparentObserverSnapshot(current, null, r0, false);
            try {
                try {
                    Snapshot makeCurrent = transparentObserverMutableSnapshot.makeCurrent();
                    try {
                        if (list5.isEmpty()) {
                            r11 = transparentObserverMutableSnapshot;
                            snapshot2 = makeCurrent;
                        } else {
                            try {
                                try {
                                    recomposer.changeCount = recomposer.getChangeCount() + 1;
                                    try {
                                        try {
                                            int size5 = list5.size();
                                            for (int i8 = 0; i8 < size5; i8 += r0) {
                                                r14.add((ControlledComposition) list5.get(i8));
                                            }
                                            int size6 = list5.size();
                                            for (int i9 = 0; i9 < size6; i9 += r0) {
                                                ((ControlledComposition) list5.get(i9)).applyChanges();
                                            }
                                            try {
                                                list3.clear();
                                                r11 = transparentObserverMutableSnapshot;
                                                snapshot2 = makeCurrent;
                                            } catch (Throwable th5) {
                                                th = th5;
                                                r12 = makeCurrent;
                                                r11 = transparentObserverMutableSnapshot;
                                                r11.restoreCurrent(r12);
                                                throw th;
                                            }
                                        } catch (Throwable th6) {
                                            collection = transparentObserverMutableSnapshot;
                                            transparentObserverMutableSnapshot = 0;
                                            try {
                                                Recomposer.processCompositionError$default(recomposer, th6, null, false, 6, null);
                                                transparentObserverMutableSnapshot = mutableScatterSet4;
                                                invokeSuspend$clearRecompositionState(recomposer, list, list2, list3, mutableScatterSet3, transparentObserverMutableSnapshot, mutableScatterSet, mutableScatterSet2);
                                                unit = Unit.INSTANCE;
                                                try {
                                                    list3.clear();
                                                    collection.restoreCurrent(makeCurrent);
                                                    snapshot3 = collection;
                                                    snapshot3.dispose();
                                                    return unit;
                                                } catch (Throwable th7) {
                                                    th = th7;
                                                    snapshot = makeCurrent;
                                                    r11 = collection;
                                                    r12 = snapshot;
                                                    r11.restoreCurrent(r12);
                                                    throw th;
                                                }
                                            } catch (Throwable th8) {
                                                list3.clear();
                                                throw th8;
                                            }
                                        }
                                    } catch (Throwable th9) {
                                        th = th9;
                                        r12 = snapshot;
                                        r11.restoreCurrent(r12);
                                        throw th;
                                    }
                                } catch (Throwable th10) {
                                    th = th10;
                                    r11 = transparentObserverMutableSnapshot;
                                    snapshot = makeCurrent;
                                }
                            } catch (Throwable th11) {
                                th = th11;
                                r11 = transparentObserverMutableSnapshot;
                                snapshot = makeCurrent;
                            }
                        }
                        char c = 7;
                        if (mutableScatterSet3.isNotEmpty()) {
                            try {
                                try {
                                    r14.plusAssign(r12);
                                    Object[] objArr3 = r12.elements;
                                    long[] jArr = r12.metadata;
                                    int length = jArr.length - 2;
                                    if (length >= 0) {
                                        int i10 = length;
                                        int i11 = 0;
                                        while (true) {
                                            long j2 = jArr[i11];
                                            r12 = ((((~j2) << c) & j2 & (-9187201950435737472L)) > (-9187201950435737472L) ? 1 : ((((~j2) << c) & j2 & (-9187201950435737472L)) == (-9187201950435737472L) ? 0 : -1));
                                            if (r12 != 0) {
                                                int i12 = 8 - ((~(i11 - i10)) >>> 31);
                                                for (int i13 = 0; i13 < i12; i13++) {
                                                    if ((j2 & 255) < 128) {
                                                        ((ControlledComposition) objArr3[(i11 << 3) + i13]).applyLateChanges();
                                                    }
                                                    j2 >>= 8;
                                                }
                                                if (i12 != 8) {
                                                    break;
                                                }
                                            }
                                            int i14 = i10;
                                            if (i11 == i14) {
                                                break;
                                            }
                                            i11++;
                                            i10 = i14;
                                            c = 7;
                                        }
                                    }
                                } catch (Throwable th12) {
                                    r12 = snapshot2;
                                    try {
                                        Recomposer.processCompositionError$default(recomposer, th12, null, false, 6, null);
                                        invokeSuspend$clearRecompositionState(recomposer, list, list2, list3, mutableScatterSet3, mutableScatterSet4, mutableScatterSet, mutableScatterSet2);
                                        unit = Unit.INSTANCE;
                                        r11.restoreCurrent(r12);
                                        snapshot3 = r11;
                                        snapshot3.dispose();
                                        return unit;
                                    } finally {
                                        mutableScatterSet3.clear();
                                    }
                                }
                            } catch (Throwable th13) {
                                th = th13;
                                r11.restoreCurrent(r12);
                                throw th;
                            }
                        }
                        r12 = snapshot2;
                        if (mutableScatterSet4.isNotEmpty()) {
                            try {
                                Object[] objArr4 = r14.elements;
                                long[] jArr2 = r14.metadata;
                                int length2 = jArr2.length - 2;
                                if (length2 >= 0) {
                                    int i15 = 0;
                                    while (true) {
                                        long j3 = jArr2[i15];
                                        if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i16 = 8 - ((~(i15 - length2)) >>> 31);
                                            for (int i17 = 0; i17 < i16; i17++) {
                                                if ((j3 & 255) < 128) {
                                                    ((ControlledComposition) objArr4[(i15 << 3) + i17]).changesApplied();
                                                }
                                                j3 >>= 8;
                                            }
                                            if (i16 != 8) {
                                                break;
                                            }
                                        }
                                        if (i15 == length2) {
                                            break;
                                        }
                                        i15++;
                                    }
                                }
                            } catch (Throwable th14) {
                                try {
                                    Recomposer.processCompositionError$default(recomposer, th14, null, false, 6, null);
                                    invokeSuspend$clearRecompositionState(recomposer, list, list2, list3, mutableScatterSet3, mutableScatterSet4, mutableScatterSet, mutableScatterSet2);
                                    unit = Unit.INSTANCE;
                                    r11.restoreCurrent(r12);
                                    snapshot3 = r11;
                                    snapshot3.dispose();
                                    return unit;
                                } finally {
                                    mutableScatterSet4.clear();
                                }
                            }
                        }
                        Unit unit6 = Unit.INSTANCE;
                        r11.restoreCurrent(r12);
                        r11.dispose();
                        synchronized (recomposer.stateLock) {
                            recomposer.deriveStateLocked();
                        }
                        Snapshot.INSTANCE.notifyObjectsInitialized();
                        mutableScatterSet2.clear();
                        mutableScatterSet.clear();
                        recomposer.compositionsRemoved = null;
                        Trace.INSTANCE.endSection(beginSection2);
                        return Unit.INSTANCE;
                    } catch (Throwable th15) {
                        th = th15;
                        r12 = makeCurrent;
                    }
                } catch (Throwable th16) {
                    th = th16;
                    collection = transparentObserverMutableSnapshot;
                    collection.dispose();
                    throw th;
                }
            } catch (Throwable th17) {
                th = th17;
                collection.dispose();
                throw th;
            }
        } catch (Throwable th18) {
            throw th18;
        }
    }
}
