package coil.intercept;

import coil.request.ImageRequest;
import coil.size.Size;
import kotlin.coroutines.Continuation;

/* compiled from: Interceptor.kt */
/* loaded from: classes5.dex */
public interface Interceptor {

    /* compiled from: Interceptor.kt */
    public interface Chain {
        ImageRequest getRequest();

        Size getSize();
    }

    Object intercept(Chain chain, Continuation continuation);
}
