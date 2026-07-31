package coil.network;

/* compiled from: NetworkObserver.kt */
/* loaded from: classes15.dex */
public final class EmptyNetworkObserver implements NetworkObserver {
    @Override // coil.network.NetworkObserver
    public boolean isOnline() {
        return true;
    }

    @Override // coil.network.NetworkObserver
    public void shutdown() {
    }
}
