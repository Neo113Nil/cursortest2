package io.ktor.client.plugins.cache.storage;

import com.google.android.gms.common.internal.ImagesContract;
import io.ktor.client.plugins.cache.HttpCacheKt;
import io.ktor.http.HeadersBuilder;
import io.ktor.http.HttpProtocolVersion;
import io.ktor.http.HttpStatusCode;
import io.ktor.http.URLUtilsKt;
import io.ktor.http.Url;
import io.ktor.util.CryptoKt;
import io.ktor.util.StringValuesKt;
import io.ktor.util.collections.ConcurrentMap;
import io.ktor.util.date.DateJvmKt;
import io.ktor.util.date.GMTDate;
import io.ktor.utils.io.ByteChannel;
import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.ByteReadChannelKt;
import io.ktor.utils.io.ByteWriteChannel;
import io.ktor.utils.io.ByteWriteChannelKt;
import io.ktor.utils.io.jvm.javaio.ReadingKt;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.security.MessageDigest;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

/* compiled from: FileCacheStorage.kt */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J/\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000e2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u0010H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0011J\u001f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u00132\u0006\u0010\r\u001a\u00020\u000eH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0019\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0018H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u0019J\u001f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\f0\u00132\u0006\u0010\u001a\u001a\u00020\tH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u001bJ!\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\fH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u001fJ!\u0010 \u001a\u00020\u001d2\u0006\u0010\u0017\u001a\u00020!2\u0006\u0010\"\u001a\u00020\fH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010#J'\u0010 \u001a\u00020$2\u0006\u0010\u001a\u001a\u00020\t2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\f0&H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010'R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006("}, d2 = {"Lio/ktor/client/plugins/cache/storage/FileCacheStorage;", "Lio/ktor/client/plugins/cache/storage/CacheStorage;", "directory", "Ljava/io/File;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Ljava/io/File;Lkotlinx/coroutines/CoroutineDispatcher;)V", "mutexes", "Lio/ktor/util/collections/ConcurrentMap;", "", "Lkotlinx/coroutines/sync/Mutex;", "find", "Lio/ktor/client/plugins/cache/storage/CachedResponseData;", ImagesContract.URL, "Lio/ktor/http/Url;", "varyKeys", "", "(Lio/ktor/http/Url;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "findAll", "", "(Lio/ktor/http/Url;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "key", "readCache", "channel", "Lio/ktor/utils/io/ByteReadChannel;", "(Lio/ktor/utils/io/ByteReadChannel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "urlHex", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "store", "", "data", "(Lio/ktor/http/Url;Lio/ktor/client/plugins/cache/storage/CachedResponseData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "writeCache", "Lio/ktor/utils/io/ByteChannel;", "cache", "(Lio/ktor/utils/io/ByteChannel;Lio/ktor/client/plugins/cache/storage/CachedResponseData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "caches", "", "(Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ktor-client-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
final class FileCacheStorage implements CacheStorage {
    private final File directory;
    private final CoroutineDispatcher dispatcher;
    private final ConcurrentMap<String, Mutex> mutexes;

    public FileCacheStorage(File directory, CoroutineDispatcher dispatcher) {
        Intrinsics.checkNotNullParameter(directory, "directory");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        this.directory = directory;
        this.dispatcher = dispatcher;
        this.mutexes = new ConcurrentMap<>(0, 1, null);
        directory.mkdirs();
    }

    public /* synthetic */ FileCacheStorage(File file, CoroutineDispatcher coroutineDispatcher, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(file, (i & 2) != 0 ? Dispatchers.getIO() : coroutineDispatcher);
    }

    @Override // io.ktor.client.plugins.cache.storage.CacheStorage
    public Object store(Url url, CachedResponseData cachedResponseData, Continuation<? super Unit> continuation) {
        Object withContext = BuildersKt.withContext(this.dispatcher, new FileCacheStorage$store$2(this, url, cachedResponseData, null), continuation);
        return withContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // io.ktor.client.plugins.cache.storage.CacheStorage
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object findAll(Url url, Continuation<? super Set<CachedResponseData>> continuation) {
        FileCacheStorage$findAll$1 fileCacheStorage$findAll$1;
        int i;
        if (continuation instanceof FileCacheStorage$findAll$1) {
            fileCacheStorage$findAll$1 = (FileCacheStorage$findAll$1) continuation;
            if ((fileCacheStorage$findAll$1.label & Integer.MIN_VALUE) != 0) {
                fileCacheStorage$findAll$1.label -= Integer.MIN_VALUE;
                Object obj = fileCacheStorage$findAll$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = fileCacheStorage$findAll$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    String key = key(url);
                    fileCacheStorage$findAll$1.label = 1;
                    obj = readCache(key, fileCacheStorage$findAll$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return CollectionsKt.toSet((Iterable) obj);
            }
        }
        fileCacheStorage$findAll$1 = new FileCacheStorage$findAll$1(this, continuation);
        Object obj2 = fileCacheStorage$findAll$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = fileCacheStorage$findAll$1.label;
        if (i != 0) {
        }
        return CollectionsKt.toSet((Iterable) obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // io.ktor.client.plugins.cache.storage.CacheStorage
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object find(Url url, Map<String, String> map, Continuation<? super CachedResponseData> continuation) {
        FileCacheStorage$find$1 fileCacheStorage$find$1;
        int i;
        boolean z;
        if (continuation instanceof FileCacheStorage$find$1) {
            fileCacheStorage$find$1 = (FileCacheStorage$find$1) continuation;
            if ((fileCacheStorage$find$1.label & Integer.MIN_VALUE) != 0) {
                fileCacheStorage$find$1.label -= Integer.MIN_VALUE;
                Object obj = fileCacheStorage$find$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = fileCacheStorage$find$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    String key = key(url);
                    fileCacheStorage$find$1.L$0 = map;
                    fileCacheStorage$find$1.label = 1;
                    obj = readCache(key, fileCacheStorage$find$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    map = (Map) fileCacheStorage$find$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                for (Object obj2 : (Set) obj) {
                    CachedResponseData cachedResponseData = (CachedResponseData) obj2;
                    if (!map.isEmpty()) {
                        for (Map.Entry<String, String> entry : map.entrySet()) {
                            if (!Intrinsics.areEqual(cachedResponseData.getVaryKeys().get(entry.getKey()), entry.getValue())) {
                                z = false;
                                break;
                            }
                        }
                    }
                    z = true;
                    if (z) {
                        return obj2;
                    }
                }
                return null;
            }
        }
        fileCacheStorage$find$1 = new FileCacheStorage$find$1(this, continuation);
        Object obj3 = fileCacheStorage$find$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = fileCacheStorage$find$1.label;
        if (i != 0) {
        }
        while (r7.hasNext()) {
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String key(Url url) {
        byte[] digest = MessageDigest.getInstance("MD5").digest(StringsKt.encodeToByteArray(url.getUrlString()));
        Intrinsics.checkNotNullExpressionValue(digest, "digest(...)");
        return CryptoKt.hex(digest);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object writeCache(String str, List<CachedResponseData> list, Continuation<Object> continuation) {
        return CoroutineScopeKt.coroutineScope(new FileCacheStorage$writeCache$2(this, str, list, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0175 A[Catch: all -> 0x019b, TRY_ENTER, TRY_LEAVE, TryCatch #7 {all -> 0x019b, blocks: (B:52:0x0141, B:43:0x0175), top: B:51:0x0141 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0141 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e5 A[Catch: all -> 0x01de, TRY_LEAVE, TryCatch #10 {all -> 0x01de, blocks: (B:95:0x01b6, B:74:0x00d8, B:76:0x00e5, B:80:0x00ed, B:82:0x00f8, B:83:0x0103, B:93:0x00fb), top: B:73:0x00d8 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ed A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v4, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v4, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r2v5, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object, kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v15, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r7v12, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v9, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x015c -> B:39:0x0167). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object readCache(String str, Continuation<? super Set<CachedResponseData>> continuation) {
        FileCacheStorage$readCache$1 fileCacheStorage$readCache$1;
        int i;
        ?? r2;
        FileCacheStorage fileCacheStorage;
        File file;
        BufferedInputStream bufferedInputStream;
        ?? r3;
        Closeable closeable;
        ByteReadChannel byteReadChannelWithArrayPool$default;
        Object readInt;
        ?? r8;
        ByteReadChannel byteReadChannel;
        int i2;
        FileCacheStorage fileCacheStorage2;
        Throwable th;
        int i3;
        Set linkedHashSet;
        ByteReadChannel byteReadChannel2;
        int i4;
        Object obj;
        FileCacheStorage fileCacheStorage3;
        Mutex mutex;
        String str2 = str;
        try {
            try {
                if (continuation instanceof FileCacheStorage$readCache$1) {
                    FileCacheStorage$readCache$1 fileCacheStorage$readCache$12 = (FileCacheStorage$readCache$1) continuation;
                    if ((fileCacheStorage$readCache$12.label & Integer.MIN_VALUE) != 0) {
                        fileCacheStorage$readCache$12.label -= Integer.MIN_VALUE;
                        fileCacheStorage$readCache$1 = fileCacheStorage$readCache$12;
                        Object obj2 = fileCacheStorage$readCache$1.result;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i = fileCacheStorage$readCache$1.label;
                        int i5 = 0;
                        if (i != 0) {
                            ResultKt.throwOnFailure(obj2);
                            Mutex computeIfAbsent = this.mutexes.computeIfAbsent((ConcurrentMap<String, Mutex>) str2, (Function0<? extends Mutex>) new Function0<Mutex>() { // from class: io.ktor.client.plugins.cache.storage.FileCacheStorage$readCache$mutex$1
                                @Override // kotlin.jvm.functions.Function0
                                public final Mutex invoke() {
                                    return MutexKt.Mutex$default(false, 1, null);
                                }
                            });
                            fileCacheStorage$readCache$1.L$0 = this;
                            fileCacheStorage$readCache$1.L$1 = str2;
                            fileCacheStorage$readCache$1.L$2 = computeIfAbsent;
                            fileCacheStorage$readCache$1.label = 1;
                            if (computeIfAbsent.lock(null, fileCacheStorage$readCache$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            fileCacheStorage = this;
                            r2 = computeIfAbsent;
                        } else {
                            if (i != 1) {
                                if (i == 2) {
                                    i2 = fileCacheStorage$readCache$1.I$0;
                                    ByteReadChannel byteReadChannel3 = (ByteReadChannel) fileCacheStorage$readCache$1.L$3;
                                    ?? r7 = (Closeable) fileCacheStorage$readCache$1.L$2;
                                    r8 = (Mutex) fileCacheStorage$readCache$1.L$1;
                                    FileCacheStorage fileCacheStorage4 = (FileCacheStorage) fileCacheStorage$readCache$1.L$0;
                                    try {
                                        ResultKt.throwOnFailure(obj2);
                                        byteReadChannel = byteReadChannel3;
                                        bufferedInputStream = r7;
                                        fileCacheStorage2 = fileCacheStorage4;
                                        try {
                                            int intValue = ((Number) obj2).intValue();
                                            ByteReadChannel byteReadChannel4 = byteReadChannel;
                                            i3 = i2;
                                            linkedHashSet = new LinkedHashSet();
                                            byteReadChannel2 = byteReadChannel4;
                                            BufferedInputStream bufferedInputStream2 = bufferedInputStream;
                                            i4 = intValue;
                                            obj = coroutine_suspended;
                                            closeable = bufferedInputStream2;
                                            fileCacheStorage3 = fileCacheStorage2;
                                            if (i5 >= i4) {
                                            }
                                            th = th;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            closeable = bufferedInputStream;
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        closeable = r7;
                                    }
                                    fileCacheStorage$readCache$1 = r8;
                                    closeable.close();
                                    throw th;
                                }
                                if (i != 3) {
                                    if (i != 4) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    int i6 = fileCacheStorage$readCache$1.I$0;
                                    linkedHashSet = (Set) fileCacheStorage$readCache$1.L$2;
                                    closeable = (Closeable) fileCacheStorage$readCache$1.L$1;
                                    r3 = (Mutex) fileCacheStorage$readCache$1.L$0;
                                    try {
                                        ResultKt.throwOnFailure(obj2);
                                        mutex = r3;
                                        closeable.close();
                                        mutex.unlock(null);
                                        return linkedHashSet;
                                    } catch (Throwable th4) {
                                        th = th4;
                                        th = th;
                                        fileCacheStorage$readCache$1 = r3;
                                        try {
                                            closeable.close();
                                            throw th;
                                        } finally {
                                            throw th;
                                        }
                                    }
                                }
                                int i7 = fileCacheStorage$readCache$1.I$2;
                                i4 = fileCacheStorage$readCache$1.I$1;
                                int i8 = fileCacheStorage$readCache$1.I$0;
                                Set set = (Set) fileCacheStorage$readCache$1.L$5;
                                Set set2 = (Set) fileCacheStorage$readCache$1.L$4;
                                byteReadChannel2 = (ByteReadChannel) fileCacheStorage$readCache$1.L$3;
                                Closeable closeable2 = (Closeable) fileCacheStorage$readCache$1.L$2;
                                ?? r15 = (Mutex) fileCacheStorage$readCache$1.L$1;
                                FileCacheStorage fileCacheStorage5 = (FileCacheStorage) fileCacheStorage$readCache$1.L$0;
                                try {
                                    ResultKt.throwOnFailure(obj2);
                                    i3 = i8;
                                    FileCacheStorage fileCacheStorage6 = fileCacheStorage5;
                                    set.add(obj2);
                                    obj = coroutine_suspended;
                                    closeable = closeable2;
                                    r8 = r15;
                                    FileCacheStorage fileCacheStorage7 = fileCacheStorage6;
                                    i5 = i7 + 1;
                                    linkedHashSet = set2;
                                    fileCacheStorage3 = fileCacheStorage7;
                                    if (i5 >= i4) {
                                        try {
                                            fileCacheStorage$readCache$1.L$0 = fileCacheStorage3;
                                            fileCacheStorage$readCache$1.L$1 = r8;
                                            fileCacheStorage$readCache$1.L$2 = closeable;
                                            fileCacheStorage$readCache$1.L$3 = byteReadChannel2;
                                            fileCacheStorage$readCache$1.L$4 = linkedHashSet;
                                            fileCacheStorage$readCache$1.L$5 = linkedHashSet;
                                            fileCacheStorage$readCache$1.I$0 = i3;
                                            fileCacheStorage$readCache$1.I$1 = i4;
                                            fileCacheStorage$readCache$1.I$2 = i5;
                                            fileCacheStorage$readCache$1.label = 3;
                                            Object readCache = fileCacheStorage3.readCache(byteReadChannel2, fileCacheStorage$readCache$1);
                                            if (readCache == obj) {
                                                return obj;
                                            }
                                            r15 = r8;
                                            set = linkedHashSet;
                                            i7 = i5;
                                            fileCacheStorage6 = fileCacheStorage3;
                                            set2 = set;
                                            Closeable closeable3 = closeable;
                                            coroutine_suspended = obj;
                                            obj2 = readCache;
                                            closeable2 = closeable3;
                                            set.add(obj2);
                                            obj = coroutine_suspended;
                                            closeable = closeable2;
                                            r8 = r15;
                                            FileCacheStorage fileCacheStorage72 = fileCacheStorage6;
                                            i5 = i7 + 1;
                                            linkedHashSet = set2;
                                            fileCacheStorage3 = fileCacheStorage72;
                                            if (i5 >= i4) {
                                                fileCacheStorage$readCache$1.L$0 = r8;
                                                fileCacheStorage$readCache$1.L$1 = closeable;
                                                fileCacheStorage$readCache$1.L$2 = linkedHashSet;
                                                fileCacheStorage$readCache$1.L$3 = null;
                                                fileCacheStorage$readCache$1.L$4 = null;
                                                fileCacheStorage$readCache$1.L$5 = null;
                                                fileCacheStorage$readCache$1.I$0 = i3;
                                                fileCacheStorage$readCache$1.label = 4;
                                                if (ByteReadChannelKt.discard(byteReadChannel2, fileCacheStorage$readCache$1) == obj) {
                                                    return obj;
                                                }
                                                mutex = r8;
                                                closeable.close();
                                                mutex.unlock(null);
                                                return linkedHashSet;
                                            }
                                        } catch (Throwable th5) {
                                            th = th5;
                                        }
                                    }
                                    th = th5;
                                } catch (Throwable th6) {
                                    th = th6;
                                    closeable = closeable2;
                                    fileCacheStorage$readCache$1 = r15;
                                }
                                fileCacheStorage$readCache$1 = r8;
                                closeable.close();
                                throw th;
                            }
                            Mutex mutex2 = (Mutex) fileCacheStorage$readCache$1.L$2;
                            String str3 = (String) fileCacheStorage$readCache$1.L$1;
                            FileCacheStorage fileCacheStorage8 = (FileCacheStorage) fileCacheStorage$readCache$1.L$0;
                            ResultKt.throwOnFailure(obj2);
                            r2 = mutex2;
                            str2 = str3;
                            fileCacheStorage = fileCacheStorage8;
                        }
                        file = new File(fileCacheStorage.directory, str2);
                        if (!file.exists()) {
                            try {
                                InputStream fileInputStream = new FileInputStream(file);
                                bufferedInputStream = fileInputStream instanceof BufferedInputStream ? (BufferedInputStream) fileInputStream : new BufferedInputStream(fileInputStream, 8192);
                                try {
                                    byteReadChannelWithArrayPool$default = ReadingKt.toByteReadChannelWithArrayPool$default(bufferedInputStream, null, null, 3, null);
                                    fileCacheStorage$readCache$1.L$0 = fileCacheStorage;
                                    fileCacheStorage$readCache$1.L$1 = r2;
                                    fileCacheStorage$readCache$1.L$2 = bufferedInputStream;
                                    fileCacheStorage$readCache$1.L$3 = byteReadChannelWithArrayPool$default;
                                    fileCacheStorage$readCache$1.I$0 = 0;
                                    fileCacheStorage$readCache$1.label = 2;
                                    readInt = byteReadChannelWithArrayPool$default.readInt(fileCacheStorage$readCache$1);
                                } catch (Throwable th7) {
                                    th = th7;
                                    r3 = r2;
                                    closeable = bufferedInputStream;
                                    th = th;
                                    fileCacheStorage$readCache$1 = r3;
                                    closeable.close();
                                    throw th;
                                }
                                if (readInt == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                r8 = r2;
                                obj2 = readInt;
                                byteReadChannel = byteReadChannelWithArrayPool$default;
                                i2 = 0;
                                fileCacheStorage2 = fileCacheStorage;
                                int intValue2 = ((Number) obj2).intValue();
                                ByteReadChannel byteReadChannel42 = byteReadChannel;
                                i3 = i2;
                                linkedHashSet = new LinkedHashSet();
                                byteReadChannel2 = byteReadChannel42;
                                BufferedInputStream bufferedInputStream22 = bufferedInputStream;
                                i4 = intValue2;
                                obj = coroutine_suspended;
                                closeable = bufferedInputStream22;
                                fileCacheStorage3 = fileCacheStorage2;
                                if (i5 >= i4) {
                                }
                                th = th5;
                                fileCacheStorage$readCache$1 = r8;
                                closeable.close();
                                throw th;
                            } catch (Exception e) {
                                e = e;
                                HttpCacheKt.getLOGGER().trace("Exception during cache lookup in a file: " + ExceptionsKt.stackTraceToString(e));
                                Set emptySet = SetsKt.emptySet();
                                r2.unlock(null);
                                return emptySet;
                            }
                        }
                        Set emptySet2 = SetsKt.emptySet();
                        r2.unlock(null);
                        return emptySet2;
                    }
                }
                file = new File(fileCacheStorage.directory, str2);
                if (!file.exists()) {
                }
            } catch (Throwable th8) {
                th = th8;
                r2.unlock(null);
                throw th;
            }
            if (i != 0) {
            }
        } catch (Exception e2) {
            e = e2;
            r2 = fileCacheStorage$readCache$1;
            HttpCacheKt.getLOGGER().trace("Exception during cache lookup in a file: " + ExceptionsKt.stackTraceToString(e));
            Set emptySet3 = SetsKt.emptySet();
            r2.unlock(null);
            return emptySet3;
        } catch (Throwable th9) {
            th = th9;
            r2 = fileCacheStorage$readCache$1;
            r2.unlock(null);
            throw th;
        }
        fileCacheStorage$readCache$1 = new FileCacheStorage$readCache$1(this, continuation);
        Object obj22 = fileCacheStorage$readCache$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = fileCacheStorage$readCache$1.label;
        int i52 = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x032d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x02fe A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0287 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0270 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x025b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0225 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01b9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x019b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0175 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0148 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x02ff -> B:19:0x0294). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x0226 -> B:48:0x01be). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object writeCache(ByteChannel byteChannel, CachedResponseData cachedResponseData, Continuation<? super Unit> continuation) {
        FileCacheStorage$writeCache$3 fileCacheStorage$writeCache$3;
        int value;
        ByteChannel byteChannel2;
        CachedResponseData cachedResponseData2;
        String str;
        String sb;
        ByteChannel byteChannel3;
        CachedResponseData cachedResponseData3;
        List<Pair<String, String>> flattenEntries;
        int size;
        Iterator<Pair<String, String>> it;
        String str2;
        Iterator<Pair<String, String>> it2;
        CachedResponseData cachedResponseData4;
        ByteChannel byteChannel4;
        String str3;
        CachedResponseData cachedResponseData5;
        ByteChannel byteChannel5;
        long timestamp;
        long timestamp2;
        int size2;
        Iterator<Map.Entry<String, String>> it3;
        String str4;
        Iterator<Map.Entry<String, String>> it4;
        CachedResponseData cachedResponseData6;
        ByteChannel byteChannel6;
        String str5;
        byte[] body;
        if (continuation instanceof FileCacheStorage$writeCache$3) {
            fileCacheStorage$writeCache$3 = (FileCacheStorage$writeCache$3) continuation;
            if ((fileCacheStorage$writeCache$3.label & Integer.MIN_VALUE) != 0) {
                fileCacheStorage$writeCache$3.label -= Integer.MIN_VALUE;
                Object obj = fileCacheStorage$writeCache$3.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (fileCacheStorage$writeCache$3.label) {
                    case 0:
                        ResultKt.throwOnFailure(obj);
                        String sb2 = new StringBuilder().append(cachedResponseData.getUrl()).append('\n').toString();
                        fileCacheStorage$writeCache$3.L$0 = byteChannel;
                        fileCacheStorage$writeCache$3.L$1 = cachedResponseData;
                        fileCacheStorage$writeCache$3.label = 1;
                        if (ByteWriteChannelKt.writeStringUtf8((ByteWriteChannel) byteChannel, sb2, (Continuation<? super Unit>) fileCacheStorage$writeCache$3) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        value = cachedResponseData.getStatusCode().getValue();
                        fileCacheStorage$writeCache$3.L$0 = byteChannel;
                        fileCacheStorage$writeCache$3.L$1 = cachedResponseData;
                        fileCacheStorage$writeCache$3.label = 2;
                        if (byteChannel.writeInt(value, fileCacheStorage$writeCache$3) != coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        CachedResponseData cachedResponseData7 = cachedResponseData;
                        byteChannel2 = byteChannel;
                        cachedResponseData2 = cachedResponseData7;
                        str = cachedResponseData2.getStatusCode().getDescription() + '\n';
                        fileCacheStorage$writeCache$3.L$0 = byteChannel2;
                        fileCacheStorage$writeCache$3.L$1 = cachedResponseData2;
                        fileCacheStorage$writeCache$3.label = 3;
                        if (ByteWriteChannelKt.writeStringUtf8((ByteWriteChannel) byteChannel2, str, (Continuation<? super Unit>) fileCacheStorage$writeCache$3) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        sb = new StringBuilder().append(cachedResponseData2.getVersion()).append('\n').toString();
                        fileCacheStorage$writeCache$3.L$0 = byteChannel2;
                        fileCacheStorage$writeCache$3.L$1 = cachedResponseData2;
                        fileCacheStorage$writeCache$3.label = 4;
                        if (ByteWriteChannelKt.writeStringUtf8((ByteWriteChannel) byteChannel2, sb, (Continuation<? super Unit>) fileCacheStorage$writeCache$3) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        byteChannel3 = byteChannel2;
                        cachedResponseData3 = cachedResponseData2;
                        flattenEntries = StringValuesKt.flattenEntries(cachedResponseData3.getHeaders());
                        size = flattenEntries.size();
                        fileCacheStorage$writeCache$3.L$0 = byteChannel3;
                        fileCacheStorage$writeCache$3.L$1 = cachedResponseData3;
                        fileCacheStorage$writeCache$3.L$2 = flattenEntries;
                        fileCacheStorage$writeCache$3.label = 5;
                        if (byteChannel3.writeInt(size, fileCacheStorage$writeCache$3) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        it = flattenEntries.iterator();
                        if (it.hasNext()) {
                            Pair<String, String> next = it.next();
                            String component1 = next.component1();
                            String component2 = next.component2();
                            String str6 = component1 + '\n';
                            fileCacheStorage$writeCache$3.L$0 = byteChannel3;
                            fileCacheStorage$writeCache$3.L$1 = cachedResponseData3;
                            fileCacheStorage$writeCache$3.L$2 = it;
                            fileCacheStorage$writeCache$3.L$3 = component2;
                            fileCacheStorage$writeCache$3.label = 6;
                            if (ByteWriteChannelKt.writeStringUtf8((ByteWriteChannel) byteChannel3, str6, (Continuation<? super Unit>) fileCacheStorage$writeCache$3) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            byteChannel4 = byteChannel3;
                            cachedResponseData4 = cachedResponseData3;
                            it2 = it;
                            str2 = component2;
                            str3 = str2 + '\n';
                            fileCacheStorage$writeCache$3.L$0 = byteChannel4;
                            fileCacheStorage$writeCache$3.L$1 = cachedResponseData4;
                            fileCacheStorage$writeCache$3.L$2 = it2;
                            fileCacheStorage$writeCache$3.L$3 = null;
                            fileCacheStorage$writeCache$3.label = 7;
                            if (ByteWriteChannelKt.writeStringUtf8((ByteWriteChannel) byteChannel4, str3, (Continuation<? super Unit>) fileCacheStorage$writeCache$3) != coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            it = it2;
                            cachedResponseData3 = cachedResponseData4;
                            byteChannel3 = byteChannel4;
                            if (it.hasNext()) {
                                long timestamp3 = cachedResponseData3.getRequestTime().getTimestamp();
                                fileCacheStorage$writeCache$3.L$0 = byteChannel3;
                                fileCacheStorage$writeCache$3.L$1 = cachedResponseData3;
                                fileCacheStorage$writeCache$3.L$2 = null;
                                fileCacheStorage$writeCache$3.label = 8;
                                if (byteChannel3.writeLong(timestamp3, fileCacheStorage$writeCache$3) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                cachedResponseData5 = cachedResponseData3;
                                byteChannel5 = byteChannel3;
                                timestamp = cachedResponseData5.getResponseTime().getTimestamp();
                                fileCacheStorage$writeCache$3.L$0 = byteChannel5;
                                fileCacheStorage$writeCache$3.L$1 = cachedResponseData5;
                                fileCacheStorage$writeCache$3.label = 9;
                                if (byteChannel5.writeLong(timestamp, fileCacheStorage$writeCache$3) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                timestamp2 = cachedResponseData5.getExpires().getTimestamp();
                                fileCacheStorage$writeCache$3.L$0 = byteChannel5;
                                fileCacheStorage$writeCache$3.L$1 = cachedResponseData5;
                                fileCacheStorage$writeCache$3.label = 10;
                                if (byteChannel5.writeLong(timestamp2, fileCacheStorage$writeCache$3) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                size2 = cachedResponseData5.getVaryKeys().size();
                                fileCacheStorage$writeCache$3.L$0 = byteChannel5;
                                fileCacheStorage$writeCache$3.L$1 = cachedResponseData5;
                                fileCacheStorage$writeCache$3.label = 11;
                                if (byteChannel5.writeInt(size2, fileCacheStorage$writeCache$3) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                it3 = cachedResponseData5.getVaryKeys().entrySet().iterator();
                                if (it3.hasNext()) {
                                    Map.Entry<String, String> next2 = it3.next();
                                    String key = next2.getKey();
                                    String value2 = next2.getValue();
                                    String str7 = key + '\n';
                                    fileCacheStorage$writeCache$3.L$0 = byteChannel5;
                                    fileCacheStorage$writeCache$3.L$1 = cachedResponseData5;
                                    fileCacheStorage$writeCache$3.L$2 = it3;
                                    fileCacheStorage$writeCache$3.L$3 = value2;
                                    fileCacheStorage$writeCache$3.label = 12;
                                    if (ByteWriteChannelKt.writeStringUtf8((ByteWriteChannel) byteChannel5, str7, (Continuation<? super Unit>) fileCacheStorage$writeCache$3) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    byteChannel6 = byteChannel5;
                                    it4 = it3;
                                    cachedResponseData6 = cachedResponseData5;
                                    str4 = value2;
                                    str5 = str4 + '\n';
                                    fileCacheStorage$writeCache$3.L$0 = byteChannel6;
                                    fileCacheStorage$writeCache$3.L$1 = cachedResponseData6;
                                    fileCacheStorage$writeCache$3.L$2 = it4;
                                    fileCacheStorage$writeCache$3.L$3 = null;
                                    fileCacheStorage$writeCache$3.label = 13;
                                    if (ByteWriteChannelKt.writeStringUtf8((ByteWriteChannel) byteChannel6, str5, (Continuation<? super Unit>) fileCacheStorage$writeCache$3) != coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    it3 = it4;
                                    cachedResponseData5 = cachedResponseData6;
                                    byteChannel5 = byteChannel6;
                                    if (it3.hasNext()) {
                                        int length = cachedResponseData5.getBody().length;
                                        fileCacheStorage$writeCache$3.L$0 = byteChannel5;
                                        fileCacheStorage$writeCache$3.L$1 = cachedResponseData5;
                                        fileCacheStorage$writeCache$3.L$2 = null;
                                        fileCacheStorage$writeCache$3.label = 14;
                                        if (byteChannel5.writeInt(length, fileCacheStorage$writeCache$3) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        body = cachedResponseData5.getBody();
                                        fileCacheStorage$writeCache$3.L$0 = null;
                                        fileCacheStorage$writeCache$3.L$1 = null;
                                        fileCacheStorage$writeCache$3.label = 15;
                                        if (ByteWriteChannelKt.writeFully(byteChannel5, body, fileCacheStorage$writeCache$3) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }
                            }
                        }
                    case 1:
                        cachedResponseData = (CachedResponseData) fileCacheStorage$writeCache$3.L$1;
                        byteChannel = (ByteChannel) fileCacheStorage$writeCache$3.L$0;
                        ResultKt.throwOnFailure(obj);
                        value = cachedResponseData.getStatusCode().getValue();
                        fileCacheStorage$writeCache$3.L$0 = byteChannel;
                        fileCacheStorage$writeCache$3.L$1 = cachedResponseData;
                        fileCacheStorage$writeCache$3.label = 2;
                        if (byteChannel.writeInt(value, fileCacheStorage$writeCache$3) != coroutine_suspended) {
                        }
                        break;
                    case 2:
                        cachedResponseData2 = (CachedResponseData) fileCacheStorage$writeCache$3.L$1;
                        byteChannel2 = (ByteChannel) fileCacheStorage$writeCache$3.L$0;
                        ResultKt.throwOnFailure(obj);
                        str = cachedResponseData2.getStatusCode().getDescription() + '\n';
                        fileCacheStorage$writeCache$3.L$0 = byteChannel2;
                        fileCacheStorage$writeCache$3.L$1 = cachedResponseData2;
                        fileCacheStorage$writeCache$3.label = 3;
                        if (ByteWriteChannelKt.writeStringUtf8((ByteWriteChannel) byteChannel2, str, (Continuation<? super Unit>) fileCacheStorage$writeCache$3) == coroutine_suspended) {
                        }
                        sb = new StringBuilder().append(cachedResponseData2.getVersion()).append('\n').toString();
                        fileCacheStorage$writeCache$3.L$0 = byteChannel2;
                        fileCacheStorage$writeCache$3.L$1 = cachedResponseData2;
                        fileCacheStorage$writeCache$3.label = 4;
                        if (ByteWriteChannelKt.writeStringUtf8((ByteWriteChannel) byteChannel2, sb, (Continuation<? super Unit>) fileCacheStorage$writeCache$3) == coroutine_suspended) {
                        }
                        byteChannel3 = byteChannel2;
                        cachedResponseData3 = cachedResponseData2;
                        flattenEntries = StringValuesKt.flattenEntries(cachedResponseData3.getHeaders());
                        size = flattenEntries.size();
                        fileCacheStorage$writeCache$3.L$0 = byteChannel3;
                        fileCacheStorage$writeCache$3.L$1 = cachedResponseData3;
                        fileCacheStorage$writeCache$3.L$2 = flattenEntries;
                        fileCacheStorage$writeCache$3.label = 5;
                        if (byteChannel3.writeInt(size, fileCacheStorage$writeCache$3) == coroutine_suspended) {
                        }
                        it = flattenEntries.iterator();
                        if (it.hasNext()) {
                        }
                        break;
                    case 3:
                        cachedResponseData2 = (CachedResponseData) fileCacheStorage$writeCache$3.L$1;
                        byteChannel2 = (ByteChannel) fileCacheStorage$writeCache$3.L$0;
                        ResultKt.throwOnFailure(obj);
                        sb = new StringBuilder().append(cachedResponseData2.getVersion()).append('\n').toString();
                        fileCacheStorage$writeCache$3.L$0 = byteChannel2;
                        fileCacheStorage$writeCache$3.L$1 = cachedResponseData2;
                        fileCacheStorage$writeCache$3.label = 4;
                        if (ByteWriteChannelKt.writeStringUtf8((ByteWriteChannel) byteChannel2, sb, (Continuation<? super Unit>) fileCacheStorage$writeCache$3) == coroutine_suspended) {
                        }
                        byteChannel3 = byteChannel2;
                        cachedResponseData3 = cachedResponseData2;
                        flattenEntries = StringValuesKt.flattenEntries(cachedResponseData3.getHeaders());
                        size = flattenEntries.size();
                        fileCacheStorage$writeCache$3.L$0 = byteChannel3;
                        fileCacheStorage$writeCache$3.L$1 = cachedResponseData3;
                        fileCacheStorage$writeCache$3.L$2 = flattenEntries;
                        fileCacheStorage$writeCache$3.label = 5;
                        if (byteChannel3.writeInt(size, fileCacheStorage$writeCache$3) == coroutine_suspended) {
                        }
                        it = flattenEntries.iterator();
                        if (it.hasNext()) {
                        }
                        break;
                    case 4:
                        cachedResponseData2 = (CachedResponseData) fileCacheStorage$writeCache$3.L$1;
                        byteChannel2 = (ByteChannel) fileCacheStorage$writeCache$3.L$0;
                        ResultKt.throwOnFailure(obj);
                        byteChannel3 = byteChannel2;
                        cachedResponseData3 = cachedResponseData2;
                        flattenEntries = StringValuesKt.flattenEntries(cachedResponseData3.getHeaders());
                        size = flattenEntries.size();
                        fileCacheStorage$writeCache$3.L$0 = byteChannel3;
                        fileCacheStorage$writeCache$3.L$1 = cachedResponseData3;
                        fileCacheStorage$writeCache$3.L$2 = flattenEntries;
                        fileCacheStorage$writeCache$3.label = 5;
                        if (byteChannel3.writeInt(size, fileCacheStorage$writeCache$3) == coroutine_suspended) {
                        }
                        it = flattenEntries.iterator();
                        if (it.hasNext()) {
                        }
                        break;
                    case 5:
                        flattenEntries = (List) fileCacheStorage$writeCache$3.L$2;
                        cachedResponseData3 = (CachedResponseData) fileCacheStorage$writeCache$3.L$1;
                        byteChannel3 = (ByteChannel) fileCacheStorage$writeCache$3.L$0;
                        ResultKt.throwOnFailure(obj);
                        it = flattenEntries.iterator();
                        if (it.hasNext()) {
                        }
                        break;
                    case 6:
                        str2 = (String) fileCacheStorage$writeCache$3.L$3;
                        it2 = (Iterator) fileCacheStorage$writeCache$3.L$2;
                        cachedResponseData4 = (CachedResponseData) fileCacheStorage$writeCache$3.L$1;
                        byteChannel4 = (ByteChannel) fileCacheStorage$writeCache$3.L$0;
                        ResultKt.throwOnFailure(obj);
                        str3 = str2 + '\n';
                        fileCacheStorage$writeCache$3.L$0 = byteChannel4;
                        fileCacheStorage$writeCache$3.L$1 = cachedResponseData4;
                        fileCacheStorage$writeCache$3.L$2 = it2;
                        fileCacheStorage$writeCache$3.L$3 = null;
                        fileCacheStorage$writeCache$3.label = 7;
                        if (ByteWriteChannelKt.writeStringUtf8((ByteWriteChannel) byteChannel4, str3, (Continuation<? super Unit>) fileCacheStorage$writeCache$3) != coroutine_suspended) {
                        }
                        break;
                    case 7:
                        it = (Iterator) fileCacheStorage$writeCache$3.L$2;
                        cachedResponseData3 = (CachedResponseData) fileCacheStorage$writeCache$3.L$1;
                        byteChannel3 = (ByteChannel) fileCacheStorage$writeCache$3.L$0;
                        ResultKt.throwOnFailure(obj);
                        if (it.hasNext()) {
                        }
                        break;
                    case 8:
                        cachedResponseData5 = (CachedResponseData) fileCacheStorage$writeCache$3.L$1;
                        byteChannel5 = (ByteChannel) fileCacheStorage$writeCache$3.L$0;
                        ResultKt.throwOnFailure(obj);
                        timestamp = cachedResponseData5.getResponseTime().getTimestamp();
                        fileCacheStorage$writeCache$3.L$0 = byteChannel5;
                        fileCacheStorage$writeCache$3.L$1 = cachedResponseData5;
                        fileCacheStorage$writeCache$3.label = 9;
                        if (byteChannel5.writeLong(timestamp, fileCacheStorage$writeCache$3) == coroutine_suspended) {
                        }
                        timestamp2 = cachedResponseData5.getExpires().getTimestamp();
                        fileCacheStorage$writeCache$3.L$0 = byteChannel5;
                        fileCacheStorage$writeCache$3.L$1 = cachedResponseData5;
                        fileCacheStorage$writeCache$3.label = 10;
                        if (byteChannel5.writeLong(timestamp2, fileCacheStorage$writeCache$3) == coroutine_suspended) {
                        }
                        size2 = cachedResponseData5.getVaryKeys().size();
                        fileCacheStorage$writeCache$3.L$0 = byteChannel5;
                        fileCacheStorage$writeCache$3.L$1 = cachedResponseData5;
                        fileCacheStorage$writeCache$3.label = 11;
                        if (byteChannel5.writeInt(size2, fileCacheStorage$writeCache$3) == coroutine_suspended) {
                        }
                        it3 = cachedResponseData5.getVaryKeys().entrySet().iterator();
                        if (it3.hasNext()) {
                        }
                        break;
                    case 9:
                        cachedResponseData5 = (CachedResponseData) fileCacheStorage$writeCache$3.L$1;
                        byteChannel5 = (ByteChannel) fileCacheStorage$writeCache$3.L$0;
                        ResultKt.throwOnFailure(obj);
                        timestamp2 = cachedResponseData5.getExpires().getTimestamp();
                        fileCacheStorage$writeCache$3.L$0 = byteChannel5;
                        fileCacheStorage$writeCache$3.L$1 = cachedResponseData5;
                        fileCacheStorage$writeCache$3.label = 10;
                        if (byteChannel5.writeLong(timestamp2, fileCacheStorage$writeCache$3) == coroutine_suspended) {
                        }
                        size2 = cachedResponseData5.getVaryKeys().size();
                        fileCacheStorage$writeCache$3.L$0 = byteChannel5;
                        fileCacheStorage$writeCache$3.L$1 = cachedResponseData5;
                        fileCacheStorage$writeCache$3.label = 11;
                        if (byteChannel5.writeInt(size2, fileCacheStorage$writeCache$3) == coroutine_suspended) {
                        }
                        it3 = cachedResponseData5.getVaryKeys().entrySet().iterator();
                        if (it3.hasNext()) {
                        }
                        break;
                    case 10:
                        cachedResponseData5 = (CachedResponseData) fileCacheStorage$writeCache$3.L$1;
                        byteChannel5 = (ByteChannel) fileCacheStorage$writeCache$3.L$0;
                        ResultKt.throwOnFailure(obj);
                        size2 = cachedResponseData5.getVaryKeys().size();
                        fileCacheStorage$writeCache$3.L$0 = byteChannel5;
                        fileCacheStorage$writeCache$3.L$1 = cachedResponseData5;
                        fileCacheStorage$writeCache$3.label = 11;
                        if (byteChannel5.writeInt(size2, fileCacheStorage$writeCache$3) == coroutine_suspended) {
                        }
                        it3 = cachedResponseData5.getVaryKeys().entrySet().iterator();
                        if (it3.hasNext()) {
                        }
                        break;
                    case 11:
                        cachedResponseData5 = (CachedResponseData) fileCacheStorage$writeCache$3.L$1;
                        byteChannel5 = (ByteChannel) fileCacheStorage$writeCache$3.L$0;
                        ResultKt.throwOnFailure(obj);
                        it3 = cachedResponseData5.getVaryKeys().entrySet().iterator();
                        if (it3.hasNext()) {
                        }
                        break;
                    case 12:
                        str4 = (String) fileCacheStorage$writeCache$3.L$3;
                        it4 = (Iterator) fileCacheStorage$writeCache$3.L$2;
                        cachedResponseData6 = (CachedResponseData) fileCacheStorage$writeCache$3.L$1;
                        byteChannel6 = (ByteChannel) fileCacheStorage$writeCache$3.L$0;
                        ResultKt.throwOnFailure(obj);
                        str5 = str4 + '\n';
                        fileCacheStorage$writeCache$3.L$0 = byteChannel6;
                        fileCacheStorage$writeCache$3.L$1 = cachedResponseData6;
                        fileCacheStorage$writeCache$3.L$2 = it4;
                        fileCacheStorage$writeCache$3.L$3 = null;
                        fileCacheStorage$writeCache$3.label = 13;
                        if (ByteWriteChannelKt.writeStringUtf8((ByteWriteChannel) byteChannel6, str5, (Continuation<? super Unit>) fileCacheStorage$writeCache$3) != coroutine_suspended) {
                        }
                        break;
                    case 13:
                        Iterator<Map.Entry<String, String>> it5 = (Iterator) fileCacheStorage$writeCache$3.L$2;
                        CachedResponseData cachedResponseData8 = (CachedResponseData) fileCacheStorage$writeCache$3.L$1;
                        ByteChannel byteChannel7 = (ByteChannel) fileCacheStorage$writeCache$3.L$0;
                        ResultKt.throwOnFailure(obj);
                        it3 = it5;
                        cachedResponseData5 = cachedResponseData8;
                        byteChannel5 = byteChannel7;
                        if (it3.hasNext()) {
                        }
                        break;
                    case 14:
                        cachedResponseData5 = (CachedResponseData) fileCacheStorage$writeCache$3.L$1;
                        byteChannel5 = (ByteChannel) fileCacheStorage$writeCache$3.L$0;
                        ResultKt.throwOnFailure(obj);
                        body = cachedResponseData5.getBody();
                        fileCacheStorage$writeCache$3.L$0 = null;
                        fileCacheStorage$writeCache$3.L$1 = null;
                        fileCacheStorage$writeCache$3.label = 15;
                        if (ByteWriteChannelKt.writeFully(byteChannel5, body, fileCacheStorage$writeCache$3) == coroutine_suspended) {
                        }
                        return Unit.INSTANCE;
                    case 15:
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        fileCacheStorage$writeCache$3 = new FileCacheStorage$writeCache$3(this, continuation);
        Object obj2 = fileCacheStorage$writeCache$3.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (fileCacheStorage$writeCache$3.label) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x048a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x048b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0411 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0412  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x03a3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x037a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x035b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x030f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02bd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x029c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x027e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0262 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0412 -> B:20:0x00da). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x030d -> B:52:0x01ca). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object readCache(ByteReadChannel byteReadChannel, Continuation<? super CachedResponseData> continuation) {
        FileCacheStorage$readCache$3 fileCacheStorage$readCache$3;
        Object readInt;
        ByteReadChannel byteReadChannel2;
        String str;
        int intValue;
        HttpProtocolVersion.Companion companion;
        String str2;
        HttpStatusCode httpStatusCode;
        ByteReadChannel byteReadChannel3;
        HttpProtocolVersion parse;
        int intValue2;
        HeadersBuilder headersBuilder;
        Object obj;
        int i;
        int i2;
        int i3;
        ByteReadChannel byteReadChannel4;
        String str3;
        HttpStatusCode httpStatusCode2;
        HttpProtocolVersion httpProtocolVersion;
        HeadersBuilder headersBuilder2;
        String str4;
        ByteReadChannel byteReadChannel5;
        HttpStatusCode httpStatusCode3;
        HeadersBuilder headersBuilder3;
        String str5;
        HttpProtocolVersion httpProtocolVersion2;
        GMTDate GMTDate;
        Object readLong;
        ByteReadChannel byteReadChannel6;
        HttpStatusCode httpStatusCode4;
        HeadersBuilder headersBuilder4;
        GMTDate gMTDate;
        String str6;
        HttpProtocolVersion httpProtocolVersion3;
        GMTDate gMTDate2;
        GMTDate GMTDate2;
        int intValue3;
        Map createMapBuilder;
        Map map;
        int i4;
        ByteReadChannel byteReadChannel7;
        HttpProtocolVersion httpProtocolVersion4;
        GMTDate gMTDate3;
        Map map2;
        Map map3;
        String str7;
        HeadersBuilder headersBuilder5;
        GMTDate gMTDate4;
        HttpStatusCode httpStatusCode5;
        GMTDate gMTDate5;
        String str8;
        FileCacheStorage$readCache$3 fileCacheStorage$readCache$32;
        Map map4;
        Map map5;
        ByteReadChannel byteReadChannel8;
        int i5;
        GMTDate gMTDate6;
        Object obj2;
        Map map6;
        GMTDate gMTDate7;
        byte[] bArr;
        byte[] bArr2;
        Map map7;
        GMTDate gMTDate8;
        GMTDate gMTDate9;
        GMTDate gMTDate10;
        HttpProtocolVersion httpProtocolVersion5;
        HttpStatusCode httpStatusCode6;
        String str9;
        ByteReadChannel byteReadChannel9 = byteReadChannel;
        if (continuation instanceof FileCacheStorage$readCache$3) {
            fileCacheStorage$readCache$3 = (FileCacheStorage$readCache$3) continuation;
            if ((fileCacheStorage$readCache$3.label & Integer.MIN_VALUE) != 0) {
                fileCacheStorage$readCache$3.label -= Integer.MIN_VALUE;
                Object obj3 = fileCacheStorage$readCache$3.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i6 = 0;
                switch (fileCacheStorage$readCache$3.label) {
                    case 0:
                        ResultKt.throwOnFailure(obj3);
                        fileCacheStorage$readCache$3.L$0 = byteReadChannel9;
                        fileCacheStorage$readCache$3.label = 1;
                        obj3 = ByteReadChannelKt.readUTF8Line(byteReadChannel9, fileCacheStorage$readCache$3);
                        if (obj3 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        Intrinsics.checkNotNull(obj3);
                        String str10 = (String) obj3;
                        fileCacheStorage$readCache$3.L$0 = byteReadChannel9;
                        fileCacheStorage$readCache$3.L$1 = str10;
                        fileCacheStorage$readCache$3.label = 2;
                        readInt = byteReadChannel9.readInt(fileCacheStorage$readCache$3);
                        if (readInt != coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        byteReadChannel2 = byteReadChannel9;
                        str = str10;
                        obj3 = readInt;
                        intValue = ((Number) obj3).intValue();
                        fileCacheStorage$readCache$3.L$0 = byteReadChannel2;
                        fileCacheStorage$readCache$3.L$1 = str;
                        fileCacheStorage$readCache$3.I$0 = intValue;
                        fileCacheStorage$readCache$3.label = 3;
                        obj3 = ByteReadChannelKt.readUTF8Line(byteReadChannel2, fileCacheStorage$readCache$3);
                        if (obj3 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        Intrinsics.checkNotNull(obj3);
                        HttpStatusCode httpStatusCode7 = new HttpStatusCode(intValue, (String) obj3);
                        companion = HttpProtocolVersion.INSTANCE;
                        fileCacheStorage$readCache$3.L$0 = byteReadChannel2;
                        fileCacheStorage$readCache$3.L$1 = str;
                        fileCacheStorage$readCache$3.L$2 = httpStatusCode7;
                        fileCacheStorage$readCache$3.L$3 = companion;
                        fileCacheStorage$readCache$3.label = 4;
                        obj3 = ByteReadChannelKt.readUTF8Line(byteReadChannel2, fileCacheStorage$readCache$3);
                        if (obj3 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        ByteReadChannel byteReadChannel10 = byteReadChannel2;
                        str2 = str;
                        httpStatusCode = httpStatusCode7;
                        byteReadChannel3 = byteReadChannel10;
                        Intrinsics.checkNotNull(obj3);
                        parse = companion.parse((CharSequence) obj3);
                        fileCacheStorage$readCache$3.L$0 = byteReadChannel3;
                        fileCacheStorage$readCache$3.L$1 = str2;
                        fileCacheStorage$readCache$3.L$2 = httpStatusCode;
                        fileCacheStorage$readCache$3.L$3 = parse;
                        fileCacheStorage$readCache$3.label = 5;
                        obj3 = byteReadChannel3.readInt(fileCacheStorage$readCache$3);
                        if (obj3 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        intValue2 = ((Number) obj3).intValue();
                        obj = null;
                        headersBuilder = new HeadersBuilder(0, 1, null);
                        i = 0;
                        if (i >= intValue2) {
                            fileCacheStorage$readCache$3.L$0 = byteReadChannel3;
                            fileCacheStorage$readCache$3.L$1 = str2;
                            fileCacheStorage$readCache$3.L$2 = httpStatusCode;
                            fileCacheStorage$readCache$3.L$3 = parse;
                            fileCacheStorage$readCache$3.L$4 = headersBuilder;
                            fileCacheStorage$readCache$3.L$5 = obj;
                            fileCacheStorage$readCache$3.I$0 = intValue2;
                            fileCacheStorage$readCache$3.I$1 = i;
                            fileCacheStorage$readCache$3.label = 6;
                            Object readUTF8Line = ByteReadChannelKt.readUTF8Line(byteReadChannel3, fileCacheStorage$readCache$3);
                            if (readUTF8Line == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            byteReadChannel4 = byteReadChannel3;
                            headersBuilder2 = headersBuilder;
                            httpProtocolVersion = parse;
                            i2 = i;
                            httpStatusCode2 = httpStatusCode;
                            i3 = intValue2;
                            obj3 = readUTF8Line;
                            str3 = str2;
                            Intrinsics.checkNotNull(obj3);
                            str4 = (String) obj3;
                            fileCacheStorage$readCache$3.L$0 = byteReadChannel4;
                            fileCacheStorage$readCache$3.L$1 = str3;
                            fileCacheStorage$readCache$3.L$2 = httpStatusCode2;
                            fileCacheStorage$readCache$3.L$3 = httpProtocolVersion;
                            fileCacheStorage$readCache$3.L$4 = headersBuilder2;
                            fileCacheStorage$readCache$3.L$5 = str4;
                            fileCacheStorage$readCache$3.I$0 = i3;
                            fileCacheStorage$readCache$3.I$1 = i2;
                            fileCacheStorage$readCache$3.label = 7;
                            obj3 = ByteReadChannelKt.readUTF8Line(byteReadChannel4, fileCacheStorage$readCache$3);
                            if (obj3 == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            ByteReadChannel byteReadChannel11 = byteReadChannel4;
                            HeadersBuilder headersBuilder6 = headersBuilder2;
                            byteReadChannel3 = byteReadChannel11;
                            Intrinsics.checkNotNull(obj3);
                            headersBuilder6.append(str4, (String) obj3);
                            intValue2 = i3;
                            httpStatusCode = httpStatusCode2;
                            str2 = str3;
                            obj = null;
                            i = i2 + 1;
                            parse = httpProtocolVersion;
                            headersBuilder = headersBuilder6;
                            if (i >= intValue2) {
                                fileCacheStorage$readCache$3.L$0 = byteReadChannel3;
                                fileCacheStorage$readCache$3.L$1 = str2;
                                fileCacheStorage$readCache$3.L$2 = httpStatusCode;
                                fileCacheStorage$readCache$3.L$3 = parse;
                                fileCacheStorage$readCache$3.L$4 = headersBuilder;
                                fileCacheStorage$readCache$3.L$5 = null;
                                fileCacheStorage$readCache$3.label = 8;
                                obj3 = byteReadChannel3.readLong(fileCacheStorage$readCache$3);
                                if (obj3 == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                byteReadChannel5 = byteReadChannel3;
                                httpStatusCode3 = httpStatusCode;
                                headersBuilder3 = headersBuilder;
                                str5 = str2;
                                httpProtocolVersion2 = parse;
                                GMTDate = DateJvmKt.GMTDate((Long) obj3);
                                fileCacheStorage$readCache$3.L$0 = byteReadChannel5;
                                fileCacheStorage$readCache$3.L$1 = str5;
                                fileCacheStorage$readCache$3.L$2 = httpStatusCode3;
                                fileCacheStorage$readCache$3.L$3 = httpProtocolVersion2;
                                fileCacheStorage$readCache$3.L$4 = headersBuilder3;
                                fileCacheStorage$readCache$3.L$5 = GMTDate;
                                fileCacheStorage$readCache$3.label = 9;
                                obj3 = byteReadChannel5.readLong(fileCacheStorage$readCache$3);
                                if (obj3 == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                GMTDate GMTDate3 = DateJvmKt.GMTDate((Long) obj3);
                                fileCacheStorage$readCache$3.L$0 = byteReadChannel5;
                                fileCacheStorage$readCache$3.L$1 = str5;
                                fileCacheStorage$readCache$3.L$2 = httpStatusCode3;
                                fileCacheStorage$readCache$3.L$3 = httpProtocolVersion2;
                                fileCacheStorage$readCache$3.L$4 = headersBuilder3;
                                fileCacheStorage$readCache$3.L$5 = GMTDate;
                                fileCacheStorage$readCache$3.L$6 = GMTDate3;
                                fileCacheStorage$readCache$3.label = 10;
                                readLong = byteReadChannel5.readLong(fileCacheStorage$readCache$3);
                                if (readLong == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                byteReadChannel6 = byteReadChannel5;
                                httpStatusCode4 = httpStatusCode3;
                                headersBuilder4 = headersBuilder3;
                                gMTDate = GMTDate3;
                                obj3 = readLong;
                                str6 = str5;
                                httpProtocolVersion3 = httpProtocolVersion2;
                                gMTDate2 = GMTDate;
                                GMTDate2 = DateJvmKt.GMTDate((Long) obj3);
                                fileCacheStorage$readCache$3.L$0 = byteReadChannel6;
                                fileCacheStorage$readCache$3.L$1 = str6;
                                fileCacheStorage$readCache$3.L$2 = httpStatusCode4;
                                fileCacheStorage$readCache$3.L$3 = httpProtocolVersion3;
                                fileCacheStorage$readCache$3.L$4 = headersBuilder4;
                                fileCacheStorage$readCache$3.L$5 = gMTDate2;
                                fileCacheStorage$readCache$3.L$6 = gMTDate;
                                fileCacheStorage$readCache$3.L$7 = GMTDate2;
                                fileCacheStorage$readCache$3.label = 11;
                                obj3 = byteReadChannel6.readInt(fileCacheStorage$readCache$3);
                                if (obj3 == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                intValue3 = ((Number) obj3).intValue();
                                createMapBuilder = MapsKt.createMapBuilder();
                                map = createMapBuilder;
                                if (i6 < intValue3) {
                                    fileCacheStorage$readCache$3.L$0 = byteReadChannel6;
                                    fileCacheStorage$readCache$3.L$1 = str6;
                                    fileCacheStorage$readCache$3.L$2 = httpStatusCode4;
                                    fileCacheStorage$readCache$3.L$3 = httpProtocolVersion3;
                                    fileCacheStorage$readCache$3.L$4 = headersBuilder4;
                                    fileCacheStorage$readCache$3.L$5 = gMTDate2;
                                    fileCacheStorage$readCache$3.L$6 = gMTDate;
                                    fileCacheStorage$readCache$3.L$7 = GMTDate2;
                                    fileCacheStorage$readCache$3.L$8 = createMapBuilder;
                                    fileCacheStorage$readCache$3.L$9 = map;
                                    fileCacheStorage$readCache$3.L$10 = null;
                                    fileCacheStorage$readCache$3.I$0 = intValue3;
                                    fileCacheStorage$readCache$3.I$1 = i6;
                                    fileCacheStorage$readCache$3.label = 12;
                                    Object readUTF8Line2 = ByteReadChannelKt.readUTF8Line(byteReadChannel6, fileCacheStorage$readCache$3);
                                    if (readUTF8Line2 == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    String str11 = str6;
                                    gMTDate4 = GMTDate2;
                                    byteReadChannel7 = byteReadChannel6;
                                    gMTDate3 = gMTDate;
                                    i4 = intValue3;
                                    obj3 = readUTF8Line2;
                                    httpProtocolVersion4 = httpProtocolVersion3;
                                    map2 = map;
                                    headersBuilder5 = headersBuilder4;
                                    httpStatusCode5 = httpStatusCode4;
                                    map3 = createMapBuilder;
                                    gMTDate5 = gMTDate2;
                                    str7 = str11;
                                    Intrinsics.checkNotNull(obj3);
                                    String str12 = (String) obj3;
                                    fileCacheStorage$readCache$3.L$0 = byteReadChannel7;
                                    fileCacheStorage$readCache$3.L$1 = str7;
                                    fileCacheStorage$readCache$3.L$2 = httpStatusCode5;
                                    fileCacheStorage$readCache$3.L$3 = httpProtocolVersion4;
                                    fileCacheStorage$readCache$3.L$4 = headersBuilder5;
                                    fileCacheStorage$readCache$3.L$5 = gMTDate5;
                                    fileCacheStorage$readCache$3.L$6 = gMTDate3;
                                    fileCacheStorage$readCache$3.L$7 = gMTDate4;
                                    fileCacheStorage$readCache$3.L$8 = map3;
                                    fileCacheStorage$readCache$3.L$9 = map2;
                                    fileCacheStorage$readCache$3.L$10 = str12;
                                    fileCacheStorage$readCache$3.I$0 = i4;
                                    fileCacheStorage$readCache$3.I$1 = i6;
                                    fileCacheStorage$readCache$3.label = 13;
                                    obj3 = ByteReadChannelKt.readUTF8Line(byteReadChannel7, fileCacheStorage$readCache$3);
                                    if (obj3 != coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    int i7 = i6;
                                    str8 = str12;
                                    fileCacheStorage$readCache$32 = fileCacheStorage$readCache$3;
                                    map4 = map2;
                                    httpProtocolVersion3 = httpProtocolVersion4;
                                    map5 = map3;
                                    httpStatusCode4 = httpStatusCode5;
                                    headersBuilder4 = headersBuilder5;
                                    byteReadChannel8 = byteReadChannel7;
                                    i5 = i7;
                                    GMTDate gMTDate11 = gMTDate5;
                                    String str13 = str7;
                                    gMTDate2 = gMTDate11;
                                    Intrinsics.checkNotNull(obj3);
                                    map4.put(str8, (String) obj3);
                                    i6 = i5 + 1;
                                    intValue3 = i4;
                                    GMTDate2 = gMTDate4;
                                    gMTDate = gMTDate3;
                                    str6 = str13;
                                    byteReadChannel6 = byteReadChannel8;
                                    createMapBuilder = map5;
                                    map = map4;
                                    fileCacheStorage$readCache$3 = fileCacheStorage$readCache$32;
                                    if (i6 < intValue3) {
                                        Map build = MapsKt.build(createMapBuilder);
                                        fileCacheStorage$readCache$3.L$0 = byteReadChannel6;
                                        fileCacheStorage$readCache$3.L$1 = str6;
                                        fileCacheStorage$readCache$3.L$2 = httpStatusCode4;
                                        fileCacheStorage$readCache$3.L$3 = httpProtocolVersion3;
                                        fileCacheStorage$readCache$3.L$4 = headersBuilder4;
                                        fileCacheStorage$readCache$3.L$5 = gMTDate2;
                                        fileCacheStorage$readCache$3.L$6 = gMTDate;
                                        fileCacheStorage$readCache$3.L$7 = GMTDate2;
                                        fileCacheStorage$readCache$3.L$8 = build;
                                        fileCacheStorage$readCache$3.L$9 = null;
                                        fileCacheStorage$readCache$3.L$10 = null;
                                        fileCacheStorage$readCache$3.label = 14;
                                        Object readInt2 = byteReadChannel6.readInt(fileCacheStorage$readCache$3);
                                        if (readInt2 == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        GMTDate gMTDate12 = gMTDate;
                                        gMTDate6 = GMTDate2;
                                        obj2 = coroutine_suspended;
                                        map6 = build;
                                        obj3 = readInt2;
                                        gMTDate7 = gMTDate12;
                                        bArr = new byte[((Number) obj3).intValue()];
                                        fileCacheStorage$readCache$3.L$0 = str6;
                                        fileCacheStorage$readCache$3.L$1 = httpStatusCode4;
                                        fileCacheStorage$readCache$3.L$2 = httpProtocolVersion3;
                                        fileCacheStorage$readCache$3.L$3 = headersBuilder4;
                                        fileCacheStorage$readCache$3.L$4 = gMTDate2;
                                        fileCacheStorage$readCache$3.L$5 = gMTDate7;
                                        fileCacheStorage$readCache$3.L$6 = gMTDate6;
                                        fileCacheStorage$readCache$3.L$7 = map6;
                                        fileCacheStorage$readCache$3.L$8 = bArr;
                                        fileCacheStorage$readCache$3.label = 15;
                                        if (ByteReadChannelKt.readFully(byteReadChannel6, bArr, fileCacheStorage$readCache$3) != obj2) {
                                            return obj2;
                                        }
                                        bArr2 = bArr;
                                        map7 = map6;
                                        gMTDate8 = gMTDate6;
                                        gMTDate9 = gMTDate7;
                                        gMTDate10 = gMTDate2;
                                        httpProtocolVersion5 = httpProtocolVersion3;
                                        httpStatusCode6 = httpStatusCode4;
                                        str9 = str6;
                                        return new CachedResponseData(URLUtilsKt.Url(str9), httpStatusCode6, gMTDate10, gMTDate9, httpProtocolVersion5, gMTDate8, headersBuilder4.build(), map7, bArr2);
                                    }
                                }
                            }
                        }
                    case 1:
                        byteReadChannel9 = (ByteReadChannel) fileCacheStorage$readCache$3.L$0;
                        ResultKt.throwOnFailure(obj3);
                        Intrinsics.checkNotNull(obj3);
                        String str102 = (String) obj3;
                        fileCacheStorage$readCache$3.L$0 = byteReadChannel9;
                        fileCacheStorage$readCache$3.L$1 = str102;
                        fileCacheStorage$readCache$3.label = 2;
                        readInt = byteReadChannel9.readInt(fileCacheStorage$readCache$3);
                        if (readInt != coroutine_suspended) {
                        }
                        break;
                    case 2:
                        String str14 = (String) fileCacheStorage$readCache$3.L$1;
                        ByteReadChannel byteReadChannel12 = (ByteReadChannel) fileCacheStorage$readCache$3.L$0;
                        ResultKt.throwOnFailure(obj3);
                        byteReadChannel2 = byteReadChannel12;
                        str = str14;
                        intValue = ((Number) obj3).intValue();
                        fileCacheStorage$readCache$3.L$0 = byteReadChannel2;
                        fileCacheStorage$readCache$3.L$1 = str;
                        fileCacheStorage$readCache$3.I$0 = intValue;
                        fileCacheStorage$readCache$3.label = 3;
                        obj3 = ByteReadChannelKt.readUTF8Line(byteReadChannel2, fileCacheStorage$readCache$3);
                        if (obj3 == coroutine_suspended) {
                        }
                        Intrinsics.checkNotNull(obj3);
                        HttpStatusCode httpStatusCode72 = new HttpStatusCode(intValue, (String) obj3);
                        companion = HttpProtocolVersion.INSTANCE;
                        fileCacheStorage$readCache$3.L$0 = byteReadChannel2;
                        fileCacheStorage$readCache$3.L$1 = str;
                        fileCacheStorage$readCache$3.L$2 = httpStatusCode72;
                        fileCacheStorage$readCache$3.L$3 = companion;
                        fileCacheStorage$readCache$3.label = 4;
                        obj3 = ByteReadChannelKt.readUTF8Line(byteReadChannel2, fileCacheStorage$readCache$3);
                        if (obj3 == coroutine_suspended) {
                        }
                        break;
                    case 3:
                        intValue = fileCacheStorage$readCache$3.I$0;
                        str = (String) fileCacheStorage$readCache$3.L$1;
                        byteReadChannel2 = (ByteReadChannel) fileCacheStorage$readCache$3.L$0;
                        ResultKt.throwOnFailure(obj3);
                        Intrinsics.checkNotNull(obj3);
                        HttpStatusCode httpStatusCode722 = new HttpStatusCode(intValue, (String) obj3);
                        companion = HttpProtocolVersion.INSTANCE;
                        fileCacheStorage$readCache$3.L$0 = byteReadChannel2;
                        fileCacheStorage$readCache$3.L$1 = str;
                        fileCacheStorage$readCache$3.L$2 = httpStatusCode722;
                        fileCacheStorage$readCache$3.L$3 = companion;
                        fileCacheStorage$readCache$3.label = 4;
                        obj3 = ByteReadChannelKt.readUTF8Line(byteReadChannel2, fileCacheStorage$readCache$3);
                        if (obj3 == coroutine_suspended) {
                        }
                        break;
                    case 4:
                        companion = (HttpProtocolVersion.Companion) fileCacheStorage$readCache$3.L$3;
                        httpStatusCode = (HttpStatusCode) fileCacheStorage$readCache$3.L$2;
                        str2 = (String) fileCacheStorage$readCache$3.L$1;
                        byteReadChannel3 = (ByteReadChannel) fileCacheStorage$readCache$3.L$0;
                        ResultKt.throwOnFailure(obj3);
                        Intrinsics.checkNotNull(obj3);
                        parse = companion.parse((CharSequence) obj3);
                        fileCacheStorage$readCache$3.L$0 = byteReadChannel3;
                        fileCacheStorage$readCache$3.L$1 = str2;
                        fileCacheStorage$readCache$3.L$2 = httpStatusCode;
                        fileCacheStorage$readCache$3.L$3 = parse;
                        fileCacheStorage$readCache$3.label = 5;
                        obj3 = byteReadChannel3.readInt(fileCacheStorage$readCache$3);
                        if (obj3 == coroutine_suspended) {
                        }
                        intValue2 = ((Number) obj3).intValue();
                        obj = null;
                        headersBuilder = new HeadersBuilder(0, 1, null);
                        i = 0;
                        if (i >= intValue2) {
                        }
                        break;
                    case 5:
                        parse = (HttpProtocolVersion) fileCacheStorage$readCache$3.L$3;
                        httpStatusCode = (HttpStatusCode) fileCacheStorage$readCache$3.L$2;
                        str2 = (String) fileCacheStorage$readCache$3.L$1;
                        byteReadChannel3 = (ByteReadChannel) fileCacheStorage$readCache$3.L$0;
                        ResultKt.throwOnFailure(obj3);
                        intValue2 = ((Number) obj3).intValue();
                        obj = null;
                        headersBuilder = new HeadersBuilder(0, 1, null);
                        i = 0;
                        if (i >= intValue2) {
                        }
                        break;
                    case 6:
                        i2 = fileCacheStorage$readCache$3.I$1;
                        i3 = fileCacheStorage$readCache$3.I$0;
                        HeadersBuilder headersBuilder7 = (HeadersBuilder) fileCacheStorage$readCache$3.L$4;
                        HttpProtocolVersion httpProtocolVersion6 = (HttpProtocolVersion) fileCacheStorage$readCache$3.L$3;
                        HttpStatusCode httpStatusCode8 = (HttpStatusCode) fileCacheStorage$readCache$3.L$2;
                        String str15 = (String) fileCacheStorage$readCache$3.L$1;
                        ByteReadChannel byteReadChannel13 = (ByteReadChannel) fileCacheStorage$readCache$3.L$0;
                        ResultKt.throwOnFailure(obj3);
                        byteReadChannel4 = byteReadChannel13;
                        str3 = str15;
                        httpStatusCode2 = httpStatusCode8;
                        httpProtocolVersion = httpProtocolVersion6;
                        headersBuilder2 = headersBuilder7;
                        Intrinsics.checkNotNull(obj3);
                        str4 = (String) obj3;
                        fileCacheStorage$readCache$3.L$0 = byteReadChannel4;
                        fileCacheStorage$readCache$3.L$1 = str3;
                        fileCacheStorage$readCache$3.L$2 = httpStatusCode2;
                        fileCacheStorage$readCache$3.L$3 = httpProtocolVersion;
                        fileCacheStorage$readCache$3.L$4 = headersBuilder2;
                        fileCacheStorage$readCache$3.L$5 = str4;
                        fileCacheStorage$readCache$3.I$0 = i3;
                        fileCacheStorage$readCache$3.I$1 = i2;
                        fileCacheStorage$readCache$3.label = 7;
                        obj3 = ByteReadChannelKt.readUTF8Line(byteReadChannel4, fileCacheStorage$readCache$3);
                        if (obj3 == coroutine_suspended) {
                        }
                        ByteReadChannel byteReadChannel112 = byteReadChannel4;
                        HeadersBuilder headersBuilder62 = headersBuilder2;
                        byteReadChannel3 = byteReadChannel112;
                        Intrinsics.checkNotNull(obj3);
                        headersBuilder62.append(str4, (String) obj3);
                        intValue2 = i3;
                        httpStatusCode = httpStatusCode2;
                        str2 = str3;
                        obj = null;
                        i = i2 + 1;
                        parse = httpProtocolVersion;
                        headersBuilder = headersBuilder62;
                        if (i >= intValue2) {
                        }
                        break;
                    case 7:
                        i2 = fileCacheStorage$readCache$3.I$1;
                        i3 = fileCacheStorage$readCache$3.I$0;
                        str4 = (String) fileCacheStorage$readCache$3.L$5;
                        headersBuilder2 = (HeadersBuilder) fileCacheStorage$readCache$3.L$4;
                        httpProtocolVersion = (HttpProtocolVersion) fileCacheStorage$readCache$3.L$3;
                        httpStatusCode2 = (HttpStatusCode) fileCacheStorage$readCache$3.L$2;
                        str3 = (String) fileCacheStorage$readCache$3.L$1;
                        byteReadChannel4 = (ByteReadChannel) fileCacheStorage$readCache$3.L$0;
                        ResultKt.throwOnFailure(obj3);
                        ByteReadChannel byteReadChannel1122 = byteReadChannel4;
                        HeadersBuilder headersBuilder622 = headersBuilder2;
                        byteReadChannel3 = byteReadChannel1122;
                        Intrinsics.checkNotNull(obj3);
                        headersBuilder622.append(str4, (String) obj3);
                        intValue2 = i3;
                        httpStatusCode = httpStatusCode2;
                        str2 = str3;
                        obj = null;
                        i = i2 + 1;
                        parse = httpProtocolVersion;
                        headersBuilder = headersBuilder622;
                        if (i >= intValue2) {
                        }
                        break;
                    case 8:
                        HeadersBuilder headersBuilder8 = (HeadersBuilder) fileCacheStorage$readCache$3.L$4;
                        HttpProtocolVersion httpProtocolVersion7 = (HttpProtocolVersion) fileCacheStorage$readCache$3.L$3;
                        HttpStatusCode httpStatusCode9 = (HttpStatusCode) fileCacheStorage$readCache$3.L$2;
                        String str16 = (String) fileCacheStorage$readCache$3.L$1;
                        ByteReadChannel byteReadChannel14 = (ByteReadChannel) fileCacheStorage$readCache$3.L$0;
                        ResultKt.throwOnFailure(obj3);
                        byteReadChannel5 = byteReadChannel14;
                        str5 = str16;
                        httpStatusCode3 = httpStatusCode9;
                        httpProtocolVersion2 = httpProtocolVersion7;
                        headersBuilder3 = headersBuilder8;
                        GMTDate = DateJvmKt.GMTDate((Long) obj3);
                        fileCacheStorage$readCache$3.L$0 = byteReadChannel5;
                        fileCacheStorage$readCache$3.L$1 = str5;
                        fileCacheStorage$readCache$3.L$2 = httpStatusCode3;
                        fileCacheStorage$readCache$3.L$3 = httpProtocolVersion2;
                        fileCacheStorage$readCache$3.L$4 = headersBuilder3;
                        fileCacheStorage$readCache$3.L$5 = GMTDate;
                        fileCacheStorage$readCache$3.label = 9;
                        obj3 = byteReadChannel5.readLong(fileCacheStorage$readCache$3);
                        if (obj3 == coroutine_suspended) {
                        }
                        GMTDate GMTDate32 = DateJvmKt.GMTDate((Long) obj3);
                        fileCacheStorage$readCache$3.L$0 = byteReadChannel5;
                        fileCacheStorage$readCache$3.L$1 = str5;
                        fileCacheStorage$readCache$3.L$2 = httpStatusCode3;
                        fileCacheStorage$readCache$3.L$3 = httpProtocolVersion2;
                        fileCacheStorage$readCache$3.L$4 = headersBuilder3;
                        fileCacheStorage$readCache$3.L$5 = GMTDate;
                        fileCacheStorage$readCache$3.L$6 = GMTDate32;
                        fileCacheStorage$readCache$3.label = 10;
                        readLong = byteReadChannel5.readLong(fileCacheStorage$readCache$3);
                        if (readLong == coroutine_suspended) {
                        }
                        break;
                    case 9:
                        GMTDate = (GMTDate) fileCacheStorage$readCache$3.L$5;
                        headersBuilder3 = (HeadersBuilder) fileCacheStorage$readCache$3.L$4;
                        httpProtocolVersion2 = (HttpProtocolVersion) fileCacheStorage$readCache$3.L$3;
                        httpStatusCode3 = (HttpStatusCode) fileCacheStorage$readCache$3.L$2;
                        str5 = (String) fileCacheStorage$readCache$3.L$1;
                        byteReadChannel5 = (ByteReadChannel) fileCacheStorage$readCache$3.L$0;
                        ResultKt.throwOnFailure(obj3);
                        GMTDate GMTDate322 = DateJvmKt.GMTDate((Long) obj3);
                        fileCacheStorage$readCache$3.L$0 = byteReadChannel5;
                        fileCacheStorage$readCache$3.L$1 = str5;
                        fileCacheStorage$readCache$3.L$2 = httpStatusCode3;
                        fileCacheStorage$readCache$3.L$3 = httpProtocolVersion2;
                        fileCacheStorage$readCache$3.L$4 = headersBuilder3;
                        fileCacheStorage$readCache$3.L$5 = GMTDate;
                        fileCacheStorage$readCache$3.L$6 = GMTDate322;
                        fileCacheStorage$readCache$3.label = 10;
                        readLong = byteReadChannel5.readLong(fileCacheStorage$readCache$3);
                        if (readLong == coroutine_suspended) {
                        }
                        break;
                    case 10:
                        GMTDate gMTDate13 = (GMTDate) fileCacheStorage$readCache$3.L$6;
                        GMTDate gMTDate14 = (GMTDate) fileCacheStorage$readCache$3.L$5;
                        HeadersBuilder headersBuilder9 = (HeadersBuilder) fileCacheStorage$readCache$3.L$4;
                        HttpProtocolVersion httpProtocolVersion8 = (HttpProtocolVersion) fileCacheStorage$readCache$3.L$3;
                        HttpStatusCode httpStatusCode10 = (HttpStatusCode) fileCacheStorage$readCache$3.L$2;
                        String str17 = (String) fileCacheStorage$readCache$3.L$1;
                        ByteReadChannel byteReadChannel15 = (ByteReadChannel) fileCacheStorage$readCache$3.L$0;
                        ResultKt.throwOnFailure(obj3);
                        byteReadChannel6 = byteReadChannel15;
                        str6 = str17;
                        httpStatusCode4 = httpStatusCode10;
                        httpProtocolVersion3 = httpProtocolVersion8;
                        headersBuilder4 = headersBuilder9;
                        gMTDate2 = gMTDate14;
                        gMTDate = gMTDate13;
                        GMTDate2 = DateJvmKt.GMTDate((Long) obj3);
                        fileCacheStorage$readCache$3.L$0 = byteReadChannel6;
                        fileCacheStorage$readCache$3.L$1 = str6;
                        fileCacheStorage$readCache$3.L$2 = httpStatusCode4;
                        fileCacheStorage$readCache$3.L$3 = httpProtocolVersion3;
                        fileCacheStorage$readCache$3.L$4 = headersBuilder4;
                        fileCacheStorage$readCache$3.L$5 = gMTDate2;
                        fileCacheStorage$readCache$3.L$6 = gMTDate;
                        fileCacheStorage$readCache$3.L$7 = GMTDate2;
                        fileCacheStorage$readCache$3.label = 11;
                        obj3 = byteReadChannel6.readInt(fileCacheStorage$readCache$3);
                        if (obj3 == coroutine_suspended) {
                        }
                        intValue3 = ((Number) obj3).intValue();
                        createMapBuilder = MapsKt.createMapBuilder();
                        map = createMapBuilder;
                        if (i6 < intValue3) {
                        }
                        break;
                    case 11:
                        GMTDate2 = (GMTDate) fileCacheStorage$readCache$3.L$7;
                        gMTDate = (GMTDate) fileCacheStorage$readCache$3.L$6;
                        gMTDate2 = (GMTDate) fileCacheStorage$readCache$3.L$5;
                        headersBuilder4 = (HeadersBuilder) fileCacheStorage$readCache$3.L$4;
                        httpProtocolVersion3 = (HttpProtocolVersion) fileCacheStorage$readCache$3.L$3;
                        httpStatusCode4 = (HttpStatusCode) fileCacheStorage$readCache$3.L$2;
                        str6 = (String) fileCacheStorage$readCache$3.L$1;
                        byteReadChannel6 = (ByteReadChannel) fileCacheStorage$readCache$3.L$0;
                        ResultKt.throwOnFailure(obj3);
                        intValue3 = ((Number) obj3).intValue();
                        createMapBuilder = MapsKt.createMapBuilder();
                        map = createMapBuilder;
                        if (i6 < intValue3) {
                        }
                        break;
                    case 12:
                        int i8 = fileCacheStorage$readCache$3.I$1;
                        i4 = fileCacheStorage$readCache$3.I$0;
                        Map map8 = (Map) fileCacheStorage$readCache$3.L$9;
                        Map map9 = (Map) fileCacheStorage$readCache$3.L$8;
                        GMTDate gMTDate15 = (GMTDate) fileCacheStorage$readCache$3.L$7;
                        GMTDate gMTDate16 = (GMTDate) fileCacheStorage$readCache$3.L$6;
                        GMTDate gMTDate17 = (GMTDate) fileCacheStorage$readCache$3.L$5;
                        HeadersBuilder headersBuilder10 = (HeadersBuilder) fileCacheStorage$readCache$3.L$4;
                        HttpProtocolVersion httpProtocolVersion9 = (HttpProtocolVersion) fileCacheStorage$readCache$3.L$3;
                        HttpStatusCode httpStatusCode11 = (HttpStatusCode) fileCacheStorage$readCache$3.L$2;
                        String str18 = (String) fileCacheStorage$readCache$3.L$1;
                        ByteReadChannel byteReadChannel16 = (ByteReadChannel) fileCacheStorage$readCache$3.L$0;
                        ResultKt.throwOnFailure(obj3);
                        i6 = i8;
                        byteReadChannel7 = byteReadChannel16;
                        httpProtocolVersion4 = httpProtocolVersion9;
                        gMTDate3 = gMTDate16;
                        map2 = map8;
                        map3 = map9;
                        str7 = str18;
                        headersBuilder5 = headersBuilder10;
                        gMTDate4 = gMTDate15;
                        httpStatusCode5 = httpStatusCode11;
                        gMTDate5 = gMTDate17;
                        Intrinsics.checkNotNull(obj3);
                        String str122 = (String) obj3;
                        fileCacheStorage$readCache$3.L$0 = byteReadChannel7;
                        fileCacheStorage$readCache$3.L$1 = str7;
                        fileCacheStorage$readCache$3.L$2 = httpStatusCode5;
                        fileCacheStorage$readCache$3.L$3 = httpProtocolVersion4;
                        fileCacheStorage$readCache$3.L$4 = headersBuilder5;
                        fileCacheStorage$readCache$3.L$5 = gMTDate5;
                        fileCacheStorage$readCache$3.L$6 = gMTDate3;
                        fileCacheStorage$readCache$3.L$7 = gMTDate4;
                        fileCacheStorage$readCache$3.L$8 = map3;
                        fileCacheStorage$readCache$3.L$9 = map2;
                        fileCacheStorage$readCache$3.L$10 = str122;
                        fileCacheStorage$readCache$3.I$0 = i4;
                        fileCacheStorage$readCache$3.I$1 = i6;
                        fileCacheStorage$readCache$3.label = 13;
                        obj3 = ByteReadChannelKt.readUTF8Line(byteReadChannel7, fileCacheStorage$readCache$3);
                        if (obj3 != coroutine_suspended) {
                        }
                        break;
                    case 13:
                        int i9 = fileCacheStorage$readCache$3.I$1;
                        i4 = fileCacheStorage$readCache$3.I$0;
                        str8 = (String) fileCacheStorage$readCache$3.L$10;
                        Map map10 = (Map) fileCacheStorage$readCache$3.L$9;
                        Map map11 = (Map) fileCacheStorage$readCache$3.L$8;
                        gMTDate4 = (GMTDate) fileCacheStorage$readCache$3.L$7;
                        gMTDate3 = (GMTDate) fileCacheStorage$readCache$3.L$6;
                        gMTDate5 = (GMTDate) fileCacheStorage$readCache$3.L$5;
                        HeadersBuilder headersBuilder11 = (HeadersBuilder) fileCacheStorage$readCache$3.L$4;
                        HttpProtocolVersion httpProtocolVersion10 = (HttpProtocolVersion) fileCacheStorage$readCache$3.L$3;
                        HttpStatusCode httpStatusCode12 = (HttpStatusCode) fileCacheStorage$readCache$3.L$2;
                        str7 = (String) fileCacheStorage$readCache$3.L$1;
                        ByteReadChannel byteReadChannel17 = (ByteReadChannel) fileCacheStorage$readCache$3.L$0;
                        ResultKt.throwOnFailure(obj3);
                        i5 = i9;
                        fileCacheStorage$readCache$32 = fileCacheStorage$readCache$3;
                        map4 = map10;
                        httpProtocolVersion3 = httpProtocolVersion10;
                        map5 = map11;
                        httpStatusCode4 = httpStatusCode12;
                        headersBuilder4 = headersBuilder11;
                        byteReadChannel8 = byteReadChannel17;
                        GMTDate gMTDate112 = gMTDate5;
                        String str132 = str7;
                        gMTDate2 = gMTDate112;
                        Intrinsics.checkNotNull(obj3);
                        map4.put(str8, (String) obj3);
                        i6 = i5 + 1;
                        intValue3 = i4;
                        GMTDate2 = gMTDate4;
                        gMTDate = gMTDate3;
                        str6 = str132;
                        byteReadChannel6 = byteReadChannel8;
                        createMapBuilder = map5;
                        map = map4;
                        fileCacheStorage$readCache$3 = fileCacheStorage$readCache$32;
                        if (i6 < intValue3) {
                        }
                        break;
                    case 14:
                        Map map12 = (Map) fileCacheStorage$readCache$3.L$8;
                        gMTDate6 = (GMTDate) fileCacheStorage$readCache$3.L$7;
                        gMTDate7 = (GMTDate) fileCacheStorage$readCache$3.L$6;
                        gMTDate2 = (GMTDate) fileCacheStorage$readCache$3.L$5;
                        headersBuilder4 = (HeadersBuilder) fileCacheStorage$readCache$3.L$4;
                        httpProtocolVersion3 = (HttpProtocolVersion) fileCacheStorage$readCache$3.L$3;
                        httpStatusCode4 = (HttpStatusCode) fileCacheStorage$readCache$3.L$2;
                        str6 = (String) fileCacheStorage$readCache$3.L$1;
                        byteReadChannel6 = (ByteReadChannel) fileCacheStorage$readCache$3.L$0;
                        ResultKt.throwOnFailure(obj3);
                        map6 = map12;
                        obj2 = coroutine_suspended;
                        bArr = new byte[((Number) obj3).intValue()];
                        fileCacheStorage$readCache$3.L$0 = str6;
                        fileCacheStorage$readCache$3.L$1 = httpStatusCode4;
                        fileCacheStorage$readCache$3.L$2 = httpProtocolVersion3;
                        fileCacheStorage$readCache$3.L$3 = headersBuilder4;
                        fileCacheStorage$readCache$3.L$4 = gMTDate2;
                        fileCacheStorage$readCache$3.L$5 = gMTDate7;
                        fileCacheStorage$readCache$3.L$6 = gMTDate6;
                        fileCacheStorage$readCache$3.L$7 = map6;
                        fileCacheStorage$readCache$3.L$8 = bArr;
                        fileCacheStorage$readCache$3.label = 15;
                        if (ByteReadChannelKt.readFully(byteReadChannel6, bArr, fileCacheStorage$readCache$3) != obj2) {
                        }
                        break;
                    case 15:
                        byte[] bArr3 = (byte[]) fileCacheStorage$readCache$3.L$8;
                        Map map13 = (Map) fileCacheStorage$readCache$3.L$7;
                        GMTDate gMTDate18 = (GMTDate) fileCacheStorage$readCache$3.L$6;
                        GMTDate gMTDate19 = (GMTDate) fileCacheStorage$readCache$3.L$5;
                        GMTDate gMTDate20 = (GMTDate) fileCacheStorage$readCache$3.L$4;
                        headersBuilder4 = (HeadersBuilder) fileCacheStorage$readCache$3.L$3;
                        HttpProtocolVersion httpProtocolVersion11 = (HttpProtocolVersion) fileCacheStorage$readCache$3.L$2;
                        HttpStatusCode httpStatusCode13 = (HttpStatusCode) fileCacheStorage$readCache$3.L$1;
                        str9 = (String) fileCacheStorage$readCache$3.L$0;
                        ResultKt.throwOnFailure(obj3);
                        bArr2 = bArr3;
                        map7 = map13;
                        gMTDate8 = gMTDate18;
                        gMTDate9 = gMTDate19;
                        gMTDate10 = gMTDate20;
                        httpProtocolVersion5 = httpProtocolVersion11;
                        httpStatusCode6 = httpStatusCode13;
                        return new CachedResponseData(URLUtilsKt.Url(str9), httpStatusCode6, gMTDate10, gMTDate9, httpProtocolVersion5, gMTDate8, headersBuilder4.build(), map7, bArr2);
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        fileCacheStorage$readCache$3 = new FileCacheStorage$readCache$3(this, continuation);
        Object obj32 = fileCacheStorage$readCache$3.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i62 = 0;
        switch (fileCacheStorage$readCache$3.label) {
        }
    }
}
