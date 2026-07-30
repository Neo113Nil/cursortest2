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
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* loaded from: classes.dex */
public final class AFi1qSDK extends AFi1pSDK {

    @Metadata
    /* renamed from: com.appsflyer.internal.AFi1qSDK$1, reason: invalid class name */
    public static final class AnonymousClass1 extends kotlin.jvm.internal.p implements Function1<Network, NetworkInfo> {
        public AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: x_, reason: merged with bridge method [inline-methods] */
        public final NetworkInfo invoke(Network network) {
            ConnectivityManager connectivityManager = AFi1qSDK.this.AFAdRevenueData;
            Intrinsics.b(connectivityManager);
            return connectivityManager.getNetworkInfo(network);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFi1qSDK(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
    }

    private static boolean w_(NetworkCapabilities networkCapabilities) {
        return (networkCapabilities == null || !networkCapabilities.hasTransport(4) || networkCapabilities.hasCapability(15)) ? false : true;
    }

    @Override // com.appsflyer.internal.AFi1pSDK
    public final boolean getCurrencyIso4217Code() {
        Network[] allNetworks;
        try {
            ConnectivityManager connectivityManager = this.AFAdRevenueData;
            if (connectivityManager == null || (allNetworks = connectivityManager.getAllNetworks()) == null) {
                return false;
            }
            ArrayList arrayList = new ArrayList();
            for (Network network : allNetworks) {
                ConnectivityManager connectivityManager2 = this.AFAdRevenueData;
                Intrinsics.b(connectivityManager2);
                NetworkCapabilities networkCapabilities = connectivityManager2.getNetworkCapabilities(network);
                if (networkCapabilities != null) {
                    arrayList.add(networkCapabilities);
                }
            }
            if (arrayList.isEmpty()) {
                return false;
            }
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                if (w_((NetworkCapabilities) obj)) {
                    return true;
                }
            }
            return false;
        } catch (Exception e7) {
            AFLogger.afErrorLog("Failed collecting ivc data", e7);
            return false;
        }
    }

    @Override // com.appsflyer.internal.AFi1pSDK
    public final String getRevenue() {
        Network[] allNetworks;
        Object obj;
        ConnectivityManager connectivityManager = this.AFAdRevenueData;
        if (connectivityManager == null || (allNetworks = connectivityManager.getAllNetworks()) == null) {
            return "unknown";
        }
        Intrinsics.checkNotNullParameter(allNetworks, "<this>");
        Sequence nVar = allNetworks.length == 0 ? l6.d.f6309a : new c6.n(1, allNetworks);
        if (nVar == null) {
            return "unknown";
        }
        AnonymousClass1 transform = new AnonymousClass1();
        Intrinsics.checkNotNullParameter(nVar, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        l6.n nVar2 = new l6.n(nVar, transform);
        Intrinsics.checkNotNullParameter(nVar2, "<this>");
        c2.i predicate = new c2.i(2);
        Intrinsics.checkNotNullParameter(nVar2, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        l6.e eVar = new l6.e(new l6.f(nVar2, false, predicate));
        while (true) {
            if (!eVar.hasNext()) {
                obj = null;
                break;
            }
            obj = eVar.next();
            if (AFi1pSDK.v_((NetworkInfo) obj)) {
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
}
