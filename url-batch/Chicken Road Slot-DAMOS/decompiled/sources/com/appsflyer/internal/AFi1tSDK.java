package com.appsflyer.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import com.appsflyer.AFLogger;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.Sequence;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class AFi1tSDK extends AFi1qSDK {

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0010\u0001\u001a\u0006*\u00020\u00000\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/net/Network;", "p0", "Landroid/net/NetworkInfo;", "x_", "(Landroid/net/Network;)Landroid/net/NetworkInfo;"}, k = a4.j.INTEGER_FIELD_NUMBER, mv = {1, a4.j.BYTES_FIELD_NUMBER, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFi1tSDK$2, reason: invalid class name */
    public static final class AnonymousClass2 extends wd.p implements Function1<Network, NetworkInfo> {
        public AnonymousClass2() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: x_, reason: merged with bridge method [inline-methods] */
        public final NetworkInfo invoke(Network network) {
            ConnectivityManager connectivityManager = AFi1tSDK.this.getMonetizationNetwork;
            connectivityManager.getClass();
            return connectivityManager.getNetworkInfo(network);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFi1tSDK(Context context) {
        super(context);
        context.getClass();
    }

    private static boolean w_(NetworkCapabilities networkCapabilities) {
        return (networkCapabilities == null || !networkCapabilities.hasTransport(4) || networkCapabilities.hasCapability(15)) ? false : true;
    }

    @Override // com.appsflyer.internal.AFi1qSDK
    public final String AFAdRevenueData() {
        Network[] allNetworks;
        Object obj;
        ConnectivityManager connectivityManager = this.getMonetizationNetwork;
        if (connectivityManager == null || (allNetworks = connectivityManager.getAllNetworks()) == null) {
            return "unknown";
        }
        Sequence jVar = allNetworks.length == 0 ? de.b.f3703a : new de.j(1, allNetworks);
        if (jVar == null) {
            return "unknown";
        }
        de.c cVar = new de.c(new de.d(new de.o(jVar, new AnonymousClass2(), 1), new a1.f(14), 0));
        while (true) {
            if (!cVar.hasNext()) {
                obj = null;
                break;
            }
            obj = cVar.next();
            if (AFi1qSDK.v_((NetworkInfo) obj)) {
                break;
            }
        }
        NetworkInfo networkInfo = (NetworkInfo) obj;
        if (networkInfo == null) {
            return "unknown";
        }
        int type = networkInfo.getType();
        return type != 0 ? type != 1 ? "unknown" : "WIFI" : "MOBILE";
    }

    @Override // com.appsflyer.internal.AFi1qSDK
    public final boolean getMediationNetwork() {
        Network[] allNetworks;
        try {
            ConnectivityManager connectivityManager = this.getMonetizationNetwork;
            if (connectivityManager == null || (allNetworks = connectivityManager.getAllNetworks()) == null) {
                return false;
            }
            ArrayList arrayList = new ArrayList();
            for (Network network : allNetworks) {
                ConnectivityManager connectivityManager2 = this.getMonetizationNetwork;
                connectivityManager2.getClass();
                NetworkCapabilities networkCapabilities = connectivityManager2.getNetworkCapabilities(network);
                if (networkCapabilities != null) {
                    arrayList.add(networkCapabilities);
                }
            }
            if (arrayList.isEmpty()) {
                return false;
            }
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                if (w_((NetworkCapabilities) obj)) {
                    return true;
                }
            }
            return false;
        } catch (Exception e2) {
            AFLogger.afErrorLog("Failed collecting ivc data", e2);
            return false;
        }
    }
}
