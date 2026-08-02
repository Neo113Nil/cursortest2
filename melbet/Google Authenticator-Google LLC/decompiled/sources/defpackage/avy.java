package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avy extends ConnectivityManager.NetworkCallback {
    public static final avy a = new avy();
    public static final Object b = new Object();
    public static final Map c = new LinkedHashMap();
    public static NetworkCapabilities d;
    public static boolean e;
    public static Boolean f;

    private static final void b() {
        ArrayList<kol> arrayList = new ArrayList();
        synchronized (b) {
            if (e && f != null) {
                for (Map.Entry entry : c.entrySet()) {
                    arrayList.add(new kol((krt) entry.getKey(), a.a((NetworkRequest) entry.getValue(), d) ? avt.a : new avu(7)));
                }
                for (kol kolVar : arrayList) {
                    ((krt) kolVar.a).a((zy) kolVar.b);
                }
                return;
            }
            asq.a();
            String str = awa.a;
            Objects.toString(f);
        }
    }

    public final boolean a(NetworkRequest networkRequest, NetworkCapabilities networkCapabilities) {
        boolean canBeSatisfiedBy;
        Boolean bool = f;
        bool.getClass();
        if (bool.booleanValue()) {
            return false;
        }
        canBeSatisfiedBy = networkRequest.canBeSatisfiedBy(networkCapabilities);
        return canBeSatisfiedBy;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onBlockedStatusChanged(Network network, boolean z) {
        network.getClass();
        asq.a();
        String str = awa.a;
        synchronized (b) {
            Boolean bool = f;
            Boolean valueOf = Boolean.valueOf(z);
            if (ksp.b(bool, valueOf)) {
                return;
            }
            f = valueOf;
            b();
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        network.getClass();
        networkCapabilities.getClass();
        asq.a();
        String str = awa.a;
        synchronized (b) {
            d = networkCapabilities;
            e = true;
        }
        b();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        network.getClass();
        asq.a();
        String str = awa.a;
        synchronized (b) {
            d = null;
            Iterator it = c.keySet().iterator();
            while (it.hasNext()) {
                ((krt) it.next()).a(new avu(7));
            }
        }
    }
}
