package v6;

import a7.i;
import android.content.Context;
import android.os.SystemClock;
import android.util.Log;
import c7.k;
import c7.o;
import e7.d;
import java.time.Duration;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLong;
import s7.r0;
import w7.h;
import w7.n;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: c, reason: collision with root package name */
    public static volatile c f9979c;

    /* renamed from: d, reason: collision with root package name */
    public static final Object f9980d = new Object();

    /* renamed from: e, reason: collision with root package name */
    public static final Duration f9981e;

    /* renamed from: a, reason: collision with root package name */
    public final d f9982a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicLong f9983b = new AtomicLong(-1);

    static {
        Duration ofMinutes;
        ofMinutes = Duration.ofMinutes(30L);
        f9981e = ofMinutes;
    }

    public c(Context context) {
        this.f9982a = new d(context, d.f3954l, new o("ads_identifier:api"), i.f325c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003d, code lost:
    
        if (r5 > r7) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void a(int i3, int i10, long j, long j3) {
        long millis;
        AtomicLong atomicLong = this.f9983b;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Log.i("AdvertisingIdClient", "shouldSendLog " + atomicLong.get());
        if (this.f9983b.get() != -1) {
            long j10 = elapsedRealtime - this.f9983b.get();
            millis = f9981e.toMillis();
        }
        d dVar = this.f9982a;
        if (dVar == null) {
            return;
        }
        n c10 = dVar.c(new c7.n(0, Arrays.asList(new k(35401, i3, 0, j, j3, null, null, 0, i10))));
        r0 r0Var = new r0(this, elapsedRealtime, 2);
        c10.getClass();
        c10.c(h.f10118a, r0Var);
    }
}
