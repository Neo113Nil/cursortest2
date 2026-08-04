package org.asyncstorage.storage;

import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReadableArray;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import org.asyncstorage.shared_storage.SharedStorage;

/* compiled from: RNStorage.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u0016\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u0016\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lorg/asyncstorage/storage/RNStorage;", "", "db", "Lorg/asyncstorage/shared_storage/SharedStorage;", "dbName", "", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "<init>", "(Lorg/asyncstorage/shared_storage/SharedStorage;Ljava/lang/String;Lkotlin/coroutines/CoroutineContext;)V", "scope", "Lkotlinx/coroutines/CoroutineScope;", "get", "", "rnKeys", "Lcom/facebook/react/bridge/ReadableArray;", BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/facebook/react/bridge/Promise;", "set", "values", "remove", "keys", "allKeys", "clear", "react-native-async-storage_async-storage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RNStorage {
    private final SharedStorage db;
    private final CoroutineScope scope;

    public RNStorage(SharedStorage db, String dbName, CoroutineContext coroutineContext) {
        Function1 function1;
        Intrinsics.checkNotNullParameter(db, "db");
        Intrinsics.checkNotNullParameter(dbName, "dbName");
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        this.db = db;
        function1 = RNStorageKt.createStorageScope;
        this.scope = CoroutineScopeKt.plus((CoroutineScope) function1.invoke(dbName), coroutineContext);
    }

    public /* synthetic */ RNStorage(SharedStorage sharedStorage, String str, EmptyCoroutineContext emptyCoroutineContext, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(sharedStorage, str, (i & 4) != 0 ? EmptyCoroutineContext.INSTANCE : emptyCoroutineContext);
    }

    public final void get(ReadableArray rnKeys, Promise promise) {
        Intrinsics.checkNotNullParameter(rnKeys, "rnKeys");
        Intrinsics.checkNotNullParameter(promise, "promise");
        RNStorageKt.lunchWithRejection(this.scope, promise, new RNStorage$get$1(rnKeys, this, promise, null));
    }

    public final void set(ReadableArray values, Promise promise) {
        Intrinsics.checkNotNullParameter(values, "values");
        Intrinsics.checkNotNullParameter(promise, "promise");
        RNStorageKt.lunchWithRejection(this.scope, promise, new RNStorage$set$1(values, this, promise, null));
    }

    public final void remove(ReadableArray keys, Promise promise) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        Intrinsics.checkNotNullParameter(promise, "promise");
        RNStorageKt.lunchWithRejection(this.scope, promise, new RNStorage$remove$1(this, keys, promise, null));
    }

    public final void allKeys(Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        RNStorageKt.lunchWithRejection(this.scope, promise, new RNStorage$allKeys$1(this, promise, null));
    }

    public final void clear(Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        RNStorageKt.lunchWithRejection(this.scope, promise, new RNStorage$clear$1(this, promise, null));
    }
}
