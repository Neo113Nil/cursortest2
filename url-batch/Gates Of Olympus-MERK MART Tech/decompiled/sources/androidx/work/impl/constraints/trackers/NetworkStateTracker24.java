package androidx.work.impl.constraints.trackers;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import androidx.work.Logger;
import androidx.work.impl.constraints.NetworkState;
import androidx.work.impl.utils.NetworkApi24;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NetworkStateTracker.kt */
@Metadata(d1 = {"\u0000?\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0011\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000f\u001a\u00020\u0002H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0014H\u0016R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0012¨\u0006\u0016"}, d2 = {"Landroidx/work/impl/constraints/trackers/NetworkStateTracker24;", "Landroidx/work/impl/constraints/trackers/ConstraintTracker;", "Landroidx/work/impl/constraints/NetworkState;", "context", "Landroid/content/Context;", "taskExecutor", "Landroidx/work/impl/utils/taskexecutor/TaskExecutor;", "<init>", "(Landroid/content/Context;Landroidx/work/impl/utils/taskexecutor/TaskExecutor;)V", "connectivityManager", "Landroid/net/ConnectivityManager;", "lock", "", "isBlocked", "", "readSystemState", "networkCallback", "androidx/work/impl/constraints/trackers/NetworkStateTracker24$networkCallback$1", "Landroidx/work/impl/constraints/trackers/NetworkStateTracker24$networkCallback$1;", "startTracking", "", "stopTracking", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NetworkStateTracker24 extends ConstraintTracker<NetworkState> {
    private final ConnectivityManager connectivityManager;
    private volatile boolean isBlocked;
    private final Object lock;
    private final NetworkStateTracker24$networkCallback$1 networkCallback;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v5, types: [androidx.work.impl.constraints.trackers.NetworkStateTracker24$networkCallback$1] */
    public NetworkStateTracker24(Context context, TaskExecutor taskExecutor) {
        super(context, taskExecutor);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
        Object systemService = getAppContext().getSystemService("connectivity");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.connectivityManager = (ConnectivityManager) systemService;
        this.lock = new Object();
        this.networkCallback = new ConnectivityManager.NetworkCallback() { // from class: androidx.work.impl.constraints.trackers.NetworkStateTracker24$networkCallback$1
            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onCapabilitiesChanged(Network network, NetworkCapabilities capabilities) {
                String str;
                boolean z;
                Intrinsics.checkNotNullParameter(network, "network");
                Intrinsics.checkNotNullParameter(capabilities, "capabilities");
                Logger logger = Logger.get();
                str = NetworkStateTrackerKt.TAG;
                logger.debug(str, "Network capabilities changed: " + capabilities);
                NetworkStateTracker24 networkStateTracker24 = NetworkStateTracker24.this;
                z = NetworkStateTracker24.this.isBlocked;
                networkStateTracker24.setState(NetworkStateTrackerKt.getActiveNetworkState(capabilities, z));
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onLost(Network network) {
                String str;
                Intrinsics.checkNotNullParameter(network, "network");
                Logger logger = Logger.get();
                str = NetworkStateTrackerKt.TAG;
                logger.debug(str, "Network connection lost");
                NetworkStateTracker24.this.setState(new NetworkState(false, false, false, false, false));
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onBlockedStatusChanged(Network network, boolean blocked) {
                ConnectivityManager connectivityManager;
                String str;
                Object obj;
                boolean z;
                Intrinsics.checkNotNullParameter(network, "network");
                connectivityManager = NetworkStateTracker24.this.connectivityManager;
                if (Intrinsics.areEqual(network, connectivityManager.getActiveNetwork())) {
                    Logger logger = Logger.get();
                    str = NetworkStateTrackerKt.TAG;
                    logger.debug(str, "Network blocked status changed: " + blocked);
                    NetworkState state = NetworkStateTracker24.this.getState();
                    obj = NetworkStateTracker24.this.lock;
                    NetworkStateTracker24 networkStateTracker24 = NetworkStateTracker24.this;
                    synchronized (obj) {
                        z = networkStateTracker24.isBlocked;
                        if (z == blocked) {
                            return;
                        }
                        networkStateTracker24.isBlocked = blocked;
                        Unit unit = Unit.INSTANCE;
                        NetworkStateTracker24.this.setState(NetworkState.copy$default(state, false, false, false, false, blocked, 15, null));
                    }
                }
            }
        };
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.work.impl.constraints.trackers.ConstraintTracker
    public NetworkState readSystemState() {
        ConnectivityManager connectivityManager = this.connectivityManager;
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        if (networkCapabilities != null) {
            return NetworkStateTrackerKt.getActiveNetworkState(networkCapabilities, this.isBlocked);
        }
        return NetworkStateTrackerKt.getActiveNetworkState(this.connectivityManager, this.isBlocked);
    }

    @Override // androidx.work.impl.constraints.trackers.ConstraintTracker
    public void startTracking() {
        String str;
        String str2;
        String str3;
        try {
            Logger logger = Logger.get();
            str3 = NetworkStateTrackerKt.TAG;
            logger.debug(str3, "Registering network callback");
            NetworkApi24.registerDefaultNetworkCallbackCompat(this.connectivityManager, this.networkCallback);
        } catch (IllegalArgumentException e) {
            Logger logger2 = Logger.get();
            str2 = NetworkStateTrackerKt.TAG;
            logger2.error(str2, "Received exception while registering network callback", e);
        } catch (SecurityException e2) {
            Logger logger3 = Logger.get();
            str = NetworkStateTrackerKt.TAG;
            logger3.error(str, "Received exception while registering network callback", e2);
        }
    }

    @Override // androidx.work.impl.constraints.trackers.ConstraintTracker
    public void stopTracking() {
        String str;
        String str2;
        String str3;
        try {
            Logger logger = Logger.get();
            str3 = NetworkStateTrackerKt.TAG;
            logger.debug(str3, "Unregistering network callback");
            this.connectivityManager.unregisterNetworkCallback(this.networkCallback);
        } catch (IllegalArgumentException e) {
            Logger logger2 = Logger.get();
            str2 = NetworkStateTrackerKt.TAG;
            logger2.error(str2, "Received exception while unregistering network callback", e);
        } catch (SecurityException e2) {
            Logger logger3 = Logger.get();
            str = NetworkStateTrackerKt.TAG;
            logger3.error(str, "Received exception while unregistering network callback", e2);
        }
    }
}
