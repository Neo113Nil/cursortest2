package defpackage;

import android.content.Context;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bss implements ftd {
    public static final hkh a = hkh.l("com/google/android/apps/authenticator2/loginrequirement/LoginRequirement");
    public final Context b;
    public frv c;
    public final ftf d;
    public final btc e;
    private final fug f;
    private final hvl g;
    private final hvl h;

    public bss(Context context, ftf ftfVar, btc btcVar, fug fugVar, hvl hvlVar, hvl hvlVar2) {
        this.b = context;
        this.e = btcVar;
        this.f = fugVar;
        this.d = ftfVar;
        this.g = hvlVar;
        this.h = hvlVar2;
    }

    public final hvi a() {
        hvi c = this.f.c();
        hvi au = hoq.au(c, new bpn(this, 4), this.h);
        return hoq.aX(c, au).s(new bsp(c, au, 0), this.g);
    }

    public final hvi b(frv frvVar, final boolean z, final boolean z2) {
        gwu g = gwu.g(this.f.b(frvVar));
        bqh bqhVar = new bqh(6);
        huf hufVar = huf.a;
        gwu i = g.h(bqhVar, hufVar).i(new htr() { // from class: bsq
            @Override // defpackage.htr
            public final hvi a(Object obj) {
                ful fulVar = (ful) obj;
                if (fulVar.k.equals("pseudonymous")) {
                    return hnu.aJ(Status.a);
                }
                boolean z3 = z;
                bss bssVar = bss.this;
                int i2 = 8;
                if (!z3) {
                    btc btcVar = bssVar.e;
                    jkj k = iim.a.k();
                    iip b = btc.b(fulVar);
                    if (!k.b.M()) {
                        k.t();
                    }
                    iim iimVar = (iim) k.b;
                    b.getClass();
                    iimVar.c = b;
                    iimVar.b |= 1;
                    iip a2 = btcVar.a(fulVar);
                    if (!k.b.M()) {
                        k.t();
                    }
                    iim iimVar2 = (iim) k.b;
                    a2.getClass();
                    iimVar2.d = a2;
                    iimVar2.b |= 2;
                    iiq e = btc.e(3);
                    if (!k.b.M()) {
                        k.t();
                    }
                    iim iimVar3 = (iim) k.b;
                    e.getClass();
                    iimVar3.e = e;
                    iimVar3.b |= 4;
                    iiv c = btc.c(false, false);
                    if (!k.b.M()) {
                        k.t();
                    }
                    iim iimVar4 = (iim) k.b;
                    c.getClass();
                    iimVar4.f = c;
                    iimVar4.b |= 8;
                    byte[] f = ((iim) k.q()).f();
                    chc chcVar = new chc();
                    try {
                        chcVar.b = btc.d().f();
                    } catch (jld e2) {
                        ((hkf) ((hkf) ((hkf) btc.a.g()).h(e2)).i("com/google/android/apps/authenticator2/loginrequirement/ariconsent/AriLoggerImpl", "revokeConsent", (char) 128, "AriLoggerImpl.java")).s("Failed to parse SessionId");
                    }
                    chcVar.c();
                    chcVar.d();
                    chcVar.a = fulVar.d;
                    chcVar.b(f);
                    hvi d = dih.d(btcVar.e.a(chcVar.a()));
                    return hoq.au(d, new bpg(btcVar, d, 9), btcVar.d);
                }
                btc btcVar2 = bssVar.e;
                jkj k2 = iim.a.k();
                iip b2 = btc.b(fulVar);
                if (!k2.b.M()) {
                    k2.t();
                }
                iim iimVar5 = (iim) k2.b;
                b2.getClass();
                iimVar5.c = b2;
                iimVar5.b |= 1;
                iip a3 = btcVar2.a(fulVar);
                if (!k2.b.M()) {
                    k2.t();
                }
                iim iimVar6 = (iim) k2.b;
                a3.getClass();
                iimVar6.d = a3;
                iimVar6.b |= 2;
                iiq e3 = btc.e(2);
                if (!k2.b.M()) {
                    k2.t();
                }
                boolean z4 = z2;
                iim iimVar7 = (iim) k2.b;
                e3.getClass();
                iimVar7.e = e3;
                iimVar7.b |= 4;
                iiv c2 = btc.c(z4, true);
                if (!k2.b.M()) {
                    k2.t();
                }
                iim iimVar8 = (iim) k2.b;
                c2.getClass();
                iimVar8.f = c2;
                iimVar8.b |= 8;
                byte[] f2 = ((iim) k2.q()).f();
                chc chcVar2 = new chc();
                try {
                    chcVar2.b = btc.d().f();
                } catch (jld e4) {
                    ((hkf) ((hkf) ((hkf) btc.a.g()).h(e4)).i("com/google/android/apps/authenticator2/loginrequirement/ariconsent/AriLoggerImpl", "giveConsent", 'R', "AriLoggerImpl.java")).s("Failed to parse SessionId");
                }
                chcVar2.c();
                chcVar2.d();
                chcVar2.a = fulVar.d;
                chcVar2.b(f2);
                hvi d2 = dih.d(btcVar2.e.a(chcVar2.a()));
                return hoq.au(d2, new bpg(btcVar2, d2, i2), btcVar2.d);
            }
        }, hufVar).i(new ggp(this, frvVar, z, 1), hufVar);
        hoq.av(i, new ckt(this, 1), hufVar);
        return i;
    }

    @Override // defpackage.ftd
    public final hvi c(frv frvVar) {
        return hoq.at(((bsr) hnu.bq(this.b, bsr.class, frvVar)).m().d(), new bso(this, frvVar, 0), huf.a);
    }
}
