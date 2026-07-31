package coil3.network;

import android.content.Context;
import coil3.ImageLoader;
import coil3.Uri;
import coil3.decode.DataSource;
import coil3.decode.ImageSource;
import coil3.decode.ImageSourceKt;
import coil3.disk.DiskCache;
import coil3.fetch.FetchResult;
import coil3.fetch.Fetcher;
import coil3.fetch.SourceFetchResult;
import coil3.network.CacheStrategy;
import coil3.network.NetworkHeaders;
import coil3.network.internal.SingleParameterLazy;
import coil3.network.internal.SingleParameterLazyKt;
import coil3.network.internal.UtilsKt;
import coil3.network.internal.Utils_androidKt;
import coil3.request.Options;
import coil3.util.MimeTypeMap;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.firebase.messaging.Constants;
import java.io.IOException;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.ExceptionsKt;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.FileSystem;
import okio.Okio;
import okio.Path;

/* compiled from: NetworkFetcher.kt */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u00014B_\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0007¢\u0006\u0004\b\u0011\u0010\u0012BM\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0013J\u000e\u0010\u0014\u001a\u00020\u0015H\u0096@¢\u0006\u0002\u0010\u0016J\u000e\u0010\u0017\u001a\u00020\u0015H\u0082@¢\u0006\u0002\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\n\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0002J4\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001d2\b\u0010 \u001a\u0004\u0018\u00010\u001b2\u0006\u0010!\u001a\u00020\"2\u0006\u0010\u001a\u001a\u00020\u001bH\u0082@¢\u0006\u0002\u0010#J\b\u0010$\u001a\u00020\"H\u0002J\u001c\u0010%\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010&\u001a\u0004\u0018\u00010\u0003H\u0007J\u000e\u0010'\u001a\u0004\u0018\u00010\u001b*\u00020\u001dH\u0002J\f\u0010(\u001a\u00020)*\u00020\u001dH\u0002J\u0012\u0010(\u001a\u00020)*\u00020*H\u0082@¢\u0006\u0002\u0010+J\f\u0010(\u001a\u00020)*\u00020,H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010-\u001a\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0014\u00100\u001a\u0002018BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b2\u00103¨\u00065"}, d2 = {"Lcoil3/network/NetworkFetcher;", "Lcoil3/fetch/Fetcher;", ImagesContract.URL, "", "options", "Lcoil3/request/Options;", "networkClient", "Lkotlin/Lazy;", "Lcoil3/network/NetworkClient;", "diskCache", "Lcoil3/disk/DiskCache;", "cacheStrategy", "Lcoil3/network/CacheStrategy;", "connectivityChecker", "Lcoil3/network/ConnectivityChecker;", "concurrentRequestStrategy", "Lcoil3/network/ConcurrentRequestStrategy;", "<init>", "(Ljava/lang/String;Lcoil3/request/Options;Lkotlin/Lazy;Lkotlin/Lazy;Lkotlin/Lazy;Lkotlin/Lazy;Lkotlin/Lazy;)V", "(Ljava/lang/String;Lcoil3/request/Options;Lkotlin/Lazy;Lkotlin/Lazy;Lkotlin/Lazy;Lcoil3/network/ConnectivityChecker;)V", "fetch", "Lcoil3/fetch/FetchResult;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "doFetch", "throwIfFailureResponseCode", "", "networkResponse", "Lcoil3/network/NetworkResponse;", "readFromDiskCache", "Lcoil3/disk/DiskCache$Snapshot;", "writeToDiskCache", "snapshot", "cacheResponse", "networkRequest", "Lcoil3/network/NetworkRequest;", "(Lcoil3/disk/DiskCache$Snapshot;Lcoil3/network/NetworkResponse;Lcoil3/network/NetworkRequest;Lcoil3/network/NetworkResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "newRequest", "getMimeType", "contentType", "toNetworkResponseOrNull", "toImageSource", "Lcoil3/decode/ImageSource;", "Lcoil3/network/NetworkResponseBody;", "(Lcoil3/network/NetworkResponseBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lokio/Buffer;", "diskCacheKey", "getDiskCacheKey", "()Ljava/lang/String;", "fileSystem", "Lokio/FileSystem;", "getFileSystem", "()Lokio/FileSystem;", "Factory", "coil-network-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NetworkFetcher implements Fetcher {
    private final Lazy<CacheStrategy> cacheStrategy;
    private final Lazy<ConcurrentRequestStrategy> concurrentRequestStrategy;
    private final Lazy<ConnectivityChecker> connectivityChecker;
    private final Lazy<DiskCache> diskCache;
    private final Lazy<NetworkClient> networkClient;
    private final Options options;
    private final String url;

    /* JADX WARN: Multi-variable type inference failed */
    public NetworkFetcher(String str, Options options, Lazy<? extends NetworkClient> lazy, Lazy<? extends DiskCache> lazy2, Lazy<? extends CacheStrategy> lazy3, Lazy<? extends ConnectivityChecker> lazy4, Lazy<? extends ConcurrentRequestStrategy> lazy5) {
        this.url = str;
        this.options = options;
        this.networkClient = lazy;
        this.diskCache = lazy2;
        this.cacheStrategy = lazy3;
        this.connectivityChecker = lazy4;
        this.concurrentRequestStrategy = lazy5;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Kept for binary compatibility.")
    public /* synthetic */ NetworkFetcher(String str, Options options, Lazy lazy, Lazy lazy2, Lazy lazy3, ConnectivityChecker connectivityChecker) {
        this(str, options, lazy, lazy2, lazy3, LazyKt.lazyOf(connectivityChecker), LazyKt.lazyOf(ConcurrentRequestStrategy.UNCOORDINATED));
    }

    @Override // coil3.fetch.Fetcher
    public Object fetch(Continuation<? super FetchResult> continuation) {
        return this.concurrentRequestStrategy.getValue().apply(getDiskCacheKey(), new NetworkFetcher$fetch$2(this), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(18:0|1|(2:3|(15:5|6|7|(3:(1:(1:(4:12|13|14|15)(2:18|19))(6:20|21|22|23|24|(1:26)(1:29)))(4:38|39|40|41)|33|(2:35|36)(1:37))(13:64|65|66|(4:68|(2:78|79)|71|(2:73|(2:75|28)))|80|46|47|48|(1:50)|(1:58)|54|(3:56|24|(0)(0))|28)|42|(2:44|45)|46|47|48|(0)|(1:52)|58|54|(0)|28))|85|6|7|(0)(0)|42|(0)|46|47|48|(0)|(0)|58|54|(0)|28) */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0173, code lost:
    
        if (r15 == r1) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0179, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x017a, code lost:
    
        r15 = r0;
        r14 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0036, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0037, code lost:
    
        r15 = r0;
        r14 = r14;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0158 A[Catch: Exception -> 0x0036, TryCatch #3 {Exception -> 0x0036, blocks: (B:13:0x0031, B:14:0x0176, B:24:0x0154, B:26:0x0158), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f2 A[Catch: Exception -> 0x017d, TRY_LEAVE, TryCatch #0 {Exception -> 0x017d, blocks: (B:42:0x00ea, B:44:0x00f2, B:66:0x0075, B:68:0x007e, B:71:0x00b5, B:73:0x00c3, B:76:0x0095, B:78:0x009f), top: B:65:0x0075 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0125 A[Catch: Exception -> 0x0179, TryCatch #2 {Exception -> 0x0179, blocks: (B:48:0x0119, B:50:0x0125, B:52:0x012a, B:54:0x0134, B:58:0x0130), top: B:47:0x0119 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x012a A[Catch: Exception -> 0x0179, TryCatch #2 {Exception -> 0x0179, blocks: (B:48:0x0119, B:50:0x0125, B:52:0x012a, B:54:0x0134, B:58:0x0130), top: B:47:0x0119 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v19, types: [kotlin.jvm.internal.Ref$ObjectRef] */
    /* JADX WARN: Type inference failed for: r14v2, types: [kotlin.jvm.internal.Ref$ObjectRef] */
    /* JADX WARN: Type inference failed for: r14v22 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, coil3.disk.DiskCache$Snapshot] */
    /* JADX WARN: Type inference failed for: r2v13, types: [kotlin.jvm.internal.Ref$ObjectRef] */
    /* JADX WARN: Type inference failed for: r7v8, types: [T, coil3.network.NetworkResponse] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object, kotlin.jvm.internal.Ref$ObjectRef] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object doFetch(Continuation<? super FetchResult> continuation) {
        NetworkFetcher$doFetch$1 networkFetcher$doFetch$1;
        Object obj;
        Object coroutine_suspended;
        int i;
        Exception exc;
        ?? r14;
        Ref.ObjectRef objectRef;
        Ref.ObjectRef objectRef2;
        CacheStrategy.ReadResult readResult;
        Object read;
        NetworkFetcher networkFetcher;
        NetworkFetcher networkFetcher2;
        SourceFetchResult sourceFetchResult;
        if (continuation instanceof NetworkFetcher$doFetch$1) {
            networkFetcher$doFetch$1 = (NetworkFetcher$doFetch$1) continuation;
            if ((networkFetcher$doFetch$1.label & Integer.MIN_VALUE) != 0) {
                networkFetcher$doFetch$1.label -= Integer.MIN_VALUE;
                obj = networkFetcher$doFetch$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = networkFetcher$doFetch$1.label;
                if (i == 0) {
                    if (i == 1) {
                        objectRef2 = (Ref.ObjectRef) networkFetcher$doFetch$1.L$1;
                        Ref.ObjectRef objectRef3 = (Ref.ObjectRef) networkFetcher$doFetch$1.L$0;
                        try {
                            ResultKt.throwOnFailure(obj);
                            read = obj;
                            objectRef = objectRef3;
                        } catch (Exception e) {
                            exc = e;
                            r14 = objectRef3;
                        }
                    } else {
                        if (i != 2) {
                            if (i != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ?? r142 = (Ref.ObjectRef) networkFetcher$doFetch$1.L$0;
                            ResultKt.throwOnFailure(obj);
                            this = r142;
                            return (SourceFetchResult) obj;
                        }
                        ?? r2 = (Ref.ObjectRef) networkFetcher$doFetch$1.L$0;
                        try {
                            ResultKt.throwOnFailure(obj);
                            networkFetcher = this;
                            networkFetcher2 = r2;
                            sourceFetchResult = (SourceFetchResult) obj;
                            if (sourceFetchResult == null) {
                                return sourceFetchResult;
                            }
                            NetworkClient value = networkFetcher.networkClient.getValue();
                            NetworkRequest newRequest = networkFetcher.newRequest();
                            NetworkFetcher$doFetch$2 networkFetcher$doFetch$2 = new NetworkFetcher$doFetch$2(networkFetcher, null);
                            networkFetcher$doFetch$1.L$0 = networkFetcher2;
                            networkFetcher$doFetch$1.label = 3;
                            obj = value.executeRequest(newRequest, networkFetcher$doFetch$2, networkFetcher$doFetch$1);
                            this = networkFetcher2;
                        } catch (Exception e2) {
                            exc = e2;
                            r14 = r2;
                        }
                    }
                    DiskCache.Snapshot snapshot = (DiskCache.Snapshot) r14.element;
                    if (snapshot == null) {
                        throw exc;
                    }
                    UtilsKt.closeQuietly(snapshot);
                    throw exc;
                }
                ResultKt.throwOnFailure(obj);
                objectRef = new Ref.ObjectRef();
                objectRef.element = readFromDiskCache();
                try {
                    objectRef2 = new Ref.ObjectRef();
                    if (objectRef.element != null) {
                        Long size = getFileSystem().metadata(((DiskCache.Snapshot) objectRef.element).getMetadata()).getSize();
                        if (size != null && size.longValue() == 0) {
                            return new SourceFetchResult(toImageSource((DiskCache.Snapshot) objectRef.element), getMimeType(this.url, null), DataSource.DISK);
                        }
                        objectRef2.element = toNetworkResponseOrNull((DiskCache.Snapshot) objectRef.element);
                        if (objectRef2.element != null) {
                            throwIfFailureResponseCode((NetworkResponse) objectRef2.element);
                            CacheStrategy value2 = this.cacheStrategy.getValue();
                            NetworkResponse networkResponse = (NetworkResponse) objectRef2.element;
                            NetworkRequest newRequest2 = newRequest();
                            Options options = this.options;
                            networkFetcher$doFetch$1.L$0 = objectRef;
                            networkFetcher$doFetch$1.L$1 = objectRef2;
                            networkFetcher$doFetch$1.label = 1;
                            read = value2.read(networkResponse, newRequest2, options, networkFetcher$doFetch$1);
                            if (read == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    }
                    readResult = null;
                    ?? r8 = objectRef;
                    Ref.ObjectRef objectRef4 = objectRef2;
                    if (this.options.getNetworkCachePolicy().getReadEnabled()) {
                        Utils_androidKt.assertNotOnMainThread();
                    }
                    if (readResult != null || (r15 = readResult.getRequest()) == null) {
                        NetworkRequest newRequest3 = newRequest();
                    }
                    NetworkRequest networkRequest = newRequest3;
                    NetworkClient value3 = this.networkClient.getValue();
                    networkFetcher = this;
                    NetworkFetcher$doFetch$fetchResult$1 networkFetcher$doFetch$fetchResult$1 = new NetworkFetcher$doFetch$fetchResult$1(r8, networkFetcher, objectRef4, networkRequest, null);
                    networkFetcher$doFetch$1.L$0 = r8;
                    networkFetcher$doFetch$1.L$1 = null;
                    networkFetcher$doFetch$1.label = 2;
                    obj = value3.executeRequest(networkRequest, networkFetcher$doFetch$fetchResult$1, networkFetcher$doFetch$1);
                    if (obj != coroutine_suspended) {
                        networkFetcher2 = r8;
                        sourceFetchResult = (SourceFetchResult) obj;
                        if (sourceFetchResult == null) {
                        }
                    }
                    return coroutine_suspended;
                } catch (Exception e3) {
                    exc = e3;
                    r14 = objectRef;
                }
                readResult = (CacheStrategy.ReadResult) read;
                if (readResult.getResponse() != null) {
                    return new SourceFetchResult(toImageSource((DiskCache.Snapshot) objectRef.element), getMimeType(this.url, readResult.getResponse().getHeaders().get("Content-Type")), DataSource.DISK);
                }
                ?? r82 = objectRef;
                Ref.ObjectRef objectRef42 = objectRef2;
                if (this.options.getNetworkCachePolicy().getReadEnabled()) {
                }
                if (readResult != null) {
                }
                NetworkRequest newRequest32 = newRequest();
                NetworkRequest networkRequest2 = newRequest32;
                NetworkClient value32 = this.networkClient.getValue();
                networkFetcher = this;
                NetworkFetcher$doFetch$fetchResult$1 networkFetcher$doFetch$fetchResult$12 = new NetworkFetcher$doFetch$fetchResult$1(r82, networkFetcher, objectRef42, networkRequest2, null);
                networkFetcher$doFetch$1.L$0 = r82;
                networkFetcher$doFetch$1.L$1 = null;
                networkFetcher$doFetch$1.label = 2;
                obj = value32.executeRequest(networkRequest2, networkFetcher$doFetch$fetchResult$12, networkFetcher$doFetch$1);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
        }
        networkFetcher$doFetch$1 = new NetworkFetcher$doFetch$1(this, continuation);
        obj = networkFetcher$doFetch$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = networkFetcher$doFetch$1.label;
        if (i == 0) {
        }
        readResult = (CacheStrategy.ReadResult) read;
        if (readResult.getResponse() != null) {
        }
        ?? r822 = objectRef;
        Ref.ObjectRef objectRef422 = objectRef2;
        if (this.options.getNetworkCachePolicy().getReadEnabled()) {
        }
        if (readResult != null) {
        }
        NetworkRequest newRequest322 = newRequest();
        NetworkRequest networkRequest22 = newRequest322;
        NetworkClient value322 = this.networkClient.getValue();
        networkFetcher = this;
        NetworkFetcher$doFetch$fetchResult$1 networkFetcher$doFetch$fetchResult$122 = new NetworkFetcher$doFetch$fetchResult$1(r822, networkFetcher, objectRef422, networkRequest22, null);
        networkFetcher$doFetch$1.L$0 = r822;
        networkFetcher$doFetch$1.L$1 = null;
        networkFetcher$doFetch$1.label = 2;
        obj = value322.executeRequest(networkRequest22, networkFetcher$doFetch$fetchResult$122, networkFetcher$doFetch$1);
        if (obj != coroutine_suspended) {
        }
        return coroutine_suspended;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void throwIfFailureResponseCode(NetworkResponse networkResponse) {
        int code = networkResponse.getCode();
        if ((200 > code || code >= 300) && networkResponse.getCode() != 304) {
            throw new HttpException(networkResponse);
        }
    }

    private final DiskCache.Snapshot readFromDiskCache() {
        DiskCache value;
        if (!this.options.getDiskCachePolicy().getReadEnabled() || (value = this.diskCache.getValue()) == null) {
            return null;
        }
        return value.openSnapshot(getDiskCacheKey());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0100, code lost:
    
        if (r13.writeTo(r10, r15, r6) == r7) goto L60;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0091 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object writeToDiskCache(DiskCache.Snapshot snapshot, NetworkResponse networkResponse, NetworkRequest networkRequest, NetworkResponse networkResponse2, Continuation<? super DiskCache.Snapshot> continuation) {
        NetworkFetcher$writeToDiskCache$1 networkFetcher$writeToDiskCache$1;
        int i;
        NetworkResponse networkResponse3;
        NetworkResponse response;
        DiskCache.Editor openEditor;
        Exception exc;
        DiskCache.Editor editor;
        NetworkResponse networkResponse4;
        NetworkResponse networkResponse5;
        NetworkResponseBody body;
        NetworkResponseBody body2;
        if (continuation instanceof NetworkFetcher$writeToDiskCache$1) {
            networkFetcher$writeToDiskCache$1 = (NetworkFetcher$writeToDiskCache$1) continuation;
            if ((networkFetcher$writeToDiskCache$1.label & Integer.MIN_VALUE) != 0) {
                networkFetcher$writeToDiskCache$1.label -= Integer.MIN_VALUE;
                NetworkFetcher$writeToDiskCache$1 networkFetcher$writeToDiskCache$12 = networkFetcher$writeToDiskCache$1;
                Object obj = networkFetcher$writeToDiskCache$12.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = networkFetcher$writeToDiskCache$12.label;
                Throwable th = null;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (!this.options.getDiskCachePolicy().getWriteEnabled()) {
                        if (snapshot != null) {
                            UtilsKt.closeQuietly(snapshot);
                        }
                        return null;
                    }
                    CacheStrategy value = this.cacheStrategy.getValue();
                    Options options = this.options;
                    networkFetcher$writeToDiskCache$12.L$0 = snapshot;
                    networkFetcher$writeToDiskCache$12.L$1 = networkResponse2;
                    networkFetcher$writeToDiskCache$12.label = 1;
                    obj = value.write(networkResponse, networkRequest, networkResponse2, options, networkFetcher$writeToDiskCache$12);
                    if (obj != coroutine_suspended) {
                        networkResponse3 = networkResponse2;
                    }
                    return coroutine_suspended;
                }
                if (i == 1) {
                    networkResponse3 = (NetworkResponse) networkFetcher$writeToDiskCache$12.L$1;
                    snapshot = (DiskCache.Snapshot) networkFetcher$writeToDiskCache$12.L$0;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    editor = (DiskCache.Editor) networkFetcher$writeToDiskCache$12.L$2;
                    networkResponse4 = (NetworkResponse) networkFetcher$writeToDiskCache$12.L$1;
                    networkResponse5 = (NetworkResponse) networkFetcher$writeToDiskCache$12.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                        return editor.commitAndOpenSnapshot();
                    } catch (Exception e) {
                        exc = e;
                        UtilsKt.abortQuietly(editor);
                        body = networkResponse5.getBody();
                        if (body != null) {
                        }
                        body2 = networkResponse4.getBody();
                        if (body2 == null) {
                        }
                    }
                }
                response = ((CacheStrategy.WriteResult) obj).getResponse();
                if (response != null) {
                    return null;
                }
                if (snapshot != null) {
                    openEditor = snapshot.closeAndOpenEditor();
                } else {
                    DiskCache value2 = this.diskCache.getValue();
                    openEditor = value2 != null ? value2.openEditor(getDiskCacheKey()) : null;
                }
                if (openEditor == null) {
                    return null;
                }
                try {
                    BufferedSink buffer = Okio.buffer(getFileSystem().sink(openEditor.getMetadata(), false));
                    try {
                        CacheNetworkResponse.INSTANCE.writeTo(response, buffer);
                        Unit unit = Unit.INSTANCE;
                        if (buffer != null) {
                            try {
                                buffer.close();
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        if (buffer != null) {
                            try {
                                buffer.close();
                            } catch (Throwable th4) {
                                ExceptionsKt.addSuppressed(th, th4);
                            }
                        }
                    }
                    if (th == null) {
                        NetworkResponseBody body3 = response.getBody();
                        if (body3 != null) {
                            FileSystem fileSystem = getFileSystem();
                            Path data = openEditor.getData();
                            networkFetcher$writeToDiskCache$12.L$0 = networkResponse3;
                            networkFetcher$writeToDiskCache$12.L$1 = response;
                            networkFetcher$writeToDiskCache$12.L$2 = openEditor;
                            networkFetcher$writeToDiskCache$12.label = 2;
                        }
                        editor = openEditor;
                        networkResponse4 = response;
                        networkResponse5 = networkResponse3;
                        return editor.commitAndOpenSnapshot();
                    }
                    throw th;
                } catch (Exception e2) {
                    exc = e2;
                    editor = openEditor;
                    networkResponse4 = response;
                    networkResponse5 = networkResponse3;
                    UtilsKt.abortQuietly(editor);
                    body = networkResponse5.getBody();
                    if (body != null) {
                        UtilsKt.closeQuietly(body);
                    }
                    body2 = networkResponse4.getBody();
                    if (body2 == null) {
                        UtilsKt.closeQuietly(body2);
                        throw exc;
                    }
                    throw exc;
                }
            }
        }
        networkFetcher$writeToDiskCache$1 = new NetworkFetcher$writeToDiskCache$1(this, continuation);
        NetworkFetcher$writeToDiskCache$1 networkFetcher$writeToDiskCache$122 = networkFetcher$writeToDiskCache$1;
        Object obj2 = networkFetcher$writeToDiskCache$122.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = networkFetcher$writeToDiskCache$122.label;
        Throwable th5 = null;
        if (i != 0) {
        }
        response = ((CacheStrategy.WriteResult) obj2).getResponse();
        if (response != null) {
        }
    }

    private final NetworkRequest newRequest() {
        NetworkHeaders.Builder newBuilder = ImageRequestsKt.getHttpHeaders(this.options).newBuilder();
        boolean readEnabled = this.options.getDiskCachePolicy().getReadEnabled();
        boolean z = this.options.getNetworkCachePolicy().getReadEnabled() && this.connectivityChecker.getValue().isOnline();
        if (!z && readEnabled) {
            newBuilder.set("Cache-Control", "only-if-cached, max-stale=2147483647");
        } else if (!z || readEnabled) {
            if (!z && !readEnabled) {
                newBuilder.set("Cache-Control", "no-cache, only-if-cached");
            }
        } else if (this.options.getDiskCachePolicy().getWriteEnabled()) {
            newBuilder.set("Cache-Control", "no-cache");
        } else {
            newBuilder.set("Cache-Control", "no-cache, no-store");
        }
        return new NetworkRequest(this.url, ImageRequestsKt.getHttpMethod(this.options), newBuilder.build(), ImageRequestsKt.getHttpBody(this.options), this.options.getExtras());
    }

    public final String getMimeType(String url, String contentType) {
        String mimeTypeFromUrl;
        if ((contentType == null || StringsKt.startsWith$default(contentType, UtilsKt.MIME_TYPE_TEXT_PLAIN, false, 2, (Object) null)) && (mimeTypeFromUrl = MimeTypeMap.INSTANCE.getMimeTypeFromUrl(url)) != null) {
            return mimeTypeFromUrl;
        }
        if (contentType != null) {
            return StringsKt.substringBefore$default(contentType, ';', (String) null, 2, (Object) null);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final NetworkResponse toNetworkResponseOrNull(DiskCache.Snapshot snapshot) {
        Throwable th;
        NetworkResponse networkResponse;
        try {
            BufferedSource buffer = Okio.buffer(getFileSystem().source(snapshot.getMetadata()));
            try {
                networkResponse = CacheNetworkResponse.INSTANCE.readFrom(buffer);
                if (buffer != null) {
                    try {
                        buffer.close();
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                th = null;
            } catch (Throwable th3) {
                if (buffer != null) {
                    try {
                        buffer.close();
                    } catch (Throwable th4) {
                        ExceptionsKt.addSuppressed(th3, th4);
                    }
                }
                th = th3;
                networkResponse = null;
            }
            if (th == null) {
                return networkResponse;
            }
            throw th;
        } catch (IOException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ImageSource toImageSource(DiskCache.Snapshot snapshot) {
        return ImageSourceKt.ImageSource$default(snapshot.getData(), getFileSystem(), getDiskCacheKey(), snapshot, null, 16, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object toImageSource(NetworkResponseBody networkResponseBody, Continuation<? super ImageSource> continuation) {
        NetworkFetcher$toImageSource$1 networkFetcher$toImageSource$1;
        int i;
        Buffer buffer;
        if (continuation instanceof NetworkFetcher$toImageSource$1) {
            networkFetcher$toImageSource$1 = (NetworkFetcher$toImageSource$1) continuation;
            if ((networkFetcher$toImageSource$1.label & Integer.MIN_VALUE) != 0) {
                networkFetcher$toImageSource$1.label -= Integer.MIN_VALUE;
                Object obj = networkFetcher$toImageSource$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = networkFetcher$toImageSource$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Buffer buffer2 = new Buffer();
                    networkFetcher$toImageSource$1.L$0 = buffer2;
                    networkFetcher$toImageSource$1.label = 1;
                    if (networkResponseBody.writeTo(buffer2, networkFetcher$toImageSource$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    buffer = buffer2;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    buffer = (Buffer) networkFetcher$toImageSource$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                return toImageSource(buffer);
            }
        }
        networkFetcher$toImageSource$1 = new NetworkFetcher$toImageSource$1(this, continuation);
        Object obj2 = networkFetcher$toImageSource$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = networkFetcher$toImageSource$1.label;
        if (i != 0) {
        }
        return toImageSource(buffer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ImageSource toImageSource(Buffer buffer) {
        return ImageSourceKt.ImageSource$default(buffer, getFileSystem(), null, 4, null);
    }

    private final String getDiskCacheKey() {
        String diskCacheKey = this.options.getDiskCacheKey();
        return diskCacheKey == null ? this.url : diskCacheKey;
    }

    private final FileSystem getFileSystem() {
        FileSystem fileSystem;
        DiskCache value = this.diskCache.getValue();
        return (value == null || (fileSystem = value.getFileSystem()) == null) ? this.options.getFileSystem() : fileSystem;
    }

    /* compiled from: NetworkFetcher.kt */
    @Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BO\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\u0018\b\u0002\u0010\b\u001a\u0012\u0012\b\u0012\u00060\nj\u0002`\u000b\u0012\u0004\u0012\u00020\f0\t\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0004¢\u0006\u0004\b\u000f\u0010\u0010BA\b\u0017\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\u0018\b\u0002\u0010\b\u001a\u0012\u0012\b\u0012\u00060\nj\u0002`\u000b\u0012\u0004\u0012\u00020\f0\t¢\u0006\u0004\b\u000f\u0010\u0011J\"\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010\u001a\u001a\u00020\u0002H\u0002R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0015\u001a\u0012\u0012\b\u0012\u00060\nj\u0002`\u000b\u0012\u0004\u0012\u00020\f0\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0013X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcoil3/network/NetworkFetcher$Factory;", "Lcoil3/fetch/Fetcher$Factory;", "Lcoil3/Uri;", "networkClient", "Lkotlin/Function0;", "Lcoil3/network/NetworkClient;", "cacheStrategy", "Lcoil3/network/CacheStrategy;", "connectivityChecker", "Lkotlin/Function1;", "Landroid/content/Context;", "Lcoil3/PlatformContext;", "Lcoil3/network/ConnectivityChecker;", "concurrentRequestStrategy", "Lcoil3/network/ConcurrentRequestStrategy;", "<init>", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "networkClientLazy", "Lkotlin/Lazy;", "cacheStrategyLazy", "connectivityCheckerLazy", "Lcoil3/network/internal/SingleParameterLazy;", "concurrentRequestStrategyLazy", "create", "Lcoil3/fetch/Fetcher;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "options", "Lcoil3/request/Options;", "imageLoader", "Lcoil3/ImageLoader;", "isApplicable", "", "coil-network-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Factory implements Fetcher.Factory<Uri> {
        private final Lazy<CacheStrategy> cacheStrategyLazy;
        private final Lazy<ConcurrentRequestStrategy> concurrentRequestStrategyLazy;
        private final SingleParameterLazy<Context, ConnectivityChecker> connectivityCheckerLazy;
        private final Lazy<NetworkClient> networkClientLazy;

        public Factory(Function0<? extends NetworkClient> function0, Function0<? extends CacheStrategy> function02, Function1<? super Context, ? extends ConnectivityChecker> function1, Function0<? extends ConcurrentRequestStrategy> function03) {
            this.networkClientLazy = LazyKt.lazy(function0);
            this.cacheStrategyLazy = LazyKt.lazy(function02);
            this.connectivityCheckerLazy = SingleParameterLazyKt.singleParameterLazy(function1);
            this.concurrentRequestStrategyLazy = LazyKt.lazy(function03);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: NetworkFetcher.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: coil3.network.NetworkFetcher$Factory$2, reason: invalid class name */
        public static final /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements Function1<Context, ConnectivityChecker> {
            public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

            AnonymousClass2() {
                super(1, ConnectivityCheckerKt.class, "ConnectivityChecker", "ConnectivityChecker(Landroid/content/Context;)Lcoil3/network/ConnectivityChecker;", 1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final ConnectivityChecker invoke(Context context) {
                return ConnectivityCheckerKt.ConnectivityChecker(context);
            }
        }

        public /* synthetic */ Factory(Function0 function0, Function0 function02, AnonymousClass2 anonymousClass2, Function0 function03, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(function0, (i & 2) != 0 ? new Function0() { // from class: coil3.network.NetworkFetcher$Factory$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    CacheStrategy cacheStrategy;
                    cacheStrategy = CacheStrategy.DEFAULT;
                    return cacheStrategy;
                }
            } : function02, (i & 4) != 0 ? AnonymousClass2.INSTANCE : anonymousClass2, (i & 8) != 0 ? new Function0() { // from class: coil3.network.NetworkFetcher$Factory$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    ConcurrentRequestStrategy concurrentRequestStrategy;
                    concurrentRequestStrategy = ConcurrentRequestStrategy.UNCOORDINATED;
                    return concurrentRequestStrategy;
                }
            } : function03);
        }

        /* compiled from: NetworkFetcher.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: coil3.network.NetworkFetcher$Factory$5, reason: invalid class name */
        static final /* synthetic */ class AnonymousClass5 extends FunctionReferenceImpl implements Function1<Context, ConnectivityChecker> {
            public static final AnonymousClass5 INSTANCE = new AnonymousClass5();

            AnonymousClass5() {
                super(1, ConnectivityCheckerKt.class, "ConnectivityChecker", "ConnectivityChecker(Landroid/content/Context;)Lcoil3/network/ConnectivityChecker;", 1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final ConnectivityChecker invoke(Context context) {
                return ConnectivityCheckerKt.ConnectivityChecker(context);
            }
        }

        public /* synthetic */ Factory(Function0 function0, Function0 function02, AnonymousClass5 anonymousClass5, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(function0, (i & 2) != 0 ? new Function0() { // from class: coil3.network.NetworkFetcher$Factory$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    CacheStrategy cacheStrategy;
                    cacheStrategy = CacheStrategy.DEFAULT;
                    return cacheStrategy;
                }
            } : function02, (i & 4) != 0 ? AnonymousClass5.INSTANCE : anonymousClass5);
        }

        @Deprecated(level = DeprecationLevel.HIDDEN, message = "Kept for binary compatibility.")
        public /* synthetic */ Factory(Function0 function0, Function0 function02, Function1 function1) {
            this(function0, function02, function1, new Function0() { // from class: coil3.network.NetworkFetcher$Factory$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    ConcurrentRequestStrategy concurrentRequestStrategy;
                    concurrentRequestStrategy = ConcurrentRequestStrategy.UNCOORDINATED;
                    return concurrentRequestStrategy;
                }
            });
        }

        @Override // coil3.fetch.Fetcher.Factory
        public Fetcher create(Uri data, Options options, final ImageLoader imageLoader) {
            if (isApplicable(data)) {
                return new NetworkFetcher(data.getData(), options, this.networkClientLazy, LazyKt.lazy(new Function0() { // from class: coil3.network.NetworkFetcher$Factory$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        DiskCache diskCache;
                        diskCache = ImageLoader.this.getDiskCache();
                        return diskCache;
                    }
                }), this.cacheStrategyLazy, LazyKt.lazyOf(this.connectivityCheckerLazy.get(options.getContext())), this.concurrentRequestStrategyLazy);
            }
            return null;
        }

        private final boolean isApplicable(Uri data) {
            return Intrinsics.areEqual(data.getScheme(), "http") || Intrinsics.areEqual(data.getScheme(), "https");
        }
    }
}
