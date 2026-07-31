package org.asyncstorage.storage;

import android.content.Context;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.asyncstorage.shared_storage.SharedStorage;
import org.asyncstorage.shared_storage.SharedStorage_androidKt;

/* compiled from: StorageRegistry.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0006J\u0016\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0006R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lorg/asyncstorage/storage/StorageRegistry;", "", "<init>", "()V", "storages", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Lorg/asyncstorage/shared_storage/SharedStorage;", "rnStorages", "Lorg/asyncstorage/storage/RNStorage;", "getRNStorage", "ctx", "Landroid/content/Context;", "name", "getStorage", "react-native-async-storage_async-storage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class StorageRegistry {
    public static final StorageRegistry INSTANCE = new StorageRegistry();
    private static final ConcurrentHashMap<String, SharedStorage> storages = new ConcurrentHashMap<>();
    private static final ConcurrentHashMap<String, RNStorage> rnStorages = new ConcurrentHashMap<>();

    private StorageRegistry() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RNStorage getRNStorage$lambda$2(Function1 function1, Object obj) {
        return (RNStorage) function1.invoke(obj);
    }

    public final RNStorage getRNStorage(final Context ctx, final String name) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(name, "name");
        ConcurrentHashMap<String, RNStorage> concurrentHashMap = rnStorages;
        final Function1 function1 = new Function1() { // from class: org.asyncstorage.storage.StorageRegistry$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                RNStorage rNStorage$lambda$1;
                rNStorage$lambda$1 = StorageRegistry.getRNStorage$lambda$1(name, ctx, (String) obj);
                return rNStorage$lambda$1;
            }
        };
        RNStorage computeIfAbsent = concurrentHashMap.computeIfAbsent(name, new Function() { // from class: org.asyncstorage.storage.StorageRegistry$$ExternalSyntheticLambda3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                RNStorage rNStorage$lambda$2;
                rNStorage$lambda$2 = StorageRegistry.getRNStorage$lambda$2(Function1.this, obj);
                return rNStorage$lambda$2;
            }
        });
        Intrinsics.checkNotNullExpressionValue(computeIfAbsent, "computeIfAbsent(...)");
        return computeIfAbsent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RNStorage getRNStorage$lambda$1(String str, Context context, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        ConcurrentHashMap<String, SharedStorage> concurrentHashMap = storages;
        SharedStorage sharedStorage = concurrentHashMap.get(str);
        if (sharedStorage == null) {
            SharedStorage SharedStorage = SharedStorage_androidKt.SharedStorage(context, str);
            SharedStorage putIfAbsent = concurrentHashMap.putIfAbsent(str, SharedStorage);
            sharedStorage = putIfAbsent == null ? SharedStorage : putIfAbsent;
        }
        SharedStorage sharedStorage2 = sharedStorage;
        Intrinsics.checkNotNull(sharedStorage2);
        return new RNStorage(sharedStorage2, str, null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SharedStorage getStorage$lambda$3(Context context, String str, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return SharedStorage_androidKt.SharedStorage(context, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SharedStorage getStorage$lambda$4(Function1 function1, Object obj) {
        return (SharedStorage) function1.invoke(obj);
    }

    public final SharedStorage getStorage(final Context ctx, final String name) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(name, "name");
        ConcurrentHashMap<String, SharedStorage> concurrentHashMap = storages;
        final Function1 function1 = new Function1() { // from class: org.asyncstorage.storage.StorageRegistry$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                SharedStorage storage$lambda$3;
                storage$lambda$3 = StorageRegistry.getStorage$lambda$3(ctx, name, (String) obj);
                return storage$lambda$3;
            }
        };
        SharedStorage computeIfAbsent = concurrentHashMap.computeIfAbsent(name, new Function() { // from class: org.asyncstorage.storage.StorageRegistry$$ExternalSyntheticLambda1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                SharedStorage storage$lambda$4;
                storage$lambda$4 = StorageRegistry.getStorage$lambda$4(Function1.this, obj);
                return storage$lambda$4;
            }
        });
        Intrinsics.checkNotNullExpressionValue(computeIfAbsent, "computeIfAbsent(...)");
        return computeIfAbsent;
    }
}
