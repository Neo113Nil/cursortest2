package io.ktor.client.plugins.cache.storage;

import com.google.android.gms.common.internal.ImagesContract;
import io.ktor.client.statement.HttpResponse;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.objectweb.asm.Opcodes;

/* compiled from: HttpCacheStorage.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.client.plugins.cache.storage.HttpCacheStorageKt", f = "HttpCacheStorage.kt", i = {0, 0, 0, 0, 0, 1}, l = {125, Opcodes.L2D}, m = "store", n = {"$this$store", "response", "varyKeys", ImagesContract.URL, "isShared", "data"}, s = {"L$0", "L$1", "L$2", "L$3", "Z$0", "L$0"})
/* loaded from: classes3.dex */
final class HttpCacheStorageKt$store$4 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;

    HttpCacheStorageKt$store$4(Continuation<? super HttpCacheStorageKt$store$4> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return HttpCacheStorageKt.store((CacheStorage) null, (HttpResponse) null, (Map<String, String>) null, false, (Continuation<? super CachedResponseData>) this);
    }
}
