package androidx.collection;

import f6.p;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.sequences.o;
import y5.g;
import y5.w;

@d(c = "androidx.collection.MutableScatterMap$MutableMapWrapper$keys$1$iterator$1$iterator$1", f = "ScatterMap.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {1431}, m = "invokeSuspend", n = {"$this$iterator", "m$iv", "lastIndex$iv", "i$iv", "slot$iv", "bitCount$iv", "j$iv"}, s = {"L$0", "L$1", "I$0", "I$1", "J$0", "I$2", "I$3"})
/* loaded from: classes.dex */
final class MutableScatterMap$MutableMapWrapper$keys$1$iterator$1$iterator$1 extends RestrictedSuspendLambda implements p {
    int I$0;
    int I$1;
    int I$2;
    int I$3;
    long J$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ MutableScatterMap<K, V> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MutableScatterMap$MutableMapWrapper$keys$1$iterator$1$iterator$1(MutableScatterMap<K, V> mutableScatterMap, c cVar) {
        super(2, cVar);
        this.this$0 = mutableScatterMap;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c create(Object obj, c cVar) {
        MutableScatterMap$MutableMapWrapper$keys$1$iterator$1$iterator$1 mutableScatterMap$MutableMapWrapper$keys$1$iterator$1$iterator$1 = new MutableScatterMap$MutableMapWrapper$keys$1$iterator$1$iterator$1(this.this$0, cVar);
        mutableScatterMap$MutableMapWrapper$keys$1$iterator$1$iterator$1.L$0 = obj;
        return mutableScatterMap$MutableMapWrapper$keys$1$iterator$1$iterator$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x006b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0092 -> B:5:0x0097). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0052 -> B:17:0x00a6). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0054 -> B:7:0x0069). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x0072 -> B:6:0x009c). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        o oVar;
        long[] jArr;
        int length;
        MutableScatterMap$MutableMapWrapper$keys$1$iterator$1$iterator$1 mutableScatterMap$MutableMapWrapper$keys$1$iterator$1$iterator$1;
        int i8;
        long j8;
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        int i9 = this.label;
        if (i9 == 0) {
            g.throwOnFailure(obj);
            oVar = (o) this.L$0;
            jArr = this.this$0.metadata;
            length = jArr.length - 2;
            if (length >= 0) {
                mutableScatterMap$MutableMapWrapper$keys$1$iterator$1$iterator$1 = this;
                i8 = 0;
                j8 = jArr[i8];
                if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                }
                if (i8 != length) {
                }
            }
            return w.INSTANCE;
        }
        if (i9 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        int i10 = this.I$3;
        int i11 = this.I$2;
        long j9 = this.J$0;
        int i12 = this.I$1;
        int i13 = this.I$0;
        long[] jArr2 = (long[]) this.L$1;
        o oVar2 = (o) this.L$0;
        g.throwOnFailure(obj);
        o oVar3 = oVar2;
        long[] jArr3 = jArr2;
        MutableScatterMap$MutableMapWrapper$keys$1$iterator$1$iterator$1 mutableScatterMap$MutableMapWrapper$keys$1$iterator$1$iterator$12 = this;
        MutableScatterMap$MutableMapWrapper$keys$1$iterator$1$iterator$1 mutableScatterMap$MutableMapWrapper$keys$1$iterator$1$iterator$13 = mutableScatterMap$MutableMapWrapper$keys$1$iterator$1$iterator$12;
        int i14 = i13;
        MutableScatterMap$MutableMapWrapper$keys$1$iterator$1$iterator$1 mutableScatterMap$MutableMapWrapper$keys$1$iterator$1$iterator$14 = mutableScatterMap$MutableMapWrapper$keys$1$iterator$1$iterator$13;
        j9 >>= 8;
        i10++;
        if (i10 < i11) {
            if (i11 == 8) {
                i8 = i12;
                mutableScatterMap$MutableMapWrapper$keys$1$iterator$1$iterator$1 = mutableScatterMap$MutableMapWrapper$keys$1$iterator$1$iterator$14;
                length = i14;
                jArr = jArr3;
                oVar = oVar3;
                if (i8 != length) {
                    i8++;
                    j8 = jArr[i8];
                    if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                        oVar3 = oVar;
                        i10 = 0;
                        jArr3 = jArr;
                        i11 = 8 - ((~(i8 - length)) >>> 31);
                        i14 = length;
                        mutableScatterMap$MutableMapWrapper$keys$1$iterator$1$iterator$14 = mutableScatterMap$MutableMapWrapper$keys$1$iterator$1$iterator$1;
                        i12 = i8;
                        j9 = j8;
                        if (i10 < i11) {
                            if ((255 & j9) < 128) {
                                Integer boxInt = kotlin.coroutines.jvm.internal.a.boxInt((i12 << 3) + i10);
                                mutableScatterMap$MutableMapWrapper$keys$1$iterator$1$iterator$14.L$0 = oVar3;
                                mutableScatterMap$MutableMapWrapper$keys$1$iterator$1$iterator$14.L$1 = jArr3;
                                mutableScatterMap$MutableMapWrapper$keys$1$iterator$1$iterator$14.I$0 = i14;
                                mutableScatterMap$MutableMapWrapper$keys$1$iterator$1$iterator$14.I$1 = i12;
                                mutableScatterMap$MutableMapWrapper$keys$1$iterator$1$iterator$14.J$0 = j9;
                                mutableScatterMap$MutableMapWrapper$keys$1$iterator$1$iterator$14.I$2 = i11;
                                mutableScatterMap$MutableMapWrapper$keys$1$iterator$1$iterator$14.I$3 = i10;
                                mutableScatterMap$MutableMapWrapper$keys$1$iterator$1$iterator$14.label = 1;
                                if (oVar3.yield(boxInt, mutableScatterMap$MutableMapWrapper$keys$1$iterator$1$iterator$14) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                int i15 = i14;
                                mutableScatterMap$MutableMapWrapper$keys$1$iterator$1$iterator$12 = mutableScatterMap$MutableMapWrapper$keys$1$iterator$1$iterator$14;
                                i13 = i15;
                                MutableScatterMap$MutableMapWrapper$keys$1$iterator$1$iterator$1 mutableScatterMap$MutableMapWrapper$keys$1$iterator$1$iterator$132 = mutableScatterMap$MutableMapWrapper$keys$1$iterator$1$iterator$12;
                                int i142 = i13;
                                MutableScatterMap$MutableMapWrapper$keys$1$iterator$1$iterator$1 mutableScatterMap$MutableMapWrapper$keys$1$iterator$1$iterator$142 = mutableScatterMap$MutableMapWrapper$keys$1$iterator$1$iterator$132;
                            }
                            j9 >>= 8;
                            i10++;
                            if (i10 < i11) {
                            }
                        }
                    }
                    if (i8 != length) {
                    }
                }
            }
            return w.INSTANCE;
        }
    }

    @Override // f6.p
    public final Object invoke(o oVar, c cVar) {
        return ((MutableScatterMap$MutableMapWrapper$keys$1$iterator$1$iterator$1) create(oVar, cVar)).invokeSuspend(w.INSTANCE);
    }
}
