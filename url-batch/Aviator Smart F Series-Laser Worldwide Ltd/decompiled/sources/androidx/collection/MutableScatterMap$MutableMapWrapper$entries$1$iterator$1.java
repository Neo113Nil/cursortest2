package androidx.collection;

import f6.p;
import g6.d;
import java.util.Iterator;
import java.util.Map;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.internal.s;
import kotlin.sequences.o;
import kotlin.sequences.q;
import y5.g;
import y5.w;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* loaded from: classes.dex */
public final class MutableScatterMap$MutableMapWrapper$entries$1$iterator$1<K, V> implements Iterator<Map.Entry<K, V>>, d {
    private int current = -1;
    private Iterator<? extends Map.Entry<K, V>> iterator;
    final /* synthetic */ MutableScatterMap<K, V> this$0;

    @kotlin.coroutines.jvm.internal.d(c = "androidx.collection.MutableScatterMap$MutableMapWrapper$entries$1$iterator$1$1", f = "ScatterMap.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {1328}, m = "invokeSuspend", n = {"$this$iterator", "m$iv", "lastIndex$iv", "i$iv", "slot$iv", "bitCount$iv", "j$iv"}, s = {"L$0", "L$3", "I$0", "I$1", "J$0", "I$2", "I$3"})
    /* renamed from: androidx.collection.MutableScatterMap$MutableMapWrapper$entries$1$iterator$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends RestrictedSuspendLambda implements p {
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
        final /* synthetic */ MutableScatterMap<K, V> this$0;
        final /* synthetic */ MutableScatterMap$MutableMapWrapper$entries$1$iterator$1 this$1;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(MutableScatterMap mutableScatterMap, MutableScatterMap$MutableMapWrapper$entries$1$iterator$1 mutableScatterMap$MutableMapWrapper$entries$1$iterator$1, c cVar) {
            super(2, cVar);
            this.this$0 = mutableScatterMap;
            this.this$1 = mutableScatterMap$MutableMapWrapper$entries$1$iterator$1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final c create(Object obj, c cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.this$1, cVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x00c7  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x00dc  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x005f  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x00d7  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0078  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x00b2 -> B:5:0x00b6). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x00bd -> B:6:0x00ba). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x005f -> B:8:0x0076). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00d7 -> B:20:0x00da). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            o oVar;
            MutableScatterMap<K, V> mutableScatterMap;
            MutableScatterMap$MutableMapWrapper$entries$1$iterator$1 mutableScatterMap$MutableMapWrapper$entries$1$iterator$1;
            long[] jArr;
            int length;
            AnonymousClass1 anonymousClass1;
            int i8;
            long j8;
            coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
            int i9 = this.label;
            if (i9 == 0) {
                g.throwOnFailure(obj);
                oVar = (o) this.L$0;
                mutableScatterMap = this.this$0;
                mutableScatterMap$MutableMapWrapper$entries$1$iterator$1 = this.this$1;
                jArr = mutableScatterMap.metadata;
                length = jArr.length - 2;
                if (length >= 0) {
                    anonymousClass1 = this;
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
            MutableScatterMap<K, V> mutableScatterMap2 = (MutableScatterMap) this.L$2;
            MutableScatterMap$MutableMapWrapper$entries$1$iterator$1 mutableScatterMap$MutableMapWrapper$entries$1$iterator$12 = (MutableScatterMap$MutableMapWrapper$entries$1$iterator$1) this.L$1;
            o oVar2 = (o) this.L$0;
            g.throwOnFailure(obj);
            AnonymousClass1 anonymousClass12 = this;
            int i14 = 1;
            o oVar3 = oVar2;
            MutableScatterMap$MutableMapWrapper$entries$1$iterator$1 mutableScatterMap$MutableMapWrapper$entries$1$iterator$13 = mutableScatterMap$MutableMapWrapper$entries$1$iterator$12;
            MutableScatterMap<K, V> mutableScatterMap3 = mutableScatterMap2;
            AnonymousClass1 anonymousClass13 = anonymousClass12;
            j9 >>= 8;
            i10 += i14;
            if (i10 < i11) {
                if (i11 == 8) {
                    jArr = jArr2;
                    anonymousClass1 = anonymousClass13;
                    mutableScatterMap = mutableScatterMap3;
                    mutableScatterMap$MutableMapWrapper$entries$1$iterator$1 = mutableScatterMap$MutableMapWrapper$entries$1$iterator$13;
                    oVar = oVar3;
                    int i15 = i13;
                    i8 = i12;
                    length = i15;
                    if (i8 != length) {
                        i8++;
                        j8 = jArr[i8];
                        if ((((~j8) << 7) & j8 & (-9187201950435737472L)) == -9187201950435737472L) {
                            oVar3 = oVar;
                            i10 = 0;
                            mutableScatterMap3 = mutableScatterMap;
                            anonymousClass13 = anonymousClass1;
                            i11 = 8 - ((~(i8 - length)) >>> 31);
                            mutableScatterMap$MutableMapWrapper$entries$1$iterator$13 = mutableScatterMap$MutableMapWrapper$entries$1$iterator$1;
                            jArr2 = jArr;
                            j9 = j8;
                            int i16 = i8;
                            i13 = length;
                            i12 = i16;
                            if (i10 < i11) {
                                if ((j9 & 255) < 128) {
                                    mutableScatterMap$MutableMapWrapper$entries$1$iterator$13.setCurrent((i12 << 3) + i10);
                                    MutableMapEntry mutableMapEntry = new MutableMapEntry(mutableScatterMap3.keys, mutableScatterMap3.values, mutableScatterMap$MutableMapWrapper$entries$1$iterator$13.getCurrent());
                                    anonymousClass13.L$0 = oVar3;
                                    anonymousClass13.L$1 = mutableScatterMap$MutableMapWrapper$entries$1$iterator$13;
                                    anonymousClass13.L$2 = mutableScatterMap3;
                                    anonymousClass13.L$3 = jArr2;
                                    anonymousClass13.I$0 = i13;
                                    anonymousClass13.I$1 = i12;
                                    anonymousClass13.J$0 = j9;
                                    anonymousClass13.I$2 = i11;
                                    anonymousClass13.I$3 = i10;
                                    i14 = 1;
                                    anonymousClass13.label = 1;
                                    if (oVar3.yield(mutableMapEntry, anonymousClass13) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    anonymousClass12 = anonymousClass13;
                                    mutableScatterMap2 = mutableScatterMap3;
                                    mutableScatterMap$MutableMapWrapper$entries$1$iterator$12 = mutableScatterMap$MutableMapWrapper$entries$1$iterator$13;
                                    oVar2 = oVar3;
                                    o oVar32 = oVar2;
                                    MutableScatterMap$MutableMapWrapper$entries$1$iterator$1 mutableScatterMap$MutableMapWrapper$entries$1$iterator$132 = mutableScatterMap$MutableMapWrapper$entries$1$iterator$12;
                                    MutableScatterMap<K, V> mutableScatterMap32 = mutableScatterMap2;
                                    AnonymousClass1 anonymousClass132 = anonymousClass12;
                                    j9 >>= 8;
                                    i10 += i14;
                                    if (i10 < i11) {
                                    }
                                } else {
                                    i14 = 1;
                                    j9 >>= 8;
                                    i10 += i14;
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
            return ((AnonymousClass1) create(oVar, cVar)).invokeSuspend(w.INSTANCE);
        }
    }

    MutableScatterMap$MutableMapWrapper$entries$1$iterator$1(MutableScatterMap<K, V> mutableScatterMap) {
        Iterator<? extends Map.Entry<K, V>> it;
        this.this$0 = mutableScatterMap;
        it = q.iterator(new AnonymousClass1(mutableScatterMap, this, null));
        this.iterator = it;
    }

    public final int getCurrent() {
        return this.current;
    }

    public final Iterator<Map.Entry<K, V>> getIterator() {
        return this.iterator;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.iterator.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        int i8 = this.current;
        if (i8 != -1) {
            this.this$0.removeValueAt(i8);
            this.current = -1;
        }
    }

    public final void setCurrent(int i8) {
        this.current = i8;
    }

    public final void setIterator(Iterator<? extends Map.Entry<K, V>> it) {
        s.checkNotNullParameter(it, "<set-?>");
        this.iterator = it;
    }

    @Override // java.util.Iterator
    public Map.Entry<K, V> next() {
        return this.iterator.next();
    }
}
