package coil.decode;

import coil.ImageLoader;
import coil.fetch.SourceResult;
import coil.request.Options;
import kotlin.coroutines.Continuation;

/* compiled from: Decoder.kt */
/* loaded from: classes3.dex */
public interface Decoder {

    /* compiled from: Decoder.kt */
    public interface Factory {
        Decoder create(SourceResult sourceResult, Options options, ImageLoader imageLoader);
    }

    Object decode(Continuation continuation);
}
