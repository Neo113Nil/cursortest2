package p5;

import D6.j;
import D6.n;
import D6.r;
import D6.u;
import D6.v;
import D6.w;
import java.time.Duration;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import w5.C0992a;
import x5.ThreadFactoryC1016f;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f7204a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f7205b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f7206c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f7207d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f7208e;

    public d(boolean z7, String str, String str2, String str3, String str4) {
        this.f7205b = str == null ? "libapp.so" : str;
        this.f7206c = str2 == null ? "flutter_assets" : str2;
        this.f7208e = str4;
        this.f7207d = str3 == null ? "" : str3;
        this.f7204a = z7;
    }

    public d(String str, long j, long j7, j5.d dVar, C0992a c0992a, SSLContext sSLContext) {
        Duration ofNanos;
        long millis;
        Duration ofNanos2;
        long millis2;
        Duration duration;
        long millis3;
        Duration duration2;
        long millis4;
        ofNanos = Duration.ofNanos(j);
        millis = ofNanos.toMillis();
        int min = (int) Math.min(millis, 2147483647L);
        ofNanos2 = Duration.ofNanos(j7);
        millis2 = ofNanos2.toMillis();
        int min2 = (int) Math.min(millis2, 2147483647L);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), new ThreadFactoryC1016f(0));
        n dispatcher = new n();
        dispatcher.f542i = threadPoolExecutor;
        this.f7204a = true;
        v vVar = new v();
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        vVar.f573a = dispatcher;
        duration = Duration.ofMillis(min2);
        Intrinsics.checkNotNullParameter(duration, "duration");
        millis3 = duration.toMillis();
        TimeUnit unit = TimeUnit.MILLISECONDS;
        Intrinsics.checkNotNullParameter(unit, "unit");
        vVar.f591t = E6.e.b(millis3);
        duration2 = Duration.ofMillis(min);
        Intrinsics.checkNotNullParameter(duration2, "duration");
        millis4 = duration2.toMillis();
        Intrinsics.checkNotNullParameter(unit, "unit");
        vVar.f590s = E6.e.b(millis4);
        if (c0992a != null) {
            g interceptor = new g(c0992a, new C4.a(28));
            Intrinsics.checkNotNullParameter(interceptor, "interceptor");
            vVar.f575c.add(interceptor);
        }
        if (str.startsWith("http://")) {
            List connectionSpecs = Collections.singletonList(j.f518f);
            Intrinsics.checkNotNullParameter(connectionSpecs, "connectionSpecs");
            Intrinsics.a(connectionSpecs, vVar.f586o);
            vVar.f586o = E6.e.i(connectionSpecs);
        }
        this.f7205b = new w(vVar);
        Intrinsics.checkNotNullParameter(str, "<this>");
        r rVar = new r();
        u uVar = null;
        rVar.c(null, str);
        this.f7206c = rVar.a();
        Regex regex = u.f570b;
        Intrinsics.checkNotNullParameter("application/x-protobuf", "<this>");
        try {
            uVar = P0.f.p("application/x-protobuf");
        } catch (IllegalArgumentException unused) {
        }
        this.f7208e = uVar;
        this.f7207d = dVar;
    }
}
