package androidx.collection;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.SequenceScope;

/* compiled from: ScatterMap.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010&\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00050\u0004H\u008a@"}, d2 = {"<anonymous>", "", "K", "V", "Lkotlin/sequences/SequenceScope;", ""}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.collection.Entries$iterator$1", f = "ScatterMap.kt", l = {1414}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class Entries$iterator$1 extends RestrictedSuspendLambda implements Function2 {
    int I$0;
    int I$1;
    int I$2;
    int I$3;
    long J$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ Entries<K, V> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Entries$iterator$1(Entries<K, V> entries, Continuation continuation) {
        super(2, continuation);
        this.this$0 = entries;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        Entries$iterator$1 entries$iterator$1 = new Entries$iterator$1(this.this$0, continuation);
        entries$iterator$1.L$0 = obj;
        return entries$iterator$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(SequenceScope sequenceScope, Continuation continuation) {
        return ((Entries$iterator$1) create(sequenceScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x006c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x00a3 -> B:5:0x00a6). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x00a9 -> B:6:0x00aa). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0059 -> B:7:0x006a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00b6 -> B:18:0x00b7). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        SequenceScope sequenceScope;
        ScatterMap scatterMap;
        Entries entries;
        long[] jArr;
        int length;
        int i;
        long j;
        ScatterMap scatterMap2;
        ScatterMap scatterMap3;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.label;
        int i3 = 8;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            sequenceScope = (SequenceScope) this.L$0;
            scatterMap = ((Entries) this.this$0).parent;
            entries = this.this$0;
            jArr = scatterMap.metadata;
            length = jArr.length - 2;
            if (length >= 0) {
                i = 0;
                j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                }
            }
            return Unit.INSTANCE;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        int i4 = this.I$3;
        int i5 = this.I$2;
        long j2 = this.J$0;
        i = this.I$1;
        int i6 = this.I$0;
        long[] jArr2 = (long[]) this.L$2;
        Entries entries2 = (Entries) this.L$1;
        SequenceScope sequenceScope2 = (SequenceScope) this.L$0;
        ResultKt.throwOnFailure(obj);
        int i7 = 8;
        j2 >>= i7;
        i4++;
        i3 = i7;
        if (i4 < i5) {
            int i8 = i3;
            if (i5 == i8) {
                length = i6;
                jArr = jArr2;
                entries = entries2;
                sequenceScope = sequenceScope2;
                if (i != length) {
                    i++;
                    i3 = i8;
                    j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                        sequenceScope2 = sequenceScope;
                        i4 = 0;
                        jArr2 = jArr;
                        i6 = length;
                        i5 = 8 - ((~(i - length)) >>> 31);
                        entries2 = entries;
                        j2 = j;
                        if (i4 < i5) {
                            if ((255 & j2) < 128) {
                                int i9 = (i << 3) + i4;
                                scatterMap2 = entries2.parent;
                                Object obj2 = scatterMap2.keys[i9];
                                scatterMap3 = entries2.parent;
                                MapEntry mapEntry = new MapEntry(obj2, scatterMap3.values[i9]);
                                this.L$0 = sequenceScope2;
                                this.L$1 = entries2;
                                this.L$2 = jArr2;
                                this.I$0 = i6;
                                this.I$1 = i;
                                this.J$0 = j2;
                                this.I$2 = i5;
                                this.I$3 = i4;
                                this.label = 1;
                                if (sequenceScope2.yield(mapEntry, this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                int i72 = 8;
                                j2 >>= i72;
                                i4++;
                                i3 = i72;
                                if (i4 < i5) {
                                }
                            } else {
                                i72 = i3;
                                j2 >>= i72;
                                i4++;
                                i3 = i72;
                                if (i4 < i5) {
                                }
                            }
                        }
                    } else {
                        i8 = i3;
                        if (i != length) {
                        }
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }
}
