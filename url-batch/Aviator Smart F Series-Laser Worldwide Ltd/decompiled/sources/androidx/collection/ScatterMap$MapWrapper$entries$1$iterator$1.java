package androidx.collection;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import f6.p;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.sequences.o;
import y5.g;
import y5.w;

@d(c = "androidx.collection.ScatterMap$MapWrapper$entries$1$iterator$1", f = "ScatterMap.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {TypedValues.TransitionType.TYPE_FROM}, m = "invokeSuspend", n = {"$this$iterator", "m$iv", "lastIndex$iv", "i$iv", "slot$iv", "bitCount$iv", "j$iv"}, s = {"L$0", "L$2", "I$0", "I$1", "J$0", "I$2", "I$3"})
/* loaded from: classes.dex */
final class ScatterMap$MapWrapper$entries$1$iterator$1 extends RestrictedSuspendLambda implements p {
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
    ScatterMap$MapWrapper$entries$1$iterator$1(ScatterMap<K, V> scatterMap, c cVar) {
        super(2, cVar);
        this.this$0 = scatterMap;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c create(Object obj, c cVar) {
        ScatterMap$MapWrapper$entries$1$iterator$1 scatterMap$MapWrapper$entries$1$iterator$1 = new ScatterMap$MapWrapper$entries$1$iterator$1(this.this$0, cVar);
        scatterMap$MapWrapper$entries$1$iterator$1.L$0 = obj;
        return scatterMap$MapWrapper$entries$1$iterator$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x006d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x00a0 -> B:5:0x00a4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x00ab -> B:6:0x00a8). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0056 -> B:8:0x006b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00be -> B:20:0x00c1). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        o oVar;
        ScatterMap scatterMap;
        long[] jArr;
        int length;
        ScatterMap$MapWrapper$entries$1$iterator$1 scatterMap$MapWrapper$entries$1$iterator$1;
        int i8;
        long j8;
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        int i9 = this.label;
        if (i9 == 0) {
            g.throwOnFailure(obj);
            oVar = (o) this.L$0;
            scatterMap = this.this$0;
            jArr = scatterMap.metadata;
            length = jArr.length - 2;
            if (length >= 0) {
                scatterMap$MapWrapper$entries$1$iterator$1 = this;
                i8 = 0;
                j8 = jArr[i8];
                if ((((~j8) << 7) & j8 & (-9187201950435737472L)) == -9187201950435737472L) {
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
        ScatterMap scatterMap2 = (ScatterMap) this.L$1;
        o oVar2 = (o) this.L$0;
        g.throwOnFailure(obj);
        ScatterMap$MapWrapper$entries$1$iterator$1 scatterMap$MapWrapper$entries$1$iterator$12 = this;
        int i13 = 1;
        o oVar3 = oVar2;
        ScatterMap scatterMap3 = scatterMap2;
        long[] jArr3 = jArr2;
        ScatterMap$MapWrapper$entries$1$iterator$1 scatterMap$MapWrapper$entries$1$iterator$13 = scatterMap$MapWrapper$entries$1$iterator$12;
        j9 >>= 8;
        i10 += i13;
        if (i10 < i11) {
            if (i11 == 8) {
                length = i12;
                scatterMap$MapWrapper$entries$1$iterator$1 = scatterMap$MapWrapper$entries$1$iterator$13;
                jArr = jArr3;
                scatterMap = scatterMap3;
                oVar = oVar3;
                if (i8 != length) {
                    i8++;
                    j8 = jArr[i8];
                    if ((((~j8) << 7) & j8 & (-9187201950435737472L)) == -9187201950435737472L) {
                        oVar3 = oVar;
                        i10 = 0;
                        scatterMap3 = scatterMap;
                        i11 = 8 - ((~(i8 - length)) >>> 31);
                        jArr3 = jArr;
                        scatterMap$MapWrapper$entries$1$iterator$13 = scatterMap$MapWrapper$entries$1$iterator$1;
                        i12 = length;
                        j9 = j8;
                        if (i10 < i11) {
                            if ((255 & j9) < 128) {
                                int i14 = (i8 << 3) + i10;
                                MapEntry mapEntry = new MapEntry(scatterMap3.keys[i14], scatterMap3.values[i14]);
                                scatterMap$MapWrapper$entries$1$iterator$13.L$0 = oVar3;
                                scatterMap$MapWrapper$entries$1$iterator$13.L$1 = scatterMap3;
                                scatterMap$MapWrapper$entries$1$iterator$13.L$2 = jArr3;
                                scatterMap$MapWrapper$entries$1$iterator$13.I$0 = i12;
                                scatterMap$MapWrapper$entries$1$iterator$13.I$1 = i8;
                                scatterMap$MapWrapper$entries$1$iterator$13.J$0 = j9;
                                scatterMap$MapWrapper$entries$1$iterator$13.I$2 = i11;
                                scatterMap$MapWrapper$entries$1$iterator$13.I$3 = i10;
                                i13 = 1;
                                scatterMap$MapWrapper$entries$1$iterator$13.label = 1;
                                if (oVar3.yield(mapEntry, scatterMap$MapWrapper$entries$1$iterator$13) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                scatterMap$MapWrapper$entries$1$iterator$12 = scatterMap$MapWrapper$entries$1$iterator$13;
                                jArr2 = jArr3;
                                scatterMap2 = scatterMap3;
                                oVar2 = oVar3;
                                o oVar32 = oVar2;
                                ScatterMap scatterMap32 = scatterMap2;
                                long[] jArr32 = jArr2;
                                ScatterMap$MapWrapper$entries$1$iterator$1 scatterMap$MapWrapper$entries$1$iterator$132 = scatterMap$MapWrapper$entries$1$iterator$12;
                                j9 >>= 8;
                                i10 += i13;
                                if (i10 < i11) {
                                }
                            } else {
                                i13 = 1;
                                j9 >>= 8;
                                i10 += i13;
                                if (i10 < i11) {
                                }
                            }
                        }
                    } else if (i8 != length) {
                    }
                }
            }
            return w.INSTANCE;
        }
    }

    @Override // f6.p
    public final Object invoke(o oVar, c cVar) {
        return ((ScatterMap$MapWrapper$entries$1$iterator$1) create(oVar, cVar)).invokeSuspend(w.INSTANCE);
    }
}
