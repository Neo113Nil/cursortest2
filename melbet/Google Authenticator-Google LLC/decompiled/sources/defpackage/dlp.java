package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dlp extends dkv {
    public static boolean a = false;
    private final dkj b;

    public dlp(dkj dkjVar) {
        this.b = dkjVar;
    }

    @Override // defpackage.dkv
    public final void b(final dku dkuVar, final dks dksVar) {
        this.b.b(new dki() { // from class: dlo
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, java.util.Set] */
            @Override // defpackage.dki
            public final List a() {
                dkd.a();
                dks dksVar2 = dksVar;
                Object[] objArr = 0;
                int i = 1;
                hoq.I(dksVar2 != null, "View is not instrumented.");
                ?? r3 = dksVar2.d.a;
                if (!r3.isEmpty()) {
                    for (kee keeVar : r3) {
                        fao.c();
                        Object obj = keeVar.a;
                        dlk dlkVar = (dlk) obj;
                        if (dlkVar.d) {
                            fao.f(dlkVar.g);
                            dlkVar.b.a(new dlj(obj, objArr == true ? 1 : 0)).run();
                        } else {
                            Runnable runnable = dlkVar.g;
                            if (runnable != null) {
                                fao.f(runnable);
                                dlkVar.b.a(new dlj(obj, i)).run();
                            }
                        }
                    }
                }
                hoq.M(dksVar2.d(), "VE is not impressed: %s {attached=%s}", dksVar2, Boolean.valueOf(dksVar2.b.c));
                if (!dlp.a) {
                    hoq.K(dksVar2.f() == 1, "VE is not visible: %s", dksVar2);
                }
                dku dkuVar2 = dku.this;
                ArrayList arrayList = new ArrayList();
                dih.h(dksVar2, arrayList);
                dih.c();
                return hel.q(new dly(arrayList, dkuVar2));
            }
        });
    }
}
