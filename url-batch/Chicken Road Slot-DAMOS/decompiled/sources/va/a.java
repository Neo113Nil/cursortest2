package va;

import ua.b;
import ua.c;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a implements ua.a {
    public a() {
        setLogLevel(c.WARN);
        setAlertLevel(c.NONE);
    }

    @Override // ua.a
    public void addLogListener(b bVar) {
        bVar.getClass();
        com.onesignal.debug.internal.logging.b.INSTANCE.addListener(bVar);
    }

    @Override // ua.a
    public c getAlertLevel() {
        return com.onesignal.debug.internal.logging.b.getVisualLogLevel();
    }

    @Override // ua.a
    public c getLogLevel() {
        return com.onesignal.debug.internal.logging.b.getLogLevel();
    }

    @Override // ua.a
    public void removeLogListener(b bVar) {
        bVar.getClass();
        com.onesignal.debug.internal.logging.b.INSTANCE.removeListener(bVar);
    }

    @Override // ua.a
    public void setAlertLevel(c cVar) {
        cVar.getClass();
        com.onesignal.debug.internal.logging.b.setVisualLogLevel(cVar);
    }

    @Override // ua.a
    public void setLogLevel(c cVar) {
        cVar.getClass();
        com.onesignal.debug.internal.logging.b.setLogLevel(cVar);
    }
}
