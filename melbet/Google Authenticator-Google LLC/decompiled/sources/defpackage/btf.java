package defpackage;

import android.content.SharedPreferences;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class btf implements gew {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public btf(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.gew
    public final gdp a() {
        switch (this.b) {
            case 0:
                return bth.a;
            case 1:
                return bsl.a;
            case 2:
                return bww.a;
            case 3:
                return bww.b;
            case 4:
                return bww.c;
            case 5:
                return bwx.a;
            case 6:
                return bwx.b;
            case 7:
                return bxa.a;
            case 8:
                return caa.a;
            case 9:
                return cby.a;
            default:
                return cby.b;
        }
    }

    /* JADX WARN: Type inference failed for: r6v15, types: [hvi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v16, types: [hvi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v17, types: [hvi, java.lang.Object] */
    @Override // defpackage.gew
    public final hvi b() {
        switch (this.b) {
            case 0:
                bth bthVar = (bth) this.a;
                hvi at = hoq.at(bthVar.e.d(), new bqh(8), bthVar.d);
                hvi c = bthVar.b.c();
                return hoq.aX(at, c).s(new bsp(at, c, 2), bthVar.c);
            case 1:
                bsl bslVar = (bsl) this.a;
                hvi f = hti.f(bslVar.d.d(), gvx.a(new bqh(3)), huf.a);
                SharedPreferences sharedPreferences = bslVar.c;
                if (!sharedPreferences.contains("onboardingCompelted")) {
                    return f;
                }
                if (!sharedPreferences.getBoolean("showUpgradingUserSyncCapability", true)) {
                    return hnu.aJ(-1);
                }
                sharedPreferences.edit().putBoolean("showUpgradingUserSyncCapability", false).apply();
                return hnu.aJ(1);
            case 2:
                return this.a;
            case 3:
                return this.a;
            case 4:
                return this.a;
            case 5:
                return ((bwz) this.a).a(false);
            case 6:
                return hti.f(((fcu) ((bwz) this.a).e.a).d(), gvx.a(new bwv(5)), huf.a);
            case 7:
                return ((bxc) this.a).c.g();
            case 8:
                caa caaVar = (caa) this.a;
                return ixl.e(caaVar.c, new aki(caaVar, (kqj) null, 9, (byte[]) null));
            case 9:
                cby cbyVar = (cby) this.a;
                return hoq.at(cbyVar.d.b(), new bwv(16), cbyVar.c);
            default:
                cby cbyVar2 = (cby) this.a;
                return hoq.at(cbyVar2.d.b(), new bwv(17), cbyVar2.c);
        }
    }
}
