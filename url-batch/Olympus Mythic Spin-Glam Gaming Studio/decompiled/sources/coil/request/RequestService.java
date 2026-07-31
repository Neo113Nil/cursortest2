package coil.request;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import coil.ImageLoader;
import coil.size.Dimension;
import coil.size.Scale;
import coil.size.Size;
import coil.target.Target;
import coil.target.ViewTarget;
import coil.util.Bitmaps;
import coil.util.HardwareBitmapService;
import coil.util.HardwareBitmaps;
import coil.util.Logger;
import coil.util.Requests;
import coil.util.SystemCallbacks;
import coil.util.Utils;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;

/* compiled from: RequestService.kt */
/* loaded from: classes4.dex */
public final class RequestService {
    private final HardwareBitmapService hardwareBitmapService;
    private final ImageLoader imageLoader;
    private final SystemCallbacks systemCallbacks;

    public RequestService(ImageLoader imageLoader, SystemCallbacks systemCallbacks, Logger logger) {
        this.imageLoader = imageLoader;
        this.systemCallbacks = systemCallbacks;
        this.hardwareBitmapService = HardwareBitmaps.HardwareBitmapService(logger);
    }

    public final RequestDelegate requestDelegate(ImageRequest imageRequest, Job job) {
        Lifecycle lifecycle = imageRequest.getLifecycle();
        Target target = imageRequest.getTarget();
        if (target instanceof ViewTarget) {
            return new ViewTargetRequestDelegate(this.imageLoader, imageRequest, (ViewTarget) target, lifecycle, job);
        }
        return new BaseRequestDelegate(lifecycle, job);
    }

    public final ErrorResult errorResult(ImageRequest imageRequest, Throwable th) {
        Drawable error;
        if (th instanceof NullRequestDataException) {
            error = imageRequest.getFallback();
            if (error == null) {
                error = imageRequest.getError();
            }
        } else {
            error = imageRequest.getError();
        }
        return new ErrorResult(error, imageRequest, th);
    }

    public final Options options(ImageRequest imageRequest, Size size) {
        CachePolicy cachePolicy;
        Scale scale;
        Bitmap.Config bitmapConfig = (isConfigValidForTransformations(imageRequest) && isConfigValidForHardwareAllocation(imageRequest, size)) ? imageRequest.getBitmapConfig() : Bitmap.Config.ARGB_8888;
        if (this.systemCallbacks.isOnline()) {
            cachePolicy = imageRequest.getNetworkCachePolicy();
        } else {
            cachePolicy = CachePolicy.DISABLED;
        }
        CachePolicy cachePolicy2 = cachePolicy;
        boolean z = imageRequest.getAllowRgb565() && imageRequest.getTransformations().isEmpty() && bitmapConfig != Bitmap.Config.ALPHA_8;
        Dimension width = size.getWidth();
        Dimension.Undefined undefined = Dimension.Undefined.INSTANCE;
        if (Intrinsics.areEqual(width, undefined) || Intrinsics.areEqual(size.getHeight(), undefined)) {
            scale = Scale.FIT;
        } else {
            scale = imageRequest.getScale();
        }
        return new Options(imageRequest.getContext(), bitmapConfig, imageRequest.getColorSpace(), size, scale, Requests.getAllowInexactSize(imageRequest), z, imageRequest.getPremultipliedAlpha(), imageRequest.getDiskCacheKey(), imageRequest.getHeaders(), imageRequest.getTags(), imageRequest.getParameters(), imageRequest.getMemoryCachePolicy(), imageRequest.getDiskCachePolicy(), cachePolicy2);
    }

    public final boolean isConfigValidForHardware(ImageRequest imageRequest, Bitmap.Config config) {
        if (!Bitmaps.isHardware(config)) {
            return true;
        }
        if (!imageRequest.getAllowHardware()) {
            return false;
        }
        Target target = imageRequest.getTarget();
        if (target instanceof ViewTarget) {
            View view = ((ViewTarget) target).getView();
            if (view.isAttachedToWindow() && !view.isHardwareAccelerated()) {
                return false;
            }
        }
        return true;
    }

    public final boolean allowHardwareWorkerThread(Options options) {
        return !Bitmaps.isHardware(options.getConfig()) || this.hardwareBitmapService.allowHardwareWorkerThread();
    }

    private final boolean isConfigValidForHardwareAllocation(ImageRequest imageRequest, Size size) {
        return isConfigValidForHardware(imageRequest, imageRequest.getBitmapConfig()) && this.hardwareBitmapService.allowHardwareMainThread(size);
    }

    private final boolean isConfigValidForTransformations(ImageRequest imageRequest) {
        return imageRequest.getTransformations().isEmpty() || ArraysKt.contains(Utils.getVALID_TRANSFORMATION_CONFIGS(), imageRequest.getBitmapConfig());
    }
}
