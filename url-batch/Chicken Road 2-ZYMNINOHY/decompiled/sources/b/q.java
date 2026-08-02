package b;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import o3.InterfaceC1328a;

/* loaded from: classes.dex */
public abstract class q {
    private final CopyOnWriteArrayList<InterfaceC0242c> cancellables = new CopyOnWriteArrayList<>();
    private InterfaceC1328a enabledChangedCallback;
    private boolean isEnabled;

    public q(boolean z) {
        this.isEnabled = z;
    }

    public final void addCancellable(InterfaceC0242c cancellable) {
        kotlin.jvm.internal.i.e(cancellable, "cancellable");
        this.cancellables.add(cancellable);
    }

    public final InterfaceC1328a getEnabledChangedCallback$activity_release() {
        return this.enabledChangedCallback;
    }

    public abstract void handleOnBackPressed();

    public void handleOnBackProgressed(C0241b backEvent) {
        kotlin.jvm.internal.i.e(backEvent, "backEvent");
    }

    public void handleOnBackStarted(C0241b backEvent) {
        kotlin.jvm.internal.i.e(backEvent, "backEvent");
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public final void remove() {
        Iterator<T> it = this.cancellables.iterator();
        while (it.hasNext()) {
            ((InterfaceC0242c) it.next()).cancel();
        }
    }

    public final void removeCancellable(InterfaceC0242c cancellable) {
        kotlin.jvm.internal.i.e(cancellable, "cancellable");
        this.cancellables.remove(cancellable);
    }

    public final void setEnabled(boolean z) {
        this.isEnabled = z;
        InterfaceC1328a interfaceC1328a = this.enabledChangedCallback;
        if (interfaceC1328a != null) {
            interfaceC1328a.invoke();
        }
    }

    public final void setEnabledChangedCallback$activity_release(InterfaceC1328a interfaceC1328a) {
        this.enabledChangedCallback = interfaceC1328a;
    }

    public void handleOnBackCancelled() {
    }
}
