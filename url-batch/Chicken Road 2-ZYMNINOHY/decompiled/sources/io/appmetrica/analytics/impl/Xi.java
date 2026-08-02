package io.appmetrica.analytics.impl;

import java.util.Map;

/* loaded from: classes.dex */
public final class Xi extends Rg {
    public Xi(X4 x4) {
        super(x4);
        x4.b().a();
    }

    @Override // io.appmetrica.analytics.impl.Rg
    public final boolean a(P5 p5) {
        Object remove;
        for (Map.Entry entry : p5.f10807p.entrySet()) {
            Jk jk = this.f10886a.f11240u;
            String str = (String) entry.getKey();
            byte[] bArr = (byte[]) entry.getValue();
            if (bArr != null) {
                jk.getClass();
                if (bArr.length != 0) {
                    remove = jk.f10498b.put(str, bArr);
                    Nk nk = jk.f10497a;
                    nk.f10723d.insert(nk.f10720a, nk.f10722c.toByteArray((Mk) nk.f10721b.fromModel(jk.f10498b)));
                }
            }
            remove = jk.f10498b.remove(str);
            Nk nk2 = jk.f10497a;
            nk2.f10723d.insert(nk2.f10720a, nk2.f10722c.toByteArray((Mk) nk2.f10721b.fromModel(jk.f10498b)));
        }
        return true;
    }
}
