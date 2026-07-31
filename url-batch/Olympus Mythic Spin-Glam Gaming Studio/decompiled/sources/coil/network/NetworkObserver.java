package coil.network;

/* compiled from: NetworkObserver.kt */
/* loaded from: classes4.dex */
public interface NetworkObserver {

    /* compiled from: NetworkObserver.kt */
    public interface Listener {
        void onConnectivityChange(boolean z);
    }

    boolean isOnline();

    void shutdown();
}
