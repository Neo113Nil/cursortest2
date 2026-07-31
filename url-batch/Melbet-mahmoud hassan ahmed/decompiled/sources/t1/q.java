package t1;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: h, reason: collision with root package name */
    private static final AtomicLong f22181h = new AtomicLong();

    /* renamed from: a, reason: collision with root package name */
    public final long f22182a;

    /* renamed from: b, reason: collision with root package name */
    public final n2.p f22183b;

    /* renamed from: c, reason: collision with root package name */
    public final Uri f22184c;

    /* renamed from: d, reason: collision with root package name */
    public final Map<String, List<String>> f22185d;

    /* renamed from: e, reason: collision with root package name */
    public final long f22186e;

    /* renamed from: f, reason: collision with root package name */
    public final long f22187f;

    /* renamed from: g, reason: collision with root package name */
    public final long f22188g;

    public q(long j7, n2.p pVar, long j8) {
        this(j7, pVar, pVar.f19496a, Collections.emptyMap(), j8, 0L, 0L);
    }

    public q(long j7, n2.p pVar, Uri uri, Map<String, List<String>> map, long j8, long j9, long j10) {
        this.f22182a = j7;
        this.f22183b = pVar;
        this.f22184c = uri;
        this.f22185d = map;
        this.f22186e = j8;
        this.f22187f = j9;
        this.f22188g = j10;
    }

    public static long a() {
        return f22181h.getAndIncrement();
    }
}
