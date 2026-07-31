package androidx.core.util;

import android.util.SparseLongArray;
import kotlin.Metadata;
import kotlin.collections.LongIterator;

/* compiled from: SparseLongArray.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"androidx/core/util/SparseLongArrayKt$valueIterator$1", "Lkotlin/collections/LongIterator;", "", "hasNext", "()Z", "", "nextLong", "()J", "", "index", "I", "getIndex", "()I", "setIndex", "(I)V", "core-ktx_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SparseLongArrayKt$valueIterator$1 extends LongIterator {
    final /* synthetic */ SparseLongArray $this_valueIterator;
    private int index;

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.index < this.$this_valueIterator.size();
    }

    @Override // kotlin.collections.LongIterator
    public long nextLong() {
        SparseLongArray sparseLongArray = this.$this_valueIterator;
        int i = this.index;
        this.index = i + 1;
        return sparseLongArray.valueAt(i);
    }
}
