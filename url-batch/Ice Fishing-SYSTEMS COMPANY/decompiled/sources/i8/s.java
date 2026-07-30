package i8;

import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import t0.AbstractC5051n;

/* loaded from: classes2.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final f f38423a;

    /* renamed from: b, reason: collision with root package name */
    public final long f38424b;

    /* renamed from: d, reason: collision with root package name */
    public final h8.c f38426d;

    /* renamed from: c, reason: collision with root package name */
    public volatile Map f38425c = r7.q.f40359n;

    /* renamed from: e, reason: collision with root package name */
    public final h8.b f38427e = new h8.b(this, AbstractC5051n.g(new StringBuilder(), f8.d.f37816b, " ConnectionPool connection closer"));

    /* renamed from: f, reason: collision with root package name */
    public final ConcurrentLinkedQueue f38428f = new ConcurrentLinkedQueue();

    static {
        AtomicReferenceFieldUpdater.newUpdater(s.class, Map.class, "c");
    }

    public s(h8.e eVar, TimeUnit timeUnit, f fVar, e8.g gVar) {
        this.f38423a = fVar;
        this.f38424b = timeUnit.toNanos(5L);
        this.f38426d = eVar.d();
    }

    public final int a(r rVar, long j9) {
        TimeZone timeZone = f8.d.f37815a;
        ArrayList arrayList = rVar.f38421r;
        int i = 0;
        while (i < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                String str = "A connection to " + rVar.f38408d.f37540a.f37351h + " was leaked. Did you forget to close a response body?";
                o8.f fVar = o8.f.f39739a;
                o8.f.f39739a.k(((o) reference).f38388a, str);
                arrayList.remove(i);
                if (arrayList.isEmpty()) {
                    rVar.f38422s = j9 - this.f38424b;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }
}
