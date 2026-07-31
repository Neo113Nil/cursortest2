package androidx.compose.runtime.snapshots;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.SequenceScope;

/* compiled from: SnapshotIdSet.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\f\u0012\b\u0012\u00060\u0003j\u0002`\u00040\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlin/sequences/SequenceScope;", "", "Landroidx/compose/runtime/snapshots/SnapshotId;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.runtime.snapshots.SnapshotIdSet$iterator$1", f = "SnapshotIdSet.kt", l = {252, 256, 263}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class SnapshotIdSet$iterator$1 extends RestrictedSuspendLambda implements Function2 {
    int I$0;
    int I$1;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ SnapshotIdSet this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SnapshotIdSet$iterator$1(SnapshotIdSet snapshotIdSet, Continuation continuation) {
        super(2, continuation);
        this.this$0 = snapshotIdSet;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SnapshotIdSet$iterator$1 snapshotIdSet$iterator$1 = new SnapshotIdSet$iterator$1(this.this$0, continuation);
        snapshotIdSet$iterator$1.L$0 = obj;
        return snapshotIdSet$iterator$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(SequenceScope sequenceScope, Continuation continuation) {
        return ((SnapshotIdSet$iterator$1) create(sequenceScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0083  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x00d0 -> B:8:0x00f1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x00ef -> B:7:0x00f0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0093 -> B:22:0x00b0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00ad -> B:22:0x00b0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x0073 -> B:34:0x0076). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        SequenceScope sequenceScope;
        SequenceScope sequenceScope2;
        int length;
        long[] jArr;
        int i;
        SequenceScope sequenceScope3;
        int i2;
        SequenceScope sequenceScope4;
        int i3;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = this.label;
        long j = 1;
        long j2 = 0;
        if (i4 == 0) {
            ResultKt.throwOnFailure(obj);
            sequenceScope = (SequenceScope) this.L$0;
            long[] jArr2 = this.this$0.belowBound;
            if (jArr2 != null) {
                sequenceScope2 = sequenceScope;
                length = jArr2.length;
                jArr = jArr2;
                i = 0;
                if (i < length) {
                }
            }
            if (this.this$0.lowerSet != 0) {
            }
            if (this.this$0.upperSet != 0) {
            }
            return Unit.INSTANCE;
        }
        if (i4 == 1) {
            length = this.I$1;
            i = this.I$0;
            jArr = (long[]) this.L$1;
            sequenceScope2 = (SequenceScope) this.L$0;
            ResultKt.throwOnFailure(obj);
            i++;
            if (i < length) {
                Long boxLong = Boxing.boxLong(jArr[i]);
                this.L$0 = sequenceScope2;
                this.L$1 = jArr;
                this.I$0 = i;
                this.I$1 = length;
                this.label = 1;
                if (sequenceScope2.yield(boxLong, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                i++;
                if (i < length) {
                    sequenceScope = sequenceScope2;
                    if (this.this$0.lowerSet != 0) {
                        sequenceScope3 = sequenceScope;
                        i2 = 0;
                        if (i2 >= 64) {
                        }
                    }
                    if (this.this$0.upperSet != 0) {
                    }
                    return Unit.INSTANCE;
                }
            }
        } else {
            if (i4 != 2) {
                if (i4 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i5 = this.I$0;
                sequenceScope4 = (SequenceScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                i3 = i5;
                i3++;
                j2 = 0;
                if (i3 < 64) {
                    if ((this.this$0.upperSet & (1 << i3)) != j2) {
                        Long boxLong2 = Boxing.boxLong(this.this$0.lowerBound + i3 + 64);
                        this.L$0 = sequenceScope4;
                        this.L$1 = null;
                        this.I$0 = i3;
                        this.label = 3;
                        if (sequenceScope4.yield(boxLong2, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        i5 = i3;
                        i3 = i5;
                    }
                    i3++;
                    j2 = 0;
                    if (i3 < 64) {
                    }
                }
                return Unit.INSTANCE;
            }
            i2 = this.I$0;
            sequenceScope3 = (SequenceScope) this.L$0;
            ResultKt.throwOnFailure(obj);
            i2++;
            j = 1;
            if (i2 >= 64) {
                sequenceScope = sequenceScope3;
                if (this.this$0.upperSet != 0) {
                    sequenceScope4 = sequenceScope;
                    i3 = 0;
                    if (i3 < 64) {
                    }
                }
                return Unit.INSTANCE;
            }
            if ((this.this$0.lowerSet & (j << i2)) != 0) {
                Long boxLong3 = Boxing.boxLong(this.this$0.lowerBound + i2);
                this.L$0 = sequenceScope3;
                this.L$1 = null;
                this.I$0 = i2;
                this.label = 2;
                if (sequenceScope3.yield(boxLong3, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            i2++;
            j = 1;
            if (i2 >= 64) {
            }
        }
    }
}
