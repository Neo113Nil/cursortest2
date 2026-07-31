package f2;

import c2.h;
import java.util.List;

/* loaded from: classes.dex */
final class b implements h {

    /* renamed from: f, reason: collision with root package name */
    private final List<c2.b> f16178f;

    public b(List<c2.b> list) {
        this.f16178f = list;
    }

    @Override // c2.h
    public int b(long j7) {
        return -1;
    }

    @Override // c2.h
    public long d(int i7) {
        return 0L;
    }

    @Override // c2.h
    public List<c2.b> e(long j7) {
        return this.f16178f;
    }

    @Override // c2.h
    public int f() {
        return 1;
    }
}
