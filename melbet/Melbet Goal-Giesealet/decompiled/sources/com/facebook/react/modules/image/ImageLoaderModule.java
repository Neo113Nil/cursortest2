package com.facebook.react.modules.image;

import android.net.Uri;
import android.util.SparseArray;
import com.facebook.common.executors.CallerThreadExecutor;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.common.references.CloseableReference;
import com.facebook.datasource.BaseDataSubscriber;
import com.facebook.datasource.DataSource;
import com.facebook.datasource.DataSubscriber;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.fbreact.specs.NativeImageLoaderAndroidSpec;
import com.facebook.imagepipeline.common.RotationOptions;
import com.facebook.imagepipeline.core.ImagePipeline;
import com.facebook.imagepipeline.image.EncodedImage;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapBuilder;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.modules.fresco.ReactNetworkImageRequest;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.views.image.ReactCallerContextFactory;
import com.facebook.react.views.imagehelper.ImageSource;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ImageLoaderModule.kt */
@ReactModule(name = "ImageLoader")
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0001\u0018\u0000 82\u00020\u00012\u00020\u0002:\u00018B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0005\u0010\tB!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u0005\u0010\u000eJ\u001a\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0006\u0010 \u001a\u00020!H\u0017J$\u0010\"\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\u0010#\u001a\u0004\u0018\u00010$2\u0006\u0010 \u001a\u00020!H\u0017J\u001c\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0'0&2\u0006\u0010 \u001a\u00020!H\u0002J\"\u0010)\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0006\u0010*\u001a\u00020+2\u0006\u0010 \u001a\u00020!H\u0016J\u0010\u0010,\u001a\u00020\u001d2\u0006\u0010-\u001a\u00020+H\u0016J\u0018\u0010.\u001a\u00020\u001d2\u0006\u0010/\u001a\u0002002\u0006\u0010 \u001a\u00020!H\u0017J \u00101\u001a\u00020\u001d2\u0006\u0010-\u001a\u0002022\u000e\u00103\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0013H\u0002J\u001a\u00104\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0018\u00010\u00132\u0006\u0010-\u001a\u000202H\u0002J\b\u00105\u001a\u00020\u001dH\u0016J\b\u00106\u001a\u00020\u001dH\u0016J\b\u00107\u001a\u00020\u001dH\u0016R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0011\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00130\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8BX\u0082\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R$\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u000b8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u00069"}, d2 = {"Lcom/facebook/react/modules/image/ImageLoaderModule;", "Lcom/facebook/fbreact/specs/NativeImageLoaderAndroidSpec;", "Lcom/facebook/react/bridge/LifecycleEventListener;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "callerContext", "", "(Lcom/facebook/react/bridge/ReactApplicationContext;Ljava/lang/Object;)V", "imagePipeline", "Lcom/facebook/imagepipeline/core/ImagePipeline;", "callerContextFactory", "Lcom/facebook/react/views/image/ReactCallerContextFactory;", "(Lcom/facebook/react/bridge/ReactApplicationContext;Lcom/facebook/imagepipeline/core/ImagePipeline;Lcom/facebook/react/views/image/ReactCallerContextFactory;)V", "_imagePipeline", "enqueuedRequestMonitor", "enqueuedRequests", "Landroid/util/SparseArray;", "Lcom/facebook/datasource/DataSource;", "Ljava/lang/Void;", "getCallerContext", "()Ljava/lang/Object;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "getImagePipeline", "()Lcom/facebook/imagepipeline/core/ImagePipeline;", "setImagePipeline", "(Lcom/facebook/imagepipeline/core/ImagePipeline;)V", "getSize", "", "uriString", "", BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/facebook/react/bridge/Promise;", "getSizeWithHeaders", "headers", "Lcom/facebook/react/bridge/ReadableMap;", "createSizeSubscriber", "Lcom/facebook/datasource/DataSubscriber;", "Lcom/facebook/common/references/CloseableReference;", "Lcom/facebook/common/memory/PooledByteBuffer;", "prefetchImage", "requestIdAsDouble", "", "abortRequest", "requestId", "queryCache", "uris", "Lcom/facebook/react/bridge/ReadableArray;", "registerRequest", "", "request", "removeRequest", "onHostResume", "onHostPause", "onHostDestroy", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ImageLoaderModule extends NativeImageLoaderAndroidSpec implements LifecycleEventListener {
    private static final String ERROR_GET_SIZE_FAILURE = "E_GET_SIZE_FAILURE";
    private static final String ERROR_INVALID_URI = "E_INVALID_URI";
    private static final String ERROR_PREFETCH_FAILURE = "E_PREFETCH_FAILURE";
    public static final String NAME = "ImageLoader";
    private ImagePipeline _imagePipeline;
    private final Object callerContext;
    private ReactCallerContextFactory callerContextFactory;
    private final Object enqueuedRequestMonitor;
    private final SparseArray<DataSource<Void>> enqueuedRequests;

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
    }

    private final Object getCallerContext() {
        Object orCreateCallerContext;
        ReactCallerContextFactory reactCallerContextFactory = this.callerContextFactory;
        return (reactCallerContextFactory == null || (orCreateCallerContext = reactCallerContextFactory.getOrCreateCallerContext("", "")) == null) ? this.callerContext : orCreateCallerContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ImagePipeline getImagePipeline() {
        ImagePipeline imagePipeline = this._imagePipeline;
        if (imagePipeline != null) {
            return imagePipeline;
        }
        ImagePipeline imagePipeline2 = Fresco.getImagePipeline();
        Intrinsics.checkNotNullExpressionValue(imagePipeline2, "getImagePipeline(...)");
        return imagePipeline2;
    }

    private final void setImagePipeline(ImagePipeline imagePipeline) {
        this._imagePipeline = imagePipeline;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageLoaderModule(ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.enqueuedRequestMonitor = new Object();
        this.enqueuedRequests = new SparseArray<>();
        this.callerContext = this;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageLoaderModule(ReactApplicationContext reactContext, Object obj) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.enqueuedRequestMonitor = new Object();
        this.enqueuedRequests = new SparseArray<>();
        this.callerContext = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageLoaderModule(ReactApplicationContext reactContext, ImagePipeline imagePipeline, ReactCallerContextFactory callerContextFactory) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        Intrinsics.checkNotNullParameter(imagePipeline, "imagePipeline");
        Intrinsics.checkNotNullParameter(callerContextFactory, "callerContextFactory");
        this.enqueuedRequestMonitor = new Object();
        this.enqueuedRequests = new SparseArray<>();
        this.callerContextFactory = callerContextFactory;
        setImagePipeline(imagePipeline);
        this.callerContext = null;
    }

    @Override // com.facebook.fbreact.specs.NativeImageLoaderAndroidSpec
    @ReactMethod
    public void getSize(String uriString, Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        String str = uriString;
        if (str == null || str.length() == 0) {
            promise.reject(ERROR_INVALID_URI, "Cannot get the size of an image for an empty URI");
            return;
        }
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        ImageRequest build = ImageRequestBuilder.newBuilderWithSource(new ImageSource(reactApplicationContext, uriString, 0.0d, 0.0d, null, 28, null).getUri()).setRotationOptions(RotationOptions.INSTANCE.disableRotation()).build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        getImagePipeline().fetchEncodedImage(build, getCallerContext()).subscribe(createSizeSubscriber(promise), CallerThreadExecutor.getInstance());
    }

    @Override // com.facebook.fbreact.specs.NativeImageLoaderAndroidSpec
    @ReactMethod
    public void getSizeWithHeaders(String uriString, ReadableMap headers, Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        String str = uriString;
        if (str == null || str.length() == 0) {
            promise.reject(ERROR_INVALID_URI, "Cannot get the size of an image for an empty URI");
            return;
        }
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        ImageRequestBuilder rotationOptions = ImageRequestBuilder.newBuilderWithSource(new ImageSource(reactApplicationContext, uriString, 0.0d, 0.0d, null, 28, null).getUri()).setRotationOptions(RotationOptions.INSTANCE.disableRotation());
        Intrinsics.checkNotNullExpressionValue(rotationOptions, "setRotationOptions(...)");
        getImagePipeline().fetchEncodedImage(ReactNetworkImageRequest.Companion.fromBuilderWithHeaders$default(ReactNetworkImageRequest.INSTANCE, rotationOptions, headers, null, 4, null), getCallerContext()).subscribe(createSizeSubscriber(promise), CallerThreadExecutor.getInstance());
    }

    private final DataSubscriber<CloseableReference<PooledByteBuffer>> createSizeSubscriber(final Promise promise) {
        return new BaseDataSubscriber<CloseableReference<PooledByteBuffer>>() { // from class: com.facebook.react.modules.image.ImageLoaderModule$createSizeSubscriber$1
            /* JADX WARN: Removed duplicated region for block: B:23:0x0042 A[Catch: all -> 0x0089, Exception -> 0x008c, TryCatch #4 {Exception -> 0x008c, all -> 0x0089, blocks: (B:12:0x001e, B:14:0x0026, B:16:0x002e, B:18:0x0035, B:23:0x0042, B:25:0x004d, B:29:0x005b, B:32:0x007d, B:35:0x0052, B:36:0x0047), top: B:11:0x001e }] */
            /* JADX WARN: Removed duplicated region for block: B:25:0x004d A[Catch: all -> 0x0089, Exception -> 0x008c, TryCatch #4 {Exception -> 0x008c, all -> 0x0089, blocks: (B:12:0x001e, B:14:0x0026, B:16:0x002e, B:18:0x0035, B:23:0x0042, B:25:0x004d, B:29:0x005b, B:32:0x007d, B:35:0x0052, B:36:0x0047), top: B:11:0x001e }] */
            /* JADX WARN: Removed duplicated region for block: B:35:0x0052 A[Catch: all -> 0x0089, Exception -> 0x008c, TryCatch #4 {Exception -> 0x008c, all -> 0x0089, blocks: (B:12:0x001e, B:14:0x0026, B:16:0x002e, B:18:0x0035, B:23:0x0042, B:25:0x004d, B:29:0x005b, B:32:0x007d, B:35:0x0052, B:36:0x0047), top: B:11:0x001e }] */
            /* JADX WARN: Removed duplicated region for block: B:36:0x0047 A[Catch: all -> 0x0089, Exception -> 0x008c, TryCatch #4 {Exception -> 0x008c, all -> 0x0089, blocks: (B:12:0x001e, B:14:0x0026, B:16:0x002e, B:18:0x0035, B:23:0x0042, B:25:0x004d, B:29:0x005b, B:32:0x007d, B:35:0x0052, B:36:0x0047), top: B:11:0x001e }] */
            @Override // com.facebook.datasource.BaseDataSubscriber
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            protected void onNewResultImpl(DataSource<CloseableReference<PooledByteBuffer>> dataSource) {
                EncodedImage encodedImage;
                boolean z;
                int height;
                int width;
                Intrinsics.checkNotNullParameter(dataSource, "dataSource");
                if (dataSource.isFinished()) {
                    CloseableReference<PooledByteBuffer> result = dataSource.getResult();
                    if (result == null) {
                        Promise.this.reject("E_GET_SIZE_FAILURE", "Failed to get the size of the image");
                        return;
                    }
                    EncodedImage encodedImage2 = null;
                    try {
                        try {
                            encodedImage = new EncodedImage(result);
                        } catch (Exception e) {
                            e = e;
                        }
                    } catch (Throwable th) {
                        th = th;
                    }
                    try {
                        if (encodedImage.getRotationAngle() != 90 && encodedImage.getRotationAngle() != 270 && encodedImage.getExifOrientation() != 5 && encodedImage.getExifOrientation() != 7) {
                            z = false;
                            height = !z ? encodedImage.getHeight() : encodedImage.getWidth();
                            width = !z ? encodedImage.getWidth() : encodedImage.getHeight();
                            if (height >= 0 && width >= 0) {
                                WritableMap createMap = Arguments.createMap();
                                ReadableMapBuilder readableMapBuilder = new ReadableMapBuilder(createMap);
                                readableMapBuilder.put(ViewProps.WIDTH, height);
                                readableMapBuilder.put(ViewProps.HEIGHT, width);
                                Promise.this.resolve(createMap);
                                encodedImage.close();
                                CloseableReference.closeSafely(result);
                                return;
                            }
                            Promise.this.reject("E_GET_SIZE_FAILURE", "Failed to get the size of the image");
                            encodedImage.close();
                            CloseableReference.closeSafely(result);
                        }
                        z = true;
                        if (!z) {
                        }
                        if (!z) {
                        }
                        if (height >= 0) {
                            WritableMap createMap2 = Arguments.createMap();
                            ReadableMapBuilder readableMapBuilder2 = new ReadableMapBuilder(createMap2);
                            readableMapBuilder2.put(ViewProps.WIDTH, height);
                            readableMapBuilder2.put(ViewProps.HEIGHT, width);
                            Promise.this.resolve(createMap2);
                            encodedImage.close();
                            CloseableReference.closeSafely(result);
                            return;
                        }
                        Promise.this.reject("E_GET_SIZE_FAILURE", "Failed to get the size of the image");
                        encodedImage.close();
                        CloseableReference.closeSafely(result);
                    } catch (Exception e2) {
                        e = e2;
                        encodedImage2 = encodedImage;
                        Promise.this.reject("E_GET_SIZE_FAILURE", e);
                        if (encodedImage2 != null) {
                            encodedImage2.close();
                        }
                        CloseableReference.closeSafely(result);
                    } catch (Throwable th2) {
                        th = th2;
                        encodedImage2 = encodedImage;
                        if (encodedImage2 != null) {
                            encodedImage2.close();
                        }
                        CloseableReference.closeSafely(result);
                        throw th;
                    }
                }
            }

            @Override // com.facebook.datasource.BaseDataSubscriber
            protected void onFailureImpl(DataSource<CloseableReference<PooledByteBuffer>> dataSource) {
                Intrinsics.checkNotNullParameter(dataSource, "dataSource");
                Promise.this.reject("E_GET_SIZE_FAILURE", dataSource.getFailureCause());
            }
        };
    }

    @Override // com.facebook.fbreact.specs.NativeImageLoaderAndroidSpec
    public void prefetchImage(String uriString, double requestIdAsDouble, final Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        final int i = (int) requestIdAsDouble;
        String str = uriString;
        if (str == null || str.length() == 0) {
            promise.reject(ERROR_INVALID_URI, "Cannot prefetch an image for an empty URI");
            return;
        }
        ImageRequest build = ImageRequestBuilder.newBuilderWithSource(Uri.parse(uriString)).build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        DataSource<Void> prefetchToDiskCache = getImagePipeline().prefetchToDiskCache(build, getCallerContext());
        BaseDataSubscriber<Void> baseDataSubscriber = new BaseDataSubscriber<Void>() { // from class: com.facebook.react.modules.image.ImageLoaderModule$prefetchImage$prefetchSubscriber$1
            @Override // com.facebook.datasource.BaseDataSubscriber
            protected void onNewResultImpl(DataSource<Void> dataSource) {
                Intrinsics.checkNotNullParameter(dataSource, "dataSource");
                try {
                    if (dataSource.isFinished()) {
                        ImageLoaderModule.this.removeRequest(i);
                        promise.resolve(true);
                    }
                } catch (Exception e) {
                    promise.reject("E_PREFETCH_FAILURE", e);
                } finally {
                    dataSource.close();
                }
            }

            @Override // com.facebook.datasource.BaseDataSubscriber
            protected void onFailureImpl(DataSource<Void> dataSource) {
                Intrinsics.checkNotNullParameter(dataSource, "dataSource");
                try {
                    ImageLoaderModule.this.removeRequest(i);
                    promise.reject("E_PREFETCH_FAILURE", dataSource.getFailureCause());
                } finally {
                    dataSource.close();
                }
            }
        };
        registerRequest(i, prefetchToDiskCache);
        prefetchToDiskCache.subscribe(baseDataSubscriber, CallerThreadExecutor.getInstance());
    }

    @Override // com.facebook.fbreact.specs.NativeImageLoaderAndroidSpec
    public void abortRequest(double requestId) {
        DataSource<Void> removeRequest = removeRequest((int) requestId);
        if (removeRequest != null) {
            removeRequest.close();
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.facebook.react.modules.image.ImageLoaderModule$queryCache$1] */
    @Override // com.facebook.fbreact.specs.NativeImageLoaderAndroidSpec
    @ReactMethod
    public void queryCache(final ReadableArray uris, final Promise promise) {
        Intrinsics.checkNotNullParameter(uris, "uris");
        Intrinsics.checkNotNullParameter(promise, "promise");
        final ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        new GuardedAsyncTask<Void, Void>(this, uris, reactApplicationContext) { // from class: com.facebook.react.modules.image.ImageLoaderModule$queryCache$1
            final /* synthetic */ ReadableArray $uris;
            final /* synthetic */ ImageLoaderModule this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(reactApplicationContext);
                Intrinsics.checkNotNull(reactApplicationContext);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.facebook.react.bridge.GuardedAsyncTask
            public void doInBackgroundGuarded(Void... params) {
                ImagePipeline imagePipeline;
                Intrinsics.checkNotNullParameter(params, "params");
                ImageLoaderModule imageLoaderModule = this.this$0;
                ReadableArray readableArray = this.$uris;
                WritableMap createMap = Arguments.createMap();
                ReadableMapBuilder readableMapBuilder = new ReadableMapBuilder(createMap);
                imagePipeline = imageLoaderModule.getImagePipeline();
                int size = readableArray.size();
                for (int i = 0; i < size; i++) {
                    String string = readableArray.getString(i);
                    String str = string;
                    if (str != null && str.length() != 0) {
                        Uri parse = Uri.parse(string);
                        if (imagePipeline.isInBitmapMemoryCache(parse)) {
                            readableMapBuilder.put(string, "memory");
                        } else if (imagePipeline.isInDiskCacheSync(parse)) {
                            readableMapBuilder.put(string, "disk");
                        }
                    }
                }
                Promise.this.resolve(createMap);
            }
        }.executeOnExecutor(GuardedAsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    private final void registerRequest(int requestId, DataSource<Void> request) {
        synchronized (this.enqueuedRequestMonitor) {
            this.enqueuedRequests.put(requestId, request);
            Unit unit = Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DataSource<Void> removeRequest(int requestId) {
        DataSource<Void> dataSource;
        synchronized (this.enqueuedRequestMonitor) {
            dataSource = this.enqueuedRequests.get(requestId);
            this.enqueuedRequests.remove(requestId);
        }
        return dataSource;
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        synchronized (this.enqueuedRequestMonitor) {
            int size = this.enqueuedRequests.size();
            for (int i = 0; i < size; i++) {
                DataSource<Void> valueAt = this.enqueuedRequests.valueAt(i);
                Intrinsics.checkNotNullExpressionValue(valueAt, "valueAt(...)");
                valueAt.close();
            }
            this.enqueuedRequests.clear();
            Unit unit = Unit.INSTANCE;
        }
    }
}
