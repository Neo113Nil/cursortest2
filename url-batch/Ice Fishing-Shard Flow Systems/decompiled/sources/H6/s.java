package H6;

import D6.C0100h;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.collections.I;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final long f1102a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Map f1103b;

    /* renamed from: c, reason: collision with root package name */
    public final G6.c f1104c;

    /* renamed from: d, reason: collision with root package name */
    public final G6.b f1105d;

    /* renamed from: e, reason: collision with root package name */
    public final ConcurrentLinkedQueue f1106e;

    static {
        AtomicReferenceFieldUpdater.newUpdater(s.class, Map.class, "b");
    }

    public s(G6.d taskRunner, C0100h exchangeFinderFactory) {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        e connectionListener = e.f1035a;
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        Intrinsics.checkNotNullParameter(connectionListener, "connectionListener");
        Intrinsics.checkNotNullParameter(exchangeFinderFactory, "exchangeFinderFactory");
        this.f1102a = timeUnit.toNanos(5L);
        this.f1103b = I.c();
        this.f1104c = taskRunner.d();
        this.f1105d = new G6.b(this, r4.f.f(new StringBuilder(), E6.e.f713b, " ConnectionPool connection closer"));
        this.f1106e = new ConcurrentLinkedQueue();
    }

    public final int a(r rVar, long j) {
        TimeZone timeZone = E6.e.f712a;
        ArrayList arrayList = rVar.f1100q;
        int i2 = 0;
        while (i2 < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i2);
            if (reference.get() != null) {
                i2++;
            } else {
                String str = "A connection to " + rVar.f1088d.f444a.f463h + " was leaked. Did you forget to close a response body?";
                N6.e eVar = N6.e.f1879a;
                N6.e.f1879a.k(((o) reference).f1068a, str);
                arrayList.remove(i2);
                if (arrayList.isEmpty()) {
                    rVar.f1101r = j - this.f1102a;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }
}
