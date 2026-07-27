package com.google.android.gms.ads.identifier;

import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class b extends Thread {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f4952a;

    /* renamed from: b, reason: collision with root package name */
    public final long f4953b;

    /* renamed from: c, reason: collision with root package name */
    public final CountDownLatch f4954c = new CountDownLatch(1);

    /* renamed from: d, reason: collision with root package name */
    public boolean f4955d = false;

    public b(AdvertisingIdClient advertisingIdClient, long j2) {
        this.f4952a = new WeakReference(advertisingIdClient);
        this.f4953b = j2;
        start();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        AdvertisingIdClient advertisingIdClient;
        WeakReference weakReference = this.f4952a;
        try {
            if (this.f4954c.await(this.f4953b, TimeUnit.MILLISECONDS) || (advertisingIdClient = (AdvertisingIdClient) weakReference.get()) == null) {
                return;
            }
            advertisingIdClient.zza();
            this.f4955d = true;
        } catch (InterruptedException unused) {
            AdvertisingIdClient advertisingIdClient2 = (AdvertisingIdClient) weakReference.get();
            if (advertisingIdClient2 != null) {
                advertisingIdClient2.zza();
                this.f4955d = true;
            }
        }
    }
}
