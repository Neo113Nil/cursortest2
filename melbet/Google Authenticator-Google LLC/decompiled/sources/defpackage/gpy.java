package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.BatteryManager;
import android.os.Process;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gpy implements gpx {
    private final /* synthetic */ int a;
    private final Object b;

    public gpy(Context context, ConnectivityManager connectivityManager, int i) {
        this.a = i;
        if (context.checkPermission("android.permission.INTERNET", Process.myPid(), Process.myUid()) == 0) {
            hoq.I(context.checkPermission("android.permission.ACCESS_NETWORK_STATE", Process.myPid(), Process.myUid()) == 0, "An app using the NETWORK_CONNECTED sync constraint must have the ACCESS_NETWORK_STATE permission.");
        }
        this.b = connectivityManager;
    }

    @Override // defpackage.gpx
    public final boolean a() {
        int i = this.a;
        if (i == 0) {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.b).getActiveNetworkInfo();
            return (activeNetworkInfo == null || !activeNetworkInfo.isConnected() || activeNetworkInfo.getDetailedState() == NetworkInfo.DetailedState.BLOCKED) ? false : true;
        }
        Object obj = this.b;
        if (i == 1) {
            return ((BatteryManager) obj).isCharging();
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) obj;
        boolean isActiveNetworkMetered = connectivityManager.isActiveNetworkMetered();
        NetworkInfo activeNetworkInfo2 = connectivityManager.getActiveNetworkInfo();
        return (isActiveNetworkMetered || activeNetworkInfo2 == null || !activeNetworkInfo2.isConnected() || activeNetworkInfo2.getDetailedState() == NetworkInfo.DetailedState.BLOCKED) ? false : true;
    }

    public gpy(Context context, int i) {
        this.a = i;
        this.b = (BatteryManager) context.getSystemService("batterymanager");
    }

    public gpy(Context context, ConnectivityManager connectivityManager, int i, byte[] bArr) {
        this.a = i;
        if (context.checkPermission("android.permission.INTERNET", Process.myPid(), Process.myUid()) == 0) {
            hoq.I(context.checkPermission("android.permission.ACCESS_NETWORK_STATE", Process.myPid(), Process.myUid()) == 0, "An app using the NETWORK_UNMETERED sync constraint must have the ACCESS_NETWORK_STATE permission.");
        }
        this.b = connectivityManager;
    }
}
