package kotlin.collections;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.SequenceScope;
import papa.SafeTrace;

/* loaded from: classes9.dex */
public final class SlidingWindowKt$windowedIterator$1 extends RestrictedSuspendLambda implements Function2 {
    public final /* synthetic */ Iterator $iterator;
    public final /* synthetic */ boolean $partialWindows;
    public final /* synthetic */ boolean $reuseBuffer;
    public final /* synthetic */ int $size;
    public final /* synthetic */ int $step;
    public int I$0;
    public int I$1;
    public /* synthetic */ Object L$0;
    public Object L$1;
    public Iterator L$2;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SlidingWindowKt$windowedIterator$1(int i, int i2, Iterator it, boolean z, boolean z2, Continuation continuation) {
        super(2, continuation);
        this.$size = i;
        this.$step = i2;
        this.$iterator = it;
        this.$reuseBuffer = z;
        this.$partialWindows = z2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SlidingWindowKt$windowedIterator$1 slidingWindowKt$windowedIterator$1 = new SlidingWindowKt$windowedIterator$1(this.$size, this.$step, this.$iterator, this.$reuseBuffer, this.$partialWindows, continuation);
        slidingWindowKt$windowedIterator$1.L$0 = obj;
        return slidingWindowKt$windowedIterator$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((SlidingWindowKt$windowedIterator$1) create((SequenceScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x015d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0097  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i;
        int i2;
        int i3;
        Iterator it;
        RingBuffer ringBuffer;
        ArrayList arrayList;
        int i4;
        int i5;
        Iterator it2;
        Iterator it3;
        int i6;
        RingBuffer ringBuffer2;
        SequenceScope sequenceScope = (SequenceScope) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i7 = this.label;
        boolean z = this.$partialWindows;
        boolean z2 = this.$reuseBuffer;
        int i8 = this.$step;
        int i9 = this.$size;
        Iterator it4 = null;
        if (i7 == 0) {
            SafeTrace.throwOnFailure(obj);
            int i10 = i9 <= 1024 ? i9 : 1024;
            i = i8 - i9;
            Iterator it5 = this.$iterator;
            if (i >= 0) {
                arrayList = new ArrayList(i10);
                i4 = i10;
                i5 = 0;
                it2 = it5;
                while (it2.hasNext()) {
                }
                if (!arrayList.isEmpty()) {
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.I$0 = i4;
                    this.I$1 = i;
                    this.label = 2;
                    sequenceScope.yield(arrayList, this);
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    return coroutineSingletons;
                }
            } else {
                RingBuffer ringBuffer3 = new RingBuffer(0, new Object[i10]);
                i2 = i10;
                i3 = i;
                it = it5;
                ringBuffer = ringBuffer3;
                while (true) {
                    int i11 = ringBuffer.capacity;
                    Object[] objArr = ringBuffer.buffer;
                    if (it.hasNext()) {
                    }
                    it4 = r18;
                }
            }
        } else if (i7 != 1) {
            if (i7 == 2) {
            } else if (i7 == 3) {
                i3 = this.I$1;
                i2 = this.I$0;
                it = this.L$2;
                ringBuffer = (RingBuffer) this.L$1;
                SafeTrace.throwOnFailure(obj);
                ringBuffer.removeFirst(i8);
                while (true) {
                    int i112 = ringBuffer.capacity;
                    Object[] objArr2 = ringBuffer.buffer;
                    if (it.hasNext()) {
                        it3 = it4;
                        if (z) {
                            i6 = i2;
                            ringBuffer2 = ringBuffer;
                        }
                    } else {
                        Object next = it.next();
                        if (ringBuffer.getSize() == i112) {
                            Iterator it6 = it4;
                            a$$ExternalSyntheticBUOutline0.m$1("ring buffer is full");
                            return it6;
                        }
                        int i12 = ringBuffer.startIndex;
                        Iterator it7 = it4;
                        int i13 = ringBuffer.size;
                        objArr2[(i12 + i13) % i112] = next;
                        ringBuffer.size = i13 + 1;
                        if (ringBuffer.getSize() == i112) {
                            if (ringBuffer.size >= i9) {
                                Object arrayList2 = z2 ? ringBuffer : new ArrayList(ringBuffer);
                                this.L$0 = sequenceScope;
                                this.L$1 = ringBuffer;
                                this.L$2 = it;
                                this.I$0 = i2;
                                this.I$1 = i3;
                                this.label = 3;
                                sequenceScope.yield(arrayList2, this);
                                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                return coroutineSingletons;
                            }
                            int i14 = i112 + (i112 >> 1) + 1;
                            if (i14 > i9) {
                                i14 = i9;
                            }
                            ringBuffer = new RingBuffer(ringBuffer.size, ringBuffer.startIndex == 0 ? Arrays.copyOf(objArr2, i14) : ringBuffer.toArray(new Object[i14]));
                        }
                        it4 = it7;
                    }
                }
            } else if (i7 == 4) {
                i3 = this.I$1;
                i6 = this.I$0;
                ringBuffer2 = (RingBuffer) this.L$1;
                SafeTrace.throwOnFailure(obj);
                ringBuffer2.removeFirst(i8);
                it3 = null;
                if (ringBuffer2.size > i8) {
                    Object arrayList3 = z2 ? ringBuffer2 : new ArrayList(ringBuffer2);
                    this.L$0 = sequenceScope;
                    this.L$1 = ringBuffer2;
                    this.L$2 = it3;
                    this.I$0 = i6;
                    this.I$1 = i3;
                    this.label = 4;
                    sequenceScope.yield(arrayList3, this);
                    CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    return coroutineSingletons;
                }
                Iterator it8 = it3;
                if (!ringBuffer2.isEmpty()) {
                    this.L$0 = it8;
                    this.L$1 = it8;
                    this.L$2 = it8;
                    this.I$0 = i6;
                    this.I$1 = i3;
                    this.label = 5;
                    sequenceScope.yield(ringBuffer2, this);
                    CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    return coroutineSingletons;
                }
            } else {
                if (i7 != 5) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            }
            SafeTrace.throwOnFailure(obj);
        } else {
            i5 = this.I$1;
            i4 = this.I$0;
            it2 = this.L$2;
            arrayList = (ArrayList) this.L$1;
            SafeTrace.throwOnFailure(obj);
            if (z2) {
                arrayList.clear();
            } else {
                arrayList = new ArrayList(i9);
            }
            i = i5;
            while (it2.hasNext()) {
                Object next2 = it2.next();
                if (i5 > 0) {
                    i5--;
                } else {
                    arrayList.add(next2);
                    if (arrayList.size() == i9) {
                        this.L$0 = sequenceScope;
                        this.L$1 = arrayList;
                        this.L$2 = it2;
                        this.I$0 = i4;
                        this.I$1 = i;
                        this.label = 1;
                        sequenceScope.yield(arrayList, this);
                        CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        return coroutineSingletons;
                    }
                }
            }
            if (!arrayList.isEmpty() && (z || arrayList.size() == i9)) {
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.I$0 = i4;
                this.I$1 = i;
                this.label = 2;
                sequenceScope.yield(arrayList, this);
                CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                return coroutineSingletons;
            }
        }
        return Unit.INSTANCE;
    }
}
