package com.google.android.gms.ads.identifier;

import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class b extends Thread {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f5752a;

    /* renamed from: b, reason: collision with root package name */
    public final long f5753b;

    /* renamed from: c, reason: collision with root package name */
    public final CountDownLatch f5754c = new CountDownLatch(1);

    /* renamed from: d, reason: collision with root package name */
    public boolean f5755d = false;

    public b(AdvertisingIdClient advertisingIdClient, long j4) {
        this.f5752a = new WeakReference(advertisingIdClient);
        this.f5753b = j4;
        start();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        AdvertisingIdClient advertisingIdClient;
        WeakReference weakReference = this.f5752a;
        try {
            if (this.f5754c.await(this.f5753b, TimeUnit.MILLISECONDS) || (advertisingIdClient = (AdvertisingIdClient) weakReference.get()) == null) {
                return;
            }
            advertisingIdClient.zza();
            this.f5755d = true;
        } catch (InterruptedException unused) {
            AdvertisingIdClient advertisingIdClient2 = (AdvertisingIdClient) weakReference.get();
            if (advertisingIdClient2 != null) {
                advertisingIdClient2.zza();
                this.f5755d = true;
            }
        }
    }
}
