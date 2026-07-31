package com.startapp.sdk.adsbase.remoteconfig;

import androidx.work.PeriodicWorkRequest;
import com.onesignal.core.internal.config.InfluenceConfigModel;
import com.startapp.sdk.internal.zh;
import java.io.Serializable;
import java.util.Arrays;
import java.util.WeakHashMap;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public class BluetoothConfig implements Serializable {
    private static final long serialVersionUID = 6500835630965723999L;
    private int timeoutInSec = 20;
    private boolean enabled = false;
    private int discoveryIntervalInMinutes = InfluenceConfigModel.DEFAULT_INDIRECT_ATTRIBUTION_WINDOW;
    private long refreshInterval = PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS;

    public final int a() {
        return this.discoveryIntervalInMinutes;
    }

    public final long b() {
        return this.refreshInterval;
    }

    public final int c() {
        return this.timeoutInSec;
    }

    public final boolean d() {
        return this.enabled;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            BluetoothConfig bluetoothConfig = (BluetoothConfig) obj;
            if (this.timeoutInSec == bluetoothConfig.timeoutInSec && this.enabled == bluetoothConfig.enabled && this.discoveryIntervalInMinutes == bluetoothConfig.discoveryIntervalInMinutes && this.refreshInterval == bluetoothConfig.refreshInterval) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object[] objArr = {Integer.valueOf(this.timeoutInSec), Boolean.valueOf(this.enabled), Integer.valueOf(this.discoveryIntervalInMinutes), Long.valueOf(this.refreshInterval)};
        WeakHashMap weakHashMap = zh.f528a;
        return Arrays.deepHashCode(objArr);
    }
}
