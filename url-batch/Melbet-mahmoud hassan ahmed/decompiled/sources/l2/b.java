package l2;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
final class b implements c2.h {

    /* renamed from: f, reason: collision with root package name */
    private final List<c2.b> f18536f;

    public b(List<c2.b> list) {
        this.f18536f = Collections.unmodifiableList(list);
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
        return j7 >= 0 ? this.f18536f : Collections.emptyList();
    }

    @Override // c2.h
    public int f() {
        return 1;
    }
}
