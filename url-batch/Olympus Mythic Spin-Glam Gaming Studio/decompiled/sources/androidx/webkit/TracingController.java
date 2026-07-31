package androidx.webkit;

import androidx.annotation.AnyThread;
import androidx.webkit.internal.TracingControllerImpl;

@AnyThread
/* loaded from: classes4.dex */
public abstract class TracingController {

    private static class LAZY_HOLDER {
        static final TracingController INSTANCE = new TracingControllerImpl();
    }
}
