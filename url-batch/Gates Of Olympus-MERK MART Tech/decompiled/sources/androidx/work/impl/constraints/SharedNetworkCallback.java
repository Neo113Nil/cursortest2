package androidx.work.impl.constraints;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import androidx.work.Logger;
import androidx.work.impl.constraints.ConstraintsState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WorkConstraintsTracker.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u000eH\u0016J\u0018\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u0014H\u0016J\u0010\u0010 \u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010!\u001a\u00020\nH\u0003J\u001a\u0010\"\u001a\u00020\u00142\u0006\u0010#\u001a\u00020\f2\b\u0010$\u001a\u0004\u0018\u00010\u000eH\u0002J4\u0010%\u001a\b\u0012\u0004\u0012\u00020\n0&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\f2\u0016\u0010*\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bj\u0002`\u000bJ\f\u0010+\u001a\u0004\u0018\u00010\u000e*\u00020(R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R,\u0010\u0006\u001a\u001e\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bj\u0002`\u000b\u0012\u0004\u0012\u00020\f0\u00078\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R \u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0013\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0012\u0010\u0019\u001a\u00020\u00148\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000¨\u0006,"}, d2 = {"Landroidx/work/impl/constraints/SharedNetworkCallback;", "Landroid/net/ConnectivityManager$NetworkCallback;", "<init>", "()V", "requestsLock", "", "requests", "", "Lkotlin/Function1;", "Landroidx/work/impl/constraints/ConstraintsState;", "", "Landroidx/work/impl/constraints/OnConstraintState;", "Landroid/net/NetworkRequest;", "cachedCapabilities", "Landroid/net/NetworkCapabilities;", "getCachedCapabilities", "()Landroid/net/NetworkCapabilities;", "setCachedCapabilities", "(Landroid/net/NetworkCapabilities;)V", "capabilitiesInitialized", "", "getCapabilitiesInitialized", "()Z", "setCapabilitiesInitialized", "(Z)V", "isBlocked", "onCapabilitiesChanged", "network", "Landroid/net/Network;", "networkCapabilities", "onBlockedStatusChanged", "blocked", "onLost", "dispatchOnConstraintState", "areNetworkConstraintsSatisfied", "request", "capabilities", "addCallback", "Lkotlin/Function0;", "connManager", "Landroid/net/ConnectivityManager;", "networkRequest", "onConstraintState", "getCurrentNetworkCapabilities", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final class SharedNetworkCallback extends ConnectivityManager.NetworkCallback {
    private static NetworkCapabilities cachedCapabilities;
    private static boolean capabilitiesInitialized;
    private static boolean isBlocked;
    public static final SharedNetworkCallback INSTANCE = new SharedNetworkCallback();
    private static final Object requestsLock = new Object();
    private static final Map<Function1<ConstraintsState, Unit>, NetworkRequest> requests = new LinkedHashMap();

    private SharedNetworkCallback() {
    }

    public final NetworkCapabilities getCachedCapabilities() {
        return cachedCapabilities;
    }

    public final void setCachedCapabilities(NetworkCapabilities networkCapabilities) {
        cachedCapabilities = networkCapabilities;
    }

    public final boolean getCapabilitiesInitialized() {
        return capabilitiesInitialized;
    }

    public final void setCapabilitiesInitialized(boolean z) {
        capabilitiesInitialized = z;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        String str;
        Intrinsics.checkNotNullParameter(network, "network");
        Intrinsics.checkNotNullParameter(networkCapabilities, "networkCapabilities");
        Logger logger = Logger.get();
        str = WorkConstraintsTrackerKt.TAG;
        logger.debug(str, "NetworkRequestConstraintController onCapabilitiesChanged callback");
        synchronized (requestsLock) {
            cachedCapabilities = networkCapabilities;
            Unit unit = Unit.INSTANCE;
        }
        dispatchOnConstraintState();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onBlockedStatusChanged(Network network, boolean blocked) {
        String str;
        Intrinsics.checkNotNullParameter(network, "network");
        Logger logger = Logger.get();
        str = WorkConstraintsTrackerKt.TAG;
        logger.debug(str, "NetworkRequestConstraintController onBlockedStatusChanged callback");
        synchronized (requestsLock) {
            if (isBlocked == blocked) {
                return;
            }
            isBlocked = blocked;
            Unit unit = Unit.INSTANCE;
            dispatchOnConstraintState();
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onLost(Network network) {
        String str;
        Intrinsics.checkNotNullParameter(network, "network");
        Logger logger = Logger.get();
        str = WorkConstraintsTrackerKt.TAG;
        logger.debug(str, "NetworkRequestConstraintController onLost callback");
        synchronized (requestsLock) {
            cachedCapabilities = null;
            Iterator<T> it = requests.keySet().iterator();
            while (it.hasNext()) {
                ((Function1) it.next()).invoke(new ConstraintsState.ConstraintsNotMet(7));
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    private final void dispatchOnConstraintState() {
        ConstraintsState.ConstraintsNotMet constraintsNotMet;
        ArrayList<Pair> arrayList = new ArrayList();
        synchronized (requestsLock) {
            Iterator<T> it = requests.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                Function1 function1 = (Function1) entry.getKey();
                if (INSTANCE.areNetworkConstraintsSatisfied((NetworkRequest) entry.getValue(), cachedCapabilities)) {
                    constraintsNotMet = ConstraintsState.ConstraintsMet.INSTANCE;
                } else {
                    constraintsNotMet = new ConstraintsState.ConstraintsNotMet(7);
                }
                arrayList.add(TuplesKt.to(function1, constraintsNotMet));
            }
            Unit unit = Unit.INSTANCE;
        }
        for (Pair pair : arrayList) {
            ((Function1) pair.component1()).invoke((ConstraintsState) pair.component2());
        }
    }

    private final boolean areNetworkConstraintsSatisfied(NetworkRequest request, NetworkCapabilities capabilities) {
        return !isBlocked && request.canBeSatisfiedBy(capabilities);
    }

    public final Function0<Unit> addCallback(final ConnectivityManager connManager, NetworkRequest networkRequest, final Function1<? super ConstraintsState, Unit> onConstraintState) {
        String str;
        ConstraintsState constraintsNotMet;
        String str2;
        Intrinsics.checkNotNullParameter(connManager, "connManager");
        Intrinsics.checkNotNullParameter(networkRequest, "networkRequest");
        Intrinsics.checkNotNullParameter(onConstraintState, "onConstraintState");
        synchronized (requestsLock) {
            Map<Function1<ConstraintsState, Unit>, NetworkRequest> map = requests;
            boolean isEmpty = map.isEmpty();
            map.put(onConstraintState, networkRequest);
            if (isEmpty) {
                Logger logger = Logger.get();
                str2 = WorkConstraintsTrackerKt.TAG;
                logger.debug(str2, "NetworkRequestConstraintController register shared callback");
                connManager.registerDefaultNetworkCallback(INSTANCE);
            }
            Logger logger2 = Logger.get();
            str = WorkConstraintsTrackerKt.TAG;
            logger2.debug(str, "NetworkRequestConstraintController send initial capabilities");
            SharedNetworkCallback sharedNetworkCallback = INSTANCE;
            if (sharedNetworkCallback.areNetworkConstraintsSatisfied(networkRequest, sharedNetworkCallback.getCurrentNetworkCapabilities(connManager))) {
                constraintsNotMet = ConstraintsState.ConstraintsMet.INSTANCE;
            } else {
                constraintsNotMet = new ConstraintsState.ConstraintsNotMet(7);
            }
            onConstraintState.invoke(constraintsNotMet);
            Unit unit = Unit.INSTANCE;
        }
        return new Function0() { // from class: androidx.work.impl.constraints.SharedNetworkCallback$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit addCallback$lambda$9;
                addCallback$lambda$9 = SharedNetworkCallback.addCallback$lambda$9(Function1.this, connManager);
                return addCallback$lambda$9;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit addCallback$lambda$9(Function1 function1, ConnectivityManager connectivityManager) {
        String str;
        synchronized (requestsLock) {
            Map<Function1<ConstraintsState, Unit>, NetworkRequest> map = requests;
            map.remove(function1);
            if (map.isEmpty()) {
                Logger logger = Logger.get();
                str = WorkConstraintsTrackerKt.TAG;
                logger.debug(str, "NetworkRequestConstraintController unregister shared callback");
                connectivityManager.unregisterNetworkCallback(INSTANCE);
                isBlocked = false;
                cachedCapabilities = null;
                capabilitiesInitialized = false;
            }
            Unit unit = Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    public final NetworkCapabilities getCurrentNetworkCapabilities(ConnectivityManager connectivityManager) {
        Intrinsics.checkNotNullParameter(connectivityManager, "<this>");
        if (capabilitiesInitialized) {
            return cachedCapabilities;
        }
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        cachedCapabilities = networkCapabilities;
        capabilitiesInitialized = true;
        return networkCapabilities;
    }
}
