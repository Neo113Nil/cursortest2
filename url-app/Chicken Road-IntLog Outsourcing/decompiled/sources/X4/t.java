package X4;

import b2.AbstractC0279e;
import g4.C0472q;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final int f3624a;

    /* renamed from: b, reason: collision with root package name */
    public final f f3625b;

    /* renamed from: c, reason: collision with root package name */
    public final long f3626c;

    /* renamed from: e, reason: collision with root package name */
    public final W4.c f3628e;

    /* renamed from: d, reason: collision with root package name */
    public volatile Map f3627d = C0472q.f5751a;

    /* renamed from: f, reason: collision with root package name */
    public final W4.b f3629f = new W4.b(this, AbstractC0279e.h(new StringBuilder(), U4.e.f3180b, " ConnectionPool connection closer"));

    /* renamed from: g, reason: collision with root package name */
    public final ConcurrentLinkedQueue f3630g = new ConcurrentLinkedQueue();

    static {
        AtomicReferenceFieldUpdater.newUpdater(t.class, Map.class, "d");
    }

    public t(W4.d dVar, int i2, long j2, TimeUnit timeUnit, f fVar, T4.g gVar) {
        this.f3624a = i2;
        this.f3625b = fVar;
        this.f3626c = timeUnit.toNanos(j2);
        this.f3628e = dVar.d();
        if (j2 > 0) {
            return;
        }
        throw new IllegalArgumentException(("keepAliveDuration <= 0: " + j2).toString());
    }

    public final int a(s sVar, long j2) {
        TimeZone timeZone = U4.e.f3179a;
        ArrayList arrayList = sVar.f3622s;
        int i2 = 0;
        while (i2 < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i2);
            if (reference.get() != null) {
                i2++;
            } else {
                String str = "A connection to " + sVar.f3607d.f2805a.f2824h + " was leaked. Did you forget to close a response body?";
                d5.e eVar = d5.e.f5492a;
                d5.e.f5492a.k(((p) reference).f3587a, str);
                arrayList.remove(i2);
                if (arrayList.isEmpty()) {
                    sVar.f3623t = j2 - this.f3626c;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }
}
