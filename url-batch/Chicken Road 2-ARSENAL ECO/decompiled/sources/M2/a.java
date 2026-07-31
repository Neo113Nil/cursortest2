package M2;

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

    public final void setDeniedByLifecycleCallback(boolean z5) {
        this.isDeniedByLifecycleCallback = z5;
    }

    public final void setOneSignalPayload(boolean z5) {
        this.isOneSignalPayload = z5;
    }

    public final void setWorkManagerProcessing(boolean z5) {
        this.isWorkManagerProcessing = z5;
    }
}
