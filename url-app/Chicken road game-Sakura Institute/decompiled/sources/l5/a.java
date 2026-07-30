package l5;

import java.util.HashMap;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class a implements o5.d {

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f6005f;

    public a() {
        this.f6005f = new HashMap();
    }

    @Override // o5.d
    public Object a(f fVar, Object obj, Object obj2) {
        t5.s sVar = (t5.s) obj;
        int i7 = fVar.f6025g;
        String str = "/";
        if (!fVar.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            for (int i8 = i7; i8 < fVar.f6026h; i8++) {
                if (i8 > i7) {
                    sb.append("/");
                }
                sb.append(fVar.f6024f[i8].f8889f);
            }
            str = sb.toString();
        }
        this.f6005f.put(str, sVar.r(true));
        return null;
    }

    public void b(q5.c cVar) {
        int i7 = cVar.f7519a;
        t5.m mVar = cVar.f7520b;
        t5.c cVar2 = cVar.f7522d;
        o5.j.b("Only child changes supported for tracking", i7 == 2 || i7 == 4 || i7 == 1);
        o5.j.c(!cVar2.equals(t5.c.f8888i));
        HashMap hashMap = this.f6005f;
        if (!hashMap.containsKey(cVar2)) {
            hashMap.put(cVar2, cVar);
            return;
        }
        q5.c cVar3 = (q5.c) hashMap.get(cVar2);
        int i8 = cVar3.f7519a;
        t5.m mVar2 = cVar3.f7521c;
        if (i7 == 2 && i8 == 1) {
            hashMap.put(cVar2, new q5.c(4, mVar, cVar2, cVar3.f7520b));
            return;
        }
        if (i7 == 1 && i8 == 2) {
            hashMap.remove(cVar2);
            return;
        }
        if (i7 == 1 && i8 == 4) {
            hashMap.put(cVar2, new q5.c(1, mVar2, cVar2, null));
            return;
        }
        if (i7 == 4 && i8 == 2) {
            hashMap.put(cVar2, new q5.c(2, mVar, cVar2, null));
            return;
        }
        if (i7 == 4 && i8 == 4) {
            hashMap.put(cVar2, new q5.c(4, mVar, cVar2, mVar2));
            return;
        }
        throw new IllegalStateException("Illegal combination of changes: " + cVar + " occurred after " + cVar3);
    }

    public a(HashMap hashMap) {
        this.f6005f = hashMap;
    }
}
