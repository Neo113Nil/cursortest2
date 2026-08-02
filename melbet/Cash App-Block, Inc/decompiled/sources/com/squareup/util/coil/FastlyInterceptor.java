package com.squareup.util.coil;

import android.net.Uri;
import coil3.intercept.Interceptor;
import coil3.request.ImageRequest;
import coil3.size.Dimension;
import coil3.size.Size;
import com.squareup.fastly.FastlyResolver;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import net.oneformapp.ProfileStore_;

/* loaded from: classes.dex */
public final class FastlyInterceptor implements Interceptor {
    @Override // coil3.intercept.Interceptor
    public final Object intercept(ProfileStore_ profileStore_, ContinuationImpl continuationImpl) {
        ImageRequest request;
        Uri dataUriOrNull = UtilsKt.dataUriOrNull(profileStore_.getRequest());
        Size size = profileStore_.getSize();
        Dimension dimension = size.width;
        Dimension dimension2 = size.height;
        if (dataUriOrNull != null && (dimension instanceof Dimension.Pixels) && (dimension2 instanceof Dimension.Pixels) && FastlyResolver.canHandleRequest(dataUriOrNull)) {
            ImageRequest.Builder newBuilder$default = ImageRequest.newBuilder$default(profileStore_.getRequest());
            newBuilder$default.data(FastlyResolver.resolve(dataUriOrNull, ((Dimension.Pixels) dimension).px, ((Dimension.Pixels) dimension2).px));
            request = newBuilder$default.build();
        } else {
            request = profileStore_.getRequest();
        }
        return profileStore_.withRequest(request).proceed(continuationImpl);
    }
}
