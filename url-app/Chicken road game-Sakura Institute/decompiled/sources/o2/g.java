package o2;

import j2.AbstractC0720j;
import java.util.Stack;

/* loaded from: classes.dex */
public final class g extends e {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ h f8928h;

    public g(h hVar) {
        super(22);
        this.f8928h = hVar;
    }

    @Override // o2.e
    public final void W(C0924c c0924c, s sVar) {
        h hVar = this.f8928h;
        hVar.c();
        if (hVar.f8933e) {
            hVar.f8929a.append(",");
        }
        hVar.f8929a.append(AbstractC0720j.f(c0924c.f8920d));
        hVar.f8929a.append(":(");
        int i2 = hVar.f8932d;
        Stack stack = hVar.f8930b;
        if (i2 == stack.size()) {
            stack.add(c0924c);
        } else {
            stack.set(hVar.f8932d, c0924c);
        }
        hVar.f8932d++;
        hVar.f8933e = false;
        l2.g.l(sVar, hVar);
        hVar.f8932d--;
        StringBuilder sb = hVar.f8929a;
        if (sb != null) {
            sb.append(")");
        }
        hVar.f8933e = true;
    }
}
