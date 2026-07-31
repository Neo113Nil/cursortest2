package androidx.core.util;

import android.util.SparseArray;
import kotlin.Metadata;
import kotlin.collections.IntIterator;

/* compiled from: SparseArray.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\"\u0010\b\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"androidx/core/util/SparseArrayKt$keyIterator$1", "Lkotlin/collections/IntIterator;", "", "hasNext", "()Z", "", "nextInt", "()I", "index", "I", "getIndex", "setIndex", "(I)V", "core-ktx_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SparseArrayKt$keyIterator$1 extends IntIterator {
    final /* synthetic */ SparseArray $this_keyIterator;
    private int index;

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.index < this.$this_keyIterator.size();
    }

    @Override // kotlin.collections.IntIterator
    public int nextInt() {
        SparseArray sparseArray = this.$this_keyIterator;
        int i = this.index;
        this.index = i + 1;
        return sparseArray.keyAt(i);
    }
}
