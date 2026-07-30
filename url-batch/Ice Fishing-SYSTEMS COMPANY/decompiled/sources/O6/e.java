package O6;

import com.google.android.gms.internal.ads.C3112dq;
import e8.i;
import e8.n;
import e8.o;
import e8.q;
import e8.r;
import e8.s;
import java.time.Duration;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLContext;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f2535a;

    /* renamed from: b, reason: collision with root package name */
    public final s f2536b;

    /* renamed from: c, reason: collision with root package name */
    public final o f2537c;

    /* renamed from: d, reason: collision with root package name */
    public final I6.d f2538d;

    /* renamed from: e, reason: collision with root package name */
    public final q f2539e;

    public e(String str, long j9, long j10, I6.d dVar, V6.a aVar, SSLContext sSLContext) {
        Duration ofNanos;
        long millis;
        Duration ofNanos2;
        long millis2;
        Duration duration;
        long millis3;
        Duration duration2;
        long millis4;
        ofNanos = Duration.ofNanos(j9);
        millis = ofNanos.toMillis();
        int min = (int) Math.min(millis, 2147483647L);
        ofNanos2 = Duration.ofNanos(j10);
        millis2 = ofNanos2.toMillis();
        int min2 = (int) Math.min(millis2, 2147483647L);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), new T2.b("okhttp-dispatch"));
        C3112dq c3112dq = new C3112dq();
        c3112dq.f30234v = threadPoolExecutor;
        this.f2535a = true;
        r rVar = new r();
        rVar.f37448a = c3112dq;
        duration = Duration.ofMillis(min2);
        kotlin.jvm.internal.h.e(duration, "duration");
        millis3 = duration.toMillis();
        TimeUnit unit = TimeUnit.MILLISECONDS;
        kotlin.jvm.internal.h.e(unit, "unit");
        rVar.f37466t = f8.d.b(millis3);
        duration2 = Duration.ofMillis(min);
        kotlin.jvm.internal.h.e(duration2, "duration");
        millis4 = duration2.toMillis();
        rVar.f37465s = f8.d.b(millis4);
        if (aVar != null) {
            rVar.f37450c.add(new h(aVar, new G6.b(14)));
        }
        if (str.startsWith("http://")) {
            List connectionSpecs = Collections.singletonList(i.f37404f);
            kotlin.jvm.internal.h.e(connectionSpecs, "connectionSpecs");
            connectionSpecs.equals(rVar.f37461o);
            rVar.f37461o = f8.d.j(connectionSpecs);
        }
        this.f2536b = new s(rVar);
        n nVar = new n();
        q qVar = null;
        nVar.c(null, str);
        this.f2537c = nVar.a();
        M7.i iVar = q.f37445b;
        try {
            qVar = com.bumptech.glide.e.n("application/x-protobuf");
        } catch (IllegalArgumentException unused) {
        }
        this.f2539e = qVar;
        this.f2538d = dVar;
    }
}
