package defpackage;

import android.content.Context;
import android.os.SystemClock;
import android.util.Log;
import java.time.Duration;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class au1 {
    public static volatile au1 c;
    public static final Object d = new Object();
    public static final Duration e = Duration.ofMinutes(30);
    public final ct1 a;
    public final AtomicLong b = new AtomicLong(-1);

    public au1(Context context) {
        this.a = new ct1(context, new sg1("ads_identifier:api"));
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003d, code lost:
    
        if ((r3 - r17.b.get()) > defpackage.au1.e.toMillis()) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void a(int i, int i2, long j, long j2) {
        AtomicLong atomicLong = this.b;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Log.i("AdvertisingIdClient", "shouldSendLog " + atomicLong.get());
        if (this.b.get() != -1) {
        }
        ct1 ct1Var = this.a;
        if (ct1Var == null) {
            return;
        }
        zu1 b = ct1Var.b(new rg1(0, Arrays.asList(new ul0(35401, i, 0, j, j2, null, null, 0, i2))));
        xi1 xi1Var = new xi1(elapsedRealtime, this);
        b.getClass();
        b.c(og1.a, xi1Var);
    }
}
