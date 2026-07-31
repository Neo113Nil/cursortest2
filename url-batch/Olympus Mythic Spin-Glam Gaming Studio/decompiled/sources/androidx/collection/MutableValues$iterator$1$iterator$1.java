package androidx.collection;

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

/* compiled from: ScatterMap.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u00020\u00050\u0004H\u008a@"}, d2 = {"<anonymous>", "", "K", "V", "Lkotlin/sequences/SequenceScope;", ""}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.collection.MutableValues$iterator$1$iterator$1", f = "ScatterMap.kt", l = {1696}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class MutableValues$iterator$1$iterator$1 extends RestrictedSuspendLambda implements Function2 {
    int I$0;
    int I$1;
    int I$2;
    int I$3;
    long J$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ MutableValues<K, V> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MutableValues$iterator$1$iterator$1(MutableValues<K, V> mutableValues, Continuation continuation) {
        super(2, continuation);
        this.this$0 = mutableValues;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        MutableValues$iterator$1$iterator$1 mutableValues$iterator$1$iterator$1 = new MutableValues$iterator$1$iterator$1(this.this$0, continuation);
        mutableValues$iterator$1$iterator$1.L$0 = obj;
        return mutableValues$iterator$1$iterator$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(SequenceScope sequenceScope, Continuation continuation) {
        return ((MutableValues$iterator$1$iterator$1) create(sequenceScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x006a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x008e -> B:5:0x0091). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0052 -> B:15:0x009a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0054 -> B:6:0x0068). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x0071 -> B:5:0x0091). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        SequenceScope sequenceScope;
        MutableScatterMap mutableScatterMap;
        long[] jArr;
        int length;
        int i;
        long j;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            sequenceScope = (SequenceScope) this.L$0;
            mutableScatterMap = ((MutableValues) this.this$0).parent;
            jArr = mutableScatterMap.metadata;
            length = jArr.length - 2;
            if (length >= 0) {
                i = 0;
                j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                }
                if (i != length) {
                }
            }
            return Unit.INSTANCE;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        int i3 = this.I$3;
        int i4 = this.I$2;
        long j2 = this.J$0;
        int i5 = this.I$1;
        int i6 = this.I$0;
        long[] jArr2 = (long[]) this.L$1;
        SequenceScope sequenceScope2 = (SequenceScope) this.L$0;
        ResultKt.throwOnFailure(obj);
        j2 >>= 8;
        i3++;
        if (i3 < i4) {
            if (i4 == 8) {
                i = i5;
                length = i6;
                jArr = jArr2;
                sequenceScope = sequenceScope2;
                if (i != length) {
                    i++;
                    j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        sequenceScope2 = sequenceScope;
                        i3 = 0;
                        jArr2 = jArr;
                        i4 = 8 - ((~(i - length)) >>> 31);
                        i6 = length;
                        i5 = i;
                        j2 = j;
                        if (i3 < i4) {
                            if ((255 & j2) < 128) {
                                Integer boxInt = Boxing.boxInt((i5 << 3) + i3);
                                this.L$0 = sequenceScope2;
                                this.L$1 = jArr2;
                                this.I$0 = i6;
                                this.I$1 = i5;
                                this.J$0 = j2;
                                this.I$2 = i4;
                                this.I$3 = i3;
                                this.label = 1;
                                if (sequenceScope2.yield(boxInt, this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                            j2 >>= 8;
                            i3++;
                            if (i3 < i4) {
                            }
                        }
                    }
                    if (i != length) {
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }
}
