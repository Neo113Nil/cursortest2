package g5;

import e5.r;
import java.util.HashMap;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f4464a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final a5.f f4465b;

    /* renamed from: c, reason: collision with root package name */
    public final h5.b f4466c;

    /* renamed from: d, reason: collision with root package name */
    public final h5.b f4467d;

    public f(a5.f fVar, r rVar, r rVar2) {
        this.f4465b = fVar;
        this.f4466c = new h5.b(rVar, 1);
        this.f4467d = new h5.b(rVar2, 0);
    }

    public final synchronized e a(l5.j jVar) {
        e eVar;
        try {
            eVar = (e) this.f4464a.get(jVar);
            if (eVar == null) {
                l5.d dVar = new l5.d();
                dVar.f6019h = 2;
                dVar.f6021j = false;
                a5.f fVar = this.f4465b;
                fVar.b();
                if (!"[DEFAULT]".equals(fVar.f500b)) {
                    a5.f fVar2 = this.f4465b;
                    fVar2.b();
                    dVar.d(fVar2.f500b);
                }
                a5.f fVar3 = this.f4465b;
                synchronized (dVar) {
                    dVar.f6020i = fVar3;
                }
                dVar.f6014c = this.f4466c;
                dVar.f6015d = this.f4467d;
                e eVar2 = new e(dVar, jVar);
                this.f4464a.put(jVar, eVar2);
                eVar = eVar2;
            }
        } catch (Throwable th) {
            throw th;
        }
        return eVar;
    }
}
