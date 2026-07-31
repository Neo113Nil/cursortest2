package androidx.work.impl.constraints.trackers;

import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import androidx.work.Logger;
import androidx.work.impl.constraints.NetworkState;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NetworkStateTracker.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001a\u0010\u0010\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\f\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0013\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Landroidx/work/impl/constraints/trackers/NetworkStateTrackerPre24;", "Landroidx/work/impl/constraints/trackers/BroadcastReceiverConstraintTracker;", "Landroidx/work/impl/constraints/NetworkState;", "Landroid/content/Intent;", SDKConstants.PARAM_INTENT, "", "onBroadcastReceive", "(Landroid/content/Intent;)V", "Landroid/net/ConnectivityManager;", "connectivityManager", "Landroid/net/ConnectivityManager;", "Landroid/content/IntentFilter;", "getIntentFilter", "()Landroid/content/IntentFilter;", "getIntentFilter$annotations", "()V", "intentFilter", "getInitialState", "()Landroidx/work/impl/constraints/NetworkState;", "initialState", "work-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes15.dex */
public final class NetworkStateTrackerPre24 extends BroadcastReceiverConstraintTracker<NetworkState> {
    private final ConnectivityManager connectivityManager;

    @Override // androidx.work.impl.constraints.trackers.BroadcastReceiverConstraintTracker
    public void onBroadcastReceive(Intent intent) {
        String str;
        Intrinsics.checkNotNullParameter(intent, "intent");
        if (Intrinsics.areEqual(intent.getAction(), "android.net.conn.CONNECTIVITY_CHANGE")) {
            Logger logger = Logger.get();
            str = NetworkStateTrackerKt.TAG;
            logger.debug(str, "Network broadcast received");
            setState(NetworkStateTrackerKt.getActiveNetworkState(this.connectivityManager));
        }
    }

    @Override // androidx.work.impl.constraints.trackers.BroadcastReceiverConstraintTracker
    public IntentFilter getIntentFilter() {
        return new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
    }

    @Override // androidx.work.impl.constraints.trackers.ConstraintTracker
    public NetworkState getInitialState() {
        return NetworkStateTrackerKt.getActiveNetworkState(this.connectivityManager);
    }
}
