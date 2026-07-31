package org.asyncstorage.legacy_storage;

import android.content.Context;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;

/* compiled from: LegacyStorageModule.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u0016\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u0016\u0010\u0014\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u0016\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0011R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lorg/asyncstorage/legacy_storage/LegacyStorageModule;", "Lkotlinx/coroutines/CoroutineScope;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "storage", "Lorg/asyncstorage/legacy_storage/AsyncStorageAccess;", "multiGet", "", "keys", "Lcom/facebook/react/bridge/ReadableArray;", BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/facebook/react/bridge/Promise;", "multiSet", "keyValueArray", "multiRemove", "multiMerge", "getAllKeys", "clear", "Companion", "react-native-async-storage_async-storage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class LegacyStorageModule implements CoroutineScope {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final CoroutineContext coroutineContext;
    private final AsyncStorageAccess storage;

    @JvmStatic
    public static final AsyncStorageAccess getStorageInstance(Context context) {
        return INSTANCE.getStorageInstance(context);
    }

    public LegacyStorageModule(ReactApplicationContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.coroutineContext = Dispatchers.getIO().plus(new CoroutineName("AsyncStorageScope")).plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null));
        this.storage = StorageSupplier.INSTANCE.getInstance(reactContext);
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.coroutineContext;
    }

    /* compiled from: LegacyStorageModule.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, d2 = {"Lorg/asyncstorage/legacy_storage/LegacyStorageModule$Companion;", "", "<init>", "()V", "getStorageInstance", "Lorg/asyncstorage/legacy_storage/AsyncStorageAccess;", "ctx", "Landroid/content/Context;", "react-native-async-storage_async-storage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final AsyncStorageAccess getStorageInstance(Context ctx) {
            Intrinsics.checkNotNullParameter(ctx, "ctx");
            return StorageSupplier.INSTANCE.getInstance(ctx);
        }
    }

    public final void multiGet(ReadableArray keys, Promise promise) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        Intrinsics.checkNotNullParameter(promise, "promise");
        BuildersKt__Builders_commonKt.launch$default(this, LegacyStorageModuleKt.createExceptionHandler(promise), null, new LegacyStorageModule$multiGet$1(this, keys, promise, null), 2, null);
    }

    public final void multiSet(ReadableArray keyValueArray, Promise promise) {
        Intrinsics.checkNotNullParameter(keyValueArray, "keyValueArray");
        Intrinsics.checkNotNullParameter(promise, "promise");
        BuildersKt__Builders_commonKt.launch$default(this, LegacyStorageModuleKt.createExceptionHandler(promise), null, new LegacyStorageModule$multiSet$1(keyValueArray, this, promise, null), 2, null);
    }

    public final void multiRemove(ReadableArray keys, Promise promise) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        Intrinsics.checkNotNullParameter(promise, "promise");
        BuildersKt__Builders_commonKt.launch$default(this, LegacyStorageModuleKt.createExceptionHandler(promise), null, new LegacyStorageModule$multiRemove$1(this, keys, promise, null), 2, null);
    }

    public final void multiMerge(ReadableArray keyValueArray, Promise promise) {
        Intrinsics.checkNotNullParameter(keyValueArray, "keyValueArray");
        Intrinsics.checkNotNullParameter(promise, "promise");
        BuildersKt__Builders_commonKt.launch$default(this, LegacyStorageModuleKt.createExceptionHandler(promise), null, new LegacyStorageModule$multiMerge$1(keyValueArray, this, promise, null), 2, null);
    }

    public final void getAllKeys(Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        BuildersKt__Builders_commonKt.launch$default(this, LegacyStorageModuleKt.createExceptionHandler(promise), null, new LegacyStorageModule$getAllKeys$1(this, promise, null), 2, null);
    }

    public final void clear(Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        BuildersKt__Builders_commonKt.launch$default(this, LegacyStorageModuleKt.createExceptionHandler(promise), null, new LegacyStorageModule$clear$1(this, promise, null), 2, null);
    }
}
