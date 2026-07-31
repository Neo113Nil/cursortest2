package androidx.collection;

import com.yandex.div.core.ScrollDirection;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.sequences.SequenceScope;
import kotlin.sequences.SequencesKt;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* compiled from: ScatterMap.kt */
@Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0010)\n\u0002\u0010'\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR4\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0013\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"androidx/collection/MutableEntries$iterator$1", "", "", "", "hasNext", "()Z", ScrollDirection.NEXT, "()Ljava/util/Map$Entry;", "", "remove", "()V", "", "iterator", "Ljava/util/Iterator;", "getIterator", "()Ljava/util/Iterator;", "setIterator", "(Ljava/util/Iterator;)V", "", "current", "I", "getCurrent", "()I", "setCurrent", "(I)V", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MutableEntries$iterator$1<K, V> implements Iterator<Map.Entry<K, V>>, KMappedMarker {
    private int current = -1;
    private Iterator iterator;
    final /* synthetic */ MutableEntries this$0;

    MutableEntries$iterator$1(MutableEntries mutableEntries) {
        this.this$0 = mutableEntries;
        this.iterator = SequencesKt.iterator(new AnonymousClass1(mutableEntries, this, null));
    }

    public final int getCurrent() {
        return this.current;
    }

    public final void setCurrent(int i) {
        this.current = i;
    }

    /* compiled from: ScatterMap.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010'\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00050\u0004H\u008a@"}, d2 = {"<anonymous>", "", "K", "V", "Lkotlin/sequences/SequenceScope;", ""}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.collection.MutableEntries$iterator$1$1", f = "ScatterMap.kt", l = {1538}, m = "invokeSuspend")
    /* renamed from: androidx.collection.MutableEntries$iterator$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends RestrictedSuspendLambda implements Function2 {
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
        final /* synthetic */ MutableEntries<K, V> this$0;
        final /* synthetic */ MutableEntries$iterator$1 this$1;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(MutableEntries<K, V> mutableEntries, MutableEntries$iterator$1 mutableEntries$iterator$1, Continuation continuation) {
            super(2, continuation);
            this.this$0 = mutableEntries;
            this.this$1 = mutableEntries$iterator$1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.this$1, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SequenceScope sequenceScope, Continuation continuation) {
            return ((AnonymousClass1) create(sequenceScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x00c0  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x00d0  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0060  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x00cd  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0078  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x00b5 -> B:5:0x00b8). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x00bb -> B:6:0x00bc). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0060 -> B:7:0x0076). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00cd -> B:18:0x00ce). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            SequenceScope sequenceScope;
            MutableScatterMap mutableScatterMap;
            MutableEntries$iterator$1 mutableEntries$iterator$1;
            MutableEntries<K, V> mutableEntries;
            long[] jArr;
            int length;
            int i;
            long j;
            MutableScatterMap mutableScatterMap2;
            MutableScatterMap mutableScatterMap3;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            int i3 = 8;
            int i4 = 1;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                sequenceScope = (SequenceScope) this.L$0;
                mutableScatterMap = ((MutableEntries) this.this$0).parent;
                mutableEntries$iterator$1 = this.this$1;
                mutableEntries = this.this$0;
                jArr = mutableScatterMap.metadata;
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
            int i5 = this.I$3;
            int i6 = this.I$2;
            long j2 = this.J$0;
            int i7 = this.I$1;
            int i8 = this.I$0;
            long[] jArr2 = (long[]) this.L$3;
            MutableEntries<K, V> mutableEntries2 = (MutableEntries) this.L$2;
            MutableEntries$iterator$1 mutableEntries$iterator$12 = (MutableEntries$iterator$1) this.L$1;
            SequenceScope sequenceScope2 = (SequenceScope) this.L$0;
            ResultKt.throwOnFailure(obj);
            int i9 = 1;
            i3 = 8;
            j2 >>= i3;
            i5 += i9;
            i4 = i9;
            if (i5 < i6) {
                int i10 = i4;
                if (i6 == i3) {
                    jArr = jArr2;
                    mutableEntries = mutableEntries2;
                    mutableEntries$iterator$1 = mutableEntries$iterator$12;
                    sequenceScope = sequenceScope2;
                    int i11 = i8;
                    i = i7;
                    length = i11;
                    if (i != length) {
                        i++;
                        i4 = i10;
                        j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                            sequenceScope2 = sequenceScope;
                            i5 = 0;
                            jArr2 = jArr;
                            mutableEntries2 = mutableEntries;
                            i6 = 8 - ((~(i - length)) >>> 31);
                            mutableEntries$iterator$12 = mutableEntries$iterator$1;
                            j2 = j;
                            int i12 = i;
                            i8 = length;
                            i7 = i12;
                            if (i5 < i6) {
                                if ((255 & j2) < 128) {
                                    mutableEntries$iterator$12.setCurrent((i7 << 3) + i5);
                                    mutableScatterMap2 = ((MutableEntries) mutableEntries2).parent;
                                    Object[] objArr = mutableScatterMap2.keys;
                                    mutableScatterMap3 = ((MutableEntries) mutableEntries2).parent;
                                    MutableMapEntry mutableMapEntry = new MutableMapEntry(objArr, mutableScatterMap3.values, mutableEntries$iterator$12.getCurrent());
                                    this.L$0 = sequenceScope2;
                                    this.L$1 = mutableEntries$iterator$12;
                                    this.L$2 = mutableEntries2;
                                    this.L$3 = jArr2;
                                    this.I$0 = i8;
                                    this.I$1 = i7;
                                    this.J$0 = j2;
                                    this.I$2 = i6;
                                    this.I$3 = i5;
                                    i9 = 1;
                                    this.label = 1;
                                    if (sequenceScope2.yield(mutableMapEntry, this) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    i3 = 8;
                                    j2 >>= i3;
                                    i5 += i9;
                                    i4 = i9;
                                    if (i5 < i6) {
                                    }
                                } else {
                                    i9 = i4;
                                    j2 >>= i3;
                                    i5 += i9;
                                    i4 = i9;
                                    if (i5 < i6) {
                                    }
                                }
                            }
                        } else {
                            i10 = i4;
                            if (i != length) {
                            }
                        }
                    }
                }
                return Unit.INSTANCE;
            }
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.iterator.hasNext();
    }

    @Override // java.util.Iterator
    public Map.Entry next() {
        return (Map.Entry) this.iterator.next();
    }

    @Override // java.util.Iterator
    public void remove() {
        MutableScatterMap mutableScatterMap;
        if (this.current != -1) {
            mutableScatterMap = this.this$0.parent;
            mutableScatterMap.removeValueAt(this.current);
            this.current = -1;
        }
    }
}
