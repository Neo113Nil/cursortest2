package androidx.webkit;

import androidx.annotation.AnyThread;
import java.lang.reflect.InvocationHandler;

@AnyThread
/* loaded from: classes15.dex */
public abstract class WebMessagePortCompat {

    public static abstract class WebMessageCallbackCompat {
        public void onMessage(WebMessagePortCompat webMessagePortCompat, WebMessageCompat webMessageCompat) {
        }
    }

    public abstract InvocationHandler getInvocationHandler();
}
