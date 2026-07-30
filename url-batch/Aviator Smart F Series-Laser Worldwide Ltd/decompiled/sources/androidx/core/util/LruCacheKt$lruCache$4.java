package androidx.core.util;

import android.util.LruCache;
import f6.l;
import f6.p;
import f6.r;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* loaded from: classes.dex */
public final class LruCacheKt$lruCache$4<K, V> extends LruCache<K, V> {
    final /* synthetic */ l $create;
    final /* synthetic */ r $onEntryRemoved;
    final /* synthetic */ p $sizeOf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LruCacheKt$lruCache$4(int i8, p pVar, l lVar, r rVar) {
        super(i8);
        this.$sizeOf = pVar;
        this.$create = lVar;
        this.$onEntryRemoved = rVar;
    }

    @Override // android.util.LruCache
    protected V create(K k8) {
        return (V) this.$create.invoke(k8);
    }

    @Override // android.util.LruCache
    protected void entryRemoved(boolean z7, K k8, V v7, V v8) {
        this.$onEntryRemoved.invoke(Boolean.valueOf(z7), k8, v7, v8);
    }

    @Override // android.util.LruCache
    protected int sizeOf(K k8, V v7) {
        return ((Number) this.$sizeOf.invoke(k8, v7)).intValue();
    }
}
