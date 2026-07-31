package b6;

import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final f f3714a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3715b;

    /* renamed from: d, reason: collision with root package name */
    public final a6.c f3717d;

    /* renamed from: c, reason: collision with root package name */
    public volatile Map f3716c = l5.q.f5304f;

    /* renamed from: e, reason: collision with root package name */
    public final a6.b f3718e = new a6.b(this, N.p.b(new StringBuilder(), Y5.e.f3103b, " ConnectionPool connection closer"));

    /* renamed from: f, reason: collision with root package name */
    public final ConcurrentLinkedQueue f3719f = new ConcurrentLinkedQueue();

    static {
        AtomicReferenceFieldUpdater.newUpdater(s.class, Map.class, "c");
    }

    public s(a6.e eVar, TimeUnit timeUnit, f fVar, X5.g gVar) {
        this.f3714a = fVar;
        this.f3715b = timeUnit.toNanos(5L);
        this.f3717d = eVar.d();
    }

    public final int a(r rVar, long j4) {
        TimeZone timeZone = Y5.e.f3102a;
        ArrayList arrayList = rVar.f3712r;
        int i7 = 0;
        while (i7 < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i7);
            if (reference.get() != null) {
                i7++;
            } else {
                String str = "A connection to " + rVar.f3698d.f3079a.f2885h + " was leaked. Did you forget to close a response body?";
                h6.e eVar = h6.e.f4355a;
                h6.e.f4355a.k(((o) reference).f3678a, str);
                arrayList.remove(i7);
                if (arrayList.isEmpty()) {
                    rVar.f3713s = j4 - this.f3715b;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }
}
