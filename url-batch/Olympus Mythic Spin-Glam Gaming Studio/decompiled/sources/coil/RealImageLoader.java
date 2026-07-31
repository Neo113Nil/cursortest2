package coil;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.lifecycle.Lifecycle;
import coil.EventListener;
import coil.decode.BitmapFactoryDecoder;
import coil.fetch.AssetUriFetcher;
import coil.fetch.BitmapFetcher;
import coil.fetch.ByteBufferFetcher;
import coil.fetch.ContentUriFetcher;
import coil.fetch.DrawableFetcher;
import coil.fetch.FileFetcher;
import coil.fetch.HttpUriFetcher;
import coil.fetch.ResourceUriFetcher;
import coil.intercept.EngineInterceptor;
import coil.key.FileKeyer;
import coil.key.UriKeyer;
import coil.map.ByteArrayMapper;
import coil.map.FileUriMapper;
import coil.map.HttpUrlMapper;
import coil.map.ResourceIntMapper;
import coil.map.ResourceUriMapper;
import coil.map.StringMapper;
import coil.memory.MemoryCache;
import coil.request.DefaultRequestOptions;
import coil.request.Disposable;
import coil.request.ErrorResult;
import coil.request.ImageRequest;
import coil.request.ImageResult;
import coil.request.NullRequestData;
import coil.request.NullRequestDataException;
import coil.request.OneShotDisposable;
import coil.request.RequestDelegate;
import coil.request.RequestService;
import coil.request.SuccessResult;
import coil.size.Size;
import coil.size.SizeResolver;
import coil.target.Target;
import coil.target.ViewTarget;
import coil.transition.NoneTransition;
import coil.transition.Transition;
import coil.transition.TransitionTarget;
import coil.util.ImageLoaderOptions;
import coil.util.Lifecycles;
import coil.util.Logger;
import coil.util.SystemCallbacks;
import coil.util.Utils;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.SupervisorKt;
import okhttp3.HttpUrl;

