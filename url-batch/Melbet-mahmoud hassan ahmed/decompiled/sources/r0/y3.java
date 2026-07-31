package r0;

import android.content.Context;
import android.net.wifi.WifiManager;

/* loaded from: classes.dex */
final class y3 {

    /* renamed from: a, reason: collision with root package name */
    private final WifiManager f21103a;

    /* renamed from: b, reason: collision with root package name */
    private WifiManager.WifiLock f21104b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f21105c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f21106d;

    public y3(Context context) {
        this.f21103a = (WifiManager) context.getApplicationContext().getSystemService("wifi");
    }

    private void c() {
        WifiManager.WifiLock wifiLock = this.f21104b;
        if (wifiLock == null) {
            return;
        }
        if (this.f21105c && this.f21106d) {
            wifiLock.acquire();
        } else {
            wifiLock.release();
        }
    }

    public void a(boolean z6) {
        if (z6 && this.f21104b == null) {
            WifiManager wifiManager = this.f21103a;
            if (wifiManager == null) {
                o2.r.i("WifiLockManager", "WifiManager is null, therefore not creating the WifiLock.");
                return;
            } else {
                WifiManager.WifiLock createWifiLock = wifiManager.createWifiLock(3, "ExoPlayer:WifiLockManager");
                this.f21104b = createWifiLock;
                createWifiLock.setReferenceCounted(false);
            }
        }
        this.f21105c = z6;
        c();
    }

    public void b(boolean z6) {
        this.f21106d = z6;
        c();
    }
}
