package coil3;

import android.content.Context;
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
import com.caverock.androidsvg.SVGParser;
import expo.modules.interfaces.permissions.PermissionsResponse;
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
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0001;B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0016J\u0016\u0010'\u001a\u00020(2\u0006\u0010%\u001a\u00020&H\u0096@¢\u0006\u0002\u0010)J\u001e\u0010'\u001a\u00020(2\u0006\u0010*\u001a\u00020&2\u0006\u0010+\u001a\u00020,H\u0082@¢\u0006\u0002\u0010-J\b\u0010!\u001a\u00020.H\u0016J\b\u0010/\u001a\u000200H\u0016J\"\u00101\u001a\u00020.2\u0006\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u0001052\u0006\u00106\u001a\u000207H\u0002J\"\u00108\u001a\u00020.2\u0006\u00102\u001a\u0002092\b\u00104\u001a\u0004\u0018\u0001052\u0006\u00106\u001a\u000207H\u0002J\u0018\u0010:\u001a\u00020.2\u0006\u0010%\u001a\u00020&2\u0006\u00106\u001a\u000207H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0012\u001a\u0004\u0018\u00010\u00138VX\u0096\u0084\u0002¢\u0006\f\u001a\u0004\b\u0016\u0010\u0017*\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0018\u001a\u0004\u0018\u00010\u00198VX\u0096\u0084\u0002¢\u0006\f\u001a\u0004\b\u001b\u0010\u001c*\u0004\b\u001a\u0010\u0015R\u0014\u0010\u001d\u001a\u00020\u001eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\t\u0010!\u001a\u00020\"X\u0082\u0004¨\u0006<"}, d2 = {"Lcoil3/RealImageLoader;", "Lcoil3/ImageLoader;", "options", "Lcoil3/RealImageLoader$Options;", "<init>", "(Lcoil3/RealImageLoader$Options;)V", "getOptions", "()Lcoil3/RealImageLoader$Options;", PermissionsResponse.SCOPE_KEY, "Lkotlinx/coroutines/CoroutineScope;", "systemCallbacks", "Lcoil3/util/SystemCallbacks;", "requestService", "Lcoil3/request/RequestService;", "defaults", "Lcoil3/request/ImageRequest$Defaults;", "getDefaults", "()Lcoil3/request/ImageRequest$Defaults;", "memoryCache", "Lcoil3/memory/MemoryCache;", "getMemoryCache$delegate", "(Lcoil3/RealImageLoader;)Ljava/lang/Object;", "getMemoryCache", "()Lcoil3/memory/MemoryCache;", "diskCache", "Lcoil3/disk/DiskCache;", "getDiskCache$delegate", "getDiskCache", "()Lcoil3/disk/DiskCache;", "components", "Lcoil3/ComponentRegistry;", "getComponents", "()Lcoil3/ComponentRegistry;", "shutdown", "Lkotlinx/atomicfu/AtomicBoolean;", "enqueue", "Lcoil3/request/Disposable;", "request", "Lcoil3/request/ImageRequest;", "execute", "Lcoil3/request/ImageResult;", "(Lcoil3/request/ImageRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "initialRequest", SVGParser.XML_STYLESHEET_ATTR_TYPE, "", "(Lcoil3/request/ImageRequest;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "newBuilder", "Lcoil3/ImageLoader$Builder;", "onSuccess", "result", "Lcoil3/request/SuccessResult;", "target", "Lcoil3/target/Target;", "eventListener", "Lcoil3/EventListener;", "onError", "Lcoil3/request/ErrorResult;", "onCancel", "Options", "coil-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
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
        this.components = RealImageLoaderKt.addCommonComponents(RealImageLoader_nonNativeKt.addAppleComponents(RealImageLoader_jvmCommonKt.addJvmComponents(RealImageLoader_androidKt.addAndroidComponents(RealImageLoaderKt.addServiceLoaderComponents(options.getComponentRegistry().newBuilder(), options), options), options), options)).add(new EngineInterceptor(realImageLoader, SystemCallbacks, RequestService, options.getLogger())).build();
        this.shutdown$volatile = 0;
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
        async$default = BuildersKt__Builders_commonKt.async$default(this.scope, null, null, new RealImageLoader$enqueue$job$1(this, request, null), 3, null);
        return RealImageLoader_androidKt.getDisposable(request, async$default);
    }

    @Override // coil3.ImageLoader
    public Object execute(ImageRequest imageRequest, Continuation<? super ImageResult> continuation) {
        if (RealImageLoader_androidKt.needsExecuteOnMainDispatcher(imageRequest)) {
            return CoroutineScopeKt.coroutineScope(new RealImageLoader$execute$2(imageRequest, this, null), continuation);
        }
        return execute(imageRequest, 1, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(19:0|1|(2:3|(15:5|6|(1:(4:(1:(7:11|12|13|14|(1:16)(2:20|(1:22)(2:23|24))|17|18)(2:37|38))(13:39|40|41|42|43|44|45|46|47|48|49|(5:52|14|(0)(0)|17|18)|51)|26|27|(3:29|30|31)(2:32|33))(3:62|63|64))(6:94|(1:96)(1:111)|97|98|99|(2:101|(3:103|(1:105)|51)(11:106|66|67|(1:87)(1:73)|74|(2:(1:77)(1:79)|78)|80|(1:82)|83|(9:85|43|44|45|46|47|48|49|(0))|51))(2:107|108))|65|66|67|(1:69)|87|74|(0)|80|(0)|83|(0)|51))|112|6|(0)(0)|65|66|67|(0)|87|74|(0)|80|(0)|83|(0)|51|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01a3, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01a4, code lost:
    
        r6 = r2;
        r4 = r5;
        r5 = r9;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0176 A[Catch: all -> 0x004c, TryCatch #5 {all -> 0x004c, blocks: (B:13:0x0047, B:14:0x0170, B:16:0x0176, B:20:0x0181, B:22:0x0185, B:23:0x0193, B:24:0x0198), top: B:12:0x0047 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0181 A[Catch: all -> 0x004c, TryCatch #5 {all -> 0x004c, blocks: (B:13:0x0047, B:14:0x0170, B:16:0x0176, B:20:0x0181, B:22:0x0185, B:23:0x0193, B:24:0x0198), top: B:12:0x0047 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01b7 A[Catch: all -> 0x01ca, TRY_LEAVE, TryCatch #4 {all -> 0x01ca, blocks: (B:27:0x01b3, B:29:0x01b7, B:32:0x01c6, B:33:0x01c9), top: B:26:0x01b3 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01c6 A[Catch: all -> 0x01ca, TRY_ENTER, TryCatch #4 {all -> 0x01ca, blocks: (B:27:0x01b3, B:29:0x01b7, B:32:0x01c6, B:33:0x01c9), top: B:26:0x01b3 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00f5 A[Catch: all -> 0x01a3, TryCatch #0 {all -> 0x01a3, blocks: (B:67:0x00ef, B:69:0x00f5, B:71:0x00fb, B:73:0x0101, B:74:0x0107, B:77:0x010f, B:78:0x0115, B:80:0x0118, B:82:0x0121, B:83:0x0124), top: B:66:0x00ef }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0121 A[Catch: all -> 0x01a3, TryCatch #0 {all -> 0x01a3, blocks: (B:67:0x00ef, B:69:0x00f5, B:71:0x00fb, B:73:0x0101, B:74:0x0107, B:77:0x010f, B:78:0x0115, B:80:0x0118, B:82:0x0121, B:83:0x0124), top: B:66:0x00ef }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object execute(ImageRequest imageRequest, int i, Continuation<? super ImageResult> continuation) {
        RealImageLoader$execute$3 realImageLoader$execute$3;
        Object coroutine_suspended;
        int i2;
        RequestDelegate requestDelegate;
        ImageRequest updateRequest;
        RealImageLoader realImageLoader;
        RequestDelegate requestDelegate2;
        EventListener eventListener;
        RealImageLoader realImageLoader2;
        ImageRequest imageRequest2;
        EventListener eventListener2;
        RequestDelegate requestDelegate3;
        Image image;
        Target target;
        ImageRequest.Listener listener;
        Object size;
        ImageRequest imageRequest3;
        RealImageLoader realImageLoader3;
        RequestDelegate requestDelegate4;
        MemoryCache memoryCache;
        MemoryCache.Value value;
        EventListener eventListener3;
        ImageResult imageResult;
        if (continuation instanceof RealImageLoader$execute$3) {
            realImageLoader$execute$3 = (RealImageLoader$execute$3) continuation;
            if ((realImageLoader$execute$3.label & Integer.MIN_VALUE) != 0) {
                realImageLoader$execute$3.label -= Integer.MIN_VALUE;
                Object obj = realImageLoader$execute$3.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = realImageLoader$execute$3.label;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    requestDelegate = this.requestService.requestDelegate(imageRequest, JobKt.getJob(realImageLoader$execute$3.getContext()), i == 0);
                    requestDelegate.assertActive();
                    updateRequest = this.requestService.updateRequest(imageRequest);
                    EventListener create = this.options.getEventListenerFactory().create(updateRequest);
                    try {
                        if (Intrinsics.areEqual(updateRequest.getData(), NullRequestData.INSTANCE)) {
                            throw new NullRequestDataException();
                        }
                        requestDelegate.start();
                        if (i == 0) {
                            realImageLoader$execute$3.L$0 = this;
                            realImageLoader$execute$3.L$1 = requestDelegate;
                            realImageLoader$execute$3.L$2 = updateRequest;
                            realImageLoader$execute$3.L$3 = create;
                            realImageLoader$execute$3.label = 1;
                            if (requestDelegate.awaitStarted(realImageLoader$execute$3) != coroutine_suspended) {
                                realImageLoader2 = this;
                                imageRequest2 = updateRequest;
                                eventListener2 = create;
                                requestDelegate3 = requestDelegate;
                            }
                            return coroutine_suspended;
                        }
                        realImageLoader2 = this;
                        imageRequest2 = updateRequest;
                        eventListener2 = create;
                        MemoryCache.Key placeholderMemoryCacheKey = imageRequest2.getPlaceholderMemoryCacheKey();
                        image = (placeholderMemoryCacheKey != null || (memoryCache = realImageLoader2.getMemoryCache()) == null || (value = memoryCache.get(placeholderMemoryCacheKey)) == null) ? null : value.getImage();
                        target = imageRequest2.getTarget();
                        if (target != null) {
                            target.onStart(image == null ? imageRequest2.placeholder() : image);
                        }
                        eventListener2.onStart(imageRequest2);
                        listener = imageRequest2.getListener();
                        if (listener != null) {
                            listener.onStart(imageRequest2);
                        }
                        SizeResolver sizeResolver = imageRequest2.getSizeResolver();
                        eventListener2.resolveSizeStart(imageRequest2, sizeResolver);
                        realImageLoader$execute$3.L$0 = realImageLoader2;
                        realImageLoader$execute$3.L$1 = requestDelegate;
                        realImageLoader$execute$3.L$2 = imageRequest2;
                        realImageLoader$execute$3.L$3 = eventListener2;
                        realImageLoader$execute$3.L$4 = image;
                        realImageLoader$execute$3.label = 2;
                        size = sizeResolver.size(realImageLoader$execute$3);
                        if (size != coroutine_suspended) {
                            imageRequest3 = imageRequest2;
                            realImageLoader3 = realImageLoader2;
                            requestDelegate4 = requestDelegate;
                            obj = size;
                            Image image2 = image;
                            Size size2 = (Size) obj;
                            eventListener2.resolveSizeEnd(imageRequest3, size2);
                            CoroutineContext interceptorCoroutineContext = imageRequest3.getInterceptorCoroutineContext();
                            eventListener3 = eventListener2;
                            RealImageLoader$execute$result$1 realImageLoader$execute$result$1 = new RealImageLoader$execute$result$1(imageRequest3, realImageLoader3, size2, eventListener3, image2, null);
                            realImageLoader$execute$3.L$0 = realImageLoader3;
                            realImageLoader$execute$3.L$1 = requestDelegate4;
                            realImageLoader$execute$3.L$2 = imageRequest3;
                            realImageLoader$execute$3.L$3 = eventListener2;
                            realImageLoader$execute$3.L$4 = null;
                            realImageLoader$execute$3.label = 3;
                            obj = BuildersKt.withContext(interceptorCoroutineContext, realImageLoader$execute$result$1, realImageLoader$execute$3);
                            if (obj != coroutine_suspended) {
                            }
                        }
                        return coroutine_suspended;
                    } catch (Throwable th) {
                        th = th;
                        realImageLoader = this;
                        requestDelegate2 = requestDelegate;
                        eventListener = create;
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            image = (Image) realImageLoader$execute$3.L$4;
                            eventListener2 = (EventListener) realImageLoader$execute$3.L$3;
                            ImageRequest imageRequest4 = (ImageRequest) realImageLoader$execute$3.L$2;
                            requestDelegate4 = (RequestDelegate) realImageLoader$execute$3.L$1;
                            RealImageLoader realImageLoader4 = (RealImageLoader) realImageLoader$execute$3.L$0;
                            try {
                                ResultKt.throwOnFailure(obj);
                                imageRequest3 = imageRequest4;
                                realImageLoader3 = realImageLoader4;
                                Image image22 = image;
                                try {
                                    Size size22 = (Size) obj;
                                    eventListener2.resolveSizeEnd(imageRequest3, size22);
                                    CoroutineContext interceptorCoroutineContext2 = imageRequest3.getInterceptorCoroutineContext();
                                    eventListener3 = eventListener2;
                                    try {
                                        RealImageLoader$execute$result$1 realImageLoader$execute$result$12 = new RealImageLoader$execute$result$1(imageRequest3, realImageLoader3, size22, eventListener3, image22, null);
                                        realImageLoader$execute$3.L$0 = realImageLoader3;
                                        realImageLoader$execute$3.L$1 = requestDelegate4;
                                        realImageLoader$execute$3.L$2 = imageRequest3;
                                        realImageLoader$execute$3.L$3 = eventListener2;
                                        realImageLoader$execute$3.L$4 = null;
                                        realImageLoader$execute$3.label = 3;
                                        obj = BuildersKt.withContext(interceptorCoroutineContext2, realImageLoader$execute$result$12, realImageLoader$execute$3);
                                        if (obj != coroutine_suspended) {
                                            eventListener = eventListener2;
                                            requestDelegate2 = requestDelegate4;
                                            updateRequest = imageRequest3;
                                            realImageLoader = realImageLoader3;
                                            imageResult = (ImageResult) obj;
                                            if (!(imageResult instanceof SuccessResult)) {
                                            }
                                            return imageResult;
                                        }
                                        return coroutine_suspended;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        eventListener2 = eventListener3;
                                        eventListener = eventListener2;
                                        requestDelegate2 = requestDelegate4;
                                        updateRequest = imageRequest3;
                                        realImageLoader = realImageLoader3;
                                        if (!(th instanceof CancellationException)) {
                                        }
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                eventListener = eventListener2;
                                updateRequest = imageRequest4;
                                requestDelegate2 = requestDelegate4;
                                realImageLoader = realImageLoader4;
                            }
                        } else {
                            if (i2 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            eventListener = (EventListener) realImageLoader$execute$3.L$3;
                            updateRequest = (ImageRequest) realImageLoader$execute$3.L$2;
                            requestDelegate2 = (RequestDelegate) realImageLoader$execute$3.L$1;
                            realImageLoader = (RealImageLoader) realImageLoader$execute$3.L$0;
                            try {
                                ResultKt.throwOnFailure(obj);
                                imageResult = (ImageResult) obj;
                                if (!(imageResult instanceof SuccessResult)) {
                                    realImageLoader.onSuccess((SuccessResult) imageResult, updateRequest.getTarget(), eventListener);
                                } else {
                                    if (!(imageResult instanceof ErrorResult)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    realImageLoader.onError((ErrorResult) imageResult, updateRequest.getTarget(), eventListener);
                                }
                                return imageResult;
                            } catch (Throwable th5) {
                                th = th5;
                            }
                        }
                        try {
                            if (!(th instanceof CancellationException)) {
                                realImageLoader.onCancel(updateRequest, eventListener);
                                throw th;
                            }
                            ErrorResult ErrorResult = UtilsKt.ErrorResult(updateRequest, th);
                            realImageLoader.onError(ErrorResult, updateRequest.getTarget(), eventListener);
                            return ErrorResult;
                        } finally {
                            requestDelegate2.complete();
                        }
                    }
                    eventListener2 = (EventListener) realImageLoader$execute$3.L$3;
                    imageRequest2 = (ImageRequest) realImageLoader$execute$3.L$2;
                    requestDelegate3 = (RequestDelegate) realImageLoader$execute$3.L$1;
                    realImageLoader2 = (RealImageLoader) realImageLoader$execute$3.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (Throwable th6) {
                        th = th6;
                        eventListener = eventListener2;
                        updateRequest = imageRequest2;
                        requestDelegate2 = requestDelegate3;
                        realImageLoader = realImageLoader2;
                        if (!(th instanceof CancellationException)) {
                        }
                    }
                }
                requestDelegate = requestDelegate3;
                MemoryCache.Key placeholderMemoryCacheKey2 = imageRequest2.getPlaceholderMemoryCacheKey();
                if (placeholderMemoryCacheKey2 != null) {
                }
                target = imageRequest2.getTarget();
                if (target != null) {
                }
                eventListener2.onStart(imageRequest2);
                listener = imageRequest2.getListener();
                if (listener != null) {
                }
                SizeResolver sizeResolver2 = imageRequest2.getSizeResolver();
                eventListener2.resolveSizeStart(imageRequest2, sizeResolver2);
                realImageLoader$execute$3.L$0 = realImageLoader2;
                realImageLoader$execute$3.L$1 = requestDelegate;
                realImageLoader$execute$3.L$2 = imageRequest2;
                realImageLoader$execute$3.L$3 = eventListener2;
                realImageLoader$execute$3.L$4 = image;
                realImageLoader$execute$3.label = 2;
                size = sizeResolver2.size(realImageLoader$execute$3);
                if (size != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
        }
        realImageLoader$execute$3 = new RealImageLoader$execute$3(this, continuation);
        Object obj2 = realImageLoader$execute$3.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = realImageLoader$execute$3.label;
        if (i2 != 0) {
        }
        requestDelegate = requestDelegate3;
        MemoryCache.Key placeholderMemoryCacheKey22 = imageRequest2.getPlaceholderMemoryCacheKey();
        if (placeholderMemoryCacheKey22 != null) {
        }
        target = imageRequest2.getTarget();
        if (target != null) {
        }
        eventListener2.onStart(imageRequest2);
        listener = imageRequest2.getListener();
        if (listener != null) {
        }
        SizeResolver sizeResolver22 = imageRequest2.getSizeResolver();
        eventListener2.resolveSizeStart(imageRequest2, sizeResolver22);
        realImageLoader$execute$3.L$0 = realImageLoader2;
        realImageLoader$execute$3.L$1 = requestDelegate;
        realImageLoader$execute$3.L$2 = imageRequest2;
        realImageLoader$execute$3.L$3 = eventListener2;
        realImageLoader$execute$3.L$4 = image;
        realImageLoader$execute$3.label = 2;
        size = sizeResolver22.size(realImageLoader$execute$3);
        if (size != coroutine_suspended) {
        }
        return coroutine_suspended;
    }

    @Override // coil3.ImageLoader
    public void shutdown() {
        if (shutdown$volatile$FU.getAndSet(this, 1) != 0) {
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

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0056, code lost:
    
        if (r8 != null) goto L13;
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
        if (target instanceof TransitionTarget) {
            SuccessResult successResult = result;
            Transition create = ImageRequests_androidKt.getTransitionFactory(successResult.getRequest()).create((TransitionTarget) target, successResult);
            if (!(create instanceof NoneTransition)) {
                eventListener.transitionStart(successResult.getRequest(), create);
                create.transition();
                eventListener.transitionEnd(successResult.getRequest(), create);
            }
            target.onSuccess(result.getImage());
        }
        eventListener.onSuccess(request, result);
        ImageRequest.Listener listener = request.getListener();
        if (listener != null) {
            listener.onSuccess(request, result);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x003d, code lost:
    
        if (r8 != null) goto L13;
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
        if (target instanceof TransitionTarget) {
            ErrorResult errorResult = result;
            Transition create = ImageRequests_androidKt.getTransitionFactory(errorResult.getRequest()).create((TransitionTarget) target, errorResult);
            if (!(create instanceof NoneTransition)) {
                eventListener.transitionStart(errorResult.getRequest(), create);
                create.transition();
                eventListener.transitionEnd(errorResult.getRequest(), create);
            }
            target.onError(result.getImage());
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
    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BU\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b\u0012\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\"\u001a\u00060\u0003j\u0002`\u0004HÆ\u0003¢\u0006\u0002\u0010\u0015J\t\u0010#\u001a\u00020\u0006HÆ\u0003J\u0011\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\bHÆ\u0003J\u0011\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\bHÆ\u0003J\t\u0010&\u001a\u00020\rHÆ\u0003J\t\u0010'\u001a\u00020\u000fHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0011HÆ\u0003Jj\u0010)\u001a\u00020\u00002\f\b\u0002\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\u0010\b\u0002\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÆ\u0001¢\u0006\u0002\u0010*J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010.\u001a\u00020/HÖ\u0001J\t\u00100\u001a\u000201HÖ\u0001R\u0017\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b \u0010!¨\u00062"}, d2 = {"Lcoil3/RealImageLoader$Options;", "", "application", "Landroid/content/Context;", "Lcoil3/PlatformContext;", "defaults", "Lcoil3/request/ImageRequest$Defaults;", "memoryCacheLazy", "Lkotlin/Lazy;", "Lcoil3/memory/MemoryCache;", "diskCacheLazy", "Lcoil3/disk/DiskCache;", "eventListenerFactory", "Lcoil3/EventListener$Factory;", "componentRegistry", "Lcoil3/ComponentRegistry;", "logger", "Lcoil3/util/Logger;", "<init>", "(Landroid/content/Context;Lcoil3/request/ImageRequest$Defaults;Lkotlin/Lazy;Lkotlin/Lazy;Lcoil3/EventListener$Factory;Lcoil3/ComponentRegistry;Lcoil3/util/Logger;)V", "getApplication", "()Landroid/content/Context;", "Landroid/content/Context;", "getDefaults", "()Lcoil3/request/ImageRequest$Defaults;", "getMemoryCacheLazy", "()Lkotlin/Lazy;", "getDiskCacheLazy", "getEventListenerFactory", "()Lcoil3/EventListener$Factory;", "getComponentRegistry", "()Lcoil3/ComponentRegistry;", "getLogger", "()Lcoil3/util/Logger;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Landroid/content/Context;Lcoil3/request/ImageRequest$Defaults;Lkotlin/Lazy;Lkotlin/Lazy;Lcoil3/EventListener$Factory;Lcoil3/ComponentRegistry;Lcoil3/util/Logger;)Lcoil3/RealImageLoader$Options;", "equals", "", "other", "hashCode", "", "toString", "", "coil-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Options {
        private final Context application;
        private final ComponentRegistry componentRegistry;
        private final ImageRequest.Defaults defaults;
        private final Lazy<DiskCache> diskCacheLazy;
        private final EventListener.Factory eventListenerFactory;
        private final Logger logger;
        private final Lazy<MemoryCache> memoryCacheLazy;

        public static /* synthetic */ Options copy$default(Options options, Context context, ImageRequest.Defaults defaults, Lazy lazy, Lazy lazy2, EventListener.Factory factory, ComponentRegistry componentRegistry, Logger logger, int i, Object obj) {
            if ((i & 1) != 0) {
                context = options.application;
            }
            if ((i & 2) != 0) {
                defaults = options.defaults;
            }
            if ((i & 4) != 0) {
                lazy = options.memoryCacheLazy;
            }
            if ((i & 8) != 0) {
                lazy2 = options.diskCacheLazy;
            }
            if ((i & 16) != 0) {
                factory = options.eventListenerFactory;
            }
            if ((i & 32) != 0) {
                componentRegistry = options.componentRegistry;
            }
            if ((i & 64) != 0) {
                logger = options.logger;
            }
            ComponentRegistry componentRegistry2 = componentRegistry;
            Logger logger2 = logger;
            EventListener.Factory factory2 = factory;
            Lazy lazy3 = lazy;
            return options.copy(context, defaults, lazy3, lazy2, factory2, componentRegistry2, logger2);
        }

        /* renamed from: component1, reason: from getter */
        public final Context getApplication() {
            return this.application;
        }

        /* renamed from: component2, reason: from getter */
        public final ImageRequest.Defaults getDefaults() {
            return this.defaults;
        }

        public final Lazy<MemoryCache> component3() {
            return this.memoryCacheLazy;
        }

        public final Lazy<DiskCache> component4() {
            return this.diskCacheLazy;
        }

        /* renamed from: component5, reason: from getter */
        public final EventListener.Factory getEventListenerFactory() {
            return this.eventListenerFactory;
        }

        /* renamed from: component6, reason: from getter */
        public final ComponentRegistry getComponentRegistry() {
            return this.componentRegistry;
        }

        /* renamed from: component7, reason: from getter */
        public final Logger getLogger() {
            return this.logger;
        }

        public final Options copy(Context application, ImageRequest.Defaults defaults, Lazy<? extends MemoryCache> memoryCacheLazy, Lazy<? extends DiskCache> diskCacheLazy, EventListener.Factory eventListenerFactory, ComponentRegistry componentRegistry, Logger logger) {
            return new Options(application, defaults, memoryCacheLazy, diskCacheLazy, eventListenerFactory, componentRegistry, logger);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Options)) {
                return false;
            }
            Options options = (Options) other;
            return Intrinsics.areEqual(this.application, options.application) && Intrinsics.areEqual(this.defaults, options.defaults) && Intrinsics.areEqual(this.memoryCacheLazy, options.memoryCacheLazy) && Intrinsics.areEqual(this.diskCacheLazy, options.diskCacheLazy) && Intrinsics.areEqual(this.eventListenerFactory, options.eventListenerFactory) && Intrinsics.areEqual(this.componentRegistry, options.componentRegistry) && Intrinsics.areEqual(this.logger, options.logger);
        }

        public int hashCode() {
            int hashCode = ((((((((((this.application.hashCode() * 31) + this.defaults.hashCode()) * 31) + this.memoryCacheLazy.hashCode()) * 31) + this.diskCacheLazy.hashCode()) * 31) + this.eventListenerFactory.hashCode()) * 31) + this.componentRegistry.hashCode()) * 31;
            Logger logger = this.logger;
            return hashCode + (logger == null ? 0 : logger.hashCode());
        }

        public String toString() {
            return "Options(application=" + this.application + ", defaults=" + this.defaults + ", memoryCacheLazy=" + this.memoryCacheLazy + ", diskCacheLazy=" + this.diskCacheLazy + ", eventListenerFactory=" + this.eventListenerFactory + ", componentRegistry=" + this.componentRegistry + ", logger=" + this.logger + ')';
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Options(Context context, ImageRequest.Defaults defaults, Lazy<? extends MemoryCache> lazy, Lazy<? extends DiskCache> lazy2, EventListener.Factory factory, ComponentRegistry componentRegistry, Logger logger) {
            this.application = context;
            this.defaults = defaults;
            this.memoryCacheLazy = lazy;
            this.diskCacheLazy = lazy2;
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
