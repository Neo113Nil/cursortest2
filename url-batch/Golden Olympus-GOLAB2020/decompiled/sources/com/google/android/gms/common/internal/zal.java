package com.google.android.gms.common.internal;

import android.content.Context;
import android.util.SparseIntArray;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api;

/* loaded from: classes.dex */
public final class zal {
    private final SparseIntArray zaa;
    private GoogleApiAvailabilityLight zab;

    public zal() {
        this(GoogleApiAvailability.getInstance());
    }

    public final int zaa(Context context, int i4) {
        int i5;
        synchronized (this.zaa) {
            i5 = this.zaa.get(i4, -1);
        }
        return i5;
    }

    public final int zab(Context context, Api.Client client) {
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(client);
        int i4 = 0;
        if (!client.requiresGooglePlayServices()) {
            return 0;
        }
        int minApkVersion = client.getMinApkVersion();
        int zaa = zaa(context, minApkVersion);
        if (zaa != -1) {
            return zaa;
        }
        synchronized (this.zaa) {
            int i5 = 0;
            while (true) {
                try {
                    if (i5 >= this.zaa.size()) {
                        i4 = -1;
                        break;
                    }
                    int keyAt = this.zaa.keyAt(i5);
                    if (keyAt > minApkVersion && this.zaa.get(keyAt) == 0) {
                        break;
                    }
                    i5++;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (i4 == -1) {
                i4 = this.zab.isGooglePlayServicesAvailable(context, minApkVersion);
            }
            this.zaa.put(minApkVersion, i4);
        }
        return i4;
    }

    public final void zac() {
        synchronized (this.zaa) {
            this.zaa.clear();
        }
    }

    public zal(GoogleApiAvailabilityLight googleApiAvailabilityLight) {
        this.zaa = new SparseIntArray();
        Preconditions.checkNotNull(googleApiAvailabilityLight);
        this.zab = googleApiAvailabilityLight;
    }
}
