package androidx.webkit;

import androidx.annotation.AnyThread;
import androidx.webkit.internal.ProxyControllerImpl;

@AnyThread
/* loaded from: classes15.dex */
public abstract class ProxyController {

    private static class LAZY_HOLDER {
        static final ProxyController INSTANCE = new ProxyControllerImpl();
    }
}
