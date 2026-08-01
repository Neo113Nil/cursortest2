package com.google.android.gms.internal.ads;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.CountDownLatch;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzaqw implements Runnable {
    private zzaqw() {
    }

    /* synthetic */ zzaqw(zzaqv zzaqvVar) {
    }

    @Override // java.lang.Runnable
    public final void run() {
        CountDownLatch countDownLatch;
        try {
            zzaqx.zzd = MessageDigest.getInstance("MD5");
            countDownLatch = zzaqx.zzb;
        } catch (NoSuchAlgorithmException unused) {
            countDownLatch = zzaqx.zzb;
        } catch (Throwable th) {
            zzaqx.zzb.countDown();
            throw th;
        }
        countDownLatch.countDown();
    }
}
