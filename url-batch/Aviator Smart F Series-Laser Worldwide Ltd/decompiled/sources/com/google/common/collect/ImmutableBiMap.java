package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.collect.ImmutableMap;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotCall;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import javax.annotation.CheckForNull;

@GwtCompatible(emulated = true, serializable = true)
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public abstract class ImmutableBiMap<K, V> extends ImmutableMap<K, V> implements BiMap<K, V> {

    public static final class Builder<K, V> extends ImmutableMap.Builder<K, V> {
        public Builder() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.ImmutableMap.Builder
        @CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ ImmutableMap.Builder put(Object obj, Object obj2) {
            return put((Builder<K, V>) obj, obj2);
        }

        Builder(int i8) {
            super(i8);
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        public ImmutableBiMap<K, V> build() {
            return buildOrThrow();
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        @DoNotCall
        @Deprecated
        public ImmutableBiMap<K, V> buildKeepingLast() {
            throw new UnsupportedOperationException("Not supported for bimaps");
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        public ImmutableBiMap<K, V> buildOrThrow() {
            int i8 = this.size;
            if (i8 == 0) {
                return ImmutableBiMap.of();
            }
            if (this.valueComparator != null) {
                if (this.entriesUsed) {
                    this.alternatingKeysAndValues = Arrays.copyOf(this.alternatingKeysAndValues, i8 * 2);
                }
                ImmutableMap.Builder.sortEntries(this.alternatingKeysAndValues, this.size, this.valueComparator);
            }
            this.entriesUsed = true;
            return new RegularImmutableBiMap(this.alternatingKeysAndValues, this.size);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.ImmutableMap.Builder
        @CanIgnoreReturnValue
        public Builder<K, V> combine(ImmutableMap.Builder<K, V> builder) {
            super.combine((ImmutableMap.Builder) builder);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        @CanIgnoreReturnValue
        @Beta
        public Builder<K, V> orderEntriesByValue(Comparator<? super V> comparator) {
            super.orderEntriesByValue((Comparator) comparator);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        @CanIgnoreReturnValue
        public Builder<K, V> put(K k8, V v7) {
            super.put((Builder<K, V>) k8, (K) v7);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        @CanIgnoreReturnValue
        public Builder<K, V> putAll(Map<? extends K, ? extends V> map) {
            super.putAll((Map) map);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        @CanIgnoreReturnValue
        public Builder<K, V> put(Map.Entry<? extends K, ? extends V> entry) {
            super.put((Map.Entry) entry);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        @CanIgnoreReturnValue
        @Beta
        public Builder<K, V> putAll(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
            super.putAll((Iterable) iterable);
            return this;
        }
    }

    private static class SerializedForm<K, V> extends ImmutableMap.SerializedForm<K, V> {
        private static final long serialVersionUID = 0;

        SerializedForm(ImmutableBiMap<K, V> immutableBiMap) {
            super(immutableBiMap);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.ImmutableMap.SerializedForm
        public Builder<K, V> makeBuilder(int i8) {
            return new Builder<>(i8);
        }
    }

    ImmutableBiMap() {
    }

    public static <K, V> Builder<K, V> builder() {
        return new Builder<>();
    }

    @Beta
    public static <K, V> Builder<K, V> builderWithExpectedSize(int i8) {
        CollectPreconditions.checkNonnegative(i8, "expectedSize");
        return new Builder<>(i8);
    }

    public static <K, V> ImmutableBiMap<K, V> copyOf(Map<? extends K, ? extends V> map) {
        if (map instanceof ImmutableBiMap) {
            ImmutableBiMap<K, V> immutableBiMap = (ImmutableBiMap) map;
            if (!immutableBiMap.isPartialView()) {
                return immutableBiMap;
            }
        }
        return copyOf((Iterable) map.entrySet());
    }

    public static <K, V> ImmutableBiMap<K, V> of() {
        return RegularImmutableBiMap.EMPTY;
    }

    @SafeVarargs
    public static <K, V> ImmutableBiMap<K, V> ofEntries(Map.Entry<? extends K, ? extends V>... entryArr) {
        return copyOf((Iterable) Arrays.asList(entryArr));
    }

    @Override // com.google.common.collect.BiMap
    @CheckForNull
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    @CanIgnoreReturnValue
    public final V forcePut(K k8, V v7) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.BiMap
    public abstract ImmutableBiMap<V, K> inverse();

    @Override // com.google.common.collect.ImmutableMap
    Object writeReplace() {
        return new SerializedForm(this);
    }

    public static <K, V> ImmutableBiMap<K, V> of(K k8, V v7) {
        CollectPreconditions.checkEntryNotNull(k8, v7);
        return new RegularImmutableBiMap(new Object[]{k8, v7}, 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.ImmutableMap
    public final ImmutableSet<V> createValues() {
        throw new AssertionError("should never be called");
    }

    public static <K, V> ImmutableBiMap<K, V> of(K k8, V v7, K k9, V v8) {
        CollectPreconditions.checkEntryNotNull(k8, v7);
        CollectPreconditions.checkEntryNotNull(k9, v8);
        return new RegularImmutableBiMap(new Object[]{k8, v7, k9, v8}, 2);
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map, com.google.common.collect.BiMap
    public ImmutableSet<V> values() {
        return inverse().keySet();
    }

    @Beta
    public static <K, V> ImmutableBiMap<K, V> copyOf(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        return new Builder(iterable instanceof Collection ? ((Collection) iterable).size() : 4).putAll((Iterable) iterable).build();
    }

    public static <K, V> ImmutableBiMap<K, V> of(K k8, V v7, K k9, V v8, K k10, V v9) {
        CollectPreconditions.checkEntryNotNull(k8, v7);
        CollectPreconditions.checkEntryNotNull(k9, v8);
        CollectPreconditions.checkEntryNotNull(k10, v9);
        return new RegularImmutableBiMap(new Object[]{k8, v7, k9, v8, k10, v9}, 3);
    }

    public static <K, V> ImmutableBiMap<K, V> of(K k8, V v7, K k9, V v8, K k10, V v9, K k11, V v10) {
        CollectPreconditions.checkEntryNotNull(k8, v7);
        CollectPreconditions.checkEntryNotNull(k9, v8);
        CollectPreconditions.checkEntryNotNull(k10, v9);
        CollectPreconditions.checkEntryNotNull(k11, v10);
        return new RegularImmutableBiMap(new Object[]{k8, v7, k9, v8, k10, v9, k11, v10}, 4);
    }

    public static <K, V> ImmutableBiMap<K, V> of(K k8, V v7, K k9, V v8, K k10, V v9, K k11, V v10, K k12, V v11) {
        CollectPreconditions.checkEntryNotNull(k8, v7);
        CollectPreconditions.checkEntryNotNull(k9, v8);
        CollectPreconditions.checkEntryNotNull(k10, v9);
        CollectPreconditions.checkEntryNotNull(k11, v10);
        CollectPreconditions.checkEntryNotNull(k12, v11);
        return new RegularImmutableBiMap(new Object[]{k8, v7, k9, v8, k10, v9, k11, v10, k12, v11}, 5);
    }

    public static <K, V> ImmutableBiMap<K, V> of(K k8, V v7, K k9, V v8, K k10, V v9, K k11, V v10, K k12, V v11, K k13, V v12) {
        CollectPreconditions.checkEntryNotNull(k8, v7);
        CollectPreconditions.checkEntryNotNull(k9, v8);
        CollectPreconditions.checkEntryNotNull(k10, v9);
        CollectPreconditions.checkEntryNotNull(k11, v10);
        CollectPreconditions.checkEntryNotNull(k12, v11);
        CollectPreconditions.checkEntryNotNull(k13, v12);
        return new RegularImmutableBiMap(new Object[]{k8, v7, k9, v8, k10, v9, k11, v10, k12, v11, k13, v12}, 6);
    }

    public static <K, V> ImmutableBiMap<K, V> of(K k8, V v7, K k9, V v8, K k10, V v9, K k11, V v10, K k12, V v11, K k13, V v12, K k14, V v13) {
        CollectPreconditions.checkEntryNotNull(k8, v7);
        CollectPreconditions.checkEntryNotNull(k9, v8);
        CollectPreconditions.checkEntryNotNull(k10, v9);
        CollectPreconditions.checkEntryNotNull(k11, v10);
        CollectPreconditions.checkEntryNotNull(k12, v11);
        CollectPreconditions.checkEntryNotNull(k13, v12);
        CollectPreconditions.checkEntryNotNull(k14, v13);
        return new RegularImmutableBiMap(new Object[]{k8, v7, k9, v8, k10, v9, k11, v10, k12, v11, k13, v12, k14, v13}, 7);
    }

    public static <K, V> ImmutableBiMap<K, V> of(K k8, V v7, K k9, V v8, K k10, V v9, K k11, V v10, K k12, V v11, K k13, V v12, K k14, V v13, K k15, V v14) {
        CollectPreconditions.checkEntryNotNull(k8, v7);
        CollectPreconditions.checkEntryNotNull(k9, v8);
        CollectPreconditions.checkEntryNotNull(k10, v9);
        CollectPreconditions.checkEntryNotNull(k11, v10);
        CollectPreconditions.checkEntryNotNull(k12, v11);
        CollectPreconditions.checkEntryNotNull(k13, v12);
        CollectPreconditions.checkEntryNotNull(k14, v13);
        CollectPreconditions.checkEntryNotNull(k15, v14);
        return new RegularImmutableBiMap(new Object[]{k8, v7, k9, v8, k10, v9, k11, v10, k12, v11, k13, v12, k14, v13, k15, v14}, 8);
    }

    public static <K, V> ImmutableBiMap<K, V> of(K k8, V v7, K k9, V v8, K k10, V v9, K k11, V v10, K k12, V v11, K k13, V v12, K k14, V v13, K k15, V v14, K k16, V v15) {
        CollectPreconditions.checkEntryNotNull(k8, v7);
        CollectPreconditions.checkEntryNotNull(k9, v8);
        CollectPreconditions.checkEntryNotNull(k10, v9);
        CollectPreconditions.checkEntryNotNull(k11, v10);
        CollectPreconditions.checkEntryNotNull(k12, v11);
        CollectPreconditions.checkEntryNotNull(k13, v12);
        CollectPreconditions.checkEntryNotNull(k14, v13);
        CollectPreconditions.checkEntryNotNull(k15, v14);
        CollectPreconditions.checkEntryNotNull(k16, v15);
        return new RegularImmutableBiMap(new Object[]{k8, v7, k9, v8, k10, v9, k11, v10, k12, v11, k13, v12, k14, v13, k15, v14, k16, v15}, 9);
    }

    public static <K, V> ImmutableBiMap<K, V> of(K k8, V v7, K k9, V v8, K k10, V v9, K k11, V v10, K k12, V v11, K k13, V v12, K k14, V v13, K k15, V v14, K k16, V v15, K k17, V v16) {
        CollectPreconditions.checkEntryNotNull(k8, v7);
        CollectPreconditions.checkEntryNotNull(k9, v8);
        CollectPreconditions.checkEntryNotNull(k10, v9);
        CollectPreconditions.checkEntryNotNull(k11, v10);
        CollectPreconditions.checkEntryNotNull(k12, v11);
        CollectPreconditions.checkEntryNotNull(k13, v12);
        CollectPreconditions.checkEntryNotNull(k14, v13);
        CollectPreconditions.checkEntryNotNull(k15, v14);
        CollectPreconditions.checkEntryNotNull(k16, v15);
        CollectPreconditions.checkEntryNotNull(k17, v16);
        return new RegularImmutableBiMap(new Object[]{k8, v7, k9, v8, k10, v9, k11, v10, k12, v11, k13, v12, k14, v13, k15, v14, k16, v15, k17, v16}, 10);
    }
}
