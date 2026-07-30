package t5;

import java.util.Stack;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class g extends e {

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ h f8897j;

    public g(h hVar) {
        this.f8897j = hVar;
    }

    @Override // t5.e
    public final void h0(c cVar, s sVar) {
        h hVar = this.f8897j;
        Stack stack = hVar.f8899b;
        hVar.c();
        if (hVar.f8902e) {
            hVar.f8898a.append(",");
        }
        hVar.f8898a.append(o5.j.f(cVar.f8889f));
        hVar.f8898a.append(":(");
        if (hVar.f8901d == stack.size()) {
            stack.add(cVar);
        } else {
            stack.set(hVar.f8901d, cVar);
        }
        hVar.f8901d++;
        hVar.f8902e = false;
        q5.g.n(sVar, hVar);
        hVar.f8901d--;
        StringBuilder sb = hVar.f8898a;
        if (sb != null) {
            sb.append(")");
        }
        hVar.f8902e = true;
    }
}
