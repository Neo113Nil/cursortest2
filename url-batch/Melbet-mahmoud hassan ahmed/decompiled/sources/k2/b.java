package k2;

import c2.h;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
final class b implements h {

    /* renamed from: g, reason: collision with root package name */
    public static final b f18214g = new b();

    /* renamed from: f, reason: collision with root package name */
    private final List<c2.b> f18215f;

    private b() {
        this.f18215f = Collections.emptyList();
    }

    public b(c2.b bVar) {
        this.f18215f = Collections.singletonList(bVar);
    }

    @Override // c2.h
    public int b(long j7) {
        return j7 < 0 ? 0 : -1;
    }

    @Override // c2.h
    public long d(int i7) {
        o2.a.a(i7 == 0);
        return 0L;
    }

    @Override // c2.h
    public List<c2.b> e(long j7) {
        return j7 >= 0 ? this.f18215f : Collections.emptyList();
    }

    @Override // c2.h
    public int f() {
        return 1;
    }
}
