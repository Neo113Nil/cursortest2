package coil3;

import android.content.Context;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import coil3.EventListener;
import coil3.ImageLoader;
import coil3.decode.DataSource;
import coil3.disk.DiskCache;
import coil3.intercept.EngineInterceptor;
import coil3.memory.MemoryCache;
import coil3.request.Disposable;
import coil3.request.ErrorResult;
import coil3.request.ImageRequest;
import coil3.request.ImageRequests_androidKt;
import coil3.request.ImageResult;
import coil3.request.NullRequestData;
import coil3.request.NullRequestDataException;
import coil3.request.RequestDelegate;
import coil3.request.RequestService;
import coil3.request.RequestService_androidKt;
import coil3.request.SuccessResult;
import coil3.size.Size;
import coil3.size.SizeResolver;
import coil3.target.Target;
import coil3.transition.NoneTransition;
import coil3.transition.Transition;
import coil3.transition.TransitionTarget;
import coil3.util.Logger;
import coil3.util.SystemCallbacks;
import coil3.util.SystemCallbacksKt;
import coil3.util.UtilsKt;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.JobKt;

/* compiled from: RealImageLoader.kt */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0001;B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0016J\u0016\u0010'\u001a\u00020(2\u0006\u0010%\u001a\u00020&H\u0096@¢\u0006\u0002\u0010)J\u001e\u0010'\u001a\u00020(2\u0006\u0010*\u001a\u00020&2\u0006\u0010+\u001a\u00020,H\u0082@¢\u0006\u0002\u0010-J\b\u0010!\u001a\u00020.H\u0016J\b\u0010/\u001a\u000200H\u0016J\"\u00101\u001a\u00020.2\u0006\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u0001052\u0006\u00106\u001a\u000207H\u0002J\"\u00108\u001a\u00020.2\u0006\u00102\u001a\u0002092\b\u00104\u001a\u0004\u0018\u0001052\u0006\u00106\u001a\u000207H\u0002J\u0018\u0010:\u001a\u00020.2\u0006\u0010%\u001a\u00020&2\u0006\u00106\u001a\u000207H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0012\u001a\u0004\u0018\u00010\u00138VX\u0096\u0084\u0002¢\u0006\f\u001a\u0004\b\u0016\u0010\u0017*\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0018\u001a\u0004\u0018\u00010\u00198VX\u0096\u0084\u0002¢\u0006\f\u001a\u0004\b\u001b\u0010\u001c*\u0004\b\u001a\u0010\u0015R\u0014\u0010\u001d\u001a\u00020\u001eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\t\u0010!\u001a\u00020\"X\u0082\u0004¨\u0006<"}, d2 = {"Lcoil3/RealImageLoader;", "Lcoil3/ImageLoader;", "options", "Lcoil3/RealImageLoader$Options;", "<init>", "(Lcoil3/RealImageLoader$Options;)V", "getOptions", "()Lcoil3/RealImageLoader$Options;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "systemCallbacks", "Lcoil3/util/SystemCallbacks;", "requestService", "Lcoil3/request/RequestService;", "defaults", "Lcoil3/request/ImageRequest$Defaults;", "getDefaults", "()Lcoil3/request/ImageRequest$Defaults;", "memoryCache", "Lcoil3/memory/MemoryCache;", "getMemoryCache$delegate", "(Lcoil3/RealImageLoader;)Ljava/lang/Object;", "getMemoryCache", "()Lcoil3/memory/MemoryCache;", "diskCache", "Lcoil3/disk/DiskCache;", "getDiskCache$delegate", "getDiskCache", "()Lcoil3/disk/DiskCache;", "components", "Lcoil3/ComponentRegistry;", "getComponents", "()Lcoil3/ComponentRegistry;", "shutdown", "Lkotlinx/atomicfu/AtomicBoolean;", "enqueue", "Lcoil3/request/Disposable;", "request", "Lcoil3/request/ImageRequest;", "execute", "Lcoil3/request/ImageResult;", "(Lcoil3/request/ImageRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "initialRequest", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "", "(Lcoil3/request/ImageRequest;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "newBuilder", "Lcoil3/ImageLoader$Builder;", "onSuccess", "result", "Lcoil3/request/SuccessResult;", TypedValues.AttributesType.S_TARGET, "Lcoil3/target/Target;", "eventListener", "Lcoil3/EventListener;", "onError", "Lcoil3/request/ErrorResult;", "onCancel", "Options", "coil-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RealImageLoader implements ImageLoader {
    private static final /* synthetic */ AtomicIntegerFieldUpdater shutdown$volatile$FU = AtomicIntegerFieldUpdater.newUpdater(RealImageLoader.class, "shutdown$volatile");
    private final ComponentRegistry components;
    private final Options options;
    private final RequestService requestService;
    private final CoroutineScope scope;
    private volatile /* synthetic */ int shutdown$volatile;
    private final SystemCallbacks systemCallbacks;

    private final /* synthetic */ int getShutdown$volatile() {
        return this.shutdown$volatile;
    }

    private final /* synthetic */ void setShutdown$volatile(int i) {
        this.shutdown$volatile = i;
    }

    public RealImageLoader(Options options) {
        CoroutineScope CoroutineScope;
        this.options = options;
        CoroutineScope = RealImageLoaderKt.CoroutineScope(options.getLogger());
        this.scope = CoroutineScope;
        SystemCallbacks SystemCallbacks = SystemCallbacksKt.SystemCallbacks(this);
        this.systemCallbacks = SystemCallbacks;
        RealImageLoader realImageLoader = this;
        RequestService RequestService = RequestService_androidKt.RequestService(realImageLoader, SystemCallbacks, options.getLogger());
        this.requestService = RequestService;
        options.getMemoryCacheLazy();
        options.getDiskCacheLazy();
        this.components = RealImageLoaderKt.addCommonComponents(RealImageLoader_nonAppleKt.addAppleComponents(RealImageLoader_jvmCommonKt.addJvmComponents(RealImageLoader_androidKt.addAndroidComponents(RealImageLoaderKt.addServiceLoaderComponents(options.getComponentRegistry().newBuilder(), options), options), options), options)).add(new EngineInterceptor(realImageLoader, SystemCallbacks, RequestService, options.getLogger())).build();
    }

    public final Options getOptions() {
        return this.options;
    }

    @Override // coil3.ImageLoader
    public ImageRequest.Defaults getDefaults() {
        return this.options.getDefaults();
    }

    @Override // coil3.ImageLoader
    public MemoryCache getMemoryCache() {
        return this.options.getMemoryCacheLazy().getValue();
    }

    @Override // coil3.ImageLoader
    public DiskCache getDiskCache() {
        return this.options.getDiskCacheLazy().getValue();
    }

    @Override // coil3.ImageLoader
    public ComponentRegistry getComponents() {
        return this.components;
    }

    @Override // coil3.ImageLoader
    public Disposable enqueue(ImageRequest request) {
        Deferred async$default;
        async$default = BuildersKt__Builders_commonKt.async$default(this.scope, this.options.getMainCoroutineContextLazy().getValue(), null, new RealImageLoader$enqueue$job$1(this, request, null), 2, null);
        return RealImageLoader_androidKt.getDisposable(request, async$default);
    }

    @Override // coil3.ImageLoader
    public Object execute(ImageRequest imageRequest, Continuation<? super ImageResult> continuation) {
        if (!RealImageLoader_androidKt.needsExecuteOnMainDispatcher(imageRequest)) {
            return execute(imageRequest, 1, continuation);
        }
        return CoroutineScopeKt.coroutineScope(new RealImageLoader$execute$2(this, imageRequest, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0155 A[Catch: all -> 0x0066, TryCatch #2 {all -> 0x0066, blocks: (B:13:0x003f, B:14:0x014f, B:16:0x0155, B:20:0x0160, B:22:0x0164, B:23:0x0172, B:24:0x0177, B:28:0x005c), top: B:7:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0160 A[Catch: all -> 0x0066, TryCatch #2 {all -> 0x0066, blocks: (B:13:0x003f, B:14:0x014f, B:16:0x0155, B:20:0x0160, B:22:0x0164, B:23:0x0172, B:24:0x0177, B:28:0x005c), top: B:7:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0192 A[Catch: all -> 0x01a5, TRY_LEAVE, TryCatch #1 {all -> 0x01a5, blocks: (B:43:0x018e, B:45:0x0192, B:48:0x01a1, B:49:0x01a4), top: B:42:0x018e }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01a1 A[Catch: all -> 0x01a5, TRY_ENTER, TryCatch #1 {all -> 0x01a5, blocks: (B:43:0x018e, B:45:0x0192, B:48:0x01a1, B:49:0x01a4), top: B:42:0x018e }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00d8 A[Catch: all -> 0x0180, TryCatch #0 {all -> 0x0180, blocks: (B:61:0x00d2, B:63:0x00d8, B:65:0x00de, B:67:0x00e4, B:68:0x00ea, B:71:0x00f2, B:72:0x00f8, B:74:0x00fb, B:76:0x0104, B:77:0x0107), top: B:60:0x00d2 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0104 A[Catch: all -> 0x0180, TryCatch #0 {all -> 0x0180, blocks: (B:61:0x00d2, B:63:0x00d8, B:65:0x00de, B:67:0x00e4, B:68:0x00ea, B:71:0x00f2, B:72:0x00f8, B:74:0x00fb, B:76:0x0104, B:77:0x0107), top: B:60:0x00d2 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /* JADX WARN: Type inference failed for: r13v0, types: [coil3.RealImageLoader] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v12, types: [coil3.EventListener, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v21, types: [coil3.EventListener] */
    /* JADX WARN: Type inference failed for: r3v3, types: [int] */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v4, types: [coil3.EventListener] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [coil3.request.ImageRequest] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [coil3.request.RequestDelegate] */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object execute(ImageRequest imageRequest, int i, Continuation<? super ImageResult> continuation) {
        RealImageLoader$execute$3 realImageLoader$execute$3;
        Object coroutine_suspended;
        ?? r3;
        ?? r4;
        ?? r5;
        RequestDelegate requestDelegate;
        ImageRequest imageRequest2;
        EventListener eventListener;
        RequestDelegate requestDelegate2;
        Image image;
        Target target;
        ImageRequest.Listener listener;
        Object size;
        RequestDelegate requestDelegate3;
        EventListener eventListener2;
        ImageRequest imageRequest3;
        MemoryCache memoryCache;
        MemoryCache.Value value;
        ImageRequest imageRequest4;
        Object withContext;
        EventListener eventListener3;
        RequestDelegate requestDelegate4;
        ImageRequest imageRequest5;
        ImageResult imageResult;
        try {
            try {
                if (continuation instanceof RealImageLoader$execute$3) {
                    realImageLoader$execute$3 = (RealImageLoader$execute$3) continuation;
                    if ((realImageLoader$execute$3.label & Integer.MIN_VALUE) != 0) {
                        realImageLoader$execute$3.label -= Integer.MIN_VALUE;
                        RealImageLoader$execute$3 realImageLoader$execute$32 = realImageLoader$execute$3;
                        Object obj = realImageLoader$execute$32.result;
                        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        r3 = realImageLoader$execute$32.label;
                        r4 = 2;
                        r5 = 1;
                        if (r3 != 0) {
                            ResultKt.throwOnFailure(obj);
                            requestDelegate = this.requestService.requestDelegate(imageRequest, JobKt.getJob(realImageLoader$execute$32.getContext()), i == 0);
                            requestDelegate.assertActive();
                            ImageRequest updateRequest = this.requestService.updateRequest(imageRequest);
                            EventListener create = this.options.getEventListenerFactory().create(updateRequest);
                            try {
                                if (Intrinsics.areEqual(updateRequest.getData(), NullRequestData.INSTANCE)) {
                                    throw new NullRequestDataException();
                                }
                                requestDelegate.start();
                                if (i == 0) {
                                    realImageLoader$execute$32.L$0 = requestDelegate;
                                    realImageLoader$execute$32.L$1 = updateRequest;
                                    realImageLoader$execute$32.L$2 = create;
                                    realImageLoader$execute$32.label = 1;
                                    if (requestDelegate.awaitStarted(realImageLoader$execute$32) != coroutine_suspended) {
                                        imageRequest2 = updateRequest;
                                        eventListener = create;
                                        requestDelegate2 = requestDelegate;
                                    }
                                    return coroutine_suspended;
                                }
                                imageRequest2 = updateRequest;
                                r3 = create;
                                MemoryCache.Key placeholderMemoryCacheKey = imageRequest2.getPlaceholderMemoryCacheKey();
                                image = (placeholderMemoryCacheKey != null || (memoryCache = getMemoryCache()) == null || (value = memoryCache.get(placeholderMemoryCacheKey)) == null) ? null : value.getImage();
                                target = imageRequest2.getTarget();
                                if (target != null) {
                                    target.onStart(image == null ? imageRequest2.placeholder() : image);
                                }
                                r3.onStart(imageRequest2);
                                listener = imageRequest2.getListener();
                                if (listener != null) {
                                    listener.onStart(imageRequest2);
                                }
                                SizeResolver sizeResolver = imageRequest2.getSizeResolver();
                                r3.resolveSizeStart(imageRequest2, sizeResolver);
                                realImageLoader$execute$32.L$0 = requestDelegate;
                                realImageLoader$execute$32.L$1 = imageRequest2;
                                realImageLoader$execute$32.L$2 = r3;
                                realImageLoader$execute$32.L$3 = image;
                                realImageLoader$execute$32.label = 2;
                                size = sizeResolver.size(realImageLoader$execute$32);
                                if (size != coroutine_suspended) {
                                    requestDelegate3 = requestDelegate;
                                    obj = size;
                                    eventListener2 = r3;
                                    imageRequest3 = imageRequest2;
                                    Image image2 = image;
                                    Size size2 = (Size) obj;
                                    eventListener2.resolveSizeEnd(imageRequest3, size2);
                                    CoroutineContext interceptorCoroutineContext = imageRequest3.getInterceptorCoroutineContext();
                                    imageRequest4 = imageRequest3;
                                    RealImageLoader$execute$result$1 realImageLoader$execute$result$1 = new RealImageLoader$execute$result$1(imageRequest4, this, size2, eventListener2, image2, null);
                                    realImageLoader$execute$32.L$0 = requestDelegate3;
                                    realImageLoader$execute$32.L$1 = imageRequest4;
                                    realImageLoader$execute$32.L$2 = eventListener2;
                                    realImageLoader$execute$32.L$3 = null;
                                    realImageLoader$execute$32.label = 3;
                                    withContext = BuildersKt.withContext(interceptorCoroutineContext, realImageLoader$execute$result$1, realImageLoader$execute$32);
                                    if (withContext != coroutine_suspended) {
                                    }
                                }
                                return coroutine_suspended;
                            } catch (Throwable th) {
                                th = th;
                                r5 = requestDelegate;
                                r4 = updateRequest;
                                r3 = create;
                                if (!(th instanceof CancellationException)) {
                                }
                            }
                        } else if (r3 == 1) {
                            r3 = (EventListener) realImageLoader$execute$32.L$2;
                            imageRequest2 = (ImageRequest) realImageLoader$execute$32.L$1;
                            requestDelegate2 = (RequestDelegate) realImageLoader$execute$32.L$0;
                            try {
                                ResultKt.throwOnFailure(obj);
                                eventListener = r3;
                            } catch (Throwable th2) {
                                th = th2;
                                r4 = imageRequest2;
                                r5 = requestDelegate2;
                                if (!(th instanceof CancellationException)) {
                                }
                            }
                        } else {
                            if (r3 != 2) {
                                if (r3 != 3) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                eventListener3 = (EventListener) realImageLoader$execute$32.L$2;
                                imageRequest5 = (ImageRequest) realImageLoader$execute$32.L$1;
                                requestDelegate4 = (RequestDelegate) realImageLoader$execute$32.L$0;
                                ResultKt.throwOnFailure(obj);
                                imageResult = (ImageResult) obj;
                                if (!(imageResult instanceof SuccessResult)) {
                                    onSuccess((SuccessResult) imageResult, imageRequest5.getTarget(), eventListener3);
                                } else {
                                    if (!(imageResult instanceof ErrorResult)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    onError((ErrorResult) imageResult, imageRequest5.getTarget(), eventListener3);
                                }
                                requestDelegate4.complete();
                                return imageResult;
                            }
                            image = (Image) realImageLoader$execute$32.L$3;
                            EventListener eventListener4 = (EventListener) realImageLoader$execute$32.L$2;
                            ImageRequest imageRequest6 = (ImageRequest) realImageLoader$execute$32.L$1;
                            RequestDelegate requestDelegate5 = (RequestDelegate) realImageLoader$execute$32.L$0;
                            ResultKt.throwOnFailure(obj);
                            eventListener2 = eventListener4;
                            imageRequest3 = imageRequest6;
                            requestDelegate3 = requestDelegate5;
                            Image image22 = image;
                            try {
                                Size size22 = (Size) obj;
                                eventListener2.resolveSizeEnd(imageRequest3, size22);
                                CoroutineContext interceptorCoroutineContext2 = imageRequest3.getInterceptorCoroutineContext();
                                imageRequest4 = imageRequest3;
                                try {
                                    RealImageLoader$execute$result$1 realImageLoader$execute$result$12 = new RealImageLoader$execute$result$1(imageRequest4, this, size22, eventListener2, image22, null);
                                    realImageLoader$execute$32.L$0 = requestDelegate3;
                                    realImageLoader$execute$32.L$1 = imageRequest4;
                                    realImageLoader$execute$32.L$2 = eventListener2;
                                    realImageLoader$execute$32.L$3 = null;
                                    realImageLoader$execute$32.label = 3;
                                    withContext = BuildersKt.withContext(interceptorCoroutineContext2, realImageLoader$execute$result$12, realImageLoader$execute$32);
                                    if (withContext != coroutine_suspended) {
                                        eventListener3 = eventListener2;
                                        requestDelegate4 = requestDelegate3;
                                        imageRequest5 = imageRequest4;
                                        obj = withContext;
                                        imageResult = (ImageResult) obj;
                                        if (!(imageResult instanceof SuccessResult)) {
                                        }
                                        requestDelegate4.complete();
                                        return imageResult;
                                    }
                                    return coroutine_suspended;
                                } catch (Throwable th3) {
                                    th = th3;
                                    r3 = eventListener2;
                                    r5 = requestDelegate3;
                                    r4 = imageRequest4;
                                    try {
                                        if (!(th instanceof CancellationException)) {
                                        }
                                    } finally {
                                        r5.complete();
                                    }
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                imageRequest4 = imageRequest3;
                            }
                        }
                        requestDelegate = requestDelegate2;
                        r3 = eventListener;
                        MemoryCache.Key placeholderMemoryCacheKey2 = imageRequest2.getPlaceholderMemoryCacheKey();
                        if (placeholderMemoryCacheKey2 != null) {
                        }
                        target = imageRequest2.getTarget();
                        if (target != null) {
                        }
                        r3.onStart(imageRequest2);
                        listener = imageRequest2.getListener();
                        if (listener != null) {
                        }
                        SizeResolver sizeResolver2 = imageRequest2.getSizeResolver();
                        r3.resolveSizeStart(imageRequest2, sizeResolver2);
                        realImageLoader$execute$32.L$0 = requestDelegate;
                        realImageLoader$execute$32.L$1 = imageRequest2;
                        realImageLoader$execute$32.L$2 = r3;
                        realImageLoader$execute$32.L$3 = image;
                        realImageLoader$execute$32.label = 2;
                        size = sizeResolver2.size(realImageLoader$execute$32);
                        if (size != coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    }
                }
                MemoryCache.Key placeholderMemoryCacheKey22 = imageRequest2.getPlaceholderMemoryCacheKey();
                if (placeholderMemoryCacheKey22 != null) {
                }
                target = imageRequest2.getTarget();
                if (target != null) {
                }
                r3.onStart(imageRequest2);
                listener = imageRequest2.getListener();
                if (listener != null) {
                }
                SizeResolver sizeResolver22 = imageRequest2.getSizeResolver();
                r3.resolveSizeStart(imageRequest2, sizeResolver22);
                realImageLoader$execute$32.L$0 = requestDelegate;
                realImageLoader$execute$32.L$1 = imageRequest2;
                realImageLoader$execute$32.L$2 = r3;
                realImageLoader$execute$32.L$3 = image;
                realImageLoader$execute$32.label = 2;
                size = sizeResolver22.size(realImageLoader$execute$32);
                if (size != coroutine_suspended) {
                }
                return coroutine_suspended;
            } catch (Throwable th5) {
                th = th5;
                r4 = imageRequest2;
                r5 = requestDelegate;
                if (!(th instanceof CancellationException)) {
                    onCancel(r4, r3);
                    throw th;
                }
                ErrorResult ErrorResult = UtilsKt.ErrorResult(r4, th);
                onError(ErrorResult, r4.getTarget(), r3);
                return ErrorResult;
            }
            if (r3 != 0) {
            }
            requestDelegate = requestDelegate2;
            r3 = eventListener;
        } catch (Throwable th6) {
            th = th6;
        }
        realImageLoader$execute$3 = new RealImageLoader$execute$3(this, continuation);
        RealImageLoader$execute$3 realImageLoader$execute$322 = realImageLoader$execute$3;
        Object obj2 = realImageLoader$execute$322.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        r3 = realImageLoader$execute$322.label;
        r4 = 2;
        r5 = 1;
    }

    @Override // coil3.ImageLoader
    public void shutdown() {
        if (shutdown$volatile$FU.getAndSet(this, 1) == 1) {
            return;
        }
        CoroutineScopeKt.cancel$default(this.scope, null, 1, null);
        this.systemCallbacks.shutdown();
        MemoryCache memoryCache = getMemoryCache();
        if (memoryCache != null) {
            memoryCache.clear();
        }
    }

    @Override // coil3.ImageLoader
    public ImageLoader.Builder newBuilder() {
        return new ImageLoader.Builder(this.options);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0076, code lost:
    
        if (r8 != null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0059, code lost:
    
        if (r8 != null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x005b, code lost:
    
        r8.onSuccess(r7.getImage());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onSuccess(SuccessResult result, Target target, EventListener eventListener) {
        ImageRequest request = result.getRequest();
        DataSource dataSource = result.getDataSource();
        Logger logger = this.options.getLogger();
        if (logger != null) {
            Logger.Level level = Logger.Level.Info;
            if (logger.getMinLevel().compareTo(level) <= 0) {
                logger.log("RealImageLoader", level, UtilsKt.getEmoji(dataSource) + " Successful (" + dataSource.name() + ") - " + request.getData(), null);
            }
        }
        SuccessResult successResult = result;
        if (target instanceof TransitionTarget) {
            Transition create = ImageRequests_androidKt.getTransitionFactory(successResult.getRequest()).create((TransitionTarget) target, successResult);
            if (!(create instanceof NoneTransition)) {
                eventListener.transitionStart(successResult.getRequest(), create);
                create.transition();
                eventListener.transitionEnd(successResult.getRequest(), create);
            }
        }
        eventListener.onSuccess(request, result);
        ImageRequest.Listener listener = request.getListener();
        if (listener != null) {
            listener.onSuccess(request, result);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005c, code lost:
    
        if (r8 != null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x003f, code lost:
    
        if (r8 != null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0041, code lost:
    
        r8.onError(r7.getImage());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onError(ErrorResult result, Target target, EventListener eventListener) {
        ImageRequest request = result.getRequest();
        Logger logger = this.options.getLogger();
        if (logger != null) {
            Throwable throwable = result.getThrowable();
            if (logger.getMinLevel().compareTo(Logger.Level.Error) <= 0) {
                logger.log("RealImageLoader", Logger.Level.Error, "🚨 Failed - " + request.getData(), throwable);
            }
        }
        ErrorResult errorResult = result;
        if (target instanceof TransitionTarget) {
            Transition create = ImageRequests_androidKt.getTransitionFactory(errorResult.getRequest()).create((TransitionTarget) target, errorResult);
            if (!(create instanceof NoneTransition)) {
                eventListener.transitionStart(errorResult.getRequest(), create);
                create.transition();
                eventListener.transitionEnd(errorResult.getRequest(), create);
            }
        }
        eventListener.onError(request, result);
        ImageRequest.Listener listener = request.getListener();
        if (listener != null) {
            listener.onError(request, result);
        }
    }

    private final void onCancel(ImageRequest request, EventListener eventListener) {
        Logger logger = this.options.getLogger();
        if (logger != null) {
            Logger.Level level = Logger.Level.Info;
            if (logger.getMinLevel().compareTo(level) <= 0) {
                logger.log("RealImageLoader", level, "🏗 Cancelled - " + request.getData(), null);
            }
        }
        eventListener.onCancel(request);
        ImageRequest.Listener listener = request.getListener();
        if (listener != null) {
            listener.onCancel(request);
        }
    }

    /* compiled from: RealImageLoader.kt */
    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001Bc\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\b\u0012\u000e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\b\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010%\u001a\u00060\u0003j\u0002`\u0004HÆ\u0003¢\u0006\u0002\u0010\u0017J\t\u0010&\u001a\u00020\u0006HÆ\u0003J\u000f\u0010'\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J\u0011\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\bHÆ\u0003J\u0011\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\bHÆ\u0003J\t\u0010*\u001a\u00020\u000fHÆ\u0003J\t\u0010+\u001a\u00020\u0011HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0013HÆ\u0003Jz\u0010-\u001a\u00020\u00002\f\b\u0002\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0010\b\u0002\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\b2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÆ\u0001¢\u0006\u0002\u0010.J\u0014\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u00102\u001a\u000203HÖ\u0081\u0004J\n\u00104\u001a\u000205HÖ\u0081\u0004R\u0017\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0019\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001cR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$¨\u00066"}, d2 = {"Lcoil3/RealImageLoader$Options;", "", "application", "Landroid/content/Context;", "Lcoil3/PlatformContext;", "defaults", "Lcoil3/request/ImageRequest$Defaults;", "mainCoroutineContextLazy", "Lkotlin/Lazy;", "Lkotlin/coroutines/CoroutineContext;", "memoryCacheLazy", "Lcoil3/memory/MemoryCache;", "diskCacheLazy", "Lcoil3/disk/DiskCache;", "eventListenerFactory", "Lcoil3/EventListener$Factory;", "componentRegistry", "Lcoil3/ComponentRegistry;", "logger", "Lcoil3/util/Logger;", "<init>", "(Landroid/content/Context;Lcoil3/request/ImageRequest$Defaults;Lkotlin/Lazy;Lkotlin/Lazy;Lkotlin/Lazy;Lcoil3/EventListener$Factory;Lcoil3/ComponentRegistry;Lcoil3/util/Logger;)V", "getApplication", "()Landroid/content/Context;", "Landroid/content/Context;", "getDefaults", "()Lcoil3/request/ImageRequest$Defaults;", "getMainCoroutineContextLazy", "()Lkotlin/Lazy;", "getMemoryCacheLazy", "getDiskCacheLazy", "getEventListenerFactory", "()Lcoil3/EventListener$Factory;", "getComponentRegistry", "()Lcoil3/ComponentRegistry;", "getLogger", "()Lcoil3/util/Logger;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Landroid/content/Context;Lcoil3/request/ImageRequest$Defaults;Lkotlin/Lazy;Lkotlin/Lazy;Lkotlin/Lazy;Lcoil3/EventListener$Factory;Lcoil3/ComponentRegistry;Lcoil3/util/Logger;)Lcoil3/RealImageLoader$Options;", "equals", "", "other", "hashCode", "", "toString", "", "coil-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Options {
        private final Context application;
        private final ComponentRegistry componentRegistry;
        private final ImageRequest.Defaults defaults;
        private final Lazy<DiskCache> diskCacheLazy;
        private final EventListener.Factory eventListenerFactory;
        private final Logger logger;
        private final Lazy<CoroutineContext> mainCoroutineContextLazy;
        private final Lazy<MemoryCache> memoryCacheLazy;

        public static /* synthetic */ Options copy$default(Options options, Context context, ImageRequest.Defaults defaults, Lazy lazy, Lazy lazy2, Lazy lazy3, EventListener.Factory factory, ComponentRegistry componentRegistry, Logger logger, int i, Object obj) {
            if ((i & 1) != 0) {
                context = options.application;
            }
            if ((i & 2) != 0) {
                defaults = options.defaults;
            }
            if ((i & 4) != 0) {
                lazy = options.mainCoroutineContextLazy;
            }
            if ((i & 8) != 0) {
                lazy2 = options.memoryCacheLazy;
            }
            if ((i & 16) != 0) {
                lazy3 = options.diskCacheLazy;
            }
            if ((i & 32) != 0) {
                factory = options.eventListenerFactory;
            }
            if ((i & 64) != 0) {
                componentRegistry = options.componentRegistry;
            }
            if ((i & 128) != 0) {
                logger = options.logger;
            }
            ComponentRegistry componentRegistry2 = componentRegistry;
            Logger logger2 = logger;
            Lazy lazy4 = lazy3;
            EventListener.Factory factory2 = factory;
            return options.copy(context, defaults, lazy, lazy2, lazy4, factory2, componentRegistry2, logger2);
        }

        /* renamed from: component1, reason: from getter */
        public final Context getApplication() {
            return this.application;
        }

        /* renamed from: component2, reason: from getter */
        public final ImageRequest.Defaults getDefaults() {
            return this.defaults;
        }

        public final Lazy<CoroutineContext> component3() {
            return this.mainCoroutineContextLazy;
        }

        public final Lazy<MemoryCache> component4() {
            return this.memoryCacheLazy;
        }

        public final Lazy<DiskCache> component5() {
            return this.diskCacheLazy;
        }

        /* renamed from: component6, reason: from getter */
        public final EventListener.Factory getEventListenerFactory() {
            return this.eventListenerFactory;
        }

        /* renamed from: component7, reason: from getter */
        public final ComponentRegistry getComponentRegistry() {
            return this.componentRegistry;
        }

        /* renamed from: component8, reason: from getter */
        public final Logger getLogger() {
            return this.logger;
        }

        public final Options copy(Context application, ImageRequest.Defaults defaults, Lazy<? extends CoroutineContext> mainCoroutineContextLazy, Lazy<? extends MemoryCache> memoryCacheLazy, Lazy<? extends DiskCache> diskCacheLazy, EventListener.Factory eventListenerFactory, ComponentRegistry componentRegistry, Logger logger) {
            return new Options(application, defaults, mainCoroutineContextLazy, memoryCacheLazy, diskCacheLazy, eventListenerFactory, componentRegistry, logger);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Options)) {
                return false;
            }
            Options options = (Options) other;
            return Intrinsics.areEqual(this.application, options.application) && Intrinsics.areEqual(this.defaults, options.defaults) && Intrinsics.areEqual(this.mainCoroutineContextLazy, options.mainCoroutineContextLazy) && Intrinsics.areEqual(this.memoryCacheLazy, options.memoryCacheLazy) && Intrinsics.areEqual(this.diskCacheLazy, options.diskCacheLazy) && Intrinsics.areEqual(this.eventListenerFactory, options.eventListenerFactory) && Intrinsics.areEqual(this.componentRegistry, options.componentRegistry) && Intrinsics.areEqual(this.logger, options.logger);
        }

        public int hashCode() {
            int hashCode = ((((((((((((this.application.hashCode() * 31) + this.defaults.hashCode()) * 31) + this.mainCoroutineContextLazy.hashCode()) * 31) + this.memoryCacheLazy.hashCode()) * 31) + this.diskCacheLazy.hashCode()) * 31) + this.eventListenerFactory.hashCode()) * 31) + this.componentRegistry.hashCode()) * 31;
            Logger logger = this.logger;
            return hashCode + (logger == null ? 0 : logger.hashCode());
        }

        public String toString() {
            return "Options(application=" + this.application + ", defaults=" + this.defaults + ", mainCoroutineContextLazy=" + this.mainCoroutineContextLazy + ", memoryCacheLazy=" + this.memoryCacheLazy + ", diskCacheLazy=" + this.diskCacheLazy + ", eventListenerFactory=" + this.eventListenerFactory + ", componentRegistry=" + this.componentRegistry + ", logger=" + this.logger + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Options(Context context, ImageRequest.Defaults defaults, Lazy<? extends CoroutineContext> lazy, Lazy<? extends MemoryCache> lazy2, Lazy<? extends DiskCache> lazy3, EventListener.Factory factory, ComponentRegistry componentRegistry, Logger logger) {
            this.application = context;
            this.defaults = defaults;
            this.mainCoroutineContextLazy = lazy;
            this.memoryCacheLazy = lazy2;
            this.diskCacheLazy = lazy3;
            this.eventListenerFactory = factory;
            this.componentRegistry = componentRegistry;
            this.logger = logger;
        }

        public final Context getApplication() {
            return this.application;
        }

        public final ImageRequest.Defaults getDefaults() {
            return this.defaults;
        }

        public final Lazy<CoroutineContext> getMainCoroutineContextLazy() {
            return this.mainCoroutineContextLazy;
        }

        public final Lazy<MemoryCache> getMemoryCacheLazy() {
            return this.memoryCacheLazy;
        }

        public final Lazy<DiskCache> getDiskCacheLazy() {
            return this.diskCacheLazy;
        }

        public final EventListener.Factory getEventListenerFactory() {
            return this.eventListenerFactory;
        }

        public final ComponentRegistry getComponentRegistry() {
            return this.componentRegistry;
        }

        public final Logger getLogger() {
            return this.logger;
        }
    }
}
