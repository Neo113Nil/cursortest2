package com.appsflyer.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import androidx.core.os.EnvironmentCompat;
import com.appsflyer.AFLogger;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

/* loaded from: classes3.dex */
public final class AFh1eSDK extends AFh1hSDK {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFh1eSDK(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
    }

    private static boolean AFInAppEventParameterName(NetworkCapabilities networkCapabilities) {
        return (networkCapabilities == null || !networkCapabilities.hasTransport(4) || networkCapabilities.hasCapability(15)) ? false : true;
    }

    @Override // com.appsflyer.internal.AFh1hSDK
    protected final String AFInAppEventType() {
        Network[] allNetworks;
        Sequence asSequence;
        Sequence mapNotNull;
        Object obj;
        ConnectivityManager connectivityManager = this.valueOf;
        if (connectivityManager != null && (allNetworks = connectivityManager.getAllNetworks()) != null && (asSequence = ArraysKt.asSequence(allNetworks)) != null && (mapNotNull = SequencesKt.mapNotNull(asSequence, new Function1<Network, NetworkInfo>() { // from class: com.appsflyer.internal.AFh1eSDK.4
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: AFInAppEventType, reason: merged with bridge method [inline-methods] */
            public final NetworkInfo invoke(Network network) {
                ConnectivityManager connectivityManager2 = AFh1eSDK.this.valueOf;
                Intrinsics.checkNotNull(connectivityManager2);
                return connectivityManager2.getNetworkInfo(network);
            }
        })) != null) {
            Iterator it = mapNotNull.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (valueOf((NetworkInfo) obj)) {
                    break;
                }
            }
            NetworkInfo networkInfo = (NetworkInfo) obj;
            if (networkInfo != null) {
                int type = networkInfo.getType();
                if (type == 0) {
                    return "MOBILE";
                }
                if (type != 1) {
                    return EnvironmentCompat.MEDIA_UNKNOWN;
                }
                return "WIFI";
            }
        }
        return EnvironmentCompat.MEDIA_UNKNOWN;
    }

    @Override // com.appsflyer.internal.AFh1hSDK
    public final boolean values() {
        Network[] allNetworks;
        try {
            ConnectivityManager connectivityManager = this.valueOf;
            if (connectivityManager != null && (allNetworks = connectivityManager.getAllNetworks()) != null) {
                ArrayList arrayList = new ArrayList();
                for (Network network : allNetworks) {
                    ConnectivityManager connectivityManager2 = this.valueOf;
                    Intrinsics.checkNotNull(connectivityManager2);
                    NetworkCapabilities networkCapabilities = connectivityManager2.getNetworkCapabilities(network);
                    if (networkCapabilities != null) {
                        arrayList.add(networkCapabilities);
                    }
                }
                ArrayList arrayList2 = arrayList;
                if (!arrayList2.isEmpty()) {
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        if (AFInAppEventParameterName((NetworkCapabilities) it.next())) {
                            return true;
                        }
                    }
                }
            }
            return false;
        } catch (Exception e) {
            AFLogger.afErrorLog("Failed collecting ivc data", e);
            return false;
        }
    }
}
