package com.appsflyer.internal;

import M2.p;
import T2.n;
import T2.r;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import com.appsflyer.AFLogger;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import z2.C1437u;

/* loaded from: classes.dex */
public final class AFi1ySDK extends AFi1xSDK {

    @Metadata
    /* renamed from: com.appsflyer.internal.AFi1ySDK$3, reason: invalid class name */
    public static final class AnonymousClass3 extends p implements Function1<Network, NetworkInfo> {
        public AnonymousClass3() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: values, reason: merged with bridge method [inline-methods] */
        public final NetworkInfo invoke(Network network) {
            ConnectivityManager connectivityManager = AFi1ySDK.this.AFInAppEventType;
            Intrinsics.c(connectivityManager);
            return connectivityManager.getNetworkInfo(network);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFi1ySDK(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
    }

    private static boolean AFInAppEventParameterName(NetworkCapabilities networkCapabilities) {
        return (networkCapabilities == null || !networkCapabilities.hasTransport(4) || networkCapabilities.hasCapability(15)) ? false : true;
    }

    @Override // com.appsflyer.internal.AFi1xSDK
    public final String valueOf() {
        Network[] allNetworks;
        Object obj;
        ConnectivityManager connectivityManager = this.AFInAppEventType;
        if (connectivityManager != null && (allNetworks = connectivityManager.getAllNetworks()) != null) {
            Intrinsics.checkNotNullParameter(allNetworks, "<this>");
            Sequence d4 = allNetworks.length == 0 ? n.d() : new C1437u(0, allNetworks);
            if (d4 != null) {
                T2.f fVar = new T2.f(r.j(d4, new AnonymousClass3()));
                while (true) {
                    if (!fVar.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = fVar.next();
                    if (AFi1xSDK.AFInAppEventParameterName((NetworkInfo) obj)) {
                        break;
                    }
                }
                NetworkInfo networkInfo = (NetworkInfo) obj;
                if (networkInfo != null) {
                    int type = networkInfo.getType();
                    return type != 0 ? type != 1 ? "unknown" : "WIFI" : "MOBILE";
                }
            }
        }
        return "unknown";
    }

    @Override // com.appsflyer.internal.AFi1xSDK
    public final boolean values() {
        Network[] allNetworks;
        try {
            ConnectivityManager connectivityManager = this.AFInAppEventType;
            if (connectivityManager == null || (allNetworks = connectivityManager.getAllNetworks()) == null) {
                return false;
            }
            ArrayList arrayList = new ArrayList();
            for (Network network : allNetworks) {
                ConnectivityManager connectivityManager2 = this.AFInAppEventType;
                Intrinsics.c(connectivityManager2);
                NetworkCapabilities networkCapabilities = connectivityManager2.getNetworkCapabilities(network);
                if (networkCapabilities != null) {
                    arrayList.add(networkCapabilities);
                }
            }
            if (arrayList.isEmpty()) {
                return false;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (AFInAppEventParameterName((NetworkCapabilities) it.next())) {
                    return true;
                }
            }
            return false;
        } catch (Exception e4) {
            AFLogger.afErrorLog("Failed collecting ivc data", e4);
            return false;
        }
    }
}
