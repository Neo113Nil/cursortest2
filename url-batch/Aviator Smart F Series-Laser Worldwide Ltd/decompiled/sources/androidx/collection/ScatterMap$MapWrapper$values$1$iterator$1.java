package androidx.collection;

import f6.p;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.sequences.o;
import y5.g;
import y5.w;

@d(c = "androidx.collection.ScatterMap$MapWrapper$values$1$iterator$1", f = "ScatterMap.kt", i = {0, 0, 0, 0, 0, 0, 0, 0}, l = {744}, m = "invokeSuspend", n = {"$this$iterator", "v$iv", "m$iv$iv", "lastIndex$iv$iv", "i$iv$iv", "slot$iv$iv", "bitCount$iv$iv", "j$iv$iv"}, s = {"L$0", "L$1", "L$2", "I$0", "I$1", "J$0", "I$2", "I$3"})
/* loaded from: classes.dex */
final class ScatterMap$MapWrapper$values$1$iterator$1 extends RestrictedSuspendLambda implements p {
    int I$0;
    int I$1;
    int I$2;
    int I$3;
    long J$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ ScatterMap<K, V> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ScatterMap$MapWrapper$values$1$iterator$1(ScatterMap<K, V> scatterMap, c cVar) {
        super(2, cVar);
        this.this$0 = scatterMap;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c create(Object obj, c cVar) {
        ScatterMap$MapWrapper$values$1$iterator$1 scatterMap$MapWrapper$values$1$iterator$1 = new ScatterMap$MapWrapper$values$1$iterator$1(this.this$0, cVar);
        scatterMap$MapWrapper$values$1$iterator$1.L$0 = obj;
        return scatterMap$MapWrapper$values$1$iterator$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x006e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0095 -> B:5:0x009a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0058 -> B:17:0x00a9). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x005a -> B:7:0x006c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x0075 -> B:6:0x009f). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        o oVar;
        Object[] objArr;
        long[] jArr;
        int length;
        ScatterMap$MapWrapper$values$1$iterator$1 scatterMap$MapWrapper$values$1$iterator$1;
        int i8;
        long j8;
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        int i9 = this.label;
        if (i9 == 0) {
            g.throwOnFailure(obj);
            oVar = (o) this.L$0;
            ScatterMap<K, V> scatterMap = this.this$0;
            objArr = scatterMap.values;
            jArr = scatterMap.metadata;
            length = jArr.length - 2;
            if (length >= 0) {
                scatterMap$MapWrapper$values$1$iterator$1 = this;
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
        i8 = this.I$1;
        int i12 = this.I$0;
        long[] jArr2 = (long[]) this.L$2;
        Object[] objArr2 = (Object[]) this.L$1;
        o oVar2 = (o) this.L$0;
        g.throwOnFailure(obj);
        o oVar3 = oVar2;
        Object[] objArr3 = objArr2;
        ScatterMap$MapWrapper$values$1$iterator$1 scatterMap$MapWrapper$values$1$iterator$12 = this;
        ScatterMap$MapWrapper$values$1$iterator$1 scatterMap$MapWrapper$values$1$iterator$13 = scatterMap$MapWrapper$values$1$iterator$12;
        long[] jArr3 = jArr2;
        ScatterMap$MapWrapper$values$1$iterator$1 scatterMap$MapWrapper$values$1$iterator$14 = scatterMap$MapWrapper$values$1$iterator$13;
        j9 >>= 8;
        i10++;
        if (i10 < i11) {
            if (i11 == 8) {
                length = i12;
                scatterMap$MapWrapper$values$1$iterator$1 = scatterMap$MapWrapper$values$1$iterator$14;
                jArr = jArr3;
                objArr = objArr3;
                oVar = oVar3;
                if (i8 != length) {
                    i8++;
                    j8 = jArr[i8];
                    if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                        oVar3 = oVar;
                        i10 = 0;
                        jArr3 = jArr;
                        scatterMap$MapWrapper$values$1$iterator$14 = scatterMap$MapWrapper$values$1$iterator$1;
                        i11 = 8 - ((~(i8 - length)) >>> 31);
                        objArr3 = objArr;
                        i12 = length;
                        j9 = j8;
                        if (i10 < i11) {
                            if ((255 & j9) < 128) {
                                Object obj2 = objArr3[(i8 << 3) + i10];
                                scatterMap$MapWrapper$values$1$iterator$14.L$0 = oVar3;
                                scatterMap$MapWrapper$values$1$iterator$14.L$1 = objArr3;
                                scatterMap$MapWrapper$values$1$iterator$14.L$2 = jArr3;
                                scatterMap$MapWrapper$values$1$iterator$14.I$0 = i12;
                                scatterMap$MapWrapper$values$1$iterator$14.I$1 = i8;
                                scatterMap$MapWrapper$values$1$iterator$14.J$0 = j9;
                                scatterMap$MapWrapper$values$1$iterator$14.I$2 = i11;
                                scatterMap$MapWrapper$values$1$iterator$14.I$3 = i10;
                                scatterMap$MapWrapper$values$1$iterator$14.label = 1;
                                if (oVar3.yield(obj2, scatterMap$MapWrapper$values$1$iterator$14) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                long[] jArr4 = jArr3;
                                scatterMap$MapWrapper$values$1$iterator$12 = scatterMap$MapWrapper$values$1$iterator$14;
                                jArr2 = jArr4;
                                ScatterMap$MapWrapper$values$1$iterator$1 scatterMap$MapWrapper$values$1$iterator$132 = scatterMap$MapWrapper$values$1$iterator$12;
                                long[] jArr32 = jArr2;
                                ScatterMap$MapWrapper$values$1$iterator$1 scatterMap$MapWrapper$values$1$iterator$142 = scatterMap$MapWrapper$values$1$iterator$132;
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
        return ((ScatterMap$MapWrapper$values$1$iterator$1) create(oVar, cVar)).invokeSuspend(w.INSTANCE);
    }
}
