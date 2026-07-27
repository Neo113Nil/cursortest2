package io.appmetrica.analytics.impl;

import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.cj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0571cj extends Wg {
    public C0571cj(C0608e5 c0608e5) {
        super(c0608e5);
        c0608e5.b().a();
    }

    @Override // io.appmetrica.analytics.impl.Wg
    public final boolean a(W5 w5) {
        Object remove;
        for (Map.Entry entry : w5.f7663p.entrySet()) {
            Ok ok = this.f7670a.f8105u;
            String str = (String) entry.getKey();
            byte[] bArr = (byte[]) entry.getValue();
            if (bArr != null) {
                ok.getClass();
                if (bArr.length != 0) {
                    remove = ok.f7229b.put(str, bArr);
                    Sk sk = ok.f7228a;
                    sk.f7478d.insert(sk.f7475a, sk.f7477c.toByteArray((Rk) sk.f7476b.fromModel(ok.f7229b)));
                }
            }
            remove = ok.f7229b.remove(str);
            Sk sk2 = ok.f7228a;
            sk2.f7478d.insert(sk2.f7475a, sk2.f7477c.toByteArray((Rk) sk2.f7476b.fromModel(ok.f7229b)));
        }
        return true;
    }
}
