package coil.intercept;

import coil.EventListener;
import coil.intercept.Interceptor;
import coil.request.ImageRequest;
import coil.request.ImageResult;
import coil.request.NullRequestData;
import coil.size.Size;
import java.util.List;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;

/* compiled from: RealInterceptorChain.kt */
/* loaded from: classes14.dex */
public final class RealInterceptorChain implements Interceptor.Chain {
    private final EventListener eventListener;
    private final int index;
    private final ImageRequest initialRequest;
    private final List interceptors;
    private final boolean isPlaceholderCached;
    private final ImageRequest request;
    private final Size size;

    public RealInterceptorChain(ImageRequest imageRequest, List list, int i, ImageRequest imageRequest2, Size size, EventListener eventListener, boolean z) {
        this.initialRequest = imageRequest;
        this.interceptors = list;
        this.index = i;
        this.request = imageRequest2;
        this.size = size;
        this.eventListener = eventListener;
        this.isPlaceholderCached = z;
    }

    @Override // coil.intercept.Interceptor.Chain
    public ImageRequest getRequest() {
        return this.request;
    }

    @Override // coil.intercept.Interceptor.Chain
    public Size getSize() {
        return this.size;
    }

    public final EventListener getEventListener() {
        return this.eventListener;
    }

    public final boolean isPlaceholderCached() {
        return this.isPlaceholderCached;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object proceed(ImageRequest imageRequest, Continuation continuation) {
        RealInterceptorChain$proceed$1 realInterceptorChain$proceed$1;
        int i;
        RealInterceptorChain realInterceptorChain;
        Interceptor interceptor;
        if (continuation instanceof RealInterceptorChain$proceed$1) {
            realInterceptorChain$proceed$1 = (RealInterceptorChain$proceed$1) continuation;
            int i2 = realInterceptorChain$proceed$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                realInterceptorChain$proceed$1.label = i2 - Integer.MIN_VALUE;
                Object obj = realInterceptorChain$proceed$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = realInterceptorChain$proceed$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    int i3 = this.index;
                    if (i3 > 0) {
                        checkRequest(imageRequest, (Interceptor) this.interceptors.get(i3 - 1));
                    }
                    Interceptor interceptor2 = (Interceptor) this.interceptors.get(this.index);
                    RealInterceptorChain copy$default = copy$default(this, this.index + 1, imageRequest, null, 4, null);
                    realInterceptorChain$proceed$1.L$0 = this;
                    realInterceptorChain$proceed$1.L$1 = interceptor2;
                    realInterceptorChain$proceed$1.label = 1;
                    Object intercept = interceptor2.intercept(copy$default, realInterceptorChain$proceed$1);
                    if (intercept == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    realInterceptorChain = this;
                    obj = intercept;
                    interceptor = interceptor2;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    interceptor = (Interceptor) realInterceptorChain$proceed$1.L$1;
                    realInterceptorChain = (RealInterceptorChain) realInterceptorChain$proceed$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                ImageResult imageResult = (ImageResult) obj;
                realInterceptorChain.checkRequest(imageResult.getRequest(), interceptor);
                return imageResult;
            }
        }
        realInterceptorChain$proceed$1 = new RealInterceptorChain$proceed$1(this, continuation);
        Object obj2 = realInterceptorChain$proceed$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = realInterceptorChain$proceed$1.label;
        if (i != 0) {
        }
        ImageResult imageResult2 = (ImageResult) obj2;
        realInterceptorChain.checkRequest(imageResult2.getRequest(), interceptor);
        return imageResult2;
    }

    private final void checkRequest(ImageRequest imageRequest, Interceptor interceptor) {
        if (imageRequest.getContext() != this.initialRequest.getContext()) {
            throw new IllegalStateException(("Interceptor '" + interceptor + "' cannot modify the request's context.").toString());
        }
        if (imageRequest.getData() == NullRequestData.INSTANCE) {
            throw new IllegalStateException(("Interceptor '" + interceptor + "' cannot set the request's data to null.").toString());
        }
        if (imageRequest.getTarget() != this.initialRequest.getTarget()) {
            throw new IllegalStateException(("Interceptor '" + interceptor + "' cannot modify the request's target.").toString());
        }
        if (imageRequest.getLifecycle() != this.initialRequest.getLifecycle()) {
            throw new IllegalStateException(("Interceptor '" + interceptor + "' cannot modify the request's lifecycle.").toString());
        }
        if (imageRequest.getSizeResolver() == this.initialRequest.getSizeResolver()) {
            return;
        }
        throw new IllegalStateException(("Interceptor '" + interceptor + "' cannot modify the request's size resolver. Use `Interceptor.Chain.withSize` instead.").toString());
    }

    static /* synthetic */ RealInterceptorChain copy$default(RealInterceptorChain realInterceptorChain, int i, ImageRequest imageRequest, Size size, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = realInterceptorChain.index;
        }
        if ((i2 & 2) != 0) {
            imageRequest = realInterceptorChain.getRequest();
        }
        if ((i2 & 4) != 0) {
            size = realInterceptorChain.getSize();
        }
        return realInterceptorChain.copy(i, imageRequest, size);
    }

    private final RealInterceptorChain copy(int i, ImageRequest imageRequest, Size size) {
        return new RealInterceptorChain(this.initialRequest, this.interceptors, i, imageRequest, size, this.eventListener, this.isPlaceholderCached);
    }
}
