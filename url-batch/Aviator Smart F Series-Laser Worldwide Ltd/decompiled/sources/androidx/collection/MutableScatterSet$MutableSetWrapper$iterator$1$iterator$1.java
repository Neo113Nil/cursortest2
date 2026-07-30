package androidx.collection;

import f6.p;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.sequences.o;
import y5.g;
import y5.w;

@d(c = "androidx.collection.MutableScatterSet$MutableSetWrapper$iterator$1$iterator$1", f = "ScatterSet.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {1060}, m = "invokeSuspend", n = {"$this$iterator", "m$iv", "lastIndex$iv", "i$iv", "slot$iv", "bitCount$iv", "j$iv"}, s = {"L$0", "L$3", "I$0", "I$1", "J$0", "I$2", "I$3"})
/* loaded from: classes.dex */
final class MutableScatterSet$MutableSetWrapper$iterator$1$iterator$1 extends RestrictedSuspendLambda implements p {
    int I$0;
    int I$1;
    int I$2;
    int I$3;
    long J$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ MutableScatterSet<E> this$0;
    final /* synthetic */ MutableScatterSet$MutableSetWrapper$iterator$1 this$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MutableScatterSet$MutableSetWrapper$iterator$1$iterator$1(MutableScatterSet mutableScatterSet, MutableScatterSet$MutableSetWrapper$iterator$1 mutableScatterSet$MutableSetWrapper$iterator$1, c cVar) {
        super(2, cVar);
        this.this$0 = mutableScatterSet;
        this.this$1 = mutableScatterSet$MutableSetWrapper$iterator$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c create(Object obj, c cVar) {
        MutableScatterSet$MutableSetWrapper$iterator$1$iterator$1 mutableScatterSet$MutableSetWrapper$iterator$1$iterator$1 = new MutableScatterSet$MutableSetWrapper$iterator$1$iterator$1(this.this$0, this.this$1, cVar);
        mutableScatterSet$MutableSetWrapper$iterator$1$iterator$1.L$0 = obj;
        return mutableScatterSet$MutableSetWrapper$iterator$1$iterator$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0077  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x00a7 -> B:5:0x00ab). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x005e -> B:7:0x0075). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00c5 -> B:18:0x00c7). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x007f -> B:6:0x00af). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        o oVar;
        MutableScatterSet mutableScatterSet;
        MutableScatterSet$MutableSetWrapper$iterator$1 mutableScatterSet$MutableSetWrapper$iterator$1;
        long[] jArr;
        int length;
        MutableScatterSet$MutableSetWrapper$iterator$1$iterator$1 mutableScatterSet$MutableSetWrapper$iterator$1$iterator$1;
        int i8;
        long j8;
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        int i9 = this.label;
        if (i9 == 0) {
            g.throwOnFailure(obj);
            oVar = (o) this.L$0;
            mutableScatterSet = this.this$0;
            mutableScatterSet$MutableSetWrapper$iterator$1 = this.this$1;
            jArr = mutableScatterSet.metadata;
            length = jArr.length - 2;
            if (length >= 0) {
                mutableScatterSet$MutableSetWrapper$iterator$1$iterator$1 = this;
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
        int i12 = this.I$1;
        int i13 = this.I$0;
        long[] jArr2 = (long[]) this.L$3;
        MutableScatterSet mutableScatterSet2 = (MutableScatterSet) this.L$2;
        MutableScatterSet$MutableSetWrapper$iterator$1 mutableScatterSet$MutableSetWrapper$iterator$12 = (MutableScatterSet$MutableSetWrapper$iterator$1) this.L$1;
        o oVar2 = (o) this.L$0;
        g.throwOnFailure(obj);
        MutableScatterSet$MutableSetWrapper$iterator$1$iterator$1 mutableScatterSet$MutableSetWrapper$iterator$1$iterator$12 = this;
        o oVar3 = oVar2;
        MutableScatterSet$MutableSetWrapper$iterator$1 mutableScatterSet$MutableSetWrapper$iterator$13 = mutableScatterSet$MutableSetWrapper$iterator$12;
        MutableScatterSet mutableScatterSet3 = mutableScatterSet2;
        MutableScatterSet$MutableSetWrapper$iterator$1$iterator$1 mutableScatterSet$MutableSetWrapper$iterator$1$iterator$13 = mutableScatterSet$MutableSetWrapper$iterator$1$iterator$12;
        j9 >>= 8;
        i10++;
        if (i10 < i11) {
            if (i11 == 8) {
                jArr = jArr2;
                mutableScatterSet$MutableSetWrapper$iterator$1$iterator$1 = mutableScatterSet$MutableSetWrapper$iterator$1$iterator$13;
                mutableScatterSet = mutableScatterSet3;
                mutableScatterSet$MutableSetWrapper$iterator$1 = mutableScatterSet$MutableSetWrapper$iterator$13;
                oVar = oVar3;
                int i14 = i13;
                i8 = i12;
                length = i14;
                if (i8 != length) {
                    i8++;
                    j8 = jArr[i8];
                    if ((((~j8) << 7) & j8 & (-9187201950435737472L)) == -9187201950435737472L) {
                        oVar3 = oVar;
                        i10 = 0;
                        mutableScatterSet3 = mutableScatterSet;
                        mutableScatterSet$MutableSetWrapper$iterator$1$iterator$13 = mutableScatterSet$MutableSetWrapper$iterator$1$iterator$1;
                        i11 = 8 - ((~(i8 - length)) >>> 31);
                        mutableScatterSet$MutableSetWrapper$iterator$13 = mutableScatterSet$MutableSetWrapper$iterator$1;
                        jArr2 = jArr;
                        j9 = j8;
                        int i15 = i8;
                        i13 = length;
                        i12 = i15;
                        if (i10 < i11) {
                            if ((j9 & 255) < 128) {
                                int i16 = (i12 << 3) + i10;
                                mutableScatterSet$MutableSetWrapper$iterator$13.setCurrent(i16);
                                Object obj2 = mutableScatterSet3.elements[i16];
                                mutableScatterSet$MutableSetWrapper$iterator$1$iterator$13.L$0 = oVar3;
                                mutableScatterSet$MutableSetWrapper$iterator$1$iterator$13.L$1 = mutableScatterSet$MutableSetWrapper$iterator$13;
                                mutableScatterSet$MutableSetWrapper$iterator$1$iterator$13.L$2 = mutableScatterSet3;
                                mutableScatterSet$MutableSetWrapper$iterator$1$iterator$13.L$3 = jArr2;
                                mutableScatterSet$MutableSetWrapper$iterator$1$iterator$13.I$0 = i13;
                                mutableScatterSet$MutableSetWrapper$iterator$1$iterator$13.I$1 = i12;
                                mutableScatterSet$MutableSetWrapper$iterator$1$iterator$13.J$0 = j9;
                                mutableScatterSet$MutableSetWrapper$iterator$1$iterator$13.I$2 = i11;
                                mutableScatterSet$MutableSetWrapper$iterator$1$iterator$13.I$3 = i10;
                                mutableScatterSet$MutableSetWrapper$iterator$1$iterator$13.label = 1;
                                if (oVar3.yield(obj2, mutableScatterSet$MutableSetWrapper$iterator$1$iterator$13) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                mutableScatterSet$MutableSetWrapper$iterator$1$iterator$12 = mutableScatterSet$MutableSetWrapper$iterator$1$iterator$13;
                                mutableScatterSet2 = mutableScatterSet3;
                                mutableScatterSet$MutableSetWrapper$iterator$12 = mutableScatterSet$MutableSetWrapper$iterator$13;
                                oVar2 = oVar3;
                                o oVar32 = oVar2;
                                MutableScatterSet$MutableSetWrapper$iterator$1 mutableScatterSet$MutableSetWrapper$iterator$132 = mutableScatterSet$MutableSetWrapper$iterator$12;
                                MutableScatterSet mutableScatterSet32 = mutableScatterSet2;
                                MutableScatterSet$MutableSetWrapper$iterator$1$iterator$1 mutableScatterSet$MutableSetWrapper$iterator$1$iterator$132 = mutableScatterSet$MutableSetWrapper$iterator$1$iterator$12;
                            }
                            j9 >>= 8;
                            i10++;
                            if (i10 < i11) {
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
        return ((MutableScatterSet$MutableSetWrapper$iterator$1$iterator$1) create(oVar, cVar)).invokeSuspend(w.INSTANCE);
    }
}
