package kotlin.collections;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;

@kotlin.coroutines.jvm.internal.d(c = "kotlin.collections.SlidingWindowKt$windowedIterator$1", f = "SlidingWindow.kt", i = {0, 0, 0, 2, 2, 3, 3}, l = {34, 40, 49, 55, 58}, m = "invokeSuspend", n = {"$this$iterator", "buffer", "gap", "$this$iterator", "buffer", "$this$iterator", "buffer"}, s = {"L$0", "L$1", "I$0", "L$0", "L$1", "L$0", "L$1"})
/* loaded from: classes4.dex */
final class SlidingWindowKt$windowedIterator$1 extends RestrictedSuspendLambda implements f6.p {
    final /* synthetic */ Iterator<T> $iterator;
    final /* synthetic */ boolean $partialWindows;
    final /* synthetic */ boolean $reuseBuffer;
    final /* synthetic */ int $size;
    final /* synthetic */ int $step;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SlidingWindowKt$windowedIterator$1(int i8, int i9, Iterator<? extends T> it, boolean z7, boolean z8, kotlin.coroutines.c cVar) {
        super(2, cVar);
        this.$size = i8;
        this.$step = i9;
        this.$iterator = it;
        this.$reuseBuffer = z7;
        this.$partialWindows = z8;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
        SlidingWindowKt$windowedIterator$1 slidingWindowKt$windowedIterator$1 = new SlidingWindowKt$windowedIterator$1(this.$size, this.$step, this.$iterator, this.$reuseBuffer, this.$partialWindows, cVar);
        slidingWindowKt$windowedIterator$1.L$0 = obj;
        return slidingWindowKt$windowedIterator$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00dc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00b1  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x014b -> B:12:0x014e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x011d -> B:30:0x0120). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x00a6 -> B:50:0x0058). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        int coerceAtMost;
        u0 u0Var;
        Iterator it;
        kotlin.sequences.o oVar;
        SlidingWindowKt$windowedIterator$1 slidingWindowKt$windowedIterator$1;
        kotlin.sequences.o oVar2;
        ArrayList arrayList;
        int i8;
        Iterator it2;
        int i9;
        SlidingWindowKt$windowedIterator$1 slidingWindowKt$windowedIterator$12;
        u0 u0Var2;
        kotlin.sequences.o oVar3;
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        int i10 = this.label;
        if (i10 == 0) {
            y5.g.throwOnFailure(obj);
            kotlin.sequences.o oVar4 = (kotlin.sequences.o) this.L$0;
            coerceAtMost = j6.v.coerceAtMost(this.$size, 1024);
            int i11 = this.$step - this.$size;
            if (i11 < 0) {
                u0Var = new u0(coerceAtMost);
                it = this.$iterator;
                oVar = oVar4;
                slidingWindowKt$windowedIterator$1 = this;
                while (it.hasNext()) {
                }
                if (slidingWindowKt$windowedIterator$1.$partialWindows) {
                }
                return y5.w.INSTANCE;
            }
            oVar2 = oVar4;
            arrayList = new ArrayList(coerceAtMost);
            i8 = 0;
            it2 = this.$iterator;
            i9 = i11;
            slidingWindowKt$windowedIterator$12 = this;
            while (it2.hasNext()) {
            }
            if (!arrayList.isEmpty()) {
                slidingWindowKt$windowedIterator$12.L$0 = null;
                slidingWindowKt$windowedIterator$12.L$1 = null;
                slidingWindowKt$windowedIterator$12.L$2 = null;
                slidingWindowKt$windowedIterator$12.label = 2;
                if (oVar2.yield(arrayList, slidingWindowKt$windowedIterator$12) == coroutine_suspended) {
                }
            }
            return y5.w.INSTANCE;
        }
        if (i10 == 1) {
            i9 = this.I$0;
            it2 = (Iterator) this.L$2;
            arrayList = (ArrayList) this.L$1;
            oVar2 = (kotlin.sequences.o) this.L$0;
            y5.g.throwOnFailure(obj);
            slidingWindowKt$windowedIterator$12 = this;
            i8 = i9;
            if (slidingWindowKt$windowedIterator$12.$reuseBuffer) {
                arrayList = new ArrayList(slidingWindowKt$windowedIterator$12.$size);
            } else {
                arrayList.clear();
            }
            i9 = i8;
            while (it2.hasNext()) {
                Object next = it2.next();
                if (i8 > 0) {
                    i8--;
                } else {
                    arrayList.add(next);
                    if (arrayList.size() == slidingWindowKt$windowedIterator$12.$size) {
                        slidingWindowKt$windowedIterator$12.L$0 = oVar2;
                        slidingWindowKt$windowedIterator$12.L$1 = arrayList;
                        slidingWindowKt$windowedIterator$12.L$2 = it2;
                        slidingWindowKt$windowedIterator$12.I$0 = i9;
                        slidingWindowKt$windowedIterator$12.label = 1;
                        if (oVar2.yield(arrayList, slidingWindowKt$windowedIterator$12) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        i8 = i9;
                        if (slidingWindowKt$windowedIterator$12.$reuseBuffer) {
                        }
                        i9 = i8;
                        while (it2.hasNext()) {
                        }
                    }
                }
            }
            if ((!arrayList.isEmpty()) && (slidingWindowKt$windowedIterator$12.$partialWindows || arrayList.size() == slidingWindowKt$windowedIterator$12.$size)) {
                slidingWindowKt$windowedIterator$12.L$0 = null;
                slidingWindowKt$windowedIterator$12.L$1 = null;
                slidingWindowKt$windowedIterator$12.L$2 = null;
                slidingWindowKt$windowedIterator$12.label = 2;
                if (oVar2.yield(arrayList, slidingWindowKt$windowedIterator$12) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return y5.w.INSTANCE;
        }
        if (i10 != 2) {
            if (i10 == 3) {
                it = (Iterator) this.L$2;
                u0Var = (u0) this.L$1;
                oVar = (kotlin.sequences.o) this.L$0;
                y5.g.throwOnFailure(obj);
                slidingWindowKt$windowedIterator$1 = this;
                u0Var.removeFirst(slidingWindowKt$windowedIterator$1.$step);
                while (it.hasNext()) {
                    u0Var.add(it.next());
                    if (u0Var.isFull()) {
                        int size = u0Var.size();
                        int i12 = slidingWindowKt$windowedIterator$1.$size;
                        if (size >= i12) {
                            Object arrayList2 = slidingWindowKt$windowedIterator$1.$reuseBuffer ? u0Var : new ArrayList(u0Var);
                            slidingWindowKt$windowedIterator$1.L$0 = oVar;
                            slidingWindowKt$windowedIterator$1.L$1 = u0Var;
                            slidingWindowKt$windowedIterator$1.L$2 = it;
                            slidingWindowKt$windowedIterator$1.label = 3;
                            if (oVar.yield(arrayList2, slidingWindowKt$windowedIterator$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            u0Var.removeFirst(slidingWindowKt$windowedIterator$1.$step);
                            while (it.hasNext()) {
                            }
                        } else {
                            u0Var = u0Var.expanded(i12);
                        }
                    }
                }
                if (slidingWindowKt$windowedIterator$1.$partialWindows) {
                    u0Var2 = u0Var;
                    oVar3 = oVar;
                    if (u0Var2.size() <= slidingWindowKt$windowedIterator$1.$step) {
                    }
                }
                return y5.w.INSTANCE;
            }
            if (i10 == 4) {
                u0Var2 = (u0) this.L$1;
                oVar3 = (kotlin.sequences.o) this.L$0;
                y5.g.throwOnFailure(obj);
                slidingWindowKt$windowedIterator$1 = this;
                u0Var2.removeFirst(slidingWindowKt$windowedIterator$1.$step);
                if (u0Var2.size() <= slidingWindowKt$windowedIterator$1.$step) {
                    Object arrayList3 = slidingWindowKt$windowedIterator$1.$reuseBuffer ? u0Var2 : new ArrayList(u0Var2);
                    slidingWindowKt$windowedIterator$1.L$0 = oVar3;
                    slidingWindowKt$windowedIterator$1.L$1 = u0Var2;
                    slidingWindowKt$windowedIterator$1.L$2 = null;
                    slidingWindowKt$windowedIterator$1.label = 4;
                    if (oVar3.yield(arrayList3, slidingWindowKt$windowedIterator$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    u0Var2.removeFirst(slidingWindowKt$windowedIterator$1.$step);
                    if (u0Var2.size() <= slidingWindowKt$windowedIterator$1.$step) {
                        if (!u0Var2.isEmpty()) {
                            slidingWindowKt$windowedIterator$1.L$0 = null;
                            slidingWindowKt$windowedIterator$1.L$1 = null;
                            slidingWindowKt$windowedIterator$1.L$2 = null;
                            slidingWindowKt$windowedIterator$1.label = 5;
                            if (oVar3.yield(u0Var2, slidingWindowKt$windowedIterator$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                        return y5.w.INSTANCE;
                    }
                }
            } else if (i10 != 5) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
        y5.g.throwOnFailure(obj);
        return y5.w.INSTANCE;
    }

    @Override // f6.p
    public final Object invoke(kotlin.sequences.o oVar, kotlin.coroutines.c cVar) {
        return ((SlidingWindowKt$windowedIterator$1) create(oVar, cVar)).invokeSuspend(y5.w.INSTANCE);
    }
}
