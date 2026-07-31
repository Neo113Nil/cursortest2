package androidx.webkit;

import androidx.annotation.AnyThread;
import androidx.webkit.internal.ServiceWorkerControllerImpl;

@AnyThread
/* loaded from: classes4.dex */
public abstract class ServiceWorkerControllerCompat {

    private static class LAZY_HOLDER {
        static final ServiceWorkerControllerCompat INSTANCE = new ServiceWorkerControllerImpl();
    }
}
