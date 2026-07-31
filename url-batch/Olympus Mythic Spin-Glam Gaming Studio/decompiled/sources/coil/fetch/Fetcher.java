package coil.fetch;

import coil.ImageLoader;
import coil.request.Options;
import kotlin.coroutines.Continuation;

/* compiled from: Fetcher.kt */
/* loaded from: classes11.dex */
public interface Fetcher {

    /* compiled from: Fetcher.kt */
    public interface Factory {
        Fetcher create(Object obj, Options options, ImageLoader imageLoader);
    }

    Object fetch(Continuation continuation);
}
