package xb;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a {
    private boolean isDeniedByLifecycleCallback;
    private boolean isOneSignalPayload;
    private boolean isWorkManagerProcessing;

    public final boolean isProcessed() {
        return !this.isOneSignalPayload || this.isDeniedByLifecycleCallback || this.isWorkManagerProcessing;
    }

    public final boolean isWorkManagerProcessing() {
        return this.isWorkManagerProcessing;
    }

    public final void setDeniedByLifecycleCallback(boolean z10) {
        this.isDeniedByLifecycleCallback = z10;
    }

    public final void setOneSignalPayload(boolean z10) {
        this.isOneSignalPayload = z10;
    }

    public final void setWorkManagerProcessing(boolean z10) {
        this.isWorkManagerProcessing = z10;
    }
}
