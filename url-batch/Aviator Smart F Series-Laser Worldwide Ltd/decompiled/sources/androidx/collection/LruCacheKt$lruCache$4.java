package androidx.collection;

import f6.l;
import f6.p;
import f6.r;
import kotlin.jvm.internal.s;

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

    @Override // androidx.collection.LruCache
    protected V create(K key) {
        s.checkNotNullParameter(key, "key");
        return (V) this.$create.invoke(key);
    }

    @Override // androidx.collection.LruCache
    protected void entryRemoved(boolean z7, K key, V oldValue, V v7) {
        s.checkNotNullParameter(key, "key");
        s.checkNotNullParameter(oldValue, "oldValue");
        this.$onEntryRemoved.invoke(Boolean.valueOf(z7), key, oldValue, v7);
    }

    @Override // androidx.collection.LruCache
    protected int sizeOf(K key, V value) {
        s.checkNotNullParameter(key, "key");
        s.checkNotNullParameter(value, "value");
        return ((Number) this.$sizeOf.invoke(key, value)).intValue();
    }
}
