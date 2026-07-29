package com.google.android.gms.drive.events;

import android.os.Looper;
import com.google.android.gms.drive.events.DriveEventService;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes.dex */
final class zzh extends Thread {
    private final /* synthetic */ CountDownLatch zzcl;
    private final /* synthetic */ DriveEventService zzcm;

    zzh(DriveEventService driveEventService, CountDownLatch countDownLatch) {
        this.zzcm = driveEventService;
        this.zzcl = countDownLatch;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        CountDownLatch countDownLatch;
        CountDownLatch countDownLatch2;
        try {
            Looper.prepare();
            this.zzcm.zzci = new DriveEventService.zza(this.zzcm, null);
            this.zzcm.zzcj = false;
            this.zzcl.countDown();
            Looper.loop();
        } finally {
            countDownLatch = this.zzcm.zzch;
            if (countDownLatch != null) {
                countDownLatch2 = this.zzcm.zzch;
                countDownLatch2.countDown();
            }
        }
    }
}
