package L2;

import K2.b;
import K2.c;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a implements K2.a {
    public a() {
        setLogLevel(c.WARN);
        setAlertLevel(c.NONE);
    }

    @Override // K2.a
    public void addLogListener(b listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        com.onesignal.debug.internal.logging.b.INSTANCE.addListener(listener);
    }

    @Override // K2.a
    public c getAlertLevel() {
        return com.onesignal.debug.internal.logging.b.getVisualLogLevel();
    }

    @Override // K2.a
    public c getLogLevel() {
        return com.onesignal.debug.internal.logging.b.getLogLevel();
    }

    @Override // K2.a
    public void removeLogListener(b listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        com.onesignal.debug.internal.logging.b.INSTANCE.removeListener(listener);
    }

    @Override // K2.a
    public void setAlertLevel(c value) {
        Intrinsics.checkNotNullParameter(value, "value");
        com.onesignal.debug.internal.logging.b.setVisualLogLevel(value);
    }

    @Override // K2.a
    public void setLogLevel(c value) {
        Intrinsics.checkNotNullParameter(value, "value");
        com.onesignal.debug.internal.logging.b.setLogLevel(value);
    }
}
