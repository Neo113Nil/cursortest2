package j2;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import o2.m0;

/* loaded from: classes.dex */
final class h implements c2.h {

    /* renamed from: f, reason: collision with root package name */
    private final d f18151f;

    /* renamed from: g, reason: collision with root package name */
    private final long[] f18152g;

    /* renamed from: h, reason: collision with root package name */
    private final Map<String, g> f18153h;

    /* renamed from: i, reason: collision with root package name */
    private final Map<String, e> f18154i;

    /* renamed from: j, reason: collision with root package name */
    private final Map<String, String> f18155j;

    public h(d dVar, Map<String, g> map, Map<String, e> map2, Map<String, String> map3) {
        this.f18151f = dVar;
        this.f18154i = map2;
        this.f18155j = map3;
        this.f18153h = map != null ? Collections.unmodifiableMap(map) : Collections.emptyMap();
        this.f18152g = dVar.j();
    }

    @Override // c2.h
    public int b(long j7) {
        int e7 = m0.e(this.f18152g, j7, false, false);
        if (e7 < this.f18152g.length) {
            return e7;
        }
        return -1;
    }

    @Override // c2.h
    public long d(int i7) {
        return this.f18152g[i7];
    }

    @Override // c2.h
    public List<c2.b> e(long j7) {
        return this.f18151f.h(j7, this.f18153h, this.f18154i, this.f18155j);
    }

    @Override // c2.h
    public int f() {
        return this.f18152g.length;
    }
}
