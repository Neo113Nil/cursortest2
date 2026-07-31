package j2;

import i2.InterfaceC0425a;
import i2.b;
import i2.c;
import kotlin.jvm.internal.i;

/* renamed from: j2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0437a implements InterfaceC0425a {
    public C0437a() {
        setLogLevel(c.WARN);
        setAlertLevel(c.NONE);
    }

    @Override // i2.InterfaceC0425a
    public void addLogListener(b listener) {
        i.e(listener, "listener");
        com.onesignal.debug.internal.logging.b.INSTANCE.addListener(listener);
    }

    @Override // i2.InterfaceC0425a
    public c getAlertLevel() {
        return com.onesignal.debug.internal.logging.b.getVisualLogLevel();
    }

    @Override // i2.InterfaceC0425a
    public c getLogLevel() {
        return com.onesignal.debug.internal.logging.b.getLogLevel();
    }

    @Override // i2.InterfaceC0425a
    public void removeLogListener(b listener) {
        i.e(listener, "listener");
        com.onesignal.debug.internal.logging.b.INSTANCE.removeListener(listener);
    }

    @Override // i2.InterfaceC0425a
    public void setAlertLevel(c value) {
        i.e(value, "value");
        com.onesignal.debug.internal.logging.b.setVisualLogLevel(value);
    }

    @Override // i2.InterfaceC0425a
    public void setLogLevel(c value) {
        i.e(value, "value");
        com.onesignal.debug.internal.logging.b.setLogLevel(value);
    }
}
