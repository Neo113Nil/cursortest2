package z;

import a0.b1;
import m0.s;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class g implements p6.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h f9016d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f9017e;

    public g(h hVar, int i) {
        this.f9016d = hVar;
        this.f9017e = i;
    }

    @Override // p6.e
    public final Object g(Object obj, Object obj2) {
        s sVar = (s) obj;
        int intValue = ((Number) obj2).intValue();
        if (sVar.N(intValue & 1, (intValue & 3) != 2)) {
            h hVar = this.f9016d;
            b1 b1Var = hVar.f9019b.f9015a;
            int i = this.f9017e;
            a0.j b8 = b1Var.b(i);
            ((u0.c) b8.f100c.f8656b).j(hVar.f9020c, Integer.valueOf(i - b8.f98a), sVar, 0);
        } else {
            sVar.Q();
        }
        return c6.m.f1757a;
    }
}
