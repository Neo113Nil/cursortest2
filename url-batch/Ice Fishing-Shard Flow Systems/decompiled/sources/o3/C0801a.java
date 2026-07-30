package o3;

/* renamed from: o3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0801a {
    private boolean isDeniedByLifecycleCallback;
    private boolean isOneSignalPayload;
    private boolean isWorkManagerProcessing;

    public final boolean isProcessed() {
        return !this.isOneSignalPayload || this.isDeniedByLifecycleCallback || this.isWorkManagerProcessing;
    }

    public final boolean isWorkManagerProcessing() {
        return this.isWorkManagerProcessing;
    }

    public final void setDeniedByLifecycleCallback(boolean z7) {
        this.isDeniedByLifecycleCallback = z7;
    }

    public final void setOneSignalPayload(boolean z7) {
        this.isOneSignalPayload = z7;
    }

    public final void setWorkManagerProcessing(boolean z7) {
        this.isWorkManagerProcessing = z7;
    }
}
