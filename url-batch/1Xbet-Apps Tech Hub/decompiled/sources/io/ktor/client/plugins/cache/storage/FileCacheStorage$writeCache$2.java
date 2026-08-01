package io.ktor.client.plugins.cache.storage;

import io.ktor.client.plugins.cache.HttpCacheKt;
import io.ktor.util.collections.ConcurrentMap;
import io.ktor.utils.io.ByteChannel;
import io.ktor.utils.io.ByteChannelKt;
import io.ktor.utils.io.jvm.javaio.WritingKt;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.List;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

/* compiled from: FileCacheStorage.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.client.plugins.cache.storage.FileCacheStorage$writeCache$2", f = "FileCacheStorage.kt", i = {0, 0, 1, 1, 1}, l = {202, 102}, m = "invokeSuspend", n = {"$this$coroutineScope", "$this$withLock_u24default$iv", "$this$withLock_u24default$iv", "$this$use$iv", "closed$iv"}, s = {"L$0", "L$1", "L$0", "L$1", "I$0"})
/* loaded from: classes3.dex */
final class FileCacheStorage$writeCache$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Object>, Object> {
    final /* synthetic */ List<CachedResponseData> $caches;
    final /* synthetic */ String $urlHex;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ FileCacheStorage this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FileCacheStorage$writeCache$2(FileCacheStorage fileCacheStorage, String str, List<CachedResponseData> list, Continuation<? super FileCacheStorage$writeCache$2> continuation) {
        super(2, continuation);
        this.this$0 = fileCacheStorage;
        this.$urlHex = str;
        this.$caches = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        FileCacheStorage$writeCache$2 fileCacheStorage$writeCache$2 = new FileCacheStorage$writeCache$2(this.this$0, this.$urlHex, this.$caches, continuation);
        fileCacheStorage$writeCache$2.L$0 = obj;
        return fileCacheStorage$writeCache$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Object> continuation) {
        return invoke2(coroutineScope, (Continuation<Object>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<Object> continuation) {
        return ((FileCacheStorage$writeCache$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(8:(1:2)|(1:(1:(9:6|7|8|9|10|11|12|13|14)(2:34|35))(1:36))(2:63|(1:65)(1:66))|45|46|47|48|49|(1:51)(6:52|10|11|12|13|14))|37|38|39|40|(1:42)(1:59)|43|(2:(0)|(1:28))) */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x010e, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v21, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v9 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Mutex mutex;
        Object obj2;
        Mutex mutex2;
        CoroutineScope coroutineScope;
        ConcurrentMap concurrentMap;
        FileCacheStorage fileCacheStorage;
        String str;
        List<CachedResponseData> list;
        CoroutineScope coroutineScope2;
        ByteChannel ByteChannel$default;
        File file;
        BufferedOutputStream bufferedOutputStream;
        BufferedOutputStream bufferedOutputStream2;
        Throwable th;
        Mutex mutex3;
        ByteChannel byteChannel;
        BufferedOutputStream bufferedOutputStream3;
        Object copyTo$default;
        Mutex mutex4;
        BufferedOutputStream bufferedOutputStream4;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        ?? r2 = 2;
        r2 = 2;
        try {
            try {
                try {
                    try {
                    } catch (Throwable th2) {
                        th = th2;
                        r11.unlock(null);
                        throw th;
                    }
                } catch (Exception e) {
                    e = e;
                    mutex = r2;
                    HttpCacheKt.getLOGGER().trace("Exception during saving a cache to a file: " + ExceptionsKt.stackTraceToString(e));
                    obj2 = Unit.INSTANCE;
                    mutex2 = mutex;
                    mutex2.unlock(null);
                    return obj2;
                } catch (Throwable th3) {
                    th = th3;
                    Mutex mutex5 = r2;
                    mutex5.unlock(null);
                    throw th;
                }
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    coroutineScope = (CoroutineScope) this.L$0;
                    concurrentMap = this.this$0.mutexes;
                    Mutex mutex6 = (Mutex) concurrentMap.computeIfAbsent((ConcurrentMap) this.$urlHex, (Function0) new Function0<Mutex>() { // from class: io.ktor.client.plugins.cache.storage.FileCacheStorage$writeCache$2$mutex$1
                        @Override // kotlin.jvm.functions.Function0
                        public final Mutex invoke() {
                            return MutexKt.Mutex$default(false, 1, null);
                        }
                    });
                    fileCacheStorage = this.this$0;
                    str = this.$urlHex;
                    List<CachedResponseData> list2 = this.$caches;
                    this.L$0 = coroutineScope;
                    this.L$1 = mutex6;
                    this.L$2 = fileCacheStorage;
                    this.L$3 = str;
                    this.L$4 = list2;
                    this.label = 1;
                    if (mutex6.lock(null, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    mutex = mutex6;
                    list = list2;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ?? r1 = (Closeable) this.L$1;
                        Mutex mutex7 = (Mutex) this.L$0;
                        try {
                            ResultKt.throwOnFailure(obj);
                            bufferedOutputStream2 = r1;
                            copyTo$default = obj;
                            mutex4 = mutex7;
                        } catch (Throwable th4) {
                            th = th4;
                            bufferedOutputStream4 = r1;
                            r2 = mutex7;
                            try {
                                bufferedOutputStream4.close();
                                throw th;
                            } finally {
                                throw th;
                            }
                        }
                        try {
                            obj2 = Boxing.boxLong(((Number) copyTo$default).longValue());
                            bufferedOutputStream2.close();
                            mutex2 = mutex4;
                            mutex2.unlock(null);
                            return obj2;
                        } catch (Throwable th5) {
                            th = th5;
                            mutex3 = mutex4;
                            bufferedOutputStream4 = bufferedOutputStream2;
                            r2 = mutex3;
                            bufferedOutputStream4.close();
                            throw th;
                        }
                    }
                    list = (List) this.L$4;
                    str = (String) this.L$3;
                    fileCacheStorage = (FileCacheStorage) this.L$2;
                    Mutex mutex8 = (Mutex) this.L$1;
                    coroutineScope = (CoroutineScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    mutex = mutex8;
                }
                copyTo$default = WritingKt.copyTo$default(byteChannel, bufferedOutputStream3, 0L, this, 2, null);
                if (copyTo$default == coroutine_suspended) {
                    return coroutine_suspended;
                }
                mutex4 = mutex;
                obj2 = Boxing.boxLong(((Number) copyTo$default).longValue());
                bufferedOutputStream2.close();
                mutex2 = mutex4;
                mutex2.unlock(null);
                return obj2;
            } catch (Throwable th6) {
                th = th6;
                th = th;
                mutex3 = mutex;
                bufferedOutputStream4 = bufferedOutputStream2;
                r2 = mutex3;
                bufferedOutputStream4.close();
                throw th;
            }
            BuildersKt__Builders_commonKt.launch$default(coroutineScope2, null, null, new FileCacheStorage$writeCache$2$1$1$1(ByteChannel$default, list, fileCacheStorage, null), 3, null);
            byteChannel = ByteChannel$default;
            bufferedOutputStream3 = bufferedOutputStream;
            this.L$0 = mutex;
            this.L$1 = bufferedOutputStream;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = null;
            this.I$0 = 0;
            this.label = 2;
            bufferedOutputStream2 = bufferedOutputStream;
        } catch (Throwable th7) {
            th = th7;
            bufferedOutputStream2 = bufferedOutputStream;
        }
        coroutineScope2 = coroutineScope;
        ByteChannel$default = ByteChannelKt.ByteChannel$default(false, 1, null);
        file = fileCacheStorage.directory;
        OutputStream fileOutputStream = new FileOutputStream(new File(file, str));
        bufferedOutputStream = fileOutputStream instanceof BufferedOutputStream ? (BufferedOutputStream) fileOutputStream : new BufferedOutputStream(fileOutputStream, 8192);
    }
}
