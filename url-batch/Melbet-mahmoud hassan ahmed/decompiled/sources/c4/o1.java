package c4;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
final class o1 {

    /* renamed from: a, reason: collision with root package name */
    private final ConcurrentHashMap<n1, List<Throwable>> f2053a = new ConcurrentHashMap<>(16, 0.75f, 10);

    /* renamed from: b, reason: collision with root package name */
    private final ReferenceQueue<Throwable> f2054b = new ReferenceQueue<>();

    o1() {
    }

    public final List<Throwable> a(Throwable th, boolean z6) {
        while (true) {
            Reference<? extends Throwable> poll = this.f2054b.poll();
            if (poll == null) {
                break;
            }
            this.f2053a.remove(poll);
        }
        List<Throwable> list = this.f2053a.get(new n1(th, null));
        if (list != null) {
            return list;
        }
        Vector vector = new Vector(2);
        List<Throwable> putIfAbsent = this.f2053a.putIfAbsent(new n1(th, this.f2054b), vector);
        return putIfAbsent == null ? vector : putIfAbsent;
    }
}
