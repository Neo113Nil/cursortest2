package kotlin.reflect.jvm.internal.impl.resolve.sam;

import kotlin.reflect.jvm.internal.impl.storage.CacheWithNullableValues;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;

/* loaded from: classes9.dex */
public final class SamConversionResolverImpl implements SamConversionResolver {
    public final CacheWithNullableValues functionTypesForSamInterfaces;
    public final Iterable samWithReceiverResolvers;

    public SamConversionResolverImpl(StorageManager storageManager, Iterable<? extends Object> iterable) {
        storageManager.getClass();
        iterable.getClass();
        this.samWithReceiverResolvers = iterable;
        this.functionTypesForSamInterfaces = storageManager.createCacheWithNullableValues();
    }
}
