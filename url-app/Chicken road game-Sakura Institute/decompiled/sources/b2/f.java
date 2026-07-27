package b2;

import Z1.r;
import c2.C0538b;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f5639a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final V1.f f5640b;

    /* renamed from: c, reason: collision with root package name */
    public final C0538b f5641c;

    /* renamed from: d, reason: collision with root package name */
    public final C0538b f5642d;

    public f(V1.f fVar, r rVar, r rVar2) {
        this.f5640b = fVar;
        this.f5641c = new C0538b(rVar, 1);
        this.f5642d = new C0538b(rVar2, 0);
    }

    public final synchronized e a(g2.i iVar) {
        e eVar;
        try {
            eVar = (e) this.f5639a.get(iVar);
            if (eVar == null) {
                g2.d dVar = new g2.d();
                dVar.f6690h = 2;
                dVar.f6692j = false;
                V1.f fVar = this.f5640b;
                fVar.b();
                if (!"[DEFAULT]".equals(fVar.f4166b)) {
                    V1.f fVar2 = this.f5640b;
                    fVar2.b();
                    dVar.e(fVar2.f4166b);
                }
                V1.f fVar3 = this.f5640b;
                synchronized (dVar) {
                    dVar.f6691i = fVar3;
                }
                dVar.f6685c = this.f5641c;
                dVar.f6686d = this.f5642d;
                e eVar2 = new e(dVar, iVar);
                this.f5639a.put(iVar, eVar2);
                eVar = eVar2;
            }
        } catch (Throwable th) {
            throw th;
        }
        return eVar;
    }
}
