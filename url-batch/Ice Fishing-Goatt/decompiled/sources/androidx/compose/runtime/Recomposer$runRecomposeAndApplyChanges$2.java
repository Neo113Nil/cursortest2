package androidx.compose.runtime;

import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterSetKt;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.collection.ScatterSetWrapperKt;
import androidx.compose.runtime.snapshots.Snapshot;
import java.util.ArrayList;
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
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "parentFrameClock", "Landroidx/compose/runtime/MonotonicFrameClock;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2", f = "Recomposer.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1}, l = {574, 585}, m = "invokeSuspend", n = {"parentFrameClock", "toRecompose", "toInsert", "toApply", "toLateApply", "toComplete", "modifiedValues", "modifiedValuesSet", "alreadyComposed", "parentFrameClock", "toRecompose", "toInsert", "toApply", "toLateApply", "toComplete", "modifiedValues", "modifiedValuesSet", "alreadyComposed"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8"})
/* loaded from: classes.dex */
final class Recomposer$runRecomposeAndApplyChanges$2 extends SuspendLambda implements Function3<CoroutineScope, MonotonicFrameClock, Continuation<? super Unit>, Object> {
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
    Recomposer$runRecomposeAndApplyChanges$2(Recomposer recomposer, Continuation<? super Recomposer$runRecomposeAndApplyChanges$2> continuation) {
        super(3, continuation);
        this.this$0 = recomposer;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(CoroutineScope coroutineScope, MonotonicFrameClock monotonicFrameClock, Continuation<? super Unit> continuation) {
        Recomposer$runRecomposeAndApplyChanges$2 recomposer$runRecomposeAndApplyChanges$2 = new Recomposer$runRecomposeAndApplyChanges$2(this.this$0, continuation);
        recomposer$runRecomposeAndApplyChanges$2.L$0 = monotonicFrameClock;
        return recomposer$runRecomposeAndApplyChanges$2.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00bd  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0112 -> B:6:0x011a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0120 -> B:7:0x00b5). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        MonotonicFrameClock monotonicFrameClock;
        MutableScatterSet mutableScatterSetOf;
        MutableScatterSet mutableScatterSetOf2;
        List list;
        Set set;
        final List list2;
        MutableScatterSet mutableScatterSet;
        List list3;
        MutableScatterSet mutableScatterSet2;
        final List list4;
        final MutableScatterSet mutableScatterSet3;
        final List list5;
        final MutableScatterSet mutableScatterSet4;
        boolean recordComposerModifications;
        boolean shouldKeepRecomposing;
        Object awaitWorkAvailable;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            monotonicFrameClock = (MonotonicFrameClock) this.L$0;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            mutableScatterSetOf = ScatterSetKt.mutableScatterSetOf();
            MutableScatterSet mutableScatterSetOf3 = ScatterSetKt.mutableScatterSetOf();
            MutableScatterSet mutableScatterSet5 = new MutableScatterSet(0, 1, null);
            Set wrapIntoSet = ScatterSetWrapperKt.wrapIntoSet(mutableScatterSet5);
            mutableScatterSetOf2 = ScatterSetKt.mutableScatterSetOf();
            list = arrayList;
            set = wrapIntoSet;
            list2 = arrayList2;
            mutableScatterSet = mutableScatterSet5;
            list3 = arrayList3;
            mutableScatterSet2 = mutableScatterSetOf3;
            shouldKeepRecomposing = this.this$0.getShouldKeepRecomposing();
            if (!shouldKeepRecomposing) {
            }
        } else if (i == 1) {
            MutableScatterSet mutableScatterSet6 = (MutableScatterSet) this.L$8;
            set = (Set) this.L$7;
            mutableScatterSet = (MutableScatterSet) this.L$6;
            mutableScatterSet2 = (MutableScatterSet) this.L$5;
            MutableScatterSet mutableScatterSet7 = (MutableScatterSet) this.L$4;
            List list6 = (List) this.L$3;
            list2 = (List) this.L$2;
            List list7 = (List) this.L$1;
            MonotonicFrameClock monotonicFrameClock2 = (MonotonicFrameClock) this.L$0;
            ResultKt.throwOnFailure(obj);
            mutableScatterSet4 = mutableScatterSet6;
            monotonicFrameClock = monotonicFrameClock2;
            list4 = list6;
            list5 = list7;
            mutableScatterSet3 = mutableScatterSet7;
            final Set set2 = set;
            final MutableScatterSet mutableScatterSet8 = mutableScatterSet2;
            final MutableScatterSet mutableScatterSet9 = mutableScatterSet;
            recordComposerModifications = this.this$0.recordComposerModifications();
            if (recordComposerModifications) {
            }
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            MutableScatterSet mutableScatterSet10 = (MutableScatterSet) this.L$8;
            set = (Set) this.L$7;
            mutableScatterSet = (MutableScatterSet) this.L$6;
            mutableScatterSet2 = (MutableScatterSet) this.L$5;
            mutableScatterSetOf = (MutableScatterSet) this.L$4;
            list3 = (List) this.L$3;
            list2 = (List) this.L$2;
            list = (List) this.L$1;
            MonotonicFrameClock monotonicFrameClock3 = (MonotonicFrameClock) this.L$0;
            ResultKt.throwOnFailure(obj);
            mutableScatterSetOf2 = mutableScatterSet10;
            monotonicFrameClock = monotonicFrameClock3;
            this.this$0.discardUnusedValues();
            shouldKeepRecomposing = this.this$0.getShouldKeepRecomposing();
            if (!shouldKeepRecomposing) {
                this.L$0 = monotonicFrameClock;
                this.L$1 = list;
                this.L$2 = list2;
                this.L$3 = list3;
                this.L$4 = mutableScatterSetOf;
                this.L$5 = mutableScatterSet2;
                this.L$6 = mutableScatterSet;
                this.L$7 = set;
                this.L$8 = mutableScatterSetOf2;
                this.label = 1;
                awaitWorkAvailable = this.this$0.awaitWorkAvailable(this);
                if (awaitWorkAvailable != coroutine_suspended) {
                    List list8 = list;
                    mutableScatterSet3 = mutableScatterSetOf;
                    mutableScatterSet4 = mutableScatterSetOf2;
                    list4 = list3;
                    list5 = list8;
                    final Set set22 = set;
                    final MutableScatterSet mutableScatterSet82 = mutableScatterSet2;
                    final MutableScatterSet mutableScatterSet92 = mutableScatterSet;
                    recordComposerModifications = this.this$0.recordComposerModifications();
                    if (recordComposerModifications) {
                        List list9 = list4;
                        mutableScatterSetOf2 = mutableScatterSet4;
                        mutableScatterSetOf = mutableScatterSet3;
                        list = list5;
                        list3 = list9;
                        mutableScatterSet = mutableScatterSet92;
                        mutableScatterSet2 = mutableScatterSet82;
                        set = set22;
                        shouldKeepRecomposing = this.this$0.getShouldKeepRecomposing();
                        if (!shouldKeepRecomposing) {
                        }
                    } else {
                        final Recomposer recomposer = this.this$0;
                        this.L$0 = monotonicFrameClock;
                        this.L$1 = list5;
                        this.L$2 = list2;
                        this.L$3 = list4;
                        this.L$4 = mutableScatterSet3;
                        this.L$5 = mutableScatterSet82;
                        this.L$6 = mutableScatterSet92;
                        this.L$7 = set22;
                        this.L$8 = mutableScatterSet4;
                        this.label = 2;
                        if (monotonicFrameClock.withFrameNanos(new Function1<Long, Unit>() { // from class: androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Long l) {
                                invoke(l.longValue());
                                return Unit.INSTANCE;
                            }

                            /* JADX WARN: Removed duplicated region for block: B:193:0x02f1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                            /* JADX WARN: Removed duplicated region for block: B:204:0x031d A[SYNTHETIC] */
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final void invoke(long j) {
                                boolean hasBroadcastFrameClockAwaiters;
                                Object beginSection;
                                List<ControlledComposition> list10;
                                Set<? extends Object> set3;
                                Set<? extends Object> set4;
                                List performInsertValues;
                                ControlledComposition performRecompose;
                                MutableScatterSet<Object> mutableScatterSet11;
                                char c;
                                long j2;
                                Recomposer recomposer2;
                                List<ControlledComposition> list11;
                                BroadcastFrameClock broadcastFrameClock;
                                hasBroadcastFrameClockAwaiters = Recomposer.this.getHasBroadcastFrameClockAwaiters();
                                if (hasBroadcastFrameClockAwaiters) {
                                    Recomposer recomposer3 = Recomposer.this;
                                    beginSection = Trace.INSTANCE.beginSection("Recomposer:animation");
                                    try {
                                        broadcastFrameClock = recomposer3.broadcastFrameClock;
                                        broadcastFrameClock.sendFrame(j);
                                        Snapshot.INSTANCE.sendApplyNotifications();
                                        Unit unit = Unit.INSTANCE;
                                    } finally {
                                    }
                                }
                                Recomposer recomposer4 = Recomposer.this;
                                MutableScatterSet<Object> mutableScatterSet12 = mutableScatterSet92;
                                MutableScatterSet<ControlledComposition> mutableScatterSet13 = mutableScatterSet4;
                                List<ControlledComposition> list12 = list5;
                                List<MovableContentStateReference> list13 = list2;
                                MutableScatterSet<ControlledComposition> mutableScatterSet14 = mutableScatterSet3;
                                List<ControlledComposition> list14 = list4;
                                MutableScatterSet<ControlledComposition> mutableScatterSet15 = mutableScatterSet82;
                                Set<? extends Object> set5 = set22;
                                beginSection = Trace.INSTANCE.beginSection("Recomposer:recompose");
                                try {
                                    recomposer4.recordComposerModifications();
                                    synchronized (recomposer4.stateLock) {
                                        MutableVector mutableVector = recomposer4.compositionInvalidations;
                                        int size = mutableVector.getSize();
                                        if (size > 0) {
                                            Object[] content = mutableVector.getContent();
                                            int i2 = 0;
                                            do {
                                                list12.add((ControlledComposition) content[i2]);
                                                i2++;
                                            } while (i2 < size);
                                        }
                                        recomposer4.compositionInvalidations.clear();
                                        Unit unit2 = Unit.INSTANCE;
                                    }
                                    mutableScatterSet12.clear();
                                    mutableScatterSet13.clear();
                                    while (true) {
                                        if (list12.isEmpty() && list13.isEmpty()) {
                                            break;
                                        }
                                        try {
                                            try {
                                                int size2 = list12.size();
                                                for (int i3 = 0; i3 < size2; i3++) {
                                                    ControlledComposition controlledComposition = list12.get(i3);
                                                    performRecompose = recomposer4.performRecompose(controlledComposition, mutableScatterSet12);
                                                    if (performRecompose != null) {
                                                        list14.add(performRecompose);
                                                        Unit unit3 = Unit.INSTANCE;
                                                        Unit unit4 = Unit.INSTANCE;
                                                    }
                                                    mutableScatterSet13.add(controlledComposition);
                                                }
                                                list12.clear();
                                                if (!mutableScatterSet12.isNotEmpty() && !recomposer4.compositionInvalidations.isNotEmpty()) {
                                                    set3 = set5;
                                                    if (!list12.isEmpty()) {
                                                        try {
                                                            Recomposer$runRecomposeAndApplyChanges$2.invokeSuspend$fillToInsert(list13, recomposer4);
                                                            while (!list13.isEmpty()) {
                                                                performInsertValues = recomposer4.performInsertValues(list13, mutableScatterSet12);
                                                                mutableScatterSet14.plusAssign(performInsertValues);
                                                                Recomposer$runRecomposeAndApplyChanges$2.invokeSuspend$fillToInsert(list13, recomposer4);
                                                            }
                                                        } catch (Exception e) {
                                                            Recomposer.processCompositionError$default(recomposer4, e, null, true, 2, null);
                                                            Recomposer$runRecomposeAndApplyChanges$2.invokeSuspend$clearRecompositionState(recomposer4, list12, list13, list14, mutableScatterSet14, mutableScatterSet15, mutableScatterSet12, mutableScatterSet13);
                                                        }
                                                    }
                                                    set5 = set3;
                                                }
                                                synchronized (recomposer4.stateLock) {
                                                    List knownCompositions = recomposer4.getKnownCompositions();
                                                    int size3 = knownCompositions.size();
                                                    for (int i4 = 0; i4 < size3; i4++) {
                                                        ControlledComposition controlledComposition2 = (ControlledComposition) knownCompositions.get(i4);
                                                        if (!mutableScatterSet13.contains(controlledComposition2) && controlledComposition2.observesAnyOf(set5)) {
                                                            list12.add(controlledComposition2);
                                                        }
                                                    }
                                                    MutableVector mutableVector2 = recomposer4.compositionInvalidations;
                                                    int size4 = mutableVector2.getSize();
                                                    int i5 = 0;
                                                    int i6 = 0;
                                                    while (i5 < size4) {
                                                        ControlledComposition controlledComposition3 = (ControlledComposition) mutableVector2.getContent()[i5];
                                                        if (mutableScatterSet13.contains(controlledComposition3) || list12.contains(controlledComposition3)) {
                                                            set4 = set5;
                                                            if (i6 > 0) {
                                                                mutableVector2.getContent()[i5 - i6] = mutableVector2.getContent()[i5];
                                                            }
                                                        } else {
                                                            set4 = set5;
                                                            list12.add(controlledComposition3);
                                                            i6++;
                                                        }
                                                        i5++;
                                                        set5 = set4;
                                                    }
                                                    set3 = set5;
                                                    int i7 = size4 - i6;
                                                    ArraysKt.fill(mutableVector2.getContent(), (Object) null, i7, size4);
                                                    mutableVector2.setSize(i7);
                                                    Unit unit5 = Unit.INSTANCE;
                                                }
                                                if (!list12.isEmpty()) {
                                                }
                                                set5 = set3;
                                            } catch (Throwable th) {
                                                th = th;
                                                list10 = list12;
                                                list10.clear();
                                                throw th;
                                            }
                                        } catch (Exception e2) {
                                            Recomposer.processCompositionError$default(recomposer4, e2, null, true, 2, null);
                                            list10 = list12;
                                            try {
                                                Recomposer$runRecomposeAndApplyChanges$2.invokeSuspend$clearRecompositionState(recomposer4, list10, list13, list14, mutableScatterSet14, mutableScatterSet15, mutableScatterSet12, mutableScatterSet13);
                                                list10.clear();
                                            } catch (Throwable th2) {
                                                th = th2;
                                                list10.clear();
                                                throw th;
                                            }
                                        }
                                    }
                                    if (!list14.isEmpty()) {
                                        recomposer4.changeCount = recomposer4.getChangeCount() + 1;
                                        try {
                                            try {
                                                int size5 = list14.size();
                                                for (int i8 = 0; i8 < size5; i8++) {
                                                    mutableScatterSet15.add(list14.get(i8));
                                                }
                                                int size6 = list14.size();
                                                for (int i9 = 0; i9 < size6; i9++) {
                                                    list14.get(i9).applyChanges();
                                                }
                                                list14.clear();
                                            } catch (Exception e3) {
                                                Recomposer.processCompositionError$default(recomposer4, e3, null, false, 6, null);
                                                try {
                                                    Recomposer$runRecomposeAndApplyChanges$2.invokeSuspend$clearRecompositionState(recomposer4, list12, list13, list14, mutableScatterSet14, mutableScatterSet15, mutableScatterSet12, mutableScatterSet13);
                                                    list14.clear();
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                    list11 = list14;
                                                    list11.clear();
                                                    throw th;
                                                }
                                            }
                                        } catch (Throwable th4) {
                                            th = th4;
                                            list11 = list14;
                                            list11.clear();
                                            throw th;
                                        }
                                    }
                                    long j3 = 255;
                                    try {
                                        if (mutableScatterSet14.isNotEmpty()) {
                                            try {
                                                mutableScatterSet15.plusAssign(mutableScatterSet14);
                                                MutableScatterSet<ControlledComposition> mutableScatterSet16 = mutableScatterSet14;
                                                c = 7;
                                                Object[] objArr = mutableScatterSet16.elements;
                                                long[] jArr = mutableScatterSet16.metadata;
                                                j2 = 128;
                                                int length = jArr.length - 2;
                                                if (length >= 0) {
                                                    int i10 = 0;
                                                    while (true) {
                                                        int i11 = length;
                                                        long j4 = jArr[i10];
                                                        mutableScatterSet11 = mutableScatterSet12;
                                                        if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                            int i12 = 8 - ((~(i10 - i11)) >>> 31);
                                                            for (int i13 = 0; i13 < i12; i13++) {
                                                                if ((j4 & 255) < 128) {
                                                                    try {
                                                                        ((ControlledComposition) objArr[(i10 << 3) + i13]).applyLateChanges();
                                                                    } catch (Exception e4) {
                                                                        e = e4;
                                                                        Recomposer.processCompositionError$default(recomposer4, e, null, false, 6, null);
                                                                        try {
                                                                            Recomposer$runRecomposeAndApplyChanges$2.invokeSuspend$clearRecompositionState(recomposer4, list12, list13, list14, mutableScatterSet14, mutableScatterSet15, mutableScatterSet11, mutableScatterSet13);
                                                                            mutableScatterSet14.clear();
                                                                        } catch (Throwable th5) {
                                                                            th = th5;
                                                                            mutableScatterSet14 = mutableScatterSet14;
                                                                            mutableScatterSet14.clear();
                                                                            throw th;
                                                                        }
                                                                    }
                                                                }
                                                                j4 >>= 8;
                                                            }
                                                            if (i12 != 8) {
                                                                break;
                                                            }
                                                        }
                                                        length = i11;
                                                        if (i10 == length) {
                                                            break;
                                                        }
                                                        i10++;
                                                        mutableScatterSet12 = mutableScatterSet11;
                                                    }
                                                } else {
                                                    mutableScatterSet11 = mutableScatterSet12;
                                                }
                                                mutableScatterSet14.clear();
                                                mutableScatterSet12 = mutableScatterSet11;
                                            } catch (Exception e5) {
                                                e = e5;
                                                mutableScatterSet11 = mutableScatterSet12;
                                            }
                                        } else {
                                            c = 7;
                                            j2 = 128;
                                        }
                                        if (mutableScatterSet15.isNotEmpty()) {
                                            try {
                                                try {
                                                    MutableScatterSet<ControlledComposition> mutableScatterSet17 = mutableScatterSet15;
                                                    Object[] objArr2 = mutableScatterSet17.elements;
                                                    long[] jArr2 = mutableScatterSet17.metadata;
                                                    int length2 = jArr2.length - 2;
                                                    if (length2 >= 0) {
                                                        int i14 = 0;
                                                        while (true) {
                                                            long j5 = jArr2[i14];
                                                            recomposer2 = recomposer4;
                                                            Object[] objArr3 = objArr2;
                                                            if ((((~j5) << c) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                int i15 = 8 - ((~(i14 - length2)) >>> 31);
                                                                int i16 = 0;
                                                                while (i16 < i15) {
                                                                    if ((j5 & j3) < j2) {
                                                                        try {
                                                                            ((ControlledComposition) objArr3[(i14 << 3) + i16]).changesApplied();
                                                                        } catch (Exception e6) {
                                                                            e = e6;
                                                                            Recomposer recomposer5 = recomposer2;
                                                                            Recomposer.processCompositionError$default(recomposer5, e, null, false, 6, null);
                                                                            try {
                                                                                Recomposer$runRecomposeAndApplyChanges$2.invokeSuspend$clearRecompositionState(recomposer5, list12, list13, list14, mutableScatterSet14, mutableScatterSet15, mutableScatterSet12, mutableScatterSet13);
                                                                                mutableScatterSet15.clear();
                                                                            } catch (Throwable th6) {
                                                                                th = th6;
                                                                                mutableScatterSet15 = mutableScatterSet15;
                                                                                mutableScatterSet15.clear();
                                                                                throw th;
                                                                            }
                                                                        }
                                                                    }
                                                                    j5 >>= 8;
                                                                    i16++;
                                                                    j3 = 255;
                                                                }
                                                                if (i15 != 8) {
                                                                    break;
                                                                }
                                                            }
                                                            if (i14 == length2) {
                                                                break;
                                                            }
                                                            i14++;
                                                            recomposer4 = recomposer2;
                                                            objArr2 = objArr3;
                                                            j3 = 255;
                                                        }
                                                    } else {
                                                        recomposer2 = recomposer4;
                                                    }
                                                    mutableScatterSet15.clear();
                                                    recomposer4 = recomposer2;
                                                } catch (Exception e7) {
                                                    e = e7;
                                                    recomposer2 = recomposer4;
                                                }
                                            } catch (Throwable th7) {
                                                th = th7;
                                                mutableScatterSet15.clear();
                                                throw th;
                                            }
                                        }
                                        synchronized (recomposer4.stateLock) {
                                            recomposer4.deriveStateLocked();
                                        }
                                        Snapshot.INSTANCE.notifyObjectsInitialized();
                                        mutableScatterSet13.clear();
                                        mutableScatterSet12.clear();
                                        recomposer4.compositionsRemoved = null;
                                        Unit unit6 = Unit.INSTANCE;
                                    } catch (Throwable th8) {
                                        th = th8;
                                    }
                                } finally {
                                }
                            }
                        }, this) != coroutine_suspended) {
                            List list10 = list4;
                            mutableScatterSetOf2 = mutableScatterSet4;
                            mutableScatterSetOf = mutableScatterSet3;
                            list = list5;
                            list3 = list10;
                            mutableScatterSet = mutableScatterSet92;
                            mutableScatterSet2 = mutableScatterSet82;
                            set = set22;
                            this.this$0.discardUnusedValues();
                            shouldKeepRecomposing = this.this$0.getShouldKeepRecomposing();
                            if (!shouldKeepRecomposing) {
                                return Unit.INSTANCE;
                            }
                        }
                    }
                }
                return coroutine_suspended;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$clearRecompositionState(Recomposer recomposer, List<ControlledComposition> list, List<MovableContentStateReference> list2, List<ControlledComposition> list3, MutableScatterSet<ControlledComposition> mutableScatterSet, MutableScatterSet<ControlledComposition> mutableScatterSet2, MutableScatterSet<Object> mutableScatterSet3, MutableScatterSet<ControlledComposition> mutableScatterSet4) {
        long j;
        long j2;
        long j3;
        synchronized (recomposer.stateLock) {
            list.clear();
            list2.clear();
            int size = list3.size();
            for (int i = 0; i < size; i++) {
                ControlledComposition controlledComposition = list3.get(i);
                controlledComposition.abandonChanges();
                recomposer.recordFailedCompositionLocked(controlledComposition);
            }
            list3.clear();
            MutableScatterSet<ControlledComposition> mutableScatterSet5 = mutableScatterSet;
            Object[] objArr = mutableScatterSet5.elements;
            long[] jArr = mutableScatterSet5.metadata;
            int length = jArr.length - 2;
            long j4 = 255;
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    long j5 = jArr[i2];
                    j2 = 128;
                    if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i3 = 8 - ((~(i2 - length)) >>> 31);
                        int i4 = 0;
                        while (i4 < i3) {
                            if ((j5 & j4) < 128) {
                                j3 = j4;
                                ControlledComposition controlledComposition2 = (ControlledComposition) objArr[(i2 << 3) + i4];
                                controlledComposition2.abandonChanges();
                                recomposer.recordFailedCompositionLocked(controlledComposition2);
                            } else {
                                j3 = j4;
                            }
                            j5 >>= 8;
                            i4++;
                            j4 = j3;
                        }
                        j = j4;
                        if (i3 != 8) {
                            break;
                        }
                    } else {
                        j = j4;
                    }
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                    j4 = j;
                }
            } else {
                j = 255;
                j2 = 128;
            }
            mutableScatterSet.clear();
            MutableScatterSet<ControlledComposition> mutableScatterSet6 = mutableScatterSet2;
            Object[] objArr2 = mutableScatterSet6.elements;
            long[] jArr2 = mutableScatterSet6.metadata;
            int length2 = jArr2.length - 2;
            if (length2 >= 0) {
                int i5 = 0;
                while (true) {
                    long j6 = jArr2[i5];
                    if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i6 = 8 - ((~(i5 - length2)) >>> 31);
                        for (int i7 = 0; i7 < i6; i7++) {
                            if ((j6 & j) < j2) {
                                ((ControlledComposition) objArr2[(i5 << 3) + i7]).changesApplied();
                            }
                            j6 >>= 8;
                        }
                        if (i6 != 8) {
                            break;
                        }
                    }
                    if (i5 == length2) {
                        break;
                    } else {
                        i5++;
                    }
                }
            }
            mutableScatterSet2.clear();
            mutableScatterSet3.clear();
            MutableScatterSet<ControlledComposition> mutableScatterSet7 = mutableScatterSet4;
            Object[] objArr3 = mutableScatterSet7.elements;
            long[] jArr3 = mutableScatterSet7.metadata;
            int length3 = jArr3.length - 2;
            if (length3 >= 0) {
                int i8 = 0;
                while (true) {
                    long j7 = jArr3[i8];
                    if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i9 = 8 - ((~(i8 - length3)) >>> 31);
                        for (int i10 = 0; i10 < i9; i10++) {
                            if ((j7 & j) < j2) {
                                ControlledComposition controlledComposition3 = (ControlledComposition) objArr3[(i8 << 3) + i10];
                                controlledComposition3.abandonChanges();
                                recomposer.recordFailedCompositionLocked(controlledComposition3);
                            }
                            j7 >>= 8;
                        }
                        if (i9 != 8) {
                            break;
                        }
                    }
                    if (i8 == length3) {
                        break;
                    } else {
                        i8++;
                    }
                }
            }
            mutableScatterSet4.clear();
            Unit unit = Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$fillToInsert(List<MovableContentStateReference> list, Recomposer recomposer) {
        List list2;
        List list3;
        list.clear();
        synchronized (recomposer.stateLock) {
            list2 = recomposer.compositionValuesAwaitingInsert;
            int size = list2.size();
            for (int i = 0; i < size; i++) {
                list.add((MovableContentStateReference) list2.get(i));
            }
            list3 = recomposer.compositionValuesAwaitingInsert;
            list3.clear();
            Unit unit = Unit.INSTANCE;
        }
    }
}
