package e0;

import java.util.LinkedHashMap;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class f implements p.i {

    /* renamed from: a, reason: collision with root package name */
    public final long f2679a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f2680b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final e f2681c;

    public f(p.j jVar, long j8) {
        this.f2679a = j8;
        this.f2681c = new e(jVar.f6976a, 0, this);
    }

    @Override // p.i
    public final f7.f a() {
        return this.f2681c;
    }
}
