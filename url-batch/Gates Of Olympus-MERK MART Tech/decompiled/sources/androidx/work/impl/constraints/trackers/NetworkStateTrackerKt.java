package androidx.work.impl.constraints.trackers;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import androidx.core.net.ConnectivityManagerCompat;
import androidx.work.Logger;
import androidx.work.impl.constraints.NetworkState;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NetworkStateTracker.kt */
@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u001a\u001e\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u001a\u0018\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000bH\u0000\u001a\u0018\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000bH\u0001\"\u0013\u0010\u0007\u001a\u00070\b¢\u0006\u0002\b\tX\u0082\u0004¢\u0006\u0002\n\u0000\"\u0018\u0010\n\u001a\u00020\u000b*\u00020\f8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\r¨\u0006\u0013"}, d2 = {"NetworkStateTracker", "Landroidx/work/impl/constraints/trackers/ConstraintTracker;", "Landroidx/work/impl/constraints/NetworkState;", "context", "Landroid/content/Context;", "taskExecutor", "Landroidx/work/impl/utils/taskexecutor/TaskExecutor;", "TAG", "", "Lorg/jspecify/annotations/NonNull;", "isActiveNetworkValidated", "", "Landroid/net/ConnectivityManager;", "(Landroid/net/ConnectivityManager;)Z", "getActiveNetworkState", "connectivityManager", "isBlocked", "capabilities", "Landroid/net/NetworkCapabilities;", "work-runtime_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NetworkStateTrackerKt {
    private static final String TAG;

    public static final ConstraintTracker<NetworkState> NetworkStateTracker(Context context, TaskExecutor taskExecutor) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
        return new NetworkStateTracker24(context, taskExecutor);
    }

    static {
        String tagWithPrefix = Logger.tagWithPrefix("NetworkStateTracker");
        Intrinsics.checkNotNullExpressionValue(tagWithPrefix, "tagWithPrefix(...)");
        TAG = tagWithPrefix;
    }

    public static final boolean isActiveNetworkValidated(ConnectivityManager connectivityManager) {
        Intrinsics.checkNotNullParameter(connectivityManager, "<this>");
        try {
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
            if (networkCapabilities != null) {
                return networkCapabilities.hasCapability(16);
            }
            return false;
        } catch (SecurityException e) {
            Logger.get().error(TAG, "Unable to validate active network", e);
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0027 A[Catch: SecurityException -> 0x0016, TRY_ENTER, TRY_LEAVE, TryCatch #1 {SecurityException -> 0x0016, blocks: (B:28:0x000d, B:9:0x0027), top: B:27:0x000d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final NetworkState getActiveNetworkState(ConnectivityManager connectivityManager, boolean z) {
        boolean z2;
        SecurityException securityException;
        boolean z3;
        boolean z4;
        Intrinsics.checkNotNullParameter(connectivityManager, "connectivityManager");
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            boolean z5 = true;
            try {
                if (activeNetworkInfo != null) {
                    try {
                        if (activeNetworkInfo.isConnected()) {
                            z3 = true;
                            z4 = false;
                            boolean isActiveNetworkValidated = isActiveNetworkValidated(connectivityManager);
                            boolean isActiveNetworkMetered = ConnectivityManagerCompat.isActiveNetworkMetered(connectivityManager);
                            if (activeNetworkInfo != null) {
                                if (!activeNetworkInfo.isRoaming()) {
                                    z4 = z3;
                                }
                            }
                            z2 = z;
                            return new NetworkState(z5, isActiveNetworkValidated, isActiveNetworkMetered, z4, z2);
                        }
                    } catch (SecurityException e) {
                        securityException = e;
                        z2 = z;
                        Logger.get().error(TAG, "Unable to get active network state", securityException);
                        return new NetworkState(false, false, false, true, z2);
                    }
                }
                return new NetworkState(z5, isActiveNetworkValidated, isActiveNetworkMetered, z4, z2);
            } catch (SecurityException e2) {
                e = e2;
                securityException = e;
                Logger.get().error(TAG, "Unable to get active network state", securityException);
                return new NetworkState(false, false, false, true, z2);
            }
            z3 = true;
            z5 = false;
            z4 = false;
            boolean isActiveNetworkValidated2 = isActiveNetworkValidated(connectivityManager);
            boolean isActiveNetworkMetered2 = ConnectivityManagerCompat.isActiveNetworkMetered(connectivityManager);
            if (activeNetworkInfo != null) {
            }
            z2 = z;
        } catch (SecurityException e3) {
            e = e3;
            z2 = z;
        }
    }

    public static final NetworkState getActiveNetworkState(NetworkCapabilities capabilities, boolean z) {
        Intrinsics.checkNotNullParameter(capabilities, "capabilities");
        return new NetworkState(capabilities.hasCapability(12), capabilities.hasCapability(16), !capabilities.hasCapability(11), capabilities.hasCapability(18), z);
    }
}
