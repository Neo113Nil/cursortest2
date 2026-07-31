package z1;

import java.util.List;
import n2.j0;

/* loaded from: classes.dex */
public final class e implements k {

    /* renamed from: a, reason: collision with root package name */
    private final k f23535a;

    /* renamed from: b, reason: collision with root package name */
    private final List<s1.c> f23536b;

    public e(k kVar, List<s1.c> list) {
        this.f23535a = kVar;
        this.f23536b = list;
    }

    @Override // z1.k
    public j0.a<i> a(h hVar, g gVar) {
        return new s1.b(this.f23535a.a(hVar, gVar), this.f23536b);
    }

    @Override // z1.k
    public j0.a<i> b() {
        return new s1.b(this.f23535a.b(), this.f23536b);
    }
}
