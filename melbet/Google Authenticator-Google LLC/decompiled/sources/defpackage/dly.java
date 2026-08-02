package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dly implements dkl, dlv {
    private final List a;
    private final dku b;

    public dly(List list, dku dkuVar) {
        this.a = list;
        this.b = dkuVar;
    }

    @Override // defpackage.dlv
    public final /* synthetic */ dkx a() {
        return dih.f(this);
    }

    @Override // defpackage.dlv
    public final List b() {
        return this.a;
    }

    public final String toString() {
        gzo T = hoq.T(this);
        hre hreVar = dih.f(this).d;
        if (hreVar == null) {
            hreVar = hre.a;
        }
        T.e("rootVeId", hreVar.d);
        hre hreVar2 = dih.g(this).d;
        if (hreVar2 == null) {
            hreVar2 = hre.a;
        }
        T.e("targetVeId", hreVar2.d);
        T.b("interaction", this.b);
        return T.toString();
    }
}
