package l5;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class x {

    /* renamed from: d, reason: collision with root package name */
    public static final j4.i f6091d = new j4.i(18);

    /* renamed from: a, reason: collision with root package name */
    public Object f6092a;

    /* renamed from: b, reason: collision with root package name */
    public Object f6093b;

    /* renamed from: c, reason: collision with root package name */
    public Object f6094c;

    public x(l.v vVar, q5.j jVar) {
        this.f6094c = vVar;
        this.f6092a = jVar;
        this.f6093b = vVar.p(jVar.f7537a);
    }

    public static b b(ArrayList arrayList, o5.h hVar, f fVar) {
        b bVar = b.f6006g;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            v vVar = (v) obj;
            if (hVar.i(vVar)) {
                f fVar2 = vVar.f6082b;
                if (vVar.c()) {
                    if (fVar.x(fVar2)) {
                        bVar = bVar.a(f.B(fVar, fVar2), vVar.b());
                    } else if (fVar2.x(fVar)) {
                        bVar = bVar.a(f.f6023i, vVar.b().b(f.B(fVar2, fVar)));
                    }
                } else if (fVar.x(fVar2)) {
                    bVar = bVar.g(f.B(fVar, fVar2), vVar.a());
                } else if (fVar2.x(fVar)) {
                    f B = f.B(fVar2, fVar);
                    if (B.isEmpty()) {
                        bVar = bVar.g(f.f6023i, vVar.a());
                    } else {
                        t5.s z8 = vVar.a().z(B);
                        if (z8 != null) {
                            bVar = bVar.a(f.f6023i, z8);
                        }
                    }
                }
            }
        }
        return bVar;
    }

    public t5.s a(f fVar, t5.s sVar, List list, boolean z8) {
        if (!list.isEmpty() || z8) {
            b x8 = ((b) this.f6092a).x(fVar);
            if (z8 || !x8.f6007f.isEmpty()) {
                if (!z8 && sVar == null && x8.z(f.f6023i) == null) {
                    return null;
                }
                b b9 = b((ArrayList) this.f6093b, new androidx.room.c(z8, list, fVar), fVar);
                if (sVar == null) {
                    sVar = t5.k.f8908j;
                }
                return b9.m(sVar);
            }
        } else {
            t5.s z9 = ((b) this.f6092a).z(fVar);
            if (z9 != null) {
                return z9;
            }
            b x9 = ((b) this.f6092a).x(fVar);
            if (!x9.f6007f.isEmpty()) {
                if (sVar == null && x9.z(f.f6023i) == null) {
                    return null;
                }
                if (sVar == null) {
                    sVar = t5.k.f8908j;
                }
                return x9.m(sVar);
            }
        }
        return sVar;
    }

    public List c(g5.a aVar) {
        q5.j jVar = (q5.j) this.f6092a;
        l.v vVar = (l.v) this.f6094c;
        n5.a aVar2 = (n5.a) vVar.f5686g;
        if (aVar == null) {
            q5.i iVar = jVar.f7537a;
            t tVar = (t) this.f6093b;
            return tVar != null ? (List) aVar2.a(new o(vVar, tVar, 2)) : (List) aVar2.a(new o(vVar, iVar.f7535a, 1));
        }
        ((b1.b) vVar.f5687h).I("Listen at " + jVar.f7537a.f7535a + " failed: " + aVar.toString());
        return vVar.o(jVar.f7537a, null, aVar);
    }
}
