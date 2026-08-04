package org.asyncstorage.legacy_storage;

import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* compiled from: LegacyStorageModule.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000¨\u0006\u0004"}, d2 = {"createExceptionHandler", "Lkotlinx/coroutines/CoroutineExceptionHandler;", BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/facebook/react/bridge/Promise;", "react-native-async-storage_async-storage_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LegacyStorageModuleKt {
    public static final CoroutineExceptionHandler createExceptionHandler(Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        return new LegacyStorageModuleKt$createExceptionHandler$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.INSTANCE, promise);
    }
}