/* compiled from: RealImageLoader.kt */
/* loaded from: classes11.dex */
public final class RealImageLoader implements ImageLoader {
    public static final Companion Companion = new Companion(null);
    private final Lazy callFactoryLazy;
    private final ComponentRegistry componentRegistry;
    private final ComponentRegistry components;
    private final Context context;
    private final DefaultRequestOptions defaults;
    private final Lazy diskCache$delegate;
    private final Lazy diskCacheLazy;
    private final EventListener.Factory eventListenerFactory;
    private final List interceptors;
    private final AtomicBoolean isShutdown;
    private final Lazy memoryCache$delegate;
    private final Lazy memoryCacheLazy;
    private final ImageLoaderOptions options;
    private final RequestService requestService;
    private final CoroutineScope scope = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default(null, 1, null).plus(Dispatchers.getMain().getImmediate()).plus(new RealImageLoader$special$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.Key, this)));
    private final SystemCallbacks systemCallbacks;

    public final Logger getLogger() {
        return null;
    }

    public RealImageLoader(Context context, DefaultRequestOptions defaultRequestOptions, Lazy lazy, Lazy lazy2, Lazy lazy3, EventListener.Factory factory, ComponentRegistry componentRegistry, ImageLoaderOptions imageLoaderOptions, Logger logger) {
        this.context = context;
        this.defaults = defaultRequestOptions;
        this.memoryCacheLazy = lazy;
        this.diskCacheLazy = lazy2;
        this.callFactoryLazy = lazy3;
        this.eventListenerFactory = factory;
        this.componentRegistry = componentRegistry;
        this.options = imageLoaderOptions;
        SystemCallbacks systemCallbacks = new SystemCallbacks(this, context, imageLoaderOptions.getNetworkObserverEnabled());
        this.systemCallbacks = systemCallbacks;
        RequestService requestService = new RequestService(this, systemCallbacks, null);
        this.requestService = requestService;
        this.memoryCache$delegate = lazy;
        this.diskCache$delegate = lazy2;
        this.components = componentRegistry.newBuilder().add(new HttpUrlMapper(), HttpUrl.class).add(new StringMapper(), String.class).add(new FileUriMapper(), Uri.class).add(new ResourceUriMapper(), Uri.class).add(new ResourceIntMapper(), Integer.class).add(new ByteArrayMapper(), byte[].class).add(new UriKeyer(), Uri.class).add(new FileKeyer(imageLoaderOptions.getAddLastModifiedToFileCacheKey()), File.class).add(new HttpUriFetcher.Factory(lazy3, lazy2, imageLoaderOptions.getRespectCacheHeaders()), Uri.class).add(new FileFetcher.Factory(), File.class).add(new AssetUriFetcher.Factory(), Uri.class).add(new ContentUriFetcher.Factory(), Uri.class).add(new ResourceUriFetcher.Factory(), Uri.class).add(new DrawableFetcher.Factory(), Drawable.class).add(new BitmapFetcher.Factory(), Bitmap.class).add(new ByteBufferFetcher.Factory(), ByteBuffer.class).add(new BitmapFactoryDecoder.Factory(imageLoaderOptions.getBitmapFactoryMaxParallelism(), imageLoaderOptions.getBitmapFactoryExifOrientationPolicy())).build();
        this.interceptors = CollectionsKt.plus(getComponents().getInterceptors(), new EngineInterceptor(this, requestService, null));
        this.isShutdown = new AtomicBoolean(false);
        systemCallbacks.register();
    }

    @Override // coil.ImageLoader
    public DefaultRequestOptions getDefaults() {
        return this.defaults;
    }

    @Override // coil.ImageLoader
    public MemoryCache getMemoryCache() {
        return (MemoryCache) this.memoryCache$delegate.getValue();
    }

    @Override // coil.ImageLoader
    public ComponentRegistry getComponents() {
        return this.components;
    }

    @Override // coil.ImageLoader
    public Disposable enqueue(ImageRequest imageRequest) {
        Deferred async$default;
        async$default = BuildersKt__Builders_commonKt.async$default(this.scope, null, null, new RealImageLoader$enqueue$job$1(this, imageRequest, null), 3, null);
        if (imageRequest.getTarget() instanceof ViewTarget) {
            return Utils.getRequestManager(((ViewTarget) imageRequest.getTarget()).getView()).getDisposable(async$default);
        }
        return new OneShotDisposable(async$default);
    }

    @Override // coil.ImageLoader
    public Object execute(ImageRequest imageRequest, Continuation continuation) {
        return CoroutineScopeKt.coroutineScope(new RealImageLoader$execute$2(imageRequest, this, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0194 A[Catch: all -> 0x004b, TryCatch #3 {all -> 0x004b, blocks: (B:13:0x0046, B:14:0x018e, B:16:0x0194, B:20:0x019f, B:22:0x01a3), top: B:12:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x019f A[Catch: all -> 0x004b, TryCatch #3 {all -> 0x004b, blocks: (B:13:0x0046, B:14:0x018e, B:16:0x0194, B:20:0x019f, B:22:0x01a3), top: B:12:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01bb A[Catch: all -> 0x01cc, TRY_LEAVE, TryCatch #4 {all -> 0x01cc, blocks: (B:25:0x01b7, B:27:0x01bb, B:30:0x01ce, B:31:0x01d1), top: B:24:0x01b7 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01ce A[Catch: all -> 0x01cc, TRY_ENTER, TryCatch #4 {all -> 0x01cc, blocks: (B:25:0x01b7, B:27:0x01bb, B:30:0x01ce, B:31:0x01d1), top: B:24:0x01b7 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0189 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00fc A[Catch: all -> 0x0107, TryCatch #2 {all -> 0x0107, blocks: (B:53:0x00f6, B:55:0x00fc, B:57:0x0102, B:59:0x010f, B:61:0x0117, B:62:0x0129, B:64:0x012f, B:65:0x0132, B:67:0x013b, B:68:0x013e, B:73:0x0125), top: B:52:0x00f6 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0117 A[Catch: all -> 0x0107, TryCatch #2 {all -> 0x0107, blocks: (B:53:0x00f6, B:55:0x00fc, B:57:0x0102, B:59:0x010f, B:61:0x0117, B:62:0x0129, B:64:0x012f, B:65:0x0132, B:67:0x013b, B:68:0x013e, B:73:0x0125), top: B:52:0x00f6 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x012f A[Catch: all -> 0x0107, TryCatch #2 {all -> 0x0107, blocks: (B:53:0x00f6, B:55:0x00fc, B:57:0x0102, B:59:0x010f, B:61:0x0117, B:62:0x0129, B:64:0x012f, B:65:0x0132, B:67:0x013b, B:68:0x013e, B:73:0x0125), top: B:52:0x00f6 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x013b A[Catch: all -> 0x0107, TryCatch #2 {all -> 0x0107, blocks: (B:53:0x00f6, B:55:0x00fc, B:57:0x0102, B:59:0x010f, B:61:0x0117, B:62:0x0129, B:64:0x012f, B:65:0x0132, B:67:0x013b, B:68:0x013e, B:73:0x0125), top: B:52:0x00f6 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0157 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0125 A[Catch: all -> 0x0107, TryCatch #2 {all -> 0x0107, blocks: (B:53:0x00f6, B:55:0x00fc, B:57:0x0102, B:59:0x010f, B:61:0x0117, B:62:0x0129, B:64:0x012f, B:65:0x0132, B:67:0x013b, B:68:0x013e, B:73:0x0125), top: B:52:0x00f6 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object executeMain(ImageRequest imageRequest, int i, Continuation continuation) {
        RealImageLoader$executeMain$1 realImageLoader$executeMain$1;
        Object coroutine_suspended;
        int i2;
        RequestDelegate requestDelegate;
        ImageRequest build;
        RealImageLoader realImageLoader;
        RequestDelegate requestDelegate2;
        EventListener eventListener;
        RealImageLoader realImageLoader2;
        ImageRequest imageRequest2;
        EventListener eventListener2;
        RequestDelegate requestDelegate3;
        MemoryCache memoryCache;
        Bitmap bitmap;
        Target target;
        ImageRequest.Listener listener;
        Object size;
        Bitmap bitmap2;
        RealImageLoader realImageLoader3;
        RequestDelegate requestDelegate4;
        Object obj;
        ImageRequest imageRequest3;
        Object withContext;
        Object obj2;
        ImageResult imageResult;
        try {
            if (continuation instanceof RealImageLoader$executeMain$1) {
                realImageLoader$executeMain$1 = (RealImageLoader$executeMain$1) continuation;
                int i3 = realImageLoader$executeMain$1.label;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    realImageLoader$executeMain$1.label = i3 - Integer.MIN_VALUE;
                    Object obj3 = realImageLoader$executeMain$1.result;
                    coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i2 = realImageLoader$executeMain$1.label;
                    if (i2 != 0) {
                        ResultKt.throwOnFailure(obj3);
                        requestDelegate = this.requestService.requestDelegate(imageRequest, JobKt.getJob(realImageLoader$executeMain$1.getContext()));
                        requestDelegate.assertActive();
                        build = ImageRequest.newBuilder$default(imageRequest, null, 1, null).defaults(getDefaults()).build();
                        EventListener create = this.eventListenerFactory.create(build);
                        try {
                            if (Intrinsics.areEqual(build.getData(), NullRequestData.INSTANCE)) {
                                throw new NullRequestDataException();
                            }
                            requestDelegate.start();
                            if (i == 0) {
                                Lifecycle lifecycle = build.getLifecycle();
                                realImageLoader$executeMain$1.L$0 = this;
                                realImageLoader$executeMain$1.L$1 = requestDelegate;
                                realImageLoader$executeMain$1.L$2 = build;
                                realImageLoader$executeMain$1.L$3 = create;
                                realImageLoader$executeMain$1.label = 1;
                                if (Lifecycles.awaitStarted(lifecycle, realImageLoader$executeMain$1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                realImageLoader2 = this;
                                imageRequest2 = build;
                                eventListener2 = create;
                                requestDelegate3 = requestDelegate;
                            } else {
                                realImageLoader2 = this;
                                imageRequest2 = build;
                                eventListener2 = create;
                                memoryCache = realImageLoader2.getMemoryCache();
                                if (memoryCache != null) {
                                    MemoryCache.Key placeholderMemoryCacheKey = imageRequest2.getPlaceholderMemoryCacheKey();
                                    MemoryCache.Value value = placeholderMemoryCacheKey != null ? memoryCache.get(placeholderMemoryCacheKey) : null;
                                    if (value != null) {
                                        bitmap = value.getBitmap();
                                        Drawable bitmapDrawable = bitmap == null ? new BitmapDrawable(imageRequest2.getContext().getResources(), bitmap) : imageRequest2.getPlaceholder();
                                        target = imageRequest2.getTarget();
                                        if (target != null) {
                                            target.onStart(bitmapDrawable);
                                        }
                                        eventListener2.onStart(imageRequest2);
                                        listener = imageRequest2.getListener();
                                        if (listener != null) {
                                            listener.onStart(imageRequest2);
                                        }
                                        eventListener2.resolveSizeStart(imageRequest2);
                                        SizeResolver sizeResolver = imageRequest2.getSizeResolver();
                                        realImageLoader$executeMain$1.L$0 = realImageLoader2;
                                        realImageLoader$executeMain$1.L$1 = requestDelegate;
                                        realImageLoader$executeMain$1.L$2 = imageRequest2;
                                        realImageLoader$executeMain$1.L$3 = eventListener2;
                                        realImageLoader$executeMain$1.L$4 = bitmap;
                                        realImageLoader$executeMain$1.label = 2;
                                        size = sizeResolver.size(realImageLoader$executeMain$1);
                                        if (size != coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        bitmap2 = bitmap;
                                        realImageLoader3 = realImageLoader2;
                                        ImageRequest imageRequest4 = imageRequest2;
                                        requestDelegate4 = requestDelegate;
                                        obj = size;
                                        imageRequest3 = imageRequest4;
                                        Size size2 = (Size) obj;
                                        eventListener2.resolveSizeEnd(imageRequest3, size2);
                                        CoroutineDispatcher interceptorDispatcher = imageRequest3.getInterceptorDispatcher();
                                        RealImageLoader$executeMain$result$1 realImageLoader$executeMain$result$1 = new RealImageLoader$executeMain$result$1(imageRequest3, realImageLoader3, size2, eventListener2, bitmap2, null);
                                        realImageLoader$executeMain$1.L$0 = realImageLoader3;
                                        realImageLoader$executeMain$1.L$1 = requestDelegate4;
                                        realImageLoader$executeMain$1.L$2 = imageRequest3;
                                        realImageLoader$executeMain$1.L$3 = eventListener2;
                                        realImageLoader$executeMain$1.L$4 = null;
                                        realImageLoader$executeMain$1.label = 3;
                                        withContext = BuildersKt.withContext(interceptorDispatcher, realImageLoader$executeMain$result$1, realImageLoader$executeMain$1);
                                        if (withContext != coroutine_suspended) {
                                        }
                                    }
                                }
                                bitmap = null;
                                if (bitmap == null) {
                                }
                                target = imageRequest2.getTarget();
                                if (target != null) {
                                }
                                eventListener2.onStart(imageRequest2);
                                listener = imageRequest2.getListener();
                                if (listener != null) {
                                }
                                eventListener2.resolveSizeStart(imageRequest2);
                                SizeResolver sizeResolver2 = imageRequest2.getSizeResolver();
                                realImageLoader$executeMain$1.L$0 = realImageLoader2;
                                realImageLoader$executeMain$1.L$1 = requestDelegate;
                                realImageLoader$executeMain$1.L$2 = imageRequest2;
                                realImageLoader$executeMain$1.L$3 = eventListener2;
                                realImageLoader$executeMain$1.L$4 = bitmap;
                                realImageLoader$executeMain$1.label = 2;
                                size = sizeResolver2.size(realImageLoader$executeMain$1);
                                if (size != coroutine_suspended) {
                                }
                            }
                        } catch (Throwable th) {
                            th = th;
                            realImageLoader = this;
                            requestDelegate2 = requestDelegate;
                            eventListener = create;
                            if (th instanceof CancellationException) {
                            }
                        }
                    } else if (i2 == 1) {
                        eventListener2 = (EventListener) realImageLoader$executeMain$1.L$3;
                        imageRequest2 = (ImageRequest) realImageLoader$executeMain$1.L$2;
                        requestDelegate3 = (RequestDelegate) realImageLoader$executeMain$1.L$1;
                        realImageLoader2 = (RealImageLoader) realImageLoader$executeMain$1.L$0;
                        try {
                            ResultKt.throwOnFailure(obj3);
                        } catch (Throwable th2) {
                            th = th2;
                            eventListener = eventListener2;
                            build = imageRequest2;
                            requestDelegate2 = requestDelegate3;
                            realImageLoader = realImageLoader2;
                            if (th instanceof CancellationException) {
                                realImageLoader.onCancel(build, eventListener);
                                throw th;
                            }
                            ErrorResult errorResult = realImageLoader.requestService.errorResult(build, th);
                            realImageLoader.onError(errorResult, build.getTarget(), eventListener);
                            return errorResult;
                        }
                    } else if (i2 == 2) {
                        Bitmap bitmap3 = (Bitmap) realImageLoader$executeMain$1.L$4;
                        eventListener2 = (EventListener) realImageLoader$executeMain$1.L$3;
                        imageRequest3 = (ImageRequest) realImageLoader$executeMain$1.L$2;
                        requestDelegate4 = (RequestDelegate) realImageLoader$executeMain$1.L$1;
                        realImageLoader3 = (RealImageLoader) realImageLoader$executeMain$1.L$0;
                        try {
                            ResultKt.throwOnFailure(obj3);
                            bitmap2 = bitmap3;
                            obj = obj3;
                            Size size22 = (Size) obj;
                            eventListener2.resolveSizeEnd(imageRequest3, size22);
                            CoroutineDispatcher interceptorDispatcher2 = imageRequest3.getInterceptorDispatcher();
                            RealImageLoader$executeMain$result$1 realImageLoader$executeMain$result$12 = new RealImageLoader$executeMain$result$1(imageRequest3, realImageLoader3, size22, eventListener2, bitmap2, null);
                            realImageLoader$executeMain$1.L$0 = realImageLoader3;
                            realImageLoader$executeMain$1.L$1 = requestDelegate4;
                            realImageLoader$executeMain$1.L$2 = imageRequest3;
                            realImageLoader$executeMain$1.L$3 = eventListener2;
                            realImageLoader$executeMain$1.L$4 = null;
                            realImageLoader$executeMain$1.label = 3;
                            withContext = BuildersKt.withContext(interceptorDispatcher2, realImageLoader$executeMain$result$12, realImageLoader$executeMain$1);
                            if (withContext != coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            eventListener = eventListener2;
                            build = imageRequest3;
                            requestDelegate2 = requestDelegate4;
                            realImageLoader = realImageLoader3;
                            obj2 = withContext;
                            imageResult = (ImageResult) obj2;
                            if (!(imageResult instanceof SuccessResult)) {
                            }
                            return imageResult;
                        } catch (Throwable th3) {
                            th = th3;
                            eventListener = eventListener2;
                            build = imageRequest3;
                            requestDelegate2 = requestDelegate4;
                            realImageLoader = realImageLoader3;
                            if (th instanceof CancellationException) {
                            }
                        }
                    } else {
                        if (i2 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        eventListener = (EventListener) realImageLoader$executeMain$1.L$3;
                        build = (ImageRequest) realImageLoader$executeMain$1.L$2;
                        requestDelegate2 = (RequestDelegate) realImageLoader$executeMain$1.L$1;
                        realImageLoader = (RealImageLoader) realImageLoader$executeMain$1.L$0;
                        try {
                            ResultKt.throwOnFailure(obj3);
                            obj2 = obj3;
                            imageResult = (ImageResult) obj2;
                            if (!(imageResult instanceof SuccessResult)) {
                                realImageLoader.onSuccess((SuccessResult) imageResult, build.getTarget(), eventListener);
                            } else if (imageResult instanceof ErrorResult) {
                                realImageLoader.onError((ErrorResult) imageResult, build.getTarget(), eventListener);
                            }
                            return imageResult;
                        } catch (Throwable th4) {
                            th = th4;
                            try {
                                if (th instanceof CancellationException) {
                                }
                            } finally {
                                requestDelegate2.complete();
                            }
                        }
                    }
                    requestDelegate = requestDelegate3;
                    memoryCache = realImageLoader2.getMemoryCache();
                    if (memoryCache != null) {
                    }
                    bitmap = null;
                    if (bitmap == null) {
                    }
                    target = imageRequest2.getTarget();
                    if (target != null) {
                    }
                    eventListener2.onStart(imageRequest2);
                    listener = imageRequest2.getListener();
                    if (listener != null) {
                    }
                    eventListener2.resolveSizeStart(imageRequest2);
                    SizeResolver sizeResolver22 = imageRequest2.getSizeResolver();
                    realImageLoader$executeMain$1.L$0 = realImageLoader2;
                    realImageLoader$executeMain$1.L$1 = requestDelegate;
                    realImageLoader$executeMain$1.L$2 = imageRequest2;
                    realImageLoader$executeMain$1.L$3 = eventListener2;
                    realImageLoader$executeMain$1.L$4 = bitmap;
                    realImageLoader$executeMain$1.label = 2;
                    size = sizeResolver22.size(realImageLoader$executeMain$1);
                    if (size != coroutine_suspended) {
                    }
                }
            }
            memoryCache = realImageLoader2.getMemoryCache();
            if (memoryCache != null) {
            }
            bitmap = null;
            if (bitmap == null) {
            }
            target = imageRequest2.getTarget();
            if (target != null) {
            }
            eventListener2.onStart(imageRequest2);
            listener = imageRequest2.getListener();
            if (listener != null) {
            }
            eventListener2.resolveSizeStart(imageRequest2);
            SizeResolver sizeResolver222 = imageRequest2.getSizeResolver();
            realImageLoader$executeMain$1.L$0 = realImageLoader2;
            realImageLoader$executeMain$1.L$1 = requestDelegate;
            realImageLoader$executeMain$1.L$2 = imageRequest2;
            realImageLoader$executeMain$1.L$3 = eventListener2;
            realImageLoader$executeMain$1.L$4 = bitmap;
            realImageLoader$executeMain$1.label = 2;
            size = sizeResolver222.size(realImageLoader$executeMain$1);
            if (size != coroutine_suspended) {
            }
        } catch (Throwable th5) {
            th = th5;
            requestDelegate2 = requestDelegate;
            eventListener = eventListener2;
            build = imageRequest2;
            realImageLoader = realImageLoader2;
            if (th instanceof CancellationException) {
            }
        }
        realImageLoader$executeMain$1 = new RealImageLoader$executeMain$1(this, continuation);
        Object obj32 = realImageLoader$executeMain$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = realImageLoader$executeMain$1.label;
        if (i2 != 0) {
        }
        requestDelegate = requestDelegate3;
    }

    public final void onTrimMemory$coil_base_release(int i) {
        MemoryCache memoryCache;
        Lazy lazy = this.memoryCacheLazy;
        if (lazy == null || (memoryCache = (MemoryCache) lazy.getValue()) == null) {
            return;
        }
        memoryCache.trimMemory(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x000b, code lost:
    
        if (r5 != null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onSuccess(SuccessResult successResult, Target target, EventListener eventListener) {
        ImageRequest request = successResult.getRequest();
        successResult.getDataSource();
        if (target instanceof TransitionTarget) {
            Transition create = successResult.getRequest().getTransitionFactory().create((TransitionTarget) target, successResult);
            if (!(create instanceof NoneTransition)) {
                eventListener.transitionStart(successResult.getRequest(), create);
                create.transition();
                eventListener.transitionEnd(successResult.getRequest(), create);
            }
            target.onSuccess(successResult.getDrawable());
        }
        eventListener.onSuccess(request, successResult);
        ImageRequest.Listener listener = request.getListener();
        if (listener != null) {
            listener.onSuccess(request, successResult);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0008, code lost:
    
        if (r5 != null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onError(ErrorResult errorResult, Target target, EventListener eventListener) {
        ImageRequest request = errorResult.getRequest();
        if (target instanceof TransitionTarget) {
            Transition create = errorResult.getRequest().getTransitionFactory().create((TransitionTarget) target, errorResult);
            if (!(create instanceof NoneTransition)) {
                eventListener.transitionStart(errorResult.getRequest(), create);
                create.transition();
                eventListener.transitionEnd(errorResult.getRequest(), create);
            }
            target.onError(errorResult.getDrawable());
        }
        eventListener.onError(request, errorResult);
        ImageRequest.Listener listener = request.getListener();
        if (listener != null) {
            listener.onError(request, errorResult);
        }
    }

    private final void onCancel(ImageRequest imageRequest, EventListener eventListener) {
        eventListener.onCancel(imageRequest);
        ImageRequest.Listener listener = imageRequest.getListener();
        if (listener != null) {
            listener.onCancel(imageRequest);
        }
    }

    /* compiled from: RealImageLoader.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
